/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * Specifies the status and settings of the ADM (Amazon Device Messaging) channel for an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/ADMChannelRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ADMChannelRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Client ID that you received from Amazon to send messages by using ADM.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The Client Secret that you received from Amazon to send messages by using ADM.
     * </p>
     */
    private String clientSecret;
    /**
     * <p>
     * Specifies whether to enable the ADM channel for the application.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The Client ID that you received from Amazon to send messages by using ADM.
     * </p>
     * 
     * @param clientId
     *        The Client ID that you received from Amazon to send messages by using ADM.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The Client ID that you received from Amazon to send messages by using ADM.
     * </p>
     * 
     * @return The Client ID that you received from Amazon to send messages by using ADM.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The Client ID that you received from Amazon to send messages by using ADM.
     * </p>
     * 
     * @param clientId
     *        The Client ID that you received from Amazon to send messages by using ADM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelRequest withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The Client Secret that you received from Amazon to send messages by using ADM.
     * </p>
     * 
     * @param clientSecret
     *        The Client Secret that you received from Amazon to send messages by using ADM.
     */

    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }

    /**
     * <p>
     * The Client Secret that you received from Amazon to send messages by using ADM.
     * </p>
     * 
     * @return The Client Secret that you received from Amazon to send messages by using ADM.
     */

    public String getClientSecret() {
        return this.clientSecret;
    }

    /**
     * <p>
     * The Client Secret that you received from Amazon to send messages by using ADM.
     * </p>
     * 
     * @param clientSecret
     *        The Client Secret that you received from Amazon to send messages by using ADM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelRequest withClientSecret(String clientSecret) {
        setClientSecret(clientSecret);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the ADM channel for the application.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to enable the ADM channel for the application.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the ADM channel for the application.
     * </p>
     * 
     * @return Specifies whether to enable the ADM channel for the application.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the ADM channel for the application.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to enable the ADM channel for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ADMChannelRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the ADM channel for the application.
     * </p>
     * 
     * @return Specifies whether to enable the ADM channel for the application.
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
