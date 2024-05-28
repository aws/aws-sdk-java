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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/StartQuery" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartQueryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the monitor to query.
     * </p>
     */
    private String monitorName;
    /**
     * <p>
     * The timestamp that is the beginning of the period that you want to retrieve data for with your query.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The timestamp that is the end of the period that you want to retrieve data for with your query.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The type of query to run. The following are the three types of queries that you can run using the Internet
     * Monitor query interface:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MEASUREMENTS</code>: Provides availability score, performance score, total traffic, and round-trip times,
     * at 5 minute intervals.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LOCATIONS</code>: Provides availability score, performance score, total traffic, and time to first byte
     * (TTFB) information, for the top location and ASN combinations that you're monitoring, by traffic volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LOCATION_DETAILS</code>: Provides TTFB for Amazon CloudFront, your current configuration, and the best
     * performing EC2 configuration, at 1 hour intervals.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For lists of the fields returned with each query type and more information about how each type of query is
     * performed, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html">
     * Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     */
    private String queryType;
    /**
     * <p>
     * The <code>FilterParameters</code> field that you use with Amazon CloudWatch Internet Monitor queries is a string
     * the defines how you want a query to be filtered. The filter parameters that you can specify depend on the query
     * type, since each query type returns a different set of Internet Monitor data.
     * </p>
     * <p>
     * For more information about specifying filter parameters, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     * >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     */
    private java.util.List<FilterParameter> filterParameters;
    /**
     * <p>
     * The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet Monitor.
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     */
    private String linkedAccountId;

    /**
     * <p>
     * The name of the monitor to query.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor to query.
     */

    public void setMonitorName(String monitorName) {
        this.monitorName = monitorName;
    }

    /**
     * <p>
     * The name of the monitor to query.
     * </p>
     * 
     * @return The name of the monitor to query.
     */

    public String getMonitorName() {
        return this.monitorName;
    }

    /**
     * <p>
     * The name of the monitor to query.
     * </p>
     * 
     * @param monitorName
     *        The name of the monitor to query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withMonitorName(String monitorName) {
        setMonitorName(monitorName);
        return this;
    }

    /**
     * <p>
     * The timestamp that is the beginning of the period that you want to retrieve data for with your query.
     * </p>
     * 
     * @param startTime
     *        The timestamp that is the beginning of the period that you want to retrieve data for with your query.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp that is the beginning of the period that you want to retrieve data for with your query.
     * </p>
     * 
     * @return The timestamp that is the beginning of the period that you want to retrieve data for with your query.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp that is the beginning of the period that you want to retrieve data for with your query.
     * </p>
     * 
     * @param startTime
     *        The timestamp that is the beginning of the period that you want to retrieve data for with your query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The timestamp that is the end of the period that you want to retrieve data for with your query.
     * </p>
     * 
     * @param endTime
     *        The timestamp that is the end of the period that you want to retrieve data for with your query.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp that is the end of the period that you want to retrieve data for with your query.
     * </p>
     * 
     * @return The timestamp that is the end of the period that you want to retrieve data for with your query.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The timestamp that is the end of the period that you want to retrieve data for with your query.
     * </p>
     * 
     * @param endTime
     *        The timestamp that is the end of the period that you want to retrieve data for with your query.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The type of query to run. The following are the three types of queries that you can run using the Internet
     * Monitor query interface:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MEASUREMENTS</code>: Provides availability score, performance score, total traffic, and round-trip times,
     * at 5 minute intervals.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LOCATIONS</code>: Provides availability score, performance score, total traffic, and time to first byte
     * (TTFB) information, for the top location and ASN combinations that you're monitoring, by traffic volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LOCATION_DETAILS</code>: Provides TTFB for Amazon CloudFront, your current configuration, and the best
     * performing EC2 configuration, at 1 hour intervals.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For lists of the fields returned with each query type and more information about how each type of query is
     * performed, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html">
     * Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     * 
     * @param queryType
     *        The type of query to run. The following are the three types of queries that you can run using the Internet
     *        Monitor query interface:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MEASUREMENTS</code>: Provides availability score, performance score, total traffic, and round-trip
     *        times, at 5 minute intervals.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOP_LOCATIONS</code>: Provides availability score, performance score, total traffic, and time to
     *        first byte (TTFB) information, for the top location and ASN combinations that you're monitoring, by
     *        traffic volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOP_LOCATION_DETAILS</code>: Provides TTFB for Amazon CloudFront, your current configuration, and
     *        the best performing EC2 configuration, at 1 hour intervals.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For lists of the fields returned with each query type and more information about how each type of query is
     *        performed, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     *        > Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet
     *        Monitor User Guide.
     * @see QueryType
     */

    public void setQueryType(String queryType) {
        this.queryType = queryType;
    }

    /**
     * <p>
     * The type of query to run. The following are the three types of queries that you can run using the Internet
     * Monitor query interface:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MEASUREMENTS</code>: Provides availability score, performance score, total traffic, and round-trip times,
     * at 5 minute intervals.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LOCATIONS</code>: Provides availability score, performance score, total traffic, and time to first byte
     * (TTFB) information, for the top location and ASN combinations that you're monitoring, by traffic volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LOCATION_DETAILS</code>: Provides TTFB for Amazon CloudFront, your current configuration, and the best
     * performing EC2 configuration, at 1 hour intervals.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For lists of the fields returned with each query type and more information about how each type of query is
     * performed, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html">
     * Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     * 
     * @return The type of query to run. The following are the three types of queries that you can run using the
     *         Internet Monitor query interface:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MEASUREMENTS</code>: Provides availability score, performance score, total traffic, and round-trip
     *         times, at 5 minute intervals.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TOP_LOCATIONS</code>: Provides availability score, performance score, total traffic, and time to
     *         first byte (TTFB) information, for the top location and ASN combinations that you're monitoring, by
     *         traffic volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>TOP_LOCATION_DETAILS</code>: Provides TTFB for Amazon CloudFront, your current configuration, and
     *         the best performing EC2 configuration, at 1 hour intervals.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For lists of the fields returned with each query type and more information about how each type of query
     *         is performed, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     *         > Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet
     *         Monitor User Guide.
     * @see QueryType
     */

    public String getQueryType() {
        return this.queryType;
    }

    /**
     * <p>
     * The type of query to run. The following are the three types of queries that you can run using the Internet
     * Monitor query interface:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MEASUREMENTS</code>: Provides availability score, performance score, total traffic, and round-trip times,
     * at 5 minute intervals.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LOCATIONS</code>: Provides availability score, performance score, total traffic, and time to first byte
     * (TTFB) information, for the top location and ASN combinations that you're monitoring, by traffic volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LOCATION_DETAILS</code>: Provides TTFB for Amazon CloudFront, your current configuration, and the best
     * performing EC2 configuration, at 1 hour intervals.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For lists of the fields returned with each query type and more information about how each type of query is
     * performed, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html">
     * Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     * 
     * @param queryType
     *        The type of query to run. The following are the three types of queries that you can run using the Internet
     *        Monitor query interface:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MEASUREMENTS</code>: Provides availability score, performance score, total traffic, and round-trip
     *        times, at 5 minute intervals.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOP_LOCATIONS</code>: Provides availability score, performance score, total traffic, and time to
     *        first byte (TTFB) information, for the top location and ASN combinations that you're monitoring, by
     *        traffic volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOP_LOCATION_DETAILS</code>: Provides TTFB for Amazon CloudFront, your current configuration, and
     *        the best performing EC2 configuration, at 1 hour intervals.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For lists of the fields returned with each query type and more information about how each type of query is
     *        performed, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     *        > Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet
     *        Monitor User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryType
     */

    public StartQueryRequest withQueryType(String queryType) {
        setQueryType(queryType);
        return this;
    }

    /**
     * <p>
     * The type of query to run. The following are the three types of queries that you can run using the Internet
     * Monitor query interface:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MEASUREMENTS</code>: Provides availability score, performance score, total traffic, and round-trip times,
     * at 5 minute intervals.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LOCATIONS</code>: Provides availability score, performance score, total traffic, and time to first byte
     * (TTFB) information, for the top location and ASN combinations that you're monitoring, by traffic volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>TOP_LOCATION_DETAILS</code>: Provides TTFB for Amazon CloudFront, your current configuration, and the best
     * performing EC2 configuration, at 1 hour intervals.
     * </p>
     * </li>
     * </ul>
     * <p>
     * For lists of the fields returned with each query type and more information about how each type of query is
     * performed, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html">
     * Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     * 
     * @param queryType
     *        The type of query to run. The following are the three types of queries that you can run using the Internet
     *        Monitor query interface:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MEASUREMENTS</code>: Provides availability score, performance score, total traffic, and round-trip
     *        times, at 5 minute intervals.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOP_LOCATIONS</code>: Provides availability score, performance score, total traffic, and time to
     *        first byte (TTFB) information, for the top location and ASN combinations that you're monitoring, by
     *        traffic volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>TOP_LOCATION_DETAILS</code>: Provides TTFB for Amazon CloudFront, your current configuration, and
     *        the best performing EC2 configuration, at 1 hour intervals.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For lists of the fields returned with each query type and more information about how each type of query is
     *        performed, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     *        > Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet
     *        Monitor User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see QueryType
     */

    public StartQueryRequest withQueryType(QueryType queryType) {
        this.queryType = queryType.toString();
        return this;
    }

    /**
     * <p>
     * The <code>FilterParameters</code> field that you use with Amazon CloudWatch Internet Monitor queries is a string
     * the defines how you want a query to be filtered. The filter parameters that you can specify depend on the query
     * type, since each query type returns a different set of Internet Monitor data.
     * </p>
     * <p>
     * For more information about specifying filter parameters, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     * >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     * 
     * @return The <code>FilterParameters</code> field that you use with Amazon CloudWatch Internet Monitor queries is a
     *         string the defines how you want a query to be filtered. The filter parameters that you can specify depend
     *         on the query type, since each query type returns a different set of Internet Monitor data.</p>
     *         <p>
     *         For more information about specifying filter parameters, see <a href=
     *         "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     *         >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet
     *         Monitor User Guide.
     */

    public java.util.List<FilterParameter> getFilterParameters() {
        return filterParameters;
    }

    /**
     * <p>
     * The <code>FilterParameters</code> field that you use with Amazon CloudWatch Internet Monitor queries is a string
     * the defines how you want a query to be filtered. The filter parameters that you can specify depend on the query
     * type, since each query type returns a different set of Internet Monitor data.
     * </p>
     * <p>
     * For more information about specifying filter parameters, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     * >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     * 
     * @param filterParameters
     *        The <code>FilterParameters</code> field that you use with Amazon CloudWatch Internet Monitor queries is a
     *        string the defines how you want a query to be filtered. The filter parameters that you can specify depend
     *        on the query type, since each query type returns a different set of Internet Monitor data.</p>
     *        <p>
     *        For more information about specifying filter parameters, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     *        >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet
     *        Monitor User Guide.
     */

    public void setFilterParameters(java.util.Collection<FilterParameter> filterParameters) {
        if (filterParameters == null) {
            this.filterParameters = null;
            return;
        }

        this.filterParameters = new java.util.ArrayList<FilterParameter>(filterParameters);
    }

    /**
     * <p>
     * The <code>FilterParameters</code> field that you use with Amazon CloudWatch Internet Monitor queries is a string
     * the defines how you want a query to be filtered. The filter parameters that you can specify depend on the query
     * type, since each query type returns a different set of Internet Monitor data.
     * </p>
     * <p>
     * For more information about specifying filter parameters, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     * >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFilterParameters(java.util.Collection)} or {@link #withFilterParameters(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param filterParameters
     *        The <code>FilterParameters</code> field that you use with Amazon CloudWatch Internet Monitor queries is a
     *        string the defines how you want a query to be filtered. The filter parameters that you can specify depend
     *        on the query type, since each query type returns a different set of Internet Monitor data.</p>
     *        <p>
     *        For more information about specifying filter parameters, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     *        >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet
     *        Monitor User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withFilterParameters(FilterParameter... filterParameters) {
        if (this.filterParameters == null) {
            setFilterParameters(new java.util.ArrayList<FilterParameter>(filterParameters.length));
        }
        for (FilterParameter ele : filterParameters) {
            this.filterParameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The <code>FilterParameters</code> field that you use with Amazon CloudWatch Internet Monitor queries is a string
     * the defines how you want a query to be filtered. The filter parameters that you can specify depend on the query
     * type, since each query type returns a different set of Internet Monitor data.
     * </p>
     * <p>
     * For more information about specifying filter parameters, see <a href=
     * "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     * >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet Monitor User
     * Guide.
     * </p>
     * 
     * @param filterParameters
     *        The <code>FilterParameters</code> field that you use with Amazon CloudWatch Internet Monitor queries is a
     *        string the defines how you want a query to be filtered. The filter parameters that you can specify depend
     *        on the query type, since each query type returns a different set of Internet Monitor data.</p>
     *        <p>
     *        For more information about specifying filter parameters, see <a href=
     *        "https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/CloudWatch-IM-view-cw-tools-cwim-query.html"
     *        >Using the Amazon CloudWatch Internet Monitor query interface</a> in the Amazon CloudWatch Internet
     *        Monitor User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withFilterParameters(java.util.Collection<FilterParameter> filterParameters) {
        setFilterParameters(filterParameters);
        return this;
    }

    /**
     * <p>
     * The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet Monitor.
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     * 
     * @param linkedAccountId
     *        The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet
     *        Monitor. You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet
     *        Monitor cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     */

    public void setLinkedAccountId(String linkedAccountId) {
        this.linkedAccountId = linkedAccountId;
    }

    /**
     * <p>
     * The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet Monitor.
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     * 
     * @return The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet
     *         Monitor. You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For
     *         more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet
     *         Monitor cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     */

    public String getLinkedAccountId() {
        return this.linkedAccountId;
    }

    /**
     * <p>
     * The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet Monitor.
     * You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For more
     * information, see <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet Monitor
     * cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * </p>
     * 
     * @param linkedAccountId
     *        The account ID for an account that you've set up cross-account sharing for in Amazon CloudWatch Internet
     *        Monitor. You configure cross-account sharing by using Amazon CloudWatch Observability Access Manager. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/cwim-cross-account.html">Internet
     *        Monitor cross-account observability</a> in the Amazon CloudWatch Internet Monitor User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartQueryRequest withLinkedAccountId(String linkedAccountId) {
        setLinkedAccountId(linkedAccountId);
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
        if (getMonitorName() != null)
            sb.append("MonitorName: ").append(getMonitorName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getQueryType() != null)
            sb.append("QueryType: ").append(getQueryType()).append(",");
        if (getFilterParameters() != null)
            sb.append("FilterParameters: ").append(getFilterParameters()).append(",");
        if (getLinkedAccountId() != null)
            sb.append("LinkedAccountId: ").append(getLinkedAccountId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartQueryRequest == false)
            return false;
        StartQueryRequest other = (StartQueryRequest) obj;
        if (other.getMonitorName() == null ^ this.getMonitorName() == null)
            return false;
        if (other.getMonitorName() != null && other.getMonitorName().equals(this.getMonitorName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getQueryType() == null ^ this.getQueryType() == null)
            return false;
        if (other.getQueryType() != null && other.getQueryType().equals(this.getQueryType()) == false)
            return false;
        if (other.getFilterParameters() == null ^ this.getFilterParameters() == null)
            return false;
        if (other.getFilterParameters() != null && other.getFilterParameters().equals(this.getFilterParameters()) == false)
            return false;
        if (other.getLinkedAccountId() == null ^ this.getLinkedAccountId() == null)
            return false;
        if (other.getLinkedAccountId() != null && other.getLinkedAccountId().equals(this.getLinkedAccountId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMonitorName() == null) ? 0 : getMonitorName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getQueryType() == null) ? 0 : getQueryType().hashCode());
        hashCode = prime * hashCode + ((getFilterParameters() == null) ? 0 : getFilterParameters().hashCode());
        hashCode = prime * hashCode + ((getLinkedAccountId() == null) ? 0 : getLinkedAccountId().hashCode());
        return hashCode;
    }

    @Override
    public StartQueryRequest clone() {
        return (StartQueryRequest) super.clone();
    }

}
