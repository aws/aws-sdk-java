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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for an NFS data repository association (DRA) created during the creation of the Amazon File Cache
 * resource.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/FileCacheNFSConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileCacheNFSConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The version of the NFS (Network File System) protocol of the NFS data repository. The only supported value is
     * <code>NFS3</code>, which indicates that the data repository must support the NFSv3 protocol.
     * </p>
     */
    private String version;
    /**
     * <p>
     * A list of up to 2 IP addresses of DNS servers used to resolve the NFS file system domain name. The provided IP
     * addresses can either be the IP addresses of a DNS forwarder or resolver that the customer manages and runs inside
     * the customer VPC, or the IP addresses of the on-premises DNS servers.
     * </p>
     */
    private java.util.List<String> dnsIps;

    /**
     * <p>
     * The version of the NFS (Network File System) protocol of the NFS data repository. The only supported value is
     * <code>NFS3</code>, which indicates that the data repository must support the NFSv3 protocol.
     * </p>
     * 
     * @param version
     *        The version of the NFS (Network File System) protocol of the NFS data repository. The only supported value
     *        is <code>NFS3</code>, which indicates that the data repository must support the NFSv3 protocol.
     * @see NfsVersion
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the NFS (Network File System) protocol of the NFS data repository. The only supported value is
     * <code>NFS3</code>, which indicates that the data repository must support the NFSv3 protocol.
     * </p>
     * 
     * @return The version of the NFS (Network File System) protocol of the NFS data repository. The only supported
     *         value is <code>NFS3</code>, which indicates that the data repository must support the NFSv3 protocol.
     * @see NfsVersion
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the NFS (Network File System) protocol of the NFS data repository. The only supported value is
     * <code>NFS3</code>, which indicates that the data repository must support the NFSv3 protocol.
     * </p>
     * 
     * @param version
     *        The version of the NFS (Network File System) protocol of the NFS data repository. The only supported value
     *        is <code>NFS3</code>, which indicates that the data repository must support the NFSv3 protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NfsVersion
     */

    public FileCacheNFSConfiguration withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The version of the NFS (Network File System) protocol of the NFS data repository. The only supported value is
     * <code>NFS3</code>, which indicates that the data repository must support the NFSv3 protocol.
     * </p>
     * 
     * @param version
     *        The version of the NFS (Network File System) protocol of the NFS data repository. The only supported value
     *        is <code>NFS3</code>, which indicates that the data repository must support the NFSv3 protocol.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NfsVersion
     */

    public FileCacheNFSConfiguration withVersion(NfsVersion version) {
        this.version = version.toString();
        return this;
    }

    /**
     * <p>
     * A list of up to 2 IP addresses of DNS servers used to resolve the NFS file system domain name. The provided IP
     * addresses can either be the IP addresses of a DNS forwarder or resolver that the customer manages and runs inside
     * the customer VPC, or the IP addresses of the on-premises DNS servers.
     * </p>
     * 
     * @return A list of up to 2 IP addresses of DNS servers used to resolve the NFS file system domain name. The
     *         provided IP addresses can either be the IP addresses of a DNS forwarder or resolver that the customer
     *         manages and runs inside the customer VPC, or the IP addresses of the on-premises DNS servers.
     */

    public java.util.List<String> getDnsIps() {
        return dnsIps;
    }

    /**
     * <p>
     * A list of up to 2 IP addresses of DNS servers used to resolve the NFS file system domain name. The provided IP
     * addresses can either be the IP addresses of a DNS forwarder or resolver that the customer manages and runs inside
     * the customer VPC, or the IP addresses of the on-premises DNS servers.
     * </p>
     * 
     * @param dnsIps
     *        A list of up to 2 IP addresses of DNS servers used to resolve the NFS file system domain name. The
     *        provided IP addresses can either be the IP addresses of a DNS forwarder or resolver that the customer
     *        manages and runs inside the customer VPC, or the IP addresses of the on-premises DNS servers.
     */

    public void setDnsIps(java.util.Collection<String> dnsIps) {
        if (dnsIps == null) {
            this.dnsIps = null;
            return;
        }

        this.dnsIps = new java.util.ArrayList<String>(dnsIps);
    }

    /**
     * <p>
     * A list of up to 2 IP addresses of DNS servers used to resolve the NFS file system domain name. The provided IP
     * addresses can either be the IP addresses of a DNS forwarder or resolver that the customer manages and runs inside
     * the customer VPC, or the IP addresses of the on-premises DNS servers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsIps(java.util.Collection)} or {@link #withDnsIps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param dnsIps
     *        A list of up to 2 IP addresses of DNS servers used to resolve the NFS file system domain name. The
     *        provided IP addresses can either be the IP addresses of a DNS forwarder or resolver that the customer
     *        manages and runs inside the customer VPC, or the IP addresses of the on-premises DNS servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCacheNFSConfiguration withDnsIps(String... dnsIps) {
        if (this.dnsIps == null) {
            setDnsIps(new java.util.ArrayList<String>(dnsIps.length));
        }
        for (String ele : dnsIps) {
            this.dnsIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of up to 2 IP addresses of DNS servers used to resolve the NFS file system domain name. The provided IP
     * addresses can either be the IP addresses of a DNS forwarder or resolver that the customer manages and runs inside
     * the customer VPC, or the IP addresses of the on-premises DNS servers.
     * </p>
     * 
     * @param dnsIps
     *        A list of up to 2 IP addresses of DNS servers used to resolve the NFS file system domain name. The
     *        provided IP addresses can either be the IP addresses of a DNS forwarder or resolver that the customer
     *        manages and runs inside the customer VPC, or the IP addresses of the on-premises DNS servers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileCacheNFSConfiguration withDnsIps(java.util.Collection<String> dnsIps) {
        setDnsIps(dnsIps);
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
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getDnsIps() != null)
            sb.append("DnsIps: ").append(getDnsIps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileCacheNFSConfiguration == false)
            return false;
        FileCacheNFSConfiguration other = (FileCacheNFSConfiguration) obj;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getDnsIps() == null ^ this.getDnsIps() == null)
            return false;
        if (other.getDnsIps() != null && other.getDnsIps().equals(this.getDnsIps()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getDnsIps() == null) ? 0 : getDnsIps().hashCode());
        return hashCode;
    }

    @Override
    public FileCacheNFSConfiguration clone() {
        try {
            return (FileCacheNFSConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.FileCacheNFSConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
