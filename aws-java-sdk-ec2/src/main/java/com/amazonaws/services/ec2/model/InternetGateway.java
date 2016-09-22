/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Describes an Internet gateway.
 * </p>
 */
public class InternetGateway implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the Internet gateway.
     * </p>
     */
    private String internetGatewayId;
    /**
     * <p>
     * Any VPCs attached to the Internet gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<InternetGatewayAttachment> attachments;
    /**
     * <p>
     * Any tags assigned to the Internet gateway.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The ID of the Internet gateway.
     * </p>
     * 
     * @param internetGatewayId
     *        The ID of the Internet gateway.
     */

    public void setInternetGatewayId(String internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
    }

    /**
     * <p>
     * The ID of the Internet gateway.
     * </p>
     * 
     * @return The ID of the Internet gateway.
     */

    public String getInternetGatewayId() {
        return this.internetGatewayId;
    }

    /**
     * <p>
     * The ID of the Internet gateway.
     * </p>
     * 
     * @param internetGatewayId
     *        The ID of the Internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternetGateway withInternetGatewayId(String internetGatewayId) {
        setInternetGatewayId(internetGatewayId);
        return this;
    }

    /**
     * <p>
     * Any VPCs attached to the Internet gateway.
     * </p>
     * 
     * @return Any VPCs attached to the Internet gateway.
     */

    public java.util.List<InternetGatewayAttachment> getAttachments() {
        if (attachments == null) {
            attachments = new com.amazonaws.internal.SdkInternalList<InternetGatewayAttachment>();
        }
        return attachments;
    }

    /**
     * <p>
     * Any VPCs attached to the Internet gateway.
     * </p>
     * 
     * @param attachments
     *        Any VPCs attached to the Internet gateway.
     */

    public void setAttachments(java.util.Collection<InternetGatewayAttachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new com.amazonaws.internal.SdkInternalList<InternetGatewayAttachment>(attachments);
    }

    /**
     * <p>
     * Any VPCs attached to the Internet gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        Any VPCs attached to the Internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternetGateway withAttachments(InternetGatewayAttachment... attachments) {
        if (this.attachments == null) {
            setAttachments(new com.amazonaws.internal.SdkInternalList<InternetGatewayAttachment>(attachments.length));
        }
        for (InternetGatewayAttachment ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Any VPCs attached to the Internet gateway.
     * </p>
     * 
     * @param attachments
     *        Any VPCs attached to the Internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternetGateway withAttachments(java.util.Collection<InternetGatewayAttachment> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * Any tags assigned to the Internet gateway.
     * </p>
     * 
     * @return Any tags assigned to the Internet gateway.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * Any tags assigned to the Internet gateway.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Internet gateway.
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
     * Any tags assigned to the Internet gateway.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternetGateway withTags(Tag... tags) {
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
     * Any tags assigned to the Internet gateway.
     * </p>
     * 
     * @param tags
     *        Any tags assigned to the Internet gateway.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternetGateway withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInternetGatewayId() != null)
            sb.append("InternetGatewayId: " + getInternetGatewayId() + ",");
        if (getAttachments() != null)
            sb.append("Attachments: " + getAttachments() + ",");
        if (getTags() != null)
            sb.append("Tags: " + getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InternetGateway == false)
            return false;
        InternetGateway other = (InternetGateway) obj;
        if (other.getInternetGatewayId() == null ^ this.getInternetGatewayId() == null)
            return false;
        if (other.getInternetGatewayId() != null && other.getInternetGatewayId().equals(this.getInternetGatewayId()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
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

        hashCode = prime * hashCode + ((getInternetGatewayId() == null) ? 0 : getInternetGatewayId().hashCode());
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public InternetGateway clone() {
        try {
            return (InternetGateway) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
