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
package com.amazonaws.services.bedrock.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration fields for invocation logging.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/bedrock-2023-04-20/LoggingConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * CloudWatch logging configuration.
     * </p>
     */
    private CloudWatchConfig cloudWatchConfig;
    /**
     * <p>
     * S3 configuration for storing log data.
     * </p>
     */
    private S3Config s3Config;
    /**
     * <p>
     * Set to include text data in the log delivery.
     * </p>
     */
    private Boolean textDataDeliveryEnabled;
    /**
     * <p>
     * Set to include image data in the log delivery.
     * </p>
     */
    private Boolean imageDataDeliveryEnabled;
    /**
     * <p>
     * Set to include embeddings data in the log delivery.
     * </p>
     */
    private Boolean embeddingDataDeliveryEnabled;

    /**
     * <p>
     * CloudWatch logging configuration.
     * </p>
     * 
     * @param cloudWatchConfig
     *        CloudWatch logging configuration.
     */

    public void setCloudWatchConfig(CloudWatchConfig cloudWatchConfig) {
        this.cloudWatchConfig = cloudWatchConfig;
    }

    /**
     * <p>
     * CloudWatch logging configuration.
     * </p>
     * 
     * @return CloudWatch logging configuration.
     */

    public CloudWatchConfig getCloudWatchConfig() {
        return this.cloudWatchConfig;
    }

    /**
     * <p>
     * CloudWatch logging configuration.
     * </p>
     * 
     * @param cloudWatchConfig
     *        CloudWatch logging configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfig withCloudWatchConfig(CloudWatchConfig cloudWatchConfig) {
        setCloudWatchConfig(cloudWatchConfig);
        return this;
    }

    /**
     * <p>
     * S3 configuration for storing log data.
     * </p>
     * 
     * @param s3Config
     *        S3 configuration for storing log data.
     */

    public void setS3Config(S3Config s3Config) {
        this.s3Config = s3Config;
    }

    /**
     * <p>
     * S3 configuration for storing log data.
     * </p>
     * 
     * @return S3 configuration for storing log data.
     */

    public S3Config getS3Config() {
        return this.s3Config;
    }

    /**
     * <p>
     * S3 configuration for storing log data.
     * </p>
     * 
     * @param s3Config
     *        S3 configuration for storing log data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfig withS3Config(S3Config s3Config) {
        setS3Config(s3Config);
        return this;
    }

    /**
     * <p>
     * Set to include text data in the log delivery.
     * </p>
     * 
     * @param textDataDeliveryEnabled
     *        Set to include text data in the log delivery.
     */

    public void setTextDataDeliveryEnabled(Boolean textDataDeliveryEnabled) {
        this.textDataDeliveryEnabled = textDataDeliveryEnabled;
    }

    /**
     * <p>
     * Set to include text data in the log delivery.
     * </p>
     * 
     * @return Set to include text data in the log delivery.
     */

    public Boolean getTextDataDeliveryEnabled() {
        return this.textDataDeliveryEnabled;
    }

    /**
     * <p>
     * Set to include text data in the log delivery.
     * </p>
     * 
     * @param textDataDeliveryEnabled
     *        Set to include text data in the log delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfig withTextDataDeliveryEnabled(Boolean textDataDeliveryEnabled) {
        setTextDataDeliveryEnabled(textDataDeliveryEnabled);
        return this;
    }

    /**
     * <p>
     * Set to include text data in the log delivery.
     * </p>
     * 
     * @return Set to include text data in the log delivery.
     */

    public Boolean isTextDataDeliveryEnabled() {
        return this.textDataDeliveryEnabled;
    }

    /**
     * <p>
     * Set to include image data in the log delivery.
     * </p>
     * 
     * @param imageDataDeliveryEnabled
     *        Set to include image data in the log delivery.
     */

    public void setImageDataDeliveryEnabled(Boolean imageDataDeliveryEnabled) {
        this.imageDataDeliveryEnabled = imageDataDeliveryEnabled;
    }

    /**
     * <p>
     * Set to include image data in the log delivery.
     * </p>
     * 
     * @return Set to include image data in the log delivery.
     */

    public Boolean getImageDataDeliveryEnabled() {
        return this.imageDataDeliveryEnabled;
    }

    /**
     * <p>
     * Set to include image data in the log delivery.
     * </p>
     * 
     * @param imageDataDeliveryEnabled
     *        Set to include image data in the log delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfig withImageDataDeliveryEnabled(Boolean imageDataDeliveryEnabled) {
        setImageDataDeliveryEnabled(imageDataDeliveryEnabled);
        return this;
    }

    /**
     * <p>
     * Set to include image data in the log delivery.
     * </p>
     * 
     * @return Set to include image data in the log delivery.
     */

    public Boolean isImageDataDeliveryEnabled() {
        return this.imageDataDeliveryEnabled;
    }

    /**
     * <p>
     * Set to include embeddings data in the log delivery.
     * </p>
     * 
     * @param embeddingDataDeliveryEnabled
     *        Set to include embeddings data in the log delivery.
     */

    public void setEmbeddingDataDeliveryEnabled(Boolean embeddingDataDeliveryEnabled) {
        this.embeddingDataDeliveryEnabled = embeddingDataDeliveryEnabled;
    }

    /**
     * <p>
     * Set to include embeddings data in the log delivery.
     * </p>
     * 
     * @return Set to include embeddings data in the log delivery.
     */

    public Boolean getEmbeddingDataDeliveryEnabled() {
        return this.embeddingDataDeliveryEnabled;
    }

    /**
     * <p>
     * Set to include embeddings data in the log delivery.
     * </p>
     * 
     * @param embeddingDataDeliveryEnabled
     *        Set to include embeddings data in the log delivery.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfig withEmbeddingDataDeliveryEnabled(Boolean embeddingDataDeliveryEnabled) {
        setEmbeddingDataDeliveryEnabled(embeddingDataDeliveryEnabled);
        return this;
    }

    /**
     * <p>
     * Set to include embeddings data in the log delivery.
     * </p>
     * 
     * @return Set to include embeddings data in the log delivery.
     */

    public Boolean isEmbeddingDataDeliveryEnabled() {
        return this.embeddingDataDeliveryEnabled;
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
        if (getCloudWatchConfig() != null)
            sb.append("CloudWatchConfig: ").append(getCloudWatchConfig()).append(",");
        if (getS3Config() != null)
            sb.append("S3Config: ").append(getS3Config()).append(",");
        if (getTextDataDeliveryEnabled() != null)
            sb.append("TextDataDeliveryEnabled: ").append(getTextDataDeliveryEnabled()).append(",");
        if (getImageDataDeliveryEnabled() != null)
            sb.append("ImageDataDeliveryEnabled: ").append(getImageDataDeliveryEnabled()).append(",");
        if (getEmbeddingDataDeliveryEnabled() != null)
            sb.append("EmbeddingDataDeliveryEnabled: ").append(getEmbeddingDataDeliveryEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfig == false)
            return false;
        LoggingConfig other = (LoggingConfig) obj;
        if (other.getCloudWatchConfig() == null ^ this.getCloudWatchConfig() == null)
            return false;
        if (other.getCloudWatchConfig() != null && other.getCloudWatchConfig().equals(this.getCloudWatchConfig()) == false)
            return false;
        if (other.getS3Config() == null ^ this.getS3Config() == null)
            return false;
        if (other.getS3Config() != null && other.getS3Config().equals(this.getS3Config()) == false)
            return false;
        if (other.getTextDataDeliveryEnabled() == null ^ this.getTextDataDeliveryEnabled() == null)
            return false;
        if (other.getTextDataDeliveryEnabled() != null && other.getTextDataDeliveryEnabled().equals(this.getTextDataDeliveryEnabled()) == false)
            return false;
        if (other.getImageDataDeliveryEnabled() == null ^ this.getImageDataDeliveryEnabled() == null)
            return false;
        if (other.getImageDataDeliveryEnabled() != null && other.getImageDataDeliveryEnabled().equals(this.getImageDataDeliveryEnabled()) == false)
            return false;
        if (other.getEmbeddingDataDeliveryEnabled() == null ^ this.getEmbeddingDataDeliveryEnabled() == null)
            return false;
        if (other.getEmbeddingDataDeliveryEnabled() != null && other.getEmbeddingDataDeliveryEnabled().equals(this.getEmbeddingDataDeliveryEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCloudWatchConfig() == null) ? 0 : getCloudWatchConfig().hashCode());
        hashCode = prime * hashCode + ((getS3Config() == null) ? 0 : getS3Config().hashCode());
        hashCode = prime * hashCode + ((getTextDataDeliveryEnabled() == null) ? 0 : getTextDataDeliveryEnabled().hashCode());
        hashCode = prime * hashCode + ((getImageDataDeliveryEnabled() == null) ? 0 : getImageDataDeliveryEnabled().hashCode());
        hashCode = prime * hashCode + ((getEmbeddingDataDeliveryEnabled() == null) ? 0 : getEmbeddingDataDeliveryEnabled().hashCode());
        return hashCode;
    }

    @Override
    public LoggingConfig clone() {
        try {
            return (LoggingConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.bedrock.model.transform.LoggingConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
