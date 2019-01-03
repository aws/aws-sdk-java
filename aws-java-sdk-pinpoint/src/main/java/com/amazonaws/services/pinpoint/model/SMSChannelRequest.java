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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * SMS Channel Request
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/SMSChannelRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SMSChannelRequest implements Serializable, Cloneable, StructuredPojo {

    /** If the channel is enabled for sending messages. */
    private Boolean enabled;
    /** Sender identifier of your messages. */
    private String senderId;
    /** ShortCode registered with phone provider. */
    private String shortCode;

    /**
     * If the channel is enabled for sending messages.
     * 
     * @param enabled
     *        If the channel is enabled for sending messages.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     * 
     * @return If the channel is enabled for sending messages.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * If the channel is enabled for sending messages.
     * 
     * @param enabled
     *        If the channel is enabled for sending messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * If the channel is enabled for sending messages.
     * 
     * @return If the channel is enabled for sending messages.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * Sender identifier of your messages.
     * 
     * @param senderId
     *        Sender identifier of your messages.
     */

    public void setSenderId(String senderId) {
        this.senderId = senderId;
    }

    /**
     * Sender identifier of your messages.
     * 
     * @return Sender identifier of your messages.
     */

    public String getSenderId() {
        return this.senderId;
    }

    /**
     * Sender identifier of your messages.
     * 
     * @param senderId
     *        Sender identifier of your messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelRequest withSenderId(String senderId) {
        setSenderId(senderId);
        return this;
    }

    /**
     * ShortCode registered with phone provider.
     * 
     * @param shortCode
     *        ShortCode registered with phone provider.
     */

    public void setShortCode(String shortCode) {
        this.shortCode = shortCode;
    }

    /**
     * ShortCode registered with phone provider.
     * 
     * @return ShortCode registered with phone provider.
     */

    public String getShortCode() {
        return this.shortCode;
    }

    /**
     * ShortCode registered with phone provider.
     * 
     * @param shortCode
     *        ShortCode registered with phone provider.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SMSChannelRequest withShortCode(String shortCode) {
        setShortCode(shortCode);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getSenderId() != null)
            sb.append("SenderId: ").append(getSenderId()).append(",");
        if (getShortCode() != null)
            sb.append("ShortCode: ").append(getShortCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SMSChannelRequest == false)
            return false;
        SMSChannelRequest other = (SMSChannelRequest) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getSenderId() == null ^ this.getSenderId() == null)
            return false;
        if (other.getSenderId() != null && other.getSenderId().equals(this.getSenderId()) == false)
            return false;
        if (other.getShortCode() == null ^ this.getShortCode() == null)
            return false;
        if (other.getShortCode() != null && other.getShortCode().equals(this.getShortCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getSenderId() == null) ? 0 : getSenderId().hashCode());
        hashCode = prime * hashCode + ((getShortCode() == null) ? 0 : getShortCode().hashCode());
        return hashCode;
    }

    @Override
    public SMSChannelRequest clone() {
        try {
            return (SMSChannelRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.SMSChannelRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
