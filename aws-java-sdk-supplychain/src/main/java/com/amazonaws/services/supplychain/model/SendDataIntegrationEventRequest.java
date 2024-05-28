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
package com.amazonaws.services.supplychain.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request parameters for SendDataIntegrationEvent.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/supplychain-2024-01-01/SendDataIntegrationEvent"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendDataIntegrationEventRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS Supply Chain instance identifier.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The data event type.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The data payload of the event.
     * </p>
     */
    private String data;
    /**
     * <p>
     * Event identifier (for example, orderId for InboundOrder) used for data sharing or partitioning.
     * </p>
     */
    private String eventGroupId;
    /**
     * <p>
     * The event timestamp (in epoch seconds).
     * </p>
     */
    private java.util.Date eventTimestamp;
    /**
     * <p>
     * The idempotent client token.
     * </p>
     */
    private String clientToken;

    /**
     * <p>
     * The AWS Supply Chain instance identifier.
     * </p>
     * 
     * @param instanceId
     *        The AWS Supply Chain instance identifier.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The AWS Supply Chain instance identifier.
     * </p>
     * 
     * @return The AWS Supply Chain instance identifier.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The AWS Supply Chain instance identifier.
     * </p>
     * 
     * @param instanceId
     *        The AWS Supply Chain instance identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataIntegrationEventRequest withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The data event type.
     * </p>
     * 
     * @param eventType
     *        The data event type.
     * @see DataIntegrationEventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The data event type.
     * </p>
     * 
     * @return The data event type.
     * @see DataIntegrationEventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The data event type.
     * </p>
     * 
     * @param eventType
     *        The data event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataIntegrationEventType
     */

    public SendDataIntegrationEventRequest withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The data event type.
     * </p>
     * 
     * @param eventType
     *        The data event type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DataIntegrationEventType
     */

    public SendDataIntegrationEventRequest withEventType(DataIntegrationEventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * The data payload of the event.
     * </p>
     * 
     * @param data
     *        The data payload of the event.
     */

    public void setData(String data) {
        this.data = data;
    }

    /**
     * <p>
     * The data payload of the event.
     * </p>
     * 
     * @return The data payload of the event.
     */

    public String getData() {
        return this.data;
    }

    /**
     * <p>
     * The data payload of the event.
     * </p>
     * 
     * @param data
     *        The data payload of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataIntegrationEventRequest withData(String data) {
        setData(data);
        return this;
    }

    /**
     * <p>
     * Event identifier (for example, orderId for InboundOrder) used for data sharing or partitioning.
     * </p>
     * 
     * @param eventGroupId
     *        Event identifier (for example, orderId for InboundOrder) used for data sharing or partitioning.
     */

    public void setEventGroupId(String eventGroupId) {
        this.eventGroupId = eventGroupId;
    }

    /**
     * <p>
     * Event identifier (for example, orderId for InboundOrder) used for data sharing or partitioning.
     * </p>
     * 
     * @return Event identifier (for example, orderId for InboundOrder) used for data sharing or partitioning.
     */

    public String getEventGroupId() {
        return this.eventGroupId;
    }

    /**
     * <p>
     * Event identifier (for example, orderId for InboundOrder) used for data sharing or partitioning.
     * </p>
     * 
     * @param eventGroupId
     *        Event identifier (for example, orderId for InboundOrder) used for data sharing or partitioning.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataIntegrationEventRequest withEventGroupId(String eventGroupId) {
        setEventGroupId(eventGroupId);
        return this;
    }

    /**
     * <p>
     * The event timestamp (in epoch seconds).
     * </p>
     * 
     * @param eventTimestamp
     *        The event timestamp (in epoch seconds).
     */

    public void setEventTimestamp(java.util.Date eventTimestamp) {
        this.eventTimestamp = eventTimestamp;
    }

    /**
     * <p>
     * The event timestamp (in epoch seconds).
     * </p>
     * 
     * @return The event timestamp (in epoch seconds).
     */

    public java.util.Date getEventTimestamp() {
        return this.eventTimestamp;
    }

    /**
     * <p>
     * The event timestamp (in epoch seconds).
     * </p>
     * 
     * @param eventTimestamp
     *        The event timestamp (in epoch seconds).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataIntegrationEventRequest withEventTimestamp(java.util.Date eventTimestamp) {
        setEventTimestamp(eventTimestamp);
        return this;
    }

    /**
     * <p>
     * The idempotent client token.
     * </p>
     * 
     * @param clientToken
     *        The idempotent client token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The idempotent client token.
     * </p>
     * 
     * @return The idempotent client token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The idempotent client token.
     * </p>
     * 
     * @param clientToken
     *        The idempotent client token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendDataIntegrationEventRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getData() != null)
            sb.append("Data: ").append("***Sensitive Data Redacted***").append(",");
        if (getEventGroupId() != null)
            sb.append("EventGroupId: ").append(getEventGroupId()).append(",");
        if (getEventTimestamp() != null)
            sb.append("EventTimestamp: ").append(getEventTimestamp()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendDataIntegrationEventRequest == false)
            return false;
        SendDataIntegrationEventRequest other = (SendDataIntegrationEventRequest) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getData() == null ^ this.getData() == null)
            return false;
        if (other.getData() != null && other.getData().equals(this.getData()) == false)
            return false;
        if (other.getEventGroupId() == null ^ this.getEventGroupId() == null)
            return false;
        if (other.getEventGroupId() != null && other.getEventGroupId().equals(this.getEventGroupId()) == false)
            return false;
        if (other.getEventTimestamp() == null ^ this.getEventTimestamp() == null)
            return false;
        if (other.getEventTimestamp() != null && other.getEventTimestamp().equals(this.getEventTimestamp()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getData() == null) ? 0 : getData().hashCode());
        hashCode = prime * hashCode + ((getEventGroupId() == null) ? 0 : getEventGroupId().hashCode());
        hashCode = prime * hashCode + ((getEventTimestamp() == null) ? 0 : getEventTimestamp().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        return hashCode;
    }

    @Override
    public SendDataIntegrationEventRequest clone() {
        return (SendDataIntegrationEventRequest) super.clone();
    }

}
