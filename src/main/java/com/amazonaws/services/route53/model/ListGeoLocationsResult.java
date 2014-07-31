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
 * A complex type that contains information about the geo locations that
 * are returned by the request and information about the response.
 * </p>
 */
public class ListGeoLocationsResult implements Serializable {

    /**
     * A complex type that contains information about the geo locations that
     * are returned by the request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<GeoLocationDetails> geoLocationDetailsList;

    /**
     * A flag that indicates whether there are more geo locations to be
     * listed. If your results were truncated, you can make a follow-up
     * request for the next page of results by using the values included in
     * the <a>ListGeoLocationsResponse$NextContinentCode</a>,
     * <a>ListGeoLocationsResponse$NextCountryCode</a> and
     * <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements. <p>Valid
     * Values: <code>true</code> | <code>false</code>
     */
    private Boolean isTruncated;

    /**
     * If the results were truncated, the continent code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is a continent location.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     */
    private String nextContinentCode;

    /**
     * If the results were truncated, the country code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is not a continent location.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     */
    private String nextCountryCode;

    /**
     * If the results were truncated, the subdivision code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location has a subdivision.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     */
    private String nextSubdivisionCode;

    /**
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     */
    private String maxItems;

    /**
     * A complex type that contains information about the geo locations that
     * are returned by the request.
     *
     * @return A complex type that contains information about the geo locations that
     *         are returned by the request.
     */
    public java.util.List<GeoLocationDetails> getGeoLocationDetailsList() {
        if (geoLocationDetailsList == null) {
              geoLocationDetailsList = new com.amazonaws.internal.ListWithAutoConstructFlag<GeoLocationDetails>();
              geoLocationDetailsList.setAutoConstruct(true);
        }
        return geoLocationDetailsList;
    }
    
