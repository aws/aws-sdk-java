/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/GetEvidence" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEvidenceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier for the assessment.
     * </p>
     */
    private String assessmentId;
    /**
     * <p>
     * The unique identifier for the control set.
     * </p>
     */
    private String controlSetId;
    /**
     * <p>
     * The unique identifier for the folder that the evidence is stored in.
     * </p>
     */
    private String evidenceFolderId;
    /**
     * <p>
     * The unique identifier for the evidence.
     * </p>
     */
    private String evidenceId;

    /**
     * <p>
     * The unique identifier for the assessment.
     * </p>
     * 
     * @param assessmentId
     *        The unique identifier for the assessment.
     */

    public void setAssessmentId(String assessmentId) {
        this.assessmentId = assessmentId;
    }

    /**
     * <p>
     * The unique identifier for the assessment.
     * </p>
     * 
     * @return The unique identifier for the assessment.
     */

    public String getAssessmentId() {
        return this.assessmentId;
    }

    /**
     * <p>
     * The unique identifier for the assessment.
     * </p>
     * 
     * @param assessmentId
     *        The unique identifier for the assessment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceRequest withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the control set.
     * </p>
     * 
     * @param controlSetId
     *        The unique identifier for the control set.
     */

    public void setControlSetId(String controlSetId) {
        this.controlSetId = controlSetId;
    }

    /**
     * <p>
     * The unique identifier for the control set.
     * </p>
     * 
     * @return The unique identifier for the control set.
     */

    public String getControlSetId() {
        return this.controlSetId;
    }

    /**
     * <p>
     * The unique identifier for the control set.
     * </p>
     * 
     * @param controlSetId
     *        The unique identifier for the control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceRequest withControlSetId(String controlSetId) {
        setControlSetId(controlSetId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the folder that the evidence is stored in.
     * </p>
     * 
     * @param evidenceFolderId
     *        The unique identifier for the folder that the evidence is stored in.
     */

    public void setEvidenceFolderId(String evidenceFolderId) {
        this.evidenceFolderId = evidenceFolderId;
    }

    /**
     * <p>
     * The unique identifier for the folder that the evidence is stored in.
     * </p>
     * 
     * @return The unique identifier for the folder that the evidence is stored in.
     */

    public String getEvidenceFolderId() {
        return this.evidenceFolderId;
    }

    /**
     * <p>
     * The unique identifier for the folder that the evidence is stored in.
     * </p>
     * 
     * @param evidenceFolderId
     *        The unique identifier for the folder that the evidence is stored in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceRequest withEvidenceFolderId(String evidenceFolderId) {
        setEvidenceFolderId(evidenceFolderId);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the evidence.
     * </p>
     * 
     * @param evidenceId
     *        The unique identifier for the evidence.
     */

    public void setEvidenceId(String evidenceId) {
        this.evidenceId = evidenceId;
    }

    /**
     * <p>
     * The unique identifier for the evidence.
     * </p>
     * 
     * @return The unique identifier for the evidence.
     */

    public String getEvidenceId() {
        return this.evidenceId;
    }

    /**
     * <p>
     * The unique identifier for the evidence.
     * </p>
     * 
     * @param evidenceId
     *        The unique identifier for the evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEvidenceRequest withEvidenceId(String evidenceId) {
        setEvidenceId(evidenceId);
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
        if (getControlSetId() != null)
            sb.append("ControlSetId: ").append(getControlSetId()).append(",");
        if (getEvidenceFolderId() != null)
            sb.append("EvidenceFolderId: ").append(getEvidenceFolderId()).append(",");
        if (getEvidenceId() != null)
            sb.append("EvidenceId: ").append(getEvidenceId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetEvidenceRequest == false)
            return false;
        GetEvidenceRequest other = (GetEvidenceRequest) obj;
        if (other.getAssessmentId() == null ^ this.getAssessmentId() == null)
            return false;
        if (other.getAssessmentId() != null && other.getAssessmentId().equals(this.getAssessmentId()) == false)
            return false;
        if (other.getControlSetId() == null ^ this.getControlSetId() == null)
            return false;
        if (other.getControlSetId() != null && other.getControlSetId().equals(this.getControlSetId()) == false)
            return false;
        if (other.getEvidenceFolderId() == null ^ this.getEvidenceFolderId() == null)
            return false;
        if (other.getEvidenceFolderId() != null && other.getEvidenceFolderId().equals(this.getEvidenceFolderId()) == false)
            return false;
        if (other.getEvidenceId() == null ^ this.getEvidenceId() == null)
            return false;
        if (other.getEvidenceId() != null && other.getEvidenceId().equals(this.getEvidenceId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        hashCode = prime * hashCode + ((getControlSetId() == null) ? 0 : getControlSetId().hashCode());
        hashCode = prime * hashCode + ((getEvidenceFolderId() == null) ? 0 : getEvidenceFolderId().hashCode());
        hashCode = prime * hashCode + ((getEvidenceId() == null) ? 0 : getEvidenceId().hashCode());
        return hashCode;
    }

    @Override
    public GetEvidenceRequest clone() {
        return (GetEvidenceRequest) super.clone();
    }

}
