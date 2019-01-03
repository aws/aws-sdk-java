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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a robot.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/Robot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Robot implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The name of the robot.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     */
    private String fleetArn;
    /**
     * <p>
     * The status of the robot.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The Greengrass group associated with the robot.
     * </p>
     */
    private String greenGrassGroupId;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the robot was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The architecture of the robot.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the last deployment job.
     * </p>
     */
    private String lastDeploymentJob;
    /**
     * <p>
     * The time of the last deployment.
     * </p>
     */
    private java.util.Date lastDeploymentTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the robot.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the robot.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the robot.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the robot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Robot withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The name of the robot.
     * </p>
     * 
     * @param name
     *        The name of the robot.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the robot.
     * </p>
     * 
     * @return The name of the robot.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the robot.
     * </p>
     * 
     * @param name
     *        The name of the robot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Robot withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (ARN) of the fleet.
     */

    public void setFleetArn(String fleetArn) {
        this.fleetArn = fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the fleet.
     */

    public String getFleetArn() {
        return this.fleetArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the fleet.
     * </p>
     * 
     * @param fleetArn
     *        The Amazon Resource Name (ARN) of the fleet.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Robot withFleetArn(String fleetArn) {
        setFleetArn(fleetArn);
        return this;
    }

    /**
     * <p>
     * The status of the robot.
     * </p>
     * 
     * @param status
     *        The status of the robot.
     * @see RobotStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the robot.
     * </p>
     * 
     * @return The status of the robot.
     * @see RobotStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the robot.
     * </p>
     * 
     * @param status
     *        The status of the robot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RobotStatus
     */

    public Robot withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the robot.
     * </p>
     * 
     * @param status
     *        The status of the robot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RobotStatus
     */

    public Robot withStatus(RobotStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The Greengrass group associated with the robot.
     * </p>
     * 
     * @param greenGrassGroupId
     *        The Greengrass group associated with the robot.
     */

    public void setGreenGrassGroupId(String greenGrassGroupId) {
        this.greenGrassGroupId = greenGrassGroupId;
    }

    /**
     * <p>
     * The Greengrass group associated with the robot.
     * </p>
     * 
     * @return The Greengrass group associated with the robot.
     */

    public String getGreenGrassGroupId() {
        return this.greenGrassGroupId;
    }

    /**
     * <p>
     * The Greengrass group associated with the robot.
     * </p>
     * 
     * @param greenGrassGroupId
     *        The Greengrass group associated with the robot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Robot withGreenGrassGroupId(String greenGrassGroupId) {
        setGreenGrassGroupId(greenGrassGroupId);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the robot was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the robot was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the robot was created.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the robot was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the robot was created.
     * </p>
     * 
     * @param createdAt
     *        The time, in milliseconds since the epoch, when the robot was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Robot withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The architecture of the robot.
     * </p>
     * 
     * @param architecture
     *        The architecture of the robot.
     * @see Architecture
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the robot.
     * </p>
     * 
     * @return The architecture of the robot.
     * @see Architecture
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The architecture of the robot.
     * </p>
     * 
     * @param architecture
     *        The architecture of the robot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public Robot withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The architecture of the robot.
     * </p>
     * 
     * @param architecture
     *        The architecture of the robot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Architecture
     */

    public Robot withArchitecture(Architecture architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the last deployment job.
     * </p>
     * 
     * @param lastDeploymentJob
     *        The Amazon Resource Name (ARN) of the last deployment job.
     */

    public void setLastDeploymentJob(String lastDeploymentJob) {
        this.lastDeploymentJob = lastDeploymentJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the last deployment job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the last deployment job.
     */

    public String getLastDeploymentJob() {
        return this.lastDeploymentJob;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the last deployment job.
     * </p>
     * 
     * @param lastDeploymentJob
     *        The Amazon Resource Name (ARN) of the last deployment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Robot withLastDeploymentJob(String lastDeploymentJob) {
        setLastDeploymentJob(lastDeploymentJob);
        return this;
    }

    /**
     * <p>
     * The time of the last deployment.
     * </p>
     * 
     * @param lastDeploymentTime
     *        The time of the last deployment.
     */

    public void setLastDeploymentTime(java.util.Date lastDeploymentTime) {
        this.lastDeploymentTime = lastDeploymentTime;
    }

    /**
     * <p>
     * The time of the last deployment.
     * </p>
     * 
     * @return The time of the last deployment.
     */

    public java.util.Date getLastDeploymentTime() {
        return this.lastDeploymentTime;
    }

    /**
     * <p>
     * The time of the last deployment.
     * </p>
     * 
     * @param lastDeploymentTime
     *        The time of the last deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Robot withLastDeploymentTime(java.util.Date lastDeploymentTime) {
        setLastDeploymentTime(lastDeploymentTime);
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getFleetArn() != null)
            sb.append("FleetArn: ").append(getFleetArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getGreenGrassGroupId() != null)
            sb.append("GreenGrassGroupId: ").append(getGreenGrassGroupId()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getLastDeploymentJob() != null)
            sb.append("LastDeploymentJob: ").append(getLastDeploymentJob()).append(",");
        if (getLastDeploymentTime() != null)
            sb.append("LastDeploymentTime: ").append(getLastDeploymentTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Robot == false)
            return false;
        Robot other = (Robot) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getFleetArn() == null ^ this.getFleetArn() == null)
            return false;
        if (other.getFleetArn() != null && other.getFleetArn().equals(this.getFleetArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getGreenGrassGroupId() == null ^ this.getGreenGrassGroupId() == null)
            return false;
        if (other.getGreenGrassGroupId() != null && other.getGreenGrassGroupId().equals(this.getGreenGrassGroupId()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getLastDeploymentJob() == null ^ this.getLastDeploymentJob() == null)
            return false;
        if (other.getLastDeploymentJob() != null && other.getLastDeploymentJob().equals(this.getLastDeploymentJob()) == false)
            return false;
        if (other.getLastDeploymentTime() == null ^ this.getLastDeploymentTime() == null)
            return false;
        if (other.getLastDeploymentTime() != null && other.getLastDeploymentTime().equals(this.getLastDeploymentTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getFleetArn() == null) ? 0 : getFleetArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getGreenGrassGroupId() == null) ? 0 : getGreenGrassGroupId().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getLastDeploymentJob() == null) ? 0 : getLastDeploymentJob().hashCode());
        hashCode = prime * hashCode + ((getLastDeploymentTime() == null) ? 0 : getLastDeploymentTime().hashCode());
        return hashCode;
    }

    @Override
    public Robot clone() {
        try {
            return (Robot) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.RobotMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
