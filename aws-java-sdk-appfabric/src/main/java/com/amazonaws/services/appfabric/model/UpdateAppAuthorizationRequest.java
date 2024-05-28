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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/UpdateAppAuthorization" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAppAuthorizationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app bundle to use for the request.
     * </p>
     */
    private String appBundleIdentifier;
    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app authorization to use for the
     * request.
     * </p>
     */
    private String appAuthorizationIdentifier;
    /**
     * <p>
     * Contains credentials for the application, such as an API key or OAuth2 client ID and secret.
     * </p>
     * <p>
     * Specify credentials that match the authorization type of the app authorization to update. For example, if the
     * authorization type of the app authorization is OAuth2 (<code>oauth2</code>), then you should provide only the
     * OAuth2 credentials.
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

    public UpdateAppAuthorizationRequest withAppBundleIdentifier(String appBundleIdentifier) {
        setAppBundleIdentifier(appBundleIdentifier);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app authorization to use for the
     * request.
     * </p>
     * 
     * @param appAuthorizationIdentifier
     *        The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app authorization to use for
     *        the request.
     */

    public void setAppAuthorizationIdentifier(String appAuthorizationIdentifier) {
        this.appAuthorizationIdentifier = appAuthorizationIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app authorization to use for the
     * request.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app authorization to use for
     *         the request.
     */

    public String getAppAuthorizationIdentifier() {
        return this.appAuthorizationIdentifier;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app authorization to use for the
     * request.
     * </p>
     * 
     * @param appAuthorizationIdentifier
     *        The Amazon Resource Name (ARN) or Universal Unique Identifier (UUID) of the app authorization to use for
     *        the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppAuthorizationRequest withAppAuthorizationIdentifier(String appAuthorizationIdentifier) {
        setAppAuthorizationIdentifier(appAuthorizationIdentifier);
        return this;
    }

    /**
     * <p>
     * Contains credentials for the application, such as an API key or OAuth2 client ID and secret.
     * </p>
     * <p>
     * Specify credentials that match the authorization type of the app authorization to update. For example, if the
     * authorization type of the app authorization is OAuth2 (<code>oauth2</code>), then you should provide only the
     * OAuth2 credentials.
     * </p>
     * 
     * @param credential
     *        Contains credentials for the application, such as an API key or OAuth2 client ID and secret.</p>
     *        <p>
     *        Specify credentials that match the authorization type of the app authorization to update. For example, if
     *        the authorization type of the app authorization is OAuth2 (<code>oauth2</code>), then you should provide
     *        only the OAuth2 credentials.
     */

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    /**
     * <p>
     * Contains credentials for the application, such as an API key or OAuth2 client ID and secret.
     * </p>
     * <p>
     * Specify credentials that match the authorization type of the app authorization to update. For example, if the
     * authorization type of the app authorization is OAuth2 (<code>oauth2</code>), then you should provide only the
     * OAuth2 credentials.
     * </p>
     * 
     * @return Contains credentials for the application, such as an API key or OAuth2 client ID and secret.</p>
     *         <p>
     *         Specify credentials that match the authorization type of the app authorization to update. For example, if
     *         the authorization type of the app authorization is OAuth2 (<code>oauth2</code>), then you should provide
     *         only the OAuth2 credentials.
     */

    public Credential getCredential() {
        return this.credential;
    }

    /**
     * <p>
     * Contains credentials for the application, such as an API key or OAuth2 client ID and secret.
     * </p>
     * <p>
     * Specify credentials that match the authorization type of the app authorization to update. For example, if the
     * authorization type of the app authorization is OAuth2 (<code>oauth2</code>), then you should provide only the
     * OAuth2 credentials.
     * </p>
     * 
     * @param credential
     *        Contains credentials for the application, such as an API key or OAuth2 client ID and secret.</p>
     *        <p>
     *        Specify credentials that match the authorization type of the app authorization to update. For example, if
     *        the authorization type of the app authorization is OAuth2 (<code>oauth2</code>), then you should provide
     *        only the OAuth2 credentials.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAppAuthorizationRequest withCredential(Credential credential) {
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

    public UpdateAppAuthorizationRequest withTenant(Tenant tenant) {
        setTenant(tenant);
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
        if (getAppAuthorizationIdentifier() != null)
            sb.append("AppAuthorizationIdentifier: ").append(getAppAuthorizationIdentifier()).append(",");
        if (getCredential() != null)
            sb.append("Credential: ").append(getCredential()).append(",");
        if (getTenant() != null)
            sb.append("Tenant: ").append(getTenant());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateAppAuthorizationRequest == false)
            return false;
        UpdateAppAuthorizationRequest other = (UpdateAppAuthorizationRequest) obj;
        if (other.getAppBundleIdentifier() == null ^ this.getAppBundleIdentifier() == null)
            return false;
        if (other.getAppBundleIdentifier() != null && other.getAppBundleIdentifier().equals(this.getAppBundleIdentifier()) == false)
            return false;
        if (other.getAppAuthorizationIdentifier() == null ^ this.getAppAuthorizationIdentifier() == null)
            return false;
        if (other.getAppAuthorizationIdentifier() != null && other.getAppAuthorizationIdentifier().equals(this.getAppAuthorizationIdentifier()) == false)
            return false;
        if (other.getCredential() == null ^ this.getCredential() == null)
            return false;
        if (other.getCredential() != null && other.getCredential().equals(this.getCredential()) == false)
            return false;
        if (other.getTenant() == null ^ this.getTenant() == null)
            return false;
        if (other.getTenant() != null && other.getTenant().equals(this.getTenant()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppBundleIdentifier() == null) ? 0 : getAppBundleIdentifier().hashCode());
        hashCode = prime * hashCode + ((getAppAuthorizationIdentifier() == null) ? 0 : getAppAuthorizationIdentifier().hashCode());
        hashCode = prime * hashCode + ((getCredential() == null) ? 0 : getCredential().hashCode());
        hashCode = prime * hashCode + ((getTenant() == null) ? 0 : getTenant().hashCode());
        return hashCode;
    }

    @Override
    public UpdateAppAuthorizationRequest clone() {
        return (UpdateAppAuthorizationRequest) super.clone();
    }

}
