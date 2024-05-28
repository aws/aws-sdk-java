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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A meeting created using the Amazon Chime SDK.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/Meeting" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Meeting implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Web Services Region in which you create the meeting.
     * </p>
     */
    private String mediaRegion;
    /**
     * <p>
     * The media placement for the meeting.
     * </p>
     */
    private MediaPlacement mediaPlacement;
    /**
     * <p>
     * The configuration settings of the features available to a meeting.
     * </p>
     */
    private MeetingFeaturesConfiguration meetingFeatures;
    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     */
    private String meetingId;

    /**
     * <p>
     * The Amazon Web Services Region in which you create the meeting.
     * </p>
     * 
     * @param mediaRegion
     *        The Amazon Web Services Region in which you create the meeting.
     */

    public void setMediaRegion(String mediaRegion) {
        this.mediaRegion = mediaRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which you create the meeting.
     * </p>
     * 
     * @return The Amazon Web Services Region in which you create the meeting.
     */

    public String getMediaRegion() {
        return this.mediaRegion;
    }

    /**
     * <p>
     * The Amazon Web Services Region in which you create the meeting.
     * </p>
     * 
     * @param mediaRegion
     *        The Amazon Web Services Region in which you create the meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Meeting withMediaRegion(String mediaRegion) {
        setMediaRegion(mediaRegion);
        return this;
    }

    /**
     * <p>
     * The media placement for the meeting.
     * </p>
     * 
     * @param mediaPlacement
     *        The media placement for the meeting.
     */

    public void setMediaPlacement(MediaPlacement mediaPlacement) {
        this.mediaPlacement = mediaPlacement;
    }

    /**
     * <p>
     * The media placement for the meeting.
     * </p>
     * 
     * @return The media placement for the meeting.
     */

    public MediaPlacement getMediaPlacement() {
        return this.mediaPlacement;
    }

    /**
     * <p>
     * The media placement for the meeting.
     * </p>
     * 
     * @param mediaPlacement
     *        The media placement for the meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Meeting withMediaPlacement(MediaPlacement mediaPlacement) {
        setMediaPlacement(mediaPlacement);
        return this;
    }

    /**
     * <p>
     * The configuration settings of the features available to a meeting.
     * </p>
     * 
     * @param meetingFeatures
     *        The configuration settings of the features available to a meeting.
     */

    public void setMeetingFeatures(MeetingFeaturesConfiguration meetingFeatures) {
        this.meetingFeatures = meetingFeatures;
    }

    /**
     * <p>
     * The configuration settings of the features available to a meeting.
     * </p>
     * 
     * @return The configuration settings of the features available to a meeting.
     */

    public MeetingFeaturesConfiguration getMeetingFeatures() {
        return this.meetingFeatures;
    }

    /**
     * <p>
     * The configuration settings of the features available to a meeting.
     * </p>
     * 
     * @param meetingFeatures
     *        The configuration settings of the features available to a meeting.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Meeting withMeetingFeatures(MeetingFeaturesConfiguration meetingFeatures) {
        setMeetingFeatures(meetingFeatures);
        return this;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * 
     * @param meetingId
     *        The Amazon Chime SDK meeting ID.
     */

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * 
     * @return The Amazon Chime SDK meeting ID.
     */

    public String getMeetingId() {
        return this.meetingId;
    }

    /**
     * <p>
     * The Amazon Chime SDK meeting ID.
     * </p>
     * 
     * @param meetingId
     *        The Amazon Chime SDK meeting ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Meeting withMeetingId(String meetingId) {
        setMeetingId(meetingId);
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
        if (getMediaRegion() != null)
            sb.append("MediaRegion: ").append(getMediaRegion()).append(",");
        if (getMediaPlacement() != null)
            sb.append("MediaPlacement: ").append(getMediaPlacement()).append(",");
        if (getMeetingFeatures() != null)
            sb.append("MeetingFeatures: ").append(getMeetingFeatures()).append(",");
        if (getMeetingId() != null)
            sb.append("MeetingId: ").append(getMeetingId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Meeting == false)
            return false;
        Meeting other = (Meeting) obj;
        if (other.getMediaRegion() == null ^ this.getMediaRegion() == null)
            return false;
        if (other.getMediaRegion() != null && other.getMediaRegion().equals(this.getMediaRegion()) == false)
            return false;
        if (other.getMediaPlacement() == null ^ this.getMediaPlacement() == null)
            return false;
        if (other.getMediaPlacement() != null && other.getMediaPlacement().equals(this.getMediaPlacement()) == false)
            return false;
        if (other.getMeetingFeatures() == null ^ this.getMeetingFeatures() == null)
            return false;
        if (other.getMeetingFeatures() != null && other.getMeetingFeatures().equals(this.getMeetingFeatures()) == false)
            return false;
        if (other.getMeetingId() == null ^ this.getMeetingId() == null)
            return false;
        if (other.getMeetingId() != null && other.getMeetingId().equals(this.getMeetingId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaRegion() == null) ? 0 : getMediaRegion().hashCode());
        hashCode = prime * hashCode + ((getMediaPlacement() == null) ? 0 : getMediaPlacement().hashCode());
        hashCode = prime * hashCode + ((getMeetingFeatures() == null) ? 0 : getMeetingFeatures().hashCode());
        hashCode = prime * hashCode + ((getMeetingId() == null) ? 0 : getMeetingId().hashCode());
        return hashCode;
    }

    @Override
    public Meeting clone() {
        try {
            return (Meeting) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.MeetingMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
