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
 * Describes an image attribute.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/ImageAttribute" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImageAttribute implements Serializable, Cloneable {

    /**
     * <p>
     * One or more block device mapping entries.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlockDeviceMapping> blockDeviceMappings;
    /**
     * <p>
     * The ID of the AMI.
     * </p>
     */
    private String imageId;
    /**
     * <p>
     * One or more launch permissions.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LaunchPermission> launchPermissions;
    /**
     * <p>
     * One or more product codes.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProductCode> productCodes;
    /**
     * <p>
     * A description for the AMI.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The kernel ID.
     * </p>
     */
    private String kernelId;
    /**
     * <p>
     * The RAM disk ID.
     * </p>
     */
    private String ramdiskId;
    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * </p>
     */
    private String sriovNetSupport;

    /**
     * <p>
     * One or more block device mapping entries.
     * </p>
     * 
     * @return One or more block device mapping entries.
     */

    public java.util.List<BlockDeviceMapping> getBlockDeviceMappings() {
        if (blockDeviceMappings == null) {
            blockDeviceMappings = new com.amazonaws.internal.SdkInternalList<BlockDeviceMapping>();
        }
        return blockDeviceMappings;
    }

    /**
     * <p>
     * One or more block device mapping entries.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more block device mapping entries.
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
     * One or more block device mapping entries.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBlockDeviceMappings(java.util.Collection)} or {@link #withBlockDeviceMappings(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more block device mapping entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withBlockDeviceMappings(BlockDeviceMapping... blockDeviceMappings) {
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
     * One or more block device mapping entries.
     * </p>
     * 
     * @param blockDeviceMappings
     *        One or more block device mapping entries.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withBlockDeviceMappings(java.util.Collection<BlockDeviceMapping> blockDeviceMappings) {
        setBlockDeviceMappings(blockDeviceMappings);
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

    public ImageAttribute withImageId(String imageId) {
        setImageId(imageId);
        return this;
    }

    /**
     * <p>
     * One or more launch permissions.
     * </p>
     * 
     * @return One or more launch permissions.
     */

    public java.util.List<LaunchPermission> getLaunchPermissions() {
        if (launchPermissions == null) {
            launchPermissions = new com.amazonaws.internal.SdkInternalList<LaunchPermission>();
        }
        return launchPermissions;
    }

    /**
     * <p>
     * One or more launch permissions.
     * </p>
     * 
     * @param launchPermissions
     *        One or more launch permissions.
     */

    public void setLaunchPermissions(java.util.Collection<LaunchPermission> launchPermissions) {
        if (launchPermissions == null) {
            this.launchPermissions = null;
            return;
        }

        this.launchPermissions = new com.amazonaws.internal.SdkInternalList<LaunchPermission>(launchPermissions);
    }

    /**
     * <p>
     * One or more launch permissions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLaunchPermissions(java.util.Collection)} or {@link #withLaunchPermissions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param launchPermissions
     *        One or more launch permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withLaunchPermissions(LaunchPermission... launchPermissions) {
        if (this.launchPermissions == null) {
            setLaunchPermissions(new com.amazonaws.internal.SdkInternalList<LaunchPermission>(launchPermissions.length));
        }
        for (LaunchPermission ele : launchPermissions) {
            this.launchPermissions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more launch permissions.
     * </p>
     * 
     * @param launchPermissions
     *        One or more launch permissions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withLaunchPermissions(java.util.Collection<LaunchPermission> launchPermissions) {
        setLaunchPermissions(launchPermissions);
        return this;
    }

    /**
     * <p>
     * One or more product codes.
     * </p>
     * 
     * @return One or more product codes.
     */

    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
            productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>();
        }
        return productCodes;
    }

    /**
     * <p>
     * One or more product codes.
     * </p>
     * 
     * @param productCodes
     *        One or more product codes.
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
     * One or more product codes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductCodes(java.util.Collection)} or {@link #withProductCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productCodes
     *        One or more product codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withProductCodes(ProductCode... productCodes) {
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
     * One or more product codes.
     * </p>
     * 
     * @param productCodes
     *        One or more product codes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withProductCodes(java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * A description for the AMI.
     * </p>
     * 
     * @param description
     *        A description for the AMI.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the AMI.
     * </p>
     * 
     * @return A description for the AMI.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the AMI.
     * </p>
     * 
     * @param description
     *        A description for the AMI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     * 
     * @param kernelId
     *        The kernel ID.
     */

    public void setKernelId(String kernelId) {
        this.kernelId = kernelId;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     * 
     * @return The kernel ID.
     */

    public String getKernelId() {
        return this.kernelId;
    }

    /**
     * <p>
     * The kernel ID.
     * </p>
     * 
     * @param kernelId
     *        The kernel ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withKernelId(String kernelId) {
        setKernelId(kernelId);
        return this;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     * 
     * @param ramdiskId
     *        The RAM disk ID.
     */

    public void setRamdiskId(String ramdiskId) {
        this.ramdiskId = ramdiskId;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     * 
     * @return The RAM disk ID.
     */

    public String getRamdiskId() {
        return this.ramdiskId;
    }

    /**
     * <p>
     * The RAM disk ID.
     * </p>
     * 
     * @param ramdiskId
     *        The RAM disk ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withRamdiskId(String ramdiskId) {
        setRamdiskId(ramdiskId);
        return this;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * </p>
     * 
     * @param sriovNetSupport
     *        Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     */

    public void setSriovNetSupport(String sriovNetSupport) {
        this.sriovNetSupport = sriovNetSupport;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * </p>
     * 
     * @return Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     */

    public String getSriovNetSupport() {
        return this.sriovNetSupport;
    }

    /**
     * <p>
     * Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * </p>
     * 
     * @param sriovNetSupport
     *        Indicates whether enhanced networking with the Intel 82599 Virtual Function interface is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImageAttribute withSriovNetSupport(String sriovNetSupport) {
        setSriovNetSupport(sriovNetSupport);
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
        if (getBlockDeviceMappings() != null)
            sb.append("BlockDeviceMappings: ").append(getBlockDeviceMappings()).append(",");
        if (getImageId() != null)
            sb.append("ImageId: ").append(getImageId()).append(",");
        if (getLaunchPermissions() != null)
            sb.append("LaunchPermissions: ").append(getLaunchPermissions()).append(",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: ").append(getProductCodes()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getKernelId() != null)
            sb.append("KernelId: ").append(getKernelId()).append(",");
        if (getRamdiskId() != null)
            sb.append("RamdiskId: ").append(getRamdiskId()).append(",");
        if (getSriovNetSupport() != null)
            sb.append("SriovNetSupport: ").append(getSriovNetSupport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImageAttribute == false)
            return false;
        ImageAttribute other = (ImageAttribute) obj;
        if (other.getBlockDeviceMappings() == null ^ this.getBlockDeviceMappings() == null)
            return false;
        if (other.getBlockDeviceMappings() != null && other.getBlockDeviceMappings().equals(this.getBlockDeviceMappings()) == false)
            return false;
        if (other.getImageId() == null ^ this.getImageId() == null)
            return false;
        if (other.getImageId() != null && other.getImageId().equals(this.getImageId()) == false)
            return false;
        if (other.getLaunchPermissions() == null ^ this.getLaunchPermissions() == null)
            return false;
        if (other.getLaunchPermissions() != null && other.getLaunchPermissions().equals(this.getLaunchPermissions()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getKernelId() == null ^ this.getKernelId() == null)
            return false;
        if (other.getKernelId() != null && other.getKernelId().equals(this.getKernelId()) == false)
            return false;
        if (other.getRamdiskId() == null ^ this.getRamdiskId() == null)
            return false;
        if (other.getRamdiskId() != null && other.getRamdiskId().equals(this.getRamdiskId()) == false)
            return false;
        if (other.getSriovNetSupport() == null ^ this.getSriovNetSupport() == null)
            return false;
        if (other.getSriovNetSupport() != null && other.getSriovNetSupport().equals(this.getSriovNetSupport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlockDeviceMappings() == null) ? 0 : getBlockDeviceMappings().hashCode());
        hashCode = prime * hashCode + ((getImageId() == null) ? 0 : getImageId().hashCode());
        hashCode = prime * hashCode + ((getLaunchPermissions() == null) ? 0 : getLaunchPermissions().hashCode());
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getKernelId() == null) ? 0 : getKernelId().hashCode());
        hashCode = prime * hashCode + ((getRamdiskId() == null) ? 0 : getRamdiskId().hashCode());
        hashCode = prime * hashCode + ((getSriovNetSupport() == null) ? 0 : getSriovNetSupport().hashCode());
        return hashCode;
    }

    @Override
    public ImageAttribute clone() {
        try {
            return (ImageAttribute) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
