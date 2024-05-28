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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the instance topology.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/InstanceTopology" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceTopology implements Serializable, Cloneable {

    /**
     * <p>
     * The instance ID.
     * </p>
     */
    private String instanceId;
    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The name of the placement group that the instance is in.
     * </p>
     */
    private String groupName;
    /**
     * <p>
     * The network nodes. The nodes are hashed based on your account. Instances from different accounts running under
     * the same server will return a different hashed list of strings.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> networkNodes;
    /**
     * <p>
     * The name of the Availability Zone or Local Zone that the instance is in.
     * </p>
     */
    private String availabilityZone;
    /**
     * <p>
     * The ID of the Availability Zone or Local Zone that the instance is in.
     * </p>
     */
    private String zoneId;

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     */

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @return The instance ID.
     */

    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * <p>
     * The instance ID.
     * </p>
     * 
     * @param instanceId
     *        The instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTopology withInstanceId(String instanceId) {
        setInstanceId(instanceId);
        return this;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @return The instance type.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The instance type.
     * </p>
     * 
     * @param instanceType
     *        The instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTopology withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The name of the placement group that the instance is in.
     * </p>
     * 
     * @param groupName
     *        The name of the placement group that the instance is in.
     */

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * <p>
     * The name of the placement group that the instance is in.
     * </p>
     * 
     * @return The name of the placement group that the instance is in.
     */

    public String getGroupName() {
        return this.groupName;
    }

    /**
     * <p>
     * The name of the placement group that the instance is in.
     * </p>
     * 
     * @param groupName
     *        The name of the placement group that the instance is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTopology withGroupName(String groupName) {
        setGroupName(groupName);
        return this;
    }

    /**
     * <p>
     * The network nodes. The nodes are hashed based on your account. Instances from different accounts running under
     * the same server will return a different hashed list of strings.
     * </p>
     * 
     * @return The network nodes. The nodes are hashed based on your account. Instances from different accounts running
     *         under the same server will return a different hashed list of strings.
     */

    public java.util.List<String> getNetworkNodes() {
        if (networkNodes == null) {
            networkNodes = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return networkNodes;
    }

    /**
     * <p>
     * The network nodes. The nodes are hashed based on your account. Instances from different accounts running under
     * the same server will return a different hashed list of strings.
     * </p>
     * 
     * @param networkNodes
     *        The network nodes. The nodes are hashed based on your account. Instances from different accounts running
     *        under the same server will return a different hashed list of strings.
     */

    public void setNetworkNodes(java.util.Collection<String> networkNodes) {
        if (networkNodes == null) {
            this.networkNodes = null;
            return;
        }

        this.networkNodes = new com.amazonaws.internal.SdkInternalList<String>(networkNodes);
    }

    /**
     * <p>
     * The network nodes. The nodes are hashed based on your account. Instances from different accounts running under
     * the same server will return a different hashed list of strings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNetworkNodes(java.util.Collection)} or {@link #withNetworkNodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param networkNodes
     *        The network nodes. The nodes are hashed based on your account. Instances from different accounts running
     *        under the same server will return a different hashed list of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTopology withNetworkNodes(String... networkNodes) {
        if (this.networkNodes == null) {
            setNetworkNodes(new com.amazonaws.internal.SdkInternalList<String>(networkNodes.length));
        }
        for (String ele : networkNodes) {
            this.networkNodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The network nodes. The nodes are hashed based on your account. Instances from different accounts running under
     * the same server will return a different hashed list of strings.
     * </p>
     * 
     * @param networkNodes
     *        The network nodes. The nodes are hashed based on your account. Instances from different accounts running
     *        under the same server will return a different hashed list of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTopology withNetworkNodes(java.util.Collection<String> networkNodes) {
        setNetworkNodes(networkNodes);
        return this;
    }

    /**
     * <p>
     * The name of the Availability Zone or Local Zone that the instance is in.
     * </p>
     * 
     * @param availabilityZone
     *        The name of the Availability Zone or Local Zone that the instance is in.
     */

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone or Local Zone that the instance is in.
     * </p>
     * 
     * @return The name of the Availability Zone or Local Zone that the instance is in.
     */

    public String getAvailabilityZone() {
        return this.availabilityZone;
    }

    /**
     * <p>
     * The name of the Availability Zone or Local Zone that the instance is in.
     * </p>
     * 
     * @param availabilityZone
     *        The name of the Availability Zone or Local Zone that the instance is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTopology withAvailabilityZone(String availabilityZone) {
        setAvailabilityZone(availabilityZone);
        return this;
    }

    /**
     * <p>
     * The ID of the Availability Zone or Local Zone that the instance is in.
     * </p>
     * 
     * @param zoneId
     *        The ID of the Availability Zone or Local Zone that the instance is in.
     */

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone or Local Zone that the instance is in.
     * </p>
     * 
     * @return The ID of the Availability Zone or Local Zone that the instance is in.
     */

    public String getZoneId() {
        return this.zoneId;
    }

    /**
     * <p>
     * The ID of the Availability Zone or Local Zone that the instance is in.
     * </p>
     * 
     * @param zoneId
     *        The ID of the Availability Zone or Local Zone that the instance is in.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTopology withZoneId(String zoneId) {
        setZoneId(zoneId);
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
        if (getInstanceId() != null)
            sb.append("InstanceId: ").append(getInstanceId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getGroupName() != null)
            sb.append("GroupName: ").append(getGroupName()).append(",");
        if (getNetworkNodes() != null)
            sb.append("NetworkNodes: ").append(getNetworkNodes()).append(",");
        if (getAvailabilityZone() != null)
            sb.append("AvailabilityZone: ").append(getAvailabilityZone()).append(",");
        if (getZoneId() != null)
            sb.append("ZoneId: ").append(getZoneId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceTopology == false)
            return false;
        InstanceTopology other = (InstanceTopology) obj;
        if (other.getInstanceId() == null ^ this.getInstanceId() == null)
            return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getGroupName() == null ^ this.getGroupName() == null)
            return false;
        if (other.getGroupName() != null && other.getGroupName().equals(this.getGroupName()) == false)
            return false;
        if (other.getNetworkNodes() == null ^ this.getNetworkNodes() == null)
            return false;
        if (other.getNetworkNodes() != null && other.getNetworkNodes().equals(this.getNetworkNodes()) == false)
            return false;
        if (other.getAvailabilityZone() == null ^ this.getAvailabilityZone() == null)
            return false;
        if (other.getAvailabilityZone() != null && other.getAvailabilityZone().equals(this.getAvailabilityZone()) == false)
            return false;
        if (other.getZoneId() == null ^ this.getZoneId() == null)
            return false;
        if (other.getZoneId() != null && other.getZoneId().equals(this.getZoneId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getGroupName() == null) ? 0 : getGroupName().hashCode());
        hashCode = prime * hashCode + ((getNetworkNodes() == null) ? 0 : getNetworkNodes().hashCode());
        hashCode = prime * hashCode + ((getAvailabilityZone() == null) ? 0 : getAvailabilityZone().hashCode());
        hashCode = prime * hashCode + ((getZoneId() == null) ? 0 : getZoneId().hashCode());
        return hashCode;
    }

    @Override
    public InstanceTopology clone() {
        try {
            return (InstanceTopology) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
