/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appflow.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies information about the past flow run instances for a given flow.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appflow-2020-08-23/ExecutionRecord" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ExecutionRecord implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the identifier of the given flow run.
     * </p>
     */
    private String executionId;
    /**
     * <p>
     * Specifies the flow run status and whether it is in progress, has completed successfully, or has failed.
     * </p>
     */
    private String executionStatus;
    /**
     * <p>
     * Describes the result of the given flow run.
     * </p>
     */
    private ExecutionResult executionResult;
    /**
     * <p>
     * Specifies the start time of the flow run.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * Specifies the time of the most recent update.
     * </p>
     */
    private java.util.Date lastUpdatedAt;
    /**
     * <p>
     * The timestamp that determines the first new or updated record to be transferred in the flow run.
     * </p>
     */
    private java.util.Date dataPullStartTime;
    /**
     * <p>
     * The timestamp that indicates the last new or updated record to be transferred in the flow run.
     * </p>
     */
    private java.util.Date dataPullEndTime;

    /**
     * <p>
     * Specifies the identifier of the given flow run.
     * </p>
     * 
     * @param executionId
     *        Specifies the identifier of the given flow run.
     */

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    /**
     * <p>
     * Specifies the identifier of the given flow run.
     * </p>
     * 
     * @return Specifies the identifier of the given flow run.
     */

    public String getExecutionId() {
        return this.executionId;
    }

    /**
     * <p>
     * Specifies the identifier of the given flow run.
     * </p>
     * 
     * @param executionId
     *        Specifies the identifier of the given flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionRecord withExecutionId(String executionId) {
        setExecutionId(executionId);
        return this;
    }

    /**
     * <p>
     * Specifies the flow run status and whether it is in progress, has completed successfully, or has failed.
     * </p>
     * 
     * @param executionStatus
     *        Specifies the flow run status and whether it is in progress, has completed successfully, or has failed.
     * @see ExecutionStatus
     */

    public void setExecutionStatus(String executionStatus) {
        this.executionStatus = executionStatus;
    }

    /**
     * <p>
     * Specifies the flow run status and whether it is in progress, has completed successfully, or has failed.
     * </p>
     * 
     * @return Specifies the flow run status and whether it is in progress, has completed successfully, or has failed.
     * @see ExecutionStatus
     */

    public String getExecutionStatus() {
        return this.executionStatus;
    }

    /**
     * <p>
     * Specifies the flow run status and whether it is in progress, has completed successfully, or has failed.
     * </p>
     * 
     * @param executionStatus
     *        Specifies the flow run status and whether it is in progress, has completed successfully, or has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public ExecutionRecord withExecutionStatus(String executionStatus) {
        setExecutionStatus(executionStatus);
        return this;
    }

    /**
     * <p>
     * Specifies the flow run status and whether it is in progress, has completed successfully, or has failed.
     * </p>
     * 
     * @param executionStatus
     *        Specifies the flow run status and whether it is in progress, has completed successfully, or has failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public ExecutionRecord withExecutionStatus(ExecutionStatus executionStatus) {
        this.executionStatus = executionStatus.toString();
        return this;
    }

    /**
     * <p>
     * Describes the result of the given flow run.
     * </p>
     * 
     * @param executionResult
     *        Describes the result of the given flow run.
     */

    public void setExecutionResult(ExecutionResult executionResult) {
        this.executionResult = executionResult;
    }

    /**
     * <p>
     * Describes the result of the given flow run.
     * </p>
     * 
     * @return Describes the result of the given flow run.
     */

    public ExecutionResult getExecutionResult() {
        return this.executionResult;
    }

    /**
     * <p>
     * Describes the result of the given flow run.
     * </p>
     * 
     * @param executionResult
     *        Describes the result of the given flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionRecord withExecutionResult(ExecutionResult executionResult) {
        setExecutionResult(executionResult);
        return this;
    }

    /**
     * <p>
     * Specifies the start time of the flow run.
     * </p>
     * 
     * @param startedAt
     *        Specifies the start time of the flow run.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * Specifies the start time of the flow run.
     * </p>
     * 
     * @return Specifies the start time of the flow run.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * Specifies the start time of the flow run.
     * </p>
     * 
     * @param startedAt
     *        Specifies the start time of the flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionRecord withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * Specifies the time of the most recent update.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies the time of the most recent update.
     */

    public void setLastUpdatedAt(java.util.Date lastUpdatedAt) {
        this.lastUpdatedAt = lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies the time of the most recent update.
     * </p>
     * 
     * @return Specifies the time of the most recent update.
     */

    public java.util.Date getLastUpdatedAt() {
        return this.lastUpdatedAt;
    }

    /**
     * <p>
     * Specifies the time of the most recent update.
     * </p>
     * 
     * @param lastUpdatedAt
     *        Specifies the time of the most recent update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionRecord withLastUpdatedAt(java.util.Date lastUpdatedAt) {
        setLastUpdatedAt(lastUpdatedAt);
        return this;
    }

    /**
     * <p>
     * The timestamp that determines the first new or updated record to be transferred in the flow run.
     * </p>
     * 
     * @param dataPullStartTime
     *        The timestamp that determines the first new or updated record to be transferred in the flow run.
     */

    public void setDataPullStartTime(java.util.Date dataPullStartTime) {
        this.dataPullStartTime = dataPullStartTime;
    }

    /**
     * <p>
     * The timestamp that determines the first new or updated record to be transferred in the flow run.
     * </p>
     * 
     * @return The timestamp that determines the first new or updated record to be transferred in the flow run.
     */

    public java.util.Date getDataPullStartTime() {
        return this.dataPullStartTime;
    }

    /**
     * <p>
     * The timestamp that determines the first new or updated record to be transferred in the flow run.
     * </p>
     * 
     * @param dataPullStartTime
     *        The timestamp that determines the first new or updated record to be transferred in the flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionRecord withDataPullStartTime(java.util.Date dataPullStartTime) {
        setDataPullStartTime(dataPullStartTime);
        return this;
    }

    /**
     * <p>
     * The timestamp that indicates the last new or updated record to be transferred in the flow run.
     * </p>
     * 
     * @param dataPullEndTime
     *        The timestamp that indicates the last new or updated record to be transferred in the flow run.
     */

    public void setDataPullEndTime(java.util.Date dataPullEndTime) {
        this.dataPullEndTime = dataPullEndTime;
    }

    /**
     * <p>
     * The timestamp that indicates the last new or updated record to be transferred in the flow run.
     * </p>
     * 
     * @return The timestamp that indicates the last new or updated record to be transferred in the flow run.
     */

    public java.util.Date getDataPullEndTime() {
        return this.dataPullEndTime;
    }

    /**
     * <p>
     * The timestamp that indicates the last new or updated record to be transferred in the flow run.
     * </p>
     * 
     * @param dataPullEndTime
     *        The timestamp that indicates the last new or updated record to be transferred in the flow run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ExecutionRecord withDataPullEndTime(java.util.Date dataPullEndTime) {
        setDataPullEndTime(dataPullEndTime);
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
        if (getExecutionId() != null)
            sb.append("ExecutionId: ").append(getExecutionId()).append(",");
        if (getExecutionStatus() != null)
            sb.append("ExecutionStatus: ").append(getExecutionStatus()).append(",");
        if (getExecutionResult() != null)
            sb.append("ExecutionResult: ").append(getExecutionResult()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getLastUpdatedAt() != null)
            sb.append("LastUpdatedAt: ").append(getLastUpdatedAt()).append(",");
        if (getDataPullStartTime() != null)
            sb.append("DataPullStartTime: ").append(getDataPullStartTime()).append(",");
        if (getDataPullEndTime() != null)
            sb.append("DataPullEndTime: ").append(getDataPullEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ExecutionRecord == false)
            return false;
        ExecutionRecord other = (ExecutionRecord) obj;
        if (other.getExecutionId() == null ^ this.getExecutionId() == null)
            return false;
        if (other.getExecutionId() != null && other.getExecutionId().equals(this.getExecutionId()) == false)
            return false;
        if (other.getExecutionStatus() == null ^ this.getExecutionStatus() == null)
            return false;
        if (other.getExecutionStatus() != null && other.getExecutionStatus().equals(this.getExecutionStatus()) == false)
            return false;
        if (other.getExecutionResult() == null ^ this.getExecutionResult() == null)
            return false;
        if (other.getExecutionResult() != null && other.getExecutionResult().equals(this.getExecutionResult()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getLastUpdatedAt() == null ^ this.getLastUpdatedAt() == null)
            return false;
        if (other.getLastUpdatedAt() != null && other.getLastUpdatedAt().equals(this.getLastUpdatedAt()) == false)
            return false;
        if (other.getDataPullStartTime() == null ^ this.getDataPullStartTime() == null)
            return false;
        if (other.getDataPullStartTime() != null && other.getDataPullStartTime().equals(this.getDataPullStartTime()) == false)
            return false;
        if (other.getDataPullEndTime() == null ^ this.getDataPullEndTime() == null)
            return false;
        if (other.getDataPullEndTime() != null && other.getDataPullEndTime().equals(this.getDataPullEndTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionId() == null) ? 0 : getExecutionId().hashCode());
        hashCode = prime * hashCode + ((getExecutionStatus() == null) ? 0 : getExecutionStatus().hashCode());
        hashCode = prime * hashCode + ((getExecutionResult() == null) ? 0 : getExecutionResult().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedAt() == null) ? 0 : getLastUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getDataPullStartTime() == null) ? 0 : getDataPullStartTime().hashCode());
        hashCode = prime * hashCode + ((getDataPullEndTime() == null) ? 0 : getDataPullEndTime().hashCode());
        return hashCode;
    }

    @Override
    public ExecutionRecord clone() {
        try {
            return (ExecutionRecord) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appflow.model.transform.ExecutionRecordMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
