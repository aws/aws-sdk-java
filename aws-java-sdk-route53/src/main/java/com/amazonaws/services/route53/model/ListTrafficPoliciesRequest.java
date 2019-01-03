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
 * A complex type that contains the information about the request to list the traffic policies that are associated with
 * the current AWS account.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrafficPoliciesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * (Conditional) For your first request to <code>ListTrafficPolicies</code>, don't include the
     * <code>TrafficPolicyIdMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policies than the value of <code>MaxItems</code>, <code>ListTrafficPolicies</code>
     * returns only the first <code>MaxItems</code> traffic policies. To get the next group of policies, submit another
     * request to <code>ListTrafficPolicies</code>. For the value of <code>TrafficPolicyIdMarker</code>, specify the
     * value of <code>TrafficPolicyIdMarker</code> that was returned in the previous response.
     * </p>
     */
    private String trafficPolicyIdMarker;
    /**
     * <p>
     * (Optional) The maximum number of traffic policies that you want Amazon Route 53 to return in response to this
     * request. If you have more than <code>MaxItems</code> traffic policies, the value of <code>IsTruncated</code> in
     * the response is <code>true</code>, and the value of <code>TrafficPolicyIdMarker</code> is the ID of the first
     * traffic policy that Route 53 will return if you submit another request.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * (Conditional) For your first request to <code>ListTrafficPolicies</code>, don't include the
     * <code>TrafficPolicyIdMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policies than the value of <code>MaxItems</code>, <code>ListTrafficPolicies</code>
     * returns only the first <code>MaxItems</code> traffic policies. To get the next group of policies, submit another
     * request to <code>ListTrafficPolicies</code>. For the value of <code>TrafficPolicyIdMarker</code>, specify the
     * value of <code>TrafficPolicyIdMarker</code> that was returned in the previous response.
     * </p>
     * 
     * @param trafficPolicyIdMarker
     *        (Conditional) For your first request to <code>ListTrafficPolicies</code>, don't include the
     *        <code>TrafficPolicyIdMarker</code> parameter.</p>
     *        <p>
     *        If you have more traffic policies than the value of <code>MaxItems</code>,
     *        <code>ListTrafficPolicies</code> returns only the first <code>MaxItems</code> traffic policies. To get the
     *        next group of policies, submit another request to <code>ListTrafficPolicies</code>. For the value of
     *        <code>TrafficPolicyIdMarker</code>, specify the value of <code>TrafficPolicyIdMarker</code> that was
     *        returned in the previous response.
     */

    public void setTrafficPolicyIdMarker(String trafficPolicyIdMarker) {
        this.trafficPolicyIdMarker = trafficPolicyIdMarker;
    }

    /**
     * <p>
     * (Conditional) For your first request to <code>ListTrafficPolicies</code>, don't include the
     * <code>TrafficPolicyIdMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policies than the value of <code>MaxItems</code>, <code>ListTrafficPolicies</code>
     * returns only the first <code>MaxItems</code> traffic policies. To get the next group of policies, submit another
     * request to <code>ListTrafficPolicies</code>. For the value of <code>TrafficPolicyIdMarker</code>, specify the
     * value of <code>TrafficPolicyIdMarker</code> that was returned in the previous response.
     * </p>
     * 
     * @return (Conditional) For your first request to <code>ListTrafficPolicies</code>, don't include the
     *         <code>TrafficPolicyIdMarker</code> parameter.</p>
     *         <p>
     *         If you have more traffic policies than the value of <code>MaxItems</code>,
     *         <code>ListTrafficPolicies</code> returns only the first <code>MaxItems</code> traffic policies. To get
     *         the next group of policies, submit another request to <code>ListTrafficPolicies</code>. For the value of
     *         <code>TrafficPolicyIdMarker</code>, specify the value of <code>TrafficPolicyIdMarker</code> that was
     *         returned in the previous response.
     */

    public String getTrafficPolicyIdMarker() {
        return this.trafficPolicyIdMarker;
    }

    /**
     * <p>
     * (Conditional) For your first request to <code>ListTrafficPolicies</code>, don't include the
     * <code>TrafficPolicyIdMarker</code> parameter.
     * </p>
     * <p>
     * If you have more traffic policies than the value of <code>MaxItems</code>, <code>ListTrafficPolicies</code>
     * returns only the first <code>MaxItems</code> traffic policies. To get the next group of policies, submit another
     * request to <code>ListTrafficPolicies</code>. For the value of <code>TrafficPolicyIdMarker</code>, specify the
     * value of <code>TrafficPolicyIdMarker</code> that was returned in the previous response.
     * </p>
     * 
     * @param trafficPolicyIdMarker
     *        (Conditional) For your first request to <code>ListTrafficPolicies</code>, don't include the
     *        <code>TrafficPolicyIdMarker</code> parameter.</p>
     *        <p>
     *        If you have more traffic policies than the value of <code>MaxItems</code>,
     *        <code>ListTrafficPolicies</code> returns only the first <code>MaxItems</code> traffic policies. To get the
     *        next group of policies, submit another request to <code>ListTrafficPolicies</code>. For the value of
     *        <code>TrafficPolicyIdMarker</code>, specify the value of <code>TrafficPolicyIdMarker</code> that was
     *        returned in the previous response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPoliciesRequest withTrafficPolicyIdMarker(String trafficPolicyIdMarker) {
        setTrafficPolicyIdMarker(trafficPolicyIdMarker);
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of traffic policies that you want Amazon Route 53 to return in response to this
     * request. If you have more than <code>MaxItems</code> traffic policies, the value of <code>IsTruncated</code> in
     * the response is <code>true</code>, and the value of <code>TrafficPolicyIdMarker</code> is the ID of the first
     * traffic policy that Route 53 will return if you submit another request.
     * </p>
     * 
     * @param maxItems
     *        (Optional) The maximum number of traffic policies that you want Amazon Route 53 to return in response to
     *        this request. If you have more than <code>MaxItems</code> traffic policies, the value of
     *        <code>IsTruncated</code> in the response is <code>true</code>, and the value of
     *        <code>TrafficPolicyIdMarker</code> is the ID of the first traffic policy that Route 53 will return if you
     *        submit another request.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of traffic policies that you want Amazon Route 53 to return in response to this
     * request. If you have more than <code>MaxItems</code> traffic policies, the value of <code>IsTruncated</code> in
     * the response is <code>true</code>, and the value of <code>TrafficPolicyIdMarker</code> is the ID of the first
     * traffic policy that Route 53 will return if you submit another request.
     * </p>
     * 
     * @return (Optional) The maximum number of traffic policies that you want Amazon Route 53 to return in response to
     *         this request. If you have more than <code>MaxItems</code> traffic policies, the value of
     *         <code>IsTruncated</code> in the response is <code>true</code>, and the value of
     *         <code>TrafficPolicyIdMarker</code> is the ID of the first traffic policy that Route 53 will return if you
     *         submit another request.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of traffic policies that you want Amazon Route 53 to return in response to this
     * request. If you have more than <code>MaxItems</code> traffic policies, the value of <code>IsTruncated</code> in
     * the response is <code>true</code>, and the value of <code>TrafficPolicyIdMarker</code> is the ID of the first
     * traffic policy that Route 53 will return if you submit another request.
     * </p>
     * 
     * @param maxItems
     *        (Optional) The maximum number of traffic policies that you want Amazon Route 53 to return in response to
     *        this request. If you have more than <code>MaxItems</code> traffic policies, the value of
     *        <code>IsTruncated</code> in the response is <code>true</code>, and the value of
     *        <code>TrafficPolicyIdMarker</code> is the ID of the first traffic policy that Route 53 will return if you
     *        submit another request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPoliciesRequest withMaxItems(String maxItems) {
        setMaxItems(maxItems);
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
        if (getTrafficPolicyIdMarker() != null)
            sb.append("TrafficPolicyIdMarker: ").append(getTrafficPolicyIdMarker()).append(",");
        if (getMaxItems() != null)
            sb.append("MaxItems: ").append(getMaxItems());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTrafficPoliciesRequest == false)
            return false;
        ListTrafficPoliciesRequest other = (ListTrafficPoliciesRequest) obj;
        if (other.getTrafficPolicyIdMarker() == null ^ this.getTrafficPolicyIdMarker() == null)
            return false;
        if (other.getTrafficPolicyIdMarker() != null && other.getTrafficPolicyIdMarker().equals(this.getTrafficPolicyIdMarker()) == false)
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

        hashCode = prime * hashCode + ((getTrafficPolicyIdMarker() == null) ? 0 : getTrafficPolicyIdMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListTrafficPoliciesRequest clone() {
        return (ListTrafficPoliciesRequest) super.clone();
    }

}
