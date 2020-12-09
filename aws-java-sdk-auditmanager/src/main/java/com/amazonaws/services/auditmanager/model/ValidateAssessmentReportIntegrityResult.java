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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/auditmanager-2017-07-25/ValidateAssessmentReportIntegrity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateAssessmentReportIntegrityResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * Specifies whether the signature key is valid.
     * </p>
     */
    private Boolean signatureValid;
    /**
     * <p>
     * The signature algorithm used to code sign the assessment report file.
     * </p>
     */
    private String signatureAlgorithm;
    /**
     * <p>
     * The date and time signature that specifies when the assessment report was created.
     * </p>
     */
    private String signatureDateTime;
    /**
     * <p>
     * The unique identifier for the validation signature key.
     * </p>
     */
    private String signatureKeyId;
    /**
     * <p>
     * Represents any errors that occurred when validating the assessment report.
     * </p>
     */
    private java.util.List<String> validationErrors;

    /**
     * <p>
     * Specifies whether the signature key is valid.
     * </p>
     * 
     * @param signatureValid
     *        Specifies whether the signature key is valid.
     */

    public void setSignatureValid(Boolean signatureValid) {
        this.signatureValid = signatureValid;
    }

    /**
     * <p>
     * Specifies whether the signature key is valid.
     * </p>
     * 
     * @return Specifies whether the signature key is valid.
     */

    public Boolean getSignatureValid() {
        return this.signatureValid;
    }

    /**
     * <p>
     * Specifies whether the signature key is valid.
     * </p>
     * 
     * @param signatureValid
     *        Specifies whether the signature key is valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateAssessmentReportIntegrityResult withSignatureValid(Boolean signatureValid) {
        setSignatureValid(signatureValid);
        return this;
    }

    /**
     * <p>
     * Specifies whether the signature key is valid.
     * </p>
     * 
     * @return Specifies whether the signature key is valid.
     */

    public Boolean isSignatureValid() {
        return this.signatureValid;
    }

    /**
     * <p>
     * The signature algorithm used to code sign the assessment report file.
     * </p>
     * 
     * @param signatureAlgorithm
     *        The signature algorithm used to code sign the assessment report file.
     */

    public void setSignatureAlgorithm(String signatureAlgorithm) {
        this.signatureAlgorithm = signatureAlgorithm;
    }

    /**
     * <p>
     * The signature algorithm used to code sign the assessment report file.
     * </p>
     * 
     * @return The signature algorithm used to code sign the assessment report file.
     */

    public String getSignatureAlgorithm() {
        return this.signatureAlgorithm;
    }

    /**
     * <p>
     * The signature algorithm used to code sign the assessment report file.
     * </p>
     * 
     * @param signatureAlgorithm
     *        The signature algorithm used to code sign the assessment report file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateAssessmentReportIntegrityResult withSignatureAlgorithm(String signatureAlgorithm) {
        setSignatureAlgorithm(signatureAlgorithm);
        return this;
    }

    /**
     * <p>
     * The date and time signature that specifies when the assessment report was created.
     * </p>
     * 
     * @param signatureDateTime
     *        The date and time signature that specifies when the assessment report was created.
     */

    public void setSignatureDateTime(String signatureDateTime) {
        this.signatureDateTime = signatureDateTime;
    }

    /**
     * <p>
     * The date and time signature that specifies when the assessment report was created.
     * </p>
     * 
     * @return The date and time signature that specifies when the assessment report was created.
     */

    public String getSignatureDateTime() {
        return this.signatureDateTime;
    }

    /**
     * <p>
     * The date and time signature that specifies when the assessment report was created.
     * </p>
     * 
     * @param signatureDateTime
     *        The date and time signature that specifies when the assessment report was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateAssessmentReportIntegrityResult withSignatureDateTime(String signatureDateTime) {
        setSignatureDateTime(signatureDateTime);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the validation signature key.
     * </p>
     * 
     * @param signatureKeyId
     *        The unique identifier for the validation signature key.
     */

    public void setSignatureKeyId(String signatureKeyId) {
        this.signatureKeyId = signatureKeyId;
    }

    /**
     * <p>
     * The unique identifier for the validation signature key.
     * </p>
     * 
     * @return The unique identifier for the validation signature key.
     */

    public String getSignatureKeyId() {
        return this.signatureKeyId;
    }

    /**
     * <p>
     * The unique identifier for the validation signature key.
     * </p>
     * 
     * @param signatureKeyId
     *        The unique identifier for the validation signature key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateAssessmentReportIntegrityResult withSignatureKeyId(String signatureKeyId) {
        setSignatureKeyId(signatureKeyId);
        return this;
    }

    /**
     * <p>
     * Represents any errors that occurred when validating the assessment report.
     * </p>
     * 
     * @return Represents any errors that occurred when validating the assessment report.
     */

    public java.util.List<String> getValidationErrors() {
        return validationErrors;
    }

    /**
     * <p>
     * Represents any errors that occurred when validating the assessment report.
     * </p>
     * 
     * @param validationErrors
     *        Represents any errors that occurred when validating the assessment report.
     */

    public void setValidationErrors(java.util.Collection<String> validationErrors) {
        if (validationErrors == null) {
            this.validationErrors = null;
            return;
        }

        this.validationErrors = new java.util.ArrayList<String>(validationErrors);
    }

    /**
     * <p>
     * Represents any errors that occurred when validating the assessment report.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationErrors(java.util.Collection)} or {@link #withValidationErrors(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param validationErrors
     *        Represents any errors that occurred when validating the assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateAssessmentReportIntegrityResult withValidationErrors(String... validationErrors) {
        if (this.validationErrors == null) {
            setValidationErrors(new java.util.ArrayList<String>(validationErrors.length));
        }
        for (String ele : validationErrors) {
            this.validationErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Represents any errors that occurred when validating the assessment report.
     * </p>
     * 
     * @param validationErrors
     *        Represents any errors that occurred when validating the assessment report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateAssessmentReportIntegrityResult withValidationErrors(java.util.Collection<String> validationErrors) {
        setValidationErrors(validationErrors);
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
        if (getSignatureValid() != null)
            sb.append("SignatureValid: ").append(getSignatureValid()).append(",");
        if (getSignatureAlgorithm() != null)
            sb.append("SignatureAlgorithm: ").append(getSignatureAlgorithm()).append(",");
        if (getSignatureDateTime() != null)
            sb.append("SignatureDateTime: ").append(getSignatureDateTime()).append(",");
        if (getSignatureKeyId() != null)
            sb.append("SignatureKeyId: ").append(getSignatureKeyId()).append(",");
        if (getValidationErrors() != null)
            sb.append("ValidationErrors: ").append(getValidationErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidateAssessmentReportIntegrityResult == false)
            return false;
        ValidateAssessmentReportIntegrityResult other = (ValidateAssessmentReportIntegrityResult) obj;
        if (other.getSignatureValid() == null ^ this.getSignatureValid() == null)
            return false;
        if (other.getSignatureValid() != null && other.getSignatureValid().equals(this.getSignatureValid()) == false)
            return false;
        if (other.getSignatureAlgorithm() == null ^ this.getSignatureAlgorithm() == null)
            return false;
        if (other.getSignatureAlgorithm() != null && other.getSignatureAlgorithm().equals(this.getSignatureAlgorithm()) == false)
            return false;
        if (other.getSignatureDateTime() == null ^ this.getSignatureDateTime() == null)
            return false;
        if (other.getSignatureDateTime() != null && other.getSignatureDateTime().equals(this.getSignatureDateTime()) == false)
            return false;
        if (other.getSignatureKeyId() == null ^ this.getSignatureKeyId() == null)
            return false;
        if (other.getSignatureKeyId() != null && other.getSignatureKeyId().equals(this.getSignatureKeyId()) == false)
            return false;
        if (other.getValidationErrors() == null ^ this.getValidationErrors() == null)
            return false;
        if (other.getValidationErrors() != null && other.getValidationErrors().equals(this.getValidationErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSignatureValid() == null) ? 0 : getSignatureValid().hashCode());
        hashCode = prime * hashCode + ((getSignatureAlgorithm() == null) ? 0 : getSignatureAlgorithm().hashCode());
        hashCode = prime * hashCode + ((getSignatureDateTime() == null) ? 0 : getSignatureDateTime().hashCode());
        hashCode = prime * hashCode + ((getSignatureKeyId() == null) ? 0 : getSignatureKeyId().hashCode());
        hashCode = prime * hashCode + ((getValidationErrors() == null) ? 0 : getValidationErrors().hashCode());
        return hashCode;
    }

    @Override
    public ValidateAssessmentReportIntegrityResult clone() {
        try {
            return (ValidateAssessmentReportIntegrityResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
