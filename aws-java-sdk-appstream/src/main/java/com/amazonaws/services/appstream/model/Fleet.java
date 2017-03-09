/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the parameters for a fleet.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/Fleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Fleet implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN for the fleet.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the fleet.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name displayed to end users on the AppStream 2.0 portal.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The description displayed to end users on the AppStream 2.0 portal.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The image used by the fleet.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The instance type of compute resources for the fleet. The fleet instances are launched from this instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The capacity information for the fleet.
     * </p>
     */
    private ComputeCapacityStatus computeCapacityStatus;
    /**
     * <p>
     * The maximum time during which a streaming session can run.
     * </p>
     */
    private Integer maxUserDurationInSeconds;
    /**
     * <p>
     * The time after disconnection when a session is considered to have ended. When a user reconnects after a
     * disconnection, the user is connected to the same session and instance within this time interval.
     * </p>
     */
    private Integer disconnectTimeoutInSeconds;
    /**
     * <p>
     * The current state for the fleet.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The VPC configuration for the fleet.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * The time at which the fleet was created.
     * </p>
     */
    private java.util.Date createdTime;
    /**
     * <p>
     * The list of fleet errors is appended to this list.
     * </p>
     */
    private java.util.List<FleetError> fleetErrors;

    /**
     * <p>
     * The ARN for the fleet.
     * </p>
     * 
     * @param arn
     *        The ARN for the fleet.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The ARN for the fleet.
     * </p>
     * 
     * @return The ARN for the fleet.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The ARN for the fleet.
     * </p>
     * 
     * @param arn
     *        The ARN for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param name
     *        The name of the fleet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @return The name of the fleet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the fleet.
     * </p>
     * 
     * @param name
     *        The name of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @param displayName
     *        The name displayed to end users on the AppStream 2.0 portal.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The name displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @return The name displayed to end users on the AppStream 2.0 portal.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The name displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @param displayName
     *        The name displayed to end users on the AppStream 2.0 portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The description displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @param description
     *        The description displayed to end users on the AppStream 2.0 portal.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @return The description displayed to end users on the AppStream 2.0 portal.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description displayed to end users on the AppStream 2.0 portal.
     * </p>
     * 
     * @param description
     *        The description displayed to end users on the AppStream 2.0 portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The image used by the fleet.
     * </p>
     * 
     * @param imageName
     *        The image used by the fleet.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * The image used by the fleet.
     * </p>
     * 
     * @return The image used by the fleet.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * The image used by the fleet.
     * </p>
     * 
     * @param imageName
     *        The image used by the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The instance type of compute resources for the fleet. The fleet instances are launched from this instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type of compute resources for the fleet. The fleet instances are launched from this instance
     *        type.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of compute resources for the fleet. The fleet instances are launched from this instance type.
     * </p>
     * 
     * @return The instance type of compute resources for the fleet. The fleet instances are launched from this instance
     *         type.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of compute resources for the fleet. The fleet instances are launched from this instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type of compute resources for the fleet. The fleet instances are launched from this instance
     *        type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The capacity information for the fleet.
     * </p>
     * 
     * @param computeCapacityStatus
     *        The capacity information for the fleet.
     */

    public void setComputeCapacityStatus(ComputeCapacityStatus computeCapacityStatus) {
        this.computeCapacityStatus = computeCapacityStatus;
    }

    /**
     * <p>
     * The capacity information for the fleet.
     * </p>
     * 
     * @return The capacity information for the fleet.
     */

    public ComputeCapacityStatus getComputeCapacityStatus() {
        return this.computeCapacityStatus;
    }

    /**
     * <p>
     * The capacity information for the fleet.
     * </p>
     * 
     * @param computeCapacityStatus
     *        The capacity information for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withComputeCapacityStatus(ComputeCapacityStatus computeCapacityStatus) {
        setComputeCapacityStatus(computeCapacityStatus);
        return this;
    }

    /**
     * <p>
     * The maximum time during which a streaming session can run.
     * </p>
     * 
     * @param maxUserDurationInSeconds
     *        The maximum time during which a streaming session can run.
     */

    public void setMaxUserDurationInSeconds(Integer maxUserDurationInSeconds) {
        this.maxUserDurationInSeconds = maxUserDurationInSeconds;
    }

    /**
     * <p>
     * The maximum time during which a streaming session can run.
     * </p>
     * 
     * @return The maximum time during which a streaming session can run.
     */

    public Integer getMaxUserDurationInSeconds() {
        return this.maxUserDurationInSeconds;
    }

    /**
     * <p>
     * The maximum time during which a streaming session can run.
     * </p>
     * 
     * @param maxUserDurationInSeconds
     *        The maximum time during which a streaming session can run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withMaxUserDurationInSeconds(Integer maxUserDurationInSeconds) {
        setMaxUserDurationInSeconds(maxUserDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * The time after disconnection when a session is considered to have ended. When a user reconnects after a
     * disconnection, the user is connected to the same session and instance within this time interval.
     * </p>
     * 
     * @param disconnectTimeoutInSeconds
     *        The time after disconnection when a session is considered to have ended. When a user reconnects after a
     *        disconnection, the user is connected to the same session and instance within this time interval.
     */

    public void setDisconnectTimeoutInSeconds(Integer disconnectTimeoutInSeconds) {
        this.disconnectTimeoutInSeconds = disconnectTimeoutInSeconds;
    }

    /**
     * <p>
     * The time after disconnection when a session is considered to have ended. When a user reconnects after a
     * disconnection, the user is connected to the same session and instance within this time interval.
     * </p>
     * 
     * @return The time after disconnection when a session is considered to have ended. When a user reconnects after a
     *         disconnection, the user is connected to the same session and instance within this time interval.
     */

    public Integer getDisconnectTimeoutInSeconds() {
        return this.disconnectTimeoutInSeconds;
    }

    /**
     * <p>
     * The time after disconnection when a session is considered to have ended. When a user reconnects after a
     * disconnection, the user is connected to the same session and instance within this time interval.
     * </p>
     * 
     * @param disconnectTimeoutInSeconds
     *        The time after disconnection when a session is considered to have ended. When a user reconnects after a
     *        disconnection, the user is connected to the same session and instance within this time interval.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withDisconnectTimeoutInSeconds(Integer disconnectTimeoutInSeconds) {
        setDisconnectTimeoutInSeconds(disconnectTimeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * The current state for the fleet.
     * </p>
     * 
     * @param state
     *        The current state for the fleet.
     * @see FleetState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state for the fleet.
     * </p>
     * 
     * @return The current state for the fleet.
     * @see FleetState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state for the fleet.
     * </p>
     * 
     * @param state
     *        The current state for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetState
     */

    public Fleet withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state for the fleet.
     * </p>
     * 
     * @param state
     *        The current state for the fleet.
     * @see FleetState
     */

    public void setState(FleetState state) {
        this.state = state.toString();
    }

    /**
     * <p>
     * The current state for the fleet.
     * </p>
     * 
     * @param state
     *        The current state for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FleetState
     */

    public Fleet withState(FleetState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The VPC configuration for the fleet.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration for the fleet.
     */

    public void setVpcConfig(VpcConfig vpcConfig) {
        this.vpcConfig = vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration for the fleet.
     * </p>
     * 
     * @return The VPC configuration for the fleet.
     */

    public VpcConfig getVpcConfig() {
        return this.vpcConfig;
    }

    /**
     * <p>
     * The VPC configuration for the fleet.
     * </p>
     * 
     * @param vpcConfig
     *        The VPC configuration for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * The time at which the fleet was created.
     * </p>
     * 
     * @param createdTime
     *        The time at which the fleet was created.
     */

    public void setCreatedTime(java.util.Date createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * <p>
     * The time at which the fleet was created.
     * </p>
     * 
     * @return The time at which the fleet was created.
     */

    public java.util.Date getCreatedTime() {
        return this.createdTime;
    }

    /**
     * <p>
     * The time at which the fleet was created.
     * </p>
     * 
     * @param createdTime
     *        The time at which the fleet was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withCreatedTime(java.util.Date createdTime) {
        setCreatedTime(createdTime);
        return this;
    }

    /**
     * <p>
     * The list of fleet errors is appended to this list.
     * </p>
     * 
     * @return The list of fleet errors is appended to this list.
     */

    public java.util.List<FleetError> getFleetErrors() {
        return fleetErrors;
    }

    /**
     * <p>
     * The list of fleet errors is appended to this list.
     * </p>
     * 
     * @param fleetErrors
     *        The list of fleet errors is appended to this list.
     */

    public void setFleetErrors(java.util.Collection<FleetError> fleetErrors) {
        if (fleetErrors == null) {
            this.fleetErrors = null;
            return;
        }

        this.fleetErrors = new java.util.ArrayList<FleetError>(fleetErrors);
    }

    /**
     * <p>
     * The list of fleet errors is appended to this list.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFleetErrors(java.util.Collection)} or {@link #withFleetErrors(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param fleetErrors
     *        The list of fleet errors is appended to this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withFleetErrors(FleetError... fleetErrors) {
        if (this.fleetErrors == null) {
            setFleetErrors(new java.util.ArrayList<FleetError>(fleetErrors.length));
        }
        for (FleetError ele : fleetErrors) {
            this.fleetErrors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of fleet errors is appended to this list.
     * </p>
     * 
     * @param fleetErrors
     *        The list of fleet errors is appended to this list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Fleet withFleetErrors(java.util.Collection<FleetError> fleetErrors) {
        setFleetErrors(fleetErrors);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getComputeCapacityStatus() != null)
            sb.append("ComputeCapacityStatus: ").append(getComputeCapacityStatus()).append(",");
        if (getMaxUserDurationInSeconds() != null)
            sb.append("MaxUserDurationInSeconds: ").append(getMaxUserDurationInSeconds()).append(",");
        if (getDisconnectTimeoutInSeconds() != null)
            sb.append("DisconnectTimeoutInSeconds: ").append(getDisconnectTimeoutInSeconds()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getCreatedTime() != null)
            sb.append("CreatedTime: ").append(getCreatedTime()).append(",");
        if (getFleetErrors() != null)
            sb.append("FleetErrors: ").append(getFleetErrors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Fleet == false)
            return false;
        Fleet other = (Fleet) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getComputeCapacityStatus() == null ^ this.getComputeCapacityStatus() == null)
            return false;
        if (other.getComputeCapacityStatus() != null && other.getComputeCapacityStatus().equals(this.getComputeCapacityStatus()) == false)
            return false;
        if (other.getMaxUserDurationInSeconds() == null ^ this.getMaxUserDurationInSeconds() == null)
            return false;
        if (other.getMaxUserDurationInSeconds() != null && other.getMaxUserDurationInSeconds().equals(this.getMaxUserDurationInSeconds()) == false)
            return false;
        if (other.getDisconnectTimeoutInSeconds() == null ^ this.getDisconnectTimeoutInSeconds() == null)
            return false;
        if (other.getDisconnectTimeoutInSeconds() != null && other.getDisconnectTimeoutInSeconds().equals(this.getDisconnectTimeoutInSeconds()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getCreatedTime() == null ^ this.getCreatedTime() == null)
            return false;
        if (other.getCreatedTime() != null && other.getCreatedTime().equals(this.getCreatedTime()) == false)
            return false;
        if (other.getFleetErrors() == null ^ this.getFleetErrors() == null)
            return false;
        if (other.getFleetErrors() != null && other.getFleetErrors().equals(this.getFleetErrors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getComputeCapacityStatus() == null) ? 0 : getComputeCapacityStatus().hashCode());
        hashCode = prime * hashCode + ((getMaxUserDurationInSeconds() == null) ? 0 : getMaxUserDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getDisconnectTimeoutInSeconds() == null) ? 0 : getDisconnectTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
        hashCode = prime * hashCode + ((getFleetErrors() == null) ? 0 : getFleetErrors().hashCode());
        return hashCode;
    }

    @Override
    public Fleet clone() {
        try {
            return (Fleet) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.FleetMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
