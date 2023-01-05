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
package com.amazonaws.services.eventbridge.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/UpdateEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the endpoint you updated in this request.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ARN of the endpoint you updated in this request.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The routing configuration you updated in this request.
     * </p>
     */
    private RoutingConfig routingConfig;
    /**
     * <p>
     * Whether event replication was enabled or disabled for the endpoint you updated in this request.
     * </p>
     */
    private ReplicationConfig replicationConfig;
    /**
     * <p>
     * The event buses used for replication for the endpoint you updated in this request.
     * </p>
     */
    private java.util.List<EndpointEventBus> eventBuses;
    /**
     * <p>
     * The ARN of the role used by event replication for the endpoint you updated in this request.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The ID of the endpoint you updated in this request.
     * </p>
     */
    private String endpointId;
    /**
     * <p>
     * The URL of the endpoint you updated in this request.
     * </p>
     */
    private String endpointUrl;
    /**
     * <p>
     * The state of the endpoint you updated in this request.
     * </p>
     */
    private String state;

    /**
     * <p>
     * The name of the endpoint you updated in this request.
     * </p>
     * 
     * @param name
     *        The name of the endpoint you updated in this request.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the endpoint you updated in this request.
     * </p>
     * 
     * @return The name of the endpoint you updated in this request.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the endpoint you updated in this request.
     * </p>
     * 
     * @param name
     *        The name of the endpoint you updated in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ARN of the endpoint you updated in this request.
     * </p>
     * 
     * @param arn
     *        The ARN of the endpoint you updated in this request.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the endpoint you updated in this request.
     * </p>
     * 
     * @return The ARN of the endpoint you updated in this request.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the endpoint you updated in this request.
     * </p>
     * 
     * @param arn
     *        The ARN of the endpoint you updated in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The routing configuration you updated in this request.
     * </p>
     * 
     * @param routingConfig
     *        The routing configuration you updated in this request.
     */

    public void setRoutingConfig(RoutingConfig routingConfig) {
        this.routingConfig = routingConfig;
    }

    /**
     * <p>
     * The routing configuration you updated in this request.
     * </p>
     * 
     * @return The routing configuration you updated in this request.
     */

    public RoutingConfig getRoutingConfig() {
        return this.routingConfig;
    }

    /**
     * <p>
     * The routing configuration you updated in this request.
     * </p>
     * 
     * @param routingConfig
     *        The routing configuration you updated in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointResult withRoutingConfig(RoutingConfig routingConfig) {
        setRoutingConfig(routingConfig);
        return this;
    }

    /**
     * <p>
     * Whether event replication was enabled or disabled for the endpoint you updated in this request.
     * </p>
     * 
     * @param replicationConfig
     *        Whether event replication was enabled or disabled for the endpoint you updated in this request.
     */

    public void setReplicationConfig(ReplicationConfig replicationConfig) {
        this.replicationConfig = replicationConfig;
    }

    /**
     * <p>
     * Whether event replication was enabled or disabled for the endpoint you updated in this request.
     * </p>
     * 
     * @return Whether event replication was enabled or disabled for the endpoint you updated in this request.
     */

    public ReplicationConfig getReplicationConfig() {
        return this.replicationConfig;
    }

    /**
     * <p>
     * Whether event replication was enabled or disabled for the endpoint you updated in this request.
     * </p>
     * 
     * @param replicationConfig
     *        Whether event replication was enabled or disabled for the endpoint you updated in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointResult withReplicationConfig(ReplicationConfig replicationConfig) {
        setReplicationConfig(replicationConfig);
        return this;
    }

    /**
     * <p>
     * The event buses used for replication for the endpoint you updated in this request.
     * </p>
     * 
     * @return The event buses used for replication for the endpoint you updated in this request.
     */

    public java.util.List<EndpointEventBus> getEventBuses() {
        return eventBuses;
    }

    /**
     * <p>
     * The event buses used for replication for the endpoint you updated in this request.
     * </p>
     * 
     * @param eventBuses
     *        The event buses used for replication for the endpoint you updated in this request.
     */

    public void setEventBuses(java.util.Collection<EndpointEventBus> eventBuses) {
        if (eventBuses == null) {
            this.eventBuses = null;
            return;
        }

        this.eventBuses = new java.util.ArrayList<EndpointEventBus>(eventBuses);
    }

    /**
     * <p>
     * The event buses used for replication for the endpoint you updated in this request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventBuses(java.util.Collection)} or {@link #withEventBuses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventBuses
     *        The event buses used for replication for the endpoint you updated in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointResult withEventBuses(EndpointEventBus... eventBuses) {
        if (this.eventBuses == null) {
            setEventBuses(new java.util.ArrayList<EndpointEventBus>(eventBuses.length));
        }
        for (EndpointEventBus ele : eventBuses) {
            this.eventBuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The event buses used for replication for the endpoint you updated in this request.
     * </p>
     * 
     * @param eventBuses
     *        The event buses used for replication for the endpoint you updated in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointResult withEventBuses(java.util.Collection<EndpointEventBus> eventBuses) {
        setEventBuses(eventBuses);
        return this;
    }

    /**
     * <p>
     * The ARN of the role used by event replication for the endpoint you updated in this request.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role used by event replication for the endpoint you updated in this request.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role used by event replication for the endpoint you updated in this request.
     * </p>
     * 
     * @return The ARN of the role used by event replication for the endpoint you updated in this request.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role used by event replication for the endpoint you updated in this request.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role used by event replication for the endpoint you updated in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The ID of the endpoint you updated in this request.
     * </p>
     * 
     * @param endpointId
     *        The ID of the endpoint you updated in this request.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The ID of the endpoint you updated in this request.
     * </p>
     * 
     * @return The ID of the endpoint you updated in this request.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * The ID of the endpoint you updated in this request.
     * </p>
     * 
     * @param endpointId
     *        The ID of the endpoint you updated in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointResult withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * The URL of the endpoint you updated in this request.
     * </p>
     * 
     * @param endpointUrl
     *        The URL of the endpoint you updated in this request.
     */

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    /**
     * <p>
     * The URL of the endpoint you updated in this request.
     * </p>
     * 
     * @return The URL of the endpoint you updated in this request.
     */

    public String getEndpointUrl() {
        return this.endpointUrl;
    }

    /**
     * <p>
     * The URL of the endpoint you updated in this request.
     * </p>
     * 
     * @param endpointUrl
     *        The URL of the endpoint you updated in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateEndpointResult withEndpointUrl(String endpointUrl) {
        setEndpointUrl(endpointUrl);
        return this;
    }

    /**
     * <p>
     * The state of the endpoint you updated in this request.
     * </p>
     * 
     * @param state
     *        The state of the endpoint you updated in this request.
     * @see EndpointState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the endpoint you updated in this request.
     * </p>
     * 
     * @return The state of the endpoint you updated in this request.
     * @see EndpointState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the endpoint you updated in this request.
     * </p>
     * 
     * @param state
     *        The state of the endpoint you updated in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointState
     */

    public UpdateEndpointResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the endpoint you updated in this request.
     * </p>
     * 
     * @param state
     *        The state of the endpoint you updated in this request.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointState
     */

    public UpdateEndpointResult withState(EndpointState state) {
        this.state = state.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getRoutingConfig() != null)
            sb.append("RoutingConfig: ").append(getRoutingConfig()).append(",");
        if (getReplicationConfig() != null)
            sb.append("ReplicationConfig: ").append(getReplicationConfig()).append(",");
        if (getEventBuses() != null)
            sb.append("EventBuses: ").append(getEventBuses()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn()).append(",");
        if (getEndpointId() != null)
            sb.append("EndpointId: ").append(getEndpointId()).append(",");
        if (getEndpointUrl() != null)
            sb.append("EndpointUrl: ").append(getEndpointUrl()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateEndpointResult == false)
            return false;
        UpdateEndpointResult other = (UpdateEndpointResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getRoutingConfig() == null ^ this.getRoutingConfig() == null)
            return false;
        if (other.getRoutingConfig() != null && other.getRoutingConfig().equals(this.getRoutingConfig()) == false)
            return false;
        if (other.getReplicationConfig() == null ^ this.getReplicationConfig() == null)
            return false;
        if (other.getReplicationConfig() != null && other.getReplicationConfig().equals(this.getReplicationConfig()) == false)
            return false;
        if (other.getEventBuses() == null ^ this.getEventBuses() == null)
            return false;
        if (other.getEventBuses() != null && other.getEventBuses().equals(this.getEventBuses()) == false)
            return false;
        if (other.getRoleArn() == null ^ this.getRoleArn() == null)
            return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false)
            return false;
        if (other.getEndpointId() == null ^ this.getEndpointId() == null)
            return false;
        if (other.getEndpointId() != null && other.getEndpointId().equals(this.getEndpointId()) == false)
            return false;
        if (other.getEndpointUrl() == null ^ this.getEndpointUrl() == null)
            return false;
        if (other.getEndpointUrl() != null && other.getEndpointUrl().equals(this.getEndpointUrl()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfig() == null) ? 0 : getRoutingConfig().hashCode());
        hashCode = prime * hashCode + ((getReplicationConfig() == null) ? 0 : getReplicationConfig().hashCode());
        hashCode = prime * hashCode + ((getEventBuses() == null) ? 0 : getEventBuses().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getEndpointUrl() == null) ? 0 : getEndpointUrl().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        return hashCode;
    }

    @Override
    public UpdateEndpointResult clone() {
        try {
            return (UpdateEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
