/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Video settings for this stream.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/VideoDescription" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class VideoDescription implements Serializable, Cloneable, StructuredPojo {

    /** Video codec settings. */
    private VideoCodecSettings codecSettings;
    /**
     * Output video height (in pixels). Leave blank to use source video height. If left blank, width must also be
     * unspecified.
     */
    private Integer height;
    /**
     * The name of this VideoDescription. Outputs will use this name to uniquely identify this Description. Description
     * names should be unique within this Live Event.
     */
    private String name;
    /**
     * Indicates how to respond to the AFD values in the input stream. Setting to "respond" causes input video to be
     * clipped, depending on AFD value, input display aspect ratio and output display aspect ratio.
     */
    private String respondToAfd;
    /**
     * When set to "stretchToOutput", automatically configures the output position to stretch the video to the specified
     * output resolution. This option will override any position value.
     */
    private String scalingBehavior;
    /**
     * Changes the width of the anti-alias filter kernel used for scaling. Only applies if scaling is being performed
     * and antiAlias is set to true. 0 is the softest setting, 100 the sharpest, and 50 recommended for most content.
     */
    private Integer sharpness;
    /**
     * Output video width (in pixels). Leave out to use source video width. If left out, height must also be left out.
     * Display aspect ratio is always preserved by letterboxing or pillarboxing when necessary.
     */
    private Integer width;

    /**
     * Video codec settings.
     * 
     * @param codecSettings
     *        Video codec settings.
     */

    public void setCodecSettings(VideoCodecSettings codecSettings) {
        this.codecSettings = codecSettings;
    }

    /**
     * Video codec settings.
     * 
     * @return Video codec settings.
     */

    public VideoCodecSettings getCodecSettings() {
        return this.codecSettings;
    }

    /**
     * Video codec settings.
     * 
     * @param codecSettings
     *        Video codec settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoDescription withCodecSettings(VideoCodecSettings codecSettings) {
        setCodecSettings(codecSettings);
        return this;
    }

    /**
     * Output video height (in pixels). Leave blank to use source video height. If left blank, width must also be
     * unspecified.
     * 
     * @param height
     *        Output video height (in pixels). Leave blank to use source video height. If left blank, width must also be
     *        unspecified.
     */

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Output video height (in pixels). Leave blank to use source video height. If left blank, width must also be
     * unspecified.
     * 
     * @return Output video height (in pixels). Leave blank to use source video height. If left blank, width must also
     *         be unspecified.
     */

    public Integer getHeight() {
        return this.height;
    }

    /**
     * Output video height (in pixels). Leave blank to use source video height. If left blank, width must also be
     * unspecified.
     * 
     * @param height
     *        Output video height (in pixels). Leave blank to use source video height. If left blank, width must also be
     *        unspecified.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoDescription withHeight(Integer height) {
        setHeight(height);
        return this;
    }

    /**
     * The name of this VideoDescription. Outputs will use this name to uniquely identify this Description. Description
     * names should be unique within this Live Event.
     * 
     * @param name
     *        The name of this VideoDescription. Outputs will use this name to uniquely identify this Description.
     *        Description names should be unique within this Live Event.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * The name of this VideoDescription. Outputs will use this name to uniquely identify this Description. Description
     * names should be unique within this Live Event.
     * 
     * @return The name of this VideoDescription. Outputs will use this name to uniquely identify this Description.
     *         Description names should be unique within this Live Event.
     */

    public String getName() {
        return this.name;
    }

    /**
     * The name of this VideoDescription. Outputs will use this name to uniquely identify this Description. Description
     * names should be unique within this Live Event.
     * 
     * @param name
     *        The name of this VideoDescription. Outputs will use this name to uniquely identify this Description.
     *        Description names should be unique within this Live Event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoDescription withName(String name) {
        setName(name);
        return this;
    }

    /**
     * Indicates how to respond to the AFD values in the input stream. Setting to "respond" causes input video to be
     * clipped, depending on AFD value, input display aspect ratio and output display aspect ratio.
     * 
     * @param respondToAfd
     *        Indicates how to respond to the AFD values in the input stream. Setting to "respond" causes input video to
     *        be clipped, depending on AFD value, input display aspect ratio and output display aspect ratio.
     * @see VideoDescriptionRespondToAfd
     */

    public void setRespondToAfd(String respondToAfd) {
        this.respondToAfd = respondToAfd;
    }

    /**
     * Indicates how to respond to the AFD values in the input stream. Setting to "respond" causes input video to be
     * clipped, depending on AFD value, input display aspect ratio and output display aspect ratio.
     * 
     * @return Indicates how to respond to the AFD values in the input stream. Setting to "respond" causes input video
     *         to be clipped, depending on AFD value, input display aspect ratio and output display aspect ratio.
     * @see VideoDescriptionRespondToAfd
     */

    public String getRespondToAfd() {
        return this.respondToAfd;
    }

    /**
     * Indicates how to respond to the AFD values in the input stream. Setting to "respond" causes input video to be
     * clipped, depending on AFD value, input display aspect ratio and output display aspect ratio.
     * 
     * @param respondToAfd
     *        Indicates how to respond to the AFD values in the input stream. Setting to "respond" causes input video to
     *        be clipped, depending on AFD value, input display aspect ratio and output display aspect ratio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoDescriptionRespondToAfd
     */

    public VideoDescription withRespondToAfd(String respondToAfd) {
        setRespondToAfd(respondToAfd);
        return this;
    }

    /**
     * Indicates how to respond to the AFD values in the input stream. Setting to "respond" causes input video to be
     * clipped, depending on AFD value, input display aspect ratio and output display aspect ratio.
     * 
     * @param respondToAfd
     *        Indicates how to respond to the AFD values in the input stream. Setting to "respond" causes input video to
     *        be clipped, depending on AFD value, input display aspect ratio and output display aspect ratio.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoDescriptionRespondToAfd
     */

    public VideoDescription withRespondToAfd(VideoDescriptionRespondToAfd respondToAfd) {
        this.respondToAfd = respondToAfd.toString();
        return this;
    }

    /**
     * When set to "stretchToOutput", automatically configures the output position to stretch the video to the specified
     * output resolution. This option will override any position value.
     * 
     * @param scalingBehavior
     *        When set to "stretchToOutput", automatically configures the output position to stretch the video to the
     *        specified output resolution. This option will override any position value.
     * @see VideoDescriptionScalingBehavior
     */

    public void setScalingBehavior(String scalingBehavior) {
        this.scalingBehavior = scalingBehavior;
    }

    /**
     * When set to "stretchToOutput", automatically configures the output position to stretch the video to the specified
     * output resolution. This option will override any position value.
     * 
     * @return When set to "stretchToOutput", automatically configures the output position to stretch the video to the
     *         specified output resolution. This option will override any position value.
     * @see VideoDescriptionScalingBehavior
     */

    public String getScalingBehavior() {
        return this.scalingBehavior;
    }

    /**
     * When set to "stretchToOutput", automatically configures the output position to stretch the video to the specified
     * output resolution. This option will override any position value.
     * 
     * @param scalingBehavior
     *        When set to "stretchToOutput", automatically configures the output position to stretch the video to the
     *        specified output resolution. This option will override any position value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoDescriptionScalingBehavior
     */

    public VideoDescription withScalingBehavior(String scalingBehavior) {
        setScalingBehavior(scalingBehavior);
        return this;
    }

    /**
     * When set to "stretchToOutput", automatically configures the output position to stretch the video to the specified
     * output resolution. This option will override any position value.
     * 
     * @param scalingBehavior
     *        When set to "stretchToOutput", automatically configures the output position to stretch the video to the
     *        specified output resolution. This option will override any position value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VideoDescriptionScalingBehavior
     */

    public VideoDescription withScalingBehavior(VideoDescriptionScalingBehavior scalingBehavior) {
        this.scalingBehavior = scalingBehavior.toString();
        return this;
    }

    /**
     * Changes the width of the anti-alias filter kernel used for scaling. Only applies if scaling is being performed
     * and antiAlias is set to true. 0 is the softest setting, 100 the sharpest, and 50 recommended for most content.
     * 
     * @param sharpness
     *        Changes the width of the anti-alias filter kernel used for scaling. Only applies if scaling is being
     *        performed and antiAlias is set to true. 0 is the softest setting, 100 the sharpest, and 50 recommended for
     *        most content.
     */

    public void setSharpness(Integer sharpness) {
        this.sharpness = sharpness;
    }

    /**
     * Changes the width of the anti-alias filter kernel used for scaling. Only applies if scaling is being performed
     * and antiAlias is set to true. 0 is the softest setting, 100 the sharpest, and 50 recommended for most content.
     * 
     * @return Changes the width of the anti-alias filter kernel used for scaling. Only applies if scaling is being
     *         performed and antiAlias is set to true. 0 is the softest setting, 100 the sharpest, and 50 recommended
     *         for most content.
     */

    public Integer getSharpness() {
        return this.sharpness;
    }

    /**
     * Changes the width of the anti-alias filter kernel used for scaling. Only applies if scaling is being performed
     * and antiAlias is set to true. 0 is the softest setting, 100 the sharpest, and 50 recommended for most content.
     * 
     * @param sharpness
     *        Changes the width of the anti-alias filter kernel used for scaling. Only applies if scaling is being
     *        performed and antiAlias is set to true. 0 is the softest setting, 100 the sharpest, and 50 recommended for
     *        most content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoDescription withSharpness(Integer sharpness) {
        setSharpness(sharpness);
        return this;
    }

    /**
     * Output video width (in pixels). Leave out to use source video width. If left out, height must also be left out.
     * Display aspect ratio is always preserved by letterboxing or pillarboxing when necessary.
     * 
     * @param width
     *        Output video width (in pixels). Leave out to use source video width. If left out, height must also be left
     *        out. Display aspect ratio is always preserved by letterboxing or pillarboxing when necessary.
     */

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Output video width (in pixels). Leave out to use source video width. If left out, height must also be left out.
     * Display aspect ratio is always preserved by letterboxing or pillarboxing when necessary.
     * 
     * @return Output video width (in pixels). Leave out to use source video width. If left out, height must also be
     *         left out. Display aspect ratio is always preserved by letterboxing or pillarboxing when necessary.
     */

    public Integer getWidth() {
        return this.width;
    }

    /**
     * Output video width (in pixels). Leave out to use source video width. If left out, height must also be left out.
     * Display aspect ratio is always preserved by letterboxing or pillarboxing when necessary.
     * 
     * @param width
     *        Output video width (in pixels). Leave out to use source video width. If left out, height must also be left
     *        out. Display aspect ratio is always preserved by letterboxing or pillarboxing when necessary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public VideoDescription withWidth(Integer width) {
        setWidth(width);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCodecSettings() != null)
            sb.append("CodecSettings: ").append(getCodecSettings()).append(",");
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRespondToAfd() != null)
            sb.append("RespondToAfd: ").append(getRespondToAfd()).append(",");
        if (getScalingBehavior() != null)
            sb.append("ScalingBehavior: ").append(getScalingBehavior()).append(",");
        if (getSharpness() != null)
            sb.append("Sharpness: ").append(getSharpness()).append(",");
        if (getWidth() != null)
            sb.append("Width: ").append(getWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof VideoDescription == false)
            return false;
        VideoDescription other = (VideoDescription) obj;
        if (other.getCodecSettings() == null ^ this.getCodecSettings() == null)
            return false;
        if (other.getCodecSettings() != null && other.getCodecSettings().equals(this.getCodecSettings()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRespondToAfd() == null ^ this.getRespondToAfd() == null)
            return false;
        if (other.getRespondToAfd() != null && other.getRespondToAfd().equals(this.getRespondToAfd()) == false)
            return false;
        if (other.getScalingBehavior() == null ^ this.getScalingBehavior() == null)
            return false;
        if (other.getScalingBehavior() != null && other.getScalingBehavior().equals(this.getScalingBehavior()) == false)
            return false;
        if (other.getSharpness() == null ^ this.getSharpness() == null)
            return false;
        if (other.getSharpness() != null && other.getSharpness().equals(this.getSharpness()) == false)
            return false;
        if (other.getWidth() == null ^ this.getWidth() == null)
            return false;
        if (other.getWidth() != null && other.getWidth().equals(this.getWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCodecSettings() == null) ? 0 : getCodecSettings().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRespondToAfd() == null) ? 0 : getRespondToAfd().hashCode());
        hashCode = prime * hashCode + ((getScalingBehavior() == null) ? 0 : getScalingBehavior().hashCode());
        hashCode = prime * hashCode + ((getSharpness() == null) ? 0 : getSharpness().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public VideoDescription clone() {
        try {
            return (VideoDescription) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.VideoDescriptionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
