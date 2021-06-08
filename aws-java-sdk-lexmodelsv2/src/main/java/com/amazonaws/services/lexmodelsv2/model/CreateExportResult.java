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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/CreateExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateExportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An identifier for a specific request to create an export.
     * </p>
     */
    private String exportId;
    /**
     * <p>
     * A description of the type of resource that was exported, either a bot or a bot locale.
     * </p>
     */
    private ExportResourceSpecification resourceSpecification;
    /**
     * <p>
     * The file format used for the bot or bot locale definition files.
     * </p>
     */
    private String fileFormat;
    /**
     * <p>
     * The status of the export. When the status is <code>Completed</code>, you can use the operation to get the
     * pre-signed S3 URL link to your exported bot or bot locale.
     * </p>
     */
    private String exportStatus;
    /**
     * <p>
     * The date and time that the request to export a bot was created.
     * </p>
     */
    private java.util.Date creationDateTime;

    /**
     * <p>
     * An identifier for a specific request to create an export.
     * </p>
     * 
     * @param exportId
     *        An identifier for a specific request to create an export.
     */

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    /**
     * <p>
     * An identifier for a specific request to create an export.
     * </p>
     * 
     * @return An identifier for a specific request to create an export.
     */

    public String getExportId() {
        return this.exportId;
    }

    /**
     * <p>
     * An identifier for a specific request to create an export.
     * </p>
     * 
     * @param exportId
     *        An identifier for a specific request to create an export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportResult withExportId(String exportId) {
        setExportId(exportId);
        return this;
    }

    /**
     * <p>
     * A description of the type of resource that was exported, either a bot or a bot locale.
     * </p>
     * 
     * @param resourceSpecification
     *        A description of the type of resource that was exported, either a bot or a bot locale.
     */

    public void setResourceSpecification(ExportResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
    }

    /**
     * <p>
     * A description of the type of resource that was exported, either a bot or a bot locale.
     * </p>
     * 
     * @return A description of the type of resource that was exported, either a bot or a bot locale.
     */

    public ExportResourceSpecification getResourceSpecification() {
        return this.resourceSpecification;
    }

    /**
     * <p>
     * A description of the type of resource that was exported, either a bot or a bot locale.
     * </p>
     * 
     * @param resourceSpecification
     *        A description of the type of resource that was exported, either a bot or a bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportResult withResourceSpecification(ExportResourceSpecification resourceSpecification) {
        setResourceSpecification(resourceSpecification);
        return this;
    }

    /**
     * <p>
     * The file format used for the bot or bot locale definition files.
     * </p>
     * 
     * @param fileFormat
     *        The file format used for the bot or bot locale definition files.
     * @see ImportExportFileFormat
     */

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * <p>
     * The file format used for the bot or bot locale definition files.
     * </p>
     * 
     * @return The file format used for the bot or bot locale definition files.
     * @see ImportExportFileFormat
     */

    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * <p>
     * The file format used for the bot or bot locale definition files.
     * </p>
     * 
     * @param fileFormat
     *        The file format used for the bot or bot locale definition files.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportExportFileFormat
     */

    public CreateExportResult withFileFormat(String fileFormat) {
        setFileFormat(fileFormat);
        return this;
    }

    /**
     * <p>
     * The file format used for the bot or bot locale definition files.
     * </p>
     * 
     * @param fileFormat
     *        The file format used for the bot or bot locale definition files.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportExportFileFormat
     */

    public CreateExportResult withFileFormat(ImportExportFileFormat fileFormat) {
        this.fileFormat = fileFormat.toString();
        return this;
    }

    /**
     * <p>
     * The status of the export. When the status is <code>Completed</code>, you can use the operation to get the
     * pre-signed S3 URL link to your exported bot or bot locale.
     * </p>
     * 
     * @param exportStatus
     *        The status of the export. When the status is <code>Completed</code>, you can use the operation to get the
     *        pre-signed S3 URL link to your exported bot or bot locale.
     * @see ExportStatus
     */

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
     * <p>
     * The status of the export. When the status is <code>Completed</code>, you can use the operation to get the
     * pre-signed S3 URL link to your exported bot or bot locale.
     * </p>
     * 
     * @return The status of the export. When the status is <code>Completed</code>, you can use the operation to get the
     *         pre-signed S3 URL link to your exported bot or bot locale.
     * @see ExportStatus
     */

    public String getExportStatus() {
        return this.exportStatus;
    }

    /**
     * <p>
     * The status of the export. When the status is <code>Completed</code>, you can use the operation to get the
     * pre-signed S3 URL link to your exported bot or bot locale.
     * </p>
     * 
     * @param exportStatus
     *        The status of the export. When the status is <code>Completed</code>, you can use the operation to get the
     *        pre-signed S3 URL link to your exported bot or bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public CreateExportResult withExportStatus(String exportStatus) {
        setExportStatus(exportStatus);
        return this;
    }

    /**
     * <p>
     * The status of the export. When the status is <code>Completed</code>, you can use the operation to get the
     * pre-signed S3 URL link to your exported bot or bot locale.
     * </p>
     * 
     * @param exportStatus
     *        The status of the export. When the status is <code>Completed</code>, you can use the operation to get the
     *        pre-signed S3 URL link to your exported bot or bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public CreateExportResult withExportStatus(ExportStatus exportStatus) {
        this.exportStatus = exportStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the request to export a bot was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time that the request to export a bot was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time that the request to export a bot was created.
     * </p>
     * 
     * @return The date and time that the request to export a bot was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time that the request to export a bot was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time that the request to export a bot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateExportResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
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
        if (getExportId() != null)
            sb.append("ExportId: ").append(getExportId()).append(",");
        if (getResourceSpecification() != null)
            sb.append("ResourceSpecification: ").append(getResourceSpecification()).append(",");
        if (getFileFormat() != null)
            sb.append("FileFormat: ").append(getFileFormat()).append(",");
        if (getExportStatus() != null)
            sb.append("ExportStatus: ").append(getExportStatus()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateExportResult == false)
            return false;
        CreateExportResult other = (CreateExportResult) obj;
        if (other.getExportId() == null ^ this.getExportId() == null)
            return false;
        if (other.getExportId() != null && other.getExportId().equals(this.getExportId()) == false)
            return false;
        if (other.getResourceSpecification() == null ^ this.getResourceSpecification() == null)
            return false;
        if (other.getResourceSpecification() != null && other.getResourceSpecification().equals(this.getResourceSpecification()) == false)
            return false;
        if (other.getFileFormat() == null ^ this.getFileFormat() == null)
            return false;
        if (other.getFileFormat() != null && other.getFileFormat().equals(this.getFileFormat()) == false)
            return false;
        if (other.getExportStatus() == null ^ this.getExportStatus() == null)
            return false;
        if (other.getExportStatus() != null && other.getExportStatus().equals(this.getExportStatus()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportId() == null) ? 0 : getExportId().hashCode());
        hashCode = prime * hashCode + ((getResourceSpecification() == null) ? 0 : getResourceSpecification().hashCode());
        hashCode = prime * hashCode + ((getFileFormat() == null) ? 0 : getFileFormat().hashCode());
        hashCode = prime * hashCode + ((getExportStatus() == null) ? 0 : getExportStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        return hashCode;
    }

    @Override
    public CreateExportResult clone() {
        try {
            return (CreateExportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
