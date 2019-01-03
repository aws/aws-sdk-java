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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration defining a new instance group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceGroupConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceGroupConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Friendly name given to the instance group.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     */
    private String market;
    /**
     * <p>
     * The role of the instance group in the cluster.
     * </p>
     */
    private String instanceRole;
    /**
     * <p>
     * The maximum Spot price your are willing to pay for EC2 instances.
     * </p>
     * <p>
     * An optional, nullable field that applies if the <code>MarketType</code> for the instance group is specified as
     * <code>SPOT</code>. Specify the maximum spot price in USD. If the value is NULL and <code>SPOT</code> is
     * specified, the maximum Spot price is set equal to the On-Demand price.
     * </p>
     */
    private String bidPrice;
    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * Target number of instances for the instance group.
     * </p>
     */
    private Integer instanceCount;
    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration
     * for each instance group (master, core, and task).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Configuration> configurations;
    /**
     * <p>
     * EBS configurations that will be attached to each EC2 instance in the instance group.
     * </p>
     */
    private EbsConfiguration ebsConfiguration;
    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The
     * automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response
     * to the value of a CloudWatch metric. See <a>PutAutoScalingPolicy</a>.
     * </p>
     */
    private AutoScalingPolicy autoScalingPolicy;

    /**
     * Default constructor for InstanceGroupConfig object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public InstanceGroupConfig() {
    }

    /**
     * Constructs a new InstanceGroupConfig object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceRole
     *        The role of the instance group in the cluster.
     * @param instanceType
     *        The EC2 instance type for all instances in the instance group.
     * @param instanceCount
     *        Target number of instances for the instance group.
     */
    public InstanceGroupConfig(String instanceRole, String instanceType, Integer instanceCount) {
        setInstanceRole(instanceRole);
        setInstanceType(instanceType);
        setInstanceCount(instanceCount);
    }

    /**
     * Constructs a new InstanceGroupConfig object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param instanceRole
     *        The role of the instance group in the cluster.
     * @param instanceType
     *        The EC2 instance type for all instances in the instance group.
     * @param instanceCount
     *        Target number of instances for the instance group.
     */
    public InstanceGroupConfig(InstanceRoleType instanceRole, String instanceType, Integer instanceCount) {
        setInstanceRole(instanceRole.toString());
        setInstanceType(instanceType);
        setInstanceCount(instanceCount);
    }

    /**
     * <p>
     * Friendly name given to the instance group.
     * </p>
     * 
     * @param name
     *        Friendly name given to the instance group.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Friendly name given to the instance group.
     * </p>
     * 
     * @return Friendly name given to the instance group.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Friendly name given to the instance group.
     * </p>
     * 
     * @param name
     *        Friendly name given to the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupConfig withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * 
     * @param market
     *        Market type of the EC2 instances used to create a cluster node.
     * @see MarketType
     */

    public void setMarket(String market) {
        this.market = market;
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * 
     * @return Market type of the EC2 instances used to create a cluster node.
     * @see MarketType
     */

    public String getMarket() {
        return this.market;
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * 
     * @param market
     *        Market type of the EC2 instances used to create a cluster node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketType
     */

    public InstanceGroupConfig withMarket(String market) {
        setMarket(market);
        return this;
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * 
     * @param market
     *        Market type of the EC2 instances used to create a cluster node.
     * @see MarketType
     */

    public void setMarket(MarketType market) {
        withMarket(market);
    }

    /**
     * <p>
     * Market type of the EC2 instances used to create a cluster node.
     * </p>
     * 
     * @param market
     *        Market type of the EC2 instances used to create a cluster node.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MarketType
     */

    public InstanceGroupConfig withMarket(MarketType market) {
        this.market = market.toString();
        return this;
    }

    /**
     * <p>
     * The role of the instance group in the cluster.
     * </p>
     * 
     * @param instanceRole
     *        The role of the instance group in the cluster.
     * @see InstanceRoleType
     */

    public void setInstanceRole(String instanceRole) {
        this.instanceRole = instanceRole;
    }

    /**
     * <p>
     * The role of the instance group in the cluster.
     * </p>
     * 
     * @return The role of the instance group in the cluster.
     * @see InstanceRoleType
     */

    public String getInstanceRole() {
        return this.instanceRole;
    }

    /**
     * <p>
     * The role of the instance group in the cluster.
     * </p>
     * 
     * @param instanceRole
     *        The role of the instance group in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceRoleType
     */

    public InstanceGroupConfig withInstanceRole(String instanceRole) {
        setInstanceRole(instanceRole);
        return this;
    }

    /**
     * <p>
     * The role of the instance group in the cluster.
     * </p>
     * 
     * @param instanceRole
     *        The role of the instance group in the cluster.
     * @see InstanceRoleType
     */

    public void setInstanceRole(InstanceRoleType instanceRole) {
        withInstanceRole(instanceRole);
    }

    /**
     * <p>
     * The role of the instance group in the cluster.
     * </p>
     * 
     * @param instanceRole
     *        The role of the instance group in the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceRoleType
     */

    public InstanceGroupConfig withInstanceRole(InstanceRoleType instanceRole) {
        this.instanceRole = instanceRole.toString();
        return this;
    }

    /**
     * <p>
     * The maximum Spot price your are willing to pay for EC2 instances.
     * </p>
     * <p>
     * An optional, nullable field that applies if the <code>MarketType</code> for the instance group is specified as
     * <code>SPOT</code>. Specify the maximum spot price in USD. If the value is NULL and <code>SPOT</code> is
     * specified, the maximum Spot price is set equal to the On-Demand price.
     * </p>
     * 
     * @param bidPrice
     *        The maximum Spot price your are willing to pay for EC2 instances.</p>
     *        <p>
     *        An optional, nullable field that applies if the <code>MarketType</code> for the instance group is
     *        specified as <code>SPOT</code>. Specify the maximum spot price in USD. If the value is NULL and
     *        <code>SPOT</code> is specified, the maximum Spot price is set equal to the On-Demand price.
     */

    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * <p>
     * The maximum Spot price your are willing to pay for EC2 instances.
     * </p>
     * <p>
     * An optional, nullable field that applies if the <code>MarketType</code> for the instance group is specified as
     * <code>SPOT</code>. Specify the maximum spot price in USD. If the value is NULL and <code>SPOT</code> is
     * specified, the maximum Spot price is set equal to the On-Demand price.
     * </p>
     * 
     * @return The maximum Spot price your are willing to pay for EC2 instances.</p>
     *         <p>
     *         An optional, nullable field that applies if the <code>MarketType</code> for the instance group is
     *         specified as <code>SPOT</code>. Specify the maximum spot price in USD. If the value is NULL and
     *         <code>SPOT</code> is specified, the maximum Spot price is set equal to the On-Demand price.
     */

    public String getBidPrice() {
        return this.bidPrice;
    }

    /**
     * <p>
     * The maximum Spot price your are willing to pay for EC2 instances.
     * </p>
     * <p>
     * An optional, nullable field that applies if the <code>MarketType</code> for the instance group is specified as
     * <code>SPOT</code>. Specify the maximum spot price in USD. If the value is NULL and <code>SPOT</code> is
     * specified, the maximum Spot price is set equal to the On-Demand price.
     * </p>
     * 
     * @param bidPrice
     *        The maximum Spot price your are willing to pay for EC2 instances.</p>
     *        <p>
     *        An optional, nullable field that applies if the <code>MarketType</code> for the instance group is
     *        specified as <code>SPOT</code>. Specify the maximum spot price in USD. If the value is NULL and
     *        <code>SPOT</code> is specified, the maximum Spot price is set equal to the On-Demand price.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupConfig withBidPrice(String bidPrice) {
        setBidPrice(bidPrice);
        return this;
    }

    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type for all instances in the instance group.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     * 
     * @return The EC2 instance type for all instances in the instance group.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The EC2 instance type for all instances in the instance group.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type for all instances in the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupConfig withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * Target number of instances for the instance group.
     * </p>
     * 
     * @param instanceCount
     *        Target number of instances for the instance group.
     */

    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }

    /**
     * <p>
     * Target number of instances for the instance group.
     * </p>
     * 
     * @return Target number of instances for the instance group.
     */

    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    /**
     * <p>
     * Target number of instances for the instance group.
     * </p>
     * 
     * @param instanceCount
     *        Target number of instances for the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupConfig withInstanceCount(Integer instanceCount) {
        setInstanceCount(instanceCount);
        return this;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration
     * for each instance group (master, core, and task).
     * </p>
     * 
     * @return <p>
     *         Amazon EMR releases 4.x or later.
     *         </p>
     *         </note>
     *         <p>
     *         The list of configurations supplied for an EMR cluster instance group. You can specify a separate
     *         configuration for each instance group (master, core, and task).
     */

    public java.util.List<Configuration> getConfigurations() {
        if (configurations == null) {
            configurations = new com.amazonaws.internal.SdkInternalList<Configuration>();
        }
        return configurations;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration
     * for each instance group (master, core, and task).
     * </p>
     * 
     * @param configurations
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        The list of configurations supplied for an EMR cluster instance group. You can specify a separate
     *        configuration for each instance group (master, core, and task).
     */

    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new com.amazonaws.internal.SdkInternalList<Configuration>(configurations);
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration
     * for each instance group (master, core, and task).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurations(java.util.Collection)} or {@link #withConfigurations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configurations
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        The list of configurations supplied for an EMR cluster instance group. You can specify a separate
     *        configuration for each instance group (master, core, and task).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupConfig withConfigurations(Configuration... configurations) {
        if (this.configurations == null) {
            setConfigurations(new com.amazonaws.internal.SdkInternalList<Configuration>(configurations.length));
        }
        for (Configuration ele : configurations) {
            this.configurations.add(ele);
        }
        return this;
    }

    /**
     * <note>
     * <p>
     * Amazon EMR releases 4.x or later.
     * </p>
     * </note>
     * <p>
     * The list of configurations supplied for an EMR cluster instance group. You can specify a separate configuration
     * for each instance group (master, core, and task).
     * </p>
     * 
     * @param configurations
     *        <p>
     *        Amazon EMR releases 4.x or later.
     *        </p>
     *        </note>
     *        <p>
     *        The list of configurations supplied for an EMR cluster instance group. You can specify a separate
     *        configuration for each instance group (master, core, and task).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupConfig withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
    }

    /**
     * <p>
     * EBS configurations that will be attached to each EC2 instance in the instance group.
     * </p>
     * 
     * @param ebsConfiguration
     *        EBS configurations that will be attached to each EC2 instance in the instance group.
     */

    public void setEbsConfiguration(EbsConfiguration ebsConfiguration) {
        this.ebsConfiguration = ebsConfiguration;
    }

    /**
     * <p>
     * EBS configurations that will be attached to each EC2 instance in the instance group.
     * </p>
     * 
     * @return EBS configurations that will be attached to each EC2 instance in the instance group.
     */

    public EbsConfiguration getEbsConfiguration() {
        return this.ebsConfiguration;
    }

    /**
     * <p>
     * EBS configurations that will be attached to each EC2 instance in the instance group.
     * </p>
     * 
     * @param ebsConfiguration
     *        EBS configurations that will be attached to each EC2 instance in the instance group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupConfig withEbsConfiguration(EbsConfiguration ebsConfiguration) {
        setEbsConfiguration(ebsConfiguration);
        return this;
    }

    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The
     * automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response
     * to the value of a CloudWatch metric. See <a>PutAutoScalingPolicy</a>.
     * </p>
     * 
     * @param autoScalingPolicy
     *        An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The
     *        automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in
     *        response to the value of a CloudWatch metric. See <a>PutAutoScalingPolicy</a>.
     */

    public void setAutoScalingPolicy(AutoScalingPolicy autoScalingPolicy) {
        this.autoScalingPolicy = autoScalingPolicy;
    }

    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The
     * automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response
     * to the value of a CloudWatch metric. See <a>PutAutoScalingPolicy</a>.
     * </p>
     * 
     * @return An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster.
     *         The automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances
     *         in response to the value of a CloudWatch metric. See <a>PutAutoScalingPolicy</a>.
     */

    public AutoScalingPolicy getAutoScalingPolicy() {
        return this.autoScalingPolicy;
    }

    /**
     * <p>
     * An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The
     * automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in response
     * to the value of a CloudWatch metric. See <a>PutAutoScalingPolicy</a>.
     * </p>
     * 
     * @param autoScalingPolicy
     *        An automatic scaling policy for a core instance group or task instance group in an Amazon EMR cluster. The
     *        automatic scaling policy defines how an instance group dynamically adds and terminates EC2 instances in
     *        response to the value of a CloudWatch metric. See <a>PutAutoScalingPolicy</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceGroupConfig withAutoScalingPolicy(AutoScalingPolicy autoScalingPolicy) {
        setAutoScalingPolicy(autoScalingPolicy);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getMarket() != null)
            sb.append("Market: ").append(getMarket()).append(",");
        if (getInstanceRole() != null)
            sb.append("InstanceRole: ").append(getInstanceRole()).append(",");
        if (getBidPrice() != null)
            sb.append("BidPrice: ").append(getBidPrice()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getInstanceCount() != null)
            sb.append("InstanceCount: ").append(getInstanceCount()).append(",");
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations()).append(",");
        if (getEbsConfiguration() != null)
            sb.append("EbsConfiguration: ").append(getEbsConfiguration()).append(",");
        if (getAutoScalingPolicy() != null)
            sb.append("AutoScalingPolicy: ").append(getAutoScalingPolicy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceGroupConfig == false)
            return false;
        InstanceGroupConfig other = (InstanceGroupConfig) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getMarket() == null ^ this.getMarket() == null)
            return false;
        if (other.getMarket() != null && other.getMarket().equals(this.getMarket()) == false)
            return false;
        if (other.getInstanceRole() == null ^ this.getInstanceRole() == null)
            return false;
        if (other.getInstanceRole() != null && other.getInstanceRole().equals(this.getInstanceRole()) == false)
            return false;
        if (other.getBidPrice() == null ^ this.getBidPrice() == null)
            return false;
        if (other.getBidPrice() != null && other.getBidPrice().equals(this.getBidPrice()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getInstanceCount() == null ^ this.getInstanceCount() == null)
            return false;
        if (other.getInstanceCount() != null && other.getInstanceCount().equals(this.getInstanceCount()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getEbsConfiguration() == null ^ this.getEbsConfiguration() == null)
            return false;
        if (other.getEbsConfiguration() != null && other.getEbsConfiguration().equals(this.getEbsConfiguration()) == false)
            return false;
        if (other.getAutoScalingPolicy() == null ^ this.getAutoScalingPolicy() == null)
            return false;
        if (other.getAutoScalingPolicy() != null && other.getAutoScalingPolicy().equals(this.getAutoScalingPolicy()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getMarket() == null) ? 0 : getMarket().hashCode());
        hashCode = prime * hashCode + ((getInstanceRole() == null) ? 0 : getInstanceRole().hashCode());
        hashCode = prime * hashCode + ((getBidPrice() == null) ? 0 : getBidPrice().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getInstanceCount() == null) ? 0 : getInstanceCount().hashCode());
        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime * hashCode + ((getEbsConfiguration() == null) ? 0 : getEbsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingPolicy() == null) ? 0 : getAutoScalingPolicy().hashCode());
        return hashCode;
    }

    @Override
    public InstanceGroupConfig clone() {
        try {
            return (InstanceGroupConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceGroupConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
