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
 * Zookeeper node information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/ZookeeperNodeInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ZookeeperNodeInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attached elastic network interface of the broker.
     * </p>
     */
    private String attachedENIId;
    /**
     * <p>
     * The virtual private cloud (VPC) IP address of the client.
     * </p>
     */
    private String clientVpcIpAddress;
    /**
     * <p>
     * The role-specific ID for Zookeeper.
     * </p>
     */
    private Double zookeeperId;
    /**
     * <p>
     * The version of Zookeeper.
     * </p>
     */
    private String zookeeperVersion;

    /**
     * <p>
     * The attached elastic network interface of the broker.
     * </p>
     * 
     * @param attachedENIId
     *        The attached elastic network interface of the broker.
     */

    public void setAttachedENIId(String attachedENIId) {
        this.attachedENIId = attachedENIId;
    }

    /**
     * <p>
     * The attached elastic network interface of the broker.
     * </p>
     * 
     * @return The attached elastic network interface of the broker.
     */

    public String getAttachedENIId() {
        return this.attachedENIId;
    }

    /**
     * <p>
     * The attached elastic network interface of the broker.
     * </p>
     * 
     * @param attachedENIId
     *        The attached elastic network interface of the broker.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZookeeperNodeInfo withAttachedENIId(String attachedENIId) {
        setAttachedENIId(attachedENIId);
        return this;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) IP address of the client.
     * </p>
     * 
     * @param clientVpcIpAddress
     *        The virtual private cloud (VPC) IP address of the client.
     */

    public void setClientVpcIpAddress(String clientVpcIpAddress) {
        this.clientVpcIpAddress = clientVpcIpAddress;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) IP address of the client.
     * </p>
     * 
     * @return The virtual private cloud (VPC) IP address of the client.
     */

    public String getClientVpcIpAddress() {
        return this.clientVpcIpAddress;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) IP address of the client.
     * </p>
     * 
     * @param clientVpcIpAddress
     *        The virtual private cloud (VPC) IP address of the client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZookeeperNodeInfo withClientVpcIpAddress(String clientVpcIpAddress) {
        setClientVpcIpAddress(clientVpcIpAddress);
        return this;
    }

    /**
     * <p>
     * The role-specific ID for Zookeeper.
     * </p>
     * 
     * @param zookeeperId
     *        The role-specific ID for Zookeeper.
     */

    public void setZookeeperId(Double zookeeperId) {
        this.zookeeperId = zookeeperId;
    }

    /**
     * <p>
     * The role-specific ID for Zookeeper.
     * </p>
     * 
     * @return The role-specific ID for Zookeeper.
     */

    public Double getZookeeperId() {
        return this.zookeeperId;
    }

    /**
     * <p>
     * The role-specific ID for Zookeeper.
     * </p>
     * 
     * @param zookeeperId
     *        The role-specific ID for Zookeeper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZookeeperNodeInfo withZookeeperId(Double zookeeperId) {
        setZookeeperId(zookeeperId);
        return this;
    }

    /**
     * <p>
     * The version of Zookeeper.
     * </p>
     * 
     * @param zookeeperVersion
     *        The version of Zookeeper.
     */

    public void setZookeeperVersion(String zookeeperVersion) {
        this.zookeeperVersion = zookeeperVersion;
    }

    /**
     * <p>
     * The version of Zookeeper.
     * </p>
     * 
     * @return The version of Zookeeper.
     */

    public String getZookeeperVersion() {
        return this.zookeeperVersion;
    }

    /**
     * <p>
     * The version of Zookeeper.
     * </p>
     * 
     * @param zookeeperVersion
     *        The version of Zookeeper.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZookeeperNodeInfo withZookeeperVersion(String zookeeperVersion) {
        setZookeeperVersion(zookeeperVersion);
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
        if (getAttachedENIId() != null)
            sb.append("AttachedENIId: ").append(getAttachedENIId()).append(",");
        if (getClientVpcIpAddress() != null)
            sb.append("ClientVpcIpAddress: ").append(getClientVpcIpAddress()).append(",");
        if (getZookeeperId() != null)
            sb.append("ZookeeperId: ").append(getZookeeperId()).append(",");
        if (getZookeeperVersion() != null)
            sb.append("ZookeeperVersion: ").append(getZookeeperVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ZookeeperNodeInfo == false)
            return false;
        ZookeeperNodeInfo other = (ZookeeperNodeInfo) obj;
        if (other.getAttachedENIId() == null ^ this.getAttachedENIId() == null)
            return false;
        if (other.getAttachedENIId() != null && other.getAttachedENIId().equals(this.getAttachedENIId()) == false)
            return false;
        if (other.getClientVpcIpAddress() == null ^ this.getClientVpcIpAddress() == null)
            return false;
        if (other.getClientVpcIpAddress() != null && other.getClientVpcIpAddress().equals(this.getClientVpcIpAddress()) == false)
            return false;
        if (other.getZookeeperId() == null ^ this.getZookeeperId() == null)
            return false;
        if (other.getZookeeperId() != null && other.getZookeeperId().equals(this.getZookeeperId()) == false)
            return false;
        if (other.getZookeeperVersion() == null ^ this.getZookeeperVersion() == null)
            return false;
        if (other.getZookeeperVersion() != null && other.getZookeeperVersion().equals(this.getZookeeperVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachedENIId() == null) ? 0 : getAttachedENIId().hashCode());
        hashCode = prime * hashCode + ((getClientVpcIpAddress() == null) ? 0 : getClientVpcIpAddress().hashCode());
        hashCode = prime * hashCode + ((getZookeeperId() == null) ? 0 : getZookeeperId().hashCode());
        hashCode = prime * hashCode + ((getZookeeperVersion() == null) ? 0 : getZookeeperVersion().hashCode());
        return hashCode;
    }

    @Override
    public ZookeeperNodeInfo clone() {
        try {
            return (ZookeeperNodeInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.ZookeeperNodeInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
