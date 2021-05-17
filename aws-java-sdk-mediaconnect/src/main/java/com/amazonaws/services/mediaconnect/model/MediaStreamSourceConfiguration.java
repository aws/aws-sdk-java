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
package com.amazonaws.services.mediaconnect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * The media stream that is associated with the source, and the parameters for that association.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/MediaStreamSourceConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaStreamSourceConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * The format that was used to encode the data. For ancillary data streams, set the encoding name to smpte291. For
     * audio streams, set the encoding name to pcm. For video, 2110 streams, set the encoding name to raw. For video,
     * JPEG XS streams, set the encoding name to jxsv.
     */
    private String encodingName;
    /** The transport parameters that are associated with an incoming media stream. */
    private java.util.List<InputConfiguration> inputConfigurations;
    /** The name of the media stream. */
    private String mediaStreamName;

    /**
     * The format that was used to encode the data. For ancillary data streams, set the encoding name to smpte291. For
     * audio streams, set the encoding name to pcm. For video, 2110 streams, set the encoding name to raw. For video,
     * JPEG XS streams, set the encoding name to jxsv.
     * 
     * @param encodingName
     *        The format that was used to encode the data. For ancillary data streams, set the encoding name to
     *        smpte291. For audio streams, set the encoding name to pcm. For video, 2110 streams, set the encoding name
     *        to raw. For video, JPEG XS streams, set the encoding name to jxsv.
     * @see EncodingName
     */

    public void setEncodingName(String encodingName) {
        this.encodingName = encodingName;
    }

    /**
     * The format that was used to encode the data. For ancillary data streams, set the encoding name to smpte291. For
     * audio streams, set the encoding name to pcm. For video, 2110 streams, set the encoding name to raw. For video,
     * JPEG XS streams, set the encoding name to jxsv.
     * 
     * @return The format that was used to encode the data. For ancillary data streams, set the encoding name to
     *         smpte291. For audio streams, set the encoding name to pcm. For video, 2110 streams, set the encoding name
     *         to raw. For video, JPEG XS streams, set the encoding name to jxsv.
     * @see EncodingName
     */

    public String getEncodingName() {
        return this.encodingName;
    }

    /**
     * The format that was used to encode the data. For ancillary data streams, set the encoding name to smpte291. For
     * audio streams, set the encoding name to pcm. For video, 2110 streams, set the encoding name to raw. For video,
     * JPEG XS streams, set the encoding name to jxsv.
     * 
     * @param encodingName
     *        The format that was used to encode the data. For ancillary data streams, set the encoding name to
     *        smpte291. For audio streams, set the encoding name to pcm. For video, 2110 streams, set the encoding name
     *        to raw. For video, JPEG XS streams, set the encoding name to jxsv.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncodingName
     */

    public MediaStreamSourceConfiguration withEncodingName(String encodingName) {
        setEncodingName(encodingName);
        return this;
    }

    /**
     * The format that was used to encode the data. For ancillary data streams, set the encoding name to smpte291. For
     * audio streams, set the encoding name to pcm. For video, 2110 streams, set the encoding name to raw. For video,
     * JPEG XS streams, set the encoding name to jxsv.
     * 
     * @param encodingName
     *        The format that was used to encode the data. For ancillary data streams, set the encoding name to
     *        smpte291. For audio streams, set the encoding name to pcm. For video, 2110 streams, set the encoding name
     *        to raw. For video, JPEG XS streams, set the encoding name to jxsv.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EncodingName
     */

    public MediaStreamSourceConfiguration withEncodingName(EncodingName encodingName) {
        this.encodingName = encodingName.toString();
        return this;
    }

    /**
     * The transport parameters that are associated with an incoming media stream.
     * 
     * @return The transport parameters that are associated with an incoming media stream.
     */

    public java.util.List<InputConfiguration> getInputConfigurations() {
        return inputConfigurations;
    }

    /**
     * The transport parameters that are associated with an incoming media stream.
     * 
     * @param inputConfigurations
     *        The transport parameters that are associated with an incoming media stream.
     */

    public void setInputConfigurations(java.util.Collection<InputConfiguration> inputConfigurations) {
        if (inputConfigurations == null) {
            this.inputConfigurations = null;
            return;
        }

        this.inputConfigurations = new java.util.ArrayList<InputConfiguration>(inputConfigurations);
    }

    /**
     * The transport parameters that are associated with an incoming media stream.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputConfigurations(java.util.Collection)} or {@link #withInputConfigurations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param inputConfigurations
     *        The transport parameters that are associated with an incoming media stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamSourceConfiguration withInputConfigurations(InputConfiguration... inputConfigurations) {
        if (this.inputConfigurations == null) {
            setInputConfigurations(new java.util.ArrayList<InputConfiguration>(inputConfigurations.length));
        }
        for (InputConfiguration ele : inputConfigurations) {
            this.inputConfigurations.add(ele);
        }
        return this;
    }

    /**
     * The transport parameters that are associated with an incoming media stream.
     * 
     * @param inputConfigurations
     *        The transport parameters that are associated with an incoming media stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamSourceConfiguration withInputConfigurations(java.util.Collection<InputConfiguration> inputConfigurations) {
        setInputConfigurations(inputConfigurations);
        return this;
    }

    /**
     * The name of the media stream.
     * 
     * @param mediaStreamName
     *        The name of the media stream.
     */

    public void setMediaStreamName(String mediaStreamName) {
        this.mediaStreamName = mediaStreamName;
    }

    /**
     * The name of the media stream.
     * 
     * @return The name of the media stream.
     */

    public String getMediaStreamName() {
        return this.mediaStreamName;
    }

    /**
     * The name of the media stream.
     * 
     * @param mediaStreamName
     *        The name of the media stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamSourceConfiguration withMediaStreamName(String mediaStreamName) {
        setMediaStreamName(mediaStreamName);
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
        if (getEncodingName() != null)
            sb.append("EncodingName: ").append(getEncodingName()).append(",");
        if (getInputConfigurations() != null)
            sb.append("InputConfigurations: ").append(getInputConfigurations()).append(",");
        if (getMediaStreamName() != null)
            sb.append("MediaStreamName: ").append(getMediaStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaStreamSourceConfiguration == false)
            return false;
        MediaStreamSourceConfiguration other = (MediaStreamSourceConfiguration) obj;
        if (other.getEncodingName() == null ^ this.getEncodingName() == null)
            return false;
        if (other.getEncodingName() != null && other.getEncodingName().equals(this.getEncodingName()) == false)
            return false;
        if (other.getInputConfigurations() == null ^ this.getInputConfigurations() == null)
            return false;
        if (other.getInputConfigurations() != null && other.getInputConfigurations().equals(this.getInputConfigurations()) == false)
            return false;
        if (other.getMediaStreamName() == null ^ this.getMediaStreamName() == null)
            return false;
        if (other.getMediaStreamName() != null && other.getMediaStreamName().equals(this.getMediaStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEncodingName() == null) ? 0 : getEncodingName().hashCode());
        hashCode = prime * hashCode + ((getInputConfigurations() == null) ? 0 : getInputConfigurations().hashCode());
        hashCode = prime * hashCode + ((getMediaStreamName() == null) ? 0 : getMediaStreamName().hashCode());
        return hashCode;
    }

    @Override
    public MediaStreamSourceConfiguration clone() {
        try {
            return (MediaStreamSourceConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.MediaStreamSourceConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
