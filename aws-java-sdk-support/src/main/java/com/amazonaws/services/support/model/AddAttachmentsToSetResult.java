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

/**
 * <p>
 * The ID and expiry time of the attachment set returned by the <a>AddAttachmentsToSet</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/support-2013-04-15/AddAttachmentsToSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddAttachmentsToSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> was not specified, a new attachment set is
     * created, and the ID of the set is returned in the response. If an <code>attachmentSetId</code> was specified, the
     * attachments are added to the specified set, if it exists.
     * </p>
     */
    private String attachmentSetId;
    /**
     * <p>
     * The time and date when the attachment set expires.
     * </p>
     */
    private String expiryTime;

    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> was not specified, a new attachment set is
     * created, and the ID of the set is returned in the response. If an <code>attachmentSetId</code> was specified, the
     * attachments are added to the specified set, if it exists.
     * </p>
     * 
     * @param attachmentSetId
     *        The ID of the attachment set. If an <code>attachmentSetId</code> was not specified, a new attachment set
     *        is created, and the ID of the set is returned in the response. If an <code>attachmentSetId</code> was
     *        specified, the attachments are added to the specified set, if it exists.
     */

    public void setAttachmentSetId(String attachmentSetId) {
        this.attachmentSetId = attachmentSetId;
    }

    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> was not specified, a new attachment set is
     * created, and the ID of the set is returned in the response. If an <code>attachmentSetId</code> was specified, the
     * attachments are added to the specified set, if it exists.
     * </p>
     * 
     * @return The ID of the attachment set. If an <code>attachmentSetId</code> was not specified, a new attachment set
     *         is created, and the ID of the set is returned in the response. If an <code>attachmentSetId</code> was
     *         specified, the attachments are added to the specified set, if it exists.
     */

    public String getAttachmentSetId() {
        return this.attachmentSetId;
    }

    /**
     * <p>
     * The ID of the attachment set. If an <code>attachmentSetId</code> was not specified, a new attachment set is
     * created, and the ID of the set is returned in the response. If an <code>attachmentSetId</code> was specified, the
     * attachments are added to the specified set, if it exists.
     * </p>
     * 
     * @param attachmentSetId
     *        The ID of the attachment set. If an <code>attachmentSetId</code> was not specified, a new attachment set
     *        is created, and the ID of the set is returned in the response. If an <code>attachmentSetId</code> was
     *        specified, the attachments are added to the specified set, if it exists.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddAttachmentsToSetResult withAttachmentSetId(String attachmentSetId) {
        setAttachmentSetId(attachmentSetId);
        return this;
    }

    /**
     * <p>
     * The time and date when the attachment set expires.
     * </p>
     * 
     * @param expiryTime
     *        The time and date when the attachment set expires.
     */

    public void setExpiryTime(String expiryTime) {
        this.expiryTime = expiryTime;
    }

    /**
     * <p>
     * The time and date when the attachment set expires.
     * </p>
     * 
     * @return The time and date when the attachment set expires.
     */

    public String getExpiryTime() {
        return this.expiryTime;
    }

    /**
     * <p>
     * The time and date when the attachment set expires.
     * </p>
     * 
     * @param expiryTime
     *        The time and date when the attachment set expires.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddAttachmentsToSetResult withExpiryTime(String expiryTime) {
        setExpiryTime(expiryTime);
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
        if (getExpiryTime() != null)
            sb.append("ExpiryTime: ").append(getExpiryTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddAttachmentsToSetResult == false)
            return false;
        AddAttachmentsToSetResult other = (AddAttachmentsToSetResult) obj;
        if (other.getAttachmentSetId() == null ^ this.getAttachmentSetId() == null)
            return false;
        if (other.getAttachmentSetId() != null && other.getAttachmentSetId().equals(this.getAttachmentSetId()) == false)
            return false;
        if (other.getExpiryTime() == null ^ this.getExpiryTime() == null)
            return false;
        if (other.getExpiryTime() != null && other.getExpiryTime().equals(this.getExpiryTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachmentSetId() == null) ? 0 : getAttachmentSetId().hashCode());
        hashCode = prime * hashCode + ((getExpiryTime() == null) ? 0 : getExpiryTime().hashCode());
        return hashCode;
    }

    @Override
    public AddAttachmentsToSetResult clone() {
        try {
            return (AddAttachmentsToSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
