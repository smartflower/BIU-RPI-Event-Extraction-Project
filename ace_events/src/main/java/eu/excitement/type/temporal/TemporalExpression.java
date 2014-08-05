

/* First created by JCasGen Tue Mar 11 18:07:46 IST 2014 */
package eu.excitement.type.temporal;

import org.apache.uima.jcas.JCas;
import org.apache.uima.jcas.JCasRegistry;
import org.apache.uima.jcas.cas.TOP_Type;
import org.apache.uima.jcas.tcas.Annotation;


/** 
 * Updated by JCasGen Mon Aug 04 21:24:55 IDT 2014
 * XML source: C:/Java/Git/breep/ace_events/TypeSystem.xml
 * @generated */
public class TemporalExpression extends Annotation {
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int typeIndexID = JCasRegistry.register(TemporalExpression.class);
  /** @generated
   * @ordered 
   */
  @SuppressWarnings ("hiding")
  public final static int type = typeIndexID;
  /** @generated  */
  @Override
  public              int getTypeIndexID() {return typeIndexID;}
 
  /** Never called.  Disable default constructor
   * @generated */
  protected TemporalExpression() {/* intentionally empty block */}
    
  /** Internal - constructor used by generator 
   * @generated */
  public TemporalExpression(int addr, TOP_Type type) {
    super(addr, type);
    readObject();
  }
  
  /** @generated */
  public TemporalExpression(JCas jcas) {
    super(jcas);
    readObject();   
  } 

  /** @generated */  
  public TemporalExpression(JCas jcas, int begin, int end) {
    super(jcas);
    setBegin(begin);
    setEnd(end);
    readObject();
  }   

  /** <!-- begin-user-doc -->
    * Write your own initialization here
    * <!-- end-user-doc -->
  @generated modifiable */
  private void readObject() {/*default - does nothing empty block */}
     
 
    
  //*--------------*
  //* Feature: text

  /** getter for text - gets his feature holds the original expression appearing in the text.
   * @generated */
  public String getText() {
    if (TemporalExpression_Type.featOkTst && ((TemporalExpression_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "eu.excitement.type.temporal.TemporalExpression");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TemporalExpression_Type)jcasType).casFeatCode_text);}
    
  /** setter for text - sets his feature holds the original expression appearing in the text. 
   * @generated */
  public void setText(String v) {
    if (TemporalExpression_Type.featOkTst && ((TemporalExpression_Type)jcasType).casFeat_text == null)
      jcasType.jcas.throwFeatMissing("text", "eu.excitement.type.temporal.TemporalExpression");
    jcasType.ll_cas.ll_setStringValue(addr, ((TemporalExpression_Type)jcasType).casFeatCode_text, v);}    
   
    
  //*--------------*
  //* Feature: resolvedTime

  /** getter for resolvedTime - gets This feature holds the resolved time in ISO 8601 format. For
example, "Yesterday", will be resolved into "2012-11-01", etc. See the type DefaultTimeOfText for details.
   * @generated */
  public String getResolvedTime() {
    if (TemporalExpression_Type.featOkTst && ((TemporalExpression_Type)jcasType).casFeat_resolvedTime == null)
      jcasType.jcas.throwFeatMissing("resolvedTime", "eu.excitement.type.temporal.TemporalExpression");
    return jcasType.ll_cas.ll_getStringValue(addr, ((TemporalExpression_Type)jcasType).casFeatCode_resolvedTime);}
    
  /** setter for resolvedTime - sets This feature holds the resolved time in ISO 8601 format. For
example, "Yesterday", will be resolved into "2012-11-01", etc. See the type DefaultTimeOfText for details. 
   * @generated */
  public void setResolvedTime(String v) {
    if (TemporalExpression_Type.featOkTst && ((TemporalExpression_Type)jcasType).casFeat_resolvedTime == null)
      jcasType.jcas.throwFeatMissing("resolvedTime", "eu.excitement.type.temporal.TemporalExpression");
    jcasType.ll_cas.ll_setStringValue(addr, ((TemporalExpression_Type)jcasType).casFeatCode_resolvedTime, v);}    
  }

    