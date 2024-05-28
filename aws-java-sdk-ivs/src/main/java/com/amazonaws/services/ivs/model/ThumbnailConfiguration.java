/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * Indicates the desired resolution of recorded thumbnails. Thumbnails are recorded at the selected resolution if
     * the corresponding rendition is available during the stream; otherwise, they are recorded at source resolution.
     * For more information about resolution values and their corresponding height and width dimensions, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>. Default:
     * Null (source resolution is returned).
     * </p>
     */
    private String resolution;
    /**
     * <p>
     * Indicates the format in which thumbnails are recorded. <code>SEQUENTIAL</code> records all generated thumbnails
     * in a serial manner, to the media/thumbnails directory. <code>LATEST</code> saves the latest thumbnail in
     * media/latest_thumbnail/thumb.jpg and overwrites it at the interval specified by
     * <code>targetIntervalSeconds</code>. You can enable both <code>SEQUENTIAL</code> and <code>LATEST</code>. Default:
     * <code>SEQUENTIAL</code>.
     * </p>
     */
    private java.util.List<String> storage;
    /**
     * <p>
     * The targeted thumbnail-generation interval in seconds. This is configurable (and required) only if
     * <code>recordingMode</code> is <code>INTERVAL</code>. Default: 60.
     * </p>
     * <p>
     * <b>Important:</b> For the <code>BASIC</code> channel type, setting a value for <code>targetIntervalSeconds</code>
     * does not guarantee that thumbnails are generated at the specified interval. For thumbnails to be generated at the
     * <code>targetIntervalSeconds</code> interval, the <code>IDR/Keyframe</code> value for the input video must be less
     * than the <code>targetIntervalSeconds</code> value. See <a
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
     * Indicates the desired resolution of recorded thumbnails. Thumbnails are recorded at the selected resolution if
     * the corresponding rendition is available during the stream; otherwise, they are recorded at source resolution.
     * For more information about resolution values and their corresponding height and width dimensions, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>. Default:
     * Null (source resolution is returned).
     * </p>
     * 
     * @param resolution
     *        Indicates the desired resolution of recorded thumbnails. Thumbnails are recorded at the selected
     *        resolution if the corresponding rendition is available during the stream; otherwise, they are recorded at
     *        source resolution. For more information about resolution values and their corresponding height and width
     *        dimensions, see <a href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record
     *        to Amazon S3</a>. Default: Null (source resolution is returned).
     * @see ThumbnailConfigurationResolution
     */

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    /**
     * <p>
     * Indicates the desired resolution of recorded thumbnails. Thumbnails are recorded at the selected resolution if
     * the corresponding rendition is available during the stream; otherwise, they are recorded at source resolution.
     * For more information about resolution values and their corresponding height and width dimensions, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>. Default:
     * Null (source resolution is returned).
     * </p>
     * 
     * @return Indicates the desired resolution of recorded thumbnails. Thumbnails are recorded at the selected
     *         resolution if the corresponding rendition is available during the stream; otherwise, they are recorded at
     *         source resolution. For more information about resolution values and their corresponding height and width
     *         dimensions, see <a href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record
     *         to Amazon S3</a>. Default: Null (source resolution is returned).
     * @see ThumbnailConfigurationResolution
     */

    public String getResolution() {
        return this.resolution;
    }

    /**
     * <p>
     * Indicates the desired resolution of recorded thumbnails. Thumbnails are recorded at the selected resolution if
     * the corresponding rendition is available during the stream; otherwise, they are recorded at source resolution.
     * For more information about resolution values and their corresponding height and width dimensions, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>. Default:
     * Null (source resolution is returned).
     * </p>
     * 
     * @param resolution
     *        Indicates the desired resolution of recorded thumbnails. Thumbnails are recorded at the selected
     *        resolution if the corresponding rendition is available during the stream; otherwise, they are recorded at
     *        source resolution. For more information about resolution values and their corresponding height and width
     *        dimensions, see <a href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record
     *        to Amazon S3</a>. Default: Null (source resolution is returned).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThumbnailConfigurationResolution
     */

    public ThumbnailConfiguration withResolution(String resolution) {
        setResolution(resolution);
        return this;
    }

    /**
     * <p>
     * Indicates the desired resolution of recorded thumbnails. Thumbnails are recorded at the selected resolution if
     * the corresponding rendition is available during the stream; otherwise, they are recorded at source resolution.
     * For more information about resolution values and their corresponding height and width dimensions, see <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record to Amazon S3</a>. Default:
     * Null (source resolution is returned).
     * </p>
     * 
     * @param resolution
     *        Indicates the desired resolution of recorded thumbnails. Thumbnails are recorded at the selected
     *        resolution if the corresponding rendition is available during the stream; otherwise, they are recorded at
     *        source resolution. For more information about resolution values and their corresponding height and width
     *        dimensions, see <a href="https://docs.aws.amazon.com/ivs/latest/userguide/record-to-s3.html">Auto-Record
     *        to Amazon S3</a>. Default: Null (source resolution is returned).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThumbnailConfigurationResolution
     */

    public ThumbnailConfiguration withResolution(ThumbnailConfigurationResolution resolution) {
        this.resolution = resolution.toString();
        return this;
    }

    /**
     * <p>
     * Indicates the format in which thumbnails are recorded. <code>SEQUENTIAL</code> records all generated thumbnails
     * in a serial manner, to the media/thumbnails directory. <code>LATEST</code> saves the latest thumbnail in
     * media/latest_thumbnail/thumb.jpg and overwrites it at the interval specified by
     * <code>targetIntervalSeconds</code>. You can enable both <code>SEQUENTIAL</code> and <code>LATEST</code>. Default:
     * <code>SEQUENTIAL</code>.
     * </p>
     * 
     * @return Indicates the format in which thumbnails are recorded. <code>SEQUENTIAL</code> records all generated
     *         thumbnails in a serial manner, to the media/thumbnails directory. <code>LATEST</code> saves the latest
     *         thumbnail in media/latest_thumbnail/thumb.jpg and overwrites it at the interval specified by
     *         <code>targetIntervalSeconds</code>. You can enable both <code>SEQUENTIAL</code> and <code>LATEST</code>.
     *         Default: <code>SEQUENTIAL</code>.
     * @see ThumbnailConfigurationStorage
     */

    public java.util.List<String> getStorage() {
        return storage;
    }

    /**
     * <p>
     * Indicates the format in which thumbnails are recorded. <code>SEQUENTIAL</code> records all generated thumbnails
     * in a serial manner, to the media/thumbnails directory. <code>LATEST</code> saves the latest thumbnail in
     * media/latest_thumbnail/thumb.jpg and overwrites it at the interval specified by
     * <code>targetIntervalSeconds</code>. You can enable both <code>SEQUENTIAL</code> and <code>LATEST</code>. Default:
     * <code>SEQUENTIAL</code>.
     * </p>
     * 
     * @param storage
     *        Indicates the format in which thumbnails are recorded. <code>SEQUENTIAL</code> records all generated
     *        thumbnails in a serial manner, to the media/thumbnails directory. <code>LATEST</code> saves the latest
     *        thumbnail in media/latest_thumbnail/thumb.jpg and overwrites it at the interval specified by
     *        <code>targetIntervalSeconds</code>. You can enable both <code>SEQUENTIAL</code> and <code>LATEST</code>.
     *        Default: <code>SEQUENTIAL</code>.
     * @see ThumbnailConfigurationStorage
     */

    public void setStorage(java.util.Collection<String> storage) {
        if (storage == null) {
            this.storage = null;
            return;
        }

        this.storage = new java.util.ArrayList<String>(storage);
    }

    /**
     * <p>
     * Indicates the format in which thumbnails are recorded. <code>SEQUENTIAL</code> records all generated thumbnails
     * in a serial manner, to the media/thumbnails directory. <code>LATEST</code> saves the latest thumbnail in
     * media/latest_thumbnail/thumb.jpg and overwrites it at the interval specified by
     * <code>targetIntervalSeconds</code>. You can enable both <code>SEQUENTIAL</code> and <code>LATEST</code>. Default:
     * <code>SEQUENTIAL</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStorage(java.util.Collection)} or {@link #withStorage(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param storage
     *        Indicates the format in which thumbnails are recorded. <code>SEQUENTIAL</code> records all generated
     *        thumbnails in a serial manner, to the media/thumbnails directory. <code>LATEST</code> saves the latest
     *        thumbnail in media/latest_thumbnail/thumb.jpg and overwrites it at the interval specified by
     *        <code>targetIntervalSeconds</code>. You can enable both <code>SEQUENTIAL</code> and <code>LATEST</code>.
     *        Default: <code>SEQUENTIAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThumbnailConfigurationStorage
     */

    public ThumbnailConfiguration withStorage(String... storage) {
        if (this.storage == null) {
            setStorage(new java.util.ArrayList<String>(storage.length));
        }
        for (String ele : storage) {
            this.storage.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Indicates the format in which thumbnails are recorded. <code>SEQUENTIAL</code> records all generated thumbnails
     * in a serial manner, to the media/thumbnails directory. <code>LATEST</code> saves the latest thumbnail in
     * media/latest_thumbnail/thumb.jpg and overwrites it at the interval specified by
     * <code>targetIntervalSeconds</code>. You can enable both <code>SEQUENTIAL</code> and <code>LATEST</code>. Default:
     * <code>SEQUENTIAL</code>.
     * </p>
     * 
     * @param storage
     *        Indicates the format in which thumbnails are recorded. <code>SEQUENTIAL</code> records all generated
     *        thumbnails in a serial manner, to the media/thumbnails directory. <code>LATEST</code> saves the latest
     *        thumbnail in media/latest_thumbnail/thumb.jpg and overwrites it at the interval specified by
     *        <code>targetIntervalSeconds</code>. You can enable both <code>SEQUENTIAL</code> and <code>LATEST</code>.
     *        Default: <code>SEQUENTIAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThumbnailConfigurationStorage
     */

    public ThumbnailConfiguration withStorage(java.util.Collection<String> storage) {
        setStorage(storage);
        return this;
    }

    /**
     * <p>
     * Indicates the format in which thumbnails are recorded. <code>SEQUENTIAL</code> records all generated thumbnails
     * in a serial manner, to the media/thumbnails directory. <code>LATEST</code> saves the latest thumbnail in
     * media/latest_thumbnail/thumb.jpg and overwrites it at the interval specified by
     * <code>targetIntervalSeconds</code>. You can enable both <code>SEQUENTIAL</code> and <code>LATEST</code>. Default:
     * <code>SEQUENTIAL</code>.
     * </p>
     * 
     * @param storage
     *        Indicates the format in which thumbnails are recorded. <code>SEQUENTIAL</code> records all generated
     *        thumbnails in a serial manner, to the media/thumbnails directory. <code>LATEST</code> saves the latest
     *        thumbnail in media/latest_thumbnail/thumb.jpg and overwrites it at the interval specified by
     *        <code>targetIntervalSeconds</code>. You can enable both <code>SEQUENTIAL</code> and <code>LATEST</code>.
     *        Default: <code>SEQUENTIAL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ThumbnailConfigurationStorage
     */

    public ThumbnailConfiguration withStorage(ThumbnailConfigurationStorage... storage) {
        java.util.ArrayList<String> storageCopy = new java.util.ArrayList<String>(storage.length);
        for (ThumbnailConfigurationStorage value : storage) {
            storageCopy.add(value.toString());
        }
        if (getStorage() == null) {
            setStorage(storageCopy);
        } else {
            getStorage().addAll(storageCopy);
        }
        return this;
    }

    /**
     * <p>
     * The targeted thumbnail-generation interval in seconds. This is configurable (and required) only if
     * <code>recordingMode</code> is <code>INTERVAL</code>. Default: 60.
     * </p>
     * <p>
     * <b>Important:</b> For the <code>BASIC</code> channel type, setting a value for <code>targetIntervalSeconds</code>
     * does not guarantee that thumbnails are generated at the specified interval. For thumbnails to be generated at the
     * <code>targetIntervalSeconds</code> interval, the <code>IDR/Keyframe</code> value for the input video must be less
     * than the <code>targetIntervalSeconds</code> value. See <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/streaming-config.html"> Amazon IVS Streaming
     * Configuration</a> for information on setting <code>IDR/Keyframe</code> to the recommended value in video-encoder
     * settings.
     * </p>
     * 
     * @param targetIntervalSeconds
     *        The targeted thumbnail-generation interval in seconds. This is configurable (and required) only if
     *        <code>recordingMode</code> is <code>INTERVAL</code>. Default: 60.</p>
     *        <p>
     *        <b>Important:</b> For the <code>BASIC</code> channel type, setting a value for
     *        <code>targetIntervalSeconds</code> does not guarantee that thumbnails are generated at the specified
     *        interval. For thumbnails to be generated at the <code>targetIntervalSeconds</code> interval, the
     *        <code>IDR/Keyframe</code> value for the input video must be less than the
     *        <code>targetIntervalSeconds</code> value. See <a
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
     * <b>Important:</b> For the <code>BASIC</code> channel type, setting a value for <code>targetIntervalSeconds</code>
     * does not guarantee that thumbnails are generated at the specified interval. For thumbnails to be generated at the
     * <code>targetIntervalSeconds</code> interval, the <code>IDR/Keyframe</code> value for the input video must be less
     * than the <code>targetIntervalSeconds</code> value. See <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/streaming-config.html"> Amazon IVS Streaming
     * Configuration</a> for information on setting <code>IDR/Keyframe</code> to the recommended value in video-encoder
     * settings.
     * </p>
     * 
     * @return The targeted thumbnail-generation interval in seconds. This is configurable (and required) only if
     *         <code>recordingMode</code> is <code>INTERVAL</code>. Default: 60.</p>
     *         <p>
     *         <b>Important:</b> For the <code>BASIC</code> channel type, setting a value for
     *         <code>targetIntervalSeconds</code> does not guarantee that thumbnails are generated at the specified
     *         interval. For thumbnails to be generated at the <code>targetIntervalSeconds</code> interval, the
     *         <code>IDR/Keyframe</code> value for the input video must be less than the
     *         <code>targetIntervalSeconds</code> value. See <a
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
     * <b>Important:</b> For the <code>BASIC</code> channel type, setting a value for <code>targetIntervalSeconds</code>
     * does not guarantee that thumbnails are generated at the specified interval. For thumbnails to be generated at the
     * <code>targetIntervalSeconds</code> interval, the <code>IDR/Keyframe</code> value for the input video must be less
     * than the <code>targetIntervalSeconds</code> value. See <a
     * href="https://docs.aws.amazon.com/ivs/latest/userguide/streaming-config.html"> Amazon IVS Streaming
     * Configuration</a> for information on setting <code>IDR/Keyframe</code> to the recommended value in video-encoder
     * settings.
     * </p>
     * 
     * @param targetIntervalSeconds
     *        The targeted thumbnail-generation interval in seconds. This is configurable (and required) only if
     *        <code>recordingMode</code> is <code>INTERVAL</code>. Default: 60.</p>
     *        <p>
     *        <b>Important:</b> For the <code>BASIC</code> channel type, setting a value for
     *        <code>targetIntervalSeconds</code> does not guarantee that thumbnails are generated at the specified
     *        interval. For thumbnails to be generated at the <code>targetIntervalSeconds</code> interval, the
     *        <code>IDR/Keyframe</code> value for the input video must be less than the
     *        <code>targetIntervalSeconds</code> value. See <a
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
        if (getResolution() != null)
            sb.append("Resolution: ").append(getResolution()).append(",");
        if (getStorage() != null)
            sb.append("Storage: ").append(getStorage()).append(",");
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
        if (other.getResolution() == null ^ this.getResolution() == null)
            return false;
        if (other.getResolution() != null && other.getResolution().equals(this.getResolution()) == false)
            return false;
        if (other.getStorage() == null ^ this.getStorage() == null)
            return false;
        if (other.getStorage() != null && other.getStorage().equals(this.getStorage()) == false)
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
        hashCode = prime * hashCode + ((getResolution() == null) ? 0 : getResolution().hashCode());
        hashCode = prime * hashCode + ((getStorage() == null) ? 0 : getStorage().hashCode());
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
