/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.lexmodelsv2.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configures conversation logging that saves audio, text, and metadata for the conversations with your users.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/models.lex.v2-2020-08-07/ConversationLogSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ConversationLogSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon CloudWatch Logs settings for logging text and metadata.
     * </p>
     */
    private java.util.List<TextLogSetting> textLogSettings;
    /**
     * <p>
     * The Amazon S3 settings for logging audio to an S3 bucket.
     * </p>
     */
    private java.util.List<AudioLogSetting> audioLogSettings;

    /**
     * <p>
     * The Amazon CloudWatch Logs settings for logging text and metadata.
     * </p>
     * 
     * @return The Amazon CloudWatch Logs settings for logging text and metadata.
     */

    public java.util.List<TextLogSetting> getTextLogSettings() {
        return textLogSettings;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs settings for logging text and metadata.
     * </p>
     * 
     * @param textLogSettings
     *        The Amazon CloudWatch Logs settings for logging text and metadata.
     */

    public void setTextLogSettings(java.util.Collection<TextLogSetting> textLogSettings) {
        if (textLogSettings == null) {
            this.textLogSettings = null;
            return;
        }

        this.textLogSettings = new java.util.ArrayList<TextLogSetting>(textLogSettings);
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs settings for logging text and metadata.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTextLogSettings(java.util.Collection)} or {@link #withTextLogSettings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param textLogSettings
     *        The Amazon CloudWatch Logs settings for logging text and metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLogSettings withTextLogSettings(TextLogSetting... textLogSettings) {
        if (this.textLogSettings == null) {
            setTextLogSettings(new java.util.ArrayList<TextLogSetting>(textLogSettings.length));
        }
        for (TextLogSetting ele : textLogSettings) {
            this.textLogSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon CloudWatch Logs settings for logging text and metadata.
     * </p>
     * 
     * @param textLogSettings
     *        The Amazon CloudWatch Logs settings for logging text and metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLogSettings withTextLogSettings(java.util.Collection<TextLogSetting> textLogSettings) {
        setTextLogSettings(textLogSettings);
        return this;
    }

    /**
     * <p>
     * The Amazon S3 settings for logging audio to an S3 bucket.
     * </p>
     * 
     * @return The Amazon S3 settings for logging audio to an S3 bucket.
     */

    public java.util.List<AudioLogSetting> getAudioLogSettings() {
        return audioLogSettings;
    }

    /**
     * <p>
     * The Amazon S3 settings for logging audio to an S3 bucket.
     * </p>
     * 
     * @param audioLogSettings
     *        The Amazon S3 settings for logging audio to an S3 bucket.
     */

    public void setAudioLogSettings(java.util.Collection<AudioLogSetting> audioLogSettings) {
        if (audioLogSettings == null) {
            this.audioLogSettings = null;
            return;
        }

        this.audioLogSettings = new java.util.ArrayList<AudioLogSetting>(audioLogSettings);
    }

    /**
     * <p>
     * The Amazon S3 settings for logging audio to an S3 bucket.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudioLogSettings(java.util.Collection)} or {@link #withAudioLogSettings(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param audioLogSettings
     *        The Amazon S3 settings for logging audio to an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLogSettings withAudioLogSettings(AudioLogSetting... audioLogSettings) {
        if (this.audioLogSettings == null) {
            setAudioLogSettings(new java.util.ArrayList<AudioLogSetting>(audioLogSettings.length));
        }
        for (AudioLogSetting ele : audioLogSettings) {
            this.audioLogSettings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon S3 settings for logging audio to an S3 bucket.
     * </p>
     * 
     * @param audioLogSettings
     *        The Amazon S3 settings for logging audio to an S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ConversationLogSettings withAudioLogSettings(java.util.Collection<AudioLogSetting> audioLogSettings) {
        setAudioLogSettings(audioLogSettings);
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
        if (getTextLogSettings() != null)
            sb.append("TextLogSettings: ").append(getTextLogSettings()).append(",");
        if (getAudioLogSettings() != null)
            sb.append("AudioLogSettings: ").append(getAudioLogSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ConversationLogSettings == false)
            return false;
        ConversationLogSettings other = (ConversationLogSettings) obj;
        if (other.getTextLogSettings() == null ^ this.getTextLogSettings() == null)
            return false;
        if (other.getTextLogSettings() != null && other.getTextLogSettings().equals(this.getTextLogSettings()) == false)
            return false;
        if (other.getAudioLogSettings() == null ^ this.getAudioLogSettings() == null)
            return false;
        if (other.getAudioLogSettings() != null && other.getAudioLogSettings().equals(this.getAudioLogSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTextLogSettings() == null) ? 0 : getTextLogSettings().hashCode());
        hashCode = prime * hashCode + ((getAudioLogSettings() == null) ? 0 : getAudioLogSettings().hashCode());
        return hashCode;
    }

    @Override
    public ConversationLogSettings clone() {
        try {
            return (ConversationLogSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lexmodelsv2.model.transform.ConversationLogSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
