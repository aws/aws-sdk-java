/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.location.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about addresses or points of interest that match the search criteria.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/location-2020-11-19/Place" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Place implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The numerical portion of an address, such as a building number.
     * </p>
     */
    private String addressNumber;
    /**
     * <p>
     * A country/region specified using <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit
     * country/region code. For example, <code>CAN</code>.
     * </p>
     */
    private String country;

    private PlaceGeometry geometry;
    /**
     * <p>
     * The full name and address of the point of interest such as a city, region, or country. For example,
     * <code>123 Any Street, Any Town, USA</code>.
     * </p>
     */
    private String label;
    /**
     * <p>
     * A name for a local area, such as a city or town name. For example, <code>Toronto</code>.
     * </p>
     */
    private String municipality;
    /**
     * <p>
     * The name of a community district. For example, <code>Downtown</code>.
     * </p>
     */
    private String neighborhood;
    /**
     * <p>
     * A group of numbers and letters in a country-specific format, which accompanies the address for the purpose of
     * identifying a location.
     * </p>
     */
    private String postalCode;
    /**
     * <p>
     * A name for an area or geographical division, such as a province or state name. For example,
     * <code>British Columbia</code>.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The name for a street or a road to identify a location. For example, <code>Main Street</code>.
     * </p>
     */
    private String street;
    /**
     * <p>
     * A country, or an area that's part of a larger region . For example, <code>Metro Vancouver</code>.
     * </p>
     */
    private String subRegion;

    /**
     * <p>
     * The numerical portion of an address, such as a building number.
     * </p>
     * 
     * @param addressNumber
     *        The numerical portion of an address, such as a building number.
     */

    public void setAddressNumber(String addressNumber) {
        this.addressNumber = addressNumber;
    }

    /**
     * <p>
     * The numerical portion of an address, such as a building number.
     * </p>
     * 
     * @return The numerical portion of an address, such as a building number.
     */

    public String getAddressNumber() {
        return this.addressNumber;
    }

    /**
     * <p>
     * The numerical portion of an address, such as a building number.
     * </p>
     * 
     * @param addressNumber
     *        The numerical portion of an address, such as a building number.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Place withAddressNumber(String addressNumber) {
        setAddressNumber(addressNumber);
        return this;
    }

    /**
     * <p>
     * A country/region specified using <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit
     * country/region code. For example, <code>CAN</code>.
     * </p>
     * 
     * @param country
     *        A country/region specified using <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a>
     *        3-digit country/region code. For example, <code>CAN</code>.
     */

    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * <p>
     * A country/region specified using <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit
     * country/region code. For example, <code>CAN</code>.
     * </p>
     * 
     * @return A country/region specified using <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a>
     *         3-digit country/region code. For example, <code>CAN</code>.
     */

    public String getCountry() {
        return this.country;
    }

    /**
     * <p>
     * A country/region specified using <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a> 3-digit
     * country/region code. For example, <code>CAN</code>.
     * </p>
     * 
     * @param country
     *        A country/region specified using <a href="https://www.iso.org/iso-3166-country-codes.html">ISO 3166</a>
     *        3-digit country/region code. For example, <code>CAN</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Place withCountry(String country) {
        setCountry(country);
        return this;
    }

    /**
     * @param geometry
     */

    public void setGeometry(PlaceGeometry geometry) {
        this.geometry = geometry;
    }

    /**
     * @return
     */

    public PlaceGeometry getGeometry() {
        return this.geometry;
    }

    /**
     * @param geometry
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Place withGeometry(PlaceGeometry geometry) {
        setGeometry(geometry);
        return this;
    }

    /**
     * <p>
     * The full name and address of the point of interest such as a city, region, or country. For example,
     * <code>123 Any Street, Any Town, USA</code>.
     * </p>
     * 
     * @param label
     *        The full name and address of the point of interest such as a city, region, or country. For example,
     *        <code>123 Any Street, Any Town, USA</code>.
     */

    public void setLabel(String label) {
        this.label = label;
    }

    /**
     * <p>
     * The full name and address of the point of interest such as a city, region, or country. For example,
     * <code>123 Any Street, Any Town, USA</code>.
     * </p>
     * 
     * @return The full name and address of the point of interest such as a city, region, or country. For example,
     *         <code>123 Any Street, Any Town, USA</code>.
     */

    public String getLabel() {
        return this.label;
    }

    /**
     * <p>
     * The full name and address of the point of interest such as a city, region, or country. For example,
     * <code>123 Any Street, Any Town, USA</code>.
     * </p>
     * 
     * @param label
     *        The full name and address of the point of interest such as a city, region, or country. For example,
     *        <code>123 Any Street, Any Town, USA</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Place withLabel(String label) {
        setLabel(label);
        return this;
    }

    /**
     * <p>
     * A name for a local area, such as a city or town name. For example, <code>Toronto</code>.
     * </p>
     * 
     * @param municipality
     *        A name for a local area, such as a city or town name. For example, <code>Toronto</code>.
     */

    public void setMunicipality(String municipality) {
        this.municipality = municipality;
    }

    /**
     * <p>
     * A name for a local area, such as a city or town name. For example, <code>Toronto</code>.
     * </p>
     * 
     * @return A name for a local area, such as a city or town name. For example, <code>Toronto</code>.
     */

    public String getMunicipality() {
        return this.municipality;
    }

    /**
     * <p>
     * A name for a local area, such as a city or town name. For example, <code>Toronto</code>.
     * </p>
     * 
     * @param municipality
     *        A name for a local area, such as a city or town name. For example, <code>Toronto</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Place withMunicipality(String municipality) {
        setMunicipality(municipality);
        return this;
    }

    /**
     * <p>
     * The name of a community district. For example, <code>Downtown</code>.
     * </p>
     * 
     * @param neighborhood
     *        The name of a community district. For example, <code>Downtown</code>.
     */

    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }

    /**
     * <p>
     * The name of a community district. For example, <code>Downtown</code>.
     * </p>
     * 
     * @return The name of a community district. For example, <code>Downtown</code>.
     */

    public String getNeighborhood() {
        return this.neighborhood;
    }

    /**
     * <p>
     * The name of a community district. For example, <code>Downtown</code>.
     * </p>
     * 
     * @param neighborhood
     *        The name of a community district. For example, <code>Downtown</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Place withNeighborhood(String neighborhood) {
        setNeighborhood(neighborhood);
        return this;
    }

    /**
     * <p>
     * A group of numbers and letters in a country-specific format, which accompanies the address for the purpose of
     * identifying a location.
     * </p>
     * 
     * @param postalCode
     *        A group of numbers and letters in a country-specific format, which accompanies the address for the purpose
     *        of identifying a location.
     */

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    /**
     * <p>
     * A group of numbers and letters in a country-specific format, which accompanies the address for the purpose of
     * identifying a location.
     * </p>
     * 
     * @return A group of numbers and letters in a country-specific format, which accompanies the address for the
     *         purpose of identifying a location.
     */

    public String getPostalCode() {
        return this.postalCode;
    }

    /**
     * <p>
     * A group of numbers and letters in a country-specific format, which accompanies the address for the purpose of
     * identifying a location.
     * </p>
     * 
     * @param postalCode
     *        A group of numbers and letters in a country-specific format, which accompanies the address for the purpose
     *        of identifying a location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Place withPostalCode(String postalCode) {
        setPostalCode(postalCode);
        return this;
    }

    /**
     * <p>
     * A name for an area or geographical division, such as a province or state name. For example,
     * <code>British Columbia</code>.
     * </p>
     * 
     * @param region
     *        A name for an area or geographical division, such as a province or state name. For example,
     *        <code>British Columbia</code>.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * A name for an area or geographical division, such as a province or state name. For example,
     * <code>British Columbia</code>.
     * </p>
     * 
     * @return A name for an area or geographical division, such as a province or state name. For example,
     *         <code>British Columbia</code>.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * A name for an area or geographical division, such as a province or state name. For example,
     * <code>British Columbia</code>.
     * </p>
     * 
     * @param region
     *        A name for an area or geographical division, such as a province or state name. For example,
     *        <code>British Columbia</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Place withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The name for a street or a road to identify a location. For example, <code>Main Street</code>.
     * </p>
     * 
     * @param street
     *        The name for a street or a road to identify a location. For example, <code>Main Street</code>.
     */

    public void setStreet(String street) {
        this.street = street;
    }

    /**
     * <p>
     * The name for a street or a road to identify a location. For example, <code>Main Street</code>.
     * </p>
     * 
     * @return The name for a street or a road to identify a location. For example, <code>Main Street</code>.
     */

    public String getStreet() {
        return this.street;
    }

    /**
     * <p>
     * The name for a street or a road to identify a location. For example, <code>Main Street</code>.
     * </p>
     * 
     * @param street
     *        The name for a street or a road to identify a location. For example, <code>Main Street</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Place withStreet(String street) {
        setStreet(street);
        return this;
    }

    /**
     * <p>
     * A country, or an area that's part of a larger region . For example, <code>Metro Vancouver</code>.
     * </p>
     * 
     * @param subRegion
     *        A country, or an area that's part of a larger region . For example, <code>Metro Vancouver</code>.
     */

    public void setSubRegion(String subRegion) {
        this.subRegion = subRegion;
    }

    /**
     * <p>
     * A country, or an area that's part of a larger region . For example, <code>Metro Vancouver</code>.
     * </p>
     * 
     * @return A country, or an area that's part of a larger region . For example, <code>Metro Vancouver</code>.
     */

    public String getSubRegion() {
        return this.subRegion;
    }

    /**
     * <p>
     * A country, or an area that's part of a larger region . For example, <code>Metro Vancouver</code>.
     * </p>
     * 
     * @param subRegion
     *        A country, or an area that's part of a larger region . For example, <code>Metro Vancouver</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Place withSubRegion(String subRegion) {
        setSubRegion(subRegion);
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
        if (getAddressNumber() != null)
            sb.append("AddressNumber: ").append(getAddressNumber()).append(",");
        if (getCountry() != null)
            sb.append("Country: ").append(getCountry()).append(",");
        if (getGeometry() != null)
            sb.append("Geometry: ").append(getGeometry()).append(",");
        if (getLabel() != null)
            sb.append("Label: ").append(getLabel()).append(",");
        if (getMunicipality() != null)
            sb.append("Municipality: ").append(getMunicipality()).append(",");
        if (getNeighborhood() != null)
            sb.append("Neighborhood: ").append(getNeighborhood()).append(",");
        if (getPostalCode() != null)
            sb.append("PostalCode: ").append(getPostalCode()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getStreet() != null)
            sb.append("Street: ").append(getStreet()).append(",");
        if (getSubRegion() != null)
            sb.append("SubRegion: ").append(getSubRegion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Place == false)
            return false;
        Place other = (Place) obj;
        if (other.getAddressNumber() == null ^ this.getAddressNumber() == null)
            return false;
        if (other.getAddressNumber() != null && other.getAddressNumber().equals(this.getAddressNumber()) == false)
            return false;
        if (other.getCountry() == null ^ this.getCountry() == null)
            return false;
        if (other.getCountry() != null && other.getCountry().equals(this.getCountry()) == false)
            return false;
        if (other.getGeometry() == null ^ this.getGeometry() == null)
            return false;
        if (other.getGeometry() != null && other.getGeometry().equals(this.getGeometry()) == false)
            return false;
        if (other.getLabel() == null ^ this.getLabel() == null)
            return false;
        if (other.getLabel() != null && other.getLabel().equals(this.getLabel()) == false)
            return false;
        if (other.getMunicipality() == null ^ this.getMunicipality() == null)
            return false;
        if (other.getMunicipality() != null && other.getMunicipality().equals(this.getMunicipality()) == false)
            return false;
        if (other.getNeighborhood() == null ^ this.getNeighborhood() == null)
            return false;
        if (other.getNeighborhood() != null && other.getNeighborhood().equals(this.getNeighborhood()) == false)
            return false;
        if (other.getPostalCode() == null ^ this.getPostalCode() == null)
            return false;
        if (other.getPostalCode() != null && other.getPostalCode().equals(this.getPostalCode()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getStreet() == null ^ this.getStreet() == null)
            return false;
        if (other.getStreet() != null && other.getStreet().equals(this.getStreet()) == false)
            return false;
        if (other.getSubRegion() == null ^ this.getSubRegion() == null)
            return false;
        if (other.getSubRegion() != null && other.getSubRegion().equals(this.getSubRegion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAddressNumber() == null) ? 0 : getAddressNumber().hashCode());
        hashCode = prime * hashCode + ((getCountry() == null) ? 0 : getCountry().hashCode());
        hashCode = prime * hashCode + ((getGeometry() == null) ? 0 : getGeometry().hashCode());
        hashCode = prime * hashCode + ((getLabel() == null) ? 0 : getLabel().hashCode());
        hashCode = prime * hashCode + ((getMunicipality() == null) ? 0 : getMunicipality().hashCode());
        hashCode = prime * hashCode + ((getNeighborhood() == null) ? 0 : getNeighborhood().hashCode());
        hashCode = prime * hashCode + ((getPostalCode() == null) ? 0 : getPostalCode().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getStreet() == null) ? 0 : getStreet().hashCode());
        hashCode = prime * hashCode + ((getSubRegion() == null) ? 0 : getSubRegion().hashCode());
        return hashCode;
    }

    @Override
    public Place clone() {
        try {
            return (Place) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.location.model.transform.PlaceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
