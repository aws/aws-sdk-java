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
package com.amazonaws.services.kafka.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * 
 <p>
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
     * Endpoints for accessing the ZooKeeper.
     * </p>
     */
    private java.util.List<String> endpoints;
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
     *        <p>
     *        The attached elastic network interface of the broker.
     *        </p>
     */

    public void setAttachedENIId(String attachedENIId) {
        this.attachedENIId = attachedENIId;
    }

    /**
     * <p>
     * The attached elastic network interface of the broker.
     * </p>
     * 
     * @return <p>
     *         The attached elastic network interface of the broker.
     *         </p>
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
     *        <p>
     *        The attached elastic network interface of the broker.
     *        </p>
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
     *        <p>
     *        The virtual private cloud (VPC) IP address of the client.
     *        </p>
     */

    public void setClientVpcIpAddress(String clientVpcIpAddress) {
        this.clientVpcIpAddress = clientVpcIpAddress;
    }

    /**
     * <p>
     * The virtual private cloud (VPC) IP address of the client.
     * </p>
     * 
     * @return <p>
     *         The virtual private cloud (VPC) IP address of the client.
     *         </p>
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
     *        <p>
     *        The virtual private cloud (VPC) IP address of the client.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZookeeperNodeInfo withClientVpcIpAddress(String clientVpcIpAddress) {
        setClientVpcIpAddress(clientVpcIpAddress);
        return this;
    }

    /**
     * <p>
     * Endpoints for accessing the ZooKeeper.
     * </p>
     * 
     * @return <p>
     *         Endpoints for accessing the ZooKeeper.
     *         </p>
     */

    public java.util.List<String> getEndpoints() {
        return endpoints;
    }

    /**
     * <p>
     * Endpoints for accessing the ZooKeeper.
     * </p>
     * 
     * @param endpoints
     *        <p>
     *        Endpoints for accessing the ZooKeeper.
     *        </p>
     */

    public void setEndpoints(java.util.Collection<String> endpoints) {
        if (endpoints == null) {
            this.endpoints = null;
            return;
        }

        this.endpoints = new java.util.ArrayList<String>(endpoints);
    }

    /**
     * <p>
     * Endpoints for accessing the ZooKeeper.
     * </p>
     * 
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEndpoints(java.util.Collection)} or {@link #withEndpoints(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param endpoints
     *        <p>
     *        Endpoints for accessing the ZooKeeper.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZookeeperNodeInfo withEndpoints(String... endpoints) {
        if (this.endpoints == null) {
            setEndpoints(new java.util.ArrayList<String>(endpoints.length));
        }
        for (String ele : endpoints) {
            this.endpoints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Endpoints for accessing the ZooKeeper.
     * </p>
     * 
     * @param endpoints
     *        <p>
     *        Endpoints for accessing the ZooKeeper.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ZookeeperNodeInfo withEndpoints(java.util.Collection<String> endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    /**
     * <p>
     * The role-specific ID for Zookeeper.
     * </p>
     * 
     * @param zookeeperId
     *        <p>
     *        The role-specific ID for Zookeeper.
     *        </p>
     */

    public void setZookeeperId(Double zookeeperId) {
        this.zookeeperId = zookeeperId;
    }

    /**
     * <p>
     * The role-specific ID for Zookeeper.
     * </p>
     * 
     * @return <p>
     *         The role-specific ID for Zookeeper.
     *         </p>
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
     *        <p>
     *        The role-specific ID for Zookeeper.
     *        </p>
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
     *        <p>
     *        The version of Zookeeper.
     *        </p>
     */

    public void setZookeeperVersion(String zookeeperVersion) {
        this.zookeeperVersion = zookeeperVersion;
    }

    /**
     * <p>
     * The version of Zookeeper.
     * </p>
     * 
     * @return <p>
     *         The version of Zookeeper.
     *         </p>
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
     *        <p>
     *        The version of Zookeeper.
     *        </p>
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
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints()).append(",");
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
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
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
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
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
