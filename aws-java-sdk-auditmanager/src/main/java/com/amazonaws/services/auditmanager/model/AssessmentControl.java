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
 * The control entity that represents a standard or custom control used in an AWS Audit Manager assessment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/AssessmentControl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssessmentControl implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The name of the specified control.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the specified control.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the specified control.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The response of the specified control.
     * </p>
     */
    private String response;
    /**
     * <p>
     * The list of comments attached to the specified control.
     * </p>
     */
    private java.util.List<ControlComment> comments;
    /**
     * <p>
     * The list of data sources for the specified evidence.
     * </p>
     */
    private java.util.List<String> evidenceSources;
    /**
     * <p>
     * The amount of evidence generated for the control.
     * </p>
     */
    private Integer evidenceCount;
    /**
     * <p>
     * The amount of evidence in the assessment report.
     * </p>
     */
    private Integer assessmentReportEvidenceCount;

    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     * 
     * @param id
     *        The identifier for the specified control.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     * 
     * @return The identifier for the specified control.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     * 
     * @param id
     *        The identifier for the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControl withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The name of the specified control.
     * </p>
     * 
     * @param name
     *        The name of the specified control.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the specified control.
     * </p>
     * 
     * @return The name of the specified control.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the specified control.
     * </p>
     * 
     * @param name
     *        The name of the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControl withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the specified control.
     * </p>
     * 
     * @param description
     *        The description of the specified control.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the specified control.
     * </p>
     * 
     * @return The description of the specified control.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the specified control.
     * </p>
     * 
     * @param description
     *        The description of the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControl withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the specified control.
     * </p>
     * 
     * @param status
     *        The status of the specified control.
     * @see ControlStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the specified control.
     * </p>
     * 
     * @return The status of the specified control.
     * @see ControlStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the specified control.
     * </p>
     * 
     * @param status
     *        The status of the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlStatus
     */

    public AssessmentControl withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the specified control.
     * </p>
     * 
     * @param status
     *        The status of the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlStatus
     */

    public AssessmentControl withStatus(ControlStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The response of the specified control.
     * </p>
     * 
     * @param response
     *        The response of the specified control.
     * @see ControlResponse
     */

    public void setResponse(String response) {
        this.response = response;
    }

    /**
     * <p>
     * The response of the specified control.
     * </p>
     * 
     * @return The response of the specified control.
     * @see ControlResponse
     */

    public String getResponse() {
        return this.response;
    }

    /**
     * <p>
     * The response of the specified control.
     * </p>
     * 
     * @param response
     *        The response of the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlResponse
     */

    public AssessmentControl withResponse(String response) {
        setResponse(response);
        return this;
    }

    /**
     * <p>
     * The response of the specified control.
     * </p>
     * 
     * @param response
     *        The response of the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ControlResponse
     */

    public AssessmentControl withResponse(ControlResponse response) {
        this.response = response.toString();
        return this;
    }

    /**
     * <p>
     * The list of comments attached to the specified control.
     * </p>
     * 
     * @return The list of comments attached to the specified control.
     */

    public java.util.List<ControlComment> getComments() {
        return comments;
    }

    /**
     * <p>
     * The list of comments attached to the specified control.
     * </p>
     * 
     * @param comments
     *        The list of comments attached to the specified control.
     */

    public void setComments(java.util.Collection<ControlComment> comments) {
        if (comments == null) {
            this.comments = null;
            return;
        }

        this.comments = new java.util.ArrayList<ControlComment>(comments);
    }

    /**
     * <p>
     * The list of comments attached to the specified control.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setComments(java.util.Collection)} or {@link #withComments(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param comments
     *        The list of comments attached to the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControl withComments(ControlComment... comments) {
        if (this.comments == null) {
            setComments(new java.util.ArrayList<ControlComment>(comments.length));
        }
        for (ControlComment ele : comments) {
            this.comments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of comments attached to the specified control.
     * </p>
     * 
     * @param comments
     *        The list of comments attached to the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControl withComments(java.util.Collection<ControlComment> comments) {
        setComments(comments);
        return this;
    }

    /**
     * <p>
     * The list of data sources for the specified evidence.
     * </p>
     * 
     * @return The list of data sources for the specified evidence.
     */

    public java.util.List<String> getEvidenceSources() {
        return evidenceSources;
    }

    /**
     * <p>
     * The list of data sources for the specified evidence.
     * </p>
     * 
     * @param evidenceSources
     *        The list of data sources for the specified evidence.
     */

    public void setEvidenceSources(java.util.Collection<String> evidenceSources) {
        if (evidenceSources == null) {
            this.evidenceSources = null;
            return;
        }

        this.evidenceSources = new java.util.ArrayList<String>(evidenceSources);
    }

    /**
     * <p>
     * The list of data sources for the specified evidence.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvidenceSources(java.util.Collection)} or {@link #withEvidenceSources(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param evidenceSources
     *        The list of data sources for the specified evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControl withEvidenceSources(String... evidenceSources) {
        if (this.evidenceSources == null) {
            setEvidenceSources(new java.util.ArrayList<String>(evidenceSources.length));
        }
        for (String ele : evidenceSources) {
            this.evidenceSources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of data sources for the specified evidence.
     * </p>
     * 
     * @param evidenceSources
     *        The list of data sources for the specified evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControl withEvidenceSources(java.util.Collection<String> evidenceSources) {
        setEvidenceSources(evidenceSources);
        return this;
    }

    /**
     * <p>
     * The amount of evidence generated for the control.
     * </p>
     * 
     * @param evidenceCount
     *        The amount of evidence generated for the control.
     */

    public void setEvidenceCount(Integer evidenceCount) {
        this.evidenceCount = evidenceCount;
    }

    /**
     * <p>
     * The amount of evidence generated for the control.
     * </p>
     * 
     * @return The amount of evidence generated for the control.
     */

    public Integer getEvidenceCount() {
        return this.evidenceCount;
    }

    /**
     * <p>
     * The amount of evidence generated for the control.
     * </p>
     * 
     * @param evidenceCount
     *        The amount of evidence generated for the control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControl withEvidenceCount(Integer evidenceCount) {
        setEvidenceCount(evidenceCount);
        return this;
    }

    /**
     * <p>
     * The amount of evidence in the assessment report.
     * </p>
     * 
     * @param assessmentReportEvidenceCount
     *        The amount of evidence in the assessment report.
     */

    public void setAssessmentReportEvidenceCount(Integer assessmentReportEvidenceCount) {
        this.assessmentReportEvidenceCount = assessmentReportEvidenceCount;
    }

    /**
     * <p>
     * The amount of evidence in the assessment report.
     * </p>
     * 
     * @return The amount of evidence in the assessment report.
     */

    public Integer getAssessmentReportEvidenceCount() {
        return this.assessmentReportEvidenceCount;
    }

    /**
     * <p>
     * The amount of evidence in the assessment report.
     * </p>
     * 
     * @param assessmentReportEvidenceCount
     *        The amount of evidence in the assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssessmentControl withAssessmentReportEvidenceCount(Integer assessmentReportEvidenceCount) {
        setAssessmentReportEvidenceCount(assessmentReportEvidenceCount);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getResponse() != null)
            sb.append("Response: ").append(getResponse()).append(",");
        if (getComments() != null)
            sb.append("Comments: ").append(getComments()).append(",");
        if (getEvidenceSources() != null)
            sb.append("EvidenceSources: ").append(getEvidenceSources()).append(",");
        if (getEvidenceCount() != null)
            sb.append("EvidenceCount: ").append(getEvidenceCount()).append(",");
        if (getAssessmentReportEvidenceCount() != null)
            sb.append("AssessmentReportEvidenceCount: ").append(getAssessmentReportEvidenceCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssessmentControl == false)
            return false;
        AssessmentControl other = (AssessmentControl) obj;
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getResponse() == null ^ this.getResponse() == null)
            return false;
        if (other.getResponse() != null && other.getResponse().equals(this.getResponse()) == false)
            return false;
        if (other.getComments() == null ^ this.getComments() == null)
            return false;
        if (other.getComments() != null && other.getComments().equals(this.getComments()) == false)
            return false;
        if (other.getEvidenceSources() == null ^ this.getEvidenceSources() == null)
            return false;
        if (other.getEvidenceSources() != null && other.getEvidenceSources().equals(this.getEvidenceSources()) == false)
            return false;
        if (other.getEvidenceCount() == null ^ this.getEvidenceCount() == null)
            return false;
        if (other.getEvidenceCount() != null && other.getEvidenceCount().equals(this.getEvidenceCount()) == false)
            return false;
        if (other.getAssessmentReportEvidenceCount() == null ^ this.getAssessmentReportEvidenceCount() == null)
            return false;
        if (other.getAssessmentReportEvidenceCount() != null
                && other.getAssessmentReportEvidenceCount().equals(this.getAssessmentReportEvidenceCount()) == false)
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getResponse() == null) ? 0 : getResponse().hashCode());
        hashCode = prime * hashCode + ((getComments() == null) ? 0 : getComments().hashCode());
        hashCode = prime * hashCode + ((getEvidenceSources() == null) ? 0 : getEvidenceSources().hashCode());
        hashCode = prime * hashCode + ((getEvidenceCount() == null) ? 0 : getEvidenceCount().hashCode());
        hashCode = prime * hashCode + ((getAssessmentReportEvidenceCount() == null) ? 0 : getAssessmentReportEvidenceCount().hashCode());
        return hashCode;
    }

    @Override
    public AssessmentControl clone() {
        try {
            return (AssessmentControl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.auditmanager.model.transform.AssessmentControlMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
