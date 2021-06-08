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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchImportEvidenceToAssessmentControl"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchImportEvidenceToAssessmentControlRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the specified assessment.
     * </p>
     */
    private String assessmentId;
    /**
     * <p>
     * The identifier for the specified control set.
     * </p>
     */
    private String controlSetId;
    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     */
    private String controlId;
    /**
     * <p>
     * The list of manual evidence objects.
     * </p>
     */
    private java.util.List<ManualEvidence> manualEvidence;

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

    public BatchImportEvidenceToAssessmentControlRequest withAssessmentId(String assessmentId) {
        setAssessmentId(assessmentId);
        return this;
    }

    /**
     * <p>
     * The identifier for the specified control set.
     * </p>
     * 
     * @param controlSetId
     *        The identifier for the specified control set.
     */

    public void setControlSetId(String controlSetId) {
        this.controlSetId = controlSetId;
    }

    /**
     * <p>
     * The identifier for the specified control set.
     * </p>
     * 
     * @return The identifier for the specified control set.
     */

    public String getControlSetId() {
        return this.controlSetId;
    }

    /**
     * <p>
     * The identifier for the specified control set.
     * </p>
     * 
     * @param controlSetId
     *        The identifier for the specified control set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImportEvidenceToAssessmentControlRequest withControlSetId(String controlSetId) {
        setControlSetId(controlSetId);
        return this;
    }

    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     * 
     * @param controlId
     *        The identifier for the specified control.
     */

    public void setControlId(String controlId) {
        this.controlId = controlId;
    }

    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     * 
     * @return The identifier for the specified control.
     */

    public String getControlId() {
        return this.controlId;
    }

    /**
     * <p>
     * The identifier for the specified control.
     * </p>
     * 
     * @param controlId
     *        The identifier for the specified control.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImportEvidenceToAssessmentControlRequest withControlId(String controlId) {
        setControlId(controlId);
        return this;
    }

    /**
     * <p>
     * The list of manual evidence objects.
     * </p>
     * 
     * @return The list of manual evidence objects.
     */

    public java.util.List<ManualEvidence> getManualEvidence() {
        return manualEvidence;
    }

    /**
     * <p>
     * The list of manual evidence objects.
     * </p>
     * 
     * @param manualEvidence
     *        The list of manual evidence objects.
     */

    public void setManualEvidence(java.util.Collection<ManualEvidence> manualEvidence) {
        if (manualEvidence == null) {
            this.manualEvidence = null;
            return;
        }

        this.manualEvidence = new java.util.ArrayList<ManualEvidence>(manualEvidence);
    }

    /**
     * <p>
     * The list of manual evidence objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setManualEvidence(java.util.Collection)} or {@link #withManualEvidence(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param manualEvidence
     *        The list of manual evidence objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImportEvidenceToAssessmentControlRequest withManualEvidence(ManualEvidence... manualEvidence) {
        if (this.manualEvidence == null) {
            setManualEvidence(new java.util.ArrayList<ManualEvidence>(manualEvidence.length));
        }
        for (ManualEvidence ele : manualEvidence) {
            this.manualEvidence.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of manual evidence objects.
     * </p>
     * 
     * @param manualEvidence
     *        The list of manual evidence objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchImportEvidenceToAssessmentControlRequest withManualEvidence(java.util.Collection<ManualEvidence> manualEvidence) {
        setManualEvidence(manualEvidence);
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
        if (getControlId() != null)
            sb.append("ControlId: ").append(getControlId()).append(",");
        if (getManualEvidence() != null)
            sb.append("ManualEvidence: ").append(getManualEvidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchImportEvidenceToAssessmentControlRequest == false)
            return false;
        BatchImportEvidenceToAssessmentControlRequest other = (BatchImportEvidenceToAssessmentControlRequest) obj;
        if (other.getAssessmentId() == null ^ this.getAssessmentId() == null)
            return false;
        if (other.getAssessmentId() != null && other.getAssessmentId().equals(this.getAssessmentId()) == false)
            return false;
        if (other.getControlSetId() == null ^ this.getControlSetId() == null)
            return false;
        if (other.getControlSetId() != null && other.getControlSetId().equals(this.getControlSetId()) == false)
            return false;
        if (other.getControlId() == null ^ this.getControlId() == null)
            return false;
        if (other.getControlId() != null && other.getControlId().equals(this.getControlId()) == false)
            return false;
        if (other.getManualEvidence() == null ^ this.getManualEvidence() == null)
            return false;
        if (other.getManualEvidence() != null && other.getManualEvidence().equals(this.getManualEvidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssessmentId() == null) ? 0 : getAssessmentId().hashCode());
        hashCode = prime * hashCode + ((getControlSetId() == null) ? 0 : getControlSetId().hashCode());
        hashCode = prime * hashCode + ((getControlId() == null) ? 0 : getControlId().hashCode());
        hashCode = prime * hashCode + ((getManualEvidence() == null) ? 0 : getManualEvidence().hashCode());
        return hashCode;
    }

    @Override
    public BatchImportEvidenceToAssessmentControlRequest clone() {
        return (BatchImportEvidenceToAssessmentControlRequest) super.clone();
    }

}
