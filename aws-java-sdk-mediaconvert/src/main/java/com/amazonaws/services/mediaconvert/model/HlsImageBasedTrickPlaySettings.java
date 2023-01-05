/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Tile and thumbnail settings applicable when imageBasedTrickPlay is ADVANCED
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/HlsImageBasedTrickPlaySettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HlsImageBasedTrickPlaySettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * The cadence MediaConvert follows for generating thumbnails. If set to FOLLOW_IFRAME, MediaConvert generates
     * thumbnails for each IDR frame in the output (matching the GOP cadence). If set to FOLLOW_CUSTOM, MediaConvert
     * generates thumbnails according to the interval you specify in thumbnailInterval.
     */
    private String intervalCadence;
    /**
     * Height of each thumbnail within each tile image, in pixels. Leave blank to maintain aspect ratio with thumbnail
     * width. If following the aspect ratio would lead to a total tile height greater than 4096, then the job will be
     * rejected. Must be divisible by 2.
     */
    private Integer thumbnailHeight;
    /**
     * Enter the interval, in seconds, that MediaConvert uses to generate thumbnails. If the interval you enter doesn't
     * align with the output frame rate, MediaConvert automatically rounds the interval to align with the output frame
     * rate. For example, if the output frame rate is 29.97 frames per second and you enter 5, MediaConvert uses a 150
     * frame interval to generate thumbnails.
     */
    private Double thumbnailInterval;
    /** Width of each thumbnail within each tile image, in pixels. Default is 312. Must be divisible by 8. */
    private Integer thumbnailWidth;
    /** Number of thumbnails in each column of a tile image. Set a value between 2 and 2048. Must be divisible by 2. */
    private Integer tileHeight;
    /** Number of thumbnails in each row of a tile image. Set a value between 1 and 512. */
    private Integer tileWidth;

    /**
     * The cadence MediaConvert follows for generating thumbnails. If set to FOLLOW_IFRAME, MediaConvert generates
     * thumbnails for each IDR frame in the output (matching the GOP cadence). If set to FOLLOW_CUSTOM, MediaConvert
     * generates thumbnails according to the interval you specify in thumbnailInterval.
     * 
     * @param intervalCadence
     *        The cadence MediaConvert follows for generating thumbnails. If set to FOLLOW_IFRAME, MediaConvert
     *        generates thumbnails for each IDR frame in the output (matching the GOP cadence). If set to FOLLOW_CUSTOM,
     *        MediaConvert generates thumbnails according to the interval you specify in thumbnailInterval.
     * @see HlsIntervalCadence
     */

    public void setIntervalCadence(String intervalCadence) {
        this.intervalCadence = intervalCadence;
    }

    /**
     * The cadence MediaConvert follows for generating thumbnails. If set to FOLLOW_IFRAME, MediaConvert generates
     * thumbnails for each IDR frame in the output (matching the GOP cadence). If set to FOLLOW_CUSTOM, MediaConvert
     * generates thumbnails according to the interval you specify in thumbnailInterval.
     * 
     * @return The cadence MediaConvert follows for generating thumbnails. If set to FOLLOW_IFRAME, MediaConvert
     *         generates thumbnails for each IDR frame in the output (matching the GOP cadence). If set to
     *         FOLLOW_CUSTOM, MediaConvert generates thumbnails according to the interval you specify in
     *         thumbnailInterval.
     * @see HlsIntervalCadence
     */

    public String getIntervalCadence() {
        return this.intervalCadence;
    }

    /**
     * The cadence MediaConvert follows for generating thumbnails. If set to FOLLOW_IFRAME, MediaConvert generates
     * thumbnails for each IDR frame in the output (matching the GOP cadence). If set to FOLLOW_CUSTOM, MediaConvert
     * generates thumbnails according to the interval you specify in thumbnailInterval.
     * 
     * @param intervalCadence
     *        The cadence MediaConvert follows for generating thumbnails. If set to FOLLOW_IFRAME, MediaConvert
     *        generates thumbnails for each IDR frame in the output (matching the GOP cadence). If set to FOLLOW_CUSTOM,
     *        MediaConvert generates thumbnails according to the interval you specify in thumbnailInterval.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsIntervalCadence
     */

    public HlsImageBasedTrickPlaySettings withIntervalCadence(String intervalCadence) {
        setIntervalCadence(intervalCadence);
        return this;
    }

    /**
     * The cadence MediaConvert follows for generating thumbnails. If set to FOLLOW_IFRAME, MediaConvert generates
     * thumbnails for each IDR frame in the output (matching the GOP cadence). If set to FOLLOW_CUSTOM, MediaConvert
     * generates thumbnails according to the interval you specify in thumbnailInterval.
     * 
     * @param intervalCadence
     *        The cadence MediaConvert follows for generating thumbnails. If set to FOLLOW_IFRAME, MediaConvert
     *        generates thumbnails for each IDR frame in the output (matching the GOP cadence). If set to FOLLOW_CUSTOM,
     *        MediaConvert generates thumbnails according to the interval you specify in thumbnailInterval.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HlsIntervalCadence
     */

    public HlsImageBasedTrickPlaySettings withIntervalCadence(HlsIntervalCadence intervalCadence) {
        this.intervalCadence = intervalCadence.toString();
        return this;
    }

    /**
     * Height of each thumbnail within each tile image, in pixels. Leave blank to maintain aspect ratio with thumbnail
     * width. If following the aspect ratio would lead to a total tile height greater than 4096, then the job will be
     * rejected. Must be divisible by 2.
     * 
     * @param thumbnailHeight
     *        Height of each thumbnail within each tile image, in pixels. Leave blank to maintain aspect ratio with
     *        thumbnail width. If following the aspect ratio would lead to a total tile height greater than 4096, then
     *        the job will be rejected. Must be divisible by 2.
     */

    public void setThumbnailHeight(Integer thumbnailHeight) {
        this.thumbnailHeight = thumbnailHeight;
    }

    /**
     * Height of each thumbnail within each tile image, in pixels. Leave blank to maintain aspect ratio with thumbnail
     * width. If following the aspect ratio would lead to a total tile height greater than 4096, then the job will be
     * rejected. Must be divisible by 2.
     * 
     * @return Height of each thumbnail within each tile image, in pixels. Leave blank to maintain aspect ratio with
     *         thumbnail width. If following the aspect ratio would lead to a total tile height greater than 4096, then
     *         the job will be rejected. Must be divisible by 2.
     */

    public Integer getThumbnailHeight() {
        return this.thumbnailHeight;
    }

    /**
     * Height of each thumbnail within each tile image, in pixels. Leave blank to maintain aspect ratio with thumbnail
     * width. If following the aspect ratio would lead to a total tile height greater than 4096, then the job will be
     * rejected. Must be divisible by 2.
     * 
     * @param thumbnailHeight
     *        Height of each thumbnail within each tile image, in pixels. Leave blank to maintain aspect ratio with
     *        thumbnail width. If following the aspect ratio would lead to a total tile height greater than 4096, then
     *        the job will be rejected. Must be divisible by 2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsImageBasedTrickPlaySettings withThumbnailHeight(Integer thumbnailHeight) {
        setThumbnailHeight(thumbnailHeight);
        return this;
    }

    /**
     * Enter the interval, in seconds, that MediaConvert uses to generate thumbnails. If the interval you enter doesn't
     * align with the output frame rate, MediaConvert automatically rounds the interval to align with the output frame
     * rate. For example, if the output frame rate is 29.97 frames per second and you enter 5, MediaConvert uses a 150
     * frame interval to generate thumbnails.
     * 
     * @param thumbnailInterval
     *        Enter the interval, in seconds, that MediaConvert uses to generate thumbnails. If the interval you enter
     *        doesn't align with the output frame rate, MediaConvert automatically rounds the interval to align with the
     *        output frame rate. For example, if the output frame rate is 29.97 frames per second and you enter 5,
     *        MediaConvert uses a 150 frame interval to generate thumbnails.
     */

    public void setThumbnailInterval(Double thumbnailInterval) {
        this.thumbnailInterval = thumbnailInterval;
    }

    /**
     * Enter the interval, in seconds, that MediaConvert uses to generate thumbnails. If the interval you enter doesn't
     * align with the output frame rate, MediaConvert automatically rounds the interval to align with the output frame
     * rate. For example, if the output frame rate is 29.97 frames per second and you enter 5, MediaConvert uses a 150
     * frame interval to generate thumbnails.
     * 
     * @return Enter the interval, in seconds, that MediaConvert uses to generate thumbnails. If the interval you enter
     *         doesn't align with the output frame rate, MediaConvert automatically rounds the interval to align with
     *         the output frame rate. For example, if the output frame rate is 29.97 frames per second and you enter 5,
     *         MediaConvert uses a 150 frame interval to generate thumbnails.
     */

    public Double getThumbnailInterval() {
        return this.thumbnailInterval;
    }

    /**
     * Enter the interval, in seconds, that MediaConvert uses to generate thumbnails. If the interval you enter doesn't
     * align with the output frame rate, MediaConvert automatically rounds the interval to align with the output frame
     * rate. For example, if the output frame rate is 29.97 frames per second and you enter 5, MediaConvert uses a 150
     * frame interval to generate thumbnails.
     * 
     * @param thumbnailInterval
     *        Enter the interval, in seconds, that MediaConvert uses to generate thumbnails. If the interval you enter
     *        doesn't align with the output frame rate, MediaConvert automatically rounds the interval to align with the
     *        output frame rate. For example, if the output frame rate is 29.97 frames per second and you enter 5,
     *        MediaConvert uses a 150 frame interval to generate thumbnails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsImageBasedTrickPlaySettings withThumbnailInterval(Double thumbnailInterval) {
        setThumbnailInterval(thumbnailInterval);
        return this;
    }

    /**
     * Width of each thumbnail within each tile image, in pixels. Default is 312. Must be divisible by 8.
     * 
     * @param thumbnailWidth
     *        Width of each thumbnail within each tile image, in pixels. Default is 312. Must be divisible by 8.
     */

    public void setThumbnailWidth(Integer thumbnailWidth) {
        this.thumbnailWidth = thumbnailWidth;
    }

    /**
     * Width of each thumbnail within each tile image, in pixels. Default is 312. Must be divisible by 8.
     * 
     * @return Width of each thumbnail within each tile image, in pixels. Default is 312. Must be divisible by 8.
     */

    public Integer getThumbnailWidth() {
        return this.thumbnailWidth;
    }

    /**
     * Width of each thumbnail within each tile image, in pixels. Default is 312. Must be divisible by 8.
     * 
     * @param thumbnailWidth
     *        Width of each thumbnail within each tile image, in pixels. Default is 312. Must be divisible by 8.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsImageBasedTrickPlaySettings withThumbnailWidth(Integer thumbnailWidth) {
        setThumbnailWidth(thumbnailWidth);
        return this;
    }

    /**
     * Number of thumbnails in each column of a tile image. Set a value between 2 and 2048. Must be divisible by 2.
     * 
     * @param tileHeight
     *        Number of thumbnails in each column of a tile image. Set a value between 2 and 2048. Must be divisible by
     *        2.
     */

    public void setTileHeight(Integer tileHeight) {
        this.tileHeight = tileHeight;
    }

    /**
     * Number of thumbnails in each column of a tile image. Set a value between 2 and 2048. Must be divisible by 2.
     * 
     * @return Number of thumbnails in each column of a tile image. Set a value between 2 and 2048. Must be divisible by
     *         2.
     */

    public Integer getTileHeight() {
        return this.tileHeight;
    }

    /**
     * Number of thumbnails in each column of a tile image. Set a value between 2 and 2048. Must be divisible by 2.
     * 
     * @param tileHeight
     *        Number of thumbnails in each column of a tile image. Set a value between 2 and 2048. Must be divisible by
     *        2.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsImageBasedTrickPlaySettings withTileHeight(Integer tileHeight) {
        setTileHeight(tileHeight);
        return this;
    }

    /**
     * Number of thumbnails in each row of a tile image. Set a value between 1 and 512.
     * 
     * @param tileWidth
     *        Number of thumbnails in each row of a tile image. Set a value between 1 and 512.
     */

    public void setTileWidth(Integer tileWidth) {
        this.tileWidth = tileWidth;
    }

    /**
     * Number of thumbnails in each row of a tile image. Set a value between 1 and 512.
     * 
     * @return Number of thumbnails in each row of a tile image. Set a value between 1 and 512.
     */

    public Integer getTileWidth() {
        return this.tileWidth;
    }

    /**
     * Number of thumbnails in each row of a tile image. Set a value between 1 and 512.
     * 
     * @param tileWidth
     *        Number of thumbnails in each row of a tile image. Set a value between 1 and 512.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HlsImageBasedTrickPlaySettings withTileWidth(Integer tileWidth) {
        setTileWidth(tileWidth);
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
        if (getIntervalCadence() != null)
            sb.append("IntervalCadence: ").append(getIntervalCadence()).append(",");
        if (getThumbnailHeight() != null)
            sb.append("ThumbnailHeight: ").append(getThumbnailHeight()).append(",");
        if (getThumbnailInterval() != null)
            sb.append("ThumbnailInterval: ").append(getThumbnailInterval()).append(",");
        if (getThumbnailWidth() != null)
            sb.append("ThumbnailWidth: ").append(getThumbnailWidth()).append(",");
        if (getTileHeight() != null)
            sb.append("TileHeight: ").append(getTileHeight()).append(",");
        if (getTileWidth() != null)
            sb.append("TileWidth: ").append(getTileWidth());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HlsImageBasedTrickPlaySettings == false)
            return false;
        HlsImageBasedTrickPlaySettings other = (HlsImageBasedTrickPlaySettings) obj;
        if (other.getIntervalCadence() == null ^ this.getIntervalCadence() == null)
            return false;
        if (other.getIntervalCadence() != null && other.getIntervalCadence().equals(this.getIntervalCadence()) == false)
            return false;
        if (other.getThumbnailHeight() == null ^ this.getThumbnailHeight() == null)
            return false;
        if (other.getThumbnailHeight() != null && other.getThumbnailHeight().equals(this.getThumbnailHeight()) == false)
            return false;
        if (other.getThumbnailInterval() == null ^ this.getThumbnailInterval() == null)
            return false;
        if (other.getThumbnailInterval() != null && other.getThumbnailInterval().equals(this.getThumbnailInterval()) == false)
            return false;
        if (other.getThumbnailWidth() == null ^ this.getThumbnailWidth() == null)
            return false;
        if (other.getThumbnailWidth() != null && other.getThumbnailWidth().equals(this.getThumbnailWidth()) == false)
            return false;
        if (other.getTileHeight() == null ^ this.getTileHeight() == null)
            return false;
        if (other.getTileHeight() != null && other.getTileHeight().equals(this.getTileHeight()) == false)
            return false;
        if (other.getTileWidth() == null ^ this.getTileWidth() == null)
            return false;
        if (other.getTileWidth() != null && other.getTileWidth().equals(this.getTileWidth()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getIntervalCadence() == null) ? 0 : getIntervalCadence().hashCode());
        hashCode = prime * hashCode + ((getThumbnailHeight() == null) ? 0 : getThumbnailHeight().hashCode());
        hashCode = prime * hashCode + ((getThumbnailInterval() == null) ? 0 : getThumbnailInterval().hashCode());
        hashCode = prime * hashCode + ((getThumbnailWidth() == null) ? 0 : getThumbnailWidth().hashCode());
        hashCode = prime * hashCode + ((getTileHeight() == null) ? 0 : getTileHeight().hashCode());
        hashCode = prime * hashCode + ((getTileWidth() == null) ? 0 : getTileWidth().hashCode());
        return hashCode;
    }

    @Override
    public HlsImageBasedTrickPlaySettings clone() {
        try {
            return (HlsImageBasedTrickPlaySettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.HlsImageBasedTrickPlaySettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
