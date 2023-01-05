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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The name of the event source. This field is required if <code>TriggerEventSource</code> is one of the following
 * values: <code>OnZendeskTicketCreate</code> | <code>OnZendeskTicketStatusUpdate</code> |
 * <code>OnSalesforceCaseCreate</code>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/RuleTriggerEventSource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleTriggerEventSource implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the event source.
     * </p>
     */
    private String eventSourceName;
    /**
     * <p>
     * The identifier for the integration association.
     * </p>
     */
    private String integrationAssociationId;

    /**
     * <p>
     * The name of the event source.
     * </p>
     * 
     * @param eventSourceName
     *        The name of the event source.
     * @see EventSourceName
     */

    public void setEventSourceName(String eventSourceName) {
        this.eventSourceName = eventSourceName;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * 
     * @return The name of the event source.
     * @see EventSourceName
     */

    public String getEventSourceName() {
        return this.eventSourceName;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * 
     * @param eventSourceName
     *        The name of the event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourceName
     */

    public RuleTriggerEventSource withEventSourceName(String eventSourceName) {
        setEventSourceName(eventSourceName);
        return this;
    }

    /**
     * <p>
     * The name of the event source.
     * </p>
     * 
     * @param eventSourceName
     *        The name of the event source.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventSourceName
     */

    public RuleTriggerEventSource withEventSourceName(EventSourceName eventSourceName) {
        this.eventSourceName = eventSourceName.toString();
        return this;
    }

    /**
     * <p>
     * The identifier for the integration association.
     * </p>
     * 
     * @param integrationAssociationId
     *        The identifier for the integration association.
     */

    public void setIntegrationAssociationId(String integrationAssociationId) {
        this.integrationAssociationId = integrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the integration association.
     * </p>
     * 
     * @return The identifier for the integration association.
     */

    public String getIntegrationAssociationId() {
        return this.integrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the integration association.
     * </p>
     * 
     * @param integrationAssociationId
     *        The identifier for the integration association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleTriggerEventSource withIntegrationAssociationId(String integrationAssociationId) {
        setIntegrationAssociationId(integrationAssociationId);
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
        if (getEventSourceName() != null)
            sb.append("EventSourceName: ").append(getEventSourceName()).append(",");
        if (getIntegrationAssociationId() != null)
            sb.append("IntegrationAssociationId: ").append(getIntegrationAssociationId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleTriggerEventSource == false)
            return false;
        RuleTriggerEventSource other = (RuleTriggerEventSource) obj;
        if (other.getEventSourceName() == null ^ this.getEventSourceName() == null)
            return false;
        if (other.getEventSourceName() != null && other.getEventSourceName().equals(this.getEventSourceName()) == false)
            return false;
        if (other.getIntegrationAssociationId() == null ^ this.getIntegrationAssociationId() == null)
            return false;
        if (other.getIntegrationAssociationId() != null && other.getIntegrationAssociationId().equals(this.getIntegrationAssociationId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventSourceName() == null) ? 0 : getEventSourceName().hashCode());
        hashCode = prime * hashCode + ((getIntegrationAssociationId() == null) ? 0 : getIntegrationAssociationId().hashCode());
        return hashCode;
    }

    @Override
    public RuleTriggerEventSource clone() {
        try {
            return (RuleTriggerEventSource) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.RuleTriggerEventSourceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
