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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/UpdateStreamMode" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStreamModeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the ARN of the data stream whose capacity mode you want to update.
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams, you
     * can choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode for your data
     * streams.
     * </p>
     */
    private StreamModeDetails streamModeDetails;

    /**
     * <p>
     * Specifies the ARN of the data stream whose capacity mode you want to update.
     * </p>
     * 
     * @param streamARN
     *        Specifies the ARN of the data stream whose capacity mode you want to update.
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * Specifies the ARN of the data stream whose capacity mode you want to update.
     * </p>
     * 
     * @return Specifies the ARN of the data stream whose capacity mode you want to update.
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * Specifies the ARN of the data stream whose capacity mode you want to update.
     * </p>
     * 
     * @param streamARN
     *        Specifies the ARN of the data stream whose capacity mode you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamModeRequest withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams, you
     * can choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode for your data
     * streams.
     * </p>
     * 
     * @param streamModeDetails
     *        Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams,
     *        you can choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode for your
     *        data streams.
     */

    public void setStreamModeDetails(StreamModeDetails streamModeDetails) {
        this.streamModeDetails = streamModeDetails;
    }

    /**
     * <p>
     * Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams, you
     * can choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode for your data
     * streams.
     * </p>
     * 
     * @return Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data
     *         Streams, you can choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode
     *         for your data streams.
     */

    public StreamModeDetails getStreamModeDetails() {
        return this.streamModeDetails;
    }

    /**
     * <p>
     * Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams, you
     * can choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode for your data
     * streams.
     * </p>
     * 
     * @param streamModeDetails
     *        Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams,
     *        you can choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode for your
     *        data streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStreamModeRequest withStreamModeDetails(StreamModeDetails streamModeDetails) {
        setStreamModeDetails(streamModeDetails);
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
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
        if (getStreamModeDetails() != null)
            sb.append("StreamModeDetails: ").append(getStreamModeDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStreamModeRequest == false)
            return false;
        UpdateStreamModeRequest other = (UpdateStreamModeRequest) obj;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
            return false;
        if (other.getStreamModeDetails() == null ^ this.getStreamModeDetails() == null)
            return false;
        if (other.getStreamModeDetails() != null && other.getStreamModeDetails().equals(this.getStreamModeDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getStreamModeDetails() == null) ? 0 : getStreamModeDetails().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStreamModeRequest clone() {
        return (UpdateStreamModeRequest) super.clone();
    }

}
