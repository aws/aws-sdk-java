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
package com.amazonaws.services.backup.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/UpdateGlobalSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateGlobalSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A list of resources along with the opt-in preferences for the account.
     * </p>
     */
    private java.util.Map<String, String> globalSettings;

    /**
     * <p>
     * A list of resources along with the opt-in preferences for the account.
     * </p>
     * 
     * @return A list of resources along with the opt-in preferences for the account.
     */

    public java.util.Map<String, String> getGlobalSettings() {
        return globalSettings;
    }

    /**
     * <p>
     * A list of resources along with the opt-in preferences for the account.
     * </p>
     * 
     * @param globalSettings
     *        A list of resources along with the opt-in preferences for the account.
     */

    public void setGlobalSettings(java.util.Map<String, String> globalSettings) {
        this.globalSettings = globalSettings;
    }

    /**
     * <p>
     * A list of resources along with the opt-in preferences for the account.
     * </p>
     * 
     * @param globalSettings
     *        A list of resources along with the opt-in preferences for the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalSettingsRequest withGlobalSettings(java.util.Map<String, String> globalSettings) {
        setGlobalSettings(globalSettings);
        return this;
    }

    /**
     * Add a single GlobalSettings entry
     *
     * @see UpdateGlobalSettingsRequest#withGlobalSettings
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalSettingsRequest addGlobalSettingsEntry(String key, String value) {
        if (null == this.globalSettings) {
            this.globalSettings = new java.util.HashMap<String, String>();
        }
        if (this.globalSettings.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.globalSettings.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into GlobalSettings.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateGlobalSettingsRequest clearGlobalSettingsEntries() {
        this.globalSettings = null;
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
        if (getGlobalSettings() != null)
            sb.append("GlobalSettings: ").append(getGlobalSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateGlobalSettingsRequest == false)
            return false;
        UpdateGlobalSettingsRequest other = (UpdateGlobalSettingsRequest) obj;
        if (other.getGlobalSettings() == null ^ this.getGlobalSettings() == null)
            return false;
        if (other.getGlobalSettings() != null && other.getGlobalSettings().equals(this.getGlobalSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalSettings() == null) ? 0 : getGlobalSettings().hashCode());
        return hashCode;
    }

    @Override
    public UpdateGlobalSettingsRequest clone() {
        return (UpdateGlobalSettingsRequest) super.clone();
    }

}
