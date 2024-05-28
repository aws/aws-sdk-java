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
package com.amazonaws.services.ivsrealtime.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information specific to Picture-in-Picture (PiP) layout, for <a
 * href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/server-side-composition.html">server-side
 * composition</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/PipConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PipConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This attribute name identifies the featured slot. A participant with this attribute set to <code>"true"</code>
     * (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured slot.
     * </p>
     */
    private String featuredParticipantAttribute;
    /**
     * <p>
     * Specifies the spacing between participant tiles in pixels. Default: <code>0</code>.
     * </p>
     */
    private Integer gridGap;
    /**
     * <p>
     * Determines whether to omit participants with stopped video in the composition. Default: <code>false</code>.
     * </p>
     */
    private Boolean omitStoppedVideo;
    /**
     * <p>
     * Defines PiP behavior when all participants have left. Default: <code>STATIC</code>.
     * </p>
     */
    private String pipBehavior;
    /**
     * <p>
     * Specifies the height of the PiP window in pixels. When this is not set explicitly, <code>pipHeight</code>’s value
     * will be based on the size of the composition and the aspect ratio of the participant’s video.
     * </p>
     */
    private Integer pipHeight;
    /**
     * <p>
     * Sets the PiP window’s offset position in pixels from the closest edges determined by <code>PipPosition</code>.
     * Default: <code>0</code>.
     * </p>
     */
    private Integer pipOffset;
    /**
     * <p>
     * Identifies the PiP slot. A participant with this attribute set to <code>"true"</code> (as a string value) in
     * <a>ParticipantTokenConfiguration</a> is placed in the PiP slot.
     * </p>
     */
    private String pipParticipantAttribute;
    /**
     * <p>
     * Determines the corner position of the PiP window. Default: <code>BOTTOM_RIGHT</code>.
     * </p>
     */
    private String pipPosition;
    /**
     * <p>
     * Specifies the width of the PiP window in pixels. When this is not set explicitly, <code>pipWidth</code>’s value
     * will be based on the size of the composition and the aspect ratio of the participant’s video.
     * </p>
     */
    private Integer pipWidth;
    /**
     * <p>
     * Defines how video fits within the participant tile. Default: <code>COVER</code>.
     * </p>
     */
    private String videoFillMode;

    /**
     * <p>
     * This attribute name identifies the featured slot. A participant with this attribute set to <code>"true"</code>
     * (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured slot.
     * </p>
     * 
     * @param featuredParticipantAttribute
     *        This attribute name identifies the featured slot. A participant with this attribute set to
     *        <code>"true"</code> (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured
     *        slot.
     */

    public void setFeaturedParticipantAttribute(String featuredParticipantAttribute) {
        this.featuredParticipantAttribute = featuredParticipantAttribute;
    }

    /**
     * <p>
     * This attribute name identifies the featured slot. A participant with this attribute set to <code>"true"</code>
     * (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured slot.
     * </p>
     * 
     * @return This attribute name identifies the featured slot. A participant with this attribute set to
     *         <code>"true"</code> (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured
     *         slot.
     */

    public String getFeaturedParticipantAttribute() {
        return this.featuredParticipantAttribute;
    }

    /**
     * <p>
     * This attribute name identifies the featured slot. A participant with this attribute set to <code>"true"</code>
     * (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured slot.
     * </p>
     * 
     * @param featuredParticipantAttribute
     *        This attribute name identifies the featured slot. A participant with this attribute set to
     *        <code>"true"</code> (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured
     *        slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipConfiguration withFeaturedParticipantAttribute(String featuredParticipantAttribute) {
        setFeaturedParticipantAttribute(featuredParticipantAttribute);
        return this;
    }

    /**
     * <p>
     * Specifies the spacing between participant tiles in pixels. Default: <code>0</code>.
     * </p>
     * 
     * @param gridGap
     *        Specifies the spacing between participant tiles in pixels. Default: <code>0</code>.
     */

    public void setGridGap(Integer gridGap) {
        this.gridGap = gridGap;
    }

    /**
     * <p>
     * Specifies the spacing between participant tiles in pixels. Default: <code>0</code>.
     * </p>
     * 
     * @return Specifies the spacing between participant tiles in pixels. Default: <code>0</code>.
     */

    public Integer getGridGap() {
        return this.gridGap;
    }

    /**
     * <p>
     * Specifies the spacing between participant tiles in pixels. Default: <code>0</code>.
     * </p>
     * 
     * @param gridGap
     *        Specifies the spacing between participant tiles in pixels. Default: <code>0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipConfiguration withGridGap(Integer gridGap) {
        setGridGap(gridGap);
        return this;
    }

    /**
     * <p>
     * Determines whether to omit participants with stopped video in the composition. Default: <code>false</code>.
     * </p>
     * 
     * @param omitStoppedVideo
     *        Determines whether to omit participants with stopped video in the composition. Default: <code>false</code>
     *        .
     */

    public void setOmitStoppedVideo(Boolean omitStoppedVideo) {
        this.omitStoppedVideo = omitStoppedVideo;
    }

    /**
     * <p>
     * Determines whether to omit participants with stopped video in the composition. Default: <code>false</code>.
     * </p>
     * 
     * @return Determines whether to omit participants with stopped video in the composition. Default:
     *         <code>false</code>.
     */

    public Boolean getOmitStoppedVideo() {
        return this.omitStoppedVideo;
    }

    /**
     * <p>
     * Determines whether to omit participants with stopped video in the composition. Default: <code>false</code>.
     * </p>
     * 
     * @param omitStoppedVideo
     *        Determines whether to omit participants with stopped video in the composition. Default: <code>false</code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipConfiguration withOmitStoppedVideo(Boolean omitStoppedVideo) {
        setOmitStoppedVideo(omitStoppedVideo);
        return this;
    }

    /**
     * <p>
     * Determines whether to omit participants with stopped video in the composition. Default: <code>false</code>.
     * </p>
     * 
     * @return Determines whether to omit participants with stopped video in the composition. Default:
     *         <code>false</code>.
     */

    public Boolean isOmitStoppedVideo() {
        return this.omitStoppedVideo;
    }

    /**
     * <p>
     * Defines PiP behavior when all participants have left. Default: <code>STATIC</code>.
     * </p>
     * 
     * @param pipBehavior
     *        Defines PiP behavior when all participants have left. Default: <code>STATIC</code>.
     * @see PipBehavior
     */

    public void setPipBehavior(String pipBehavior) {
        this.pipBehavior = pipBehavior;
    }

    /**
     * <p>
     * Defines PiP behavior when all participants have left. Default: <code>STATIC</code>.
     * </p>
     * 
     * @return Defines PiP behavior when all participants have left. Default: <code>STATIC</code>.
     * @see PipBehavior
     */

    public String getPipBehavior() {
        return this.pipBehavior;
    }

    /**
     * <p>
     * Defines PiP behavior when all participants have left. Default: <code>STATIC</code>.
     * </p>
     * 
     * @param pipBehavior
     *        Defines PiP behavior when all participants have left. Default: <code>STATIC</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipBehavior
     */

    public PipConfiguration withPipBehavior(String pipBehavior) {
        setPipBehavior(pipBehavior);
        return this;
    }

    /**
     * <p>
     * Defines PiP behavior when all participants have left. Default: <code>STATIC</code>.
     * </p>
     * 
     * @param pipBehavior
     *        Defines PiP behavior when all participants have left. Default: <code>STATIC</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipBehavior
     */

    public PipConfiguration withPipBehavior(PipBehavior pipBehavior) {
        this.pipBehavior = pipBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the height of the PiP window in pixels. When this is not set explicitly, <code>pipHeight</code>’s value
     * will be based on the size of the composition and the aspect ratio of the participant’s video.
     * </p>
     * 
     * @param pipHeight
     *        Specifies the height of the PiP window in pixels. When this is not set explicitly, <code>pipHeight</code>
     *        ’s value will be based on the size of the composition and the aspect ratio of the participant’s video.
     */

    public void setPipHeight(Integer pipHeight) {
        this.pipHeight = pipHeight;
    }

    /**
     * <p>
     * Specifies the height of the PiP window in pixels. When this is not set explicitly, <code>pipHeight</code>’s value
     * will be based on the size of the composition and the aspect ratio of the participant’s video.
     * </p>
     * 
     * @return Specifies the height of the PiP window in pixels. When this is not set explicitly, <code>pipHeight</code>
     *         ’s value will be based on the size of the composition and the aspect ratio of the participant’s video.
     */

    public Integer getPipHeight() {
        return this.pipHeight;
    }

    /**
     * <p>
     * Specifies the height of the PiP window in pixels. When this is not set explicitly, <code>pipHeight</code>’s value
     * will be based on the size of the composition and the aspect ratio of the participant’s video.
     * </p>
     * 
     * @param pipHeight
     *        Specifies the height of the PiP window in pixels. When this is not set explicitly, <code>pipHeight</code>
     *        ’s value will be based on the size of the composition and the aspect ratio of the participant’s video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipConfiguration withPipHeight(Integer pipHeight) {
        setPipHeight(pipHeight);
        return this;
    }

    /**
     * <p>
     * Sets the PiP window’s offset position in pixels from the closest edges determined by <code>PipPosition</code>.
     * Default: <code>0</code>.
     * </p>
     * 
     * @param pipOffset
     *        Sets the PiP window’s offset position in pixels from the closest edges determined by
     *        <code>PipPosition</code>. Default: <code>0</code>.
     */

    public void setPipOffset(Integer pipOffset) {
        this.pipOffset = pipOffset;
    }

    /**
     * <p>
     * Sets the PiP window’s offset position in pixels from the closest edges determined by <code>PipPosition</code>.
     * Default: <code>0</code>.
     * </p>
     * 
     * @return Sets the PiP window’s offset position in pixels from the closest edges determined by
     *         <code>PipPosition</code>. Default: <code>0</code>.
     */

    public Integer getPipOffset() {
        return this.pipOffset;
    }

    /**
     * <p>
     * Sets the PiP window’s offset position in pixels from the closest edges determined by <code>PipPosition</code>.
     * Default: <code>0</code>.
     * </p>
     * 
     * @param pipOffset
     *        Sets the PiP window’s offset position in pixels from the closest edges determined by
     *        <code>PipPosition</code>. Default: <code>0</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipConfiguration withPipOffset(Integer pipOffset) {
        setPipOffset(pipOffset);
        return this;
    }

    /**
     * <p>
     * Identifies the PiP slot. A participant with this attribute set to <code>"true"</code> (as a string value) in
     * <a>ParticipantTokenConfiguration</a> is placed in the PiP slot.
     * </p>
     * 
     * @param pipParticipantAttribute
     *        Identifies the PiP slot. A participant with this attribute set to <code>"true"</code> (as a string value)
     *        in <a>ParticipantTokenConfiguration</a> is placed in the PiP slot.
     */

    public void setPipParticipantAttribute(String pipParticipantAttribute) {
        this.pipParticipantAttribute = pipParticipantAttribute;
    }

    /**
     * <p>
     * Identifies the PiP slot. A participant with this attribute set to <code>"true"</code> (as a string value) in
     * <a>ParticipantTokenConfiguration</a> is placed in the PiP slot.
     * </p>
     * 
     * @return Identifies the PiP slot. A participant with this attribute set to <code>"true"</code> (as a string value)
     *         in <a>ParticipantTokenConfiguration</a> is placed in the PiP slot.
     */

    public String getPipParticipantAttribute() {
        return this.pipParticipantAttribute;
    }

    /**
     * <p>
     * Identifies the PiP slot. A participant with this attribute set to <code>"true"</code> (as a string value) in
     * <a>ParticipantTokenConfiguration</a> is placed in the PiP slot.
     * </p>
     * 
     * @param pipParticipantAttribute
     *        Identifies the PiP slot. A participant with this attribute set to <code>"true"</code> (as a string value)
     *        in <a>ParticipantTokenConfiguration</a> is placed in the PiP slot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipConfiguration withPipParticipantAttribute(String pipParticipantAttribute) {
        setPipParticipantAttribute(pipParticipantAttribute);
        return this;
    }

    /**
     * <p>
     * Determines the corner position of the PiP window. Default: <code>BOTTOM_RIGHT</code>.
     * </p>
     * 
     * @param pipPosition
     *        Determines the corner position of the PiP window. Default: <code>BOTTOM_RIGHT</code>.
     * @see PipPosition
     */

    public void setPipPosition(String pipPosition) {
        this.pipPosition = pipPosition;
    }

    /**
     * <p>
     * Determines the corner position of the PiP window. Default: <code>BOTTOM_RIGHT</code>.
     * </p>
     * 
     * @return Determines the corner position of the PiP window. Default: <code>BOTTOM_RIGHT</code>.
     * @see PipPosition
     */

    public String getPipPosition() {
        return this.pipPosition;
    }

    /**
     * <p>
     * Determines the corner position of the PiP window. Default: <code>BOTTOM_RIGHT</code>.
     * </p>
     * 
     * @param pipPosition
     *        Determines the corner position of the PiP window. Default: <code>BOTTOM_RIGHT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipPosition
     */

    public PipConfiguration withPipPosition(String pipPosition) {
        setPipPosition(pipPosition);
        return this;
    }

    /**
     * <p>
     * Determines the corner position of the PiP window. Default: <code>BOTTOM_RIGHT</code>.
     * </p>
     * 
     * @param pipPosition
     *        Determines the corner position of the PiP window. Default: <code>BOTTOM_RIGHT</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PipPosition
     */

    public PipConfiguration withPipPosition(PipPosition pipPosition) {
        this.pipPosition = pipPosition.toString();
        return this;
    }

    /**
     * <p>
     * Specifies the width of the PiP window in pixels. When this is not set explicitly, <code>pipWidth</code>’s value
     * will be based on the size of the composition and the aspect ratio of the participant’s video.
     * </p>
     * 
     * @param pipWidth
     *        Specifies the width of the PiP window in pixels. When this is not set explicitly, <code>pipWidth</code>’s
     *        value will be based on the size of the composition and the aspect ratio of the participant’s video.
     */

    public void setPipWidth(Integer pipWidth) {
        this.pipWidth = pipWidth;
    }

    /**
     * <p>
     * Specifies the width of the PiP window in pixels. When this is not set explicitly, <code>pipWidth</code>’s value
     * will be based on the size of the composition and the aspect ratio of the participant’s video.
     * </p>
     * 
     * @return Specifies the width of the PiP window in pixels. When this is not set explicitly, <code>pipWidth</code>’s
     *         value will be based on the size of the composition and the aspect ratio of the participant’s video.
     */

    public Integer getPipWidth() {
        return this.pipWidth;
    }

    /**
     * <p>
     * Specifies the width of the PiP window in pixels. When this is not set explicitly, <code>pipWidth</code>’s value
     * will be based on the size of the composition and the aspect ratio of the participant’s video.
     * </p>
     * 
     * @param pipWidth
     *        Specifies the width of the PiP window in pixels. When this is not set explicitly, <code>pipWidth</code>’s
     *        value will be based on the size of the composition and the aspect ratio of the participant’s video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PipConfiguration withPipWidth(Integer pipWidth) {
        setPipWidth(pipWidth);
        return this;
    }

    /**
     * <p>
     * Defines how video fits within the participant tile. Default: <code>COVER</code>.
     * </p>
     * 
     * @param videoFillMode
     *        Defines how video fits within the participant tile. Default: <code>COVER</code>.
     * @see VideoFillMode
     */

    public void setVideoFillMode(String videoFillMode) {
        this.videoFillMode = videoFillMode;
    }

    /**
     * <p>
     * Defines how video fits within the participant tile. Default: <code>COVER</code>.
     * </p>
     * 
     * @return Defines how video fits within the participant tile. Default: <code>COVER</code>.
     * @see VideoFillMode
     */

    public String getVideoFillMode() {
        return this.videoFillMode;
    }

    /**
     * <p>
     * Defines how video fits within the participant tile. Default: <code>COVER</code>.
     * </p>
     * 
     * @param videoFillMode
     *        Defines how video fits within the participant tile. Default: <code>COVER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoFillMode
     */

    public PipConfiguration withVideoFillMode(String videoFillMode) {
        setVideoFillMode(videoFillMode);
        return this;
    }

    /**
     * <p>
     * Defines how video fits within the participant tile. Default: <code>COVER</code>.
     * </p>
     * 
     * @param videoFillMode
     *        Defines how video fits within the participant tile. Default: <code>COVER</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoFillMode
     */

    public PipConfiguration withVideoFillMode(VideoFillMode videoFillMode) {
        this.videoFillMode = videoFillMode.toString();
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
        if (getFeaturedParticipantAttribute() != null)
            sb.append("FeaturedParticipantAttribute: ").append(getFeaturedParticipantAttribute()).append(",");
        if (getGridGap() != null)
            sb.append("GridGap: ").append(getGridGap()).append(",");
        if (getOmitStoppedVideo() != null)
            sb.append("OmitStoppedVideo: ").append(getOmitStoppedVideo()).append(",");
        if (getPipBehavior() != null)
            sb.append("PipBehavior: ").append(getPipBehavior()).append(",");
        if (getPipHeight() != null)
            sb.append("PipHeight: ").append(getPipHeight()).append(",");
        if (getPipOffset() != null)
            sb.append("PipOffset: ").append(getPipOffset()).append(",");
        if (getPipParticipantAttribute() != null)
            sb.append("PipParticipantAttribute: ").append(getPipParticipantAttribute()).append(",");
        if (getPipPosition() != null)
            sb.append("PipPosition: ").append(getPipPosition()).append(",");
        if (getPipWidth() != null)
            sb.append("PipWidth: ").append(getPipWidth()).append(",");
        if (getVideoFillMode() != null)
            sb.append("VideoFillMode: ").append(getVideoFillMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PipConfiguration == false)
            return false;
        PipConfiguration other = (PipConfiguration) obj;
        if (other.getFeaturedParticipantAttribute() == null ^ this.getFeaturedParticipantAttribute() == null)
            return false;
        if (other.getFeaturedParticipantAttribute() != null && other.getFeaturedParticipantAttribute().equals(this.getFeaturedParticipantAttribute()) == false)
            return false;
        if (other.getGridGap() == null ^ this.getGridGap() == null)
            return false;
        if (other.getGridGap() != null && other.getGridGap().equals(this.getGridGap()) == false)
            return false;
        if (other.getOmitStoppedVideo() == null ^ this.getOmitStoppedVideo() == null)
            return false;
        if (other.getOmitStoppedVideo() != null && other.getOmitStoppedVideo().equals(this.getOmitStoppedVideo()) == false)
            return false;
        if (other.getPipBehavior() == null ^ this.getPipBehavior() == null)
            return false;
        if (other.getPipBehavior() != null && other.getPipBehavior().equals(this.getPipBehavior()) == false)
            return false;
        if (other.getPipHeight() == null ^ this.getPipHeight() == null)
            return false;
        if (other.getPipHeight() != null && other.getPipHeight().equals(this.getPipHeight()) == false)
            return false;
        if (other.getPipOffset() == null ^ this.getPipOffset() == null)
            return false;
        if (other.getPipOffset() != null && other.getPipOffset().equals(this.getPipOffset()) == false)
            return false;
        if (other.getPipParticipantAttribute() == null ^ this.getPipParticipantAttribute() == null)
            return false;
        if (other.getPipParticipantAttribute() != null && other.getPipParticipantAttribute().equals(this.getPipParticipantAttribute()) == false)
            return false;
        if (other.getPipPosition() == null ^ this.getPipPosition() == null)
            return false;
        if (other.getPipPosition() != null && other.getPipPosition().equals(this.getPipPosition()) == false)
            return false;
        if (other.getPipWidth() == null ^ this.getPipWidth() == null)
            return false;
        if (other.getPipWidth() != null && other.getPipWidth().equals(this.getPipWidth()) == false)
            return false;
        if (other.getVideoFillMode() == null ^ this.getVideoFillMode() == null)
            return false;
        if (other.getVideoFillMode() != null && other.getVideoFillMode().equals(this.getVideoFillMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFeaturedParticipantAttribute() == null) ? 0 : getFeaturedParticipantAttribute().hashCode());
        hashCode = prime * hashCode + ((getGridGap() == null) ? 0 : getGridGap().hashCode());
        hashCode = prime * hashCode + ((getOmitStoppedVideo() == null) ? 0 : getOmitStoppedVideo().hashCode());
        hashCode = prime * hashCode + ((getPipBehavior() == null) ? 0 : getPipBehavior().hashCode());
        hashCode = prime * hashCode + ((getPipHeight() == null) ? 0 : getPipHeight().hashCode());
        hashCode = prime * hashCode + ((getPipOffset() == null) ? 0 : getPipOffset().hashCode());
        hashCode = prime * hashCode + ((getPipParticipantAttribute() == null) ? 0 : getPipParticipantAttribute().hashCode());
        hashCode = prime * hashCode + ((getPipPosition() == null) ? 0 : getPipPosition().hashCode());
        hashCode = prime * hashCode + ((getPipWidth() == null) ? 0 : getPipWidth().hashCode());
        hashCode = prime * hashCode + ((getVideoFillMode() == null) ? 0 : getVideoFillMode().hashCode());
        return hashCode;
    }

    @Override
    public PipConfiguration clone() {
        try {
            return (PipConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.PipConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
