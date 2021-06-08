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
 * The request body for GenerateBackendAPIModels.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/GenerateBackendAPIModels"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GenerateBackendAPIModelsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The name of this resource.
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

    public GenerateBackendAPIModelsRequest withAppId(String appId) {
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

    public GenerateBackendAPIModelsRequest withBackendEnvironmentName(String backendEnvironmentName) {
        setBackendEnvironmentName(backendEnvironmentName);
        return this;
    }

    /**
     * <p>
     * The name of this resource.
     * </p>
     * 
     * @param resourceName
     *        The name of this resource.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The name of this resource.
     * </p>
     * 
     * @return The name of this resource.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The name of this resource.
     * </p>
     * 
     * @param resourceName
     *        The name of this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GenerateBackendAPIModelsRequest withResourceName(String resourceName) {
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
        if (getBackendEnvironmentName() != null)
            sb.append("BackendEnvironmentName: ").append(getBackendEnvironmentName()).append(",");
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

        if (obj instanceof GenerateBackendAPIModelsRequest == false)
            return false;
        GenerateBackendAPIModelsRequest other = (GenerateBackendAPIModelsRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBackendEnvironmentName() == null ^ this.getBackendEnvironmentName() == null)
            return false;
        if (other.getBackendEnvironmentName() != null && other.getBackendEnvironmentName().equals(this.getBackendEnvironmentName()) == false)
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
        hashCode = prime * hashCode + ((getBackendEnvironmentName() == null) ? 0 : getBackendEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        return hashCode;
    }

    @Override
    public GenerateBackendAPIModelsRequest clone() {
        return (GenerateBackendAPIModelsRequest) super.clone();
    }

}
