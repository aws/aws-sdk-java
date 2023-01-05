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
 * Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams, you can
 * choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode for your data streams.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesis-2013-12-02/StreamModeDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamModeDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams, you
     * can choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode for your data
     * streams.
     * </p>
     */
    private String streamMode;

    /**
     * <p>
     * Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams, you
     * can choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode for your data
     * streams.
     * </p>
     * 
     * @param streamMode
     *        Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams,
     *        you can choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode for your
     *        data streams.
     * @see StreamMode
     */

    public void setStreamMode(String streamMode) {
        this.streamMode = streamMode;
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
     * @see StreamMode
     */

    public String getStreamMode() {
        return this.streamMode;
    }

    /**
     * <p>
     * Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams, you
     * can choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode for your data
     * streams.
     * </p>
     * 
     * @param streamMode
     *        Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams,
     *        you can choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode for your
     *        data streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamMode
     */

    public StreamModeDetails withStreamMode(String streamMode) {
        setStreamMode(streamMode);
        return this;
    }

    /**
     * <p>
     * Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams, you
     * can choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode for your data
     * streams.
     * </p>
     * 
     * @param streamMode
     *        Specifies the capacity mode to which you want to set your data stream. Currently, in Kinesis Data Streams,
     *        you can choose between an <b>on-demand</b> capacity mode and a <b>provisioned</b> capacity mode for your
     *        data streams.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamMode
     */

    public StreamModeDetails withStreamMode(StreamMode streamMode) {
        this.streamMode = streamMode.toString();
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
        if (getStreamMode() != null)
            sb.append("StreamMode: ").append(getStreamMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamModeDetails == false)
            return false;
        StreamModeDetails other = (StreamModeDetails) obj;
        if (other.getStreamMode() == null ^ this.getStreamMode() == null)
            return false;
        if (other.getStreamMode() != null && other.getStreamMode().equals(this.getStreamMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamMode() == null) ? 0 : getStreamMode().hashCode());
        return hashCode;
    }

    @Override
    public StreamModeDetails clone() {
        try {
            return (StreamModeDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesis.model.transform.StreamModeDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
