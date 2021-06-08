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
 * The request body for CloneBackend.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifybackend-2020-08-11/CloneBackend" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CloneBackendRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The name of the destination backend environment to be created.
     * </p>
     */
    private String targetEnvironmentName;

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

    public CloneBackendRequest withAppId(String appId) {
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

    public CloneBackendRequest withBackendEnvironmentName(String backendEnvironmentName) {
        setBackendEnvironmentName(backendEnvironmentName);
        return this;
    }

    /**
     * <p>
     * The name of the destination backend environment to be created.
     * </p>
     * 
     * @param targetEnvironmentName
     *        The name of the destination backend environment to be created.
     */

    public void setTargetEnvironmentName(String targetEnvironmentName) {
        this.targetEnvironmentName = targetEnvironmentName;
    }

    /**
     * <p>
     * The name of the destination backend environment to be created.
     * </p>
     * 
     * @return The name of the destination backend environment to be created.
     */

    public String getTargetEnvironmentName() {
        return this.targetEnvironmentName;
    }

    /**
     * <p>
     * The name of the destination backend environment to be created.
     * </p>
     * 
     * @param targetEnvironmentName
     *        The name of the destination backend environment to be created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CloneBackendRequest withTargetEnvironmentName(String targetEnvironmentName) {
        setTargetEnvironmentName(targetEnvironmentName);
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
        if (getTargetEnvironmentName() != null)
            sb.append("TargetEnvironmentName: ").append(getTargetEnvironmentName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CloneBackendRequest == false)
            return false;
        CloneBackendRequest other = (CloneBackendRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getBackendEnvironmentName() == null ^ this.getBackendEnvironmentName() == null)
            return false;
        if (other.getBackendEnvironmentName() != null && other.getBackendEnvironmentName().equals(this.getBackendEnvironmentName()) == false)
            return false;
        if (other.getTargetEnvironmentName() == null ^ this.getTargetEnvironmentName() == null)
            return false;
        if (other.getTargetEnvironmentName() != null && other.getTargetEnvironmentName().equals(this.getTargetEnvironmentName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getBackendEnvironmentName() == null) ? 0 : getBackendEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getTargetEnvironmentName() == null) ? 0 : getTargetEnvironmentName().hashCode());
        return hashCode;
    }

    @Override
    public CloneBackendRequest clone() {
        return (CloneBackendRequest) super.clone();
    }

}
