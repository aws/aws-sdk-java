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
package com.amazonaws.services.auditmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchCreateDelegationByAssessment"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchCreateDelegationByAssessmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The API request to batch create delegations in AWS Audit Manager.
     * </p>
     */
    private java.util.List<CreateDelegationRequest> createDelegationRequests;
    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     */
    private String assessmentId;

    /**
     * <p>
     * The API request to batch create delegations in AWS Audit Manager.
     * </p>
     * 
     * @return The API request to batch create delegations in AWS Audit Manager.
     */

    public java.util.List<CreateDelegationRequest> getCreateDelegationRequests() {
        return createDelegationRequests;
    }

    /**
     * <p>
     * The API request to batch create delegations in AWS Audit Manager.
     * </p>
     * 
     * @param createDelegationRequests
     *        The API request to batch create delegations in AWS Audit Manager.
     */

    public void setCreateDelegationRequests(java.util.Collection<CreateDelegationRequest> createDelegationRequests) {
        if (createDelegationRequests == null) {
            this.createDelegationRequests = null;
            return;
        }

        this.createDelegationRequests = new java.util.ArrayList<CreateDelegationRequest>(createDelegationRequests);
    }

    /**
     * <p>
     * The API request to batch create delegations in AWS Audit Manager.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCreateDelegationRequests(java.util.Collection)} or
     * {@link #withCreateDelegationRequests(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param createDelegationRequests
     *        The API request to batch create delegations in AWS Audit Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateDelegationByAssessmentRequest withCreateDelegationRequests(CreateDelegationRequest... createDelegationRequests) {
        if (this.createDelegationRequests == null) {
            setCreateDelegationRequests(new java.util.ArrayList<CreateDelegationRequest>(createDelegationRequests.length));
        }
        for (CreateDelegationRequest ele : createDelegationRequests) {
            this.createDelegationRequests.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The API request to batch create delegations in AWS Audit Manager.
     * </p>
     * 
     * @param createDelegationRequests
     *        The API request to batch create delegations in AWS Audit Manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchCreateDelegationByAssessmentRequest withCreateDelegationRequests(java.util.Collection<CreateDelegationRequest> createDelegationRequests) {
        setCreateDelegationRequests(createDelegationRequests);
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

    public BatchCreateDelegationByAssessmentRequest withAssessmentId(String assessmentId) {
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
        if (getCreateDelegationRequests() != null)
            sb.append("CreateDelegationRequests: ").append(getCreateDelegationRequests()).append(",");
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

        if (obj instanceof BatchCreateDelegationByAssessmentRequest == false)
            return false;
        BatchCreateDelegationByAssessmentRequest other = (BatchCreateDelegationByAssessmentRequest) obj;
        if (other.getCreateDelegationRequests() == null ^ this.getCreateDelegationRequests() == null)
            return false;
        if (other.getCreateDelegationRequests() != null && other.getCreateDelegationRequests().equals(this.getCreateDelegationRequests()) == false)
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

        hashCode = prime * hashCode + ((getCreateDelegationRequests() == null) ? 0 : getCreateDelegationRequests().hashCode());
        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        return hashCode;
    }

    @Override
    public BatchCreateDelegationByAssessmentRequest clone() {
        return (BatchCreateDelegationByAssessmentRequest) super.clone();
    }

}
