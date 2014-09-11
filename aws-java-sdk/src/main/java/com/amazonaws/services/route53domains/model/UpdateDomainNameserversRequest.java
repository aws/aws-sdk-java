/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.route53domains.AmazonRoute53Domains#updateDomainNameservers(UpdateDomainNameserversRequest) UpdateDomainNameservers operation}.
 * <p>
 * This operation replaces the current set of name servers for the domain
 * with the specified set of name servers. If you use Amazon Route 53 as
 * your DNS service, specify the four name servers in the delegation set
 * for the hosted zone for the domain.
 * </p>
 * <p>
 * If successful, this operation returns an operation ID that you can use
 * to track the progress and completion of the action. If the request is
 * not completed successfully, the domain registrant will be notified by
 * email.
 * </p>
 *
 * @see com.amazonaws.services.route53domains.AmazonRoute53Domains#updateDomainNameservers(UpdateDomainNameserversRequest)
 */
public class UpdateDomainNameserversRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of a domain. <p>Type: String <p>Default: None <p>Constraints:
     * The domain name can contain only the letters a through z, the numbers
     * 0 through 9, and hyphen (-). Internationalized Domain Names are not
     * supported. <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     */
    private String domainName;

    /**
     * A list of new name servers for the domain. <p>Type: Complex
     * <p>Children: <code>Name</code>, <code>GlueIps</code> <p>Required: Yes
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Nameserver> nameservers;

    /**
     * The name of a domain. <p>Type: String <p>Default: None <p>Constraints:
     * The domain name can contain only the letters a through z, the numbers
     * 0 through 9, and hyphen (-). Internationalized Domain Names are not
     * supported. <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @return The name of a domain. <p>Type: String <p>Default: None <p>Constraints:
     *         The domain name can contain only the letters a through z, the numbers
     *         0 through 9, and hyphen (-). Internationalized Domain Names are not
     *         supported. <p>Required: Yes
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * The name of a domain. <p>Type: String <p>Default: None <p>Constraints:
     * The domain name can contain only the letters a through z, the numbers
     * 0 through 9, and hyphen (-). Internationalized Domain Names are not
     * supported. <p>Required: Yes
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The name of a domain. <p>Type: String <p>Default: None <p>Constraints:
     *         The domain name can contain only the letters a through z, the numbers
     *         0 through 9, and hyphen (-). Internationalized Domain Names are not
     *         supported. <p>Required: Yes
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * The name of a domain. <p>Type: String <p>Default: None <p>Constraints:
     * The domain name can contain only the letters a through z, the numbers
     * 0 through 9, and hyphen (-). Internationalized Domain Names are not
     * supported. <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The name of a domain. <p>Type: String <p>Default: None <p>Constraints:
     *         The domain name can contain only the letters a through z, the numbers
     *         0 through 9, and hyphen (-). Internationalized Domain Names are not
     *         supported. <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDomainNameserversRequest withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * A list of new name servers for the domain. <p>Type: Complex
     * <p>Children: <code>Name</code>, <code>GlueIps</code> <p>Required: Yes
     *
     * @return A list of new name servers for the domain. <p>Type: Complex
     *         <p>Children: <code>Name</code>, <code>GlueIps</code> <p>Required: Yes
     */
    public java.util.List<Nameserver> getNameservers() {
        if (nameservers == null) {
              nameservers = new com.amazonaws.internal.ListWithAutoConstructFlag<Nameserver>();
              nameservers.setAutoConstruct(true);
        }
        return nameservers;
    }
    
    /**
     * A list of new name servers for the domain. <p>Type: Complex
     * <p>Children: <code>Name</code>, <code>GlueIps</code> <p>Required: Yes
     *
     * @param nameservers A list of new name servers for the domain. <p>Type: Complex
     *         <p>Children: <code>Name</code>, <code>GlueIps</code> <p>Required: Yes
     */
    public void setNameservers(java.util.Collection<Nameserver> nameservers) {
        if (nameservers == null) {
            this.nameservers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Nameserver> nameserversCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Nameserver>(nameservers.size());
        nameserversCopy.addAll(nameservers);
        this.nameservers = nameserversCopy;
    }
    
    /**
     * A list of new name servers for the domain. <p>Type: Complex
     * <p>Children: <code>Name</code>, <code>GlueIps</code> <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nameservers A list of new name servers for the domain. <p>Type: Complex
     *         <p>Children: <code>Name</code>, <code>GlueIps</code> <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDomainNameserversRequest withNameservers(Nameserver... nameservers) {
        if (getNameservers() == null) setNameservers(new java.util.ArrayList<Nameserver>(nameservers.length));
        for (Nameserver value : nameservers) {
            getNameservers().add(value);
        }
        return this;
    }
    
    /**
     * A list of new name servers for the domain. <p>Type: Complex
     * <p>Children: <code>Name</code>, <code>GlueIps</code> <p>Required: Yes
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nameservers A list of new name servers for the domain. <p>Type: Complex
     *         <p>Children: <code>Name</code>, <code>GlueIps</code> <p>Required: Yes
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public UpdateDomainNameserversRequest withNameservers(java.util.Collection<Nameserver> nameservers) {
        if (nameservers == null) {
            this.nameservers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Nameserver> nameserversCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Nameserver>(nameservers.size());
            nameserversCopy.addAll(nameservers);
            this.nameservers = nameserversCopy;
        }

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
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() + ",");
        if (getNameservers() != null) sb.append("Nameservers: " + getNameservers() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        hashCode = prime * hashCode + ((getNameservers() == null) ? 0 : getNameservers().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof UpdateDomainNameserversRequest == false) return false;
        UpdateDomainNameserversRequest other = (UpdateDomainNameserversRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        if (other.getNameservers() == null ^ this.getNameservers() == null) return false;
        if (other.getNameservers() != null && other.getNameservers().equals(this.getNameservers()) == false) return false; 
        return true;
    }
    
}
    