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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The NotificationSpecification data structure describes a HIT event notification for a HIT type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mturk-requester-2017-01-17/NotificationSpecification"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotificationSpecification implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The target for notification messages. The Destination’s format is determined by the specified Transport:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When Transport is Email, the Destination is your email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * When Transport is SQS, the Destination is your queue URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * When Transport is SNS, the Destination is the ARN of your topic.
     * </p>
     * </li>
     * </ul>
     */
    private String destination;
    /**
     * <p>
     * The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS.
     * </p>
     */
    private String transport;
    /**
     * <p>
     * The version of the Notification API to use. Valid value is 2006-05-05.
     * </p>
     */
    private String version;
    /**
     * <p>
     * The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted |
     * AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved |
     * HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only valid for the
     * SendTestEventNotification operation.
     * </p>
     */
    private java.util.List<String> eventTypes;

    /**
     * <p>
     * The target for notification messages. The Destination’s format is determined by the specified Transport:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When Transport is Email, the Destination is your email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * When Transport is SQS, the Destination is your queue URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * When Transport is SNS, the Destination is the ARN of your topic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param destination
     *        The target for notification messages. The Destination’s format is determined by the specified Transport:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When Transport is Email, the Destination is your email address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When Transport is SQS, the Destination is your queue URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When Transport is SNS, the Destination is the ARN of your topic.
     *        </p>
     *        </li>
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The target for notification messages. The Destination’s format is determined by the specified Transport:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When Transport is Email, the Destination is your email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * When Transport is SQS, the Destination is your queue URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * When Transport is SNS, the Destination is the ARN of your topic.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The target for notification messages. The Destination’s format is determined by the specified Transport:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         When Transport is Email, the Destination is your email address.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When Transport is SQS, the Destination is your queue URL.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         When Transport is SNS, the Destination is the ARN of your topic.
     *         </p>
     *         </li>
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The target for notification messages. The Destination’s format is determined by the specified Transport:
     * </p>
     * <ul>
     * <li>
     * <p>
     * When Transport is Email, the Destination is your email address.
     * </p>
     * </li>
     * <li>
     * <p>
     * When Transport is SQS, the Destination is your queue URL.
     * </p>
     * </li>
     * <li>
     * <p>
     * When Transport is SNS, the Destination is the ARN of your topic.
     * </p>
     * </li>
     * </ul>
     * 
     * @param destination
     *        The target for notification messages. The Destination’s format is determined by the specified Transport:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        When Transport is Email, the Destination is your email address.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When Transport is SQS, the Destination is your queue URL.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        When Transport is SNS, the Destination is the ARN of your topic.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationSpecification withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS.
     * </p>
     * 
     * @param transport
     *        The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS.
     * @see NotificationTransport
     */

    public void setTransport(String transport) {
        this.transport = transport;
    }

    /**
     * <p>
     * The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS.
     * </p>
     * 
     * @return The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS.
     * @see NotificationTransport
     */

    public String getTransport() {
        return this.transport;
    }

    /**
     * <p>
     * The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS.
     * </p>
     * 
     * @param transport
     *        The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationTransport
     */

    public NotificationSpecification withTransport(String transport) {
        setTransport(transport);
        return this;
    }

    /**
     * <p>
     * The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS.
     * </p>
     * 
     * @param transport
     *        The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS.
     * @see NotificationTransport
     */

    public void setTransport(NotificationTransport transport) {
        withTransport(transport);
    }

    /**
     * <p>
     * The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS.
     * </p>
     * 
     * @param transport
     *        The method Amazon Mechanical Turk uses to send the notification. Valid Values: Email | SQS | SNS.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotificationTransport
     */

    public NotificationSpecification withTransport(NotificationTransport transport) {
        this.transport = transport.toString();
        return this;
    }

    /**
     * <p>
     * The version of the Notification API to use. Valid value is 2006-05-05.
     * </p>
     * 
     * @param version
     *        The version of the Notification API to use. Valid value is 2006-05-05.
     */

    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * <p>
     * The version of the Notification API to use. Valid value is 2006-05-05.
     * </p>
     * 
     * @return The version of the Notification API to use. Valid value is 2006-05-05.
     */

    public String getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version of the Notification API to use. Valid value is 2006-05-05.
     * </p>
     * 
     * @param version
     *        The version of the Notification API to use. Valid value is 2006-05-05.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotificationSpecification withVersion(String version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted |
     * AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved |
     * HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only valid for the
     * SendTestEventNotification operation.
     * </p>
     * 
     * @return The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted |
     *         AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved
     *         | HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only
     *         valid for the SendTestEventNotification operation.
     * @see EventType
     */

    public java.util.List<String> getEventTypes() {
        return eventTypes;
    }

    /**
     * <p>
     * The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted |
     * AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved |
     * HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only valid for the
     * SendTestEventNotification operation.
     * </p>
     * 
     * @param eventTypes
     *        The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted |
     *        AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved |
     *        HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only valid
     *        for the SendTestEventNotification operation.
     * @see EventType
     */

    public void setEventTypes(java.util.Collection<String> eventTypes) {
        if (eventTypes == null) {
            this.eventTypes = null;
            return;
        }

        this.eventTypes = new java.util.ArrayList<String>(eventTypes);
    }

    /**
     * <p>
     * The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted |
     * AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved |
     * HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only valid for the
     * SendTestEventNotification operation.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEventTypes(java.util.Collection)} or {@link #withEventTypes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param eventTypes
     *        The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted |
     *        AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved |
     *        HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only valid
     *        for the SendTestEventNotification operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public NotificationSpecification withEventTypes(String... eventTypes) {
        if (this.eventTypes == null) {
            setEventTypes(new java.util.ArrayList<String>(eventTypes.length));
        }
        for (String ele : eventTypes) {
            this.eventTypes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted |
     * AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved |
     * HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only valid for the
     * SendTestEventNotification operation.
     * </p>
     * 
     * @param eventTypes
     *        The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted |
     *        AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved |
     *        HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only valid
     *        for the SendTestEventNotification operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public NotificationSpecification withEventTypes(java.util.Collection<String> eventTypes) {
        setEventTypes(eventTypes);
        return this;
    }

    /**
     * <p>
     * The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted |
     * AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved |
     * HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only valid for the
     * SendTestEventNotification operation.
     * </p>
     * 
     * @param eventTypes
     *        The list of events that should cause notifications to be sent. Valid Values: AssignmentAccepted |
     *        AssignmentAbandoned | AssignmentReturned | AssignmentSubmitted | AssignmentRejected | AssignmentApproved |
     *        HITCreated | HITExtended | HITDisposed | HITReviewable | HITExpired | Ping. The Ping event is only valid
     *        for the SendTestEventNotification operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public NotificationSpecification withEventTypes(EventType... eventTypes) {
        java.util.ArrayList<String> eventTypesCopy = new java.util.ArrayList<String>(eventTypes.length);
        for (EventType value : eventTypes) {
            eventTypesCopy.add(value.toString());
        }
        if (getEventTypes() == null) {
            setEventTypes(eventTypesCopy);
        } else {
            getEventTypes().addAll(eventTypesCopy);
        }
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
        if (getDestination() != null)
            sb.append("Destination: ").append(getDestination()).append(",");
        if (getTransport() != null)
            sb.append("Transport: ").append(getTransport()).append(",");
        if (getVersion() != null)
            sb.append("Version: ").append(getVersion()).append(",");
        if (getEventTypes() != null)
            sb.append("EventTypes: ").append(getEventTypes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotificationSpecification == false)
            return false;
        NotificationSpecification other = (NotificationSpecification) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getTransport() == null ^ this.getTransport() == null)
            return false;
        if (other.getTransport() != null && other.getTransport().equals(this.getTransport()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getEventTypes() == null ^ this.getEventTypes() == null)
            return false;
        if (other.getEventTypes() != null && other.getEventTypes().equals(this.getEventTypes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getTransport() == null) ? 0 : getTransport().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getEventTypes() == null) ? 0 : getEventTypes().hashCode());
        return hashCode;
    }

    @Override
    public NotificationSpecification clone() {
        try {
            return (NotificationSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mturk.model.transform.NotificationSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
