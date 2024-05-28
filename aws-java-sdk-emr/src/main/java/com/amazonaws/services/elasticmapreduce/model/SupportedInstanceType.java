/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An instance type that the specified Amazon EMR release supports.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/SupportedInstanceType"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SupportedInstanceType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 instance type</a>, for example
     * <code>m5.xlarge</code>, of the <code>SupportedInstanceType</code>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The amount of memory that is available to Amazon EMR from the <code>SupportedInstanceType</code>. The kernel and
     * hypervisor software consume some memory, so this value might be lower than the overall memory for the instance
     * type.
     * </p>
     */
    private Float memoryGB;
    /**
     * <p>
     * <code>StorageGB</code> represents the storage capacity of the <code>SupportedInstanceType</code>. This value is
     * <code>0</code> for Amazon EBS-only instance types.
     * </p>
     */
    private Integer storageGB;
    /**
     * <p>
     * The number of vCPUs available for the <code>SupportedInstanceType</code>.
     * </p>
     */
    private Integer vCPU;
    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> only supports 64-bit architecture.
     * </p>
     */
    private Boolean is64BitsOnly;
    /**
     * <p>
     * The Amazon EC2 family and generation for the <code>SupportedInstanceType</code>.
     * </p>
     */
    private String instanceFamilyId;
    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> supports Amazon EBS optimization.
     * </p>
     */
    private Boolean ebsOptimizedAvailable;
    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> uses Amazon EBS optimization by default.
     * </p>
     */
    private Boolean ebsOptimizedByDefault;
    /**
     * <p>
     * Number of disks for the <code>SupportedInstanceType</code>. This value is <code>0</code> for Amazon EBS-only
     * instance types.
     * </p>
     */
    private Integer numberOfDisks;
    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> only supports Amazon EBS.
     * </p>
     */
    private Boolean ebsStorageOnly;
    /**
     * <p>
     * The CPU architecture, for example <code>X86_64</code> or <code>AARCH64</code>.
     * </p>
     */
    private String architecture;

    /**
     * <p>
     * The <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 instance type</a>, for example
     * <code>m5.xlarge</code>, of the <code>SupportedInstanceType</code>.
     * </p>
     * 
     * @param type
     *        The <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 instance type</a>, for example
     *        <code>m5.xlarge</code>, of the <code>SupportedInstanceType</code>.
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 instance type</a>, for example
     * <code>m5.xlarge</code>, of the <code>SupportedInstanceType</code>.
     * </p>
     * 
     * @return The <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 instance type</a>, for example
     *         <code>m5.xlarge</code>, of the <code>SupportedInstanceType</code>.
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 instance type</a>, for example
     * <code>m5.xlarge</code>, of the <code>SupportedInstanceType</code>.
     * </p>
     * 
     * @param type
     *        The <a href="http://aws.amazon.com/ec2/instance-types/">Amazon EC2 instance type</a>, for example
     *        <code>m5.xlarge</code>, of the <code>SupportedInstanceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedInstanceType withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The amount of memory that is available to Amazon EMR from the <code>SupportedInstanceType</code>. The kernel and
     * hypervisor software consume some memory, so this value might be lower than the overall memory for the instance
     * type.
     * </p>
     * 
     * @param memoryGB
     *        The amount of memory that is available to Amazon EMR from the <code>SupportedInstanceType</code>. The
     *        kernel and hypervisor software consume some memory, so this value might be lower than the overall memory
     *        for the instance type.
     */

    public void setMemoryGB(Float memoryGB) {
        this.memoryGB = memoryGB;
    }

    /**
     * <p>
     * The amount of memory that is available to Amazon EMR from the <code>SupportedInstanceType</code>. The kernel and
     * hypervisor software consume some memory, so this value might be lower than the overall memory for the instance
     * type.
     * </p>
     * 
     * @return The amount of memory that is available to Amazon EMR from the <code>SupportedInstanceType</code>. The
     *         kernel and hypervisor software consume some memory, so this value might be lower than the overall memory
     *         for the instance type.
     */

    public Float getMemoryGB() {
        return this.memoryGB;
    }

    /**
     * <p>
     * The amount of memory that is available to Amazon EMR from the <code>SupportedInstanceType</code>. The kernel and
     * hypervisor software consume some memory, so this value might be lower than the overall memory for the instance
     * type.
     * </p>
     * 
     * @param memoryGB
     *        The amount of memory that is available to Amazon EMR from the <code>SupportedInstanceType</code>. The
     *        kernel and hypervisor software consume some memory, so this value might be lower than the overall memory
     *        for the instance type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedInstanceType withMemoryGB(Float memoryGB) {
        setMemoryGB(memoryGB);
        return this;
    }

    /**
     * <p>
     * <code>StorageGB</code> represents the storage capacity of the <code>SupportedInstanceType</code>. This value is
     * <code>0</code> for Amazon EBS-only instance types.
     * </p>
     * 
     * @param storageGB
     *        <code>StorageGB</code> represents the storage capacity of the <code>SupportedInstanceType</code>. This
     *        value is <code>0</code> for Amazon EBS-only instance types.
     */

    public void setStorageGB(Integer storageGB) {
        this.storageGB = storageGB;
    }

    /**
     * <p>
     * <code>StorageGB</code> represents the storage capacity of the <code>SupportedInstanceType</code>. This value is
     * <code>0</code> for Amazon EBS-only instance types.
     * </p>
     * 
     * @return <code>StorageGB</code> represents the storage capacity of the <code>SupportedInstanceType</code>. This
     *         value is <code>0</code> for Amazon EBS-only instance types.
     */

    public Integer getStorageGB() {
        return this.storageGB;
    }

    /**
     * <p>
     * <code>StorageGB</code> represents the storage capacity of the <code>SupportedInstanceType</code>. This value is
     * <code>0</code> for Amazon EBS-only instance types.
     * </p>
     * 
     * @param storageGB
     *        <code>StorageGB</code> represents the storage capacity of the <code>SupportedInstanceType</code>. This
     *        value is <code>0</code> for Amazon EBS-only instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedInstanceType withStorageGB(Integer storageGB) {
        setStorageGB(storageGB);
        return this;
    }

    /**
     * <p>
     * The number of vCPUs available for the <code>SupportedInstanceType</code>.
     * </p>
     * 
     * @param vCPU
     *        The number of vCPUs available for the <code>SupportedInstanceType</code>.
     */

    public void setVCPU(Integer vCPU) {
        this.vCPU = vCPU;
    }

    /**
     * <p>
     * The number of vCPUs available for the <code>SupportedInstanceType</code>.
     * </p>
     * 
     * @return The number of vCPUs available for the <code>SupportedInstanceType</code>.
     */

    public Integer getVCPU() {
        return this.vCPU;
    }

    /**
     * <p>
     * The number of vCPUs available for the <code>SupportedInstanceType</code>.
     * </p>
     * 
     * @param vCPU
     *        The number of vCPUs available for the <code>SupportedInstanceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedInstanceType withVCPU(Integer vCPU) {
        setVCPU(vCPU);
        return this;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> only supports 64-bit architecture.
     * </p>
     * 
     * @param is64BitsOnly
     *        Indicates whether the <code>SupportedInstanceType</code> only supports 64-bit architecture.
     */

    public void setIs64BitsOnly(Boolean is64BitsOnly) {
        this.is64BitsOnly = is64BitsOnly;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> only supports 64-bit architecture.
     * </p>
     * 
     * @return Indicates whether the <code>SupportedInstanceType</code> only supports 64-bit architecture.
     */

    public Boolean getIs64BitsOnly() {
        return this.is64BitsOnly;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> only supports 64-bit architecture.
     * </p>
     * 
     * @param is64BitsOnly
     *        Indicates whether the <code>SupportedInstanceType</code> only supports 64-bit architecture.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedInstanceType withIs64BitsOnly(Boolean is64BitsOnly) {
        setIs64BitsOnly(is64BitsOnly);
        return this;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> only supports 64-bit architecture.
     * </p>
     * 
     * @return Indicates whether the <code>SupportedInstanceType</code> only supports 64-bit architecture.
     */

    public Boolean is64BitsOnly() {
        return this.is64BitsOnly;
    }

    /**
     * <p>
     * The Amazon EC2 family and generation for the <code>SupportedInstanceType</code>.
     * </p>
     * 
     * @param instanceFamilyId
     *        The Amazon EC2 family and generation for the <code>SupportedInstanceType</code>.
     */

    public void setInstanceFamilyId(String instanceFamilyId) {
        this.instanceFamilyId = instanceFamilyId;
    }

    /**
     * <p>
     * The Amazon EC2 family and generation for the <code>SupportedInstanceType</code>.
     * </p>
     * 
     * @return The Amazon EC2 family and generation for the <code>SupportedInstanceType</code>.
     */

    public String getInstanceFamilyId() {
        return this.instanceFamilyId;
    }

    /**
     * <p>
     * The Amazon EC2 family and generation for the <code>SupportedInstanceType</code>.
     * </p>
     * 
     * @param instanceFamilyId
     *        The Amazon EC2 family and generation for the <code>SupportedInstanceType</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedInstanceType withInstanceFamilyId(String instanceFamilyId) {
        setInstanceFamilyId(instanceFamilyId);
        return this;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> supports Amazon EBS optimization.
     * </p>
     * 
     * @param ebsOptimizedAvailable
     *        Indicates whether the <code>SupportedInstanceType</code> supports Amazon EBS optimization.
     */

    public void setEbsOptimizedAvailable(Boolean ebsOptimizedAvailable) {
        this.ebsOptimizedAvailable = ebsOptimizedAvailable;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> supports Amazon EBS optimization.
     * </p>
     * 
     * @return Indicates whether the <code>SupportedInstanceType</code> supports Amazon EBS optimization.
     */

    public Boolean getEbsOptimizedAvailable() {
        return this.ebsOptimizedAvailable;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> supports Amazon EBS optimization.
     * </p>
     * 
     * @param ebsOptimizedAvailable
     *        Indicates whether the <code>SupportedInstanceType</code> supports Amazon EBS optimization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedInstanceType withEbsOptimizedAvailable(Boolean ebsOptimizedAvailable) {
        setEbsOptimizedAvailable(ebsOptimizedAvailable);
        return this;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> supports Amazon EBS optimization.
     * </p>
     * 
     * @return Indicates whether the <code>SupportedInstanceType</code> supports Amazon EBS optimization.
     */

    public Boolean isEbsOptimizedAvailable() {
        return this.ebsOptimizedAvailable;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> uses Amazon EBS optimization by default.
     * </p>
     * 
     * @param ebsOptimizedByDefault
     *        Indicates whether the <code>SupportedInstanceType</code> uses Amazon EBS optimization by default.
     */

    public void setEbsOptimizedByDefault(Boolean ebsOptimizedByDefault) {
        this.ebsOptimizedByDefault = ebsOptimizedByDefault;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> uses Amazon EBS optimization by default.
     * </p>
     * 
     * @return Indicates whether the <code>SupportedInstanceType</code> uses Amazon EBS optimization by default.
     */

    public Boolean getEbsOptimizedByDefault() {
        return this.ebsOptimizedByDefault;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> uses Amazon EBS optimization by default.
     * </p>
     * 
     * @param ebsOptimizedByDefault
     *        Indicates whether the <code>SupportedInstanceType</code> uses Amazon EBS optimization by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedInstanceType withEbsOptimizedByDefault(Boolean ebsOptimizedByDefault) {
        setEbsOptimizedByDefault(ebsOptimizedByDefault);
        return this;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> uses Amazon EBS optimization by default.
     * </p>
     * 
     * @return Indicates whether the <code>SupportedInstanceType</code> uses Amazon EBS optimization by default.
     */

    public Boolean isEbsOptimizedByDefault() {
        return this.ebsOptimizedByDefault;
    }

    /**
     * <p>
     * Number of disks for the <code>SupportedInstanceType</code>. This value is <code>0</code> for Amazon EBS-only
     * instance types.
     * </p>
     * 
     * @param numberOfDisks
     *        Number of disks for the <code>SupportedInstanceType</code>. This value is <code>0</code> for Amazon
     *        EBS-only instance types.
     */

    public void setNumberOfDisks(Integer numberOfDisks) {
        this.numberOfDisks = numberOfDisks;
    }

    /**
     * <p>
     * Number of disks for the <code>SupportedInstanceType</code>. This value is <code>0</code> for Amazon EBS-only
     * instance types.
     * </p>
     * 
     * @return Number of disks for the <code>SupportedInstanceType</code>. This value is <code>0</code> for Amazon
     *         EBS-only instance types.
     */

    public Integer getNumberOfDisks() {
        return this.numberOfDisks;
    }

    /**
     * <p>
     * Number of disks for the <code>SupportedInstanceType</code>. This value is <code>0</code> for Amazon EBS-only
     * instance types.
     * </p>
     * 
     * @param numberOfDisks
     *        Number of disks for the <code>SupportedInstanceType</code>. This value is <code>0</code> for Amazon
     *        EBS-only instance types.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedInstanceType withNumberOfDisks(Integer numberOfDisks) {
        setNumberOfDisks(numberOfDisks);
        return this;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> only supports Amazon EBS.
     * </p>
     * 
     * @param ebsStorageOnly
     *        Indicates whether the <code>SupportedInstanceType</code> only supports Amazon EBS.
     */

    public void setEbsStorageOnly(Boolean ebsStorageOnly) {
        this.ebsStorageOnly = ebsStorageOnly;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> only supports Amazon EBS.
     * </p>
     * 
     * @return Indicates whether the <code>SupportedInstanceType</code> only supports Amazon EBS.
     */

    public Boolean getEbsStorageOnly() {
        return this.ebsStorageOnly;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> only supports Amazon EBS.
     * </p>
     * 
     * @param ebsStorageOnly
     *        Indicates whether the <code>SupportedInstanceType</code> only supports Amazon EBS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedInstanceType withEbsStorageOnly(Boolean ebsStorageOnly) {
        setEbsStorageOnly(ebsStorageOnly);
        return this;
    }

    /**
     * <p>
     * Indicates whether the <code>SupportedInstanceType</code> only supports Amazon EBS.
     * </p>
     * 
     * @return Indicates whether the <code>SupportedInstanceType</code> only supports Amazon EBS.
     */

    public Boolean isEbsStorageOnly() {
        return this.ebsStorageOnly;
    }

    /**
     * <p>
     * The CPU architecture, for example <code>X86_64</code> or <code>AARCH64</code>.
     * </p>
     * 
     * @param architecture
     *        The CPU architecture, for example <code>X86_64</code> or <code>AARCH64</code>.
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The CPU architecture, for example <code>X86_64</code> or <code>AARCH64</code>.
     * </p>
     * 
     * @return The CPU architecture, for example <code>X86_64</code> or <code>AARCH64</code>.
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The CPU architecture, for example <code>X86_64</code> or <code>AARCH64</code>.
     * </p>
     * 
     * @param architecture
     *        The CPU architecture, for example <code>X86_64</code> or <code>AARCH64</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SupportedInstanceType withArchitecture(String architecture) {
        setArchitecture(architecture);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getMemoryGB() != null)
            sb.append("MemoryGB: ").append(getMemoryGB()).append(",");
        if (getStorageGB() != null)
            sb.append("StorageGB: ").append(getStorageGB()).append(",");
        if (getVCPU() != null)
            sb.append("VCPU: ").append(getVCPU()).append(",");
        if (getIs64BitsOnly() != null)
            sb.append("Is64BitsOnly: ").append(getIs64BitsOnly()).append(",");
        if (getInstanceFamilyId() != null)
            sb.append("InstanceFamilyId: ").append(getInstanceFamilyId()).append(",");
        if (getEbsOptimizedAvailable() != null)
            sb.append("EbsOptimizedAvailable: ").append(getEbsOptimizedAvailable()).append(",");
        if (getEbsOptimizedByDefault() != null)
            sb.append("EbsOptimizedByDefault: ").append(getEbsOptimizedByDefault()).append(",");
        if (getNumberOfDisks() != null)
            sb.append("NumberOfDisks: ").append(getNumberOfDisks()).append(",");
        if (getEbsStorageOnly() != null)
            sb.append("EbsStorageOnly: ").append(getEbsStorageOnly()).append(",");
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SupportedInstanceType == false)
            return false;
        SupportedInstanceType other = (SupportedInstanceType) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getMemoryGB() == null ^ this.getMemoryGB() == null)
            return false;
        if (other.getMemoryGB() != null && other.getMemoryGB().equals(this.getMemoryGB()) == false)
            return false;
        if (other.getStorageGB() == null ^ this.getStorageGB() == null)
            return false;
        if (other.getStorageGB() != null && other.getStorageGB().equals(this.getStorageGB()) == false)
            return false;
        if (other.getVCPU() == null ^ this.getVCPU() == null)
            return false;
        if (other.getVCPU() != null && other.getVCPU().equals(this.getVCPU()) == false)
            return false;
        if (other.getIs64BitsOnly() == null ^ this.getIs64BitsOnly() == null)
            return false;
        if (other.getIs64BitsOnly() != null && other.getIs64BitsOnly().equals(this.getIs64BitsOnly()) == false)
            return false;
        if (other.getInstanceFamilyId() == null ^ this.getInstanceFamilyId() == null)
            return false;
        if (other.getInstanceFamilyId() != null && other.getInstanceFamilyId().equals(this.getInstanceFamilyId()) == false)
            return false;
        if (other.getEbsOptimizedAvailable() == null ^ this.getEbsOptimizedAvailable() == null)
            return false;
        if (other.getEbsOptimizedAvailable() != null && other.getEbsOptimizedAvailable().equals(this.getEbsOptimizedAvailable()) == false)
            return false;
        if (other.getEbsOptimizedByDefault() == null ^ this.getEbsOptimizedByDefault() == null)
            return false;
        if (other.getEbsOptimizedByDefault() != null && other.getEbsOptimizedByDefault().equals(this.getEbsOptimizedByDefault()) == false)
            return false;
        if (other.getNumberOfDisks() == null ^ this.getNumberOfDisks() == null)
            return false;
        if (other.getNumberOfDisks() != null && other.getNumberOfDisks().equals(this.getNumberOfDisks()) == false)
            return false;
        if (other.getEbsStorageOnly() == null ^ this.getEbsStorageOnly() == null)
            return false;
        if (other.getEbsStorageOnly() != null && other.getEbsStorageOnly().equals(this.getEbsStorageOnly()) == false)
            return false;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getMemoryGB() == null) ? 0 : getMemoryGB().hashCode());
        hashCode = prime * hashCode + ((getStorageGB() == null) ? 0 : getStorageGB().hashCode());
        hashCode = prime * hashCode + ((getVCPU() == null) ? 0 : getVCPU().hashCode());
        hashCode = prime * hashCode + ((getIs64BitsOnly() == null) ? 0 : getIs64BitsOnly().hashCode());
        hashCode = prime * hashCode + ((getInstanceFamilyId() == null) ? 0 : getInstanceFamilyId().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimizedAvailable() == null) ? 0 : getEbsOptimizedAvailable().hashCode());
        hashCode = prime * hashCode + ((getEbsOptimizedByDefault() == null) ? 0 : getEbsOptimizedByDefault().hashCode());
        hashCode = prime * hashCode + ((getNumberOfDisks() == null) ? 0 : getNumberOfDisks().hashCode());
        hashCode = prime * hashCode + ((getEbsStorageOnly() == null) ? 0 : getEbsStorageOnly().hashCode());
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        return hashCode;
    }

    @Override
    public SupportedInstanceType clone() {
        try {
            return (SupportedInstanceType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.SupportedInstanceTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
