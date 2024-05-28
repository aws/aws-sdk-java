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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/CreateMediaInsightsPipeline"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateMediaInsightsPipelineRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ARN of the pipeline's configuration.
     * </p>
     */
    private String mediaInsightsPipelineConfigurationArn;
    /**
     * <p>
     * The runtime configuration for the Kinesis video stream source of the media insights pipeline.
     * </p>
     */
    private KinesisVideoStreamSourceRuntimeConfiguration kinesisVideoStreamSourceRuntimeConfiguration;
    /**
     * <p>
     * The runtime metadata for the media insights pipeline. Consists of a key-value map of strings.
     * </p>
     */
    private java.util.Map<String, String> mediaInsightsRuntimeMetadata;
    /**
     * <p>
     * The runtime configuration for the Kinesis video recording stream source.
     * </p>
     */
    private KinesisVideoStreamRecordingSourceRuntimeConfiguration kinesisVideoStreamRecordingSourceRuntimeConfiguration;
    /**
     * <p>
     * The runtime configuration for the S3 recording sink. If specified, the settings in this structure override any
     * settings in <code>S3RecordingSinkConfiguration</code>.
     * </p>
     */
    private S3RecordingSinkRuntimeConfiguration s3RecordingSinkRuntimeConfiguration;
    /**
     * <p>
     * The tags assigned to the media insights pipeline.
     * </p>
     */
    private java.util.List<Tag> tags;
    /**
     * <p>
     * The unique identifier for the media insights pipeline request.
     * </p>
     */
    private String clientRequestToken;

    /**
     * <p>
     * The ARN of the pipeline's configuration.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurationArn
     *        The ARN of the pipeline's configuration.
     */

    public void setMediaInsightsPipelineConfigurationArn(String mediaInsightsPipelineConfigurationArn) {
        this.mediaInsightsPipelineConfigurationArn = mediaInsightsPipelineConfigurationArn;
    }

    /**
     * <p>
     * The ARN of the pipeline's configuration.
     * </p>
     * 
     * @return The ARN of the pipeline's configuration.
     */

    public String getMediaInsightsPipelineConfigurationArn() {
        return this.mediaInsightsPipelineConfigurationArn;
    }

    /**
     * <p>
     * The ARN of the pipeline's configuration.
     * </p>
     * 
     * @param mediaInsightsPipelineConfigurationArn
     *        The ARN of the pipeline's configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineRequest withMediaInsightsPipelineConfigurationArn(String mediaInsightsPipelineConfigurationArn) {
        setMediaInsightsPipelineConfigurationArn(mediaInsightsPipelineConfigurationArn);
        return this;
    }

    /**
     * <p>
     * The runtime configuration for the Kinesis video stream source of the media insights pipeline.
     * </p>
     * 
     * @param kinesisVideoStreamSourceRuntimeConfiguration
     *        The runtime configuration for the Kinesis video stream source of the media insights pipeline.
     */

    public void setKinesisVideoStreamSourceRuntimeConfiguration(KinesisVideoStreamSourceRuntimeConfiguration kinesisVideoStreamSourceRuntimeConfiguration) {
        this.kinesisVideoStreamSourceRuntimeConfiguration = kinesisVideoStreamSourceRuntimeConfiguration;
    }

    /**
     * <p>
     * The runtime configuration for the Kinesis video stream source of the media insights pipeline.
     * </p>
     * 
     * @return The runtime configuration for the Kinesis video stream source of the media insights pipeline.
     */

    public KinesisVideoStreamSourceRuntimeConfiguration getKinesisVideoStreamSourceRuntimeConfiguration() {
        return this.kinesisVideoStreamSourceRuntimeConfiguration;
    }

    /**
     * <p>
     * The runtime configuration for the Kinesis video stream source of the media insights pipeline.
     * </p>
     * 
     * @param kinesisVideoStreamSourceRuntimeConfiguration
     *        The runtime configuration for the Kinesis video stream source of the media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineRequest withKinesisVideoStreamSourceRuntimeConfiguration(
            KinesisVideoStreamSourceRuntimeConfiguration kinesisVideoStreamSourceRuntimeConfiguration) {
        setKinesisVideoStreamSourceRuntimeConfiguration(kinesisVideoStreamSourceRuntimeConfiguration);
        return this;
    }

    /**
     * <p>
     * The runtime metadata for the media insights pipeline. Consists of a key-value map of strings.
     * </p>
     * 
     * @return The runtime metadata for the media insights pipeline. Consists of a key-value map of strings.
     */

    public java.util.Map<String, String> getMediaInsightsRuntimeMetadata() {
        return mediaInsightsRuntimeMetadata;
    }

    /**
     * <p>
     * The runtime metadata for the media insights pipeline. Consists of a key-value map of strings.
     * </p>
     * 
     * @param mediaInsightsRuntimeMetadata
     *        The runtime metadata for the media insights pipeline. Consists of a key-value map of strings.
     */

    public void setMediaInsightsRuntimeMetadata(java.util.Map<String, String> mediaInsightsRuntimeMetadata) {
        this.mediaInsightsRuntimeMetadata = mediaInsightsRuntimeMetadata;
    }

    /**
     * <p>
     * The runtime metadata for the media insights pipeline. Consists of a key-value map of strings.
     * </p>
     * 
     * @param mediaInsightsRuntimeMetadata
     *        The runtime metadata for the media insights pipeline. Consists of a key-value map of strings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineRequest withMediaInsightsRuntimeMetadata(java.util.Map<String, String> mediaInsightsRuntimeMetadata) {
        setMediaInsightsRuntimeMetadata(mediaInsightsRuntimeMetadata);
        return this;
    }

    /**
     * Add a single MediaInsightsRuntimeMetadata entry
     *
     * @see CreateMediaInsightsPipelineRequest#withMediaInsightsRuntimeMetadata
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineRequest addMediaInsightsRuntimeMetadataEntry(String key, String value) {
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

    public CreateMediaInsightsPipelineRequest clearMediaInsightsRuntimeMetadataEntries() {
        this.mediaInsightsRuntimeMetadata = null;
        return this;
    }

    /**
     * <p>
     * The runtime configuration for the Kinesis video recording stream source.
     * </p>
     * 
     * @param kinesisVideoStreamRecordingSourceRuntimeConfiguration
     *        The runtime configuration for the Kinesis video recording stream source.
     */

    public void setKinesisVideoStreamRecordingSourceRuntimeConfiguration(
            KinesisVideoStreamRecordingSourceRuntimeConfiguration kinesisVideoStreamRecordingSourceRuntimeConfiguration) {
        this.kinesisVideoStreamRecordingSourceRuntimeConfiguration = kinesisVideoStreamRecordingSourceRuntimeConfiguration;
    }

    /**
     * <p>
     * The runtime configuration for the Kinesis video recording stream source.
     * </p>
     * 
     * @return The runtime configuration for the Kinesis video recording stream source.
     */

    public KinesisVideoStreamRecordingSourceRuntimeConfiguration getKinesisVideoStreamRecordingSourceRuntimeConfiguration() {
        return this.kinesisVideoStreamRecordingSourceRuntimeConfiguration;
    }

    /**
     * <p>
     * The runtime configuration for the Kinesis video recording stream source.
     * </p>
     * 
     * @param kinesisVideoStreamRecordingSourceRuntimeConfiguration
     *        The runtime configuration for the Kinesis video recording stream source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineRequest withKinesisVideoStreamRecordingSourceRuntimeConfiguration(
            KinesisVideoStreamRecordingSourceRuntimeConfiguration kinesisVideoStreamRecordingSourceRuntimeConfiguration) {
        setKinesisVideoStreamRecordingSourceRuntimeConfiguration(kinesisVideoStreamRecordingSourceRuntimeConfiguration);
        return this;
    }

    /**
     * <p>
     * The runtime configuration for the S3 recording sink. If specified, the settings in this structure override any
     * settings in <code>S3RecordingSinkConfiguration</code>.
     * </p>
     * 
     * @param s3RecordingSinkRuntimeConfiguration
     *        The runtime configuration for the S3 recording sink. If specified, the settings in this structure override
     *        any settings in <code>S3RecordingSinkConfiguration</code>.
     */

    public void setS3RecordingSinkRuntimeConfiguration(S3RecordingSinkRuntimeConfiguration s3RecordingSinkRuntimeConfiguration) {
        this.s3RecordingSinkRuntimeConfiguration = s3RecordingSinkRuntimeConfiguration;
    }

    /**
     * <p>
     * The runtime configuration for the S3 recording sink. If specified, the settings in this structure override any
     * settings in <code>S3RecordingSinkConfiguration</code>.
     * </p>
     * 
     * @return The runtime configuration for the S3 recording sink. If specified, the settings in this structure
     *         override any settings in <code>S3RecordingSinkConfiguration</code>.
     */

    public S3RecordingSinkRuntimeConfiguration getS3RecordingSinkRuntimeConfiguration() {
        return this.s3RecordingSinkRuntimeConfiguration;
    }

    /**
     * <p>
     * The runtime configuration for the S3 recording sink. If specified, the settings in this structure override any
     * settings in <code>S3RecordingSinkConfiguration</code>.
     * </p>
     * 
     * @param s3RecordingSinkRuntimeConfiguration
     *        The runtime configuration for the S3 recording sink. If specified, the settings in this structure override
     *        any settings in <code>S3RecordingSinkConfiguration</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineRequest withS3RecordingSinkRuntimeConfiguration(S3RecordingSinkRuntimeConfiguration s3RecordingSinkRuntimeConfiguration) {
        setS3RecordingSinkRuntimeConfiguration(s3RecordingSinkRuntimeConfiguration);
        return this;
    }

    /**
     * <p>
     * The tags assigned to the media insights pipeline.
     * </p>
     * 
     * @return The tags assigned to the media insights pipeline.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags assigned to the media insights pipeline.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the media insights pipeline.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The tags assigned to the media insights pipeline.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tags assigned to the media insights pipeline.
     * </p>
     * 
     * @param tags
     *        The tags assigned to the media insights pipeline.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The unique identifier for the media insights pipeline request.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the media insights pipeline request.
     */

    public void setClientRequestToken(String clientRequestToken) {
        this.clientRequestToken = clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the media insights pipeline request.
     * </p>
     * 
     * @return The unique identifier for the media insights pipeline request.
     */

    public String getClientRequestToken() {
        return this.clientRequestToken;
    }

    /**
     * <p>
     * The unique identifier for the media insights pipeline request.
     * </p>
     * 
     * @param clientRequestToken
     *        The unique identifier for the media insights pipeline request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateMediaInsightsPipelineRequest withClientRequestToken(String clientRequestToken) {
        setClientRequestToken(clientRequestToken);
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
        if (getMediaInsightsPipelineConfigurationArn() != null)
            sb.append("MediaInsightsPipelineConfigurationArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getKinesisVideoStreamSourceRuntimeConfiguration() != null)
            sb.append("KinesisVideoStreamSourceRuntimeConfiguration: ").append(getKinesisVideoStreamSourceRuntimeConfiguration()).append(",");
        if (getMediaInsightsRuntimeMetadata() != null)
            sb.append("MediaInsightsRuntimeMetadata: ").append("***Sensitive Data Redacted***").append(",");
        if (getKinesisVideoStreamRecordingSourceRuntimeConfiguration() != null)
            sb.append("KinesisVideoStreamRecordingSourceRuntimeConfiguration: ").append(getKinesisVideoStreamRecordingSourceRuntimeConfiguration()).append(",");
        if (getS3RecordingSinkRuntimeConfiguration() != null)
            sb.append("S3RecordingSinkRuntimeConfiguration: ").append(getS3RecordingSinkRuntimeConfiguration()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientRequestToken() != null)
            sb.append("ClientRequestToken: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateMediaInsightsPipelineRequest == false)
            return false;
        CreateMediaInsightsPipelineRequest other = (CreateMediaInsightsPipelineRequest) obj;
        if (other.getMediaInsightsPipelineConfigurationArn() == null ^ this.getMediaInsightsPipelineConfigurationArn() == null)
            return false;
        if (other.getMediaInsightsPipelineConfigurationArn() != null
                && other.getMediaInsightsPipelineConfigurationArn().equals(this.getMediaInsightsPipelineConfigurationArn()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientRequestToken() == null ^ this.getClientRequestToken() == null)
            return false;
        if (other.getClientRequestToken() != null && other.getClientRequestToken().equals(this.getClientRequestToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMediaInsightsPipelineConfigurationArn() == null) ? 0 : getMediaInsightsPipelineConfigurationArn().hashCode());
        hashCode = prime * hashCode
                + ((getKinesisVideoStreamSourceRuntimeConfiguration() == null) ? 0 : getKinesisVideoStreamSourceRuntimeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getMediaInsightsRuntimeMetadata() == null) ? 0 : getMediaInsightsRuntimeMetadata().hashCode());
        hashCode = prime
                * hashCode
                + ((getKinesisVideoStreamRecordingSourceRuntimeConfiguration() == null) ? 0 : getKinesisVideoStreamRecordingSourceRuntimeConfiguration()
                        .hashCode());
        hashCode = prime * hashCode + ((getS3RecordingSinkRuntimeConfiguration() == null) ? 0 : getS3RecordingSinkRuntimeConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientRequestToken() == null) ? 0 : getClientRequestToken().hashCode());
        return hashCode;
    }

    @Override
    public CreateMediaInsightsPipelineRequest clone() {
        return (CreateMediaInsightsPipelineRequest) super.clone();
    }

}
