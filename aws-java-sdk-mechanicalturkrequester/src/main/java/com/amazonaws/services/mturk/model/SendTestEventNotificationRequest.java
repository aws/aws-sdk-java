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
package com.amazonaws.services.mturk.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/SendTestEventNotification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SendTestEventNotificationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The notification specification to test. This value is identical to the value you would provide to the
     * UpdateNotificationSettings operation when you establish the notification specification for a HIT type.
     * </p>
     */
    private NotificationSpecification notification;
    /**
     * <p>
     * The event to simulate to test the notification specification. This event is included in the test message even if
     * the notification specification does not include the event type. The notification specification does not filter
     * out the test event.
     * </p>
     */
    private String testEventType;

    /**
     * <p>
     * The notification specification to test. This value is identical to the value you would provide to the
     * UpdateNotificationSettings operation when you establish the notification specification for a HIT type.
     * </p>
     * 
     * @param notification
     *        The notification specification to test. This value is identical to the value you would provide to the
     *        UpdateNotificationSettings operation when you establish the notification specification for a HIT type.
     */

    public void setNotification(NotificationSpecification notification) {
        this.notification = notification;
    }

    /**
     * <p>
     * The notification specification to test. This value is identical to the value you would provide to the
     * UpdateNotificationSettings operation when you establish the notification specification for a HIT type.
     * </p>
     * 
     * @return The notification specification to test. This value is identical to the value you would provide to the
     *         UpdateNotificationSettings operation when you establish the notification specification for a HIT type.
     */

    public NotificationSpecification getNotification() {
        return this.notification;
    }

    /**
     * <p>
     * The notification specification to test. This value is identical to the value you would provide to the
     * UpdateNotificationSettings operation when you establish the notification specification for a HIT type.
     * </p>
     * 
     * @param notification
     *        The notification specification to test. This value is identical to the value you would provide to the
     *        UpdateNotificationSettings operation when you establish the notification specification for a HIT type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SendTestEventNotificationRequest withNotification(NotificationSpecification notification) {
        setNotification(notification);
        return this;
    }

    /**
     * <p>
     * The event to simulate to test the notification specification. This event is included in the test message even if
     * the notification specification does not include the event type. The notification specification does not filter
     * out the test event.
     * </p>
     * 
     * @param testEventType
     *        The event to simulate to test the notification specification. This event is included in the test message
     *        even if the notification specification does not include the event type. The notification specification
     *        does not filter out the test event.
     * @see EventType
     */

    public void setTestEventType(String testEventType) {
        this.testEventType = testEventType;
    }

    /**
     * <p>
     * The event to simulate to test the notification specification. This event is included in the test message even if
     * the notification specification does not include the event type. The notification specification does not filter
     * out the test event.
     * </p>
     * 
     * @return The event to simulate to test the notification specification. This event is included in the test message
     *         even if the notification specification does not include the event type. The notification specification
     *         does not filter out the test event.
     * @see EventType
     */

    public String getTestEventType() {
        return this.testEventType;
    }

    /**
     * <p>
     * The event to simulate to test the notification specification. This event is included in the test message even if
     * the notification specification does not include the event type. The notification specification does not filter
     * out the test event.
     * </p>
     * 
     * @param testEventType
     *        The event to simulate to test the notification specification. This event is included in the test message
     *        even if the notification specification does not include the event type. The notification specification
     *        does not filter out the test event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public SendTestEventNotificationRequest withTestEventType(String testEventType) {
        setTestEventType(testEventType);
        return this;
    }

    /**
     * <p>
     * The event to simulate to test the notification specification. This event is included in the test message even if
     * the notification specification does not include the event type. The notification specification does not filter
     * out the test event.
     * </p>
     * 
     * @param testEventType
     *        The event to simulate to test the notification specification. This event is included in the test message
     *        even if the notification specification does not include the event type. The notification specification
     *        does not filter out the test event.
     * @see EventType
     */

    public void setTestEventType(EventType testEventType) {
        withTestEventType(testEventType);
    }

    /**
     * <p>
     * The event to simulate to test the notification specification. This event is included in the test message even if
     * the notification specification does not include the event type. The notification specification does not filter
     * out the test event.
     * </p>
     * 
     * @param testEventType
     *        The event to simulate to test the notification specification. This event is included in the test message
     *        even if the notification specification does not include the event type. The notification specification
     *        does not filter out the test event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public SendTestEventNotificationRequest withTestEventType(EventType testEventType) {
        this.testEventType = testEventType.toString();
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
        if (getNotification() != null)
            sb.append("Notification: ").append(getNotification()).append(",");
        if (getTestEventType() != null)
            sb.append("TestEventType: ").append(getTestEventType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SendTestEventNotificationRequest == false)
            return false;
        SendTestEventNotificationRequest other = (SendTestEventNotificationRequest) obj;
        if (other.getNotification() == null ^ this.getNotification() == null)
            return false;
        if (other.getNotification() != null && other.getNotification().equals(this.getNotification()) == false)
            return false;
        if (other.getTestEventType() == null ^ this.getTestEventType() == null)
            return false;
        if (other.getTestEventType() != null && other.getTestEventType().equals(this.getTestEventType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotification() == null) ? 0 : getNotification().hashCode());
        hashCode = prime * hashCode + ((getTestEventType() == null) ? 0 : getTestEventType().hashCode());
        return hashCode;
    }

    @Override
    public SendTestEventNotificationRequest clone() {
        return (SendTestEventNotificationRequest) super.clone();
    }

}
