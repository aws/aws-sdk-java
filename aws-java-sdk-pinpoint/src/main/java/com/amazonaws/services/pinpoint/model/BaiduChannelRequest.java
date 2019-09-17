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
 * <p>
 * Specifies the status and settings of the Baidu (Baidu Cloud Push) channel for an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/BaiduChannelRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BaiduChannelRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The API key that you received from the Baidu Cloud Push service to communicate with the service.
     * </p>
     */
    private String apiKey;
    /**
     * <p>
     * Specifies whether to enable the Baidu channel for the application.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The secret key that you received from the Baidu Cloud Push service to communicate with the service.
     * </p>
     */
    private String secretKey;

    /**
     * <p>
     * The API key that you received from the Baidu Cloud Push service to communicate with the service.
     * </p>
     * 
     * @param apiKey
     *        The API key that you received from the Baidu Cloud Push service to communicate with the service.
     */

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

    /**
     * <p>
     * The API key that you received from the Baidu Cloud Push service to communicate with the service.
     * </p>
     * 
     * @return The API key that you received from the Baidu Cloud Push service to communicate with the service.
     */

    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * <p>
     * The API key that you received from the Baidu Cloud Push service to communicate with the service.
     * </p>
     * 
     * @param apiKey
     *        The API key that you received from the Baidu Cloud Push service to communicate with the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaiduChannelRequest withApiKey(String apiKey) {
        setApiKey(apiKey);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the Baidu channel for the application.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to enable the Baidu channel for the application.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the Baidu channel for the application.
     * </p>
     * 
     * @return Specifies whether to enable the Baidu channel for the application.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the Baidu channel for the application.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to enable the Baidu channel for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaiduChannelRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the Baidu channel for the application.
     * </p>
     * 
     * @return Specifies whether to enable the Baidu channel for the application.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The secret key that you received from the Baidu Cloud Push service to communicate with the service.
     * </p>
     * 
     * @param secretKey
     *        The secret key that you received from the Baidu Cloud Push service to communicate with the service.
     */

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }

    /**
     * <p>
     * The secret key that you received from the Baidu Cloud Push service to communicate with the service.
     * </p>
     * 
     * @return The secret key that you received from the Baidu Cloud Push service to communicate with the service.
     */

    public String getSecretKey() {
        return this.secretKey;
    }

    /**
     * <p>
     * The secret key that you received from the Baidu Cloud Push service to communicate with the service.
     * </p>
     * 
     * @param secretKey
     *        The secret key that you received from the Baidu Cloud Push service to communicate with the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BaiduChannelRequest withSecretKey(String secretKey) {
        setSecretKey(secretKey);
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
        if (getApiKey() != null)
            sb.append("ApiKey: ").append(getApiKey()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getSecretKey() != null)
            sb.append("SecretKey: ").append(getSecretKey());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BaiduChannelRequest == false)
            return false;
        BaiduChannelRequest other = (BaiduChannelRequest) obj;
        if (other.getApiKey() == null ^ this.getApiKey() == null)
            return false;
        if (other.getApiKey() != null && other.getApiKey().equals(this.getApiKey()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getSecretKey() == null ^ this.getSecretKey() == null)
            return false;
        if (other.getSecretKey() != null && other.getSecretKey().equals(this.getSecretKey()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApiKey() == null) ? 0 : getApiKey().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getSecretKey() == null) ? 0 : getSecretKey().hashCode());
        return hashCode;
    }

    @Override
    public BaiduChannelRequest clone() {
        try {
            return (BaiduChannelRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.BaiduChannelRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
