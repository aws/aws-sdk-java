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
package com.amazonaws.services.forecast.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecast-2018-06-26/ListForecasts" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListForecastsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The number of items to return in the response.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An array of filters. For each filter, you provide a condition and a match statement. The condition is either
     * <code>IS</code> or <code>IS_NOT</code>, which specifies whether to include or exclude the forecasts that match
     * the statement from the list, respectively. The match statement consists of a key and a value.
     * </p>
     * <p>
     * <b>Filter properties</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Condition</code> - The condition to apply. Valid values are <code>IS</code> and <code>IS_NOT</code>. To
     * include the forecasts that match the statement, specify <code>IS</code>. To exclude matching forecasts, specify
     * <code>IS_NOT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key</code> - The name of the parameter to filter on. Valid values are <code>DatasetGroupArn</code>,
     * <code>PredictorArn</code>, and <code>Status</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Value</code> - The value to match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, to list all forecasts whose status is not ACTIVE, you would specify:
     * </p>
     * <p>
     * <code>"Filters": [ { "Condition": "IS_NOT", "Key": "Status", "Value": "ACTIVE" } ]</code>
     * </p>
     */
    private java.util.List<Filter> filters;

    /**
     * <p>
     * If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To
     *        retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * </p>
     * 
     * @return If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To
     *         retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * </p>
     * 
     * @param nextToken
     *        If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To
     *        retrieve the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListForecastsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The number of items to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The number of items to return in the response.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The number of items to return in the response.
     * </p>
     * 
     * @return The number of items to return in the response.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The number of items to return in the response.
     * </p>
     * 
     * @param maxResults
     *        The number of items to return in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListForecastsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An array of filters. For each filter, you provide a condition and a match statement. The condition is either
     * <code>IS</code> or <code>IS_NOT</code>, which specifies whether to include or exclude the forecasts that match
     * the statement from the list, respectively. The match statement consists of a key and a value.
     * </p>
     * <p>
     * <b>Filter properties</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Condition</code> - The condition to apply. Valid values are <code>IS</code> and <code>IS_NOT</code>. To
     * include the forecasts that match the statement, specify <code>IS</code>. To exclude matching forecasts, specify
     * <code>IS_NOT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key</code> - The name of the parameter to filter on. Valid values are <code>DatasetGroupArn</code>,
     * <code>PredictorArn</code>, and <code>Status</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Value</code> - The value to match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, to list all forecasts whose status is not ACTIVE, you would specify:
     * </p>
     * <p>
     * <code>"Filters": [ { "Condition": "IS_NOT", "Key": "Status", "Value": "ACTIVE" } ]</code>
     * </p>
     * 
     * @return An array of filters. For each filter, you provide a condition and a match statement. The condition is
     *         either <code>IS</code> or <code>IS_NOT</code>, which specifies whether to include or exclude the
     *         forecasts that match the statement from the list, respectively. The match statement consists of a key and
     *         a value.</p>
     *         <p>
     *         <b>Filter properties</b>
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Condition</code> - The condition to apply. Valid values are <code>IS</code> and <code>IS_NOT</code>
     *         . To include the forecasts that match the statement, specify <code>IS</code>. To exclude matching
     *         forecasts, specify <code>IS_NOT</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Key</code> - The name of the parameter to filter on. Valid values are <code>DatasetGroupArn</code>,
     *         <code>PredictorArn</code>, and <code>Status</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Value</code> - The value to match.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For example, to list all forecasts whose status is not ACTIVE, you would specify:
     *         </p>
     *         <p>
     *         <code>"Filters": [ { "Condition": "IS_NOT", "Key": "Status", "Value": "ACTIVE" } ]</code>
     */

    public java.util.List<Filter> getFilters() {
        return filters;
    }

    /**
     * <p>
     * An array of filters. For each filter, you provide a condition and a match statement. The condition is either
     * <code>IS</code> or <code>IS_NOT</code>, which specifies whether to include or exclude the forecasts that match
     * the statement from the list, respectively. The match statement consists of a key and a value.
     * </p>
     * <p>
     * <b>Filter properties</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Condition</code> - The condition to apply. Valid values are <code>IS</code> and <code>IS_NOT</code>. To
     * include the forecasts that match the statement, specify <code>IS</code>. To exclude matching forecasts, specify
     * <code>IS_NOT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key</code> - The name of the parameter to filter on. Valid values are <code>DatasetGroupArn</code>,
     * <code>PredictorArn</code>, and <code>Status</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Value</code> - The value to match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, to list all forecasts whose status is not ACTIVE, you would specify:
     * </p>
     * <p>
     * <code>"Filters": [ { "Condition": "IS_NOT", "Key": "Status", "Value": "ACTIVE" } ]</code>
     * </p>
     * 
     * @param filters
     *        An array of filters. For each filter, you provide a condition and a match statement. The condition is
     *        either <code>IS</code> or <code>IS_NOT</code>, which specifies whether to include or exclude the forecasts
     *        that match the statement from the list, respectively. The match statement consists of a key and a
     *        value.</p>
     *        <p>
     *        <b>Filter properties</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Condition</code> - The condition to apply. Valid values are <code>IS</code> and <code>IS_NOT</code>.
     *        To include the forecasts that match the statement, specify <code>IS</code>. To exclude matching forecasts,
     *        specify <code>IS_NOT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key</code> - The name of the parameter to filter on. Valid values are <code>DatasetGroupArn</code>,
     *        <code>PredictorArn</code>, and <code>Status</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Value</code> - The value to match.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, to list all forecasts whose status is not ACTIVE, you would specify:
     *        </p>
     *        <p>
     *        <code>"Filters": [ { "Condition": "IS_NOT", "Key": "Status", "Value": "ACTIVE" } ]</code>
     */

    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }

        this.filters = new java.util.ArrayList<Filter>(filters);
    }

    /**
     * <p>
     * An array of filters. For each filter, you provide a condition and a match statement. The condition is either
     * <code>IS</code> or <code>IS_NOT</code>, which specifies whether to include or exclude the forecasts that match
     * the statement from the list, respectively. The match statement consists of a key and a value.
     * </p>
     * <p>
     * <b>Filter properties</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Condition</code> - The condition to apply. Valid values are <code>IS</code> and <code>IS_NOT</code>. To
     * include the forecasts that match the statement, specify <code>IS</code>. To exclude matching forecasts, specify
     * <code>IS_NOT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key</code> - The name of the parameter to filter on. Valid values are <code>DatasetGroupArn</code>,
     * <code>PredictorArn</code>, and <code>Status</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Value</code> - The value to match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, to list all forecasts whose status is not ACTIVE, you would specify:
     * </p>
     * <p>
     * <code>"Filters": [ { "Condition": "IS_NOT", "Key": "Status", "Value": "ACTIVE" } ]</code>
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilters(java.util.Collection)} or {@link #withFilters(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param filters
     *        An array of filters. For each filter, you provide a condition and a match statement. The condition is
     *        either <code>IS</code> or <code>IS_NOT</code>, which specifies whether to include or exclude the forecasts
     *        that match the statement from the list, respectively. The match statement consists of a key and a
     *        value.</p>
     *        <p>
     *        <b>Filter properties</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Condition</code> - The condition to apply. Valid values are <code>IS</code> and <code>IS_NOT</code>.
     *        To include the forecasts that match the statement, specify <code>IS</code>. To exclude matching forecasts,
     *        specify <code>IS_NOT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key</code> - The name of the parameter to filter on. Valid values are <code>DatasetGroupArn</code>,
     *        <code>PredictorArn</code>, and <code>Status</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Value</code> - The value to match.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, to list all forecasts whose status is not ACTIVE, you would specify:
     *        </p>
     *        <p>
     *        <code>"Filters": [ { "Condition": "IS_NOT", "Key": "Status", "Value": "ACTIVE" } ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListForecastsRequest withFilters(Filter... filters) {
        if (this.filters == null) {
            setFilters(new java.util.ArrayList<Filter>(filters.length));
        }
        for (Filter ele : filters) {
            this.filters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of filters. For each filter, you provide a condition and a match statement. The condition is either
     * <code>IS</code> or <code>IS_NOT</code>, which specifies whether to include or exclude the forecasts that match
     * the statement from the list, respectively. The match statement consists of a key and a value.
     * </p>
     * <p>
     * <b>Filter properties</b>
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Condition</code> - The condition to apply. Valid values are <code>IS</code> and <code>IS_NOT</code>. To
     * include the forecasts that match the statement, specify <code>IS</code>. To exclude matching forecasts, specify
     * <code>IS_NOT</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Key</code> - The name of the parameter to filter on. Valid values are <code>DatasetGroupArn</code>,
     * <code>PredictorArn</code>, and <code>Status</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Value</code> - The value to match.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For example, to list all forecasts whose status is not ACTIVE, you would specify:
     * </p>
     * <p>
     * <code>"Filters": [ { "Condition": "IS_NOT", "Key": "Status", "Value": "ACTIVE" } ]</code>
     * </p>
     * 
     * @param filters
     *        An array of filters. For each filter, you provide a condition and a match statement. The condition is
     *        either <code>IS</code> or <code>IS_NOT</code>, which specifies whether to include or exclude the forecasts
     *        that match the statement from the list, respectively. The match statement consists of a key and a
     *        value.</p>
     *        <p>
     *        <b>Filter properties</b>
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Condition</code> - The condition to apply. Valid values are <code>IS</code> and <code>IS_NOT</code>.
     *        To include the forecasts that match the statement, specify <code>IS</code>. To exclude matching forecasts,
     *        specify <code>IS_NOT</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Key</code> - The name of the parameter to filter on. Valid values are <code>DatasetGroupArn</code>,
     *        <code>PredictorArn</code>, and <code>Status</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Value</code> - The value to match.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For example, to list all forecasts whose status is not ACTIVE, you would specify:
     *        </p>
     *        <p>
     *        <code>"Filters": [ { "Condition": "IS_NOT", "Key": "Status", "Value": "ACTIVE" } ]</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListForecastsRequest withFilters(java.util.Collection<Filter> filters) {
        setFilters(filters);
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
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListForecastsRequest == false)
            return false;
        ListForecastsRequest other = (ListForecastsRequest) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public ListForecastsRequest clone() {
        return (ListForecastsRequest) super.clone();
    }

}
