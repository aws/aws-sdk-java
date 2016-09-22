/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Defines a validation error. Validation errors prevent pipeline activation. The set of validation errors that can be
 * returned are defined by AWS Data Pipeline.
 * </p>
 */
public class ValidationError implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the object that contains the validation error.
     * </p>
     */
    private String id;
    /**
     * <p>
     * A description of the validation error.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> errors;

    /**
     * <p>
     * The identifier of the object that contains the validation error.
     * </p>
     * 
     * @param id
     *        The identifier of the object that contains the validation error.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier of the object that contains the validation error.
     * </p>
     * 
     * @return The identifier of the object that contains the validation error.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier of the object that contains the validation error.
     * </p>
     * 
     * @param id
     *        The identifier of the object that contains the validation error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationError withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * A description of the validation error.
     * </p>
     * 
     * @return A description of the validation error.
     */

    public java.util.List<String> getErrors() {
        if (errors == null) {
            errors = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return errors;
    }

    /**
     * <p>
     * A description of the validation error.
     * </p>
     * 
     * @param errors
     *        A description of the validation error.
     */

    public void setErrors(java.util.Collection<String> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new com.amazonaws.internal.SdkInternalList<String>(errors);
    }

    /**
     * <p>
     * A description of the validation error.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A description of the validation error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationError withErrors(String... errors) {
        if (this.errors == null) {
            setErrors(new com.amazonaws.internal.SdkInternalList<String>(errors.length));
        }
        for (String ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A description of the validation error.
     * </p>
     * 
     * @param errors
     *        A description of the validation error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ValidationError withErrors(java.util.Collection<String> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getErrors() != null)
            sb.append("Errors: " + getErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ValidationError == false)
            return false;
        ValidationError other = (ValidationError) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public ValidationError clone() {
        try {
            return (ValidationError) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
