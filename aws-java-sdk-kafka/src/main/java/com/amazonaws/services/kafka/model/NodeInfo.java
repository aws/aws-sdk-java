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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The node information object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/NodeInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NodeInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The start time.
     * </p>
     */
    private String addedToClusterTime;
    /**
     * <p>
     * The broker node info.
     * </p>
     */
    private BrokerNodeInfo brokerNodeInfo;
    /**
     * <p>
     * The instance type.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the node.
     * </p>
     */
    private String nodeARN;
    /**
     * <p>
     * The node type.
     * </p>
     */
    private String nodeType;
    /**
     * <p>
     * The ZookeeperNodeInfo.
     * </p>
     */
    private ZookeeperNodeInfo zookeeperNodeInfo;

    /**
     * <p>
     * The start time.
     * </p>
     * 
     * @param addedToClusterTime
     *        The start time.
     */

    public void setAddedToClusterTime(String addedToClusterTime) {
        this.addedToClusterTime = addedToClusterTime;
    }

    /**
     * <p>
     * The start time.
     * </p>
     * 
     * @return The start time.
     */

    public String getAddedToClusterTime() {
        return this.addedToClusterTime;
    }

    /**
     * <p>
     * The start time.
     * </p>
     * 
     * @param addedToClusterTime
     *        The start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInfo withAddedToClusterTime(String addedToClusterTime) {
        setAddedToClusterTime(addedToClusterTime);
        return this;
    }

    /**
     * <p>
     * The broker node info.
     * </p>
     * 
     * @param brokerNodeInfo
     *        The broker node info.
     */

    public void setBrokerNodeInfo(BrokerNodeInfo brokerNodeInfo) {
        this.brokerNodeInfo = brokerNodeInfo;
    }

    /**
     * <p>
     * The broker node info.
     * </p>
     * 
     * @return The broker node info.
     */

    public BrokerNodeInfo getBrokerNodeInfo() {
        return this.brokerNodeInfo;
    }

    /**
     * <p>
     * The broker node info.
     * </p>
     * 
     * @param brokerNodeInfo
     *        The broker node info.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInfo withBrokerNodeInfo(BrokerNodeInfo brokerNodeInfo) {
        setBrokerNodeInfo(brokerNodeInfo);
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

    public NodeInfo withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the node.
     * </p>
     * 
     * @param nodeARN
     *        The Amazon Resource Name (ARN) of the node.
     */

    public void setNodeARN(String nodeARN) {
        this.nodeARN = nodeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the node.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the node.
     */

    public String getNodeARN() {
        return this.nodeARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the node.
     * </p>
     * 
     * @param nodeARN
     *        The Amazon Resource Name (ARN) of the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInfo withNodeARN(String nodeARN) {
        setNodeARN(nodeARN);
        return this;
    }

    /**
     * <p>
     * The node type.
     * </p>
     * 
     * @param nodeType
     *        The node type.
     * @see NodeType
     */

    public void setNodeType(String nodeType) {
        this.nodeType = nodeType;
    }

    /**
     * <p>
     * The node type.
     * </p>
     * 
     * @return The node type.
     * @see NodeType
     */

    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * <p>
     * The node type.
     * </p>
     * 
     * @param nodeType
     *        The node type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeType
     */

    public NodeInfo withNodeType(String nodeType) {
        setNodeType(nodeType);
        return this;
    }

    /**
     * <p>
     * The node type.
     * </p>
     * 
     * @param nodeType
     *        The node type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NodeType
     */

    public NodeInfo withNodeType(NodeType nodeType) {
        this.nodeType = nodeType.toString();
        return this;
    }

    /**
     * <p>
     * The ZookeeperNodeInfo.
     * </p>
     * 
     * @param zookeeperNodeInfo
     *        The ZookeeperNodeInfo.
     */

    public void setZookeeperNodeInfo(ZookeeperNodeInfo zookeeperNodeInfo) {
        this.zookeeperNodeInfo = zookeeperNodeInfo;
    }

    /**
     * <p>
     * The ZookeeperNodeInfo.
     * </p>
     * 
     * @return The ZookeeperNodeInfo.
     */

    public ZookeeperNodeInfo getZookeeperNodeInfo() {
        return this.zookeeperNodeInfo;
    }

    /**
     * <p>
     * The ZookeeperNodeInfo.
     * </p>
     * 
     * @param zookeeperNodeInfo
     *        The ZookeeperNodeInfo.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NodeInfo withZookeeperNodeInfo(ZookeeperNodeInfo zookeeperNodeInfo) {
        setZookeeperNodeInfo(zookeeperNodeInfo);
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
        if (getAddedToClusterTime() != null)
            sb.append("AddedToClusterTime: ").append(getAddedToClusterTime()).append(",");
        if (getBrokerNodeInfo() != null)
            sb.append("BrokerNodeInfo: ").append(getBrokerNodeInfo()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getNodeARN() != null)
            sb.append("NodeARN: ").append(getNodeARN()).append(",");
        if (getNodeType() != null)
            sb.append("NodeType: ").append(getNodeType()).append(",");
        if (getZookeeperNodeInfo() != null)
            sb.append("ZookeeperNodeInfo: ").append(getZookeeperNodeInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NodeInfo == false)
            return false;
        NodeInfo other = (NodeInfo) obj;
        if (other.getAddedToClusterTime() == null ^ this.getAddedToClusterTime() == null)
            return false;
        if (other.getAddedToClusterTime() != null && other.getAddedToClusterTime().equals(this.getAddedToClusterTime()) == false)
            return false;
        if (other.getBrokerNodeInfo() == null ^ this.getBrokerNodeInfo() == null)
            return false;
        if (other.getBrokerNodeInfo() != null && other.getBrokerNodeInfo().equals(this.getBrokerNodeInfo()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getNodeARN() == null ^ this.getNodeARN() == null)
            return false;
        if (other.getNodeARN() != null && other.getNodeARN().equals(this.getNodeARN()) == false)
            return false;
        if (other.getNodeType() == null ^ this.getNodeType() == null)
            return false;
        if (other.getNodeType() != null && other.getNodeType().equals(this.getNodeType()) == false)
            return false;
        if (other.getZookeeperNodeInfo() == null ^ this.getZookeeperNodeInfo() == null)
            return false;
        if (other.getZookeeperNodeInfo() != null && other.getZookeeperNodeInfo().equals(this.getZookeeperNodeInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddedToClusterTime() == null) ? 0 : getAddedToClusterTime().hashCode());
        hashCode = prime * hashCode + ((getBrokerNodeInfo() == null) ? 0 : getBrokerNodeInfo().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getNodeARN() == null) ? 0 : getNodeARN().hashCode());
        hashCode = prime * hashCode + ((getNodeType() == null) ? 0 : getNodeType().hashCode());
        hashCode = prime * hashCode + ((getZookeeperNodeInfo() == null) ? 0 : getZookeeperNodeInfo().hashCode());
        return hashCode;
    }

    @Override
    public NodeInfo clone() {
        try {
            return (NodeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.NodeInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
