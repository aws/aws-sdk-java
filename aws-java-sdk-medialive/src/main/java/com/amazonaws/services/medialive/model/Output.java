/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Output settings. There can be multiple outputs within a group.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/Output" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Output implements Serializable, Cloneable, StructuredPojo {

    /** The names of the AudioDescriptions used as audio sources for this output. */
    private java.util.List<String> audioDescriptionNames;
    /** The names of the CaptionDescriptions used as caption sources for this output. */
    private java.util.List<String> captionDescriptionNames;
    /** The name used to identify an output. */
    private String outputName;
    /** Output type-specific settings. */
    private OutputSettings outputSettings;
    /** The name of the VideoDescription used as the source for this output. */
    private String videoDescriptionName;

    /**
     * The names of the AudioDescriptions used as audio sources for this output.
     * 
     * @return The names of the AudioDescriptions used as audio sources for this output.
     */

    public java.util.List<String> getAudioDescriptionNames() {
        return audioDescriptionNames;
    }

    /**
     * The names of the AudioDescriptions used as audio sources for this output.
     * 
     * @param audioDescriptionNames
     *        The names of the AudioDescriptions used as audio sources for this output.
     */

    public void setAudioDescriptionNames(java.util.Collection<String> audioDescriptionNames) {
        if (audioDescriptionNames == null) {
            this.audioDescriptionNames = null;
            return;
        }

        this.audioDescriptionNames = new java.util.ArrayList<String>(audioDescriptionNames);
    }

    /**
     * The names of the AudioDescriptions used as audio sources for this output.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAudioDescriptionNames(java.util.Collection)} or
     * {@link #withAudioDescriptionNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param audioDescriptionNames
     *        The names of the AudioDescriptions used as audio sources for this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withAudioDescriptionNames(String... audioDescriptionNames) {
        if (this.audioDescriptionNames == null) {
            setAudioDescriptionNames(new java.util.ArrayList<String>(audioDescriptionNames.length));
        }
        for (String ele : audioDescriptionNames) {
            this.audioDescriptionNames.add(ele);
        }
        return this;
    }

    /**
     * The names of the AudioDescriptions used as audio sources for this output.
     * 
     * @param audioDescriptionNames
     *        The names of the AudioDescriptions used as audio sources for this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withAudioDescriptionNames(java.util.Collection<String> audioDescriptionNames) {
        setAudioDescriptionNames(audioDescriptionNames);
        return this;
    }

    /**
     * The names of the CaptionDescriptions used as caption sources for this output.
     * 
     * @return The names of the CaptionDescriptions used as caption sources for this output.
     */

    public java.util.List<String> getCaptionDescriptionNames() {
        return captionDescriptionNames;
    }

    /**
     * The names of the CaptionDescriptions used as caption sources for this output.
     * 
     * @param captionDescriptionNames
     *        The names of the CaptionDescriptions used as caption sources for this output.
     */

    public void setCaptionDescriptionNames(java.util.Collection<String> captionDescriptionNames) {
        if (captionDescriptionNames == null) {
            this.captionDescriptionNames = null;
            return;
        }

        this.captionDescriptionNames = new java.util.ArrayList<String>(captionDescriptionNames);
    }

    /**
     * The names of the CaptionDescriptions used as caption sources for this output.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCaptionDescriptionNames(java.util.Collection)} or
     * {@link #withCaptionDescriptionNames(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param captionDescriptionNames
     *        The names of the CaptionDescriptions used as caption sources for this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withCaptionDescriptionNames(String... captionDescriptionNames) {
        if (this.captionDescriptionNames == null) {
            setCaptionDescriptionNames(new java.util.ArrayList<String>(captionDescriptionNames.length));
        }
        for (String ele : captionDescriptionNames) {
            this.captionDescriptionNames.add(ele);
        }
        return this;
    }

    /**
     * The names of the CaptionDescriptions used as caption sources for this output.
     * 
     * @param captionDescriptionNames
     *        The names of the CaptionDescriptions used as caption sources for this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withCaptionDescriptionNames(java.util.Collection<String> captionDescriptionNames) {
        setCaptionDescriptionNames(captionDescriptionNames);
        return this;
    }

    /**
     * The name used to identify an output.
     * 
     * @param outputName
     *        The name used to identify an output.
     */

    public void setOutputName(String outputName) {
        this.outputName = outputName;
    }

    /**
     * The name used to identify an output.
     * 
     * @return The name used to identify an output.
     */

    public String getOutputName() {
        return this.outputName;
    }

    /**
     * The name used to identify an output.
     * 
     * @param outputName
     *        The name used to identify an output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withOutputName(String outputName) {
        setOutputName(outputName);
        return this;
    }

    /**
     * Output type-specific settings.
     * 
     * @param outputSettings
     *        Output type-specific settings.
     */

    public void setOutputSettings(OutputSettings outputSettings) {
        this.outputSettings = outputSettings;
    }

    /**
     * Output type-specific settings.
     * 
     * @return Output type-specific settings.
     */

    public OutputSettings getOutputSettings() {
        return this.outputSettings;
    }

    /**
     * Output type-specific settings.
     * 
     * @param outputSettings
     *        Output type-specific settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withOutputSettings(OutputSettings outputSettings) {
        setOutputSettings(outputSettings);
        return this;
    }

    /**
     * The name of the VideoDescription used as the source for this output.
     * 
     * @param videoDescriptionName
     *        The name of the VideoDescription used as the source for this output.
     */

    public void setVideoDescriptionName(String videoDescriptionName) {
        this.videoDescriptionName = videoDescriptionName;
    }

    /**
     * The name of the VideoDescription used as the source for this output.
     * 
     * @return The name of the VideoDescription used as the source for this output.
     */

    public String getVideoDescriptionName() {
        return this.videoDescriptionName;
    }

    /**
     * The name of the VideoDescription used as the source for this output.
     * 
     * @param videoDescriptionName
     *        The name of the VideoDescription used as the source for this output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Output withVideoDescriptionName(String videoDescriptionName) {
        setVideoDescriptionName(videoDescriptionName);
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
        if (getAudioDescriptionNames() != null)
            sb.append("AudioDescriptionNames: ").append(getAudioDescriptionNames()).append(",");
        if (getCaptionDescriptionNames() != null)
            sb.append("CaptionDescriptionNames: ").append(getCaptionDescriptionNames()).append(",");
        if (getOutputName() != null)
            sb.append("OutputName: ").append(getOutputName()).append(",");
        if (getOutputSettings() != null)
            sb.append("OutputSettings: ").append(getOutputSettings()).append(",");
        if (getVideoDescriptionName() != null)
            sb.append("VideoDescriptionName: ").append(getVideoDescriptionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Output == false)
            return false;
        Output other = (Output) obj;
        if (other.getAudioDescriptionNames() == null ^ this.getAudioDescriptionNames() == null)
            return false;
        if (other.getAudioDescriptionNames() != null && other.getAudioDescriptionNames().equals(this.getAudioDescriptionNames()) == false)
            return false;
        if (other.getCaptionDescriptionNames() == null ^ this.getCaptionDescriptionNames() == null)
            return false;
        if (other.getCaptionDescriptionNames() != null && other.getCaptionDescriptionNames().equals(this.getCaptionDescriptionNames()) == false)
            return false;
        if (other.getOutputName() == null ^ this.getOutputName() == null)
            return false;
        if (other.getOutputName() != null && other.getOutputName().equals(this.getOutputName()) == false)
            return false;
        if (other.getOutputSettings() == null ^ this.getOutputSettings() == null)
            return false;
        if (other.getOutputSettings() != null && other.getOutputSettings().equals(this.getOutputSettings()) == false)
            return false;
        if (other.getVideoDescriptionName() == null ^ this.getVideoDescriptionName() == null)
            return false;
        if (other.getVideoDescriptionName() != null && other.getVideoDescriptionName().equals(this.getVideoDescriptionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAudioDescriptionNames() == null) ? 0 : getAudioDescriptionNames().hashCode());
        hashCode = prime * hashCode + ((getCaptionDescriptionNames() == null) ? 0 : getCaptionDescriptionNames().hashCode());
        hashCode = prime * hashCode + ((getOutputName() == null) ? 0 : getOutputName().hashCode());
        hashCode = prime * hashCode + ((getOutputSettings() == null) ? 0 : getOutputSettings().hashCode());
        hashCode = prime * hashCode + ((getVideoDescriptionName() == null) ? 0 : getVideoDescriptionName().hashCode());
        return hashCode;
    }

    @Override
    public Output clone() {
        try {
            return (Output) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.OutputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
