/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Represents an attribute of an Amazon EC2 instance.
 * </p>
 */
public class InstanceAttribute implements Serializable {

    /**
     * The ID of the associated instance.
     */
    private String instanceId;

    /**
     * The instance type (e.g., <code>m1.small</code>,
     * <code>c1.medium</code>, <code>m2.2xlarge</code>, and so on).
     */
    private String instanceType;

    /**
     * The kernel ID of the associated instance.
     */
    private String kernelId;

    /**
     * The ramdisk ID of the associated instance.
     */
    private String ramdiskId;

    /**
     * MIME, Base64-encoded user data.
     */
    private String userData;

    /**
     * Whether this instance can be terminated. You must modify this
     * attribute before you can terminate any "locked" instances.
     */
    private Boolean disableApiTermination;

    /**
     * Whether this instance's Amazon EBS volumes are deleted when the
     * instance is shut down.
     */
    private String instanceInitiatedShutdownBehavior;

    /**
     * The root device name (e.g., <code>/dev/sda1</code>).
     */
    private String rootDeviceName;

    /**
     * How block devices are exposed to this instance. Each mapping is made
     * up of a virtualName and a deviceName.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMapping> blockDeviceMappings;

    private com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode> productCodes;

    /**
     * Boolean value
     */
    private Boolean ebsOptimized;

    /**
     * String value
     */
    private String sriovNetSupport;

    /**
     * The ID of the associated instance.
     *
     * @return The ID of the associated instance.
     */
    public String getInstanceId() {
        return instanceId;
    }
    
