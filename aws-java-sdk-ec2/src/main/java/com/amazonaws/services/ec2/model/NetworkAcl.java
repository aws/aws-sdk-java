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
 * Describes a network ACL.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/NetworkAcl" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NetworkAcl implements Serializable, Cloneable {

    /**
     * <p>
     * Any associations between the network ACL and one or more subnets
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NetworkAclAssociation> associations;
    /**
     * <p>
     * One or more entries (rules) in the network ACL.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<NetworkAclEntry> entries;
    /**
     * <p>
     * Indicates whether this is the default network ACL for the VPC.
     * </p>
     */
    private Boolean isDefault;
    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     */
    private String networkAclId;
    /**
     * <p>
     * Any tags assigned to the network ACL.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The ID of the VPC for the network ACL.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * The ID of the AWS account that owns the network ACL.
     * </p>
     */
    private String ownerId;

    /**
     * <p>
     * Any associations between the network ACL and one or more subnets
     * </p>
     * 
     * @return Any associations between the network ACL and one or more subnets
     */

    public java.util.List<NetworkAclAssociation> getAssociations() {
        if (associations == null) {
            associations = new com.amazonaws.internal.SdkInternalList<NetworkAclAssociation>();
        }
        return associations;
    }

    /**
     * <p>
     * Any associations between the network ACL and one or more subnets
     * </p>
     * 
     * @param associations
     *        Any associations between the network ACL and one or more subnets
     */

    public void setAssociations(java.util.Collection<NetworkAclAssociation> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }

        this.associations = new com.amazonaws.internal.SdkInternalList<NetworkAclAssociation>(associations);
    }

    /**
     * <p>
     * Any associations between the network ACL and one or more subnets
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociations(java.util.Collection)} or {@link #withAssociations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param associations
     *        Any associations between the network ACL and one or more subnets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAcl withAssociations(NetworkAclAssociation... associations) {
        if (this.associations == null) {
            setAssociations(new com.amazonaws.internal.SdkInternalList<NetworkAclAssociation>(associations.length));
        }
        for (NetworkAclAssociation ele : associations) {
            this.associations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any associations between the network ACL and one or more subnets
     * </p>
     * 
     * @param associations
     *        Any associations between the network ACL and one or more subnets
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAcl withAssociations(java.util.Collection<NetworkAclAssociation> associations) {
        setAssociations(associations);
        return this;
    }

    /**
     * <p>
     * One or more entries (rules) in the network ACL.
     * </p>
     * 
     * @return One or more entries (rules) in the network ACL.
     */

    public java.util.List<NetworkAclEntry> getEntries() {
        if (entries == null) {
            entries = new com.amazonaws.internal.SdkInternalList<NetworkAclEntry>();
        }
        return entries;
    }

    /**
     * <p>
     * One or more entries (rules) in the network ACL.
     * </p>
     * 
     * @param entries
     *        One or more entries (rules) in the network ACL.
     */

    public void setEntries(java.util.Collection<NetworkAclEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new com.amazonaws.internal.SdkInternalList<NetworkAclEntry>(entries);
    }

    /**
     * <p>
     * One or more entries (rules) in the network ACL.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        One or more entries (rules) in the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAcl withEntries(NetworkAclEntry... entries) {
        if (this.entries == null) {
            setEntries(new com.amazonaws.internal.SdkInternalList<NetworkAclEntry>(entries.length));
        }
        for (NetworkAclEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more entries (rules) in the network ACL.
     * </p>
     * 
     * @param entries
     *        One or more entries (rules) in the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAcl withEntries(java.util.Collection<NetworkAclEntry> entries) {
        setEntries(entries);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is the default network ACL for the VPC.
     * </p>
     * 
     * @param isDefault
     *        Indicates whether this is the default network ACL for the VPC.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Indicates whether this is the default network ACL for the VPC.
     * </p>
     * 
     * @return Indicates whether this is the default network ACL for the VPC.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Indicates whether this is the default network ACL for the VPC.
     * </p>
     * 
     * @param isDefault
     *        Indicates whether this is the default network ACL for the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAcl withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is the default network ACL for the VPC.
     * </p>
     * 
     * @return Indicates whether this is the default network ACL for the VPC.
     */

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     * 
     * @param networkAclId
     *        The ID of the network ACL.
     */

    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     * 
     * @return The ID of the network ACL.
     */

    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * <p>
     * The ID of the network ACL.
     * </p>
     * 
     * @param networkAclId
     *        The ID of the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAcl withNetworkAclId(String networkAclId) {
        setNetworkAclId(networkAclId);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the network ACL.
     * </p>
     * 
     * @return Any tags assigned to the network ACL.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the network ACL.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the network ACL.
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
     * Any tags assigned to the network ACL.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAcl withTags(Tag... tags) {
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
     * Any tags assigned to the network ACL.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAcl withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC for the network ACL.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC for the network ACL.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the network ACL.
     * </p>
     * 
     * @return The ID of the VPC for the network ACL.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC for the network ACL.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC for the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAcl withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network ACL.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the network ACL.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network ACL.
     * </p>
     * 
     * @return The ID of the AWS account that owns the network ACL.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The ID of the AWS account that owns the network ACL.
     * </p>
     * 
     * @param ownerId
     *        The ID of the AWS account that owns the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NetworkAcl withOwnerId(String ownerId) {
        setOwnerId(ownerId);
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
        if (getAssociations() != null)
            sb.append("Associations: ").append(getAssociations()).append(",");
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries()).append(",");
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault()).append(",");
        if (getNetworkAclId() != null)
            sb.append("NetworkAclId: ").append(getNetworkAclId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NetworkAcl == false)
            return false;
        NetworkAcl other = (NetworkAcl) obj;
        if (other.getAssociations() == null ^ this.getAssociations() == null)
            return false;
        if (other.getAssociations() != null && other.getAssociations().equals(this.getAssociations()) == false)
            return false;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null)
            return false;
        if (other.getNetworkAclId() != null && other.getNetworkAclId().equals(this.getNetworkAclId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociations() == null) ? 0 : getAssociations().hashCode());
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        return hashCode;
    }

    @Override
    public NetworkAcl clone() {
        try {
            return (NetworkAcl) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
