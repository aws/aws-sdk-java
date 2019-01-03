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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/BatchDeleteTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteTableResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of errors encountered in attempting to delete the specified tables.
     * </p>
     */
    private java.util.List<TableError> errors;

    /**
     * <p>
     * A list of errors encountered in attempting to delete the specified tables.
     * </p>
     * 
     * @return A list of errors encountered in attempting to delete the specified tables.
     */

    public java.util.List<TableError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * A list of errors encountered in attempting to delete the specified tables.
     * </p>
     * 
     * @param errors
     *        A list of errors encountered in attempting to delete the specified tables.
     */

    public void setErrors(java.util.Collection<TableError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<TableError>(errors);
    }

    /**
     * <p>
     * A list of errors encountered in attempting to delete the specified tables.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        A list of errors encountered in attempting to delete the specified tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableResult withErrors(TableError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<TableError>(errors.length));
        }
        for (TableError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of errors encountered in attempting to delete the specified tables.
     * </p>
     * 
     * @param errors
     *        A list of errors encountered in attempting to delete the specified tables.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteTableResult withErrors(java.util.Collection<TableError> errors) {
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

        if (obj instanceof BatchDeleteTableResult == false)
            return false;
        BatchDeleteTableResult other = (BatchDeleteTableResult) obj;
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
    public BatchDeleteTableResult clone() {
        try {
            return (BatchDeleteTableResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
