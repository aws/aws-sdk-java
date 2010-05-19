/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Represents an attribute of an <i>Amazon Machine Image</i> (AMI).
 * </p>
 */
public class ImageAttribute {

    /**
     * The ID of the associated AMI.
     */
    private String imageId;

    /**
     * Launch permissions for the associated AMI.
     */
    private java.util.List<LaunchPermission> launchPermissions;

    /**
     * Product codes for the associated AMI.
     */
    private java.util.List<ProductCode> productCodes;

    /**
     * Kernel ID of the associated AMI.
     */
    private String kernelId;

    /**
     * Ramdisk ID of the associated AMI.
     */
    private String ramdiskId;

    /**
     * User-created description of the associated AMI.
     */
    private String description;

    /**
     * Block device mappings for the associated AMI.
     */
    private java.util.List<BlockDeviceMapping> blockDeviceMappings;

    /**
     * The ID of the associated AMI.
     *
     * @return The ID of the associated AMI.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The ID of the associated AMI.
     *
     * @param imageId The ID of the associated AMI.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The ID of the associated AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The ID of the associated AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImageAttribute withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    
    
    /**
     * Launch permissions for the associated AMI.
     *
     * @return Launch permissions for the associated AMI.
     */
    public java.util.List<LaunchPermission> getLaunchPermissions() {
        if (launchPermissions == null) {
            launchPermissions = new java.util.ArrayList<LaunchPermission>();
        }
        return launchPermissions;
    }
    
    /**
     * Launch permissions for the associated AMI.
     *
     * @param launchPermissions Launch permissions for the associated AMI.
     */
    public void setLaunchPermissions(java.util.Collection<LaunchPermission> launchPermissions) {
        java.util.List<LaunchPermission> launchPermissionsCopy = new java.util.ArrayList<LaunchPermission>();
        if (launchPermissions != null) {
            launchPermissionsCopy.addAll(launchPermissions);
        }
        this.launchPermissions = launchPermissionsCopy;
    }
    
    /**
     * Launch permissions for the associated AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchPermissions Launch permissions for the associated AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImageAttribute withLaunchPermissions(LaunchPermission... launchPermissions) {
        for (LaunchPermission value : launchPermissions) {
            getLaunchPermissions().add(value);
        }
        return this;
    }
    
    /**
     * Launch permissions for the associated AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param launchPermissions Launch permissions for the associated AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImageAttribute withLaunchPermissions(java.util.Collection<LaunchPermission> launchPermissions) {
        java.util.List<LaunchPermission> launchPermissionsCopy = new java.util.ArrayList<LaunchPermission>();
        if (launchPermissions != null) {
            launchPermissionsCopy.addAll(launchPermissions);
        }
        this.launchPermissions = launchPermissionsCopy;

        return this;
    }
    
    /**
     * Product codes for the associated AMI.
     *
     * @return Product codes for the associated AMI.
     */
    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
            productCodes = new java.util.ArrayList<ProductCode>();
        }
        return productCodes;
    }
    
    /**
     * Product codes for the associated AMI.
     *
     * @param productCodes Product codes for the associated AMI.
     */
    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        java.util.List<ProductCode> productCodesCopy = new java.util.ArrayList<ProductCode>();
        if (productCodes != null) {
            productCodesCopy.addAll(productCodes);
        }
        this.productCodes = productCodesCopy;
    }
    
    /**
     * Product codes for the associated AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes Product codes for the associated AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImageAttribute withProductCodes(ProductCode... productCodes) {
        for (ProductCode value : productCodes) {
            getProductCodes().add(value);
        }
        return this;
    }
    
    /**
     * Product codes for the associated AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes Product codes for the associated AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImageAttribute withProductCodes(java.util.Collection<ProductCode> productCodes) {
        java.util.List<ProductCode> productCodesCopy = new java.util.ArrayList<ProductCode>();
        if (productCodes != null) {
            productCodesCopy.addAll(productCodes);
        }
        this.productCodes = productCodesCopy;

        return this;
    }
    
    /**
     * Kernel ID of the associated AMI.
     *
     * @return Kernel ID of the associated AMI.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * Kernel ID of the associated AMI.
     *
     * @param kernelId Kernel ID of the associated AMI.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * Kernel ID of the associated AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernelId Kernel ID of the associated AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImageAttribute withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }
    
    
    /**
     * Ramdisk ID of the associated AMI.
     *
     * @return Ramdisk ID of the associated AMI.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * Ramdisk ID of the associated AMI.
     *
     * @param ramdiskId Ramdisk ID of the associated AMI.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * Ramdisk ID of the associated AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdiskId Ramdisk ID of the associated AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImageAttribute withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }
    
    
    /**
     * User-created description of the associated AMI.
     *
     * @return User-created description of the associated AMI.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * User-created description of the associated AMI.
     *
     * @param description User-created description of the associated AMI.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * User-created description of the associated AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description User-created description of the associated AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImageAttribute withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * Block device mappings for the associated AMI.
     *
     * @return Block device mappings for the associated AMI.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new java.util.ArrayList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }
    
    /**
     * Block device mappings for the associated AMI.
     *
     * @param blockDeviceMappings Block device mappings for the associated AMI.
     */
    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        java.util.List<BlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<BlockDeviceMapping>();
        if (blockDeviceMappings != null) {
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        }
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * Block device mappings for the associated AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Block device mappings for the associated AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImageAttribute withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * Block device mappings for the associated AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Block device mappings for the associated AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ImageAttribute withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        java.util.List<BlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<BlockDeviceMapping>();
        if (blockDeviceMappings != null) {
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        }
        this.blockDeviceMappings = blockDeviceMappingsCopy;

        return this;
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        
        sb.append("ImageId: " + imageId + ", ");
        sb.append("LaunchPermissions: " + launchPermissions + ", ");
        sb.append("ProductCodes: " + productCodes + ", ");
        sb.append("KernelId: " + kernelId + ", ");
        sb.append("RamdiskId: " + ramdiskId + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("BlockDeviceMappings: " + blockDeviceMappings + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    