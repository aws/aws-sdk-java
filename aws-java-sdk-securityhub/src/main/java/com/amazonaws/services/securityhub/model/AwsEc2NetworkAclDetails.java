/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about an EC2 network access control list (ACL).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEc2NetworkAclDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEc2NetworkAclDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Whether this is the default network ACL for the VPC.
     * </p>
     */
    private Boolean isDefault;
    /**
     * <p>
     * The identifier of the network ACL.
     * </p>
     */
    private String networkAclId;
    /**
     * <p>
     * The identifier of the AWS account that owns the network ACL.
     * </p>
     */
    private String ownerId;
    /**
     * <p>
     * The identifier of the VPC for the network ACL.
     * </p>
     */
    private String vpcId;
    /**
     * <p>
     * Associations between the network ACL and subnets.
     * </p>
     */
    private java.util.List<AwsEc2NetworkAclAssociation> associations;
    /**
     * <p>
     * The set of rules in the network ACL.
     * </p>
     */
    private java.util.List<AwsEc2NetworkAclEntry> entries;

    /**
     * <p>
     * Whether this is the default network ACL for the VPC.
     * </p>
     * 
     * @param isDefault
     *        Whether this is the default network ACL for the VPC.
     */

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    /**
     * <p>
     * Whether this is the default network ACL for the VPC.
     * </p>
     * 
     * @return Whether this is the default network ACL for the VPC.
     */

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * Whether this is the default network ACL for the VPC.
     * </p>
     * 
     * @param isDefault
     *        Whether this is the default network ACL for the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclDetails withIsDefault(Boolean isDefault) {
        setIsDefault(isDefault);
        return this;
    }

    /**
     * <p>
     * Whether this is the default network ACL for the VPC.
     * </p>
     * 
     * @return Whether this is the default network ACL for the VPC.
     */

    public Boolean isDefault() {
        return this.isDefault;
    }

    /**
     * <p>
     * The identifier of the network ACL.
     * </p>
     * 
     * @param networkAclId
     *        The identifier of the network ACL.
     */

    public void setNetworkAclId(String networkAclId) {
        this.networkAclId = networkAclId;
    }

    /**
     * <p>
     * The identifier of the network ACL.
     * </p>
     * 
     * @return The identifier of the network ACL.
     */

    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * <p>
     * The identifier of the network ACL.
     * </p>
     * 
     * @param networkAclId
     *        The identifier of the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclDetails withNetworkAclId(String networkAclId) {
        setNetworkAclId(networkAclId);
        return this;
    }

    /**
     * <p>
     * The identifier of the AWS account that owns the network ACL.
     * </p>
     * 
     * @param ownerId
     *        The identifier of the AWS account that owns the network ACL.
     */

    public void setOwnerId(String ownerId) {
        this.ownerId = ownerId;
    }

    /**
     * <p>
     * The identifier of the AWS account that owns the network ACL.
     * </p>
     * 
     * @return The identifier of the AWS account that owns the network ACL.
     */

    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * <p>
     * The identifier of the AWS account that owns the network ACL.
     * </p>
     * 
     * @param ownerId
     *        The identifier of the AWS account that owns the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclDetails withOwnerId(String ownerId) {
        setOwnerId(ownerId);
        return this;
    }

    /**
     * <p>
     * The identifier of the VPC for the network ACL.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC for the network ACL.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC for the network ACL.
     * </p>
     * 
     * @return The identifier of the VPC for the network ACL.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The identifier of the VPC for the network ACL.
     * </p>
     * 
     * @param vpcId
     *        The identifier of the VPC for the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclDetails withVpcId(String vpcId) {
        setVpcId(vpcId);
        return this;
    }

    /**
     * <p>
     * Associations between the network ACL and subnets.
     * </p>
     * 
     * @return Associations between the network ACL and subnets.
     */

    public java.util.List<AwsEc2NetworkAclAssociation> getAssociations() {
        return associations;
    }

    /**
     * <p>
     * Associations between the network ACL and subnets.
     * </p>
     * 
     * @param associations
     *        Associations between the network ACL and subnets.
     */

    public void setAssociations(java.util.Collection<AwsEc2NetworkAclAssociation> associations) {
        if (associations == null) {
            this.associations = null;
            return;
        }

        this.associations = new java.util.ArrayList<AwsEc2NetworkAclAssociation>(associations);
    }

    /**
     * <p>
     * Associations between the network ACL and subnets.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAssociations(java.util.Collection)} or {@link #withAssociations(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param associations
     *        Associations between the network ACL and subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclDetails withAssociations(AwsEc2NetworkAclAssociation... associations) {
        if (this.associations == null) {
            setAssociations(new java.util.ArrayList<AwsEc2NetworkAclAssociation>(associations.length));
        }
        for (AwsEc2NetworkAclAssociation ele : associations) {
            this.associations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Associations between the network ACL and subnets.
     * </p>
     * 
     * @param associations
     *        Associations between the network ACL and subnets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclDetails withAssociations(java.util.Collection<AwsEc2NetworkAclAssociation> associations) {
        setAssociations(associations);
        return this;
    }

    /**
     * <p>
     * The set of rules in the network ACL.
     * </p>
     * 
     * @return The set of rules in the network ACL.
     */

    public java.util.List<AwsEc2NetworkAclEntry> getEntries() {
        return entries;
    }

    /**
     * <p>
     * The set of rules in the network ACL.
     * </p>
     * 
     * @param entries
     *        The set of rules in the network ACL.
     */

    public void setEntries(java.util.Collection<AwsEc2NetworkAclEntry> entries) {
        if (entries == null) {
            this.entries = null;
            return;
        }

        this.entries = new java.util.ArrayList<AwsEc2NetworkAclEntry>(entries);
    }

    /**
     * <p>
     * The set of rules in the network ACL.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEntries(java.util.Collection)} or {@link #withEntries(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param entries
     *        The set of rules in the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclDetails withEntries(AwsEc2NetworkAclEntry... entries) {
        if (this.entries == null) {
            setEntries(new java.util.ArrayList<AwsEc2NetworkAclEntry>(entries.length));
        }
        for (AwsEc2NetworkAclEntry ele : entries) {
            this.entries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of rules in the network ACL.
     * </p>
     * 
     * @param entries
     *        The set of rules in the network ACL.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEc2NetworkAclDetails withEntries(java.util.Collection<AwsEc2NetworkAclEntry> entries) {
        setEntries(entries);
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
        if (getIsDefault() != null)
            sb.append("IsDefault: ").append(getIsDefault()).append(",");
        if (getNetworkAclId() != null)
            sb.append("NetworkAclId: ").append(getNetworkAclId()).append(",");
        if (getOwnerId() != null)
            sb.append("OwnerId: ").append(getOwnerId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
        if (getAssociations() != null)
            sb.append("Associations: ").append(getAssociations()).append(",");
        if (getEntries() != null)
            sb.append("Entries: ").append(getEntries());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEc2NetworkAclDetails == false)
            return false;
        AwsEc2NetworkAclDetails other = (AwsEc2NetworkAclDetails) obj;
        if (other.getIsDefault() == null ^ this.getIsDefault() == null)
            return false;
        if (other.getIsDefault() != null && other.getIsDefault().equals(this.getIsDefault()) == false)
            return false;
        if (other.getNetworkAclId() == null ^ this.getNetworkAclId() == null)
            return false;
        if (other.getNetworkAclId() != null && other.getNetworkAclId().equals(this.getNetworkAclId()) == false)
            return false;
        if (other.getOwnerId() == null ^ this.getOwnerId() == null)
            return false;
        if (other.getOwnerId() != null && other.getOwnerId().equals(this.getOwnerId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
            return false;
        if (other.getAssociations() == null ^ this.getAssociations() == null)
            return false;
        if (other.getAssociations() != null && other.getAssociations().equals(this.getAssociations()) == false)
            return false;
        if (other.getEntries() == null ^ this.getEntries() == null)
            return false;
        if (other.getEntries() != null && other.getEntries().equals(this.getEntries()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIsDefault() == null) ? 0 : getIsDefault().hashCode());
        hashCode = prime * hashCode + ((getNetworkAclId() == null) ? 0 : getNetworkAclId().hashCode());
        hashCode = prime * hashCode + ((getOwnerId() == null) ? 0 : getOwnerId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getAssociations() == null) ? 0 : getAssociations().hashCode());
        hashCode = prime * hashCode + ((getEntries() == null) ? 0 : getEntries().hashCode());
        return hashCode;
    }

    @Override
    public AwsEc2NetworkAclDetails clone() {
        try {
            return (AwsEc2NetworkAclDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEc2NetworkAclDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
