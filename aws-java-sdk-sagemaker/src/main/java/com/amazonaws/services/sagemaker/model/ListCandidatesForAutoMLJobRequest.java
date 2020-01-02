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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListCandidatesForAutoMLJob"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListCandidatesForAutoMLJobRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List the Candidates created for the job by providing the job's name.
     * </p>
     */
    private String autoMLJobName;
    /**
     * <p>
     * List the Candidates for the job and filter by status.
     * </p>
     */
    private String statusEquals;
    /**
     * <p>
     * List the Candidates for the job and filter by candidate name.
     * </p>
     */
    private String candidateNameEquals;
    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The parameter by which to sort the results. The default is Descending.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * List the job's Candidates up to a specified limit.
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
     * List the Candidates created for the job by providing the job's name.
     * </p>
     * 
     * @param autoMLJobName
     *        List the Candidates created for the job by providing the job's name.
     */

    public void setAutoMLJobName(String autoMLJobName) {
        this.autoMLJobName = autoMLJobName;
    }

    /**
     * <p>
     * List the Candidates created for the job by providing the job's name.
     * </p>
     * 
     * @return List the Candidates created for the job by providing the job's name.
     */

    public String getAutoMLJobName() {
        return this.autoMLJobName;
    }

    /**
     * <p>
     * List the Candidates created for the job by providing the job's name.
     * </p>
     * 
     * @param autoMLJobName
     *        List the Candidates created for the job by providing the job's name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCandidatesForAutoMLJobRequest withAutoMLJobName(String autoMLJobName) {
        setAutoMLJobName(autoMLJobName);
        return this;
    }

    /**
     * <p>
     * List the Candidates for the job and filter by status.
     * </p>
     * 
     * @param statusEquals
     *        List the Candidates for the job and filter by status.
     * @see CandidateStatus
     */

    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * List the Candidates for the job and filter by status.
     * </p>
     * 
     * @return List the Candidates for the job and filter by status.
     * @see CandidateStatus
     */

    public String getStatusEquals() {
        return this.statusEquals;
    }

    /**
     * <p>
     * List the Candidates for the job and filter by status.
     * </p>
     * 
     * @param statusEquals
     *        List the Candidates for the job and filter by status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CandidateStatus
     */

    public ListCandidatesForAutoMLJobRequest withStatusEquals(String statusEquals) {
        setStatusEquals(statusEquals);
        return this;
    }

    /**
     * <p>
     * List the Candidates for the job and filter by status.
     * </p>
     * 
     * @param statusEquals
     *        List the Candidates for the job and filter by status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CandidateStatus
     */

    public ListCandidatesForAutoMLJobRequest withStatusEquals(CandidateStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
        return this;
    }

    /**
     * <p>
     * List the Candidates for the job and filter by candidate name.
     * </p>
     * 
     * @param candidateNameEquals
     *        List the Candidates for the job and filter by candidate name.
     */

    public void setCandidateNameEquals(String candidateNameEquals) {
        this.candidateNameEquals = candidateNameEquals;
    }

    /**
     * <p>
     * List the Candidates for the job and filter by candidate name.
     * </p>
     * 
     * @return List the Candidates for the job and filter by candidate name.
     */

    public String getCandidateNameEquals() {
        return this.candidateNameEquals;
    }

    /**
     * <p>
     * List the Candidates for the job and filter by candidate name.
     * </p>
     * 
     * @param candidateNameEquals
     *        List the Candidates for the job and filter by candidate name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCandidatesForAutoMLJobRequest withCandidateNameEquals(String candidateNameEquals) {
        setCandidateNameEquals(candidateNameEquals);
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is Ascending.
     * @see AutoMLSortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     * 
     * @return The sort order for the results. The default is Ascending.
     * @see AutoMLSortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is Ascending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLSortOrder
     */

    public ListCandidatesForAutoMLJobRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order for the results. The default is Ascending.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for the results. The default is Ascending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLSortOrder
     */

    public ListCandidatesForAutoMLJobRequest withSortOrder(AutoMLSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is Descending.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is Descending.
     * @see CandidateSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is Descending.
     * </p>
     * 
     * @return The parameter by which to sort the results. The default is Descending.
     * @see CandidateSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is Descending.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is Descending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CandidateSortBy
     */

    public ListCandidatesForAutoMLJobRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The parameter by which to sort the results. The default is Descending.
     * </p>
     * 
     * @param sortBy
     *        The parameter by which to sort the results. The default is Descending.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see CandidateSortBy
     */

    public ListCandidatesForAutoMLJobRequest withSortBy(CandidateSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * List the job's Candidates up to a specified limit.
     * </p>
     * 
     * @param maxResults
     *        List the job's Candidates up to a specified limit.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * List the job's Candidates up to a specified limit.
     * </p>
     * 
     * @return List the job's Candidates up to a specified limit.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * List the job's Candidates up to a specified limit.
     * </p>
     * 
     * @param maxResults
     *        List the job's Candidates up to a specified limit.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListCandidatesForAutoMLJobRequest withMaxResults(Integer maxResults) {
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

    public ListCandidatesForAutoMLJobRequest withNextToken(String nextToken) {
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
        if (getAutoMLJobName() != null)
            sb.append("AutoMLJobName: ").append(getAutoMLJobName()).append(",");
        if (getStatusEquals() != null)
            sb.append("StatusEquals: ").append(getStatusEquals()).append(",");
        if (getCandidateNameEquals() != null)
            sb.append("CandidateNameEquals: ").append(getCandidateNameEquals()).append(",");
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

        if (obj instanceof ListCandidatesForAutoMLJobRequest == false)
            return false;
        ListCandidatesForAutoMLJobRequest other = (ListCandidatesForAutoMLJobRequest) obj;
        if (other.getAutoMLJobName() == null ^ this.getAutoMLJobName() == null)
            return false;
        if (other.getAutoMLJobName() != null && other.getAutoMLJobName().equals(this.getAutoMLJobName()) == false)
            return false;
        if (other.getStatusEquals() == null ^ this.getStatusEquals() == null)
            return false;
        if (other.getStatusEquals() != null && other.getStatusEquals().equals(this.getStatusEquals()) == false)
            return false;
        if (other.getCandidateNameEquals() == null ^ this.getCandidateNameEquals() == null)
            return false;
        if (other.getCandidateNameEquals() != null && other.getCandidateNameEquals().equals(this.getCandidateNameEquals()) == false)
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

        hashCode = prime * hashCode + ((getAutoMLJobName() == null) ? 0 : getAutoMLJobName().hashCode());
        hashCode = prime * hashCode + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
        hashCode = prime * hashCode + ((getCandidateNameEquals() == null) ? 0 : getCandidateNameEquals().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListCandidatesForAutoMLJobRequest clone() {
        return (ListCandidatesForAutoMLJobRequest) super.clone();
    }

}
