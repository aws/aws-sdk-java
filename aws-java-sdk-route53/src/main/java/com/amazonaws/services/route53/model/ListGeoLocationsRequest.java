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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request to get a list of geographic locations that Amazon Route 53 supports for geolocation resource record sets.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListGeoLocations" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGeoLocationsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The code for the continent with which you want to start listing locations that Amazon Route 53 supports for
     * geolocation. If Route 53 has already returned a page or more of results, if <code>IsTruncated</code> is true, and
     * if <code>NextContinentCode</code> from the previous response has a value, enter that value in
     * <code>startcontinentcode</code> to return the next page of results.
     * </p>
     * <p>
     * Include <code>startcontinentcode</code> only if you want to list continents. Don't include
     * <code>startcontinentcode</code> when you're listing countries or countries with their subdivisions.
     * </p>
     */
    private String startContinentCode;
    /**
     * <p>
     * The code for the country with which you want to start listing locations that Amazon Route 53 supports for
     * geolocation. If Route 53 has already returned a page or more of results, if <code>IsTruncated</code> is
     * <code>true</code>, and if <code>NextCountryCode</code> from the previous response has a value, enter that value
     * in <code>startcountrycode</code> to return the next page of results.
     * </p>
     * <p>
     * Route 53 uses the two-letter country codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * </p>
     */
    private String startCountryCode;
    /**
     * <p>
     * The code for the subdivision (for example, state or province) with which you want to start listing locations that
     * Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if
     * <code>IsTruncated</code> is <code>true</code>, and if <code>NextSubdivisionCode</code> from the previous response
     * has a value, enter that value in <code>startsubdivisioncode</code> to return the next page of results.
     * </p>
     * <p>
     * To list subdivisions of a country, you must include both <code>startcountrycode</code> and
     * <code>startsubdivisioncode</code>.
     * </p>
     */
    private String startSubdivisionCode;
    /**
     * <p>
     * (Optional) The maximum number of geolocations to be included in the response body for this request. If more than
     * <code>maxitems</code> geolocations remain to be listed, then the value of the <code>IsTruncated</code> element in
     * the response is <code>true</code>.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * The code for the continent with which you want to start listing locations that Amazon Route 53 supports for
     * geolocation. If Route 53 has already returned a page or more of results, if <code>IsTruncated</code> is true, and
     * if <code>NextContinentCode</code> from the previous response has a value, enter that value in
     * <code>startcontinentcode</code> to return the next page of results.
     * </p>
     * <p>
     * Include <code>startcontinentcode</code> only if you want to list continents. Don't include
     * <code>startcontinentcode</code> when you're listing countries or countries with their subdivisions.
     * </p>
     * 
     * @param startContinentCode
     *        The code for the continent with which you want to start listing locations that Amazon Route 53 supports
     *        for geolocation. If Route 53 has already returned a page or more of results, if <code>IsTruncated</code>
     *        is true, and if <code>NextContinentCode</code> from the previous response has a value, enter that value in
     *        <code>startcontinentcode</code> to return the next page of results.</p>
     *        <p>
     *        Include <code>startcontinentcode</code> only if you want to list continents. Don't include
     *        <code>startcontinentcode</code> when you're listing countries or countries with their subdivisions.
     */

    public void setStartContinentCode(String startContinentCode) {
        this.startContinentCode = startContinentCode;
    }

    /**
     * <p>
     * The code for the continent with which you want to start listing locations that Amazon Route 53 supports for
     * geolocation. If Route 53 has already returned a page or more of results, if <code>IsTruncated</code> is true, and
     * if <code>NextContinentCode</code> from the previous response has a value, enter that value in
     * <code>startcontinentcode</code> to return the next page of results.
     * </p>
     * <p>
     * Include <code>startcontinentcode</code> only if you want to list continents. Don't include
     * <code>startcontinentcode</code> when you're listing countries or countries with their subdivisions.
     * </p>
     * 
     * @return The code for the continent with which you want to start listing locations that Amazon Route 53 supports
     *         for geolocation. If Route 53 has already returned a page or more of results, if <code>IsTruncated</code>
     *         is true, and if <code>NextContinentCode</code> from the previous response has a value, enter that value
     *         in <code>startcontinentcode</code> to return the next page of results.</p>
     *         <p>
     *         Include <code>startcontinentcode</code> only if you want to list continents. Don't include
     *         <code>startcontinentcode</code> when you're listing countries or countries with their subdivisions.
     */

    public String getStartContinentCode() {
        return this.startContinentCode;
    }

    /**
     * <p>
     * The code for the continent with which you want to start listing locations that Amazon Route 53 supports for
     * geolocation. If Route 53 has already returned a page or more of results, if <code>IsTruncated</code> is true, and
     * if <code>NextContinentCode</code> from the previous response has a value, enter that value in
     * <code>startcontinentcode</code> to return the next page of results.
     * </p>
     * <p>
     * Include <code>startcontinentcode</code> only if you want to list continents. Don't include
     * <code>startcontinentcode</code> when you're listing countries or countries with their subdivisions.
     * </p>
     * 
     * @param startContinentCode
     *        The code for the continent with which you want to start listing locations that Amazon Route 53 supports
     *        for geolocation. If Route 53 has already returned a page or more of results, if <code>IsTruncated</code>
     *        is true, and if <code>NextContinentCode</code> from the previous response has a value, enter that value in
     *        <code>startcontinentcode</code> to return the next page of results.</p>
     *        <p>
     *        Include <code>startcontinentcode</code> only if you want to list continents. Don't include
     *        <code>startcontinentcode</code> when you're listing countries or countries with their subdivisions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoLocationsRequest withStartContinentCode(String startContinentCode) {
        setStartContinentCode(startContinentCode);
        return this;
    }

    /**
     * <p>
     * The code for the country with which you want to start listing locations that Amazon Route 53 supports for
     * geolocation. If Route 53 has already returned a page or more of results, if <code>IsTruncated</code> is
     * <code>true</code>, and if <code>NextCountryCode</code> from the previous response has a value, enter that value
     * in <code>startcountrycode</code> to return the next page of results.
     * </p>
     * <p>
     * Route 53 uses the two-letter country codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * </p>
     * 
     * @param startCountryCode
     *        The code for the country with which you want to start listing locations that Amazon Route 53 supports for
     *        geolocation. If Route 53 has already returned a page or more of results, if <code>IsTruncated</code> is
     *        <code>true</code>, and if <code>NextCountryCode</code> from the previous response has a value, enter that
     *        value in <code>startcountrycode</code> to return the next page of results.</p>
     *        <p>
     *        Route 53 uses the two-letter country codes that are specified in <a
     *        href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     */

    public void setStartCountryCode(String startCountryCode) {
        this.startCountryCode = startCountryCode;
    }

    /**
     * <p>
     * The code for the country with which you want to start listing locations that Amazon Route 53 supports for
     * geolocation. If Route 53 has already returned a page or more of results, if <code>IsTruncated</code> is
     * <code>true</code>, and if <code>NextCountryCode</code> from the previous response has a value, enter that value
     * in <code>startcountrycode</code> to return the next page of results.
     * </p>
     * <p>
     * Route 53 uses the two-letter country codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * </p>
     * 
     * @return The code for the country with which you want to start listing locations that Amazon Route 53 supports for
     *         geolocation. If Route 53 has already returned a page or more of results, if <code>IsTruncated</code> is
     *         <code>true</code>, and if <code>NextCountryCode</code> from the previous response has a value, enter that
     *         value in <code>startcountrycode</code> to return the next page of results.</p>
     *         <p>
     *         Route 53 uses the two-letter country codes that are specified in <a
     *         href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     */

    public String getStartCountryCode() {
        return this.startCountryCode;
    }

    /**
     * <p>
     * The code for the country with which you want to start listing locations that Amazon Route 53 supports for
     * geolocation. If Route 53 has already returned a page or more of results, if <code>IsTruncated</code> is
     * <code>true</code>, and if <code>NextCountryCode</code> from the previous response has a value, enter that value
     * in <code>startcountrycode</code> to return the next page of results.
     * </p>
     * <p>
     * Route 53 uses the two-letter country codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * </p>
     * 
     * @param startCountryCode
     *        The code for the country with which you want to start listing locations that Amazon Route 53 supports for
     *        geolocation. If Route 53 has already returned a page or more of results, if <code>IsTruncated</code> is
     *        <code>true</code>, and if <code>NextCountryCode</code> from the previous response has a value, enter that
     *        value in <code>startcountrycode</code> to return the next page of results.</p>
     *        <p>
     *        Route 53 uses the two-letter country codes that are specified in <a
     *        href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoLocationsRequest withStartCountryCode(String startCountryCode) {
        setStartCountryCode(startCountryCode);
        return this;
    }

    /**
     * <p>
     * The code for the subdivision (for example, state or province) with which you want to start listing locations that
     * Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if
     * <code>IsTruncated</code> is <code>true</code>, and if <code>NextSubdivisionCode</code> from the previous response
     * has a value, enter that value in <code>startsubdivisioncode</code> to return the next page of results.
     * </p>
     * <p>
     * To list subdivisions of a country, you must include both <code>startcountrycode</code> and
     * <code>startsubdivisioncode</code>.
     * </p>
     * 
     * @param startSubdivisionCode
     *        The code for the subdivision (for example, state or province) with which you want to start listing
     *        locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more
     *        of results, if <code>IsTruncated</code> is <code>true</code>, and if <code>NextSubdivisionCode</code> from
     *        the previous response has a value, enter that value in <code>startsubdivisioncode</code> to return the
     *        next page of results.</p>
     *        <p>
     *        To list subdivisions of a country, you must include both <code>startcountrycode</code> and
     *        <code>startsubdivisioncode</code>.
     */

    public void setStartSubdivisionCode(String startSubdivisionCode) {
        this.startSubdivisionCode = startSubdivisionCode;
    }

    /**
     * <p>
     * The code for the subdivision (for example, state or province) with which you want to start listing locations that
     * Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if
     * <code>IsTruncated</code> is <code>true</code>, and if <code>NextSubdivisionCode</code> from the previous response
     * has a value, enter that value in <code>startsubdivisioncode</code> to return the next page of results.
     * </p>
     * <p>
     * To list subdivisions of a country, you must include both <code>startcountrycode</code> and
     * <code>startsubdivisioncode</code>.
     * </p>
     * 
     * @return The code for the subdivision (for example, state or province) with which you want to start listing
     *         locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more
     *         of results, if <code>IsTruncated</code> is <code>true</code>, and if <code>NextSubdivisionCode</code>
     *         from the previous response has a value, enter that value in <code>startsubdivisioncode</code> to return
     *         the next page of results.</p>
     *         <p>
     *         To list subdivisions of a country, you must include both <code>startcountrycode</code> and
     *         <code>startsubdivisioncode</code>.
     */

    public String getStartSubdivisionCode() {
        return this.startSubdivisionCode;
    }

    /**
     * <p>
     * The code for the subdivision (for example, state or province) with which you want to start listing locations that
     * Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if
     * <code>IsTruncated</code> is <code>true</code>, and if <code>NextSubdivisionCode</code> from the previous response
     * has a value, enter that value in <code>startsubdivisioncode</code> to return the next page of results.
     * </p>
     * <p>
     * To list subdivisions of a country, you must include both <code>startcountrycode</code> and
     * <code>startsubdivisioncode</code>.
     * </p>
     * 
     * @param startSubdivisionCode
     *        The code for the subdivision (for example, state or province) with which you want to start listing
     *        locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more
     *        of results, if <code>IsTruncated</code> is <code>true</code>, and if <code>NextSubdivisionCode</code> from
     *        the previous response has a value, enter that value in <code>startsubdivisioncode</code> to return the
     *        next page of results.</p>
     *        <p>
     *        To list subdivisions of a country, you must include both <code>startcountrycode</code> and
     *        <code>startsubdivisioncode</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoLocationsRequest withStartSubdivisionCode(String startSubdivisionCode) {
        setStartSubdivisionCode(startSubdivisionCode);
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of geolocations to be included in the response body for this request. If more than
     * <code>maxitems</code> geolocations remain to be listed, then the value of the <code>IsTruncated</code> element in
     * the response is <code>true</code>.
     * </p>
     * 
     * @param maxItems
     *        (Optional) The maximum number of geolocations to be included in the response body for this request. If
     *        more than <code>maxitems</code> geolocations remain to be listed, then the value of the
     *        <code>IsTruncated</code> element in the response is <code>true</code>.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of geolocations to be included in the response body for this request. If more than
     * <code>maxitems</code> geolocations remain to be listed, then the value of the <code>IsTruncated</code> element in
     * the response is <code>true</code>.
     * </p>
     * 
     * @return (Optional) The maximum number of geolocations to be included in the response body for this request. If
     *         more than <code>maxitems</code> geolocations remain to be listed, then the value of the
     *         <code>IsTruncated</code> element in the response is <code>true</code>.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of geolocations to be included in the response body for this request. If more than
     * <code>maxitems</code> geolocations remain to be listed, then the value of the <code>IsTruncated</code> element in
     * the response is <code>true</code>.
     * </p>
     * 
     * @param maxItems
     *        (Optional) The maximum number of geolocations to be included in the response body for this request. If
     *        more than <code>maxitems</code> geolocations remain to be listed, then the value of the
     *        <code>IsTruncated</code> element in the response is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoLocationsRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
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
        if (getStartContinentCode() != null)
            sb.append("StartContinentCode: ").append(getStartContinentCode()).append(",");
        if (getStartCountryCode() != null)
            sb.append("StartCountryCode: ").append(getStartCountryCode()).append(",");
        if (getStartSubdivisionCode() != null)
            sb.append("StartSubdivisionCode: ").append(getStartSubdivisionCode()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGeoLocationsRequest == false)
            return false;
        ListGeoLocationsRequest other = (ListGeoLocationsRequest) obj;
        if (other.getStartContinentCode() == null ^ this.getStartContinentCode() == null)
            return false;
        if (other.getStartContinentCode() != null && other.getStartContinentCode().equals(this.getStartContinentCode()) == false)
            return false;
        if (other.getStartCountryCode() == null ^ this.getStartCountryCode() == null)
            return false;
        if (other.getStartCountryCode() != null && other.getStartCountryCode().equals(this.getStartCountryCode()) == false)
            return false;
        if (other.getStartSubdivisionCode() == null ^ this.getStartSubdivisionCode() == null)
            return false;
        if (other.getStartSubdivisionCode() != null && other.getStartSubdivisionCode().equals(this.getStartSubdivisionCode()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
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
    public ListGeoLocationsRequest clone() {
        return (ListGeoLocationsRequest) super.clone();
    }

}
