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
 * Contains the geometry details for each path between a pair of positions. Used in plotting a route leg on a map.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/LegGeometry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LegGeometry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * An ordered list of positions used to plot a route on a map.
     * </p>
     * <p>
     * The first position is closest to the start position for the leg, and the last position is the closest to the end
     * position for the leg.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.List<java.util.List<Double>> lineString;

    /**
     * <p>
     * An ordered list of positions used to plot a route on a map.
     * </p>
     * <p>
     * The first position is closest to the start position for the leg, and the last position is the closest to the end
     * position for the leg.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return An ordered list of positions used to plot a route on a map. </p>
     *         <p>
     *         The first position is closest to the start position for the leg, and the last position is the closest to
     *         the end position for the leg.
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         For example, <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     *         </p>
     *         </li>
     */

    public java.util.List<java.util.List<Double>> getLineString() {
        return lineString;
    }

    /**
     * <p>
     * An ordered list of positions used to plot a route on a map.
     * </p>
     * <p>
     * The first position is closest to the start position for the leg, and the last position is the closest to the end
     * position for the leg.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param lineString
     *        An ordered list of positions used to plot a route on a map. </p>
     *        <p>
     *        The first position is closest to the start position for the leg, and the last position is the closest to
     *        the end position for the leg.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     *        </p>
     *        </li>
     */

    public void setLineString(java.util.Collection<java.util.List<Double>> lineString) {
        if (lineString == null) {
            this.lineString = null;
            return;
        }

        this.lineString = new java.util.ArrayList<java.util.List<Double>>(lineString);
    }

    /**
     * <p>
     * An ordered list of positions used to plot a route on a map.
     * </p>
     * <p>
     * The first position is closest to the start position for the leg, and the last position is the closest to the end
     * position for the leg.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLineString(java.util.Collection)} or {@link #withLineString(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param lineString
     *        An ordered list of positions used to plot a route on a map. </p>
     *        <p>
     *        The first position is closest to the start position for the leg, and the last position is the closest to
     *        the end position for the leg.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LegGeometry withLineString(java.util.List<Double>... lineString) {
        if (this.lineString == null) {
            setLineString(new java.util.ArrayList<java.util.List<Double>>(lineString.length));
        }
        for (java.util.List<Double> ele : lineString) {
            this.lineString.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An ordered list of positions used to plot a route on a map.
     * </p>
     * <p>
     * The first position is closest to the start position for the leg, and the last position is the closest to the end
     * position for the leg.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For example, <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param lineString
     *        An ordered list of positions used to plot a route on a map. </p>
     *        <p>
     *        The first position is closest to the start position for the leg, and the last position is the closest to
     *        the end position for the leg.
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        For example, <code>[[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LegGeometry withLineString(java.util.Collection<java.util.List<Double>> lineString) {
        setLineString(lineString);
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
        if (getLineString() != null)
            sb.append("LineString: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LegGeometry == false)
            return false;
        LegGeometry other = (LegGeometry) obj;
        if (other.getLineString() == null ^ this.getLineString() == null)
            return false;
        if (other.getLineString() != null && other.getLineString().equals(this.getLineString()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLineString() == null) ? 0 : getLineString().hashCode());
        return hashCode;
    }

    @Override
    public LegGeometry clone() {
        try {
            return (LegGeometry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.LegGeometryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
