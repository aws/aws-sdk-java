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
package com.amazonaws.services.connect.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Configuration information of a Kinesis data stream.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/connect-2017-08-08/KinesisStreamConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisStreamConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data stream.
     * </p>
     */
    private String streamArn;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data stream.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) of the data stream.
     */

    public void setStreamArn(String streamArn) {
        this.streamArn = streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data stream.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the data stream.
     */

    public String getStreamArn() {
        return this.streamArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the data stream.
     * </p>
     * 
     * @param streamArn
     *        The Amazon Resource Name (ARN) of the data stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisStreamConfig withStreamArn(String streamArn) {
        setStreamArn(streamArn);
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
            sb.append("StreamArn: ").append(getStreamArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisStreamConfig == false)
            return false;
        KinesisStreamConfig other = (KinesisStreamConfig) obj;
        if (other.getStreamArn() == null ^ this.getStreamArn() == null)
            return false;
        if (other.getStreamArn() != null && other.getStreamArn().equals(this.getStreamArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreamArn() == null) ? 0 : getStreamArn().hashCode());
        return hashCode;
    }

    @Override
    public KinesisStreamConfig clone() {
        try {
            return (KinesisStreamConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.connect.model.transform.KinesisStreamConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
