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
package com.amazonaws.services.medialive.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * Endpoint settings for a PUSH type input.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/medialive-2017-10-14/InputDestinationRequest" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class InputDestinationRequest implements Serializable, Cloneable, StructuredPojo {

    /**
     * A unique name for the location the RTMP stream is being pushed to.
     */
    private String streamName;

    /**
     * A unique name for the location the RTMP stream is being pushed to.
     * 
     * @param streamName
     *        A unique name for the location the RTMP stream is being pushed to.
     */

    public void setStreamName(String streamName) {
        this.streamName = streamName;
    }

    /**
     * A unique name for the location the RTMP stream is being pushed to.
     * 
     * @return A unique name for the location the RTMP stream is being pushed to.
     */

    public String getStreamName() {
        return this.streamName;
    }

    /**
     * A unique name for the location the RTMP stream is being pushed to.
     * 
     * @param streamName
     *        A unique name for the location the RTMP stream is being pushed to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public InputDestinationRequest withStreamName(String streamName) {
        setStreamName(streamName);
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
            sb.append("StreamName: ").append(getStreamName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof InputDestinationRequest == false)
            return false;
        InputDestinationRequest other = (InputDestinationRequest) obj;
        if (other.getStreamName() == null ^ this.getStreamName() == null)
            return false;
        if (other.getStreamName() != null && other.getStreamName().equals(this.getStreamName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamName() == null) ? 0 : getStreamName().hashCode());
        return hashCode;
    }

    @Override
    public InputDestinationRequest clone() {
        try {
            return (InputDestinationRequest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.medialive.model.transform.InputDestinationRequestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
