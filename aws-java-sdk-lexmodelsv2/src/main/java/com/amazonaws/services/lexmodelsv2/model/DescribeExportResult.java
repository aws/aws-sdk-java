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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/DescribeExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the described export.
     * </p>
     */
    private String exportId;
    /**
     * <p>
     * The bot, bot ID, and optional locale ID of the exported bot or bot locale.
     * </p>
     */
    private ExportResourceSpecification resourceSpecification;
    /**
     * <p>
     * The file format used in the files that describe the bot or bot locale.
     * </p>
     */
    private String fileFormat;
    /**
     * <p>
     * The status of the export. When the status is <code>Complete</code> the export archive file is available for
     * download.
     * </p>
     */
    private String exportStatus;
    /**
     * <p>
     * If the <code>exportStatus</code> is failed, contains one or more reasons why the export could not be completed.
     * </p>
     */
    private java.util.List<String> failureReasons;
    /**
     * <p>
     * A pre-signed S3 URL that points to the bot or bot locale archive. The URL is only available for 5 minutes after
     * calling the <code>DescribeExport</code> operation.
     * </p>
     */
    private String downloadUrl;
    /**
     * <p>
     * The date and time that the export was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The last date and time that the export was updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The unique identifier of the described export.
     * </p>
     * 
     * @param exportId
     *        The unique identifier of the described export.
     */

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    /**
     * <p>
     * The unique identifier of the described export.
     * </p>
     * 
     * @return The unique identifier of the described export.
     */

    public String getExportId() {
        return this.exportId;
    }

    /**
     * <p>
     * The unique identifier of the described export.
     * </p>
     * 
     * @param exportId
     *        The unique identifier of the described export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportResult withExportId(String exportId) {
        setExportId(exportId);
        return this;
    }

    /**
     * <p>
     * The bot, bot ID, and optional locale ID of the exported bot or bot locale.
     * </p>
     * 
     * @param resourceSpecification
     *        The bot, bot ID, and optional locale ID of the exported bot or bot locale.
     */

    public void setResourceSpecification(ExportResourceSpecification resourceSpecification) {
        this.resourceSpecification = resourceSpecification;
    }

    /**
     * <p>
     * The bot, bot ID, and optional locale ID of the exported bot or bot locale.
     * </p>
     * 
     * @return The bot, bot ID, and optional locale ID of the exported bot or bot locale.
     */

    public ExportResourceSpecification getResourceSpecification() {
        return this.resourceSpecification;
    }

    /**
     * <p>
     * The bot, bot ID, and optional locale ID of the exported bot or bot locale.
     * </p>
     * 
     * @param resourceSpecification
     *        The bot, bot ID, and optional locale ID of the exported bot or bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportResult withResourceSpecification(ExportResourceSpecification resourceSpecification) {
        setResourceSpecification(resourceSpecification);
        return this;
    }

    /**
     * <p>
     * The file format used in the files that describe the bot or bot locale.
     * </p>
     * 
     * @param fileFormat
     *        The file format used in the files that describe the bot or bot locale.
     * @see ImportExportFileFormat
     */

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    /**
     * <p>
     * The file format used in the files that describe the bot or bot locale.
     * </p>
     * 
     * @return The file format used in the files that describe the bot or bot locale.
     * @see ImportExportFileFormat
     */

    public String getFileFormat() {
        return this.fileFormat;
    }

    /**
     * <p>
     * The file format used in the files that describe the bot or bot locale.
     * </p>
     * 
     * @param fileFormat
     *        The file format used in the files that describe the bot or bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportExportFileFormat
     */

    public DescribeExportResult withFileFormat(String fileFormat) {
        setFileFormat(fileFormat);
        return this;
    }

    /**
     * <p>
     * The file format used in the files that describe the bot or bot locale.
     * </p>
     * 
     * @param fileFormat
     *        The file format used in the files that describe the bot or bot locale.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImportExportFileFormat
     */

    public DescribeExportResult withFileFormat(ImportExportFileFormat fileFormat) {
        this.fileFormat = fileFormat.toString();
        return this;
    }

    /**
     * <p>
     * The status of the export. When the status is <code>Complete</code> the export archive file is available for
     * download.
     * </p>
     * 
     * @param exportStatus
     *        The status of the export. When the status is <code>Complete</code> the export archive file is available
     *        for download.
     * @see ExportStatus
     */

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
     * <p>
     * The status of the export. When the status is <code>Complete</code> the export archive file is available for
     * download.
     * </p>
     * 
     * @return The status of the export. When the status is <code>Complete</code> the export archive file is available
     *         for download.
     * @see ExportStatus
     */

    public String getExportStatus() {
        return this.exportStatus;
    }

    /**
     * <p>
     * The status of the export. When the status is <code>Complete</code> the export archive file is available for
     * download.
     * </p>
     * 
     * @param exportStatus
     *        The status of the export. When the status is <code>Complete</code> the export archive file is available
     *        for download.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public DescribeExportResult withExportStatus(String exportStatus) {
        setExportStatus(exportStatus);
        return this;
    }

    /**
     * <p>
     * The status of the export. When the status is <code>Complete</code> the export archive file is available for
     * download.
     * </p>
     * 
     * @param exportStatus
     *        The status of the export. When the status is <code>Complete</code> the export archive file is available
     *        for download.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public DescribeExportResult withExportStatus(ExportStatus exportStatus) {
        this.exportStatus = exportStatus.toString();
        return this;
    }

    /**
     * <p>
     * If the <code>exportStatus</code> is failed, contains one or more reasons why the export could not be completed.
     * </p>
     * 
     * @return If the <code>exportStatus</code> is failed, contains one or more reasons why the export could not be
     *         completed.
     */

    public java.util.List<String> getFailureReasons() {
        return failureReasons;
    }

    /**
     * <p>
     * If the <code>exportStatus</code> is failed, contains one or more reasons why the export could not be completed.
     * </p>
     * 
     * @param failureReasons
     *        If the <code>exportStatus</code> is failed, contains one or more reasons why the export could not be
     *        completed.
     */

    public void setFailureReasons(java.util.Collection<String> failureReasons) {
        if (failureReasons == null) {
            this.failureReasons = null;
            return;
        }

        this.failureReasons = new java.util.ArrayList<String>(failureReasons);
    }

    /**
     * <p>
     * If the <code>exportStatus</code> is failed, contains one or more reasons why the export could not be completed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFailureReasons(java.util.Collection)} or {@link #withFailureReasons(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param failureReasons
     *        If the <code>exportStatus</code> is failed, contains one or more reasons why the export could not be
     *        completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportResult withFailureReasons(String... failureReasons) {
        if (this.failureReasons == null) {
            setFailureReasons(new java.util.ArrayList<String>(failureReasons.length));
        }
        for (String ele : failureReasons) {
            this.failureReasons.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * If the <code>exportStatus</code> is failed, contains one or more reasons why the export could not be completed.
     * </p>
     * 
     * @param failureReasons
     *        If the <code>exportStatus</code> is failed, contains one or more reasons why the export could not be
     *        completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportResult withFailureReasons(java.util.Collection<String> failureReasons) {
        setFailureReasons(failureReasons);
        return this;
    }

    /**
     * <p>
     * A pre-signed S3 URL that points to the bot or bot locale archive. The URL is only available for 5 minutes after
     * calling the <code>DescribeExport</code> operation.
     * </p>
     * 
     * @param downloadUrl
     *        A pre-signed S3 URL that points to the bot or bot locale archive. The URL is only available for 5 minutes
     *        after calling the <code>DescribeExport</code> operation.
     */

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * <p>
     * A pre-signed S3 URL that points to the bot or bot locale archive. The URL is only available for 5 minutes after
     * calling the <code>DescribeExport</code> operation.
     * </p>
     * 
     * @return A pre-signed S3 URL that points to the bot or bot locale archive. The URL is only available for 5 minutes
     *         after calling the <code>DescribeExport</code> operation.
     */

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * <p>
     * A pre-signed S3 URL that points to the bot or bot locale archive. The URL is only available for 5 minutes after
     * calling the <code>DescribeExport</code> operation.
     * </p>
     * 
     * @param downloadUrl
     *        A pre-signed S3 URL that points to the bot or bot locale archive. The URL is only available for 5 minutes
     *        after calling the <code>DescribeExport</code> operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportResult withDownloadUrl(String downloadUrl) {
        setDownloadUrl(downloadUrl);
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

    public DescribeExportResult withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The last date and time that the export was updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The last date and time that the export was updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The last date and time that the export was updated.
     * </p>
     * 
     * @return The last date and time that the export was updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The last date and time that the export was updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The last date and time that the export was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExportResult withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
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
        if (getFailureReasons() != null)
            sb.append("FailureReasons: ").append(getFailureReasons()).append(",");
        if (getDownloadUrl() != null)
            sb.append("DownloadUrl: ").append(getDownloadUrl()).append(",");
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

        if (obj instanceof DescribeExportResult == false)
            return false;
        DescribeExportResult other = (DescribeExportResult) obj;
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
        if (other.getFailureReasons() == null ^ this.getFailureReasons() == null)
            return false;
        if (other.getFailureReasons() != null && other.getFailureReasons().equals(this.getFailureReasons()) == false)
            return false;
        if (other.getDownloadUrl() == null ^ this.getDownloadUrl() == null)
            return false;
        if (other.getDownloadUrl() != null && other.getDownloadUrl().equals(this.getDownloadUrl()) == false)
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
        hashCode = prime * hashCode + ((getFailureReasons() == null) ? 0 : getFailureReasons().hashCode());
        hashCode = prime * hashCode + ((getDownloadUrl() == null) ? 0 : getDownloadUrl().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExportResult clone() {
        try {
            return (DescribeExportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
