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
 * Hls Input Settings
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/HlsInputSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsInputSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * When specified the HLS stream with the m3u8 BANDWIDTH that most closely matches this value will be chosen,
     * otherwise the highest bandwidth stream in the m3u8 will be chosen. The bitrate is specified in bits per second,
     * as in an HLS manifest.
     */
    private Integer bandwidth;
    /**
     * When specified, reading of the HLS input will begin this many buffer segments from the end (most recently written
     * segment). When not specified, the HLS input will begin with the first segment specified in the m3u8.
     */
    private Integer bufferSegments;
    /**
     * The number of consecutive times that attempts to read a manifest or segment must fail before the input is
     * considered unavailable.
     */
    private Integer retries;
    /** The number of seconds between retries when an attempt to read a manifest or segment fails. */
    private Integer retryInterval;

    /**
     * When specified the HLS stream with the m3u8 BANDWIDTH that most closely matches this value will be chosen,
     * otherwise the highest bandwidth stream in the m3u8 will be chosen. The bitrate is specified in bits per second,
     * as in an HLS manifest.
     * 
     * @param bandwidth
     *        When specified the HLS stream with the m3u8 BANDWIDTH that most closely matches this value will be chosen,
     *        otherwise the highest bandwidth stream in the m3u8 will be chosen. The bitrate is specified in bits per
     *        second, as in an HLS manifest.
     */

    public void setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
    }

    /**
     * When specified the HLS stream with the m3u8 BANDWIDTH that most closely matches this value will be chosen,
     * otherwise the highest bandwidth stream in the m3u8 will be chosen. The bitrate is specified in bits per second,
     * as in an HLS manifest.
     * 
     * @return When specified the HLS stream with the m3u8 BANDWIDTH that most closely matches this value will be
     *         chosen, otherwise the highest bandwidth stream in the m3u8 will be chosen. The bitrate is specified in
     *         bits per second, as in an HLS manifest.
     */

    public Integer getBandwidth() {
        return this.bandwidth;
    }

    /**
     * When specified the HLS stream with the m3u8 BANDWIDTH that most closely matches this value will be chosen,
     * otherwise the highest bandwidth stream in the m3u8 will be chosen. The bitrate is specified in bits per second,
     * as in an HLS manifest.
     * 
     * @param bandwidth
     *        When specified the HLS stream with the m3u8 BANDWIDTH that most closely matches this value will be chosen,
     *        otherwise the highest bandwidth stream in the m3u8 will be chosen. The bitrate is specified in bits per
     *        second, as in an HLS manifest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsInputSettings withBandwidth(Integer bandwidth) {
        setBandwidth(bandwidth);
        return this;
    }

    /**
     * When specified, reading of the HLS input will begin this many buffer segments from the end (most recently written
     * segment). When not specified, the HLS input will begin with the first segment specified in the m3u8.
     * 
     * @param bufferSegments
     *        When specified, reading of the HLS input will begin this many buffer segments from the end (most recently
     *        written segment). When not specified, the HLS input will begin with the first segment specified in the
     *        m3u8.
     */

    public void setBufferSegments(Integer bufferSegments) {
        this.bufferSegments = bufferSegments;
    }

    /**
     * When specified, reading of the HLS input will begin this many buffer segments from the end (most recently written
     * segment). When not specified, the HLS input will begin with the first segment specified in the m3u8.
     * 
     * @return When specified, reading of the HLS input will begin this many buffer segments from the end (most recently
     *         written segment). When not specified, the HLS input will begin with the first segment specified in the
     *         m3u8.
     */

    public Integer getBufferSegments() {
        return this.bufferSegments;
    }

    /**
     * When specified, reading of the HLS input will begin this many buffer segments from the end (most recently written
     * segment). When not specified, the HLS input will begin with the first segment specified in the m3u8.
     * 
     * @param bufferSegments
     *        When specified, reading of the HLS input will begin this many buffer segments from the end (most recently
     *        written segment). When not specified, the HLS input will begin with the first segment specified in the
     *        m3u8.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsInputSettings withBufferSegments(Integer bufferSegments) {
        setBufferSegments(bufferSegments);
        return this;
    }

    /**
     * The number of consecutive times that attempts to read a manifest or segment must fail before the input is
     * considered unavailable.
     * 
     * @param retries
     *        The number of consecutive times that attempts to read a manifest or segment must fail before the input is
     *        considered unavailable.
     */

    public void setRetries(Integer retries) {
        this.retries = retries;
    }

    /**
     * The number of consecutive times that attempts to read a manifest or segment must fail before the input is
     * considered unavailable.
     * 
     * @return The number of consecutive times that attempts to read a manifest or segment must fail before the input is
     *         considered unavailable.
     */

    public Integer getRetries() {
        return this.retries;
    }

    /**
     * The number of consecutive times that attempts to read a manifest or segment must fail before the input is
     * considered unavailable.
     * 
     * @param retries
     *        The number of consecutive times that attempts to read a manifest or segment must fail before the input is
     *        considered unavailable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsInputSettings withRetries(Integer retries) {
        setRetries(retries);
        return this;
    }

    /**
     * The number of seconds between retries when an attempt to read a manifest or segment fails.
     * 
     * @param retryInterval
     *        The number of seconds between retries when an attempt to read a manifest or segment fails.
     */

    public void setRetryInterval(Integer retryInterval) {
        this.retryInterval = retryInterval;
    }

    /**
     * The number of seconds between retries when an attempt to read a manifest or segment fails.
     * 
     * @return The number of seconds between retries when an attempt to read a manifest or segment fails.
     */

    public Integer getRetryInterval() {
        return this.retryInterval;
    }

    /**
     * The number of seconds between retries when an attempt to read a manifest or segment fails.
     * 
     * @param retryInterval
     *        The number of seconds between retries when an attempt to read a manifest or segment fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsInputSettings withRetryInterval(Integer retryInterval) {
        setRetryInterval(retryInterval);
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
        if (getBandwidth() != null)
            sb.append("Bandwidth: ").append(getBandwidth()).append(",");
        if (getBufferSegments() != null)
            sb.append("BufferSegments: ").append(getBufferSegments()).append(",");
        if (getRetries() != null)
            sb.append("Retries: ").append(getRetries()).append(",");
        if (getRetryInterval() != null)
            sb.append("RetryInterval: ").append(getRetryInterval());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsInputSettings == false)
            return false;
        HlsInputSettings other = (HlsInputSettings) obj;
        if (other.getBandwidth() == null ^ this.getBandwidth() == null)
            return false;
        if (other.getBandwidth() != null && other.getBandwidth().equals(this.getBandwidth()) == false)
            return false;
        if (other.getBufferSegments() == null ^ this.getBufferSegments() == null)
            return false;
        if (other.getBufferSegments() != null && other.getBufferSegments().equals(this.getBufferSegments()) == false)
            return false;
        if (other.getRetries() == null ^ this.getRetries() == null)
            return false;
        if (other.getRetries() != null && other.getRetries().equals(this.getRetries()) == false)
            return false;
        if (other.getRetryInterval() == null ^ this.getRetryInterval() == null)
            return false;
        if (other.getRetryInterval() != null && other.getRetryInterval().equals(this.getRetryInterval()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBandwidth() == null) ? 0 : getBandwidth().hashCode());
        hashCode = prime * hashCode + ((getBufferSegments() == null) ? 0 : getBufferSegments().hashCode());
        hashCode = prime * hashCode + ((getRetries() == null) ? 0 : getRetries().hashCode());
        hashCode = prime * hashCode + ((getRetryInterval() == null) ? 0 : getRetryInterval().hashCode());
        return hashCode;
    }

    @Override
    public HlsInputSettings clone() {
        try {
            return (HlsInputSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.HlsInputSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
