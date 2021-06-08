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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides summary information about an export in an export list.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ExportSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the export.
     * </p>
     */
    private String exportId;
    /**
     * <p>
     * Information about the bot or bot locale that was exported.
     * </p>
     */
    private ExportResourceSpecification resourceSpecification;
    /**
     * <p>
     * The file format used in the export files.
     * </p>
     */
    private String fileFormat;
    /**
     * <p>
     * The status of the export. When the status is <code>Completed</code> the export is ready to download.
     * </p>
     */
    private String exportStatus;
    /**
     * <p>
     * The date and time that the export was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time that the export was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the export.
     * </p>
     * 
     * @param exportId
     *        The unique identifier that Amazon Lex assigned to the export.
     */

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the export.
     * </p>
     * 
     * @return The unique identifier that Amazon Lex assigned to the export.
     */

    public String getExportId() {
        return this.exportId;
    }

    /**
     * <p>
     * The unique identifier that Amazon Lex assigned to the export.
     * </p>
     * 
     * @param exportId
     *        The unique identifier that Amazon Lex assigned to the export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSummary withExportId(String exportId) {
        setExportId(exportId);
        return this;
    }

    /**
     * <p>
     * Information about the bot or bot locale that was exported.
     * </p>
     * 
     * @param resourceSpecification
     *        Information about the bot or bot locale that was exported.
     */

    public void setResourceSpecification(ExportResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
    }

    /**
     * <p>
     * Information about the bot or bot locale that was exported.
     * </p>
     * 
     * @return Information about the bot or bot locale that was exported.
     */

    public ExportResourceSpecification getResourceSpecification() {
        return this.resourceSpecification;
    }

    /**
     * <p>
     * Information about the bot or bot locale that was exported.
     * </p>
     * 
     * @param resourceSpecification
     *        Information about the bot or bot locale that was exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSummary withResourceSpecification(ExportResourceSpecification resourceSpecification) {
        setResourceSpecification(resourceSpecification);
        return this;
    }

    /**
     * <p>
     * The file format used in the export files.
     * </p>
     * 
     * @param fileFormat
     *        The file format used in the export files.
     * @see ImportExportFileFormat
     */

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * <p>
     * The file format used in the export files.
     * </p>
     * 
     * @return The file format used in the export files.
     * @see ImportExportFileFormat
     */

    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * <p>
     * The file format used in the export files.
     * </p>
     * 
     * @param fileFormat
     *        The file format used in the export files.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportExportFileFormat
     */

    public ExportSummary withFileFormat(String fileFormat) {
        setFileFormat(fileFormat);
        return this;
    }

    /**
     * <p>
     * The file format used in the export files.
     * </p>
     * 
     * @param fileFormat
     *        The file format used in the export files.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportExportFileFormat
     */

    public ExportSummary withFileFormat(ImportExportFileFormat fileFormat) {
        this.fileFormat = fileFormat.toString();
        return this;
    }

    /**
     * <p>
     * The status of the export. When the status is <code>Completed</code> the export is ready to download.
     * </p>
     * 
     * @param exportStatus
     *        The status of the export. When the status is <code>Completed</code> the export is ready to download.
     * @see ExportStatus
     */

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
     * <p>
     * The status of the export. When the status is <code>Completed</code> the export is ready to download.
     * </p>
     * 
     * @return The status of the export. When the status is <code>Completed</code> the export is ready to download.
     * @see ExportStatus
     */

    public String getExportStatus() {
        return this.exportStatus;
    }

    /**
     * <p>
     * The status of the export. When the status is <code>Completed</code> the export is ready to download.
     * </p>
     * 
     * @param exportStatus
     *        The status of the export. When the status is <code>Completed</code> the export is ready to download.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public ExportSummary withExportStatus(String exportStatus) {
        setExportStatus(exportStatus);
        return this;
    }

    /**
     * <p>
     * The status of the export. When the status is <code>Completed</code> the export is ready to download.
     * </p>
     * 
     * @param exportStatus
     *        The status of the export. When the status is <code>Completed</code> the export is ready to download.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public ExportSummary withExportStatus(ExportStatus exportStatus) {
        this.exportStatus = exportStatus.toString();
        return this;
    }

    /**
     * <p>
     * The date and time that the export was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time that the export was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time that the export was created.
     * </p>
     * 
     * @return The date and time that the export was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time that the export was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time that the export was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSummary withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time that the export was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the export was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the export was last updated.
     * </p>
     * 
     * @return The date and time that the export was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time that the export was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time that the export was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportSummary withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportSummary == false)
            return false;
        ExportSummary other = (ExportSummary) obj;
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
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
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
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public ExportSummary clone() {
        try {
            return (ExportSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.ExportSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
