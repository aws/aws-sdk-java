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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Describes a transit gateway route table announcement.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayRouteTableAnnouncement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayRouteTableAnnouncement implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the transit gateway route table announcement.
     * </p>
     */
    private String transitGatewayRouteTableAnnouncementId;
    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The ID of the core network for the transit gateway route table announcement.
     * </p>
     */
    private String coreNetworkId;
    /**
     * <p>
     * The ID of the peer transit gateway.
     * </p>
     */
    private String peerTransitGatewayId;
    /**
     * <p>
     * The ID of the core network ID for the peer.
     * </p>
     */
    private String peerCoreNetworkId;
    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     */
    private String peeringAttachmentId;
    /**
     * <p>
     * The direction for the route table announcement.
     * </p>
     */
    private String announcementDirection;
    /**
     * <p>
     * The ID of the transit gateway route table.
     * </p>
     */
    private String transitGatewayRouteTableId;
    /**
     * <p>
     * The state of the transit gateway announcement.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The timestamp when the transit gateway route table announcement was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The key-value pairs associated with the route table announcement.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the transit gateway route table announcement.
     * </p>
     * 
     * @param transitGatewayRouteTableAnnouncementId
     *        The ID of the transit gateway route table announcement.
     */

    public void setTransitGatewayRouteTableAnnouncementId(String transitGatewayRouteTableAnnouncementId) {
        this.transitGatewayRouteTableAnnouncementId = transitGatewayRouteTableAnnouncementId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table announcement.
     * </p>
     * 
     * @return The ID of the transit gateway route table announcement.
     */

    public String getTransitGatewayRouteTableAnnouncementId() {
        return this.transitGatewayRouteTableAnnouncementId;
    }

    /**
     * <p>
     * The ID of the transit gateway route table announcement.
     * </p>
     * 
     * @param transitGatewayRouteTableAnnouncementId
     *        The ID of the transit gateway route table announcement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableAnnouncement withTransitGatewayRouteTableAnnouncementId(String transitGatewayRouteTableAnnouncementId) {
        setTransitGatewayRouteTableAnnouncementId(transitGatewayRouteTableAnnouncementId);
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

    public TransitGatewayRouteTableAnnouncement withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the core network for the transit gateway route table announcement.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of the core network for the transit gateway route table announcement.
     */

    public void setCoreNetworkId(String coreNetworkId) {
        this.coreNetworkId = coreNetworkId;
    }

    /**
     * <p>
     * The ID of the core network for the transit gateway route table announcement.
     * </p>
     * 
     * @return The ID of the core network for the transit gateway route table announcement.
     */

    public String getCoreNetworkId() {
        return this.coreNetworkId;
    }

    /**
     * <p>
     * The ID of the core network for the transit gateway route table announcement.
     * </p>
     * 
     * @param coreNetworkId
     *        The ID of the core network for the transit gateway route table announcement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableAnnouncement withCoreNetworkId(String coreNetworkId) {
        setCoreNetworkId(coreNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of the peer transit gateway.
     * </p>
     * 
     * @param peerTransitGatewayId
     *        The ID of the peer transit gateway.
     */

    public void setPeerTransitGatewayId(String peerTransitGatewayId) {
        this.peerTransitGatewayId = peerTransitGatewayId;
    }

    /**
     * <p>
     * The ID of the peer transit gateway.
     * </p>
     * 
     * @return The ID of the peer transit gateway.
     */

    public String getPeerTransitGatewayId() {
        return this.peerTransitGatewayId;
    }

    /**
     * <p>
     * The ID of the peer transit gateway.
     * </p>
     * 
     * @param peerTransitGatewayId
     *        The ID of the peer transit gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableAnnouncement withPeerTransitGatewayId(String peerTransitGatewayId) {
        setPeerTransitGatewayId(peerTransitGatewayId);
        return this;
    }

    /**
     * <p>
     * The ID of the core network ID for the peer.
     * </p>
     * 
     * @param peerCoreNetworkId
     *        The ID of the core network ID for the peer.
     */

    public void setPeerCoreNetworkId(String peerCoreNetworkId) {
        this.peerCoreNetworkId = peerCoreNetworkId;
    }

    /**
     * <p>
     * The ID of the core network ID for the peer.
     * </p>
     * 
     * @return The ID of the core network ID for the peer.
     */

    public String getPeerCoreNetworkId() {
        return this.peerCoreNetworkId;
    }

    /**
     * <p>
     * The ID of the core network ID for the peer.
     * </p>
     * 
     * @param peerCoreNetworkId
     *        The ID of the core network ID for the peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableAnnouncement withPeerCoreNetworkId(String peerCoreNetworkId) {
        setPeerCoreNetworkId(peerCoreNetworkId);
        return this;
    }

    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     * 
     * @param peeringAttachmentId
     *        The ID of the peering attachment.
     */

    public void setPeeringAttachmentId(String peeringAttachmentId) {
        this.peeringAttachmentId = peeringAttachmentId;
    }

    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     * 
     * @return The ID of the peering attachment.
     */

    public String getPeeringAttachmentId() {
        return this.peeringAttachmentId;
    }

    /**
     * <p>
     * The ID of the peering attachment.
     * </p>
     * 
     * @param peeringAttachmentId
     *        The ID of the peering attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableAnnouncement withPeeringAttachmentId(String peeringAttachmentId) {
        setPeeringAttachmentId(peeringAttachmentId);
        return this;
    }

    /**
     * <p>
     * The direction for the route table announcement.
     * </p>
     * 
     * @param announcementDirection
     *        The direction for the route table announcement.
     * @see TransitGatewayRouteTableAnnouncementDirection
     */

    public void setAnnouncementDirection(String announcementDirection) {
        this.announcementDirection = announcementDirection;
    }

    /**
     * <p>
     * The direction for the route table announcement.
     * </p>
     * 
     * @return The direction for the route table announcement.
     * @see TransitGatewayRouteTableAnnouncementDirection
     */

    public String getAnnouncementDirection() {
        return this.announcementDirection;
    }

    /**
     * <p>
     * The direction for the route table announcement.
     * </p>
     * 
     * @param announcementDirection
     *        The direction for the route table announcement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayRouteTableAnnouncementDirection
     */

    public TransitGatewayRouteTableAnnouncement withAnnouncementDirection(String announcementDirection) {
        setAnnouncementDirection(announcementDirection);
        return this;
    }

    /**
     * <p>
     * The direction for the route table announcement.
     * </p>
     * 
     * @param announcementDirection
     *        The direction for the route table announcement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayRouteTableAnnouncementDirection
     */

    public TransitGatewayRouteTableAnnouncement withAnnouncementDirection(TransitGatewayRouteTableAnnouncementDirection announcementDirection) {
        this.announcementDirection = announcementDirection.toString();
        return this;
    }

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

    public TransitGatewayRouteTableAnnouncement withTransitGatewayRouteTableId(String transitGatewayRouteTableId) {
        setTransitGatewayRouteTableId(transitGatewayRouteTableId);
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway announcement.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway announcement.
     * @see TransitGatewayRouteTableAnnouncementState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the transit gateway announcement.
     * </p>
     * 
     * @return The state of the transit gateway announcement.
     * @see TransitGatewayRouteTableAnnouncementState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the transit gateway announcement.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway announcement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayRouteTableAnnouncementState
     */

    public TransitGatewayRouteTableAnnouncement withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the transit gateway announcement.
     * </p>
     * 
     * @param state
     *        The state of the transit gateway announcement.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayRouteTableAnnouncementState
     */

    public TransitGatewayRouteTableAnnouncement withState(TransitGatewayRouteTableAnnouncementState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the transit gateway route table announcement was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the transit gateway route table announcement was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The timestamp when the transit gateway route table announcement was created.
     * </p>
     * 
     * @return The timestamp when the transit gateway route table announcement was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The timestamp when the transit gateway route table announcement was created.
     * </p>
     * 
     * @param creationTime
     *        The timestamp when the transit gateway route table announcement was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableAnnouncement withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The key-value pairs associated with the route table announcement.
     * </p>
     * 
     * @return The key-value pairs associated with the route table announcement.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The key-value pairs associated with the route table announcement.
     * </p>
     * 
     * @param tags
     *        The key-value pairs associated with the route table announcement.
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
     * The key-value pairs associated with the route table announcement.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key-value pairs associated with the route table announcement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableAnnouncement withTags(Tag... tags) {
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
     * The key-value pairs associated with the route table announcement.
     * </p>
     * 
     * @param tags
     *        The key-value pairs associated with the route table announcement.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayRouteTableAnnouncement withTags(java.util.Collection<Tag> tags) {
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
        if (getTransitGatewayRouteTableAnnouncementId() != null)
            sb.append("TransitGatewayRouteTableAnnouncementId: ").append(getTransitGatewayRouteTableAnnouncementId()).append(",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getCoreNetworkId() != null)
            sb.append("CoreNetworkId: ").append(getCoreNetworkId()).append(",");
        if (getPeerTransitGatewayId() != null)
            sb.append("PeerTransitGatewayId: ").append(getPeerTransitGatewayId()).append(",");
        if (getPeerCoreNetworkId() != null)
            sb.append("PeerCoreNetworkId: ").append(getPeerCoreNetworkId()).append(",");
        if (getPeeringAttachmentId() != null)
            sb.append("PeeringAttachmentId: ").append(getPeeringAttachmentId()).append(",");
        if (getAnnouncementDirection() != null)
            sb.append("AnnouncementDirection: ").append(getAnnouncementDirection()).append(",");
        if (getTransitGatewayRouteTableId() != null)
            sb.append("TransitGatewayRouteTableId: ").append(getTransitGatewayRouteTableId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
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

        if (obj instanceof TransitGatewayRouteTableAnnouncement == false)
            return false;
        TransitGatewayRouteTableAnnouncement other = (TransitGatewayRouteTableAnnouncement) obj;
        if (other.getTransitGatewayRouteTableAnnouncementId() == null ^ this.getTransitGatewayRouteTableAnnouncementId() == null)
            return false;
        if (other.getTransitGatewayRouteTableAnnouncementId() != null
                && other.getTransitGatewayRouteTableAnnouncementId().equals(this.getTransitGatewayRouteTableAnnouncementId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getCoreNetworkId() == null ^ this.getCoreNetworkId() == null)
            return false;
        if (other.getCoreNetworkId() != null && other.getCoreNetworkId().equals(this.getCoreNetworkId()) == false)
            return false;
        if (other.getPeerTransitGatewayId() == null ^ this.getPeerTransitGatewayId() == null)
            return false;
        if (other.getPeerTransitGatewayId() != null && other.getPeerTransitGatewayId().equals(this.getPeerTransitGatewayId()) == false)
            return false;
        if (other.getPeerCoreNetworkId() == null ^ this.getPeerCoreNetworkId() == null)
            return false;
        if (other.getPeerCoreNetworkId() != null && other.getPeerCoreNetworkId().equals(this.getPeerCoreNetworkId()) == false)
            return false;
        if (other.getPeeringAttachmentId() == null ^ this.getPeeringAttachmentId() == null)
            return false;
        if (other.getPeeringAttachmentId() != null && other.getPeeringAttachmentId().equals(this.getPeeringAttachmentId()) == false)
            return false;
        if (other.getAnnouncementDirection() == null ^ this.getAnnouncementDirection() == null)
            return false;
        if (other.getAnnouncementDirection() != null && other.getAnnouncementDirection().equals(this.getAnnouncementDirection()) == false)
            return false;
        if (other.getTransitGatewayRouteTableId() == null ^ this.getTransitGatewayRouteTableId() == null)
            return false;
        if (other.getTransitGatewayRouteTableId() != null && other.getTransitGatewayRouteTableId().equals(this.getTransitGatewayRouteTableId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
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

        hashCode = prime * hashCode + ((getTransitGatewayRouteTableAnnouncementId() == null) ? 0 : getTransitGatewayRouteTableAnnouncementId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getCoreNetworkId() == null) ? 0 : getCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getPeerTransitGatewayId() == null) ? 0 : getPeerTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getPeerCoreNetworkId() == null) ? 0 : getPeerCoreNetworkId().hashCode());
        hashCode = prime * hashCode + ((getPeeringAttachmentId() == null) ? 0 : getPeeringAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getAnnouncementDirection() == null) ? 0 : getAnnouncementDirection().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayRouteTableId() == null) ? 0 : getTransitGatewayRouteTableId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayRouteTableAnnouncement clone() {
        try {
            return (TransitGatewayRouteTableAnnouncement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
