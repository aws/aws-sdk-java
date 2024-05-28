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
 * The configuration settings for a stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/StreamConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the stream.
     * </p>
     */
    private String streamArn;
    /**
     * <p>
     * The unique identifier of the fragment to begin processing.
     * </p>
     */
    private String fragmentNumber;
    /**
     * <p>
     * The streaming channel definition in the stream configuration.
     * </p>
     */
    private StreamChannelDefinition streamChannelDefinition;

    /**
     * <p>
     * The ARN of the stream.
     * </p>
     * 
     * @param streamArn
     *        The ARN of the stream.
     */

    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The ARN of the stream.
     * </p>
     * 
     * @return The ARN of the stream.
     */

    public String getStreamArn() {
        return this.streamArn;
    }

    /**
     * <p>
     * The ARN of the stream.
     * </p>
     * 
     * @param streamArn
     *        The ARN of the stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamConfiguration withStreamArn(String streamArn) {
        setStreamArn(streamArn);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the fragment to begin processing.
     * </p>
     * 
     * @param fragmentNumber
     *        The unique identifier of the fragment to begin processing.
     */

    public void setFragmentNumber(String fragmentNumber) {
        this.fragmentNumber = fragmentNumber;
    }

    /**
     * <p>
     * The unique identifier of the fragment to begin processing.
     * </p>
     * 
     * @return The unique identifier of the fragment to begin processing.
     */

    public String getFragmentNumber() {
        return this.fragmentNumber;
    }

    /**
     * <p>
     * The unique identifier of the fragment to begin processing.
     * </p>
     * 
     * @param fragmentNumber
     *        The unique identifier of the fragment to begin processing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamConfiguration withFragmentNumber(String fragmentNumber) {
        setFragmentNumber(fragmentNumber);
        return this;
    }

    /**
     * <p>
     * The streaming channel definition in the stream configuration.
     * </p>
     * 
     * @param streamChannelDefinition
     *        The streaming channel definition in the stream configuration.
     */

    public void setStreamChannelDefinition(StreamChannelDefinition streamChannelDefinition) {
        this.streamChannelDefinition = streamChannelDefinition;
    }

    /**
     * <p>
     * The streaming channel definition in the stream configuration.
     * </p>
     * 
     * @return The streaming channel definition in the stream configuration.
     */

    public StreamChannelDefinition getStreamChannelDefinition() {
        return this.streamChannelDefinition;
    }

    /**
     * <p>
     * The streaming channel definition in the stream configuration.
     * </p>
     * 
     * @param streamChannelDefinition
     *        The streaming channel definition in the stream configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamConfiguration withStreamChannelDefinition(StreamChannelDefinition streamChannelDefinition) {
        setStreamChannelDefinition(streamChannelDefinition);
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
        if (getStreamArn() != null)
            sb.append("StreamArn: ").append(getStreamArn()).append(",");
        if (getFragmentNumber() != null)
            sb.append("FragmentNumber: ").append(getFragmentNumber()).append(",");
        if (getStreamChannelDefinition() != null)
            sb.append("StreamChannelDefinition: ").append(getStreamChannelDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamConfiguration == false)
            return false;
        StreamConfiguration other = (StreamConfiguration) obj;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        if (other.getFragmentNumber() == null ^ this.getFragmentNumber() == null)
            return false;
        if (other.getFragmentNumber() != null && other.getFragmentNumber().equals(this.getFragmentNumber()) == false)
            return false;
        if (other.getStreamChannelDefinition() == null ^ this.getStreamChannelDefinition() == null)
            return false;
        if (other.getStreamChannelDefinition() != null && other.getStreamChannelDefinition().equals(this.getStreamChannelDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        hashCode = prime * hashCode + ((getFragmentNumber() == null) ? 0 : getFragmentNumber().hashCode());
        hashCode = prime * hashCode + ((getStreamChannelDefinition() == null) ? 0 : getStreamChannelDefinition().hashCode());
        return hashCode;
    }

    @Override
    public StreamConfiguration clone() {
        try {
            return (StreamConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.StreamConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
