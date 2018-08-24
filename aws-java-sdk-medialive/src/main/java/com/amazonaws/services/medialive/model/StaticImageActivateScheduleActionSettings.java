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
 * Static image activate.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/StaticImageActivateScheduleActionSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StaticImageActivateScheduleActionSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * The duration in milliseconds for the image to remain in the video. If omitted or set to 0, duration is infinite
     * and image will remain until explicitly deactivated.
     */
    private Integer duration;
    /** The time in milliseconds for the image to fade in. Defaults to 0. */
    private Integer fadeIn;
    /** The time in milliseconds for the image to fade out. Defaults to 0. */
    private Integer fadeOut;
    /** The height of the image when inserted into the video. Defaults to the native height of the image. */
    private Integer height;
    /**
     * The image to overlay on the video. Must be a 32 bit BMP, PNG, or TGA file. Must not be larger than the input
     * video.
     */
    private InputLocation image;
    /**
     * Placement of the left edge of the image on the horizontal axis in pixels. 0 is the left edge of the frame.
     * Defaults to 0.
     */
    private Integer imageX;
    /**
     * Placement of the top edge of the image on the vertical axis in pixels. 0 is the top edge of the frame. Defaults
     * to 0.
     */
    private Integer imageY;
    /**
     * The Z order of the inserted image. Images with higher layer values will be inserted on top of images with lower
     * layer values. Permitted values are 0-7 inclusive. Defaults to 0.
     */
    private Integer layer;
    /** Opacity of image where 0 is transparent and 100 is fully opaque. Defaults to 100. */
    private Integer opacity;
    /** The width of the image when inserted into the video. Defaults to the native width of the image. */
    private Integer width;

    /**
     * The duration in milliseconds for the image to remain in the video. If omitted or set to 0, duration is infinite
     * and image will remain until explicitly deactivated.
     * 
     * @param duration
     *        The duration in milliseconds for the image to remain in the video. If omitted or set to 0, duration is
     *        infinite and image will remain until explicitly deactivated.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * The duration in milliseconds for the image to remain in the video. If omitted or set to 0, duration is infinite
     * and image will remain until explicitly deactivated.
     * 
     * @return The duration in milliseconds for the image to remain in the video. If omitted or set to 0, duration is
     *         infinite and image will remain until explicitly deactivated.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * The duration in milliseconds for the image to remain in the video. If omitted or set to 0, duration is infinite
     * and image will remain until explicitly deactivated.
     * 
     * @param duration
     *        The duration in milliseconds for the image to remain in the video. If omitted or set to 0, duration is
     *        infinite and image will remain until explicitly deactivated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticImageActivateScheduleActionSettings withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * The time in milliseconds for the image to fade in. Defaults to 0.
     * 
     * @param fadeIn
     *        The time in milliseconds for the image to fade in. Defaults to 0.
     */

    public void setFadeIn(Integer fadeIn) {
        this.fadeIn = fadeIn;
    }

    /**
     * The time in milliseconds for the image to fade in. Defaults to 0.
     * 
     * @return The time in milliseconds for the image to fade in. Defaults to 0.
     */

    public Integer getFadeIn() {
        return this.fadeIn;
    }

    /**
     * The time in milliseconds for the image to fade in. Defaults to 0.
     * 
     * @param fadeIn
     *        The time in milliseconds for the image to fade in. Defaults to 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticImageActivateScheduleActionSettings withFadeIn(Integer fadeIn) {
        setFadeIn(fadeIn);
        return this;
    }

    /**
     * The time in milliseconds for the image to fade out. Defaults to 0.
     * 
     * @param fadeOut
     *        The time in milliseconds for the image to fade out. Defaults to 0.
     */

    public void setFadeOut(Integer fadeOut) {
        this.fadeOut = fadeOut;
    }

    /**
     * The time in milliseconds for the image to fade out. Defaults to 0.
     * 
     * @return The time in milliseconds for the image to fade out. Defaults to 0.
     */

    public Integer getFadeOut() {
        return this.fadeOut;
    }

    /**
     * The time in milliseconds for the image to fade out. Defaults to 0.
     * 
     * @param fadeOut
     *        The time in milliseconds for the image to fade out. Defaults to 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticImageActivateScheduleActionSettings withFadeOut(Integer fadeOut) {
        setFadeOut(fadeOut);
        return this;
    }

    /**
     * The height of the image when inserted into the video. Defaults to the native height of the image.
     * 
     * @param height
     *        The height of the image when inserted into the video. Defaults to the native height of the image.
     */

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * The height of the image when inserted into the video. Defaults to the native height of the image.
     * 
     * @return The height of the image when inserted into the video. Defaults to the native height of the image.
     */

    public Integer getHeight() {
        return this.height;
    }

    /**
     * The height of the image when inserted into the video. Defaults to the native height of the image.
     * 
     * @param height
     *        The height of the image when inserted into the video. Defaults to the native height of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticImageActivateScheduleActionSettings withHeight(Integer height) {
        setHeight(height);
        return this;
    }

    /**
     * The image to overlay on the video. Must be a 32 bit BMP, PNG, or TGA file. Must not be larger than the input
     * video.
     * 
     * @param image
     *        The image to overlay on the video. Must be a 32 bit BMP, PNG, or TGA file. Must not be larger than the
     *        input video.
     */

    public void setImage(InputLocation image) {
        this.image = image;
    }

    /**
     * The image to overlay on the video. Must be a 32 bit BMP, PNG, or TGA file. Must not be larger than the input
     * video.
     * 
     * @return The image to overlay on the video. Must be a 32 bit BMP, PNG, or TGA file. Must not be larger than the
     *         input video.
     */

    public InputLocation getImage() {
        return this.image;
    }

    /**
     * The image to overlay on the video. Must be a 32 bit BMP, PNG, or TGA file. Must not be larger than the input
     * video.
     * 
     * @param image
     *        The image to overlay on the video. Must be a 32 bit BMP, PNG, or TGA file. Must not be larger than the
     *        input video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticImageActivateScheduleActionSettings withImage(InputLocation image) {
        setImage(image);
        return this;
    }

    /**
     * Placement of the left edge of the image on the horizontal axis in pixels. 0 is the left edge of the frame.
     * Defaults to 0.
     * 
     * @param imageX
     *        Placement of the left edge of the image on the horizontal axis in pixels. 0 is the left edge of the frame.
     *        Defaults to 0.
     */

    public void setImageX(Integer imageX) {
        this.imageX = imageX;
    }

    /**
     * Placement of the left edge of the image on the horizontal axis in pixels. 0 is the left edge of the frame.
     * Defaults to 0.
     * 
     * @return Placement of the left edge of the image on the horizontal axis in pixels. 0 is the left edge of the
     *         frame. Defaults to 0.
     */

    public Integer getImageX() {
        return this.imageX;
    }

    /**
     * Placement of the left edge of the image on the horizontal axis in pixels. 0 is the left edge of the frame.
     * Defaults to 0.
     * 
     * @param imageX
     *        Placement of the left edge of the image on the horizontal axis in pixels. 0 is the left edge of the frame.
     *        Defaults to 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticImageActivateScheduleActionSettings withImageX(Integer imageX) {
        setImageX(imageX);
        return this;
    }

    /**
     * Placement of the top edge of the image on the vertical axis in pixels. 0 is the top edge of the frame. Defaults
     * to 0.
     * 
     * @param imageY
     *        Placement of the top edge of the image on the vertical axis in pixels. 0 is the top edge of the frame.
     *        Defaults to 0.
     */

    public void setImageY(Integer imageY) {
        this.imageY = imageY;
    }

    /**
     * Placement of the top edge of the image on the vertical axis in pixels. 0 is the top edge of the frame. Defaults
     * to 0.
     * 
     * @return Placement of the top edge of the image on the vertical axis in pixels. 0 is the top edge of the frame.
     *         Defaults to 0.
     */

    public Integer getImageY() {
        return this.imageY;
    }

    /**
     * Placement of the top edge of the image on the vertical axis in pixels. 0 is the top edge of the frame. Defaults
     * to 0.
     * 
     * @param imageY
     *        Placement of the top edge of the image on the vertical axis in pixels. 0 is the top edge of the frame.
     *        Defaults to 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticImageActivateScheduleActionSettings withImageY(Integer imageY) {
        setImageY(imageY);
        return this;
    }

    /**
     * The Z order of the inserted image. Images with higher layer values will be inserted on top of images with lower
     * layer values. Permitted values are 0-7 inclusive. Defaults to 0.
     * 
     * @param layer
     *        The Z order of the inserted image. Images with higher layer values will be inserted on top of images with
     *        lower layer values. Permitted values are 0-7 inclusive. Defaults to 0.
     */

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    /**
     * The Z order of the inserted image. Images with higher layer values will be inserted on top of images with lower
     * layer values. Permitted values are 0-7 inclusive. Defaults to 0.
     * 
     * @return The Z order of the inserted image. Images with higher layer values will be inserted on top of images with
     *         lower layer values. Permitted values are 0-7 inclusive. Defaults to 0.
     */

    public Integer getLayer() {
        return this.layer;
    }

    /**
     * The Z order of the inserted image. Images with higher layer values will be inserted on top of images with lower
     * layer values. Permitted values are 0-7 inclusive. Defaults to 0.
     * 
     * @param layer
     *        The Z order of the inserted image. Images with higher layer values will be inserted on top of images with
     *        lower layer values. Permitted values are 0-7 inclusive. Defaults to 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticImageActivateScheduleActionSettings withLayer(Integer layer) {
        setLayer(layer);
        return this;
    }

    /**
     * Opacity of image where 0 is transparent and 100 is fully opaque. Defaults to 100.
     * 
     * @param opacity
     *        Opacity of image where 0 is transparent and 100 is fully opaque. Defaults to 100.
     */

    public void setOpacity(Integer opacity) {
        this.opacity = opacity;
    }

    /**
     * Opacity of image where 0 is transparent and 100 is fully opaque. Defaults to 100.
     * 
     * @return Opacity of image where 0 is transparent and 100 is fully opaque. Defaults to 100.
     */

    public Integer getOpacity() {
        return this.opacity;
    }

    /**
     * Opacity of image where 0 is transparent and 100 is fully opaque. Defaults to 100.
     * 
     * @param opacity
     *        Opacity of image where 0 is transparent and 100 is fully opaque. Defaults to 100.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticImageActivateScheduleActionSettings withOpacity(Integer opacity) {
        setOpacity(opacity);
        return this;
    }

    /**
     * The width of the image when inserted into the video. Defaults to the native width of the image.
     * 
     * @param width
     *        The width of the image when inserted into the video. Defaults to the native width of the image.
     */

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * The width of the image when inserted into the video. Defaults to the native width of the image.
     * 
     * @return The width of the image when inserted into the video. Defaults to the native width of the image.
     */

    public Integer getWidth() {
        return this.width;
    }

    /**
     * The width of the image when inserted into the video. Defaults to the native width of the image.
     * 
     * @param width
     *        The width of the image when inserted into the video. Defaults to the native width of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StaticImageActivateScheduleActionSettings withWidth(Integer width) {
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
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getFadeIn() != null)
            sb.append("FadeIn: ").append(getFadeIn()).append(",");
        if (getFadeOut() != null)
            sb.append("FadeOut: ").append(getFadeOut()).append(",");
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getImage() != null)
            sb.append("Image: ").append(getImage()).append(",");
        if (getImageX() != null)
            sb.append("ImageX: ").append(getImageX()).append(",");
        if (getImageY() != null)
            sb.append("ImageY: ").append(getImageY()).append(",");
        if (getLayer() != null)
            sb.append("Layer: ").append(getLayer()).append(",");
        if (getOpacity() != null)
            sb.append("Opacity: ").append(getOpacity()).append(",");
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

        if (obj instanceof StaticImageActivateScheduleActionSettings == false)
            return false;
        StaticImageActivateScheduleActionSettings other = (StaticImageActivateScheduleActionSettings) obj;
        if (other.getDuration() == null ^ this.getDuration() == null)
            return false;
        if (other.getDuration() != null && other.getDuration().equals(this.getDuration()) == false)
            return false;
        if (other.getFadeIn() == null ^ this.getFadeIn() == null)
            return false;
        if (other.getFadeIn() != null && other.getFadeIn().equals(this.getFadeIn()) == false)
            return false;
        if (other.getFadeOut() == null ^ this.getFadeOut() == null)
            return false;
        if (other.getFadeOut() != null && other.getFadeOut().equals(this.getFadeOut()) == false)
            return false;
        if (other.getHeight() == null ^ this.getHeight() == null)
            return false;
        if (other.getHeight() != null && other.getHeight().equals(this.getHeight()) == false)
            return false;
        if (other.getImage() == null ^ this.getImage() == null)
            return false;
        if (other.getImage() != null && other.getImage().equals(this.getImage()) == false)
            return false;
        if (other.getImageX() == null ^ this.getImageX() == null)
            return false;
        if (other.getImageX() != null && other.getImageX().equals(this.getImageX()) == false)
            return false;
        if (other.getImageY() == null ^ this.getImageY() == null)
            return false;
        if (other.getImageY() != null && other.getImageY().equals(this.getImageY()) == false)
            return false;
        if (other.getLayer() == null ^ this.getLayer() == null)
            return false;
        if (other.getLayer() != null && other.getLayer().equals(this.getLayer()) == false)
            return false;
        if (other.getOpacity() == null ^ this.getOpacity() == null)
            return false;
        if (other.getOpacity() != null && other.getOpacity().equals(this.getOpacity()) == false)
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

        hashCode = prime * hashCode + ((getDuration() == null) ? 0 : getDuration().hashCode());
        hashCode = prime * hashCode + ((getFadeIn() == null) ? 0 : getFadeIn().hashCode());
        hashCode = prime * hashCode + ((getFadeOut() == null) ? 0 : getFadeOut().hashCode());
        hashCode = prime * hashCode + ((getHeight() == null) ? 0 : getHeight().hashCode());
        hashCode = prime * hashCode + ((getImage() == null) ? 0 : getImage().hashCode());
        hashCode = prime * hashCode + ((getImageX() == null) ? 0 : getImageX().hashCode());
        hashCode = prime * hashCode + ((getImageY() == null) ? 0 : getImageY().hashCode());
        hashCode = prime * hashCode + ((getLayer() == null) ? 0 : getLayer().hashCode());
        hashCode = prime * hashCode + ((getOpacity() == null) ? 0 : getOpacity().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public StaticImageActivateScheduleActionSettings clone() {
        try {
            return (StaticImageActivateScheduleActionSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.StaticImageActivateScheduleActionSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
