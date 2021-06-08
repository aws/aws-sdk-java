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
package com.amazonaws.services.secretsmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/secretsmanager-2017-10-17/ValidateResourcePolicy"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidateResourcePolicyResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns a message stating that your Reource Policy passed validation.
     * </p>
     */
    private Boolean policyValidationPassed;
    /**
     * <p>
     * Returns an error message if your policy doesn't pass validatation.
     * </p>
     */
    private java.util.List<ValidationErrorsEntry> validationErrors;

    /**
     * <p>
     * Returns a message stating that your Reource Policy passed validation.
     * </p>
     * 
     * @param policyValidationPassed
     *        Returns a message stating that your Reource Policy passed validation.
     */

    public void setPolicyValidationPassed(Boolean policyValidationPassed) {
        this.policyValidationPassed = policyValidationPassed;
    }

    /**
     * <p>
     * Returns a message stating that your Reource Policy passed validation.
     * </p>
     * 
     * @return Returns a message stating that your Reource Policy passed validation.
     */

    public Boolean getPolicyValidationPassed() {
        return this.policyValidationPassed;
    }

    /**
     * <p>
     * Returns a message stating that your Reource Policy passed validation.
     * </p>
     * 
     * @param policyValidationPassed
     *        Returns a message stating that your Reource Policy passed validation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateResourcePolicyResult withPolicyValidationPassed(Boolean policyValidationPassed) {
        setPolicyValidationPassed(policyValidationPassed);
        return this;
    }

    /**
     * <p>
     * Returns a message stating that your Reource Policy passed validation.
     * </p>
     * 
     * @return Returns a message stating that your Reource Policy passed validation.
     */

    public Boolean isPolicyValidationPassed() {
        return this.policyValidationPassed;
    }

    /**
     * <p>
     * Returns an error message if your policy doesn't pass validatation.
     * </p>
     * 
     * @return Returns an error message if your policy doesn't pass validatation.
     */

    public java.util.List<ValidationErrorsEntry> getValidationErrors() {
        return validationErrors;
    }

    /**
     * <p>
     * Returns an error message if your policy doesn't pass validatation.
     * </p>
     * 
     * @param validationErrors
     *        Returns an error message if your policy doesn't pass validatation.
     */

    public void setValidationErrors(java.util.Collection<ValidationErrorsEntry> validationErrors) {
        if (validationErrors == null) {
            this.validationErrors = null;
            return;
        }

        this.validationErrors = new java.util.ArrayList<ValidationErrorsEntry>(validationErrors);
    }

    /**
     * <p>
     * Returns an error message if your policy doesn't pass validatation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setValidationErrors(java.util.Collection)} or {@link #withValidationErrors(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param validationErrors
     *        Returns an error message if your policy doesn't pass validatation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateResourcePolicyResult withValidationErrors(ValidationErrorsEntry... validationErrors) {
        if (this.validationErrors == null) {
            setValidationErrors(new java.util.ArrayList<ValidationErrorsEntry>(validationErrors.length));
        }
        for (ValidationErrorsEntry ele : validationErrors) {
            this.validationErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Returns an error message if your policy doesn't pass validatation.
     * </p>
     * 
     * @param validationErrors
     *        Returns an error message if your policy doesn't pass validatation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidateResourcePolicyResult withValidationErrors(java.util.Collection<ValidationErrorsEntry> validationErrors) {
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
        if (getPolicyValidationPassed() != null)
            sb.append("PolicyValidationPassed: ").append(getPolicyValidationPassed()).append(",");
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

        if (obj instanceof ValidateResourcePolicyResult == false)
            return false;
        ValidateResourcePolicyResult other = (ValidateResourcePolicyResult) obj;
        if (other.getPolicyValidationPassed() == null ^ this.getPolicyValidationPassed() == null)
            return false;
        if (other.getPolicyValidationPassed() != null && other.getPolicyValidationPassed().equals(this.getPolicyValidationPassed()) == false)
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

        hashCode = prime * hashCode + ((getPolicyValidationPassed() == null) ? 0 : getPolicyValidationPassed().hashCode());
        hashCode = prime * hashCode + ((getValidationErrors() == null) ? 0 : getValidationErrors().hashCode());
        return hashCode;
    }

    @Override
    public ValidateResourcePolicyResult clone() {
        try {
            return (ValidateResourcePolicyResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
