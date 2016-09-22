/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.directory.model;

import java.io.Serializable;

/**
 * <p>
 * Points to a remote domain with which you are setting up a trust relationship. Conditional forwarders are required in
 * order to set up a trust relationship with another domain.
 * </p>
 */
public class ConditionalForwarder implements Serializable, Cloneable {

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the remote domains pointed to by the conditional forwarder.
     * </p>
     */
    private String remoteDomainName;
    /**
     * <p>
     * The IP addresses of the remote DNS server associated with RemoteDomainName. This is the IP address of the DNS
     * server that your conditional forwarder points to.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dnsIpAddrs;
    /**
     * <p>
     * The replication scope of the conditional forwarder. The only allowed value is <code>Domain</code>, which will
     * replicate the conditional forwarder to all of the domain controllers for your AWS directory.
     * </p>
     */
    private String replicationScope;

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the remote domains pointed to by the conditional forwarder.
     * </p>
     * 
     * @param remoteDomainName
     *        The fully qualified domain name (FQDN) of the remote domains pointed to by the conditional forwarder.
     */

    public void setRemoteDomainName(String remoteDomainName) {
        this.remoteDomainName = remoteDomainName;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the remote domains pointed to by the conditional forwarder.
     * </p>
     * 
     * @return The fully qualified domain name (FQDN) of the remote domains pointed to by the conditional forwarder.
     */

    public String getRemoteDomainName() {
        return this.remoteDomainName;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the remote domains pointed to by the conditional forwarder.
     * </p>
     * 
     * @param remoteDomainName
     *        The fully qualified domain name (FQDN) of the remote domains pointed to by the conditional forwarder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalForwarder withRemoteDomainName(String remoteDomainName) {
        setRemoteDomainName(remoteDomainName);
        return this;
    }

    /**
     * <p>
     * The IP addresses of the remote DNS server associated with RemoteDomainName. This is the IP address of the DNS
     * server that your conditional forwarder points to.
     * </p>
     * 
     * @return The IP addresses of the remote DNS server associated with RemoteDomainName. This is the IP address of the
     *         DNS server that your conditional forwarder points to.
     */

    public java.util.List<String> getDnsIpAddrs() {
        if (dnsIpAddrs == null) {
            dnsIpAddrs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dnsIpAddrs;
    }

    /**
     * <p>
     * The IP addresses of the remote DNS server associated with RemoteDomainName. This is the IP address of the DNS
     * server that your conditional forwarder points to.
     * </p>
     * 
     * @param dnsIpAddrs
     *        The IP addresses of the remote DNS server associated with RemoteDomainName. This is the IP address of the
     *        DNS server that your conditional forwarder points to.
     */

    public void setDnsIpAddrs(java.util.Collection<String> dnsIpAddrs) {
        if (dnsIpAddrs == null) {
            this.dnsIpAddrs = null;
            return;
        }

        this.dnsIpAddrs = new com.amazonaws.internal.SdkInternalList<String>(dnsIpAddrs);
    }

    /**
     * <p>
     * The IP addresses of the remote DNS server associated with RemoteDomainName. This is the IP address of the DNS
     * server that your conditional forwarder points to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsIpAddrs(java.util.Collection)} or {@link #withDnsIpAddrs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsIpAddrs
     *        The IP addresses of the remote DNS server associated with RemoteDomainName. This is the IP address of the
     *        DNS server that your conditional forwarder points to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalForwarder withDnsIpAddrs(String... dnsIpAddrs) {
        if (this.dnsIpAddrs == null) {
            setDnsIpAddrs(new com.amazonaws.internal.SdkInternalList<String>(dnsIpAddrs.length));
        }
        for (String ele : dnsIpAddrs) {
            this.dnsIpAddrs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP addresses of the remote DNS server associated with RemoteDomainName. This is the IP address of the DNS
     * server that your conditional forwarder points to.
     * </p>
     * 
     * @param dnsIpAddrs
     *        The IP addresses of the remote DNS server associated with RemoteDomainName. This is the IP address of the
     *        DNS server that your conditional forwarder points to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConditionalForwarder withDnsIpAddrs(java.util.Collection<String> dnsIpAddrs) {
        setDnsIpAddrs(dnsIpAddrs);
        return this;
    }

    /**
     * <p>
     * The replication scope of the conditional forwarder. The only allowed value is <code>Domain</code>, which will
     * replicate the conditional forwarder to all of the domain controllers for your AWS directory.
     * </p>
     * 
     * @param replicationScope
     *        The replication scope of the conditional forwarder. The only allowed value is <code>Domain</code>, which
     *        will replicate the conditional forwarder to all of the domain controllers for your AWS directory.
     * @see ReplicationScope
     */

    public void setReplicationScope(String replicationScope) {
        this.replicationScope = replicationScope;
    }

    /**
     * <p>
     * The replication scope of the conditional forwarder. The only allowed value is <code>Domain</code>, which will
     * replicate the conditional forwarder to all of the domain controllers for your AWS directory.
     * </p>
     * 
     * @return The replication scope of the conditional forwarder. The only allowed value is <code>Domain</code>, which
     *         will replicate the conditional forwarder to all of the domain controllers for your AWS directory.
     * @see ReplicationScope
     */

    public String getReplicationScope() {
        return this.replicationScope;
    }

    /**
     * <p>
     * The replication scope of the conditional forwarder. The only allowed value is <code>Domain</code>, which will
     * replicate the conditional forwarder to all of the domain controllers for your AWS directory.
     * </p>
     * 
     * @param replicationScope
     *        The replication scope of the conditional forwarder. The only allowed value is <code>Domain</code>, which
     *        will replicate the conditional forwarder to all of the domain controllers for your AWS directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationScope
     */

    public ConditionalForwarder withReplicationScope(String replicationScope) {
        setReplicationScope(replicationScope);
        return this;
    }

    /**
     * <p>
     * The replication scope of the conditional forwarder. The only allowed value is <code>Domain</code>, which will
     * replicate the conditional forwarder to all of the domain controllers for your AWS directory.
     * </p>
     * 
     * @param replicationScope
     *        The replication scope of the conditional forwarder. The only allowed value is <code>Domain</code>, which
     *        will replicate the conditional forwarder to all of the domain controllers for your AWS directory.
     * @see ReplicationScope
     */

    public void setReplicationScope(ReplicationScope replicationScope) {
        this.replicationScope = replicationScope.toString();
    }

    /**
     * <p>
     * The replication scope of the conditional forwarder. The only allowed value is <code>Domain</code>, which will
     * replicate the conditional forwarder to all of the domain controllers for your AWS directory.
     * </p>
     * 
     * @param replicationScope
     *        The replication scope of the conditional forwarder. The only allowed value is <code>Domain</code>, which
     *        will replicate the conditional forwarder to all of the domain controllers for your AWS directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ReplicationScope
     */

    public ConditionalForwarder withReplicationScope(ReplicationScope replicationScope) {
        setReplicationScope(replicationScope);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getRemoteDomainName() != null)
            sb.append("RemoteDomainName: " + getRemoteDomainName() + ",");
        if (getDnsIpAddrs() != null)
            sb.append("DnsIpAddrs: " + getDnsIpAddrs() + ",");
        if (getReplicationScope() != null)
            sb.append("ReplicationScope: " + getReplicationScope());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConditionalForwarder == false)
            return false;
        ConditionalForwarder other = (ConditionalForwarder) obj;
        if (other.getRemoteDomainName() == null ^ this.getRemoteDomainName() == null)
            return false;
        if (other.getRemoteDomainName() != null && other.getRemoteDomainName().equals(this.getRemoteDomainName()) == false)
            return false;
        if (other.getDnsIpAddrs() == null ^ this.getDnsIpAddrs() == null)
            return false;
        if (other.getDnsIpAddrs() != null && other.getDnsIpAddrs().equals(this.getDnsIpAddrs()) == false)
            return false;
        if (other.getReplicationScope() == null ^ this.getReplicationScope() == null)
            return false;
        if (other.getReplicationScope() != null && other.getReplicationScope().equals(this.getReplicationScope()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRemoteDomainName() == null) ? 0 : getRemoteDomainName().hashCode());
        hashCode = prime * hashCode + ((getDnsIpAddrs() == null) ? 0 : getDnsIpAddrs().hashCode());
        hashCode = prime * hashCode + ((getReplicationScope() == null) ? 0 : getReplicationScope().hashCode());
        return hashCode;
    }

    @Override
    public ConditionalForwarder clone() {
        try {
            return (ConditionalForwarder) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
