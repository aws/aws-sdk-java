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
package com.amazonaws.services.licensemanagerlinuxsubscriptions.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-linux-subscriptions-2018-05-10/UpdateServiceSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateServiceSettingsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Describes if updates are allowed to the service settings for Linux subscriptions. If you allow updates, you can
     * aggregate Linux subscription data in more than one home Region.
     * </p>
     */
    private Boolean allowUpdate;
    /**
     * <p>
     * Describes if the discovery of Linux subscriptions is enabled.
     * </p>
     */
    private String linuxSubscriptionsDiscovery;
    /**
     * <p>
     * The settings defined for Linux subscriptions discovery. The settings include if Organizations integration has
     * been enabled, and which Regions data will be aggregated from.
     * </p>
     */
    private LinuxSubscriptionsDiscoverySettings linuxSubscriptionsDiscoverySettings;

    /**
     * <p>
     * Describes if updates are allowed to the service settings for Linux subscriptions. If you allow updates, you can
     * aggregate Linux subscription data in more than one home Region.
     * </p>
     * 
     * @param allowUpdate
     *        Describes if updates are allowed to the service settings for Linux subscriptions. If you allow updates,
     *        you can aggregate Linux subscription data in more than one home Region.
     */

    public void setAllowUpdate(Boolean allowUpdate) {
        this.allowUpdate = allowUpdate;
    }

    /**
     * <p>
     * Describes if updates are allowed to the service settings for Linux subscriptions. If you allow updates, you can
     * aggregate Linux subscription data in more than one home Region.
     * </p>
     * 
     * @return Describes if updates are allowed to the service settings for Linux subscriptions. If you allow updates,
     *         you can aggregate Linux subscription data in more than one home Region.
     */

    public Boolean getAllowUpdate() {
        return this.allowUpdate;
    }

    /**
     * <p>
     * Describes if updates are allowed to the service settings for Linux subscriptions. If you allow updates, you can
     * aggregate Linux subscription data in more than one home Region.
     * </p>
     * 
     * @param allowUpdate
     *        Describes if updates are allowed to the service settings for Linux subscriptions. If you allow updates,
     *        you can aggregate Linux subscription data in more than one home Region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSettingsRequest withAllowUpdate(Boolean allowUpdate) {
        setAllowUpdate(allowUpdate);
        return this;
    }

    /**
     * <p>
     * Describes if updates are allowed to the service settings for Linux subscriptions. If you allow updates, you can
     * aggregate Linux subscription data in more than one home Region.
     * </p>
     * 
     * @return Describes if updates are allowed to the service settings for Linux subscriptions. If you allow updates,
     *         you can aggregate Linux subscription data in more than one home Region.
     */

    public Boolean isAllowUpdate() {
        return this.allowUpdate;
    }

    /**
     * <p>
     * Describes if the discovery of Linux subscriptions is enabled.
     * </p>
     * 
     * @param linuxSubscriptionsDiscovery
     *        Describes if the discovery of Linux subscriptions is enabled.
     * @see LinuxSubscriptionsDiscovery
     */

    public void setLinuxSubscriptionsDiscovery(String linuxSubscriptionsDiscovery) {
        this.linuxSubscriptionsDiscovery = linuxSubscriptionsDiscovery;
    }

    /**
     * <p>
     * Describes if the discovery of Linux subscriptions is enabled.
     * </p>
     * 
     * @return Describes if the discovery of Linux subscriptions is enabled.
     * @see LinuxSubscriptionsDiscovery
     */

    public String getLinuxSubscriptionsDiscovery() {
        return this.linuxSubscriptionsDiscovery;
    }

    /**
     * <p>
     * Describes if the discovery of Linux subscriptions is enabled.
     * </p>
     * 
     * @param linuxSubscriptionsDiscovery
     *        Describes if the discovery of Linux subscriptions is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LinuxSubscriptionsDiscovery
     */

    public UpdateServiceSettingsRequest withLinuxSubscriptionsDiscovery(String linuxSubscriptionsDiscovery) {
        setLinuxSubscriptionsDiscovery(linuxSubscriptionsDiscovery);
        return this;
    }

    /**
     * <p>
     * Describes if the discovery of Linux subscriptions is enabled.
     * </p>
     * 
     * @param linuxSubscriptionsDiscovery
     *        Describes if the discovery of Linux subscriptions is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LinuxSubscriptionsDiscovery
     */

    public UpdateServiceSettingsRequest withLinuxSubscriptionsDiscovery(LinuxSubscriptionsDiscovery linuxSubscriptionsDiscovery) {
        this.linuxSubscriptionsDiscovery = linuxSubscriptionsDiscovery.toString();
        return this;
    }

    /**
     * <p>
     * The settings defined for Linux subscriptions discovery. The settings include if Organizations integration has
     * been enabled, and which Regions data will be aggregated from.
     * </p>
     * 
     * @param linuxSubscriptionsDiscoverySettings
     *        The settings defined for Linux subscriptions discovery. The settings include if Organizations integration
     *        has been enabled, and which Regions data will be aggregated from.
     */

    public void setLinuxSubscriptionsDiscoverySettings(LinuxSubscriptionsDiscoverySettings linuxSubscriptionsDiscoverySettings) {
        this.linuxSubscriptionsDiscoverySettings = linuxSubscriptionsDiscoverySettings;
    }

    /**
     * <p>
     * The settings defined for Linux subscriptions discovery. The settings include if Organizations integration has
     * been enabled, and which Regions data will be aggregated from.
     * </p>
     * 
     * @return The settings defined for Linux subscriptions discovery. The settings include if Organizations integration
     *         has been enabled, and which Regions data will be aggregated from.
     */

    public LinuxSubscriptionsDiscoverySettings getLinuxSubscriptionsDiscoverySettings() {
        return this.linuxSubscriptionsDiscoverySettings;
    }

    /**
     * <p>
     * The settings defined for Linux subscriptions discovery. The settings include if Organizations integration has
     * been enabled, and which Regions data will be aggregated from.
     * </p>
     * 
     * @param linuxSubscriptionsDiscoverySettings
     *        The settings defined for Linux subscriptions discovery. The settings include if Organizations integration
     *        has been enabled, and which Regions data will be aggregated from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateServiceSettingsRequest withLinuxSubscriptionsDiscoverySettings(LinuxSubscriptionsDiscoverySettings linuxSubscriptionsDiscoverySettings) {
        setLinuxSubscriptionsDiscoverySettings(linuxSubscriptionsDiscoverySettings);
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
        if (getAllowUpdate() != null)
            sb.append("AllowUpdate: ").append(getAllowUpdate()).append(",");
        if (getLinuxSubscriptionsDiscovery() != null)
            sb.append("LinuxSubscriptionsDiscovery: ").append(getLinuxSubscriptionsDiscovery()).append(",");
        if (getLinuxSubscriptionsDiscoverySettings() != null)
            sb.append("LinuxSubscriptionsDiscoverySettings: ").append(getLinuxSubscriptionsDiscoverySettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateServiceSettingsRequest == false)
            return false;
        UpdateServiceSettingsRequest other = (UpdateServiceSettingsRequest) obj;
        if (other.getAllowUpdate() == null ^ this.getAllowUpdate() == null)
            return false;
        if (other.getAllowUpdate() != null && other.getAllowUpdate().equals(this.getAllowUpdate()) == false)
            return false;
        if (other.getLinuxSubscriptionsDiscovery() == null ^ this.getLinuxSubscriptionsDiscovery() == null)
            return false;
        if (other.getLinuxSubscriptionsDiscovery() != null && other.getLinuxSubscriptionsDiscovery().equals(this.getLinuxSubscriptionsDiscovery()) == false)
            return false;
        if (other.getLinuxSubscriptionsDiscoverySettings() == null ^ this.getLinuxSubscriptionsDiscoverySettings() == null)
            return false;
        if (other.getLinuxSubscriptionsDiscoverySettings() != null
                && other.getLinuxSubscriptionsDiscoverySettings().equals(this.getLinuxSubscriptionsDiscoverySettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAllowUpdate() == null) ? 0 : getAllowUpdate().hashCode());
        hashCode = prime * hashCode + ((getLinuxSubscriptionsDiscovery() == null) ? 0 : getLinuxSubscriptionsDiscovery().hashCode());
        hashCode = prime * hashCode + ((getLinuxSubscriptionsDiscoverySettings() == null) ? 0 : getLinuxSubscriptionsDiscoverySettings().hashCode());
        return hashCode;
    }

    @Override
    public UpdateServiceSettingsRequest clone() {
        return (UpdateServiceSettingsRequest) super.clone();
    }

}
