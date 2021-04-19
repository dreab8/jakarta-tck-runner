/*
 * Copyright (c) 2008, 2018 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0, which is available at
 * http://www.eclipse.org/legal/epl-2.0.
 *
 * This Source Code may also be made available under the following Secondary
 * Licenses when the conditions for such availability set forth in the
 * Eclipse Public License v. 2.0 are satisfied: GNU General Public License,
 * version 2 with the GNU Classpath Exception, which is available at
 * https://www.gnu.org/software/classpath/license.html.
 *
 * SPDX-License-Identifier: EPL-2.0 OR GPL-2.0 WITH Classpath-exception-2.0
 */

package com.sun.ts.tests.jpa.core.annotations.id;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "DATATYPES")
public class FieldIntegerId implements java.io.Serializable {

  // ===========================================================
  // instance variables

  @Id
  @Column(name = "ID")
  protected Integer id;

  @Column(name = "INTDATA")
  private Integer integerData;

  // ===========================================================
  // constructors
  public FieldIntegerId() {
  }

  public FieldIntegerId(Integer id, Integer integerData) {

    this.id = id;
    this.integerData = integerData;

  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Integer getIntegerData() {
    return integerData;
  }

  public void setIntegerData(Integer integerData) {
    this.integerData = integerData;
  }

  @Override
  public String toString() {
    StringBuilder result = new StringBuilder();
    result.append(this.getClass().getSimpleName() + "[");
    result.append("id: " + getId());
    result.append(", integer: " + getIntegerData());
    result.append("]");
    return result.toString();
  }
}