    /**
     * The ID of the associated instance.
     *
     * @param instanceId The ID of the associated instance.
     */
    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }
    
    /**
     * The ID of the associated instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceId The ID of the associated instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceAttribute withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * The instance type (e.g., <code>m1.small</code>,
     * <code>c1.medium</code>, <code>m2.2xlarge</code>, and so on).
     *
     * @return The instance type (e.g., <code>m1.small</code>,
     *         <code>c1.medium</code>, <code>m2.2xlarge</code>, and so on).
     */
    public String getInstanceType() {
        return instanceType;
    }
    
    /**
     * The instance type (e.g., <code>m1.small</code>,
     * <code>c1.medium</code>, <code>m2.2xlarge</code>, and so on).
     *
     * @param instanceType The instance type (e.g., <code>m1.small</code>,
     *         <code>c1.medium</code>, <code>m2.2xlarge</code>, and so on).
     */
    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }
    
    /**
     * The instance type (e.g., <code>m1.small</code>,
     * <code>c1.medium</code>, <code>m2.2xlarge</code>, and so on).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceType The instance type (e.g., <code>m1.small</code>,
     *         <code>c1.medium</code>, <code>m2.2xlarge</code>, and so on).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceAttribute withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * The kernel ID of the associated instance.
     *
     * @return The kernel ID of the associated instance.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * The kernel ID of the associated instance.
     *
     * @param kernelId The kernel ID of the associated instance.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * The kernel ID of the associated instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernelId The kernel ID of the associated instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceAttribute withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }

    /**
     * The ramdisk ID of the associated instance.
     *
     * @return The ramdisk ID of the associated instance.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * The ramdisk ID of the associated instance.
     *
     * @param ramdiskId The ramdisk ID of the associated instance.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * The ramdisk ID of the associated instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdiskId The ramdisk ID of the associated instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceAttribute withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * MIME, Base64-encoded user data.
     *
     * @return MIME, Base64-encoded user data.
     */
    public String getUserData() {
        return userData;
    }
    
    /**
     * MIME, Base64-encoded user data.
     *
     * @param userData MIME, Base64-encoded user data.
     */
    public void setUserData(String userData) {
        this.userData = userData;
    }
    
    /**
     * MIME, Base64-encoded user data.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param userData MIME, Base64-encoded user data.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceAttribute withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /**
     * Whether this instance can be terminated. You must modify this
     * attribute before you can terminate any "locked" instances.
     *
     * @return Whether this instance can be terminated. You must modify this
     *         attribute before you can terminate any "locked" instances.
     */
    public Boolean isDisableApiTermination() {
        return disableApiTermination;
    }
    
    /**
     * Whether this instance can be terminated. You must modify this
     * attribute before you can terminate any "locked" instances.
     *
     * @param disableApiTermination Whether this instance can be terminated. You must modify this
     *         attribute before you can terminate any "locked" instances.
     */
    public void setDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
    }
    
    /**
     * Whether this instance can be terminated. You must modify this
     * attribute before you can terminate any "locked" instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param disableApiTermination Whether this instance can be terminated. You must modify this
     *         attribute before you can terminate any "locked" instances.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceAttribute withDisableApiTermination(Boolean disableApiTermination) {
        this.disableApiTermination = disableApiTermination;
        return this;
    }

    /**
     * Whether this instance can be terminated. You must modify this
     * attribute before you can terminate any "locked" instances.
     *
     * @return Whether this instance can be terminated. You must modify this
     *         attribute before you can terminate any "locked" instances.
     */
    public Boolean getDisableApiTermination() {
        return disableApiTermination;
    }

    /**
     * Whether this instance's Amazon EBS volumes are deleted when the
     * instance is shut down.
     *
     * @return Whether this instance's Amazon EBS volumes are deleted when the
     *         instance is shut down.
     */
    public String getInstanceInitiatedShutdownBehavior() {
        return instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Whether this instance's Amazon EBS volumes are deleted when the
     * instance is shut down.
     *
     * @param instanceInitiatedShutdownBehavior Whether this instance's Amazon EBS volumes are deleted when the
     *         instance is shut down.
     */
    public void setInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
    }
    
    /**
     * Whether this instance's Amazon EBS volumes are deleted when the
     * instance is shut down.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instanceInitiatedShutdownBehavior Whether this instance's Amazon EBS volumes are deleted when the
     *         instance is shut down.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceAttribute withInstanceInitiatedShutdownBehavior(String instanceInitiatedShutdownBehavior) {
        this.instanceInitiatedShutdownBehavior = instanceInitiatedShutdownBehavior;
        return this;
    }

    /**
     * The root device name (e.g., <code>/dev/sda1</code>).
     *
     * @return The root device name (e.g., <code>/dev/sda1</code>).
     */
    public String getRootDeviceName() {
        return rootDeviceName;
    }
    
    /**
     * The root device name (e.g., <code>/dev/sda1</code>).
     *
     * @param rootDeviceName The root device name (e.g., <code>/dev/sda1</code>).
     */
    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }
    
    /**
     * The root device name (e.g., <code>/dev/sda1</code>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rootDeviceName The root device name (e.g., <code>/dev/sda1</code>).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceAttribute withRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
        return this;
    }

    /**
     * How block devices are exposed to this instance. Each mapping is made
     * up of a virtualName and a deviceName.
     *
     * @return How block devices are exposed to this instance. Each mapping is made
     *         up of a virtualName and a deviceName.
     */
    public java.util.List<InstanceBlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<InstanceBlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * How block devices are exposed to this instance. Each mapping is made
     * up of a virtualName and a deviceName.
     *
     * @param blockDeviceMappings How block devices are exposed to this instance. Each mapping is made
     *         up of a virtualName and a deviceName.
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
     * How block devices are exposed to this instance. Each mapping is made
     * up of a virtualName and a deviceName.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings How block devices are exposed to this instance. Each mapping is made
     *         up of a virtualName and a deviceName.
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
     * How block devices are exposed to this instance. Each mapping is made
     * up of a virtualName and a deviceName.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings How block devices are exposed to this instance. Each mapping is made
     *         up of a virtualName and a deviceName.
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
     * Returns the value of the ProductCodes property for this object.
     *
     * @return The value of the ProductCodes property for this object.
     */
    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
              productCodes = new com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode>();
              productCodes.setAutoConstruct(true);
        }
        return productCodes;
    }
    
    /**
     * Sets the value of the ProductCodes property for this object.
     *
     * @param productCodes The new value for the ProductCodes property for this object.
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
     * Sets the value of the ProductCodes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes The new value for the ProductCodes property for this object.
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
     * Sets the value of the ProductCodes property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes The new value for the ProductCodes property for this object.
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
     * Boolean value
     *
     * @return Boolean value
     */
    public Boolean isEbsOptimized() {
        return ebsOptimized;
    }
    
    /**
     * Boolean value
     *
     * @param ebsOptimized Boolean value
     */
    public void setEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
    }
    
    /**
     * Boolean value
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ebsOptimized Boolean value
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceAttribute withEbsOptimized(Boolean ebsOptimized) {
        this.ebsOptimized = ebsOptimized;
        return this;
    }

    /**
     * Boolean value
     *
     * @return Boolean value
     */
    public Boolean getEbsOptimized() {
        return ebsOptimized;
    }

    /**
     * String value
     *
     * @return String value
     */
    public String getSriovNetSupport() {
        return sriovNetSupport;
    }
    
    /**
     * String value
     *
     * @param sriovNetSupport String value
     */
    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }
    
    /**
     * String value
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sriovNetSupport String value
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InstanceAttribute withSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
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
        if (getSriovNetSupport() != null) sb.append("SriovNetSupport: " + getSriovNetSupport() );
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
        return true;
    }
    
}
    