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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes an image.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/Image" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Image implements Serializable, Cloneable {

    /**
     * <p>
     * The architecture of the image.
     * </p>
     */
    private String architecture;
    /**
     * <p>
     * The date and time the image was created.
     * </p>
     */
    private String creationDate;
    /**
     * <p>
     * The ID of the AMI.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * The location of the AMI.
     * </p>
     */
    private String imageLocation;
    /**
     * <p>
     * The type of image.
     * </p>
     */
    private String imageType;
    /**
     * <p>
     * Indicates whether the image has public launch permissions. The value is <code>true</code> if this image has
     * public launch permissions or <code>false</code> if it has only implicit and explicit launch permissions.
     * </p>
     */
    private Boolean publicValue;
    /**
     * <p>
     * The kernel associated with the image, if any. Only applicable for machine images.
     * </p>
     */
    private String kernelId;
    /**
     * <p>
     * The AWS account ID of the image owner.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * </p>
     */
    private String platform;
    /**
     * <p>
     * Any product codes associated with the AMI.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProductCode> productCodes;
    /**
     * <p>
     * The RAM disk associated with the image, if any. Only applicable for machine images.
     * </p>
     */
    private String ramdiskId;
    /**
     * <p>
     * The current state of the AMI. If the state is <code>available</code>, the image is successfully registered and
     * can be used to launch an instance.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Any block device mapping entries.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * The description of the AMI that was provided during image creation.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Specifies whether enhanced networking with ENA is enabled.
     * </p>
     */
    private Boolean enaSupport;
    /**
     * <p>
     * The hypervisor type of the image.
     * </p>
     */
    private String hypervisor;
    /**
     * <p>
     * The AWS account alias (for example, <code>amazon</code>, <code>self</code>) or the AWS account ID of the AMI
     * owner.
     * </p>
     */
    private String imageOwnerAlias;
    /**
     * <p>
     * The name of the AMI that was provided during image creation.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     */
    private String rootDeviceName;
    /**
     * <p>
     * The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
     * </p>
     */
    private String rootDeviceType;
    /**
     * <p>
     * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * </p>
     */
    private String sriovNetSupport;
    /**
     * <p>
     * The reason for the state change.
     * </p>
     */
    private StateReason stateReason;
    /**
     * <p>
     * Any tags assigned to the image.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The type of virtualization of the AMI.
     * </p>
     */
    private String virtualizationType;

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * 
     * @param architecture
     *        The architecture of the image.
     * @see ArchitectureValues
     */

    public void setArchitecture(String architecture) {
        this.architecture = architecture;
    }

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * 
     * @return The architecture of the image.
     * @see ArchitectureValues
     */

    public String getArchitecture() {
        return this.architecture;
    }

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * 
     * @param architecture
     *        The architecture of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureValues
     */

    public Image withArchitecture(String architecture) {
        setArchitecture(architecture);
        return this;
    }

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * 
     * @param architecture
     *        The architecture of the image.
     * @see ArchitectureValues
     */

    public void setArchitecture(ArchitectureValues architecture) {
        withArchitecture(architecture);
    }

    /**
     * <p>
     * The architecture of the image.
     * </p>
     * 
     * @param architecture
     *        The architecture of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ArchitectureValues
     */

    public Image withArchitecture(ArchitectureValues architecture) {
        this.architecture = architecture.toString();
        return this;
    }

    /**
     * <p>
     * The date and time the image was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time the image was created.
     */

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time the image was created.
     * </p>
     * 
     * @return The date and time the image was created.
     */

    public String getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time the image was created.
     * </p>
     * 
     * @param creationDate
     *        The date and time the image was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withCreationDate(String creationDate) {
        setCreationDate(creationDate);
        return this;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     */

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @return The ID of the AMI.
     */

    public String getImageId() {
        return this.imageId;
    }

    /**
     * <p>
     * The ID of the AMI.
     * </p>
     * 
     * @param imageId
     *        The ID of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * The location of the AMI.
     * </p>
     * 
     * @param imageLocation
     *        The location of the AMI.
     */

    public void setImageLocation(String imageLocation) {
        this.imageLocation = imageLocation;
    }

    /**
     * <p>
     * The location of the AMI.
     * </p>
     * 
     * @return The location of the AMI.
     */

    public String getImageLocation() {
        return this.imageLocation;
    }

    /**
     * <p>
     * The location of the AMI.
     * </p>
     * 
     * @param imageLocation
     *        The location of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withImageLocation(String imageLocation) {
        setImageLocation(imageLocation);
        return this;
    }

    /**
     * <p>
     * The type of image.
     * </p>
     * 
     * @param imageType
     *        The type of image.
     * @see ImageTypeValues
     */

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    /**
     * <p>
     * The type of image.
     * </p>
     * 
     * @return The type of image.
     * @see ImageTypeValues
     */

    public String getImageType() {
        return this.imageType;
    }

    /**
     * <p>
     * The type of image.
     * </p>
     * 
     * @param imageType
     *        The type of image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageTypeValues
     */

    public Image withImageType(String imageType) {
        setImageType(imageType);
        return this;
    }

    /**
     * <p>
     * The type of image.
     * </p>
     * 
     * @param imageType
     *        The type of image.
     * @see ImageTypeValues
     */

    public void setImageType(ImageTypeValues imageType) {
        withImageType(imageType);
    }

    /**
     * <p>
     * The type of image.
     * </p>
     * 
     * @param imageType
     *        The type of image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageTypeValues
     */

    public Image withImageType(ImageTypeValues imageType) {
        this.imageType = imageType.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether the image has public launch permissions. The value is <code>true</code> if this image has
     * public launch permissions or <code>false</code> if it has only implicit and explicit launch permissions.
     * </p>
     * 
     * @param publicValue
     *        Indicates whether the image has public launch permissions. The value is <code>true</code> if this image
     *        has public launch permissions or <code>false</code> if it has only implicit and explicit launch
     *        permissions.
     */

    public void setPublic(Boolean publicValue) {
        this.publicValue = publicValue;
    }

    /**
     * <p>
     * Indicates whether the image has public launch permissions. The value is <code>true</code> if this image has
     * public launch permissions or <code>false</code> if it has only implicit and explicit launch permissions.
     * </p>
     * 
     * @return Indicates whether the image has public launch permissions. The value is <code>true</code> if this image
     *         has public launch permissions or <code>false</code> if it has only implicit and explicit launch
     *         permissions.
     */

    public Boolean getPublic() {
        return this.publicValue;
    }

    /**
     * <p>
     * Indicates whether the image has public launch permissions. The value is <code>true</code> if this image has
     * public launch permissions or <code>false</code> if it has only implicit and explicit launch permissions.
     * </p>
     * 
     * @param publicValue
     *        Indicates whether the image has public launch permissions. The value is <code>true</code> if this image
     *        has public launch permissions or <code>false</code> if it has only implicit and explicit launch
     *        permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withPublic(Boolean publicValue) {
        setPublic(publicValue);
        return this;
    }

    /**
     * <p>
     * Indicates whether the image has public launch permissions. The value is <code>true</code> if this image has
     * public launch permissions or <code>false</code> if it has only implicit and explicit launch permissions.
     * </p>
     * 
     * @return Indicates whether the image has public launch permissions. The value is <code>true</code> if this image
     *         has public launch permissions or <code>false</code> if it has only implicit and explicit launch
     *         permissions.
     */

    public Boolean isPublic() {
        return this.publicValue;
    }

    /**
     * <p>
     * The kernel associated with the image, if any. Only applicable for machine images.
     * </p>
     * 
     * @param kernelId
     *        The kernel associated with the image, if any. Only applicable for machine images.
     */

    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The kernel associated with the image, if any. Only applicable for machine images.
     * </p>
     * 
     * @return The kernel associated with the image, if any. Only applicable for machine images.
     */

    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * <p>
     * The kernel associated with the image, if any. Only applicable for machine images.
     * </p>
     * 
     * @param kernelId
     *        The kernel associated with the image, if any. Only applicable for machine images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withKernelId(String kernelId) {
        setKernelId(kernelId);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the image owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the image owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the image owner.
     * </p>
     * 
     * @return The AWS account ID of the image owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the image owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the image owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * </p>
     * 
     * @param platform
     *        The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * @see PlatformValues
     */

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * </p>
     * 
     * @return The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * @see PlatformValues
     */

    public String getPlatform() {
        return this.platform;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * </p>
     * 
     * @param platform
     *        The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformValues
     */

    public Image withPlatform(String platform) {
        setPlatform(platform);
        return this;
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * </p>
     * 
     * @param platform
     *        The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * @see PlatformValues
     */

    public void setPlatform(PlatformValues platform) {
        withPlatform(platform);
    }

    /**
     * <p>
     * The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * </p>
     * 
     * @param platform
     *        The value is <code>Windows</code> for Windows AMIs; otherwise blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PlatformValues
     */

    public Image withPlatform(PlatformValues platform) {
        this.platform = platform.toString();
        return this;
    }

    /**
     * <p>
     * Any product codes associated with the AMI.
     * </p>
     * 
     * @return Any product codes associated with the AMI.
     */

    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
            productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>();
        }
        return productCodes;
    }

    /**
     * <p>
     * Any product codes associated with the AMI.
     * </p>
     * 
     * @param productCodes
     *        Any product codes associated with the AMI.
     */

    public void setProductCodes(java.util.Collection<ProductCode> productCodes) {
        if (productCodes == null) {
            this.productCodes = null;
            return;
        }

        this.productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>(productCodes);
    }

    /**
     * <p>
     * Any product codes associated with the AMI.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductCodes(java.util.Collection)} or {@link #withProductCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productCodes
     *        Any product codes associated with the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withProductCodes(ProductCode... productCodes) {
        if (this.productCodes == null) {
            setProductCodes(new com.amazonaws.internal.SdkInternalList<ProductCode>(productCodes.length));
        }
        for (ProductCode ele : productCodes) {
            this.productCodes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any product codes associated with the AMI.
     * </p>
     * 
     * @param productCodes
     *        Any product codes associated with the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withProductCodes(java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * The RAM disk associated with the image, if any. Only applicable for machine images.
     * </p>
     * 
     * @param ramdiskId
     *        The RAM disk associated with the image, if any. Only applicable for machine images.
     */

    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The RAM disk associated with the image, if any. Only applicable for machine images.
     * </p>
     * 
     * @return The RAM disk associated with the image, if any. Only applicable for machine images.
     */

    public String getRamdiskId() {
        return this.ramdiskId;
    }

    /**
     * <p>
     * The RAM disk associated with the image, if any. Only applicable for machine images.
     * </p>
     * 
     * @param ramdiskId
     *        The RAM disk associated with the image, if any. Only applicable for machine images.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * The current state of the AMI. If the state is <code>available</code>, the image is successfully registered and
     * can be used to launch an instance.
     * </p>
     * 
     * @param state
     *        The current state of the AMI. If the state is <code>available</code>, the image is successfully registered
     *        and can be used to launch an instance.
     * @see ImageState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the AMI. If the state is <code>available</code>, the image is successfully registered and
     * can be used to launch an instance.
     * </p>
     * 
     * @return The current state of the AMI. If the state is <code>available</code>, the image is successfully
     *         registered and can be used to launch an instance.
     * @see ImageState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the AMI. If the state is <code>available</code>, the image is successfully registered and
     * can be used to launch an instance.
     * </p>
     * 
     * @param state
     *        The current state of the AMI. If the state is <code>available</code>, the image is successfully registered
     *        and can be used to launch an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageState
     */

    public Image withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the AMI. If the state is <code>available</code>, the image is successfully registered and
     * can be used to launch an instance.
     * </p>
     * 
     * @param state
     *        The current state of the AMI. If the state is <code>available</code>, the image is successfully registered
     *        and can be used to launch an instance.
     * @see ImageState
     */

    public void setState(ImageState state) {
        withState(state);
    }

    /**
     * <p>
     * The current state of the AMI. If the state is <code>available</code>, the image is successfully registered and
     * can be used to launch an instance.
     * </p>
     * 
     * @param state
     *        The current state of the AMI. If the state is <code>available</code>, the image is successfully registered
     *        and can be used to launch an instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ImageState
     */

    public Image withState(ImageState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Any block device mapping entries.
     * </p>
     * 
     * @return Any block device mapping entries.
     */

    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * Any block device mapping entries.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Any block device mapping entries.
     */

    public void setBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        if (blockDeviceMappings == null) {
            this.blockDeviceMappings = null;
            return;
        }

        this.blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>(blockDeviceMappings);
    }

    /**
     * <p>
     * Any block device mapping entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Any block device mapping entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
        if (this.blockDeviceMappings == null) {
            setBlockDeviceMappings(new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>(blockDeviceMappings.length));
        }
        for (BlockDeviceMapping ele : blockDeviceMappings) {
            this.blockDeviceMappings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any block device mapping entries.
     * </p>
     * 
     * @param blockDeviceMappings
     *        Any block device mapping entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
        return this;
    }

    /**
     * <p>
     * The description of the AMI that was provided during image creation.
     * </p>
     * 
     * @param description
     *        The description of the AMI that was provided during image creation.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the AMI that was provided during image creation.
     * </p>
     * 
     * @return The description of the AMI that was provided during image creation.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the AMI that was provided during image creation.
     * </p>
     * 
     * @param description
     *        The description of the AMI that was provided during image creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Specifies whether enhanced networking with ENA is enabled.
     * </p>
     * 
     * @param enaSupport
     *        Specifies whether enhanced networking with ENA is enabled.
     */

    public void setEnaSupport(Boolean enaSupport) {
        this.enaSupport = enaSupport;
    }

    /**
     * <p>
     * Specifies whether enhanced networking with ENA is enabled.
     * </p>
     * 
     * @return Specifies whether enhanced networking with ENA is enabled.
     */

    public Boolean getEnaSupport() {
        return this.enaSupport;
    }

    /**
     * <p>
     * Specifies whether enhanced networking with ENA is enabled.
     * </p>
     * 
     * @param enaSupport
     *        Specifies whether enhanced networking with ENA is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withEnaSupport(Boolean enaSupport) {
        setEnaSupport(enaSupport);
        return this;
    }

    /**
     * <p>
     * Specifies whether enhanced networking with ENA is enabled.
     * </p>
     * 
     * @return Specifies whether enhanced networking with ENA is enabled.
     */

    public Boolean isEnaSupport() {
        return this.enaSupport;
    }

    /**
     * <p>
     * The hypervisor type of the image.
     * </p>
     * 
     * @param hypervisor
     *        The hypervisor type of the image.
     * @see HypervisorType
     */

    public void setHypervisor(String hypervisor) {
        this.hypervisor = hypervisor;
    }

    /**
     * <p>
     * The hypervisor type of the image.
     * </p>
     * 
     * @return The hypervisor type of the image.
     * @see HypervisorType
     */

    public String getHypervisor() {
        return this.hypervisor;
    }

    /**
     * <p>
     * The hypervisor type of the image.
     * </p>
     * 
     * @param hypervisor
     *        The hypervisor type of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HypervisorType
     */

    public Image withHypervisor(String hypervisor) {
        setHypervisor(hypervisor);
        return this;
    }

    /**
     * <p>
     * The hypervisor type of the image.
     * </p>
     * 
     * @param hypervisor
     *        The hypervisor type of the image.
     * @see HypervisorType
     */

    public void setHypervisor(HypervisorType hypervisor) {
        withHypervisor(hypervisor);
    }

    /**
     * <p>
     * The hypervisor type of the image.
     * </p>
     * 
     * @param hypervisor
     *        The hypervisor type of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HypervisorType
     */

    public Image withHypervisor(HypervisorType hypervisor) {
        this.hypervisor = hypervisor.toString();
        return this;
    }

    /**
     * <p>
     * The AWS account alias (for example, <code>amazon</code>, <code>self</code>) or the AWS account ID of the AMI
     * owner.
     * </p>
     * 
     * @param imageOwnerAlias
     *        The AWS account alias (for example, <code>amazon</code>, <code>self</code>) or the AWS account ID of the
     *        AMI owner.
     */

    public void setImageOwnerAlias(String imageOwnerAlias) {
        this.imageOwnerAlias = imageOwnerAlias;
    }

    /**
     * <p>
     * The AWS account alias (for example, <code>amazon</code>, <code>self</code>) or the AWS account ID of the AMI
     * owner.
     * </p>
     * 
     * @return The AWS account alias (for example, <code>amazon</code>, <code>self</code>) or the AWS account ID of the
     *         AMI owner.
     */

    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    /**
     * <p>
     * The AWS account alias (for example, <code>amazon</code>, <code>self</code>) or the AWS account ID of the AMI
     * owner.
     * </p>
     * 
     * @param imageOwnerAlias
     *        The AWS account alias (for example, <code>amazon</code>, <code>self</code>) or the AWS account ID of the
     *        AMI owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withImageOwnerAlias(String imageOwnerAlias) {
        setImageOwnerAlias(imageOwnerAlias);
        return this;
    }

    /**
     * <p>
     * The name of the AMI that was provided during image creation.
     * </p>
     * 
     * @param name
     *        The name of the AMI that was provided during image creation.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the AMI that was provided during image creation.
     * </p>
     * 
     * @return The name of the AMI that was provided during image creation.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the AMI that was provided during image creation.
     * </p>
     * 
     * @param name
     *        The name of the AMI that was provided during image creation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     * 
     * @param rootDeviceName
     *        The device name of the root device volume (for example, <code>/dev/sda1</code>).
     */

    public void setRootDeviceName(String rootDeviceName) {
        this.rootDeviceName = rootDeviceName;
    }

    /**
     * <p>
     * The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     * 
     * @return The device name of the root device volume (for example, <code>/dev/sda1</code>).
     */

    public String getRootDeviceName() {
        return this.rootDeviceName;
    }

    /**
     * <p>
     * The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * </p>
     * 
     * @param rootDeviceName
     *        The device name of the root device volume (for example, <code>/dev/sda1</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withRootDeviceName(String rootDeviceName) {
        setRootDeviceName(rootDeviceName);
        return this;
    }

    /**
     * <p>
     * The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
     * </p>
     * 
     * @param rootDeviceType
     *        The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
     * @see DeviceType
     */

    public void setRootDeviceType(String rootDeviceType) {
        this.rootDeviceType = rootDeviceType;
    }

    /**
     * <p>
     * The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
     * </p>
     * 
     * @return The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
     * @see DeviceType
     */

    public String getRootDeviceType() {
        return this.rootDeviceType;
    }

    /**
     * <p>
     * The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
     * </p>
     * 
     * @param rootDeviceType
     *        The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceType
     */

    public Image withRootDeviceType(String rootDeviceType) {
        setRootDeviceType(rootDeviceType);
        return this;
    }

    /**
     * <p>
     * The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
     * </p>
     * 
     * @param rootDeviceType
     *        The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
     * @see DeviceType
     */

    public void setRootDeviceType(DeviceType rootDeviceType) {
        withRootDeviceType(rootDeviceType);
    }

    /**
     * <p>
     * The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
     * </p>
     * 
     * @param rootDeviceType
     *        The type of root device used by the AMI. The AMI can use an EBS volume or an instance store volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeviceType
     */

    public Image withRootDeviceType(DeviceType rootDeviceType) {
        this.rootDeviceType = rootDeviceType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * </p>
     * 
     * @param sriovNetSupport
     *        Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     */

    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }

    /**
     * <p>
     * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * </p>
     * 
     * @return Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     */

    public String getSriovNetSupport() {
        return this.sriovNetSupport;
    }

    /**
     * <p>
     * Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * </p>
     * 
     * @param sriovNetSupport
     *        Specifies whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withSriovNetSupport(String sriovNetSupport) {
        setSriovNetSupport(sriovNetSupport);
        return this;
    }

    /**
     * <p>
     * The reason for the state change.
     * </p>
     * 
     * @param stateReason
     *        The reason for the state change.
     */

    public void setStateReason(StateReason stateReason) {
        this.stateReason = stateReason;
    }

    /**
     * <p>
     * The reason for the state change.
     * </p>
     * 
     * @return The reason for the state change.
     */

    public StateReason getStateReason() {
        return this.stateReason;
    }

    /**
     * <p>
     * The reason for the state change.
     * </p>
     * 
     * @param stateReason
     *        The reason for the state change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withStateReason(StateReason stateReason) {
        setStateReason(stateReason);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the image.
     * </p>
     * 
     * @return Any tags assigned to the image.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the image.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the image.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * Any tags assigned to the image.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the image.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Image withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The type of virtualization of the AMI.
     * </p>
     * 
     * @param virtualizationType
     *        The type of virtualization of the AMI.
     * @see VirtualizationType
     */

    public void setVirtualizationType(String virtualizationType) {
        this.virtualizationType = virtualizationType;
    }

    /**
     * <p>
     * The type of virtualization of the AMI.
     * </p>
     * 
     * @return The type of virtualization of the AMI.
     * @see VirtualizationType
     */

    public String getVirtualizationType() {
        return this.virtualizationType;
    }

    /**
     * <p>
     * The type of virtualization of the AMI.
     * </p>
     * 
     * @param virtualizationType
     *        The type of virtualization of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualizationType
     */

    public Image withVirtualizationType(String virtualizationType) {
        setVirtualizationType(virtualizationType);
        return this;
    }

    /**
     * <p>
     * The type of virtualization of the AMI.
     * </p>
     * 
     * @param virtualizationType
     *        The type of virtualization of the AMI.
     * @see VirtualizationType
     */

    public void setVirtualizationType(VirtualizationType virtualizationType) {
        withVirtualizationType(virtualizationType);
    }

    /**
     * <p>
     * The type of virtualization of the AMI.
     * </p>
     * 
     * @param virtualizationType
     *        The type of virtualization of the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VirtualizationType
     */

    public Image withVirtualizationType(VirtualizationType virtualizationType) {
        this.virtualizationType = virtualizationType.toString();
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
        if (getArchitecture() != null)
            sb.append("Architecture: ").append(getArchitecture()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getImageLocation() != null)
            sb.append("ImageLocation: ").append(getImageLocation()).append(",");
        if (getImageType() != null)
            sb.append("ImageType: ").append(getImageType()).append(",");
        if (getPublic() != null)
            sb.append("Public: ").append(getPublic()).append(",");
        if (getKernelId() != null)
            sb.append("KernelId: ").append(getKernelId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getPlatform() != null)
            sb.append("Platform: ").append(getPlatform()).append(",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: ").append(getProductCodes()).append(",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: ").append(getRamdiskId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getEnaSupport() != null)
            sb.append("EnaSupport: ").append(getEnaSupport()).append(",");
        if (getHypervisor() != null)
            sb.append("Hypervisor: ").append(getHypervisor()).append(",");
        if (getImageOwnerAlias() != null)
            sb.append("ImageOwnerAlias: ").append(getImageOwnerAlias()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRootDeviceName() != null)
            sb.append("RootDeviceName: ").append(getRootDeviceName()).append(",");
        if (getRootDeviceType() != null)
            sb.append("RootDeviceType: ").append(getRootDeviceType()).append(",");
        if (getSriovNetSupport() != null)
            sb.append("SriovNetSupport: ").append(getSriovNetSupport()).append(",");
        if (getStateReason() != null)
            sb.append("StateReason: ").append(getStateReason()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVirtualizationType() != null)
            sb.append("VirtualizationType: ").append(getVirtualizationType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Image == false)
            return false;
        Image other = (Image) obj;
        if (other.getArchitecture() == null ^ this.getArchitecture() == null)
            return false;
        if (other.getArchitecture() != null && other.getArchitecture().equals(this.getArchitecture()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getImageLocation() == null ^ this.getImageLocation() == null)
            return false;
        if (other.getImageLocation() != null && other.getImageLocation().equals(this.getImageLocation()) == false)
            return false;
        if (other.getImageType() == null ^ this.getImageType() == null)
            return false;
        if (other.getImageType() != null && other.getImageType().equals(this.getImageType()) == false)
            return false;
        if (other.getPublic() == null ^ this.getPublic() == null)
            return false;
        if (other.getPublic() != null && other.getPublic().equals(this.getPublic()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getPlatform() == null ^ this.getPlatform() == null)
            return false;
        if (other.getPlatform() != null && other.getPlatform().equals(this.getPlatform()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null)
            return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getEnaSupport() == null ^ this.getEnaSupport() == null)
            return false;
        if (other.getEnaSupport() != null && other.getEnaSupport().equals(this.getEnaSupport()) == false)
            return false;
        if (other.getHypervisor() == null ^ this.getHypervisor() == null)
            return false;
        if (other.getHypervisor() != null && other.getHypervisor().equals(this.getHypervisor()) == false)
            return false;
        if (other.getImageOwnerAlias() == null ^ this.getImageOwnerAlias() == null)
            return false;
        if (other.getImageOwnerAlias() != null && other.getImageOwnerAlias().equals(this.getImageOwnerAlias()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRootDeviceName() == null ^ this.getRootDeviceName() == null)
            return false;
        if (other.getRootDeviceName() != null && other.getRootDeviceName().equals(this.getRootDeviceName()) == false)
            return false;
        if (other.getRootDeviceType() == null ^ this.getRootDeviceType() == null)
            return false;
        if (other.getRootDeviceType() != null && other.getRootDeviceType().equals(this.getRootDeviceType()) == false)
            return false;
        if (other.getSriovNetSupport() == null ^ this.getSriovNetSupport() == null)
            return false;
        if (other.getSriovNetSupport() != null && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false)
            return false;
        if (other.getStateReason() == null ^ this.getStateReason() == null)
            return false;
        if (other.getStateReason() != null && other.getStateReason().equals(this.getStateReason()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVirtualizationType() == null ^ this.getVirtualizationType() == null)
            return false;
        if (other.getVirtualizationType() != null && other.getVirtualizationType().equals(this.getVirtualizationType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArchitecture() == null) ? 0 : getArchitecture().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getImageLocation() == null) ? 0 : getImageLocation().hashCode());
        hashCode = prime * hashCode + ((getImageType() == null) ? 0 : getImageType().hashCode());
        hashCode = prime * hashCode + ((getPublic() == null) ? 0 : getPublic().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getPlatform() == null) ? 0 : getPlatform().hashCode());
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getEnaSupport() == null) ? 0 : getEnaSupport().hashCode());
        hashCode = prime * hashCode + ((getHypervisor() == null) ? 0 : getHypervisor().hashCode());
        hashCode = prime * hashCode + ((getImageOwnerAlias() == null) ? 0 : getImageOwnerAlias().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRootDeviceName() == null) ? 0 : getRootDeviceName().hashCode());
        hashCode = prime * hashCode + ((getRootDeviceType() == null) ? 0 : getRootDeviceType().hashCode());
        hashCode = prime * hashCode + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode());
        hashCode = prime * hashCode + ((getStateReason() == null) ? 0 : getStateReason().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVirtualizationType() == null) ? 0 : getVirtualizationType().hashCode());
        return hashCode;
    }

    @Override
    public Image clone() {
        try {
            return (Image) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
