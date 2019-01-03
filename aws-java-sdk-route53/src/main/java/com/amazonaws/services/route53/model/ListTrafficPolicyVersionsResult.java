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

/**
 * <p>
 * A complex type that contains the response information for the request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicyVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrafficPolicyVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that contains one <code>TrafficPolicy</code> element for each traffic policy version that is associated
     * with the specified traffic policy.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrafficPolicy> trafficPolicies;
    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you
     * can get the next group of traffic policies by submitting another <code>ListTrafficPolicyVersions</code> request
     * and specifying the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>TrafficPolicyVersionMarker</code> identifies
     * the first traffic policy that Amazon Route 53 will return if you submit another request. Call
     * <code>ListTrafficPolicyVersions</code> again and specify the value of <code>TrafficPolicyVersionMarker</code> in
     * the <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     */
    private String trafficPolicyVersionMarker;
    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the
     * <code>ListTrafficPolicyVersions</code> request that produced the current response.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A list that contains one <code>TrafficPolicy</code> element for each traffic policy version that is associated
     * with the specified traffic policy.
     * </p>
     * 
     * @return A list that contains one <code>TrafficPolicy</code> element for each traffic policy version that is
     *         associated with the specified traffic policy.
     */

    public java.util.List<TrafficPolicy> getTrafficPolicies() {
        if (trafficPolicies == null) {
            trafficPolicies = new com.amazonaws.internal.SdkInternalList<TrafficPolicy>();
        }
        return trafficPolicies;
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicy</code> element for each traffic policy version that is associated
     * with the specified traffic policy.
     * </p>
     * 
     * @param trafficPolicies
     *        A list that contains one <code>TrafficPolicy</code> element for each traffic policy version that is
     *        associated with the specified traffic policy.
     */

    public void setTrafficPolicies(java.util.Collection<TrafficPolicy> trafficPolicies) {
        if (trafficPolicies == null) {
            this.trafficPolicies = null;
            return;
        }

        this.trafficPolicies = new com.amazonaws.internal.SdkInternalList<TrafficPolicy>(trafficPolicies);
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicy</code> element for each traffic policy version that is associated
     * with the specified traffic policy.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrafficPolicies(java.util.Collection)} or {@link #withTrafficPolicies(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param trafficPolicies
     *        A list that contains one <code>TrafficPolicy</code> element for each traffic policy version that is
     *        associated with the specified traffic policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPolicyVersionsResult withTrafficPolicies(TrafficPolicy... trafficPolicies) {
        if (this.trafficPolicies == null) {
            setTrafficPolicies(new com.amazonaws.internal.SdkInternalList<TrafficPolicy>(trafficPolicies.length));
        }
        for (TrafficPolicy ele : trafficPolicies) {
            this.trafficPolicies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicy</code> element for each traffic policy version that is associated
     * with the specified traffic policy.
     * </p>
     * 
     * @param trafficPolicies
     *        A list that contains one <code>TrafficPolicy</code> element for each traffic policy version that is
     *        associated with the specified traffic policy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPolicyVersionsResult withTrafficPolicies(java.util.Collection<TrafficPolicy> trafficPolicies) {
        setTrafficPolicies(trafficPolicies);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you
     * can get the next group of traffic policies by submitting another <code>ListTrafficPolicyVersions</code> request
     * and specifying the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more traffic policies to be listed. If the response was truncated,
     *        you can get the next group of traffic policies by submitting another
     *        <code>ListTrafficPolicyVersions</code> request and specifying the value of <code>NextMarker</code> in the
     *        <code>marker</code> parameter.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you
     * can get the next group of traffic policies by submitting another <code>ListTrafficPolicyVersions</code> request
     * and specifying the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @return A flag that indicates whether there are more traffic policies to be listed. If the response was
     *         truncated, you can get the next group of traffic policies by submitting another
     *         <code>ListTrafficPolicyVersions</code> request and specifying the value of <code>NextMarker</code> in the
     *         <code>marker</code> parameter.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you
     * can get the next group of traffic policies by submitting another <code>ListTrafficPolicyVersions</code> request
     * and specifying the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more traffic policies to be listed. If the response was truncated,
     *        you can get the next group of traffic policies by submitting another
     *        <code>ListTrafficPolicyVersions</code> request and specifying the value of <code>NextMarker</code> in the
     *        <code>marker</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPolicyVersionsResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you
     * can get the next group of traffic policies by submitting another <code>ListTrafficPolicyVersions</code> request
     * and specifying the value of <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @return A flag that indicates whether there are more traffic policies to be listed. If the response was
     *         truncated, you can get the next group of traffic policies by submitting another
     *         <code>ListTrafficPolicyVersions</code> request and specifying the value of <code>NextMarker</code> in the
     *         <code>marker</code> parameter.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>TrafficPolicyVersionMarker</code> identifies
     * the first traffic policy that Amazon Route 53 will return if you submit another request. Call
     * <code>ListTrafficPolicyVersions</code> again and specify the value of <code>TrafficPolicyVersionMarker</code> in
     * the <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     * 
     * @param trafficPolicyVersionMarker
     *        If <code>IsTruncated</code> is <code>true</code>, the value of <code>TrafficPolicyVersionMarker</code>
     *        identifies the first traffic policy that Amazon Route 53 will return if you submit another request. Call
     *        <code>ListTrafficPolicyVersions</code> again and specify the value of
     *        <code>TrafficPolicyVersionMarker</code> in the <code>TrafficPolicyVersionMarker</code> request
     *        parameter.</p>
     *        <p>
     *        This element is present only if <code>IsTruncated</code> is <code>true</code>.
     */

    public void setTrafficPolicyVersionMarker(String trafficPolicyVersionMarker) {
        this.trafficPolicyVersionMarker = trafficPolicyVersionMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>TrafficPolicyVersionMarker</code> identifies
     * the first traffic policy that Amazon Route 53 will return if you submit another request. Call
     * <code>ListTrafficPolicyVersions</code> again and specify the value of <code>TrafficPolicyVersionMarker</code> in
     * the <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     * 
     * @return If <code>IsTruncated</code> is <code>true</code>, the value of <code>TrafficPolicyVersionMarker</code>
     *         identifies the first traffic policy that Amazon Route 53 will return if you submit another request. Call
     *         <code>ListTrafficPolicyVersions</code> again and specify the value of
     *         <code>TrafficPolicyVersionMarker</code> in the <code>TrafficPolicyVersionMarker</code> request
     *         parameter.</p>
     *         <p>
     *         This element is present only if <code>IsTruncated</code> is <code>true</code>.
     */

    public String getTrafficPolicyVersionMarker() {
        return this.trafficPolicyVersionMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>TrafficPolicyVersionMarker</code> identifies
     * the first traffic policy that Amazon Route 53 will return if you submit another request. Call
     * <code>ListTrafficPolicyVersions</code> again and specify the value of <code>TrafficPolicyVersionMarker</code> in
     * the <code>TrafficPolicyVersionMarker</code> request parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     * 
     * @param trafficPolicyVersionMarker
     *        If <code>IsTruncated</code> is <code>true</code>, the value of <code>TrafficPolicyVersionMarker</code>
     *        identifies the first traffic policy that Amazon Route 53 will return if you submit another request. Call
     *        <code>ListTrafficPolicyVersions</code> again and specify the value of
     *        <code>TrafficPolicyVersionMarker</code> in the <code>TrafficPolicyVersionMarker</code> request
     *        parameter.</p>
     *        <p>
     *        This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPolicyVersionsResult withTrafficPolicyVersionMarker(String trafficPolicyVersionMarker) {
        setTrafficPolicyVersionMarker(trafficPolicyVersionMarker);
        return this;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the
     * <code>ListTrafficPolicyVersions</code> request that produced the current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>maxitems</code> parameter in the
     *        <code>ListTrafficPolicyVersions</code> request that produced the current response.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the
     * <code>ListTrafficPolicyVersions</code> request that produced the current response.
     * </p>
     * 
     * @return The value that you specified for the <code>maxitems</code> parameter in the
     *         <code>ListTrafficPolicyVersions</code> request that produced the current response.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the
     * <code>ListTrafficPolicyVersions</code> request that produced the current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>maxitems</code> parameter in the
     *        <code>ListTrafficPolicyVersions</code> request that produced the current response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPolicyVersionsResult withMaxItems(String maxItems) {
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
        if (getTrafficPolicies() != null)
            sb.append("TrafficPolicies: ").append(getTrafficPolicies()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
        if (getTrafficPolicyVersionMarker() != null)
            sb.append("TrafficPolicyVersionMarker: ").append(getTrafficPolicyVersionMarker()).append(",");
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

        if (obj instanceof ListTrafficPolicyVersionsResult == false)
            return false;
        ListTrafficPolicyVersionsResult other = (ListTrafficPolicyVersionsResult) obj;
        if (other.getTrafficPolicies() == null ^ this.getTrafficPolicies() == null)
            return false;
        if (other.getTrafficPolicies() != null && other.getTrafficPolicies().equals(this.getTrafficPolicies()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
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

        hashCode = prime * hashCode + ((getTrafficPolicies() == null) ? 0 : getTrafficPolicies().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyVersionMarker() == null) ? 0 : getTrafficPolicyVersionMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListTrafficPolicyVersionsResult clone() {
        try {
            return (ListTrafficPolicyVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
