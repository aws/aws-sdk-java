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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDistributionMetricData"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDistributionMetricDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the distribution for which to get metric data.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     */
    private String distributionName;
    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid distribution metric names are listed below, along with the most useful <code>statistics</code> to include
     * in your request, and the published <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Requests</code> </b> - The total number of viewer requests received by your Lightsail distribution, for
     * all HTTP methods, and for both HTTP and HTTPS requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BytesDownloaded</code> </b> - The number of bytes downloaded by viewers for GET, HEAD, and OPTIONS
     * requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BytesUploaded </code> </b> - The number of bytes uploaded to your origin by your Lightsail
     * distribution, using POST and PUT requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>TotalErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * code was 4xx or 5xx.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>4xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * cod was 4xx. In these cases, the client or client viewer may have made an error. For example, a status code of
     * 404 (Not Found) means that the client requested an object that could not be found.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>5xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * code was 5xx. In these cases, the origin server did not satisfy the requests. For example, a status code of 503
     * (Service Unavailable) means that the origin server is currently unavailable.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String metricName;
    /**
     * <p>
     * The start of the time interval for which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify <code>1538424000</code> as
     * the start time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end of the time interval for which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify <code>1538427600</code> as
     * the end time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The granularity, in seconds, for the metric data points that will be returned.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The unit for the metric data request.
     * </p>
     * <p>
     * Valid units depend on the metric data being requested. For the valid units with each available metric, see the
     * <code>metricName</code> parameter.
     * </p>
     */
    private String unit;
    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> statistics;

    /**
     * <p>
     * The name of the distribution for which to get metric data.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * 
     * @param distributionName
     *        The name of the distribution for which to get metric data.</p>
     *        <p>
     *        Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     */

    public void setDistributionName(String distributionName) {
        this.distributionName = distributionName;
    }

    /**
     * <p>
     * The name of the distribution for which to get metric data.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * 
     * @return The name of the distribution for which to get metric data.</p>
     *         <p>
     *         Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     */

    public String getDistributionName() {
        return this.distributionName;
    }

    /**
     * <p>
     * The name of the distribution for which to get metric data.
     * </p>
     * <p>
     * Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * </p>
     * 
     * @param distributionName
     *        The name of the distribution for which to get metric data.</p>
     *        <p>
     *        Use the <code>GetDistributions</code> action to get a list of distribution names that you can specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDistributionMetricDataRequest withDistributionName(String distributionName) {
        setDistributionName(distributionName);
        return this;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid distribution metric names are listed below, along with the most useful <code>statistics</code> to include
     * in your request, and the published <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Requests</code> </b> - The total number of viewer requests received by your Lightsail distribution, for
     * all HTTP methods, and for both HTTP and HTTPS requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BytesDownloaded</code> </b> - The number of bytes downloaded by viewers for GET, HEAD, and OPTIONS
     * requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BytesUploaded </code> </b> - The number of bytes uploaded to your origin by your Lightsail
     * distribution, using POST and PUT requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>TotalErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * code was 4xx or 5xx.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>4xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * cod was 4xx. In these cases, the client or client viewer may have made an error. For example, a status code of
     * 404 (Not Found) means that the client requested an object that could not be found.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>5xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * code was 5xx. In these cases, the origin server did not satisfy the requests. For example, a status code of 503
     * (Service Unavailable) means that the origin server is currently unavailable.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The metric for which you want to return information.</p>
     *        <p>
     *        Valid distribution metric names are listed below, along with the most useful <code>statistics</code> to
     *        include in your request, and the published <code>unit</code> value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Requests</code> </b> - The total number of viewer requests received by your Lightsail
     *        distribution, for all HTTP methods, and for both HTTP and HTTPS requests.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>None</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>BytesDownloaded</code> </b> - The number of bytes downloaded by viewers for GET, HEAD, and
     *        OPTIONS requests.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>None</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>BytesUploaded </code> </b> - The number of bytes uploaded to your origin by your Lightsail
     *        distribution, using POST and PUT requests.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>None</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>TotalErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP
     *        status code was 4xx or 5xx.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>4xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP
     *        status cod was 4xx. In these cases, the client or client viewer may have made an error. For example, a
     *        status code of 404 (Not Found) means that the client requested an object that could not be found.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>5xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP
     *        status code was 5xx. In these cases, the origin server did not satisfy the requests. For example, a status
     *        code of 503 (Service Unavailable) means that the origin server is currently unavailable.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     * @see DistributionMetricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid distribution metric names are listed below, along with the most useful <code>statistics</code> to include
     * in your request, and the published <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Requests</code> </b> - The total number of viewer requests received by your Lightsail distribution, for
     * all HTTP methods, and for both HTTP and HTTPS requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BytesDownloaded</code> </b> - The number of bytes downloaded by viewers for GET, HEAD, and OPTIONS
     * requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BytesUploaded </code> </b> - The number of bytes uploaded to your origin by your Lightsail
     * distribution, using POST and PUT requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>TotalErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * code was 4xx or 5xx.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>4xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * cod was 4xx. In these cases, the client or client viewer may have made an error. For example, a status code of
     * 404 (Not Found) means that the client requested an object that could not be found.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>5xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * code was 5xx. In these cases, the origin server did not satisfy the requests. For example, a status code of 503
     * (Service Unavailable) means that the origin server is currently unavailable.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The metric for which you want to return information.</p>
     *         <p>
     *         Valid distribution metric names are listed below, along with the most useful <code>statistics</code> to
     *         include in your request, and the published <code>unit</code> value.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>Requests</code> </b> - The total number of viewer requests received by your Lightsail
     *         distribution, for all HTTP methods, and for both HTTP and HTTPS requests.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>None</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>BytesDownloaded</code> </b> - The number of bytes downloaded by viewers for GET, HEAD, and
     *         OPTIONS requests.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>None</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>BytesUploaded </code> </b> - The number of bytes uploaded to your origin by your Lightsail
     *         distribution, using POST and PUT requests.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>None</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>TotalErrorRate</code> </b> - The percentage of all viewer requests for which the response's
     *         HTTP status code was 4xx or 5xx.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Percent</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>4xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP
     *         status cod was 4xx. In these cases, the client or client viewer may have made an error. For example, a
     *         status code of 404 (Not Found) means that the client requested an object that could not be found.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Percent</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>5xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP
     *         status code was 5xx. In these cases, the origin server did not satisfy the requests. For example, a
     *         status code of 503 (Service Unavailable) means that the origin server is currently unavailable.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Percent</code>.
     *         </p>
     *         </li>
     * @see DistributionMetricName
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid distribution metric names are listed below, along with the most useful <code>statistics</code> to include
     * in your request, and the published <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Requests</code> </b> - The total number of viewer requests received by your Lightsail distribution, for
     * all HTTP methods, and for both HTTP and HTTPS requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BytesDownloaded</code> </b> - The number of bytes downloaded by viewers for GET, HEAD, and OPTIONS
     * requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BytesUploaded </code> </b> - The number of bytes uploaded to your origin by your Lightsail
     * distribution, using POST and PUT requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>TotalErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * code was 4xx or 5xx.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>4xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * cod was 4xx. In these cases, the client or client viewer may have made an error. For example, a status code of
     * 404 (Not Found) means that the client requested an object that could not be found.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>5xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * code was 5xx. In these cases, the origin server did not satisfy the requests. For example, a status code of 503
     * (Service Unavailable) means that the origin server is currently unavailable.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The metric for which you want to return information.</p>
     *        <p>
     *        Valid distribution metric names are listed below, along with the most useful <code>statistics</code> to
     *        include in your request, and the published <code>unit</code> value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Requests</code> </b> - The total number of viewer requests received by your Lightsail
     *        distribution, for all HTTP methods, and for both HTTP and HTTPS requests.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>None</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>BytesDownloaded</code> </b> - The number of bytes downloaded by viewers for GET, HEAD, and
     *        OPTIONS requests.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>None</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>BytesUploaded </code> </b> - The number of bytes uploaded to your origin by your Lightsail
     *        distribution, using POST and PUT requests.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>None</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>TotalErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP
     *        status code was 4xx or 5xx.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>4xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP
     *        status cod was 4xx. In these cases, the client or client viewer may have made an error. For example, a
     *        status code of 404 (Not Found) means that the client requested an object that could not be found.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>5xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP
     *        status code was 5xx. In these cases, the origin server did not satisfy the requests. For example, a status
     *        code of 503 (Service Unavailable) means that the origin server is currently unavailable.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DistributionMetricName
     */

    public GetDistributionMetricDataRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid distribution metric names are listed below, along with the most useful <code>statistics</code> to include
     * in your request, and the published <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>Requests</code> </b> - The total number of viewer requests received by your Lightsail distribution, for
     * all HTTP methods, and for both HTTP and HTTPS requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BytesDownloaded</code> </b> - The number of bytes downloaded by viewers for GET, HEAD, and OPTIONS
     * requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>BytesUploaded </code> </b> - The number of bytes uploaded to your origin by your Lightsail
     * distribution, using POST and PUT requests.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>None</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>TotalErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * code was 4xx or 5xx.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>4xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * cod was 4xx. In these cases, the client or client viewer may have made an error. For example, a status code of
     * 404 (Not Found) means that the client requested an object that could not be found.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>5xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP status
     * code was 5xx. In these cases, the origin server did not satisfy the requests. For example, a status code of 503
     * (Service Unavailable) means that the origin server is currently unavailable.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The metric for which you want to return information.</p>
     *        <p>
     *        Valid distribution metric names are listed below, along with the most useful <code>statistics</code> to
     *        include in your request, and the published <code>unit</code> value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>Requests</code> </b> - The total number of viewer requests received by your Lightsail
     *        distribution, for all HTTP methods, and for both HTTP and HTTPS requests.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>None</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>BytesDownloaded</code> </b> - The number of bytes downloaded by viewers for GET, HEAD, and
     *        OPTIONS requests.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>None</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>BytesUploaded </code> </b> - The number of bytes uploaded to your origin by your Lightsail
     *        distribution, using POST and PUT requests.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>None</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>TotalErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP
     *        status code was 4xx or 5xx.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>4xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP
     *        status cod was 4xx. In these cases, the client or client viewer may have made an error. For example, a
     *        status code of 404 (Not Found) means that the client requested an object that could not be found.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>5xxErrorRate</code> </b> - The percentage of all viewer requests for which the response's HTTP
     *        status code was 5xx. In these cases, the origin server did not satisfy the requests. For example, a status
     *        code of 503 (Service Unavailable) means that the origin server is currently unavailable.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Average</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DistributionMetricName
     */

    public GetDistributionMetricDataRequest withMetricName(DistributionMetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The start of the time interval for which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify <code>1538424000</code> as
     * the start time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @param startTime
     *        The start of the time interval for which to get metric data.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify
     *        <code>1538424000</code> as the start time.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can convert a human-friendly time to Unix time format using a converter like <a
     *        href="https://www.epochconverter.com/">Epoch converter</a>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start of the time interval for which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify <code>1538424000</code> as
     * the start time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @return The start of the time interval for which to get metric data.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specified in Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in the Unix time format.
     *         </p>
     *         <p>
     *         For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify
     *         <code>1538424000</code> as the start time.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can convert a human-friendly time to Unix time format using a converter like <a
     *         href="https://www.epochconverter.com/">Epoch converter</a>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start of the time interval for which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify <code>1538424000</code> as
     * the start time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @param startTime
     *        The start of the time interval for which to get metric data.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use a start time of October 1, 2018, at 8 PM UTC, specify
     *        <code>1538424000</code> as the start time.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can convert a human-friendly time to Unix time format using a converter like <a
     *        href="https://www.epochconverter.com/">Epoch converter</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDistributionMetricDataRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end of the time interval for which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify <code>1538427600</code> as
     * the end time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @param endTime
     *        The end of the time interval for which to get metric data.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify
     *        <code>1538427600</code> as the end time.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can convert a human-friendly time to Unix time format using a converter like <a
     *        href="https://www.epochconverter.com/">Epoch converter</a>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end of the time interval for which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify <code>1538427600</code> as
     * the end time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @return The end of the time interval for which to get metric data.</p>
     *         <p>
     *         Constraints:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Specified in Coordinated Universal Time (UTC).
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Specified in the Unix time format.
     *         </p>
     *         <p>
     *         For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify
     *         <code>1538427600</code> as the end time.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         You can convert a human-friendly time to Unix time format using a converter like <a
     *         href="https://www.epochconverter.com/">Epoch converter</a>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end of the time interval for which to get metric data.
     * </p>
     * <p>
     * Constraints:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Specified in Coordinated Universal Time (UTC).
     * </p>
     * </li>
     * <li>
     * <p>
     * Specified in the Unix time format.
     * </p>
     * <p>
     * For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify <code>1538427600</code> as
     * the end time.
     * </p>
     * </li>
     * </ul>
     * <p>
     * You can convert a human-friendly time to Unix time format using a converter like <a
     * href="https://www.epochconverter.com/">Epoch converter</a>.
     * </p>
     * 
     * @param endTime
     *        The end of the time interval for which to get metric data.</p>
     *        <p>
     *        Constraints:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Specified in Coordinated Universal Time (UTC).
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Specified in the Unix time format.
     *        </p>
     *        <p>
     *        For example, if you wish to use an end time of October 1, 2018, at 9 PM UTC, specify
     *        <code>1538427600</code> as the end time.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        You can convert a human-friendly time to Unix time format using a converter like <a
     *        href="https://www.epochconverter.com/">Epoch converter</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDistributionMetricDataRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The granularity, in seconds, for the metric data points that will be returned.
     * </p>
     * 
     * @param period
     *        The granularity, in seconds, for the metric data points that will be returned.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The granularity, in seconds, for the metric data points that will be returned.
     * </p>
     * 
     * @return The granularity, in seconds, for the metric data points that will be returned.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The granularity, in seconds, for the metric data points that will be returned.
     * </p>
     * 
     * @param period
     *        The granularity, in seconds, for the metric data points that will be returned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDistributionMetricDataRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The unit for the metric data request.
     * </p>
     * <p>
     * Valid units depend on the metric data being requested. For the valid units with each available metric, see the
     * <code>metricName</code> parameter.
     * </p>
     * 
     * @param unit
     *        The unit for the metric data request.</p>
     *        <p>
     *        Valid units depend on the metric data being requested. For the valid units with each available metric, see
     *        the <code>metricName</code> parameter.
     * @see MetricUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit for the metric data request.
     * </p>
     * <p>
     * Valid units depend on the metric data being requested. For the valid units with each available metric, see the
     * <code>metricName</code> parameter.
     * </p>
     * 
     * @return The unit for the metric data request.</p>
     *         <p>
     *         Valid units depend on the metric data being requested. For the valid units with each available metric,
     *         see the <code>metricName</code> parameter.
     * @see MetricUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit for the metric data request.
     * </p>
     * <p>
     * Valid units depend on the metric data being requested. For the valid units with each available metric, see the
     * <code>metricName</code> parameter.
     * </p>
     * 
     * @param unit
     *        The unit for the metric data request.</p>
     *        <p>
     *        Valid units depend on the metric data being requested. For the valid units with each available metric, see
     *        the <code>metricName</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricUnit
     */

    public GetDistributionMetricDataRequest withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit for the metric data request.
     * </p>
     * <p>
     * Valid units depend on the metric data being requested. For the valid units with each available metric, see the
     * <code>metricName</code> parameter.
     * </p>
     * 
     * @param unit
     *        The unit for the metric data request.</p>
     *        <p>
     *        Valid units depend on the metric data being requested. For the valid units with each available metric, see
     *        the <code>metricName</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricUnit
     */

    public GetDistributionMetricDataRequest withUnit(MetricUnit unit) {
        this.unit = unit.toString();
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The statistic for the metric.</p>
     *         <p>
     *         The following statistics are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *         low volumes of activity for your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Maximum</code> - The highest value observed during the specified period. Use this value to
     *         determine high volumes of activity for your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Sum</code> - All values submitted for the matching metric added together. You can use this
     *         statistic to determine the total volume of a metric.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Average</code> - The value of Sum / SampleCount during the specified period. By comparing this
     *         statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close
     *         the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase
     *         or decrease your resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *         </p>
     *         </li>
     * @see MetricStatistic
     */

    public java.util.List<String> getStatistics() {
        return statistics;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistics
     *        The statistic for the metric.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> - The value of Sum / SampleCount during the specified period. By comparing this
     *        statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close
     *        the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase
     *        or decrease your resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @see MetricStatistic
     */

    public void setStatistics(java.util.Collection<String> statistics) {
        if (statistics == null) {
            this.statistics = null;
            return;
        }

        this.statistics = new java.util.ArrayList<String>(statistics);
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatistics(java.util.Collection)} or {@link #withStatistics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statistics
     *        The statistic for the metric.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> - The value of Sum / SampleCount during the specified period. By comparing this
     *        statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close
     *        the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase
     *        or decrease your resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetDistributionMetricDataRequest withStatistics(String... statistics) {
        if (this.statistics == null) {
            setStatistics(new java.util.ArrayList<String>(statistics.length));
        }
        for (String ele : statistics) {
            this.statistics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistics
     *        The statistic for the metric.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> - The value of Sum / SampleCount during the specified period. By comparing this
     *        statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close
     *        the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase
     *        or decrease your resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetDistributionMetricDataRequest withStatistics(java.util.Collection<String> statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * The statistic for the metric.
     * </p>
     * <p>
     * The following statistics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> - The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistics
     *        The statistic for the metric.</p>
     *        <p>
     *        The following statistics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Minimum</code> - The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> - The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> - All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> - The value of Sum / SampleCount during the specified period. By comparing this
     *        statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close
     *        the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase
     *        or decrease your resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> - The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetDistributionMetricDataRequest withStatistics(MetricStatistic... statistics) {
        java.util.ArrayList<String> statisticsCopy = new java.util.ArrayList<String>(statistics.length);
        for (MetricStatistic value : statistics) {
            statisticsCopy.add(value.toString());
        }
        if (getStatistics() == null) {
            setStatistics(statisticsCopy);
        } else {
            getStatistics().addAll(statisticsCopy);
        }
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
        if (getDistributionName() != null)
            sb.append("DistributionName: ").append(getDistributionName()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getUnit() != null)
            sb.append("Unit: ").append(getUnit()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDistributionMetricDataRequest == false)
            return false;
        GetDistributionMetricDataRequest other = (GetDistributionMetricDataRequest) obj;
        if (other.getDistributionName() == null ^ this.getDistributionName() == null)
            return false;
        if (other.getDistributionName() != null && other.getDistributionName().equals(this.getDistributionName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getUnit() == null ^ this.getUnit() == null)
            return false;
        if (other.getUnit() != null && other.getUnit().equals(this.getUnit()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDistributionName() == null) ? 0 : getDistributionName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetDistributionMetricDataRequest clone() {
        return (GetDistributionMetricDataRequest) super.clone();
    }

}
