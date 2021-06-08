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
package com.amazonaws.services.simpleemailv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The contact's preference for being opted-in to or opted-out of a topic.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/TopicPreference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TopicPreference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the topic.
     * </p>
     */
    private String topicName;
    /**
     * <p>
     * The contact's subscription status to a topic which is either <code>OPT_IN</code> or <code>OPT_OUT</code>.
     * </p>
     */
    private String subscriptionStatus;

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

    public TopicPreference withTopicName(String topicName) {
        setTopicName(topicName);
        return this;
    }

    /**
     * <p>
     * The contact's subscription status to a topic which is either <code>OPT_IN</code> or <code>OPT_OUT</code>.
     * </p>
     * 
     * @param subscriptionStatus
     *        The contact's subscription status to a topic which is either <code>OPT_IN</code> or <code>OPT_OUT</code>.
     * @see SubscriptionStatus
     */

    public void setSubscriptionStatus(String subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    /**
     * <p>
     * The contact's subscription status to a topic which is either <code>OPT_IN</code> or <code>OPT_OUT</code>.
     * </p>
     * 
     * @return The contact's subscription status to a topic which is either <code>OPT_IN</code> or <code>OPT_OUT</code>.
     * @see SubscriptionStatus
     */

    public String getSubscriptionStatus() {
        return this.subscriptionStatus;
    }

    /**
     * <p>
     * The contact's subscription status to a topic which is either <code>OPT_IN</code> or <code>OPT_OUT</code>.
     * </p>
     * 
     * @param subscriptionStatus
     *        The contact's subscription status to a topic which is either <code>OPT_IN</code> or <code>OPT_OUT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionStatus
     */

    public TopicPreference withSubscriptionStatus(String subscriptionStatus) {
        setSubscriptionStatus(subscriptionStatus);
        return this;
    }

    /**
     * <p>
     * The contact's subscription status to a topic which is either <code>OPT_IN</code> or <code>OPT_OUT</code>.
     * </p>
     * 
     * @param subscriptionStatus
     *        The contact's subscription status to a topic which is either <code>OPT_IN</code> or <code>OPT_OUT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SubscriptionStatus
     */

    public TopicPreference withSubscriptionStatus(SubscriptionStatus subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus.toString();
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
        if (getTopicName() != null)
            sb.append("TopicName: ").append(getTopicName()).append(",");
        if (getSubscriptionStatus() != null)
            sb.append("SubscriptionStatus: ").append(getSubscriptionStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TopicPreference == false)
            return false;
        TopicPreference other = (TopicPreference) obj;
        if (other.getTopicName() == null ^ this.getTopicName() == null)
            return false;
        if (other.getTopicName() != null && other.getTopicName().equals(this.getTopicName()) == false)
            return false;
        if (other.getSubscriptionStatus() == null ^ this.getSubscriptionStatus() == null)
            return false;
        if (other.getSubscriptionStatus() != null && other.getSubscriptionStatus().equals(this.getSubscriptionStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTopicName() == null) ? 0 : getTopicName().hashCode());
        hashCode = prime * hashCode + ((getSubscriptionStatus() == null) ? 0 : getSubscriptionStatus().hashCode());
        return hashCode;
    }

    @Override
    public TopicPreference clone() {
        try {
            return (TopicPreference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.TopicPreferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
