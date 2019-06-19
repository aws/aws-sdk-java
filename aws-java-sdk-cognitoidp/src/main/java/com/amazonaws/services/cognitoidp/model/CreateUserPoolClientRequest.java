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
package com.amazonaws.services.cognitoidp.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the request to create a user pool client.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cognito-idp-2016-04-18/CreateUserPoolClient" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateUserPoolClientRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool client.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     */
    private String clientName;
    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user pool client being created.
     * </p>
     */
    private Boolean generateSecret;
    /**
     * <p>
     * The time limit, in days, after which the refresh token is no longer valid and cannot be used.
     * </p>
     */
    private Integer refreshTokenValidity;
    /**
     * <p>
     * The read attributes.
     * </p>
     */
    private java.util.List<String> readAttributes;
    /**
     * <p>
     * The user pool attributes that the app client can write to.
     * </p>
     * <p>
     * If your app client allows users to sign in through an identity provider, this array must include all attributes
     * that are mapped to identity provider attributes. Amazon Cognito updates mapped attributes when users sign in to
     * your application through an identity provider. If your app client lacks write access to a mapped attribute,
     * Amazon Cognito throws an error when it attempts to update the attribute. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     */
    private java.util.List<String> writeAttributes;
    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     */
    private java.util.List<String> explicitAuthFlows;
    /**
     * <p>
     * A list of provider names for the identity providers that are supported on this client. The following are
     * supported: <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code> and <code>LoginWithAmazon</code>.
     * </p>
     */
    private java.util.List<String> supportedIdentityProviders;
    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the identity providers.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     */
    private java.util.List<String> callbackURLs;
    /**
     * <p>
     * A list of allowed logout URLs for the identity providers.
     * </p>
     */
    private java.util.List<String> logoutURLs;
    /**
     * <p>
     * The default redirect URI. Must be in the <code>CallbackURLs</code> list.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     */
    private String defaultRedirectURI;
    /**
     * <p>
     * Set to <code>code</code> to initiate a code grant flow, which provides an authorization code as the response.
     * This code can be exchanged for access tokens with the token endpoint.
     * </p>
     * <p>
     * Set to <code>token</code> to specify that the client should get the access token (and, optionally, ID token,
     * based on scopes) directly.
     * </p>
     */
    private java.util.List<String> allowedOAuthFlows;
    /**
     * <p>
     * A list of allowed <code>OAuth</code> scopes. Currently supported values are <code>"phone"</code>,
     * <code>"email"</code>, <code>"openid"</code>, and <code>"Cognito"</code>.
     * </p>
     */
    private java.util.List<String> allowedOAuthScopes;
    /**
     * <p>
     * Set to <code>True</code> if the client is allowed to follow the OAuth protocol when interacting with Cognito user
     * pools.
     * </p>
     */
    private Boolean allowedOAuthFlowsUserPoolClient;
    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
     * </p>
     */
    private AnalyticsConfigurationType analyticsConfiguration;

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool client.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to create a user pool client.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool client.
     * </p>
     * 
     * @return The user pool ID for the user pool where you want to create a user pool client.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The user pool ID for the user pool where you want to create a user pool client.
     * </p>
     * 
     * @param userPoolId
     *        The user pool ID for the user pool where you want to create a user pool client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * 
     * @param clientName
     *        The client name for the user pool client you would like to create.
     */

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * 
     * @return The client name for the user pool client you would like to create.
     */

    public String getClientName() {
        return this.clientName;
    }

    /**
     * <p>
     * The client name for the user pool client you would like to create.
     * </p>
     * 
     * @param clientName
     *        The client name for the user pool client you would like to create.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withClientName(String clientName) {
        setClientName(clientName);
        return this;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user pool client being created.
     * </p>
     * 
     * @param generateSecret
     *        Boolean to specify whether you want to generate a secret for the user pool client being created.
     */

    public void setGenerateSecret(Boolean generateSecret) {
        this.generateSecret = generateSecret;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user pool client being created.
     * </p>
     * 
     * @return Boolean to specify whether you want to generate a secret for the user pool client being created.
     */

    public Boolean getGenerateSecret() {
        return this.generateSecret;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user pool client being created.
     * </p>
     * 
     * @param generateSecret
     *        Boolean to specify whether you want to generate a secret for the user pool client being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withGenerateSecret(Boolean generateSecret) {
        setGenerateSecret(generateSecret);
        return this;
    }

    /**
     * <p>
     * Boolean to specify whether you want to generate a secret for the user pool client being created.
     * </p>
     * 
     * @return Boolean to specify whether you want to generate a secret for the user pool client being created.
     */

    public Boolean isGenerateSecret() {
        return this.generateSecret;
    }

    /**
     * <p>
     * The time limit, in days, after which the refresh token is no longer valid and cannot be used.
     * </p>
     * 
     * @param refreshTokenValidity
     *        The time limit, in days, after which the refresh token is no longer valid and cannot be used.
     */

    public void setRefreshTokenValidity(Integer refreshTokenValidity) {
        this.refreshTokenValidity = refreshTokenValidity;
    }

    /**
     * <p>
     * The time limit, in days, after which the refresh token is no longer valid and cannot be used.
     * </p>
     * 
     * @return The time limit, in days, after which the refresh token is no longer valid and cannot be used.
     */

    public Integer getRefreshTokenValidity() {
        return this.refreshTokenValidity;
    }

    /**
     * <p>
     * The time limit, in days, after which the refresh token is no longer valid and cannot be used.
     * </p>
     * 
     * @param refreshTokenValidity
     *        The time limit, in days, after which the refresh token is no longer valid and cannot be used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withRefreshTokenValidity(Integer refreshTokenValidity) {
        setRefreshTokenValidity(refreshTokenValidity);
        return this;
    }

    /**
     * <p>
     * The read attributes.
     * </p>
     * 
     * @return The read attributes.
     */

    public java.util.List<String> getReadAttributes() {
        return readAttributes;
    }

    /**
     * <p>
     * The read attributes.
     * </p>
     * 
     * @param readAttributes
     *        The read attributes.
     */

    public void setReadAttributes(java.util.Collection<String> readAttributes) {
        if (readAttributes == null) {
            this.readAttributes = null;
            return;
        }

        this.readAttributes = new java.util.ArrayList<String>(readAttributes);
    }

    /**
     * <p>
     * The read attributes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setReadAttributes(java.util.Collection)} or {@link #withReadAttributes(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param readAttributes
     *        The read attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withReadAttributes(String... readAttributes) {
        if (this.readAttributes == null) {
            setReadAttributes(new java.util.ArrayList<String>(readAttributes.length));
        }
        for (String ele : readAttributes) {
            this.readAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The read attributes.
     * </p>
     * 
     * @param readAttributes
     *        The read attributes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withReadAttributes(java.util.Collection<String> readAttributes) {
        setReadAttributes(readAttributes);
        return this;
    }

    /**
     * <p>
     * The user pool attributes that the app client can write to.
     * </p>
     * <p>
     * If your app client allows users to sign in through an identity provider, this array must include all attributes
     * that are mapped to identity provider attributes. Amazon Cognito updates mapped attributes when users sign in to
     * your application through an identity provider. If your app client lacks write access to a mapped attribute,
     * Amazon Cognito throws an error when it attempts to update the attribute. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     * 
     * @return The user pool attributes that the app client can write to.</p>
     *         <p>
     *         If your app client allows users to sign in through an identity provider, this array must include all
     *         attributes that are mapped to identity provider attributes. Amazon Cognito updates mapped attributes when
     *         users sign in to your application through an identity provider. If your app client lacks write access to
     *         a mapped attribute, Amazon Cognito throws an error when it attempts to update the attribute. For more
     *         information, see <a href=
     *         "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     *         >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     */

    public java.util.List<String> getWriteAttributes() {
        return writeAttributes;
    }

    /**
     * <p>
     * The user pool attributes that the app client can write to.
     * </p>
     * <p>
     * If your app client allows users to sign in through an identity provider, this array must include all attributes
     * that are mapped to identity provider attributes. Amazon Cognito updates mapped attributes when users sign in to
     * your application through an identity provider. If your app client lacks write access to a mapped attribute,
     * Amazon Cognito throws an error when it attempts to update the attribute. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     * 
     * @param writeAttributes
     *        The user pool attributes that the app client can write to.</p>
     *        <p>
     *        If your app client allows users to sign in through an identity provider, this array must include all
     *        attributes that are mapped to identity provider attributes. Amazon Cognito updates mapped attributes when
     *        users sign in to your application through an identity provider. If your app client lacks write access to a
     *        mapped attribute, Amazon Cognito throws an error when it attempts to update the attribute. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     *        >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     */

    public void setWriteAttributes(java.util.Collection<String> writeAttributes) {
        if (writeAttributes == null) {
            this.writeAttributes = null;
            return;
        }

        this.writeAttributes = new java.util.ArrayList<String>(writeAttributes);
    }

    /**
     * <p>
     * The user pool attributes that the app client can write to.
     * </p>
     * <p>
     * If your app client allows users to sign in through an identity provider, this array must include all attributes
     * that are mapped to identity provider attributes. Amazon Cognito updates mapped attributes when users sign in to
     * your application through an identity provider. If your app client lacks write access to a mapped attribute,
     * Amazon Cognito throws an error when it attempts to update the attribute. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setWriteAttributes(java.util.Collection)} or {@link #withWriteAttributes(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param writeAttributes
     *        The user pool attributes that the app client can write to.</p>
     *        <p>
     *        If your app client allows users to sign in through an identity provider, this array must include all
     *        attributes that are mapped to identity provider attributes. Amazon Cognito updates mapped attributes when
     *        users sign in to your application through an identity provider. If your app client lacks write access to a
     *        mapped attribute, Amazon Cognito throws an error when it attempts to update the attribute. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     *        >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withWriteAttributes(String... writeAttributes) {
        if (this.writeAttributes == null) {
            setWriteAttributes(new java.util.ArrayList<String>(writeAttributes.length));
        }
        for (String ele : writeAttributes) {
            this.writeAttributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user pool attributes that the app client can write to.
     * </p>
     * <p>
     * If your app client allows users to sign in through an identity provider, this array must include all attributes
     * that are mapped to identity provider attributes. Amazon Cognito updates mapped attributes when users sign in to
     * your application through an identity provider. If your app client lacks write access to a mapped attribute,
     * Amazon Cognito throws an error when it attempts to update the attribute. For more information, see <a href=
     * "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     * >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * </p>
     * 
     * @param writeAttributes
     *        The user pool attributes that the app client can write to.</p>
     *        <p>
     *        If your app client allows users to sign in through an identity provider, this array must include all
     *        attributes that are mapped to identity provider attributes. Amazon Cognito updates mapped attributes when
     *        users sign in to your application through an identity provider. If your app client lacks write access to a
     *        mapped attribute, Amazon Cognito throws an error when it attempts to update the attribute. For more
     *        information, see <a href=
     *        "https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-specifying-attribute-mapping.html"
     *        >Specifying Identity Provider Attribute Mappings for Your User Pool</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withWriteAttributes(java.util.Collection<String> writeAttributes) {
        setWriteAttributes(writeAttributes);
        return this;
    }

    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     * 
     * @return The explicit authentication flows.
     * @see ExplicitAuthFlowsType
     */

    public java.util.List<String> getExplicitAuthFlows() {
        return explicitAuthFlows;
    }

    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     * 
     * @param explicitAuthFlows
     *        The explicit authentication flows.
     * @see ExplicitAuthFlowsType
     */

    public void setExplicitAuthFlows(java.util.Collection<String> explicitAuthFlows) {
        if (explicitAuthFlows == null) {
            this.explicitAuthFlows = null;
            return;
        }

        this.explicitAuthFlows = new java.util.ArrayList<String>(explicitAuthFlows);
    }

    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExplicitAuthFlows(java.util.Collection)} or {@link #withExplicitAuthFlows(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param explicitAuthFlows
     *        The explicit authentication flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExplicitAuthFlowsType
     */

    public CreateUserPoolClientRequest withExplicitAuthFlows(String... explicitAuthFlows) {
        if (this.explicitAuthFlows == null) {
            setExplicitAuthFlows(new java.util.ArrayList<String>(explicitAuthFlows.length));
        }
        for (String ele : explicitAuthFlows) {
            this.explicitAuthFlows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     * 
     * @param explicitAuthFlows
     *        The explicit authentication flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExplicitAuthFlowsType
     */

    public CreateUserPoolClientRequest withExplicitAuthFlows(java.util.Collection<String> explicitAuthFlows) {
        setExplicitAuthFlows(explicitAuthFlows);
        return this;
    }

    /**
     * <p>
     * The explicit authentication flows.
     * </p>
     * 
     * @param explicitAuthFlows
     *        The explicit authentication flows.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExplicitAuthFlowsType
     */

    public CreateUserPoolClientRequest withExplicitAuthFlows(ExplicitAuthFlowsType... explicitAuthFlows) {
        java.util.ArrayList<String> explicitAuthFlowsCopy = new java.util.ArrayList<String>(explicitAuthFlows.length);
        for (ExplicitAuthFlowsType value : explicitAuthFlows) {
            explicitAuthFlowsCopy.add(value.toString());
        }
        if (getExplicitAuthFlows() == null) {
            setExplicitAuthFlows(explicitAuthFlowsCopy);
        } else {
            getExplicitAuthFlows().addAll(explicitAuthFlowsCopy);
        }
        return this;
    }

    /**
     * <p>
     * A list of provider names for the identity providers that are supported on this client. The following are
     * supported: <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code> and <code>LoginWithAmazon</code>.
     * </p>
     * 
     * @return A list of provider names for the identity providers that are supported on this client. The following are
     *         supported: <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code> and
     *         <code>LoginWithAmazon</code>.
     */

    public java.util.List<String> getSupportedIdentityProviders() {
        return supportedIdentityProviders;
    }

    /**
     * <p>
     * A list of provider names for the identity providers that are supported on this client. The following are
     * supported: <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code> and <code>LoginWithAmazon</code>.
     * </p>
     * 
     * @param supportedIdentityProviders
     *        A list of provider names for the identity providers that are supported on this client. The following are
     *        supported: <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code> and
     *        <code>LoginWithAmazon</code>.
     */

    public void setSupportedIdentityProviders(java.util.Collection<String> supportedIdentityProviders) {
        if (supportedIdentityProviders == null) {
            this.supportedIdentityProviders = null;
            return;
        }

        this.supportedIdentityProviders = new java.util.ArrayList<String>(supportedIdentityProviders);
    }

    /**
     * <p>
     * A list of provider names for the identity providers that are supported on this client. The following are
     * supported: <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code> and <code>LoginWithAmazon</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedIdentityProviders(java.util.Collection)} or
     * {@link #withSupportedIdentityProviders(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param supportedIdentityProviders
     *        A list of provider names for the identity providers that are supported on this client. The following are
     *        supported: <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code> and
     *        <code>LoginWithAmazon</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withSupportedIdentityProviders(String... supportedIdentityProviders) {
        if (this.supportedIdentityProviders == null) {
            setSupportedIdentityProviders(new java.util.ArrayList<String>(supportedIdentityProviders.length));
        }
        for (String ele : supportedIdentityProviders) {
            this.supportedIdentityProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of provider names for the identity providers that are supported on this client. The following are
     * supported: <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code> and <code>LoginWithAmazon</code>.
     * </p>
     * 
     * @param supportedIdentityProviders
     *        A list of provider names for the identity providers that are supported on this client. The following are
     *        supported: <code>COGNITO</code>, <code>Facebook</code>, <code>Google</code> and
     *        <code>LoginWithAmazon</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withSupportedIdentityProviders(java.util.Collection<String> supportedIdentityProviders) {
        setSupportedIdentityProviders(supportedIdentityProviders);
        return this;
    }

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the identity providers.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * 
     * @return A list of allowed redirect (callback) URLs for the identity providers.</p>
     *         <p>
     *         A redirect URI must:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Be an absolute URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be registered with the authorization server.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not include a fragment component.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     *         </p>
     *         <p>
     *         Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     *         </p>
     *         <p>
     *         App callback URLs such as myapp://example are also supported.
     */

    public java.util.List<String> getCallbackURLs() {
        return callbackURLs;
    }

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the identity providers.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * 
     * @param callbackURLs
     *        A list of allowed redirect (callback) URLs for the identity providers.</p>
     *        <p>
     *        A redirect URI must:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Be an absolute URI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be registered with the authorization server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not include a fragment component.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     *        </p>
     *        <p>
     *        Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     *        </p>
     *        <p>
     *        App callback URLs such as myapp://example are also supported.
     */

    public void setCallbackURLs(java.util.Collection<String> callbackURLs) {
        if (callbackURLs == null) {
            this.callbackURLs = null;
            return;
        }

        this.callbackURLs = new java.util.ArrayList<String>(callbackURLs);
    }

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the identity providers.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCallbackURLs(java.util.Collection)} or {@link #withCallbackURLs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param callbackURLs
     *        A list of allowed redirect (callback) URLs for the identity providers.</p>
     *        <p>
     *        A redirect URI must:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Be an absolute URI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be registered with the authorization server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not include a fragment component.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     *        </p>
     *        <p>
     *        Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     *        </p>
     *        <p>
     *        App callback URLs such as myapp://example are also supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withCallbackURLs(String... callbackURLs) {
        if (this.callbackURLs == null) {
            setCallbackURLs(new java.util.ArrayList<String>(callbackURLs.length));
        }
        for (String ele : callbackURLs) {
            this.callbackURLs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of allowed redirect (callback) URLs for the identity providers.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * 
     * @param callbackURLs
     *        A list of allowed redirect (callback) URLs for the identity providers.</p>
     *        <p>
     *        A redirect URI must:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Be an absolute URI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be registered with the authorization server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not include a fragment component.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     *        </p>
     *        <p>
     *        Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     *        </p>
     *        <p>
     *        App callback URLs such as myapp://example are also supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withCallbackURLs(java.util.Collection<String> callbackURLs) {
        setCallbackURLs(callbackURLs);
        return this;
    }

    /**
     * <p>
     * A list of allowed logout URLs for the identity providers.
     * </p>
     * 
     * @return A list of allowed logout URLs for the identity providers.
     */

    public java.util.List<String> getLogoutURLs() {
        return logoutURLs;
    }

    /**
     * <p>
     * A list of allowed logout URLs for the identity providers.
     * </p>
     * 
     * @param logoutURLs
     *        A list of allowed logout URLs for the identity providers.
     */

    public void setLogoutURLs(java.util.Collection<String> logoutURLs) {
        if (logoutURLs == null) {
            this.logoutURLs = null;
            return;
        }

        this.logoutURLs = new java.util.ArrayList<String>(logoutURLs);
    }

    /**
     * <p>
     * A list of allowed logout URLs for the identity providers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLogoutURLs(java.util.Collection)} or {@link #withLogoutURLs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param logoutURLs
     *        A list of allowed logout URLs for the identity providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withLogoutURLs(String... logoutURLs) {
        if (this.logoutURLs == null) {
            setLogoutURLs(new java.util.ArrayList<String>(logoutURLs.length));
        }
        for (String ele : logoutURLs) {
            this.logoutURLs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of allowed logout URLs for the identity providers.
     * </p>
     * 
     * @param logoutURLs
     *        A list of allowed logout URLs for the identity providers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withLogoutURLs(java.util.Collection<String> logoutURLs) {
        setLogoutURLs(logoutURLs);
        return this;
    }

    /**
     * <p>
     * The default redirect URI. Must be in the <code>CallbackURLs</code> list.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * 
     * @param defaultRedirectURI
     *        The default redirect URI. Must be in the <code>CallbackURLs</code> list.</p>
     *        <p>
     *        A redirect URI must:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Be an absolute URI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be registered with the authorization server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not include a fragment component.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     *        </p>
     *        <p>
     *        Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     *        </p>
     *        <p>
     *        App callback URLs such as myapp://example are also supported.
     */

    public void setDefaultRedirectURI(String defaultRedirectURI) {
        this.defaultRedirectURI = defaultRedirectURI;
    }

    /**
     * <p>
     * The default redirect URI. Must be in the <code>CallbackURLs</code> list.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * 
     * @return The default redirect URI. Must be in the <code>CallbackURLs</code> list.</p>
     *         <p>
     *         A redirect URI must:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Be an absolute URI.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Be registered with the authorization server.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Not include a fragment component.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     *         </p>
     *         <p>
     *         Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     *         </p>
     *         <p>
     *         App callback URLs such as myapp://example are also supported.
     */

    public String getDefaultRedirectURI() {
        return this.defaultRedirectURI;
    }

    /**
     * <p>
     * The default redirect URI. Must be in the <code>CallbackURLs</code> list.
     * </p>
     * <p>
     * A redirect URI must:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Be an absolute URI.
     * </p>
     * </li>
     * <li>
     * <p>
     * Be registered with the authorization server.
     * </p>
     * </li>
     * <li>
     * <p>
     * Not include a fragment component.
     * </p>
     * </li>
     * </ul>
     * <p>
     * See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     * </p>
     * <p>
     * Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     * </p>
     * <p>
     * App callback URLs such as myapp://example are also supported.
     * </p>
     * 
     * @param defaultRedirectURI
     *        The default redirect URI. Must be in the <code>CallbackURLs</code> list.</p>
     *        <p>
     *        A redirect URI must:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Be an absolute URI.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Be registered with the authorization server.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Not include a fragment component.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        See <a href="https://tools.ietf.org/html/rfc6749#section-3.1.2">OAuth 2.0 - Redirection Endpoint</a>.
     *        </p>
     *        <p>
     *        Amazon Cognito requires HTTPS over HTTP except for http://localhost for testing purposes only.
     *        </p>
     *        <p>
     *        App callback URLs such as myapp://example are also supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withDefaultRedirectURI(String defaultRedirectURI) {
        setDefaultRedirectURI(defaultRedirectURI);
        return this;
    }

    /**
     * <p>
     * Set to <code>code</code> to initiate a code grant flow, which provides an authorization code as the response.
     * This code can be exchanged for access tokens with the token endpoint.
     * </p>
     * <p>
     * Set to <code>token</code> to specify that the client should get the access token (and, optionally, ID token,
     * based on scopes) directly.
     * </p>
     * 
     * @return Set to <code>code</code> to initiate a code grant flow, which provides an authorization code as the
     *         response. This code can be exchanged for access tokens with the token endpoint.</p>
     *         <p>
     *         Set to <code>token</code> to specify that the client should get the access token (and, optionally, ID
     *         token, based on scopes) directly.
     * @see OAuthFlowType
     */

    public java.util.List<String> getAllowedOAuthFlows() {
        return allowedOAuthFlows;
    }

    /**
     * <p>
     * Set to <code>code</code> to initiate a code grant flow, which provides an authorization code as the response.
     * This code can be exchanged for access tokens with the token endpoint.
     * </p>
     * <p>
     * Set to <code>token</code> to specify that the client should get the access token (and, optionally, ID token,
     * based on scopes) directly.
     * </p>
     * 
     * @param allowedOAuthFlows
     *        Set to <code>code</code> to initiate a code grant flow, which provides an authorization code as the
     *        response. This code can be exchanged for access tokens with the token endpoint.</p>
     *        <p>
     *        Set to <code>token</code> to specify that the client should get the access token (and, optionally, ID
     *        token, based on scopes) directly.
     * @see OAuthFlowType
     */

    public void setAllowedOAuthFlows(java.util.Collection<String> allowedOAuthFlows) {
        if (allowedOAuthFlows == null) {
            this.allowedOAuthFlows = null;
            return;
        }

        this.allowedOAuthFlows = new java.util.ArrayList<String>(allowedOAuthFlows);
    }

    /**
     * <p>
     * Set to <code>code</code> to initiate a code grant flow, which provides an authorization code as the response.
     * This code can be exchanged for access tokens with the token endpoint.
     * </p>
     * <p>
     * Set to <code>token</code> to specify that the client should get the access token (and, optionally, ID token,
     * based on scopes) directly.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedOAuthFlows(java.util.Collection)} or {@link #withAllowedOAuthFlows(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param allowedOAuthFlows
     *        Set to <code>code</code> to initiate a code grant flow, which provides an authorization code as the
     *        response. This code can be exchanged for access tokens with the token endpoint.</p>
     *        <p>
     *        Set to <code>token</code> to specify that the client should get the access token (and, optionally, ID
     *        token, based on scopes) directly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuthFlowType
     */

    public CreateUserPoolClientRequest withAllowedOAuthFlows(String... allowedOAuthFlows) {
        if (this.allowedOAuthFlows == null) {
            setAllowedOAuthFlows(new java.util.ArrayList<String>(allowedOAuthFlows.length));
        }
        for (String ele : allowedOAuthFlows) {
            this.allowedOAuthFlows.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Set to <code>code</code> to initiate a code grant flow, which provides an authorization code as the response.
     * This code can be exchanged for access tokens with the token endpoint.
     * </p>
     * <p>
     * Set to <code>token</code> to specify that the client should get the access token (and, optionally, ID token,
     * based on scopes) directly.
     * </p>
     * 
     * @param allowedOAuthFlows
     *        Set to <code>code</code> to initiate a code grant flow, which provides an authorization code as the
     *        response. This code can be exchanged for access tokens with the token endpoint.</p>
     *        <p>
     *        Set to <code>token</code> to specify that the client should get the access token (and, optionally, ID
     *        token, based on scopes) directly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuthFlowType
     */

    public CreateUserPoolClientRequest withAllowedOAuthFlows(java.util.Collection<String> allowedOAuthFlows) {
        setAllowedOAuthFlows(allowedOAuthFlows);
        return this;
    }

    /**
     * <p>
     * Set to <code>code</code> to initiate a code grant flow, which provides an authorization code as the response.
     * This code can be exchanged for access tokens with the token endpoint.
     * </p>
     * <p>
     * Set to <code>token</code> to specify that the client should get the access token (and, optionally, ID token,
     * based on scopes) directly.
     * </p>
     * 
     * @param allowedOAuthFlows
     *        Set to <code>code</code> to initiate a code grant flow, which provides an authorization code as the
     *        response. This code can be exchanged for access tokens with the token endpoint.</p>
     *        <p>
     *        Set to <code>token</code> to specify that the client should get the access token (and, optionally, ID
     *        token, based on scopes) directly.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see OAuthFlowType
     */

    public CreateUserPoolClientRequest withAllowedOAuthFlows(OAuthFlowType... allowedOAuthFlows) {
        java.util.ArrayList<String> allowedOAuthFlowsCopy = new java.util.ArrayList<String>(allowedOAuthFlows.length);
        for (OAuthFlowType value : allowedOAuthFlows) {
            allowedOAuthFlowsCopy.add(value.toString());
        }
        if (getAllowedOAuthFlows() == null) {
            setAllowedOAuthFlows(allowedOAuthFlowsCopy);
        } else {
            getAllowedOAuthFlows().addAll(allowedOAuthFlowsCopy);
        }
        return this;
    }

    /**
     * <p>
     * A list of allowed <code>OAuth</code> scopes. Currently supported values are <code>"phone"</code>,
     * <code>"email"</code>, <code>"openid"</code>, and <code>"Cognito"</code>.
     * </p>
     * 
     * @return A list of allowed <code>OAuth</code> scopes. Currently supported values are <code>"phone"</code>,
     *         <code>"email"</code>, <code>"openid"</code>, and <code>"Cognito"</code>.
     */

    public java.util.List<String> getAllowedOAuthScopes() {
        return allowedOAuthScopes;
    }

    /**
     * <p>
     * A list of allowed <code>OAuth</code> scopes. Currently supported values are <code>"phone"</code>,
     * <code>"email"</code>, <code>"openid"</code>, and <code>"Cognito"</code>.
     * </p>
     * 
     * @param allowedOAuthScopes
     *        A list of allowed <code>OAuth</code> scopes. Currently supported values are <code>"phone"</code>,
     *        <code>"email"</code>, <code>"openid"</code>, and <code>"Cognito"</code>.
     */

    public void setAllowedOAuthScopes(java.util.Collection<String> allowedOAuthScopes) {
        if (allowedOAuthScopes == null) {
            this.allowedOAuthScopes = null;
            return;
        }

        this.allowedOAuthScopes = new java.util.ArrayList<String>(allowedOAuthScopes);
    }

    /**
     * <p>
     * A list of allowed <code>OAuth</code> scopes. Currently supported values are <code>"phone"</code>,
     * <code>"email"</code>, <code>"openid"</code>, and <code>"Cognito"</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAllowedOAuthScopes(java.util.Collection)} or {@link #withAllowedOAuthScopes(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param allowedOAuthScopes
     *        A list of allowed <code>OAuth</code> scopes. Currently supported values are <code>"phone"</code>,
     *        <code>"email"</code>, <code>"openid"</code>, and <code>"Cognito"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withAllowedOAuthScopes(String... allowedOAuthScopes) {
        if (this.allowedOAuthScopes == null) {
            setAllowedOAuthScopes(new java.util.ArrayList<String>(allowedOAuthScopes.length));
        }
        for (String ele : allowedOAuthScopes) {
            this.allowedOAuthScopes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of allowed <code>OAuth</code> scopes. Currently supported values are <code>"phone"</code>,
     * <code>"email"</code>, <code>"openid"</code>, and <code>"Cognito"</code>.
     * </p>
     * 
     * @param allowedOAuthScopes
     *        A list of allowed <code>OAuth</code> scopes. Currently supported values are <code>"phone"</code>,
     *        <code>"email"</code>, <code>"openid"</code>, and <code>"Cognito"</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withAllowedOAuthScopes(java.util.Collection<String> allowedOAuthScopes) {
        setAllowedOAuthScopes(allowedOAuthScopes);
        return this;
    }

    /**
     * <p>
     * Set to <code>True</code> if the client is allowed to follow the OAuth protocol when interacting with Cognito user
     * pools.
     * </p>
     * 
     * @param allowedOAuthFlowsUserPoolClient
     *        Set to <code>True</code> if the client is allowed to follow the OAuth protocol when interacting with
     *        Cognito user pools.
     */

    public void setAllowedOAuthFlowsUserPoolClient(Boolean allowedOAuthFlowsUserPoolClient) {
        this.allowedOAuthFlowsUserPoolClient = allowedOAuthFlowsUserPoolClient;
    }

    /**
     * <p>
     * Set to <code>True</code> if the client is allowed to follow the OAuth protocol when interacting with Cognito user
     * pools.
     * </p>
     * 
     * @return Set to <code>True</code> if the client is allowed to follow the OAuth protocol when interacting with
     *         Cognito user pools.
     */

    public Boolean getAllowedOAuthFlowsUserPoolClient() {
        return this.allowedOAuthFlowsUserPoolClient;
    }

    /**
     * <p>
     * Set to <code>True</code> if the client is allowed to follow the OAuth protocol when interacting with Cognito user
     * pools.
     * </p>
     * 
     * @param allowedOAuthFlowsUserPoolClient
     *        Set to <code>True</code> if the client is allowed to follow the OAuth protocol when interacting with
     *        Cognito user pools.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withAllowedOAuthFlowsUserPoolClient(Boolean allowedOAuthFlowsUserPoolClient) {
        setAllowedOAuthFlowsUserPoolClient(allowedOAuthFlowsUserPoolClient);
        return this;
    }

    /**
     * <p>
     * Set to <code>True</code> if the client is allowed to follow the OAuth protocol when interacting with Cognito user
     * pools.
     * </p>
     * 
     * @return Set to <code>True</code> if the client is allowed to follow the OAuth protocol when interacting with
     *         Cognito user pools.
     */

    public Boolean isAllowedOAuthFlowsUserPoolClient() {
        return this.allowedOAuthFlowsUserPoolClient;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
     * </p>
     * 
     * @param analyticsConfiguration
     *        The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
     */

    public void setAnalyticsConfiguration(AnalyticsConfigurationType analyticsConfiguration) {
        this.analyticsConfiguration = analyticsConfiguration;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
     * </p>
     * 
     * @return The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
     */

    public AnalyticsConfigurationType getAnalyticsConfiguration() {
        return this.analyticsConfiguration;
    }

    /**
     * <p>
     * The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
     * </p>
     * 
     * @param analyticsConfiguration
     *        The Amazon Pinpoint analytics configuration for collecting metrics for this user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateUserPoolClientRequest withAnalyticsConfiguration(AnalyticsConfigurationType analyticsConfiguration) {
        setAnalyticsConfiguration(analyticsConfiguration);
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
        if (getClientName() != null)
            sb.append("ClientName: ").append(getClientName()).append(",");
        if (getGenerateSecret() != null)
            sb.append("GenerateSecret: ").append(getGenerateSecret()).append(",");
        if (getRefreshTokenValidity() != null)
            sb.append("RefreshTokenValidity: ").append(getRefreshTokenValidity()).append(",");
        if (getReadAttributes() != null)
            sb.append("ReadAttributes: ").append(getReadAttributes()).append(",");
        if (getWriteAttributes() != null)
            sb.append("WriteAttributes: ").append(getWriteAttributes()).append(",");
        if (getExplicitAuthFlows() != null)
            sb.append("ExplicitAuthFlows: ").append(getExplicitAuthFlows()).append(",");
        if (getSupportedIdentityProviders() != null)
            sb.append("SupportedIdentityProviders: ").append(getSupportedIdentityProviders()).append(",");
        if (getCallbackURLs() != null)
            sb.append("CallbackURLs: ").append(getCallbackURLs()).append(",");
        if (getLogoutURLs() != null)
            sb.append("LogoutURLs: ").append(getLogoutURLs()).append(",");
        if (getDefaultRedirectURI() != null)
            sb.append("DefaultRedirectURI: ").append(getDefaultRedirectURI()).append(",");
        if (getAllowedOAuthFlows() != null)
            sb.append("AllowedOAuthFlows: ").append(getAllowedOAuthFlows()).append(",");
        if (getAllowedOAuthScopes() != null)
            sb.append("AllowedOAuthScopes: ").append(getAllowedOAuthScopes()).append(",");
        if (getAllowedOAuthFlowsUserPoolClient() != null)
            sb.append("AllowedOAuthFlowsUserPoolClient: ").append(getAllowedOAuthFlowsUserPoolClient()).append(",");
        if (getAnalyticsConfiguration() != null)
            sb.append("AnalyticsConfiguration: ").append(getAnalyticsConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateUserPoolClientRequest == false)
            return false;
        CreateUserPoolClientRequest other = (CreateUserPoolClientRequest) obj;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getClientName() == null ^ this.getClientName() == null)
            return false;
        if (other.getClientName() != null && other.getClientName().equals(this.getClientName()) == false)
            return false;
        if (other.getGenerateSecret() == null ^ this.getGenerateSecret() == null)
            return false;
        if (other.getGenerateSecret() != null && other.getGenerateSecret().equals(this.getGenerateSecret()) == false)
            return false;
        if (other.getRefreshTokenValidity() == null ^ this.getRefreshTokenValidity() == null)
            return false;
        if (other.getRefreshTokenValidity() != null && other.getRefreshTokenValidity().equals(this.getRefreshTokenValidity()) == false)
            return false;
        if (other.getReadAttributes() == null ^ this.getReadAttributes() == null)
            return false;
        if (other.getReadAttributes() != null && other.getReadAttributes().equals(this.getReadAttributes()) == false)
            return false;
        if (other.getWriteAttributes() == null ^ this.getWriteAttributes() == null)
            return false;
        if (other.getWriteAttributes() != null && other.getWriteAttributes().equals(this.getWriteAttributes()) == false)
            return false;
        if (other.getExplicitAuthFlows() == null ^ this.getExplicitAuthFlows() == null)
            return false;
        if (other.getExplicitAuthFlows() != null && other.getExplicitAuthFlows().equals(this.getExplicitAuthFlows()) == false)
            return false;
        if (other.getSupportedIdentityProviders() == null ^ this.getSupportedIdentityProviders() == null)
            return false;
        if (other.getSupportedIdentityProviders() != null && other.getSupportedIdentityProviders().equals(this.getSupportedIdentityProviders()) == false)
            return false;
        if (other.getCallbackURLs() == null ^ this.getCallbackURLs() == null)
            return false;
        if (other.getCallbackURLs() != null && other.getCallbackURLs().equals(this.getCallbackURLs()) == false)
            return false;
        if (other.getLogoutURLs() == null ^ this.getLogoutURLs() == null)
            return false;
        if (other.getLogoutURLs() != null && other.getLogoutURLs().equals(this.getLogoutURLs()) == false)
            return false;
        if (other.getDefaultRedirectURI() == null ^ this.getDefaultRedirectURI() == null)
            return false;
        if (other.getDefaultRedirectURI() != null && other.getDefaultRedirectURI().equals(this.getDefaultRedirectURI()) == false)
            return false;
        if (other.getAllowedOAuthFlows() == null ^ this.getAllowedOAuthFlows() == null)
            return false;
        if (other.getAllowedOAuthFlows() != null && other.getAllowedOAuthFlows().equals(this.getAllowedOAuthFlows()) == false)
            return false;
        if (other.getAllowedOAuthScopes() == null ^ this.getAllowedOAuthScopes() == null)
            return false;
        if (other.getAllowedOAuthScopes() != null && other.getAllowedOAuthScopes().equals(this.getAllowedOAuthScopes()) == false)
            return false;
        if (other.getAllowedOAuthFlowsUserPoolClient() == null ^ this.getAllowedOAuthFlowsUserPoolClient() == null)
            return false;
        if (other.getAllowedOAuthFlowsUserPoolClient() != null
                && other.getAllowedOAuthFlowsUserPoolClient().equals(this.getAllowedOAuthFlowsUserPoolClient()) == false)
            return false;
        if (other.getAnalyticsConfiguration() == null ^ this.getAnalyticsConfiguration() == null)
            return false;
        if (other.getAnalyticsConfiguration() != null && other.getAnalyticsConfiguration().equals(this.getAnalyticsConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getClientName() == null) ? 0 : getClientName().hashCode());
        hashCode = prime * hashCode + ((getGenerateSecret() == null) ? 0 : getGenerateSecret().hashCode());
        hashCode = prime * hashCode + ((getRefreshTokenValidity() == null) ? 0 : getRefreshTokenValidity().hashCode());
        hashCode = prime * hashCode + ((getReadAttributes() == null) ? 0 : getReadAttributes().hashCode());
        hashCode = prime * hashCode + ((getWriteAttributes() == null) ? 0 : getWriteAttributes().hashCode());
        hashCode = prime * hashCode + ((getExplicitAuthFlows() == null) ? 0 : getExplicitAuthFlows().hashCode());
        hashCode = prime * hashCode + ((getSupportedIdentityProviders() == null) ? 0 : getSupportedIdentityProviders().hashCode());
        hashCode = prime * hashCode + ((getCallbackURLs() == null) ? 0 : getCallbackURLs().hashCode());
        hashCode = prime * hashCode + ((getLogoutURLs() == null) ? 0 : getLogoutURLs().hashCode());
        hashCode = prime * hashCode + ((getDefaultRedirectURI() == null) ? 0 : getDefaultRedirectURI().hashCode());
        hashCode = prime * hashCode + ((getAllowedOAuthFlows() == null) ? 0 : getAllowedOAuthFlows().hashCode());
        hashCode = prime * hashCode + ((getAllowedOAuthScopes() == null) ? 0 : getAllowedOAuthScopes().hashCode());
        hashCode = prime * hashCode + ((getAllowedOAuthFlowsUserPoolClient() == null) ? 0 : getAllowedOAuthFlowsUserPoolClient().hashCode());
        hashCode = prime * hashCode + ((getAnalyticsConfiguration() == null) ? 0 : getAnalyticsConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public CreateUserPoolClientRequest clone() {
        return (CreateUserPoolClientRequest) super.clone();
    }

}
