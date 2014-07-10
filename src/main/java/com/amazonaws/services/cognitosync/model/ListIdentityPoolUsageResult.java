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
package com.amazonaws.services.cognitosync.model;

import java.io.Serializable;

/**
 * <p>
 * Returned for a successful ListIdentityPoolUsage request.
 * </p>
 */
public class ListIdentityPoolUsageResult implements Serializable {

    /**
     * Usage information for the identity pools.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<IdentityPoolUsage> identityPoolUsages;

    /**
     * The maximum number of results to be returned.
     */
    private Integer maxResults;

    /**
     * Total number of identities for the identity pool.
     */
    private Integer count;

    /**
     * A pagination token for obtaining the next page of results.
     */
    private String nextToken;

    /**
     * Usage information for the identity pools.
     *
     * @return Usage information for the identity pools.
     */
    public java.util.List<IdentityPoolUsage> getIdentityPoolUsages() {
        if (identityPoolUsages == null) {
              identityPoolUsages = new com.amazonaws.internal.ListWithAutoConstructFlag<IdentityPoolUsage>();
              identityPoolUsages.setAutoConstruct(true);
        }
        return identityPoolUsages;
    }
    
    /**
     * Usage information for the identity pools.
     *
     * @param identityPoolUsages Usage information for the identity pools.
     */
    public void setIdentityPoolUsages(java.util.Collection<IdentityPoolUsage> identityPoolUsages) {
        if (identityPoolUsages == null) {
            this.identityPoolUsages = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<IdentityPoolUsage> identityPoolUsagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IdentityPoolUsage>(identityPoolUsages.size());
        identityPoolUsagesCopy.addAll(identityPoolUsages);
        this.identityPoolUsages = identityPoolUsagesCopy;
    }
    
    /**
     * Usage information for the identity pools.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identityPoolUsages Usage information for the identity pools.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentityPoolUsageResult withIdentityPoolUsages(IdentityPoolUsage... identityPoolUsages) {
        if (getIdentityPoolUsages() == null) setIdentityPoolUsages(new java.util.ArrayList<IdentityPoolUsage>(identityPoolUsages.length));
        for (IdentityPoolUsage value : identityPoolUsages) {
            getIdentityPoolUsages().add(value);
        }
        return this;
    }
    
    /**
     * Usage information for the identity pools.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param identityPoolUsages Usage information for the identity pools.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentityPoolUsageResult withIdentityPoolUsages(java.util.Collection<IdentityPoolUsage> identityPoolUsages) {
        if (identityPoolUsages == null) {
            this.identityPoolUsages = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<IdentityPoolUsage> identityPoolUsagesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<IdentityPoolUsage>(identityPoolUsages.size());
            identityPoolUsagesCopy.addAll(identityPoolUsages);
            this.identityPoolUsages = identityPoolUsagesCopy;
        }

        return this;
    }

    /**
     * The maximum number of results to be returned.
     *
     * @return The maximum number of results to be returned.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to be returned.
     *
     * @param maxResults The maximum number of results to be returned.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results to be returned.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of results to be returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentityPoolUsageResult withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * Total number of identities for the identity pool.
     *
     * @return Total number of identities for the identity pool.
     */
    public Integer getCount() {
        return count;
    }
    
    /**
     * Total number of identities for the identity pool.
     *
     * @param count Total number of identities for the identity pool.
     */
    public void setCount(Integer count) {
        this.count = count;
    }
    
    /**
     * Total number of identities for the identity pool.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param count Total number of identities for the identity pool.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentityPoolUsageResult withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * A pagination token for obtaining the next page of results.
     *
     * @return A pagination token for obtaining the next page of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A pagination token for obtaining the next page of results.
     *
     * @param nextToken A pagination token for obtaining the next page of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A pagination token for obtaining the next page of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken A pagination token for obtaining the next page of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentityPoolUsageResult withNextToken(String nextToken) {
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
        if (getIdentityPoolUsages() != null) sb.append("IdentityPoolUsages: " + getIdentityPoolUsages() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getCount() != null) sb.append("Count: " + getCount() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getIdentityPoolUsages() == null) ? 0 : getIdentityPoolUsages().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListIdentityPoolUsageResult == false) return false;
        ListIdentityPoolUsageResult other = (ListIdentityPoolUsageResult)obj;
        
        if (other.getIdentityPoolUsages() == null ^ this.getIdentityPoolUsages() == null) return false;
        if (other.getIdentityPoolUsages() != null && other.getIdentityPoolUsages().equals(this.getIdentityPoolUsages()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getCount() == null ^ this.getCount() == null) return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
}
    