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
 * Create Dolby Vision Profile 5 or Profile 8.1 compatible video output.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/DolbyVision" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DolbyVision implements Serializable, Cloneable, StructuredPojo {

    /**
     * Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL values in
     * your input with new values.
     */
    private DolbyVisionLevel6Metadata l6Metadata;
    /** Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies. */
    private String l6Mode;
    /**
     * Required when you set Dolby Vision Profile to Profile 8.1. When you set Content mapping to None, content mapping
     * is not applied to the HDR10-compatible signal. Depending on the source peak nit level, clipping might occur on
     * HDR devices without Dolby Vision. When you set Content mapping to HDR10 1000, the transcoder creates a 1,000 nits
     * peak HDR10-compatible signal by applying static content mapping to the source. This mode is speed-optimized for
     * PQ10 sources with metadata that is created from analysis. For graded Dolby Vision content, be aware that creative
     * intent might not be guaranteed with extreme 1,000 nits trims.
     */
    private String mapping;
    /**
     * Required when you enable Dolby Vision. Use Profile 5 to include frame-interleaved Dolby Vision metadata in your
     * output. Your input must include Dolby Vision metadata or an HDR10 YUV color space. Use Profile 8.1 to include
     * frame-interleaved Dolby Vision metadata and HDR10 metadata in your output. Your input must include Dolby Vision
     * metadata.
     */
    private String profile;

    /**
     * Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL values in
     * your input with new values.
     * 
     * @param l6Metadata
     *        Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL values
     *        in your input with new values.
     */

    public void setL6Metadata(DolbyVisionLevel6Metadata l6Metadata) {
        this.l6Metadata = l6Metadata;
    }

    /**
     * Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL values in
     * your input with new values.
     * 
     * @return Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL
     *         values in your input with new values.
     */

    public DolbyVisionLevel6Metadata getL6Metadata() {
        return this.l6Metadata;
    }

    /**
     * Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL values in
     * your input with new values.
     * 
     * @param l6Metadata
     *        Use these settings when you set DolbyVisionLevel6Mode to SPECIFY to override the MaxCLL and MaxFALL values
     *        in your input with new values.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DolbyVision withL6Metadata(DolbyVisionLevel6Metadata l6Metadata) {
        setL6Metadata(l6Metadata);
        return this;
    }

    /**
     * Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
     * 
     * @param l6Mode
     *        Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
     * @see DolbyVisionLevel6Mode
     */

    public void setL6Mode(String l6Mode) {
        this.l6Mode = l6Mode;
    }

    /**
     * Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
     * 
     * @return Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
     * @see DolbyVisionLevel6Mode
     */

    public String getL6Mode() {
        return this.l6Mode;
    }

    /**
     * Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
     * 
     * @param l6Mode
     *        Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DolbyVisionLevel6Mode
     */

    public DolbyVision withL6Mode(String l6Mode) {
        setL6Mode(l6Mode);
        return this;
    }

    /**
     * Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
     * 
     * @param l6Mode
     *        Use Dolby Vision Mode to choose how the service will handle Dolby Vision MaxCLL and MaxFALL properies.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DolbyVisionLevel6Mode
     */

    public DolbyVision withL6Mode(DolbyVisionLevel6Mode l6Mode) {
        this.l6Mode = l6Mode.toString();
        return this;
    }

    /**
     * Required when you set Dolby Vision Profile to Profile 8.1. When you set Content mapping to None, content mapping
     * is not applied to the HDR10-compatible signal. Depending on the source peak nit level, clipping might occur on
     * HDR devices without Dolby Vision. When you set Content mapping to HDR10 1000, the transcoder creates a 1,000 nits
     * peak HDR10-compatible signal by applying static content mapping to the source. This mode is speed-optimized for
     * PQ10 sources with metadata that is created from analysis. For graded Dolby Vision content, be aware that creative
     * intent might not be guaranteed with extreme 1,000 nits trims.
     * 
     * @param mapping
     *        Required when you set Dolby Vision Profile to Profile 8.1. When you set Content mapping to None, content
     *        mapping is not applied to the HDR10-compatible signal. Depending on the source peak nit level, clipping
     *        might occur on HDR devices without Dolby Vision. When you set Content mapping to HDR10 1000, the
     *        transcoder creates a 1,000 nits peak HDR10-compatible signal by applying static content mapping to the
     *        source. This mode is speed-optimized for PQ10 sources with metadata that is created from analysis. For
     *        graded Dolby Vision content, be aware that creative intent might not be guaranteed with extreme 1,000 nits
     *        trims.
     * @see DolbyVisionMapping
     */

    public void setMapping(String mapping) {
        this.mapping = mapping;
    }

    /**
     * Required when you set Dolby Vision Profile to Profile 8.1. When you set Content mapping to None, content mapping
     * is not applied to the HDR10-compatible signal. Depending on the source peak nit level, clipping might occur on
     * HDR devices without Dolby Vision. When you set Content mapping to HDR10 1000, the transcoder creates a 1,000 nits
     * peak HDR10-compatible signal by applying static content mapping to the source. This mode is speed-optimized for
     * PQ10 sources with metadata that is created from analysis. For graded Dolby Vision content, be aware that creative
     * intent might not be guaranteed with extreme 1,000 nits trims.
     * 
     * @return Required when you set Dolby Vision Profile to Profile 8.1. When you set Content mapping to None, content
     *         mapping is not applied to the HDR10-compatible signal. Depending on the source peak nit level, clipping
     *         might occur on HDR devices without Dolby Vision. When you set Content mapping to HDR10 1000, the
     *         transcoder creates a 1,000 nits peak HDR10-compatible signal by applying static content mapping to the
     *         source. This mode is speed-optimized for PQ10 sources with metadata that is created from analysis. For
     *         graded Dolby Vision content, be aware that creative intent might not be guaranteed with extreme 1,000
     *         nits trims.
     * @see DolbyVisionMapping
     */

    public String getMapping() {
        return this.mapping;
    }

    /**
     * Required when you set Dolby Vision Profile to Profile 8.1. When you set Content mapping to None, content mapping
     * is not applied to the HDR10-compatible signal. Depending on the source peak nit level, clipping might occur on
     * HDR devices without Dolby Vision. When you set Content mapping to HDR10 1000, the transcoder creates a 1,000 nits
     * peak HDR10-compatible signal by applying static content mapping to the source. This mode is speed-optimized for
     * PQ10 sources with metadata that is created from analysis. For graded Dolby Vision content, be aware that creative
     * intent might not be guaranteed with extreme 1,000 nits trims.
     * 
     * @param mapping
     *        Required when you set Dolby Vision Profile to Profile 8.1. When you set Content mapping to None, content
     *        mapping is not applied to the HDR10-compatible signal. Depending on the source peak nit level, clipping
     *        might occur on HDR devices without Dolby Vision. When you set Content mapping to HDR10 1000, the
     *        transcoder creates a 1,000 nits peak HDR10-compatible signal by applying static content mapping to the
     *        source. This mode is speed-optimized for PQ10 sources with metadata that is created from analysis. For
     *        graded Dolby Vision content, be aware that creative intent might not be guaranteed with extreme 1,000 nits
     *        trims.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DolbyVisionMapping
     */

    public DolbyVision withMapping(String mapping) {
        setMapping(mapping);
        return this;
    }

    /**
     * Required when you set Dolby Vision Profile to Profile 8.1. When you set Content mapping to None, content mapping
     * is not applied to the HDR10-compatible signal. Depending on the source peak nit level, clipping might occur on
     * HDR devices without Dolby Vision. When you set Content mapping to HDR10 1000, the transcoder creates a 1,000 nits
     * peak HDR10-compatible signal by applying static content mapping to the source. This mode is speed-optimized for
     * PQ10 sources with metadata that is created from analysis. For graded Dolby Vision content, be aware that creative
     * intent might not be guaranteed with extreme 1,000 nits trims.
     * 
     * @param mapping
     *        Required when you set Dolby Vision Profile to Profile 8.1. When you set Content mapping to None, content
     *        mapping is not applied to the HDR10-compatible signal. Depending on the source peak nit level, clipping
     *        might occur on HDR devices without Dolby Vision. When you set Content mapping to HDR10 1000, the
     *        transcoder creates a 1,000 nits peak HDR10-compatible signal by applying static content mapping to the
     *        source. This mode is speed-optimized for PQ10 sources with metadata that is created from analysis. For
     *        graded Dolby Vision content, be aware that creative intent might not be guaranteed with extreme 1,000 nits
     *        trims.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DolbyVisionMapping
     */

    public DolbyVision withMapping(DolbyVisionMapping mapping) {
        this.mapping = mapping.toString();
        return this;
    }

    /**
     * Required when you enable Dolby Vision. Use Profile 5 to include frame-interleaved Dolby Vision metadata in your
     * output. Your input must include Dolby Vision metadata or an HDR10 YUV color space. Use Profile 8.1 to include
     * frame-interleaved Dolby Vision metadata and HDR10 metadata in your output. Your input must include Dolby Vision
     * metadata.
     * 
     * @param profile
     *        Required when you enable Dolby Vision. Use Profile 5 to include frame-interleaved Dolby Vision metadata in
     *        your output. Your input must include Dolby Vision metadata or an HDR10 YUV color space. Use Profile 8.1 to
     *        include frame-interleaved Dolby Vision metadata and HDR10 metadata in your output. Your input must include
     *        Dolby Vision metadata.
     * @see DolbyVisionProfile
     */

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * Required when you enable Dolby Vision. Use Profile 5 to include frame-interleaved Dolby Vision metadata in your
     * output. Your input must include Dolby Vision metadata or an HDR10 YUV color space. Use Profile 8.1 to include
     * frame-interleaved Dolby Vision metadata and HDR10 metadata in your output. Your input must include Dolby Vision
     * metadata.
     * 
     * @return Required when you enable Dolby Vision. Use Profile 5 to include frame-interleaved Dolby Vision metadata
     *         in your output. Your input must include Dolby Vision metadata or an HDR10 YUV color space. Use Profile
     *         8.1 to include frame-interleaved Dolby Vision metadata and HDR10 metadata in your output. Your input must
     *         include Dolby Vision metadata.
     * @see DolbyVisionProfile
     */

    public String getProfile() {
        return this.profile;
    }

    /**
     * Required when you enable Dolby Vision. Use Profile 5 to include frame-interleaved Dolby Vision metadata in your
     * output. Your input must include Dolby Vision metadata or an HDR10 YUV color space. Use Profile 8.1 to include
     * frame-interleaved Dolby Vision metadata and HDR10 metadata in your output. Your input must include Dolby Vision
     * metadata.
     * 
     * @param profile
     *        Required when you enable Dolby Vision. Use Profile 5 to include frame-interleaved Dolby Vision metadata in
     *        your output. Your input must include Dolby Vision metadata or an HDR10 YUV color space. Use Profile 8.1 to
     *        include frame-interleaved Dolby Vision metadata and HDR10 metadata in your output. Your input must include
     *        Dolby Vision metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DolbyVisionProfile
     */

    public DolbyVision withProfile(String profile) {
        setProfile(profile);
        return this;
    }

    /**
     * Required when you enable Dolby Vision. Use Profile 5 to include frame-interleaved Dolby Vision metadata in your
     * output. Your input must include Dolby Vision metadata or an HDR10 YUV color space. Use Profile 8.1 to include
     * frame-interleaved Dolby Vision metadata and HDR10 metadata in your output. Your input must include Dolby Vision
     * metadata.
     * 
     * @param profile
     *        Required when you enable Dolby Vision. Use Profile 5 to include frame-interleaved Dolby Vision metadata in
     *        your output. Your input must include Dolby Vision metadata or an HDR10 YUV color space. Use Profile 8.1 to
     *        include frame-interleaved Dolby Vision metadata and HDR10 metadata in your output. Your input must include
     *        Dolby Vision metadata.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DolbyVisionProfile
     */

    public DolbyVision withProfile(DolbyVisionProfile profile) {
        this.profile = profile.toString();
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
        if (getL6Metadata() != null)
            sb.append("L6Metadata: ").append(getL6Metadata()).append(",");
        if (getL6Mode() != null)
            sb.append("L6Mode: ").append(getL6Mode()).append(",");
        if (getMapping() != null)
            sb.append("Mapping: ").append(getMapping()).append(",");
        if (getProfile() != null)
            sb.append("Profile: ").append(getProfile());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DolbyVision == false)
            return false;
        DolbyVision other = (DolbyVision) obj;
        if (other.getL6Metadata() == null ^ this.getL6Metadata() == null)
            return false;
        if (other.getL6Metadata() != null && other.getL6Metadata().equals(this.getL6Metadata()) == false)
            return false;
        if (other.getL6Mode() == null ^ this.getL6Mode() == null)
            return false;
        if (other.getL6Mode() != null && other.getL6Mode().equals(this.getL6Mode()) == false)
            return false;
        if (other.getMapping() == null ^ this.getMapping() == null)
            return false;
        if (other.getMapping() != null && other.getMapping().equals(this.getMapping()) == false)
            return false;
        if (other.getProfile() == null ^ this.getProfile() == null)
            return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getL6Metadata() == null) ? 0 : getL6Metadata().hashCode());
        hashCode = prime * hashCode + ((getL6Mode() == null) ? 0 : getL6Mode().hashCode());
        hashCode = prime * hashCode + ((getMapping() == null) ? 0 : getMapping().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        return hashCode;
    }

    @Override
    public DolbyVision clone() {
        try {
            return (DolbyVision) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.DolbyVisionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
