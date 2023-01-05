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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eventbridge-2015-10-07/CreateEndpoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateEndpointRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the global endpoint. For example, <code>"Name":"us-east-2-custom_bus_A-endpoint"</code>.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description of the global endpoint.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Configure the routing policy, including the health check and secondary Region..
     * </p>
     */
    private RoutingConfig routingConfig;
    /**
     * <p>
     * Enable or disable event replication.
     * </p>
     */
    private ReplicationConfig replicationConfig;
    /**
     * <p>
     * Define the event buses used.
     * </p>
     * <important>
     * <p>
     * The names of the event buses must be identical in each Region.
     * </p>
     * </important>
     */
    private java.util.List<EndpointEventBus> eventBuses;
    /**
     * <p>
     * The ARN of the role used for replication.
     * </p>
     */
    private String roleArn;

    /**
     * <p>
     * The name of the global endpoint. For example, <code>"Name":"us-east-2-custom_bus_A-endpoint"</code>.
     * </p>
     * 
     * @param name
     *        The name of the global endpoint. For example, <code>"Name":"us-east-2-custom_bus_A-endpoint"</code>.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the global endpoint. For example, <code>"Name":"us-east-2-custom_bus_A-endpoint"</code>.
     * </p>
     * 
     * @return The name of the global endpoint. For example, <code>"Name":"us-east-2-custom_bus_A-endpoint"</code>.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the global endpoint. For example, <code>"Name":"us-east-2-custom_bus_A-endpoint"</code>.
     * </p>
     * 
     * @param name
     *        The name of the global endpoint. For example, <code>"Name":"us-east-2-custom_bus_A-endpoint"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * A description of the global endpoint.
     * </p>
     * 
     * @param description
     *        A description of the global endpoint.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the global endpoint.
     * </p>
     * 
     * @return A description of the global endpoint.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the global endpoint.
     * </p>
     * 
     * @param description
     *        A description of the global endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Configure the routing policy, including the health check and secondary Region..
     * </p>
     * 
     * @param routingConfig
     *        Configure the routing policy, including the health check and secondary Region..
     */

    public void setRoutingConfig(RoutingConfig routingConfig) {
        this.routingConfig = routingConfig;
    }

    /**
     * <p>
     * Configure the routing policy, including the health check and secondary Region..
     * </p>
     * 
     * @return Configure the routing policy, including the health check and secondary Region..
     */

    public RoutingConfig getRoutingConfig() {
        return this.routingConfig;
    }

    /**
     * <p>
     * Configure the routing policy, including the health check and secondary Region..
     * </p>
     * 
     * @param routingConfig
     *        Configure the routing policy, including the health check and secondary Region..
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withRoutingConfig(RoutingConfig routingConfig) {
        setRoutingConfig(routingConfig);
        return this;
    }

    /**
     * <p>
     * Enable or disable event replication.
     * </p>
     * 
     * @param replicationConfig
     *        Enable or disable event replication.
     */

    public void setReplicationConfig(ReplicationConfig replicationConfig) {
        this.replicationConfig = replicationConfig;
    }

    /**
     * <p>
     * Enable or disable event replication.
     * </p>
     * 
     * @return Enable or disable event replication.
     */

    public ReplicationConfig getReplicationConfig() {
        return this.replicationConfig;
    }

    /**
     * <p>
     * Enable or disable event replication.
     * </p>
     * 
     * @param replicationConfig
     *        Enable or disable event replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withReplicationConfig(ReplicationConfig replicationConfig) {
        setReplicationConfig(replicationConfig);
        return this;
    }

    /**
     * <p>
     * Define the event buses used.
     * </p>
     * <important>
     * <p>
     * The names of the event buses must be identical in each Region.
     * </p>
     * </important>
     * 
     * @return Define the event buses used. </p> <important>
     *         <p>
     *         The names of the event buses must be identical in each Region.
     *         </p>
     */

    public java.util.List<EndpointEventBus> getEventBuses() {
        return eventBuses;
    }

    /**
     * <p>
     * Define the event buses used.
     * </p>
     * <important>
     * <p>
     * The names of the event buses must be identical in each Region.
     * </p>
     * </important>
     * 
     * @param eventBuses
     *        Define the event buses used. </p> <important>
     *        <p>
     *        The names of the event buses must be identical in each Region.
     *        </p>
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
     * Define the event buses used.
     * </p>
     * <important>
     * <p>
     * The names of the event buses must be identical in each Region.
     * </p>
     * </important>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventBuses(java.util.Collection)} or {@link #withEventBuses(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventBuses
     *        Define the event buses used. </p> <important>
     *        <p>
     *        The names of the event buses must be identical in each Region.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withEventBuses(EndpointEventBus... eventBuses) {
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
     * Define the event buses used.
     * </p>
     * <important>
     * <p>
     * The names of the event buses must be identical in each Region.
     * </p>
     * </important>
     * 
     * @param eventBuses
     *        Define the event buses used. </p> <important>
     *        <p>
     *        The names of the event buses must be identical in each Region.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withEventBuses(java.util.Collection<EndpointEventBus> eventBuses) {
        setEventBuses(eventBuses);
        return this;
    }

    /**
     * <p>
     * The ARN of the role used for replication.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role used for replication.
     */

    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }

    /**
     * <p>
     * The ARN of the role used for replication.
     * </p>
     * 
     * @return The ARN of the role used for replication.
     */

    public String getRoleArn() {
        return this.roleArn;
    }

    /**
     * <p>
     * The ARN of the role used for replication.
     * </p>
     * 
     * @param roleArn
     *        The ARN of the role used for replication.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateEndpointRequest withRoleArn(String roleArn) {
        setRoleArn(roleArn);
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
        if (getRoutingConfig() != null)
            sb.append("RoutingConfig: ").append(getRoutingConfig()).append(",");
        if (getReplicationConfig() != null)
            sb.append("ReplicationConfig: ").append(getReplicationConfig()).append(",");
        if (getEventBuses() != null)
            sb.append("EventBuses: ").append(getEventBuses()).append(",");
        if (getRoleArn() != null)
            sb.append("RoleArn: ").append(getRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateEndpointRequest == false)
            return false;
        CreateEndpointRequest other = (CreateEndpointRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getRoutingConfig() == null) ? 0 : getRoutingConfig().hashCode());
        hashCode = prime * hashCode + ((getReplicationConfig() == null) ? 0 : getReplicationConfig().hashCode());
        hashCode = prime * hashCode + ((getEventBuses() == null) ? 0 : getEventBuses().hashCode());
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public CreateEndpointRequest clone() {
        return (CreateEndpointRequest) super.clone();
    }

}
