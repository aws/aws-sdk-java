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
package com.amazonaws.services.support.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class DescribeAttachmentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the attachment to return. Attachment IDs are returned by the <a>DescribeCommunications</a> operation.
     * </p>
     */
    private String attachmentId;

    /**
     * <p>
     * The ID of the attachment to return. Attachment IDs are returned by the <a>DescribeCommunications</a> operation.
     * </p>
     * 
     * @param attachmentId
     *        The ID of the attachment to return. Attachment IDs are returned by the <a>DescribeCommunications</a>
     *        operation.
     */

    public void setAttachmentId(String attachmentId) {
        this.attachmentId = attachmentId;
    }

    /**
     * <p>
     * The ID of the attachment to return. Attachment IDs are returned by the <a>DescribeCommunications</a> operation.
     * </p>
     * 
     * @return The ID of the attachment to return. Attachment IDs are returned by the <a>DescribeCommunications</a>
     *         operation.
     */

    public String getAttachmentId() {
        return this.attachmentId;
    }

    /**
     * <p>
     * The ID of the attachment to return. Attachment IDs are returned by the <a>DescribeCommunications</a> operation.
     * </p>
     * 
     * @param attachmentId
     *        The ID of the attachment to return. Attachment IDs are returned by the <a>DescribeCommunications</a>
     *        operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeAttachmentRequest withAttachmentId(String attachmentId) {
        setAttachmentId(attachmentId);
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
        if (getAttachmentId() != null)
            sb.append("AttachmentId: " + getAttachmentId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeAttachmentRequest == false)
            return false;
        DescribeAttachmentRequest other = (DescribeAttachmentRequest) obj;
        if (other.getAttachmentId() == null ^ this.getAttachmentId() == null)
            return false;
        if (other.getAttachmentId() != null && other.getAttachmentId().equals(this.getAttachmentId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachmentId() == null) ? 0 : getAttachmentId().hashCode());
        return hashCode;
    }

    @Override
    public DescribeAttachmentRequest clone() {
        return (DescribeAttachmentRequest) super.clone();
    }
}
