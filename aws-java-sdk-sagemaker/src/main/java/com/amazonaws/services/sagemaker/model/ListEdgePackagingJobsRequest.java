/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListEdgePackagingJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEdgePackagingJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Maximum number of results to select.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Select jobs where the job was created after specified time.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * Select jobs where the job was created before specified time.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * Select jobs where the job was updated after specified time.
     * </p>
     */
    private java.util.Date lastModifiedTimeAfter;
    /**
     * <p>
     * Select jobs where the job was updated before specified time.
     * </p>
     */
    private java.util.Date lastModifiedTimeBefore;
    /**
     * <p>
     * Filter for jobs containing this name in their packaging job name.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * Filter for jobs where the model name contains this string.
     * </p>
     */
    private String modelNameContains;
    /**
     * <p>
     * The job status to filter for.
     * </p>
     */
    private String statusEquals;
    /**
     * <p>
     * Use to specify what column to sort by.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * What direction to sort by.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @param nextToken
     *        The response from the last list when returning a list large enough to need tokening.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @return The response from the last list when returning a list large enough to need tokening.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     * 
     * @param nextToken
     *        The response from the last list when returning a list large enough to need tokening.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgePackagingJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Maximum number of results to select.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to select.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * Maximum number of results to select.
     * </p>
     * 
     * @return Maximum number of results to select.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * Maximum number of results to select.
     * </p>
     * 
     * @param maxResults
     *        Maximum number of results to select.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgePackagingJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Select jobs where the job was created after specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Select jobs where the job was created after specified time.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Select jobs where the job was created after specified time.
     * </p>
     * 
     * @return Select jobs where the job was created after specified time.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Select jobs where the job was created after specified time.
     * </p>
     * 
     * @param creationTimeAfter
     *        Select jobs where the job was created after specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgePackagingJobsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * Select jobs where the job was created before specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Select jobs where the job was created before specified time.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Select jobs where the job was created before specified time.
     * </p>
     * 
     * @return Select jobs where the job was created before specified time.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Select jobs where the job was created before specified time.
     * </p>
     * 
     * @param creationTimeBefore
     *        Select jobs where the job was created before specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgePackagingJobsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * Select jobs where the job was updated after specified time.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        Select jobs where the job was updated after specified time.
     */

    public void setLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        this.lastModifiedTimeAfter = lastModifiedTimeAfter;
    }

    /**
     * <p>
     * Select jobs where the job was updated after specified time.
     * </p>
     * 
     * @return Select jobs where the job was updated after specified time.
     */

    public java.util.Date getLastModifiedTimeAfter() {
        return this.lastModifiedTimeAfter;
    }

    /**
     * <p>
     * Select jobs where the job was updated after specified time.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        Select jobs where the job was updated after specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgePackagingJobsRequest withLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        setLastModifiedTimeAfter(lastModifiedTimeAfter);
        return this;
    }

    /**
     * <p>
     * Select jobs where the job was updated before specified time.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        Select jobs where the job was updated before specified time.
     */

    public void setLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        this.lastModifiedTimeBefore = lastModifiedTimeBefore;
    }

    /**
     * <p>
     * Select jobs where the job was updated before specified time.
     * </p>
     * 
     * @return Select jobs where the job was updated before specified time.
     */

    public java.util.Date getLastModifiedTimeBefore() {
        return this.lastModifiedTimeBefore;
    }

    /**
     * <p>
     * Select jobs where the job was updated before specified time.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        Select jobs where the job was updated before specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgePackagingJobsRequest withLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        setLastModifiedTimeBefore(lastModifiedTimeBefore);
        return this;
    }

    /**
     * <p>
     * Filter for jobs containing this name in their packaging job name.
     * </p>
     * 
     * @param nameContains
     *        Filter for jobs containing this name in their packaging job name.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Filter for jobs containing this name in their packaging job name.
     * </p>
     * 
     * @return Filter for jobs containing this name in their packaging job name.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * Filter for jobs containing this name in their packaging job name.
     * </p>
     * 
     * @param nameContains
     *        Filter for jobs containing this name in their packaging job name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgePackagingJobsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * Filter for jobs where the model name contains this string.
     * </p>
     * 
     * @param modelNameContains
     *        Filter for jobs where the model name contains this string.
     */

    public void setModelNameContains(String modelNameContains) {
        this.modelNameContains = modelNameContains;
    }

    /**
     * <p>
     * Filter for jobs where the model name contains this string.
     * </p>
     * 
     * @return Filter for jobs where the model name contains this string.
     */

    public String getModelNameContains() {
        return this.modelNameContains;
    }

    /**
     * <p>
     * Filter for jobs where the model name contains this string.
     * </p>
     * 
     * @param modelNameContains
     *        Filter for jobs where the model name contains this string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEdgePackagingJobsRequest withModelNameContains(String modelNameContains) {
        setModelNameContains(modelNameContains);
        return this;
    }

    /**
     * <p>
     * The job status to filter for.
     * </p>
     * 
     * @param statusEquals
     *        The job status to filter for.
     * @see EdgePackagingJobStatus
     */

    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * The job status to filter for.
     * </p>
     * 
     * @return The job status to filter for.
     * @see EdgePackagingJobStatus
     */

    public String getStatusEquals() {
        return this.statusEquals;
    }

    /**
     * <p>
     * The job status to filter for.
     * </p>
     * 
     * @param statusEquals
     *        The job status to filter for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EdgePackagingJobStatus
     */

    public ListEdgePackagingJobsRequest withStatusEquals(String statusEquals) {
        setStatusEquals(statusEquals);
        return this;
    }

    /**
     * <p>
     * The job status to filter for.
     * </p>
     * 
     * @param statusEquals
     *        The job status to filter for.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EdgePackagingJobStatus
     */

    public ListEdgePackagingJobsRequest withStatusEquals(EdgePackagingJobStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
        return this;
    }

    /**
     * <p>
     * Use to specify what column to sort by.
     * </p>
     * 
     * @param sortBy
     *        Use to specify what column to sort by.
     * @see ListEdgePackagingJobsSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Use to specify what column to sort by.
     * </p>
     * 
     * @return Use to specify what column to sort by.
     * @see ListEdgePackagingJobsSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Use to specify what column to sort by.
     * </p>
     * 
     * @param sortBy
     *        Use to specify what column to sort by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListEdgePackagingJobsSortBy
     */

    public ListEdgePackagingJobsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Use to specify what column to sort by.
     * </p>
     * 
     * @param sortBy
     *        Use to specify what column to sort by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ListEdgePackagingJobsSortBy
     */

    public ListEdgePackagingJobsRequest withSortBy(ListEdgePackagingJobsSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * What direction to sort by.
     * </p>
     * 
     * @param sortOrder
     *        What direction to sort by.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * What direction to sort by.
     * </p>
     * 
     * @return What direction to sort by.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * What direction to sort by.
     * </p>
     * 
     * @param sortOrder
     *        What direction to sort by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListEdgePackagingJobsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * What direction to sort by.
     * </p>
     * 
     * @param sortOrder
     *        What direction to sort by.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListEdgePackagingJobsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
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
        if (getModelNameContains() != null)
            sb.append("ModelNameContains: ").append(getModelNameContains()).append(",");
        if (getStatusEquals() != null)
            sb.append("StatusEquals: ").append(getStatusEquals()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListEdgePackagingJobsRequest == false)
            return false;
        ListEdgePackagingJobsRequest other = (ListEdgePackagingJobsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getModelNameContains() == null ^ this.getModelNameContains() == null)
            return false;
        if (other.getModelNameContains() != null && other.getModelNameContains().equals(this.getModelNameContains()) == false)
            return false;
        if (other.getStatusEquals() == null ^ this.getStatusEquals() == null)
            return false;
        if (other.getStatusEquals() != null && other.getStatusEquals().equals(this.getStatusEquals()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeAfter() == null) ? 0 : getLastModifiedTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeBefore() == null) ? 0 : getLastModifiedTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getModelNameContains() == null) ? 0 : getModelNameContains().hashCode());
        hashCode = prime * hashCode + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListEdgePackagingJobsRequest clone() {
        return (ListEdgePackagingJobsRequest) super.clone();
    }

}
