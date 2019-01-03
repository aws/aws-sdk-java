/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListHyperParameterTuningJobs"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHyperParameterTuningJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If the result of the previous <code>ListHyperParameterTuningJobs</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of tuning jobs, use the token in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of tuning jobs to return. The default value is 10.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * A string in the tuning job name. This filter returns only tuning jobs whose name contains the specified string.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * A filter that returns only tuning jobs that were created after the specified time.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * A filter that returns only tuning jobs that were created before the specified time.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * A filter that returns only tuning jobs that were modified after the specified time.
     * </p>
     */
    private java.util.Date lastModifiedTimeAfter;
    /**
     * <p>
     * A filter that returns only tuning jobs that were modified before the specified time.
     * </p>
     */
    private java.util.Date lastModifiedTimeBefore;
    /**
     * <p>
     * A filter that returns only tuning jobs with the specified status.
     * </p>
     */
    private String statusEquals;

    /**
     * <p>
     * If the result of the previous <code>ListHyperParameterTuningJobs</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of tuning jobs, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListHyperParameterTuningJobs</code> request was truncated, the
     *        response includes a <code>NextToken</code>. To retrieve the next set of tuning jobs, use the token in the
     *        next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListHyperParameterTuningJobs</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of tuning jobs, use the token in the next request.
     * </p>
     * 
     * @return If the result of the previous <code>ListHyperParameterTuningJobs</code> request was truncated, the
     *         response includes a <code>NextToken</code>. To retrieve the next set of tuning jobs, use the token in the
     *         next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListHyperParameterTuningJobs</code> request was truncated, the response
     * includes a <code>NextToken</code>. To retrieve the next set of tuning jobs, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListHyperParameterTuningJobs</code> request was truncated, the
     *        response includes a <code>NextToken</code>. To retrieve the next set of tuning jobs, use the token in the
     *        next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHyperParameterTuningJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of tuning jobs to return. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tuning jobs to return. The default value is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of tuning jobs to return. The default value is 10.
     * </p>
     * 
     * @return The maximum number of tuning jobs to return. The default value is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of tuning jobs to return. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of tuning jobs to return. The default value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHyperParameterTuningJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * 
     * @param sortBy
     *        The field to sort results by. The default is <code>Name</code>.
     * @see HyperParameterTuningJobSortByOptions
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * 
     * @return The field to sort results by. The default is <code>Name</code>.
     * @see HyperParameterTuningJobSortByOptions
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * 
     * @param sortBy
     *        The field to sort results by. The default is <code>Name</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobSortByOptions
     */

    public ListHyperParameterTuningJobsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * 
     * @param sortBy
     *        The field to sort results by. The default is <code>Name</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobSortByOptions
     */

    public ListHyperParameterTuningJobsRequest withSortBy(HyperParameterTuningJobSortByOptions sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for results. The default is <code>Ascending</code>.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @return The sort order for results. The default is <code>Ascending</code>.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for results. The default is <code>Ascending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListHyperParameterTuningJobsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order for results. The default is <code>Ascending</code>.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for results. The default is <code>Ascending</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListHyperParameterTuningJobsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * A string in the tuning job name. This filter returns only tuning jobs whose name contains the specified string.
     * </p>
     * 
     * @param nameContains
     *        A string in the tuning job name. This filter returns only tuning jobs whose name contains the specified
     *        string.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * A string in the tuning job name. This filter returns only tuning jobs whose name contains the specified string.
     * </p>
     * 
     * @return A string in the tuning job name. This filter returns only tuning jobs whose name contains the specified
     *         string.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * A string in the tuning job name. This filter returns only tuning jobs whose name contains the specified string.
     * </p>
     * 
     * @param nameContains
     *        A string in the tuning job name. This filter returns only tuning jobs whose name contains the specified
     *        string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHyperParameterTuningJobsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs that were created after the specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that returns only tuning jobs that were created after the specified time.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs that were created after the specified time.
     * </p>
     * 
     * @return A filter that returns only tuning jobs that were created after the specified time.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs that were created after the specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that returns only tuning jobs that were created after the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHyperParameterTuningJobsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs that were created before the specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that returns only tuning jobs that were created before the specified time.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs that were created before the specified time.
     * </p>
     * 
     * @return A filter that returns only tuning jobs that were created before the specified time.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs that were created before the specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that returns only tuning jobs that were created before the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHyperParameterTuningJobsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs that were modified after the specified time.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        A filter that returns only tuning jobs that were modified after the specified time.
     */

    public void setLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        this.lastModifiedTimeAfter = lastModifiedTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs that were modified after the specified time.
     * </p>
     * 
     * @return A filter that returns only tuning jobs that were modified after the specified time.
     */

    public java.util.Date getLastModifiedTimeAfter() {
        return this.lastModifiedTimeAfter;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs that were modified after the specified time.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        A filter that returns only tuning jobs that were modified after the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHyperParameterTuningJobsRequest withLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        setLastModifiedTimeAfter(lastModifiedTimeAfter);
        return this;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs that were modified before the specified time.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        A filter that returns only tuning jobs that were modified before the specified time.
     */

    public void setLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        this.lastModifiedTimeBefore = lastModifiedTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs that were modified before the specified time.
     * </p>
     * 
     * @return A filter that returns only tuning jobs that were modified before the specified time.
     */

    public java.util.Date getLastModifiedTimeBefore() {
        return this.lastModifiedTimeBefore;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs that were modified before the specified time.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        A filter that returns only tuning jobs that were modified before the specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHyperParameterTuningJobsRequest withLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        setLastModifiedTimeBefore(lastModifiedTimeBefore);
        return this;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs with the specified status.
     * </p>
     * 
     * @param statusEquals
     *        A filter that returns only tuning jobs with the specified status.
     * @see HyperParameterTuningJobStatus
     */

    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs with the specified status.
     * </p>
     * 
     * @return A filter that returns only tuning jobs with the specified status.
     * @see HyperParameterTuningJobStatus
     */

    public String getStatusEquals() {
        return this.statusEquals;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs with the specified status.
     * </p>
     * 
     * @param statusEquals
     *        A filter that returns only tuning jobs with the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobStatus
     */

    public ListHyperParameterTuningJobsRequest withStatusEquals(String statusEquals) {
        setStatusEquals(statusEquals);
        return this;
    }

    /**
     * <p>
     * A filter that returns only tuning jobs with the specified status.
     * </p>
     * 
     * @param statusEquals
     *        A filter that returns only tuning jobs with the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HyperParameterTuningJobStatus
     */

    public ListHyperParameterTuningJobsRequest withStatusEquals(HyperParameterTuningJobStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getLastModifiedTimeAfter() != null)
            sb.append("LastModifiedTimeAfter: ").append(getLastModifiedTimeAfter()).append(",");
        if (getLastModifiedTimeBefore() != null)
            sb.append("LastModifiedTimeBefore: ").append(getLastModifiedTimeBefore()).append(",");
        if (getStatusEquals() != null)
            sb.append("StatusEquals: ").append(getStatusEquals());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHyperParameterTuningJobsRequest == false)
            return false;
        ListHyperParameterTuningJobsRequest other = (ListHyperParameterTuningJobsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
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
        if (other.getStatusEquals() == null ^ this.getStatusEquals() == null)
            return false;
        if (other.getStatusEquals() != null && other.getStatusEquals().equals(this.getStatusEquals()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeAfter() == null) ? 0 : getLastModifiedTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeBefore() == null) ? 0 : getLastModifiedTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
        return hashCode;
    }

    @Override
    public ListHyperParameterTuningJobsRequest clone() {
        return (ListHyperParameterTuningJobsRequest) super.clone();
    }

}
