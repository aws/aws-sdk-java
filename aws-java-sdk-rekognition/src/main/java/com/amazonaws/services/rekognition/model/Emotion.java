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
 * The emotions detected on the face, and the confidence level in the determination. For example, HAPPY, SAD, and ANGRY.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Emotion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Type of emotion detected.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Level of confidence in the determination.
     * </p>
     */
    private Float confidence;

    /**
     * <p>
     * Type of emotion detected.
     * </p>
     * 
     * @param type
     *        Type of emotion detected.
     * @see EmotionName
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * Type of emotion detected.
     * </p>
     * 
     * @return Type of emotion detected.
     * @see EmotionName
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * Type of emotion detected.
     * </p>
     * 
     * @param type
     *        Type of emotion detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmotionName
     */

    public Emotion withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * Type of emotion detected.
     * </p>
     * 
     * @param type
     *        Type of emotion detected.
     * @see EmotionName
     */

    public void setType(EmotionName type) {
        withType(type);
    }

    /**
     * <p>
     * Type of emotion detected.
     * </p>
     * 
     * @param type
     *        Type of emotion detected.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see EmotionName
     */

    public Emotion withType(EmotionName type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Level of confidence in the determination.
     * </p>
     * 
     * @param confidence
     *        Level of confidence in the determination.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * Level of confidence in the determination.
     * </p>
     * 
     * @return Level of confidence in the determination.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * Level of confidence in the determination.
     * </p>
     * 
     * @param confidence
     *        Level of confidence in the determination.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Emotion withConfidence(Float confidence) {
        setConfidence(confidence);
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
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Emotion == false)
            return false;
        Emotion other = (Emotion) obj;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public Emotion clone() {
        try {
            return (Emotion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.EmotionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
