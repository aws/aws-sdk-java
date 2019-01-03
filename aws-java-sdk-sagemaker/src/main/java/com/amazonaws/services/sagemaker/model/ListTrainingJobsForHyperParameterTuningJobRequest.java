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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListTrainingJobsForHyperParameterTuningJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrainingJobsForHyperParameterTuningJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the tuning job whose training jobs you want to list.
     * </p>
     */
    private String hyperParameterTuningJobName;
    /**
     * <p>
     * If the result of the previous <code>ListTrainingJobsForHyperParameterTuningJob</code> request was truncated, the
     * response includes a <code>NextToken</code>. To retrieve the next set of training jobs, use the token in the next
     * request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of training jobs to return. The default value is 10.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * A filter that returns only training jobs with the specified status.
     * </p>
     */
    private String statusEquals;
    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * If the value of this field is <code>FinalObjectiveMetricValue</code>, any training jobs that did not return an
     * objective metric are not listed.
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
     * The name of the tuning job whose training jobs you want to list.
     * </p>
     * 
     * @param hyperParameterTuningJobName
     *        The name of the tuning job whose training jobs you want to list.
     */

    public void setHyperParameterTuningJobName(String hyperParameterTuningJobName) {
        this.hyperParameterTuningJobName = hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the tuning job whose training jobs you want to list.
     * </p>
     * 
     * @return The name of the tuning job whose training jobs you want to list.
     */

    public String getHyperParameterTuningJobName() {
        return this.hyperParameterTuningJobName;
    }

    /**
     * <p>
     * The name of the tuning job whose training jobs you want to list.
     * </p>
     * 
     * @param hyperParameterTuningJobName
     *        The name of the tuning job whose training jobs you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrainingJobsForHyperParameterTuningJobRequest withHyperParameterTuningJobName(String hyperParameterTuningJobName) {
        setHyperParameterTuningJobName(hyperParameterTuningJobName);
        return this;
    }

    /**
     * <p>
     * If the result of the previous <code>ListTrainingJobsForHyperParameterTuningJob</code> request was truncated, the
     * response includes a <code>NextToken</code>. To retrieve the next set of training jobs, use the token in the next
     * request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListTrainingJobsForHyperParameterTuningJob</code> request was
     *        truncated, the response includes a <code>NextToken</code>. To retrieve the next set of training jobs, use
     *        the token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListTrainingJobsForHyperParameterTuningJob</code> request was truncated, the
     * response includes a <code>NextToken</code>. To retrieve the next set of training jobs, use the token in the next
     * request.
     * </p>
     * 
     * @return If the result of the previous <code>ListTrainingJobsForHyperParameterTuningJob</code> request was
     *         truncated, the response includes a <code>NextToken</code>. To retrieve the next set of training jobs, use
     *         the token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListTrainingJobsForHyperParameterTuningJob</code> request was truncated, the
     * response includes a <code>NextToken</code>. To retrieve the next set of training jobs, use the token in the next
     * request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListTrainingJobsForHyperParameterTuningJob</code> request was
     *        truncated, the response includes a <code>NextToken</code>. To retrieve the next set of training jobs, use
     *        the token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrainingJobsForHyperParameterTuningJobRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of training jobs to return. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of training jobs to return. The default value is 10.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of training jobs to return. The default value is 10.
     * </p>
     * 
     * @return The maximum number of training jobs to return. The default value is 10.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of training jobs to return. The default value is 10.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of training jobs to return. The default value is 10.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrainingJobsForHyperParameterTuningJobRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * A filter that returns only training jobs with the specified status.
     * </p>
     * 
     * @param statusEquals
     *        A filter that returns only training jobs with the specified status.
     * @see TrainingJobStatus
     */

    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * A filter that returns only training jobs with the specified status.
     * </p>
     * 
     * @return A filter that returns only training jobs with the specified status.
     * @see TrainingJobStatus
     */

    public String getStatusEquals() {
        return this.statusEquals;
    }

    /**
     * <p>
     * A filter that returns only training jobs with the specified status.
     * </p>
     * 
     * @param statusEquals
     *        A filter that returns only training jobs with the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingJobStatus
     */

    public ListTrainingJobsForHyperParameterTuningJobRequest withStatusEquals(String statusEquals) {
        setStatusEquals(statusEquals);
        return this;
    }

    /**
     * <p>
     * A filter that returns only training jobs with the specified status.
     * </p>
     * 
     * @param statusEquals
     *        A filter that returns only training jobs with the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingJobStatus
     */

    public ListTrainingJobsForHyperParameterTuningJobRequest withStatusEquals(TrainingJobStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
        return this;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * If the value of this field is <code>FinalObjectiveMetricValue</code>, any training jobs that did not return an
     * objective metric are not listed.
     * </p>
     * 
     * @param sortBy
     *        The field to sort results by. The default is <code>Name</code>.</p>
     *        <p>
     *        If the value of this field is <code>FinalObjectiveMetricValue</code>, any training jobs that did not
     *        return an objective metric are not listed.
     * @see TrainingJobSortByOptions
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * If the value of this field is <code>FinalObjectiveMetricValue</code>, any training jobs that did not return an
     * objective metric are not listed.
     * </p>
     * 
     * @return The field to sort results by. The default is <code>Name</code>.</p>
     *         <p>
     *         If the value of this field is <code>FinalObjectiveMetricValue</code>, any training jobs that did not
     *         return an objective metric are not listed.
     * @see TrainingJobSortByOptions
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * If the value of this field is <code>FinalObjectiveMetricValue</code>, any training jobs that did not return an
     * objective metric are not listed.
     * </p>
     * 
     * @param sortBy
     *        The field to sort results by. The default is <code>Name</code>.</p>
     *        <p>
     *        If the value of this field is <code>FinalObjectiveMetricValue</code>, any training jobs that did not
     *        return an objective metric are not listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingJobSortByOptions
     */

    public ListTrainingJobsForHyperParameterTuningJobRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The field to sort results by. The default is <code>Name</code>.
     * </p>
     * <p>
     * If the value of this field is <code>FinalObjectiveMetricValue</code>, any training jobs that did not return an
     * objective metric are not listed.
     * </p>
     * 
     * @param sortBy
     *        The field to sort results by. The default is <code>Name</code>.</p>
     *        <p>
     *        If the value of this field is <code>FinalObjectiveMetricValue</code>, any training jobs that did not
     *        return an objective metric are not listed.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingJobSortByOptions
     */

    public ListTrainingJobsForHyperParameterTuningJobRequest withSortBy(TrainingJobSortByOptions sortBy) {
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

    public ListTrainingJobsForHyperParameterTuningJobRequest withSortOrder(String sortOrder) {
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

    public ListTrainingJobsForHyperParameterTuningJobRequest withSortOrder(SortOrder sortOrder) {
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
        if (getHyperParameterTuningJobName() != null)
            sb.append("HyperParameterTuningJobName: ").append(getHyperParameterTuningJobName()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
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

        if (obj instanceof ListTrainingJobsForHyperParameterTuningJobRequest == false)
            return false;
        ListTrainingJobsForHyperParameterTuningJobRequest other = (ListTrainingJobsForHyperParameterTuningJobRequest) obj;
        if (other.getHyperParameterTuningJobName() == null ^ this.getHyperParameterTuningJobName() == null)
            return false;
        if (other.getHyperParameterTuningJobName() != null && other.getHyperParameterTuningJobName().equals(this.getHyperParameterTuningJobName()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
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

        hashCode = prime * hashCode + ((getHyperParameterTuningJobName() == null) ? 0 : getHyperParameterTuningJobName().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        return hashCode;
    }

    @Override
    public ListTrainingJobsForHyperParameterTuningJobRequest clone() {
        return (ListTrainingJobsForHyperParameterTuningJobRequest) super.clone();
    }

}
