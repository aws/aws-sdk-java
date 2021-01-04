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

/**
 * <p>
 * A complex type that contains information about a geographic location.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GeoLocation" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoLocation implements Serializable, Cloneable {

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * <p>
     * Amazon Route 53 supports the following continent codes:
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
     * <p>
     * Constraint: Specifying <code>ContinentCode</code> with either <code>CountryCode</code> or
     * <code>SubdivisionCode</code> returns an <code>InvalidInput</code> error.
     * </p>
     */
    private String continentCode;
    /**
     * <p>
     * For geolocation resource record sets, the two-letter code for a country.
     * </p>
     * <p>
     * Amazon Route 53 uses the two-letter country codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * </p>
     */
    private String countryCode;
    /**
     * <p>
     * For geolocation resource record sets, the two-letter code for a state of the United States. Route 53 doesn't
     * support any other values for <code>SubdivisionCode</code>. For a list of state abbreviations, see <a
     * href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter State and Possession Abbreviations</a> on
     * the United States Postal Service website.
     * </p>
     * <p>
     * If you specify <code>subdivisioncode</code>, you must also specify <code>US</code> for <code>CountryCode</code>.
     * </p>
     */
    private String subdivisionCode;

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * <p>
     * Amazon Route 53 supports the following continent codes:
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
     * <p>
     * Constraint: Specifying <code>ContinentCode</code> with either <code>CountryCode</code> or
     * <code>SubdivisionCode</code> returns an <code>InvalidInput</code> error.
     * </p>
     * 
     * @param continentCode
     *        The two-letter code for the continent.</p>
     *        <p>
     *        Amazon Route 53 supports the following continent codes:
     *        </p>
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
     *        </ul>
     *        <p>
     *        Constraint: Specifying <code>ContinentCode</code> with either <code>CountryCode</code> or
     *        <code>SubdivisionCode</code> returns an <code>InvalidInput</code> error.
     */

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * <p>
     * Amazon Route 53 supports the following continent codes:
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
     * <p>
     * Constraint: Specifying <code>ContinentCode</code> with either <code>CountryCode</code> or
     * <code>SubdivisionCode</code> returns an <code>InvalidInput</code> error.
     * </p>
     * 
     * @return The two-letter code for the continent.</p>
     *         <p>
     *         Amazon Route 53 supports the following continent codes:
     *         </p>
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
     *         </ul>
     *         <p>
     *         Constraint: Specifying <code>ContinentCode</code> with either <code>CountryCode</code> or
     *         <code>SubdivisionCode</code> returns an <code>InvalidInput</code> error.
     */

    public String getContinentCode() {
        return this.continentCode;
    }

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * <p>
     * Amazon Route 53 supports the following continent codes:
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
     * <p>
     * Constraint: Specifying <code>ContinentCode</code> with either <code>CountryCode</code> or
     * <code>SubdivisionCode</code> returns an <code>InvalidInput</code> error.
     * </p>
     * 
     * @param continentCode
     *        The two-letter code for the continent.</p>
     *        <p>
     *        Amazon Route 53 supports the following continent codes:
     *        </p>
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
     *        </ul>
     *        <p>
     *        Constraint: Specifying <code>ContinentCode</code> with either <code>CountryCode</code> or
     *        <code>SubdivisionCode</code> returns an <code>InvalidInput</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocation withContinentCode(String continentCode) {
        setContinentCode(continentCode);
        return this;
    }

    /**
     * <p>
     * For geolocation resource record sets, the two-letter code for a country.
     * </p>
     * <p>
     * Amazon Route 53 uses the two-letter country codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * </p>
     * 
     * @param countryCode
     *        For geolocation resource record sets, the two-letter code for a country.</p>
     *        <p>
     *        Amazon Route 53 uses the two-letter country codes that are specified in <a
     *        href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * For geolocation resource record sets, the two-letter code for a country.
     * </p>
     * <p>
     * Amazon Route 53 uses the two-letter country codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * </p>
     * 
     * @return For geolocation resource record sets, the two-letter code for a country.</p>
     *         <p>
     *         Amazon Route 53 uses the two-letter country codes that are specified in <a
     *         href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * <p>
     * For geolocation resource record sets, the two-letter code for a country.
     * </p>
     * <p>
     * Amazon Route 53 uses the two-letter country codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * </p>
     * 
     * @param countryCode
     *        For geolocation resource record sets, the two-letter code for a country.</p>
     *        <p>
     *        Amazon Route 53 uses the two-letter country codes that are specified in <a
     *        href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocation withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * <p>
     * For geolocation resource record sets, the two-letter code for a state of the United States. Route 53 doesn't
     * support any other values for <code>SubdivisionCode</code>. For a list of state abbreviations, see <a
     * href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter State and Possession Abbreviations</a> on
     * the United States Postal Service website.
     * </p>
     * <p>
     * If you specify <code>subdivisioncode</code>, you must also specify <code>US</code> for <code>CountryCode</code>.
     * </p>
     * 
     * @param subdivisionCode
     *        For geolocation resource record sets, the two-letter code for a state of the United States. Route 53
     *        doesn't support any other values for <code>SubdivisionCode</code>. For a list of state abbreviations, see
     *        <a href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter State and Possession
     *        Abbreviations</a> on the United States Postal Service website. </p>
     *        <p>
     *        If you specify <code>subdivisioncode</code>, you must also specify <code>US</code> for
     *        <code>CountryCode</code>.
     */

    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    /**
     * <p>
     * For geolocation resource record sets, the two-letter code for a state of the United States. Route 53 doesn't
     * support any other values for <code>SubdivisionCode</code>. For a list of state abbreviations, see <a
     * href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter State and Possession Abbreviations</a> on
     * the United States Postal Service website.
     * </p>
     * <p>
     * If you specify <code>subdivisioncode</code>, you must also specify <code>US</code> for <code>CountryCode</code>.
     * </p>
     * 
     * @return For geolocation resource record sets, the two-letter code for a state of the United States. Route 53
     *         doesn't support any other values for <code>SubdivisionCode</code>. For a list of state abbreviations, see
     *         <a href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter State and Possession
     *         Abbreviations</a> on the United States Postal Service website. </p>
     *         <p>
     *         If you specify <code>subdivisioncode</code>, you must also specify <code>US</code> for
     *         <code>CountryCode</code>.
     */

    public String getSubdivisionCode() {
        return this.subdivisionCode;
    }

    /**
     * <p>
     * For geolocation resource record sets, the two-letter code for a state of the United States. Route 53 doesn't
     * support any other values for <code>SubdivisionCode</code>. For a list of state abbreviations, see <a
     * href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter State and Possession Abbreviations</a> on
     * the United States Postal Service website.
     * </p>
     * <p>
     * If you specify <code>subdivisioncode</code>, you must also specify <code>US</code> for <code>CountryCode</code>.
     * </p>
     * 
     * @param subdivisionCode
     *        For geolocation resource record sets, the two-letter code for a state of the United States. Route 53
     *        doesn't support any other values for <code>SubdivisionCode</code>. For a list of state abbreviations, see
     *        <a href="https://pe.usps.com/text/pub28/28apb.htm">Appendix B: Two–Letter State and Possession
     *        Abbreviations</a> on the United States Postal Service website. </p>
     *        <p>
     *        If you specify <code>subdivisioncode</code>, you must also specify <code>US</code> for
     *        <code>CountryCode</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocation withSubdivisionCode(String subdivisionCode) {
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

        if (obj instanceof GeoLocation == false)
            return false;
        GeoLocation other = (GeoLocation) obj;
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
    public GeoLocation clone() {
        try {
            return (GeoLocation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
