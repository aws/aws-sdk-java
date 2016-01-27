/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribePrefixListsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describePrefixLists(DescribePrefixListsRequest) DescribePrefixLists operation}.
 * <p>
 * Describes available AWS services in a prefix list format, which
 * includes the prefix list name and prefix list ID of the service and
 * the IP address range for the service. A prefix list ID is required for
 * creating an outbound security group rule that allows traffic from a
 * VPC to access an AWS service through a VPC endpoint.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describePrefixLists(DescribePrefixListsRequest)
 */
public class DescribePrefixListsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribePrefixListsRequest> {

    /**
     * One or more prefix list IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> prefixListIds;

    /**
     * One or more filters. <ul> <li> <p><code>prefix-list-id</code>: The ID
     * of a prefix list. </li> <li> <p><code>prefix-list-name</code>: The
     * name of a prefix list. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value specified is greater
     * than 1000, we return only 1000 items.
     */
    private Integer maxResults;

    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     */
    private String nextToken;

    /**
     * One or more prefix list IDs.
     *
     * @return One or more prefix list IDs.
     */
    public java.util.List<String> getPrefixListIds() {
        if (prefixListIds == null) {
              prefixListIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              prefixListIds.setAutoConstruct(true);
        }
        return prefixListIds;
    }
    
    /**
     * One or more prefix list IDs.
     *
     * @param prefixListIds One or more prefix list IDs.
     */
    public void setPrefixListIds(java.util.Collection<String> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> prefixListIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(prefixListIds.size());
        prefixListIdsCopy.addAll(prefixListIds);
        this.prefixListIds = prefixListIdsCopy;
    }
    
    /**
     * One or more prefix list IDs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPrefixListIds(java.util.Collection)} or {@link
     * #withPrefixListIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefixListIds One or more prefix list IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePrefixListsRequest withPrefixListIds(String... prefixListIds) {
        if (getPrefixListIds() == null) setPrefixListIds(new java.util.ArrayList<String>(prefixListIds.length));
        for (String value : prefixListIds) {
            getPrefixListIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more prefix list IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param prefixListIds One or more prefix list IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePrefixListsRequest withPrefixListIds(java.util.Collection<String> prefixListIds) {
        if (prefixListIds == null) {
            this.prefixListIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> prefixListIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(prefixListIds.size());
            prefixListIdsCopy.addAll(prefixListIds);
            this.prefixListIds = prefixListIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>prefix-list-id</code>: The ID
     * of a prefix list. </li> <li> <p><code>prefix-list-name</code>: The
     * name of a prefix list. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>prefix-list-id</code>: The ID
     *         of a prefix list. </li> <li> <p><code>prefix-list-name</code>: The
     *         name of a prefix list. </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>prefix-list-id</code>: The ID
     * of a prefix list. </li> <li> <p><code>prefix-list-name</code>: The
     * name of a prefix list. </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>prefix-list-id</code>: The ID
     *         of a prefix list. </li> <li> <p><code>prefix-list-name</code>: The
     *         name of a prefix list. </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>prefix-list-id</code>: The ID
     * of a prefix list. </li> <li> <p><code>prefix-list-name</code>: The
     * name of a prefix list. </li> </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or {@link
     * #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>prefix-list-id</code>: The ID
     *         of a prefix list. </li> <li> <p><code>prefix-list-name</code>: The
     *         name of a prefix list. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePrefixListsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>prefix-list-id</code>: The ID
     * of a prefix list. </li> <li> <p><code>prefix-list-name</code>: The
     * name of a prefix list. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>prefix-list-id</code>: The ID
     *         of a prefix list. </li> <li> <p><code>prefix-list-name</code>: The
     *         name of a prefix list. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePrefixListsRequest withFilters(java.util.Collection<Filter> filters) {
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
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value specified is greater
     * than 1000, we return only 1000 items.
     *
     * @return The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results. <p>Constraint: If the value specified is greater
     *         than 1000, we return only 1000 items.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value specified is greater
     * than 1000, we return only 1000 items.
     *
     * @param maxResults The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results. <p>Constraint: If the value specified is greater
     *         than 1000, we return only 1000 items.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value specified is greater
     * than 1000, we return only 1000 items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results. <p>Constraint: If the value specified is greater
     *         than 1000, we return only 1000 items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePrefixListsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     *
     * @return The token for the next set of items to return. (You received this
     *         token from a prior call.)
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a prior call.)
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a prior call.)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribePrefixListsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribePrefixListsRequest> getDryRunRequest() {
        Request<DescribePrefixListsRequest> request = new DescribePrefixListsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getPrefixListIds() != null) sb.append("PrefixListIds: " + getPrefixListIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPrefixListIds() == null) ? 0 : getPrefixListIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribePrefixListsRequest == false) return false;
        DescribePrefixListsRequest other = (DescribePrefixListsRequest)obj;
        
        if (other.getPrefixListIds() == null ^ this.getPrefixListIds() == null) return false;
        if (other.getPrefixListIds() != null && other.getPrefixListIds().equals(this.getPrefixListIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribePrefixListsRequest clone() {
        
            return (DescribePrefixListsRequest) super.clone();
    }

}
    