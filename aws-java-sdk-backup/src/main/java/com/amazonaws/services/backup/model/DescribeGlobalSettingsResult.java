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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/backup-2018-11-15/DescribeGlobalSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeGlobalSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of resources along with the opt-in preferences for the account.
     * </p>
     */
    private java.util.Map<String, String> globalSettings;
    /**
     * <p>
     * The date and time that the global settings were last updated. This update is in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>LastUpdateTime</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     */
    private java.util.Date lastUpdateTime;

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

    public DescribeGlobalSettingsResult withGlobalSettings(java.util.Map<String, String> globalSettings) {
        setGlobalSettings(globalSettings);
        return this;
    }

    /**
     * Add a single GlobalSettings entry
     *
     * @see DescribeGlobalSettingsResult#withGlobalSettings
     * @returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalSettingsResult addGlobalSettingsEntry(String key, String value) {
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

    public DescribeGlobalSettingsResult clearGlobalSettingsEntries() {
        this.globalSettings = null;
        return this;
    }

    /**
     * <p>
     * The date and time that the global settings were last updated. This update is in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>LastUpdateTime</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastUpdateTime
     *        The date and time that the global settings were last updated. This update is in Unix format and
     *        Coordinated Universal Time (UTC). The value of <code>LastUpdateTime</code> is accurate to milliseconds.
     *        For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public void setLastUpdateTime(java.util.Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    /**
     * <p>
     * The date and time that the global settings were last updated. This update is in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>LastUpdateTime</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @return The date and time that the global settings were last updated. This update is in Unix format and
     *         Coordinated Universal Time (UTC). The value of <code>LastUpdateTime</code> is accurate to milliseconds.
     *         For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     */

    public java.util.Date getLastUpdateTime() {
        return this.lastUpdateTime;
    }

    /**
     * <p>
     * The date and time that the global settings were last updated. This update is in Unix format and Coordinated
     * Universal Time (UTC). The value of <code>LastUpdateTime</code> is accurate to milliseconds. For example, the
     * value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * </p>
     * 
     * @param lastUpdateTime
     *        The date and time that the global settings were last updated. This update is in Unix format and
     *        Coordinated Universal Time (UTC). The value of <code>LastUpdateTime</code> is accurate to milliseconds.
     *        For example, the value 1516925490.087 represents Friday, January 26, 2018 12:11:30.087 AM.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeGlobalSettingsResult withLastUpdateTime(java.util.Date lastUpdateTime) {
        setLastUpdateTime(lastUpdateTime);
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
            sb.append("GlobalSettings: ").append(getGlobalSettings()).append(",");
        if (getLastUpdateTime() != null)
            sb.append("LastUpdateTime: ").append(getLastUpdateTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeGlobalSettingsResult == false)
            return false;
        DescribeGlobalSettingsResult other = (DescribeGlobalSettingsResult) obj;
        if (other.getGlobalSettings() == null ^ this.getGlobalSettings() == null)
            return false;
        if (other.getGlobalSettings() != null && other.getGlobalSettings().equals(this.getGlobalSettings()) == false)
            return false;
        if (other.getLastUpdateTime() == null ^ this.getLastUpdateTime() == null)
            return false;
        if (other.getLastUpdateTime() != null && other.getLastUpdateTime().equals(this.getLastUpdateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGlobalSettings() == null) ? 0 : getGlobalSettings().hashCode());
        hashCode = prime * hashCode + ((getLastUpdateTime() == null) ? 0 : getLastUpdateTime().hashCode());
        return hashCode;
    }

    @Override
    public DescribeGlobalSettingsResult clone() {
        try {
            return (DescribeGlobalSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
