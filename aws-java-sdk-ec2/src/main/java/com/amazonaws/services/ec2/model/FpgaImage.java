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
 * Describes an Amazon FPGA image (AFI).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/FpgaImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FpgaImage implements Serializable, Cloneable {

    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     */
    private String fpgaImageId;
    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     */
    private String fpgaImageGlobalId;
    /**
     * <p>
     * The name of the AFI.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The description of the AFI.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The version of the AWS Shell that was used to create the bitstream.
     * </p>
     */
    private String shellVersion;
    /**
     * <p>
     * Information about the PCI bus.
     * </p>
     */
    private PciId pciId;
    /**
     * <p>
     * Information about the state of the AFI.
     * </p>
     */
    private FpgaImageState state;
    /**
     * <p>
     * The date and time the AFI was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * The time of the most recent update to the AFI.
     * </p>
     */
    private java.util.Date updateTime;
    /**
     * <p>
     * The AWS account ID of the AFI owner.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The alias of the AFI owner. Possible values include <code>self</code>, <code>amazon</code>, and
     * <code>aws-marketplace</code>.
     * </p>
     */
    private String ownerAlias;
    /**
     * <p>
     * The product codes for the AFI.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ProductCode> productCodes;
    /**
     * <p>
     * Any tags assigned to the AFI.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Indicates whether the AFI is public.
     * </p>
     */
    private Boolean publicValue;
    /**
     * <p>
     * Indicates whether data retention support is enabled for the AFI.
     * </p>
     */
    private Boolean dataRetentionSupport;

    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     * 
     * @param fpgaImageId
     *        The FPGA image identifier (AFI ID).
     */

    public void setFpgaImageId(String fpgaImageId) {
        this.fpgaImageId = fpgaImageId;
    }

    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     * 
     * @return The FPGA image identifier (AFI ID).
     */

    public String getFpgaImageId() {
        return this.fpgaImageId;
    }

    /**
     * <p>
     * The FPGA image identifier (AFI ID).
     * </p>
     * 
     * @param fpgaImageId
     *        The FPGA image identifier (AFI ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withFpgaImageId(String fpgaImageId) {
        setFpgaImageId(fpgaImageId);
        return this;
    }

    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     * 
     * @param fpgaImageGlobalId
     *        The global FPGA image identifier (AGFI ID).
     */

    public void setFpgaImageGlobalId(String fpgaImageGlobalId) {
        this.fpgaImageGlobalId = fpgaImageGlobalId;
    }

    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     * 
     * @return The global FPGA image identifier (AGFI ID).
     */

    public String getFpgaImageGlobalId() {
        return this.fpgaImageGlobalId;
    }

    /**
     * <p>
     * The global FPGA image identifier (AGFI ID).
     * </p>
     * 
     * @param fpgaImageGlobalId
     *        The global FPGA image identifier (AGFI ID).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withFpgaImageGlobalId(String fpgaImageGlobalId) {
        setFpgaImageGlobalId(fpgaImageGlobalId);
        return this;
    }

    /**
     * <p>
     * The name of the AFI.
     * </p>
     * 
     * @param name
     *        The name of the AFI.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the AFI.
     * </p>
     * 
     * @return The name of the AFI.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the AFI.
     * </p>
     * 
     * @param name
     *        The name of the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The description of the AFI.
     * </p>
     * 
     * @param description
     *        The description of the AFI.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the AFI.
     * </p>
     * 
     * @return The description of the AFI.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the AFI.
     * </p>
     * 
     * @param description
     *        The description of the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The version of the AWS Shell that was used to create the bitstream.
     * </p>
     * 
     * @param shellVersion
     *        The version of the AWS Shell that was used to create the bitstream.
     */

    public void setShellVersion(String shellVersion) {
        this.shellVersion = shellVersion;
    }

    /**
     * <p>
     * The version of the AWS Shell that was used to create the bitstream.
     * </p>
     * 
     * @return The version of the AWS Shell that was used to create the bitstream.
     */

    public String getShellVersion() {
        return this.shellVersion;
    }

    /**
     * <p>
     * The version of the AWS Shell that was used to create the bitstream.
     * </p>
     * 
     * @param shellVersion
     *        The version of the AWS Shell that was used to create the bitstream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withShellVersion(String shellVersion) {
        setShellVersion(shellVersion);
        return this;
    }

    /**
     * <p>
     * Information about the PCI bus.
     * </p>
     * 
     * @param pciId
     *        Information about the PCI bus.
     */

    public void setPciId(PciId pciId) {
        this.pciId = pciId;
    }

    /**
     * <p>
     * Information about the PCI bus.
     * </p>
     * 
     * @return Information about the PCI bus.
     */

    public PciId getPciId() {
        return this.pciId;
    }

    /**
     * <p>
     * Information about the PCI bus.
     * </p>
     * 
     * @param pciId
     *        Information about the PCI bus.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withPciId(PciId pciId) {
        setPciId(pciId);
        return this;
    }

    /**
     * <p>
     * Information about the state of the AFI.
     * </p>
     * 
     * @param state
     *        Information about the state of the AFI.
     */

    public void setState(FpgaImageState state) {
        this.state = state;
    }

    /**
     * <p>
     * Information about the state of the AFI.
     * </p>
     * 
     * @return Information about the state of the AFI.
     */

    public FpgaImageState getState() {
        return this.state;
    }

    /**
     * <p>
     * Information about the state of the AFI.
     * </p>
     * 
     * @param state
     *        Information about the state of the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withState(FpgaImageState state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The date and time the AFI was created.
     * </p>
     * 
     * @param createTime
     *        The date and time the AFI was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * The date and time the AFI was created.
     * </p>
     * 
     * @return The date and time the AFI was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * The date and time the AFI was created.
     * </p>
     * 
     * @param createTime
     *        The date and time the AFI was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * The time of the most recent update to the AFI.
     * </p>
     * 
     * @param updateTime
     *        The time of the most recent update to the AFI.
     */

    public void setUpdateTime(java.util.Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * <p>
     * The time of the most recent update to the AFI.
     * </p>
     * 
     * @return The time of the most recent update to the AFI.
     */

    public java.util.Date getUpdateTime() {
        return this.updateTime;
    }

    /**
     * <p>
     * The time of the most recent update to the AFI.
     * </p>
     * 
     * @param updateTime
     *        The time of the most recent update to the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withUpdateTime(java.util.Date updateTime) {
        setUpdateTime(updateTime);
        return this;
    }

    /**
     * <p>
     * The AWS account ID of the AFI owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the AFI owner.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the AFI owner.
     * </p>
     * 
     * @return The AWS account ID of the AFI owner.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The AWS account ID of the AFI owner.
     * </p>
     * 
     * @param ownerId
     *        The AWS account ID of the AFI owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The alias of the AFI owner. Possible values include <code>self</code>, <code>amazon</code>, and
     * <code>aws-marketplace</code>.
     * </p>
     * 
     * @param ownerAlias
     *        The alias of the AFI owner. Possible values include <code>self</code>, <code>amazon</code>, and
     *        <code>aws-marketplace</code>.
     */

    public void setOwnerAlias(String ownerAlias) {
        this.ownerAlias = ownerAlias;
    }

    /**
     * <p>
     * The alias of the AFI owner. Possible values include <code>self</code>, <code>amazon</code>, and
     * <code>aws-marketplace</code>.
     * </p>
     * 
     * @return The alias of the AFI owner. Possible values include <code>self</code>, <code>amazon</code>, and
     *         <code>aws-marketplace</code>.
     */

    public String getOwnerAlias() {
        return this.ownerAlias;
    }

    /**
     * <p>
     * The alias of the AFI owner. Possible values include <code>self</code>, <code>amazon</code>, and
     * <code>aws-marketplace</code>.
     * </p>
     * 
     * @param ownerAlias
     *        The alias of the AFI owner. Possible values include <code>self</code>, <code>amazon</code>, and
     *        <code>aws-marketplace</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withOwnerAlias(String ownerAlias) {
        setOwnerAlias(ownerAlias);
        return this;
    }

    /**
     * <p>
     * The product codes for the AFI.
     * </p>
     * 
     * @return The product codes for the AFI.
     */

    public java.util.List<ProductCode> getProductCodes() {
        if (productCodes == null) {
            productCodes = new com.amazonaws.internal.SdkInternalList<ProductCode>();
        }
        return productCodes;
    }

    /**
     * <p>
     * The product codes for the AFI.
     * </p>
     * 
     * @param productCodes
     *        The product codes for the AFI.
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
     * The product codes for the AFI.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setProductCodes(java.util.Collection)} or {@link #withProductCodes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param productCodes
     *        The product codes for the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withProductCodes(ProductCode... productCodes) {
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
     * The product codes for the AFI.
     * </p>
     * 
     * @param productCodes
     *        The product codes for the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withProductCodes(java.util.Collection<ProductCode> productCodes) {
        setProductCodes(productCodes);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the AFI.
     * </p>
     * 
     * @return Any tags assigned to the AFI.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the AFI.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the AFI.
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
     * Any tags assigned to the AFI.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withTags(Tag... tags) {
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
     * Any tags assigned to the AFI.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Indicates whether the AFI is public.
     * </p>
     * 
     * @param publicValue
     *        Indicates whether the AFI is public.
     */

    public void setPublic(Boolean publicValue) {
        this.publicValue = publicValue;
    }

    /**
     * <p>
     * Indicates whether the AFI is public.
     * </p>
     * 
     * @return Indicates whether the AFI is public.
     */

    public Boolean getPublic() {
        return this.publicValue;
    }

    /**
     * <p>
     * Indicates whether the AFI is public.
     * </p>
     * 
     * @param publicValue
     *        Indicates whether the AFI is public.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withPublic(Boolean publicValue) {
        setPublic(publicValue);
        return this;
    }

    /**
     * <p>
     * Indicates whether the AFI is public.
     * </p>
     * 
     * @return Indicates whether the AFI is public.
     */

    public Boolean isPublic() {
        return this.publicValue;
    }

    /**
     * <p>
     * Indicates whether data retention support is enabled for the AFI.
     * </p>
     * 
     * @param dataRetentionSupport
     *        Indicates whether data retention support is enabled for the AFI.
     */

    public void setDataRetentionSupport(Boolean dataRetentionSupport) {
        this.dataRetentionSupport = dataRetentionSupport;
    }

    /**
     * <p>
     * Indicates whether data retention support is enabled for the AFI.
     * </p>
     * 
     * @return Indicates whether data retention support is enabled for the AFI.
     */

    public Boolean getDataRetentionSupport() {
        return this.dataRetentionSupport;
    }

    /**
     * <p>
     * Indicates whether data retention support is enabled for the AFI.
     * </p>
     * 
     * @param dataRetentionSupport
     *        Indicates whether data retention support is enabled for the AFI.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FpgaImage withDataRetentionSupport(Boolean dataRetentionSupport) {
        setDataRetentionSupport(dataRetentionSupport);
        return this;
    }

    /**
     * <p>
     * Indicates whether data retention support is enabled for the AFI.
     * </p>
     * 
     * @return Indicates whether data retention support is enabled for the AFI.
     */

    public Boolean isDataRetentionSupport() {
        return this.dataRetentionSupport;
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
        if (getFpgaImageId() != null)
            sb.append("FpgaImageId: ").append(getFpgaImageId()).append(",");
        if (getFpgaImageGlobalId() != null)
            sb.append("FpgaImageGlobalId: ").append(getFpgaImageGlobalId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getShellVersion() != null)
            sb.append("ShellVersion: ").append(getShellVersion()).append(",");
        if (getPciId() != null)
            sb.append("PciId: ").append(getPciId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getUpdateTime() != null)
            sb.append("UpdateTime: ").append(getUpdateTime()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getOwnerAlias() != null)
            sb.append("OwnerAlias: ").append(getOwnerAlias()).append(",");
        if (getProductCodes() != null)
            sb.append("ProductCodes: ").append(getProductCodes()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getPublic() != null)
            sb.append("Public: ").append(getPublic()).append(",");
        if (getDataRetentionSupport() != null)
            sb.append("DataRetentionSupport: ").append(getDataRetentionSupport());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FpgaImage == false)
            return false;
        FpgaImage other = (FpgaImage) obj;
        if (other.getFpgaImageId() == null ^ this.getFpgaImageId() == null)
            return false;
        if (other.getFpgaImageId() != null && other.getFpgaImageId().equals(this.getFpgaImageId()) == false)
            return false;
        if (other.getFpgaImageGlobalId() == null ^ this.getFpgaImageGlobalId() == null)
            return false;
        if (other.getFpgaImageGlobalId() != null && other.getFpgaImageGlobalId().equals(this.getFpgaImageGlobalId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getShellVersion() == null ^ this.getShellVersion() == null)
            return false;
        if (other.getShellVersion() != null && other.getShellVersion().equals(this.getShellVersion()) == false)
            return false;
        if (other.getPciId() == null ^ this.getPciId() == null)
            return false;
        if (other.getPciId() != null && other.getPciId().equals(this.getPciId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getUpdateTime() == null ^ this.getUpdateTime() == null)
            return false;
        if (other.getUpdateTime() != null && other.getUpdateTime().equals(this.getUpdateTime()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getOwnerAlias() == null ^ this.getOwnerAlias() == null)
            return false;
        if (other.getOwnerAlias() != null && other.getOwnerAlias().equals(this.getOwnerAlias()) == false)
            return false;
        if (other.getProductCodes() == null ^ this.getProductCodes() == null)
            return false;
        if (other.getProductCodes() != null && other.getProductCodes().equals(this.getProductCodes()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getPublic() == null ^ this.getPublic() == null)
            return false;
        if (other.getPublic() != null && other.getPublic().equals(this.getPublic()) == false)
            return false;
        if (other.getDataRetentionSupport() == null ^ this.getDataRetentionSupport() == null)
            return false;
        if (other.getDataRetentionSupport() != null && other.getDataRetentionSupport().equals(this.getDataRetentionSupport()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFpgaImageId() == null) ? 0 : getFpgaImageId().hashCode());
        hashCode = prime * hashCode + ((getFpgaImageGlobalId() == null) ? 0 : getFpgaImageGlobalId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getShellVersion() == null) ? 0 : getShellVersion().hashCode());
        hashCode = prime * hashCode + ((getPciId() == null) ? 0 : getPciId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getUpdateTime() == null) ? 0 : getUpdateTime().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getOwnerAlias() == null) ? 0 : getOwnerAlias().hashCode());
        hashCode = prime * hashCode + ((getProductCodes() == null) ? 0 : getProductCodes().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getPublic() == null) ? 0 : getPublic().hashCode());
        hashCode = prime * hashCode + ((getDataRetentionSupport() == null) ? 0 : getDataRetentionSupport().hashCode());
        return hashCode;
    }

    @Override
    public FpgaImage clone() {
        try {
            return (FpgaImage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
