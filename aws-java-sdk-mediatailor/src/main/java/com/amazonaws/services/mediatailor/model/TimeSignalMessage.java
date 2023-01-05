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
package com.amazonaws.services.mediatailor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The SCTE-35 <code>time_signal</code> message can be sent with one or more <code>segmentation_descriptor</code>
 * messages. A <code>time_signal</code> message can be sent only if a single <code>segmentation_descriptor</code>
 * message is sent.
 * </p>
 * <p>
 * The <code>time_signal</code> message contains only the <code>splice_time</code> field which is constructed using a
 * given presentation timestamp. When sending a <code>time_signal</code> message, the <code>splice_command_type</code>
 * field in the <code>splice_info_section</code> message is set to 6 (0x06).
 * </p>
 * <p>
 * See the <code>time_signal()</code> table of the 2022 SCTE-35 specification for more information.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mediatailor-2018-04-23/TimeSignalMessage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TimeSignalMessage implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The configurations for the SCTE-35 <code>segmentation_descriptor</code> message(s) sent with the
     * <code>time_signal</code> message.
     * </p>
     */
    private java.util.List<SegmentationDescriptor> segmentationDescriptors;

    /**
     * <p>
     * The configurations for the SCTE-35 <code>segmentation_descriptor</code> message(s) sent with the
     * <code>time_signal</code> message.
     * </p>
     * 
     * @return The configurations for the SCTE-35 <code>segmentation_descriptor</code> message(s) sent with the
     *         <code>time_signal</code> message.
     */

    public java.util.List<SegmentationDescriptor> getSegmentationDescriptors() {
        return segmentationDescriptors;
    }

    /**
     * <p>
     * The configurations for the SCTE-35 <code>segmentation_descriptor</code> message(s) sent with the
     * <code>time_signal</code> message.
     * </p>
     * 
     * @param segmentationDescriptors
     *        The configurations for the SCTE-35 <code>segmentation_descriptor</code> message(s) sent with the
     *        <code>time_signal</code> message.
     */

    public void setSegmentationDescriptors(java.util.Collection<SegmentationDescriptor> segmentationDescriptors) {
        if (segmentationDescriptors == null) {
            this.segmentationDescriptors = null;
            return;
        }

        this.segmentationDescriptors = new java.util.ArrayList<SegmentationDescriptor>(segmentationDescriptors);
    }

    /**
     * <p>
     * The configurations for the SCTE-35 <code>segmentation_descriptor</code> message(s) sent with the
     * <code>time_signal</code> message.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSegmentationDescriptors(java.util.Collection)} or
     * {@link #withSegmentationDescriptors(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param segmentationDescriptors
     *        The configurations for the SCTE-35 <code>segmentation_descriptor</code> message(s) sent with the
     *        <code>time_signal</code> message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSignalMessage withSegmentationDescriptors(SegmentationDescriptor... segmentationDescriptors) {
        if (this.segmentationDescriptors == null) {
            setSegmentationDescriptors(new java.util.ArrayList<SegmentationDescriptor>(segmentationDescriptors.length));
        }
        for (SegmentationDescriptor ele : segmentationDescriptors) {
            this.segmentationDescriptors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The configurations for the SCTE-35 <code>segmentation_descriptor</code> message(s) sent with the
     * <code>time_signal</code> message.
     * </p>
     * 
     * @param segmentationDescriptors
     *        The configurations for the SCTE-35 <code>segmentation_descriptor</code> message(s) sent with the
     *        <code>time_signal</code> message.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TimeSignalMessage withSegmentationDescriptors(java.util.Collection<SegmentationDescriptor> segmentationDescriptors) {
        setSegmentationDescriptors(segmentationDescriptors);
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
        if (getSegmentationDescriptors() != null)
            sb.append("SegmentationDescriptors: ").append(getSegmentationDescriptors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TimeSignalMessage == false)
            return false;
        TimeSignalMessage other = (TimeSignalMessage) obj;
        if (other.getSegmentationDescriptors() == null ^ this.getSegmentationDescriptors() == null)
            return false;
        if (other.getSegmentationDescriptors() != null && other.getSegmentationDescriptors().equals(this.getSegmentationDescriptors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSegmentationDescriptors() == null) ? 0 : getSegmentationDescriptors().hashCode());
        return hashCode;
    }

    @Override
    public TimeSignalMessage clone() {
        try {
            return (TimeSignalMessage) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mediatailor.model.transform.TimeSignalMessageMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
