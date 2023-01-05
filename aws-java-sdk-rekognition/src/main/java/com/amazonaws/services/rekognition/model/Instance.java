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
package com.amazonaws.services.rekognition.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * An instance of a label returned by Amazon Rekognition Image (<a>DetectLabels</a>) or by Amazon Rekognition Video
 * (<a>GetLabelDetection</a>).
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Instance implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The position of the label instance on the image.
     * </p>
     */
    private BoundingBox boundingBox;
    /**
     * <p>
     * The confidence that Amazon Rekognition has in the accuracy of the bounding box.
     * </p>
     */
    private Float confidence;
    /**
     * <p>
     * The dominant colors found in an individual instance of a label.
     * </p>
     */
    private java.util.List<DominantColor> dominantColors;

    /**
     * <p>
     * The position of the label instance on the image.
     * </p>
     * 
     * @param boundingBox
     *        The position of the label instance on the image.
     */

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * The position of the label instance on the image.
     * </p>
     * 
     * @return The position of the label instance on the image.
     */

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * <p>
     * The position of the label instance on the image.
     * </p>
     * 
     * @param boundingBox
     *        The position of the label instance on the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withBoundingBox(BoundingBox boundingBox) {
        setBoundingBox(boundingBox);
        return this;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the accuracy of the bounding box.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Rekognition has in the accuracy of the bounding box.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the accuracy of the bounding box.
     * </p>
     * 
     * @return The confidence that Amazon Rekognition has in the accuracy of the bounding box.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The confidence that Amazon Rekognition has in the accuracy of the bounding box.
     * </p>
     * 
     * @param confidence
     *        The confidence that Amazon Rekognition has in the accuracy of the bounding box.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withConfidence(Float confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * <p>
     * The dominant colors found in an individual instance of a label.
     * </p>
     * 
     * @return The dominant colors found in an individual instance of a label.
     */

    public java.util.List<DominantColor> getDominantColors() {
        return dominantColors;
    }

    /**
     * <p>
     * The dominant colors found in an individual instance of a label.
     * </p>
     * 
     * @param dominantColors
     *        The dominant colors found in an individual instance of a label.
     */

    public void setDominantColors(java.util.Collection<DominantColor> dominantColors) {
        if (dominantColors == null) {
            this.dominantColors = null;
            return;
        }

        this.dominantColors = new java.util.ArrayList<DominantColor>(dominantColors);
    }

    /**
     * <p>
     * The dominant colors found in an individual instance of a label.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDominantColors(java.util.Collection)} or {@link #withDominantColors(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param dominantColors
     *        The dominant colors found in an individual instance of a label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withDominantColors(DominantColor... dominantColors) {
        if (this.dominantColors == null) {
            setDominantColors(new java.util.ArrayList<DominantColor>(dominantColors.length));
        }
        for (DominantColor ele : dominantColors) {
            this.dominantColors.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The dominant colors found in an individual instance of a label.
     * </p>
     * 
     * @param dominantColors
     *        The dominant colors found in an individual instance of a label.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Instance withDominantColors(java.util.Collection<DominantColor> dominantColors) {
        setDominantColors(dominantColors);
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
        if (getDominantColors() != null)
            sb.append("DominantColors: ").append(getDominantColors());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Instance == false)
            return false;
        Instance other = (Instance) obj;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getDominantColors() == null ^ this.getDominantColors() == null)
            return false;
        if (other.getDominantColors() != null && other.getDominantColors().equals(this.getDominantColors()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getDominantColors() == null) ? 0 : getDominantColors().hashCode());
        return hashCode;
    }

    @Override
    public Instance clone() {
        try {
            return (Instance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.InstanceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
