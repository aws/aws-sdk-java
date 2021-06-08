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
 * Information about a body part detected by <a>DetectProtectiveEquipment</a> that contains PPE. An array of
 * <code>ProtectiveEquipmentBodyPart</code> objects is returned for each person detected by
 * <code>DetectProtectiveEquipment</code>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectiveEquipmentBodyPart implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The detected body part.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The confidence that Amazon Rekognition has in the detection accuracy of the detected body part.
     * </p>
     */
    private Float confidence;
    /**
     * <p>
     * An array of Personal Protective Equipment items detected around a body part.
     * </p>
     */
    private java.util.List<EquipmentDetection> equipmentDetections;

    /**
     * <p>
     * The detected body part.
     * </p>
     * 
     * @param name
     *        The detected body part.
     * @see BodyPart
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The detected body part.
     * </p>
     * 
     * @return The detected body part.
     * @see BodyPart
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The detected body part.
     * </p>
     * 
     * @param name
     *        The detected body part.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BodyPart
     */

    public ProtectiveEquipmentBodyPart withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The detected body part.
     * </p>
     * 
     * @param name
     *        The detected body part.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see BodyPart
     */

    public ProtectiveEquipmentBodyPart withName(BodyPart name) {
        this.name = name.toString();
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the detection accuracy of the detected body part.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Rekognition has in the detection accuracy of the detected body part.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the detection accuracy of the detected body part.
     * </p>
     * 
     * @return The confidence that Amazon Rekognition has in the detection accuracy of the detected body part.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the detection accuracy of the detected body part.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Rekognition has in the detection accuracy of the detected body part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentBodyPart withConfidence(Float confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * An array of Personal Protective Equipment items detected around a body part.
     * </p>
     * 
     * @return An array of Personal Protective Equipment items detected around a body part.
     */

    public java.util.List<EquipmentDetection> getEquipmentDetections() {
        return equipmentDetections;
    }

    /**
     * <p>
     * An array of Personal Protective Equipment items detected around a body part.
     * </p>
     * 
     * @param equipmentDetections
     *        An array of Personal Protective Equipment items detected around a body part.
     */

    public void setEquipmentDetections(java.util.Collection<EquipmentDetection> equipmentDetections) {
        if (equipmentDetections == null) {
            this.equipmentDetections = null;
            return;
        }

        this.equipmentDetections = new java.util.ArrayList<EquipmentDetection>(equipmentDetections);
    }

    /**
     * <p>
     * An array of Personal Protective Equipment items detected around a body part.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEquipmentDetections(java.util.Collection)} or {@link #withEquipmentDetections(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param equipmentDetections
     *        An array of Personal Protective Equipment items detected around a body part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentBodyPart withEquipmentDetections(EquipmentDetection... equipmentDetections) {
        if (this.equipmentDetections == null) {
            setEquipmentDetections(new java.util.ArrayList<EquipmentDetection>(equipmentDetections.length));
        }
        for (EquipmentDetection ele : equipmentDetections) {
            this.equipmentDetections.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of Personal Protective Equipment items detected around a body part.
     * </p>
     * 
     * @param equipmentDetections
     *        An array of Personal Protective Equipment items detected around a body part.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentBodyPart withEquipmentDetections(java.util.Collection<EquipmentDetection> equipmentDetections) {
        setEquipmentDetections(equipmentDetections);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getEquipmentDetections() != null)
            sb.append("EquipmentDetections: ").append(getEquipmentDetections());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectiveEquipmentBodyPart == false)
            return false;
        ProtectiveEquipmentBodyPart other = (ProtectiveEquipmentBodyPart) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getEquipmentDetections() == null ^ this.getEquipmentDetections() == null)
            return false;
        if (other.getEquipmentDetections() != null && other.getEquipmentDetections().equals(this.getEquipmentDetections()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getEquipmentDetections() == null) ? 0 : getEquipmentDetections().hashCode());
        return hashCode;
    }

    @Override
    public ProtectiveEquipmentBodyPart clone() {
        try {
            return (ProtectiveEquipmentBodyPart) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ProtectiveEquipmentBodyPartMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
