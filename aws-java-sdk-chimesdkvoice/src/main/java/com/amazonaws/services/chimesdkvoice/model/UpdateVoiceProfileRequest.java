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
package com.amazonaws.services.chimesdkvoice.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/UpdateVoiceProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateVoiceProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The profile ID.
     * </p>
     */
    private String voiceProfileId;
    /**
     * <p>
     * The ID of the speaker search task.
     * </p>
     */
    private String speakerSearchTaskId;

    /**
     * <p>
     * The profile ID.
     * </p>
     * 
     * @param voiceProfileId
     *        The profile ID.
     */

    public void setVoiceProfileId(String voiceProfileId) {
        this.voiceProfileId = voiceProfileId;
    }

    /**
     * <p>
     * The profile ID.
     * </p>
     * 
     * @return The profile ID.
     */

    public String getVoiceProfileId() {
        return this.voiceProfileId;
    }

    /**
     * <p>
     * The profile ID.
     * </p>
     * 
     * @param voiceProfileId
     *        The profile ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVoiceProfileRequest withVoiceProfileId(String voiceProfileId) {
        setVoiceProfileId(voiceProfileId);
        return this;
    }

    /**
     * <p>
     * The ID of the speaker search task.
     * </p>
     * 
     * @param speakerSearchTaskId
     *        The ID of the speaker search task.
     */

    public void setSpeakerSearchTaskId(String speakerSearchTaskId) {
        this.speakerSearchTaskId = speakerSearchTaskId;
    }

    /**
     * <p>
     * The ID of the speaker search task.
     * </p>
     * 
     * @return The ID of the speaker search task.
     */

    public String getSpeakerSearchTaskId() {
        return this.speakerSearchTaskId;
    }

    /**
     * <p>
     * The ID of the speaker search task.
     * </p>
     * 
     * @param speakerSearchTaskId
     *        The ID of the speaker search task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateVoiceProfileRequest withSpeakerSearchTaskId(String speakerSearchTaskId) {
        setSpeakerSearchTaskId(speakerSearchTaskId);
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
        if (getVoiceProfileId() != null)
            sb.append("VoiceProfileId: ").append(getVoiceProfileId()).append(",");
        if (getSpeakerSearchTaskId() != null)
            sb.append("SpeakerSearchTaskId: ").append(getSpeakerSearchTaskId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateVoiceProfileRequest == false)
            return false;
        UpdateVoiceProfileRequest other = (UpdateVoiceProfileRequest) obj;
        if (other.getVoiceProfileId() == null ^ this.getVoiceProfileId() == null)
            return false;
        if (other.getVoiceProfileId() != null && other.getVoiceProfileId().equals(this.getVoiceProfileId()) == false)
            return false;
        if (other.getSpeakerSearchTaskId() == null ^ this.getSpeakerSearchTaskId() == null)
            return false;
        if (other.getSpeakerSearchTaskId() != null && other.getSpeakerSearchTaskId().equals(this.getSpeakerSearchTaskId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceProfileId() == null) ? 0 : getVoiceProfileId().hashCode());
        hashCode = prime * hashCode + ((getSpeakerSearchTaskId() == null) ? 0 : getSpeakerSearchTaskId().hashCode());
        return hashCode;
    }

    @Override
    public UpdateVoiceProfileRequest clone() {
        return (UpdateVoiceProfileRequest) super.clone();
    }

}
