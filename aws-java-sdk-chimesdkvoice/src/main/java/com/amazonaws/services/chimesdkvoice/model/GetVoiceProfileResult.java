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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-voice-2022-08-03/GetVoiceProfile" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetVoiceProfileResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The voice profile details.
     * </p>
     */
    private VoiceProfile voiceProfile;

    /**
     * <p>
     * The voice profile details.
     * </p>
     * 
     * @param voiceProfile
     *        The voice profile details.
     */

    public void setVoiceProfile(VoiceProfile voiceProfile) {
        this.voiceProfile = voiceProfile;
    }

    /**
     * <p>
     * The voice profile details.
     * </p>
     * 
     * @return The voice profile details.
     */

    public VoiceProfile getVoiceProfile() {
        return this.voiceProfile;
    }

    /**
     * <p>
     * The voice profile details.
     * </p>
     * 
     * @param voiceProfile
     *        The voice profile details.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetVoiceProfileResult withVoiceProfile(VoiceProfile voiceProfile) {
        setVoiceProfile(voiceProfile);
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
        if (getVoiceProfile() != null)
            sb.append("VoiceProfile: ").append(getVoiceProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetVoiceProfileResult == false)
            return false;
        GetVoiceProfileResult other = (GetVoiceProfileResult) obj;
        if (other.getVoiceProfile() == null ^ this.getVoiceProfile() == null)
            return false;
        if (other.getVoiceProfile() != null && other.getVoiceProfile().equals(this.getVoiceProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVoiceProfile() == null) ? 0 : getVoiceProfile().hashCode());
        return hashCode;
    }

    @Override
    public GetVoiceProfileResult clone() {
        try {
            return (GetVoiceProfileResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
