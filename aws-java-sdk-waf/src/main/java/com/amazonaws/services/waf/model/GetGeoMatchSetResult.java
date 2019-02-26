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
package com.amazonaws.services.waf.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetGeoMatchSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGeoMatchSetResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * Information about the <a>GeoMatchSet</a> that you specified in the <code>GetGeoMatchSet</code> request. This
     * includes the <code>Type</code>, which for a <code>GeoMatchContraint</code> is always <code>Country</code>, as
     * well as the <code>Value</code>, which is the identifier for a specific country.
     * </p>
     */
    private GeoMatchSet geoMatchSet;

    /**
     * <p>
     * Information about the <a>GeoMatchSet</a> that you specified in the <code>GetGeoMatchSet</code> request. This
     * includes the <code>Type</code>, which for a <code>GeoMatchContraint</code> is always <code>Country</code>, as
     * well as the <code>Value</code>, which is the identifier for a specific country.
     * </p>
     * 
     * @param geoMatchSet
     *        Information about the <a>GeoMatchSet</a> that you specified in the <code>GetGeoMatchSet</code> request.
     *        This includes the <code>Type</code>, which for a <code>GeoMatchContraint</code> is always
     *        <code>Country</code>, as well as the <code>Value</code>, which is the identifier for a specific country.
     */

    public void setGeoMatchSet(GeoMatchSet geoMatchSet) {
        this.geoMatchSet = geoMatchSet;
    }

    /**
     * <p>
     * Information about the <a>GeoMatchSet</a> that you specified in the <code>GetGeoMatchSet</code> request. This
     * includes the <code>Type</code>, which for a <code>GeoMatchContraint</code> is always <code>Country</code>, as
     * well as the <code>Value</code>, which is the identifier for a specific country.
     * </p>
     * 
     * @return Information about the <a>GeoMatchSet</a> that you specified in the <code>GetGeoMatchSet</code> request.
     *         This includes the <code>Type</code>, which for a <code>GeoMatchContraint</code> is always
     *         <code>Country</code>, as well as the <code>Value</code>, which is the identifier for a specific country.
     */

    public GeoMatchSet getGeoMatchSet() {
        return this.geoMatchSet;
    }

    /**
     * <p>
     * Information about the <a>GeoMatchSet</a> that you specified in the <code>GetGeoMatchSet</code> request. This
     * includes the <code>Type</code>, which for a <code>GeoMatchContraint</code> is always <code>Country</code>, as
     * well as the <code>Value</code>, which is the identifier for a specific country.
     * </p>
     * 
     * @param geoMatchSet
     *        Information about the <a>GeoMatchSet</a> that you specified in the <code>GetGeoMatchSet</code> request.
     *        This includes the <code>Type</code>, which for a <code>GeoMatchContraint</code> is always
     *        <code>Country</code>, as well as the <code>Value</code>, which is the identifier for a specific country.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeoMatchSetResult withGeoMatchSet(GeoMatchSet geoMatchSet) {
        setGeoMatchSet(geoMatchSet);
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
        if (getGeoMatchSet() != null)
            sb.append("GeoMatchSet: ").append(getGeoMatchSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGeoMatchSetResult == false)
            return false;
        GetGeoMatchSetResult other = (GetGeoMatchSetResult) obj;
        if (other.getGeoMatchSet() == null ^ this.getGeoMatchSet() == null)
            return false;
        if (other.getGeoMatchSet() != null && other.getGeoMatchSet().equals(this.getGeoMatchSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeoMatchSet() == null) ? 0 : getGeoMatchSet().hashCode());
        return hashCode;
    }

    @Override
    public GetGeoMatchSetResult clone() {
        try {
            return (GetGeoMatchSetResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
