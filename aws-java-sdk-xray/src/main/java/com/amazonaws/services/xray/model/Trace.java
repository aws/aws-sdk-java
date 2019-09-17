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
package com.amazonaws.services.xray.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A collection of segment documents with matching trace IDs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/xray-2016-04-12/Trace" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Trace implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier for the request that generated the trace's segments and subsegments.
     * </p>
     */
    private String id;
    /**
     * <p>
     * The length of time in seconds between the start time of the root segment and the end time of the last segment
     * that completed.
     * </p>
     */
    private Double duration;
    /**
     * <p>
     * Segment documents for the segments and subsegments that comprise the trace.
     * </p>
     */
    private java.util.List<Segment> segments;

    /**
     * <p>
     * The unique identifier for the request that generated the trace's segments and subsegments.
     * </p>
     * 
     * @param id
     *        The unique identifier for the request that generated the trace's segments and subsegments.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * The unique identifier for the request that generated the trace's segments and subsegments.
     * </p>
     * 
     * @return The unique identifier for the request that generated the trace's segments and subsegments.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * The unique identifier for the request that generated the trace's segments and subsegments.
     * </p>
     * 
     * @param id
     *        The unique identifier for the request that generated the trace's segments and subsegments.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trace withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The length of time in seconds between the start time of the root segment and the end time of the last segment
     * that completed.
     * </p>
     * 
     * @param duration
     *        The length of time in seconds between the start time of the root segment and the end time of the last
     *        segment that completed.
     */

    public void setDuration(Double duration) {
        this.duration = duration;
    }

    /**
     * <p>
     * The length of time in seconds between the start time of the root segment and the end time of the last segment
     * that completed.
     * </p>
     * 
     * @return The length of time in seconds between the start time of the root segment and the end time of the last
     *         segment that completed.
     */

    public Double getDuration() {
        return this.duration;
    }

    /**
     * <p>
     * The length of time in seconds between the start time of the root segment and the end time of the last segment
     * that completed.
     * </p>
     * 
     * @param duration
     *        The length of time in seconds between the start time of the root segment and the end time of the last
     *        segment that completed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trace withDuration(Double duration) {
        setDuration(duration);
        return this;
    }

    /**
     * <p>
     * Segment documents for the segments and subsegments that comprise the trace.
     * </p>
     * 
     * @return Segment documents for the segments and subsegments that comprise the trace.
     */

    public java.util.List<Segment> getSegments() {
        return segments;
    }

    /**
     * <p>
     * Segment documents for the segments and subsegments that comprise the trace.
     * </p>
     * 
     * @param segments
     *        Segment documents for the segments and subsegments that comprise the trace.
     */

    public void setSegments(java.util.Collection<Segment> segments) {
        if (segments == null) {
            this.segments = null;
            return;
        }

        this.segments = new java.util.ArrayList<Segment>(segments);
    }

    /**
     * <p>
     * Segment documents for the segments and subsegments that comprise the trace.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSegments(java.util.Collection)} or {@link #withSegments(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param segments
     *        Segment documents for the segments and subsegments that comprise the trace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trace withSegments(Segment... segments) {
        if (this.segments == null) {
            setSegments(new java.util.ArrayList<Segment>(segments.length));
        }
        for (Segment ele : segments) {
            this.segments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Segment documents for the segments and subsegments that comprise the trace.
     * </p>
     * 
     * @param segments
     *        Segment documents for the segments and subsegments that comprise the trace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Trace withSegments(java.util.Collection<Segment> segments) {
        setSegments(segments);
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
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getSegments() != null)
            sb.append("Segments: ").append(getSegments());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Trace == false)
            return false;
        Trace other = (Trace) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getSegments() == null ^ this.getSegments() == null)
            return false;
        if (other.getSegments() != null && other.getSegments().equals(this.getSegments()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getSegments() == null) ? 0 : getSegments().hashCode());
        return hashCode;
    }

    @Override
    public Trace clone() {
        try {
            return (Trace) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.xray.model.transform.TraceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
