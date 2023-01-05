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
package com.amazonaws.services.amplifyuibuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/DeleteTheme" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteThemeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the Amplify app associated with the theme to delete.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The unique ID of the theme to delete.
     * </p>
     */
    private String id;

    /**
     * <p>
     * The unique ID of the Amplify app associated with the theme to delete.
     * </p>
     * 
     * @param appId
     *        The unique ID of the Amplify app associated with the theme to delete.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID of the Amplify app associated with the theme to delete.
     * </p>
     * 
     * @return The unique ID of the Amplify app associated with the theme to delete.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID of the Amplify app associated with the theme to delete.
     * </p>
     * 
     * @param appId
     *        The unique ID of the Amplify app associated with the theme to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteThemeRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment that is a part of the Amplify app.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     * 
     * @return The name of the backend environment that is a part of the Amplify app.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the backend environment that is a part of the Amplify app.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment that is a part of the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteThemeRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The unique ID of the theme to delete.
     * </p>
     * 
     * @param id
     *        The unique ID of the theme to delete.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID of the theme to delete.
     * </p>
     * 
     * @return The unique ID of the theme to delete.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID of the theme to delete.
     * </p>
     * 
     * @param id
     *        The unique ID of the theme to delete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteThemeRequest withId(String id) {
        setId(id);
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
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteThemeRequest == false)
            return false;
        DeleteThemeRequest other = (DeleteThemeRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public DeleteThemeRequest clone() {
        return (DeleteThemeRequest) super.clone();
    }

}
