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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTrafficPolicyInstancesByHostedZone"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTrafficPolicyInstancesByHostedZoneResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable,
        Cloneable {

    /**
     * <p>
     * A list that contains one <code>TrafficPolicyInstance</code> element for each traffic policy instance that matches
     * the elements in the request.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TrafficPolicyInstance> trafficPolicyInstances;
    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is the name of the
     * first traffic policy instance in the next group of traffic policy instances.
     * </p>
     */
    private String trafficPolicyInstanceNameMarker;
    /**
     * <p>
     * If <code>IsTruncated</code> is true, <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the resource
     * record sets that are associated with the first traffic policy instance in the next group of traffic policy
     * instances.
     * </p>
     */
    private String trafficPolicyInstanceTypeMarker;
    /**
     * <p>
     * A flag that indicates whether there are more traffic policy instances to be listed. If the response was
     * truncated, you can get the next group of traffic policy instances by submitting another
     * <code>ListTrafficPolicyInstancesByHostedZone</code> request and specifying the values of
     * <code>HostedZoneIdMarker</code>, <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding request parameters.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the
     * <code>ListTrafficPolicyInstancesByHostedZone</code> request that produced the current response.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A list that contains one <code>TrafficPolicyInstance</code> element for each traffic policy instance that matches
     * the elements in the request.
     * </p>
     * 
     * @return A list that contains one <code>TrafficPolicyInstance</code> element for each traffic policy instance that
     *         matches the elements in the request.
     */

    public java.util.List<TrafficPolicyInstance> getTrafficPolicyInstances() {
        if (trafficPolicyInstances == null) {
            trafficPolicyInstances = new com.amazonaws.internal.SdkInternalList<TrafficPolicyInstance>();
        }
        return trafficPolicyInstances;
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicyInstance</code> element for each traffic policy instance that matches
     * the elements in the request.
     * </p>
     * 
     * @param trafficPolicyInstances
     *        A list that contains one <code>TrafficPolicyInstance</code> element for each traffic policy instance that
     *        matches the elements in the request.
     */

    public void setTrafficPolicyInstances(java.util.Collection<TrafficPolicyInstance> trafficPolicyInstances) {
        if (trafficPolicyInstances == null) {
            this.trafficPolicyInstances = null;
            return;
        }

        this.trafficPolicyInstances = new com.amazonaws.internal.SdkInternalList<TrafficPolicyInstance>(trafficPolicyInstances);
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicyInstance</code> element for each traffic policy instance that matches
     * the elements in the request.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTrafficPolicyInstances(java.util.Collection)} or
     * {@link #withTrafficPolicyInstances(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param trafficPolicyInstances
     *        A list that contains one <code>TrafficPolicyInstance</code> element for each traffic policy instance that
     *        matches the elements in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPolicyInstancesByHostedZoneResult withTrafficPolicyInstances(TrafficPolicyInstance... trafficPolicyInstances) {
        if (this.trafficPolicyInstances == null) {
            setTrafficPolicyInstances(new com.amazonaws.internal.SdkInternalList<TrafficPolicyInstance>(trafficPolicyInstances.length));
        }
        for (TrafficPolicyInstance ele : trafficPolicyInstances) {
            this.trafficPolicyInstances.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list that contains one <code>TrafficPolicyInstance</code> element for each traffic policy instance that matches
     * the elements in the request.
     * </p>
     * 
     * @param trafficPolicyInstances
     *        A list that contains one <code>TrafficPolicyInstance</code> element for each traffic policy instance that
     *        matches the elements in the request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPolicyInstancesByHostedZoneResult withTrafficPolicyInstances(java.util.Collection<TrafficPolicyInstance> trafficPolicyInstances) {
        setTrafficPolicyInstances(trafficPolicyInstances);
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is the name of the
     * first traffic policy instance in the next group of traffic policy instances.
     * </p>
     * 
     * @param trafficPolicyInstanceNameMarker
     *        If <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is the name
     *        of the first traffic policy instance in the next group of traffic policy instances.
     */

    public void setTrafficPolicyInstanceNameMarker(String trafficPolicyInstanceNameMarker) {
        this.trafficPolicyInstanceNameMarker = trafficPolicyInstanceNameMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is the name of the
     * first traffic policy instance in the next group of traffic policy instances.
     * </p>
     * 
     * @return If <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is the
     *         name of the first traffic policy instance in the next group of traffic policy instances.
     */

    public String getTrafficPolicyInstanceNameMarker() {
        return this.trafficPolicyInstanceNameMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is the name of the
     * first traffic policy instance in the next group of traffic policy instances.
     * </p>
     * 
     * @param trafficPolicyInstanceNameMarker
     *        If <code>IsTruncated</code> is <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is the name
     *        of the first traffic policy instance in the next group of traffic policy instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPolicyInstancesByHostedZoneResult withTrafficPolicyInstanceNameMarker(String trafficPolicyInstanceNameMarker) {
        setTrafficPolicyInstanceNameMarker(trafficPolicyInstanceNameMarker);
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true, <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the resource
     * record sets that are associated with the first traffic policy instance in the next group of traffic policy
     * instances.
     * </p>
     * 
     * @param trafficPolicyInstanceTypeMarker
     *        If <code>IsTruncated</code> is true, <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *        resource record sets that are associated with the first traffic policy instance in the next group of
     *        traffic policy instances.
     * @see RRType
     */

    public void setTrafficPolicyInstanceTypeMarker(String trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true, <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the resource
     * record sets that are associated with the first traffic policy instance in the next group of traffic policy
     * instances.
     * </p>
     * 
     * @return If <code>IsTruncated</code> is true, <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *         resource record sets that are associated with the first traffic policy instance in the next group of
     *         traffic policy instances.
     * @see RRType
     */

    public String getTrafficPolicyInstanceTypeMarker() {
        return this.trafficPolicyInstanceTypeMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true, <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the resource
     * record sets that are associated with the first traffic policy instance in the next group of traffic policy
     * instances.
     * </p>
     * 
     * @param trafficPolicyInstanceTypeMarker
     *        If <code>IsTruncated</code> is true, <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *        resource record sets that are associated with the first traffic policy instance in the next group of
     *        traffic policy instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public ListTrafficPolicyInstancesByHostedZoneResult withTrafficPolicyInstanceTypeMarker(String trafficPolicyInstanceTypeMarker) {
        setTrafficPolicyInstanceTypeMarker(trafficPolicyInstanceTypeMarker);
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true, <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the resource
     * record sets that are associated with the first traffic policy instance in the next group of traffic policy
     * instances.
     * </p>
     * 
     * @param trafficPolicyInstanceTypeMarker
     *        If <code>IsTruncated</code> is true, <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *        resource record sets that are associated with the first traffic policy instance in the next group of
     *        traffic policy instances.
     * @see RRType
     */

    public void setTrafficPolicyInstanceTypeMarker(RRType trafficPolicyInstanceTypeMarker) {
        withTrafficPolicyInstanceTypeMarker(trafficPolicyInstanceTypeMarker);
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true, <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the resource
     * record sets that are associated with the first traffic policy instance in the next group of traffic policy
     * instances.
     * </p>
     * 
     * @param trafficPolicyInstanceTypeMarker
     *        If <code>IsTruncated</code> is true, <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *        resource record sets that are associated with the first traffic policy instance in the next group of
     *        traffic policy instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public ListTrafficPolicyInstancesByHostedZoneResult withTrafficPolicyInstanceTypeMarker(RRType trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker.toString();
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policy instances to be listed. If the response was
     * truncated, you can get the next group of traffic policy instances by submitting another
     * <code>ListTrafficPolicyInstancesByHostedZone</code> request and specifying the values of
     * <code>HostedZoneIdMarker</code>, <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding request parameters.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more traffic policy instances to be listed. If the response was
     *        truncated, you can get the next group of traffic policy instances by submitting another
     *        <code>ListTrafficPolicyInstancesByHostedZone</code> request and specifying the values of
     *        <code>HostedZoneIdMarker</code>, <code>TrafficPolicyInstanceNameMarker</code>, and
     *        <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding request parameters.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policy instances to be listed. If the response was
     * truncated, you can get the next group of traffic policy instances by submitting another
     * <code>ListTrafficPolicyInstancesByHostedZone</code> request and specifying the values of
     * <code>HostedZoneIdMarker</code>, <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding request parameters.
     * </p>
     * 
     * @return A flag that indicates whether there are more traffic policy instances to be listed. If the response was
     *         truncated, you can get the next group of traffic policy instances by submitting another
     *         <code>ListTrafficPolicyInstancesByHostedZone</code> request and specifying the values of
     *         <code>HostedZoneIdMarker</code>, <code>TrafficPolicyInstanceNameMarker</code>, and
     *         <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding request parameters.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policy instances to be listed. If the response was
     * truncated, you can get the next group of traffic policy instances by submitting another
     * <code>ListTrafficPolicyInstancesByHostedZone</code> request and specifying the values of
     * <code>HostedZoneIdMarker</code>, <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding request parameters.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more traffic policy instances to be listed. If the response was
     *        truncated, you can get the next group of traffic policy instances by submitting another
     *        <code>ListTrafficPolicyInstancesByHostedZone</code> request and specifying the values of
     *        <code>HostedZoneIdMarker</code>, <code>TrafficPolicyInstanceNameMarker</code>, and
     *        <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding request parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPolicyInstancesByHostedZoneResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more traffic policy instances to be listed. If the response was
     * truncated, you can get the next group of traffic policy instances by submitting another
     * <code>ListTrafficPolicyInstancesByHostedZone</code> request and specifying the values of
     * <code>HostedZoneIdMarker</code>, <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding request parameters.
     * </p>
     * 
     * @return A flag that indicates whether there are more traffic policy instances to be listed. If the response was
     *         truncated, you can get the next group of traffic policy instances by submitting another
     *         <code>ListTrafficPolicyInstancesByHostedZone</code> request and specifying the values of
     *         <code>HostedZoneIdMarker</code>, <code>TrafficPolicyInstanceNameMarker</code>, and
     *         <code>TrafficPolicyInstanceTypeMarker</code> in the corresponding request parameters.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the
     * <code>ListTrafficPolicyInstancesByHostedZone</code> request that produced the current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>MaxItems</code> parameter in the
     *        <code>ListTrafficPolicyInstancesByHostedZone</code> request that produced the current response.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the
     * <code>ListTrafficPolicyInstancesByHostedZone</code> request that produced the current response.
     * </p>
     * 
     * @return The value that you specified for the <code>MaxItems</code> parameter in the
     *         <code>ListTrafficPolicyInstancesByHostedZone</code> request that produced the current response.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>MaxItems</code> parameter in the
     * <code>ListTrafficPolicyInstancesByHostedZone</code> request that produced the current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>MaxItems</code> parameter in the
     *        <code>ListTrafficPolicyInstancesByHostedZone</code> request that produced the current response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTrafficPolicyInstancesByHostedZoneResult withMaxItems(String maxItems) {
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
        if (getTrafficPolicyInstances() != null)
            sb.append("TrafficPolicyInstances: ").append(getTrafficPolicyInstances()).append(",");
        if (getTrafficPolicyInstanceNameMarker() != null)
            sb.append("TrafficPolicyInstanceNameMarker: ").append(getTrafficPolicyInstanceNameMarker()).append(",");
        if (getTrafficPolicyInstanceTypeMarker() != null)
            sb.append("TrafficPolicyInstanceTypeMarker: ").append(getTrafficPolicyInstanceTypeMarker()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
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

        if (obj instanceof ListTrafficPolicyInstancesByHostedZoneResult == false)
            return false;
        ListTrafficPolicyInstancesByHostedZoneResult other = (ListTrafficPolicyInstancesByHostedZoneResult) obj;
        if (other.getTrafficPolicyInstances() == null ^ this.getTrafficPolicyInstances() == null)
            return false;
        if (other.getTrafficPolicyInstances() != null && other.getTrafficPolicyInstances().equals(this.getTrafficPolicyInstances()) == false)
            return false;
        if (other.getTrafficPolicyInstanceNameMarker() == null ^ this.getTrafficPolicyInstanceNameMarker() == null)
            return false;
        if (other.getTrafficPolicyInstanceNameMarker() != null
                && other.getTrafficPolicyInstanceNameMarker().equals(this.getTrafficPolicyInstanceNameMarker()) == false)
            return false;
        if (other.getTrafficPolicyInstanceTypeMarker() == null ^ this.getTrafficPolicyInstanceTypeMarker() == null)
            return false;
        if (other.getTrafficPolicyInstanceTypeMarker() != null
                && other.getTrafficPolicyInstanceTypeMarker().equals(this.getTrafficPolicyInstanceTypeMarker()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
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

        hashCode = prime * hashCode + ((getTrafficPolicyInstances() == null) ? 0 : getTrafficPolicyInstances().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyInstanceNameMarker() == null) ? 0 : getTrafficPolicyInstanceNameMarker().hashCode());
        hashCode = prime * hashCode + ((getTrafficPolicyInstanceTypeMarker() == null) ? 0 : getTrafficPolicyInstanceTypeMarker().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListTrafficPolicyInstancesByHostedZoneResult clone() {
        try {
            return (ListTrafficPolicyInstancesByHostedZoneResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
