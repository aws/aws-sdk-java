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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/GetGeoMatchSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetGeoMatchSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to get. <code>GeoMatchSetId</code> is
     * returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * </p>
     */
    private String geoMatchSetId;

    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to get. <code>GeoMatchSetId</code> is
     * returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * </p>
     * 
     * @param geoMatchSetId
     *        The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to get. <code>GeoMatchSetId</code>
     *        is returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     */

    public void setGeoMatchSetId(String geoMatchSetId) {
        this.geoMatchSetId = geoMatchSetId;
    }

    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to get. <code>GeoMatchSetId</code> is
     * returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * </p>
     * 
     * @return The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to get. <code>GeoMatchSetId</code>
     *         is returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     */

    public String getGeoMatchSetId() {
        return this.geoMatchSetId;
    }

    /**
     * <p>
     * The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to get. <code>GeoMatchSetId</code> is
     * returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * </p>
     * 
     * @param geoMatchSetId
     *        The <code>GeoMatchSetId</code> of the <a>GeoMatchSet</a> that you want to get. <code>GeoMatchSetId</code>
     *        is returned by <a>CreateGeoMatchSet</a> and by <a>ListGeoMatchSets</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetGeoMatchSetRequest withGeoMatchSetId(String geoMatchSetId) {
        setGeoMatchSetId(geoMatchSetId);
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
        if (getGeoMatchSetId() != null)
            sb.append("GeoMatchSetId: ").append(getGeoMatchSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetGeoMatchSetRequest == false)
            return false;
        GetGeoMatchSetRequest other = (GetGeoMatchSetRequest) obj;
        if (other.getGeoMatchSetId() == null ^ this.getGeoMatchSetId() == null)
            return false;
        if (other.getGeoMatchSetId() != null && other.getGeoMatchSetId().equals(this.getGeoMatchSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGeoMatchSetId() == null) ? 0 : getGeoMatchSetId().hashCode());
        return hashCode;
    }

    @Override
    public GetGeoMatchSetRequest clone() {
        return (GetGeoMatchSetRequest) super.clone();
    }

}
