/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListAutoMLJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListAutoMLJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     */
    private java.util.Date lastModifiedTimeAfter;
    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     */
    private java.util.Date lastModifiedTimeBefore;
    /**
     * <p>
     * Request a list of jobs, using a search filter for name.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * Request a list of jobs, using a filter for status.
     * </p>
     */
    private String statusEquals;
    /**
     * <p>
     * The sort order for the results. The default is Descending.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The parameter by which to sort the results. The default is AutoMLJobName.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * Request a list of jobs up to a specified limit.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Request a list of jobs, using a filter for time.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * 
     * @return Request a list of jobs, using a filter for time.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Request a list of jobs, using a filter for time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutoMLJobsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Request a list of jobs, using a filter for time.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * 
     * @return Request a list of jobs, using a filter for time.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Request a list of jobs, using a filter for time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutoMLJobsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        Request a list of jobs, using a filter for time.
     */

    public void setLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        this.lastModifiedTimeAfter = lastModifiedTimeAfter;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * 
     * @return Request a list of jobs, using a filter for time.
     */

    public java.util.Date getLastModifiedTimeAfter() {
        return this.lastModifiedTimeAfter;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        Request a list of jobs, using a filter for time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutoMLJobsRequest withLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        setLastModifiedTimeAfter(lastModifiedTimeAfter);
        return this;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        Request a list of jobs, using a filter for time.
     */

    public void setLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        this.lastModifiedTimeBefore = lastModifiedTimeBefore;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * 
     * @return Request a list of jobs, using a filter for time.
     */

    public java.util.Date getLastModifiedTimeBefore() {
        return this.lastModifiedTimeBefore;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for time.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        Request a list of jobs, using a filter for time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutoMLJobsRequest withLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        setLastModifiedTimeBefore(lastModifiedTimeBefore);
        return this;
    }

    /**
     * <p>
     * Request a list of jobs, using a search filter for name.
     * </p>
     * 
     * @param nameContains
     *        Request a list of jobs, using a search filter for name.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Request a list of jobs, using a search filter for name.
     * </p>
     * 
     * @return Request a list of jobs, using a search filter for name.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * Request a list of jobs, using a search filter for name.
     * </p>
     * 
     * @param nameContains
     *        Request a list of jobs, using a search filter for name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutoMLJobsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for status.
     * </p>
     * 
     * @param statusEquals
     *        Request a list of jobs, using a filter for status.
     * @see AutoMLJobStatus
     */

    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for status.
     * </p>
     * 
     * @return Request a list of jobs, using a filter for status.
     * @see AutoMLJobStatus
     */

    public String getStatusEquals() {
        return this.statusEquals;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for status.
     * </p>
     * 
     * @param statusEquals
     *        Request a list of jobs, using a filter for status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobStatus
     */

    public ListAutoMLJobsRequest withStatusEquals(String statusEquals) {
        setStatusEquals(statusEquals);
        return this;
    }

    /**
     * <p>
     * Request a list of jobs, using a filter for status.
     * </p>
     * 
     * @param statusEquals
     *        Request a list of jobs, using a filter for status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLJobStatus
     */

    public ListAutoMLJobsRequest withStatusEquals(AutoMLJobStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is Descending.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is Descending.
     * @see AutoMLSortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is Descending.
     * </p>
     * 
     * @return The sort order for the results. The default is Descending.
     * @see AutoMLSortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is Descending.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is Descending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLSortOrder
     */

    public ListAutoMLJobsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is Descending.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is Descending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLSortOrder
     */

    public ListAutoMLJobsRequest withSortOrder(AutoMLSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is AutoMLJobName.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is AutoMLJobName.
     * @see AutoMLSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is AutoMLJobName.
     * </p>
     * 
     * @return The parameter by which to sort the results. The default is AutoMLJobName.
     * @see AutoMLSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is AutoMLJobName.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is AutoMLJobName.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLSortBy
     */

    public ListAutoMLJobsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is AutoMLJobName.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is AutoMLJobName.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLSortBy
     */

    public ListAutoMLJobsRequest withSortBy(AutoMLSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Request a list of jobs up to a specified limit.
     * </p>
     * 
     * @param maxResults
     *        Request a list of jobs up to a specified limit.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Request a list of jobs up to a specified limit.
     * </p>
     * 
     * @return Request a list of jobs up to a specified limit.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Request a list of jobs up to a specified limit.
     * </p>
     * 
     * @param maxResults
     *        Request a list of jobs up to a specified limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutoMLJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you will receive this token. Use it in your next request to
     *        receive the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @return If the previous response was truncated, you will receive this token. Use it in your next request to
     *         receive the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the previous response was truncated, you will receive this token. Use it in your next request to receive the
     * next set of results.
     * </p>
     * 
     * @param nextToken
     *        If the previous response was truncated, you will receive this token. Use it in your next request to
     *        receive the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListAutoMLJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getLastModifiedTimeAfter() != null)
            sb.append("LastModifiedTimeAfter: ").append(getLastModifiedTimeAfter()).append(",");
        if (getLastModifiedTimeBefore() != null)
            sb.append("LastModifiedTimeBefore: ").append(getLastModifiedTimeBefore()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getStatusEquals() != null)
            sb.append("StatusEquals: ").append(getStatusEquals()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListAutoMLJobsRequest == false)
            return false;
        ListAutoMLJobsRequest other = (ListAutoMLJobsRequest) obj;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getLastModifiedTimeAfter() == null ^ this.getLastModifiedTimeAfter() == null)
            return false;
        if (other.getLastModifiedTimeAfter() != null && other.getLastModifiedTimeAfter().equals(this.getLastModifiedTimeAfter()) == false)
            return false;
        if (other.getLastModifiedTimeBefore() == null ^ this.getLastModifiedTimeBefore() == null)
            return false;
        if (other.getLastModifiedTimeBefore() != null && other.getLastModifiedTimeBefore().equals(this.getLastModifiedTimeBefore()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getStatusEquals() == null ^ this.getStatusEquals() == null)
            return false;
        if (other.getStatusEquals() != null && other.getStatusEquals().equals(this.getStatusEquals()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeAfter() == null) ? 0 : getLastModifiedTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeBefore() == null) ? 0 : getLastModifiedTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListAutoMLJobsRequest clone() {
        return (ListAutoMLJobsRequest) super.clone();
    }

}
