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
 * A complex type that contains the information about the request to list your traffic policies.
 * </p>
 */
public class ListTrafficPolicyVersionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specify the value of <code>Id</code> of the traffic policy for which you want to list all versions.
     * </p>
     */
    private String id;
    /**
     * <p>
     * For your first request to <code>ListTrafficPolicyVersions</code>, do not include the
     * <code>TrafficPolicyVersionMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policy versions than the value of <code>MaxItems</code>,
     * <code>ListTrafficPolicyVersions</code> returns only the first group of <code>MaxItems</code> versions. To get the
     * next group of <code>MaxItems</code> traffic policy versions, submit another request to
     * <code>ListTrafficPolicyVersions</code>. For the value of <code>TrafficPolicyVersionMarker</code>, specify the
     * value of the <code>TrafficPolicyVersionMarker</code> element that was returned in the previous response.
     * </p>
     * <p>
     * Traffic policy versions are listed in sequential order.
     * </p>
     */
    private String trafficPolicyVersionMarker;
    /**
     * <p>
     * The maximum number of traffic policy versions that you want Amazon Route 53 to include in the response body for
     * this request. If the specified traffic policy has more than <code>MaxItems</code> versions, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>, and the value of the
     * <code>TrafficPolicyVersionMarker</code> element is the ID of the first version in the next group of
     * <code>MaxItems</code> traffic policy versions.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * Specify the value of <code>Id</code> of the traffic policy for which you want to list all versions.
     * </p>
     * 
     * @param id
     *        Specify the value of <code>Id</code> of the traffic policy for which you want to list all versions.
     */

    public void setId(String id) {
        this.id = id;
    }

    /**
     * <p>
     * Specify the value of <code>Id</code> of the traffic policy for which you want to list all versions.
     * </p>
     * 
     * @return Specify the value of <code>Id</code> of the traffic policy for which you want to list all versions.
     */

    public String getId() {
        return this.id;
    }

    /**
     * <p>
     * Specify the value of <code>Id</code> of the traffic policy for which you want to list all versions.
     * </p>
     * 
     * @param id
     *        Specify the value of <code>Id</code> of the traffic policy for which you want to list all versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPolicyVersionsRequest withId(String id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * For your first request to <code>ListTrafficPolicyVersions</code>, do not include the
     * <code>TrafficPolicyVersionMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policy versions than the value of <code>MaxItems</code>,
     * <code>ListTrafficPolicyVersions</code> returns only the first group of <code>MaxItems</code> versions. To get the
     * next group of <code>MaxItems</code> traffic policy versions, submit another request to
     * <code>ListTrafficPolicyVersions</code>. For the value of <code>TrafficPolicyVersionMarker</code>, specify the
     * value of the <code>TrafficPolicyVersionMarker</code> element that was returned in the previous response.
     * </p>
     * <p>
     * Traffic policy versions are listed in sequential order.
     * </p>
     * 
     * @param trafficPolicyVersionMarker
     *        For your first request to <code>ListTrafficPolicyVersions</code>, do not include the
     *        <code>TrafficPolicyVersionMarker</code> parameter.</p>
     *        <p>
     *        If you have more traffic policy versions than the value of <code>MaxItems</code>,
     *        <code>ListTrafficPolicyVersions</code> returns only the first group of <code>MaxItems</code> versions. To
     *        get the next group of <code>MaxItems</code> traffic policy versions, submit another request to
     *        <code>ListTrafficPolicyVersions</code>. For the value of <code>TrafficPolicyVersionMarker</code>, specify
     *        the value of the <code>TrafficPolicyVersionMarker</code> element that was returned in the previous
     *        response.
     *        </p>
     *        <p>
     *        Traffic policy versions are listed in sequential order.
     */

    public void setTrafficPolicyVersionMarker(String trafficPolicyVersionMarker) {
        this.trafficPolicyVersionMarker = trafficPolicyVersionMarker;
    }

    /**
     * <p>
     * For your first request to <code>ListTrafficPolicyVersions</code>, do not include the
     * <code>TrafficPolicyVersionMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policy versions than the value of <code>MaxItems</code>,
     * <code>ListTrafficPolicyVersions</code> returns only the first group of <code>MaxItems</code> versions. To get the
     * next group of <code>MaxItems</code> traffic policy versions, submit another request to
     * <code>ListTrafficPolicyVersions</code>. For the value of <code>TrafficPolicyVersionMarker</code>, specify the
     * value of the <code>TrafficPolicyVersionMarker</code> element that was returned in the previous response.
     * </p>
     * <p>
     * Traffic policy versions are listed in sequential order.
     * </p>
     * 
     * @return For your first request to <code>ListTrafficPolicyVersions</code>, do not include the
     *         <code>TrafficPolicyVersionMarker</code> parameter.</p>
     *         <p>
     *         If you have more traffic policy versions than the value of <code>MaxItems</code>,
     *         <code>ListTrafficPolicyVersions</code> returns only the first group of <code>MaxItems</code> versions. To
     *         get the next group of <code>MaxItems</code> traffic policy versions, submit another request to
     *         <code>ListTrafficPolicyVersions</code>. For the value of <code>TrafficPolicyVersionMarker</code>, specify
     *         the value of the <code>TrafficPolicyVersionMarker</code> element that was returned in the previous
     *         response.
     *         </p>
     *         <p>
     *         Traffic policy versions are listed in sequential order.
     */

    public String getTrafficPolicyVersionMarker() {
        return this.trafficPolicyVersionMarker;
    }

    /**
     * <p>
     * For your first request to <code>ListTrafficPolicyVersions</code>, do not include the
     * <code>TrafficPolicyVersionMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policy versions than the value of <code>MaxItems</code>,
     * <code>ListTrafficPolicyVersions</code> returns only the first group of <code>MaxItems</code> versions. To get the
     * next group of <code>MaxItems</code> traffic policy versions, submit another request to
     * <code>ListTrafficPolicyVersions</code>. For the value of <code>TrafficPolicyVersionMarker</code>, specify the
     * value of the <code>TrafficPolicyVersionMarker</code> element that was returned in the previous response.
     * </p>
     * <p>
     * Traffic policy versions are listed in sequential order.
     * </p>
     * 
     * @param trafficPolicyVersionMarker
     *        For your first request to <code>ListTrafficPolicyVersions</code>, do not include the
     *        <code>TrafficPolicyVersionMarker</code> parameter.</p>
     *        <p>
     *        If you have more traffic policy versions than the value of <code>MaxItems</code>,
     *        <code>ListTrafficPolicyVersions</code> returns only the first group of <code>MaxItems</code> versions. To
     *        get the next group of <code>MaxItems</code> traffic policy versions, submit another request to
     *        <code>ListTrafficPolicyVersions</code>. For the value of <code>TrafficPolicyVersionMarker</code>, specify
     *        the value of the <code>TrafficPolicyVersionMarker</code> element that was returned in the previous
     *        response.
     *        </p>
     *        <p>
     *        Traffic policy versions are listed in sequential order.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPolicyVersionsRequest withTrafficPolicyVersionMarker(String trafficPolicyVersionMarker) {
        setTrafficPolicyVersionMarker(trafficPolicyVersionMarker);
        return this;
    }

    /**
     * <p>
     * The maximum number of traffic policy versions that you want Amazon Route 53 to include in the response body for
     * this request. If the specified traffic policy has more than <code>MaxItems</code> versions, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>, and the value of the
     * <code>TrafficPolicyVersionMarker</code> element is the ID of the first version in the next group of
     * <code>MaxItems</code> traffic policy versions.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of traffic policy versions that you want Amazon Route 53 to include in the response
     *        body for this request. If the specified traffic policy has more than <code>MaxItems</code> versions, the
     *        value of the <code>IsTruncated</code> element in the response is <code>true</code>, and the value of the
     *        <code>TrafficPolicyVersionMarker</code> element is the ID of the first version in the next group of
     *        <code>MaxItems</code> traffic policy versions.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of traffic policy versions that you want Amazon Route 53 to include in the response body for
     * this request. If the specified traffic policy has more than <code>MaxItems</code> versions, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>, and the value of the
     * <code>TrafficPolicyVersionMarker</code> element is the ID of the first version in the next group of
     * <code>MaxItems</code> traffic policy versions.
     * </p>
     * 
     * @return The maximum number of traffic policy versions that you want Amazon Route 53 to include in the response
     *         body for this request. If the specified traffic policy has more than <code>MaxItems</code> versions, the
     *         value of the <code>IsTruncated</code> element in the response is <code>true</code>, and the value of the
     *         <code>TrafficPolicyVersionMarker</code> element is the ID of the first version in the next group of
     *         <code>MaxItems</code> traffic policy versions.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of traffic policy versions that you want Amazon Route 53 to include in the response body for
     * this request. If the specified traffic policy has more than <code>MaxItems</code> versions, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>, and the value of the
     * <code>TrafficPolicyVersionMarker</code> element is the ID of the first version in the next group of
     * <code>MaxItems</code> traffic policy versions.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of traffic policy versions that you want Amazon Route 53 to include in the response
     *        body for this request. If the specified traffic policy has more than <code>MaxItems</code> versions, the
     *        value of the <code>IsTruncated</code> element in the response is <code>true</code>, and the value of the
     *        <code>TrafficPolicyVersionMarker</code> element is the ID of the first version in the next group of
     *        <code>MaxItems</code> traffic policy versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPolicyVersionsRequest withMaxItems(String maxItems) {
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
        if (getId() != null)
            sb.append("Id: " + getId() + ",");
        if (getTrafficPolicyVersionMarker() != null)
            sb.append("TrafficPolicyVersionMarker: " + getTrafficPolicyVersionMarker() + ",");
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

        if (obj instanceof ListTrafficPolicyVersionsRequest == false)
            return false;
        ListTrafficPolicyVersionsRequest other = (ListTrafficPolicyVersionsRequest) obj;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getTrafficPolicyVersionMarker() == null ^ this.getTrafficPolicyVersionMarker() == null)
            return false;
        if (other.getTrafficPolicyVersionMarker() != null && other.getTrafficPolicyVersionMarker().equals(this.getTrafficPolicyVersionMarker()) == false)
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

        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyVersionMarker() == null) ? 0 : getTrafficPolicyVersionMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListTrafficPolicyVersionsRequest clone() {
        return (ListTrafficPolicyVersionsRequest) super.clone();
    }
}
