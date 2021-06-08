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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that contains minimal details for a schema.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SchemaListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * the name of the registry where the schema resides.
     * </p>
     */
    private String registryName;
    /**
     * <p>
     * The name of the schema.
     * </p>
     */
    private String schemaName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) for the schema.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * A description for the schema.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The status of the schema.
     * </p>
     */
    private String schemaStatus;
    /**
     * <p>
     * The date and time that a schema was created.
     * </p>
     */
    private String createdTime;
    /**
     * <p>
     * The date and time that a schema was updated.
     * </p>
     */
    private String updatedTime;

    /**
     * <p>
     * the name of the registry where the schema resides.
     * </p>
     * 
     * @param registryName
     *        the name of the registry where the schema resides.
     */

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * <p>
     * the name of the registry where the schema resides.
     * </p>
     * 
     * @return the name of the registry where the schema resides.
     */

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * <p>
     * the name of the registry where the schema resides.
     * </p>
     * 
     * @param registryName
     *        the name of the registry where the schema resides.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaListItem withRegistryName(String registryName) {
        setRegistryName(registryName);
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

    public SchemaListItem withSchemaName(String schemaName) {
        setSchemaName(schemaName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the schema.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) for the schema.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the schema.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the schema.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the schema.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) for the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaListItem withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * A description for the schema.
     * </p>
     * 
     * @param description
     *        A description for the schema.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the schema.
     * </p>
     * 
     * @return A description for the schema.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the schema.
     * </p>
     * 
     * @param description
     *        A description for the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaListItem withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param schemaStatus
     *        The status of the schema.
     * @see SchemaStatus
     */

    public void setSchemaStatus(String schemaStatus) {
        this.schemaStatus = schemaStatus;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @return The status of the schema.
     * @see SchemaStatus
     */

    public String getSchemaStatus() {
        return this.schemaStatus;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param schemaStatus
     *        The status of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaStatus
     */

    public SchemaListItem withSchemaStatus(String schemaStatus) {
        setSchemaStatus(schemaStatus);
        return this;
    }

    /**
     * <p>
     * The status of the schema.
     * </p>
     * 
     * @param schemaStatus
     *        The status of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaStatus
     */

    public SchemaListItem withSchemaStatus(SchemaStatus schemaStatus) {
        this.schemaStatus = schemaStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that a schema was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that a schema was created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time that a schema was created.
     * </p>
     * 
     * @return The date and time that a schema was created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time that a schema was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time that a schema was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaListItem withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The date and time that a schema was updated.
     * </p>
     * 
     * @param updatedTime
     *        The date and time that a schema was updated.
     */

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    /**
     * <p>
     * The date and time that a schema was updated.
     * </p>
     * 
     * @return The date and time that a schema was updated.
     */

    public String getUpdatedTime() {
        return this.updatedTime;
    }

    /**
     * <p>
     * The date and time that a schema was updated.
     * </p>
     * 
     * @param updatedTime
     *        The date and time that a schema was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaListItem withUpdatedTime(String updatedTime) {
        setUpdatedTime(updatedTime);
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
        if (getRegistryName() != null)
            sb.append("RegistryName: ").append(getRegistryName()).append(",");
        if (getSchemaName() != null)
            sb.append("SchemaName: ").append(getSchemaName()).append(",");
        if (getSchemaArn() != null)
            sb.append("SchemaArn: ").append(getSchemaArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSchemaStatus() != null)
            sb.append("SchemaStatus: ").append(getSchemaStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getUpdatedTime() != null)
            sb.append("UpdatedTime: ").append(getUpdatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaListItem == false)
            return false;
        SchemaListItem other = (SchemaListItem) obj;
        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null && other.getRegistryName().equals(this.getRegistryName()) == false)
            return false;
        if (other.getSchemaName() == null ^ this.getSchemaName() == null)
            return false;
        if (other.getSchemaName() != null && other.getSchemaName().equals(this.getSchemaName()) == false)
            return false;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSchemaStatus() == null ^ this.getSchemaStatus() == null)
            return false;
        if (other.getSchemaStatus() != null && other.getSchemaStatus().equals(this.getSchemaStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getUpdatedTime() == null ^ this.getUpdatedTime() == null)
            return false;
        if (other.getUpdatedTime() != null && other.getUpdatedTime().equals(this.getUpdatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        hashCode = prime * hashCode + ((getSchemaName() == null) ? 0 : getSchemaName().hashCode());
        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchemaStatus() == null) ? 0 : getSchemaStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        return hashCode;
    }

    @Override
    public SchemaListItem clone() {
        try {
            return (SchemaListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SchemaListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
