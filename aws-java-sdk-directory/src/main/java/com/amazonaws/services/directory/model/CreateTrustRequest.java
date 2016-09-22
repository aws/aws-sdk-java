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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * AWS Directory Service for Microsoft Active Directory allows you to configure trust relationships. For example, you
 * can establish a trust between your Microsoft AD in the AWS cloud, and your existing on-premises Microsoft Active
 * Directory. This would allow you to provide users and groups access to resources in either domain, with a single set
 * of credentials.
 * </p>
 * <p>
 * This action initiates the creation of the AWS side of a trust relationship between a Microsoft AD in the AWS cloud
 * and an external domain.
 * </p>
 */
public class CreateTrustRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Directory ID of the Microsoft AD in the AWS cloud for which to establish the trust relationship.
     * </p>
     */
    private String directoryId;
    /**
     * <p>
     * The Fully Qualified Domain Name (FQDN) of the external domain for which to create the trust relationship.
     * </p>
     */
    private String remoteDomainName;
    /**
     * <p>
     * The trust password. The must be the same password that was used when creating the trust relationship on the
     * external domain.
     * </p>
     */
    private String trustPassword;
    /**
     * <p>
     * The direction of the trust relationship.
     * </p>
     */
    private String trustDirection;
    /**
     * <p>
     * The trust relationship type.
     * </p>
     */
    private String trustType;
    /**
     * <p>
     * The IP addresses of the remote DNS server associated with RemoteDomainName.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> conditionalForwarderIpAddrs;

    /**
     * <p>
     * The Directory ID of the Microsoft AD in the AWS cloud for which to establish the trust relationship.
     * </p>
     * 
     * @param directoryId
     *        The Directory ID of the Microsoft AD in the AWS cloud for which to establish the trust relationship.
     */

    public void setDirectoryId(String directoryId) {
        this.directoryId = directoryId;
    }

    /**
     * <p>
     * The Directory ID of the Microsoft AD in the AWS cloud for which to establish the trust relationship.
     * </p>
     * 
     * @return The Directory ID of the Microsoft AD in the AWS cloud for which to establish the trust relationship.
     */

    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * <p>
     * The Directory ID of the Microsoft AD in the AWS cloud for which to establish the trust relationship.
     * </p>
     * 
     * @param directoryId
     *        The Directory ID of the Microsoft AD in the AWS cloud for which to establish the trust relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustRequest withDirectoryId(String directoryId) {
        setDirectoryId(directoryId);
        return this;
    }

    /**
     * <p>
     * The Fully Qualified Domain Name (FQDN) of the external domain for which to create the trust relationship.
     * </p>
     * 
     * @param remoteDomainName
     *        The Fully Qualified Domain Name (FQDN) of the external domain for which to create the trust relationship.
     */

    public void setRemoteDomainName(String remoteDomainName) {
        this.remoteDomainName = remoteDomainName;
    }

    /**
     * <p>
     * The Fully Qualified Domain Name (FQDN) of the external domain for which to create the trust relationship.
     * </p>
     * 
     * @return The Fully Qualified Domain Name (FQDN) of the external domain for which to create the trust relationship.
     */

    public String getRemoteDomainName() {
        return this.remoteDomainName;
    }

    /**
     * <p>
     * The Fully Qualified Domain Name (FQDN) of the external domain for which to create the trust relationship.
     * </p>
     * 
     * @param remoteDomainName
     *        The Fully Qualified Domain Name (FQDN) of the external domain for which to create the trust relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustRequest withRemoteDomainName(String remoteDomainName) {
        setRemoteDomainName(remoteDomainName);
        return this;
    }

    /**
     * <p>
     * The trust password. The must be the same password that was used when creating the trust relationship on the
     * external domain.
     * </p>
     * 
     * @param trustPassword
     *        The trust password. The must be the same password that was used when creating the trust relationship on
     *        the external domain.
     */

    public void setTrustPassword(String trustPassword) {
        this.trustPassword = trustPassword;
    }

    /**
     * <p>
     * The trust password. The must be the same password that was used when creating the trust relationship on the
     * external domain.
     * </p>
     * 
     * @return The trust password. The must be the same password that was used when creating the trust relationship on
     *         the external domain.
     */

    public String getTrustPassword() {
        return this.trustPassword;
    }

    /**
     * <p>
     * The trust password. The must be the same password that was used when creating the trust relationship on the
     * external domain.
     * </p>
     * 
     * @param trustPassword
     *        The trust password. The must be the same password that was used when creating the trust relationship on
     *        the external domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustRequest withTrustPassword(String trustPassword) {
        setTrustPassword(trustPassword);
        return this;
    }

    /**
     * <p>
     * The direction of the trust relationship.
     * </p>
     * 
     * @param trustDirection
     *        The direction of the trust relationship.
     * @see TrustDirection
     */

    public void setTrustDirection(String trustDirection) {
        this.trustDirection = trustDirection;
    }

    /**
     * <p>
     * The direction of the trust relationship.
     * </p>
     * 
     * @return The direction of the trust relationship.
     * @see TrustDirection
     */

    public String getTrustDirection() {
        return this.trustDirection;
    }

    /**
     * <p>
     * The direction of the trust relationship.
     * </p>
     * 
     * @param trustDirection
     *        The direction of the trust relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustDirection
     */

    public CreateTrustRequest withTrustDirection(String trustDirection) {
        setTrustDirection(trustDirection);
        return this;
    }

    /**
     * <p>
     * The direction of the trust relationship.
     * </p>
     * 
     * @param trustDirection
     *        The direction of the trust relationship.
     * @see TrustDirection
     */

    public void setTrustDirection(TrustDirection trustDirection) {
        this.trustDirection = trustDirection.toString();
    }

    /**
     * <p>
     * The direction of the trust relationship.
     * </p>
     * 
     * @param trustDirection
     *        The direction of the trust relationship.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustDirection
     */

    public CreateTrustRequest withTrustDirection(TrustDirection trustDirection) {
        setTrustDirection(trustDirection);
        return this;
    }

    /**
     * <p>
     * The trust relationship type.
     * </p>
     * 
     * @param trustType
     *        The trust relationship type.
     * @see TrustType
     */

    public void setTrustType(String trustType) {
        this.trustType = trustType;
    }

    /**
     * <p>
     * The trust relationship type.
     * </p>
     * 
     * @return The trust relationship type.
     * @see TrustType
     */

    public String getTrustType() {
        return this.trustType;
    }

    /**
     * <p>
     * The trust relationship type.
     * </p>
     * 
     * @param trustType
     *        The trust relationship type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustType
     */

    public CreateTrustRequest withTrustType(String trustType) {
        setTrustType(trustType);
        return this;
    }

    /**
     * <p>
     * The trust relationship type.
     * </p>
     * 
     * @param trustType
     *        The trust relationship type.
     * @see TrustType
     */

    public void setTrustType(TrustType trustType) {
        this.trustType = trustType.toString();
    }

    /**
     * <p>
     * The trust relationship type.
     * </p>
     * 
     * @param trustType
     *        The trust relationship type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrustType
     */

    public CreateTrustRequest withTrustType(TrustType trustType) {
        setTrustType(trustType);
        return this;
    }

    /**
     * <p>
     * The IP addresses of the remote DNS server associated with RemoteDomainName.
     * </p>
     * 
     * @return The IP addresses of the remote DNS server associated with RemoteDomainName.
     */

    public java.util.List<String> getConditionalForwarderIpAddrs() {
        if (conditionalForwarderIpAddrs == null) {
            conditionalForwarderIpAddrs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return conditionalForwarderIpAddrs;
    }

    /**
     * <p>
     * The IP addresses of the remote DNS server associated with RemoteDomainName.
     * </p>
     * 
     * @param conditionalForwarderIpAddrs
     *        The IP addresses of the remote DNS server associated with RemoteDomainName.
     */

    public void setConditionalForwarderIpAddrs(java.util.Collection<String> conditionalForwarderIpAddrs) {
        if (conditionalForwarderIpAddrs == null) {
            this.conditionalForwarderIpAddrs = null;
            return;
        }

        this.conditionalForwarderIpAddrs = new com.amazonaws.internal.SdkInternalList<String>(conditionalForwarderIpAddrs);
    }

    /**
     * <p>
     * The IP addresses of the remote DNS server associated with RemoteDomainName.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setConditionalForwarderIpAddrs(java.util.Collection)} or
     * {@link #withConditionalForwarderIpAddrs(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param conditionalForwarderIpAddrs
     *        The IP addresses of the remote DNS server associated with RemoteDomainName.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustRequest withConditionalForwarderIpAddrs(String... conditionalForwarderIpAddrs) {
        if (this.conditionalForwarderIpAddrs == null) {
            setConditionalForwarderIpAddrs(new com.amazonaws.internal.SdkInternalList<String>(conditionalForwarderIpAddrs.length));
        }
        for (String ele : conditionalForwarderIpAddrs) {
            this.conditionalForwarderIpAddrs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IP addresses of the remote DNS server associated with RemoteDomainName.
     * </p>
     * 
     * @param conditionalForwarderIpAddrs
     *        The IP addresses of the remote DNS server associated with RemoteDomainName.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTrustRequest withConditionalForwarderIpAddrs(java.util.Collection<String> conditionalForwarderIpAddrs) {
        setConditionalForwarderIpAddrs(conditionalForwarderIpAddrs);
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
        if (getDirectoryId() != null)
            sb.append("DirectoryId: " + getDirectoryId() + ",");
        if (getRemoteDomainName() != null)
            sb.append("RemoteDomainName: " + getRemoteDomainName() + ",");
        if (getTrustPassword() != null)
            sb.append("TrustPassword: " + getTrustPassword() + ",");
        if (getTrustDirection() != null)
            sb.append("TrustDirection: " + getTrustDirection() + ",");
        if (getTrustType() != null)
            sb.append("TrustType: " + getTrustType() + ",");
        if (getConditionalForwarderIpAddrs() != null)
            sb.append("ConditionalForwarderIpAddrs: " + getConditionalForwarderIpAddrs());
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
        if (other.getDirectoryId() != null && other.getDirectoryId().equals(this.getDirectoryId()) == false)
            return false;
        if (other.getRemoteDomainName() == null ^ this.getRemoteDomainName() == null)
            return false;
        if (other.getRemoteDomainName() != null && other.getRemoteDomainName().equals(this.getRemoteDomainName()) == false)
            return false;
        if (other.getTrustPassword() == null ^ this.getTrustPassword() == null)
            return false;
        if (other.getTrustPassword() != null && other.getTrustPassword().equals(this.getTrustPassword()) == false)
            return false;
        if (other.getTrustDirection() == null ^ this.getTrustDirection() == null)
            return false;
        if (other.getTrustDirection() != null && other.getTrustDirection().equals(this.getTrustDirection()) == false)
            return false;
        if (other.getTrustType() == null ^ this.getTrustType() == null)
            return false;
        if (other.getTrustType() != null && other.getTrustType().equals(this.getTrustType()) == false)
            return false;
        if (other.getConditionalForwarderIpAddrs() == null ^ this.getConditionalForwarderIpAddrs() == null)
            return false;
        if (other.getConditionalForwarderIpAddrs() != null && other.getConditionalForwarderIpAddrs().equals(this.getConditionalForwarderIpAddrs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDirectoryId() == null) ? 0 : getDirectoryId().hashCode());
        hashCode = prime * hashCode + ((getRemoteDomainName() == null) ? 0 : getRemoteDomainName().hashCode());
        hashCode = prime * hashCode + ((getTrustPassword() == null) ? 0 : getTrustPassword().hashCode());
        hashCode = prime * hashCode + ((getTrustDirection() == null) ? 0 : getTrustDirection().hashCode());
        hashCode = prime * hashCode + ((getTrustType() == null) ? 0 : getTrustType().hashCode());
        hashCode = prime * hashCode + ((getConditionalForwarderIpAddrs() == null) ? 0 : getConditionalForwarderIpAddrs().hashCode());
        return hashCode;
    }

    @Override
    public CreateTrustRequest clone() {
        return (CreateTrustRequest) super.clone();
    }
}
