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
package com.amazonaws.services.gamelift.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Resources used to host your game servers. A compute resource can be managed GameLift Amazon EC2 instances or your own
 * resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/Compute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Compute implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A unique identifier for the fleet that the compute is registered to.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet that the compute is registered to.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * A descriptive label that is associated with the compute resource registered to your fleet.
     * </p>
     */
    private String computeName;
    /**
     * <p>
     * The ARN that is assigned to the compute resource and uniquely identifies it. ARNs are unique across locations.
     * </p>
     */
    private String computeArn;
    /**
     * <p>
     * The IP address of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * The DNS name of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
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
     * The type of operating system on your compute resource.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * Which compute type that the fleet uses. A fleet can use Anywhere compute resources owned by you or managed Amazon
     * EC2 instances.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The endpoint connection details of the GameLift SDK endpoint that your game server connects to.
     * </p>
     */
    private String gameLiftServiceSdkEndpoint;

    /**
     * <p>
     * A unique identifier for the fleet that the compute is registered to.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that the compute is registered to.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that the compute is registered to.
     * </p>
     * 
     * @return A unique identifier for the fleet that the compute is registered to.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * A unique identifier for the fleet that the compute is registered to.
     * </p>
     * 
     * @param fleetId
     *        A unique identifier for the fleet that the compute is registered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet that the compute is registered to.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (ARN) of the fleet that the compute is registered to.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet that the compute is registered to.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the fleet that the compute is registered to.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet that the compute is registered to.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (ARN) of the fleet that the compute is registered to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * A descriptive label that is associated with the compute resource registered to your fleet.
     * </p>
     * 
     * @param computeName
     *        A descriptive label that is associated with the compute resource registered to your fleet.
     */

    public void setComputeName(String computeName) {
        this.computeName = computeName;
    }

    /**
     * <p>
     * A descriptive label that is associated with the compute resource registered to your fleet.
     * </p>
     * 
     * @return A descriptive label that is associated with the compute resource registered to your fleet.
     */

    public String getComputeName() {
        return this.computeName;
    }

    /**
     * <p>
     * A descriptive label that is associated with the compute resource registered to your fleet.
     * </p>
     * 
     * @param computeName
     *        A descriptive label that is associated with the compute resource registered to your fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withComputeName(String computeName) {
        setComputeName(computeName);
        return this;
    }

    /**
     * <p>
     * The ARN that is assigned to the compute resource and uniquely identifies it. ARNs are unique across locations.
     * </p>
     * 
     * @param computeArn
     *        The ARN that is assigned to the compute resource and uniquely identifies it. ARNs are unique across
     *        locations.
     */

    public void setComputeArn(String computeArn) {
        this.computeArn = computeArn;
    }

    /**
     * <p>
     * The ARN that is assigned to the compute resource and uniquely identifies it. ARNs are unique across locations.
     * </p>
     * 
     * @return The ARN that is assigned to the compute resource and uniquely identifies it. ARNs are unique across
     *         locations.
     */

    public String getComputeArn() {
        return this.computeArn;
    }

    /**
     * <p>
     * The ARN that is assigned to the compute resource and uniquely identifies it. ARNs are unique across locations.
     * </p>
     * 
     * @param computeArn
     *        The ARN that is assigned to the compute resource and uniquely identifies it. ARNs are unique across
     *        locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withComputeArn(String computeArn) {
        setComputeArn(computeArn);
        return this;
    }

    /**
     * <p>
     * The IP address of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the compute resource. GameLift requires the DNS name or IP address to manage your
     *        compute resource.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * The IP address of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     * 
     * @return The IP address of the compute resource. GameLift requires the DNS name or IP address to manage your
     *         compute resource.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * The IP address of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     * 
     * @param ipAddress
     *        The IP address of the compute resource. GameLift requires the DNS name or IP address to manage your
     *        compute resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * The DNS name of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     * 
     * @param dnsName
     *        The DNS name of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     *        resource.
     */

    public void setDnsName(String dnsName) {
        this.dnsName = dnsName;
    }

    /**
     * <p>
     * The DNS name of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     * 
     * @return The DNS name of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     *         resource.
     */

    public String getDnsName() {
        return this.dnsName;
    }

    /**
     * <p>
     * The DNS name of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     * resource.
     * </p>
     * 
     * @param dnsName
     *        The DNS name of the compute resource. GameLift requires the DNS name or IP address to manage your compute
     *        resource.
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
     * The type of operating system on your compute resource.
     * </p>
     * 
     * @param operatingSystem
     *        The type of operating system on your compute resource.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * The type of operating system on your compute resource.
     * </p>
     * 
     * @return The type of operating system on your compute resource.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * The type of operating system on your compute resource.
     * </p>
     * 
     * @param operatingSystem
     *        The type of operating system on your compute resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public Compute withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * The type of operating system on your compute resource.
     * </p>
     * 
     * @param operatingSystem
     *        The type of operating system on your compute resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public Compute withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>
     * Which compute type that the fleet uses. A fleet can use Anywhere compute resources owned by you or managed Amazon
     * EC2 instances.
     * </p>
     * 
     * @param type
     *        Which compute type that the fleet uses. A fleet can use Anywhere compute resources owned by you or managed
     *        Amazon EC2 instances.
     * @see EC2InstanceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Which compute type that the fleet uses. A fleet can use Anywhere compute resources owned by you or managed Amazon
     * EC2 instances.
     * </p>
     * 
     * @return Which compute type that the fleet uses. A fleet can use Anywhere compute resources owned by you or
     *         managed Amazon EC2 instances.
     * @see EC2InstanceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Which compute type that the fleet uses. A fleet can use Anywhere compute resources owned by you or managed Amazon
     * EC2 instances.
     * </p>
     * 
     * @param type
     *        Which compute type that the fleet uses. A fleet can use Anywhere compute resources owned by you or managed
     *        Amazon EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public Compute withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Which compute type that the fleet uses. A fleet can use Anywhere compute resources owned by you or managed Amazon
     * EC2 instances.
     * </p>
     * 
     * @param type
     *        Which compute type that the fleet uses. A fleet can use Anywhere compute resources owned by you or managed
     *        Amazon EC2 instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public Compute withType(EC2InstanceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The endpoint connection details of the GameLift SDK endpoint that your game server connects to.
     * </p>
     * 
     * @param gameLiftServiceSdkEndpoint
     *        The endpoint connection details of the GameLift SDK endpoint that your game server connects to.
     */

    public void setGameLiftServiceSdkEndpoint(String gameLiftServiceSdkEndpoint) {
        this.gameLiftServiceSdkEndpoint = gameLiftServiceSdkEndpoint;
    }

    /**
     * <p>
     * The endpoint connection details of the GameLift SDK endpoint that your game server connects to.
     * </p>
     * 
     * @return The endpoint connection details of the GameLift SDK endpoint that your game server connects to.
     */

    public String getGameLiftServiceSdkEndpoint() {
        return this.gameLiftServiceSdkEndpoint;
    }

    /**
     * <p>
     * The endpoint connection details of the GameLift SDK endpoint that your game server connects to.
     * </p>
     * 
     * @param gameLiftServiceSdkEndpoint
     *        The endpoint connection details of the GameLift SDK endpoint that your game server connects to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Compute withGameLiftServiceSdkEndpoint(String gameLiftServiceSdkEndpoint) {
        setGameLiftServiceSdkEndpoint(gameLiftServiceSdkEndpoint);
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
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
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
            sb.append("GameLiftServiceSdkEndpoint: ").append(getGameLiftServiceSdkEndpoint());
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
