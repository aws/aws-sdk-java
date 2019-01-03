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
     * Amazon Route 53 uses the one- to three-letter subdivision codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>. Route 53 doesn't support
     * subdivision codes for all countries. If you specify <code>subdivisioncode</code>, you must also specify
     * <code>countrycode</code>.
     * </p>
     */
    private String subdivisionCode;

    /**
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
     * 
     * @param continentCode
     *        Amazon Route 53 supports the following continent codes:</p>
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
     * 
     * @return Amazon Route 53 supports the following continent codes:</p>
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
     * 
     * @param continentCode
     *        Amazon Route 53 supports the following continent codes:</p>
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
     * Amazon Route 53 uses the one- to three-letter subdivision codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>. Route 53 doesn't support
     * subdivision codes for all countries. If you specify <code>subdivisioncode</code>, you must also specify
     * <code>countrycode</code>.
     * </p>
     * 
     * @param subdivisionCode
     *        Amazon Route 53 uses the one- to three-letter subdivision codes that are specified in <a
     *        href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>. Route 53 doesn't
     *        support subdivision codes for all countries. If you specify <code>subdivisioncode</code>, you must also
     *        specify <code>countrycode</code>.
     */

    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
    }

    /**
     * <p>
     * Amazon Route 53 uses the one- to three-letter subdivision codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>. Route 53 doesn't support
     * subdivision codes for all countries. If you specify <code>subdivisioncode</code>, you must also specify
     * <code>countrycode</code>.
     * </p>
     * 
     * @return Amazon Route 53 uses the one- to three-letter subdivision codes that are specified in <a
     *         href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>. Route 53 doesn't
     *         support subdivision codes for all countries. If you specify <code>subdivisioncode</code>, you must also
     *         specify <code>countrycode</code>.
     */

    public String getSubdivisionCode() {
        return this.subdivisionCode;
    }

    /**
     * <p>
     * Amazon Route 53 uses the one- to three-letter subdivision codes that are specified in <a
     * href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>. Route 53 doesn't support
     * subdivision codes for all countries. If you specify <code>subdivisioncode</code>, you must also specify
     * <code>countrycode</code>.
     * </p>
     * 
     * @param subdivisionCode
     *        Amazon Route 53 uses the one- to three-letter subdivision codes that are specified in <a
     *        href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO standard 3166-1 alpha-2</a>. Route 53 doesn't
     *        support subdivision codes for all countries. If you specify <code>subdivisioncode</code>, you must also
     *        specify <code>countrycode</code>.
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
