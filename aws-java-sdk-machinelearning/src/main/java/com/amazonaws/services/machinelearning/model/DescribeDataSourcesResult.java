/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.machinelearning.model;

import java.io.Serializable;

/**
 * <p>
 * Represents the query results from a DescribeDataSources operation. The
 * content is essentially a list of <code>DataSource</code> .
 * </p>
 */
public class DescribeDataSourcesResult implements Serializable, Cloneable {

    /**
     * A list of <code>DataSource</code> that meet the search criteria.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<DataSource> results;

    /**
     * An ID of the next page in the paginated results that indicates at
     * least one more page follows.
     */
    private String nextToken;

    /**
     * A list of <code>DataSource</code> that meet the search criteria.
     *
     * @return A list of <code>DataSource</code> that meet the search criteria.
     */
    public java.util.List<DataSource> getResults() {
        if (results == null) {
              results = new com.amazonaws.internal.ListWithAutoConstructFlag<DataSource>();
              results.setAutoConstruct(true);
        }
        return results;
    }
    
    /**
     * A list of <code>DataSource</code> that meet the search criteria.
     *
     * @param results A list of <code>DataSource</code> that meet the search criteria.
     */
    public void setResults(java.util.Collection<DataSource> results) {
        if (results == null) {
            this.results = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<DataSource> resultsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DataSource>(results.size());
        resultsCopy.addAll(results);
        this.results = resultsCopy;
    }
    
    /**
     * A list of <code>DataSource</code> that meet the search criteria.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param results A list of <code>DataSource</code> that meet the search criteria.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDataSourcesResult withResults(DataSource... results) {
        if (getResults() == null) setResults(new java.util.ArrayList<DataSource>(results.length));
        for (DataSource value : results) {
            getResults().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>DataSource</code> that meet the search criteria.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param results A list of <code>DataSource</code> that meet the search criteria.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDataSourcesResult withResults(java.util.Collection<DataSource> results) {
        if (results == null) {
            this.results = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<DataSource> resultsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<DataSource>(results.size());
            resultsCopy.addAll(results);
            this.results = resultsCopy;
        }

        return this;
    }

    /**
     * An ID of the next page in the paginated results that indicates at
     * least one more page follows.
     *
     * @return An ID of the next page in the paginated results that indicates at
     *         least one more page follows.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * An ID of the next page in the paginated results that indicates at
     * least one more page follows.
     *
     * @param nextToken An ID of the next page in the paginated results that indicates at
     *         least one more page follows.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * An ID of the next page in the paginated results that indicates at
     * least one more page follows.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken An ID of the next page in the paginated results that indicates at
     *         least one more page follows.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeDataSourcesResult withNextToken(String nextToken) {
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
        if (getResults() != null) sb.append("Results: " + getResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResults() == null) ? 0 : getResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeDataSourcesResult == false) return false;
        DescribeDataSourcesResult other = (DescribeDataSourcesResult)obj;
        
        if (other.getResults() == null ^ this.getResults() == null) return false;
        if (other.getResults() != null && other.getResults().equals(this.getResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeDataSourcesResult clone() {
        try {
            return (DescribeDataSourcesResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    