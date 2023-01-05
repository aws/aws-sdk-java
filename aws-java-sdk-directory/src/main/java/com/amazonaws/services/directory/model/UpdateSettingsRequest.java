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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the directory for which to update settings.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The list of <a>Setting</a> objects.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Setting> settings;

    /**
     * <p>
     * The identifier of the directory for which to update settings.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for which to update settings.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for which to update settings.
     * </p>
     * 
     * @return The identifier of the directory for which to update settings.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The identifier of the directory for which to update settings.
     * </p>
     * 
     * @param directoryId
     *        The identifier of the directory for which to update settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSettingsRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The list of <a>Setting</a> objects.
     * </p>
     * 
     * @return The list of <a>Setting</a> objects.
     */

    public java.util.List<Setting> getSettings() {
        if (settings == null) {
            settings = new com.amazonaws.internal.SdkInternalList<Setting>();
        }
        return settings;
    }

    /**
     * <p>
     * The list of <a>Setting</a> objects.
     * </p>
     * 
     * @param settings
     *        The list of <a>Setting</a> objects.
     */

    public void setSettings(java.util.Collection<Setting> settings) {
        if (settings == null) {
            this.settings = null;
            return;
        }

        this.settings = new com.amazonaws.internal.SdkInternalList<Setting>(settings);
    }

    /**
     * <p>
     * The list of <a>Setting</a> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSettings(java.util.Collection)} or {@link #withSettings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param settings
     *        The list of <a>Setting</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSettingsRequest withSettings(Setting... settings) {
        if (this.settings == null) {
            setSettings(new com.amazonaws.internal.SdkInternalList<Setting>(settings.length));
        }
        for (Setting ele : settings) {
            this.settings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of <a>Setting</a> objects.
     * </p>
     * 
     * @param settings
     *        The list of <a>Setting</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSettingsRequest withSettings(java.util.Collection<Setting> settings) {
        setSettings(settings);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSettingsRequest == false)
            return false;
        UpdateSettingsRequest other = (UpdateSettingsRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSettingsRequest clone() {
        return (UpdateSettingsRequest) super.clone();
    }

}
