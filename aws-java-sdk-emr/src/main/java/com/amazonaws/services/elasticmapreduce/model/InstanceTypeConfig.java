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
 * An instance type configuration for each instance type in an instance fleet, which determines the EC2 instances Amazon
 * EMR attempts to provision to fulfill On-Demand and Spot target capacities. There can be a maximum of 5 instance type
 * configurations in a fleet.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceTypeConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceTypeConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An EC2 instance type, such as <code>m3.xlarge</code>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities
     * defined in <a>InstanceFleetConfig</a>. This value is 1 for a master instance fleet, and must be 1 or greater for
     * core and task instance fleets. Defaults to 1 if not specified.
     * </p>
     */
    private Integer weightedCapacity;
    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by <code>InstanceType</code>. Expressed in USD. If
     * neither <code>BidPrice</code> nor <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     */
    private String bidPrice;
    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by
     * <code>InstanceType</code>. Expressed as a number (for example, 20 specifies 20%). If neither
     * <code>BidPrice</code> nor <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     */
    private Double bidPriceAsPercentageOfOnDemandPrice;
    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by
     * <code>InstanceType</code>.
     * </p>
     */
    private EbsConfiguration ebsConfiguration;
    /**
     * <p>
     * A configuration classification that applies when provisioning cluster instances, which can include configurations
     * for applications and software that run on the cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Configuration> configurations;

    /**
     * <p>
     * An EC2 instance type, such as <code>m3.xlarge</code>.
     * </p>
     * 
     * @param instanceType
     *        An EC2 instance type, such as <code>m3.xlarge</code>.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * An EC2 instance type, such as <code>m3.xlarge</code>.
     * </p>
     * 
     * @return An EC2 instance type, such as <code>m3.xlarge</code>.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * An EC2 instance type, such as <code>m3.xlarge</code>.
     * </p>
     * 
     * @param instanceType
     *        An EC2 instance type, such as <code>m3.xlarge</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeConfig withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities
     * defined in <a>InstanceFleetConfig</a>. This value is 1 for a master instance fleet, and must be 1 or greater for
     * core and task instance fleets. Defaults to 1 if not specified.
     * </p>
     * 
     * @param weightedCapacity
     *        The number of units that a provisioned instance of this type provides toward fulfilling the target
     *        capacities defined in <a>InstanceFleetConfig</a>. This value is 1 for a master instance fleet, and must be
     *        1 or greater for core and task instance fleets. Defaults to 1 if not specified.
     */

    public void setWeightedCapacity(Integer weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * <p>
     * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities
     * defined in <a>InstanceFleetConfig</a>. This value is 1 for a master instance fleet, and must be 1 or greater for
     * core and task instance fleets. Defaults to 1 if not specified.
     * </p>
     * 
     * @return The number of units that a provisioned instance of this type provides toward fulfilling the target
     *         capacities defined in <a>InstanceFleetConfig</a>. This value is 1 for a master instance fleet, and must
     *         be 1 or greater for core and task instance fleets. Defaults to 1 if not specified.
     */

    public Integer getWeightedCapacity() {
        return this.weightedCapacity;
    }

    /**
     * <p>
     * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities
     * defined in <a>InstanceFleetConfig</a>. This value is 1 for a master instance fleet, and must be 1 or greater for
     * core and task instance fleets. Defaults to 1 if not specified.
     * </p>
     * 
     * @param weightedCapacity
     *        The number of units that a provisioned instance of this type provides toward fulfilling the target
     *        capacities defined in <a>InstanceFleetConfig</a>. This value is 1 for a master instance fleet, and must be
     *        1 or greater for core and task instance fleets. Defaults to 1 if not specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeConfig withWeightedCapacity(Integer weightedCapacity) {
        setWeightedCapacity(weightedCapacity);
        return this;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by <code>InstanceType</code>. Expressed in USD. If
     * neither <code>BidPrice</code> nor <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     * 
     * @param bidPrice
     *        The bid price for each EC2 Spot instance type as defined by <code>InstanceType</code>. Expressed in USD.
     *        If neither <code>BidPrice</code> nor <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *        <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     */

    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by <code>InstanceType</code>. Expressed in USD. If
     * neither <code>BidPrice</code> nor <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     * 
     * @return The bid price for each EC2 Spot instance type as defined by <code>InstanceType</code>. Expressed in USD.
     *         If neither <code>BidPrice</code> nor <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *         <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     */

    public String getBidPrice() {
        return this.bidPrice;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by <code>InstanceType</code>. Expressed in USD. If
     * neither <code>BidPrice</code> nor <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     * 
     * @param bidPrice
     *        The bid price for each EC2 Spot instance type as defined by <code>InstanceType</code>. Expressed in USD.
     *        If neither <code>BidPrice</code> nor <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *        <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeConfig withBidPrice(String bidPrice) {
        setBidPrice(bidPrice);
        return this;
    }

    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by
     * <code>InstanceType</code>. Expressed as a number (for example, 20 specifies 20%). If neither
     * <code>BidPrice</code> nor <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     * 
     * @param bidPriceAsPercentageOfOnDemandPrice
     *        The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by
     *        <code>InstanceType</code>. Expressed as a number (for example, 20 specifies 20%). If neither
     *        <code>BidPrice</code> nor <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *        <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     */

    public void setBidPriceAsPercentageOfOnDemandPrice(Double bidPriceAsPercentageOfOnDemandPrice) {
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
    }

    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by
     * <code>InstanceType</code>. Expressed as a number (for example, 20 specifies 20%). If neither
     * <code>BidPrice</code> nor <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     * 
     * @return The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by
     *         <code>InstanceType</code>. Expressed as a number (for example, 20 specifies 20%). If neither
     *         <code>BidPrice</code> nor <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *         <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     */

    public Double getBidPriceAsPercentageOfOnDemandPrice() {
        return this.bidPriceAsPercentageOfOnDemandPrice;
    }

    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by
     * <code>InstanceType</code>. Expressed as a number (for example, 20 specifies 20%). If neither
     * <code>BidPrice</code> nor <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     * <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * </p>
     * 
     * @param bidPriceAsPercentageOfOnDemandPrice
     *        The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by
     *        <code>InstanceType</code>. Expressed as a number (for example, 20 specifies 20%). If neither
     *        <code>BidPrice</code> nor <code>BidPriceAsPercentageOfOnDemandPrice</code> is provided,
     *        <code>BidPriceAsPercentageOfOnDemandPrice</code> defaults to 100%.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeConfig withBidPriceAsPercentageOfOnDemandPrice(Double bidPriceAsPercentageOfOnDemandPrice) {
        setBidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice);
        return this;
    }

    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by
     * <code>InstanceType</code>.
     * </p>
     * 
     * @param ebsConfiguration
     *        The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by
     *        <code>InstanceType</code>.
     */

    public void setEbsConfiguration(EbsConfiguration ebsConfiguration) {
        this.ebsConfiguration = ebsConfiguration;
    }

    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by
     * <code>InstanceType</code>.
     * </p>
     * 
     * @return The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by
     *         <code>InstanceType</code>.
     */

    public EbsConfiguration getEbsConfiguration() {
        return this.ebsConfiguration;
    }

    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by
     * <code>InstanceType</code>.
     * </p>
     * 
     * @param ebsConfiguration
     *        The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by
     *        <code>InstanceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeConfig withEbsConfiguration(EbsConfiguration ebsConfiguration) {
        setEbsConfiguration(ebsConfiguration);
        return this;
    }

    /**
     * <p>
     * A configuration classification that applies when provisioning cluster instances, which can include configurations
     * for applications and software that run on the cluster.
     * </p>
     * 
     * @return A configuration classification that applies when provisioning cluster instances, which can include
     *         configurations for applications and software that run on the cluster.
     */

    public java.util.List<Configuration> getConfigurations() {
        if (configurations == null) {
            configurations = new com.amazonaws.internal.SdkInternalList<Configuration>();
        }
        return configurations;
    }

    /**
     * <p>
     * A configuration classification that applies when provisioning cluster instances, which can include configurations
     * for applications and software that run on the cluster.
     * </p>
     * 
     * @param configurations
     *        A configuration classification that applies when provisioning cluster instances, which can include
     *        configurations for applications and software that run on the cluster.
     */

    public void setConfigurations(java.util.Collection<Configuration> configurations) {
        if (configurations == null) {
            this.configurations = null;
            return;
        }

        this.configurations = new com.amazonaws.internal.SdkInternalList<Configuration>(configurations);
    }

    /**
     * <p>
     * A configuration classification that applies when provisioning cluster instances, which can include configurations
     * for applications and software that run on the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurations(java.util.Collection)} or {@link #withConfigurations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configurations
     *        A configuration classification that applies when provisioning cluster instances, which can include
     *        configurations for applications and software that run on the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeConfig withConfigurations(Configuration... configurations) {
        if (this.configurations == null) {
            setConfigurations(new com.amazonaws.internal.SdkInternalList<Configuration>(configurations.length));
        }
        for (Configuration ele : configurations) {
            this.configurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A configuration classification that applies when provisioning cluster instances, which can include configurations
     * for applications and software that run on the cluster.
     * </p>
     * 
     * @param configurations
     *        A configuration classification that applies when provisioning cluster instances, which can include
     *        configurations for applications and software that run on the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeConfig withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
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
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getWeightedCapacity() != null)
            sb.append("WeightedCapacity: ").append(getWeightedCapacity()).append(",");
        if (getBidPrice() != null)
            sb.append("BidPrice: ").append(getBidPrice()).append(",");
        if (getBidPriceAsPercentageOfOnDemandPrice() != null)
            sb.append("BidPriceAsPercentageOfOnDemandPrice: ").append(getBidPriceAsPercentageOfOnDemandPrice()).append(",");
        if (getEbsConfiguration() != null)
            sb.append("EbsConfiguration: ").append(getEbsConfiguration()).append(",");
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceTypeConfig == false)
            return false;
        InstanceTypeConfig other = (InstanceTypeConfig) obj;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getWeightedCapacity() == null ^ this.getWeightedCapacity() == null)
            return false;
        if (other.getWeightedCapacity() != null && other.getWeightedCapacity().equals(this.getWeightedCapacity()) == false)
            return false;
        if (other.getBidPrice() == null ^ this.getBidPrice() == null)
            return false;
        if (other.getBidPrice() != null && other.getBidPrice().equals(this.getBidPrice()) == false)
            return false;
        if (other.getBidPriceAsPercentageOfOnDemandPrice() == null ^ this.getBidPriceAsPercentageOfOnDemandPrice() == null)
            return false;
        if (other.getBidPriceAsPercentageOfOnDemandPrice() != null
                && other.getBidPriceAsPercentageOfOnDemandPrice().equals(this.getBidPriceAsPercentageOfOnDemandPrice()) == false)
            return false;
        if (other.getEbsConfiguration() == null ^ this.getEbsConfiguration() == null)
            return false;
        if (other.getEbsConfiguration() != null && other.getEbsConfiguration().equals(this.getEbsConfiguration()) == false)
            return false;
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getWeightedCapacity() == null) ? 0 : getWeightedCapacity().hashCode());
        hashCode = prime * hashCode + ((getBidPrice() == null) ? 0 : getBidPrice().hashCode());
        hashCode = prime * hashCode + ((getBidPriceAsPercentageOfOnDemandPrice() == null) ? 0 : getBidPriceAsPercentageOfOnDemandPrice().hashCode());
        hashCode = prime * hashCode + ((getEbsConfiguration() == null) ? 0 : getEbsConfiguration().hashCode());
        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        return hashCode;
    }

    @Override
    public InstanceTypeConfig clone() {
        try {
            return (InstanceTypeConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceTypeConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
