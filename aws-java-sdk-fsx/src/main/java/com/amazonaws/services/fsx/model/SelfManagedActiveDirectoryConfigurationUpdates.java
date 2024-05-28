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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies changes you are making to the self-managed Microsoft Active Directory (AD) configuration to which an FSx
 * for Windows File Server file system or an FSx for ONTAP SVM is joined.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/SelfManagedActiveDirectoryConfigurationUpdates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelfManagedActiveDirectoryConfigurationUpdates implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the updated user name for the service account on your self-managed AD domain. Amazon FSx uses this
     * account to join to your self-managed AD domain.
     * </p>
     * <p>
     * This account must have the permissions required to join computers to the domain in the organizational unit
     * provided in <code>OrganizationalUnitDistinguishedName</code>.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * Specifies the updated password for the service account on your self-managed AD domain. Amazon FSx uses this
     * account to join to your self-managed AD domain.
     * </p>
     */
    private String password;
    /**
     * <p>
     * A list of up to three DNS server or domain controller IP addresses in your self-managed AD domain.
     * </p>
     */
    private java.util.List<String> dnsIps;
    /**
     * <p>
     * Specifies an updated fully qualified domain name of your self-managed AD configuration.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * Specifies an updated fully qualified distinguished name of the organization unit within your self-managed AD.
     * </p>
     */
    private String organizationalUnitDistinguishedName;
    /**
     * <p>
     * Specifies the updated name of the self-managed AD domain group whose members are granted administrative
     * privileges for the Amazon FSx resource.
     * </p>
     */
    private String fileSystemAdministratorsGroup;

    /**
     * <p>
     * Specifies the updated user name for the service account on your self-managed AD domain. Amazon FSx uses this
     * account to join to your self-managed AD domain.
     * </p>
     * <p>
     * This account must have the permissions required to join computers to the domain in the organizational unit
     * provided in <code>OrganizationalUnitDistinguishedName</code>.
     * </p>
     * 
     * @param userName
     *        Specifies the updated user name for the service account on your self-managed AD domain. Amazon FSx uses
     *        this account to join to your self-managed AD domain.</p>
     *        <p>
     *        This account must have the permissions required to join computers to the domain in the organizational unit
     *        provided in <code>OrganizationalUnitDistinguishedName</code>.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * Specifies the updated user name for the service account on your self-managed AD domain. Amazon FSx uses this
     * account to join to your self-managed AD domain.
     * </p>
     * <p>
     * This account must have the permissions required to join computers to the domain in the organizational unit
     * provided in <code>OrganizationalUnitDistinguishedName</code>.
     * </p>
     * 
     * @return Specifies the updated user name for the service account on your self-managed AD domain. Amazon FSx uses
     *         this account to join to your self-managed AD domain.</p>
     *         <p>
     *         This account must have the permissions required to join computers to the domain in the organizational
     *         unit provided in <code>OrganizationalUnitDistinguishedName</code>.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * Specifies the updated user name for the service account on your self-managed AD domain. Amazon FSx uses this
     * account to join to your self-managed AD domain.
     * </p>
     * <p>
     * This account must have the permissions required to join computers to the domain in the organizational unit
     * provided in <code>OrganizationalUnitDistinguishedName</code>.
     * </p>
     * 
     * @param userName
     *        Specifies the updated user name for the service account on your self-managed AD domain. Amazon FSx uses
     *        this account to join to your self-managed AD domain.</p>
     *        <p>
     *        This account must have the permissions required to join computers to the domain in the organizational unit
     *        provided in <code>OrganizationalUnitDistinguishedName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfigurationUpdates withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * Specifies the updated password for the service account on your self-managed AD domain. Amazon FSx uses this
     * account to join to your self-managed AD domain.
     * </p>
     * 
     * @param password
     *        Specifies the updated password for the service account on your self-managed AD domain. Amazon FSx uses
     *        this account to join to your self-managed AD domain.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * Specifies the updated password for the service account on your self-managed AD domain. Amazon FSx uses this
     * account to join to your self-managed AD domain.
     * </p>
     * 
     * @return Specifies the updated password for the service account on your self-managed AD domain. Amazon FSx uses
     *         this account to join to your self-managed AD domain.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * Specifies the updated password for the service account on your self-managed AD domain. Amazon FSx uses this
     * account to join to your self-managed AD domain.
     * </p>
     * 
     * @param password
     *        Specifies the updated password for the service account on your self-managed AD domain. Amazon FSx uses
     *        this account to join to your self-managed AD domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfigurationUpdates withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * A list of up to three DNS server or domain controller IP addresses in your self-managed AD domain.
     * </p>
     * 
     * @return A list of up to three DNS server or domain controller IP addresses in your self-managed AD domain.
     */

    public java.util.List<String> getDnsIps() {
        return dnsIps;
    }

    /**
     * <p>
     * A list of up to three DNS server or domain controller IP addresses in your self-managed AD domain.
     * </p>
     * 
     * @param dnsIps
     *        A list of up to three DNS server or domain controller IP addresses in your self-managed AD domain.
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
     * A list of up to three DNS server or domain controller IP addresses in your self-managed AD domain.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsIps(java.util.Collection)} or {@link #withDnsIps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param dnsIps
     *        A list of up to three DNS server or domain controller IP addresses in your self-managed AD domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfigurationUpdates withDnsIps(String... dnsIps) {
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
     * A list of up to three DNS server or domain controller IP addresses in your self-managed AD domain.
     * </p>
     * 
     * @param dnsIps
     *        A list of up to three DNS server or domain controller IP addresses in your self-managed AD domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfigurationUpdates withDnsIps(java.util.Collection<String> dnsIps) {
        setDnsIps(dnsIps);
        return this;
    }

    /**
     * <p>
     * Specifies an updated fully qualified domain name of your self-managed AD configuration.
     * </p>
     * 
     * @param domainName
     *        Specifies an updated fully qualified domain name of your self-managed AD configuration.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * Specifies an updated fully qualified domain name of your self-managed AD configuration.
     * </p>
     * 
     * @return Specifies an updated fully qualified domain name of your self-managed AD configuration.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * Specifies an updated fully qualified domain name of your self-managed AD configuration.
     * </p>
     * 
     * @param domainName
     *        Specifies an updated fully qualified domain name of your self-managed AD configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfigurationUpdates withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * Specifies an updated fully qualified distinguished name of the organization unit within your self-managed AD.
     * </p>
     * 
     * @param organizationalUnitDistinguishedName
     *        Specifies an updated fully qualified distinguished name of the organization unit within your self-managed
     *        AD.
     */

    public void setOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * Specifies an updated fully qualified distinguished name of the organization unit within your self-managed AD.
     * </p>
     * 
     * @return Specifies an updated fully qualified distinguished name of the organization unit within your self-managed
     *         AD.
     */

    public String getOrganizationalUnitDistinguishedName() {
        return this.organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * Specifies an updated fully qualified distinguished name of the organization unit within your self-managed AD.
     * </p>
     * 
     * @param organizationalUnitDistinguishedName
     *        Specifies an updated fully qualified distinguished name of the organization unit within your self-managed
     *        AD.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfigurationUpdates withOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        setOrganizationalUnitDistinguishedName(organizationalUnitDistinguishedName);
        return this;
    }

    /**
     * <p>
     * Specifies the updated name of the self-managed AD domain group whose members are granted administrative
     * privileges for the Amazon FSx resource.
     * </p>
     * 
     * @param fileSystemAdministratorsGroup
     *        Specifies the updated name of the self-managed AD domain group whose members are granted administrative
     *        privileges for the Amazon FSx resource.
     */

    public void setFileSystemAdministratorsGroup(String fileSystemAdministratorsGroup) {
        this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
    }

    /**
     * <p>
     * Specifies the updated name of the self-managed AD domain group whose members are granted administrative
     * privileges for the Amazon FSx resource.
     * </p>
     * 
     * @return Specifies the updated name of the self-managed AD domain group whose members are granted administrative
     *         privileges for the Amazon FSx resource.
     */

    public String getFileSystemAdministratorsGroup() {
        return this.fileSystemAdministratorsGroup;
    }

    /**
     * <p>
     * Specifies the updated name of the self-managed AD domain group whose members are granted administrative
     * privileges for the Amazon FSx resource.
     * </p>
     * 
     * @param fileSystemAdministratorsGroup
     *        Specifies the updated name of the self-managed AD domain group whose members are granted administrative
     *        privileges for the Amazon FSx resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfigurationUpdates withFileSystemAdministratorsGroup(String fileSystemAdministratorsGroup) {
        setFileSystemAdministratorsGroup(fileSystemAdministratorsGroup);
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
        if (getUserName() != null)
            sb.append("UserName: ").append(getUserName()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getDnsIps() != null)
            sb.append("DnsIps: ").append(getDnsIps()).append(",");
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getOrganizationalUnitDistinguishedName() != null)
            sb.append("OrganizationalUnitDistinguishedName: ").append(getOrganizationalUnitDistinguishedName()).append(",");
        if (getFileSystemAdministratorsGroup() != null)
            sb.append("FileSystemAdministratorsGroup: ").append(getFileSystemAdministratorsGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelfManagedActiveDirectoryConfigurationUpdates == false)
            return false;
        SelfManagedActiveDirectoryConfigurationUpdates other = (SelfManagedActiveDirectoryConfigurationUpdates) obj;
        if (other.getUserName() == null ^ this.getUserName() == null)
            return false;
        if (other.getUserName() != null && other.getUserName().equals(this.getUserName()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getDnsIps() == null ^ this.getDnsIps() == null)
            return false;
        if (other.getDnsIps() != null && other.getDnsIps().equals(this.getDnsIps()) == false)
            return false;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getDnsIps() == null) ? 0 : getDnsIps().hashCode());
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getOrganizationalUnitDistinguishedName() == null) ? 0 : getOrganizationalUnitDistinguishedName().hashCode());
        hashCode = prime * hashCode + ((getFileSystemAdministratorsGroup() == null) ? 0 : getFileSystemAdministratorsGroup().hashCode());
        return hashCode;
    }

    @Override
    public SelfManagedActiveDirectoryConfigurationUpdates clone() {
        try {
            return (SelfManagedActiveDirectoryConfigurationUpdates) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.SelfManagedActiveDirectoryConfigurationUpdatesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
