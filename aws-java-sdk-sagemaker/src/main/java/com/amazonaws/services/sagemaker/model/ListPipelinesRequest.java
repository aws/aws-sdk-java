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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/ListPipelines" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListPipelinesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The prefix of the pipeline name.
     * </p>
     */
    private String pipelineNamePrefix;
    /**
     * <p>
     * A filter that returns the pipelines that were created after a specified time.
     * </p>
     */
    private java.util.Date createdAfter;
    /**
     * <p>
     * A filter that returns the pipelines that were created before a specified time.
     * </p>
     */
    private java.util.Date createdBefore;
    /**
     * <p>
     * The field by which to sort results. The default is <code>CreatedTime</code>.
     * </p>
     */
    private String sortBy;
    /**
     * <p>
     * The sort order for results.
     * </p>
     */
    private String sortOrder;
    /**
     * <p>
     * If the result of the previous <code>ListPipelines</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of pipelines, use the token in the next request.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of pipelines to return in the response.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The prefix of the pipeline name.
     * </p>
     * 
     * @param pipelineNamePrefix
     *        The prefix of the pipeline name.
     */

    public void setPipelineNamePrefix(String pipelineNamePrefix) {
        this.pipelineNamePrefix = pipelineNamePrefix;
    }

    /**
     * <p>
     * The prefix of the pipeline name.
     * </p>
     * 
     * @return The prefix of the pipeline name.
     */

    public String getPipelineNamePrefix() {
        return this.pipelineNamePrefix;
    }

    /**
     * <p>
     * The prefix of the pipeline name.
     * </p>
     * 
     * @param pipelineNamePrefix
     *        The prefix of the pipeline name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesRequest withPipelineNamePrefix(String pipelineNamePrefix) {
        setPipelineNamePrefix(pipelineNamePrefix);
        return this;
    }

    /**
     * <p>
     * A filter that returns the pipelines that were created after a specified time.
     * </p>
     * 
     * @param createdAfter
     *        A filter that returns the pipelines that were created after a specified time.
     */

    public void setCreatedAfter(java.util.Date createdAfter) {
        this.createdAfter = createdAfter;
    }

    /**
     * <p>
     * A filter that returns the pipelines that were created after a specified time.
     * </p>
     * 
     * @return A filter that returns the pipelines that were created after a specified time.
     */

    public java.util.Date getCreatedAfter() {
        return this.createdAfter;
    }

    /**
     * <p>
     * A filter that returns the pipelines that were created after a specified time.
     * </p>
     * 
     * @param createdAfter
     *        A filter that returns the pipelines that were created after a specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesRequest withCreatedAfter(java.util.Date createdAfter) {
        setCreatedAfter(createdAfter);
        return this;
    }

    /**
     * <p>
     * A filter that returns the pipelines that were created before a specified time.
     * </p>
     * 
     * @param createdBefore
     *        A filter that returns the pipelines that were created before a specified time.
     */

    public void setCreatedBefore(java.util.Date createdBefore) {
        this.createdBefore = createdBefore;
    }

    /**
     * <p>
     * A filter that returns the pipelines that were created before a specified time.
     * </p>
     * 
     * @return A filter that returns the pipelines that were created before a specified time.
     */

    public java.util.Date getCreatedBefore() {
        return this.createdBefore;
    }

    /**
     * <p>
     * A filter that returns the pipelines that were created before a specified time.
     * </p>
     * 
     * @param createdBefore
     *        A filter that returns the pipelines that were created before a specified time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesRequest withCreatedBefore(java.util.Date createdBefore) {
        setCreatedBefore(createdBefore);
        return this;
    }

    /**
     * <p>
     * The field by which to sort results. The default is <code>CreatedTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The field by which to sort results. The default is <code>CreatedTime</code>.
     * @see SortPipelinesBy
     */

    public void setSortBy(String sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * The field by which to sort results. The default is <code>CreatedTime</code>.
     * </p>
     * 
     * @return The field by which to sort results. The default is <code>CreatedTime</code>.
     * @see SortPipelinesBy
     */

    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * The field by which to sort results. The default is <code>CreatedTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The field by which to sort results. The default is <code>CreatedTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortPipelinesBy
     */

    public ListPipelinesRequest withSortBy(String sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * The field by which to sort results. The default is <code>CreatedTime</code>.
     * </p>
     * 
     * @param sortBy
     *        The field by which to sort results. The default is <code>CreatedTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortPipelinesBy
     */

    public ListPipelinesRequest withSortBy(SortPipelinesBy sortBy) {
        this.sortBy = sortBy.toString();
        return this;
    }

    /**
     * <p>
     * The sort order for results.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for results.
     * @see SortOrder
     */

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    /**
     * <p>
     * The sort order for results.
     * </p>
     * 
     * @return The sort order for results.
     * @see SortOrder
     */

    public String getSortOrder() {
        return this.sortOrder;
    }

    /**
     * <p>
     * The sort order for results.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListPipelinesRequest withSortOrder(String sortOrder) {
        setSortOrder(sortOrder);
        return this;
    }

    /**
     * <p>
     * The sort order for results.
     * </p>
     * 
     * @param sortOrder
     *        The sort order for results.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SortOrder
     */

    public ListPipelinesRequest withSortOrder(SortOrder sortOrder) {
        this.sortOrder = sortOrder.toString();
        return this;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelines</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of pipelines, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListPipelines</code> request was truncated, the response includes a
     *        <code>NextToken</code>. To retrieve the next set of pipelines, use the token in the next request.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelines</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of pipelines, use the token in the next request.
     * </p>
     * 
     * @return If the result of the previous <code>ListPipelines</code> request was truncated, the response includes a
     *         <code>NextToken</code>. To retrieve the next set of pipelines, use the token in the next request.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous <code>ListPipelines</code> request was truncated, the response includes a
     * <code>NextToken</code>. To retrieve the next set of pipelines, use the token in the next request.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous <code>ListPipelines</code> request was truncated, the response includes a
     *        <code>NextToken</code>. To retrieve the next set of pipelines, use the token in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of pipelines to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of pipelines to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of pipelines to return in the response.
     * </p>
     * 
     * @return The maximum number of pipelines to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of pipelines to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of pipelines to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListPipelinesRequest withMaxResults(Integer maxResults) {
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
        if (getPipelineNamePrefix() != null)
            sb.append("PipelineNamePrefix: ").append(getPipelineNamePrefix()).append(",");
        if (getCreatedAfter() != null)
            sb.append("CreatedAfter: ").append(getCreatedAfter()).append(",");
        if (getCreatedBefore() != null)
            sb.append("CreatedBefore: ").append(getCreatedBefore()).append(",");
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

        if (obj instanceof ListPipelinesRequest == false)
            return false;
        ListPipelinesRequest other = (ListPipelinesRequest) obj;
        if (other.getPipelineNamePrefix() == null ^ this.getPipelineNamePrefix() == null)
            return false;
        if (other.getPipelineNamePrefix() != null && other.getPipelineNamePrefix().equals(this.getPipelineNamePrefix()) == false)
            return false;
        if (other.getCreatedAfter() == null ^ this.getCreatedAfter() == null)
            return false;
        if (other.getCreatedAfter() != null && other.getCreatedAfter().equals(this.getCreatedAfter()) == false)
            return false;
        if (other.getCreatedBefore() == null ^ this.getCreatedBefore() == null)
            return false;
        if (other.getCreatedBefore() != null && other.getCreatedBefore().equals(this.getCreatedBefore()) == false)
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

        hashCode = prime * hashCode + ((getPipelineNamePrefix() == null) ? 0 : getPipelineNamePrefix().hashCode());
        hashCode = prime * hashCode + ((getCreatedAfter() == null) ? 0 : getCreatedAfter().hashCode());
        hashCode = prime * hashCode + ((getCreatedBefore() == null) ? 0 : getCreatedBefore().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getSortOrder() == null) ? 0 : getSortOrder().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListPipelinesRequest clone() {
        return (ListPipelinesRequest) super.clone();
    }

}
