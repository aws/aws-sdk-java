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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The request body for ImportBackendAuth.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/ImportBackendAuth" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImportBackendAuthRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The app ID.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The name of the backend environment.
     * </p>
     */
    private String backendEnvironmentName;
    /**
     * <p>
     * The ID of the Amazon Cognito identity pool.
     * </p>
     */
    private String identityPoolId;
    /**
     * <p>
     * The ID of the Amazon Cognito native client.
     * </p>
     */
    private String nativeClientId;
    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     */
    private String userPoolId;
    /**
     * <p>
     * The ID of the Amazon Cognito web client.
     * </p>
     */
    private String webClientId;

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

    public ImportBackendAuthRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The name of the backend environment.
     * </p>
     * 
     * @param backendEnvironmentName
     *        The name of the backend environment.
     */

    public void setBackendEnvironmentName(String backendEnvironmentName) {
        this.backendEnvironmentName = backendEnvironmentName;
    }

    /**
     * <p>
     * The name of the backend environment.
     * </p>
     * 
     * @return The name of the backend environment.
     */

    public String getBackendEnvironmentName() {
        return this.backendEnvironmentName;
    }

    /**
     * <p>
     * The name of the backend environment.
     * </p>
     * 
     * @param backendEnvironmentName
     *        The name of the backend environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportBackendAuthRequest withBackendEnvironmentName(String backendEnvironmentName) {
        setBackendEnvironmentName(backendEnvironmentName);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito identity pool.
     * </p>
     * 
     * @param identityPoolId
     *        The ID of the Amazon Cognito identity pool.
     */

    public void setIdentityPoolId(String identityPoolId) {
        this.identityPoolId = identityPoolId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito identity pool.
     * </p>
     * 
     * @return The ID of the Amazon Cognito identity pool.
     */

    public String getIdentityPoolId() {
        return this.identityPoolId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito identity pool.
     * </p>
     * 
     * @param identityPoolId
     *        The ID of the Amazon Cognito identity pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportBackendAuthRequest withIdentityPoolId(String identityPoolId) {
        setIdentityPoolId(identityPoolId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito native client.
     * </p>
     * 
     * @param nativeClientId
     *        The ID of the Amazon Cognito native client.
     */

    public void setNativeClientId(String nativeClientId) {
        this.nativeClientId = nativeClientId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito native client.
     * </p>
     * 
     * @return The ID of the Amazon Cognito native client.
     */

    public String getNativeClientId() {
        return this.nativeClientId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito native client.
     * </p>
     * 
     * @param nativeClientId
     *        The ID of the Amazon Cognito native client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportBackendAuthRequest withNativeClientId(String nativeClientId) {
        setNativeClientId(nativeClientId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     * 
     * @param userPoolId
     *        The ID of the Amazon Cognito user pool.
     */

    public void setUserPoolId(String userPoolId) {
        this.userPoolId = userPoolId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     * 
     * @return The ID of the Amazon Cognito user pool.
     */

    public String getUserPoolId() {
        return this.userPoolId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito user pool.
     * </p>
     * 
     * @param userPoolId
     *        The ID of the Amazon Cognito user pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportBackendAuthRequest withUserPoolId(String userPoolId) {
        setUserPoolId(userPoolId);
        return this;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito web client.
     * </p>
     * 
     * @param webClientId
     *        The ID of the Amazon Cognito web client.
     */

    public void setWebClientId(String webClientId) {
        this.webClientId = webClientId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito web client.
     * </p>
     * 
     * @return The ID of the Amazon Cognito web client.
     */

    public String getWebClientId() {
        return this.webClientId;
    }

    /**
     * <p>
     * The ID of the Amazon Cognito web client.
     * </p>
     * 
     * @param webClientId
     *        The ID of the Amazon Cognito web client.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImportBackendAuthRequest withWebClientId(String webClientId) {
        setWebClientId(webClientId);
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
        if (getBackendEnvironmentName() != null)
            sb.append("BackendEnvironmentName: ").append(getBackendEnvironmentName()).append(",");
        if (getIdentityPoolId() != null)
            sb.append("IdentityPoolId: ").append(getIdentityPoolId()).append(",");
        if (getNativeClientId() != null)
            sb.append("NativeClientId: ").append(getNativeClientId()).append(",");
        if (getUserPoolId() != null)
            sb.append("UserPoolId: ").append(getUserPoolId()).append(",");
        if (getWebClientId() != null)
            sb.append("WebClientId: ").append(getWebClientId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImportBackendAuthRequest == false)
            return false;
        ImportBackendAuthRequest other = (ImportBackendAuthRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBackendEnvironmentName() == null ^ this.getBackendEnvironmentName() == null)
            return false;
        if (other.getBackendEnvironmentName() != null && other.getBackendEnvironmentName().equals(this.getBackendEnvironmentName()) == false)
            return false;
        if (other.getIdentityPoolId() == null ^ this.getIdentityPoolId() == null)
            return false;
        if (other.getIdentityPoolId() != null && other.getIdentityPoolId().equals(this.getIdentityPoolId()) == false)
            return false;
        if (other.getNativeClientId() == null ^ this.getNativeClientId() == null)
            return false;
        if (other.getNativeClientId() != null && other.getNativeClientId().equals(this.getNativeClientId()) == false)
            return false;
        if (other.getUserPoolId() == null ^ this.getUserPoolId() == null)
            return false;
        if (other.getUserPoolId() != null && other.getUserPoolId().equals(this.getUserPoolId()) == false)
            return false;
        if (other.getWebClientId() == null ^ this.getWebClientId() == null)
            return false;
        if (other.getWebClientId() != null && other.getWebClientId().equals(this.getWebClientId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBackendEnvironmentName() == null) ? 0 : getBackendEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getIdentityPoolId() == null) ? 0 : getIdentityPoolId().hashCode());
        hashCode = prime * hashCode + ((getNativeClientId() == null) ? 0 : getNativeClientId().hashCode());
        hashCode = prime * hashCode + ((getUserPoolId() == null) ? 0 : getUserPoolId().hashCode());
        hashCode = prime * hashCode + ((getWebClientId() == null) ? 0 : getWebClientId().hashCode());
        return hashCode;
    }

    @Override
    public ImportBackendAuthRequest clone() {
        return (ImportBackendAuthRequest) super.clone();
    }

}
