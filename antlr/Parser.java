// $ANTLR 3.4 C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g 2025-04-08 00:58:20

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

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

    public String[] getTokenNames() { return SQLParserParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g"; }



    // $ANTLR start "start"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:7:1: start : dml ;
    public final void start() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:7:7: ( dml )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:7:9: dml
            {
            pushFollow(FOLLOW_dml_in_start26);
            dml();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "start"



    // $ANTLR start "dml"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:9:1: dml : select ;
    public final void dml() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:9:5: ( select )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:9:7: select
            {
            pushFollow(FOLLOW_select_in_dml36);
            select();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dml"



    // $ANTLR start "select"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:11:1: select : ( ( WITH cte ( ',' cte )* select_statement ) | select_statement );
    public final void select() throws RecognitionException {
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
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:11:10: ( WITH cte ( ',' cte )* select_statement )
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:11:11: WITH cte ( ',' cte )* select_statement
                    {
                    match(input,WITH,FOLLOW_WITH_in_select47); 

                    pushFollow(FOLLOW_cte_in_select49);
                    cte();

                    state._fsp--;


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
                    	    match(input,42,FOLLOW_42_in_select52); 

                    	    pushFollow(FOLLOW_cte_in_select54);
                    	    cte();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop1;
                        }
                    } while (true);


                    pushFollow(FOLLOW_select_statement_in_select58);
                    select_statement();

                    state._fsp--;


                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:12:10: select_statement
                    {
                    pushFollow(FOLLOW_select_statement_in_select71);
                    select_statement();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "select"



    // $ANTLR start "cte"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:15:1: cte : ID AS '(' select_statement ')' ;
    public final void cte() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:15:5: ( ID AS '(' select_statement ')' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:15:7: ID AS '(' select_statement ')'
            {
            match(input,ID,FOLLOW_ID_in_cte87); 

            match(input,AS,FOLLOW_AS_in_cte89); 

            match(input,39,FOLLOW_39_in_cte91); 

            pushFollow(FOLLOW_select_statement_in_cte93);
            select_statement();

            state._fsp--;


            match(input,40,FOLLOW_40_in_cte95); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "cte"



    // $ANTLR start "select_statement"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:17:1: select_statement : SELECT ( DISTINCT )? column ( ',' column )* FROM generaltable ( join )* ( where )? ( groupby )? ( having )? ( orderby )? ( limit )? ';' ;
    public final void select_statement() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:5: ( SELECT ( DISTINCT )? column ( ',' column )* FROM generaltable ( join )* ( where )? ( groupby )? ( having )? ( orderby )? ( limit )? ';' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:18:7: SELECT ( DISTINCT )? column ( ',' column )* FROM generaltable ( join )* ( where )? ( groupby )? ( having )? ( orderby )? ( limit )? ';'
            {
            match(input,SELECT,FOLLOW_SELECT_in_select_statement109); 

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
                    match(input,DISTINCT,FOLLOW_DISTINCT_in_select_statement112); 

                    }
                    break;

            }


            pushFollow(FOLLOW_column_in_select_statement116);
            column();

            state._fsp--;


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
            	    match(input,42,FOLLOW_42_in_select_statement119); 

            	    pushFollow(FOLLOW_column_in_select_statement121);
            	    column();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            match(input,FROM,FOLLOW_FROM_in_select_statement125); 

            pushFollow(FOLLOW_generaltable_in_select_statement127);
            generaltable();

            state._fsp--;


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
            	    pushFollow(FOLLOW_join_in_select_statement130);
            	    join();

            	    state._fsp--;


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
                    pushFollow(FOLLOW_where_in_select_statement135);
                    where();

                    state._fsp--;


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
                    pushFollow(FOLLOW_groupby_in_select_statement140);
                    groupby();

                    state._fsp--;


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
                    pushFollow(FOLLOW_having_in_select_statement145);
                    having();

                    state._fsp--;


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
                    pushFollow(FOLLOW_orderby_in_select_statement150);
                    orderby();

                    state._fsp--;


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
                    pushFollow(FOLLOW_limit_in_select_statement155);
                    limit();

                    state._fsp--;


                    }
                    break;

            }


            match(input,44,FOLLOW_44_in_select_statement159); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "select_statement"



    // $ANTLR start "column"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:1: column : ( table '.' )? ( ID | aggregation_function | '*' ) ( AS column )? ;
    public final void column() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:8: ( ( table '.' )? ( ID | aggregation_function | '*' ) ( AS column )? )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:10: ( table '.' )? ( ID | aggregation_function | '*' ) ( AS column )?
            {
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
                    pushFollow(FOLLOW_table_in_column174);
                    table();

                    state._fsp--;


                    match(input,43,FOLLOW_43_in_column176); 

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
                    match(input,ID,FOLLOW_ID_in_column181); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:29: aggregation_function
                    {
                    pushFollow(FOLLOW_aggregation_function_in_column185);
                    aggregation_function();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:21:52: '*'
                    {
                    match(input,41,FOLLOW_41_in_column189); 

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
                    match(input,AS,FOLLOW_AS_in_column193); 

                    pushFollow(FOLLOW_column_in_column195);
                    column();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "column"



    // $ANTLR start "generaltable"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:22:1: generaltable : table ( ( AS )? alias )? ;
    public final void generaltable() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:23:2: ( table ( ( AS )? alias )? )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:23:4: table ( ( AS )? alias )?
            {
            pushFollow(FOLLOW_table_in_generaltable205);
            table();

            state._fsp--;


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:23:10: ( ( AS )? alias )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==AS||LA15_0==ID) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:23:11: ( AS )? alias
                    {
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:23:11: ( AS )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==AS) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:23:11: AS
                            {
                            match(input,AS,FOLLOW_AS_in_generaltable208); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_alias_in_generaltable211);
                    alias();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "generaltable"



    // $ANTLR start "table"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:24:1: table : ( ID | STRING );
    public final void table() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:24:7: ( ID | STRING )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:
            {
            if ( input.LA(1)==ID||input.LA(1)==STRING ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "table"



    // $ANTLR start "join"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:25:1: join : ( RIGHT | LEFT | INNER | FULL OUTER | CROSS )? JOIN generaltable ON column '=' column ;
    public final void join() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:25:6: ( ( RIGHT | LEFT | INNER | FULL OUTER | CROSS )? JOIN generaltable ON column '=' column )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:25:8: ( RIGHT | LEFT | INNER | FULL OUTER | CROSS )? JOIN generaltable ON column '=' column
            {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:25:8: ( RIGHT | LEFT | INNER | FULL OUTER | CROSS )?
            int alt16=6;
            switch ( input.LA(1) ) {
                case RIGHT:
                    {
                    alt16=1;
                    }
                    break;
                case LEFT:
                    {
                    alt16=2;
                    }
                    break;
                case INNER:
                    {
                    alt16=3;
                    }
                    break;
                case FULL:
                    {
                    alt16=4;
                    }
                    break;
                case CROSS:
                    {
                    alt16=5;
                    }
                    break;
            }

            switch (alt16) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:25:9: RIGHT
                    {
                    match(input,RIGHT,FOLLOW_RIGHT_in_join236); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:25:17: LEFT
                    {
                    match(input,LEFT,FOLLOW_LEFT_in_join240); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:25:24: INNER
                    {
                    match(input,INNER,FOLLOW_INNER_in_join244); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:25:32: FULL OUTER
                    {
                    match(input,FULL,FOLLOW_FULL_in_join248); 

                    match(input,OUTER,FOLLOW_OUTER_in_join250); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:25:45: CROSS
                    {
                    match(input,CROSS,FOLLOW_CROSS_in_join254); 

                    }
                    break;

            }


            match(input,JOIN,FOLLOW_JOIN_in_join258); 

            pushFollow(FOLLOW_generaltable_in_join260);
            generaltable();

            state._fsp--;


            match(input,ON,FOLLOW_ON_in_join262); 

            pushFollow(FOLLOW_column_in_join264);
            column();

            state._fsp--;


            match(input,48,FOLLOW_48_in_join266); 

            pushFollow(FOLLOW_column_in_join268);
            column();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "join"



    // $ANTLR start "alias"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:26:1: alias : ID ;
    public final void alias() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:26:7: ( ID )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:26:9: ID
            {
            match(input,ID,FOLLOW_ID_in_alias276); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "alias"



    // $ANTLR start "where"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:27:1: where : WHERE condition ( LOGIC condition )* ;
    public final void where() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:27:7: ( WHERE condition ( LOGIC condition )* )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:27:9: WHERE condition ( LOGIC condition )*
            {
            match(input,WHERE,FOLLOW_WHERE_in_where284); 

            pushFollow(FOLLOW_condition_in_where286);
            condition();

            state._fsp--;


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:27:25: ( LOGIC condition )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==LOGIC) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:27:26: LOGIC condition
            	    {
            	    match(input,LOGIC,FOLLOW_LOGIC_in_where289); 

            	    pushFollow(FOLLOW_condition_in_where291);
            	    condition();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "where"



    // $ANTLR start "groupby"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:28:1: groupby : GROUP BY column ( ',' column )* ;
    public final void groupby() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:28:9: ( GROUP BY column ( ',' column )* )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:28:11: GROUP BY column ( ',' column )*
            {
            match(input,GROUP,FOLLOW_GROUP_in_groupby303); 

            match(input,BY,FOLLOW_BY_in_groupby305); 

            pushFollow(FOLLOW_column_in_groupby307);
            column();

            state._fsp--;


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:28:27: ( ',' column )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==42) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:28:28: ',' column
            	    {
            	    match(input,42,FOLLOW_42_in_groupby310); 

            	    pushFollow(FOLLOW_column_in_groupby312);
            	    column();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop18;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "groupby"



    // $ANTLR start "having"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:29:1: having : HAVING condition ;
    public final void having() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:29:8: ( HAVING condition )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:29:10: HAVING condition
            {
            match(input,HAVING,FOLLOW_HAVING_in_having324); 

            pushFollow(FOLLOW_condition_in_having326);
            condition();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "having"



    // $ANTLR start "orderby"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:30:1: orderby : ORDER BY column ( ',' column )* ( DESC | ASC )? ;
    public final void orderby() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:30:9: ( ORDER BY column ( ',' column )* ( DESC | ASC )? )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:30:11: ORDER BY column ( ',' column )* ( DESC | ASC )?
            {
            match(input,ORDER,FOLLOW_ORDER_in_orderby336); 

            match(input,BY,FOLLOW_BY_in_orderby338); 

            pushFollow(FOLLOW_column_in_orderby340);
            column();

            state._fsp--;


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:30:27: ( ',' column )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==42) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:30:28: ',' column
            	    {
            	    match(input,42,FOLLOW_42_in_orderby343); 

            	    pushFollow(FOLLOW_column_in_orderby345);
            	    column();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:30:41: ( DESC | ASC )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==ASC||LA20_0==DESC) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:
                    {
                    if ( input.LA(1)==ASC||input.LA(1)==DESC ) {
                        input.consume();
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

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "orderby"



    // $ANTLR start "limit"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:31:1: limit : LIMIT INT ;
    public final void limit() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:31:7: ( LIMIT INT )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:31:9: LIMIT INT
            {
            match(input,LIMIT,FOLLOW_LIMIT_in_limit366); 

            match(input,INT,FOLLOW_INT_in_limit368); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "limit"



    // $ANTLR start "condition"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:33:1: condition : ( '(' condition ')' | column ( '=' | '<' | '>' | '!=' | '<=' | '>=' | '<>' ) ( INT | DOUBLE | STRING | column ) | LOGIC condition );
    public final void condition() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:33:11: ( '(' condition ')' | column ( '=' | '<' | '>' | '!=' | '<=' | '>=' | '<>' ) ( INT | DOUBLE | STRING | column ) | LOGIC condition )
            int alt22=3;
            switch ( input.LA(1) ) {
            case 39:
                {
                alt22=1;
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
                alt22=2;
                }
                break;
            case LOGIC:
                {
                alt22=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:33:13: '(' condition ')'
                    {
                    match(input,39,FOLLOW_39_in_condition377); 

                    pushFollow(FOLLOW_condition_in_condition379);
                    condition();

                    state._fsp--;


                    match(input,40,FOLLOW_40_in_condition381); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:34:13: column ( '=' | '<' | '>' | '!=' | '<=' | '>=' | '<>' ) ( INT | DOUBLE | STRING | column )
                    {
                    pushFollow(FOLLOW_column_in_condition396);
                    column();

                    state._fsp--;


                    if ( input.LA(1)==38||(input.LA(1) >= 45 && input.LA(1) <= 50) ) {
                        input.consume();
                        state.errorRecovery=false;
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        throw mse;
                    }


                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:34:66: ( INT | DOUBLE | STRING | column )
                    int alt21=4;
                    switch ( input.LA(1) ) {
                    case INT:
                        {
                        alt21=1;
                        }
                        break;
                    case DOUBLE:
                        {
                        alt21=2;
                        }
                        break;
                    case STRING:
                        {
                        int LA21_3 = input.LA(2);

                        if ( (LA21_3==GROUP||LA21_3==HAVING||(LA21_3 >= LIMIT && LA21_3 <= LOGIC)||LA21_3==ORDER||LA21_3==40||LA21_3==44) ) {
                            alt21=3;
                        }
                        else if ( (LA21_3==43) ) {
                            alt21=4;
                        }
                        else {
                            NoViableAltException nvae =
                                new NoViableAltException("", 21, 3, input);

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
                        alt21=4;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 21, 0, input);

                        throw nvae;

                    }

                    switch (alt21) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:34:67: INT
                            {
                            match(input,INT,FOLLOW_INT_in_condition427); 

                            }
                            break;
                        case 2 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:34:73: DOUBLE
                            {
                            match(input,DOUBLE,FOLLOW_DOUBLE_in_condition431); 

                            }
                            break;
                        case 3 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:34:82: STRING
                            {
                            match(input,STRING,FOLLOW_STRING_in_condition435); 

                            }
                            break;
                        case 4 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:34:91: column
                            {
                            pushFollow(FOLLOW_column_in_condition439);
                            column();

                            state._fsp--;


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:35:13: LOGIC condition
                    {
                    match(input,LOGIC,FOLLOW_LOGIC_in_condition454); 

                    pushFollow(FOLLOW_condition_in_condition456);
                    condition();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "condition"



    // $ANTLR start "aggregation_function"
    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:38:1: aggregation_function : ( COUNT '(' ( DISTINCT )? column ')' | SUM '(' ( DISTINCT )? column ')' | AVG '(' ( DISTINCT )? column ')' | MIN '(' ( DISTINCT )? column ')' | MAX '(' ( DISTINCT )? column ')' | GROUP_CONCAT '(' ( DISTINCT )? column ')' | RANK '(' ')' );
    public final void aggregation_function() throws RecognitionException {
        try {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:38:22: ( COUNT '(' ( DISTINCT )? column ')' | SUM '(' ( DISTINCT )? column ')' | AVG '(' ( DISTINCT )? column ')' | MIN '(' ( DISTINCT )? column ')' | MAX '(' ( DISTINCT )? column ')' | GROUP_CONCAT '(' ( DISTINCT )? column ')' | RANK '(' ')' )
            int alt29=7;
            switch ( input.LA(1) ) {
            case COUNT:
                {
                alt29=1;
                }
                break;
            case SUM:
                {
                alt29=2;
                }
                break;
            case AVG:
                {
                alt29=3;
                }
                break;
            case MIN:
                {
                alt29=4;
                }
                break;
            case MAX:
                {
                alt29=5;
                }
                break;
            case GROUP_CONCAT:
                {
                alt29=6;
                }
                break;
            case RANK:
                {
                alt29=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:39:7: COUNT '(' ( DISTINCT )? column ')'
                    {
                    match(input,COUNT,FOLLOW_COUNT_in_aggregation_function482); 

                    match(input,39,FOLLOW_39_in_aggregation_function484); 

                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:39:17: ( DISTINCT )?
                    int alt23=2;
                    int LA23_0 = input.LA(1);

                    if ( (LA23_0==DISTINCT) ) {
                        alt23=1;
                    }
                    switch (alt23) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:39:18: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregation_function487); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_in_aggregation_function491);
                    column();

                    state._fsp--;


                    match(input,40,FOLLOW_40_in_aggregation_function493); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:40:7: SUM '(' ( DISTINCT )? column ')'
                    {
                    match(input,SUM,FOLLOW_SUM_in_aggregation_function502); 

                    match(input,39,FOLLOW_39_in_aggregation_function504); 

                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:40:15: ( DISTINCT )?
                    int alt24=2;
                    int LA24_0 = input.LA(1);

                    if ( (LA24_0==DISTINCT) ) {
                        alt24=1;
                    }
                    switch (alt24) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:40:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregation_function507); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_in_aggregation_function511);
                    column();

                    state._fsp--;


                    match(input,40,FOLLOW_40_in_aggregation_function513); 

                    }
                    break;
                case 3 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:41:7: AVG '(' ( DISTINCT )? column ')'
                    {
                    match(input,AVG,FOLLOW_AVG_in_aggregation_function522); 

                    match(input,39,FOLLOW_39_in_aggregation_function524); 

                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:41:15: ( DISTINCT )?
                    int alt25=2;
                    int LA25_0 = input.LA(1);

                    if ( (LA25_0==DISTINCT) ) {
                        alt25=1;
                    }
                    switch (alt25) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:41:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregation_function527); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_in_aggregation_function531);
                    column();

                    state._fsp--;


                    match(input,40,FOLLOW_40_in_aggregation_function533); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:42:7: MIN '(' ( DISTINCT )? column ')'
                    {
                    match(input,MIN,FOLLOW_MIN_in_aggregation_function542); 

                    match(input,39,FOLLOW_39_in_aggregation_function544); 

                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:42:15: ( DISTINCT )?
                    int alt26=2;
                    int LA26_0 = input.LA(1);

                    if ( (LA26_0==DISTINCT) ) {
                        alt26=1;
                    }
                    switch (alt26) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:42:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregation_function547); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_in_aggregation_function551);
                    column();

                    state._fsp--;


                    match(input,40,FOLLOW_40_in_aggregation_function553); 

                    }
                    break;
                case 5 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:43:7: MAX '(' ( DISTINCT )? column ')'
                    {
                    match(input,MAX,FOLLOW_MAX_in_aggregation_function561); 

                    match(input,39,FOLLOW_39_in_aggregation_function563); 

                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:43:15: ( DISTINCT )?
                    int alt27=2;
                    int LA27_0 = input.LA(1);

                    if ( (LA27_0==DISTINCT) ) {
                        alt27=1;
                    }
                    switch (alt27) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:43:16: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregation_function566); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_in_aggregation_function570);
                    column();

                    state._fsp--;


                    match(input,40,FOLLOW_40_in_aggregation_function572); 

                    }
                    break;
                case 6 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:44:7: GROUP_CONCAT '(' ( DISTINCT )? column ')'
                    {
                    match(input,GROUP_CONCAT,FOLLOW_GROUP_CONCAT_in_aggregation_function580); 

                    match(input,39,FOLLOW_39_in_aggregation_function582); 

                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:44:24: ( DISTINCT )?
                    int alt28=2;
                    int LA28_0 = input.LA(1);

                    if ( (LA28_0==DISTINCT) ) {
                        alt28=1;
                    }
                    switch (alt28) {
                        case 1 :
                            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:44:25: DISTINCT
                            {
                            match(input,DISTINCT,FOLLOW_DISTINCT_in_aggregation_function585); 

                            }
                            break;

                    }


                    pushFollow(FOLLOW_column_in_aggregation_function589);
                    column();

                    state._fsp--;


                    match(input,40,FOLLOW_40_in_aggregation_function591); 

                    }
                    break;
                case 7 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:45:7: RANK '(' ')'
                    {
                    match(input,RANK,FOLLOW_RANK_in_aggregation_function599); 

                    match(input,39,FOLLOW_39_in_aggregation_function601); 

                    match(input,40,FOLLOW_40_in_aggregation_function602); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "aggregation_function"

    // Delegated rules


 

    public static final BitSet FOLLOW_dml_in_start26 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_in_dml36 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WITH_in_select47 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_cte_in_select49 = new BitSet(new long[]{0x0000040100000000L});
    public static final BitSet FOLLOW_42_in_select52 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_cte_in_select54 = new BitSet(new long[]{0x0000040100000000L});
    public static final BitSet FOLLOW_select_statement_in_select58 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_select_statement_in_select71 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_cte87 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_AS_in_cte89 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_cte91 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_select_statement_in_cte93 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_cte95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SELECT_in_select_statement109 = new BitSet(new long[]{0x0000020646050940L});
    public static final BitSet FOLLOW_DISTINCT_in_select_statement112 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_select_statement116 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_42_in_select_statement119 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_select_statement121 = new BitSet(new long[]{0x0000040000002000L});
    public static final BitSet FOLLOW_FROM_in_select_statement125 = new BitSet(new long[]{0x0000000200040000L});
    public static final BitSet FOLLOW_generaltable_in_select_statement127 = new BitSet(new long[]{0x0000100890EAC200L});
    public static final BitSet FOLLOW_join_in_select_statement130 = new BitSet(new long[]{0x0000100890EAC200L});
    public static final BitSet FOLLOW_where_in_select_statement135 = new BitSet(new long[]{0x0000100010828000L});
    public static final BitSet FOLLOW_groupby_in_select_statement140 = new BitSet(new long[]{0x0000100010820000L});
    public static final BitSet FOLLOW_having_in_select_statement145 = new BitSet(new long[]{0x0000100010800000L});
    public static final BitSet FOLLOW_orderby_in_select_statement150 = new BitSet(new long[]{0x0000100000800000L});
    public static final BitSet FOLLOW_limit_in_select_statement155 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_44_in_select_statement159 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_in_column174 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_43_in_column176 = new BitSet(new long[]{0x0000020446050140L});
    public static final BitSet FOLLOW_ID_in_column181 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_aggregation_function_in_column185 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_41_in_column189 = new BitSet(new long[]{0x0000000000000012L});
    public static final BitSet FOLLOW_AS_in_column193 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_column195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_table_in_generaltable205 = new BitSet(new long[]{0x0000000000040012L});
    public static final BitSet FOLLOW_AS_in_generaltable208 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_alias_in_generaltable211 = new BitSet(new long[]{0x0000000000000002L});
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
    public static final BitSet FOLLOW_ID_in_alias276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_WHERE_in_where284 = new BitSet(new long[]{0x0000028647050140L});
    public static final BitSet FOLLOW_condition_in_where286 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_LOGIC_in_where289 = new BitSet(new long[]{0x0000028647050140L});
    public static final BitSet FOLLOW_condition_in_where291 = new BitSet(new long[]{0x0000000001000002L});
    public static final BitSet FOLLOW_GROUP_in_groupby303 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BY_in_groupby305 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_groupby307 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_42_in_groupby310 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_groupby312 = new BitSet(new long[]{0x0000040000000002L});
    public static final BitSet FOLLOW_HAVING_in_having324 = new BitSet(new long[]{0x0000028647050140L});
    public static final BitSet FOLLOW_condition_in_having326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ORDER_in_orderby336 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_BY_in_orderby338 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_orderby340 = new BitSet(new long[]{0x0000040000000422L});
    public static final BitSet FOLLOW_42_in_orderby343 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_orderby345 = new BitSet(new long[]{0x0000040000000422L});
    public static final BitSet FOLLOW_LIMIT_in_limit366 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_INT_in_limit368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_condition377 = new BitSet(new long[]{0x0000028647050140L});
    public static final BitSet FOLLOW_condition_in_condition379 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_condition381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_in_condition396 = new BitSet(new long[]{0x0007E04000000000L});
    public static final BitSet FOLLOW_set_in_condition398 = new BitSet(new long[]{0x0000020646151140L});
    public static final BitSet FOLLOW_INT_in_condition427 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_DOUBLE_in_condition431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_condition435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_column_in_condition439 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LOGIC_in_condition454 = new BitSet(new long[]{0x0000028647050140L});
    public static final BitSet FOLLOW_condition_in_condition456 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COUNT_in_aggregation_function482 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_aggregation_function484 = new BitSet(new long[]{0x0000020646050940L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregation_function487 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_aggregation_function491 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_aggregation_function493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_SUM_in_aggregation_function502 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_aggregation_function504 = new BitSet(new long[]{0x0000020646050940L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregation_function507 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_aggregation_function511 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_aggregation_function513 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_AVG_in_aggregation_function522 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_aggregation_function524 = new BitSet(new long[]{0x0000020646050940L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregation_function527 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_aggregation_function531 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_aggregation_function533 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MIN_in_aggregation_function542 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_aggregation_function544 = new BitSet(new long[]{0x0000020646050940L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregation_function547 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_aggregation_function551 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_aggregation_function553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MAX_in_aggregation_function561 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_aggregation_function563 = new BitSet(new long[]{0x0000020646050940L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregation_function566 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_aggregation_function570 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_aggregation_function572 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GROUP_CONCAT_in_aggregation_function580 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_aggregation_function582 = new BitSet(new long[]{0x0000020646050940L});
    public static final BitSet FOLLOW_DISTINCT_in_aggregation_function585 = new BitSet(new long[]{0x0000020646050140L});
    public static final BitSet FOLLOW_column_in_aggregation_function589 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_aggregation_function591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RANK_in_aggregation_function599 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_aggregation_function601 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_aggregation_function602 = new BitSet(new long[]{0x0000000000000002L});

}
