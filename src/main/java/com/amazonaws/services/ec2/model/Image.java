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
 * Represents an <i>Amazon Machine Image</i> (AMI) that can be run on an
 * Amazon EC2 instance.
 * </p>
 */
public class Image {

    /**
     * The unique ID of the AMI.
     */
    private String imageId;

    /**
     * The location of the AMI.
     */
    private String imageLocation;

    /**
     * Current state of the AMI. If the operation returns available, the
     * image is successfully registered and available for launching. If the
     * operation returns deregistered, the image is deregistered and no
     * longer available for launching.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, deregistered
     */
    private String state;

    /**
     * AWS Access Key ID of the image owner.
     */
    private String ownerId;

    /**
     * True if this image has public launch permissions. False if it only has
     * implicit and explicit launch permissions.
     */
    private Boolean publicValue;

    /**
     * Product codes of the AMI.
     */
    private java.util.List<ProductCode> productCodes;

    /**
     * The architecture of the image.
     */
    private String architecture;

    /**
     * The type of image (machine, kernel, or ramdisk).
     */
    private String imageType;

    /**
     * The kernel associated with the image, if any. Only applicable for
     * machine images.
     */
    private String kernelId;

    /**
     * The RAM disk associated with the image, if any. Only applicable for
     * machine images.
     */
    private String ramdiskId;

    /**
     * The operating platform of the AMI.
     */
    private String platform;

    /**
     * The reason for the state change.
     */
    private StateReason stateReason;

    /**
     * The AWS account alias (e.g., "amazon", "redhat", "self", etc.) or AWS
     * account ID that owns the AMI.
     */
    private String imageOwnerAlias;

    /**
     * The name of the AMI that was provided during image creation.
     */
    private String name;

    /**
     * The description of the AMI that was provided during image creation.
     */
    private String description;

    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS or
     * instance store root device.
     */
    private String rootDeviceType;

    /**
     * The root device name (e.g., /dev/sda1).
     */
    private String rootDeviceName;

    /**
     * Specifies how block devices are exposed to the instance.
     */
    private java.util.List<BlockDeviceMapping> blockDeviceMappings;

    /**
     * The unique ID of the AMI.
     *
     * @return The unique ID of the AMI.
     */
    public String getImageId() {
        return imageId;
    }
    
    /**
     * The unique ID of the AMI.
     *
     * @param imageId The unique ID of the AMI.
     */
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    
    /**
     * The unique ID of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageId The unique ID of the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withImageId(String imageId) {
        this.imageId = imageId;
        return this;
    }
    
    
    /**
     * The location of the AMI.
     *
     * @return The location of the AMI.
     */
    public String getImageLocation() {
        return imageLocation;
    }
    
