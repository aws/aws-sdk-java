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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about an association between a branch network interface with a trunk network interface.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TrunkInterfaceAssociation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrunkInterfaceAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * The ID of the branch network interface.
     * </p>
     */
    private String branchInterfaceId;
    /**
     * <p>
     * The ID of the trunk network interface.
     * </p>
     */
    private String trunkInterfaceId;
    /**
     * <p>
     * The interface protocol. Valid values are <code>VLAN</code> and <code>GRE</code>.
     * </p>
     */
    private String interfaceProtocol;
    /**
     * <p>
     * The ID of the VLAN when you use the VLAN protocol.
     * </p>
     */
    private Integer vlanId;
    /**
     * <p>
     * The application key when you use the GRE protocol.
     * </p>
     */
    private Integer greKey;
    /**
     * <p>
     * The tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param associationId
     *        The ID of the association.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @return The ID of the association.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param associationId
     *        The ID of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrunkInterfaceAssociation withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * The ID of the branch network interface.
     * </p>
     * 
     * @param branchInterfaceId
     *        The ID of the branch network interface.
     */

    public void setBranchInterfaceId(String branchInterfaceId) {
        this.branchInterfaceId = branchInterfaceId;
    }

    /**
     * <p>
     * The ID of the branch network interface.
     * </p>
     * 
     * @return The ID of the branch network interface.
     */

    public String getBranchInterfaceId() {
        return this.branchInterfaceId;
    }

    /**
     * <p>
     * The ID of the branch network interface.
     * </p>
     * 
     * @param branchInterfaceId
     *        The ID of the branch network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrunkInterfaceAssociation withBranchInterfaceId(String branchInterfaceId) {
        setBranchInterfaceId(branchInterfaceId);
        return this;
    }

    /**
     * <p>
     * The ID of the trunk network interface.
     * </p>
     * 
     * @param trunkInterfaceId
     *        The ID of the trunk network interface.
     */

    public void setTrunkInterfaceId(String trunkInterfaceId) {
        this.trunkInterfaceId = trunkInterfaceId;
    }

    /**
     * <p>
     * The ID of the trunk network interface.
     * </p>
     * 
     * @return The ID of the trunk network interface.
     */

    public String getTrunkInterfaceId() {
        return this.trunkInterfaceId;
    }

    /**
     * <p>
     * The ID of the trunk network interface.
     * </p>
     * 
     * @param trunkInterfaceId
     *        The ID of the trunk network interface.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrunkInterfaceAssociation withTrunkInterfaceId(String trunkInterfaceId) {
        setTrunkInterfaceId(trunkInterfaceId);
        return this;
    }

    /**
     * <p>
     * The interface protocol. Valid values are <code>VLAN</code> and <code>GRE</code>.
     * </p>
     * 
     * @param interfaceProtocol
     *        The interface protocol. Valid values are <code>VLAN</code> and <code>GRE</code>.
     * @see InterfaceProtocolType
     */

    public void setInterfaceProtocol(String interfaceProtocol) {
        this.interfaceProtocol = interfaceProtocol;
    }

    /**
     * <p>
     * The interface protocol. Valid values are <code>VLAN</code> and <code>GRE</code>.
     * </p>
     * 
     * @return The interface protocol. Valid values are <code>VLAN</code> and <code>GRE</code>.
     * @see InterfaceProtocolType
     */

    public String getInterfaceProtocol() {
        return this.interfaceProtocol;
    }

    /**
     * <p>
     * The interface protocol. Valid values are <code>VLAN</code> and <code>GRE</code>.
     * </p>
     * 
     * @param interfaceProtocol
     *        The interface protocol. Valid values are <code>VLAN</code> and <code>GRE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterfaceProtocolType
     */

    public TrunkInterfaceAssociation withInterfaceProtocol(String interfaceProtocol) {
        setInterfaceProtocol(interfaceProtocol);
        return this;
    }

    /**
     * <p>
     * The interface protocol. Valid values are <code>VLAN</code> and <code>GRE</code>.
     * </p>
     * 
     * @param interfaceProtocol
     *        The interface protocol. Valid values are <code>VLAN</code> and <code>GRE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InterfaceProtocolType
     */

    public TrunkInterfaceAssociation withInterfaceProtocol(InterfaceProtocolType interfaceProtocol) {
        this.interfaceProtocol = interfaceProtocol.toString();
        return this;
    }

    /**
     * <p>
     * The ID of the VLAN when you use the VLAN protocol.
     * </p>
     * 
     * @param vlanId
     *        The ID of the VLAN when you use the VLAN protocol.
     */

    public void setVlanId(Integer vlanId) {
        this.vlanId = vlanId;
    }

    /**
     * <p>
     * The ID of the VLAN when you use the VLAN protocol.
     * </p>
     * 
     * @return The ID of the VLAN when you use the VLAN protocol.
     */

    public Integer getVlanId() {
        return this.vlanId;
    }

    /**
     * <p>
     * The ID of the VLAN when you use the VLAN protocol.
     * </p>
     * 
     * @param vlanId
     *        The ID of the VLAN when you use the VLAN protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrunkInterfaceAssociation withVlanId(Integer vlanId) {
        setVlanId(vlanId);
        return this;
    }

    /**
     * <p>
     * The application key when you use the GRE protocol.
     * </p>
     * 
     * @param greKey
     *        The application key when you use the GRE protocol.
     */

    public void setGreKey(Integer greKey) {
        this.greKey = greKey;
    }

    /**
     * <p>
     * The application key when you use the GRE protocol.
     * </p>
     * 
     * @return The application key when you use the GRE protocol.
     */

    public Integer getGreKey() {
        return this.greKey;
    }

    /**
     * <p>
     * The application key when you use the GRE protocol.
     * </p>
     * 
     * @param greKey
     *        The application key when you use the GRE protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrunkInterfaceAssociation withGreKey(Integer greKey) {
        setGreKey(greKey);
        return this;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @return The tags.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
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
     * The tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrunkInterfaceAssociation withTags(Tag... tags) {
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
     * The tags.
     * </p>
     * 
     * @param tags
     *        The tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrunkInterfaceAssociation withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getBranchInterfaceId() != null)
            sb.append("BranchInterfaceId: ").append(getBranchInterfaceId()).append(",");
        if (getTrunkInterfaceId() != null)
            sb.append("TrunkInterfaceId: ").append(getTrunkInterfaceId()).append(",");
        if (getInterfaceProtocol() != null)
            sb.append("InterfaceProtocol: ").append(getInterfaceProtocol()).append(",");
        if (getVlanId() != null)
            sb.append("VlanId: ").append(getVlanId()).append(",");
        if (getGreKey() != null)
            sb.append("GreKey: ").append(getGreKey()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrunkInterfaceAssociation == false)
            return false;
        TrunkInterfaceAssociation other = (TrunkInterfaceAssociation) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getBranchInterfaceId() == null ^ this.getBranchInterfaceId() == null)
            return false;
        if (other.getBranchInterfaceId() != null && other.getBranchInterfaceId().equals(this.getBranchInterfaceId()) == false)
            return false;
        if (other.getTrunkInterfaceId() == null ^ this.getTrunkInterfaceId() == null)
            return false;
        if (other.getTrunkInterfaceId() != null && other.getTrunkInterfaceId().equals(this.getTrunkInterfaceId()) == false)
            return false;
        if (other.getInterfaceProtocol() == null ^ this.getInterfaceProtocol() == null)
            return false;
        if (other.getInterfaceProtocol() != null && other.getInterfaceProtocol().equals(this.getInterfaceProtocol()) == false)
            return false;
        if (other.getVlanId() == null ^ this.getVlanId() == null)
            return false;
        if (other.getVlanId() != null && other.getVlanId().equals(this.getVlanId()) == false)
            return false;
        if (other.getGreKey() == null ^ this.getGreKey() == null)
            return false;
        if (other.getGreKey() != null && other.getGreKey().equals(this.getGreKey()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getBranchInterfaceId() == null) ? 0 : getBranchInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getTrunkInterfaceId() == null) ? 0 : getTrunkInterfaceId().hashCode());
        hashCode = prime * hashCode + ((getInterfaceProtocol() == null) ? 0 : getInterfaceProtocol().hashCode());
        hashCode = prime * hashCode + ((getVlanId() == null) ? 0 : getVlanId().hashCode());
        hashCode = prime * hashCode + ((getGreKey() == null) ? 0 : getGreKey().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TrunkInterfaceAssociation clone() {
        try {
            return (TrunkInterfaceAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
