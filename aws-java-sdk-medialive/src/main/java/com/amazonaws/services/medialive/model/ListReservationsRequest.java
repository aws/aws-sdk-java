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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Placeholder documentation for ListReservationsRequest
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/ListReservations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListReservationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
     */
    private String channelClass;
    /** Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO' */
    private String codec;

    private Integer maxResults;
    /**
     * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
     */
    private String maximumBitrate;
    /** Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS' */
    private String maximumFramerate;

    private String nextToken;
    /** Filter by resolution, 'SD', 'HD', or 'UHD' */
    private String resolution;
    /** Filter by resource type, 'INPUT', 'OUTPUT', or 'CHANNEL' */
    private String resourceType;
    /**
     * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
     */
    private String specialFeature;
    /**
     * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
     */
    private String videoQuality;

    /**
     * Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
     * 
     * @param channelClass
     *        Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
     */

    public void setChannelClass(String channelClass) {
        this.channelClass = channelClass;
    }

    /**
     * Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
     * 
     * @return Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
     */

    public String getChannelClass() {
        return this.channelClass;
    }

    /**
     * Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
     * 
     * @param channelClass
     *        Filter by channel class, 'STANDARD' or 'SINGLE_PIPELINE'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReservationsRequest withChannelClass(String channelClass) {
        setChannelClass(channelClass);
        return this;
    }

    /**
     * Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
     * 
     * @param codec
     *        Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
     */

    public void setCodec(String codec) {
        this.codec = codec;
    }

    /**
     * Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
     * 
     * @return Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
     */

    public String getCodec() {
        return this.codec;
    }

    /**
     * Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
     * 
     * @param codec
     *        Filter by codec, 'AVC', 'HEVC', 'MPEG2', or 'AUDIO'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReservationsRequest withCodec(String codec) {
        setCodec(codec);
        return this;
    }

    /**
     * @param maxResults
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * @return
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @param maxResults
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReservationsRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
        return this;
    }

    /**
     * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
     * 
     * @param maximumBitrate
     *        Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
     */

    public void setMaximumBitrate(String maximumBitrate) {
        this.maximumBitrate = maximumBitrate;
    }

    /**
     * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
     * 
     * @return Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
     */

    public String getMaximumBitrate() {
        return this.maximumBitrate;
    }

    /**
     * Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
     * 
     * @param maximumBitrate
     *        Filter by bitrate, 'MAX_10_MBPS', 'MAX_20_MBPS', or 'MAX_50_MBPS'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReservationsRequest withMaximumBitrate(String maximumBitrate) {
        setMaximumBitrate(maximumBitrate);
        return this;
    }

    /**
     * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
     * 
     * @param maximumFramerate
     *        Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
     */

    public void setMaximumFramerate(String maximumFramerate) {
        this.maximumFramerate = maximumFramerate;
    }

    /**
     * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
     * 
     * @return Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
     */

    public String getMaximumFramerate() {
        return this.maximumFramerate;
    }

    /**
     * Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
     * 
     * @param maximumFramerate
     *        Filter by framerate, 'MAX_30_FPS' or 'MAX_60_FPS'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReservationsRequest withMaximumFramerate(String maximumFramerate) {
        setMaximumFramerate(maximumFramerate);
        return this;
    }

    /**
     * @param nextToken
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * @return
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @param nextToken
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReservationsRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * Filter by resolution, 'SD', 'HD', or 'UHD'
     * 
     * @param resolution
     *        Filter by resolution, 'SD', 'HD', or 'UHD'
     */

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * Filter by resolution, 'SD', 'HD', or 'UHD'
     * 
     * @return Filter by resolution, 'SD', 'HD', or 'UHD'
     */

    public String getResolution() {
        return this.resolution;
    }

    /**
     * Filter by resolution, 'SD', 'HD', or 'UHD'
     * 
     * @param resolution
     *        Filter by resolution, 'SD', 'HD', or 'UHD'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReservationsRequest withResolution(String resolution) {
        setResolution(resolution);
        return this;
    }

    /**
     * Filter by resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
     * 
     * @param resourceType
     *        Filter by resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
     */

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    /**
     * Filter by resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
     * 
     * @return Filter by resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
     */

    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * Filter by resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
     * 
     * @param resourceType
     *        Filter by resource type, 'INPUT', 'OUTPUT', or 'CHANNEL'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReservationsRequest withResourceType(String resourceType) {
        setResourceType(resourceType);
        return this;
    }

    /**
     * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
     * 
     * @param specialFeature
     *        Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
     */

    public void setSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
    }

    /**
     * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
     * 
     * @return Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
     */

    public String getSpecialFeature() {
        return this.specialFeature;
    }

    /**
     * Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
     * 
     * @param specialFeature
     *        Filter by special feature, 'ADVANCED_AUDIO' or 'AUDIO_NORMALIZATION'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReservationsRequest withSpecialFeature(String specialFeature) {
        setSpecialFeature(specialFeature);
        return this;
    }

    /**
     * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
     * 
     * @param videoQuality
     *        Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
     */

    public void setVideoQuality(String videoQuality) {
        this.videoQuality = videoQuality;
    }

    /**
     * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
     * 
     * @return Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
     */

    public String getVideoQuality() {
        return this.videoQuality;
    }

    /**
     * Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
     * 
     * @param videoQuality
     *        Filter by video quality, 'STANDARD', 'ENHANCED', or 'PREMIUM'
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReservationsRequest withVideoQuality(String videoQuality) {
        setVideoQuality(videoQuality);
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
        if (getChannelClass() != null)
            sb.append("ChannelClass: ").append(getChannelClass()).append(",");
        if (getCodec() != null)
            sb.append("Codec: ").append(getCodec()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults()).append(",");
        if (getMaximumBitrate() != null)
            sb.append("MaximumBitrate: ").append(getMaximumBitrate()).append(",");
        if (getMaximumFramerate() != null)
            sb.append("MaximumFramerate: ").append(getMaximumFramerate()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getResolution() != null)
            sb.append("Resolution: ").append(getResolution()).append(",");
        if (getResourceType() != null)
            sb.append("ResourceType: ").append(getResourceType()).append(",");
        if (getSpecialFeature() != null)
            sb.append("SpecialFeature: ").append(getSpecialFeature()).append(",");
        if (getVideoQuality() != null)
            sb.append("VideoQuality: ").append(getVideoQuality());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListReservationsRequest == false)
            return false;
        ListReservationsRequest other = (ListReservationsRequest) obj;
        if (other.getChannelClass() == null ^ this.getChannelClass() == null)
            return false;
        if (other.getChannelClass() != null && other.getChannelClass().equals(this.getChannelClass()) == false)
            return false;
        if (other.getCodec() == null ^ this.getCodec() == null)
            return false;
        if (other.getCodec() != null && other.getCodec().equals(this.getCodec()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        if (other.getMaximumBitrate() == null ^ this.getMaximumBitrate() == null)
            return false;
        if (other.getMaximumBitrate() != null && other.getMaximumBitrate().equals(this.getMaximumBitrate()) == false)
            return false;
        if (other.getMaximumFramerate() == null ^ this.getMaximumFramerate() == null)
            return false;
        if (other.getMaximumFramerate() != null && other.getMaximumFramerate().equals(this.getMaximumFramerate()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getResolution() == null ^ this.getResolution() == null)
            return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false)
            return false;
        if (other.getResourceType() == null ^ this.getResourceType() == null)
            return false;
        if (other.getResourceType() != null && other.getResourceType().equals(this.getResourceType()) == false)
            return false;
        if (other.getSpecialFeature() == null ^ this.getSpecialFeature() == null)
            return false;
        if (other.getSpecialFeature() != null && other.getSpecialFeature().equals(this.getSpecialFeature()) == false)
            return false;
        if (other.getVideoQuality() == null ^ this.getVideoQuality() == null)
            return false;
        if (other.getVideoQuality() != null && other.getVideoQuality().equals(this.getVideoQuality()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getChannelClass() == null) ? 0 : getChannelClass().hashCode());
        hashCode = prime * hashCode + ((getCodec() == null) ? 0 : getCodec().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        hashCode = prime * hashCode + ((getMaximumBitrate() == null) ? 0 : getMaximumBitrate().hashCode());
        hashCode = prime * hashCode + ((getMaximumFramerate() == null) ? 0 : getMaximumFramerate().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode());
        hashCode = prime * hashCode + ((getResourceType() == null) ? 0 : getResourceType().hashCode());
        hashCode = prime * hashCode + ((getSpecialFeature() == null) ? 0 : getSpecialFeature().hashCode());
        hashCode = prime * hashCode + ((getVideoQuality() == null) ? 0 : getVideoQuality().hashCode());
        return hashCode;
    }

    @Override
    public ListReservationsRequest clone() {
        return (ListReservationsRequest) super.clone();
    }

}
