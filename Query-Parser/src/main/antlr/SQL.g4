grammar SQL;


start
    : dml EOF
    ;

dml
    : select
    ;

select
    : WITH (RECURSIVE)? cte (',' cte)* select_statement2
    | select_statement2
    ;

cte
    : id=ID AS '(' select_statement1* ')'
    ;

select_statement1
    : (EXPLAIN)? SELECT distinct=DISTINCT? columns=selectItem (',' selectItem)*
      FROM from=tableExpression
      (joins+=join)*
      (where=whereClause)?
      (union=unionClause)?
      (intersect=intersectClause)?
      (groupBy=groupByClause)?
      (having=havingClause)?
      (orderBy=orderByClause)?
      (limit=limitClause)?
    ;
/*

CASE

INSERT
DELETE
UPDATE
FORK
MERGE
SIMULATE


CREATE
DROP
TRUNC
COMMIT
ROLLBACK

*/
select_statement2
    : (EXPLAIN)? SELECT distinct=DISTINCT? columns=selectItem (',' selectItem )*
      FROM from=tableExpression
      (joins+=join)*
      (where=whereClause)?
      (groupBy=groupByClause)?
      (having=havingClause)?
      (orderBy=orderByClause)?
      (union=unionClause)?
      (intersect=intersectClause)?
      (limit=limitClause)?
      (select1=select_statement1)*
      ';'
    ;

selectItem
    : expression (AS? alias=ID )?
    ;

tableExpression
    : tableReference (AS? alias=ID)?
    ;

tableReference
    : ID
    | STRING
    | '(' select_statement2 ')' (AS? alias=ID)?
    ;
intersectClause: INTERSECT (ALL)? ;
unionClause: UNION (ALL)?;

join
    : (joinType=joinTypeSpec)?
      JOIN right=tableExpression
      ON condition=expression
    ;

joinTypeSpec
    : RIGHT
    | LEFT
    | INNER
    | FULL OUTER
    | CROSS
    ;

whereClause
    : WHERE (EXISTS)? (expression | ID IN '(' select_statement1* ')' |  '(' select_statement1* ')' );


groupByClause
    : GROUP BY expressions+=expression (',' expressions+=expression)*
    ;

havingClause
    : HAVING condition=expression
    ;

orderByClause
    : ORDER BY orderItems+=orderByItem (',' orderItems+=orderByItem)*
    ;

orderByItem
    : expression (direction=(ASC | DESC))?
    ;

limitClause
    : LIMIT count=INT (OFFSET offset=INT)?
    ;

expression
    : '(' expression ')'
    | NOT expression
    | left=expression op=('*' | '/' | '%') right=expression
    | left=expression op=('+' | '-') right=expression
    | left=expression op=('=' | '<' | '>' | '!=' | '<=' | '>=' | '<>') right=expression
    | left=expression op=(AND | OR) right=expression
    | left=expression op=(LIKE | IS) right=expression
    | left=expression op=NOT? IN inExpr='(' expression (',' expression)* ')'
    | left=expression op=BETWEEN lower=expression AND upper=expression
    | functionCall
    | columnReference
    | literal
    | '(' select_statement1+ ')'
    | select_statement1+
    ;


functionCall
    : name=ID '(' (DISTINCT)? args+=expression (',' args+=expression)* ')'
    | rank '(' ')' OVER '(' (PARTITION BY ID)? orderByClause ')'
    | groupConcat '(' expression (',' expression)* orderByClause? (SEPARATOR STRING)? ')'
    | aggregationFunction '(' (DISTINCT)? arg=expression ')';


columnReference
    : (table=ID '.')? column=ID
    | '*'
    ;

literal
    : INT
    | DOUBLE
    | STRING
    | NULL
    | TRUE
    | FALSE
    ;

aggregationFunction
    : COUNT
    | SUM
    | AVG
    | MIN
    | MAX
    ;

rank : RANK ;
groupConcat: GROUP_CONCAT;

fragment A: [aA];
fragment B: [bB];
fragment C: [cC];
fragment D: [dD];
fragment E: [eE];
fragment F: [fF];
fragment G: [gG];
fragment H: [hH];
fragment I: [iI];
fragment J: [jJ];
fragment K: [kK];
fragment L: [lL];
fragment M: [mM];
fragment N: [nN];
fragment O: [oO];
fragment P: [pP];
fragment Q: [qQ];
fragment R: [rR];
fragment S: [sS];
fragment T: [tT];
fragment U: [uU];
fragment V: [vV];
fragment W: [wW];
fragment X: [xX];
fragment Y: [yY];
fragment Z: [zZ];

SELECT: S E L E C T;
FROM: F R O M;
WHERE: W H E R E;
GROUP: G R O U P;
BY: B Y;
HAVING: H A V I N G;
ORDER: O R D E R;
LIMIT: L I M I T;
JOIN: J O I N;
ON: O N;
RIGHT: R I G H T;
LEFT: L E F T;
INNER: I N N E R;
FULL: F U L L;
OUTER: O U T E R;
CROSS: C R O S S;
DESC: D E S C;
ASC: A S C;
AS: A S;
RANK: R A N K;
DISTINCT: D I S T I N C T;
WITH: W I T H;
COUNT: C O U N T;
SUM: S U M;
AVG: A V G;
MIN: M I N;
MAX: M A X;
GROUP_CONCAT: G R O U P '_' C O N C A T;
AND: A N D;
OR: O R;
NOT: N O T;
LIKE: L I K E;
IN: I N;
IS: I S;
NULL: N U L L;
TRUE: T R U E;
FALSE: F A L S E;
BETWEEN: B E T W E E N;
LOGIN :  OR | AND;
EXISTS : E X I S T S;
OVER : O V E R;
PARTITION: P A R T I T I O N;
RECURSIVE: R E C U R S I V E;
INTERSECT: I N T E R S E C T;
ALL: A L L ;
UNION: U N I O N;
SEPARATOR: S E P A R A T O R;
EXPLAIN: E X P L A I N;


ID: [a-zA-Z_][a-zA-Z0-9_]*;
STRING: '\'' (~'\'' | '\\\'')* '\'';
INT: '-'? [1-9][0-9]* | '0';
DOUBLE: INT '.' [0-9]+;

WS: [ \t\r\n]+ -> skip;
LINE_COMMENT: '--' ~[\r\n]* -> skip;
MULTILINE_COMMENT: '/*' .*? '*/' -> skip;
