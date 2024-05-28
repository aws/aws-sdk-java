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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An Active Directory Domain membership record associated with the DB instance or cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DomainMembership" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DomainMembership implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the Active Directory Domain.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The status of the Active Directory Domain membership for the DB instance or cluster. Values include
     * <code>joined</code>, <code>pending-join</code>, <code>failed</code>, and so on.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The fully qualified domain name (FQDN) of the Active Directory Domain.
     * </p>
     */
    private String fQDN;
    /**
     * <p>
     * The name of the IAM role used when making API calls to the Directory Service.
     * </p>
     */
    private String iAMRoleName;
    /**
     * <p>
     * The Active Directory organizational unit for the DB instance or cluster.
     * </p>
     */
    private String oU;
    /**
     * <p>
     * The ARN for the Secrets Manager secret with the credentials for the user that's a member of the domain.
     * </p>
     */
    private String authSecretArn;
    /**
     * <p>
     * The IPv4 DNS IP addresses of the primary and secondary Active Directory domain controllers.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> dnsIps;

    /**
     * <p>
     * The identifier of the Active Directory Domain.
     * </p>
     * 
     * @param domain
     *        The identifier of the Active Directory Domain.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The identifier of the Active Directory Domain.
     * </p>
     * 
     * @return The identifier of the Active Directory Domain.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The identifier of the Active Directory Domain.
     * </p>
     * 
     * @param domain
     *        The identifier of the Active Directory Domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMembership withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The status of the Active Directory Domain membership for the DB instance or cluster. Values include
     * <code>joined</code>, <code>pending-join</code>, <code>failed</code>, and so on.
     * </p>
     * 
     * @param status
     *        The status of the Active Directory Domain membership for the DB instance or cluster. Values include
     *        <code>joined</code>, <code>pending-join</code>, <code>failed</code>, and so on.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the Active Directory Domain membership for the DB instance or cluster. Values include
     * <code>joined</code>, <code>pending-join</code>, <code>failed</code>, and so on.
     * </p>
     * 
     * @return The status of the Active Directory Domain membership for the DB instance or cluster. Values include
     *         <code>joined</code>, <code>pending-join</code>, <code>failed</code>, and so on.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the Active Directory Domain membership for the DB instance or cluster. Values include
     * <code>joined</code>, <code>pending-join</code>, <code>failed</code>, and so on.
     * </p>
     * 
     * @param status
     *        The status of the Active Directory Domain membership for the DB instance or cluster. Values include
     *        <code>joined</code>, <code>pending-join</code>, <code>failed</code>, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMembership withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the Active Directory Domain.
     * </p>
     * 
     * @param fQDN
     *        The fully qualified domain name (FQDN) of the Active Directory Domain.
     */

    public void setFQDN(String fQDN) {
        this.fQDN = fQDN;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the Active Directory Domain.
     * </p>
     * 
     * @return The fully qualified domain name (FQDN) of the Active Directory Domain.
     */

    public String getFQDN() {
        return this.fQDN;
    }

    /**
     * <p>
     * The fully qualified domain name (FQDN) of the Active Directory Domain.
     * </p>
     * 
     * @param fQDN
     *        The fully qualified domain name (FQDN) of the Active Directory Domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMembership withFQDN(String fQDN) {
        setFQDN(fQDN);
        return this;
    }

    /**
     * <p>
     * The name of the IAM role used when making API calls to the Directory Service.
     * </p>
     * 
     * @param iAMRoleName
     *        The name of the IAM role used when making API calls to the Directory Service.
     */

    public void setIAMRoleName(String iAMRoleName) {
        this.iAMRoleName = iAMRoleName;
    }

    /**
     * <p>
     * The name of the IAM role used when making API calls to the Directory Service.
     * </p>
     * 
     * @return The name of the IAM role used when making API calls to the Directory Service.
     */

    public String getIAMRoleName() {
        return this.iAMRoleName;
    }

    /**
     * <p>
     * The name of the IAM role used when making API calls to the Directory Service.
     * </p>
     * 
     * @param iAMRoleName
     *        The name of the IAM role used when making API calls to the Directory Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMembership withIAMRoleName(String iAMRoleName) {
        setIAMRoleName(iAMRoleName);
        return this;
    }

    /**
     * <p>
     * The Active Directory organizational unit for the DB instance or cluster.
     * </p>
     * 
     * @param oU
     *        The Active Directory organizational unit for the DB instance or cluster.
     */

    public void setOU(String oU) {
        this.oU = oU;
    }

    /**
     * <p>
     * The Active Directory organizational unit for the DB instance or cluster.
     * </p>
     * 
     * @return The Active Directory organizational unit for the DB instance or cluster.
     */

    public String getOU() {
        return this.oU;
    }

    /**
     * <p>
     * The Active Directory organizational unit for the DB instance or cluster.
     * </p>
     * 
     * @param oU
     *        The Active Directory organizational unit for the DB instance or cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMembership withOU(String oU) {
        setOU(oU);
        return this;
    }

    /**
     * <p>
     * The ARN for the Secrets Manager secret with the credentials for the user that's a member of the domain.
     * </p>
     * 
     * @param authSecretArn
     *        The ARN for the Secrets Manager secret with the credentials for the user that's a member of the domain.
     */

    public void setAuthSecretArn(String authSecretArn) {
        this.authSecretArn = authSecretArn;
    }

    /**
     * <p>
     * The ARN for the Secrets Manager secret with the credentials for the user that's a member of the domain.
     * </p>
     * 
     * @return The ARN for the Secrets Manager secret with the credentials for the user that's a member of the domain.
     */

    public String getAuthSecretArn() {
        return this.authSecretArn;
    }

    /**
     * <p>
     * The ARN for the Secrets Manager secret with the credentials for the user that's a member of the domain.
     * </p>
     * 
     * @param authSecretArn
     *        The ARN for the Secrets Manager secret with the credentials for the user that's a member of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMembership withAuthSecretArn(String authSecretArn) {
        setAuthSecretArn(authSecretArn);
        return this;
    }

    /**
     * <p>
     * The IPv4 DNS IP addresses of the primary and secondary Active Directory domain controllers.
     * </p>
     * 
     * @return The IPv4 DNS IP addresses of the primary and secondary Active Directory domain controllers.
     */

    public java.util.List<String> getDnsIps() {
        if (dnsIps == null) {
            dnsIps = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return dnsIps;
    }

    /**
     * <p>
     * The IPv4 DNS IP addresses of the primary and secondary Active Directory domain controllers.
     * </p>
     * 
     * @param dnsIps
     *        The IPv4 DNS IP addresses of the primary and secondary Active Directory domain controllers.
     */

    public void setDnsIps(java.util.Collection<String> dnsIps) {
        if (dnsIps == null) {
            this.dnsIps = null;
            return;
        }

        this.dnsIps = new com.amazonaws.internal.SdkInternalList<String>(dnsIps);
    }

    /**
     * <p>
     * The IPv4 DNS IP addresses of the primary and secondary Active Directory domain controllers.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDnsIps(java.util.Collection)} or {@link #withDnsIps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param dnsIps
     *        The IPv4 DNS IP addresses of the primary and secondary Active Directory domain controllers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMembership withDnsIps(String... dnsIps) {
        if (this.dnsIps == null) {
            setDnsIps(new com.amazonaws.internal.SdkInternalList<String>(dnsIps.length));
        }
        for (String ele : dnsIps) {
            this.dnsIps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv4 DNS IP addresses of the primary and secondary Active Directory domain controllers.
     * </p>
     * 
     * @param dnsIps
     *        The IPv4 DNS IP addresses of the primary and secondary Active Directory domain controllers.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMembership withDnsIps(java.util.Collection<String> dnsIps) {
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
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFQDN() != null)
            sb.append("FQDN: ").append(getFQDN()).append(",");
        if (getIAMRoleName() != null)
            sb.append("IAMRoleName: ").append(getIAMRoleName()).append(",");
        if (getOU() != null)
            sb.append("OU: ").append(getOU()).append(",");
        if (getAuthSecretArn() != null)
            sb.append("AuthSecretArn: ").append(getAuthSecretArn()).append(",");
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

        if (obj instanceof DomainMembership == false)
            return false;
        DomainMembership other = (DomainMembership) obj;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFQDN() == null ^ this.getFQDN() == null)
            return false;
        if (other.getFQDN() != null && other.getFQDN().equals(this.getFQDN()) == false)
            return false;
        if (other.getIAMRoleName() == null ^ this.getIAMRoleName() == null)
            return false;
        if (other.getIAMRoleName() != null && other.getIAMRoleName().equals(this.getIAMRoleName()) == false)
            return false;
        if (other.getOU() == null ^ this.getOU() == null)
            return false;
        if (other.getOU() != null && other.getOU().equals(this.getOU()) == false)
            return false;
        if (other.getAuthSecretArn() == null ^ this.getAuthSecretArn() == null)
            return false;
        if (other.getAuthSecretArn() != null && other.getAuthSecretArn().equals(this.getAuthSecretArn()) == false)
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

        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFQDN() == null) ? 0 : getFQDN().hashCode());
        hashCode = prime * hashCode + ((getIAMRoleName() == null) ? 0 : getIAMRoleName().hashCode());
        hashCode = prime * hashCode + ((getOU() == null) ? 0 : getOU().hashCode());
        hashCode = prime * hashCode + ((getAuthSecretArn() == null) ? 0 : getAuthSecretArn().hashCode());
        hashCode = prime * hashCode + ((getDnsIps() == null) ? 0 : getDnsIps().hashCode());
        return hashCode;
    }

    @Override
    public DomainMembership clone() {
        try {
            return (DomainMembership) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
