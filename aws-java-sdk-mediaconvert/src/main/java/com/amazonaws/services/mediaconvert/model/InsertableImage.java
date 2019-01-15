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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings that specify how your still graphic overlay appears.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/InsertableImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsertableImage implements Serializable, Cloneable, StructuredPojo {

    /**
     * Specify the time, in milliseconds, for the image to remain on the output video. This duration includes fade-in
     * time but not fade-out time.
     */
    private Integer duration;
    /**
     * Specify the length of time, in milliseconds, between the Start time that you specify for the image insertion and
     * the time that the image appears at full opacity. Full opacity is the level that you specify for the opacity
     * setting. If you don't specify a value for Fade-in, the image will appear abruptly at the overlay start time.
     */
    private Integer fadeIn;
    /**
     * Specify the length of time, in milliseconds, between the end of the time that you have specified for the image
     * overlay Duration and when the overlaid image has faded to total transparency. If you don't specify a value for
     * Fade-out, the image will disappear abruptly at the end of the inserted image duration.
     */
    private Integer fadeOut;
    /**
     * Specify the height of the inserted image in pixels. If you specify a value that's larger than the video
     * resolution height, the service will crop your overlaid image to fit. To use the native height of the image, keep
     * this setting blank.
     */
    private Integer height;
    /** Specify the Amazon S3 location of the image that you want to overlay on the video. Use a PNG or TGA file. */
    private String imageInserterInput;
    /**
     * Specify the distance, in pixels, between the inserted image and the left edge of the video frame. Required for
     * any image overlay that you specify.
     */
    private Integer imageX;
    /**
     * Specify the distance, in pixels, between the overlaid image and the top edge of the video frame. Required for any
     * image overlay that you specify.
     */
    private Integer imageY;
    /**
     * Specify how overlapping inserted images appear. Images with higher values for Layer appear on top of images with
     * lower values for Layer.
     */
    private Integer layer;
    /**
     * Use Opacity (Opacity) to specify how much of the underlying video shows through the inserted image. 0 is
     * transparent and 100 is fully opaque. Default is 50.
     */
    private Integer opacity;
    /**
     * Specify the timecode of the frame that you want the overlay to first appear on. This must be in timecode
     * (HH:MM:SS:FF or HH:MM:SS;FF) format. Remember to take into account your timecode source settings.
     */
    private String startTime;
    /**
     * Specify the width of the inserted image in pixels. If you specify a value that's larger than the video resolution
     * width, the service will crop your overlaid image to fit. To use the native width of the image, keep this setting
     * blank.
     */
    private Integer width;

    /**
     * Specify the time, in milliseconds, for the image to remain on the output video. This duration includes fade-in
     * time but not fade-out time.
     * 
     * @param duration
     *        Specify the time, in milliseconds, for the image to remain on the output video. This duration includes
     *        fade-in time but not fade-out time.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Specify the time, in milliseconds, for the image to remain on the output video. This duration includes fade-in
     * time but not fade-out time.
     * 
     * @return Specify the time, in milliseconds, for the image to remain on the output video. This duration includes
     *         fade-in time but not fade-out time.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * Specify the time, in milliseconds, for the image to remain on the output video. This duration includes fade-in
     * time but not fade-out time.
     * 
     * @param duration
     *        Specify the time, in milliseconds, for the image to remain on the output video. This duration includes
     *        fade-in time but not fade-out time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * Specify the length of time, in milliseconds, between the Start time that you specify for the image insertion and
     * the time that the image appears at full opacity. Full opacity is the level that you specify for the opacity
     * setting. If you don't specify a value for Fade-in, the image will appear abruptly at the overlay start time.
     * 
     * @param fadeIn
     *        Specify the length of time, in milliseconds, between the Start time that you specify for the image
     *        insertion and the time that the image appears at full opacity. Full opacity is the level that you specify
     *        for the opacity setting. If you don't specify a value for Fade-in, the image will appear abruptly at the
     *        overlay start time.
     */

    public void setFadeIn(Integer fadeIn) {
        this.fadeIn = fadeIn;
    }

    /**
     * Specify the length of time, in milliseconds, between the Start time that you specify for the image insertion and
     * the time that the image appears at full opacity. Full opacity is the level that you specify for the opacity
     * setting. If you don't specify a value for Fade-in, the image will appear abruptly at the overlay start time.
     * 
     * @return Specify the length of time, in milliseconds, between the Start time that you specify for the image
     *         insertion and the time that the image appears at full opacity. Full opacity is the level that you specify
     *         for the opacity setting. If you don't specify a value for Fade-in, the image will appear abruptly at the
     *         overlay start time.
     */

    public Integer getFadeIn() {
        return this.fadeIn;
    }

    /**
     * Specify the length of time, in milliseconds, between the Start time that you specify for the image insertion and
     * the time that the image appears at full opacity. Full opacity is the level that you specify for the opacity
     * setting. If you don't specify a value for Fade-in, the image will appear abruptly at the overlay start time.
     * 
     * @param fadeIn
     *        Specify the length of time, in milliseconds, between the Start time that you specify for the image
     *        insertion and the time that the image appears at full opacity. Full opacity is the level that you specify
     *        for the opacity setting. If you don't specify a value for Fade-in, the image will appear abruptly at the
     *        overlay start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withFadeIn(Integer fadeIn) {
        setFadeIn(fadeIn);
        return this;
    }

    /**
     * Specify the length of time, in milliseconds, between the end of the time that you have specified for the image
     * overlay Duration and when the overlaid image has faded to total transparency. If you don't specify a value for
     * Fade-out, the image will disappear abruptly at the end of the inserted image duration.
     * 
     * @param fadeOut
     *        Specify the length of time, in milliseconds, between the end of the time that you have specified for the
     *        image overlay Duration and when the overlaid image has faded to total transparency. If you don't specify a
     *        value for Fade-out, the image will disappear abruptly at the end of the inserted image duration.
     */

    public void setFadeOut(Integer fadeOut) {
        this.fadeOut = fadeOut;
    }

    /**
     * Specify the length of time, in milliseconds, between the end of the time that you have specified for the image
     * overlay Duration and when the overlaid image has faded to total transparency. If you don't specify a value for
     * Fade-out, the image will disappear abruptly at the end of the inserted image duration.
     * 
     * @return Specify the length of time, in milliseconds, between the end of the time that you have specified for the
     *         image overlay Duration and when the overlaid image has faded to total transparency. If you don't specify
     *         a value for Fade-out, the image will disappear abruptly at the end of the inserted image duration.
     */

    public Integer getFadeOut() {
        return this.fadeOut;
    }

    /**
     * Specify the length of time, in milliseconds, between the end of the time that you have specified for the image
     * overlay Duration and when the overlaid image has faded to total transparency. If you don't specify a value for
     * Fade-out, the image will disappear abruptly at the end of the inserted image duration.
     * 
     * @param fadeOut
     *        Specify the length of time, in milliseconds, between the end of the time that you have specified for the
     *        image overlay Duration and when the overlaid image has faded to total transparency. If you don't specify a
     *        value for Fade-out, the image will disappear abruptly at the end of the inserted image duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withFadeOut(Integer fadeOut) {
        setFadeOut(fadeOut);
        return this;
    }

    /**
     * Specify the height of the inserted image in pixels. If you specify a value that's larger than the video
     * resolution height, the service will crop your overlaid image to fit. To use the native height of the image, keep
     * this setting blank.
     * 
     * @param height
     *        Specify the height of the inserted image in pixels. If you specify a value that's larger than the video
     *        resolution height, the service will crop your overlaid image to fit. To use the native height of the
     *        image, keep this setting blank.
     */

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Specify the height of the inserted image in pixels. If you specify a value that's larger than the video
     * resolution height, the service will crop your overlaid image to fit. To use the native height of the image, keep
     * this setting blank.
     * 
     * @return Specify the height of the inserted image in pixels. If you specify a value that's larger than the video
     *         resolution height, the service will crop your overlaid image to fit. To use the native height of the
     *         image, keep this setting blank.
     */

    public Integer getHeight() {
        return this.height;
    }

    /**
     * Specify the height of the inserted image in pixels. If you specify a value that's larger than the video
     * resolution height, the service will crop your overlaid image to fit. To use the native height of the image, keep
     * this setting blank.
     * 
     * @param height
     *        Specify the height of the inserted image in pixels. If you specify a value that's larger than the video
     *        resolution height, the service will crop your overlaid image to fit. To use the native height of the
     *        image, keep this setting blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withHeight(Integer height) {
        setHeight(height);
        return this;
    }

    /**
     * Specify the Amazon S3 location of the image that you want to overlay on the video. Use a PNG or TGA file.
     * 
     * @param imageInserterInput
     *        Specify the Amazon S3 location of the image that you want to overlay on the video. Use a PNG or TGA file.
     */

    public void setImageInserterInput(String imageInserterInput) {
        this.imageInserterInput = imageInserterInput;
    }

    /**
     * Specify the Amazon S3 location of the image that you want to overlay on the video. Use a PNG or TGA file.
     * 
     * @return Specify the Amazon S3 location of the image that you want to overlay on the video. Use a PNG or TGA file.
     */

    public String getImageInserterInput() {
        return this.imageInserterInput;
    }

    /**
     * Specify the Amazon S3 location of the image that you want to overlay on the video. Use a PNG or TGA file.
     * 
     * @param imageInserterInput
     *        Specify the Amazon S3 location of the image that you want to overlay on the video. Use a PNG or TGA file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withImageInserterInput(String imageInserterInput) {
        setImageInserterInput(imageInserterInput);
        return this;
    }

    /**
     * Specify the distance, in pixels, between the inserted image and the left edge of the video frame. Required for
     * any image overlay that you specify.
     * 
     * @param imageX
     *        Specify the distance, in pixels, between the inserted image and the left edge of the video frame. Required
     *        for any image overlay that you specify.
     */

    public void setImageX(Integer imageX) {
        this.imageX = imageX;
    }

    /**
     * Specify the distance, in pixels, between the inserted image and the left edge of the video frame. Required for
     * any image overlay that you specify.
     * 
     * @return Specify the distance, in pixels, between the inserted image and the left edge of the video frame.
     *         Required for any image overlay that you specify.
     */

    public Integer getImageX() {
        return this.imageX;
    }

    /**
     * Specify the distance, in pixels, between the inserted image and the left edge of the video frame. Required for
     * any image overlay that you specify.
     * 
     * @param imageX
     *        Specify the distance, in pixels, between the inserted image and the left edge of the video frame. Required
     *        for any image overlay that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withImageX(Integer imageX) {
        setImageX(imageX);
        return this;
    }

    /**
     * Specify the distance, in pixels, between the overlaid image and the top edge of the video frame. Required for any
     * image overlay that you specify.
     * 
     * @param imageY
     *        Specify the distance, in pixels, between the overlaid image and the top edge of the video frame. Required
     *        for any image overlay that you specify.
     */

    public void setImageY(Integer imageY) {
        this.imageY = imageY;
    }

    /**
     * Specify the distance, in pixels, between the overlaid image and the top edge of the video frame. Required for any
     * image overlay that you specify.
     * 
     * @return Specify the distance, in pixels, between the overlaid image and the top edge of the video frame. Required
     *         for any image overlay that you specify.
     */

    public Integer getImageY() {
        return this.imageY;
    }

    /**
     * Specify the distance, in pixels, between the overlaid image and the top edge of the video frame. Required for any
     * image overlay that you specify.
     * 
     * @param imageY
     *        Specify the distance, in pixels, between the overlaid image and the top edge of the video frame. Required
     *        for any image overlay that you specify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withImageY(Integer imageY) {
        setImageY(imageY);
        return this;
    }

    /**
     * Specify how overlapping inserted images appear. Images with higher values for Layer appear on top of images with
     * lower values for Layer.
     * 
     * @param layer
     *        Specify how overlapping inserted images appear. Images with higher values for Layer appear on top of
     *        images with lower values for Layer.
     */

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    /**
     * Specify how overlapping inserted images appear. Images with higher values for Layer appear on top of images with
     * lower values for Layer.
     * 
     * @return Specify how overlapping inserted images appear. Images with higher values for Layer appear on top of
     *         images with lower values for Layer.
     */

    public Integer getLayer() {
        return this.layer;
    }

    /**
     * Specify how overlapping inserted images appear. Images with higher values for Layer appear on top of images with
     * lower values for Layer.
     * 
     * @param layer
     *        Specify how overlapping inserted images appear. Images with higher values for Layer appear on top of
     *        images with lower values for Layer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withLayer(Integer layer) {
        setLayer(layer);
        return this;
    }

    /**
     * Use Opacity (Opacity) to specify how much of the underlying video shows through the inserted image. 0 is
     * transparent and 100 is fully opaque. Default is 50.
     * 
     * @param opacity
     *        Use Opacity (Opacity) to specify how much of the underlying video shows through the inserted image. 0 is
     *        transparent and 100 is fully opaque. Default is 50.
     */

    public void setOpacity(Integer opacity) {
        this.opacity = opacity;
    }

    /**
     * Use Opacity (Opacity) to specify how much of the underlying video shows through the inserted image. 0 is
     * transparent and 100 is fully opaque. Default is 50.
     * 
     * @return Use Opacity (Opacity) to specify how much of the underlying video shows through the inserted image. 0 is
     *         transparent and 100 is fully opaque. Default is 50.
     */

    public Integer getOpacity() {
        return this.opacity;
    }

    /**
     * Use Opacity (Opacity) to specify how much of the underlying video shows through the inserted image. 0 is
     * transparent and 100 is fully opaque. Default is 50.
     * 
     * @param opacity
     *        Use Opacity (Opacity) to specify how much of the underlying video shows through the inserted image. 0 is
     *        transparent and 100 is fully opaque. Default is 50.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withOpacity(Integer opacity) {
        setOpacity(opacity);
        return this;
    }

    /**
     * Specify the timecode of the frame that you want the overlay to first appear on. This must be in timecode
     * (HH:MM:SS:FF or HH:MM:SS;FF) format. Remember to take into account your timecode source settings.
     * 
     * @param startTime
     *        Specify the timecode of the frame that you want the overlay to first appear on. This must be in timecode
     *        (HH:MM:SS:FF or HH:MM:SS;FF) format. Remember to take into account your timecode source settings.
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * Specify the timecode of the frame that you want the overlay to first appear on. This must be in timecode
     * (HH:MM:SS:FF or HH:MM:SS;FF) format. Remember to take into account your timecode source settings.
     * 
     * @return Specify the timecode of the frame that you want the overlay to first appear on. This must be in timecode
     *         (HH:MM:SS:FF or HH:MM:SS;FF) format. Remember to take into account your timecode source settings.
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * Specify the timecode of the frame that you want the overlay to first appear on. This must be in timecode
     * (HH:MM:SS:FF or HH:MM:SS;FF) format. Remember to take into account your timecode source settings.
     * 
     * @param startTime
     *        Specify the timecode of the frame that you want the overlay to first appear on. This must be in timecode
     *        (HH:MM:SS:FF or HH:MM:SS;FF) format. Remember to take into account your timecode source settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * Specify the width of the inserted image in pixels. If you specify a value that's larger than the video resolution
     * width, the service will crop your overlaid image to fit. To use the native width of the image, keep this setting
     * blank.
     * 
     * @param width
     *        Specify the width of the inserted image in pixels. If you specify a value that's larger than the video
     *        resolution width, the service will crop your overlaid image to fit. To use the native width of the image,
     *        keep this setting blank.
     */

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Specify the width of the inserted image in pixels. If you specify a value that's larger than the video resolution
     * width, the service will crop your overlaid image to fit. To use the native width of the image, keep this setting
     * blank.
     * 
     * @return Specify the width of the inserted image in pixels. If you specify a value that's larger than the video
     *         resolution width, the service will crop your overlaid image to fit. To use the native width of the image,
     *         keep this setting blank.
     */

    public Integer getWidth() {
        return this.width;
    }

    /**
     * Specify the width of the inserted image in pixels. If you specify a value that's larger than the video resolution
     * width, the service will crop your overlaid image to fit. To use the native width of the image, keep this setting
     * blank.
     * 
     * @param width
     *        Specify the width of the inserted image in pixels. If you specify a value that's larger than the video
     *        resolution width, the service will crop your overlaid image to fit. To use the native width of the image,
     *        keep this setting blank.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withWidth(Integer width) {
        setWidth(width);
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
        if (getDuration() != null)
            sb.append("Duration: ").append(getDuration()).append(",");
        if (getFadeIn() != null)
            sb.append("FadeIn: ").append(getFadeIn()).append(",");
        if (getFadeOut() != null)
            sb.append("FadeOut: ").append(getFadeOut()).append(",");
        if (getHeight() != null)
            sb.append("Height: ").append(getHeight()).append(",");
        if (getImageInserterInput() != null)
            sb.append("ImageInserterInput: ").append(getImageInserterInput()).append(",");
        if (getImageX() != null)
            sb.append("ImageX: ").append(getImageX()).append(",");
        if (getImageY() != null)
            sb.append("ImageY: ").append(getImageY()).append(",");
        if (getLayer() != null)
            sb.append("Layer: ").append(getLayer()).append(",");
        if (getOpacity() != null)
            sb.append("Opacity: ").append(getOpacity()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
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

        if (obj instanceof InsertableImage == false)
            return false;
        InsertableImage other = (InsertableImage) obj;
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
        if (other.getImageInserterInput() == null ^ this.getImageInserterInput() == null)
            return false;
        if (other.getImageInserterInput() != null && other.getImageInserterInput().equals(this.getImageInserterInput()) == false)
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
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
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
        hashCode = prime * hashCode + ((getImageInserterInput() == null) ? 0 : getImageInserterInput().hashCode());
        hashCode = prime * hashCode + ((getImageX() == null) ? 0 : getImageX().hashCode());
        hashCode = prime * hashCode + ((getImageY() == null) ? 0 : getImageY().hashCode());
        hashCode = prime * hashCode + ((getLayer() == null) ? 0 : getLayer().hashCode());
        hashCode = prime * hashCode + ((getOpacity() == null) ? 0 : getOpacity().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getWidth() == null) ? 0 : getWidth().hashCode());
        return hashCode;
    }

    @Override
    public InsertableImage clone() {
        try {
            return (InsertableImage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.InsertableImageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
