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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies when to stop processing the stream. You can specify a maximum amount of time to process the video.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamProcessingStopSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the maximum amount of time in seconds that you want the stream to be processed. The largest amount of
     * time is 2 minutes. The default is 10 seconds.
     * </p>
     */
    private Long maxDurationInSeconds;

    /**
     * <p>
     * Specifies the maximum amount of time in seconds that you want the stream to be processed. The largest amount of
     * time is 2 minutes. The default is 10 seconds.
     * </p>
     * 
     * @param maxDurationInSeconds
     *        Specifies the maximum amount of time in seconds that you want the stream to be processed. The largest
     *        amount of time is 2 minutes. The default is 10 seconds.
     */

    public void setMaxDurationInSeconds(Long maxDurationInSeconds) {
        this.maxDurationInSeconds = maxDurationInSeconds;
    }

    /**
     * <p>
     * Specifies the maximum amount of time in seconds that you want the stream to be processed. The largest amount of
     * time is 2 minutes. The default is 10 seconds.
     * </p>
     * 
     * @return Specifies the maximum amount of time in seconds that you want the stream to be processed. The largest
     *         amount of time is 2 minutes. The default is 10 seconds.
     */

    public Long getMaxDurationInSeconds() {
        return this.maxDurationInSeconds;
    }

    /**
     * <p>
     * Specifies the maximum amount of time in seconds that you want the stream to be processed. The largest amount of
     * time is 2 minutes. The default is 10 seconds.
     * </p>
     * 
     * @param maxDurationInSeconds
     *        Specifies the maximum amount of time in seconds that you want the stream to be processed. The largest
     *        amount of time is 2 minutes. The default is 10 seconds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamProcessingStopSelector withMaxDurationInSeconds(Long maxDurationInSeconds) {
        setMaxDurationInSeconds(maxDurationInSeconds);
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
        if (getMaxDurationInSeconds() != null)
            sb.append("MaxDurationInSeconds: ").append(getMaxDurationInSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamProcessingStopSelector == false)
            return false;
        StreamProcessingStopSelector other = (StreamProcessingStopSelector) obj;
        if (other.getMaxDurationInSeconds() == null ^ this.getMaxDurationInSeconds() == null)
            return false;
        if (other.getMaxDurationInSeconds() != null && other.getMaxDurationInSeconds().equals(this.getMaxDurationInSeconds()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaxDurationInSeconds() == null) ? 0 : getMaxDurationInSeconds().hashCode());
        return hashCode;
    }

    @Override
    public StreamProcessingStopSelector clone() {
        try {
            return (StreamProcessingStopSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.StreamProcessingStopSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
