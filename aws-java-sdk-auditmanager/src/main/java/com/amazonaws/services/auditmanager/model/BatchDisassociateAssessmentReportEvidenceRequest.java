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
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchDisassociateAssessmentReportEvidence"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateAssessmentReportEvidenceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     */
    private String assessmentId;
    /**
     * <p>
     * The identifier for the folder in which evidence is stored.
     * </p>
     */
    private String evidenceFolderId;
    /**
     * <p>
     * The list of evidence identifiers.
     * </p>
     */
    private java.util.List<String> evidenceIds;

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

    public BatchDisassociateAssessmentReportEvidenceRequest withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
        return this;
    }

    /**
     * <p>
     * The identifier for the folder in which evidence is stored.
     * </p>
     * 
     * @param evidenceFolderId
     *        The identifier for the folder in which evidence is stored.
     */

    public void setEvidenceFolderId(String evidenceFolderId) {
        this.evidenceFolderId = evidenceFolderId;
    }

    /**
     * <p>
     * The identifier for the folder in which evidence is stored.
     * </p>
     * 
     * @return The identifier for the folder in which evidence is stored.
     */

    public String getEvidenceFolderId() {
        return this.evidenceFolderId;
    }

    /**
     * <p>
     * The identifier for the folder in which evidence is stored.
     * </p>
     * 
     * @param evidenceFolderId
     *        The identifier for the folder in which evidence is stored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateAssessmentReportEvidenceRequest withEvidenceFolderId(String evidenceFolderId) {
        setEvidenceFolderId(evidenceFolderId);
        return this;
    }

    /**
     * <p>
     * The list of evidence identifiers.
     * </p>
     * 
     * @return The list of evidence identifiers.
     */

    public java.util.List<String> getEvidenceIds() {
        return evidenceIds;
    }

    /**
     * <p>
     * The list of evidence identifiers.
     * </p>
     * 
     * @param evidenceIds
     *        The list of evidence identifiers.
     */

    public void setEvidenceIds(java.util.Collection<String> evidenceIds) {
        if (evidenceIds == null) {
            this.evidenceIds = null;
            return;
        }

        this.evidenceIds = new java.util.ArrayList<String>(evidenceIds);
    }

    /**
     * <p>
     * The list of evidence identifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvidenceIds(java.util.Collection)} or {@link #withEvidenceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param evidenceIds
     *        The list of evidence identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateAssessmentReportEvidenceRequest withEvidenceIds(String... evidenceIds) {
        if (this.evidenceIds == null) {
            setEvidenceIds(new java.util.ArrayList<String>(evidenceIds.length));
        }
        for (String ele : evidenceIds) {
            this.evidenceIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of evidence identifiers.
     * </p>
     * 
     * @param evidenceIds
     *        The list of evidence identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateAssessmentReportEvidenceRequest withEvidenceIds(java.util.Collection<String> evidenceIds) {
        setEvidenceIds(evidenceIds);
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
        if (getEvidenceFolderId() != null)
            sb.append("EvidenceFolderId: ").append(getEvidenceFolderId()).append(",");
        if (getEvidenceIds() != null)
            sb.append("EvidenceIds: ").append(getEvidenceIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisassociateAssessmentReportEvidenceRequest == false)
            return false;
        BatchDisassociateAssessmentReportEvidenceRequest other = (BatchDisassociateAssessmentReportEvidenceRequest) obj;
        if (other.getAssessmentId() == null ^ this.getAssessmentId() == null)
            return false;
        if (other.getAssessmentId() != null && other.getAssessmentId().equals(this.getAssessmentId()) == false)
            return false;
        if (other.getEvidenceFolderId() == null ^ this.getEvidenceFolderId() == null)
            return false;
        if (other.getEvidenceFolderId() != null && other.getEvidenceFolderId().equals(this.getEvidenceFolderId()) == false)
            return false;
        if (other.getEvidenceIds() == null ^ this.getEvidenceIds() == null)
            return false;
        if (other.getEvidenceIds() != null && other.getEvidenceIds().equals(this.getEvidenceIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        hashCode = prime * hashCode + ((getEvidenceFolderId() == null) ? 0 : getEvidenceFolderId().hashCode());
        hashCode = prime * hashCode + ((getEvidenceIds() == null) ? 0 : getEvidenceIds().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisassociateAssessmentReportEvidenceRequest clone() {
        return (BatchDisassociateAssessmentReportEvidenceRequest) super.clone();
    }

}
