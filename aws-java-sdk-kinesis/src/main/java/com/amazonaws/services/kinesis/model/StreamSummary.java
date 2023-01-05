/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of a stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/StreamSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a stream.
     * </p>
     */
    private String streamName;
    /**
     * <p>
     * The ARN of the stream.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The status of the stream.
     * </p>
     */
    private String streamStatus;

    private StreamModeDetails streamModeDetails;
    /**
     * <p>
     * The timestamp at which the stream was created.
     * </p>
     */
    private java.util.Date streamCreationTimestamp;

    /**
     * <p>
     * The name of a stream.
     * </p>
     * 
     * @param streamName
     *        The name of a stream.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * <p>
     * The name of a stream.
     * </p>
     * 
     * @return The name of a stream.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * <p>
     * The name of a stream.
     * </p>
     * 
     * @param streamName
     *        The name of a stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSummary withStreamName(String streamName) {
        setStreamName(streamName);
        return this;
    }

    /**
     * <p>
     * The ARN of the stream.
     * </p>
     * 
     * @param streamARN
     *        The ARN of the stream.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The ARN of the stream.
     * </p>
     * 
     * @return The ARN of the stream.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The ARN of the stream.
     * </p>
     * 
     * @param streamARN
     *        The ARN of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSummary withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The status of the stream.
     * </p>
     * 
     * @param streamStatus
     *        The status of the stream.
     * @see StreamStatus
     */

    public void setStreamStatus(String streamStatus) {
        this.streamStatus = streamStatus;
    }

    /**
     * <p>
     * The status of the stream.
     * </p>
     * 
     * @return The status of the stream.
     * @see StreamStatus
     */

    public String getStreamStatus() {
        return this.streamStatus;
    }

    /**
     * <p>
     * The status of the stream.
     * </p>
     * 
     * @param streamStatus
     *        The status of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamStatus
     */

    public StreamSummary withStreamStatus(String streamStatus) {
        setStreamStatus(streamStatus);
        return this;
    }

    /**
     * <p>
     * The status of the stream.
     * </p>
     * 
     * @param streamStatus
     *        The status of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamStatus
     */

    public StreamSummary withStreamStatus(StreamStatus streamStatus) {
        this.streamStatus = streamStatus.toString();
        return this;
    }

    /**
     * @param streamModeDetails
     */

    public void setStreamModeDetails(StreamModeDetails streamModeDetails) {
        this.streamModeDetails = streamModeDetails;
    }

    /**
     * @return
     */

    public StreamModeDetails getStreamModeDetails() {
        return this.streamModeDetails;
    }

    /**
     * @param streamModeDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSummary withStreamModeDetails(StreamModeDetails streamModeDetails) {
        setStreamModeDetails(streamModeDetails);
        return this;
    }

    /**
     * <p>
     * The timestamp at which the stream was created.
     * </p>
     * 
     * @param streamCreationTimestamp
     *        The timestamp at which the stream was created.
     */

    public void setStreamCreationTimestamp(java.util.Date streamCreationTimestamp) {
        this.streamCreationTimestamp = streamCreationTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the stream was created.
     * </p>
     * 
     * @return The timestamp at which the stream was created.
     */

    public java.util.Date getStreamCreationTimestamp() {
        return this.streamCreationTimestamp;
    }

    /**
     * <p>
     * The timestamp at which the stream was created.
     * </p>
     * 
     * @param streamCreationTimestamp
     *        The timestamp at which the stream was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamSummary withStreamCreationTimestamp(java.util.Date streamCreationTimestamp) {
        setStreamCreationTimestamp(streamCreationTimestamp);
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
        if (getStreamStatus() != null)
            sb.append("StreamStatus: ").append(getStreamStatus()).append(",");
        if (getStreamModeDetails() != null)
            sb.append("StreamModeDetails: ").append(getStreamModeDetails()).append(",");
        if (getStreamCreationTimestamp() != null)
            sb.append("StreamCreationTimestamp: ").append(getStreamCreationTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamSummary == false)
            return false;
        StreamSummary other = (StreamSummary) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getStreamStatus() == null ^ this.getStreamStatus() == null)
            return false;
        if (other.getStreamStatus() != null && other.getStreamStatus().equals(this.getStreamStatus()) == false)
            return false;
        if (other.getStreamModeDetails() == null ^ this.getStreamModeDetails() == null)
            return false;
        if (other.getStreamModeDetails() != null && other.getStreamModeDetails().equals(this.getStreamModeDetails()) == false)
            return false;
        if (other.getStreamCreationTimestamp() == null ^ this.getStreamCreationTimestamp() == null)
            return false;
        if (other.getStreamCreationTimestamp() != null && other.getStreamCreationTimestamp().equals(this.getStreamCreationTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getStreamStatus() == null) ? 0 : getStreamStatus().hashCode());
        hashCode = prime * hashCode + ((getStreamModeDetails() == null) ? 0 : getStreamModeDetails().hashCode());
        hashCode = prime * hashCode + ((getStreamCreationTimestamp() == null) ? 0 : getStreamCreationTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public StreamSummary clone() {
        try {
            return (StreamSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesis.model.transform.StreamSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
