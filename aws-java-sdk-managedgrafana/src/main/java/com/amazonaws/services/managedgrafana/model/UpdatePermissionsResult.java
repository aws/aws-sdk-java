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
package com.amazonaws.services.managedgrafana.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/grafana-2020-08-18/UpdatePermissions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdatePermissionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An array of structures that contain the errors from the operation, if any.
     * </p>
     */
    private java.util.List<UpdateError> errors;

    /**
     * <p>
     * An array of structures that contain the errors from the operation, if any.
     * </p>
     * 
     * @return An array of structures that contain the errors from the operation, if any.
     */

    public java.util.List<UpdateError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * An array of structures that contain the errors from the operation, if any.
     * </p>
     * 
     * @param errors
     *        An array of structures that contain the errors from the operation, if any.
     */

    public void setErrors(java.util.Collection<UpdateError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<UpdateError>(errors);
    }

    /**
     * <p>
     * An array of structures that contain the errors from the operation, if any.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        An array of structures that contain the errors from the operation, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePermissionsResult withErrors(UpdateError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<UpdateError>(errors.length));
        }
        for (UpdateError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of structures that contain the errors from the operation, if any.
     * </p>
     * 
     * @param errors
     *        An array of structures that contain the errors from the operation, if any.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdatePermissionsResult withErrors(java.util.Collection<UpdateError> errors) {
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

        if (obj instanceof UpdatePermissionsResult == false)
            return false;
        UpdatePermissionsResult other = (UpdatePermissionsResult) obj;
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
    public UpdatePermissionsResult clone() {
        try {
            return (UpdatePermissionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
