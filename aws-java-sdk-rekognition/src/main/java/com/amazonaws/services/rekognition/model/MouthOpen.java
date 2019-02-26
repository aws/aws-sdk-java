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
 * Indicates whether or not the mouth on the face is open, and the confidence level in the determination.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MouthOpen implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Boolean value that indicates whether the mouth on the face is open or not.
     * </p>
     */
    private Boolean value;
    /**
     * <p>
     * Level of confidence in the determination.
     * </p>
     */
    private Float confidence;

    /**
     * <p>
     * Boolean value that indicates whether the mouth on the face is open or not.
     * </p>
     * 
     * @param value
     *        Boolean value that indicates whether the mouth on the face is open or not.
     */

    public void setValue(Boolean value) {
        this.value = value;
    }

    /**
     * <p>
     * Boolean value that indicates whether the mouth on the face is open or not.
     * </p>
     * 
     * @return Boolean value that indicates whether the mouth on the face is open or not.
     */

    public Boolean getValue() {
        return this.value;
    }

    /**
     * <p>
     * Boolean value that indicates whether the mouth on the face is open or not.
     * </p>
     * 
     * @param value
     *        Boolean value that indicates whether the mouth on the face is open or not.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MouthOpen withValue(Boolean value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * Boolean value that indicates whether the mouth on the face is open or not.
     * </p>
     * 
     * @return Boolean value that indicates whether the mouth on the face is open or not.
     */

    public Boolean isValue() {
        return this.value;
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

    public MouthOpen withConfidence(Float confidence) {
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
        if (getValue() != null)
            sb.append("Value: ").append(getValue()).append(",");
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

        if (obj instanceof MouthOpen == false)
            return false;
        MouthOpen other = (MouthOpen) obj;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
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

        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        return hashCode;
    }

    @Override
    public MouthOpen clone() {
        try {
            return (MouthOpen) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.MouthOpenMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
