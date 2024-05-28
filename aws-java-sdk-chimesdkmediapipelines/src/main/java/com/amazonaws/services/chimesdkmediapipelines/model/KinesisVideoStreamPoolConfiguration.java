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
 * The video stream pool configuration object.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/KinesisVideoStreamPoolConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisVideoStreamPoolConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the video stream pool configuration.
     * </p>
     */
    private String poolArn;
    /**
     * <p>
     * The name of the video stream pool configuration.
     * </p>
     */
    private String poolName;
    /**
     * <p>
     * The ID of the video stream pool in the configuration.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * The status of the video stream pool in the configuration.
     * </p>
     */
    private String poolStatus;
    /**
     * <p>
     * The size of the video stream pool in the configuration.
     * </p>
     */
    private Integer poolSize;
    /**
     * <p>
     * The Kinesis video stream pool configuration object.
     * </p>
     */
    private KinesisVideoStreamConfiguration streamConfiguration;
    /**
     * <p>
     * The time at which the configuration was created.
     * </p>
     */
    private java.util.Date createdTimestamp;
    /**
     * <p>
     * The time at which the configuration was updated.
     * </p>
     */
    private java.util.Date updatedTimestamp;

    /**
     * <p>
     * The ARN of the video stream pool configuration.
     * </p>
     * 
     * @param poolArn
     *        The ARN of the video stream pool configuration.
     */

    public void setPoolArn(String poolArn) {
        this.poolArn = poolArn;
    }

    /**
     * <p>
     * The ARN of the video stream pool configuration.
     * </p>
     * 
     * @return The ARN of the video stream pool configuration.
     */

    public String getPoolArn() {
        return this.poolArn;
    }

    /**
     * <p>
     * The ARN of the video stream pool configuration.
     * </p>
     * 
     * @param poolArn
     *        The ARN of the video stream pool configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamPoolConfiguration withPoolArn(String poolArn) {
        setPoolArn(poolArn);
        return this;
    }

    /**
     * <p>
     * The name of the video stream pool configuration.
     * </p>
     * 
     * @param poolName
     *        The name of the video stream pool configuration.
     */

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    /**
     * <p>
     * The name of the video stream pool configuration.
     * </p>
     * 
     * @return The name of the video stream pool configuration.
     */

    public String getPoolName() {
        return this.poolName;
    }

    /**
     * <p>
     * The name of the video stream pool configuration.
     * </p>
     * 
     * @param poolName
     *        The name of the video stream pool configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamPoolConfiguration withPoolName(String poolName) {
        setPoolName(poolName);
        return this;
    }

    /**
     * <p>
     * The ID of the video stream pool in the configuration.
     * </p>
     * 
     * @param poolId
     *        The ID of the video stream pool in the configuration.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the video stream pool in the configuration.
     * </p>
     * 
     * @return The ID of the video stream pool in the configuration.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the video stream pool in the configuration.
     * </p>
     * 
     * @param poolId
     *        The ID of the video stream pool in the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamPoolConfiguration withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * The status of the video stream pool in the configuration.
     * </p>
     * 
     * @param poolStatus
     *        The status of the video stream pool in the configuration.
     * @see KinesisVideoStreamPoolStatus
     */

    public void setPoolStatus(String poolStatus) {
        this.poolStatus = poolStatus;
    }

    /**
     * <p>
     * The status of the video stream pool in the configuration.
     * </p>
     * 
     * @return The status of the video stream pool in the configuration.
     * @see KinesisVideoStreamPoolStatus
     */

    public String getPoolStatus() {
        return this.poolStatus;
    }

    /**
     * <p>
     * The status of the video stream pool in the configuration.
     * </p>
     * 
     * @param poolStatus
     *        The status of the video stream pool in the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KinesisVideoStreamPoolStatus
     */

    public KinesisVideoStreamPoolConfiguration withPoolStatus(String poolStatus) {
        setPoolStatus(poolStatus);
        return this;
    }

    /**
     * <p>
     * The status of the video stream pool in the configuration.
     * </p>
     * 
     * @param poolStatus
     *        The status of the video stream pool in the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see KinesisVideoStreamPoolStatus
     */

    public KinesisVideoStreamPoolConfiguration withPoolStatus(KinesisVideoStreamPoolStatus poolStatus) {
        this.poolStatus = poolStatus.toString();
        return this;
    }

    /**
     * <p>
     * The size of the video stream pool in the configuration.
     * </p>
     * 
     * @param poolSize
     *        The size of the video stream pool in the configuration.
     */

    public void setPoolSize(Integer poolSize) {
        this.poolSize = poolSize;
    }

    /**
     * <p>
     * The size of the video stream pool in the configuration.
     * </p>
     * 
     * @return The size of the video stream pool in the configuration.
     */

    public Integer getPoolSize() {
        return this.poolSize;
    }

    /**
     * <p>
     * The size of the video stream pool in the configuration.
     * </p>
     * 
     * @param poolSize
     *        The size of the video stream pool in the configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamPoolConfiguration withPoolSize(Integer poolSize) {
        setPoolSize(poolSize);
        return this;
    }

    /**
     * <p>
     * The Kinesis video stream pool configuration object.
     * </p>
     * 
     * @param streamConfiguration
     *        The Kinesis video stream pool configuration object.
     */

    public void setStreamConfiguration(KinesisVideoStreamConfiguration streamConfiguration) {
        this.streamConfiguration = streamConfiguration;
    }

    /**
     * <p>
     * The Kinesis video stream pool configuration object.
     * </p>
     * 
     * @return The Kinesis video stream pool configuration object.
     */

    public KinesisVideoStreamConfiguration getStreamConfiguration() {
        return this.streamConfiguration;
    }

    /**
     * <p>
     * The Kinesis video stream pool configuration object.
     * </p>
     * 
     * @param streamConfiguration
     *        The Kinesis video stream pool configuration object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamPoolConfiguration withStreamConfiguration(KinesisVideoStreamConfiguration streamConfiguration) {
        setStreamConfiguration(streamConfiguration);
        return this;
    }

    /**
     * <p>
     * The time at which the configuration was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the configuration was created.
     */

    public void setCreatedTimestamp(java.util.Date createdTimestamp) {
        this.createdTimestamp = createdTimestamp;
    }

    /**
     * <p>
     * The time at which the configuration was created.
     * </p>
     * 
     * @return The time at which the configuration was created.
     */

    public java.util.Date getCreatedTimestamp() {
        return this.createdTimestamp;
    }

    /**
     * <p>
     * The time at which the configuration was created.
     * </p>
     * 
     * @param createdTimestamp
     *        The time at which the configuration was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamPoolConfiguration withCreatedTimestamp(java.util.Date createdTimestamp) {
        setCreatedTimestamp(createdTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which the configuration was updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the configuration was updated.
     */

    public void setUpdatedTimestamp(java.util.Date updatedTimestamp) {
        this.updatedTimestamp = updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the configuration was updated.
     * </p>
     * 
     * @return The time at which the configuration was updated.
     */

    public java.util.Date getUpdatedTimestamp() {
        return this.updatedTimestamp;
    }

    /**
     * <p>
     * The time at which the configuration was updated.
     * </p>
     * 
     * @param updatedTimestamp
     *        The time at which the configuration was updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamPoolConfiguration withUpdatedTimestamp(java.util.Date updatedTimestamp) {
        setUpdatedTimestamp(updatedTimestamp);
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
        if (getPoolArn() != null)
            sb.append("PoolArn: ").append("***Sensitive Data Redacted***").append(",");
        if (getPoolName() != null)
            sb.append("PoolName: ").append(getPoolName()).append(",");
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getPoolStatus() != null)
            sb.append("PoolStatus: ").append(getPoolStatus()).append(",");
        if (getPoolSize() != null)
            sb.append("PoolSize: ").append(getPoolSize()).append(",");
        if (getStreamConfiguration() != null)
            sb.append("StreamConfiguration: ").append(getStreamConfiguration()).append(",");
        if (getCreatedTimestamp() != null)
            sb.append("CreatedTimestamp: ").append(getCreatedTimestamp()).append(",");
        if (getUpdatedTimestamp() != null)
            sb.append("UpdatedTimestamp: ").append(getUpdatedTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisVideoStreamPoolConfiguration == false)
            return false;
        KinesisVideoStreamPoolConfiguration other = (KinesisVideoStreamPoolConfiguration) obj;
        if (other.getPoolArn() == null ^ this.getPoolArn() == null)
            return false;
        if (other.getPoolArn() != null && other.getPoolArn().equals(this.getPoolArn()) == false)
            return false;
        if (other.getPoolName() == null ^ this.getPoolName() == null)
            return false;
        if (other.getPoolName() != null && other.getPoolName().equals(this.getPoolName()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getPoolStatus() == null ^ this.getPoolStatus() == null)
            return false;
        if (other.getPoolStatus() != null && other.getPoolStatus().equals(this.getPoolStatus()) == false)
            return false;
        if (other.getPoolSize() == null ^ this.getPoolSize() == null)
            return false;
        if (other.getPoolSize() != null && other.getPoolSize().equals(this.getPoolSize()) == false)
            return false;
        if (other.getStreamConfiguration() == null ^ this.getStreamConfiguration() == null)
            return false;
        if (other.getStreamConfiguration() != null && other.getStreamConfiguration().equals(this.getStreamConfiguration()) == false)
            return false;
        if (other.getCreatedTimestamp() == null ^ this.getCreatedTimestamp() == null)
            return false;
        if (other.getCreatedTimestamp() != null && other.getCreatedTimestamp().equals(this.getCreatedTimestamp()) == false)
            return false;
        if (other.getUpdatedTimestamp() == null ^ this.getUpdatedTimestamp() == null)
            return false;
        if (other.getUpdatedTimestamp() != null && other.getUpdatedTimestamp().equals(this.getUpdatedTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolArn() == null) ? 0 : getPoolArn().hashCode());
        hashCode = prime * hashCode + ((getPoolName() == null) ? 0 : getPoolName().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getPoolStatus() == null) ? 0 : getPoolStatus().hashCode());
        hashCode = prime * hashCode + ((getPoolSize() == null) ? 0 : getPoolSize().hashCode());
        hashCode = prime * hashCode + ((getStreamConfiguration() == null) ? 0 : getStreamConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreatedTimestamp() == null) ? 0 : getCreatedTimestamp().hashCode());
        hashCode = prime * hashCode + ((getUpdatedTimestamp() == null) ? 0 : getUpdatedTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public KinesisVideoStreamPoolConfiguration clone() {
        try {
            return (KinesisVideoStreamPoolConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.KinesisVideoStreamPoolConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
