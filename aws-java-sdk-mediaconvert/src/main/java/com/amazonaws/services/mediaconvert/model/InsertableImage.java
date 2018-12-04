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
package com.amazonaws.services.mediaconvert.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Settings for Insertable Image
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/InsertableImage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InsertableImage implements Serializable, Cloneable, StructuredPojo {

    /** Use Duration (Duration) to set the time, in milliseconds, for the image to remain on the output video. */
    private Integer duration;
    /**
     * Use Fade in (FadeIut) to set the length, in milliseconds, of the inserted image fade in. If you don't specify a
     * value for Fade in, the image will appear abruptly at the Start time.
     */
    private Integer fadeIn;
    /**
     * Use Fade out (FadeOut) to set the length, in milliseconds, of the inserted image fade out. If you don't specify a
     * value for Fade out, the image will disappear abruptly at the end of the inserted image duration.
     */
    private Integer fadeOut;
    /**
     * Specify the Height (Height) of the inserted image. Use a value that is less than or equal to the video resolution
     * height. Leave this setting blank to use the native height of the image.
     */
    private Integer height;
    /**
     * Use Image location (imageInserterInput) to specify the Amazon S3 location of the image to be inserted into the
     * output. Use a 32 bit BMP, PNG, or TGA file that fits inside the video frame.
     */
    private String imageInserterInput;
    /**
     * Use Left (ImageX) to set the distance, in pixels, between the inserted image and the left edge of the frame.
     * Required for BMP, PNG and TGA input.
     */
    private Integer imageX;
    /**
     * Use Top (ImageY) to set the distance, in pixels, between the inserted image and the top edge of the video frame.
     * Required for BMP, PNG and TGA input.
     */
    private Integer imageY;
    /**
     * Use Layer (Layer) to specify how overlapping inserted images appear. Images with higher values of layer appear on
     * top of images with lower values of layer.
     */
    private Integer layer;
    /**
     * Use Opacity (Opacity) to specify how much of the underlying video shows through the inserted image. 0 is
     * transparent and 100 is fully opaque. Default is 50.
     */
    private Integer opacity;
    /**
     * Use Start time (StartTime) to specify the video timecode when the image is inserted in the output. This must be
     * in timecode format (HH:MM:SS:FF)
     */
    private String startTime;
    /**
     * Specify the Width (Width) of the inserted image. Use a value that is less than or equal to the video resolution
     * width. Leave this setting blank to use the native width of the image.
     */
    private Integer width;

    /**
     * Use Duration (Duration) to set the time, in milliseconds, for the image to remain on the output video.
     * 
     * @param duration
     *        Use Duration (Duration) to set the time, in milliseconds, for the image to remain on the output video.
     */

    public void setDuration(Integer duration) {
        this.duration = duration;
    }

    /**
     * Use Duration (Duration) to set the time, in milliseconds, for the image to remain on the output video.
     * 
     * @return Use Duration (Duration) to set the time, in milliseconds, for the image to remain on the output video.
     */

    public Integer getDuration() {
        return this.duration;
    }

    /**
     * Use Duration (Duration) to set the time, in milliseconds, for the image to remain on the output video.
     * 
     * @param duration
     *        Use Duration (Duration) to set the time, in milliseconds, for the image to remain on the output video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withDuration(Integer duration) {
        setDuration(duration);
        return this;
    }

    /**
     * Use Fade in (FadeIut) to set the length, in milliseconds, of the inserted image fade in. If you don't specify a
     * value for Fade in, the image will appear abruptly at the Start time.
     * 
     * @param fadeIn
     *        Use Fade in (FadeIut) to set the length, in milliseconds, of the inserted image fade in. If you don't
     *        specify a value for Fade in, the image will appear abruptly at the Start time.
     */

    public void setFadeIn(Integer fadeIn) {
        this.fadeIn = fadeIn;
    }

    /**
     * Use Fade in (FadeIut) to set the length, in milliseconds, of the inserted image fade in. If you don't specify a
     * value for Fade in, the image will appear abruptly at the Start time.
     * 
     * @return Use Fade in (FadeIut) to set the length, in milliseconds, of the inserted image fade in. If you don't
     *         specify a value for Fade in, the image will appear abruptly at the Start time.
     */

    public Integer getFadeIn() {
        return this.fadeIn;
    }

    /**
     * Use Fade in (FadeIut) to set the length, in milliseconds, of the inserted image fade in. If you don't specify a
     * value for Fade in, the image will appear abruptly at the Start time.
     * 
     * @param fadeIn
     *        Use Fade in (FadeIut) to set the length, in milliseconds, of the inserted image fade in. If you don't
     *        specify a value for Fade in, the image will appear abruptly at the Start time.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withFadeIn(Integer fadeIn) {
        setFadeIn(fadeIn);
        return this;
    }

    /**
     * Use Fade out (FadeOut) to set the length, in milliseconds, of the inserted image fade out. If you don't specify a
     * value for Fade out, the image will disappear abruptly at the end of the inserted image duration.
     * 
     * @param fadeOut
     *        Use Fade out (FadeOut) to set the length, in milliseconds, of the inserted image fade out. If you don't
     *        specify a value for Fade out, the image will disappear abruptly at the end of the inserted image duration.
     */

    public void setFadeOut(Integer fadeOut) {
        this.fadeOut = fadeOut;
    }

    /**
     * Use Fade out (FadeOut) to set the length, in milliseconds, of the inserted image fade out. If you don't specify a
     * value for Fade out, the image will disappear abruptly at the end of the inserted image duration.
     * 
     * @return Use Fade out (FadeOut) to set the length, in milliseconds, of the inserted image fade out. If you don't
     *         specify a value for Fade out, the image will disappear abruptly at the end of the inserted image
     *         duration.
     */

    public Integer getFadeOut() {
        return this.fadeOut;
    }

    /**
     * Use Fade out (FadeOut) to set the length, in milliseconds, of the inserted image fade out. If you don't specify a
     * value for Fade out, the image will disappear abruptly at the end of the inserted image duration.
     * 
     * @param fadeOut
     *        Use Fade out (FadeOut) to set the length, in milliseconds, of the inserted image fade out. If you don't
     *        specify a value for Fade out, the image will disappear abruptly at the end of the inserted image duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withFadeOut(Integer fadeOut) {
        setFadeOut(fadeOut);
        return this;
    }

    /**
     * Specify the Height (Height) of the inserted image. Use a value that is less than or equal to the video resolution
     * height. Leave this setting blank to use the native height of the image.
     * 
     * @param height
     *        Specify the Height (Height) of the inserted image. Use a value that is less than or equal to the video
     *        resolution height. Leave this setting blank to use the native height of the image.
     */

    public void setHeight(Integer height) {
        this.height = height;
    }

    /**
     * Specify the Height (Height) of the inserted image. Use a value that is less than or equal to the video resolution
     * height. Leave this setting blank to use the native height of the image.
     * 
     * @return Specify the Height (Height) of the inserted image. Use a value that is less than or equal to the video
     *         resolution height. Leave this setting blank to use the native height of the image.
     */

    public Integer getHeight() {
        return this.height;
    }

    /**
     * Specify the Height (Height) of the inserted image. Use a value that is less than or equal to the video resolution
     * height. Leave this setting blank to use the native height of the image.
     * 
     * @param height
     *        Specify the Height (Height) of the inserted image. Use a value that is less than or equal to the video
     *        resolution height. Leave this setting blank to use the native height of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withHeight(Integer height) {
        setHeight(height);
        return this;
    }

    /**
     * Use Image location (imageInserterInput) to specify the Amazon S3 location of the image to be inserted into the
     * output. Use a 32 bit BMP, PNG, or TGA file that fits inside the video frame.
     * 
     * @param imageInserterInput
     *        Use Image location (imageInserterInput) to specify the Amazon S3 location of the image to be inserted into
     *        the output. Use a 32 bit BMP, PNG, or TGA file that fits inside the video frame.
     */

    public void setImageInserterInput(String imageInserterInput) {
        this.imageInserterInput = imageInserterInput;
    }

    /**
     * Use Image location (imageInserterInput) to specify the Amazon S3 location of the image to be inserted into the
     * output. Use a 32 bit BMP, PNG, or TGA file that fits inside the video frame.
     * 
     * @return Use Image location (imageInserterInput) to specify the Amazon S3 location of the image to be inserted
     *         into the output. Use a 32 bit BMP, PNG, or TGA file that fits inside the video frame.
     */

    public String getImageInserterInput() {
        return this.imageInserterInput;
    }

    /**
     * Use Image location (imageInserterInput) to specify the Amazon S3 location of the image to be inserted into the
     * output. Use a 32 bit BMP, PNG, or TGA file that fits inside the video frame.
     * 
     * @param imageInserterInput
     *        Use Image location (imageInserterInput) to specify the Amazon S3 location of the image to be inserted into
     *        the output. Use a 32 bit BMP, PNG, or TGA file that fits inside the video frame.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withImageInserterInput(String imageInserterInput) {
        setImageInserterInput(imageInserterInput);
        return this;
    }

    /**
     * Use Left (ImageX) to set the distance, in pixels, between the inserted image and the left edge of the frame.
     * Required for BMP, PNG and TGA input.
     * 
     * @param imageX
     *        Use Left (ImageX) to set the distance, in pixels, between the inserted image and the left edge of the
     *        frame. Required for BMP, PNG and TGA input.
     */

    public void setImageX(Integer imageX) {
        this.imageX = imageX;
    }

    /**
     * Use Left (ImageX) to set the distance, in pixels, between the inserted image and the left edge of the frame.
     * Required for BMP, PNG and TGA input.
     * 
     * @return Use Left (ImageX) to set the distance, in pixels, between the inserted image and the left edge of the
     *         frame. Required for BMP, PNG and TGA input.
     */

    public Integer getImageX() {
        return this.imageX;
    }

    /**
     * Use Left (ImageX) to set the distance, in pixels, between the inserted image and the left edge of the frame.
     * Required for BMP, PNG and TGA input.
     * 
     * @param imageX
     *        Use Left (ImageX) to set the distance, in pixels, between the inserted image and the left edge of the
     *        frame. Required for BMP, PNG and TGA input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withImageX(Integer imageX) {
        setImageX(imageX);
        return this;
    }

    /**
     * Use Top (ImageY) to set the distance, in pixels, between the inserted image and the top edge of the video frame.
     * Required for BMP, PNG and TGA input.
     * 
     * @param imageY
     *        Use Top (ImageY) to set the distance, in pixels, between the inserted image and the top edge of the video
     *        frame. Required for BMP, PNG and TGA input.
     */

    public void setImageY(Integer imageY) {
        this.imageY = imageY;
    }

    /**
     * Use Top (ImageY) to set the distance, in pixels, between the inserted image and the top edge of the video frame.
     * Required for BMP, PNG and TGA input.
     * 
     * @return Use Top (ImageY) to set the distance, in pixels, between the inserted image and the top edge of the video
     *         frame. Required for BMP, PNG and TGA input.
     */

    public Integer getImageY() {
        return this.imageY;
    }

    /**
     * Use Top (ImageY) to set the distance, in pixels, between the inserted image and the top edge of the video frame.
     * Required for BMP, PNG and TGA input.
     * 
     * @param imageY
     *        Use Top (ImageY) to set the distance, in pixels, between the inserted image and the top edge of the video
     *        frame. Required for BMP, PNG and TGA input.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withImageY(Integer imageY) {
        setImageY(imageY);
        return this;
    }

    /**
     * Use Layer (Layer) to specify how overlapping inserted images appear. Images with higher values of layer appear on
     * top of images with lower values of layer.
     * 
     * @param layer
     *        Use Layer (Layer) to specify how overlapping inserted images appear. Images with higher values of layer
     *        appear on top of images with lower values of layer.
     */

    public void setLayer(Integer layer) {
        this.layer = layer;
    }

    /**
     * Use Layer (Layer) to specify how overlapping inserted images appear. Images with higher values of layer appear on
     * top of images with lower values of layer.
     * 
     * @return Use Layer (Layer) to specify how overlapping inserted images appear. Images with higher values of layer
     *         appear on top of images with lower values of layer.
     */

    public Integer getLayer() {
        return this.layer;
    }

    /**
     * Use Layer (Layer) to specify how overlapping inserted images appear. Images with higher values of layer appear on
     * top of images with lower values of layer.
     * 
     * @param layer
     *        Use Layer (Layer) to specify how overlapping inserted images appear. Images with higher values of layer
     *        appear on top of images with lower values of layer.
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
     * Use Start time (StartTime) to specify the video timecode when the image is inserted in the output. This must be
     * in timecode format (HH:MM:SS:FF)
     * 
     * @param startTime
     *        Use Start time (StartTime) to specify the video timecode when the image is inserted in the output. This
     *        must be in timecode format (HH:MM:SS:FF)
     */

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    /**
     * Use Start time (StartTime) to specify the video timecode when the image is inserted in the output. This must be
     * in timecode format (HH:MM:SS:FF)
     * 
     * @return Use Start time (StartTime) to specify the video timecode when the image is inserted in the output. This
     *         must be in timecode format (HH:MM:SS:FF)
     */

    public String getStartTime() {
        return this.startTime;
    }

    /**
     * Use Start time (StartTime) to specify the video timecode when the image is inserted in the output. This must be
     * in timecode format (HH:MM:SS:FF)
     * 
     * @param startTime
     *        Use Start time (StartTime) to specify the video timecode when the image is inserted in the output. This
     *        must be in timecode format (HH:MM:SS:FF)
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withStartTime(String startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * Specify the Width (Width) of the inserted image. Use a value that is less than or equal to the video resolution
     * width. Leave this setting blank to use the native width of the image.
     * 
     * @param width
     *        Specify the Width (Width) of the inserted image. Use a value that is less than or equal to the video
     *        resolution width. Leave this setting blank to use the native width of the image.
     */

    public void setWidth(Integer width) {
        this.width = width;
    }

    /**
     * Specify the Width (Width) of the inserted image. Use a value that is less than or equal to the video resolution
     * width. Leave this setting blank to use the native width of the image.
     * 
     * @return Specify the Width (Width) of the inserted image. Use a value that is less than or equal to the video
     *         resolution width. Leave this setting blank to use the native width of the image.
     */

    public Integer getWidth() {
        return this.width;
    }

    /**
     * Specify the Width (Width) of the inserted image. Use a value that is less than or equal to the video resolution
     * width. Leave this setting blank to use the native width of the image.
     * 
     * @param width
     *        Specify the Width (Width) of the inserted image. Use a value that is less than or equal to the video
     *        resolution width. Leave this setting blank to use the native width of the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InsertableImage withWidth(Integer width) {
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
