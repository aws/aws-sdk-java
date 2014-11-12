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
 * Describes an image attribute.
 * </p>
 */
public class ImageAttribute implements Serializable {

    /**
     * The ID of the AMI.
     */
    private String imageId;

    /**
     * One or more launch permissions.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission> launchPermissions;

    /**
     * One or more product codes.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode> productCodes;

    /**
     * The kernel ID.
     */
    private String kernelId;

    /**
     * The RAM disk ID.
     */
    private String ramdiskId;

    /**
     * A description for the AMI.
     */
    private String description;

    /**
     * The value to use for a resource attribute.
     */
    private String sriovNetSupport;

    /**
     * One or more block device mapping entries.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    /**
     * The ID of the AMI.
     *
     * @return The ID of the AMI.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the AMI.
     *
     * @param imageId The ID of the AMI.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The ID of the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageAttribute withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }

    /**
     * One or more launch permissions.
     *
     * @return One or more launch permissions.
     */
    public java.util.List<LaunchPermission> getLaunchPermissions() {
        if (launchPermissions == null) {
              launchPermissions = new com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission>();
              launchPermissions.setAutoConstruct(true);
        }
        return launchPermissions;
    }
    
    /**
     * One or more launch permissions.
     *
     * @param launchPermissions One or more launch permissions.
     */
    public void setLaunchPermissions(java.util.Collection<LaunchPermission> launchPermissions) {
        if (launchPermissions == null) {
            this.launchPermissions = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission> launchPermissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission>(launchPermissions.size());
        launchPermissionsCopy.addAll(launchPermissions);
        this.launchPermissions = launchPermissionsCopy;
    }
    
    /**
     * One or more launch permissions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchPermissions One or more launch permissions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageAttribute withLaunchPermissions(LaunchPermission... launchPermissions) {
        if (getLaunchPermissions() == null) setLaunchPermissions(new java.util.ArrayList<LaunchPermission>(launchPermissions.length));
        for (LaunchPermission value : launchPermissions) {
            getLaunchPermissions().add(value);
        }
        return this;
    }
    
    /**
     * One or more launch permissions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchPermissions One or more launch permissions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageAttribute withLaunchPermissions(java.util.Collection<LaunchPermission> launchPermissions) {
        if (launchPermissions == null) {
            this.launchPermissions = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission> launchPermissionsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LaunchPermission>(launchPermissions.size());
            launchPermissionsCopy.addAll(launchPermissions);
            this.launchPermissions = launchPermissionsCopy;
        }

        return this;
    }

    /**
     * One or more product codes.
     *
     * @return One or more product codes.
     */
    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
              productCodes = new com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode>();
              productCodes.setAutoConstruct(true);
        }
        return productCodes;
    }
    
    /**
     * One or more product codes.
     *
     * @param productCodes One or more product codes.
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
     * One or more product codes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes One or more product codes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageAttribute withProductCodes(ProductCode... productCodes) {
        if (getProductCodes() == null) setProductCodes(new java.util.ArrayList<ProductCode>(productCodes.length));
        for (ProductCode value : productCodes) {
            getProductCodes().add(value);
        }
        return this;
    }
    
    /**
     * One or more product codes.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes One or more product codes.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageAttribute withProductCodes(java.util.Collection<ProductCode> productCodes) {
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
    public ImageAttribute withKernelId(String kernelId) {
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
    public ImageAttribute withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }

    /**
     * A description for the AMI.
     *
     * @return A description for the AMI.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A description for the AMI.
     *
     * @param description A description for the AMI.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A description for the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A description for the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageAttribute withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * The value to use for a resource attribute.
     *
     * @return The value to use for a resource attribute.
     */
    public String getSriovNetSupport() {
        return sriovNetSupport;
    }
    
    /**
     * The value to use for a resource attribute.
     *
     * @param sriovNetSupport The value to use for a resource attribute.
     */
    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }
    
    /**
     * The value to use for a resource attribute.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sriovNetSupport The value to use for a resource attribute.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageAttribute withSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
        return this;
    }

    /**
     * One or more block device mapping entries.
     *
     * @return One or more block device mapping entries.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * One or more block device mapping entries.
     *
     * @param blockDeviceMappings One or more block device mapping entries.
     */
    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>(blockDeviceMappings.size());
        blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * One or more block device mapping entries.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings One or more block device mapping entries.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageAttribute withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.length));
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * One or more block device mapping entries.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings One or more block device mapping entries.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ImageAttribute withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappingsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>(blockDeviceMappings.size());
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
            this.blockDeviceMappings = blockDeviceMappingsCopy;
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
        if (getImageId() != null) sb.append("ImageId: " + getImageId() + ",");
        if (getLaunchPermissions() != null) sb.append("LaunchPermissions: " + getLaunchPermissions() + ",");
        if (getProductCodes() != null) sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getKernelId() != null) sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null) sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getSriovNetSupport() != null) sb.append("SriovNetSupport: " + getSriovNetSupport() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode()); 
        hashCode = prime * hashCode + ((getLaunchPermissions() == null) ? 0 : getLaunchPermissions().hashCode()); 
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode()); 
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode()); 
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ImageAttribute == false) return false;
        ImageAttribute other = (ImageAttribute)obj;
        
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false; 
        if (other.getLaunchPermissions() == null ^ this.getLaunchPermissions() == null) return false;
        if (other.getLaunchPermissions() != null && other.getLaunchPermissions().equals(this.getLaunchPermissions()) == false) return false; 
        if (other.getProductCodes() == null ^ this.getProductCodes() == null) return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false) return false; 
        if (other.getKernelId() == null ^ this.getKernelId() == null) return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false) return false; 
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null) return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getSriovNetSupport() == null ^ this.getSriovNetSupport() == null) return false;
        if (other.getSriovNetSupport() != null && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        return true;
    }
    
}
    