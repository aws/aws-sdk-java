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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Indicates whether DataSync created a complete <a
 * href="https://docs.aws.amazon.com/datasync/latest/userguide/task-reports.html">task report</a> for your transfer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/ReportResult" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Indicates whether DataSync is still working on your report, created a report, or can't create a complete report.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Indicates the code associated with the error if DataSync can't create a complete report.
     * </p>
     */
    private String errorCode;
    /**
     * <p>
     * Provides details about issues creating a report.
     * </p>
     */
    private String errorDetail;

    /**
     * <p>
     * Indicates whether DataSync is still working on your report, created a report, or can't create a complete report.
     * </p>
     * 
     * @param status
     *        Indicates whether DataSync is still working on your report, created a report, or can't create a complete
     *        report.
     * @see PhaseStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates whether DataSync is still working on your report, created a report, or can't create a complete report.
     * </p>
     * 
     * @return Indicates whether DataSync is still working on your report, created a report, or can't create a complete
     *         report.
     * @see PhaseStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates whether DataSync is still working on your report, created a report, or can't create a complete report.
     * </p>
     * 
     * @param status
     *        Indicates whether DataSync is still working on your report, created a report, or can't create a complete
     *        report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhaseStatus
     */

    public ReportResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates whether DataSync is still working on your report, created a report, or can't create a complete report.
     * </p>
     * 
     * @param status
     *        Indicates whether DataSync is still working on your report, created a report, or can't create a complete
     *        report.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PhaseStatus
     */

    public ReportResult withStatus(PhaseStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the code associated with the error if DataSync can't create a complete report.
     * </p>
     * 
     * @param errorCode
     *        Indicates the code associated with the error if DataSync can't create a complete report.
     */

    public void setErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    /**
     * <p>
     * Indicates the code associated with the error if DataSync can't create a complete report.
     * </p>
     * 
     * @return Indicates the code associated with the error if DataSync can't create a complete report.
     */

    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * <p>
     * Indicates the code associated with the error if DataSync can't create a complete report.
     * </p>
     * 
     * @param errorCode
     *        Indicates the code associated with the error if DataSync can't create a complete report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportResult withErrorCode(String errorCode) {
        setErrorCode(errorCode);
        return this;
    }

    /**
     * <p>
     * Provides details about issues creating a report.
     * </p>
     * 
     * @param errorDetail
     *        Provides details about issues creating a report.
     */

    public void setErrorDetail(String errorDetail) {
        this.errorDetail = errorDetail;
    }

    /**
     * <p>
     * Provides details about issues creating a report.
     * </p>
     * 
     * @return Provides details about issues creating a report.
     */

    public String getErrorDetail() {
        return this.errorDetail;
    }

    /**
     * <p>
     * Provides details about issues creating a report.
     * </p>
     * 
     * @param errorDetail
     *        Provides details about issues creating a report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportResult withErrorDetail(String errorDetail) {
        setErrorDetail(errorDetail);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorCode() != null)
            sb.append("ErrorCode: ").append(getErrorCode()).append(",");
        if (getErrorDetail() != null)
            sb.append("ErrorDetail: ").append(getErrorDetail());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportResult == false)
            return false;
        ReportResult other = (ReportResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorCode() == null ^ this.getErrorCode() == null)
            return false;
        if (other.getErrorCode() != null && other.getErrorCode().equals(this.getErrorCode()) == false)
            return false;
        if (other.getErrorDetail() == null ^ this.getErrorDetail() == null)
            return false;
        if (other.getErrorDetail() != null && other.getErrorDetail().equals(this.getErrorDetail()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorCode() == null) ? 0 : getErrorCode().hashCode());
        hashCode = prime * hashCode + ((getErrorDetail() == null) ? 0 : getErrorDetail().hashCode());
        return hashCode;
    }

    @Override
    public ReportResult clone() {
        try {
            return (ReportResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.datasync.model.transform.ReportResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
