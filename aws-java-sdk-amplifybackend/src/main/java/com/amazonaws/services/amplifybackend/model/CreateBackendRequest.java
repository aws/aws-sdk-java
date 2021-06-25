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
 * The request body for CreateBackend.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CreateBackend" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateBackendRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The name of the backend environment.
     * </p>
     */
    private String backendEnvironmentName;
    /**
     * <p>
     * The resource configuration for the create backend request.
     * </p>
     */
    private ResourceConfig resourceConfig;
    /**
     * <p>
     * The name of the resource.
     * </p>
     */
    private String resourceName;

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

    public CreateBackendRequest withAppId(String appId) {
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

    public CreateBackendRequest withAppName(String appName) {
        setAppName(appName);
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

    public CreateBackendRequest withBackendEnvironmentName(String backendEnvironmentName) {
        setBackendEnvironmentName(backendEnvironmentName);
        return this;
    }

    /**
     * <p>
     * The resource configuration for the create backend request.
     * </p>
     * 
     * @param resourceConfig
     *        The resource configuration for the create backend request.
     */

    public void setResourceConfig(ResourceConfig resourceConfig) {
        this.resourceConfig = resourceConfig;
    }

    /**
     * <p>
     * The resource configuration for the create backend request.
     * </p>
     * 
     * @return The resource configuration for the create backend request.
     */

    public ResourceConfig getResourceConfig() {
        return this.resourceConfig;
    }

    /**
     * <p>
     * The resource configuration for the create backend request.
     * </p>
     * 
     * @param resourceConfig
     *        The resource configuration for the create backend request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendRequest withResourceConfig(ResourceConfig resourceConfig) {
        setResourceConfig(resourceConfig);
        return this;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @return The name of the resource.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of the resource.
     * </p>
     * 
     * @param resourceName
     *        The name of the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateBackendRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
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
        if (getAppName() != null)
            sb.append("AppName: ").append(getAppName()).append(",");
        if (getBackendEnvironmentName() != null)
            sb.append("BackendEnvironmentName: ").append(getBackendEnvironmentName()).append(",");
        if (getResourceConfig() != null)
            sb.append("ResourceConfig: ").append(getResourceConfig()).append(",");
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateBackendRequest == false)
            return false;
        CreateBackendRequest other = (CreateBackendRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getAppName() == null ^ this.getAppName() == null)
            return false;
        if (other.getAppName() != null && other.getAppName().equals(this.getAppName()) == false)
            return false;
        if (other.getBackendEnvironmentName() == null ^ this.getBackendEnvironmentName() == null)
            return false;
        if (other.getBackendEnvironmentName() != null && other.getBackendEnvironmentName().equals(this.getBackendEnvironmentName()) == false)
            return false;
        if (other.getResourceConfig() == null ^ this.getResourceConfig() == null)
            return false;
        if (other.getResourceConfig() != null && other.getResourceConfig().equals(this.getResourceConfig()) == false)
            return false;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getAppName() == null) ? 0 : getAppName().hashCode());
        hashCode = prime * hashCode + ((getBackendEnvironmentName() == null) ? 0 : getBackendEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getResourceConfig() == null) ? 0 : getResourceConfig().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        return hashCode;
    }

    @Override
    public CreateBackendRequest clone() {
        return (CreateBackendRequest) super.clone();
    }

}
