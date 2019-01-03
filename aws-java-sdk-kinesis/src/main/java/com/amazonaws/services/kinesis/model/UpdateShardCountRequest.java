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
package com.amazonaws.services.kinesis.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/UpdateShardCount" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateShardCountRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The new number of shards.
     * </p>
     */
    private Integer targetShardCount;
    /**
     * <p>
     * The scaling type. Uniform scaling creates shards of equal size.
     * </p>
     */
    private String scalingType;

    /**
     * <p>
     * The name of the stream.
     * </p>
     * 
     * @param streamName
     *        The name of the stream.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * 
     * @return The name of the stream.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream.
     * </p>
     * 
     * @param streamName
     *        The name of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateShardCountRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The new number of shards.
     * </p>
     * 
     * @param targetShardCount
     *        The new number of shards.
     */

    public void setTargetShardCount(Integer targetShardCount) {
        this.targetShardCount = targetShardCount;
    }

    /**
     * <p>
     * The new number of shards.
     * </p>
     * 
     * @return The new number of shards.
     */

    public Integer getTargetShardCount() {
        return this.targetShardCount;
    }

    /**
     * <p>
     * The new number of shards.
     * </p>
     * 
     * @param targetShardCount
     *        The new number of shards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateShardCountRequest withTargetShardCount(Integer targetShardCount) {
        setTargetShardCount(targetShardCount);
        return this;
    }

    /**
     * <p>
     * The scaling type. Uniform scaling creates shards of equal size.
     * </p>
     * 
     * @param scalingType
     *        The scaling type. Uniform scaling creates shards of equal size.
     * @see ScalingType
     */

    public void setScalingType(String scalingType) {
        this.scalingType = scalingType;
    }

    /**
     * <p>
     * The scaling type. Uniform scaling creates shards of equal size.
     * </p>
     * 
     * @return The scaling type. Uniform scaling creates shards of equal size.
     * @see ScalingType
     */

    public String getScalingType() {
        return this.scalingType;
    }

    /**
     * <p>
     * The scaling type. Uniform scaling creates shards of equal size.
     * </p>
     * 
     * @param scalingType
     *        The scaling type. Uniform scaling creates shards of equal size.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingType
     */

    public UpdateShardCountRequest withScalingType(String scalingType) {
        setScalingType(scalingType);
        return this;
    }

    /**
     * <p>
     * The scaling type. Uniform scaling creates shards of equal size.
     * </p>
     * 
     * @param scalingType
     *        The scaling type. Uniform scaling creates shards of equal size.
     * @see ScalingType
     */

    public void setScalingType(ScalingType scalingType) {
        withScalingType(scalingType);
    }

    /**
     * <p>
     * The scaling type. Uniform scaling creates shards of equal size.
     * </p>
     * 
     * @param scalingType
     *        The scaling type. Uniform scaling creates shards of equal size.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ScalingType
     */

    public UpdateShardCountRequest withScalingType(ScalingType scalingType) {
        this.scalingType = scalingType.toString();
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
        if (getStreamName() != null)
            sb.append("StreamName: ").append(getStreamName()).append(",");
        if (getTargetShardCount() != null)
            sb.append("TargetShardCount: ").append(getTargetShardCount()).append(",");
        if (getScalingType() != null)
            sb.append("ScalingType: ").append(getScalingType());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateShardCountRequest == false)
            return false;
        UpdateShardCountRequest other = (UpdateShardCountRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getTargetShardCount() == null ^ this.getTargetShardCount() == null)
            return false;
        if (other.getTargetShardCount() != null && other.getTargetShardCount().equals(this.getTargetShardCount()) == false)
            return false;
        if (other.getScalingType() == null ^ this.getScalingType() == null)
            return false;
        if (other.getScalingType() != null && other.getScalingType().equals(this.getScalingType()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getTargetShardCount() == null) ? 0 : getTargetShardCount().hashCode());
        hashCode = prime * hashCode + ((getScalingType() == null) ? 0 : getScalingType().hashCode());
        return hashCode;
    }

    @Override
    public UpdateShardCountRequest clone() {
        return (UpdateShardCountRequest) super.clone();
    }

}
