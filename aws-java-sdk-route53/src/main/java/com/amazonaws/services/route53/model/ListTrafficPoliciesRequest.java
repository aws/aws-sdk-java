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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#listTrafficPolicies(ListTrafficPoliciesRequest) ListTrafficPolicies operation}.
 * <p>
 * Gets information about the latest version for every traffic policy
 * that is associated with the current AWS account. To get the
 * information, send a <code>GET</code> request to the
 * <code>2013-04-01/trafficpolicy</code> resource.
 * </p>
 * <p>
 * Amazon Route 53 returns a maximum of 100 items in each response. If
 * you have a lot of traffic policies, you can use the
 * <code>maxitems</code> parameter to list them in groups of up to 100.
 * </p>
 * <p>
 * The response includes three values that help you navigate from one
 * group of <code>maxitems</code> traffic policies to the next:
 * </p>
 * 
 * <ul>
 * <li> <b>IsTruncated</b> </li>
 * <p>
 * If the value of <code>IsTruncated</code> in the response is
 * <code>true</code> , there are more traffic policies associated with
 * the current AWS account.
 * </p>
 * <p>
 * If <code>IsTruncated</code> is <code>false</code> , this response
 * includes the last traffic policy that is associated with the current
 * account.
 * </p>
 * <li> <b>TrafficPolicyIdMarker</b> </li>
 * <p>
 * If <code>IsTruncated</code> is <code>true</code> ,
 * <code>TrafficPolicyIdMarker</code> is the ID of
 * the first traffic policy in the next group of <code>MaxItems</code>
 * traffic policies. If you want to list more traffic policies, make
 * another call to <code>ListTrafficPolicies</code> , and specify the
 * value of the <code>TrafficPolicyIdMarker</code> element from the
 * response in the <code>TrafficPolicyIdMarker</code> request parameter.
 * </p>
 * <p>
 * If <code>IsTruncated</code> is <code>false</code> , the
 * <code>TrafficPolicyIdMarker</code> element is omitted from the
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
 * @see com.amazonaws.services.route53.AmazonRoute53#listTrafficPolicies(ListTrafficPoliciesRequest)
 */
