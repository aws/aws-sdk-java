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
 * Describes a transit gateway Connect peer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayConnectPeer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayConnectPeer implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Connect attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;
    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     */
    private String transitGatewayConnectPeerId;
    /**
     * <p>
     * The state of the Connect peer.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The creation time.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The Connect peer details.
     * </p>
     */
    private TransitGatewayConnectPeerConfiguration connectPeerConfiguration;
    /**
     * <p>
     * The tags for the Connect peer.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the Connect attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the Connect attachment.
     */

    public void setTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        this.transitGatewayAttachmentId = transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the Connect attachment.
     * </p>
     * 
     * @return The ID of the Connect attachment.
     */

    public String getTransitGatewayAttachmentId() {
        return this.transitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the Connect attachment.
     * </p>
     * 
     * @param transitGatewayAttachmentId
     *        The ID of the Connect attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeer withTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        setTransitGatewayAttachmentId(transitGatewayAttachmentId);
        return this;
    }

    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     * 
     * @param transitGatewayConnectPeerId
     *        The ID of the Connect peer.
     */

    public void setTransitGatewayConnectPeerId(String transitGatewayConnectPeerId) {
        this.transitGatewayConnectPeerId = transitGatewayConnectPeerId;
    }

    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     * 
     * @return The ID of the Connect peer.
     */

    public String getTransitGatewayConnectPeerId() {
        return this.transitGatewayConnectPeerId;
    }

    /**
     * <p>
     * The ID of the Connect peer.
     * </p>
     * 
     * @param transitGatewayConnectPeerId
     *        The ID of the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeer withTransitGatewayConnectPeerId(String transitGatewayConnectPeerId) {
        setTransitGatewayConnectPeerId(transitGatewayConnectPeerId);
        return this;
    }

    /**
     * <p>
     * The state of the Connect peer.
     * </p>
     * 
     * @param state
     *        The state of the Connect peer.
     * @see TransitGatewayConnectPeerState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the Connect peer.
     * </p>
     * 
     * @return The state of the Connect peer.
     * @see TransitGatewayConnectPeerState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the Connect peer.
     * </p>
     * 
     * @param state
     *        The state of the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayConnectPeerState
     */

    public TransitGatewayConnectPeer withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the Connect peer.
     * </p>
     * 
     * @param state
     *        The state of the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayConnectPeerState
     */

    public TransitGatewayConnectPeer withState(TransitGatewayConnectPeerState state) {
        this.state = state.toString();
        return this;
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

    public TransitGatewayConnectPeer withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The Connect peer details.
     * </p>
     * 
     * @param connectPeerConfiguration
     *        The Connect peer details.
     */

    public void setConnectPeerConfiguration(TransitGatewayConnectPeerConfiguration connectPeerConfiguration) {
        this.connectPeerConfiguration = connectPeerConfiguration;
    }

    /**
     * <p>
     * The Connect peer details.
     * </p>
     * 
     * @return The Connect peer details.
     */

    public TransitGatewayConnectPeerConfiguration getConnectPeerConfiguration() {
        return this.connectPeerConfiguration;
    }

    /**
     * <p>
     * The Connect peer details.
     * </p>
     * 
     * @param connectPeerConfiguration
     *        The Connect peer details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeer withConnectPeerConfiguration(TransitGatewayConnectPeerConfiguration connectPeerConfiguration) {
        setConnectPeerConfiguration(connectPeerConfiguration);
        return this;
    }

    /**
     * <p>
     * The tags for the Connect peer.
     * </p>
     * 
     * @return The tags for the Connect peer.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags for the Connect peer.
     * </p>
     * 
     * @param tags
     *        The tags for the Connect peer.
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
     * The tags for the Connect peer.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeer withTags(Tag... tags) {
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
     * The tags for the Connect peer.
     * </p>
     * 
     * @param tags
     *        The tags for the Connect peer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnectPeer withTags(java.util.Collection<Tag> tags) {
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
        if (getTransitGatewayAttachmentId() != null)
            sb.append("TransitGatewayAttachmentId: ").append(getTransitGatewayAttachmentId()).append(",");
        if (getTransitGatewayConnectPeerId() != null)
            sb.append("TransitGatewayConnectPeerId: ").append(getTransitGatewayConnectPeerId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getConnectPeerConfiguration() != null)
            sb.append("ConnectPeerConfiguration: ").append(getConnectPeerConfiguration()).append(",");
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

        if (obj instanceof TransitGatewayConnectPeer == false)
            return false;
        TransitGatewayConnectPeer other = (TransitGatewayConnectPeer) obj;
        if (other.getTransitGatewayAttachmentId() == null ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null && other.getTransitGatewayAttachmentId().equals(this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getTransitGatewayConnectPeerId() == null ^ this.getTransitGatewayConnectPeerId() == null)
            return false;
        if (other.getTransitGatewayConnectPeerId() != null && other.getTransitGatewayConnectPeerId().equals(this.getTransitGatewayConnectPeerId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getConnectPeerConfiguration() == null ^ this.getConnectPeerConfiguration() == null)
            return false;
        if (other.getConnectPeerConfiguration() != null && other.getConnectPeerConfiguration().equals(this.getConnectPeerConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getTransitGatewayAttachmentId() == null) ? 0 : getTransitGatewayAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayConnectPeerId() == null) ? 0 : getTransitGatewayConnectPeerId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getConnectPeerConfiguration() == null) ? 0 : getConnectPeerConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayConnectPeer clone() {
        try {
            return (TransitGatewayConnectPeer) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
