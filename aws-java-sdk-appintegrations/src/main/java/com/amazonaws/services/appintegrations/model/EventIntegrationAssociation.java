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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The Amazon AppIntegrations APIs are in preview release and are subject to change.
 * </p>
 * <p>
 * The event integration association.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/EventIntegrationAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventIntegrationAssociation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the event integration association.
     * </p>
     */
    private String eventIntegrationAssociationArn;
    /**
     * <p>
     * The identifier for the event integration association.
     * </p>
     */
    private String eventIntegrationAssociationId;
    /**
     * <p>
     * The name of the event integration.
     * </p>
     */
    private String eventIntegrationName;
    /**
     * <p>
     * The identifier for the client that is associated with the event integration.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The name of the Eventbridge rule.
     * </p>
     */
    private String eventBridgeRuleName;
    /**
     * <p>
     * The metadata associated with the client.
     * </p>
     */
    private java.util.Map<String, String> clientAssociationMetadata;

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the event integration association.
     * </p>
     * 
     * @param eventIntegrationAssociationArn
     *        The Amazon Resource Name (ARN) for the event integration association.
     */

    public void setEventIntegrationAssociationArn(String eventIntegrationAssociationArn) {
        this.eventIntegrationAssociationArn = eventIntegrationAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the event integration association.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) for the event integration association.
     */

    public String getEventIntegrationAssociationArn() {
        return this.eventIntegrationAssociationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) for the event integration association.
     * </p>
     * 
     * @param eventIntegrationAssociationArn
     *        The Amazon Resource Name (ARN) for the event integration association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegrationAssociation withEventIntegrationAssociationArn(String eventIntegrationAssociationArn) {
        setEventIntegrationAssociationArn(eventIntegrationAssociationArn);
        return this;
    }

    /**
     * <p>
     * The identifier for the event integration association.
     * </p>
     * 
     * @param eventIntegrationAssociationId
     *        The identifier for the event integration association.
     */

    public void setEventIntegrationAssociationId(String eventIntegrationAssociationId) {
        this.eventIntegrationAssociationId = eventIntegrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the event integration association.
     * </p>
     * 
     * @return The identifier for the event integration association.
     */

    public String getEventIntegrationAssociationId() {
        return this.eventIntegrationAssociationId;
    }

    /**
     * <p>
     * The identifier for the event integration association.
     * </p>
     * 
     * @param eventIntegrationAssociationId
     *        The identifier for the event integration association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegrationAssociation withEventIntegrationAssociationId(String eventIntegrationAssociationId) {
        setEventIntegrationAssociationId(eventIntegrationAssociationId);
        return this;
    }

    /**
     * <p>
     * The name of the event integration.
     * </p>
     * 
     * @param eventIntegrationName
     *        The name of the event integration.
     */

    public void setEventIntegrationName(String eventIntegrationName) {
        this.eventIntegrationName = eventIntegrationName;
    }

    /**
     * <p>
     * The name of the event integration.
     * </p>
     * 
     * @return The name of the event integration.
     */

    public String getEventIntegrationName() {
        return this.eventIntegrationName;
    }

    /**
     * <p>
     * The name of the event integration.
     * </p>
     * 
     * @param eventIntegrationName
     *        The name of the event integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegrationAssociation withEventIntegrationName(String eventIntegrationName) {
        setEventIntegrationName(eventIntegrationName);
        return this;
    }

    /**
     * <p>
     * The identifier for the client that is associated with the event integration.
     * </p>
     * 
     * @param clientId
     *        The identifier for the client that is associated with the event integration.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The identifier for the client that is associated with the event integration.
     * </p>
     * 
     * @return The identifier for the client that is associated with the event integration.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The identifier for the client that is associated with the event integration.
     * </p>
     * 
     * @param clientId
     *        The identifier for the client that is associated with the event integration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegrationAssociation withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The name of the Eventbridge rule.
     * </p>
     * 
     * @param eventBridgeRuleName
     *        The name of the Eventbridge rule.
     */

    public void setEventBridgeRuleName(String eventBridgeRuleName) {
        this.eventBridgeRuleName = eventBridgeRuleName;
    }

    /**
     * <p>
     * The name of the Eventbridge rule.
     * </p>
     * 
     * @return The name of the Eventbridge rule.
     */

    public String getEventBridgeRuleName() {
        return this.eventBridgeRuleName;
    }

    /**
     * <p>
     * The name of the Eventbridge rule.
     * </p>
     * 
     * @param eventBridgeRuleName
     *        The name of the Eventbridge rule.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegrationAssociation withEventBridgeRuleName(String eventBridgeRuleName) {
        setEventBridgeRuleName(eventBridgeRuleName);
        return this;
    }

    /**
     * <p>
     * The metadata associated with the client.
     * </p>
     * 
     * @return The metadata associated with the client.
     */

    public java.util.Map<String, String> getClientAssociationMetadata() {
        return clientAssociationMetadata;
    }

    /**
     * <p>
     * The metadata associated with the client.
     * </p>
     * 
     * @param clientAssociationMetadata
     *        The metadata associated with the client.
     */

    public void setClientAssociationMetadata(java.util.Map<String, String> clientAssociationMetadata) {
        this.clientAssociationMetadata = clientAssociationMetadata;
    }

    /**
     * <p>
     * The metadata associated with the client.
     * </p>
     * 
     * @param clientAssociationMetadata
     *        The metadata associated with the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegrationAssociation withClientAssociationMetadata(java.util.Map<String, String> clientAssociationMetadata) {
        setClientAssociationMetadata(clientAssociationMetadata);
        return this;
    }

    /**
     * Add a single ClientAssociationMetadata entry
     *
     * @see EventIntegrationAssociation#withClientAssociationMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegrationAssociation addClientAssociationMetadataEntry(String key, String value) {
        if (null == this.clientAssociationMetadata) {
            this.clientAssociationMetadata = new java.util.HashMap<String, String>();
        }
        if (this.clientAssociationMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.clientAssociationMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ClientAssociationMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventIntegrationAssociation clearClientAssociationMetadataEntries() {
        this.clientAssociationMetadata = null;
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
        if (getEventIntegrationAssociationArn() != null)
            sb.append("EventIntegrationAssociationArn: ").append(getEventIntegrationAssociationArn()).append(",");
        if (getEventIntegrationAssociationId() != null)
            sb.append("EventIntegrationAssociationId: ").append(getEventIntegrationAssociationId()).append(",");
        if (getEventIntegrationName() != null)
            sb.append("EventIntegrationName: ").append(getEventIntegrationName()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getEventBridgeRuleName() != null)
            sb.append("EventBridgeRuleName: ").append(getEventBridgeRuleName()).append(",");
        if (getClientAssociationMetadata() != null)
            sb.append("ClientAssociationMetadata: ").append(getClientAssociationMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventIntegrationAssociation == false)
            return false;
        EventIntegrationAssociation other = (EventIntegrationAssociation) obj;
        if (other.getEventIntegrationAssociationArn() == null ^ this.getEventIntegrationAssociationArn() == null)
            return false;
        if (other.getEventIntegrationAssociationArn() != null
                && other.getEventIntegrationAssociationArn().equals(this.getEventIntegrationAssociationArn()) == false)
            return false;
        if (other.getEventIntegrationAssociationId() == null ^ this.getEventIntegrationAssociationId() == null)
            return false;
        if (other.getEventIntegrationAssociationId() != null
                && other.getEventIntegrationAssociationId().equals(this.getEventIntegrationAssociationId()) == false)
            return false;
        if (other.getEventIntegrationName() == null ^ this.getEventIntegrationName() == null)
            return false;
        if (other.getEventIntegrationName() != null && other.getEventIntegrationName().equals(this.getEventIntegrationName()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getEventBridgeRuleName() == null ^ this.getEventBridgeRuleName() == null)
            return false;
        if (other.getEventBridgeRuleName() != null && other.getEventBridgeRuleName().equals(this.getEventBridgeRuleName()) == false)
            return false;
        if (other.getClientAssociationMetadata() == null ^ this.getClientAssociationMetadata() == null)
            return false;
        if (other.getClientAssociationMetadata() != null && other.getClientAssociationMetadata().equals(this.getClientAssociationMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventIntegrationAssociationArn() == null) ? 0 : getEventIntegrationAssociationArn().hashCode());
        hashCode = prime * hashCode + ((getEventIntegrationAssociationId() == null) ? 0 : getEventIntegrationAssociationId().hashCode());
        hashCode = prime * hashCode + ((getEventIntegrationName() == null) ? 0 : getEventIntegrationName().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getEventBridgeRuleName() == null) ? 0 : getEventBridgeRuleName().hashCode());
        hashCode = prime * hashCode + ((getClientAssociationMetadata() == null) ? 0 : getClientAssociationMetadata().hashCode());
        return hashCode;
    }

    @Override
    public EventIntegrationAssociation clone() {
        try {
            return (EventIntegrationAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appintegrations.model.transform.EventIntegrationAssociationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
