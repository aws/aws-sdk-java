/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies the authorization configuration for using an OpenID Connect compliant service with your AppSync GraphQL API
 * endpoint.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsAppSyncGraphQlApiOpenIdConnectConfigDetails"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsAppSyncGraphQlApiOpenIdConnectConfigDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of milliseconds that a token is valid after being authenticated.
     * </p>
     */
    private Long authTtL;
    /**
     * <p>
     * The client identifier of the relying party at the OpenID identity provider. This identifier is typically obtained
     * when the relying party is registered with the OpenID identity provider. You can specify a regular expression so
     * that AppSync can validate against multiple client identifiers at a time.
     * </p>
     */
    private String clientId;
    /**
     * <p>
     * The number of milliseconds that a token is valid after it's issued to a user.
     * </p>
     */
    private Long iatTtL;
    /**
     * <p>
     * The issuer for the OIDC configuration. The issuer returned by discovery must exactly match the value of
     * <code>iss</code> in the ID token.
     * </p>
     */
    private String issuer;

    /**
     * <p>
     * The number of milliseconds that a token is valid after being authenticated.
     * </p>
     * 
     * @param authTtL
     *        The number of milliseconds that a token is valid after being authenticated.
     */

    public void setAuthTtL(Long authTtL) {
        this.authTtL = authTtL;
    }

    /**
     * <p>
     * The number of milliseconds that a token is valid after being authenticated.
     * </p>
     * 
     * @return The number of milliseconds that a token is valid after being authenticated.
     */

    public Long getAuthTtL() {
        return this.authTtL;
    }

    /**
     * <p>
     * The number of milliseconds that a token is valid after being authenticated.
     * </p>
     * 
     * @param authTtL
     *        The number of milliseconds that a token is valid after being authenticated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiOpenIdConnectConfigDetails withAuthTtL(Long authTtL) {
        setAuthTtL(authTtL);
        return this;
    }

    /**
     * <p>
     * The client identifier of the relying party at the OpenID identity provider. This identifier is typically obtained
     * when the relying party is registered with the OpenID identity provider. You can specify a regular expression so
     * that AppSync can validate against multiple client identifiers at a time.
     * </p>
     * 
     * @param clientId
     *        The client identifier of the relying party at the OpenID identity provider. This identifier is typically
     *        obtained when the relying party is registered with the OpenID identity provider. You can specify a regular
     *        expression so that AppSync can validate against multiple client identifiers at a time.
     */

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    /**
     * <p>
     * The client identifier of the relying party at the OpenID identity provider. This identifier is typically obtained
     * when the relying party is registered with the OpenID identity provider. You can specify a regular expression so
     * that AppSync can validate against multiple client identifiers at a time.
     * </p>
     * 
     * @return The client identifier of the relying party at the OpenID identity provider. This identifier is typically
     *         obtained when the relying party is registered with the OpenID identity provider. You can specify a
     *         regular expression so that AppSync can validate against multiple client identifiers at a time.
     */

    public String getClientId() {
        return this.clientId;
    }

    /**
     * <p>
     * The client identifier of the relying party at the OpenID identity provider. This identifier is typically obtained
     * when the relying party is registered with the OpenID identity provider. You can specify a regular expression so
     * that AppSync can validate against multiple client identifiers at a time.
     * </p>
     * 
     * @param clientId
     *        The client identifier of the relying party at the OpenID identity provider. This identifier is typically
     *        obtained when the relying party is registered with the OpenID identity provider. You can specify a regular
     *        expression so that AppSync can validate against multiple client identifiers at a time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiOpenIdConnectConfigDetails withClientId(String clientId) {
        setClientId(clientId);
        return this;
    }

    /**
     * <p>
     * The number of milliseconds that a token is valid after it's issued to a user.
     * </p>
     * 
     * @param iatTtL
     *        The number of milliseconds that a token is valid after it's issued to a user.
     */

    public void setIatTtL(Long iatTtL) {
        this.iatTtL = iatTtL;
    }

    /**
     * <p>
     * The number of milliseconds that a token is valid after it's issued to a user.
     * </p>
     * 
     * @return The number of milliseconds that a token is valid after it's issued to a user.
     */

    public Long getIatTtL() {
        return this.iatTtL;
    }

    /**
     * <p>
     * The number of milliseconds that a token is valid after it's issued to a user.
     * </p>
     * 
     * @param iatTtL
     *        The number of milliseconds that a token is valid after it's issued to a user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiOpenIdConnectConfigDetails withIatTtL(Long iatTtL) {
        setIatTtL(iatTtL);
        return this;
    }

    /**
     * <p>
     * The issuer for the OIDC configuration. The issuer returned by discovery must exactly match the value of
     * <code>iss</code> in the ID token.
     * </p>
     * 
     * @param issuer
     *        The issuer for the OIDC configuration. The issuer returned by discovery must exactly match the value of
     *        <code>iss</code> in the ID token.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The issuer for the OIDC configuration. The issuer returned by discovery must exactly match the value of
     * <code>iss</code> in the ID token.
     * </p>
     * 
     * @return The issuer for the OIDC configuration. The issuer returned by discovery must exactly match the value of
     *         <code>iss</code> in the ID token.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The issuer for the OIDC configuration. The issuer returned by discovery must exactly match the value of
     * <code>iss</code> in the ID token.
     * </p>
     * 
     * @param issuer
     *        The issuer for the OIDC configuration. The issuer returned by discovery must exactly match the value of
     *        <code>iss</code> in the ID token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsAppSyncGraphQlApiOpenIdConnectConfigDetails withIssuer(String issuer) {
        setIssuer(issuer);
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
        if (getAuthTtL() != null)
            sb.append("AuthTtL: ").append(getAuthTtL()).append(",");
        if (getClientId() != null)
            sb.append("ClientId: ").append(getClientId()).append(",");
        if (getIatTtL() != null)
            sb.append("IatTtL: ").append(getIatTtL()).append(",");
        if (getIssuer() != null)
            sb.append("Issuer: ").append(getIssuer());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsAppSyncGraphQlApiOpenIdConnectConfigDetails == false)
            return false;
        AwsAppSyncGraphQlApiOpenIdConnectConfigDetails other = (AwsAppSyncGraphQlApiOpenIdConnectConfigDetails) obj;
        if (other.getAuthTtL() == null ^ this.getAuthTtL() == null)
            return false;
        if (other.getAuthTtL() != null && other.getAuthTtL().equals(this.getAuthTtL()) == false)
            return false;
        if (other.getClientId() == null ^ this.getClientId() == null)
            return false;
        if (other.getClientId() != null && other.getClientId().equals(this.getClientId()) == false)
            return false;
        if (other.getIatTtL() == null ^ this.getIatTtL() == null)
            return false;
        if (other.getIatTtL() != null && other.getIatTtL().equals(this.getIatTtL()) == false)
            return false;
        if (other.getIssuer() == null ^ this.getIssuer() == null)
            return false;
        if (other.getIssuer() != null && other.getIssuer().equals(this.getIssuer()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAuthTtL() == null) ? 0 : getAuthTtL().hashCode());
        hashCode = prime * hashCode + ((getClientId() == null) ? 0 : getClientId().hashCode());
        hashCode = prime * hashCode + ((getIatTtL() == null) ? 0 : getIatTtL().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        return hashCode;
    }

    @Override
    public AwsAppSyncGraphQlApiOpenIdConnectConfigDetails clone() {
        try {
            return (AwsAppSyncGraphQlApiOpenIdConnectConfigDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsAppSyncGraphQlApiOpenIdConnectConfigDetailsMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
