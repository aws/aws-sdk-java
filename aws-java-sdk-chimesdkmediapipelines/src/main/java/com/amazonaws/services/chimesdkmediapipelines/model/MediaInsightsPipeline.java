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
package com.amazonaws.services.chimesdkmediapipelines.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A media pipeline that streams call analytics data.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/MediaInsightsPipeline"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaInsightsPipeline implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of a media insights pipeline.
     * </p>
     */
    private String mediaPipelineId;
    /**
     * <p>
     * The ARN of a media insights pipeline.
     * </p>
     */
    private String mediaPipelineArn;
    /**
     * <p>
     * The ARN of a media insight pipeline's configuration settings.
     * </p>
     */
    private String mediaInsightsPipelineConfigurationArn;
    /**
     * <p>
     * The status of a media insights pipeline.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The configuration settings for a Kinesis runtime video stream in a media insights pipeline.
     * </p>
     */
    private KinesisVideoStreamSourceRuntimeConfiguration kinesisVideoStreamSourceRuntimeConfiguration;
    /**
     * <p>
     * The runtime metadata of a media insights pipeline.
     * </p>
     */
    private java.util.Map<String, String> mediaInsightsRuntimeMetadata;
    /**
     * <p>
     * The runtime configuration settings for a Kinesis recording video stream in a media insights pipeline.
     * </p>
     */
    private KinesisVideoStreamRecordingSourceRuntimeConfiguration kinesisVideoStreamRecordingSourceRuntimeConfiguration;
    /**
     * <p>
     * The runtime configuration of the Amazon S3 bucket that stores recordings in a media insights pipeline.
     * </p>
     */
    private S3RecordingSinkRuntimeConfiguration s3RecordingSinkRuntimeConfiguration;
    /**
     * <p>
     * The time at which the media insights pipeline was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The statuses that the elements in a media insights pipeline can have during data processing.
     * </p>
     */
    private java.util.List<MediaInsightsPipelineElementStatus> elementStatuses;

    /**
     * <p>
     * The ID of a media insights pipeline.
     * </p>
     * 
     * @param mediaPipelineId
     *        The ID of a media insights pipeline.
     */

    public void setMediaPipelineId(String mediaPipelineId) {
        this.mediaPipelineId = mediaPipelineId;
    }

    /**
     * <p>
     * The ID of a media insights pipeline.
     * </p>
     * 
     * @return The ID of a media insights pipeline.
     */

    public String getMediaPipelineId() {
        return this.mediaPipelineId;
    }

    /**
     * <p>
     * The ID of a media insights pipeline.
     * </p>
     * 
     * @param mediaPipelineId
     *        The ID of a media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipeline withMediaPipelineId(String mediaPipelineId) {
        setMediaPipelineId(mediaPipelineId);
        return this;
    }

    /**
     * <p>
     * The ARN of a media insights pipeline.
     * </p>
     * 
     * @param mediaPipelineArn
     *        The ARN of a media insights pipeline.
     */

    public void setMediaPipelineArn(String mediaPipelineArn) {
        this.mediaPipelineArn = mediaPipelineArn;
    }

    /**
     * <p>
     * The ARN of a media insights pipeline.
     * </p>
     * 
     * @return The ARN of a media insights pipeline.
     */

    public String getMediaPipelineArn() {
        return this.mediaPipelineArn;
    }

    /**
     * <p>
     * The ARN of a media insights pipeline.
     * </p>
     * 
     * @param mediaPipelineArn
     *        The ARN of a media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipeline withMediaPipelineArn(String mediaPipelineArn) {
        setMediaPipelineArn(mediaPipelineArn);
        return this;
    }

    /**
     * <p>
     * The ARN of a media insight pipeline's configuration settings.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurationArn
     *        The ARN of a media insight pipeline's configuration settings.
     */

    public void setMediaInsightsPipelineConfigurationArn(String mediaInsightsPipelineConfigurationArn) {
        this.mediaInsightsPipelineConfigurationArn = mediaInsightsPipelineConfigurationArn;
    }

    /**
     * <p>
     * The ARN of a media insight pipeline's configuration settings.
     * </p>
     * 
     * @return The ARN of a media insight pipeline's configuration settings.
     */

    public String getMediaInsightsPipelineConfigurationArn() {
        return this.mediaInsightsPipelineConfigurationArn;
    }

    /**
     * <p>
     * The ARN of a media insight pipeline's configuration settings.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurationArn
     *        The ARN of a media insight pipeline's configuration settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipeline withMediaInsightsPipelineConfigurationArn(String mediaInsightsPipelineConfigurationArn) {
        setMediaInsightsPipelineConfigurationArn(mediaInsightsPipelineConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The status of a media insights pipeline.
     * </p>
     * 
     * @param status
     *        The status of a media insights pipeline.
     * @see MediaPipelineStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a media insights pipeline.
     * </p>
     * 
     * @return The status of a media insights pipeline.
     * @see MediaPipelineStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a media insights pipeline.
     * </p>
     * 
     * @param status
     *        The status of a media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineStatus
     */

    public MediaInsightsPipeline withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a media insights pipeline.
     * </p>
     * 
     * @param status
     *        The status of a media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaPipelineStatus
     */

    public MediaInsightsPipeline withStatus(MediaPipelineStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The configuration settings for a Kinesis runtime video stream in a media insights pipeline.
     * </p>
     * 
     * @param kinesisVideoStreamSourceRuntimeConfiguration
     *        The configuration settings for a Kinesis runtime video stream in a media insights pipeline.
     */

    public void setKinesisVideoStreamSourceRuntimeConfiguration(KinesisVideoStreamSourceRuntimeConfiguration kinesisVideoStreamSourceRuntimeConfiguration) {
        this.kinesisVideoStreamSourceRuntimeConfiguration = kinesisVideoStreamSourceRuntimeConfiguration;
    }

    /**
     * <p>
     * The configuration settings for a Kinesis runtime video stream in a media insights pipeline.
     * </p>
     * 
     * @return The configuration settings for a Kinesis runtime video stream in a media insights pipeline.
     */

    public KinesisVideoStreamSourceRuntimeConfiguration getKinesisVideoStreamSourceRuntimeConfiguration() {
        return this.kinesisVideoStreamSourceRuntimeConfiguration;
    }

    /**
     * <p>
     * The configuration settings for a Kinesis runtime video stream in a media insights pipeline.
     * </p>
     * 
     * @param kinesisVideoStreamSourceRuntimeConfiguration
     *        The configuration settings for a Kinesis runtime video stream in a media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipeline withKinesisVideoStreamSourceRuntimeConfiguration(
            KinesisVideoStreamSourceRuntimeConfiguration kinesisVideoStreamSourceRuntimeConfiguration) {
        setKinesisVideoStreamSourceRuntimeConfiguration(kinesisVideoStreamSourceRuntimeConfiguration);
        return this;
    }

    /**
     * <p>
     * The runtime metadata of a media insights pipeline.
     * </p>
     * 
     * @return The runtime metadata of a media insights pipeline.
     */

    public java.util.Map<String, String> getMediaInsightsRuntimeMetadata() {
        return mediaInsightsRuntimeMetadata;
    }

    /**
     * <p>
     * The runtime metadata of a media insights pipeline.
     * </p>
     * 
     * @param mediaInsightsRuntimeMetadata
     *        The runtime metadata of a media insights pipeline.
     */

    public void setMediaInsightsRuntimeMetadata(java.util.Map<String, String> mediaInsightsRuntimeMetadata) {
        this.mediaInsightsRuntimeMetadata = mediaInsightsRuntimeMetadata;
    }

    /**
     * <p>
     * The runtime metadata of a media insights pipeline.
     * </p>
     * 
     * @param mediaInsightsRuntimeMetadata
     *        The runtime metadata of a media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipeline withMediaInsightsRuntimeMetadata(java.util.Map<String, String> mediaInsightsRuntimeMetadata) {
        setMediaInsightsRuntimeMetadata(mediaInsightsRuntimeMetadata);
        return this;
    }

    /**
     * Add a single MediaInsightsRuntimeMetadata entry
     *
     * @see MediaInsightsPipeline#withMediaInsightsRuntimeMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipeline addMediaInsightsRuntimeMetadataEntry(String key, String value) {
        if (null == this.mediaInsightsRuntimeMetadata) {
            this.mediaInsightsRuntimeMetadata = new java.util.HashMap<String, String>();
        }
        if (this.mediaInsightsRuntimeMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.mediaInsightsRuntimeMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MediaInsightsRuntimeMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipeline clearMediaInsightsRuntimeMetadataEntries() {
        this.mediaInsightsRuntimeMetadata = null;
        return this;
    }

    /**
     * <p>
     * The runtime configuration settings for a Kinesis recording video stream in a media insights pipeline.
     * </p>
     * 
     * @param kinesisVideoStreamRecordingSourceRuntimeConfiguration
     *        The runtime configuration settings for a Kinesis recording video stream in a media insights pipeline.
     */

    public void setKinesisVideoStreamRecordingSourceRuntimeConfiguration(
            KinesisVideoStreamRecordingSourceRuntimeConfiguration kinesisVideoStreamRecordingSourceRuntimeConfiguration) {
        this.kinesisVideoStreamRecordingSourceRuntimeConfiguration = kinesisVideoStreamRecordingSourceRuntimeConfiguration;
    }

    /**
     * <p>
     * The runtime configuration settings for a Kinesis recording video stream in a media insights pipeline.
     * </p>
     * 
     * @return The runtime configuration settings for a Kinesis recording video stream in a media insights pipeline.
     */

    public KinesisVideoStreamRecordingSourceRuntimeConfiguration getKinesisVideoStreamRecordingSourceRuntimeConfiguration() {
        return this.kinesisVideoStreamRecordingSourceRuntimeConfiguration;
    }

    /**
     * <p>
     * The runtime configuration settings for a Kinesis recording video stream in a media insights pipeline.
     * </p>
     * 
     * @param kinesisVideoStreamRecordingSourceRuntimeConfiguration
     *        The runtime configuration settings for a Kinesis recording video stream in a media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipeline withKinesisVideoStreamRecordingSourceRuntimeConfiguration(
            KinesisVideoStreamRecordingSourceRuntimeConfiguration kinesisVideoStreamRecordingSourceRuntimeConfiguration) {
        setKinesisVideoStreamRecordingSourceRuntimeConfiguration(kinesisVideoStreamRecordingSourceRuntimeConfiguration);
        return this;
    }

    /**
     * <p>
     * The runtime configuration of the Amazon S3 bucket that stores recordings in a media insights pipeline.
     * </p>
     * 
     * @param s3RecordingSinkRuntimeConfiguration
     *        The runtime configuration of the Amazon S3 bucket that stores recordings in a media insights pipeline.
     */

    public void setS3RecordingSinkRuntimeConfiguration(S3RecordingSinkRuntimeConfiguration s3RecordingSinkRuntimeConfiguration) {
        this.s3RecordingSinkRuntimeConfiguration = s3RecordingSinkRuntimeConfiguration;
    }

    /**
     * <p>
     * The runtime configuration of the Amazon S3 bucket that stores recordings in a media insights pipeline.
     * </p>
     * 
     * @return The runtime configuration of the Amazon S3 bucket that stores recordings in a media insights pipeline.
     */

    public S3RecordingSinkRuntimeConfiguration getS3RecordingSinkRuntimeConfiguration() {
        return this.s3RecordingSinkRuntimeConfiguration;
    }

    /**
     * <p>
     * The runtime configuration of the Amazon S3 bucket that stores recordings in a media insights pipeline.
     * </p>
     * 
     * @param s3RecordingSinkRuntimeConfiguration
     *        The runtime configuration of the Amazon S3 bucket that stores recordings in a media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipeline withS3RecordingSinkRuntimeConfiguration(S3RecordingSinkRuntimeConfiguration s3RecordingSinkRuntimeConfiguration) {
        setS3RecordingSinkRuntimeConfiguration(s3RecordingSinkRuntimeConfiguration);
        return this;
    }

    /**
     * <p>
     * The time at which the media insights pipeline was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the media insights pipeline was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the media insights pipeline was created.
     * </p>
     * 
     * @return The time at which the media insights pipeline was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which the media insights pipeline was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the media insights pipeline was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipeline withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The statuses that the elements in a media insights pipeline can have during data processing.
     * </p>
     * 
     * @return The statuses that the elements in a media insights pipeline can have during data processing.
     */

    public java.util.List<MediaInsightsPipelineElementStatus> getElementStatuses() {
        return elementStatuses;
    }

    /**
     * <p>
     * The statuses that the elements in a media insights pipeline can have during data processing.
     * </p>
     * 
     * @param elementStatuses
     *        The statuses that the elements in a media insights pipeline can have during data processing.
     */

    public void setElementStatuses(java.util.Collection<MediaInsightsPipelineElementStatus> elementStatuses) {
        if (elementStatuses == null) {
            this.elementStatuses = null;
            return;
        }

        this.elementStatuses = new java.util.ArrayList<MediaInsightsPipelineElementStatus>(elementStatuses);
    }

    /**
     * <p>
     * The statuses that the elements in a media insights pipeline can have during data processing.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setElementStatuses(java.util.Collection)} or {@link #withElementStatuses(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param elementStatuses
     *        The statuses that the elements in a media insights pipeline can have during data processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipeline withElementStatuses(MediaInsightsPipelineElementStatus... elementStatuses) {
        if (this.elementStatuses == null) {
            setElementStatuses(new java.util.ArrayList<MediaInsightsPipelineElementStatus>(elementStatuses.length));
        }
        for (MediaInsightsPipelineElementStatus ele : elementStatuses) {
            this.elementStatuses.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The statuses that the elements in a media insights pipeline can have during data processing.
     * </p>
     * 
     * @param elementStatuses
     *        The statuses that the elements in a media insights pipeline can have during data processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipeline withElementStatuses(java.util.Collection<MediaInsightsPipelineElementStatus> elementStatuses) {
        setElementStatuses(elementStatuses);
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
        if (getMediaPipelineId() != null)
            sb.append("MediaPipelineId: ").append(getMediaPipelineId()).append(",");
        if (getMediaPipelineArn() != null)
            sb.append("MediaPipelineArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getMediaInsightsPipelineConfigurationArn() != null)
            sb.append("MediaInsightsPipelineConfigurationArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getKinesisVideoStreamSourceRuntimeConfiguration() != null)
            sb.append("KinesisVideoStreamSourceRuntimeConfiguration: ").append(getKinesisVideoStreamSourceRuntimeConfiguration()).append(",");
        if (getMediaInsightsRuntimeMetadata() != null)
            sb.append("MediaInsightsRuntimeMetadata: ").append("***Sensitive Data Redacted***").append(",");
        if (getKinesisVideoStreamRecordingSourceRuntimeConfiguration() != null)
            sb.append("KinesisVideoStreamRecordingSourceRuntimeConfiguration: ").append(getKinesisVideoStreamRecordingSourceRuntimeConfiguration()).append(",");
        if (getS3RecordingSinkRuntimeConfiguration() != null)
            sb.append("S3RecordingSinkRuntimeConfiguration: ").append(getS3RecordingSinkRuntimeConfiguration()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getElementStatuses() != null)
            sb.append("ElementStatuses: ").append(getElementStatuses());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaInsightsPipeline == false)
            return false;
        MediaInsightsPipeline other = (MediaInsightsPipeline) obj;
        if (other.getMediaPipelineId() == null ^ this.getMediaPipelineId() == null)
            return false;
        if (other.getMediaPipelineId() != null && other.getMediaPipelineId().equals(this.getMediaPipelineId()) == false)
            return false;
        if (other.getMediaPipelineArn() == null ^ this.getMediaPipelineArn() == null)
            return false;
        if (other.getMediaPipelineArn() != null && other.getMediaPipelineArn().equals(this.getMediaPipelineArn()) == false)
            return false;
        if (other.getMediaInsightsPipelineConfigurationArn() == null ^ this.getMediaInsightsPipelineConfigurationArn() == null)
            return false;
        if (other.getMediaInsightsPipelineConfigurationArn() != null
                && other.getMediaInsightsPipelineConfigurationArn().equals(this.getMediaInsightsPipelineConfigurationArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getKinesisVideoStreamSourceRuntimeConfiguration() == null ^ this.getKinesisVideoStreamSourceRuntimeConfiguration() == null)
            return false;
        if (other.getKinesisVideoStreamSourceRuntimeConfiguration() != null
                && other.getKinesisVideoStreamSourceRuntimeConfiguration().equals(this.getKinesisVideoStreamSourceRuntimeConfiguration()) == false)
            return false;
        if (other.getMediaInsightsRuntimeMetadata() == null ^ this.getMediaInsightsRuntimeMetadata() == null)
            return false;
        if (other.getMediaInsightsRuntimeMetadata() != null && other.getMediaInsightsRuntimeMetadata().equals(this.getMediaInsightsRuntimeMetadata()) == false)
            return false;
        if (other.getKinesisVideoStreamRecordingSourceRuntimeConfiguration() == null ^ this.getKinesisVideoStreamRecordingSourceRuntimeConfiguration() == null)
            return false;
        if (other.getKinesisVideoStreamRecordingSourceRuntimeConfiguration() != null
                && other.getKinesisVideoStreamRecordingSourceRuntimeConfiguration().equals(this.getKinesisVideoStreamRecordingSourceRuntimeConfiguration()) == false)
            return false;
        if (other.getS3RecordingSinkRuntimeConfiguration() == null ^ this.getS3RecordingSinkRuntimeConfiguration() == null)
            return false;
        if (other.getS3RecordingSinkRuntimeConfiguration() != null
                && other.getS3RecordingSinkRuntimeConfiguration().equals(this.getS3RecordingSinkRuntimeConfiguration()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getElementStatuses() == null ^ this.getElementStatuses() == null)
            return false;
        if (other.getElementStatuses() != null && other.getElementStatuses().equals(this.getElementStatuses()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaPipelineId() == null) ? 0 : getMediaPipelineId().hashCode());
        hashCode = prime * hashCode + ((getMediaPipelineArn() == null) ? 0 : getMediaPipelineArn().hashCode());
        hashCode = prime * hashCode + ((getMediaInsightsPipelineConfigurationArn() == null) ? 0 : getMediaInsightsPipelineConfigurationArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode
                + ((getKinesisVideoStreamSourceRuntimeConfiguration() == null) ? 0 : getKinesisVideoStreamSourceRuntimeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMediaInsightsRuntimeMetadata() == null) ? 0 : getMediaInsightsRuntimeMetadata().hashCode());
        hashCode = prime
                * hashCode
                + ((getKinesisVideoStreamRecordingSourceRuntimeConfiguration() == null) ? 0 : getKinesisVideoStreamRecordingSourceRuntimeConfiguration()
                        .hashCode());
        hashCode = prime * hashCode + ((getS3RecordingSinkRuntimeConfiguration() == null) ? 0 : getS3RecordingSinkRuntimeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getElementStatuses() == null) ? 0 : getElementStatuses().hashCode());
        return hashCode;
    }

    @Override
    public MediaInsightsPipeline clone() {
        try {
            return (MediaInsightsPipeline) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.MediaInsightsPipelineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
