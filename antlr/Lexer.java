
// $ANTLR 3.4 C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g 2025-04-08 00:38:29

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class SQLParserLexer extends Lexer {
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
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public SQLParserLexer() {} 
    public SQLParserLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public SQLParserLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g"; }

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:2:7: ( '!=' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:2:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:3:7: ( '(' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:3:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:4:7: ( ')' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:4:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:5:7: ( '*' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:5:9: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:6:7: ( ',' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:6:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:7:7: ( '.' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:7:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:8:7: ( ';' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:8:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:9:7: ( '<' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:9:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:10:7: ( '<=' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:10:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:11:7: ( '<>' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:11:9: '<>'
            {
            match("<>"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:12:7: ( '=' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:12:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:13:7: ( '>' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:13:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:14:7: ( '>=' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:14:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "SELECT"
    public final void mSELECT() throws RecognitionException {
        try {
            int _type = SELECT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:57:8: ( 'SELECT' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:57:10: 'SELECT'
            {
            match("SELECT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SELECT"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:58:6: ( 'FROM' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:58:8: 'FROM'
            {
            match("FROM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FROM"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:59:7: ( 'WHERE' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:59:9: 'WHERE'
            {
            match("WHERE"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WHERE"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:60:7: ( 'GROUP' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:60:9: 'GROUP'
            {
            match("GROUP"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUP"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:61:4: ( 'BY' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:61:6: 'BY'
            {
            match("BY"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BY"

    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:62:8: ( 'HAVING' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:62:10: 'HAVING'
            {
            match("HAVING"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HAVING"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:63:7: ( 'ORDER' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:63:9: 'ORDER'
            {
            match("ORDER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ORDER"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:64:7: ( 'LIMIT' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:64:9: 'LIMIT'
            {
            match("LIMIT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LIMIT"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:65:6: ( 'JOIN' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:65:8: 'JOIN'
            {
            match("JOIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "JOIN"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:66:4: ( 'ON' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:66:6: 'ON'
            {
            match("ON"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ON"

    // $ANTLR start "RIGHT"
    public final void mRIGHT() throws RecognitionException {
        try {
            int _type = RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:67:7: ( 'RIGHT' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:67:9: 'RIGHT'
            {
            match("RIGHT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RIGHT"

    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:68:6: ( 'LEFT' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:68:8: 'LEFT'
            {
            match("LEFT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LEFT"

    // $ANTLR start "INNER"
    public final void mINNER() throws RecognitionException {
        try {
            int _type = INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:69:7: ( 'INNER' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:69:9: 'INNER'
            {
            match("INNER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INNER"

    // $ANTLR start "FULL"
    public final void mFULL() throws RecognitionException {
        try {
            int _type = FULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:70:6: ( 'FULL' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:70:8: 'FULL'
            {
            match("FULL"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FULL"

    // $ANTLR start "OUTER"
    public final void mOUTER() throws RecognitionException {
        try {
            int _type = OUTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:71:7: ( 'OUTER' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:71:9: 'OUTER'
            {
            match("OUTER"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OUTER"

    // $ANTLR start "CROSS"
    public final void mCROSS() throws RecognitionException {
        try {
            int _type = CROSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:72:7: ( 'CROSS' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:72:9: 'CROSS'
            {
            match("CROSS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CROSS"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:73:6: ( 'DESC' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:73:8: 'DESC'
            {
            match("DESC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DESC"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:74:5: ( 'ASC' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:74:7: 'ASC'
            {
            match("ASC"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ASC"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:75:4: ( 'AS' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:75:6: 'AS'
            {
            match("AS"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AS"

    // $ANTLR start "RANK"
    public final void mRANK() throws RecognitionException {
        try {
            int _type = RANK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:76:6: ( 'RANK' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:76:8: 'RANK'
            {
            match("RANK"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "RANK"

    // $ANTLR start "DISTINCT"
    public final void mDISTINCT() throws RecognitionException {
        try {
            int _type = DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:77:10: ( 'DISTINCT' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:77:12: 'DISTINCT'
            {
            match("DISTINCT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DISTINCT"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:78:6: ( 'WITH' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:78:8: 'WITH'
            {
            match("WITH"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WITH"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:80:7: ( 'COUNT' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:80:9: 'COUNT'
            {
            match("COUNT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COUNT"

    // $ANTLR start "SUM"
    public final void mSUM() throws RecognitionException {
        try {
            int _type = SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:81:5: ( 'SUM' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:81:7: 'SUM'
            {
            match("SUM"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "SUM"

    // $ANTLR start "AVG"
    public final void mAVG() throws RecognitionException {
        try {
            int _type = AVG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:82:5: ( 'AVG' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:82:7: 'AVG'
            {
            match("AVG"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "AVG"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:83:5: ( 'MIN' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:83:7: 'MIN'
            {
            match("MIN"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MIN"

    // $ANTLR start "MAX"
    public final void mMAX() throws RecognitionException {
        try {
            int _type = MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:84:5: ( 'MAX' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:84:7: 'MAX'
            {
            match("MAX"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MAX"

    // $ANTLR start "GROUP_CONCAT"
    public final void mGROUP_CONCAT() throws RecognitionException {
        try {
            int _type = GROUP_CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:85:14: ( 'GROUP_CONCAT' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:85:16: 'GROUP_CONCAT'
            {
            match("GROUP_CONCAT"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "GROUP_CONCAT"

    // $ANTLR start "LOGIC"
    public final void mLOGIC() throws RecognitionException {
        try {
            int _type = LOGIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:87:7: ( 'AND' | 'OR' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='A') ) {
                alt1=1;
            }
            else if ( (LA1_0=='O') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:87:9: 'AND'
                    {
                    match("AND"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:87:17: 'OR'
                    {
                    match("OR"); 



                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LOGIC"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:89:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:89:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:89:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')||(LA2_0 >= 'A' && LA2_0 <= 'Z')||LA2_0=='_'||(LA2_0 >= 'a' && LA2_0 <= 'z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:90:8: ( '\\'' (~ '\\'' | '\\\\\\'' )* '\\'' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:90:10: '\\'' (~ '\\'' | '\\\\\\'' )* '\\''
            {
            match('\''); 

            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:90:15: (~ '\\'' | '\\\\\\'' )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0=='\\') ) {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2=='\'') ) {
                        int LA3_4 = input.LA(3);

                        if ( ((LA3_4 >= '\u0000' && LA3_4 <= '\uFFFF')) ) {
                            alt3=2;
                        }

                        else {
                            alt3=1;
                        }


                    }
                    else if ( ((LA3_2 >= '\u0000' && LA3_2 <= '&')||(LA3_2 >= '(' && LA3_2 <= '\uFFFF')) ) {
                        alt3=1;
                    }


                }
                else if ( ((LA3_0 >= '\u0000' && LA3_0 <= '&')||(LA3_0 >= '(' && LA3_0 <= '[')||(LA3_0 >= ']' && LA3_0 <= '\uFFFF')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:90:16: ~ '\\''
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:90:24: '\\\\\\''
            	    {
            	    match("\\'"); 



            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:91:5: ( ( '-' )? ( '0' .. '9' )+ )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:91:7: ( '-' )? ( '0' .. '9' )+
            {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:91:7: ( '-' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='-') ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:91:7: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:91:12: ( '0' .. '9' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '0' && LA5_0 <= '9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:92:8: ( INT ( '.' ( '0' .. '9' )+ )? )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:92:10: INT ( '.' ( '0' .. '9' )+ )?
            {
            mINT(); 


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:92:14: ( '.' ( '0' .. '9' )+ )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='.') ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:92:15: '.' ( '0' .. '9' )+
                    {
                    match('.'); 

                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:92:19: ( '0' .. '9' )+
                    int cnt6=0;
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( ((LA6_0 >= '0' && LA6_0 <= '9')) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt6 >= 1 ) break loop6;
                                EarlyExitException eee =
                                    new EarlyExitException(6, input);
                                throw eee;
                        }
                        cnt6++;
                    } while (true);


                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DOUBLE"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:94:4: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:94:6: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:94:6: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt8=0;
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0 >= '\t' && LA8_0 <= '\n')||LA8_0=='\r'||LA8_0==' ') ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt8 >= 1 ) break loop8;
                        EarlyExitException eee =
                            new EarlyExitException(8, input);
                        throw eee;
                }
                cnt8++;
            } while (true);


            skip();

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:8: ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | SELECT | FROM | WHERE | GROUP | BY | HAVING | ORDER | LIMIT | JOIN | ON | RIGHT | LEFT | INNER | FULL | OUTER | CROSS | DESC | ASC | AS | RANK | DISTINCT | WITH | COUNT | SUM | AVG | MIN | MAX | GROUP_CONCAT | LOGIC | ID | STRING | INT | DOUBLE | WS )
        int alt9=47;
        alt9 = dfa9.predict(input);
        switch (alt9) {
            case 1 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:10: T__38
                {
                mT__38(); 


                }
                break;
            case 2 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:16: T__39
                {
                mT__39(); 


                }
                break;
            case 3 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:22: T__40
                {
                mT__40(); 


                }
                break;
            case 4 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:28: T__41
                {
                mT__41(); 


                }
                break;
            case 5 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:34: T__42
                {
                mT__42(); 


                }
                break;
            case 6 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:40: T__43
                {
                mT__43(); 


                }
                break;
            case 7 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:46: T__44
                {
                mT__44(); 


                }
                break;
            case 8 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:52: T__45
                {
                mT__45(); 


                }
                break;
            case 9 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:58: T__46
                {
                mT__46(); 


                }
                break;
            case 10 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:64: T__47
                {
                mT__47(); 


                }
                break;
            case 11 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:70: T__48
                {
                mT__48(); 


                }
                break;
            case 12 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:76: T__49
                {
                mT__49(); 


                }
                break;
            case 13 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:82: T__50
                {
                mT__50(); 


                }
                break;
            case 14 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:88: SELECT
                {
                mSELECT(); 


                }
                break;
            case 15 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:95: FROM
                {
                mFROM(); 


                }
                break;
            case 16 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:100: WHERE
                {
                mWHERE(); 


                }
                break;
            case 17 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:106: GROUP
                {
                mGROUP(); 


                }
                break;
            case 18 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:112: BY
                {
                mBY(); 


                }
                break;
            case 19 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:115: HAVING
                {
                mHAVING(); 


                }
                break;
            case 20 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:122: ORDER
                {
                mORDER(); 


                }
                break;
            case 21 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:128: LIMIT
                {
                mLIMIT(); 


                }
                break;
            case 22 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:134: JOIN
                {
                mJOIN(); 


                }
                break;
            case 23 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:139: ON
                {
                mON(); 


                }
                break;
            case 24 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:142: RIGHT
                {
                mRIGHT(); 


                }
                break;
            case 25 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:148: LEFT
                {
                mLEFT(); 


                }
                break;
            case 26 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:153: INNER
                {
                mINNER(); 


                }
                break;
            case 27 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:159: FULL
                {
                mFULL(); 


                }
                break;
            case 28 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:164: OUTER
                {
                mOUTER(); 


                }
                break;
            case 29 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:170: CROSS
                {
                mCROSS(); 


                }
                break;
            case 30 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:176: DESC
                {
                mDESC(); 


                }
                break;
            case 31 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:181: ASC
                {
                mASC(); 


                }
                break;
            case 32 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:185: AS
                {
                mAS(); 


                }
                break;
            case 33 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:188: RANK
                {
                mRANK(); 


                }
                break;
            case 34 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:193: DISTINCT
                {
                mDISTINCT(); 


                }
                break;
            case 35 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:202: WITH
                {
                mWITH(); 


                }
                break;
            case 36 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:207: COUNT
                {
                mCOUNT(); 


                }
                break;
            case 37 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:213: SUM
                {
                mSUM(); 


                }
                break;
            case 38 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:217: AVG
                {
                mAVG(); 


                }
                break;
            case 39 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:221: MIN
                {
                mMIN(); 


                }
                break;
            case 40 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:225: MAX
                {
                mMAX(); 


                }
                break;
            case 41 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:229: GROUP_CONCAT
                {
                mGROUP_CONCAT(); 


                }
                break;
            case 42 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:242: LOGIC
                {
                mLOGIC(); 


                }
                break;
            case 43 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:248: ID
                {
                mID(); 


                }
                break;
            case 44 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:251: STRING
                {
                mSTRING(); 


                }
                break;
            case 45 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:258: INT
                {
                mINT(); 


                }
                break;
            case 46 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:262: DOUBLE
                {
                mDOUBLE(); 


                }
                break;
            case 47 :
                // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:1:269: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA9 dfa9 = new DFA9(this);
    static final String DFA9_eotS =
        "\10\uffff\1\41\1\uffff\1\43\17\32\3\uffff\1\77\6\uffff\7\32\1\110"+
        "\1\32\1\113\1\114\13\32\1\131\4\32\2\uffff\1\32\1\137\5\32\1\uffff"+
        "\2\32\2\uffff\13\32\1\162\1\uffff\1\163\1\113\1\164\1\165\1\32\1"+
        "\uffff\1\167\1\170\1\32\1\172\5\32\1\u0080\1\u0081\1\32\1\u0083"+
        "\3\32\1\u0087\1\32\4\uffff\1\32\2\uffff\1\u008a\1\uffff\1\u008c"+
        "\1\32\1\u008e\1\u008f\1\u0090\2\uffff\1\u0091\1\uffff\1\u0092\1"+
        "\u0093\1\u0094\1\uffff\1\32\1\u0096\1\uffff\1\32\1\uffff\1\u0098"+
        "\7\uffff\1\32\1\uffff\1\32\1\uffff\2\32\1\u009d\1\32\1\uffff\2\32"+
        "\1\u00a1\1\uffff";
    static final String DFA9_eofS =
        "\u00a2\uffff";
    static final String DFA9_minS =
        "\1\11\7\uffff\1\75\1\uffff\1\75\1\105\1\122\1\110\1\122\1\131\1"+
        "\101\1\116\1\105\1\117\1\101\1\116\1\117\1\105\1\116\1\101\2\uffff"+
        "\1\60\1\56\6\uffff\1\114\1\115\1\117\1\114\1\105\1\124\1\117\1\60"+
        "\1\126\2\60\1\124\1\115\1\106\1\111\1\107\2\116\1\117\1\125\2\123"+
        "\1\60\1\107\1\104\1\116\1\130\2\uffff\1\105\1\60\1\115\1\114\1\122"+
        "\1\110\1\125\1\uffff\1\111\1\105\2\uffff\1\105\1\111\1\124\1\116"+
        "\1\110\1\113\1\105\1\123\1\116\1\103\1\124\1\60\1\uffff\4\60\1\103"+
        "\1\uffff\2\60\1\105\1\60\1\120\1\116\2\122\1\124\2\60\1\124\1\60"+
        "\1\122\1\123\1\124\1\60\1\111\4\uffff\1\124\2\uffff\1\60\1\uffff"+
        "\1\60\1\107\3\60\2\uffff\1\60\1\uffff\3\60\1\uffff\1\116\1\60\1"+
        "\uffff\1\103\1\uffff\1\60\7\uffff\1\103\1\uffff\1\117\1\uffff\1"+
        "\124\1\116\1\60\1\103\1\uffff\1\101\1\124\1\60\1\uffff";
    static final String DFA9_maxS =
        "\1\172\7\uffff\1\76\1\uffff\1\75\2\125\1\111\1\122\1\131\1\101\1"+
        "\125\1\111\1\117\1\111\1\116\1\122\1\111\1\126\1\111\2\uffff\2\71"+
        "\6\uffff\1\114\1\115\1\117\1\114\1\105\1\124\1\117\1\172\1\126\2"+
        "\172\1\124\1\115\1\106\1\111\1\107\2\116\1\117\1\125\2\123\1\172"+
        "\1\107\1\104\1\116\1\130\2\uffff\1\105\1\172\1\115\1\114\1\122\1"+
        "\110\1\125\1\uffff\1\111\1\105\2\uffff\1\105\1\111\1\124\1\116\1"+
        "\110\1\113\1\105\1\123\1\116\1\103\1\124\1\172\1\uffff\4\172\1\103"+
        "\1\uffff\2\172\1\105\1\172\1\120\1\116\2\122\1\124\2\172\1\124\1"+
        "\172\1\122\1\123\1\124\1\172\1\111\4\uffff\1\124\2\uffff\1\172\1"+
        "\uffff\1\172\1\107\3\172\2\uffff\1\172\1\uffff\3\172\1\uffff\1\116"+
        "\1\172\1\uffff\1\103\1\uffff\1\172\7\uffff\1\103\1\uffff\1\117\1"+
        "\uffff\1\124\1\116\1\172\1\103\1\uffff\1\101\1\124\1\172\1\uffff";
    static final String DFA9_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\13\20\uffff\1\53"+
        "\1\54\2\uffff\1\57\1\11\1\12\1\10\1\15\1\14\33\uffff\1\55\1\56\7"+
        "\uffff\1\22\2\uffff\1\52\1\27\14\uffff\1\40\5\uffff\1\45\22\uffff"+
        "\1\37\1\46\1\47\1\50\1\uffff\1\17\1\33\1\uffff\1\43\5\uffff\1\31"+
        "\1\26\1\uffff\1\41\3\uffff\1\36\2\uffff\1\20\1\uffff\1\21\1\uffff"+
        "\1\24\1\34\1\25\1\30\1\32\1\35\1\44\1\uffff\1\16\1\uffff\1\23\4"+
        "\uffff\1\42\3\uffff\1\51";
    static final String DFA9_specialS =
        "\u00a2\uffff}>";
    static final String[] DFA9_transitionS = {
            "\2\36\2\uffff\1\36\22\uffff\1\36\1\1\5\uffff\1\33\1\2\1\3\1"+
            "\4\1\uffff\1\5\1\34\1\6\1\uffff\12\35\1\uffff\1\7\1\10\1\11"+
            "\1\12\2\uffff\1\30\1\17\1\26\1\27\1\32\1\14\1\16\1\20\1\25\1"+
            "\23\1\32\1\22\1\31\1\32\1\21\2\32\1\24\1\13\3\32\1\15\3\32\4"+
            "\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\37\1\40",
            "",
            "\1\42",
            "\1\44\17\uffff\1\45",
            "\1\46\2\uffff\1\47",
            "\1\50\1\51",
            "\1\52",
            "\1\53",
            "\1\54",
            "\1\56\3\uffff\1\55\2\uffff\1\57",
            "\1\61\3\uffff\1\60",
            "\1\62",
            "\1\64\7\uffff\1\63",
            "\1\65",
            "\1\67\2\uffff\1\66",
            "\1\70\3\uffff\1\71",
            "\1\74\4\uffff\1\72\2\uffff\1\73",
            "\1\76\7\uffff\1\75",
            "",
            "",
            "\12\35",
            "\1\100\1\uffff\12\35",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\105",
            "\1\106",
            "\1\107",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\111",
            "\12\32\7\uffff\3\32\1\112\26\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\12\32\7\uffff\2\32\1\130\27\32\4\uffff\1\32\1\uffff\32\32",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "\1\136",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "",
            "\1\145",
            "\1\146",
            "",
            "",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\166",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\171",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0082",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u0088",
            "",
            "",
            "",
            "",
            "\1\u0089",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\u008b\1\uffff\32\32",
            "\1\u008d",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\u0095",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "\1\u0097",
            "",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0099",
            "",
            "\1\u009a",
            "",
            "\1\u009b",
            "\1\u009c",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            "\1\u009e",
            "",
            "\1\u009f",
            "\1\u00a0",
            "\12\32\7\uffff\32\32\4\uffff\1\32\1\uffff\32\32",
            ""
    };

    static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
    static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
    static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
    static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
    static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
    static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
    static final short[][] DFA9_transition;

    static {
        int numStates = DFA9_transitionS.length;
        DFA9_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
        }
    }

    class DFA9 extends DFA {

        public DFA9(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 9;
            this.eot = DFA9_eot;
            this.eof = DFA9_eof;
            this.min = DFA9_min;
            this.max = DFA9_max;
            this.accept = DFA9_accept;
            this.special = DFA9_special;
            this.transition = DFA9_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | SELECT | FROM | WHERE | GROUP | BY | HAVING | ORDER | LIMIT | JOIN | ON | RIGHT | LEFT | INNER | FULL | OUTER | CROSS | DESC | ASC | AS | RANK | DISTINCT | WITH | COUNT | SUM | AVG | MIN | MAX | GROUP_CONCAT | LOGIC | ID | STRING | INT | DOUBLE | WS );";
        }
    }
 

}
