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
package com.amazonaws.services.neptune.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * An Active Directory Domain membership record associated with the DB instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/neptune-2014-10-31/DomainMembership" target="_top">AWS API
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
     * The status of the DB instance's Active Directory Domain membership, such as joined, pending-join, failed etc).
     * </p>
     */
    private String status;
    /**
     * <p>
     * The fully qualified domain name of the Active Directory Domain.
     * </p>
     */
    private String fQDN;
    /**
     * <p>
     * The name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     */
    private String iAMRoleName;

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
     * The status of the DB instance's Active Directory Domain membership, such as joined, pending-join, failed etc).
     * </p>
     * 
     * @param status
     *        The status of the DB instance's Active Directory Domain membership, such as joined, pending-join, failed
     *        etc).
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the DB instance's Active Directory Domain membership, such as joined, pending-join, failed etc).
     * </p>
     * 
     * @return The status of the DB instance's Active Directory Domain membership, such as joined, pending-join, failed
     *         etc).
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the DB instance's Active Directory Domain membership, such as joined, pending-join, failed etc).
     * </p>
     * 
     * @param status
     *        The status of the DB instance's Active Directory Domain membership, such as joined, pending-join, failed
     *        etc).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMembership withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The fully qualified domain name of the Active Directory Domain.
     * </p>
     * 
     * @param fQDN
     *        The fully qualified domain name of the Active Directory Domain.
     */

    public void setFQDN(String fQDN) {
        this.fQDN = fQDN;
    }

    /**
     * <p>
     * The fully qualified domain name of the Active Directory Domain.
     * </p>
     * 
     * @return The fully qualified domain name of the Active Directory Domain.
     */

    public String getFQDN() {
        return this.fQDN;
    }

    /**
     * <p>
     * The fully qualified domain name of the Active Directory Domain.
     * </p>
     * 
     * @param fQDN
     *        The fully qualified domain name of the Active Directory Domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMembership withFQDN(String fQDN) {
        setFQDN(fQDN);
        return this;
    }

    /**
     * <p>
     * The name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * 
     * @param iAMRoleName
     *        The name of the IAM role to be used when making API calls to the Directory Service.
     */

    public void setIAMRoleName(String iAMRoleName) {
        this.iAMRoleName = iAMRoleName;
    }

    /**
     * <p>
     * The name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * 
     * @return The name of the IAM role to be used when making API calls to the Directory Service.
     */

    public String getIAMRoleName() {
        return this.iAMRoleName;
    }

    /**
     * <p>
     * The name of the IAM role to be used when making API calls to the Directory Service.
     * </p>
     * 
     * @param iAMRoleName
     *        The name of the IAM role to be used when making API calls to the Directory Service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DomainMembership withIAMRoleName(String iAMRoleName) {
        setIAMRoleName(iAMRoleName);
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
            sb.append("IAMRoleName: ").append(getIAMRoleName());
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
