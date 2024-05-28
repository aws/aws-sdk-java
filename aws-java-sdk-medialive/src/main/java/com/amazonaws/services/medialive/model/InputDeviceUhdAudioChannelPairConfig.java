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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * One audio configuration that specifies the format for one audio pair that the device produces as output.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputDeviceUhdAudioChannelPairConfig"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDeviceUhdAudioChannelPairConfig implements Serializable, Cloneable, StructuredPojo {

    /** The ID for one audio pair configuration, a value from 1 to 8. */
    private Integer id;
    /**
     * The profile for one audio pair configuration. This property describes one audio configuration in the format (rate
     * control algorithm)-(codec)_(quality)-(bitrate in bytes). For example, CBR-AAC_HQ-192000. Or DISABLED, in which
     * case the device won't produce audio for this pair.
     */
    private String profile;

    /**
     * The ID for one audio pair configuration, a value from 1 to 8.
     * 
     * @param id
     *        The ID for one audio pair configuration, a value from 1 to 8.
     */

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * The ID for one audio pair configuration, a value from 1 to 8.
     * 
     * @return The ID for one audio pair configuration, a value from 1 to 8.
     */

    public Integer getId() {
        return this.id;
    }

    /**
     * The ID for one audio pair configuration, a value from 1 to 8.
     * 
     * @param id
     *        The ID for one audio pair configuration, a value from 1 to 8.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDeviceUhdAudioChannelPairConfig withId(Integer id) {
        setId(id);
        return this;
    }

    /**
     * The profile for one audio pair configuration. This property describes one audio configuration in the format (rate
     * control algorithm)-(codec)_(quality)-(bitrate in bytes). For example, CBR-AAC_HQ-192000. Or DISABLED, in which
     * case the device won't produce audio for this pair.
     * 
     * @param profile
     *        The profile for one audio pair configuration. This property describes one audio configuration in the
     *        format (rate control algorithm)-(codec)_(quality)-(bitrate in bytes). For example, CBR-AAC_HQ-192000. Or
     *        DISABLED, in which case the device won't produce audio for this pair.
     * @see InputDeviceUhdAudioChannelPairProfile
     */

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * The profile for one audio pair configuration. This property describes one audio configuration in the format (rate
     * control algorithm)-(codec)_(quality)-(bitrate in bytes). For example, CBR-AAC_HQ-192000. Or DISABLED, in which
     * case the device won't produce audio for this pair.
     * 
     * @return The profile for one audio pair configuration. This property describes one audio configuration in the
     *         format (rate control algorithm)-(codec)_(quality)-(bitrate in bytes). For example, CBR-AAC_HQ-192000. Or
     *         DISABLED, in which case the device won't produce audio for this pair.
     * @see InputDeviceUhdAudioChannelPairProfile
     */

    public String getProfile() {
        return this.profile;
    }

    /**
     * The profile for one audio pair configuration. This property describes one audio configuration in the format (rate
     * control algorithm)-(codec)_(quality)-(bitrate in bytes). For example, CBR-AAC_HQ-192000. Or DISABLED, in which
     * case the device won't produce audio for this pair.
     * 
     * @param profile
     *        The profile for one audio pair configuration. This property describes one audio configuration in the
     *        format (rate control algorithm)-(codec)_(quality)-(bitrate in bytes). For example, CBR-AAC_HQ-192000. Or
     *        DISABLED, in which case the device won't produce audio for this pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceUhdAudioChannelPairProfile
     */

    public InputDeviceUhdAudioChannelPairConfig withProfile(String profile) {
        setProfile(profile);
        return this;
    }

    /**
     * The profile for one audio pair configuration. This property describes one audio configuration in the format (rate
     * control algorithm)-(codec)_(quality)-(bitrate in bytes). For example, CBR-AAC_HQ-192000. Or DISABLED, in which
     * case the device won't produce audio for this pair.
     * 
     * @param profile
     *        The profile for one audio pair configuration. This property describes one audio configuration in the
     *        format (rate control algorithm)-(codec)_(quality)-(bitrate in bytes). For example, CBR-AAC_HQ-192000. Or
     *        DISABLED, in which case the device won't produce audio for this pair.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputDeviceUhdAudioChannelPairProfile
     */

    public InputDeviceUhdAudioChannelPairConfig withProfile(InputDeviceUhdAudioChannelPairProfile profile) {
        this.profile = profile.toString();
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
        if (getProfile() != null)
            sb.append("Profile: ").append(getProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDeviceUhdAudioChannelPairConfig == false)
            return false;
        InputDeviceUhdAudioChannelPairConfig other = (InputDeviceUhdAudioChannelPairConfig) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getProfile() == null ^ this.getProfile() == null)
            return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        return hashCode;
    }

    @Override
    public InputDeviceUhdAudioChannelPairConfig clone() {
        try {
            return (InputDeviceUhdAudioChannelPairConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputDeviceUhdAudioChannelPairConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
