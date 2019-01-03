/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the output of ValidatePipelineDefinition.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ValidatePipelineDefinition"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidatePipelineDefinitionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Any validation errors that were found.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ValidationError> validationErrors;
    /**
     * <p>
     * Any validation warnings that were found.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ValidationWarning> validationWarnings;
    /**
     * <p>
     * Indicates whether there were validation errors.
     * </p>
     */
    private Boolean errored;

    /**
     * <p>
     * Any validation errors that were found.
     * </p>
     * 
     * @return Any validation errors that were found.
     */

    public java.util.List<ValidationError> getValidationErrors() {
        if (validationErrors == null) {
            validationErrors = new com.amazonaws.internal.SdkInternalList<ValidationError>();
        }
        return validationErrors;
    }

    /**
     * <p>
     * Any validation errors that were found.
     * </p>
     * 
     * @param validationErrors
     *        Any validation errors that were found.
     */

    public void setValidationErrors(java.util.Collection<ValidationError> validationErrors) {
        if (validationErrors == null) {
            this.validationErrors = null;
            return;
        }

        this.validationErrors = new com.amazonaws.internal.SdkInternalList<ValidationError>(validationErrors);
    }

    /**
     * <p>
     * Any validation errors that were found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationErrors(java.util.Collection)} or {@link #withValidationErrors(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param validationErrors
     *        Any validation errors that were found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePipelineDefinitionResult withValidationErrors(ValidationError... validationErrors) {
        if (this.validationErrors == null) {
            setValidationErrors(new com.amazonaws.internal.SdkInternalList<ValidationError>(validationErrors.length));
        }
        for (ValidationError ele : validationErrors) {
            this.validationErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any validation errors that were found.
     * </p>
     * 
     * @param validationErrors
     *        Any validation errors that were found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePipelineDefinitionResult withValidationErrors(java.util.Collection<ValidationError> validationErrors) {
        setValidationErrors(validationErrors);
        return this;
    }

    /**
     * <p>
     * Any validation warnings that were found.
     * </p>
     * 
     * @return Any validation warnings that were found.
     */

    public java.util.List<ValidationWarning> getValidationWarnings() {
        if (validationWarnings == null) {
            validationWarnings = new com.amazonaws.internal.SdkInternalList<ValidationWarning>();
        }
        return validationWarnings;
    }

    /**
     * <p>
     * Any validation warnings that were found.
     * </p>
     * 
     * @param validationWarnings
     *        Any validation warnings that were found.
     */

    public void setValidationWarnings(java.util.Collection<ValidationWarning> validationWarnings) {
        if (validationWarnings == null) {
            this.validationWarnings = null;
            return;
        }

        this.validationWarnings = new com.amazonaws.internal.SdkInternalList<ValidationWarning>(validationWarnings);
    }

    /**
     * <p>
     * Any validation warnings that were found.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationWarnings(java.util.Collection)} or {@link #withValidationWarnings(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param validationWarnings
     *        Any validation warnings that were found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePipelineDefinitionResult withValidationWarnings(ValidationWarning... validationWarnings) {
        if (this.validationWarnings == null) {
            setValidationWarnings(new com.amazonaws.internal.SdkInternalList<ValidationWarning>(validationWarnings.length));
        }
        for (ValidationWarning ele : validationWarnings) {
            this.validationWarnings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any validation warnings that were found.
     * </p>
     * 
     * @param validationWarnings
     *        Any validation warnings that were found.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePipelineDefinitionResult withValidationWarnings(java.util.Collection<ValidationWarning> validationWarnings) {
        setValidationWarnings(validationWarnings);
        return this;
    }

    /**
     * <p>
     * Indicates whether there were validation errors.
     * </p>
     * 
     * @param errored
     *        Indicates whether there were validation errors.
     */

    public void setErrored(Boolean errored) {
        this.errored = errored;
    }

    /**
     * <p>
     * Indicates whether there were validation errors.
     * </p>
     * 
     * @return Indicates whether there were validation errors.
     */

    public Boolean getErrored() {
        return this.errored;
    }

    /**
     * <p>
     * Indicates whether there were validation errors.
     * </p>
     * 
     * @param errored
     *        Indicates whether there were validation errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePipelineDefinitionResult withErrored(Boolean errored) {
        setErrored(errored);
        return this;
    }

    /**
     * <p>
     * Indicates whether there were validation errors.
     * </p>
     * 
     * @return Indicates whether there were validation errors.
     */

    public Boolean isErrored() {
        return this.errored;
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
        if (getValidationErrors() != null)
            sb.append("ValidationErrors: ").append(getValidationErrors()).append(",");
        if (getValidationWarnings() != null)
            sb.append("ValidationWarnings: ").append(getValidationWarnings()).append(",");
        if (getErrored() != null)
            sb.append("Errored: ").append(getErrored());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidatePipelineDefinitionResult == false)
            return false;
        ValidatePipelineDefinitionResult other = (ValidatePipelineDefinitionResult) obj;
        if (other.getValidationErrors() == null ^ this.getValidationErrors() == null)
            return false;
        if (other.getValidationErrors() != null && other.getValidationErrors().equals(this.getValidationErrors()) == false)
            return false;
        if (other.getValidationWarnings() == null ^ this.getValidationWarnings() == null)
            return false;
        if (other.getValidationWarnings() != null && other.getValidationWarnings().equals(this.getValidationWarnings()) == false)
            return false;
        if (other.getErrored() == null ^ this.getErrored() == null)
            return false;
        if (other.getErrored() != null && other.getErrored().equals(this.getErrored()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getValidationErrors() == null) ? 0 : getValidationErrors().hashCode());
        hashCode = prime * hashCode + ((getValidationWarnings() == null) ? 0 : getValidationWarnings().hashCode());
        hashCode = prime * hashCode + ((getErrored() == null) ? 0 : getErrored().hashCode());
        return hashCode;
    }

    @Override
    public ValidatePipelineDefinitionResult clone() {
        try {
            return (ValidatePipelineDefinitionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
