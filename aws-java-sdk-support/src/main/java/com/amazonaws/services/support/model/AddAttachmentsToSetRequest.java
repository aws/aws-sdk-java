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
 * <p>
 * Adds one or more attachments to an attachment set. If an
 * <code>AttachmentSetId</code> is not specified, a new attachment set is
 * created, and the ID of the set is returned in the response. If an
 * <code>AttachmentSetId</code> is specified, the attachments are added
 * to the specified set, if it exists.
 * </p>
 * <p>
 * An attachment set is a temporary container for attachments that are to
 * be added to a case or case communication. The set is available for one
 * hour after it is created; the <code>ExpiryTime</code> returned in the
 * response indicates when the set expires. The maximum number of
 * attachments in a set is 3, and the maximum size of any attachment in
 * the set is 5 MB.
 * </p>
 *
 * @see com.amazonaws.services.support.AWSSupport#addAttachmentsToSet(AddAttachmentsToSetRequest)
 */
public class AddAttachmentsToSetRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the attachment set. If an <code>AttachmentSetId</code> is
     * not specified, a new attachment set is created, and the ID of the set
     * is returned in the response. If an <code>AttachmentSetId</code> is
     * specified, the attachments are added to the specified set, if it
     * exists.
     */
    private String attachmentSetId;

    /**
     * One or more attachments to add to the set. The limit is 3 attachments
     * per set, and the size limit is 5 MB per attachment.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Attachment> attachments;

    /**
     * The ID of the attachment set. If an <code>AttachmentSetId</code> is
     * not specified, a new attachment set is created, and the ID of the set
     * is returned in the response. If an <code>AttachmentSetId</code> is
     * specified, the attachments are added to the specified set, if it
     * exists.
     *
     * @return The ID of the attachment set. If an <code>AttachmentSetId</code> is
     *         not specified, a new attachment set is created, and the ID of the set
     *         is returned in the response. If an <code>AttachmentSetId</code> is
     *         specified, the attachments are added to the specified set, if it
     *         exists.
     */
    public String getAttachmentSetId() {
        return attachmentSetId;
    }
    
    /**
     * The ID of the attachment set. If an <code>AttachmentSetId</code> is
     * not specified, a new attachment set is created, and the ID of the set
     * is returned in the response. If an <code>AttachmentSetId</code> is
     * specified, the attachments are added to the specified set, if it
     * exists.
     *
     * @param attachmentSetId The ID of the attachment set. If an <code>AttachmentSetId</code> is
     *         not specified, a new attachment set is created, and the ID of the set
     *         is returned in the response. If an <code>AttachmentSetId</code> is
     *         specified, the attachments are added to the specified set, if it
     *         exists.
     */
    public void setAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
    }
    
    /**
     * The ID of the attachment set. If an <code>AttachmentSetId</code> is
     * not specified, a new attachment set is created, and the ID of the set
     * is returned in the response. If an <code>AttachmentSetId</code> is
     * specified, the attachments are added to the specified set, if it
     * exists.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachmentSetId The ID of the attachment set. If an <code>AttachmentSetId</code> is
     *         not specified, a new attachment set is created, and the ID of the set
     *         is returned in the response. If an <code>AttachmentSetId</code> is
     *         specified, the attachments are added to the specified set, if it
     *         exists.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddAttachmentsToSetRequest withAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
        return this;
    }

    /**
     * One or more attachments to add to the set. The limit is 3 attachments
     * per set, and the size limit is 5 MB per attachment.
     *
     * @return One or more attachments to add to the set. The limit is 3 attachments
     *         per set, and the size limit is 5 MB per attachment.
     */
    public java.util.List<Attachment> getAttachments() {
        if (attachments == null) {
              attachments = new com.amazonaws.internal.ListWithAutoConstructFlag<Attachment>();
              attachments.setAutoConstruct(true);
        }
        return attachments;
    }
    
    /**
     * One or more attachments to add to the set. The limit is 3 attachments
     * per set, and the size limit is 5 MB per attachment.
     *
     * @param attachments One or more attachments to add to the set. The limit is 3 attachments
     *         per set, and the size limit is 5 MB per attachment.
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
     * One or more attachments to add to the set. The limit is 3 attachments
     * per set, and the size limit is 5 MB per attachment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachments One or more attachments to add to the set. The limit is 3 attachments
     *         per set, and the size limit is 5 MB per attachment.
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
     * One or more attachments to add to the set. The limit is 3 attachments
     * per set, and the size limit is 5 MB per attachment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param attachments One or more attachments to add to the set. The limit is 3 attachments
     *         per set, and the size limit is 5 MB per attachment.
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
    