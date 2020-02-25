/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about text detected in a video. Incudes the detected text, the time in milliseconds from the start of the
 * video that the text was detected, and where it was detected on the screen.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TextDetectionResult implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the text was detected.
     * </p>
     */
    private Long timestamp;
    /**
     * <p>
     * Details about text detected in a video.
     * </p>
     */
    private TextDetection textDetection;

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the text was detected.
     * </p>
     * 
     * @param timestamp
     *        The time, in milliseconds from the start of the video, that the text was detected.
     */

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the text was detected.
     * </p>
     * 
     * @return The time, in milliseconds from the start of the video, that the text was detected.
     */

    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the text was detected.
     * </p>
     * 
     * @param timestamp
     *        The time, in milliseconds from the start of the video, that the text was detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextDetectionResult withTimestamp(Long timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * Details about text detected in a video.
     * </p>
     * 
     * @param textDetection
     *        Details about text detected in a video.
     */

    public void setTextDetection(TextDetection textDetection) {
        this.textDetection = textDetection;
    }

    /**
     * <p>
     * Details about text detected in a video.
     * </p>
     * 
     * @return Details about text detected in a video.
     */

    public TextDetection getTextDetection() {
        return this.textDetection;
    }

    /**
     * <p>
     * Details about text detected in a video.
     * </p>
     * 
     * @param textDetection
     *        Details about text detected in a video.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TextDetectionResult withTextDetection(TextDetection textDetection) {
        setTextDetection(textDetection);
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
        if (getTextDetection() != null)
            sb.append("TextDetection: ").append(getTextDetection());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TextDetectionResult == false)
            return false;
        TextDetectionResult other = (TextDetectionResult) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getTextDetection() == null ^ this.getTextDetection() == null)
            return false;
        if (other.getTextDetection() != null && other.getTextDetection().equals(this.getTextDetection()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getTextDetection() == null) ? 0 : getTextDetection().hashCode());
        return hashCode;
    }

    @Override
    public TextDetectionResult clone() {
        try {
            return (TextDetectionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.TextDetectionResultMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
