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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/PutPlaybackConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutPlaybackConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders
     * for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as
     * needed when calling the ADS. Alternately, for testing you can provide a static VAST URL. The maximum length is
     * 25,000 characters.
     * </p>
     */
    private String adDecisionServerUrl;
    /**
     * <p>
     * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment
     * management.
     * </p>
     */
    private CdnConfiguration cdnConfiguration;
    /**
     * <p>
     * The configuration for DASH content.
     * </p>
     */
    private DashConfigurationForPut dashConfiguration;
    /**
     * <p>
     * The identifier for the playback configuration.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental
     * MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID
     * configurations. For VPAID, the slate is required because MediaTailor provides it in the slots that are designated
     * for dynamic ad content. The slate must be a high-quality asset that contains both audio and video.
     * </p>
     */
    private String slateAdUrl;
    /**
     * <p>
     * The tags to assign to the playback configuration.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * The name that is used to associate this playback configuration with a custom transcode profile. This overrides
     * the dynamic transcoding defaults of MediaTailor. Use this only if you have already set up custom profiles with
     * the help of AWS Support.
     * </p>
     */
    private String transcodeProfileName;
    /**
     * <p>
     * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
     * </p>
     */
    private String videoContentSourceUrl;

    /**
     * <p>
     * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders
     * for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as
     * needed when calling the ADS. Alternately, for testing you can provide a static VAST URL. The maximum length is
     * 25,000 characters.
     * </p>
     * 
     * @param adDecisionServerUrl
     *        The URL for the ad decision server (ADS). This includes the specification of static parameters and
     *        placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and
     *        session-specific parameters as needed when calling the ADS. Alternately, for testing you can provide a
     *        static VAST URL. The maximum length is 25,000 characters.
     */

    public void setAdDecisionServerUrl(String adDecisionServerUrl) {
        this.adDecisionServerUrl = adDecisionServerUrl;
    }

    /**
     * <p>
     * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders
     * for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as
     * needed when calling the ADS. Alternately, for testing you can provide a static VAST URL. The maximum length is
     * 25,000 characters.
     * </p>
     * 
     * @return The URL for the ad decision server (ADS). This includes the specification of static parameters and
     *         placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and
     *         session-specific parameters as needed when calling the ADS. Alternately, for testing you can provide a
     *         static VAST URL. The maximum length is 25,000 characters.
     */

    public String getAdDecisionServerUrl() {
        return this.adDecisionServerUrl;
    }

    /**
     * <p>
     * The URL for the ad decision server (ADS). This includes the specification of static parameters and placeholders
     * for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and session-specific parameters as
     * needed when calling the ADS. Alternately, for testing you can provide a static VAST URL. The maximum length is
     * 25,000 characters.
     * </p>
     * 
     * @param adDecisionServerUrl
     *        The URL for the ad decision server (ADS). This includes the specification of static parameters and
     *        placeholders for dynamic parameters. AWS Elemental MediaTailor substitutes player-specific and
     *        session-specific parameters as needed when calling the ADS. Alternately, for testing you can provide a
     *        static VAST URL. The maximum length is 25,000 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPlaybackConfigurationRequest withAdDecisionServerUrl(String adDecisionServerUrl) {
        setAdDecisionServerUrl(adDecisionServerUrl);
        return this;
    }

    /**
     * <p>
     * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment
     * management.
     * </p>
     * 
     * @param cdnConfiguration
     *        The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad
     *        segment management.
     */

    public void setCdnConfiguration(CdnConfiguration cdnConfiguration) {
        this.cdnConfiguration = cdnConfiguration;
    }

    /**
     * <p>
     * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment
     * management.
     * </p>
     * 
     * @return The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad
     *         segment management.
     */

    public CdnConfiguration getCdnConfiguration() {
        return this.cdnConfiguration;
    }

    /**
     * <p>
     * The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad segment
     * management.
     * </p>
     * 
     * @param cdnConfiguration
     *        The configuration for using a content delivery network (CDN), like Amazon CloudFront, for content and ad
     *        segment management.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPlaybackConfigurationRequest withCdnConfiguration(CdnConfiguration cdnConfiguration) {
        setCdnConfiguration(cdnConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration for DASH content.
     * </p>
     * 
     * @param dashConfiguration
     *        The configuration for DASH content.
     */

    public void setDashConfiguration(DashConfigurationForPut dashConfiguration) {
        this.dashConfiguration = dashConfiguration;
    }

    /**
     * <p>
     * The configuration for DASH content.
     * </p>
     * 
     * @return The configuration for DASH content.
     */

    public DashConfigurationForPut getDashConfiguration() {
        return this.dashConfiguration;
    }

    /**
     * <p>
     * The configuration for DASH content.
     * </p>
     * 
     * @param dashConfiguration
     *        The configuration for DASH content.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPlaybackConfigurationRequest withDashConfiguration(DashConfigurationForPut dashConfiguration) {
        setDashConfiguration(dashConfiguration);
        return this;
    }

    /**
     * <p>
     * The identifier for the playback configuration.
     * </p>
     * 
     * @param name
     *        The identifier for the playback configuration.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The identifier for the playback configuration.
     * </p>
     * 
     * @return The identifier for the playback configuration.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The identifier for the playback configuration.
     * </p>
     * 
     * @param name
     *        The identifier for the playback configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPlaybackConfigurationRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental
     * MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID
     * configurations. For VPAID, the slate is required because MediaTailor provides it in the slots that are designated
     * for dynamic ad content. The slate must be a high-quality asset that contains both audio and video.
     * </p>
     * 
     * @param slateAdUrl
     *        The URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS
     *        Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional
     *        for non-VPAID configurations. For VPAID, the slate is required because MediaTailor provides it in the
     *        slots that are designated for dynamic ad content. The slate must be a high-quality asset that contains
     *        both audio and video.
     */

    public void setSlateAdUrl(String slateAdUrl) {
        this.slateAdUrl = slateAdUrl;
    }

    /**
     * <p>
     * The URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental
     * MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID
     * configurations. For VPAID, the slate is required because MediaTailor provides it in the slots that are designated
     * for dynamic ad content. The slate must be a high-quality asset that contains both audio and video.
     * </p>
     * 
     * @return The URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS
     *         Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional
     *         for non-VPAID configurations. For VPAID, the slate is required because MediaTailor provides it in the
     *         slots that are designated for dynamic ad content. The slate must be a high-quality asset that contains
     *         both audio and video.
     */

    public String getSlateAdUrl() {
        return this.slateAdUrl;
    }

    /**
     * <p>
     * The URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS Elemental
     * MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional for non-VPAID
     * configurations. For VPAID, the slate is required because MediaTailor provides it in the slots that are designated
     * for dynamic ad content. The slate must be a high-quality asset that contains both audio and video.
     * </p>
     * 
     * @param slateAdUrl
     *        The URL for a high-quality video asset to transcode and use to fill in time that's not used by ads. AWS
     *        Elemental MediaTailor shows the slate to fill in gaps in media content. Configuring the slate is optional
     *        for non-VPAID configurations. For VPAID, the slate is required because MediaTailor provides it in the
     *        slots that are designated for dynamic ad content. The slate must be a high-quality asset that contains
     *        both audio and video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPlaybackConfigurationRequest withSlateAdUrl(String slateAdUrl) {
        setSlateAdUrl(slateAdUrl);
        return this;
    }

    /**
     * <p>
     * The tags to assign to the playback configuration.
     * </p>
     * 
     * @return The tags to assign to the playback configuration.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags to assign to the playback configuration.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the playback configuration.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * The tags to assign to the playback configuration.
     * </p>
     * 
     * @param tags
     *        The tags to assign to the playback configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPlaybackConfigurationRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public PutPlaybackConfigurationRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPlaybackConfigurationRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * The name that is used to associate this playback configuration with a custom transcode profile. This overrides
     * the dynamic transcoding defaults of MediaTailor. Use this only if you have already set up custom profiles with
     * the help of AWS Support.
     * </p>
     * 
     * @param transcodeProfileName
     *        The name that is used to associate this playback configuration with a custom transcode profile. This
     *        overrides the dynamic transcoding defaults of MediaTailor. Use this only if you have already set up custom
     *        profiles with the help of AWS Support.
     */

    public void setTranscodeProfileName(String transcodeProfileName) {
        this.transcodeProfileName = transcodeProfileName;
    }

    /**
     * <p>
     * The name that is used to associate this playback configuration with a custom transcode profile. This overrides
     * the dynamic transcoding defaults of MediaTailor. Use this only if you have already set up custom profiles with
     * the help of AWS Support.
     * </p>
     * 
     * @return The name that is used to associate this playback configuration with a custom transcode profile. This
     *         overrides the dynamic transcoding defaults of MediaTailor. Use this only if you have already set up
     *         custom profiles with the help of AWS Support.
     */

    public String getTranscodeProfileName() {
        return this.transcodeProfileName;
    }

    /**
     * <p>
     * The name that is used to associate this playback configuration with a custom transcode profile. This overrides
     * the dynamic transcoding defaults of MediaTailor. Use this only if you have already set up custom profiles with
     * the help of AWS Support.
     * </p>
     * 
     * @param transcodeProfileName
     *        The name that is used to associate this playback configuration with a custom transcode profile. This
     *        overrides the dynamic transcoding defaults of MediaTailor. Use this only if you have already set up custom
     *        profiles with the help of AWS Support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPlaybackConfigurationRequest withTranscodeProfileName(String transcodeProfileName) {
        setTranscodeProfileName(transcodeProfileName);
        return this;
    }

    /**
     * <p>
     * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
     * </p>
     * 
     * @param videoContentSourceUrl
     *        The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512
     *        characters.
     */

    public void setVideoContentSourceUrl(String videoContentSourceUrl) {
        this.videoContentSourceUrl = videoContentSourceUrl;
    }

    /**
     * <p>
     * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
     * </p>
     * 
     * @return The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512
     *         characters.
     */

    public String getVideoContentSourceUrl() {
        return this.videoContentSourceUrl;
    }

    /**
     * <p>
     * The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512 characters.
     * </p>
     * 
     * @param videoContentSourceUrl
     *        The URL prefix for the master playlist for the stream, minus the asset ID. The maximum length is 512
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutPlaybackConfigurationRequest withVideoContentSourceUrl(String videoContentSourceUrl) {
        setVideoContentSourceUrl(videoContentSourceUrl);
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
        if (getAdDecisionServerUrl() != null)
            sb.append("AdDecisionServerUrl: ").append(getAdDecisionServerUrl()).append(",");
        if (getCdnConfiguration() != null)
            sb.append("CdnConfiguration: ").append(getCdnConfiguration()).append(",");
        if (getDashConfiguration() != null)
            sb.append("DashConfiguration: ").append(getDashConfiguration()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSlateAdUrl() != null)
            sb.append("SlateAdUrl: ").append(getSlateAdUrl()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getTranscodeProfileName() != null)
            sb.append("TranscodeProfileName: ").append(getTranscodeProfileName()).append(",");
        if (getVideoContentSourceUrl() != null)
            sb.append("VideoContentSourceUrl: ").append(getVideoContentSourceUrl());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutPlaybackConfigurationRequest == false)
            return false;
        PutPlaybackConfigurationRequest other = (PutPlaybackConfigurationRequest) obj;
        if (other.getAdDecisionServerUrl() == null ^ this.getAdDecisionServerUrl() == null)
            return false;
        if (other.getAdDecisionServerUrl() != null && other.getAdDecisionServerUrl().equals(this.getAdDecisionServerUrl()) == false)
            return false;
        if (other.getCdnConfiguration() == null ^ this.getCdnConfiguration() == null)
            return false;
        if (other.getCdnConfiguration() != null && other.getCdnConfiguration().equals(this.getCdnConfiguration()) == false)
            return false;
        if (other.getDashConfiguration() == null ^ this.getDashConfiguration() == null)
            return false;
        if (other.getDashConfiguration() != null && other.getDashConfiguration().equals(this.getDashConfiguration()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSlateAdUrl() == null ^ this.getSlateAdUrl() == null)
            return false;
        if (other.getSlateAdUrl() != null && other.getSlateAdUrl().equals(this.getSlateAdUrl()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getTranscodeProfileName() == null ^ this.getTranscodeProfileName() == null)
            return false;
        if (other.getTranscodeProfileName() != null && other.getTranscodeProfileName().equals(this.getTranscodeProfileName()) == false)
            return false;
        if (other.getVideoContentSourceUrl() == null ^ this.getVideoContentSourceUrl() == null)
            return false;
        if (other.getVideoContentSourceUrl() != null && other.getVideoContentSourceUrl().equals(this.getVideoContentSourceUrl()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAdDecisionServerUrl() == null) ? 0 : getAdDecisionServerUrl().hashCode());
        hashCode = prime * hashCode + ((getCdnConfiguration() == null) ? 0 : getCdnConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDashConfiguration() == null) ? 0 : getDashConfiguration().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSlateAdUrl() == null) ? 0 : getSlateAdUrl().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTranscodeProfileName() == null) ? 0 : getTranscodeProfileName().hashCode());
        hashCode = prime * hashCode + ((getVideoContentSourceUrl() == null) ? 0 : getVideoContentSourceUrl().hashCode());
        return hashCode;
    }

    @Override
    public PutPlaybackConfigurationRequest clone() {
        return (PutPlaybackConfigurationRequest) super.clone();
    }

}
