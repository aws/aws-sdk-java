/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Information about an item of Personal Protective Equipment covering a corresponding body part. For more information,
 * see <a>DetectProtectiveEquipment</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CoversBodyPart implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the value of <code>Value</code>.
     * </p>
     */
    private Float confidence;
    /**
     * <p>
     * True if the PPE covers the corresponding body part, otherwise false.
     * </p>
     */
    private Boolean value;

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the value of <code>Value</code>.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Rekognition has in the value of <code>Value</code>.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the value of <code>Value</code>.
     * </p>
     * 
     * @return The confidence that Amazon Rekognition has in the value of <code>Value</code>.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the value of <code>Value</code>.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Rekognition has in the value of <code>Value</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoversBodyPart withConfidence(Float confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * True if the PPE covers the corresponding body part, otherwise false.
     * </p>
     * 
     * @param value
     *        True if the PPE covers the corresponding body part, otherwise false.
     */

    public void setValue(Boolean value) {
        this.value = value;
    }

    /**
     * <p>
     * True if the PPE covers the corresponding body part, otherwise false.
     * </p>
     * 
     * @return True if the PPE covers the corresponding body part, otherwise false.
     */

    public Boolean getValue() {
        return this.value;
    }

    /**
     * <p>
     * True if the PPE covers the corresponding body part, otherwise false.
     * </p>
     * 
     * @param value
     *        True if the PPE covers the corresponding body part, otherwise false.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CoversBodyPart withValue(Boolean value) {
        setValue(value);
        return this;
    }

    /**
     * <p>
     * True if the PPE covers the corresponding body part, otherwise false.
     * </p>
     * 
     * @return True if the PPE covers the corresponding body part, otherwise false.
     */

    public Boolean isValue() {
        return this.value;
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
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getValue() != null)
            sb.append("Value: ").append(getValue());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CoversBodyPart == false)
            return false;
        CoversBodyPart other = (CoversBodyPart) obj;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getValue() == null ^ this.getValue() == null)
            return false;
        if (other.getValue() != null && other.getValue().equals(this.getValue()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getValue() == null) ? 0 : getValue().hashCode());
        return hashCode;
    }

    @Override
    public CoversBodyPart clone() {
        try {
            return (CoversBodyPart) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.CoversBodyPartMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
