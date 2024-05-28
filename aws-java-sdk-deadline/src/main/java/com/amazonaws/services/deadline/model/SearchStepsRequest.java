/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SearchSteps" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SearchStepsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The farm ID to use for the step search.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The filter expression, <code>AND</code> or <code>OR</code>, to use when searching among a group of search strings
     * in a resource.
     * <p>
     * You can use two groupings per search each within parenthesis <code>()</code>.
     * </p>
     * </p>
     */
    private SearchGroupedFilterExpressions filterExpressions;
    /**
     * <p>
     * Defines how far into the scrollable list to start the return of results.
     * </p>
     */
    private Integer itemOffset;
    /**
     * <p>
     * The job ID to use in the step search.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * Specifies the number of items per page for the resource.
     * </p>
     */
    private Integer pageSize;
    /**
     * <p>
     * The queue IDs in the step search.
     * </p>
     */
    private java.util.List<String> queueIds;
    /**
     * <p>
     * The search terms for a resource.
     * </p>
     */
    private java.util.List<SearchSortExpression> sortExpressions;

    /**
     * <p>
     * The farm ID to use for the step search.
     * </p>
     * 
     * @param farmId
     *        The farm ID to use for the step search.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID to use for the step search.
     * </p>
     * 
     * @return The farm ID to use for the step search.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID to use for the step search.
     * </p>
     * 
     * @param farmId
     *        The farm ID to use for the step search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchStepsRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The filter expression, <code>AND</code> or <code>OR</code>, to use when searching among a group of search strings
     * in a resource.
     * <p>
     * You can use two groupings per search each within parenthesis <code>()</code>.
     * </p>
     * </p>
     * 
     * @param filterExpressions
     *        The filter expression, <code>AND</code> or <code>OR</code>, to use when searching among a group of search
     *        strings in a resource.
     *        <p>
     *        You can use two groupings per search each within parenthesis <code>()</code>.
     *        </p>
     */

    public void setFilterExpressions(SearchGroupedFilterExpressions filterExpressions) {
        this.filterExpressions = filterExpressions;
    }

    /**
     * <p>
     * The filter expression, <code>AND</code> or <code>OR</code>, to use when searching among a group of search strings
     * in a resource.
     * <p>
     * You can use two groupings per search each within parenthesis <code>()</code>.
     * </p>
     * </p>
     * 
     * @return The filter expression, <code>AND</code> or <code>OR</code>, to use when searching among a group of search
     *         strings in a resource.
     *         <p>
     *         You can use two groupings per search each within parenthesis <code>()</code>.
     *         </p>
     */

    public SearchGroupedFilterExpressions getFilterExpressions() {
        return this.filterExpressions;
    }

    /**
     * <p>
     * The filter expression, <code>AND</code> or <code>OR</code>, to use when searching among a group of search strings
     * in a resource.
     * <p>
     * You can use two groupings per search each within parenthesis <code>()</code>.
     * </p>
     * </p>
     * 
     * @param filterExpressions
     *        The filter expression, <code>AND</code> or <code>OR</code>, to use when searching among a group of search
     *        strings in a resource.
     *        <p>
     *        You can use two groupings per search each within parenthesis <code>()</code>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchStepsRequest withFilterExpressions(SearchGroupedFilterExpressions filterExpressions) {
        setFilterExpressions(filterExpressions);
        return this;
    }

    /**
     * <p>
     * Defines how far into the scrollable list to start the return of results.
     * </p>
     * 
     * @param itemOffset
     *        Defines how far into the scrollable list to start the return of results.
     */

    public void setItemOffset(Integer itemOffset) {
        this.itemOffset = itemOffset;
    }

    /**
     * <p>
     * Defines how far into the scrollable list to start the return of results.
     * </p>
     * 
     * @return Defines how far into the scrollable list to start the return of results.
     */

    public Integer getItemOffset() {
        return this.itemOffset;
    }

    /**
     * <p>
     * Defines how far into the scrollable list to start the return of results.
     * </p>
     * 
     * @param itemOffset
     *        Defines how far into the scrollable list to start the return of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchStepsRequest withItemOffset(Integer itemOffset) {
        setItemOffset(itemOffset);
        return this;
    }

    /**
     * <p>
     * The job ID to use in the step search.
     * </p>
     * 
     * @param jobId
     *        The job ID to use in the step search.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID to use in the step search.
     * </p>
     * 
     * @return The job ID to use in the step search.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID to use in the step search.
     * </p>
     * 
     * @param jobId
     *        The job ID to use in the step search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchStepsRequest withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * Specifies the number of items per page for the resource.
     * </p>
     * 
     * @param pageSize
     *        Specifies the number of items per page for the resource.
     */

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * <p>
     * Specifies the number of items per page for the resource.
     * </p>
     * 
     * @return Specifies the number of items per page for the resource.
     */

    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * <p>
     * Specifies the number of items per page for the resource.
     * </p>
     * 
     * @param pageSize
     *        Specifies the number of items per page for the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchStepsRequest withPageSize(Integer pageSize) {
        setPageSize(pageSize);
        return this;
    }

    /**
     * <p>
     * The queue IDs in the step search.
     * </p>
     * 
     * @return The queue IDs in the step search.
     */

    public java.util.List<String> getQueueIds() {
        return queueIds;
    }

    /**
     * <p>
     * The queue IDs in the step search.
     * </p>
     * 
     * @param queueIds
     *        The queue IDs in the step search.
     */

    public void setQueueIds(java.util.Collection<String> queueIds) {
        if (queueIds == null) {
            this.queueIds = null;
            return;
        }

        this.queueIds = new java.util.ArrayList<String>(queueIds);
    }

    /**
     * <p>
     * The queue IDs in the step search.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setQueueIds(java.util.Collection)} or {@link #withQueueIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param queueIds
     *        The queue IDs in the step search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchStepsRequest withQueueIds(String... queueIds) {
        if (this.queueIds == null) {
            setQueueIds(new java.util.ArrayList<String>(queueIds.length));
        }
        for (String ele : queueIds) {
            this.queueIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The queue IDs in the step search.
     * </p>
     * 
     * @param queueIds
     *        The queue IDs in the step search.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchStepsRequest withQueueIds(java.util.Collection<String> queueIds) {
        setQueueIds(queueIds);
        return this;
    }

    /**
     * <p>
     * The search terms for a resource.
     * </p>
     * 
     * @return The search terms for a resource.
     */

    public java.util.List<SearchSortExpression> getSortExpressions() {
        return sortExpressions;
    }

    /**
     * <p>
     * The search terms for a resource.
     * </p>
     * 
     * @param sortExpressions
     *        The search terms for a resource.
     */

    public void setSortExpressions(java.util.Collection<SearchSortExpression> sortExpressions) {
        if (sortExpressions == null) {
            this.sortExpressions = null;
            return;
        }

        this.sortExpressions = new java.util.ArrayList<SearchSortExpression>(sortExpressions);
    }

    /**
     * <p>
     * The search terms for a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSortExpressions(java.util.Collection)} or {@link #withSortExpressions(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param sortExpressions
     *        The search terms for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchStepsRequest withSortExpressions(SearchSortExpression... sortExpressions) {
        if (this.sortExpressions == null) {
            setSortExpressions(new java.util.ArrayList<SearchSortExpression>(sortExpressions.length));
        }
        for (SearchSortExpression ele : sortExpressions) {
            this.sortExpressions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The search terms for a resource.
     * </p>
     * 
     * @param sortExpressions
     *        The search terms for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SearchStepsRequest withSortExpressions(java.util.Collection<SearchSortExpression> sortExpressions) {
        setSortExpressions(sortExpressions);
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getFilterExpressions() != null)
            sb.append("FilterExpressions: ").append(getFilterExpressions()).append(",");
        if (getItemOffset() != null)
            sb.append("ItemOffset: ").append(getItemOffset()).append(",");
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getPageSize() != null)
            sb.append("PageSize: ").append(getPageSize()).append(",");
        if (getQueueIds() != null)
            sb.append("QueueIds: ").append(getQueueIds()).append(",");
        if (getSortExpressions() != null)
            sb.append("SortExpressions: ").append(getSortExpressions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SearchStepsRequest == false)
            return false;
        SearchStepsRequest other = (SearchStepsRequest) obj;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getFilterExpressions() == null ^ this.getFilterExpressions() == null)
            return false;
        if (other.getFilterExpressions() != null && other.getFilterExpressions().equals(this.getFilterExpressions()) == false)
            return false;
        if (other.getItemOffset() == null ^ this.getItemOffset() == null)
            return false;
        if (other.getItemOffset() != null && other.getItemOffset().equals(this.getItemOffset()) == false)
            return false;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getPageSize() == null ^ this.getPageSize() == null)
            return false;
        if (other.getPageSize() != null && other.getPageSize().equals(this.getPageSize()) == false)
            return false;
        if (other.getQueueIds() == null ^ this.getQueueIds() == null)
            return false;
        if (other.getQueueIds() != null && other.getQueueIds().equals(this.getQueueIds()) == false)
            return false;
        if (other.getSortExpressions() == null ^ this.getSortExpressions() == null)
            return false;
        if (other.getSortExpressions() != null && other.getSortExpressions().equals(this.getSortExpressions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getFilterExpressions() == null) ? 0 : getFilterExpressions().hashCode());
        hashCode = prime * hashCode + ((getItemOffset() == null) ? 0 : getItemOffset().hashCode());
        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getPageSize() == null) ? 0 : getPageSize().hashCode());
        hashCode = prime * hashCode + ((getQueueIds() == null) ? 0 : getQueueIds().hashCode());
        hashCode = prime * hashCode + ((getSortExpressions() == null) ? 0 : getSortExpressions().hashCode());
        return hashCode;
    }

    @Override
    public SearchStepsRequest clone() {
        return (SearchStepsRequest) super.clone();
    }

}
