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
 * Information about an item of Personal Protective Equipment (PPE) detected by <a>DetectProtectiveEquipment</a>. For
 * more information, see <a>DetectProtectiveEquipment</a>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EquipmentDetection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A bounding box surrounding the item of detected PPE.
     * </p>
     */
    private BoundingBox boundingBox;
    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box (<code>BoundingBox</code>) contains an item of
     * PPE.
     * </p>
     */
    private Float confidence;
    /**
     * <p>
     * The type of detected PPE.
     * </p>
     */
    private String type;
    /**
     * <p>
     * Information about the body part covered by the detected PPE.
     * </p>
     */
    private CoversBodyPart coversBodyPart;

    /**
     * <p>
     * A bounding box surrounding the item of detected PPE.
     * </p>
     * 
     * @param boundingBox
     *        A bounding box surrounding the item of detected PPE.
     */

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * A bounding box surrounding the item of detected PPE.
     * </p>
     * 
     * @return A bounding box surrounding the item of detected PPE.
     */

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * <p>
     * A bounding box surrounding the item of detected PPE.
     * </p>
     * 
     * @param boundingBox
     *        A bounding box surrounding the item of detected PPE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EquipmentDetection withBoundingBox(BoundingBox boundingBox) {
        setBoundingBox(boundingBox);
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box (<code>BoundingBox</code>) contains an item of
     * PPE.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Rekognition has that the bounding box (<code>BoundingBox</code>) contains an
     *        item of PPE.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box (<code>BoundingBox</code>) contains an item of
     * PPE.
     * </p>
     * 
     * @return The confidence that Amazon Rekognition has that the bounding box (<code>BoundingBox</code>) contains an
     *         item of PPE.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box (<code>BoundingBox</code>) contains an item of
     * PPE.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Rekognition has that the bounding box (<code>BoundingBox</code>) contains an
     *        item of PPE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EquipmentDetection withConfidence(Float confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * The type of detected PPE.
     * </p>
     * 
     * @param type
     *        The type of detected PPE.
     * @see ProtectiveEquipmentType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of detected PPE.
     * </p>
     * 
     * @return The type of detected PPE.
     * @see ProtectiveEquipmentType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of detected PPE.
     * </p>
     * 
     * @param type
     *        The type of detected PPE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectiveEquipmentType
     */

    public EquipmentDetection withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of detected PPE.
     * </p>
     * 
     * @param type
     *        The type of detected PPE.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ProtectiveEquipmentType
     */

    public EquipmentDetection withType(ProtectiveEquipmentType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * Information about the body part covered by the detected PPE.
     * </p>
     * 
     * @param coversBodyPart
     *        Information about the body part covered by the detected PPE.
     */

    public void setCoversBodyPart(CoversBodyPart coversBodyPart) {
        this.coversBodyPart = coversBodyPart;
    }

    /**
     * <p>
     * Information about the body part covered by the detected PPE.
     * </p>
     * 
     * @return Information about the body part covered by the detected PPE.
     */

    public CoversBodyPart getCoversBodyPart() {
        return this.coversBodyPart;
    }

    /**
     * <p>
     * Information about the body part covered by the detected PPE.
     * </p>
     * 
     * @param coversBodyPart
     *        Information about the body part covered by the detected PPE.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EquipmentDetection withCoversBodyPart(CoversBodyPart coversBodyPart) {
        setCoversBodyPart(coversBodyPart);
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
        if (getBoundingBox() != null)
            sb.append("BoundingBox: ").append(getBoundingBox()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getCoversBodyPart() != null)
            sb.append("CoversBodyPart: ").append(getCoversBodyPart());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EquipmentDetection == false)
            return false;
        EquipmentDetection other = (EquipmentDetection) obj;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getCoversBodyPart() == null ^ this.getCoversBodyPart() == null)
            return false;
        if (other.getCoversBodyPart() != null && other.getCoversBodyPart().equals(this.getCoversBodyPart()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getCoversBodyPart() == null) ? 0 : getCoversBodyPart().hashCode());
        return hashCode;
    }

    @Override
    public EquipmentDetection clone() {
        try {
            return (EquipmentDetection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.EquipmentDetectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
