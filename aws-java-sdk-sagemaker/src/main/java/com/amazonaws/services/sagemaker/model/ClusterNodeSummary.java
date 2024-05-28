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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Lists a summary of the properties of an instance (also called a <i>node</i> interchangeably) of a SageMaker HyperPod
 * cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ClusterNodeSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClusterNodeSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the instance group in which the instance is.
     * </p>
     */
    private String instanceGroupName;
    /**
     * <p>
     * The ID of the instance.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The type of the instance.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The time when the instance is launched.
     * </p>
     */
    private java.util.Date launchTime;
    /**
     * <p>
     * The status of the instance.
     * </p>
     */
    private ClusterInstanceStatusDetails instanceStatus;

    /**
     * <p>
     * The name of the instance group in which the instance is.
     * </p>
     * 
     * @param instanceGroupName
     *        The name of the instance group in which the instance is.
     */

    public void setInstanceGroupName(String instanceGroupName) {
        this.instanceGroupName = instanceGroupName;
    }

    /**
     * <p>
     * The name of the instance group in which the instance is.
     * </p>
     * 
     * @return The name of the instance group in which the instance is.
     */

    public String getInstanceGroupName() {
        return this.instanceGroupName;
    }

    /**
     * <p>
     * The name of the instance group in which the instance is.
     * </p>
     * 
     * @param instanceGroupName
     *        The name of the instance group in which the instance is.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterNodeSummary withInstanceGroupName(String instanceGroupName) {
        setInstanceGroupName(instanceGroupName);
        return this;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @return The ID of the instance.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The ID of the instance.
     * </p>
     * 
     * @param instanceId
     *        The ID of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterNodeSummary withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The type of the instance.
     * </p>
     * 
     * @param instanceType
     *        The type of the instance.
     * @see ClusterInstanceType
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of the instance.
     * </p>
     * 
     * @return The type of the instance.
     * @see ClusterInstanceType
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of the instance.
     * </p>
     * 
     * @param instanceType
     *        The type of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterInstanceType
     */

    public ClusterNodeSummary withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The type of the instance.
     * </p>
     * 
     * @param instanceType
     *        The type of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ClusterInstanceType
     */

    public ClusterNodeSummary withInstanceType(ClusterInstanceType instanceType) {
        this.instanceType = instanceType.toString();
        return this;
    }

    /**
     * <p>
     * The time when the instance is launched.
     * </p>
     * 
     * @param launchTime
     *        The time when the instance is launched.
     */

    public void setLaunchTime(java.util.Date launchTime) {
        this.launchTime = launchTime;
    }

    /**
     * <p>
     * The time when the instance is launched.
     * </p>
     * 
     * @return The time when the instance is launched.
     */

    public java.util.Date getLaunchTime() {
        return this.launchTime;
    }

    /**
     * <p>
     * The time when the instance is launched.
     * </p>
     * 
     * @param launchTime
     *        The time when the instance is launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterNodeSummary withLaunchTime(java.util.Date launchTime) {
        setLaunchTime(launchTime);
        return this;
    }

    /**
     * <p>
     * The status of the instance.
     * </p>
     * 
     * @param instanceStatus
     *        The status of the instance.
     */

    public void setInstanceStatus(ClusterInstanceStatusDetails instanceStatus) {
        this.instanceStatus = instanceStatus;
    }

    /**
     * <p>
     * The status of the instance.
     * </p>
     * 
     * @return The status of the instance.
     */

    public ClusterInstanceStatusDetails getInstanceStatus() {
        return this.instanceStatus;
    }

    /**
     * <p>
     * The status of the instance.
     * </p>
     * 
     * @param instanceStatus
     *        The status of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClusterNodeSummary withInstanceStatus(ClusterInstanceStatusDetails instanceStatus) {
        setInstanceStatus(instanceStatus);
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
        if (getInstanceGroupName() != null)
            sb.append("InstanceGroupName: ").append(getInstanceGroupName()).append(",");
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getLaunchTime() != null)
            sb.append("LaunchTime: ").append(getLaunchTime()).append(",");
        if (getInstanceStatus() != null)
            sb.append("InstanceStatus: ").append(getInstanceStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ClusterNodeSummary == false)
            return false;
        ClusterNodeSummary other = (ClusterNodeSummary) obj;
        if (other.getInstanceGroupName() == null ^ this.getInstanceGroupName() == null)
            return false;
        if (other.getInstanceGroupName() != null && other.getInstanceGroupName().equals(this.getInstanceGroupName()) == false)
            return false;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getLaunchTime() == null ^ this.getLaunchTime() == null)
            return false;
        if (other.getLaunchTime() != null && other.getLaunchTime().equals(this.getLaunchTime()) == false)
            return false;
        if (other.getInstanceStatus() == null ^ this.getInstanceStatus() == null)
            return false;
        if (other.getInstanceStatus() != null && other.getInstanceStatus().equals(this.getInstanceStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceGroupName() == null) ? 0 : getInstanceGroupName().hashCode());
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getLaunchTime() == null) ? 0 : getLaunchTime().hashCode());
        hashCode = prime * hashCode + ((getInstanceStatus() == null) ? 0 : getInstanceStatus().hashCode());
        return hashCode;
    }

    @Override
    public ClusterNodeSummary clone() {
        try {
            return (ClusterNodeSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.ClusterNodeSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
