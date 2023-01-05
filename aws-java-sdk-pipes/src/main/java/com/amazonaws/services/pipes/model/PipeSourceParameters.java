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
 * The parameters required to set up a source for your pipe.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pipes-2015-10-07/PipeSourceParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipeSourceParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The parameters for using an Active MQ broker as a source.
     * </p>
     */
    private PipeSourceActiveMQBrokerParameters activeMQBrokerParameters;
    /**
     * <p>
     * The parameters for using a DynamoDB stream as a source.
     * </p>
     */
    private PipeSourceDynamoDBStreamParameters dynamoDBStreamParameters;
    /**
     * <p>
     * The collection of event patterns used to filter events. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html">Events and
     * Event Patterns</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     */
    private FilterCriteria filterCriteria;
    /**
     * <p>
     * The parameters for using a Kinesis stream as a source.
     * </p>
     */
    private PipeSourceKinesisStreamParameters kinesisStreamParameters;
    /**
     * <p>
     * The parameters for using an MSK stream as a source.
     * </p>
     */
    private PipeSourceManagedStreamingKafkaParameters managedStreamingKafkaParameters;
    /**
     * <p>
     * The parameters for using a Rabbit MQ broker as a source.
     * </p>
     */
    private PipeSourceRabbitMQBrokerParameters rabbitMQBrokerParameters;
    /**
     * <p>
     * The parameters for using a self-managed Apache Kafka stream as a source.
     * </p>
     */
    private PipeSourceSelfManagedKafkaParameters selfManagedKafkaParameters;
    /**
     * <p>
     * The parameters for using a Amazon SQS stream as a source.
     * </p>
     */
    private PipeSourceSqsQueueParameters sqsQueueParameters;

    /**
     * <p>
     * The parameters for using an Active MQ broker as a source.
     * </p>
     * 
     * @param activeMQBrokerParameters
     *        The parameters for using an Active MQ broker as a source.
     */

    public void setActiveMQBrokerParameters(PipeSourceActiveMQBrokerParameters activeMQBrokerParameters) {
        this.activeMQBrokerParameters = activeMQBrokerParameters;
    }

    /**
     * <p>
     * The parameters for using an Active MQ broker as a source.
     * </p>
     * 
     * @return The parameters for using an Active MQ broker as a source.
     */

    public PipeSourceActiveMQBrokerParameters getActiveMQBrokerParameters() {
        return this.activeMQBrokerParameters;
    }

    /**
     * <p>
     * The parameters for using an Active MQ broker as a source.
     * </p>
     * 
     * @param activeMQBrokerParameters
     *        The parameters for using an Active MQ broker as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceParameters withActiveMQBrokerParameters(PipeSourceActiveMQBrokerParameters activeMQBrokerParameters) {
        setActiveMQBrokerParameters(activeMQBrokerParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for using a DynamoDB stream as a source.
     * </p>
     * 
     * @param dynamoDBStreamParameters
     *        The parameters for using a DynamoDB stream as a source.
     */

    public void setDynamoDBStreamParameters(PipeSourceDynamoDBStreamParameters dynamoDBStreamParameters) {
        this.dynamoDBStreamParameters = dynamoDBStreamParameters;
    }

    /**
     * <p>
     * The parameters for using a DynamoDB stream as a source.
     * </p>
     * 
     * @return The parameters for using a DynamoDB stream as a source.
     */

    public PipeSourceDynamoDBStreamParameters getDynamoDBStreamParameters() {
        return this.dynamoDBStreamParameters;
    }

    /**
     * <p>
     * The parameters for using a DynamoDB stream as a source.
     * </p>
     * 
     * @param dynamoDBStreamParameters
     *        The parameters for using a DynamoDB stream as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceParameters withDynamoDBStreamParameters(PipeSourceDynamoDBStreamParameters dynamoDBStreamParameters) {
        setDynamoDBStreamParameters(dynamoDBStreamParameters);
        return this;
    }

    /**
     * <p>
     * The collection of event patterns used to filter events. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html">Events and
     * Event Patterns</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * 
     * @param filterCriteria
     *        The collection of event patterns used to filter events. For more information, see <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html">Events
     *        and Event Patterns</a> in the <i>Amazon EventBridge User Guide</i>.
     */

    public void setFilterCriteria(FilterCriteria filterCriteria) {
        this.filterCriteria = filterCriteria;
    }

    /**
     * <p>
     * The collection of event patterns used to filter events. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html">Events and
     * Event Patterns</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * 
     * @return The collection of event patterns used to filter events. For more information, see <a
     *         href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html"
     *         >Events and Event Patterns</a> in the <i>Amazon EventBridge User Guide</i>.
     */

    public FilterCriteria getFilterCriteria() {
        return this.filterCriteria;
    }

    /**
     * <p>
     * The collection of event patterns used to filter events. For more information, see <a
     * href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html">Events and
     * Event Patterns</a> in the <i>Amazon EventBridge User Guide</i>.
     * </p>
     * 
     * @param filterCriteria
     *        The collection of event patterns used to filter events. For more information, see <a
     *        href="https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html">Events
     *        and Event Patterns</a> in the <i>Amazon EventBridge User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceParameters withFilterCriteria(FilterCriteria filterCriteria) {
        setFilterCriteria(filterCriteria);
        return this;
    }

    /**
     * <p>
     * The parameters for using a Kinesis stream as a source.
     * </p>
     * 
     * @param kinesisStreamParameters
     *        The parameters for using a Kinesis stream as a source.
     */

    public void setKinesisStreamParameters(PipeSourceKinesisStreamParameters kinesisStreamParameters) {
        this.kinesisStreamParameters = kinesisStreamParameters;
    }

    /**
     * <p>
     * The parameters for using a Kinesis stream as a source.
     * </p>
     * 
     * @return The parameters for using a Kinesis stream as a source.
     */

    public PipeSourceKinesisStreamParameters getKinesisStreamParameters() {
        return this.kinesisStreamParameters;
    }

    /**
     * <p>
     * The parameters for using a Kinesis stream as a source.
     * </p>
     * 
     * @param kinesisStreamParameters
     *        The parameters for using a Kinesis stream as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceParameters withKinesisStreamParameters(PipeSourceKinesisStreamParameters kinesisStreamParameters) {
        setKinesisStreamParameters(kinesisStreamParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for using an MSK stream as a source.
     * </p>
     * 
     * @param managedStreamingKafkaParameters
     *        The parameters for using an MSK stream as a source.
     */

    public void setManagedStreamingKafkaParameters(PipeSourceManagedStreamingKafkaParameters managedStreamingKafkaParameters) {
        this.managedStreamingKafkaParameters = managedStreamingKafkaParameters;
    }

    /**
     * <p>
     * The parameters for using an MSK stream as a source.
     * </p>
     * 
     * @return The parameters for using an MSK stream as a source.
     */

    public PipeSourceManagedStreamingKafkaParameters getManagedStreamingKafkaParameters() {
        return this.managedStreamingKafkaParameters;
    }

    /**
     * <p>
     * The parameters for using an MSK stream as a source.
     * </p>
     * 
     * @param managedStreamingKafkaParameters
     *        The parameters for using an MSK stream as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceParameters withManagedStreamingKafkaParameters(PipeSourceManagedStreamingKafkaParameters managedStreamingKafkaParameters) {
        setManagedStreamingKafkaParameters(managedStreamingKafkaParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for using a Rabbit MQ broker as a source.
     * </p>
     * 
     * @param rabbitMQBrokerParameters
     *        The parameters for using a Rabbit MQ broker as a source.
     */

    public void setRabbitMQBrokerParameters(PipeSourceRabbitMQBrokerParameters rabbitMQBrokerParameters) {
        this.rabbitMQBrokerParameters = rabbitMQBrokerParameters;
    }

    /**
     * <p>
     * The parameters for using a Rabbit MQ broker as a source.
     * </p>
     * 
     * @return The parameters for using a Rabbit MQ broker as a source.
     */

    public PipeSourceRabbitMQBrokerParameters getRabbitMQBrokerParameters() {
        return this.rabbitMQBrokerParameters;
    }

    /**
     * <p>
     * The parameters for using a Rabbit MQ broker as a source.
     * </p>
     * 
     * @param rabbitMQBrokerParameters
     *        The parameters for using a Rabbit MQ broker as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceParameters withRabbitMQBrokerParameters(PipeSourceRabbitMQBrokerParameters rabbitMQBrokerParameters) {
        setRabbitMQBrokerParameters(rabbitMQBrokerParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for using a self-managed Apache Kafka stream as a source.
     * </p>
     * 
     * @param selfManagedKafkaParameters
     *        The parameters for using a self-managed Apache Kafka stream as a source.
     */

    public void setSelfManagedKafkaParameters(PipeSourceSelfManagedKafkaParameters selfManagedKafkaParameters) {
        this.selfManagedKafkaParameters = selfManagedKafkaParameters;
    }

    /**
     * <p>
     * The parameters for using a self-managed Apache Kafka stream as a source.
     * </p>
     * 
     * @return The parameters for using a self-managed Apache Kafka stream as a source.
     */

    public PipeSourceSelfManagedKafkaParameters getSelfManagedKafkaParameters() {
        return this.selfManagedKafkaParameters;
    }

    /**
     * <p>
     * The parameters for using a self-managed Apache Kafka stream as a source.
     * </p>
     * 
     * @param selfManagedKafkaParameters
     *        The parameters for using a self-managed Apache Kafka stream as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceParameters withSelfManagedKafkaParameters(PipeSourceSelfManagedKafkaParameters selfManagedKafkaParameters) {
        setSelfManagedKafkaParameters(selfManagedKafkaParameters);
        return this;
    }

    /**
     * <p>
     * The parameters for using a Amazon SQS stream as a source.
     * </p>
     * 
     * @param sqsQueueParameters
     *        The parameters for using a Amazon SQS stream as a source.
     */

    public void setSqsQueueParameters(PipeSourceSqsQueueParameters sqsQueueParameters) {
        this.sqsQueueParameters = sqsQueueParameters;
    }

    /**
     * <p>
     * The parameters for using a Amazon SQS stream as a source.
     * </p>
     * 
     * @return The parameters for using a Amazon SQS stream as a source.
     */

    public PipeSourceSqsQueueParameters getSqsQueueParameters() {
        return this.sqsQueueParameters;
    }

    /**
     * <p>
     * The parameters for using a Amazon SQS stream as a source.
     * </p>
     * 
     * @param sqsQueueParameters
     *        The parameters for using a Amazon SQS stream as a source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipeSourceParameters withSqsQueueParameters(PipeSourceSqsQueueParameters sqsQueueParameters) {
        setSqsQueueParameters(sqsQueueParameters);
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
        if (getActiveMQBrokerParameters() != null)
            sb.append("ActiveMQBrokerParameters: ").append(getActiveMQBrokerParameters()).append(",");
        if (getDynamoDBStreamParameters() != null)
            sb.append("DynamoDBStreamParameters: ").append(getDynamoDBStreamParameters()).append(",");
        if (getFilterCriteria() != null)
            sb.append("FilterCriteria: ").append(getFilterCriteria()).append(",");
        if (getKinesisStreamParameters() != null)
            sb.append("KinesisStreamParameters: ").append(getKinesisStreamParameters()).append(",");
        if (getManagedStreamingKafkaParameters() != null)
            sb.append("ManagedStreamingKafkaParameters: ").append(getManagedStreamingKafkaParameters()).append(",");
        if (getRabbitMQBrokerParameters() != null)
            sb.append("RabbitMQBrokerParameters: ").append(getRabbitMQBrokerParameters()).append(",");
        if (getSelfManagedKafkaParameters() != null)
            sb.append("SelfManagedKafkaParameters: ").append(getSelfManagedKafkaParameters()).append(",");
        if (getSqsQueueParameters() != null)
            sb.append("SqsQueueParameters: ").append(getSqsQueueParameters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipeSourceParameters == false)
            return false;
        PipeSourceParameters other = (PipeSourceParameters) obj;
        if (other.getActiveMQBrokerParameters() == null ^ this.getActiveMQBrokerParameters() == null)
            return false;
        if (other.getActiveMQBrokerParameters() != null && other.getActiveMQBrokerParameters().equals(this.getActiveMQBrokerParameters()) == false)
            return false;
        if (other.getDynamoDBStreamParameters() == null ^ this.getDynamoDBStreamParameters() == null)
            return false;
        if (other.getDynamoDBStreamParameters() != null && other.getDynamoDBStreamParameters().equals(this.getDynamoDBStreamParameters()) == false)
            return false;
        if (other.getFilterCriteria() == null ^ this.getFilterCriteria() == null)
            return false;
        if (other.getFilterCriteria() != null && other.getFilterCriteria().equals(this.getFilterCriteria()) == false)
            return false;
        if (other.getKinesisStreamParameters() == null ^ this.getKinesisStreamParameters() == null)
            return false;
        if (other.getKinesisStreamParameters() != null && other.getKinesisStreamParameters().equals(this.getKinesisStreamParameters()) == false)
            return false;
        if (other.getManagedStreamingKafkaParameters() == null ^ this.getManagedStreamingKafkaParameters() == null)
            return false;
        if (other.getManagedStreamingKafkaParameters() != null
                && other.getManagedStreamingKafkaParameters().equals(this.getManagedStreamingKafkaParameters()) == false)
            return false;
        if (other.getRabbitMQBrokerParameters() == null ^ this.getRabbitMQBrokerParameters() == null)
            return false;
        if (other.getRabbitMQBrokerParameters() != null && other.getRabbitMQBrokerParameters().equals(this.getRabbitMQBrokerParameters()) == false)
            return false;
        if (other.getSelfManagedKafkaParameters() == null ^ this.getSelfManagedKafkaParameters() == null)
            return false;
        if (other.getSelfManagedKafkaParameters() != null && other.getSelfManagedKafkaParameters().equals(this.getSelfManagedKafkaParameters()) == false)
            return false;
        if (other.getSqsQueueParameters() == null ^ this.getSqsQueueParameters() == null)
            return false;
        if (other.getSqsQueueParameters() != null && other.getSqsQueueParameters().equals(this.getSqsQueueParameters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveMQBrokerParameters() == null) ? 0 : getActiveMQBrokerParameters().hashCode());
        hashCode = prime * hashCode + ((getDynamoDBStreamParameters() == null) ? 0 : getDynamoDBStreamParameters().hashCode());
        hashCode = prime * hashCode + ((getFilterCriteria() == null) ? 0 : getFilterCriteria().hashCode());
        hashCode = prime * hashCode + ((getKinesisStreamParameters() == null) ? 0 : getKinesisStreamParameters().hashCode());
        hashCode = prime * hashCode + ((getManagedStreamingKafkaParameters() == null) ? 0 : getManagedStreamingKafkaParameters().hashCode());
        hashCode = prime * hashCode + ((getRabbitMQBrokerParameters() == null) ? 0 : getRabbitMQBrokerParameters().hashCode());
        hashCode = prime * hashCode + ((getSelfManagedKafkaParameters() == null) ? 0 : getSelfManagedKafkaParameters().hashCode());
        hashCode = prime * hashCode + ((getSqsQueueParameters() == null) ? 0 : getSqsQueueParameters().hashCode());
        return hashCode;
    }

    @Override
    public PipeSourceParameters clone() {
        try {
            return (PipeSourceParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pipes.model.transform.PipeSourceParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
