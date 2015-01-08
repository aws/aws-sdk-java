/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes an image.
 * </p>
 */
public class Image implements Serializable {

    /**
     * The ID of the AMI.
     */
    private String imageId;

    /**
     * The location of the AMI.
     */
    private String imageLocation;

    /**
     * The current state of the AMI. If the state is <code>available</code>,
     * the image is successfully registered and can be used to launch an
     * instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, deregistered
     */
    private String state;

    /**
     * The AWS account ID of the image owner.
     */
    private String ownerId;

    /**
     * Indicates whether the image has public launch permissions. The value
     * is <code>true</code> if this image has public launch permissions or
     * <code>false</code> if it has only implicit and explicit launch
     * permissions.
     */
    private Boolean publicValue;

    /**
     * Any product codes associated with the AMI.
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
     * The type of image.
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
     * The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     */
    private String platform;

    /**
     * Specifies whether enhanced networking is enabled.
     */
    private String sriovNetSupport;

    /**
     * The reason for the state change.
     */
    private StateReason stateReason;

    /**
     * The AWS account alias (for example, <code>amazon</code>,
     * <code>self</code>) or the AWS account ID of the AMI owner.
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
     * The type of root device used by the AMI. The AMI can use an Amazon EBS
     * volume or an instance store volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     */
    private String rootDeviceType;

    /**
     * The device name of the root device (for example,
     * <filename>/dev/sda1</filename> or <filename>xvda</filename>).
     */
    private String rootDeviceName;

    /**
     * Any block device mapping entries.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping> blockDeviceMappings;

    /**
     * The type of virtualization of the AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     */
    private String virtualizationType;

    /**
     * Any tags assigned to the image.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The hypervisor type of the image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     */
    private String hypervisor;

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
     * The current state of the AMI. If the state is <code>available</code>,
     * the image is successfully registered and can be used to launch an
     * instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, deregistered
     *
     * @return The current state of the AMI. If the state is <code>available</code>,
     *         the image is successfully registered and can be used to launch an
     *         instance.
     *
     * @see ImageState
     */
    public String getState() {
        return state;
    }
    
    /**
     * The current state of the AMI. If the state is <code>available</code>,
     * the image is successfully registered and can be used to launch an
     * instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, deregistered
     *
     * @param state The current state of the AMI. If the state is <code>available</code>,
     *         the image is successfully registered and can be used to launch an
     *         instance.
     *
     * @see ImageState
     */
    public void setState(String state) {
        this.state = state;
    }
    
    /**
     * The current state of the AMI. If the state is <code>available</code>,
     * the image is successfully registered and can be used to launch an
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, deregistered
     *
     * @param state The current state of the AMI. If the state is <code>available</code>,
     *         the image is successfully registered and can be used to launch an
     *         instance.
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
     * The current state of the AMI. If the state is <code>available</code>,
     * the image is successfully registered and can be used to launch an
     * instance.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, deregistered
     *
     * @param state The current state of the AMI. If the state is <code>available</code>,
     *         the image is successfully registered and can be used to launch an
     *         instance.
     *
     * @see ImageState
     */
    public void setState(ImageState state) {
        this.state = state.toString();
    }
    
    /**
     * The current state of the AMI. If the state is <code>available</code>,
     * the image is successfully registered and can be used to launch an
     * instance.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>available, deregistered
     *
     * @param state The current state of the AMI. If the state is <code>available</code>,
     *         the image is successfully registered and can be used to launch an
     *         instance.
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
     * The AWS account ID of the image owner.
     *
     * @return The AWS account ID of the image owner.
     */
    public String getOwnerId() {
        return ownerId;
    }
    
