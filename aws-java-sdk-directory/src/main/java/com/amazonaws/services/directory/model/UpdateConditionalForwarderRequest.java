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
package com.amazonaws.services.directory.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Updates a conditional forwarder.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ds-2015-04-16/UpdateConditionalForwarder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateConditionalForwarderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The directory ID of the AWS directory for which to update the conditional forwarder.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust relationship.
     * </p>
     */
    private String remoteDomainName;
    /**
     * <p>
     * The updated IP addresses of the remote DNS server associated with the conditional forwarder.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dnsIpAddrs;

    /**
     * <p>
     * The directory ID of the AWS directory for which to update the conditional forwarder.
     * </p>
     * 
     * @param directoryId
     *        The directory ID of the AWS directory for which to update the conditional forwarder.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The directory ID of the AWS directory for which to update the conditional forwarder.
     * </p>
     * 
     * @return The directory ID of the AWS directory for which to update the conditional forwarder.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The directory ID of the AWS directory for which to update the conditional forwarder.
     * </p>
     * 
     * @param directoryId
     *        The directory ID of the AWS directory for which to update the conditional forwarder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConditionalForwarderRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust relationship.
     * </p>
     * 
     * @param remoteDomainName
     *        The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust
     *        relationship.
     */

    public void setRemoteDomainName(String remoteDomainName) {
        this.remoteDomainName = remoteDomainName;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust relationship.
     * </p>
     * 
     * @return The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust
     *         relationship.
     */

    public String getRemoteDomainName() {
        return this.remoteDomainName;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust relationship.
     * </p>
     * 
     * @param remoteDomainName
     *        The fully qualified domain name (FQDN) of the remote domain with which you will set up a trust
     *        relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConditionalForwarderRequest withRemoteDomainName(String remoteDomainName) {
        setRemoteDomainName(remoteDomainName);
        return this;
    }

    /**
     * <p>
     * The updated IP addresses of the remote DNS server associated with the conditional forwarder.
     * </p>
     * 
     * @return The updated IP addresses of the remote DNS server associated with the conditional forwarder.
     */

    public java.util.List<String> getDnsIpAddrs() {
        if (dnsIpAddrs == null) {
            dnsIpAddrs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dnsIpAddrs;
    }

    /**
     * <p>
     * The updated IP addresses of the remote DNS server associated with the conditional forwarder.
     * </p>
     * 
     * @param dnsIpAddrs
     *        The updated IP addresses of the remote DNS server associated with the conditional forwarder.
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
     * The updated IP addresses of the remote DNS server associated with the conditional forwarder.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsIpAddrs(java.util.Collection)} or {@link #withDnsIpAddrs(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param dnsIpAddrs
     *        The updated IP addresses of the remote DNS server associated with the conditional forwarder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConditionalForwarderRequest withDnsIpAddrs(String... dnsIpAddrs) {
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
     * The updated IP addresses of the remote DNS server associated with the conditional forwarder.
     * </p>
     * 
     * @param dnsIpAddrs
     *        The updated IP addresses of the remote DNS server associated with the conditional forwarder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateConditionalForwarderRequest withDnsIpAddrs(java.util.Collection<String> dnsIpAddrs) {
        setDnsIpAddrs(dnsIpAddrs);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: ").append(getDirectoryId()).append(",");
        if (getRemoteDomainName() != null)
            sb.append("RemoteDomainName: ").append(getRemoteDomainName()).append(",");
        if (getDnsIpAddrs() != null)
            sb.append("DnsIpAddrs: ").append(getDnsIpAddrs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateConditionalForwarderRequest == false)
            return false;
        UpdateConditionalForwarderRequest other = (UpdateConditionalForwarderRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getRemoteDomainName() == null ^ this.getRemoteDomainName() == null)
            return false;
        if (other.getRemoteDomainName() != null && other.getRemoteDomainName().equals(this.getRemoteDomainName()) == false)
            return false;
        if (other.getDnsIpAddrs() == null ^ this.getDnsIpAddrs() == null)
            return false;
        if (other.getDnsIpAddrs() != null && other.getDnsIpAddrs().equals(this.getDnsIpAddrs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getRemoteDomainName() == null) ? 0 : getRemoteDomainName().hashCode());
        hashCode = prime * hashCode + ((getDnsIpAddrs() == null) ? 0 : getDnsIpAddrs().hashCode());
        return hashCode;
    }

    @Override
    public UpdateConditionalForwarderRequest clone() {
        return (UpdateConditionalForwarderRequest) super.clone();
    }

}
