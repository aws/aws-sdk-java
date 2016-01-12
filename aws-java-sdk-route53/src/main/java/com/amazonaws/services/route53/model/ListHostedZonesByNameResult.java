/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

/**
 * <p>
 * A complex type that contains the response for the request.
 * </p>
 */
public class ListHostedZonesByNameResult implements Serializable, Cloneable {

    /**
     * <p>
     * A complex type that contains information about the hosted zones
     * associated with the current AWS account.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<HostedZone> hostedZones;
    /**
     * <p>
     * The <code>DNSName</code> value sent in the request.
     * </p>
     */
    private String dNSName;
    /**
     * <p>
     * The <code>HostedZoneId</code> value sent in the request.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If
     * your results were truncated, you can make a follow-up request for the
     * next page of results by using the <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> elements.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     */
    private Boolean isTruncated;
    /**
     * <p>
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is <code>true</code>,
     * there are more hosted zones associated with the current AWS account. To
     * get the next page of results, make another request to
     * <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * </p>
     */
    private String nextDNSName;
    /**
     * <p>
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is <code>true</code>,
     * there are more hosted zones associated with the current AWS account. To
     * get the next page of results, make another request to
     * <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * </p>
     */
    private String nextHostedZoneId;
    /**
     * <p>
     * The maximum number of hosted zones to be included in the response body.
     * If the number of hosted zones associated with this AWS account exceeds
     * <code>MaxItems</code>, the value of
     * <a>ListHostedZonesByNameResponse$IsTruncated</a> in the response is
     * <code>true</code>. Call <code>ListHostedZonesByName</code> again and
     * specify the value of <a>ListHostedZonesByNameResponse$NextDNSName</a> and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> elements
     * respectively to get the next page of results.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * A complex type that contains information about the hosted zones
     * associated with the current AWS account.
     * </p>
     * 
     * @return A complex type that contains information about the hosted zones
     *         associated with the current AWS account.
     */
    public java.util.List<HostedZone> getHostedZones() {
        if (hostedZones == null) {
            hostedZones = new com.amazonaws.internal.SdkInternalList<HostedZone>();
        }
        return hostedZones;
    }

    /**
     * <p>
     * A complex type that contains information about the hosted zones
     * associated with the current AWS account.
     * </p>
     * 
     * @param hostedZones
     *        A complex type that contains information about the hosted zones
     *        associated with the current AWS account.
     */
    public void setHostedZones(java.util.Collection<HostedZone> hostedZones) {
        if (hostedZones == null) {
            this.hostedZones = null;
            return;
        }

        this.hostedZones = new com.amazonaws.internal.SdkInternalList<HostedZone>(
                hostedZones);
    }

    /**
     * <p>
     * A complex type that contains information about the hosted zones
     * associated with the current AWS account.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setHostedZones(java.util.Collection)} or
     * {@link #withHostedZones(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param hostedZones
     *        A complex type that contains information about the hosted zones
     *        associated with the current AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withHostedZones(
            HostedZone... hostedZones) {
        if (this.hostedZones == null) {
            setHostedZones(new com.amazonaws.internal.SdkInternalList<HostedZone>(
                    hostedZones.length));
        }
        for (HostedZone ele : hostedZones) {
            this.hostedZones.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A complex type that contains information about the hosted zones
     * associated with the current AWS account.
     * </p>
     * 
     * @param hostedZones
     *        A complex type that contains information about the hosted zones
     *        associated with the current AWS account.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withHostedZones(
            java.util.Collection<HostedZone> hostedZones) {
        setHostedZones(hostedZones);
        return this;
    }

    /**
     * <p>
     * The <code>DNSName</code> value sent in the request.
     * </p>
     * 
     * @param dNSName
     *        The <code>DNSName</code> value sent in the request.
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * The <code>DNSName</code> value sent in the request.
     * </p>
     * 
     * @return The <code>DNSName</code> value sent in the request.
     */
    public String getDNSName() {
        return this.dNSName;
    }

