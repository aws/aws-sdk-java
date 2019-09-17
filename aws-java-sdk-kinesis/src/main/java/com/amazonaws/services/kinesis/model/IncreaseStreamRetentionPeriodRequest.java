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
 * <p>
 * Represents the input for <a>IncreaseStreamRetentionPeriod</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/IncreaseStreamRetentionPeriod"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class IncreaseStreamRetentionPeriodRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the stream to modify.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The new retention period of the stream, in hours. Must be more than the current retention period.
     * </p>
     */
    private Integer retentionPeriodHours;

    /**
     * <p>
     * The name of the stream to modify.
     * </p>
     * 
     * @param streamName
     *        The name of the stream to modify.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of the stream to modify.
     * </p>
     * 
     * @return The name of the stream to modify.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of the stream to modify.
     * </p>
     * 
     * @param streamName
     *        The name of the stream to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncreaseStreamRetentionPeriodRequest withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The new retention period of the stream, in hours. Must be more than the current retention period.
     * </p>
     * 
     * @param retentionPeriodHours
     *        The new retention period of the stream, in hours. Must be more than the current retention period.
     */

    public void setRetentionPeriodHours(Integer retentionPeriodHours) {
        this.retentionPeriodHours = retentionPeriodHours;
    }

    /**
     * <p>
     * The new retention period of the stream, in hours. Must be more than the current retention period.
     * </p>
     * 
     * @return The new retention period of the stream, in hours. Must be more than the current retention period.
     */

    public Integer getRetentionPeriodHours() {
        return this.retentionPeriodHours;
    }

    /**
     * <p>
     * The new retention period of the stream, in hours. Must be more than the current retention period.
     * </p>
     * 
     * @param retentionPeriodHours
     *        The new retention period of the stream, in hours. Must be more than the current retention period.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public IncreaseStreamRetentionPeriodRequest withRetentionPeriodHours(Integer retentionPeriodHours) {
        setRetentionPeriodHours(retentionPeriodHours);
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
        if (getRetentionPeriodHours() != null)
            sb.append("RetentionPeriodHours: ").append(getRetentionPeriodHours());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof IncreaseStreamRetentionPeriodRequest == false)
            return false;
        IncreaseStreamRetentionPeriodRequest other = (IncreaseStreamRetentionPeriodRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getRetentionPeriodHours() == null ^ this.getRetentionPeriodHours() == null)
            return false;
        if (other.getRetentionPeriodHours() != null && other.getRetentionPeriodHours().equals(this.getRetentionPeriodHours()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getRetentionPeriodHours() == null) ? 0 : getRetentionPeriodHours().hashCode());
        return hashCode;
    }

    @Override
    public IncreaseStreamRetentionPeriodRequest clone() {
        return (IncreaseStreamRetentionPeriodRequest) super.clone();
    }

}
