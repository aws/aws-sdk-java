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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpledb.AmazonSimpleDB#listDomains(ListDomainsRequest) ListDomains operation}.
 * <p>
 * The <code>ListDomains</code> operation lists all domains associated with the Access Key ID. It returns domain names up to the limit set by
 * MaxNumberOfDomains. A NextToken is returned if there are more than <code>MaxNumberOfDomains</code> domains. Calling <code>ListDomains</code>
 * successive times with the <code>NextToken</code> provided by the operation returns up to <code>MaxNumberOfDomains</code> more domain names with each
 * successive operation call.
 * </p>
 *
 * @see com.amazonaws.services.simpledb.AmazonSimpleDB#listDomains(ListDomainsRequest)
 */
public class ListDomainsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The maximum number of domain names you want returned. The range is 1
     * to 100. The default setting is 100.
     */
    private Integer maxNumberOfDomains;

    /**
     * A string informing Amazon SimpleDB where to start the next list of
     * domain names.
     */
    private String nextToken;

    /**
     * Default constructor for a new ListDomainsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListDomainsRequest() {}
    
    /**
     * The maximum number of domain names you want returned. The range is 1
     * to 100. The default setting is 100.
     *
     * @return The maximum number of domain names you want returned. The range is 1
     *         to 100. The default setting is 100.
     */
    public Integer getMaxNumberOfDomains() {
        return maxNumberOfDomains;
    }
    
    /**
     * The maximum number of domain names you want returned. The range is 1
     * to 100. The default setting is 100.
     *
     * @param maxNumberOfDomains The maximum number of domain names you want returned. The range is 1
     *         to 100. The default setting is 100.
     */
    public void setMaxNumberOfDomains(Integer maxNumberOfDomains) {
        this.maxNumberOfDomains = maxNumberOfDomains;
    }
    
    /**
     * The maximum number of domain names you want returned. The range is 1
     * to 100. The default setting is 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxNumberOfDomains The maximum number of domain names you want returned. The range is 1
     *         to 100. The default setting is 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListDomainsRequest withMaxNumberOfDomains(Integer maxNumberOfDomains) {
        this.maxNumberOfDomains = maxNumberOfDomains;
        return this;
    }

    /**
     * A string informing Amazon SimpleDB where to start the next list of
     * domain names.
     *
     * @return A string informing Amazon SimpleDB where to start the next list of
     *         domain names.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string informing Amazon SimpleDB where to start the next list of
     * domain names.
     *
     * @param nextToken A string informing Amazon SimpleDB where to start the next list of
     *         domain names.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string informing Amazon SimpleDB where to start the next list of
     * domain names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A string informing Amazon SimpleDB where to start the next list of
     *         domain names.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListDomainsRequest withNextToken(String nextToken) {
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
        if (getMaxNumberOfDomains() != null) sb.append("MaxNumberOfDomains: " + getMaxNumberOfDomains() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMaxNumberOfDomains() == null) ? 0 : getMaxNumberOfDomains().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListDomainsRequest == false) return false;
        ListDomainsRequest other = (ListDomainsRequest)obj;
        
        if (other.getMaxNumberOfDomains() == null ^ this.getMaxNumberOfDomains() == null) return false;
        if (other.getMaxNumberOfDomains() != null && other.getMaxNumberOfDomains().equals(this.getMaxNumberOfDomains()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    