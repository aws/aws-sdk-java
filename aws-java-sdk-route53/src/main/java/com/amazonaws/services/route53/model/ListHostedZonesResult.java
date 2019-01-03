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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHostedZones" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHostedZonesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<HostedZone> hostedZones;
    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZones</code>, <code>Marker</code> is the value that you
     * specified for the <code>marker</code> parameter in the request that produced the current response.
     * </p>
     */
    private String marker;
    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If the response was truncated, you can get
     * more hosted zones by submitting another <code>ListHostedZones</code> request and specifying the value of
     * <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextMarker</code> identifies the first
     * hosted zone in the next group of hosted zones. Submit another <code>ListHostedZones</code> request, and specify
     * the value of <code>NextMarker</code> from the response in the <code>marker</code> parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     */
    private String nextMarker;
    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to <code>ListHostedZones</code>
     * that produced the current response.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     * 
     * @return A complex type that contains general information about the hosted zone.
     */

    public java.util.List<HostedZone> getHostedZones() {
        if (hostedZones == null) {
            hostedZones = new com.amazonaws.internal.SdkInternalList<HostedZone>();
        }
        return hostedZones;
    }

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     * 
     * @param hostedZones
     *        A complex type that contains general information about the hosted zone.
     */

    public void setHostedZones(java.util.Collection<HostedZone> hostedZones) {
        if (hostedZones == null) {
            this.hostedZones = null;
            return;
        }

        this.hostedZones = new com.amazonaws.internal.SdkInternalList<HostedZone>(hostedZones);
    }

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setHostedZones(java.util.Collection)} or {@link #withHostedZones(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param hostedZones
     *        A complex type that contains general information about the hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesResult withHostedZones(HostedZone... hostedZones) {
        if (this.hostedZones == null) {
            setHostedZones(new com.amazonaws.internal.SdkInternalList<HostedZone>(hostedZones.length));
        }
        for (HostedZone ele : hostedZones) {
            this.hostedZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     * 
     * @param hostedZones
     *        A complex type that contains general information about the hosted zone.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesResult withHostedZones(java.util.Collection<HostedZone> hostedZones) {
        setHostedZones(hostedZones);
        return this;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZones</code>, <code>Marker</code> is the value that you
     * specified for the <code>marker</code> parameter in the request that produced the current response.
     * </p>
     * 
     * @param marker
     *        For the second and subsequent calls to <code>ListHostedZones</code>, <code>Marker</code> is the value that
     *        you specified for the <code>marker</code> parameter in the request that produced the current response.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZones</code>, <code>Marker</code> is the value that you
     * specified for the <code>marker</code> parameter in the request that produced the current response.
     * </p>
     * 
     * @return For the second and subsequent calls to <code>ListHostedZones</code>, <code>Marker</code> is the value
     *         that you specified for the <code>marker</code> parameter in the request that produced the current
     *         response.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZones</code>, <code>Marker</code> is the value that you
     * specified for the <code>marker</code> parameter in the request that produced the current response.
     * </p>
     * 
     * @param marker
     *        For the second and subsequent calls to <code>ListHostedZones</code>, <code>Marker</code> is the value that
     *        you specified for the <code>marker</code> parameter in the request that produced the current response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesResult withMarker(String marker) {
        setMarker(marker);
        return this;
    }

    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If the response was truncated, you can get
     * more hosted zones by submitting another <code>ListHostedZones</code> request and specifying the value of
     * <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @param isTruncated
     *        A flag indicating whether there are more hosted zones to be listed. If the response was truncated, you can
     *        get more hosted zones by submitting another <code>ListHostedZones</code> request and specifying the value
     *        of <code>NextMarker</code> in the <code>marker</code> parameter.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If the response was truncated, you can get
     * more hosted zones by submitting another <code>ListHostedZones</code> request and specifying the value of
     * <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @return A flag indicating whether there are more hosted zones to be listed. If the response was truncated, you
     *         can get more hosted zones by submitting another <code>ListHostedZones</code> request and specifying the
     *         value of <code>NextMarker</code> in the <code>marker</code> parameter.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If the response was truncated, you can get
     * more hosted zones by submitting another <code>ListHostedZones</code> request and specifying the value of
     * <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @param isTruncated
     *        A flag indicating whether there are more hosted zones to be listed. If the response was truncated, you can
     *        get more hosted zones by submitting another <code>ListHostedZones</code> request and specifying the value
     *        of <code>NextMarker</code> in the <code>marker</code> parameter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If the response was truncated, you can get
     * more hosted zones by submitting another <code>ListHostedZones</code> request and specifying the value of
     * <code>NextMarker</code> in the <code>marker</code> parameter.
     * </p>
     * 
     * @return A flag indicating whether there are more hosted zones to be listed. If the response was truncated, you
     *         can get more hosted zones by submitting another <code>ListHostedZones</code> request and specifying the
     *         value of <code>NextMarker</code> in the <code>marker</code> parameter.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextMarker</code> identifies the first
     * hosted zone in the next group of hosted zones. Submit another <code>ListHostedZones</code> request, and specify
     * the value of <code>NextMarker</code> from the response in the <code>marker</code> parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     * 
     * @param nextMarker
     *        If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextMarker</code> identifies the
     *        first hosted zone in the next group of hosted zones. Submit another <code>ListHostedZones</code> request,
     *        and specify the value of <code>NextMarker</code> from the response in the <code>marker</code>
     *        parameter.</p>
     *        <p>
     *        This element is present only if <code>IsTruncated</code> is <code>true</code>.
     */

    public void setNextMarker(String nextMarker) {
        this.nextMarker = nextMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextMarker</code> identifies the first
     * hosted zone in the next group of hosted zones. Submit another <code>ListHostedZones</code> request, and specify
     * the value of <code>NextMarker</code> from the response in the <code>marker</code> parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     * 
     * @return If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextMarker</code> identifies the
     *         first hosted zone in the next group of hosted zones. Submit another <code>ListHostedZones</code> request,
     *         and specify the value of <code>NextMarker</code> from the response in the <code>marker</code>
     *         parameter.</p>
     *         <p>
     *         This element is present only if <code>IsTruncated</code> is <code>true</code>.
     */

    public String getNextMarker() {
        return this.nextMarker;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextMarker</code> identifies the first
     * hosted zone in the next group of hosted zones. Submit another <code>ListHostedZones</code> request, and specify
     * the value of <code>NextMarker</code> from the response in the <code>marker</code> parameter.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     * 
     * @param nextMarker
     *        If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextMarker</code> identifies the
     *        first hosted zone in the next group of hosted zones. Submit another <code>ListHostedZones</code> request,
     *        and specify the value of <code>NextMarker</code> from the response in the <code>marker</code>
     *        parameter.</p>
     *        <p>
     *        This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesResult withNextMarker(String nextMarker) {
        setNextMarker(nextMarker);
        return this;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to <code>ListHostedZones</code>
     * that produced the current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>maxitems</code> parameter in the call to
     *        <code>ListHostedZones</code> that produced the current response.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to <code>ListHostedZones</code>
     * that produced the current response.
     * </p>
     * 
     * @return The value that you specified for the <code>maxitems</code> parameter in the call to
     *         <code>ListHostedZones</code> that produced the current response.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to <code>ListHostedZones</code>
     * that produced the current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>maxitems</code> parameter in the call to
     *        <code>ListHostedZones</code> that produced the current response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesResult withMaxItems(String maxItems) {
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
        if (getHostedZones() != null)
            sb.append("HostedZones: ").append(getHostedZones()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
        if (getNextMarker() != null)
            sb.append("NextMarker: ").append(getNextMarker()).append(",");
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

        if (obj instanceof ListHostedZonesResult == false)
            return false;
        ListHostedZonesResult other = (ListHostedZonesResult) obj;
        if (other.getHostedZones() == null ^ this.getHostedZones() == null)
            return false;
        if (other.getHostedZones() != null && other.getHostedZones().equals(this.getHostedZones()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getNextMarker() == null ^ this.getNextMarker() == null)
            return false;
        if (other.getNextMarker() != null && other.getNextMarker().equals(this.getNextMarker()) == false)
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

        hashCode = prime * hashCode + ((getHostedZones() == null) ? 0 : getHostedZones().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getNextMarker() == null) ? 0 : getNextMarker().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListHostedZonesResult clone() {
        try {
            return (ListHostedZonesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
