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
 * Describes a transit gateway route table.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayRouteTable" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayRouteTable implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     */
    private String transitGatewayRouteTableId;
    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The state of the transit gateway route table.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Indicates whether this is the default association route table for the transit gateway.
     * </p>
     */
    private Boolean defaultAssociationRouteTable;
    /**
     * <p>
     * Indicates whether this is the default propagation route table for the transit gateway.
     * </p>
     */
    private Boolean defaultPropagationRouteTable;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * Any tags assigned to the route table.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the transit gateway route table.
     */

    public void setTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        this.transitGatewayRouteTableId = transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @return The ID of the transit gateway route table.
     */

    public String getTransitGatewayRouteTableId() {
        return this.transitGatewayRouteTableId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     * 
     * @param transitGatewayRouteTableId
     *        The ID of the transit gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTable withTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        setTransitGatewayRouteTableId(transitGatewayRouteTableId);
        return this;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway.
     */

    public void setTransitGatewayId(String transitGatewayId) {
        this.transitGatewayId = transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @return The ID of the transit gateway.
     */

    public String getTransitGatewayId() {
        return this.transitGatewayId;
    }

    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     * 
     * @param transitGatewayId
     *        The ID of the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTable withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway route table.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway route table.
     * @see TransitGatewayRouteTableState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the transit gateway route table.
     * </p>
     * 
     * @return The state of the transit gateway route table.
     * @see TransitGatewayRouteTableState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the transit gateway route table.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayRouteTableState
     */

    public TransitGatewayRouteTable withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway route table.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayRouteTableState
     */

    public TransitGatewayRouteTable withState(TransitGatewayRouteTableState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Indicates whether this is the default association route table for the transit gateway.
     * </p>
     * 
     * @param defaultAssociationRouteTable
     *        Indicates whether this is the default association route table for the transit gateway.
     */

    public void setDefaultAssociationRouteTable(Boolean defaultAssociationRouteTable) {
        this.defaultAssociationRouteTable = defaultAssociationRouteTable;
    }

    /**
     * <p>
     * Indicates whether this is the default association route table for the transit gateway.
     * </p>
     * 
     * @return Indicates whether this is the default association route table for the transit gateway.
     */

    public Boolean getDefaultAssociationRouteTable() {
        return this.defaultAssociationRouteTable;
    }

    /**
     * <p>
     * Indicates whether this is the default association route table for the transit gateway.
     * </p>
     * 
     * @param defaultAssociationRouteTable
     *        Indicates whether this is the default association route table for the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTable withDefaultAssociationRouteTable(Boolean defaultAssociationRouteTable) {
        setDefaultAssociationRouteTable(defaultAssociationRouteTable);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is the default association route table for the transit gateway.
     * </p>
     * 
     * @return Indicates whether this is the default association route table for the transit gateway.
     */

    public Boolean isDefaultAssociationRouteTable() {
        return this.defaultAssociationRouteTable;
    }

    /**
     * <p>
     * Indicates whether this is the default propagation route table for the transit gateway.
     * </p>
     * 
     * @param defaultPropagationRouteTable
     *        Indicates whether this is the default propagation route table for the transit gateway.
     */

    public void setDefaultPropagationRouteTable(Boolean defaultPropagationRouteTable) {
        this.defaultPropagationRouteTable = defaultPropagationRouteTable;
    }

    /**
     * <p>
     * Indicates whether this is the default propagation route table for the transit gateway.
     * </p>
     * 
     * @return Indicates whether this is the default propagation route table for the transit gateway.
     */

    public Boolean getDefaultPropagationRouteTable() {
        return this.defaultPropagationRouteTable;
    }

    /**
     * <p>
     * Indicates whether this is the default propagation route table for the transit gateway.
     * </p>
     * 
     * @param defaultPropagationRouteTable
     *        Indicates whether this is the default propagation route table for the transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTable withDefaultPropagationRouteTable(Boolean defaultPropagationRouteTable) {
        setDefaultPropagationRouteTable(defaultPropagationRouteTable);
        return this;
    }

    /**
     * <p>
     * Indicates whether this is the default propagation route table for the transit gateway.
     * </p>
     * 
     * @return Indicates whether this is the default propagation route table for the transit gateway.
     */

    public Boolean isDefaultPropagationRouteTable() {
        return this.defaultPropagationRouteTable;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @return The creation time.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The creation time.
     * </p>
     * 
     * @param creationTime
     *        The creation time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTable withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the route table.
     * </p>
     * 
     * @return Any tags assigned to the route table.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the route table.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the route table.
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
     * Any tags assigned to the route table.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTable withTags(Tag... tags) {
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
     * Any tags assigned to the route table.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the route table.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTable withTags(java.util.Collection<Tag> tags) {
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
        if (getTransitGatewayRouteTableId() != null)
            sb.append("TransitGatewayRouteTableId: ").append(getTransitGatewayRouteTableId()).append(",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getDefaultAssociationRouteTable() != null)
            sb.append("DefaultAssociationRouteTable: ").append(getDefaultAssociationRouteTable()).append(",");
        if (getDefaultPropagationRouteTable() != null)
            sb.append("DefaultPropagationRouteTable: ").append(getDefaultPropagationRouteTable()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
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

        if (obj instanceof TransitGatewayRouteTable == false)
            return false;
        TransitGatewayRouteTable other = (TransitGatewayRouteTable) obj;
        if (other.getTransitGatewayRouteTableId() == null ^ this.getTransitGatewayRouteTableId() == null)
            return false;
        if (other.getTransitGatewayRouteTableId() != null && other.getTransitGatewayRouteTableId().equals(this.getTransitGatewayRouteTableId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getDefaultAssociationRouteTable() == null ^ this.getDefaultAssociationRouteTable() == null)
            return false;
        if (other.getDefaultAssociationRouteTable() != null && other.getDefaultAssociationRouteTable().equals(this.getDefaultAssociationRouteTable()) == false)
            return false;
        if (other.getDefaultPropagationRouteTable() == null ^ this.getDefaultPropagationRouteTable() == null)
            return false;
        if (other.getDefaultPropagationRouteTable() != null && other.getDefaultPropagationRouteTable().equals(this.getDefaultPropagationRouteTable()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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

        hashCode = prime * hashCode + ((getTransitGatewayRouteTableId() == null) ? 0 : getTransitGatewayRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getDefaultAssociationRouteTable() == null) ? 0 : getDefaultAssociationRouteTable().hashCode());
        hashCode = prime * hashCode + ((getDefaultPropagationRouteTable() == null) ? 0 : getDefaultPropagationRouteTable().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayRouteTable clone() {
        try {
            return (TransitGatewayRouteTable) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
