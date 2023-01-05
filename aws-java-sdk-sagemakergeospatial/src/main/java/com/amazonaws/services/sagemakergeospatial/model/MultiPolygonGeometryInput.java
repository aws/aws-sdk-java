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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/MultiPolygonGeometryInput"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MultiPolygonGeometryInput implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The coordinates of the multipolygon geometry.
     * </p>
     */
    private java.util.List<java.util.List<java.util.List<java.util.List<Double>>>> coordinates;

    /**
     * <p>
     * The coordinates of the multipolygon geometry.
     * </p>
     * 
     * @return The coordinates of the multipolygon geometry.
     */

    public java.util.List<java.util.List<java.util.List<java.util.List<Double>>>> getCoordinates() {
        return coordinates;
    }

    /**
     * <p>
     * The coordinates of the multipolygon geometry.
     * </p>
     * 
     * @param coordinates
     *        The coordinates of the multipolygon geometry.
     */

    public void setCoordinates(java.util.Collection<java.util.List<java.util.List<java.util.List<Double>>>> coordinates) {
        if (coordinates == null) {
            this.coordinates = null;
            return;
        }

        this.coordinates = new java.util.ArrayList<java.util.List<java.util.List<java.util.List<Double>>>>(coordinates);
    }

    /**
     * <p>
     * The coordinates of the multipolygon geometry.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCoordinates(java.util.Collection)} or {@link #withCoordinates(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param coordinates
     *        The coordinates of the multipolygon geometry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiPolygonGeometryInput withCoordinates(java.util.List<java.util.List<java.util.List<Double>>>... coordinates) {
        if (this.coordinates == null) {
            setCoordinates(new java.util.ArrayList<java.util.List<java.util.List<java.util.List<Double>>>>(coordinates.length));
        }
        for (java.util.List<java.util.List<java.util.List<Double>>> ele : coordinates) {
            this.coordinates.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The coordinates of the multipolygon geometry.
     * </p>
     * 
     * @param coordinates
     *        The coordinates of the multipolygon geometry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MultiPolygonGeometryInput withCoordinates(java.util.Collection<java.util.List<java.util.List<java.util.List<Double>>>> coordinates) {
        setCoordinates(coordinates);
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
        if (getCoordinates() != null)
            sb.append("Coordinates: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MultiPolygonGeometryInput == false)
            return false;
        MultiPolygonGeometryInput other = (MultiPolygonGeometryInput) obj;
        if (other.getCoordinates() == null ^ this.getCoordinates() == null)
            return false;
        if (other.getCoordinates() != null && other.getCoordinates().equals(this.getCoordinates()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCoordinates() == null) ? 0 : getCoordinates().hashCode());
        return hashCode;
    }

    @Override
    public MultiPolygonGeometryInput clone() {
        try {
            return (MultiPolygonGeometryInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.MultiPolygonGeometryInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
