/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an instance attribute.
 * </p>
 */
public class InstanceAttribute implements Serializable {

    /**
     * The ID of the instance.
     */
    private String instanceId;

    /**
     * The instance type.
     */
    private String instanceType;

    /**
     * The kernel ID.
     */
    private String kernelId;

    /**
     * The RAM disk ID.
     */
    private String ramdiskId;

    /**
     * The Base64-encoded MIME user data.
     */
    private String userData;

    /**
     * If the value is <code>true</code>, you can't terminate the instance
     * through the Amazon EC2 console, CLI, or API; otherwise, you can.
     */
    private Boolean disableApiTermination;

    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown).
     */
    private String instanceInitiatedShutdownBehavior;

    /**
     * The name of the root device (for example, <code>/dev/sda1</code>).
     */
    private String rootDeviceName;

    /**
     * The block device mapping of the instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMapping> blockDeviceMappings;

    /**
     * A list of product codes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode> productCodes;

    /**
     * Indicates whether the instance is optimized for EBS I/O.
     */
    private Boolean ebsOptimized;

    /**
     * 
     */
    private String sriovNetSupport;

    /**
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for
     * a NAT instance to perform NAT.
     */
    private Boolean sourceDestCheck;

    /**
     * The security groups associated with the instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> groups;

    /**
     * The ID of the instance.
     *
     * @return The ID of the instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the instance.
     *
     * @param instanceId The ID of the instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The instance type.
     *
     * @return The instance type.
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type.
     *
     * @param instanceType The instance type.
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The kernel ID.
     *
     * @return The kernel ID.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * The kernel ID.
     *
     * @param kernelId The kernel ID.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * The kernel ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernelId The kernel ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * The RAM disk ID.
     *
     * @return The RAM disk ID.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * The RAM disk ID.
     *
     * @param ramdiskId The RAM disk ID.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * The RAM disk ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdiskId The RAM disk ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * The Base64-encoded MIME user data.
     *
     * @return The Base64-encoded MIME user data.
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * The Base64-encoded MIME user data.
     *
     * @param userData The Base64-encoded MIME user data.
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * The Base64-encoded MIME user data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userData The Base64-encoded MIME user data.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * If the value is <code>true</code>, you can't terminate the instance
     * through the Amazon EC2 console, CLI, or API; otherwise, you can.
     *
     * @return If the value is <code>true</code>, you can't terminate the instance
     *         through the Amazon EC2 console, CLI, or API; otherwise, you can.
     */
    public Boolean isDisableApiTermination() {
        return disableApiTermination;
    }
    
    /**
     * If the value is <code>true</code>, you can't terminate the instance
     * through the Amazon EC2 console, CLI, or API; otherwise, you can.
     *
     * @param disableApiTermination If the value is <code>true</code>, you can't terminate the instance
     *         through the Amazon EC2 console, CLI, or API; otherwise, you can.
     */
    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }
    
    /**
     * If the value is <code>true</code>, you can't terminate the instance
     * through the Amazon EC2 console, CLI, or API; otherwise, you can.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param disableApiTermination If the value is <code>true</code>, you can't terminate the instance
     *         through the Amazon EC2 console, CLI, or API; otherwise, you can.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
        return this;
    }

    /**
     * If the value is <code>true</code>, you can't terminate the instance
     * through the Amazon EC2 console, CLI, or API; otherwise, you can.
     *
     * @return If the value is <code>true</code>, you can't terminate the instance
     *         through the Amazon EC2 console, CLI, or API; otherwise, you can.
     */
    public Boolean getDisableApiTermination() {
        return disableApiTermination;
    }

    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown).
     *
     * @return Indicates whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown).
     */
    public String getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown).
     *
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown).
     */
    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Indicates whether an instance stops or terminates when you initiate
     * shutdown from the instance (using the operating system command for
     * system shutdown).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceInitiatedShutdownBehavior Indicates whether an instance stops or terminates when you initiate
     *         shutdown from the instance (using the operating system command for
     *         system shutdown).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }

    /**
     * The name of the root device (for example, <code>/dev/sda1</code>).
     *
     * @return The name of the root device (for example, <code>/dev/sda1</code>).
     */
    public String getRootDeviceName() {
        return rootDeviceName;
    }
    
    /**
     * The name of the root device (for example, <code>/dev/sda1</code>).
     *
     * @param rootDeviceName The name of the root device (for example, <code>/dev/sda1</code>).
     */
    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }
    
    /**
     * The name of the root device (for example, <code>/dev/sda1</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rootDeviceName The name of the root device (for example, <code>/dev/sda1</code>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
        return this;
    }

    /**
     * The block device mapping of the instance.
     *
     * @return The block device mapping of the instance.
     */
    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * The block device mapping of the instance.
     *
     * @param blockDeviceMappings The block device mapping of the instance.
     */
    public void setBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMapping>(blockDeviceMappings.size());
        blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * The block device mapping of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings The block device mapping of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withBlockDeviceMappings(InstanceBlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<InstanceBlockDeviceMapping>(blockDeviceMappings.length));
        for (InstanceBlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * The block device mapping of the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings The block device mapping of the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withBlockDeviceMappings(java.util.Collection<InstanceBlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMapping>(blockDeviceMappings.size());
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
            this.blockDeviceMappings = blockDeviceMappingsCopy;
        }

        return this;
    }

    /**
     * A list of product codes.
     *
     * @return A list of product codes.
     */
    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
              productCodes = new com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode>();
              productCodes.setAutoConstruct(true);
        }
        return productCodes;
    }
    
    /**
     * A list of product codes.
     *
     * @param productCodes A list of product codes.
     */
    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode> productCodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode>(productCodes.size());
        productCodesCopy.addAll(productCodes);
        this.productCodes = productCodesCopy;
    }
    
    /**
     * A list of product codes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes A list of product codes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withProductCodes(ProductCode... productCodes) {
        if (getProductCodes() == null) setProductCodes(new java.util.ArrayList<ProductCode>(productCodes.length));
        for (ProductCode value : productCodes) {
            getProductCodes().add(value);
        }
        return this;
    }
    
    /**
     * A list of product codes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes A list of product codes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode> productCodesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode>(productCodes.size());
            productCodesCopy.addAll(productCodes);
            this.productCodes = productCodesCopy;
        }

        return this;
    }

    /**
     * Indicates whether the instance is optimized for EBS I/O.
     *
     * @return Indicates whether the instance is optimized for EBS I/O.
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Indicates whether the instance is optimized for EBS I/O.
     *
     * @param ebsOptimized Indicates whether the instance is optimized for EBS I/O.
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Indicates whether the instance is optimized for EBS I/O.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized Indicates whether the instance is optimized for EBS I/O.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Indicates whether the instance is optimized for EBS I/O.
     *
     * @return Indicates whether the instance is optimized for EBS I/O.
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * 
     *
     * @return 
     */
    public String getSriovNetSupport() {
        return sriovNetSupport;
    }
    
    /**
     * 
     *
     * @param sriovNetSupport 
     */
    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }
    
    /**
     * 
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sriovNetSupport 
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
        return this;
    }

    /**
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for
     * a NAT instance to perform NAT.
     *
     * @return Indicates whether source/destination checking is enabled. A value of
     *         <code>true</code> means checking is enabled, and <code>false</code>
     *         means checking is disabled. This value must be <code>false</code> for
     *         a NAT instance to perform NAT.
     */
    public Boolean isSourceDestCheck() {
        return sourceDestCheck;
    }
    
    /**
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for
     * a NAT instance to perform NAT.
     *
     * @param sourceDestCheck Indicates whether source/destination checking is enabled. A value of
     *         <code>true</code> means checking is enabled, and <code>false</code>
     *         means checking is disabled. This value must be <code>false</code> for
     *         a NAT instance to perform NAT.
     */
    public void setSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
    }
    
    /**
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for
     * a NAT instance to perform NAT.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sourceDestCheck Indicates whether source/destination checking is enabled. A value of
     *         <code>true</code> means checking is enabled, and <code>false</code>
     *         means checking is disabled. This value must be <code>false</code> for
     *         a NAT instance to perform NAT.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withSourceDestCheck(Boolean sourceDestCheck) {
        this.sourceDestCheck = sourceDestCheck;
        return this;
    }

    /**
     * Indicates whether source/destination checking is enabled. A value of
     * <code>true</code> means checking is enabled, and <code>false</code>
     * means checking is disabled. This value must be <code>false</code> for
     * a NAT instance to perform NAT.
     *
     * @return Indicates whether source/destination checking is enabled. A value of
     *         <code>true</code> means checking is enabled, and <code>false</code>
     *         means checking is disabled. This value must be <code>false</code> for
     *         a NAT instance to perform NAT.
     */
    public Boolean getSourceDestCheck() {
        return sourceDestCheck;
    }

    /**
     * The security groups associated with the instance.
     *
     * @return The security groups associated with the instance.
     */
    public java.util.List<GroupIdentifier> getGroups() {
        if (groups == null) {
              groups = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>();
              groups.setAutoConstruct(true);
        }
        return groups;
    }
    
    /**
     * The security groups associated with the instance.
     *
     * @param groups The security groups associated with the instance.
     */
    public void setGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>(groups.size());
        groupsCopy.addAll(groups);
        this.groups = groupsCopy;
    }
    
    /**
     * The security groups associated with the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The security groups associated with the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withGroups(GroupIdentifier... groups) {
        if (getGroups() == null) setGroups(new java.util.ArrayList<GroupIdentifier>(groups.length));
        for (GroupIdentifier value : groups) {
            getGroups().add(value);
        }
        return this;
    }
    
    /**
     * The security groups associated with the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param groups The security groups associated with the instance.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InstanceAttribute withGroups(java.util.Collection<GroupIdentifier> groups) {
        if (groups == null) {
            this.groups = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier> groupsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GroupIdentifier>(groups.size());
            groupsCopy.addAll(groups);
            this.groups = groupsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInstanceId() != null) sb.append("InstanceId: " + getInstanceId() + ",");
        if (getInstanceType() != null) sb.append("InstanceType: " + getInstanceType() + ",");
        if (getKernelId() != null) sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null) sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getUserData() != null) sb.append("UserData: " + getUserData() + ",");
        if (isDisableApiTermination() != null) sb.append("DisableApiTermination: " + isDisableApiTermination() + ",");
        if (getInstanceInitiatedShutdownBehavior() != null) sb.append("InstanceInitiatedShutdownBehavior: " + getInstanceInitiatedShutdownBehavior() + ",");
        if (getRootDeviceName() != null) sb.append("RootDeviceName: " + getRootDeviceName() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getProductCodes() != null) sb.append("ProductCodes: " + getProductCodes() + ",");
        if (isEbsOptimized() != null) sb.append("EbsOptimized: " + isEbsOptimized() + ",");
        if (getSriovNetSupport() != null) sb.append("SriovNetSupport: " + getSriovNetSupport() + ",");
        if (isSourceDestCheck() != null) sb.append("SourceDestCheck: " + isSourceDestCheck() + ",");
        if (getGroups() != null) sb.append("Groups: " + getGroups() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInstanceId() == null) ? 0 : getInstanceId().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceType() == null) ? 0 : getInstanceType().hashCode()); 
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode()); 
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode()); 
        hashCode = prime * hashCode + ((getUserData() == null) ? 0 : getUserData().hashCode()); 
        hashCode = prime * hashCode + ((isDisableApiTermination() == null) ? 0 : isDisableApiTermination().hashCode()); 
        hashCode = prime * hashCode + ((getInstanceInitiatedShutdownBehavior() == null) ? 0 : getInstanceInitiatedShutdownBehavior().hashCode()); 
        hashCode = prime * hashCode + ((getRootDeviceName() == null) ? 0 : getRootDeviceName().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode()); 
        hashCode = prime * hashCode + ((isEbsOptimized() == null) ? 0 : isEbsOptimized().hashCode()); 
        hashCode = prime * hashCode + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode()); 
        hashCode = prime * hashCode + ((isSourceDestCheck() == null) ? 0 : isSourceDestCheck().hashCode()); 
        hashCode = prime * hashCode + ((getGroups() == null) ? 0 : getGroups().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InstanceAttribute == false) return false;
        InstanceAttribute other = (InstanceAttribute)obj;
        
        if (other.getInstanceId() == null ^ this.getInstanceId() == null) return false;
        if (other.getInstanceId() != null && other.getInstanceId().equals(this.getInstanceId()) == false) return false; 
        if (other.getInstanceType() == null ^ this.getInstanceType() == null) return false;
        if (other.getInstanceType() != null && other.getInstanceType().equals(this.getInstanceType()) == false) return false; 
        if (other.getKernelId() == null ^ this.getKernelId() == null) return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false) return false; 
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null) return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false) return false; 
        if (other.getUserData() == null ^ this.getUserData() == null) return false;
        if (other.getUserData() != null && other.getUserData().equals(this.getUserData()) == false) return false; 
        if (other.isDisableApiTermination() == null ^ this.isDisableApiTermination() == null) return false;
        if (other.isDisableApiTermination() != null && other.isDisableApiTermination().equals(this.isDisableApiTermination()) == false) return false; 
        if (other.getInstanceInitiatedShutdownBehavior() == null ^ this.getInstanceInitiatedShutdownBehavior() == null) return false;
        if (other.getInstanceInitiatedShutdownBehavior() != null && other.getInstanceInitiatedShutdownBehavior().equals(this.getInstanceInitiatedShutdownBehavior()) == false) return false; 
        if (other.getRootDeviceName() == null ^ this.getRootDeviceName() == null) return false;
        if (other.getRootDeviceName() != null && other.getRootDeviceName().equals(this.getRootDeviceName()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        if (other.getProductCodes() == null ^ this.getProductCodes() == null) return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false) return false; 
        if (other.isEbsOptimized() == null ^ this.isEbsOptimized() == null) return false;
        if (other.isEbsOptimized() != null && other.isEbsOptimized().equals(this.isEbsOptimized()) == false) return false; 
        if (other.getSriovNetSupport() == null ^ this.getSriovNetSupport() == null) return false;
        if (other.getSriovNetSupport() != null && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false) return false; 
        if (other.isSourceDestCheck() == null ^ this.isSourceDestCheck() == null) return false;
        if (other.isSourceDestCheck() != null && other.isSourceDestCheck().equals(this.isSourceDestCheck()) == false) return false; 
        if (other.getGroups() == null ^ this.getGroups() == null) return false;
        if (other.getGroups() != null && other.getGroups().equals(this.getGroups()) == false) return false; 
        return true;
    }
    
}
    