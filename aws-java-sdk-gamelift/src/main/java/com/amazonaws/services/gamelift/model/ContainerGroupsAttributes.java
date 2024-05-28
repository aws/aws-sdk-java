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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * <b>This data type is used with the Amazon GameLift containers feature, which is currently in public preview.</b>
 * </p>
 * <p>
 * The properties of container groups that are running on a container fleet. Container group properties for a fleet
 * can't be changed.
 * </p>
 * <p>
 * <b>Returned by:</b> <a>DescribeFleetAttributes</a>, <a>CreateFleet</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ContainerGroupsAttributes" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerGroupsAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A collection of properties that describe each container group in the fleet. A container fleet is deployed with
     * one or more <a>ContainerGroupDefinition</a> resources, which is where these properties are set.
     * </p>
     */
    private java.util.List<ContainerGroupDefinitionProperty> containerGroupDefinitionProperties;
    /**
     * <p>
     * A set of ports that allow inbound traffic to connect to processes running in the fleet's container groups. Amazon
     * GameLift maps each connection port to a container port, which is assigned to a specific container process. A
     * fleet's connection port range can't be changed, but you can control access to connection ports by updating a
     * fleet's <code>EC2InboundPermissions</code> with <a>UpdateFleetPortSettings</a>.
     * </p>
     */
    private ConnectionPortRange connectionPortRange;
    /**
     * <p>
     * Details about the number of replica container groups that Amazon GameLift deploys to each instance in the
     * container fleet.
     * </p>
     */
    private ContainerGroupsPerInstance containerGroupsPerInstance;

    /**
     * <p>
     * A collection of properties that describe each container group in the fleet. A container fleet is deployed with
     * one or more <a>ContainerGroupDefinition</a> resources, which is where these properties are set.
     * </p>
     * 
     * @return A collection of properties that describe each container group in the fleet. A container fleet is deployed
     *         with one or more <a>ContainerGroupDefinition</a> resources, which is where these properties are set.
     */

    public java.util.List<ContainerGroupDefinitionProperty> getContainerGroupDefinitionProperties() {
        return containerGroupDefinitionProperties;
    }

    /**
     * <p>
     * A collection of properties that describe each container group in the fleet. A container fleet is deployed with
     * one or more <a>ContainerGroupDefinition</a> resources, which is where these properties are set.
     * </p>
     * 
     * @param containerGroupDefinitionProperties
     *        A collection of properties that describe each container group in the fleet. A container fleet is deployed
     *        with one or more <a>ContainerGroupDefinition</a> resources, which is where these properties are set.
     */

    public void setContainerGroupDefinitionProperties(java.util.Collection<ContainerGroupDefinitionProperty> containerGroupDefinitionProperties) {
        if (containerGroupDefinitionProperties == null) {
            this.containerGroupDefinitionProperties = null;
            return;
        }

        this.containerGroupDefinitionProperties = new java.util.ArrayList<ContainerGroupDefinitionProperty>(containerGroupDefinitionProperties);
    }

    /**
     * <p>
     * A collection of properties that describe each container group in the fleet. A container fleet is deployed with
     * one or more <a>ContainerGroupDefinition</a> resources, which is where these properties are set.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerGroupDefinitionProperties(java.util.Collection)} or
     * {@link #withContainerGroupDefinitionProperties(java.util.Collection)} if you want to override the existing
     * values.
     * </p>
     * 
     * @param containerGroupDefinitionProperties
     *        A collection of properties that describe each container group in the fleet. A container fleet is deployed
     *        with one or more <a>ContainerGroupDefinition</a> resources, which is where these properties are set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupsAttributes withContainerGroupDefinitionProperties(ContainerGroupDefinitionProperty... containerGroupDefinitionProperties) {
        if (this.containerGroupDefinitionProperties == null) {
            setContainerGroupDefinitionProperties(new java.util.ArrayList<ContainerGroupDefinitionProperty>(containerGroupDefinitionProperties.length));
        }
        for (ContainerGroupDefinitionProperty ele : containerGroupDefinitionProperties) {
            this.containerGroupDefinitionProperties.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of properties that describe each container group in the fleet. A container fleet is deployed with
     * one or more <a>ContainerGroupDefinition</a> resources, which is where these properties are set.
     * </p>
     * 
     * @param containerGroupDefinitionProperties
     *        A collection of properties that describe each container group in the fleet. A container fleet is deployed
     *        with one or more <a>ContainerGroupDefinition</a> resources, which is where these properties are set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupsAttributes withContainerGroupDefinitionProperties(
            java.util.Collection<ContainerGroupDefinitionProperty> containerGroupDefinitionProperties) {
        setContainerGroupDefinitionProperties(containerGroupDefinitionProperties);
        return this;
    }

    /**
     * <p>
     * A set of ports that allow inbound traffic to connect to processes running in the fleet's container groups. Amazon
     * GameLift maps each connection port to a container port, which is assigned to a specific container process. A
     * fleet's connection port range can't be changed, but you can control access to connection ports by updating a
     * fleet's <code>EC2InboundPermissions</code> with <a>UpdateFleetPortSettings</a>.
     * </p>
     * 
     * @param connectionPortRange
     *        A set of ports that allow inbound traffic to connect to processes running in the fleet's container groups.
     *        Amazon GameLift maps each connection port to a container port, which is assigned to a specific container
     *        process. A fleet's connection port range can't be changed, but you can control access to connection ports
     *        by updating a fleet's <code>EC2InboundPermissions</code> with <a>UpdateFleetPortSettings</a>.
     */

    public void setConnectionPortRange(ConnectionPortRange connectionPortRange) {
        this.connectionPortRange = connectionPortRange;
    }

    /**
     * <p>
     * A set of ports that allow inbound traffic to connect to processes running in the fleet's container groups. Amazon
     * GameLift maps each connection port to a container port, which is assigned to a specific container process. A
     * fleet's connection port range can't be changed, but you can control access to connection ports by updating a
     * fleet's <code>EC2InboundPermissions</code> with <a>UpdateFleetPortSettings</a>.
     * </p>
     * 
     * @return A set of ports that allow inbound traffic to connect to processes running in the fleet's container
     *         groups. Amazon GameLift maps each connection port to a container port, which is assigned to a specific
     *         container process. A fleet's connection port range can't be changed, but you can control access to
     *         connection ports by updating a fleet's <code>EC2InboundPermissions</code> with
     *         <a>UpdateFleetPortSettings</a>.
     */

    public ConnectionPortRange getConnectionPortRange() {
        return this.connectionPortRange;
    }

    /**
     * <p>
     * A set of ports that allow inbound traffic to connect to processes running in the fleet's container groups. Amazon
     * GameLift maps each connection port to a container port, which is assigned to a specific container process. A
     * fleet's connection port range can't be changed, but you can control access to connection ports by updating a
     * fleet's <code>EC2InboundPermissions</code> with <a>UpdateFleetPortSettings</a>.
     * </p>
     * 
     * @param connectionPortRange
     *        A set of ports that allow inbound traffic to connect to processes running in the fleet's container groups.
     *        Amazon GameLift maps each connection port to a container port, which is assigned to a specific container
     *        process. A fleet's connection port range can't be changed, but you can control access to connection ports
     *        by updating a fleet's <code>EC2InboundPermissions</code> with <a>UpdateFleetPortSettings</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupsAttributes withConnectionPortRange(ConnectionPortRange connectionPortRange) {
        setConnectionPortRange(connectionPortRange);
        return this;
    }

    /**
     * <p>
     * Details about the number of replica container groups that Amazon GameLift deploys to each instance in the
     * container fleet.
     * </p>
     * 
     * @param containerGroupsPerInstance
     *        Details about the number of replica container groups that Amazon GameLift deploys to each instance in the
     *        container fleet.
     */

    public void setContainerGroupsPerInstance(ContainerGroupsPerInstance containerGroupsPerInstance) {
        this.containerGroupsPerInstance = containerGroupsPerInstance;
    }

    /**
     * <p>
     * Details about the number of replica container groups that Amazon GameLift deploys to each instance in the
     * container fleet.
     * </p>
     * 
     * @return Details about the number of replica container groups that Amazon GameLift deploys to each instance in the
     *         container fleet.
     */

    public ContainerGroupsPerInstance getContainerGroupsPerInstance() {
        return this.containerGroupsPerInstance;
    }

    /**
     * <p>
     * Details about the number of replica container groups that Amazon GameLift deploys to each instance in the
     * container fleet.
     * </p>
     * 
     * @param containerGroupsPerInstance
     *        Details about the number of replica container groups that Amazon GameLift deploys to each instance in the
     *        container fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupsAttributes withContainerGroupsPerInstance(ContainerGroupsPerInstance containerGroupsPerInstance) {
        setContainerGroupsPerInstance(containerGroupsPerInstance);
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
        if (getContainerGroupDefinitionProperties() != null)
            sb.append("ContainerGroupDefinitionProperties: ").append(getContainerGroupDefinitionProperties()).append(",");
        if (getConnectionPortRange() != null)
            sb.append("ConnectionPortRange: ").append(getConnectionPortRange()).append(",");
        if (getContainerGroupsPerInstance() != null)
            sb.append("ContainerGroupsPerInstance: ").append(getContainerGroupsPerInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerGroupsAttributes == false)
            return false;
        ContainerGroupsAttributes other = (ContainerGroupsAttributes) obj;
        if (other.getContainerGroupDefinitionProperties() == null ^ this.getContainerGroupDefinitionProperties() == null)
            return false;
        if (other.getContainerGroupDefinitionProperties() != null
                && other.getContainerGroupDefinitionProperties().equals(this.getContainerGroupDefinitionProperties()) == false)
            return false;
        if (other.getConnectionPortRange() == null ^ this.getConnectionPortRange() == null)
            return false;
        if (other.getConnectionPortRange() != null && other.getConnectionPortRange().equals(this.getConnectionPortRange()) == false)
            return false;
        if (other.getContainerGroupsPerInstance() == null ^ this.getContainerGroupsPerInstance() == null)
            return false;
        if (other.getContainerGroupsPerInstance() != null && other.getContainerGroupsPerInstance().equals(this.getContainerGroupsPerInstance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerGroupDefinitionProperties() == null) ? 0 : getContainerGroupDefinitionProperties().hashCode());
        hashCode = prime * hashCode + ((getConnectionPortRange() == null) ? 0 : getConnectionPortRange().hashCode());
        hashCode = prime * hashCode + ((getContainerGroupsPerInstance() == null) ? 0 : getContainerGroupsPerInstance().hashCode());
        return hashCode;
    }

    @Override
    public ContainerGroupsAttributes clone() {
        try {
            return (ContainerGroupsAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ContainerGroupsAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
