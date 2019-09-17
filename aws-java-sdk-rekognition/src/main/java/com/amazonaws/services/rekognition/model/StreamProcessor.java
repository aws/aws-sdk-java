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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An object that recognizes faces in a streaming video. An Amazon Rekognition stream processor is created by a call to
 * <a>CreateStreamProcessor</a>. The request parameters for <code>CreateStreamProcessor</code> describe the Kinesis
 * video stream source for the streaming video, face recognition parameters, and where to stream the analysis resullts.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StreamProcessor implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Name of the Amazon Rekognition stream processor.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Current status of the Amazon Rekognition stream processor.
     * </p>
     */
    private String status;

    /**
     * <p>
     * Name of the Amazon Rekognition stream processor.
     * </p>
     * 
     * @param name
     *        Name of the Amazon Rekognition stream processor.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * Name of the Amazon Rekognition stream processor.
     * </p>
     * 
     * @return Name of the Amazon Rekognition stream processor.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * Name of the Amazon Rekognition stream processor.
     * </p>
     * 
     * @param name
     *        Name of the Amazon Rekognition stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StreamProcessor withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Current status of the Amazon Rekognition stream processor.
     * </p>
     * 
     * @param status
     *        Current status of the Amazon Rekognition stream processor.
     * @see StreamProcessorStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Current status of the Amazon Rekognition stream processor.
     * </p>
     * 
     * @return Current status of the Amazon Rekognition stream processor.
     * @see StreamProcessorStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Current status of the Amazon Rekognition stream processor.
     * </p>
     * 
     * @param status
     *        Current status of the Amazon Rekognition stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamProcessorStatus
     */

    public StreamProcessor withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Current status of the Amazon Rekognition stream processor.
     * </p>
     * 
     * @param status
     *        Current status of the Amazon Rekognition stream processor.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StreamProcessorStatus
     */

    public StreamProcessor withStatus(StreamProcessorStatus status) {
        this.status = status.toString();
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StreamProcessor == false)
            return false;
        StreamProcessor other = (StreamProcessor) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public StreamProcessor clone() {
        try {
            return (StreamProcessor) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.StreamProcessorMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
