/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * To retrieve a list of your reusable delegation sets, send a <code>GET</code> request to the
 * <code>/2013-04-01/delegationset</code> resource. The response to this request includes a <code>DelegationSets</code>
 * element with zero or more <code>DelegationSet</code> child elements. By default, the list of reusable delegation sets
 * is displayed on a single page. You can control the length of the page that is displayed by using the
 * <code>MaxItems</code> parameter. You can use the <code>Marker</code> parameter to control the delegation set that the
 * list begins with.
 * </p>
 * <note>
 * <p>
 * Amazon Route 53 returns a maximum of 100 items. If you set <code>MaxItems</code> to a value greater than 100, Amazon
 * Route 53 returns only the first 100.
 * </p>
 * </note>
 */
public class ListReusableDelegationSetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If you're making the second or subsequent call to <code>ListReusableDelegationSets</code>, the
     * <code>Marker</code> element matches the value that you specified in the <code>marker</code> parameter in the
     * previous request.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the request that produced the current
     * response.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * If you're making the second or subsequent call to <code>ListReusableDelegationSets</code>, the
     * <code>Marker</code> element matches the value that you specified in the <code>marker</code> parameter in the
     * previous request.
     * </p>
     * 
     * @param marker
     *        If you're making the second or subsequent call to <code>ListReusableDelegationSets</code>, the
     *        <code>Marker</code> element matches the value that you specified in the <code>marker</code> parameter in
     *        the previous request.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * If you're making the second or subsequent call to <code>ListReusableDelegationSets</code>, the
     * <code>Marker</code> element matches the value that you specified in the <code>marker</code> parameter in the
     * previous request.
     * </p>
     * 
     * @return If you're making the second or subsequent call to <code>ListReusableDelegationSets</code>, the
     *         <code>Marker</code> element matches the value that you specified in the <code>marker</code> parameter in
     *         the previous request.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * If you're making the second or subsequent call to <code>ListReusableDelegationSets</code>, the
     * <code>Marker</code> element matches the value that you specified in the <code>marker</code> parameter in the
     * previous request.
     * </p>
     * 
     * @param marker
     *        If you're making the second or subsequent call to <code>ListReusableDelegationSets</code>, the
     *        <code>Marker</code> element matches the value that you specified in the <code>marker</code> parameter in
     *        the previous request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReusableDelegationSetsRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the request that produced the current
     * response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>maxitems</code> parameter in the request that produced the
     *        current response.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the request that produced the current
     * response.
     * </p>
     * 
     * @return The value that you specified for the <code>maxitems</code> parameter in the request that produced the
     *         current response.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the request that produced the current
     * response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>maxitems</code> parameter in the request that produced the
     *        current response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListReusableDelegationSetsRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getMarker() != null)
            sb.append("Marker: " + getMarker() + ",");
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

        if (obj instanceof ListReusableDelegationSetsRequest == false)
            return false;
        ListReusableDelegationSetsRequest other = (ListReusableDelegationSetsRequest) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
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

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListReusableDelegationSetsRequest clone() {
        return (ListReusableDelegationSetsRequest) super.clone();
    }
}
