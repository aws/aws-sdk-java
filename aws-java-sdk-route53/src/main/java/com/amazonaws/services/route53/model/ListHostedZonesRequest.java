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
 * To retrieve a list of your public and private hosted zones, send a <code>GET</code> request to the
 * <code>/2013-04-01/hostedzone</code> resource. The response to this request includes a HostedZone child element for
 * each hosted zone that was created by the current AWS account.
 * </p>
 * <p>
 * Amazon Route 53 returns a maximum of 100 items in each response. If you have a lot of hosted zones, you can use the
 * maxitems parameter to list them in groups of up to 100. The response includes four values that help you navigate from
 * one group of maxitems hosted zones to the next:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <code>MaxItems</code> is the value that you specified for the <code>maxitems</code> parameter in the request that
 * produced the current response.
 * </p>
 * </li>
 * <li>
 * <p>
 * If the value of <code>IsTruncated</code> in the response is <code>true</code>, there are more hosted zones associated
 * with the current AWS account.
 * </p>
 * <p>
 * If <code>IsTruncated</code> is <code>false</code>, this response includes the last hosted zone that is associated
 * with the current account.
 * </p>
 * </li>
 * <li>
 * <p>
 * <code>NextMarker</code> is the hosted zone ID of the next hosted zone that is associated with the current AWS
 * account. If you want to list more hosted zones, make another call to <code>ListHostedZones</code>, and specify the
 * value of the <code>NextMarker</code> element in the marker parameter.
 * </p>
 * <p>
 * If <code>IsTruncated</code> is <code>false</code>, the <code>NextMarker</code> element is omitted from the response.
 * </p>
 * </li>
 * <li>
 * <p>
 * If you're making the second or subsequent call to <code>ListHostedZones</code>, the <code>Marker</code> element
 * matches the value that you specified in the <code>marker</code> parameter in the previous request.
 * </p>
 * </li>
 * </ul>
 */
