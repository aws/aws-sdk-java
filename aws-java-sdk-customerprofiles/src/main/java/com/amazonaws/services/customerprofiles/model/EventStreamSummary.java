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
package com.amazonaws.services.customerprofiles.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An instance of EventStream in a list of EventStreams.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/EventStreamSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EventStreamSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * The name of the event stream.
     * </p>
     */
    private String eventStreamName;
    /**
     * <p>
     * A unique identifier for the event stream.
     * </p>
     */
    private String eventStreamArn;
    /**
     * <p>
     * The operational state of destination stream for export.
     * </p>
     */
    private String state;
    /**
     * <p>
     * The timestamp when the <code>State</code> changed to <code>STOPPED</code>.
     * </p>
     */
    private java.util.Date stoppedSince;
    /**
     * <p>
     * Summary information about the Kinesis data stream.
     * </p>
     */
    private DestinationSummary destinationSummary;
    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     */

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @return The unique name of the domain.
     */

    public String getDomainName() {
        return this.domainName;
    }

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     * 
     * @param domainName
     *        The unique name of the domain.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStreamSummary withDomainName(String domainName) {
        setDomainName(domainName);
        return this;
    }

    /**
     * <p>
     * The name of the event stream.
     * </p>
     * 
     * @param eventStreamName
     *        The name of the event stream.
     */

    public void setEventStreamName(String eventStreamName) {
        this.eventStreamName = eventStreamName;
    }

    /**
     * <p>
     * The name of the event stream.
     * </p>
     * 
     * @return The name of the event stream.
     */

    public String getEventStreamName() {
        return this.eventStreamName;
    }

    /**
     * <p>
     * The name of the event stream.
     * </p>
     * 
     * @param eventStreamName
     *        The name of the event stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStreamSummary withEventStreamName(String eventStreamName) {
        setEventStreamName(eventStreamName);
        return this;
    }

    /**
     * <p>
     * A unique identifier for the event stream.
     * </p>
     * 
     * @param eventStreamArn
     *        A unique identifier for the event stream.
     */

    public void setEventStreamArn(String eventStreamArn) {
        this.eventStreamArn = eventStreamArn;
    }

    /**
     * <p>
     * A unique identifier for the event stream.
     * </p>
     * 
     * @return A unique identifier for the event stream.
     */

    public String getEventStreamArn() {
        return this.eventStreamArn;
    }

    /**
     * <p>
     * A unique identifier for the event stream.
     * </p>
     * 
     * @param eventStreamArn
     *        A unique identifier for the event stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStreamSummary withEventStreamArn(String eventStreamArn) {
        setEventStreamArn(eventStreamArn);
        return this;
    }

    /**
     * <p>
     * The operational state of destination stream for export.
     * </p>
     * 
     * @param state
     *        The operational state of destination stream for export.
     * @see EventStreamState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * The operational state of destination stream for export.
     * </p>
     * 
     * @return The operational state of destination stream for export.
     * @see EventStreamState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * The operational state of destination stream for export.
     * </p>
     * 
     * @param state
     *        The operational state of destination stream for export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventStreamState
     */

    public EventStreamSummary withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * The operational state of destination stream for export.
     * </p>
     * 
     * @param state
     *        The operational state of destination stream for export.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EventStreamState
     */

    public EventStreamSummary withState(EventStreamState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when the <code>State</code> changed to <code>STOPPED</code>.
     * </p>
     * 
     * @param stoppedSince
     *        The timestamp when the <code>State</code> changed to <code>STOPPED</code>.
     */

    public void setStoppedSince(java.util.Date stoppedSince) {
        this.stoppedSince = stoppedSince;
    }

    /**
     * <p>
     * The timestamp when the <code>State</code> changed to <code>STOPPED</code>.
     * </p>
     * 
     * @return The timestamp when the <code>State</code> changed to <code>STOPPED</code>.
     */

    public java.util.Date getStoppedSince() {
        return this.stoppedSince;
    }

    /**
     * <p>
     * The timestamp when the <code>State</code> changed to <code>STOPPED</code>.
     * </p>
     * 
     * @param stoppedSince
     *        The timestamp when the <code>State</code> changed to <code>STOPPED</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStreamSummary withStoppedSince(java.util.Date stoppedSince) {
        setStoppedSince(stoppedSince);
        return this;
    }

    /**
     * <p>
     * Summary information about the Kinesis data stream.
     * </p>
     * 
     * @param destinationSummary
     *        Summary information about the Kinesis data stream.
     */

    public void setDestinationSummary(DestinationSummary destinationSummary) {
        this.destinationSummary = destinationSummary;
    }

    /**
     * <p>
     * Summary information about the Kinesis data stream.
     * </p>
     * 
     * @return Summary information about the Kinesis data stream.
     */

    public DestinationSummary getDestinationSummary() {
        return this.destinationSummary;
    }

    /**
     * <p>
     * Summary information about the Kinesis data stream.
     * </p>
     * 
     * @param destinationSummary
     *        Summary information about the Kinesis data stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStreamSummary withDestinationSummary(DestinationSummary destinationSummary) {
        setDestinationSummary(destinationSummary);
        return this;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @return The tags used to organize, track, or control access for this resource.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags used to organize, track, or control access for this resource.
     * </p>
     * 
     * @param tags
     *        The tags used to organize, track, or control access for this resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStreamSummary withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see EventStreamSummary#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public EventStreamSummary addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EventStreamSummary clearTagsEntries() {
        this.tags = null;
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
        if (getDomainName() != null)
            sb.append("DomainName: ").append(getDomainName()).append(",");
        if (getEventStreamName() != null)
            sb.append("EventStreamName: ").append(getEventStreamName()).append(",");
        if (getEventStreamArn() != null)
            sb.append("EventStreamArn: ").append(getEventStreamArn()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStoppedSince() != null)
            sb.append("StoppedSince: ").append(getStoppedSince()).append(",");
        if (getDestinationSummary() != null)
            sb.append("DestinationSummary: ").append(getDestinationSummary()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EventStreamSummary == false)
            return false;
        EventStreamSummary other = (EventStreamSummary) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEventStreamName() == null ^ this.getEventStreamName() == null)
            return false;
        if (other.getEventStreamName() != null && other.getEventStreamName().equals(this.getEventStreamName()) == false)
            return false;
        if (other.getEventStreamArn() == null ^ this.getEventStreamArn() == null)
            return false;
        if (other.getEventStreamArn() != null && other.getEventStreamArn().equals(this.getEventStreamArn()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStoppedSince() == null ^ this.getStoppedSince() == null)
            return false;
        if (other.getStoppedSince() != null && other.getStoppedSince().equals(this.getStoppedSince()) == false)
            return false;
        if (other.getDestinationSummary() == null ^ this.getDestinationSummary() == null)
            return false;
        if (other.getDestinationSummary() != null && other.getDestinationSummary().equals(this.getDestinationSummary()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDomainName() == null) ? 0 : getDomainName().hashCode());
        hashCode = prime * hashCode + ((getEventStreamName() == null) ? 0 : getEventStreamName().hashCode());
        hashCode = prime * hashCode + ((getEventStreamArn() == null) ? 0 : getEventStreamArn().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStoppedSince() == null) ? 0 : getStoppedSince().hashCode());
        hashCode = prime * hashCode + ((getDestinationSummary() == null) ? 0 : getDestinationSummary().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public EventStreamSummary clone() {
        try {
            return (EventStreamSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.customerprofiles.model.transform.EventStreamSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
