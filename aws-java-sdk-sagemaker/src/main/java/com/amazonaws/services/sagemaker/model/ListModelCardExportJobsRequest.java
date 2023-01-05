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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListModelCardExportJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListModelCardExportJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * List export jobs for the model card with the specified name.
     * </p>
     */
    private String modelCardName;
    /**
     * <p>
     * List export jobs for the model card with the specified version.
     * </p>
     */
    private Integer modelCardVersion;
    /**
     * <p>
     * Only list model card export jobs that were created after the time specified.
     * </p>
     */
    private java.util.Date creationTimeAfter;
    /**
     * <p>
     * Only list model card export jobs that were created before the time specified.
     * </p>
     */
    private java.util.Date creationTimeBefore;
    /**
     * <p>
     * Only list model card export jobs with names that contain the specified string.
     * </p>
     */
    private String modelCardExportJobNameContains;
    /**
     * <p>
     * Only list model card export jobs with the specified status.
     * </p>
     */
    private String statusEquals;
    /**
     * <p>
     * Sort model card export jobs by either name or creation time. Sorts by creation time by default.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * Sort model card export jobs by ascending or descending order.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * If the response to a previous <code>ListModelCardExportJobs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model card export jobs, use the token in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of model card export jobs to list.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * List export jobs for the model card with the specified name.
     * </p>
     * 
     * @param modelCardName
     *        List export jobs for the model card with the specified name.
     */

    public void setModelCardName(String modelCardName) {
        this.modelCardName = modelCardName;
    }

    /**
     * <p>
     * List export jobs for the model card with the specified name.
     * </p>
     * 
     * @return List export jobs for the model card with the specified name.
     */

    public String getModelCardName() {
        return this.modelCardName;
    }

    /**
     * <p>
     * List export jobs for the model card with the specified name.
     * </p>
     * 
     * @param modelCardName
     *        List export jobs for the model card with the specified name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardExportJobsRequest withModelCardName(String modelCardName) {
        setModelCardName(modelCardName);
        return this;
    }

    /**
     * <p>
     * List export jobs for the model card with the specified version.
     * </p>
     * 
     * @param modelCardVersion
     *        List export jobs for the model card with the specified version.
     */

    public void setModelCardVersion(Integer modelCardVersion) {
        this.modelCardVersion = modelCardVersion;
    }

    /**
     * <p>
     * List export jobs for the model card with the specified version.
     * </p>
     * 
     * @return List export jobs for the model card with the specified version.
     */

    public Integer getModelCardVersion() {
        return this.modelCardVersion;
    }

    /**
     * <p>
     * List export jobs for the model card with the specified version.
     * </p>
     * 
     * @param modelCardVersion
     *        List export jobs for the model card with the specified version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardExportJobsRequest withModelCardVersion(Integer modelCardVersion) {
        setModelCardVersion(modelCardVersion);
        return this;
    }

    /**
     * <p>
     * Only list model card export jobs that were created after the time specified.
     * </p>
     * 
     * @param creationTimeAfter
     *        Only list model card export jobs that were created after the time specified.
     */

    public void setCreationTimeAfter(java.util.Date creationTimeAfter) {
        this.creationTimeAfter = creationTimeAfter;
    }

    /**
     * <p>
     * Only list model card export jobs that were created after the time specified.
     * </p>
     * 
     * @return Only list model card export jobs that were created after the time specified.
     */

    public java.util.Date getCreationTimeAfter() {
        return this.creationTimeAfter;
    }

    /**
     * <p>
     * Only list model card export jobs that were created after the time specified.
     * </p>
     * 
     * @param creationTimeAfter
     *        Only list model card export jobs that were created after the time specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardExportJobsRequest withCreationTimeAfter(java.util.Date creationTimeAfter) {
        setCreationTimeAfter(creationTimeAfter);
        return this;
    }

    /**
     * <p>
     * Only list model card export jobs that were created before the time specified.
     * </p>
     * 
     * @param creationTimeBefore
     *        Only list model card export jobs that were created before the time specified.
     */

    public void setCreationTimeBefore(java.util.Date creationTimeBefore) {
        this.creationTimeBefore = creationTimeBefore;
    }

    /**
     * <p>
     * Only list model card export jobs that were created before the time specified.
     * </p>
     * 
     * @return Only list model card export jobs that were created before the time specified.
     */

    public java.util.Date getCreationTimeBefore() {
        return this.creationTimeBefore;
    }

    /**
     * <p>
     * Only list model card export jobs that were created before the time specified.
     * </p>
     * 
     * @param creationTimeBefore
     *        Only list model card export jobs that were created before the time specified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardExportJobsRequest withCreationTimeBefore(java.util.Date creationTimeBefore) {
        setCreationTimeBefore(creationTimeBefore);
        return this;
    }

    /**
     * <p>
     * Only list model card export jobs with names that contain the specified string.
     * </p>
     * 
     * @param modelCardExportJobNameContains
     *        Only list model card export jobs with names that contain the specified string.
     */

    public void setModelCardExportJobNameContains(String modelCardExportJobNameContains) {
        this.modelCardExportJobNameContains = modelCardExportJobNameContains;
    }

    /**
     * <p>
     * Only list model card export jobs with names that contain the specified string.
     * </p>
     * 
     * @return Only list model card export jobs with names that contain the specified string.
     */

    public String getModelCardExportJobNameContains() {
        return this.modelCardExportJobNameContains;
    }

    /**
     * <p>
     * Only list model card export jobs with names that contain the specified string.
     * </p>
     * 
     * @param modelCardExportJobNameContains
     *        Only list model card export jobs with names that contain the specified string.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardExportJobsRequest withModelCardExportJobNameContains(String modelCardExportJobNameContains) {
        setModelCardExportJobNameContains(modelCardExportJobNameContains);
        return this;
    }

    /**
     * <p>
     * Only list model card export jobs with the specified status.
     * </p>
     * 
     * @param statusEquals
     *        Only list model card export jobs with the specified status.
     * @see ModelCardExportJobStatus
     */

    public void setStatusEquals(String statusEquals) {
        this.statusEquals = statusEquals;
    }

    /**
     * <p>
     * Only list model card export jobs with the specified status.
     * </p>
     * 
     * @return Only list model card export jobs with the specified status.
     * @see ModelCardExportJobStatus
     */

    public String getStatusEquals() {
        return this.statusEquals;
    }

    /**
     * <p>
     * Only list model card export jobs with the specified status.
     * </p>
     * 
     * @param statusEquals
     *        Only list model card export jobs with the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardExportJobStatus
     */

    public ListModelCardExportJobsRequest withStatusEquals(String statusEquals) {
        setStatusEquals(statusEquals);
        return this;
    }

    /**
     * <p>
     * Only list model card export jobs with the specified status.
     * </p>
     * 
     * @param statusEquals
     *        Only list model card export jobs with the specified status.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardExportJobStatus
     */

    public ListModelCardExportJobsRequest withStatusEquals(ModelCardExportJobStatus statusEquals) {
        this.statusEquals = statusEquals.toString();
        return this;
    }

    /**
     * <p>
     * Sort model card export jobs by either name or creation time. Sorts by creation time by default.
     * </p>
     * 
     * @param sortBy
     *        Sort model card export jobs by either name or creation time. Sorts by creation time by default.
     * @see ModelCardExportJobSortBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Sort model card export jobs by either name or creation time. Sorts by creation time by default.
     * </p>
     * 
     * @return Sort model card export jobs by either name or creation time. Sorts by creation time by default.
     * @see ModelCardExportJobSortBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Sort model card export jobs by either name or creation time. Sorts by creation time by default.
     * </p>
     * 
     * @param sortBy
     *        Sort model card export jobs by either name or creation time. Sorts by creation time by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardExportJobSortBy
     */

    public ListModelCardExportJobsRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * Sort model card export jobs by either name or creation time. Sorts by creation time by default.
     * </p>
     * 
     * @param sortBy
     *        Sort model card export jobs by either name or creation time. Sorts by creation time by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardExportJobSortBy
     */

    public ListModelCardExportJobsRequest withSortBy(ModelCardExportJobSortBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * Sort model card export jobs by ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort model card export jobs by ascending or descending order.
     * @see ModelCardExportJobSortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * Sort model card export jobs by ascending or descending order.
     * </p>
     * 
     * @return Sort model card export jobs by ascending or descending order.
     * @see ModelCardExportJobSortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * Sort model card export jobs by ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort model card export jobs by ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardExportJobSortOrder
     */

    public ListModelCardExportJobsRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * Sort model card export jobs by ascending or descending order.
     * </p>
     * 
     * @param sortOrder
     *        Sort model card export jobs by ascending or descending order.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelCardExportJobSortOrder
     */

    public ListModelCardExportJobsRequest withSortOrder(ModelCardExportJobSortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * If the response to a previous <code>ListModelCardExportJobs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model card export jobs, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListModelCardExportJobs</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of model card export jobs, use the token in
     *        the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListModelCardExportJobs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model card export jobs, use the token in the next request.
     * </p>
     * 
     * @return If the response to a previous <code>ListModelCardExportJobs</code> request was truncated, the response
     *         includes a <code>NextToken</code>. To retrieve the next set of model card export jobs, use the token in
     *         the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the response to a previous <code>ListModelCardExportJobs</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of model card export jobs, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the response to a previous <code>ListModelCardExportJobs</code> request was truncated, the response
     *        includes a <code>NextToken</code>. To retrieve the next set of model card export jobs, use the token in
     *        the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardExportJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of model card export jobs to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of model card export jobs to list.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of model card export jobs to list.
     * </p>
     * 
     * @return The maximum number of model card export jobs to list.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of model card export jobs to list.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of model card export jobs to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListModelCardExportJobsRequest withMaxResults(Integer maxResults) {
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
        if (getModelCardName() != null)
            sb.append("ModelCardName: ").append(getModelCardName()).append(",");
        if (getModelCardVersion() != null)
            sb.append("ModelCardVersion: ").append(getModelCardVersion()).append(",");
        if (getCreationTimeAfter() != null)
            sb.append("CreationTimeAfter: ").append(getCreationTimeAfter()).append(",");
        if (getCreationTimeBefore() != null)
            sb.append("CreationTimeBefore: ").append(getCreationTimeBefore()).append(",");
        if (getModelCardExportJobNameContains() != null)
            sb.append("ModelCardExportJobNameContains: ").append(getModelCardExportJobNameContains()).append(",");
        if (getStatusEquals() != null)
            sb.append("StatusEquals: ").append(getStatusEquals()).append(",");
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

        if (obj instanceof ListModelCardExportJobsRequest == false)
            return false;
        ListModelCardExportJobsRequest other = (ListModelCardExportJobsRequest) obj;
        if (other.getModelCardName() == null ^ this.getModelCardName() == null)
            return false;
        if (other.getModelCardName() != null && other.getModelCardName().equals(this.getModelCardName()) == false)
            return false;
        if (other.getModelCardVersion() == null ^ this.getModelCardVersion() == null)
            return false;
        if (other.getModelCardVersion() != null && other.getModelCardVersion().equals(this.getModelCardVersion()) == false)
            return false;
        if (other.getCreationTimeAfter() == null ^ this.getCreationTimeAfter() == null)
            return false;
        if (other.getCreationTimeAfter() != null && other.getCreationTimeAfter().equals(this.getCreationTimeAfter()) == false)
            return false;
        if (other.getCreationTimeBefore() == null ^ this.getCreationTimeBefore() == null)
            return false;
        if (other.getCreationTimeBefore() != null && other.getCreationTimeBefore().equals(this.getCreationTimeBefore()) == false)
            return false;
        if (other.getModelCardExportJobNameContains() == null ^ this.getModelCardExportJobNameContains() == null)
            return false;
        if (other.getModelCardExportJobNameContains() != null
                && other.getModelCardExportJobNameContains().equals(this.getModelCardExportJobNameContains()) == false)
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

        hashCode = prime * hashCode + ((getModelCardName() == null) ? 0 : getModelCardName().hashCode());
        hashCode = prime * hashCode + ((getModelCardVersion() == null) ? 0 : getModelCardVersion().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeAfter() == null) ? 0 : getCreationTimeAfter().hashCode());
        hashCode = prime * hashCode + ((getCreationTimeBefore() == null) ? 0 : getCreationTimeBefore().hashCode());
        hashCode = prime * hashCode + ((getModelCardExportJobNameContains() == null) ? 0 : getModelCardExportJobNameContains().hashCode());
        hashCode = prime * hashCode + ((getStatusEquals() == null) ? 0 : getStatusEquals().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListModelCardExportJobsRequest clone() {
        return (ListModelCardExportJobsRequest) super.clone();
    }

}