    /**
     * The location of the AMI.
     *
     * @param imageLocation The location of the AMI.
     */
    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }
    
    /**
     * The location of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageLocation The location of the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
        return this;
    }
    
    
    /**
     * Current state of the AMI. If the operation returns available, the
     * image is successfully registered and available for launching. If the
     * operation returns deregistered, the image is deregistered and no
     * longer available for launching.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, deregistered
     *
     * @return Current state of the AMI. If the operation returns available, the
     *         image is successfully registered and available for launching. If the
     *         operation returns deregistered, the image is deregistered and no
     *         longer available for launching.
     *
     * @see ImageState
     */
    public String getState() {
        return state;
    }
    
    /**
     * Current state of the AMI. If the operation returns available, the
     * image is successfully registered and available for launching. If the
     * operation returns deregistered, the image is deregistered and no
     * longer available for launching.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, deregistered
     *
     * @param state Current state of the AMI. If the operation returns available, the
     *         image is successfully registered and available for launching. If the
     *         operation returns deregistered, the image is deregistered and no
     *         longer available for launching.
     *
     * @see ImageState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * Current state of the AMI. If the operation returns available, the
     * image is successfully registered and available for launching. If the
     * operation returns deregistered, the image is deregistered and no
     * longer available for launching.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, deregistered
     *
     * @param state Current state of the AMI. If the operation returns available, the
     *         image is successfully registered and available for launching. If the
     *         operation returns deregistered, the image is deregistered and no
     *         longer available for launching.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see ImageState
     */
    public Image withState(String state) {
        this.state = state;
        return this;
    }
    
    
    /**
     * AWS Access Key ID of the image owner.
     *
     * @return AWS Access Key ID of the image owner.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * AWS Access Key ID of the image owner.
     *
     * @param ownerId AWS Access Key ID of the image owner.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * AWS Access Key ID of the image owner.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId AWS Access Key ID of the image owner.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    
    
    /**
     * True if this image has public launch permissions. False if it only has
     * implicit and explicit launch permissions.
     *
     * @return True if this image has public launch permissions. False if it only has
     *         implicit and explicit launch permissions.
     */
    public Boolean isPublic() {
        return publicValue;
    }
    
    /**
     * True if this image has public launch permissions. False if it only has
     * implicit and explicit launch permissions.
     *
     * @param publicValue True if this image has public launch permissions. False if it only has
     *         implicit and explicit launch permissions.
     */
    public void setPublic(Boolean publicValue) {
        this.publicValue = publicValue;
    }
    
    /**
     * True if this image has public launch permissions. False if it only has
     * implicit and explicit launch permissions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicValue True if this image has public launch permissions. False if it only has
     *         implicit and explicit launch permissions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withPublic(Boolean publicValue) {
        this.publicValue = publicValue;
        return this;
    }
    
    
    /**
     * True if this image has public launch permissions. False if it only has
     * implicit and explicit launch permissions.
     *
     * @return True if this image has public launch permissions. False if it only has
     *         implicit and explicit launch permissions.
     */
    public Boolean getPublic() {
        return publicValue;
    }
    
    /**
     * Product codes of the AMI.
     *
     * @return Product codes of the AMI.
     */
    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
            productCodes = new java.util.ArrayList<ProductCode>();
        }
        return productCodes;
    }
    
    /**
     * Product codes of the AMI.
     *
     * @param productCodes Product codes of the AMI.
     */
    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        java.util.List<ProductCode> productCodesCopy = new java.util.ArrayList<ProductCode>();
        if (productCodes != null) {
            productCodesCopy.addAll(productCodes);
        }
        this.productCodes = productCodesCopy;
    }
    
    /**
     * Product codes of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes Product codes of the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withProductCodes(ProductCode... productCodes) {
        for (ProductCode value : productCodes) {
            getProductCodes().add(value);
        }
        return this;
    }
    
    /**
     * Product codes of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes Product codes of the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withProductCodes(java.util.Collection<ProductCode> productCodes) {
        java.util.List<ProductCode> productCodesCopy = new java.util.ArrayList<ProductCode>();
        if (productCodes != null) {
            productCodesCopy.addAll(productCodes);
        }
        this.productCodes = productCodesCopy;

        return this;
    }
    
    /**
     * The architecture of the image.
     *
     * @return The architecture of the image.
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * The architecture of the image.
     *
     * @param architecture The architecture of the image.
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * The architecture of the image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param architecture The architecture of the image.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }
    
    
    /**
     * The type of image (machine, kernel, or ramdisk).
     *
     * @return The type of image (machine, kernel, or ramdisk).
     */
    public String getImageType() {
        return imageType;
    }
    
    /**
     * The type of image (machine, kernel, or ramdisk).
     *
     * @param imageType The type of image (machine, kernel, or ramdisk).
     */
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }
    
    /**
     * The type of image (machine, kernel, or ramdisk).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageType The type of image (machine, kernel, or ramdisk).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }
    
    
    /**
     * The kernel associated with the image, if any. Only applicable for
     * machine images.
     *
     * @return The kernel associated with the image, if any. Only applicable for
     *         machine images.
     */
    public String getKernelId() {
        return kernelId;
    }
    
    /**
     * The kernel associated with the image, if any. Only applicable for
     * machine images.
     *
     * @param kernelId The kernel associated with the image, if any. Only applicable for
     *         machine images.
     */
    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }
    
    /**
     * The kernel associated with the image, if any. Only applicable for
     * machine images.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param kernelId The kernel associated with the image, if any. Only applicable for
     *         machine images.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withKernelId(String kernelId) {
        this.kernelId = kernelId;
        return this;
    }
    
    
    /**
     * The RAM disk associated with the image, if any. Only applicable for
     * machine images.
     *
     * @return The RAM disk associated with the image, if any. Only applicable for
     *         machine images.
     */
    public String getRamdiskId() {
        return ramdiskId;
    }
    
    /**
     * The RAM disk associated with the image, if any. Only applicable for
     * machine images.
     *
     * @param ramdiskId The RAM disk associated with the image, if any. Only applicable for
     *         machine images.
     */
    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }
    
    /**
     * The RAM disk associated with the image, if any. Only applicable for
     * machine images.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ramdiskId The RAM disk associated with the image, if any. Only applicable for
     *         machine images.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
        return this;
    }
    
    
    /**
     * The operating platform of the AMI.
     *
     * @return The operating platform of the AMI.
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * The operating platform of the AMI.
     *
     * @param platform The operating platform of the AMI.
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * The operating platform of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param platform The operating platform of the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withPlatform(String platform) {
        this.platform = platform;
        return this;
    }
    
    
    /**
     * The reason for the state change.
     *
     * @return The reason for the state change.
     */
    public StateReason getStateReason() {
        return stateReason;
    }
    
    /**
     * The reason for the state change.
     *
     * @param stateReason The reason for the state change.
     */
    public void setStateReason(StateReason stateReason) {
        this.stateReason = stateReason;
    }
    
    /**
     * The reason for the state change.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param stateReason The reason for the state change.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withStateReason(StateReason stateReason) {
        this.stateReason = stateReason;
        return this;
    }
    
    
    /**
     * The AWS account alias (e.g., "amazon", "redhat", "self", etc.) or AWS
     * account ID that owns the AMI.
     *
     * @return The AWS account alias (e.g., "amazon", "redhat", "self", etc.) or AWS
     *         account ID that owns the AMI.
     */
    public String getImageOwnerAlias() {
        return imageOwnerAlias;
    }
    
    /**
     * The AWS account alias (e.g., "amazon", "redhat", "self", etc.) or AWS
     * account ID that owns the AMI.
     *
     * @param imageOwnerAlias The AWS account alias (e.g., "amazon", "redhat", "self", etc.) or AWS
     *         account ID that owns the AMI.
     */
    public void setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
    }
    
    /**
     * The AWS account alias (e.g., "amazon", "redhat", "self", etc.) or AWS
     * account ID that owns the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageOwnerAlias The AWS account alias (e.g., "amazon", "redhat", "self", etc.) or AWS
     *         account ID that owns the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
        return this;
    }
    
    
    /**
     * The name of the AMI that was provided during image creation.
     *
     * @return The name of the AMI that was provided during image creation.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the AMI that was provided during image creation.
     *
     * @param name The name of the AMI that was provided during image creation.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the AMI that was provided during image creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param name The name of the AMI that was provided during image creation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withName(String name) {
        this.name = name;
        return this;
    }
    
    
    /**
     * The description of the AMI that was provided during image creation.
     *
     * @return The description of the AMI that was provided during image creation.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * The description of the AMI that was provided during image creation.
     *
     * @param description The description of the AMI that was provided during image creation.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * The description of the AMI that was provided during image creation.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description The description of the AMI that was provided during image creation.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withDescription(String description) {
        this.description = description;
        return this;
    }
    
    
    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS or
     * instance store root device.
     *
     * @return The root device type used by the AMI. The AMI can use an Amazon EBS or
     *         instance store root device.
     */
    public String getRootDeviceType() {
        return rootDeviceType;
    }
    
    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS or
     * instance store root device.
     *
     * @param rootDeviceType The root device type used by the AMI. The AMI can use an Amazon EBS or
     *         instance store root device.
     */
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }
    
    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS or
     * instance store root device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rootDeviceType The root device type used by the AMI. The AMI can use an Amazon EBS or
     *         instance store root device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
        return this;
    }
    
    
    /**
     * The root device name (e.g., /dev/sda1).
     *
     * @return The root device name (e.g., /dev/sda1).
     */
    public String getRootDeviceName() {
        return rootDeviceName;
    }
    
    /**
     * The root device name (e.g., /dev/sda1).
     *
     * @param rootDeviceName The root device name (e.g., /dev/sda1).
     */
    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }
    
    /**
     * The root device name (e.g., /dev/sda1).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rootDeviceName The root device name (e.g., /dev/sda1).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
        return this;
    }
    
    
    /**
     * Specifies how block devices are exposed to the instance.
     *
     * @return Specifies how block devices are exposed to the instance.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new java.util.ArrayList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }
    
    /**
     * Specifies how block devices are exposed to the instance.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance.
     */
    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        java.util.List<BlockDeviceMapping> blockDeviceMappingsCopy = new java.util.ArrayList<BlockDeviceMapping>();
        if (blockDeviceMappings != null) {
            blockDeviceMappingsCopy.addAll(blockDeviceMappings);
        }
        this.blockDeviceMappings = blockDeviceMappingsCopy;
    }
    
    /**
     * Specifies how block devices are exposed to the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        for (BlockDeviceMapping value : blockDeviceMappings) {
            getBlockDeviceMappings().add(value);
        }
        return this;
    }
    
    /**
     * Specifies how block devices are exposed to the instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public Image withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
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
        sb.append("ImageLocation: " + imageLocation + ", ");
        sb.append("State: " + state + ", ");
        sb.append("OwnerId: " + ownerId + ", ");
        sb.append("Public: " + publicValue + ", ");
        sb.append("ProductCodes: " + productCodes + ", ");
        sb.append("Architecture: " + architecture + ", ");
        sb.append("ImageType: " + imageType + ", ");
        sb.append("KernelId: " + kernelId + ", ");
        sb.append("RamdiskId: " + ramdiskId + ", ");
        sb.append("Platform: " + platform + ", ");
        sb.append("StateReason: " + stateReason + ", ");
        sb.append("ImageOwnerAlias: " + imageOwnerAlias + ", ");
        sb.append("Name: " + name + ", ");
        sb.append("Description: " + description + ", ");
        sb.append("RootDeviceType: " + rootDeviceType + ", ");
        sb.append("RootDeviceName: " + rootDeviceName + ", ");
        sb.append("BlockDeviceMappings: " + blockDeviceMappings + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    