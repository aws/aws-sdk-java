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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A finalized document generated from an AWS Audit Manager assessment. These reports summarize the relevant evidence
 * collected for your audit, and link to the relevant evidence folders which are named and organized according to the
 * controls specified in your assessment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AssessmentReport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentReport implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the specified assessment report.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name given to the assessment report.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the specified assessment report.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     */
    private String awsAccountId;
    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     */
    private String assessmentId;
    /**
     * <p>
     * The name of the associated assessment.
     * </p>
     */
    private String assessmentName;
    /**
     * <p>
     * The name of the user who created the assessment report.
     * </p>
     */
    private String author;
    /**
     * <p>
     * The current status of the specified assessment report.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Specifies when the assessment report was created.
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * The unique identifier for the specified assessment report.
     * </p>
     * 
     * @param id
     *        The unique identifier for the specified assessment report.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the specified assessment report.
     * </p>
     * 
     * @return The unique identifier for the specified assessment report.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the specified assessment report.
     * </p>
     * 
     * @param id
     *        The unique identifier for the specified assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentReport withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name given to the assessment report.
     * </p>
     * 
     * @param name
     *        The name given to the assessment report.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name given to the assessment report.
     * </p>
     * 
     * @return The name given to the assessment report.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name given to the assessment report.
     * </p>
     * 
     * @param name
     *        The name given to the assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentReport withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the specified assessment report.
     * </p>
     * 
     * @param description
     *        The description of the specified assessment report.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the specified assessment report.
     * </p>
     * 
     * @return The description of the specified assessment report.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the specified assessment report.
     * </p>
     * 
     * @param description
     *        The description of the specified assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentReport withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     * 
     * @param awsAccountId
     *        The identifier for the specified AWS account.
     */

    public void setAwsAccountId(String awsAccountId) {
        this.awsAccountId = awsAccountId;
    }

    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     * 
     * @return The identifier for the specified AWS account.
     */

    public String getAwsAccountId() {
        return this.awsAccountId;
    }

    /**
     * <p>
     * The identifier for the specified AWS account.
     * </p>
     * 
     * @param awsAccountId
     *        The identifier for the specified AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentReport withAwsAccountId(String awsAccountId) {
        setAwsAccountId(awsAccountId);
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

    public AssessmentReport withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
        return this;
    }

    /**
     * <p>
     * The name of the associated assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name of the associated assessment.
     */

    public void setAssessmentName(String assessmentName) {
        this.assessmentName = assessmentName;
    }

    /**
     * <p>
     * The name of the associated assessment.
     * </p>
     * 
     * @return The name of the associated assessment.
     */

    public String getAssessmentName() {
        return this.assessmentName;
    }

    /**
     * <p>
     * The name of the associated assessment.
     * </p>
     * 
     * @param assessmentName
     *        The name of the associated assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentReport withAssessmentName(String assessmentName) {
        setAssessmentName(assessmentName);
        return this;
    }

    /**
     * <p>
     * The name of the user who created the assessment report.
     * </p>
     * 
     * @param author
     *        The name of the user who created the assessment report.
     */

    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * <p>
     * The name of the user who created the assessment report.
     * </p>
     * 
     * @return The name of the user who created the assessment report.
     */

    public String getAuthor() {
        return this.author;
    }

    /**
     * <p>
     * The name of the user who created the assessment report.
     * </p>
     * 
     * @param author
     *        The name of the user who created the assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentReport withAuthor(String author) {
        setAuthor(author);
        return this;
    }

    /**
     * <p>
     * The current status of the specified assessment report.
     * </p>
     * 
     * @param status
     *        The current status of the specified assessment report.
     * @see AssessmentReportStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the specified assessment report.
     * </p>
     * 
     * @return The current status of the specified assessment report.
     * @see AssessmentReportStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the specified assessment report.
     * </p>
     * 
     * @param status
     *        The current status of the specified assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentReportStatus
     */

    public AssessmentReport withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the specified assessment report.
     * </p>
     * 
     * @param status
     *        The current status of the specified assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AssessmentReportStatus
     */

    public AssessmentReport withStatus(AssessmentReportStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Specifies when the assessment report was created.
     * </p>
     * 
     * @param creationTime
     *        Specifies when the assessment report was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Specifies when the assessment report was created.
     * </p>
     * 
     * @return Specifies when the assessment report was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Specifies when the assessment report was created.
     * </p>
     * 
     * @param creationTime
     *        Specifies when the assessment report was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentReport withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getAwsAccountId() != null)
            sb.append("AwsAccountId: ").append(getAwsAccountId()).append(",");
        if (getAssessmentId() != null)
            sb.append("AssessmentId: ").append(getAssessmentId()).append(",");
        if (getAssessmentName() != null)
            sb.append("AssessmentName: ").append(getAssessmentName()).append(",");
        if (getAuthor() != null)
            sb.append("Author: ").append(getAuthor()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentReport == false)
            return false;
        AssessmentReport other = (AssessmentReport) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getAwsAccountId() == null ^ this.getAwsAccountId() == null)
            return false;
        if (other.getAwsAccountId() != null && other.getAwsAccountId().equals(this.getAwsAccountId()) == false)
            return false;
        if (other.getAssessmentId() == null ^ this.getAssessmentId() == null)
            return false;
        if (other.getAssessmentId() != null && other.getAssessmentId().equals(this.getAssessmentId()) == false)
            return false;
        if (other.getAssessmentName() == null ^ this.getAssessmentName() == null)
            return false;
        if (other.getAssessmentName() != null && other.getAssessmentName().equals(this.getAssessmentName()) == false)
            return false;
        if (other.getAuthor() == null ^ this.getAuthor() == null)
            return false;
        if (other.getAuthor() != null && other.getAuthor().equals(this.getAuthor()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getAwsAccountId() == null) ? 0 : getAwsAccountId().hashCode());
        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        hashCode = prime * hashCode + ((getAssessmentName() == null) ? 0 : getAssessmentName().hashCode());
        hashCode = prime * hashCode + ((getAuthor() == null) ? 0 : getAuthor().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentReport clone() {
        try {
            return (AssessmentReport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.AssessmentReportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
