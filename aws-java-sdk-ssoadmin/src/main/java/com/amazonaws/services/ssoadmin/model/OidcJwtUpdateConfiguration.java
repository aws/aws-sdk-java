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
package com.amazonaws.services.ssoadmin.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that describes updated configuration settings for a trusted token issuer that supports OpenID Connect
 * (OIDC) and JSON Web Tokens (JWTs).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sso-admin-2020-07-20/OidcJwtUpdateConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class OidcJwtUpdateConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The path of the source attribute in the JWT from the trusted token issuer. The attribute mapped by this JMESPath
     * expression is compared against the attribute mapped by <code>IdentityStoreAttributePath</code> when a trusted
     * token issuer token is exchanged for an IAM Identity Center token.
     * </p>
     */
    private String claimAttributePath;
    /**
     * <p>
     * The path of the destination attribute in a JWT from IAM Identity Center. The attribute mapped by this JMESPath
     * expression is compared against the attribute mapped by <code>ClaimAttributePath</code> when a trusted token
     * issuer token is exchanged for an IAM Identity Center token.
     * </p>
     */
    private String identityStoreAttributePath;
    /**
     * <p>
     * The method that the trusted token issuer can use to retrieve the JSON Web Key Set used to verify a JWT.
     * </p>
     */
    private String jwksRetrievalOption;

    /**
     * <p>
     * The path of the source attribute in the JWT from the trusted token issuer. The attribute mapped by this JMESPath
     * expression is compared against the attribute mapped by <code>IdentityStoreAttributePath</code> when a trusted
     * token issuer token is exchanged for an IAM Identity Center token.
     * </p>
     * 
     * @param claimAttributePath
     *        The path of the source attribute in the JWT from the trusted token issuer. The attribute mapped by this
     *        JMESPath expression is compared against the attribute mapped by <code>IdentityStoreAttributePath</code>
     *        when a trusted token issuer token is exchanged for an IAM Identity Center token.
     */

    public void setClaimAttributePath(String claimAttributePath) {
        this.claimAttributePath = claimAttributePath;
    }

    /**
     * <p>
     * The path of the source attribute in the JWT from the trusted token issuer. The attribute mapped by this JMESPath
     * expression is compared against the attribute mapped by <code>IdentityStoreAttributePath</code> when a trusted
     * token issuer token is exchanged for an IAM Identity Center token.
     * </p>
     * 
     * @return The path of the source attribute in the JWT from the trusted token issuer. The attribute mapped by this
     *         JMESPath expression is compared against the attribute mapped by <code>IdentityStoreAttributePath</code>
     *         when a trusted token issuer token is exchanged for an IAM Identity Center token.
     */

    public String getClaimAttributePath() {
        return this.claimAttributePath;
    }

    /**
     * <p>
     * The path of the source attribute in the JWT from the trusted token issuer. The attribute mapped by this JMESPath
     * expression is compared against the attribute mapped by <code>IdentityStoreAttributePath</code> when a trusted
     * token issuer token is exchanged for an IAM Identity Center token.
     * </p>
     * 
     * @param claimAttributePath
     *        The path of the source attribute in the JWT from the trusted token issuer. The attribute mapped by this
     *        JMESPath expression is compared against the attribute mapped by <code>IdentityStoreAttributePath</code>
     *        when a trusted token issuer token is exchanged for an IAM Identity Center token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcJwtUpdateConfiguration withClaimAttributePath(String claimAttributePath) {
        setClaimAttributePath(claimAttributePath);
        return this;
    }

    /**
     * <p>
     * The path of the destination attribute in a JWT from IAM Identity Center. The attribute mapped by this JMESPath
     * expression is compared against the attribute mapped by <code>ClaimAttributePath</code> when a trusted token
     * issuer token is exchanged for an IAM Identity Center token.
     * </p>
     * 
     * @param identityStoreAttributePath
     *        The path of the destination attribute in a JWT from IAM Identity Center. The attribute mapped by this
     *        JMESPath expression is compared against the attribute mapped by <code>ClaimAttributePath</code> when a
     *        trusted token issuer token is exchanged for an IAM Identity Center token.
     */

    public void setIdentityStoreAttributePath(String identityStoreAttributePath) {
        this.identityStoreAttributePath = identityStoreAttributePath;
    }

    /**
     * <p>
     * The path of the destination attribute in a JWT from IAM Identity Center. The attribute mapped by this JMESPath
     * expression is compared against the attribute mapped by <code>ClaimAttributePath</code> when a trusted token
     * issuer token is exchanged for an IAM Identity Center token.
     * </p>
     * 
     * @return The path of the destination attribute in a JWT from IAM Identity Center. The attribute mapped by this
     *         JMESPath expression is compared against the attribute mapped by <code>ClaimAttributePath</code> when a
     *         trusted token issuer token is exchanged for an IAM Identity Center token.
     */

    public String getIdentityStoreAttributePath() {
        return this.identityStoreAttributePath;
    }

    /**
     * <p>
     * The path of the destination attribute in a JWT from IAM Identity Center. The attribute mapped by this JMESPath
     * expression is compared against the attribute mapped by <code>ClaimAttributePath</code> when a trusted token
     * issuer token is exchanged for an IAM Identity Center token.
     * </p>
     * 
     * @param identityStoreAttributePath
     *        The path of the destination attribute in a JWT from IAM Identity Center. The attribute mapped by this
     *        JMESPath expression is compared against the attribute mapped by <code>ClaimAttributePath</code> when a
     *        trusted token issuer token is exchanged for an IAM Identity Center token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public OidcJwtUpdateConfiguration withIdentityStoreAttributePath(String identityStoreAttributePath) {
        setIdentityStoreAttributePath(identityStoreAttributePath);
        return this;
    }

    /**
     * <p>
     * The method that the trusted token issuer can use to retrieve the JSON Web Key Set used to verify a JWT.
     * </p>
     * 
     * @param jwksRetrievalOption
     *        The method that the trusted token issuer can use to retrieve the JSON Web Key Set used to verify a JWT.
     * @see JwksRetrievalOption
     */

    public void setJwksRetrievalOption(String jwksRetrievalOption) {
        this.jwksRetrievalOption = jwksRetrievalOption;
    }

    /**
     * <p>
     * The method that the trusted token issuer can use to retrieve the JSON Web Key Set used to verify a JWT.
     * </p>
     * 
     * @return The method that the trusted token issuer can use to retrieve the JSON Web Key Set used to verify a JWT.
     * @see JwksRetrievalOption
     */

    public String getJwksRetrievalOption() {
        return this.jwksRetrievalOption;
    }

    /**
     * <p>
     * The method that the trusted token issuer can use to retrieve the JSON Web Key Set used to verify a JWT.
     * </p>
     * 
     * @param jwksRetrievalOption
     *        The method that the trusted token issuer can use to retrieve the JSON Web Key Set used to verify a JWT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JwksRetrievalOption
     */

    public OidcJwtUpdateConfiguration withJwksRetrievalOption(String jwksRetrievalOption) {
        setJwksRetrievalOption(jwksRetrievalOption);
        return this;
    }

    /**
     * <p>
     * The method that the trusted token issuer can use to retrieve the JSON Web Key Set used to verify a JWT.
     * </p>
     * 
     * @param jwksRetrievalOption
     *        The method that the trusted token issuer can use to retrieve the JSON Web Key Set used to verify a JWT.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see JwksRetrievalOption
     */

    public OidcJwtUpdateConfiguration withJwksRetrievalOption(JwksRetrievalOption jwksRetrievalOption) {
        this.jwksRetrievalOption = jwksRetrievalOption.toString();
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
        if (getClaimAttributePath() != null)
            sb.append("ClaimAttributePath: ").append(getClaimAttributePath()).append(",");
        if (getIdentityStoreAttributePath() != null)
            sb.append("IdentityStoreAttributePath: ").append(getIdentityStoreAttributePath()).append(",");
        if (getJwksRetrievalOption() != null)
            sb.append("JwksRetrievalOption: ").append(getJwksRetrievalOption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof OidcJwtUpdateConfiguration == false)
            return false;
        OidcJwtUpdateConfiguration other = (OidcJwtUpdateConfiguration) obj;
        if (other.getClaimAttributePath() == null ^ this.getClaimAttributePath() == null)
            return false;
        if (other.getClaimAttributePath() != null && other.getClaimAttributePath().equals(this.getClaimAttributePath()) == false)
            return false;
        if (other.getIdentityStoreAttributePath() == null ^ this.getIdentityStoreAttributePath() == null)
            return false;
        if (other.getIdentityStoreAttributePath() != null && other.getIdentityStoreAttributePath().equals(this.getIdentityStoreAttributePath()) == false)
            return false;
        if (other.getJwksRetrievalOption() == null ^ this.getJwksRetrievalOption() == null)
            return false;
        if (other.getJwksRetrievalOption() != null && other.getJwksRetrievalOption().equals(this.getJwksRetrievalOption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClaimAttributePath() == null) ? 0 : getClaimAttributePath().hashCode());
        hashCode = prime * hashCode + ((getIdentityStoreAttributePath() == null) ? 0 : getIdentityStoreAttributePath().hashCode());
        hashCode = prime * hashCode + ((getJwksRetrievalOption() == null) ? 0 : getJwksRetrievalOption().hashCode());
        return hashCode;
    }

    @Override
    public OidcJwtUpdateConfiguration clone() {
        try {
            return (OidcJwtUpdateConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssoadmin.model.transform.OidcJwtUpdateConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
