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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * This data type is used as a response element in the <a>ListEventSubscriptions</a> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/Subscription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Subscription implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the assessment template that is used during the event for which the SNS notification is sent.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The ARN of the Amazon Simple Notification Service (SNS) topic to which the SNS notifications are sent.
     * </p>
     */
    private String topicArn;
    /**
     * <p>
     * The list of existing event subscriptions.
     * </p>
     */
    private java.util.List<EventSubscription> eventSubscriptions;

    /**
     * <p>
     * The ARN of the assessment template that is used during the event for which the SNS notification is sent.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the assessment template that is used during the event for which the SNS notification is sent.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the assessment template that is used during the event for which the SNS notification is sent.
     * </p>
     * 
     * @return The ARN of the assessment template that is used during the event for which the SNS notification is sent.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the assessment template that is used during the event for which the SNS notification is sent.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the assessment template that is used during the event for which the SNS notification is sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the Amazon Simple Notification Service (SNS) topic to which the SNS notifications are sent.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the Amazon Simple Notification Service (SNS) topic to which the SNS notifications are sent.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Simple Notification Service (SNS) topic to which the SNS notifications are sent.
     * </p>
     * 
     * @return The ARN of the Amazon Simple Notification Service (SNS) topic to which the SNS notifications are sent.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The ARN of the Amazon Simple Notification Service (SNS) topic to which the SNS notifications are sent.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the Amazon Simple Notification Service (SNS) topic to which the SNS notifications are sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withTopicArn(String topicArn) {
        setTopicArn(topicArn);
        return this;
    }

    /**
     * <p>
     * The list of existing event subscriptions.
     * </p>
     * 
     * @return The list of existing event subscriptions.
     */

    public java.util.List<EventSubscription> getEventSubscriptions() {
        return eventSubscriptions;
    }

    /**
     * <p>
     * The list of existing event subscriptions.
     * </p>
     * 
     * @param eventSubscriptions
     *        The list of existing event subscriptions.
     */

    public void setEventSubscriptions(java.util.Collection<EventSubscription> eventSubscriptions) {
        if (eventSubscriptions == null) {
            this.eventSubscriptions = null;
            return;
        }

        this.eventSubscriptions = new java.util.ArrayList<EventSubscription>(eventSubscriptions);
    }

    /**
     * <p>
     * The list of existing event subscriptions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventSubscriptions(java.util.Collection)} or {@link #withEventSubscriptions(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param eventSubscriptions
     *        The list of existing event subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withEventSubscriptions(EventSubscription... eventSubscriptions) {
        if (this.eventSubscriptions == null) {
            setEventSubscriptions(new java.util.ArrayList<EventSubscription>(eventSubscriptions.length));
        }
        for (EventSubscription ele : eventSubscriptions) {
            this.eventSubscriptions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of existing event subscriptions.
     * </p>
     * 
     * @param eventSubscriptions
     *        The list of existing event subscriptions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Subscription withEventSubscriptions(java.util.Collection<EventSubscription> eventSubscriptions) {
        setEventSubscriptions(eventSubscriptions);
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn()).append(",");
        if (getEventSubscriptions() != null)
            sb.append("EventSubscriptions: ").append(getEventSubscriptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Subscription == false)
            return false;
        Subscription other = (Subscription) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        if (other.getEventSubscriptions() == null ^ this.getEventSubscriptions() == null)
            return false;
        if (other.getEventSubscriptions() != null && other.getEventSubscriptions().equals(this.getEventSubscriptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        hashCode = prime * hashCode + ((getEventSubscriptions() == null) ? 0 : getEventSubscriptions().hashCode());
        return hashCode;
    }

    @Override
    public Subscription clone() {
        try {
            return (Subscription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.inspector.model.transform.SubscriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
