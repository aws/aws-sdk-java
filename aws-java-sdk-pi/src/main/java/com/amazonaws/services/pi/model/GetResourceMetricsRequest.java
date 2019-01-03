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
package com.amazonaws.services.pi.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/GetResourceMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetResourceMetricsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The AWS service for which Performance Insights will return metrics. The only valid value for <i>ServiceType</i>
     * is: <code>RDS</code>
     * </p>
     */
    private String serviceType;
    /**
     * <p>
     * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data
     * source.
     * </p>
     * <p>
     * To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value - for example:
     * <code>db-FAIHNTYBKTGAUSUZQYPDS2GW4A</code>
     * </p>
     */
    private String identifier;
    /**
     * <p>
     * An array of one or more queries to perform. Each query must specify a Performance Insights metric, and can
     * optionally specify aggregation and filtering criteria.
     * </p>
     */
    private java.util.List<MetricQuery> metricQueries;
    /**
     * <p>
     * The date and time specifying the beginning of the requested time series data. You can't specify a
     * <code>StartTime</code> that's earlier than 7 days ago. The value specified is <i>inclusive</i> - data points
     * equal to or greater than <code>StartTime</code> will be returned.
     * </p>
     * <p>
     * The value for <code>StartTime</code> must be earlier than the value for <code>EndTime</code>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The date and time specifiying the end of the requested time series data. The value specified is <i>exclusive</i>
     * - data points less than (but not equal to) <code>EndTime</code> will be returned.
     * </p>
     * <p>
     * The value for <code>EndTime</code> must be later than the value for <code>StartTime</code>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The granularity, in seconds, of the data points returned from Performance Insights. A period can be as short as
     * one second, or as long as one day (86400 seconds). Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1</code> (one second)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>60</code> (one minute)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>300</code> (five minutes)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3600</code> (one hour)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>86400</code> (twenty-four hours)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>PeriodInSeconds</code>, then Performance Insights will choose a value for you, with a
     * goal of returning roughly 100-200 data points in the response.
     * </p>
     */
    private Integer periodInSeconds;
    /**
     * <p>
     * The maximum number of items to return in the response. If more items exist than the specified
     * <code>MaxRecords</code> value, a pagination token is included in the response so that the remaining results can
     * be retrieved.
     * </p>
     */
    private Integer maxResults;
    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The AWS service for which Performance Insights will return metrics. The only valid value for <i>ServiceType</i>
     * is: <code>RDS</code>
     * </p>
     * 
     * @param serviceType
     *        The AWS service for which Performance Insights will return metrics. The only valid value for
     *        <i>ServiceType</i> is: <code>RDS</code>
     * @see ServiceType
     */

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    /**
     * <p>
     * The AWS service for which Performance Insights will return metrics. The only valid value for <i>ServiceType</i>
     * is: <code>RDS</code>
     * </p>
     * 
     * @return The AWS service for which Performance Insights will return metrics. The only valid value for
     *         <i>ServiceType</i> is: <code>RDS</code>
     * @see ServiceType
     */

    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * <p>
     * The AWS service for which Performance Insights will return metrics. The only valid value for <i>ServiceType</i>
     * is: <code>RDS</code>
     * </p>
     * 
     * @param serviceType
     *        The AWS service for which Performance Insights will return metrics. The only valid value for
     *        <i>ServiceType</i> is: <code>RDS</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public GetResourceMetricsRequest withServiceType(String serviceType) {
        setServiceType(serviceType);
        return this;
    }

    /**
     * <p>
     * The AWS service for which Performance Insights will return metrics. The only valid value for <i>ServiceType</i>
     * is: <code>RDS</code>
     * </p>
     * 
     * @param serviceType
     *        The AWS service for which Performance Insights will return metrics. The only valid value for
     *        <i>ServiceType</i> is: <code>RDS</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ServiceType
     */

    public GetResourceMetricsRequest withServiceType(ServiceType serviceType) {
        this.serviceType = serviceType.toString();
        return this;
    }

    /**
     * <p>
     * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data
     * source.
     * </p>
     * <p>
     * To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value - for example:
     * <code>db-FAIHNTYBKTGAUSUZQYPDS2GW4A</code>
     * </p>
     * 
     * @param identifier
     *        An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from
     *        this data source.</p>
     *        <p>
     *        To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value - for
     *        example: <code>db-FAIHNTYBKTGAUSUZQYPDS2GW4A</code>
     */

    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * <p>
     * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data
     * source.
     * </p>
     * <p>
     * To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value - for example:
     * <code>db-FAIHNTYBKTGAUSUZQYPDS2GW4A</code>
     * </p>
     * 
     * @return An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from
     *         this data source.</p>
     *         <p>
     *         To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value - for
     *         example: <code>db-FAIHNTYBKTGAUSUZQYPDS2GW4A</code>
     */

    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * <p>
     * An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from this data
     * source.
     * </p>
     * <p>
     * To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value - for example:
     * <code>db-FAIHNTYBKTGAUSUZQYPDS2GW4A</code>
     * </p>
     * 
     * @param identifier
     *        An immutable, AWS Region-unique identifier for a data source. Performance Insights gathers metrics from
     *        this data source.</p>
     *        <p>
     *        To use an Amazon RDS instance as a data source, you specify its <code>DbiResourceId</code> value - for
     *        example: <code>db-FAIHNTYBKTGAUSUZQYPDS2GW4A</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetricsRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
        return this;
    }

    /**
     * <p>
     * An array of one or more queries to perform. Each query must specify a Performance Insights metric, and can
     * optionally specify aggregation and filtering criteria.
     * </p>
     * 
     * @return An array of one or more queries to perform. Each query must specify a Performance Insights metric, and
     *         can optionally specify aggregation and filtering criteria.
     */

    public java.util.List<MetricQuery> getMetricQueries() {
        return metricQueries;
    }

    /**
     * <p>
     * An array of one or more queries to perform. Each query must specify a Performance Insights metric, and can
     * optionally specify aggregation and filtering criteria.
     * </p>
     * 
     * @param metricQueries
     *        An array of one or more queries to perform. Each query must specify a Performance Insights metric, and can
     *        optionally specify aggregation and filtering criteria.
     */

    public void setMetricQueries(java.util.Collection<MetricQuery> metricQueries) {
        if (metricQueries == null) {
            this.metricQueries = null;
            return;
        }

        this.metricQueries = new java.util.ArrayList<MetricQuery>(metricQueries);
    }

    /**
     * <p>
     * An array of one or more queries to perform. Each query must specify a Performance Insights metric, and can
     * optionally specify aggregation and filtering criteria.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setMetricQueries(java.util.Collection)} or {@link #withMetricQueries(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param metricQueries
     *        An array of one or more queries to perform. Each query must specify a Performance Insights metric, and can
     *        optionally specify aggregation and filtering criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetricsRequest withMetricQueries(MetricQuery... metricQueries) {
        if (this.metricQueries == null) {
            setMetricQueries(new java.util.ArrayList<MetricQuery>(metricQueries.length));
        }
        for (MetricQuery ele : metricQueries) {
            this.metricQueries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of one or more queries to perform. Each query must specify a Performance Insights metric, and can
     * optionally specify aggregation and filtering criteria.
     * </p>
     * 
     * @param metricQueries
     *        An array of one or more queries to perform. Each query must specify a Performance Insights metric, and can
     *        optionally specify aggregation and filtering criteria.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetricsRequest withMetricQueries(java.util.Collection<MetricQuery> metricQueries) {
        setMetricQueries(metricQueries);
        return this;
    }

    /**
     * <p>
     * The date and time specifying the beginning of the requested time series data. You can't specify a
     * <code>StartTime</code> that's earlier than 7 days ago. The value specified is <i>inclusive</i> - data points
     * equal to or greater than <code>StartTime</code> will be returned.
     * </p>
     * <p>
     * The value for <code>StartTime</code> must be earlier than the value for <code>EndTime</code>.
     * </p>
     * 
     * @param startTime
     *        The date and time specifying the beginning of the requested time series data. You can't specify a
     *        <code>StartTime</code> that's earlier than 7 days ago. The value specified is <i>inclusive</i> - data
     *        points equal to or greater than <code>StartTime</code> will be returned.</p>
     *        <p>
     *        The value for <code>StartTime</code> must be earlier than the value for <code>EndTime</code>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The date and time specifying the beginning of the requested time series data. You can't specify a
     * <code>StartTime</code> that's earlier than 7 days ago. The value specified is <i>inclusive</i> - data points
     * equal to or greater than <code>StartTime</code> will be returned.
     * </p>
     * <p>
     * The value for <code>StartTime</code> must be earlier than the value for <code>EndTime</code>.
     * </p>
     * 
     * @return The date and time specifying the beginning of the requested time series data. You can't specify a
     *         <code>StartTime</code> that's earlier than 7 days ago. The value specified is <i>inclusive</i> - data
     *         points equal to or greater than <code>StartTime</code> will be returned.</p>
     *         <p>
     *         The value for <code>StartTime</code> must be earlier than the value for <code>EndTime</code>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The date and time specifying the beginning of the requested time series data. You can't specify a
     * <code>StartTime</code> that's earlier than 7 days ago. The value specified is <i>inclusive</i> - data points
     * equal to or greater than <code>StartTime</code> will be returned.
     * </p>
     * <p>
     * The value for <code>StartTime</code> must be earlier than the value for <code>EndTime</code>.
     * </p>
     * 
     * @param startTime
     *        The date and time specifying the beginning of the requested time series data. You can't specify a
     *        <code>StartTime</code> that's earlier than 7 days ago. The value specified is <i>inclusive</i> - data
     *        points equal to or greater than <code>StartTime</code> will be returned.</p>
     *        <p>
     *        The value for <code>StartTime</code> must be earlier than the value for <code>EndTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetricsRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time specifiying the end of the requested time series data. The value specified is <i>exclusive</i>
     * - data points less than (but not equal to) <code>EndTime</code> will be returned.
     * </p>
     * <p>
     * The value for <code>EndTime</code> must be later than the value for <code>StartTime</code>.
     * </p>
     * 
     * @param endTime
     *        The date and time specifiying the end of the requested time series data. The value specified is
     *        <i>exclusive</i> - data points less than (but not equal to) <code>EndTime</code> will be returned.</p>
     *        <p>
     *        The value for <code>EndTime</code> must be later than the value for <code>StartTime</code>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time specifiying the end of the requested time series data. The value specified is <i>exclusive</i>
     * - data points less than (but not equal to) <code>EndTime</code> will be returned.
     * </p>
     * <p>
     * The value for <code>EndTime</code> must be later than the value for <code>StartTime</code>.
     * </p>
     * 
     * @return The date and time specifiying the end of the requested time series data. The value specified is
     *         <i>exclusive</i> - data points less than (but not equal to) <code>EndTime</code> will be returned.</p>
     *         <p>
     *         The value for <code>EndTime</code> must be later than the value for <code>StartTime</code>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time specifiying the end of the requested time series data. The value specified is <i>exclusive</i>
     * - data points less than (but not equal to) <code>EndTime</code> will be returned.
     * </p>
     * <p>
     * The value for <code>EndTime</code> must be later than the value for <code>StartTime</code>.
     * </p>
     * 
     * @param endTime
     *        The date and time specifiying the end of the requested time series data. The value specified is
     *        <i>exclusive</i> - data points less than (but not equal to) <code>EndTime</code> will be returned.</p>
     *        <p>
     *        The value for <code>EndTime</code> must be later than the value for <code>StartTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetricsRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The granularity, in seconds, of the data points returned from Performance Insights. A period can be as short as
     * one second, or as long as one day (86400 seconds). Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1</code> (one second)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>60</code> (one minute)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>300</code> (five minutes)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3600</code> (one hour)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>86400</code> (twenty-four hours)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>PeriodInSeconds</code>, then Performance Insights will choose a value for you, with a
     * goal of returning roughly 100-200 data points in the response.
     * </p>
     * 
     * @param periodInSeconds
     *        The granularity, in seconds, of the data points returned from Performance Insights. A period can be as
     *        short as one second, or as long as one day (86400 seconds). Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>1</code> (one second)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>60</code> (one minute)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>300</code> (five minutes)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>3600</code> (one hour)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>86400</code> (twenty-four hours)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify <code>PeriodInSeconds</code>, then Performance Insights will choose a value for you,
     *        with a goal of returning roughly 100-200 data points in the response.
     */

    public void setPeriodInSeconds(Integer periodInSeconds) {
        this.periodInSeconds = periodInSeconds;
    }

    /**
     * <p>
     * The granularity, in seconds, of the data points returned from Performance Insights. A period can be as short as
     * one second, or as long as one day (86400 seconds). Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1</code> (one second)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>60</code> (one minute)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>300</code> (five minutes)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3600</code> (one hour)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>86400</code> (twenty-four hours)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>PeriodInSeconds</code>, then Performance Insights will choose a value for you, with a
     * goal of returning roughly 100-200 data points in the response.
     * </p>
     * 
     * @return The granularity, in seconds, of the data points returned from Performance Insights. A period can be as
     *         short as one second, or as long as one day (86400 seconds). Valid values are:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>1</code> (one second)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>60</code> (one minute)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>300</code> (five minutes)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>3600</code> (one hour)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>86400</code> (twenty-four hours)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         If you don't specify <code>PeriodInSeconds</code>, then Performance Insights will choose a value for you,
     *         with a goal of returning roughly 100-200 data points in the response.
     */

    public Integer getPeriodInSeconds() {
        return this.periodInSeconds;
    }

    /**
     * <p>
     * The granularity, in seconds, of the data points returned from Performance Insights. A period can be as short as
     * one second, or as long as one day (86400 seconds). Valid values are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>1</code> (one second)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>60</code> (one minute)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>300</code> (five minutes)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>3600</code> (one hour)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>86400</code> (twenty-four hours)
     * </p>
     * </li>
     * </ul>
     * <p>
     * If you don't specify <code>PeriodInSeconds</code>, then Performance Insights will choose a value for you, with a
     * goal of returning roughly 100-200 data points in the response.
     * </p>
     * 
     * @param periodInSeconds
     *        The granularity, in seconds, of the data points returned from Performance Insights. A period can be as
     *        short as one second, or as long as one day (86400 seconds). Valid values are:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>1</code> (one second)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>60</code> (one minute)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>300</code> (five minutes)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>3600</code> (one hour)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>86400</code> (twenty-four hours)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        If you don't specify <code>PeriodInSeconds</code>, then Performance Insights will choose a value for you,
     *        with a goal of returning roughly 100-200 data points in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetricsRequest withPeriodInSeconds(Integer periodInSeconds) {
        setPeriodInSeconds(periodInSeconds);
        return this;
    }

    /**
     * <p>
     * The maximum number of items to return in the response. If more items exist than the specified
     * <code>MaxRecords</code> value, a pagination token is included in the response so that the remaining results can
     * be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return in the response. If more items exist than the specified
     *        <code>MaxRecords</code> value, a pagination token is included in the response so that the remaining
     *        results can be retrieved.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in the response. If more items exist than the specified
     * <code>MaxRecords</code> value, a pagination token is included in the response so that the remaining results can
     * be retrieved.
     * </p>
     * 
     * @return The maximum number of items to return in the response. If more items exist than the specified
     *         <code>MaxRecords</code> value, a pagination token is included in the response so that the remaining
     *         results can be retrieved.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of items to return in the response. If more items exist than the specified
     * <code>MaxRecords</code> value, a pagination token is included in the response so that the remaining results can
     * be retrieved.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of items to return in the response. If more items exist than the specified
     *        <code>MaxRecords</code> value, a pagination token is included in the response so that the remaining
     *        results can be retrieved.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetricsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param nextToken
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @return An optional pagination token provided by a previous request. If this parameter is specified, the response
     *         includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * An optional pagination token provided by a previous request. If this parameter is specified, the response
     * includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * </p>
     * 
     * @param nextToken
     *        An optional pagination token provided by a previous request. If this parameter is specified, the response
     *        includes only records beyond the token, up to the value specified by <code>MaxRecords</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetResourceMetricsRequest withNextToken(String nextToken) {
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
        if (getServiceType() != null)
            sb.append("ServiceType: ").append(getServiceType()).append(",");
        if (getIdentifier() != null)
            sb.append("Identifier: ").append(getIdentifier()).append(",");
        if (getMetricQueries() != null)
            sb.append("MetricQueries: ").append(getMetricQueries()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getPeriodInSeconds() != null)
            sb.append("PeriodInSeconds: ").append(getPeriodInSeconds()).append(",");
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

        if (obj instanceof GetResourceMetricsRequest == false)
            return false;
        GetResourceMetricsRequest other = (GetResourceMetricsRequest) obj;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getMetricQueries() == null ^ this.getMetricQueries() == null)
            return false;
        if (other.getMetricQueries() != null && other.getMetricQueries().equals(this.getMetricQueries()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getPeriodInSeconds() == null ^ this.getPeriodInSeconds() == null)
            return false;
        if (other.getPeriodInSeconds() != null && other.getPeriodInSeconds().equals(this.getPeriodInSeconds()) == false)
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

        hashCode = prime * hashCode + ((getServiceType() == null) ? 0 : getServiceType().hashCode());
        hashCode = prime * hashCode + ((getIdentifier() == null) ? 0 : getIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMetricQueries() == null) ? 0 : getMetricQueries().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getPeriodInSeconds() == null) ? 0 : getPeriodInSeconds().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public GetResourceMetricsRequest clone() {
        return (GetResourceMetricsRequest) super.clone();
    }

}
