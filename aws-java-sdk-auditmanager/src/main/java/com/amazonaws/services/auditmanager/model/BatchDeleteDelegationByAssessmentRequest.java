/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchDeleteDelegationByAssessment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteDelegationByAssessmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifiers for the specified delegations.
     * </p>
     */
    private java.util.List<String> delegationIds;
    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     */
    private String assessmentId;

    /**
     * <p>
     * The identifiers for the specified delegations.
     * </p>
     * 
     * @return The identifiers for the specified delegations.
     */

    public java.util.List<String> getDelegationIds() {
        return delegationIds;
    }

    /**
     * <p>
     * The identifiers for the specified delegations.
     * </p>
     * 
     * @param delegationIds
     *        The identifiers for the specified delegations.
     */

    public void setDelegationIds(java.util.Collection<String> delegationIds) {
        if (delegationIds == null) {
            this.delegationIds = null;
            return;
        }

        this.delegationIds = new java.util.ArrayList<String>(delegationIds);
    }

    /**
     * <p>
     * The identifiers for the specified delegations.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDelegationIds(java.util.Collection)} or {@link #withDelegationIds(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param delegationIds
     *        The identifiers for the specified delegations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDelegationByAssessmentRequest withDelegationIds(String... delegationIds) {
        if (this.delegationIds == null) {
            setDelegationIds(new java.util.ArrayList<String>(delegationIds.length));
        }
        for (String ele : delegationIds) {
            this.delegationIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The identifiers for the specified delegations.
     * </p>
     * 
     * @param delegationIds
     *        The identifiers for the specified delegations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDelegationByAssessmentRequest withDelegationIds(java.util.Collection<String> delegationIds) {
        setDelegationIds(delegationIds);
        return this;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @param assessmentId
     *        The identifier for the specified assessment.
     */

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @return The identifier for the specified assessment.
     */

    public String getAssessmentId() {
        return this.assessmentId;
    }

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     * 
     * @param assessmentId
     *        The identifier for the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteDelegationByAssessmentRequest withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
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
        if (getDelegationIds() != null)
            sb.append("DelegationIds: ").append(getDelegationIds()).append(",");
        if (getAssessmentId() != null)
            sb.append("AssessmentId: ").append(getAssessmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteDelegationByAssessmentRequest == false)
            return false;
        BatchDeleteDelegationByAssessmentRequest other = (BatchDeleteDelegationByAssessmentRequest) obj;
        if (other.getDelegationIds() == null ^ this.getDelegationIds() == null)
            return false;
        if (other.getDelegationIds() != null && other.getDelegationIds().equals(this.getDelegationIds()) == false)
            return false;
        if (other.getAssessmentId() == null ^ this.getAssessmentId() == null)
            return false;
        if (other.getAssessmentId() != null && other.getAssessmentId().equals(this.getAssessmentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDelegationIds() == null) ? 0 : getDelegationIds().hashCode());
        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteDelegationByAssessmentRequest clone() {
        return (BatchDeleteDelegationByAssessmentRequest) super.clone();
    }

}
