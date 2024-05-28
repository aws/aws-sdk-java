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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/CoverageFilterCriterion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoverageFilterCriterion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An enum value representing possible filter fields.
     * </p>
     * <note>
     * <p>
     * Replace the enum value <code>CLUSTER_NAME</code> with <code>EKS_CLUSTER_NAME</code>. <code>CLUSTER_NAME</code>
     * has been deprecated.
     * </p>
     * </note>
     */
    private String criterionKey;
    /**
     * <p>
     * Contains information about the condition.
     * </p>
     */
    private CoverageFilterCondition filterCondition;

    /**
     * <p>
     * An enum value representing possible filter fields.
     * </p>
     * <note>
     * <p>
     * Replace the enum value <code>CLUSTER_NAME</code> with <code>EKS_CLUSTER_NAME</code>. <code>CLUSTER_NAME</code>
     * has been deprecated.
     * </p>
     * </note>
     * 
     * @param criterionKey
     *        An enum value representing possible filter fields.</p> <note>
     *        <p>
     *        Replace the enum value <code>CLUSTER_NAME</code> with <code>EKS_CLUSTER_NAME</code>.
     *        <code>CLUSTER_NAME</code> has been deprecated.
     *        </p>
     * @see CoverageFilterCriterionKey
     */

    public void setCriterionKey(String criterionKey) {
        this.criterionKey = criterionKey;
    }

    /**
     * <p>
     * An enum value representing possible filter fields.
     * </p>
     * <note>
     * <p>
     * Replace the enum value <code>CLUSTER_NAME</code> with <code>EKS_CLUSTER_NAME</code>. <code>CLUSTER_NAME</code>
     * has been deprecated.
     * </p>
     * </note>
     * 
     * @return An enum value representing possible filter fields.</p> <note>
     *         <p>
     *         Replace the enum value <code>CLUSTER_NAME</code> with <code>EKS_CLUSTER_NAME</code>.
     *         <code>CLUSTER_NAME</code> has been deprecated.
     *         </p>
     * @see CoverageFilterCriterionKey
     */

    public String getCriterionKey() {
        return this.criterionKey;
    }

    /**
     * <p>
     * An enum value representing possible filter fields.
     * </p>
     * <note>
     * <p>
     * Replace the enum value <code>CLUSTER_NAME</code> with <code>EKS_CLUSTER_NAME</code>. <code>CLUSTER_NAME</code>
     * has been deprecated.
     * </p>
     * </note>
     * 
     * @param criterionKey
     *        An enum value representing possible filter fields.</p> <note>
     *        <p>
     *        Replace the enum value <code>CLUSTER_NAME</code> with <code>EKS_CLUSTER_NAME</code>.
     *        <code>CLUSTER_NAME</code> has been deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoverageFilterCriterionKey
     */

    public CoverageFilterCriterion withCriterionKey(String criterionKey) {
        setCriterionKey(criterionKey);
        return this;
    }

    /**
     * <p>
     * An enum value representing possible filter fields.
     * </p>
     * <note>
     * <p>
     * Replace the enum value <code>CLUSTER_NAME</code> with <code>EKS_CLUSTER_NAME</code>. <code>CLUSTER_NAME</code>
     * has been deprecated.
     * </p>
     * </note>
     * 
     * @param criterionKey
     *        An enum value representing possible filter fields.</p> <note>
     *        <p>
     *        Replace the enum value <code>CLUSTER_NAME</code> with <code>EKS_CLUSTER_NAME</code>.
     *        <code>CLUSTER_NAME</code> has been deprecated.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CoverageFilterCriterionKey
     */

    public CoverageFilterCriterion withCriterionKey(CoverageFilterCriterionKey criterionKey) {
        this.criterionKey = criterionKey.toString();
        return this;
    }

    /**
     * <p>
     * Contains information about the condition.
     * </p>
     * 
     * @param filterCondition
     *        Contains information about the condition.
     */

    public void setFilterCondition(CoverageFilterCondition filterCondition) {
        this.filterCondition = filterCondition;
    }

    /**
     * <p>
     * Contains information about the condition.
     * </p>
     * 
     * @return Contains information about the condition.
     */

    public CoverageFilterCondition getFilterCondition() {
        return this.filterCondition;
    }

    /**
     * <p>
     * Contains information about the condition.
     * </p>
     * 
     * @param filterCondition
     *        Contains information about the condition.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoverageFilterCriterion withFilterCondition(CoverageFilterCondition filterCondition) {
        setFilterCondition(filterCondition);
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
        if (getCriterionKey() != null)
            sb.append("CriterionKey: ").append(getCriterionKey()).append(",");
        if (getFilterCondition() != null)
            sb.append("FilterCondition: ").append(getFilterCondition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoverageFilterCriterion == false)
            return false;
        CoverageFilterCriterion other = (CoverageFilterCriterion) obj;
        if (other.getCriterionKey() == null ^ this.getCriterionKey() == null)
            return false;
        if (other.getCriterionKey() != null && other.getCriterionKey().equals(this.getCriterionKey()) == false)
            return false;
        if (other.getFilterCondition() == null ^ this.getFilterCondition() == null)
            return false;
        if (other.getFilterCondition() != null && other.getFilterCondition().equals(this.getFilterCondition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCriterionKey() == null) ? 0 : getCriterionKey().hashCode());
        hashCode = prime * hashCode + ((getFilterCondition() == null) ? 0 : getFilterCondition().hashCode());
        return hashCode;
    }

    @Override
    public CoverageFilterCriterion clone() {
        try {
            return (CoverageFilterCriterion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.CoverageFilterCriterionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