public class ListHostedZonesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Optional) If you have more hosted zones than the value of <code>maxitems</code>, <code>ListHostedZones</code>
     * returns only the first <code>maxitems</code> hosted zones. To get the next group of <code>maxitems</code> hosted
     * zones, submit another request to <code>ListHostedZones</code>. For the value of marker, specify the value of the
     * <code>NextMarker</code> element that was returned in the previous response.
     * </p>
     * <p>
     * Hosted zones are listed in the order in which they were created.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * (Optional) The maximum number of hosted zones to be included in the response body for this request. If you have
     * more than <code>maxitems</code> hosted zones, the value of the <code>IsTruncated</code> element in the response
     * is <code>true</code>, and the value of the <code>NextMarker</code> element is the hosted zone ID of the first
     * hosted zone in the next group of <code>maxitems</code> hosted zones.
     * </p>
     */
    private String maxItems;
    /**
     * <p>
     * If you're using reusable delegation sets and you want to list all of the hosted zones that are associated with a
     * reusable delegation set, specify the ID of that reusable delegation set.
     * </p>
     */
    private String delegationSetId;

    /**
     * <p>
     * (Optional) If you have more hosted zones than the value of <code>maxitems</code>, <code>ListHostedZones</code>
     * returns only the first <code>maxitems</code> hosted zones. To get the next group of <code>maxitems</code> hosted
     * zones, submit another request to <code>ListHostedZones</code>. For the value of marker, specify the value of the
     * <code>NextMarker</code> element that was returned in the previous response.
     * </p>
     * <p>
     * Hosted zones are listed in the order in which they were created.
     * </p>
     * 
     * @param marker
     *        (Optional) If you have more hosted zones than the value of <code>maxitems</code>,
     *        <code>ListHostedZones</code> returns only the first <code>maxitems</code> hosted zones. To get the next
     *        group of <code>maxitems</code> hosted zones, submit another request to <code>ListHostedZones</code>. For
     *        the value of marker, specify the value of the <code>NextMarker</code> element that was returned in the
     *        previous response.</p>
     *        <p>
     *        Hosted zones are listed in the order in which they were created.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * (Optional) If you have more hosted zones than the value of <code>maxitems</code>, <code>ListHostedZones</code>
     * returns only the first <code>maxitems</code> hosted zones. To get the next group of <code>maxitems</code> hosted
     * zones, submit another request to <code>ListHostedZones</code>. For the value of marker, specify the value of the
     * <code>NextMarker</code> element that was returned in the previous response.
     * </p>
     * <p>
     * Hosted zones are listed in the order in which they were created.
     * </p>
     * 
     * @return (Optional) If you have more hosted zones than the value of <code>maxitems</code>,
     *         <code>ListHostedZones</code> returns only the first <code>maxitems</code> hosted zones. To get the next
     *         group of <code>maxitems</code> hosted zones, submit another request to <code>ListHostedZones</code>. For
     *         the value of marker, specify the value of the <code>NextMarker</code> element that was returned in the
     *         previous response.</p>
     *         <p>
     *         Hosted zones are listed in the order in which they were created.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * (Optional) If you have more hosted zones than the value of <code>maxitems</code>, <code>ListHostedZones</code>
     * returns only the first <code>maxitems</code> hosted zones. To get the next group of <code>maxitems</code> hosted
     * zones, submit another request to <code>ListHostedZones</code>. For the value of marker, specify the value of the
     * <code>NextMarker</code> element that was returned in the previous response.
     * </p>
     * <p>
     * Hosted zones are listed in the order in which they were created.
     * </p>
     * 
     * @param marker
     *        (Optional) If you have more hosted zones than the value of <code>maxitems</code>,
     *        <code>ListHostedZones</code> returns only the first <code>maxitems</code> hosted zones. To get the next
     *        group of <code>maxitems</code> hosted zones, submit another request to <code>ListHostedZones</code>. For
     *        the value of marker, specify the value of the <code>NextMarker</code> element that was returned in the
     *        previous response.</p>
     *        <p>
     *        Hosted zones are listed in the order in which they were created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of hosted zones to be included in the response body for this request. If you have
     * more than <code>maxitems</code> hosted zones, the value of the <code>IsTruncated</code> element in the response
     * is <code>true</code>, and the value of the <code>NextMarker</code> element is the hosted zone ID of the first
     * hosted zone in the next group of <code>maxitems</code> hosted zones.
     * </p>
     * 
     * @param maxItems
     *        (Optional) The maximum number of hosted zones to be included in the response body for this request. If you
     *        have more than <code>maxitems</code> hosted zones, the value of the <code>IsTruncated</code> element in
     *        the response is <code>true</code>, and the value of the <code>NextMarker</code> element is the hosted zone
     *        ID of the first hosted zone in the next group of <code>maxitems</code> hosted zones.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of hosted zones to be included in the response body for this request. If you have
     * more than <code>maxitems</code> hosted zones, the value of the <code>IsTruncated</code> element in the response
     * is <code>true</code>, and the value of the <code>NextMarker</code> element is the hosted zone ID of the first
     * hosted zone in the next group of <code>maxitems</code> hosted zones.
     * </p>
     * 
     * @return (Optional) The maximum number of hosted zones to be included in the response body for this request. If
     *         you have more than <code>maxitems</code> hosted zones, the value of the <code>IsTruncated</code> element
     *         in the response is <code>true</code>, and the value of the <code>NextMarker</code> element is the hosted
     *         zone ID of the first hosted zone in the next group of <code>maxitems</code> hosted zones.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of hosted zones to be included in the response body for this request. If you have
     * more than <code>maxitems</code> hosted zones, the value of the <code>IsTruncated</code> element in the response
     * is <code>true</code>, and the value of the <code>NextMarker</code> element is the hosted zone ID of the first
     * hosted zone in the next group of <code>maxitems</code> hosted zones.
     * </p>
     * 
     * @param maxItems
     *        (Optional) The maximum number of hosted zones to be included in the response body for this request. If you
     *        have more than <code>maxitems</code> hosted zones, the value of the <code>IsTruncated</code> element in
     *        the response is <code>true</code>, and the value of the <code>NextMarker</code> element is the hosted zone
     *        ID of the first hosted zone in the next group of <code>maxitems</code> hosted zones.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
        return this;
    }

    /**
     * <p>
     * If you're using reusable delegation sets and you want to list all of the hosted zones that are associated with a
     * reusable delegation set, specify the ID of that reusable delegation set.
     * </p>
     * 
     * @param delegationSetId
     *        If you're using reusable delegation sets and you want to list all of the hosted zones that are associated
     *        with a reusable delegation set, specify the ID of that reusable delegation set.
     */

    public void setDelegationSetId(String delegationSetId) {
        this.delegationSetId = delegationSetId;
    }

    /**
     * <p>
     * If you're using reusable delegation sets and you want to list all of the hosted zones that are associated with a
     * reusable delegation set, specify the ID of that reusable delegation set.
     * </p>
     * 
     * @return If you're using reusable delegation sets and you want to list all of the hosted zones that are associated
     *         with a reusable delegation set, specify the ID of that reusable delegation set.
     */

    public String getDelegationSetId() {
        return this.delegationSetId;
    }

    /**
     * <p>
     * If you're using reusable delegation sets and you want to list all of the hosted zones that are associated with a
     * reusable delegation set, specify the ID of that reusable delegation set.
     * </p>
     * 
     * @param delegationSetId
     *        If you're using reusable delegation sets and you want to list all of the hosted zones that are associated
     *        with a reusable delegation set, specify the ID of that reusable delegation set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesRequest withDelegationSetId(String delegationSetId) {
        setDelegationSetId(delegationSetId);
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
            sb.append("MaxItems: " + getMaxItems() + ",");
        if (getDelegationSetId() != null)
            sb.append("DelegationSetId: " + getDelegationSetId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListHostedZonesRequest == false)
            return false;
        ListHostedZonesRequest other = (ListHostedZonesRequest) obj;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        if (other.getDelegationSetId() == null ^ this.getDelegationSetId() == null)
            return false;
        if (other.getDelegationSetId() != null && other.getDelegationSetId().equals(this.getDelegationSetId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        hashCode = prime * hashCode + ((getDelegationSetId() == null) ? 0 : getDelegationSetId().hashCode());
        return hashCode;
    }

    @Override
    public ListHostedZonesRequest clone() {
        return (ListHostedZonesRequest) super.clone();
    }
}
