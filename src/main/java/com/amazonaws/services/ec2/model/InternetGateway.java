/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * Internet Gateway
 */
public class InternetGateway {

    private String internetGatewayId;

    private java.util.List<InternetGatewayAttachment> attachments;

    private java.util.List<Tag> tags;

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
            attachments = new java.util.ArrayList<InternetGatewayAttachment>();
        }
        return attachments;
    }
    
    /**
     * Sets the value of the Attachments property for this object.
     *
     * @param attachments The new value for the Attachments property for this object.
     */
    public void setAttachments(java.util.Collection<InternetGatewayAttachment> attachments) {
        java.util.List<InternetGatewayAttachment> attachmentsCopy = new java.util.ArrayList<InternetGatewayAttachment>();
        if (attachments != null) {
            attachmentsCopy.addAll(attachments);
        }
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
        java.util.List<InternetGatewayAttachment> attachmentsCopy = new java.util.ArrayList<InternetGatewayAttachment>();
        if (attachments != null) {
            attachmentsCopy.addAll(attachments);
        }
        this.attachments = attachmentsCopy;

        return this;
    }
    
    /**
     * Returns the value of the Tags property for this object.
     *
     * @return The value of the Tags property for this object.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new java.util.ArrayList<Tag>();
        }
        return tags;
    }
    
    /**
     * Sets the value of the Tags property for this object.
     *
     * @param tags The new value for the Tags property for this object.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
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
        java.util.List<Tag> tagsCopy = new java.util.ArrayList<Tag>();
        if (tags != null) {
            tagsCopy.addAll(tags);
        }
        this.tags = tagsCopy;

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
        sb.append("InternetGatewayId: " + internetGatewayId + ", ");
        sb.append("Attachments: " + attachments + ", ");
        sb.append("Tags: " + tags + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    