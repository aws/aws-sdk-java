/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simpleemail.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleemail.AmazonSimpleEmailService#verifyDomainDkim(VerifyDomainDkimRequest) VerifyDomainDkim operation}.
 * <p>
 * Returns a set of DNS records, or <i>tokens</i> , that must be published in the domain name's DNS to complete the DKIM verification process. These
 * tokens are DNS <code>CNAME</code> records that point to DKIM public keys hosted by Amazon SES. To complete the DKIM verification process, these tokens
 * must be published in the domain's DNS. The tokens must remain published in order for Easy DKIM signing to function correctly.
 * </p>
 * <p>
 * After the tokens are added to the domain's DNS, Amazon SES will be able to DKIM-sign email originating from that domain. To enable or disable Easy
 * DKIM signing for a domain, use the <code>SetIdentityDkimEnabled</code> action.
 * </p>
 * <p>
 * For more information about Easy DKIM, go to the <a href="http://docs.amazonwebservices.com/ses/latest/DeveloperGuide"> Amazon SES Developer Guide </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.simpleemail.AmazonSimpleEmailService#verifyDomainDkim(VerifyDomainDkimRequest)
 */
public class VerifyDomainDkimRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the domain to be verified for Easy DKIM signing.
     */
    private String domain;

    /**
     * The name of the domain to be verified for Easy DKIM signing.
     *
     * @return The name of the domain to be verified for Easy DKIM signing.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The name of the domain to be verified for Easy DKIM signing.
     *
     * @param domain The name of the domain to be verified for Easy DKIM signing.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The name of the domain to be verified for Easy DKIM signing.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domain The name of the domain to be verified for Easy DKIM signing.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public VerifyDomainDkimRequest withDomain(String domain) {
        this.domain = domain;
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
        if (getDomain() != null) sb.append("Domain: " + getDomain() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof VerifyDomainDkimRequest == false) return false;
        VerifyDomainDkimRequest other = (VerifyDomainDkimRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        return true;
    }
    
}
    