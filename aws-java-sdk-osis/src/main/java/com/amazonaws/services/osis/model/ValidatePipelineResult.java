/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.osis.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/osis-2022-01-01/ValidatePipeline" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidatePipelineResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A boolean indicating whether or not the pipeline configuration is valid.
     * </p>
     */
    private Boolean isValid;
    /**
     * <p>
     * A list of errors if the configuration is invalid.
     * </p>
     */
    private java.util.List<ValidationMessage> errors;

    /**
     * <p>
     * A boolean indicating whether or not the pipeline configuration is valid.
     * </p>
     * 
     * @param isValid
     *        A boolean indicating whether or not the pipeline configuration is valid.
     */

    public void setIsValid(Boolean isValid) {
        this.isValid = isValid;
    }

    /**
     * <p>
     * A boolean indicating whether or not the pipeline configuration is valid.
     * </p>
     * 
     * @return A boolean indicating whether or not the pipeline configuration is valid.
     */

    public Boolean getIsValid() {
        return this.isValid;
    }

    /**
     * <p>
     * A boolean indicating whether or not the pipeline configuration is valid.
     * </p>
     * 
     * @param isValid
     *        A boolean indicating whether or not the pipeline configuration is valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePipelineResult withIsValid(Boolean isValid) {
        setIsValid(isValid);
        return this;
    }

    /**
     * <p>
     * A boolean indicating whether or not the pipeline configuration is valid.
     * </p>
     * 
     * @return A boolean indicating whether or not the pipeline configuration is valid.
     */

    public Boolean isValid() {
        return this.isValid;
    }

    /**
     * <p>
     * A list of errors if the configuration is invalid.
     * </p>
     * 
     * @return A list of errors if the configuration is invalid.
     */

    public java.util.List<ValidationMessage> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of errors if the configuration is invalid.
     * </p>
     * 
     * @param errors
     *        A list of errors if the configuration is invalid.
     */

    public void setErrors(java.util.Collection<ValidationMessage> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<ValidationMessage>(errors);
    }

    /**
     * <p>
     * A list of errors if the configuration is invalid.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of errors if the configuration is invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePipelineResult withErrors(ValidationMessage... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<ValidationMessage>(errors.length));
        }
        for (ValidationMessage ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors if the configuration is invalid.
     * </p>
     * 
     * @param errors
     *        A list of errors if the configuration is invalid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidatePipelineResult withErrors(java.util.Collection<ValidationMessage> errors) {
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
        if (getIsValid() != null)
            sb.append("IsValid: ").append(getIsValid()).append(",");
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

        if (obj instanceof ValidatePipelineResult == false)
            return false;
        ValidatePipelineResult other = (ValidatePipelineResult) obj;
        if (other.getIsValid() == null ^ this.getIsValid() == null)
            return false;
        if (other.getIsValid() != null && other.getIsValid().equals(this.getIsValid()) == false)
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

        hashCode = prime * hashCode + ((getIsValid() == null) ? 0 : getIsValid().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public ValidatePipelineResult clone() {
        try {
            return (ValidatePipelineResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
