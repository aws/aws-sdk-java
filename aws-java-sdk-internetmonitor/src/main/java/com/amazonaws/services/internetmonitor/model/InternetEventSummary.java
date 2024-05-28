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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A summary of information about an internet event in Amazon CloudWatch Internet Monitor. Internet events are issues
 * that cause performance degradation or availability problems for impacted Amazon Web Services client locations.
 * Internet Monitor displays information about recent global health events, called internet events, on a global outages
 * map that is available to all Amazon Web Services customers.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/InternetEventSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InternetEventSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The internally-generated identifier of an internet event.
     * </p>
     */
    private String eventId;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the internet event.
     * </p>
     */
    private String eventArn;
    /**
     * <p>
     * The time when an internet event started.
     * </p>
     */
    private java.util.Date startedAt;
    /**
     * <p>
     * The time when an internet event ended. If the event hasn't ended yet, this value is empty.
     * </p>
     */
    private java.util.Date endedAt;
    /**
     * <p>
     * The impacted location, such as a city, that Amazon Web Services clients access application resources from.
     * </p>
     */
    private ClientLocation clientLocation;
    /**
     * <p>
     * The type of network impairment.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The status of an internet event.
     * </p>
     */
    private String eventStatus;

    /**
     * <p>
     * The internally-generated identifier of an internet event.
     * </p>
     * 
     * @param eventId
     *        The internally-generated identifier of an internet event.
     */

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * <p>
     * The internally-generated identifier of an internet event.
     * </p>
     * 
     * @return The internally-generated identifier of an internet event.
     */

    public String getEventId() {
        return this.eventId;
    }

    /**
     * <p>
     * The internally-generated identifier of an internet event.
     * </p>
     * 
     * @param eventId
     *        The internally-generated identifier of an internet event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternetEventSummary withEventId(String eventId) {
        setEventId(eventId);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the internet event.
     * </p>
     * 
     * @param eventArn
     *        The Amazon Resource Name (ARN) of the internet event.
     */

    public void setEventArn(String eventArn) {
        this.eventArn = eventArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the internet event.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the internet event.
     */

    public String getEventArn() {
        return this.eventArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the internet event.
     * </p>
     * 
     * @param eventArn
     *        The Amazon Resource Name (ARN) of the internet event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternetEventSummary withEventArn(String eventArn) {
        setEventArn(eventArn);
        return this;
    }

    /**
     * <p>
     * The time when an internet event started.
     * </p>
     * 
     * @param startedAt
     *        The time when an internet event started.
     */

    public void setStartedAt(java.util.Date startedAt) {
        this.startedAt = startedAt;
    }

    /**
     * <p>
     * The time when an internet event started.
     * </p>
     * 
     * @return The time when an internet event started.
     */

    public java.util.Date getStartedAt() {
        return this.startedAt;
    }

    /**
     * <p>
     * The time when an internet event started.
     * </p>
     * 
     * @param startedAt
     *        The time when an internet event started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternetEventSummary withStartedAt(java.util.Date startedAt) {
        setStartedAt(startedAt);
        return this;
    }

    /**
     * <p>
     * The time when an internet event ended. If the event hasn't ended yet, this value is empty.
     * </p>
     * 
     * @param endedAt
     *        The time when an internet event ended. If the event hasn't ended yet, this value is empty.
     */

    public void setEndedAt(java.util.Date endedAt) {
        this.endedAt = endedAt;
    }

    /**
     * <p>
     * The time when an internet event ended. If the event hasn't ended yet, this value is empty.
     * </p>
     * 
     * @return The time when an internet event ended. If the event hasn't ended yet, this value is empty.
     */

    public java.util.Date getEndedAt() {
        return this.endedAt;
    }

    /**
     * <p>
     * The time when an internet event ended. If the event hasn't ended yet, this value is empty.
     * </p>
     * 
     * @param endedAt
     *        The time when an internet event ended. If the event hasn't ended yet, this value is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternetEventSummary withEndedAt(java.util.Date endedAt) {
        setEndedAt(endedAt);
        return this;
    }

    /**
     * <p>
     * The impacted location, such as a city, that Amazon Web Services clients access application resources from.
     * </p>
     * 
     * @param clientLocation
     *        The impacted location, such as a city, that Amazon Web Services clients access application resources from.
     */

    public void setClientLocation(ClientLocation clientLocation) {
        this.clientLocation = clientLocation;
    }

    /**
     * <p>
     * The impacted location, such as a city, that Amazon Web Services clients access application resources from.
     * </p>
     * 
     * @return The impacted location, such as a city, that Amazon Web Services clients access application resources
     *         from.
     */

    public ClientLocation getClientLocation() {
        return this.clientLocation;
    }

    /**
     * <p>
     * The impacted location, such as a city, that Amazon Web Services clients access application resources from.
     * </p>
     * 
     * @param clientLocation
     *        The impacted location, such as a city, that Amazon Web Services clients access application resources from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InternetEventSummary withClientLocation(ClientLocation clientLocation) {
        setClientLocation(clientLocation);
        return this;
    }

    /**
     * <p>
     * The type of network impairment.
     * </p>
     * 
     * @param eventType
     *        The type of network impairment.
     * @see InternetEventType
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The type of network impairment.
     * </p>
     * 
     * @return The type of network impairment.
     * @see InternetEventType
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The type of network impairment.
     * </p>
     * 
     * @param eventType
     *        The type of network impairment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InternetEventType
     */

    public InternetEventSummary withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The type of network impairment.
     * </p>
     * 
     * @param eventType
     *        The type of network impairment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InternetEventType
     */

    public InternetEventSummary withEventType(InternetEventType eventType) {
        this.eventType = eventType.toString();
        return this;
    }

    /**
     * <p>
     * The status of an internet event.
     * </p>
     * 
     * @param eventStatus
     *        The status of an internet event.
     * @see InternetEventStatus
     */

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    /**
     * <p>
     * The status of an internet event.
     * </p>
     * 
     * @return The status of an internet event.
     * @see InternetEventStatus
     */

    public String getEventStatus() {
        return this.eventStatus;
    }

    /**
     * <p>
     * The status of an internet event.
     * </p>
     * 
     * @param eventStatus
     *        The status of an internet event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InternetEventStatus
     */

    public InternetEventSummary withEventStatus(String eventStatus) {
        setEventStatus(eventStatus);
        return this;
    }

    /**
     * <p>
     * The status of an internet event.
     * </p>
     * 
     * @param eventStatus
     *        The status of an internet event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InternetEventStatus
     */

    public InternetEventSummary withEventStatus(InternetEventStatus eventStatus) {
        this.eventStatus = eventStatus.toString();
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
        if (getEventId() != null)
            sb.append("EventId: ").append(getEventId()).append(",");
        if (getEventArn() != null)
            sb.append("EventArn: ").append(getEventArn()).append(",");
        if (getStartedAt() != null)
            sb.append("StartedAt: ").append(getStartedAt()).append(",");
        if (getEndedAt() != null)
            sb.append("EndedAt: ").append(getEndedAt()).append(",");
        if (getClientLocation() != null)
            sb.append("ClientLocation: ").append(getClientLocation()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getEventStatus() != null)
            sb.append("EventStatus: ").append(getEventStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InternetEventSummary == false)
            return false;
        InternetEventSummary other = (InternetEventSummary) obj;
        if (other.getEventId() == null ^ this.getEventId() == null)
            return false;
        if (other.getEventId() != null && other.getEventId().equals(this.getEventId()) == false)
            return false;
        if (other.getEventArn() == null ^ this.getEventArn() == null)
            return false;
        if (other.getEventArn() != null && other.getEventArn().equals(this.getEventArn()) == false)
            return false;
        if (other.getStartedAt() == null ^ this.getStartedAt() == null)
            return false;
        if (other.getStartedAt() != null && other.getStartedAt().equals(this.getStartedAt()) == false)
            return false;
        if (other.getEndedAt() == null ^ this.getEndedAt() == null)
            return false;
        if (other.getEndedAt() != null && other.getEndedAt().equals(this.getEndedAt()) == false)
            return false;
        if (other.getClientLocation() == null ^ this.getClientLocation() == null)
            return false;
        if (other.getClientLocation() != null && other.getClientLocation().equals(this.getClientLocation()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getEventStatus() == null ^ this.getEventStatus() == null)
            return false;
        if (other.getEventStatus() != null && other.getEventStatus().equals(this.getEventStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEventId() == null) ? 0 : getEventId().hashCode());
        hashCode = prime * hashCode + ((getEventArn() == null) ? 0 : getEventArn().hashCode());
        hashCode = prime * hashCode + ((getStartedAt() == null) ? 0 : getStartedAt().hashCode());
        hashCode = prime * hashCode + ((getEndedAt() == null) ? 0 : getEndedAt().hashCode());
        hashCode = prime * hashCode + ((getClientLocation() == null) ? 0 : getClientLocation().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getEventStatus() == null) ? 0 : getEventStatus().hashCode());
        return hashCode;
    }

    @Override
    public InternetEventSummary clone() {
        try {
            return (InternetEventSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.InternetEventSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
