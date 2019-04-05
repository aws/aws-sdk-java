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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input for <a>EnableEnhancedMonitoring</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/EnableEnhancedMonitoring" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnableEnhancedMonitoringRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream for which to enable enhanced monitoring.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * List of shard-level metrics to enable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "<code>ALL</code>" enables every metric.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IncomingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncomingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WriteProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IteratorAgeMilliseconds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html">Monitoring the Amazon
     * Kinesis Data Streams Service with Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> shardLevelMetrics;

    /**
     * <p>
     * The name of the stream for which to enable enhanced monitoring.
     * </p>
     * 
     * @param streamName
     *        The name of the stream for which to enable enhanced monitoring.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream for which to enable enhanced monitoring.
     * </p>
     * 
     * @return The name of the stream for which to enable enhanced monitoring.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream for which to enable enhanced monitoring.
     * </p>
     * 
     * @param streamName
     *        The name of the stream for which to enable enhanced monitoring.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EnableEnhancedMonitoringRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * List of shard-level metrics to enable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "<code>ALL</code>" enables every metric.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IncomingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncomingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WriteProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IteratorAgeMilliseconds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html">Monitoring the Amazon
     * Kinesis Data Streams Service with Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     * 
     * @return List of shard-level metrics to enable.</p>
     *         <p>
     *         The following are the valid shard-level metrics. The value "<code>ALL</code>" enables every metric.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>IncomingBytes</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IncomingRecords</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OutgoingBytes</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OutgoingRecords</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>WriteProvisionedThroughputExceeded</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ReadProvisionedThroughputExceeded</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>IteratorAgeMilliseconds</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>ALL</code>
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html">Monitoring the
     *         Amazon Kinesis Data Streams Service with Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams
     *         Developer Guide</i>.
     * @see MetricsName
     */

    public java.util.List<String> getShardLevelMetrics() {
        if (shardLevelMetrics == null) {
            shardLevelMetrics = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return shardLevelMetrics;
    }

    /**
     * <p>
     * List of shard-level metrics to enable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "<code>ALL</code>" enables every metric.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IncomingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncomingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WriteProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IteratorAgeMilliseconds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html">Monitoring the Amazon
     * Kinesis Data Streams Service with Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     * 
     * @param shardLevelMetrics
     *        List of shard-level metrics to enable.</p>
     *        <p>
     *        The following are the valid shard-level metrics. The value "<code>ALL</code>" enables every metric.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IncomingBytes</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IncomingRecords</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OutgoingBytes</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OutgoingRecords</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WriteProvisionedThroughputExceeded</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadProvisionedThroughputExceeded</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IteratorAgeMilliseconds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html">Monitoring the Amazon
     *        Kinesis Data Streams Service with Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer
     *        Guide</i>.
     * @see MetricsName
     */

    public void setShardLevelMetrics(java.util.Collection<String> shardLevelMetrics) {
        if (shardLevelMetrics == null) {
            this.shardLevelMetrics = null;
            return;
        }

        this.shardLevelMetrics = new com.amazonaws.internal.SdkInternalList<String>(shardLevelMetrics);
    }

    /**
     * <p>
     * List of shard-level metrics to enable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "<code>ALL</code>" enables every metric.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IncomingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncomingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WriteProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IteratorAgeMilliseconds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html">Monitoring the Amazon
     * Kinesis Data Streams Service with Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setShardLevelMetrics(java.util.Collection)} or {@link #withShardLevelMetrics(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param shardLevelMetrics
     *        List of shard-level metrics to enable.</p>
     *        <p>
     *        The following are the valid shard-level metrics. The value "<code>ALL</code>" enables every metric.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IncomingBytes</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IncomingRecords</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OutgoingBytes</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OutgoingRecords</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WriteProvisionedThroughputExceeded</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadProvisionedThroughputExceeded</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IteratorAgeMilliseconds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html">Monitoring the Amazon
     *        Kinesis Data Streams Service with Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsName
     */

    public EnableEnhancedMonitoringRequest withShardLevelMetrics(String... shardLevelMetrics) {
        if (this.shardLevelMetrics == null) {
            setShardLevelMetrics(new com.amazonaws.internal.SdkInternalList<String>(shardLevelMetrics.length));
        }
        for (String ele : shardLevelMetrics) {
            this.shardLevelMetrics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * List of shard-level metrics to enable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "<code>ALL</code>" enables every metric.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IncomingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncomingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WriteProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IteratorAgeMilliseconds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html">Monitoring the Amazon
     * Kinesis Data Streams Service with Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     * 
     * @param shardLevelMetrics
     *        List of shard-level metrics to enable.</p>
     *        <p>
     *        The following are the valid shard-level metrics. The value "<code>ALL</code>" enables every metric.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IncomingBytes</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IncomingRecords</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OutgoingBytes</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OutgoingRecords</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WriteProvisionedThroughputExceeded</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadProvisionedThroughputExceeded</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IteratorAgeMilliseconds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html">Monitoring the Amazon
     *        Kinesis Data Streams Service with Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsName
     */

    public EnableEnhancedMonitoringRequest withShardLevelMetrics(java.util.Collection<String> shardLevelMetrics) {
        setShardLevelMetrics(shardLevelMetrics);
        return this;
    }

    /**
     * <p>
     * List of shard-level metrics to enable.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "<code>ALL</code>" enables every metric.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>IncomingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IncomingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingBytes</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OutgoingRecords</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>WriteProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ReadProvisionedThroughputExceeded</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>IteratorAgeMilliseconds</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>ALL</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html">Monitoring the Amazon
     * Kinesis Data Streams Service with Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer
     * Guide</i>.
     * </p>
     * 
     * @param shardLevelMetrics
     *        List of shard-level metrics to enable.</p>
     *        <p>
     *        The following are the valid shard-level metrics. The value "<code>ALL</code>" enables every metric.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>IncomingBytes</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IncomingRecords</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OutgoingBytes</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OutgoingRecords</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>WriteProvisionedThroughputExceeded</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ReadProvisionedThroughputExceeded</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>IteratorAgeMilliseconds</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>ALL</code>
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/kinesis/latest/dev/monitoring-with-cloudwatch.html">Monitoring the Amazon
     *        Kinesis Data Streams Service with Amazon CloudWatch</a> in the <i>Amazon Kinesis Data Streams Developer
     *        Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MetricsName
     */

    public EnableEnhancedMonitoringRequest withShardLevelMetrics(MetricsName... shardLevelMetrics) {
        com.amazonaws.internal.SdkInternalList<String> shardLevelMetricsCopy = new com.amazonaws.internal.SdkInternalList<String>(shardLevelMetrics.length);
        for (MetricsName value : shardLevelMetrics) {
            shardLevelMetricsCopy.add(value.toString());
        }
        if (getShardLevelMetrics() == null) {
            setShardLevelMetrics(shardLevelMetricsCopy);
        } else {
            getShardLevelMetrics().addAll(shardLevelMetricsCopy);
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getShardLevelMetrics() != null)
            sb.append("ShardLevelMetrics: ").append(getShardLevelMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EnableEnhancedMonitoringRequest == false)
            return false;
        EnableEnhancedMonitoringRequest other = (EnableEnhancedMonitoringRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getShardLevelMetrics() == null ^ this.getShardLevelMetrics() == null)
            return false;
        if (other.getShardLevelMetrics() != null && other.getShardLevelMetrics().equals(this.getShardLevelMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getShardLevelMetrics() == null) ? 0 : getShardLevelMetrics().hashCode());
        return hashCode;
    }

    @Override
    public EnableEnhancedMonitoringRequest clone() {
        return (EnableEnhancedMonitoringRequest) super.clone();
    }

}
