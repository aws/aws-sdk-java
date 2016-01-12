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
 * A complex type that contains information about the geo locations that are
 * returned by the request and information about the response.
 * </p>
 */
public class ListGeoLocationsResult implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains information about the geo locations that are
     * returned by the request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<GeoLocationDetails> geoLocationDetailsList;
    /**
     * <p>
     * A flag that indicates whether there are more geo locations to be listed.
     * If your results were truncated, you can make a follow-up request for the
     * next page of results by using the values included in the
     * <a>ListGeoLocationsResponse$NextContinentCode</a>,
     * <a>ListGeoLocationsResponse$NextCountryCode</a> and
     * <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * If the results were truncated, the continent code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is a continent location.
     * </p>
     */
    private String nextContinentCode;
    /**
     * <p>
     * If the results were truncated, the country code of the next geo location
     * in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is not a continent location.
     * </p>
     */
    private String nextCountryCode;
    /**
     * <p>
     * If the results were truncated, the subdivision code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location has a subdivision.
     * </p>
     */
    private String nextSubdivisionCode;
    /**
     * <p>
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A complex type that contains information about the geo locations that are
     * returned by the request.
     * </p>
     * 
     * @return A complex type that contains information about the geo locations
     *         that are returned by the request.
     */
    public java.util.List<GeoLocationDetails> getGeoLocationDetailsList() {
        if (geoLocationDetailsList == null) {
            geoLocationDetailsList = new com.amazonaws.internal.SdkInternalList<GeoLocationDetails>();
        }
        return geoLocationDetailsList;
    }

    /**
     * <p>
     * A complex type that contains information about the geo locations that are
     * returned by the request.
     * </p>
     * 
     * @param geoLocationDetailsList
     *        A complex type that contains information about the geo locations
     *        that are returned by the request.
     */
    public void setGeoLocationDetailsList(
            java.util.Collection<GeoLocationDetails> geoLocationDetailsList) {
        if (geoLocationDetailsList == null) {
            this.geoLocationDetailsList = null;
            return;
        }

        this.geoLocationDetailsList = new com.amazonaws.internal.SdkInternalList<GeoLocationDetails>(
                geoLocationDetailsList);
    }

    /**
     * <p>
     * A complex type that contains information about the geo locations that are
     * returned by the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setGeoLocationDetailsList(java.util.Collection)} or
     * {@link #withGeoLocationDetailsList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param geoLocationDetailsList
     *        A complex type that contains information about the geo locations
     *        that are returned by the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsResult withGeoLocationDetailsList(
            GeoLocationDetails... geoLocationDetailsList) {
        if (this.geoLocationDetailsList == null) {
            setGeoLocationDetailsList(new com.amazonaws.internal.SdkInternalList<GeoLocationDetails>(
                    geoLocationDetailsList.length));
        }
        for (GeoLocationDetails ele : geoLocationDetailsList) {
            this.geoLocationDetailsList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the geo locations that are
     * returned by the request.
     * </p>
     * 
     * @param geoLocationDetailsList
     *        A complex type that contains information about the geo locations
     *        that are returned by the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsResult withGeoLocationDetailsList(
            java.util.Collection<GeoLocationDetails> geoLocationDetailsList) {
        setGeoLocationDetailsList(geoLocationDetailsList);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more geo locations to be listed.
     * If your results were truncated, you can make a follow-up request for the
     * next page of results by using the values included in the
     * <a>ListGeoLocationsResponse$NextContinentCode</a>,
     * <a>ListGeoLocationsResponse$NextCountryCode</a> and
     * <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more geo locations to be
     *        listed. If your results were truncated, you can make a follow-up
     *        request for the next page of results by using the values included
     *        in the <a>ListGeoLocationsResponse$NextContinentCode</a>,
     *        <a>ListGeoLocationsResponse$NextCountryCode</a> and
     *        <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more geo locations to be listed.
     * If your results were truncated, you can make a follow-up request for the
     * next page of results by using the values included in the
     * <a>ListGeoLocationsResponse$NextContinentCode</a>,
     * <a>ListGeoLocationsResponse$NextCountryCode</a> and
     * <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A flag that indicates whether there are more geo locations to be
     *         listed. If your results were truncated, you can make a follow-up
     *         request for the next page of results by using the values included
     *         in the <a>ListGeoLocationsResponse$NextContinentCode</a>,
     *         <a>ListGeoLocationsResponse$NextCountryCode</a> and
     *         <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more geo locations to be listed.
     * If your results were truncated, you can make a follow-up request for the
     * next page of results by using the values included in the
     * <a>ListGeoLocationsResponse$NextContinentCode</a>,
     * <a>ListGeoLocationsResponse$NextCountryCode</a> and
     * <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more geo locations to be
     *        listed. If your results were truncated, you can make a follow-up
     *        request for the next page of results by using the values included
     *        in the <a>ListGeoLocationsResponse$NextContinentCode</a>,
     *        <a>ListGeoLocationsResponse$NextCountryCode</a> and
     *        <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more geo locations to be listed.
     * If your results were truncated, you can make a follow-up request for the
     * next page of results by using the values included in the
     * <a>ListGeoLocationsResponse$NextContinentCode</a>,
     * <a>ListGeoLocationsResponse$NextCountryCode</a> and
     * <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A flag that indicates whether there are more geo locations to be
     *         listed. If your results were truncated, you can make a follow-up
     *         request for the next page of results by using the values included
     *         in the <a>ListGeoLocationsResponse$NextContinentCode</a>,
     *         <a>ListGeoLocationsResponse$NextCountryCode</a> and
     *         <a>ListGeoLocationsResponse$NextSubdivisionCode</a> elements.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */
    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * If the results were truncated, the continent code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is a continent location.
     * </p>
     * 
     * @param nextContinentCode
     *        If the results were truncated, the continent code of the next geo
     *        location in the list. This element is present only if
     *        <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next
     *        geo location to list is a continent location.
     */
    public void setNextContinentCode(String nextContinentCode) {
        this.nextContinentCode = nextContinentCode;
    }

    /**
     * <p>
     * If the results were truncated, the continent code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is a continent location.
     * </p>
     * 
     * @return If the results were truncated, the continent code of the next geo
     *         location in the list. This element is present only if
     *         <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next
     *         geo location to list is a continent location.
     */
    public String getNextContinentCode() {
        return this.nextContinentCode;
    }

    /**
     * <p>
     * If the results were truncated, the continent code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is a continent location.
     * </p>
     * 
     * @param nextContinentCode
     *        If the results were truncated, the continent code of the next geo
     *        location in the list. This element is present only if
     *        <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next
     *        geo location to list is a continent location.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsResult withNextContinentCode(String nextContinentCode) {
        setNextContinentCode(nextContinentCode);
        return this;
    }

    /**
     * <p>
     * If the results were truncated, the country code of the next geo location
     * in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is not a continent location.
     * </p>
     * 
     * @param nextCountryCode
     *        If the results were truncated, the country code of the next geo
     *        location in the list. This element is present only if
     *        <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next
     *        geo location to list is not a continent location.
     */
    public void setNextCountryCode(String nextCountryCode) {
        this.nextCountryCode = nextCountryCode;
    }

    /**
     * <p>
     * If the results were truncated, the country code of the next geo location
     * in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is not a continent location.
     * </p>
     * 
     * @return If the results were truncated, the country code of the next geo
     *         location in the list. This element is present only if
     *         <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next
     *         geo location to list is not a continent location.
     */
    public String getNextCountryCode() {
        return this.nextCountryCode;
    }

    /**
     * <p>
     * If the results were truncated, the country code of the next geo location
     * in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location to list is not a continent location.
     * </p>
     * 
     * @param nextCountryCode
     *        If the results were truncated, the country code of the next geo
     *        location in the list. This element is present only if
     *        <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next
     *        geo location to list is not a continent location.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsResult withNextCountryCode(String nextCountryCode) {
        setNextCountryCode(nextCountryCode);
        return this;
    }

    /**
     * <p>
     * If the results were truncated, the subdivision code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location has a subdivision.
     * </p>
     * 
     * @param nextSubdivisionCode
     *        If the results were truncated, the subdivision code of the next
     *        geo location in the list. This element is present only if
     *        <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next
     *        geo location has a subdivision.
     */
    public void setNextSubdivisionCode(String nextSubdivisionCode) {
        this.nextSubdivisionCode = nextSubdivisionCode;
    }

    /**
     * <p>
     * If the results were truncated, the subdivision code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location has a subdivision.
     * </p>
     * 
     * @return If the results were truncated, the subdivision code of the next
     *         geo location in the list. This element is present only if
     *         <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next
     *         geo location has a subdivision.
     */
    public String getNextSubdivisionCode() {
        return this.nextSubdivisionCode;
    }

    /**
     * <p>
     * If the results were truncated, the subdivision code of the next geo
     * location in the list. This element is present only if
     * <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next geo
     * location has a subdivision.
     * </p>
     * 
     * @param nextSubdivisionCode
     *        If the results were truncated, the subdivision code of the next
     *        geo location in the list. This element is present only if
     *        <a>ListGeoLocationsResponse$IsTruncated</a> is true and the next
     *        geo location has a subdivision.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsResult withNextSubdivisionCode(
            String nextSubdivisionCode) {
        setNextSubdivisionCode(nextSubdivisionCode);
        return this;
    }

    /**
     * <p>
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of records you requested. The maximum value of
     *        <code>MaxItems</code> is 100.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     * </p>
     * 
     * @return The maximum number of records you requested. The maximum value of
     *         <code>MaxItems</code> is 100.
     */
    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of records you requested. The maximum value of
     *        <code>MaxItems</code> is 100.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsResult withMaxItems(String maxItems) {
        setMaxItems(maxItems);
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
        if (getGeoLocationDetailsList() != null)
            sb.append("GeoLocationDetailsList: " + getGeoLocationDetailsList()
                    + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getNextContinentCode() != null)
            sb.append("NextContinentCode: " + getNextContinentCode() + ",");
        if (getNextCountryCode() != null)
            sb.append("NextCountryCode: " + getNextCountryCode() + ",");
        if (getNextSubdivisionCode() != null)
            sb.append("NextSubdivisionCode: " + getNextSubdivisionCode() + ",");
        if (getMaxItems() != null)
            sb.append("MaxItems: " + getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGeoLocationsResult == false)
            return false;
        ListGeoLocationsResult other = (ListGeoLocationsResult) obj;
        if (other.getGeoLocationDetailsList() == null
                ^ this.getGeoLocationDetailsList() == null)
            return false;
        if (other.getGeoLocationDetailsList() != null
                && other.getGeoLocationDetailsList().equals(
                        this.getGeoLocationDetailsList()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getNextContinentCode() == null
                ^ this.getNextContinentCode() == null)
            return false;
        if (other.getNextContinentCode() != null
                && other.getNextContinentCode().equals(
                        this.getNextContinentCode()) == false)
            return false;
        if (other.getNextCountryCode() == null
                ^ this.getNextCountryCode() == null)
            return false;
        if (other.getNextCountryCode() != null
                && other.getNextCountryCode().equals(this.getNextCountryCode()) == false)
            return false;
        if (other.getNextSubdivisionCode() == null
                ^ this.getNextSubdivisionCode() == null)
            return false;
        if (other.getNextSubdivisionCode() != null
                && other.getNextSubdivisionCode().equals(
                        this.getNextSubdivisionCode()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null
                && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getGeoLocationDetailsList() == null) ? 0
                        : getGeoLocationDetailsList().hashCode());
        hashCode = prime
                * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime
                * hashCode
                + ((getNextContinentCode() == null) ? 0
                        : getNextContinentCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getNextCountryCode() == null) ? 0 : getNextCountryCode()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getNextSubdivisionCode() == null) ? 0
                        : getNextSubdivisionCode().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListGeoLocationsResult clone() {
        try {
            return (ListGeoLocationsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}