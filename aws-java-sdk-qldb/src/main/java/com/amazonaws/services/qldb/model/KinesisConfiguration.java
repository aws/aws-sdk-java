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
package com.amazonaws.services.qldb.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration settings of the Amazon Kinesis Data Streams destination for an Amazon QLDB journal stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/qldb-2019-01-02/KinesisConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis Data Streams resource.
     * </p>
     */
    private String streamArn;
    /**
     * <p>
     * Enables QLDB to publish multiple data records in a single Kinesis Data Streams record, increasing the number of
     * records sent per API call.
     * </p>
     * <p>
     * <i>This option is enabled by default.</i> Record aggregation has important implications for processing records
     * and requires de-aggregation in your stream consumer. To learn more, see <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html">KPL Key Concepts</a> and <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html">Consumer
     * De-aggregation</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     */
    private Boolean aggregationEnabled;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis Data Streams resource.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) of the Kinesis Data Streams resource.
     */

    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis Data Streams resource.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Kinesis Data Streams resource.
     */

    public String getStreamArn() {
        return this.streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Kinesis Data Streams resource.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) of the Kinesis Data Streams resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisConfiguration withStreamArn(String streamArn) {
        setStreamArn(streamArn);
        return this;
    }

    /**
     * <p>
     * Enables QLDB to publish multiple data records in a single Kinesis Data Streams record, increasing the number of
     * records sent per API call.
     * </p>
     * <p>
     * <i>This option is enabled by default.</i> Record aggregation has important implications for processing records
     * and requires de-aggregation in your stream consumer. To learn more, see <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html">KPL Key Concepts</a> and <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html">Consumer
     * De-aggregation</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * 
     * @param aggregationEnabled
     *        Enables QLDB to publish multiple data records in a single Kinesis Data Streams record, increasing the
     *        number of records sent per API call.</p>
     *        <p>
     *        <i>This option is enabled by default.</i> Record aggregation has important implications for processing
     *        records and requires de-aggregation in your stream consumer. To learn more, see <a
     *        href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html">KPL Key Concepts</a> and
     *        <a href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html">Consumer
     *        De-aggregation</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     */

    public void setAggregationEnabled(Boolean aggregationEnabled) {
        this.aggregationEnabled = aggregationEnabled;
    }

    /**
     * <p>
     * Enables QLDB to publish multiple data records in a single Kinesis Data Streams record, increasing the number of
     * records sent per API call.
     * </p>
     * <p>
     * <i>This option is enabled by default.</i> Record aggregation has important implications for processing records
     * and requires de-aggregation in your stream consumer. To learn more, see <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html">KPL Key Concepts</a> and <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html">Consumer
     * De-aggregation</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * 
     * @return Enables QLDB to publish multiple data records in a single Kinesis Data Streams record, increasing the
     *         number of records sent per API call.</p>
     *         <p>
     *         <i>This option is enabled by default.</i> Record aggregation has important implications for processing
     *         records and requires de-aggregation in your stream consumer. To learn more, see <a
     *         href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html">KPL Key Concepts</a> and
     *         <a href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html">Consumer
     *         De-aggregation</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     */

    public Boolean getAggregationEnabled() {
        return this.aggregationEnabled;
    }

    /**
     * <p>
     * Enables QLDB to publish multiple data records in a single Kinesis Data Streams record, increasing the number of
     * records sent per API call.
     * </p>
     * <p>
     * <i>This option is enabled by default.</i> Record aggregation has important implications for processing records
     * and requires de-aggregation in your stream consumer. To learn more, see <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html">KPL Key Concepts</a> and <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html">Consumer
     * De-aggregation</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * 
     * @param aggregationEnabled
     *        Enables QLDB to publish multiple data records in a single Kinesis Data Streams record, increasing the
     *        number of records sent per API call.</p>
     *        <p>
     *        <i>This option is enabled by default.</i> Record aggregation has important implications for processing
     *        records and requires de-aggregation in your stream consumer. To learn more, see <a
     *        href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html">KPL Key Concepts</a> and
     *        <a href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html">Consumer
     *        De-aggregation</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisConfiguration withAggregationEnabled(Boolean aggregationEnabled) {
        setAggregationEnabled(aggregationEnabled);
        return this;
    }

    /**
     * <p>
     * Enables QLDB to publish multiple data records in a single Kinesis Data Streams record, increasing the number of
     * records sent per API call.
     * </p>
     * <p>
     * <i>This option is enabled by default.</i> Record aggregation has important implications for processing records
     * and requires de-aggregation in your stream consumer. To learn more, see <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html">KPL Key Concepts</a> and <a
     * href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html">Consumer
     * De-aggregation</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     * </p>
     * 
     * @return Enables QLDB to publish multiple data records in a single Kinesis Data Streams record, increasing the
     *         number of records sent per API call.</p>
     *         <p>
     *         <i>This option is enabled by default.</i> Record aggregation has important implications for processing
     *         records and requires de-aggregation in your stream consumer. To learn more, see <a
     *         href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-concepts.html">KPL Key Concepts</a> and
     *         <a href="https://docs.aws.amazon.com/streams/latest/dev/kinesis-kpl-consumer-deaggregation.html">Consumer
     *         De-aggregation</a> in the <i>Amazon Kinesis Data Streams Developer Guide</i>.
     */

    public Boolean isAggregationEnabled() {
        return this.aggregationEnabled;
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
        if (getStreamArn() != null)
            sb.append("StreamArn: ").append(getStreamArn()).append(",");
        if (getAggregationEnabled() != null)
            sb.append("AggregationEnabled: ").append(getAggregationEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisConfiguration == false)
            return false;
        KinesisConfiguration other = (KinesisConfiguration) obj;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getAggregationEnabled() == null ^ this.getAggregationEnabled() == null)
            return false;
        if (other.getAggregationEnabled() != null && other.getAggregationEnabled().equals(this.getAggregationEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode + ((getAggregationEnabled() == null) ? 0 : getAggregationEnabled().hashCode());
        return hashCode;
    }

    @Override
    public KinesisConfiguration clone() {
        try {
            return (KinesisConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.qldb.model.transform.KinesisConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
