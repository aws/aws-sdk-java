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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Details on the Amazon EC2 Resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/EC2ResourceDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EC2ResourceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Hourly public On Demand rate for the instance type.
     * </p>
     */
    private String hourlyOnDemandRate;
    /**
     * <p>
     * The type of Amazon Web Services instance.
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * The platform of the Amazon Web Services instance. The platform is the specific combination of operating system,
     * license model, and software on an instance.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * The Amazon Web Services Region of the instance.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The SKU of the product.
     * </p>
     */
    private String sku;
    /**
     * <p>
     * Memory capacity of Amazon Web Services instance.
     * </p>
     */
    private String memory;
    /**
     * <p>
     * Network performance capacity of the Amazon Web Services instance.
     * </p>
     */
    private String networkPerformance;
    /**
     * <p>
     * The disk storage of the Amazon Web Services instance (Not EBS storage).
     * </p>
     */
    private String storage;
    /**
     * <p>
     * Number of VCPU cores in the Amazon Web Services instance type.
     * </p>
     */
    private String vcpu;

    /**
     * <p>
     * Hourly public On Demand rate for the instance type.
     * </p>
     * 
     * @param hourlyOnDemandRate
     *        Hourly public On Demand rate for the instance type.
     */

    public void setHourlyOnDemandRate(String hourlyOnDemandRate) {
        this.hourlyOnDemandRate = hourlyOnDemandRate;
    }

    /**
     * <p>
     * Hourly public On Demand rate for the instance type.
     * </p>
     * 
     * @return Hourly public On Demand rate for the instance type.
     */

    public String getHourlyOnDemandRate() {
        return this.hourlyOnDemandRate;
    }

    /**
     * <p>
     * Hourly public On Demand rate for the instance type.
     * </p>
     * 
     * @param hourlyOnDemandRate
     *        Hourly public On Demand rate for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceDetails withHourlyOnDemandRate(String hourlyOnDemandRate) {
        setHourlyOnDemandRate(hourlyOnDemandRate);
        return this;
    }

    /**
     * <p>
     * The type of Amazon Web Services instance.
     * </p>
     * 
     * @param instanceType
     *        The type of Amazon Web Services instance.
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services instance.
     * </p>
     * 
     * @return The type of Amazon Web Services instance.
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The type of Amazon Web Services instance.
     * </p>
     * 
     * @param instanceType
     *        The type of Amazon Web Services instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceDetails withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * The platform of the Amazon Web Services instance. The platform is the specific combination of operating system,
     * license model, and software on an instance.
     * </p>
     * 
     * @param platform
     *        The platform of the Amazon Web Services instance. The platform is the specific combination of operating
     *        system, license model, and software on an instance.
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The platform of the Amazon Web Services instance. The platform is the specific combination of operating system,
     * license model, and software on an instance.
     * </p>
     * 
     * @return The platform of the Amazon Web Services instance. The platform is the specific combination of operating
     *         system, license model, and software on an instance.
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The platform of the Amazon Web Services instance. The platform is the specific combination of operating system,
     * license model, and software on an instance.
     * </p>
     * 
     * @param platform
     *        The platform of the Amazon Web Services instance. The platform is the specific combination of operating
     *        system, license model, and software on an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceDetails withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the instance.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region of the instance.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the instance.
     * </p>
     * 
     * @return The Amazon Web Services Region of the instance.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The Amazon Web Services Region of the instance.
     * </p>
     * 
     * @param region
     *        The Amazon Web Services Region of the instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceDetails withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The SKU of the product.
     * </p>
     * 
     * @param sku
     *        The SKU of the product.
     */

    public void setSku(String sku) {
        this.sku = sku;
    }

    /**
     * <p>
     * The SKU of the product.
     * </p>
     * 
     * @return The SKU of the product.
     */

    public String getSku() {
        return this.sku;
    }

    /**
     * <p>
     * The SKU of the product.
     * </p>
     * 
     * @param sku
     *        The SKU of the product.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceDetails withSku(String sku) {
        setSku(sku);
        return this;
    }

    /**
     * <p>
     * Memory capacity of Amazon Web Services instance.
     * </p>
     * 
     * @param memory
     *        Memory capacity of Amazon Web Services instance.
     */

    public void setMemory(String memory) {
        this.memory = memory;
    }

    /**
     * <p>
     * Memory capacity of Amazon Web Services instance.
     * </p>
     * 
     * @return Memory capacity of Amazon Web Services instance.
     */

    public String getMemory() {
        return this.memory;
    }

    /**
     * <p>
     * Memory capacity of Amazon Web Services instance.
     * </p>
     * 
     * @param memory
     *        Memory capacity of Amazon Web Services instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceDetails withMemory(String memory) {
        setMemory(memory);
        return this;
    }

    /**
     * <p>
     * Network performance capacity of the Amazon Web Services instance.
     * </p>
     * 
     * @param networkPerformance
     *        Network performance capacity of the Amazon Web Services instance.
     */

    public void setNetworkPerformance(String networkPerformance) {
        this.networkPerformance = networkPerformance;
    }

    /**
     * <p>
     * Network performance capacity of the Amazon Web Services instance.
     * </p>
     * 
     * @return Network performance capacity of the Amazon Web Services instance.
     */

    public String getNetworkPerformance() {
        return this.networkPerformance;
    }

    /**
     * <p>
     * Network performance capacity of the Amazon Web Services instance.
     * </p>
     * 
     * @param networkPerformance
     *        Network performance capacity of the Amazon Web Services instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceDetails withNetworkPerformance(String networkPerformance) {
        setNetworkPerformance(networkPerformance);
        return this;
    }

    /**
     * <p>
     * The disk storage of the Amazon Web Services instance (Not EBS storage).
     * </p>
     * 
     * @param storage
     *        The disk storage of the Amazon Web Services instance (Not EBS storage).
     */

    public void setStorage(String storage) {
        this.storage = storage;
    }

    /**
     * <p>
     * The disk storage of the Amazon Web Services instance (Not EBS storage).
     * </p>
     * 
     * @return The disk storage of the Amazon Web Services instance (Not EBS storage).
     */

    public String getStorage() {
        return this.storage;
    }

    /**
     * <p>
     * The disk storage of the Amazon Web Services instance (Not EBS storage).
     * </p>
     * 
     * @param storage
     *        The disk storage of the Amazon Web Services instance (Not EBS storage).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceDetails withStorage(String storage) {
        setStorage(storage);
        return this;
    }

    /**
     * <p>
     * Number of VCPU cores in the Amazon Web Services instance type.
     * </p>
     * 
     * @param vcpu
     *        Number of VCPU cores in the Amazon Web Services instance type.
     */

    public void setVcpu(String vcpu) {
        this.vcpu = vcpu;
    }

    /**
     * <p>
     * Number of VCPU cores in the Amazon Web Services instance type.
     * </p>
     * 
     * @return Number of VCPU cores in the Amazon Web Services instance type.
     */

    public String getVcpu() {
        return this.vcpu;
    }

    /**
     * <p>
     * Number of VCPU cores in the Amazon Web Services instance type.
     * </p>
     * 
     * @param vcpu
     *        Number of VCPU cores in the Amazon Web Services instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EC2ResourceDetails withVcpu(String vcpu) {
        setVcpu(vcpu);
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
        if (getHourlyOnDemandRate() != null)
            sb.append("HourlyOnDemandRate: ").append(getHourlyOnDemandRate()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getSku() != null)
            sb.append("Sku: ").append(getSku()).append(",");
        if (getMemory() != null)
            sb.append("Memory: ").append(getMemory()).append(",");
        if (getNetworkPerformance() != null)
            sb.append("NetworkPerformance: ").append(getNetworkPerformance()).append(",");
        if (getStorage() != null)
            sb.append("Storage: ").append(getStorage()).append(",");
        if (getVcpu() != null)
            sb.append("Vcpu: ").append(getVcpu());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EC2ResourceDetails == false)
            return false;
        EC2ResourceDetails other = (EC2ResourceDetails) obj;
        if (other.getHourlyOnDemandRate() == null ^ this.getHourlyOnDemandRate() == null)
            return false;
        if (other.getHourlyOnDemandRate() != null && other.getHourlyOnDemandRate().equals(this.getHourlyOnDemandRate()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getSku() == null ^ this.getSku() == null)
            return false;
        if (other.getSku() != null && other.getSku().equals(this.getSku()) == false)
            return false;
        if (other.getMemory() == null ^ this.getMemory() == null)
            return false;
        if (other.getMemory() != null && other.getMemory().equals(this.getMemory()) == false)
            return false;
        if (other.getNetworkPerformance() == null ^ this.getNetworkPerformance() == null)
            return false;
        if (other.getNetworkPerformance() != null && other.getNetworkPerformance().equals(this.getNetworkPerformance()) == false)
            return false;
        if (other.getStorage() == null ^ this.getStorage() == null)
            return false;
        if (other.getStorage() != null && other.getStorage().equals(this.getStorage()) == false)
            return false;
        if (other.getVcpu() == null ^ this.getVcpu() == null)
            return false;
        if (other.getVcpu() != null && other.getVcpu().equals(this.getVcpu()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHourlyOnDemandRate() == null) ? 0 : getHourlyOnDemandRate().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getSku() == null) ? 0 : getSku().hashCode());
        hashCode = prime * hashCode + ((getMemory() == null) ? 0 : getMemory().hashCode());
        hashCode = prime * hashCode + ((getNetworkPerformance() == null) ? 0 : getNetworkPerformance().hashCode());
        hashCode = prime * hashCode + ((getStorage() == null) ? 0 : getStorage().hashCode());
        hashCode = prime * hashCode + ((getVcpu() == null) ? 0 : getVcpu().hashCode());
        return hashCode;
    }

    @Override
    public EC2ResourceDetails clone() {
        try {
            return (EC2ResourceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.costexplorer.model.transform.EC2ResourceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
