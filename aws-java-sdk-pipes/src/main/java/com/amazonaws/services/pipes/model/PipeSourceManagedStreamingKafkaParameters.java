/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.pipes.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The parameters for using an MSK stream as a source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/PipeSourceManagedStreamingKafkaParameters"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeSourceManagedStreamingKafkaParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum number of records to include in each batch.
     * </p>
     */
    private Integer batchSize;
    /**
     * <p>
     * The name of the destination queue to consume.
     * </p>
     */
    private String consumerGroupID;
    /**
     * <p>
     * The credentials needed to access the resource.
     * </p>
     */
    private MSKAccessCredentials credentials;
    /**
     * <p>
     * The maximum length of a time to wait for events.
     * </p>
     */
    private Integer maximumBatchingWindowInSeconds;
    /**
     * <p>
     * (Streams only) The position in a stream from which to start reading.
     * </p>
     */
    private String startingPosition;
    /**
     * <p>
     * The name of the topic that the pipe will read from.
     * </p>
     */
    private String topicName;

    /**
     * <p>
     * The maximum number of records to include in each batch.
     * </p>
     * 
     * @param batchSize
     *        The maximum number of records to include in each batch.
     */

    public void setBatchSize(Integer batchSize) {
        this.batchSize = batchSize;
    }

    /**
     * <p>
     * The maximum number of records to include in each batch.
     * </p>
     * 
     * @return The maximum number of records to include in each batch.
     */

    public Integer getBatchSize() {
        return this.batchSize;
    }

    /**
     * <p>
     * The maximum number of records to include in each batch.
     * </p>
     * 
     * @param batchSize
     *        The maximum number of records to include in each batch.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceManagedStreamingKafkaParameters withBatchSize(Integer batchSize) {
        setBatchSize(batchSize);
        return this;
    }

    /**
     * <p>
     * The name of the destination queue to consume.
     * </p>
     * 
     * @param consumerGroupID
     *        The name of the destination queue to consume.
     */

    public void setConsumerGroupID(String consumerGroupID) {
        this.consumerGroupID = consumerGroupID;
    }

    /**
     * <p>
     * The name of the destination queue to consume.
     * </p>
     * 
     * @return The name of the destination queue to consume.
     */

    public String getConsumerGroupID() {
        return this.consumerGroupID;
    }

    /**
     * <p>
     * The name of the destination queue to consume.
     * </p>
     * 
     * @param consumerGroupID
     *        The name of the destination queue to consume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceManagedStreamingKafkaParameters withConsumerGroupID(String consumerGroupID) {
        setConsumerGroupID(consumerGroupID);
        return this;
    }

    /**
     * <p>
     * The credentials needed to access the resource.
     * </p>
     * 
     * @param credentials
     *        The credentials needed to access the resource.
     */

    public void setCredentials(MSKAccessCredentials credentials) {
        this.credentials = credentials;
    }

    /**
     * <p>
     * The credentials needed to access the resource.
     * </p>
     * 
     * @return The credentials needed to access the resource.
     */

    public MSKAccessCredentials getCredentials() {
        return this.credentials;
    }

    /**
     * <p>
     * The credentials needed to access the resource.
     * </p>
     * 
     * @param credentials
     *        The credentials needed to access the resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceManagedStreamingKafkaParameters withCredentials(MSKAccessCredentials credentials) {
        setCredentials(credentials);
        return this;
    }

    /**
     * <p>
     * The maximum length of a time to wait for events.
     * </p>
     * 
     * @param maximumBatchingWindowInSeconds
     *        The maximum length of a time to wait for events.
     */

    public void setMaximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
        this.maximumBatchingWindowInSeconds = maximumBatchingWindowInSeconds;
    }

    /**
     * <p>
     * The maximum length of a time to wait for events.
     * </p>
     * 
     * @return The maximum length of a time to wait for events.
     */

    public Integer getMaximumBatchingWindowInSeconds() {
        return this.maximumBatchingWindowInSeconds;
    }

    /**
     * <p>
     * The maximum length of a time to wait for events.
     * </p>
     * 
     * @param maximumBatchingWindowInSeconds
     *        The maximum length of a time to wait for events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceManagedStreamingKafkaParameters withMaximumBatchingWindowInSeconds(Integer maximumBatchingWindowInSeconds) {
        setMaximumBatchingWindowInSeconds(maximumBatchingWindowInSeconds);
        return this;
    }

    /**
     * <p>
     * (Streams only) The position in a stream from which to start reading.
     * </p>
     * 
     * @param startingPosition
     *        (Streams only) The position in a stream from which to start reading.
     * @see MSKStartPosition
     */

    public void setStartingPosition(String startingPosition) {
        this.startingPosition = startingPosition;
    }

    /**
     * <p>
     * (Streams only) The position in a stream from which to start reading.
     * </p>
     * 
     * @return (Streams only) The position in a stream from which to start reading.
     * @see MSKStartPosition
     */

    public String getStartingPosition() {
        return this.startingPosition;
    }

    /**
     * <p>
     * (Streams only) The position in a stream from which to start reading.
     * </p>
     * 
     * @param startingPosition
     *        (Streams only) The position in a stream from which to start reading.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MSKStartPosition
     */

    public PipeSourceManagedStreamingKafkaParameters withStartingPosition(String startingPosition) {
        setStartingPosition(startingPosition);
        return this;
    }

    /**
     * <p>
     * (Streams only) The position in a stream from which to start reading.
     * </p>
     * 
     * @param startingPosition
     *        (Streams only) The position in a stream from which to start reading.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MSKStartPosition
     */

    public PipeSourceManagedStreamingKafkaParameters withStartingPosition(MSKStartPosition startingPosition) {
        this.startingPosition = startingPosition.toString();
        return this;
    }

    /**
     * <p>
     * The name of the topic that the pipe will read from.
     * </p>
     * 
     * @param topicName
     *        The name of the topic that the pipe will read from.
     */

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * <p>
     * The name of the topic that the pipe will read from.
     * </p>
     * 
     * @return The name of the topic that the pipe will read from.
     */

    public String getTopicName() {
        return this.topicName;
    }

    /**
     * <p>
     * The name of the topic that the pipe will read from.
     * </p>
     * 
     * @param topicName
     *        The name of the topic that the pipe will read from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceManagedStreamingKafkaParameters withTopicName(String topicName) {
        setTopicName(topicName);
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
        if (getBatchSize() != null)
            sb.append("BatchSize: ").append(getBatchSize()).append(",");
        if (getConsumerGroupID() != null)
            sb.append("ConsumerGroupID: ").append("***Sensitive Data Redacted***").append(",");
        if (getCredentials() != null)
            sb.append("Credentials: ").append(getCredentials()).append(",");
        if (getMaximumBatchingWindowInSeconds() != null)
            sb.append("MaximumBatchingWindowInSeconds: ").append(getMaximumBatchingWindowInSeconds()).append(",");
        if (getStartingPosition() != null)
            sb.append("StartingPosition: ").append(getStartingPosition()).append(",");
        if (getTopicName() != null)
            sb.append("TopicName: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipeSourceManagedStreamingKafkaParameters == false)
            return false;
        PipeSourceManagedStreamingKafkaParameters other = (PipeSourceManagedStreamingKafkaParameters) obj;
        if (other.getBatchSize() == null ^ this.getBatchSize() == null)
            return false;
        if (other.getBatchSize() != null && other.getBatchSize().equals(this.getBatchSize()) == false)
            return false;
        if (other.getConsumerGroupID() == null ^ this.getConsumerGroupID() == null)
            return false;
        if (other.getConsumerGroupID() != null && other.getConsumerGroupID().equals(this.getConsumerGroupID()) == false)
            return false;
        if (other.getCredentials() == null ^ this.getCredentials() == null)
            return false;
        if (other.getCredentials() != null && other.getCredentials().equals(this.getCredentials()) == false)
            return false;
        if (other.getMaximumBatchingWindowInSeconds() == null ^ this.getMaximumBatchingWindowInSeconds() == null)
            return false;
        if (other.getMaximumBatchingWindowInSeconds() != null
                && other.getMaximumBatchingWindowInSeconds().equals(this.getMaximumBatchingWindowInSeconds()) == false)
            return false;
        if (other.getStartingPosition() == null ^ this.getStartingPosition() == null)
            return false;
        if (other.getStartingPosition() != null && other.getStartingPosition().equals(this.getStartingPosition()) == false)
            return false;
        if (other.getTopicName() == null ^ this.getTopicName() == null)
            return false;
        if (other.getTopicName() != null && other.getTopicName().equals(this.getTopicName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBatchSize() == null) ? 0 : getBatchSize().hashCode());
        hashCode = prime * hashCode + ((getConsumerGroupID() == null) ? 0 : getConsumerGroupID().hashCode());
        hashCode = prime * hashCode + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        hashCode = prime * hashCode + ((getMaximumBatchingWindowInSeconds() == null) ? 0 : getMaximumBatchingWindowInSeconds().hashCode());
        hashCode = prime * hashCode + ((getStartingPosition() == null) ? 0 : getStartingPosition().hashCode());
        hashCode = prime * hashCode + ((getTopicName() == null) ? 0 : getTopicName().hashCode());
        return hashCode;
    }

    @Override
    public PipeSourceManagedStreamingKafkaParameters clone() {
        try {
            return (PipeSourceManagedStreamingKafkaParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeSourceManagedStreamingKafkaParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
