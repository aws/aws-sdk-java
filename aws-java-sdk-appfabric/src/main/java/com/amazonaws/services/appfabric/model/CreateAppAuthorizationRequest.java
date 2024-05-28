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
package com.amazonaws.services.appfabric.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/CreateAppAuthorization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAppAuthorizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     */
    private String appBundleIdentifier;
    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SLACK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASANA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JIRA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365AUDITLOGS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZOOM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZENDESK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OKTA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOOGLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DROPBOX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMARTSHEET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CISCO</code>
     * </p>
     * </li>
     * </ul>
     */
    private String app;
    /**
     * <p>
     * Contains credentials for the application, such as an API key or OAuth2 client ID and secret.
     * </p>
     * <p>
     * Specify credentials that match the authorization type for your request. For example, if the authorization type
     * for your request is OAuth2 (<code>oauth2</code>), then you should provide only the OAuth2 credentials.
     * </p>
     */
    private Credential credential;
    /**
     * <p>
     * Contains information about an application tenant, such as the application display name and identifier.
     * </p>
     */
    private Tenant tenant;
    /**
     * <p>
     * The authorization type for the app authorization.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * A map of the key-value pairs of the tag or tags to assign to the resource.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     * 
     * @param appBundleIdentifier
     *        The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the
     *        request.
     */

    public void setAppBundleIdentifier(String appBundleIdentifier) {
        this.appBundleIdentifier = appBundleIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the
     *         request.
     */

    public String getAppBundleIdentifier() {
        return this.appBundleIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     * 
     * @param appBundleIdentifier
     *        The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the
     *        request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppAuthorizationRequest withAppBundleIdentifier(String appBundleIdentifier) {
        setAppBundleIdentifier(appBundleIdentifier);
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SLACK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASANA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JIRA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365AUDITLOGS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZOOM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZENDESK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OKTA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOOGLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DROPBOX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMARTSHEET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CISCO</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param app
     *        The name of the application.</p>
     *        <p>
     *        Valid values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SLACK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASANA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JIRA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>M365</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>M365AUDITLOGS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZOOM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZENDESK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OKTA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOOGLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DROPBOX</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMARTSHEET</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CISCO</code>
     *        </p>
     *        </li>
     */

    public void setApp(String app) {
        this.app = app;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SLACK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASANA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JIRA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365AUDITLOGS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZOOM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZENDESK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OKTA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOOGLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DROPBOX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMARTSHEET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CISCO</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the application.</p>
     *         <p>
     *         Valid values are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SLACK</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ASANA</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>JIRA</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>M365</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>M365AUDITLOGS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ZOOM</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ZENDESK</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OKTA</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>GOOGLE</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DROPBOX</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SMARTSHEET</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CISCO</code>
     *         </p>
     *         </li>
     */

    public String getApp() {
        return this.app;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * <p>
     * Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SLACK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ASANA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>JIRA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>M365AUDITLOGS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZOOM</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ZENDESK</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OKTA</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>GOOGLE</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DROPBOX</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SMARTSHEET</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CISCO</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param app
     *        The name of the application.</p>
     *        <p>
     *        Valid values are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SLACK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ASANA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>JIRA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>M365</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>M365AUDITLOGS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZOOM</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ZENDESK</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OKTA</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>GOOGLE</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DROPBOX</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SMARTSHEET</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CISCO</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppAuthorizationRequest withApp(String app) {
        setApp(app);
        return this;
    }

    /**
     * <p>
     * Contains credentials for the application, such as an API key or OAuth2 client ID and secret.
     * </p>
     * <p>
     * Specify credentials that match the authorization type for your request. For example, if the authorization type
     * for your request is OAuth2 (<code>oauth2</code>), then you should provide only the OAuth2 credentials.
     * </p>
     * 
     * @param credential
     *        Contains credentials for the application, such as an API key or OAuth2 client ID and secret.</p>
     *        <p>
     *        Specify credentials that match the authorization type for your request. For example, if the authorization
     *        type for your request is OAuth2 (<code>oauth2</code>), then you should provide only the OAuth2
     *        credentials.
     */

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    /**
     * <p>
     * Contains credentials for the application, such as an API key or OAuth2 client ID and secret.
     * </p>
     * <p>
     * Specify credentials that match the authorization type for your request. For example, if the authorization type
     * for your request is OAuth2 (<code>oauth2</code>), then you should provide only the OAuth2 credentials.
     * </p>
     * 
     * @return Contains credentials for the application, such as an API key or OAuth2 client ID and secret.</p>
     *         <p>
     *         Specify credentials that match the authorization type for your request. For example, if the authorization
     *         type for your request is OAuth2 (<code>oauth2</code>), then you should provide only the OAuth2
     *         credentials.
     */

    public Credential getCredential() {
        return this.credential;
    }

    /**
     * <p>
     * Contains credentials for the application, such as an API key or OAuth2 client ID and secret.
     * </p>
     * <p>
     * Specify credentials that match the authorization type for your request. For example, if the authorization type
     * for your request is OAuth2 (<code>oauth2</code>), then you should provide only the OAuth2 credentials.
     * </p>
     * 
     * @param credential
     *        Contains credentials for the application, such as an API key or OAuth2 client ID and secret.</p>
     *        <p>
     *        Specify credentials that match the authorization type for your request. For example, if the authorization
     *        type for your request is OAuth2 (<code>oauth2</code>), then you should provide only the OAuth2
     *        credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppAuthorizationRequest withCredential(Credential credential) {
        setCredential(credential);
        return this;
    }

    /**
     * <p>
     * Contains information about an application tenant, such as the application display name and identifier.
     * </p>
     * 
     * @param tenant
     *        Contains information about an application tenant, such as the application display name and identifier.
     */

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    /**
     * <p>
     * Contains information about an application tenant, such as the application display name and identifier.
     * </p>
     * 
     * @return Contains information about an application tenant, such as the application display name and identifier.
     */

    public Tenant getTenant() {
        return this.tenant;
    }

    /**
     * <p>
     * Contains information about an application tenant, such as the application display name and identifier.
     * </p>
     * 
     * @param tenant
     *        Contains information about an application tenant, such as the application display name and identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppAuthorizationRequest withTenant(Tenant tenant) {
        setTenant(tenant);
        return this;
    }

    /**
     * <p>
     * The authorization type for the app authorization.
     * </p>
     * 
     * @param authType
     *        The authorization type for the app authorization.
     * @see AuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The authorization type for the app authorization.
     * </p>
     * 
     * @return The authorization type for the app authorization.
     * @see AuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The authorization type for the app authorization.
     * </p>
     * 
     * @param authType
     *        The authorization type for the app authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public CreateAppAuthorizationRequest withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The authorization type for the app authorization.
     * </p>
     * 
     * @param authType
     *        The authorization type for the app authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public CreateAppAuthorizationRequest withAuthType(AuthType authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *        This lets you safely retry the request without accidentally performing the same operation a second time.
     *        Passing the same value to a later call to an operation requires that you also pass the same value for all
     *        other parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>IdempotentParameterMismatch</code> error.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @return Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *         This lets you safely retry the request without accidentally performing the same operation a second time.
     *         Passing the same value to a later call to an operation requires that you also pass the same value for all
     *         other parameters. We recommend that you use a <a
     *         href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value</a>.</p>
     *         <p>
     *         If you don't provide this value, then Amazon Web Services generates a random one for you.
     *         </p>
     *         <p>
     *         If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *         retry fails with an <code>IdempotentParameterMismatch</code> error.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request. This
     * lets you safely retry the request without accidentally performing the same operation a second time. Passing the
     * same value to a later call to an operation requires that you also pass the same value for all other parameters.
     * We recommend that you use a <a href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of
     * value</a>.
     * </p>
     * <p>
     * If you don't provide this value, then Amazon Web Services generates a random one for you.
     * </p>
     * <p>
     * If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the retry fails
     * with an <code>IdempotentParameterMismatch</code> error.
     * </p>
     * 
     * @param clientToken
     *        Specifies a unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
     *        This lets you safely retry the request without accidentally performing the same operation a second time.
     *        Passing the same value to a later call to an operation requires that you also pass the same value for all
     *        other parameters. We recommend that you use a <a
     *        href="https://wikipedia.org/wiki/Universally_unique_identifier">UUID type of value</a>.</p>
     *        <p>
     *        If you don't provide this value, then Amazon Web Services generates a random one for you.
     *        </p>
     *        <p>
     *        If you retry the operation with the same <code>ClientToken</code>, but with different parameters, the
     *        retry fails with an <code>IdempotentParameterMismatch</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppAuthorizationRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * A map of the key-value pairs of the tag or tags to assign to the resource.
     * </p>
     * 
     * @return A map of the key-value pairs of the tag or tags to assign to the resource.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A map of the key-value pairs of the tag or tags to assign to the resource.
     * </p>
     * 
     * @param tags
     *        A map of the key-value pairs of the tag or tags to assign to the resource.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A map of the key-value pairs of the tag or tags to assign to the resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A map of the key-value pairs of the tag or tags to assign to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppAuthorizationRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A map of the key-value pairs of the tag or tags to assign to the resource.
     * </p>
     * 
     * @param tags
     *        A map of the key-value pairs of the tag or tags to assign to the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAppAuthorizationRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAppBundleIdentifier() != null)
            sb.append("AppBundleIdentifier: ").append(getAppBundleIdentifier()).append(",");
        if (getApp() != null)
            sb.append("App: ").append(getApp()).append(",");
        if (getCredential() != null)
            sb.append("Credential: ").append(getCredential()).append(",");
        if (getTenant() != null)
            sb.append("Tenant: ").append(getTenant()).append(",");
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateAppAuthorizationRequest == false)
            return false;
        CreateAppAuthorizationRequest other = (CreateAppAuthorizationRequest) obj;
        if (other.getAppBundleIdentifier() == null ^ this.getAppBundleIdentifier() == null)
            return false;
        if (other.getAppBundleIdentifier() != null && other.getAppBundleIdentifier().equals(this.getAppBundleIdentifier()) == false)
            return false;
        if (other.getApp() == null ^ this.getApp() == null)
            return false;
        if (other.getApp() != null && other.getApp().equals(this.getApp()) == false)
            return false;
        if (other.getCredential() == null ^ this.getCredential() == null)
            return false;
        if (other.getCredential() != null && other.getCredential().equals(this.getCredential()) == false)
            return false;
        if (other.getTenant() == null ^ this.getTenant() == null)
            return false;
        if (other.getTenant() != null && other.getTenant().equals(this.getTenant()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppBundleIdentifier() == null) ? 0 : getAppBundleIdentifier().hashCode());
        hashCode = prime * hashCode + ((getApp() == null) ? 0 : getApp().hashCode());
        hashCode = prime * hashCode + ((getCredential() == null) ? 0 : getCredential().hashCode());
        hashCode = prime * hashCode + ((getTenant() == null) ? 0 : getTenant().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAppAuthorizationRequest clone() {
        return (CreateAppAuthorizationRequest) super.clone();
    }

}
