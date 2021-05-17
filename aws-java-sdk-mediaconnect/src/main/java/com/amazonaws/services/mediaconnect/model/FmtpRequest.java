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
 * The settings that you want to use to define the media stream.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconnect-2018-11-14/FmtpRequest" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FmtpRequest implements Serializable, Cloneable, StructuredPojo {

    /** The format of the audio channel. */
    private String channelOrder;
    /** The format that is used for the representation of color. */
    private String colorimetry;
    /**
     * The frame rate for the video stream, in frames/second. For example: 60000/1001. If you specify a whole number,
     * MediaConnect uses a ratio of N/1. For example, if you specify 60, MediaConnect uses 60/1 as the exactFramerate.
     */
    private String exactFramerate;
    /** The pixel aspect ratio (PAR) of the video. */
    private String par;
    /** The encoding range of the video. */
    private String range;
    /** The type of compression that was used to smooth the video’s appearance. */
    private String scanMode;
    /** The transfer characteristic system (TCS) that is used in the video. */
    private String tcs;

    /**
     * The format of the audio channel.
     * 
     * @param channelOrder
     *        The format of the audio channel.
     */

    public void setChannelOrder(String channelOrder) {
        this.channelOrder = channelOrder;
    }

    /**
     * The format of the audio channel.
     * 
     * @return The format of the audio channel.
     */

    public String getChannelOrder() {
        return this.channelOrder;
    }

    /**
     * The format of the audio channel.
     * 
     * @param channelOrder
     *        The format of the audio channel.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FmtpRequest withChannelOrder(String channelOrder) {
        setChannelOrder(channelOrder);
        return this;
    }

    /**
     * The format that is used for the representation of color.
     * 
     * @param colorimetry
     *        The format that is used for the representation of color.
     * @see Colorimetry
     */

    public void setColorimetry(String colorimetry) {
        this.colorimetry = colorimetry;
    }

    /**
     * The format that is used for the representation of color.
     * 
     * @return The format that is used for the representation of color.
     * @see Colorimetry
     */

    public String getColorimetry() {
        return this.colorimetry;
    }

    /**
     * The format that is used for the representation of color.
     * 
     * @param colorimetry
     *        The format that is used for the representation of color.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Colorimetry
     */

    public FmtpRequest withColorimetry(String colorimetry) {
        setColorimetry(colorimetry);
        return this;
    }

    /**
     * The format that is used for the representation of color.
     * 
     * @param colorimetry
     *        The format that is used for the representation of color.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Colorimetry
     */

    public FmtpRequest withColorimetry(Colorimetry colorimetry) {
        this.colorimetry = colorimetry.toString();
        return this;
    }

    /**
     * The frame rate for the video stream, in frames/second. For example: 60000/1001. If you specify a whole number,
     * MediaConnect uses a ratio of N/1. For example, if you specify 60, MediaConnect uses 60/1 as the exactFramerate.
     * 
     * @param exactFramerate
     *        The frame rate for the video stream, in frames/second. For example: 60000/1001. If you specify a whole
     *        number, MediaConnect uses a ratio of N/1. For example, if you specify 60, MediaConnect uses 60/1 as the
     *        exactFramerate.
     */

    public void setExactFramerate(String exactFramerate) {
        this.exactFramerate = exactFramerate;
    }

    /**
     * The frame rate for the video stream, in frames/second. For example: 60000/1001. If you specify a whole number,
     * MediaConnect uses a ratio of N/1. For example, if you specify 60, MediaConnect uses 60/1 as the exactFramerate.
     * 
     * @return The frame rate for the video stream, in frames/second. For example: 60000/1001. If you specify a whole
     *         number, MediaConnect uses a ratio of N/1. For example, if you specify 60, MediaConnect uses 60/1 as the
     *         exactFramerate.
     */

    public String getExactFramerate() {
        return this.exactFramerate;
    }

    /**
     * The frame rate for the video stream, in frames/second. For example: 60000/1001. If you specify a whole number,
     * MediaConnect uses a ratio of N/1. For example, if you specify 60, MediaConnect uses 60/1 as the exactFramerate.
     * 
     * @param exactFramerate
     *        The frame rate for the video stream, in frames/second. For example: 60000/1001. If you specify a whole
     *        number, MediaConnect uses a ratio of N/1. For example, if you specify 60, MediaConnect uses 60/1 as the
     *        exactFramerate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FmtpRequest withExactFramerate(String exactFramerate) {
        setExactFramerate(exactFramerate);
        return this;
    }

    /**
     * The pixel aspect ratio (PAR) of the video.
     * 
     * @param par
     *        The pixel aspect ratio (PAR) of the video.
     */

    public void setPar(String par) {
        this.par = par;
    }

    /**
     * The pixel aspect ratio (PAR) of the video.
     * 
     * @return The pixel aspect ratio (PAR) of the video.
     */

    public String getPar() {
        return this.par;
    }

    /**
     * The pixel aspect ratio (PAR) of the video.
     * 
     * @param par
     *        The pixel aspect ratio (PAR) of the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FmtpRequest withPar(String par) {
        setPar(par);
        return this;
    }

    /**
     * The encoding range of the video.
     * 
     * @param range
     *        The encoding range of the video.
     * @see Range
     */

    public void setRange(String range) {
        this.range = range;
    }

    /**
     * The encoding range of the video.
     * 
     * @return The encoding range of the video.
     * @see Range
     */

    public String getRange() {
        return this.range;
    }

    /**
     * The encoding range of the video.
     * 
     * @param range
     *        The encoding range of the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Range
     */

    public FmtpRequest withRange(String range) {
        setRange(range);
        return this;
    }

    /**
     * The encoding range of the video.
     * 
     * @param range
     *        The encoding range of the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Range
     */

    public FmtpRequest withRange(Range range) {
        this.range = range.toString();
        return this;
    }

    /**
     * The type of compression that was used to smooth the video’s appearance.
     * 
     * @param scanMode
     *        The type of compression that was used to smooth the video’s appearance.
     * @see ScanMode
     */

    public void setScanMode(String scanMode) {
        this.scanMode = scanMode;
    }

    /**
     * The type of compression that was used to smooth the video’s appearance.
     * 
     * @return The type of compression that was used to smooth the video’s appearance.
     * @see ScanMode
     */

    public String getScanMode() {
        return this.scanMode;
    }

    /**
     * The type of compression that was used to smooth the video’s appearance.
     * 
     * @param scanMode
     *        The type of compression that was used to smooth the video’s appearance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanMode
     */

    public FmtpRequest withScanMode(String scanMode) {
        setScanMode(scanMode);
        return this;
    }

    /**
     * The type of compression that was used to smooth the video’s appearance.
     * 
     * @param scanMode
     *        The type of compression that was used to smooth the video’s appearance.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScanMode
     */

    public FmtpRequest withScanMode(ScanMode scanMode) {
        this.scanMode = scanMode.toString();
        return this;
    }

    /**
     * The transfer characteristic system (TCS) that is used in the video.
     * 
     * @param tcs
     *        The transfer characteristic system (TCS) that is used in the video.
     * @see Tcs
     */

    public void setTcs(String tcs) {
        this.tcs = tcs;
    }

    /**
     * The transfer characteristic system (TCS) that is used in the video.
     * 
     * @return The transfer characteristic system (TCS) that is used in the video.
     * @see Tcs
     */

    public String getTcs() {
        return this.tcs;
    }

    /**
     * The transfer characteristic system (TCS) that is used in the video.
     * 
     * @param tcs
     *        The transfer characteristic system (TCS) that is used in the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tcs
     */

    public FmtpRequest withTcs(String tcs) {
        setTcs(tcs);
        return this;
    }

    /**
     * The transfer characteristic system (TCS) that is used in the video.
     * 
     * @param tcs
     *        The transfer characteristic system (TCS) that is used in the video.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Tcs
     */

    public FmtpRequest withTcs(Tcs tcs) {
        this.tcs = tcs.toString();
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
        if (getChannelOrder() != null)
            sb.append("ChannelOrder: ").append(getChannelOrder()).append(",");
        if (getColorimetry() != null)
            sb.append("Colorimetry: ").append(getColorimetry()).append(",");
        if (getExactFramerate() != null)
            sb.append("ExactFramerate: ").append(getExactFramerate()).append(",");
        if (getPar() != null)
            sb.append("Par: ").append(getPar()).append(",");
        if (getRange() != null)
            sb.append("Range: ").append(getRange()).append(",");
        if (getScanMode() != null)
            sb.append("ScanMode: ").append(getScanMode()).append(",");
        if (getTcs() != null)
            sb.append("Tcs: ").append(getTcs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FmtpRequest == false)
            return false;
        FmtpRequest other = (FmtpRequest) obj;
        if (other.getChannelOrder() == null ^ this.getChannelOrder() == null)
            return false;
        if (other.getChannelOrder() != null && other.getChannelOrder().equals(this.getChannelOrder()) == false)
            return false;
        if (other.getColorimetry() == null ^ this.getColorimetry() == null)
            return false;
        if (other.getColorimetry() != null && other.getColorimetry().equals(this.getColorimetry()) == false)
            return false;
        if (other.getExactFramerate() == null ^ this.getExactFramerate() == null)
            return false;
        if (other.getExactFramerate() != null && other.getExactFramerate().equals(this.getExactFramerate()) == false)
            return false;
        if (other.getPar() == null ^ this.getPar() == null)
            return false;
        if (other.getPar() != null && other.getPar().equals(this.getPar()) == false)
            return false;
        if (other.getRange() == null ^ this.getRange() == null)
            return false;
        if (other.getRange() != null && other.getRange().equals(this.getRange()) == false)
            return false;
        if (other.getScanMode() == null ^ this.getScanMode() == null)
            return false;
        if (other.getScanMode() != null && other.getScanMode().equals(this.getScanMode()) == false)
            return false;
        if (other.getTcs() == null ^ this.getTcs() == null)
            return false;
        if (other.getTcs() != null && other.getTcs().equals(this.getTcs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelOrder() == null) ? 0 : getChannelOrder().hashCode());
        hashCode = prime * hashCode + ((getColorimetry() == null) ? 0 : getColorimetry().hashCode());
        hashCode = prime * hashCode + ((getExactFramerate() == null) ? 0 : getExactFramerate().hashCode());
        hashCode = prime * hashCode + ((getPar() == null) ? 0 : getPar().hashCode());
        hashCode = prime * hashCode + ((getRange() == null) ? 0 : getRange().hashCode());
        hashCode = prime * hashCode + ((getScanMode() == null) ? 0 : getScanMode().hashCode());
        hashCode = prime * hashCode + ((getTcs() == null) ? 0 : getTcs().hashCode());
        return hashCode;
    }

    @Override
    public FmtpRequest clone() {
        try {
            return (FmtpRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconnect.model.transform.FmtpRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
