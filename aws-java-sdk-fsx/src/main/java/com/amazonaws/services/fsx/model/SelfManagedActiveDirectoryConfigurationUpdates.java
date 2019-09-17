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
 * The configuration that Amazon FSx uses to join the Windows File Server instance to the self-managed Microsoft Active
 * Directory (AD) directory.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/SelfManagedActiveDirectoryConfigurationUpdates"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelfManagedActiveDirectoryConfigurationUpdates implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD
     * domain. This account must have the permission to join computers to the domain in the organizational unit provided
     * in <code>OrganizationalUnitDistinguishedName</code>.
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
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     * </p>
     */
    private java.util.List<String> dnsIps;

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD
     * domain. This account must have the permission to join computers to the domain in the organizational unit provided
     * in <code>OrganizationalUnitDistinguishedName</code>.
     * </p>
     * 
     * @param userName
     *        The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to
     *        your AD domain. This account must have the permission to join computers to the domain in the
     *        organizational unit provided in <code>OrganizationalUnitDistinguishedName</code>.
     */

    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD
     * domain. This account must have the permission to join computers to the domain in the organizational unit provided
     * in <code>OrganizationalUnitDistinguishedName</code>.
     * </p>
     * 
     * @return The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to
     *         your AD domain. This account must have the permission to join computers to the domain in the
     *         organizational unit provided in <code>OrganizationalUnitDistinguishedName</code>.
     */

    public String getUserName() {
        return this.userName;
    }

    /**
     * <p>
     * The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to your AD
     * domain. This account must have the permission to join computers to the domain in the organizational unit provided
     * in <code>OrganizationalUnitDistinguishedName</code>.
     * </p>
     * 
     * @param userName
     *        The user name for the service account on your self-managed AD domain that Amazon FSx will use to join to
     *        your AD domain. This account must have the permission to join computers to the domain in the
     *        organizational unit provided in <code>OrganizationalUnitDistinguishedName</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfigurationUpdates withUserName(String userName) {
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

    public SelfManagedActiveDirectoryConfigurationUpdates withPassword(String password) {
        setPassword(password);
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
     * A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     * </p>
     * 
     * @param dnsIps
     *        A list of up to two IP addresses of DNS servers or domain controllers in the self-managed AD directory.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelfManagedActiveDirectoryConfigurationUpdates withDnsIps(java.util.Collection<String> dnsIps) {
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUserName() == null) ? 0 : getUserName().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getDnsIps() == null) ? 0 : getDnsIps().hashCode());
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
