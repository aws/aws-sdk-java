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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about an Amazon EventBridge global endpoint. The endpoint can improve your application’s
 * availability by making it Regional-fault tolerant.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEventsEndpointDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEventsEndpointDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * A description of the endpoint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The URL subdomain of the endpoint. For example, if <code>EndpointUrl</code> is
     * <code>https://abcde.veo.endpoints.event.amazonaws.com</code>, then the <code>EndpointId</code> is
     * <code>abcde.veo</code>.
     * </p>
     */
    private String endpointId;
    /**
     * <p>
     * The URL of the endpoint.
     * </p>
     */
    private String endpointUrl;
    /**
     * <p>
     * The event buses being used by the endpoint.
     * </p>
     */
    private java.util.List<AwsEventsEndpointEventBusesDetails> eventBuses;
    /**
     * <p>
     * The name of the endpoint.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Whether event replication was enabled or disabled for this endpoint. The default state is <code>ENABLED</code>,
     * which means you must supply a <code>RoleArn</code>. If you don't have a <code>RoleArn</code> or you don't want
     * event replication enabled, set the state to <code>DISABLED</code>.
     * </p>
     */
    private AwsEventsEndpointReplicationConfigDetails replicationConfig;
    /**
     * <p>
     * The ARN of the role used by event replication for the endpoint.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The routing configuration of the endpoint.
     * </p>
     */
    private AwsEventsEndpointRoutingConfigDetails routingConfig;
    /**
     * <p>
     * The current state of the endpoint.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason the endpoint is in its current state.
     * </p>
     */
    private String stateReason;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the endpoint.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the endpoint.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the endpoint.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventsEndpointDetails withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * A description of the endpoint.
     * </p>
     * 
     * @param description
     *        A description of the endpoint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the endpoint.
     * </p>
     * 
     * @return A description of the endpoint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the endpoint.
     * </p>
     * 
     * @param description
     *        A description of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventsEndpointDetails withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The URL subdomain of the endpoint. For example, if <code>EndpointUrl</code> is
     * <code>https://abcde.veo.endpoints.event.amazonaws.com</code>, then the <code>EndpointId</code> is
     * <code>abcde.veo</code>.
     * </p>
     * 
     * @param endpointId
     *        The URL subdomain of the endpoint. For example, if <code>EndpointUrl</code> is
     *        <code>https://abcde.veo.endpoints.event.amazonaws.com</code>, then the <code>EndpointId</code> is
     *        <code>abcde.veo</code>.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The URL subdomain of the endpoint. For example, if <code>EndpointUrl</code> is
     * <code>https://abcde.veo.endpoints.event.amazonaws.com</code>, then the <code>EndpointId</code> is
     * <code>abcde.veo</code>.
     * </p>
     * 
     * @return The URL subdomain of the endpoint. For example, if <code>EndpointUrl</code> is
     *         <code>https://abcde.veo.endpoints.event.amazonaws.com</code>, then the <code>EndpointId</code> is
     *         <code>abcde.veo</code>.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * The URL subdomain of the endpoint. For example, if <code>EndpointUrl</code> is
     * <code>https://abcde.veo.endpoints.event.amazonaws.com</code>, then the <code>EndpointId</code> is
     * <code>abcde.veo</code>.
     * </p>
     * 
     * @param endpointId
     *        The URL subdomain of the endpoint. For example, if <code>EndpointUrl</code> is
     *        <code>https://abcde.veo.endpoints.event.amazonaws.com</code>, then the <code>EndpointId</code> is
     *        <code>abcde.veo</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventsEndpointDetails withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * The URL of the endpoint.
     * </p>
     * 
     * @param endpointUrl
     *        The URL of the endpoint.
     */

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    /**
     * <p>
     * The URL of the endpoint.
     * </p>
     * 
     * @return The URL of the endpoint.
     */

    public String getEndpointUrl() {
        return this.endpointUrl;
    }

    /**
     * <p>
     * The URL of the endpoint.
     * </p>
     * 
     * @param endpointUrl
     *        The URL of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventsEndpointDetails withEndpointUrl(String endpointUrl) {
        setEndpointUrl(endpointUrl);
        return this;
    }

    /**
     * <p>
     * The event buses being used by the endpoint.
     * </p>
     * 
     * @return The event buses being used by the endpoint.
     */

    public java.util.List<AwsEventsEndpointEventBusesDetails> getEventBuses() {
        return eventBuses;
    }

    /**
     * <p>
     * The event buses being used by the endpoint.
     * </p>
     * 
     * @param eventBuses
     *        The event buses being used by the endpoint.
     */

    public void setEventBuses(java.util.Collection<AwsEventsEndpointEventBusesDetails> eventBuses) {
        if (eventBuses == null) {
            this.eventBuses = null;
            return;
        }

        this.eventBuses = new java.util.ArrayList<AwsEventsEndpointEventBusesDetails>(eventBuses);
    }

    /**
     * <p>
     * The event buses being used by the endpoint.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventBuses(java.util.Collection)} or {@link #withEventBuses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventBuses
     *        The event buses being used by the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventsEndpointDetails withEventBuses(AwsEventsEndpointEventBusesDetails... eventBuses) {
        if (this.eventBuses == null) {
            setEventBuses(new java.util.ArrayList<AwsEventsEndpointEventBusesDetails>(eventBuses.length));
        }
        for (AwsEventsEndpointEventBusesDetails ele : eventBuses) {
            this.eventBuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event buses being used by the endpoint.
     * </p>
     * 
     * @param eventBuses
     *        The event buses being used by the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventsEndpointDetails withEventBuses(java.util.Collection<AwsEventsEndpointEventBusesDetails> eventBuses) {
        setEventBuses(eventBuses);
        return this;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param name
     *        The name of the endpoint.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @return The name of the endpoint.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the endpoint.
     * </p>
     * 
     * @param name
     *        The name of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventsEndpointDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Whether event replication was enabled or disabled for this endpoint. The default state is <code>ENABLED</code>,
     * which means you must supply a <code>RoleArn</code>. If you don't have a <code>RoleArn</code> or you don't want
     * event replication enabled, set the state to <code>DISABLED</code>.
     * </p>
     * 
     * @param replicationConfig
     *        Whether event replication was enabled or disabled for this endpoint. The default state is
     *        <code>ENABLED</code>, which means you must supply a <code>RoleArn</code>. If you don't have a
     *        <code>RoleArn</code> or you don't want event replication enabled, set the state to <code>DISABLED</code>.
     */

    public void setReplicationConfig(AwsEventsEndpointReplicationConfigDetails replicationConfig) {
        this.replicationConfig = replicationConfig;
    }

    /**
     * <p>
     * Whether event replication was enabled or disabled for this endpoint. The default state is <code>ENABLED</code>,
     * which means you must supply a <code>RoleArn</code>. If you don't have a <code>RoleArn</code> or you don't want
     * event replication enabled, set the state to <code>DISABLED</code>.
     * </p>
     * 
     * @return Whether event replication was enabled or disabled for this endpoint. The default state is
     *         <code>ENABLED</code>, which means you must supply a <code>RoleArn</code>. If you don't have a
     *         <code>RoleArn</code> or you don't want event replication enabled, set the state to <code>DISABLED</code>.
     */

    public AwsEventsEndpointReplicationConfigDetails getReplicationConfig() {
        return this.replicationConfig;
    }

    /**
     * <p>
     * Whether event replication was enabled or disabled for this endpoint. The default state is <code>ENABLED</code>,
     * which means you must supply a <code>RoleArn</code>. If you don't have a <code>RoleArn</code> or you don't want
     * event replication enabled, set the state to <code>DISABLED</code>.
     * </p>
     * 
     * @param replicationConfig
     *        Whether event replication was enabled or disabled for this endpoint. The default state is
     *        <code>ENABLED</code>, which means you must supply a <code>RoleArn</code>. If you don't have a
     *        <code>RoleArn</code> or you don't want event replication enabled, set the state to <code>DISABLED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventsEndpointDetails withReplicationConfig(AwsEventsEndpointReplicationConfigDetails replicationConfig) {
        setReplicationConfig(replicationConfig);
        return this;
    }

    /**
     * <p>
     * The ARN of the role used by event replication for the endpoint.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role used by event replication for the endpoint.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role used by event replication for the endpoint.
     * </p>
     * 
     * @return The ARN of the role used by event replication for the endpoint.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role used by event replication for the endpoint.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role used by event replication for the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventsEndpointDetails withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The routing configuration of the endpoint.
     * </p>
     * 
     * @param routingConfig
     *        The routing configuration of the endpoint.
     */

    public void setRoutingConfig(AwsEventsEndpointRoutingConfigDetails routingConfig) {
        this.routingConfig = routingConfig;
    }

    /**
     * <p>
     * The routing configuration of the endpoint.
     * </p>
     * 
     * @return The routing configuration of the endpoint.
     */

    public AwsEventsEndpointRoutingConfigDetails getRoutingConfig() {
        return this.routingConfig;
    }

    /**
     * <p>
     * The routing configuration of the endpoint.
     * </p>
     * 
     * @param routingConfig
     *        The routing configuration of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventsEndpointDetails withRoutingConfig(AwsEventsEndpointRoutingConfigDetails routingConfig) {
        setRoutingConfig(routingConfig);
        return this;
    }

    /**
     * <p>
     * The current state of the endpoint.
     * </p>
     * 
     * @param state
     *        The current state of the endpoint.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the endpoint.
     * </p>
     * 
     * @return The current state of the endpoint.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the endpoint.
     * </p>
     * 
     * @param state
     *        The current state of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventsEndpointDetails withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The reason the endpoint is in its current state.
     * </p>
     * 
     * @param stateReason
     *        The reason the endpoint is in its current state.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason the endpoint is in its current state.
     * </p>
     * 
     * @return The reason the endpoint is in its current state.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason the endpoint is in its current state.
     * </p>
     * 
     * @param stateReason
     *        The reason the endpoint is in its current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEventsEndpointDetails withStateReason(String stateReason) {
        setStateReason(stateReason);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append(getEndpointId()).append(",");
        if (getEndpointUrl() != null)
            sb.append("EndpointUrl: ").append(getEndpointUrl()).append(",");
        if (getEventBuses() != null)
            sb.append("EventBuses: ").append(getEventBuses()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReplicationConfig() != null)
            sb.append("ReplicationConfig: ").append(getReplicationConfig()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getRoutingConfig() != null)
            sb.append("RoutingConfig: ").append(getRoutingConfig()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEventsEndpointDetails == false)
            return false;
        AwsEventsEndpointDetails other = (AwsEventsEndpointDetails) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getEndpointUrl() == null ^ this.getEndpointUrl() == null)
            return false;
        if (other.getEndpointUrl() != null && other.getEndpointUrl().equals(this.getEndpointUrl()) == false)
            return false;
        if (other.getEventBuses() == null ^ this.getEventBuses() == null)
            return false;
        if (other.getEventBuses() != null && other.getEventBuses().equals(this.getEventBuses()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReplicationConfig() == null ^ this.getReplicationConfig() == null)
            return false;
        if (other.getReplicationConfig() != null && other.getReplicationConfig().equals(this.getReplicationConfig()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getRoutingConfig() == null ^ this.getRoutingConfig() == null)
            return false;
        if (other.getRoutingConfig() != null && other.getRoutingConfig().equals(this.getRoutingConfig()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getEndpointUrl() == null) ? 0 : getEndpointUrl().hashCode());
        hashCode = prime * hashCode + ((getEventBuses() == null) ? 0 : getEventBuses().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReplicationConfig() == null) ? 0 : getReplicationConfig().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfig() == null) ? 0 : getRoutingConfig().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        return hashCode;
    }

    @Override
    public AwsEventsEndpointDetails clone() {
        try {
            return (AwsEventsEndpointDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEventsEndpointDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
