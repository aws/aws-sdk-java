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
 * An element in a media insights pipeline configuration.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/MediaInsightsPipelineConfigurationElement"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaInsightsPipelineConfigurationElement implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The element type.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The analytics configuration settings for transcribing audio in a media insights pipeline configuration element.
     * </p>
     */
    private AmazonTranscribeCallAnalyticsProcessorConfiguration amazonTranscribeCallAnalyticsProcessorConfiguration;
    /**
     * <p>
     * The transcription processor configuration settings in a media insights pipeline configuration element.
     * </p>
     */
    private AmazonTranscribeProcessorConfiguration amazonTranscribeProcessorConfiguration;
    /**
     * <p>
     * The configuration settings for the Kinesis Data Stream Sink in a media insights pipeline configuration element.
     * </p>
     */
    private KinesisDataStreamSinkConfiguration kinesisDataStreamSinkConfiguration;
    /**
     * <p>
     * The configuration settings for the Amazon S3 recording bucket in a media insights pipeline configuration element.
     * </p>
     */
    private S3RecordingSinkConfiguration s3RecordingSinkConfiguration;
    /**
     * <p>
     * The voice analytics configuration settings in a media insights pipeline configuration element.
     * </p>
     */
    private VoiceAnalyticsProcessorConfiguration voiceAnalyticsProcessorConfiguration;
    /**
     * <p>
     * The configuration settings for the Amazon Web Services Lambda sink in a media insights pipeline configuration
     * element.
     * </p>
     */
    private LambdaFunctionSinkConfiguration lambdaFunctionSinkConfiguration;
    /**
     * <p>
     * The configuration settings for an SQS queue sink in a media insights pipeline configuration element.
     * </p>
     */
    private SqsQueueSinkConfiguration sqsQueueSinkConfiguration;
    /**
     * <p>
     * The configuration settings for an SNS topic sink in a media insights pipeline configuration element.
     * </p>
     */
    private SnsTopicSinkConfiguration snsTopicSinkConfiguration;
    /**
     * <p>
     * The configuration settings for voice enhancement sink in a media insights pipeline configuration element.
     * </p>
     */
    private VoiceEnhancementSinkConfiguration voiceEnhancementSinkConfiguration;

    /**
     * <p>
     * The element type.
     * </p>
     * 
     * @param type
     *        The element type.
     * @see MediaInsightsPipelineConfigurationElementType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The element type.
     * </p>
     * 
     * @return The element type.
     * @see MediaInsightsPipelineConfigurationElementType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The element type.
     * </p>
     * 
     * @param type
     *        The element type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaInsightsPipelineConfigurationElementType
     */

    public MediaInsightsPipelineConfigurationElement withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The element type.
     * </p>
     * 
     * @param type
     *        The element type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaInsightsPipelineConfigurationElementType
     */

    public MediaInsightsPipelineConfigurationElement withType(MediaInsightsPipelineConfigurationElementType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The analytics configuration settings for transcribing audio in a media insights pipeline configuration element.
     * </p>
     * 
     * @param amazonTranscribeCallAnalyticsProcessorConfiguration
     *        The analytics configuration settings for transcribing audio in a media insights pipeline configuration
     *        element.
     */

    public void setAmazonTranscribeCallAnalyticsProcessorConfiguration(
            AmazonTranscribeCallAnalyticsProcessorConfiguration amazonTranscribeCallAnalyticsProcessorConfiguration) {
        this.amazonTranscribeCallAnalyticsProcessorConfiguration = amazonTranscribeCallAnalyticsProcessorConfiguration;
    }

    /**
     * <p>
     * The analytics configuration settings for transcribing audio in a media insights pipeline configuration element.
     * </p>
     * 
     * @return The analytics configuration settings for transcribing audio in a media insights pipeline configuration
     *         element.
     */

    public AmazonTranscribeCallAnalyticsProcessorConfiguration getAmazonTranscribeCallAnalyticsProcessorConfiguration() {
        return this.amazonTranscribeCallAnalyticsProcessorConfiguration;
    }

    /**
     * <p>
     * The analytics configuration settings for transcribing audio in a media insights pipeline configuration element.
     * </p>
     * 
     * @param amazonTranscribeCallAnalyticsProcessorConfiguration
     *        The analytics configuration settings for transcribing audio in a media insights pipeline configuration
     *        element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfigurationElement withAmazonTranscribeCallAnalyticsProcessorConfiguration(
            AmazonTranscribeCallAnalyticsProcessorConfiguration amazonTranscribeCallAnalyticsProcessorConfiguration) {
        setAmazonTranscribeCallAnalyticsProcessorConfiguration(amazonTranscribeCallAnalyticsProcessorConfiguration);
        return this;
    }

    /**
     * <p>
     * The transcription processor configuration settings in a media insights pipeline configuration element.
     * </p>
     * 
     * @param amazonTranscribeProcessorConfiguration
     *        The transcription processor configuration settings in a media insights pipeline configuration element.
     */

    public void setAmazonTranscribeProcessorConfiguration(AmazonTranscribeProcessorConfiguration amazonTranscribeProcessorConfiguration) {
        this.amazonTranscribeProcessorConfiguration = amazonTranscribeProcessorConfiguration;
    }

    /**
     * <p>
     * The transcription processor configuration settings in a media insights pipeline configuration element.
     * </p>
     * 
     * @return The transcription processor configuration settings in a media insights pipeline configuration element.
     */

    public AmazonTranscribeProcessorConfiguration getAmazonTranscribeProcessorConfiguration() {
        return this.amazonTranscribeProcessorConfiguration;
    }

    /**
     * <p>
     * The transcription processor configuration settings in a media insights pipeline configuration element.
     * </p>
     * 
     * @param amazonTranscribeProcessorConfiguration
     *        The transcription processor configuration settings in a media insights pipeline configuration element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfigurationElement withAmazonTranscribeProcessorConfiguration(
            AmazonTranscribeProcessorConfiguration amazonTranscribeProcessorConfiguration) {
        setAmazonTranscribeProcessorConfiguration(amazonTranscribeProcessorConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration settings for the Kinesis Data Stream Sink in a media insights pipeline configuration element.
     * </p>
     * 
     * @param kinesisDataStreamSinkConfiguration
     *        The configuration settings for the Kinesis Data Stream Sink in a media insights pipeline configuration
     *        element.
     */

    public void setKinesisDataStreamSinkConfiguration(KinesisDataStreamSinkConfiguration kinesisDataStreamSinkConfiguration) {
        this.kinesisDataStreamSinkConfiguration = kinesisDataStreamSinkConfiguration;
    }

    /**
     * <p>
     * The configuration settings for the Kinesis Data Stream Sink in a media insights pipeline configuration element.
     * </p>
     * 
     * @return The configuration settings for the Kinesis Data Stream Sink in a media insights pipeline configuration
     *         element.
     */

    public KinesisDataStreamSinkConfiguration getKinesisDataStreamSinkConfiguration() {
        return this.kinesisDataStreamSinkConfiguration;
    }

    /**
     * <p>
     * The configuration settings for the Kinesis Data Stream Sink in a media insights pipeline configuration element.
     * </p>
     * 
     * @param kinesisDataStreamSinkConfiguration
     *        The configuration settings for the Kinesis Data Stream Sink in a media insights pipeline configuration
     *        element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfigurationElement withKinesisDataStreamSinkConfiguration(
            KinesisDataStreamSinkConfiguration kinesisDataStreamSinkConfiguration) {
        setKinesisDataStreamSinkConfiguration(kinesisDataStreamSinkConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration settings for the Amazon S3 recording bucket in a media insights pipeline configuration element.
     * </p>
     * 
     * @param s3RecordingSinkConfiguration
     *        The configuration settings for the Amazon S3 recording bucket in a media insights pipeline configuration
     *        element.
     */

    public void setS3RecordingSinkConfiguration(S3RecordingSinkConfiguration s3RecordingSinkConfiguration) {
        this.s3RecordingSinkConfiguration = s3RecordingSinkConfiguration;
    }

    /**
     * <p>
     * The configuration settings for the Amazon S3 recording bucket in a media insights pipeline configuration element.
     * </p>
     * 
     * @return The configuration settings for the Amazon S3 recording bucket in a media insights pipeline configuration
     *         element.
     */

    public S3RecordingSinkConfiguration getS3RecordingSinkConfiguration() {
        return this.s3RecordingSinkConfiguration;
    }

    /**
     * <p>
     * The configuration settings for the Amazon S3 recording bucket in a media insights pipeline configuration element.
     * </p>
     * 
     * @param s3RecordingSinkConfiguration
     *        The configuration settings for the Amazon S3 recording bucket in a media insights pipeline configuration
     *        element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfigurationElement withS3RecordingSinkConfiguration(S3RecordingSinkConfiguration s3RecordingSinkConfiguration) {
        setS3RecordingSinkConfiguration(s3RecordingSinkConfiguration);
        return this;
    }

    /**
     * <p>
     * The voice analytics configuration settings in a media insights pipeline configuration element.
     * </p>
     * 
     * @param voiceAnalyticsProcessorConfiguration
     *        The voice analytics configuration settings in a media insights pipeline configuration element.
     */

    public void setVoiceAnalyticsProcessorConfiguration(VoiceAnalyticsProcessorConfiguration voiceAnalyticsProcessorConfiguration) {
        this.voiceAnalyticsProcessorConfiguration = voiceAnalyticsProcessorConfiguration;
    }

    /**
     * <p>
     * The voice analytics configuration settings in a media insights pipeline configuration element.
     * </p>
     * 
     * @return The voice analytics configuration settings in a media insights pipeline configuration element.
     */

    public VoiceAnalyticsProcessorConfiguration getVoiceAnalyticsProcessorConfiguration() {
        return this.voiceAnalyticsProcessorConfiguration;
    }

    /**
     * <p>
     * The voice analytics configuration settings in a media insights pipeline configuration element.
     * </p>
     * 
     * @param voiceAnalyticsProcessorConfiguration
     *        The voice analytics configuration settings in a media insights pipeline configuration element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfigurationElement withVoiceAnalyticsProcessorConfiguration(
            VoiceAnalyticsProcessorConfiguration voiceAnalyticsProcessorConfiguration) {
        setVoiceAnalyticsProcessorConfiguration(voiceAnalyticsProcessorConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration settings for the Amazon Web Services Lambda sink in a media insights pipeline configuration
     * element.
     * </p>
     * 
     * @param lambdaFunctionSinkConfiguration
     *        The configuration settings for the Amazon Web Services Lambda sink in a media insights pipeline
     *        configuration element.
     */

    public void setLambdaFunctionSinkConfiguration(LambdaFunctionSinkConfiguration lambdaFunctionSinkConfiguration) {
        this.lambdaFunctionSinkConfiguration = lambdaFunctionSinkConfiguration;
    }

    /**
     * <p>
     * The configuration settings for the Amazon Web Services Lambda sink in a media insights pipeline configuration
     * element.
     * </p>
     * 
     * @return The configuration settings for the Amazon Web Services Lambda sink in a media insights pipeline
     *         configuration element.
     */

    public LambdaFunctionSinkConfiguration getLambdaFunctionSinkConfiguration() {
        return this.lambdaFunctionSinkConfiguration;
    }

    /**
     * <p>
     * The configuration settings for the Amazon Web Services Lambda sink in a media insights pipeline configuration
     * element.
     * </p>
     * 
     * @param lambdaFunctionSinkConfiguration
     *        The configuration settings for the Amazon Web Services Lambda sink in a media insights pipeline
     *        configuration element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfigurationElement withLambdaFunctionSinkConfiguration(LambdaFunctionSinkConfiguration lambdaFunctionSinkConfiguration) {
        setLambdaFunctionSinkConfiguration(lambdaFunctionSinkConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration settings for an SQS queue sink in a media insights pipeline configuration element.
     * </p>
     * 
     * @param sqsQueueSinkConfiguration
     *        The configuration settings for an SQS queue sink in a media insights pipeline configuration element.
     */

    public void setSqsQueueSinkConfiguration(SqsQueueSinkConfiguration sqsQueueSinkConfiguration) {
        this.sqsQueueSinkConfiguration = sqsQueueSinkConfiguration;
    }

    /**
     * <p>
     * The configuration settings for an SQS queue sink in a media insights pipeline configuration element.
     * </p>
     * 
     * @return The configuration settings for an SQS queue sink in a media insights pipeline configuration element.
     */

    public SqsQueueSinkConfiguration getSqsQueueSinkConfiguration() {
        return this.sqsQueueSinkConfiguration;
    }

    /**
     * <p>
     * The configuration settings for an SQS queue sink in a media insights pipeline configuration element.
     * </p>
     * 
     * @param sqsQueueSinkConfiguration
     *        The configuration settings for an SQS queue sink in a media insights pipeline configuration element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfigurationElement withSqsQueueSinkConfiguration(SqsQueueSinkConfiguration sqsQueueSinkConfiguration) {
        setSqsQueueSinkConfiguration(sqsQueueSinkConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration settings for an SNS topic sink in a media insights pipeline configuration element.
     * </p>
     * 
     * @param snsTopicSinkConfiguration
     *        The configuration settings for an SNS topic sink in a media insights pipeline configuration element.
     */

    public void setSnsTopicSinkConfiguration(SnsTopicSinkConfiguration snsTopicSinkConfiguration) {
        this.snsTopicSinkConfiguration = snsTopicSinkConfiguration;
    }

    /**
     * <p>
     * The configuration settings for an SNS topic sink in a media insights pipeline configuration element.
     * </p>
     * 
     * @return The configuration settings for an SNS topic sink in a media insights pipeline configuration element.
     */

    public SnsTopicSinkConfiguration getSnsTopicSinkConfiguration() {
        return this.snsTopicSinkConfiguration;
    }

    /**
     * <p>
     * The configuration settings for an SNS topic sink in a media insights pipeline configuration element.
     * </p>
     * 
     * @param snsTopicSinkConfiguration
     *        The configuration settings for an SNS topic sink in a media insights pipeline configuration element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfigurationElement withSnsTopicSinkConfiguration(SnsTopicSinkConfiguration snsTopicSinkConfiguration) {
        setSnsTopicSinkConfiguration(snsTopicSinkConfiguration);
        return this;
    }

    /**
     * <p>
     * The configuration settings for voice enhancement sink in a media insights pipeline configuration element.
     * </p>
     * 
     * @param voiceEnhancementSinkConfiguration
     *        The configuration settings for voice enhancement sink in a media insights pipeline configuration element.
     */

    public void setVoiceEnhancementSinkConfiguration(VoiceEnhancementSinkConfiguration voiceEnhancementSinkConfiguration) {
        this.voiceEnhancementSinkConfiguration = voiceEnhancementSinkConfiguration;
    }

    /**
     * <p>
     * The configuration settings for voice enhancement sink in a media insights pipeline configuration element.
     * </p>
     * 
     * @return The configuration settings for voice enhancement sink in a media insights pipeline configuration element.
     */

    public VoiceEnhancementSinkConfiguration getVoiceEnhancementSinkConfiguration() {
        return this.voiceEnhancementSinkConfiguration;
    }

    /**
     * <p>
     * The configuration settings for voice enhancement sink in a media insights pipeline configuration element.
     * </p>
     * 
     * @param voiceEnhancementSinkConfiguration
     *        The configuration settings for voice enhancement sink in a media insights pipeline configuration element.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaInsightsPipelineConfigurationElement withVoiceEnhancementSinkConfiguration(VoiceEnhancementSinkConfiguration voiceEnhancementSinkConfiguration) {
        setVoiceEnhancementSinkConfiguration(voiceEnhancementSinkConfiguration);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getAmazonTranscribeCallAnalyticsProcessorConfiguration() != null)
            sb.append("AmazonTranscribeCallAnalyticsProcessorConfiguration: ").append(getAmazonTranscribeCallAnalyticsProcessorConfiguration()).append(",");
        if (getAmazonTranscribeProcessorConfiguration() != null)
            sb.append("AmazonTranscribeProcessorConfiguration: ").append(getAmazonTranscribeProcessorConfiguration()).append(",");
        if (getKinesisDataStreamSinkConfiguration() != null)
            sb.append("KinesisDataStreamSinkConfiguration: ").append(getKinesisDataStreamSinkConfiguration()).append(",");
        if (getS3RecordingSinkConfiguration() != null)
            sb.append("S3RecordingSinkConfiguration: ").append(getS3RecordingSinkConfiguration()).append(",");
        if (getVoiceAnalyticsProcessorConfiguration() != null)
            sb.append("VoiceAnalyticsProcessorConfiguration: ").append(getVoiceAnalyticsProcessorConfiguration()).append(",");
        if (getLambdaFunctionSinkConfiguration() != null)
            sb.append("LambdaFunctionSinkConfiguration: ").append(getLambdaFunctionSinkConfiguration()).append(",");
        if (getSqsQueueSinkConfiguration() != null)
            sb.append("SqsQueueSinkConfiguration: ").append(getSqsQueueSinkConfiguration()).append(",");
        if (getSnsTopicSinkConfiguration() != null)
            sb.append("SnsTopicSinkConfiguration: ").append(getSnsTopicSinkConfiguration()).append(",");
        if (getVoiceEnhancementSinkConfiguration() != null)
            sb.append("VoiceEnhancementSinkConfiguration: ").append(getVoiceEnhancementSinkConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MediaInsightsPipelineConfigurationElement == false)
            return false;
        MediaInsightsPipelineConfigurationElement other = (MediaInsightsPipelineConfigurationElement) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getAmazonTranscribeCallAnalyticsProcessorConfiguration() == null ^ this.getAmazonTranscribeCallAnalyticsProcessorConfiguration() == null)
            return false;
        if (other.getAmazonTranscribeCallAnalyticsProcessorConfiguration() != null
                && other.getAmazonTranscribeCallAnalyticsProcessorConfiguration().equals(this.getAmazonTranscribeCallAnalyticsProcessorConfiguration()) == false)
            return false;
        if (other.getAmazonTranscribeProcessorConfiguration() == null ^ this.getAmazonTranscribeProcessorConfiguration() == null)
            return false;
        if (other.getAmazonTranscribeProcessorConfiguration() != null
                && other.getAmazonTranscribeProcessorConfiguration().equals(this.getAmazonTranscribeProcessorConfiguration()) == false)
            return false;
        if (other.getKinesisDataStreamSinkConfiguration() == null ^ this.getKinesisDataStreamSinkConfiguration() == null)
            return false;
        if (other.getKinesisDataStreamSinkConfiguration() != null
                && other.getKinesisDataStreamSinkConfiguration().equals(this.getKinesisDataStreamSinkConfiguration()) == false)
            return false;
        if (other.getS3RecordingSinkConfiguration() == null ^ this.getS3RecordingSinkConfiguration() == null)
            return false;
        if (other.getS3RecordingSinkConfiguration() != null && other.getS3RecordingSinkConfiguration().equals(this.getS3RecordingSinkConfiguration()) == false)
            return false;
        if (other.getVoiceAnalyticsProcessorConfiguration() == null ^ this.getVoiceAnalyticsProcessorConfiguration() == null)
            return false;
        if (other.getVoiceAnalyticsProcessorConfiguration() != null
                && other.getVoiceAnalyticsProcessorConfiguration().equals(this.getVoiceAnalyticsProcessorConfiguration()) == false)
            return false;
        if (other.getLambdaFunctionSinkConfiguration() == null ^ this.getLambdaFunctionSinkConfiguration() == null)
            return false;
        if (other.getLambdaFunctionSinkConfiguration() != null
                && other.getLambdaFunctionSinkConfiguration().equals(this.getLambdaFunctionSinkConfiguration()) == false)
            return false;
        if (other.getSqsQueueSinkConfiguration() == null ^ this.getSqsQueueSinkConfiguration() == null)
            return false;
        if (other.getSqsQueueSinkConfiguration() != null && other.getSqsQueueSinkConfiguration().equals(this.getSqsQueueSinkConfiguration()) == false)
            return false;
        if (other.getSnsTopicSinkConfiguration() == null ^ this.getSnsTopicSinkConfiguration() == null)
            return false;
        if (other.getSnsTopicSinkConfiguration() != null && other.getSnsTopicSinkConfiguration().equals(this.getSnsTopicSinkConfiguration()) == false)
            return false;
        if (other.getVoiceEnhancementSinkConfiguration() == null ^ this.getVoiceEnhancementSinkConfiguration() == null)
            return false;
        if (other.getVoiceEnhancementSinkConfiguration() != null
                && other.getVoiceEnhancementSinkConfiguration().equals(this.getVoiceEnhancementSinkConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime
                * hashCode
                + ((getAmazonTranscribeCallAnalyticsProcessorConfiguration() == null) ? 0 : getAmazonTranscribeCallAnalyticsProcessorConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAmazonTranscribeProcessorConfiguration() == null) ? 0 : getAmazonTranscribeProcessorConfiguration().hashCode());
        hashCode = prime * hashCode + ((getKinesisDataStreamSinkConfiguration() == null) ? 0 : getKinesisDataStreamSinkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getS3RecordingSinkConfiguration() == null) ? 0 : getS3RecordingSinkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVoiceAnalyticsProcessorConfiguration() == null) ? 0 : getVoiceAnalyticsProcessorConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionSinkConfiguration() == null) ? 0 : getLambdaFunctionSinkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSqsQueueSinkConfiguration() == null) ? 0 : getSqsQueueSinkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getSnsTopicSinkConfiguration() == null) ? 0 : getSnsTopicSinkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getVoiceEnhancementSinkConfiguration() == null) ? 0 : getVoiceEnhancementSinkConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public MediaInsightsPipelineConfigurationElement clone() {
        try {
            return (MediaInsightsPipelineConfigurationElement) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.MediaInsightsPipelineConfigurationElementMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
