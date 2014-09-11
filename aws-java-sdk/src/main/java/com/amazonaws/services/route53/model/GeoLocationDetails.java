/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * A complex type that contains information about a
 * <code>GeoLocation</code> .
 * </p>
 */
public class GeoLocationDetails implements Serializable {

    /**
     * The code for a continent geo location. Note: only continent locations
     * have a continent code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     */
    private String continentCode;

    /**
     * The name of the continent. This element is only present if
     * <code>ContinentCode</code> is also present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     */
    private String continentName;

    /**
     * The code for a country geo location. The default location uses '*' for
     * the country code and will match all locations that are not matched by
     * a geo location. <p>The default geo location uses a <code>*</code> for
     * the country code. All other country codes follow the ISO 3166
     * two-character code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     */
    private String countryCode;

    /**
     * The name of the country. This element is only present if
     * <code>CountryCode</code> is also present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String countryName;

    /**
     * The code for a country's subdivision (e.g., a province of Canada). A
     * subdivision code is only valid with the appropriate country code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     */
    private String subdivisionCode;

    /**
     * The name of the subdivision. This element is only present if
     * <code>SubdivisionCode</code> is also present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String subdivisionName;

    /**
     * The code for a continent geo location. Note: only continent locations
     * have a continent code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @return The code for a continent geo location. Note: only continent locations
     *         have a continent code.
     */
    public String getContinentCode() {
        return continentCode;
    }
    
    /**
     * The code for a continent geo location. Note: only continent locations
     * have a continent code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param continentCode The code for a continent geo location. Note: only continent locations
     *         have a continent code.
     */
    public void setContinentCode(String continentCode) {
        this.continentCode = continentCode;
    }
    
    /**
     * The code for a continent geo location. Note: only continent locations
     * have a continent code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param continentCode The code for a continent geo location. Note: only continent locations
     *         have a continent code.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GeoLocationDetails withContinentCode(String continentCode) {
        this.continentCode = continentCode;
        return this;
    }

    /**
     * The name of the continent. This element is only present if
     * <code>ContinentCode</code> is also present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @return The name of the continent. This element is only present if
     *         <code>ContinentCode</code> is also present.
     */
    public String getContinentName() {
        return continentName;
    }
    
    /**
     * The name of the continent. This element is only present if
     * <code>ContinentCode</code> is also present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @param continentName The name of the continent. This element is only present if
     *         <code>ContinentCode</code> is also present.
     */
    public void setContinentName(String continentName) {
        this.continentName = continentName;
    }
    
    /**
     * The name of the continent. This element is only present if
     * <code>ContinentCode</code> is also present.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 32<br/>
     *
     * @param continentName The name of the continent. This element is only present if
     *         <code>ContinentCode</code> is also present.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GeoLocationDetails withContinentName(String continentName) {
        this.continentName = continentName;
        return this;
    }

    /**
     * The code for a country geo location. The default location uses '*' for
     * the country code and will match all locations that are not matched by
     * a geo location. <p>The default geo location uses a <code>*</code> for
     * the country code. All other country codes follow the ISO 3166
     * two-character code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return The code for a country geo location. The default location uses '*' for
     *         the country code and will match all locations that are not matched by
     *         a geo location. <p>The default geo location uses a <code>*</code> for
     *         the country code. All other country codes follow the ISO 3166
     *         two-character code.
     */
    public String getCountryCode() {
        return countryCode;
    }
    
