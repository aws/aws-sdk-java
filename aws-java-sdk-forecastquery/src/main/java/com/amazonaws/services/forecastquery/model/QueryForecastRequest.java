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
package com.amazonaws.services.forecastquery.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/forecastquery-2018-06-26/QueryForecast" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class QueryForecastRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast to query.
     * </p>
     */
    private String forecastArn;
    /**
     * <p>
     * The start date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601 format)
     * For example, "1970-01-01T00:00:00Z."
     * </p>
     */
    private String startDate;
    /**
     * <p>
     * The end date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601 format).
     * For example, "1970-01-01T00:00:00Z."
     * </p>
     */
    private String endDate;
    /**
     * <p>
     * The filtering criteria to apply when retrieving the forecast. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get a forecast for a specific item specify the following:
     * </p>
     * <p>
     * <code>{"item_id" : "client_1"}</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * To get a forecast for a specific item sold in a specific location, specify the following:
     * </p>
     * <p>
     * <code>{"item_id" : "client_1", "location" : "ny"}</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * To get a forecast for all blue items sold in a specific location, specify the following:
     * </p>
     * <p>
     * <code>{ "location" : "ny", "color":"blue"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the full forecast, use the operation.
     * </p>
     */
    private java.util.Map<String, String> filters;
    /**
     * <p>
     * If the result of the previous request was truncated, the response includes a <code>NextToken</code>. To retrieve
     * the next set of results, use the token in the next request. Tokens expire after 24 hours.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast to query.
     * </p>
     * 
     * @param forecastArn
     *        The Amazon Resource Name (ARN) of the forecast to query.
     */

    public void setForecastArn(String forecastArn) {
        this.forecastArn = forecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast to query.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the forecast to query.
     */

    public String getForecastArn() {
        return this.forecastArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the forecast to query.
     * </p>
     * 
     * @param forecastArn
     *        The Amazon Resource Name (ARN) of the forecast to query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryForecastRequest withForecastArn(String forecastArn) {
        setForecastArn(forecastArn);
        return this;
    }

    /**
     * <p>
     * The start date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601 format)
     * For example, "1970-01-01T00:00:00Z."
     * </p>
     * 
     * @param startDate
     *        The start date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601
     *        format) For example, "1970-01-01T00:00:00Z."
     */

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The start date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601 format)
     * For example, "1970-01-01T00:00:00Z."
     * </p>
     * 
     * @return The start date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601
     *         format) For example, "1970-01-01T00:00:00Z."
     */

    public String getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The start date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601 format)
     * For example, "1970-01-01T00:00:00Z."
     * </p>
     * 
     * @param startDate
     *        The start date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601
     *        format) For example, "1970-01-01T00:00:00Z."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryForecastRequest withStartDate(String startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * The end date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601 format).
     * For example, "1970-01-01T00:00:00Z."
     * </p>
     * 
     * @param endDate
     *        The end date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601
     *        format). For example, "1970-01-01T00:00:00Z."
     */

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * <p>
     * The end date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601 format).
     * For example, "1970-01-01T00:00:00Z."
     * </p>
     * 
     * @return The end date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601
     *         format). For example, "1970-01-01T00:00:00Z."
     */

    public String getEndDate() {
        return this.endDate;
    }

    /**
     * <p>
     * The end date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601 format).
     * For example, "1970-01-01T00:00:00Z."
     * </p>
     * 
     * @param endDate
     *        The end date for the forecast. Specify the date using this format: yyyy-MM-dd'T'HH:mm:ss'Z' (ISO 8601
     *        format). For example, "1970-01-01T00:00:00Z."
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryForecastRequest withEndDate(String endDate) {
        setEndDate(endDate);
        return this;
    }

    /**
     * <p>
     * The filtering criteria to apply when retrieving the forecast. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get a forecast for a specific item specify the following:
     * </p>
     * <p>
     * <code>{"item_id" : "client_1"}</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * To get a forecast for a specific item sold in a specific location, specify the following:
     * </p>
     * <p>
     * <code>{"item_id" : "client_1", "location" : "ny"}</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * To get a forecast for all blue items sold in a specific location, specify the following:
     * </p>
     * <p>
     * <code>{ "location" : "ny", "color":"blue"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the full forecast, use the operation.
     * </p>
     * 
     * @return The filtering criteria to apply when retrieving the forecast. For example:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         To get a forecast for a specific item specify the following:
     *         </p>
     *         <p>
     *         <code>{"item_id" : "client_1"}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         To get a forecast for a specific item sold in a specific location, specify the following:
     *         </p>
     *         <p>
     *         <code>{"item_id" : "client_1", "location" : "ny"}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <ul>
     *         <li>
     *         <p>
     *         To get a forecast for all blue items sold in a specific location, specify the following:
     *         </p>
     *         <p>
     *         <code>{ "location" : "ny", "color":"blue"}</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To get the full forecast, use the operation.
     */

    public java.util.Map<String, String> getFilters() {
        return filters;
    }

    /**
     * <p>
     * The filtering criteria to apply when retrieving the forecast. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get a forecast for a specific item specify the following:
     * </p>
     * <p>
     * <code>{"item_id" : "client_1"}</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * To get a forecast for a specific item sold in a specific location, specify the following:
     * </p>
     * <p>
     * <code>{"item_id" : "client_1", "location" : "ny"}</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * To get a forecast for all blue items sold in a specific location, specify the following:
     * </p>
     * <p>
     * <code>{ "location" : "ny", "color":"blue"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the full forecast, use the operation.
     * </p>
     * 
     * @param filters
     *        The filtering criteria to apply when retrieving the forecast. For example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To get a forecast for a specific item specify the following:
     *        </p>
     *        <p>
     *        <code>{"item_id" : "client_1"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        To get a forecast for a specific item sold in a specific location, specify the following:
     *        </p>
     *        <p>
     *        <code>{"item_id" : "client_1", "location" : "ny"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        To get a forecast for all blue items sold in a specific location, specify the following:
     *        </p>
     *        <p>
     *        <code>{ "location" : "ny", "color":"blue"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the full forecast, use the operation.
     */

    public void setFilters(java.util.Map<String, String> filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * The filtering criteria to apply when retrieving the forecast. For example:
     * </p>
     * <ul>
     * <li>
     * <p>
     * To get a forecast for a specific item specify the following:
     * </p>
     * <p>
     * <code>{"item_id" : "client_1"}</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * To get a forecast for a specific item sold in a specific location, specify the following:
     * </p>
     * <p>
     * <code>{"item_id" : "client_1", "location" : "ny"}</code>
     * </p>
     * </li>
     * </ul>
     * <ul>
     * <li>
     * <p>
     * To get a forecast for all blue items sold in a specific location, specify the following:
     * </p>
     * <p>
     * <code>{ "location" : "ny", "color":"blue"}</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * To get the full forecast, use the operation.
     * </p>
     * 
     * @param filters
     *        The filtering criteria to apply when retrieving the forecast. For example:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        To get a forecast for a specific item specify the following:
     *        </p>
     *        <p>
     *        <code>{"item_id" : "client_1"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        To get a forecast for a specific item sold in a specific location, specify the following:
     *        </p>
     *        <p>
     *        <code>{"item_id" : "client_1", "location" : "ny"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <ul>
     *        <li>
     *        <p>
     *        To get a forecast for all blue items sold in a specific location, specify the following:
     *        </p>
     *        <p>
     *        <code>{ "location" : "ny", "color":"blue"}</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To get the full forecast, use the operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryForecastRequest withFilters(java.util.Map<String, String> filters) {
        setFilters(filters);
        return this;
    }

    public QueryForecastRequest addFiltersEntry(String key, String value) {
        if (null == this.filters) {
            this.filters = new java.util.HashMap<String, String>();
        }
        if (this.filters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public QueryForecastRequest clearFiltersEntries() {
        this.filters = null;
        return this;
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

    public QueryForecastRequest withNextToken(String nextToken) {
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
        if (getForecastArn() != null)
            sb.append("ForecastArn: ").append(getForecastArn()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getEndDate() != null)
            sb.append("EndDate: ").append(getEndDate()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters()).append(",");
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

        if (obj instanceof QueryForecastRequest == false)
            return false;
        QueryForecastRequest other = (QueryForecastRequest) obj;
        if (other.getForecastArn() == null ^ this.getForecastArn() == null)
            return false;
        if (other.getForecastArn() != null && other.getForecastArn().equals(this.getForecastArn()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getEndDate() == null ^ this.getEndDate() == null)
            return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
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

        hashCode = prime * hashCode + ((getForecastArn() == null) ? 0 : getForecastArn().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public QueryForecastRequest clone() {
        return (QueryForecastRequest) super.clone();
    }

}
