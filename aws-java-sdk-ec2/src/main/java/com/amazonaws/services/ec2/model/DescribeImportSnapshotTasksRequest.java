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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeImportSnapshotTasksRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeImportSnapshotTasks(DescribeImportSnapshotTasksRequest) DescribeImportSnapshotTasks operation}.
 * <p>
 * Displays details about an import snapshot tasks that is already
 * created.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeImportSnapshotTasks(DescribeImportSnapshotTasksRequest)
 */
public class DescribeImportSnapshotTasksRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeImportSnapshotTasksRequest> {

    /**
     * A list of IDs of the ImportSnapshot tasks to describe.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> importTaskIds;

    /**
     * The token to get to the next page of paginated describe requests.
     */
    private String nextToken;

    /**
     * The maximum number of results in a page.
     */
    private Integer maxResults;

    /**
     * The filters to be applied on a describe request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * A list of IDs of the ImportSnapshot tasks to describe.
     *
     * @return A list of IDs of the ImportSnapshot tasks to describe.
     */
    public java.util.List<String> getImportTaskIds() {
        if (importTaskIds == null) {
              importTaskIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              importTaskIds.setAutoConstruct(true);
        }
        return importTaskIds;
    }
    
    /**
     * A list of IDs of the ImportSnapshot tasks to describe.
     *
     * @param importTaskIds A list of IDs of the ImportSnapshot tasks to describe.
     */
    public void setImportTaskIds(java.util.Collection<String> importTaskIds) {
        if (importTaskIds == null) {
            this.importTaskIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> importTaskIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(importTaskIds.size());
        importTaskIdsCopy.addAll(importTaskIds);
        this.importTaskIds = importTaskIdsCopy;
    }
    
    /**
     * A list of IDs of the ImportSnapshot tasks to describe.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setImportTaskIds(java.util.Collection)} or {@link
     * #withImportTaskIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importTaskIds A list of IDs of the ImportSnapshot tasks to describe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportSnapshotTasksRequest withImportTaskIds(String... importTaskIds) {
        if (getImportTaskIds() == null) setImportTaskIds(new java.util.ArrayList<String>(importTaskIds.length));
        for (String value : importTaskIds) {
            getImportTaskIds().add(value);
        }
        return this;
    }
    
    /**
     * A list of IDs of the ImportSnapshot tasks to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param importTaskIds A list of IDs of the ImportSnapshot tasks to describe.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportSnapshotTasksRequest withImportTaskIds(java.util.Collection<String> importTaskIds) {
        if (importTaskIds == null) {
            this.importTaskIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> importTaskIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(importTaskIds.size());
            importTaskIdsCopy.addAll(importTaskIds);
            this.importTaskIds = importTaskIdsCopy;
        }

        return this;
    }

    /**
     * The token to get to the next page of paginated describe requests.
     *
     * @return The token to get to the next page of paginated describe requests.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to get to the next page of paginated describe requests.
     *
     * @param nextToken The token to get to the next page of paginated describe requests.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to get to the next page of paginated describe requests.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to get to the next page of paginated describe requests.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportSnapshotTasksRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * The maximum number of results in a page.
     *
     * @return The maximum number of results in a page.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results in a page.
     *
     * @param maxResults The maximum number of results in a page.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results in a page.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of results in a page.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportSnapshotTasksRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * The filters to be applied on a describe request.
     *
     * @return The filters to be applied on a describe request.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * The filters to be applied on a describe request.
     *
     * @param filters The filters to be applied on a describe request.
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
     * The filters to be applied on a describe request.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or {@link
     * #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The filters to be applied on a describe request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportSnapshotTasksRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * The filters to be applied on a describe request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters The filters to be applied on a describe request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeImportSnapshotTasksRequest withFilters(java.util.Collection<Filter> filters) {
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
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeImportSnapshotTasksRequest> getDryRunRequest() {
        Request<DescribeImportSnapshotTasksRequest> request = new DescribeImportSnapshotTasksRequestMarshaller().marshall(this);
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
        if (getImportTaskIds() != null) sb.append("ImportTaskIds: " + getImportTaskIds() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getImportTaskIds() == null) ? 0 : getImportTaskIds().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeImportSnapshotTasksRequest == false) return false;
        DescribeImportSnapshotTasksRequest other = (DescribeImportSnapshotTasksRequest)obj;
        
        if (other.getImportTaskIds() == null ^ this.getImportTaskIds() == null) return false;
        if (other.getImportTaskIds() != null && other.getImportTaskIds().equals(this.getImportTaskIds()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeImportSnapshotTasksRequest clone() {
        
            return (DescribeImportSnapshotTasksRequest) super.clone();
    }

}
    