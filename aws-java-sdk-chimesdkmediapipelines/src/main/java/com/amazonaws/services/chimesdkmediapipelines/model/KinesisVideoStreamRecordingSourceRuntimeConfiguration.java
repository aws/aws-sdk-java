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
 * A structure that contains the runtime settings for recording a Kinesis video stream.
 * </p>
 * 
 * @see <a
 *      href="http://docs.aws.amazon.com/goto/WebAPI/chime-sdk-media-pipelines-2021-07-15/KinesisVideoStreamRecordingSourceRuntimeConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class KinesisVideoStreamRecordingSourceRuntimeConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The stream or streams to be recorded.
     * </p>
     */
    private java.util.List<RecordingStreamConfiguration> streams;
    /**
     * <p>
     * Describes the timestamp range and timestamp origin of a range of fragments in the Kinesis video stream.
     * </p>
     */
    private FragmentSelector fragmentSelector;

    /**
     * <p>
     * The stream or streams to be recorded.
     * </p>
     * 
     * @return The stream or streams to be recorded.
     */

    public java.util.List<RecordingStreamConfiguration> getStreams() {
        return streams;
    }

    /**
     * <p>
     * The stream or streams to be recorded.
     * </p>
     * 
     * @param streams
     *        The stream or streams to be recorded.
     */

    public void setStreams(java.util.Collection<RecordingStreamConfiguration> streams) {
        if (streams == null) {
            this.streams = null;
            return;
        }

        this.streams = new java.util.ArrayList<RecordingStreamConfiguration>(streams);
    }

    /**
     * <p>
     * The stream or streams to be recorded.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStreams(java.util.Collection)} or {@link #withStreams(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param streams
     *        The stream or streams to be recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamRecordingSourceRuntimeConfiguration withStreams(RecordingStreamConfiguration... streams) {
        if (this.streams == null) {
            setStreams(new java.util.ArrayList<RecordingStreamConfiguration>(streams.length));
        }
        for (RecordingStreamConfiguration ele : streams) {
            this.streams.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The stream or streams to be recorded.
     * </p>
     * 
     * @param streams
     *        The stream or streams to be recorded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamRecordingSourceRuntimeConfiguration withStreams(java.util.Collection<RecordingStreamConfiguration> streams) {
        setStreams(streams);
        return this;
    }

    /**
     * <p>
     * Describes the timestamp range and timestamp origin of a range of fragments in the Kinesis video stream.
     * </p>
     * 
     * @param fragmentSelector
     *        Describes the timestamp range and timestamp origin of a range of fragments in the Kinesis video stream.
     */

    public void setFragmentSelector(FragmentSelector fragmentSelector) {
        this.fragmentSelector = fragmentSelector;
    }

    /**
     * <p>
     * Describes the timestamp range and timestamp origin of a range of fragments in the Kinesis video stream.
     * </p>
     * 
     * @return Describes the timestamp range and timestamp origin of a range of fragments in the Kinesis video stream.
     */

    public FragmentSelector getFragmentSelector() {
        return this.fragmentSelector;
    }

    /**
     * <p>
     * Describes the timestamp range and timestamp origin of a range of fragments in the Kinesis video stream.
     * </p>
     * 
     * @param fragmentSelector
     *        Describes the timestamp range and timestamp origin of a range of fragments in the Kinesis video stream.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public KinesisVideoStreamRecordingSourceRuntimeConfiguration withFragmentSelector(FragmentSelector fragmentSelector) {
        setFragmentSelector(fragmentSelector);
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
        if (getStreams() != null)
            sb.append("Streams: ").append(getStreams()).append(",");
        if (getFragmentSelector() != null)
            sb.append("FragmentSelector: ").append(getFragmentSelector());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof KinesisVideoStreamRecordingSourceRuntimeConfiguration == false)
            return false;
        KinesisVideoStreamRecordingSourceRuntimeConfiguration other = (KinesisVideoStreamRecordingSourceRuntimeConfiguration) obj;
        if (other.getStreams() == null ^ this.getStreams() == null)
            return false;
        if (other.getStreams() != null && other.getStreams().equals(this.getStreams()) == false)
            return false;
        if (other.getFragmentSelector() == null ^ this.getFragmentSelector() == null)
            return false;
        if (other.getFragmentSelector() != null && other.getFragmentSelector().equals(this.getFragmentSelector()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStreams() == null) ? 0 : getStreams().hashCode());
        hashCode = prime * hashCode + ((getFragmentSelector() == null) ? 0 : getFragmentSelector().hashCode());
        return hashCode;
    }

    @Override
    public KinesisVideoStreamRecordingSourceRuntimeConfiguration clone() {
        try {
            return (KinesisVideoStreamRecordingSourceRuntimeConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.chimesdkmediapipelines.model.transform.KinesisVideoStreamRecordingSourceRuntimeConfigurationMarshaller.getInstance().marshall(
                this, protocolMarshaller);
    }
}
