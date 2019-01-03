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
 * The configuration specification for each instance type in an instance fleet.
 * </p>
 * <note>
 * <p>
 * The instance fleet configuration is available only in Amazon EMR versions 4.8.0 and later, excluding 5.0.x versions.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/InstanceTypeSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceTypeSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities
     * defined in <a>InstanceFleetConfig</a>. Capacity values represent performance characteristics such as vCPUs,
     * memory, or I/O. If not specified, the default value is 1.
     * </p>
     */
    private Integer weightedCapacity;
    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by <code>InstanceType</code>. Expressed in USD.
     * </p>
     */
    private String bidPrice;
    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by
     * <code>InstanceType</code>. Expressed as a number (for example, 20 specifies 20%).
     * </p>
     */
    private Double bidPriceAsPercentageOfOnDemandPrice;
    /**
     * <p>
     * A configuration classification that applies when provisioning cluster instances, which can include configurations
     * for applications and software bundled with Amazon EMR.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Configuration> configurations;
    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by
     * <code>InstanceType</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EbsBlockDevice> ebsBlockDevices;
    /**
     * <p>
     * Evaluates to <code>TRUE</code> when the specified <code>InstanceType</code> is EBS-optimized.
     * </p>
     */
    private Boolean ebsOptimized;

    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type, for example <code>m3.xlarge</code>.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     * 
     * @return The EC2 instance type, for example <code>m3.xlarge</code>.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The EC2 instance type, for example <code>m3.xlarge</code>.
     * </p>
     * 
     * @param instanceType
     *        The EC2 instance type, for example <code>m3.xlarge</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeSpecification withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities
     * defined in <a>InstanceFleetConfig</a>. Capacity values represent performance characteristics such as vCPUs,
     * memory, or I/O. If not specified, the default value is 1.
     * </p>
     * 
     * @param weightedCapacity
     *        The number of units that a provisioned instance of this type provides toward fulfilling the target
     *        capacities defined in <a>InstanceFleetConfig</a>. Capacity values represent performance characteristics
     *        such as vCPUs, memory, or I/O. If not specified, the default value is 1.
     */

    public void setWeightedCapacity(Integer weightedCapacity) {
        this.weightedCapacity = weightedCapacity;
    }

    /**
     * <p>
     * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities
     * defined in <a>InstanceFleetConfig</a>. Capacity values represent performance characteristics such as vCPUs,
     * memory, or I/O. If not specified, the default value is 1.
     * </p>
     * 
     * @return The number of units that a provisioned instance of this type provides toward fulfilling the target
     *         capacities defined in <a>InstanceFleetConfig</a>. Capacity values represent performance characteristics
     *         such as vCPUs, memory, or I/O. If not specified, the default value is 1.
     */

    public Integer getWeightedCapacity() {
        return this.weightedCapacity;
    }

    /**
     * <p>
     * The number of units that a provisioned instance of this type provides toward fulfilling the target capacities
     * defined in <a>InstanceFleetConfig</a>. Capacity values represent performance characteristics such as vCPUs,
     * memory, or I/O. If not specified, the default value is 1.
     * </p>
     * 
     * @param weightedCapacity
     *        The number of units that a provisioned instance of this type provides toward fulfilling the target
     *        capacities defined in <a>InstanceFleetConfig</a>. Capacity values represent performance characteristics
     *        such as vCPUs, memory, or I/O. If not specified, the default value is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeSpecification withWeightedCapacity(Integer weightedCapacity) {
        setWeightedCapacity(weightedCapacity);
        return this;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by <code>InstanceType</code>. Expressed in USD.
     * </p>
     * 
     * @param bidPrice
     *        The bid price for each EC2 Spot instance type as defined by <code>InstanceType</code>. Expressed in USD.
     */

    public void setBidPrice(String bidPrice) {
        this.bidPrice = bidPrice;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by <code>InstanceType</code>. Expressed in USD.
     * </p>
     * 
     * @return The bid price for each EC2 Spot instance type as defined by <code>InstanceType</code>. Expressed in USD.
     */

    public String getBidPrice() {
        return this.bidPrice;
    }

    /**
     * <p>
     * The bid price for each EC2 Spot instance type as defined by <code>InstanceType</code>. Expressed in USD.
     * </p>
     * 
     * @param bidPrice
     *        The bid price for each EC2 Spot instance type as defined by <code>InstanceType</code>. Expressed in USD.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeSpecification withBidPrice(String bidPrice) {
        setBidPrice(bidPrice);
        return this;
    }

    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by
     * <code>InstanceType</code>. Expressed as a number (for example, 20 specifies 20%).
     * </p>
     * 
     * @param bidPriceAsPercentageOfOnDemandPrice
     *        The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by
     *        <code>InstanceType</code>. Expressed as a number (for example, 20 specifies 20%).
     */

    public void setBidPriceAsPercentageOfOnDemandPrice(Double bidPriceAsPercentageOfOnDemandPrice) {
        this.bidPriceAsPercentageOfOnDemandPrice = bidPriceAsPercentageOfOnDemandPrice;
    }

    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by
     * <code>InstanceType</code>. Expressed as a number (for example, 20 specifies 20%).
     * </p>
     * 
     * @return The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by
     *         <code>InstanceType</code>. Expressed as a number (for example, 20 specifies 20%).
     */

    public Double getBidPriceAsPercentageOfOnDemandPrice() {
        return this.bidPriceAsPercentageOfOnDemandPrice;
    }

    /**
     * <p>
     * The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by
     * <code>InstanceType</code>. Expressed as a number (for example, 20 specifies 20%).
     * </p>
     * 
     * @param bidPriceAsPercentageOfOnDemandPrice
     *        The bid price, as a percentage of On-Demand price, for each EC2 Spot instance as defined by
     *        <code>InstanceType</code>. Expressed as a number (for example, 20 specifies 20%).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeSpecification withBidPriceAsPercentageOfOnDemandPrice(Double bidPriceAsPercentageOfOnDemandPrice) {
        setBidPriceAsPercentageOfOnDemandPrice(bidPriceAsPercentageOfOnDemandPrice);
        return this;
    }

    /**
     * <p>
     * A configuration classification that applies when provisioning cluster instances, which can include configurations
     * for applications and software bundled with Amazon EMR.
     * </p>
     * 
     * @return A configuration classification that applies when provisioning cluster instances, which can include
     *         configurations for applications and software bundled with Amazon EMR.
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
     * for applications and software bundled with Amazon EMR.
     * </p>
     * 
     * @param configurations
     *        A configuration classification that applies when provisioning cluster instances, which can include
     *        configurations for applications and software bundled with Amazon EMR.
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
     * for applications and software bundled with Amazon EMR.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConfigurations(java.util.Collection)} or {@link #withConfigurations(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param configurations
     *        A configuration classification that applies when provisioning cluster instances, which can include
     *        configurations for applications and software bundled with Amazon EMR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeSpecification withConfigurations(Configuration... configurations) {
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
     * for applications and software bundled with Amazon EMR.
     * </p>
     * 
     * @param configurations
     *        A configuration classification that applies when provisioning cluster instances, which can include
     *        configurations for applications and software bundled with Amazon EMR.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeSpecification withConfigurations(java.util.Collection<Configuration> configurations) {
        setConfigurations(configurations);
        return this;
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

    public java.util.List<EbsBlockDevice> getEbsBlockDevices() {
        if (ebsBlockDevices == null) {
            ebsBlockDevices = new com.amazonaws.internal.SdkInternalList<EbsBlockDevice>();
        }
        return ebsBlockDevices;
    }

    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by
     * <code>InstanceType</code>.
     * </p>
     * 
     * @param ebsBlockDevices
     *        The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by
     *        <code>InstanceType</code>.
     */

    public void setEbsBlockDevices(java.util.Collection<EbsBlockDevice> ebsBlockDevices) {
        if (ebsBlockDevices == null) {
            this.ebsBlockDevices = null;
            return;
        }

        this.ebsBlockDevices = new com.amazonaws.internal.SdkInternalList<EbsBlockDevice>(ebsBlockDevices);
    }

    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by
     * <code>InstanceType</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEbsBlockDevices(java.util.Collection)} or {@link #withEbsBlockDevices(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param ebsBlockDevices
     *        The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by
     *        <code>InstanceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeSpecification withEbsBlockDevices(EbsBlockDevice... ebsBlockDevices) {
        if (this.ebsBlockDevices == null) {
            setEbsBlockDevices(new com.amazonaws.internal.SdkInternalList<EbsBlockDevice>(ebsBlockDevices.length));
        }
        for (EbsBlockDevice ele : ebsBlockDevices) {
            this.ebsBlockDevices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by
     * <code>InstanceType</code>.
     * </p>
     * 
     * @param ebsBlockDevices
     *        The configuration of Amazon Elastic Block Storage (EBS) attached to each instance as defined by
     *        <code>InstanceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeSpecification withEbsBlockDevices(java.util.Collection<EbsBlockDevice> ebsBlockDevices) {
        setEbsBlockDevices(ebsBlockDevices);
        return this;
    }

    /**
     * <p>
     * Evaluates to <code>TRUE</code> when the specified <code>InstanceType</code> is EBS-optimized.
     * </p>
     * 
     * @param ebsOptimized
     *        Evaluates to <code>TRUE</code> when the specified <code>InstanceType</code> is EBS-optimized.
     */

    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }

    /**
     * <p>
     * Evaluates to <code>TRUE</code> when the specified <code>InstanceType</code> is EBS-optimized.
     * </p>
     * 
     * @return Evaluates to <code>TRUE</code> when the specified <code>InstanceType</code> is EBS-optimized.
     */

    public Boolean getEbsOptimized() {
        return this.ebsOptimized;
    }

    /**
     * <p>
     * Evaluates to <code>TRUE</code> when the specified <code>InstanceType</code> is EBS-optimized.
     * </p>
     * 
     * @param ebsOptimized
     *        Evaluates to <code>TRUE</code> when the specified <code>InstanceType</code> is EBS-optimized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceTypeSpecification withEbsOptimized(Boolean ebsOptimized) {
        setEbsOptimized(ebsOptimized);
        return this;
    }

    /**
     * <p>
     * Evaluates to <code>TRUE</code> when the specified <code>InstanceType</code> is EBS-optimized.
     * </p>
     * 
     * @return Evaluates to <code>TRUE</code> when the specified <code>InstanceType</code> is EBS-optimized.
     */

    public Boolean isEbsOptimized() {
        return this.ebsOptimized;
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
        if (getConfigurations() != null)
            sb.append("Configurations: ").append(getConfigurations()).append(",");
        if (getEbsBlockDevices() != null)
            sb.append("EbsBlockDevices: ").append(getEbsBlockDevices()).append(",");
        if (getEbsOptimized() != null)
            sb.append("EbsOptimized: ").append(getEbsOptimized());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceTypeSpecification == false)
            return false;
        InstanceTypeSpecification other = (InstanceTypeSpecification) obj;
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
        if (other.getConfigurations() == null ^ this.getConfigurations() == null)
            return false;
        if (other.getConfigurations() != null && other.getConfigurations().equals(this.getConfigurations()) == false)
            return false;
        if (other.getEbsBlockDevices() == null ^ this.getEbsBlockDevices() == null)
            return false;
        if (other.getEbsBlockDevices() != null && other.getEbsBlockDevices().equals(this.getEbsBlockDevices()) == false)
            return false;
        if (other.getEbsOptimized() == null ^ this.getEbsOptimized() == null)
            return false;
        if (other.getEbsOptimized() != null && other.getEbsOptimized().equals(this.getEbsOptimized()) == false)
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
        hashCode = prime * hashCode + ((getConfigurations() == null) ? 0 : getConfigurations().hashCode());
        hashCode = prime * hashCode + ((getEbsBlockDevices() == null) ? 0 : getEbsBlockDevices().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimized() == null) ? 0 : getEbsOptimized().hashCode());
        return hashCode;
    }

    @Override
    public InstanceTypeSpecification clone() {
        try {
            return (InstanceTypeSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.InstanceTypeSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
