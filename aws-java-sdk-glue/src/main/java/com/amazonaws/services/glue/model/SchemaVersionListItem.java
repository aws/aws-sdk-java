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
 * An object containing the details about a schema version.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/SchemaVersionListItem" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaVersionListItem implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     */
    private String schemaArn;
    /**
     * <p>
     * The unique identifier of the schema version.
     * </p>
     */
    private String schemaVersionId;
    /**
     * <p>
     * The version number of the schema.
     * </p>
     */
    private Long versionNumber;
    /**
     * <p>
     * The status of the schema version.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date and time the schema version was created.
     * </p>
     */
    private String createdTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema.
     */

    public void setSchemaArn(String schemaArn) {
        this.schemaArn = schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the schema.
     */

    public String getSchemaArn() {
        return this.schemaArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the schema.
     * </p>
     * 
     * @param schemaArn
     *        The Amazon Resource Name (ARN) of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaVersionListItem withSchemaArn(String schemaArn) {
        setSchemaArn(schemaArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the schema version.
     * </p>
     * 
     * @param schemaVersionId
     *        The unique identifier of the schema version.
     */

    public void setSchemaVersionId(String schemaVersionId) {
        this.schemaVersionId = schemaVersionId;
    }

    /**
     * <p>
     * The unique identifier of the schema version.
     * </p>
     * 
     * @return The unique identifier of the schema version.
     */

    public String getSchemaVersionId() {
        return this.schemaVersionId;
    }

    /**
     * <p>
     * The unique identifier of the schema version.
     * </p>
     * 
     * @param schemaVersionId
     *        The unique identifier of the schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaVersionListItem withSchemaVersionId(String schemaVersionId) {
        setSchemaVersionId(schemaVersionId);
        return this;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the schema.
     */

    public void setVersionNumber(Long versionNumber) {
        this.versionNumber = versionNumber;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @return The version number of the schema.
     */

    public Long getVersionNumber() {
        return this.versionNumber;
    }

    /**
     * <p>
     * The version number of the schema.
     * </p>
     * 
     * @param versionNumber
     *        The version number of the schema.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaVersionListItem withVersionNumber(Long versionNumber) {
        setVersionNumber(versionNumber);
        return this;
    }

    /**
     * <p>
     * The status of the schema version.
     * </p>
     * 
     * @param status
     *        The status of the schema version.
     * @see SchemaVersionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the schema version.
     * </p>
     * 
     * @return The status of the schema version.
     * @see SchemaVersionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the schema version.
     * </p>
     * 
     * @param status
     *        The status of the schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaVersionStatus
     */

    public SchemaVersionListItem withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the schema version.
     * </p>
     * 
     * @param status
     *        The status of the schema version.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaVersionStatus
     */

    public SchemaVersionListItem withStatus(SchemaVersionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the schema version was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the schema version was created.
     */

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The date and time the schema version was created.
     * </p>
     * 
     * @return The date and time the schema version was created.
     */

    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The date and time the schema version was created.
     * </p>
     * 
     * @param createdTime
     *        The date and time the schema version was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaVersionListItem withCreatedTime(String createdTime) {
        setCreatedTime(createdTime);
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
        if (getSchemaVersionId() != null)
            sb.append("SchemaVersionId: ").append(getSchemaVersionId()).append(",");
        if (getVersionNumber() != null)
            sb.append("VersionNumber: ").append(getVersionNumber()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaVersionListItem == false)
            return false;
        SchemaVersionListItem other = (SchemaVersionListItem) obj;
        if (other.getSchemaArn() == null ^ this.getSchemaArn() == null)
            return false;
        if (other.getSchemaArn() != null && other.getSchemaArn().equals(this.getSchemaArn()) == false)
            return false;
        if (other.getSchemaVersionId() == null ^ this.getSchemaVersionId() == null)
            return false;
        if (other.getSchemaVersionId() != null && other.getSchemaVersionId().equals(this.getSchemaVersionId()) == false)
            return false;
        if (other.getVersionNumber() == null ^ this.getVersionNumber() == null)
            return false;
        if (other.getVersionNumber() != null && other.getVersionNumber().equals(this.getVersionNumber()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSchemaArn() == null) ? 0 : getSchemaArn().hashCode());
        hashCode = prime * hashCode + ((getSchemaVersionId() == null) ? 0 : getSchemaVersionId().hashCode());
        hashCode = prime * hashCode + ((getVersionNumber() == null) ? 0 : getVersionNumber().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        return hashCode;
    }

    @Override
    public SchemaVersionListItem clone() {
        try {
            return (SchemaVersionListItem) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.SchemaVersionListItemMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
