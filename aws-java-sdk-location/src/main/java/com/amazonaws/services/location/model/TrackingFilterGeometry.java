/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The geomerty used to filter device positions.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/TrackingFilterGeometry" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class TrackingFilterGeometry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The set of arrays which define the polygon. A polygon can have between 4 and 1000 vertices.
     * </p>
     */
    private java.util.List<java.util.List<java.util.List<Double>>> polygon;

    /**
     * <p>
     * The set of arrays which define the polygon. A polygon can have between 4 and 1000 vertices.
     * </p>
     * 
     * @return The set of arrays which define the polygon. A polygon can have between 4 and 1000 vertices.
     */

    public java.util.List<java.util.List<java.util.List<Double>>> getPolygon() {
        return polygon;
    }

    /**
     * <p>
     * The set of arrays which define the polygon. A polygon can have between 4 and 1000 vertices.
     * </p>
     * 
     * @param polygon
     *        The set of arrays which define the polygon. A polygon can have between 4 and 1000 vertices.
     */

    public void setPolygon(java.util.Collection<java.util.List<java.util.List<Double>>> polygon) {
        if (polygon == null) {
            this.polygon = null;
            return;
        }

        this.polygon = new java.util.ArrayList<java.util.List<java.util.List<Double>>>(polygon);
    }

    /**
     * <p>
     * The set of arrays which define the polygon. A polygon can have between 4 and 1000 vertices.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolygon(java.util.Collection)} or {@link #withPolygon(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param polygon
     *        The set of arrays which define the polygon. A polygon can have between 4 and 1000 vertices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrackingFilterGeometry withPolygon(java.util.List<java.util.List<Double>>... polygon) {
        if (this.polygon == null) {
            setPolygon(new java.util.ArrayList<java.util.List<java.util.List<Double>>>(polygon.length));
        }
        for (java.util.List<java.util.List<Double>> ele : polygon) {
            this.polygon.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The set of arrays which define the polygon. A polygon can have between 4 and 1000 vertices.
     * </p>
     * 
     * @param polygon
     *        The set of arrays which define the polygon. A polygon can have between 4 and 1000 vertices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public TrackingFilterGeometry withPolygon(java.util.Collection<java.util.List<java.util.List<Double>>> polygon) {
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
        if (getPolygon() != null)
            sb.append("Polygon: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof TrackingFilterGeometry == false)
            return false;
        TrackingFilterGeometry other = (TrackingFilterGeometry) obj;
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

        hashCode = prime * hashCode + ((getPolygon() == null) ? 0 : getPolygon().hashCode());
        return hashCode;
    }

    @Override
    public TrackingFilterGeometry clone() {
        try {
            return (TrackingFilterGeometry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.TrackingFilterGeometryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
