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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workspaces-web-2020-07-08/UpdateUserAccessLoggingSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateUserAccessLoggingSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * The user access logging settings.
     * </p>
     */
    private UserAccessLoggingSettings userAccessLoggingSettings;

    /**
     * <p>
     * The user access logging settings.
     * </p>
     * 
     * @param userAccessLoggingSettings
     *        The user access logging settings.
     */

    public void setUserAccessLoggingSettings(UserAccessLoggingSettings userAccessLoggingSettings) {
        this.userAccessLoggingSettings = userAccessLoggingSettings;
    }

    /**
     * <p>
     * The user access logging settings.
     * </p>
     * 
     * @return The user access logging settings.
     */

    public UserAccessLoggingSettings getUserAccessLoggingSettings() {
        return this.userAccessLoggingSettings;
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

    public UpdateUserAccessLoggingSettingsResult withUserAccessLoggingSettings(UserAccessLoggingSettings userAccessLoggingSettings) {
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

        if (obj instanceof UpdateUserAccessLoggingSettingsResult == false)
            return false;
        UpdateUserAccessLoggingSettingsResult other = (UpdateUserAccessLoggingSettingsResult) obj;
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

        hashCode = prime * hashCode + ((getUserAccessLoggingSettings() == null) ? 0 : getUserAccessLoggingSettings().hashCode());
        return hashCode;
    }

    @Override
    public UpdateUserAccessLoggingSettingsResult clone() {
        try {
            return (UpdateUserAccessLoggingSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
