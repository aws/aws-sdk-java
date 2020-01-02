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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides a summary of the predictor properties that are used in the <a>ListPredictors</a> operation. To get the
 * complete set of properties, call the <a>DescribePredictor</a> operation, and provide the listed
 * <code>PredictorArn</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/PredictorSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PredictorSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the predictor.
     * </p>
     */
    private String predictorArn;
    /**
     * <p>
     * The name of the predictor.
     * </p>
     */
    private String predictorName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that contains the data used to train the predictor.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * The status of the predictor. States include:
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
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the predictor must be <code>ACTIVE</code> before you can use the predictor to create a
     * forecast.
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
     * When the model training task was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Initially, the same as <code>CreationTime</code> (status is <code>CREATE_PENDING</code>). Updated when training
     * starts (status changed to <code>CREATE_IN_PROGRESS</code>), and when training is complete (status changed to
     * <code>ACTIVE</code>) or fails (status changed to <code>CREATE_FAILED</code>).
     * </p>
     */
    private java.util.Date lastModificationTime;

    /**
     * <p>
     * The ARN of the predictor.
     * </p>
     * 
     * @param predictorArn
     *        The ARN of the predictor.
     */

    public void setPredictorArn(String predictorArn) {
        this.predictorArn = predictorArn;
    }

    /**
     * <p>
     * The ARN of the predictor.
     * </p>
     * 
     * @return The ARN of the predictor.
     */

    public String getPredictorArn() {
        return this.predictorArn;
    }

    /**
     * <p>
     * The ARN of the predictor.
     * </p>
     * 
     * @param predictorArn
     *        The ARN of the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorSummary withPredictorArn(String predictorArn) {
        setPredictorArn(predictorArn);
        return this;
    }

    /**
     * <p>
     * The name of the predictor.
     * </p>
     * 
     * @param predictorName
     *        The name of the predictor.
     */

    public void setPredictorName(String predictorName) {
        this.predictorName = predictorName;
    }

    /**
     * <p>
     * The name of the predictor.
     * </p>
     * 
     * @return The name of the predictor.
     */

    public String getPredictorName() {
        return this.predictorName;
    }

    /**
     * <p>
     * The name of the predictor.
     * </p>
     * 
     * @param predictorName
     *        The name of the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorSummary withPredictorName(String predictorName) {
        setPredictorName(predictorName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that contains the data used to train the predictor.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group that contains the data used to train the predictor.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that contains the data used to train the predictor.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset group that contains the data used to train the predictor.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that contains the data used to train the predictor.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group that contains the data used to train the predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorSummary withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * The status of the predictor. States include:
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
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the predictor must be <code>ACTIVE</code> before you can use the predictor to create a
     * forecast.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the predictor. States include:</p>
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
     *        <li>
     *        <p>
     *        <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>Status</code> of the predictor must be <code>ACTIVE</code> before you can use the predictor to
     *        create a forecast.
     *        </p>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the predictor. States include:
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
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the predictor must be <code>ACTIVE</code> before you can use the predictor to create a
     * forecast.
     * </p>
     * </note>
     * 
     * @return The status of the predictor. States include:</p>
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
     *         <li>
     *         <p>
     *         <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <note>
     *         <p>
     *         The <code>Status</code> of the predictor must be <code>ACTIVE</code> before you can use the predictor to
     *         create a forecast.
     *         </p>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the predictor. States include:
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
     * <li>
     * <p>
     * <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     * </p>
     * </li>
     * </ul>
     * <note>
     * <p>
     * The <code>Status</code> of the predictor must be <code>ACTIVE</code> before you can use the predictor to create a
     * forecast.
     * </p>
     * </note>
     * 
     * @param status
     *        The status of the predictor. States include:</p>
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
     *        <li>
     *        <p>
     *        <code>UPDATE_PENDING</code>, <code>UPDATE_IN_PROGRESS</code>, <code>UPDATE_FAILED</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <note>
     *        <p>
     *        The <code>Status</code> of the predictor must be <code>ACTIVE</code> before you can use the predictor to
     *        create a forecast.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorSummary withStatus(String status) {
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

    public PredictorSummary withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * When the model training task was created.
     * </p>
     * 
     * @param creationTime
     *        When the model training task was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * When the model training task was created.
     * </p>
     * 
     * @return When the model training task was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * When the model training task was created.
     * </p>
     * 
     * @param creationTime
     *        When the model training task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorSummary withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Initially, the same as <code>CreationTime</code> (status is <code>CREATE_PENDING</code>). Updated when training
     * starts (status changed to <code>CREATE_IN_PROGRESS</code>), and when training is complete (status changed to
     * <code>ACTIVE</code>) or fails (status changed to <code>CREATE_FAILED</code>).
     * </p>
     * 
     * @param lastModificationTime
     *        Initially, the same as <code>CreationTime</code> (status is <code>CREATE_PENDING</code>). Updated when
     *        training starts (status changed to <code>CREATE_IN_PROGRESS</code>), and when training is complete (status
     *        changed to <code>ACTIVE</code>) or fails (status changed to <code>CREATE_FAILED</code>).
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * Initially, the same as <code>CreationTime</code> (status is <code>CREATE_PENDING</code>). Updated when training
     * starts (status changed to <code>CREATE_IN_PROGRESS</code>), and when training is complete (status changed to
     * <code>ACTIVE</code>) or fails (status changed to <code>CREATE_FAILED</code>).
     * </p>
     * 
     * @return Initially, the same as <code>CreationTime</code> (status is <code>CREATE_PENDING</code>). Updated when
     *         training starts (status changed to <code>CREATE_IN_PROGRESS</code>), and when training is complete
     *         (status changed to <code>ACTIVE</code>) or fails (status changed to <code>CREATE_FAILED</code>).
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * Initially, the same as <code>CreationTime</code> (status is <code>CREATE_PENDING</code>). Updated when training
     * starts (status changed to <code>CREATE_IN_PROGRESS</code>), and when training is complete (status changed to
     * <code>ACTIVE</code>) or fails (status changed to <code>CREATE_FAILED</code>).
     * </p>
     * 
     * @param lastModificationTime
     *        Initially, the same as <code>CreationTime</code> (status is <code>CREATE_PENDING</code>). Updated when
     *        training starts (status changed to <code>CREATE_IN_PROGRESS</code>), and when training is complete (status
     *        changed to <code>ACTIVE</code>) or fails (status changed to <code>CREATE_FAILED</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PredictorSummary withLastModificationTime(java.util.Date lastModificationTime) {
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
        if (getPredictorArn() != null)
            sb.append("PredictorArn: ").append(getPredictorArn()).append(",");
        if (getPredictorName() != null)
            sb.append("PredictorName: ").append(getPredictorName()).append(",");
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

        if (obj instanceof PredictorSummary == false)
            return false;
        PredictorSummary other = (PredictorSummary) obj;
        if (other.getPredictorArn() == null ^ this.getPredictorArn() == null)
            return false;
        if (other.getPredictorArn() != null && other.getPredictorArn().equals(this.getPredictorArn()) == false)
            return false;
        if (other.getPredictorName() == null ^ this.getPredictorName() == null)
            return false;
        if (other.getPredictorName() != null && other.getPredictorName().equals(this.getPredictorName()) == false)
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

        hashCode = prime * hashCode + ((getPredictorArn() == null) ? 0 : getPredictorArn().hashCode());
        hashCode = prime * hashCode + ((getPredictorName() == null) ? 0 : getPredictorName().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        return hashCode;
    }

    @Override
    public PredictorSummary clone() {
        try {
            return (PredictorSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.forecast.model.transform.PredictorSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
