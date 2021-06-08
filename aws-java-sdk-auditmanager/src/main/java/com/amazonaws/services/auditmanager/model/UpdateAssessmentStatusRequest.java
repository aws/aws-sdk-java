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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/UpdateAssessmentStatus"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAssessmentStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     */
    private String assessmentId;
    /**
     * <p>
     * The current status of the specified assessment.
     * </p>
     */
    private String status;

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

    public UpdateAssessmentStatusRequest withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
        return this;
    }

    /**
     * <p>
     * The current status of the specified assessment.
     * </p>
     * 
     * @param status
     *        The current status of the specified assessment.
     * @see AssessmentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the specified assessment.
     * </p>
     * 
     * @return The current status of the specified assessment.
     * @see AssessmentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the specified assessment.
     * </p>
     * 
     * @param status
     *        The current status of the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public UpdateAssessmentStatusRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the specified assessment.
     * </p>
     * 
     * @param status
     *        The current status of the specified assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentStatus
     */

    public UpdateAssessmentStatusRequest withStatus(AssessmentStatus status) {
        this.status = status.toString();
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
        if (getAssessmentId() != null)
            sb.append("AssessmentId: ").append(getAssessmentId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAssessmentStatusRequest == false)
            return false;
        UpdateAssessmentStatusRequest other = (UpdateAssessmentStatusRequest) obj;
        if (other.getAssessmentId() == null ^ this.getAssessmentId() == null)
            return false;
        if (other.getAssessmentId() != null && other.getAssessmentId().equals(this.getAssessmentId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAssessmentStatusRequest clone() {
        return (UpdateAssessmentStatusRequest) super.clone();
    }

}
