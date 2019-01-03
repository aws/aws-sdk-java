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
 * Placeholder documentation for InputSpecification
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputSpecification" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputSpecification implements Serializable, Cloneable, StructuredPojo {

    /** Input codec */
    private String codec;
    /** Maximum input bitrate, categorized coarsely */
    private String maximumBitrate;
    /** Input resolution, categorized coarsely */
    private String resolution;

    /**
     * Input codec
     * 
     * @param codec
     *        Input codec
     * @see InputCodec
     */

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * Input codec
     * 
     * @return Input codec
     * @see InputCodec
     */

    public String getCodec() {
        return this.codec;
    }

    /**
     * Input codec
     * 
     * @param codec
     *        Input codec
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputCodec
     */

    public InputSpecification withCodec(String codec) {
        setCodec(codec);
        return this;
    }

    /**
     * Input codec
     * 
     * @param codec
     *        Input codec
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputCodec
     */

    public InputSpecification withCodec(InputCodec codec) {
        this.codec = codec.toString();
        return this;
    }

    /**
     * Maximum input bitrate, categorized coarsely
     * 
     * @param maximumBitrate
     *        Maximum input bitrate, categorized coarsely
     * @see InputMaximumBitrate
     */

    public void setMaximumBitrate(String maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
    }

    /**
     * Maximum input bitrate, categorized coarsely
     * 
     * @return Maximum input bitrate, categorized coarsely
     * @see InputMaximumBitrate
     */

    public String getMaximumBitrate() {
        return this.maximumBitrate;
    }

    /**
     * Maximum input bitrate, categorized coarsely
     * 
     * @param maximumBitrate
     *        Maximum input bitrate, categorized coarsely
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputMaximumBitrate
     */

    public InputSpecification withMaximumBitrate(String maximumBitrate) {
        setMaximumBitrate(maximumBitrate);
        return this;
    }

    /**
     * Maximum input bitrate, categorized coarsely
     * 
     * @param maximumBitrate
     *        Maximum input bitrate, categorized coarsely
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputMaximumBitrate
     */

    public InputSpecification withMaximumBitrate(InputMaximumBitrate maximumBitrate) {
        this.maximumBitrate = maximumBitrate.toString();
        return this;
    }

    /**
     * Input resolution, categorized coarsely
     * 
     * @param resolution
     *        Input resolution, categorized coarsely
     * @see InputResolution
     */

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * Input resolution, categorized coarsely
     * 
     * @return Input resolution, categorized coarsely
     * @see InputResolution
     */

    public String getResolution() {
        return this.resolution;
    }

    /**
     * Input resolution, categorized coarsely
     * 
     * @param resolution
     *        Input resolution, categorized coarsely
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputResolution
     */

    public InputSpecification withResolution(String resolution) {
        setResolution(resolution);
        return this;
    }

    /**
     * Input resolution, categorized coarsely
     * 
     * @param resolution
     *        Input resolution, categorized coarsely
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see InputResolution
     */

    public InputSpecification withResolution(InputResolution resolution) {
        this.resolution = resolution.toString();
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
        if (getCodec() != null)
            sb.append("Codec: ").append(getCodec()).append(",");
        if (getMaximumBitrate() != null)
            sb.append("MaximumBitrate: ").append(getMaximumBitrate()).append(",");
        if (getResolution() != null)
            sb.append("Resolution: ").append(getResolution());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputSpecification == false)
            return false;
        InputSpecification other = (InputSpecification) obj;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getMaximumBitrate() == null ^ this.getMaximumBitrate() == null)
            return false;
        if (other.getMaximumBitrate() != null && other.getMaximumBitrate().equals(this.getMaximumBitrate()) == false)
            return false;
        if (other.getResolution() == null ^ this.getResolution() == null)
            return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode + ((getMaximumBitrate() == null) ? 0 : getMaximumBitrate().hashCode());
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode());
        return hashCode;
    }

    @Override
    public InputSpecification clone() {
        try {
            return (InputSpecification) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputSpecificationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
