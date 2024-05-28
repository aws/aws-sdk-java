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
 * <b>This data type has been expanded to use with the Amazon GameLift containers feature, which is currently in public
 * preview.</b>
 * </p>
 * <p>
 * An Amazon GameLift compute resource for hosting your game servers. Computes in an Amazon GameLift fleet differs
 * depending on the fleet's compute type property as follows:
 * </p>
 * <ul>
 * <li>
 * <p>
 * For <code>EC2</code> fleets, a compute is an EC2 instance.
 * </p>
 * </li>
 * <li>
 * <p>
 * For <code>ANYWHERE</code> fleets, a compute is a computing resource that you provide and is registered to the fleet.
 * </p>
 * </li>
 * <li>
 * <p>
 * For <code>CONTAINER</code> fleets, a compute is a container that's registered to the fleet.
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/Compute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Compute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the fleet that the compute belongs to.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet that the compute belongs to.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * A descriptive label for the compute resource. For instances in a managed EC2 fleet, the compute name is the same
     * value as the <code>InstanceId</code> ID.
     * </p>
     */
    private String computeName;
    /**
     * <p>
     * The ARN that is assigned to a compute resource and uniquely identifies it. ARNs are unique across locations.
     * Instances in managed EC2 fleets are not assigned a Compute ARN.
     * </p>
     */
    private String computeArn;
    /**
     * <p>
     * The IP address of a compute resource. Amazon GameLift requires a DNS name or IP address for a compute.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The DNS name of a compute resource. Amazon GameLift requires a DNS name or IP address for a compute.
     * </p>
     */
    private String dnsName;
    /**
     * <p>
     * Current status of the compute. A compute must have an <code>ACTIVE</code> status to host game sessions.
     * </p>
     */
    private String computeStatus;
    /**
     * <p>
     * The name of the custom location you added to the fleet that this compute resource resides in.
     * </p>
     */
    private String location;
    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The type of operating system on the compute resource.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * The Amazon EC2 instance type that the fleet uses. For registered computes in an Amazon GameLift Anywhere fleet,
     * this property is empty.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The Amazon GameLift SDK endpoint connection for a registered compute resource in an Anywhere fleet. The game
     * servers on the compute use this endpoint to connect to the Amazon GameLift service.
     * </p>
     */
    private String gameLiftServiceSdkEndpoint;
    /**
     * <p>
     * The endpoint of the Amazon GameLift Agent.
     * </p>
     */
    private String gameLiftAgentEndpoint;
    /**
     * <p>
     * The <code>InstanceID</code> of the <code>Instance</code> hosting the compute for Container and Managed EC2
     * fleets.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * Some attributes of a container.
     * </p>
     */
    private ContainerAttributes containerAttributes;

    /**
     * <p>
     * A unique identifier for the fleet that the compute belongs to.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that the compute belongs to.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that the compute belongs to.
     * </p>
     * 
     * @return A unique identifier for the fleet that the compute belongs to.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that the compute belongs to.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that the compute belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet that the compute belongs to.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (ARN) of the fleet that the compute belongs to.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet that the compute belongs to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the fleet that the compute belongs to.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet that the compute belongs to.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (ARN) of the fleet that the compute belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * A descriptive label for the compute resource. For instances in a managed EC2 fleet, the compute name is the same
     * value as the <code>InstanceId</code> ID.
     * </p>
     * 
     * @param computeName
     *        A descriptive label for the compute resource. For instances in a managed EC2 fleet, the compute name is
     *        the same value as the <code>InstanceId</code> ID.
     */

    public void setComputeName(String computeName) {
        this.computeName = computeName;
    }

    /**
     * <p>
     * A descriptive label for the compute resource. For instances in a managed EC2 fleet, the compute name is the same
     * value as the <code>InstanceId</code> ID.
     * </p>
     * 
     * @return A descriptive label for the compute resource. For instances in a managed EC2 fleet, the compute name is
     *         the same value as the <code>InstanceId</code> ID.
     */

    public String getComputeName() {
        return this.computeName;
    }

    /**
     * <p>
     * A descriptive label for the compute resource. For instances in a managed EC2 fleet, the compute name is the same
     * value as the <code>InstanceId</code> ID.
     * </p>
     * 
     * @param computeName
     *        A descriptive label for the compute resource. For instances in a managed EC2 fleet, the compute name is
     *        the same value as the <code>InstanceId</code> ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withComputeName(String computeName) {
        setComputeName(computeName);
        return this;
    }

    /**
     * <p>
     * The ARN that is assigned to a compute resource and uniquely identifies it. ARNs are unique across locations.
     * Instances in managed EC2 fleets are not assigned a Compute ARN.
     * </p>
     * 
     * @param computeArn
     *        The ARN that is assigned to a compute resource and uniquely identifies it. ARNs are unique across
     *        locations. Instances in managed EC2 fleets are not assigned a Compute ARN.
     */

    public void setComputeArn(String computeArn) {
        this.computeArn = computeArn;
    }

    /**
     * <p>
     * The ARN that is assigned to a compute resource and uniquely identifies it. ARNs are unique across locations.
     * Instances in managed EC2 fleets are not assigned a Compute ARN.
     * </p>
     * 
     * @return The ARN that is assigned to a compute resource and uniquely identifies it. ARNs are unique across
     *         locations. Instances in managed EC2 fleets are not assigned a Compute ARN.
     */

    public String getComputeArn() {
        return this.computeArn;
    }

    /**
     * <p>
     * The ARN that is assigned to a compute resource and uniquely identifies it. ARNs are unique across locations.
     * Instances in managed EC2 fleets are not assigned a Compute ARN.
     * </p>
     * 
     * @param computeArn
     *        The ARN that is assigned to a compute resource and uniquely identifies it. ARNs are unique across
     *        locations. Instances in managed EC2 fleets are not assigned a Compute ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withComputeArn(String computeArn) {
        setComputeArn(computeArn);
        return this;
    }

    /**
     * <p>
     * The IP address of a compute resource. Amazon GameLift requires a DNS name or IP address for a compute.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of a compute resource. Amazon GameLift requires a DNS name or IP address for a compute.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address of a compute resource. Amazon GameLift requires a DNS name or IP address for a compute.
     * </p>
     * 
     * @return The IP address of a compute resource. Amazon GameLift requires a DNS name or IP address for a compute.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address of a compute resource. Amazon GameLift requires a DNS name or IP address for a compute.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of a compute resource. Amazon GameLift requires a DNS name or IP address for a compute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The DNS name of a compute resource. Amazon GameLift requires a DNS name or IP address for a compute.
     * </p>
     * 
     * @param dnsName
     *        The DNS name of a compute resource. Amazon GameLift requires a DNS name or IP address for a compute.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS name of a compute resource. Amazon GameLift requires a DNS name or IP address for a compute.
     * </p>
     * 
     * @return The DNS name of a compute resource. Amazon GameLift requires a DNS name or IP address for a compute.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * The DNS name of a compute resource. Amazon GameLift requires a DNS name or IP address for a compute.
     * </p>
     * 
     * @param dnsName
     *        The DNS name of a compute resource. Amazon GameLift requires a DNS name or IP address for a compute.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withDnsName(String dnsName) {
        setDnsName(dnsName);
        return this;
    }

    /**
     * <p>
     * Current status of the compute. A compute must have an <code>ACTIVE</code> status to host game sessions.
     * </p>
     * 
     * @param computeStatus
     *        Current status of the compute. A compute must have an <code>ACTIVE</code> status to host game sessions.
     * @see ComputeStatus
     */

    public void setComputeStatus(String computeStatus) {
        this.computeStatus = computeStatus;
    }

    /**
     * <p>
     * Current status of the compute. A compute must have an <code>ACTIVE</code> status to host game sessions.
     * </p>
     * 
     * @return Current status of the compute. A compute must have an <code>ACTIVE</code> status to host game sessions.
     * @see ComputeStatus
     */

    public String getComputeStatus() {
        return this.computeStatus;
    }

    /**
     * <p>
     * Current status of the compute. A compute must have an <code>ACTIVE</code> status to host game sessions.
     * </p>
     * 
     * @param computeStatus
     *        Current status of the compute. A compute must have an <code>ACTIVE</code> status to host game sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeStatus
     */

    public Compute withComputeStatus(String computeStatus) {
        setComputeStatus(computeStatus);
        return this;
    }

    /**
     * <p>
     * Current status of the compute. A compute must have an <code>ACTIVE</code> status to host game sessions.
     * </p>
     * 
     * @param computeStatus
     *        Current status of the compute. A compute must have an <code>ACTIVE</code> status to host game sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputeStatus
     */

    public Compute withComputeStatus(ComputeStatus computeStatus) {
        this.computeStatus = computeStatus.toString();
        return this;
    }

    /**
     * <p>
     * The name of the custom location you added to the fleet that this compute resource resides in.
     * </p>
     * 
     * @param location
     *        The name of the custom location you added to the fleet that this compute resource resides in.
     */

    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * <p>
     * The name of the custom location you added to the fleet that this compute resource resides in.
     * </p>
     * 
     * @return The name of the custom location you added to the fleet that this compute resource resides in.
     */

    public String getLocation() {
        return this.location;
    }

    /**
     * <p>
     * The name of the custom location you added to the fleet that this compute resource resides in.
     * </p>
     * 
     * @param location
     *        The name of the custom location you added to the fleet that this compute resource resides in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withLocation(String location) {
        setLocation(location);
        return this;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param creationTime
     *        A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @return A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *         milliseconds (for example <code>"1469498468.057"</code>).
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example <code>"1469498468.057"</code>).
     * </p>
     * 
     * @param creationTime
     *        A time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example <code>"1469498468.057"</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The type of operating system on the compute resource.
     * </p>
     * 
     * @param operatingSystem
     *        The type of operating system on the compute resource.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The type of operating system on the compute resource.
     * </p>
     * 
     * @return The type of operating system on the compute resource.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The type of operating system on the compute resource.
     * </p>
     * 
     * @param operatingSystem
     *        The type of operating system on the compute resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public Compute withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The type of operating system on the compute resource.
     * </p>
     * 
     * @param operatingSystem
     *        The type of operating system on the compute resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public Compute withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance type that the fleet uses. For registered computes in an Amazon GameLift Anywhere fleet,
     * this property is empty.
     * </p>
     * 
     * @param type
     *        The Amazon EC2 instance type that the fleet uses. For registered computes in an Amazon GameLift Anywhere
     *        fleet, this property is empty.
     * @see EC2InstanceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The Amazon EC2 instance type that the fleet uses. For registered computes in an Amazon GameLift Anywhere fleet,
     * this property is empty.
     * </p>
     * 
     * @return The Amazon EC2 instance type that the fleet uses. For registered computes in an Amazon GameLift Anywhere
     *         fleet, this property is empty.
     * @see EC2InstanceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The Amazon EC2 instance type that the fleet uses. For registered computes in an Amazon GameLift Anywhere fleet,
     * this property is empty.
     * </p>
     * 
     * @param type
     *        The Amazon EC2 instance type that the fleet uses. For registered computes in an Amazon GameLift Anywhere
     *        fleet, this property is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public Compute withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance type that the fleet uses. For registered computes in an Amazon GameLift Anywhere fleet,
     * this property is empty.
     * </p>
     * 
     * @param type
     *        The Amazon EC2 instance type that the fleet uses. For registered computes in an Amazon GameLift Anywhere
     *        fleet, this property is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public Compute withType(EC2InstanceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon GameLift SDK endpoint connection for a registered compute resource in an Anywhere fleet. The game
     * servers on the compute use this endpoint to connect to the Amazon GameLift service.
     * </p>
     * 
     * @param gameLiftServiceSdkEndpoint
     *        The Amazon GameLift SDK endpoint connection for a registered compute resource in an Anywhere fleet. The
     *        game servers on the compute use this endpoint to connect to the Amazon GameLift service.
     */

    public void setGameLiftServiceSdkEndpoint(String gameLiftServiceSdkEndpoint) {
        this.gameLiftServiceSdkEndpoint = gameLiftServiceSdkEndpoint;
    }

    /**
     * <p>
     * The Amazon GameLift SDK endpoint connection for a registered compute resource in an Anywhere fleet. The game
     * servers on the compute use this endpoint to connect to the Amazon GameLift service.
     * </p>
     * 
     * @return The Amazon GameLift SDK endpoint connection for a registered compute resource in an Anywhere fleet. The
     *         game servers on the compute use this endpoint to connect to the Amazon GameLift service.
     */

    public String getGameLiftServiceSdkEndpoint() {
        return this.gameLiftServiceSdkEndpoint;
    }

    /**
     * <p>
     * The Amazon GameLift SDK endpoint connection for a registered compute resource in an Anywhere fleet. The game
     * servers on the compute use this endpoint to connect to the Amazon GameLift service.
     * </p>
     * 
     * @param gameLiftServiceSdkEndpoint
     *        The Amazon GameLift SDK endpoint connection for a registered compute resource in an Anywhere fleet. The
     *        game servers on the compute use this endpoint to connect to the Amazon GameLift service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withGameLiftServiceSdkEndpoint(String gameLiftServiceSdkEndpoint) {
        setGameLiftServiceSdkEndpoint(gameLiftServiceSdkEndpoint);
        return this;
    }

    /**
     * <p>
     * The endpoint of the Amazon GameLift Agent.
     * </p>
     * 
     * @param gameLiftAgentEndpoint
     *        The endpoint of the Amazon GameLift Agent.
     */

    public void setGameLiftAgentEndpoint(String gameLiftAgentEndpoint) {
        this.gameLiftAgentEndpoint = gameLiftAgentEndpoint;
    }

    /**
     * <p>
     * The endpoint of the Amazon GameLift Agent.
     * </p>
     * 
     * @return The endpoint of the Amazon GameLift Agent.
     */

    public String getGameLiftAgentEndpoint() {
        return this.gameLiftAgentEndpoint;
    }

    /**
     * <p>
     * The endpoint of the Amazon GameLift Agent.
     * </p>
     * 
     * @param gameLiftAgentEndpoint
     *        The endpoint of the Amazon GameLift Agent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withGameLiftAgentEndpoint(String gameLiftAgentEndpoint) {
        setGameLiftAgentEndpoint(gameLiftAgentEndpoint);
        return this;
    }

    /**
     * <p>
     * The <code>InstanceID</code> of the <code>Instance</code> hosting the compute for Container and Managed EC2
     * fleets.
     * </p>
     * 
     * @param instanceId
     *        The <code>InstanceID</code> of the <code>Instance</code> hosting the compute for Container and Managed EC2
     *        fleets.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The <code>InstanceID</code> of the <code>Instance</code> hosting the compute for Container and Managed EC2
     * fleets.
     * </p>
     * 
     * @return The <code>InstanceID</code> of the <code>Instance</code> hosting the compute for Container and Managed
     *         EC2 fleets.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The <code>InstanceID</code> of the <code>Instance</code> hosting the compute for Container and Managed EC2
     * fleets.
     * </p>
     * 
     * @param instanceId
     *        The <code>InstanceID</code> of the <code>Instance</code> hosting the compute for Container and Managed EC2
     *        fleets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * Some attributes of a container.
     * </p>
     * 
     * @param containerAttributes
     *        Some attributes of a container.
     */

    public void setContainerAttributes(ContainerAttributes containerAttributes) {
        this.containerAttributes = containerAttributes;
    }

    /**
     * <p>
     * Some attributes of a container.
     * </p>
     * 
     * @return Some attributes of a container.
     */

    public ContainerAttributes getContainerAttributes() {
        return this.containerAttributes;
    }

    /**
     * <p>
     * Some attributes of a container.
     * </p>
     * 
     * @param containerAttributes
     *        Some attributes of a container.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withContainerAttributes(ContainerAttributes containerAttributes) {
        setContainerAttributes(containerAttributes);
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
        if (getFleetId() != null)
            sb.append("FleetId: ").append(getFleetId()).append(",");
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getComputeName() != null)
            sb.append("ComputeName: ").append(getComputeName()).append(",");
        if (getComputeArn() != null)
            sb.append("ComputeArn: ").append(getComputeArn()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append("***Sensitive Data Redacted***").append(",");
        if (getDnsName() != null)
            sb.append("DnsName: ").append(getDnsName()).append(",");
        if (getComputeStatus() != null)
            sb.append("ComputeStatus: ").append(getComputeStatus()).append(",");
        if (getLocation() != null)
            sb.append("Location: ").append(getLocation()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getGameLiftServiceSdkEndpoint() != null)
            sb.append("GameLiftServiceSdkEndpoint: ").append(getGameLiftServiceSdkEndpoint()).append(",");
        if (getGameLiftAgentEndpoint() != null)
            sb.append("GameLiftAgentEndpoint: ").append(getGameLiftAgentEndpoint()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getContainerAttributes() != null)
            sb.append("ContainerAttributes: ").append(getContainerAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Compute == false)
            return false;
        Compute other = (Compute) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getComputeName() == null ^ this.getComputeName() == null)
            return false;
        if (other.getComputeName() != null && other.getComputeName().equals(this.getComputeName()) == false)
            return false;
        if (other.getComputeArn() == null ^ this.getComputeArn() == null)
            return false;
        if (other.getComputeArn() != null && other.getComputeArn().equals(this.getComputeArn()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getDnsName() == null ^ this.getDnsName() == null)
            return false;
        if (other.getDnsName() != null && other.getDnsName().equals(this.getDnsName()) == false)
            return false;
        if (other.getComputeStatus() == null ^ this.getComputeStatus() == null)
            return false;
        if (other.getComputeStatus() != null && other.getComputeStatus().equals(this.getComputeStatus()) == false)
            return false;
        if (other.getLocation() == null ^ this.getLocation() == null)
            return false;
        if (other.getLocation() != null && other.getLocation().equals(this.getLocation()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getGameLiftServiceSdkEndpoint() == null ^ this.getGameLiftServiceSdkEndpoint() == null)
            return false;
        if (other.getGameLiftServiceSdkEndpoint() != null && other.getGameLiftServiceSdkEndpoint().equals(this.getGameLiftServiceSdkEndpoint()) == false)
            return false;
        if (other.getGameLiftAgentEndpoint() == null ^ this.getGameLiftAgentEndpoint() == null)
            return false;
        if (other.getGameLiftAgentEndpoint() != null && other.getGameLiftAgentEndpoint().equals(this.getGameLiftAgentEndpoint()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getContainerAttributes() == null ^ this.getContainerAttributes() == null)
            return false;
        if (other.getContainerAttributes() != null && other.getContainerAttributes().equals(this.getContainerAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getComputeName() == null) ? 0 : getComputeName().hashCode());
        hashCode = prime * hashCode + ((getComputeArn() == null) ? 0 : getComputeArn().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getDnsName() == null) ? 0 : getDnsName().hashCode());
        hashCode = prime * hashCode + ((getComputeStatus() == null) ? 0 : getComputeStatus().hashCode());
        hashCode = prime * hashCode + ((getLocation() == null) ? 0 : getLocation().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getGameLiftServiceSdkEndpoint() == null) ? 0 : getGameLiftServiceSdkEndpoint().hashCode());
        hashCode = prime * hashCode + ((getGameLiftAgentEndpoint() == null) ? 0 : getGameLiftAgentEndpoint().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getContainerAttributes() == null) ? 0 : getContainerAttributes().hashCode());
        return hashCode;
    }

    @Override
    public Compute clone() {
        try {
            return (Compute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ComputeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
