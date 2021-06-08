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
 * The status of the firewall endpoint and firewall policy configuration for a single VPC subnet.
 * </p>
 * <p>
 * For each VPC subnet that you associate with a firewall, AWS Network Firewall does the following:
 * </p>
 * <ul>
 * <li>
 * <p>
 * Instantiates a firewall endpoint in the subnet, ready to take traffic.
 * </p>
 * </li>
 * <li>
 * <p>
 * Configures the endpoint with the current firewall policy settings, to provide the filtering behavior for the
 * endpoint.
 * </p>
 * </li>
 * </ul>
 * <p>
 * When you update a firewall, for example to add a subnet association or change a rule group in the firewall policy,
 * the affected sync states reflect out-of-sync or not ready status until the changes are complete.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/SyncState" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SyncState implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attachment status of the firewall's association with a single VPC subnet. For each configured subnet, Network
     * Firewall creates the attachment by instantiating the firewall endpoint in the subnet so that it's ready to take
     * traffic. This is part of the <a>FirewallStatus</a>.
     * </p>
     */
    private Attachment attachment;
    /**
     * <p>
     * The configuration status of the firewall endpoint in a single VPC subnet. Network Firewall provides each endpoint
     * with the rules that are configured in the firewall policy. Each time you add a subnet or modify the associated
     * firewall policy, Network Firewall synchronizes the rules in the endpoint, so it can properly filter network
     * traffic. This is part of the <a>FirewallStatus</a>.
     * </p>
     */
    private java.util.Map<String, PerObjectStatus> config;

    /**
     * <p>
     * The attachment status of the firewall's association with a single VPC subnet. For each configured subnet, Network
     * Firewall creates the attachment by instantiating the firewall endpoint in the subnet so that it's ready to take
     * traffic. This is part of the <a>FirewallStatus</a>.
     * </p>
     * 
     * @param attachment
     *        The attachment status of the firewall's association with a single VPC subnet. For each configured subnet,
     *        Network Firewall creates the attachment by instantiating the firewall endpoint in the subnet so that it's
     *        ready to take traffic. This is part of the <a>FirewallStatus</a>.
     */

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    /**
     * <p>
     * The attachment status of the firewall's association with a single VPC subnet. For each configured subnet, Network
     * Firewall creates the attachment by instantiating the firewall endpoint in the subnet so that it's ready to take
     * traffic. This is part of the <a>FirewallStatus</a>.
     * </p>
     * 
     * @return The attachment status of the firewall's association with a single VPC subnet. For each configured subnet,
     *         Network Firewall creates the attachment by instantiating the firewall endpoint in the subnet so that it's
     *         ready to take traffic. This is part of the <a>FirewallStatus</a>.
     */

    public Attachment getAttachment() {
        return this.attachment;
    }

    /**
     * <p>
     * The attachment status of the firewall's association with a single VPC subnet. For each configured subnet, Network
     * Firewall creates the attachment by instantiating the firewall endpoint in the subnet so that it's ready to take
     * traffic. This is part of the <a>FirewallStatus</a>.
     * </p>
     * 
     * @param attachment
     *        The attachment status of the firewall's association with a single VPC subnet. For each configured subnet,
     *        Network Firewall creates the attachment by instantiating the firewall endpoint in the subnet so that it's
     *        ready to take traffic. This is part of the <a>FirewallStatus</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncState withAttachment(Attachment attachment) {
        setAttachment(attachment);
        return this;
    }

    /**
     * <p>
     * The configuration status of the firewall endpoint in a single VPC subnet. Network Firewall provides each endpoint
     * with the rules that are configured in the firewall policy. Each time you add a subnet or modify the associated
     * firewall policy, Network Firewall synchronizes the rules in the endpoint, so it can properly filter network
     * traffic. This is part of the <a>FirewallStatus</a>.
     * </p>
     * 
     * @return The configuration status of the firewall endpoint in a single VPC subnet. Network Firewall provides each
     *         endpoint with the rules that are configured in the firewall policy. Each time you add a subnet or modify
     *         the associated firewall policy, Network Firewall synchronizes the rules in the endpoint, so it can
     *         properly filter network traffic. This is part of the <a>FirewallStatus</a>.
     */

    public java.util.Map<String, PerObjectStatus> getConfig() {
        return config;
    }

    /**
     * <p>
     * The configuration status of the firewall endpoint in a single VPC subnet. Network Firewall provides each endpoint
     * with the rules that are configured in the firewall policy. Each time you add a subnet or modify the associated
     * firewall policy, Network Firewall synchronizes the rules in the endpoint, so it can properly filter network
     * traffic. This is part of the <a>FirewallStatus</a>.
     * </p>
     * 
     * @param config
     *        The configuration status of the firewall endpoint in a single VPC subnet. Network Firewall provides each
     *        endpoint with the rules that are configured in the firewall policy. Each time you add a subnet or modify
     *        the associated firewall policy, Network Firewall synchronizes the rules in the endpoint, so it can
     *        properly filter network traffic. This is part of the <a>FirewallStatus</a>.
     */

    public void setConfig(java.util.Map<String, PerObjectStatus> config) {
        this.config = config;
    }

    /**
     * <p>
     * The configuration status of the firewall endpoint in a single VPC subnet. Network Firewall provides each endpoint
     * with the rules that are configured in the firewall policy. Each time you add a subnet or modify the associated
     * firewall policy, Network Firewall synchronizes the rules in the endpoint, so it can properly filter network
     * traffic. This is part of the <a>FirewallStatus</a>.
     * </p>
     * 
     * @param config
     *        The configuration status of the firewall endpoint in a single VPC subnet. Network Firewall provides each
     *        endpoint with the rules that are configured in the firewall policy. Each time you add a subnet or modify
     *        the associated firewall policy, Network Firewall synchronizes the rules in the endpoint, so it can
     *        properly filter network traffic. This is part of the <a>FirewallStatus</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncState withConfig(java.util.Map<String, PerObjectStatus> config) {
        setConfig(config);
        return this;
    }

    /**
     * Add a single Config entry
     *
     * @see SyncState#withConfig
     * @returns a reference to this object so that method calls can be chained together.
     */

    public SyncState addConfigEntry(String key, PerObjectStatus value) {
        if (null == this.config) {
            this.config = new java.util.HashMap<String, PerObjectStatus>();
        }
        if (this.config.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.config.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Config.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SyncState clearConfigEntries() {
        this.config = null;
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
        if (getAttachment() != null)
            sb.append("Attachment: ").append(getAttachment()).append(",");
        if (getConfig() != null)
            sb.append("Config: ").append(getConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SyncState == false)
            return false;
        SyncState other = (SyncState) obj;
        if (other.getAttachment() == null ^ this.getAttachment() == null)
            return false;
        if (other.getAttachment() != null && other.getAttachment().equals(this.getAttachment()) == false)
            return false;
        if (other.getConfig() == null ^ this.getConfig() == null)
            return false;
        if (other.getConfig() != null && other.getConfig().equals(this.getConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttachment() == null) ? 0 : getAttachment().hashCode());
        hashCode = prime * hashCode + ((getConfig() == null) ? 0 : getConfig().hashCode());
        return hashCode;
    }

    @Override
    public SyncState clone() {
        try {
            return (SyncState) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.SyncStateMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
