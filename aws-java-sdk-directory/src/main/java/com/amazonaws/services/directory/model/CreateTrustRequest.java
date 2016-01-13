/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.directory.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * AWS Directory Service for Microsoft Active Directory allows you to configure
 * trust relationships. For example, you can establish a trust between your
 * Microsoft AD in the AWS cloud, and your existing on-premises Microsoft Active
 * Directory. This would allow you to provide users and groups access to
 * resources in either domain, with a single set of credentials.
 * </p>
 * <p>
 * This action initiates the creation of the AWS side of a trust relationship
 * between a Microsoft AD in the AWS cloud and an external domain.
 * </p>
 */
public class CreateTrustRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * The Directory ID of the Microsoft AD in the AWS cloud for which to
     * establish the trust relationship.
     */
    private String directoryId;
    /**
     * The Fully Qualified Domain Name (FQDN) of the external domain for which
     * to create the trust relationship.
     */
    private String remoteDomainName;
    /**
     * The trust password. The must be the same password that was used when
     * creating the trust relationship on the external domain.
     */
    private String trustPassword;
    /** The direction of the trust relationship. */
    private String trustDirection;
    /** The trust relationship type. */
    private String trustType;

    /**
     * The Directory ID of the Microsoft AD in the AWS cloud for which to
     * establish the trust relationship.
     * 
     * @param directoryId
     *        The Directory ID of the Microsoft AD in the AWS cloud for which to
     *        establish the trust relationship.
     */
    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * The Directory ID of the Microsoft AD in the AWS cloud for which to
     * establish the trust relationship.
     * 
     * @return The Directory ID of the Microsoft AD in the AWS cloud for which
     *         to establish the trust relationship.
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * The Directory ID of the Microsoft AD in the AWS cloud for which to
     * establish the trust relationship.
     * 
     * @param directoryId
     *        The Directory ID of the Microsoft AD in the AWS cloud for which to
     *        establish the trust relationship.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateTrustRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * The Fully Qualified Domain Name (FQDN) of the external domain for which
     * to create the trust relationship.
     * 
     * @param remoteDomainName
     *        The Fully Qualified Domain Name (FQDN) of the external domain for
     *        which to create the trust relationship.
     */
    public void setRemoteDomainName(String remoteDomainName) {
        this.remoteDomainName = remoteDomainName;
    }

    /**
     * The Fully Qualified Domain Name (FQDN) of the external domain for which
     * to create the trust relationship.
     * 
     * @return The Fully Qualified Domain Name (FQDN) of the external domain for
     *         which to create the trust relationship.
     */
    public String getRemoteDomainName() {
        return this.remoteDomainName;
    }

    /**
     * The Fully Qualified Domain Name (FQDN) of the external domain for which
     * to create the trust relationship.
     * 
     * @param remoteDomainName
     *        The Fully Qualified Domain Name (FQDN) of the external domain for
     *        which to create the trust relationship.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateTrustRequest withRemoteDomainName(String remoteDomainName) {
        setRemoteDomainName(remoteDomainName);
        return this;
    }

    /**
     * The trust password. The must be the same password that was used when
     * creating the trust relationship on the external domain.
     * 
     * @param trustPassword
     *        The trust password. The must be the same password that was used
     *        when creating the trust relationship on the external domain.
     */
    public void setTrustPassword(String trustPassword) {
        this.trustPassword = trustPassword;
    }

    /**
     * The trust password. The must be the same password that was used when
     * creating the trust relationship on the external domain.
     * 
     * @return The trust password. The must be the same password that was used
     *         when creating the trust relationship on the external domain.
     */
    public String getTrustPassword() {
        return this.trustPassword;
    }

    /**
     * The trust password. The must be the same password that was used when
     * creating the trust relationship on the external domain.
     * 
     * @param trustPassword
     *        The trust password. The must be the same password that was used
     *        when creating the trust relationship on the external domain.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateTrustRequest withTrustPassword(String trustPassword) {
        setTrustPassword(trustPassword);
        return this;
    }

    /**
     * The direction of the trust relationship.
     * 
     * @param trustDirection
     *        The direction of the trust relationship.
     * @see TrustDirection
     */
    public void setTrustDirection(String trustDirection) {
        this.trustDirection = trustDirection;
    }

    /**
     * The direction of the trust relationship.
     * 
     * @return The direction of the trust relationship.
     * @see TrustDirection
     */
    public String getTrustDirection() {
        return this.trustDirection;
    }

    /**
     * The direction of the trust relationship.
     * 
     * @param trustDirection
     *        The direction of the trust relationship.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustDirection
     */
    public CreateTrustRequest withTrustDirection(String trustDirection) {
        setTrustDirection(trustDirection);
        return this;
    }

    /**
     * The direction of the trust relationship.
     * 
     * @param trustDirection
     *        The direction of the trust relationship.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustDirection
     */
    public void setTrustDirection(TrustDirection trustDirection) {
        this.trustDirection = trustDirection.toString();
    }

    /**
     * The direction of the trust relationship.
     * 
     * @param trustDirection
     *        The direction of the trust relationship.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustDirection
     */
    public CreateTrustRequest withTrustDirection(TrustDirection trustDirection) {
        setTrustDirection(trustDirection);
        return this;
    }

    /**
     * The trust relationship type.
     * 
     * @param trustType
     *        The trust relationship type.
     * @see TrustType
     */
    public void setTrustType(String trustType) {
        this.trustType = trustType;
    }

    /**
     * The trust relationship type.
     * 
     * @return The trust relationship type.
     * @see TrustType
     */
    public String getTrustType() {
        return this.trustType;
    }

    /**
     * The trust relationship type.
     * 
     * @param trustType
     *        The trust relationship type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustType
     */
    public CreateTrustRequest withTrustType(String trustType) {
        setTrustType(trustType);
        return this;
    }

    /**
     * The trust relationship type.
     * 
     * @param trustType
     *        The trust relationship type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustType
     */
    public void setTrustType(TrustType trustType) {
        this.trustType = trustType.toString();
    }

    /**
     * The trust relationship type.
     * 
     * @param trustType
     *        The trust relationship type.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     * @see TrustType
     */
    public CreateTrustRequest withTrustType(TrustType trustType) {
        setTrustType(trustType);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getRemoteDomainName() != null)
            sb.append("RemoteDomainName: " + getRemoteDomainName() + ",");
        if (getTrustPassword() != null)
            sb.append("TrustPassword: " + getTrustPassword() + ",");
        if (getTrustDirection() != null)
            sb.append("TrustDirection: " + getTrustDirection() + ",");
        if (getTrustType() != null)
            sb.append("TrustType: " + getTrustType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateTrustRequest == false)
            return false;
        CreateTrustRequest other = (CreateTrustRequest) obj;
        if (other.getDirectoryId() == null ^ this.getDirectoryId() == null)
            return false;
        if (other.getDirectoryId() != null
                && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getRemoteDomainName() == null
                ^ this.getRemoteDomainName() == null)
            return false;
        if (other.getRemoteDomainName() != null
                && other.getRemoteDomainName().equals(
                        this.getRemoteDomainName()) == false)
            return false;
        if (other.getTrustPassword() == null ^ this.getTrustPassword() == null)
            return false;
        if (other.getTrustPassword() != null
                && other.getTrustPassword().equals(this.getTrustPassword()) == false)
            return false;
        if (other.getTrustDirection() == null
                ^ this.getTrustDirection() == null)
            return false;
        if (other.getTrustDirection() != null
                && other.getTrustDirection().equals(this.getTrustDirection()) == false)
            return false;
        if (other.getTrustType() == null ^ this.getTrustType() == null)
            return false;
        if (other.getTrustType() != null
                && other.getTrustType().equals(this.getTrustType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime
                * hashCode
                + ((getRemoteDomainName() == null) ? 0 : getRemoteDomainName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTrustPassword() == null) ? 0 : getTrustPassword()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getTrustDirection() == null) ? 0 : getTrustDirection()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getTrustType() == null) ? 0 : getTrustType().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrustRequest clone() {
        return (CreateTrustRequest) super.clone();
    }
}