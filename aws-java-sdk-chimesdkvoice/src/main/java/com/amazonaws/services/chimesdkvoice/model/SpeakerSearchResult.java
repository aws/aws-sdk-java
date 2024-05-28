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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The result of a speaker search analysis.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/SpeakerSearchResult"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SpeakerSearchResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The confidence score in the speaker search analysis.
     * </p>
     */
    private Float confidenceScore;
    /**
     * <p>
     * The voice profile ID.
     * </p>
     */
    private String voiceProfileId;

    /**
     * <p>
     * The confidence score in the speaker search analysis.
     * </p>
     * 
     * @param confidenceScore
     *        The confidence score in the speaker search analysis.
     */

    public void setConfidenceScore(Float confidenceScore) {
        this.confidenceScore = confidenceScore;
    }

    /**
     * <p>
     * The confidence score in the speaker search analysis.
     * </p>
     * 
     * @return The confidence score in the speaker search analysis.
     */

    public Float getConfidenceScore() {
        return this.confidenceScore;
    }

    /**
     * <p>
     * The confidence score in the speaker search analysis.
     * </p>
     * 
     * @param confidenceScore
     *        The confidence score in the speaker search analysis.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerSearchResult withConfidenceScore(Float confidenceScore) {
        setConfidenceScore(confidenceScore);
        return this;
    }

    /**
     * <p>
     * The voice profile ID.
     * </p>
     * 
     * @param voiceProfileId
     *        The voice profile ID.
     */

    public void setVoiceProfileId(String voiceProfileId) {
        this.voiceProfileId = voiceProfileId;
    }

    /**
     * <p>
     * The voice profile ID.
     * </p>
     * 
     * @return The voice profile ID.
     */

    public String getVoiceProfileId() {
        return this.voiceProfileId;
    }

    /**
     * <p>
     * The voice profile ID.
     * </p>
     * 
     * @param voiceProfileId
     *        The voice profile ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SpeakerSearchResult withVoiceProfileId(String voiceProfileId) {
        setVoiceProfileId(voiceProfileId);
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
        if (getConfidenceScore() != null)
            sb.append("ConfidenceScore: ").append(getConfidenceScore()).append(",");
        if (getVoiceProfileId() != null)
            sb.append("VoiceProfileId: ").append(getVoiceProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SpeakerSearchResult == false)
            return false;
        SpeakerSearchResult other = (SpeakerSearchResult) obj;
        if (other.getConfidenceScore() == null ^ this.getConfidenceScore() == null)
            return false;
        if (other.getConfidenceScore() != null && other.getConfidenceScore().equals(this.getConfidenceScore()) == false)
            return false;
        if (other.getVoiceProfileId() == null ^ this.getVoiceProfileId() == null)
            return false;
        if (other.getVoiceProfileId() != null && other.getVoiceProfileId().equals(this.getVoiceProfileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfidenceScore() == null) ? 0 : getConfidenceScore().hashCode());
        hashCode = prime * hashCode + ((getVoiceProfileId() == null) ? 0 : getVoiceProfileId().hashCode());
        return hashCode;
    }

    @Override
    public SpeakerSearchResult clone() {
        try {
            return (SpeakerSearchResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkvoice.model.transform.SpeakerSearchResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
