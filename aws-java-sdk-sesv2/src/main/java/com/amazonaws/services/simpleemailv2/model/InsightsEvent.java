/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * An object containing details about a specific event.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/InsightsEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsightsEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The timestamp of the event.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The type of event:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND</code> - The send request was successful and SES will attempt to deliver the message to the
     * recipient’s mail server. (If account-level or global suppression is being used, SES will still count it as a
     * send, but delivery is suppressed.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY</code> - SES successfully delivered the email to the recipient's mail server. Excludes deliveries
     * to the mailbox simulator, and those from emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOUNCE</code> - Feedback received for delivery failures. Additional details about the bounce are provided
     * in the <code>Details</code> object. Excludes bounces from the mailbox simulator, and those from emails addressed
     * to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLAINT</code> - Complaint received for the email. Additional details about the complaint are provided in
     * the <code>Details</code> object. This excludes complaints from the mailbox simulator, those originating from your
     * account-level suppression list (if enabled), and those from emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPEN</code> - Open event for emails including open trackers. Excludes opens for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLICK</code> - Click event for emails including wrapped links. Excludes clicks for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * </ul>
     */
    private String type;
    /**
     * <p>
     * Details about bounce or complaint events.
     * </p>
     */
    private EventDetails details;

    /**
     * <p>
     * The timestamp of the event.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the event.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The timestamp of the event.
     * </p>
     * 
     * @return The timestamp of the event.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The timestamp of the event.
     * </p>
     * 
     * @param timestamp
     *        The timestamp of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightsEvent withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The type of event:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND</code> - The send request was successful and SES will attempt to deliver the message to the
     * recipient’s mail server. (If account-level or global suppression is being used, SES will still count it as a
     * send, but delivery is suppressed.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY</code> - SES successfully delivered the email to the recipient's mail server. Excludes deliveries
     * to the mailbox simulator, and those from emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOUNCE</code> - Feedback received for delivery failures. Additional details about the bounce are provided
     * in the <code>Details</code> object. Excludes bounces from the mailbox simulator, and those from emails addressed
     * to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLAINT</code> - Complaint received for the email. Additional details about the complaint are provided in
     * the <code>Details</code> object. This excludes complaints from the mailbox simulator, those originating from your
     * account-level suppression list (if enabled), and those from emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPEN</code> - Open event for emails including open trackers. Excludes opens for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLICK</code> - Click event for emails including wrapped links. Excludes clicks for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of event:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SEND</code> - The send request was successful and SES will attempt to deliver the message to the
     *        recipient’s mail server. (If account-level or global suppression is being used, SES will still count it as
     *        a send, but delivery is suppressed.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY</code> - SES successfully delivered the email to the recipient's mail server. Excludes
     *        deliveries to the mailbox simulator, and those from emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOUNCE</code> - Feedback received for delivery failures. Additional details about the bounce are
     *        provided in the <code>Details</code> object. Excludes bounces from the mailbox simulator, and those from
     *        emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLAINT</code> - Complaint received for the email. Additional details about the complaint are
     *        provided in the <code>Details</code> object. This excludes complaints from the mailbox simulator, those
     *        originating from your account-level suppression list (if enabled), and those from emails addressed to more
     *        than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPEN</code> - Open event for emails including open trackers. Excludes opens for emails addressed to
     *        more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CLICK</code> - Click event for emails including wrapped links. Excludes clicks for emails addressed
     *        to more than one recipient.
     *        </p>
     *        </li>
     * @see EventType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of event:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND</code> - The send request was successful and SES will attempt to deliver the message to the
     * recipient’s mail server. (If account-level or global suppression is being used, SES will still count it as a
     * send, but delivery is suppressed.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY</code> - SES successfully delivered the email to the recipient's mail server. Excludes deliveries
     * to the mailbox simulator, and those from emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOUNCE</code> - Feedback received for delivery failures. Additional details about the bounce are provided
     * in the <code>Details</code> object. Excludes bounces from the mailbox simulator, and those from emails addressed
     * to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLAINT</code> - Complaint received for the email. Additional details about the complaint are provided in
     * the <code>Details</code> object. This excludes complaints from the mailbox simulator, those originating from your
     * account-level suppression list (if enabled), and those from emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPEN</code> - Open event for emails including open trackers. Excludes opens for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLICK</code> - Click event for emails including wrapped links. Excludes clicks for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The type of event:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SEND</code> - The send request was successful and SES will attempt to deliver the message to the
     *         recipient’s mail server. (If account-level or global suppression is being used, SES will still count it
     *         as a send, but delivery is suppressed.)
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELIVERY</code> - SES successfully delivered the email to the recipient's mail server. Excludes
     *         deliveries to the mailbox simulator, and those from emails addressed to more than one recipient.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>BOUNCE</code> - Feedback received for delivery failures. Additional details about the bounce are
     *         provided in the <code>Details</code> object. Excludes bounces from the mailbox simulator, and those from
     *         emails addressed to more than one recipient.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>COMPLAINT</code> - Complaint received for the email. Additional details about the complaint are
     *         provided in the <code>Details</code> object. This excludes complaints from the mailbox simulator, those
     *         originating from your account-level suppression list (if enabled), and those from emails addressed to
     *         more than one recipient.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OPEN</code> - Open event for emails including open trackers. Excludes opens for emails addressed to
     *         more than one recipient.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CLICK</code> - Click event for emails including wrapped links. Excludes clicks for emails addressed
     *         to more than one recipient.
     *         </p>
     *         </li>
     * @see EventType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of event:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND</code> - The send request was successful and SES will attempt to deliver the message to the
     * recipient’s mail server. (If account-level or global suppression is being used, SES will still count it as a
     * send, but delivery is suppressed.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY</code> - SES successfully delivered the email to the recipient's mail server. Excludes deliveries
     * to the mailbox simulator, and those from emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOUNCE</code> - Feedback received for delivery failures. Additional details about the bounce are provided
     * in the <code>Details</code> object. Excludes bounces from the mailbox simulator, and those from emails addressed
     * to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLAINT</code> - Complaint received for the email. Additional details about the complaint are provided in
     * the <code>Details</code> object. This excludes complaints from the mailbox simulator, those originating from your
     * account-level suppression list (if enabled), and those from emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPEN</code> - Open event for emails including open trackers. Excludes opens for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLICK</code> - Click event for emails including wrapped links. Excludes clicks for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of event:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SEND</code> - The send request was successful and SES will attempt to deliver the message to the
     *        recipient’s mail server. (If account-level or global suppression is being used, SES will still count it as
     *        a send, but delivery is suppressed.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY</code> - SES successfully delivered the email to the recipient's mail server. Excludes
     *        deliveries to the mailbox simulator, and those from emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOUNCE</code> - Feedback received for delivery failures. Additional details about the bounce are
     *        provided in the <code>Details</code> object. Excludes bounces from the mailbox simulator, and those from
     *        emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLAINT</code> - Complaint received for the email. Additional details about the complaint are
     *        provided in the <code>Details</code> object. This excludes complaints from the mailbox simulator, those
     *        originating from your account-level suppression list (if enabled), and those from emails addressed to more
     *        than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPEN</code> - Open event for emails including open trackers. Excludes opens for emails addressed to
     *        more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CLICK</code> - Click event for emails including wrapped links. Excludes clicks for emails addressed
     *        to more than one recipient.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public InsightsEvent withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of event:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SEND</code> - The send request was successful and SES will attempt to deliver the message to the
     * recipient’s mail server. (If account-level or global suppression is being used, SES will still count it as a
     * send, but delivery is suppressed.)
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELIVERY</code> - SES successfully delivered the email to the recipient's mail server. Excludes deliveries
     * to the mailbox simulator, and those from emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>BOUNCE</code> - Feedback received for delivery failures. Additional details about the bounce are provided
     * in the <code>Details</code> object. Excludes bounces from the mailbox simulator, and those from emails addressed
     * to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>COMPLAINT</code> - Complaint received for the email. Additional details about the complaint are provided in
     * the <code>Details</code> object. This excludes complaints from the mailbox simulator, those originating from your
     * account-level suppression list (if enabled), and those from emails addressed to more than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OPEN</code> - Open event for emails including open trackers. Excludes opens for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CLICK</code> - Click event for emails including wrapped links. Excludes clicks for emails addressed to more
     * than one recipient.
     * </p>
     * </li>
     * </ul>
     * 
     * @param type
     *        The type of event:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SEND</code> - The send request was successful and SES will attempt to deliver the message to the
     *        recipient’s mail server. (If account-level or global suppression is being used, SES will still count it as
     *        a send, but delivery is suppressed.)
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELIVERY</code> - SES successfully delivered the email to the recipient's mail server. Excludes
     *        deliveries to the mailbox simulator, and those from emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>BOUNCE</code> - Feedback received for delivery failures. Additional details about the bounce are
     *        provided in the <code>Details</code> object. Excludes bounces from the mailbox simulator, and those from
     *        emails addressed to more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>COMPLAINT</code> - Complaint received for the email. Additional details about the complaint are
     *        provided in the <code>Details</code> object. This excludes complaints from the mailbox simulator, those
     *        originating from your account-level suppression list (if enabled), and those from emails addressed to more
     *        than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OPEN</code> - Open event for emails including open trackers. Excludes opens for emails addressed to
     *        more than one recipient.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CLICK</code> - Click event for emails including wrapped links. Excludes clicks for emails addressed
     *        to more than one recipient.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventType
     */

    public InsightsEvent withType(EventType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Details about bounce or complaint events.
     * </p>
     * 
     * @param details
     *        Details about bounce or complaint events.
     */

    public void setDetails(EventDetails details) {
        this.details = details;
    }

    /**
     * <p>
     * Details about bounce or complaint events.
     * </p>
     * 
     * @return Details about bounce or complaint events.
     */

    public EventDetails getDetails() {
        return this.details;
    }

    /**
     * <p>
     * Details about bounce or complaint events.
     * </p>
     * 
     * @param details
     *        Details about bounce or complaint events.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsightsEvent withDetails(EventDetails details) {
        setDetails(details);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getDetails() != null)
            sb.append("Details: ").append(getDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InsightsEvent == false)
            return false;
        InsightsEvent other = (InsightsEvent) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getDetails() == null ^ this.getDetails() == null)
            return false;
        if (other.getDetails() != null && other.getDetails().equals(this.getDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getDetails() == null) ? 0 : getDetails().hashCode());
        return hashCode;
    }

    @Override
    public InsightsEvent clone() {
        try {
            return (InsightsEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.InsightsEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
