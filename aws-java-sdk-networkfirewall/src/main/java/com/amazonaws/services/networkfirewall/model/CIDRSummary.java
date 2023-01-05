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
package com.amazonaws.services.networkfirewall.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summarizes the CIDR blocks used by the IP set references in a firewall. Network Firewall calculates the number of
 * CIDRs by taking an aggregated count of all CIDRs used by the IP sets you are referencing.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/network-firewall-2020-11-12/CIDRSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CIDRSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The number of CIDR blocks available for use by the IP set references in a firewall.
     * </p>
     */
    private Integer availableCIDRCount;
    /**
     * <p>
     * The number of CIDR blocks used by the IP set references in a firewall.
     * </p>
     */
    private Integer utilizedCIDRCount;
    /**
     * <p>
     * The list of the IP set references used by a firewall.
     * </p>
     */
    private java.util.Map<String, IPSetMetadata> iPSetReferences;

    /**
     * <p>
     * The number of CIDR blocks available for use by the IP set references in a firewall.
     * </p>
     * 
     * @param availableCIDRCount
     *        The number of CIDR blocks available for use by the IP set references in a firewall.
     */

    public void setAvailableCIDRCount(Integer availableCIDRCount) {
        this.availableCIDRCount = availableCIDRCount;
    }

    /**
     * <p>
     * The number of CIDR blocks available for use by the IP set references in a firewall.
     * </p>
     * 
     * @return The number of CIDR blocks available for use by the IP set references in a firewall.
     */

    public Integer getAvailableCIDRCount() {
        return this.availableCIDRCount;
    }

    /**
     * <p>
     * The number of CIDR blocks available for use by the IP set references in a firewall.
     * </p>
     * 
     * @param availableCIDRCount
     *        The number of CIDR blocks available for use by the IP set references in a firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CIDRSummary withAvailableCIDRCount(Integer availableCIDRCount) {
        setAvailableCIDRCount(availableCIDRCount);
        return this;
    }

    /**
     * <p>
     * The number of CIDR blocks used by the IP set references in a firewall.
     * </p>
     * 
     * @param utilizedCIDRCount
     *        The number of CIDR blocks used by the IP set references in a firewall.
     */

    public void setUtilizedCIDRCount(Integer utilizedCIDRCount) {
        this.utilizedCIDRCount = utilizedCIDRCount;
    }

    /**
     * <p>
     * The number of CIDR blocks used by the IP set references in a firewall.
     * </p>
     * 
     * @return The number of CIDR blocks used by the IP set references in a firewall.
     */

    public Integer getUtilizedCIDRCount() {
        return this.utilizedCIDRCount;
    }

    /**
     * <p>
     * The number of CIDR blocks used by the IP set references in a firewall.
     * </p>
     * 
     * @param utilizedCIDRCount
     *        The number of CIDR blocks used by the IP set references in a firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CIDRSummary withUtilizedCIDRCount(Integer utilizedCIDRCount) {
        setUtilizedCIDRCount(utilizedCIDRCount);
        return this;
    }

    /**
     * <p>
     * The list of the IP set references used by a firewall.
     * </p>
     * 
     * @return The list of the IP set references used by a firewall.
     */

    public java.util.Map<String, IPSetMetadata> getIPSetReferences() {
        return iPSetReferences;
    }

    /**
     * <p>
     * The list of the IP set references used by a firewall.
     * </p>
     * 
     * @param iPSetReferences
     *        The list of the IP set references used by a firewall.
     */

    public void setIPSetReferences(java.util.Map<String, IPSetMetadata> iPSetReferences) {
        this.iPSetReferences = iPSetReferences;
    }

    /**
     * <p>
     * The list of the IP set references used by a firewall.
     * </p>
     * 
     * @param iPSetReferences
     *        The list of the IP set references used by a firewall.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CIDRSummary withIPSetReferences(java.util.Map<String, IPSetMetadata> iPSetReferences) {
        setIPSetReferences(iPSetReferences);
        return this;
    }

    /**
     * Add a single IPSetReferences entry
     *
     * @see CIDRSummary#withIPSetReferences
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CIDRSummary addIPSetReferencesEntry(String key, IPSetMetadata value) {
        if (null == this.iPSetReferences) {
            this.iPSetReferences = new java.util.HashMap<String, IPSetMetadata>();
        }
        if (this.iPSetReferences.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.iPSetReferences.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into IPSetReferences.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CIDRSummary clearIPSetReferencesEntries() {
        this.iPSetReferences = null;
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
        if (getAvailableCIDRCount() != null)
            sb.append("AvailableCIDRCount: ").append(getAvailableCIDRCount()).append(",");
        if (getUtilizedCIDRCount() != null)
            sb.append("UtilizedCIDRCount: ").append(getUtilizedCIDRCount()).append(",");
        if (getIPSetReferences() != null)
            sb.append("IPSetReferences: ").append(getIPSetReferences());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CIDRSummary == false)
            return false;
        CIDRSummary other = (CIDRSummary) obj;
        if (other.getAvailableCIDRCount() == null ^ this.getAvailableCIDRCount() == null)
            return false;
        if (other.getAvailableCIDRCount() != null && other.getAvailableCIDRCount().equals(this.getAvailableCIDRCount()) == false)
            return false;
        if (other.getUtilizedCIDRCount() == null ^ this.getUtilizedCIDRCount() == null)
            return false;
        if (other.getUtilizedCIDRCount() != null && other.getUtilizedCIDRCount().equals(this.getUtilizedCIDRCount()) == false)
            return false;
        if (other.getIPSetReferences() == null ^ this.getIPSetReferences() == null)
            return false;
        if (other.getIPSetReferences() != null && other.getIPSetReferences().equals(this.getIPSetReferences()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAvailableCIDRCount() == null) ? 0 : getAvailableCIDRCount().hashCode());
        hashCode = prime * hashCode + ((getUtilizedCIDRCount() == null) ? 0 : getUtilizedCIDRCount().hashCode());
        hashCode = prime * hashCode + ((getIPSetReferences() == null) ? 0 : getIPSetReferences().hashCode());
        return hashCode;
    }

    @Override
    public CIDRSummary clone() {
        try {
            return (CIDRSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.networkfirewall.model.transform.CIDRSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
