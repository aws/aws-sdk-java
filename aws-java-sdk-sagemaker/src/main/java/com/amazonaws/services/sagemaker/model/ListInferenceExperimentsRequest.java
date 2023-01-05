/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListInferenceExperiments" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListInferenceExperimentsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Selects inference experiments whose names contain this name.
     * </p>
     */
    private String nameContains;
    /**
     * <p>
     * Selects inference experiments of this type. For the possible types of inference experiments, see
     * <a>CreateInferenceExperimentRequest$Type</a>.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Selects inference experiments which are in this status. For the possible statuses, see
     * <a>DescribeInferenceExperimentResponse$Status</a>.
     * </p>
     */
    private String statusEquals;
    /**
     * <p>
     * Selects inference experiments which were created after this timestamp.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * Selects inference experiments which were created before this timestamp.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * Selects inference experiments which were last modified after this timestamp.
     * </p>
     */
    private java.util.Date lastModifiedTimeAfter;
    /**
     * <p>
     * Selects inference experiments which were last modified before this timestamp.
     * </p>
     */
    private java.util.Date lastModifiedTimeBefore;
    /**
     * <p>
     * The column by which to sort the listed inference experiments.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The direction of sorting (ascending or descending).
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * The response from the last list when returning a list large enough to need tokening.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of results to select.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * Selects inference experiments whose names contain this name.
     * </p>
     * 
     * @param nameContains
     *        Selects inference experiments whose names contain this name.
     */

    public void setNameContains(String nameContains) {
        this.nameContains = nameContains;
    }

    /**
     * <p>
     * Selects inference experiments whose names contain this name.
     * </p>
     * 
     * @return Selects inference experiments whose names contain this name.
     */

    public String getNameContains() {
        return this.nameContains;
    }

    /**
     * <p>
     * Selects inference experiments whose names contain this name.
     * </p>
     * 
     * @param nameContains
     *        Selects inference experiments whose names contain this name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExperimentsRequest withNameContains(String nameContains) {
        setNameContains(nameContains);
        return this;
    }

    /**
     * <p>
     * Selects inference experiments of this type. For the possible types of inference experiments, see
     * <a>CreateInferenceExperimentRequest$Type</a>.
     * </p>
     * 
     * @param type
     *        Selects inference experiments of this type. For the possible types of inference experiments, see
     *        <a>CreateInferenceExperimentRequest$Type</a>.
     * @see InferenceExperimentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Selects inference experiments of this type. For the possible types of inference experiments, see
     * <a>CreateInferenceExperimentRequest$Type</a>.
     * </p>
     * 
     * @return Selects inference experiments of this type. For the possible types of inference experiments, see
     *         <a>CreateInferenceExperimentRequest$Type</a>.
     * @see InferenceExperimentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Selects inference experiments of this type. For the possible types of inference experiments, see
     * <a>CreateInferenceExperimentRequest$Type</a>.
     * </p>
     * 
     * @param type
     *        Selects inference experiments of this type. For the possible types of inference experiments, see
     *        <a>CreateInferenceExperimentRequest$Type</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentType
     */

    public ListInferenceExperimentsRequest withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Selects inference experiments of this type. For the possible types of inference experiments, see
     * <a>CreateInferenceExperimentRequest$Type</a>.
     * </p>
     * 
     * @param type
     *        Selects inference experiments of this type. For the possible types of inference experiments, see
     *        <a>CreateInferenceExperimentRequest$Type</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentType
     */

    public ListInferenceExperimentsRequest withType(InferenceExperimentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Selects inference experiments which are in this status. For the possible statuses, see
     * <a>DescribeInferenceExperimentResponse$Status</a>.
     * </p>
     * 
     * @param statusEquals
     *        Selects inference experiments which are in this status. For the possible statuses, see
     *        <a>DescribeInferenceExperimentResponse$Status</a>.
     * @see InferenceExperimentStatus
     */

    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * Selects inference experiments which are in this status. For the possible statuses, see
     * <a>DescribeInferenceExperimentResponse$Status</a>.
     * </p>
     * 
     * @return Selects inference experiments which are in this status. For the possible statuses, see
     *         <a>DescribeInferenceExperimentResponse$Status</a>.
     * @see InferenceExperimentStatus
     */

    public String getStatusEquals() {
        return this.statusEquals;
    }

    /**
     * <p>
     * Selects inference experiments which are in this status. For the possible statuses, see
     * <a>DescribeInferenceExperimentResponse$Status</a>.
     * </p>
     * 
     * @param statusEquals
     *        Selects inference experiments which are in this status. For the possible statuses, see
     *        <a>DescribeInferenceExperimentResponse$Status</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentStatus
     */

    public ListInferenceExperimentsRequest withStatusEquals(String statusEquals) {
        setStatusEquals(statusEquals);
        return this;
    }

    /**
     * <p>
     * Selects inference experiments which are in this status. For the possible statuses, see
     * <a>DescribeInferenceExperimentResponse$Status</a>.
     * </p>
     * 
     * @param statusEquals
     *        Selects inference experiments which are in this status. For the possible statuses, see
     *        <a>DescribeInferenceExperimentResponse$Status</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InferenceExperimentStatus
     */

    public ListInferenceExperimentsRequest withStatusEquals(InferenceExperimentStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
        return this;
    }

    /**
     * <p>
     * Selects inference experiments which were created after this timestamp.
     * </p>
     * 
     * @param creationTimeAfter
     *        Selects inference experiments which were created after this timestamp.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Selects inference experiments which were created after this timestamp.
     * </p>
     * 
     * @return Selects inference experiments which were created after this timestamp.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Selects inference experiments which were created after this timestamp.
     * </p>
     * 
     * @param creationTimeAfter
     *        Selects inference experiments which were created after this timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExperimentsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * Selects inference experiments which were created before this timestamp.
     * </p>
     * 
     * @param creationTimeBefore
     *        Selects inference experiments which were created before this timestamp.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Selects inference experiments which were created before this timestamp.
     * </p>
     * 
     * @return Selects inference experiments which were created before this timestamp.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Selects inference experiments which were created before this timestamp.
     * </p>
     * 
     * @param creationTimeBefore
     *        Selects inference experiments which were created before this timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExperimentsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * Selects inference experiments which were last modified after this timestamp.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        Selects inference experiments which were last modified after this timestamp.
     */

    public void setLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        this.lastModifiedTimeAfter = lastModifiedTimeAfter;
    }

    /**
     * <p>
     * Selects inference experiments which were last modified after this timestamp.
     * </p>
     * 
     * @return Selects inference experiments which were last modified after this timestamp.
     */

    public java.util.Date getLastModifiedTimeAfter() {
        return this.lastModifiedTimeAfter;
    }

    /**
     * <p>
     * Selects inference experiments which were last modified after this timestamp.
     * </p>
     * 
     * @param lastModifiedTimeAfter
     *        Selects inference experiments which were last modified after this timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExperimentsRequest withLastModifiedTimeAfter(java.util.Date lastModifiedTimeAfter) {
        setLastModifiedTimeAfter(lastModifiedTimeAfter);
        return this;
    }

    /**
     * <p>
     * Selects inference experiments which were last modified before this timestamp.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        Selects inference experiments which were last modified before this timestamp.
     */

    public void setLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        this.lastModifiedTimeBefore = lastModifiedTimeBefore;
    }

    /**
     * <p>
     * Selects inference experiments which were last modified before this timestamp.
     * </p>
     * 
     * @return Selects inference experiments which were last modified before this timestamp.
     */

    public java.util.Date getLastModifiedTimeBefore() {
        return this.lastModifiedTimeBefore;
    }

    /**
     * <p>
     * Selects inference experiments which were last modified before this timestamp.
     * </p>
     * 
     * @param lastModifiedTimeBefore
     *        Selects inference experiments which were last modified before this timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExperimentsRequest withLastModifiedTimeBefore(java.util.Date lastModifiedTimeBefore) {
        setLastModifiedTimeBefore(lastModifiedTimeBefore);
        return this;
    }

    /**
     * <p>
     * The column by which to sort the listed inference experiments.
     * </p>
     * 
     * @param sortBy
     *        The column by which to sort the listed inference experiments.
     * @see SortInferenceExperimentsBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The column by which to sort the listed inference experiments.
     * </p>
     * 
     * @return The column by which to sort the listed inference experiments.
     * @see SortInferenceExperimentsBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The column by which to sort the listed inference experiments.
     * </p>
     * 
     * @param sortBy
     *        The column by which to sort the listed inference experiments.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortInferenceExperimentsBy
     */

    public ListInferenceExperimentsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The column by which to sort the listed inference experiments.
     * </p>
     * 
     * @param sortBy
     *        The column by which to sort the listed inference experiments.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortInferenceExperimentsBy
     */

    public ListInferenceExperimentsRequest withSortBy(SortInferenceExperimentsBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The direction of sorting (ascending or descending).
     * </p>
     * 
     * @param sortOrder
     *        The direction of sorting (ascending or descending).
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The direction of sorting (ascending or descending).
     * </p>
     * 
     * @return The direction of sorting (ascending or descending).
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The direction of sorting (ascending or descending).
     * </p>
     * 
     * @param sortOrder
     *        The direction of sorting (ascending or descending).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListInferenceExperimentsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The direction of sorting (ascending or descending).
     * </p>
     * 
     * @param sortOrder
     *        The direction of sorting (ascending or descending).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListInferenceExperimentsRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

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

    public ListInferenceExperimentsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to select.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to select.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to select.
     * </p>
     * 
     * @return The maximum number of results to select.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to select.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to select.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListInferenceExperimentsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getNameContains() != null)
            sb.append("NameContains: ").append(getNameContains()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getStatusEquals() != null)
            sb.append("StatusEquals: ").append(getStatusEquals()).append(",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getLastModifiedTimeAfter() != null)
            sb.append("LastModifiedTimeAfter: ").append(getLastModifiedTimeAfter()).append(",");
        if (getLastModifiedTimeBefore() != null)
            sb.append("LastModifiedTimeBefore: ").append(getLastModifiedTimeBefore()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getSortOrder() != null)
            sb.append("SortOrder: ").append(getSortOrder()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListInferenceExperimentsRequest == false)
            return false;
        ListInferenceExperimentsRequest other = (ListInferenceExperimentsRequest) obj;
        if (other.getNameContains() == null ^ this.getNameContains() == null)
            return false;
        if (other.getNameContains() != null && other.getNameContains().equals(this.getNameContains()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getStatusEquals() == null ^ this.getStatusEquals() == null)
            return false;
        if (other.getStatusEquals() != null && other.getStatusEquals().equals(this.getStatusEquals()) == false)
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
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getSortOrder() == null ^ this.getSortOrder() == null)
            return false;
        if (other.getSortOrder() != null && other.getSortOrder().equals(this.getSortOrder()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNameContains() == null) ? 0 : getNameContains().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeAfter() == null) ? 0 : getLastModifiedTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getLastModifiedTimeBefore() == null) ? 0 : getLastModifiedTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListInferenceExperimentsRequest clone() {
        return (ListInferenceExperimentsRequest) super.clone();
    }

}
