/* Generated By:JavaCC: Do not edit this line. MyParser.java */
class MyParser implements MyParserConstants {
  int contParseError = 0;

  public static void main( String[] args ) throws ParseException, TokenMgrError {
        boolean debug = true;
        MyParser parser = new MyParser( System.in ) ;

        if (!debug) parser.disable_tracing();
        try {
            parser.program();
        } catch(ParseException e) {
            System.err.println(e.getMessage());
        }
    }

//void Start() :
//{Token t;}
//{
//
//  (
//    <DEF> {System.out.println("Palavra reservada: def");}
//  |  t=<ID> {System.out.println("Palavra reservada (id): " + t.image);}
//  |  <OPENP> {System.out.println("Palavra reservada: (");}
//  |  <CLOSEP> {System.out.println("Palavra reservada: )");}
//  |  <OPENCB> {System.out.println("Palavra reservada: {");}
//  |  <CLOSECB> {System.out.println("Palavra reservada: }");}
//  |  <INT> {System.out.println("Palavra reservada: int");}
//  |  <FLOAT> {System.out.println("Palavra reservada: float");}
//  |  <STRING> {System.out.println("Palavra reservada: string");}
//  |  <BREAK> {System.out.println("Palavra reservada: break");}
//  |  <PRINT> {System.out.println("Palavra reservada: print");}
//  |  <READ> {System.out.println("Palavra reservada: read");}
//  |  <RETURN> {System.out.println("Palavra reservada: return");}
//  |  <NEW> {System.out.println("Palavra reservada: new");}
//  |  <NULL> {System.out.println("Palavra reservada: null");}
//  |  <IF> {System.out.println("Palavra reservada: if");}
//  |  <ELSE> {System.out.println("Palavra reservada: else");}
//  |  <FOR> {System.out.println("Palavra reservada: for");}
//  |  <PLUS> {System.out.println("Palavra reservada: plus");}
//  |  <MINUS> {System.out.println("Palavra reservada: minus");}
//  |  <MULT> {System.out.println("Palavra reservada: mult");}
//  |  <DIV> {System.out.println("Palavra reservada: div");}
//  |  <OPENB> {System.out.println("Palavra reservada: (");}
//  |  <CLOSEB> {System.out.println("Palavra reservada: )");}
//  |  <COMMA> {System.out.println("Palavra reservada: ,");}
//  |  <SEMIC> {System.out.println("Palavra reservada: ;");}
//  |  <EQUALS> {System.out.println("Palavra reservada: ==");}
//  |  <ASSIGN> {System.out.println("Palavra reservada: =");}
//  |  <GREAT> {System.out.println("Palavra reservada: >");}
//  |  <LESS> {System.out.println("Palavra reservada: <");}
//  |  <GREATEQ> {System.out.println("Palavra reservada: >");}
//  |  <LESSEQ> {System.out.println("Palavra reservada: <");}
//  |  <DIFF> {System.out.println("Palavra reservada: !=");}
//  |  <MOD> {System.out.println("Palavra reservada: %");}
//  |  t=<INT_CONST> {System.out.println("Palavra reservada (int):" + t.image);}
//  |  t=<FLOAT_CONST> {System.out.println("Palavra reservada (float): " + t.image);}
//  |  t=<STRING_CONST> {System.out.println("Palavra reservada (string): " + t.image);}
//  )*
//  <EOF>
//}
  final public void program() throws ParseException {
    trace_call("program");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DEF:
        funclist();
        break;
      case INT:
      case FLOAT:
      case STRING:
      case BREAK:
      case PRINT:
      case READ:
      case RETURN:
      case IF:
      case FOR:
      case OPENCB:
      case SEMIC:
      case ID:
        statement();
        break;
      case 0:

        jj_consume_token(0);
        break;
      default:
        jj_la1[0] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("program");
    }
  }

  final public void funclist() throws ParseException {
    trace_call("funclist");
    try {
      funcdef();
      funclist2();
    } finally {
      trace_return("funclist");
    }
  }

  final public void funclist2() throws ParseException {
    trace_call("funclist2");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case DEF:
        funclist();
        break;
      default:
        jj_la1[1] = jj_gen;

      }
    } finally {
      trace_return("funclist2");
    }
  }

  final public void funcdef() throws ParseException {
    trace_call("funcdef");
    try {
      jj_consume_token(DEF);
      jj_consume_token(ID);
      jj_consume_token(OPENP);
      paramlist();
      jj_consume_token(CLOSEP);
      jj_consume_token(OPENCB);
      statelist();
      jj_consume_token(CLOSECB);
    } finally {
      trace_return("funcdef");
    }
  }

  final public void paramlist() throws ParseException {
    trace_call("paramlist");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case FLOAT:
      case STRING:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case INT:
          jj_consume_token(INT);
          break;
        case FLOAT:
          jj_consume_token(FLOAT);
          break;
        case STRING:
          jj_consume_token(STRING);
          break;
        default:
          jj_la1[2] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        jj_consume_token(ID);
        jj_consume_token(COMMA);
        paramlist2();
        break;
      default:
        jj_la1[3] = jj_gen;

      }
    } finally {
      trace_return("paramlist");
    }
  }

  final public void paramlist2() throws ParseException {
    trace_call("paramlist2");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        jj_consume_token(COMMA);
        paramlist();
        break;
      default:
        jj_la1[4] = jj_gen;

      }
    } finally {
      trace_return("paramlist2");
    }
  }

  final public void statement() throws ParseException {
    trace_call("statement");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case FLOAT:
      case STRING:
        vardecl();
        jj_consume_token(SEMIC);
        break;
      case ID:
        atribstat();
        jj_consume_token(SEMIC);
        break;
      case PRINT:
        printstat();
        jj_consume_token(SEMIC);
        break;
      case READ:
        readstat();
        jj_consume_token(SEMIC);
        break;
      case RETURN:
        returnstat();
        jj_consume_token(SEMIC);
        break;
      case IF:
        ifstat();
        break;
      case FOR:
        forstat();
        break;
      case OPENCB:
        jj_consume_token(OPENCB);
        statelist();
        jj_consume_token(CLOSECB);
        break;
      case BREAK:
        jj_consume_token(BREAK);
        jj_consume_token(SEMIC);
        break;
      case SEMIC:
        jj_consume_token(SEMIC);
        break;
      default:
        jj_la1[5] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("statement");
    }
  }

  final public void vardecl() throws ParseException {
    trace_call("vardecl");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
        jj_consume_token(INT);
        break;
      case FLOAT:
        jj_consume_token(FLOAT);
        break;
      case STRING:
        jj_consume_token(STRING);
        break;
      default:
        jj_la1[6] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      jj_consume_token(ID);
      ic();
    } finally {
      trace_return("vardecl");
    }
  }

  final public void ic() throws ParseException {
    trace_call("ic");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPENB:
        jj_consume_token(OPENB);
        jj_consume_token(INT_CONST);
        jj_consume_token(CLOSEB);
        ic();
        break;
      default:
        jj_la1[7] = jj_gen;

      }
    } finally {
      trace_return("ic");
    }
  }

  final public void atribstat() throws ParseException {
    trace_call("atribstat");
    try {
      lvalue();
      jj_consume_token(ASSIGN);
      if (jj_2_1(2)) {
        expression();
      } else {
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case NEW:
          allocexpression();
          break;
        case ID:
          funccal();
          break;
        default:
          jj_la1[8] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
      }
    } finally {
      trace_return("atribstat");
    }
  }

  final public void funccal() throws ParseException {
    trace_call("funccal");
    try {
      jj_consume_token(ID);
      jj_consume_token(OPENP);
      paramlistcall();
      jj_consume_token(CLOSEP);
    } finally {
      trace_return("funccal");
    }
  }

  final public void paramlistcall() throws ParseException {
    trace_call("paramlistcall");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ID:
        jj_consume_token(ID);
        paramlistcall2();
        break;
      default:
        jj_la1[9] = jj_gen;

      }
    } finally {
      trace_return("paramlistcall");
    }
  }

  final public void paramlistcall2() throws ParseException {
    trace_call("paramlistcall2");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case COMMA:
        jj_consume_token(COMMA);
        paramlistcall();
        break;
      default:
        jj_la1[10] = jj_gen;

      }
    } finally {
      trace_return("paramlistcall2");
    }
  }

  final public void printstat() throws ParseException {
    trace_call("printstat");
    try {
      jj_consume_token(PRINT);
      expression();
    } finally {
      trace_return("printstat");
    }
  }

  final public void readstat() throws ParseException {
    trace_call("readstat");
    try {
      jj_consume_token(READ);
      lvalue();
    } finally {
      trace_return("readstat");
    }
  }

  final public void returnstat() throws ParseException {
    trace_call("returnstat");
    try {
      jj_consume_token(RETURN);
    } finally {
      trace_return("returnstat");
    }
  }

  final public void ifstat() throws ParseException {
    trace_call("ifstat");
    try {
      jj_consume_token(IF);
      jj_consume_token(OPENP);
      expression();
      jj_consume_token(CLOSEP);
      statement();
      es();
    } finally {
      trace_return("ifstat");
    }
  }

  final public void es() throws ParseException {
    trace_call("es");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case ELSE:
        jj_consume_token(ELSE);
        statement();
        break;
      default:
        jj_la1[11] = jj_gen;

      }
    } finally {
      trace_return("es");
    }
  }

  final public void forstat() throws ParseException {
    trace_call("forstat");
    try {
      jj_consume_token(FOR);
      jj_consume_token(OPENP);
      atribstat();
      jj_consume_token(SEMIC);
      expression();
      jj_consume_token(SEMIC);
      atribstat();
      jj_consume_token(CLOSEP);
      statement();
    } finally {
      trace_return("forstat");
    }
  }

  final public void statelist() throws ParseException {
    trace_call("statelist");
    try {
      statement();
      sl();
    } finally {
      trace_return("statelist");
    }
  }

  final public void sl() throws ParseException {
    trace_call("sl");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
      case FLOAT:
      case STRING:
      case BREAK:
      case PRINT:
      case READ:
      case RETURN:
      case IF:
      case FOR:
      case OPENCB:
      case SEMIC:
      case ID:
        statelist();
        break;
      default:
        jj_la1[12] = jj_gen;

      }
    } finally {
      trace_return("sl");
    }
  }

  final public void allocexpression() throws ParseException {
    trace_call("allocexpression");
    try {
      jj_consume_token(NEW);
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT:
        jj_consume_token(INT);
        break;
      case FLOAT:
        jj_consume_token(FLOAT);
        break;
      case STRING:
        jj_consume_token(STRING);
        break;
      default:
        jj_la1[13] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
      ne();
    } finally {
      trace_return("allocexpression");
    }
  }

  final public void ne() throws ParseException {
    trace_call("ne");
    try {
      jj_consume_token(OPENB);
      numexpression();
      jj_consume_token(CLOSEB);
      ne();
    } finally {
      trace_return("ne");
    }
  }

  final public void expression() throws ParseException {
    trace_call("expression");
    try {
      numexpression();
      ned();
    } finally {
      trace_return("expression");
    }
  }

  final public void ned() throws ParseException {
    trace_call("ned");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case EQUALS:
      case GREAT:
      case LESS:
      case GREATEQ:
      case LESSEQ:
      case DIFF:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case LESS:
          jj_consume_token(LESS);
          break;
        case GREAT:
          jj_consume_token(GREAT);
          break;
        case LESSEQ:
          jj_consume_token(LESSEQ);
          break;
        case GREATEQ:
          jj_consume_token(GREATEQ);
          break;
        case EQUALS:
          jj_consume_token(EQUALS);
          break;
        case DIFF:
          jj_consume_token(DIFF);
          break;
        default:
          jj_la1[14] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        numexpression();
        break;
      default:
        jj_la1[15] = jj_gen;

      }
    } finally {
      trace_return("ned");
    }
  }

  final public void numexpression() throws ParseException {
    trace_call("numexpression");
    try {
      term();
      ner();
    } finally {
      trace_return("numexpression");
    }
  }

  final public void ner() throws ParseException {
    trace_call("ner");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
      case MINUS:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case PLUS:
          jj_consume_token(PLUS);
          break;
        case MINUS:
          jj_consume_token(MINUS);
          break;
        default:
          jj_la1[16] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        term();
        ner();
        break;
      default:
        jj_la1[17] = jj_gen;

      }
    } finally {
      trace_return("ner");
    }
  }

  final public void term() throws ParseException {
    trace_call("term");
    try {
      unaryexpr();
      ue();
    } finally {
      trace_return("term");
    }
  }

  final public void ue() throws ParseException {
    trace_call("ue");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case MULT:
      case DIV:
      case MOD:
        switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
        case MULT:
          jj_consume_token(MULT);
          break;
        case DIV:
          jj_consume_token(DIV);
          break;
        case MOD:
          jj_consume_token(MOD);
          break;
        default:
          jj_la1[18] = jj_gen;
          jj_consume_token(-1);
          throw new ParseException();
        }
        unaryexpr();
        ue();
        break;
      default:
        jj_la1[19] = jj_gen;

      }
    } finally {
      trace_return("ue");
    }
  }

  final public void unaryexpr() throws ParseException {
    trace_call("unaryexpr");
    try {
      mn();
      factor();
    } finally {
      trace_return("unaryexpr");
    }
  }

  final public void mn() throws ParseException {
    trace_call("mn");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case PLUS:
        jj_consume_token(PLUS);
        break;
      case MINUS:
        jj_consume_token(MINUS);
        break;
      default:
        jj_la1[20] = jj_gen;

      }
    } finally {
      trace_return("mn");
    }
  }

  final public void factor() throws ParseException {
    trace_call("factor");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case INT_CONST:
        jj_consume_token(INT_CONST);
        break;
      case FLOAT_CONST:
        jj_consume_token(FLOAT_CONST);
        break;
      case STRING_CONST:
        jj_consume_token(STRING_CONST);
        break;
      case NULL:
        jj_consume_token(NULL);
        break;
      case ID:
        lvalue();
        break;
      case OPENP:
        jj_consume_token(OPENP);
        numexpression();
        jj_consume_token(CLOSEP);
        break;
      default:
        jj_la1[21] = jj_gen;
        jj_consume_token(-1);
        throw new ParseException();
      }
    } finally {
      trace_return("factor");
    }
  }

  final public void lvalue() throws ParseException {
    trace_call("lvalue");
    try {
      jj_consume_token(ID);
      net();
    } finally {
      trace_return("lvalue");
    }
  }

  final public void net() throws ParseException {
    trace_call("net");
    try {
      switch ((jj_ntk==-1)?jj_ntk():jj_ntk) {
      case OPENB:
        jj_consume_token(OPENB);
        numexpression();
        jj_consume_token(CLOSEB);
        net();
        break;
      default:
        jj_la1[22] = jj_gen;

      }
    } finally {
      trace_return("net");
    }
  }

  private boolean jj_2_1(int xla) {
    jj_la = xla; jj_lastpos = jj_scanpos = token;
    try { return !jj_3_1(); }
    catch(LookaheadSuccess ls) { return true; }
    finally { jj_save(0, xla); }
  }

  private boolean jj_3R_6() {
    if (!jj_rescan) trace_call("factor(LOOKING AHEAD...)");
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(41)) {
    jj_scanpos = xsp;
    if (jj_scan_token(42)) {
    jj_scanpos = xsp;
    if (jj_scan_token(43)) {
    jj_scanpos = xsp;
    if (jj_scan_token(14)) {
    jj_scanpos = xsp;
    if (jj_3R_8()) {
    jj_scanpos = xsp;
    if (jj_3R_9()) { if (!jj_rescan) trace_return("factor(LOOKAHEAD FAILED)"); return true; }
    }
    }
    }
    }
    }
    { if (!jj_rescan) trace_return("factor(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  private boolean jj_3R_9() {
    if (jj_scan_token(OPENP)) return true;
    return false;
  }

  private boolean jj_3R_3() {
    if (!jj_rescan) trace_call("term(LOOKING AHEAD...)");
    if (jj_3R_4()) { if (!jj_rescan) trace_return("term(LOOKAHEAD FAILED)"); return true; }
    { if (!jj_rescan) trace_return("term(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  private boolean jj_3R_1() {
    if (!jj_rescan) trace_call("expression(LOOKING AHEAD...)");
    if (jj_3R_2()) { if (!jj_rescan) trace_return("expression(LOOKAHEAD FAILED)"); return true; }
    { if (!jj_rescan) trace_return("expression(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  private boolean jj_3R_5() {
    if (!jj_rescan) trace_call("mn(LOOKING AHEAD...)");
    Token xsp;
    xsp = jj_scanpos;
    if (jj_scan_token(18)) {
    jj_scanpos = xsp;
    if (jj_scan_token(19)) {
    jj_scanpos = xsp;
    if (jj_3R_7()) { if (!jj_rescan) trace_return("mn(LOOKAHEAD FAILED)"); return true; }
    }
    }
    { if (!jj_rescan) trace_return("mn(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  private boolean jj_3R_7() {
    return false;
  }

  private boolean jj_3R_8() {
    if (jj_3R_10()) return true;
    return false;
  }

  private boolean jj_3R_4() {
    if (!jj_rescan) trace_call("unaryexpr(LOOKING AHEAD...)");
    if (jj_3R_5()) { if (!jj_rescan) trace_return("unaryexpr(LOOKAHEAD FAILED)"); return true; }
    if (jj_3R_6()) { if (!jj_rescan) trace_return("unaryexpr(LOOKAHEAD FAILED)"); return true; }
    { if (!jj_rescan) trace_return("unaryexpr(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  private boolean jj_3R_2() {
    if (!jj_rescan) trace_call("numexpression(LOOKING AHEAD...)");
    if (jj_3R_3()) { if (!jj_rescan) trace_return("numexpression(LOOKAHEAD FAILED)"); return true; }
    { if (!jj_rescan) trace_return("numexpression(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  private boolean jj_3R_10() {
    if (!jj_rescan) trace_call("lvalue(LOOKING AHEAD...)");
    if (jj_scan_token(ID)) { if (!jj_rescan) trace_return("lvalue(LOOKAHEAD FAILED)"); return true; }
    { if (!jj_rescan) trace_return("lvalue(LOOKAHEAD SUCCEEDED)"); return false; }
  }

  private boolean jj_3_1() {
    if (jj_3R_1()) return true;
    return false;
  }

  /** Generated Token Manager. */
  public MyParserTokenManager token_source;
  SimpleCharStream jj_input_stream;
  /** Current token. */
  public Token token;
  /** Next token. */
  public Token jj_nt;
  private int jj_ntk;
  private Token jj_scanpos, jj_lastpos;
  private int jj_la;
  /** Whether we are looking ahead. */
  private boolean jj_lookingAhead = false;
  private boolean jj_semLA;
  private int jj_gen;
  final private int[] jj_la1 = new int[23];
  static private int[] jj_la1_0;
  static private int[] jj_la1_1;
  static {
      jj_la1_init_0();
      jj_la1_init_1();
   }
   private static void jj_la1_init_0() {
      jj_la1_0 = new int[] {0x11029fe1,0x100,0xe0,0xe0,0x20000000,0x11029ee0,0xe0,0x4000000,0x2000,0x0,0x20000000,0x10000,0x11029ee0,0xe0,0x40000000,0x40000000,0xc0000,0xc0000,0x300000,0x300000,0xc0000,0x404000,0x4000000,};
   }
   private static void jj_la1_init_1() {
      jj_la1_1 = new int[] {0x100,0x0,0x0,0x0,0x0,0x100,0x0,0x0,0x100,0x100,0x0,0x0,0x100,0x0,0x1f,0x1f,0x0,0x0,0x20,0x20,0x0,0xf00,0x0,};
   }
  final private JJCalls[] jj_2_rtns = new JJCalls[1];
  private boolean jj_rescan = false;
  private int jj_gc = 0;

  /** Constructor with InputStream. */
  public MyParser(java.io.InputStream stream) {
     this(stream, null);
  }
  /** Constructor with InputStream and supplied encoding */
  public MyParser(java.io.InputStream stream, String encoding) {
    try { jj_input_stream = new SimpleCharStream(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source = new MyParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream) {
     ReInit(stream, null);
  }
  /** Reinitialise. */
  public void ReInit(java.io.InputStream stream, String encoding) {
    try { jj_input_stream.ReInit(stream, encoding, 1, 1); } catch(java.io.UnsupportedEncodingException e) { throw new RuntimeException(e); }
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor. */
  public MyParser(java.io.Reader stream) {
    jj_input_stream = new SimpleCharStream(stream, 1, 1);
    token_source = new MyParserTokenManager(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(java.io.Reader stream) {
    jj_input_stream.ReInit(stream, 1, 1);
    token_source.ReInit(jj_input_stream);
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Constructor with generated Token Manager. */
  public MyParser(MyParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  /** Reinitialise. */
  public void ReInit(MyParserTokenManager tm) {
    token_source = tm;
    token = new Token();
    jj_ntk = -1;
    jj_gen = 0;
    for (int i = 0; i < 23; i++) jj_la1[i] = -1;
    for (int i = 0; i < jj_2_rtns.length; i++) jj_2_rtns[i] = new JJCalls();
  }

  private Token jj_consume_token(int kind) throws ParseException {
    Token oldToken;
    if ((oldToken = token).next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    if (token.kind == kind) {
      jj_gen++;
      if (++jj_gc > 100) {
        jj_gc = 0;
        for (int i = 0; i < jj_2_rtns.length; i++) {
          JJCalls c = jj_2_rtns[i];
          while (c != null) {
            if (c.gen < jj_gen) c.first = null;
            c = c.next;
          }
        }
      }
      trace_token(token, "");
      return token;
    }
    token = oldToken;
    jj_kind = kind;
    throw generateParseException();
  }

  static private final class LookaheadSuccess extends java.lang.Error { }
  final private LookaheadSuccess jj_ls = new LookaheadSuccess();
  private boolean jj_scan_token(int kind) {
    if (jj_scanpos == jj_lastpos) {
      jj_la--;
      if (jj_scanpos.next == null) {
        jj_lastpos = jj_scanpos = jj_scanpos.next = token_source.getNextToken();
      } else {
        jj_lastpos = jj_scanpos = jj_scanpos.next;
      }
    } else {
      jj_scanpos = jj_scanpos.next;
    }
    if (jj_rescan) {
      int i = 0; Token tok = token;
      while (tok != null && tok != jj_scanpos) { i++; tok = tok.next; }
      if (tok != null) jj_add_error_token(kind, i);
    } else {
      trace_scan(jj_scanpos, kind);
    }
    if (jj_scanpos.kind != kind) return true;
    if (jj_la == 0 && jj_scanpos == jj_lastpos) throw jj_ls;
    return false;
  }


/** Get the next Token. */
  final public Token getNextToken() {
    if (token.next != null) token = token.next;
    else token = token.next = token_source.getNextToken();
    jj_ntk = -1;
    jj_gen++;
      trace_token(token, " (in getNextToken)");
    return token;
  }

/** Get the specific Token. */
  final public Token getToken(int index) {
    Token t = jj_lookingAhead ? jj_scanpos : token;
    for (int i = 0; i < index; i++) {
      if (t.next != null) t = t.next;
      else t = t.next = token_source.getNextToken();
    }
    return t;
  }

  private int jj_ntk() {
    if ((jj_nt=token.next) == null)
      return (jj_ntk = (token.next=token_source.getNextToken()).kind);
    else
      return (jj_ntk = jj_nt.kind);
  }

  private java.util.List jj_expentries = new java.util.ArrayList();
  private int[] jj_expentry;
  private int jj_kind = -1;
  private int[] jj_lasttokens = new int[100];
  private int jj_endpos;

  private void jj_add_error_token(int kind, int pos) {
    if (pos >= 100) return;
    if (pos == jj_endpos + 1) {
      jj_lasttokens[jj_endpos++] = kind;
    } else if (jj_endpos != 0) {
      jj_expentry = new int[jj_endpos];
      for (int i = 0; i < jj_endpos; i++) {
        jj_expentry[i] = jj_lasttokens[i];
      }
      boolean exists = false;
      for (java.util.Iterator it = jj_expentries.iterator(); it.hasNext();) {
        int[] oldentry = (int[])(it.next());
        if (oldentry.length == jj_expentry.length) {
          exists = true;
          for (int i = 0; i < jj_expentry.length; i++) {
            if (oldentry[i] != jj_expentry[i]) {
              exists = false;
              break;
            }
          }
          if (exists) break;
        }
      }
      if (!exists) jj_expentries.add(jj_expentry);
      if (pos != 0) jj_lasttokens[(jj_endpos = pos) - 1] = kind;
    }
  }

  /** Generate ParseException. */
  public ParseException generateParseException() {
    jj_expentries.clear();
    boolean[] la1tokens = new boolean[44];
    if (jj_kind >= 0) {
      la1tokens[jj_kind] = true;
      jj_kind = -1;
    }
    for (int i = 0; i < 23; i++) {
      if (jj_la1[i] == jj_gen) {
        for (int j = 0; j < 32; j++) {
          if ((jj_la1_0[i] & (1<<j)) != 0) {
            la1tokens[j] = true;
          }
          if ((jj_la1_1[i] & (1<<j)) != 0) {
            la1tokens[32+j] = true;
          }
        }
      }
    }
    for (int i = 0; i < 44; i++) {
      if (la1tokens[i]) {
        jj_expentry = new int[1];
        jj_expentry[0] = i;
        jj_expentries.add(jj_expentry);
      }
    }
    jj_endpos = 0;
    jj_rescan_token();
    jj_add_error_token(0, 0);
    int[][] exptokseq = new int[jj_expentries.size()][];
    for (int i = 0; i < jj_expentries.size(); i++) {
      exptokseq[i] = (int[])jj_expentries.get(i);
    }
    return new ParseException(token, exptokseq, tokenImage);
  }

  private int trace_indent = 0;
  private boolean trace_enabled = true;

/** Enable tracing. */
  final public void enable_tracing() {
    trace_enabled = true;
  }

/** Disable tracing. */
  final public void disable_tracing() {
    trace_enabled = false;
  }

  private void trace_call(String s) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Call:   " + s);
    }
    trace_indent = trace_indent + 2;
  }

  private void trace_return(String s) {
    trace_indent = trace_indent - 2;
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.println("Return: " + s);
    }
  }

  private void trace_token(Token t, String where) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Consumed token: <" + tokenImage[t.kind]);
      if (t.kind != 0 && !tokenImage[t.kind].equals("\"" + t.image + "\"")) {
        System.out.print(": \"" + t.image + "\"");
      }
      System.out.println(" at line " + t.beginLine + " column " + t.beginColumn + ">" + where);
    }
  }

  private void trace_scan(Token t1, int t2) {
    if (trace_enabled) {
      for (int i = 0; i < trace_indent; i++) { System.out.print(" "); }
      System.out.print("Visited token: <" + tokenImage[t1.kind]);
      if (t1.kind != 0 && !tokenImage[t1.kind].equals("\"" + t1.image + "\"")) {
        System.out.print(": \"" + t1.image + "\"");
      }
      System.out.println(" at line " + t1.beginLine + " column " + t1.beginColumn + ">; Expected token: <" + tokenImage[t2] + ">");
    }
  }

  private void jj_rescan_token() {
    jj_rescan = true;
    for (int i = 0; i < 1; i++) {
    try {
      JJCalls p = jj_2_rtns[i];
      do {
        if (p.gen > jj_gen) {
          jj_la = p.arg; jj_lastpos = jj_scanpos = p.first;
          switch (i) {
            case 0: jj_3_1(); break;
          }
        }
        p = p.next;
      } while (p != null);
      } catch(LookaheadSuccess ls) { }
    }
    jj_rescan = false;
  }

  private void jj_save(int index, int xla) {
    JJCalls p = jj_2_rtns[index];
    while (p.gen > jj_gen) {
      if (p.next == null) { p = p.next = new JJCalls(); break; }
      p = p.next;
    }
    p.gen = jj_gen + xla - jj_la; p.first = token; p.arg = xla;
  }

  static final class JJCalls {
    int gen;
    Token first;
    int arg;
    JJCalls next;
  }

}
