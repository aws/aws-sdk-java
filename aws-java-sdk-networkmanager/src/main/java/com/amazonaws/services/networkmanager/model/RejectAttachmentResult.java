/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.networkmanager.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/RejectAttachment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RejectAttachmentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Describes the rejected attachment request.
     * </p>
     */
    private Attachment attachment;

    /**
     * <p>
     * Describes the rejected attachment request.
     * </p>
     * 
     * @param attachment
     *        Describes the rejected attachment request.
     */

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * Describes the rejected attachment request.
     * </p>
     * 
     * @return Describes the rejected attachment request.
     */

    public Attachment getAttachment() {
        return this.attachment;
    }

    /**
     * <p>
     * Describes the rejected attachment request.
     * </p>
     * 
     * @param attachment
     *        Describes the rejected attachment request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RejectAttachmentResult withAttachment(Attachment attachment) {
        setAttachment(attachment);
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
        if (getAttachment() != null)
            sb.append("Attachment: ").append(getAttachment());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RejectAttachmentResult == false)
            return false;
        RejectAttachmentResult other = (RejectAttachmentResult) obj;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        return hashCode;
    }

    @Override
    public RejectAttachmentResult clone() {
        try {
            return (RejectAttachmentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
