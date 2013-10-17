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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#describeTags(DescribeTagsRequest) DescribeTags operation}.
 * <p>
 * Lists the Auto Scaling group tags.
 * </p>
 * <p>
 * You can use filters to limit results when describing tags. For example, you can query for tags of a particular Auto Scaling group. You can specify
 * multiple values for a filter. A tag must match at least one of the specified values for it to be included in the results.
 * </p>
 * <p>
 * You can also specify multiple filters. The result includes information for a particular tag only if it matches all your filters. If there's no match,
 * no special message is returned.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#describeTags(DescribeTagsRequest)
 */
public class DescribeTagsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The value of the filter type used to identify the tags to be returned.
     * For example, you can filter so that tags are returned according to
     * Auto Scaling group, the key and value, or whether the new tag will be
     * applied to instances launched after the tag is created
     * (PropagateAtLaunch).
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String nextToken;

    /**
     * The maximum number of records to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     */
    private Integer maxRecords;

    /**
     * The value of the filter type used to identify the tags to be returned.
     * For example, you can filter so that tags are returned according to
     * Auto Scaling group, the key and value, or whether the new tag will be
     * applied to instances launched after the tag is created
     * (PropagateAtLaunch).
     *
     * @return The value of the filter type used to identify the tags to be returned.
     *         For example, you can filter so that tags are returned according to
     *         Auto Scaling group, the key and value, or whether the new tag will be
     *         applied to instances launched after the tag is created
     *         (PropagateAtLaunch).
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * The value of the filter type used to identify the tags to be returned.
     * For example, you can filter so that tags are returned according to
     * Auto Scaling group, the key and value, or whether the new tag will be
     * applied to instances launched after the tag is created
     * (PropagateAtLaunch).
     *
     * @param filters The value of the filter type used to identify the tags to be returned.
     *         For example, you can filter so that tags are returned according to
     *         Auto Scaling group, the key and value, or whether the new tag will be
     *         applied to instances launched after the tag is created
     *         (PropagateAtLaunch).
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * The value of the filter type used to identify the tags to be returned.
     * For example, you can filter so that tags are returned according to
     * Auto Scaling group, the key and value, or whether the new tag will be
     * applied to instances launched after the tag is created
     * (PropagateAtLaunch).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The value of the filter type used to identify the tags to be returned.
     *         For example, you can filter so that tags are returned according to
     *         Auto Scaling group, the key and value, or whether the new tag will be
     *         applied to instances launched after the tag is created
     *         (PropagateAtLaunch).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTagsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * The value of the filter type used to identify the tags to be returned.
     * For example, you can filter so that tags are returned according to
     * Auto Scaling group, the key and value, or whether the new tag will be
     * applied to instances launched after the tag is created
     * (PropagateAtLaunch).
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The value of the filter type used to identify the tags to be returned.
     *         For example, you can filter so that tags are returned according to
     *         Auto Scaling group, the key and value, or whether the new tag will be
     *         applied to instances launched after the tag is created
     *         (PropagateAtLaunch).
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTagsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return A string that marks the start of the next batch of returned results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken A string that marks the start of the next batch of returned results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * A string that marks the start of the next batch of returned results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param nextToken A string that marks the start of the next batch of returned results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTagsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of records to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @return The maximum number of records to return.
     */
    public Integer getMaxRecords() {
        return maxRecords;
    }
    
    /**
     * The maximum number of records to return.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxRecords The maximum number of records to return.
     */
    public void setMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
    }
    
    /**
     * The maximum number of records to return.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>1 - 50<br/>
     *
     * @param maxRecords The maximum number of records to return.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeTagsRequest withMaxRecords(Integer maxRecords) {
        this.maxRecords = maxRecords;
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
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxRecords() != null) sb.append("MaxRecords: " + getMaxRecords() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxRecords() == null) ? 0 : getMaxRecords().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeTagsRequest == false) return false;
        DescribeTagsRequest other = (DescribeTagsRequest)obj;
        
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxRecords() == null ^ this.getMaxRecords() == null) return false;
        if (other.getMaxRecords() != null && other.getMaxRecords().equals(this.getMaxRecords()) == false) return false; 
        return true;
    }
    
}
    