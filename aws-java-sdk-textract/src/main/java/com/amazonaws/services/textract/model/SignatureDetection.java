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
package com.amazonaws.services.textract.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information regarding a detected signature on a page.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/textract-2018-06-27/SignatureDetection" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SignatureDetection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The confidence, from 0 to 100, in the predicted values for a detected signature.
     * </p>
     */
    private Float confidence;

    private Geometry geometry;

    /**
     * <p>
     * The confidence, from 0 to 100, in the predicted values for a detected signature.
     * </p>
     * 
     * @param confidence
     *        The confidence, from 0 to 100, in the predicted values for a detected signature.
     */

    public void setConfidence(Float confidence) {
        this.confidence = confidence;
    }

    /**
     * <p>
     * The confidence, from 0 to 100, in the predicted values for a detected signature.
     * </p>
     * 
     * @return The confidence, from 0 to 100, in the predicted values for a detected signature.
     */

    public Float getConfidence() {
        return this.confidence;
    }

    /**
     * <p>
     * The confidence, from 0 to 100, in the predicted values for a detected signature.
     * </p>
     * 
     * @param confidence
     *        The confidence, from 0 to 100, in the predicted values for a detected signature.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignatureDetection withConfidence(Float confidence) {
        setConfidence(confidence);
        return this;
    }

    /**
     * @param geometry
     */

    public void setGeometry(Geometry geometry) {
        this.geometry = geometry;
    }

    /**
     * @return
     */

    public Geometry getGeometry() {
        return this.geometry;
    }

    /**
     * @param geometry
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SignatureDetection withGeometry(Geometry geometry) {
        setGeometry(geometry);
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
        if (getConfidence() != null)
            sb.append("Confidence: ").append(getConfidence()).append(",");
        if (getGeometry() != null)
            sb.append("Geometry: ").append(getGeometry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SignatureDetection == false)
            return false;
        SignatureDetection other = (SignatureDetection) obj;
        if (other.getConfidence() == null ^ this.getConfidence() == null)
            return false;
        if (other.getConfidence() != null && other.getConfidence().equals(this.getConfidence()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getConfidence() == null) ? 0 : getConfidence().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        return hashCode;
    }

    @Override
    public SignatureDetection clone() {
        try {
            return (SignatureDetection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.textract.model.transform.SignatureDetectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
