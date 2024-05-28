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
package com.amazonaws.services.cleanrooms.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cleanrooms-2022-02-17/BatchGetSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchGetSchemaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The retrieved list of schemas.
     * </p>
     */
    private java.util.List<Schema> schemas;
    /**
     * <p>
     * Error reasons for schemas that could not be retrieved. One error is returned for every schema that could not be
     * retrieved.
     * </p>
     */
    private java.util.List<BatchGetSchemaError> errors;

    /**
     * <p>
     * The retrieved list of schemas.
     * </p>
     * 
     * @return The retrieved list of schemas.
     */

    public java.util.List<Schema> getSchemas() {
        return schemas;
    }

    /**
     * <p>
     * The retrieved list of schemas.
     * </p>
     * 
     * @param schemas
     *        The retrieved list of schemas.
     */

    public void setSchemas(java.util.Collection<Schema> schemas) {
        if (schemas == null) {
            this.schemas = null;
            return;
        }

        this.schemas = new java.util.ArrayList<Schema>(schemas);
    }

    /**
     * <p>
     * The retrieved list of schemas.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemas(java.util.Collection)} or {@link #withSchemas(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param schemas
     *        The retrieved list of schemas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSchemaResult withSchemas(Schema... schemas) {
        if (this.schemas == null) {
            setSchemas(new java.util.ArrayList<Schema>(schemas.length));
        }
        for (Schema ele : schemas) {
            this.schemas.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The retrieved list of schemas.
     * </p>
     * 
     * @param schemas
     *        The retrieved list of schemas.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSchemaResult withSchemas(java.util.Collection<Schema> schemas) {
        setSchemas(schemas);
        return this;
    }

    /**
     * <p>
     * Error reasons for schemas that could not be retrieved. One error is returned for every schema that could not be
     * retrieved.
     * </p>
     * 
     * @return Error reasons for schemas that could not be retrieved. One error is returned for every schema that could
     *         not be retrieved.
     */

    public java.util.List<BatchGetSchemaError> getErrors() {
        return errors;
    }

    /**
     * <p>
     * Error reasons for schemas that could not be retrieved. One error is returned for every schema that could not be
     * retrieved.
     * </p>
     * 
     * @param errors
     *        Error reasons for schemas that could not be retrieved. One error is returned for every schema that could
     *        not be retrieved.
     */

    public void setErrors(java.util.Collection<BatchGetSchemaError> errors) {
        if (errors == null) {
            this.errors = null;
            return;
        }

        this.errors = new java.util.ArrayList<BatchGetSchemaError>(errors);
    }

    /**
     * <p>
     * Error reasons for schemas that could not be retrieved. One error is returned for every schema that could not be
     * retrieved.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setErrors(java.util.Collection)} or {@link #withErrors(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param errors
     *        Error reasons for schemas that could not be retrieved. One error is returned for every schema that could
     *        not be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSchemaResult withErrors(BatchGetSchemaError... errors) {
        if (this.errors == null) {
            setErrors(new java.util.ArrayList<BatchGetSchemaError>(errors.length));
        }
        for (BatchGetSchemaError ele : errors) {
            this.errors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Error reasons for schemas that could not be retrieved. One error is returned for every schema that could not be
     * retrieved.
     * </p>
     * 
     * @param errors
     *        Error reasons for schemas that could not be retrieved. One error is returned for every schema that could
     *        not be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchGetSchemaResult withErrors(java.util.Collection<BatchGetSchemaError> errors) {
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
        if (getSchemas() != null)
            sb.append("Schemas: ").append(getSchemas()).append(",");
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

        if (obj instanceof BatchGetSchemaResult == false)
            return false;
        BatchGetSchemaResult other = (BatchGetSchemaResult) obj;
        if (other.getSchemas() == null ^ this.getSchemas() == null)
            return false;
        if (other.getSchemas() != null && other.getSchemas().equals(this.getSchemas()) == false)
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

        hashCode = prime * hashCode + ((getSchemas() == null) ? 0 : getSchemas().hashCode());
        hashCode = prime * hashCode + ((getErrors() == null) ? 0 : getErrors().hashCode());
        return hashCode;
    }

    @Override
    public BatchGetSchemaResult clone() {
        try {
            return (BatchGetSchemaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
