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
 * Information about a detected celebrity and the time the celebrity was detected in a stored video. For more
 * information, see GetCelebrityRecognition in the Amazon Rekognition Developer Guide.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CelebrityRecognition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the celebrity was recognized.
     * </p>
     */
    private Long timestamp;
    /**
     * <p>
     * Information about a recognized celebrity.
     * </p>
     */
    private CelebrityDetail celebrity;

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the celebrity was recognized.
     * </p>
     * 
     * @param timestamp
     *        The time, in milliseconds from the start of the video, that the celebrity was recognized.
     */

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the celebrity was recognized.
     * </p>
     * 
     * @return The time, in milliseconds from the start of the video, that the celebrity was recognized.
     */

    public Long getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The time, in milliseconds from the start of the video, that the celebrity was recognized.
     * </p>
     * 
     * @param timestamp
     *        The time, in milliseconds from the start of the video, that the celebrity was recognized.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CelebrityRecognition withTimestamp(Long timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * Information about a recognized celebrity.
     * </p>
     * 
     * @param celebrity
     *        Information about a recognized celebrity.
     */

    public void setCelebrity(CelebrityDetail celebrity) {
        this.celebrity = celebrity;
    }

    /**
     * <p>
     * Information about a recognized celebrity.
     * </p>
     * 
     * @return Information about a recognized celebrity.
     */

    public CelebrityDetail getCelebrity() {
        return this.celebrity;
    }

    /**
     * <p>
     * Information about a recognized celebrity.
     * </p>
     * 
     * @param celebrity
     *        Information about a recognized celebrity.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CelebrityRecognition withCelebrity(CelebrityDetail celebrity) {
        setCelebrity(celebrity);
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
        if (getCelebrity() != null)
            sb.append("Celebrity: ").append(getCelebrity());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CelebrityRecognition == false)
            return false;
        CelebrityRecognition other = (CelebrityRecognition) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getCelebrity() == null ^ this.getCelebrity() == null)
            return false;
        if (other.getCelebrity() != null && other.getCelebrity().equals(this.getCelebrity()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getCelebrity() == null) ? 0 : getCelebrity().hashCode());
        return hashCode;
    }

    @Override
    public CelebrityRecognition clone() {
        try {
            return (CelebrityRecognition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.CelebrityRecognitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
