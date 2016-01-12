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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input for a ListGeoLocations request.
 * </p>
 */
public class ListGeoLocationsRequest extends AmazonWebServiceRequest implements
        Serializable, Cloneable {

    /**
     * <p>
     * The first continent code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list. For
     * non-continent geo locations, this should be null.
     * </p>
     * <p>
     * Valid values: <code>AF</code> | <code>AN</code> | <code>AS</code> |
     * <code>EU</code> | <code>OC</code> | <code>NA</code> | <code>SA</code>
     * </p>
     * <p>
     * Constraint: Specifying <code>ContinentCode</code> with either
     * <code>CountryCode</code> or <code>SubdivisionCode</code> returns an
     * <a>InvalidInput</a> error.
     * </p>
     */
    private String startContinentCode;
    /**
     * <p>
     * The first country code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list.
     * </p>
     * <p>
     * The default geo location uses a <code>*</code> for the country code. All
     * other country codes follow the ISO 3166 two-character code.
     * </p>
     */
    private String startCountryCode;
    /**
     * <p>
     * The first subdivision code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list.
     * </p>
     * <p>
     * Constraint: Specifying <code>SubdivisionCode</code> without
     * <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     * </p>
     */
    private String startSubdivisionCode;
    /**
     * <p>
     * The maximum number of geo locations you want in the response body.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * The first continent code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list. For
     * non-continent geo locations, this should be null.
     * </p>
     * <p>
     * Valid values: <code>AF</code> | <code>AN</code> | <code>AS</code> |
     * <code>EU</code> | <code>OC</code> | <code>NA</code> | <code>SA</code>
     * </p>
     * <p>
     * Constraint: Specifying <code>ContinentCode</code> with either
     * <code>CountryCode</code> or <code>SubdivisionCode</code> returns an
     * <a>InvalidInput</a> error.
     * </p>
     * 
     * @param startContinentCode
     *        The first continent code in the lexicographic ordering of geo
     *        locations that you want the <code>ListGeoLocations</code> request
     *        to list. For non-continent geo locations, this should be null.</p>
     *        <p>
     *        Valid values: <code>AF</code> | <code>AN</code> | <code>AS</code>
     *        | <code>EU</code> | <code>OC</code> | <code>NA</code> |
     *        <code>SA</code>
     *        </p>
     *        <p>
     *        Constraint: Specifying <code>ContinentCode</code> with either
     *        <code>CountryCode</code> or <code>SubdivisionCode</code> returns
     *        an <a>InvalidInput</a> error.
     */
    public void setStartContinentCode(String startContinentCode) {
        this.startContinentCode = startContinentCode;
    }

    /**
     * <p>
     * The first continent code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list. For
     * non-continent geo locations, this should be null.
     * </p>
     * <p>
     * Valid values: <code>AF</code> | <code>AN</code> | <code>AS</code> |
     * <code>EU</code> | <code>OC</code> | <code>NA</code> | <code>SA</code>
     * </p>
     * <p>
     * Constraint: Specifying <code>ContinentCode</code> with either
     * <code>CountryCode</code> or <code>SubdivisionCode</code> returns an
     * <a>InvalidInput</a> error.
     * </p>
     * 
     * @return The first continent code in the lexicographic ordering of geo
     *         locations that you want the <code>ListGeoLocations</code> request
     *         to list. For non-continent geo locations, this should be
     *         null.</p>
     *         <p>
     *         Valid values: <code>AF</code> | <code>AN</code> | <code>AS</code>
     *         | <code>EU</code> | <code>OC</code> | <code>NA</code> |
     *         <code>SA</code>
     *         </p>
     *         <p>
     *         Constraint: Specifying <code>ContinentCode</code> with either
     *         <code>CountryCode</code> or <code>SubdivisionCode</code> returns
     *         an <a>InvalidInput</a> error.
     */
    public String getStartContinentCode() {
        return this.startContinentCode;
    }

    /**
     * <p>
     * The first continent code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list. For
     * non-continent geo locations, this should be null.
     * </p>
     * <p>
     * Valid values: <code>AF</code> | <code>AN</code> | <code>AS</code> |
     * <code>EU</code> | <code>OC</code> | <code>NA</code> | <code>SA</code>
     * </p>
     * <p>
     * Constraint: Specifying <code>ContinentCode</code> with either
     * <code>CountryCode</code> or <code>SubdivisionCode</code> returns an
     * <a>InvalidInput</a> error.
     * </p>
     * 
     * @param startContinentCode
     *        The first continent code in the lexicographic ordering of geo
     *        locations that you want the <code>ListGeoLocations</code> request
     *        to list. For non-continent geo locations, this should be null.</p>
     *        <p>
     *        Valid values: <code>AF</code> | <code>AN</code> | <code>AS</code>
     *        | <code>EU</code> | <code>OC</code> | <code>NA</code> |
     *        <code>SA</code>
     *        </p>
     *        <p>
     *        Constraint: Specifying <code>ContinentCode</code> with either
     *        <code>CountryCode</code> or <code>SubdivisionCode</code> returns
     *        an <a>InvalidInput</a> error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsRequest withStartContinentCode(
            String startContinentCode) {
        setStartContinentCode(startContinentCode);
        return this;
    }

    /**
     * <p>
     * The first country code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list.
     * </p>
     * <p>
     * The default geo location uses a <code>*</code> for the country code. All
     * other country codes follow the ISO 3166 two-character code.
     * </p>
     * 
     * @param startCountryCode
     *        The first country code in the lexicographic ordering of geo
     *        locations that you want the <code>ListGeoLocations</code> request
     *        to list.</p>
     *        <p>
     *        The default geo location uses a <code>*</code> for the country
     *        code. All other country codes follow the ISO 3166 two-character
     *        code.
     */
    public void setStartCountryCode(String startCountryCode) {
        this.startCountryCode = startCountryCode;
    }

    /**
     * <p>
     * The first country code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list.
     * </p>
     * <p>
     * The default geo location uses a <code>*</code> for the country code. All
     * other country codes follow the ISO 3166 two-character code.
     * </p>
     * 
     * @return The first country code in the lexicographic ordering of geo
     *         locations that you want the <code>ListGeoLocations</code> request
     *         to list.</p>
     *         <p>
     *         The default geo location uses a <code>*</code> for the country
     *         code. All other country codes follow the ISO 3166 two-character
     *         code.
     */
    public String getStartCountryCode() {
        return this.startCountryCode;
    }

    /**
     * <p>
     * The first country code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list.
     * </p>
     * <p>
     * The default geo location uses a <code>*</code> for the country code. All
     * other country codes follow the ISO 3166 two-character code.
     * </p>
     * 
     * @param startCountryCode
     *        The first country code in the lexicographic ordering of geo
     *        locations that you want the <code>ListGeoLocations</code> request
     *        to list.</p>
     *        <p>
     *        The default geo location uses a <code>*</code> for the country
     *        code. All other country codes follow the ISO 3166 two-character
     *        code.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsRequest withStartCountryCode(String startCountryCode) {
        setStartCountryCode(startCountryCode);
        return this;
    }

    /**
     * <p>
     * The first subdivision code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list.
     * </p>
     * <p>
     * Constraint: Specifying <code>SubdivisionCode</code> without
     * <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     * </p>
     * 
     * @param startSubdivisionCode
     *        The first subdivision code in the lexicographic ordering of geo
     *        locations that you want the <code>ListGeoLocations</code> request
     *        to list.</p>
     *        <p>
     *        Constraint: Specifying <code>SubdivisionCode</code> without
     *        <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     */
    public void setStartSubdivisionCode(String startSubdivisionCode) {
        this.startSubdivisionCode = startSubdivisionCode;
    }

    /**
     * <p>
     * The first subdivision code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list.
     * </p>
     * <p>
     * Constraint: Specifying <code>SubdivisionCode</code> without
     * <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     * </p>
     * 
     * @return The first subdivision code in the lexicographic ordering of geo
     *         locations that you want the <code>ListGeoLocations</code> request
     *         to list.</p>
     *         <p>
     *         Constraint: Specifying <code>SubdivisionCode</code> without
     *         <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     */
    public String getStartSubdivisionCode() {
        return this.startSubdivisionCode;
    }

    /**
     * <p>
     * The first subdivision code in the lexicographic ordering of geo locations
     * that you want the <code>ListGeoLocations</code> request to list.
     * </p>
     * <p>
     * Constraint: Specifying <code>SubdivisionCode</code> without
     * <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     * </p>
     * 
     * @param startSubdivisionCode
     *        The first subdivision code in the lexicographic ordering of geo
     *        locations that you want the <code>ListGeoLocations</code> request
     *        to list.</p>
     *        <p>
     *        Constraint: Specifying <code>SubdivisionCode</code> without
     *        <code>CountryCode</code> returns an <a>InvalidInput</a> error.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsRequest withStartSubdivisionCode(
            String startSubdivisionCode) {
        setStartSubdivisionCode(startSubdivisionCode);
        return this;
    }

    /**
     * <p>
     * The maximum number of geo locations you want in the response body.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of geo locations you want in the response body.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of geo locations you want in the response body.
     * </p>
     * 
     * @return The maximum number of geo locations you want in the response
     *         body.
     */
    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of geo locations you want in the response body.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of geo locations you want in the response body.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListGeoLocationsRequest withMaxItems(String maxItems) {
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
        if (getStartContinentCode() != null)
            sb.append("StartContinentCode: " + getStartContinentCode() + ",");
        if (getStartCountryCode() != null)
            sb.append("StartCountryCode: " + getStartCountryCode() + ",");
        if (getStartSubdivisionCode() != null)
            sb.append("StartSubdivisionCode: " + getStartSubdivisionCode()
                    + ",");
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

        if (obj instanceof ListGeoLocationsRequest == false)
            return false;
        ListGeoLocationsRequest other = (ListGeoLocationsRequest) obj;
        if (other.getStartContinentCode() == null
                ^ this.getStartContinentCode() == null)
            return false;
        if (other.getStartContinentCode() != null
                && other.getStartContinentCode().equals(
                        this.getStartContinentCode()) == false)
            return false;
        if (other.getStartCountryCode() == null
                ^ this.getStartCountryCode() == null)
            return false;
        if (other.getStartCountryCode() != null
                && other.getStartCountryCode().equals(
                        this.getStartCountryCode()) == false)
            return false;
        if (other.getStartSubdivisionCode() == null
                ^ this.getStartSubdivisionCode() == null)
            return false;
        if (other.getStartSubdivisionCode() != null
                && other.getStartSubdivisionCode().equals(
                        this.getStartSubdivisionCode()) == false)
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
                + ((getStartContinentCode() == null) ? 0
                        : getStartContinentCode().hashCode());
        hashCode = prime
                * hashCode
                + ((getStartCountryCode() == null) ? 0 : getStartCountryCode()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getStartSubdivisionCode() == null) ? 0
                        : getStartSubdivisionCode().hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListGeoLocationsRequest clone() {
        return (ListGeoLocationsRequest) super.clone();
    }
}