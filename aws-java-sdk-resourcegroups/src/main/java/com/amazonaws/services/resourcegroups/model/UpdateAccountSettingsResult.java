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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/resource-groups-2017-11-27/UpdateAccountSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateAccountSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A structure that displays the status of the optional features in the account.
     * </p>
     */
    private AccountSettings accountSettings;

    /**
     * <p>
     * A structure that displays the status of the optional features in the account.
     * </p>
     * 
     * @param accountSettings
     *        A structure that displays the status of the optional features in the account.
     */

    public void setAccountSettings(AccountSettings accountSettings) {
        this.accountSettings = accountSettings;
    }

    /**
     * <p>
     * A structure that displays the status of the optional features in the account.
     * </p>
     * 
     * @return A structure that displays the status of the optional features in the account.
     */

    public AccountSettings getAccountSettings() {
        return this.accountSettings;
    }

    /**
     * <p>
     * A structure that displays the status of the optional features in the account.
     * </p>
     * 
     * @param accountSettings
     *        A structure that displays the status of the optional features in the account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateAccountSettingsResult withAccountSettings(AccountSettings accountSettings) {
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

        if (obj instanceof UpdateAccountSettingsResult == false)
            return false;
        UpdateAccountSettingsResult other = (UpdateAccountSettingsResult) obj;
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
    public UpdateAccountSettingsResult clone() {
        try {
            return (UpdateAccountSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
