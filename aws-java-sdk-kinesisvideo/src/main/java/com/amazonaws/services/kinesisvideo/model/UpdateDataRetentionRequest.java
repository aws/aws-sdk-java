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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/UpdateDataRetention" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDataRetentionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream whose retention period you want to change.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream whose retention period you want to change.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The version of the stream whose retention period you want to change. To get the version, call either the
     * <code>DescribeStream</code> or the <code>ListStreams</code> API.
     * </p>
     */
    private String currentVersion;
    /**
     * <p>
     * Indicates whether you want to increase or decrease the retention period.
     * </p>
     */
    private String operation;
    /**
     * <p>
     * The retention period, in hours. The value you specify replaces the current value. The maximum value for this
     * parameter is 87600 (ten years).
     * </p>
     */
    private Integer dataRetentionChangeInHours;

    /**
     * <p>
     * The name of the stream whose retention period you want to change.
     * </p>
     * 
     * @param streamName
     *        The name of the stream whose retention period you want to change.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream whose retention period you want to change.
     * </p>
     * 
     * @return The name of the stream whose retention period you want to change.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream whose retention period you want to change.
     * </p>
     * 
     * @param streamName
     *        The name of the stream whose retention period you want to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataRetentionRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream whose retention period you want to change.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream whose retention period you want to change.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream whose retention period you want to change.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream whose retention period you want to change.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream whose retention period you want to change.
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream whose retention period you want to change.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataRetentionRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The version of the stream whose retention period you want to change. To get the version, call either the
     * <code>DescribeStream</code> or the <code>ListStreams</code> API.
     * </p>
     * 
     * @param currentVersion
     *        The version of the stream whose retention period you want to change. To get the version, call either the
     *        <code>DescribeStream</code> or the <code>ListStreams</code> API.
     */

    public void setCurrentVersion(String currentVersion) {
        this.currentVersion = currentVersion;
    }

    /**
     * <p>
     * The version of the stream whose retention period you want to change. To get the version, call either the
     * <code>DescribeStream</code> or the <code>ListStreams</code> API.
     * </p>
     * 
     * @return The version of the stream whose retention period you want to change. To get the version, call either the
     *         <code>DescribeStream</code> or the <code>ListStreams</code> API.
     */

    public String getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * <p>
     * The version of the stream whose retention period you want to change. To get the version, call either the
     * <code>DescribeStream</code> or the <code>ListStreams</code> API.
     * </p>
     * 
     * @param currentVersion
     *        The version of the stream whose retention period you want to change. To get the version, call either the
     *        <code>DescribeStream</code> or the <code>ListStreams</code> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataRetentionRequest withCurrentVersion(String currentVersion) {
        setCurrentVersion(currentVersion);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to increase or decrease the retention period.
     * </p>
     * 
     * @param operation
     *        Indicates whether you want to increase or decrease the retention period.
     * @see UpdateDataRetentionOperation
     */

    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * <p>
     * Indicates whether you want to increase or decrease the retention period.
     * </p>
     * 
     * @return Indicates whether you want to increase or decrease the retention period.
     * @see UpdateDataRetentionOperation
     */

    public String getOperation() {
        return this.operation;
    }

    /**
     * <p>
     * Indicates whether you want to increase or decrease the retention period.
     * </p>
     * 
     * @param operation
     *        Indicates whether you want to increase or decrease the retention period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateDataRetentionOperation
     */

    public UpdateDataRetentionRequest withOperation(String operation) {
        setOperation(operation);
        return this;
    }

    /**
     * <p>
     * Indicates whether you want to increase or decrease the retention period.
     * </p>
     * 
     * @param operation
     *        Indicates whether you want to increase or decrease the retention period.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see UpdateDataRetentionOperation
     */

    public UpdateDataRetentionRequest withOperation(UpdateDataRetentionOperation operation) {
        this.operation = operation.toString();
        return this;
    }

    /**
     * <p>
     * The retention period, in hours. The value you specify replaces the current value. The maximum value for this
     * parameter is 87600 (ten years).
     * </p>
     * 
     * @param dataRetentionChangeInHours
     *        The retention period, in hours. The value you specify replaces the current value. The maximum value for
     *        this parameter is 87600 (ten years).
     */

    public void setDataRetentionChangeInHours(Integer dataRetentionChangeInHours) {
        this.dataRetentionChangeInHours = dataRetentionChangeInHours;
    }

    /**
     * <p>
     * The retention period, in hours. The value you specify replaces the current value. The maximum value for this
     * parameter is 87600 (ten years).
     * </p>
     * 
     * @return The retention period, in hours. The value you specify replaces the current value. The maximum value for
     *         this parameter is 87600 (ten years).
     */

    public Integer getDataRetentionChangeInHours() {
        return this.dataRetentionChangeInHours;
    }

    /**
     * <p>
     * The retention period, in hours. The value you specify replaces the current value. The maximum value for this
     * parameter is 87600 (ten years).
     * </p>
     * 
     * @param dataRetentionChangeInHours
     *        The retention period, in hours. The value you specify replaces the current value. The maximum value for
     *        this parameter is 87600 (ten years).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDataRetentionRequest withDataRetentionChangeInHours(Integer dataRetentionChangeInHours) {
        setDataRetentionChangeInHours(dataRetentionChangeInHours);
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
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getCurrentVersion() != null)
            sb.append("CurrentVersion: ").append(getCurrentVersion()).append(",");
        if (getOperation() != null)
            sb.append("Operation: ").append(getOperation()).append(",");
        if (getDataRetentionChangeInHours() != null)
            sb.append("DataRetentionChangeInHours: ").append(getDataRetentionChangeInHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDataRetentionRequest == false)
            return false;
        UpdateDataRetentionRequest other = (UpdateDataRetentionRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getCurrentVersion() == null ^ this.getCurrentVersion() == null)
            return false;
        if (other.getCurrentVersion() != null && other.getCurrentVersion().equals(this.getCurrentVersion()) == false)
            return false;
        if (other.getOperation() == null ^ this.getOperation() == null)
            return false;
        if (other.getOperation() != null && other.getOperation().equals(this.getOperation()) == false)
            return false;
        if (other.getDataRetentionChangeInHours() == null ^ this.getDataRetentionChangeInHours() == null)
            return false;
        if (other.getDataRetentionChangeInHours() != null && other.getDataRetentionChangeInHours().equals(this.getDataRetentionChangeInHours()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getCurrentVersion() == null) ? 0 : getCurrentVersion().hashCode());
        hashCode = prime * hashCode + ((getOperation() == null) ? 0 : getOperation().hashCode());
        hashCode = prime * hashCode + ((getDataRetentionChangeInHours() == null) ? 0 : getDataRetentionChangeInHours().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDataRetentionRequest clone() {
        return (UpdateDataRetentionRequest) super.clone();
    }

}