    /**
     * The code for a country geo location. The default location uses '*' for
     * the country code and will match all locations that are not matched by
     * a geo location. <p>The default geo location uses a <code>*</code> for
     * the country code. All other country codes follow the ISO 3166
     * two-character code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param countryCode The code for a country geo location. The default location uses '*' for
     *         the country code and will match all locations that are not matched by
     *         a geo location. <p>The default geo location uses a <code>*</code> for
     *         the country code. All other country codes follow the ISO 3166
     *         two-character code.
     */
    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }
    
    /**
     * The code for a country geo location. The default location uses '*' for
     * the country code and will match all locations that are not matched by
     * a geo location. <p>The default geo location uses a <code>*</code> for
     * the country code. All other country codes follow the ISO 3166
     * two-character code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param countryCode The code for a country geo location. The default location uses '*' for
     *         the country code and will match all locations that are not matched by
     *         a geo location. <p>The default geo location uses a <code>*</code> for
     *         the country code. All other country codes follow the ISO 3166
     *         two-character code.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GeoLocationDetails withCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    /**
     * The name of the country. This element is only present if
     * <code>CountryCode</code> is also present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The name of the country. This element is only present if
     *         <code>CountryCode</code> is also present.
     */
    public String getCountryName() {
        return countryName;
    }
    
    /**
     * The name of the country. This element is only present if
     * <code>CountryCode</code> is also present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param countryName The name of the country. This element is only present if
     *         <code>CountryCode</code> is also present.
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }
    
    /**
     * The name of the country. This element is only present if
     * <code>CountryCode</code> is also present.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param countryName The name of the country. This element is only present if
     *         <code>CountryCode</code> is also present.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GeoLocationDetails withCountryName(String countryName) {
        this.countryName = countryName;
        return this;
    }

    /**
     * The code for a country's subdivision (e.g., a province of Canada). A
     * subdivision code is only valid with the appropriate country code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @return The code for a country's subdivision (e.g., a province of Canada). A
     *         subdivision code is only valid with the appropriate country code.
     */
    public String getSubdivisionCode() {
        return subdivisionCode;
    }
    
    /**
     * The code for a country's subdivision (e.g., a province of Canada). A
     * subdivision code is only valid with the appropriate country code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param subdivisionCode The code for a country's subdivision (e.g., a province of Canada). A
     *         subdivision code is only valid with the appropriate country code.
     */
    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }
    
    /**
     * The code for a country's subdivision (e.g., a province of Canada). A
     * subdivision code is only valid with the appropriate country code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param subdivisionCode The code for a country's subdivision (e.g., a province of Canada). A
     *         subdivision code is only valid with the appropriate country code.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GeoLocationDetails withSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
        return this;
    }

    /**
     * The name of the subdivision. This element is only present if
     * <code>SubdivisionCode</code> is also present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The name of the subdivision. This element is only present if
     *         <code>SubdivisionCode</code> is also present.
     */
    public String getSubdivisionName() {
        return subdivisionName;
    }
    
    /**
     * The name of the subdivision. This element is only present if
     * <code>SubdivisionCode</code> is also present.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param subdivisionName The name of the subdivision. This element is only present if
     *         <code>SubdivisionCode</code> is also present.
     */
    public void setSubdivisionName(String subdivisionName) {
        this.subdivisionName = subdivisionName;
    }
    
    /**
     * The name of the subdivision. This element is only present if
     * <code>SubdivisionCode</code> is also present.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param subdivisionName The name of the subdivision. This element is only present if
     *         <code>SubdivisionCode</code> is also present.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public GeoLocationDetails withSubdivisionName(String subdivisionName) {
        this.subdivisionName = subdivisionName;
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
        if (getContinentCode() != null) sb.append("ContinentCode: " + getContinentCode() + ",");
        if (getContinentName() != null) sb.append("ContinentName: " + getContinentName() + ",");
        if (getCountryCode() != null) sb.append("CountryCode: " + getCountryCode() + ",");
        if (getCountryName() != null) sb.append("CountryName: " + getCountryName() + ",");
        if (getSubdivisionCode() != null) sb.append("SubdivisionCode: " + getSubdivisionCode() + ",");
        if (getSubdivisionName() != null) sb.append("SubdivisionName: " + getSubdivisionName() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof GeoLocationDetails == false) return false;
        GeoLocationDetails other = (GeoLocationDetails)obj;
        
        if (other.getContinentCode() == null ^ this.getContinentCode() == null) return false;
        if (other.getContinentCode() != null && other.getContinentCode().equals(this.getContinentCode()) == false) return false; 
        if (other.getContinentName() == null ^ this.getContinentName() == null) return false;
        if (other.getContinentName() != null && other.getContinentName().equals(this.getContinentName()) == false) return false; 
        if (other.getCountryCode() == null ^ this.getCountryCode() == null) return false;
        if (other.getCountryCode() != null && other.getCountryCode().equals(this.getCountryCode()) == false) return false; 
        if (other.getCountryName() == null ^ this.getCountryName() == null) return false;
        if (other.getCountryName() != null && other.getCountryName().equals(this.getCountryName()) == false) return false; 
        if (other.getSubdivisionCode() == null ^ this.getSubdivisionCode() == null) return false;
        if (other.getSubdivisionCode() != null && other.getSubdivisionCode().equals(this.getSubdivisionCode()) == false) return false; 
        if (other.getSubdivisionName() == null ^ this.getSubdivisionName() == null) return false;
        if (other.getSubdivisionName() != null && other.getSubdivisionName().equals(this.getSubdivisionName()) == false) return false; 
        return true;
    }
    
}
    