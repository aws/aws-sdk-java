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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a schema extension.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/SchemaExtensionInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SchemaExtensionInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The identifier of the directory to which the schema extension is applied.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The identifier of the schema extension.
     * </p>
     */
    private String schemaExtensionId;
    /**
     * <p>
     * A description of the schema extension.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The current status of the schema extension.
     * </p>
     */
    private String schemaExtensionStatus;
    /**
     * <p>
     * The reason for the <code>SchemaExtensionStatus</code>.
     * </p>
     */
    private String schemaExtensionStatusReason;
    /**
     * <p>
     * The date and time that the schema extension started being applied to the directory.
     * </p>
     */
    private java.util.Date startDateTime;
    /**
     * <p>
     * The date and time that the schema extension was completed.
     * </p>
     */
    private java.util.Date endDateTime;

    /**
     * <p>
     * The identifier of the directory to which the schema extension is applied.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory to which the schema extension is applied.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory to which the schema extension is applied.
     * </p>
     * 
     * @return The identifier of the directory to which the schema extension is applied.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory to which the schema extension is applied.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory to which the schema extension is applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaExtensionInfo withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The identifier of the schema extension.
     * </p>
     * 
     * @param schemaExtensionId
     *        The identifier of the schema extension.
     */

    public void setSchemaExtensionId(String schemaExtensionId) {
        this.schemaExtensionId = schemaExtensionId;
    }

    /**
     * <p>
     * The identifier of the schema extension.
     * </p>
     * 
     * @return The identifier of the schema extension.
     */

    public String getSchemaExtensionId() {
        return this.schemaExtensionId;
    }

    /**
     * <p>
     * The identifier of the schema extension.
     * </p>
     * 
     * @param schemaExtensionId
     *        The identifier of the schema extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaExtensionInfo withSchemaExtensionId(String schemaExtensionId) {
        setSchemaExtensionId(schemaExtensionId);
        return this;
    }

    /**
     * <p>
     * A description of the schema extension.
     * </p>
     * 
     * @param description
     *        A description of the schema extension.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the schema extension.
     * </p>
     * 
     * @return A description of the schema extension.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the schema extension.
     * </p>
     * 
     * @param description
     *        A description of the schema extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaExtensionInfo withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The current status of the schema extension.
     * </p>
     * 
     * @param schemaExtensionStatus
     *        The current status of the schema extension.
     * @see SchemaExtensionStatus
     */

    public void setSchemaExtensionStatus(String schemaExtensionStatus) {
        this.schemaExtensionStatus = schemaExtensionStatus;
    }

    /**
     * <p>
     * The current status of the schema extension.
     * </p>
     * 
     * @return The current status of the schema extension.
     * @see SchemaExtensionStatus
     */

    public String getSchemaExtensionStatus() {
        return this.schemaExtensionStatus;
    }

    /**
     * <p>
     * The current status of the schema extension.
     * </p>
     * 
     * @param schemaExtensionStatus
     *        The current status of the schema extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaExtensionStatus
     */

    public SchemaExtensionInfo withSchemaExtensionStatus(String schemaExtensionStatus) {
        setSchemaExtensionStatus(schemaExtensionStatus);
        return this;
    }

    /**
     * <p>
     * The current status of the schema extension.
     * </p>
     * 
     * @param schemaExtensionStatus
     *        The current status of the schema extension.
     * @see SchemaExtensionStatus
     */

    public void setSchemaExtensionStatus(SchemaExtensionStatus schemaExtensionStatus) {
        withSchemaExtensionStatus(schemaExtensionStatus);
    }

    /**
     * <p>
     * The current status of the schema extension.
     * </p>
     * 
     * @param schemaExtensionStatus
     *        The current status of the schema extension.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchemaExtensionStatus
     */

    public SchemaExtensionInfo withSchemaExtensionStatus(SchemaExtensionStatus schemaExtensionStatus) {
        this.schemaExtensionStatus = schemaExtensionStatus.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the <code>SchemaExtensionStatus</code>.
     * </p>
     * 
     * @param schemaExtensionStatusReason
     *        The reason for the <code>SchemaExtensionStatus</code>.
     */

    public void setSchemaExtensionStatusReason(String schemaExtensionStatusReason) {
        this.schemaExtensionStatusReason = schemaExtensionStatusReason;
    }

    /**
     * <p>
     * The reason for the <code>SchemaExtensionStatus</code>.
     * </p>
     * 
     * @return The reason for the <code>SchemaExtensionStatus</code>.
     */

    public String getSchemaExtensionStatusReason() {
        return this.schemaExtensionStatusReason;
    }

    /**
     * <p>
     * The reason for the <code>SchemaExtensionStatus</code>.
     * </p>
     * 
     * @param schemaExtensionStatusReason
     *        The reason for the <code>SchemaExtensionStatus</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaExtensionInfo withSchemaExtensionStatusReason(String schemaExtensionStatusReason) {
        setSchemaExtensionStatusReason(schemaExtensionStatusReason);
        return this;
    }

    /**
     * <p>
     * The date and time that the schema extension started being applied to the directory.
     * </p>
     * 
     * @param startDateTime
     *        The date and time that the schema extension started being applied to the directory.
     */

    public void setStartDateTime(java.util.Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    /**
     * <p>
     * The date and time that the schema extension started being applied to the directory.
     * </p>
     * 
     * @return The date and time that the schema extension started being applied to the directory.
     */

    public java.util.Date getStartDateTime() {
        return this.startDateTime;
    }

    /**
     * <p>
     * The date and time that the schema extension started being applied to the directory.
     * </p>
     * 
     * @param startDateTime
     *        The date and time that the schema extension started being applied to the directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaExtensionInfo withStartDateTime(java.util.Date startDateTime) {
        setStartDateTime(startDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the schema extension was completed.
     * </p>
     * 
     * @param endDateTime
     *        The date and time that the schema extension was completed.
     */

    public void setEndDateTime(java.util.Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    /**
     * <p>
     * The date and time that the schema extension was completed.
     * </p>
     * 
     * @return The date and time that the schema extension was completed.
     */

    public java.util.Date getEndDateTime() {
        return this.endDateTime;
    }

    /**
     * <p>
     * The date and time that the schema extension was completed.
     * </p>
     * 
     * @param endDateTime
     *        The date and time that the schema extension was completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SchemaExtensionInfo withEndDateTime(java.util.Date endDateTime) {
        setEndDateTime(endDateTime);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getSchemaExtensionId() != null)
            sb.append("SchemaExtensionId: ").append(getSchemaExtensionId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSchemaExtensionStatus() != null)
            sb.append("SchemaExtensionStatus: ").append(getSchemaExtensionStatus()).append(",");
        if (getSchemaExtensionStatusReason() != null)
            sb.append("SchemaExtensionStatusReason: ").append(getSchemaExtensionStatusReason()).append(",");
        if (getStartDateTime() != null)
            sb.append("StartDateTime: ").append(getStartDateTime()).append(",");
        if (getEndDateTime() != null)
            sb.append("EndDateTime: ").append(getEndDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SchemaExtensionInfo == false)
            return false;
        SchemaExtensionInfo other = (SchemaExtensionInfo) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getSchemaExtensionId() == null ^ this.getSchemaExtensionId() == null)
            return false;
        if (other.getSchemaExtensionId() != null && other.getSchemaExtensionId().equals(this.getSchemaExtensionId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSchemaExtensionStatus() == null ^ this.getSchemaExtensionStatus() == null)
            return false;
        if (other.getSchemaExtensionStatus() != null && other.getSchemaExtensionStatus().equals(this.getSchemaExtensionStatus()) == false)
            return false;
        if (other.getSchemaExtensionStatusReason() == null ^ this.getSchemaExtensionStatusReason() == null)
            return false;
        if (other.getSchemaExtensionStatusReason() != null && other.getSchemaExtensionStatusReason().equals(this.getSchemaExtensionStatusReason()) == false)
            return false;
        if (other.getStartDateTime() == null ^ this.getStartDateTime() == null)
            return false;
        if (other.getStartDateTime() != null && other.getStartDateTime().equals(this.getStartDateTime()) == false)
            return false;
        if (other.getEndDateTime() == null ^ this.getEndDateTime() == null)
            return false;
        if (other.getEndDateTime() != null && other.getEndDateTime().equals(this.getEndDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getSchemaExtensionId() == null) ? 0 : getSchemaExtensionId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSchemaExtensionStatus() == null) ? 0 : getSchemaExtensionStatus().hashCode());
        hashCode = prime * hashCode + ((getSchemaExtensionStatusReason() == null) ? 0 : getSchemaExtensionStatusReason().hashCode());
        hashCode = prime * hashCode + ((getStartDateTime() == null) ? 0 : getStartDateTime().hashCode());
        hashCode = prime * hashCode + ((getEndDateTime() == null) ? 0 : getEndDateTime().hashCode());
        return hashCode;
    }

    @Override
    public SchemaExtensionInfo clone() {
        try {
            return (SchemaExtensionInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.directory.model.transform.SchemaExtensionInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
