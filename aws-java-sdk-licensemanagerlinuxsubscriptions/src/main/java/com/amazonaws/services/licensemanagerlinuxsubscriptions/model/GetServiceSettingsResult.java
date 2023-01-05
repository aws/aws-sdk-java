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

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/license-manager-linux-subscriptions-2018-05-10/GetServiceSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetServiceSettingsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Region in which License Manager displays the aggregated data for Linux subscriptions.
     * </p>
     */
    private java.util.List<String> homeRegions;
    /**
     * <p>
     * Lists if discovery has been enabled for Linux subscriptions.
     * </p>
     */
    private String linuxSubscriptionsDiscovery;
    /**
     * <p>
     * Lists the settings defined for Linux subscriptions discovery. The settings include if Organizations integration
     * has been enabled, and which Regions data will be aggregated from.
     * </p>
     */
    private LinuxSubscriptionsDiscoverySettings linuxSubscriptionsDiscoverySettings;
    /**
     * <p>
     * Indicates the status of Linux subscriptions settings being applied.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A message which details the Linux subscriptions service settings current status.
     * </p>
     */
    private java.util.Map<String, String> statusMessage;

    /**
     * <p>
     * The Region in which License Manager displays the aggregated data for Linux subscriptions.
     * </p>
     * 
     * @return The Region in which License Manager displays the aggregated data for Linux subscriptions.
     */

    public java.util.List<String> getHomeRegions() {
        return homeRegions;
    }

    /**
     * <p>
     * The Region in which License Manager displays the aggregated data for Linux subscriptions.
     * </p>
     * 
     * @param homeRegions
     *        The Region in which License Manager displays the aggregated data for Linux subscriptions.
     */

    public void setHomeRegions(java.util.Collection<String> homeRegions) {
        if (homeRegions == null) {
            this.homeRegions = null;
            return;
        }

        this.homeRegions = new java.util.ArrayList<String>(homeRegions);
    }

    /**
     * <p>
     * The Region in which License Manager displays the aggregated data for Linux subscriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHomeRegions(java.util.Collection)} or {@link #withHomeRegions(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param homeRegions
     *        The Region in which License Manager displays the aggregated data for Linux subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceSettingsResult withHomeRegions(String... homeRegions) {
        if (this.homeRegions == null) {
            setHomeRegions(new java.util.ArrayList<String>(homeRegions.length));
        }
        for (String ele : homeRegions) {
            this.homeRegions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Region in which License Manager displays the aggregated data for Linux subscriptions.
     * </p>
     * 
     * @param homeRegions
     *        The Region in which License Manager displays the aggregated data for Linux subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceSettingsResult withHomeRegions(java.util.Collection<String> homeRegions) {
        setHomeRegions(homeRegions);
        return this;
    }

    /**
     * <p>
     * Lists if discovery has been enabled for Linux subscriptions.
     * </p>
     * 
     * @param linuxSubscriptionsDiscovery
     *        Lists if discovery has been enabled for Linux subscriptions.
     * @see LinuxSubscriptionsDiscovery
     */

    public void setLinuxSubscriptionsDiscovery(String linuxSubscriptionsDiscovery) {
        this.linuxSubscriptionsDiscovery = linuxSubscriptionsDiscovery;
    }

    /**
     * <p>
     * Lists if discovery has been enabled for Linux subscriptions.
     * </p>
     * 
     * @return Lists if discovery has been enabled for Linux subscriptions.
     * @see LinuxSubscriptionsDiscovery
     */

    public String getLinuxSubscriptionsDiscovery() {
        return this.linuxSubscriptionsDiscovery;
    }

    /**
     * <p>
     * Lists if discovery has been enabled for Linux subscriptions.
     * </p>
     * 
     * @param linuxSubscriptionsDiscovery
     *        Lists if discovery has been enabled for Linux subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LinuxSubscriptionsDiscovery
     */

    public GetServiceSettingsResult withLinuxSubscriptionsDiscovery(String linuxSubscriptionsDiscovery) {
        setLinuxSubscriptionsDiscovery(linuxSubscriptionsDiscovery);
        return this;
    }

    /**
     * <p>
     * Lists if discovery has been enabled for Linux subscriptions.
     * </p>
     * 
     * @param linuxSubscriptionsDiscovery
     *        Lists if discovery has been enabled for Linux subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LinuxSubscriptionsDiscovery
     */

    public GetServiceSettingsResult withLinuxSubscriptionsDiscovery(LinuxSubscriptionsDiscovery linuxSubscriptionsDiscovery) {
        this.linuxSubscriptionsDiscovery = linuxSubscriptionsDiscovery.toString();
        return this;
    }

    /**
     * <p>
     * Lists the settings defined for Linux subscriptions discovery. The settings include if Organizations integration
     * has been enabled, and which Regions data will be aggregated from.
     * </p>
     * 
     * @param linuxSubscriptionsDiscoverySettings
     *        Lists the settings defined for Linux subscriptions discovery. The settings include if Organizations
     *        integration has been enabled, and which Regions data will be aggregated from.
     */

    public void setLinuxSubscriptionsDiscoverySettings(LinuxSubscriptionsDiscoverySettings linuxSubscriptionsDiscoverySettings) {
        this.linuxSubscriptionsDiscoverySettings = linuxSubscriptionsDiscoverySettings;
    }

    /**
     * <p>
     * Lists the settings defined for Linux subscriptions discovery. The settings include if Organizations integration
     * has been enabled, and which Regions data will be aggregated from.
     * </p>
     * 
     * @return Lists the settings defined for Linux subscriptions discovery. The settings include if Organizations
     *         integration has been enabled, and which Regions data will be aggregated from.
     */

    public LinuxSubscriptionsDiscoverySettings getLinuxSubscriptionsDiscoverySettings() {
        return this.linuxSubscriptionsDiscoverySettings;
    }

    /**
     * <p>
     * Lists the settings defined for Linux subscriptions discovery. The settings include if Organizations integration
     * has been enabled, and which Regions data will be aggregated from.
     * </p>
     * 
     * @param linuxSubscriptionsDiscoverySettings
     *        Lists the settings defined for Linux subscriptions discovery. The settings include if Organizations
     *        integration has been enabled, and which Regions data will be aggregated from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceSettingsResult withLinuxSubscriptionsDiscoverySettings(LinuxSubscriptionsDiscoverySettings linuxSubscriptionsDiscoverySettings) {
        setLinuxSubscriptionsDiscoverySettings(linuxSubscriptionsDiscoverySettings);
        return this;
    }

    /**
     * <p>
     * Indicates the status of Linux subscriptions settings being applied.
     * </p>
     * 
     * @param status
     *        Indicates the status of Linux subscriptions settings being applied.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Indicates the status of Linux subscriptions settings being applied.
     * </p>
     * 
     * @return Indicates the status of Linux subscriptions settings being applied.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Indicates the status of Linux subscriptions settings being applied.
     * </p>
     * 
     * @param status
     *        Indicates the status of Linux subscriptions settings being applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public GetServiceSettingsResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Indicates the status of Linux subscriptions settings being applied.
     * </p>
     * 
     * @param status
     *        Indicates the status of Linux subscriptions settings being applied.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public GetServiceSettingsResult withStatus(Status status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message which details the Linux subscriptions service settings current status.
     * </p>
     * 
     * @return A message which details the Linux subscriptions service settings current status.
     */

    public java.util.Map<String, String> getStatusMessage() {
        return statusMessage;
    }

    /**
     * <p>
     * A message which details the Linux subscriptions service settings current status.
     * </p>
     * 
     * @param statusMessage
     *        A message which details the Linux subscriptions service settings current status.
     */

    public void setStatusMessage(java.util.Map<String, String> statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message which details the Linux subscriptions service settings current status.
     * </p>
     * 
     * @param statusMessage
     *        A message which details the Linux subscriptions service settings current status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceSettingsResult withStatusMessage(java.util.Map<String, String> statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * Add a single StatusMessage entry
     *
     * @see GetServiceSettingsResult#withStatusMessage
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceSettingsResult addStatusMessageEntry(String key, String value) {
        if (null == this.statusMessage) {
            this.statusMessage = new java.util.HashMap<String, String>();
        }
        if (this.statusMessage.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.statusMessage.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into StatusMessage.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetServiceSettingsResult clearStatusMessageEntries() {
        this.statusMessage = null;
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
        if (getHomeRegions() != null)
            sb.append("HomeRegions: ").append(getHomeRegions()).append(",");
        if (getLinuxSubscriptionsDiscovery() != null)
            sb.append("LinuxSubscriptionsDiscovery: ").append(getLinuxSubscriptionsDiscovery()).append(",");
        if (getLinuxSubscriptionsDiscoverySettings() != null)
            sb.append("LinuxSubscriptionsDiscoverySettings: ").append(getLinuxSubscriptionsDiscoverySettings()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetServiceSettingsResult == false)
            return false;
        GetServiceSettingsResult other = (GetServiceSettingsResult) obj;
        if (other.getHomeRegions() == null ^ this.getHomeRegions() == null)
            return false;
        if (other.getHomeRegions() != null && other.getHomeRegions().equals(this.getHomeRegions()) == false)
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
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getHomeRegions() == null) ? 0 : getHomeRegions().hashCode());
        hashCode = prime * hashCode + ((getLinuxSubscriptionsDiscovery() == null) ? 0 : getLinuxSubscriptionsDiscovery().hashCode());
        hashCode = prime * hashCode + ((getLinuxSubscriptionsDiscoverySettings() == null) ? 0 : getLinuxSubscriptionsDiscoverySettings().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        return hashCode;
    }

    @Override
    public GetServiceSettingsResult clone() {
        try {
            return (GetServiceSettingsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
