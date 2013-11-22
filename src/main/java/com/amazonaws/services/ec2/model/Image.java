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
 * Represents an <i>Amazon Machine Image</i> (AMI) that can be run on an Amazon EC2 instance.
 * </p>
 */
public class Image implements Serializable {

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
    private com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode> productCodes;

    /**
     * The architecture of the image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     */
    private String architecture;

    /**
     * The type of image (machine, kernel, or ramdisk).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     */
    private String platform;

    private String sriovNetSupport;

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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     */
    private String rootDeviceType;

    /**
     * The root device name (e.g., <code>/dev/sda1</code>).
     */
    private String rootDeviceName;

    /**
     * Specifies how block devices are exposed to the instance.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    private String virtualizationType;

    /**
     * A list of tags for the Image.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    private String hypervisor;

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
    public void setState(ImageState state) {
        this.state = state.toString();
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
    public Image withState(ImageState state) {
        this.state = state.toString();
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
              productCodes = new com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode>();
              productCodes.setAutoConstruct(true);
        }
        return productCodes;
    }
    
    /**
     * Product codes of the AMI.
     *
     * @param productCodes Product codes of the AMI.
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
        if (getProductCodes() == null) setProductCodes(new java.util.ArrayList<ProductCode>(productCodes.length));
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
     * The architecture of the image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @return The architecture of the image.
     *
     * @see ArchitectureValues
     */
    public String getArchitecture() {
        return architecture;
    }
    
