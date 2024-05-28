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
package com.amazonaws.services.internetmonitor.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The impacted location, such as a city, that Amazon Web Services clients access application resources from.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ClientLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ClientLocation implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the internet service provider (ISP) or network (ASN).
     * </p>
     */
    private String aSName;
    /**
     * <p>
     * The Autonomous System Number (ASN) of the network at an impacted location.
     * </p>
     */
    private Long aSNumber;
    /**
     * <p>
     * The name of the country where the internet event is located.
     * </p>
     */
    private String country;
    /**
     * <p>
     * The subdivision location where the health event is located. The subdivision usually maps to states in most
     * countries (including the United States). For United Kingdom, it maps to a country (England, Scotland, Wales) or
     * province (Northern Ireland).
     * </p>
     */
    private String subdivision;
    /**
     * <p>
     * The metro area where the health event is located.
     * </p>
     * <p>
     * Metro indicates a metropolitan region in the United States, such as the region around New York City. In non-US
     * countries, this is a second-level subdivision. For example, in the United Kingdom, it could be a county, a London
     * borough, a unitary authority, council area, and so on.
     * </p>
     */
    private String metro;
    /**
     * <p>
     * The name of the city where the internet event is located.
     * </p>
     */
    private String city;
    /**
     * <p>
     * The latitude where the internet event is located.
     * </p>
     */
    private Double latitude;
    /**
     * <p>
     * The longitude where the internet event is located.
     * </p>
     */
    private Double longitude;

    /**
     * <p>
     * The name of the internet service provider (ISP) or network (ASN).
     * </p>
     * 
     * @param aSName
     *        The name of the internet service provider (ISP) or network (ASN).
     */

    public void setASName(String aSName) {
        this.aSName = aSName;
    }

    /**
     * <p>
     * The name of the internet service provider (ISP) or network (ASN).
     * </p>
     * 
     * @return The name of the internet service provider (ISP) or network (ASN).
     */

    public String getASName() {
        return this.aSName;
    }

    /**
     * <p>
     * The name of the internet service provider (ISP) or network (ASN).
     * </p>
     * 
     * @param aSName
     *        The name of the internet service provider (ISP) or network (ASN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientLocation withASName(String aSName) {
        setASName(aSName);
        return this;
    }

    /**
     * <p>
     * The Autonomous System Number (ASN) of the network at an impacted location.
     * </p>
     * 
     * @param aSNumber
     *        The Autonomous System Number (ASN) of the network at an impacted location.
     */

    public void setASNumber(Long aSNumber) {
        this.aSNumber = aSNumber;
    }

    /**
     * <p>
     * The Autonomous System Number (ASN) of the network at an impacted location.
     * </p>
     * 
     * @return The Autonomous System Number (ASN) of the network at an impacted location.
     */

    public Long getASNumber() {
        return this.aSNumber;
    }

    /**
     * <p>
     * The Autonomous System Number (ASN) of the network at an impacted location.
     * </p>
     * 
     * @param aSNumber
     *        The Autonomous System Number (ASN) of the network at an impacted location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientLocation withASNumber(Long aSNumber) {
        setASNumber(aSNumber);
        return this;
    }

    /**
     * <p>
     * The name of the country where the internet event is located.
     * </p>
     * 
     * @param country
     *        The name of the country where the internet event is located.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The name of the country where the internet event is located.
     * </p>
     * 
     * @return The name of the country where the internet event is located.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The name of the country where the internet event is located.
     * </p>
     * 
     * @param country
     *        The name of the country where the internet event is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientLocation withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * <p>
     * The subdivision location where the health event is located. The subdivision usually maps to states in most
     * countries (including the United States). For United Kingdom, it maps to a country (England, Scotland, Wales) or
     * province (Northern Ireland).
     * </p>
     * 
     * @param subdivision
     *        The subdivision location where the health event is located. The subdivision usually maps to states in most
     *        countries (including the United States). For United Kingdom, it maps to a country (England, Scotland,
     *        Wales) or province (Northern Ireland).
     */

    public void setSubdivision(String subdivision) {
        this.subdivision = subdivision;
    }

    /**
     * <p>
     * The subdivision location where the health event is located. The subdivision usually maps to states in most
     * countries (including the United States). For United Kingdom, it maps to a country (England, Scotland, Wales) or
     * province (Northern Ireland).
     * </p>
     * 
     * @return The subdivision location where the health event is located. The subdivision usually maps to states in
     *         most countries (including the United States). For United Kingdom, it maps to a country (England,
     *         Scotland, Wales) or province (Northern Ireland).
     */

    public String getSubdivision() {
        return this.subdivision;
    }

    /**
     * <p>
     * The subdivision location where the health event is located. The subdivision usually maps to states in most
     * countries (including the United States). For United Kingdom, it maps to a country (England, Scotland, Wales) or
     * province (Northern Ireland).
     * </p>
     * 
     * @param subdivision
     *        The subdivision location where the health event is located. The subdivision usually maps to states in most
     *        countries (including the United States). For United Kingdom, it maps to a country (England, Scotland,
     *        Wales) or province (Northern Ireland).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientLocation withSubdivision(String subdivision) {
        setSubdivision(subdivision);
        return this;
    }

    /**
     * <p>
     * The metro area where the health event is located.
     * </p>
     * <p>
     * Metro indicates a metropolitan region in the United States, such as the region around New York City. In non-US
     * countries, this is a second-level subdivision. For example, in the United Kingdom, it could be a county, a London
     * borough, a unitary authority, council area, and so on.
     * </p>
     * 
     * @param metro
     *        The metro area where the health event is located.</p>
     *        <p>
     *        Metro indicates a metropolitan region in the United States, such as the region around New York City. In
     *        non-US countries, this is a second-level subdivision. For example, in the United Kingdom, it could be a
     *        county, a London borough, a unitary authority, council area, and so on.
     */

    public void setMetro(String metro) {
        this.metro = metro;
    }

    /**
     * <p>
     * The metro area where the health event is located.
     * </p>
     * <p>
     * Metro indicates a metropolitan region in the United States, such as the region around New York City. In non-US
     * countries, this is a second-level subdivision. For example, in the United Kingdom, it could be a county, a London
     * borough, a unitary authority, council area, and so on.
     * </p>
     * 
     * @return The metro area where the health event is located.</p>
     *         <p>
     *         Metro indicates a metropolitan region in the United States, such as the region around New York City. In
     *         non-US countries, this is a second-level subdivision. For example, in the United Kingdom, it could be a
     *         county, a London borough, a unitary authority, council area, and so on.
     */

    public String getMetro() {
        return this.metro;
    }

    /**
     * <p>
     * The metro area where the health event is located.
     * </p>
     * <p>
     * Metro indicates a metropolitan region in the United States, such as the region around New York City. In non-US
     * countries, this is a second-level subdivision. For example, in the United Kingdom, it could be a county, a London
     * borough, a unitary authority, council area, and so on.
     * </p>
     * 
     * @param metro
     *        The metro area where the health event is located.</p>
     *        <p>
     *        Metro indicates a metropolitan region in the United States, such as the region around New York City. In
     *        non-US countries, this is a second-level subdivision. For example, in the United Kingdom, it could be a
     *        county, a London borough, a unitary authority, council area, and so on.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientLocation withMetro(String metro) {
        setMetro(metro);
        return this;
    }

    /**
     * <p>
     * The name of the city where the internet event is located.
     * </p>
     * 
     * @param city
     *        The name of the city where the internet event is located.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The name of the city where the internet event is located.
     * </p>
     * 
     * @return The name of the city where the internet event is located.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The name of the city where the internet event is located.
     * </p>
     * 
     * @param city
     *        The name of the city where the internet event is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientLocation withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The latitude where the internet event is located.
     * </p>
     * 
     * @param latitude
     *        The latitude where the internet event is located.
     */

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * <p>
     * The latitude where the internet event is located.
     * </p>
     * 
     * @return The latitude where the internet event is located.
     */

    public Double getLatitude() {
        return this.latitude;
    }

    /**
     * <p>
     * The latitude where the internet event is located.
     * </p>
     * 
     * @param latitude
     *        The latitude where the internet event is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientLocation withLatitude(Double latitude) {
        setLatitude(latitude);
        return this;
    }

    /**
     * <p>
     * The longitude where the internet event is located.
     * </p>
     * 
     * @param longitude
     *        The longitude where the internet event is located.
     */

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * <p>
     * The longitude where the internet event is located.
     * </p>
     * 
     * @return The longitude where the internet event is located.
     */

    public Double getLongitude() {
        return this.longitude;
    }

    /**
     * <p>
     * The longitude where the internet event is located.
     * </p>
     * 
     * @param longitude
     *        The longitude where the internet event is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ClientLocation withLongitude(Double longitude) {
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
        if (getASName() != null)
            sb.append("ASName: ").append(getASName()).append(",");
        if (getASNumber() != null)
            sb.append("ASNumber: ").append(getASNumber()).append(",");
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry()).append(",");
        if (getSubdivision() != null)
            sb.append("Subdivision: ").append(getSubdivision()).append(",");
        if (getMetro() != null)
            sb.append("Metro: ").append(getMetro()).append(",");
        if (getCity() != null)
            sb.append("City: ").append(getCity()).append(",");
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

        if (obj instanceof ClientLocation == false)
            return false;
        ClientLocation other = (ClientLocation) obj;
        if (other.getASName() == null ^ this.getASName() == null)
            return false;
        if (other.getASName() != null && other.getASName().equals(this.getASName()) == false)
            return false;
        if (other.getASNumber() == null ^ this.getASNumber() == null)
            return false;
        if (other.getASNumber() != null && other.getASNumber().equals(this.getASNumber()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getSubdivision() == null ^ this.getSubdivision() == null)
            return false;
        if (other.getSubdivision() != null && other.getSubdivision().equals(this.getSubdivision()) == false)
            return false;
        if (other.getMetro() == null ^ this.getMetro() == null)
            return false;
        if (other.getMetro() != null && other.getMetro().equals(this.getMetro()) == false)
            return false;
        if (other.getCity() == null ^ this.getCity() == null)
            return false;
        if (other.getCity() != null && other.getCity().equals(this.getCity()) == false)
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

        hashCode = prime * hashCode + ((getASName() == null) ? 0 : getASName().hashCode());
        hashCode = prime * hashCode + ((getASNumber() == null) ? 0 : getASNumber().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getSubdivision() == null) ? 0 : getSubdivision().hashCode());
        hashCode = prime * hashCode + ((getMetro() == null) ? 0 : getMetro().hashCode());
        hashCode = prime * hashCode + ((getCity() == null) ? 0 : getCity().hashCode());
        hashCode = prime * hashCode + ((getLatitude() == null) ? 0 : getLatitude().hashCode());
        hashCode = prime * hashCode + ((getLongitude() == null) ? 0 : getLongitude().hashCode());
        return hashCode;
    }

    @Override
    public ClientLocation clone() {
        try {
            return (ClientLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.ClientLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
