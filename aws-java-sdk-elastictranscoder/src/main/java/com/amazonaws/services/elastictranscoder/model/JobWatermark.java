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
package com.amazonaws.services.elastictranscoder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Watermarks can be in .png or .jpg format. If you want to display a watermark that is not rectangular, use the .png
 * format, which supports transparency.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobWatermark implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the watermark settings that Elastic Transcoder uses to add watermarks to the video during transcoding.
     * The settings are in the preset specified by Preset for the current output. In that preset, the value of
     * Watermarks Id tells Elastic Transcoder which settings to use.
     * </p>
     */
    private String presetWatermarkId;
    /**
     * <p>
     * The name of the .png or .jpg file that you want to use for the watermark. To determine which Amazon S3 bucket
     * contains the specified file, Elastic Transcoder checks the pipeline specified by <code>Pipeline</code>; the
     * <code>Input Bucket</code> object in that pipeline identifies the bucket.
     * </p>
     * <p>
     * If the file name includes a prefix, for example, <b>logos/128x64.png</b>, include the prefix in the key. If the
     * file isn't in the specified bucket, Elastic Transcoder returns an error.
     * </p>
     */
    private String inputKey;
    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your watermarks.
     * </p>
     */
    private Encryption encryption;

    /**
     * <p>
     * The ID of the watermark settings that Elastic Transcoder uses to add watermarks to the video during transcoding.
     * The settings are in the preset specified by Preset for the current output. In that preset, the value of
     * Watermarks Id tells Elastic Transcoder which settings to use.
     * </p>
     * 
     * @param presetWatermarkId
     *        The ID of the watermark settings that Elastic Transcoder uses to add watermarks to the video during
     *        transcoding. The settings are in the preset specified by Preset for the current output. In that preset,
     *        the value of Watermarks Id tells Elastic Transcoder which settings to use.
     */

    public void setPresetWatermarkId(String presetWatermarkId) {
        this.presetWatermarkId = presetWatermarkId;
    }

    /**
     * <p>
     * The ID of the watermark settings that Elastic Transcoder uses to add watermarks to the video during transcoding.
     * The settings are in the preset specified by Preset for the current output. In that preset, the value of
     * Watermarks Id tells Elastic Transcoder which settings to use.
     * </p>
     * 
     * @return The ID of the watermark settings that Elastic Transcoder uses to add watermarks to the video during
     *         transcoding. The settings are in the preset specified by Preset for the current output. In that preset,
     *         the value of Watermarks Id tells Elastic Transcoder which settings to use.
     */

    public String getPresetWatermarkId() {
        return this.presetWatermarkId;
    }

    /**
     * <p>
     * The ID of the watermark settings that Elastic Transcoder uses to add watermarks to the video during transcoding.
     * The settings are in the preset specified by Preset for the current output. In that preset, the value of
     * Watermarks Id tells Elastic Transcoder which settings to use.
     * </p>
     * 
     * @param presetWatermarkId
     *        The ID of the watermark settings that Elastic Transcoder uses to add watermarks to the video during
     *        transcoding. The settings are in the preset specified by Preset for the current output. In that preset,
     *        the value of Watermarks Id tells Elastic Transcoder which settings to use.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobWatermark withPresetWatermarkId(String presetWatermarkId) {
        setPresetWatermarkId(presetWatermarkId);
        return this;
    }

    /**
     * <p>
     * The name of the .png or .jpg file that you want to use for the watermark. To determine which Amazon S3 bucket
     * contains the specified file, Elastic Transcoder checks the pipeline specified by <code>Pipeline</code>; the
     * <code>Input Bucket</code> object in that pipeline identifies the bucket.
     * </p>
     * <p>
     * If the file name includes a prefix, for example, <b>logos/128x64.png</b>, include the prefix in the key. If the
     * file isn't in the specified bucket, Elastic Transcoder returns an error.
     * </p>
     * 
     * @param inputKey
     *        The name of the .png or .jpg file that you want to use for the watermark. To determine which Amazon S3
     *        bucket contains the specified file, Elastic Transcoder checks the pipeline specified by
     *        <code>Pipeline</code>; the <code>Input Bucket</code> object in that pipeline identifies the bucket.</p>
     *        <p>
     *        If the file name includes a prefix, for example, <b>logos/128x64.png</b>, include the prefix in the key.
     *        If the file isn't in the specified bucket, Elastic Transcoder returns an error.
     */

    public void setInputKey(String inputKey) {
        this.inputKey = inputKey;
    }

    /**
     * <p>
     * The name of the .png or .jpg file that you want to use for the watermark. To determine which Amazon S3 bucket
     * contains the specified file, Elastic Transcoder checks the pipeline specified by <code>Pipeline</code>; the
     * <code>Input Bucket</code> object in that pipeline identifies the bucket.
     * </p>
     * <p>
     * If the file name includes a prefix, for example, <b>logos/128x64.png</b>, include the prefix in the key. If the
     * file isn't in the specified bucket, Elastic Transcoder returns an error.
     * </p>
     * 
     * @return The name of the .png or .jpg file that you want to use for the watermark. To determine which Amazon S3
     *         bucket contains the specified file, Elastic Transcoder checks the pipeline specified by
     *         <code>Pipeline</code>; the <code>Input Bucket</code> object in that pipeline identifies the bucket.</p>
     *         <p>
     *         If the file name includes a prefix, for example, <b>logos/128x64.png</b>, include the prefix in the key.
     *         If the file isn't in the specified bucket, Elastic Transcoder returns an error.
     */

    public String getInputKey() {
        return this.inputKey;
    }

    /**
     * <p>
     * The name of the .png or .jpg file that you want to use for the watermark. To determine which Amazon S3 bucket
     * contains the specified file, Elastic Transcoder checks the pipeline specified by <code>Pipeline</code>; the
     * <code>Input Bucket</code> object in that pipeline identifies the bucket.
     * </p>
     * <p>
     * If the file name includes a prefix, for example, <b>logos/128x64.png</b>, include the prefix in the key. If the
     * file isn't in the specified bucket, Elastic Transcoder returns an error.
     * </p>
     * 
     * @param inputKey
     *        The name of the .png or .jpg file that you want to use for the watermark. To determine which Amazon S3
     *        bucket contains the specified file, Elastic Transcoder checks the pipeline specified by
     *        <code>Pipeline</code>; the <code>Input Bucket</code> object in that pipeline identifies the bucket.</p>
     *        <p>
     *        If the file name includes a prefix, for example, <b>logos/128x64.png</b>, include the prefix in the key.
     *        If the file isn't in the specified bucket, Elastic Transcoder returns an error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobWatermark withInputKey(String inputKey) {
        setInputKey(inputKey);
        return this;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your watermarks.
     * </p>
     * 
     * @param encryption
     *        The encryption settings, if any, that you want Elastic Transcoder to apply to your watermarks.
     */

    public void setEncryption(Encryption encryption) {
        this.encryption = encryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your watermarks.
     * </p>
     * 
     * @return The encryption settings, if any, that you want Elastic Transcoder to apply to your watermarks.
     */

    public Encryption getEncryption() {
        return this.encryption;
    }

    /**
     * <p>
     * The encryption settings, if any, that you want Elastic Transcoder to apply to your watermarks.
     * </p>
     * 
     * @param encryption
     *        The encryption settings, if any, that you want Elastic Transcoder to apply to your watermarks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobWatermark withEncryption(Encryption encryption) {
        setEncryption(encryption);
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
        if (getPresetWatermarkId() != null)
            sb.append("PresetWatermarkId: ").append(getPresetWatermarkId()).append(",");
        if (getInputKey() != null)
            sb.append("InputKey: ").append(getInputKey()).append(",");
        if (getEncryption() != null)
            sb.append("Encryption: ").append(getEncryption());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobWatermark == false)
            return false;
        JobWatermark other = (JobWatermark) obj;
        if (other.getPresetWatermarkId() == null ^ this.getPresetWatermarkId() == null)
            return false;
        if (other.getPresetWatermarkId() != null && other.getPresetWatermarkId().equals(this.getPresetWatermarkId()) == false)
            return false;
        if (other.getInputKey() == null ^ this.getInputKey() == null)
            return false;
        if (other.getInputKey() != null && other.getInputKey().equals(this.getInputKey()) == false)
            return false;
        if (other.getEncryption() == null ^ this.getEncryption() == null)
            return false;
        if (other.getEncryption() != null && other.getEncryption().equals(this.getEncryption()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPresetWatermarkId() == null) ? 0 : getPresetWatermarkId().hashCode());
        hashCode = prime * hashCode + ((getInputKey() == null) ? 0 : getInputKey().hashCode());
        hashCode = prime * hashCode + ((getEncryption() == null) ? 0 : getEncryption().hashCode());
        return hashCode;
    }

    @Override
    public JobWatermark clone() {
        try {
            return (JobWatermark) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elastictranscoder.model.transform.JobWatermarkMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
