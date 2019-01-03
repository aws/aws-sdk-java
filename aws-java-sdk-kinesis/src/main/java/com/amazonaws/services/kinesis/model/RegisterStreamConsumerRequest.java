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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/RegisterStreamConsumer" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegisterStreamConsumerRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the Kinesis data stream that you want to register the consumer with. For more info, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * For a given Kinesis data stream, each consumer must have a unique name. However, consumer names don't have to be
     * unique across data streams.
     * </p>
     */
    private String consumerName;

    /**
     * <p>
     * The ARN of the Kinesis data stream that you want to register the consumer with. For more info, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param streamARN
     *        The ARN of the Kinesis data stream that you want to register the consumer with. For more info, see <a
     *        href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     *        >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The ARN of the Kinesis data stream that you want to register the consumer with. For more info, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The ARN of the Kinesis data stream that you want to register the consumer with. For more info, see <a
     *         href
     *         ="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     *         >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The ARN of the Kinesis data stream that you want to register the consumer with. For more info, see <a
     * href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     * >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * </p>
     * 
     * @param streamARN
     *        The ARN of the Kinesis data stream that you want to register the consumer with. For more info, see <a
     *        href=
     *        "https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html#arn-syntax-kinesis-streams"
     *        >Amazon Resource Names (ARNs) and AWS Service Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterStreamConsumerRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * For a given Kinesis data stream, each consumer must have a unique name. However, consumer names don't have to be
     * unique across data streams.
     * </p>
     * 
     * @param consumerName
     *        For a given Kinesis data stream, each consumer must have a unique name. However, consumer names don't have
     *        to be unique across data streams.
     */

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    /**
     * <p>
     * For a given Kinesis data stream, each consumer must have a unique name. However, consumer names don't have to be
     * unique across data streams.
     * </p>
     * 
     * @return For a given Kinesis data stream, each consumer must have a unique name. However, consumer names don't
     *         have to be unique across data streams.
     */

    public String getConsumerName() {
        return this.consumerName;
    }

    /**
     * <p>
     * For a given Kinesis data stream, each consumer must have a unique name. However, consumer names don't have to be
     * unique across data streams.
     * </p>
     * 
     * @param consumerName
     *        For a given Kinesis data stream, each consumer must have a unique name. However, consumer names don't have
     *        to be unique across data streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegisterStreamConsumerRequest withConsumerName(String consumerName) {
        setConsumerName(consumerName);
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
            sb.append("ConsumerName: ").append(getConsumerName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RegisterStreamConsumerRequest == false)
            return false;
        RegisterStreamConsumerRequest other = (RegisterStreamConsumerRequest) obj;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getConsumerName() == null ^ this.getConsumerName() == null)
            return false;
        if (other.getConsumerName() != null && other.getConsumerName().equals(this.getConsumerName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getConsumerName() == null) ? 0 : getConsumerName().hashCode());
        return hashCode;
    }

    @Override
    public RegisterStreamConsumerRequest clone() {
        return (RegisterStreamConsumerRequest) super.clone();
    }

}
