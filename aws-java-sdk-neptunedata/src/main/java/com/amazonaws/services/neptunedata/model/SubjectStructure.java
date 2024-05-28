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
package com.amazonaws.services.neptunedata.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A subject structure.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptunedata-2023-08-01/SubjectStructure" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SubjectStructure implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Number of occurrences of this specific structure.
     * </p>
     */
    private Long count;
    /**
     * <p>
     * A list of predicates present in this specific structure.
     * </p>
     */
    private java.util.List<String> predicates;

    /**
     * <p>
     * Number of occurrences of this specific structure.
     * </p>
     * 
     * @param count
     *        Number of occurrences of this specific structure.
     */

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * <p>
     * Number of occurrences of this specific structure.
     * </p>
     * 
     * @return Number of occurrences of this specific structure.
     */

    public Long getCount() {
        return this.count;
    }

    /**
     * <p>
     * Number of occurrences of this specific structure.
     * </p>
     * 
     * @param count
     *        Number of occurrences of this specific structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectStructure withCount(Long count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * A list of predicates present in this specific structure.
     * </p>
     * 
     * @return A list of predicates present in this specific structure.
     */

    public java.util.List<String> getPredicates() {
        return predicates;
    }

    /**
     * <p>
     * A list of predicates present in this specific structure.
     * </p>
     * 
     * @param predicates
     *        A list of predicates present in this specific structure.
     */

    public void setPredicates(java.util.Collection<String> predicates) {
        if (predicates == null) {
            this.predicates = null;
            return;
        }

        this.predicates = new java.util.ArrayList<String>(predicates);
    }

    /**
     * <p>
     * A list of predicates present in this specific structure.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPredicates(java.util.Collection)} or {@link #withPredicates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param predicates
     *        A list of predicates present in this specific structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectStructure withPredicates(String... predicates) {
        if (this.predicates == null) {
            setPredicates(new java.util.ArrayList<String>(predicates.length));
        }
        for (String ele : predicates) {
            this.predicates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of predicates present in this specific structure.
     * </p>
     * 
     * @param predicates
     *        A list of predicates present in this specific structure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SubjectStructure withPredicates(java.util.Collection<String> predicates) {
        setPredicates(predicates);
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getPredicates() != null)
            sb.append("Predicates: ").append(getPredicates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SubjectStructure == false)
            return false;
        SubjectStructure other = (SubjectStructure) obj;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getPredicates() == null ^ this.getPredicates() == null)
            return false;
        if (other.getPredicates() != null && other.getPredicates().equals(this.getPredicates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getPredicates() == null) ? 0 : getPredicates().hashCode());
        return hashCode;
    }

    @Override
    public SubjectStructure clone() {
        try {
            return (SubjectStructure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.neptunedata.model.transform.SubjectStructureMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
