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
 * A person detected by a call to <a>DetectProtectiveEquipment</a>. The API returns all persons detected in the input
 * image in an array of <code>ProtectiveEquipmentPerson</code> objects.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProtectiveEquipmentPerson implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An array of body parts detected on a person's body (including body parts without PPE).
     * </p>
     */
    private java.util.List<ProtectiveEquipmentBodyPart> bodyParts;
    /**
     * <p>
     * A bounding box around the detected person.
     * </p>
     */
    private BoundingBox boundingBox;
    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box contains a person.
     * </p>
     */
    private Float confidence;
    /**
     * <p>
     * The identifier for the detected person. The identifier is only unique for a single call to
     * <code>DetectProtectiveEquipment</code>.
     * </p>
     */
    private Integer id;

    /**
     * <p>
     * An array of body parts detected on a person's body (including body parts without PPE).
     * </p>
     * 
     * @return An array of body parts detected on a person's body (including body parts without PPE).
     */

    public java.util.List<ProtectiveEquipmentBodyPart> getBodyParts() {
        return bodyParts;
    }

    /**
     * <p>
     * An array of body parts detected on a person's body (including body parts without PPE).
     * </p>
     * 
     * @param bodyParts
     *        An array of body parts detected on a person's body (including body parts without PPE).
     */

    public void setBodyParts(java.util.Collection<ProtectiveEquipmentBodyPart> bodyParts) {
        if (bodyParts == null) {
            this.bodyParts = null;
            return;
        }

        this.bodyParts = new java.util.ArrayList<ProtectiveEquipmentBodyPart>(bodyParts);
    }

    /**
     * <p>
     * An array of body parts detected on a person's body (including body parts without PPE).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setBodyParts(java.util.Collection)} or {@link #withBodyParts(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param bodyParts
     *        An array of body parts detected on a person's body (including body parts without PPE).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentPerson withBodyParts(ProtectiveEquipmentBodyPart... bodyParts) {
        if (this.bodyParts == null) {
            setBodyParts(new java.util.ArrayList<ProtectiveEquipmentBodyPart>(bodyParts.length));
        }
        for (ProtectiveEquipmentBodyPart ele : bodyParts) {
            this.bodyParts.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of body parts detected on a person's body (including body parts without PPE).
     * </p>
     * 
     * @param bodyParts
     *        An array of body parts detected on a person's body (including body parts without PPE).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentPerson withBodyParts(java.util.Collection<ProtectiveEquipmentBodyPart> bodyParts) {
        setBodyParts(bodyParts);
        return this;
    }

    /**
     * <p>
     * A bounding box around the detected person.
     * </p>
     * 
     * @param boundingBox
     *        A bounding box around the detected person.
     */

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * A bounding box around the detected person.
     * </p>
     * 
     * @return A bounding box around the detected person.
     */

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * <p>
     * A bounding box around the detected person.
     * </p>
     * 
     * @param boundingBox
     *        A bounding box around the detected person.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentPerson withBoundingBox(BoundingBox boundingBox) {
        setBoundingBox(boundingBox);
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box contains a person.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Rekognition has that the bounding box contains a person.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box contains a person.
     * </p>
     * 
     * @return The confidence that Amazon Rekognition has that the bounding box contains a person.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has that the bounding box contains a person.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Rekognition has that the bounding box contains a person.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentPerson withConfidence(Float confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * The identifier for the detected person. The identifier is only unique for a single call to
     * <code>DetectProtectiveEquipment</code>.
     * </p>
     * 
     * @param id
     *        The identifier for the detected person. The identifier is only unique for a single call to
     *        <code>DetectProtectiveEquipment</code>.
     */

    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * <p>
     * The identifier for the detected person. The identifier is only unique for a single call to
     * <code>DetectProtectiveEquipment</code>.
     * </p>
     * 
     * @return The identifier for the detected person. The identifier is only unique for a single call to
     *         <code>DetectProtectiveEquipment</code>.
     */

    public Integer getId() {
        return this.id;
    }

    /**
     * <p>
     * The identifier for the detected person. The identifier is only unique for a single call to
     * <code>DetectProtectiveEquipment</code>.
     * </p>
     * 
     * @param id
     *        The identifier for the detected person. The identifier is only unique for a single call to
     *        <code>DetectProtectiveEquipment</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProtectiveEquipmentPerson withId(Integer id) {
        setId(id);
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
        if (getBodyParts() != null)
            sb.append("BodyParts: ").append(getBodyParts()).append(",");
        if (getBoundingBox() != null)
            sb.append("BoundingBox: ").append(getBoundingBox()).append(",");
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProtectiveEquipmentPerson == false)
            return false;
        ProtectiveEquipmentPerson other = (ProtectiveEquipmentPerson) obj;
        if (other.getBodyParts() == null ^ this.getBodyParts() == null)
            return false;
        if (other.getBodyParts() != null && other.getBodyParts().equals(this.getBodyParts()) == false)
            return false;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBodyParts() == null) ? 0 : getBodyParts().hashCode());
        hashCode = prime * hashCode + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        return hashCode;
    }

    @Override
    public ProtectiveEquipmentPerson clone() {
        try {
            return (ProtectiveEquipmentPerson) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.ProtectiveEquipmentPersonMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
