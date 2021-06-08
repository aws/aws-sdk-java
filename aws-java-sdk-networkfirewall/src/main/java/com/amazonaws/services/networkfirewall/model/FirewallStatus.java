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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Detailed information about the current status of a <a>Firewall</a>. You can retrieve this for a firewall by calling
 * <a>DescribeFirewall</a> and providing the firewall name and ARN.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/FirewallStatus" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FirewallStatus implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The readiness of the configured firewall to handle network traffic across all of the Availability Zones where
     * you've configured it. This setting is <code>READY</code> only when the <code>ConfigurationSyncStateSummary</code>
     * value is <code>IN_SYNC</code> and the <code>Attachment</code> <code>Status</code> values for all of the
     * configured subnets are <code>READY</code>.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The configuration sync state for the firewall. This summarizes the sync states reported in the
     * <code>Config</code> settings for all of the Availability Zones where you have configured the firewall.
     * </p>
     * <p>
     * When you create a firewall or update its configuration, for example by adding a rule group to its firewall
     * policy, Network Firewall distributes the configuration changes to all zones where the firewall is in use. This
     * summary indicates whether the configuration changes have been applied everywhere.
     * </p>
     * <p>
     * This status must be <code>IN_SYNC</code> for the firewall to be ready for use, but it doesn't indicate that the
     * firewall is ready. The <code>Status</code> setting indicates firewall readiness.
     * </p>
     */
    private String configurationSyncStateSummary;
    /**
     * <p>
     * The subnets that you've configured for use by the Network Firewall firewall. This contains one array element per
     * Availability Zone where you've configured a subnet. These objects provide details of the information that is
     * summarized in the <code>ConfigurationSyncStateSummary</code> and <code>Status</code>, broken down by zone and
     * configuration object.
     * </p>
     */
    private java.util.Map<String, SyncState> syncStates;

    /**
     * <p>
     * The readiness of the configured firewall to handle network traffic across all of the Availability Zones where
     * you've configured it. This setting is <code>READY</code> only when the <code>ConfigurationSyncStateSummary</code>
     * value is <code>IN_SYNC</code> and the <code>Attachment</code> <code>Status</code> values for all of the
     * configured subnets are <code>READY</code>.
     * </p>
     * 
     * @param status
     *        The readiness of the configured firewall to handle network traffic across all of the Availability Zones
     *        where you've configured it. This setting is <code>READY</code> only when the
     *        <code>ConfigurationSyncStateSummary</code> value is <code>IN_SYNC</code> and the <code>Attachment</code>
     *        <code>Status</code> values for all of the configured subnets are <code>READY</code>.
     * @see FirewallStatusValue
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The readiness of the configured firewall to handle network traffic across all of the Availability Zones where
     * you've configured it. This setting is <code>READY</code> only when the <code>ConfigurationSyncStateSummary</code>
     * value is <code>IN_SYNC</code> and the <code>Attachment</code> <code>Status</code> values for all of the
     * configured subnets are <code>READY</code>.
     * </p>
     * 
     * @return The readiness of the configured firewall to handle network traffic across all of the Availability Zones
     *         where you've configured it. This setting is <code>READY</code> only when the
     *         <code>ConfigurationSyncStateSummary</code> value is <code>IN_SYNC</code> and the <code>Attachment</code>
     *         <code>Status</code> values for all of the configured subnets are <code>READY</code>.
     * @see FirewallStatusValue
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The readiness of the configured firewall to handle network traffic across all of the Availability Zones where
     * you've configured it. This setting is <code>READY</code> only when the <code>ConfigurationSyncStateSummary</code>
     * value is <code>IN_SYNC</code> and the <code>Attachment</code> <code>Status</code> values for all of the
     * configured subnets are <code>READY</code>.
     * </p>
     * 
     * @param status
     *        The readiness of the configured firewall to handle network traffic across all of the Availability Zones
     *        where you've configured it. This setting is <code>READY</code> only when the
     *        <code>ConfigurationSyncStateSummary</code> value is <code>IN_SYNC</code> and the <code>Attachment</code>
     *        <code>Status</code> values for all of the configured subnets are <code>READY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallStatusValue
     */

    public FirewallStatus withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The readiness of the configured firewall to handle network traffic across all of the Availability Zones where
     * you've configured it. This setting is <code>READY</code> only when the <code>ConfigurationSyncStateSummary</code>
     * value is <code>IN_SYNC</code> and the <code>Attachment</code> <code>Status</code> values for all of the
     * configured subnets are <code>READY</code>.
     * </p>
     * 
     * @param status
     *        The readiness of the configured firewall to handle network traffic across all of the Availability Zones
     *        where you've configured it. This setting is <code>READY</code> only when the
     *        <code>ConfigurationSyncStateSummary</code> value is <code>IN_SYNC</code> and the <code>Attachment</code>
     *        <code>Status</code> values for all of the configured subnets are <code>READY</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FirewallStatusValue
     */

    public FirewallStatus withStatus(FirewallStatusValue status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The configuration sync state for the firewall. This summarizes the sync states reported in the
     * <code>Config</code> settings for all of the Availability Zones where you have configured the firewall.
     * </p>
     * <p>
     * When you create a firewall or update its configuration, for example by adding a rule group to its firewall
     * policy, Network Firewall distributes the configuration changes to all zones where the firewall is in use. This
     * summary indicates whether the configuration changes have been applied everywhere.
     * </p>
     * <p>
     * This status must be <code>IN_SYNC</code> for the firewall to be ready for use, but it doesn't indicate that the
     * firewall is ready. The <code>Status</code> setting indicates firewall readiness.
     * </p>
     * 
     * @param configurationSyncStateSummary
     *        The configuration sync state for the firewall. This summarizes the sync states reported in the
     *        <code>Config</code> settings for all of the Availability Zones where you have configured the firewall.
     *        </p>
     *        <p>
     *        When you create a firewall or update its configuration, for example by adding a rule group to its firewall
     *        policy, Network Firewall distributes the configuration changes to all zones where the firewall is in use.
     *        This summary indicates whether the configuration changes have been applied everywhere.
     *        </p>
     *        <p>
     *        This status must be <code>IN_SYNC</code> for the firewall to be ready for use, but it doesn't indicate
     *        that the firewall is ready. The <code>Status</code> setting indicates firewall readiness.
     * @see ConfigurationSyncState
     */

    public void setConfigurationSyncStateSummary(String configurationSyncStateSummary) {
        this.configurationSyncStateSummary = configurationSyncStateSummary;
    }

    /**
     * <p>
     * The configuration sync state for the firewall. This summarizes the sync states reported in the
     * <code>Config</code> settings for all of the Availability Zones where you have configured the firewall.
     * </p>
     * <p>
     * When you create a firewall or update its configuration, for example by adding a rule group to its firewall
     * policy, Network Firewall distributes the configuration changes to all zones where the firewall is in use. This
     * summary indicates whether the configuration changes have been applied everywhere.
     * </p>
     * <p>
     * This status must be <code>IN_SYNC</code> for the firewall to be ready for use, but it doesn't indicate that the
     * firewall is ready. The <code>Status</code> setting indicates firewall readiness.
     * </p>
     * 
     * @return The configuration sync state for the firewall. This summarizes the sync states reported in the
     *         <code>Config</code> settings for all of the Availability Zones where you have configured the firewall.
     *         </p>
     *         <p>
     *         When you create a firewall or update its configuration, for example by adding a rule group to its
     *         firewall policy, Network Firewall distributes the configuration changes to all zones where the firewall
     *         is in use. This summary indicates whether the configuration changes have been applied everywhere.
     *         </p>
     *         <p>
     *         This status must be <code>IN_SYNC</code> for the firewall to be ready for use, but it doesn't indicate
     *         that the firewall is ready. The <code>Status</code> setting indicates firewall readiness.
     * @see ConfigurationSyncState
     */

    public String getConfigurationSyncStateSummary() {
        return this.configurationSyncStateSummary;
    }

    /**
     * <p>
     * The configuration sync state for the firewall. This summarizes the sync states reported in the
     * <code>Config</code> settings for all of the Availability Zones where you have configured the firewall.
     * </p>
     * <p>
     * When you create a firewall or update its configuration, for example by adding a rule group to its firewall
     * policy, Network Firewall distributes the configuration changes to all zones where the firewall is in use. This
     * summary indicates whether the configuration changes have been applied everywhere.
     * </p>
     * <p>
     * This status must be <code>IN_SYNC</code> for the firewall to be ready for use, but it doesn't indicate that the
     * firewall is ready. The <code>Status</code> setting indicates firewall readiness.
     * </p>
     * 
     * @param configurationSyncStateSummary
     *        The configuration sync state for the firewall. This summarizes the sync states reported in the
     *        <code>Config</code> settings for all of the Availability Zones where you have configured the firewall.
     *        </p>
     *        <p>
     *        When you create a firewall or update its configuration, for example by adding a rule group to its firewall
     *        policy, Network Firewall distributes the configuration changes to all zones where the firewall is in use.
     *        This summary indicates whether the configuration changes have been applied everywhere.
     *        </p>
     *        <p>
     *        This status must be <code>IN_SYNC</code> for the firewall to be ready for use, but it doesn't indicate
     *        that the firewall is ready. The <code>Status</code> setting indicates firewall readiness.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationSyncState
     */

    public FirewallStatus withConfigurationSyncStateSummary(String configurationSyncStateSummary) {
        setConfigurationSyncStateSummary(configurationSyncStateSummary);
        return this;
    }

    /**
     * <p>
     * The configuration sync state for the firewall. This summarizes the sync states reported in the
     * <code>Config</code> settings for all of the Availability Zones where you have configured the firewall.
     * </p>
     * <p>
     * When you create a firewall or update its configuration, for example by adding a rule group to its firewall
     * policy, Network Firewall distributes the configuration changes to all zones where the firewall is in use. This
     * summary indicates whether the configuration changes have been applied everywhere.
     * </p>
     * <p>
     * This status must be <code>IN_SYNC</code> for the firewall to be ready for use, but it doesn't indicate that the
     * firewall is ready. The <code>Status</code> setting indicates firewall readiness.
     * </p>
     * 
     * @param configurationSyncStateSummary
     *        The configuration sync state for the firewall. This summarizes the sync states reported in the
     *        <code>Config</code> settings for all of the Availability Zones where you have configured the firewall.
     *        </p>
     *        <p>
     *        When you create a firewall or update its configuration, for example by adding a rule group to its firewall
     *        policy, Network Firewall distributes the configuration changes to all zones where the firewall is in use.
     *        This summary indicates whether the configuration changes have been applied everywhere.
     *        </p>
     *        <p>
     *        This status must be <code>IN_SYNC</code> for the firewall to be ready for use, but it doesn't indicate
     *        that the firewall is ready. The <code>Status</code> setting indicates firewall readiness.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConfigurationSyncState
     */

    public FirewallStatus withConfigurationSyncStateSummary(ConfigurationSyncState configurationSyncStateSummary) {
        this.configurationSyncStateSummary = configurationSyncStateSummary.toString();
        return this;
    }

    /**
     * <p>
     * The subnets that you've configured for use by the Network Firewall firewall. This contains one array element per
     * Availability Zone where you've configured a subnet. These objects provide details of the information that is
     * summarized in the <code>ConfigurationSyncStateSummary</code> and <code>Status</code>, broken down by zone and
     * configuration object.
     * </p>
     * 
     * @return The subnets that you've configured for use by the Network Firewall firewall. This contains one array
     *         element per Availability Zone where you've configured a subnet. These objects provide details of the
     *         information that is summarized in the <code>ConfigurationSyncStateSummary</code> and <code>Status</code>,
     *         broken down by zone and configuration object.
     */

    public java.util.Map<String, SyncState> getSyncStates() {
        return syncStates;
    }

    /**
     * <p>
     * The subnets that you've configured for use by the Network Firewall firewall. This contains one array element per
     * Availability Zone where you've configured a subnet. These objects provide details of the information that is
     * summarized in the <code>ConfigurationSyncStateSummary</code> and <code>Status</code>, broken down by zone and
     * configuration object.
     * </p>
     * 
     * @param syncStates
     *        The subnets that you've configured for use by the Network Firewall firewall. This contains one array
     *        element per Availability Zone where you've configured a subnet. These objects provide details of the
     *        information that is summarized in the <code>ConfigurationSyncStateSummary</code> and <code>Status</code>,
     *        broken down by zone and configuration object.
     */

    public void setSyncStates(java.util.Map<String, SyncState> syncStates) {
        this.syncStates = syncStates;
    }

    /**
     * <p>
     * The subnets that you've configured for use by the Network Firewall firewall. This contains one array element per
     * Availability Zone where you've configured a subnet. These objects provide details of the information that is
     * summarized in the <code>ConfigurationSyncStateSummary</code> and <code>Status</code>, broken down by zone and
     * configuration object.
     * </p>
     * 
     * @param syncStates
     *        The subnets that you've configured for use by the Network Firewall firewall. This contains one array
     *        element per Availability Zone where you've configured a subnet. These objects provide details of the
     *        information that is summarized in the <code>ConfigurationSyncStateSummary</code> and <code>Status</code>,
     *        broken down by zone and configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatus withSyncStates(java.util.Map<String, SyncState> syncStates) {
        setSyncStates(syncStates);
        return this;
    }

    /**
     * Add a single SyncStates entry
     *
     * @see FirewallStatus#withSyncStates
     * @returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatus addSyncStatesEntry(String key, SyncState value) {
        if (null == this.syncStates) {
            this.syncStates = new java.util.HashMap<String, SyncState>();
        }
        if (this.syncStates.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.syncStates.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SyncStates.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FirewallStatus clearSyncStatesEntries() {
        this.syncStates = null;
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getConfigurationSyncStateSummary() != null)
            sb.append("ConfigurationSyncStateSummary: ").append(getConfigurationSyncStateSummary()).append(",");
        if (getSyncStates() != null)
            sb.append("SyncStates: ").append(getSyncStates());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FirewallStatus == false)
            return false;
        FirewallStatus other = (FirewallStatus) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getConfigurationSyncStateSummary() == null ^ this.getConfigurationSyncStateSummary() == null)
            return false;
        if (other.getConfigurationSyncStateSummary() != null
                && other.getConfigurationSyncStateSummary().equals(this.getConfigurationSyncStateSummary()) == false)
            return false;
        if (other.getSyncStates() == null ^ this.getSyncStates() == null)
            return false;
        if (other.getSyncStates() != null && other.getSyncStates().equals(this.getSyncStates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getConfigurationSyncStateSummary() == null) ? 0 : getConfigurationSyncStateSummary().hashCode());
        hashCode = prime * hashCode + ((getSyncStates() == null) ? 0 : getSyncStates().hashCode());
        return hashCode;
    }

    @Override
    public FirewallStatus clone() {
        try {
            return (FirewallStatus) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.FirewallStatusMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
