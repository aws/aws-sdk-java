/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/DeleteApp" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteAppRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The domain ID.
     * </p>
     */
    private String domainId;
    /**
     * <p>
     * The user profile name. If this value is not set, then <code>SpaceName</code> must be set.
     * </p>
     */
    private String userProfileName;
    /**
     * <p>
     * The type of app.
     * </p>
     */
    private String appType;
    /**
     * <p>
     * The name of the app.
     * </p>
     */
    private String appName;
    /**
     * <p>
     * The name of the space. If this value is not set, then <code>UserProfileName</code> must be set.
     * </p>
     */
    private String spaceName;

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @param domainId
     *        The domain ID.
     */

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @return The domain ID.
     */

    public String getDomainId() {
        return this.domainId;
    }

    /**
     * <p>
     * The domain ID.
     * </p>
     * 
     * @param domainId
     *        The domain ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppRequest withDomainId(String domainId) {
        setDomainId(domainId);
        return this;
    }

    /**
     * <p>
     * The user profile name. If this value is not set, then <code>SpaceName</code> must be set.
     * </p>
     * 
     * @param userProfileName
     *        The user profile name. If this value is not set, then <code>SpaceName</code> must be set.
     */

    public void setUserProfileName(String userProfileName) {
        this.userProfileName = userProfileName;
    }

    /**
     * <p>
     * The user profile name. If this value is not set, then <code>SpaceName</code> must be set.
     * </p>
     * 
     * @return The user profile name. If this value is not set, then <code>SpaceName</code> must be set.
     */

    public String getUserProfileName() {
        return this.userProfileName;
    }

    /**
     * <p>
     * The user profile name. If this value is not set, then <code>SpaceName</code> must be set.
     * </p>
     * 
     * @param userProfileName
     *        The user profile name. If this value is not set, then <code>SpaceName</code> must be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppRequest withUserProfileName(String userProfileName) {
        setUserProfileName(userProfileName);
        return this;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * 
     * @param appType
     *        The type of app.
     * @see AppType
     */

    public void setAppType(String appType) {
        this.appType = appType;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * 
     * @return The type of app.
     * @see AppType
     */

    public String getAppType() {
        return this.appType;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * 
     * @param appType
     *        The type of app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public DeleteAppRequest withAppType(String appType) {
        setAppType(appType);
        return this;
    }

    /**
     * <p>
     * The type of app.
     * </p>
     * 
     * @param appType
     *        The type of app.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AppType
     */

    public DeleteAppRequest withAppType(AppType appType) {
        this.appType = appType.toString();
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

    public DeleteAppRequest withAppName(String appName) {
        setAppName(appName);
        return this;
    }

    /**
     * <p>
     * The name of the space. If this value is not set, then <code>UserProfileName</code> must be set.
     * </p>
     * 
     * @param spaceName
     *        The name of the space. If this value is not set, then <code>UserProfileName</code> must be set.
     */

    public void setSpaceName(String spaceName) {
        this.spaceName = spaceName;
    }

    /**
     * <p>
     * The name of the space. If this value is not set, then <code>UserProfileName</code> must be set.
     * </p>
     * 
     * @return The name of the space. If this value is not set, then <code>UserProfileName</code> must be set.
     */

    public String getSpaceName() {
        return this.spaceName;
    }

    /**
     * <p>
     * The name of the space. If this value is not set, then <code>UserProfileName</code> must be set.
     * </p>
     * 
     * @param spaceName
     *        The name of the space. If this value is not set, then <code>UserProfileName</code> must be set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteAppRequest withSpaceName(String spaceName) {
        setSpaceName(spaceName);
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
        if (getDomainId() != null)
            sb.append("DomainId: ").append(getDomainId()).append(",");
        if (getUserProfileName() != null)
            sb.append("UserProfileName: ").append(getUserProfileName()).append(",");
        if (getAppType() != null)
            sb.append("AppType: ").append(getAppType()).append(",");
        if (getAppName() != null)
            sb.append("AppName: ").append(getAppName()).append(",");
        if (getSpaceName() != null)
            sb.append("SpaceName: ").append(getSpaceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteAppRequest == false)
            return false;
        DeleteAppRequest other = (DeleteAppRequest) obj;
        if (other.getDomainId() == null ^ this.getDomainId() == null)
            return false;
        if (other.getDomainId() != null && other.getDomainId().equals(this.getDomainId()) == false)
            return false;
        if (other.getUserProfileName() == null ^ this.getUserProfileName() == null)
            return false;
        if (other.getUserProfileName() != null && other.getUserProfileName().equals(this.getUserProfileName()) == false)
            return false;
        if (other.getAppType() == null ^ this.getAppType() == null)
            return false;
        if (other.getAppType() != null && other.getAppType().equals(this.getAppType()) == false)
            return false;
        if (other.getAppName() == null ^ this.getAppName() == null)
            return false;
        if (other.getAppName() != null && other.getAppName().equals(this.getAppName()) == false)
            return false;
        if (other.getSpaceName() == null ^ this.getSpaceName() == null)
            return false;
        if (other.getSpaceName() != null && other.getSpaceName().equals(this.getSpaceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainId() == null) ? 0 : getDomainId().hashCode());
        hashCode = prime * hashCode + ((getUserProfileName() == null) ? 0 : getUserProfileName().hashCode());
        hashCode = prime * hashCode + ((getAppType() == null) ? 0 : getAppType().hashCode());
        hashCode = prime * hashCode + ((getAppName() == null) ? 0 : getAppName().hashCode());
        hashCode = prime * hashCode + ((getSpaceName() == null) ? 0 : getSpaceName().hashCode());
        return hashCode;
    }

    @Override
    public DeleteAppRequest clone() {
        return (DeleteAppRequest) super.clone();
    }

}
