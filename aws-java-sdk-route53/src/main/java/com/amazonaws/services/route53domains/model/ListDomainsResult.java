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

/**
 * <p>
 * The ListDomains response includes the following elements.
 * </p>
 */
public class ListDomainsResult implements Serializable {

    /**
     * A summary of domains. <p>Type: Complex type containing a list of
     * domain summaries. <p>Children: <code>AutoRenew</code>,
     * <code>DomainName</code>, <code>Expiry</code>,
     * <code>TransferLock</code>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DomainSummary> domains;

    /**
     * If there are more domains than you specified for <code>MaxItems</code>
     * in the request, submit another request and include the value of
     * <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * <p>Type: String <p>Parent: <code>Operations</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     */
    private String nextPageMarker;

    /**
     * A summary of domains. <p>Type: Complex type containing a list of
     * domain summaries. <p>Children: <code>AutoRenew</code>,
     * <code>DomainName</code>, <code>Expiry</code>,
     * <code>TransferLock</code>
     *
     * @return A summary of domains. <p>Type: Complex type containing a list of
     *         domain summaries. <p>Children: <code>AutoRenew</code>,
     *         <code>DomainName</code>, <code>Expiry</code>,
     *         <code>TransferLock</code>
     */
    public java.util.List<DomainSummary> getDomains() {
        if (domains == null) {
              domains = new com.amazonaws.internal.ListWithAutoConstructFlag<DomainSummary>();
              domains.setAutoConstruct(true);
        }
        return domains;
    }
    
    /**
     * A summary of domains. <p>Type: Complex type containing a list of
     * domain summaries. <p>Children: <code>AutoRenew</code>,
     * <code>DomainName</code>, <code>Expiry</code>,
     * <code>TransferLock</code>
     *
     * @param domains A summary of domains. <p>Type: Complex type containing a list of
     *         domain summaries. <p>Children: <code>AutoRenew</code>,
     *         <code>DomainName</code>, <code>Expiry</code>,
     *         <code>TransferLock</code>
     */
    public void setDomains(java.util.Collection<DomainSummary> domains) {
        if (domains == null) {
            this.domains = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DomainSummary> domainsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DomainSummary>(domains.size());
        domainsCopy.addAll(domains);
        this.domains = domainsCopy;
    }
    
    /**
     * A summary of domains. <p>Type: Complex type containing a list of
     * domain summaries. <p>Children: <code>AutoRenew</code>,
     * <code>DomainName</code>, <code>Expiry</code>,
     * <code>TransferLock</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domains A summary of domains. <p>Type: Complex type containing a list of
     *         domain summaries. <p>Children: <code>AutoRenew</code>,
     *         <code>DomainName</code>, <code>Expiry</code>,
     *         <code>TransferLock</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDomainsResult withDomains(DomainSummary... domains) {
        if (getDomains() == null) setDomains(new java.util.ArrayList<DomainSummary>(domains.length));
        for (DomainSummary value : domains) {
            getDomains().add(value);
        }
        return this;
    }
    
    /**
     * A summary of domains. <p>Type: Complex type containing a list of
     * domain summaries. <p>Children: <code>AutoRenew</code>,
     * <code>DomainName</code>, <code>Expiry</code>,
     * <code>TransferLock</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domains A summary of domains. <p>Type: Complex type containing a list of
     *         domain summaries. <p>Children: <code>AutoRenew</code>,
     *         <code>DomainName</code>, <code>Expiry</code>,
     *         <code>TransferLock</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDomainsResult withDomains(java.util.Collection<DomainSummary> domains) {
        if (domains == null) {
            this.domains = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DomainSummary> domainsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DomainSummary>(domains.size());
            domainsCopy.addAll(domains);
            this.domains = domainsCopy;
        }

        return this;
    }

    /**
     * If there are more domains than you specified for <code>MaxItems</code>
     * in the request, submit another request and include the value of
     * <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * <p>Type: String <p>Parent: <code>Operations</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @return If there are more domains than you specified for <code>MaxItems</code>
     *         in the request, submit another request and include the value of
     *         <code>NextPageMarker</code> in the value of <code>Marker</code>.
     *         <p>Type: String <p>Parent: <code>Operations</code>
     */
    public String getNextPageMarker() {
        return nextPageMarker;
    }
    
    /**
     * If there are more domains than you specified for <code>MaxItems</code>
     * in the request, submit another request and include the value of
     * <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * <p>Type: String <p>Parent: <code>Operations</code>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param nextPageMarker If there are more domains than you specified for <code>MaxItems</code>
     *         in the request, submit another request and include the value of
     *         <code>NextPageMarker</code> in the value of <code>Marker</code>.
     *         <p>Type: String <p>Parent: <code>Operations</code>
     */
    public void setNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
    }
    
    /**
     * If there are more domains than you specified for <code>MaxItems</code>
     * in the request, submit another request and include the value of
     * <code>NextPageMarker</code> in the value of <code>Marker</code>.
     * <p>Type: String <p>Parent: <code>Operations</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param nextPageMarker If there are more domains than you specified for <code>MaxItems</code>
     *         in the request, submit another request and include the value of
     *         <code>NextPageMarker</code> in the value of <code>Marker</code>.
     *         <p>Type: String <p>Parent: <code>Operations</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDomainsResult withNextPageMarker(String nextPageMarker) {
        this.nextPageMarker = nextPageMarker;
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
        if (getDomains() != null) sb.append("Domains: " + getDomains() + ",");
        if (getNextPageMarker() != null) sb.append("NextPageMarker: " + getNextPageMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomains() == null) ? 0 : getDomains().hashCode()); 
        hashCode = prime * hashCode + ((getNextPageMarker() == null) ? 0 : getNextPageMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDomainsResult == false) return false;
        ListDomainsResult other = (ListDomainsResult)obj;
        
        if (other.getDomains() == null ^ this.getDomains() == null) return false;
        if (other.getDomains() != null && other.getDomains().equals(this.getDomains()) == false) return false; 
        if (other.getNextPageMarker() == null ^ this.getNextPageMarker() == null) return false;
        if (other.getNextPageMarker() != null && other.getNextPageMarker().equals(this.getNextPageMarker()) == false) return false; 
        return true;
    }
    
}
    