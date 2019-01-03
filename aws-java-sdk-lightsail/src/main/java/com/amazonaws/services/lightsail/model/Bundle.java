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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a bundle, which is a set of specs describing your virtual private server (or <i>instance</i>).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/Bundle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Bundle implements Serializable, Cloneable, StructuredPojo {

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
     * A numeric value that represents the power of the bundle (e.g., <code>500</code>). You can use the bundle's power
     * value in conjunction with a blueprint's minimum power value to determine whether the blueprint will run on the
     * bundle. For example, you need a bundle with a power value of 500 or more to create an instance that uses a
     * blueprint with a minimum power value of 500.
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
     * The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can only
     * launch a <code>WINDOWS</code> bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     * <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code> bundle.
     * </p>
     */
    private java.util.List<String> supportedPlatforms;

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
     * A numeric value that represents the power of the bundle (e.g., <code>500</code>). You can use the bundle's power
     * value in conjunction with a blueprint's minimum power value to determine whether the blueprint will run on the
     * bundle. For example, you need a bundle with a power value of 500 or more to create an instance that uses a
     * blueprint with a minimum power value of 500.
     * </p>
     * 
     * @param power
     *        A numeric value that represents the power of the bundle (e.g., <code>500</code>). You can use the bundle's
     *        power value in conjunction with a blueprint's minimum power value to determine whether the blueprint will
     *        run on the bundle. For example, you need a bundle with a power value of 500 or more to create an instance
     *        that uses a blueprint with a minimum power value of 500.
     */

    public void setPower(Integer power) {
        this.power = power;
    }

    /**
     * <p>
     * A numeric value that represents the power of the bundle (e.g., <code>500</code>). You can use the bundle's power
     * value in conjunction with a blueprint's minimum power value to determine whether the blueprint will run on the
     * bundle. For example, you need a bundle with a power value of 500 or more to create an instance that uses a
     * blueprint with a minimum power value of 500.
     * </p>
     * 
     * @return A numeric value that represents the power of the bundle (e.g., <code>500</code>). You can use the
     *         bundle's power value in conjunction with a blueprint's minimum power value to determine whether the
     *         blueprint will run on the bundle. For example, you need a bundle with a power value of 500 or more to
     *         create an instance that uses a blueprint with a minimum power value of 500.
     */

    public Integer getPower() {
        return this.power;
    }

    /**
     * <p>
     * A numeric value that represents the power of the bundle (e.g., <code>500</code>). You can use the bundle's power
     * value in conjunction with a blueprint's minimum power value to determine whether the blueprint will run on the
     * bundle. For example, you need a bundle with a power value of 500 or more to create an instance that uses a
     * blueprint with a minimum power value of 500.
     * </p>
     * 
     * @param power
     *        A numeric value that represents the power of the bundle (e.g., <code>500</code>). You can use the bundle's
     *        power value in conjunction with a blueprint's minimum power value to determine whether the blueprint will
     *        run on the bundle. For example, you need a bundle with a power value of 500 or more to create an instance
     *        that uses a blueprint with a minimum power value of 500.
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
     * <p>
     * The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can only
     * launch a <code>WINDOWS</code> bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     * <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code> bundle.
     * </p>
     * 
     * @return The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You
     *         can only launch a <code>WINDOWS</code> bundle on a blueprint that supports the <code>WINDOWS</code>
     *         platform. <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code> bundle.
     * @see InstancePlatform
     */

    public java.util.List<String> getSupportedPlatforms() {
        return supportedPlatforms;
    }

    /**
     * <p>
     * The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can only
     * launch a <code>WINDOWS</code> bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     * <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code> bundle.
     * </p>
     * 
     * @param supportedPlatforms
     *        The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can
     *        only launch a <code>WINDOWS</code> bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     *        <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code> bundle.
     * @see InstancePlatform
     */

    public void setSupportedPlatforms(java.util.Collection<String> supportedPlatforms) {
        if (supportedPlatforms == null) {
            this.supportedPlatforms = null;
            return;
        }

        this.supportedPlatforms = new java.util.ArrayList<String>(supportedPlatforms);
    }

    /**
     * <p>
     * The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can only
     * launch a <code>WINDOWS</code> bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     * <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code> bundle.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedPlatforms(java.util.Collection)} or {@link #withSupportedPlatforms(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param supportedPlatforms
     *        The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can
     *        only launch a <code>WINDOWS</code> bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     *        <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code> bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstancePlatform
     */

    public Bundle withSupportedPlatforms(String... supportedPlatforms) {
        if (this.supportedPlatforms == null) {
            setSupportedPlatforms(new java.util.ArrayList<String>(supportedPlatforms.length));
        }
        for (String ele : supportedPlatforms) {
            this.supportedPlatforms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can only
     * launch a <code>WINDOWS</code> bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     * <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code> bundle.
     * </p>
     * 
     * @param supportedPlatforms
     *        The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can
     *        only launch a <code>WINDOWS</code> bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     *        <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code> bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstancePlatform
     */

    public Bundle withSupportedPlatforms(java.util.Collection<String> supportedPlatforms) {
        setSupportedPlatforms(supportedPlatforms);
        return this;
    }

    /**
     * <p>
     * The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can only
     * launch a <code>WINDOWS</code> bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     * <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code> bundle.
     * </p>
     * 
     * @param supportedPlatforms
     *        The operating system platform (Linux/Unix-based or Windows Server-based) that the bundle supports. You can
     *        only launch a <code>WINDOWS</code> bundle on a blueprint that supports the <code>WINDOWS</code> platform.
     *        <code>LINUX_UNIX</code> blueprints require a <code>LINUX_UNIX</code> bundle.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstancePlatform
     */

    public Bundle withSupportedPlatforms(InstancePlatform... supportedPlatforms) {
        java.util.ArrayList<String> supportedPlatformsCopy = new java.util.ArrayList<String>(supportedPlatforms.length);
        for (InstancePlatform value : supportedPlatforms) {
            supportedPlatformsCopy.add(value.toString());
        }
        if (getSupportedPlatforms() == null) {
            setSupportedPlatforms(supportedPlatformsCopy);
        } else {
            getSupportedPlatforms().addAll(supportedPlatformsCopy);
        }
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
        if (getPrice() != null)
            sb.append("Price: ").append(getPrice()).append(",");
        if (getCpuCount() != null)
            sb.append("CpuCount: ").append(getCpuCount()).append(",");
        if (getDiskSizeInGb() != null)
            sb.append("DiskSizeInGb: ").append(getDiskSizeInGb()).append(",");
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getInstanceType() != null)
            sb.append("InstanceType: ").append(getInstanceType()).append(",");
        if (getIsActive() != null)
            sb.append("IsActive: ").append(getIsActive()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPower() != null)
            sb.append("Power: ").append(getPower()).append(",");
        if (getRamSizeInGb() != null)
            sb.append("RamSizeInGb: ").append(getRamSizeInGb()).append(",");
        if (getTransferPerMonthInGb() != null)
            sb.append("TransferPerMonthInGb: ").append(getTransferPerMonthInGb()).append(",");
        if (getSupportedPlatforms() != null)
            sb.append("SupportedPlatforms: ").append(getSupportedPlatforms());
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
        if (other.getSupportedPlatforms() == null ^ this.getSupportedPlatforms() == null)
            return false;
        if (other.getSupportedPlatforms() != null && other.getSupportedPlatforms().equals(this.getSupportedPlatforms()) == false)
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
        hashCode = prime * hashCode + ((getSupportedPlatforms() == null) ? 0 : getSupportedPlatforms().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.BundleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
