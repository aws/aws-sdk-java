/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * These settings relate to your MXF output container.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/MxfSettings" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MxfSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Optional. When you have AFD signaling set up in your output video stream, use this setting to choose whether to
     * also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF wrapper.
     * Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video stream for this output to
     * the MXF wrapper. Regardless of which option you choose, the AFD values remain in the video stream. Related
     * settings: To set up your output to include or exclude AFD values, see AfdSignaling, under VideoDescription. On the
     * console, find AFD signaling under the output's video encoding settings.
     */
    private String afdSignaling;
    /**
     * Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a profile
     * based on the video codec and resolution. For a list of codecs supported with each MXF profile, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For more
     * information about the automatic selection behavior, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
     */
    private String profile;
    /** Specify the XAVC profile settings for MXF outputs when you set your MXF profile to XAVC. */
    private MxfXavcProfileSettings xavcProfileSettings;

    /**
     * Optional. When you have AFD signaling set up in your output video stream, use this setting to choose whether to
     * also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF wrapper.
     * Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video stream for this output to
     * the MXF wrapper. Regardless of which option you choose, the AFD values remain in the video stream. Related
     * settings: To set up your output to include or exclude AFD values, see AfdSignaling, under VideoDescription. On the
     * console, find AFD signaling under the output's video encoding settings.
     * 
     * @param afdSignaling
     *        Optional. When you have AFD signaling set up in your output video stream, use this setting to choose
     *        whether to also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from
     *        the MXF wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video
     *        stream for this output to the MXF wrapper. Regardless of which option you choose, the AFD values remain in
     *        the video stream. Related settings: To set up your output to include or exclude AFD values, see
     *        AfdSignaling, under VideoDescription. On the console, find AFD signaling under the output's video encoding
     *        settings.
     * @see MxfAfdSignaling
     */

    public void setAfdSignaling(String afdSignaling) {
        this.afdSignaling = afdSignaling;
    }

    /**
     * Optional. When you have AFD signaling set up in your output video stream, use this setting to choose whether to
     * also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF wrapper.
     * Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video stream for this output to
     * the MXF wrapper. Regardless of which option you choose, the AFD values remain in the video stream. Related
     * settings: To set up your output to include or exclude AFD values, see AfdSignaling, under VideoDescription. On the
     * console, find AFD signaling under the output's video encoding settings.
     * 
     * @return Optional. When you have AFD signaling set up in your output video stream, use this setting to choose
     *         whether to also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from
     *         the MXF wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video
     *         stream for this output to the MXF wrapper. Regardless of which option you choose, the AFD values remain
     *         in the video stream. Related settings: To set up your output to include or exclude AFD values, see
     *         AfdSignaling, under VideoDescription. On the console, find AFD signaling under the output's video
     *         encoding settings.
     * @see MxfAfdSignaling
     */

    public String getAfdSignaling() {
        return this.afdSignaling;
    }

    /**
     * Optional. When you have AFD signaling set up in your output video stream, use this setting to choose whether to
     * also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF wrapper.
     * Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video stream for this output to
     * the MXF wrapper. Regardless of which option you choose, the AFD values remain in the video stream. Related
     * settings: To set up your output to include or exclude AFD values, see AfdSignaling, under VideoDescription. On the
     * console, find AFD signaling under the output's video encoding settings.
     * 
     * @param afdSignaling
     *        Optional. When you have AFD signaling set up in your output video stream, use this setting to choose
     *        whether to also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from
     *        the MXF wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video
     *        stream for this output to the MXF wrapper. Regardless of which option you choose, the AFD values remain in
     *        the video stream. Related settings: To set up your output to include or exclude AFD values, see
     *        AfdSignaling, under VideoDescription. On the console, find AFD signaling under the output's video encoding
     *        settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MxfAfdSignaling
     */

    public MxfSettings withAfdSignaling(String afdSignaling) {
        setAfdSignaling(afdSignaling);
        return this;
    }

    /**
     * Optional. When you have AFD signaling set up in your output video stream, use this setting to choose whether to
     * also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from the MXF wrapper.
     * Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video stream for this output to
     * the MXF wrapper. Regardless of which option you choose, the AFD values remain in the video stream. Related
     * settings: To set up your output to include or exclude AFD values, see AfdSignaling, under VideoDescription. On the
     * console, find AFD signaling under the output's video encoding settings.
     * 
     * @param afdSignaling
     *        Optional. When you have AFD signaling set up in your output video stream, use this setting to choose
     *        whether to also include it in the MXF wrapper. Choose Don't copy (NO_COPY) to exclude AFD signaling from
     *        the MXF wrapper. Choose Copy from video stream (COPY_FROM_VIDEO) to copy the AFD values from the video
     *        stream for this output to the MXF wrapper. Regardless of which option you choose, the AFD values remain in
     *        the video stream. Related settings: To set up your output to include or exclude AFD values, see
     *        AfdSignaling, under VideoDescription. On the console, find AFD signaling under the output's video encoding
     *        settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MxfAfdSignaling
     */

    public MxfSettings withAfdSignaling(MxfAfdSignaling afdSignaling) {
        this.afdSignaling = afdSignaling.toString();
        return this;
    }

    /**
     * Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a profile
     * based on the video codec and resolution. For a list of codecs supported with each MXF profile, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For more
     * information about the automatic selection behavior, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
     * 
     * @param profile
     *        Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a
     *        profile based on the video codec and resolution. For a list of codecs supported with each MXF profile, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For more
     *        information about the automatic selection behavior, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
     * @see MxfProfile
     */

    public void setProfile(String profile) {
        this.profile = profile;
    }

    /**
     * Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a profile
     * based on the video codec and resolution. For a list of codecs supported with each MXF profile, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For more
     * information about the automatic selection behavior, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
     * 
     * @return Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a
     *         profile based on the video codec and resolution. For a list of codecs supported with each MXF profile,
     *         see https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For
     *         more information about the automatic selection behavior, see
     *         https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
     * @see MxfProfile
     */

    public String getProfile() {
        return this.profile;
    }

    /**
     * Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a profile
     * based on the video codec and resolution. For a list of codecs supported with each MXF profile, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For more
     * information about the automatic selection behavior, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
     * 
     * @param profile
     *        Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a
     *        profile based on the video codec and resolution. For a list of codecs supported with each MXF profile, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For more
     *        information about the automatic selection behavior, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MxfProfile
     */

    public MxfSettings withProfile(String profile) {
        setProfile(profile);
        return this;
    }

    /**
     * Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a profile
     * based on the video codec and resolution. For a list of codecs supported with each MXF profile, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For more
     * information about the automatic selection behavior, see
     * https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
     * 
     * @param profile
     *        Specify the MXF profile, also called shim, for this output. When you choose Auto, MediaConvert chooses a
     *        profile based on the video codec and resolution. For a list of codecs supported with each MXF profile, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/codecs-supported-with-each-mxf-profile.html. For more
     *        information about the automatic selection behavior, see
     *        https://docs.aws.amazon.com/mediaconvert/latest/ug/default-automatic-selection-of-mxf-profiles.html.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MxfProfile
     */

    public MxfSettings withProfile(MxfProfile profile) {
        this.profile = profile.toString();
        return this;
    }

    /**
     * Specify the XAVC profile settings for MXF outputs when you set your MXF profile to XAVC.
     * 
     * @param xavcProfileSettings
     *        Specify the XAVC profile settings for MXF outputs when you set your MXF profile to XAVC.
     */

    public void setXavcProfileSettings(MxfXavcProfileSettings xavcProfileSettings) {
        this.xavcProfileSettings = xavcProfileSettings;
    }

    /**
     * Specify the XAVC profile settings for MXF outputs when you set your MXF profile to XAVC.
     * 
     * @return Specify the XAVC profile settings for MXF outputs when you set your MXF profile to XAVC.
     */

    public MxfXavcProfileSettings getXavcProfileSettings() {
        return this.xavcProfileSettings;
    }

    /**
     * Specify the XAVC profile settings for MXF outputs when you set your MXF profile to XAVC.
     * 
     * @param xavcProfileSettings
     *        Specify the XAVC profile settings for MXF outputs when you set your MXF profile to XAVC.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MxfSettings withXavcProfileSettings(MxfXavcProfileSettings xavcProfileSettings) {
        setXavcProfileSettings(xavcProfileSettings);
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
        if (getAfdSignaling() != null)
            sb.append("AfdSignaling: ").append(getAfdSignaling()).append(",");
        if (getProfile() != null)
            sb.append("Profile: ").append(getProfile()).append(",");
        if (getXavcProfileSettings() != null)
            sb.append("XavcProfileSettings: ").append(getXavcProfileSettings());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MxfSettings == false)
            return false;
        MxfSettings other = (MxfSettings) obj;
        if (other.getAfdSignaling() == null ^ this.getAfdSignaling() == null)
            return false;
        if (other.getAfdSignaling() != null && other.getAfdSignaling().equals(this.getAfdSignaling()) == false)
            return false;
        if (other.getProfile() == null ^ this.getProfile() == null)
            return false;
        if (other.getProfile() != null && other.getProfile().equals(this.getProfile()) == false)
            return false;
        if (other.getXavcProfileSettings() == null ^ this.getXavcProfileSettings() == null)
            return false;
        if (other.getXavcProfileSettings() != null && other.getXavcProfileSettings().equals(this.getXavcProfileSettings()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAfdSignaling() == null) ? 0 : getAfdSignaling().hashCode());
        hashCode = prime * hashCode + ((getProfile() == null) ? 0 : getProfile().hashCode());
        hashCode = prime * hashCode + ((getXavcProfileSettings() == null) ? 0 : getXavcProfileSettings().hashCode());
        return hashCode;
    }

    @Override
    public MxfSettings clone() {
        try {
            return (MxfSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.MxfSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
