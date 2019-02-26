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
package com.amazonaws.services.glacier.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the Amazon Glacier response to your request.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVaultNotificationsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Returns the notification configuration set on the vault.
     * </p>
     */
    private VaultNotificationConfig vaultNotificationConfig;

    /**
     * <p>
     * Returns the notification configuration set on the vault.
     * </p>
     * 
     * @param vaultNotificationConfig
     *        Returns the notification configuration set on the vault.
     */

    public void setVaultNotificationConfig(VaultNotificationConfig vaultNotificationConfig) {
        this.vaultNotificationConfig = vaultNotificationConfig;
    }

    /**
     * <p>
     * Returns the notification configuration set on the vault.
     * </p>
     * 
     * @return Returns the notification configuration set on the vault.
     */

    public VaultNotificationConfig getVaultNotificationConfig() {
        return this.vaultNotificationConfig;
    }

    /**
     * <p>
     * Returns the notification configuration set on the vault.
     * </p>
     * 
     * @param vaultNotificationConfig
     *        Returns the notification configuration set on the vault.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVaultNotificationsResult withVaultNotificationConfig(VaultNotificationConfig vaultNotificationConfig) {
        setVaultNotificationConfig(vaultNotificationConfig);
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
        if (getVaultNotificationConfig() != null)
            sb.append("VaultNotificationConfig: ").append(getVaultNotificationConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVaultNotificationsResult == false)
            return false;
        GetVaultNotificationsResult other = (GetVaultNotificationsResult) obj;
        if (other.getVaultNotificationConfig() == null ^ this.getVaultNotificationConfig() == null)
            return false;
        if (other.getVaultNotificationConfig() != null && other.getVaultNotificationConfig().equals(this.getVaultNotificationConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVaultNotificationConfig() == null) ? 0 : getVaultNotificationConfig().hashCode());
        return hashCode;
    }

    @Override
    public GetVaultNotificationsResult clone() {
        try {
            return (GetVaultNotificationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
