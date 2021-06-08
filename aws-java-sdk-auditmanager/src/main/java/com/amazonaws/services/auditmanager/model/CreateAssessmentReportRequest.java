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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/CreateAssessmentReport"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAssessmentReportRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new assessment report.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the assessment report.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     */
    private String assessmentId;

    /**
     * <p>
     * The name of the new assessment report.
     * </p>
     * 
     * @param name
     *        The name of the new assessment report.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the new assessment report.
     * </p>
     * 
     * @return The name of the new assessment report.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the new assessment report.
     * </p>
     * 
     * @param name
     *        The name of the new assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentReportRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the assessment report.
     * </p>
     * 
     * @param description
     *        The description of the assessment report.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the assessment report.
     * </p>
     * 
     * @return The description of the assessment report.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the assessment report.
     * </p>
     * 
     * @param description
     *        The description of the assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAssessmentReportRequest withDescription(String description) {
        setDescription(description);
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

    public CreateAssessmentReportRequest withAssessmentId(String assessmentId) {
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateAssessmentReportRequest == false)
            return false;
        CreateAssessmentReportRequest other = (CreateAssessmentReportRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        return hashCode;
    }

    @Override
    public CreateAssessmentReportRequest clone() {
        return (CreateAssessmentReportRequest) super.clone();
    }

}
