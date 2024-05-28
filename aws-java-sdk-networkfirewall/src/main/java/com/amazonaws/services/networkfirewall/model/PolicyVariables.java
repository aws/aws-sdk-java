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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains variables that you can use to override default Suricata settings in your firewall policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/PolicyVariables" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PolicyVariables implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata <code>HOME_NET</code> variable. If your
     * firewall uses an inspection VPC, you might want to override the <code>HOME_NET</code> variable with the CIDRs of
     * your home networks. If you don't override <code>HOME_NET</code> with your own CIDRs, Network Firewall by default
     * uses the CIDR of your inspection VPC.
     * </p>
     */
    private java.util.Map<String, IPSet> ruleVariables;

    /**
     * <p>
     * The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata <code>HOME_NET</code> variable. If your
     * firewall uses an inspection VPC, you might want to override the <code>HOME_NET</code> variable with the CIDRs of
     * your home networks. If you don't override <code>HOME_NET</code> with your own CIDRs, Network Firewall by default
     * uses the CIDR of your inspection VPC.
     * </p>
     * 
     * @return The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata <code>HOME_NET</code> variable. If
     *         your firewall uses an inspection VPC, you might want to override the <code>HOME_NET</code> variable with
     *         the CIDRs of your home networks. If you don't override <code>HOME_NET</code> with your own CIDRs, Network
     *         Firewall by default uses the CIDR of your inspection VPC.
     */

    public java.util.Map<String, IPSet> getRuleVariables() {
        return ruleVariables;
    }

    /**
     * <p>
     * The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata <code>HOME_NET</code> variable. If your
     * firewall uses an inspection VPC, you might want to override the <code>HOME_NET</code> variable with the CIDRs of
     * your home networks. If you don't override <code>HOME_NET</code> with your own CIDRs, Network Firewall by default
     * uses the CIDR of your inspection VPC.
     * </p>
     * 
     * @param ruleVariables
     *        The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata <code>HOME_NET</code> variable. If
     *        your firewall uses an inspection VPC, you might want to override the <code>HOME_NET</code> variable with
     *        the CIDRs of your home networks. If you don't override <code>HOME_NET</code> with your own CIDRs, Network
     *        Firewall by default uses the CIDR of your inspection VPC.
     */

    public void setRuleVariables(java.util.Map<String, IPSet> ruleVariables) {
        this.ruleVariables = ruleVariables;
    }

    /**
     * <p>
     * The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata <code>HOME_NET</code> variable. If your
     * firewall uses an inspection VPC, you might want to override the <code>HOME_NET</code> variable with the CIDRs of
     * your home networks. If you don't override <code>HOME_NET</code> with your own CIDRs, Network Firewall by default
     * uses the CIDR of your inspection VPC.
     * </p>
     * 
     * @param ruleVariables
     *        The IPv4 or IPv6 addresses in CIDR notation to use for the Suricata <code>HOME_NET</code> variable. If
     *        your firewall uses an inspection VPC, you might want to override the <code>HOME_NET</code> variable with
     *        the CIDRs of your home networks. If you don't override <code>HOME_NET</code> with your own CIDRs, Network
     *        Firewall by default uses the CIDR of your inspection VPC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyVariables withRuleVariables(java.util.Map<String, IPSet> ruleVariables) {
        setRuleVariables(ruleVariables);
        return this;
    }

    /**
     * Add a single RuleVariables entry
     *
     * @see PolicyVariables#withRuleVariables
     * @returns a reference to this object so that method calls can be chained together.
     */

    public PolicyVariables addRuleVariablesEntry(String key, IPSet value) {
        if (null == this.ruleVariables) {
            this.ruleVariables = new java.util.HashMap<String, IPSet>();
        }
        if (this.ruleVariables.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.ruleVariables.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into RuleVariables.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PolicyVariables clearRuleVariablesEntries() {
        this.ruleVariables = null;
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
        if (getRuleVariables() != null)
            sb.append("RuleVariables: ").append(getRuleVariables());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PolicyVariables == false)
            return false;
        PolicyVariables other = (PolicyVariables) obj;
        if (other.getRuleVariables() == null ^ this.getRuleVariables() == null)
            return false;
        if (other.getRuleVariables() != null && other.getRuleVariables().equals(this.getRuleVariables()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRuleVariables() == null) ? 0 : getRuleVariables().hashCode());
        return hashCode;
    }

    @Override
    public PolicyVariables clone() {
        try {
            return (PolicyVariables) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.PolicyVariablesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
