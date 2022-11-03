/*
 * Copyright 2017-2022 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.connectcases.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connectcases-2022-10-03/BatchGetField" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetFieldResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of field errors.
     * </p>
     */
    private java.util.List<FieldError> errors;
    /**
     * <p>
     * A list of detailed field information.
     * </p>
     */
    private java.util.List<GetFieldResponse> fields;

    /**
     * <p>
     * A list of field errors.
     * </p>
     * 
     * @return A list of field errors.
     */

    public java.util.List<FieldError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of field errors.
     * </p>
     * 
     * @param errors
     *        A list of field errors.
     */

    public void setErrors(java.util.Collection<FieldError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<FieldError>(errors);
    }

    /**
     * <p>
     * A list of field errors.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of field errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFieldResult withErrors(FieldError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<FieldError>(errors.length));
        }
        for (FieldError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of field errors.
     * </p>
     * 
     * @param errors
     *        A list of field errors.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFieldResult withErrors(java.util.Collection<FieldError> errors) {
        setErrors(errors);
        return this;
    }

    /**
     * <p>
     * A list of detailed field information.
     * </p>
     * 
     * @return A list of detailed field information.
     */

    public java.util.List<GetFieldResponse> getFields() {
        return fields;
    }

    /**
     * <p>
     * A list of detailed field information.
     * </p>
     * 
     * @param fields
     *        A list of detailed field information.
     */

    public void setFields(java.util.Collection<GetFieldResponse> fields) {
        if (fields == null) {
            this.fields = null;
            return;
        }

        this.fields = new java.util.ArrayList<GetFieldResponse>(fields);
    }

    /**
     * <p>
     * A list of detailed field information.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFields(java.util.Collection)} or {@link #withFields(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param fields
     *        A list of detailed field information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFieldResult withFields(GetFieldResponse... fields) {
        if (this.fields == null) {
            setFields(new java.util.ArrayList<GetFieldResponse>(fields.length));
        }
        for (GetFieldResponse ele : fields) {
            this.fields.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of detailed field information.
     * </p>
     * 
     * @param fields
     *        A list of detailed field information.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetFieldResult withFields(java.util.Collection<GetFieldResponse> fields) {
        setFields(fields);
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
            sb.append("Errors: ").append(getErrors()).append(",");
        if (getFields() != null)
            sb.append("Fields: ").append(getFields());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchGetFieldResult == false)
            return false;
        BatchGetFieldResult other = (BatchGetFieldResult) obj;
        if (other.getErrors() == null ^ this.getErrors() == null)
            return false;
        if (other.getErrors() != null && other.getErrors().equals(this.getErrors()) == false)
            return false;
        if (other.getFields() == null ^ this.getFields() == null)
            return false;
        if (other.getFields() != null && other.getFields().equals(this.getFields()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        hashCode = prime * hashCode + ((getFields() == null) ? 0 : getFields().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetFieldResult clone() {
        try {
            return (BatchGetFieldResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
