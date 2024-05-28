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
 * A summary of the Kinesis video stream pool.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/KinesisVideoStreamPoolSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisVideoStreamPoolSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the video stream pool.
     * </p>
     */
    private String poolName;
    /**
     * <p>
     * The ID of the video stream pool.
     * </p>
     */
    private String poolId;
    /**
     * <p>
     * The ARN of the video stream pool.
     * </p>
     */
    private String poolArn;

    /**
     * <p>
     * The name of the video stream pool.
     * </p>
     * 
     * @param poolName
     *        The name of the video stream pool.
     */

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    /**
     * <p>
     * The name of the video stream pool.
     * </p>
     * 
     * @return The name of the video stream pool.
     */

    public String getPoolName() {
        return this.poolName;
    }

    /**
     * <p>
     * The name of the video stream pool.
     * </p>
     * 
     * @param poolName
     *        The name of the video stream pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamPoolSummary withPoolName(String poolName) {
        setPoolName(poolName);
        return this;
    }

    /**
     * <p>
     * The ID of the video stream pool.
     * </p>
     * 
     * @param poolId
     *        The ID of the video stream pool.
     */

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    /**
     * <p>
     * The ID of the video stream pool.
     * </p>
     * 
     * @return The ID of the video stream pool.
     */

    public String getPoolId() {
        return this.poolId;
    }

    /**
     * <p>
     * The ID of the video stream pool.
     * </p>
     * 
     * @param poolId
     *        The ID of the video stream pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamPoolSummary withPoolId(String poolId) {
        setPoolId(poolId);
        return this;
    }

    /**
     * <p>
     * The ARN of the video stream pool.
     * </p>
     * 
     * @param poolArn
     *        The ARN of the video stream pool.
     */

    public void setPoolArn(String poolArn) {
        this.poolArn = poolArn;
    }

    /**
     * <p>
     * The ARN of the video stream pool.
     * </p>
     * 
     * @return The ARN of the video stream pool.
     */

    public String getPoolArn() {
        return this.poolArn;
    }

    /**
     * <p>
     * The ARN of the video stream pool.
     * </p>
     * 
     * @param poolArn
     *        The ARN of the video stream pool.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamPoolSummary withPoolArn(String poolArn) {
        setPoolArn(poolArn);
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
        if (getPoolName() != null)
            sb.append("PoolName: ").append(getPoolName()).append(",");
        if (getPoolId() != null)
            sb.append("PoolId: ").append(getPoolId()).append(",");
        if (getPoolArn() != null)
            sb.append("PoolArn: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisVideoStreamPoolSummary == false)
            return false;
        KinesisVideoStreamPoolSummary other = (KinesisVideoStreamPoolSummary) obj;
        if (other.getPoolName() == null ^ this.getPoolName() == null)
            return false;
        if (other.getPoolName() != null && other.getPoolName().equals(this.getPoolName()) == false)
            return false;
        if (other.getPoolId() == null ^ this.getPoolId() == null)
            return false;
        if (other.getPoolId() != null && other.getPoolId().equals(this.getPoolId()) == false)
            return false;
        if (other.getPoolArn() == null ^ this.getPoolArn() == null)
            return false;
        if (other.getPoolArn() != null && other.getPoolArn().equals(this.getPoolArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoolName() == null) ? 0 : getPoolName().hashCode());
        hashCode = prime * hashCode + ((getPoolId() == null) ? 0 : getPoolId().hashCode());
        hashCode = prime * hashCode + ((getPoolArn() == null) ? 0 : getPoolArn().hashCode());
        return hashCode;
    }

    @Override
    public KinesisVideoStreamPoolSummary clone() {
        try {
            return (KinesisVideoStreamPoolSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.KinesisVideoStreamPoolSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
