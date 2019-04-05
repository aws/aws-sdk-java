/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Properties that describe an instance of a virtual computing resource that hosts one or more game servers. A fleet may
 * contain zero or more instances.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/Instance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Instance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Unique identifier for a fleet that the instance is in.
     * </p>
     */
    private String fleetId;
    /**
     * <p>
     * Unique identifier for an instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * IP address assigned to the instance.
     * </p>
     */
    private String ipAddress;
    /**
     * <p>
     * Operating system that is running on this instance.
     * </p>
     */
    private String operatingSystem;
    /**
     * <p>
     * EC2 instance type that defines the computing resources of this instance.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Current status of the instance. Possible statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The instance is in the process of being created and launching server processes as defined in
     * the fleet's run-time configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has successfully
     * launched and reported back to Amazon GameLift that it is ready to host a game session. The instance is now
     * considered ready to host game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity during
     * a scaling down event or to recycle resources in the event of a problem.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     */
    private java.util.Date creationTime;

    /**
     * <p>
     * Unique identifier for a fleet that the instance is in.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet that the instance is in.
     */

    public void setFleetId(String fleetId) {
        this.fleetId = fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet that the instance is in.
     * </p>
     * 
     * @return Unique identifier for a fleet that the instance is in.
     */

    public String getFleetId() {
        return this.fleetId;
    }

    /**
     * <p>
     * Unique identifier for a fleet that the instance is in.
     * </p>
     * 
     * @param fleetId
     *        Unique identifier for a fleet that the instance is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withFleetId(String fleetId) {
        setFleetId(fleetId);
        return this;
    }

    /**
     * <p>
     * Unique identifier for an instance.
     * </p>
     * 
     * @param instanceId
     *        Unique identifier for an instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * Unique identifier for an instance.
     * </p>
     * 
     * @return Unique identifier for an instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * Unique identifier for an instance.
     * </p>
     * 
     * @param instanceId
     *        Unique identifier for an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * IP address assigned to the instance.
     * </p>
     * 
     * @param ipAddress
     *        IP address assigned to the instance.
     */

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    /**
     * <p>
     * IP address assigned to the instance.
     * </p>
     * 
     * @return IP address assigned to the instance.
     */

    public String getIpAddress() {
        return this.ipAddress;
    }

    /**
     * <p>
     * IP address assigned to the instance.
     * </p>
     * 
     * @param ipAddress
     *        IP address assigned to the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withIpAddress(String ipAddress) {
        setIpAddress(ipAddress);
        return this;
    }

    /**
     * <p>
     * Operating system that is running on this instance.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that is running on this instance.
     * @see OperatingSystem
     */

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    /**
     * <p>
     * Operating system that is running on this instance.
     * </p>
     * 
     * @return Operating system that is running on this instance.
     * @see OperatingSystem
     */

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    /**
     * <p>
     * Operating system that is running on this instance.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that is running on this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public Instance withOperatingSystem(String operatingSystem) {
        setOperatingSystem(operatingSystem);
        return this;
    }

    /**
     * <p>
     * Operating system that is running on this instance.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that is running on this instance.
     * @see OperatingSystem
     */

    public void setOperatingSystem(OperatingSystem operatingSystem) {
        withOperatingSystem(operatingSystem);
    }

    /**
     * <p>
     * Operating system that is running on this instance.
     * </p>
     * 
     * @param operatingSystem
     *        Operating system that is running on this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OperatingSystem
     */

    public Instance withOperatingSystem(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem.toString();
        return this;
    }

    /**
     * <p>
     * EC2 instance type that defines the computing resources of this instance.
     * </p>
     * 
     * @param type
     *        EC2 instance type that defines the computing resources of this instance.
     * @see EC2InstanceType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * EC2 instance type that defines the computing resources of this instance.
     * </p>
     * 
     * @return EC2 instance type that defines the computing resources of this instance.
     * @see EC2InstanceType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * EC2 instance type that defines the computing resources of this instance.
     * </p>
     * 
     * @param type
     *        EC2 instance type that defines the computing resources of this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public Instance withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * EC2 instance type that defines the computing resources of this instance.
     * </p>
     * 
     * @param type
     *        EC2 instance type that defines the computing resources of this instance.
     * @see EC2InstanceType
     */

    public void setType(EC2InstanceType type) {
        withType(type);
    }

    /**
     * <p>
     * EC2 instance type that defines the computing resources of this instance.
     * </p>
     * 
     * @param type
     *        EC2 instance type that defines the computing resources of this instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EC2InstanceType
     */

    public Instance withType(EC2InstanceType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Current status of the instance. Possible statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The instance is in the process of being created and launching server processes as defined in
     * the fleet's run-time configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has successfully
     * launched and reported back to Amazon GameLift that it is ready to host a game session. The instance is now
     * considered ready to host game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity during
     * a scaling down event or to recycle resources in the event of a problem.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the instance. Possible statuses include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING</b> -- The instance is in the process of being created and launching server processes as
     *        defined in the fleet's run-time configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has
     *        successfully launched and reported back to Amazon GameLift that it is ready to host a game session. The
     *        instance is now considered ready to host game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity
     *        during a scaling down event or to recycle resources in the event of a problem.
     *        </p>
     *        </li>
     * @see InstanceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the instance. Possible statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The instance is in the process of being created and launching server processes as defined in
     * the fleet's run-time configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has successfully
     * launched and reported back to Amazon GameLift that it is ready to host a game session. The instance is now
     * considered ready to host game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity during
     * a scaling down event or to recycle resources in the event of a problem.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Current status of the instance. Possible statuses include the following:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>PENDING</b> -- The instance is in the process of being created and launching server processes as
     *         defined in the fleet's run-time configuration.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has
     *         successfully launched and reported back to Amazon GameLift that it is ready to host a game session. The
     *         instance is now considered ready to host game sessions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity
     *         during a scaling down event or to recycle resources in the event of a problem.
     *         </p>
     *         </li>
     * @see InstanceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the instance. Possible statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The instance is in the process of being created and launching server processes as defined in
     * the fleet's run-time configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has successfully
     * launched and reported back to Amazon GameLift that it is ready to host a game session. The instance is now
     * considered ready to host game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity during
     * a scaling down event or to recycle resources in the event of a problem.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the instance. Possible statuses include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING</b> -- The instance is in the process of being created and launching server processes as
     *        defined in the fleet's run-time configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has
     *        successfully launched and reported back to Amazon GameLift that it is ready to host a game session. The
     *        instance is now considered ready to host game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity
     *        during a scaling down event or to recycle resources in the event of a problem.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */

    public Instance withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the instance. Possible statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The instance is in the process of being created and launching server processes as defined in
     * the fleet's run-time configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has successfully
     * launched and reported back to Amazon GameLift that it is ready to host a game session. The instance is now
     * considered ready to host game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity during
     * a scaling down event or to recycle resources in the event of a problem.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the instance. Possible statuses include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING</b> -- The instance is in the process of being created and launching server processes as
     *        defined in the fleet's run-time configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has
     *        successfully launched and reported back to Amazon GameLift that it is ready to host a game session. The
     *        instance is now considered ready to host game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity
     *        during a scaling down event or to recycle resources in the event of a problem.
     *        </p>
     *        </li>
     * @see InstanceStatus
     */

    public void setStatus(InstanceStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * Current status of the instance. Possible statuses include the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>PENDING</b> -- The instance is in the process of being created and launching server processes as defined in
     * the fleet's run-time configuration.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has successfully
     * launched and reported back to Amazon GameLift that it is ready to host a game session. The instance is now
     * considered ready to host game sessions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity during
     * a scaling down event or to recycle resources in the event of a problem.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        Current status of the instance. Possible statuses include the following:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>PENDING</b> -- The instance is in the process of being created and launching server processes as
     *        defined in the fleet's run-time configuration.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>ACTIVE</b> -- The instance has been successfully created and at least one server process has
     *        successfully launched and reported back to Amazon GameLift that it is ready to host a game session. The
     *        instance is now considered ready to host game sessions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>TERMINATING</b> -- The instance is in the process of shutting down. This may happen to reduce capacity
     *        during a scaling down event or to recycle resources in the event of a problem.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceStatus
     */

    public Instance withStatus(InstanceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @return Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *         milliseconds (for example "1469498468.057").
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     * milliseconds (for example "1469498468.057").
     * </p>
     * 
     * @param creationTime
     *        Time stamp indicating when this data object was created. Format is a number expressed in Unix time as
     *        milliseconds (for example "1469498468.057").
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getIpAddress() != null)
            sb.append("IpAddress: ").append(getIpAddress()).append(",");
        if (getOperatingSystem() != null)
            sb.append("OperatingSystem: ").append(getOperatingSystem()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;
        if (other.getFleetId() == null ^ this.getFleetId() == null)
            return false;
        if (other.getFleetId() != null && other.getFleetId().equals(this.getFleetId()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getIpAddress() == null ^ this.getIpAddress() == null)
            return false;
        if (other.getIpAddress() != null && other.getIpAddress().equals(this.getIpAddress()) == false)
            return false;
        if (other.getOperatingSystem() == null ^ this.getOperatingSystem() == null)
            return false;
        if (other.getOperatingSystem() != null && other.getOperatingSystem().equals(this.getOperatingSystem()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFleetId() == null) ? 0 : getFleetId().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getIpAddress() == null) ? 0 : getIpAddress().hashCode());
        hashCode = prime * hashCode + ((getOperatingSystem() == null) ? 0 : getOperatingSystem().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        return hashCode;
    }

    @Override
    public Instance clone() {
        try {
            return (Instance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.InstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
