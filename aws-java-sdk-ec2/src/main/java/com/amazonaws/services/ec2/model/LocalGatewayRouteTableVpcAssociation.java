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
 * Describes an association between a local gateway route table and a VPC.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/LocalGatewayRouteTableVpcAssociation"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LocalGatewayRouteTableVpcAssociation implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the association.
     * </p>
     */
    private String localGatewayRouteTableVpcAssociationId;
    /**
     * <p>
     * The ID of the local gateway route table.
     * </p>
     */
    private String localGatewayRouteTableId;
    /**
     * <p>
     * The ID of the local gateway.
     * </p>
     */
    private String localGatewayId;
    /**
     * <p>
     * The ID of the VPC.
     * </p>
     */
    private String vpcId;
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
     * @param localGatewayRouteTableVpcAssociationId
     *        The ID of the association.
     */

    public void setLocalGatewayRouteTableVpcAssociationId(String localGatewayRouteTableVpcAssociationId) {
        this.localGatewayRouteTableVpcAssociationId = localGatewayRouteTableVpcAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @return The ID of the association.
     */

    public String getLocalGatewayRouteTableVpcAssociationId() {
        return this.localGatewayRouteTableVpcAssociationId;
    }

    /**
     * <p>
     * The ID of the association.
     * </p>
     * 
     * @param localGatewayRouteTableVpcAssociationId
     *        The ID of the association.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayRouteTableVpcAssociation withLocalGatewayRouteTableVpcAssociationId(String localGatewayRouteTableVpcAssociationId) {
        setLocalGatewayRouteTableVpcAssociationId(localGatewayRouteTableVpcAssociationId);
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

    public LocalGatewayRouteTableVpcAssociation withLocalGatewayRouteTableId(String localGatewayRouteTableId) {
        setLocalGatewayRouteTableId(localGatewayRouteTableId);
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

    public LocalGatewayRouteTableVpcAssociation withLocalGatewayId(String localGatewayId) {
        setLocalGatewayId(localGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     */

    public void setVpcId(String vpcId) {
        this.vpcId = vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @return The ID of the VPC.
     */

    public String getVpcId() {
        return this.vpcId;
    }

    /**
     * <p>
     * The ID of the VPC.
     * </p>
     * 
     * @param vpcId
     *        The ID of the VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LocalGatewayRouteTableVpcAssociation withVpcId(String vpcId) {
        setVpcId(vpcId);
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

    public LocalGatewayRouteTableVpcAssociation withState(String state) {
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

    public LocalGatewayRouteTableVpcAssociation withTags(Tag... tags) {
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

    public LocalGatewayRouteTableVpcAssociation withTags(java.util.Collection<Tag> tags) {
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
        if (getLocalGatewayRouteTableVpcAssociationId() != null)
            sb.append("LocalGatewayRouteTableVpcAssociationId: ").append(getLocalGatewayRouteTableVpcAssociationId()).append(",");
        if (getLocalGatewayRouteTableId() != null)
            sb.append("LocalGatewayRouteTableId: ").append(getLocalGatewayRouteTableId()).append(",");
        if (getLocalGatewayId() != null)
            sb.append("LocalGatewayId: ").append(getLocalGatewayId()).append(",");
        if (getVpcId() != null)
            sb.append("VpcId: ").append(getVpcId()).append(",");
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

        if (obj instanceof LocalGatewayRouteTableVpcAssociation == false)
            return false;
        LocalGatewayRouteTableVpcAssociation other = (LocalGatewayRouteTableVpcAssociation) obj;
        if (other.getLocalGatewayRouteTableVpcAssociationId() == null ^ this.getLocalGatewayRouteTableVpcAssociationId() == null)
            return false;
        if (other.getLocalGatewayRouteTableVpcAssociationId() != null
                && other.getLocalGatewayRouteTableVpcAssociationId().equals(this.getLocalGatewayRouteTableVpcAssociationId()) == false)
            return false;
        if (other.getLocalGatewayRouteTableId() == null ^ this.getLocalGatewayRouteTableId() == null)
            return false;
        if (other.getLocalGatewayRouteTableId() != null && other.getLocalGatewayRouteTableId().equals(this.getLocalGatewayRouteTableId()) == false)
            return false;
        if (other.getLocalGatewayId() == null ^ this.getLocalGatewayId() == null)
            return false;
        if (other.getLocalGatewayId() != null && other.getLocalGatewayId().equals(this.getLocalGatewayId()) == false)
            return false;
        if (other.getVpcId() == null ^ this.getVpcId() == null)
            return false;
        if (other.getVpcId() != null && other.getVpcId().equals(this.getVpcId()) == false)
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

        hashCode = prime * hashCode + ((getLocalGatewayRouteTableVpcAssociationId() == null) ? 0 : getLocalGatewayRouteTableVpcAssociationId().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayRouteTableId() == null) ? 0 : getLocalGatewayRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getLocalGatewayId() == null) ? 0 : getLocalGatewayId().hashCode());
        hashCode = prime * hashCode + ((getVpcId() == null) ? 0 : getVpcId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public LocalGatewayRouteTableVpcAssociation clone() {
        try {
            return (LocalGatewayRouteTableVpcAssociation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
