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
package com.amazonaws.services.bedrockagent.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-agent-2023-06-05/ListIngestionJobs" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListIngestionJobsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique identifier of the data source for which to return ingestion jobs.
     * </p>
     */
    private String dataSourceId;
    /**
     * <p>
     * Contains a definition of a filter for which to filter the results.
     * </p>
     */
    private java.util.List<IngestionJobFilter> filters;
    /**
     * <p>
     * The unique identifier of the knowledge base for which to return ingestion jobs.
     * </p>
     */
    private String knowledgeBaseId;
    /**
     * <p>
     * The maximum number of results to return in the response. If the total number of results is greater than this
     * value, use the token returned in the response in the <code>nextToken</code> field when making another request to
     * return the next batch of results.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, enter
     * the token returned in the <code>nextToken</code> field in the response in this field to return the next batch of
     * results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * Contains details about how to sort the results.
     * </p>
     */
    private IngestionJobSortBy sortBy;

    /**
     * <p>
     * The unique identifier of the data source for which to return ingestion jobs.
     * </p>
     * 
     * @param dataSourceId
     *        The unique identifier of the data source for which to return ingestion jobs.
     */

    public void setDataSourceId(String dataSourceId) {
        this.dataSourceId = dataSourceId;
    }

    /**
     * <p>
     * The unique identifier of the data source for which to return ingestion jobs.
     * </p>
     * 
     * @return The unique identifier of the data source for which to return ingestion jobs.
     */

    public String getDataSourceId() {
        return this.dataSourceId;
    }

    /**
     * <p>
     * The unique identifier of the data source for which to return ingestion jobs.
     * </p>
     * 
     * @param dataSourceId
     *        The unique identifier of the data source for which to return ingestion jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngestionJobsRequest withDataSourceId(String dataSourceId) {
        setDataSourceId(dataSourceId);
        return this;
    }

    /**
     * <p>
     * Contains a definition of a filter for which to filter the results.
     * </p>
     * 
     * @return Contains a definition of a filter for which to filter the results.
     */

    public java.util.List<IngestionJobFilter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Contains a definition of a filter for which to filter the results.
     * </p>
     * 
     * @param filters
     *        Contains a definition of a filter for which to filter the results.
     */

    public void setFilters(java.util.Collection<IngestionJobFilter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<IngestionJobFilter>(filters);
    }

    /**
     * <p>
     * Contains a definition of a filter for which to filter the results.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        Contains a definition of a filter for which to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngestionJobsRequest withFilters(IngestionJobFilter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<IngestionJobFilter>(filters.length));
        }
        for (IngestionJobFilter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Contains a definition of a filter for which to filter the results.
     * </p>
     * 
     * @param filters
     *        Contains a definition of a filter for which to filter the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngestionJobsRequest withFilters(java.util.Collection<IngestionJobFilter> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base for which to return ingestion jobs.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base for which to return ingestion jobs.
     */

    public void setKnowledgeBaseId(String knowledgeBaseId) {
        this.knowledgeBaseId = knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base for which to return ingestion jobs.
     * </p>
     * 
     * @return The unique identifier of the knowledge base for which to return ingestion jobs.
     */

    public String getKnowledgeBaseId() {
        return this.knowledgeBaseId;
    }

    /**
     * <p>
     * The unique identifier of the knowledge base for which to return ingestion jobs.
     * </p>
     * 
     * @param knowledgeBaseId
     *        The unique identifier of the knowledge base for which to return ingestion jobs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngestionJobsRequest withKnowledgeBaseId(String knowledgeBaseId) {
        setKnowledgeBaseId(knowledgeBaseId);
        return this;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. If the total number of results is greater than this
     * value, use the token returned in the response in the <code>nextToken</code> field when making another request to
     * return the next batch of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response. If the total number of results is greater than
     *        this value, use the token returned in the response in the <code>nextToken</code> field when making another
     *        request to return the next batch of results.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. If the total number of results is greater than this
     * value, use the token returned in the response in the <code>nextToken</code> field when making another request to
     * return the next batch of results.
     * </p>
     * 
     * @return The maximum number of results to return in the response. If the total number of results is greater than
     *         this value, use the token returned in the response in the <code>nextToken</code> field when making
     *         another request to return the next batch of results.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of results to return in the response. If the total number of results is greater than this
     * value, use the token returned in the response in the <code>nextToken</code> field when making another request to
     * return the next batch of results.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of results to return in the response. If the total number of results is greater than
     *        this value, use the token returned in the response in the <code>nextToken</code> field when making another
     *        request to return the next batch of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngestionJobsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, enter
     * the token returned in the <code>nextToken</code> field in the response in this field to return the next batch of
     * results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *        enter the token returned in the <code>nextToken</code> field in the response in this field to return the
     *        next batch of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, enter
     * the token returned in the <code>nextToken</code> field in the response in this field to return the next batch of
     * results.
     * </p>
     * 
     * @return If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *         enter the token returned in the <code>nextToken</code> field in the response in this field to return the
     *         next batch of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the total number of results is greater than the <code>maxResults</code> value provided in the request, enter
     * the token returned in the <code>nextToken</code> field in the response in this field to return the next batch of
     * results.
     * </p>
     * 
     * @param nextToken
     *        If the total number of results is greater than the <code>maxResults</code> value provided in the request,
     *        enter the token returned in the <code>nextToken</code> field in the response in this field to return the
     *        next batch of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngestionJobsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * Contains details about how to sort the results.
     * </p>
     * 
     * @param sortBy
     *        Contains details about how to sort the results.
     */

    public void setSortBy(IngestionJobSortBy sortBy) {
        this.sortBy = sortBy;
    }

    /**
     * <p>
     * Contains details about how to sort the results.
     * </p>
     * 
     * @return Contains details about how to sort the results.
     */

    public IngestionJobSortBy getSortBy() {
        return this.sortBy;
    }

    /**
     * <p>
     * Contains details about how to sort the results.
     * </p>
     * 
     * @param sortBy
     *        Contains details about how to sort the results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListIngestionJobsRequest withSortBy(IngestionJobSortBy sortBy) {
        setSortBy(sortBy);
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
        if (getDataSourceId() != null)
            sb.append("DataSourceId: ").append(getDataSourceId()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
        if (getKnowledgeBaseId() != null)
            sb.append("KnowledgeBaseId: ").append(getKnowledgeBaseId()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListIngestionJobsRequest == false)
            return false;
        ListIngestionJobsRequest other = (ListIngestionJobsRequest) obj;
        if (other.getDataSourceId() == null ^ this.getDataSourceId() == null)
            return false;
        if (other.getDataSourceId() != null && other.getDataSourceId().equals(this.getDataSourceId()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        if (other.getKnowledgeBaseId() == null ^ this.getKnowledgeBaseId() == null)
            return false;
        if (other.getKnowledgeBaseId() != null && other.getKnowledgeBaseId().equals(this.getKnowledgeBaseId()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDataSourceId() == null) ? 0 : getDataSourceId().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getKnowledgeBaseId() == null) ? 0 : getKnowledgeBaseId().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        return hashCode;
    }

    @Override
    public ListIngestionJobsRequest clone() {
        return (ListIngestionJobsRequest) super.clone();
    }

}
