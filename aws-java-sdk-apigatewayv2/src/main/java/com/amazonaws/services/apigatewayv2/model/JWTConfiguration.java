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
package com.amazonaws.services.apigatewayv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents the configuration of a JWT authorizer. Required for the JWT authorizer type. Supported only for HTTP APIs.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JWTConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one entry in
     * this list. See <a href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC 7519</a>. Supported only for HTTP
     * APIs.
     * </p>
     */
    private java.util.List<String> audience;
    /**
     * <p>
     * The base domain of the identity provider that issues JSON Web Tokens. For example, an Amazon Cognito user pool
     * has the following format:
     * https://cognito-idp.<replaceable>{region}</replaceable>.amazonaws.com/<replaceable>{userPoolId}</replaceable> .
     * Required for the JWT authorizer type. Supported only for HTTP APIs.
     * </p>
     */
    private String issuer;

    /**
     * <p>
     * A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one entry in
     * this list. See <a href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC 7519</a>. Supported only for HTTP
     * APIs.
     * </p>
     * 
     * @return A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one
     *         entry in this list. See <a href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC 7519</a>.
     *         Supported only for HTTP APIs.
     */

    public java.util.List<String> getAudience() {
        return audience;
    }

    /**
     * <p>
     * A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one entry in
     * this list. See <a href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC 7519</a>. Supported only for HTTP
     * APIs.
     * </p>
     * 
     * @param audience
     *        A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one
     *        entry in this list. See <a href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC 7519</a>.
     *        Supported only for HTTP APIs.
     */

    public void setAudience(java.util.Collection<String> audience) {
        if (audience == null) {
            this.audience = null;
            return;
        }

        this.audience = new java.util.ArrayList<String>(audience);
    }

    /**
     * <p>
     * A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one entry in
     * this list. See <a href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC 7519</a>. Supported only for HTTP
     * APIs.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudience(java.util.Collection)} or {@link #withAudience(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param audience
     *        A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one
     *        entry in this list. See <a href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC 7519</a>.
     *        Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JWTConfiguration withAudience(String... audience) {
        if (this.audience == null) {
            setAudience(new java.util.ArrayList<String>(audience.length));
        }
        for (String ele : audience) {
            this.audience.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one entry in
     * this list. See <a href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC 7519</a>. Supported only for HTTP
     * APIs.
     * </p>
     * 
     * @param audience
     *        A list of the intended recipients of the JWT. A valid JWT must provide an aud that matches at least one
     *        entry in this list. See <a href="https://tools.ietf.org/html/rfc7519#section-4.1.3">RFC 7519</a>.
     *        Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JWTConfiguration withAudience(java.util.Collection<String> audience) {
        setAudience(audience);
        return this;
    }

    /**
     * <p>
     * The base domain of the identity provider that issues JSON Web Tokens. For example, an Amazon Cognito user pool
     * has the following format:
     * https://cognito-idp.<replaceable>{region}</replaceable>.amazonaws.com/<replaceable>{userPoolId}</replaceable> .
     * Required for the JWT authorizer type. Supported only for HTTP APIs.
     * </p>
     * 
     * @param issuer
     *        The base domain of the identity provider that issues JSON Web Tokens. For example, an Amazon Cognito user
     *        pool has the following format:
     *        https://cognito-idp.<replaceable>{region}</replaceable>.amazonaws.com/<replaceable
     *        >{userPoolId}</replaceable> . Required for the JWT authorizer type. Supported only for HTTP APIs.
     */

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    /**
     * <p>
     * The base domain of the identity provider that issues JSON Web Tokens. For example, an Amazon Cognito user pool
     * has the following format:
     * https://cognito-idp.<replaceable>{region}</replaceable>.amazonaws.com/<replaceable>{userPoolId}</replaceable> .
     * Required for the JWT authorizer type. Supported only for HTTP APIs.
     * </p>
     * 
     * @return The base domain of the identity provider that issues JSON Web Tokens. For example, an Amazon Cognito user
     *         pool has the following format:
     *         https://cognito-idp.<replaceable>{region}</replaceable>.amazonaws.com/<replaceable
     *         >{userPoolId}</replaceable> . Required for the JWT authorizer type. Supported only for HTTP APIs.
     */

    public String getIssuer() {
        return this.issuer;
    }

    /**
     * <p>
     * The base domain of the identity provider that issues JSON Web Tokens. For example, an Amazon Cognito user pool
     * has the following format:
     * https://cognito-idp.<replaceable>{region}</replaceable>.amazonaws.com/<replaceable>{userPoolId}</replaceable> .
     * Required for the JWT authorizer type. Supported only for HTTP APIs.
     * </p>
     * 
     * @param issuer
     *        The base domain of the identity provider that issues JSON Web Tokens. For example, an Amazon Cognito user
     *        pool has the following format:
     *        https://cognito-idp.<replaceable>{region}</replaceable>.amazonaws.com/<replaceable
     *        >{userPoolId}</replaceable> . Required for the JWT authorizer type. Supported only for HTTP APIs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JWTConfiguration withIssuer(String issuer) {
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
        if (getAudience() != null)
            sb.append("Audience: ").append(getAudience()).append(",");
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

        if (obj instanceof JWTConfiguration == false)
            return false;
        JWTConfiguration other = (JWTConfiguration) obj;
        if (other.getAudience() == null ^ this.getAudience() == null)
            return false;
        if (other.getAudience() != null && other.getAudience().equals(this.getAudience()) == false)
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

        hashCode = prime * hashCode + ((getAudience() == null) ? 0 : getAudience().hashCode());
        hashCode = prime * hashCode + ((getIssuer() == null) ? 0 : getIssuer().hashCode());
        return hashCode;
    }

    @Override
    public JWTConfiguration clone() {
        try {
            return (JWTConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.apigatewayv2.model.transform.JWTConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
