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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/ListEvaluationJobs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListEvaluationJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A filter that includes model evaluation jobs created after the time specified.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * A filter that includes model evaluation jobs created prior to the time specified.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * Only return jobs where the status condition is met.
     * </p>
     */
    private String statusEquals;
    /**
     * <p>
     * Query parameter string for model evaluation job names.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * Continuation token from the previous response, for Amazon Bedrock to list the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Allows you to sort model evaluation jobs by when they were created.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * How you want the order of jobs sorted.
     * </p>
     */
    private String sortOrder;

    /**
     * <p>
     * A filter that includes model evaluation jobs created after the time specified.
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that includes model evaluation jobs created after the time specified.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * A filter that includes model evaluation jobs created after the time specified.
     * </p>
     * 
     * @return A filter that includes model evaluation jobs created after the time specified.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * A filter that includes model evaluation jobs created after the time specified.
     * </p>
     * 
     * @param creationTimeAfter
     *        A filter that includes model evaluation jobs created after the time specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEvaluationJobsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * A filter that includes model evaluation jobs created prior to the time specified.
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that includes model evaluation jobs created prior to the time specified.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * A filter that includes model evaluation jobs created prior to the time specified.
     * </p>
     * 
     * @return A filter that includes model evaluation jobs created prior to the time specified.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * A filter that includes model evaluation jobs created prior to the time specified.
     * </p>
     * 
     * @param creationTimeBefore
     *        A filter that includes model evaluation jobs created prior to the time specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEvaluationJobsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * Only return jobs where the status condition is met.
     * </p>
     * 
     * @param statusEquals
     *        Only return jobs where the status condition is met.
     * @see EvaluationJobStatus
     */

    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * Only return jobs where the status condition is met.
     * </p>
     * 
     * @return Only return jobs where the status condition is met.
     * @see EvaluationJobStatus
     */

    public String getStatusEquals() {
        return this.statusEquals;
    }

    /**
     * <p>
     * Only return jobs where the status condition is met.
     * </p>
     * 
     * @param statusEquals
     *        Only return jobs where the status condition is met.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationJobStatus
     */

    public ListEvaluationJobsRequest withStatusEquals(String statusEquals) {
        setStatusEquals(statusEquals);
        return this;
    }

    /**
     * <p>
     * Only return jobs where the status condition is met.
     * </p>
     * 
     * @param statusEquals
     *        Only return jobs where the status condition is met.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EvaluationJobStatus
     */

    public ListEvaluationJobsRequest withStatusEquals(EvaluationJobStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
        return this;
    }

    /**
     * <p>
     * Query parameter string for model evaluation job names.
     * </p>
     * 
     * @param nameContains
     *        Query parameter string for model evaluation job names.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Query parameter string for model evaluation job names.
     * </p>
     * 
     * @return Query parameter string for model evaluation job names.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * Query parameter string for model evaluation job names.
     * </p>
     * 
     * @param nameContains
     *        Query parameter string for model evaluation job names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEvaluationJobsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @return The maximum number of results to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEvaluationJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * Continuation token from the previous response, for Amazon Bedrock to list the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Continuation token from the previous response, for Amazon Bedrock to list the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * Continuation token from the previous response, for Amazon Bedrock to list the next set of results.
     * </p>
     * 
     * @return Continuation token from the previous response, for Amazon Bedrock to list the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * Continuation token from the previous response, for Amazon Bedrock to list the next set of results.
     * </p>
     * 
     * @param nextToken
     *        Continuation token from the previous response, for Amazon Bedrock to list the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListEvaluationJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Allows you to sort model evaluation jobs by when they were created.
     * </p>
     * 
     * @param sortBy
     *        Allows you to sort model evaluation jobs by when they were created.
     * @see SortJobsBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Allows you to sort model evaluation jobs by when they were created.
     * </p>
     * 
     * @return Allows you to sort model evaluation jobs by when they were created.
     * @see SortJobsBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Allows you to sort model evaluation jobs by when they were created.
     * </p>
     * 
     * @param sortBy
     *        Allows you to sort model evaluation jobs by when they were created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortJobsBy
     */

    public ListEvaluationJobsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Allows you to sort model evaluation jobs by when they were created.
     * </p>
     * 
     * @param sortBy
     *        Allows you to sort model evaluation jobs by when they were created.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortJobsBy
     */

    public ListEvaluationJobsRequest withSortBy(SortJobsBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * How you want the order of jobs sorted.
     * </p>
     * 
     * @param sortOrder
     *        How you want the order of jobs sorted.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * How you want the order of jobs sorted.
     * </p>
     * 
     * @return How you want the order of jobs sorted.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * How you want the order of jobs sorted.
     * </p>
     * 
     * @param sortOrder
     *        How you want the order of jobs sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListEvaluationJobsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * How you want the order of jobs sorted.
     * </p>
     * 
     * @param sortOrder
     *        How you want the order of jobs sorted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListEvaluationJobsRequest withSortOrder(SortOrder sortOrder) {
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
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getStatusEquals() != null)
            sb.append("StatusEquals: ").append(getStatusEquals()).append(",");
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
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

        if (obj instanceof ListEvaluationJobsRequest == false)
            return false;
        ListEvaluationJobsRequest other = (ListEvaluationJobsRequest) obj;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getStatusEquals() == null ^ this.getStatusEquals() == null)
            return false;
        if (other.getStatusEquals() != null && other.getStatusEquals().equals(this.getStatusEquals()) == false)
            return false;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
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

        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListEvaluationJobsRequest clone() {
        return (ListEvaluationJobsRequest) super.clone();
    }

}
