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
 * Settings that are available for use in the rules in the <a>RuleGroup</a> where this is defined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/RuleVariables" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RuleVariables implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of IP addresses and address ranges, in CIDR notation.
     * </p>
     */
    private java.util.Map<String, IPSet> iPSets;
    /**
     * <p>
     * A list of port ranges.
     * </p>
     */
    private java.util.Map<String, PortSet> portSets;

    /**
     * <p>
     * A list of IP addresses and address ranges, in CIDR notation.
     * </p>
     * 
     * @return A list of IP addresses and address ranges, in CIDR notation.
     */

    public java.util.Map<String, IPSet> getIPSets() {
        return iPSets;
    }

    /**
     * <p>
     * A list of IP addresses and address ranges, in CIDR notation.
     * </p>
     * 
     * @param iPSets
     *        A list of IP addresses and address ranges, in CIDR notation.
     */

    public void setIPSets(java.util.Map<String, IPSet> iPSets) {
        this.iPSets = iPSets;
    }

    /**
     * <p>
     * A list of IP addresses and address ranges, in CIDR notation.
     * </p>
     * 
     * @param iPSets
     *        A list of IP addresses and address ranges, in CIDR notation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleVariables withIPSets(java.util.Map<String, IPSet> iPSets) {
        setIPSets(iPSets);
        return this;
    }

    /**
     * Add a single IPSets entry
     *
     * @see RuleVariables#withIPSets
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RuleVariables addIPSetsEntry(String key, IPSet value) {
        if (null == this.iPSets) {
            this.iPSets = new java.util.HashMap<String, IPSet>();
        }
        if (this.iPSets.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.iPSets.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into IPSets.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleVariables clearIPSetsEntries() {
        this.iPSets = null;
        return this;
    }

    /**
     * <p>
     * A list of port ranges.
     * </p>
     * 
     * @return A list of port ranges.
     */

    public java.util.Map<String, PortSet> getPortSets() {
        return portSets;
    }

    /**
     * <p>
     * A list of port ranges.
     * </p>
     * 
     * @param portSets
     *        A list of port ranges.
     */

    public void setPortSets(java.util.Map<String, PortSet> portSets) {
        this.portSets = portSets;
    }

    /**
     * <p>
     * A list of port ranges.
     * </p>
     * 
     * @param portSets
     *        A list of port ranges.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleVariables withPortSets(java.util.Map<String, PortSet> portSets) {
        setPortSets(portSets);
        return this;
    }

    /**
     * Add a single PortSets entry
     *
     * @see RuleVariables#withPortSets
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RuleVariables addPortSetsEntry(String key, PortSet value) {
        if (null == this.portSets) {
            this.portSets = new java.util.HashMap<String, PortSet>();
        }
        if (this.portSets.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.portSets.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into PortSets.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RuleVariables clearPortSetsEntries() {
        this.portSets = null;
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
        if (getIPSets() != null)
            sb.append("IPSets: ").append(getIPSets()).append(",");
        if (getPortSets() != null)
            sb.append("PortSets: ").append(getPortSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RuleVariables == false)
            return false;
        RuleVariables other = (RuleVariables) obj;
        if (other.getIPSets() == null ^ this.getIPSets() == null)
            return false;
        if (other.getIPSets() != null && other.getIPSets().equals(this.getIPSets()) == false)
            return false;
        if (other.getPortSets() == null ^ this.getPortSets() == null)
            return false;
        if (other.getPortSets() != null && other.getPortSets().equals(this.getPortSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIPSets() == null) ? 0 : getIPSets().hashCode());
        hashCode = prime * hashCode + ((getPortSets() == null) ? 0 : getPortSets().hashCode());
        return hashCode;
    }

    @Override
    public RuleVariables clone() {
        try {
            return (RuleVariables) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.RuleVariablesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
