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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.cognitosync.AmazonCognitoSync#listIdentityPoolUsage(ListIdentityPoolUsageRequest) ListIdentityPoolUsage operation}.
 * <p>
 * Gets a list of identity pools registered with Cognito.
 * </p>
 *
 * @see com.amazonaws.services.cognitosync.AmazonCognitoSync#listIdentityPoolUsage(ListIdentityPoolUsageRequest)
 */
public class ListIdentityPoolUsageRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * A pagination token for obtaining the next page of results.
     */
    private String nextToken;

    /**
     * The maximum number of results to be returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 19<br/>
     * <b>Pattern: </b>\d+<br/>
     */
    private Integer maxResults;

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
    public ListIdentityPoolUsageRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results to be returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 19<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @return The maximum number of results to be returned.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to be returned.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 19<br/>
     * <b>Pattern: </b>\d+<br/>
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
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 19<br/>
     * <b>Pattern: </b>\d+<br/>
     *
     * @param maxResults The maximum number of results to be returned.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListIdentityPoolUsageRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
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
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListIdentityPoolUsageRequest == false) return false;
        ListIdentityPoolUsageRequest other = (ListIdentityPoolUsageRequest)obj;
        
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        return true;
    }
    
}
    