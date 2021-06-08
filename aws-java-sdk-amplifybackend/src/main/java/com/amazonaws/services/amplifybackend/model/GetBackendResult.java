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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GetBackend" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetBackendResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A stringified version of the current configurations for your Amplify project.
     * </p>
     */
    private String amplifyMetaConfig;
    /**
     * <p>
     * The app ID.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The name of the app.
     * </p>
     */
    private String appName;
    /**
     * <p>
     * A list of backend environments in an array.
     * </p>
     */
    private java.util.List<String> backendEnvironmentList;
    /**
     * <p>
     * The name of the backend environment.
     * </p>
     */
    private String backendEnvironmentName;
    /**
     * <p>
     * If the request failed, this is the returned error.
     * </p>
     */
    private String error;

    /**
     * <p>
     * A stringified version of the current configurations for your Amplify project.
     * </p>
     * 
     * @param amplifyMetaConfig
     *        A stringified version of the current configurations for your Amplify project.
     */

    public void setAmplifyMetaConfig(String amplifyMetaConfig) {
        this.amplifyMetaConfig = amplifyMetaConfig;
    }

    /**
     * <p>
     * A stringified version of the current configurations for your Amplify project.
     * </p>
     * 
     * @return A stringified version of the current configurations for your Amplify project.
     */

    public String getAmplifyMetaConfig() {
        return this.amplifyMetaConfig;
    }

    /**
     * <p>
     * A stringified version of the current configurations for your Amplify project.
     * </p>
     * 
     * @param amplifyMetaConfig
     *        A stringified version of the current configurations for your Amplify project.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackendResult withAmplifyMetaConfig(String amplifyMetaConfig) {
        setAmplifyMetaConfig(amplifyMetaConfig);
        return this;
    }

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

    public GetBackendResult withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * 
     * @param appName
     *        The name of the app.
     */

    public void setAppName(String appName) {
        this.appName = appName;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * 
     * @return The name of the app.
     */

    public String getAppName() {
        return this.appName;
    }

    /**
     * <p>
     * The name of the app.
     * </p>
     * 
     * @param appName
     *        The name of the app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackendResult withAppName(String appName) {
        setAppName(appName);
        return this;
    }

    /**
     * <p>
     * A list of backend environments in an array.
     * </p>
     * 
     * @return A list of backend environments in an array.
     */

    public java.util.List<String> getBackendEnvironmentList() {
        return backendEnvironmentList;
    }

    /**
     * <p>
     * A list of backend environments in an array.
     * </p>
     * 
     * @param backendEnvironmentList
     *        A list of backend environments in an array.
     */

    public void setBackendEnvironmentList(java.util.Collection<String> backendEnvironmentList) {
        if (backendEnvironmentList == null) {
            this.backendEnvironmentList = null;
            return;
        }

        this.backendEnvironmentList = new java.util.ArrayList<String>(backendEnvironmentList);
    }

    /**
     * <p>
     * A list of backend environments in an array.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBackendEnvironmentList(java.util.Collection)} or
     * {@link #withBackendEnvironmentList(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param backendEnvironmentList
     *        A list of backend environments in an array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackendResult withBackendEnvironmentList(String... backendEnvironmentList) {
        if (this.backendEnvironmentList == null) {
            setBackendEnvironmentList(new java.util.ArrayList<String>(backendEnvironmentList.length));
        }
        for (String ele : backendEnvironmentList) {
            this.backendEnvironmentList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of backend environments in an array.
     * </p>
     * 
     * @param backendEnvironmentList
     *        A list of backend environments in an array.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackendResult withBackendEnvironmentList(java.util.Collection<String> backendEnvironmentList) {
        setBackendEnvironmentList(backendEnvironmentList);
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

    public GetBackendResult withBackendEnvironmentName(String backendEnvironmentName) {
        setBackendEnvironmentName(backendEnvironmentName);
        return this;
    }

    /**
     * <p>
     * If the request failed, this is the returned error.
     * </p>
     * 
     * @param error
     *        If the request failed, this is the returned error.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * If the request failed, this is the returned error.
     * </p>
     * 
     * @return If the request failed, this is the returned error.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * If the request failed, this is the returned error.
     * </p>
     * 
     * @param error
     *        If the request failed, this is the returned error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetBackendResult withError(String error) {
        setError(error);
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
        if (getAmplifyMetaConfig() != null)
            sb.append("AmplifyMetaConfig: ").append(getAmplifyMetaConfig()).append(",");
        if (getAppId() != null)
            sb.append("AppId: ").append(getAppId()).append(",");
        if (getAppName() != null)
            sb.append("AppName: ").append(getAppName()).append(",");
        if (getBackendEnvironmentList() != null)
            sb.append("BackendEnvironmentList: ").append(getBackendEnvironmentList()).append(",");
        if (getBackendEnvironmentName() != null)
            sb.append("BackendEnvironmentName: ").append(getBackendEnvironmentName()).append(",");
        if (getError() != null)
            sb.append("Error: ").append(getError());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetBackendResult == false)
            return false;
        GetBackendResult other = (GetBackendResult) obj;
        if (other.getAmplifyMetaConfig() == null ^ this.getAmplifyMetaConfig() == null)
            return false;
        if (other.getAmplifyMetaConfig() != null && other.getAmplifyMetaConfig().equals(this.getAmplifyMetaConfig()) == false)
            return false;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getAppName() == null ^ this.getAppName() == null)
            return false;
        if (other.getAppName() != null && other.getAppName().equals(this.getAppName()) == false)
            return false;
        if (other.getBackendEnvironmentList() == null ^ this.getBackendEnvironmentList() == null)
            return false;
        if (other.getBackendEnvironmentList() != null && other.getBackendEnvironmentList().equals(this.getBackendEnvironmentList()) == false)
            return false;
        if (other.getBackendEnvironmentName() == null ^ this.getBackendEnvironmentName() == null)
            return false;
        if (other.getBackendEnvironmentName() != null && other.getBackendEnvironmentName().equals(this.getBackendEnvironmentName()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAmplifyMetaConfig() == null) ? 0 : getAmplifyMetaConfig().hashCode());
        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getAppName() == null) ? 0 : getAppName().hashCode());
        hashCode = prime * hashCode + ((getBackendEnvironmentList() == null) ? 0 : getBackendEnvironmentList().hashCode());
        hashCode = prime * hashCode + ((getBackendEnvironmentName() == null) ? 0 : getBackendEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        return hashCode;
    }

    @Override
    public GetBackendResult clone() {
        try {
            return (GetBackendResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
