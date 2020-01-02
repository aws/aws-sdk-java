/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.eks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing the resources associated with the node group, such as Auto Scaling groups and security groups
 * for remote access.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/eks-2017-11-01/NodegroupResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodegroupResources implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Auto Scaling groups associated with the node group.
     * </p>
     */
    private java.util.List<AutoScalingGroup> autoScalingGroups;
    /**
     * <p>
     * The remote access security group associated with the node group. This security group controls SSH access to the
     * worker nodes.
     * </p>
     */
    private String remoteAccessSecurityGroup;

    /**
     * <p>
     * The Auto Scaling groups associated with the node group.
     * </p>
     * 
     * @return The Auto Scaling groups associated with the node group.
     */

    public java.util.List<AutoScalingGroup> getAutoScalingGroups() {
        return autoScalingGroups;
    }

    /**
     * <p>
     * The Auto Scaling groups associated with the node group.
     * </p>
     * 
     * @param autoScalingGroups
     *        The Auto Scaling groups associated with the node group.
     */

    public void setAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }

        this.autoScalingGroups = new java.util.ArrayList<AutoScalingGroup>(autoScalingGroups);
    }

    /**
     * <p>
     * The Auto Scaling groups associated with the node group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoScalingGroups(java.util.Collection)} or {@link #withAutoScalingGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param autoScalingGroups
     *        The Auto Scaling groups associated with the node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodegroupResources withAutoScalingGroups(AutoScalingGroup... autoScalingGroups) {
        if (this.autoScalingGroups == null) {
            setAutoScalingGroups(new java.util.ArrayList<AutoScalingGroup>(autoScalingGroups.length));
        }
        for (AutoScalingGroup ele : autoScalingGroups) {
            this.autoScalingGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Auto Scaling groups associated with the node group.
     * </p>
     * 
     * @param autoScalingGroups
     *        The Auto Scaling groups associated with the node group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodegroupResources withAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        setAutoScalingGroups(autoScalingGroups);
        return this;
    }

    /**
     * <p>
     * The remote access security group associated with the node group. This security group controls SSH access to the
     * worker nodes.
     * </p>
     * 
     * @param remoteAccessSecurityGroup
     *        The remote access security group associated with the node group. This security group controls SSH access
     *        to the worker nodes.
     */

    public void setRemoteAccessSecurityGroup(String remoteAccessSecurityGroup) {
        this.remoteAccessSecurityGroup = remoteAccessSecurityGroup;
    }

    /**
     * <p>
     * The remote access security group associated with the node group. This security group controls SSH access to the
     * worker nodes.
     * </p>
     * 
     * @return The remote access security group associated with the node group. This security group controls SSH access
     *         to the worker nodes.
     */

    public String getRemoteAccessSecurityGroup() {
        return this.remoteAccessSecurityGroup;
    }

    /**
     * <p>
     * The remote access security group associated with the node group. This security group controls SSH access to the
     * worker nodes.
     * </p>
     * 
     * @param remoteAccessSecurityGroup
     *        The remote access security group associated with the node group. This security group controls SSH access
     *        to the worker nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodegroupResources withRemoteAccessSecurityGroup(String remoteAccessSecurityGroup) {
        setRemoteAccessSecurityGroup(remoteAccessSecurityGroup);
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
        if (getAutoScalingGroups() != null)
            sb.append("AutoScalingGroups: ").append(getAutoScalingGroups()).append(",");
        if (getRemoteAccessSecurityGroup() != null)
            sb.append("RemoteAccessSecurityGroup: ").append(getRemoteAccessSecurityGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodegroupResources == false)
            return false;
        NodegroupResources other = (NodegroupResources) obj;
        if (other.getAutoScalingGroups() == null ^ this.getAutoScalingGroups() == null)
            return false;
        if (other.getAutoScalingGroups() != null && other.getAutoScalingGroups().equals(this.getAutoScalingGroups()) == false)
            return false;
        if (other.getRemoteAccessSecurityGroup() == null ^ this.getRemoteAccessSecurityGroup() == null)
            return false;
        if (other.getRemoteAccessSecurityGroup() != null && other.getRemoteAccessSecurityGroup().equals(this.getRemoteAccessSecurityGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode());
        hashCode = prime * hashCode + ((getRemoteAccessSecurityGroup() == null) ? 0 : getRemoteAccessSecurityGroup().hashCode());
        return hashCode;
    }

    @Override
    public NodegroupResources clone() {
        try {
            return (NodegroupResources) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.eks.model.transform.NodegroupResourcesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
