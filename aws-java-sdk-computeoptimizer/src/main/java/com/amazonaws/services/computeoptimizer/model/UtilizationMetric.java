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
package com.amazonaws.services.computeoptimizer.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a utilization metric of a resource, such as an Amazon EC2 instance.
 * </p>
 * <p>
 * Compare the utilization metric data of your resource against its projected utilization metric data to determine the
 * performance difference between your current resource and the recommended option.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/compute-optimizer-2019-11-01/UtilizationMetric"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UtilizationMetric implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the utilization metric.
     * </p>
     * <p>
     * The following utilization metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Cpu</code> - The percentage of allocated EC2 compute units that are currently in use on the instance. This
     * metric identifies the processing power required to run an application on the instance.
     * </p>
     * <p>
     * Depending on the instance type, tools in your operating system can show a lower percentage than CloudWatch when
     * the instance is not allocated a full processor core.
     * </p>
     * <p>
     * Units: Percent
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> - The percentage of memory that is currently in use on the instance. This metric identifies
     * the amount of memory required to run an application on the instance.
     * </p>
     * <p>
     * Units: Percent
     * </p>
     * <note>
     * <p>
     * The <code>Memory</code> metric is returned only for resources that have the unified CloudWatch agent installed on
     * them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>EBS_READ_OPS_PER_SECOND</code> - The completed read operations from all EBS volumes attached to the
     * instance in a specified period of time.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_WRITE_OPS_PER_SECOND</code> - The completed write operations to all EBS volumes attached to the
     * instance in a specified period of time.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_READ_BYTES_PER_SECOND</code> - The bytes read from all EBS volumes attached to the instance in a
     * specified period of time.
     * </p>
     * <p>
     * Unit: Bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_WRITE_BYTES_PER_SECOND</code> - The bytes written to all EBS volumes attached to the instance in a
     * specified period of time.
     * </p>
     * <p>
     * Unit: Bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_READ_OPS_PER_SECOND</code> - The completed read operations from all instance store volumes available
     * to the instance in a specified period of time.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_WRITE_OPS_PER_SECOND</code> - The completed write operations from all instance store volumes available
     * to the instance in a specified period of time.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_READ_BYTES_PER_SECOND</code> - The bytes read from all instance store volumes available to the
     * instance. This metric is used to determine the volume of the data the application reads from the disk of the
     * instance. This can be used to determine the speed of the application.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_WRITE_BYTES_PER_SECOND</code> - The bytes written to all instance store volumes available to the
     * instance. This metric is used to determine the volume of the data the application writes onto the disk of the
     * instance. This can be used to determine the speed of the application.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_IN_BYTES_PER_SECOND</code> - The number of bytes received by the instance on all network
     * interfaces. This metric identifies the volume of incoming network traffic to a single instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_OUT_BYTES_PER_SECOND</code> - The number of bytes sent out by the instance on all network
     * interfaces. This metric identifies the volume of outgoing network traffic from a single instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_PACKETS_IN_PER_SECOND</code> - The number of packets received by the instance on all network
     * interfaces. This metric identifies the volume of incoming traffic in terms of the number of packets on a single
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_PACKETS_OUT_PER_SECOND</code> - The number of packets sent out by the instance on all network
     * interfaces. This metric identifies the volume of outgoing traffic in terms of the number of packets on a single
     * instance.
     * </p>
     * </li>
     * </ul>
     */
    private String name;
    /**
     * <p>
     * The statistic of the utilization metric.
     * </p>
     * <p>
     * The Compute Optimizer API, AWS Command Line Interface (AWS CLI), and SDKs return utilization metrics using only
     * the <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     * </p>
     * <p>
     * The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     * statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing resource
     * recommendations</a> in the <i>AWS Compute Optimizer User Guide</i>. You can also get averaged utilization metric
     * data for your resources using Amazon CloudWatch. For more information, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon CloudWatch
     * User Guide</a>.
     * </p>
     */
    private String statistic;
    /**
     * <p>
     * The value of the utilization metric.
     * </p>
     */
    private Double value;

    /**
     * <p>
     * The name of the utilization metric.
     * </p>
     * <p>
     * The following utilization metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Cpu</code> - The percentage of allocated EC2 compute units that are currently in use on the instance. This
     * metric identifies the processing power required to run an application on the instance.
     * </p>
     * <p>
     * Depending on the instance type, tools in your operating system can show a lower percentage than CloudWatch when
     * the instance is not allocated a full processor core.
     * </p>
     * <p>
     * Units: Percent
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> - The percentage of memory that is currently in use on the instance. This metric identifies
     * the amount of memory required to run an application on the instance.
     * </p>
     * <p>
     * Units: Percent
     * </p>
     * <note>
     * <p>
     * The <code>Memory</code> metric is returned only for resources that have the unified CloudWatch agent installed on
     * them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>EBS_READ_OPS_PER_SECOND</code> - The completed read operations from all EBS volumes attached to the
     * instance in a specified period of time.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_WRITE_OPS_PER_SECOND</code> - The completed write operations to all EBS volumes attached to the
     * instance in a specified period of time.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_READ_BYTES_PER_SECOND</code> - The bytes read from all EBS volumes attached to the instance in a
     * specified period of time.
     * </p>
     * <p>
     * Unit: Bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_WRITE_BYTES_PER_SECOND</code> - The bytes written to all EBS volumes attached to the instance in a
     * specified period of time.
     * </p>
     * <p>
     * Unit: Bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_READ_OPS_PER_SECOND</code> - The completed read operations from all instance store volumes available
     * to the instance in a specified period of time.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_WRITE_OPS_PER_SECOND</code> - The completed write operations from all instance store volumes available
     * to the instance in a specified period of time.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_READ_BYTES_PER_SECOND</code> - The bytes read from all instance store volumes available to the
     * instance. This metric is used to determine the volume of the data the application reads from the disk of the
     * instance. This can be used to determine the speed of the application.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_WRITE_BYTES_PER_SECOND</code> - The bytes written to all instance store volumes available to the
     * instance. This metric is used to determine the volume of the data the application writes onto the disk of the
     * instance. This can be used to determine the speed of the application.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_IN_BYTES_PER_SECOND</code> - The number of bytes received by the instance on all network
     * interfaces. This metric identifies the volume of incoming network traffic to a single instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_OUT_BYTES_PER_SECOND</code> - The number of bytes sent out by the instance on all network
     * interfaces. This metric identifies the volume of outgoing network traffic from a single instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_PACKETS_IN_PER_SECOND</code> - The number of packets received by the instance on all network
     * interfaces. This metric identifies the volume of incoming traffic in terms of the number of packets on a single
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_PACKETS_OUT_PER_SECOND</code> - The number of packets sent out by the instance on all network
     * interfaces. This metric identifies the volume of outgoing traffic in terms of the number of packets on a single
     * instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the utilization metric.</p>
     *        <p>
     *        The following utilization metrics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Cpu</code> - The percentage of allocated EC2 compute units that are currently in use on the
     *        instance. This metric identifies the processing power required to run an application on the instance.
     *        </p>
     *        <p>
     *        Depending on the instance type, tools in your operating system can show a lower percentage than CloudWatch
     *        when the instance is not allocated a full processor core.
     *        </p>
     *        <p>
     *        Units: Percent
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Memory</code> - The percentage of memory that is currently in use on the instance. This metric
     *        identifies the amount of memory required to run an application on the instance.
     *        </p>
     *        <p>
     *        Units: Percent
     *        </p>
     *        <note>
     *        <p>
     *        The <code>Memory</code> metric is returned only for resources that have the unified CloudWatch agent
     *        installed on them. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory
     *        Utilization with the CloudWatch Agent</a>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>EBS_READ_OPS_PER_SECOND</code> - The completed read operations from all EBS volumes attached to the
     *        instance in a specified period of time.
     *        </p>
     *        <p>
     *        Unit: Count
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EBS_WRITE_OPS_PER_SECOND</code> - The completed write operations to all EBS volumes attached to the
     *        instance in a specified period of time.
     *        </p>
     *        <p>
     *        Unit: Count
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EBS_READ_BYTES_PER_SECOND</code> - The bytes read from all EBS volumes attached to the instance in a
     *        specified period of time.
     *        </p>
     *        <p>
     *        Unit: Bytes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EBS_WRITE_BYTES_PER_SECOND</code> - The bytes written to all EBS volumes attached to the instance in
     *        a specified period of time.
     *        </p>
     *        <p>
     *        Unit: Bytes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISK_READ_OPS_PER_SECOND</code> - The completed read operations from all instance store volumes
     *        available to the instance in a specified period of time.
     *        </p>
     *        <p>
     *        If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISK_WRITE_OPS_PER_SECOND</code> - The completed write operations from all instance store volumes
     *        available to the instance in a specified period of time.
     *        </p>
     *        <p>
     *        If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISK_READ_BYTES_PER_SECOND</code> - The bytes read from all instance store volumes available to the
     *        instance. This metric is used to determine the volume of the data the application reads from the disk of
     *        the instance. This can be used to determine the speed of the application.
     *        </p>
     *        <p>
     *        If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISK_WRITE_BYTES_PER_SECOND</code> - The bytes written to all instance store volumes available to
     *        the instance. This metric is used to determine the volume of the data the application writes onto the disk
     *        of the instance. This can be used to determine the speed of the application.
     *        </p>
     *        <p>
     *        If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_IN_BYTES_PER_SECOND</code> - The number of bytes received by the instance on all network
     *        interfaces. This metric identifies the volume of incoming network traffic to a single instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_OUT_BYTES_PER_SECOND</code> - The number of bytes sent out by the instance on all network
     *        interfaces. This metric identifies the volume of outgoing network traffic from a single instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_PACKETS_IN_PER_SECOND</code> - The number of packets received by the instance on all network
     *        interfaces. This metric identifies the volume of incoming traffic in terms of the number of packets on a
     *        single instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_PACKETS_OUT_PER_SECOND</code> - The number of packets sent out by the instance on all
     *        network interfaces. This metric identifies the volume of outgoing traffic in terms of the number of
     *        packets on a single instance.
     *        </p>
     *        </li>
     * @see MetricName
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the utilization metric.
     * </p>
     * <p>
     * The following utilization metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Cpu</code> - The percentage of allocated EC2 compute units that are currently in use on the instance. This
     * metric identifies the processing power required to run an application on the instance.
     * </p>
     * <p>
     * Depending on the instance type, tools in your operating system can show a lower percentage than CloudWatch when
     * the instance is not allocated a full processor core.
     * </p>
     * <p>
     * Units: Percent
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> - The percentage of memory that is currently in use on the instance. This metric identifies
     * the amount of memory required to run an application on the instance.
     * </p>
     * <p>
     * Units: Percent
     * </p>
     * <note>
     * <p>
     * The <code>Memory</code> metric is returned only for resources that have the unified CloudWatch agent installed on
     * them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>EBS_READ_OPS_PER_SECOND</code> - The completed read operations from all EBS volumes attached to the
     * instance in a specified period of time.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_WRITE_OPS_PER_SECOND</code> - The completed write operations to all EBS volumes attached to the
     * instance in a specified period of time.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_READ_BYTES_PER_SECOND</code> - The bytes read from all EBS volumes attached to the instance in a
     * specified period of time.
     * </p>
     * <p>
     * Unit: Bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_WRITE_BYTES_PER_SECOND</code> - The bytes written to all EBS volumes attached to the instance in a
     * specified period of time.
     * </p>
     * <p>
     * Unit: Bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_READ_OPS_PER_SECOND</code> - The completed read operations from all instance store volumes available
     * to the instance in a specified period of time.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_WRITE_OPS_PER_SECOND</code> - The completed write operations from all instance store volumes available
     * to the instance in a specified period of time.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_READ_BYTES_PER_SECOND</code> - The bytes read from all instance store volumes available to the
     * instance. This metric is used to determine the volume of the data the application reads from the disk of the
     * instance. This can be used to determine the speed of the application.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_WRITE_BYTES_PER_SECOND</code> - The bytes written to all instance store volumes available to the
     * instance. This metric is used to determine the volume of the data the application writes onto the disk of the
     * instance. This can be used to determine the speed of the application.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_IN_BYTES_PER_SECOND</code> - The number of bytes received by the instance on all network
     * interfaces. This metric identifies the volume of incoming network traffic to a single instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_OUT_BYTES_PER_SECOND</code> - The number of bytes sent out by the instance on all network
     * interfaces. This metric identifies the volume of outgoing network traffic from a single instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_PACKETS_IN_PER_SECOND</code> - The number of packets received by the instance on all network
     * interfaces. This metric identifies the volume of incoming traffic in terms of the number of packets on a single
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_PACKETS_OUT_PER_SECOND</code> - The number of packets sent out by the instance on all network
     * interfaces. This metric identifies the volume of outgoing traffic in terms of the number of packets on a single
     * instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the utilization metric.</p>
     *         <p>
     *         The following utilization metrics are available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>Cpu</code> - The percentage of allocated EC2 compute units that are currently in use on the
     *         instance. This metric identifies the processing power required to run an application on the instance.
     *         </p>
     *         <p>
     *         Depending on the instance type, tools in your operating system can show a lower percentage than
     *         CloudWatch when the instance is not allocated a full processor core.
     *         </p>
     *         <p>
     *         Units: Percent
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Memory</code> - The percentage of memory that is currently in use on the instance. This metric
     *         identifies the amount of memory required to run an application on the instance.
     *         </p>
     *         <p>
     *         Units: Percent
     *         </p>
     *         <note>
     *         <p>
     *         The <code>Memory</code> metric is returned only for resources that have the unified CloudWatch agent
     *         installed on them. For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory
     *         Utilization with the CloudWatch Agent</a>.
     *         </p>
     *         </note></li>
     *         <li>
     *         <p>
     *         <code>EBS_READ_OPS_PER_SECOND</code> - The completed read operations from all EBS volumes attached to the
     *         instance in a specified period of time.
     *         </p>
     *         <p>
     *         Unit: Count
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EBS_WRITE_OPS_PER_SECOND</code> - The completed write operations to all EBS volumes attached to the
     *         instance in a specified period of time.
     *         </p>
     *         <p>
     *         Unit: Count
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EBS_READ_BYTES_PER_SECOND</code> - The bytes read from all EBS volumes attached to the instance in
     *         a specified period of time.
     *         </p>
     *         <p>
     *         Unit: Bytes
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>EBS_WRITE_BYTES_PER_SECOND</code> - The bytes written to all EBS volumes attached to the instance
     *         in a specified period of time.
     *         </p>
     *         <p>
     *         Unit: Bytes
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISK_READ_OPS_PER_SECOND</code> - The completed read operations from all instance store volumes
     *         available to the instance in a specified period of time.
     *         </p>
     *         <p>
     *         If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISK_WRITE_OPS_PER_SECOND</code> - The completed write operations from all instance store volumes
     *         available to the instance in a specified period of time.
     *         </p>
     *         <p>
     *         If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISK_READ_BYTES_PER_SECOND</code> - The bytes read from all instance store volumes available to the
     *         instance. This metric is used to determine the volume of the data the application reads from the disk of
     *         the instance. This can be used to determine the speed of the application.
     *         </p>
     *         <p>
     *         If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DISK_WRITE_BYTES_PER_SECOND</code> - The bytes written to all instance store volumes available to
     *         the instance. This metric is used to determine the volume of the data the application writes onto the
     *         disk of the instance. This can be used to determine the speed of the application.
     *         </p>
     *         <p>
     *         If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NETWORK_IN_BYTES_PER_SECOND</code> - The number of bytes received by the instance on all network
     *         interfaces. This metric identifies the volume of incoming network traffic to a single instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NETWORK_OUT_BYTES_PER_SECOND</code> - The number of bytes sent out by the instance on all network
     *         interfaces. This metric identifies the volume of outgoing network traffic from a single instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NETWORK_PACKETS_IN_PER_SECOND</code> - The number of packets received by the instance on all
     *         network interfaces. This metric identifies the volume of incoming traffic in terms of the number of
     *         packets on a single instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NETWORK_PACKETS_OUT_PER_SECOND</code> - The number of packets sent out by the instance on all
     *         network interfaces. This metric identifies the volume of outgoing traffic in terms of the number of
     *         packets on a single instance.
     *         </p>
     *         </li>
     * @see MetricName
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the utilization metric.
     * </p>
     * <p>
     * The following utilization metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Cpu</code> - The percentage of allocated EC2 compute units that are currently in use on the instance. This
     * metric identifies the processing power required to run an application on the instance.
     * </p>
     * <p>
     * Depending on the instance type, tools in your operating system can show a lower percentage than CloudWatch when
     * the instance is not allocated a full processor core.
     * </p>
     * <p>
     * Units: Percent
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> - The percentage of memory that is currently in use on the instance. This metric identifies
     * the amount of memory required to run an application on the instance.
     * </p>
     * <p>
     * Units: Percent
     * </p>
     * <note>
     * <p>
     * The <code>Memory</code> metric is returned only for resources that have the unified CloudWatch agent installed on
     * them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>EBS_READ_OPS_PER_SECOND</code> - The completed read operations from all EBS volumes attached to the
     * instance in a specified period of time.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_WRITE_OPS_PER_SECOND</code> - The completed write operations to all EBS volumes attached to the
     * instance in a specified period of time.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_READ_BYTES_PER_SECOND</code> - The bytes read from all EBS volumes attached to the instance in a
     * specified period of time.
     * </p>
     * <p>
     * Unit: Bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_WRITE_BYTES_PER_SECOND</code> - The bytes written to all EBS volumes attached to the instance in a
     * specified period of time.
     * </p>
     * <p>
     * Unit: Bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_READ_OPS_PER_SECOND</code> - The completed read operations from all instance store volumes available
     * to the instance in a specified period of time.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_WRITE_OPS_PER_SECOND</code> - The completed write operations from all instance store volumes available
     * to the instance in a specified period of time.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_READ_BYTES_PER_SECOND</code> - The bytes read from all instance store volumes available to the
     * instance. This metric is used to determine the volume of the data the application reads from the disk of the
     * instance. This can be used to determine the speed of the application.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_WRITE_BYTES_PER_SECOND</code> - The bytes written to all instance store volumes available to the
     * instance. This metric is used to determine the volume of the data the application writes onto the disk of the
     * instance. This can be used to determine the speed of the application.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_IN_BYTES_PER_SECOND</code> - The number of bytes received by the instance on all network
     * interfaces. This metric identifies the volume of incoming network traffic to a single instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_OUT_BYTES_PER_SECOND</code> - The number of bytes sent out by the instance on all network
     * interfaces. This metric identifies the volume of outgoing network traffic from a single instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_PACKETS_IN_PER_SECOND</code> - The number of packets received by the instance on all network
     * interfaces. This metric identifies the volume of incoming traffic in terms of the number of packets on a single
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_PACKETS_OUT_PER_SECOND</code> - The number of packets sent out by the instance on all network
     * interfaces. This metric identifies the volume of outgoing traffic in terms of the number of packets on a single
     * instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the utilization metric.</p>
     *        <p>
     *        The following utilization metrics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Cpu</code> - The percentage of allocated EC2 compute units that are currently in use on the
     *        instance. This metric identifies the processing power required to run an application on the instance.
     *        </p>
     *        <p>
     *        Depending on the instance type, tools in your operating system can show a lower percentage than CloudWatch
     *        when the instance is not allocated a full processor core.
     *        </p>
     *        <p>
     *        Units: Percent
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Memory</code> - The percentage of memory that is currently in use on the instance. This metric
     *        identifies the amount of memory required to run an application on the instance.
     *        </p>
     *        <p>
     *        Units: Percent
     *        </p>
     *        <note>
     *        <p>
     *        The <code>Memory</code> metric is returned only for resources that have the unified CloudWatch agent
     *        installed on them. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory
     *        Utilization with the CloudWatch Agent</a>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>EBS_READ_OPS_PER_SECOND</code> - The completed read operations from all EBS volumes attached to the
     *        instance in a specified period of time.
     *        </p>
     *        <p>
     *        Unit: Count
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EBS_WRITE_OPS_PER_SECOND</code> - The completed write operations to all EBS volumes attached to the
     *        instance in a specified period of time.
     *        </p>
     *        <p>
     *        Unit: Count
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EBS_READ_BYTES_PER_SECOND</code> - The bytes read from all EBS volumes attached to the instance in a
     *        specified period of time.
     *        </p>
     *        <p>
     *        Unit: Bytes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EBS_WRITE_BYTES_PER_SECOND</code> - The bytes written to all EBS volumes attached to the instance in
     *        a specified period of time.
     *        </p>
     *        <p>
     *        Unit: Bytes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISK_READ_OPS_PER_SECOND</code> - The completed read operations from all instance store volumes
     *        available to the instance in a specified period of time.
     *        </p>
     *        <p>
     *        If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISK_WRITE_OPS_PER_SECOND</code> - The completed write operations from all instance store volumes
     *        available to the instance in a specified period of time.
     *        </p>
     *        <p>
     *        If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISK_READ_BYTES_PER_SECOND</code> - The bytes read from all instance store volumes available to the
     *        instance. This metric is used to determine the volume of the data the application reads from the disk of
     *        the instance. This can be used to determine the speed of the application.
     *        </p>
     *        <p>
     *        If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISK_WRITE_BYTES_PER_SECOND</code> - The bytes written to all instance store volumes available to
     *        the instance. This metric is used to determine the volume of the data the application writes onto the disk
     *        of the instance. This can be used to determine the speed of the application.
     *        </p>
     *        <p>
     *        If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_IN_BYTES_PER_SECOND</code> - The number of bytes received by the instance on all network
     *        interfaces. This metric identifies the volume of incoming network traffic to a single instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_OUT_BYTES_PER_SECOND</code> - The number of bytes sent out by the instance on all network
     *        interfaces. This metric identifies the volume of outgoing network traffic from a single instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_PACKETS_IN_PER_SECOND</code> - The number of packets received by the instance on all network
     *        interfaces. This metric identifies the volume of incoming traffic in terms of the number of packets on a
     *        single instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_PACKETS_OUT_PER_SECOND</code> - The number of packets sent out by the instance on all
     *        network interfaces. This metric identifies the volume of outgoing traffic in terms of the number of
     *        packets on a single instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricName
     */

    public UtilizationMetric withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name of the utilization metric.
     * </p>
     * <p>
     * The following utilization metrics are available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>Cpu</code> - The percentage of allocated EC2 compute units that are currently in use on the instance. This
     * metric identifies the processing power required to run an application on the instance.
     * </p>
     * <p>
     * Depending on the instance type, tools in your operating system can show a lower percentage than CloudWatch when
     * the instance is not allocated a full processor core.
     * </p>
     * <p>
     * Units: Percent
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Memory</code> - The percentage of memory that is currently in use on the instance. This metric identifies
     * the amount of memory required to run an application on the instance.
     * </p>
     * <p>
     * Units: Percent
     * </p>
     * <note>
     * <p>
     * The <code>Memory</code> metric is returned only for resources that have the unified CloudWatch agent installed on
     * them. For more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory Utilization
     * with the CloudWatch Agent</a>.
     * </p>
     * </note></li>
     * <li>
     * <p>
     * <code>EBS_READ_OPS_PER_SECOND</code> - The completed read operations from all EBS volumes attached to the
     * instance in a specified period of time.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_WRITE_OPS_PER_SECOND</code> - The completed write operations to all EBS volumes attached to the
     * instance in a specified period of time.
     * </p>
     * <p>
     * Unit: Count
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_READ_BYTES_PER_SECOND</code> - The bytes read from all EBS volumes attached to the instance in a
     * specified period of time.
     * </p>
     * <p>
     * Unit: Bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>EBS_WRITE_BYTES_PER_SECOND</code> - The bytes written to all EBS volumes attached to the instance in a
     * specified period of time.
     * </p>
     * <p>
     * Unit: Bytes
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_READ_OPS_PER_SECOND</code> - The completed read operations from all instance store volumes available
     * to the instance in a specified period of time.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_WRITE_OPS_PER_SECOND</code> - The completed write operations from all instance store volumes available
     * to the instance in a specified period of time.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_READ_BYTES_PER_SECOND</code> - The bytes read from all instance store volumes available to the
     * instance. This metric is used to determine the volume of the data the application reads from the disk of the
     * instance. This can be used to determine the speed of the application.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DISK_WRITE_BYTES_PER_SECOND</code> - The bytes written to all instance store volumes available to the
     * instance. This metric is used to determine the volume of the data the application writes onto the disk of the
     * instance. This can be used to determine the speed of the application.
     * </p>
     * <p>
     * If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_IN_BYTES_PER_SECOND</code> - The number of bytes received by the instance on all network
     * interfaces. This metric identifies the volume of incoming network traffic to a single instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_OUT_BYTES_PER_SECOND</code> - The number of bytes sent out by the instance on all network
     * interfaces. This metric identifies the volume of outgoing network traffic from a single instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_PACKETS_IN_PER_SECOND</code> - The number of packets received by the instance on all network
     * interfaces. This metric identifies the volume of incoming traffic in terms of the number of packets on a single
     * instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NETWORK_PACKETS_OUT_PER_SECOND</code> - The number of packets sent out by the instance on all network
     * interfaces. This metric identifies the volume of outgoing traffic in terms of the number of packets on a single
     * instance.
     * </p>
     * </li>
     * </ul>
     * 
     * @param name
     *        The name of the utilization metric.</p>
     *        <p>
     *        The following utilization metrics are available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>Cpu</code> - The percentage of allocated EC2 compute units that are currently in use on the
     *        instance. This metric identifies the processing power required to run an application on the instance.
     *        </p>
     *        <p>
     *        Depending on the instance type, tools in your operating system can show a lower percentage than CloudWatch
     *        when the instance is not allocated a full processor core.
     *        </p>
     *        <p>
     *        Units: Percent
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Memory</code> - The percentage of memory that is currently in use on the instance. This metric
     *        identifies the amount of memory required to run an application on the instance.
     *        </p>
     *        <p>
     *        Units: Percent
     *        </p>
     *        <note>
     *        <p>
     *        The <code>Memory</code> metric is returned only for resources that have the unified CloudWatch agent
     *        installed on them. For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/metrics.html#cw-agent">Enabling Memory
     *        Utilization with the CloudWatch Agent</a>.
     *        </p>
     *        </note></li>
     *        <li>
     *        <p>
     *        <code>EBS_READ_OPS_PER_SECOND</code> - The completed read operations from all EBS volumes attached to the
     *        instance in a specified period of time.
     *        </p>
     *        <p>
     *        Unit: Count
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EBS_WRITE_OPS_PER_SECOND</code> - The completed write operations to all EBS volumes attached to the
     *        instance in a specified period of time.
     *        </p>
     *        <p>
     *        Unit: Count
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EBS_READ_BYTES_PER_SECOND</code> - The bytes read from all EBS volumes attached to the instance in a
     *        specified period of time.
     *        </p>
     *        <p>
     *        Unit: Bytes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>EBS_WRITE_BYTES_PER_SECOND</code> - The bytes written to all EBS volumes attached to the instance in
     *        a specified period of time.
     *        </p>
     *        <p>
     *        Unit: Bytes
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISK_READ_OPS_PER_SECOND</code> - The completed read operations from all instance store volumes
     *        available to the instance in a specified period of time.
     *        </p>
     *        <p>
     *        If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISK_WRITE_OPS_PER_SECOND</code> - The completed write operations from all instance store volumes
     *        available to the instance in a specified period of time.
     *        </p>
     *        <p>
     *        If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISK_READ_BYTES_PER_SECOND</code> - The bytes read from all instance store volumes available to the
     *        instance. This metric is used to determine the volume of the data the application reads from the disk of
     *        the instance. This can be used to determine the speed of the application.
     *        </p>
     *        <p>
     *        If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DISK_WRITE_BYTES_PER_SECOND</code> - The bytes written to all instance store volumes available to
     *        the instance. This metric is used to determine the volume of the data the application writes onto the disk
     *        of the instance. This can be used to determine the speed of the application.
     *        </p>
     *        <p>
     *        If there are no instance store volumes, either the value is <code>0</code> or the metric is not reported.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_IN_BYTES_PER_SECOND</code> - The number of bytes received by the instance on all network
     *        interfaces. This metric identifies the volume of incoming network traffic to a single instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_OUT_BYTES_PER_SECOND</code> - The number of bytes sent out by the instance on all network
     *        interfaces. This metric identifies the volume of outgoing network traffic from a single instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_PACKETS_IN_PER_SECOND</code> - The number of packets received by the instance on all network
     *        interfaces. This metric identifies the volume of incoming traffic in terms of the number of packets on a
     *        single instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NETWORK_PACKETS_OUT_PER_SECOND</code> - The number of packets sent out by the instance on all
     *        network interfaces. This metric identifies the volume of outgoing traffic in terms of the number of
     *        packets on a single instance.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricName
     */

    public UtilizationMetric withName(MetricName name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The statistic of the utilization metric.
     * </p>
     * <p>
     * The Compute Optimizer API, AWS Command Line Interface (AWS CLI), and SDKs return utilization metrics using only
     * the <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     * </p>
     * <p>
     * The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     * statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing resource
     * recommendations</a> in the <i>AWS Compute Optimizer User Guide</i>. You can also get averaged utilization metric
     * data for your resources using Amazon CloudWatch. For more information, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon CloudWatch
     * User Guide</a>.
     * </p>
     * 
     * @param statistic
     *        The statistic of the utilization metric.</p>
     *        <p>
     *        The Compute Optimizer API, AWS Command Line Interface (AWS CLI), and SDKs return utilization metrics using
     *        only the <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     *        </p>
     *        <p>
     *        The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     *        statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing
     *        resource recommendations</a> in the <i>AWS Compute Optimizer User Guide</i>. You can also get averaged
     *        utilization metric data for your resources using Amazon CloudWatch. For more information, see the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon
     *        CloudWatch User Guide</a>.
     * @see MetricStatistic
     */

    public void setStatistic(String statistic) {
        this.statistic = statistic;
    }

    /**
     * <p>
     * The statistic of the utilization metric.
     * </p>
     * <p>
     * The Compute Optimizer API, AWS Command Line Interface (AWS CLI), and SDKs return utilization metrics using only
     * the <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     * </p>
     * <p>
     * The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     * statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing resource
     * recommendations</a> in the <i>AWS Compute Optimizer User Guide</i>. You can also get averaged utilization metric
     * data for your resources using Amazon CloudWatch. For more information, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon CloudWatch
     * User Guide</a>.
     * </p>
     * 
     * @return The statistic of the utilization metric.</p>
     *         <p>
     *         The Compute Optimizer API, AWS Command Line Interface (AWS CLI), and SDKs return utilization metrics
     *         using only the <code>Maximum</code> statistic, which is the highest value observed during the specified
     *         period.
     *         </p>
     *         <p>
     *         The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     *         statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period.
     *         For more information, see <a
     *         href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing
     *         resource recommendations</a> in the <i>AWS Compute Optimizer User Guide</i>. You can also get averaged
     *         utilization metric data for your resources using Amazon CloudWatch. For more information, see the <a
     *         href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon
     *         CloudWatch User Guide</a>.
     * @see MetricStatistic
     */

    public String getStatistic() {
        return this.statistic;
    }

    /**
     * <p>
     * The statistic of the utilization metric.
     * </p>
     * <p>
     * The Compute Optimizer API, AWS Command Line Interface (AWS CLI), and SDKs return utilization metrics using only
     * the <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     * </p>
     * <p>
     * The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     * statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing resource
     * recommendations</a> in the <i>AWS Compute Optimizer User Guide</i>. You can also get averaged utilization metric
     * data for your resources using Amazon CloudWatch. For more information, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon CloudWatch
     * User Guide</a>.
     * </p>
     * 
     * @param statistic
     *        The statistic of the utilization metric.</p>
     *        <p>
     *        The Compute Optimizer API, AWS Command Line Interface (AWS CLI), and SDKs return utilization metrics using
     *        only the <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     *        </p>
     *        <p>
     *        The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     *        statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing
     *        resource recommendations</a> in the <i>AWS Compute Optimizer User Guide</i>. You can also get averaged
     *        utilization metric data for your resources using Amazon CloudWatch. For more information, see the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon
     *        CloudWatch User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public UtilizationMetric withStatistic(String statistic) {
        setStatistic(statistic);
        return this;
    }

    /**
     * <p>
     * The statistic of the utilization metric.
     * </p>
     * <p>
     * The Compute Optimizer API, AWS Command Line Interface (AWS CLI), and SDKs return utilization metrics using only
     * the <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     * </p>
     * <p>
     * The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     * statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period. For
     * more information, see <a
     * href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing resource
     * recommendations</a> in the <i>AWS Compute Optimizer User Guide</i>. You can also get averaged utilization metric
     * data for your resources using Amazon CloudWatch. For more information, see the <a
     * href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon CloudWatch
     * User Guide</a>.
     * </p>
     * 
     * @param statistic
     *        The statistic of the utilization metric.</p>
     *        <p>
     *        The Compute Optimizer API, AWS Command Line Interface (AWS CLI), and SDKs return utilization metrics using
     *        only the <code>Maximum</code> statistic, which is the highest value observed during the specified period.
     *        </p>
     *        <p>
     *        The Compute Optimizer console displays graphs for some utilization metrics using the <code>Average</code>
     *        statistic, which is the value of <code>Sum</code> / <code>SampleCount</code> during the specified period.
     *        For more information, see <a
     *        href="https://docs.aws.amazon.com/compute-optimizer/latest/ug/viewing-recommendations.html">Viewing
     *        resource recommendations</a> in the <i>AWS Compute Optimizer User Guide</i>. You can also get averaged
     *        utilization metric data for your resources using Amazon CloudWatch. For more information, see the <a
     *        href="https://docs.aws.amazon.com/AmazonCloudWatch/latest/monitoring/WhatIsCloudWatch.html">Amazon
     *        CloudWatch User Guide</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricStatistic
     */

    public UtilizationMetric withStatistic(MetricStatistic statistic) {
        this.statistic = statistic.toString();
        return this;
    }

    /**
     * <p>
     * The value of the utilization metric.
     * </p>
     * 
     * @param value
     *        The value of the utilization metric.
     */

    public void setValue(Double value) {
        this.value = value;
    }

    /**
     * <p>
     * The value of the utilization metric.
     * </p>
     * 
     * @return The value of the utilization metric.
     */

    public Double getValue() {
        return this.value;
    }

    /**
     * <p>
     * The value of the utilization metric.
     * </p>
     * 
     * @param value
     *        The value of the utilization metric.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UtilizationMetric withValue(Double value) {
        setValue(value);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatistic() != null)
            sb.append("Statistic: ").append(getStatistic()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UtilizationMetric == false)
            return false;
        UtilizationMetric other = (UtilizationMetric) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatistic() == null ^ this.getStatistic() == null)
            return false;
        if (other.getStatistic() != null && other.getStatistic().equals(this.getStatistic()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatistic() == null) ? 0 : getStatistic().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public UtilizationMetric clone() {
        try {
            return (UtilizationMetric) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.computeoptimizer.model.transform.UtilizationMetricMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
