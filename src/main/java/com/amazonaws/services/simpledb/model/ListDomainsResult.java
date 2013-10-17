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
package com.amazonaws.services.simpledb.model;

import java.io.Serializable;


/**
 * List Domains Result
 */
public class ListDomainsResult implements Serializable {

    /**
     * A list of domain names that match the expression.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> domainNames;

    /**
     * An opaque token indicating that there are more domains than the
     * specified <code>MaxNumberOfDomains</code> still available.
     */
    private String nextToken;

    /**
     * A list of domain names that match the expression.
     *
     * @return A list of domain names that match the expression.
     */
    public java.util.List<String> getDomainNames() {
        if (domainNames == null) {
              domainNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              domainNames.setAutoConstruct(true);
        }
        return domainNames;
    }
    
    /**
     * A list of domain names that match the expression.
     *
     * @param domainNames A list of domain names that match the expression.
     */
    public void setDomainNames(java.util.Collection<String> domainNames) {
        if (domainNames == null) {
            this.domainNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> domainNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(domainNames.size());
        domainNamesCopy.addAll(domainNames);
        this.domainNames = domainNamesCopy;
    }
    
    /**
     * A list of domain names that match the expression.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainNames A list of domain names that match the expression.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListDomainsResult withDomainNames(String... domainNames) {
        if (getDomainNames() == null) setDomainNames(new java.util.ArrayList<String>(domainNames.length));
        for (String value : domainNames) {
            getDomainNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of domain names that match the expression.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param domainNames A list of domain names that match the expression.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListDomainsResult withDomainNames(java.util.Collection<String> domainNames) {
        if (domainNames == null) {
            this.domainNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> domainNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(domainNames.size());
            domainNamesCopy.addAll(domainNames);
            this.domainNames = domainNamesCopy;
        }

        return this;
    }

    /**
     * An opaque token indicating that there are more domains than the
     * specified <code>MaxNumberOfDomains</code> still available.
     *
     * @return An opaque token indicating that there are more domains than the
     *         specified <code>MaxNumberOfDomains</code> still available.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * An opaque token indicating that there are more domains than the
     * specified <code>MaxNumberOfDomains</code> still available.
     *
     * @param nextToken An opaque token indicating that there are more domains than the
     *         specified <code>MaxNumberOfDomains</code> still available.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * An opaque token indicating that there are more domains than the
     * specified <code>MaxNumberOfDomains</code> still available.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken An opaque token indicating that there are more domains than the
     *         specified <code>MaxNumberOfDomains</code> still available.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListDomainsResult withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getDomainNames() != null) sb.append("DomainNames: " + getDomainNames() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomainNames() == null) ? 0 : getDomainNames().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDomainsResult == false) return false;
        ListDomainsResult other = (ListDomainsResult)obj;
        
        if (other.getDomainNames() == null ^ this.getDomainNames() == null) return false;
        if (other.getDomainNames() != null && other.getDomainNames().equals(this.getDomainNames()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    