public class ListTrafficPoliciesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * For your first request to <code>ListTrafficPolicies</code>, do not
     * include the <code>TrafficPolicyIdMarker</code> parameter. <p>If you
     * have more traffic policies than the value of <code>MaxItems</code>,
     * <code>ListTrafficPolicies</code> returns only the first
     * <code>MaxItems</code> traffic policies. To get the next group of
     * <code>MaxItems</code> policies, submit another request to
     * <code>ListTrafficPolicies</code>. For the value of
     * <code>TrafficPolicyIdMarker</code>, specify the value of the
     * <code>TrafficPolicyIdMarker</code> element that was returned in the
     * previous response. <p>Policies are listed in the order in which they
     * were created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     */
    private String trafficPolicyIdMarker;

    /**
     * The maximum number of traffic policies to be included in the response
     * body for this request. If you have more than <code>MaxItems</code>
     * traffic policies, the value of the <code>IsTruncated</code> element in
     * the response is <code>true</code>, and the value of the
     * <code>TrafficPolicyIdMarker</code> element is the ID of the first
     * traffic policy in the next group of <code>MaxItems</code> traffic
     * policies.
     */
    private String maxItems;

    /**
     * For your first request to <code>ListTrafficPolicies</code>, do not
     * include the <code>TrafficPolicyIdMarker</code> parameter. <p>If you
     * have more traffic policies than the value of <code>MaxItems</code>,
     * <code>ListTrafficPolicies</code> returns only the first
     * <code>MaxItems</code> traffic policies. To get the next group of
     * <code>MaxItems</code> policies, submit another request to
     * <code>ListTrafficPolicies</code>. For the value of
     * <code>TrafficPolicyIdMarker</code>, specify the value of the
     * <code>TrafficPolicyIdMarker</code> element that was returned in the
     * previous response. <p>Policies are listed in the order in which they
     * were created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @return For your first request to <code>ListTrafficPolicies</code>, do not
     *         include the <code>TrafficPolicyIdMarker</code> parameter. <p>If you
     *         have more traffic policies than the value of <code>MaxItems</code>,
     *         <code>ListTrafficPolicies</code> returns only the first
     *         <code>MaxItems</code> traffic policies. To get the next group of
     *         <code>MaxItems</code> policies, submit another request to
     *         <code>ListTrafficPolicies</code>. For the value of
     *         <code>TrafficPolicyIdMarker</code>, specify the value of the
     *         <code>TrafficPolicyIdMarker</code> element that was returned in the
     *         previous response. <p>Policies are listed in the order in which they
     *         were created.
     */
    public String getTrafficPolicyIdMarker() {
        return trafficPolicyIdMarker;
    }
    
    /**
     * For your first request to <code>ListTrafficPolicies</code>, do not
     * include the <code>TrafficPolicyIdMarker</code> parameter. <p>If you
     * have more traffic policies than the value of <code>MaxItems</code>,
     * <code>ListTrafficPolicies</code> returns only the first
     * <code>MaxItems</code> traffic policies. To get the next group of
     * <code>MaxItems</code> policies, submit another request to
     * <code>ListTrafficPolicies</code>. For the value of
     * <code>TrafficPolicyIdMarker</code>, specify the value of the
     * <code>TrafficPolicyIdMarker</code> element that was returned in the
     * previous response. <p>Policies are listed in the order in which they
     * were created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param trafficPolicyIdMarker For your first request to <code>ListTrafficPolicies</code>, do not
     *         include the <code>TrafficPolicyIdMarker</code> parameter. <p>If you
     *         have more traffic policies than the value of <code>MaxItems</code>,
     *         <code>ListTrafficPolicies</code> returns only the first
     *         <code>MaxItems</code> traffic policies. To get the next group of
     *         <code>MaxItems</code> policies, submit another request to
     *         <code>ListTrafficPolicies</code>. For the value of
     *         <code>TrafficPolicyIdMarker</code>, specify the value of the
     *         <code>TrafficPolicyIdMarker</code> element that was returned in the
     *         previous response. <p>Policies are listed in the order in which they
     *         were created.
     */
    public void setTrafficPolicyIdMarker(String trafficPolicyIdMarker) {
        this.trafficPolicyIdMarker = trafficPolicyIdMarker;
    }
    
    /**
     * For your first request to <code>ListTrafficPolicies</code>, do not
     * include the <code>TrafficPolicyIdMarker</code> parameter. <p>If you
     * have more traffic policies than the value of <code>MaxItems</code>,
     * <code>ListTrafficPolicies</code> returns only the first
     * <code>MaxItems</code> traffic policies. To get the next group of
     * <code>MaxItems</code> policies, submit another request to
     * <code>ListTrafficPolicies</code>. For the value of
     * <code>TrafficPolicyIdMarker</code>, specify the value of the
     * <code>TrafficPolicyIdMarker</code> element that was returned in the
     * previous response. <p>Policies are listed in the order in which they
     * were created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 36<br/>
     *
     * @param trafficPolicyIdMarker For your first request to <code>ListTrafficPolicies</code>, do not
     *         include the <code>TrafficPolicyIdMarker</code> parameter. <p>If you
     *         have more traffic policies than the value of <code>MaxItems</code>,
     *         <code>ListTrafficPolicies</code> returns only the first
     *         <code>MaxItems</code> traffic policies. To get the next group of
     *         <code>MaxItems</code> policies, submit another request to
     *         <code>ListTrafficPolicies</code>. For the value of
     *         <code>TrafficPolicyIdMarker</code>, specify the value of the
     *         <code>TrafficPolicyIdMarker</code> element that was returned in the
     *         previous response. <p>Policies are listed in the order in which they
     *         were created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPoliciesRequest withTrafficPolicyIdMarker(String trafficPolicyIdMarker) {
        this.trafficPolicyIdMarker = trafficPolicyIdMarker;
        return this;
    }

    /**
     * The maximum number of traffic policies to be included in the response
     * body for this request. If you have more than <code>MaxItems</code>
     * traffic policies, the value of the <code>IsTruncated</code> element in
     * the response is <code>true</code>, and the value of the
     * <code>TrafficPolicyIdMarker</code> element is the ID of the first
     * traffic policy in the next group of <code>MaxItems</code> traffic
     * policies.
     *
     * @return The maximum number of traffic policies to be included in the response
     *         body for this request. If you have more than <code>MaxItems</code>
     *         traffic policies, the value of the <code>IsTruncated</code> element in
     *         the response is <code>true</code>, and the value of the
     *         <code>TrafficPolicyIdMarker</code> element is the ID of the first
     *         traffic policy in the next group of <code>MaxItems</code> traffic
     *         policies.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The maximum number of traffic policies to be included in the response
     * body for this request. If you have more than <code>MaxItems</code>
     * traffic policies, the value of the <code>IsTruncated</code> element in
     * the response is <code>true</code>, and the value of the
     * <code>TrafficPolicyIdMarker</code> element is the ID of the first
     * traffic policy in the next group of <code>MaxItems</code> traffic
     * policies.
     *
     * @param maxItems The maximum number of traffic policies to be included in the response
     *         body for this request. If you have more than <code>MaxItems</code>
     *         traffic policies, the value of the <code>IsTruncated</code> element in
     *         the response is <code>true</code>, and the value of the
     *         <code>TrafficPolicyIdMarker</code> element is the ID of the first
     *         traffic policy in the next group of <code>MaxItems</code> traffic
     *         policies.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The maximum number of traffic policies to be included in the response
     * body for this request. If you have more than <code>MaxItems</code>
     * traffic policies, the value of the <code>IsTruncated</code> element in
     * the response is <code>true</code>, and the value of the
     * <code>TrafficPolicyIdMarker</code> element is the ID of the first
     * traffic policy in the next group of <code>MaxItems</code> traffic
     * policies.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The maximum number of traffic policies to be included in the response
     *         body for this request. If you have more than <code>MaxItems</code>
     *         traffic policies, the value of the <code>IsTruncated</code> element in
     *         the response is <code>true</code>, and the value of the
     *         <code>TrafficPolicyIdMarker</code> element is the ID of the first
     *         traffic policy in the next group of <code>MaxItems</code> traffic
     *         policies.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPoliciesRequest withMaxItems(String maxItems) {
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
        if (getTrafficPolicyIdMarker() != null) sb.append("TrafficPolicyIdMarker: " + getTrafficPolicyIdMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTrafficPolicyIdMarker() == null) ? 0 : getTrafficPolicyIdMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTrafficPoliciesRequest == false) return false;
        ListTrafficPoliciesRequest other = (ListTrafficPoliciesRequest)obj;
        
        if (other.getTrafficPolicyIdMarker() == null ^ this.getTrafficPolicyIdMarker() == null) return false;
        if (other.getTrafficPolicyIdMarker() != null && other.getTrafficPolicyIdMarker().equals(this.getTrafficPolicyIdMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTrafficPoliciesRequest clone() {
        
            return (ListTrafficPoliciesRequest) super.clone();
    }

}
    