    /**
     * The AWS account ID of the image owner.
     *
     * @param ownerId The AWS account ID of the image owner.
     */
    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }
    
    /**
     * The AWS account ID of the image owner.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ownerId The AWS account ID of the image owner.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Image withOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }

    /**
     * Indicates whether the image has public launch permissions. The value
     * is <code>true</code> if this image has public launch permissions or
     * <code>false</code> if it has only implicit and explicit launch
     * permissions.
     *
     * @return Indicates whether the image has public launch permissions. The value
     *         is <code>true</code> if this image has public launch permissions or
     *         <code>false</code> if it has only implicit and explicit launch
     *         permissions.
     */
    public Boolean isPublic() {
        return publicValue;
    }
    
    /**
     * Indicates whether the image has public launch permissions. The value
     * is <code>true</code> if this image has public launch permissions or
     * <code>false</code> if it has only implicit and explicit launch
     * permissions.
     *
     * @param publicValue Indicates whether the image has public launch permissions. The value
     *         is <code>true</code> if this image has public launch permissions or
     *         <code>false</code> if it has only implicit and explicit launch
     *         permissions.
     */
    public void setPublic(Boolean publicValue) {
        this.publicValue = publicValue;
    }
    
    /**
     * Indicates whether the image has public launch permissions. The value
     * is <code>true</code> if this image has public launch permissions or
     * <code>false</code> if it has only implicit and explicit launch
     * permissions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicValue Indicates whether the image has public launch permissions. The value
     *         is <code>true</code> if this image has public launch permissions or
     *         <code>false</code> if it has only implicit and explicit launch
     *         permissions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Image withPublic(Boolean publicValue) {
        this.publicValue = publicValue;
        return this;
    }

    /**
     * Indicates whether the image has public launch permissions. The value
     * is <code>true</code> if this image has public launch permissions or
     * <code>false</code> if it has only implicit and explicit launch
     * permissions.
     *
     * @return Indicates whether the image has public launch permissions. The value
     *         is <code>true</code> if this image has public launch permissions or
     *         <code>false</code> if it has only implicit and explicit launch
     *         permissions.
     */
    public Boolean getPublic() {
        return publicValue;
    }

    /**
     * Any product codes associated with the AMI.
     *
     * @return Any product codes associated with the AMI.
     */
    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
              productCodes = new com.amazonaws.internal.ListWithAutoConstructFlag<ProductCode>();
              productCodes.setAutoConstruct(true);
        }
        return productCodes;
    }
    
    /**
     * Any product codes associated with the AMI.
     *
     * @param productCodes Any product codes associated with the AMI.
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
     * Any product codes associated with the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes Any product codes associated with the AMI.
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
     * Any product codes associated with the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param productCodes Any product codes associated with the AMI.
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
     * The type of image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @return The type of image.
     *
     * @see ImageTypeValues
     */
    public String getImageType() {
        return imageType;
    }
    
    /**
     * The type of image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @param imageType The type of image.
     *
     * @see ImageTypeValues
     */
    public void setImageType(String imageType) {
        this.imageType = imageType;
    }
    
    /**
     * The type of image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @param imageType The type of image.
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
     * The type of image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @param imageType The type of image.
     *
     * @see ImageTypeValues
     */
    public void setImageType(ImageTypeValues imageType) {
        this.imageType = imageType.toString();
    }
    
    /**
     * The type of image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>machine, kernel, ramdisk
     *
     * @param imageType The type of image.
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
     * The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @return The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     *
     * @see PlatformValues
     */
    public String getPlatform() {
        return platform;
    }
    
    /**
     * The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     *
     * @see PlatformValues
     */
    public void setPlatform(String platform) {
        this.platform = platform;
    }
    
    /**
     * The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The value is <code>Windows</code> for Windows AMIs; otherwise blank.
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
     * The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     *
     * @see PlatformValues
     */
    public void setPlatform(PlatformValues platform) {
        this.platform = platform.toString();
    }
    
    /**
     * The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Windows
     *
     * @param platform The value is <code>Windows</code> for Windows AMIs; otherwise blank.
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
     * Specifies whether enhanced networking is enabled.
     *
     * @return Specifies whether enhanced networking is enabled.
     */
    public String getSriovNetSupport() {
        return sriovNetSupport;
    }
    
    /**
     * Specifies whether enhanced networking is enabled.
     *
     * @param sriovNetSupport Specifies whether enhanced networking is enabled.
     */
    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }
    
    /**
     * Specifies whether enhanced networking is enabled.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param sriovNetSupport Specifies whether enhanced networking is enabled.
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
     * The AWS account alias (for example, <code>amazon</code>,
     * <code>self</code>) or the AWS account ID of the AMI owner.
     *
     * @return The AWS account alias (for example, <code>amazon</code>,
     *         <code>self</code>) or the AWS account ID of the AMI owner.
     */
    public String getImageOwnerAlias() {
        return imageOwnerAlias;
    }
    
    /**
     * The AWS account alias (for example, <code>amazon</code>,
     * <code>self</code>) or the AWS account ID of the AMI owner.
     *
     * @param imageOwnerAlias The AWS account alias (for example, <code>amazon</code>,
     *         <code>self</code>) or the AWS account ID of the AMI owner.
     */
    public void setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
    }
    
    /**
     * The AWS account alias (for example, <code>amazon</code>,
     * <code>self</code>) or the AWS account ID of the AMI owner.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param imageOwnerAlias The AWS account alias (for example, <code>amazon</code>,
     *         <code>self</code>) or the AWS account ID of the AMI owner.
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
     * The type of root device used by the AMI. The AMI can use an Amazon EBS
     * volume or an instance store volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @return The type of root device used by the AMI. The AMI can use an Amazon EBS
     *         volume or an instance store volume.
     *
     * @see DeviceType
     */
    public String getRootDeviceType() {
        return rootDeviceType;
    }
    
    /**
     * The type of root device used by the AMI. The AMI can use an Amazon EBS
     * volume or an instance store volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The type of root device used by the AMI. The AMI can use an Amazon EBS
     *         volume or an instance store volume.
     *
     * @see DeviceType
     */
    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }
    
    /**
     * The type of root device used by the AMI. The AMI can use an Amazon EBS
     * volume or an instance store volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The type of root device used by the AMI. The AMI can use an Amazon EBS
     *         volume or an instance store volume.
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
     * The type of root device used by the AMI. The AMI can use an Amazon EBS
     * volume or an instance store volume.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The type of root device used by the AMI. The AMI can use an Amazon EBS
     *         volume or an instance store volume.
     *
     * @see DeviceType
     */
    public void setRootDeviceType(DeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
    }
    
    /**
     * The type of root device used by the AMI. The AMI can use an Amazon EBS
     * volume or an instance store volume.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ebs, instance-store
     *
     * @param rootDeviceType The type of root device used by the AMI. The AMI can use an Amazon EBS
     *         volume or an instance store volume.
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
     * The device name of the root device (for example,
     * <filename>/dev/sda1</filename> or <filename>xvda</filename>).
     *
     * @return The device name of the root device (for example,
     *         <filename>/dev/sda1</filename> or <filename>xvda</filename>).
     */
    public String getRootDeviceName() {
        return rootDeviceName;
    }
    
    /**
     * The device name of the root device (for example,
     * <filename>/dev/sda1</filename> or <filename>xvda</filename>).
     *
     * @param rootDeviceName The device name of the root device (for example,
     *         <filename>/dev/sda1</filename> or <filename>xvda</filename>).
     */
    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }
    
    /**
     * The device name of the root device (for example,
     * <filename>/dev/sda1</filename> or <filename>xvda</filename>).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param rootDeviceName The device name of the root device (for example,
     *         <filename>/dev/sda1</filename> or <filename>xvda</filename>).
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Image withRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
        return this;
    }

    /**
     * Any block device mapping entries.
     *
     * @return Any block device mapping entries.
     */
    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
              blockDeviceMappings = new com.amazonaws.internal.ListWithAutoConstructFlag<BlockDeviceMapping>();
              blockDeviceMappings.setAutoConstruct(true);
        }
        return blockDeviceMappings;
    }
    
    /**
     * Any block device mapping entries.
     *
     * @param blockDeviceMappings Any block device mapping entries.
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
     * Any block device mapping entries.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Any block device mapping entries.
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
     * Any block device mapping entries.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param blockDeviceMappings Any block device mapping entries.
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
     * The type of virtualization of the AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @return The type of virtualization of the AMI.
     *
     * @see VirtualizationType
     */
    public String getVirtualizationType() {
        return virtualizationType;
    }
    
    /**
     * The type of virtualization of the AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The type of virtualization of the AMI.
     *
     * @see VirtualizationType
     */
    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }
    
    /**
     * The type of virtualization of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The type of virtualization of the AMI.
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
     * The type of virtualization of the AMI.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The type of virtualization of the AMI.
     *
     * @see VirtualizationType
     */
    public void setVirtualizationType(VirtualizationType virtualizationType) {
        this.virtualizationType = virtualizationType.toString();
    }
    
    /**
     * The type of virtualization of the AMI.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>hvm, paravirtual
     *
     * @param virtualizationType The type of virtualization of the AMI.
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
     * Any tags assigned to the image.
     *
     * @return Any tags assigned to the image.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the image.
     *
     * @param tags Any tags assigned to the image.
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
     * Any tags assigned to the image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the image.
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
     * Any tags assigned to the image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the image.
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
     * The hypervisor type of the image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @return The hypervisor type of the image.
     *
     * @see HypervisorType
     */
    public String getHypervisor() {
        return hypervisor;
    }
    
    /**
     * The hypervisor type of the image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The hypervisor type of the image.
     *
     * @see HypervisorType
     */
    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }
    
    /**
     * The hypervisor type of the image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The hypervisor type of the image.
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
     * The hypervisor type of the image.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The hypervisor type of the image.
     *
     * @see HypervisorType
     */
    public void setHypervisor(HypervisorType hypervisor) {
        this.hypervisor = hypervisor.toString();
    }
    
    /**
     * The hypervisor type of the image.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>ovm, xen
     *
     * @param hypervisor The hypervisor type of the image.
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
    