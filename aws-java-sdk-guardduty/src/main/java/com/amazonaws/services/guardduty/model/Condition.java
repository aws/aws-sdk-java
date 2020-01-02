/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about the condition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Condition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Condition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents the equal condition to be applied to a single field when querying for findings.
     * </p>
     */
    @Deprecated
    private java.util.List<String> eq;
    /**
     * <p>
     * Represents the not equal condition to be applied to a single field when querying for findings.
     * </p>
     */
    @Deprecated
    private java.util.List<String> neq;
    /**
     * <p>
     * Represents a greater than condition to be applied to a single field when querying for findings.
     * </p>
     */
    @Deprecated
    private Integer gt;
    /**
     * <p>
     * Represents a greater than equal condition to be applied to a single field when querying for findings.
     * </p>
     */
    @Deprecated
    private Integer gte;
    /**
     * <p>
     * Represents a less than condition to be applied to a single field when querying for findings.
     * </p>
     */
    @Deprecated
    private Integer lt;
    /**
     * <p>
     * Represents a less than equal condition to be applied to a single field when querying for findings.
     * </p>
     */
    @Deprecated
    private Integer lte;
    /**
     * <p>
     * Represents an <b>equal</b> condition to be applied to a single field when querying for findings.
     * </p>
     */
    private java.util.List<String> equals;
    /**
     * <p>
     * Represents an <b>not equal</b> condition to be applied to a single field when querying for findings.
     * </p>
     */
    private java.util.List<String> notEquals;
    /**
     * <p>
     * Represents a greater than condition to be applied to a single field when querying for findings.
     * </p>
     */
    private Long greaterThan;
    /**
     * <p>
     * Represents a greater than equal condition to be applied to a single field when querying for findings.
     * </p>
     */
    private Long greaterThanOrEqual;
    /**
     * <p>
     * Represents a less than condition to be applied to a single field when querying for findings.
     * </p>
     */
    private Long lessThan;
    /**
     * <p>
     * Represents a less than equal condition to be applied to a single field when querying for findings.
     * </p>
     */
    private Long lessThanOrEqual;

    /**
     * <p>
     * Represents the equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return Represents the equal condition to be applied to a single field when querying for findings.
     */
    @Deprecated
    public java.util.List<String> getEq() {
        return eq;
    }

    /**
     * <p>
     * Represents the equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param eq
     *        Represents the equal condition to be applied to a single field when querying for findings.
     */
    @Deprecated
    public void setEq(java.util.Collection<String> eq) {
        if (eq == null) {
            this.eq = null;
            return;
        }

        this.eq = new java.util.ArrayList<String>(eq);
    }

    /**
     * <p>
     * Represents the equal condition to be applied to a single field when querying for findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEq(java.util.Collection)} or {@link #withEq(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param eq
     *        Represents the equal condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Condition withEq(String... eq) {
        if (this.eq == null) {
            setEq(new java.util.ArrayList<String>(eq.length));
        }
        for (String ele : eq) {
            this.eq.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param eq
     *        Represents the equal condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Condition withEq(java.util.Collection<String> eq) {
        setEq(eq);
        return this;
    }

    /**
     * <p>
     * Represents the not equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return Represents the not equal condition to be applied to a single field when querying for findings.
     */
    @Deprecated
    public java.util.List<String> getNeq() {
        return neq;
    }

    /**
     * <p>
     * Represents the not equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param neq
     *        Represents the not equal condition to be applied to a single field when querying for findings.
     */
    @Deprecated
    public void setNeq(java.util.Collection<String> neq) {
        if (neq == null) {
            this.neq = null;
            return;
        }

        this.neq = new java.util.ArrayList<String>(neq);
    }

    /**
     * <p>
     * Represents the not equal condition to be applied to a single field when querying for findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNeq(java.util.Collection)} or {@link #withNeq(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param neq
     *        Represents the not equal condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Condition withNeq(String... neq) {
        if (this.neq == null) {
            setNeq(new java.util.ArrayList<String>(neq.length));
        }
        for (String ele : neq) {
            this.neq.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents the not equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param neq
     *        Represents the not equal condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Condition withNeq(java.util.Collection<String> neq) {
        setNeq(neq);
        return this;
    }

    /**
     * <p>
     * Represents a greater than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param gt
     *        Represents a greater than condition to be applied to a single field when querying for findings.
     */
    @Deprecated
    public void setGt(Integer gt) {
        this.gt = gt;
    }

    /**
     * <p>
     * Represents a greater than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return Represents a greater than condition to be applied to a single field when querying for findings.
     */
    @Deprecated
    public Integer getGt() {
        return this.gt;
    }

    /**
     * <p>
     * Represents a greater than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param gt
     *        Represents a greater than condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Condition withGt(Integer gt) {
        setGt(gt);
        return this;
    }

    /**
     * <p>
     * Represents a greater than equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param gte
     *        Represents a greater than equal condition to be applied to a single field when querying for findings.
     */
    @Deprecated
    public void setGte(Integer gte) {
        this.gte = gte;
    }

    /**
     * <p>
     * Represents a greater than equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return Represents a greater than equal condition to be applied to a single field when querying for findings.
     */
    @Deprecated
    public Integer getGte() {
        return this.gte;
    }

    /**
     * <p>
     * Represents a greater than equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param gte
     *        Represents a greater than equal condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Condition withGte(Integer gte) {
        setGte(gte);
        return this;
    }

    /**
     * <p>
     * Represents a less than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param lt
     *        Represents a less than condition to be applied to a single field when querying for findings.
     */
    @Deprecated
    public void setLt(Integer lt) {
        this.lt = lt;
    }

    /**
     * <p>
     * Represents a less than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return Represents a less than condition to be applied to a single field when querying for findings.
     */
    @Deprecated
    public Integer getLt() {
        return this.lt;
    }

    /**
     * <p>
     * Represents a less than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param lt
     *        Represents a less than condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Condition withLt(Integer lt) {
        setLt(lt);
        return this;
    }

    /**
     * <p>
     * Represents a less than equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param lte
     *        Represents a less than equal condition to be applied to a single field when querying for findings.
     */
    @Deprecated
    public void setLte(Integer lte) {
        this.lte = lte;
    }

    /**
     * <p>
     * Represents a less than equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return Represents a less than equal condition to be applied to a single field when querying for findings.
     */
    @Deprecated
    public Integer getLte() {
        return this.lte;
    }

    /**
     * <p>
     * Represents a less than equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param lte
     *        Represents a less than equal condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */
    @Deprecated
    public Condition withLte(Integer lte) {
        setLte(lte);
        return this;
    }

    /**
     * <p>
     * Represents an <b>equal</b> condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return Represents an <b>equal</b> condition to be applied to a single field when querying for findings.
     */

    public java.util.List<String> getEquals() {
        return equals;
    }

    /**
     * <p>
     * Represents an <b>equal</b> condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param equals
     *        Represents an <b>equal</b> condition to be applied to a single field when querying for findings.
     */

    public void setEquals(java.util.Collection<String> equals) {
        if (equals == null) {
            this.equals = null;
            return;
        }

        this.equals = new java.util.ArrayList<String>(equals);
    }

    /**
     * <p>
     * Represents an <b>equal</b> condition to be applied to a single field when querying for findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEquals(java.util.Collection)} or {@link #withEquals(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param equals
     *        Represents an <b>equal</b> condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withEquals(String... equals) {
        if (this.equals == null) {
            setEquals(new java.util.ArrayList<String>(equals.length));
        }
        for (String ele : equals) {
            this.equals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents an <b>equal</b> condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param equals
     *        Represents an <b>equal</b> condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withEquals(java.util.Collection<String> equals) {
        setEquals(equals);
        return this;
    }

    /**
     * <p>
     * Represents an <b>not equal</b> condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return Represents an <b>not equal</b> condition to be applied to a single field when querying for findings.
     */

    public java.util.List<String> getNotEquals() {
        return notEquals;
    }

    /**
     * <p>
     * Represents an <b>not equal</b> condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param notEquals
     *        Represents an <b>not equal</b> condition to be applied to a single field when querying for findings.
     */

    public void setNotEquals(java.util.Collection<String> notEquals) {
        if (notEquals == null) {
            this.notEquals = null;
            return;
        }

        this.notEquals = new java.util.ArrayList<String>(notEquals);
    }

    /**
     * <p>
     * Represents an <b>not equal</b> condition to be applied to a single field when querying for findings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotEquals(java.util.Collection)} or {@link #withNotEquals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param notEquals
     *        Represents an <b>not equal</b> condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withNotEquals(String... notEquals) {
        if (this.notEquals == null) {
            setNotEquals(new java.util.ArrayList<String>(notEquals.length));
        }
        for (String ele : notEquals) {
            this.notEquals.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents an <b>not equal</b> condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param notEquals
     *        Represents an <b>not equal</b> condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withNotEquals(java.util.Collection<String> notEquals) {
        setNotEquals(notEquals);
        return this;
    }

    /**
     * <p>
     * Represents a greater than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param greaterThan
     *        Represents a greater than condition to be applied to a single field when querying for findings.
     */

    public void setGreaterThan(Long greaterThan) {
        this.greaterThan = greaterThan;
    }

    /**
     * <p>
     * Represents a greater than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return Represents a greater than condition to be applied to a single field when querying for findings.
     */

    public Long getGreaterThan() {
        return this.greaterThan;
    }

    /**
     * <p>
     * Represents a greater than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param greaterThan
     *        Represents a greater than condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withGreaterThan(Long greaterThan) {
        setGreaterThan(greaterThan);
        return this;
    }

    /**
     * <p>
     * Represents a greater than equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param greaterThanOrEqual
     *        Represents a greater than equal condition to be applied to a single field when querying for findings.
     */

    public void setGreaterThanOrEqual(Long greaterThanOrEqual) {
        this.greaterThanOrEqual = greaterThanOrEqual;
    }

    /**
     * <p>
     * Represents a greater than equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return Represents a greater than equal condition to be applied to a single field when querying for findings.
     */

    public Long getGreaterThanOrEqual() {
        return this.greaterThanOrEqual;
    }

    /**
     * <p>
     * Represents a greater than equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param greaterThanOrEqual
     *        Represents a greater than equal condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withGreaterThanOrEqual(Long greaterThanOrEqual) {
        setGreaterThanOrEqual(greaterThanOrEqual);
        return this;
    }

    /**
     * <p>
     * Represents a less than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param lessThan
     *        Represents a less than condition to be applied to a single field when querying for findings.
     */

    public void setLessThan(Long lessThan) {
        this.lessThan = lessThan;
    }

    /**
     * <p>
     * Represents a less than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return Represents a less than condition to be applied to a single field when querying for findings.
     */

    public Long getLessThan() {
        return this.lessThan;
    }

    /**
     * <p>
     * Represents a less than condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param lessThan
     *        Represents a less than condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withLessThan(Long lessThan) {
        setLessThan(lessThan);
        return this;
    }

    /**
     * <p>
     * Represents a less than equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param lessThanOrEqual
     *        Represents a less than equal condition to be applied to a single field when querying for findings.
     */

    public void setLessThanOrEqual(Long lessThanOrEqual) {
        this.lessThanOrEqual = lessThanOrEqual;
    }

    /**
     * <p>
     * Represents a less than equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @return Represents a less than equal condition to be applied to a single field when querying for findings.
     */

    public Long getLessThanOrEqual() {
        return this.lessThanOrEqual;
    }

    /**
     * <p>
     * Represents a less than equal condition to be applied to a single field when querying for findings.
     * </p>
     * 
     * @param lessThanOrEqual
     *        Represents a less than equal condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withLessThanOrEqual(Long lessThanOrEqual) {
        setLessThanOrEqual(lessThanOrEqual);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getEq() != null)
            sb.append("Eq: ").append(getEq()).append(",");
        if (getNeq() != null)
            sb.append("Neq: ").append(getNeq()).append(",");
        if (getGt() != null)
            sb.append("Gt: ").append(getGt()).append(",");
        if (getGte() != null)
            sb.append("Gte: ").append(getGte()).append(",");
        if (getLt() != null)
            sb.append("Lt: ").append(getLt()).append(",");
        if (getLte() != null)
            sb.append("Lte: ").append(getLte()).append(",");
        if (getEquals() != null)
            sb.append("Equals: ").append(getEquals()).append(",");
        if (getNotEquals() != null)
            sb.append("NotEquals: ").append(getNotEquals()).append(",");
        if (getGreaterThan() != null)
            sb.append("GreaterThan: ").append(getGreaterThan()).append(",");
        if (getGreaterThanOrEqual() != null)
            sb.append("GreaterThanOrEqual: ").append(getGreaterThanOrEqual()).append(",");
        if (getLessThan() != null)
            sb.append("LessThan: ").append(getLessThan()).append(",");
        if (getLessThanOrEqual() != null)
            sb.append("LessThanOrEqual: ").append(getLessThanOrEqual());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Condition == false)
            return false;
        Condition other = (Condition) obj;
        if (other.getEq() == null ^ this.getEq() == null)
            return false;
        if (other.getEq() != null && other.getEq().equals(this.getEq()) == false)
            return false;
        if (other.getNeq() == null ^ this.getNeq() == null)
            return false;
        if (other.getNeq() != null && other.getNeq().equals(this.getNeq()) == false)
            return false;
        if (other.getGt() == null ^ this.getGt() == null)
            return false;
        if (other.getGt() != null && other.getGt().equals(this.getGt()) == false)
            return false;
        if (other.getGte() == null ^ this.getGte() == null)
            return false;
        if (other.getGte() != null && other.getGte().equals(this.getGte()) == false)
            return false;
        if (other.getLt() == null ^ this.getLt() == null)
            return false;
        if (other.getLt() != null && other.getLt().equals(this.getLt()) == false)
            return false;
        if (other.getLte() == null ^ this.getLte() == null)
            return false;
        if (other.getLte() != null && other.getLte().equals(this.getLte()) == false)
            return false;
        if (other.getEquals() == null ^ this.getEquals() == null)
            return false;
        if (other.getEquals() != null && other.getEquals().equals(this.getEquals()) == false)
            return false;
        if (other.getNotEquals() == null ^ this.getNotEquals() == null)
            return false;
        if (other.getNotEquals() != null && other.getNotEquals().equals(this.getNotEquals()) == false)
            return false;
        if (other.getGreaterThan() == null ^ this.getGreaterThan() == null)
            return false;
        if (other.getGreaterThan() != null && other.getGreaterThan().equals(this.getGreaterThan()) == false)
            return false;
        if (other.getGreaterThanOrEqual() == null ^ this.getGreaterThanOrEqual() == null)
            return false;
        if (other.getGreaterThanOrEqual() != null && other.getGreaterThanOrEqual().equals(this.getGreaterThanOrEqual()) == false)
            return false;
        if (other.getLessThan() == null ^ this.getLessThan() == null)
            return false;
        if (other.getLessThan() != null && other.getLessThan().equals(this.getLessThan()) == false)
            return false;
        if (other.getLessThanOrEqual() == null ^ this.getLessThanOrEqual() == null)
            return false;
        if (other.getLessThanOrEqual() != null && other.getLessThanOrEqual().equals(this.getLessThanOrEqual()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEq() == null) ? 0 : getEq().hashCode());
        hashCode = prime * hashCode + ((getNeq() == null) ? 0 : getNeq().hashCode());
        hashCode = prime * hashCode + ((getGt() == null) ? 0 : getGt().hashCode());
        hashCode = prime * hashCode + ((getGte() == null) ? 0 : getGte().hashCode());
        hashCode = prime * hashCode + ((getLt() == null) ? 0 : getLt().hashCode());
        hashCode = prime * hashCode + ((getLte() == null) ? 0 : getLte().hashCode());
        hashCode = prime * hashCode + ((getEquals() == null) ? 0 : getEquals().hashCode());
        hashCode = prime * hashCode + ((getNotEquals() == null) ? 0 : getNotEquals().hashCode());
        hashCode = prime * hashCode + ((getGreaterThan() == null) ? 0 : getGreaterThan().hashCode());
        hashCode = prime * hashCode + ((getGreaterThanOrEqual() == null) ? 0 : getGreaterThanOrEqual().hashCode());
        hashCode = prime * hashCode + ((getLessThan() == null) ? 0 : getLessThan().hashCode());
        hashCode = prime * hashCode + ((getLessThanOrEqual() == null) ? 0 : getLessThanOrEqual().hashCode());
        return hashCode;
    }

    @Override
    public Condition clone() {
        try {
            return (Condition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.ConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
