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
package com.amazonaws.services.kinesisvideo.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A structure that encapsulates, or contains, the media storage configuration properties.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/kinesisvideo-2017-09-30/MediaStorageConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MediaStorageConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream
     * </p>
     */
    private String streamARN;
    /**
     * <p>
     * The status of the media storage configuration.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream
     */

    public void setStreamARN(String streamARN) {
        this.streamARN = streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the stream
     */

    public String getStreamARN() {
        return this.streamARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the stream
     * </p>
     * 
     * @param streamARN
     *        The Amazon Resource Name (ARN) of the stream
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MediaStorageConfiguration withStreamARN(String streamARN) {
        setStreamARN(streamARN);
        return this;
    }

    /**
     * <p>
     * The status of the media storage configuration.
     * </p>
     * 
     * @param status
     *        The status of the media storage configuration.
     * @see MediaStorageConfigurationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the media storage configuration.
     * </p>
     * 
     * @return The status of the media storage configuration.
     * @see MediaStorageConfigurationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the media storage configuration.
     * </p>
     * 
     * @param status
     *        The status of the media storage configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaStorageConfigurationStatus
     */

    public MediaStorageConfiguration withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the media storage configuration.
     * </p>
     * 
     * @param status
     *        The status of the media storage configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see MediaStorageConfigurationStatus
     */

    public MediaStorageConfiguration withStatus(MediaStorageConfigurationStatus status) {
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
        if (getStreamARN() != null)
            sb.append("StreamARN: ").append(getStreamARN()).append(",");
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

        if (obj instanceof MediaStorageConfiguration == false)
            return false;
        MediaStorageConfiguration other = (MediaStorageConfiguration) obj;
        if (other.getStreamARN() == null ^ this.getStreamARN() == null)
            return false;
        if (other.getStreamARN() != null && other.getStreamARN().equals(this.getStreamARN()) == false)
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

        hashCode = prime * hashCode + ((getStreamARN() == null) ? 0 : getStreamARN().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public MediaStorageConfiguration clone() {
        try {
            return (MediaStorageConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.kinesisvideo.model.transform.MediaStorageConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
