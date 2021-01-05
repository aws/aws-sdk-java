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
package com.amazonaws.services.costexplorer.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetCostCategories" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetCostCategoriesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The value that you want to search the filter values for.
     * </p>
     * <p>
     * If you do not specify a <code>CostCategoryName</code>, <code>SearchString</code> will be used to filter Cost
     * Category names that match the <code>SearchString</code> pattern. If you do specifiy a
     * <code>CostCategoryName</code>, <code>SearchString</code> will be used to filter Cost Category values that match
     * the <code>SearchString</code> pattern.
     * </p>
     */
    private String searchString;

    private DateInterval timePeriod;

    private String costCategoryName;

    private Expression filter;
    /**
     * <p>
     * The value by which you want to sort the data.
     * </p>
     * <p>
     * The key represents cost and usage metrics. The following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BlendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetAmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetUnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UsageQuantity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NormalizedUsageAmount</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <p>
     * When using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not supported.
     * </p>
     */
    private java.util.List<SortDefinition> sortBy;
    /**
     * <p>
     * This field is only used when <code>SortBy</code> is provided in the request.
     * </p>
     * <p>
     * The maximum number of objects that to be returned for this request. If <code>MaxResults</code> is not specified
     * with <code>SortBy</code>, the request will return 1000 results as the default value for this parameter.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * If the number of objects that are still available for retrieval exceeds the limit, AWS returns a NextPageToken
     * value in the response. To retrieve the next batch of objects, provide the NextPageToken from the prior call in
     * your next request.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The value that you want to search the filter values for.
     * </p>
     * <p>
     * If you do not specify a <code>CostCategoryName</code>, <code>SearchString</code> will be used to filter Cost
     * Category names that match the <code>SearchString</code> pattern. If you do specifiy a
     * <code>CostCategoryName</code>, <code>SearchString</code> will be used to filter Cost Category values that match
     * the <code>SearchString</code> pattern.
     * </p>
     * 
     * @param searchString
     *        The value that you want to search the filter values for.</p>
     *        <p>
     *        If you do not specify a <code>CostCategoryName</code>, <code>SearchString</code> will be used to filter
     *        Cost Category names that match the <code>SearchString</code> pattern. If you do specifiy a
     *        <code>CostCategoryName</code>, <code>SearchString</code> will be used to filter Cost Category values that
     *        match the <code>SearchString</code> pattern.
     */

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    /**
     * <p>
     * The value that you want to search the filter values for.
     * </p>
     * <p>
     * If you do not specify a <code>CostCategoryName</code>, <code>SearchString</code> will be used to filter Cost
     * Category names that match the <code>SearchString</code> pattern. If you do specifiy a
     * <code>CostCategoryName</code>, <code>SearchString</code> will be used to filter Cost Category values that match
     * the <code>SearchString</code> pattern.
     * </p>
     * 
     * @return The value that you want to search the filter values for.</p>
     *         <p>
     *         If you do not specify a <code>CostCategoryName</code>, <code>SearchString</code> will be used to filter
     *         Cost Category names that match the <code>SearchString</code> pattern. If you do specifiy a
     *         <code>CostCategoryName</code>, <code>SearchString</code> will be used to filter Cost Category values that
     *         match the <code>SearchString</code> pattern.
     */

    public String getSearchString() {
        return this.searchString;
    }

    /**
     * <p>
     * The value that you want to search the filter values for.
     * </p>
     * <p>
     * If you do not specify a <code>CostCategoryName</code>, <code>SearchString</code> will be used to filter Cost
     * Category names that match the <code>SearchString</code> pattern. If you do specifiy a
     * <code>CostCategoryName</code>, <code>SearchString</code> will be used to filter Cost Category values that match
     * the <code>SearchString</code> pattern.
     * </p>
     * 
     * @param searchString
     *        The value that you want to search the filter values for.</p>
     *        <p>
     *        If you do not specify a <code>CostCategoryName</code>, <code>SearchString</code> will be used to filter
     *        Cost Category names that match the <code>SearchString</code> pattern. If you do specifiy a
     *        <code>CostCategoryName</code>, <code>SearchString</code> will be used to filter Cost Category values that
     *        match the <code>SearchString</code> pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesRequest withSearchString(String searchString) {
        setSearchString(searchString);
        return this;
    }

    /**
     * @param timePeriod
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * @return
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * @param timePeriod
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesRequest withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * @param costCategoryName
     */

    public void setCostCategoryName(String costCategoryName) {
        this.costCategoryName = costCategoryName;
    }

    /**
     * @return
     */

    public String getCostCategoryName() {
        return this.costCategoryName;
    }

    /**
     * @param costCategoryName
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesRequest withCostCategoryName(String costCategoryName) {
        setCostCategoryName(costCategoryName);
        return this;
    }

    /**
     * @param filter
     */

    public void setFilter(Expression filter) {
        this.filter = filter;
    }

    /**
     * @return
     */

    public Expression getFilter() {
        return this.filter;
    }

    /**
     * @param filter
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesRequest withFilter(Expression filter) {
        setFilter(filter);
        return this;
    }

    /**
     * <p>
     * The value by which you want to sort the data.
     * </p>
     * <p>
     * The key represents cost and usage metrics. The following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BlendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetAmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetUnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UsageQuantity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NormalizedUsageAmount</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <p>
     * When using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not supported.
     * </p>
     * 
     * @return The value by which you want to sort the data.</p>
     *         <p>
     *         The key represents cost and usage metrics. The following values are supported:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>BlendedCost</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UnblendedCost</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AmortizedCost</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NetAmortizedCost</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NetUnblendedCost</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>UsageQuantity</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NormalizedUsageAmount</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     *         </p>
     *         <p>
     *         When using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not
     *         supported.
     */

    public java.util.List<SortDefinition> getSortBy() {
        return sortBy;
    }

    /**
     * <p>
     * The value by which you want to sort the data.
     * </p>
     * <p>
     * The key represents cost and usage metrics. The following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BlendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetAmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetUnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UsageQuantity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NormalizedUsageAmount</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <p>
     * When using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not supported.
     * </p>
     * 
     * @param sortBy
     *        The value by which you want to sort the data.</p>
     *        <p>
     *        The key represents cost and usage metrics. The following values are supported:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BlendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UnblendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AmortizedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NetAmortizedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NetUnblendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UsageQuantity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NormalizedUsageAmount</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     *        </p>
     *        <p>
     *        When using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not
     *        supported.
     */

    public void setSortBy(java.util.Collection<SortDefinition> sortBy) {
        if (sortBy == null) {
            this.sortBy = null;
            return;
        }

        this.sortBy = new java.util.ArrayList<SortDefinition>(sortBy);
    }

    /**
     * <p>
     * The value by which you want to sort the data.
     * </p>
     * <p>
     * The key represents cost and usage metrics. The following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BlendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetAmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetUnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UsageQuantity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NormalizedUsageAmount</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <p>
     * When using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSortBy(java.util.Collection)} or {@link #withSortBy(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param sortBy
     *        The value by which you want to sort the data.</p>
     *        <p>
     *        The key represents cost and usage metrics. The following values are supported:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BlendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UnblendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AmortizedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NetAmortizedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NetUnblendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UsageQuantity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NormalizedUsageAmount</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     *        </p>
     *        <p>
     *        When using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesRequest withSortBy(SortDefinition... sortBy) {
        if (this.sortBy == null) {
            setSortBy(new java.util.ArrayList<SortDefinition>(sortBy.length));
        }
        for (SortDefinition ele : sortBy) {
            this.sortBy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The value by which you want to sort the data.
     * </p>
     * <p>
     * The key represents cost and usage metrics. The following values are supported:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>BlendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetAmortizedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NetUnblendedCost</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>UsageQuantity</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NormalizedUsageAmount</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     * </p>
     * <p>
     * When using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not supported.
     * </p>
     * 
     * @param sortBy
     *        The value by which you want to sort the data.</p>
     *        <p>
     *        The key represents cost and usage metrics. The following values are supported:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>BlendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UnblendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AmortizedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NetAmortizedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NetUnblendedCost</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>UsageQuantity</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NormalizedUsageAmount</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Supported values for <code>SortOrder</code> are <code>ASCENDING</code> or <code>DESCENDING</code>.
     *        </p>
     *        <p>
     *        When using <code>SortBy</code>, <code>NextPageToken</code> and <code>SearchString</code> are not
     *        supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesRequest withSortBy(java.util.Collection<SortDefinition> sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * This field is only used when <code>SortBy</code> is provided in the request.
     * </p>
     * <p>
     * The maximum number of objects that to be returned for this request. If <code>MaxResults</code> is not specified
     * with <code>SortBy</code>, the request will return 1000 results as the default value for this parameter.
     * </p>
     * 
     * @param maxResults
     *        This field is only used when <code>SortBy</code> is provided in the request.</p>
     *        <p>
     *        The maximum number of objects that to be returned for this request. If <code>MaxResults</code> is not
     *        specified with <code>SortBy</code>, the request will return 1000 results as the default value for this
     *        parameter.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * This field is only used when <code>SortBy</code> is provided in the request.
     * </p>
     * <p>
     * The maximum number of objects that to be returned for this request. If <code>MaxResults</code> is not specified
     * with <code>SortBy</code>, the request will return 1000 results as the default value for this parameter.
     * </p>
     * 
     * @return This field is only used when <code>SortBy</code> is provided in the request.</p>
     *         <p>
     *         The maximum number of objects that to be returned for this request. If <code>MaxResults</code> is not
     *         specified with <code>SortBy</code>, the request will return 1000 results as the default value for this
     *         parameter.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * This field is only used when <code>SortBy</code> is provided in the request.
     * </p>
     * <p>
     * The maximum number of objects that to be returned for this request. If <code>MaxResults</code> is not specified
     * with <code>SortBy</code>, the request will return 1000 results as the default value for this parameter.
     * </p>
     * 
     * @param maxResults
     *        This field is only used when <code>SortBy</code> is provided in the request.</p>
     *        <p>
     *        The maximum number of objects that to be returned for this request. If <code>MaxResults</code> is not
     *        specified with <code>SortBy</code>, the request will return 1000 results as the default value for this
     *        parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * If the number of objects that are still available for retrieval exceeds the limit, AWS returns a NextPageToken
     * value in the response. To retrieve the next batch of objects, provide the NextPageToken from the prior call in
     * your next request.
     * </p>
     * 
     * @param nextPageToken
     *        If the number of objects that are still available for retrieval exceeds the limit, AWS returns a
     *        NextPageToken value in the response. To retrieve the next batch of objects, provide the NextPageToken from
     *        the prior call in your next request.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * If the number of objects that are still available for retrieval exceeds the limit, AWS returns a NextPageToken
     * value in the response. To retrieve the next batch of objects, provide the NextPageToken from the prior call in
     * your next request.
     * </p>
     * 
     * @return If the number of objects that are still available for retrieval exceeds the limit, AWS returns a
     *         NextPageToken value in the response. To retrieve the next batch of objects, provide the NextPageToken
     *         from the prior call in your next request.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * If the number of objects that are still available for retrieval exceeds the limit, AWS returns a NextPageToken
     * value in the response. To retrieve the next batch of objects, provide the NextPageToken from the prior call in
     * your next request.
     * </p>
     * 
     * @param nextPageToken
     *        If the number of objects that are still available for retrieval exceeds the limit, AWS returns a
     *        NextPageToken value in the response. To retrieve the next batch of objects, provide the NextPageToken from
     *        the prior call in your next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetCostCategoriesRequest withNextPageToken(String nextPageToken) {
        setNextPageToken(nextPageToken);
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
        if (getSearchString() != null)
            sb.append("SearchString: ").append(getSearchString()).append(",");
        if (getTimePeriod() != null)
            sb.append("TimePeriod: ").append(getTimePeriod()).append(",");
        if (getCostCategoryName() != null)
            sb.append("CostCategoryName: ").append(getCostCategoryName()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
        if (getSortBy() != null)
            sb.append("SortBy: ").append(getSortBy()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getNextPageToken() != null)
            sb.append("NextPageToken: ").append(getNextPageToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetCostCategoriesRequest == false)
            return false;
        GetCostCategoriesRequest other = (GetCostCategoriesRequest) obj;
        if (other.getSearchString() == null ^ this.getSearchString() == null)
            return false;
        if (other.getSearchString() != null && other.getSearchString().equals(this.getSearchString()) == false)
            return false;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getCostCategoryName() == null ^ this.getCostCategoryName() == null)
            return false;
        if (other.getCostCategoryName() != null && other.getCostCategoryName().equals(this.getCostCategoryName()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
            return false;
        if (other.getSortBy() == null ^ this.getSortBy() == null)
            return false;
        if (other.getSortBy() != null && other.getSortBy().equals(this.getSortBy()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getNextPageToken() == null ^ this.getNextPageToken() == null)
            return false;
        if (other.getNextPageToken() != null && other.getNextPageToken().equals(this.getNextPageToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSearchString() == null) ? 0 : getSearchString().hashCode());
        hashCode = prime * hashCode + ((getTimePeriod() == null) ? 0 : getTimePeriod().hashCode());
        hashCode = prime * hashCode + ((getCostCategoryName() == null) ? 0 : getCostCategoryName().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetCostCategoriesRequest clone() {
        return (GetCostCategoriesRequest) super.clone();
    }

}
