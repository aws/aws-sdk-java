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
 * A request to retrieve a list of the public and private hosted zones that are associated with the current AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHostedZones" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHostedZonesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>true</code>, you have more hosted
     * zones. To get more hosted zones, submit another <code>ListHostedZones</code> request.
     * </p>
     * <p>
     * For the value of <code>marker</code>, specify the value of <code>NextMarker</code> from the previous response,
     * which is the ID of the first hosted zone that Amazon Route 53 will return if you submit another request.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>false</code>, there are no more
     * hosted zones to get.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If you have more than
     * <code>maxitems</code> hosted zones, the value of <code>IsTruncated</code> in the response is <code>true</code>,
     * and the value of <code>NextMarker</code> is the hosted zone ID of the first hosted zone that Route 53 will return
     * if you submit another request.
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
     * If the value of <code>IsTruncated</code> in the previous response was <code>true</code>, you have more hosted
     * zones. To get more hosted zones, submit another <code>ListHostedZones</code> request.
     * </p>
     * <p>
     * For the value of <code>marker</code>, specify the value of <code>NextMarker</code> from the previous response,
     * which is the ID of the first hosted zone that Amazon Route 53 will return if you submit another request.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>false</code>, there are no more
     * hosted zones to get.
     * </p>
     * 
     * @param marker
     *        If the value of <code>IsTruncated</code> in the previous response was <code>true</code>, you have more
     *        hosted zones. To get more hosted zones, submit another <code>ListHostedZones</code> request. </p>
     *        <p>
     *        For the value of <code>marker</code>, specify the value of <code>NextMarker</code> from the previous
     *        response, which is the ID of the first hosted zone that Amazon Route 53 will return if you submit another
     *        request.
     *        </p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response was <code>false</code>, there are no
     *        more hosted zones to get.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>true</code>, you have more hosted
     * zones. To get more hosted zones, submit another <code>ListHostedZones</code> request.
     * </p>
     * <p>
     * For the value of <code>marker</code>, specify the value of <code>NextMarker</code> from the previous response,
     * which is the ID of the first hosted zone that Amazon Route 53 will return if you submit another request.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>false</code>, there are no more
     * hosted zones to get.
     * </p>
     * 
     * @return If the value of <code>IsTruncated</code> in the previous response was <code>true</code>, you have more
     *         hosted zones. To get more hosted zones, submit another <code>ListHostedZones</code> request. </p>
     *         <p>
     *         For the value of <code>marker</code>, specify the value of <code>NextMarker</code> from the previous
     *         response, which is the ID of the first hosted zone that Amazon Route 53 will return if you submit another
     *         request.
     *         </p>
     *         <p>
     *         If the value of <code>IsTruncated</code> in the previous response was <code>false</code>, there are no
     *         more hosted zones to get.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>true</code>, you have more hosted
     * zones. To get more hosted zones, submit another <code>ListHostedZones</code> request.
     * </p>
     * <p>
     * For the value of <code>marker</code>, specify the value of <code>NextMarker</code> from the previous response,
     * which is the ID of the first hosted zone that Amazon Route 53 will return if you submit another request.
     * </p>
     * <p>
     * If the value of <code>IsTruncated</code> in the previous response was <code>false</code>, there are no more
     * hosted zones to get.
     * </p>
     * 
     * @param marker
     *        If the value of <code>IsTruncated</code> in the previous response was <code>true</code>, you have more
     *        hosted zones. To get more hosted zones, submit another <code>ListHostedZones</code> request. </p>
     *        <p>
     *        For the value of <code>marker</code>, specify the value of <code>NextMarker</code> from the previous
     *        response, which is the ID of the first hosted zone that Amazon Route 53 will return if you submit another
     *        request.
     *        </p>
     *        <p>
     *        If the value of <code>IsTruncated</code> in the previous response was <code>false</code>, there are no
     *        more hosted zones to get.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesRequest withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If you have more than
     * <code>maxitems</code> hosted zones, the value of <code>IsTruncated</code> in the response is <code>true</code>,
     * and the value of <code>NextMarker</code> is the hosted zone ID of the first hosted zone that Route 53 will return
     * if you submit another request.
     * </p>
     * 
     * @param maxItems
     *        (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If you have more
     *        than <code>maxitems</code> hosted zones, the value of <code>IsTruncated</code> in the response is
     *        <code>true</code>, and the value of <code>NextMarker</code> is the hosted zone ID of the first hosted zone
     *        that Route 53 will return if you submit another request.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If you have more than
     * <code>maxitems</code> hosted zones, the value of <code>IsTruncated</code> in the response is <code>true</code>,
     * and the value of <code>NextMarker</code> is the hosted zone ID of the first hosted zone that Route 53 will return
     * if you submit another request.
     * </p>
     * 
     * @return (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If you have more
     *         than <code>maxitems</code> hosted zones, the value of <code>IsTruncated</code> in the response is
     *         <code>true</code>, and the value of <code>NextMarker</code> is the hosted zone ID of the first hosted
     *         zone that Route 53 will return if you submit another request.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If you have more than
     * <code>maxitems</code> hosted zones, the value of <code>IsTruncated</code> in the response is <code>true</code>,
     * and the value of <code>NextMarker</code> is the hosted zone ID of the first hosted zone that Route 53 will return
     * if you submit another request.
     * </p>
     * 
     * @param maxItems
     *        (Optional) The maximum number of hosted zones that you want Amazon Route 53 to return. If you have more
     *        than <code>maxitems</code> hosted zones, the value of <code>IsTruncated</code> in the response is
     *        <code>true</code>, and the value of <code>NextMarker</code> is the hosted zone ID of the first hosted zone
     *        that Route 53 will return if you submit another request.
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
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems()).append(",");
        if (getDelegationSetId() != null)
            sb.append("DelegationSetId: ").append(getDelegationSetId());
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
