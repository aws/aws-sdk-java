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
 * An object containing Message Insights filters.
 * </p>
 * <p>
 * If you specify multiple filters, the filters are joined by AND.
 * </p>
 * <p>
 * If you specify multiple values for a filter, the values are joined by OR. Filter values are case-sensitive.
 * </p>
 * <p>
 * <code>FromEmailAddress</code>, <code>Destination</code>, and <code>Subject</code> filters support partial match. A
 * partial match is performed by using the <code>*</code> wildcard character placed at the beginning (suffix match), the
 * end (prefix match) or both ends of the string (contains match). In order to match the literal characters
 * <code>*</code> or <code>\</code>, they must be escaped using the <code>\</code> character. If no wildcard character
 * is present, an exact match is performed.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/MessageInsightsFilters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MessageInsightsFilters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The from address used to send the message.
     * </p>
     */
    private java.util.List<String> fromEmailAddress;
    /**
     * <p>
     * The recipient's email address.
     * </p>
     */
    private java.util.List<String> destination;
    /**
     * <p>
     * The subject line of the message.
     * </p>
     */
    private java.util.List<String> subject;
    /**
     * <p>
     * The recipient's ISP (e.g., <code>Gmail</code>, <code>Yahoo</code>, etc.).
     * </p>
     */
    private java.util.List<String> isp;
    /**
     * <p>
     * The last delivery-related event for the email, where the ordering is as follows: <code>SEND</code> &lt;
     * <code>BOUNCE</code> &lt; <code>DELIVERY</code> &lt; <code>COMPLAINT</code>.
     * </p>
     */
    private java.util.List<String> lastDeliveryEvent;
    /**
     * <p>
     * The last engagement-related event for the email, where the ordering is as follows: <code>OPEN</code> &lt;
     * <code>CLICK</code>.
     * </p>
     * <p>
     * Engagement events are only available if <a
     * href="https://docs.aws.amazon.com/ses/latest/dg/vdm-settings.html">Engagement tracking</a> is enabled.
     * </p>
     */
    private java.util.List<String> lastEngagementEvent;

    /**
     * <p>
     * The from address used to send the message.
     * </p>
     * 
     * @return The from address used to send the message.
     */

    public java.util.List<String> getFromEmailAddress() {
        return fromEmailAddress;
    }

    /**
     * <p>
     * The from address used to send the message.
     * </p>
     * 
     * @param fromEmailAddress
     *        The from address used to send the message.
     */

    public void setFromEmailAddress(java.util.Collection<String> fromEmailAddress) {
        if (fromEmailAddress == null) {
            this.fromEmailAddress = null;
            return;
        }

        this.fromEmailAddress = new java.util.ArrayList<String>(fromEmailAddress);
    }

    /**
     * <p>
     * The from address used to send the message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFromEmailAddress(java.util.Collection)} or {@link #withFromEmailAddress(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param fromEmailAddress
     *        The from address used to send the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageInsightsFilters withFromEmailAddress(String... fromEmailAddress) {
        if (this.fromEmailAddress == null) {
            setFromEmailAddress(new java.util.ArrayList<String>(fromEmailAddress.length));
        }
        for (String ele : fromEmailAddress) {
            this.fromEmailAddress.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The from address used to send the message.
     * </p>
     * 
     * @param fromEmailAddress
     *        The from address used to send the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageInsightsFilters withFromEmailAddress(java.util.Collection<String> fromEmailAddress) {
        setFromEmailAddress(fromEmailAddress);
        return this;
    }

    /**
     * <p>
     * The recipient's email address.
     * </p>
     * 
     * @return The recipient's email address.
     */

    public java.util.List<String> getDestination() {
        return destination;
    }

    /**
     * <p>
     * The recipient's email address.
     * </p>
     * 
     * @param destination
     *        The recipient's email address.
     */

    public void setDestination(java.util.Collection<String> destination) {
        if (destination == null) {
            this.destination = null;
            return;
        }

        this.destination = new java.util.ArrayList<String>(destination);
    }

    /**
     * <p>
     * The recipient's email address.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDestination(java.util.Collection)} or {@link #withDestination(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param destination
     *        The recipient's email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageInsightsFilters withDestination(String... destination) {
        if (this.destination == null) {
            setDestination(new java.util.ArrayList<String>(destination.length));
        }
        for (String ele : destination) {
            this.destination.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recipient's email address.
     * </p>
     * 
     * @param destination
     *        The recipient's email address.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageInsightsFilters withDestination(java.util.Collection<String> destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The subject line of the message.
     * </p>
     * 
     * @return The subject line of the message.
     */

    public java.util.List<String> getSubject() {
        return subject;
    }

    /**
     * <p>
     * The subject line of the message.
     * </p>
     * 
     * @param subject
     *        The subject line of the message.
     */

    public void setSubject(java.util.Collection<String> subject) {
        if (subject == null) {
            this.subject = null;
            return;
        }

        this.subject = new java.util.ArrayList<String>(subject);
    }

    /**
     * <p>
     * The subject line of the message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSubject(java.util.Collection)} or {@link #withSubject(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param subject
     *        The subject line of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageInsightsFilters withSubject(String... subject) {
        if (this.subject == null) {
            setSubject(new java.util.ArrayList<String>(subject.length));
        }
        for (String ele : subject) {
            this.subject.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The subject line of the message.
     * </p>
     * 
     * @param subject
     *        The subject line of the message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageInsightsFilters withSubject(java.util.Collection<String> subject) {
        setSubject(subject);
        return this;
    }

    /**
     * <p>
     * The recipient's ISP (e.g., <code>Gmail</code>, <code>Yahoo</code>, etc.).
     * </p>
     * 
     * @return The recipient's ISP (e.g., <code>Gmail</code>, <code>Yahoo</code>, etc.).
     */

    public java.util.List<String> getIsp() {
        return isp;
    }

    /**
     * <p>
     * The recipient's ISP (e.g., <code>Gmail</code>, <code>Yahoo</code>, etc.).
     * </p>
     * 
     * @param isp
     *        The recipient's ISP (e.g., <code>Gmail</code>, <code>Yahoo</code>, etc.).
     */

    public void setIsp(java.util.Collection<String> isp) {
        if (isp == null) {
            this.isp = null;
            return;
        }

        this.isp = new java.util.ArrayList<String>(isp);
    }

    /**
     * <p>
     * The recipient's ISP (e.g., <code>Gmail</code>, <code>Yahoo</code>, etc.).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIsp(java.util.Collection)} or {@link #withIsp(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param isp
     *        The recipient's ISP (e.g., <code>Gmail</code>, <code>Yahoo</code>, etc.).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageInsightsFilters withIsp(String... isp) {
        if (this.isp == null) {
            setIsp(new java.util.ArrayList<String>(isp.length));
        }
        for (String ele : isp) {
            this.isp.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The recipient's ISP (e.g., <code>Gmail</code>, <code>Yahoo</code>, etc.).
     * </p>
     * 
     * @param isp
     *        The recipient's ISP (e.g., <code>Gmail</code>, <code>Yahoo</code>, etc.).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MessageInsightsFilters withIsp(java.util.Collection<String> isp) {
        setIsp(isp);
        return this;
    }

    /**
     * <p>
     * The last delivery-related event for the email, where the ordering is as follows: <code>SEND</code> &lt;
     * <code>BOUNCE</code> &lt; <code>DELIVERY</code> &lt; <code>COMPLAINT</code>.
     * </p>
     * 
     * @return The last delivery-related event for the email, where the ordering is as follows: <code>SEND</code> &lt;
     *         <code>BOUNCE</code> &lt; <code>DELIVERY</code> &lt; <code>COMPLAINT</code>.
     * @see DeliveryEventType
     */

    public java.util.List<String> getLastDeliveryEvent() {
        return lastDeliveryEvent;
    }

    /**
     * <p>
     * The last delivery-related event for the email, where the ordering is as follows: <code>SEND</code> &lt;
     * <code>BOUNCE</code> &lt; <code>DELIVERY</code> &lt; <code>COMPLAINT</code>.
     * </p>
     * 
     * @param lastDeliveryEvent
     *        The last delivery-related event for the email, where the ordering is as follows: <code>SEND</code> &lt;
     *        <code>BOUNCE</code> &lt; <code>DELIVERY</code> &lt; <code>COMPLAINT</code>.
     * @see DeliveryEventType
     */

    public void setLastDeliveryEvent(java.util.Collection<String> lastDeliveryEvent) {
        if (lastDeliveryEvent == null) {
            this.lastDeliveryEvent = null;
            return;
        }

        this.lastDeliveryEvent = new java.util.ArrayList<String>(lastDeliveryEvent);
    }

    /**
     * <p>
     * The last delivery-related event for the email, where the ordering is as follows: <code>SEND</code> &lt;
     * <code>BOUNCE</code> &lt; <code>DELIVERY</code> &lt; <code>COMPLAINT</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLastDeliveryEvent(java.util.Collection)} or {@link #withLastDeliveryEvent(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param lastDeliveryEvent
     *        The last delivery-related event for the email, where the ordering is as follows: <code>SEND</code> &lt;
     *        <code>BOUNCE</code> &lt; <code>DELIVERY</code> &lt; <code>COMPLAINT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryEventType
     */

    public MessageInsightsFilters withLastDeliveryEvent(String... lastDeliveryEvent) {
        if (this.lastDeliveryEvent == null) {
            setLastDeliveryEvent(new java.util.ArrayList<String>(lastDeliveryEvent.length));
        }
        for (String ele : lastDeliveryEvent) {
            this.lastDeliveryEvent.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The last delivery-related event for the email, where the ordering is as follows: <code>SEND</code> &lt;
     * <code>BOUNCE</code> &lt; <code>DELIVERY</code> &lt; <code>COMPLAINT</code>.
     * </p>
     * 
     * @param lastDeliveryEvent
     *        The last delivery-related event for the email, where the ordering is as follows: <code>SEND</code> &lt;
     *        <code>BOUNCE</code> &lt; <code>DELIVERY</code> &lt; <code>COMPLAINT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryEventType
     */

    public MessageInsightsFilters withLastDeliveryEvent(java.util.Collection<String> lastDeliveryEvent) {
        setLastDeliveryEvent(lastDeliveryEvent);
        return this;
    }

    /**
     * <p>
     * The last delivery-related event for the email, where the ordering is as follows: <code>SEND</code> &lt;
     * <code>BOUNCE</code> &lt; <code>DELIVERY</code> &lt; <code>COMPLAINT</code>.
     * </p>
     * 
     * @param lastDeliveryEvent
     *        The last delivery-related event for the email, where the ordering is as follows: <code>SEND</code> &lt;
     *        <code>BOUNCE</code> &lt; <code>DELIVERY</code> &lt; <code>COMPLAINT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeliveryEventType
     */

    public MessageInsightsFilters withLastDeliveryEvent(DeliveryEventType... lastDeliveryEvent) {
        java.util.ArrayList<String> lastDeliveryEventCopy = new java.util.ArrayList<String>(lastDeliveryEvent.length);
        for (DeliveryEventType value : lastDeliveryEvent) {
            lastDeliveryEventCopy.add(value.toString());
        }
        if (getLastDeliveryEvent() == null) {
            setLastDeliveryEvent(lastDeliveryEventCopy);
        } else {
            getLastDeliveryEvent().addAll(lastDeliveryEventCopy);
        }
        return this;
    }

    /**
     * <p>
     * The last engagement-related event for the email, where the ordering is as follows: <code>OPEN</code> &lt;
     * <code>CLICK</code>.
     * </p>
     * <p>
     * Engagement events are only available if <a
     * href="https://docs.aws.amazon.com/ses/latest/dg/vdm-settings.html">Engagement tracking</a> is enabled.
     * </p>
     * 
     * @return The last engagement-related event for the email, where the ordering is as follows: <code>OPEN</code> &lt;
     *         <code>CLICK</code>. </p>
     *         <p>
     *         Engagement events are only available if <a
     *         href="https://docs.aws.amazon.com/ses/latest/dg/vdm-settings.html">Engagement tracking</a> is enabled.
     * @see EngagementEventType
     */

    public java.util.List<String> getLastEngagementEvent() {
        return lastEngagementEvent;
    }

    /**
     * <p>
     * The last engagement-related event for the email, where the ordering is as follows: <code>OPEN</code> &lt;
     * <code>CLICK</code>.
     * </p>
     * <p>
     * Engagement events are only available if <a
     * href="https://docs.aws.amazon.com/ses/latest/dg/vdm-settings.html">Engagement tracking</a> is enabled.
     * </p>
     * 
     * @param lastEngagementEvent
     *        The last engagement-related event for the email, where the ordering is as follows: <code>OPEN</code> &lt;
     *        <code>CLICK</code>. </p>
     *        <p>
     *        Engagement events are only available if <a
     *        href="https://docs.aws.amazon.com/ses/latest/dg/vdm-settings.html">Engagement tracking</a> is enabled.
     * @see EngagementEventType
     */

    public void setLastEngagementEvent(java.util.Collection<String> lastEngagementEvent) {
        if (lastEngagementEvent == null) {
            this.lastEngagementEvent = null;
            return;
        }

        this.lastEngagementEvent = new java.util.ArrayList<String>(lastEngagementEvent);
    }

    /**
     * <p>
     * The last engagement-related event for the email, where the ordering is as follows: <code>OPEN</code> &lt;
     * <code>CLICK</code>.
     * </p>
     * <p>
     * Engagement events are only available if <a
     * href="https://docs.aws.amazon.com/ses/latest/dg/vdm-settings.html">Engagement tracking</a> is enabled.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLastEngagementEvent(java.util.Collection)} or {@link #withLastEngagementEvent(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param lastEngagementEvent
     *        The last engagement-related event for the email, where the ordering is as follows: <code>OPEN</code> &lt;
     *        <code>CLICK</code>. </p>
     *        <p>
     *        Engagement events are only available if <a
     *        href="https://docs.aws.amazon.com/ses/latest/dg/vdm-settings.html">Engagement tracking</a> is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngagementEventType
     */

    public MessageInsightsFilters withLastEngagementEvent(String... lastEngagementEvent) {
        if (this.lastEngagementEvent == null) {
            setLastEngagementEvent(new java.util.ArrayList<String>(lastEngagementEvent.length));
        }
        for (String ele : lastEngagementEvent) {
            this.lastEngagementEvent.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The last engagement-related event for the email, where the ordering is as follows: <code>OPEN</code> &lt;
     * <code>CLICK</code>.
     * </p>
     * <p>
     * Engagement events are only available if <a
     * href="https://docs.aws.amazon.com/ses/latest/dg/vdm-settings.html">Engagement tracking</a> is enabled.
     * </p>
     * 
     * @param lastEngagementEvent
     *        The last engagement-related event for the email, where the ordering is as follows: <code>OPEN</code> &lt;
     *        <code>CLICK</code>. </p>
     *        <p>
     *        Engagement events are only available if <a
     *        href="https://docs.aws.amazon.com/ses/latest/dg/vdm-settings.html">Engagement tracking</a> is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngagementEventType
     */

    public MessageInsightsFilters withLastEngagementEvent(java.util.Collection<String> lastEngagementEvent) {
        setLastEngagementEvent(lastEngagementEvent);
        return this;
    }

    /**
     * <p>
     * The last engagement-related event for the email, where the ordering is as follows: <code>OPEN</code> &lt;
     * <code>CLICK</code>.
     * </p>
     * <p>
     * Engagement events are only available if <a
     * href="https://docs.aws.amazon.com/ses/latest/dg/vdm-settings.html">Engagement tracking</a> is enabled.
     * </p>
     * 
     * @param lastEngagementEvent
     *        The last engagement-related event for the email, where the ordering is as follows: <code>OPEN</code> &lt;
     *        <code>CLICK</code>. </p>
     *        <p>
     *        Engagement events are only available if <a
     *        href="https://docs.aws.amazon.com/ses/latest/dg/vdm-settings.html">Engagement tracking</a> is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EngagementEventType
     */

    public MessageInsightsFilters withLastEngagementEvent(EngagementEventType... lastEngagementEvent) {
        java.util.ArrayList<String> lastEngagementEventCopy = new java.util.ArrayList<String>(lastEngagementEvent.length);
        for (EngagementEventType value : lastEngagementEvent) {
            lastEngagementEventCopy.add(value.toString());
        }
        if (getLastEngagementEvent() == null) {
            setLastEngagementEvent(lastEngagementEventCopy);
        } else {
            getLastEngagementEvent().addAll(lastEngagementEventCopy);
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
        if (getFromEmailAddress() != null)
            sb.append("FromEmailAddress: ").append("***Sensitive Data Redacted***").append(",");
        if (getDestination() != null)
            sb.append("Destination: ").append("***Sensitive Data Redacted***").append(",");
        if (getSubject() != null)
            sb.append("Subject: ").append("***Sensitive Data Redacted***").append(",");
        if (getIsp() != null)
            sb.append("Isp: ").append(getIsp()).append(",");
        if (getLastDeliveryEvent() != null)
            sb.append("LastDeliveryEvent: ").append(getLastDeliveryEvent()).append(",");
        if (getLastEngagementEvent() != null)
            sb.append("LastEngagementEvent: ").append(getLastEngagementEvent());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MessageInsightsFilters == false)
            return false;
        MessageInsightsFilters other = (MessageInsightsFilters) obj;
        if (other.getFromEmailAddress() == null ^ this.getFromEmailAddress() == null)
            return false;
        if (other.getFromEmailAddress() != null && other.getFromEmailAddress().equals(this.getFromEmailAddress()) == false)
            return false;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getSubject() == null ^ this.getSubject() == null)
            return false;
        if (other.getSubject() != null && other.getSubject().equals(this.getSubject()) == false)
            return false;
        if (other.getIsp() == null ^ this.getIsp() == null)
            return false;
        if (other.getIsp() != null && other.getIsp().equals(this.getIsp()) == false)
            return false;
        if (other.getLastDeliveryEvent() == null ^ this.getLastDeliveryEvent() == null)
            return false;
        if (other.getLastDeliveryEvent() != null && other.getLastDeliveryEvent().equals(this.getLastDeliveryEvent()) == false)
            return false;
        if (other.getLastEngagementEvent() == null ^ this.getLastEngagementEvent() == null)
            return false;
        if (other.getLastEngagementEvent() != null && other.getLastEngagementEvent().equals(this.getLastEngagementEvent()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFromEmailAddress() == null) ? 0 : getFromEmailAddress().hashCode());
        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getSubject() == null) ? 0 : getSubject().hashCode());
        hashCode = prime * hashCode + ((getIsp() == null) ? 0 : getIsp().hashCode());
        hashCode = prime * hashCode + ((getLastDeliveryEvent() == null) ? 0 : getLastDeliveryEvent().hashCode());
        hashCode = prime * hashCode + ((getLastEngagementEvent() == null) ? 0 : getLastEngagementEvent().hashCode());
        return hashCode;
    }

    @Override
    public MessageInsightsFilters clone() {
        try {
            return (MessageInsightsFilters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.MessageInsightsFiltersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
