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
 * An email's insights contain metadata and delivery information about a specific email.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sesv2-2019-09-27/EmailInsights" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EmailInsights implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The recipient of the email.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The recipient's ISP (e.g., <code>Gmail</code>, <code>Yahoo</code>, etc.).
     * </p>
     */
    private String isp;
    /**
     * <p>
     * A list of events associated with the sent email.
     * </p>
     */
    private java.util.List<InsightsEvent> events;

    /**
     * <p>
     * The recipient of the email.
     * </p>
     * 
     * @param destination
     *        The recipient of the email.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The recipient of the email.
     * </p>
     * 
     * @return The recipient of the email.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The recipient of the email.
     * </p>
     * 
     * @param destination
     *        The recipient of the email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailInsights withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The recipient's ISP (e.g., <code>Gmail</code>, <code>Yahoo</code>, etc.).
     * </p>
     * 
     * @param isp
     *        The recipient's ISP (e.g., <code>Gmail</code>, <code>Yahoo</code>, etc.).
     */

    public void setIsp(String isp) {
        this.isp = isp;
    }

    /**
     * <p>
     * The recipient's ISP (e.g., <code>Gmail</code>, <code>Yahoo</code>, etc.).
     * </p>
     * 
     * @return The recipient's ISP (e.g., <code>Gmail</code>, <code>Yahoo</code>, etc.).
     */

    public String getIsp() {
        return this.isp;
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

    public EmailInsights withIsp(String isp) {
        setIsp(isp);
        return this;
    }

    /**
     * <p>
     * A list of events associated with the sent email.
     * </p>
     * 
     * @return A list of events associated with the sent email.
     */

    public java.util.List<InsightsEvent> getEvents() {
        return events;
    }

    /**
     * <p>
     * A list of events associated with the sent email.
     * </p>
     * 
     * @param events
     *        A list of events associated with the sent email.
     */

    public void setEvents(java.util.Collection<InsightsEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }

        this.events = new java.util.ArrayList<InsightsEvent>(events);
    }

    /**
     * <p>
     * A list of events associated with the sent email.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEvents(java.util.Collection)} or {@link #withEvents(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param events
     *        A list of events associated with the sent email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailInsights withEvents(InsightsEvent... events) {
        if (this.events == null) {
            setEvents(new java.util.ArrayList<InsightsEvent>(events.length));
        }
        for (InsightsEvent ele : events) {
            this.events.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of events associated with the sent email.
     * </p>
     * 
     * @param events
     *        A list of events associated with the sent email.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EmailInsights withEvents(java.util.Collection<InsightsEvent> events) {
        setEvents(events);
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
            sb.append("Destination: ").append("***Sensitive Data Redacted***").append(",");
        if (getIsp() != null)
            sb.append("Isp: ").append(getIsp()).append(",");
        if (getEvents() != null)
            sb.append("Events: ").append(getEvents());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EmailInsights == false)
            return false;
        EmailInsights other = (EmailInsights) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getIsp() == null ^ this.getIsp() == null)
            return false;
        if (other.getIsp() != null && other.getIsp().equals(this.getIsp()) == false)
            return false;
        if (other.getEvents() == null ^ this.getEvents() == null)
            return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getIsp() == null) ? 0 : getIsp().hashCode());
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode());
        return hashCode;
    }

    @Override
    public EmailInsights clone() {
        try {
            return (EmailInsights) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.simpleemailv2.model.transform.EmailInsightsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
