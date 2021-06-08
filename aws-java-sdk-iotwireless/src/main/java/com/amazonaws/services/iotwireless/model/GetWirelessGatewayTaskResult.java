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
package com.amazonaws.services.iotwireless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/iotwireless-2020-11-22/GetWirelessGatewayTask" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetWirelessGatewayTaskResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     */
    private String wirelessGatewayId;
    /**
     * <p>
     * The ID of the WirelessGatewayTask.
     * </p>
     */
    private String wirelessGatewayTaskDefinitionId;
    /**
     * <p>
     * The date and time when the most recent uplink was received.
     * </p>
     */
    private String lastUplinkReceivedAt;
    /**
     * <p>
     * The date and time when the task was created.
     * </p>
     */
    private String taskCreatedAt;
    /**
     * <p>
     * The status of the request.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     * 
     * @param wirelessGatewayId
     *        The ID of the wireless gateway.
     */

    public void setWirelessGatewayId(String wirelessGatewayId) {
        this.wirelessGatewayId = wirelessGatewayId;
    }

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     * 
     * @return The ID of the wireless gateway.
     */

    public String getWirelessGatewayId() {
        return this.wirelessGatewayId;
    }

    /**
     * <p>
     * The ID of the wireless gateway.
     * </p>
     * 
     * @param wirelessGatewayId
     *        The ID of the wireless gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayTaskResult withWirelessGatewayId(String wirelessGatewayId) {
        setWirelessGatewayId(wirelessGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the WirelessGatewayTask.
     * </p>
     * 
     * @param wirelessGatewayTaskDefinitionId
     *        The ID of the WirelessGatewayTask.
     */

    public void setWirelessGatewayTaskDefinitionId(String wirelessGatewayTaskDefinitionId) {
        this.wirelessGatewayTaskDefinitionId = wirelessGatewayTaskDefinitionId;
    }

    /**
     * <p>
     * The ID of the WirelessGatewayTask.
     * </p>
     * 
     * @return The ID of the WirelessGatewayTask.
     */

    public String getWirelessGatewayTaskDefinitionId() {
        return this.wirelessGatewayTaskDefinitionId;
    }

    /**
     * <p>
     * The ID of the WirelessGatewayTask.
     * </p>
     * 
     * @param wirelessGatewayTaskDefinitionId
     *        The ID of the WirelessGatewayTask.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayTaskResult withWirelessGatewayTaskDefinitionId(String wirelessGatewayTaskDefinitionId) {
        setWirelessGatewayTaskDefinitionId(wirelessGatewayTaskDefinitionId);
        return this;
    }

    /**
     * <p>
     * The date and time when the most recent uplink was received.
     * </p>
     * 
     * @param lastUplinkReceivedAt
     *        The date and time when the most recent uplink was received.
     */

    public void setLastUplinkReceivedAt(String lastUplinkReceivedAt) {
        this.lastUplinkReceivedAt = lastUplinkReceivedAt;
    }

    /**
     * <p>
     * The date and time when the most recent uplink was received.
     * </p>
     * 
     * @return The date and time when the most recent uplink was received.
     */

    public String getLastUplinkReceivedAt() {
        return this.lastUplinkReceivedAt;
    }

    /**
     * <p>
     * The date and time when the most recent uplink was received.
     * </p>
     * 
     * @param lastUplinkReceivedAt
     *        The date and time when the most recent uplink was received.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayTaskResult withLastUplinkReceivedAt(String lastUplinkReceivedAt) {
        setLastUplinkReceivedAt(lastUplinkReceivedAt);
        return this;
    }

    /**
     * <p>
     * The date and time when the task was created.
     * </p>
     * 
     * @param taskCreatedAt
     *        The date and time when the task was created.
     */

    public void setTaskCreatedAt(String taskCreatedAt) {
        this.taskCreatedAt = taskCreatedAt;
    }

    /**
     * <p>
     * The date and time when the task was created.
     * </p>
     * 
     * @return The date and time when the task was created.
     */

    public String getTaskCreatedAt() {
        return this.taskCreatedAt;
    }

    /**
     * <p>
     * The date and time when the task was created.
     * </p>
     * 
     * @param taskCreatedAt
     *        The date and time when the task was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetWirelessGatewayTaskResult withTaskCreatedAt(String taskCreatedAt) {
        setTaskCreatedAt(taskCreatedAt);
        return this;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @param status
     *        The status of the request.
     * @see WirelessGatewayTaskStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @return The status of the request.
     * @see WirelessGatewayTaskStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @param status
     *        The status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessGatewayTaskStatus
     */

    public GetWirelessGatewayTaskResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the request.
     * </p>
     * 
     * @param status
     *        The status of the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WirelessGatewayTaskStatus
     */

    public GetWirelessGatewayTaskResult withStatus(WirelessGatewayTaskStatus status) {
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
        if (getWirelessGatewayId() != null)
            sb.append("WirelessGatewayId: ").append(getWirelessGatewayId()).append(",");
        if (getWirelessGatewayTaskDefinitionId() != null)
            sb.append("WirelessGatewayTaskDefinitionId: ").append(getWirelessGatewayTaskDefinitionId()).append(",");
        if (getLastUplinkReceivedAt() != null)
            sb.append("LastUplinkReceivedAt: ").append(getLastUplinkReceivedAt()).append(",");
        if (getTaskCreatedAt() != null)
            sb.append("TaskCreatedAt: ").append(getTaskCreatedAt()).append(",");
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

        if (obj instanceof GetWirelessGatewayTaskResult == false)
            return false;
        GetWirelessGatewayTaskResult other = (GetWirelessGatewayTaskResult) obj;
        if (other.getWirelessGatewayId() == null ^ this.getWirelessGatewayId() == null)
            return false;
        if (other.getWirelessGatewayId() != null && other.getWirelessGatewayId().equals(this.getWirelessGatewayId()) == false)
            return false;
        if (other.getWirelessGatewayTaskDefinitionId() == null ^ this.getWirelessGatewayTaskDefinitionId() == null)
            return false;
        if (other.getWirelessGatewayTaskDefinitionId() != null
                && other.getWirelessGatewayTaskDefinitionId().equals(this.getWirelessGatewayTaskDefinitionId()) == false)
            return false;
        if (other.getLastUplinkReceivedAt() == null ^ this.getLastUplinkReceivedAt() == null)
            return false;
        if (other.getLastUplinkReceivedAt() != null && other.getLastUplinkReceivedAt().equals(this.getLastUplinkReceivedAt()) == false)
            return false;
        if (other.getTaskCreatedAt() == null ^ this.getTaskCreatedAt() == null)
            return false;
        if (other.getTaskCreatedAt() != null && other.getTaskCreatedAt().equals(this.getTaskCreatedAt()) == false)
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

        hashCode = prime * hashCode + ((getWirelessGatewayId() == null) ? 0 : getWirelessGatewayId().hashCode());
        hashCode = prime * hashCode + ((getWirelessGatewayTaskDefinitionId() == null) ? 0 : getWirelessGatewayTaskDefinitionId().hashCode());
        hashCode = prime * hashCode + ((getLastUplinkReceivedAt() == null) ? 0 : getLastUplinkReceivedAt().hashCode());
        hashCode = prime * hashCode + ((getTaskCreatedAt() == null) ? 0 : getTaskCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public GetWirelessGatewayTaskResult clone() {
        try {
            return (GetWirelessGatewayTaskResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
