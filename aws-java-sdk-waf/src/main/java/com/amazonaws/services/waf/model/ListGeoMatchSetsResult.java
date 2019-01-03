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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/waf-regional-2016-11-28/ListGeoMatchSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListGeoMatchSetsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * If you have more <code>GeoMatchSet</code> objects than the number that you specified for <code>Limit</code> in
     * the request, the response includes a <code>NextMarker</code> value. To list more <code>GeoMatchSet</code>
     * objects, submit another <code>ListGeoMatchSets</code> request, and specify the <code>NextMarker</code> value from
     * the response in the <code>NextMarker</code> value in the next request.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * An array of <a>GeoMatchSetSummary</a> objects.
     * </p>
     */
    private java.util.List<GeoMatchSetSummary> geoMatchSets;

    /**
     * <p>
     * If you have more <code>GeoMatchSet</code> objects than the number that you specified for <code>Limit</code> in
     * the request, the response includes a <code>NextMarker</code> value. To list more <code>GeoMatchSet</code>
     * objects, submit another <code>ListGeoMatchSets</code> request, and specify the <code>NextMarker</code> value from
     * the response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @param nextMarker
     *        If you have more <code>GeoMatchSet</code> objects than the number that you specified for
     *        <code>Limit</code> in the request, the response includes a <code>NextMarker</code> value. To list more
     *        <code>GeoMatchSet</code> objects, submit another <code>ListGeoMatchSets</code> request, and specify the
     *        <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the next request.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If you have more <code>GeoMatchSet</code> objects than the number that you specified for <code>Limit</code> in
     * the request, the response includes a <code>NextMarker</code> value. To list more <code>GeoMatchSet</code>
     * objects, submit another <code>ListGeoMatchSets</code> request, and specify the <code>NextMarker</code> value from
     * the response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @return If you have more <code>GeoMatchSet</code> objects than the number that you specified for
     *         <code>Limit</code> in the request, the response includes a <code>NextMarker</code> value. To list more
     *         <code>GeoMatchSet</code> objects, submit another <code>ListGeoMatchSets</code> request, and specify the
     *         <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the next request.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If you have more <code>GeoMatchSet</code> objects than the number that you specified for <code>Limit</code> in
     * the request, the response includes a <code>NextMarker</code> value. To list more <code>GeoMatchSet</code>
     * objects, submit another <code>ListGeoMatchSets</code> request, and specify the <code>NextMarker</code> value from
     * the response in the <code>NextMarker</code> value in the next request.
     * </p>
     * 
     * @param nextMarker
     *        If you have more <code>GeoMatchSet</code> objects than the number that you specified for
     *        <code>Limit</code> in the request, the response includes a <code>NextMarker</code> value. To list more
     *        <code>GeoMatchSet</code> objects, submit another <code>ListGeoMatchSets</code> request, and specify the
     *        <code>NextMarker</code> value from the response in the <code>NextMarker</code> value in the next request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoMatchSetsResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * An array of <a>GeoMatchSetSummary</a> objects.
     * </p>
     * 
     * @return An array of <a>GeoMatchSetSummary</a> objects.
     */

    public java.util.List<GeoMatchSetSummary> getGeoMatchSets() {
        return geoMatchSets;
    }

    /**
     * <p>
     * An array of <a>GeoMatchSetSummary</a> objects.
     * </p>
     * 
     * @param geoMatchSets
     *        An array of <a>GeoMatchSetSummary</a> objects.
     */

    public void setGeoMatchSets(java.util.Collection<GeoMatchSetSummary> geoMatchSets) {
        if (geoMatchSets == null) {
            this.geoMatchSets = null;
            return;
        }

        this.geoMatchSets = new java.util.ArrayList<GeoMatchSetSummary>(geoMatchSets);
    }

    /**
     * <p>
     * An array of <a>GeoMatchSetSummary</a> objects.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setGeoMatchSets(java.util.Collection)} or {@link #withGeoMatchSets(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param geoMatchSets
     *        An array of <a>GeoMatchSetSummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoMatchSetsResult withGeoMatchSets(GeoMatchSetSummary... geoMatchSets) {
        if (this.geoMatchSets == null) {
            setGeoMatchSets(new java.util.ArrayList<GeoMatchSetSummary>(geoMatchSets.length));
        }
        for (GeoMatchSetSummary ele : geoMatchSets) {
            this.geoMatchSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>GeoMatchSetSummary</a> objects.
     * </p>
     * 
     * @param geoMatchSets
     *        An array of <a>GeoMatchSetSummary</a> objects.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListGeoMatchSetsResult withGeoMatchSets(java.util.Collection<GeoMatchSetSummary> geoMatchSets) {
        setGeoMatchSets(geoMatchSets);
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
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
        if (getGeoMatchSets() != null)
            sb.append("GeoMatchSets: ").append(getGeoMatchSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListGeoMatchSetsResult == false)
            return false;
        ListGeoMatchSetsResult other = (ListGeoMatchSetsResult) obj;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
            return false;
        if (other.getGeoMatchSets() == null ^ this.getGeoMatchSets() == null)
            return false;
        if (other.getGeoMatchSets() != null && other.getGeoMatchSets().equals(this.getGeoMatchSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getGeoMatchSets() == null) ? 0 : getGeoMatchSets().hashCode());
        return hashCode;
    }

    @Override
    public ListGeoMatchSetsResult clone() {
        try {
            return (ListGeoMatchSetsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
