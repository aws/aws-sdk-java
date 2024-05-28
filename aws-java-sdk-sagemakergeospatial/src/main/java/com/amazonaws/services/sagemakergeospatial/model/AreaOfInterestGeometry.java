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
package com.amazonaws.services.sagemakergeospatial.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A GeoJSON object representing the geographic extent in the coordinate space.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-geospatial-2020-05-27/AreaOfInterestGeometry"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AreaOfInterestGeometry implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The structure representing the MultiPolygon Geometry.
     * </p>
     */
    private MultiPolygonGeometryInput multiPolygonGeometry;
    /**
     * <p>
     * The structure representing Polygon Geometry.
     * </p>
     */
    private PolygonGeometryInput polygonGeometry;

    /**
     * <p>
     * The structure representing the MultiPolygon Geometry.
     * </p>
     * 
     * @param multiPolygonGeometry
     *        The structure representing the MultiPolygon Geometry.
     */

    public void setMultiPolygonGeometry(MultiPolygonGeometryInput multiPolygonGeometry) {
        this.multiPolygonGeometry = multiPolygonGeometry;
    }

    /**
     * <p>
     * The structure representing the MultiPolygon Geometry.
     * </p>
     * 
     * @return The structure representing the MultiPolygon Geometry.
     */

    public MultiPolygonGeometryInput getMultiPolygonGeometry() {
        return this.multiPolygonGeometry;
    }

    /**
     * <p>
     * The structure representing the MultiPolygon Geometry.
     * </p>
     * 
     * @param multiPolygonGeometry
     *        The structure representing the MultiPolygon Geometry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AreaOfInterestGeometry withMultiPolygonGeometry(MultiPolygonGeometryInput multiPolygonGeometry) {
        setMultiPolygonGeometry(multiPolygonGeometry);
        return this;
    }

    /**
     * <p>
     * The structure representing Polygon Geometry.
     * </p>
     * 
     * @param polygonGeometry
     *        The structure representing Polygon Geometry.
     */

    public void setPolygonGeometry(PolygonGeometryInput polygonGeometry) {
        this.polygonGeometry = polygonGeometry;
    }

    /**
     * <p>
     * The structure representing Polygon Geometry.
     * </p>
     * 
     * @return The structure representing Polygon Geometry.
     */

    public PolygonGeometryInput getPolygonGeometry() {
        return this.polygonGeometry;
    }

    /**
     * <p>
     * The structure representing Polygon Geometry.
     * </p>
     * 
     * @param polygonGeometry
     *        The structure representing Polygon Geometry.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AreaOfInterestGeometry withPolygonGeometry(PolygonGeometryInput polygonGeometry) {
        setPolygonGeometry(polygonGeometry);
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
        if (getMultiPolygonGeometry() != null)
            sb.append("MultiPolygonGeometry: ").append(getMultiPolygonGeometry()).append(",");
        if (getPolygonGeometry() != null)
            sb.append("PolygonGeometry: ").append(getPolygonGeometry());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AreaOfInterestGeometry == false)
            return false;
        AreaOfInterestGeometry other = (AreaOfInterestGeometry) obj;
        if (other.getMultiPolygonGeometry() == null ^ this.getMultiPolygonGeometry() == null)
            return false;
        if (other.getMultiPolygonGeometry() != null && other.getMultiPolygonGeometry().equals(this.getMultiPolygonGeometry()) == false)
            return false;
        if (other.getPolygonGeometry() == null ^ this.getPolygonGeometry() == null)
            return false;
        if (other.getPolygonGeometry() != null && other.getPolygonGeometry().equals(this.getPolygonGeometry()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMultiPolygonGeometry() == null) ? 0 : getMultiPolygonGeometry().hashCode());
        hashCode = prime * hashCode + ((getPolygonGeometry() == null) ? 0 : getPolygonGeometry().hashCode());
        return hashCode;
    }

    @Override
    public AreaOfInterestGeometry clone() {
        try {
            return (AreaOfInterestGeometry) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakergeospatial.model.transform.AreaOfInterestGeometryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
