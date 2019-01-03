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
package com.amazonaws.services.alexaforbusiness.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Usage report with specified parameters.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/alexaforbusiness-2017-11-09/BusinessReport" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BusinessReport implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
     * </p>
     */
    private String status;
    /**
     * <p>
     * The failure code.
     * </p>
     */
    private String failureCode;
    /**
     * <p>
     * The S3 location of the output reports.
     * </p>
     */
    private BusinessReportS3Location s3Location;
    /**
     * <p>
     * The time of report delivery.
     * </p>
     */
    private java.util.Date deliveryTime;
    /**
     * <p>
     * The download link where a user can download the report.
     * </p>
     */
    private String downloadUrl;

    /**
     * <p>
     * The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
     * </p>
     * 
     * @param status
     *        The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
     * @see BusinessReportStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
     * </p>
     * 
     * @return The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
     * @see BusinessReportStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
     * </p>
     * 
     * @param status
     *        The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BusinessReportStatus
     */

    public BusinessReport withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
     * </p>
     * 
     * @param status
     *        The status of the report generation execution (RUNNING, SUCCEEDED, or FAILED).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BusinessReportStatus
     */

    public BusinessReport withStatus(BusinessReportStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     * @see BusinessReportFailureCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @return The failure code.
     * @see BusinessReportFailureCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BusinessReportFailureCode
     */

    public BusinessReport withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The failure code.
     * </p>
     * 
     * @param failureCode
     *        The failure code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BusinessReportFailureCode
     */

    public BusinessReport withFailureCode(BusinessReportFailureCode failureCode) {
        this.failureCode = failureCode.toString();
        return this;
    }

    /**
     * <p>
     * The S3 location of the output reports.
     * </p>
     * 
     * @param s3Location
     *        The S3 location of the output reports.
     */

    public void setS3Location(BusinessReportS3Location s3Location) {
        this.s3Location = s3Location;
    }

    /**
     * <p>
     * The S3 location of the output reports.
     * </p>
     * 
     * @return The S3 location of the output reports.
     */

    public BusinessReportS3Location getS3Location() {
        return this.s3Location;
    }

    /**
     * <p>
     * The S3 location of the output reports.
     * </p>
     * 
     * @param s3Location
     *        The S3 location of the output reports.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BusinessReport withS3Location(BusinessReportS3Location s3Location) {
        setS3Location(s3Location);
        return this;
    }

    /**
     * <p>
     * The time of report delivery.
     * </p>
     * 
     * @param deliveryTime
     *        The time of report delivery.
     */

    public void setDeliveryTime(java.util.Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    /**
     * <p>
     * The time of report delivery.
     * </p>
     * 
     * @return The time of report delivery.
     */

    public java.util.Date getDeliveryTime() {
        return this.deliveryTime;
    }

    /**
     * <p>
     * The time of report delivery.
     * </p>
     * 
     * @param deliveryTime
     *        The time of report delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BusinessReport withDeliveryTime(java.util.Date deliveryTime) {
        setDeliveryTime(deliveryTime);
        return this;
    }

    /**
     * <p>
     * The download link where a user can download the report.
     * </p>
     * 
     * @param downloadUrl
     *        The download link where a user can download the report.
     */

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }

    /**
     * <p>
     * The download link where a user can download the report.
     * </p>
     * 
     * @return The download link where a user can download the report.
     */

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    /**
     * <p>
     * The download link where a user can download the report.
     * </p>
     * 
     * @param downloadUrl
     *        The download link where a user can download the report.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BusinessReport withDownloadUrl(String downloadUrl) {
        setDownloadUrl(downloadUrl);
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
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode()).append(",");
        if (getS3Location() != null)
            sb.append("S3Location: ").append(getS3Location()).append(",");
        if (getDeliveryTime() != null)
            sb.append("DeliveryTime: ").append(getDeliveryTime()).append(",");
        if (getDownloadUrl() != null)
            sb.append("DownloadUrl: ").append(getDownloadUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BusinessReport == false)
            return false;
        BusinessReport other = (BusinessReport) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        if (other.getS3Location() == null ^ this.getS3Location() == null)
            return false;
        if (other.getS3Location() != null && other.getS3Location().equals(this.getS3Location()) == false)
            return false;
        if (other.getDeliveryTime() == null ^ this.getDeliveryTime() == null)
            return false;
        if (other.getDeliveryTime() != null && other.getDeliveryTime().equals(this.getDeliveryTime()) == false)
            return false;
        if (other.getDownloadUrl() == null ^ this.getDownloadUrl() == null)
            return false;
        if (other.getDownloadUrl() != null && other.getDownloadUrl().equals(this.getDownloadUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        hashCode = prime * hashCode + ((getS3Location() == null) ? 0 : getS3Location().hashCode());
        hashCode = prime * hashCode + ((getDeliveryTime() == null) ? 0 : getDeliveryTime().hashCode());
        hashCode = prime * hashCode + ((getDownloadUrl() == null) ? 0 : getDownloadUrl().hashCode());
        return hashCode;
    }

    @Override
    public BusinessReport clone() {
        try {
            return (BusinessReport) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.alexaforbusiness.model.transform.BusinessReportMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
