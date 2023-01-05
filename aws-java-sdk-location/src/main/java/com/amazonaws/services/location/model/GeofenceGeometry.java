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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains the geofence geometry details.
 * </p>
 * <p>
 * A geofence geometry is made up of either a polygon or a circle. Can be either a polygon or a circle. Including both
 * will return a validation error.
 * </p>
 * <note>
 * <p>
 * Amazon Location doesn't currently support polygons with holes, multipolygons, polygons that are wound clockwise, or
 * that cross the antimeridian.
 * </p>
 * </note>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/GeofenceGeometry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeofenceGeometry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A circle on the earth, as defined by a center point and a radius.
     * </p>
     */
    private Circle circle;
    /**
     * <p>
     * A polygon is a list of linear rings which are each made up of a list of vertices.
     * </p>
     * <p>
     * Each vertex is a 2-dimensional point of the form: <code>[longitude, latitude]</code>. This is represented as an
     * array of doubles of length 2 (so <code>[double, double]</code>).
     * </p>
     * <p>
     * An array of 4 or more vertices, where the first and last vertex are the same (to form a closed boundary), is
     * called a linear ring. The linear ring vertices must be listed in counter-clockwise order around the ring’s
     * interior. The linear ring is represented as an array of vertices, or an array of arrays of doubles (
     * <code>[[double, double], ...]</code>).
     * </p>
     * <p>
     * A geofence consists of a single linear ring. To allow for future expansion, the Polygon parameter takes an array
     * of linear rings, which is represented as an array of arrays of arrays of doubles (
     * <code>[[[double, double], ...], ...]</code>).
     * </p>
     * <p>
     * A linear ring for use in geofences can consist of between 4 and 1,000 vertices.
     * </p>
     */
    private java.util.List<java.util.List<java.util.List<Double>>> polygon;

    /**
     * <p>
     * A circle on the earth, as defined by a center point and a radius.
     * </p>
     * 
     * @param circle
     *        A circle on the earth, as defined by a center point and a radius.
     */

    public void setCircle(Circle circle) {
        this.circle = circle;
    }

    /**
     * <p>
     * A circle on the earth, as defined by a center point and a radius.
     * </p>
     * 
     * @return A circle on the earth, as defined by a center point and a radius.
     */

    public Circle getCircle() {
        return this.circle;
    }

    /**
     * <p>
     * A circle on the earth, as defined by a center point and a radius.
     * </p>
     * 
     * @param circle
     *        A circle on the earth, as defined by a center point and a radius.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeofenceGeometry withCircle(Circle circle) {
        setCircle(circle);
        return this;
    }

    /**
     * <p>
     * A polygon is a list of linear rings which are each made up of a list of vertices.
     * </p>
     * <p>
     * Each vertex is a 2-dimensional point of the form: <code>[longitude, latitude]</code>. This is represented as an
     * array of doubles of length 2 (so <code>[double, double]</code>).
     * </p>
     * <p>
     * An array of 4 or more vertices, where the first and last vertex are the same (to form a closed boundary), is
     * called a linear ring. The linear ring vertices must be listed in counter-clockwise order around the ring’s
     * interior. The linear ring is represented as an array of vertices, or an array of arrays of doubles (
     * <code>[[double, double], ...]</code>).
     * </p>
     * <p>
     * A geofence consists of a single linear ring. To allow for future expansion, the Polygon parameter takes an array
     * of linear rings, which is represented as an array of arrays of arrays of doubles (
     * <code>[[[double, double], ...], ...]</code>).
     * </p>
     * <p>
     * A linear ring for use in geofences can consist of between 4 and 1,000 vertices.
     * </p>
     * 
     * @return A polygon is a list of linear rings which are each made up of a list of vertices.</p>
     *         <p>
     *         Each vertex is a 2-dimensional point of the form: <code>[longitude, latitude]</code>. This is represented
     *         as an array of doubles of length 2 (so <code>[double, double]</code>).
     *         </p>
     *         <p>
     *         An array of 4 or more vertices, where the first and last vertex are the same (to form a closed boundary),
     *         is called a linear ring. The linear ring vertices must be listed in counter-clockwise order around the
     *         ring’s interior. The linear ring is represented as an array of vertices, or an array of arrays of doubles
     *         (<code>[[double, double], ...]</code>).
     *         </p>
     *         <p>
     *         A geofence consists of a single linear ring. To allow for future expansion, the Polygon parameter takes
     *         an array of linear rings, which is represented as an array of arrays of arrays of doubles (
     *         <code>[[[double, double], ...], ...]</code>).
     *         </p>
     *         <p>
     *         A linear ring for use in geofences can consist of between 4 and 1,000 vertices.
     */

    public java.util.List<java.util.List<java.util.List<Double>>> getPolygon() {
        return polygon;
    }

    /**
     * <p>
     * A polygon is a list of linear rings which are each made up of a list of vertices.
     * </p>
     * <p>
     * Each vertex is a 2-dimensional point of the form: <code>[longitude, latitude]</code>. This is represented as an
     * array of doubles of length 2 (so <code>[double, double]</code>).
     * </p>
     * <p>
     * An array of 4 or more vertices, where the first and last vertex are the same (to form a closed boundary), is
     * called a linear ring. The linear ring vertices must be listed in counter-clockwise order around the ring’s
     * interior. The linear ring is represented as an array of vertices, or an array of arrays of doubles (
     * <code>[[double, double], ...]</code>).
     * </p>
     * <p>
     * A geofence consists of a single linear ring. To allow for future expansion, the Polygon parameter takes an array
     * of linear rings, which is represented as an array of arrays of arrays of doubles (
     * <code>[[[double, double], ...], ...]</code>).
     * </p>
     * <p>
     * A linear ring for use in geofences can consist of between 4 and 1,000 vertices.
     * </p>
     * 
     * @param polygon
     *        A polygon is a list of linear rings which are each made up of a list of vertices.</p>
     *        <p>
     *        Each vertex is a 2-dimensional point of the form: <code>[longitude, latitude]</code>. This is represented
     *        as an array of doubles of length 2 (so <code>[double, double]</code>).
     *        </p>
     *        <p>
     *        An array of 4 or more vertices, where the first and last vertex are the same (to form a closed boundary),
     *        is called a linear ring. The linear ring vertices must be listed in counter-clockwise order around the
     *        ring’s interior. The linear ring is represented as an array of vertices, or an array of arrays of doubles
     *        (<code>[[double, double], ...]</code>).
     *        </p>
     *        <p>
     *        A geofence consists of a single linear ring. To allow for future expansion, the Polygon parameter takes an
     *        array of linear rings, which is represented as an array of arrays of arrays of doubles (
     *        <code>[[[double, double], ...], ...]</code>).
     *        </p>
     *        <p>
     *        A linear ring for use in geofences can consist of between 4 and 1,000 vertices.
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
     * A polygon is a list of linear rings which are each made up of a list of vertices.
     * </p>
     * <p>
     * Each vertex is a 2-dimensional point of the form: <code>[longitude, latitude]</code>. This is represented as an
     * array of doubles of length 2 (so <code>[double, double]</code>).
     * </p>
     * <p>
     * An array of 4 or more vertices, where the first and last vertex are the same (to form a closed boundary), is
     * called a linear ring. The linear ring vertices must be listed in counter-clockwise order around the ring’s
     * interior. The linear ring is represented as an array of vertices, or an array of arrays of doubles (
     * <code>[[double, double], ...]</code>).
     * </p>
     * <p>
     * A geofence consists of a single linear ring. To allow for future expansion, the Polygon parameter takes an array
     * of linear rings, which is represented as an array of arrays of arrays of doubles (
     * <code>[[[double, double], ...], ...]</code>).
     * </p>
     * <p>
     * A linear ring for use in geofences can consist of between 4 and 1,000 vertices.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPolygon(java.util.Collection)} or {@link #withPolygon(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param polygon
     *        A polygon is a list of linear rings which are each made up of a list of vertices.</p>
     *        <p>
     *        Each vertex is a 2-dimensional point of the form: <code>[longitude, latitude]</code>. This is represented
     *        as an array of doubles of length 2 (so <code>[double, double]</code>).
     *        </p>
     *        <p>
     *        An array of 4 or more vertices, where the first and last vertex are the same (to form a closed boundary),
     *        is called a linear ring. The linear ring vertices must be listed in counter-clockwise order around the
     *        ring’s interior. The linear ring is represented as an array of vertices, or an array of arrays of doubles
     *        (<code>[[double, double], ...]</code>).
     *        </p>
     *        <p>
     *        A geofence consists of a single linear ring. To allow for future expansion, the Polygon parameter takes an
     *        array of linear rings, which is represented as an array of arrays of arrays of doubles (
     *        <code>[[[double, double], ...], ...]</code>).
     *        </p>
     *        <p>
     *        A linear ring for use in geofences can consist of between 4 and 1,000 vertices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeofenceGeometry withPolygon(java.util.List<java.util.List<Double>>... polygon) {
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
     * A polygon is a list of linear rings which are each made up of a list of vertices.
     * </p>
     * <p>
     * Each vertex is a 2-dimensional point of the form: <code>[longitude, latitude]</code>. This is represented as an
     * array of doubles of length 2 (so <code>[double, double]</code>).
     * </p>
     * <p>
     * An array of 4 or more vertices, where the first and last vertex are the same (to form a closed boundary), is
     * called a linear ring. The linear ring vertices must be listed in counter-clockwise order around the ring’s
     * interior. The linear ring is represented as an array of vertices, or an array of arrays of doubles (
     * <code>[[double, double], ...]</code>).
     * </p>
     * <p>
     * A geofence consists of a single linear ring. To allow for future expansion, the Polygon parameter takes an array
     * of linear rings, which is represented as an array of arrays of arrays of doubles (
     * <code>[[[double, double], ...], ...]</code>).
     * </p>
     * <p>
     * A linear ring for use in geofences can consist of between 4 and 1,000 vertices.
     * </p>
     * 
     * @param polygon
     *        A polygon is a list of linear rings which are each made up of a list of vertices.</p>
     *        <p>
     *        Each vertex is a 2-dimensional point of the form: <code>[longitude, latitude]</code>. This is represented
     *        as an array of doubles of length 2 (so <code>[double, double]</code>).
     *        </p>
     *        <p>
     *        An array of 4 or more vertices, where the first and last vertex are the same (to form a closed boundary),
     *        is called a linear ring. The linear ring vertices must be listed in counter-clockwise order around the
     *        ring’s interior. The linear ring is represented as an array of vertices, or an array of arrays of doubles
     *        (<code>[[double, double], ...]</code>).
     *        </p>
     *        <p>
     *        A geofence consists of a single linear ring. To allow for future expansion, the Polygon parameter takes an
     *        array of linear rings, which is represented as an array of arrays of arrays of doubles (
     *        <code>[[[double, double], ...], ...]</code>).
     *        </p>
     *        <p>
     *        A linear ring for use in geofences can consist of between 4 and 1,000 vertices.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeofenceGeometry withPolygon(java.util.Collection<java.util.List<java.util.List<Double>>> polygon) {
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
        if (getCircle() != null)
            sb.append("Circle: ").append("***Sensitive Data Redacted***").append(",");
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

        if (obj instanceof GeofenceGeometry == false)
            return false;
        GeofenceGeometry other = (GeofenceGeometry) obj;
        if (other.getCircle() == null ^ this.getCircle() == null)
            return false;
        if (other.getCircle() != null && other.getCircle().equals(this.getCircle()) == false)
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

        hashCode = prime * hashCode + ((getCircle() == null) ? 0 : getCircle().hashCode());
        hashCode = prime * hashCode + ((getPolygon() == null) ? 0 : getPolygon().hashCode());
        return hashCode;
    }

    @Override
    public GeofenceGeometry clone() {
        try {
            return (GeofenceGeometry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.GeofenceGeometryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
