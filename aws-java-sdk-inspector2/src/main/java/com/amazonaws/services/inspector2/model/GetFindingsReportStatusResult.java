/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector2-2020-06-08/GetFindingsReportStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFindingsReportStatusResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The destination of the report.
     * </p>
     */
    private Destination destination;
    /**
     * <p>
     * The error code of the report.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * The error message of the report.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * The filter criteria associated with the report.
     * </p>
     */
    private FilterCriteria filterCriteria;
    /**
     * <p>
     * The ID of the report.
     * </p>
     */
    private String reportId;
    /**
     * <p>
     * The status of the report.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The destination of the report.
     * </p>
     * 
     * @param destination
     *        The destination of the report.
     */

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The destination of the report.
     * </p>
     * 
     * @return The destination of the report.
     */

    public Destination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The destination of the report.
     * </p>
     * 
     * @param destination
     *        The destination of the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsReportStatusResult withDestination(Destination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The error code of the report.
     * </p>
     * 
     * @param errorCode
     *        The error code of the report.
     * @see ReportingErrorCode
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * The error code of the report.
     * </p>
     * 
     * @return The error code of the report.
     * @see ReportingErrorCode
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * The error code of the report.
     * </p>
     * 
     * @param errorCode
     *        The error code of the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportingErrorCode
     */

    public GetFindingsReportStatusResult withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * The error code of the report.
     * </p>
     * 
     * @param errorCode
     *        The error code of the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReportingErrorCode
     */

    public GetFindingsReportStatusResult withErrorCode(ReportingErrorCode errorCode) {
        this.errorCode = errorCode.toString();
        return this;
    }

    /**
     * <p>
     * The error message of the report.
     * </p>
     * 
     * @param errorMessage
     *        The error message of the report.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * The error message of the report.
     * </p>
     * 
     * @return The error message of the report.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * The error message of the report.
     * </p>
     * 
     * @param errorMessage
     *        The error message of the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsReportStatusResult withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * The filter criteria associated with the report.
     * </p>
     * 
     * @param filterCriteria
     *        The filter criteria associated with the report.
     */

    public void setFilterCriteria(FilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * <p>
     * The filter criteria associated with the report.
     * </p>
     * 
     * @return The filter criteria associated with the report.
     */

    public FilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }

    /**
     * <p>
     * The filter criteria associated with the report.
     * </p>
     * 
     * @param filterCriteria
     *        The filter criteria associated with the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsReportStatusResult withFilterCriteria(FilterCriteria filterCriteria) {
        setFilterCriteria(filterCriteria);
        return this;
    }

    /**
     * <p>
     * The ID of the report.
     * </p>
     * 
     * @param reportId
     *        The ID of the report.
     */

    public void setReportId(String reportId) {
        this.reportId = reportId;
    }

    /**
     * <p>
     * The ID of the report.
     * </p>
     * 
     * @return The ID of the report.
     */

    public String getReportId() {
        return this.reportId;
    }

    /**
     * <p>
     * The ID of the report.
     * </p>
     * 
     * @param reportId
     *        The ID of the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFindingsReportStatusResult withReportId(String reportId) {
        setReportId(reportId);
        return this;
    }

    /**
     * <p>
     * The status of the report.
     * </p>
     * 
     * @param status
     *        The status of the report.
     * @see ExternalReportStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the report.
     * </p>
     * 
     * @return The status of the report.
     * @see ExternalReportStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the report.
     * </p>
     * 
     * @param status
     *        The status of the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExternalReportStatus
     */

    public GetFindingsReportStatusResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the report.
     * </p>
     * 
     * @param status
     *        The status of the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExternalReportStatus
     */

    public GetFindingsReportStatusResult withStatus(ExternalReportStatus status) {
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getFilterCriteria() != null)
            sb.append("FilterCriteria: ").append(getFilterCriteria()).append(",");
        if (getReportId() != null)
            sb.append("ReportId: ").append(getReportId()).append(",");
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

        if (obj instanceof GetFindingsReportStatusResult == false)
            return false;
        GetFindingsReportStatusResult other = (GetFindingsReportStatusResult) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
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
        if (other.getReportId() == null ^ this.getReportId() == null)
            return false;
        if (other.getReportId() != null && other.getReportId().equals(this.getReportId()) == false)
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

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode());
        hashCode = prime * hashCode + ((getFilterCriteria() == null) ? 0 : getFilterCriteria().hashCode());
        hashCode = prime * hashCode + ((getReportId() == null) ? 0 : getReportId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetFindingsReportStatusResult clone() {
        try {
            return (GetFindingsReportStatusResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
