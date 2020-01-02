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
package com.amazonaws.services.accessanalyzer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The criteria to use in the filter that defines the archive rule.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/accessanalyzer-2019-11-01/Criterion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Criterion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A "contains" operator to match for the filter used to create the rule.
     * </p>
     */
    private java.util.List<String> contains;
    /**
     * <p>
     * An "equals" operator to match for the filter used to create the rule.
     * </p>
     */
    private java.util.List<String> eq;
    /**
     * <p>
     * An "exists" operator to match for the filter used to create the rule.
     * </p>
     */
    private Boolean exists;
    /**
     * <p>
     * A "not equals" operator to match for the filter used to create the rule.
     * </p>
     */
    private java.util.List<String> neq;

    /**
     * <p>
     * A "contains" operator to match for the filter used to create the rule.
     * </p>
     * 
     * @return A "contains" operator to match for the filter used to create the rule.
     */

    public java.util.List<String> getContains() {
        return contains;
    }

    /**
     * <p>
     * A "contains" operator to match for the filter used to create the rule.
     * </p>
     * 
     * @param contains
     *        A "contains" operator to match for the filter used to create the rule.
     */

    public void setContains(java.util.Collection<String> contains) {
        if (contains == null) {
            this.contains = null;
            return;
        }

        this.contains = new java.util.ArrayList<String>(contains);
    }

    /**
     * <p>
     * A "contains" operator to match for the filter used to create the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContains(java.util.Collection)} or {@link #withContains(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param contains
     *        A "contains" operator to match for the filter used to create the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Criterion withContains(String... contains) {
        if (this.contains == null) {
            setContains(new java.util.ArrayList<String>(contains.length));
        }
        for (String ele : contains) {
            this.contains.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A "contains" operator to match for the filter used to create the rule.
     * </p>
     * 
     * @param contains
     *        A "contains" operator to match for the filter used to create the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Criterion withContains(java.util.Collection<String> contains) {
        setContains(contains);
        return this;
    }

    /**
     * <p>
     * An "equals" operator to match for the filter used to create the rule.
     * </p>
     * 
     * @return An "equals" operator to match for the filter used to create the rule.
     */

    public java.util.List<String> getEq() {
        return eq;
    }

    /**
     * <p>
     * An "equals" operator to match for the filter used to create the rule.
     * </p>
     * 
     * @param eq
     *        An "equals" operator to match for the filter used to create the rule.
     */

    public void setEq(java.util.Collection<String> eq) {
        if (eq == null) {
            this.eq = null;
            return;
        }

        this.eq = new java.util.ArrayList<String>(eq);
    }

    /**
     * <p>
     * An "equals" operator to match for the filter used to create the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEq(java.util.Collection)} or {@link #withEq(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param eq
     *        An "equals" operator to match for the filter used to create the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Criterion withEq(String... eq) {
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
     * An "equals" operator to match for the filter used to create the rule.
     * </p>
     * 
     * @param eq
     *        An "equals" operator to match for the filter used to create the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Criterion withEq(java.util.Collection<String> eq) {
        setEq(eq);
        return this;
    }

    /**
     * <p>
     * An "exists" operator to match for the filter used to create the rule.
     * </p>
     * 
     * @param exists
     *        An "exists" operator to match for the filter used to create the rule.
     */

    public void setExists(Boolean exists) {
        this.exists = exists;
    }

    /**
     * <p>
     * An "exists" operator to match for the filter used to create the rule.
     * </p>
     * 
     * @return An "exists" operator to match for the filter used to create the rule.
     */

    public Boolean getExists() {
        return this.exists;
    }

    /**
     * <p>
     * An "exists" operator to match for the filter used to create the rule.
     * </p>
     * 
     * @param exists
     *        An "exists" operator to match for the filter used to create the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Criterion withExists(Boolean exists) {
        setExists(exists);
        return this;
    }

    /**
     * <p>
     * An "exists" operator to match for the filter used to create the rule.
     * </p>
     * 
     * @return An "exists" operator to match for the filter used to create the rule.
     */

    public Boolean isExists() {
        return this.exists;
    }

    /**
     * <p>
     * A "not equals" operator to match for the filter used to create the rule.
     * </p>
     * 
     * @return A "not equals" operator to match for the filter used to create the rule.
     */

    public java.util.List<String> getNeq() {
        return neq;
    }

    /**
     * <p>
     * A "not equals" operator to match for the filter used to create the rule.
     * </p>
     * 
     * @param neq
     *        A "not equals" operator to match for the filter used to create the rule.
     */

    public void setNeq(java.util.Collection<String> neq) {
        if (neq == null) {
            this.neq = null;
            return;
        }

        this.neq = new java.util.ArrayList<String>(neq);
    }

    /**
     * <p>
     * A "not equals" operator to match for the filter used to create the rule.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNeq(java.util.Collection)} or {@link #withNeq(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param neq
     *        A "not equals" operator to match for the filter used to create the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Criterion withNeq(String... neq) {
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
     * A "not equals" operator to match for the filter used to create the rule.
     * </p>
     * 
     * @param neq
     *        A "not equals" operator to match for the filter used to create the rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Criterion withNeq(java.util.Collection<String> neq) {
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
        if (getContains() != null)
            sb.append("Contains: ").append(getContains()).append(",");
        if (getEq() != null)
            sb.append("Eq: ").append(getEq()).append(",");
        if (getExists() != null)
            sb.append("Exists: ").append(getExists()).append(",");
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

        if (obj instanceof Criterion == false)
            return false;
        Criterion other = (Criterion) obj;
        if (other.getContains() == null ^ this.getContains() == null)
            return false;
        if (other.getContains() != null && other.getContains().equals(this.getContains()) == false)
            return false;
        if (other.getEq() == null ^ this.getEq() == null)
            return false;
        if (other.getEq() != null && other.getEq().equals(this.getEq()) == false)
            return false;
        if (other.getExists() == null ^ this.getExists() == null)
            return false;
        if (other.getExists() != null && other.getExists().equals(this.getExists()) == false)
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

        hashCode = prime * hashCode + ((getContains() == null) ? 0 : getContains().hashCode());
        hashCode = prime * hashCode + ((getEq() == null) ? 0 : getEq().hashCode());
        hashCode = prime * hashCode + ((getExists() == null) ? 0 : getExists().hashCode());
        hashCode = prime * hashCode + ((getNeq() == null) ? 0 : getNeq().hashCode());
        return hashCode;
    }

    @Override
    public Criterion clone() {
        try {
            return (Criterion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.accessanalyzer.model.transform.CriterionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
