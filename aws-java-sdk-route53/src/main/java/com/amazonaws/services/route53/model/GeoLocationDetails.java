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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type that contains the codes and full continent, country, and subdivision names for the specified
 * <code>geolocation</code> code.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/GeoLocationDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GeoLocationDetails implements Serializable, Cloneable {

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     */
    private String continentCode;
    /**
     * <p>
     * The full name of the continent.
     * </p>
     */
    private String continentName;
    /**
     * <p>
     * The two-letter code for the country.
     * </p>
     */
    private String countryCode;
    /**
     * <p>
     * The name of the country.
     * </p>
     */
    private String countryName;
    /**
     * <p>
     * The code for the subdivision. Route 53 currently supports only states in the United States.
     * </p>
     */
    private String subdivisionCode;
    /**
     * <p>
     * The full name of the subdivision. Route 53 currently supports only states in the United States.
     * </p>
     */
    private String subdivisionName;

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * 
     * @param continentCode
     *        The two-letter code for the continent.
     */

    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * 
     * @return The two-letter code for the continent.
     */

    public String getContinentCode() {
        return this.continentCode;
    }

    /**
     * <p>
     * The two-letter code for the continent.
     * </p>
     * 
     * @param continentCode
     *        The two-letter code for the continent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocationDetails withContinentCode(String continentCode) {
        setContinentCode(continentCode);
        return this;
    }

    /**
     * <p>
     * The full name of the continent.
     * </p>
     * 
     * @param continentName
     *        The full name of the continent.
     */

    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }

    /**
     * <p>
     * The full name of the continent.
     * </p>
     * 
     * @return The full name of the continent.
     */

    public String getContinentName() {
        return this.continentName;
    }

    /**
     * <p>
     * The full name of the continent.
     * </p>
     * 
     * @param continentName
     *        The full name of the continent.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocationDetails withContinentName(String continentName) {
        setContinentName(continentName);
        return this;
    }

    /**
     * <p>
     * The two-letter code for the country.
     * </p>
     * 
     * @param countryCode
     *        The two-letter code for the country.
     */

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    /**
     * <p>
     * The two-letter code for the country.
     * </p>
     * 
     * @return The two-letter code for the country.
     */

    public String getCountryCode() {
        return this.countryCode;
    }

    /**
     * <p>
     * The two-letter code for the country.
     * </p>
     * 
     * @param countryCode
     *        The two-letter code for the country.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocationDetails withCountryCode(String countryCode) {
        setCountryCode(countryCode);
        return this;
    }

    /**
     * <p>
     * The name of the country.
     * </p>
     * 
     * @param countryName
     *        The name of the country.
     */

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * <p>
     * The name of the country.
     * </p>
     * 
     * @return The name of the country.
     */

    public String getCountryName() {
        return this.countryName;
    }

    /**
     * <p>
     * The name of the country.
     * </p>
     * 
     * @param countryName
     *        The name of the country.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocationDetails withCountryName(String countryName) {
        setCountryName(countryName);
        return this;
    }

    /**
     * <p>
     * The code for the subdivision. Route 53 currently supports only states in the United States.
     * </p>
     * 
     * @param subdivisionCode
     *        The code for the subdivision. Route 53 currently supports only states in the United States.
     */

    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    /**
     * <p>
     * The code for the subdivision. Route 53 currently supports only states in the United States.
     * </p>
     * 
     * @return The code for the subdivision. Route 53 currently supports only states in the United States.
     */

    public String getSubdivisionCode() {
        return this.subdivisionCode;
    }

    /**
     * <p>
     * The code for the subdivision. Route 53 currently supports only states in the United States.
     * </p>
     * 
     * @param subdivisionCode
     *        The code for the subdivision. Route 53 currently supports only states in the United States.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocationDetails withSubdivisionCode(String subdivisionCode) {
        setSubdivisionCode(subdivisionCode);
        return this;
    }

    /**
     * <p>
     * The full name of the subdivision. Route 53 currently supports only states in the United States.
     * </p>
     * 
     * @param subdivisionName
     *        The full name of the subdivision. Route 53 currently supports only states in the United States.
     */

    public void setSubdivisionName(String subdivisionName) {
        this.subdivisionName = subdivisionName;
    }

    /**
     * <p>
     * The full name of the subdivision. Route 53 currently supports only states in the United States.
     * </p>
     * 
     * @return The full name of the subdivision. Route 53 currently supports only states in the United States.
     */

    public String getSubdivisionName() {
        return this.subdivisionName;
    }

    /**
     * <p>
     * The full name of the subdivision. Route 53 currently supports only states in the United States.
     * </p>
     * 
     * @param subdivisionName
     *        The full name of the subdivision. Route 53 currently supports only states in the United States.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GeoLocationDetails withSubdivisionName(String subdivisionName) {
        setSubdivisionName(subdivisionName);
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
        if (getContinentName() != null)
            sb.append("ContinentName: ").append(getContinentName()).append(",");
        if (getCountryCode() != null)
            sb.append("CountryCode: ").append(getCountryCode()).append(",");
        if (getCountryName() != null)
            sb.append("CountryName: ").append(getCountryName()).append(",");
        if (getSubdivisionCode() != null)
            sb.append("SubdivisionCode: ").append(getSubdivisionCode()).append(",");
        if (getSubdivisionName() != null)
            sb.append("SubdivisionName: ").append(getSubdivisionName());
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
        if (other.getContinentCode() != null && other.getContinentCode().equals(this.getContinentCode()) == false)
            return false;
        if (other.getContinentName() == null ^ this.getContinentName() == null)
            return false;
        if (other.getContinentName() != null && other.getContinentName().equals(this.getContinentName()) == false)
            return false;
        if (other.getCountryCode() == null ^ this.getCountryCode() == null)
            return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false)
            return false;
        if (other.getCountryName() == null ^ this.getCountryName() == null)
            return false;
        if (other.getCountryName() != null && other.getCountryName().equals(this.getCountryName()) == false)
            return false;
        if (other.getSubdivisionCode() == null ^ this.getSubdivisionCode() == null)
            return false;
        if (other.getSubdivisionCode() != null && other.getSubdivisionCode().equals(this.getSubdivisionCode()) == false)
            return false;
        if (other.getSubdivisionName() == null ^ this.getSubdivisionName() == null)
            return false;
        if (other.getSubdivisionName() != null && other.getSubdivisionName().equals(this.getSubdivisionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContinentCode() == null) ? 0 : getContinentCode().hashCode());
        hashCode = prime * hashCode + ((getContinentName() == null) ? 0 : getContinentName().hashCode());
        hashCode = prime * hashCode + ((getCountryCode() == null) ? 0 : getCountryCode().hashCode());
        hashCode = prime * hashCode + ((getCountryName() == null) ? 0 : getCountryName().hashCode());
        hashCode = prime * hashCode + ((getSubdivisionCode() == null) ? 0 : getSubdivisionCode().hashCode());
        hashCode = prime * hashCode + ((getSubdivisionName() == null) ? 0 : getSubdivisionName().hashCode());
        return hashCode;
    }

    @Override
    public GeoLocationDetails clone() {
        try {
            return (GeoLocationDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
