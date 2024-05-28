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
 * A structure that holds the settings for transmitting media files to the Amazon S3 bucket. If specified, the settings
 * in this structure override any settings in <code>S3RecordingSinkConfiguration</code>.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/S3RecordingSinkRuntimeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class S3RecordingSinkRuntimeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The URI of the S3 bucket used as the sink.
     * </p>
     */
    private String destination;
    /**
     * <p>
     * The file format for the media files sent to the Amazon S3 bucket.
     * </p>
     */
    private String recordingFileFormat;

    /**
     * <p>
     * The URI of the S3 bucket used as the sink.
     * </p>
     * 
     * @param destination
     *        The URI of the S3 bucket used as the sink.
     */

    public void setDestination(String destination) {
        this.destination = destination;
    }

    /**
     * <p>
     * The URI of the S3 bucket used as the sink.
     * </p>
     * 
     * @return The URI of the S3 bucket used as the sink.
     */

    public String getDestination() {
        return this.destination;
    }

    /**
     * <p>
     * The URI of the S3 bucket used as the sink.
     * </p>
     * 
     * @param destination
     *        The URI of the S3 bucket used as the sink.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public S3RecordingSinkRuntimeConfiguration withDestination(String destination) {
        setDestination(destination);
        return this;
    }

    /**
     * <p>
     * The file format for the media files sent to the Amazon S3 bucket.
     * </p>
     * 
     * @param recordingFileFormat
     *        The file format for the media files sent to the Amazon S3 bucket.
     * @see RecordingFileFormat
     */

    public void setRecordingFileFormat(String recordingFileFormat) {
        this.recordingFileFormat = recordingFileFormat;
    }

    /**
     * <p>
     * The file format for the media files sent to the Amazon S3 bucket.
     * </p>
     * 
     * @return The file format for the media files sent to the Amazon S3 bucket.
     * @see RecordingFileFormat
     */

    public String getRecordingFileFormat() {
        return this.recordingFileFormat;
    }

    /**
     * <p>
     * The file format for the media files sent to the Amazon S3 bucket.
     * </p>
     * 
     * @param recordingFileFormat
     *        The file format for the media files sent to the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordingFileFormat
     */

    public S3RecordingSinkRuntimeConfiguration withRecordingFileFormat(String recordingFileFormat) {
        setRecordingFileFormat(recordingFileFormat);
        return this;
    }

    /**
     * <p>
     * The file format for the media files sent to the Amazon S3 bucket.
     * </p>
     * 
     * @param recordingFileFormat
     *        The file format for the media files sent to the Amazon S3 bucket.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecordingFileFormat
     */

    public S3RecordingSinkRuntimeConfiguration withRecordingFileFormat(RecordingFileFormat recordingFileFormat) {
        this.recordingFileFormat = recordingFileFormat.toString();
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
        if (getDestination() != null)
            sb.append("Destination: ").append("***Sensitive Data Redacted***").append(",");
        if (getRecordingFileFormat() != null)
            sb.append("RecordingFileFormat: ").append(getRecordingFileFormat());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof S3RecordingSinkRuntimeConfiguration == false)
            return false;
        S3RecordingSinkRuntimeConfiguration other = (S3RecordingSinkRuntimeConfiguration) obj;
        if (other.getDestination() == null ^ this.getDestination() == null)
            return false;
        if (other.getDestination() != null && other.getDestination().equals(this.getDestination()) == false)
            return false;
        if (other.getRecordingFileFormat() == null ^ this.getRecordingFileFormat() == null)
            return false;
        if (other.getRecordingFileFormat() != null && other.getRecordingFileFormat().equals(this.getRecordingFileFormat()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDestination() == null) ? 0 : getDestination().hashCode());
        hashCode = prime * hashCode + ((getRecordingFileFormat() == null) ? 0 : getRecordingFileFormat().hashCode());
        return hashCode;
    }

    @Override
    public S3RecordingSinkRuntimeConfiguration clone() {
        try {
            return (S3RecordingSinkRuntimeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.S3RecordingSinkRuntimeConfigurationMarshaller.getInstance().marshall(this,
                protocolMarshaller);
    }
}
