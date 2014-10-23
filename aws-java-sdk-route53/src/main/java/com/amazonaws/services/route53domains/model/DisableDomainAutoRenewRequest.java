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
 * Container for the parameters to the {@link com.amazonaws.services.route53domains.AmazonRoute53Domains#disableDomainAutoRenew(DisableDomainAutoRenewRequest) DisableDomainAutoRenew operation}.
 * <p>
 * This operation disables automatic renewal of domain registration for
 * the specified domain.
 * </p>
 * <p>
 * <b>NOTE:</b>Caution! Amazon Route 53 doesn't have a manual renewal
 * process, so if you disable automatic renewal, registration for the
 * domain will not be renewed when the expiration date passes, and you
 * will lose control of the domain name.
 * </p>
 *
 * @see com.amazonaws.services.route53domains.AmazonRoute53Domains#disableDomainAutoRenew(DisableDomainAutoRenewRequest)
 */
public class DisableDomainAutoRenewRequest extends AmazonWebServiceRequest implements Serializable {

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
    public DisableDomainAutoRenewRequest withDomainName(String domainName) {
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

        if (obj instanceof DisableDomainAutoRenewRequest == false) return false;
        DisableDomainAutoRenewRequest other = (DisableDomainAutoRenewRequest)obj;
        
        if (other.getDomainName() == null ^ this.getDomainName() == null) return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false) return false; 
        return true;
    }
    
}
    