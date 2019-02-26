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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/UnsubscribeFromEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UnsubscribeFromEventRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the assessment template that is used during the event for which you want to stop receiving SNS
     * notifications.
     * </p>
     */
    private String resourceArn;
    /**
     * <p>
     * The event for which you want to stop receiving SNS notifications.
     * </p>
     */
    private String event;
    /**
     * <p>
     * The ARN of the SNS topic to which SNS notifications are sent.
     * </p>
     */
    private String topicArn;

    /**
     * <p>
     * The ARN of the assessment template that is used during the event for which you want to stop receiving SNS
     * notifications.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the assessment template that is used during the event for which you want to stop receiving SNS
     *        notifications.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * <p>
     * The ARN of the assessment template that is used during the event for which you want to stop receiving SNS
     * notifications.
     * </p>
     * 
     * @return The ARN of the assessment template that is used during the event for which you want to stop receiving SNS
     *         notifications.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * <p>
     * The ARN of the assessment template that is used during the event for which you want to stop receiving SNS
     * notifications.
     * </p>
     * 
     * @param resourceArn
     *        The ARN of the assessment template that is used during the event for which you want to stop receiving SNS
     *        notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsubscribeFromEventRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * <p>
     * The event for which you want to stop receiving SNS notifications.
     * </p>
     * 
     * @param event
     *        The event for which you want to stop receiving SNS notifications.
     * @see InspectorEvent
     */

    public void setEvent(String event) {
        this.event = event;
    }

    /**
     * <p>
     * The event for which you want to stop receiving SNS notifications.
     * </p>
     * 
     * @return The event for which you want to stop receiving SNS notifications.
     * @see InspectorEvent
     */

    public String getEvent() {
        return this.event;
    }

    /**
     * <p>
     * The event for which you want to stop receiving SNS notifications.
     * </p>
     * 
     * @param event
     *        The event for which you want to stop receiving SNS notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InspectorEvent
     */

    public UnsubscribeFromEventRequest withEvent(String event) {
        setEvent(event);
        return this;
    }

    /**
     * <p>
     * The event for which you want to stop receiving SNS notifications.
     * </p>
     * 
     * @param event
     *        The event for which you want to stop receiving SNS notifications.
     * @see InspectorEvent
     */

    public void setEvent(InspectorEvent event) {
        withEvent(event);
    }

    /**
     * <p>
     * The event for which you want to stop receiving SNS notifications.
     * </p>
     * 
     * @param event
     *        The event for which you want to stop receiving SNS notifications.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InspectorEvent
     */

    public UnsubscribeFromEventRequest withEvent(InspectorEvent event) {
        this.event = event.toString();
        return this;
    }

    /**
     * <p>
     * The ARN of the SNS topic to which SNS notifications are sent.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the SNS topic to which SNS notifications are sent.
     */

    public void setTopicArn(String topicArn) {
        this.topicArn = topicArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic to which SNS notifications are sent.
     * </p>
     * 
     * @return The ARN of the SNS topic to which SNS notifications are sent.
     */

    public String getTopicArn() {
        return this.topicArn;
    }

    /**
     * <p>
     * The ARN of the SNS topic to which SNS notifications are sent.
     * </p>
     * 
     * @param topicArn
     *        The ARN of the SNS topic to which SNS notifications are sent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UnsubscribeFromEventRequest withTopicArn(String topicArn) {
        setTopicArn(topicArn);
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
        if (getEvent() != null)
            sb.append("Event: ").append(getEvent()).append(",");
        if (getTopicArn() != null)
            sb.append("TopicArn: ").append(getTopicArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UnsubscribeFromEventRequest == false)
            return false;
        UnsubscribeFromEventRequest other = (UnsubscribeFromEventRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
            return false;
        if (other.getEvent() == null ^ this.getEvent() == null)
            return false;
        if (other.getEvent() != null && other.getEvent().equals(this.getEvent()) == false)
            return false;
        if (other.getTopicArn() == null ^ this.getTopicArn() == null)
            return false;
        if (other.getTopicArn() != null && other.getTopicArn().equals(this.getTopicArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getEvent() == null) ? 0 : getEvent().hashCode());
        hashCode = prime * hashCode + ((getTopicArn() == null) ? 0 : getTopicArn().hashCode());
        return hashCode;
    }

    @Override
    public UnsubscribeFromEventRequest clone() {
        return (UnsubscribeFromEventRequest) super.clone();
    }

}
