/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.amplifybackend.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/UpdateBackendConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateBackendConfigResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The app ID.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The app ID for the backend manager.
     * </p>
     */
    private String backendManagerAppId;
    /**
     * <p>
     * If the request fails, this error is returned.
     * </p>
     */
    private String error;
    /**
     * <p>
     * Describes the Amazon Cognito configurations for the Admin UI auth resource to log in with.
     * </p>
     */
    private LoginAuthConfigReqObj loginAuthConfig;

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @return The app ID.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The app ID.
     * </p>
     * 
     * @param appId
     *        The app ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendConfigResult withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The app ID for the backend manager.
     * </p>
     * 
     * @param backendManagerAppId
     *        The app ID for the backend manager.
     */

    public void setBackendManagerAppId(String backendManagerAppId) {
        this.backendManagerAppId = backendManagerAppId;
    }

    /**
     * <p>
     * The app ID for the backend manager.
     * </p>
     * 
     * @return The app ID for the backend manager.
     */

    public String getBackendManagerAppId() {
        return this.backendManagerAppId;
    }

    /**
     * <p>
     * The app ID for the backend manager.
     * </p>
     * 
     * @param backendManagerAppId
     *        The app ID for the backend manager.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendConfigResult withBackendManagerAppId(String backendManagerAppId) {
        setBackendManagerAppId(backendManagerAppId);
        return this;
    }

    /**
     * <p>
     * If the request fails, this error is returned.
     * </p>
     * 
     * @param error
     *        If the request fails, this error is returned.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * If the request fails, this error is returned.
     * </p>
     * 
     * @return If the request fails, this error is returned.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * If the request fails, this error is returned.
     * </p>
     * 
     * @param error
     *        If the request fails, this error is returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendConfigResult withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * Describes the Amazon Cognito configurations for the Admin UI auth resource to log in with.
     * </p>
     * 
     * @param loginAuthConfig
     *        Describes the Amazon Cognito configurations for the Admin UI auth resource to log in with.
     */

    public void setLoginAuthConfig(LoginAuthConfigReqObj loginAuthConfig) {
        this.loginAuthConfig = loginAuthConfig;
    }

    /**
     * <p>
     * Describes the Amazon Cognito configurations for the Admin UI auth resource to log in with.
     * </p>
     * 
     * @return Describes the Amazon Cognito configurations for the Admin UI auth resource to log in with.
     */

    public LoginAuthConfigReqObj getLoginAuthConfig() {
        return this.loginAuthConfig;
    }

    /**
     * <p>
     * Describes the Amazon Cognito configurations for the Admin UI auth resource to log in with.
     * </p>
     * 
     * @param loginAuthConfig
     *        Describes the Amazon Cognito configurations for the Admin UI auth resource to log in with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateBackendConfigResult withLoginAuthConfig(LoginAuthConfigReqObj loginAuthConfig) {
        setLoginAuthConfig(loginAuthConfig);
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
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getBackendManagerAppId() != null)
            sb.append("BackendManagerAppId: ").append(getBackendManagerAppId()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError()).append(",");
        if (getLoginAuthConfig() != null)
            sb.append("LoginAuthConfig: ").append(getLoginAuthConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateBackendConfigResult == false)
            return false;
        UpdateBackendConfigResult other = (UpdateBackendConfigResult) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBackendManagerAppId() == null ^ this.getBackendManagerAppId() == null)
            return false;
        if (other.getBackendManagerAppId() != null && other.getBackendManagerAppId().equals(this.getBackendManagerAppId()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getLoginAuthConfig() == null ^ this.getLoginAuthConfig() == null)
            return false;
        if (other.getLoginAuthConfig() != null && other.getLoginAuthConfig().equals(this.getLoginAuthConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBackendManagerAppId() == null) ? 0 : getBackendManagerAppId().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getLoginAuthConfig() == null) ? 0 : getLoginAuthConfig().hashCode());
        return hashCode;
    }

    @Override
    public UpdateBackendConfigResult clone() {
        try {
            return (UpdateBackendConfigResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
