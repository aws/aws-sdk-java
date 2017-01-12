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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for the new fleet to create.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/CreateFleet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateFleetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier for the fleet.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Unique name of the image used by the fleet.
     * </p>
     */
    private String imageName;
    /**
     * <p>
     * The instance type of compute resources for the fleet. Fleet instances are launched from this instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The parameters for the capacity allocated to the fleet.
     * </p>
     */
    private ComputeCapacity computeCapacity;
    /**
     * <p>
     * The VPC configuration for the fleet.
     * </p>
     */
    private VpcConfig vpcConfig;
    /**
     * <p>
     * The maximum time up to which a streaming session can run.
     * </p>
     */
    private Integer maxUserDurationInSeconds;
    /**
     * <p>
     * The time after disconnection when a session is considered to have ended. If a user who got disconnected
     * reconnects within this timeout interval, the user is connected back to his/her previous session.
     * </p>
     */
    private Integer disconnectTimeoutInSeconds;
    /**
     * <p>
     * The description of the fleet.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of the fleet.
     * </p>
     */
    private String displayName;

    /**
     * <p>
     * A unique identifier for the fleet.
     * </p>
     * 
     * @param name
     *        A unique identifier for the fleet.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique identifier for the fleet.
     * </p>
     * 
     * @return A unique identifier for the fleet.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique identifier for the fleet.
     * </p>
     * 
     * @param name
     *        A unique identifier for the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Unique name of the image used by the fleet.
     * </p>
     * 
     * @param imageName
     *        Unique name of the image used by the fleet.
     */

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    /**
     * <p>
     * Unique name of the image used by the fleet.
     * </p>
     * 
     * @return Unique name of the image used by the fleet.
     */

    public String getImageName() {
        return this.imageName;
    }

    /**
     * <p>
     * Unique name of the image used by the fleet.
     * </p>
     * 
     * @param imageName
     *        Unique name of the image used by the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withImageName(String imageName) {
        setImageName(imageName);
        return this;
    }

    /**
     * <p>
     * The instance type of compute resources for the fleet. Fleet instances are launched from this instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type of compute resources for the fleet. Fleet instances are launched from this instance
     *        type.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type of compute resources for the fleet. Fleet instances are launched from this instance type.
     * </p>
     * 
     * @return The instance type of compute resources for the fleet. Fleet instances are launched from this instance
     *         type.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type of compute resources for the fleet. Fleet instances are launched from this instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type of compute resources for the fleet. Fleet instances are launched from this instance
     *        type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The parameters for the capacity allocated to the fleet.
     * </p>
     * 
     * @param computeCapacity
     *        The parameters for the capacity allocated to the fleet.
     */

    public void setComputeCapacity(ComputeCapacity computeCapacity) {
        this.computeCapacity = computeCapacity;
    }

    /**
     * <p>
     * The parameters for the capacity allocated to the fleet.
     * </p>
     * 
     * @return The parameters for the capacity allocated to the fleet.
     */

    public ComputeCapacity getComputeCapacity() {
        return this.computeCapacity;
    }

    /**
     * <p>
     * The parameters for the capacity allocated to the fleet.
     * </p>
     * 
     * @param computeCapacity
     *        The parameters for the capacity allocated to the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withComputeCapacity(ComputeCapacity computeCapacity) {
        setComputeCapacity(computeCapacity);
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

    public CreateFleetRequest withVpcConfig(VpcConfig vpcConfig) {
        setVpcConfig(vpcConfig);
        return this;
    }

    /**
     * <p>
     * The maximum time up to which a streaming session can run.
     * </p>
     * 
     * @param maxUserDurationInSeconds
     *        The maximum time up to which a streaming session can run.
     */

    public void setMaxUserDurationInSeconds(Integer maxUserDurationInSeconds) {
        this.maxUserDurationInSeconds = maxUserDurationInSeconds;
    }

    /**
     * <p>
     * The maximum time up to which a streaming session can run.
     * </p>
     * 
     * @return The maximum time up to which a streaming session can run.
     */

    public Integer getMaxUserDurationInSeconds() {
        return this.maxUserDurationInSeconds;
    }

    /**
     * <p>
     * The maximum time up to which a streaming session can run.
     * </p>
     * 
     * @param maxUserDurationInSeconds
     *        The maximum time up to which a streaming session can run.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withMaxUserDurationInSeconds(Integer maxUserDurationInSeconds) {
        setMaxUserDurationInSeconds(maxUserDurationInSeconds);
        return this;
    }

    /**
     * <p>
     * The time after disconnection when a session is considered to have ended. If a user who got disconnected
     * reconnects within this timeout interval, the user is connected back to his/her previous session.
     * </p>
     * 
     * @param disconnectTimeoutInSeconds
     *        The time after disconnection when a session is considered to have ended. If a user who got disconnected
     *        reconnects within this timeout interval, the user is connected back to his/her previous session.
     */

    public void setDisconnectTimeoutInSeconds(Integer disconnectTimeoutInSeconds) {
        this.disconnectTimeoutInSeconds = disconnectTimeoutInSeconds;
    }

    /**
     * <p>
     * The time after disconnection when a session is considered to have ended. If a user who got disconnected
     * reconnects within this timeout interval, the user is connected back to his/her previous session.
     * </p>
     * 
     * @return The time after disconnection when a session is considered to have ended. If a user who got disconnected
     *         reconnects within this timeout interval, the user is connected back to his/her previous session.
     */

    public Integer getDisconnectTimeoutInSeconds() {
        return this.disconnectTimeoutInSeconds;
    }

    /**
     * <p>
     * The time after disconnection when a session is considered to have ended. If a user who got disconnected
     * reconnects within this timeout interval, the user is connected back to his/her previous session.
     * </p>
     * 
     * @param disconnectTimeoutInSeconds
     *        The time after disconnection when a session is considered to have ended. If a user who got disconnected
     *        reconnects within this timeout interval, the user is connected back to his/her previous session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withDisconnectTimeoutInSeconds(Integer disconnectTimeoutInSeconds) {
        setDisconnectTimeoutInSeconds(disconnectTimeoutInSeconds);
        return this;
    }

    /**
     * <p>
     * The description of the fleet.
     * </p>
     * 
     * @param description
     *        The description of the fleet.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the fleet.
     * </p>
     * 
     * @return The description of the fleet.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the fleet.
     * </p>
     * 
     * @param description
     *        The description of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of the fleet.
     * </p>
     * 
     * @param displayName
     *        The display name of the fleet.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of the fleet.
     * </p>
     * 
     * @return The display name of the fleet.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of the fleet.
     * </p>
     * 
     * @param displayName
     *        The display name of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateFleetRequest withDisplayName(String displayName) {
        setDisplayName(displayName);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getImageName() != null)
            sb.append("ImageName: ").append(getImageName()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getComputeCapacity() != null)
            sb.append("ComputeCapacity: ").append(getComputeCapacity()).append(",");
        if (getVpcConfig() != null)
            sb.append("VpcConfig: ").append(getVpcConfig()).append(",");
        if (getMaxUserDurationInSeconds() != null)
            sb.append("MaxUserDurationInSeconds: ").append(getMaxUserDurationInSeconds()).append(",");
        if (getDisconnectTimeoutInSeconds() != null)
            sb.append("DisconnectTimeoutInSeconds: ").append(getDisconnectTimeoutInSeconds()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateFleetRequest == false)
            return false;
        CreateFleetRequest other = (CreateFleetRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getImageName() == null ^ this.getImageName() == null)
            return false;
        if (other.getImageName() != null && other.getImageName().equals(this.getImageName()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getComputeCapacity() == null ^ this.getComputeCapacity() == null)
            return false;
        if (other.getComputeCapacity() != null && other.getComputeCapacity().equals(this.getComputeCapacity()) == false)
            return false;
        if (other.getVpcConfig() == null ^ this.getVpcConfig() == null)
            return false;
        if (other.getVpcConfig() != null && other.getVpcConfig().equals(this.getVpcConfig()) == false)
            return false;
        if (other.getMaxUserDurationInSeconds() == null ^ this.getMaxUserDurationInSeconds() == null)
            return false;
        if (other.getMaxUserDurationInSeconds() != null && other.getMaxUserDurationInSeconds().equals(this.getMaxUserDurationInSeconds()) == false)
            return false;
        if (other.getDisconnectTimeoutInSeconds() == null ^ this.getDisconnectTimeoutInSeconds() == null)
            return false;
        if (other.getDisconnectTimeoutInSeconds() != null && other.getDisconnectTimeoutInSeconds().equals(this.getDisconnectTimeoutInSeconds()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getImageName() == null) ? 0 : getImageName().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getComputeCapacity() == null) ? 0 : getComputeCapacity().hashCode());
        hashCode = prime * hashCode + ((getVpcConfig() == null) ? 0 : getVpcConfig().hashCode());
        hashCode = prime * hashCode + ((getMaxUserDurationInSeconds() == null) ? 0 : getMaxUserDurationInSeconds().hashCode());
        hashCode = prime * hashCode + ((getDisconnectTimeoutInSeconds() == null) ? 0 : getDisconnectTimeoutInSeconds().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        return hashCode;
    }

    @Override
    public CreateFleetRequest clone() {
        return (CreateFleetRequest) super.clone();
    }

}
