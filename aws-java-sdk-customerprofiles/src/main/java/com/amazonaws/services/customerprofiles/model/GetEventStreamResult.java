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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/customer-profiles-2020-08-15/GetEventStream" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetEventStreamResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The unique name of the domain.
     * </p>
     */
    private String domainName;
    /**
     * <p>
     * A unique identifier for the event stream.
     * </p>
     */
    private String eventStreamArn;
    /**
     * <p>
     * The timestamp of when the export was created.
     * </p>
     */
    private java.util.Date createdAt;
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
     * Details regarding the Kinesis stream.
     * </p>
     */
    private EventStreamDestinationDetails destinationDetails;
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

    public GetEventStreamResult withDomainName(String domainName) {
        setDomainName(domainName);
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

    public GetEventStreamResult withEventStreamArn(String eventStreamArn) {
        setEventStreamArn(eventStreamArn);
        return this;
    }

    /**
     * <p>
     * The timestamp of when the export was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the export was created.
     */

    public void setCreatedAt(java.util.Date createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * <p>
     * The timestamp of when the export was created.
     * </p>
     * 
     * @return The timestamp of when the export was created.
     */

    public java.util.Date getCreatedAt() {
        return this.createdAt;
    }

    /**
     * <p>
     * The timestamp of when the export was created.
     * </p>
     * 
     * @param createdAt
     *        The timestamp of when the export was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventStreamResult withCreatedAt(java.util.Date createdAt) {
        setCreatedAt(createdAt);
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

    public GetEventStreamResult withState(String state) {
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

    public GetEventStreamResult withState(EventStreamState state) {
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

    public GetEventStreamResult withStoppedSince(java.util.Date stoppedSince) {
        setStoppedSince(stoppedSince);
        return this;
    }

    /**
     * <p>
     * Details regarding the Kinesis stream.
     * </p>
     * 
     * @param destinationDetails
     *        Details regarding the Kinesis stream.
     */

    public void setDestinationDetails(EventStreamDestinationDetails destinationDetails) {
        this.destinationDetails = destinationDetails;
    }

    /**
     * <p>
     * Details regarding the Kinesis stream.
     * </p>
     * 
     * @return Details regarding the Kinesis stream.
     */

    public EventStreamDestinationDetails getDestinationDetails() {
        return this.destinationDetails;
    }

    /**
     * <p>
     * Details regarding the Kinesis stream.
     * </p>
     * 
     * @param destinationDetails
     *        Details regarding the Kinesis stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetEventStreamResult withDestinationDetails(EventStreamDestinationDetails destinationDetails) {
        setDestinationDetails(destinationDetails);
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

    public GetEventStreamResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetEventStreamResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetEventStreamResult addTagsEntry(String key, String value) {
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

    public GetEventStreamResult clearTagsEntries() {
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
        if (getEventStreamArn() != null)
            sb.append("EventStreamArn: ").append(getEventStreamArn()).append(",");
        if (getCreatedAt() != null)
            sb.append("CreatedAt: ").append(getCreatedAt()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStoppedSince() != null)
            sb.append("StoppedSince: ").append(getStoppedSince()).append(",");
        if (getDestinationDetails() != null)
            sb.append("DestinationDetails: ").append(getDestinationDetails()).append(",");
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

        if (obj instanceof GetEventStreamResult == false)
            return false;
        GetEventStreamResult other = (GetEventStreamResult) obj;
        if (other.getDomainName() == null ^ this.getDomainName() == null)
            return false;
        if (other.getDomainName() != null && other.getDomainName().equals(this.getDomainName()) == false)
            return false;
        if (other.getEventStreamArn() == null ^ this.getEventStreamArn() == null)
            return false;
        if (other.getEventStreamArn() != null && other.getEventStreamArn().equals(this.getEventStreamArn()) == false)
            return false;
        if (other.getCreatedAt() == null ^ this.getCreatedAt() == null)
            return false;
        if (other.getCreatedAt() != null && other.getCreatedAt().equals(this.getCreatedAt()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStoppedSince() == null ^ this.getStoppedSince() == null)
            return false;
        if (other.getStoppedSince() != null && other.getStoppedSince().equals(this.getStoppedSince()) == false)
            return false;
        if (other.getDestinationDetails() == null ^ this.getDestinationDetails() == null)
            return false;
        if (other.getDestinationDetails() != null && other.getDestinationDetails().equals(this.getDestinationDetails()) == false)
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
        hashCode = prime * hashCode + ((getEventStreamArn() == null) ? 0 : getEventStreamArn().hashCode());
        hashCode = prime * hashCode + ((getCreatedAt() == null) ? 0 : getCreatedAt().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStoppedSince() == null) ? 0 : getStoppedSince().hashCode());
        hashCode = prime * hashCode + ((getDestinationDetails() == null) ? 0 : getDestinationDetails().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetEventStreamResult clone() {
        try {
            return (GetEventStreamResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
