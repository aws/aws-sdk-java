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
 * Describes the setup to be used for Kafka broker nodes in the cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kafka-2018-11-14/BrokerNodeGroupInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BrokerNodeGroupInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The distribution of broker nodes across Availability Zones.
     * </p>
     */
    private String brokerAZDistribution;
    /**
     * <p>
     * The list of subnets to connect to in the client virtual private cloud (VPC). AWS creates elastic network
     * interfaces inside these subnets. Client applications use elastic network interfaces to produce and consume data.
     * Client subnets can't be in Availability Zone us-east-1e.
     * </p>
     */
    private java.util.List<String> clientSubnets;
    /**
     * <p>
     * The type of Amazon EC2 instances to use for Kafka brokers. The following instance types are allowed:
     * kafka.m5.large, kafka.m5.xlarge, kafka.m5.2xlarge, kafka.m5.4xlarge, kafka.m5.12xlarge, and kafka.m5.24xlarge.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The AWS security groups to associate with the elastic network interfaces in order to specify who can connect to
     * and communicate with the Amazon MSK cluster.
     * </p>
     */
    private java.util.List<String> securityGroups;
    /**
     * <p>
     * Contains information about storage volumes attached to MSK broker nodes.
     * </p>
     */
    private StorageInfo storageInfo;

    /**
     * <p>
     * The distribution of broker nodes across Availability Zones.
     * </p>
     * 
     * @param brokerAZDistribution
     *        The distribution of broker nodes across Availability Zones.
     * @see BrokerAZDistribution
     */

    public void setBrokerAZDistribution(String brokerAZDistribution) {
        this.brokerAZDistribution = brokerAZDistribution;
    }

    /**
     * <p>
     * The distribution of broker nodes across Availability Zones.
     * </p>
     * 
     * @return The distribution of broker nodes across Availability Zones.
     * @see BrokerAZDistribution
     */

    public String getBrokerAZDistribution() {
        return this.brokerAZDistribution;
    }

    /**
     * <p>
     * The distribution of broker nodes across Availability Zones.
     * </p>
     * 
     * @param brokerAZDistribution
     *        The distribution of broker nodes across Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BrokerAZDistribution
     */

    public BrokerNodeGroupInfo withBrokerAZDistribution(String brokerAZDistribution) {
        setBrokerAZDistribution(brokerAZDistribution);
        return this;
    }

    /**
     * <p>
     * The distribution of broker nodes across Availability Zones.
     * </p>
     * 
     * @param brokerAZDistribution
     *        The distribution of broker nodes across Availability Zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BrokerAZDistribution
     */

    public BrokerNodeGroupInfo withBrokerAZDistribution(BrokerAZDistribution brokerAZDistribution) {
        this.brokerAZDistribution = brokerAZDistribution.toString();
        return this;
    }

    /**
     * <p>
     * The list of subnets to connect to in the client virtual private cloud (VPC). AWS creates elastic network
     * interfaces inside these subnets. Client applications use elastic network interfaces to produce and consume data.
     * Client subnets can't be in Availability Zone us-east-1e.
     * </p>
     * 
     * @return The list of subnets to connect to in the client virtual private cloud (VPC). AWS creates elastic network
     *         interfaces inside these subnets. Client applications use elastic network interfaces to produce and
     *         consume data. Client subnets can't be in Availability Zone us-east-1e.
     */

    public java.util.List<String> getClientSubnets() {
        return clientSubnets;
    }

    /**
     * <p>
     * The list of subnets to connect to in the client virtual private cloud (VPC). AWS creates elastic network
     * interfaces inside these subnets. Client applications use elastic network interfaces to produce and consume data.
     * Client subnets can't be in Availability Zone us-east-1e.
     * </p>
     * 
     * @param clientSubnets
     *        The list of subnets to connect to in the client virtual private cloud (VPC). AWS creates elastic network
     *        interfaces inside these subnets. Client applications use elastic network interfaces to produce and consume
     *        data. Client subnets can't be in Availability Zone us-east-1e.
     */

    public void setClientSubnets(java.util.Collection<String> clientSubnets) {
        if (clientSubnets == null) {
            this.clientSubnets = null;
            return;
        }

        this.clientSubnets = new java.util.ArrayList<String>(clientSubnets);
    }

    /**
     * <p>
     * The list of subnets to connect to in the client virtual private cloud (VPC). AWS creates elastic network
     * interfaces inside these subnets. Client applications use elastic network interfaces to produce and consume data.
     * Client subnets can't be in Availability Zone us-east-1e.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setClientSubnets(java.util.Collection)} or {@link #withClientSubnets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param clientSubnets
     *        The list of subnets to connect to in the client virtual private cloud (VPC). AWS creates elastic network
     *        interfaces inside these subnets. Client applications use elastic network interfaces to produce and consume
     *        data. Client subnets can't be in Availability Zone us-east-1e.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerNodeGroupInfo withClientSubnets(String... clientSubnets) {
        if (this.clientSubnets == null) {
            setClientSubnets(new java.util.ArrayList<String>(clientSubnets.length));
        }
        for (String ele : clientSubnets) {
            this.clientSubnets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of subnets to connect to in the client virtual private cloud (VPC). AWS creates elastic network
     * interfaces inside these subnets. Client applications use elastic network interfaces to produce and consume data.
     * Client subnets can't be in Availability Zone us-east-1e.
     * </p>
     * 
     * @param clientSubnets
     *        The list of subnets to connect to in the client virtual private cloud (VPC). AWS creates elastic network
     *        interfaces inside these subnets. Client applications use elastic network interfaces to produce and consume
     *        data. Client subnets can't be in Availability Zone us-east-1e.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerNodeGroupInfo withClientSubnets(java.util.Collection<String> clientSubnets) {
        setClientSubnets(clientSubnets);
        return this;
    }

    /**
     * <p>
     * The type of Amazon EC2 instances to use for Kafka brokers. The following instance types are allowed:
     * kafka.m5.large, kafka.m5.xlarge, kafka.m5.2xlarge, kafka.m5.4xlarge, kafka.m5.12xlarge, and kafka.m5.24xlarge.
     * </p>
     * 
     * @param instanceType
     *        The type of Amazon EC2 instances to use for Kafka brokers. The following instance types are allowed:
     *        kafka.m5.large, kafka.m5.xlarge, kafka.m5.2xlarge, kafka.m5.4xlarge, kafka.m5.12xlarge, and
     *        kafka.m5.24xlarge.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of Amazon EC2 instances to use for Kafka brokers. The following instance types are allowed:
     * kafka.m5.large, kafka.m5.xlarge, kafka.m5.2xlarge, kafka.m5.4xlarge, kafka.m5.12xlarge, and kafka.m5.24xlarge.
     * </p>
     * 
     * @return The type of Amazon EC2 instances to use for Kafka brokers. The following instance types are allowed:
     *         kafka.m5.large, kafka.m5.xlarge, kafka.m5.2xlarge, kafka.m5.4xlarge, kafka.m5.12xlarge, and
     *         kafka.m5.24xlarge.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of Amazon EC2 instances to use for Kafka brokers. The following instance types are allowed:
     * kafka.m5.large, kafka.m5.xlarge, kafka.m5.2xlarge, kafka.m5.4xlarge, kafka.m5.12xlarge, and kafka.m5.24xlarge.
     * </p>
     * 
     * @param instanceType
     *        The type of Amazon EC2 instances to use for Kafka brokers. The following instance types are allowed:
     *        kafka.m5.large, kafka.m5.xlarge, kafka.m5.2xlarge, kafka.m5.4xlarge, kafka.m5.12xlarge, and
     *        kafka.m5.24xlarge.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerNodeGroupInfo withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The AWS security groups to associate with the elastic network interfaces in order to specify who can connect to
     * and communicate with the Amazon MSK cluster.
     * </p>
     * 
     * @return The AWS security groups to associate with the elastic network interfaces in order to specify who can
     *         connect to and communicate with the Amazon MSK cluster.
     */

    public java.util.List<String> getSecurityGroups() {
        return securityGroups;
    }

    /**
     * <p>
     * The AWS security groups to associate with the elastic network interfaces in order to specify who can connect to
     * and communicate with the Amazon MSK cluster.
     * </p>
     * 
     * @param securityGroups
     *        The AWS security groups to associate with the elastic network interfaces in order to specify who can
     *        connect to and communicate with the Amazon MSK cluster.
     */

    public void setSecurityGroups(java.util.Collection<String> securityGroups) {
        if (securityGroups == null) {
            this.securityGroups = null;
            return;
        }

        this.securityGroups = new java.util.ArrayList<String>(securityGroups);
    }

    /**
     * <p>
     * The AWS security groups to associate with the elastic network interfaces in order to specify who can connect to
     * and communicate with the Amazon MSK cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSecurityGroups(java.util.Collection)} or {@link #withSecurityGroups(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param securityGroups
     *        The AWS security groups to associate with the elastic network interfaces in order to specify who can
     *        connect to and communicate with the Amazon MSK cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerNodeGroupInfo withSecurityGroups(String... securityGroups) {
        if (this.securityGroups == null) {
            setSecurityGroups(new java.util.ArrayList<String>(securityGroups.length));
        }
        for (String ele : securityGroups) {
            this.securityGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The AWS security groups to associate with the elastic network interfaces in order to specify who can connect to
     * and communicate with the Amazon MSK cluster.
     * </p>
     * 
     * @param securityGroups
     *        The AWS security groups to associate with the elastic network interfaces in order to specify who can
     *        connect to and communicate with the Amazon MSK cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerNodeGroupInfo withSecurityGroups(java.util.Collection<String> securityGroups) {
        setSecurityGroups(securityGroups);
        return this;
    }

    /**
     * <p>
     * Contains information about storage volumes attached to MSK broker nodes.
     * </p>
     * 
     * @param storageInfo
     *        Contains information about storage volumes attached to MSK broker nodes.
     */

    public void setStorageInfo(StorageInfo storageInfo) {
        this.storageInfo = storageInfo;
    }

    /**
     * <p>
     * Contains information about storage volumes attached to MSK broker nodes.
     * </p>
     * 
     * @return Contains information about storage volumes attached to MSK broker nodes.
     */

    public StorageInfo getStorageInfo() {
        return this.storageInfo;
    }

    /**
     * <p>
     * Contains information about storage volumes attached to MSK broker nodes.
     * </p>
     * 
     * @param storageInfo
     *        Contains information about storage volumes attached to MSK broker nodes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BrokerNodeGroupInfo withStorageInfo(StorageInfo storageInfo) {
        setStorageInfo(storageInfo);
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
        if (getBrokerAZDistribution() != null)
            sb.append("BrokerAZDistribution: ").append(getBrokerAZDistribution()).append(",");
        if (getClientSubnets() != null)
            sb.append("ClientSubnets: ").append(getClientSubnets()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getSecurityGroups() != null)
            sb.append("SecurityGroups: ").append(getSecurityGroups()).append(",");
        if (getStorageInfo() != null)
            sb.append("StorageInfo: ").append(getStorageInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BrokerNodeGroupInfo == false)
            return false;
        BrokerNodeGroupInfo other = (BrokerNodeGroupInfo) obj;
        if (other.getBrokerAZDistribution() == null ^ this.getBrokerAZDistribution() == null)
            return false;
        if (other.getBrokerAZDistribution() != null && other.getBrokerAZDistribution().equals(this.getBrokerAZDistribution()) == false)
            return false;
        if (other.getClientSubnets() == null ^ this.getClientSubnets() == null)
            return false;
        if (other.getClientSubnets() != null && other.getClientSubnets().equals(this.getClientSubnets()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getSecurityGroups() == null ^ this.getSecurityGroups() == null)
            return false;
        if (other.getSecurityGroups() != null && other.getSecurityGroups().equals(this.getSecurityGroups()) == false)
            return false;
        if (other.getStorageInfo() == null ^ this.getStorageInfo() == null)
            return false;
        if (other.getStorageInfo() != null && other.getStorageInfo().equals(this.getStorageInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBrokerAZDistribution() == null) ? 0 : getBrokerAZDistribution().hashCode());
        hashCode = prime * hashCode + ((getClientSubnets() == null) ? 0 : getClientSubnets().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getSecurityGroups() == null) ? 0 : getSecurityGroups().hashCode());
        hashCode = prime * hashCode + ((getStorageInfo() == null) ? 0 : getStorageInfo().hashCode());
        return hashCode;
    }

    @Override
    public BrokerNodeGroupInfo clone() {
        try {
            return (BrokerNodeGroupInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kafka.model.transform.BrokerNodeGroupInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
