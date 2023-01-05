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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/StartMeetingTranscription" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StartMeetingTranscriptionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the meeting being transcribed.
     * </p>
     */
    private String meetingId;
    /**
     * <p>
     * The configuration for the current transcription operation. Must contain <code>EngineTranscribeSettings</code> or
     * <code>EngineTranscribeMedicalSettings</code>.
     * </p>
     */
    private TranscriptionConfiguration transcriptionConfiguration;

    /**
     * <p>
     * The unique ID of the meeting being transcribed.
     * </p>
     * 
     * @param meetingId
     *        The unique ID of the meeting being transcribed.
     */

    public void setMeetingId(String meetingId) {
        this.meetingId = meetingId;
    }

    /**
     * <p>
     * The unique ID of the meeting being transcribed.
     * </p>
     * 
     * @return The unique ID of the meeting being transcribed.
     */

    public String getMeetingId() {
        return this.meetingId;
    }

    /**
     * <p>
     * The unique ID of the meeting being transcribed.
     * </p>
     * 
     * @param meetingId
     *        The unique ID of the meeting being transcribed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMeetingTranscriptionRequest withMeetingId(String meetingId) {
        setMeetingId(meetingId);
        return this;
    }

    /**
     * <p>
     * The configuration for the current transcription operation. Must contain <code>EngineTranscribeSettings</code> or
     * <code>EngineTranscribeMedicalSettings</code>.
     * </p>
     * 
     * @param transcriptionConfiguration
     *        The configuration for the current transcription operation. Must contain
     *        <code>EngineTranscribeSettings</code> or <code>EngineTranscribeMedicalSettings</code>.
     */

    public void setTranscriptionConfiguration(TranscriptionConfiguration transcriptionConfiguration) {
        this.transcriptionConfiguration = transcriptionConfiguration;
    }

    /**
     * <p>
     * The configuration for the current transcription operation. Must contain <code>EngineTranscribeSettings</code> or
     * <code>EngineTranscribeMedicalSettings</code>.
     * </p>
     * 
     * @return The configuration for the current transcription operation. Must contain
     *         <code>EngineTranscribeSettings</code> or <code>EngineTranscribeMedicalSettings</code>.
     */

    public TranscriptionConfiguration getTranscriptionConfiguration() {
        return this.transcriptionConfiguration;
    }

    /**
     * <p>
     * The configuration for the current transcription operation. Must contain <code>EngineTranscribeSettings</code> or
     * <code>EngineTranscribeMedicalSettings</code>.
     * </p>
     * 
     * @param transcriptionConfiguration
     *        The configuration for the current transcription operation. Must contain
     *        <code>EngineTranscribeSettings</code> or <code>EngineTranscribeMedicalSettings</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StartMeetingTranscriptionRequest withTranscriptionConfiguration(TranscriptionConfiguration transcriptionConfiguration) {
        setTranscriptionConfiguration(transcriptionConfiguration);
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
        if (getMeetingId() != null)
            sb.append("MeetingId: ").append(getMeetingId()).append(",");
        if (getTranscriptionConfiguration() != null)
            sb.append("TranscriptionConfiguration: ").append(getTranscriptionConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StartMeetingTranscriptionRequest == false)
            return false;
        StartMeetingTranscriptionRequest other = (StartMeetingTranscriptionRequest) obj;
        if (other.getMeetingId() == null ^ this.getMeetingId() == null)
            return false;
        if (other.getMeetingId() != null && other.getMeetingId().equals(this.getMeetingId()) == false)
            return false;
        if (other.getTranscriptionConfiguration() == null ^ this.getTranscriptionConfiguration() == null)
            return false;
        if (other.getTranscriptionConfiguration() != null && other.getTranscriptionConfiguration().equals(this.getTranscriptionConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMeetingId() == null) ? 0 : getMeetingId().hashCode());
        hashCode = prime * hashCode + ((getTranscriptionConfiguration() == null) ? 0 : getTranscriptionConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public StartMeetingTranscriptionRequest clone() {
        return (StartMeetingTranscriptionRequest) super.clone();
    }

}
