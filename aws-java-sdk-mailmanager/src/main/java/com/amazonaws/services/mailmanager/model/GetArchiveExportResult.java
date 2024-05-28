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
package com.amazonaws.services.mailmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The response containing details of the specified archive export job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mailmanager-2023-10-17/GetArchiveExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetArchiveExportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the archive the email export was performed from.
     * </p>
     */
    private String archiveId;
    /**
     * <p>
     * Where the exported emails are being delivered.
     * </p>
     */
    private ExportDestinationConfiguration exportDestinationConfiguration;
    /**
     * <p>
     * The criteria used to filter emails included in the export.
     * </p>
     */
    private ArchiveFilters filters;
    /**
     * <p>
     * The start of the timestamp range the exported emails cover.
     * </p>
     */
    private java.util.Date fromTimestamp;
    /**
     * <p>
     * The maximum number of email items included in the export.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The current status of the export job.
     * </p>
     */
    private ExportStatus status;
    /**
     * <p>
     * The end of the date range the exported emails cover.
     * </p>
     */
    private java.util.Date toTimestamp;

    /**
     * <p>
     * The identifier of the archive the email export was performed from.
     * </p>
     * 
     * @param archiveId
     *        The identifier of the archive the email export was performed from.
     */

    public void setArchiveId(String archiveId) {
        this.archiveId = archiveId;
    }

    /**
     * <p>
     * The identifier of the archive the email export was performed from.
     * </p>
     * 
     * @return The identifier of the archive the email export was performed from.
     */

    public String getArchiveId() {
        return this.archiveId;
    }

    /**
     * <p>
     * The identifier of the archive the email export was performed from.
     * </p>
     * 
     * @param archiveId
     *        The identifier of the archive the email export was performed from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveExportResult withArchiveId(String archiveId) {
        setArchiveId(archiveId);
        return this;
    }

    /**
     * <p>
     * Where the exported emails are being delivered.
     * </p>
     * 
     * @param exportDestinationConfiguration
     *        Where the exported emails are being delivered.
     */

    public void setExportDestinationConfiguration(ExportDestinationConfiguration exportDestinationConfiguration) {
        this.exportDestinationConfiguration = exportDestinationConfiguration;
    }

    /**
     * <p>
     * Where the exported emails are being delivered.
     * </p>
     * 
     * @return Where the exported emails are being delivered.
     */

    public ExportDestinationConfiguration getExportDestinationConfiguration() {
        return this.exportDestinationConfiguration;
    }

    /**
     * <p>
     * Where the exported emails are being delivered.
     * </p>
     * 
     * @param exportDestinationConfiguration
     *        Where the exported emails are being delivered.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveExportResult withExportDestinationConfiguration(ExportDestinationConfiguration exportDestinationConfiguration) {
        setExportDestinationConfiguration(exportDestinationConfiguration);
        return this;
    }

    /**
     * <p>
     * The criteria used to filter emails included in the export.
     * </p>
     * 
     * @param filters
     *        The criteria used to filter emails included in the export.
     */

    public void setFilters(ArchiveFilters filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The criteria used to filter emails included in the export.
     * </p>
     * 
     * @return The criteria used to filter emails included in the export.
     */

    public ArchiveFilters getFilters() {
        return this.filters;
    }

    /**
     * <p>
     * The criteria used to filter emails included in the export.
     * </p>
     * 
     * @param filters
     *        The criteria used to filter emails included in the export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveExportResult withFilters(ArchiveFilters filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The start of the timestamp range the exported emails cover.
     * </p>
     * 
     * @param fromTimestamp
     *        The start of the timestamp range the exported emails cover.
     */

    public void setFromTimestamp(java.util.Date fromTimestamp) {
        this.fromTimestamp = fromTimestamp;
    }

    /**
     * <p>
     * The start of the timestamp range the exported emails cover.
     * </p>
     * 
     * @return The start of the timestamp range the exported emails cover.
     */

    public java.util.Date getFromTimestamp() {
        return this.fromTimestamp;
    }

    /**
     * <p>
     * The start of the timestamp range the exported emails cover.
     * </p>
     * 
     * @param fromTimestamp
     *        The start of the timestamp range the exported emails cover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveExportResult withFromTimestamp(java.util.Date fromTimestamp) {
        setFromTimestamp(fromTimestamp);
        return this;
    }

    /**
     * <p>
     * The maximum number of email items included in the export.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of email items included in the export.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of email items included in the export.
     * </p>
     * 
     * @return The maximum number of email items included in the export.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of email items included in the export.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of email items included in the export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveExportResult withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The current status of the export job.
     * </p>
     * 
     * @param status
     *        The current status of the export job.
     */

    public void setStatus(ExportStatus status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the export job.
     * </p>
     * 
     * @return The current status of the export job.
     */

    public ExportStatus getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the export job.
     * </p>
     * 
     * @param status
     *        The current status of the export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveExportResult withStatus(ExportStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The end of the date range the exported emails cover.
     * </p>
     * 
     * @param toTimestamp
     *        The end of the date range the exported emails cover.
     */

    public void setToTimestamp(java.util.Date toTimestamp) {
        this.toTimestamp = toTimestamp;
    }

    /**
     * <p>
     * The end of the date range the exported emails cover.
     * </p>
     * 
     * @return The end of the date range the exported emails cover.
     */

    public java.util.Date getToTimestamp() {
        return this.toTimestamp;
    }

    /**
     * <p>
     * The end of the date range the exported emails cover.
     * </p>
     * 
     * @param toTimestamp
     *        The end of the date range the exported emails cover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetArchiveExportResult withToTimestamp(java.util.Date toTimestamp) {
        setToTimestamp(toTimestamp);
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
        if (getArchiveId() != null)
            sb.append("ArchiveId: ").append(getArchiveId()).append(",");
        if (getExportDestinationConfiguration() != null)
            sb.append("ExportDestinationConfiguration: ").append(getExportDestinationConfiguration()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getFromTimestamp() != null)
            sb.append("FromTimestamp: ").append(getFromTimestamp()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getToTimestamp() != null)
            sb.append("ToTimestamp: ").append(getToTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetArchiveExportResult == false)
            return false;
        GetArchiveExportResult other = (GetArchiveExportResult) obj;
        if (other.getArchiveId() == null ^ this.getArchiveId() == null)
            return false;
        if (other.getArchiveId() != null && other.getArchiveId().equals(this.getArchiveId()) == false)
            return false;
        if (other.getExportDestinationConfiguration() == null ^ this.getExportDestinationConfiguration() == null)
            return false;
        if (other.getExportDestinationConfiguration() != null
                && other.getExportDestinationConfiguration().equals(this.getExportDestinationConfiguration()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getFromTimestamp() == null ^ this.getFromTimestamp() == null)
            return false;
        if (other.getFromTimestamp() != null && other.getFromTimestamp().equals(this.getFromTimestamp()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getToTimestamp() == null ^ this.getToTimestamp() == null)
            return false;
        if (other.getToTimestamp() != null && other.getToTimestamp().equals(this.getToTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchiveId() == null) ? 0 : getArchiveId().hashCode());
        hashCode = prime * hashCode + ((getExportDestinationConfiguration() == null) ? 0 : getExportDestinationConfiguration().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getFromTimestamp() == null) ? 0 : getFromTimestamp().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getToTimestamp() == null) ? 0 : getToTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public GetArchiveExportResult clone() {
        try {
            return (GetArchiveExportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
