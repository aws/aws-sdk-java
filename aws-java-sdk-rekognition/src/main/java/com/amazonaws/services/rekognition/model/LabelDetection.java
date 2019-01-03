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
 * Information about a label detected in a video analysis request and the time the label was detected in the video.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LabelDetection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was detected.
     * </p>
     */
    private Long timestamp;
    /**
     * <p>
     * Details about the detected label.
     * </p>
     */
    private Label label;

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was detected.
     * </p>
     * 
     * @param timestamp
     *        Time, in milliseconds from the start of the video, that the label was detected.
     */

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was detected.
     * </p>
     * 
     * @return Time, in milliseconds from the start of the video, that the label was detected.
     */

    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * Time, in milliseconds from the start of the video, that the label was detected.
     * </p>
     * 
     * @param timestamp
     *        Time, in milliseconds from the start of the video, that the label was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelDetection withTimestamp(Long timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * Details about the detected label.
     * </p>
     * 
     * @param label
     *        Details about the detected label.
     */

    public void setLabel(Label label) {
        this.label = label;
    }

    /**
     * <p>
     * Details about the detected label.
     * </p>
     * 
     * @return Details about the detected label.
     */

    public Label getLabel() {
        return this.label;
    }

    /**
     * <p>
     * Details about the detected label.
     * </p>
     * 
     * @param label
     *        Details about the detected label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LabelDetection withLabel(Label label) {
        setLabel(label);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LabelDetection == false)
            return false;
        LabelDetection other = (LabelDetection) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        return hashCode;
    }

    @Override
    public LabelDetection clone() {
        try {
            return (LabelDetection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.LabelDetectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
