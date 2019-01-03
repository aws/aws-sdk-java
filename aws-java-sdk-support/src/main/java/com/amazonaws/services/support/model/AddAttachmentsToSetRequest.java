/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/AddAttachmentsToSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddAttachmentsToSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> is not specified, a new attachment set is
     * created, and the ID of the set is returned in the response. If an <code>attachmentSetId</code> is specified, the
     * attachments are added to the specified set, if it exists.
     * </p>
     */
    private String attachmentSetId;
    /**
     * <p>
     * One or more attachments to add to the set. The limit is 3 attachments per set, and the size limit is 5 MB per
     * attachment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Attachment> attachments;

    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> is not specified, a new attachment set is
     * created, and the ID of the set is returned in the response. If an <code>attachmentSetId</code> is specified, the
     * attachments are added to the specified set, if it exists.
     * </p>
     * 
     * @param attachmentSetId
     *        The ID of the attachment set. If an <code>attachmentSetId</code> is not specified, a new attachment set is
     *        created, and the ID of the set is returned in the response. If an <code>attachmentSetId</code> is
     *        specified, the attachments are added to the specified set, if it exists.
     */

    public void setAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
    }

    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> is not specified, a new attachment set is
     * created, and the ID of the set is returned in the response. If an <code>attachmentSetId</code> is specified, the
     * attachments are added to the specified set, if it exists.
     * </p>
     * 
     * @return The ID of the attachment set. If an <code>attachmentSetId</code> is not specified, a new attachment set
     *         is created, and the ID of the set is returned in the response. If an <code>attachmentSetId</code> is
     *         specified, the attachments are added to the specified set, if it exists.
     */

    public String getAttachmentSetId() {
        return this.attachmentSetId;
    }

    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> is not specified, a new attachment set is
     * created, and the ID of the set is returned in the response. If an <code>attachmentSetId</code> is specified, the
     * attachments are added to the specified set, if it exists.
     * </p>
     * 
     * @param attachmentSetId
     *        The ID of the attachment set. If an <code>attachmentSetId</code> is not specified, a new attachment set is
     *        created, and the ID of the set is returned in the response. If an <code>attachmentSetId</code> is
     *        specified, the attachments are added to the specified set, if it exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddAttachmentsToSetRequest withAttachmentSetId(String attachmentSetId) {
        setAttachmentSetId(attachmentSetId);
        return this;
    }

    /**
     * <p>
     * One or more attachments to add to the set. The limit is 3 attachments per set, and the size limit is 5 MB per
     * attachment.
     * </p>
     * 
     * @return One or more attachments to add to the set. The limit is 3 attachments per set, and the size limit is 5 MB
     *         per attachment.
     */

    public java.util.List<Attachment> getAttachments() {
        if (attachments == null) {
            attachments = new com.amazonaws.internal.SdkInternalList<Attachment>();
        }
        return attachments;
    }

    /**
     * <p>
     * One or more attachments to add to the set. The limit is 3 attachments per set, and the size limit is 5 MB per
     * attachment.
     * </p>
     * 
     * @param attachments
     *        One or more attachments to add to the set. The limit is 3 attachments per set, and the size limit is 5 MB
     *        per attachment.
     */

    public void setAttachments(java.util.Collection<Attachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new com.amazonaws.internal.SdkInternalList<Attachment>(attachments);
    }

    /**
     * <p>
     * One or more attachments to add to the set. The limit is 3 attachments per set, and the size limit is 5 MB per
     * attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        One or more attachments to add to the set. The limit is 3 attachments per set, and the size limit is 5 MB
     *        per attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddAttachmentsToSetRequest withAttachments(Attachment... attachments) {
        if (this.attachments == null) {
            setAttachments(new com.amazonaws.internal.SdkInternalList<Attachment>(attachments.length));
        }
        for (Attachment ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * One or more attachments to add to the set. The limit is 3 attachments per set, and the size limit is 5 MB per
     * attachment.
     * </p>
     * 
     * @param attachments
     *        One or more attachments to add to the set. The limit is 3 attachments per set, and the size limit is 5 MB
     *        per attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddAttachmentsToSetRequest withAttachments(java.util.Collection<Attachment> attachments) {
        setAttachments(attachments);
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
        if (getAttachmentSetId() != null)
            sb.append("AttachmentSetId: ").append(getAttachmentSetId()).append(",");
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddAttachmentsToSetRequest == false)
            return false;
        AddAttachmentsToSetRequest other = (AddAttachmentsToSetRequest) obj;
        if (other.getAttachmentSetId() == null ^ this.getAttachmentSetId() == null)
            return false;
        if (other.getAttachmentSetId() != null && other.getAttachmentSetId().equals(this.getAttachmentSetId()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        return true;
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
    public AddAttachmentsToSetRequest clone() {
        return (AddAttachmentsToSetRequest) super.clone();
    }

}
