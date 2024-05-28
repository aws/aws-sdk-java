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
 * Configuration details for a set of container groups, for use when creating a fleet with compute type
 * <code>CONTAINER</code>.
 * </p>
 * <p>
 * <b>Used with:</b> <a>CreateFleet</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ContainerGroupsConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerGroupsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The list of container group definition names to deploy to a new container fleet.
     * </p>
     */
    private java.util.List<String> containerGroupDefinitionNames;
    /**
     * <p>
     * A set of ports to allow inbound traffic, including game clients, to connect to processes running in the container
     * fleet.
     * </p>
     * <p>
     * Connection ports are dynamically mapped to container ports, which are assigned to individual processes running in
     * a container. The connection port range must have enough ports to map to all container ports across a fleet
     * instance. To calculate the minimum connection ports needed, use the following formula:
     * </p>
     * <p>
     * <i>[Total number of container ports as defined for containers in the replica container group] * [Desired or
     * calculated number of replica container groups per instance] + [Total number of container ports as defined for
     * containers in the daemon container group]</i>
     * </p>
     * <p>
     * As a best practice, double the minimum number of connection ports.
     * </p>
     * <note>
     * <p>
     * Use the fleet's <code>EC2InboundPermissions</code> property to control external access to connection ports. Set
     * this property to the connection port numbers that you want to open access to. See <a>IpPermission</a> for more
     * details.
     * </p>
     * </note>
     */
    private ConnectionPortRange connectionPortRange;
    /**
     * <p>
     * The number of times to replicate the replica container group on each instance in a container fleet. By default,
     * Amazon GameLift calculates the maximum number of replica container groups that can fit on a fleet instance (based
     * on CPU and memory resources). Leave this parameter empty if you want to use the maximum number, or specify a
     * desired number to override the maximum. The desired number is used if it's less than the maximum number.
     * </p>
     */
    private Integer desiredReplicaContainerGroupsPerInstance;

    /**
     * <p>
     * The list of container group definition names to deploy to a new container fleet.
     * </p>
     * 
     * @return The list of container group definition names to deploy to a new container fleet.
     */

    public java.util.List<String> getContainerGroupDefinitionNames() {
        return containerGroupDefinitionNames;
    }

    /**
     * <p>
     * The list of container group definition names to deploy to a new container fleet.
     * </p>
     * 
     * @param containerGroupDefinitionNames
     *        The list of container group definition names to deploy to a new container fleet.
     */

    public void setContainerGroupDefinitionNames(java.util.Collection<String> containerGroupDefinitionNames) {
        if (containerGroupDefinitionNames == null) {
            this.containerGroupDefinitionNames = null;
            return;
        }

        this.containerGroupDefinitionNames = new java.util.ArrayList<String>(containerGroupDefinitionNames);
    }

    /**
     * <p>
     * The list of container group definition names to deploy to a new container fleet.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setContainerGroupDefinitionNames(java.util.Collection)} or
     * {@link #withContainerGroupDefinitionNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param containerGroupDefinitionNames
     *        The list of container group definition names to deploy to a new container fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupsConfiguration withContainerGroupDefinitionNames(String... containerGroupDefinitionNames) {
        if (this.containerGroupDefinitionNames == null) {
            setContainerGroupDefinitionNames(new java.util.ArrayList<String>(containerGroupDefinitionNames.length));
        }
        for (String ele : containerGroupDefinitionNames) {
            this.containerGroupDefinitionNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of container group definition names to deploy to a new container fleet.
     * </p>
     * 
     * @param containerGroupDefinitionNames
     *        The list of container group definition names to deploy to a new container fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupsConfiguration withContainerGroupDefinitionNames(java.util.Collection<String> containerGroupDefinitionNames) {
        setContainerGroupDefinitionNames(containerGroupDefinitionNames);
        return this;
    }

    /**
     * <p>
     * A set of ports to allow inbound traffic, including game clients, to connect to processes running in the container
     * fleet.
     * </p>
     * <p>
     * Connection ports are dynamically mapped to container ports, which are assigned to individual processes running in
     * a container. The connection port range must have enough ports to map to all container ports across a fleet
     * instance. To calculate the minimum connection ports needed, use the following formula:
     * </p>
     * <p>
     * <i>[Total number of container ports as defined for containers in the replica container group] * [Desired or
     * calculated number of replica container groups per instance] + [Total number of container ports as defined for
     * containers in the daemon container group]</i>
     * </p>
     * <p>
     * As a best practice, double the minimum number of connection ports.
     * </p>
     * <note>
     * <p>
     * Use the fleet's <code>EC2InboundPermissions</code> property to control external access to connection ports. Set
     * this property to the connection port numbers that you want to open access to. See <a>IpPermission</a> for more
     * details.
     * </p>
     * </note>
     * 
     * @param connectionPortRange
     *        A set of ports to allow inbound traffic, including game clients, to connect to processes running in the
     *        container fleet. </p>
     *        <p>
     *        Connection ports are dynamically mapped to container ports, which are assigned to individual processes
     *        running in a container. The connection port range must have enough ports to map to all container ports
     *        across a fleet instance. To calculate the minimum connection ports needed, use the following formula:
     *        </p>
     *        <p>
     *        <i>[Total number of container ports as defined for containers in the replica container group] * [Desired
     *        or calculated number of replica container groups per instance] + [Total number of container ports as
     *        defined for containers in the daemon container group]</i>
     *        </p>
     *        <p>
     *        As a best practice, double the minimum number of connection ports.
     *        </p>
     *        <note>
     *        <p>
     *        Use the fleet's <code>EC2InboundPermissions</code> property to control external access to connection
     *        ports. Set this property to the connection port numbers that you want to open access to. See
     *        <a>IpPermission</a> for more details.
     *        </p>
     */

    public void setConnectionPortRange(ConnectionPortRange connectionPortRange) {
        this.connectionPortRange = connectionPortRange;
    }

    /**
     * <p>
     * A set of ports to allow inbound traffic, including game clients, to connect to processes running in the container
     * fleet.
     * </p>
     * <p>
     * Connection ports are dynamically mapped to container ports, which are assigned to individual processes running in
     * a container. The connection port range must have enough ports to map to all container ports across a fleet
     * instance. To calculate the minimum connection ports needed, use the following formula:
     * </p>
     * <p>
     * <i>[Total number of container ports as defined for containers in the replica container group] * [Desired or
     * calculated number of replica container groups per instance] + [Total number of container ports as defined for
     * containers in the daemon container group]</i>
     * </p>
     * <p>
     * As a best practice, double the minimum number of connection ports.
     * </p>
     * <note>
     * <p>
     * Use the fleet's <code>EC2InboundPermissions</code> property to control external access to connection ports. Set
     * this property to the connection port numbers that you want to open access to. See <a>IpPermission</a> for more
     * details.
     * </p>
     * </note>
     * 
     * @return A set of ports to allow inbound traffic, including game clients, to connect to processes running in the
     *         container fleet. </p>
     *         <p>
     *         Connection ports are dynamically mapped to container ports, which are assigned to individual processes
     *         running in a container. The connection port range must have enough ports to map to all container ports
     *         across a fleet instance. To calculate the minimum connection ports needed, use the following formula:
     *         </p>
     *         <p>
     *         <i>[Total number of container ports as defined for containers in the replica container group] * [Desired
     *         or calculated number of replica container groups per instance] + [Total number of container ports as
     *         defined for containers in the daemon container group]</i>
     *         </p>
     *         <p>
     *         As a best practice, double the minimum number of connection ports.
     *         </p>
     *         <note>
     *         <p>
     *         Use the fleet's <code>EC2InboundPermissions</code> property to control external access to connection
     *         ports. Set this property to the connection port numbers that you want to open access to. See
     *         <a>IpPermission</a> for more details.
     *         </p>
     */

    public ConnectionPortRange getConnectionPortRange() {
        return this.connectionPortRange;
    }

    /**
     * <p>
     * A set of ports to allow inbound traffic, including game clients, to connect to processes running in the container
     * fleet.
     * </p>
     * <p>
     * Connection ports are dynamically mapped to container ports, which are assigned to individual processes running in
     * a container. The connection port range must have enough ports to map to all container ports across a fleet
     * instance. To calculate the minimum connection ports needed, use the following formula:
     * </p>
     * <p>
     * <i>[Total number of container ports as defined for containers in the replica container group] * [Desired or
     * calculated number of replica container groups per instance] + [Total number of container ports as defined for
     * containers in the daemon container group]</i>
     * </p>
     * <p>
     * As a best practice, double the minimum number of connection ports.
     * </p>
     * <note>
     * <p>
     * Use the fleet's <code>EC2InboundPermissions</code> property to control external access to connection ports. Set
     * this property to the connection port numbers that you want to open access to. See <a>IpPermission</a> for more
     * details.
     * </p>
     * </note>
     * 
     * @param connectionPortRange
     *        A set of ports to allow inbound traffic, including game clients, to connect to processes running in the
     *        container fleet. </p>
     *        <p>
     *        Connection ports are dynamically mapped to container ports, which are assigned to individual processes
     *        running in a container. The connection port range must have enough ports to map to all container ports
     *        across a fleet instance. To calculate the minimum connection ports needed, use the following formula:
     *        </p>
     *        <p>
     *        <i>[Total number of container ports as defined for containers in the replica container group] * [Desired
     *        or calculated number of replica container groups per instance] + [Total number of container ports as
     *        defined for containers in the daemon container group]</i>
     *        </p>
     *        <p>
     *        As a best practice, double the minimum number of connection ports.
     *        </p>
     *        <note>
     *        <p>
     *        Use the fleet's <code>EC2InboundPermissions</code> property to control external access to connection
     *        ports. Set this property to the connection port numbers that you want to open access to. See
     *        <a>IpPermission</a> for more details.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupsConfiguration withConnectionPortRange(ConnectionPortRange connectionPortRange) {
        setConnectionPortRange(connectionPortRange);
        return this;
    }

    /**
     * <p>
     * The number of times to replicate the replica container group on each instance in a container fleet. By default,
     * Amazon GameLift calculates the maximum number of replica container groups that can fit on a fleet instance (based
     * on CPU and memory resources). Leave this parameter empty if you want to use the maximum number, or specify a
     * desired number to override the maximum. The desired number is used if it's less than the maximum number.
     * </p>
     * 
     * @param desiredReplicaContainerGroupsPerInstance
     *        The number of times to replicate the replica container group on each instance in a container fleet. By
     *        default, Amazon GameLift calculates the maximum number of replica container groups that can fit on a fleet
     *        instance (based on CPU and memory resources). Leave this parameter empty if you want to use the maximum
     *        number, or specify a desired number to override the maximum. The desired number is used if it's less than
     *        the maximum number.
     */

    public void setDesiredReplicaContainerGroupsPerInstance(Integer desiredReplicaContainerGroupsPerInstance) {
        this.desiredReplicaContainerGroupsPerInstance = desiredReplicaContainerGroupsPerInstance;
    }

    /**
     * <p>
     * The number of times to replicate the replica container group on each instance in a container fleet. By default,
     * Amazon GameLift calculates the maximum number of replica container groups that can fit on a fleet instance (based
     * on CPU and memory resources). Leave this parameter empty if you want to use the maximum number, or specify a
     * desired number to override the maximum. The desired number is used if it's less than the maximum number.
     * </p>
     * 
     * @return The number of times to replicate the replica container group on each instance in a container fleet. By
     *         default, Amazon GameLift calculates the maximum number of replica container groups that can fit on a
     *         fleet instance (based on CPU and memory resources). Leave this parameter empty if you want to use the
     *         maximum number, or specify a desired number to override the maximum. The desired number is used if it's
     *         less than the maximum number.
     */

    public Integer getDesiredReplicaContainerGroupsPerInstance() {
        return this.desiredReplicaContainerGroupsPerInstance;
    }

    /**
     * <p>
     * The number of times to replicate the replica container group on each instance in a container fleet. By default,
     * Amazon GameLift calculates the maximum number of replica container groups that can fit on a fleet instance (based
     * on CPU and memory resources). Leave this parameter empty if you want to use the maximum number, or specify a
     * desired number to override the maximum. The desired number is used if it's less than the maximum number.
     * </p>
     * 
     * @param desiredReplicaContainerGroupsPerInstance
     *        The number of times to replicate the replica container group on each instance in a container fleet. By
     *        default, Amazon GameLift calculates the maximum number of replica container groups that can fit on a fleet
     *        instance (based on CPU and memory resources). Leave this parameter empty if you want to use the maximum
     *        number, or specify a desired number to override the maximum. The desired number is used if it's less than
     *        the maximum number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupsConfiguration withDesiredReplicaContainerGroupsPerInstance(Integer desiredReplicaContainerGroupsPerInstance) {
        setDesiredReplicaContainerGroupsPerInstance(desiredReplicaContainerGroupsPerInstance);
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
        if (getContainerGroupDefinitionNames() != null)
            sb.append("ContainerGroupDefinitionNames: ").append(getContainerGroupDefinitionNames()).append(",");
        if (getConnectionPortRange() != null)
            sb.append("ConnectionPortRange: ").append(getConnectionPortRange()).append(",");
        if (getDesiredReplicaContainerGroupsPerInstance() != null)
            sb.append("DesiredReplicaContainerGroupsPerInstance: ").append(getDesiredReplicaContainerGroupsPerInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerGroupsConfiguration == false)
            return false;
        ContainerGroupsConfiguration other = (ContainerGroupsConfiguration) obj;
        if (other.getContainerGroupDefinitionNames() == null ^ this.getContainerGroupDefinitionNames() == null)
            return false;
        if (other.getContainerGroupDefinitionNames() != null
                && other.getContainerGroupDefinitionNames().equals(this.getContainerGroupDefinitionNames()) == false)
            return false;
        if (other.getConnectionPortRange() == null ^ this.getConnectionPortRange() == null)
            return false;
        if (other.getConnectionPortRange() != null && other.getConnectionPortRange().equals(this.getConnectionPortRange()) == false)
            return false;
        if (other.getDesiredReplicaContainerGroupsPerInstance() == null ^ this.getDesiredReplicaContainerGroupsPerInstance() == null)
            return false;
        if (other.getDesiredReplicaContainerGroupsPerInstance() != null
                && other.getDesiredReplicaContainerGroupsPerInstance().equals(this.getDesiredReplicaContainerGroupsPerInstance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerGroupDefinitionNames() == null) ? 0 : getContainerGroupDefinitionNames().hashCode());
        hashCode = prime * hashCode + ((getConnectionPortRange() == null) ? 0 : getConnectionPortRange().hashCode());
        hashCode = prime * hashCode + ((getDesiredReplicaContainerGroupsPerInstance() == null) ? 0 : getDesiredReplicaContainerGroupsPerInstance().hashCode());
        return hashCode;
    }

    @Override
    public ContainerGroupsConfiguration clone() {
        try {
            return (ContainerGroupsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ContainerGroupsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
