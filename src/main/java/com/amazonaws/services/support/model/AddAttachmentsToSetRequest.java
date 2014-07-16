/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.support.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.support.AWSSupport#addAttachmentsToSet(AddAttachmentsToSetRequest) AddAttachmentsToSet operation}.
 * 
 *
 * @see com.amazonaws.services.support.AWSSupport#addAttachmentsToSet(AddAttachmentsToSetRequest)
 */
public class AddAttachmentsToSetRequest extends AmazonWebServiceRequest implements Serializable {

    private String attachmentSetId;

    private com.amazonaws.internal.ListWithAutoConstructFlag<Attachment> attachments;

    /**
     * Returns the value of the AttachmentSetId property for this object.
     *
     * @return The value of the AttachmentSetId property for this object.
     */
    public String getAttachmentSetId() {
        return attachmentSetId;
    }
    
    /**
     * Sets the value of the AttachmentSetId property for this object.
     *
     * @param attachmentSetId The new value for the AttachmentSetId property for this object.
     */
    public void setAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
    }
    
    /**
     * Sets the value of the AttachmentSetId property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachmentSetId The new value for the AttachmentSetId property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddAttachmentsToSetRequest withAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
        return this;
    }

    /**
     * Returns the value of the Attachments property for this object.
     *
     * @return The value of the Attachments property for this object.
     */
    public java.util.List<Attachment> getAttachments() {
        if (attachments == null) {
              attachments = new com.amazonaws.internal.ListWithAutoConstructFlag<Attachment>();
              attachments.setAutoConstruct(true);
        }
        return attachments;
    }
    
    /**
     * Sets the value of the Attachments property for this object.
     *
     * @param attachments The new value for the Attachments property for this object.
     */
    public void setAttachments(java.util.Collection<Attachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Attachment> attachmentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Attachment>(attachments.size());
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
    public AddAttachmentsToSetRequest withAttachments(Attachment... attachments) {
        if (getAttachments() == null) setAttachments(new java.util.ArrayList<Attachment>(attachments.length));
        for (Attachment value : attachments) {
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
    public AddAttachmentsToSetRequest withAttachments(java.util.Collection<Attachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Attachment> attachmentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Attachment>(attachments.size());
            attachmentsCopy.addAll(attachments);
            this.attachments = attachmentsCopy;
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
        if (getAttachmentSetId() != null) sb.append("AttachmentSetId: " + getAttachmentSetId() + ",");
        if (getAttachments() != null) sb.append("Attachments: " + getAttachments() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAttachmentSetId() == null) ? 0 : getAttachmentSetId().hashCode()); 
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddAttachmentsToSetRequest == false) return false;
        AddAttachmentsToSetRequest other = (AddAttachmentsToSetRequest)obj;
        
        if (other.getAttachmentSetId() == null ^ this.getAttachmentSetId() == null) return false;
        if (other.getAttachmentSetId() != null && other.getAttachmentSetId().equals(this.getAttachmentSetId()) == false) return false; 
        if (other.getAttachments() == null ^ this.getAttachments() == null) return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false) return false; 
        return true;
    }
    
}
    