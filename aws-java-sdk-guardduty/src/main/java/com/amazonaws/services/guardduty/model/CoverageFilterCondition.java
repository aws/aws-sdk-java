/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents a condition that when matched will be added to the response of the operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CoverageFilterCondition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageFilterCondition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Represents an equal condition that is applied to a single field while retrieving the coverage details.
     * </p>
     */
    private java.util.List<String> equals;
    /**
     * <p>
     * Represents a not equal condition that is applied to a single field while retrieving the coverage details.
     * </p>
     */
    private java.util.List<String> notEquals;

    /**
     * <p>
     * Represents an equal condition that is applied to a single field while retrieving the coverage details.
     * </p>
     * 
     * @return Represents an equal condition that is applied to a single field while retrieving the coverage details.
     */

    public java.util.List<String> getEquals() {
        return equals;
    }

    /**
     * <p>
     * Represents an equal condition that is applied to a single field while retrieving the coverage details.
     * </p>
     * 
     * @param equals
     *        Represents an equal condition that is applied to a single field while retrieving the coverage details.
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
     * Represents an equal condition that is applied to a single field while retrieving the coverage details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEquals(java.util.Collection)} or {@link #withEquals(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param equals
     *        Represents an equal condition that is applied to a single field while retrieving the coverage details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCondition withEquals(String... equals) {
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
     * Represents an equal condition that is applied to a single field while retrieving the coverage details.
     * </p>
     * 
     * @param equals
     *        Represents an equal condition that is applied to a single field while retrieving the coverage details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCondition withEquals(java.util.Collection<String> equals) {
        setEquals(equals);
        return this;
    }

    /**
     * <p>
     * Represents a not equal condition that is applied to a single field while retrieving the coverage details.
     * </p>
     * 
     * @return Represents a not equal condition that is applied to a single field while retrieving the coverage details.
     */

    public java.util.List<String> getNotEquals() {
        return notEquals;
    }

    /**
     * <p>
     * Represents a not equal condition that is applied to a single field while retrieving the coverage details.
     * </p>
     * 
     * @param notEquals
     *        Represents a not equal condition that is applied to a single field while retrieving the coverage details.
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
     * Represents a not equal condition that is applied to a single field while retrieving the coverage details.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotEquals(java.util.Collection)} or {@link #withNotEquals(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param notEquals
     *        Represents a not equal condition that is applied to a single field while retrieving the coverage details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCondition withNotEquals(String... notEquals) {
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
     * Represents a not equal condition that is applied to a single field while retrieving the coverage details.
     * </p>
     * 
     * @param notEquals
     *        Represents a not equal condition that is applied to a single field while retrieving the coverage details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCondition withNotEquals(java.util.Collection<String> notEquals) {
        setNotEquals(notEquals);
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
        if (getEquals() != null)
            sb.append("Equals: ").append(getEquals()).append(",");
        if (getNotEquals() != null)
            sb.append("NotEquals: ").append(getNotEquals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageFilterCondition == false)
            return false;
        CoverageFilterCondition other = (CoverageFilterCondition) obj;
        if (other.getEquals() == null ^ this.getEquals() == null)
            return false;
        if (other.getEquals() != null && other.getEquals().equals(this.getEquals()) == false)
            return false;
        if (other.getNotEquals() == null ^ this.getNotEquals() == null)
            return false;
        if (other.getNotEquals() != null && other.getNotEquals().equals(this.getNotEquals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEquals() == null) ? 0 : getEquals().hashCode());
        hashCode = prime * hashCode + ((getNotEquals() == null) ? 0 : getNotEquals().hashCode());
        return hashCode;
    }

    @Override
    public CoverageFilterCondition clone() {
        try {
            return (CoverageFilterCondition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.CoverageFilterConditionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
