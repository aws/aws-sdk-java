/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * The configuration that Amazon FSx uses to join the Windows File Server instance to your self-managed (including
 * on-premises) Microsoft Active Directory (AD) directory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/SelfManagedActiveDirectoryConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelfManagedActiveDirectoryConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory, such as <code>corp.example.com</code>.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * (Optional) The fully qualified distinguished name of the organizational unit within your self-managed AD
     * directory that the Windows File Server instance will join. Amazon FSx only accepts OU as the direct parent of the
     * file system. An example is <code>OU=FSx,DC=yourdomain,DC=corp,DC=com</code>. To learn more, see <a
     * href="https://tools.ietf.org/html/rfc2253">RFC 2253</a>. If none is provided, the FSx file system is created in
     * the default location of your self-managed AD directory.
     * </p>
     * <important>
     * <p>
     * Only Organizational Unit (OU) objects can be the direct parent of the file system that you're creating.
     * </p>
     * </important>
     */
    private String organizationalUnitDistinguishedName;
    /**
     * <p>
     * (Optional) The name of the domain group whose members are granted administrative privileges for the file system.
     * Administrative privileges include taking ownership of files and folders, setting audit controls (audit ACLs) on
     * files and folders, and administering the file system remotely by using the FSx Remote PowerShell. The group that
     * you specify must already exist in your domain. If you don't provide one, your AD domain's Domain Admins group is
     * used.
     * </p>
     */
    private String fileSystemAdministratorsGroup;
    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD
     * domain. This account must have the permission to join computers to the domain in the organizational unit provided
     * in <code>OrganizationalUnitDistinguishedName</code>, or in the default location of your AD domain.
     * </p>
     */
    private String userName;
    /**
     * <p>
     * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD
     * domain.
     * </p>
     */
    private String password;
    /**
     * <p>
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP
     * addresses need to be either in the same VPC CIDR range as the one in which your Amazon FSx file system is being
     * created, or in the private IP version 4 (IPv4) address ranges, as specified in <a
     * href="http://www.faqs.org/rfcs/rfc1918.html">RFC 1918</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 10.0.0.0 - 10.255.255.255 (10/8 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> dnsIps;

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory, such as <code>corp.example.com</code>.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name of the self-managed AD directory, such as <code>corp.example.com</code>.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory, such as <code>corp.example.com</code>.
     * </p>
     * 
     * @return The fully qualified domain name of the self-managed AD directory, such as <code>corp.example.com</code>.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The fully qualified domain name of the self-managed AD directory, such as <code>corp.example.com</code>.
     * </p>
     * 
     * @param domainName
     *        The fully qualified domain name of the self-managed AD directory, such as <code>corp.example.com</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfiguration withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * (Optional) The fully qualified distinguished name of the organizational unit within your self-managed AD
     * directory that the Windows File Server instance will join. Amazon FSx only accepts OU as the direct parent of the
     * file system. An example is <code>OU=FSx,DC=yourdomain,DC=corp,DC=com</code>. To learn more, see <a
     * href="https://tools.ietf.org/html/rfc2253">RFC 2253</a>. If none is provided, the FSx file system is created in
     * the default location of your self-managed AD directory.
     * </p>
     * <important>
     * <p>
     * Only Organizational Unit (OU) objects can be the direct parent of the file system that you're creating.
     * </p>
     * </important>
     * 
     * @param organizationalUnitDistinguishedName
     *        (Optional) The fully qualified distinguished name of the organizational unit within your self-managed AD
     *        directory that the Windows File Server instance will join. Amazon FSx only accepts OU as the direct parent
     *        of the file system. An example is <code>OU=FSx,DC=yourdomain,DC=corp,DC=com</code>. To learn more, see <a
     *        href="https://tools.ietf.org/html/rfc2253">RFC 2253</a>. If none is provided, the FSx file system is
     *        created in the default location of your self-managed AD directory. </p> <important>
     *        <p>
     *        Only Organizational Unit (OU) objects can be the direct parent of the file system that you're creating.
     *        </p>
     */

    public void setOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        this.organizationalUnitDistinguishedName = organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * (Optional) The fully qualified distinguished name of the organizational unit within your self-managed AD
     * directory that the Windows File Server instance will join. Amazon FSx only accepts OU as the direct parent of the
     * file system. An example is <code>OU=FSx,DC=yourdomain,DC=corp,DC=com</code>. To learn more, see <a
     * href="https://tools.ietf.org/html/rfc2253">RFC 2253</a>. If none is provided, the FSx file system is created in
     * the default location of your self-managed AD directory.
     * </p>
     * <important>
     * <p>
     * Only Organizational Unit (OU) objects can be the direct parent of the file system that you're creating.
     * </p>
     * </important>
     * 
     * @return (Optional) The fully qualified distinguished name of the organizational unit within your self-managed AD
     *         directory that the Windows File Server instance will join. Amazon FSx only accepts OU as the direct
     *         parent of the file system. An example is <code>OU=FSx,DC=yourdomain,DC=corp,DC=com</code>. To learn more,
     *         see <a href="https://tools.ietf.org/html/rfc2253">RFC 2253</a>. If none is provided, the FSx file system
     *         is created in the default location of your self-managed AD directory. </p> <important>
     *         <p>
     *         Only Organizational Unit (OU) objects can be the direct parent of the file system that you're creating.
     *         </p>
     */

    public String getOrganizationalUnitDistinguishedName() {
        return this.organizationalUnitDistinguishedName;
    }

    /**
     * <p>
     * (Optional) The fully qualified distinguished name of the organizational unit within your self-managed AD
     * directory that the Windows File Server instance will join. Amazon FSx only accepts OU as the direct parent of the
     * file system. An example is <code>OU=FSx,DC=yourdomain,DC=corp,DC=com</code>. To learn more, see <a
     * href="https://tools.ietf.org/html/rfc2253">RFC 2253</a>. If none is provided, the FSx file system is created in
     * the default location of your self-managed AD directory.
     * </p>
     * <important>
     * <p>
     * Only Organizational Unit (OU) objects can be the direct parent of the file system that you're creating.
     * </p>
     * </important>
     * 
     * @param organizationalUnitDistinguishedName
     *        (Optional) The fully qualified distinguished name of the organizational unit within your self-managed AD
     *        directory that the Windows File Server instance will join. Amazon FSx only accepts OU as the direct parent
     *        of the file system. An example is <code>OU=FSx,DC=yourdomain,DC=corp,DC=com</code>. To learn more, see <a
     *        href="https://tools.ietf.org/html/rfc2253">RFC 2253</a>. If none is provided, the FSx file system is
     *        created in the default location of your self-managed AD directory. </p> <important>
     *        <p>
     *        Only Organizational Unit (OU) objects can be the direct parent of the file system that you're creating.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfiguration withOrganizationalUnitDistinguishedName(String organizationalUnitDistinguishedName) {
        setOrganizationalUnitDistinguishedName(organizationalUnitDistinguishedName);
        return this;
    }

    /**
     * <p>
     * (Optional) The name of the domain group whose members are granted administrative privileges for the file system.
     * Administrative privileges include taking ownership of files and folders, setting audit controls (audit ACLs) on
     * files and folders, and administering the file system remotely by using the FSx Remote PowerShell. The group that
     * you specify must already exist in your domain. If you don't provide one, your AD domain's Domain Admins group is
     * used.
     * </p>
     * 
     * @param fileSystemAdministratorsGroup
     *        (Optional) The name of the domain group whose members are granted administrative privileges for the file
     *        system. Administrative privileges include taking ownership of files and folders, setting audit controls
     *        (audit ACLs) on files and folders, and administering the file system remotely by using the FSx Remote
     *        PowerShell. The group that you specify must already exist in your domain. If you don't provide one, your
     *        AD domain's Domain Admins group is used.
     */

    public void setFileSystemAdministratorsGroup(String fileSystemAdministratorsGroup) {
        this.fileSystemAdministratorsGroup = fileSystemAdministratorsGroup;
    }

    /**
     * <p>
     * (Optional) The name of the domain group whose members are granted administrative privileges for the file system.
     * Administrative privileges include taking ownership of files and folders, setting audit controls (audit ACLs) on
     * files and folders, and administering the file system remotely by using the FSx Remote PowerShell. The group that
     * you specify must already exist in your domain. If you don't provide one, your AD domain's Domain Admins group is
     * used.
     * </p>
     * 
     * @return (Optional) The name of the domain group whose members are granted administrative privileges for the file
     *         system. Administrative privileges include taking ownership of files and folders, setting audit controls
     *         (audit ACLs) on files and folders, and administering the file system remotely by using the FSx Remote
     *         PowerShell. The group that you specify must already exist in your domain. If you don't provide one, your
     *         AD domain's Domain Admins group is used.
     */

    public String getFileSystemAdministratorsGroup() {
        return this.fileSystemAdministratorsGroup;
    }

    /**
     * <p>
     * (Optional) The name of the domain group whose members are granted administrative privileges for the file system.
     * Administrative privileges include taking ownership of files and folders, setting audit controls (audit ACLs) on
     * files and folders, and administering the file system remotely by using the FSx Remote PowerShell. The group that
     * you specify must already exist in your domain. If you don't provide one, your AD domain's Domain Admins group is
     * used.
     * </p>
     * 
     * @param fileSystemAdministratorsGroup
     *        (Optional) The name of the domain group whose members are granted administrative privileges for the file
     *        system. Administrative privileges include taking ownership of files and folders, setting audit controls
     *        (audit ACLs) on files and folders, and administering the file system remotely by using the FSx Remote
     *        PowerShell. The group that you specify must already exist in your domain. If you don't provide one, your
     *        AD domain's Domain Admins group is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfiguration withFileSystemAdministratorsGroup(String fileSystemAdministratorsGroup) {
        setFileSystemAdministratorsGroup(fileSystemAdministratorsGroup);
        return this;
    }

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD
     * domain. This account must have the permission to join computers to the domain in the organizational unit provided
     * in <code>OrganizationalUnitDistinguishedName</code>, or in the default location of your AD domain.
     * </p>
     * 
     * @param userName
     *        The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to
     *        your AD domain. This account must have the permission to join computers to the domain in the
     *        organizational unit provided in <code>OrganizationalUnitDistinguishedName</code>, or in the default
     *        location of your AD domain.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD
     * domain. This account must have the permission to join computers to the domain in the organizational unit provided
     * in <code>OrganizationalUnitDistinguishedName</code>, or in the default location of your AD domain.
     * </p>
     * 
     * @return The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to
     *         your AD domain. This account must have the permission to join computers to the domain in the
     *         organizational unit provided in <code>OrganizationalUnitDistinguishedName</code>, or in the default
     *         location of your AD domain.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD
     * domain. This account must have the permission to join computers to the domain in the organizational unit provided
     * in <code>OrganizationalUnitDistinguishedName</code>, or in the default location of your AD domain.
     * </p>
     * 
     * @param userName
     *        The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to
     *        your AD domain. This account must have the permission to join computers to the domain in the
     *        organizational unit provided in <code>OrganizationalUnitDistinguishedName</code>, or in the default
     *        location of your AD domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfiguration withUserName(String userName) {
        setUserName(userName);
        return this;
    }

    /**
     * <p>
     * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD
     * domain.
     * </p>
     * 
     * @param password
     *        The password for the service account on your self-managed AD domain that Amazon FSx will use to join to
     *        your AD domain.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD
     * domain.
     * </p>
     * 
     * @return The password for the service account on your self-managed AD domain that Amazon FSx will use to join to
     *         your AD domain.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD
     * domain.
     * </p>
     * 
     * @param password
     *        The password for the service account on your self-managed AD domain that Amazon FSx will use to join to
     *        your AD domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfiguration withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP
     * addresses need to be either in the same VPC CIDR range as the one in which your Amazon FSx file system is being
     * created, or in the private IP version 4 (IPv4) address ranges, as specified in <a
     * href="http://www.faqs.org/rfcs/rfc1918.html">RFC 1918</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 10.0.0.0 - 10.255.255.255 (10/8 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     * </p>
     * </li>
     * </ul>
     * 
     * @return A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     *         The IP addresses need to be either in the same VPC CIDR range as the one in which your Amazon FSx file
     *         system is being created, or in the private IP version 4 (IPv4) address ranges, as specified in <a
     *         href="http://www.faqs.org/rfcs/rfc1918.html">RFC 1918</a>:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         10.0.0.0 - 10.255.255.255 (10/8 prefix)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     *         </p>
     *         </li>
     */

    public java.util.List<String> getDnsIps() {
        return dnsIps;
    }

    /**
     * <p>
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP
     * addresses need to be either in the same VPC CIDR range as the one in which your Amazon FSx file system is being
     * created, or in the private IP version 4 (IPv4) address ranges, as specified in <a
     * href="http://www.faqs.org/rfcs/rfc1918.html">RFC 1918</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 10.0.0.0 - 10.255.255.255 (10/8 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     * </p>
     * </li>
     * </ul>
     * 
     * @param dnsIps
     *        A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     *        The IP addresses need to be either in the same VPC CIDR range as the one in which your Amazon FSx file
     *        system is being created, or in the private IP version 4 (IPv4) address ranges, as specified in <a
     *        href="http://www.faqs.org/rfcs/rfc1918.html">RFC 1918</a>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        10.0.0.0 - 10.255.255.255 (10/8 prefix)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     *        </p>
     *        </li>
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
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP
     * addresses need to be either in the same VPC CIDR range as the one in which your Amazon FSx file system is being
     * created, or in the private IP version 4 (IPv4) address ranges, as specified in <a
     * href="http://www.faqs.org/rfcs/rfc1918.html">RFC 1918</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 10.0.0.0 - 10.255.255.255 (10/8 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsIps(java.util.Collection)} or {@link #withDnsIps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param dnsIps
     *        A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     *        The IP addresses need to be either in the same VPC CIDR range as the one in which your Amazon FSx file
     *        system is being created, or in the private IP version 4 (IPv4) address ranges, as specified in <a
     *        href="http://www.faqs.org/rfcs/rfc1918.html">RFC 1918</a>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        10.0.0.0 - 10.255.255.255 (10/8 prefix)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfiguration withDnsIps(String... dnsIps) {
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
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory. The IP
     * addresses need to be either in the same VPC CIDR range as the one in which your Amazon FSx file system is being
     * created, or in the private IP version 4 (IPv4) address ranges, as specified in <a
     * href="http://www.faqs.org/rfcs/rfc1918.html">RFC 1918</a>:
     * </p>
     * <ul>
     * <li>
     * <p>
     * 10.0.0.0 - 10.255.255.255 (10/8 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     * </p>
     * </li>
     * <li>
     * <p>
     * 192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     * </p>
     * </li>
     * </ul>
     * 
     * @param dnsIps
     *        A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     *        The IP addresses need to be either in the same VPC CIDR range as the one in which your Amazon FSx file
     *        system is being created, or in the private IP version 4 (IPv4) address ranges, as specified in <a
     *        href="http://www.faqs.org/rfcs/rfc1918.html">RFC 1918</a>:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        10.0.0.0 - 10.255.255.255 (10/8 prefix)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        172.16.0.0 - 172.31.255.255 (172.16/12 prefix)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        192.168.0.0 - 192.168.255.255 (192.168/16 prefix)
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfiguration withDnsIps(java.util.Collection<String> dnsIps) {
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
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof SelfManagedActiveDirectoryConfiguration == false)
            return false;
        SelfManagedActiveDirectoryConfiguration other = (SelfManagedActiveDirectoryConfiguration) obj;
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
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
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
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getDnsIps() == null) ? 0 : getDnsIps().hashCode());
        return hashCode;
    }

    @Override
    public SelfManagedActiveDirectoryConfiguration clone() {
        try {
            return (SelfManagedActiveDirectoryConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.SelfManagedActiveDirectoryConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
