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
 * Configuration information specific to Grid layout, for server-side composition. See "Layouts" in <a
 * href="https://docs.aws.amazon.com/ivs/latest/RealTimeUserGuide/server-side-composition.html">Server-Side
 * Composition</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-realtime-2020-07-14/GridConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GridConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * This attribute name identifies the featured slot. A participant with this attribute set to <code>"true"</code>
     * (as a string value) in <a>ParticipantTokenConfiguration</a> is placed in the featured slot.
     * </p>
     */
    private String featuredParticipantAttribute;
    /**
     * <p>
     * Specifies the spacing between participant tiles in pixels. Default: <code>2</code>.
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
     * Sets the non-featured participant display mode. Default: <code>VIDEO</code>.
     * </p>
     */
    private String videoAspectRatio;
    /**
     * <p>
     * Defines how video fits within the participant tile. When not set, <code>videoFillMode</code> defaults to
     * <code>COVER</code> fill mode for participants in the grid and to <code>CONTAIN</code> fill mode for featured
     * participants.
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

    public GridConfiguration withFeaturedParticipantAttribute(String featuredParticipantAttribute) {
        setFeaturedParticipantAttribute(featuredParticipantAttribute);
        return this;
    }

    /**
     * <p>
     * Specifies the spacing between participant tiles in pixels. Default: <code>2</code>.
     * </p>
     * 
     * @param gridGap
     *        Specifies the spacing between participant tiles in pixels. Default: <code>2</code>.
     */

    public void setGridGap(Integer gridGap) {
        this.gridGap = gridGap;
    }

    /**
     * <p>
     * Specifies the spacing between participant tiles in pixels. Default: <code>2</code>.
     * </p>
     * 
     * @return Specifies the spacing between participant tiles in pixels. Default: <code>2</code>.
     */

    public Integer getGridGap() {
        return this.gridGap;
    }

    /**
     * <p>
     * Specifies the spacing between participant tiles in pixels. Default: <code>2</code>.
     * </p>
     * 
     * @param gridGap
     *        Specifies the spacing between participant tiles in pixels. Default: <code>2</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GridConfiguration withGridGap(Integer gridGap) {
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

    public GridConfiguration withOmitStoppedVideo(Boolean omitStoppedVideo) {
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
     * Sets the non-featured participant display mode. Default: <code>VIDEO</code>.
     * </p>
     * 
     * @param videoAspectRatio
     *        Sets the non-featured participant display mode. Default: <code>VIDEO</code>.
     * @see VideoAspectRatio
     */

    public void setVideoAspectRatio(String videoAspectRatio) {
        this.videoAspectRatio = videoAspectRatio;
    }

    /**
     * <p>
     * Sets the non-featured participant display mode. Default: <code>VIDEO</code>.
     * </p>
     * 
     * @return Sets the non-featured participant display mode. Default: <code>VIDEO</code>.
     * @see VideoAspectRatio
     */

    public String getVideoAspectRatio() {
        return this.videoAspectRatio;
    }

    /**
     * <p>
     * Sets the non-featured participant display mode. Default: <code>VIDEO</code>.
     * </p>
     * 
     * @param videoAspectRatio
     *        Sets the non-featured participant display mode. Default: <code>VIDEO</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoAspectRatio
     */

    public GridConfiguration withVideoAspectRatio(String videoAspectRatio) {
        setVideoAspectRatio(videoAspectRatio);
        return this;
    }

    /**
     * <p>
     * Sets the non-featured participant display mode. Default: <code>VIDEO</code>.
     * </p>
     * 
     * @param videoAspectRatio
     *        Sets the non-featured participant display mode. Default: <code>VIDEO</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoAspectRatio
     */

    public GridConfiguration withVideoAspectRatio(VideoAspectRatio videoAspectRatio) {
        this.videoAspectRatio = videoAspectRatio.toString();
        return this;
    }

    /**
     * <p>
     * Defines how video fits within the participant tile. When not set, <code>videoFillMode</code> defaults to
     * <code>COVER</code> fill mode for participants in the grid and to <code>CONTAIN</code> fill mode for featured
     * participants.
     * </p>
     * 
     * @param videoFillMode
     *        Defines how video fits within the participant tile. When not set, <code>videoFillMode</code> defaults to
     *        <code>COVER</code> fill mode for participants in the grid and to <code>CONTAIN</code> fill mode for
     *        featured participants.
     * @see VideoFillMode
     */

    public void setVideoFillMode(String videoFillMode) {
        this.videoFillMode = videoFillMode;
    }

    /**
     * <p>
     * Defines how video fits within the participant tile. When not set, <code>videoFillMode</code> defaults to
     * <code>COVER</code> fill mode for participants in the grid and to <code>CONTAIN</code> fill mode for featured
     * participants.
     * </p>
     * 
     * @return Defines how video fits within the participant tile. When not set, <code>videoFillMode</code> defaults to
     *         <code>COVER</code> fill mode for participants in the grid and to <code>CONTAIN</code> fill mode for
     *         featured participants.
     * @see VideoFillMode
     */

    public String getVideoFillMode() {
        return this.videoFillMode;
    }

    /**
     * <p>
     * Defines how video fits within the participant tile. When not set, <code>videoFillMode</code> defaults to
     * <code>COVER</code> fill mode for participants in the grid and to <code>CONTAIN</code> fill mode for featured
     * participants.
     * </p>
     * 
     * @param videoFillMode
     *        Defines how video fits within the participant tile. When not set, <code>videoFillMode</code> defaults to
     *        <code>COVER</code> fill mode for participants in the grid and to <code>CONTAIN</code> fill mode for
     *        featured participants.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoFillMode
     */

    public GridConfiguration withVideoFillMode(String videoFillMode) {
        setVideoFillMode(videoFillMode);
        return this;
    }

    /**
     * <p>
     * Defines how video fits within the participant tile. When not set, <code>videoFillMode</code> defaults to
     * <code>COVER</code> fill mode for participants in the grid and to <code>CONTAIN</code> fill mode for featured
     * participants.
     * </p>
     * 
     * @param videoFillMode
     *        Defines how video fits within the participant tile. When not set, <code>videoFillMode</code> defaults to
     *        <code>COVER</code> fill mode for participants in the grid and to <code>CONTAIN</code> fill mode for
     *        featured participants.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoFillMode
     */

    public GridConfiguration withVideoFillMode(VideoFillMode videoFillMode) {
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
        if (getVideoAspectRatio() != null)
            sb.append("VideoAspectRatio: ").append(getVideoAspectRatio()).append(",");
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

        if (obj instanceof GridConfiguration == false)
            return false;
        GridConfiguration other = (GridConfiguration) obj;
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
        if (other.getVideoAspectRatio() == null ^ this.getVideoAspectRatio() == null)
            return false;
        if (other.getVideoAspectRatio() != null && other.getVideoAspectRatio().equals(this.getVideoAspectRatio()) == false)
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
        hashCode = prime * hashCode + ((getVideoAspectRatio() == null) ? 0 : getVideoAspectRatio().hashCode());
        hashCode = prime * hashCode + ((getVideoFillMode() == null) ? 0 : getVideoFillMode().hashCode());
        return hashCode;
    }

    @Override
    public GridConfiguration clone() {
        try {
            return (GridConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivsrealtime.model.transform.GridConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
