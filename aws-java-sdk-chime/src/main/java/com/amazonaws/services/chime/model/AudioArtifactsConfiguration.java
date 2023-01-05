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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The audio artifact configuration object.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/AudioArtifactsConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AudioArtifactsConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The MUX type of the audio artifact configuration object.
     * </p>
     */
    private String muxType;

    /**
     * <p>
     * The MUX type of the audio artifact configuration object.
     * </p>
     * 
     * @param muxType
     *        The MUX type of the audio artifact configuration object.
     * @see AudioMuxType
     */

    public void setMuxType(String muxType) {
        this.muxType = muxType;
    }

    /**
     * <p>
     * The MUX type of the audio artifact configuration object.
     * </p>
     * 
     * @return The MUX type of the audio artifact configuration object.
     * @see AudioMuxType
     */

    public String getMuxType() {
        return this.muxType;
    }

    /**
     * <p>
     * The MUX type of the audio artifact configuration object.
     * </p>
     * 
     * @param muxType
     *        The MUX type of the audio artifact configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioMuxType
     */

    public AudioArtifactsConfiguration withMuxType(String muxType) {
        setMuxType(muxType);
        return this;
    }

    /**
     * <p>
     * The MUX type of the audio artifact configuration object.
     * </p>
     * 
     * @param muxType
     *        The MUX type of the audio artifact configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AudioMuxType
     */

    public AudioArtifactsConfiguration withMuxType(AudioMuxType muxType) {
        this.muxType = muxType.toString();
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
        if (getMuxType() != null)
            sb.append("MuxType: ").append(getMuxType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AudioArtifactsConfiguration == false)
            return false;
        AudioArtifactsConfiguration other = (AudioArtifactsConfiguration) obj;
        if (other.getMuxType() == null ^ this.getMuxType() == null)
            return false;
        if (other.getMuxType() != null && other.getMuxType().equals(this.getMuxType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMuxType() == null) ? 0 : getMuxType().hashCode());
        return hashCode;
    }

    @Override
    public AudioArtifactsConfiguration clone() {
        try {
            return (AudioArtifactsConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chime.model.transform.AudioArtifactsConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
