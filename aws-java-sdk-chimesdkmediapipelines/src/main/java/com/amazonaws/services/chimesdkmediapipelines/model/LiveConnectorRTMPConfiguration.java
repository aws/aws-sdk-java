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
 * The media pipeline's RTMP configuration object.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/LiveConnectorRTMPConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LiveConnectorRTMPConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URL of the RTMP configuration.
     * </p>
     */
    private String url;
    /**
     * <p>
     * The audio channels set for the RTMP configuration
     * </p>
     */
    private String audioChannels;
    /**
     * <p>
     * The audio sample rate set for the RTMP configuration. Default: 48000.
     * </p>
     */
    private String audioSampleRate;

    /**
     * <p>
     * The URL of the RTMP configuration.
     * </p>
     * 
     * @param url
     *        The URL of the RTMP configuration.
     */

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * <p>
     * The URL of the RTMP configuration.
     * </p>
     * 
     * @return The URL of the RTMP configuration.
     */

    public String getUrl() {
        return this.url;
    }

    /**
     * <p>
     * The URL of the RTMP configuration.
     * </p>
     * 
     * @param url
     *        The URL of the RTMP configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LiveConnectorRTMPConfiguration withUrl(String url) {
        setUrl(url);
        return this;
    }

    /**
     * <p>
     * The audio channels set for the RTMP configuration
     * </p>
     * 
     * @param audioChannels
     *        The audio channels set for the RTMP configuration
     * @see AudioChannelsOption
     */

    public void setAudioChannels(String audioChannels) {
        this.audioChannels = audioChannels;
    }

    /**
     * <p>
     * The audio channels set for the RTMP configuration
     * </p>
     * 
     * @return The audio channels set for the RTMP configuration
     * @see AudioChannelsOption
     */

    public String getAudioChannels() {
        return this.audioChannels;
    }

    /**
     * <p>
     * The audio channels set for the RTMP configuration
     * </p>
     * 
     * @param audioChannels
     *        The audio channels set for the RTMP configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioChannelsOption
     */

    public LiveConnectorRTMPConfiguration withAudioChannels(String audioChannels) {
        setAudioChannels(audioChannels);
        return this;
    }

    /**
     * <p>
     * The audio channels set for the RTMP configuration
     * </p>
     * 
     * @param audioChannels
     *        The audio channels set for the RTMP configuration
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioChannelsOption
     */

    public LiveConnectorRTMPConfiguration withAudioChannels(AudioChannelsOption audioChannels) {
        this.audioChannels = audioChannels.toString();
        return this;
    }

    /**
     * <p>
     * The audio sample rate set for the RTMP configuration. Default: 48000.
     * </p>
     * 
     * @param audioSampleRate
     *        The audio sample rate set for the RTMP configuration. Default: 48000.
     */

    public void setAudioSampleRate(String audioSampleRate) {
        this.audioSampleRate = audioSampleRate;
    }

    /**
     * <p>
     * The audio sample rate set for the RTMP configuration. Default: 48000.
     * </p>
     * 
     * @return The audio sample rate set for the RTMP configuration. Default: 48000.
     */

    public String getAudioSampleRate() {
        return this.audioSampleRate;
    }

    /**
     * <p>
     * The audio sample rate set for the RTMP configuration. Default: 48000.
     * </p>
     * 
     * @param audioSampleRate
     *        The audio sample rate set for the RTMP configuration. Default: 48000.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LiveConnectorRTMPConfiguration withAudioSampleRate(String audioSampleRate) {
        setAudioSampleRate(audioSampleRate);
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
        if (getUrl() != null)
            sb.append("Url: ").append("***Sensitive Data Redacted***").append(",");
        if (getAudioChannels() != null)
            sb.append("AudioChannels: ").append(getAudioChannels()).append(",");
        if (getAudioSampleRate() != null)
            sb.append("AudioSampleRate: ").append(getAudioSampleRate());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LiveConnectorRTMPConfiguration == false)
            return false;
        LiveConnectorRTMPConfiguration other = (LiveConnectorRTMPConfiguration) obj;
        if (other.getUrl() == null ^ this.getUrl() == null)
            return false;
        if (other.getUrl() != null && other.getUrl().equals(this.getUrl()) == false)
            return false;
        if (other.getAudioChannels() == null ^ this.getAudioChannels() == null)
            return false;
        if (other.getAudioChannels() != null && other.getAudioChannels().equals(this.getAudioChannels()) == false)
            return false;
        if (other.getAudioSampleRate() == null ^ this.getAudioSampleRate() == null)
            return false;
        if (other.getAudioSampleRate() != null && other.getAudioSampleRate().equals(this.getAudioSampleRate()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getUrl() == null) ? 0 : getUrl().hashCode());
        hashCode = prime * hashCode + ((getAudioChannels() == null) ? 0 : getAudioChannels().hashCode());
        hashCode = prime * hashCode + ((getAudioSampleRate() == null) ? 0 : getAudioSampleRate().hashCode());
        return hashCode;
    }

    @Override
    public LiveConnectorRTMPConfiguration clone() {
        try {
            return (LiveConnectorRTMPConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.LiveConnectorRTMPConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
