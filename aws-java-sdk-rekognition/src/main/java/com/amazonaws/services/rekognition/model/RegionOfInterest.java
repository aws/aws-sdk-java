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
 * Specifies a location within the frame that Rekognition checks for objects of interest such as text, labels, or faces.
 * It uses a <code>BoundingBox</code> or <code>Polygon</code> to set a region of the screen.
 * </p>
 * <p>
 * A word, face, or label is included in the region if it is more than half in that region. If there is more than one
 * region, the word, face, or label is compared with all regions of the screen. Any object of interest that is more than
 * half in a region is kept in the results.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RegionOfInterest implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The box representing a region of interest on screen.
     * </p>
     */
    private BoundingBox boundingBox;
    /**
     * <p>
     * Specifies a shape made up of up to 10 <code>Point</code> objects to define a region of interest.
     * </p>
     */
    private java.util.List<Point> polygon;

    /**
     * <p>
     * The box representing a region of interest on screen.
     * </p>
     * 
     * @param boundingBox
     *        The box representing a region of interest on screen.
     */

    public void setBoundingBox(BoundingBox boundingBox) {
        this.boundingBox = boundingBox;
    }

    /**
     * <p>
     * The box representing a region of interest on screen.
     * </p>
     * 
     * @return The box representing a region of interest on screen.
     */

    public BoundingBox getBoundingBox() {
        return this.boundingBox;
    }

    /**
     * <p>
     * The box representing a region of interest on screen.
     * </p>
     * 
     * @param boundingBox
     *        The box representing a region of interest on screen.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionOfInterest withBoundingBox(BoundingBox boundingBox) {
        setBoundingBox(boundingBox);
        return this;
    }

    /**
     * <p>
     * Specifies a shape made up of up to 10 <code>Point</code> objects to define a region of interest.
     * </p>
     * 
     * @return Specifies a shape made up of up to 10 <code>Point</code> objects to define a region of interest.
     */

    public java.util.List<Point> getPolygon() {
        return polygon;
    }

    /**
     * <p>
     * Specifies a shape made up of up to 10 <code>Point</code> objects to define a region of interest.
     * </p>
     * 
     * @param polygon
     *        Specifies a shape made up of up to 10 <code>Point</code> objects to define a region of interest.
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
     * Specifies a shape made up of up to 10 <code>Point</code> objects to define a region of interest.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolygon(java.util.Collection)} or {@link #withPolygon(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param polygon
     *        Specifies a shape made up of up to 10 <code>Point</code> objects to define a region of interest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionOfInterest withPolygon(Point... polygon) {
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
     * Specifies a shape made up of up to 10 <code>Point</code> objects to define a region of interest.
     * </p>
     * 
     * @param polygon
     *        Specifies a shape made up of up to 10 <code>Point</code> objects to define a region of interest.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RegionOfInterest withPolygon(java.util.Collection<Point> polygon) {
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

        if (obj instanceof RegionOfInterest == false)
            return false;
        RegionOfInterest other = (RegionOfInterest) obj;
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
    public RegionOfInterest clone() {
        try {
            return (RegionOfInterest) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.rekognition.model.transform.RegionOfInterestMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
