/*
 * Copyright 2010-2015 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#listTrafficPolicyVersions(ListTrafficPolicyVersionsRequest) ListTrafficPolicyVersions operation}.
 * <p>
 * Gets information about all of the versions for a specified traffic
 * policy. <code>ListTrafficPolicyVersions</code> lists only versions
 * that have not been deleted.
 * </p>
 * <p>
 * Amazon Route 53 returns a maximum of 100 items in each response. If
 * you have a lot of traffic policies, you can use the
 * <code>maxitems</code> parameter to list them in groups of up to 100.
 * </p>
 * <p>
 * The response includes three values that help you navigate from one
 * group of <code>maxitems</code> maxitems traffic policies to the next:
 * </p>
 * 
 * <ul>
 * <li> <b>IsTruncated</b> </li>
 * <p>
 * If the value of <code>IsTruncated</code> in the response is
 * <code>true</code> , there are more traffic policy versions associated
 * with the specified traffic policy.
 * </p>
 * <p>
 * If <code>IsTruncated</code> is <code>false</code> , this response
 * includes the last traffic policy version that is associated with the
 * specified traffic policy.
 * </p>
 * <li> <b>TrafficPolicyVersionMarker</b> </li>
 * <p>
 * The ID of the next traffic policy version that is associated with the
 * current AWS account. If you want to list more traffic policies, make
 * another call to <code>ListTrafficPolicyVersions</code> , and specify
 * the value of the <code>TrafficPolicyVersionMarker</code> element in
 * the <code>TrafficPolicyVersionMarker</code> request parameter.
 * </p>
 * <p>
 * If <code>IsTruncated</code> is <code>false</code> , Amazon Route 53
 * omits the <code>TrafficPolicyVersionMarker</code> element from the
 * response.
 * </p>
 * <li> <b>MaxItems</b> </li>
 * <p>
 * The value that you specified for the <code>MaxItems</code> parameter
 * in the request that produced the current response.
 * </p>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#listTrafficPolicyVersions(ListTrafficPolicyVersionsRequest)
 */
public class ListTrafficPolicyVersionsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * Specify the value of <code>Id</code> of the traffic policy for which
     * you want to list all versions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     */
    private String id;

    /**
     * For your first request to <code>ListTrafficPolicyVersions</code>, do
     * not include the <code>TrafficPolicyVersionMarker</code> parameter.
     * <p>If you have more traffic policy versions than the value of
     * <code>MaxItems</code>, <code>ListTrafficPolicyVersions</code> returns
     * only the first group of <code>MaxItems</code> versions. To get the
     * next group of <code>MaxItems</code> traffic policy versions, submit
     * another request to <code>ListTrafficPolicyVersions</code>. For the
     * value of <code>TrafficPolicyVersionMarker</code>, specify the value of
     * the <code>TrafficPolicyVersionMarker</code> element that was returned
     * in the previous response. <p>Traffic policy versions are listed in
     * sequential order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4<br/>
     */
    private String trafficPolicyVersionMarker;

    /**
     * The maximum number of traffic policy versions that you want Amazon
     * Route 53 to include in the response body for this request. If the
     * specified traffic policy has more than <code>MaxItems</code> versions,
     * the value of the <code>IsTruncated</code> element in the response is
     * <code>true</code>, and the value of the
     * <code>TrafficPolicyVersionMarker</code> element is the ID of the first
     * version in the next group of <code>MaxItems</code> traffic policy
     * versions.
     */
    private String maxItems;

    /**
     * Specify the value of <code>Id</code> of the traffic policy for which
     * you want to list all versions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @return Specify the value of <code>Id</code> of the traffic policy for which
     *         you want to list all versions.
     */
    public String getId() {
        return id;
    }
    
    /**
     * Specify the value of <code>Id</code> of the traffic policy for which
     * you want to list all versions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param id Specify the value of <code>Id</code> of the traffic policy for which
     *         you want to list all versions.
     */
    public void setId(String id) {
        this.id = id;
    }
    
    /**
     * Specify the value of <code>Id</code> of the traffic policy for which
     * you want to list all versions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param id Specify the value of <code>Id</code> of the traffic policy for which
     *         you want to list all versions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyVersionsRequest withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * For your first request to <code>ListTrafficPolicyVersions</code>, do
     * not include the <code>TrafficPolicyVersionMarker</code> parameter.
     * <p>If you have more traffic policy versions than the value of
     * <code>MaxItems</code>, <code>ListTrafficPolicyVersions</code> returns
     * only the first group of <code>MaxItems</code> versions. To get the
     * next group of <code>MaxItems</code> traffic policy versions, submit
     * another request to <code>ListTrafficPolicyVersions</code>. For the
     * value of <code>TrafficPolicyVersionMarker</code>, specify the value of
     * the <code>TrafficPolicyVersionMarker</code> element that was returned
     * in the previous response. <p>Traffic policy versions are listed in
     * sequential order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4<br/>
     *
     * @return For your first request to <code>ListTrafficPolicyVersions</code>, do
     *         not include the <code>TrafficPolicyVersionMarker</code> parameter.
     *         <p>If you have more traffic policy versions than the value of
     *         <code>MaxItems</code>, <code>ListTrafficPolicyVersions</code> returns
     *         only the first group of <code>MaxItems</code> versions. To get the
     *         next group of <code>MaxItems</code> traffic policy versions, submit
     *         another request to <code>ListTrafficPolicyVersions</code>. For the
     *         value of <code>TrafficPolicyVersionMarker</code>, specify the value of
     *         the <code>TrafficPolicyVersionMarker</code> element that was returned
     *         in the previous response. <p>Traffic policy versions are listed in
     *         sequential order.
     */
    public String getTrafficPolicyVersionMarker() {
        return trafficPolicyVersionMarker;
    }
    
    /**
     * For your first request to <code>ListTrafficPolicyVersions</code>, do
     * not include the <code>TrafficPolicyVersionMarker</code> parameter.
     * <p>If you have more traffic policy versions than the value of
     * <code>MaxItems</code>, <code>ListTrafficPolicyVersions</code> returns
     * only the first group of <code>MaxItems</code> versions. To get the
     * next group of <code>MaxItems</code> traffic policy versions, submit
     * another request to <code>ListTrafficPolicyVersions</code>. For the
     * value of <code>TrafficPolicyVersionMarker</code>, specify the value of
     * the <code>TrafficPolicyVersionMarker</code> element that was returned
     * in the previous response. <p>Traffic policy versions are listed in
     * sequential order.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4<br/>
     *
     * @param trafficPolicyVersionMarker For your first request to <code>ListTrafficPolicyVersions</code>, do
     *         not include the <code>TrafficPolicyVersionMarker</code> parameter.
     *         <p>If you have more traffic policy versions than the value of
     *         <code>MaxItems</code>, <code>ListTrafficPolicyVersions</code> returns
     *         only the first group of <code>MaxItems</code> versions. To get the
     *         next group of <code>MaxItems</code> traffic policy versions, submit
     *         another request to <code>ListTrafficPolicyVersions</code>. For the
     *         value of <code>TrafficPolicyVersionMarker</code>, specify the value of
     *         the <code>TrafficPolicyVersionMarker</code> element that was returned
     *         in the previous response. <p>Traffic policy versions are listed in
     *         sequential order.
     */
    public void setTrafficPolicyVersionMarker(String trafficPolicyVersionMarker) {
        this.trafficPolicyVersionMarker = trafficPolicyVersionMarker;
    }
    
    /**
     * For your first request to <code>ListTrafficPolicyVersions</code>, do
     * not include the <code>TrafficPolicyVersionMarker</code> parameter.
     * <p>If you have more traffic policy versions than the value of
     * <code>MaxItems</code>, <code>ListTrafficPolicyVersions</code> returns
     * only the first group of <code>MaxItems</code> versions. To get the
     * next group of <code>MaxItems</code> traffic policy versions, submit
     * another request to <code>ListTrafficPolicyVersions</code>. For the
     * value of <code>TrafficPolicyVersionMarker</code>, specify the value of
     * the <code>TrafficPolicyVersionMarker</code> element that was returned
     * in the previous response. <p>Traffic policy versions are listed in
     * sequential order.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4<br/>
     *
     * @param trafficPolicyVersionMarker For your first request to <code>ListTrafficPolicyVersions</code>, do
     *         not include the <code>TrafficPolicyVersionMarker</code> parameter.
     *         <p>If you have more traffic policy versions than the value of
     *         <code>MaxItems</code>, <code>ListTrafficPolicyVersions</code> returns
     *         only the first group of <code>MaxItems</code> versions. To get the
     *         next group of <code>MaxItems</code> traffic policy versions, submit
     *         another request to <code>ListTrafficPolicyVersions</code>. For the
     *         value of <code>TrafficPolicyVersionMarker</code>, specify the value of
     *         the <code>TrafficPolicyVersionMarker</code> element that was returned
     *         in the previous response. <p>Traffic policy versions are listed in
     *         sequential order.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyVersionsRequest withTrafficPolicyVersionMarker(String trafficPolicyVersionMarker) {
        this.trafficPolicyVersionMarker = trafficPolicyVersionMarker;
        return this;
    }

    /**
     * The maximum number of traffic policy versions that you want Amazon
     * Route 53 to include in the response body for this request. If the
     * specified traffic policy has more than <code>MaxItems</code> versions,
     * the value of the <code>IsTruncated</code> element in the response is
     * <code>true</code>, and the value of the
     * <code>TrafficPolicyVersionMarker</code> element is the ID of the first
     * version in the next group of <code>MaxItems</code> traffic policy
     * versions.
     *
     * @return The maximum number of traffic policy versions that you want Amazon
     *         Route 53 to include in the response body for this request. If the
     *         specified traffic policy has more than <code>MaxItems</code> versions,
     *         the value of the <code>IsTruncated</code> element in the response is
     *         <code>true</code>, and the value of the
     *         <code>TrafficPolicyVersionMarker</code> element is the ID of the first
     *         version in the next group of <code>MaxItems</code> traffic policy
     *         versions.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The maximum number of traffic policy versions that you want Amazon
     * Route 53 to include in the response body for this request. If the
     * specified traffic policy has more than <code>MaxItems</code> versions,
     * the value of the <code>IsTruncated</code> element in the response is
     * <code>true</code>, and the value of the
     * <code>TrafficPolicyVersionMarker</code> element is the ID of the first
     * version in the next group of <code>MaxItems</code> traffic policy
     * versions.
     *
     * @param maxItems The maximum number of traffic policy versions that you want Amazon
     *         Route 53 to include in the response body for this request. If the
     *         specified traffic policy has more than <code>MaxItems</code> versions,
     *         the value of the <code>IsTruncated</code> element in the response is
     *         <code>true</code>, and the value of the
     *         <code>TrafficPolicyVersionMarker</code> element is the ID of the first
     *         version in the next group of <code>MaxItems</code> traffic policy
     *         versions.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The maximum number of traffic policy versions that you want Amazon
     * Route 53 to include in the response body for this request. If the
     * specified traffic policy has more than <code>MaxItems</code> versions,
     * the value of the <code>IsTruncated</code> element in the response is
     * <code>true</code>, and the value of the
     * <code>TrafficPolicyVersionMarker</code> element is the ID of the first
     * version in the next group of <code>MaxItems</code> traffic policy
     * versions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The maximum number of traffic policy versions that you want Amazon
     *         Route 53 to include in the response body for this request. If the
     *         specified traffic policy has more than <code>MaxItems</code> versions,
     *         the value of the <code>IsTruncated</code> element in the response is
     *         <code>true</code>, and the value of the
     *         <code>TrafficPolicyVersionMarker</code> element is the ID of the first
     *         version in the next group of <code>MaxItems</code> traffic policy
     *         versions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyVersionsRequest withMaxItems(String maxItems) {
        this.maxItems = maxItems;
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
        if (getId() != null) sb.append("Id: " + getId() + ",");
        if (getTrafficPolicyVersionMarker() != null) sb.append("TrafficPolicyVersionMarker: " + getTrafficPolicyVersionMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTrafficPolicyVersionsRequest == false) return false;
        ListTrafficPolicyVersionsRequest other = (ListTrafficPolicyVersionsRequest)obj;
        
        if (other.getId() == null ^ this.getId() == null) return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false) return false; 
        if (other.getTrafficPolicyVersionMarker() == null ^ this.getTrafficPolicyVersionMarker() == null) return false;
        if (other.getTrafficPolicyVersionMarker() != null && other.getTrafficPolicyVersionMarker().equals(this.getTrafficPolicyVersionMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTrafficPolicyVersionsRequest clone() {
        
            return (ListTrafficPolicyVersionsRequest) super.clone();
    }

}
    