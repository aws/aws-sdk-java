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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetInstanceMetricData" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetInstanceMetricDataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the instance for which you want to get metrics data.
     * </p>
     */
    private String instanceName;
    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid instance metric names are listed below, along with the most useful <code>statistics</code> to include in
     * your request, and the published <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUtilization</code> </b> — The percentage of allocated compute units that are currently in use on the
     * instance. This metric identifies the processing power to run the applications on the instance. Tools in your
     * operating system can show a lower percentage than Lightsail when the instance is not allocated a full processor
     * core.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkIn</code> </b> — The number of bytes received on all network interfaces by the instance. This
     * metric identifies the volume of incoming network traffic to the instance. The number reported is the number of
     * bytes received during the period. Because this metric is reported in 5-minute intervals, divide the reported
     * number by 300 to find Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkOut</code> </b> — The number of bytes sent out on all network interfaces by the instance. This
     * metric identifies the volume of outgoing network traffic from the instance. The number reported is the number of
     * bytes sent during the period. Because this metric is reported in 5-minute intervals, divide the reported number
     * by 300 to find Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed</code> </b> — Reports whether the instance passed or failed both the instance status
     * check and the system status check. This metric can be either 0 (passed) or 1 (failed). This metric data is
     * available in 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_Instance</code> </b> — Reports whether the instance passed or failed the instance
     * status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60
     * seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_System</code> </b> — Reports whether the instance passed or failed the system status
     * check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60 seconds)
     * granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     */
    private String metricName;
    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <p>
     * The <code>StatusCheckFailed</code>, <code>StatusCheckFailed_Instance</code>, and
     * <code>StatusCheckFailed_System</code> instance metric data is available in 1-minute (60 seconds) granularity. All
     * other instance metric data is available in 5-minute (300 seconds) granularity.
     * </p>
     */
    private Integer period;
    /**
     * <p>
     * The start time of the time period.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The end time of the time period.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The unit for the metric data request. Valid units depend on the metric data being required. For the valid units
     * with each available metric, see the <code>metricName</code> parameter.
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
     * <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<String> statistics;

    /**
     * <p>
     * The name of the instance for which you want to get metrics data.
     * </p>
     * 
     * @param instanceName
     *        The name of the instance for which you want to get metrics data.
     */

    public void setInstanceName(String instanceName) {
        this.instanceName = instanceName;
    }

    /**
     * <p>
     * The name of the instance for which you want to get metrics data.
     * </p>
     * 
     * @return The name of the instance for which you want to get metrics data.
     */

    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * <p>
     * The name of the instance for which you want to get metrics data.
     * </p>
     * 
     * @param instanceName
     *        The name of the instance for which you want to get metrics data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceMetricDataRequest withInstanceName(String instanceName) {
        setInstanceName(instanceName);
        return this;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid instance metric names are listed below, along with the most useful <code>statistics</code> to include in
     * your request, and the published <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUtilization</code> </b> — The percentage of allocated compute units that are currently in use on the
     * instance. This metric identifies the processing power to run the applications on the instance. Tools in your
     * operating system can show a lower percentage than Lightsail when the instance is not allocated a full processor
     * core.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkIn</code> </b> — The number of bytes received on all network interfaces by the instance. This
     * metric identifies the volume of incoming network traffic to the instance. The number reported is the number of
     * bytes received during the period. Because this metric is reported in 5-minute intervals, divide the reported
     * number by 300 to find Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkOut</code> </b> — The number of bytes sent out on all network interfaces by the instance. This
     * metric identifies the volume of outgoing network traffic from the instance. The number reported is the number of
     * bytes sent during the period. Because this metric is reported in 5-minute intervals, divide the reported number
     * by 300 to find Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed</code> </b> — Reports whether the instance passed or failed both the instance status
     * check and the system status check. This metric can be either 0 (passed) or 1 (failed). This metric data is
     * available in 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_Instance</code> </b> — Reports whether the instance passed or failed the instance
     * status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60
     * seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_System</code> </b> — Reports whether the instance passed or failed the system status
     * check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60 seconds)
     * granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The metric for which you want to return information.</p>
     *        <p>
     *        Valid instance metric names are listed below, along with the most useful <code>statistics</code> to
     *        include in your request, and the published <code>unit</code> value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>CPUUtilization</code> </b> — The percentage of allocated compute units that are currently in use
     *        on the instance. This metric identifies the processing power to run the applications on the instance.
     *        Tools in your operating system can show a lower percentage than Lightsail when the instance is not
     *        allocated a full processor core.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkIn</code> </b> — The number of bytes received on all network interfaces by the instance.
     *        This metric identifies the volume of incoming network traffic to the instance. The number reported is the
     *        number of bytes received during the period. Because this metric is reported in 5-minute intervals, divide
     *        the reported number by 300 to find Bytes/second.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Bytes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkOut</code> </b> — The number of bytes sent out on all network interfaces by the instance.
     *        This metric identifies the volume of outgoing network traffic from the instance. The number reported is
     *        the number of bytes sent during the period. Because this metric is reported in 5-minute intervals, divide
     *        the reported number by 300 to find Bytes/second.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Bytes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StatusCheckFailed</code> </b> — Reports whether the instance passed or failed both the instance
     *        status check and the system status check. This metric can be either 0 (passed) or 1 (failed). This metric
     *        data is available in 1-minute (60 seconds) granularity.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StatusCheckFailed_Instance</code> </b> — Reports whether the instance passed or failed the
     *        instance status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available
     *        in 1-minute (60 seconds) granularity.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StatusCheckFailed_System</code> </b> — Reports whether the instance passed or failed the system
     *        status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in
     *        1-minute (60 seconds) granularity.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     * @see InstanceMetricName
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid instance metric names are listed below, along with the most useful <code>statistics</code> to include in
     * your request, and the published <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUtilization</code> </b> — The percentage of allocated compute units that are currently in use on the
     * instance. This metric identifies the processing power to run the applications on the instance. Tools in your
     * operating system can show a lower percentage than Lightsail when the instance is not allocated a full processor
     * core.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkIn</code> </b> — The number of bytes received on all network interfaces by the instance. This
     * metric identifies the volume of incoming network traffic to the instance. The number reported is the number of
     * bytes received during the period. Because this metric is reported in 5-minute intervals, divide the reported
     * number by 300 to find Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkOut</code> </b> — The number of bytes sent out on all network interfaces by the instance. This
     * metric identifies the volume of outgoing network traffic from the instance. The number reported is the number of
     * bytes sent during the period. Because this metric is reported in 5-minute intervals, divide the reported number
     * by 300 to find Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed</code> </b> — Reports whether the instance passed or failed both the instance status
     * check and the system status check. This metric can be either 0 (passed) or 1 (failed). This metric data is
     * available in 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_Instance</code> </b> — Reports whether the instance passed or failed the instance
     * status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60
     * seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_System</code> </b> — Reports whether the instance passed or failed the system status
     * check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60 seconds)
     * granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The metric for which you want to return information.</p>
     *         <p>
     *         Valid instance metric names are listed below, along with the most useful <code>statistics</code> to
     *         include in your request, and the published <code>unit</code> value.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b> <code>CPUUtilization</code> </b> — The percentage of allocated compute units that are currently in
     *         use on the instance. This metric identifies the processing power to run the applications on the instance.
     *         Tools in your operating system can show a lower percentage than Lightsail when the instance is not
     *         allocated a full processor core.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Percent</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>NetworkIn</code> </b> — The number of bytes received on all network interfaces by the instance.
     *         This metric identifies the volume of incoming network traffic to the instance. The number reported is the
     *         number of bytes received during the period. Because this metric is reported in 5-minute intervals, divide
     *         the reported number by 300 to find Bytes/second.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Bytes</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>NetworkOut</code> </b> — The number of bytes sent out on all network interfaces by the
     *         instance. This metric identifies the volume of outgoing network traffic from the instance. The number
     *         reported is the number of bytes sent during the period. Because this metric is reported in 5-minute
     *         intervals, divide the reported number by 300 to find Bytes/second.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Bytes</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>StatusCheckFailed</code> </b> — Reports whether the instance passed or failed both the instance
     *         status check and the system status check. This metric can be either 0 (passed) or 1 (failed). This metric
     *         data is available in 1-minute (60 seconds) granularity.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Count</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>StatusCheckFailed_Instance</code> </b> — Reports whether the instance passed or failed the
     *         instance status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available
     *         in 1-minute (60 seconds) granularity.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Count</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b> <code>StatusCheckFailed_System</code> </b> — Reports whether the instance passed or failed the system
     *         status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in
     *         1-minute (60 seconds) granularity.
     *         </p>
     *         <p>
     *         <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *         </p>
     *         <p>
     *         <code>Unit</code>: The published unit is <code>Count</code>.
     *         </p>
     *         </li>
     * @see InstanceMetricName
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid instance metric names are listed below, along with the most useful <code>statistics</code> to include in
     * your request, and the published <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUtilization</code> </b> — The percentage of allocated compute units that are currently in use on the
     * instance. This metric identifies the processing power to run the applications on the instance. Tools in your
     * operating system can show a lower percentage than Lightsail when the instance is not allocated a full processor
     * core.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkIn</code> </b> — The number of bytes received on all network interfaces by the instance. This
     * metric identifies the volume of incoming network traffic to the instance. The number reported is the number of
     * bytes received during the period. Because this metric is reported in 5-minute intervals, divide the reported
     * number by 300 to find Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkOut</code> </b> — The number of bytes sent out on all network interfaces by the instance. This
     * metric identifies the volume of outgoing network traffic from the instance. The number reported is the number of
     * bytes sent during the period. Because this metric is reported in 5-minute intervals, divide the reported number
     * by 300 to find Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed</code> </b> — Reports whether the instance passed or failed both the instance status
     * check and the system status check. This metric can be either 0 (passed) or 1 (failed). This metric data is
     * available in 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_Instance</code> </b> — Reports whether the instance passed or failed the instance
     * status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60
     * seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_System</code> </b> — Reports whether the instance passed or failed the system status
     * check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60 seconds)
     * granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The metric for which you want to return information.</p>
     *        <p>
     *        Valid instance metric names are listed below, along with the most useful <code>statistics</code> to
     *        include in your request, and the published <code>unit</code> value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>CPUUtilization</code> </b> — The percentage of allocated compute units that are currently in use
     *        on the instance. This metric identifies the processing power to run the applications on the instance.
     *        Tools in your operating system can show a lower percentage than Lightsail when the instance is not
     *        allocated a full processor core.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkIn</code> </b> — The number of bytes received on all network interfaces by the instance.
     *        This metric identifies the volume of incoming network traffic to the instance. The number reported is the
     *        number of bytes received during the period. Because this metric is reported in 5-minute intervals, divide
     *        the reported number by 300 to find Bytes/second.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Bytes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkOut</code> </b> — The number of bytes sent out on all network interfaces by the instance.
     *        This metric identifies the volume of outgoing network traffic from the instance. The number reported is
     *        the number of bytes sent during the period. Because this metric is reported in 5-minute intervals, divide
     *        the reported number by 300 to find Bytes/second.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Bytes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StatusCheckFailed</code> </b> — Reports whether the instance passed or failed both the instance
     *        status check and the system status check. This metric can be either 0 (passed) or 1 (failed). This metric
     *        data is available in 1-minute (60 seconds) granularity.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StatusCheckFailed_Instance</code> </b> — Reports whether the instance passed or failed the
     *        instance status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available
     *        in 1-minute (60 seconds) granularity.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StatusCheckFailed_System</code> </b> — Reports whether the instance passed or failed the system
     *        status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in
     *        1-minute (60 seconds) granularity.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMetricName
     */

    public GetInstanceMetricDataRequest withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid instance metric names are listed below, along with the most useful <code>statistics</code> to include in
     * your request, and the published <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUtilization</code> </b> — The percentage of allocated compute units that are currently in use on the
     * instance. This metric identifies the processing power to run the applications on the instance. Tools in your
     * operating system can show a lower percentage than Lightsail when the instance is not allocated a full processor
     * core.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkIn</code> </b> — The number of bytes received on all network interfaces by the instance. This
     * metric identifies the volume of incoming network traffic to the instance. The number reported is the number of
     * bytes received during the period. Because this metric is reported in 5-minute intervals, divide the reported
     * number by 300 to find Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkOut</code> </b> — The number of bytes sent out on all network interfaces by the instance. This
     * metric identifies the volume of outgoing network traffic from the instance. The number reported is the number of
     * bytes sent during the period. Because this metric is reported in 5-minute intervals, divide the reported number
     * by 300 to find Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed</code> </b> — Reports whether the instance passed or failed both the instance status
     * check and the system status check. This metric can be either 0 (passed) or 1 (failed). This metric data is
     * available in 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_Instance</code> </b> — Reports whether the instance passed or failed the instance
     * status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60
     * seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_System</code> </b> — Reports whether the instance passed or failed the system status
     * check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60 seconds)
     * granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The metric for which you want to return information.</p>
     *        <p>
     *        Valid instance metric names are listed below, along with the most useful <code>statistics</code> to
     *        include in your request, and the published <code>unit</code> value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>CPUUtilization</code> </b> — The percentage of allocated compute units that are currently in use
     *        on the instance. This metric identifies the processing power to run the applications on the instance.
     *        Tools in your operating system can show a lower percentage than Lightsail when the instance is not
     *        allocated a full processor core.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkIn</code> </b> — The number of bytes received on all network interfaces by the instance.
     *        This metric identifies the volume of incoming network traffic to the instance. The number reported is the
     *        number of bytes received during the period. Because this metric is reported in 5-minute intervals, divide
     *        the reported number by 300 to find Bytes/second.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Bytes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkOut</code> </b> — The number of bytes sent out on all network interfaces by the instance.
     *        This metric identifies the volume of outgoing network traffic from the instance. The number reported is
     *        the number of bytes sent during the period. Because this metric is reported in 5-minute intervals, divide
     *        the reported number by 300 to find Bytes/second.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Bytes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StatusCheckFailed</code> </b> — Reports whether the instance passed or failed both the instance
     *        status check and the system status check. This metric can be either 0 (passed) or 1 (failed). This metric
     *        data is available in 1-minute (60 seconds) granularity.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StatusCheckFailed_Instance</code> </b> — Reports whether the instance passed or failed the
     *        instance status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available
     *        in 1-minute (60 seconds) granularity.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StatusCheckFailed_System</code> </b> — Reports whether the instance passed or failed the system
     *        status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in
     *        1-minute (60 seconds) granularity.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     * @see InstanceMetricName
     */

    public void setMetricName(InstanceMetricName metricName) {
        withMetricName(metricName);
    }

    /**
     * <p>
     * The metric for which you want to return information.
     * </p>
     * <p>
     * Valid instance metric names are listed below, along with the most useful <code>statistics</code> to include in
     * your request, and the published <code>unit</code> value.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b> <code>CPUUtilization</code> </b> — The percentage of allocated compute units that are currently in use on the
     * instance. This metric identifies the processing power to run the applications on the instance. Tools in your
     * operating system can show a lower percentage than Lightsail when the instance is not allocated a full processor
     * core.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Percent</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkIn</code> </b> — The number of bytes received on all network interfaces by the instance. This
     * metric identifies the volume of incoming network traffic to the instance. The number reported is the number of
     * bytes received during the period. Because this metric is reported in 5-minute intervals, divide the reported
     * number by 300 to find Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>NetworkOut</code> </b> — The number of bytes sent out on all network interfaces by the instance. This
     * metric identifies the volume of outgoing network traffic from the instance. The number reported is the number of
     * bytes sent during the period. Because this metric is reported in 5-minute intervals, divide the reported number
     * by 300 to find Bytes/second.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Bytes</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed</code> </b> — Reports whether the instance passed or failed both the instance status
     * check and the system status check. This metric can be either 0 (passed) or 1 (failed). This metric data is
     * available in 1-minute (60 seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_Instance</code> </b> — Reports whether the instance passed or failed the instance
     * status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60
     * seconds) granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <b> <code>StatusCheckFailed_System</code> </b> — Reports whether the instance passed or failed the system status
     * check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in 1-minute (60 seconds)
     * granularity.
     * </p>
     * <p>
     * <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     * </p>
     * <p>
     * <code>Unit</code>: The published unit is <code>Count</code>.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The metric for which you want to return information.</p>
     *        <p>
     *        Valid instance metric names are listed below, along with the most useful <code>statistics</code> to
     *        include in your request, and the published <code>unit</code> value.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b> <code>CPUUtilization</code> </b> — The percentage of allocated compute units that are currently in use
     *        on the instance. This metric identifies the processing power to run the applications on the instance.
     *        Tools in your operating system can show a lower percentage than Lightsail when the instance is not
     *        allocated a full processor core.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistics are <code>Maximum</code> and <code>Average</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Percent</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkIn</code> </b> — The number of bytes received on all network interfaces by the instance.
     *        This metric identifies the volume of incoming network traffic to the instance. The number reported is the
     *        number of bytes received during the period. Because this metric is reported in 5-minute intervals, divide
     *        the reported number by 300 to find Bytes/second.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Bytes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>NetworkOut</code> </b> — The number of bytes sent out on all network interfaces by the instance.
     *        This metric identifies the volume of outgoing network traffic from the instance. The number reported is
     *        the number of bytes sent during the period. Because this metric is reported in 5-minute intervals, divide
     *        the reported number by 300 to find Bytes/second.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Bytes</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StatusCheckFailed</code> </b> — Reports whether the instance passed or failed both the instance
     *        status check and the system status check. This metric can be either 0 (passed) or 1 (failed). This metric
     *        data is available in 1-minute (60 seconds) granularity.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StatusCheckFailed_Instance</code> </b> — Reports whether the instance passed or failed the
     *        instance status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available
     *        in 1-minute (60 seconds) granularity.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b> <code>StatusCheckFailed_System</code> </b> — Reports whether the instance passed or failed the system
     *        status check. This metric can be either 0 (passed) or 1 (failed). This metric data is available in
     *        1-minute (60 seconds) granularity.
     *        </p>
     *        <p>
     *        <code>Statistics</code>: The most useful statistic is <code>Sum</code>.
     *        </p>
     *        <p>
     *        <code>Unit</code>: The published unit is <code>Count</code>.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InstanceMetricName
     */

    public GetInstanceMetricDataRequest withMetricName(InstanceMetricName metricName) {
        this.metricName = metricName.toString();
        return this;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <p>
     * The <code>StatusCheckFailed</code>, <code>StatusCheckFailed_Instance</code>, and
     * <code>StatusCheckFailed_System</code> instance metric data is available in 1-minute (60 seconds) granularity. All
     * other instance metric data is available in 5-minute (300 seconds) granularity.
     * </p>
     * 
     * @param period
     *        The granularity, in seconds, of the returned data points.</p>
     *        <p>
     *        The <code>StatusCheckFailed</code>, <code>StatusCheckFailed_Instance</code>, and
     *        <code>StatusCheckFailed_System</code> instance metric data is available in 1-minute (60 seconds)
     *        granularity. All other instance metric data is available in 5-minute (300 seconds) granularity.
     */

    public void setPeriod(Integer period) {
        this.period = period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <p>
     * The <code>StatusCheckFailed</code>, <code>StatusCheckFailed_Instance</code>, and
     * <code>StatusCheckFailed_System</code> instance metric data is available in 1-minute (60 seconds) granularity. All
     * other instance metric data is available in 5-minute (300 seconds) granularity.
     * </p>
     * 
     * @return The granularity, in seconds, of the returned data points.</p>
     *         <p>
     *         The <code>StatusCheckFailed</code>, <code>StatusCheckFailed_Instance</code>, and
     *         <code>StatusCheckFailed_System</code> instance metric data is available in 1-minute (60 seconds)
     *         granularity. All other instance metric data is available in 5-minute (300 seconds) granularity.
     */

    public Integer getPeriod() {
        return this.period;
    }

    /**
     * <p>
     * The granularity, in seconds, of the returned data points.
     * </p>
     * <p>
     * The <code>StatusCheckFailed</code>, <code>StatusCheckFailed_Instance</code>, and
     * <code>StatusCheckFailed_System</code> instance metric data is available in 1-minute (60 seconds) granularity. All
     * other instance metric data is available in 5-minute (300 seconds) granularity.
     * </p>
     * 
     * @param period
     *        The granularity, in seconds, of the returned data points.</p>
     *        <p>
     *        The <code>StatusCheckFailed</code>, <code>StatusCheckFailed_Instance</code>, and
     *        <code>StatusCheckFailed_System</code> instance metric data is available in 1-minute (60 seconds)
     *        granularity. All other instance metric data is available in 5-minute (300 seconds) granularity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceMetricDataRequest withPeriod(Integer period) {
        setPeriod(period);
        return this;
    }

    /**
     * <p>
     * The start time of the time period.
     * </p>
     * 
     * @param startTime
     *        The start time of the time period.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The start time of the time period.
     * </p>
     * 
     * @return The start time of the time period.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The start time of the time period.
     * </p>
     * 
     * @param startTime
     *        The start time of the time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceMetricDataRequest withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The end time of the time period.
     * </p>
     * 
     * @param endTime
     *        The end time of the time period.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The end time of the time period.
     * </p>
     * 
     * @return The end time of the time period.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The end time of the time period.
     * </p>
     * 
     * @param endTime
     *        The end time of the time period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetInstanceMetricDataRequest withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The unit for the metric data request. Valid units depend on the metric data being required. For the valid units
     * with each available metric, see the <code>metricName</code> parameter.
     * </p>
     * 
     * @param unit
     *        The unit for the metric data request. Valid units depend on the metric data being required. For the valid
     *        units with each available metric, see the <code>metricName</code> parameter.
     * @see MetricUnit
     */

    public void setUnit(String unit) {
        this.unit = unit;
    }

    /**
     * <p>
     * The unit for the metric data request. Valid units depend on the metric data being required. For the valid units
     * with each available metric, see the <code>metricName</code> parameter.
     * </p>
     * 
     * @return The unit for the metric data request. Valid units depend on the metric data being required. For the valid
     *         units with each available metric, see the <code>metricName</code> parameter.
     * @see MetricUnit
     */

    public String getUnit() {
        return this.unit;
    }

    /**
     * <p>
     * The unit for the metric data request. Valid units depend on the metric data being required. For the valid units
     * with each available metric, see the <code>metricName</code> parameter.
     * </p>
     * 
     * @param unit
     *        The unit for the metric data request. Valid units depend on the metric data being required. For the valid
     *        units with each available metric, see the <code>metricName</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricUnit
     */

    public GetInstanceMetricDataRequest withUnit(String unit) {
        setUnit(unit);
        return this;
    }

    /**
     * <p>
     * The unit for the metric data request. Valid units depend on the metric data being required. For the valid units
     * with each available metric, see the <code>metricName</code> parameter.
     * </p>
     * 
     * @param unit
     *        The unit for the metric data request. Valid units depend on the metric data being required. For the valid
     *        units with each available metric, see the <code>metricName</code> parameter.
     * @see MetricUnit
     */

    public void setUnit(MetricUnit unit) {
        withUnit(unit);
    }

    /**
     * <p>
     * The unit for the metric data request. Valid units depend on the metric data being required. For the valid units
     * with each available metric, see the <code>metricName</code> parameter.
     * </p>
     * 
     * @param unit
     *        The unit for the metric data request. Valid units depend on the metric data being required. For the valid
     *        units with each available metric, see the <code>metricName</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricUnit
     */

    public GetInstanceMetricDataRequest withUnit(MetricUnit unit) {
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
     * <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
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
     *         <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine
     *         low volumes of activity for your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Maximum</code> — The highest value observed during the specified period. Use this value to
     *         determine high volumes of activity for your application.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Sum</code> — All values submitted for the matching metric added together. You can use this
     *         statistic to determine the total volume of a metric.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this
     *         statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close
     *         the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase
     *         or decrease your resources.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
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
     * <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
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
     *        <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this
     *        statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close
     *        the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase
     *        or decrease your resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
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
     * <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
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
     *        <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this
     *        statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close
     *        the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase
     *        or decrease your resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetInstanceMetricDataRequest withStatistics(String... statistics) {
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
     * <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
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
     *        <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this
     *        statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close
     *        the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase
     *        or decrease your resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetInstanceMetricDataRequest withStatistics(java.util.Collection<String> statistics) {
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
     * <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine low
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine high
     * volumes of activity for your application.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic to
     * determine the total volume of a metric.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this statistic
     * with the Minimum and Maximum values, you can determine the full scope of a metric and how close the average use
     * is to the Minimum and Maximum values. This comparison helps you to know when to increase or decrease your
     * resources.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
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
     *        <code>Minimum</code> — The lowest value observed during the specified period. Use this value to determine
     *        low volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Maximum</code> — The highest value observed during the specified period. Use this value to determine
     *        high volumes of activity for your application.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Sum</code> — All values submitted for the matching metric added together. You can use this statistic
     *        to determine the total volume of a metric.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Average</code> — The value of Sum / SampleCount during the specified period. By comparing this
     *        statistic with the Minimum and Maximum values, you can determine the full scope of a metric and how close
     *        the average use is to the Minimum and Maximum values. This comparison helps you to know when to increase
     *        or decrease your resources.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SampleCount</code> — The count, or number, of data points used for the statistical calculation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public GetInstanceMetricDataRequest withStatistics(MetricStatistic... statistics) {
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
        if (getInstanceName() != null)
            sb.append("InstanceName: ").append(getInstanceName()).append(",");
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getPeriod() != null)
            sb.append("Period: ").append(getPeriod()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
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

        if (obj instanceof GetInstanceMetricDataRequest == false)
            return false;
        GetInstanceMetricDataRequest other = (GetInstanceMetricDataRequest) obj;
        if (other.getInstanceName() == null ^ this.getInstanceName() == null)
            return false;
        if (other.getInstanceName() != null && other.getInstanceName().equals(this.getInstanceName()) == false)
            return false;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getPeriod() == null ^ this.getPeriod() == null)
            return false;
        if (other.getPeriod() != null && other.getPeriod().equals(this.getPeriod()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
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

        hashCode = prime * hashCode + ((getInstanceName() == null) ? 0 : getInstanceName().hashCode());
        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getPeriod() == null) ? 0 : getPeriod().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getUnit() == null) ? 0 : getUnit().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        return hashCode;
    }

    @Override
    public GetInstanceMetricDataRequest clone() {
        return (GetInstanceMetricDataRequest) super.clone();
    }

}
