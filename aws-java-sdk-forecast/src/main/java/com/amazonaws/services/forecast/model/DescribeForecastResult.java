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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeForecast" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeForecastResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The same forecast ARN as given in the request.
     * </p>
     */
    private String forecastArn;
    /**
     * <p>
     * The name of the forecast.
     * </p>
     */
    private String forecastName;
    /**
     * <p>
     * The ARN of the predictor used to generate the forecast.
     * </p>
     */
    private String predictorArn;
    /**
     * <p>
     * The ARN of the dataset group that provided the data used to train the predictor.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * The status of the forecast. States include:
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
     * The <code>Status</code> of the forecast must be <code>ACTIVE</code> before you can query or export the forecast.
     * </p>
     * </note>
     */
    private String status;
    /**
     * <p>
     * If an error occurred, an informational message about the error.
     * </p>
     */
    private String message;
    /**
     * <p>
     * When the forecast creation task was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Initially, the same as <code>CreationTime</code> (status is <code>CREATE_PENDING</code>). Updated when inference
     * (creating the forecast) starts (status changed to <code>CREATE_IN_PROGRESS</code>), and when inference is
     * complete (status changed to <code>ACTIVE</code>) or fails (status changed to <code>CREATE_FAILED</code>).
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The same forecast ARN as given in the request.
     * </p>
     * 
     * @param forecastArn
     *        The same forecast ARN as given in the request.
     */

    public void setForecastArn(String forecastArn) {
        this.forecastArn = forecastArn;
    }

    /**
     * <p>
     * The same forecast ARN as given in the request.
     * </p>
     * 
     * @return The same forecast ARN as given in the request.
     */

    public String getForecastArn() {
        return this.forecastArn;
    }

    /**
     * <p>
     * The same forecast ARN as given in the request.
     * </p>
     * 
     * @param forecastArn
     *        The same forecast ARN as given in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastResult withForecastArn(String forecastArn) {
        setForecastArn(forecastArn);
        return this;
    }

    /**
     * <p>
     * The name of the forecast.
     * </p>
     * 
     * @param forecastName
     *        The name of the forecast.
     */

    public void setForecastName(String forecastName) {
        this.forecastName = forecastName;
    }

    /**
     * <p>
     * The name of the forecast.
     * </p>
     * 
     * @return The name of the forecast.
     */

    public String getForecastName() {
        return this.forecastName;
    }

    /**
     * <p>
     * The name of the forecast.
     * </p>
     * 
     * @param forecastName
     *        The name of the forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastResult withForecastName(String forecastName) {
        setForecastName(forecastName);
        return this;
    }

    /**
     * <p>
     * The ARN of the predictor used to generate the forecast.
     * </p>
     * 
     * @param predictorArn
     *        The ARN of the predictor used to generate the forecast.
     */

    public void setPredictorArn(String predictorArn) {
        this.predictorArn = predictorArn;
    }

    /**
     * <p>
     * The ARN of the predictor used to generate the forecast.
     * </p>
     * 
     * @return The ARN of the predictor used to generate the forecast.
     */

    public String getPredictorArn() {
        return this.predictorArn;
    }

    /**
     * <p>
     * The ARN of the predictor used to generate the forecast.
     * </p>
     * 
     * @param predictorArn
     *        The ARN of the predictor used to generate the forecast.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastResult withPredictorArn(String predictorArn) {
        setPredictorArn(predictorArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the dataset group that provided the data used to train the predictor.
     * </p>
     * 
     * @param datasetGroupArn
     *        The ARN of the dataset group that provided the data used to train the predictor.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group that provided the data used to train the predictor.
     * </p>
     * 
     * @return The ARN of the dataset group that provided the data used to train the predictor.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The ARN of the dataset group that provided the data used to train the predictor.
     * </p>
     * 
     * @param datasetGroupArn
     *        The ARN of the dataset group that provided the data used to train the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastResult withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * The status of the forecast. States include:
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
     * The <code>Status</code> of the forecast must be <code>ACTIVE</code> before you can query or export the forecast.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the forecast. States include:</p>
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
     *        The <code>Status</code> of the forecast must be <code>ACTIVE</code> before you can query or export the
     *        forecast.
     *        </p>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the forecast. States include:
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
     * The <code>Status</code> of the forecast must be <code>ACTIVE</code> before you can query or export the forecast.
     * </p>
     * </note>
     * 
     * @return The status of the forecast. States include:</p>
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
     *         The <code>Status</code> of the forecast must be <code>ACTIVE</code> before you can query or export the
     *         forecast.
     *         </p>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the forecast. States include:
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
     * The <code>Status</code> of the forecast must be <code>ACTIVE</code> before you can query or export the forecast.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the forecast. States include:</p>
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
     *        The <code>Status</code> of the forecast must be <code>ACTIVE</code> before you can query or export the
     *        forecast.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastResult withStatus(String status) {
        setStatus(status);
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

    public DescribeForecastResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * When the forecast creation task was created.
     * </p>
     * 
     * @param creationTime
     *        When the forecast creation task was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the forecast creation task was created.
     * </p>
     * 
     * @return When the forecast creation task was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the forecast creation task was created.
     * </p>
     * 
     * @param creationTime
     *        When the forecast creation task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Initially, the same as <code>CreationTime</code> (status is <code>CREATE_PENDING</code>). Updated when inference
     * (creating the forecast) starts (status changed to <code>CREATE_IN_PROGRESS</code>), and when inference is
     * complete (status changed to <code>ACTIVE</code>) or fails (status changed to <code>CREATE_FAILED</code>).
     * </p>
     * 
     * @param lastModificationTime
     *        Initially, the same as <code>CreationTime</code> (status is <code>CREATE_PENDING</code>). Updated when
     *        inference (creating the forecast) starts (status changed to <code>CREATE_IN_PROGRESS</code>), and when
     *        inference is complete (status changed to <code>ACTIVE</code>) or fails (status changed to
     *        <code>CREATE_FAILED</code>).
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * Initially, the same as <code>CreationTime</code> (status is <code>CREATE_PENDING</code>). Updated when inference
     * (creating the forecast) starts (status changed to <code>CREATE_IN_PROGRESS</code>), and when inference is
     * complete (status changed to <code>ACTIVE</code>) or fails (status changed to <code>CREATE_FAILED</code>).
     * </p>
     * 
     * @return Initially, the same as <code>CreationTime</code> (status is <code>CREATE_PENDING</code>). Updated when
     *         inference (creating the forecast) starts (status changed to <code>CREATE_IN_PROGRESS</code>), and when
     *         inference is complete (status changed to <code>ACTIVE</code>) or fails (status changed to
     *         <code>CREATE_FAILED</code>).
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * Initially, the same as <code>CreationTime</code> (status is <code>CREATE_PENDING</code>). Updated when inference
     * (creating the forecast) starts (status changed to <code>CREATE_IN_PROGRESS</code>), and when inference is
     * complete (status changed to <code>ACTIVE</code>) or fails (status changed to <code>CREATE_FAILED</code>).
     * </p>
     * 
     * @param lastModificationTime
     *        Initially, the same as <code>CreationTime</code> (status is <code>CREATE_PENDING</code>). Updated when
     *        inference (creating the forecast) starts (status changed to <code>CREATE_IN_PROGRESS</code>), and when
     *        inference is complete (status changed to <code>ACTIVE</code>) or fails (status changed to
     *        <code>CREATE_FAILED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeForecastResult withLastModificationTime(java.util.Date lastModificationTime) {
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
        if (getForecastArn() != null)
            sb.append("ForecastArn: ").append(getForecastArn()).append(",");
        if (getForecastName() != null)
            sb.append("ForecastName: ").append(getForecastName()).append(",");
        if (getPredictorArn() != null)
            sb.append("PredictorArn: ").append(getPredictorArn()).append(",");
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
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

        if (obj instanceof DescribeForecastResult == false)
            return false;
        DescribeForecastResult other = (DescribeForecastResult) obj;
        if (other.getForecastArn() == null ^ this.getForecastArn() == null)
            return false;
        if (other.getForecastArn() != null && other.getForecastArn().equals(this.getForecastArn()) == false)
            return false;
        if (other.getForecastName() == null ^ this.getForecastName() == null)
            return false;
        if (other.getForecastName() != null && other.getForecastName().equals(this.getForecastName()) == false)
            return false;
        if (other.getPredictorArn() == null ^ this.getPredictorArn() == null)
            return false;
        if (other.getPredictorArn() != null && other.getPredictorArn().equals(this.getPredictorArn()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getMessage() == null ^ this.getMessage() == null)
            return false;
        if (other.getMessage() != null && other.getMessage().equals(this.getMessage()) == false)
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

        hashCode = prime * hashCode + ((getForecastArn() == null) ? 0 : getForecastArn().hashCode());
        hashCode = prime * hashCode + ((getForecastName() == null) ? 0 : getForecastName().hashCode());
        hashCode = prime * hashCode + ((getPredictorArn() == null) ? 0 : getPredictorArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeForecastResult clone() {
        try {
            return (DescribeForecastResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
