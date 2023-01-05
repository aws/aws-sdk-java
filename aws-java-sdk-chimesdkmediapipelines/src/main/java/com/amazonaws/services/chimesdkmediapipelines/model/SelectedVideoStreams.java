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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The video streams for a specified media pipeline. The total number of video streams can't exceed 25.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/SelectedVideoStreams"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SelectedVideoStreams implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The attendee IDs of the streams selected for a media pipeline.
     * </p>
     */
    private java.util.List<String> attendeeIds;
    /**
     * <p>
     * The external user IDs of the streams selected for a media pipeline.
     * </p>
     */
    private java.util.List<String> externalUserIds;

    /**
     * <p>
     * The attendee IDs of the streams selected for a media pipeline.
     * </p>
     * 
     * @return The attendee IDs of the streams selected for a media pipeline.
     */

    public java.util.List<String> getAttendeeIds() {
        return attendeeIds;
    }

    /**
     * <p>
     * The attendee IDs of the streams selected for a media pipeline.
     * </p>
     * 
     * @param attendeeIds
     *        The attendee IDs of the streams selected for a media pipeline.
     */

    public void setAttendeeIds(java.util.Collection<String> attendeeIds) {
        if (attendeeIds == null) {
            this.attendeeIds = null;
            return;
        }

        this.attendeeIds = new java.util.ArrayList<String>(attendeeIds);
    }

    /**
     * <p>
     * The attendee IDs of the streams selected for a media pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttendeeIds(java.util.Collection)} or {@link #withAttendeeIds(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attendeeIds
     *        The attendee IDs of the streams selected for a media pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectedVideoStreams withAttendeeIds(String... attendeeIds) {
        if (this.attendeeIds == null) {
            setAttendeeIds(new java.util.ArrayList<String>(attendeeIds.length));
        }
        for (String ele : attendeeIds) {
            this.attendeeIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attendee IDs of the streams selected for a media pipeline.
     * </p>
     * 
     * @param attendeeIds
     *        The attendee IDs of the streams selected for a media pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectedVideoStreams withAttendeeIds(java.util.Collection<String> attendeeIds) {
        setAttendeeIds(attendeeIds);
        return this;
    }

    /**
     * <p>
     * The external user IDs of the streams selected for a media pipeline.
     * </p>
     * 
     * @return The external user IDs of the streams selected for a media pipeline.
     */

    public java.util.List<String> getExternalUserIds() {
        return externalUserIds;
    }

    /**
     * <p>
     * The external user IDs of the streams selected for a media pipeline.
     * </p>
     * 
     * @param externalUserIds
     *        The external user IDs of the streams selected for a media pipeline.
     */

    public void setExternalUserIds(java.util.Collection<String> externalUserIds) {
        if (externalUserIds == null) {
            this.externalUserIds = null;
            return;
        }

        this.externalUserIds = new java.util.ArrayList<String>(externalUserIds);
    }

    /**
     * <p>
     * The external user IDs of the streams selected for a media pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setExternalUserIds(java.util.Collection)} or {@link #withExternalUserIds(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param externalUserIds
     *        The external user IDs of the streams selected for a media pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectedVideoStreams withExternalUserIds(String... externalUserIds) {
        if (this.externalUserIds == null) {
            setExternalUserIds(new java.util.ArrayList<String>(externalUserIds.length));
        }
        for (String ele : externalUserIds) {
            this.externalUserIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The external user IDs of the streams selected for a media pipeline.
     * </p>
     * 
     * @param externalUserIds
     *        The external user IDs of the streams selected for a media pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SelectedVideoStreams withExternalUserIds(java.util.Collection<String> externalUserIds) {
        setExternalUserIds(externalUserIds);
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
        if (getAttendeeIds() != null)
            sb.append("AttendeeIds: ").append(getAttendeeIds()).append(",");
        if (getExternalUserIds() != null)
            sb.append("ExternalUserIds: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SelectedVideoStreams == false)
            return false;
        SelectedVideoStreams other = (SelectedVideoStreams) obj;
        if (other.getAttendeeIds() == null ^ this.getAttendeeIds() == null)
            return false;
        if (other.getAttendeeIds() != null && other.getAttendeeIds().equals(this.getAttendeeIds()) == false)
            return false;
        if (other.getExternalUserIds() == null ^ this.getExternalUserIds() == null)
            return false;
        if (other.getExternalUserIds() != null && other.getExternalUserIds().equals(this.getExternalUserIds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAttendeeIds() == null) ? 0 : getAttendeeIds().hashCode());
        hashCode = prime * hashCode + ((getExternalUserIds() == null) ? 0 : getExternalUserIds().hashCode());
        return hashCode;
    }

    @Override
    public SelectedVideoStreams clone() {
        try {
            return (SelectedVideoStreams) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.SelectedVideoStreamsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