    /**
     * The architecture of the image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the image.
     *
     * @see ArchitectureValues
     */
    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }
    
    /**
     * The architecture of the image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the image.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ArchitectureValues
     */
    public Image withArchitecture(String architecture) {
        this.architecture = architecture;
        return this;
    }

    /**
     * The architecture of the image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the image.
     *
     * @see ArchitectureValues
     */
    public void setArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
    }
    
    /**
     * The architecture of the image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>i386, x86_64
     *
     * @param architecture The architecture of the image.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ArchitectureValues
     */
    public Image withArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * The type of image (machine, kernel, or ramdisk).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @return The type of image (machine, kernel, or ramdisk).
     *
     * @see ImageTypeValues
     */
    public String getImageType() {
        return imageType;
    }
    
    /**
     * The type of image (machine, kernel, or ramdisk).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @param imageType The type of image (machine, kernel, or ramdisk).
     *
     * @see ImageTypeValues
     */
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }
    
    /**
     * The type of image (machine, kernel, or ramdisk).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @param imageType The type of image (machine, kernel, or ramdisk).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ImageTypeValues
     */
    public Image withImageType(String imageType) {
        this.imageType = imageType;
        return this;
    }

    /**
     * The type of image (machine, kernel, or ramdisk).
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @param imageType The type of image (machine, kernel, or ramdisk).
     *
     * @see ImageTypeValues
     */
    public void setImageType(ImageTypeValues imageType) {
        this.imageType = imageType.toString();
    }
    
    /**
     * The type of image (machine, kernel, or ramdisk).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @param imageType The type of image (machine, kernel, or ramdisk).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ImageTypeValues
     */
    public Image withImageType(ImageTypeValues imageType) {
        this.imageType = imageType.toString();
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @return The operating platform of the AMI.
     *
     * @see PlatformValues
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * The operating platform of the AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The operating platform of the AMI.
     *
     * @see PlatformValues
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * The operating platform of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The operating platform of the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see PlatformValues
     */
    public Image withPlatform(String platform) {
        this.platform = platform;
        return this;
    }

    /**
     * The operating platform of the AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The operating platform of the AMI.
     *
     * @see PlatformValues
     */
    public void setPlatform(PlatformValues platform) {
        this.platform = platform.toString();
    }
    
    /**
     * The operating platform of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The operating platform of the AMI.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see PlatformValues
     */
    public Image withPlatform(PlatformValues platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * Returns the value of the SriovNetSupport property for this object.
     *
     * @return The value of the SriovNetSupport property for this object.
     */
    public String getSriovNetSupport() {
        return sriovNetSupport;
    }
    
    /**
     * Sets the value of the SriovNetSupport property for this object.
     *
     * @param sriovNetSupport The new value for the SriovNetSupport property for this object.
     */
    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }
    
    /**
     * Sets the value of the SriovNetSupport property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sriovNetSupport The new value for the SriovNetSupport property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Image withSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @return The root device type used by the AMI. The AMI can use an Amazon EBS or
     *         instance store root device.
     *
     * @see DeviceType
     */
    public String getRootDeviceType() {
        return rootDeviceType;
    }
    
    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS or
     * instance store root device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The root device type used by the AMI. The AMI can use an Amazon EBS or
     *         instance store root device.
     *
     * @see DeviceType
     */
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }
    
    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS or
     * instance store root device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The root device type used by the AMI. The AMI can use an Amazon EBS or
     *         instance store root device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see DeviceType
     */
    public Image withRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
        return this;
    }

    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS or
     * instance store root device.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The root device type used by the AMI. The AMI can use an Amazon EBS or
     *         instance store root device.
     *
     * @see DeviceType
     */
    public void setRootDeviceType(DeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
    }
    
    /**
     * The root device type used by the AMI. The AMI can use an Amazon EBS or
     * instance store root device.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The root device type used by the AMI. The AMI can use an Amazon EBS or
     *         instance store root device.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see DeviceType
     */
    public Image withRootDeviceType(DeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
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
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * Specifies how block devices are exposed to the instance.
     *
     * @param blockDeviceMappings Specifies how block devices are exposed to the instance.
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
        if (getBlockDeviceMappings() == null) setBlockDeviceMappings(new java.util.ArrayList<BlockDeviceMapping>(blockDeviceMappings.length));
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
     * Returns the value of the VirtualizationType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @return The value of the VirtualizationType property for this object.
     *
     * @see VirtualizationType
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }
    
    /**
     * Sets the value of the VirtualizationType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The new value for the VirtualizationType property for this object.
     *
     * @see VirtualizationType
     */
    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }
    
    /**
     * Sets the value of the VirtualizationType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The new value for the VirtualizationType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see VirtualizationType
     */
    public Image withVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
        return this;
    }

    /**
     * Sets the value of the VirtualizationType property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The new value for the VirtualizationType property for this object.
     *
     * @see VirtualizationType
     */
    public void setVirtualizationType(VirtualizationType virtualizationType) {
        this.virtualizationType = virtualizationType.toString();
    }
    
    /**
     * Sets the value of the VirtualizationType property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The new value for the VirtualizationType property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see VirtualizationType
     */
    public Image withVirtualizationType(VirtualizationType virtualizationType) {
        this.virtualizationType = virtualizationType.toString();
        return this;
    }

    /**
     * A list of tags for the Image.
     *
     * @return A list of tags for the Image.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of tags for the Image.
     *
     * @param tags A list of tags for the Image.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of tags for the Image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the Image.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Image withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of tags for the Image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of tags for the Image.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public Image withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the Hypervisor property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @return The value of the Hypervisor property for this object.
     *
     * @see HypervisorType
     */
    public String getHypervisor() {
        return hypervisor;
    }
    
    /**
     * Sets the value of the Hypervisor property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The new value for the Hypervisor property for this object.
     *
     * @see HypervisorType
     */
    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }
    
    /**
     * Sets the value of the Hypervisor property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The new value for the Hypervisor property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see HypervisorType
     */
    public Image withHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
        return this;
    }

    /**
     * Sets the value of the Hypervisor property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The new value for the Hypervisor property for this object.
     *
     * @see HypervisorType
     */
    public void setHypervisor(HypervisorType hypervisor) {
        this.hypervisor = hypervisor.toString();
    }
    
    /**
     * Sets the value of the Hypervisor property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The new value for the Hypervisor property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see HypervisorType
     */
    public Image withHypervisor(HypervisorType hypervisor) {
        this.hypervisor = hypervisor.toString();
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
        if (getImageLocation() != null) sb.append("ImageLocation: " + getImageLocation() + ",");
        if (getState() != null) sb.append("State: " + getState() + ",");
        if (getOwnerId() != null) sb.append("OwnerId: " + getOwnerId() + ",");
        if (isPublic() != null) sb.append("Public: " + isPublic() + ",");
        if (getProductCodes() != null) sb.append("ProductCodes: " + getProductCodes() + ",");
        if (getArchitecture() != null) sb.append("Architecture: " + getArchitecture() + ",");
        if (getImageType() != null) sb.append("ImageType: " + getImageType() + ",");
        if (getKernelId() != null) sb.append("KernelId: " + getKernelId() + ",");
        if (getRamdiskId() != null) sb.append("RamdiskId: " + getRamdiskId() + ",");
        if (getPlatform() != null) sb.append("Platform: " + getPlatform() + ",");
        if (getSriovNetSupport() != null) sb.append("SriovNetSupport: " + getSriovNetSupport() + ",");
        if (getStateReason() != null) sb.append("StateReason: " + getStateReason() + ",");
        if (getImageOwnerAlias() != null) sb.append("ImageOwnerAlias: " + getImageOwnerAlias() + ",");
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getRootDeviceType() != null) sb.append("RootDeviceType: " + getRootDeviceType() + ",");
        if (getRootDeviceName() != null) sb.append("RootDeviceName: " + getRootDeviceName() + ",");
        if (getBlockDeviceMappings() != null) sb.append("BlockDeviceMappings: " + getBlockDeviceMappings() + ",");
        if (getVirtualizationType() != null) sb.append("VirtualizationType: " + getVirtualizationType() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() + ",");
        if (getHypervisor() != null) sb.append("Hypervisor: " + getHypervisor() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode()); 
        hashCode = prime * hashCode + ((getImageLocation() == null) ? 0 : getImageLocation().hashCode()); 
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode()); 
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode()); 
        hashCode = prime * hashCode + ((isPublic() == null) ? 0 : isPublic().hashCode()); 
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode()); 
        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode()); 
        hashCode = prime * hashCode + ((getImageType() == null) ? 0 : getImageType().hashCode()); 
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode()); 
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode()); 
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode()); 
        hashCode = prime * hashCode + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode()); 
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode()); 
        hashCode = prime * hashCode + ((getImageOwnerAlias() == null) ? 0 : getImageOwnerAlias().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getRootDeviceType() == null) ? 0 : getRootDeviceType().hashCode()); 
        hashCode = prime * hashCode + ((getRootDeviceName() == null) ? 0 : getRootDeviceName().hashCode()); 
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode()); 
        hashCode = prime * hashCode + ((getVirtualizationType() == null) ? 0 : getVirtualizationType().hashCode()); 
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode()); 
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Image == false) return false;
        Image other = (Image)obj;
        
        if (other.getImageId() == null ^ this.getImageId() == null) return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false) return false; 
        if (other.getImageLocation() == null ^ this.getImageLocation() == null) return false;
        if (other.getImageLocation() != null && other.getImageLocation().equals(this.getImageLocation()) == false) return false; 
        if (other.getState() == null ^ this.getState() == null) return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false) return false; 
        if (other.getOwnerId() == null ^ this.getOwnerId() == null) return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false) return false; 
        if (other.isPublic() == null ^ this.isPublic() == null) return false;
        if (other.isPublic() != null && other.isPublic().equals(this.isPublic()) == false) return false; 
        if (other.getProductCodes() == null ^ this.getProductCodes() == null) return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false) return false; 
        if (other.getArchitecture() == null ^ this.getArchitecture() == null) return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false) return false; 
        if (other.getImageType() == null ^ this.getImageType() == null) return false;
        if (other.getImageType() != null && other.getImageType().equals(this.getImageType()) == false) return false; 
        if (other.getKernelId() == null ^ this.getKernelId() == null) return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false) return false; 
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null) return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false) return false; 
        if (other.getPlatform() == null ^ this.getPlatform() == null) return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false) return false; 
        if (other.getSriovNetSupport() == null ^ this.getSriovNetSupport() == null) return false;
        if (other.getSriovNetSupport() != null && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false) return false; 
        if (other.getStateReason() == null ^ this.getStateReason() == null) return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false) return false; 
        if (other.getImageOwnerAlias() == null ^ this.getImageOwnerAlias() == null) return false;
        if (other.getImageOwnerAlias() != null && other.getImageOwnerAlias().equals(this.getImageOwnerAlias()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getRootDeviceType() == null ^ this.getRootDeviceType() == null) return false;
        if (other.getRootDeviceType() != null && other.getRootDeviceType().equals(this.getRootDeviceType()) == false) return false; 
        if (other.getRootDeviceName() == null ^ this.getRootDeviceName() == null) return false;
        if (other.getRootDeviceName() != null && other.getRootDeviceName().equals(this.getRootDeviceName()) == false) return false; 
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null) return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false) return false; 
        if (other.getVirtualizationType() == null ^ this.getVirtualizationType() == null) return false;
        if (other.getVirtualizationType() != null && other.getVirtualizationType().equals(this.getVirtualizationType()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        if (other.getHypervisor() == null ^ this.getHypervisor() == null) return false;
        if (other.getHypervisor() != null && other.getHypervisor().equals(this.getHypervisor()) == false) return false; 
        return true;
    }
    
}
    