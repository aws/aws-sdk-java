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
package com.amazonaws.services.logs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.logs.AWSLogs#describeSubscriptionFilters(DescribeSubscriptionFiltersRequest) DescribeSubscriptionFilters operation}.
 * <p>
 * Returns all the subscription filters associated with the specified
 * log group. The list returned in the response is ASCII-sorted by filter
 * name.
 * </p>
 * <p>
 * By default, this operation returns up to 50 subscription filters. If
 * there are more subscription filters to list, the response would
 * contain a <code>nextToken</code> value in the response body. You can
 * also limit the number of subscription filters returned in the response
 * by specifying the <code>limit</code> parameter in the request.
 * </p>
 *
 * @see com.amazonaws.services.logs.AWSLogs#describeSubscriptionFilters(DescribeSubscriptionFiltersRequest)
 */
public class DescribeSubscriptionFiltersRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The log group name for which subscription filters are to be listed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     */
    private String logGroupName;

    /**
     * Will only return subscription filters that match the provided
     * filterNamePrefix. If you don't specify a value, no prefix filter is
     * applied.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     */
    private String filterNamePrefix;

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     */
    private String nextToken;

    /**
     * The maximum number of results to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer limit;

    /**
     * The log group name for which subscription filters are to be listed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @return The log group name for which subscription filters are to be listed.
     */
    public String getLogGroupName() {
        return logGroupName;
    }
    
    /**
     * The log group name for which subscription filters are to be listed.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The log group name for which subscription filters are to be listed.
     */
    public void setLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
    }
    
    /**
     * The log group name for which subscription filters are to be listed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[\.\-_/#A-Za-z0-9]+<br/>
     *
     * @param logGroupName The log group name for which subscription filters are to be listed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSubscriptionFiltersRequest withLogGroupName(String logGroupName) {
        this.logGroupName = logGroupName;
        return this;
    }

    /**
     * Will only return subscription filters that match the provided
     * filterNamePrefix. If you don't specify a value, no prefix filter is
     * applied.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @return Will only return subscription filters that match the provided
     *         filterNamePrefix. If you don't specify a value, no prefix filter is
     *         applied.
     */
    public String getFilterNamePrefix() {
        return filterNamePrefix;
    }
    
    /**
     * Will only return subscription filters that match the provided
     * filterNamePrefix. If you don't specify a value, no prefix filter is
     * applied.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterNamePrefix Will only return subscription filters that match the provided
     *         filterNamePrefix. If you don't specify a value, no prefix filter is
     *         applied.
     */
    public void setFilterNamePrefix(String filterNamePrefix) {
        this.filterNamePrefix = filterNamePrefix;
    }
    
    /**
     * Will only return subscription filters that match the provided
     * filterNamePrefix. If you don't specify a value, no prefix filter is
     * applied.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 512<br/>
     * <b>Pattern: </b>[^:*]*<br/>
     *
     * @param filterNamePrefix Will only return subscription filters that match the provided
     *         filterNamePrefix. If you don't specify a value, no prefix filter is
     *         applied.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSubscriptionFiltersRequest withFilterNamePrefix(String filterNamePrefix) {
        this.filterNamePrefix = filterNamePrefix;
        return this;
    }

    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @return A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string token used for pagination that points to the next page of
     * results. It must be a value obtained from the response of the previous
     * request. The token expires after 24 hours.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - <br/>
     *
     * @param nextToken A string token used for pagination that points to the next page of
     *         results. It must be a value obtained from the response of the previous
     *         request. The token expires after 24 hours.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSubscriptionFiltersRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return The maximum number of results to return.
     */
    public Integer getLimit() {
        return limit;
    }
    
    /**
     * The maximum number of results to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param limit The maximum number of results to return.
     */
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
    
    /**
     * The maximum number of results to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param limit The maximum number of results to return.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeSubscriptionFiltersRequest withLimit(Integer limit) {
        this.limit = limit;
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
        if (getLogGroupName() != null) sb.append("LogGroupName: " + getLogGroupName() + ",");
        if (getFilterNamePrefix() != null) sb.append("FilterNamePrefix: " + getFilterNamePrefix() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getLimit() != null) sb.append("Limit: " + getLimit() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLogGroupName() == null) ? 0 : getLogGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getFilterNamePrefix() == null) ? 0 : getFilterNamePrefix().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getLimit() == null) ? 0 : getLimit().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSubscriptionFiltersRequest == false) return false;
        DescribeSubscriptionFiltersRequest other = (DescribeSubscriptionFiltersRequest)obj;
        
        if (other.getLogGroupName() == null ^ this.getLogGroupName() == null) return false;
        if (other.getLogGroupName() != null && other.getLogGroupName().equals(this.getLogGroupName()) == false) return false; 
        if (other.getFilterNamePrefix() == null ^ this.getFilterNamePrefix() == null) return false;
        if (other.getFilterNamePrefix() != null && other.getFilterNamePrefix().equals(this.getFilterNamePrefix()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getLimit() == null ^ this.getLimit() == null) return false;
        if (other.getLimit() != null && other.getLimit().equals(this.getLimit()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeSubscriptionFiltersRequest clone() {
        
            return (DescribeSubscriptionFiltersRequest) super.clone();
    }

}
    