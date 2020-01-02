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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The status of the service update on the node group
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/NodeGroupUpdateStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeGroupUpdateStatus implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the node group
     * </p>
     */
    private String nodeGroupId;
    /**
     * <p>
     * The status of the service update on the node group member
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NodeGroupMemberUpdateStatus> nodeGroupMemberUpdateStatus;

    /**
     * <p>
     * The ID of the node group
     * </p>
     * 
     * @param nodeGroupId
     *        The ID of the node group
     */

    public void setNodeGroupId(String nodeGroupId) {
        this.nodeGroupId = nodeGroupId;
    }

    /**
     * <p>
     * The ID of the node group
     * </p>
     * 
     * @return The ID of the node group
     */

    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * <p>
     * The ID of the node group
     * </p>
     * 
     * @param nodeGroupId
     *        The ID of the node group
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupUpdateStatus withNodeGroupId(String nodeGroupId) {
        setNodeGroupId(nodeGroupId);
        return this;
    }

    /**
     * <p>
     * The status of the service update on the node group member
     * </p>
     * 
     * @return The status of the service update on the node group member
     */

    public java.util.List<NodeGroupMemberUpdateStatus> getNodeGroupMemberUpdateStatus() {
        if (nodeGroupMemberUpdateStatus == null) {
            nodeGroupMemberUpdateStatus = new com.amazonaws.internal.SdkInternalList<NodeGroupMemberUpdateStatus>();
        }
        return nodeGroupMemberUpdateStatus;
    }

    /**
     * <p>
     * The status of the service update on the node group member
     * </p>
     * 
     * @param nodeGroupMemberUpdateStatus
     *        The status of the service update on the node group member
     */

    public void setNodeGroupMemberUpdateStatus(java.util.Collection<NodeGroupMemberUpdateStatus> nodeGroupMemberUpdateStatus) {
        if (nodeGroupMemberUpdateStatus == null) {
            this.nodeGroupMemberUpdateStatus = null;
            return;
        }

        this.nodeGroupMemberUpdateStatus = new com.amazonaws.internal.SdkInternalList<NodeGroupMemberUpdateStatus>(nodeGroupMemberUpdateStatus);
    }

    /**
     * <p>
     * The status of the service update on the node group member
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNodeGroupMemberUpdateStatus(java.util.Collection)} or
     * {@link #withNodeGroupMemberUpdateStatus(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param nodeGroupMemberUpdateStatus
     *        The status of the service update on the node group member
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupUpdateStatus withNodeGroupMemberUpdateStatus(NodeGroupMemberUpdateStatus... nodeGroupMemberUpdateStatus) {
        if (this.nodeGroupMemberUpdateStatus == null) {
            setNodeGroupMemberUpdateStatus(new com.amazonaws.internal.SdkInternalList<NodeGroupMemberUpdateStatus>(nodeGroupMemberUpdateStatus.length));
        }
        for (NodeGroupMemberUpdateStatus ele : nodeGroupMemberUpdateStatus) {
            this.nodeGroupMemberUpdateStatus.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The status of the service update on the node group member
     * </p>
     * 
     * @param nodeGroupMemberUpdateStatus
     *        The status of the service update on the node group member
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeGroupUpdateStatus withNodeGroupMemberUpdateStatus(java.util.Collection<NodeGroupMemberUpdateStatus> nodeGroupMemberUpdateStatus) {
        setNodeGroupMemberUpdateStatus(nodeGroupMemberUpdateStatus);
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
        if (getNodeGroupId() != null)
            sb.append("NodeGroupId: ").append(getNodeGroupId()).append(",");
        if (getNodeGroupMemberUpdateStatus() != null)
            sb.append("NodeGroupMemberUpdateStatus: ").append(getNodeGroupMemberUpdateStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeGroupUpdateStatus == false)
            return false;
        NodeGroupUpdateStatus other = (NodeGroupUpdateStatus) obj;
        if (other.getNodeGroupId() == null ^ this.getNodeGroupId() == null)
            return false;
        if (other.getNodeGroupId() != null && other.getNodeGroupId().equals(this.getNodeGroupId()) == false)
            return false;
        if (other.getNodeGroupMemberUpdateStatus() == null ^ this.getNodeGroupMemberUpdateStatus() == null)
            return false;
        if (other.getNodeGroupMemberUpdateStatus() != null && other.getNodeGroupMemberUpdateStatus().equals(this.getNodeGroupMemberUpdateStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNodeGroupId() == null) ? 0 : getNodeGroupId().hashCode());
        hashCode = prime * hashCode + ((getNodeGroupMemberUpdateStatus() == null) ? 0 : getNodeGroupMemberUpdateStatus().hashCode());
        return hashCode;
    }

    @Override
    public NodeGroupUpdateStatus clone() {
        try {
            return (NodeGroupUpdateStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
