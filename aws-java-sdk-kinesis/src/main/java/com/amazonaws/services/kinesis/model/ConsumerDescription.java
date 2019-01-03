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
 * An object that represents the details of a registered consumer.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/ConsumerDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConsumerDescription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the consumer is something you choose when you register the consumer.
     * </p>
     */
    private String consumerName;
    /**
     * <p>
     * When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call
     * <a>SubscribeToShard</a>.
     * </p>
     * <p>
     * If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because
     * consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that
     * reference consumer ARNs.
     * </p>
     */
    private String consumerARN;
    /**
     * <p>
     * A consumer can't read data while in the <code>CREATING</code> or <code>DELETING</code> states.
     * </p>
     */
    private String consumerStatus;
    /** <p/> */
    private java.util.Date consumerCreationTimestamp;
    /**
     * <p>
     * The ARN of the stream with which you registered the consumer.
     * </p>
     */
    private String streamARN;

    /**
     * <p>
     * The name of the consumer is something you choose when you register the consumer.
     * </p>
     * 
     * @param consumerName
     *        The name of the consumer is something you choose when you register the consumer.
     */

    public void setConsumerName(String consumerName) {
        this.consumerName = consumerName;
    }

    /**
     * <p>
     * The name of the consumer is something you choose when you register the consumer.
     * </p>
     * 
     * @return The name of the consumer is something you choose when you register the consumer.
     */

    public String getConsumerName() {
        return this.consumerName;
    }

    /**
     * <p>
     * The name of the consumer is something you choose when you register the consumer.
     * </p>
     * 
     * @param consumerName
     *        The name of the consumer is something you choose when you register the consumer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsumerDescription withConsumerName(String consumerName) {
        setConsumerName(consumerName);
        return this;
    }

    /**
     * <p>
     * When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call
     * <a>SubscribeToShard</a>.
     * </p>
     * <p>
     * If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because
     * consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that
     * reference consumer ARNs.
     * </p>
     * 
     * @param consumerARN
     *        When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able
     *        to call <a>SubscribeToShard</a>.</p>
     *        <p>
     *        If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's
     *        because consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM
     *        policies that reference consumer ARNs.
     */

    public void setConsumerARN(String consumerARN) {
        this.consumerARN = consumerARN;
    }

    /**
     * <p>
     * When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call
     * <a>SubscribeToShard</a>.
     * </p>
     * <p>
     * If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because
     * consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that
     * reference consumer ARNs.
     * </p>
     * 
     * @return When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able
     *         to call <a>SubscribeToShard</a>.</p>
     *         <p>
     *         If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's
     *         because consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM
     *         policies that reference consumer ARNs.
     */

    public String getConsumerARN() {
        return this.consumerARN;
    }

    /**
     * <p>
     * When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able to call
     * <a>SubscribeToShard</a>.
     * </p>
     * <p>
     * If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's because
     * consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM policies that
     * reference consumer ARNs.
     * </p>
     * 
     * @param consumerARN
     *        When you register a consumer, Kinesis Data Streams generates an ARN for it. You need this ARN to be able
     *        to call <a>SubscribeToShard</a>.</p>
     *        <p>
     *        If you delete a consumer and then create a new one with the same name, it won't have the same ARN. That's
     *        because consumer ARNs contain the creation timestamp. This is important to keep in mind if you have IAM
     *        policies that reference consumer ARNs.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsumerDescription withConsumerARN(String consumerARN) {
        setConsumerARN(consumerARN);
        return this;
    }

    /**
     * <p>
     * A consumer can't read data while in the <code>CREATING</code> or <code>DELETING</code> states.
     * </p>
     * 
     * @param consumerStatus
     *        A consumer can't read data while in the <code>CREATING</code> or <code>DELETING</code> states.
     * @see ConsumerStatus
     */

    public void setConsumerStatus(String consumerStatus) {
        this.consumerStatus = consumerStatus;
    }

    /**
     * <p>
     * A consumer can't read data while in the <code>CREATING</code> or <code>DELETING</code> states.
     * </p>
     * 
     * @return A consumer can't read data while in the <code>CREATING</code> or <code>DELETING</code> states.
     * @see ConsumerStatus
     */

    public String getConsumerStatus() {
        return this.consumerStatus;
    }

    /**
     * <p>
     * A consumer can't read data while in the <code>CREATING</code> or <code>DELETING</code> states.
     * </p>
     * 
     * @param consumerStatus
     *        A consumer can't read data while in the <code>CREATING</code> or <code>DELETING</code> states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConsumerStatus
     */

    public ConsumerDescription withConsumerStatus(String consumerStatus) {
        setConsumerStatus(consumerStatus);
        return this;
    }

    /**
     * <p>
     * A consumer can't read data while in the <code>CREATING</code> or <code>DELETING</code> states.
     * </p>
     * 
     * @param consumerStatus
     *        A consumer can't read data while in the <code>CREATING</code> or <code>DELETING</code> states.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ConsumerStatus
     */

    public ConsumerDescription withConsumerStatus(ConsumerStatus consumerStatus) {
        this.consumerStatus = consumerStatus.toString();
        return this;
    }

    /**
     * <p/>
     * 
     * @param consumerCreationTimestamp
     */

    public void setConsumerCreationTimestamp(java.util.Date consumerCreationTimestamp) {
        this.consumerCreationTimestamp = consumerCreationTimestamp;
    }

    /**
     * <p/>
     * 
     * @return
     */

    public java.util.Date getConsumerCreationTimestamp() {
        return this.consumerCreationTimestamp;
    }

    /**
     * <p/>
     * 
     * @param consumerCreationTimestamp
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsumerDescription withConsumerCreationTimestamp(java.util.Date consumerCreationTimestamp) {
        setConsumerCreationTimestamp(consumerCreationTimestamp);
        return this;
    }

    /**
     * <p>
     * The ARN of the stream with which you registered the consumer.
     * </p>
     * 
     * @param streamARN
     *        The ARN of the stream with which you registered the consumer.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The ARN of the stream with which you registered the consumer.
     * </p>
     * 
     * @return The ARN of the stream with which you registered the consumer.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The ARN of the stream with which you registered the consumer.
     * </p>
     * 
     * @param streamARN
     *        The ARN of the stream with which you registered the consumer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConsumerDescription withStreamARN(String streamARN) {
        setStreamARN(streamARN);
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
        if (getConsumerName() != null)
            sb.append("ConsumerName: ").append(getConsumerName()).append(",");
        if (getConsumerARN() != null)
            sb.append("ConsumerARN: ").append(getConsumerARN()).append(",");
        if (getConsumerStatus() != null)
            sb.append("ConsumerStatus: ").append(getConsumerStatus()).append(",");
        if (getConsumerCreationTimestamp() != null)
            sb.append("ConsumerCreationTimestamp: ").append(getConsumerCreationTimestamp()).append(",");
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConsumerDescription == false)
            return false;
        ConsumerDescription other = (ConsumerDescription) obj;
        if (other.getConsumerName() == null ^ this.getConsumerName() == null)
            return false;
        if (other.getConsumerName() != null && other.getConsumerName().equals(this.getConsumerName()) == false)
            return false;
        if (other.getConsumerARN() == null ^ this.getConsumerARN() == null)
            return false;
        if (other.getConsumerARN() != null && other.getConsumerARN().equals(this.getConsumerARN()) == false)
            return false;
        if (other.getConsumerStatus() == null ^ this.getConsumerStatus() == null)
            return false;
        if (other.getConsumerStatus() != null && other.getConsumerStatus().equals(this.getConsumerStatus()) == false)
            return false;
        if (other.getConsumerCreationTimestamp() == null ^ this.getConsumerCreationTimestamp() == null)
            return false;
        if (other.getConsumerCreationTimestamp() != null && other.getConsumerCreationTimestamp().equals(this.getConsumerCreationTimestamp()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConsumerName() == null) ? 0 : getConsumerName().hashCode());
        hashCode = prime * hashCode + ((getConsumerARN() == null) ? 0 : getConsumerARN().hashCode());
        hashCode = prime * hashCode + ((getConsumerStatus() == null) ? 0 : getConsumerStatus().hashCode());
        hashCode = prime * hashCode + ((getConsumerCreationTimestamp() == null) ? 0 : getConsumerCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        return hashCode;
    }

    @Override
    public ConsumerDescription clone() {
        try {
            return (ConsumerDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesis.model.transform.ConsumerDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
