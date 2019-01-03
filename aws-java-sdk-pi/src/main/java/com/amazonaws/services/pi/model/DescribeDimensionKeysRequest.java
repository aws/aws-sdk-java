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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pi-2018-02-27/DescribeDimensionKeys" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeDimensionKeysRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

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
     * The date and time specifying the end of the requested time series data. The value specified is <i>exclusive</i> -
     * data points less than (but not equal to) <code>EndTime</code> will be returned.
     * </p>
     * <p>
     * The value for <code>EndTime</code> must be later than the value for <code>StartTime</code>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The name of a Performance Insights metric to be measured.
     * </p>
     * <p>
     * Valid values for <code>Metric</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     * </p>
     * </li>
     * </ul>
     */
    private String metric;
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
     * A specification for how to aggregate the data points from a query result. You must specify a valid dimension
     * group. Performance Insights will return all of the dimensions within that group, unless you provide the names of
     * specific dimensions within that group. You can also request that Performance Insights return a limited number of
     * values for a dimension.
     * </p>
     */
    private DimensionGroup groupBy;
    /**
     * <p>
     * For each dimension specified in <code>GroupBy</code>, specify a secondary dimension to further subdivide the
     * partition keys in the response.
     * </p>
     */
    private DimensionGroup partitionBy;
    /**
     * <p>
     * One or more filters to apply in the request. Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any number of filters by the same dimension, as specified in the <code>GroupBy</code> or <code>Partition</code>
     * parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * A single filter for any other dimension in this dimension group.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, String> filter;
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

    public DescribeDimensionKeysRequest withServiceType(String serviceType) {
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

    public DescribeDimensionKeysRequest withServiceType(ServiceType serviceType) {
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

    public DescribeDimensionKeysRequest withIdentifier(String identifier) {
        setIdentifier(identifier);
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

    public DescribeDimensionKeysRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The date and time specifying the end of the requested time series data. The value specified is <i>exclusive</i> -
     * data points less than (but not equal to) <code>EndTime</code> will be returned.
     * </p>
     * <p>
     * The value for <code>EndTime</code> must be later than the value for <code>StartTime</code>.
     * </p>
     * 
     * @param endTime
     *        The date and time specifying the end of the requested time series data. The value specified is
     *        <i>exclusive</i> - data points less than (but not equal to) <code>EndTime</code> will be returned.</p>
     *        <p>
     *        The value for <code>EndTime</code> must be later than the value for <code>StartTime</code>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The date and time specifying the end of the requested time series data. The value specified is <i>exclusive</i> -
     * data points less than (but not equal to) <code>EndTime</code> will be returned.
     * </p>
     * <p>
     * The value for <code>EndTime</code> must be later than the value for <code>StartTime</code>.
     * </p>
     * 
     * @return The date and time specifying the end of the requested time series data. The value specified is
     *         <i>exclusive</i> - data points less than (but not equal to) <code>EndTime</code> will be returned.</p>
     *         <p>
     *         The value for <code>EndTime</code> must be later than the value for <code>StartTime</code>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The date and time specifying the end of the requested time series data. The value specified is <i>exclusive</i> -
     * data points less than (but not equal to) <code>EndTime</code> will be returned.
     * </p>
     * <p>
     * The value for <code>EndTime</code> must be later than the value for <code>StartTime</code>.
     * </p>
     * 
     * @param endTime
     *        The date and time specifying the end of the requested time series data. The value specified is
     *        <i>exclusive</i> - data points less than (but not equal to) <code>EndTime</code> will be returned.</p>
     *        <p>
     *        The value for <code>EndTime</code> must be later than the value for <code>StartTime</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionKeysRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The name of a Performance Insights metric to be measured.
     * </p>
     * <p>
     * Valid values for <code>Metric</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        The name of a Performance Insights metric to be measured.</p>
     *        <p>
     *        Valid values for <code>Metric</code> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database
     *        engine.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     *        </p>
     *        </li>
     */

    public void setMetric(String metric) {
        this.metric = metric;
    }

    /**
     * <p>
     * The name of a Performance Insights metric to be measured.
     * </p>
     * <p>
     * Valid values for <code>Metric</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of a Performance Insights metric to be measured.</p>
     *         <p>
     *         Valid values for <code>Metric</code> are:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database
     *         engine.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     *         </p>
     *         </li>
     */

    public String getMetric() {
        return this.metric;
    }

    /**
     * <p>
     * The name of a Performance Insights metric to be measured.
     * </p>
     * <p>
     * Valid values for <code>Metric</code> are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database engine.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metric
     *        The name of a Performance Insights metric to be measured.</p>
     *        <p>
     *        Valid values for <code>Metric</code> are:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>db.load.avg</code> - a scaled representation of the number of active sessions for the database
     *        engine.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>db.sampledload.avg</code> - the raw number of active sessions for the database engine.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionKeysRequest withMetric(String metric) {
        setMetric(metric);
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

    public DescribeDimensionKeysRequest withPeriodInSeconds(Integer periodInSeconds) {
        setPeriodInSeconds(periodInSeconds);
        return this;
    }

    /**
     * <p>
     * A specification for how to aggregate the data points from a query result. You must specify a valid dimension
     * group. Performance Insights will return all of the dimensions within that group, unless you provide the names of
     * specific dimensions within that group. You can also request that Performance Insights return a limited number of
     * values for a dimension.
     * </p>
     * 
     * @param groupBy
     *        A specification for how to aggregate the data points from a query result. You must specify a valid
     *        dimension group. Performance Insights will return all of the dimensions within that group, unless you
     *        provide the names of specific dimensions within that group. You can also request that Performance Insights
     *        return a limited number of values for a dimension.
     */

    public void setGroupBy(DimensionGroup groupBy) {
        this.groupBy = groupBy;
    }

    /**
     * <p>
     * A specification for how to aggregate the data points from a query result. You must specify a valid dimension
     * group. Performance Insights will return all of the dimensions within that group, unless you provide the names of
     * specific dimensions within that group. You can also request that Performance Insights return a limited number of
     * values for a dimension.
     * </p>
     * 
     * @return A specification for how to aggregate the data points from a query result. You must specify a valid
     *         dimension group. Performance Insights will return all of the dimensions within that group, unless you
     *         provide the names of specific dimensions within that group. You can also request that Performance
     *         Insights return a limited number of values for a dimension.
     */

    public DimensionGroup getGroupBy() {
        return this.groupBy;
    }

    /**
     * <p>
     * A specification for how to aggregate the data points from a query result. You must specify a valid dimension
     * group. Performance Insights will return all of the dimensions within that group, unless you provide the names of
     * specific dimensions within that group. You can also request that Performance Insights return a limited number of
     * values for a dimension.
     * </p>
     * 
     * @param groupBy
     *        A specification for how to aggregate the data points from a query result. You must specify a valid
     *        dimension group. Performance Insights will return all of the dimensions within that group, unless you
     *        provide the names of specific dimensions within that group. You can also request that Performance Insights
     *        return a limited number of values for a dimension.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionKeysRequest withGroupBy(DimensionGroup groupBy) {
        setGroupBy(groupBy);
        return this;
    }

    /**
     * <p>
     * For each dimension specified in <code>GroupBy</code>, specify a secondary dimension to further subdivide the
     * partition keys in the response.
     * </p>
     * 
     * @param partitionBy
     *        For each dimension specified in <code>GroupBy</code>, specify a secondary dimension to further subdivide
     *        the partition keys in the response.
     */

    public void setPartitionBy(DimensionGroup partitionBy) {
        this.partitionBy = partitionBy;
    }

    /**
     * <p>
     * For each dimension specified in <code>GroupBy</code>, specify a secondary dimension to further subdivide the
     * partition keys in the response.
     * </p>
     * 
     * @return For each dimension specified in <code>GroupBy</code>, specify a secondary dimension to further subdivide
     *         the partition keys in the response.
     */

    public DimensionGroup getPartitionBy() {
        return this.partitionBy;
    }

    /**
     * <p>
     * For each dimension specified in <code>GroupBy</code>, specify a secondary dimension to further subdivide the
     * partition keys in the response.
     * </p>
     * 
     * @param partitionBy
     *        For each dimension specified in <code>GroupBy</code>, specify a secondary dimension to further subdivide
     *        the partition keys in the response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionKeysRequest withPartitionBy(DimensionGroup partitionBy) {
        setPartitionBy(partitionBy);
        return this;
    }

    /**
     * <p>
     * One or more filters to apply in the request. Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any number of filters by the same dimension, as specified in the <code>GroupBy</code> or <code>Partition</code>
     * parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * A single filter for any other dimension in this dimension group.
     * </p>
     * </li>
     * </ul>
     * 
     * @return One or more filters to apply in the request. Restrictions:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         Any number of filters by the same dimension, as specified in the <code>GroupBy</code> or
     *         <code>Partition</code> parameters.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         A single filter for any other dimension in this dimension group.
     *         </p>
     *         </li>
     */

    public java.util.Map<String, String> getFilter() {
        return filter;
    }

    /**
     * <p>
     * One or more filters to apply in the request. Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any number of filters by the same dimension, as specified in the <code>GroupBy</code> or <code>Partition</code>
     * parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * A single filter for any other dimension in this dimension group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        One or more filters to apply in the request. Restrictions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any number of filters by the same dimension, as specified in the <code>GroupBy</code> or
     *        <code>Partition</code> parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A single filter for any other dimension in this dimension group.
     *        </p>
     *        </li>
     */

    public void setFilter(java.util.Map<String, String> filter) {
        this.filter = filter;
    }

    /**
     * <p>
     * One or more filters to apply in the request. Restrictions:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Any number of filters by the same dimension, as specified in the <code>GroupBy</code> or <code>Partition</code>
     * parameters.
     * </p>
     * </li>
     * <li>
     * <p>
     * A single filter for any other dimension in this dimension group.
     * </p>
     * </li>
     * </ul>
     * 
     * @param filter
     *        One or more filters to apply in the request. Restrictions:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        Any number of filters by the same dimension, as specified in the <code>GroupBy</code> or
     *        <code>Partition</code> parameters.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        A single filter for any other dimension in this dimension group.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionKeysRequest withFilter(java.util.Map<String, String> filter) {
        setFilter(filter);
        return this;
    }

    public DescribeDimensionKeysRequest addFilterEntry(String key, String value) {
        if (null == this.filter) {
            this.filter = new java.util.HashMap<String, String>();
        }
        if (this.filter.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filter.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filter.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeDimensionKeysRequest clearFilterEntries() {
        this.filter = null;
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

    public DescribeDimensionKeysRequest withMaxResults(Integer maxResults) {
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

    public DescribeDimensionKeysRequest withNextToken(String nextToken) {
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getMetric() != null)
            sb.append("Metric: ").append(getMetric()).append(",");
        if (getPeriodInSeconds() != null)
            sb.append("PeriodInSeconds: ").append(getPeriodInSeconds()).append(",");
        if (getGroupBy() != null)
            sb.append("GroupBy: ").append(getGroupBy()).append(",");
        if (getPartitionBy() != null)
            sb.append("PartitionBy: ").append(getPartitionBy()).append(",");
        if (getFilter() != null)
            sb.append("Filter: ").append(getFilter()).append(",");
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

        if (obj instanceof DescribeDimensionKeysRequest == false)
            return false;
        DescribeDimensionKeysRequest other = (DescribeDimensionKeysRequest) obj;
        if (other.getServiceType() == null ^ this.getServiceType() == null)
            return false;
        if (other.getServiceType() != null && other.getServiceType().equals(this.getServiceType()) == false)
            return false;
        if (other.getIdentifier() == null ^ this.getIdentifier() == null)
            return false;
        if (other.getIdentifier() != null && other.getIdentifier().equals(this.getIdentifier()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getMetric() == null ^ this.getMetric() == null)
            return false;
        if (other.getMetric() != null && other.getMetric().equals(this.getMetric()) == false)
            return false;
        if (other.getPeriodInSeconds() == null ^ this.getPeriodInSeconds() == null)
            return false;
        if (other.getPeriodInSeconds() != null && other.getPeriodInSeconds().equals(this.getPeriodInSeconds()) == false)
            return false;
        if (other.getGroupBy() == null ^ this.getGroupBy() == null)
            return false;
        if (other.getGroupBy() != null && other.getGroupBy().equals(this.getGroupBy()) == false)
            return false;
        if (other.getPartitionBy() == null ^ this.getPartitionBy() == null)
            return false;
        if (other.getPartitionBy() != null && other.getPartitionBy().equals(this.getPartitionBy()) == false)
            return false;
        if (other.getFilter() == null ^ this.getFilter() == null)
            return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false)
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
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getMetric() == null) ? 0 : getMetric().hashCode());
        hashCode = prime * hashCode + ((getPeriodInSeconds() == null) ? 0 : getPeriodInSeconds().hashCode());
        hashCode = prime * hashCode + ((getGroupBy() == null) ? 0 : getGroupBy().hashCode());
        hashCode = prime * hashCode + ((getPartitionBy() == null) ? 0 : getPartitionBy().hashCode());
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public DescribeDimensionKeysRequest clone() {
        return (DescribeDimensionKeysRequest) super.clone();
    }

}
