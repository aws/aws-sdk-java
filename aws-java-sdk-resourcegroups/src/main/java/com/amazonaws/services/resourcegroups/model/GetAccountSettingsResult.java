/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.resourcegroups.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/GetAccountSettings" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetAccountSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The current settings for the optional features in Resource Groups.
     * </p>
     */
    private AccountSettings accountSettings;

    /**
     * <p>
     * The current settings for the optional features in Resource Groups.
     * </p>
     * 
     * @param accountSettings
     *        The current settings for the optional features in Resource Groups.
     */

    public void setAccountSettings(AccountSettings accountSettings) {
        this.accountSettings = accountSettings;
    }

    /**
     * <p>
     * The current settings for the optional features in Resource Groups.
     * </p>
     * 
     * @return The current settings for the optional features in Resource Groups.
     */

    public AccountSettings getAccountSettings() {
        return this.accountSettings;
    }

    /**
     * <p>
     * The current settings for the optional features in Resource Groups.
     * </p>
     * 
     * @param accountSettings
     *        The current settings for the optional features in Resource Groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetAccountSettingsResult withAccountSettings(AccountSettings accountSettings) {
        setAccountSettings(accountSettings);
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
        if (getAccountSettings() != null)
            sb.append("AccountSettings: ").append(getAccountSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetAccountSettingsResult == false)
            return false;
        GetAccountSettingsResult other = (GetAccountSettingsResult) obj;
        if (other.getAccountSettings() == null ^ this.getAccountSettings() == null)
            return false;
        if (other.getAccountSettings() != null && other.getAccountSettings().equals(this.getAccountSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountSettings() == null) ? 0 : getAccountSettings().hashCode());
        return hashCode;
    }

    @Override
    public GetAccountSettingsResult clone() {
        try {
            return (GetAccountSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
