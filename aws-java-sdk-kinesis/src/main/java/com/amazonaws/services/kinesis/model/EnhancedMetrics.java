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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents enhanced metrics types.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/EnhancedMetrics" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EnhancedMetrics implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * List of shard-level metrics.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "<code>ALL</code>" enhances every metric.
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
     * List of shard-level metrics.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "<code>ALL</code>" enhances every metric.
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
     * @return List of shard-level metrics.</p>
     *         <p>
     *         The following are the valid shard-level metrics. The value "<code>ALL</code>" enhances every metric.
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
     * List of shard-level metrics.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "<code>ALL</code>" enhances every metric.
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
     *        List of shard-level metrics.</p>
     *        <p>
     *        The following are the valid shard-level metrics. The value "<code>ALL</code>" enhances every metric.
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
     * List of shard-level metrics.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "<code>ALL</code>" enhances every metric.
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
     *        List of shard-level metrics.</p>
     *        <p>
     *        The following are the valid shard-level metrics. The value "<code>ALL</code>" enhances every metric.
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

    public EnhancedMetrics withShardLevelMetrics(String... shardLevelMetrics) {
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
     * List of shard-level metrics.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "<code>ALL</code>" enhances every metric.
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
     *        List of shard-level metrics.</p>
     *        <p>
     *        The following are the valid shard-level metrics. The value "<code>ALL</code>" enhances every metric.
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

    public EnhancedMetrics withShardLevelMetrics(java.util.Collection<String> shardLevelMetrics) {
        setShardLevelMetrics(shardLevelMetrics);
        return this;
    }

    /**
     * <p>
     * List of shard-level metrics.
     * </p>
     * <p>
     * The following are the valid shard-level metrics. The value "<code>ALL</code>" enhances every metric.
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
     *        List of shard-level metrics.</p>
     *        <p>
     *        The following are the valid shard-level metrics. The value "<code>ALL</code>" enhances every metric.
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

    public EnhancedMetrics withShardLevelMetrics(MetricsName... shardLevelMetrics) {
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

        if (obj instanceof EnhancedMetrics == false)
            return false;
        EnhancedMetrics other = (EnhancedMetrics) obj;
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

        hashCode = prime * hashCode + ((getShardLevelMetrics() == null) ? 0 : getShardLevelMetrics().hashCode());
        return hashCode;
    }

    @Override
    public EnhancedMetrics clone() {
        try {
            return (EnhancedMetrics) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesis.model.transform.EnhancedMetricsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
