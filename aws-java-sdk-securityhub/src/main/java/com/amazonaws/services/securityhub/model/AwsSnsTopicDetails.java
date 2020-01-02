/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A wrapper type for the topic's Amazon Resource Name (ARN).
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsSnsTopicDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsSnsTopicDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.
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
     * The name of the topic.
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
     * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.
     * </p>
     * 
     * @param kmsMasterKeyId
     *        The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.
     */

    public void setKmsMasterKeyId(String kmsMasterKeyId) {
        this.kmsMasterKeyId = kmsMasterKeyId;
    }

    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.
     * </p>
     * 
     * @return The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.
     */

    public String getKmsMasterKeyId() {
        return this.kmsMasterKeyId;
    }

    /**
     * <p>
     * The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.
     * </p>
     * 
     * @param kmsMasterKeyId
     *        The ID of an AWS-managed customer master key (CMK) for Amazon SNS or a custom CMK.
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
     * The name of the topic.
     * </p>
     * 
     * @param topicName
     *        The name of the topic.
     */

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    /**
     * <p>
     * The name of the topic.
     * </p>
     * 
     * @return The name of the topic.
     */

    public String getTopicName() {
        return this.topicName;
    }

    /**
     * <p>
     * The name of the topic.
     * </p>
     * 
     * @param topicName
     *        The name of the topic.
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
            sb.append("Owner: ").append(getOwner());
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
