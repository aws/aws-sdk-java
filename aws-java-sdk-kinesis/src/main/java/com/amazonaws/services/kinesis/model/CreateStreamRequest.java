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
 * Represents the input for <code>CreateStream</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/CreateStream" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStreamRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name to identify the stream. The stream name is scoped to the AWS account used by the application that creates
     * the stream. It is also scoped by AWS Region. That is, two streams in two different AWS accounts can have the same
     * name. Two streams in the same AWS account but in two different Regions can also have the same name.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The number of shards that the stream will use. The throughput of the stream is a function of the number of
     * shards; more shards are required for greater provisioned throughput.
     * </p>
     * <p>
     * DefaultShardLimit;
     * </p>
     */
    private Integer shardCount;

    /**
     * <p>
     * A name to identify the stream. The stream name is scoped to the AWS account used by the application that creates
     * the stream. It is also scoped by AWS Region. That is, two streams in two different AWS accounts can have the same
     * name. Two streams in the same AWS account but in two different Regions can also have the same name.
     * </p>
     * 
     * @param streamName
     *        A name to identify the stream. The stream name is scoped to the AWS account used by the application that
     *        creates the stream. It is also scoped by AWS Region. That is, two streams in two different AWS accounts
     *        can have the same name. Two streams in the same AWS account but in two different Regions can also have the
     *        same name.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * A name to identify the stream. The stream name is scoped to the AWS account used by the application that creates
     * the stream. It is also scoped by AWS Region. That is, two streams in two different AWS accounts can have the same
     * name. Two streams in the same AWS account but in two different Regions can also have the same name.
     * </p>
     * 
     * @return A name to identify the stream. The stream name is scoped to the AWS account used by the application that
     *         creates the stream. It is also scoped by AWS Region. That is, two streams in two different AWS accounts
     *         can have the same name. Two streams in the same AWS account but in two different Regions can also have
     *         the same name.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * A name to identify the stream. The stream name is scoped to the AWS account used by the application that creates
     * the stream. It is also scoped by AWS Region. That is, two streams in two different AWS accounts can have the same
     * name. Two streams in the same AWS account but in two different Regions can also have the same name.
     * </p>
     * 
     * @param streamName
     *        A name to identify the stream. The stream name is scoped to the AWS account used by the application that
     *        creates the stream. It is also scoped by AWS Region. That is, two streams in two different AWS accounts
     *        can have the same name. Two streams in the same AWS account but in two different Regions can also have the
     *        same name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The number of shards that the stream will use. The throughput of the stream is a function of the number of
     * shards; more shards are required for greater provisioned throughput.
     * </p>
     * <p>
     * DefaultShardLimit;
     * </p>
     * 
     * @param shardCount
     *        The number of shards that the stream will use. The throughput of the stream is a function of the number of
     *        shards; more shards are required for greater provisioned throughput.</p>
     *        <p>
     *        DefaultShardLimit;
     */

    public void setShardCount(Integer shardCount) {
        this.shardCount = shardCount;
    }

    /**
     * <p>
     * The number of shards that the stream will use. The throughput of the stream is a function of the number of
     * shards; more shards are required for greater provisioned throughput.
     * </p>
     * <p>
     * DefaultShardLimit;
     * </p>
     * 
     * @return The number of shards that the stream will use. The throughput of the stream is a function of the number
     *         of shards; more shards are required for greater provisioned throughput.</p>
     *         <p>
     *         DefaultShardLimit;
     */

    public Integer getShardCount() {
        return this.shardCount;
    }

    /**
     * <p>
     * The number of shards that the stream will use. The throughput of the stream is a function of the number of
     * shards; more shards are required for greater provisioned throughput.
     * </p>
     * <p>
     * DefaultShardLimit;
     * </p>
     * 
     * @param shardCount
     *        The number of shards that the stream will use. The throughput of the stream is a function of the number of
     *        shards; more shards are required for greater provisioned throughput.</p>
     *        <p>
     *        DefaultShardLimit;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStreamRequest withShardCount(Integer shardCount) {
        setShardCount(shardCount);
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
        if (getShardCount() != null)
            sb.append("ShardCount: ").append(getShardCount());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStreamRequest == false)
            return false;
        CreateStreamRequest other = (CreateStreamRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getShardCount() == null ^ this.getShardCount() == null)
            return false;
        if (other.getShardCount() != null && other.getShardCount().equals(this.getShardCount()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getShardCount() == null) ? 0 : getShardCount().hashCode());
        return hashCode;
    }

    @Override
    public CreateStreamRequest clone() {
        return (CreateStreamRequest) super.clone();
    }

}
