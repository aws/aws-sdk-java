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
 * Location data for the endpoint.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/pinpoint-2016-12-01/EndpointLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EndpointLocation implements Serializable, Cloneable, StructuredPojo {

    /** The city where the endpoint is located. */
    private String city;
    /**
     * The two-letter code for the country or region of the endpoint. Specified as an ISO 3166-1 alpha-2 code, such as
     * "US" for the United States.
     */
    private String country;
    /** The latitude of the endpoint location, rounded to one decimal place. */
    private Double latitude;
    /** The longitude of the endpoint location, rounded to one decimal place. */
    private Double longitude;
    /** The postal code or zip code of the endpoint. */
    private String postalCode;
    /** The region of the endpoint location. For example, in the United States, this corresponds to a state. */
    private String region;

    /**
     * The city where the endpoint is located.
     * 
     * @param city
     *        The city where the endpoint is located.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * The city where the endpoint is located.
     * 
     * @return The city where the endpoint is located.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * The city where the endpoint is located.
     * 
     * @param city
     *        The city where the endpoint is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointLocation withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * The two-letter code for the country or region of the endpoint. Specified as an ISO 3166-1 alpha-2 code, such as
     * "US" for the United States.
     * 
     * @param country
     *        The two-letter code for the country or region of the endpoint. Specified as an ISO 3166-1 alpha-2 code,
     *        such as "US" for the United States.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * The two-letter code for the country or region of the endpoint. Specified as an ISO 3166-1 alpha-2 code, such as
     * "US" for the United States.
     * 
     * @return The two-letter code for the country or region of the endpoint. Specified as an ISO 3166-1 alpha-2 code,
     *         such as "US" for the United States.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * The two-letter code for the country or region of the endpoint. Specified as an ISO 3166-1 alpha-2 code, such as
     * "US" for the United States.
     * 
     * @param country
     *        The two-letter code for the country or region of the endpoint. Specified as an ISO 3166-1 alpha-2 code,
     *        such as "US" for the United States.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointLocation withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * The latitude of the endpoint location, rounded to one decimal place.
     * 
     * @param latitude
     *        The latitude of the endpoint location, rounded to one decimal place.
     */

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * The latitude of the endpoint location, rounded to one decimal place.
     * 
     * @return The latitude of the endpoint location, rounded to one decimal place.
     */

    public Double getLatitude() {
        return this.latitude;
    }

    /**
     * The latitude of the endpoint location, rounded to one decimal place.
     * 
     * @param latitude
     *        The latitude of the endpoint location, rounded to one decimal place.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointLocation withLatitude(Double latitude) {
        setLatitude(latitude);
        return this;
    }

    /**
     * The longitude of the endpoint location, rounded to one decimal place.
     * 
     * @param longitude
     *        The longitude of the endpoint location, rounded to one decimal place.
     */

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * The longitude of the endpoint location, rounded to one decimal place.
     * 
     * @return The longitude of the endpoint location, rounded to one decimal place.
     */

    public Double getLongitude() {
        return this.longitude;
    }

    /**
     * The longitude of the endpoint location, rounded to one decimal place.
     * 
     * @param longitude
     *        The longitude of the endpoint location, rounded to one decimal place.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointLocation withLongitude(Double longitude) {
        setLongitude(longitude);
        return this;
    }

    /**
     * The postal code or zip code of the endpoint.
     * 
     * @param postalCode
     *        The postal code or zip code of the endpoint.
     */

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * The postal code or zip code of the endpoint.
     * 
     * @return The postal code or zip code of the endpoint.
     */

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * The postal code or zip code of the endpoint.
     * 
     * @param postalCode
     *        The postal code or zip code of the endpoint.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EndpointLocation withPostalCode(String postalCode) {
        setPostalCode(postalCode);
        return this;
    }

    /**
     * The region of the endpoint location. For example, in the United States, this corresponds to a state.
     * 
     * @param region
     *        The region of the endpoint location. For example, in the United States, this corresponds to a state.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * The region of the endpoint location. For example, in the United States, this corresponds to a state.
     * 
     * @return The region of the endpoint location. For example, in the United States, this corresponds to a state.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * The region of the endpoint location. For example, in the United States, this corresponds to a state.
     * 
     * @param region
     *        The region of the endpoint location. For example, in the United States, this corresponds to a state.
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
