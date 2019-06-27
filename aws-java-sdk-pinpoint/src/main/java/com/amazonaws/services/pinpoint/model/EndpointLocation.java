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
package com.amazonaws.services.pinpoint.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies geographic information about an endpoint.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EndpointLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the city where the endpoint is located.
     * </p>
     */
    private String city;
    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the endpoint is located.
     * For example, US for the United States.
     * </p>
     */
    private String country;
    /**
     * <p>
     * The latitude coordinate of the endpoint location, rounded to one decimal place.
     * </p>
     */
    private Double latitude;
    /**
     * <p>
     * The longitude coordinate of the endpoint location, rounded to one decimal place.
     * </p>
     */
    private Double longitude;
    /**
     * <p>
     * The postal or ZIP code for the area where the endpoint is located.
     * </p>
     */
    private String postalCode;
    /**
     * <p>
     * The name of the region where the endpoint is located. For locations in the United States, this value is the name
     * of a state.
     * </p>
     */
    private String region;

    /**
     * <p>
     * The name of the city where the endpoint is located.
     * </p>
     * 
     * @param city
     *        The name of the city where the endpoint is located.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The name of the city where the endpoint is located.
     * </p>
     * 
     * @return The name of the city where the endpoint is located.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The name of the city where the endpoint is located.
     * </p>
     * 
     * @param city
     *        The name of the city where the endpoint is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointLocation withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the endpoint is located.
     * For example, US for the United States.
     * </p>
     * 
     * @param country
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the endpoint is
     *        located. For example, US for the United States.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the endpoint is located.
     * For example, US for the United States.
     * </p>
     * 
     * @return The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the endpoint is
     *         located. For example, US for the United States.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the endpoint is located.
     * For example, US for the United States.
     * </p>
     * 
     * @param country
     *        The two-character code, in ISO 3166-1 alpha-2 format, for the country or region where the endpoint is
     *        located. For example, US for the United States.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointLocation withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * The latitude coordinate of the endpoint location, rounded to one decimal place.
     * </p>
     * 
     * @param latitude
     *        The latitude coordinate of the endpoint location, rounded to one decimal place.
     */

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * <p>
     * The latitude coordinate of the endpoint location, rounded to one decimal place.
     * </p>
     * 
     * @return The latitude coordinate of the endpoint location, rounded to one decimal place.
     */

    public Double getLatitude() {
        return this.latitude;
    }

    /**
     * <p>
     * The latitude coordinate of the endpoint location, rounded to one decimal place.
     * </p>
     * 
     * @param latitude
     *        The latitude coordinate of the endpoint location, rounded to one decimal place.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointLocation withLatitude(Double latitude) {
        setLatitude(latitude);
        return this;
    }

    /**
     * <p>
     * The longitude coordinate of the endpoint location, rounded to one decimal place.
     * </p>
     * 
     * @param longitude
     *        The longitude coordinate of the endpoint location, rounded to one decimal place.
     */

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * <p>
     * The longitude coordinate of the endpoint location, rounded to one decimal place.
     * </p>
     * 
     * @return The longitude coordinate of the endpoint location, rounded to one decimal place.
     */

    public Double getLongitude() {
        return this.longitude;
    }

    /**
     * <p>
     * The longitude coordinate of the endpoint location, rounded to one decimal place.
     * </p>
     * 
     * @param longitude
     *        The longitude coordinate of the endpoint location, rounded to one decimal place.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointLocation withLongitude(Double longitude) {
        setLongitude(longitude);
        return this;
    }

    /**
     * <p>
     * The postal or ZIP code for the area where the endpoint is located.
     * </p>
     * 
     * @param postalCode
     *        The postal or ZIP code for the area where the endpoint is located.
     */

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * <p>
     * The postal or ZIP code for the area where the endpoint is located.
     * </p>
     * 
     * @return The postal or ZIP code for the area where the endpoint is located.
     */

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * <p>
     * The postal or ZIP code for the area where the endpoint is located.
     * </p>
     * 
     * @param postalCode
     *        The postal or ZIP code for the area where the endpoint is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointLocation withPostalCode(String postalCode) {
        setPostalCode(postalCode);
        return this;
    }

    /**
     * <p>
     * The name of the region where the endpoint is located. For locations in the United States, this value is the name
     * of a state.
     * </p>
     * 
     * @param region
     *        The name of the region where the endpoint is located. For locations in the United States, this value is
     *        the name of a state.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The name of the region where the endpoint is located. For locations in the United States, this value is the name
     * of a state.
     * </p>
     * 
     * @return The name of the region where the endpoint is located. For locations in the United States, this value is
     *         the name of a state.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The name of the region where the endpoint is located. For locations in the United States, this value is the name
     * of a state.
     * </p>
     * 
     * @param region
     *        The name of the region where the endpoint is located. For locations in the United States, this value is
     *        the name of a state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointLocation withRegion(String region) {
        setRegion(region);
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
        if (getCity() != null)
            sb.append("City: ").append(getCity()).append(",");
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry()).append(",");
        if (getLatitude() != null)
            sb.append("Latitude: ").append(getLatitude()).append(",");
        if (getLongitude() != null)
            sb.append("Longitude: ").append(getLongitude()).append(",");
        if (getPostalCode() != null)
            sb.append("PostalCode: ").append(getPostalCode()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EndpointLocation == false)
            return false;
        EndpointLocation other = (EndpointLocation) obj;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getLatitude() == null ^ this.getLatitude() == null)
            return false;
        if (other.getLatitude() != null && other.getLatitude().equals(this.getLatitude()) == false)
            return false;
        if (other.getLongitude() == null ^ this.getLongitude() == null)
            return false;
        if (other.getLongitude() != null && other.getLongitude().equals(this.getLongitude()) == false)
            return false;
        if (other.getPostalCode() == null ^ this.getPostalCode() == null)
            return false;
        if (other.getPostalCode() != null && other.getPostalCode().equals(this.getPostalCode()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        hashCode = prime * hashCode + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        hashCode = prime * hashCode + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        return hashCode;
    }

    @Override
    public EndpointLocation clone() {
        try {
            return (EndpointLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.pinpoint.model.transform.EndpointLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
