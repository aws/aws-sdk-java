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
 * Container for the parameters to the {@link com.amazonaws.services.route53domains.AmazonRoute53Domains#enableDomainAutoRenew(EnableDomainAutoRenewRequest) EnableDomainAutoRenew operation}.
 * <p>
 * This operation configures Amazon Route 53 to automatically renew the
 * specified domain before the domain registration expires. The cost of
 * renewing your domain registration is billed to your AWS account.
 * </p>
 * <p>
 * The period during which you can renew a domain name varies by TLD. For
 * a list of TLDs and their renewal policies, see "Renewal, restoration,
 * and deletion times"
 * iki.gandi.net/en/domains/renew#renewal_restoration_and_deletion_times)
 * on the website for our registrar partner, Gandi. Route 53 requires
 * that you renew before the end of the renewal period that is listed on
 * the Gandi website so we can complete processing before the deadline.
 * </p>
 *
 * @see com.amazonaws.services.route53domains.AmazonRoute53Domains#enableDomainAutoRenew(EnableDomainAutoRenewRequest)
 */
public class EnableDomainAutoRenewRequest extends AmazonWebServiceRequest implements Serializable {

    private String domainName;

    /**
     * Returns the value of the DomainName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @return The value of the DomainName property for this object.
     */
    public String getDomainName() {
        return domainName;
    }
    
    /**
     * Sets the value of the DomainName property for this object.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The new value for the DomainName property for this object.
     */
    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }
    
    /**
     * Sets the value of the DomainName property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 255<br/>
     * <b>Pattern: </b>[a-zA-Z0-9_\-.]*<br/>
     *
     * @param domainName The new value for the DomainName property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public EnableDomainAutoRenewRequest withDomainName(String domainName) {
        this.domainName = domainName;
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
        if (getDomainName() != null) sb.append("DomainName: " + getDomainName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof EnableDomainAutoRenewRequest == false) return false;
        EnableDomainAutoRenewRequest other = (EnableDomainAutoRenewRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        return true;
    }
    
}
    