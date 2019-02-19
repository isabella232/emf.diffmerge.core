/**
 */
package org.eclipse.emf.diffmerge.diffdata;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EComparison Element</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.emf.diffmerge.diffdata.DiffdataPackage#getEComparisonElement()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface EComparisonElement extends
    org.eclipse.emf.diffmerge.generic.gdiffdata.EComparisonElement<EObject, EAttribute, EReference> {
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @model kind="operation" required="true"
   * @generated
   */
  EComparison getComparison();

} // EComparisonElement
