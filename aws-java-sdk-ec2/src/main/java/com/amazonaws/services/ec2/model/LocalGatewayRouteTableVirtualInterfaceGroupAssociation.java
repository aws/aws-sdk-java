/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Describes an association between a local gateway route table and a virtual interface group.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LocalGatewayRouteTableVirtualInterfaceGroupAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalGatewayRouteTableVirtualInterfaceGroupAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String localGatewayRouteTableVirtualInterfaceGroupAssociationId;
    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     */
    private String localGatewayVirtualInterfaceGroupId;
    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     */
    private String localGatewayId;
    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     */
    private String localGatewayRouteTableId;
    /**
     * <p>
     * The state of the association.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The tags assigned to the association.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param localGatewayRouteTableVirtualInterfaceGroupAssociationId
     *        The ID of the association.
     */

    public void setLocalGatewayRouteTableVirtualInterfaceGroupAssociationId(String localGatewayRouteTableVirtualInterfaceGroupAssociationId) {
        this.localGatewayRouteTableVirtualInterfaceGroupAssociationId = localGatewayRouteTableVirtualInterfaceGroupAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @return The ID of the association.
     */

    public String getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId() {
        return this.localGatewayRouteTableVirtualInterfaceGroupAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param localGatewayRouteTableVirtualInterfaceGroupAssociationId
     *        The ID of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation withLocalGatewayRouteTableVirtualInterfaceGroupAssociationId(
            String localGatewayRouteTableVirtualInterfaceGroupAssociationId) {
        setLocalGatewayRouteTableVirtualInterfaceGroupAssociationId(localGatewayRouteTableVirtualInterfaceGroupAssociationId);
        return this;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceGroupId
     *        The ID of the virtual interface group.
     */

    public void setLocalGatewayVirtualInterfaceGroupId(String localGatewayVirtualInterfaceGroupId) {
        this.localGatewayVirtualInterfaceGroupId = localGatewayVirtualInterfaceGroupId;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     * 
     * @return The ID of the virtual interface group.
     */

    public String getLocalGatewayVirtualInterfaceGroupId() {
        return this.localGatewayVirtualInterfaceGroupId;
    }

    /**
     * <p>
     * The ID of the virtual interface group.
     * </p>
     * 
     * @param localGatewayVirtualInterfaceGroupId
     *        The ID of the virtual interface group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation withLocalGatewayVirtualInterfaceGroupId(String localGatewayVirtualInterfaceGroupId) {
        setLocalGatewayVirtualInterfaceGroupId(localGatewayVirtualInterfaceGroupId);
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @param localGatewayId
     *        The ID of the local gateway.
     */

    public void setLocalGatewayId(String localGatewayId) {
        this.localGatewayId = localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @return The ID of the local gateway.
     */

    public String getLocalGatewayId() {
        return this.localGatewayId;
    }

    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     * 
     * @param localGatewayId
     *        The ID of the local gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation withLocalGatewayId(String localGatewayId) {
        setLocalGatewayId(localGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     */

    public void setLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        this.localGatewayRouteTableId = localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @return The ID of the local gateway route table.
     */

    public String getLocalGatewayRouteTableId() {
        return this.localGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     * 
     * @param localGatewayRouteTableId
     *        The ID of the local gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation withLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        setLocalGatewayRouteTableId(localGatewayRouteTableId);
        return this;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * 
     * @param state
     *        The state of the association.
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * 
     * @return The state of the association.
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the association.
     * </p>
     * 
     * @param state
     *        The state of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the association.
     * </p>
     * 
     * @return The tags assigned to the association.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the association.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the association.
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
     * The tags assigned to the association.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation withTags(Tag... tags) {
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
     * The tags assigned to the association.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation withTags(java.util.Collection<Tag> tags) {
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
        if (getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId() != null)
            sb.append("LocalGatewayRouteTableVirtualInterfaceGroupAssociationId: ").append(getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId())
                    .append(",");
        if (getLocalGatewayVirtualInterfaceGroupId() != null)
            sb.append("LocalGatewayVirtualInterfaceGroupId: ").append(getLocalGatewayVirtualInterfaceGroupId()).append(",");
        if (getLocalGatewayId() != null)
            sb.append("LocalGatewayId: ").append(getLocalGatewayId()).append(",");
        if (getLocalGatewayRouteTableId() != null)
            sb.append("LocalGatewayRouteTableId: ").append(getLocalGatewayRouteTableId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof LocalGatewayRouteTableVirtualInterfaceGroupAssociation == false)
            return false;
        LocalGatewayRouteTableVirtualInterfaceGroupAssociation other = (LocalGatewayRouteTableVirtualInterfaceGroupAssociation) obj;
        if (other.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId() == null
                ^ this.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId() == null)
            return false;
        if (other.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId() != null
                && other.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId().equals(
                        this.getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId()) == false)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroupId() == null ^ this.getLocalGatewayVirtualInterfaceGroupId() == null)
            return false;
        if (other.getLocalGatewayVirtualInterfaceGroupId() != null
                && other.getLocalGatewayVirtualInterfaceGroupId().equals(this.getLocalGatewayVirtualInterfaceGroupId()) == false)
            return false;
        if (other.getLocalGatewayId() == null ^ this.getLocalGatewayId() == null)
            return false;
        if (other.getLocalGatewayId() != null && other.getLocalGatewayId().equals(this.getLocalGatewayId()) == false)
            return false;
        if (other.getLocalGatewayRouteTableId() == null ^ this.getLocalGatewayRouteTableId() == null)
            return false;
        if (other.getLocalGatewayRouteTableId() != null && other.getLocalGatewayRouteTableId().equals(this.getLocalGatewayRouteTableId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime
                * hashCode
                + ((getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId() == null) ? 0 : getLocalGatewayRouteTableVirtualInterfaceGroupAssociationId()
                        .hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayVirtualInterfaceGroupId() == null) ? 0 : getLocalGatewayVirtualInterfaceGroupId().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayId() == null) ? 0 : getLocalGatewayId().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayRouteTableId() == null) ? 0 : getLocalGatewayRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public LocalGatewayRouteTableVirtualInterfaceGroupAssociation clone() {
        try {
            return (LocalGatewayRouteTableVirtualInterfaceGroupAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
