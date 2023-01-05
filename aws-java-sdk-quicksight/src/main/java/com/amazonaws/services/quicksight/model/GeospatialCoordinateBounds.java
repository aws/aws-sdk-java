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
package com.amazonaws.services.quicksight.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The bound options (north, south, west, east) of the geospatial window options.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/quicksight-2018-04-01/GeospatialCoordinateBounds"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeospatialCoordinateBounds implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The latitude of the north bound of the geospatial coordinate bounds.
     * </p>
     */
    private Double north;
    /**
     * <p>
     * The latitude of the south bound of the geospatial coordinate bounds.
     * </p>
     */
    private Double south;
    /**
     * <p>
     * The longitude of the west bound of the geospatial coordinate bounds.
     * </p>
     */
    private Double west;
    /**
     * <p>
     * The longitude of the east bound of the geospatial coordinate bounds.
     * </p>
     */
    private Double east;

    /**
     * <p>
     * The latitude of the north bound of the geospatial coordinate bounds.
     * </p>
     * 
     * @param north
     *        The latitude of the north bound of the geospatial coordinate bounds.
     */

    public void setNorth(Double north) {
        this.north = north;
    }

    /**
     * <p>
     * The latitude of the north bound of the geospatial coordinate bounds.
     * </p>
     * 
     * @return The latitude of the north bound of the geospatial coordinate bounds.
     */

    public Double getNorth() {
        return this.north;
    }

    /**
     * <p>
     * The latitude of the north bound of the geospatial coordinate bounds.
     * </p>
     * 
     * @param north
     *        The latitude of the north bound of the geospatial coordinate bounds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialCoordinateBounds withNorth(Double north) {
        setNorth(north);
        return this;
    }

    /**
     * <p>
     * The latitude of the south bound of the geospatial coordinate bounds.
     * </p>
     * 
     * @param south
     *        The latitude of the south bound of the geospatial coordinate bounds.
     */

    public void setSouth(Double south) {
        this.south = south;
    }

    /**
     * <p>
     * The latitude of the south bound of the geospatial coordinate bounds.
     * </p>
     * 
     * @return The latitude of the south bound of the geospatial coordinate bounds.
     */

    public Double getSouth() {
        return this.south;
    }

    /**
     * <p>
     * The latitude of the south bound of the geospatial coordinate bounds.
     * </p>
     * 
     * @param south
     *        The latitude of the south bound of the geospatial coordinate bounds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialCoordinateBounds withSouth(Double south) {
        setSouth(south);
        return this;
    }

    /**
     * <p>
     * The longitude of the west bound of the geospatial coordinate bounds.
     * </p>
     * 
     * @param west
     *        The longitude of the west bound of the geospatial coordinate bounds.
     */

    public void setWest(Double west) {
        this.west = west;
    }

    /**
     * <p>
     * The longitude of the west bound of the geospatial coordinate bounds.
     * </p>
     * 
     * @return The longitude of the west bound of the geospatial coordinate bounds.
     */

    public Double getWest() {
        return this.west;
    }

    /**
     * <p>
     * The longitude of the west bound of the geospatial coordinate bounds.
     * </p>
     * 
     * @param west
     *        The longitude of the west bound of the geospatial coordinate bounds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialCoordinateBounds withWest(Double west) {
        setWest(west);
        return this;
    }

    /**
     * <p>
     * The longitude of the east bound of the geospatial coordinate bounds.
     * </p>
     * 
     * @param east
     *        The longitude of the east bound of the geospatial coordinate bounds.
     */

    public void setEast(Double east) {
        this.east = east;
    }

    /**
     * <p>
     * The longitude of the east bound of the geospatial coordinate bounds.
     * </p>
     * 
     * @return The longitude of the east bound of the geospatial coordinate bounds.
     */

    public Double getEast() {
        return this.east;
    }

    /**
     * <p>
     * The longitude of the east bound of the geospatial coordinate bounds.
     * </p>
     * 
     * @param east
     *        The longitude of the east bound of the geospatial coordinate bounds.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeospatialCoordinateBounds withEast(Double east) {
        setEast(east);
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
        if (getNorth() != null)
            sb.append("North: ").append(getNorth()).append(",");
        if (getSouth() != null)
            sb.append("South: ").append(getSouth()).append(",");
        if (getWest() != null)
            sb.append("West: ").append(getWest()).append(",");
        if (getEast() != null)
            sb.append("East: ").append(getEast());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeospatialCoordinateBounds == false)
            return false;
        GeospatialCoordinateBounds other = (GeospatialCoordinateBounds) obj;
        if (other.getNorth() == null ^ this.getNorth() == null)
            return false;
        if (other.getNorth() != null && other.getNorth().equals(this.getNorth()) == false)
            return false;
        if (other.getSouth() == null ^ this.getSouth() == null)
            return false;
        if (other.getSouth() != null && other.getSouth().equals(this.getSouth()) == false)
            return false;
        if (other.getWest() == null ^ this.getWest() == null)
            return false;
        if (other.getWest() != null && other.getWest().equals(this.getWest()) == false)
            return false;
        if (other.getEast() == null ^ this.getEast() == null)
            return false;
        if (other.getEast() != null && other.getEast().equals(this.getEast()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNorth() == null) ? 0 : getNorth().hashCode());
        hashCode = prime * hashCode + ((getSouth() == null) ? 0 : getSouth().hashCode());
        hashCode = prime * hashCode + ((getWest() == null) ? 0 : getWest().hashCode());
        hashCode = prime * hashCode + ((getEast() == null) ? 0 : getEast().hashCode());
        return hashCode;
    }

    @Override
    public GeospatialCoordinateBounds clone() {
        try {
            return (GeospatialCoordinateBounds) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.quicksight.model.transform.GeospatialCoordinateBoundsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
