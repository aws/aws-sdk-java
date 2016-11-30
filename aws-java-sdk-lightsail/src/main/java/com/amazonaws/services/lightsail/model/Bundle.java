/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;

/**
 * <p>
 * Describes a bundle, which is a set of specs describing your virtual private server (or <i>instance</i>).
 * </p>
 */
public class Bundle implements Serializable, Cloneable {

    /**
     * <p>
     * The price in US dollars (e.g., <code>5.0</code>).
     * </p>
     */
    private Float price;
    /**
     * <p>
     * The number of vCPUs included in the bundle (e.g., <code>2</code>).
     * </p>
     */
    private Integer cpuCount;
    /**
     * <p>
     * The size of the SSD (e.g., <code>30</code>).
     * </p>
     */
    private Integer diskSizeInGb;
    /**
     * <p>
     * The bundle ID (e.g., <code>micro_1_0</code>).
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * The Amazon EC2 instance type (e.g., <code>t2.micro</code>).
     * </p>
     */
    private String instanceType;
    /**
     * <p>
     * A Boolean value indicating whether the bundle is active.
     * </p>
     */
    private Boolean isActive;
    /**
     * <p>
     * A friendly name for the bundle (e.g., <code>Micro</code>).
     * </p>
     */
    private String name;
    /**
     * <p>
     * The power of the bundle (e.g., <code>500</code>).
     * </p>
     */
    private Integer power;
    /**
     * <p>
     * The amount of RAM in GB (e.g., <code>2.0</code>).
     * </p>
     */
    private Float ramSizeInGb;
    /**
     * <p>
     * The data transfer rate per month in GB (e.g., <code>2000</code>).
     * </p>
     */
    private Integer transferPerMonthInGb;

    /**
     * <p>
     * The price in US dollars (e.g., <code>5.0</code>).
     * </p>
     * 
     * @param price
     *        The price in US dollars (e.g., <code>5.0</code>).
     */

    public void setPrice(Float price) {
        this.price = price;
    }

    /**
     * <p>
     * The price in US dollars (e.g., <code>5.0</code>).
     * </p>
     * 
     * @return The price in US dollars (e.g., <code>5.0</code>).
     */

    public Float getPrice() {
        return this.price;
    }

    /**
     * <p>
     * The price in US dollars (e.g., <code>5.0</code>).
     * </p>
     * 
     * @param price
     *        The price in US dollars (e.g., <code>5.0</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bundle withPrice(Float price) {
        setPrice(price);
        return this;
    }

    /**
     * <p>
     * The number of vCPUs included in the bundle (e.g., <code>2</code>).
     * </p>
     * 
     * @param cpuCount
     *        The number of vCPUs included in the bundle (e.g., <code>2</code>).
     */

