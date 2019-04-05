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
package com.amazonaws.services.applicationdiscovery.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information regarding the export status of discovered data. The value is an array of objects.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExportInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier used to query an export.
     * </p>
     */
    private String exportId;
    /**
     * <p>
     * The status of the data export job.
     * </p>
     */
    private String exportStatus;
    /**
     * <p>
     * A status message provided for API callers.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * A URL for an Amazon S3 bucket where you can review the exported data. The URL is displayed only if the export
     * succeeded.
     * </p>
     */
    private String configurationsDownloadUrl;
    /**
     * <p>
     * The time that the data export was initiated.
     * </p>
     */
    private java.util.Date exportRequestTime;
    /**
     * <p>
     * If true, the export of agent information exceeded the size limit for a single export and the exported data is
     * incomplete for the requested time range. To address this, select a smaller time range for the export by using
     * <code>startDate</code> and <code>endDate</code>.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * The value of <code>startTime</code> parameter in the <code>StartExportTask</code> request. If no
     * <code>startTime</code> was requested, this result does not appear in <code>ExportInfo</code>.
     * </p>
     */
    private java.util.Date requestedStartTime;
    /**
     * <p>
     * The <code>endTime</code> used in the <code>StartExportTask</code> request. If no <code>endTime</code> was
     * requested, this result does not appear in <code>ExportInfo</code>.
     * </p>
     */
    private java.util.Date requestedEndTime;

    /**
     * <p>
     * A unique identifier used to query an export.
     * </p>
     * 
     * @param exportId
     *        A unique identifier used to query an export.
     */

    public void setExportId(String exportId) {
        this.exportId = exportId;
    }

    /**
     * <p>
     * A unique identifier used to query an export.
     * </p>
     * 
     * @return A unique identifier used to query an export.
     */

    public String getExportId() {
        return this.exportId;
    }

    /**
     * <p>
     * A unique identifier used to query an export.
     * </p>
     * 
     * @param exportId
     *        A unique identifier used to query an export.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportInfo withExportId(String exportId) {
        setExportId(exportId);
        return this;
    }

    /**
     * <p>
     * The status of the data export job.
     * </p>
     * 
     * @param exportStatus
     *        The status of the data export job.
     * @see ExportStatus
     */

    public void setExportStatus(String exportStatus) {
        this.exportStatus = exportStatus;
    }

    /**
     * <p>
     * The status of the data export job.
     * </p>
     * 
     * @return The status of the data export job.
     * @see ExportStatus
     */

    public String getExportStatus() {
        return this.exportStatus;
    }

    /**
     * <p>
     * The status of the data export job.
     * </p>
     * 
     * @param exportStatus
     *        The status of the data export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public ExportInfo withExportStatus(String exportStatus) {
        setExportStatus(exportStatus);
        return this;
    }

    /**
     * <p>
     * The status of the data export job.
     * </p>
     * 
     * @param exportStatus
     *        The status of the data export job.
     * @see ExportStatus
     */

    public void setExportStatus(ExportStatus exportStatus) {
        withExportStatus(exportStatus);
    }

    /**
     * <p>
     * The status of the data export job.
     * </p>
     * 
     * @param exportStatus
     *        The status of the data export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExportStatus
     */

    public ExportInfo withExportStatus(ExportStatus exportStatus) {
        this.exportStatus = exportStatus.toString();
        return this;
    }

    /**
     * <p>
     * A status message provided for API callers.
     * </p>
     * 
     * @param statusMessage
     *        A status message provided for API callers.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A status message provided for API callers.
     * </p>
     * 
     * @return A status message provided for API callers.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A status message provided for API callers.
     * </p>
     * 
     * @param statusMessage
     *        A status message provided for API callers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportInfo withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you can review the exported data. The URL is displayed only if the export
     * succeeded.
     * </p>
     * 
     * @param configurationsDownloadUrl
     *        A URL for an Amazon S3 bucket where you can review the exported data. The URL is displayed only if the
     *        export succeeded.
     */

    public void setConfigurationsDownloadUrl(String configurationsDownloadUrl) {
        this.configurationsDownloadUrl = configurationsDownloadUrl;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you can review the exported data. The URL is displayed only if the export
     * succeeded.
     * </p>
     * 
     * @return A URL for an Amazon S3 bucket where you can review the exported data. The URL is displayed only if the
     *         export succeeded.
     */

    public String getConfigurationsDownloadUrl() {
        return this.configurationsDownloadUrl;
    }

    /**
     * <p>
     * A URL for an Amazon S3 bucket where you can review the exported data. The URL is displayed only if the export
     * succeeded.
     * </p>
     * 
     * @param configurationsDownloadUrl
     *        A URL for an Amazon S3 bucket where you can review the exported data. The URL is displayed only if the
     *        export succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportInfo withConfigurationsDownloadUrl(String configurationsDownloadUrl) {
        setConfigurationsDownloadUrl(configurationsDownloadUrl);
        return this;
    }

    /**
     * <p>
     * The time that the data export was initiated.
     * </p>
     * 
     * @param exportRequestTime
     *        The time that the data export was initiated.
     */

    public void setExportRequestTime(java.util.Date exportRequestTime) {
        this.exportRequestTime = exportRequestTime;
    }

    /**
     * <p>
     * The time that the data export was initiated.
     * </p>
     * 
     * @return The time that the data export was initiated.
     */

    public java.util.Date getExportRequestTime() {
        return this.exportRequestTime;
    }

    /**
     * <p>
     * The time that the data export was initiated.
     * </p>
     * 
     * @param exportRequestTime
     *        The time that the data export was initiated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportInfo withExportRequestTime(java.util.Date exportRequestTime) {
        setExportRequestTime(exportRequestTime);
        return this;
    }

    /**
     * <p>
     * If true, the export of agent information exceeded the size limit for a single export and the exported data is
     * incomplete for the requested time range. To address this, select a smaller time range for the export by using
     * <code>startDate</code> and <code>endDate</code>.
     * </p>
     * 
     * @param isTruncated
     *        If true, the export of agent information exceeded the size limit for a single export and the exported data
     *        is incomplete for the requested time range. To address this, select a smaller time range for the export by
     *        using <code>startDate</code> and <code>endDate</code>.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * If true, the export of agent information exceeded the size limit for a single export and the exported data is
     * incomplete for the requested time range. To address this, select a smaller time range for the export by using
     * <code>startDate</code> and <code>endDate</code>.
     * </p>
     * 
     * @return If true, the export of agent information exceeded the size limit for a single export and the exported
     *         data is incomplete for the requested time range. To address this, select a smaller time range for the
     *         export by using <code>startDate</code> and <code>endDate</code>.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * If true, the export of agent information exceeded the size limit for a single export and the exported data is
     * incomplete for the requested time range. To address this, select a smaller time range for the export by using
     * <code>startDate</code> and <code>endDate</code>.
     * </p>
     * 
     * @param isTruncated
     *        If true, the export of agent information exceeded the size limit for a single export and the exported data
     *        is incomplete for the requested time range. To address this, select a smaller time range for the export by
     *        using <code>startDate</code> and <code>endDate</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportInfo withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * If true, the export of agent information exceeded the size limit for a single export and the exported data is
     * incomplete for the requested time range. To address this, select a smaller time range for the export by using
     * <code>startDate</code> and <code>endDate</code>.
     * </p>
     * 
     * @return If true, the export of agent information exceeded the size limit for a single export and the exported
     *         data is incomplete for the requested time range. To address this, select a smaller time range for the
     *         export by using <code>startDate</code> and <code>endDate</code>.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * The value of <code>startTime</code> parameter in the <code>StartExportTask</code> request. If no
     * <code>startTime</code> was requested, this result does not appear in <code>ExportInfo</code>.
     * </p>
     * 
     * @param requestedStartTime
     *        The value of <code>startTime</code> parameter in the <code>StartExportTask</code> request. If no
     *        <code>startTime</code> was requested, this result does not appear in <code>ExportInfo</code>.
     */

    public void setRequestedStartTime(java.util.Date requestedStartTime) {
        this.requestedStartTime = requestedStartTime;
    }

    /**
     * <p>
     * The value of <code>startTime</code> parameter in the <code>StartExportTask</code> request. If no
     * <code>startTime</code> was requested, this result does not appear in <code>ExportInfo</code>.
     * </p>
     * 
     * @return The value of <code>startTime</code> parameter in the <code>StartExportTask</code> request. If no
     *         <code>startTime</code> was requested, this result does not appear in <code>ExportInfo</code>.
     */

    public java.util.Date getRequestedStartTime() {
        return this.requestedStartTime;
    }

    /**
     * <p>
     * The value of <code>startTime</code> parameter in the <code>StartExportTask</code> request. If no
     * <code>startTime</code> was requested, this result does not appear in <code>ExportInfo</code>.
     * </p>
     * 
     * @param requestedStartTime
     *        The value of <code>startTime</code> parameter in the <code>StartExportTask</code> request. If no
     *        <code>startTime</code> was requested, this result does not appear in <code>ExportInfo</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportInfo withRequestedStartTime(java.util.Date requestedStartTime) {
        setRequestedStartTime(requestedStartTime);
        return this;
    }

    /**
     * <p>
     * The <code>endTime</code> used in the <code>StartExportTask</code> request. If no <code>endTime</code> was
     * requested, this result does not appear in <code>ExportInfo</code>.
     * </p>
     * 
     * @param requestedEndTime
     *        The <code>endTime</code> used in the <code>StartExportTask</code> request. If no <code>endTime</code> was
     *        requested, this result does not appear in <code>ExportInfo</code>.
     */

    public void setRequestedEndTime(java.util.Date requestedEndTime) {
        this.requestedEndTime = requestedEndTime;
    }

    /**
     * <p>
     * The <code>endTime</code> used in the <code>StartExportTask</code> request. If no <code>endTime</code> was
     * requested, this result does not appear in <code>ExportInfo</code>.
     * </p>
     * 
     * @return The <code>endTime</code> used in the <code>StartExportTask</code> request. If no <code>endTime</code> was
     *         requested, this result does not appear in <code>ExportInfo</code>.
     */

    public java.util.Date getRequestedEndTime() {
        return this.requestedEndTime;
    }

    /**
     * <p>
     * The <code>endTime</code> used in the <code>StartExportTask</code> request. If no <code>endTime</code> was
     * requested, this result does not appear in <code>ExportInfo</code>.
     * </p>
     * 
     * @param requestedEndTime
     *        The <code>endTime</code> used in the <code>StartExportTask</code> request. If no <code>endTime</code> was
     *        requested, this result does not appear in <code>ExportInfo</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExportInfo withRequestedEndTime(java.util.Date requestedEndTime) {
        setRequestedEndTime(requestedEndTime);
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
        if (getExportStatus() != null)
            sb.append("ExportStatus: ").append(getExportStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getConfigurationsDownloadUrl() != null)
            sb.append("ConfigurationsDownloadUrl: ").append(getConfigurationsDownloadUrl()).append(",");
        if (getExportRequestTime() != null)
            sb.append("ExportRequestTime: ").append(getExportRequestTime()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
        if (getRequestedStartTime() != null)
            sb.append("RequestedStartTime: ").append(getRequestedStartTime()).append(",");
        if (getRequestedEndTime() != null)
            sb.append("RequestedEndTime: ").append(getRequestedEndTime());
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
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getRequestedStartTime() == null ^ this.getRequestedStartTime() == null)
            return false;
        if (other.getRequestedStartTime() != null && other.getRequestedStartTime().equals(this.getRequestedStartTime()) == false)
            return false;
        if (other.getRequestedEndTime() == null ^ this.getRequestedEndTime() == null)
            return false;
        if (other.getRequestedEndTime() != null && other.getRequestedEndTime().equals(this.getRequestedEndTime()) == false)
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
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getRequestedStartTime() == null) ? 0 : getRequestedStartTime().hashCode());
        hashCode = prime * hashCode + ((getRequestedEndTime() == null) ? 0 : getRequestedEndTime().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.applicationdiscovery.model.transform.ExportInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
