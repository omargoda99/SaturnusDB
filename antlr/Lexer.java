// $ANTLR 3.4 C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g 2025-04-08 00:58:20

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
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:47:8: ( 'select' | 'SELECT' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='s') ) {
                alt1=1;
            }
            else if ( (LA1_0=='S') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;

            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:47:10: 'select'
                    {
                    match("select"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:47:21: 'SELECT'
                    {
                    match("SELECT"); 



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
    // $ANTLR end "SELECT"

    // $ANTLR start "FROM"
    public final void mFROM() throws RecognitionException {
        try {
            int _type = FROM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:48:6: ( 'from' | 'FROM' )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0=='f') ) {
                alt2=1;
            }
            else if ( (LA2_0=='F') ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:48:8: 'from'
                    {
                    match("from"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:48:17: 'FROM'
                    {
                    match("FROM"); 



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
    // $ANTLR end "FROM"

    // $ANTLR start "WHERE"
    public final void mWHERE() throws RecognitionException {
        try {
            int _type = WHERE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:49:7: ( 'where' | 'WHERE' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='w') ) {
                alt3=1;
            }
            else if ( (LA3_0=='W') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;

            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:49:9: 'where'
                    {
                    match("where"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:49:19: 'WHERE'
                    {
                    match("WHERE"); 



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
    // $ANTLR end "WHERE"

    // $ANTLR start "GROUP"
    public final void mGROUP() throws RecognitionException {
        try {
            int _type = GROUP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:50:7: ( 'group' | 'GROUP' )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0=='g') ) {
                alt4=1;
            }
            else if ( (LA4_0=='G') ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;

            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:50:9: 'group'
                    {
                    match("group"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:50:19: 'GROUP'
                    {
                    match("GROUP"); 



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
    // $ANTLR end "GROUP"

    // $ANTLR start "BY"
    public final void mBY() throws RecognitionException {
        try {
            int _type = BY;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:51:4: ( 'by' | 'BY' )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0=='b') ) {
                alt5=1;
            }
            else if ( (LA5_0=='B') ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }
            switch (alt5) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:51:6: 'by'
                    {
                    match("by"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:51:13: 'BY'
                    {
                    match("BY"); 



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
    // $ANTLR end "BY"

    // $ANTLR start "HAVING"
    public final void mHAVING() throws RecognitionException {
        try {
            int _type = HAVING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:52:8: ( 'having' | 'HAVING' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='h') ) {
                alt6=1;
            }
            else if ( (LA6_0=='H') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:52:10: 'having'
                    {
                    match("having"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:52:21: 'HAVING'
                    {
                    match("HAVING"); 



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
    // $ANTLR end "HAVING"

    // $ANTLR start "ORDER"
    public final void mORDER() throws RecognitionException {
        try {
            int _type = ORDER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:53:7: ( 'order' | 'ORDER' )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0=='o') ) {
                alt7=1;
            }
            else if ( (LA7_0=='O') ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;

            }
            switch (alt7) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:53:9: 'order'
                    {
                    match("order"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:53:19: 'ORDER'
                    {
                    match("ORDER"); 



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
    // $ANTLR end "ORDER"

    // $ANTLR start "LIMIT"
    public final void mLIMIT() throws RecognitionException {
        try {
            int _type = LIMIT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:54:7: ( 'limit' | 'LIMIT' )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0=='l') ) {
                alt8=1;
            }
            else if ( (LA8_0=='L') ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:54:9: 'limit'
                    {
                    match("limit"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:54:19: 'LIMIT'
                    {
                    match("LIMIT"); 



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
    // $ANTLR end "LIMIT"

    // $ANTLR start "JOIN"
    public final void mJOIN() throws RecognitionException {
        try {
            int _type = JOIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:55:6: ( 'join' | 'JOIN' )
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0=='j') ) {
                alt9=1;
            }
            else if ( (LA9_0=='J') ) {
                alt9=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;

            }
            switch (alt9) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:55:8: 'join'
                    {
                    match("join"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:55:17: 'JOIN'
                    {
                    match("JOIN"); 



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
    // $ANTLR end "JOIN"

    // $ANTLR start "ON"
    public final void mON() throws RecognitionException {
        try {
            int _type = ON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:56:4: ( 'on' | 'ON' )
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='o') ) {
                alt10=1;
            }
            else if ( (LA10_0=='O') ) {
                alt10=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 10, 0, input);

                throw nvae;

            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:56:6: 'on'
                    {
                    match("on"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:56:13: 'ON'
                    {
                    match("ON"); 



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
    // $ANTLR end "ON"

    // $ANTLR start "RIGHT"
    public final void mRIGHT() throws RecognitionException {
        try {
            int _type = RIGHT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:57:7: ( 'right' | 'RIGHT' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0=='r') ) {
                alt11=1;
            }
            else if ( (LA11_0=='R') ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:57:9: 'right'
                    {
                    match("right"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:57:19: 'RIGHT'
                    {
                    match("RIGHT"); 



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
    // $ANTLR end "RIGHT"

    // $ANTLR start "LEFT"
    public final void mLEFT() throws RecognitionException {
        try {
            int _type = LEFT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:58:6: ( 'left' | 'LEFT' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0=='l') ) {
                alt12=1;
            }
            else if ( (LA12_0=='L') ) {
                alt12=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 12, 0, input);

                throw nvae;

            }
            switch (alt12) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:58:8: 'left'
                    {
                    match("left"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:58:17: 'LEFT'
                    {
                    match("LEFT"); 



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
    // $ANTLR end "LEFT"

    // $ANTLR start "INNER"
    public final void mINNER() throws RecognitionException {
        try {
            int _type = INNER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:59:7: ( 'inner' | 'INNER' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0=='i') ) {
                alt13=1;
            }
            else if ( (LA13_0=='I') ) {
                alt13=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 13, 0, input);

                throw nvae;

            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:59:9: 'inner'
                    {
                    match("inner"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:59:19: 'INNER'
                    {
                    match("INNER"); 



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
    // $ANTLR end "INNER"

    // $ANTLR start "FULL"
    public final void mFULL() throws RecognitionException {
        try {
            int _type = FULL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:60:6: ( 'full' | 'FULL' )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0=='f') ) {
                alt14=1;
            }
            else if ( (LA14_0=='F') ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;

            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:60:8: 'full'
                    {
                    match("full"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:60:17: 'FULL'
                    {
                    match("FULL"); 



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
    // $ANTLR end "FULL"

    // $ANTLR start "OUTER"
    public final void mOUTER() throws RecognitionException {
        try {
            int _type = OUTER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:61:7: ( 'outer' | 'OUTER' )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0=='o') ) {
                alt15=1;
            }
            else if ( (LA15_0=='O') ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }
            switch (alt15) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:61:9: 'outer'
                    {
                    match("outer"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:61:19: 'OUTER'
                    {
                    match("OUTER"); 



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
    // $ANTLR end "OUTER"

    // $ANTLR start "CROSS"
    public final void mCROSS() throws RecognitionException {
        try {
            int _type = CROSS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:62:7: ( 'cross' | 'CROSS' )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0=='c') ) {
                alt16=1;
            }
            else if ( (LA16_0=='C') ) {
                alt16=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;

            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:62:9: 'cross'
                    {
                    match("cross"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:62:19: 'CROSS'
                    {
                    match("CROSS"); 



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
    // $ANTLR end "CROSS"

    // $ANTLR start "DESC"
    public final void mDESC() throws RecognitionException {
        try {
            int _type = DESC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:63:6: ( 'desc' | 'DESC' )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0=='d') ) {
                alt17=1;
            }
            else if ( (LA17_0=='D') ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:63:8: 'desc'
                    {
                    match("desc"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:63:17: 'DESC'
                    {
                    match("DESC"); 



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
    // $ANTLR end "DESC"

    // $ANTLR start "ASC"
    public final void mASC() throws RecognitionException {
        try {
            int _type = ASC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:64:5: ( 'asc' | 'ASC' )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0=='a') ) {
                alt18=1;
            }
            else if ( (LA18_0=='A') ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:64:7: 'asc'
                    {
                    match("asc"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:64:15: 'ASC'
                    {
                    match("ASC"); 



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
    // $ANTLR end "ASC"

    // $ANTLR start "AS"
    public final void mAS() throws RecognitionException {
        try {
            int _type = AS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:65:4: ( 'as' | 'AS' )
            int alt19=2;
            int LA19_0 = input.LA(1);

            if ( (LA19_0=='a') ) {
                alt19=1;
            }
            else if ( (LA19_0=='A') ) {
                alt19=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 19, 0, input);

                throw nvae;

            }
            switch (alt19) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:65:6: 'as'
                    {
                    match("as"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:65:13: 'AS'
                    {
                    match("AS"); 



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
    // $ANTLR end "AS"

    // $ANTLR start "RANK"
    public final void mRANK() throws RecognitionException {
        try {
            int _type = RANK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:66:6: ( 'rank' | 'RANK' )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0=='r') ) {
                alt20=1;
            }
            else if ( (LA20_0=='R') ) {
                alt20=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;

            }
            switch (alt20) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:66:8: 'rank'
                    {
                    match("rank"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:66:17: 'RANK'
                    {
                    match("RANK"); 



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
    // $ANTLR end "RANK"

    // $ANTLR start "DISTINCT"
    public final void mDISTINCT() throws RecognitionException {
        try {
            int _type = DISTINCT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:67:10: ( 'distinct' | 'DISTINCT' )
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0=='d') ) {
                alt21=1;
            }
            else if ( (LA21_0=='D') ) {
                alt21=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:67:12: 'distinct'
                    {
                    match("distinct"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:67:25: 'DISTINCT'
                    {
                    match("DISTINCT"); 



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
    // $ANTLR end "DISTINCT"

    // $ANTLR start "WITH"
    public final void mWITH() throws RecognitionException {
        try {
            int _type = WITH;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:68:6: ( 'with' | 'WITH' )
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0=='w') ) {
                alt22=1;
            }
            else if ( (LA22_0=='W') ) {
                alt22=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }
            switch (alt22) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:68:8: 'with'
                    {
                    match("with"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:68:17: 'WITH'
                    {
                    match("WITH"); 



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
    // $ANTLR end "WITH"

    // $ANTLR start "COUNT"
    public final void mCOUNT() throws RecognitionException {
        try {
            int _type = COUNT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:70:7: ( 'count' | 'COUNT' )
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0=='c') ) {
                alt23=1;
            }
            else if ( (LA23_0=='C') ) {
                alt23=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 23, 0, input);

                throw nvae;

            }
            switch (alt23) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:70:9: 'count'
                    {
                    match("count"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:70:19: 'COUNT'
                    {
                    match("COUNT"); 



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
    // $ANTLR end "COUNT"

    // $ANTLR start "SUM"
    public final void mSUM() throws RecognitionException {
        try {
            int _type = SUM;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:71:5: ( 'sum' | 'SUM' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0=='s') ) {
                alt24=1;
            }
            else if ( (LA24_0=='S') ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;

            }
            switch (alt24) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:71:7: 'sum'
                    {
                    match("sum"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:71:15: 'SUM'
                    {
                    match("SUM"); 



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
    // $ANTLR end "SUM"

    // $ANTLR start "AVG"
    public final void mAVG() throws RecognitionException {
        try {
            int _type = AVG;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:72:5: ( 'avg' | 'AVG' )
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0=='a') ) {
                alt25=1;
            }
            else if ( (LA25_0=='A') ) {
                alt25=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 25, 0, input);

                throw nvae;

            }
            switch (alt25) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:72:7: 'avg'
                    {
                    match("avg"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:72:15: 'AVG'
                    {
                    match("AVG"); 



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
    // $ANTLR end "AVG"

    // $ANTLR start "MIN"
    public final void mMIN() throws RecognitionException {
        try {
            int _type = MIN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:73:5: ( 'min' | 'MIN' )
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0=='m') ) {
                alt26=1;
            }
            else if ( (LA26_0=='M') ) {
                alt26=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 26, 0, input);

                throw nvae;

            }
            switch (alt26) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:73:7: 'min'
                    {
                    match("min"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:73:15: 'MIN'
                    {
                    match("MIN"); 



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
    // $ANTLR end "MIN"

    // $ANTLR start "MAX"
    public final void mMAX() throws RecognitionException {
        try {
            int _type = MAX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:74:5: ( 'max' | 'MAX' )
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0=='m') ) {
                alt27=1;
            }
            else if ( (LA27_0=='M') ) {
                alt27=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 27, 0, input);

                throw nvae;

            }
            switch (alt27) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:74:7: 'max'
                    {
                    match("max"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:74:15: 'MAX'
                    {
                    match("MAX"); 



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
    // $ANTLR end "MAX"

    // $ANTLR start "GROUP_CONCAT"
    public final void mGROUP_CONCAT() throws RecognitionException {
        try {
            int _type = GROUP_CONCAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:75:14: ( 'group_concat' | 'GROUP_CONCAT' )
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0=='g') ) {
                alt28=1;
            }
            else if ( (LA28_0=='G') ) {
                alt28=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 28, 0, input);

                throw nvae;

            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:75:16: 'group_concat'
                    {
                    match("group_concat"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:75:33: 'GROUP_CONCAT'
                    {
                    match("GROUP_CONCAT"); 



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
    // $ANTLR end "GROUP_CONCAT"

    // $ANTLR start "LOGIC"
    public final void mLOGIC() throws RecognitionException {
        try {
            int _type = LOGIC;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:77:7: ( 'and' | 'AND' | 'or' | 'OR' )
            int alt29=4;
            switch ( input.LA(1) ) {
            case 'a':
                {
                alt29=1;
                }
                break;
            case 'A':
                {
                alt29=2;
                }
                break;
            case 'o':
                {
                alt29=3;
                }
                break;
            case 'O':
                {
                alt29=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }

            switch (alt29) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:77:9: 'and'
                    {
                    match("and"); 



                    }
                    break;
                case 2 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:77:17: 'AND'
                    {
                    match("AND"); 



                    }
                    break;
                case 3 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:77:25: 'or'
                    {
                    match("or"); 



                    }
                    break;
                case 4 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:77:32: 'OR'
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
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:78:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:78:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:78:34: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop30:
            do {
                int alt30=2;
                int LA30_0 = input.LA(1);

                if ( ((LA30_0 >= '0' && LA30_0 <= '9')||(LA30_0 >= 'A' && LA30_0 <= 'Z')||LA30_0=='_'||(LA30_0 >= 'a' && LA30_0 <= 'z')) ) {
                    alt30=1;
                }


                switch (alt30) {
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
            	    break loop30;
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
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:79:8: ( '\\'' (~ '\\'' | '\\\\\\'' )* '\\'' )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:79:10: '\\'' (~ '\\'' | '\\\\\\'' )* '\\''
            {
            match('\''); 

            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:79:15: (~ '\\'' | '\\\\\\'' )*
            loop31:
            do {
                int alt31=3;
                int LA31_0 = input.LA(1);

                if ( (LA31_0=='\\') ) {
                    int LA31_2 = input.LA(2);

                    if ( (LA31_2=='\'') ) {
                        int LA31_4 = input.LA(3);

                        if ( ((LA31_4 >= '\u0000' && LA31_4 <= '\uFFFF')) ) {
                            alt31=2;
                        }

                        else {
                            alt31=1;
                        }


                    }
                    else if ( ((LA31_2 >= '\u0000' && LA31_2 <= '&')||(LA31_2 >= '(' && LA31_2 <= '\uFFFF')) ) {
                        alt31=1;
                    }


                }
                else if ( ((LA31_0 >= '\u0000' && LA31_0 <= '&')||(LA31_0 >= '(' && LA31_0 <= '[')||(LA31_0 >= ']' && LA31_0 <= '\uFFFF')) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:79:16: ~ '\\''
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
            	    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:79:24: '\\\\\\''
            	    {
            	    match("\\'"); 



            	    }
            	    break;

            	default :
            	    break loop31;
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
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:80:5: ( ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )* )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:80:7: ( '-' )? ( '1' .. '9' ) ( '0' .. '9' )*
            {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:80:7: ( '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0=='-') ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:80:7: '-'
                    {
                    match('-'); 

                    }
                    break;

            }


            if ( (input.LA(1) >= '1' && input.LA(1) <= '9') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:80:23: ( '0' .. '9' )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( ((LA33_0 >= '0' && LA33_0 <= '9')) ) {
                    alt33=1;
                }


                switch (alt33) {
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
            	    break loop33;
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
    // $ANTLR end "INT"

    // $ANTLR start "DOUBLE"
    public final void mDOUBLE() throws RecognitionException {
        try {
            int _type = DOUBLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:81:8: ( INT ( '.' INT )? )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:81:10: INT ( '.' INT )?
            {
            mINT(); 


            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:81:14: ( '.' INT )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0=='.') ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:81:15: '.' INT
                    {
                    match('.'); 

                    mINT(); 


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
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:83:3: ( ( ' ' | '\\n' | '\\r' | '\\t' )+ )
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:83:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            {
            // C:\\Users\\ogoda\\OneDrive\\Documents\\SQLParser.g:83:5: ( ' ' | '\\n' | '\\r' | '\\t' )+
            int cnt35=0;
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( ((LA35_0 >= '\t' && LA35_0 <= '\n')||LA35_0=='\r'||LA35_0==' ') ) {
                    alt35=1;
                }


                switch (alt35) {
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
            	    if ( cnt35 >= 1 ) break loop35;
                        EarlyExitException eee =
                            new EarlyExitException(35, input);
                        throw eee;
                }
                cnt35++;
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
        int alt36=47;
        alt36 = dfa36.predict(input);
        switch (alt36) {
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


    protected DFA36 dfa36 = new DFA36(this);
    static final String DFA36_eotS =
        "\10\uffff\1\60\1\uffff\1\62\36\51\3\uffff\1\152\6\uffff\16\51\2"+
        "\172\2\51\1\176\1\177\1\51\1\176\1\177\25\51\1\u0098\2\51\1\u0098"+
        "\6\51\1\152\2\uffff\1\51\1\u00a3\1\51\1\u00a3\12\51\1\uffff\3\51"+
        "\2\uffff\27\51\1\u00c9\1\uffff\1\u00ca\1\176\1\u00c9\1\u00ca\1\176"+
        "\1\u00cb\1\u00cc\1\u00cb\1\u00cc\1\51\1\uffff\1\51\1\u00cf\1\u00d0"+
        "\1\u00cf\1\u00d0\1\51\1\u00d2\1\51\1\u00d2\11\51\1\u00dd\1\51\1"+
        "\u00dd\2\u00df\1\51\1\u00e1\1\51\1\u00e1\6\51\1\u00e9\1\51\1\u00e9"+
        "\1\51\4\uffff\2\51\2\uffff\1\u00ee\1\uffff\1\u00ee\2\u00f0\2\51"+
        "\1\u00f4\1\u00f5\1\u00f4\1\u00f5\1\u00f6\1\uffff\1\u00f6\1\uffff"+
        "\1\u00f7\1\uffff\1\u00f7\2\u00f8\1\u00f9\1\u00fa\1\u00f9\1\u00fa"+
        "\1\uffff\2\51\2\u00fd\1\uffff\1\51\1\uffff\1\51\2\u0100\7\uffff"+
        "\2\51\1\uffff\2\51\1\uffff\4\51\2\u0109\2\51\1\uffff\4\51\2\u0110"+
        "\1\uffff";
    static final String DFA36_eofS =
        "\u0111\uffff";
    static final String DFA36_minS =
        "\1\11\7\uffff\1\75\1\uffff\1\75\1\145\1\105\1\162\1\122\1\150\1"+
        "\110\1\162\1\122\1\171\1\131\1\141\1\101\1\156\1\116\1\145\1\105"+
        "\1\157\1\117\1\141\1\101\1\156\1\116\1\157\1\117\1\145\1\105\1\156"+
        "\1\116\1\141\1\101\2\uffff\1\61\1\56\6\uffff\1\154\1\155\1\114\1"+
        "\115\1\157\1\154\1\117\1\114\1\145\1\164\1\105\1\124\1\157\1\117"+
        "\2\60\1\166\1\126\2\60\1\164\2\60\1\124\1\155\1\146\1\115\1\106"+
        "\1\151\1\111\1\147\1\156\1\107\1\116\1\156\1\116\1\157\1\165\1\117"+
        "\1\125\2\163\2\123\1\60\1\147\1\144\1\60\1\107\1\104\1\156\1\170"+
        "\1\116\1\130\1\56\2\uffff\1\145\1\60\1\105\1\60\1\155\1\154\1\115"+
        "\1\114\1\162\1\150\1\122\1\110\1\165\1\125\1\uffff\1\151\1\111\1"+
        "\145\2\uffff\1\145\2\105\1\151\1\164\1\111\1\124\1\156\1\116\1\150"+
        "\1\153\1\110\1\113\1\145\1\105\1\163\1\156\1\123\1\116\1\143\1\164"+
        "\1\103\1\124\1\60\1\uffff\11\60\1\143\1\uffff\1\103\4\60\1\145\1"+
        "\60\1\105\1\60\1\160\1\120\1\156\1\116\2\162\2\122\1\164\1\60\1"+
        "\124\3\60\1\164\1\60\1\124\1\60\1\162\1\122\1\163\1\164\1\123\1"+
        "\124\1\60\1\151\1\60\1\111\4\uffff\1\164\1\124\2\uffff\1\60\1\uffff"+
        "\3\60\1\147\1\107\5\60\1\uffff\1\60\1\uffff\1\60\1\uffff\7\60\1"+
        "\uffff\1\156\1\116\2\60\1\uffff\1\143\1\uffff\1\103\2\60\7\uffff"+
        "\1\143\1\103\1\uffff\1\157\1\117\1\uffff\1\164\1\124\1\156\1\116"+
        "\2\60\1\143\1\103\1\uffff\1\141\1\101\1\164\1\124\2\60\1\uffff";
    static final String DFA36_maxS =
        "\1\172\7\uffff\1\76\1\uffff\1\75\1\165\1\125\1\165\1\125\1\151\1"+
        "\111\1\162\1\122\1\171\1\131\1\141\1\101\1\165\1\125\1\151\1\111"+
        "\1\157\1\117\1\151\1\111\1\156\1\116\1\162\1\122\1\151\1\111\1\166"+
        "\1\126\1\151\1\111\2\uffff\2\71\6\uffff\1\154\1\155\1\114\1\115"+
        "\1\157\1\154\1\117\1\114\1\145\1\164\1\105\1\124\1\157\1\117\2\172"+
        "\1\166\1\126\2\172\1\164\2\172\1\124\1\155\1\146\1\115\1\106\1\151"+
        "\1\111\1\147\1\156\1\107\1\116\1\156\1\116\1\157\1\165\1\117\1\125"+
        "\2\163\2\123\1\172\1\147\1\144\1\172\1\107\1\104\1\156\1\170\1\116"+
        "\1\130\1\71\2\uffff\1\145\1\172\1\105\1\172\1\155\1\154\1\115\1"+
        "\114\1\162\1\150\1\122\1\110\1\165\1\125\1\uffff\1\151\1\111\1\145"+
        "\2\uffff\1\145\2\105\1\151\1\164\1\111\1\124\1\156\1\116\1\150\1"+
        "\153\1\110\1\113\1\145\1\105\1\163\1\156\1\123\1\116\1\143\1\164"+
        "\1\103\1\124\1\172\1\uffff\11\172\1\143\1\uffff\1\103\4\172\1\145"+
        "\1\172\1\105\1\172\1\160\1\120\1\156\1\116\2\162\2\122\1\164\1\172"+
        "\1\124\3\172\1\164\1\172\1\124\1\172\1\162\1\122\1\163\1\164\1\123"+
        "\1\124\1\172\1\151\1\172\1\111\4\uffff\1\164\1\124\2\uffff\1\172"+
        "\1\uffff\3\172\1\147\1\107\5\172\1\uffff\1\172\1\uffff\1\172\1\uffff"+
        "\7\172\1\uffff\1\156\1\116\2\172\1\uffff\1\143\1\uffff\1\103\2\172"+
        "\7\uffff\1\143\1\103\1\uffff\1\157\1\117\1\uffff\1\164\1\124\1\156"+
        "\1\116\2\172\1\143\1\103\1\uffff\1\141\1\101\1\164\1\124\2\172\1"+
        "\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\13\37\uffff\1\53"+
        "\1\54\2\uffff\1\57\1\11\1\12\1\10\1\15\1\14\67\uffff\1\55\1\56\16"+
        "\uffff\1\22\3\uffff\1\52\1\27\30\uffff\1\40\12\uffff\1\45\45\uffff"+
        "\1\37\1\46\1\47\1\50\2\uffff\1\17\1\33\1\uffff\1\43\12\uffff\1\31"+
        "\1\uffff\1\26\1\uffff\1\41\7\uffff\1\36\4\uffff\1\20\1\uffff\1\21"+
        "\3\uffff\1\24\1\34\1\25\1\30\1\32\1\35\1\44\2\uffff\1\16\2\uffff"+
        "\1\23\10\uffff\1\42\6\uffff\1\51";
    static final String DFA36_specialS =
        "\u0111\uffff}>";
    static final String[] DFA36_transitionS = {
            "\2\55\2\uffff\1\55\22\uffff\1\55\1\1\5\uffff\1\52\1\2\1\3\1"+
            "\4\1\uffff\1\5\1\53\1\6\2\uffff\11\54\1\uffff\1\7\1\10\1\11"+
            "\1\12\2\uffff\1\46\1\24\1\42\1\44\1\51\1\16\1\22\1\26\1\40\1"+
            "\34\1\51\1\32\1\50\1\51\1\30\2\51\1\36\1\14\3\51\1\20\3\51\4"+
            "\uffff\1\51\1\uffff\1\45\1\23\1\41\1\43\1\51\1\15\1\21\1\25"+
            "\1\37\1\33\1\51\1\31\1\47\1\51\1\27\2\51\1\35\1\13\3\51\1\17"+
            "\3\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\56\1\57",
            "",
            "\1\61",
            "\1\63\17\uffff\1\64",
            "\1\65\17\uffff\1\66",
            "\1\67\2\uffff\1\70",
            "\1\71\2\uffff\1\72",
            "\1\73\1\74",
            "\1\75\1\76",
            "\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103",
            "\1\104",
            "\1\106\3\uffff\1\105\2\uffff\1\107",
            "\1\111\3\uffff\1\110\2\uffff\1\112",
            "\1\114\3\uffff\1\113",
            "\1\116\3\uffff\1\115",
            "\1\117",
            "\1\120",
            "\1\122\7\uffff\1\121",
            "\1\124\7\uffff\1\123",
            "\1\125",
            "\1\126",
            "\1\130\2\uffff\1\127",
            "\1\132\2\uffff\1\131",
            "\1\133\3\uffff\1\134",
            "\1\135\3\uffff\1\136",
            "\1\141\4\uffff\1\137\2\uffff\1\140",
            "\1\144\4\uffff\1\142\2\uffff\1\143",
            "\1\146\7\uffff\1\145",
            "\1\150\7\uffff\1\147",
            "",
            "",
            "\11\54",
            "\1\153\1\uffff\12\151",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\173",
            "\1\174",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\3\51\1\175\26\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0080",
            "\12\51\7\uffff\3\51\1\u0081\26\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\2\51\1\u0097\27\51",
            "\1\u0099",
            "\1\u009a",
            "\12\51\7\uffff\2\51\1\u009b\27\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\153\1\uffff\12\151",
            "",
            "",
            "\1\u00a2",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a4",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "",
            "",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d1",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d3",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00d4",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00de",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00e0",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00e2",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\1\u00e7",
            "\1\u00e8",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00ea",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u00eb",
            "",
            "",
            "",
            "",
            "\1\u00ec",
            "\1\u00ed",
            "",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\u00ef\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\u00f1\1\uffff\32\51",
            "\1\u00f2",
            "\1\u00f3",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00fb",
            "\1\u00fc",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "\1\u00fe",
            "",
            "\1\u00ff",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u0101",
            "\1\u0102",
            "",
            "\1\u0103",
            "\1\u0104",
            "",
            "\1\u0105",
            "\1\u0106",
            "\1\u0107",
            "\1\u0108",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\1\u010a",
            "\1\u010b",
            "",
            "\1\u010c",
            "\1\u010d",
            "\1\u010e",
            "\1\u010f",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            "\12\51\7\uffff\32\51\4\uffff\1\51\1\uffff\32\51",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | SELECT | FROM | WHERE | GROUP | BY | HAVING | ORDER | LIMIT | JOIN | ON | RIGHT | LEFT | INNER | FULL | OUTER | CROSS | DESC | ASC | AS | RANK | DISTINCT | WITH | COUNT | SUM | AVG | MIN | MAX | GROUP_CONCAT | LOGIC | ID | STRING | INT | DOUBLE | WS );";
        }
    }
 

}
