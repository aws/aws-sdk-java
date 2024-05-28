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
 * Information about a location impacted by a health event in Amazon CloudWatch Internet Monitor.
 * </p>
 * <p>
 * Geographic regions are hierarchically categorized into country, subdivision, metro and city geographic granularities.
 * The geographic region is identified based on the IP address used at the client locations.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/internetmonitor-2021-06-03/ImpactedLocation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ImpactedLocation implements Serializable, Cloneable, StructuredPojo {

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
     * The name of the country where the health event is located.
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
     * The name of the city where the health event is located.
     * </p>
     */
    private String city;
    /**
     * <p>
     * The latitude where the health event is located.
     * </p>
     */
    private Double latitude;
    /**
     * <p>
     * The longitude where the health event is located.
     * </p>
     */
    private Double longitude;
    /**
     * <p>
     * The country code where the health event is located. The ISO 3166-2 codes for the country is provided, when
     * available.
     * </p>
     */
    private String countryCode;
    /**
     * <p>
     * The subdivision code where the health event is located. The ISO 3166-2 codes for country subdivisions is
     * provided, when available.
     * </p>
     */
    private String subdivisionCode;
    /**
     * <p>
     * The service location where the health event is located.
     * </p>
     */
    private String serviceLocation;
    /**
     * <p>
     * The status of the health event at an impacted location.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The cause of the impairment. There are two types of network impairments: Amazon Web Services network issues or
     * internet issues. Internet issues are typically a problem with a network provider, like an internet service
     * provider (ISP).
     * </p>
     */
    private NetworkImpairment causedBy;
    /**
     * <p>
     * The calculated health at a specific location.
     * </p>
     */
    private InternetHealth internetHealth;
    /**
     * <p>
     * The IPv4 prefixes at the client location that was impacted by the health event.
     * </p>
     */
    private java.util.List<String> ipv4Prefixes;

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

    public ImpactedLocation withASName(String aSName) {
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

    public ImpactedLocation withASNumber(Long aSNumber) {
        setASNumber(aSNumber);
        return this;
    }

    /**
     * <p>
     * The name of the country where the health event is located.
     * </p>
     * 
     * @param country
     *        The name of the country where the health event is located.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * The name of the country where the health event is located.
     * </p>
     * 
     * @return The name of the country where the health event is located.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * The name of the country where the health event is located.
     * </p>
     * 
     * @param country
     *        The name of the country where the health event is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpactedLocation withCountry(String country) {
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

    public ImpactedLocation withSubdivision(String subdivision) {
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

    public ImpactedLocation withMetro(String metro) {
        setMetro(metro);
        return this;
    }

    /**
     * <p>
     * The name of the city where the health event is located.
     * </p>
     * 
     * @param city
     *        The name of the city where the health event is located.
     */

    public void setCity(String city) {
        this.city = city;
    }

    /**
     * <p>
     * The name of the city where the health event is located.
     * </p>
     * 
     * @return The name of the city where the health event is located.
     */

    public String getCity() {
        return this.city;
    }

    /**
     * <p>
     * The name of the city where the health event is located.
     * </p>
     * 
     * @param city
     *        The name of the city where the health event is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpactedLocation withCity(String city) {
        setCity(city);
        return this;
    }

    /**
     * <p>
     * The latitude where the health event is located.
     * </p>
     * 
     * @param latitude
     *        The latitude where the health event is located.
     */

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    /**
     * <p>
     * The latitude where the health event is located.
     * </p>
     * 
     * @return The latitude where the health event is located.
     */

    public Double getLatitude() {
        return this.latitude;
    }

    /**
     * <p>
     * The latitude where the health event is located.
     * </p>
     * 
     * @param latitude
     *        The latitude where the health event is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpactedLocation withLatitude(Double latitude) {
        setLatitude(latitude);
        return this;
    }

    /**
     * <p>
     * The longitude where the health event is located.
     * </p>
     * 
     * @param longitude
     *        The longitude where the health event is located.
     */

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    /**
     * <p>
     * The longitude where the health event is located.
     * </p>
     * 
     * @return The longitude where the health event is located.
     */

    public Double getLongitude() {
        return this.longitude;
    }

    /**
     * <p>
     * The longitude where the health event is located.
     * </p>
     * 
     * @param longitude
     *        The longitude where the health event is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpactedLocation withLongitude(Double longitude) {
        setLongitude(longitude);
        return this;
    }

    /**
     * <p>
     * The country code where the health event is located. The ISO 3166-2 codes for the country is provided, when
     * available.
     * </p>
     * 
     * @param countryCode
     *        The country code where the health event is located. The ISO 3166-2 codes for the country is provided, when
     *        available.
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * The country code where the health event is located. The ISO 3166-2 codes for the country is provided, when
     * available.
     * </p>
     * 
     * @return The country code where the health event is located. The ISO 3166-2 codes for the country is provided,
     *         when available.
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * <p>
     * The country code where the health event is located. The ISO 3166-2 codes for the country is provided, when
     * available.
     * </p>
     * 
     * @param countryCode
     *        The country code where the health event is located. The ISO 3166-2 codes for the country is provided, when
     *        available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpactedLocation withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * <p>
     * The subdivision code where the health event is located. The ISO 3166-2 codes for country subdivisions is
     * provided, when available.
     * </p>
     * 
     * @param subdivisionCode
     *        The subdivision code where the health event is located. The ISO 3166-2 codes for country subdivisions is
     *        provided, when available.
     */

    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    /**
     * <p>
     * The subdivision code where the health event is located. The ISO 3166-2 codes for country subdivisions is
     * provided, when available.
     * </p>
     * 
     * @return The subdivision code where the health event is located. The ISO 3166-2 codes for country subdivisions is
     *         provided, when available.
     */

    public String getSubdivisionCode() {
        return this.subdivisionCode;
    }

    /**
     * <p>
     * The subdivision code where the health event is located. The ISO 3166-2 codes for country subdivisions is
     * provided, when available.
     * </p>
     * 
     * @param subdivisionCode
     *        The subdivision code where the health event is located. The ISO 3166-2 codes for country subdivisions is
     *        provided, when available.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpactedLocation withSubdivisionCode(String subdivisionCode) {
        setSubdivisionCode(subdivisionCode);
        return this;
    }

    /**
     * <p>
     * The service location where the health event is located.
     * </p>
     * 
     * @param serviceLocation
     *        The service location where the health event is located.
     */

    public void setServiceLocation(String serviceLocation) {
        this.serviceLocation = serviceLocation;
    }

    /**
     * <p>
     * The service location where the health event is located.
     * </p>
     * 
     * @return The service location where the health event is located.
     */

    public String getServiceLocation() {
        return this.serviceLocation;
    }

    /**
     * <p>
     * The service location where the health event is located.
     * </p>
     * 
     * @param serviceLocation
     *        The service location where the health event is located.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpactedLocation withServiceLocation(String serviceLocation) {
        setServiceLocation(serviceLocation);
        return this;
    }

    /**
     * <p>
     * The status of the health event at an impacted location.
     * </p>
     * 
     * @param status
     *        The status of the health event at an impacted location.
     * @see HealthEventStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the health event at an impacted location.
     * </p>
     * 
     * @return The status of the health event at an impacted location.
     * @see HealthEventStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the health event at an impacted location.
     * </p>
     * 
     * @param status
     *        The status of the health event at an impacted location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthEventStatus
     */

    public ImpactedLocation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the health event at an impacted location.
     * </p>
     * 
     * @param status
     *        The status of the health event at an impacted location.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HealthEventStatus
     */

    public ImpactedLocation withStatus(HealthEventStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The cause of the impairment. There are two types of network impairments: Amazon Web Services network issues or
     * internet issues. Internet issues are typically a problem with a network provider, like an internet service
     * provider (ISP).
     * </p>
     * 
     * @param causedBy
     *        The cause of the impairment. There are two types of network impairments: Amazon Web Services network
     *        issues or internet issues. Internet issues are typically a problem with a network provider, like an
     *        internet service provider (ISP).
     */

    public void setCausedBy(NetworkImpairment causedBy) {
        this.causedBy = causedBy;
    }

    /**
     * <p>
     * The cause of the impairment. There are two types of network impairments: Amazon Web Services network issues or
     * internet issues. Internet issues are typically a problem with a network provider, like an internet service
     * provider (ISP).
     * </p>
     * 
     * @return The cause of the impairment. There are two types of network impairments: Amazon Web Services network
     *         issues or internet issues. Internet issues are typically a problem with a network provider, like an
     *         internet service provider (ISP).
     */

    public NetworkImpairment getCausedBy() {
        return this.causedBy;
    }

    /**
     * <p>
     * The cause of the impairment. There are two types of network impairments: Amazon Web Services network issues or
     * internet issues. Internet issues are typically a problem with a network provider, like an internet service
     * provider (ISP).
     * </p>
     * 
     * @param causedBy
     *        The cause of the impairment. There are two types of network impairments: Amazon Web Services network
     *        issues or internet issues. Internet issues are typically a problem with a network provider, like an
     *        internet service provider (ISP).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpactedLocation withCausedBy(NetworkImpairment causedBy) {
        setCausedBy(causedBy);
        return this;
    }

    /**
     * <p>
     * The calculated health at a specific location.
     * </p>
     * 
     * @param internetHealth
     *        The calculated health at a specific location.
     */

    public void setInternetHealth(InternetHealth internetHealth) {
        this.internetHealth = internetHealth;
    }

    /**
     * <p>
     * The calculated health at a specific location.
     * </p>
     * 
     * @return The calculated health at a specific location.
     */

    public InternetHealth getInternetHealth() {
        return this.internetHealth;
    }

    /**
     * <p>
     * The calculated health at a specific location.
     * </p>
     * 
     * @param internetHealth
     *        The calculated health at a specific location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpactedLocation withInternetHealth(InternetHealth internetHealth) {
        setInternetHealth(internetHealth);
        return this;
    }

    /**
     * <p>
     * The IPv4 prefixes at the client location that was impacted by the health event.
     * </p>
     * 
     * @return The IPv4 prefixes at the client location that was impacted by the health event.
     */

    public java.util.List<String> getIpv4Prefixes() {
        return ipv4Prefixes;
    }

    /**
     * <p>
     * The IPv4 prefixes at the client location that was impacted by the health event.
     * </p>
     * 
     * @param ipv4Prefixes
     *        The IPv4 prefixes at the client location that was impacted by the health event.
     */

    public void setIpv4Prefixes(java.util.Collection<String> ipv4Prefixes) {
        if (ipv4Prefixes == null) {
            this.ipv4Prefixes = null;
            return;
        }

        this.ipv4Prefixes = new java.util.ArrayList<String>(ipv4Prefixes);
    }

    /**
     * <p>
     * The IPv4 prefixes at the client location that was impacted by the health event.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setIpv4Prefixes(java.util.Collection)} or {@link #withIpv4Prefixes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ipv4Prefixes
     *        The IPv4 prefixes at the client location that was impacted by the health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpactedLocation withIpv4Prefixes(String... ipv4Prefixes) {
        if (this.ipv4Prefixes == null) {
            setIpv4Prefixes(new java.util.ArrayList<String>(ipv4Prefixes.length));
        }
        for (String ele : ipv4Prefixes) {
            this.ipv4Prefixes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The IPv4 prefixes at the client location that was impacted by the health event.
     * </p>
     * 
     * @param ipv4Prefixes
     *        The IPv4 prefixes at the client location that was impacted by the health event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ImpactedLocation withIpv4Prefixes(java.util.Collection<String> ipv4Prefixes) {
        setIpv4Prefixes(ipv4Prefixes);
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
            sb.append("Longitude: ").append(getLongitude()).append(",");
        if (getCountryCode() != null)
            sb.append("CountryCode: ").append(getCountryCode()).append(",");
        if (getSubdivisionCode() != null)
            sb.append("SubdivisionCode: ").append(getSubdivisionCode()).append(",");
        if (getServiceLocation() != null)
            sb.append("ServiceLocation: ").append(getServiceLocation()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCausedBy() != null)
            sb.append("CausedBy: ").append(getCausedBy()).append(",");
        if (getInternetHealth() != null)
            sb.append("InternetHealth: ").append(getInternetHealth()).append(",");
        if (getIpv4Prefixes() != null)
            sb.append("Ipv4Prefixes: ").append(getIpv4Prefixes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ImpactedLocation == false)
            return false;
        ImpactedLocation other = (ImpactedLocation) obj;
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
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getSubdivisionCode() == null ^ this.getSubdivisionCode() == null)
            return false;
        if (other.getSubdivisionCode() != null && other.getSubdivisionCode().equals(this.getSubdivisionCode()) == false)
            return false;
        if (other.getServiceLocation() == null ^ this.getServiceLocation() == null)
            return false;
        if (other.getServiceLocation() != null && other.getServiceLocation().equals(this.getServiceLocation()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCausedBy() == null ^ this.getCausedBy() == null)
            return false;
        if (other.getCausedBy() != null && other.getCausedBy().equals(this.getCausedBy()) == false)
            return false;
        if (other.getInternetHealth() == null ^ this.getInternetHealth() == null)
            return false;
        if (other.getInternetHealth() != null && other.getInternetHealth().equals(this.getInternetHealth()) == false)
            return false;
        if (other.getIpv4Prefixes() == null ^ this.getIpv4Prefixes() == null)
            return false;
        if (other.getIpv4Prefixes() != null && other.getIpv4Prefixes().equals(this.getIpv4Prefixes()) == false)
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
        hashCode = prime * hashCode + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode + ((getSubdivisionCode() == null) ? 0 : getSubdivisionCode().hashCode());
        hashCode = prime * hashCode + ((getServiceLocation() == null) ? 0 : getServiceLocation().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCausedBy() == null) ? 0 : getCausedBy().hashCode());
        hashCode = prime * hashCode + ((getInternetHealth() == null) ? 0 : getInternetHealth().hashCode());
        hashCode = prime * hashCode + ((getIpv4Prefixes() == null) ? 0 : getIpv4Prefixes().hashCode());
        return hashCode;
    }

    @Override
    public ImpactedLocation clone() {
        try {
            return (ImpactedLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.internetmonitor.model.transform.ImpactedLocationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
