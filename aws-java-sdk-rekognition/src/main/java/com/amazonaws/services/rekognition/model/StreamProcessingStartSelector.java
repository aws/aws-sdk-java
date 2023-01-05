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
 * This is a required parameter for label detection stream processors and should not be used to start a face search
 * stream processor.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamProcessingStartSelector implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the starting point in the stream to start processing. This can be done with a producer timestamp or a
     * fragment number in a Kinesis stream.
     * </p>
     */
    private KinesisVideoStreamStartSelector kVSStreamStartSelector;

    /**
     * <p>
     * Specifies the starting point in the stream to start processing. This can be done with a producer timestamp or a
     * fragment number in a Kinesis stream.
     * </p>
     * 
     * @param kVSStreamStartSelector
     *        Specifies the starting point in the stream to start processing. This can be done with a producer timestamp
     *        or a fragment number in a Kinesis stream.
     */

    public void setKVSStreamStartSelector(KinesisVideoStreamStartSelector kVSStreamStartSelector) {
        this.kVSStreamStartSelector = kVSStreamStartSelector;
    }

    /**
     * <p>
     * Specifies the starting point in the stream to start processing. This can be done with a producer timestamp or a
     * fragment number in a Kinesis stream.
     * </p>
     * 
     * @return Specifies the starting point in the stream to start processing. This can be done with a producer
     *         timestamp or a fragment number in a Kinesis stream.
     */

    public KinesisVideoStreamStartSelector getKVSStreamStartSelector() {
        return this.kVSStreamStartSelector;
    }

    /**
     * <p>
     * Specifies the starting point in the stream to start processing. This can be done with a producer timestamp or a
     * fragment number in a Kinesis stream.
     * </p>
     * 
     * @param kVSStreamStartSelector
     *        Specifies the starting point in the stream to start processing. This can be done with a producer timestamp
     *        or a fragment number in a Kinesis stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamProcessingStartSelector withKVSStreamStartSelector(KinesisVideoStreamStartSelector kVSStreamStartSelector) {
        setKVSStreamStartSelector(kVSStreamStartSelector);
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
        if (getKVSStreamStartSelector() != null)
            sb.append("KVSStreamStartSelector: ").append(getKVSStreamStartSelector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamProcessingStartSelector == false)
            return false;
        StreamProcessingStartSelector other = (StreamProcessingStartSelector) obj;
        if (other.getKVSStreamStartSelector() == null ^ this.getKVSStreamStartSelector() == null)
            return false;
        if (other.getKVSStreamStartSelector() != null && other.getKVSStreamStartSelector().equals(this.getKVSStreamStartSelector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getKVSStreamStartSelector() == null) ? 0 : getKVSStreamStartSelector().hashCode());
        return hashCode;
    }

    @Override
    public StreamProcessingStartSelector clone() {
        try {
            return (StreamProcessingStartSelector) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.StreamProcessingStartSelectorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
