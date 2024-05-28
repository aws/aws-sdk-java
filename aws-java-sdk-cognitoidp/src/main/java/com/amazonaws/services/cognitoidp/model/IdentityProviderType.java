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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A container for information about an IdP.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/IdentityProviderType" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IdentityProviderType implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user pool ID.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The IdP name.
     * </p>
     */
    private String providerName;
    /**
     * <p>
     * The IdP type.
     * </p>
     */
    private String providerType;
    /**
     * <p>
     * The scopes, URLs, and identifiers for your external identity provider. The following examples describe the
     * provider detail keys for each IdP type. These values and their schema are subject to change. Social IdP
     * <code>authorize_scopes</code> values must match the values listed here.
     * </p>
     * <dl>
     * <dt>OpenID Connect (OIDC)</dt>
     * <dd>
     * <p>
     * Amazon Cognito accepts the following elements when it can't discover endpoint URLs from <code>oidc_issuer</code>:
     * <code>attributes_url</code>, <code>authorize_url</code>, <code>jwks_uri</code>, <code>token_url</code>.
     * </p>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * </dd>
     * <dt>SAML</dt>
     * <dd>
     * <p>
     * Create or update request with Metadata URL:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * Create or update request with Metadata file:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * The value of <code>MetadataFile</code> must be the plaintext metadata document with all quote (") characters
     * escaped by backslashes.
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     * </p>
     * </dd>
     * <dt>LoginWithAmazon</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     * </p>
     * </dd>
     * <dt>Google</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     * </p>
     * </dd>
     * <dt>SignInWithApple</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     * </p>
     * </dd>
     * <dt>Facebook</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     * </p>
     * </dd>
     * </dl>
     */
    private java.util.Map<String, String> providerDetails;
    /**
     * <p>
     * A mapping of IdP attributes to standard and custom user pool attributes.
     * </p>
     */
    private java.util.Map<String, String> attributeMapping;
    /**
     * <p>
     * A list of IdP identifiers.
     * </p>
     */
    private java.util.List<String> idpIdentifiers;
    /**
     * <p>
     * The date and time when the item was modified. Amazon Cognito returns this timestamp in UNIX epoch time format.
     * Your SDK might render the output in a human-readable format like ISO 8601 or a Java <code>Date</code> object.
     * </p>
     */
    private java.util.Date lastModifiedDate;
    /**
     * <p>
     * The date and time when the item was created. Amazon Cognito returns this timestamp in UNIX epoch time format.
     * Your SDK might render the output in a human-readable format like ISO 8601 or a Java <code>Date</code> object.
     * </p>
     */
    private java.util.Date creationDate;

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @return The user pool ID.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The IdP name.
     * </p>
     * 
     * @param providerName
     *        The IdP name.
     */

    public void setProviderName(String providerName) {
        this.providerName = providerName;
    }

    /**
     * <p>
     * The IdP name.
     * </p>
     * 
     * @return The IdP name.
     */

    public String getProviderName() {
        return this.providerName;
    }

    /**
     * <p>
     * The IdP name.
     * </p>
     * 
     * @param providerName
     *        The IdP name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withProviderName(String providerName) {
        setProviderName(providerName);
        return this;
    }

    /**
     * <p>
     * The IdP type.
     * </p>
     * 
     * @param providerType
     *        The IdP type.
     * @see IdentityProviderTypeType
     */

    public void setProviderType(String providerType) {
        this.providerType = providerType;
    }

    /**
     * <p>
     * The IdP type.
     * </p>
     * 
     * @return The IdP type.
     * @see IdentityProviderTypeType
     */

    public String getProviderType() {
        return this.providerType;
    }

    /**
     * <p>
     * The IdP type.
     * </p>
     * 
     * @param providerType
     *        The IdP type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderTypeType
     */

    public IdentityProviderType withProviderType(String providerType) {
        setProviderType(providerType);
        return this;
    }

    /**
     * <p>
     * The IdP type.
     * </p>
     * 
     * @param providerType
     *        The IdP type.
     * @see IdentityProviderTypeType
     */

    public void setProviderType(IdentityProviderTypeType providerType) {
        withProviderType(providerType);
    }

    /**
     * <p>
     * The IdP type.
     * </p>
     * 
     * @param providerType
     *        The IdP type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see IdentityProviderTypeType
     */

    public IdentityProviderType withProviderType(IdentityProviderTypeType providerType) {
        this.providerType = providerType.toString();
        return this;
    }

    /**
     * <p>
     * The scopes, URLs, and identifiers for your external identity provider. The following examples describe the
     * provider detail keys for each IdP type. These values and their schema are subject to change. Social IdP
     * <code>authorize_scopes</code> values must match the values listed here.
     * </p>
     * <dl>
     * <dt>OpenID Connect (OIDC)</dt>
     * <dd>
     * <p>
     * Amazon Cognito accepts the following elements when it can't discover endpoint URLs from <code>oidc_issuer</code>:
     * <code>attributes_url</code>, <code>authorize_url</code>, <code>jwks_uri</code>, <code>token_url</code>.
     * </p>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * </dd>
     * <dt>SAML</dt>
     * <dd>
     * <p>
     * Create or update request with Metadata URL:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * Create or update request with Metadata file:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * The value of <code>MetadataFile</code> must be the plaintext metadata document with all quote (") characters
     * escaped by backslashes.
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     * </p>
     * </dd>
     * <dt>LoginWithAmazon</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     * </p>
     * </dd>
     * <dt>Google</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     * </p>
     * </dd>
     * <dt>SignInWithApple</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     * </p>
     * </dd>
     * <dt>Facebook</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The scopes, URLs, and identifiers for your external identity provider. The following examples describe
     *         the provider detail keys for each IdP type. These values and their schema are subject to change. Social
     *         IdP <code>authorize_scopes</code> values must match the values listed here.</p>
     *         <dl>
     *         <dt>OpenID Connect (OIDC)</dt>
     *         <dd>
     *         <p>
     *         Amazon Cognito accepts the following elements when it can't discover endpoint URLs from
     *         <code>oidc_issuer</code>: <code>attributes_url</code>, <code>authorize_url</code>, <code>jwks_uri</code>,
     *         <code>token_url</code>.
     *         </p>
     *         <p>
     *         Create or update request:
     *         <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     *         </p>
     *         <p>
     *         Describe response:
     *         <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     *         </p>
     *         </dd>
     *         <dt>SAML</dt>
     *         <dd>
     *         <p>
     *         Create or update request with Metadata URL:
     *         <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     *         </p>
     *         <p>
     *         Create or update request with Metadata file:
     *         <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     *         </p>
     *         <p>
     *         The value of <code>MetadataFile</code> must be the plaintext metadata document with all quote (")
     *         characters escaped by backslashes.
     *         </p>
     *         <p>
     *         Describe response:
     *         <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     *         </p>
     *         </dd>
     *         <dt>LoginWithAmazon</dt>
     *         <dd>
     *         <p>
     *         Create or update request:
     *         <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     *         </p>
     *         <p>
     *         Describe response:
     *         <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     *         </p>
     *         </dd>
     *         <dt>Google</dt>
     *         <dd>
     *         <p>
     *         Create or update request:
     *         <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     *         </p>
     *         <p>
     *         Describe response:
     *         <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     *         </p>
     *         </dd>
     *         <dt>SignInWithApple</dt>
     *         <dd>
     *         <p>
     *         Create or update request:
     *         <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     *         </p>
     *         <p>
     *         Describe response:
     *         <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     *         </p>
     *         </dd>
     *         <dt>Facebook</dt>
     *         <dd>
     *         <p>
     *         Create or update request:
     *         <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     *         </p>
     *         <p>
     *         Describe response:
     *         <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     *         </p>
     *         </dd>
     */

    public java.util.Map<String, String> getProviderDetails() {
        return providerDetails;
    }

    /**
     * <p>
     * The scopes, URLs, and identifiers for your external identity provider. The following examples describe the
     * provider detail keys for each IdP type. These values and their schema are subject to change. Social IdP
     * <code>authorize_scopes</code> values must match the values listed here.
     * </p>
     * <dl>
     * <dt>OpenID Connect (OIDC)</dt>
     * <dd>
     * <p>
     * Amazon Cognito accepts the following elements when it can't discover endpoint URLs from <code>oidc_issuer</code>:
     * <code>attributes_url</code>, <code>authorize_url</code>, <code>jwks_uri</code>, <code>token_url</code>.
     * </p>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * </dd>
     * <dt>SAML</dt>
     * <dd>
     * <p>
     * Create or update request with Metadata URL:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * Create or update request with Metadata file:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * The value of <code>MetadataFile</code> must be the plaintext metadata document with all quote (") characters
     * escaped by backslashes.
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     * </p>
     * </dd>
     * <dt>LoginWithAmazon</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     * </p>
     * </dd>
     * <dt>Google</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     * </p>
     * </dd>
     * <dt>SignInWithApple</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     * </p>
     * </dd>
     * <dt>Facebook</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @param providerDetails
     *        The scopes, URLs, and identifiers for your external identity provider. The following examples describe the
     *        provider detail keys for each IdP type. These values and their schema are subject to change. Social IdP
     *        <code>authorize_scopes</code> values must match the values listed here.</p>
     *        <dl>
     *        <dt>OpenID Connect (OIDC)</dt>
     *        <dd>
     *        <p>
     *        Amazon Cognito accepts the following elements when it can't discover endpoint URLs from
     *        <code>oidc_issuer</code>: <code>attributes_url</code>, <code>authorize_url</code>, <code>jwks_uri</code>,
     *        <code>token_url</code>.
     *        </p>
     *        <p>
     *        Create or update request:
     *        <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     *        </p>
     *        <p>
     *        Describe response:
     *        <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     *        </p>
     *        </dd>
     *        <dt>SAML</dt>
     *        <dd>
     *        <p>
     *        Create or update request with Metadata URL:
     *        <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     *        </p>
     *        <p>
     *        Create or update request with Metadata file:
     *        <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     *        </p>
     *        <p>
     *        The value of <code>MetadataFile</code> must be the plaintext metadata document with all quote (")
     *        characters escaped by backslashes.
     *        </p>
     *        <p>
     *        Describe response:
     *        <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     *        </p>
     *        </dd>
     *        <dt>LoginWithAmazon</dt>
     *        <dd>
     *        <p>
     *        Create or update request:
     *        <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     *        </p>
     *        <p>
     *        Describe response:
     *        <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     *        </p>
     *        </dd>
     *        <dt>Google</dt>
     *        <dd>
     *        <p>
     *        Create or update request:
     *        <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     *        </p>
     *        <p>
     *        Describe response:
     *        <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     *        </p>
     *        </dd>
     *        <dt>SignInWithApple</dt>
     *        <dd>
     *        <p>
     *        Create or update request:
     *        <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     *        </p>
     *        <p>
     *        Describe response:
     *        <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     *        </p>
     *        </dd>
     *        <dt>Facebook</dt>
     *        <dd>
     *        <p>
     *        Create or update request:
     *        <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     *        </p>
     *        <p>
     *        Describe response:
     *        <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     *        </p>
     *        </dd>
     */

    public void setProviderDetails(java.util.Map<String, String> providerDetails) {
        this.providerDetails = providerDetails;
    }

    /**
     * <p>
     * The scopes, URLs, and identifiers for your external identity provider. The following examples describe the
     * provider detail keys for each IdP type. These values and their schema are subject to change. Social IdP
     * <code>authorize_scopes</code> values must match the values listed here.
     * </p>
     * <dl>
     * <dt>OpenID Connect (OIDC)</dt>
     * <dd>
     * <p>
     * Amazon Cognito accepts the following elements when it can't discover endpoint URLs from <code>oidc_issuer</code>:
     * <code>attributes_url</code>, <code>authorize_url</code>, <code>jwks_uri</code>, <code>token_url</code>.
     * </p>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     * </p>
     * </dd>
     * <dt>SAML</dt>
     * <dd>
     * <p>
     * Create or update request with Metadata URL:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * Create or update request with Metadata file:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     * </p>
     * <p>
     * The value of <code>MetadataFile</code> must be the plaintext metadata document with all quote (") characters
     * escaped by backslashes.
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     * </p>
     * </dd>
     * <dt>LoginWithAmazon</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     * </p>
     * </dd>
     * <dt>Google</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     * </p>
     * </dd>
     * <dt>SignInWithApple</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     * </p>
     * </dd>
     * <dt>Facebook</dt>
     * <dd>
     * <p>
     * Create or update request:
     * <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     * </p>
     * <p>
     * Describe response:
     * <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     * </p>
     * </dd>
     * </dl>
     * 
     * @param providerDetails
     *        The scopes, URLs, and identifiers for your external identity provider. The following examples describe the
     *        provider detail keys for each IdP type. These values and their schema are subject to change. Social IdP
     *        <code>authorize_scopes</code> values must match the values listed here.</p>
     *        <dl>
     *        <dt>OpenID Connect (OIDC)</dt>
     *        <dd>
     *        <p>
     *        Amazon Cognito accepts the following elements when it can't discover endpoint URLs from
     *        <code>oidc_issuer</code>: <code>attributes_url</code>, <code>authorize_url</code>, <code>jwks_uri</code>,
     *        <code>token_url</code>.
     *        </p>
     *        <p>
     *        Create or update request:
     *        <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     *        </p>
     *        <p>
     *        Describe response:
     *        <code>"ProviderDetails": { "attributes_request_method": "GET", "attributes_url": "https://auth.example.com/userInfo", "attributes_url_add_attributes": "false", "authorize_scopes": "openid profile email", "authorize_url": "https://auth.example.com/authorize", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "jwks_uri": "https://auth.example.com/.well-known/jwks.json", "oidc_issuer": "https://auth.example.com", "token_url": "https://example.com/token" }</code>
     *        </p>
     *        </dd>
     *        <dt>SAML</dt>
     *        <dd>
     *        <p>
     *        Create or update request with Metadata URL:
     *        <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     *        </p>
     *        <p>
     *        Create or update request with Metadata file:
     *        <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "MetadataFile": "[metadata XML]", "RequestSigningAlgorithm": "rsa-sha256" }</code>
     *        </p>
     *        <p>
     *        The value of <code>MetadataFile</code> must be the plaintext metadata document with all quote (")
     *        characters escaped by backslashes.
     *        </p>
     *        <p>
     *        Describe response:
     *        <code>"ProviderDetails": { "IDPInit": "true", "IDPSignout": "true", "EncryptedResponses" : "true", "ActiveEncryptionCertificate": "[certificate]", "MetadataURL": "https://auth.example.com/sso/saml/metadata", "RequestSigningAlgorithm": "rsa-sha256", "SLORedirectBindingURI": "https://auth.example.com/slo/saml", "SSORedirectBindingURI": "https://auth.example.com/sso/saml" }</code>
     *        </p>
     *        </dd>
     *        <dt>LoginWithAmazon</dt>
     *        <dd>
     *        <p>
     *        Create or update request:
     *        <code>"ProviderDetails": { "authorize_scopes": "profile postal_code", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret"</code>
     *        </p>
     *        <p>
     *        Describe response:
     *        <code>"ProviderDetails": { "attributes_url": "https://api.amazon.com/user/profile", "attributes_url_add_attributes": "false", "authorize_scopes": "profile postal_code", "authorize_url": "https://www.amazon.com/ap/oa", "client_id": "amzn1.application-oa2-client.1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "POST", "token_url": "https://api.amazon.com/auth/o2/token" }</code>
     *        </p>
     *        </dd>
     *        <dt>Google</dt>
     *        <dd>
     *        <p>
     *        Create or update request:
     *        <code>"ProviderDetails": { "authorize_scopes": "email profile openid", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret" }</code>
     *        </p>
     *        <p>
     *        Describe response:
     *        <code>"ProviderDetails": { "attributes_url": "https://people.googleapis.com/v1/people/me?personFields=", "attributes_url_add_attributes": "true", "authorize_scopes": "email profile openid", "authorize_url": "https://accounts.google.com/o/oauth2/v2/auth", "client_id": "1example23456789.apps.googleusercontent.com", "client_secret": "provider-app-client-secret", "oidc_issuer": "https://accounts.google.com", "token_request_method": "POST", "token_url": "https://www.googleapis.com/oauth2/v4/token" }</code>
     *        </p>
     *        </dd>
     *        <dt>SignInWithApple</dt>
     *        <dd>
     *        <p>
     *        Create or update request:
     *        <code>"ProviderDetails": { "authorize_scopes": "email name", "client_id": "com.example.cognito", "private_key": "1EXAMPLE", "key_id": "2EXAMPLE", "team_id": "3EXAMPLE" }</code>
     *        </p>
     *        <p>
     *        Describe response:
     *        <code>"ProviderDetails": { "attributes_url_add_attributes": "false", "authorize_scopes": "email name", "authorize_url": "https://appleid.apple.com/auth/authorize", "client_id": "com.example.cognito", "key_id": "1EXAMPLE", "oidc_issuer": "https://appleid.apple.com", "team_id": "2EXAMPLE", "token_request_method": "POST", "token_url": "https://appleid.apple.com/auth/token" }</code>
     *        </p>
     *        </dd>
     *        <dt>Facebook</dt>
     *        <dd>
     *        <p>
     *        Create or update request:
     *        <code>"ProviderDetails": { "api_version": "v17.0", "authorize_scopes": "public_profile, email", "client_id": "1example23456789", "client_secret": "provider-app-client-secret" }</code>
     *        </p>
     *        <p>
     *        Describe response:
     *        <code>"ProviderDetails": { "api_version": "v17.0", "attributes_url": "https://graph.facebook.com/v17.0/me?fields=", "attributes_url_add_attributes": "true", "authorize_scopes": "public_profile, email", "authorize_url": "https://www.facebook.com/v17.0/dialog/oauth", "client_id": "1example23456789", "client_secret": "provider-app-client-secret", "token_request_method": "GET", "token_url": "https://graph.facebook.com/v17.0/oauth/access_token" }</code>
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withProviderDetails(java.util.Map<String, String> providerDetails) {
        setProviderDetails(providerDetails);
        return this;
    }

    /**
     * Add a single ProviderDetails entry
     *
     * @see IdentityProviderType#withProviderDetails
     * @returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType addProviderDetailsEntry(String key, String value) {
        if (null == this.providerDetails) {
            this.providerDetails = new java.util.HashMap<String, String>();
        }
        if (this.providerDetails.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.providerDetails.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ProviderDetails.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType clearProviderDetailsEntries() {
        this.providerDetails = null;
        return this;
    }

    /**
     * <p>
     * A mapping of IdP attributes to standard and custom user pool attributes.
     * </p>
     * 
     * @return A mapping of IdP attributes to standard and custom user pool attributes.
     */

    public java.util.Map<String, String> getAttributeMapping() {
        return attributeMapping;
    }

    /**
     * <p>
     * A mapping of IdP attributes to standard and custom user pool attributes.
     * </p>
     * 
     * @param attributeMapping
     *        A mapping of IdP attributes to standard and custom user pool attributes.
     */

    public void setAttributeMapping(java.util.Map<String, String> attributeMapping) {
        this.attributeMapping = attributeMapping;
    }

    /**
     * <p>
     * A mapping of IdP attributes to standard and custom user pool attributes.
     * </p>
     * 
     * @param attributeMapping
     *        A mapping of IdP attributes to standard and custom user pool attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withAttributeMapping(java.util.Map<String, String> attributeMapping) {
        setAttributeMapping(attributeMapping);
        return this;
    }

    /**
     * Add a single AttributeMapping entry
     *
     * @see IdentityProviderType#withAttributeMapping
     * @returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType addAttributeMappingEntry(String key, String value) {
        if (null == this.attributeMapping) {
            this.attributeMapping = new java.util.HashMap<String, String>();
        }
        if (this.attributeMapping.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.attributeMapping.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into AttributeMapping.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType clearAttributeMappingEntries() {
        this.attributeMapping = null;
        return this;
    }

    /**
     * <p>
     * A list of IdP identifiers.
     * </p>
     * 
     * @return A list of IdP identifiers.
     */

    public java.util.List<String> getIdpIdentifiers() {
        return idpIdentifiers;
    }

    /**
     * <p>
     * A list of IdP identifiers.
     * </p>
     * 
     * @param idpIdentifiers
     *        A list of IdP identifiers.
     */

    public void setIdpIdentifiers(java.util.Collection<String> idpIdentifiers) {
        if (idpIdentifiers == null) {
            this.idpIdentifiers = null;
            return;
        }

        this.idpIdentifiers = new java.util.ArrayList<String>(idpIdentifiers);
    }

    /**
     * <p>
     * A list of IdP identifiers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIdpIdentifiers(java.util.Collection)} or {@link #withIdpIdentifiers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param idpIdentifiers
     *        A list of IdP identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withIdpIdentifiers(String... idpIdentifiers) {
        if (this.idpIdentifiers == null) {
            setIdpIdentifiers(new java.util.ArrayList<String>(idpIdentifiers.length));
        }
        for (String ele : idpIdentifiers) {
            this.idpIdentifiers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of IdP identifiers.
     * </p>
     * 
     * @param idpIdentifiers
     *        A list of IdP identifiers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withIdpIdentifiers(java.util.Collection<String> idpIdentifiers) {
        setIdpIdentifiers(idpIdentifiers);
        return this;
    }

    /**
     * <p>
     * The date and time when the item was modified. Amazon Cognito returns this timestamp in UNIX epoch time format.
     * Your SDK might render the output in a human-readable format like ISO 8601 or a Java <code>Date</code> object.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time when the item was modified. Amazon Cognito returns this timestamp in UNIX epoch time
     *        format. Your SDK might render the output in a human-readable format like ISO 8601 or a Java
     *        <code>Date</code> object.
     */

    public void setLastModifiedDate(java.util.Date lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the item was modified. Amazon Cognito returns this timestamp in UNIX epoch time format.
     * Your SDK might render the output in a human-readable format like ISO 8601 or a Java <code>Date</code> object.
     * </p>
     * 
     * @return The date and time when the item was modified. Amazon Cognito returns this timestamp in UNIX epoch time
     *         format. Your SDK might render the output in a human-readable format like ISO 8601 or a Java
     *         <code>Date</code> object.
     */

    public java.util.Date getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    /**
     * <p>
     * The date and time when the item was modified. Amazon Cognito returns this timestamp in UNIX epoch time format.
     * Your SDK might render the output in a human-readable format like ISO 8601 or a Java <code>Date</code> object.
     * </p>
     * 
     * @param lastModifiedDate
     *        The date and time when the item was modified. Amazon Cognito returns this timestamp in UNIX epoch time
     *        format. Your SDK might render the output in a human-readable format like ISO 8601 or a Java
     *        <code>Date</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withLastModifiedDate(java.util.Date lastModifiedDate) {
        setLastModifiedDate(lastModifiedDate);
        return this;
    }

    /**
     * <p>
     * The date and time when the item was created. Amazon Cognito returns this timestamp in UNIX epoch time format.
     * Your SDK might render the output in a human-readable format like ISO 8601 or a Java <code>Date</code> object.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the item was created. Amazon Cognito returns this timestamp in UNIX epoch time
     *        format. Your SDK might render the output in a human-readable format like ISO 8601 or a Java
     *        <code>Date</code> object.
     */

    public void setCreationDate(java.util.Date creationDate) {
        this.creationDate = creationDate;
    }

    /**
     * <p>
     * The date and time when the item was created. Amazon Cognito returns this timestamp in UNIX epoch time format.
     * Your SDK might render the output in a human-readable format like ISO 8601 or a Java <code>Date</code> object.
     * </p>
     * 
     * @return The date and time when the item was created. Amazon Cognito returns this timestamp in UNIX epoch time
     *         format. Your SDK might render the output in a human-readable format like ISO 8601 or a Java
     *         <code>Date</code> object.
     */

    public java.util.Date getCreationDate() {
        return this.creationDate;
    }

    /**
     * <p>
     * The date and time when the item was created. Amazon Cognito returns this timestamp in UNIX epoch time format.
     * Your SDK might render the output in a human-readable format like ISO 8601 or a Java <code>Date</code> object.
     * </p>
     * 
     * @param creationDate
     *        The date and time when the item was created. Amazon Cognito returns this timestamp in UNIX epoch time
     *        format. Your SDK might render the output in a human-readable format like ISO 8601 or a Java
     *        <code>Date</code> object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IdentityProviderType withCreationDate(java.util.Date creationDate) {
        setCreationDate(creationDate);
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
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getProviderName() != null)
            sb.append("ProviderName: ").append(getProviderName()).append(",");
        if (getProviderType() != null)
            sb.append("ProviderType: ").append(getProviderType()).append(",");
        if (getProviderDetails() != null)
            sb.append("ProviderDetails: ").append(getProviderDetails()).append(",");
        if (getAttributeMapping() != null)
            sb.append("AttributeMapping: ").append(getAttributeMapping()).append(",");
        if (getIdpIdentifiers() != null)
            sb.append("IdpIdentifiers: ").append(getIdpIdentifiers()).append(",");
        if (getLastModifiedDate() != null)
            sb.append("LastModifiedDate: ").append(getLastModifiedDate()).append(",");
        if (getCreationDate() != null)
            sb.append("CreationDate: ").append(getCreationDate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IdentityProviderType == false)
            return false;
        IdentityProviderType other = (IdentityProviderType) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getProviderName() == null ^ this.getProviderName() == null)
            return false;
        if (other.getProviderName() != null && other.getProviderName().equals(this.getProviderName()) == false)
            return false;
        if (other.getProviderType() == null ^ this.getProviderType() == null)
            return false;
        if (other.getProviderType() != null && other.getProviderType().equals(this.getProviderType()) == false)
            return false;
        if (other.getProviderDetails() == null ^ this.getProviderDetails() == null)
            return false;
        if (other.getProviderDetails() != null && other.getProviderDetails().equals(this.getProviderDetails()) == false)
            return false;
        if (other.getAttributeMapping() == null ^ this.getAttributeMapping() == null)
            return false;
        if (other.getAttributeMapping() != null && other.getAttributeMapping().equals(this.getAttributeMapping()) == false)
            return false;
        if (other.getIdpIdentifiers() == null ^ this.getIdpIdentifiers() == null)
            return false;
        if (other.getIdpIdentifiers() != null && other.getIdpIdentifiers().equals(this.getIdpIdentifiers()) == false)
            return false;
        if (other.getLastModifiedDate() == null ^ this.getLastModifiedDate() == null)
            return false;
        if (other.getLastModifiedDate() != null && other.getLastModifiedDate().equals(this.getLastModifiedDate()) == false)
            return false;
        if (other.getCreationDate() == null ^ this.getCreationDate() == null)
            return false;
        if (other.getCreationDate() != null && other.getCreationDate().equals(this.getCreationDate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getProviderName() == null) ? 0 : getProviderName().hashCode());
        hashCode = prime * hashCode + ((getProviderType() == null) ? 0 : getProviderType().hashCode());
        hashCode = prime * hashCode + ((getProviderDetails() == null) ? 0 : getProviderDetails().hashCode());
        hashCode = prime * hashCode + ((getAttributeMapping() == null) ? 0 : getAttributeMapping().hashCode());
        hashCode = prime * hashCode + ((getIdpIdentifiers() == null) ? 0 : getIdpIdentifiers().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedDate() == null) ? 0 : getLastModifiedDate().hashCode());
        hashCode = prime * hashCode + ((getCreationDate() == null) ? 0 : getCreationDate().hashCode());
        return hashCode;
    }

    @Override
    public IdentityProviderType clone() {
        try {
            return (IdentityProviderType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cognitoidp.model.transform.IdentityProviderTypeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
