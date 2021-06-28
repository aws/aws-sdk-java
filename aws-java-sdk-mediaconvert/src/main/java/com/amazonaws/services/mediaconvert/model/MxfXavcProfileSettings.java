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
 * Specify the XAVC profile settings for MXF outputs when you set your MXF profile to XAVC.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/MxfXavcProfileSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MxfXavcProfileSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * To create an output that complies with the XAVC file format guidelines for interoperability, keep the default
     * value, Drop frames for compliance (DROP_FRAMES_FOR_COMPLIANCE). To include all frames from your input in this
     * output, keep the default setting, Allow any duration (ALLOW_ANY_DURATION). The number of frames that MediaConvert
     * excludes when you set this to Drop frames for compliance depends on the output frame rate and duration.
     */
    private String durationMode;
    /**
     * Specify a value for this setting only for outputs that you set up with one of these two XAVC profiles: XAVC HD
     * Intra CBG (XAVC_HD_INTRA_CBG) or XAVC 4K Intra CBG (XAVC_4K_INTRA_CBG). Specify the amount of space in each frame
     * that the service reserves for ancillary data, such as teletext captions. The default value for this setting is
     * 1492 bytes per frame. This should be sufficient to prevent overflow unless you have multiple pages of teletext
     * captions data. If you have a large amount of teletext data, specify a larger number.
     */
    private Integer maxAncDataSize;

    /**
     * To create an output that complies with the XAVC file format guidelines for interoperability, keep the default
     * value, Drop frames for compliance (DROP_FRAMES_FOR_COMPLIANCE). To include all frames from your input in this
     * output, keep the default setting, Allow any duration (ALLOW_ANY_DURATION). The number of frames that MediaConvert
     * excludes when you set this to Drop frames for compliance depends on the output frame rate and duration.
     * 
     * @param durationMode
     *        To create an output that complies with the XAVC file format guidelines for interoperability, keep the
     *        default value, Drop frames for compliance (DROP_FRAMES_FOR_COMPLIANCE). To include all frames from your
     *        input in this output, keep the default setting, Allow any duration (ALLOW_ANY_DURATION). The number of
     *        frames that MediaConvert excludes when you set this to Drop frames for compliance depends on the output
     *        frame rate and duration.
     * @see MxfXavcDurationMode
     */

    public void setDurationMode(String durationMode) {
        this.durationMode = durationMode;
    }

    /**
     * To create an output that complies with the XAVC file format guidelines for interoperability, keep the default
     * value, Drop frames for compliance (DROP_FRAMES_FOR_COMPLIANCE). To include all frames from your input in this
     * output, keep the default setting, Allow any duration (ALLOW_ANY_DURATION). The number of frames that MediaConvert
     * excludes when you set this to Drop frames for compliance depends on the output frame rate and duration.
     * 
     * @return To create an output that complies with the XAVC file format guidelines for interoperability, keep the
     *         default value, Drop frames for compliance (DROP_FRAMES_FOR_COMPLIANCE). To include all frames from your
     *         input in this output, keep the default setting, Allow any duration (ALLOW_ANY_DURATION). The number of
     *         frames that MediaConvert excludes when you set this to Drop frames for compliance depends on the output
     *         frame rate and duration.
     * @see MxfXavcDurationMode
     */

    public String getDurationMode() {
        return this.durationMode;
    }

    /**
     * To create an output that complies with the XAVC file format guidelines for interoperability, keep the default
     * value, Drop frames for compliance (DROP_FRAMES_FOR_COMPLIANCE). To include all frames from your input in this
     * output, keep the default setting, Allow any duration (ALLOW_ANY_DURATION). The number of frames that MediaConvert
     * excludes when you set this to Drop frames for compliance depends on the output frame rate and duration.
     * 
     * @param durationMode
     *        To create an output that complies with the XAVC file format guidelines for interoperability, keep the
     *        default value, Drop frames for compliance (DROP_FRAMES_FOR_COMPLIANCE). To include all frames from your
     *        input in this output, keep the default setting, Allow any duration (ALLOW_ANY_DURATION). The number of
     *        frames that MediaConvert excludes when you set this to Drop frames for compliance depends on the output
     *        frame rate and duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MxfXavcDurationMode
     */

    public MxfXavcProfileSettings withDurationMode(String durationMode) {
        setDurationMode(durationMode);
        return this;
    }

    /**
     * To create an output that complies with the XAVC file format guidelines for interoperability, keep the default
     * value, Drop frames for compliance (DROP_FRAMES_FOR_COMPLIANCE). To include all frames from your input in this
     * output, keep the default setting, Allow any duration (ALLOW_ANY_DURATION). The number of frames that MediaConvert
     * excludes when you set this to Drop frames for compliance depends on the output frame rate and duration.
     * 
     * @param durationMode
     *        To create an output that complies with the XAVC file format guidelines for interoperability, keep the
     *        default value, Drop frames for compliance (DROP_FRAMES_FOR_COMPLIANCE). To include all frames from your
     *        input in this output, keep the default setting, Allow any duration (ALLOW_ANY_DURATION). The number of
     *        frames that MediaConvert excludes when you set this to Drop frames for compliance depends on the output
     *        frame rate and duration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MxfXavcDurationMode
     */

    public MxfXavcProfileSettings withDurationMode(MxfXavcDurationMode durationMode) {
        this.durationMode = durationMode.toString();
        return this;
    }

    /**
     * Specify a value for this setting only for outputs that you set up with one of these two XAVC profiles: XAVC HD
     * Intra CBG (XAVC_HD_INTRA_CBG) or XAVC 4K Intra CBG (XAVC_4K_INTRA_CBG). Specify the amount of space in each frame
     * that the service reserves for ancillary data, such as teletext captions. The default value for this setting is
     * 1492 bytes per frame. This should be sufficient to prevent overflow unless you have multiple pages of teletext
     * captions data. If you have a large amount of teletext data, specify a larger number.
     * 
     * @param maxAncDataSize
     *        Specify a value for this setting only for outputs that you set up with one of these two XAVC profiles:
     *        XAVC HD Intra CBG (XAVC_HD_INTRA_CBG) or XAVC 4K Intra CBG (XAVC_4K_INTRA_CBG). Specify the amount of
     *        space in each frame that the service reserves for ancillary data, such as teletext captions. The default
     *        value for this setting is 1492 bytes per frame. This should be sufficient to prevent overflow unless you
     *        have multiple pages of teletext captions data. If you have a large amount of teletext data, specify a
     *        larger number.
     */

    public void setMaxAncDataSize(Integer maxAncDataSize) {
        this.maxAncDataSize = maxAncDataSize;
    }

    /**
     * Specify a value for this setting only for outputs that you set up with one of these two XAVC profiles: XAVC HD
     * Intra CBG (XAVC_HD_INTRA_CBG) or XAVC 4K Intra CBG (XAVC_4K_INTRA_CBG). Specify the amount of space in each frame
     * that the service reserves for ancillary data, such as teletext captions. The default value for this setting is
     * 1492 bytes per frame. This should be sufficient to prevent overflow unless you have multiple pages of teletext
     * captions data. If you have a large amount of teletext data, specify a larger number.
     * 
     * @return Specify a value for this setting only for outputs that you set up with one of these two XAVC profiles:
     *         XAVC HD Intra CBG (XAVC_HD_INTRA_CBG) or XAVC 4K Intra CBG (XAVC_4K_INTRA_CBG). Specify the amount of
     *         space in each frame that the service reserves for ancillary data, such as teletext captions. The default
     *         value for this setting is 1492 bytes per frame. This should be sufficient to prevent overflow unless you
     *         have multiple pages of teletext captions data. If you have a large amount of teletext data, specify a
     *         larger number.
     */

    public Integer getMaxAncDataSize() {
        return this.maxAncDataSize;
    }

    /**
     * Specify a value for this setting only for outputs that you set up with one of these two XAVC profiles: XAVC HD
     * Intra CBG (XAVC_HD_INTRA_CBG) or XAVC 4K Intra CBG (XAVC_4K_INTRA_CBG). Specify the amount of space in each frame
     * that the service reserves for ancillary data, such as teletext captions. The default value for this setting is
     * 1492 bytes per frame. This should be sufficient to prevent overflow unless you have multiple pages of teletext
     * captions data. If you have a large amount of teletext data, specify a larger number.
     * 
     * @param maxAncDataSize
     *        Specify a value for this setting only for outputs that you set up with one of these two XAVC profiles:
     *        XAVC HD Intra CBG (XAVC_HD_INTRA_CBG) or XAVC 4K Intra CBG (XAVC_4K_INTRA_CBG). Specify the amount of
     *        space in each frame that the service reserves for ancillary data, such as teletext captions. The default
     *        value for this setting is 1492 bytes per frame. This should be sufficient to prevent overflow unless you
     *        have multiple pages of teletext captions data. If you have a large amount of teletext data, specify a
     *        larger number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MxfXavcProfileSettings withMaxAncDataSize(Integer maxAncDataSize) {
        setMaxAncDataSize(maxAncDataSize);
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
        if (getDurationMode() != null)
            sb.append("DurationMode: ").append(getDurationMode()).append(",");
        if (getMaxAncDataSize() != null)
            sb.append("MaxAncDataSize: ").append(getMaxAncDataSize());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MxfXavcProfileSettings == false)
            return false;
        MxfXavcProfileSettings other = (MxfXavcProfileSettings) obj;
        if (other.getDurationMode() == null ^ this.getDurationMode() == null)
            return false;
        if (other.getDurationMode() != null && other.getDurationMode().equals(this.getDurationMode()) == false)
            return false;
        if (other.getMaxAncDataSize() == null ^ this.getMaxAncDataSize() == null)
            return false;
        if (other.getMaxAncDataSize() != null && other.getMaxAncDataSize().equals(this.getMaxAncDataSize()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDurationMode() == null) ? 0 : getDurationMode().hashCode());
        hashCode = prime * hashCode + ((getMaxAncDataSize() == null) ? 0 : getMaxAncDataSize().hashCode());
        return hashCode;
    }

    @Override
    public MxfXavcProfileSettings clone() {
        try {
            return (MxfXavcProfileSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.MxfXavcProfileSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
