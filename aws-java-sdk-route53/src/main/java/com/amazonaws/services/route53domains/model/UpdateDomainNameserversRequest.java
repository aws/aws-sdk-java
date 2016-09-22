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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The UpdateDomainNameserver request includes the following elements.
 * </p>
 */
public class UpdateDomainNameserversRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The authorization key for .fi domains
     * </p>
     */
    private String fIAuthKey;
    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>Name</code>, <code>GlueIps</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Nameserver> nameservers;

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param domainName
     *        The name of a domain.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen
     *        (-). Internationalized Domain Names are not supported.
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return The name of a domain.</p>
     *         <p>
     *         Type: String
     *         </p>
     *         <p>
     *         Default: None
     *         </p>
     *         <p>
     *         Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and
     *         hyphen (-). Internationalized Domain Names are not supported.
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The name of a domain.
     * </p>
     * <p>
     * Type: String
     * </p>
     * <p>
     * Default: None
     * </p>
     * <p>
     * Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen (-).
     * Internationalized Domain Names are not supported.
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param domainName
     *        The name of a domain.</p>
     *        <p>
     *        Type: String
     *        </p>
     *        <p>
     *        Default: None
     *        </p>
     *        <p>
     *        Constraints: The domain name can contain only the letters a through z, the numbers 0 through 9, and hyphen
     *        (-). Internationalized Domain Names are not supported.
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainNameserversRequest withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The authorization key for .fi domains
     * </p>
     * 
     * @param fIAuthKey
     *        The authorization key for .fi domains
     */

    public void setFIAuthKey(String fIAuthKey) {
        this.fIAuthKey = fIAuthKey;
    }

    /**
     * <p>
     * The authorization key for .fi domains
     * </p>
     * 
     * @return The authorization key for .fi domains
     */

    public String getFIAuthKey() {
        return this.fIAuthKey;
    }

    /**
     * <p>
     * The authorization key for .fi domains
     * </p>
     * 
     * @param fIAuthKey
     *        The authorization key for .fi domains
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainNameserversRequest withFIAuthKey(String fIAuthKey) {
        setFIAuthKey(fIAuthKey);
        return this;
    }

    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>Name</code>, <code>GlueIps</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @return A list of new name servers for the domain.</p>
     *         <p>
     *         Type: Complex
     *         </p>
     *         <p>
     *         Children: <code>Name</code>, <code>GlueIps</code>
     *         </p>
     *         <p>
     *         Required: Yes
     */

    public java.util.List<Nameserver> getNameservers() {
        if (nameservers == null) {
            nameservers = new com.amazonaws.internal.SdkInternalList<Nameserver>();
        }
        return nameservers;
    }

    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>Name</code>, <code>GlueIps</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param nameservers
     *        A list of new name servers for the domain.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>Name</code>, <code>GlueIps</code>
     *        </p>
     *        <p>
     *        Required: Yes
     */

    public void setNameservers(java.util.Collection<Nameserver> nameservers) {
        if (nameservers == null) {
            this.nameservers = null;
            return;
        }

        this.nameservers = new com.amazonaws.internal.SdkInternalList<Nameserver>(nameservers);
    }

    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>Name</code>, <code>GlueIps</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNameservers(java.util.Collection)} or {@link #withNameservers(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param nameservers
     *        A list of new name servers for the domain.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>Name</code>, <code>GlueIps</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainNameserversRequest withNameservers(Nameserver... nameservers) {
        if (this.nameservers == null) {
            setNameservers(new com.amazonaws.internal.SdkInternalList<Nameserver>(nameservers.length));
        }
        for (Nameserver ele : nameservers) {
            this.nameservers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of new name servers for the domain.
     * </p>
     * <p>
     * Type: Complex
     * </p>
     * <p>
     * Children: <code>Name</code>, <code>GlueIps</code>
     * </p>
     * <p>
     * Required: Yes
     * </p>
     * 
     * @param nameservers
     *        A list of new name servers for the domain.</p>
     *        <p>
     *        Type: Complex
     *        </p>
     *        <p>
     *        Children: <code>Name</code>, <code>GlueIps</code>
     *        </p>
     *        <p>
     *        Required: Yes
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDomainNameserversRequest withNameservers(java.util.Collection<Nameserver> nameservers) {
        setNameservers(nameservers);
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
        if (getDomainName() != null)
            sb.append("DomainName: " + getDomainName() + ",");
        if (getFIAuthKey() != null)
            sb.append("FIAuthKey: " + getFIAuthKey() + ",");
        if (getNameservers() != null)
            sb.append("Nameservers: " + getNameservers());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDomainNameserversRequest == false)
            return false;
        UpdateDomainNameserversRequest other = (UpdateDomainNameserversRequest) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getFIAuthKey() == null ^ this.getFIAuthKey() == null)
            return false;
        if (other.getFIAuthKey() != null && other.getFIAuthKey().equals(this.getFIAuthKey()) == false)
            return false;
        if (other.getNameservers() == null ^ this.getNameservers() == null)
            return false;
        if (other.getNameservers() != null && other.getNameservers().equals(this.getNameservers()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getFIAuthKey() == null) ? 0 : getFIAuthKey().hashCode());
        hashCode = prime * hashCode + ((getNameservers() == null) ? 0 : getNameservers().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDomainNameserversRequest clone() {
        return (UpdateDomainNameserversRequest) super.clone();
    }
}