    public void setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
    }

    /**
     * <p>
     * The number of vCPUs included in the bundle (e.g., <code>2</code>).
     * </p>
     * 
     * @return The number of vCPUs included in the bundle (e.g., <code>2</code>).
     */

    public Integer getCpuCount() {
        return this.cpuCount;
    }

    /**
     * <p>
     * The number of vCPUs included in the bundle (e.g., <code>2</code>).
     * </p>
     * 
     * @param cpuCount
     *        The number of vCPUs included in the bundle (e.g., <code>2</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bundle withCpuCount(Integer cpuCount) {
        setCpuCount(cpuCount);
        return this;
    }

    /**
     * <p>
     * The size of the SSD (e.g., <code>30</code>).
     * </p>
     * 
     * @param diskSizeInGb
     *        The size of the SSD (e.g., <code>30</code>).
     */

    public void setDiskSizeInGb(Integer diskSizeInGb) {
        this.diskSizeInGb = diskSizeInGb;
    }

    /**
     * <p>
     * The size of the SSD (e.g., <code>30</code>).
     * </p>
     * 
     * @return The size of the SSD (e.g., <code>30</code>).
     */

    public Integer getDiskSizeInGb() {
        return this.diskSizeInGb;
    }

    /**
     * <p>
     * The size of the SSD (e.g., <code>30</code>).
     * </p>
     * 
     * @param diskSizeInGb
     *        The size of the SSD (e.g., <code>30</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bundle withDiskSizeInGb(Integer diskSizeInGb) {
        setDiskSizeInGb(diskSizeInGb);
        return this;
    }

    /**
     * <p>
     * The bundle ID (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @param bundleId
     *        The bundle ID (e.g., <code>micro_1_0</code>).
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The bundle ID (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @return The bundle ID (e.g., <code>micro_1_0</code>).
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The bundle ID (e.g., <code>micro_1_0</code>).
     * </p>
     * 
     * @param bundleId
     *        The bundle ID (e.g., <code>micro_1_0</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bundle withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 instance type (e.g., <code>t2.micro</code>).
     * </p>
     * 
     * @param instanceType
     *        The Amazon EC2 instance type (e.g., <code>t2.micro</code>).
     */

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type (e.g., <code>t2.micro</code>).
     * </p>
     * 
     * @return The Amazon EC2 instance type (e.g., <code>t2.micro</code>).
     */

    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * <p>
     * The Amazon EC2 instance type (e.g., <code>t2.micro</code>).
     * </p>
     * 
     * @param instanceType
     *        The Amazon EC2 instance type (e.g., <code>t2.micro</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bundle withInstanceType(String instanceType) {
        setInstanceType(instanceType);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the bundle is active.
     * </p>
     * 
     * @param isActive
     *        A Boolean value indicating whether the bundle is active.
     */

    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the bundle is active.
     * </p>
     * 
     * @return A Boolean value indicating whether the bundle is active.
     */

    public Boolean getIsActive() {
        return this.isActive;
    }

    /**
     * <p>
     * A Boolean value indicating whether the bundle is active.
     * </p>
     * 
     * @param isActive
     *        A Boolean value indicating whether the bundle is active.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bundle withIsActive(Boolean isActive) {
        setIsActive(isActive);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether the bundle is active.
     * </p>
     * 
     * @return A Boolean value indicating whether the bundle is active.
     */

    public Boolean isActive() {
        return this.isActive;
    }

    /**
     * <p>
     * A friendly name for the bundle (e.g., <code>Micro</code>).
     * </p>
     * 
     * @param name
     *        A friendly name for the bundle (e.g., <code>Micro</code>).
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A friendly name for the bundle (e.g., <code>Micro</code>).
     * </p>
     * 
     * @return A friendly name for the bundle (e.g., <code>Micro</code>).
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A friendly name for the bundle (e.g., <code>Micro</code>).
     * </p>
     * 
     * @param name
     *        A friendly name for the bundle (e.g., <code>Micro</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bundle withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The power of the bundle (e.g., <code>500</code>).
     * </p>
     * 
     * @param power
     *        The power of the bundle (e.g., <code>500</code>).
     */

    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * <p>
     * The power of the bundle (e.g., <code>500</code>).
     * </p>
     * 
     * @return The power of the bundle (e.g., <code>500</code>).
     */

    public Integer getPower() {
        return this.power;
    }

    /**
     * <p>
     * The power of the bundle (e.g., <code>500</code>).
     * </p>
     * 
     * @param power
     *        The power of the bundle (e.g., <code>500</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bundle withPower(Integer power) {
        setPower(power);
        return this;
    }

    /**
     * <p>
     * The amount of RAM in GB (e.g., <code>2.0</code>).
     * </p>
     * 
     * @param ramSizeInGb
     *        The amount of RAM in GB (e.g., <code>2.0</code>).
     */

    public void setRamSizeInGb(Float ramSizeInGb) {
        this.ramSizeInGb = ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB (e.g., <code>2.0</code>).
     * </p>
     * 
     * @return The amount of RAM in GB (e.g., <code>2.0</code>).
     */

    public Float getRamSizeInGb() {
        return this.ramSizeInGb;
    }

    /**
     * <p>
     * The amount of RAM in GB (e.g., <code>2.0</code>).
     * </p>
     * 
     * @param ramSizeInGb
     *        The amount of RAM in GB (e.g., <code>2.0</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bundle withRamSizeInGb(Float ramSizeInGb) {
        setRamSizeInGb(ramSizeInGb);
        return this;
    }

    /**
     * <p>
     * The data transfer rate per month in GB (e.g., <code>2000</code>).
     * </p>
     * 
     * @param transferPerMonthInGb
     *        The data transfer rate per month in GB (e.g., <code>2000</code>).
     */

    public void setTransferPerMonthInGb(Integer transferPerMonthInGb) {
        this.transferPerMonthInGb = transferPerMonthInGb;
    }

    /**
     * <p>
     * The data transfer rate per month in GB (e.g., <code>2000</code>).
     * </p>
     * 
     * @return The data transfer rate per month in GB (e.g., <code>2000</code>).
     */

    public Integer getTransferPerMonthInGb() {
        return this.transferPerMonthInGb;
    }

    /**
     * <p>
     * The data transfer rate per month in GB (e.g., <code>2000</code>).
     * </p>
     * 
     * @param transferPerMonthInGb
     *        The data transfer rate per month in GB (e.g., <code>2000</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Bundle withTransferPerMonthInGb(Integer transferPerMonthInGb) {
        setTransferPerMonthInGb(transferPerMonthInGb);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPrice() != null)
            sb.append("Price: " + getPrice() + ",");
        if (getCpuCount() != null)
            sb.append("CpuCount: " + getCpuCount() + ",");
        if (getDiskSizeInGb() != null)
            sb.append("DiskSizeInGb: " + getDiskSizeInGb() + ",");
        if (getBundleId() != null)
            sb.append("BundleId: " + getBundleId() + ",");
        if (getInstanceType() != null)
            sb.append("InstanceType: " + getInstanceType() + ",");
        if (getIsActive() != null)
            sb.append("IsActive: " + getIsActive() + ",");
        if (getName() != null)
            sb.append("Name: " + getName() + ",");
        if (getPower() != null)
            sb.append("Power: " + getPower() + ",");
        if (getRamSizeInGb() != null)
            sb.append("RamSizeInGb: " + getRamSizeInGb() + ",");
        if (getTransferPerMonthInGb() != null)
            sb.append("TransferPerMonthInGb: " + getTransferPerMonthInGb());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Bundle == false)
            return false;
        Bundle other = (Bundle) obj;
        if (other.getPrice() == null ^ this.getPrice() == null)
            return false;
        if (other.getPrice() != null && other.getPrice().equals(this.getPrice()) == false)
            return false;
        if (other.getCpuCount() == null ^ this.getCpuCount() == null)
            return false;
        if (other.getCpuCount() != null && other.getCpuCount().equals(this.getCpuCount()) == false)
            return false;
        if (other.getDiskSizeInGb() == null ^ this.getDiskSizeInGb() == null)
            return false;
        if (other.getDiskSizeInGb() != null && other.getDiskSizeInGb().equals(this.getDiskSizeInGb()) == false)
            return false;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getInstanceType() == null ^ this.getInstanceType() == null)
            return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false)
            return false;
        if (other.getIsActive() == null ^ this.getIsActive() == null)
            return false;
        if (other.getIsActive() != null && other.getIsActive().equals(this.getIsActive()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPower() == null ^ this.getPower() == null)
            return false;
        if (other.getPower() != null && other.getPower().equals(this.getPower()) == false)
            return false;
        if (other.getRamSizeInGb() == null ^ this.getRamSizeInGb() == null)
            return false;
        if (other.getRamSizeInGb() != null && other.getRamSizeInGb().equals(this.getRamSizeInGb()) == false)
            return false;
        if (other.getTransferPerMonthInGb() == null ^ this.getTransferPerMonthInGb() == null)
            return false;
        if (other.getTransferPerMonthInGb() != null && other.getTransferPerMonthInGb().equals(this.getTransferPerMonthInGb()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPrice() == null) ? 0 : getPrice().hashCode());
        hashCode = prime * hashCode + ((getCpuCount() == null) ? 0 : getCpuCount().hashCode());
        hashCode = prime * hashCode + ((getDiskSizeInGb() == null) ? 0 : getDiskSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode());
        hashCode = prime * hashCode + ((getIsActive() == null) ? 0 : getIsActive().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPower() == null) ? 0 : getPower().hashCode());
        hashCode = prime * hashCode + ((getRamSizeInGb() == null) ? 0 : getRamSizeInGb().hashCode());
        hashCode = prime * hashCode + ((getTransferPerMonthInGb() == null) ? 0 : getTransferPerMonthInGb().hashCode());
        return hashCode;
    }

    @Override
    public Bundle clone() {
        try {
            return (Bundle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
