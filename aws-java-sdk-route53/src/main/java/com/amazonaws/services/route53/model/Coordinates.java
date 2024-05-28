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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that lists the coordinates for a geoproximity resource record.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/Coordinates" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Coordinates implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies a coordinate of the north–south position of a geographic point on the surface of the Earth (-90 - 90).
     * </p>
     */
    private String latitude;
    /**
     * <p>
     * Specifies a coordinate of the east–west position of a geographic point on the surface of the Earth (-180 - 180).
     * </p>
     */
    private String longitude;

    /**
     * <p>
     * Specifies a coordinate of the north–south position of a geographic point on the surface of the Earth (-90 - 90).
     * </p>
     * 
     * @param latitude
     *        Specifies a coordinate of the north–south position of a geographic point on the surface of the Earth (-90
     *        - 90).
     */

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * <p>
     * Specifies a coordinate of the north–south position of a geographic point on the surface of the Earth (-90 - 90).
     * </p>
     * 
     * @return Specifies a coordinate of the north–south position of a geographic point on the surface of the Earth (-90
     *         - 90).
     */

    public String getLatitude() {
        return this.latitude;
    }

    /**
     * <p>
     * Specifies a coordinate of the north–south position of a geographic point on the surface of the Earth (-90 - 90).
     * </p>
     * 
     * @param latitude
     *        Specifies a coordinate of the north–south position of a geographic point on the surface of the Earth (-90
     *        - 90).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Coordinates withLatitude(String latitude) {
        setLatitude(latitude);
        return this;
    }

    /**
     * <p>
     * Specifies a coordinate of the east–west position of a geographic point on the surface of the Earth (-180 - 180).
     * </p>
     * 
     * @param longitude
     *        Specifies a coordinate of the east–west position of a geographic point on the surface of the Earth (-180 -
     *        180).
     */

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    /**
     * <p>
     * Specifies a coordinate of the east–west position of a geographic point on the surface of the Earth (-180 - 180).
     * </p>
     * 
     * @return Specifies a coordinate of the east–west position of a geographic point on the surface of the Earth (-180
     *         - 180).
     */

    public String getLongitude() {
        return this.longitude;
    }

    /**
     * <p>
     * Specifies a coordinate of the east–west position of a geographic point on the surface of the Earth (-180 - 180).
     * </p>
     * 
     * @param longitude
     *        Specifies a coordinate of the east–west position of a geographic point on the surface of the Earth (-180 -
     *        180).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Coordinates withLongitude(String longitude) {
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

        if (obj instanceof Coordinates == false)
            return false;
        Coordinates other = (Coordinates) obj;
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
    public Coordinates clone() {
        try {
            return (Coordinates) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
