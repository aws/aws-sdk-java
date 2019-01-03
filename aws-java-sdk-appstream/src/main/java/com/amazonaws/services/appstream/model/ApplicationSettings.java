/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.appstream.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The persistent application settings for users of a stack.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appstream-2016-12-01/ApplicationSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ApplicationSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Enables or disables persistent application settings for users during their streaming sessions.
     * </p>
     */
    private Boolean enabled;
    /**
     * <p>
     * The path prefix for the S3 bucket where users’ persistent application settings are stored. You can allow the same
     * persistent application settings to be used across multiple stacks by specifying the same settings group for each
     * stack.
     * </p>
     */
    private String settingsGroup;

    /**
     * <p>
     * Enables or disables persistent application settings for users during their streaming sessions.
     * </p>
     * 
     * @param enabled
     *        Enables or disables persistent application settings for users during their streaming sessions.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Enables or disables persistent application settings for users during their streaming sessions.
     * </p>
     * 
     * @return Enables or disables persistent application settings for users during their streaming sessions.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Enables or disables persistent application settings for users during their streaming sessions.
     * </p>
     * 
     * @param enabled
     *        Enables or disables persistent application settings for users during their streaming sessions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettings withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Enables or disables persistent application settings for users during their streaming sessions.
     * </p>
     * 
     * @return Enables or disables persistent application settings for users during their streaming sessions.
     */

    public Boolean isEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * The path prefix for the S3 bucket where users’ persistent application settings are stored. You can allow the same
     * persistent application settings to be used across multiple stacks by specifying the same settings group for each
     * stack.
     * </p>
     * 
     * @param settingsGroup
     *        The path prefix for the S3 bucket where users’ persistent application settings are stored. You can allow
     *        the same persistent application settings to be used across multiple stacks by specifying the same settings
     *        group for each stack.
     */

    public void setSettingsGroup(String settingsGroup) {
        this.settingsGroup = settingsGroup;
    }

    /**
     * <p>
     * The path prefix for the S3 bucket where users’ persistent application settings are stored. You can allow the same
     * persistent application settings to be used across multiple stacks by specifying the same settings group for each
     * stack.
     * </p>
     * 
     * @return The path prefix for the S3 bucket where users’ persistent application settings are stored. You can allow
     *         the same persistent application settings to be used across multiple stacks by specifying the same
     *         settings group for each stack.
     */

    public String getSettingsGroup() {
        return this.settingsGroup;
    }

    /**
     * <p>
     * The path prefix for the S3 bucket where users’ persistent application settings are stored. You can allow the same
     * persistent application settings to be used across multiple stacks by specifying the same settings group for each
     * stack.
     * </p>
     * 
     * @param settingsGroup
     *        The path prefix for the S3 bucket where users’ persistent application settings are stored. You can allow
     *        the same persistent application settings to be used across multiple stacks by specifying the same settings
     *        group for each stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ApplicationSettings withSettingsGroup(String settingsGroup) {
        setSettingsGroup(settingsGroup);
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
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled()).append(",");
        if (getSettingsGroup() != null)
            sb.append("SettingsGroup: ").append(getSettingsGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ApplicationSettings == false)
            return false;
        ApplicationSettings other = (ApplicationSettings) obj;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        if (other.getSettingsGroup() == null ^ this.getSettingsGroup() == null)
            return false;
        if (other.getSettingsGroup() != null && other.getSettingsGroup().equals(this.getSettingsGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        hashCode = prime * hashCode + ((getSettingsGroup() == null) ? 0 : getSettingsGroup().hashCode());
        return hashCode;
    }

    @Override
    public ApplicationSettings clone() {
        try {
            return (ApplicationSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appstream.model.transform.ApplicationSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
