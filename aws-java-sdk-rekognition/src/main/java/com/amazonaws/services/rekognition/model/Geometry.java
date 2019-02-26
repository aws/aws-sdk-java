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
 * Information about where the text detected by <a>DetectText</a> is located on an image.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Geometry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An axis-aligned coarse representation of the detected text's location on the image.
     * </p>
     */
    private BoundingBox boundingBox;
    /**
     * <p>
     * Within the bounding box, a fine-grained polygon around the detected text.
     * </p>
     */
    private java.util.List<Point> polygon;

    /**
     * <p>
     * An axis-aligned coarse representation of the detected text's location on the image.
     * </p>
     * 
     * @param boundingBox
     *        An axis-aligned coarse representation of the detected text's location on the image.
     */

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * An axis-aligned coarse representation of the detected text's location on the image.
     * </p>
     * 
     * @return An axis-aligned coarse representation of the detected text's location on the image.
     */

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * <p>
     * An axis-aligned coarse representation of the detected text's location on the image.
     * </p>
     * 
     * @param boundingBox
     *        An axis-aligned coarse representation of the detected text's location on the image.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Geometry withBoundingBox(BoundingBox boundingBox) {
        setBoundingBox(boundingBox);
        return this;
    }

    /**
     * <p>
     * Within the bounding box, a fine-grained polygon around the detected text.
     * </p>
     * 
     * @return Within the bounding box, a fine-grained polygon around the detected text.
     */

    public java.util.List<Point> getPolygon() {
        return polygon;
    }

    /**
     * <p>
     * Within the bounding box, a fine-grained polygon around the detected text.
     * </p>
     * 
     * @param polygon
     *        Within the bounding box, a fine-grained polygon around the detected text.
     */

    public void setPolygon(java.util.Collection<Point> polygon) {
        if (polygon == null) {
            this.polygon = null;
            return;
        }

        this.polygon = new java.util.ArrayList<Point>(polygon);
    }

    /**
     * <p>
     * Within the bounding box, a fine-grained polygon around the detected text.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolygon(java.util.Collection)} or {@link #withPolygon(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param polygon
     *        Within the bounding box, a fine-grained polygon around the detected text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Geometry withPolygon(Point... polygon) {
        if (this.polygon == null) {
            setPolygon(new java.util.ArrayList<Point>(polygon.length));
        }
        for (Point ele : polygon) {
            this.polygon.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Within the bounding box, a fine-grained polygon around the detected text.
     * </p>
     * 
     * @param polygon
     *        Within the bounding box, a fine-grained polygon around the detected text.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Geometry withPolygon(java.util.Collection<Point> polygon) {
        setPolygon(polygon);
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
        if (getPolygon() != null)
            sb.append("Polygon: ").append(getPolygon());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Geometry == false)
            return false;
        Geometry other = (Geometry) obj;
        if (other.getBoundingBox() == null ^ this.getBoundingBox() == null)
            return false;
        if (other.getBoundingBox() != null && other.getBoundingBox().equals(this.getBoundingBox()) == false)
            return false;
        if (other.getPolygon() == null ^ this.getPolygon() == null)
            return false;
        if (other.getPolygon() != null && other.getPolygon().equals(this.getPolygon()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBoundingBox() == null) ? 0 : getBoundingBox().hashCode());
        hashCode = prime * hashCode + ((getPolygon() == null) ? 0 : getPolygon().hashCode());
        return hashCode;
    }

    @Override
    public Geometry clone() {
        try {
            return (Geometry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.GeometryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
