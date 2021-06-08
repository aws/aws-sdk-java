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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteSchemaVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSchemaVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>SchemaVersionErrorItem</code> objects, each containing an error and schema version.
     * </p>
     */
    private java.util.List<SchemaVersionErrorItem> schemaVersionErrors;

    /**
     * <p>
     * A list of <code>SchemaVersionErrorItem</code> objects, each containing an error and schema version.
     * </p>
     * 
     * @return A list of <code>SchemaVersionErrorItem</code> objects, each containing an error and schema version.
     */

    public java.util.List<SchemaVersionErrorItem> getSchemaVersionErrors() {
        return schemaVersionErrors;
    }

    /**
     * <p>
     * A list of <code>SchemaVersionErrorItem</code> objects, each containing an error and schema version.
     * </p>
     * 
     * @param schemaVersionErrors
     *        A list of <code>SchemaVersionErrorItem</code> objects, each containing an error and schema version.
     */

    public void setSchemaVersionErrors(java.util.Collection<SchemaVersionErrorItem> schemaVersionErrors) {
        if (schemaVersionErrors == null) {
            this.schemaVersionErrors = null;
            return;
        }

        this.schemaVersionErrors = new java.util.ArrayList<SchemaVersionErrorItem>(schemaVersionErrors);
    }

    /**
     * <p>
     * A list of <code>SchemaVersionErrorItem</code> objects, each containing an error and schema version.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSchemaVersionErrors(java.util.Collection)} or {@link #withSchemaVersionErrors(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param schemaVersionErrors
     *        A list of <code>SchemaVersionErrorItem</code> objects, each containing an error and schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSchemaVersionsResult withSchemaVersionErrors(SchemaVersionErrorItem... schemaVersionErrors) {
        if (this.schemaVersionErrors == null) {
            setSchemaVersionErrors(new java.util.ArrayList<SchemaVersionErrorItem>(schemaVersionErrors.length));
        }
        for (SchemaVersionErrorItem ele : schemaVersionErrors) {
            this.schemaVersionErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>SchemaVersionErrorItem</code> objects, each containing an error and schema version.
     * </p>
     * 
     * @param schemaVersionErrors
     *        A list of <code>SchemaVersionErrorItem</code> objects, each containing an error and schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSchemaVersionsResult withSchemaVersionErrors(java.util.Collection<SchemaVersionErrorItem> schemaVersionErrors) {
        setSchemaVersionErrors(schemaVersionErrors);
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
        if (getSchemaVersionErrors() != null)
            sb.append("SchemaVersionErrors: ").append(getSchemaVersionErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSchemaVersionsResult == false)
            return false;
        DeleteSchemaVersionsResult other = (DeleteSchemaVersionsResult) obj;
        if (other.getSchemaVersionErrors() == null ^ this.getSchemaVersionErrors() == null)
            return false;
        if (other.getSchemaVersionErrors() != null && other.getSchemaVersionErrors().equals(this.getSchemaVersionErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaVersionErrors() == null) ? 0 : getSchemaVersionErrors().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSchemaVersionsResult clone() {
        try {
            return (DeleteSchemaVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
