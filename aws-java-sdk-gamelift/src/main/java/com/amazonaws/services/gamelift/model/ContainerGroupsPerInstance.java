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
 * Determines how many replica container groups that Amazon GameLift deploys to each instance in a container fleet.
 * </p>
 * <p>
 * Amazon GameLift calculates the maximum possible replica groups per instance based on the instance 's CPU and memory
 * resources. When deploying a fleet, Amazon GameLift places replica container groups on each fleet instance based on
 * the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * If no desired value is set, Amazon GameLift places the calculated maximum.
 * </p>
 * </li>
 * <li>
 * <p>
 * If a desired number is set to a value higher than the calculated maximum, Amazon GameLift places the calculated
 * maximum.
 * </p>
 * </li>
 * <li>
 * <p>
 * If a desired number is set to a value lower than the calculated maximum, Amazon GameLift places the desired number.
 * </p>
 * </li>
 * </ul>
 * <p>
 * <b>Part of:</b> <a>ContainerGroupsConfiguration</a>, <a>ContainerGroupsAttributes</a>
 * </p>
 * <p>
 * <b>Returned by:</b> <a>DescribeFleetAttributes</a>, <a>CreateFleet</a>
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamelift-2015-10-01/ContainerGroupsPerInstance"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ContainerGroupsPerInstance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The desired number of replica container groups to place on each fleet instance.
     * </p>
     */
    private Integer desiredReplicaContainerGroupsPerInstance;
    /**
     * <p>
     * The maximum possible number of replica container groups that each fleet instance can have.
     * </p>
     */
    private Integer maxReplicaContainerGroupsPerInstance;

    /**
     * <p>
     * The desired number of replica container groups to place on each fleet instance.
     * </p>
     * 
     * @param desiredReplicaContainerGroupsPerInstance
     *        The desired number of replica container groups to place on each fleet instance.
     */

    public void setDesiredReplicaContainerGroupsPerInstance(Integer desiredReplicaContainerGroupsPerInstance) {
        this.desiredReplicaContainerGroupsPerInstance = desiredReplicaContainerGroupsPerInstance;
    }

    /**
     * <p>
     * The desired number of replica container groups to place on each fleet instance.
     * </p>
     * 
     * @return The desired number of replica container groups to place on each fleet instance.
     */

    public Integer getDesiredReplicaContainerGroupsPerInstance() {
        return this.desiredReplicaContainerGroupsPerInstance;
    }

    /**
     * <p>
     * The desired number of replica container groups to place on each fleet instance.
     * </p>
     * 
     * @param desiredReplicaContainerGroupsPerInstance
     *        The desired number of replica container groups to place on each fleet instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupsPerInstance withDesiredReplicaContainerGroupsPerInstance(Integer desiredReplicaContainerGroupsPerInstance) {
        setDesiredReplicaContainerGroupsPerInstance(desiredReplicaContainerGroupsPerInstance);
        return this;
    }

    /**
     * <p>
     * The maximum possible number of replica container groups that each fleet instance can have.
     * </p>
     * 
     * @param maxReplicaContainerGroupsPerInstance
     *        The maximum possible number of replica container groups that each fleet instance can have.
     */

    public void setMaxReplicaContainerGroupsPerInstance(Integer maxReplicaContainerGroupsPerInstance) {
        this.maxReplicaContainerGroupsPerInstance = maxReplicaContainerGroupsPerInstance;
    }

    /**
     * <p>
     * The maximum possible number of replica container groups that each fleet instance can have.
     * </p>
     * 
     * @return The maximum possible number of replica container groups that each fleet instance can have.
     */

    public Integer getMaxReplicaContainerGroupsPerInstance() {
        return this.maxReplicaContainerGroupsPerInstance;
    }

    /**
     * <p>
     * The maximum possible number of replica container groups that each fleet instance can have.
     * </p>
     * 
     * @param maxReplicaContainerGroupsPerInstance
     *        The maximum possible number of replica container groups that each fleet instance can have.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerGroupsPerInstance withMaxReplicaContainerGroupsPerInstance(Integer maxReplicaContainerGroupsPerInstance) {
        setMaxReplicaContainerGroupsPerInstance(maxReplicaContainerGroupsPerInstance);
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
        if (getDesiredReplicaContainerGroupsPerInstance() != null)
            sb.append("DesiredReplicaContainerGroupsPerInstance: ").append(getDesiredReplicaContainerGroupsPerInstance()).append(",");
        if (getMaxReplicaContainerGroupsPerInstance() != null)
            sb.append("MaxReplicaContainerGroupsPerInstance: ").append(getMaxReplicaContainerGroupsPerInstance());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerGroupsPerInstance == false)
            return false;
        ContainerGroupsPerInstance other = (ContainerGroupsPerInstance) obj;
        if (other.getDesiredReplicaContainerGroupsPerInstance() == null ^ this.getDesiredReplicaContainerGroupsPerInstance() == null)
            return false;
        if (other.getDesiredReplicaContainerGroupsPerInstance() != null
                && other.getDesiredReplicaContainerGroupsPerInstance().equals(this.getDesiredReplicaContainerGroupsPerInstance()) == false)
            return false;
        if (other.getMaxReplicaContainerGroupsPerInstance() == null ^ this.getMaxReplicaContainerGroupsPerInstance() == null)
            return false;
        if (other.getMaxReplicaContainerGroupsPerInstance() != null
                && other.getMaxReplicaContainerGroupsPerInstance().equals(this.getMaxReplicaContainerGroupsPerInstance()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDesiredReplicaContainerGroupsPerInstance() == null) ? 0 : getDesiredReplicaContainerGroupsPerInstance().hashCode());
        hashCode = prime * hashCode + ((getMaxReplicaContainerGroupsPerInstance() == null) ? 0 : getMaxReplicaContainerGroupsPerInstance().hashCode());
        return hashCode;
    }

    @Override
    public ContainerGroupsPerInstance clone() {
        try {
            return (ContainerGroupsPerInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamelift.model.transform.ContainerGroupsPerInstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
