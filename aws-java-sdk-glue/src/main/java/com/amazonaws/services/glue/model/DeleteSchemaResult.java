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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/DeleteSchema" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteSchemaResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema being deleted.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The name of the schema being deleted.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The status of the schema.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema being deleted.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema being deleted.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema being deleted.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the schema being deleted.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema being deleted.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSchemaResult withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The name of the schema being deleted.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema being deleted.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The name of the schema being deleted.
     * </p>
     * 
     * @return The name of the schema being deleted.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The name of the schema being deleted.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema being deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteSchemaResult withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param status
     *        The status of the schema.
     * @see SchemaStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @return The status of the schema.
     * @see SchemaStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param status
     *        The status of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaStatus
     */

    public DeleteSchemaResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param status
     *        The status of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaStatus
     */

    public DeleteSchemaResult withStatus(SchemaStatus status) {
        this.status = status.toString();
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
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteSchemaResult == false)
            return false;
        DeleteSchemaResult other = (DeleteSchemaResult) obj;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public DeleteSchemaResult clone() {
        try {
            return (DeleteSchemaResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
