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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Information about the DNS server to be used.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ec2-2016-11-15/DnsServersOptionsModifyStructure"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DnsServersOptionsModifyStructure implements Serializable, Cloneable {

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to two DNS servers.
     * Ensure that the DNS servers can be reached by the clients. The specified values overwrite the existing values.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> customDnsServers;
    /**
     * <p>
     * Indicates whether DNS servers should be used. Specify <code>False</code> to delete the existing DNS servers.
     * </p>
     */
    private Boolean enabled;

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to two DNS servers.
     * Ensure that the DNS servers can be reached by the clients. The specified values overwrite the existing values.
     * </p>
     * 
     * @return The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to two DNS
     *         servers. Ensure that the DNS servers can be reached by the clients. The specified values overwrite the
     *         existing values.
     */

    public java.util.List<String> getCustomDnsServers() {
        if (customDnsServers == null) {
            customDnsServers = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return customDnsServers;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to two DNS servers.
     * Ensure that the DNS servers can be reached by the clients. The specified values overwrite the existing values.
     * </p>
     * 
     * @param customDnsServers
     *        The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to two DNS
     *        servers. Ensure that the DNS servers can be reached by the clients. The specified values overwrite the
     *        existing values.
     */

    public void setCustomDnsServers(java.util.Collection<String> customDnsServers) {
        if (customDnsServers == null) {
            this.customDnsServers = null;
            return;
        }

        this.customDnsServers = new com.amazonaws.internal.SdkInternalList<String>(customDnsServers);
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to two DNS servers.
     * Ensure that the DNS servers can be reached by the clients. The specified values overwrite the existing values.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCustomDnsServers(java.util.Collection)} or {@link #withCustomDnsServers(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param customDnsServers
     *        The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to two DNS
     *        servers. Ensure that the DNS servers can be reached by the clients. The specified values overwrite the
     *        existing values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsServersOptionsModifyStructure withCustomDnsServers(String... customDnsServers) {
        if (this.customDnsServers == null) {
            setCustomDnsServers(new com.amazonaws.internal.SdkInternalList<String>(customDnsServers.length));
        }
        for (String ele : customDnsServers) {
            this.customDnsServers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to two DNS servers.
     * Ensure that the DNS servers can be reached by the clients. The specified values overwrite the existing values.
     * </p>
     * 
     * @param customDnsServers
     *        The IPv4 address range, in CIDR notation, of the DNS servers to be used. You can specify up to two DNS
     *        servers. Ensure that the DNS servers can be reached by the clients. The specified values overwrite the
     *        existing values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsServersOptionsModifyStructure withCustomDnsServers(java.util.Collection<String> customDnsServers) {
        setCustomDnsServers(customDnsServers);
        return this;
    }

    /**
     * <p>
     * Indicates whether DNS servers should be used. Specify <code>False</code> to delete the existing DNS servers.
     * </p>
     * 
     * @param enabled
     *        Indicates whether DNS servers should be used. Specify <code>False</code> to delete the existing DNS
     *        servers.
     */

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * <p>
     * Indicates whether DNS servers should be used. Specify <code>False</code> to delete the existing DNS servers.
     * </p>
     * 
     * @return Indicates whether DNS servers should be used. Specify <code>False</code> to delete the existing DNS
     *         servers.
     */

    public Boolean getEnabled() {
        return this.enabled;
    }

    /**
     * <p>
     * Indicates whether DNS servers should be used. Specify <code>False</code> to delete the existing DNS servers.
     * </p>
     * 
     * @param enabled
     *        Indicates whether DNS servers should be used. Specify <code>False</code> to delete the existing DNS
     *        servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DnsServersOptionsModifyStructure withEnabled(Boolean enabled) {
        setEnabled(enabled);
        return this;
    }

    /**
     * <p>
     * Indicates whether DNS servers should be used. Specify <code>False</code> to delete the existing DNS servers.
     * </p>
     * 
     * @return Indicates whether DNS servers should be used. Specify <code>False</code> to delete the existing DNS
     *         servers.
     */

    public Boolean isEnabled() {
        return this.enabled;
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
        if (getCustomDnsServers() != null)
            sb.append("CustomDnsServers: ").append(getCustomDnsServers()).append(",");
        if (getEnabled() != null)
            sb.append("Enabled: ").append(getEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DnsServersOptionsModifyStructure == false)
            return false;
        DnsServersOptionsModifyStructure other = (DnsServersOptionsModifyStructure) obj;
        if (other.getCustomDnsServers() == null ^ this.getCustomDnsServers() == null)
            return false;
        if (other.getCustomDnsServers() != null && other.getCustomDnsServers().equals(this.getCustomDnsServers()) == false)
            return false;
        if (other.getEnabled() == null ^ this.getEnabled() == null)
            return false;
        if (other.getEnabled() != null && other.getEnabled().equals(this.getEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCustomDnsServers() == null) ? 0 : getCustomDnsServers().hashCode());
        hashCode = prime * hashCode + ((getEnabled() == null) ? 0 : getEnabled().hashCode());
        return hashCode;
    }

    @Override
    public DnsServersOptionsModifyStructure clone() {
        try {
            return (DnsServersOptionsModifyStructure) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
