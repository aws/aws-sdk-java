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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListHostedZonesByName" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListHostedZonesByNameResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains general information about the hosted zone.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<HostedZone> hostedZones;
    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZonesByName</code>, <code>DNSName</code> is the value that
     * you specified for the <code>dnsname</code> parameter in the request that produced the current response.
     * </p>
     */
    private String dNSName;
    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * A flag that indicates whether there are more hosted zones to be listed. If the response was truncated, you can
     * get the next group of <code>maxitems</code> hosted zones by calling <code>ListHostedZonesByName</code> again and
     * specifying the values of <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * If <code>IsTruncated</code> is true, the value of <code>NextDNSName</code> is the name of the first hosted zone
     * in the next group of <code>maxitems</code> hosted zones. Call <code>ListHostedZonesByName</code> again and
     * specify the value of <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the <code>dnsname</code> and
     * <code>hostedzoneid</code> parameters, respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     */
    private String nextDNSName;
    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextHostedZoneId</code> identifies the first
     * hosted zone in the next group of <code>maxitems</code> hosted zones. Call <code>ListHostedZonesByName</code>
     * again and specify the value of <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters, respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     */
    private String nextHostedZoneId;
    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to
     * <code>ListHostedZonesByName</code> that produced the current response.
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

    public ListHostedZonesByNameResult withHostedZones(HostedZone... hostedZones) {
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

    public ListHostedZonesByNameResult withHostedZones(java.util.Collection<HostedZone> hostedZones) {
        setHostedZones(hostedZones);
        return this;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZonesByName</code>, <code>DNSName</code> is the value that
     * you specified for the <code>dnsname</code> parameter in the request that produced the current response.
     * </p>
     * 
     * @param dNSName
     *        For the second and subsequent calls to <code>ListHostedZonesByName</code>, <code>DNSName</code> is the
     *        value that you specified for the <code>dnsname</code> parameter in the request that produced the current
     *        response.
     */

    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZonesByName</code>, <code>DNSName</code> is the value that
     * you specified for the <code>dnsname</code> parameter in the request that produced the current response.
     * </p>
     * 
     * @return For the second and subsequent calls to <code>ListHostedZonesByName</code>, <code>DNSName</code> is the
     *         value that you specified for the <code>dnsname</code> parameter in the request that produced the current
     *         response.
     */

    public String getDNSName() {
        return this.dNSName;
    }

    /**
     * <p>
     * For the second and subsequent calls to <code>ListHostedZonesByName</code>, <code>DNSName</code> is the value that
     * you specified for the <code>dnsname</code> parameter in the request that produced the current response.
     * </p>
     * 
     * @param dNSName
     *        For the second and subsequent calls to <code>ListHostedZonesByName</code>, <code>DNSName</code> is the
     *        value that you specified for the <code>dnsname</code> parameter in the request that produced the current
     *        response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesByNameResult withDNSName(String dNSName) {
        setDNSName(dNSName);
        return this;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     * </p>
     * 
     * @return The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID that Amazon Route 53 assigned to the hosted zone when you created it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesByNameResult withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more hosted zones to be listed. If the response was truncated, you can
     * get the next group of <code>maxitems</code> hosted zones by calling <code>ListHostedZonesByName</code> again and
     * specifying the values of <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more hosted zones to be listed. If the response was truncated, you
     *        can get the next group of <code>maxitems</code> hosted zones by calling <code>ListHostedZonesByName</code>
     *        again and specifying the values of <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in
     *        the <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     */

    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more hosted zones to be listed. If the response was truncated, you can
     * get the next group of <code>maxitems</code> hosted zones by calling <code>ListHostedZonesByName</code> again and
     * specifying the values of <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     * </p>
     * 
     * @return A flag that indicates whether there are more hosted zones to be listed. If the response was truncated,
     *         you can get the next group of <code>maxitems</code> hosted zones by calling
     *         <code>ListHostedZonesByName</code> again and specifying the values of <code>NextDNSName</code> and
     *         <code>NextHostedZoneId</code> elements in the <code>dnsname</code> and <code>hostedzoneid</code>
     *         parameters.
     */

    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag that indicates whether there are more hosted zones to be listed. If the response was truncated, you can
     * get the next group of <code>maxitems</code> hosted zones by calling <code>ListHostedZonesByName</code> again and
     * specifying the values of <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     * </p>
     * 
     * @param isTruncated
     *        A flag that indicates whether there are more hosted zones to be listed. If the response was truncated, you
     *        can get the next group of <code>maxitems</code> hosted zones by calling <code>ListHostedZonesByName</code>
     *        again and specifying the values of <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in
     *        the <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesByNameResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag that indicates whether there are more hosted zones to be listed. If the response was truncated, you can
     * get the next group of <code>maxitems</code> hosted zones by calling <code>ListHostedZonesByName</code> again and
     * specifying the values of <code>NextDNSName</code> and <code>NextHostedZoneId</code> elements in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters.
     * </p>
     * 
     * @return A flag that indicates whether there are more hosted zones to be listed. If the response was truncated,
     *         you can get the next group of <code>maxitems</code> hosted zones by calling
     *         <code>ListHostedZonesByName</code> again and specifying the values of <code>NextDNSName</code> and
     *         <code>NextHostedZoneId</code> elements in the <code>dnsname</code> and <code>hostedzoneid</code>
     *         parameters.
     */

    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true, the value of <code>NextDNSName</code> is the name of the first hosted zone
     * in the next group of <code>maxitems</code> hosted zones. Call <code>ListHostedZonesByName</code> again and
     * specify the value of <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the <code>dnsname</code> and
     * <code>hostedzoneid</code> parameters, respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     * 
     * @param nextDNSName
     *        If <code>IsTruncated</code> is true, the value of <code>NextDNSName</code> is the name of the first hosted
     *        zone in the next group of <code>maxitems</code> hosted zones. Call <code>ListHostedZonesByName</code>
     *        again and specify the value of <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     *        <code>dnsname</code> and <code>hostedzoneid</code> parameters, respectively.</p>
     *        <p>
     *        This element is present only if <code>IsTruncated</code> is <code>true</code>.
     */

    public void setNextDNSName(String nextDNSName) {
        this.nextDNSName = nextDNSName;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true, the value of <code>NextDNSName</code> is the name of the first hosted zone
     * in the next group of <code>maxitems</code> hosted zones. Call <code>ListHostedZonesByName</code> again and
     * specify the value of <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the <code>dnsname</code> and
     * <code>hostedzoneid</code> parameters, respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     * 
     * @return If <code>IsTruncated</code> is true, the value of <code>NextDNSName</code> is the name of the first
     *         hosted zone in the next group of <code>maxitems</code> hosted zones. Call
     *         <code>ListHostedZonesByName</code> again and specify the value of <code>NextDNSName</code> and
     *         <code>NextHostedZoneId</code> in the <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     *         respectively.</p>
     *         <p>
     *         This element is present only if <code>IsTruncated</code> is <code>true</code>.
     */

    public String getNextDNSName() {
        return this.nextDNSName;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is true, the value of <code>NextDNSName</code> is the name of the first hosted zone
     * in the next group of <code>maxitems</code> hosted zones. Call <code>ListHostedZonesByName</code> again and
     * specify the value of <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the <code>dnsname</code> and
     * <code>hostedzoneid</code> parameters, respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     * 
     * @param nextDNSName
     *        If <code>IsTruncated</code> is true, the value of <code>NextDNSName</code> is the name of the first hosted
     *        zone in the next group of <code>maxitems</code> hosted zones. Call <code>ListHostedZonesByName</code>
     *        again and specify the value of <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     *        <code>dnsname</code> and <code>hostedzoneid</code> parameters, respectively.</p>
     *        <p>
     *        This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesByNameResult withNextDNSName(String nextDNSName) {
        setNextDNSName(nextDNSName);
        return this;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextHostedZoneId</code> identifies the first
     * hosted zone in the next group of <code>maxitems</code> hosted zones. Call <code>ListHostedZonesByName</code>
     * again and specify the value of <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters, respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     * 
     * @param nextHostedZoneId
     *        If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextHostedZoneId</code> identifies
     *        the first hosted zone in the next group of <code>maxitems</code> hosted zones. Call
     *        <code>ListHostedZonesByName</code> again and specify the value of <code>NextDNSName</code> and
     *        <code>NextHostedZoneId</code> in the <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     *        respectively.</p>
     *        <p>
     *        This element is present only if <code>IsTruncated</code> is <code>true</code>.
     */

    public void setNextHostedZoneId(String nextHostedZoneId) {
        this.nextHostedZoneId = nextHostedZoneId;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextHostedZoneId</code> identifies the first
     * hosted zone in the next group of <code>maxitems</code> hosted zones. Call <code>ListHostedZonesByName</code>
     * again and specify the value of <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters, respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     * 
     * @return If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextHostedZoneId</code> identifies
     *         the first hosted zone in the next group of <code>maxitems</code> hosted zones. Call
     *         <code>ListHostedZonesByName</code> again and specify the value of <code>NextDNSName</code> and
     *         <code>NextHostedZoneId</code> in the <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     *         respectively.</p>
     *         <p>
     *         This element is present only if <code>IsTruncated</code> is <code>true</code>.
     */

    public String getNextHostedZoneId() {
        return this.nextHostedZoneId;
    }

    /**
     * <p>
     * If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextHostedZoneId</code> identifies the first
     * hosted zone in the next group of <code>maxitems</code> hosted zones. Call <code>ListHostedZonesByName</code>
     * again and specify the value of <code>NextDNSName</code> and <code>NextHostedZoneId</code> in the
     * <code>dnsname</code> and <code>hostedzoneid</code> parameters, respectively.
     * </p>
     * <p>
     * This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * </p>
     * 
     * @param nextHostedZoneId
     *        If <code>IsTruncated</code> is <code>true</code>, the value of <code>NextHostedZoneId</code> identifies
     *        the first hosted zone in the next group of <code>maxitems</code> hosted zones. Call
     *        <code>ListHostedZonesByName</code> again and specify the value of <code>NextDNSName</code> and
     *        <code>NextHostedZoneId</code> in the <code>dnsname</code> and <code>hostedzoneid</code> parameters,
     *        respectively.</p>
     *        <p>
     *        This element is present only if <code>IsTruncated</code> is <code>true</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesByNameResult withNextHostedZoneId(String nextHostedZoneId) {
        setNextHostedZoneId(nextHostedZoneId);
        return this;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to
     * <code>ListHostedZonesByName</code> that produced the current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>maxitems</code> parameter in the call to
     *        <code>ListHostedZonesByName</code> that produced the current response.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to
     * <code>ListHostedZonesByName</code> that produced the current response.
     * </p>
     * 
     * @return The value that you specified for the <code>maxitems</code> parameter in the call to
     *         <code>ListHostedZonesByName</code> that produced the current response.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The value that you specified for the <code>maxitems</code> parameter in the call to
     * <code>ListHostedZonesByName</code> that produced the current response.
     * </p>
     * 
     * @param maxItems
     *        The value that you specified for the <code>maxitems</code> parameter in the call to
     *        <code>ListHostedZonesByName</code> that produced the current response.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListHostedZonesByNameResult withMaxItems(String maxItems) {
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
        if (getDNSName() != null)
            sb.append("DNSName: ").append(getDNSName()).append(",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: ").append(getIsTruncated()).append(",");
        if (getNextDNSName() != null)
            sb.append("NextDNSName: ").append(getNextDNSName()).append(",");
        if (getNextHostedZoneId() != null)
            sb.append("NextHostedZoneId: ").append(getNextHostedZoneId()).append(",");
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

        if (obj instanceof ListHostedZonesByNameResult == false)
            return false;
        ListHostedZonesByNameResult other = (ListHostedZonesByNameResult) obj;
        if (other.getHostedZones() == null ^ this.getHostedZones() == null)
            return false;
        if (other.getHostedZones() != null && other.getHostedZones().equals(this.getHostedZones()) == false)
            return false;
        if (other.getDNSName() == null ^ this.getDNSName() == null)
            return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getNextDNSName() == null ^ this.getNextDNSName() == null)
            return false;
        if (other.getNextDNSName() != null && other.getNextDNSName().equals(this.getNextDNSName()) == false)
            return false;
        if (other.getNextHostedZoneId() == null ^ this.getNextHostedZoneId() == null)
            return false;
        if (other.getNextHostedZoneId() != null && other.getNextHostedZoneId().equals(this.getNextHostedZoneId()) == false)
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
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime * hashCode + ((getNextDNSName() == null) ? 0 : getNextDNSName().hashCode());
        hashCode = prime * hashCode + ((getNextHostedZoneId() == null) ? 0 : getNextHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListHostedZonesByNameResult clone() {
        try {
            return (ListHostedZonesByNameResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
