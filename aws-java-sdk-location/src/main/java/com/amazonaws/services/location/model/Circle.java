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
 * A circle on the earth, as defined by a center point and a radius.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/Circle" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Circle implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A single point geometry, specifying the center of the circle, using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates, in the form
     * <code>[longitude, latitude]</code>.
     * </p>
     */
    private java.util.List<Double> center;
    /**
     * <p>
     * The radius of the circle in meters. Must be greater than zero and no larger than 100,000 (100 kilometers).
     * </p>
     */
    private Double radius;

    /**
     * <p>
     * A single point geometry, specifying the center of the circle, using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates, in the form
     * <code>[longitude, latitude]</code>.
     * </p>
     * 
     * @return A single point geometry, specifying the center of the circle, using <a
     *         href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates, in the form
     *         <code>[longitude, latitude]</code>.
     */

    public java.util.List<Double> getCenter() {
        return center;
    }

    /**
     * <p>
     * A single point geometry, specifying the center of the circle, using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates, in the form
     * <code>[longitude, latitude]</code>.
     * </p>
     * 
     * @param center
     *        A single point geometry, specifying the center of the circle, using <a
     *        href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates, in the form
     *        <code>[longitude, latitude]</code>.
     */

    public void setCenter(java.util.Collection<Double> center) {
        if (center == null) {
            this.center = null;
            return;
        }

        this.center = new java.util.ArrayList<Double>(center);
    }

    /**
     * <p>
     * A single point geometry, specifying the center of the circle, using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates, in the form
     * <code>[longitude, latitude]</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCenter(java.util.Collection)} or {@link #withCenter(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param center
     *        A single point geometry, specifying the center of the circle, using <a
     *        href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates, in the form
     *        <code>[longitude, latitude]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Circle withCenter(Double... center) {
        if (this.center == null) {
            setCenter(new java.util.ArrayList<Double>(center.length));
        }
        for (Double ele : center) {
            this.center.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A single point geometry, specifying the center of the circle, using <a
     * href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates, in the form
     * <code>[longitude, latitude]</code>.
     * </p>
     * 
     * @param center
     *        A single point geometry, specifying the center of the circle, using <a
     *        href="https://gisgeography.com/wgs84-world-geodetic-system/">WGS 84</a> coordinates, in the form
     *        <code>[longitude, latitude]</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Circle withCenter(java.util.Collection<Double> center) {
        setCenter(center);
        return this;
    }

    /**
     * <p>
     * The radius of the circle in meters. Must be greater than zero and no larger than 100,000 (100 kilometers).
     * </p>
     * 
     * @param radius
     *        The radius of the circle in meters. Must be greater than zero and no larger than 100,000 (100 kilometers).
     */

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    /**
     * <p>
     * The radius of the circle in meters. Must be greater than zero and no larger than 100,000 (100 kilometers).
     * </p>
     * 
     * @return The radius of the circle in meters. Must be greater than zero and no larger than 100,000 (100
     *         kilometers).
     */

    public Double getRadius() {
        return this.radius;
    }

    /**
     * <p>
     * The radius of the circle in meters. Must be greater than zero and no larger than 100,000 (100 kilometers).
     * </p>
     * 
     * @param radius
     *        The radius of the circle in meters. Must be greater than zero and no larger than 100,000 (100 kilometers).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Circle withRadius(Double radius) {
        setRadius(radius);
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
        if (getCenter() != null)
            sb.append("Center: ").append("***Sensitive Data Redacted***").append(",");
        if (getRadius() != null)
            sb.append("Radius: ").append(getRadius());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Circle == false)
            return false;
        Circle other = (Circle) obj;
        if (other.getCenter() == null ^ this.getCenter() == null)
            return false;
        if (other.getCenter() != null && other.getCenter().equals(this.getCenter()) == false)
            return false;
        if (other.getRadius() == null ^ this.getRadius() == null)
            return false;
        if (other.getRadius() != null && other.getRadius().equals(this.getRadius()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCenter() == null) ? 0 : getCenter().hashCode());
        hashCode = prime * hashCode + ((getRadius() == null) ? 0 : getRadius().hashCode());
        return hashCode;
    }

    @Override
    public Circle clone() {
        try {
            return (Circle) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.CircleMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
