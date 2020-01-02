/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Settings for Dolby Vision
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
     * In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore, all of
     * your inputs must contain Dolby Vision frame interleaved data.
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
     * In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore, all of
     * your inputs must contain Dolby Vision frame interleaved data.
     * 
     * @param profile
     *        In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore,
     *        all of your inputs must contain Dolby Vision frame interleaved data.
     * @see DolbyVisionProfile
     */

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore, all of
     * your inputs must contain Dolby Vision frame interleaved data.
     * 
     * @return In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore,
     *         all of your inputs must contain Dolby Vision frame interleaved data.
     * @see DolbyVisionProfile
     */

    public String getProfile() {
        return this.profile;
    }

    /**
     * In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore, all of
     * your inputs must contain Dolby Vision frame interleaved data.
     * 
     * @param profile
     *        In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore,
     *        all of your inputs must contain Dolby Vision frame interleaved data.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DolbyVisionProfile
     */

    public DolbyVision withProfile(String profile) {
        setProfile(profile);
        return this;
    }

    /**
     * In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore, all of
     * your inputs must contain Dolby Vision frame interleaved data.
     * 
     * @param profile
     *        In the current MediaConvert implementation, the Dolby Vision profile is always 5 (PROFILE_5). Therefore,
     *        all of your inputs must contain Dolby Vision frame interleaved data.
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
