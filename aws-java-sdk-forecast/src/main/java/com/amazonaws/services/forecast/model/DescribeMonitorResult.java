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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/DescribeMonitor" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeMonitorResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitor.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor resource described.
     * </p>
     */
    private String monitorArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the auto predictor being monitored.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The status of the monitor resource.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The timestamp of the latest evaluation completed by the monitor.
     * </p>
     */
    private java.util.Date lastEvaluationTime;
    /**
     * <p>
     * The state of the monitor's latest evaluation.
     * </p>
     */
    private String lastEvaluationState;
    /**
     * <p>
     * Metrics you can use as a baseline for comparison purposes. Use these values you interpret monitoring results for
     * an auto predictor.
     * </p>
     */
    private Baseline baseline;
    /**
     * <p>
     * An error message, if any, for the monitor.
     * </p>
     */
    private String message;
    /**
     * <p>
     * The timestamp for when the monitor resource was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The timestamp of the latest modification to the monitor.
     * </p>
     */
    private java.util.Date lastModificationTime;
    /**
     * <p>
     * The estimated number of minutes remaining before the monitor resource finishes its current evaluation.
     * </p>
     */
    private Long estimatedEvaluationTimeRemainingInMinutes;

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @return The name of the monitor.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name of the monitor.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitorResult withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor resource described.
     * </p>
     * 
     * @param monitorArn
     *        The Amazon Resource Name (ARN) of the monitor resource described.
     */

    public void setMonitorArn(String monitorArn) {
        this.monitorArn = monitorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor resource described.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the monitor resource described.
     */

    public String getMonitorArn() {
        return this.monitorArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the monitor resource described.
     * </p>
     * 
     * @param monitorArn
     *        The Amazon Resource Name (ARN) of the monitor resource described.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitorResult withMonitorArn(String monitorArn) {
        setMonitorArn(monitorArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the auto predictor being monitored.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the auto predictor being monitored.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the auto predictor being monitored.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the auto predictor being monitored.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the auto predictor being monitored.
     * </p>
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the auto predictor being monitored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitorResult withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The status of the monitor resource.
     * </p>
     * 
     * @param status
     *        The status of the monitor resource.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the monitor resource.
     * </p>
     * 
     * @return The status of the monitor resource.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the monitor resource.
     * </p>
     * 
     * @param status
     *        The status of the monitor resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitorResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The timestamp of the latest evaluation completed by the monitor.
     * </p>
     * 
     * @param lastEvaluationTime
     *        The timestamp of the latest evaluation completed by the monitor.
     */

    public void setLastEvaluationTime(java.util.Date lastEvaluationTime) {
        this.lastEvaluationTime = lastEvaluationTime;
    }

    /**
     * <p>
     * The timestamp of the latest evaluation completed by the monitor.
     * </p>
     * 
     * @return The timestamp of the latest evaluation completed by the monitor.
     */

    public java.util.Date getLastEvaluationTime() {
        return this.lastEvaluationTime;
    }

    /**
     * <p>
     * The timestamp of the latest evaluation completed by the monitor.
     * </p>
     * 
     * @param lastEvaluationTime
     *        The timestamp of the latest evaluation completed by the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitorResult withLastEvaluationTime(java.util.Date lastEvaluationTime) {
        setLastEvaluationTime(lastEvaluationTime);
        return this;
    }

    /**
     * <p>
     * The state of the monitor's latest evaluation.
     * </p>
     * 
     * @param lastEvaluationState
     *        The state of the monitor's latest evaluation.
     */

    public void setLastEvaluationState(String lastEvaluationState) {
        this.lastEvaluationState = lastEvaluationState;
    }

    /**
     * <p>
     * The state of the monitor's latest evaluation.
     * </p>
     * 
     * @return The state of the monitor's latest evaluation.
     */

    public String getLastEvaluationState() {
        return this.lastEvaluationState;
    }

    /**
     * <p>
     * The state of the monitor's latest evaluation.
     * </p>
     * 
     * @param lastEvaluationState
     *        The state of the monitor's latest evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitorResult withLastEvaluationState(String lastEvaluationState) {
        setLastEvaluationState(lastEvaluationState);
        return this;
    }

    /**
     * <p>
     * Metrics you can use as a baseline for comparison purposes. Use these values you interpret monitoring results for
     * an auto predictor.
     * </p>
     * 
     * @param baseline
     *        Metrics you can use as a baseline for comparison purposes. Use these values you interpret monitoring
     *        results for an auto predictor.
     */

    public void setBaseline(Baseline baseline) {
        this.baseline = baseline;
    }

    /**
     * <p>
     * Metrics you can use as a baseline for comparison purposes. Use these values you interpret monitoring results for
     * an auto predictor.
     * </p>
     * 
     * @return Metrics you can use as a baseline for comparison purposes. Use these values you interpret monitoring
     *         results for an auto predictor.
     */

    public Baseline getBaseline() {
        return this.baseline;
    }

    /**
     * <p>
     * Metrics you can use as a baseline for comparison purposes. Use these values you interpret monitoring results for
     * an auto predictor.
     * </p>
     * 
     * @param baseline
     *        Metrics you can use as a baseline for comparison purposes. Use these values you interpret monitoring
     *        results for an auto predictor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitorResult withBaseline(Baseline baseline) {
        setBaseline(baseline);
        return this;
    }

    /**
     * <p>
     * An error message, if any, for the monitor.
     * </p>
     * 
     * @param message
     *        An error message, if any, for the monitor.
     */

    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * <p>
     * An error message, if any, for the monitor.
     * </p>
     * 
     * @return An error message, if any, for the monitor.
     */

    public String getMessage() {
        return this.message;
    }

    /**
     * <p>
     * An error message, if any, for the monitor.
     * </p>
     * 
     * @param message
     *        An error message, if any, for the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitorResult withMessage(String message) {
        setMessage(message);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the monitor resource was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp for when the monitor resource was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp for when the monitor resource was created.
     * </p>
     * 
     * @return The timestamp for when the monitor resource was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp for when the monitor resource was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp for when the monitor resource was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitorResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The timestamp of the latest modification to the monitor.
     * </p>
     * 
     * @param lastModificationTime
     *        The timestamp of the latest modification to the monitor.
     */

    public void setLastModificationTime(java.util.Date lastModificationTime) {
        this.lastModificationTime = lastModificationTime;
    }

    /**
     * <p>
     * The timestamp of the latest modification to the monitor.
     * </p>
     * 
     * @return The timestamp of the latest modification to the monitor.
     */

    public java.util.Date getLastModificationTime() {
        return this.lastModificationTime;
    }

    /**
     * <p>
     * The timestamp of the latest modification to the monitor.
     * </p>
     * 
     * @param lastModificationTime
     *        The timestamp of the latest modification to the monitor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitorResult withLastModificationTime(java.util.Date lastModificationTime) {
        setLastModificationTime(lastModificationTime);
        return this;
    }

    /**
     * <p>
     * The estimated number of minutes remaining before the monitor resource finishes its current evaluation.
     * </p>
     * 
     * @param estimatedEvaluationTimeRemainingInMinutes
     *        The estimated number of minutes remaining before the monitor resource finishes its current evaluation.
     */

    public void setEstimatedEvaluationTimeRemainingInMinutes(Long estimatedEvaluationTimeRemainingInMinutes) {
        this.estimatedEvaluationTimeRemainingInMinutes = estimatedEvaluationTimeRemainingInMinutes;
    }

    /**
     * <p>
     * The estimated number of minutes remaining before the monitor resource finishes its current evaluation.
     * </p>
     * 
     * @return The estimated number of minutes remaining before the monitor resource finishes its current evaluation.
     */

    public Long getEstimatedEvaluationTimeRemainingInMinutes() {
        return this.estimatedEvaluationTimeRemainingInMinutes;
    }

    /**
     * <p>
     * The estimated number of minutes remaining before the monitor resource finishes its current evaluation.
     * </p>
     * 
     * @param estimatedEvaluationTimeRemainingInMinutes
     *        The estimated number of minutes remaining before the monitor resource finishes its current evaluation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeMonitorResult withEstimatedEvaluationTimeRemainingInMinutes(Long estimatedEvaluationTimeRemainingInMinutes) {
        setEstimatedEvaluationTimeRemainingInMinutes(estimatedEvaluationTimeRemainingInMinutes);
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
        if (getMonitorName() != null)
            sb.append("MonitorName: ").append(getMonitorName()).append(",");
        if (getMonitorArn() != null)
            sb.append("MonitorArn: ").append(getMonitorArn()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getLastEvaluationTime() != null)
            sb.append("LastEvaluationTime: ").append(getLastEvaluationTime()).append(",");
        if (getLastEvaluationState() != null)
            sb.append("LastEvaluationState: ").append(getLastEvaluationState()).append(",");
        if (getBaseline() != null)
            sb.append("Baseline: ").append(getBaseline()).append(",");
        if (getMessage() != null)
            sb.append("Message: ").append(getMessage()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModificationTime() != null)
            sb.append("LastModificationTime: ").append(getLastModificationTime()).append(",");
        if (getEstimatedEvaluationTimeRemainingInMinutes() != null)
            sb.append("EstimatedEvaluationTimeRemainingInMinutes: ").append(getEstimatedEvaluationTimeRemainingInMinutes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeMonitorResult == false)
            return false;
        DescribeMonitorResult other = (DescribeMonitorResult) obj;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getMonitorArn() == null ^ this.getMonitorArn() == null)
            return false;
        if (other.getMonitorArn() != null && other.getMonitorArn().equals(this.getMonitorArn()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getLastEvaluationTime() == null ^ this.getLastEvaluationTime() == null)
            return false;
        if (other.getLastEvaluationTime() != null && other.getLastEvaluationTime().equals(this.getLastEvaluationTime()) == false)
            return false;
        if (other.getLastEvaluationState() == null ^ this.getLastEvaluationState() == null)
            return false;
        if (other.getLastEvaluationState() != null && other.getLastEvaluationState().equals(this.getLastEvaluationState()) == false)
            return false;
        if (other.getBaseline() == null ^ this.getBaseline() == null)
            return false;
        if (other.getBaseline() != null && other.getBaseline().equals(this.getBaseline()) == false)
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
        if (other.getEstimatedEvaluationTimeRemainingInMinutes() == null ^ this.getEstimatedEvaluationTimeRemainingInMinutes() == null)
            return false;
        if (other.getEstimatedEvaluationTimeRemainingInMinutes() != null
                && other.getEstimatedEvaluationTimeRemainingInMinutes().equals(this.getEstimatedEvaluationTimeRemainingInMinutes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getMonitorArn() == null) ? 0 : getMonitorArn().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getLastEvaluationTime() == null) ? 0 : getLastEvaluationTime().hashCode());
        hashCode = prime * hashCode + ((getLastEvaluationState() == null) ? 0 : getLastEvaluationState().hashCode());
        hashCode = prime * hashCode + ((getBaseline() == null) ? 0 : getBaseline().hashCode());
        hashCode = prime * hashCode + ((getMessage() == null) ? 0 : getMessage().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModificationTime() == null) ? 0 : getLastModificationTime().hashCode());
        hashCode = prime * hashCode
                + ((getEstimatedEvaluationTimeRemainingInMinutes() == null) ? 0 : getEstimatedEvaluationTimeRemainingInMinutes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeMonitorResult clone() {
        try {
            return (DescribeMonitorResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
