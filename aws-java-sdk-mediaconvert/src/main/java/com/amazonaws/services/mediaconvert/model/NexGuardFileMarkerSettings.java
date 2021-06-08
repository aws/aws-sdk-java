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
 * For forensic video watermarking, MediaConvert supports Nagra NexGuard File Marker watermarking. MediaConvert supports
 * both PreRelease Content (NGPR/G2) and OTT Streaming workflows.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediaconvert-2017-08-29/NexGuardFileMarkerSettings"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NexGuardFileMarkerSettings implements Serializable, Cloneable, StructuredPojo {

    /**
     * Use the base64 license string that Nagra provides you. Enter it directly in your JSON job specification or in the
     * console. Required when you include Nagra NexGuard File Marker watermarking (NexGuardWatermarkingSettings) in your
     * job.
     */
    private String license;
    /**
     * Specify the payload ID that you want associated with this output. Valid values vary depending on your Nagra
     * NexGuard forensic watermarking workflow. Required when you include Nagra NexGuard File Marker watermarking
     * (NexGuardWatermarkingSettings) in your job. For PreRelease Content (NGPR/G2), specify an integer from 1 through
     * 4,194,303. You must generate a unique ID for each asset you watermark, and keep a record of which ID you have
     * assigned to each asset. Neither Nagra nor MediaConvert keep track of the relationship between output files and
     * your IDs. For OTT Streaming, create two adaptive bitrate (ABR) stacks for each asset. Do this by setting up two
     * output groups. For one output group, set the value of Payload ID (payload) to 0 in every output. For the other
     * output group, set Payload ID (payload) to 1 in every output.
     */
    private Integer payload;
    /**
     * Enter one of the watermarking preset strings that Nagra provides you. Required when you include Nagra NexGuard
     * File Marker watermarking (NexGuardWatermarkingSettings) in your job.
     */
    private String preset;
    /**
     * Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify a value
     * here, the Nagra NexGuard library uses its default value.
     */
    private String strength;

    /**
     * Use the base64 license string that Nagra provides you. Enter it directly in your JSON job specification or in the
     * console. Required when you include Nagra NexGuard File Marker watermarking (NexGuardWatermarkingSettings) in your
     * job.
     * 
     * @param license
     *        Use the base64 license string that Nagra provides you. Enter it directly in your JSON job specification or
     *        in the console. Required when you include Nagra NexGuard File Marker watermarking
     *        (NexGuardWatermarkingSettings) in your job.
     */

    public void setLicense(String license) {
        this.license = license;
    }

    /**
     * Use the base64 license string that Nagra provides you. Enter it directly in your JSON job specification or in the
     * console. Required when you include Nagra NexGuard File Marker watermarking (NexGuardWatermarkingSettings) in your
     * job.
     * 
     * @return Use the base64 license string that Nagra provides you. Enter it directly in your JSON job specification
     *         or in the console. Required when you include Nagra NexGuard File Marker watermarking
     *         (NexGuardWatermarkingSettings) in your job.
     */

    public String getLicense() {
        return this.license;
    }

    /**
     * Use the base64 license string that Nagra provides you. Enter it directly in your JSON job specification or in the
     * console. Required when you include Nagra NexGuard File Marker watermarking (NexGuardWatermarkingSettings) in your
     * job.
     * 
     * @param license
     *        Use the base64 license string that Nagra provides you. Enter it directly in your JSON job specification or
     *        in the console. Required when you include Nagra NexGuard File Marker watermarking
     *        (NexGuardWatermarkingSettings) in your job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NexGuardFileMarkerSettings withLicense(String license) {
        setLicense(license);
        return this;
    }

    /**
     * Specify the payload ID that you want associated with this output. Valid values vary depending on your Nagra
     * NexGuard forensic watermarking workflow. Required when you include Nagra NexGuard File Marker watermarking
     * (NexGuardWatermarkingSettings) in your job. For PreRelease Content (NGPR/G2), specify an integer from 1 through
     * 4,194,303. You must generate a unique ID for each asset you watermark, and keep a record of which ID you have
     * assigned to each asset. Neither Nagra nor MediaConvert keep track of the relationship between output files and
     * your IDs. For OTT Streaming, create two adaptive bitrate (ABR) stacks for each asset. Do this by setting up two
     * output groups. For one output group, set the value of Payload ID (payload) to 0 in every output. For the other
     * output group, set Payload ID (payload) to 1 in every output.
     * 
     * @param payload
     *        Specify the payload ID that you want associated with this output. Valid values vary depending on your
     *        Nagra NexGuard forensic watermarking workflow. Required when you include Nagra NexGuard File Marker
     *        watermarking (NexGuardWatermarkingSettings) in your job. For PreRelease Content (NGPR/G2), specify an
     *        integer from 1 through 4,194,303. You must generate a unique ID for each asset you watermark, and keep a
     *        record of which ID you have assigned to each asset. Neither Nagra nor MediaConvert keep track of the
     *        relationship between output files and your IDs. For OTT Streaming, create two adaptive bitrate (ABR)
     *        stacks for each asset. Do this by setting up two output groups. For one output group, set the value of
     *        Payload ID (payload) to 0 in every output. For the other output group, set Payload ID (payload) to 1 in
     *        every output.
     */

    public void setPayload(Integer payload) {
        this.payload = payload;
    }

    /**
     * Specify the payload ID that you want associated with this output. Valid values vary depending on your Nagra
     * NexGuard forensic watermarking workflow. Required when you include Nagra NexGuard File Marker watermarking
     * (NexGuardWatermarkingSettings) in your job. For PreRelease Content (NGPR/G2), specify an integer from 1 through
     * 4,194,303. You must generate a unique ID for each asset you watermark, and keep a record of which ID you have
     * assigned to each asset. Neither Nagra nor MediaConvert keep track of the relationship between output files and
     * your IDs. For OTT Streaming, create two adaptive bitrate (ABR) stacks for each asset. Do this by setting up two
     * output groups. For one output group, set the value of Payload ID (payload) to 0 in every output. For the other
     * output group, set Payload ID (payload) to 1 in every output.
     * 
     * @return Specify the payload ID that you want associated with this output. Valid values vary depending on your
     *         Nagra NexGuard forensic watermarking workflow. Required when you include Nagra NexGuard File Marker
     *         watermarking (NexGuardWatermarkingSettings) in your job. For PreRelease Content (NGPR/G2), specify an
     *         integer from 1 through 4,194,303. You must generate a unique ID for each asset you watermark, and keep a
     *         record of which ID you have assigned to each asset. Neither Nagra nor MediaConvert keep track of the
     *         relationship between output files and your IDs. For OTT Streaming, create two adaptive bitrate (ABR)
     *         stacks for each asset. Do this by setting up two output groups. For one output group, set the value of
     *         Payload ID (payload) to 0 in every output. For the other output group, set Payload ID (payload) to 1 in
     *         every output.
     */

    public Integer getPayload() {
        return this.payload;
    }

    /**
     * Specify the payload ID that you want associated with this output. Valid values vary depending on your Nagra
     * NexGuard forensic watermarking workflow. Required when you include Nagra NexGuard File Marker watermarking
     * (NexGuardWatermarkingSettings) in your job. For PreRelease Content (NGPR/G2), specify an integer from 1 through
     * 4,194,303. You must generate a unique ID for each asset you watermark, and keep a record of which ID you have
     * assigned to each asset. Neither Nagra nor MediaConvert keep track of the relationship between output files and
     * your IDs. For OTT Streaming, create two adaptive bitrate (ABR) stacks for each asset. Do this by setting up two
     * output groups. For one output group, set the value of Payload ID (payload) to 0 in every output. For the other
     * output group, set Payload ID (payload) to 1 in every output.
     * 
     * @param payload
     *        Specify the payload ID that you want associated with this output. Valid values vary depending on your
     *        Nagra NexGuard forensic watermarking workflow. Required when you include Nagra NexGuard File Marker
     *        watermarking (NexGuardWatermarkingSettings) in your job. For PreRelease Content (NGPR/G2), specify an
     *        integer from 1 through 4,194,303. You must generate a unique ID for each asset you watermark, and keep a
     *        record of which ID you have assigned to each asset. Neither Nagra nor MediaConvert keep track of the
     *        relationship between output files and your IDs. For OTT Streaming, create two adaptive bitrate (ABR)
     *        stacks for each asset. Do this by setting up two output groups. For one output group, set the value of
     *        Payload ID (payload) to 0 in every output. For the other output group, set Payload ID (payload) to 1 in
     *        every output.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NexGuardFileMarkerSettings withPayload(Integer payload) {
        setPayload(payload);
        return this;
    }

    /**
     * Enter one of the watermarking preset strings that Nagra provides you. Required when you include Nagra NexGuard
     * File Marker watermarking (NexGuardWatermarkingSettings) in your job.
     * 
     * @param preset
     *        Enter one of the watermarking preset strings that Nagra provides you. Required when you include Nagra
     *        NexGuard File Marker watermarking (NexGuardWatermarkingSettings) in your job.
     */

    public void setPreset(String preset) {
        this.preset = preset;
    }

    /**
     * Enter one of the watermarking preset strings that Nagra provides you. Required when you include Nagra NexGuard
     * File Marker watermarking (NexGuardWatermarkingSettings) in your job.
     * 
     * @return Enter one of the watermarking preset strings that Nagra provides you. Required when you include Nagra
     *         NexGuard File Marker watermarking (NexGuardWatermarkingSettings) in your job.
     */

    public String getPreset() {
        return this.preset;
    }

    /**
     * Enter one of the watermarking preset strings that Nagra provides you. Required when you include Nagra NexGuard
     * File Marker watermarking (NexGuardWatermarkingSettings) in your job.
     * 
     * @param preset
     *        Enter one of the watermarking preset strings that Nagra provides you. Required when you include Nagra
     *        NexGuard File Marker watermarking (NexGuardWatermarkingSettings) in your job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NexGuardFileMarkerSettings withPreset(String preset) {
        setPreset(preset);
        return this;
    }

    /**
     * Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify a value
     * here, the Nagra NexGuard library uses its default value.
     * 
     * @param strength
     *        Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify
     *        a value here, the Nagra NexGuard library uses its default value.
     * @see WatermarkingStrength
     */

    public void setStrength(String strength) {
        this.strength = strength;
    }

    /**
     * Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify a value
     * here, the Nagra NexGuard library uses its default value.
     * 
     * @return Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify
     *         a value here, the Nagra NexGuard library uses its default value.
     * @see WatermarkingStrength
     */

    public String getStrength() {
        return this.strength;
    }

    /**
     * Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify a value
     * here, the Nagra NexGuard library uses its default value.
     * 
     * @param strength
     *        Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify
     *        a value here, the Nagra NexGuard library uses its default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WatermarkingStrength
     */

    public NexGuardFileMarkerSettings withStrength(String strength) {
        setStrength(strength);
        return this;
    }

    /**
     * Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify a value
     * here, the Nagra NexGuard library uses its default value.
     * 
     * @param strength
     *        Optional. Ignore this setting unless Nagra support directs you to specify a value. When you don't specify
     *        a value here, the Nagra NexGuard library uses its default value.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WatermarkingStrength
     */

    public NexGuardFileMarkerSettings withStrength(WatermarkingStrength strength) {
        this.strength = strength.toString();
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
        if (getLicense() != null)
            sb.append("License: ").append(getLicense()).append(",");
        if (getPayload() != null)
            sb.append("Payload: ").append(getPayload()).append(",");
        if (getPreset() != null)
            sb.append("Preset: ").append(getPreset()).append(",");
        if (getStrength() != null)
            sb.append("Strength: ").append(getStrength());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NexGuardFileMarkerSettings == false)
            return false;
        NexGuardFileMarkerSettings other = (NexGuardFileMarkerSettings) obj;
        if (other.getLicense() == null ^ this.getLicense() == null)
            return false;
        if (other.getLicense() != null && other.getLicense().equals(this.getLicense()) == false)
            return false;
        if (other.getPayload() == null ^ this.getPayload() == null)
            return false;
        if (other.getPayload() != null && other.getPayload().equals(this.getPayload()) == false)
            return false;
        if (other.getPreset() == null ^ this.getPreset() == null)
            return false;
        if (other.getPreset() != null && other.getPreset().equals(this.getPreset()) == false)
            return false;
        if (other.getStrength() == null ^ this.getStrength() == null)
            return false;
        if (other.getStrength() != null && other.getStrength().equals(this.getStrength()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLicense() == null) ? 0 : getLicense().hashCode());
        hashCode = prime * hashCode + ((getPayload() == null) ? 0 : getPayload().hashCode());
        hashCode = prime * hashCode + ((getPreset() == null) ? 0 : getPreset().hashCode());
        hashCode = prime * hashCode + ((getStrength() == null) ? 0 : getStrength().hashCode());
        return hashCode;
    }

    @Override
    public NexGuardFileMarkerSettings clone() {
        try {
            return (NexGuardFileMarkerSettings) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediaconvert.model.transform.NexGuardFileMarkerSettingsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
