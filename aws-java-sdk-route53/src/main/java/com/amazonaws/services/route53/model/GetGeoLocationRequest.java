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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request for information about whether a specified geographic location is supported for Amazon Route 53 geolocation
 * resource record sets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GetGeoLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGeoLocationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * For geolocation resource record sets, a two-letter abbreviation that identifies a continent. Amazon Route 53
     * supports the following continent codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AF</b>: Africa
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AN</b>: Antarctica
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AS</b>: Asia
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EU</b>: Europe
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OC</b>: Oceania
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NA</b>: North America
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SA</b>: South America
     * </p>
     * </li>
     * </ul>
     */
    private String continentCode;
    /**
     * <p>
     * Amazon Route 53 uses the two-letter country codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * </p>
     */
    private String countryCode;
    /**
     * <p>
     * The code for the subdivision, such as a particular state within the United States. For a list of US state
     * abbreviations, see <a href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter State and Possession
     * Abbreviations</a> on the United States Postal Service website. For a list of all supported subdivision codes, use
     * the <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListGeoLocations.html">ListGeoLocations</a>
     * API.
     * </p>
     */
    private String subdivisionCode;

    /**
     * <p>
     * For geolocation resource record sets, a two-letter abbreviation that identifies a continent. Amazon Route 53
     * supports the following continent codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AF</b>: Africa
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AN</b>: Antarctica
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AS</b>: Asia
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EU</b>: Europe
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OC</b>: Oceania
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NA</b>: North America
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SA</b>: South America
     * </p>
     * </li>
     * </ul>
     * 
     * @param continentCode
     *        For geolocation resource record sets, a two-letter abbreviation that identifies a continent. Amazon Route
     *        53 supports the following continent codes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AF</b>: Africa
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AN</b>: Antarctica
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AS</b>: Asia
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EU</b>: Europe
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>OC</b>: Oceania
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NA</b>: North America
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SA</b>: South America
     *        </p>
     *        </li>
     */

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    /**
     * <p>
     * For geolocation resource record sets, a two-letter abbreviation that identifies a continent. Amazon Route 53
     * supports the following continent codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AF</b>: Africa
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AN</b>: Antarctica
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AS</b>: Asia
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EU</b>: Europe
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OC</b>: Oceania
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NA</b>: North America
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SA</b>: South America
     * </p>
     * </li>
     * </ul>
     * 
     * @return For geolocation resource record sets, a two-letter abbreviation that identifies a continent. Amazon Route
     *         53 supports the following continent codes:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>AF</b>: Africa
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AN</b>: Antarctica
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>AS</b>: Asia
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>EU</b>: Europe
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>OC</b>: Oceania
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>NA</b>: North America
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>SA</b>: South America
     *         </p>
     *         </li>
     */

    public String getContinentCode() {
        return this.continentCode;
    }

    /**
     * <p>
     * For geolocation resource record sets, a two-letter abbreviation that identifies a continent. Amazon Route 53
     * supports the following continent codes:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>AF</b>: Africa
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AN</b>: Antarctica
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>AS</b>: Asia
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>EU</b>: Europe
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>OC</b>: Oceania
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>NA</b>: North America
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>SA</b>: South America
     * </p>
     * </li>
     * </ul>
     * 
     * @param continentCode
     *        For geolocation resource record sets, a two-letter abbreviation that identifies a continent. Amazon Route
     *        53 supports the following continent codes:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>AF</b>: Africa
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AN</b>: Antarctica
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>AS</b>: Asia
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>EU</b>: Europe
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>OC</b>: Oceania
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>NA</b>: North America
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>SA</b>: South America
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeoLocationRequest withContinentCode(String continentCode) {
        setContinentCode(continentCode);
        return this;
    }

    /**
     * <p>
     * Amazon Route 53 uses the two-letter country codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * </p>
     * 
     * @param countryCode
     *        Amazon Route 53 uses the two-letter country codes that are specified in <a
     *        href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * Amazon Route 53 uses the two-letter country codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * </p>
     * 
     * @return Amazon Route 53 uses the two-letter country codes that are specified in <a
     *         href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * <p>
     * Amazon Route 53 uses the two-letter country codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * </p>
     * 
     * @param countryCode
     *        Amazon Route 53 uses the two-letter country codes that are specified in <a
     *        href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeoLocationRequest withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * <p>
     * The code for the subdivision, such as a particular state within the United States. For a list of US state
     * abbreviations, see <a href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter State and Possession
     * Abbreviations</a> on the United States Postal Service website. For a list of all supported subdivision codes, use
     * the <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListGeoLocations.html">ListGeoLocations</a>
     * API.
     * </p>
     * 
     * @param subdivisionCode
     *        The code for the subdivision, such as a particular state within the United States. For a list of US state
     *        abbreviations, see <a href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter State and
     *        Possession Abbreviations</a> on the United States Postal Service website. For a list of all supported
     *        subdivision codes, use the <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListGeoLocations.html"
     *        >ListGeoLocations</a> API.
     */

    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    /**
     * <p>
     * The code for the subdivision, such as a particular state within the United States. For a list of US state
     * abbreviations, see <a href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter State and Possession
     * Abbreviations</a> on the United States Postal Service website. For a list of all supported subdivision codes, use
     * the <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListGeoLocations.html">ListGeoLocations</a>
     * API.
     * </p>
     * 
     * @return The code for the subdivision, such as a particular state within the United States. For a list of US state
     *         abbreviations, see <a href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter State and
     *         Possession Abbreviations</a> on the United States Postal Service website. For a list of all supported
     *         subdivision codes, use the <a
     *         href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListGeoLocations.html"
     *         >ListGeoLocations</a> API.
     */

    public String getSubdivisionCode() {
        return this.subdivisionCode;
    }

    /**
     * <p>
     * The code for the subdivision, such as a particular state within the United States. For a list of US state
     * abbreviations, see <a href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter State and Possession
     * Abbreviations</a> on the United States Postal Service website. For a list of all supported subdivision codes, use
     * the <a
     * href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListGeoLocations.html">ListGeoLocations</a>
     * API.
     * </p>
     * 
     * @param subdivisionCode
     *        The code for the subdivision, such as a particular state within the United States. For a list of US state
     *        abbreviations, see <a href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter State and
     *        Possession Abbreviations</a> on the United States Postal Service website. For a list of all supported
     *        subdivision codes, use the <a
     *        href="https://docs.aws.amazon.com/Route53/latest/APIReference/API_ListGeoLocations.html"
     *        >ListGeoLocations</a> API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeoLocationRequest withSubdivisionCode(String subdivisionCode) {
        setSubdivisionCode(subdivisionCode);
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
        if (getContinentCode() != null)
            sb.append("ContinentCode: ").append(getContinentCode()).append(",");
        if (getCountryCode() != null)
            sb.append("CountryCode: ").append(getCountryCode()).append(",");
        if (getSubdivisionCode() != null)
            sb.append("SubdivisionCode: ").append(getSubdivisionCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGeoLocationRequest == false)
            return false;
        GetGeoLocationRequest other = (GetGeoLocationRequest) obj;
        if (other.getContinentCode() == null ^ this.getContinentCode() == null)
            return false;
        if (other.getContinentCode() != null && other.getContinentCode().equals(this.getContinentCode()) == false)
            return false;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getSubdivisionCode() == null ^ this.getSubdivisionCode() == null)
            return false;
        if (other.getSubdivisionCode() != null && other.getSubdivisionCode().equals(this.getSubdivisionCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContinentCode() == null) ? 0 : getContinentCode().hashCode());
        hashCode = prime * hashCode + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode + ((getSubdivisionCode() == null) ? 0 : getSubdivisionCode().hashCode());
        return hashCode;
    }

    @Override
    public GetGeoLocationRequest clone() {
        return (GetGeoLocationRequest) super.clone();
    }

}
