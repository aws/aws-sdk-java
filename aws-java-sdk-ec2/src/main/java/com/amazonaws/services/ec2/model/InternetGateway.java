/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

/**
 * <p>
 * Describes an Internet gateway.
 * </p>
 */
public class InternetGateway implements Serializable {

    /**
     * The ID of the Internet gateway.
     */
    private String internetGatewayId;

    /**
     * Any VPCs attached to the Internet gateway.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<InternetGatewayAttachment> attachments;

    /**
     * Any tags assigned to the Internet gateway.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The ID of the Internet gateway.
     *
     * @return The ID of the Internet gateway.
     */
    public String getInternetGatewayId() {
        return internetGatewayId;
    }
    
    /**
     * The ID of the Internet gateway.
     *
     * @param internetGatewayId The ID of the Internet gateway.
     */
    public void setInternetGatewayId(String internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
    }
    
    /**
     * The ID of the Internet gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param internetGatewayId The ID of the Internet gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InternetGateway withInternetGatewayId(String internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
        return this;
    }

    /**
     * Any VPCs attached to the Internet gateway.
     *
     * @return Any VPCs attached to the Internet gateway.
     */
    public java.util.List<InternetGatewayAttachment> getAttachments() {
        if (attachments == null) {
              attachments = new com.amazonaws.internal.ListWithAutoConstructFlag<InternetGatewayAttachment>();
              attachments.setAutoConstruct(true);
        }
        return attachments;
    }
    
    /**
     * Any VPCs attached to the Internet gateway.
     *
     * @param attachments Any VPCs attached to the Internet gateway.
     */
    public void setAttachments(java.util.Collection<InternetGatewayAttachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<InternetGatewayAttachment> attachmentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InternetGatewayAttachment>(attachments.size());
        attachmentsCopy.addAll(attachments);
        this.attachments = attachmentsCopy;
    }
    
    /**
     * Any VPCs attached to the Internet gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachments Any VPCs attached to the Internet gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InternetGateway withAttachments(InternetGatewayAttachment... attachments) {
        if (getAttachments() == null) setAttachments(new java.util.ArrayList<InternetGatewayAttachment>(attachments.length));
        for (InternetGatewayAttachment value : attachments) {
            getAttachments().add(value);
        }
        return this;
    }
    
    /**
     * Any VPCs attached to the Internet gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachments Any VPCs attached to the Internet gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InternetGateway withAttachments(java.util.Collection<InternetGatewayAttachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<InternetGatewayAttachment> attachmentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<InternetGatewayAttachment>(attachments.size());
            attachmentsCopy.addAll(attachments);
            this.attachments = attachmentsCopy;
        }

        return this;
    }

    /**
     * Any tags assigned to the Internet gateway.
     *
     * @return Any tags assigned to the Internet gateway.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Any tags assigned to the Internet gateway.
     *
     * @param tags Any tags assigned to the Internet gateway.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * Any tags assigned to the Internet gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the Internet gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InternetGateway withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * Any tags assigned to the Internet gateway.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags Any tags assigned to the Internet gateway.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public InternetGateway withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getInternetGatewayId() != null) sb.append("InternetGatewayId: " + getInternetGatewayId() + ",");
        if (getAttachments() != null) sb.append("Attachments: " + getAttachments() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof InternetGateway == false) return false;
        InternetGateway other = (InternetGateway)obj;
        
        if (other.getInternetGatewayId() == null ^ this.getInternetGatewayId() == null) return false;
        if (other.getInternetGatewayId() != null && other.getInternetGatewayId().equals(this.getInternetGatewayId()) == false) return false; 
        if (other.getAttachments() == null ^ this.getAttachments() == null) return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
}
    