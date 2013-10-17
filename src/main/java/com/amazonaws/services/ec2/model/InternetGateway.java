/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Internet Gateway
 */
public class InternetGateway implements Serializable {

    private String internetGatewayId;

    private com.amazonaws.internal.ListWithAutoConstructFlag<InternetGatewayAttachment> attachments;

    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * Returns the value of the InternetGatewayId property for this object.
     *
     * @return The value of the InternetGatewayId property for this object.
     */
    public String getInternetGatewayId() {
        return internetGatewayId;
    }
    
    /**
     * Sets the value of the InternetGatewayId property for this object.
     *
     * @param internetGatewayId The new value for the InternetGatewayId property for this object.
     */
    public void setInternetGatewayId(String internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
    }
    
    /**
     * Sets the value of the InternetGatewayId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param internetGatewayId The new value for the InternetGatewayId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public InternetGateway withInternetGatewayId(String internetGatewayId) {
        this.internetGatewayId = internetGatewayId;
        return this;
    }

    /**
     * Returns the value of the Attachments property for this object.
     *
     * @return The value of the Attachments property for this object.
     */
    public java.util.List<InternetGatewayAttachment> getAttachments() {
        if (attachments == null) {
              attachments = new com.amazonaws.internal.ListWithAutoConstructFlag<InternetGatewayAttachment>();
              attachments.setAutoConstruct(true);
        }
        return attachments;
    }
    
    /**
     * Sets the value of the Attachments property for this object.
     *
     * @param attachments The new value for the Attachments property for this object.
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
     * Sets the value of the Attachments property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachments The new value for the Attachments property for this object.
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
     * Sets the value of the Attachments property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachments The new value for the Attachments property for this object.
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
     * Returns the value of the Tags property for this object.
     *
     * @return The value of the Tags property for this object.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * Sets the value of the Tags property for this object.
     *
     * @param tags The new value for the Tags property for this object.
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
     * Sets the value of the Tags property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The new value for the Tags property for this object.
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
     * Sets the value of the Tags property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags The new value for the Tags property for this object.
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
    