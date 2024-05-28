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
package com.amazonaws.services.chimesdkmeetings.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The video features set for the meeting. Applies to all attendees.
 * </p>
 * <note>
 * <p>
 * If you specify <code>MeetingFeatures:Video:MaxResolution:None</code> when you create a meeting, all API requests that
 * include <code>SendReceive</code>, <code>Send</code>, or <code>Receive</code> for
 * <code>AttendeeCapabilities:Video</code> will be rejected with <code>ValidationError 400</code>.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-meetings-2021-07-15/VideoFeatures" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoFeatures implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The maximum video resolution for the meeting. Applies to all attendees.
     * </p>
     * <note>
     * <p>
     * Defaults to <code>HD</code>. To use <code>FHD</code>, you must also provide a
     * <code>MeetingFeatures:Attendee:MaxCount</code> value and override the default size limit of 250 attendees.
     * </p>
     * </note>
     */
    private String maxResolution;

    /**
     * <p>
     * The maximum video resolution for the meeting. Applies to all attendees.
     * </p>
     * <note>
     * <p>
     * Defaults to <code>HD</code>. To use <code>FHD</code>, you must also provide a
     * <code>MeetingFeatures:Attendee:MaxCount</code> value and override the default size limit of 250 attendees.
     * </p>
     * </note>
     * 
     * @param maxResolution
     *        The maximum video resolution for the meeting. Applies to all attendees.</p> <note>
     *        <p>
     *        Defaults to <code>HD</code>. To use <code>FHD</code>, you must also provide a
     *        <code>MeetingFeatures:Attendee:MaxCount</code> value and override the default size limit of 250 attendees.
     *        </p>
     * @see VideoResolution
     */

    public void setMaxResolution(String maxResolution) {
        this.maxResolution = maxResolution;
    }

    /**
     * <p>
     * The maximum video resolution for the meeting. Applies to all attendees.
     * </p>
     * <note>
     * <p>
     * Defaults to <code>HD</code>. To use <code>FHD</code>, you must also provide a
     * <code>MeetingFeatures:Attendee:MaxCount</code> value and override the default size limit of 250 attendees.
     * </p>
     * </note>
     * 
     * @return The maximum video resolution for the meeting. Applies to all attendees.</p> <note>
     *         <p>
     *         Defaults to <code>HD</code>. To use <code>FHD</code>, you must also provide a
     *         <code>MeetingFeatures:Attendee:MaxCount</code> value and override the default size limit of 250
     *         attendees.
     *         </p>
     * @see VideoResolution
     */

    public String getMaxResolution() {
        return this.maxResolution;
    }

    /**
     * <p>
     * The maximum video resolution for the meeting. Applies to all attendees.
     * </p>
     * <note>
     * <p>
     * Defaults to <code>HD</code>. To use <code>FHD</code>, you must also provide a
     * <code>MeetingFeatures:Attendee:MaxCount</code> value and override the default size limit of 250 attendees.
     * </p>
     * </note>
     * 
     * @param maxResolution
     *        The maximum video resolution for the meeting. Applies to all attendees.</p> <note>
     *        <p>
     *        Defaults to <code>HD</code>. To use <code>FHD</code>, you must also provide a
     *        <code>MeetingFeatures:Attendee:MaxCount</code> value and override the default size limit of 250 attendees.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoResolution
     */

    public VideoFeatures withMaxResolution(String maxResolution) {
        setMaxResolution(maxResolution);
        return this;
    }

    /**
     * <p>
     * The maximum video resolution for the meeting. Applies to all attendees.
     * </p>
     * <note>
     * <p>
     * Defaults to <code>HD</code>. To use <code>FHD</code>, you must also provide a
     * <code>MeetingFeatures:Attendee:MaxCount</code> value and override the default size limit of 250 attendees.
     * </p>
     * </note>
     * 
     * @param maxResolution
     *        The maximum video resolution for the meeting. Applies to all attendees.</p> <note>
     *        <p>
     *        Defaults to <code>HD</code>. To use <code>FHD</code>, you must also provide a
     *        <code>MeetingFeatures:Attendee:MaxCount</code> value and override the default size limit of 250 attendees.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoResolution
     */

    public VideoFeatures withMaxResolution(VideoResolution maxResolution) {
        this.maxResolution = maxResolution.toString();
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
        if (getMaxResolution() != null)
            sb.append("MaxResolution: ").append(getMaxResolution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoFeatures == false)
            return false;
        VideoFeatures other = (VideoFeatures) obj;
        if (other.getMaxResolution() == null ^ this.getMaxResolution() == null)
            return false;
        if (other.getMaxResolution() != null && other.getMaxResolution().equals(this.getMaxResolution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxResolution() == null) ? 0 : getMaxResolution().hashCode());
        return hashCode;
    }

    @Override
    public VideoFeatures clone() {
        try {
            return (VideoFeatures) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmeetings.model.transform.VideoFeaturesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
