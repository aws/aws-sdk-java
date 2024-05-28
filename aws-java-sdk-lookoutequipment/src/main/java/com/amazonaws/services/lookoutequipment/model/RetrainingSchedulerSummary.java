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
package com.amazonaws.services.lookoutequipment.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about the specified retraining scheduler, including model name, status, start date, frequency,
 * and lookback window.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lookoutequipment-2020-12-15/RetrainingSchedulerSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RetrainingSchedulerSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the model that the retraining scheduler is attached to.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The ARN of the model that the retraining scheduler is attached to.
     * </p>
     */
    private String modelArn;
    /**
     * <p>
     * The status of the retraining scheduler.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The start date for the retraining scheduler. Lookout for Equipment truncates the time you provide to the nearest
     * UTC day.
     * </p>
     */
    private java.util.Date retrainingStartDate;
    /**
     * <p>
     * The frequency at which the model retraining is set. This follows the <a
     * href="https://en.wikipedia.org/wiki/ISO_8601#Durations">ISO 8601</a> guidelines.
     * </p>
     */
    private String retrainingFrequency;
    /**
     * <p>
     * The number of past days of data used for retraining.
     * </p>
     */
    private String lookbackWindow;

    /**
     * <p>
     * The name of the model that the retraining scheduler is attached to.
     * </p>
     * 
     * @param modelName
     *        The name of the model that the retraining scheduler is attached to.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model that the retraining scheduler is attached to.
     * </p>
     * 
     * @return The name of the model that the retraining scheduler is attached to.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model that the retraining scheduler is attached to.
     * </p>
     * 
     * @param modelName
     *        The name of the model that the retraining scheduler is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrainingSchedulerSummary withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The ARN of the model that the retraining scheduler is attached to.
     * </p>
     * 
     * @param modelArn
     *        The ARN of the model that the retraining scheduler is attached to.
     */

    public void setModelArn(String modelArn) {
        this.modelArn = modelArn;
    }

    /**
     * <p>
     * The ARN of the model that the retraining scheduler is attached to.
     * </p>
     * 
     * @return The ARN of the model that the retraining scheduler is attached to.
     */

    public String getModelArn() {
        return this.modelArn;
    }

    /**
     * <p>
     * The ARN of the model that the retraining scheduler is attached to.
     * </p>
     * 
     * @param modelArn
     *        The ARN of the model that the retraining scheduler is attached to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrainingSchedulerSummary withModelArn(String modelArn) {
        setModelArn(modelArn);
        return this;
    }

    /**
     * <p>
     * The status of the retraining scheduler.
     * </p>
     * 
     * @param status
     *        The status of the retraining scheduler.
     * @see RetrainingSchedulerStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the retraining scheduler.
     * </p>
     * 
     * @return The status of the retraining scheduler.
     * @see RetrainingSchedulerStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the retraining scheduler.
     * </p>
     * 
     * @param status
     *        The status of the retraining scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrainingSchedulerStatus
     */

    public RetrainingSchedulerSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the retraining scheduler.
     * </p>
     * 
     * @param status
     *        The status of the retraining scheduler.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RetrainingSchedulerStatus
     */

    public RetrainingSchedulerSummary withStatus(RetrainingSchedulerStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The start date for the retraining scheduler. Lookout for Equipment truncates the time you provide to the nearest
     * UTC day.
     * </p>
     * 
     * @param retrainingStartDate
     *        The start date for the retraining scheduler. Lookout for Equipment truncates the time you provide to the
     *        nearest UTC day.
     */

    public void setRetrainingStartDate(java.util.Date retrainingStartDate) {
        this.retrainingStartDate = retrainingStartDate;
    }

    /**
     * <p>
     * The start date for the retraining scheduler. Lookout for Equipment truncates the time you provide to the nearest
     * UTC day.
     * </p>
     * 
     * @return The start date for the retraining scheduler. Lookout for Equipment truncates the time you provide to the
     *         nearest UTC day.
     */

    public java.util.Date getRetrainingStartDate() {
        return this.retrainingStartDate;
    }

    /**
     * <p>
     * The start date for the retraining scheduler. Lookout for Equipment truncates the time you provide to the nearest
     * UTC day.
     * </p>
     * 
     * @param retrainingStartDate
     *        The start date for the retraining scheduler. Lookout for Equipment truncates the time you provide to the
     *        nearest UTC day.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrainingSchedulerSummary withRetrainingStartDate(java.util.Date retrainingStartDate) {
        setRetrainingStartDate(retrainingStartDate);
        return this;
    }

    /**
     * <p>
     * The frequency at which the model retraining is set. This follows the <a
     * href="https://en.wikipedia.org/wiki/ISO_8601#Durations">ISO 8601</a> guidelines.
     * </p>
     * 
     * @param retrainingFrequency
     *        The frequency at which the model retraining is set. This follows the <a
     *        href="https://en.wikipedia.org/wiki/ISO_8601#Durations">ISO 8601</a> guidelines.
     */

    public void setRetrainingFrequency(String retrainingFrequency) {
        this.retrainingFrequency = retrainingFrequency;
    }

    /**
     * <p>
     * The frequency at which the model retraining is set. This follows the <a
     * href="https://en.wikipedia.org/wiki/ISO_8601#Durations">ISO 8601</a> guidelines.
     * </p>
     * 
     * @return The frequency at which the model retraining is set. This follows the <a
     *         href="https://en.wikipedia.org/wiki/ISO_8601#Durations">ISO 8601</a> guidelines.
     */

    public String getRetrainingFrequency() {
        return this.retrainingFrequency;
    }

    /**
     * <p>
     * The frequency at which the model retraining is set. This follows the <a
     * href="https://en.wikipedia.org/wiki/ISO_8601#Durations">ISO 8601</a> guidelines.
     * </p>
     * 
     * @param retrainingFrequency
     *        The frequency at which the model retraining is set. This follows the <a
     *        href="https://en.wikipedia.org/wiki/ISO_8601#Durations">ISO 8601</a> guidelines.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrainingSchedulerSummary withRetrainingFrequency(String retrainingFrequency) {
        setRetrainingFrequency(retrainingFrequency);
        return this;
    }

    /**
     * <p>
     * The number of past days of data used for retraining.
     * </p>
     * 
     * @param lookbackWindow
     *        The number of past days of data used for retraining.
     */

    public void setLookbackWindow(String lookbackWindow) {
        this.lookbackWindow = lookbackWindow;
    }

    /**
     * <p>
     * The number of past days of data used for retraining.
     * </p>
     * 
     * @return The number of past days of data used for retraining.
     */

    public String getLookbackWindow() {
        return this.lookbackWindow;
    }

    /**
     * <p>
     * The number of past days of data used for retraining.
     * </p>
     * 
     * @param lookbackWindow
     *        The number of past days of data used for retraining.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RetrainingSchedulerSummary withLookbackWindow(String lookbackWindow) {
        setLookbackWindow(lookbackWindow);
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
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getModelArn() != null)
            sb.append("ModelArn: ").append(getModelArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRetrainingStartDate() != null)
            sb.append("RetrainingStartDate: ").append(getRetrainingStartDate()).append(",");
        if (getRetrainingFrequency() != null)
            sb.append("RetrainingFrequency: ").append(getRetrainingFrequency()).append(",");
        if (getLookbackWindow() != null)
            sb.append("LookbackWindow: ").append(getLookbackWindow());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RetrainingSchedulerSummary == false)
            return false;
        RetrainingSchedulerSummary other = (RetrainingSchedulerSummary) obj;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getModelArn() == null ^ this.getModelArn() == null)
            return false;
        if (other.getModelArn() != null && other.getModelArn().equals(this.getModelArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRetrainingStartDate() == null ^ this.getRetrainingStartDate() == null)
            return false;
        if (other.getRetrainingStartDate() != null && other.getRetrainingStartDate().equals(this.getRetrainingStartDate()) == false)
            return false;
        if (other.getRetrainingFrequency() == null ^ this.getRetrainingFrequency() == null)
            return false;
        if (other.getRetrainingFrequency() != null && other.getRetrainingFrequency().equals(this.getRetrainingFrequency()) == false)
            return false;
        if (other.getLookbackWindow() == null ^ this.getLookbackWindow() == null)
            return false;
        if (other.getLookbackWindow() != null && other.getLookbackWindow().equals(this.getLookbackWindow()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelArn() == null) ? 0 : getModelArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRetrainingStartDate() == null) ? 0 : getRetrainingStartDate().hashCode());
        hashCode = prime * hashCode + ((getRetrainingFrequency() == null) ? 0 : getRetrainingFrequency().hashCode());
        hashCode = prime * hashCode + ((getLookbackWindow() == null) ? 0 : getLookbackWindow().hashCode());
        return hashCode;
    }

    @Override
    public RetrainingSchedulerSummary clone() {
        try {
            return (RetrainingSchedulerSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lookoutequipment.model.transform.RetrainingSchedulerSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
