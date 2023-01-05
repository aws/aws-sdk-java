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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The streaming configuration, such as the Amazon SNS streaming endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/ChatStreamingConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ChatStreamingConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard Amazon SNS topic. The Amazon Resource Name (ARN) of the streaming
     * endpoint that is used to publish real-time message streaming for chat conversations.
     * </p>
     */
    private String streamingEndpointArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard Amazon SNS topic. The Amazon Resource Name (ARN) of the streaming
     * endpoint that is used to publish real-time message streaming for chat conversations.
     * </p>
     * 
     * @param streamingEndpointArn
     *        The Amazon Resource Name (ARN) of the standard Amazon SNS topic. The Amazon Resource Name (ARN) of the
     *        streaming endpoint that is used to publish real-time message streaming for chat conversations.
     */

    public void setStreamingEndpointArn(String streamingEndpointArn) {
        this.streamingEndpointArn = streamingEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard Amazon SNS topic. The Amazon Resource Name (ARN) of the streaming
     * endpoint that is used to publish real-time message streaming for chat conversations.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the standard Amazon SNS topic. The Amazon Resource Name (ARN) of the
     *         streaming endpoint that is used to publish real-time message streaming for chat conversations.
     */

    public String getStreamingEndpointArn() {
        return this.streamingEndpointArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the standard Amazon SNS topic. The Amazon Resource Name (ARN) of the streaming
     * endpoint that is used to publish real-time message streaming for chat conversations.
     * </p>
     * 
     * @param streamingEndpointArn
     *        The Amazon Resource Name (ARN) of the standard Amazon SNS topic. The Amazon Resource Name (ARN) of the
     *        streaming endpoint that is used to publish real-time message streaming for chat conversations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ChatStreamingConfiguration withStreamingEndpointArn(String streamingEndpointArn) {
        setStreamingEndpointArn(streamingEndpointArn);
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
        if (getStreamingEndpointArn() != null)
            sb.append("StreamingEndpointArn: ").append(getStreamingEndpointArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ChatStreamingConfiguration == false)
            return false;
        ChatStreamingConfiguration other = (ChatStreamingConfiguration) obj;
        if (other.getStreamingEndpointArn() == null ^ this.getStreamingEndpointArn() == null)
            return false;
        if (other.getStreamingEndpointArn() != null && other.getStreamingEndpointArn().equals(this.getStreamingEndpointArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamingEndpointArn() == null) ? 0 : getStreamingEndpointArn().hashCode());
        return hashCode;
    }

    @Override
    public ChatStreamingConfiguration clone() {
        try {
            return (ChatStreamingConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.ChatStreamingConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
