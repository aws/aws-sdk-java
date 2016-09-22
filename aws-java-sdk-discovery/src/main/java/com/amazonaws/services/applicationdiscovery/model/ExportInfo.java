/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;

/**
 * <p>
 * Information regarding the export status of the discovered data. The value is an array of objects.
 * </p>
 */
public class ExportInfo implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier that you can use to query the export.
     * </p>
     */
    private String exportId;
    /**
     * <p>
     * The status of the configuration data export. The status can succeed, fail, or be in-progress.
     * </p>
     */
    private String exportStatus;
    /**
     * <p>
     * Helpful status messages for API callers. For example: Too many exports in the last 6 hours. Export in progress.
     * Export was successful.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * A URL for an Amazon S3 bucket where you can review the configuration data. The URL is displayed only if the
     * export succeeded.
     * </p>
     */
    private String configurationsDownloadUrl;
    /**
     * <p>
     * The time the configuration data export was initiated.
     * </p>
     */
    private java.util.Date exportRequestTime;

    /**
     * <p>
     * A unique identifier that you can use to query the export.
     * </p>
     * 
     * @param exportId
     *        A unique identifier that you can use to query the export.
     */

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    /**
     * <p>
     * A unique identifier that you can use to query the export.
     * </p>
     * 
     * @return A unique identifier that you can use to query the export.
     */

    public String getExportId() {
        return this.exportId;
    }

    /**
     * <p>
     * A unique identifier that you can use to query the export.
     * </p>
     * 
     * @param exportId
     *        A unique identifier that you can use to query the export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportInfo withExportId(String exportId) {
        setExportId(exportId);
        return this;
    }

    /**
     * <p>
     * The status of the configuration data export. The status can succeed, fail, or be in-progress.
     * </p>
     * 
     * @param exportStatus
     *        The status of the configuration data export. The status can succeed, fail, or be in-progress.
     * @see ExportStatus
     */

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
     * <p>
     * The status of the configuration data export. The status can succeed, fail, or be in-progress.
     * </p>
     * 
     * @return The status of the configuration data export. The status can succeed, fail, or be in-progress.
     * @see ExportStatus
     */

    public String getExportStatus() {
        return this.exportStatus;
    }

    /**
     * <p>
     * The status of the configuration data export. The status can succeed, fail, or be in-progress.
     * </p>
     * 
     * @param exportStatus
     *        The status of the configuration data export. The status can succeed, fail, or be in-progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public ExportInfo withExportStatus(String exportStatus) {
        setExportStatus(exportStatus);
        return this;
    }

    /**
     * <p>
     * The status of the configuration data export. The status can succeed, fail, or be in-progress.
     * </p>
     * 
     * @param exportStatus
     *        The status of the configuration data export. The status can succeed, fail, or be in-progress.
     * @see ExportStatus
     */

    public void setExportStatus(ExportStatus exportStatus) {
        this.exportStatus = exportStatus.toString();
    }

    /**
     * <p>
     * The status of the configuration data export. The status can succeed, fail, or be in-progress.
     * </p>
     * 
     * @param exportStatus
     *        The status of the configuration data export. The status can succeed, fail, or be in-progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public ExportInfo withExportStatus(ExportStatus exportStatus) {
        setExportStatus(exportStatus);
        return this;
    }

    /**
     * <p>
     * Helpful status messages for API callers. For example: Too many exports in the last 6 hours. Export in progress.
     * Export was successful.
     * </p>
     * 
     * @param statusMessage
     *        Helpful status messages for API callers. For example: Too many exports in the last 6 hours. Export in
     *        progress. Export was successful.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * Helpful status messages for API callers. For example: Too many exports in the last 6 hours. Export in progress.
     * Export was successful.
     * </p>
     * 
     * @return Helpful status messages for API callers. For example: Too many exports in the last 6 hours. Export in
     *         progress. Export was successful.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * Helpful status messages for API callers. For example: Too many exports in the last 6 hours. Export in progress.
     * Export was successful.
     * </p>
     * 
     * @param statusMessage
     *        Helpful status messages for API callers. For example: Too many exports in the last 6 hours. Export in
     *        progress. Export was successful.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportInfo withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you can review the configuration data. The URL is displayed only if the
     * export succeeded.
     * </p>
     * 
     * @param configurationsDownloadUrl
     *        A URL for an Amazon S3 bucket where you can review the configuration data. The URL is displayed only if
     *        the export succeeded.
     */

    public void setConfigurationsDownloadUrl(String configurationsDownloadUrl) {
        this.configurationsDownloadUrl = configurationsDownloadUrl;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you can review the configuration data. The URL is displayed only if the
     * export succeeded.
     * </p>
     * 
     * @return A URL for an Amazon S3 bucket where you can review the configuration data. The URL is displayed only if
     *         the export succeeded.
     */

    public String getConfigurationsDownloadUrl() {
        return this.configurationsDownloadUrl;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you can review the configuration data. The URL is displayed only if the
     * export succeeded.
     * </p>
     * 
     * @param configurationsDownloadUrl
     *        A URL for an Amazon S3 bucket where you can review the configuration data. The URL is displayed only if
     *        the export succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportInfo withConfigurationsDownloadUrl(String configurationsDownloadUrl) {
        setConfigurationsDownloadUrl(configurationsDownloadUrl);
        return this;
    }

    /**
     * <p>
     * The time the configuration data export was initiated.
     * </p>
     * 
     * @param exportRequestTime
     *        The time the configuration data export was initiated.
     */

    public void setExportRequestTime(java.util.Date exportRequestTime) {
        this.exportRequestTime = exportRequestTime;
    }

    /**
     * <p>
     * The time the configuration data export was initiated.
     * </p>
     * 
     * @return The time the configuration data export was initiated.
     */

    public java.util.Date getExportRequestTime() {
        return this.exportRequestTime;
    }

    /**
     * <p>
     * The time the configuration data export was initiated.
     * </p>
     * 
     * @param exportRequestTime
     *        The time the configuration data export was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportInfo withExportRequestTime(java.util.Date exportRequestTime) {
        setExportRequestTime(exportRequestTime);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ExportId: " + getExportId() + ",");
        if (getExportStatus() != null)
            sb.append("ExportStatus: " + getExportStatus() + ",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: " + getStatusMessage() + ",");
        if (getConfigurationsDownloadUrl() != null)
            sb.append("ConfigurationsDownloadUrl: " + getConfigurationsDownloadUrl() + ",");
        if (getExportRequestTime() != null)
            sb.append("ExportRequestTime: " + getExportRequestTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExportInfo == false)
            return false;
        ExportInfo other = (ExportInfo) obj;
        if (other.getExportId() == null ^ this.getExportId() == null)
            return false;
        if (other.getExportId() != null && other.getExportId().equals(this.getExportId()) == false)
            return false;
        if (other.getExportStatus() == null ^ this.getExportStatus() == null)
            return false;
        if (other.getExportStatus() != null && other.getExportStatus().equals(this.getExportStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getConfigurationsDownloadUrl() == null ^ this.getConfigurationsDownloadUrl() == null)
            return false;
        if (other.getConfigurationsDownloadUrl() != null && other.getConfigurationsDownloadUrl().equals(this.getConfigurationsDownloadUrl()) == false)
            return false;
        if (other.getExportRequestTime() == null ^ this.getExportRequestTime() == null)
            return false;
        if (other.getExportRequestTime() != null && other.getExportRequestTime().equals(this.getExportRequestTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExportId() == null) ? 0 : getExportId().hashCode());
        hashCode = prime * hashCode + ((getExportStatus() == null) ? 0 : getExportStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getConfigurationsDownloadUrl() == null) ? 0 : getConfigurationsDownloadUrl().hashCode());
        hashCode = prime * hashCode + ((getExportRequestTime() == null) ? 0 : getExportRequestTime().hashCode());
        return hashCode;
    }

    @Override
    public ExportInfo clone() {
        try {
            return (ExportInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
