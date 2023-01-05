/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a peering connection.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/Peering" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Peering implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the core network for the peering request.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The ARN of a core network.
     * </p>
     */
    private String coreNetworkArn;
    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     */
    private String peeringId;
    /**
     * <p>
     * The ID of the account owner.
     * </p>
     */
    private String ownerAccountId;
    /**
     * <p>
     * The type of peering. This will be <code>TRANSIT_GATEWAY</code>.
     * </p>
     */
    private String peeringType;
    /**
     * <p>
     * The current state of the peering connection.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The edge location for the peer.
     * </p>
     */
    private String edgeLocation;
    /**
     * <p>
     * The resource ARN of the peer.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The list of key-value tags associated with the peering.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The timestamp when the attachment peer was created.
     * </p>
     */
    private java.util.Date createdAt;

    /**
     * <p>
     * The ID of the core network for the peering request.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of the core network for the peering request.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of the core network for the peering request.
     * </p>
     * 
     * @return The ID of the core network for the peering request.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of the core network for the peering request.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of the core network for the peering request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Peering withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The ARN of a core network.
     * </p>
     * 
     * @param coreNetworkArn
     *        The ARN of a core network.
     */

    public void setCoreNetworkArn(String coreNetworkArn) {
        this.coreNetworkArn = coreNetworkArn;
    }

    /**
     * <p>
     * The ARN of a core network.
     * </p>
     * 
     * @return The ARN of a core network.
     */

    public String getCoreNetworkArn() {
        return this.coreNetworkArn;
    }

    /**
     * <p>
     * The ARN of a core network.
     * </p>
     * 
     * @param coreNetworkArn
     *        The ARN of a core network.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Peering withCoreNetworkArn(String coreNetworkArn) {
        setCoreNetworkArn(coreNetworkArn);
        return this;
    }

    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     * 
     * @param peeringId
     *        The ID of the peering attachment.
     */

    public void setPeeringId(String peeringId) {
        this.peeringId = peeringId;
    }

    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     * 
     * @return The ID of the peering attachment.
     */

    public String getPeeringId() {
        return this.peeringId;
    }

    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     * 
     * @param peeringId
     *        The ID of the peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Peering withPeeringId(String peeringId) {
        setPeeringId(peeringId);
        return this;
    }

    /**
     * <p>
     * The ID of the account owner.
     * </p>
     * 
     * @param ownerAccountId
     *        The ID of the account owner.
     */

    public void setOwnerAccountId(String ownerAccountId) {
        this.ownerAccountId = ownerAccountId;
    }

    /**
     * <p>
     * The ID of the account owner.
     * </p>
     * 
     * @return The ID of the account owner.
     */

    public String getOwnerAccountId() {
        return this.ownerAccountId;
    }

    /**
     * <p>
     * The ID of the account owner.
     * </p>
     * 
     * @param ownerAccountId
     *        The ID of the account owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Peering withOwnerAccountId(String ownerAccountId) {
        setOwnerAccountId(ownerAccountId);
        return this;
    }

    /**
     * <p>
     * The type of peering. This will be <code>TRANSIT_GATEWAY</code>.
     * </p>
     * 
     * @param peeringType
     *        The type of peering. This will be <code>TRANSIT_GATEWAY</code>.
     * @see PeeringType
     */

    public void setPeeringType(String peeringType) {
        this.peeringType = peeringType;
    }

    /**
     * <p>
     * The type of peering. This will be <code>TRANSIT_GATEWAY</code>.
     * </p>
     * 
     * @return The type of peering. This will be <code>TRANSIT_GATEWAY</code>.
     * @see PeeringType
     */

    public String getPeeringType() {
        return this.peeringType;
    }

    /**
     * <p>
     * The type of peering. This will be <code>TRANSIT_GATEWAY</code>.
     * </p>
     * 
     * @param peeringType
     *        The type of peering. This will be <code>TRANSIT_GATEWAY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeeringType
     */

    public Peering withPeeringType(String peeringType) {
        setPeeringType(peeringType);
        return this;
    }

    /**
     * <p>
     * The type of peering. This will be <code>TRANSIT_GATEWAY</code>.
     * </p>
     * 
     * @param peeringType
     *        The type of peering. This will be <code>TRANSIT_GATEWAY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeeringType
     */

    public Peering withPeeringType(PeeringType peeringType) {
        this.peeringType = peeringType.toString();
        return this;
    }

    /**
     * <p>
     * The current state of the peering connection.
     * </p>
     * 
     * @param state
     *        The current state of the peering connection.
     * @see PeeringState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The current state of the peering connection.
     * </p>
     * 
     * @return The current state of the peering connection.
     * @see PeeringState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The current state of the peering connection.
     * </p>
     * 
     * @param state
     *        The current state of the peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeeringState
     */

    public Peering withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The current state of the peering connection.
     * </p>
     * 
     * @param state
     *        The current state of the peering connection.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PeeringState
     */

    public Peering withState(PeeringState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The edge location for the peer.
     * </p>
     * 
     * @param edgeLocation
     *        The edge location for the peer.
     */

    public void setEdgeLocation(String edgeLocation) {
        this.edgeLocation = edgeLocation;
    }

    /**
     * <p>
     * The edge location for the peer.
     * </p>
     * 
     * @return The edge location for the peer.
     */

    public String getEdgeLocation() {
        return this.edgeLocation;
    }

    /**
     * <p>
     * The edge location for the peer.
     * </p>
     * 
     * @param edgeLocation
     *        The edge location for the peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Peering withEdgeLocation(String edgeLocation) {
        setEdgeLocation(edgeLocation);
        return this;
    }

    /**
     * <p>
     * The resource ARN of the peer.
     * </p>
     * 
     * @param resourceArn
     *        The resource ARN of the peer.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The resource ARN of the peer.
     * </p>
     * 
     * @return The resource ARN of the peer.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The resource ARN of the peer.
     * </p>
     * 
     * @param resourceArn
     *        The resource ARN of the peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Peering withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The list of key-value tags associated with the peering.
     * </p>
     * 
     * @return The list of key-value tags associated with the peering.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The list of key-value tags associated with the peering.
     * </p>
     * 
     * @param tags
     *        The list of key-value tags associated with the peering.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The list of key-value tags associated with the peering.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of key-value tags associated with the peering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Peering withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of key-value tags associated with the peering.
     * </p>
     * 
     * @param tags
     *        The list of key-value tags associated with the peering.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Peering withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The timestamp when the attachment peer was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the attachment peer was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp when the attachment peer was created.
     * </p>
     * 
     * @return The timestamp when the attachment peer was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp when the attachment peer was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp when the attachment peer was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Peering withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getCoreNetworkArn() != null)
            sb.append("CoreNetworkArn: ").append(getCoreNetworkArn()).append(",");
        if (getPeeringId() != null)
            sb.append("PeeringId: ").append(getPeeringId()).append(",");
        if (getOwnerAccountId() != null)
            sb.append("OwnerAccountId: ").append(getOwnerAccountId()).append(",");
        if (getPeeringType() != null)
            sb.append("PeeringType: ").append(getPeeringType()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getEdgeLocation() != null)
            sb.append("EdgeLocation: ").append(getEdgeLocation()).append(",");
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Peering == false)
            return false;
        Peering other = (Peering) obj;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getCoreNetworkArn() == null ^ this.getCoreNetworkArn() == null)
            return false;
        if (other.getCoreNetworkArn() != null && other.getCoreNetworkArn().equals(this.getCoreNetworkArn()) == false)
            return false;
        if (other.getPeeringId() == null ^ this.getPeeringId() == null)
            return false;
        if (other.getPeeringId() != null && other.getPeeringId().equals(this.getPeeringId()) == false)
            return false;
        if (other.getOwnerAccountId() == null ^ this.getOwnerAccountId() == null)
            return false;
        if (other.getOwnerAccountId() != null && other.getOwnerAccountId().equals(this.getOwnerAccountId()) == false)
            return false;
        if (other.getPeeringType() == null ^ this.getPeeringType() == null)
            return false;
        if (other.getPeeringType() != null && other.getPeeringType().equals(this.getPeeringType()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getEdgeLocation() == null ^ this.getEdgeLocation() == null)
            return false;
        if (other.getEdgeLocation() != null && other.getEdgeLocation().equals(this.getEdgeLocation()) == false)
            return false;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getCoreNetworkArn() == null) ? 0 : getCoreNetworkArn().hashCode());
        hashCode = prime * hashCode + ((getPeeringId() == null) ? 0 : getPeeringId().hashCode());
        hashCode = prime * hashCode + ((getOwnerAccountId() == null) ? 0 : getOwnerAccountId().hashCode());
        hashCode = prime * hashCode + ((getPeeringType() == null) ? 0 : getPeeringType().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getEdgeLocation() == null) ? 0 : getEdgeLocation().hashCode());
        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        return hashCode;
    }

    @Override
    public Peering clone() {
        try {
            return (Peering) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.PeeringMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
