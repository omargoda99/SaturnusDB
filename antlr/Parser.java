// $ANTLR 3.4 C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g 2025-04-08 00:38:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class SQLParserParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "AS", "ASC", "AVG", "BY", "COUNT", "CROSS", "DESC", "DISTINCT", "DOUBLE", "FROM", "FULL", "GROUP", "GROUP_CONCAT", "HAVING", "ID", "INNER", "INT", "JOIN", "LEFT", "LIMIT", "LOGIC", "MAX", "MIN", "ON", "ORDER", "OUTER", "RANK", "RIGHT", "SELECT", "STRING", "SUM", "WHERE", "WITH", "WS", "'!='", "'('", "')'", "'*'", "','", "'.'", "';'", "'<'", "'<='", "'<>'", "'='", "'>'", "'>='"
    };

    public static final int EOF=-1;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int AS=4;
    public static final int ASC=5;
    public static final int AVG=6;
    public static final int BY=7;
    public static final int COUNT=8;
    public static final int CROSS=9;
    public static final int DESC=10;
    public static final int DISTINCT=11;
    public static final int DOUBLE=12;
    public static final int FROM=13;
    public static final int FULL=14;
    public static final int GROUP=15;
    public static final int GROUP_CONCAT=16;
    public static final int HAVING=17;
    public static final int ID=18;
    public static final int INNER=19;
    public static final int INT=20;
    public static final int JOIN=21;
    public static final int LEFT=22;
    public static final int LIMIT=23;
    public static final int LOGIC=24;
    public static final int MAX=25;
    public static final int MIN=26;
    public static final int ON=27;
    public static final int ORDER=28;
    public static final int OUTER=29;
    public static final int RANK=30;
    public static final int RIGHT=31;
    public static final int SELECT=32;
    public static final int STRING=33;
    public static final int SUM=34;
    public static final int WHERE=35;
    public static final int WITH=36;
    public static final int WS=37;

    // delegates
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public SQLParserParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public SQLParserParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return SQLParserParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g"; }


    public static class start_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "start"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:7:1: start : dml ;
    public final SQLParserParser.start_return start() throws RecognitionException {
        SQLParserParser.start_return retval = new SQLParserParser.start_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SQLParserParser.dml_return dml1 =null;



        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:7:7: ( dml )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:7:9: dml
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_dml_in_start24);
            dml1=dml();

            state._fsp--;

            adaptor.addChild(root_0, dml1.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "start"


    public static class dml_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dml"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:9:1: dml : select ;
    public final SQLParserParser.dml_return dml() throws RecognitionException {
        SQLParserParser.dml_return retval = new SQLParserParser.dml_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        SQLParserParser.select_return select2 =null;



        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:9:5: ( select )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:9:7: select
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_select_in_dml33);
            select2=select();

            state._fsp--;

            adaptor.addChild(root_0, select2.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dml"


    public static class select_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:11:1: select : ( ( WITH cte ( ',' cte )* select_statement ) | select_statement );
    public final SQLParserParser.select_return select() throws RecognitionException {
        SQLParserParser.select_return retval = new SQLParserParser.select_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WITH3=null;
        Token char_literal5=null;
        SQLParserParser.cte_return cte4 =null;

        SQLParserParser.cte_return cte6 =null;

        SQLParserParser.select_statement_return select_statement7 =null;

        SQLParserParser.select_statement_return select_statement8 =null;


        Object WITH3_tree=null;
        Object char_literal5_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:11:8: ( ( WITH cte ( ',' cte )* select_statement ) | select_statement )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==WITH) ) {
                alt2=1;
            }
            else if ( (LA2_0==SELECT) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:11:10: ( WITH cte ( ',' cte )* select_statement )
                    {
                    root_0 = (Object)adaptor.nil();


                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:11:10: ( WITH cte ( ',' cte )* select_statement )
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:11:11: WITH cte ( ',' cte )* select_statement
                    {
                    WITH3=(Token)match(input,WITH,FOLLOW_WITH_in_select43); 
                    WITH3_tree = 
                    (Object)adaptor.create(WITH3)
                    ;
                    adaptor.addChild(root_0, WITH3_tree);


                    pushFollow(FOLLOW_cte_in_select45);
                    cte4=cte();

                    state._fsp--;

                    adaptor.addChild(root_0, cte4.getTree());

                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:11:20: ( ',' cte )*
                    loop1:
                    do {
                        int alt1=2;
                        int LA1_0 = input.LA(1);

                        if ( (LA1_0==42) ) {
                            alt1=1;
                        }


                        switch (alt1) {
                    	case 1 :
                    	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:11:21: ',' cte
                    	    {
                    	    char_literal5=(Token)match(input,42,FOLLOW_42_in_select48); 
                    	    char_literal5_tree = 
                    	    (Object)adaptor.create(char_literal5)
                    	    ;
                    	    adaptor.addChild(root_0, char_literal5_tree);


                    	    pushFollow(FOLLOW_cte_in_select50);
                    	    cte6=cte();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, cte6.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    pushFollow(FOLLOW_select_statement_in_select54);
                    select_statement7=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement7.getTree());

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:12:10: select_statement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_select_statement_in_select66);
                    select_statement8=select_statement();

                    state._fsp--;

                    adaptor.addChild(root_0, select_statement8.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select"


    public static class cte_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "cte"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:15:1: cte : ID AS '(' select_statement ')' ;
    public final SQLParserParser.cte_return cte() throws RecognitionException {
        SQLParserParser.cte_return retval = new SQLParserParser.cte_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID9=null;
        Token AS10=null;
        Token char_literal11=null;
        Token char_literal13=null;
        SQLParserParser.select_statement_return select_statement12 =null;


        Object ID9_tree=null;
        Object AS10_tree=null;
        Object char_literal11_tree=null;
        Object char_literal13_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:15:5: ( ID AS '(' select_statement ')' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:15:7: ID AS '(' select_statement ')'
            {
            root_0 = (Object)adaptor.nil();


            ID9=(Token)match(input,ID,FOLLOW_ID_in_cte82); 
            ID9_tree = 
            (Object)adaptor.create(ID9)
            ;
            adaptor.addChild(root_0, ID9_tree);


            AS10=(Token)match(input,AS,FOLLOW_AS_in_cte84); 
            AS10_tree = 
            (Object)adaptor.create(AS10)
            ;
            adaptor.addChild(root_0, AS10_tree);


            char_literal11=(Token)match(input,39,FOLLOW_39_in_cte86); 
            char_literal11_tree = 
            (Object)adaptor.create(char_literal11)
            ;
            adaptor.addChild(root_0, char_literal11_tree);


            pushFollow(FOLLOW_select_statement_in_cte88);
            select_statement12=select_statement();

            state._fsp--;

            adaptor.addChild(root_0, select_statement12.getTree());

            char_literal13=(Token)match(input,40,FOLLOW_40_in_cte90); 
            char_literal13_tree = 
            (Object)adaptor.create(char_literal13)
            ;
            adaptor.addChild(root_0, char_literal13_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "cte"


    public static class select_statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "select_statement"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:17:1: select_statement : SELECT ( DISTINCT )? column ( ',' column )* FROM generaltable ( join )* ( where )? ( groupby )? ( having )? ( orderby )? ( limit )? ';' ;
    public final SQLParserParser.select_statement_return select_statement() throws RecognitionException {
        SQLParserParser.select_statement_return retval = new SQLParserParser.select_statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token SELECT14=null;
        Token DISTINCT15=null;
        Token char_literal17=null;
        Token FROM19=null;
        Token char_literal27=null;
        SQLParserParser.column_return column16 =null;

        SQLParserParser.column_return column18 =null;

        SQLParserParser.generaltable_return generaltable20 =null;

        SQLParserParser.join_return join21 =null;

        SQLParserParser.where_return where22 =null;

        SQLParserParser.groupby_return groupby23 =null;

        SQLParserParser.having_return having24 =null;

        SQLParserParser.orderby_return orderby25 =null;

        SQLParserParser.limit_return limit26 =null;


        Object SELECT14_tree=null;
        Object DISTINCT15_tree=null;
        Object char_literal17_tree=null;
        Object FROM19_tree=null;
        Object char_literal27_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:5: ( SELECT ( DISTINCT )? column ( ',' column )* FROM generaltable ( join )* ( where )? ( groupby )? ( having )? ( orderby )? ( limit )? ';' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:7: SELECT ( DISTINCT )? column ( ',' column )* FROM generaltable ( join )* ( where )? ( groupby )? ( having )? ( orderby )? ( limit )? ';'
            {
            root_0 = (Object)adaptor.nil();


            SELECT14=(Token)match(input,SELECT,FOLLOW_SELECT_in_select_statement103); 
            SELECT14_tree = 
            (Object)adaptor.create(SELECT14)
            ;
            adaptor.addChild(root_0, SELECT14_tree);


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:14: ( DISTINCT )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==DISTINCT) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:15: DISTINCT
                    {
                    DISTINCT15=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_select_statement106); 
                    DISTINCT15_tree = 
                    (Object)adaptor.create(DISTINCT15)
                    ;
                    adaptor.addChild(root_0, DISTINCT15_tree);


                    }
                    break;

            }


            pushFollow(FOLLOW_column_in_select_statement110);
            column16=column();

            state._fsp--;

            adaptor.addChild(root_0, column16.getTree());

            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:33: ( ',' column )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==42) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:34: ',' column
            	    {
            	    char_literal17=(Token)match(input,42,FOLLOW_42_in_select_statement113); 
            	    char_literal17_tree = 
            	    (Object)adaptor.create(char_literal17)
            	    ;
            	    adaptor.addChild(root_0, char_literal17_tree);


            	    pushFollow(FOLLOW_column_in_select_statement115);
            	    column18=column();

            	    state._fsp--;

            	    adaptor.addChild(root_0, column18.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            FROM19=(Token)match(input,FROM,FOLLOW_FROM_in_select_statement119); 
            FROM19_tree = 
            (Object)adaptor.create(FROM19)
            ;
            adaptor.addChild(root_0, FROM19_tree);


            pushFollow(FOLLOW_generaltable_in_select_statement121);
            generaltable20=generaltable();

            state._fsp--;

            adaptor.addChild(root_0, generaltable20.getTree());

            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:65: ( join )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==CROSS||LA5_0==FULL||LA5_0==INNER||(LA5_0 >= JOIN && LA5_0 <= LEFT)||LA5_0==RIGHT) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:66: join
            	    {
            	    pushFollow(FOLLOW_join_in_select_statement124);
            	    join21=join();

            	    state._fsp--;

            	    adaptor.addChild(root_0, join21.getTree());

            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:73: ( where )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==WHERE) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:74: where
                    {
                    pushFollow(FOLLOW_where_in_select_statement129);
                    where22=where();

                    state._fsp--;

                    adaptor.addChild(root_0, where22.getTree());

                    }
                    break;

            }


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:82: ( groupby )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==GROUP) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:83: groupby
                    {
                    pushFollow(FOLLOW_groupby_in_select_statement134);
                    groupby23=groupby();

                    state._fsp--;

                    adaptor.addChild(root_0, groupby23.getTree());

                    }
                    break;

            }


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:93: ( having )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==HAVING) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:94: having
                    {
                    pushFollow(FOLLOW_having_in_select_statement139);
                    having24=having();

                    state._fsp--;

                    adaptor.addChild(root_0, having24.getTree());

                    }
                    break;

            }


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:103: ( orderby )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==ORDER) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:104: orderby
                    {
                    pushFollow(FOLLOW_orderby_in_select_statement144);
                    orderby25=orderby();

                    state._fsp--;

                    adaptor.addChild(root_0, orderby25.getTree());

                    }
                    break;

            }


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:114: ( limit )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==LIMIT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:115: limit
                    {
                    pushFollow(FOLLOW_limit_in_select_statement149);
                    limit26=limit();

                    state._fsp--;

                    adaptor.addChild(root_0, limit26.getTree());

                    }
                    break;

            }


            char_literal27=(Token)match(input,44,FOLLOW_44_in_select_statement153); 
            char_literal27_tree = 
            (Object)adaptor.create(char_literal27)
            ;
            adaptor.addChild(root_0, char_literal27_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "select_statement"


    public static class column_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "column"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:1: column : ( table '.' )? ( ID | aggregation_function | '*' ) ( AS column )? ;
    public final SQLParserParser.column_return column() throws RecognitionException {
        SQLParserParser.column_return retval = new SQLParserParser.column_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal29=null;
        Token ID30=null;
        Token char_literal32=null;
        Token AS33=null;
        SQLParserParser.table_return table28 =null;

        SQLParserParser.aggregation_function_return aggregation_function31 =null;

        SQLParserParser.column_return column34 =null;


        Object char_literal29_tree=null;
        Object ID30_tree=null;
        Object char_literal32_tree=null;
        Object AS33_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:8: ( ( table '.' )? ( ID | aggregation_function | '*' ) ( AS column )? )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:10: ( table '.' )? ( ID | aggregation_function | '*' ) ( AS column )?
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:10: ( table '.' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==ID) ) {
                int LA11_1 = input.LA(2);

                if ( (LA11_1==43) ) {
                    alt11=1;
                }
            }
            else if ( (LA11_0==STRING) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:11: table '.'
                    {
                    pushFollow(FOLLOW_table_in_column167);
                    table28=table();

                    state._fsp--;

                    adaptor.addChild(root_0, table28.getTree());

                    char_literal29=(Token)match(input,43,FOLLOW_43_in_column169); 
                    char_literal29_tree = 
                    (Object)adaptor.create(char_literal29)
                    ;
                    adaptor.addChild(root_0, char_literal29_tree);


                    }
                    break;

            }


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:23: ( ID | aggregation_function | '*' )
            int alt12=3;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt12=1;
                }
                break;
            case AVG:
            case COUNT:
            case GROUP_CONCAT:
            case MAX:
            case MIN:
            case RANK:
            case SUM:
                {
                alt12=2;
                }
                break;
            case 41:
                {
                alt12=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }

            switch (alt12) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:24: ID
                    {
                    ID30=(Token)match(input,ID,FOLLOW_ID_in_column174); 
                    ID30_tree = 
                    (Object)adaptor.create(ID30)
                    ;
                    adaptor.addChild(root_0, ID30_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:29: aggregation_function
                    {
                    pushFollow(FOLLOW_aggregation_function_in_column178);
                    aggregation_function31=aggregation_function();

                    state._fsp--;

                    adaptor.addChild(root_0, aggregation_function31.getTree());

                    }
                    break;
                case 3 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:52: '*'
                    {
                    char_literal32=(Token)match(input,41,FOLLOW_41_in_column182); 
                    char_literal32_tree = 
                    (Object)adaptor.create(char_literal32)
                    ;
                    adaptor.addChild(root_0, char_literal32_tree);


                    }
                    break;

            }


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:57: ( AS column )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==AS) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:58: AS column
                    {
                    AS33=(Token)match(input,AS,FOLLOW_AS_in_column186); 
                    AS33_tree = 
                    (Object)adaptor.create(AS33)
                    ;
                    adaptor.addChild(root_0, AS33_tree);


                    pushFollow(FOLLOW_column_in_column188);
                    column34=column();

                    state._fsp--;

                    adaptor.addChild(root_0, column34.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "column"


    public static class generaltable_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "generaltable"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:22:1: generaltable : table ( AS alias )? ;
    public final SQLParserParser.generaltable_return generaltable() throws RecognitionException {
        SQLParserParser.generaltable_return retval = new SQLParserParser.generaltable_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token AS36=null;
        SQLParserParser.table_return table35 =null;

        SQLParserParser.alias_return alias37 =null;


        Object AS36_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:23:5: ( table ( AS alias )? )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:23:7: table ( AS alias )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_table_in_generaltable202);
            table35=table();

            state._fsp--;

            adaptor.addChild(root_0, table35.getTree());

            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:23:13: ( AS alias )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==AS) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:23:14: AS alias
                    {
                    AS36=(Token)match(input,AS,FOLLOW_AS_in_generaltable205); 
                    AS36_tree = 
                    (Object)adaptor.create(AS36)
                    ;
                    adaptor.addChild(root_0, AS36_tree);


                    pushFollow(FOLLOW_alias_in_generaltable207);
                    alias37=alias();

                    state._fsp--;

                    adaptor.addChild(root_0, alias37.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "generaltable"


    public static class table_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "table"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:26:1: table : ( ID | STRING );
    public final SQLParserParser.table_return table() throws RecognitionException {
        SQLParserParser.table_return retval = new SQLParserParser.table_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set38=null;

        Object set38_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:26:7: ( ID | STRING )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:
            {
            root_0 = (Object)adaptor.nil();


            set38=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set38)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "table"


    public static class join_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "join"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:28:1: join : ( RIGHT | LEFT | INNER | FULL OUTER | CROSS )? JOIN generaltable ON column '=' column ;
    public final SQLParserParser.join_return join() throws RecognitionException {
        SQLParserParser.join_return retval = new SQLParserParser.join_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token RIGHT39=null;
        Token LEFT40=null;
        Token INNER41=null;
        Token FULL42=null;
        Token OUTER43=null;
        Token CROSS44=null;
        Token JOIN45=null;
        Token ON47=null;
        Token char_literal49=null;
        SQLParserParser.generaltable_return generaltable46 =null;

        SQLParserParser.column_return column48 =null;

        SQLParserParser.column_return column50 =null;


        Object RIGHT39_tree=null;
        Object LEFT40_tree=null;
        Object INNER41_tree=null;
        Object FULL42_tree=null;
        Object OUTER43_tree=null;
        Object CROSS44_tree=null;
        Object JOIN45_tree=null;
        Object ON47_tree=null;
        Object char_literal49_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:28:6: ( ( RIGHT | LEFT | INNER | FULL OUTER | CROSS )? JOIN generaltable ON column '=' column )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:28:8: ( RIGHT | LEFT | INNER | FULL OUTER | CROSS )? JOIN generaltable ON column '=' column
            {
            root_0 = (Object)adaptor.nil();


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:28:8: ( RIGHT | LEFT | INNER | FULL OUTER | CROSS )?
            int alt15=6;
            switch ( input.LA(1) ) {
                case RIGHT:
                    {
                    alt15=1;
                    }
                    break;
                case LEFT:
                    {
                    alt15=2;
                    }
                    break;
                case INNER:
                    {
                    alt15=3;
                    }
                    break;
                case FULL:
                    {
                    alt15=4;
                    }
                    break;
                case CROSS:
                    {
                    alt15=5;
                    }
                    break;
            }

            switch (alt15) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:28:9: RIGHT
                    {
                    RIGHT39=(Token)match(input,RIGHT,FOLLOW_RIGHT_in_join236); 
                    RIGHT39_tree = 
                    (Object)adaptor.create(RIGHT39)
                    ;
                    adaptor.addChild(root_0, RIGHT39_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:28:17: LEFT
                    {
                    LEFT40=(Token)match(input,LEFT,FOLLOW_LEFT_in_join240); 
                    LEFT40_tree = 
                    (Object)adaptor.create(LEFT40)
                    ;
                    adaptor.addChild(root_0, LEFT40_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:28:24: INNER
                    {
                    INNER41=(Token)match(input,INNER,FOLLOW_INNER_in_join244); 
                    INNER41_tree = 
                    (Object)adaptor.create(INNER41)
                    ;
                    adaptor.addChild(root_0, INNER41_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:28:32: FULL OUTER
                    {
                    FULL42=(Token)match(input,FULL,FOLLOW_FULL_in_join248); 
                    FULL42_tree = 
                    (Object)adaptor.create(FULL42)
                    ;
                    adaptor.addChild(root_0, FULL42_tree);


                    OUTER43=(Token)match(input,OUTER,FOLLOW_OUTER_in_join250); 
                    OUTER43_tree = 
                    (Object)adaptor.create(OUTER43)
                    ;
                    adaptor.addChild(root_0, OUTER43_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:28:45: CROSS
                    {
                    CROSS44=(Token)match(input,CROSS,FOLLOW_CROSS_in_join254); 
                    CROSS44_tree = 
                    (Object)adaptor.create(CROSS44)
                    ;
                    adaptor.addChild(root_0, CROSS44_tree);


                    }
                    break;

            }


            JOIN45=(Token)match(input,JOIN,FOLLOW_JOIN_in_join258); 
            JOIN45_tree = 
            (Object)adaptor.create(JOIN45)
            ;
            adaptor.addChild(root_0, JOIN45_tree);


            pushFollow(FOLLOW_generaltable_in_join260);
            generaltable46=generaltable();

            state._fsp--;

            adaptor.addChild(root_0, generaltable46.getTree());

            ON47=(Token)match(input,ON,FOLLOW_ON_in_join262); 
            ON47_tree = 
            (Object)adaptor.create(ON47)
            ;
            adaptor.addChild(root_0, ON47_tree);


            pushFollow(FOLLOW_column_in_join264);
            column48=column();

            state._fsp--;

            adaptor.addChild(root_0, column48.getTree());

            char_literal49=(Token)match(input,48,FOLLOW_48_in_join266); 
            char_literal49_tree = 
            (Object)adaptor.create(char_literal49)
            ;
            adaptor.addChild(root_0, char_literal49_tree);


            pushFollow(FOLLOW_column_in_join268);
            column50=column();

            state._fsp--;

            adaptor.addChild(root_0, column50.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "join"


    public static class alias_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "alias"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:30:1: alias : ID ;
    public final SQLParserParser.alias_return alias() throws RecognitionException {
        SQLParserParser.alias_return retval = new SQLParserParser.alias_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID51=null;

        Object ID51_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:30:7: ( ID )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:30:9: ID
            {
            root_0 = (Object)adaptor.nil();


            ID51=(Token)match(input,ID,FOLLOW_ID_in_alias277); 
            ID51_tree = 
            (Object)adaptor.create(ID51)
            ;
            adaptor.addChild(root_0, ID51_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "alias"


    public static class where_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "where"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:32:1: where : WHERE condition ( LOGIC condition )* ;
    public final SQLParserParser.where_return where() throws RecognitionException {
        SQLParserParser.where_return retval = new SQLParserParser.where_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token WHERE52=null;
        Token LOGIC54=null;
        SQLParserParser.condition_return condition53 =null;

        SQLParserParser.condition_return condition55 =null;


        Object WHERE52_tree=null;
        Object LOGIC54_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:32:7: ( WHERE condition ( LOGIC condition )* )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:32:9: WHERE condition ( LOGIC condition )*
            {
            root_0 = (Object)adaptor.nil();


            WHERE52=(Token)match(input,WHERE,FOLLOW_WHERE_in_where286); 
            WHERE52_tree = 
            (Object)adaptor.create(WHERE52)
            ;
            adaptor.addChild(root_0, WHERE52_tree);


            pushFollow(FOLLOW_condition_in_where288);
            condition53=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition53.getTree());

            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:32:25: ( LOGIC condition )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==LOGIC) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:32:26: LOGIC condition
            	    {
            	    LOGIC54=(Token)match(input,LOGIC,FOLLOW_LOGIC_in_where291); 
            	    LOGIC54_tree = 
            	    (Object)adaptor.create(LOGIC54)
            	    ;
            	    adaptor.addChild(root_0, LOGIC54_tree);


            	    pushFollow(FOLLOW_condition_in_where293);
            	    condition55=condition();

            	    state._fsp--;

            	    adaptor.addChild(root_0, condition55.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "where"


    public static class groupby_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "groupby"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:34:1: groupby : GROUP BY column ( ',' column )* ;
    public final SQLParserParser.groupby_return groupby() throws RecognitionException {
        SQLParserParser.groupby_return retval = new SQLParserParser.groupby_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token GROUP56=null;
        Token BY57=null;
        Token char_literal59=null;
        SQLParserParser.column_return column58 =null;

        SQLParserParser.column_return column60 =null;


        Object GROUP56_tree=null;
        Object BY57_tree=null;
        Object char_literal59_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:34:9: ( GROUP BY column ( ',' column )* )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:34:11: GROUP BY column ( ',' column )*
            {
            root_0 = (Object)adaptor.nil();


            GROUP56=(Token)match(input,GROUP,FOLLOW_GROUP_in_groupby304); 
            GROUP56_tree = 
            (Object)adaptor.create(GROUP56)
            ;
            adaptor.addChild(root_0, GROUP56_tree);


            BY57=(Token)match(input,BY,FOLLOW_BY_in_groupby306); 
            BY57_tree = 
            (Object)adaptor.create(BY57)
            ;
            adaptor.addChild(root_0, BY57_tree);


            pushFollow(FOLLOW_column_in_groupby308);
            column58=column();

            state._fsp--;

            adaptor.addChild(root_0, column58.getTree());

            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:34:27: ( ',' column )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==42) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:34:28: ',' column
            	    {
            	    char_literal59=(Token)match(input,42,FOLLOW_42_in_groupby311); 
            	    char_literal59_tree = 
            	    (Object)adaptor.create(char_literal59)
            	    ;
            	    adaptor.addChild(root_0, char_literal59_tree);


            	    pushFollow(FOLLOW_column_in_groupby313);
            	    column60=column();

            	    state._fsp--;

            	    adaptor.addChild(root_0, column60.getTree());

            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "groupby"


    public static class having_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "having"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:36:1: having : HAVING condition ;
    public final SQLParserParser.having_return having() throws RecognitionException {
        SQLParserParser.having_return retval = new SQLParserParser.having_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token HAVING61=null;
        SQLParserParser.condition_return condition62 =null;


        Object HAVING61_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:36:8: ( HAVING condition )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:36:10: HAVING condition
            {
            root_0 = (Object)adaptor.nil();


            HAVING61=(Token)match(input,HAVING,FOLLOW_HAVING_in_having324); 
            HAVING61_tree = 
            (Object)adaptor.create(HAVING61)
            ;
            adaptor.addChild(root_0, HAVING61_tree);


            pushFollow(FOLLOW_condition_in_having326);
            condition62=condition();

            state._fsp--;

            adaptor.addChild(root_0, condition62.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "having"


    public static class orderby_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "orderby"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:38:1: orderby : ORDER BY column ( ',' column )* ( DESC | ASC )? ;
    public final SQLParserParser.orderby_return orderby() throws RecognitionException {
        SQLParserParser.orderby_return retval = new SQLParserParser.orderby_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ORDER63=null;
        Token BY64=null;
        Token char_literal66=null;
        Token set68=null;
        SQLParserParser.column_return column65 =null;

        SQLParserParser.column_return column67 =null;


        Object ORDER63_tree=null;
        Object BY64_tree=null;
        Object char_literal66_tree=null;
        Object set68_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:38:9: ( ORDER BY column ( ',' column )* ( DESC | ASC )? )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:38:11: ORDER BY column ( ',' column )* ( DESC | ASC )?
            {
            root_0 = (Object)adaptor.nil();


            ORDER63=(Token)match(input,ORDER,FOLLOW_ORDER_in_orderby335); 
            ORDER63_tree = 
            (Object)adaptor.create(ORDER63)
            ;
            adaptor.addChild(root_0, ORDER63_tree);


            BY64=(Token)match(input,BY,FOLLOW_BY_in_orderby337); 
            BY64_tree = 
            (Object)adaptor.create(BY64)
            ;
            adaptor.addChild(root_0, BY64_tree);


            pushFollow(FOLLOW_column_in_orderby339);
            column65=column();

            state._fsp--;

            adaptor.addChild(root_0, column65.getTree());

            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:38:27: ( ',' column )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:38:28: ',' column
            	    {
            	    char_literal66=(Token)match(input,42,FOLLOW_42_in_orderby342); 
            	    char_literal66_tree = 
            	    (Object)adaptor.create(char_literal66)
            	    ;
            	    adaptor.addChild(root_0, char_literal66_tree);


            	    pushFollow(FOLLOW_column_in_orderby344);
            	    column67=column();

            	    state._fsp--;

            	    adaptor.addChild(root_0, column67.getTree());

            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:38:41: ( DESC | ASC )?
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0==ASC||LA19_0==DESC) ) {
                alt19=1;
            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:
                    {
                    set68=(Token)input.LT(1);

                    if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set68)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "orderby"


    public static class limit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "limit"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:40:1: limit : LIMIT INT ;
    public final SQLParserParser.limit_return limit() throws RecognitionException {
        SQLParserParser.limit_return retval = new SQLParserParser.limit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token LIMIT69=null;
        Token INT70=null;

        Object LIMIT69_tree=null;
        Object INT70_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:40:7: ( LIMIT INT )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:40:9: LIMIT INT
            {
            root_0 = (Object)adaptor.nil();


            LIMIT69=(Token)match(input,LIMIT,FOLLOW_LIMIT_in_limit363); 
            LIMIT69_tree = 
            (Object)adaptor.create(LIMIT69)
            ;
            adaptor.addChild(root_0, LIMIT69_tree);


            INT70=(Token)match(input,INT,FOLLOW_INT_in_limit365); 
            INT70_tree = 
            (Object)adaptor.create(INT70)
            ;
            adaptor.addChild(root_0, INT70_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "limit"


    public static class condition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "condition"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:42:1: condition : ( '(' condition ')' | column ( '=' | '<' | '>' | '!=' | '<=' | '>=' | '<>' ) ( INT | DOUBLE | STRING | column ) | LOGIC condition );
    public final SQLParserParser.condition_return condition() throws RecognitionException {
        SQLParserParser.condition_return retval = new SQLParserParser.condition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal71=null;
        Token char_literal73=null;
        Token set75=null;
        Token INT76=null;
        Token DOUBLE77=null;
        Token STRING78=null;
        Token LOGIC80=null;
        SQLParserParser.condition_return condition72 =null;

        SQLParserParser.column_return column74 =null;

        SQLParserParser.column_return column79 =null;

        SQLParserParser.condition_return condition81 =null;


        Object char_literal71_tree=null;
        Object char_literal73_tree=null;
        Object set75_tree=null;
        Object INT76_tree=null;
        Object DOUBLE77_tree=null;
        Object STRING78_tree=null;
        Object LOGIC80_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:42:11: ( '(' condition ')' | column ( '=' | '<' | '>' | '!=' | '<=' | '>=' | '<>' ) ( INT | DOUBLE | STRING | column ) | LOGIC condition )
            int alt21=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt21=1;
                }
                break;
            case AVG:
            case COUNT:
            case GROUP_CONCAT:
            case ID:
            case MAX:
            case MIN:
            case RANK:
            case STRING:
            case SUM:
            case 41:
                {
                alt21=2;
                }
                break;
            case LOGIC:
                {
                alt21=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:42:13: '(' condition ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal71=(Token)match(input,39,FOLLOW_39_in_condition374); 
                    char_literal71_tree = 
                    (Object)adaptor.create(char_literal71)
                    ;
                    adaptor.addChild(root_0, char_literal71_tree);


                    pushFollow(FOLLOW_condition_in_condition376);
                    condition72=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition72.getTree());

                    char_literal73=(Token)match(input,40,FOLLOW_40_in_condition378); 
                    char_literal73_tree = 
                    (Object)adaptor.create(char_literal73)
                    ;
                    adaptor.addChild(root_0, char_literal73_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:43:13: column ( '=' | '<' | '>' | '!=' | '<=' | '>=' | '<>' ) ( INT | DOUBLE | STRING | column )
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_column_in_condition392);
                    column74=column();

                    state._fsp--;

                    adaptor.addChild(root_0, column74.getTree());

                    set75=(Token)input.LT(1);

                    if ( input.LA(1)==38||(input.LA(1) >= 45 && input.LA(1) <= 50) ) {
                        input.consume();
                        adaptor.addChild(root_0, 
                        (Object)adaptor.create(set75)
                        );
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:43:66: ( INT | DOUBLE | STRING | column )
                    int alt20=4;
                    switch ( input.LA(1) ) {
                    case INT:
                        {
                        alt20=1;
                        }
                        break;
                    case DOUBLE:
                        {
                        alt20=2;
                        }
                        break;
                    case STRING:
                        {
                        int LA20_3 = input.LA(2);

                        if ( (LA20_3==GROUP||LA20_3==HAVING||(LA20_3 >= LIMIT && LA20_3 <= LOGIC)||LA20_3==ORDER||LA20_3==40||LA20_3==44) ) {
                            alt20=3;
                        }
                        else if ( (LA20_3==43) ) {
                            alt20=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 20, 3, input);

                            throw nvae;

                        }
                        }
                        break;
                    case AVG:
                    case COUNT:
                    case GROUP_CONCAT:
                    case ID:
                    case MAX:
                    case MIN:
                    case RANK:
                    case SUM:
                    case 41:
                        {
                        alt20=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }

                    switch (alt20) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:43:67: INT
                            {
                            INT76=(Token)match(input,INT,FOLLOW_INT_in_condition423); 
                            INT76_tree = 
                            (Object)adaptor.create(INT76)
                            ;
                            adaptor.addChild(root_0, INT76_tree);


                            }
                            break;
                        case 2 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:43:73: DOUBLE
                            {
                            DOUBLE77=(Token)match(input,DOUBLE,FOLLOW_DOUBLE_in_condition427); 
                            DOUBLE77_tree = 
                            (Object)adaptor.create(DOUBLE77)
                            ;
                            adaptor.addChild(root_0, DOUBLE77_tree);


                            }
                            break;
                        case 3 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:43:82: STRING
                            {
                            STRING78=(Token)match(input,STRING,FOLLOW_STRING_in_condition431); 
                            STRING78_tree = 
                            (Object)adaptor.create(STRING78)
                            ;
                            adaptor.addChild(root_0, STRING78_tree);


                            }
                            break;
                        case 4 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:43:91: column
                            {
                            pushFollow(FOLLOW_column_in_condition435);
                            column79=column();

                            state._fsp--;

                            adaptor.addChild(root_0, column79.getTree());

                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:44:13: LOGIC condition
                    {
                    root_0 = (Object)adaptor.nil();


                    LOGIC80=(Token)match(input,LOGIC,FOLLOW_LOGIC_in_condition450); 
                    LOGIC80_tree = 
                    (Object)adaptor.create(LOGIC80)
                    ;
                    adaptor.addChild(root_0, LOGIC80_tree);


                    pushFollow(FOLLOW_condition_in_condition452);
                    condition81=condition();

                    state._fsp--;

                    adaptor.addChild(root_0, condition81.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "condition"


    public static class aggregation_function_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "aggregation_function"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:47:1: aggregation_function : ( COUNT '(' ( DISTINCT )? column ')' | SUM '(' ( DISTINCT )? column ')' | AVG '(' ( DISTINCT )? column ')' | MIN '(' ( DISTINCT )? column ')' | MAX '(' ( DISTINCT )? column ')' | GROUP_CONCAT '(' ( DISTINCT )? column ')' | RANK '(' ')' );
    public final SQLParserParser.aggregation_function_return aggregation_function() throws RecognitionException {
        SQLParserParser.aggregation_function_return retval = new SQLParserParser.aggregation_function_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token COUNT82=null;
        Token char_literal83=null;
        Token DISTINCT84=null;
        Token char_literal86=null;
        Token SUM87=null;
        Token char_literal88=null;
        Token DISTINCT89=null;
        Token char_literal91=null;
        Token AVG92=null;
        Token char_literal93=null;
        Token DISTINCT94=null;
        Token char_literal96=null;
        Token MIN97=null;
        Token char_literal98=null;
        Token DISTINCT99=null;
        Token char_literal101=null;
        Token MAX102=null;
        Token char_literal103=null;
        Token DISTINCT104=null;
        Token char_literal106=null;
        Token GROUP_CONCAT107=null;
        Token char_literal108=null;
        Token DISTINCT109=null;
        Token char_literal111=null;
        Token RANK112=null;
        Token char_literal113=null;
        Token char_literal114=null;
        SQLParserParser.column_return column85 =null;

        SQLParserParser.column_return column90 =null;

        SQLParserParser.column_return column95 =null;

        SQLParserParser.column_return column100 =null;

        SQLParserParser.column_return column105 =null;

        SQLParserParser.column_return column110 =null;


        Object COUNT82_tree=null;
        Object char_literal83_tree=null;
        Object DISTINCT84_tree=null;
        Object char_literal86_tree=null;
        Object SUM87_tree=null;
        Object char_literal88_tree=null;
        Object DISTINCT89_tree=null;
        Object char_literal91_tree=null;
        Object AVG92_tree=null;
        Object char_literal93_tree=null;
        Object DISTINCT94_tree=null;
        Object char_literal96_tree=null;
        Object MIN97_tree=null;
        Object char_literal98_tree=null;
        Object DISTINCT99_tree=null;
        Object char_literal101_tree=null;
        Object MAX102_tree=null;
        Object char_literal103_tree=null;
        Object DISTINCT104_tree=null;
        Object char_literal106_tree=null;
        Object GROUP_CONCAT107_tree=null;
        Object char_literal108_tree=null;
        Object DISTINCT109_tree=null;
        Object char_literal111_tree=null;
        Object RANK112_tree=null;
        Object char_literal113_tree=null;
        Object char_literal114_tree=null;

        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:47:22: ( COUNT '(' ( DISTINCT )? column ')' | SUM '(' ( DISTINCT )? column ')' | AVG '(' ( DISTINCT )? column ')' | MIN '(' ( DISTINCT )? column ')' | MAX '(' ( DISTINCT )? column ')' | GROUP_CONCAT '(' ( DISTINCT )? column ')' | RANK '(' ')' )
            int alt28=7;
            switch ( input.LA(1) ) {
            case COUNT:
                {
                alt28=1;
                }
                break;
            case SUM:
                {
                alt28=2;
                }
                break;
            case AVG:
                {
                alt28=3;
                }
                break;
            case MIN:
                {
                alt28=4;
                }
                break;
            case MAX:
                {
                alt28=5;
                }
                break;
            case GROUP_CONCAT:
                {
                alt28=6;
                }
                break;
            case RANK:
                {
                alt28=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }

            switch (alt28) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:48:7: COUNT '(' ( DISTINCT )? column ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    COUNT82=(Token)match(input,COUNT,FOLLOW_COUNT_in_aggregation_function477); 
                    COUNT82_tree = 
                    (Object)adaptor.create(COUNT82)
                    ;
                    adaptor.addChild(root_0, COUNT82_tree);


                    char_literal83=(Token)match(input,39,FOLLOW_39_in_aggregation_function479); 
                    char_literal83_tree = 
                    (Object)adaptor.create(char_literal83)
                    ;
                    adaptor.addChild(root_0, char_literal83_tree);


                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:48:17: ( DISTINCT )?
                    int alt22=2;
                    int LA22_0 = input.LA(1);

                    if ( (LA22_0==DISTINCT) ) {
                        alt22=1;
                    }
                    switch (alt22) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:48:18: DISTINCT
                            {
                            DISTINCT84=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregation_function482); 
                            DISTINCT84_tree = 
                            (Object)adaptor.create(DISTINCT84)
                            ;
                            adaptor.addChild(root_0, DISTINCT84_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_in_aggregation_function486);
                    column85=column();

                    state._fsp--;

                    adaptor.addChild(root_0, column85.getTree());

                    char_literal86=(Token)match(input,40,FOLLOW_40_in_aggregation_function488); 
                    char_literal86_tree = 
                    (Object)adaptor.create(char_literal86)
                    ;
                    adaptor.addChild(root_0, char_literal86_tree);


                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:49:7: SUM '(' ( DISTINCT )? column ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    SUM87=(Token)match(input,SUM,FOLLOW_SUM_in_aggregation_function496); 
                    SUM87_tree = 
                    (Object)adaptor.create(SUM87)
                    ;
                    adaptor.addChild(root_0, SUM87_tree);


                    char_literal88=(Token)match(input,39,FOLLOW_39_in_aggregation_function498); 
                    char_literal88_tree = 
                    (Object)adaptor.create(char_literal88)
                    ;
                    adaptor.addChild(root_0, char_literal88_tree);


                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:49:15: ( DISTINCT )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==DISTINCT) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:49:16: DISTINCT
                            {
                            DISTINCT89=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregation_function501); 
                            DISTINCT89_tree = 
                            (Object)adaptor.create(DISTINCT89)
                            ;
                            adaptor.addChild(root_0, DISTINCT89_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_in_aggregation_function505);
                    column90=column();

                    state._fsp--;

                    adaptor.addChild(root_0, column90.getTree());

                    char_literal91=(Token)match(input,40,FOLLOW_40_in_aggregation_function507); 
                    char_literal91_tree = 
                    (Object)adaptor.create(char_literal91)
                    ;
                    adaptor.addChild(root_0, char_literal91_tree);


                    }
                    break;
                case 3 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:50:7: AVG '(' ( DISTINCT )? column ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    AVG92=(Token)match(input,AVG,FOLLOW_AVG_in_aggregation_function515); 
                    AVG92_tree = 
                    (Object)adaptor.create(AVG92)
                    ;
                    adaptor.addChild(root_0, AVG92_tree);


                    char_literal93=(Token)match(input,39,FOLLOW_39_in_aggregation_function517); 
                    char_literal93_tree = 
                    (Object)adaptor.create(char_literal93)
                    ;
                    adaptor.addChild(root_0, char_literal93_tree);


                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:50:15: ( DISTINCT )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==DISTINCT) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:50:16: DISTINCT
                            {
                            DISTINCT94=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregation_function520); 
                            DISTINCT94_tree = 
                            (Object)adaptor.create(DISTINCT94)
                            ;
                            adaptor.addChild(root_0, DISTINCT94_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_in_aggregation_function524);
                    column95=column();

                    state._fsp--;

                    adaptor.addChild(root_0, column95.getTree());

                    char_literal96=(Token)match(input,40,FOLLOW_40_in_aggregation_function526); 
                    char_literal96_tree = 
                    (Object)adaptor.create(char_literal96)
                    ;
                    adaptor.addChild(root_0, char_literal96_tree);


                    }
                    break;
                case 4 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:51:7: MIN '(' ( DISTINCT )? column ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    MIN97=(Token)match(input,MIN,FOLLOW_MIN_in_aggregation_function534); 
                    MIN97_tree = 
                    (Object)adaptor.create(MIN97)
                    ;
                    adaptor.addChild(root_0, MIN97_tree);


                    char_literal98=(Token)match(input,39,FOLLOW_39_in_aggregation_function536); 
                    char_literal98_tree = 
                    (Object)adaptor.create(char_literal98)
                    ;
                    adaptor.addChild(root_0, char_literal98_tree);


                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:51:15: ( DISTINCT )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==DISTINCT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:51:16: DISTINCT
                            {
                            DISTINCT99=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregation_function539); 
                            DISTINCT99_tree = 
                            (Object)adaptor.create(DISTINCT99)
                            ;
                            adaptor.addChild(root_0, DISTINCT99_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_in_aggregation_function543);
                    column100=column();

                    state._fsp--;

                    adaptor.addChild(root_0, column100.getTree());

                    char_literal101=(Token)match(input,40,FOLLOW_40_in_aggregation_function545); 
                    char_literal101_tree = 
                    (Object)adaptor.create(char_literal101)
                    ;
                    adaptor.addChild(root_0, char_literal101_tree);


                    }
                    break;
                case 5 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:52:7: MAX '(' ( DISTINCT )? column ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    MAX102=(Token)match(input,MAX,FOLLOW_MAX_in_aggregation_function553); 
                    MAX102_tree = 
                    (Object)adaptor.create(MAX102)
                    ;
                    adaptor.addChild(root_0, MAX102_tree);


                    char_literal103=(Token)match(input,39,FOLLOW_39_in_aggregation_function555); 
                    char_literal103_tree = 
                    (Object)adaptor.create(char_literal103)
                    ;
                    adaptor.addChild(root_0, char_literal103_tree);


                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:52:15: ( DISTINCT )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==DISTINCT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:52:16: DISTINCT
                            {
                            DISTINCT104=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregation_function558); 
                            DISTINCT104_tree = 
                            (Object)adaptor.create(DISTINCT104)
                            ;
                            adaptor.addChild(root_0, DISTINCT104_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_in_aggregation_function562);
                    column105=column();

                    state._fsp--;

                    adaptor.addChild(root_0, column105.getTree());

                    char_literal106=(Token)match(input,40,FOLLOW_40_in_aggregation_function564); 
                    char_literal106_tree = 
                    (Object)adaptor.create(char_literal106)
                    ;
                    adaptor.addChild(root_0, char_literal106_tree);


                    }
                    break;
                case 6 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:53:7: GROUP_CONCAT '(' ( DISTINCT )? column ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    GROUP_CONCAT107=(Token)match(input,GROUP_CONCAT,FOLLOW_GROUP_CONCAT_in_aggregation_function572); 
                    GROUP_CONCAT107_tree = 
                    (Object)adaptor.create(GROUP_CONCAT107)
                    ;
                    adaptor.addChild(root_0, GROUP_CONCAT107_tree);


                    char_literal108=(Token)match(input,39,FOLLOW_39_in_aggregation_function574); 
                    char_literal108_tree = 
                    (Object)adaptor.create(char_literal108)
                    ;
                    adaptor.addChild(root_0, char_literal108_tree);


                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:53:24: ( DISTINCT )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==DISTINCT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:53:25: DISTINCT
                            {
                            DISTINCT109=(Token)match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregation_function577); 
                            DISTINCT109_tree = 
                            (Object)adaptor.create(DISTINCT109)
                            ;
                            adaptor.addChild(root_0, DISTINCT109_tree);


                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_in_aggregation_function581);
                    column110=column();

                    state._fsp--;

                    adaptor.addChild(root_0, column110.getTree());

                    char_literal111=(Token)match(input,40,FOLLOW_40_in_aggregation_function583); 
                    char_literal111_tree = 
                    (Object)adaptor.create(char_literal111)
                    ;
                    adaptor.addChild(root_0, char_literal111_tree);


                    }
                    break;
                case 7 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:54:7: RANK '(' ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    RANK112=(Token)match(input,RANK,FOLLOW_RANK_in_aggregation_function591); 
                    RANK112_tree = 
                    (Object)adaptor.create(RANK112)
                    ;
                    adaptor.addChild(root_0, RANK112_tree);


                    char_literal113=(Token)match(input,39,FOLLOW_39_in_aggregation_function593); 
                    char_literal113_tree = 
                    (Object)adaptor.create(char_literal113)
                    ;
                    adaptor.addChild(root_0, char_literal113_tree);


                    char_literal114=(Token)match(input,40,FOLLOW_40_in_aggregation_function595); 
                    char_literal114_tree = 
                    (Object)adaptor.create(char_literal114)
                    ;
                    adaptor.addChild(root_0, char_literal114_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "aggregation_function"

    // Delegated rules


 

    public static final BitSet FOLLOW_dml_in_start24 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_in_dml33 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_select43 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_cte_in_select45 = new BitSet(new long[]{0x0000040100000000L});
    public static final BitSet FOLLOW_42_in_select48 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_cte_in_select50 = new BitSet(new long[]{0x0000040100000000L});
    public static final BitSet FOLLOW_select_statement_in_select54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_select66 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_cte82 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AS_in_cte84 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_cte86 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_select_statement_in_cte88 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_cte90 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement103 = new BitSet(new long[]{0x0000020646050940L});
    public static final BitSet FOLLOW_DISTINCT_in_select_statement106 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_select_statement110 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_42_in_select_statement113 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_select_statement115 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_FROM_in_select_statement119 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_generaltable_in_select_statement121 = new BitSet(new long[]{0x0000100890EAC200L});
    public static final BitSet FOLLOW_join_in_select_statement124 = new BitSet(new long[]{0x0000100890EAC200L});
    public static final BitSet FOLLOW_where_in_select_statement129 = new BitSet(new long[]{0x0000100010828000L});
    public static final BitSet FOLLOW_groupby_in_select_statement134 = new BitSet(new long[]{0x0000100010820000L});
    public static final BitSet FOLLOW_having_in_select_statement139 = new BitSet(new long[]{0x0000100010800000L});
    public static final BitSet FOLLOW_orderby_in_select_statement144 = new BitSet(new long[]{0x0000100000800000L});
    public static final BitSet FOLLOW_limit_in_select_statement149 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_select_statement153 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_in_column167 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_column169 = new BitSet(new long[]{0x0000020446050140L});
    public static final BitSet FOLLOW_ID_in_column174 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_aggregation_function_in_column178 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_41_in_column182 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AS_in_column186 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_column188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_in_generaltable202 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AS_in_generaltable205 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_alias_in_generaltable207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RIGHT_in_join236 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_LEFT_in_join240 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_INNER_in_join244 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_FULL_in_join248 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_OUTER_in_join250 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_CROSS_in_join254 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_JOIN_in_join258 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_generaltable_in_join260 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ON_in_join262 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_join264 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_join266 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_join268 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_alias277 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where286 = new BitSet(new long[]{0x0000028647050140L});
    public static final BitSet FOLLOW_condition_in_where288 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_LOGIC_in_where291 = new BitSet(new long[]{0x0000028647050140L});
    public static final BitSet FOLLOW_condition_in_where293 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_GROUP_in_groupby304 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BY_in_groupby306 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_groupby308 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_groupby311 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_groupby313 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_HAVING_in_having324 = new BitSet(new long[]{0x0000028647050140L});
    public static final BitSet FOLLOW_condition_in_having326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderby335 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BY_in_orderby337 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_orderby339 = new BitSet(new long[]{0x0000040000000422L});
    public static final BitSet FOLLOW_42_in_orderby342 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_orderby344 = new BitSet(new long[]{0x0000040000000422L});
    public static final BitSet FOLLOW_LIMIT_in_limit363 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_INT_in_limit365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_condition374 = new BitSet(new long[]{0x0000028647050140L});
    public static final BitSet FOLLOW_condition_in_condition376 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_condition378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_in_condition392 = new BitSet(new long[]{0x0007E04000000000L});
    public static final BitSet FOLLOW_set_in_condition394 = new BitSet(new long[]{0x0000020646151140L});
    public static final BitSet FOLLOW_INT_in_condition423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_condition427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_condition431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_in_condition435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGIC_in_condition450 = new BitSet(new long[]{0x0000028647050140L});
    public static final BitSet FOLLOW_condition_in_condition452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_aggregation_function477 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_aggregation_function479 = new BitSet(new long[]{0x0000020646050940L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregation_function482 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_aggregation_function486 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_aggregation_function488 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUM_in_aggregation_function496 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_aggregation_function498 = new BitSet(new long[]{0x0000020646050940L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregation_function501 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_aggregation_function505 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_aggregation_function507 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AVG_in_aggregation_function515 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_aggregation_function517 = new BitSet(new long[]{0x0000020646050940L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregation_function520 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_aggregation_function524 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_aggregation_function526 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_aggregation_function534 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_aggregation_function536 = new BitSet(new long[]{0x0000020646050940L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregation_function539 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_aggregation_function543 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_aggregation_function545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_aggregation_function553 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_aggregation_function555 = new BitSet(new long[]{0x0000020646050940L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregation_function558 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_aggregation_function562 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_aggregation_function564 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_CONCAT_in_aggregation_function572 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_aggregation_function574 = new BitSet(new long[]{0x0000020646050940L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregation_function577 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_aggregation_function581 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_aggregation_function583 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANK_in_aggregation_function591 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_aggregation_function593 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_aggregation_function595 = new BitSet(new long[]{0x0000000000000002L});
}
