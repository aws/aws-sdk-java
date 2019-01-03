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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a change in state for a task attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/AttachmentStateChange" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AttachmentStateChange implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the attachment.
     * </p>
     */
    private String attachmentArn;
    /**
     * <p>
     * The status of the attachment.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the attachment.
     * </p>
     * 
     * @param attachmentArn
     *        The Amazon Resource Name (ARN) of the attachment.
     */

    public void setAttachmentArn(String attachmentArn) {
        this.attachmentArn = attachmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the attachment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the attachment.
     */

    public String getAttachmentArn() {
        return this.attachmentArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the attachment.
     * </p>
     * 
     * @param attachmentArn
     *        The Amazon Resource Name (ARN) of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentStateChange withAttachmentArn(String attachmentArn) {
        setAttachmentArn(attachmentArn);
        return this;
    }

    /**
     * <p>
     * The status of the attachment.
     * </p>
     * 
     * @param status
     *        The status of the attachment.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the attachment.
     * </p>
     * 
     * @return The status of the attachment.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the attachment.
     * </p>
     * 
     * @param status
     *        The status of the attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AttachmentStateChange withStatus(String status) {
        setStatus(status);
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
        if (getAttachmentArn() != null)
            sb.append("AttachmentArn: ").append(getAttachmentArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AttachmentStateChange == false)
            return false;
        AttachmentStateChange other = (AttachmentStateChange) obj;
        if (other.getAttachmentArn() == null ^ this.getAttachmentArn() == null)
            return false;
        if (other.getAttachmentArn() != null && other.getAttachmentArn().equals(this.getAttachmentArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachmentArn() == null) ? 0 : getAttachmentArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public AttachmentStateChange clone() {
        try {
            return (AttachmentStateChange) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.AttachmentStateChangeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
