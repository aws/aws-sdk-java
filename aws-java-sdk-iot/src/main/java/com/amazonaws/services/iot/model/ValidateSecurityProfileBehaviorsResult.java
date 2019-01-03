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
package com.amazonaws.services.iot.model;

import java.io.Serializable;
import javax.annotation.Generated;

@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateSecurityProfileBehaviorsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * True if the behaviors were valid.
     * </p>
     */
    private Boolean valid;
    /**
     * <p>
     * The list of any errors found in the behaviors.
     * </p>
     */
    private java.util.List<ValidationError> validationErrors;

    /**
     * <p>
     * True if the behaviors were valid.
     * </p>
     * 
     * @param valid
     *        True if the behaviors were valid.
     */

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    /**
     * <p>
     * True if the behaviors were valid.
     * </p>
     * 
     * @return True if the behaviors were valid.
     */

    public Boolean getValid() {
        return this.valid;
    }

    /**
     * <p>
     * True if the behaviors were valid.
     * </p>
     * 
     * @param valid
     *        True if the behaviors were valid.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateSecurityProfileBehaviorsResult withValid(Boolean valid) {
        setValid(valid);
        return this;
    }

    /**
     * <p>
     * True if the behaviors were valid.
     * </p>
     * 
     * @return True if the behaviors were valid.
     */

    public Boolean isValid() {
        return this.valid;
    }

    /**
     * <p>
     * The list of any errors found in the behaviors.
     * </p>
     * 
     * @return The list of any errors found in the behaviors.
     */

    public java.util.List<ValidationError> getValidationErrors() {
        return validationErrors;
    }

    /**
     * <p>
     * The list of any errors found in the behaviors.
     * </p>
     * 
     * @param validationErrors
     *        The list of any errors found in the behaviors.
     */

    public void setValidationErrors(java.util.Collection<ValidationError> validationErrors) {
        if (validationErrors == null) {
            this.validationErrors = null;
            return;
        }

        this.validationErrors = new java.util.ArrayList<ValidationError>(validationErrors);
    }

    /**
     * <p>
     * The list of any errors found in the behaviors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationErrors(java.util.Collection)} or {@link #withValidationErrors(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param validationErrors
     *        The list of any errors found in the behaviors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateSecurityProfileBehaviorsResult withValidationErrors(ValidationError... validationErrors) {
        if (this.validationErrors == null) {
            setValidationErrors(new java.util.ArrayList<ValidationError>(validationErrors.length));
        }
        for (ValidationError ele : validationErrors) {
            this.validationErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of any errors found in the behaviors.
     * </p>
     * 
     * @param validationErrors
     *        The list of any errors found in the behaviors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateSecurityProfileBehaviorsResult withValidationErrors(java.util.Collection<ValidationError> validationErrors) {
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
        if (getValid() != null)
            sb.append("Valid: ").append(getValid()).append(",");
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

        if (obj instanceof ValidateSecurityProfileBehaviorsResult == false)
            return false;
        ValidateSecurityProfileBehaviorsResult other = (ValidateSecurityProfileBehaviorsResult) obj;
        if (other.getValid() == null ^ this.getValid() == null)
            return false;
        if (other.getValid() != null && other.getValid().equals(this.getValid()) == false)
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

        hashCode = prime * hashCode + ((getValid() == null) ? 0 : getValid().hashCode());
        hashCode = prime * hashCode + ((getValidationErrors() == null) ? 0 : getValidationErrors().hashCode());
        return hashCode;
    }

    @Override
    public ValidateSecurityProfileBehaviorsResult clone() {
        try {
            return (ValidateSecurityProfileBehaviorsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
