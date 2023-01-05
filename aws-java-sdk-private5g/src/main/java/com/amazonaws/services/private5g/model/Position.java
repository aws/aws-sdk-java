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
package com.amazonaws.services.private5g.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a position.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/privatenetworks-2021-12-03/Position" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Position implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The elevation of the equipment at this position.
     * </p>
     */
    private Double elevation;
    /**
     * <p>
     * The reference point from which elevation is reported.
     * </p>
     */
    private String elevationReference;
    /**
     * <p>
     * The units used to measure the elevation of the position.
     * </p>
     */
    private String elevationUnit;
    /**
     * <p>
     * The latitude of the position.
     * </p>
     */
    private Double latitude;
    /**
     * <p>
     * The longitude of the position.
     * </p>
     */
    private Double longitude;

    /**
     * <p>
     * The elevation of the equipment at this position.
     * </p>
     * 
     * @param elevation
     *        The elevation of the equipment at this position.
     */

    public void setElevation(Double elevation) {
        this.elevation = elevation;
    }

    /**
     * <p>
     * The elevation of the equipment at this position.
     * </p>
     * 
     * @return The elevation of the equipment at this position.
     */

    public Double getElevation() {
        return this.elevation;
    }

    /**
     * <p>
     * The elevation of the equipment at this position.
     * </p>
     * 
     * @param elevation
     *        The elevation of the equipment at this position.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Position withElevation(Double elevation) {
        setElevation(elevation);
        return this;
    }

    /**
     * <p>
     * The reference point from which elevation is reported.
     * </p>
     * 
     * @param elevationReference
     *        The reference point from which elevation is reported.
     * @see ElevationReference
     */

    public void setElevationReference(String elevationReference) {
        this.elevationReference = elevationReference;
    }

    /**
     * <p>
     * The reference point from which elevation is reported.
     * </p>
     * 
     * @return The reference point from which elevation is reported.
     * @see ElevationReference
     */

    public String getElevationReference() {
        return this.elevationReference;
    }

    /**
     * <p>
     * The reference point from which elevation is reported.
     * </p>
     * 
     * @param elevationReference
     *        The reference point from which elevation is reported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElevationReference
     */

    public Position withElevationReference(String elevationReference) {
        setElevationReference(elevationReference);
        return this;
    }

    /**
     * <p>
     * The reference point from which elevation is reported.
     * </p>
     * 
     * @param elevationReference
     *        The reference point from which elevation is reported.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElevationReference
     */

    public Position withElevationReference(ElevationReference elevationReference) {
        this.elevationReference = elevationReference.toString();
        return this;
    }

    /**
     * <p>
     * The units used to measure the elevation of the position.
     * </p>
     * 
     * @param elevationUnit
     *        The units used to measure the elevation of the position.
     * @see ElevationUnit
     */

    public void setElevationUnit(String elevationUnit) {
        this.elevationUnit = elevationUnit;
    }

    /**
     * <p>
     * The units used to measure the elevation of the position.
     * </p>
     * 
     * @return The units used to measure the elevation of the position.
     * @see ElevationUnit
     */

    public String getElevationUnit() {
        return this.elevationUnit;
    }

    /**
     * <p>
     * The units used to measure the elevation of the position.
     * </p>
     * 
     * @param elevationUnit
     *        The units used to measure the elevation of the position.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElevationUnit
     */

    public Position withElevationUnit(String elevationUnit) {
        setElevationUnit(elevationUnit);
        return this;
    }

    /**
     * <p>
     * The units used to measure the elevation of the position.
     * </p>
     * 
     * @param elevationUnit
     *        The units used to measure the elevation of the position.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ElevationUnit
     */

    public Position withElevationUnit(ElevationUnit elevationUnit) {
        this.elevationUnit = elevationUnit.toString();
        return this;
    }

    /**
     * <p>
     * The latitude of the position.
     * </p>
     * 
     * @param latitude
     *        The latitude of the position.
     */

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * <p>
     * The latitude of the position.
     * </p>
     * 
     * @return The latitude of the position.
     */

    public Double getLatitude() {
        return this.latitude;
    }

    /**
     * <p>
     * The latitude of the position.
     * </p>
     * 
     * @param latitude
     *        The latitude of the position.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Position withLatitude(Double latitude) {
        setLatitude(latitude);
        return this;
    }

    /**
     * <p>
     * The longitude of the position.
     * </p>
     * 
     * @param longitude
     *        The longitude of the position.
     */

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * <p>
     * The longitude of the position.
     * </p>
     * 
     * @return The longitude of the position.
     */

    public Double getLongitude() {
        return this.longitude;
    }

    /**
     * <p>
     * The longitude of the position.
     * </p>
     * 
     * @param longitude
     *        The longitude of the position.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Position withLongitude(Double longitude) {
        setLongitude(longitude);
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
        if (getElevation() != null)
            sb.append("Elevation: ").append(getElevation()).append(",");
        if (getElevationReference() != null)
            sb.append("ElevationReference: ").append(getElevationReference()).append(",");
        if (getElevationUnit() != null)
            sb.append("ElevationUnit: ").append(getElevationUnit()).append(",");
        if (getLatitude() != null)
            sb.append("Latitude: ").append(getLatitude()).append(",");
        if (getLongitude() != null)
            sb.append("Longitude: ").append(getLongitude());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Position == false)
            return false;
        Position other = (Position) obj;
        if (other.getElevation() == null ^ this.getElevation() == null)
            return false;
        if (other.getElevation() != null && other.getElevation().equals(this.getElevation()) == false)
            return false;
        if (other.getElevationReference() == null ^ this.getElevationReference() == null)
            return false;
        if (other.getElevationReference() != null && other.getElevationReference().equals(this.getElevationReference()) == false)
            return false;
        if (other.getElevationUnit() == null ^ this.getElevationUnit() == null)
            return false;
        if (other.getElevationUnit() != null && other.getElevationUnit().equals(this.getElevationUnit()) == false)
            return false;
        if (other.getLatitude() == null ^ this.getLatitude() == null)
            return false;
        if (other.getLatitude() != null && other.getLatitude().equals(this.getLatitude()) == false)
            return false;
        if (other.getLongitude() == null ^ this.getLongitude() == null)
            return false;
        if (other.getLongitude() != null && other.getLongitude().equals(this.getLongitude()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getElevation() == null) ? 0 : getElevation().hashCode());
        hashCode = prime * hashCode + ((getElevationReference() == null) ? 0 : getElevationReference().hashCode());
        hashCode = prime * hashCode + ((getElevationUnit() == null) ? 0 : getElevationUnit().hashCode());
        hashCode = prime * hashCode + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        hashCode = prime * hashCode + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        return hashCode;
    }

    @Override
    public Position clone() {
        try {
            return (Position) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.private5g.model.transform.PositionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
