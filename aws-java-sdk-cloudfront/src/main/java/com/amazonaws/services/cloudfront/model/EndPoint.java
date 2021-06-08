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
package com.amazonaws.services.cloudfront.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains information about the Amazon Kinesis data stream where you are sending real-time log data in a real-time log
 * configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudfront-2020-05-31/EndPoint" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndPoint implements Serializable, Cloneable {

    /**
     * <p>
     * The type of data stream where you are sending real-time log data. The only valid value is <code>Kinesis</code>.
     * </p>
     */
    private String streamType;
    /**
     * <p>
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log data.
     * </p>
     */
    private KinesisStreamConfig kinesisStreamConfig;

    /**
     * <p>
     * The type of data stream where you are sending real-time log data. The only valid value is <code>Kinesis</code>.
     * </p>
     * 
     * @param streamType
     *        The type of data stream where you are sending real-time log data. The only valid value is
     *        <code>Kinesis</code>.
     */

    public void setStreamType(String streamType) {
        this.streamType = streamType;
    }

    /**
     * <p>
     * The type of data stream where you are sending real-time log data. The only valid value is <code>Kinesis</code>.
     * </p>
     * 
     * @return The type of data stream where you are sending real-time log data. The only valid value is
     *         <code>Kinesis</code>.
     */

    public String getStreamType() {
        return this.streamType;
    }

    /**
     * <p>
     * The type of data stream where you are sending real-time log data. The only valid value is <code>Kinesis</code>.
     * </p>
     * 
     * @param streamType
     *        The type of data stream where you are sending real-time log data. The only valid value is
     *        <code>Kinesis</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndPoint withStreamType(String streamType) {
        setStreamType(streamType);
        return this;
    }

    /**
     * <p>
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log data.
     * </p>
     * 
     * @param kinesisStreamConfig
     *        Contains information about the Amazon Kinesis data stream where you are sending real-time log data.
     */

    public void setKinesisStreamConfig(KinesisStreamConfig kinesisStreamConfig) {
        this.kinesisStreamConfig = kinesisStreamConfig;
    }

    /**
     * <p>
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log data.
     * </p>
     * 
     * @return Contains information about the Amazon Kinesis data stream where you are sending real-time log data.
     */

    public KinesisStreamConfig getKinesisStreamConfig() {
        return this.kinesisStreamConfig;
    }

    /**
     * <p>
     * Contains information about the Amazon Kinesis data stream where you are sending real-time log data.
     * </p>
     * 
     * @param kinesisStreamConfig
     *        Contains information about the Amazon Kinesis data stream where you are sending real-time log data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndPoint withKinesisStreamConfig(KinesisStreamConfig kinesisStreamConfig) {
        setKinesisStreamConfig(kinesisStreamConfig);
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
        if (getStreamType() != null)
            sb.append("StreamType: ").append(getStreamType()).append(",");
        if (getKinesisStreamConfig() != null)
            sb.append("KinesisStreamConfig: ").append(getKinesisStreamConfig());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndPoint == false)
            return false;
        EndPoint other = (EndPoint) obj;
        if (other.getStreamType() == null ^ this.getStreamType() == null)
            return false;
        if (other.getStreamType() != null && other.getStreamType().equals(this.getStreamType()) == false)
            return false;
        if (other.getKinesisStreamConfig() == null ^ this.getKinesisStreamConfig() == null)
            return false;
        if (other.getKinesisStreamConfig() != null && other.getKinesisStreamConfig().equals(this.getKinesisStreamConfig()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamType() == null) ? 0 : getStreamType().hashCode());
        hashCode = prime * hashCode + ((getKinesisStreamConfig() == null) ? 0 : getKinesisStreamConfig().hashCode());
        return hashCode;
    }

    @Override
    public EndPoint clone() {
        try {
            return (EndPoint) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
