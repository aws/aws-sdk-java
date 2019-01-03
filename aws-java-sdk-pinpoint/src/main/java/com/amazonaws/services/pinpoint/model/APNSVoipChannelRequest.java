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
 * Apple VoIP Push Notification Service channel definition.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/APNSVoipChannelRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class APNSVoipChannelRequest implements Serializable, Cloneable, StructuredPojo {

    /** The bundle id used for APNs Tokens. */
    private String bundleId;
    /** The distribution certificate from Apple. */
    private String certificate;
    /** The default authentication method used for APNs. */
    private String defaultAuthenticationMethod;
    /** If the channel is enabled for sending messages. */
    private Boolean enabled;
    /** The certificate private key. */
    private String privateKey;
    /** The team id used for APNs Tokens. */
    private String teamId;
    /** The token key used for APNs Tokens. */
    private String tokenKey;
    /** The token key used for APNs Tokens. */
    private String tokenKeyId;

    /**
     * The bundle id used for APNs Tokens.
     * 
     * @param bundleId
     *        The bundle id used for APNs Tokens.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * The bundle id used for APNs Tokens.
     * 
     * @return The bundle id used for APNs Tokens.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * The bundle id used for APNs Tokens.
     * 
     * @param bundleId
     *        The bundle id used for APNs Tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSVoipChannelRequest withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * The distribution certificate from Apple.
     * 
     * @param certificate
     *        The distribution certificate from Apple.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * The distribution certificate from Apple.
     * 
     * @return The distribution certificate from Apple.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * The distribution certificate from Apple.
     * 
     * @param certificate
     *        The distribution certificate from Apple.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSVoipChannelRequest withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * The default authentication method used for APNs.
     * 
     * @param defaultAuthenticationMethod
     *        The default authentication method used for APNs.
     */

    public void setDefaultAuthenticationMethod(String defaultAuthenticationMethod) {
        this.defaultAuthenticationMethod = defaultAuthenticationMethod;
    }

    /**
     * The default authentication method used for APNs.
     * 
     * @return The default authentication method used for APNs.
     */

    public String getDefaultAuthenticationMethod() {
        return this.defaultAuthenticationMethod;
    }

    /**
     * The default authentication method used for APNs.
     * 
     * @param defaultAuthenticationMethod
     *        The default authentication method used for APNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSVoipChannelRequest withDefaultAuthenticationMethod(String defaultAuthenticationMethod) {
        setDefaultAuthenticationMethod(defaultAuthenticationMethod);
        return this;
    }

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

    public APNSVoipChannelRequest withEnabled(Boolean enabled) {
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
     * The certificate private key.
     * 
     * @param privateKey
     *        The certificate private key.
     */

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * The certificate private key.
     * 
     * @return The certificate private key.
     */

    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * The certificate private key.
     * 
     * @param privateKey
     *        The certificate private key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSVoipChannelRequest withPrivateKey(String privateKey) {
        setPrivateKey(privateKey);
        return this;
    }

    /**
     * The team id used for APNs Tokens.
     * 
     * @param teamId
     *        The team id used for APNs Tokens.
     */

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * The team id used for APNs Tokens.
     * 
     * @return The team id used for APNs Tokens.
     */

    public String getTeamId() {
        return this.teamId;
    }

    /**
     * The team id used for APNs Tokens.
     * 
     * @param teamId
     *        The team id used for APNs Tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSVoipChannelRequest withTeamId(String teamId) {
        setTeamId(teamId);
        return this;
    }

    /**
     * The token key used for APNs Tokens.
     * 
     * @param tokenKey
     *        The token key used for APNs Tokens.
     */

    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    /**
     * The token key used for APNs Tokens.
     * 
     * @return The token key used for APNs Tokens.
     */

    public String getTokenKey() {
        return this.tokenKey;
    }

    /**
     * The token key used for APNs Tokens.
     * 
     * @param tokenKey
     *        The token key used for APNs Tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSVoipChannelRequest withTokenKey(String tokenKey) {
        setTokenKey(tokenKey);
        return this;
    }

    /**
     * The token key used for APNs Tokens.
     * 
     * @param tokenKeyId
     *        The token key used for APNs Tokens.
     */

    public void setTokenKeyId(String tokenKeyId) {
        this.tokenKeyId = tokenKeyId;
    }

    /**
     * The token key used for APNs Tokens.
     * 
     * @return The token key used for APNs Tokens.
     */

    public String getTokenKeyId() {
        return this.tokenKeyId;
    }

    /**
     * The token key used for APNs Tokens.
     * 
     * @param tokenKeyId
     *        The token key used for APNs Tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSVoipChannelRequest withTokenKeyId(String tokenKeyId) {
        setTokenKeyId(tokenKeyId);
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
        if (getBundleId() != null)
            sb.append("BundleId: ").append(getBundleId()).append(",");
        if (getCertificate() != null)
            sb.append("Certificate: ").append(getCertificate()).append(",");
        if (getDefaultAuthenticationMethod() != null)
            sb.append("DefaultAuthenticationMethod: ").append(getDefaultAuthenticationMethod()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getPrivateKey() != null)
            sb.append("PrivateKey: ").append(getPrivateKey()).append(",");
        if (getTeamId() != null)
            sb.append("TeamId: ").append(getTeamId()).append(",");
        if (getTokenKey() != null)
            sb.append("TokenKey: ").append(getTokenKey()).append(",");
        if (getTokenKeyId() != null)
            sb.append("TokenKeyId: ").append(getTokenKeyId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof APNSVoipChannelRequest == false)
            return false;
        APNSVoipChannelRequest other = (APNSVoipChannelRequest) obj;
        if (other.getBundleId() == null ^ this.getBundleId() == null)
            return false;
        if (other.getBundleId() != null && other.getBundleId().equals(this.getBundleId()) == false)
            return false;
        if (other.getCertificate() == null ^ this.getCertificate() == null)
            return false;
        if (other.getCertificate() != null && other.getCertificate().equals(this.getCertificate()) == false)
            return false;
        if (other.getDefaultAuthenticationMethod() == null ^ this.getDefaultAuthenticationMethod() == null)
            return false;
        if (other.getDefaultAuthenticationMethod() != null && other.getDefaultAuthenticationMethod().equals(this.getDefaultAuthenticationMethod()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getPrivateKey() == null ^ this.getPrivateKey() == null)
            return false;
        if (other.getPrivateKey() != null && other.getPrivateKey().equals(this.getPrivateKey()) == false)
            return false;
        if (other.getTeamId() == null ^ this.getTeamId() == null)
            return false;
        if (other.getTeamId() != null && other.getTeamId().equals(this.getTeamId()) == false)
            return false;
        if (other.getTokenKey() == null ^ this.getTokenKey() == null)
            return false;
        if (other.getTokenKey() != null && other.getTokenKey().equals(this.getTokenKey()) == false)
            return false;
        if (other.getTokenKeyId() == null ^ this.getTokenKeyId() == null)
            return false;
        if (other.getTokenKeyId() != null && other.getTokenKeyId().equals(this.getTokenKeyId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBundleId() == null) ? 0 : getBundleId().hashCode());
        hashCode = prime * hashCode + ((getCertificate() == null) ? 0 : getCertificate().hashCode());
        hashCode = prime * hashCode + ((getDefaultAuthenticationMethod() == null) ? 0 : getDefaultAuthenticationMethod().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getPrivateKey() == null) ? 0 : getPrivateKey().hashCode());
        hashCode = prime * hashCode + ((getTeamId() == null) ? 0 : getTeamId().hashCode());
        hashCode = prime * hashCode + ((getTokenKey() == null) ? 0 : getTokenKey().hashCode());
        hashCode = prime * hashCode + ((getTokenKeyId() == null) ? 0 : getTokenKeyId().hashCode());
        return hashCode;
    }

    @Override
    public APNSVoipChannelRequest clone() {
        try {
            return (APNSVoipChannelRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.APNSVoipChannelRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
