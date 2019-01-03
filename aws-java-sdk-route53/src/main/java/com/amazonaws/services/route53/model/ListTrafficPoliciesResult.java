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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicies" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrafficPoliciesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list that contains one <code>TrafficPolicySummary</code> element for each traffic policy that was created by
     * the current AWS account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrafficPolicySummary> trafficPolicySummaries;
    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you
     * can get the next group of traffic policies by submitting another <code>ListTrafficPolicies</code> request and
     * specifying the value of <code>TrafficPolicyIdMarker</code> in the <code>TrafficPolicyIdMarker</code> request
     * parameter.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * If the value of <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyIdMarker</code> is the ID of
     * the first traffic policy in the next group of <code>MaxItems</code> traffic policies.
     * </p>
     */
    private String trafficPolicyIdMarker;
    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the <code>ListTrafficPolicies</code>
     * request that produced the current response.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A list that contains one <code>TrafficPolicySummary</code> element for each traffic policy that was created by
     * the current AWS account.
     * </p>
     * 
     * @return A list that contains one <code>TrafficPolicySummary</code> element for each traffic policy that was
     *         created by the current AWS account.
     */

    public java.util.List<TrafficPolicySummary> getTrafficPolicySummaries() {
        if (trafficPolicySummaries == null) {
            trafficPolicySummaries = new com.amazonaws.internal.SdkInternalList<TrafficPolicySummary>();
        }
        return trafficPolicySummaries;
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicySummary</code> element for each traffic policy that was created by
     * the current AWS account.
     * </p>
     * 
     * @param trafficPolicySummaries
     *        A list that contains one <code>TrafficPolicySummary</code> element for each traffic policy that was
     *        created by the current AWS account.
     */

    public void setTrafficPolicySummaries(java.util.Collection<TrafficPolicySummary> trafficPolicySummaries) {
        if (trafficPolicySummaries == null) {
            this.trafficPolicySummaries = null;
            return;
        }

        this.trafficPolicySummaries = new com.amazonaws.internal.SdkInternalList<TrafficPolicySummary>(trafficPolicySummaries);
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicySummary</code> element for each traffic policy that was created by
     * the current AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrafficPolicySummaries(java.util.Collection)} or
     * {@link #withTrafficPolicySummaries(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param trafficPolicySummaries
     *        A list that contains one <code>TrafficPolicySummary</code> element for each traffic policy that was
     *        created by the current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPoliciesResult withTrafficPolicySummaries(TrafficPolicySummary... trafficPolicySummaries) {
        if (this.trafficPolicySummaries == null) {
            setTrafficPolicySummaries(new com.amazonaws.internal.SdkInternalList<TrafficPolicySummary>(trafficPolicySummaries.length));
        }
        for (TrafficPolicySummary ele : trafficPolicySummaries) {
            this.trafficPolicySummaries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicySummary</code> element for each traffic policy that was created by
     * the current AWS account.
     * </p>
     * 
     * @param trafficPolicySummaries
     *        A list that contains one <code>TrafficPolicySummary</code> element for each traffic policy that was
     *        created by the current AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPoliciesResult withTrafficPolicySummaries(java.util.Collection<TrafficPolicySummary> trafficPolicySummaries) {
        setTrafficPolicySummaries(trafficPolicySummaries);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you
     * can get the next group of traffic policies by submitting another <code>ListTrafficPolicies</code> request and
     * specifying the value of <code>TrafficPolicyIdMarker</code> in the <code>TrafficPolicyIdMarker</code> request
     * parameter.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more traffic policies to be listed. If the response was truncated,
     *        you can get the next group of traffic policies by submitting another <code>ListTrafficPolicies</code>
     *        request and specifying the value of <code>TrafficPolicyIdMarker</code> in the
     *        <code>TrafficPolicyIdMarker</code> request parameter.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you
     * can get the next group of traffic policies by submitting another <code>ListTrafficPolicies</code> request and
     * specifying the value of <code>TrafficPolicyIdMarker</code> in the <code>TrafficPolicyIdMarker</code> request
     * parameter.
     * </p>
     * 
     * @return A flag that indicates whether there are more traffic policies to be listed. If the response was
     *         truncated, you can get the next group of traffic policies by submitting another
     *         <code>ListTrafficPolicies</code> request and specifying the value of <code>TrafficPolicyIdMarker</code>
     *         in the <code>TrafficPolicyIdMarker</code> request parameter.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you
     * can get the next group of traffic policies by submitting another <code>ListTrafficPolicies</code> request and
     * specifying the value of <code>TrafficPolicyIdMarker</code> in the <code>TrafficPolicyIdMarker</code> request
     * parameter.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more traffic policies to be listed. If the response was truncated,
     *        you can get the next group of traffic policies by submitting another <code>ListTrafficPolicies</code>
     *        request and specifying the value of <code>TrafficPolicyIdMarker</code> in the
     *        <code>TrafficPolicyIdMarker</code> request parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPoliciesResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policies to be listed. If the response was truncated, you
     * can get the next group of traffic policies by submitting another <code>ListTrafficPolicies</code> request and
     * specifying the value of <code>TrafficPolicyIdMarker</code> in the <code>TrafficPolicyIdMarker</code> request
     * parameter.
     * </p>
     * 
     * @return A flag that indicates whether there are more traffic policies to be listed. If the response was
     *         truncated, you can get the next group of traffic policies by submitting another
     *         <code>ListTrafficPolicies</code> request and specifying the value of <code>TrafficPolicyIdMarker</code>
     *         in the <code>TrafficPolicyIdMarker</code> request parameter.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyIdMarker</code> is the ID of
     * the first traffic policy in the next group of <code>MaxItems</code> traffic policies.
     * </p>
     * 
     * @param trafficPolicyIdMarker
     *        If the value of <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyIdMarker</code> is the
     *        ID of the first traffic policy in the next group of <code>MaxItems</code> traffic policies.
     */

    public void setTrafficPolicyIdMarker(String trafficPolicyIdMarker) {
        this.trafficPolicyIdMarker = trafficPolicyIdMarker;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyIdMarker</code> is the ID of
     * the first traffic policy in the next group of <code>MaxItems</code> traffic policies.
     * </p>
     * 
     * @return If the value of <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyIdMarker</code> is the
     *         ID of the first traffic policy in the next group of <code>MaxItems</code> traffic policies.
     */

    public String getTrafficPolicyIdMarker() {
        return this.trafficPolicyIdMarker;
    }

    /**
     * <p>
     * If the value of <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyIdMarker</code> is the ID of
     * the first traffic policy in the next group of <code>MaxItems</code> traffic policies.
     * </p>
     * 
     * @param trafficPolicyIdMarker
     *        If the value of <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyIdMarker</code> is the
     *        ID of the first traffic policy in the next group of <code>MaxItems</code> traffic policies.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPoliciesResult withTrafficPolicyIdMarker(String trafficPolicyIdMarker) {
        setTrafficPolicyIdMarker(trafficPolicyIdMarker);
        return this;
    }

    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the <code>ListTrafficPolicies</code>
     * request that produced the current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>MaxItems</code> parameter in the
     *        <code>ListTrafficPolicies</code> request that produced the current response.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the <code>ListTrafficPolicies</code>
     * request that produced the current response.
     * </p>
     * 
     * @return The value that you specified for the <code>MaxItems</code> parameter in the
     *         <code>ListTrafficPolicies</code> request that produced the current response.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the <code>ListTrafficPolicies</code>
     * request that produced the current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>MaxItems</code> parameter in the
     *        <code>ListTrafficPolicies</code> request that produced the current response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPoliciesResult withMaxItems(String maxItems) {
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
        if (getTrafficPolicySummaries() != null)
            sb.append("TrafficPolicySummaries: ").append(getTrafficPolicySummaries()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
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

        if (obj instanceof ListTrafficPoliciesResult == false)
            return false;
        ListTrafficPoliciesResult other = (ListTrafficPoliciesResult) obj;
        if (other.getTrafficPolicySummaries() == null ^ this.getTrafficPolicySummaries() == null)
            return false;
        if (other.getTrafficPolicySummaries() != null && other.getTrafficPolicySummaries().equals(this.getTrafficPolicySummaries()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
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

        hashCode = prime * hashCode + ((getTrafficPolicySummaries() == null) ? 0 : getTrafficPolicySummaries().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyIdMarker() == null) ? 0 : getTrafficPolicyIdMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListTrafficPoliciesResult clone() {
        try {
            return (ListTrafficPoliciesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
