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
package com.amazonaws.services.entityresolution.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object containing <code>SchemaName</code>, <code>SchemaArn</code>, <code>CreatedAt</code>, and
 * <code>UpdatedAt</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/entityresolution-2018-05-10/SchemaMappingSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaMappingSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * Specifies whether the schema mapping has been applied to a workflow.
     * </p>
     */
    private Boolean hasWorkflows;
    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>SchemaMapping</code>.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The name of the schema.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the <code>SchemaMapping</code> was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was created.
     * </p>
     * 
     * @return The timestamp of when the <code>SchemaMapping</code> was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the <code>SchemaMapping</code> was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaMappingSummary withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * Specifies whether the schema mapping has been applied to a workflow.
     * </p>
     * 
     * @param hasWorkflows
     *        Specifies whether the schema mapping has been applied to a workflow.
     */

    public void setHasWorkflows(Boolean hasWorkflows) {
        this.hasWorkflows = hasWorkflows;
    }

    /**
     * <p>
     * Specifies whether the schema mapping has been applied to a workflow.
     * </p>
     * 
     * @return Specifies whether the schema mapping has been applied to a workflow.
     */

    public Boolean getHasWorkflows() {
        return this.hasWorkflows;
    }

    /**
     * <p>
     * Specifies whether the schema mapping has been applied to a workflow.
     * </p>
     * 
     * @param hasWorkflows
     *        Specifies whether the schema mapping has been applied to a workflow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaMappingSummary withHasWorkflows(Boolean hasWorkflows) {
        setHasWorkflows(hasWorkflows);
        return this;
    }

    /**
     * <p>
     * Specifies whether the schema mapping has been applied to a workflow.
     * </p>
     * 
     * @return Specifies whether the schema mapping has been applied to a workflow.
     */

    public Boolean isHasWorkflows() {
        return this.hasWorkflows;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>SchemaMapping</code>.
     * </p>
     * 
     * @param schemaArn
     *        The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>SchemaMapping</code>.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>SchemaMapping</code>.
     * </p>
     * 
     * @return The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>SchemaMapping</code>.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>SchemaMapping</code>.
     * </p>
     * 
     * @param schemaArn
     *        The ARN (Amazon Resource Name) that Entity Resolution generated for the <code>SchemaMapping</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaMappingSummary withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema.
     */

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     * 
     * @return The name of the schema.
     */

    public String getSchemaName() {
        return this.schemaName;
    }

    /**
     * <p>
     * The name of the schema.
     * </p>
     * 
     * @param schemaName
     *        The name of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaMappingSummary withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the <code>SchemaMapping</code> was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was last updated.
     * </p>
     * 
     * @return The timestamp of when the <code>SchemaMapping</code> was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the <code>SchemaMapping</code> was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the <code>SchemaMapping</code> was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaMappingSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getHasWorkflows() != null)
            sb.append("HasWorkflows: ").append(getHasWorkflows()).append(",");
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaMappingSummary == false)
            return false;
        SchemaMappingSummary other = (SchemaMappingSummary) obj;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getHasWorkflows() == null ^ this.getHasWorkflows() == null)
            return false;
        if (other.getHasWorkflows() != null && other.getHasWorkflows().equals(this.getHasWorkflows()) == false)
            return false;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getHasWorkflows() == null) ? 0 : getHasWorkflows().hashCode());
        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public SchemaMappingSummary clone() {
        try {
            return (SchemaMappingSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.entityresolution.model.transform.SchemaMappingSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