    /**
     * <p>
     * The <code>DNSName</code> value sent in the request.
     * </p>
     * 
     * @param dNSName
     *        The <code>DNSName</code> value sent in the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withDNSName(String dNSName) {
        setDNSName(dNSName);
        return this;
    }

    /**
     * <p>
     * The <code>HostedZoneId</code> value sent in the request.
     * </p>
     * 
     * @param hostedZoneId
     *        The <code>HostedZoneId</code> value sent in the request.
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The <code>HostedZoneId</code> value sent in the request.
     * </p>
     * 
     * @return The <code>HostedZoneId</code> value sent in the request.
     */
    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The <code>HostedZoneId</code> value sent in the request.
     * </p>
     * 
     * @param hostedZoneId
     *        The <code>HostedZoneId</code> value sent in the request.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If
     * your results were truncated, you can make a follow-up request for the
     * next page of results by using the <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> elements.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param isTruncated
     *        A flag indicating whether there are more hosted zones to be
     *        listed. If your results were truncated, you can make a follow-up
     *        request for the next page of results by using the
     *        <code>NextDNSName</code> and <code>NextHostedZoneId</code>
     *        elements.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }

    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If
     * your results were truncated, you can make a follow-up request for the
     * next page of results by using the <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> elements.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A flag indicating whether there are more hosted zones to be
     *         listed. If your results were truncated, you can make a follow-up
     *         request for the next page of results by using the
     *         <code>NextDNSName</code> and <code>NextHostedZoneId</code>
     *         elements.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If
     * your results were truncated, you can make a follow-up request for the
     * next page of results by using the <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> elements.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @param isTruncated
     *        A flag indicating whether there are more hosted zones to be
     *        listed. If your results were truncated, you can make a follow-up
     *        request for the next page of results by using the
     *        <code>NextDNSName</code> and <code>NextHostedZoneId</code>
     *        elements.</p>
     *        <p>
     *        Valid Values: <code>true</code> | <code>false</code>
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withIsTruncated(Boolean isTruncated) {
        setIsTruncated(isTruncated);
        return this;
    }

    /**
     * <p>
     * A flag indicating whether there are more hosted zones to be listed. If
     * your results were truncated, you can make a follow-up request for the
     * next page of results by using the <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> elements.
     * </p>
     * <p>
     * Valid Values: <code>true</code> | <code>false</code>
     * </p>
     * 
     * @return A flag indicating whether there are more hosted zones to be
     *         listed. If your results were truncated, you can make a follow-up
     *         request for the next page of results by using the
     *         <code>NextDNSName</code> and <code>NextHostedZoneId</code>
     *         elements.</p>
     *         <p>
     *         Valid Values: <code>true</code> | <code>false</code>
     */
    public Boolean isTruncated() {
        return this.isTruncated;
    }

    /**
     * <p>
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is <code>true</code>,
     * there are more hosted zones associated with the current AWS account. To
     * get the next page of results, make another request to
     * <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * </p>
     * 
     * @param nextDNSName
     *        If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     *        <code>true</code>, there are more hosted zones associated with the
     *        current AWS account. To get the next page of results, make another
     *        request to <code>ListHostedZonesByName</code>. Specify the value
     *        of <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     *        <a>ListHostedZonesByNameRequest$DNSName</a> element and
     *        <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     *        <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     */
    public void setNextDNSName(String nextDNSName) {
        this.nextDNSName = nextDNSName;
    }

    /**
     * <p>
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is <code>true</code>,
     * there are more hosted zones associated with the current AWS account. To
     * get the next page of results, make another request to
     * <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * </p>
     * 
     * @return If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     *         <code>true</code>, there are more hosted zones associated with
     *         the current AWS account. To get the next page of results, make
     *         another request to <code>ListHostedZonesByName</code>. Specify
     *         the value of <a>ListHostedZonesByNameResponse$NextDNSName</a> in
     *         the <a>ListHostedZonesByNameRequest$DNSName</a> element and
     *         <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     *         <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     */
    public String getNextDNSName() {
        return this.nextDNSName;
    }

    /**
     * <p>
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is <code>true</code>,
     * there are more hosted zones associated with the current AWS account. To
     * get the next page of results, make another request to
     * <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * </p>
     * 
     * @param nextDNSName
     *        If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     *        <code>true</code>, there are more hosted zones associated with the
     *        current AWS account. To get the next page of results, make another
     *        request to <code>ListHostedZonesByName</code>. Specify the value
     *        of <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     *        <a>ListHostedZonesByNameRequest$DNSName</a> element and
     *        <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     *        <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withNextDNSName(String nextDNSName) {
        setNextDNSName(nextDNSName);
        return this;
    }

    /**
     * <p>
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is <code>true</code>,
     * there are more hosted zones associated with the current AWS account. To
     * get the next page of results, make another request to
     * <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * </p>
     * 
     * @param nextHostedZoneId
     *        If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     *        <code>true</code>, there are more hosted zones associated with the
     *        current AWS account. To get the next page of results, make another
     *        request to <code>ListHostedZonesByName</code>. Specify the value
     *        of <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     *        <a>ListHostedZonesByNameRequest$DNSName</a> element and
     *        <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     *        <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     */
    public void setNextHostedZoneId(String nextHostedZoneId) {
        this.nextHostedZoneId = nextHostedZoneId;
    }

    /**
     * <p>
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is <code>true</code>,
     * there are more hosted zones associated with the current AWS account. To
     * get the next page of results, make another request to
     * <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * </p>
     * 
     * @return If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     *         <code>true</code>, there are more hosted zones associated with
     *         the current AWS account. To get the next page of results, make
     *         another request to <code>ListHostedZonesByName</code>. Specify
     *         the value of <a>ListHostedZonesByNameResponse$NextDNSName</a> in
     *         the <a>ListHostedZonesByNameRequest$DNSName</a> element and
     *         <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     *         <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     */
    public String getNextHostedZoneId() {
        return this.nextHostedZoneId;
    }

    /**
     * <p>
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is <code>true</code>,
     * there are more hosted zones associated with the current AWS account. To
     * get the next page of results, make another request to
     * <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * </p>
     * 
     * @param nextHostedZoneId
     *        If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     *        <code>true</code>, there are more hosted zones associated with the
     *        current AWS account. To get the next page of results, make another
     *        request to <code>ListHostedZonesByName</code>. Specify the value
     *        of <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     *        <a>ListHostedZonesByNameRequest$DNSName</a> element and
     *        <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     *        <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withNextHostedZoneId(
            String nextHostedZoneId) {
        setNextHostedZoneId(nextHostedZoneId);
        return this;
    }

    /**
     * <p>
     * The maximum number of hosted zones to be included in the response body.
     * If the number of hosted zones associated with this AWS account exceeds
     * <code>MaxItems</code>, the value of
     * <a>ListHostedZonesByNameResponse$IsTruncated</a> in the response is
     * <code>true</code>. Call <code>ListHostedZonesByName</code> again and
     * specify the value of <a>ListHostedZonesByNameResponse$NextDNSName</a> and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> elements
     * respectively to get the next page of results.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of hosted zones to be included in the response
     *        body. If the number of hosted zones associated with this AWS
     *        account exceeds <code>MaxItems</code>, the value of
     *        <a>ListHostedZonesByNameResponse$IsTruncated</a> in the response
     *        is <code>true</code>. Call <code>ListHostedZonesByName</code>
     *        again and specify the value of
     *        <a>ListHostedZonesByNameResponse$NextDNSName</a> and
     *        <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> elements
     *        respectively to get the next page of results.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * The maximum number of hosted zones to be included in the response body.
     * If the number of hosted zones associated with this AWS account exceeds
     * <code>MaxItems</code>, the value of
     * <a>ListHostedZonesByNameResponse$IsTruncated</a> in the response is
     * <code>true</code>. Call <code>ListHostedZonesByName</code> again and
     * specify the value of <a>ListHostedZonesByNameResponse$NextDNSName</a> and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> elements
     * respectively to get the next page of results.
     * </p>
     * 
     * @return The maximum number of hosted zones to be included in the response
     *         body. If the number of hosted zones associated with this AWS
     *         account exceeds <code>MaxItems</code>, the value of
     *         <a>ListHostedZonesByNameResponse$IsTruncated</a> in the response
     *         is <code>true</code>. Call <code>ListHostedZonesByName</code>
     *         again and specify the value of
     *         <a>ListHostedZonesByNameResponse$NextDNSName</a> and
     *         <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> elements
     *         respectively to get the next page of results.
     */
    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * The maximum number of hosted zones to be included in the response body.
     * If the number of hosted zones associated with this AWS account exceeds
     * <code>MaxItems</code>, the value of
     * <a>ListHostedZonesByNameResponse$IsTruncated</a> in the response is
     * <code>true</code>. Call <code>ListHostedZonesByName</code> again and
     * specify the value of <a>ListHostedZonesByNameResponse$NextDNSName</a> and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> elements
     * respectively to get the next page of results.
     * </p>
     * 
     * @param maxItems
     *        The maximum number of hosted zones to be included in the response
     *        body. If the number of hosted zones associated with this AWS
     *        account exceeds <code>MaxItems</code>, the value of
     *        <a>ListHostedZonesByNameResponse$IsTruncated</a> in the response
     *        is <code>true</code>. Call <code>ListHostedZonesByName</code>
     *        again and specify the value of
     *        <a>ListHostedZonesByNameResponse$NextDNSName</a> and
     *        <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> elements
     *        respectively to get the next page of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameResult withMaxItems(String maxItems) {
        setMaxItems(maxItems);
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
        if (getHostedZones() != null)
            sb.append("HostedZones: " + getHostedZones() + ",");
        if (getDNSName() != null)
            sb.append("DNSName: " + getDNSName() + ",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getIsTruncated() != null)
            sb.append("IsTruncated: " + getIsTruncated() + ",");
        if (getNextDNSName() != null)
            sb.append("NextDNSName: " + getNextDNSName() + ",");
        if (getNextHostedZoneId() != null)
            sb.append("NextHostedZoneId: " + getNextHostedZoneId() + ",");
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

        if (obj instanceof ListHostedZonesByNameResult == false)
            return false;
        ListHostedZonesByNameResult other = (ListHostedZonesByNameResult) obj;
        if (other.getHostedZones() == null ^ this.getHostedZones() == null)
            return false;
        if (other.getHostedZones() != null
                && other.getHostedZones().equals(this.getHostedZones()) == false)
            return false;
        if (other.getDNSName() == null ^ this.getDNSName() == null)
            return false;
        if (other.getDNSName() != null
                && other.getDNSName().equals(this.getDNSName()) == false)
            return false;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null
                && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getIsTruncated() == null ^ this.getIsTruncated() == null)
            return false;
        if (other.getIsTruncated() != null
                && other.getIsTruncated().equals(this.getIsTruncated()) == false)
            return false;
        if (other.getNextDNSName() == null ^ this.getNextDNSName() == null)
            return false;
        if (other.getNextDNSName() != null
                && other.getNextDNSName().equals(this.getNextDNSName()) == false)
            return false;
        if (other.getNextHostedZoneId() == null
                ^ this.getNextHostedZoneId() == null)
            return false;
        if (other.getNextHostedZoneId() != null
                && other.getNextHostedZoneId().equals(
                        this.getNextHostedZoneId()) == false)
            return false;
        if (other.getMaxItems() == null ^ this.getMaxItems() == null)
            return false;
        if (other.getMaxItems() != null
                && other.getMaxItems().equals(this.getMaxItems()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getHostedZones() == null) ? 0 : getHostedZones().hashCode());
        hashCode = prime * hashCode
                + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime
                * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId()
                        .hashCode());
        hashCode = prime
                * hashCode
                + ((getIsTruncated() == null) ? 0 : getIsTruncated().hashCode());
        hashCode = prime
                * hashCode
                + ((getNextDNSName() == null) ? 0 : getNextDNSName().hashCode());
        hashCode = prime
                * hashCode
                + ((getNextHostedZoneId() == null) ? 0 : getNextHostedZoneId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListHostedZonesByNameResult clone() {
        try {
            return (ListHostedZonesByNameResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                            + "even though we're Cloneable!", e);
        }
    }
}