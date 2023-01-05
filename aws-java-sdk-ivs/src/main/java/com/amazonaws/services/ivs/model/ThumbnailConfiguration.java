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
package com.amazonaws.services.ivs.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object representing a configuration of thumbnails for recorded video.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ivs-2020-07-14/ThumbnailConfiguration" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ThumbnailConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Thumbnail recording mode. Default: <code>INTERVAL</code>.
     * </p>
     */
    private String recordingMode;
    /**
     * <p>
     * The targeted thumbnail-generation interval in seconds. This is configurable (and required) only if
     * <code>recordingMode</code> is <code>INTERVAL</code>. Default: 60.
     * </p>
     * <p>
     * <b>Important:</b> Setting a value for <code>targetIntervalSeconds</code> does not guarantee that thumbnails are
     * generated at the specified interval. For thumbnails to be generated at the <code>targetIntervalSeconds</code>
     * interval, the <code>IDR/Keyframe</code> value for the input video must be less than the
     * <code>targetIntervalSeconds</code> value. See <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/streaming-config.html"> Amazon IVS Streaming
     * Configuration</a> for information on setting <code>IDR/Keyframe</code> to the recommended value in video-encoder
     * settings.
     * </p>
     */
    private Long targetIntervalSeconds;

    /**
     * <p>
     * Thumbnail recording mode. Default: <code>INTERVAL</code>.
     * </p>
     * 
     * @param recordingMode
     *        Thumbnail recording mode. Default: <code>INTERVAL</code>.
     * @see RecordingMode
     */

    public void setRecordingMode(String recordingMode) {
        this.recordingMode = recordingMode;
    }

    /**
     * <p>
     * Thumbnail recording mode. Default: <code>INTERVAL</code>.
     * </p>
     * 
     * @return Thumbnail recording mode. Default: <code>INTERVAL</code>.
     * @see RecordingMode
     */

    public String getRecordingMode() {
        return this.recordingMode;
    }

    /**
     * <p>
     * Thumbnail recording mode. Default: <code>INTERVAL</code>.
     * </p>
     * 
     * @param recordingMode
     *        Thumbnail recording mode. Default: <code>INTERVAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordingMode
     */

    public ThumbnailConfiguration withRecordingMode(String recordingMode) {
        setRecordingMode(recordingMode);
        return this;
    }

    /**
     * <p>
     * Thumbnail recording mode. Default: <code>INTERVAL</code>.
     * </p>
     * 
     * @param recordingMode
     *        Thumbnail recording mode. Default: <code>INTERVAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordingMode
     */

    public ThumbnailConfiguration withRecordingMode(RecordingMode recordingMode) {
        this.recordingMode = recordingMode.toString();
        return this;
    }

    /**
     * <p>
     * The targeted thumbnail-generation interval in seconds. This is configurable (and required) only if
     * <code>recordingMode</code> is <code>INTERVAL</code>. Default: 60.
     * </p>
     * <p>
     * <b>Important:</b> Setting a value for <code>targetIntervalSeconds</code> does not guarantee that thumbnails are
     * generated at the specified interval. For thumbnails to be generated at the <code>targetIntervalSeconds</code>
     * interval, the <code>IDR/Keyframe</code> value for the input video must be less than the
     * <code>targetIntervalSeconds</code> value. See <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/streaming-config.html"> Amazon IVS Streaming
     * Configuration</a> for information on setting <code>IDR/Keyframe</code> to the recommended value in video-encoder
     * settings.
     * </p>
     * 
     * @param targetIntervalSeconds
     *        The targeted thumbnail-generation interval in seconds. This is configurable (and required) only if
     *        <code>recordingMode</code> is <code>INTERVAL</code>. Default: 60.</p>
     *        <p>
     *        <b>Important:</b> Setting a value for <code>targetIntervalSeconds</code> does not guarantee that
     *        thumbnails are generated at the specified interval. For thumbnails to be generated at the
     *        <code>targetIntervalSeconds</code> interval, the <code>IDR/Keyframe</code> value for the input video must
     *        be less than the <code>targetIntervalSeconds</code> value. See <a
     *        href="https://docs.aws.amazon.com/ivs/latest/userguide/streaming-config.html"> Amazon IVS Streaming
     *        Configuration</a> for information on setting <code>IDR/Keyframe</code> to the recommended value in
     *        video-encoder settings.
     */

    public void setTargetIntervalSeconds(Long targetIntervalSeconds) {
        this.targetIntervalSeconds = targetIntervalSeconds;
    }

    /**
     * <p>
     * The targeted thumbnail-generation interval in seconds. This is configurable (and required) only if
     * <code>recordingMode</code> is <code>INTERVAL</code>. Default: 60.
     * </p>
     * <p>
     * <b>Important:</b> Setting a value for <code>targetIntervalSeconds</code> does not guarantee that thumbnails are
     * generated at the specified interval. For thumbnails to be generated at the <code>targetIntervalSeconds</code>
     * interval, the <code>IDR/Keyframe</code> value for the input video must be less than the
     * <code>targetIntervalSeconds</code> value. See <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/streaming-config.html"> Amazon IVS Streaming
     * Configuration</a> for information on setting <code>IDR/Keyframe</code> to the recommended value in video-encoder
     * settings.
     * </p>
     * 
     * @return The targeted thumbnail-generation interval in seconds. This is configurable (and required) only if
     *         <code>recordingMode</code> is <code>INTERVAL</code>. Default: 60.</p>
     *         <p>
     *         <b>Important:</b> Setting a value for <code>targetIntervalSeconds</code> does not guarantee that
     *         thumbnails are generated at the specified interval. For thumbnails to be generated at the
     *         <code>targetIntervalSeconds</code> interval, the <code>IDR/Keyframe</code> value for the input video must
     *         be less than the <code>targetIntervalSeconds</code> value. See <a
     *         href="https://docs.aws.amazon.com/ivs/latest/userguide/streaming-config.html"> Amazon IVS Streaming
     *         Configuration</a> for information on setting <code>IDR/Keyframe</code> to the recommended value in
     *         video-encoder settings.
     */

    public Long getTargetIntervalSeconds() {
        return this.targetIntervalSeconds;
    }

    /**
     * <p>
     * The targeted thumbnail-generation interval in seconds. This is configurable (and required) only if
     * <code>recordingMode</code> is <code>INTERVAL</code>. Default: 60.
     * </p>
     * <p>
     * <b>Important:</b> Setting a value for <code>targetIntervalSeconds</code> does not guarantee that thumbnails are
     * generated at the specified interval. For thumbnails to be generated at the <code>targetIntervalSeconds</code>
     * interval, the <code>IDR/Keyframe</code> value for the input video must be less than the
     * <code>targetIntervalSeconds</code> value. See <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/streaming-config.html"> Amazon IVS Streaming
     * Configuration</a> for information on setting <code>IDR/Keyframe</code> to the recommended value in video-encoder
     * settings.
     * </p>
     * 
     * @param targetIntervalSeconds
     *        The targeted thumbnail-generation interval in seconds. This is configurable (and required) only if
     *        <code>recordingMode</code> is <code>INTERVAL</code>. Default: 60.</p>
     *        <p>
     *        <b>Important:</b> Setting a value for <code>targetIntervalSeconds</code> does not guarantee that
     *        thumbnails are generated at the specified interval. For thumbnails to be generated at the
     *        <code>targetIntervalSeconds</code> interval, the <code>IDR/Keyframe</code> value for the input video must
     *        be less than the <code>targetIntervalSeconds</code> value. See <a
     *        href="https://docs.aws.amazon.com/ivs/latest/userguide/streaming-config.html"> Amazon IVS Streaming
     *        Configuration</a> for information on setting <code>IDR/Keyframe</code> to the recommended value in
     *        video-encoder settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ThumbnailConfiguration withTargetIntervalSeconds(Long targetIntervalSeconds) {
        setTargetIntervalSeconds(targetIntervalSeconds);
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
        if (getRecordingMode() != null)
            sb.append("RecordingMode: ").append(getRecordingMode()).append(",");
        if (getTargetIntervalSeconds() != null)
            sb.append("TargetIntervalSeconds: ").append(getTargetIntervalSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ThumbnailConfiguration == false)
            return false;
        ThumbnailConfiguration other = (ThumbnailConfiguration) obj;
        if (other.getRecordingMode() == null ^ this.getRecordingMode() == null)
            return false;
        if (other.getRecordingMode() != null && other.getRecordingMode().equals(this.getRecordingMode()) == false)
            return false;
        if (other.getTargetIntervalSeconds() == null ^ this.getTargetIntervalSeconds() == null)
            return false;
        if (other.getTargetIntervalSeconds() != null && other.getTargetIntervalSeconds().equals(this.getTargetIntervalSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecordingMode() == null) ? 0 : getRecordingMode().hashCode());
        hashCode = prime * hashCode + ((getTargetIntervalSeconds() == null) ? 0 : getTargetIntervalSeconds().hashCode());
        return hashCode;
    }

    @Override
    public ThumbnailConfiguration clone() {
        try {
            return (ThumbnailConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ivs.model.transform.ThumbnailConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
