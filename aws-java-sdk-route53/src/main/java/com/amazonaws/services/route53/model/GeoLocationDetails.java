/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 *
 *  http://aws.amazon.com/apache2.0
 *
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */

package com.amazonaws.services.route53.model;

import java.io.Serializable;

/**
 * <p>
 * A complex type that contains information about a <code>GeoLocation</code>.
 * </p>
 */
public class GeoLocationDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The code for a continent geo location. Note: only continent locations
     * have a continent code.
     * </p>
     */
    private String continentCode;
    /**
     * <p>
     * The name of the continent. This element is only present if
     * <code>ContinentCode</code> is also present.
     * </p>
     */
    private String continentName;
    /**
     * <p>
     * The code for a country geo location. The default location uses '*' for
     * the country code and will match all locations that are not matched by a
     * geo location.
     * </p>
     * <p>
     * The default geo location uses a <code>*</code> for the country code. All
     * other country codes follow the ISO 3166 two-character code.
     * </p>
     */
    private String countryCode;
    /**
     * <p>
     * The name of the country. This element is only present if
     * <code>CountryCode</code> is also present.
     * </p>
     */
    private String countryName;
    /**
     * <p>
     * The code for a country's subdivision (e.g., a province of Canada). A
     * subdivision code is only valid with the appropriate country code.
     * </p>
     */
    private String subdivisionCode;
    /**
     * <p>
     * The name of the subdivision. This element is only present if
     * <code>SubdivisionCode</code> is also present.
     * </p>
     */
    private String subdivisionName;

    /**
     * <p>
     * The code for a continent geo location. Note: only continent locations
     * have a continent code.
     * </p>
     * 
     * @param continentCode
     *        The code for a continent geo location. Note: only continent
     *        locations have a continent code.
     */
    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    /**
     * <p>
     * The code for a continent geo location. Note: only continent locations
     * have a continent code.
     * </p>
     * 
     * @return The code for a continent geo location. Note: only continent
     *         locations have a continent code.
     */
    public String getContinentCode() {
        return this.continentCode;
    }

    /**
     * <p>
     * The code for a continent geo location. Note: only continent locations
     * have a continent code.
     * </p>
     * 
     * @param continentCode
     *        The code for a continent geo location. Note: only continent
     *        locations have a continent code.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GeoLocationDetails withContinentCode(String continentCode) {
        setContinentCode(continentCode);
        return this;
    }

    /**
     * <p>
     * The name of the continent. This element is only present if
     * <code>ContinentCode</code> is also present.
     * </p>
     * 
     * @param continentName
     *        The name of the continent. This element is only present if
     *        <code>ContinentCode</code> is also present.
     */
    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    /**
     * <p>
     * The name of the continent. This element is only present if
     * <code>ContinentCode</code> is also present.
     * </p>
     * 
     * @return The name of the continent. This element is only present if
     *         <code>ContinentCode</code> is also present.
     */
    public String getContinentName() {
        return this.continentName;
    }

    /**
     * <p>
     * The name of the continent. This element is only present if
     * <code>ContinentCode</code> is also present.
     * </p>
     * 
     * @param continentName
     *        The name of the continent. This element is only present if
     *        <code>ContinentCode</code> is also present.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GeoLocationDetails withContinentName(String continentName) {
        setContinentName(continentName);
        return this;
    }

    /**
     * <p>
     * The code for a country geo location. The default location uses '*' for
     * the country code and will match all locations that are not matched by a
     * geo location.
     * </p>
     * <p>
     * The default geo location uses a <code>*</code> for the country code. All
     * other country codes follow the ISO 3166 two-character code.
     * </p>
     * 
     * @param countryCode
     *        The code for a country geo location. The default location uses '*'
     *        for the country code and will match all locations that are not
     *        matched by a geo location.</p>
     *        <p>
     *        The default geo location uses a <code>*</code> for the country
     *        code. All other country codes follow the ISO 3166 two-character
     *        code.
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * The code for a country geo location. The default location uses '*' for
     * the country code and will match all locations that are not matched by a
     * geo location.
     * </p>
     * <p>
     * The default geo location uses a <code>*</code> for the country code. All
     * other country codes follow the ISO 3166 two-character code.
     * </p>
     * 
     * @return The code for a country geo location. The default location uses
     *         '*' for the country code and will match all locations that are
     *         not matched by a geo location.</p>
     *         <p>
     *         The default geo location uses a <code>*</code> for the country
     *         code. All other country codes follow the ISO 3166 two-character
     *         code.
     */
    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * <p>
     * The code for a country geo location. The default location uses '*' for
     * the country code and will match all locations that are not matched by a
     * geo location.
     * </p>
     * <p>
     * The default geo location uses a <code>*</code> for the country code. All
     * other country codes follow the ISO 3166 two-character code.
     * </p>
     * 
     * @param countryCode
     *        The code for a country geo location. The default location uses '*'
     *        for the country code and will match all locations that are not
     *        matched by a geo location.</p>
     *        <p>
     *        The default geo location uses a <code>*</code> for the country
     *        code. All other country codes follow the ISO 3166 two-character
     *        code.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GeoLocationDetails withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * <p>
     * The name of the country. This element is only present if
     * <code>CountryCode</code> is also present.
     * </p>
     * 
     * @param countryName
     *        The name of the country. This element is only present if
     *        <code>CountryCode</code> is also present.
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * <p>
     * The name of the country. This element is only present if
     * <code>CountryCode</code> is also present.
     * </p>
     * 
     * @return The name of the country. This element is only present if
     *         <code>CountryCode</code> is also present.
     */
    public String getCountryName() {
        return this.countryName;
    }

    /**
     * <p>
     * The name of the country. This element is only present if
     * <code>CountryCode</code> is also present.
     * </p>
     * 
     * @param countryName
     *        The name of the country. This element is only present if
     *        <code>CountryCode</code> is also present.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GeoLocationDetails withCountryName(String countryName) {
        setCountryName(countryName);
        return this;
    }

    /**
     * <p>
     * The code for a country's subdivision (e.g., a province of Canada). A
     * subdivision code is only valid with the appropriate country code.
     * </p>
     * 
     * @param subdivisionCode
     *        The code for a country's subdivision (e.g., a province of Canada).
     *        A subdivision code is only valid with the appropriate country
     *        code.
     */
    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    /**
     * <p>
     * The code for a country's subdivision (e.g., a province of Canada). A
     * subdivision code is only valid with the appropriate country code.
     * </p>
     * 
     * @return The code for a country's subdivision (e.g., a province of
     *         Canada). A subdivision code is only valid with the appropriate
     *         country code.
     */
    public String getSubdivisionCode() {
        return this.subdivisionCode;
    }

    /**
     * <p>
     * The code for a country's subdivision (e.g., a province of Canada). A
     * subdivision code is only valid with the appropriate country code.
     * </p>
     * 
     * @param subdivisionCode
     *        The code for a country's subdivision (e.g., a province of Canada).
     *        A subdivision code is only valid with the appropriate country
     *        code.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GeoLocationDetails withSubdivisionCode(String subdivisionCode) {
        setSubdivisionCode(subdivisionCode);
        return this;
    }

    /**
     * <p>
     * The name of the subdivision. This element is only present if
     * <code>SubdivisionCode</code> is also present.
     * </p>
     * 
     * @param subdivisionName
     *        The name of the subdivision. This element is only present if
     *        <code>SubdivisionCode</code> is also present.
     */
    public void setSubdivisionName(String subdivisionName) {
        this.subdivisionName = subdivisionName;
    }

    /**
     * <p>
     * The name of the subdivision. This element is only present if
     * <code>SubdivisionCode</code> is also present.
     * </p>
     * 
     * @return The name of the subdivision. This element is only present if
     *         <code>SubdivisionCode</code> is also present.
     */
    public String getSubdivisionName() {
        return this.subdivisionName;
    }

    /**
     * <p>
     * The name of the subdivision. This element is only present if
     * <code>SubdivisionCode</code> is also present.
     * </p>
     * 
     * @param subdivisionName
     *        The name of the subdivision. This element is only present if
     *        <code>SubdivisionCode</code> is also present.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public GeoLocationDetails withSubdivisionName(String subdivisionName) {
        setSubdivisionName(subdivisionName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
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
            sb.append("ContinentCode: " + getContinentCode() + ",");
        if (getContinentName() != null)
            sb.append("ContinentName: " + getContinentName() + ",");
        if (getCountryCode() != null)
            sb.append("CountryCode: " + getCountryCode() + ",");
        if (getCountryName() != null)
            sb.append("CountryName: " + getCountryName() + ",");
        if (getSubdivisionCode() != null)
            sb.append("SubdivisionCode: " + getSubdivisionCode() + ",");
        if (getSubdivisionName() != null)
            sb.append("SubdivisionName: " + getSubdivisionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GeoLocationDetails == false)
            return false;
        GeoLocationDetails other = (GeoLocationDetails) obj;
        if (other.getContinentCode() == null ^ this.getContinentCode() == null)
            return false;
        if (other.getContinentCode() != null
                && other.getContinentCode().equals(this.getContinentCode()) == false)
            return false;
        if (other.getContinentName() == null ^ this.getContinentName() == null)
            return false;
        if (other.getContinentName() != null
                && other.getContinentName().equals(this.getContinentName()) == false)
            return false;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null
                && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getCountryName() == null ^ this.getCountryName() == null)
            return false;
        if (other.getCountryName() != null
                && other.getCountryName().equals(this.getCountryName()) == false)
            return false;
        if (other.getSubdivisionCode() == null
                ^ this.getSubdivisionCode() == null)
            return false;
        if (other.getSubdivisionCode() != null
                && other.getSubdivisionCode().equals(this.getSubdivisionCode()) == false)
            return false;
        if (other.getSubdivisionName() == null
                ^ this.getSubdivisionName() == null)
            return false;
        if (other.getSubdivisionName() != null
                && other.getSubdivisionName().equals(this.getSubdivisionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getContinentCode() == null) ? 0 : getContinentCode()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getContinentName() == null) ? 0 : getContinentName()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getCountryName() == null) ? 0 : getCountryName().hashCode());
        hashCode = prime
                * hashCode
                + ((getSubdivisionCode() == null) ? 0 : getSubdivisionCode()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getSubdivisionName() == null) ? 0 : getSubdivisionName()
                        .hashCode());
        return hashCode;
    }

    @Override
    public GeoLocationDetails clone() {
        try {
            return (GeoLocationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}