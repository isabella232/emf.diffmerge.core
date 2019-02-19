/*********************************************************************
 * Copyright (c) 2010-2019 Thales Global Services S.A.S.
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *
 * Contributors:
 *    Thales Global Services S.A.S. - initial API and implementation
 **********************************************************************/
package org.eclipse.emf.diffmerge.generic.impl.scopes;

import org.eclipse.emf.diffmerge.generic.api.scopes.IDataScope;


/**
 * A partial implementation of IDataScope.
 * 
 * @param <E> The type of data elements.
 * 
 * @author Olivier Constant
 */
public abstract class AbstractDataScope<E>
implements IDataScope<E> {
  
  /** A potentially null object that identifies the origin of the scope */
  private Object _originator;
  
  
  /**
   * Default constructor
   */
  protected AbstractDataScope() {
    _originator = null;
  }
  
  /**
   * Return an object that characterizes or identifies this scope by default
   * @return a non-null object
   */
  protected Object getDefaultOriginator() {
    return this;
  }
  
  /**
   * @see org.eclipse.emf.diffmerge.generic.api.scopes.IDataScope#getOriginator()
   */
  public Object getOriginator() {
    return _originator != null? _originator: getDefaultOriginator();
  }
  
  /**
   * Set the originator of this scope.
   * If null, then the default originator will be used.
   * @see IDataScope#getOriginator()
   * @param originator_p a potentially null object
   */
  public void setOriginator(Object originator_p) {
    _originator = originator_p;
  }
  
}
