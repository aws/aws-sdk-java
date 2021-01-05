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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ce-2017-10-25/GetTags" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The value that you want to search for.
     * </p>
     */
    private String searchString;
    /**
     * <p>
     * The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date is
     * exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     */
    private DateInterval timePeriod;
    /**
     * <p>
     * The key of the tag that you want to return values for.
     * </p>
     */
    private String tagKey;

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
     * This field is only used when SortBy is provided in the request. The maximum number of objects that to be returned
     * for this request. If MaxResults is not specified with SortBy, the request will return 1000 results as the default
     * value for this parameter.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     */
    private String nextPageToken;

    /**
     * <p>
     * The value that you want to search for.
     * </p>
     * 
     * @param searchString
     *        The value that you want to search for.
     */

    public void setSearchString(String searchString) {
        this.searchString = searchString;
    }

    /**
     * <p>
     * The value that you want to search for.
     * </p>
     * 
     * @return The value that you want to search for.
     */

    public String getSearchString() {
        return this.searchString;
    }

    /**
     * <p>
     * The value that you want to search for.
     * </p>
     * 
     * @param searchString
     *        The value that you want to search for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagsRequest withSearchString(String searchString) {
        setSearchString(searchString);
        return this;
    }

    /**
     * <p>
     * The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date is
     * exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     * 
     * @param timePeriod
     *        The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date
     *        is exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     *        <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     *        including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     */

    public void setTimePeriod(DateInterval timePeriod) {
        this.timePeriod = timePeriod;
    }

    /**
     * <p>
     * The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date is
     * exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     * 
     * @return The start and end dates for retrieving the dimension values. The start date is inclusive, but the end
     *         date is exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     *         <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     *         including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     */

    public DateInterval getTimePeriod() {
        return this.timePeriod;
    }

    /**
     * <p>
     * The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date is
     * exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     * <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     * including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * </p>
     * 
     * @param timePeriod
     *        The start and end dates for retrieving the dimension values. The start date is inclusive, but the end date
     *        is exclusive. For example, if <code>start</code> is <code>2017-01-01</code> and <code>end</code> is
     *        <code>2017-05-01</code>, then the cost and usage data is retrieved from <code>2017-01-01</code> up to and
     *        including <code>2017-04-30</code> but not including <code>2017-05-01</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagsRequest withTimePeriod(DateInterval timePeriod) {
        setTimePeriod(timePeriod);
        return this;
    }

    /**
     * <p>
     * The key of the tag that you want to return values for.
     * </p>
     * 
     * @param tagKey
     *        The key of the tag that you want to return values for.
     */

    public void setTagKey(String tagKey) {
        this.tagKey = tagKey;
    }

    /**
     * <p>
     * The key of the tag that you want to return values for.
     * </p>
     * 
     * @return The key of the tag that you want to return values for.
     */

    public String getTagKey() {
        return this.tagKey;
    }

    /**
     * <p>
     * The key of the tag that you want to return values for.
     * </p>
     * 
     * @param tagKey
     *        The key of the tag that you want to return values for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagsRequest withTagKey(String tagKey) {
        setTagKey(tagKey);
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

    public GetTagsRequest withFilter(Expression filter) {
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

    public GetTagsRequest withSortBy(SortDefinition... sortBy) {
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

    public GetTagsRequest withSortBy(java.util.Collection<SortDefinition> sortBy) {
        setSortBy(sortBy);
        return this;
    }

    /**
     * <p>
     * This field is only used when SortBy is provided in the request. The maximum number of objects that to be returned
     * for this request. If MaxResults is not specified with SortBy, the request will return 1000 results as the default
     * value for this parameter.
     * </p>
     * 
     * @param maxResults
     *        This field is only used when SortBy is provided in the request. The maximum number of objects that to be
     *        returned for this request. If MaxResults is not specified with SortBy, the request will return 1000
     *        results as the default value for this parameter.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * This field is only used when SortBy is provided in the request. The maximum number of objects that to be returned
     * for this request. If MaxResults is not specified with SortBy, the request will return 1000 results as the default
     * value for this parameter.
     * </p>
     * 
     * @return This field is only used when SortBy is provided in the request. The maximum number of objects that to be
     *         returned for this request. If MaxResults is not specified with SortBy, the request will return 1000
     *         results as the default value for this parameter.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * This field is only used when SortBy is provided in the request. The maximum number of objects that to be returned
     * for this request. If MaxResults is not specified with SortBy, the request will return 1000 results as the default
     * value for this parameter.
     * </p>
     * 
     * @param maxResults
     *        This field is only used when SortBy is provided in the request. The maximum number of objects that to be
     *        returned for this request. If MaxResults is not specified with SortBy, the request will return 1000
     *        results as the default value for this parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *        call has more results than the maximum page size.
     */

    public void setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @return The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *         call has more results than the maximum page size.
     */

    public String getNextPageToken() {
        return this.nextPageToken;
    }

    /**
     * <p>
     * The token to retrieve the next set of results. AWS provides the token when the response from a previous call has
     * more results than the maximum page size.
     * </p>
     * 
     * @param nextPageToken
     *        The token to retrieve the next set of results. AWS provides the token when the response from a previous
     *        call has more results than the maximum page size.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetTagsRequest withNextPageToken(String nextPageToken) {
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
        if (getTagKey() != null)
            sb.append("TagKey: ").append(getTagKey()).append(",");
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

        if (obj instanceof GetTagsRequest == false)
            return false;
        GetTagsRequest other = (GetTagsRequest) obj;
        if (other.getSearchString() == null ^ this.getSearchString() == null)
            return false;
        if (other.getSearchString() != null && other.getSearchString().equals(this.getSearchString()) == false)
            return false;
        if (other.getTimePeriod() == null ^ this.getTimePeriod() == null)
            return false;
        if (other.getTimePeriod() != null && other.getTimePeriod().equals(this.getTimePeriod()) == false)
            return false;
        if (other.getTagKey() == null ^ this.getTagKey() == null)
            return false;
        if (other.getTagKey() != null && other.getTagKey().equals(this.getTagKey()) == false)
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
        hashCode = prime * hashCode + ((getTagKey() == null) ? 0 : getTagKey().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getSortBy() == null) ? 0 : getSortBy().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextPageToken() == null) ? 0 : getNextPageToken().hashCode());
        return hashCode;
    }

    @Override
    public GetTagsRequest clone() {
        return (GetTagsRequest) super.clone();
    }

}
