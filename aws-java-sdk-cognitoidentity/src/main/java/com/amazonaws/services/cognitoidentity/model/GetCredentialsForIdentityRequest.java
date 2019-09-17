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
package com.amazonaws.services.cognitoidentity.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Input to the <code>GetCredentialsForIdentity</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-identity-2014-06-30/GetCredentialsForIdentity"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCredentialsForIdentityRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     */
    private String identityId;
    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. The name-value pair will follow
     * the syntax "provider_name": "provider_user_identifier".
     * </p>
     * <p>
     * Logins should not be specified when trying to get credentials for an unauthenticated identity.
     * </p>
     * <p>
     * The Logins parameter is required when using identities associated with external identity providers such as
     * FaceBook. For examples of <code>Logins</code> maps, see the code examples in the <a
     * href="http://docs.aws.amazon.com/cognito/latest/developerguide/external-identity-providers.html">External
     * Identity Providers</a> section of the Amazon Cognito Developer Guide.
     * </p>
     */
    private java.util.Map<String, String> logins;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were received in the token from the
     * identity provider. For example, a SAML-based identity provider. This parameter is optional for identity providers
     * that do not support role customization.
     * </p>
     */
    private String customRoleArn;

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID.
     */

    public void setIdentityId(String identityId) {
        this.identityId = identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @return A unique identifier in the format REGION:GUID.
     */

    public String getIdentityId() {
        return this.identityId;
    }

    /**
     * <p>
     * A unique identifier in the format REGION:GUID.
     * </p>
     * 
     * @param identityId
     *        A unique identifier in the format REGION:GUID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCredentialsForIdentityRequest withIdentityId(String identityId) {
        setIdentityId(identityId);
        return this;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. The name-value pair will follow
     * the syntax "provider_name": "provider_user_identifier".
     * </p>
     * <p>
     * Logins should not be specified when trying to get credentials for an unauthenticated identity.
     * </p>
     * <p>
     * The Logins parameter is required when using identities associated with external identity providers such as
     * FaceBook. For examples of <code>Logins</code> maps, see the code examples in the <a
     * href="http://docs.aws.amazon.com/cognito/latest/developerguide/external-identity-providers.html">External
     * Identity Providers</a> section of the Amazon Cognito Developer Guide.
     * </p>
     * 
     * @return A set of optional name-value pairs that map provider names to provider tokens. The name-value pair will
     *         follow the syntax "provider_name": "provider_user_identifier".</p>
     *         <p>
     *         Logins should not be specified when trying to get credentials for an unauthenticated identity.
     *         </p>
     *         <p>
     *         The Logins parameter is required when using identities associated with external identity providers such
     *         as FaceBook. For examples of <code>Logins</code> maps, see the code examples in the <a
     *         href="http://docs.aws.amazon.com/cognito/latest/developerguide/external-identity-providers.html">External
     *         Identity Providers</a> section of the Amazon Cognito Developer Guide.
     */

    public java.util.Map<String, String> getLogins() {
        return logins;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. The name-value pair will follow
     * the syntax "provider_name": "provider_user_identifier".
     * </p>
     * <p>
     * Logins should not be specified when trying to get credentials for an unauthenticated identity.
     * </p>
     * <p>
     * The Logins parameter is required when using identities associated with external identity providers such as
     * FaceBook. For examples of <code>Logins</code> maps, see the code examples in the <a
     * href="http://docs.aws.amazon.com/cognito/latest/developerguide/external-identity-providers.html">External
     * Identity Providers</a> section of the Amazon Cognito Developer Guide.
     * </p>
     * 
     * @param logins
     *        A set of optional name-value pairs that map provider names to provider tokens. The name-value pair will
     *        follow the syntax "provider_name": "provider_user_identifier".</p>
     *        <p>
     *        Logins should not be specified when trying to get credentials for an unauthenticated identity.
     *        </p>
     *        <p>
     *        The Logins parameter is required when using identities associated with external identity providers such as
     *        FaceBook. For examples of <code>Logins</code> maps, see the code examples in the <a
     *        href="http://docs.aws.amazon.com/cognito/latest/developerguide/external-identity-providers.html">External
     *        Identity Providers</a> section of the Amazon Cognito Developer Guide.
     */

    public void setLogins(java.util.Map<String, String> logins) {
        this.logins = logins;
    }

    /**
     * <p>
     * A set of optional name-value pairs that map provider names to provider tokens. The name-value pair will follow
     * the syntax "provider_name": "provider_user_identifier".
     * </p>
     * <p>
     * Logins should not be specified when trying to get credentials for an unauthenticated identity.
     * </p>
     * <p>
     * The Logins parameter is required when using identities associated with external identity providers such as
     * FaceBook. For examples of <code>Logins</code> maps, see the code examples in the <a
     * href="http://docs.aws.amazon.com/cognito/latest/developerguide/external-identity-providers.html">External
     * Identity Providers</a> section of the Amazon Cognito Developer Guide.
     * </p>
     * 
     * @param logins
     *        A set of optional name-value pairs that map provider names to provider tokens. The name-value pair will
     *        follow the syntax "provider_name": "provider_user_identifier".</p>
     *        <p>
     *        Logins should not be specified when trying to get credentials for an unauthenticated identity.
     *        </p>
     *        <p>
     *        The Logins parameter is required when using identities associated with external identity providers such as
     *        FaceBook. For examples of <code>Logins</code> maps, see the code examples in the <a
     *        href="http://docs.aws.amazon.com/cognito/latest/developerguide/external-identity-providers.html">External
     *        Identity Providers</a> section of the Amazon Cognito Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCredentialsForIdentityRequest withLogins(java.util.Map<String, String> logins) {
        setLogins(logins);
        return this;
    }

    public GetCredentialsForIdentityRequest addLoginsEntry(String key, String value) {
        if (null == this.logins) {
            this.logins = new java.util.HashMap<String, String>();
        }
        if (this.logins.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.logins.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Logins.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCredentialsForIdentityRequest clearLoginsEntries() {
        this.logins = null;
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were received in the token from the
     * identity provider. For example, a SAML-based identity provider. This parameter is optional for identity providers
     * that do not support role customization.
     * </p>
     * 
     * @param customRoleArn
     *        The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were received in the token
     *        from the identity provider. For example, a SAML-based identity provider. This parameter is optional for
     *        identity providers that do not support role customization.
     */

    public void setCustomRoleArn(String customRoleArn) {
        this.customRoleArn = customRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were received in the token from the
     * identity provider. For example, a SAML-based identity provider. This parameter is optional for identity providers
     * that do not support role customization.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were received in the token
     *         from the identity provider. For example, a SAML-based identity provider. This parameter is optional for
     *         identity providers that do not support role customization.
     */

    public String getCustomRoleArn() {
        return this.customRoleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were received in the token from the
     * identity provider. For example, a SAML-based identity provider. This parameter is optional for identity providers
     * that do not support role customization.
     * </p>
     * 
     * @param customRoleArn
     *        The Amazon Resource Name (ARN) of the role to be assumed when multiple roles were received in the token
     *        from the identity provider. For example, a SAML-based identity provider. This parameter is optional for
     *        identity providers that do not support role customization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCredentialsForIdentityRequest withCustomRoleArn(String customRoleArn) {
        setCustomRoleArn(customRoleArn);
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
        if (getIdentityId() != null)
            sb.append("IdentityId: ").append(getIdentityId()).append(",");
        if (getLogins() != null)
            sb.append("Logins: ").append(getLogins()).append(",");
        if (getCustomRoleArn() != null)
            sb.append("CustomRoleArn: ").append(getCustomRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCredentialsForIdentityRequest == false)
            return false;
        GetCredentialsForIdentityRequest other = (GetCredentialsForIdentityRequest) obj;
        if (other.getIdentityId() == null ^ this.getIdentityId() == null)
            return false;
        if (other.getIdentityId() != null && other.getIdentityId().equals(this.getIdentityId()) == false)
            return false;
        if (other.getLogins() == null ^ this.getLogins() == null)
            return false;
        if (other.getLogins() != null && other.getLogins().equals(this.getLogins()) == false)
            return false;
        if (other.getCustomRoleArn() == null ^ this.getCustomRoleArn() == null)
            return false;
        if (other.getCustomRoleArn() != null && other.getCustomRoleArn().equals(this.getCustomRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIdentityId() == null) ? 0 : getIdentityId().hashCode());
        hashCode = prime * hashCode + ((getLogins() == null) ? 0 : getLogins().hashCode());
        hashCode = prime * hashCode + ((getCustomRoleArn() == null) ? 0 : getCustomRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public GetCredentialsForIdentityRequest clone() {
        return (GetCredentialsForIdentityRequest) super.clone();
    }

}
