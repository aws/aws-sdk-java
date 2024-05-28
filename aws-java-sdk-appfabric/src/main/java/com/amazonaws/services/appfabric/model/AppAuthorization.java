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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains information about an app authorization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/AppAuthorization" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppAuthorization implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app authorization.
     * </p>
     */
    private String appAuthorizationArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app bundle for the app authorization.
     * </p>
     */
    private String appBundleArn;
    /**
     * <p>
     * The name of the application.
     * </p>
     */
    private String app;
    /**
     * <p>
     * Contains information about an application tenant, such as the application display name and identifier.
     * </p>
     */
    private Tenant tenant;
    /**
     * <p>
     * The authorization type.
     * </p>
     */
    private String authType;
    /**
     * <p>
     * The state of the app authorization.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingConnect</code>: The initial state of the app authorization. The app authorization is created but not
     * yet connected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Connected</code>: The app authorization is connected to the application, and is ready to be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConnectionValidationFailed</code>: The app authorization received a validation exception when trying to
     * connect to the application. If the app authorization is in this state, you should verify the configured
     * credentials and try to connect the app authorization again.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TokenAutoRotationFailed</code>: AppFabric failed to refresh the access token. If the app authorization is
     * in this state, you should try to reconnect the app authorization.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The timestamp of when the app authorization was created.
     * </p>
     */
    private java.util.Date createdAt;
    /**
     * <p>
     * The timestamp of when the app authorization was last updated.
     * </p>
     */
    private java.util.Date updatedAt;
    /**
     * <p>
     * The user persona of the app authorization.
     * </p>
     * <p>
     * This field should always be <code>admin</code>.
     * </p>
     */
    private String persona;
    /**
     * <p>
     * The application URL for the OAuth flow.
     * </p>
     */
    private String authUrl;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app authorization.
     * </p>
     * 
     * @param appAuthorizationArn
     *        The Amazon Resource Name (ARN) of the app authorization.
     */

    public void setAppAuthorizationArn(String appAuthorizationArn) {
        this.appAuthorizationArn = appAuthorizationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app authorization.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the app authorization.
     */

    public String getAppAuthorizationArn() {
        return this.appAuthorizationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app authorization.
     * </p>
     * 
     * @param appAuthorizationArn
     *        The Amazon Resource Name (ARN) of the app authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAuthorization withAppAuthorizationArn(String appAuthorizationArn) {
        setAppAuthorizationArn(appAuthorizationArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app bundle for the app authorization.
     * </p>
     * 
     * @param appBundleArn
     *        The Amazon Resource Name (ARN) of the app bundle for the app authorization.
     */

    public void setAppBundleArn(String appBundleArn) {
        this.appBundleArn = appBundleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app bundle for the app authorization.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the app bundle for the app authorization.
     */

    public String getAppBundleArn() {
        return this.appBundleArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the app bundle for the app authorization.
     * </p>
     * 
     * @param appBundleArn
     *        The Amazon Resource Name (ARN) of the app bundle for the app authorization.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAuthorization withAppBundleArn(String appBundleArn) {
        setAppBundleArn(appBundleArn);
        return this;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param app
     *        The name of the application.
     */

    public void setApp(String app) {
        this.app = app;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @return The name of the application.
     */

    public String getApp() {
        return this.app;
    }

    /**
     * <p>
     * The name of the application.
     * </p>
     * 
     * @param app
     *        The name of the application.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAuthorization withApp(String app) {
        setApp(app);
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

    public AppAuthorization withTenant(Tenant tenant) {
        setTenant(tenant);
        return this;
    }

    /**
     * <p>
     * The authorization type.
     * </p>
     * 
     * @param authType
     *        The authorization type.
     * @see AuthType
     */

    public void setAuthType(String authType) {
        this.authType = authType;
    }

    /**
     * <p>
     * The authorization type.
     * </p>
     * 
     * @return The authorization type.
     * @see AuthType
     */

    public String getAuthType() {
        return this.authType;
    }

    /**
     * <p>
     * The authorization type.
     * </p>
     * 
     * @param authType
     *        The authorization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public AppAuthorization withAuthType(String authType) {
        setAuthType(authType);
        return this;
    }

    /**
     * <p>
     * The authorization type.
     * </p>
     * 
     * @param authType
     *        The authorization type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AuthType
     */

    public AppAuthorization withAuthType(AuthType authType) {
        this.authType = authType.toString();
        return this;
    }

    /**
     * <p>
     * The state of the app authorization.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingConnect</code>: The initial state of the app authorization. The app authorization is created but not
     * yet connected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Connected</code>: The app authorization is connected to the application, and is ready to be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConnectionValidationFailed</code>: The app authorization received a validation exception when trying to
     * connect to the application. If the app authorization is in this state, you should verify the configured
     * credentials and try to connect the app authorization again.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TokenAutoRotationFailed</code>: AppFabric failed to refresh the access token. If the app authorization is
     * in this state, you should try to reconnect the app authorization.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The state of the app authorization.</p>
     *        <p>
     *        The following states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PendingConnect</code>: The initial state of the app authorization. The app authorization is created
     *        but not yet connected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Connected</code>: The app authorization is connected to the application, and is ready to be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConnectionValidationFailed</code>: The app authorization received a validation exception when trying
     *        to connect to the application. If the app authorization is in this state, you should verify the configured
     *        credentials and try to connect the app authorization again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TokenAutoRotationFailed</code>: AppFabric failed to refresh the access token. If the app
     *        authorization is in this state, you should try to reconnect the app authorization.
     *        </p>
     *        </li>
     * @see AppAuthorizationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The state of the app authorization.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingConnect</code>: The initial state of the app authorization. The app authorization is created but not
     * yet connected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Connected</code>: The app authorization is connected to the application, and is ready to be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConnectionValidationFailed</code>: The app authorization received a validation exception when trying to
     * connect to the application. If the app authorization is in this state, you should verify the configured
     * credentials and try to connect the app authorization again.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TokenAutoRotationFailed</code>: AppFabric failed to refresh the access token. If the app authorization is
     * in this state, you should try to reconnect the app authorization.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The state of the app authorization.</p>
     *         <p>
     *         The following states are possible:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PendingConnect</code>: The initial state of the app authorization. The app authorization is created
     *         but not yet connected.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Connected</code>: The app authorization is connected to the application, and is ready to be used.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ConnectionValidationFailed</code>: The app authorization received a validation exception when
     *         trying to connect to the application. If the app authorization is in this state, you should verify the
     *         configured credentials and try to connect the app authorization again.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TokenAutoRotationFailed</code>: AppFabric failed to refresh the access token. If the app
     *         authorization is in this state, you should try to reconnect the app authorization.
     *         </p>
     *         </li>
     * @see AppAuthorizationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The state of the app authorization.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingConnect</code>: The initial state of the app authorization. The app authorization is created but not
     * yet connected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Connected</code>: The app authorization is connected to the application, and is ready to be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConnectionValidationFailed</code>: The app authorization received a validation exception when trying to
     * connect to the application. If the app authorization is in this state, you should verify the configured
     * credentials and try to connect the app authorization again.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TokenAutoRotationFailed</code>: AppFabric failed to refresh the access token. If the app authorization is
     * in this state, you should try to reconnect the app authorization.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The state of the app authorization.</p>
     *        <p>
     *        The following states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PendingConnect</code>: The initial state of the app authorization. The app authorization is created
     *        but not yet connected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Connected</code>: The app authorization is connected to the application, and is ready to be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConnectionValidationFailed</code>: The app authorization received a validation exception when trying
     *        to connect to the application. If the app authorization is in this state, you should verify the configured
     *        credentials and try to connect the app authorization again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TokenAutoRotationFailed</code>: AppFabric failed to refresh the access token. If the app
     *        authorization is in this state, you should try to reconnect the app authorization.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppAuthorizationStatus
     */

    public AppAuthorization withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The state of the app authorization.
     * </p>
     * <p>
     * The following states are possible:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PendingConnect</code>: The initial state of the app authorization. The app authorization is created but not
     * yet connected.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Connected</code>: The app authorization is connected to the application, and is ready to be used.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ConnectionValidationFailed</code>: The app authorization received a validation exception when trying to
     * connect to the application. If the app authorization is in this state, you should verify the configured
     * credentials and try to connect the app authorization again.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TokenAutoRotationFailed</code>: AppFabric failed to refresh the access token. If the app authorization is
     * in this state, you should try to reconnect the app authorization.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The state of the app authorization.</p>
     *        <p>
     *        The following states are possible:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PendingConnect</code>: The initial state of the app authorization. The app authorization is created
     *        but not yet connected.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Connected</code>: The app authorization is connected to the application, and is ready to be used.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ConnectionValidationFailed</code>: The app authorization received a validation exception when trying
     *        to connect to the application. If the app authorization is in this state, you should verify the configured
     *        credentials and try to connect the app authorization again.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TokenAutoRotationFailed</code>: AppFabric failed to refresh the access token. If the app
     *        authorization is in this state, you should try to reconnect the app authorization.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppAuthorizationStatus
     */

    public AppAuthorization withStatus(AppAuthorizationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the app authorization was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the app authorization was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the app authorization was created.
     * </p>
     * 
     * @return The timestamp of when the app authorization was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the app authorization was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the app authorization was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAuthorization withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the app authorization was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the app authorization was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the app authorization was last updated.
     * </p>
     * 
     * @return The timestamp of when the app authorization was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * The timestamp of when the app authorization was last updated.
     * </p>
     * 
     * @param updatedAt
     *        The timestamp of when the app authorization was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAuthorization withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
        return this;
    }

    /**
     * <p>
     * The user persona of the app authorization.
     * </p>
     * <p>
     * This field should always be <code>admin</code>.
     * </p>
     * 
     * @param persona
     *        The user persona of the app authorization.</p>
     *        <p>
     *        This field should always be <code>admin</code>.
     * @see Persona
     */

    public void setPersona(String persona) {
        this.persona = persona;
    }

    /**
     * <p>
     * The user persona of the app authorization.
     * </p>
     * <p>
     * This field should always be <code>admin</code>.
     * </p>
     * 
     * @return The user persona of the app authorization.</p>
     *         <p>
     *         This field should always be <code>admin</code>.
     * @see Persona
     */

    public String getPersona() {
        return this.persona;
    }

    /**
     * <p>
     * The user persona of the app authorization.
     * </p>
     * <p>
     * This field should always be <code>admin</code>.
     * </p>
     * 
     * @param persona
     *        The user persona of the app authorization.</p>
     *        <p>
     *        This field should always be <code>admin</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Persona
     */

    public AppAuthorization withPersona(String persona) {
        setPersona(persona);
        return this;
    }

    /**
     * <p>
     * The user persona of the app authorization.
     * </p>
     * <p>
     * This field should always be <code>admin</code>.
     * </p>
     * 
     * @param persona
     *        The user persona of the app authorization.</p>
     *        <p>
     *        This field should always be <code>admin</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Persona
     */

    public AppAuthorization withPersona(Persona persona) {
        this.persona = persona.toString();
        return this;
    }

    /**
     * <p>
     * The application URL for the OAuth flow.
     * </p>
     * 
     * @param authUrl
     *        The application URL for the OAuth flow.
     */

    public void setAuthUrl(String authUrl) {
        this.authUrl = authUrl;
    }

    /**
     * <p>
     * The application URL for the OAuth flow.
     * </p>
     * 
     * @return The application URL for the OAuth flow.
     */

    public String getAuthUrl() {
        return this.authUrl;
    }

    /**
     * <p>
     * The application URL for the OAuth flow.
     * </p>
     * 
     * @param authUrl
     *        The application URL for the OAuth flow.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAuthorization withAuthUrl(String authUrl) {
        setAuthUrl(authUrl);
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
        if (getAppAuthorizationArn() != null)
            sb.append("AppAuthorizationArn: ").append(getAppAuthorizationArn()).append(",");
        if (getAppBundleArn() != null)
            sb.append("AppBundleArn: ").append(getAppBundleArn()).append(",");
        if (getApp() != null)
            sb.append("App: ").append(getApp()).append(",");
        if (getTenant() != null)
            sb.append("Tenant: ").append(getTenant()).append(",");
        if (getAuthType() != null)
            sb.append("AuthType: ").append(getAuthType()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt()).append(",");
        if (getPersona() != null)
            sb.append("Persona: ").append(getPersona()).append(",");
        if (getAuthUrl() != null)
            sb.append("AuthUrl: ").append(getAuthUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppAuthorization == false)
            return false;
        AppAuthorization other = (AppAuthorization) obj;
        if (other.getAppAuthorizationArn() == null ^ this.getAppAuthorizationArn() == null)
            return false;
        if (other.getAppAuthorizationArn() != null && other.getAppAuthorizationArn().equals(this.getAppAuthorizationArn()) == false)
            return false;
        if (other.getAppBundleArn() == null ^ this.getAppBundleArn() == null)
            return false;
        if (other.getAppBundleArn() != null && other.getAppBundleArn().equals(this.getAppBundleArn()) == false)
            return false;
        if (other.getApp() == null ^ this.getApp() == null)
            return false;
        if (other.getApp() != null && other.getApp().equals(this.getApp()) == false)
            return false;
        if (other.getTenant() == null ^ this.getTenant() == null)
            return false;
        if (other.getTenant() != null && other.getTenant().equals(this.getTenant()) == false)
            return false;
        if (other.getAuthType() == null ^ this.getAuthType() == null)
            return false;
        if (other.getAuthType() != null && other.getAuthType().equals(this.getAuthType()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
            return false;
        if (other.getPersona() == null ^ this.getPersona() == null)
            return false;
        if (other.getPersona() != null && other.getPersona().equals(this.getPersona()) == false)
            return false;
        if (other.getAuthUrl() == null ^ this.getAuthUrl() == null)
            return false;
        if (other.getAuthUrl() != null && other.getAuthUrl().equals(this.getAuthUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppAuthorizationArn() == null) ? 0 : getAppAuthorizationArn().hashCode());
        hashCode = prime * hashCode + ((getAppBundleArn() == null) ? 0 : getAppBundleArn().hashCode());
        hashCode = prime * hashCode + ((getApp() == null) ? 0 : getApp().hashCode());
        hashCode = prime * hashCode + ((getTenant() == null) ? 0 : getTenant().hashCode());
        hashCode = prime * hashCode + ((getAuthType() == null) ? 0 : getAuthType().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        hashCode = prime * hashCode + ((getPersona() == null) ? 0 : getPersona().hashCode());
        hashCode = prime * hashCode + ((getAuthUrl() == null) ? 0 : getAuthUrl().hashCode());
        return hashCode;
    }

    @Override
    public AppAuthorization clone() {
        try {
            return (AppAuthorization) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appfabric.model.transform.AppAuthorizationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
