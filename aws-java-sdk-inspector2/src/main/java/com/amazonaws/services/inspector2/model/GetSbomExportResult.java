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
package com.amazonaws.services.inspector2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetSbomExport" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetSbomExportResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An error code.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * An error message.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * Contains details about the resource filter criteria used for the software bill of materials (SBOM) report.
     * </p>
     */
    private ResourceFilterCriteria filterCriteria;
    /**
     * <p>
     * The format of the software bill of materials (SBOM) report.
     * </p>
     */
    private String format;
    /**
     * <p>
     * The report ID of the software bill of materials (SBOM) report.
     * </p>
     */
    private String reportId;

    private Destination s3Destination;
    /**
     * <p>
     * The status of the software bill of materials (SBOM) report.
     * </p>
     */
    private String status;

    /**
     * <p>
     * An error code.
     * </p>
     * 
     * @param errorCode
     *        An error code.
     * @see ReportingErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * An error code.
     * </p>
     * 
     * @return An error code.
     * @see ReportingErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * An error code.
     * </p>
     * 
     * @param errorCode
     *        An error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportingErrorCode
     */

    public GetSbomExportResult withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * An error code.
     * </p>
     * 
     * @param errorCode
     *        An error code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportingErrorCode
     */

    public GetSbomExportResult withErrorCode(ReportingErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * An error message.
     * </p>
     * 
     * @param errorMessage
     *        An error message.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * An error message.
     * </p>
     * 
     * @return An error message.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * An error message.
     * </p>
     * 
     * @param errorMessage
     *        An error message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSbomExportResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * Contains details about the resource filter criteria used for the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param filterCriteria
     *        Contains details about the resource filter criteria used for the software bill of materials (SBOM) report.
     */

    public void setFilterCriteria(ResourceFilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * <p>
     * Contains details about the resource filter criteria used for the software bill of materials (SBOM) report.
     * </p>
     * 
     * @return Contains details about the resource filter criteria used for the software bill of materials (SBOM)
     *         report.
     */

    public ResourceFilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }

    /**
     * <p>
     * Contains details about the resource filter criteria used for the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param filterCriteria
     *        Contains details about the resource filter criteria used for the software bill of materials (SBOM) report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSbomExportResult withFilterCriteria(ResourceFilterCriteria filterCriteria) {
        setFilterCriteria(filterCriteria);
        return this;
    }

    /**
     * <p>
     * The format of the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param format
     *        The format of the software bill of materials (SBOM) report.
     * @see SbomReportFormat
     */

    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * <p>
     * The format of the software bill of materials (SBOM) report.
     * </p>
     * 
     * @return The format of the software bill of materials (SBOM) report.
     * @see SbomReportFormat
     */

    public String getFormat() {
        return this.format;
    }

    /**
     * <p>
     * The format of the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param format
     *        The format of the software bill of materials (SBOM) report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SbomReportFormat
     */

    public GetSbomExportResult withFormat(String format) {
        setFormat(format);
        return this;
    }

    /**
     * <p>
     * The format of the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param format
     *        The format of the software bill of materials (SBOM) report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SbomReportFormat
     */

    public GetSbomExportResult withFormat(SbomReportFormat format) {
        this.format = format.toString();
        return this;
    }

    /**
     * <p>
     * The report ID of the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param reportId
     *        The report ID of the software bill of materials (SBOM) report.
     */

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * <p>
     * The report ID of the software bill of materials (SBOM) report.
     * </p>
     * 
     * @return The report ID of the software bill of materials (SBOM) report.
     */

    public String getReportId() {
        return this.reportId;
    }

    /**
     * <p>
     * The report ID of the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param reportId
     *        The report ID of the software bill of materials (SBOM) report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSbomExportResult withReportId(String reportId) {
        setReportId(reportId);
        return this;
    }

    /**
     * @param s3Destination
     */

    public void setS3Destination(Destination s3Destination) {
        this.s3Destination = s3Destination;
    }

    /**
     * @return
     */

    public Destination getS3Destination() {
        return this.s3Destination;
    }

    /**
     * @param s3Destination
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetSbomExportResult withS3Destination(Destination s3Destination) {
        setS3Destination(s3Destination);
        return this;
    }

    /**
     * <p>
     * The status of the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param status
     *        The status of the software bill of materials (SBOM) report.
     * @see ExternalReportStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the software bill of materials (SBOM) report.
     * </p>
     * 
     * @return The status of the software bill of materials (SBOM) report.
     * @see ExternalReportStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param status
     *        The status of the software bill of materials (SBOM) report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExternalReportStatus
     */

    public GetSbomExportResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the software bill of materials (SBOM) report.
     * </p>
     * 
     * @param status
     *        The status of the software bill of materials (SBOM) report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExternalReportStatus
     */

    public GetSbomExportResult withStatus(ExternalReportStatus status) {
        this.status = status.toString();
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
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getFilterCriteria() != null)
            sb.append("FilterCriteria: ").append(getFilterCriteria()).append(",");
        if (getFormat() != null)
            sb.append("Format: ").append(getFormat()).append(",");
        if (getReportId() != null)
            sb.append("ReportId: ").append(getReportId()).append(",");
        if (getS3Destination() != null)
            sb.append("S3Destination: ").append(getS3Destination()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetSbomExportResult == false)
            return false;
        GetSbomExportResult other = (GetSbomExportResult) obj;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getFilterCriteria() == null ^ this.getFilterCriteria() == null)
            return false;
        if (other.getFilterCriteria() != null && other.getFilterCriteria().equals(this.getFilterCriteria()) == false)
            return false;
        if (other.getFormat() == null ^ this.getFormat() == null)
            return false;
        if (other.getFormat() != null && other.getFormat().equals(this.getFormat()) == false)
            return false;
        if (other.getReportId() == null ^ this.getReportId() == null)
            return false;
        if (other.getReportId() != null && other.getReportId().equals(this.getReportId()) == false)
            return false;
        if (other.getS3Destination() == null ^ this.getS3Destination() == null)
            return false;
        if (other.getS3Destination() != null && other.getS3Destination().equals(this.getS3Destination()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getFilterCriteria() == null) ? 0 : getFilterCriteria().hashCode());
        hashCode = prime * hashCode + ((getFormat() == null) ? 0 : getFormat().hashCode());
        hashCode = prime * hashCode + ((getReportId() == null) ? 0 : getReportId().hashCode());
        hashCode = prime * hashCode + ((getS3Destination() == null) ? 0 : getS3Destination().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetSbomExportResult clone() {
        try {
            return (GetSbomExportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
