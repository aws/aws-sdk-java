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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/DeleteAssessmentReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAssessmentReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     */
    private String assessmentId;
    /**
     * <p>
     * The unique identifier for the assessment report.
     * </p>
     */
    private String assessmentReportId;

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

    public DeleteAssessmentReportRequest withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the assessment report.
     * </p>
     * 
     * @param assessmentReportId
     *        The unique identifier for the assessment report.
     */

    public void setAssessmentReportId(String assessmentReportId) {
        this.assessmentReportId = assessmentReportId;
    }

    /**
     * <p>
     * The unique identifier for the assessment report.
     * </p>
     * 
     * @return The unique identifier for the assessment report.
     */

    public String getAssessmentReportId() {
        return this.assessmentReportId;
    }

    /**
     * <p>
     * The unique identifier for the assessment report.
     * </p>
     * 
     * @param assessmentReportId
     *        The unique identifier for the assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAssessmentReportRequest withAssessmentReportId(String assessmentReportId) {
        setAssessmentReportId(assessmentReportId);
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
        if (getAssessmentReportId() != null)
            sb.append("AssessmentReportId: ").append(getAssessmentReportId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAssessmentReportRequest == false)
            return false;
        DeleteAssessmentReportRequest other = (DeleteAssessmentReportRequest) obj;
        if (other.getAssessmentId() == null ^ this.getAssessmentId() == null)
            return false;
        if (other.getAssessmentId() != null && other.getAssessmentId().equals(this.getAssessmentId()) == false)
            return false;
        if (other.getAssessmentReportId() == null ^ this.getAssessmentReportId() == null)
            return false;
        if (other.getAssessmentReportId() != null && other.getAssessmentReportId().equals(this.getAssessmentReportId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        hashCode = prime * hashCode + ((getAssessmentReportId() == null) ? 0 : getAssessmentReportId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAssessmentReportRequest clone() {
        return (DeleteAssessmentReportRequest) super.clone();
    }

}
