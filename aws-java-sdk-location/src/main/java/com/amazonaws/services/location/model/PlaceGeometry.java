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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Places uses a point geometry to specify a location or a Place.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/PlaceGeometry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PlaceGeometry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A single point geometry specifies a location for a Place using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>x</i> — Specifies the x coordinate or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>y</i> — Specifies the y coordinate or latitude.
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<Double> point;

    /**
     * <p>
     * A single point geometry specifies a location for a Place using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>x</i> — Specifies the x coordinate or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>y</i> — Specifies the y coordinate or latitude.
     * </p>
     * </li>
     * </ul>
     * 
     * @return A single point geometry specifies a location for a Place using <a
     *         href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <i>x</i> — Specifies the x coordinate or longitude.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <i>y</i> — Specifies the y coordinate or latitude.
     *         </p>
     *         </li>
     */

    public java.util.List<Double> getPoint() {
        return point;
    }

    /**
     * <p>
     * A single point geometry specifies a location for a Place using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>x</i> — Specifies the x coordinate or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>y</i> — Specifies the y coordinate or latitude.
     * </p>
     * </li>
     * </ul>
     * 
     * @param point
     *        A single point geometry specifies a location for a Place using <a
     *        href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>x</i> — Specifies the x coordinate or longitude.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>y</i> — Specifies the y coordinate or latitude.
     *        </p>
     *        </li>
     */

    public void setPoint(java.util.Collection<Double> point) {
        if (point == null) {
            this.point = null;
            return;
        }

        this.point = new java.util.ArrayList<Double>(point);
    }

    /**
     * <p>
     * A single point geometry specifies a location for a Place using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>x</i> — Specifies the x coordinate or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>y</i> — Specifies the y coordinate or latitude.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPoint(java.util.Collection)} or {@link #withPoint(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param point
     *        A single point geometry specifies a location for a Place using <a
     *        href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>x</i> — Specifies the x coordinate or longitude.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>y</i> — Specifies the y coordinate or latitude.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlaceGeometry withPoint(Double... point) {
        if (this.point == null) {
            setPoint(new java.util.ArrayList<Double>(point.length));
        }
        for (Double ele : point) {
            this.point.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A single point geometry specifies a location for a Place using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <i>x</i> — Specifies the x coordinate or longitude.
     * </p>
     * </li>
     * <li>
     * <p>
     * <i>y</i> — Specifies the y coordinate or latitude.
     * </p>
     * </li>
     * </ul>
     * 
     * @param point
     *        A single point geometry specifies a location for a Place using <a
     *        href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <i>x</i> — Specifies the x coordinate or longitude.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <i>y</i> — Specifies the y coordinate or latitude.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PlaceGeometry withPoint(java.util.Collection<Double> point) {
        setPoint(point);
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
        if (getPoint() != null)
            sb.append("Point: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PlaceGeometry == false)
            return false;
        PlaceGeometry other = (PlaceGeometry) obj;
        if (other.getPoint() == null ^ this.getPoint() == null)
            return false;
        if (other.getPoint() != null && other.getPoint().equals(this.getPoint()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPoint() == null) ? 0 : getPoint().hashCode());
        return hashCode;
    }

    @Override
    public PlaceGeometry clone() {
        try {
            return (PlaceGeometry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.PlaceGeometryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
