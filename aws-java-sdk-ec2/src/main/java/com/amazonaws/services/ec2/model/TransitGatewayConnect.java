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
 * Describes a transit gateway Connect attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/TransitGatewayConnect" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TransitGatewayConnect implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Connect attachment.
     * </p>
     */
    private String transitGatewayAttachmentId;
    /**
     * <p>
     * The ID of the attachment from which the Connect attachment was created.
     * </p>
     */
    private String transportTransitGatewayAttachmentId;
    /**
     * <p>
     * The ID of the transit gateway.
     * </p>
     */
    private String transitGatewayId;
    /**
     * <p>
     * The state of the attachment.
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
     * The Connect attachment options.
     * </p>
     */
    private TransitGatewayConnectOptions options;
    /**
     * <p>
     * The tags for the attachment.
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

    public TransitGatewayConnect withTransitGatewayAttachmentId(String transitGatewayAttachmentId) {
        setTransitGatewayAttachmentId(transitGatewayAttachmentId);
        return this;
    }

    /**
     * <p>
     * The ID of the attachment from which the Connect attachment was created.
     * </p>
     * 
     * @param transportTransitGatewayAttachmentId
     *        The ID of the attachment from which the Connect attachment was created.
     */

    public void setTransportTransitGatewayAttachmentId(String transportTransitGatewayAttachmentId) {
        this.transportTransitGatewayAttachmentId = transportTransitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment from which the Connect attachment was created.
     * </p>
     * 
     * @return The ID of the attachment from which the Connect attachment was created.
     */

    public String getTransportTransitGatewayAttachmentId() {
        return this.transportTransitGatewayAttachmentId;
    }

    /**
     * <p>
     * The ID of the attachment from which the Connect attachment was created.
     * </p>
     * 
     * @param transportTransitGatewayAttachmentId
     *        The ID of the attachment from which the Connect attachment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnect withTransportTransitGatewayAttachmentId(String transportTransitGatewayAttachmentId) {
        setTransportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId);
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

    public TransitGatewayConnect withTransitGatewayId(String transitGatewayId) {
        setTransitGatewayId(transitGatewayId);
        return this;
    }

    /**
     * <p>
     * The state of the attachment.
     * </p>
     * 
     * @param state
     *        The state of the attachment.
     * @see TransitGatewayAttachmentState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The state of the attachment.
     * </p>
     * 
     * @return The state of the attachment.
     * @see TransitGatewayAttachmentState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The state of the attachment.
     * </p>
     * 
     * @param state
     *        The state of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayAttachmentState
     */

    public TransitGatewayConnect withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The state of the attachment.
     * </p>
     * 
     * @param state
     *        The state of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TransitGatewayAttachmentState
     */

    public TransitGatewayConnect withState(TransitGatewayAttachmentState state) {
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

    public TransitGatewayConnect withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The Connect attachment options.
     * </p>
     * 
     * @param options
     *        The Connect attachment options.
     */

    public void setOptions(TransitGatewayConnectOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * The Connect attachment options.
     * </p>
     * 
     * @return The Connect attachment options.
     */

    public TransitGatewayConnectOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * The Connect attachment options.
     * </p>
     * 
     * @param options
     *        The Connect attachment options.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnect withOptions(TransitGatewayConnectOptions options) {
        setOptions(options);
        return this;
    }

    /**
     * <p>
     * The tags for the attachment.
     * </p>
     * 
     * @return The tags for the attachment.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The tags for the attachment.
     * </p>
     * 
     * @param tags
     *        The tags for the attachment.
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
     * The tags for the attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags for the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnect withTags(Tag... tags) {
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
     * The tags for the attachment.
     * </p>
     * 
     * @param tags
     *        The tags for the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TransitGatewayConnect withTags(java.util.Collection<Tag> tags) {
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
        if (getTransportTransitGatewayAttachmentId() != null)
            sb.append("TransportTransitGatewayAttachmentId: ").append(getTransportTransitGatewayAttachmentId()).append(",");
        if (getTransitGatewayId() != null)
            sb.append("TransitGatewayId: ").append(getTransitGatewayId()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions()).append(",");
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

        if (obj instanceof TransitGatewayConnect == false)
            return false;
        TransitGatewayConnect other = (TransitGatewayConnect) obj;
        if (other.getTransitGatewayAttachmentId() == null ^ this.getTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransitGatewayAttachmentId() != null && other.getTransitGatewayAttachmentId().equals(this.getTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getTransportTransitGatewayAttachmentId() == null ^ this.getTransportTransitGatewayAttachmentId() == null)
            return false;
        if (other.getTransportTransitGatewayAttachmentId() != null
                && other.getTransportTransitGatewayAttachmentId().equals(this.getTransportTransitGatewayAttachmentId()) == false)
            return false;
        if (other.getTransitGatewayId() == null ^ this.getTransitGatewayId() == null)
            return false;
        if (other.getTransitGatewayId() != null && other.getTransitGatewayId().equals(this.getTransitGatewayId()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
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
        hashCode = prime * hashCode + ((getTransportTransitGatewayAttachmentId() == null) ? 0 : getTransportTransitGatewayAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getTransitGatewayId() == null) ? 0 : getTransitGatewayId().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public TransitGatewayConnect clone() {
        try {
            return (TransitGatewayConnect) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
