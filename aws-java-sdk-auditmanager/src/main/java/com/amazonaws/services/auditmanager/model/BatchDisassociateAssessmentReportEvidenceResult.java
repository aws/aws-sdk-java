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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/BatchDisassociateAssessmentReportEvidence"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDisassociateAssessmentReportEvidenceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements
        Serializable, Cloneable {

    /**
     * <p>
     * The identifier for the evidence.
     * </p>
     */
    private java.util.List<String> evidenceIds;
    /**
     * <p>
     * A list of errors returned by the <code>BatchDisassociateAssessmentReportEvidence</code> API.
     * </p>
     */
    private java.util.List<AssessmentReportEvidenceError> errors;

    /**
     * <p>
     * The identifier for the evidence.
     * </p>
     * 
     * @return The identifier for the evidence.
     */

    public java.util.List<String> getEvidenceIds() {
        return evidenceIds;
    }

    /**
     * <p>
     * The identifier for the evidence.
     * </p>
     * 
     * @param evidenceIds
     *        The identifier for the evidence.
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
     * The identifier for the evidence.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvidenceIds(java.util.Collection)} or {@link #withEvidenceIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param evidenceIds
     *        The identifier for the evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateAssessmentReportEvidenceResult withEvidenceIds(String... evidenceIds) {
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
     * The identifier for the evidence.
     * </p>
     * 
     * @param evidenceIds
     *        The identifier for the evidence.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateAssessmentReportEvidenceResult withEvidenceIds(java.util.Collection<String> evidenceIds) {
        setEvidenceIds(evidenceIds);
        return this;
    }

    /**
     * <p>
     * A list of errors returned by the <code>BatchDisassociateAssessmentReportEvidence</code> API.
     * </p>
     * 
     * @return A list of errors returned by the <code>BatchDisassociateAssessmentReportEvidence</code> API.
     */

    public java.util.List<AssessmentReportEvidenceError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of errors returned by the <code>BatchDisassociateAssessmentReportEvidence</code> API.
     * </p>
     * 
     * @param errors
     *        A list of errors returned by the <code>BatchDisassociateAssessmentReportEvidence</code> API.
     */

    public void setErrors(java.util.Collection<AssessmentReportEvidenceError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<AssessmentReportEvidenceError>(errors);
    }

    /**
     * <p>
     * A list of errors returned by the <code>BatchDisassociateAssessmentReportEvidence</code> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of errors returned by the <code>BatchDisassociateAssessmentReportEvidence</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateAssessmentReportEvidenceResult withErrors(AssessmentReportEvidenceError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<AssessmentReportEvidenceError>(errors.length));
        }
        for (AssessmentReportEvidenceError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors returned by the <code>BatchDisassociateAssessmentReportEvidence</code> API.
     * </p>
     * 
     * @param errors
     *        A list of errors returned by the <code>BatchDisassociateAssessmentReportEvidence</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDisassociateAssessmentReportEvidenceResult withErrors(java.util.Collection<AssessmentReportEvidenceError> errors) {
        setErrors(errors);
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
        if (getEvidenceIds() != null)
            sb.append("EvidenceIds: ").append(getEvidenceIds()).append(",");
        if (getErrors() != null)
            sb.append("Errors: ").append(getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDisassociateAssessmentReportEvidenceResult == false)
            return false;
        BatchDisassociateAssessmentReportEvidenceResult other = (BatchDisassociateAssessmentReportEvidenceResult) obj;
        if (other.getEvidenceIds() == null ^ this.getEvidenceIds() == null)
            return false;
        if (other.getEvidenceIds() != null && other.getEvidenceIds().equals(this.getEvidenceIds()) == false)
            return false;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEvidenceIds() == null) ? 0 : getEvidenceIds().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchDisassociateAssessmentReportEvidenceResult clone() {
        try {
            return (BatchDisassociateAssessmentReportEvidenceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
