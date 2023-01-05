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
package com.amazonaws.services.workspacesweb.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/ListUserAccessLoggingSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListUserAccessLoggingSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The user access logging settings.
     * </p>
     */
    private java.util.List<UserAccessLoggingSettingsSummary> userAccessLoggingSettings;

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @return The pagination token used to retrieve the next page of results for this operation.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The pagination token used to retrieve the next page of results for this operation.
     * </p>
     * 
     * @param nextToken
     *        The pagination token used to retrieve the next page of results for this operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserAccessLoggingSettingsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The user access logging settings.
     * </p>
     * 
     * @return The user access logging settings.
     */

    public java.util.List<UserAccessLoggingSettingsSummary> getUserAccessLoggingSettings() {
        return userAccessLoggingSettings;
    }

    /**
     * <p>
     * The user access logging settings.
     * </p>
     * 
     * @param userAccessLoggingSettings
     *        The user access logging settings.
     */

    public void setUserAccessLoggingSettings(java.util.Collection<UserAccessLoggingSettingsSummary> userAccessLoggingSettings) {
        if (userAccessLoggingSettings == null) {
            this.userAccessLoggingSettings = null;
            return;
        }

        this.userAccessLoggingSettings = new java.util.ArrayList<UserAccessLoggingSettingsSummary>(userAccessLoggingSettings);
    }

    /**
     * <p>
     * The user access logging settings.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUserAccessLoggingSettings(java.util.Collection)} or
     * {@link #withUserAccessLoggingSettings(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param userAccessLoggingSettings
     *        The user access logging settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserAccessLoggingSettingsResult withUserAccessLoggingSettings(UserAccessLoggingSettingsSummary... userAccessLoggingSettings) {
        if (this.userAccessLoggingSettings == null) {
            setUserAccessLoggingSettings(new java.util.ArrayList<UserAccessLoggingSettingsSummary>(userAccessLoggingSettings.length));
        }
        for (UserAccessLoggingSettingsSummary ele : userAccessLoggingSettings) {
            this.userAccessLoggingSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The user access logging settings.
     * </p>
     * 
     * @param userAccessLoggingSettings
     *        The user access logging settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListUserAccessLoggingSettingsResult withUserAccessLoggingSettings(java.util.Collection<UserAccessLoggingSettingsSummary> userAccessLoggingSettings) {
        setUserAccessLoggingSettings(userAccessLoggingSettings);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getUserAccessLoggingSettings() != null)
            sb.append("UserAccessLoggingSettings: ").append(getUserAccessLoggingSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListUserAccessLoggingSettingsResult == false)
            return false;
        ListUserAccessLoggingSettingsResult other = (ListUserAccessLoggingSettingsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getUserAccessLoggingSettings() == null ^ this.getUserAccessLoggingSettings() == null)
            return false;
        if (other.getUserAccessLoggingSettings() != null && other.getUserAccessLoggingSettings().equals(this.getUserAccessLoggingSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getUserAccessLoggingSettings() == null) ? 0 : getUserAccessLoggingSettings().hashCode());
        return hashCode;
    }

    @Override
    public ListUserAccessLoggingSettingsResult clone() {
        try {
            return (ListUserAccessLoggingSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
