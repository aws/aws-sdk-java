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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a core network Connect attachment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/networkmanager-2019-07-05/ConnectAttachment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConnectAttachment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attachment details.
     * </p>
     */
    private Attachment attachment;
    /**
     * <p>
     * The ID of the transport attachment.
     * </p>
     */
    private String transportAttachmentId;
    /**
     * <p>
     * Options for connecting an attachment.
     * </p>
     */
    private ConnectAttachmentOptions options;

    /**
     * <p>
     * The attachment details.
     * </p>
     * 
     * @param attachment
     *        The attachment details.
     */

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * The attachment details.
     * </p>
     * 
     * @return The attachment details.
     */

    public Attachment getAttachment() {
        return this.attachment;
    }

    /**
     * <p>
     * The attachment details.
     * </p>
     * 
     * @param attachment
     *        The attachment details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectAttachment withAttachment(Attachment attachment) {
        setAttachment(attachment);
        return this;
    }

    /**
     * <p>
     * The ID of the transport attachment.
     * </p>
     * 
     * @param transportAttachmentId
     *        The ID of the transport attachment.
     */

    public void setTransportAttachmentId(String transportAttachmentId) {
        this.transportAttachmentId = transportAttachmentId;
    }

    /**
     * <p>
     * The ID of the transport attachment.
     * </p>
     * 
     * @return The ID of the transport attachment.
     */

    public String getTransportAttachmentId() {
        return this.transportAttachmentId;
    }

    /**
     * <p>
     * The ID of the transport attachment.
     * </p>
     * 
     * @param transportAttachmentId
     *        The ID of the transport attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectAttachment withTransportAttachmentId(String transportAttachmentId) {
        setTransportAttachmentId(transportAttachmentId);
        return this;
    }

    /**
     * <p>
     * Options for connecting an attachment.
     * </p>
     * 
     * @param options
     *        Options for connecting an attachment.
     */

    public void setOptions(ConnectAttachmentOptions options) {
        this.options = options;
    }

    /**
     * <p>
     * Options for connecting an attachment.
     * </p>
     * 
     * @return Options for connecting an attachment.
     */

    public ConnectAttachmentOptions getOptions() {
        return this.options;
    }

    /**
     * <p>
     * Options for connecting an attachment.
     * </p>
     * 
     * @param options
     *        Options for connecting an attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConnectAttachment withOptions(ConnectAttachmentOptions options) {
        setOptions(options);
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
            sb.append("Attachment: ").append(getAttachment()).append(",");
        if (getTransportAttachmentId() != null)
            sb.append("TransportAttachmentId: ").append(getTransportAttachmentId()).append(",");
        if (getOptions() != null)
            sb.append("Options: ").append(getOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConnectAttachment == false)
            return false;
        ConnectAttachment other = (ConnectAttachment) obj;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        if (other.getTransportAttachmentId() == null ^ this.getTransportAttachmentId() == null)
            return false;
        if (other.getTransportAttachmentId() != null && other.getTransportAttachmentId().equals(this.getTransportAttachmentId()) == false)
            return false;
        if (other.getOptions() == null ^ this.getOptions() == null)
            return false;
        if (other.getOptions() != null && other.getOptions().equals(this.getOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        hashCode = prime * hashCode + ((getTransportAttachmentId() == null) ? 0 : getTransportAttachmentId().hashCode());
        hashCode = prime * hashCode + ((getOptions() == null) ? 0 : getOptions().hashCode());
        return hashCode;
    }

    @Override
    public ConnectAttachment clone() {
        try {
            return (ConnectAttachment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkmanager.model.transform.ConnectAttachmentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
