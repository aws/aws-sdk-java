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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details of abort criteria to abort the job.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AbortConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of abort criteria to define rules to abort the job.
     * </p>
     */
    private java.util.List<AbortCriteria> criteriaList;

    /**
     * <p>
     * The list of abort criteria to define rules to abort the job.
     * </p>
     * 
     * @return The list of abort criteria to define rules to abort the job.
     */

    public java.util.List<AbortCriteria> getCriteriaList() {
        return criteriaList;
    }

    /**
     * <p>
     * The list of abort criteria to define rules to abort the job.
     * </p>
     * 
     * @param criteriaList
     *        The list of abort criteria to define rules to abort the job.
     */

    public void setCriteriaList(java.util.Collection<AbortCriteria> criteriaList) {
        if (criteriaList == null) {
            this.criteriaList = null;
            return;
        }

        this.criteriaList = new java.util.ArrayList<AbortCriteria>(criteriaList);
    }

    /**
     * <p>
     * The list of abort criteria to define rules to abort the job.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCriteriaList(java.util.Collection)} or {@link #withCriteriaList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param criteriaList
     *        The list of abort criteria to define rules to abort the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbortConfig withCriteriaList(AbortCriteria... criteriaList) {
        if (this.criteriaList == null) {
            setCriteriaList(new java.util.ArrayList<AbortCriteria>(criteriaList.length));
        }
        for (AbortCriteria ele : criteriaList) {
            this.criteriaList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of abort criteria to define rules to abort the job.
     * </p>
     * 
     * @param criteriaList
     *        The list of abort criteria to define rules to abort the job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AbortConfig withCriteriaList(java.util.Collection<AbortCriteria> criteriaList) {
        setCriteriaList(criteriaList);
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
        if (getCriteriaList() != null)
            sb.append("CriteriaList: ").append(getCriteriaList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AbortConfig == false)
            return false;
        AbortConfig other = (AbortConfig) obj;
        if (other.getCriteriaList() == null ^ this.getCriteriaList() == null)
            return false;
        if (other.getCriteriaList() != null && other.getCriteriaList().equals(this.getCriteriaList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCriteriaList() == null) ? 0 : getCriteriaList().hashCode());
        return hashCode;
    }

    @Override
    public AbortConfig clone() {
        try {
            return (AbortConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.iot.model.transform.AbortConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
