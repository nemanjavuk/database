/* Generated By:JJTree: Do not edit this line. ASTCreateEntailments.java Version 4.3 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.bigdata.rdf.sail.sparql.ast;

public
class ASTCreateEntailments extends ASTUpdate {
  public ASTCreateEntailments(int id) {
    super(id);
  }

  public ASTCreateEntailments(SyntaxTreeBuilder p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(SyntaxTreeBuilderVisitor visitor, Object data) throws VisitorException {
    return visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3c07a5ca206792263ad26e3dca22157a (do not edit this line) */
