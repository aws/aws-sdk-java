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
 * Amazon Device Messaging channel definition.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ADMChannelRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ADMChannelRequest implements Serializable, Cloneable, StructuredPojo {

    /** The Client ID that you obtained from the Amazon App Distribution Portal. */
    private String clientId;
    /** The Client Secret that you obtained from the Amazon App Distribution Portal. */
    private String clientSecret;
    /** Indicates whether or not the channel is enabled for sending messages. */
    private Boolean enabled;

    /**
     * The Client ID that you obtained from the Amazon App Distribution Portal.
     * 
     * @param clientId
     *        The Client ID that you obtained from the Amazon App Distribution Portal.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * The Client ID that you obtained from the Amazon App Distribution Portal.
     * 
     * @return The Client ID that you obtained from the Amazon App Distribution Portal.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * The Client ID that you obtained from the Amazon App Distribution Portal.
     * 
     * @param clientId
     *        The Client ID that you obtained from the Amazon App Distribution Portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * The Client Secret that you obtained from the Amazon App Distribution Portal.
     * 
     * @param clientSecret
     *        The Client Secret that you obtained from the Amazon App Distribution Portal.
     */

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * The Client Secret that you obtained from the Amazon App Distribution Portal.
     * 
     * @return The Client Secret that you obtained from the Amazon App Distribution Portal.
     */

    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * The Client Secret that you obtained from the Amazon App Distribution Portal.
     * 
     * @param clientSecret
     *        The Client Secret that you obtained from the Amazon App Distribution Portal.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelRequest withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
        return this;
    }

    /**
     * Indicates whether or not the channel is enabled for sending messages.
     * 
     * @param enabled
     *        Indicates whether or not the channel is enabled for sending messages.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * Indicates whether or not the channel is enabled for sending messages.
     * 
     * @return Indicates whether or not the channel is enabled for sending messages.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * Indicates whether or not the channel is enabled for sending messages.
     * 
     * @param enabled
     *        Indicates whether or not the channel is enabled for sending messages.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * Indicates whether or not the channel is enabled for sending messages.
     * 
     * @return Indicates whether or not the channel is enabled for sending messages.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getClientSecret() != null)
            sb.append("ClientSecret: ").append(getClientSecret()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ADMChannelRequest == false)
            return false;
        ADMChannelRequest other = (ADMChannelRequest) obj;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getClientSecret() == null ^ this.getClientSecret() == null)
            return false;
        if (other.getClientSecret() != null && other.getClientSecret().equals(this.getClientSecret()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getClientSecret() == null) ? 0 : getClientSecret().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public ADMChannelRequest clone() {
        try {
            return (ADMChannelRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.ADMChannelRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
