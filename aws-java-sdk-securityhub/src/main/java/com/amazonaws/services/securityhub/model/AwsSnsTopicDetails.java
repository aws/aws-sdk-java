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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides information about an Amazon SNS topic to which notifications can be published.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsSnsTopicDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSnsTopicDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of an Amazon Web Services managed key for Amazon SNS or a customer managed key.
     * </p>
     */
    private String kmsMasterKeyId;
    /**
     * <p>
     * Subscription is an embedded property that describes the subscription endpoints of an Amazon SNS topic.
     * </p>
     */
    private java.util.List<AwsSnsTopicSubscription> subscription;
    /**
     * <p>
     * The name of the Amazon SNS topic.
     * </p>
     */
    private String topicName;
    /**
     * <p>
     * The subscription's owner.
     * </p>
     */
    private String owner;
    /**
     * <p>
     * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS
     * endpoint.
     * </p>
     */
    private String sqsSuccessFeedbackRoleArn;
    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS endpoint.
     * </p>
     */
    private String sqsFailureFeedbackRoleArn;
    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to a platform application
     * endpoint.
     * </p>
     */
    private String applicationSuccessFeedbackRoleArn;
    /**
     * <p>
     * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis Data
     * Firehose endpoint.
     * </p>
     */
    private String firehoseSuccessFeedbackRoleArn;
    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis Data
     * Firehose endpoint.
     * </p>
     */
    private String firehoseFailureFeedbackRoleArn;
    /**
     * <p>
     * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint.
     * </p>
     */
    private String httpSuccessFeedbackRoleArn;
    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint.
     * </p>
     */
    private String httpFailureFeedbackRoleArn;

    /**
     * <p>
     * The ID of an Amazon Web Services managed key for Amazon SNS or a customer managed key.
     * </p>
     * 
     * @param kmsMasterKeyId
     *        The ID of an Amazon Web Services managed key for Amazon SNS or a customer managed key.
     */

    public void setKmsMasterKeyId(String kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
    }

    /**
     * <p>
     * The ID of an Amazon Web Services managed key for Amazon SNS or a customer managed key.
     * </p>
     * 
     * @return The ID of an Amazon Web Services managed key for Amazon SNS or a customer managed key.
     */

    public String getKmsMasterKeyId() {
        return this.kmsMasterKeyId;
    }

    /**
     * <p>
     * The ID of an Amazon Web Services managed key for Amazon SNS or a customer managed key.
     * </p>
     * 
     * @param kmsMasterKeyId
     *        The ID of an Amazon Web Services managed key for Amazon SNS or a customer managed key.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSnsTopicDetails withKmsMasterKeyId(String kmsMasterKeyId) {
        setKmsMasterKeyId(kmsMasterKeyId);
        return this;
    }

    /**
     * <p>
     * Subscription is an embedded property that describes the subscription endpoints of an Amazon SNS topic.
     * </p>
     * 
     * @return Subscription is an embedded property that describes the subscription endpoints of an Amazon SNS topic.
     */

    public java.util.List<AwsSnsTopicSubscription> getSubscription() {
        return subscription;
    }

    /**
     * <p>
     * Subscription is an embedded property that describes the subscription endpoints of an Amazon SNS topic.
     * </p>
     * 
     * @param subscription
     *        Subscription is an embedded property that describes the subscription endpoints of an Amazon SNS topic.
     */

    public void setSubscription(java.util.Collection<AwsSnsTopicSubscription> subscription) {
        if (subscription == null) {
            this.subscription = null;
            return;
        }

        this.subscription = new java.util.ArrayList<AwsSnsTopicSubscription>(subscription);
    }

    /**
     * <p>
     * Subscription is an embedded property that describes the subscription endpoints of an Amazon SNS topic.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubscription(java.util.Collection)} or {@link #withSubscription(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param subscription
     *        Subscription is an embedded property that describes the subscription endpoints of an Amazon SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSnsTopicDetails withSubscription(AwsSnsTopicSubscription... subscription) {
        if (this.subscription == null) {
            setSubscription(new java.util.ArrayList<AwsSnsTopicSubscription>(subscription.length));
        }
        for (AwsSnsTopicSubscription ele : subscription) {
            this.subscription.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Subscription is an embedded property that describes the subscription endpoints of an Amazon SNS topic.
     * </p>
     * 
     * @param subscription
     *        Subscription is an embedded property that describes the subscription endpoints of an Amazon SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSnsTopicDetails withSubscription(java.util.Collection<AwsSnsTopicSubscription> subscription) {
        setSubscription(subscription);
        return this;
    }

    /**
     * <p>
     * The name of the Amazon SNS topic.
     * </p>
     * 
     * @param topicName
     *        The name of the Amazon SNS topic.
     */

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * <p>
     * The name of the Amazon SNS topic.
     * </p>
     * 
     * @return The name of the Amazon SNS topic.
     */

    public String getTopicName() {
        return this.topicName;
    }

    /**
     * <p>
     * The name of the Amazon SNS topic.
     * </p>
     * 
     * @param topicName
     *        The name of the Amazon SNS topic.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSnsTopicDetails withTopicName(String topicName) {
        setTopicName(topicName);
        return this;
    }

    /**
     * <p>
     * The subscription's owner.
     * </p>
     * 
     * @param owner
     *        The subscription's owner.
     */

    public void setOwner(String owner) {
        this.owner = owner;
    }

    /**
     * <p>
     * The subscription's owner.
     * </p>
     * 
     * @return The subscription's owner.
     */

    public String getOwner() {
        return this.owner;
    }

    /**
     * <p>
     * The subscription's owner.
     * </p>
     * 
     * @param owner
     *        The subscription's owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSnsTopicDetails withOwner(String owner) {
        setOwner(owner);
        return this;
    }

    /**
     * <p>
     * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS
     * endpoint.
     * </p>
     * 
     * @param sqsSuccessFeedbackRoleArn
     *        Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS
     *        endpoint.
     */

    public void setSqsSuccessFeedbackRoleArn(String sqsSuccessFeedbackRoleArn) {
        this.sqsSuccessFeedbackRoleArn = sqsSuccessFeedbackRoleArn;
    }

    /**
     * <p>
     * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS
     * endpoint.
     * </p>
     * 
     * @return Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS
     *         endpoint.
     */

    public String getSqsSuccessFeedbackRoleArn() {
        return this.sqsSuccessFeedbackRoleArn;
    }

    /**
     * <p>
     * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS
     * endpoint.
     * </p>
     * 
     * @param sqsSuccessFeedbackRoleArn
     *        Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS
     *        endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSnsTopicDetails withSqsSuccessFeedbackRoleArn(String sqsSuccessFeedbackRoleArn) {
        setSqsSuccessFeedbackRoleArn(sqsSuccessFeedbackRoleArn);
        return this;
    }

    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS endpoint.
     * </p>
     * 
     * @param sqsFailureFeedbackRoleArn
     *        Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS
     *        endpoint.
     */

    public void setSqsFailureFeedbackRoleArn(String sqsFailureFeedbackRoleArn) {
        this.sqsFailureFeedbackRoleArn = sqsFailureFeedbackRoleArn;
    }

    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS endpoint.
     * </p>
     * 
     * @return Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS
     *         endpoint.
     */

    public String getSqsFailureFeedbackRoleArn() {
        return this.sqsFailureFeedbackRoleArn;
    }

    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS endpoint.
     * </p>
     * 
     * @param sqsFailureFeedbackRoleArn
     *        Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon SQS
     *        endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSnsTopicDetails withSqsFailureFeedbackRoleArn(String sqsFailureFeedbackRoleArn) {
        setSqsFailureFeedbackRoleArn(sqsFailureFeedbackRoleArn);
        return this;
    }

    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to a platform application
     * endpoint.
     * </p>
     * 
     * @param applicationSuccessFeedbackRoleArn
     *        Indicates failed message delivery status for an Amazon SNS topic that is subscribed to a platform
     *        application endpoint.
     */

    public void setApplicationSuccessFeedbackRoleArn(String applicationSuccessFeedbackRoleArn) {
        this.applicationSuccessFeedbackRoleArn = applicationSuccessFeedbackRoleArn;
    }

    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to a platform application
     * endpoint.
     * </p>
     * 
     * @return Indicates failed message delivery status for an Amazon SNS topic that is subscribed to a platform
     *         application endpoint.
     */

    public String getApplicationSuccessFeedbackRoleArn() {
        return this.applicationSuccessFeedbackRoleArn;
    }

    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to a platform application
     * endpoint.
     * </p>
     * 
     * @param applicationSuccessFeedbackRoleArn
     *        Indicates failed message delivery status for an Amazon SNS topic that is subscribed to a platform
     *        application endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSnsTopicDetails withApplicationSuccessFeedbackRoleArn(String applicationSuccessFeedbackRoleArn) {
        setApplicationSuccessFeedbackRoleArn(applicationSuccessFeedbackRoleArn);
        return this;
    }

    /**
     * <p>
     * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis Data
     * Firehose endpoint.
     * </p>
     * 
     * @param firehoseSuccessFeedbackRoleArn
     *        Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon
     *        Kinesis Data Firehose endpoint.
     */

    public void setFirehoseSuccessFeedbackRoleArn(String firehoseSuccessFeedbackRoleArn) {
        this.firehoseSuccessFeedbackRoleArn = firehoseSuccessFeedbackRoleArn;
    }

    /**
     * <p>
     * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis Data
     * Firehose endpoint.
     * </p>
     * 
     * @return Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon
     *         Kinesis Data Firehose endpoint.
     */

    public String getFirehoseSuccessFeedbackRoleArn() {
        return this.firehoseSuccessFeedbackRoleArn;
    }

    /**
     * <p>
     * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis Data
     * Firehose endpoint.
     * </p>
     * 
     * @param firehoseSuccessFeedbackRoleArn
     *        Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an Amazon
     *        Kinesis Data Firehose endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSnsTopicDetails withFirehoseSuccessFeedbackRoleArn(String firehoseSuccessFeedbackRoleArn) {
        setFirehoseSuccessFeedbackRoleArn(firehoseSuccessFeedbackRoleArn);
        return this;
    }

    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis Data
     * Firehose endpoint.
     * </p>
     * 
     * @param firehoseFailureFeedbackRoleArn
     *        Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis
     *        Data Firehose endpoint.
     */

    public void setFirehoseFailureFeedbackRoleArn(String firehoseFailureFeedbackRoleArn) {
        this.firehoseFailureFeedbackRoleArn = firehoseFailureFeedbackRoleArn;
    }

    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis Data
     * Firehose endpoint.
     * </p>
     * 
     * @return Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis
     *         Data Firehose endpoint.
     */

    public String getFirehoseFailureFeedbackRoleArn() {
        return this.firehoseFailureFeedbackRoleArn;
    }

    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis Data
     * Firehose endpoint.
     * </p>
     * 
     * @param firehoseFailureFeedbackRoleArn
     *        Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an Amazon Kinesis
     *        Data Firehose endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSnsTopicDetails withFirehoseFailureFeedbackRoleArn(String firehoseFailureFeedbackRoleArn) {
        setFirehoseFailureFeedbackRoleArn(firehoseFailureFeedbackRoleArn);
        return this;
    }

    /**
     * <p>
     * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint.
     * </p>
     * 
     * @param httpSuccessFeedbackRoleArn
     *        Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an HTTP
     *        endpoint.
     */

    public void setHttpSuccessFeedbackRoleArn(String httpSuccessFeedbackRoleArn) {
        this.httpSuccessFeedbackRoleArn = httpSuccessFeedbackRoleArn;
    }

    /**
     * <p>
     * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint.
     * </p>
     * 
     * @return Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an HTTP
     *         endpoint.
     */

    public String getHttpSuccessFeedbackRoleArn() {
        return this.httpSuccessFeedbackRoleArn;
    }

    /**
     * <p>
     * Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint.
     * </p>
     * 
     * @param httpSuccessFeedbackRoleArn
     *        Indicates successful message delivery status for an Amazon SNS topic that is subscribed to an HTTP
     *        endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSnsTopicDetails withHttpSuccessFeedbackRoleArn(String httpSuccessFeedbackRoleArn) {
        setHttpSuccessFeedbackRoleArn(httpSuccessFeedbackRoleArn);
        return this;
    }

    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint.
     * </p>
     * 
     * @param httpFailureFeedbackRoleArn
     *        Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint.
     */

    public void setHttpFailureFeedbackRoleArn(String httpFailureFeedbackRoleArn) {
        this.httpFailureFeedbackRoleArn = httpFailureFeedbackRoleArn;
    }

    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint.
     * </p>
     * 
     * @return Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint.
     */

    public String getHttpFailureFeedbackRoleArn() {
        return this.httpFailureFeedbackRoleArn;
    }

    /**
     * <p>
     * Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint.
     * </p>
     * 
     * @param httpFailureFeedbackRoleArn
     *        Indicates failed message delivery status for an Amazon SNS topic that is subscribed to an HTTP endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsSnsTopicDetails withHttpFailureFeedbackRoleArn(String httpFailureFeedbackRoleArn) {
        setHttpFailureFeedbackRoleArn(httpFailureFeedbackRoleArn);
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
        if (getKmsMasterKeyId() != null)
            sb.append("KmsMasterKeyId: ").append(getKmsMasterKeyId()).append(",");
        if (getSubscription() != null)
            sb.append("Subscription: ").append(getSubscription()).append(",");
        if (getTopicName() != null)
            sb.append("TopicName: ").append(getTopicName()).append(",");
        if (getOwner() != null)
            sb.append("Owner: ").append(getOwner()).append(",");
        if (getSqsSuccessFeedbackRoleArn() != null)
            sb.append("SqsSuccessFeedbackRoleArn: ").append(getSqsSuccessFeedbackRoleArn()).append(",");
        if (getSqsFailureFeedbackRoleArn() != null)
            sb.append("SqsFailureFeedbackRoleArn: ").append(getSqsFailureFeedbackRoleArn()).append(",");
        if (getApplicationSuccessFeedbackRoleArn() != null)
            sb.append("ApplicationSuccessFeedbackRoleArn: ").append(getApplicationSuccessFeedbackRoleArn()).append(",");
        if (getFirehoseSuccessFeedbackRoleArn() != null)
            sb.append("FirehoseSuccessFeedbackRoleArn: ").append(getFirehoseSuccessFeedbackRoleArn()).append(",");
        if (getFirehoseFailureFeedbackRoleArn() != null)
            sb.append("FirehoseFailureFeedbackRoleArn: ").append(getFirehoseFailureFeedbackRoleArn()).append(",");
        if (getHttpSuccessFeedbackRoleArn() != null)
            sb.append("HttpSuccessFeedbackRoleArn: ").append(getHttpSuccessFeedbackRoleArn()).append(",");
        if (getHttpFailureFeedbackRoleArn() != null)
            sb.append("HttpFailureFeedbackRoleArn: ").append(getHttpFailureFeedbackRoleArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsSnsTopicDetails == false)
            return false;
        AwsSnsTopicDetails other = (AwsSnsTopicDetails) obj;
        if (other.getKmsMasterKeyId() == null ^ this.getKmsMasterKeyId() == null)
            return false;
        if (other.getKmsMasterKeyId() != null && other.getKmsMasterKeyId().equals(this.getKmsMasterKeyId()) == false)
            return false;
        if (other.getSubscription() == null ^ this.getSubscription() == null)
            return false;
        if (other.getSubscription() != null && other.getSubscription().equals(this.getSubscription()) == false)
            return false;
        if (other.getTopicName() == null ^ this.getTopicName() == null)
            return false;
        if (other.getTopicName() != null && other.getTopicName().equals(this.getTopicName()) == false)
            return false;
        if (other.getOwner() == null ^ this.getOwner() == null)
            return false;
        if (other.getOwner() != null && other.getOwner().equals(this.getOwner()) == false)
            return false;
        if (other.getSqsSuccessFeedbackRoleArn() == null ^ this.getSqsSuccessFeedbackRoleArn() == null)
            return false;
        if (other.getSqsSuccessFeedbackRoleArn() != null && other.getSqsSuccessFeedbackRoleArn().equals(this.getSqsSuccessFeedbackRoleArn()) == false)
            return false;
        if (other.getSqsFailureFeedbackRoleArn() == null ^ this.getSqsFailureFeedbackRoleArn() == null)
            return false;
        if (other.getSqsFailureFeedbackRoleArn() != null && other.getSqsFailureFeedbackRoleArn().equals(this.getSqsFailureFeedbackRoleArn()) == false)
            return false;
        if (other.getApplicationSuccessFeedbackRoleArn() == null ^ this.getApplicationSuccessFeedbackRoleArn() == null)
            return false;
        if (other.getApplicationSuccessFeedbackRoleArn() != null
                && other.getApplicationSuccessFeedbackRoleArn().equals(this.getApplicationSuccessFeedbackRoleArn()) == false)
            return false;
        if (other.getFirehoseSuccessFeedbackRoleArn() == null ^ this.getFirehoseSuccessFeedbackRoleArn() == null)
            return false;
        if (other.getFirehoseSuccessFeedbackRoleArn() != null
                && other.getFirehoseSuccessFeedbackRoleArn().equals(this.getFirehoseSuccessFeedbackRoleArn()) == false)
            return false;
        if (other.getFirehoseFailureFeedbackRoleArn() == null ^ this.getFirehoseFailureFeedbackRoleArn() == null)
            return false;
        if (other.getFirehoseFailureFeedbackRoleArn() != null
                && other.getFirehoseFailureFeedbackRoleArn().equals(this.getFirehoseFailureFeedbackRoleArn()) == false)
            return false;
        if (other.getHttpSuccessFeedbackRoleArn() == null ^ this.getHttpSuccessFeedbackRoleArn() == null)
            return false;
        if (other.getHttpSuccessFeedbackRoleArn() != null && other.getHttpSuccessFeedbackRoleArn().equals(this.getHttpSuccessFeedbackRoleArn()) == false)
            return false;
        if (other.getHttpFailureFeedbackRoleArn() == null ^ this.getHttpFailureFeedbackRoleArn() == null)
            return false;
        if (other.getHttpFailureFeedbackRoleArn() != null && other.getHttpFailureFeedbackRoleArn().equals(this.getHttpFailureFeedbackRoleArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKmsMasterKeyId() == null) ? 0 : getKmsMasterKeyId().hashCode());
        hashCode = prime * hashCode + ((getSubscription() == null) ? 0 : getSubscription().hashCode());
        hashCode = prime * hashCode + ((getTopicName() == null) ? 0 : getTopicName().hashCode());
        hashCode = prime * hashCode + ((getOwner() == null) ? 0 : getOwner().hashCode());
        hashCode = prime * hashCode + ((getSqsSuccessFeedbackRoleArn() == null) ? 0 : getSqsSuccessFeedbackRoleArn().hashCode());
        hashCode = prime * hashCode + ((getSqsFailureFeedbackRoleArn() == null) ? 0 : getSqsFailureFeedbackRoleArn().hashCode());
        hashCode = prime * hashCode + ((getApplicationSuccessFeedbackRoleArn() == null) ? 0 : getApplicationSuccessFeedbackRoleArn().hashCode());
        hashCode = prime * hashCode + ((getFirehoseSuccessFeedbackRoleArn() == null) ? 0 : getFirehoseSuccessFeedbackRoleArn().hashCode());
        hashCode = prime * hashCode + ((getFirehoseFailureFeedbackRoleArn() == null) ? 0 : getFirehoseFailureFeedbackRoleArn().hashCode());
        hashCode = prime * hashCode + ((getHttpSuccessFeedbackRoleArn() == null) ? 0 : getHttpSuccessFeedbackRoleArn().hashCode());
        hashCode = prime * hashCode + ((getHttpFailureFeedbackRoleArn() == null) ? 0 : getHttpFailureFeedbackRoleArn().hashCode());
        return hashCode;
    }

    @Override
    public AwsSnsTopicDetails clone() {
        try {
            return (AwsSnsTopicDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsSnsTopicDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
