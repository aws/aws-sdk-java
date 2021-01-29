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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The storage configuration for the instance.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/InstanceStorageConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InstanceStorageConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource type and storage config for the given
     * instance ID.
     * </p>
     */
    private String associationId;
    /**
     * <p>
     * A valid storage type.
     * </p>
     */
    private String storageType;
    /**
     * <p>
     * The S3 bucket configuration.
     * </p>
     */
    private S3Config s3Config;
    /**
     * <p>
     * The configuration of the Kinesis video stream.
     * </p>
     */
    private KinesisVideoStreamConfig kinesisVideoStreamConfig;
    /**
     * <p>
     * The configuration of the Kinesis data stream.
     * </p>
     */
    private KinesisStreamConfig kinesisStreamConfig;
    /**
     * <p>
     * The configuration of the Kinesis Firehose delivery stream.
     * </p>
     */
    private KinesisFirehoseConfig kinesisFirehoseConfig;

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource type and storage config for the given
     * instance ID.
     * </p>
     * 
     * @param associationId
     *        The existing association identifier that uniquely identifies the resource type and storage config for the
     *        given instance ID.
     */

    public void setAssociationId(String associationId) {
        this.associationId = associationId;
    }

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource type and storage config for the given
     * instance ID.
     * </p>
     * 
     * @return The existing association identifier that uniquely identifies the resource type and storage config for the
     *         given instance ID.
     */

    public String getAssociationId() {
        return this.associationId;
    }

    /**
     * <p>
     * The existing association identifier that uniquely identifies the resource type and storage config for the given
     * instance ID.
     * </p>
     * 
     * @param associationId
     *        The existing association identifier that uniquely identifies the resource type and storage config for the
     *        given instance ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStorageConfig withAssociationId(String associationId) {
        setAssociationId(associationId);
        return this;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * 
     * @param storageType
     *        A valid storage type.
     * @see StorageType
     */

    public void setStorageType(String storageType) {
        this.storageType = storageType;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * 
     * @return A valid storage type.
     * @see StorageType
     */

    public String getStorageType() {
        return this.storageType;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * 
     * @param storageType
     *        A valid storage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public InstanceStorageConfig withStorageType(String storageType) {
        setStorageType(storageType);
        return this;
    }

    /**
     * <p>
     * A valid storage type.
     * </p>
     * 
     * @param storageType
     *        A valid storage type.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageType
     */

    public InstanceStorageConfig withStorageType(StorageType storageType) {
        this.storageType = storageType.toString();
        return this;
    }

    /**
     * <p>
     * The S3 bucket configuration.
     * </p>
     * 
     * @param s3Config
     *        The S3 bucket configuration.
     */

    public void setS3Config(S3Config s3Config) {
        this.s3Config = s3Config;
    }

    /**
     * <p>
     * The S3 bucket configuration.
     * </p>
     * 
     * @return The S3 bucket configuration.
     */

    public S3Config getS3Config() {
        return this.s3Config;
    }

    /**
     * <p>
     * The S3 bucket configuration.
     * </p>
     * 
     * @param s3Config
     *        The S3 bucket configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStorageConfig withS3Config(S3Config s3Config) {
        setS3Config(s3Config);
        return this;
    }

    /**
     * <p>
     * The configuration of the Kinesis video stream.
     * </p>
     * 
     * @param kinesisVideoStreamConfig
     *        The configuration of the Kinesis video stream.
     */

    public void setKinesisVideoStreamConfig(KinesisVideoStreamConfig kinesisVideoStreamConfig) {
        this.kinesisVideoStreamConfig = kinesisVideoStreamConfig;
    }

    /**
     * <p>
     * The configuration of the Kinesis video stream.
     * </p>
     * 
     * @return The configuration of the Kinesis video stream.
     */

    public KinesisVideoStreamConfig getKinesisVideoStreamConfig() {
        return this.kinesisVideoStreamConfig;
    }

    /**
     * <p>
     * The configuration of the Kinesis video stream.
     * </p>
     * 
     * @param kinesisVideoStreamConfig
     *        The configuration of the Kinesis video stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStorageConfig withKinesisVideoStreamConfig(KinesisVideoStreamConfig kinesisVideoStreamConfig) {
        setKinesisVideoStreamConfig(kinesisVideoStreamConfig);
        return this;
    }

    /**
     * <p>
     * The configuration of the Kinesis data stream.
     * </p>
     * 
     * @param kinesisStreamConfig
     *        The configuration of the Kinesis data stream.
     */

    public void setKinesisStreamConfig(KinesisStreamConfig kinesisStreamConfig) {
        this.kinesisStreamConfig = kinesisStreamConfig;
    }

    /**
     * <p>
     * The configuration of the Kinesis data stream.
     * </p>
     * 
     * @return The configuration of the Kinesis data stream.
     */

    public KinesisStreamConfig getKinesisStreamConfig() {
        return this.kinesisStreamConfig;
    }

    /**
     * <p>
     * The configuration of the Kinesis data stream.
     * </p>
     * 
     * @param kinesisStreamConfig
     *        The configuration of the Kinesis data stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStorageConfig withKinesisStreamConfig(KinesisStreamConfig kinesisStreamConfig) {
        setKinesisStreamConfig(kinesisStreamConfig);
        return this;
    }

    /**
     * <p>
     * The configuration of the Kinesis Firehose delivery stream.
     * </p>
     * 
     * @param kinesisFirehoseConfig
     *        The configuration of the Kinesis Firehose delivery stream.
     */

    public void setKinesisFirehoseConfig(KinesisFirehoseConfig kinesisFirehoseConfig) {
        this.kinesisFirehoseConfig = kinesisFirehoseConfig;
    }

    /**
     * <p>
     * The configuration of the Kinesis Firehose delivery stream.
     * </p>
     * 
     * @return The configuration of the Kinesis Firehose delivery stream.
     */

    public KinesisFirehoseConfig getKinesisFirehoseConfig() {
        return this.kinesisFirehoseConfig;
    }

    /**
     * <p>
     * The configuration of the Kinesis Firehose delivery stream.
     * </p>
     * 
     * @param kinesisFirehoseConfig
     *        The configuration of the Kinesis Firehose delivery stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InstanceStorageConfig withKinesisFirehoseConfig(KinesisFirehoseConfig kinesisFirehoseConfig) {
        setKinesisFirehoseConfig(kinesisFirehoseConfig);
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
        if (getAssociationId() != null)
            sb.append("AssociationId: ").append(getAssociationId()).append(",");
        if (getStorageType() != null)
            sb.append("StorageType: ").append(getStorageType()).append(",");
        if (getS3Config() != null)
            sb.append("S3Config: ").append(getS3Config()).append(",");
        if (getKinesisVideoStreamConfig() != null)
            sb.append("KinesisVideoStreamConfig: ").append(getKinesisVideoStreamConfig()).append(",");
        if (getKinesisStreamConfig() != null)
            sb.append("KinesisStreamConfig: ").append(getKinesisStreamConfig()).append(",");
        if (getKinesisFirehoseConfig() != null)
            sb.append("KinesisFirehoseConfig: ").append(getKinesisFirehoseConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InstanceStorageConfig == false)
            return false;
        InstanceStorageConfig other = (InstanceStorageConfig) obj;
        if (other.getAssociationId() == null ^ this.getAssociationId() == null)
            return false;
        if (other.getAssociationId() != null && other.getAssociationId().equals(this.getAssociationId()) == false)
            return false;
        if (other.getStorageType() == null ^ this.getStorageType() == null)
            return false;
        if (other.getStorageType() != null && other.getStorageType().equals(this.getStorageType()) == false)
            return false;
        if (other.getS3Config() == null ^ this.getS3Config() == null)
            return false;
        if (other.getS3Config() != null && other.getS3Config().equals(this.getS3Config()) == false)
            return false;
        if (other.getKinesisVideoStreamConfig() == null ^ this.getKinesisVideoStreamConfig() == null)
            return false;
        if (other.getKinesisVideoStreamConfig() != null && other.getKinesisVideoStreamConfig().equals(this.getKinesisVideoStreamConfig()) == false)
            return false;
        if (other.getKinesisStreamConfig() == null ^ this.getKinesisStreamConfig() == null)
            return false;
        if (other.getKinesisStreamConfig() != null && other.getKinesisStreamConfig().equals(this.getKinesisStreamConfig()) == false)
            return false;
        if (other.getKinesisFirehoseConfig() == null ^ this.getKinesisFirehoseConfig() == null)
            return false;
        if (other.getKinesisFirehoseConfig() != null && other.getKinesisFirehoseConfig().equals(this.getKinesisFirehoseConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAssociationId() == null) ? 0 : getAssociationId().hashCode());
        hashCode = prime * hashCode + ((getStorageType() == null) ? 0 : getStorageType().hashCode());
        hashCode = prime * hashCode + ((getS3Config() == null) ? 0 : getS3Config().hashCode());
        hashCode = prime * hashCode + ((getKinesisVideoStreamConfig() == null) ? 0 : getKinesisVideoStreamConfig().hashCode());
        hashCode = prime * hashCode + ((getKinesisStreamConfig() == null) ? 0 : getKinesisStreamConfig().hashCode());
        hashCode = prime * hashCode + ((getKinesisFirehoseConfig() == null) ? 0 : getKinesisFirehoseConfig().hashCode());
        return hashCode;
    }

    @Override
    public InstanceStorageConfig clone() {
        try {
            return (InstanceStorageConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.InstanceStorageConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
