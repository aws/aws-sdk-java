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
package com.amazonaws.services.appsync.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes an OpenID Connect configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appsync-2017-07-25/OpenIDConnectConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OpenIDConnectConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The issuer for the OpenID Connect configuration. The issuer returned by discovery must exactly match the value of
     * <code>iss</code> in the ID token.
     * </p>
     */
    private String issuer;
    /**
     * <p>
     * The client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained
     * when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so
     * the AWS AppSync can validate against multiple client identifiers at a time.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The number of milliseconds a token is valid after being issued to a user.
     * </p>
     */
    private Long iatTTL;
    /**
     * <p>
     * The number of milliseconds a token is valid after being authenticated.
     * </p>
     */
    private Long authTTL;

    /**
     * <p>
     * The issuer for the OpenID Connect configuration. The issuer returned by discovery must exactly match the value of
     * <code>iss</code> in the ID token.
     * </p>
     * 
     * @param issuer
     *        The issuer for the OpenID Connect configuration. The issuer returned by discovery must exactly match the
     *        value of <code>iss</code> in the ID token.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The issuer for the OpenID Connect configuration. The issuer returned by discovery must exactly match the value of
     * <code>iss</code> in the ID token.
     * </p>
     * 
     * @return The issuer for the OpenID Connect configuration. The issuer returned by discovery must exactly match the
     *         value of <code>iss</code> in the ID token.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The issuer for the OpenID Connect configuration. The issuer returned by discovery must exactly match the value of
     * <code>iss</code> in the ID token.
     * </p>
     * 
     * @param issuer
     *        The issuer for the OpenID Connect configuration. The issuer returned by discovery must exactly match the
     *        value of <code>iss</code> in the ID token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenIDConnectConfig withIssuer(String issuer) {
        setIssuer(issuer);
        return this;
    }

    /**
     * <p>
     * The client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained
     * when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so
     * the AWS AppSync can validate against multiple client identifiers at a time.
     * </p>
     * 
     * @param clientId
     *        The client identifier of the Relying party at the OpenID identity provider. This identifier is typically
     *        obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular
     *        expression so the AWS AppSync can validate against multiple client identifiers at a time.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained
     * when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so
     * the AWS AppSync can validate against multiple client identifiers at a time.
     * </p>
     * 
     * @return The client identifier of the Relying party at the OpenID identity provider. This identifier is typically
     *         obtained when the Relying party is registered with the OpenID identity provider. You can specify a
     *         regular expression so the AWS AppSync can validate against multiple client identifiers at a time.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The client identifier of the Relying party at the OpenID identity provider. This identifier is typically obtained
     * when the Relying party is registered with the OpenID identity provider. You can specify a regular expression so
     * the AWS AppSync can validate against multiple client identifiers at a time.
     * </p>
     * 
     * @param clientId
     *        The client identifier of the Relying party at the OpenID identity provider. This identifier is typically
     *        obtained when the Relying party is registered with the OpenID identity provider. You can specify a regular
     *        expression so the AWS AppSync can validate against multiple client identifiers at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenIDConnectConfig withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The number of milliseconds a token is valid after being issued to a user.
     * </p>
     * 
     * @param iatTTL
     *        The number of milliseconds a token is valid after being issued to a user.
     */

    public void setIatTTL(Long iatTTL) {
        this.iatTTL = iatTTL;
    }

    /**
     * <p>
     * The number of milliseconds a token is valid after being issued to a user.
     * </p>
     * 
     * @return The number of milliseconds a token is valid after being issued to a user.
     */

    public Long getIatTTL() {
        return this.iatTTL;
    }

    /**
     * <p>
     * The number of milliseconds a token is valid after being issued to a user.
     * </p>
     * 
     * @param iatTTL
     *        The number of milliseconds a token is valid after being issued to a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenIDConnectConfig withIatTTL(Long iatTTL) {
        setIatTTL(iatTTL);
        return this;
    }

    /**
     * <p>
     * The number of milliseconds a token is valid after being authenticated.
     * </p>
     * 
     * @param authTTL
     *        The number of milliseconds a token is valid after being authenticated.
     */

    public void setAuthTTL(Long authTTL) {
        this.authTTL = authTTL;
    }

    /**
     * <p>
     * The number of milliseconds a token is valid after being authenticated.
     * </p>
     * 
     * @return The number of milliseconds a token is valid after being authenticated.
     */

    public Long getAuthTTL() {
        return this.authTTL;
    }

    /**
     * <p>
     * The number of milliseconds a token is valid after being authenticated.
     * </p>
     * 
     * @param authTTL
     *        The number of milliseconds a token is valid after being authenticated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OpenIDConnectConfig withAuthTTL(Long authTTL) {
        setAuthTTL(authTTL);
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
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getIatTTL() != null)
            sb.append("IatTTL: ").append(getIatTTL()).append(",");
        if (getAuthTTL() != null)
            sb.append("AuthTTL: ").append(getAuthTTL());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OpenIDConnectConfig == false)
            return false;
        OpenIDConnectConfig other = (OpenIDConnectConfig) obj;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getIatTTL() == null ^ this.getIatTTL() == null)
            return false;
        if (other.getIatTTL() != null && other.getIatTTL().equals(this.getIatTTL()) == false)
            return false;
        if (other.getAuthTTL() == null ^ this.getAuthTTL() == null)
            return false;
        if (other.getAuthTTL() != null && other.getAuthTTL().equals(this.getAuthTTL()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getIatTTL() == null) ? 0 : getIatTTL().hashCode());
        hashCode = prime * hashCode + ((getAuthTTL() == null) ? 0 : getAuthTTL().hashCode());
        return hashCode;
    }

    @Override
    public OpenIDConnectConfig clone() {
        try {
            return (OpenIDConnectConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appsync.model.transform.OpenIDConnectConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
