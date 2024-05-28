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
 * Contains a summary of an app authorization.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appfabric-2023-05-19/AppAuthorizationSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AppAuthorizationSummary implements Serializable, Cloneable, StructuredPojo {

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
     * Timestamp for when the app authorization was last updated.
     * </p>
     */
    private java.util.Date updatedAt;

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

    public AppAuthorizationSummary withAppAuthorizationArn(String appAuthorizationArn) {
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

    public AppAuthorizationSummary withAppBundleArn(String appBundleArn) {
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

    public AppAuthorizationSummary withApp(String app) {
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

    public AppAuthorizationSummary withTenant(Tenant tenant) {
        setTenant(tenant);
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

    public AppAuthorizationSummary withStatus(String status) {
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

    public AppAuthorizationSummary withStatus(AppAuthorizationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Timestamp for when the app authorization was last updated.
     * </p>
     * 
     * @param updatedAt
     *        Timestamp for when the app authorization was last updated.
     */

    public void setUpdatedAt(java.util.Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
     * <p>
     * Timestamp for when the app authorization was last updated.
     * </p>
     * 
     * @return Timestamp for when the app authorization was last updated.
     */

    public java.util.Date getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * <p>
     * Timestamp for when the app authorization was last updated.
     * </p>
     * 
     * @param updatedAt
     *        Timestamp for when the app authorization was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AppAuthorizationSummary withUpdatedAt(java.util.Date updatedAt) {
        setUpdatedAt(updatedAt);
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getUpdatedAt() != null)
            sb.append("UpdatedAt: ").append(getUpdatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AppAuthorizationSummary == false)
            return false;
        AppAuthorizationSummary other = (AppAuthorizationSummary) obj;
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getUpdatedAt() == null ^ this.getUpdatedAt() == null)
            return false;
        if (other.getUpdatedAt() != null && other.getUpdatedAt().equals(this.getUpdatedAt()) == false)
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
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getUpdatedAt() == null) ? 0 : getUpdatedAt().hashCode());
        return hashCode;
    }

    @Override
    public AppAuthorizationSummary clone() {
        try {
            return (AppAuthorizationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appfabric.model.transform.AppAuthorizationSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
