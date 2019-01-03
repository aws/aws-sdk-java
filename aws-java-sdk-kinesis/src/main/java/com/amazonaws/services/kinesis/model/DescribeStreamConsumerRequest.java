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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/DescribeStreamConsumer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStreamConsumerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the Kinesis data stream that the consumer is registered with. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The name that you gave to the consumer.
     * </p>
     */
    private String consumerName;
    /**
     * <p>
     * The ARN returned by Kinesis Data Streams when you registered the consumer.
     * </p>
     */
    private String consumerARN;

    /**
     * <p>
     * The ARN of the Kinesis data stream that the consumer is registered with. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param streamARN
     *        The ARN of the Kinesis data stream that the consumer is registered with. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     *        >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The ARN of the Kinesis data stream that the consumer is registered with. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The ARN of the Kinesis data stream that the consumer is registered with. For more information, see <a
     *         href
     *         ="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The ARN of the Kinesis data stream that the consumer is registered with. For more information, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param streamARN
     *        The ARN of the Kinesis data stream that the consumer is registered with. For more information, see <a
     *        href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     *        >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamConsumerRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The name that you gave to the consumer.
     * </p>
     * 
     * @param consumerName
     *        The name that you gave to the consumer.
     */

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    /**
     * <p>
     * The name that you gave to the consumer.
     * </p>
     * 
     * @return The name that you gave to the consumer.
     */

    public String getConsumerName() {
        return this.consumerName;
    }

    /**
     * <p>
     * The name that you gave to the consumer.
     * </p>
     * 
     * @param consumerName
     *        The name that you gave to the consumer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamConsumerRequest withConsumerName(String consumerName) {
        setConsumerName(consumerName);
        return this;
    }

    /**
     * <p>
     * The ARN returned by Kinesis Data Streams when you registered the consumer.
     * </p>
     * 
     * @param consumerARN
     *        The ARN returned by Kinesis Data Streams when you registered the consumer.
     */

    public void setConsumerARN(String consumerARN) {
        this.consumerARN = consumerARN;
    }

    /**
     * <p>
     * The ARN returned by Kinesis Data Streams when you registered the consumer.
     * </p>
     * 
     * @return The ARN returned by Kinesis Data Streams when you registered the consumer.
     */

    public String getConsumerARN() {
        return this.consumerARN;
    }

    /**
     * <p>
     * The ARN returned by Kinesis Data Streams when you registered the consumer.
     * </p>
     * 
     * @param consumerARN
     *        The ARN returned by Kinesis Data Streams when you registered the consumer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStreamConsumerRequest withConsumerARN(String consumerARN) {
        setConsumerARN(consumerARN);
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
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getConsumerName() != null)
            sb.append("ConsumerName: ").append(getConsumerName()).append(",");
        if (getConsumerARN() != null)
            sb.append("ConsumerARN: ").append(getConsumerARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStreamConsumerRequest == false)
            return false;
        DescribeStreamConsumerRequest other = (DescribeStreamConsumerRequest) obj;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getConsumerName() == null ^ this.getConsumerName() == null)
            return false;
        if (other.getConsumerName() != null && other.getConsumerName().equals(this.getConsumerName()) == false)
            return false;
        if (other.getConsumerARN() == null ^ this.getConsumerARN() == null)
            return false;
        if (other.getConsumerARN() != null && other.getConsumerARN().equals(this.getConsumerARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getConsumerName() == null) ? 0 : getConsumerName().hashCode());
        hashCode = prime * hashCode + ((getConsumerARN() == null) ? 0 : getConsumerARN().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStreamConsumerRequest clone() {
        return (DescribeStreamConsumerRequest) super.clone();
    }

}
