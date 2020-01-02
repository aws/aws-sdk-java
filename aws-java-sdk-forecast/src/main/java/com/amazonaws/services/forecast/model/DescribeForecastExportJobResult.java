/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeForecastExportJob" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeForecastExportJobResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the forecast export job.
     * </p>
     */
    private String forecastExportJobArn;
    /**
     * <p>
     * The name of the forecast export job.
     * </p>
     */
    private String forecastExportJobName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the exported forecast.
     * </p>
     */
    private String forecastArn;
    /**
     * <p>
     * The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
     * </p>
     */
    private DataDestination destination;
    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The status of the forecast export job. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the forecast export job must be <code>ACTIVE</code> before you can access the forecast
     * in your S3 bucket.
     * </p>
     * </note>
     */
    private String status;
    /**
     * <p>
     * When the forecast export job was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * When the last successful export job finished.
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The ARN of the forecast export job.
     * </p>
     * 
     * @param forecastExportJobArn
     *        The ARN of the forecast export job.
     */

    public void setForecastExportJobArn(String forecastExportJobArn) {
        this.forecastExportJobArn = forecastExportJobArn;
    }

    /**
     * <p>
     * The ARN of the forecast export job.
     * </p>
     * 
     * @return The ARN of the forecast export job.
     */

    public String getForecastExportJobArn() {
        return this.forecastExportJobArn;
    }

    /**
     * <p>
     * The ARN of the forecast export job.
     * </p>
     * 
     * @param forecastExportJobArn
     *        The ARN of the forecast export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastExportJobResult withForecastExportJobArn(String forecastExportJobArn) {
        setForecastExportJobArn(forecastExportJobArn);
        return this;
    }

    /**
     * <p>
     * The name of the forecast export job.
     * </p>
     * 
     * @param forecastExportJobName
     *        The name of the forecast export job.
     */

    public void setForecastExportJobName(String forecastExportJobName) {
        this.forecastExportJobName = forecastExportJobName;
    }

    /**
     * <p>
     * The name of the forecast export job.
     * </p>
     * 
     * @return The name of the forecast export job.
     */

    public String getForecastExportJobName() {
        return this.forecastExportJobName;
    }

    /**
     * <p>
     * The name of the forecast export job.
     * </p>
     * 
     * @param forecastExportJobName
     *        The name of the forecast export job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastExportJobResult withForecastExportJobName(String forecastExportJobName) {
        setForecastExportJobName(forecastExportJobName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the exported forecast.
     * </p>
     * 
     * @param forecastArn
     *        The Amazon Resource Name (ARN) of the exported forecast.
     */

    public void setForecastArn(String forecastArn) {
        this.forecastArn = forecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the exported forecast.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the exported forecast.
     */

    public String getForecastArn() {
        return this.forecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the exported forecast.
     * </p>
     * 
     * @param forecastArn
     *        The Amazon Resource Name (ARN) of the exported forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastExportJobResult withForecastArn(String forecastArn) {
        setForecastArn(forecastArn);
        return this;
    }

    /**
     * <p>
     * The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
     * </p>
     * 
     * @param destination
     *        The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
     */

    public void setDestination(DataDestination destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
     * </p>
     * 
     * @return The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
     */

    public DataDestination getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
     * </p>
     * 
     * @param destination
     *        The path to the Amazon Simple Storage Service (Amazon S3) bucket where the forecast is exported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastExportJobResult withDestination(DataDestination destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @param message
     *        If an error occurred, an informational message about the error.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @return If an error occurred, an informational message about the error.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     * 
     * @param message
     *        If an error occurred, an informational message about the error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastExportJobResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The status of the forecast export job. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the forecast export job must be <code>ACTIVE</code> before you can access the forecast
     * in your S3 bucket.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the forecast export job. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>Status</code> of the forecast export job must be <code>ACTIVE</code> before you can access the
     *        forecast in your S3 bucket.
     *        </p>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the forecast export job. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the forecast export job must be <code>ACTIVE</code> before you can access the forecast
     * in your S3 bucket.
     * </p>
     * </note>
     * 
     * @return The status of the forecast export job. States include:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ACTIVE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The <code>Status</code> of the forecast export job must be <code>ACTIVE</code> before you can access the
     *         forecast in your S3 bucket.
     *         </p>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the forecast export job. States include:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ACTIVE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the forecast export job must be <code>ACTIVE</code> before you can access the forecast
     * in your S3 bucket.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the forecast export job. States include:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ACTIVE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATE_PENDING</code>, <code>CREATE_IN_PROGRESS</code>, <code>CREATE_FAILED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETE_PENDING</code>, <code>DELETE_IN_PROGRESS</code>, <code>DELETE_FAILED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>Status</code> of the forecast export job must be <code>ACTIVE</code> before you can access the
     *        forecast in your S3 bucket.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastExportJobResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * When the forecast export job was created.
     * </p>
     * 
     * @param creationTime
     *        When the forecast export job was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the forecast export job was created.
     * </p>
     * 
     * @return When the forecast export job was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the forecast export job was created.
     * </p>
     * 
     * @param creationTime
     *        When the forecast export job was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastExportJobResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * When the last successful export job finished.
     * </p>
     * 
     * @param lastModificationTime
     *        When the last successful export job finished.
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * When the last successful export job finished.
     * </p>
     * 
     * @return When the last successful export job finished.
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * When the last successful export job finished.
     * </p>
     * 
     * @param lastModificationTime
     *        When the last successful export job finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastExportJobResult withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
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
        if (getForecastExportJobArn() != null)
            sb.append("ForecastExportJobArn: ").append(getForecastExportJobArn()).append(",");
        if (getForecastExportJobName() != null)
            sb.append("ForecastExportJobName: ").append(getForecastExportJobName()).append(",");
        if (getForecastArn() != null)
            sb.append("ForecastArn: ").append(getForecastArn()).append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeForecastExportJobResult == false)
            return false;
        DescribeForecastExportJobResult other = (DescribeForecastExportJobResult) obj;
        if (other.getForecastExportJobArn() == null ^ this.getForecastExportJobArn() == null)
            return false;
        if (other.getForecastExportJobArn() != null && other.getForecastExportJobArn().equals(this.getForecastExportJobArn()) == false)
            return false;
        if (other.getForecastExportJobName() == null ^ this.getForecastExportJobName() == null)
            return false;
        if (other.getForecastExportJobName() != null && other.getForecastExportJobName().equals(this.getForecastExportJobName()) == false)
            return false;
        if (other.getForecastArn() == null ^ this.getForecastArn() == null)
            return false;
        if (other.getForecastArn() != null && other.getForecastArn().equals(this.getForecastArn()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModificationTime() == null ^ this.getLastModificationTime() == null)
            return false;
        if (other.getLastModificationTime() != null && other.getLastModificationTime().equals(this.getLastModificationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getForecastExportJobArn() == null) ? 0 : getForecastExportJobArn().hashCode());
        hashCode = prime * hashCode + ((getForecastExportJobName() == null) ? 0 : getForecastExportJobName().hashCode());
        hashCode = prime * hashCode + ((getForecastArn() == null) ? 0 : getForecastArn().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeForecastExportJobResult clone() {
        try {
            return (DescribeForecastExportJobResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
