/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Summary information about a stream session.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/StreamSessionSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamSessionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time when the channel went offline. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * For live streams, this is <code>NULL</code>.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * If <code>true</code>, this stream encountered a quota breach or failure.
     * </p>
     */
    private Boolean hasErrorEvent;
    /**
     * <p>
     * Time when the channel went live. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * Unique identifier for a live or previously live stream in the specified channel.
     * </p>
     */
    private String streamId;

    /**
     * <p>
     * Time when the channel went offline. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * For live streams, this is <code>NULL</code>.
     * </p>
     * 
     * @param endTime
     *        Time when the channel went offline. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>. For live streams, this is <code>NULL</code>.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * Time when the channel went offline. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * For live streams, this is <code>NULL</code>.
     * </p>
     * 
     * @return Time when the channel went offline. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *         string</i>. For live streams, this is <code>NULL</code>.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * Time when the channel went offline. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * For live streams, this is <code>NULL</code>.
     * </p>
     * 
     * @param endTime
     *        Time when the channel went offline. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>. For live streams, this is <code>NULL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSessionSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, this stream encountered a quota breach or failure.
     * </p>
     * 
     * @param hasErrorEvent
     *        If <code>true</code>, this stream encountered a quota breach or failure.
     */

    public void setHasErrorEvent(Boolean hasErrorEvent) {
        this.hasErrorEvent = hasErrorEvent;
    }

    /**
     * <p>
     * If <code>true</code>, this stream encountered a quota breach or failure.
     * </p>
     * 
     * @return If <code>true</code>, this stream encountered a quota breach or failure.
     */

    public Boolean getHasErrorEvent() {
        return this.hasErrorEvent;
    }

    /**
     * <p>
     * If <code>true</code>, this stream encountered a quota breach or failure.
     * </p>
     * 
     * @param hasErrorEvent
     *        If <code>true</code>, this stream encountered a quota breach or failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSessionSummary withHasErrorEvent(Boolean hasErrorEvent) {
        setHasErrorEvent(hasErrorEvent);
        return this;
    }

    /**
     * <p>
     * If <code>true</code>, this stream encountered a quota breach or failure.
     * </p>
     * 
     * @return If <code>true</code>, this stream encountered a quota breach or failure.
     */

    public Boolean isHasErrorEvent() {
        return this.hasErrorEvent;
    }

    /**
     * <p>
     * Time when the channel went live. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @param startTime
     *        Time when the channel went live. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * Time when the channel went live. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @return Time when the channel went live. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *         string</i>.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * Time when the channel went live. This is an ISO 8601 timestamp; <i>note that this is returned as a string</i>.
     * </p>
     * 
     * @param startTime
     *        Time when the channel went live. This is an ISO 8601 timestamp; <i>note that this is returned as a
     *        string</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSessionSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * Unique identifier for a live or previously live stream in the specified channel.
     * </p>
     * 
     * @param streamId
     *        Unique identifier for a live or previously live stream in the specified channel.
     */

    public void setStreamId(String streamId) {
        this.streamId = streamId;
    }

    /**
     * <p>
     * Unique identifier for a live or previously live stream in the specified channel.
     * </p>
     * 
     * @return Unique identifier for a live or previously live stream in the specified channel.
     */

    public String getStreamId() {
        return this.streamId;
    }

    /**
     * <p>
     * Unique identifier for a live or previously live stream in the specified channel.
     * </p>
     * 
     * @param streamId
     *        Unique identifier for a live or previously live stream in the specified channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSessionSummary withStreamId(String streamId) {
        setStreamId(streamId);
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
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getHasErrorEvent() != null)
            sb.append("HasErrorEvent: ").append(getHasErrorEvent()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getStreamId() != null)
            sb.append("StreamId: ").append(getStreamId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamSessionSummary == false)
            return false;
        StreamSessionSummary other = (StreamSessionSummary) obj;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getHasErrorEvent() == null ^ this.getHasErrorEvent() == null)
            return false;
        if (other.getHasErrorEvent() != null && other.getHasErrorEvent().equals(this.getHasErrorEvent()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getStreamId() == null ^ this.getStreamId() == null)
            return false;
        if (other.getStreamId() != null && other.getStreamId().equals(this.getStreamId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getHasErrorEvent() == null) ? 0 : getHasErrorEvent().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getStreamId() == null) ? 0 : getStreamId().hashCode());
        return hashCode;
    }

    @Override
    public StreamSessionSummary clone() {
        try {
            return (StreamSessionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.StreamSessionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