    /**
     * A complex type that contains information about the geo locations that
     * are returned by the request.
     *
     * @param geoLocationDetailsList A complex type that contains information about the geo locations that
     *         are returned by the request.
     */
    public void setGeoLocationDetailsList(java.util.Collection<GeoLocationDetails> geoLocationDetailsList) {
        if (geoLocationDetailsList == null) {
            this.geoLocationDetailsList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<GeoLocationDetails> geoLocationDetailsListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GeoLocationDetails>(geoLocationDetailsList.size());
        geoLocationDetailsListCopy.addAll(geoLocationDetailsList);
        this.geoLocationDetailsList = geoLocationDetailsListCopy;
    }
    
    /**
     * A complex type that contains information about the geo locations that
     * are returned by the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param geoLocationDetailsList A complex type that contains information about the geo locations that
     *         are returned by the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListGeoLocationsResult withGeoLocationDetailsList(GeoLocationDetails... geoLocationDetailsList) {
        if (getGeoLocationDetailsList() == null) setGeoLocationDetailsList(new java.util.ArrayList<GeoLocationDetails>(geoLocationDetailsList.length));
        for (GeoLocationDetails value : geoLocationDetailsList) {
            getGeoLocationDetailsList().add(value);
        }
        return this;
    }
    
    /**
     * A complex type that contains information about the geo locations that
     * are returned by the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param geoLocationDetailsList A complex type that contains information about the geo locations that
     *         are returned by the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListGeoLocationsResult withGeoLocationDetailsList(java.util.Collection<GeoLocationDetails> geoLocationDetailsList) {
        if (geoLocationDetailsList == null) {
            this.geoLocationDetailsList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<GeoLocationDetails> geoLocationDetailsListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<GeoLocationDetails>(geoLocationDetailsList.size());
            geoLocationDetailsListCopy.addAll(geoLocationDetailsList);
            this.geoLocationDetailsList = geoLocationDetailsListCopy;
        }

        return this;
    }

    /**
     * A flag that indicates whether there are more geo locations to be
     * listed. If your results were truncated, you can make a follow-up
     * request for the next page of results by using the values included in
     * the <a>ListGeoLocationsResponse$NextContinentCode</a>,
     * <a>ListGeoLocationsResponse$NextCountryCode</a> and
     * <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements. <p>Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @return A flag that indicates whether there are more geo locations to be
     *         listed. If your results were truncated, you can make a follow-up
     *         request for the next page of results by using the values included in
     *         the <a>ListGeoLocationsResponse$NextContinentCode</a>,
     *         <a>ListGeoLocationsResponse$NextCountryCode</a> and
     *         <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements. <p>Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more geo locations to be
     * listed. If your results were truncated, you can make a follow-up
     * request for the next page of results by using the values included in
     * the <a>ListGeoLocationsResponse$NextContinentCode</a>,
     * <a>ListGeoLocationsResponse$NextCountryCode</a> and
     * <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements. <p>Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @param isTruncated A flag that indicates whether there are more geo locations to be
     *         listed. If your results were truncated, you can make a follow-up
     *         request for the next page of results by using the values included in
     *         the <a>ListGeoLocationsResponse$NextContinentCode</a>,
     *         <a>ListGeoLocationsResponse$NextCountryCode</a> and
     *         <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements. <p>Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more geo locations to be
     * listed. If your results were truncated, you can make a follow-up
     * request for the next page of results by using the values included in
     * the <a>ListGeoLocationsResponse$NextContinentCode</a>,
     * <a>ListGeoLocationsResponse$NextCountryCode</a> and
     * <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements. <p>Valid
     * Values: <code>true</code> | <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more geo locations to be
     *         listed. If your results were truncated, you can make a follow-up
     *         request for the next page of results by using the values included in
     *         the <a>ListGeoLocationsResponse$NextContinentCode</a>,
     *         <a>ListGeoLocationsResponse$NextCountryCode</a> and
     *         <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements. <p>Valid
     *         Values: <code>true</code> | <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListGeoLocationsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag that indicates whether there are more geo locations to be
     * listed. If your results were truncated, you can make a follow-up
     * request for the next page of results by using the values included in
     * the <a>ListGeoLocationsResponse$NextContinentCode</a>,
     * <a>ListGeoLocationsResponse$NextCountryCode</a> and
     * <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements. <p>Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @return A flag that indicates whether there are more geo locations to be
     *         listed. If your results were truncated, you can make a follow-up
     *         request for the next page of results by using the values included in
     *         the <a>ListGeoLocationsResponse$NextContinentCode</a>,
     *         <a>ListGeoLocationsResponse$NextCountryCode</a> and
     *         <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements. <p>Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * If the results were truncated, the continent code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is a continent location.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @return If the results were truncated, the continent code of the next geo
     *         location in the list. This element is present only if
     *         <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     *         location to list is a continent location.
     */
    public String getNextContinentCode() {
        return nextContinentCode;
    }
    
    /**
     * If the results were truncated, the continent code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is a continent location.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param nextContinentCode If the results were truncated, the continent code of the next geo
     *         location in the list. This element is present only if
     *         <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     *         location to list is a continent location.
     */
    public void setNextContinentCode(String nextContinentCode) {
        this.nextContinentCode = nextContinentCode;
    }
    
    /**
     * If the results were truncated, the continent code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is a continent location.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>2 - 2<br/>
     *
     * @param nextContinentCode If the results were truncated, the continent code of the next geo
     *         location in the list. This element is present only if
     *         <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     *         location to list is a continent location.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListGeoLocationsResult withNextContinentCode(String nextContinentCode) {
        this.nextContinentCode = nextContinentCode;
        return this;
    }

    /**
     * If the results were truncated, the country code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is not a continent location.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @return If the results were truncated, the country code of the next geo
     *         location in the list. This element is present only if
     *         <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     *         location to list is not a continent location.
     */
    public String getNextCountryCode() {
        return nextCountryCode;
    }
    
    /**
     * If the results were truncated, the country code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is not a continent location.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param nextCountryCode If the results were truncated, the country code of the next geo
     *         location in the list. This element is present only if
     *         <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     *         location to list is not a continent location.
     */
    public void setNextCountryCode(String nextCountryCode) {
        this.nextCountryCode = nextCountryCode;
    }
    
    /**
     * If the results were truncated, the country code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is not a continent location.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2<br/>
     *
     * @param nextCountryCode If the results were truncated, the country code of the next geo
     *         location in the list. This element is present only if
     *         <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     *         location to list is not a continent location.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListGeoLocationsResult withNextCountryCode(String nextCountryCode) {
        this.nextCountryCode = nextCountryCode;
        return this;
    }

    /**
     * If the results were truncated, the subdivision code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location has a subdivision.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @return If the results were truncated, the subdivision code of the next geo
     *         location in the list. This element is present only if
     *         <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     *         location has a subdivision.
     */
    public String getNextSubdivisionCode() {
        return nextSubdivisionCode;
    }
    
    /**
     * If the results were truncated, the subdivision code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location has a subdivision.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param nextSubdivisionCode If the results were truncated, the subdivision code of the next geo
     *         location in the list. This element is present only if
     *         <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     *         location has a subdivision.
     */
    public void setNextSubdivisionCode(String nextSubdivisionCode) {
        this.nextSubdivisionCode = nextSubdivisionCode;
    }
    
    /**
     * If the results were truncated, the subdivision code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location has a subdivision.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 3<br/>
     *
     * @param nextSubdivisionCode If the results were truncated, the subdivision code of the next geo
     *         location in the list. This element is present only if
     *         <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     *         location has a subdivision.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListGeoLocationsResult withNextSubdivisionCode(String nextSubdivisionCode) {
        this.nextSubdivisionCode = nextSubdivisionCode;
        return this;
    }

    /**
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     *
     * @return The maximum number of records you requested. The maximum value of
     *         <code>MaxItems</code> is 100.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     *
     * @param maxItems The maximum number of records you requested. The maximum value of
     *         <code>MaxItems</code> is 100.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The maximum number of records you requested. The maximum value of
     *         <code>MaxItems</code> is 100.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListGeoLocationsResult withMaxItems(String maxItems) {
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
        if (getGeoLocationDetailsList() != null) sb.append("GeoLocationDetailsList: " + getGeoLocationDetailsList() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getNextContinentCode() != null) sb.append("NextContinentCode: " + getNextContinentCode() + ",");
        if (getNextCountryCode() != null) sb.append("NextCountryCode: " + getNextCountryCode() + ",");
        if (getNextSubdivisionCode() != null) sb.append("NextSubdivisionCode: " + getNextSubdivisionCode() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGeoLocationDetailsList() == null) ? 0 : getGeoLocationDetailsList().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getNextContinentCode() == null) ? 0 : getNextContinentCode().hashCode()); 
        hashCode = prime * hashCode + ((getNextCountryCode() == null) ? 0 : getNextCountryCode().hashCode()); 
        hashCode = prime * hashCode + ((getNextSubdivisionCode() == null) ? 0 : getNextSubdivisionCode().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListGeoLocationsResult == false) return false;
        ListGeoLocationsResult other = (ListGeoLocationsResult)obj;
        
        if (other.getGeoLocationDetailsList() == null ^ this.getGeoLocationDetailsList() == null) return false;
        if (other.getGeoLocationDetailsList() != null && other.getGeoLocationDetailsList().equals(this.getGeoLocationDetailsList()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getNextContinentCode() == null ^ this.getNextContinentCode() == null) return false;
        if (other.getNextContinentCode() != null && other.getNextContinentCode().equals(this.getNextContinentCode()) == false) return false; 
        if (other.getNextCountryCode() == null ^ this.getNextCountryCode() == null) return false;
        if (other.getNextCountryCode() != null && other.getNextCountryCode().equals(this.getNextCountryCode()) == false) return false; 
        if (other.getNextSubdivisionCode() == null ^ this.getNextSubdivisionCode() == null) return false;
        if (other.getNextSubdivisionCode() != null && other.getNextSubdivisionCode().equals(this.getNextSubdivisionCode()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
}
    