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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#listGeoLocations(ListGeoLocationsRequest) ListGeoLocations operation}.
 * <p>
 * To retrieve a list of supported geo locations, send a
 * <code>GET</code> request to the <code>2013-04-01/geolocations</code>
 * resource. The response to this request includes a
 * <code>GeoLocationDetailsList</code> element with zero, one, or
 * multiple <code>GeoLocationDetails</code> child elements. The list is
 * sorted by country code, and then subdivision code, followed by
 * continents at the end of the list.
 * </p>
 * <p>
 * By default, the list of geo locations is displayed on a single page.
 * You can control the length of the page that is displayed by using the
 * <code>MaxItems</code> parameter. If the list is truncated,
 * <code>IsTruncated</code> will be set to <i>true</i> and a combination
 * of <code>NextContinentCode, NextCountryCode,
 * NextSubdivisionCode</code> will be populated. You can pass these as
 * parameters to <code>StartContinentCode, StartCountryCode,
 * StartSubdivisionCode</code> to control the geo location that the list
 * begins with.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#listGeoLocations(ListGeoLocationsRequest)
 */
public class ListGeoLocationsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The first continent code in the lexicographic ordering of geo
     * locations that you want the <code>ListGeoLocations</code> request to
     * list. For non-continent geo locations, this should be null. <p>Valid
     * values: <code>AF</code> | <code>AN</code> | <code>AS</code> |
     * <code>EU</code> | <code>OC</code> | <code>NA</code> | <code>SA</code>
     * <p>Constraint: Specifying <code>ContinentCode</code> with either
     * <code>CountryCode</code> or <code>SubdivisionCode</code> returns an
     * <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     */
    private String startContinentCode;

    /**
     * The first country code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list.
     * <p>The default geo location uses a <code>*</code> for the country
     * code. All other country codes follow the ISO 3166 two-character code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     */
    private String startCountryCode;

    /**
     * The first subdivision code in the lexicographic ordering of geo
     * locations that you want the <code>ListGeoLocations</code> request to
     * list. <p>Constraint: Specifying <code>SubdivisionCode</code> without
     * <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     */
    private String startSubdivisionCode;

    /**
     * The maximum number of geo locations you want in the response body.
     */
    private String maxItems;

    /**
     * The first continent code in the lexicographic ordering of geo
     * locations that you want the <code>ListGeoLocations</code> request to
     * list. For non-continent geo locations, this should be null. <p>Valid
     * values: <code>AF</code> | <code>AN</code> | <code>AS</code> |
     * <code>EU</code> | <code>OC</code> | <code>NA</code> | <code>SA</code>
     * <p>Constraint: Specifying <code>ContinentCode</code> with either
     * <code>CountryCode</code> or <code>SubdivisionCode</code> returns an
     * <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @return The first continent code in the lexicographic ordering of geo
     *         locations that you want the <code>ListGeoLocations</code> request to
     *         list. For non-continent geo locations, this should be null. <p>Valid
     *         values: <code>AF</code> | <code>AN</code> | <code>AS</code> |
     *         <code>EU</code> | <code>OC</code> | <code>NA</code> | <code>SA</code>
     *         <p>Constraint: Specifying <code>ContinentCode</code> with either
     *         <code>CountryCode</code> or <code>SubdivisionCode</code> returns an
     *         <a>InvalidInput</a> error.
     */
    public String getStartContinentCode() {
        return startContinentCode;
    }
    
    /**
     * The first continent code in the lexicographic ordering of geo
     * locations that you want the <code>ListGeoLocations</code> request to
     * list. For non-continent geo locations, this should be null. <p>Valid
     * values: <code>AF</code> | <code>AN</code> | <code>AS</code> |
     * <code>EU</code> | <code>OC</code> | <code>NA</code> | <code>SA</code>
     * <p>Constraint: Specifying <code>ContinentCode</code> with either
     * <code>CountryCode</code> or <code>SubdivisionCode</code> returns an
     * <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param startContinentCode The first continent code in the lexicographic ordering of geo
     *         locations that you want the <code>ListGeoLocations</code> request to
     *         list. For non-continent geo locations, this should be null. <p>Valid
     *         values: <code>AF</code> | <code>AN</code> | <code>AS</code> |
     *         <code>EU</code> | <code>OC</code> | <code>NA</code> | <code>SA</code>
     *         <p>Constraint: Specifying <code>ContinentCode</code> with either
     *         <code>CountryCode</code> or <code>SubdivisionCode</code> returns an
     *         <a>InvalidInput</a> error.
     */
    public void setStartContinentCode(String startContinentCode) {
        this.startContinentCode = startContinentCode;
    }
    
    /**
     * The first continent code in the lexicographic ordering of geo
     * locations that you want the <code>ListGeoLocations</code> request to
     * list. For non-continent geo locations, this should be null. <p>Valid
     * values: <code>AF</code> | <code>AN</code> | <code>AS</code> |
     * <code>EU</code> | <code>OC</code> | <code>NA</code> | <code>SA</code>
     * <p>Constraint: Specifying <code>ContinentCode</code> with either
     * <code>CountryCode</code> or <code>SubdivisionCode</code> returns an
     * <a>InvalidInput</a> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param startContinentCode The first continent code in the lexicographic ordering of geo
     *         locations that you want the <code>ListGeoLocations</code> request to
     *         list. For non-continent geo locations, this should be null. <p>Valid
     *         values: <code>AF</code> | <code>AN</code> | <code>AS</code> |
     *         <code>EU</code> | <code>OC</code> | <code>NA</code> | <code>SA</code>
     *         <p>Constraint: Specifying <code>ContinentCode</code> with either
     *         <code>CountryCode</code> or <code>SubdivisionCode</code> returns an
     *         <a>InvalidInput</a> error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListGeoLocationsRequest withStartContinentCode(String startContinentCode) {
        this.startContinentCode = startContinentCode;
        return this;
    }

    /**
     * The first country code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list.
     * <p>The default geo location uses a <code>*</code> for the country
     * code. All other country codes follow the ISO 3166 two-character code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return The first country code in the lexicographic ordering of geo locations
     *         that you want the <code>ListGeoLocations</code> request to list.
     *         <p>The default geo location uses a <code>*</code> for the country
     *         code. All other country codes follow the ISO 3166 two-character code.
     */
    public String getStartCountryCode() {
        return startCountryCode;
    }
    
    /**
     * The first country code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list.
     * <p>The default geo location uses a <code>*</code> for the country
     * code. All other country codes follow the ISO 3166 two-character code.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param startCountryCode The first country code in the lexicographic ordering of geo locations
     *         that you want the <code>ListGeoLocations</code> request to list.
     *         <p>The default geo location uses a <code>*</code> for the country
     *         code. All other country codes follow the ISO 3166 two-character code.
     */
    public void setStartCountryCode(String startCountryCode) {
        this.startCountryCode = startCountryCode;
    }
    
    /**
     * The first country code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list.
     * <p>The default geo location uses a <code>*</code> for the country
     * code. All other country codes follow the ISO 3166 two-character code.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param startCountryCode The first country code in the lexicographic ordering of geo locations
     *         that you want the <code>ListGeoLocations</code> request to list.
     *         <p>The default geo location uses a <code>*</code> for the country
     *         code. All other country codes follow the ISO 3166 two-character code.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListGeoLocationsRequest withStartCountryCode(String startCountryCode) {
        this.startCountryCode = startCountryCode;
        return this;
    }

    /**
     * The first subdivision code in the lexicographic ordering of geo
     * locations that you want the <code>ListGeoLocations</code> request to
     * list. <p>Constraint: Specifying <code>SubdivisionCode</code> without
     * <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @return The first subdivision code in the lexicographic ordering of geo
     *         locations that you want the <code>ListGeoLocations</code> request to
     *         list. <p>Constraint: Specifying <code>SubdivisionCode</code> without
     *         <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     */
    public String getStartSubdivisionCode() {
        return startSubdivisionCode;
    }
    
    /**
     * The first subdivision code in the lexicographic ordering of geo
     * locations that you want the <code>ListGeoLocations</code> request to
     * list. <p>Constraint: Specifying <code>SubdivisionCode</code> without
     * <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param startSubdivisionCode The first subdivision code in the lexicographic ordering of geo
     *         locations that you want the <code>ListGeoLocations</code> request to
     *         list. <p>Constraint: Specifying <code>SubdivisionCode</code> without
     *         <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     */
    public void setStartSubdivisionCode(String startSubdivisionCode) {
        this.startSubdivisionCode = startSubdivisionCode;
    }
    
    /**
     * The first subdivision code in the lexicographic ordering of geo
     * locations that you want the <code>ListGeoLocations</code> request to
     * list. <p>Constraint: Specifying <code>SubdivisionCode</code> without
     * <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param startSubdivisionCode The first subdivision code in the lexicographic ordering of geo
     *         locations that you want the <code>ListGeoLocations</code> request to
     *         list. <p>Constraint: Specifying <code>SubdivisionCode</code> without
     *         <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListGeoLocationsRequest withStartSubdivisionCode(String startSubdivisionCode) {
        this.startSubdivisionCode = startSubdivisionCode;
        return this;
    }

    /**
     * The maximum number of geo locations you want in the response body.
     *
     * @return The maximum number of geo locations you want in the response body.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The maximum number of geo locations you want in the response body.
     *
     * @param maxItems The maximum number of geo locations you want in the response body.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The maximum number of geo locations you want in the response body.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The maximum number of geo locations you want in the response body.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListGeoLocationsRequest withMaxItems(String maxItems) {
        this.maxItems = maxItems;
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
        if (getStartContinentCode() != null) sb.append("StartContinentCode: " + getStartContinentCode() + ",");
        if (getStartCountryCode() != null) sb.append("StartCountryCode: " + getStartCountryCode() + ",");
        if (getStartSubdivisionCode() != null) sb.append("StartSubdivisionCode: " + getStartSubdivisionCode() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getStartContinentCode() == null) ? 0 : getStartContinentCode().hashCode()); 
        hashCode = prime * hashCode + ((getStartCountryCode() == null) ? 0 : getStartCountryCode().hashCode()); 
        hashCode = prime * hashCode + ((getStartSubdivisionCode() == null) ? 0 : getStartSubdivisionCode().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListGeoLocationsRequest == false) return false;
        ListGeoLocationsRequest other = (ListGeoLocationsRequest)obj;
        
        if (other.getStartContinentCode() == null ^ this.getStartContinentCode() == null) return false;
        if (other.getStartContinentCode() != null && other.getStartContinentCode().equals(this.getStartContinentCode()) == false) return false; 
        if (other.getStartCountryCode() == null ^ this.getStartCountryCode() == null) return false;
        if (other.getStartCountryCode() != null && other.getStartCountryCode().equals(this.getStartCountryCode()) == false) return false; 
        if (other.getStartSubdivisionCode() == null ^ this.getStartSubdivisionCode() == null) return false;
        if (other.getStartSubdivisionCode() != null && other.getStartSubdivisionCode().equals(this.getStartSubdivisionCode()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
}
    