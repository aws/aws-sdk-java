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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/DescribeEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeEndpointResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the endpoint you asked for information about.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the endpoint you asked for information about.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The ARN of the endpoint you asked for information about.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The routing configuration of the endpoint you asked for information about.
     * </p>
     */
    private RoutingConfig routingConfig;
    /**
     * <p>
     * Whether replication is enabled or disabled for the endpoint you asked for information about.
     * </p>
     */
    private ReplicationConfig replicationConfig;
    /**
     * <p>
     * The event buses being used by the endpoint you asked for information about.
     * </p>
     */
    private java.util.List<EndpointEventBus> eventBuses;
    /**
     * <p>
     * The ARN of the role used by the endpoint you asked for information about.
     * </p>
     */
    private String roleArn;
    /**
     * <p>
     * The ID of the endpoint you asked for information about.
     * </p>
     */
    private String endpointId;
    /**
     * <p>
     * The URL of the endpoint you asked for information about.
     * </p>
     */
    private String endpointUrl;
    /**
     * <p>
     * The current state of the endpoint you asked for information about.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The reason the endpoint you asked for information about is in its current state.
     * </p>
     */
    private String stateReason;
    /**
     * <p>
     * The time the endpoint you asked for information about was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The last time the endpoint you asked for information about was modified.
     * </p>
     */
    private java.util.Date lastModifiedTime;

    /**
     * <p>
     * The name of the endpoint you asked for information about.
     * </p>
     * 
     * @param name
     *        The name of the endpoint you asked for information about.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the endpoint you asked for information about.
     * </p>
     * 
     * @return The name of the endpoint you asked for information about.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the endpoint you asked for information about.
     * </p>
     * 
     * @param name
     *        The name of the endpoint you asked for information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the endpoint you asked for information about.
     * </p>
     * 
     * @param description
     *        The description of the endpoint you asked for information about.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the endpoint you asked for information about.
     * </p>
     * 
     * @return The description of the endpoint you asked for information about.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the endpoint you asked for information about.
     * </p>
     * 
     * @param description
     *        The description of the endpoint you asked for information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The ARN of the endpoint you asked for information about.
     * </p>
     * 
     * @param arn
     *        The ARN of the endpoint you asked for information about.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN of the endpoint you asked for information about.
     * </p>
     * 
     * @return The ARN of the endpoint you asked for information about.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN of the endpoint you asked for information about.
     * </p>
     * 
     * @param arn
     *        The ARN of the endpoint you asked for information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The routing configuration of the endpoint you asked for information about.
     * </p>
     * 
     * @param routingConfig
     *        The routing configuration of the endpoint you asked for information about.
     */

    public void setRoutingConfig(RoutingConfig routingConfig) {
        this.routingConfig = routingConfig;
    }

    /**
     * <p>
     * The routing configuration of the endpoint you asked for information about.
     * </p>
     * 
     * @return The routing configuration of the endpoint you asked for information about.
     */

    public RoutingConfig getRoutingConfig() {
        return this.routingConfig;
    }

    /**
     * <p>
     * The routing configuration of the endpoint you asked for information about.
     * </p>
     * 
     * @param routingConfig
     *        The routing configuration of the endpoint you asked for information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withRoutingConfig(RoutingConfig routingConfig) {
        setRoutingConfig(routingConfig);
        return this;
    }

    /**
     * <p>
     * Whether replication is enabled or disabled for the endpoint you asked for information about.
     * </p>
     * 
     * @param replicationConfig
     *        Whether replication is enabled or disabled for the endpoint you asked for information about.
     */

    public void setReplicationConfig(ReplicationConfig replicationConfig) {
        this.replicationConfig = replicationConfig;
    }

    /**
     * <p>
     * Whether replication is enabled or disabled for the endpoint you asked for information about.
     * </p>
     * 
     * @return Whether replication is enabled or disabled for the endpoint you asked for information about.
     */

    public ReplicationConfig getReplicationConfig() {
        return this.replicationConfig;
    }

    /**
     * <p>
     * Whether replication is enabled or disabled for the endpoint you asked for information about.
     * </p>
     * 
     * @param replicationConfig
     *        Whether replication is enabled or disabled for the endpoint you asked for information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withReplicationConfig(ReplicationConfig replicationConfig) {
        setReplicationConfig(replicationConfig);
        return this;
    }

    /**
     * <p>
     * The event buses being used by the endpoint you asked for information about.
     * </p>
     * 
     * @return The event buses being used by the endpoint you asked for information about.
     */

    public java.util.List<EndpointEventBus> getEventBuses() {
        return eventBuses;
    }

    /**
     * <p>
     * The event buses being used by the endpoint you asked for information about.
     * </p>
     * 
     * @param eventBuses
     *        The event buses being used by the endpoint you asked for information about.
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
     * The event buses being used by the endpoint you asked for information about.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventBuses(java.util.Collection)} or {@link #withEventBuses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventBuses
     *        The event buses being used by the endpoint you asked for information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withEventBuses(EndpointEventBus... eventBuses) {
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
     * The event buses being used by the endpoint you asked for information about.
     * </p>
     * 
     * @param eventBuses
     *        The event buses being used by the endpoint you asked for information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withEventBuses(java.util.Collection<EndpointEventBus> eventBuses) {
        setEventBuses(eventBuses);
        return this;
    }

    /**
     * <p>
     * The ARN of the role used by the endpoint you asked for information about.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role used by the endpoint you asked for information about.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role used by the endpoint you asked for information about.
     * </p>
     * 
     * @return The ARN of the role used by the endpoint you asked for information about.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role used by the endpoint you asked for information about.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role used by the endpoint you asked for information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withRoleArn(String roleArn) {
        setRoleArn(roleArn);
        return this;
    }

    /**
     * <p>
     * The ID of the endpoint you asked for information about.
     * </p>
     * 
     * @param endpointId
     *        The ID of the endpoint you asked for information about.
     */

    public void setEndpointId(String endpointId) {
        this.endpointId = endpointId;
    }

    /**
     * <p>
     * The ID of the endpoint you asked for information about.
     * </p>
     * 
     * @return The ID of the endpoint you asked for information about.
     */

    public String getEndpointId() {
        return this.endpointId;
    }

    /**
     * <p>
     * The ID of the endpoint you asked for information about.
     * </p>
     * 
     * @param endpointId
     *        The ID of the endpoint you asked for information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withEndpointId(String endpointId) {
        setEndpointId(endpointId);
        return this;
    }

    /**
     * <p>
     * The URL of the endpoint you asked for information about.
     * </p>
     * 
     * @param endpointUrl
     *        The URL of the endpoint you asked for information about.
     */

    public void setEndpointUrl(String endpointUrl) {
        this.endpointUrl = endpointUrl;
    }

    /**
     * <p>
     * The URL of the endpoint you asked for information about.
     * </p>
     * 
     * @return The URL of the endpoint you asked for information about.
     */

    public String getEndpointUrl() {
        return this.endpointUrl;
    }

    /**
     * <p>
     * The URL of the endpoint you asked for information about.
     * </p>
     * 
     * @param endpointUrl
     *        The URL of the endpoint you asked for information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withEndpointUrl(String endpointUrl) {
        setEndpointUrl(endpointUrl);
        return this;
    }

    /**
     * <p>
     * The current state of the endpoint you asked for information about.
     * </p>
     * 
     * @param state
     *        The current state of the endpoint you asked for information about.
     * @see EndpointState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the endpoint you asked for information about.
     * </p>
     * 
     * @return The current state of the endpoint you asked for information about.
     * @see EndpointState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the endpoint you asked for information about.
     * </p>
     * 
     * @param state
     *        The current state of the endpoint you asked for information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointState
     */

    public DescribeEndpointResult withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the endpoint you asked for information about.
     * </p>
     * 
     * @param state
     *        The current state of the endpoint you asked for information about.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EndpointState
     */

    public DescribeEndpointResult withState(EndpointState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The reason the endpoint you asked for information about is in its current state.
     * </p>
     * 
     * @param stateReason
     *        The reason the endpoint you asked for information about is in its current state.
     */

    public void setStateReason(String stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason the endpoint you asked for information about is in its current state.
     * </p>
     * 
     * @return The reason the endpoint you asked for information about is in its current state.
     */

    public String getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason the endpoint you asked for information about is in its current state.
     * </p>
     * 
     * @param stateReason
     *        The reason the endpoint you asked for information about is in its current state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withStateReason(String stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * The time the endpoint you asked for information about was created.
     * </p>
     * 
     * @param creationTime
     *        The time the endpoint you asked for information about was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time the endpoint you asked for information about was created.
     * </p>
     * 
     * @return The time the endpoint you asked for information about was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time the endpoint you asked for information about was created.
     * </p>
     * 
     * @param creationTime
     *        The time the endpoint you asked for information about was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The last time the endpoint you asked for information about was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time the endpoint you asked for information about was modified.
     */

    public void setLastModifiedTime(java.util.Date lastModifiedTime) {
        this.lastModifiedTime = lastModifiedTime;
    }

    /**
     * <p>
     * The last time the endpoint you asked for information about was modified.
     * </p>
     * 
     * @return The last time the endpoint you asked for information about was modified.
     */

    public java.util.Date getLastModifiedTime() {
        return this.lastModifiedTime;
    }

    /**
     * <p>
     * The last time the endpoint you asked for information about was modified.
     * </p>
     * 
     * @param lastModifiedTime
     *        The last time the endpoint you asked for information about was modified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeEndpointResult withLastModifiedTime(java.util.Date lastModifiedTime) {
        setLastModifiedTime(lastModifiedTime);
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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
            sb.append("State: ").append(getState()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getLastModifiedTime() != null)
            sb.append("LastModifiedTime: ").append(getLastModifiedTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeEndpointResult == false)
            return false;
        DescribeEndpointResult other = (DescribeEndpointResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getLastModifiedTime() == null ^ this.getLastModifiedTime() == null)
            return false;
        if (other.getLastModifiedTime() != null && other.getLastModifiedTime().equals(this.getLastModifiedTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfig() == null) ? 0 : getRoutingConfig().hashCode());
        hashCode = prime * hashCode + ((getReplicationConfig() == null) ? 0 : getReplicationConfig().hashCode());
        hashCode = prime * hashCode + ((getEventBuses() == null) ? 0 : getEventBuses().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        hashCode = prime * hashCode + ((getEndpointId() == null) ? 0 : getEndpointId().hashCode());
        hashCode = prime * hashCode + ((getEndpointUrl() == null) ? 0 : getEndpointUrl().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTime() == null) ? 0 : getLastModifiedTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeEndpointResult clone() {
        try {
            return (DescribeEndpointResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
