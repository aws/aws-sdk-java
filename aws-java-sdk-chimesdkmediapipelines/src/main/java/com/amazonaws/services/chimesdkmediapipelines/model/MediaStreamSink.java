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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Structure that contains the settings for a media stream sink.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/MediaStreamSink"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaStreamSink implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the media stream sink.
     * </p>
     */
    private String sinkArn;
    /**
     * <p>
     * The media stream sink's type.
     * </p>
     */
    private String sinkType;
    /**
     * <p>
     * Specifies the number of streams that the sink can accept.
     * </p>
     */
    private Integer reservedStreamCapacity;
    /**
     * <p>
     * The media stream sink's media stream type.
     * </p>
     */
    private String mediaStreamType;

    /**
     * <p>
     * The ARN of the media stream sink.
     * </p>
     * 
     * @param sinkArn
     *        The ARN of the media stream sink.
     */

    public void setSinkArn(String sinkArn) {
        this.sinkArn = sinkArn;
    }

    /**
     * <p>
     * The ARN of the media stream sink.
     * </p>
     * 
     * @return The ARN of the media stream sink.
     */

    public String getSinkArn() {
        return this.sinkArn;
    }

    /**
     * <p>
     * The ARN of the media stream sink.
     * </p>
     * 
     * @param sinkArn
     *        The ARN of the media stream sink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamSink withSinkArn(String sinkArn) {
        setSinkArn(sinkArn);
        return this;
    }

    /**
     * <p>
     * The media stream sink's type.
     * </p>
     * 
     * @param sinkType
     *        The media stream sink's type.
     * @see MediaStreamPipelineSinkType
     */

    public void setSinkType(String sinkType) {
        this.sinkType = sinkType;
    }

    /**
     * <p>
     * The media stream sink's type.
     * </p>
     * 
     * @return The media stream sink's type.
     * @see MediaStreamPipelineSinkType
     */

    public String getSinkType() {
        return this.sinkType;
    }

    /**
     * <p>
     * The media stream sink's type.
     * </p>
     * 
     * @param sinkType
     *        The media stream sink's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaStreamPipelineSinkType
     */

    public MediaStreamSink withSinkType(String sinkType) {
        setSinkType(sinkType);
        return this;
    }

    /**
     * <p>
     * The media stream sink's type.
     * </p>
     * 
     * @param sinkType
     *        The media stream sink's type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaStreamPipelineSinkType
     */

    public MediaStreamSink withSinkType(MediaStreamPipelineSinkType sinkType) {
        this.sinkType = sinkType.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the number of streams that the sink can accept.
     * </p>
     * 
     * @param reservedStreamCapacity
     *        Specifies the number of streams that the sink can accept.
     */

    public void setReservedStreamCapacity(Integer reservedStreamCapacity) {
        this.reservedStreamCapacity = reservedStreamCapacity;
    }

    /**
     * <p>
     * Specifies the number of streams that the sink can accept.
     * </p>
     * 
     * @return Specifies the number of streams that the sink can accept.
     */

    public Integer getReservedStreamCapacity() {
        return this.reservedStreamCapacity;
    }

    /**
     * <p>
     * Specifies the number of streams that the sink can accept.
     * </p>
     * 
     * @param reservedStreamCapacity
     *        Specifies the number of streams that the sink can accept.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStreamSink withReservedStreamCapacity(Integer reservedStreamCapacity) {
        setReservedStreamCapacity(reservedStreamCapacity);
        return this;
    }

    /**
     * <p>
     * The media stream sink's media stream type.
     * </p>
     * 
     * @param mediaStreamType
     *        The media stream sink's media stream type.
     * @see MediaStreamType
     */

    public void setMediaStreamType(String mediaStreamType) {
        this.mediaStreamType = mediaStreamType;
    }

    /**
     * <p>
     * The media stream sink's media stream type.
     * </p>
     * 
     * @return The media stream sink's media stream type.
     * @see MediaStreamType
     */

    public String getMediaStreamType() {
        return this.mediaStreamType;
    }

    /**
     * <p>
     * The media stream sink's media stream type.
     * </p>
     * 
     * @param mediaStreamType
     *        The media stream sink's media stream type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaStreamType
     */

    public MediaStreamSink withMediaStreamType(String mediaStreamType) {
        setMediaStreamType(mediaStreamType);
        return this;
    }

    /**
     * <p>
     * The media stream sink's media stream type.
     * </p>
     * 
     * @param mediaStreamType
     *        The media stream sink's media stream type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaStreamType
     */

    public MediaStreamSink withMediaStreamType(MediaStreamType mediaStreamType) {
        this.mediaStreamType = mediaStreamType.toString();
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
        if (getSinkArn() != null)
            sb.append("SinkArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getSinkType() != null)
            sb.append("SinkType: ").append(getSinkType()).append(",");
        if (getReservedStreamCapacity() != null)
            sb.append("ReservedStreamCapacity: ").append(getReservedStreamCapacity()).append(",");
        if (getMediaStreamType() != null)
            sb.append("MediaStreamType: ").append(getMediaStreamType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaStreamSink == false)
            return false;
        MediaStreamSink other = (MediaStreamSink) obj;
        if (other.getSinkArn() == null ^ this.getSinkArn() == null)
            return false;
        if (other.getSinkArn() != null && other.getSinkArn().equals(this.getSinkArn()) == false)
            return false;
        if (other.getSinkType() == null ^ this.getSinkType() == null)
            return false;
        if (other.getSinkType() != null && other.getSinkType().equals(this.getSinkType()) == false)
            return false;
        if (other.getReservedStreamCapacity() == null ^ this.getReservedStreamCapacity() == null)
            return false;
        if (other.getReservedStreamCapacity() != null && other.getReservedStreamCapacity().equals(this.getReservedStreamCapacity()) == false)
            return false;
        if (other.getMediaStreamType() == null ^ this.getMediaStreamType() == null)
            return false;
        if (other.getMediaStreamType() != null && other.getMediaStreamType().equals(this.getMediaStreamType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSinkArn() == null) ? 0 : getSinkArn().hashCode());
        hashCode = prime * hashCode + ((getSinkType() == null) ? 0 : getSinkType().hashCode());
        hashCode = prime * hashCode + ((getReservedStreamCapacity() == null) ? 0 : getReservedStreamCapacity().hashCode());
        hashCode = prime * hashCode + ((getMediaStreamType() == null) ? 0 : getMediaStreamType().hashCode());
        return hashCode;
    }

    @Override
    public MediaStreamSink clone() {
        try {
            return (MediaStreamSink) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.MediaStreamSinkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
