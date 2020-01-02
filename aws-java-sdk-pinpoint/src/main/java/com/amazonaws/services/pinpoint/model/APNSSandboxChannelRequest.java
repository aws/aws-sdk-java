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
 * Specifies the status and settings of the APNs (Apple Push Notification service) sandbox channel for an application.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/APNSSandboxChannelRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class APNSSandboxChannelRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The bundle identifier that's assigned to your iOS app. This identifier is used for APNs tokens.
     * </p>
     */
    private String bundleId;
    /**
     * <p>
     * The APNs client certificate that you received from Apple, if you want Amazon Pinpoint to communicate with the
     * APNs sandbox environment by using an APNs certificate.
     * </p>
     */
    private String certificate;
    /**
     * <p>
     * The default authentication method that you want Amazon Pinpoint to use when authenticating with the APNs sandbox
     * environment, key or certificate.
     * </p>
     */
    private String defaultAuthenticationMethod;
    /**
     * <p>
     * Specifies whether to enable the APNs sandbox channel for the application.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The private key for the APNs client certificate that you want Amazon Pinpoint to use to communicate with the APNs
     * sandbox environment.
     * </p>
     */
    private String privateKey;
    /**
     * <p>
     * The identifier that's assigned to your Apple developer account team. This identifier is used for APNs tokens.
     * </p>
     */
    private String teamId;
    /**
     * <p>
     * The authentication key to use for APNs tokens.
     * </p>
     */
    private String tokenKey;
    /**
     * <p>
     * The key identifier that's assigned to your APNs signing key, if you want Amazon Pinpoint to communicate with the
     * APNs sandbox environment by using APNs tokens.
     * </p>
     */
    private String tokenKeyId;

    /**
     * <p>
     * The bundle identifier that's assigned to your iOS app. This identifier is used for APNs tokens.
     * </p>
     * 
     * @param bundleId
     *        The bundle identifier that's assigned to your iOS app. This identifier is used for APNs tokens.
     */

    public void setBundleId(String bundleId) {
        this.bundleId = bundleId;
    }

    /**
     * <p>
     * The bundle identifier that's assigned to your iOS app. This identifier is used for APNs tokens.
     * </p>
     * 
     * @return The bundle identifier that's assigned to your iOS app. This identifier is used for APNs tokens.
     */

    public String getBundleId() {
        return this.bundleId;
    }

    /**
     * <p>
     * The bundle identifier that's assigned to your iOS app. This identifier is used for APNs tokens.
     * </p>
     * 
     * @param bundleId
     *        The bundle identifier that's assigned to your iOS app. This identifier is used for APNs tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSSandboxChannelRequest withBundleId(String bundleId) {
        setBundleId(bundleId);
        return this;
    }

    /**
     * <p>
     * The APNs client certificate that you received from Apple, if you want Amazon Pinpoint to communicate with the
     * APNs sandbox environment by using an APNs certificate.
     * </p>
     * 
     * @param certificate
     *        The APNs client certificate that you received from Apple, if you want Amazon Pinpoint to communicate with
     *        the APNs sandbox environment by using an APNs certificate.
     */

    public void setCertificate(String certificate) {
        this.certificate = certificate;
    }

    /**
     * <p>
     * The APNs client certificate that you received from Apple, if you want Amazon Pinpoint to communicate with the
     * APNs sandbox environment by using an APNs certificate.
     * </p>
     * 
     * @return The APNs client certificate that you received from Apple, if you want Amazon Pinpoint to communicate with
     *         the APNs sandbox environment by using an APNs certificate.
     */

    public String getCertificate() {
        return this.certificate;
    }

    /**
     * <p>
     * The APNs client certificate that you received from Apple, if you want Amazon Pinpoint to communicate with the
     * APNs sandbox environment by using an APNs certificate.
     * </p>
     * 
     * @param certificate
     *        The APNs client certificate that you received from Apple, if you want Amazon Pinpoint to communicate with
     *        the APNs sandbox environment by using an APNs certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSSandboxChannelRequest withCertificate(String certificate) {
        setCertificate(certificate);
        return this;
    }

    /**
     * <p>
     * The default authentication method that you want Amazon Pinpoint to use when authenticating with the APNs sandbox
     * environment, key or certificate.
     * </p>
     * 
     * @param defaultAuthenticationMethod
     *        The default authentication method that you want Amazon Pinpoint to use when authenticating with the APNs
     *        sandbox environment, key or certificate.
     */

    public void setDefaultAuthenticationMethod(String defaultAuthenticationMethod) {
        this.defaultAuthenticationMethod = defaultAuthenticationMethod;
    }

    /**
     * <p>
     * The default authentication method that you want Amazon Pinpoint to use when authenticating with the APNs sandbox
     * environment, key or certificate.
     * </p>
     * 
     * @return The default authentication method that you want Amazon Pinpoint to use when authenticating with the APNs
     *         sandbox environment, key or certificate.
     */

    public String getDefaultAuthenticationMethod() {
        return this.defaultAuthenticationMethod;
    }

    /**
     * <p>
     * The default authentication method that you want Amazon Pinpoint to use when authenticating with the APNs sandbox
     * environment, key or certificate.
     * </p>
     * 
     * @param defaultAuthenticationMethod
     *        The default authentication method that you want Amazon Pinpoint to use when authenticating with the APNs
     *        sandbox environment, key or certificate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSSandboxChannelRequest withDefaultAuthenticationMethod(String defaultAuthenticationMethod) {
        setDefaultAuthenticationMethod(defaultAuthenticationMethod);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the APNs sandbox channel for the application.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to enable the APNs sandbox channel for the application.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the APNs sandbox channel for the application.
     * </p>
     * 
     * @return Specifies whether to enable the APNs sandbox channel for the application.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Specifies whether to enable the APNs sandbox channel for the application.
     * </p>
     * 
     * @param enabled
     *        Specifies whether to enable the APNs sandbox channel for the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSSandboxChannelRequest withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable the APNs sandbox channel for the application.
     * </p>
     * 
     * @return Specifies whether to enable the APNs sandbox channel for the application.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The private key for the APNs client certificate that you want Amazon Pinpoint to use to communicate with the APNs
     * sandbox environment.
     * </p>
     * 
     * @param privateKey
     *        The private key for the APNs client certificate that you want Amazon Pinpoint to use to communicate with
     *        the APNs sandbox environment.
     */

    public void setPrivateKey(String privateKey) {
        this.privateKey = privateKey;
    }

    /**
     * <p>
     * The private key for the APNs client certificate that you want Amazon Pinpoint to use to communicate with the APNs
     * sandbox environment.
     * </p>
     * 
     * @return The private key for the APNs client certificate that you want Amazon Pinpoint to use to communicate with
     *         the APNs sandbox environment.
     */

    public String getPrivateKey() {
        return this.privateKey;
    }

    /**
     * <p>
     * The private key for the APNs client certificate that you want Amazon Pinpoint to use to communicate with the APNs
     * sandbox environment.
     * </p>
     * 
     * @param privateKey
     *        The private key for the APNs client certificate that you want Amazon Pinpoint to use to communicate with
     *        the APNs sandbox environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSSandboxChannelRequest withPrivateKey(String privateKey) {
        setPrivateKey(privateKey);
        return this;
    }

    /**
     * <p>
     * The identifier that's assigned to your Apple developer account team. This identifier is used for APNs tokens.
     * </p>
     * 
     * @param teamId
     *        The identifier that's assigned to your Apple developer account team. This identifier is used for APNs
     *        tokens.
     */

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    /**
     * <p>
     * The identifier that's assigned to your Apple developer account team. This identifier is used for APNs tokens.
     * </p>
     * 
     * @return The identifier that's assigned to your Apple developer account team. This identifier is used for APNs
     *         tokens.
     */

    public String getTeamId() {
        return this.teamId;
    }

    /**
     * <p>
     * The identifier that's assigned to your Apple developer account team. This identifier is used for APNs tokens.
     * </p>
     * 
     * @param teamId
     *        The identifier that's assigned to your Apple developer account team. This identifier is used for APNs
     *        tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSSandboxChannelRequest withTeamId(String teamId) {
        setTeamId(teamId);
        return this;
    }

    /**
     * <p>
     * The authentication key to use for APNs tokens.
     * </p>
     * 
     * @param tokenKey
     *        The authentication key to use for APNs tokens.
     */

    public void setTokenKey(String tokenKey) {
        this.tokenKey = tokenKey;
    }

    /**
     * <p>
     * The authentication key to use for APNs tokens.
     * </p>
     * 
     * @return The authentication key to use for APNs tokens.
     */

    public String getTokenKey() {
        return this.tokenKey;
    }

    /**
     * <p>
     * The authentication key to use for APNs tokens.
     * </p>
     * 
     * @param tokenKey
     *        The authentication key to use for APNs tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSSandboxChannelRequest withTokenKey(String tokenKey) {
        setTokenKey(tokenKey);
        return this;
    }

    /**
     * <p>
     * The key identifier that's assigned to your APNs signing key, if you want Amazon Pinpoint to communicate with the
     * APNs sandbox environment by using APNs tokens.
     * </p>
     * 
     * @param tokenKeyId
     *        The key identifier that's assigned to your APNs signing key, if you want Amazon Pinpoint to communicate
     *        with the APNs sandbox environment by using APNs tokens.
     */

    public void setTokenKeyId(String tokenKeyId) {
        this.tokenKeyId = tokenKeyId;
    }

    /**
     * <p>
     * The key identifier that's assigned to your APNs signing key, if you want Amazon Pinpoint to communicate with the
     * APNs sandbox environment by using APNs tokens.
     * </p>
     * 
     * @return The key identifier that's assigned to your APNs signing key, if you want Amazon Pinpoint to communicate
     *         with the APNs sandbox environment by using APNs tokens.
     */

    public String getTokenKeyId() {
        return this.tokenKeyId;
    }

    /**
     * <p>
     * The key identifier that's assigned to your APNs signing key, if you want Amazon Pinpoint to communicate with the
     * APNs sandbox environment by using APNs tokens.
     * </p>
     * 
     * @param tokenKeyId
     *        The key identifier that's assigned to your APNs signing key, if you want Amazon Pinpoint to communicate
     *        with the APNs sandbox environment by using APNs tokens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public APNSSandboxChannelRequest withTokenKeyId(String tokenKeyId) {
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

        if (obj instanceof APNSSandboxChannelRequest == false)
            return false;
        APNSSandboxChannelRequest other = (APNSSandboxChannelRequest) obj;
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
    public APNSSandboxChannelRequest clone() {
        try {
            return (APNSSandboxChannelRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.APNSSandboxChannelRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
