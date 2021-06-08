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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The error codes and error messages that are returned for the parameters or parameter combinations that are not valid
 * when a new launch template or new version of a launch template is created.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ValidationWarning" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ValidationWarning implements Serializable, Cloneable {

    /**
     * <p>
     * The error codes and error messages.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ValidationError> errors;

    /**
     * <p>
     * The error codes and error messages.
     * </p>
     * 
     * @return The error codes and error messages.
     */

    public java.util.List<ValidationError> getErrors() {
        if (errors == null) {
            errors = new com.amazonaws.internal.SdkInternalList<ValidationError>();
        }
        return errors;
    }

    /**
     * <p>
     * The error codes and error messages.
     * </p>
     * 
     * @param errors
     *        The error codes and error messages.
     */

    public void setErrors(java.util.Collection<ValidationError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new com.amazonaws.internal.SdkInternalList<ValidationError>(errors);
    }

    /**
     * <p>
     * The error codes and error messages.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        The error codes and error messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationWarning withErrors(ValidationError... errors) {
        if (this.errors == null) {
            setErrors(new com.amazonaws.internal.SdkInternalList<ValidationError>(errors.length));
        }
        for (ValidationError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The error codes and error messages.
     * </p>
     * 
     * @param errors
     *        The error codes and error messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationWarning withErrors(java.util.Collection<ValidationError> errors) {
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

        if (obj instanceof ValidationWarning == false)
            return false;
        ValidationWarning other = (ValidationWarning) obj;
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

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public ValidationWarning clone() {
        try {
            return (ValidationWarning) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
