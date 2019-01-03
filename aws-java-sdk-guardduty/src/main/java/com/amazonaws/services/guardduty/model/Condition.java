/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Finding attribute (for example, accountId) for which conditions and values must be specified when querying findings.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/Condition" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Condition implements Serializable, Cloneable, StructuredPojo {

    /** Represents the equal condition to be applied to a single field when querying for findings. */
    private java.util.List<String> eq;
    /** Represents the greater than condition to be applied to a single field when querying for findings. */
    private Integer gt;
    /** Represents the greater than equal condition to be applied to a single field when querying for findings. */
    private Integer gte;
    /** Represents the less than condition to be applied to a single field when querying for findings. */
    private Integer lt;
    /** Represents the less than equal condition to be applied to a single field when querying for findings. */
    private Integer lte;
    /** Represents the not equal condition to be applied to a single field when querying for findings. */
    private java.util.List<String> neq;

    /**
     * Represents the equal condition to be applied to a single field when querying for findings.
     * 
     * @return Represents the equal condition to be applied to a single field when querying for findings.
     */

    public java.util.List<String> getEq() {
        return eq;
    }

    /**
     * Represents the equal condition to be applied to a single field when querying for findings.
     * 
     * @param eq
     *        Represents the equal condition to be applied to a single field when querying for findings.
     */

    public void setEq(java.util.Collection<String> eq) {
        if (eq == null) {
            this.eq = null;
            return;
        }

        this.eq = new java.util.ArrayList<String>(eq);
    }

    /**
     * Represents the equal condition to be applied to a single field when querying for findings.
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
     * Represents the equal condition to be applied to a single field when querying for findings.
     * 
     * @param eq
     *        Represents the equal condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withEq(java.util.Collection<String> eq) {
        setEq(eq);
        return this;
    }

    /**
     * Represents the greater than condition to be applied to a single field when querying for findings.
     * 
     * @param gt
     *        Represents the greater than condition to be applied to a single field when querying for findings.
     */

    public void setGt(Integer gt) {
        this.gt = gt;
    }

    /**
     * Represents the greater than condition to be applied to a single field when querying for findings.
     * 
     * @return Represents the greater than condition to be applied to a single field when querying for findings.
     */

    public Integer getGt() {
        return this.gt;
    }

    /**
     * Represents the greater than condition to be applied to a single field when querying for findings.
     * 
     * @param gt
     *        Represents the greater than condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withGt(Integer gt) {
        setGt(gt);
        return this;
    }

    /**
     * Represents the greater than equal condition to be applied to a single field when querying for findings.
     * 
     * @param gte
     *        Represents the greater than equal condition to be applied to a single field when querying for findings.
     */

    public void setGte(Integer gte) {
        this.gte = gte;
    }

    /**
     * Represents the greater than equal condition to be applied to a single field when querying for findings.
     * 
     * @return Represents the greater than equal condition to be applied to a single field when querying for findings.
     */

    public Integer getGte() {
        return this.gte;
    }

    /**
     * Represents the greater than equal condition to be applied to a single field when querying for findings.
     * 
     * @param gte
     *        Represents the greater than equal condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withGte(Integer gte) {
        setGte(gte);
        return this;
    }

    /**
     * Represents the less than condition to be applied to a single field when querying for findings.
     * 
     * @param lt
     *        Represents the less than condition to be applied to a single field when querying for findings.
     */

    public void setLt(Integer lt) {
        this.lt = lt;
    }

    /**
     * Represents the less than condition to be applied to a single field when querying for findings.
     * 
     * @return Represents the less than condition to be applied to a single field when querying for findings.
     */

    public Integer getLt() {
        return this.lt;
    }

    /**
     * Represents the less than condition to be applied to a single field when querying for findings.
     * 
     * @param lt
     *        Represents the less than condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withLt(Integer lt) {
        setLt(lt);
        return this;
    }

    /**
     * Represents the less than equal condition to be applied to a single field when querying for findings.
     * 
     * @param lte
     *        Represents the less than equal condition to be applied to a single field when querying for findings.
     */

    public void setLte(Integer lte) {
        this.lte = lte;
    }

    /**
     * Represents the less than equal condition to be applied to a single field when querying for findings.
     * 
     * @return Represents the less than equal condition to be applied to a single field when querying for findings.
     */

    public Integer getLte() {
        return this.lte;
    }

    /**
     * Represents the less than equal condition to be applied to a single field when querying for findings.
     * 
     * @param lte
     *        Represents the less than equal condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withLte(Integer lte) {
        setLte(lte);
        return this;
    }

    /**
     * Represents the not equal condition to be applied to a single field when querying for findings.
     * 
     * @return Represents the not equal condition to be applied to a single field when querying for findings.
     */

    public java.util.List<String> getNeq() {
        return neq;
    }

    /**
     * Represents the not equal condition to be applied to a single field when querying for findings.
     * 
     * @param neq
     *        Represents the not equal condition to be applied to a single field when querying for findings.
     */

    public void setNeq(java.util.Collection<String> neq) {
        if (neq == null) {
            this.neq = null;
            return;
        }

        this.neq = new java.util.ArrayList<String>(neq);
    }

    /**
     * Represents the not equal condition to be applied to a single field when querying for findings.
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
     * Represents the not equal condition to be applied to a single field when querying for findings.
     * 
     * @param neq
     *        Represents the not equal condition to be applied to a single field when querying for findings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Condition withNeq(java.util.Collection<String> neq) {
        setNeq(neq);
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
        if (getGt() != null)
            sb.append("Gt: ").append(getGt()).append(",");
        if (getGte() != null)
            sb.append("Gte: ").append(getGte()).append(",");
        if (getLt() != null)
            sb.append("Lt: ").append(getLt()).append(",");
        if (getLte() != null)
            sb.append("Lte: ").append(getLte()).append(",");
        if (getNeq() != null)
            sb.append("Neq: ").append(getNeq());
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
        if (other.getNeq() == null ^ this.getNeq() == null)
            return false;
        if (other.getNeq() != null && other.getNeq().equals(this.getNeq()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEq() == null) ? 0 : getEq().hashCode());
        hashCode = prime * hashCode + ((getGt() == null) ? 0 : getGt().hashCode());
        hashCode = prime * hashCode + ((getGte() == null) ? 0 : getGte().hashCode());
        hashCode = prime * hashCode + ((getLt() == null) ? 0 : getLt().hashCode());
        hashCode = prime * hashCode + ((getLte() == null) ? 0 : getLte().hashCode());
        hashCode = prime * hashCode + ((getNeq() == null) ? 0 : getNeq().hashCode());
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
