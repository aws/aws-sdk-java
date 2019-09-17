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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration of the self-managed Microsoft Active Directory (AD) directory to which the Windows File Server
 * instance is joined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/SelfManagedActiveDirectoryAttributes"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelfManagedActiveDirectoryAttributes implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The fully qualified distinguished name of the organizational unit within the self-managed AD directory to which
     * the Windows File Server instance is joined.
     * </p>
     */
    private String organizationalUnitDistinguishedName;
    /**
     * <p>
     * The name of the domain group whose members have administrative privileges for the FSx file system.
     * </p>
     */
    private String fileSystemAdministratorsGroup;
    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that FSx uses to join to your AD domain.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     * </p>
     */
    private java.util.List<String> dnsIps;

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name of the self-managed AD directory.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     * 
     * @return The fully qualified domain name of the self-managed AD directory.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name of the self-managed AD directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryAttributes withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The fully qualified distinguished name of the organizational unit within the self-managed AD directory to which
     * the Windows File Server instance is joined.
     * </p>
     * 
     * @param organizationalUnitDistinguishedName
     *        The fully qualified distinguished name of the organizational unit within the self-managed AD directory to
     *        which the Windows File Server instance is joined.
     */

    public void setOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * The fully qualified distinguished name of the organizational unit within the self-managed AD directory to which
     * the Windows File Server instance is joined.
     * </p>
     * 
     * @return The fully qualified distinguished name of the organizational unit within the self-managed AD directory to
     *         which the Windows File Server instance is joined.
     */

    public String getOrganizationalUnitDistinguishedName() {
        return this.organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * The fully qualified distinguished name of the organizational unit within the self-managed AD directory to which
     * the Windows File Server instance is joined.
     * </p>
     * 
     * @param organizationalUnitDistinguishedName
     *        The fully qualified distinguished name of the organizational unit within the self-managed AD directory to
     *        which the Windows File Server instance is joined.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryAttributes withOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        setOrganizationalUnitDistinguishedName(organizationalUnitDistinguishedName);
        return this;
    }

    /**
     * <p>
     * The name of the domain group whose members have administrative privileges for the FSx file system.
     * </p>
     * 
     * @param fileSystemAdministratorsGroup
     *        The name of the domain group whose members have administrative privileges for the FSx file system.
     */

    public void setFileSystemAdministratorsGroup(String fileSystemAdministratorsGroup) {
        this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
    }

    /**
     * <p>
     * The name of the domain group whose members have administrative privileges for the FSx file system.
     * </p>
     * 
     * @return The name of the domain group whose members have administrative privileges for the FSx file system.
     */

    public String getFileSystemAdministratorsGroup() {
        return this.fileSystemAdministratorsGroup;
    }

    /**
     * <p>
     * The name of the domain group whose members have administrative privileges for the FSx file system.
     * </p>
     * 
     * @param fileSystemAdministratorsGroup
     *        The name of the domain group whose members have administrative privileges for the FSx file system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryAttributes withFileSystemAdministratorsGroup(String fileSystemAdministratorsGroup) {
        setFileSystemAdministratorsGroup(fileSystemAdministratorsGroup);
        return this;
    }

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that FSx uses to join to your AD domain.
     * </p>
     * 
     * @param userName
     *        The user name for the service account on your self-managed AD domain that FSx uses to join to your AD
     *        domain.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that FSx uses to join to your AD domain.
     * </p>
     * 
     * @return The user name for the service account on your self-managed AD domain that FSx uses to join to your AD
     *         domain.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that FSx uses to join to your AD domain.
     * </p>
     * 
     * @param userName
     *        The user name for the service account on your self-managed AD domain that FSx uses to join to your AD
     *        domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryAttributes withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     * </p>
     * 
     * @return A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     */

    public java.util.List<String> getDnsIps() {
        return dnsIps;
    }

    /**
     * <p>
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     * </p>
     * 
     * @param dnsIps
     *        A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
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
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsIps(java.util.Collection)} or {@link #withDnsIps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param dnsIps
     *        A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryAttributes withDnsIps(String... dnsIps) {
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
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     * </p>
     * 
     * @param dnsIps
     *        A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryAttributes withDnsIps(java.util.Collection<String> dnsIps) {
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getOrganizationalUnitDistinguishedName() != null)
            sb.append("OrganizationalUnitDistinguishedName: ").append(getOrganizationalUnitDistinguishedName()).append(",");
        if (getFileSystemAdministratorsGroup() != null)
            sb.append("FileSystemAdministratorsGroup: ").append(getFileSystemAdministratorsGroup()).append(",");
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
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

        if (obj instanceof SelfManagedActiveDirectoryAttributes == false)
            return false;
        SelfManagedActiveDirectoryAttributes other = (SelfManagedActiveDirectoryAttributes) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getOrganizationalUnitDistinguishedName() == null ^ this.getOrganizationalUnitDistinguishedName() == null)
            return false;
        if (other.getOrganizationalUnitDistinguishedName() != null
                && other.getOrganizationalUnitDistinguishedName().equals(this.getOrganizationalUnitDistinguishedName()) == false)
            return false;
        if (other.getFileSystemAdministratorsGroup() == null ^ this.getFileSystemAdministratorsGroup() == null)
            return false;
        if (other.getFileSystemAdministratorsGroup() != null
                && other.getFileSystemAdministratorsGroup().equals(this.getFileSystemAdministratorsGroup()) == false)
            return false;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
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

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitDistinguishedName() == null) ? 0 : getOrganizationalUnitDistinguishedName().hashCode());
        hashCode = prime * hashCode + ((getFileSystemAdministratorsGroup() == null) ? 0 : getFileSystemAdministratorsGroup().hashCode());
        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getDnsIps() == null) ? 0 : getDnsIps().hashCode());
        return hashCode;
    }

    @Override
    public SelfManagedActiveDirectoryAttributes clone() {
        try {
            return (SelfManagedActiveDirectoryAttributes) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.SelfManagedActiveDirectoryAttributesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
