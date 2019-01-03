/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.devicefarm.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Represents a latitude and longitude pair, expressed in geographic coordinate system degrees (for example 47.6204,
 * -122.3491).
 * </p>
 * <p>
 * Elevation is currently not supported.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/devicefarm-2015-06-23/Location" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Location implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The latitude.
     * </p>
     */
    private Double latitude;
    /**
     * <p>
     * The longitude.
     * </p>
     */
    private Double longitude;

    /**
     * <p>
     * The latitude.
     * </p>
     * 
     * @param latitude
     *        The latitude.
     */

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * <p>
     * The latitude.
     * </p>
     * 
     * @return The latitude.
     */

    public Double getLatitude() {
        return this.latitude;
    }

    /**
     * <p>
     * The latitude.
     * </p>
     * 
     * @param latitude
     *        The latitude.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withLatitude(Double latitude) {
        setLatitude(latitude);
        return this;
    }

    /**
     * <p>
     * The longitude.
     * </p>
     * 
     * @param longitude
     *        The longitude.
     */

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * <p>
     * The longitude.
     * </p>
     * 
     * @return The longitude.
     */

    public Double getLongitude() {
        return this.longitude;
    }

    /**
     * <p>
     * The longitude.
     * </p>
     * 
     * @param longitude
     *        The longitude.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Location withLongitude(Double longitude) {
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

        if (obj instanceof Location == false)
            return false;
        Location other = (Location) obj;
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

        hashCode = prime * hashCode + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        hashCode = prime * hashCode + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        return hashCode;
    }

    @Override
    public Location clone() {
        try {
            return (Location) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.devicefarm.model.transform.LocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
