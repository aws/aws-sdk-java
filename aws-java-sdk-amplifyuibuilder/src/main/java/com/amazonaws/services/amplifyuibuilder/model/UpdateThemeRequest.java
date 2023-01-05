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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/amplifyuibuilder-2021-08-11/UpdateTheme" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateThemeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID for the Amplify app.
     * </p>
     */
    private String appId;
    /**
     * <p>
     * The unique client token.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The name of the backend environment that is part of the Amplify app.
     * </p>
     */
    private String environmentName;
    /**
     * <p>
     * The unique ID for the theme.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The configuration of the updated theme.
     * </p>
     */
    private UpdateThemeData updatedTheme;

    /**
     * <p>
     * The unique ID for the Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID for the Amplify app.
     */

    public void setAppId(String appId) {
        this.appId = appId;
    }

    /**
     * <p>
     * The unique ID for the Amplify app.
     * </p>
     * 
     * @return The unique ID for the Amplify app.
     */

    public String getAppId() {
        return this.appId;
    }

    /**
     * <p>
     * The unique ID for the Amplify app.
     * </p>
     * 
     * @param appId
     *        The unique ID for the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeRequest withAppId(String appId) {
        setAppId(appId);
        return this;
    }

    /**
     * <p>
     * The unique client token.
     * </p>
     * 
     * @param clientToken
     *        The unique client token.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * The unique client token.
     * </p>
     * 
     * @return The unique client token.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * The unique client token.
     * </p>
     * 
     * @param clientToken
     *        The unique client token.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The name of the backend environment that is part of the Amplify app.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment that is part of the Amplify app.
     */

    public void setEnvironmentName(String environmentName) {
        this.environmentName = environmentName;
    }

    /**
     * <p>
     * The name of the backend environment that is part of the Amplify app.
     * </p>
     * 
     * @return The name of the backend environment that is part of the Amplify app.
     */

    public String getEnvironmentName() {
        return this.environmentName;
    }

    /**
     * <p>
     * The name of the backend environment that is part of the Amplify app.
     * </p>
     * 
     * @param environmentName
     *        The name of the backend environment that is part of the Amplify app.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeRequest withEnvironmentName(String environmentName) {
        setEnvironmentName(environmentName);
        return this;
    }

    /**
     * <p>
     * The unique ID for the theme.
     * </p>
     * 
     * @param id
     *        The unique ID for the theme.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique ID for the theme.
     * </p>
     * 
     * @return The unique ID for the theme.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique ID for the theme.
     * </p>
     * 
     * @param id
     *        The unique ID for the theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The configuration of the updated theme.
     * </p>
     * 
     * @param updatedTheme
     *        The configuration of the updated theme.
     */

    public void setUpdatedTheme(UpdateThemeData updatedTheme) {
        this.updatedTheme = updatedTheme;
    }

    /**
     * <p>
     * The configuration of the updated theme.
     * </p>
     * 
     * @return The configuration of the updated theme.
     */

    public UpdateThemeData getUpdatedTheme() {
        return this.updatedTheme;
    }

    /**
     * <p>
     * The configuration of the updated theme.
     * </p>
     * 
     * @param updatedTheme
     *        The configuration of the updated theme.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateThemeRequest withUpdatedTheme(UpdateThemeData updatedTheme) {
        setUpdatedTheme(updatedTheme);
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
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getEnvironmentName() != null)
            sb.append("EnvironmentName: ").append(getEnvironmentName()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getUpdatedTheme() != null)
            sb.append("UpdatedTheme: ").append(getUpdatedTheme());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateThemeRequest == false)
            return false;
        UpdateThemeRequest other = (UpdateThemeRequest) obj;
        if (other.getAppId() == null ^ this.getAppId() == null)
            return false;
        if (other.getAppId() != null && other.getAppId().equals(this.getAppId()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getEnvironmentName() == null ^ this.getEnvironmentName() == null)
            return false;
        if (other.getEnvironmentName() != null && other.getEnvironmentName().equals(this.getEnvironmentName()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getUpdatedTheme() == null ^ this.getUpdatedTheme() == null)
            return false;
        if (other.getUpdatedTheme() != null && other.getUpdatedTheme().equals(this.getUpdatedTheme()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAppId() == null) ? 0 : getAppId().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getEnvironmentName() == null) ? 0 : getEnvironmentName().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTheme() == null) ? 0 : getUpdatedTheme().hashCode());
        return hashCode;
    }

    @Override
    public UpdateThemeRequest clone() {
        return (UpdateThemeRequest) super.clone();
    }

}
