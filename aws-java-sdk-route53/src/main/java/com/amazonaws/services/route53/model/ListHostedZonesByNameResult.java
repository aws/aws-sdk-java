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

/**
 * <p>
 * A complex type that contains the response for the request.
 * </p>
 */
public class ListHostedZonesByNameResult implements Serializable, Cloneable {

    /**
     * A complex type that contains information about the hosted zones
     * associated with the current AWS account.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<HostedZone> hostedZones;

    /**
     * The <code>DNSName</code> value sent in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String dNSName;

    /**
     * The <code>HostedZoneId</code> value sent in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String hostedZoneId;

    /**
     * A flag indicating whether there are more hosted zones to be listed. If
     * your results were truncated, you can make a follow-up request for the
     * next page of results by using the <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> elements. <p>Valid Values:
     * <code>true</code> | <code>false</code>
     */
    private Boolean isTruncated;

    /**
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     * <code>true</code>, there are more hosted zones associated with the
     * current AWS account. To get the next page of results, make another
     * request to <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String nextDNSName;

    /**
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     * <code>true</code>, there are more hosted zones associated with the
     * current AWS account. To get the next page of results, make another
     * request to <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String nextHostedZoneId;

    /**
     * The maximum number of hosted zones to be included in the response
     * body. If the number of hosted zones associated with this AWS account
     * exceeds <code>MaxItems</code>, the value of
     * <a>ListHostedZonesByNameResponse$IsTruncated</a> in the response is
     * <code>true</code>. Call <code>ListHostedZonesByName</code> again and
     * specify the value of <a>ListHostedZonesByNameResponse$NextDNSName</a>
     * and <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> elements
     * respectively to get the next page of results.
     */
    private String maxItems;

    /**
     * A complex type that contains information about the hosted zones
     * associated with the current AWS account.
     *
     * @return A complex type that contains information about the hosted zones
     *         associated with the current AWS account.
     */
    public java.util.List<HostedZone> getHostedZones() {
        if (hostedZones == null) {
              hostedZones = new com.amazonaws.internal.ListWithAutoConstructFlag<HostedZone>();
              hostedZones.setAutoConstruct(true);
        }
        return hostedZones;
    }
    
    /**
     * A complex type that contains information about the hosted zones
     * associated with the current AWS account.
     *
     * @param hostedZones A complex type that contains information about the hosted zones
     *         associated with the current AWS account.
     */
    public void setHostedZones(java.util.Collection<HostedZone> hostedZones) {
        if (hostedZones == null) {
            this.hostedZones = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<HostedZone> hostedZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HostedZone>(hostedZones.size());
        hostedZonesCopy.addAll(hostedZones);
        this.hostedZones = hostedZonesCopy;
    }
    
    /**
     * A complex type that contains information about the hosted zones
     * associated with the current AWS account.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setHostedZones(java.util.Collection)} or {@link
     * #withHostedZones(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostedZones A complex type that contains information about the hosted zones
     *         associated with the current AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListHostedZonesByNameResult withHostedZones(HostedZone... hostedZones) {
        if (getHostedZones() == null) setHostedZones(new java.util.ArrayList<HostedZone>(hostedZones.length));
        for (HostedZone value : hostedZones) {
            getHostedZones().add(value);
        }
        return this;
    }
    
    /**
     * A complex type that contains information about the hosted zones
     * associated with the current AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param hostedZones A complex type that contains information about the hosted zones
     *         associated with the current AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListHostedZonesByNameResult withHostedZones(java.util.Collection<HostedZone> hostedZones) {
        if (hostedZones == null) {
            this.hostedZones = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<HostedZone> hostedZonesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<HostedZone>(hostedZones.size());
            hostedZonesCopy.addAll(hostedZones);
            this.hostedZones = hostedZonesCopy;
        }

        return this;
    }

    /**
     * The <code>DNSName</code> value sent in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The <code>DNSName</code> value sent in the request.
     */
    public String getDNSName() {
        return dNSName;
    }
    
    /**
     * The <code>DNSName</code> value sent in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param dNSName The <code>DNSName</code> value sent in the request.
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }
    
    /**
     * The <code>DNSName</code> value sent in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param dNSName The <code>DNSName</code> value sent in the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListHostedZonesByNameResult withDNSName(String dNSName) {
        this.dNSName = dNSName;
        return this;
    }

    /**
     * The <code>HostedZoneId</code> value sent in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return The <code>HostedZoneId</code> value sent in the request.
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }
    
    /**
     * The <code>HostedZoneId</code> value sent in the request.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId The <code>HostedZoneId</code> value sent in the request.
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }
    
    /**
     * The <code>HostedZoneId</code> value sent in the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId The <code>HostedZoneId</code> value sent in the request.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListHostedZonesByNameResult withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * A flag indicating whether there are more hosted zones to be listed. If
     * your results were truncated, you can make a follow-up request for the
     * next page of results by using the <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> elements. <p>Valid Values:
     * <code>true</code> | <code>false</code>
     *
     * @return A flag indicating whether there are more hosted zones to be listed. If
     *         your results were truncated, you can make a follow-up request for the
     *         next page of results by using the <code>NextDNSName</code> and
     *         <code>NextHostedZoneId</code> elements. <p>Valid Values:
     *         <code>true</code> | <code>false</code>
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag indicating whether there are more hosted zones to be listed. If
     * your results were truncated, you can make a follow-up request for the
     * next page of results by using the <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> elements. <p>Valid Values:
     * <code>true</code> | <code>false</code>
     *
     * @param isTruncated A flag indicating whether there are more hosted zones to be listed. If
     *         your results were truncated, you can make a follow-up request for the
     *         next page of results by using the <code>NextDNSName</code> and
     *         <code>NextHostedZoneId</code> elements. <p>Valid Values:
     *         <code>true</code> | <code>false</code>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag indicating whether there are more hosted zones to be listed. If
     * your results were truncated, you can make a follow-up request for the
     * next page of results by using the <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> elements. <p>Valid Values:
     * <code>true</code> | <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag indicating whether there are more hosted zones to be listed. If
     *         your results were truncated, you can make a follow-up request for the
     *         next page of results by using the <code>NextDNSName</code> and
     *         <code>NextHostedZoneId</code> elements. <p>Valid Values:
     *         <code>true</code> | <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListHostedZonesByNameResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }

    /**
     * A flag indicating whether there are more hosted zones to be listed. If
     * your results were truncated, you can make a follow-up request for the
     * next page of results by using the <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> elements. <p>Valid Values:
     * <code>true</code> | <code>false</code>
     *
     * @return A flag indicating whether there are more hosted zones to be listed. If
     *         your results were truncated, you can make a follow-up request for the
     *         next page of results by using the <code>NextDNSName</code> and
     *         <code>NextHostedZoneId</code> elements. <p>Valid Values:
     *         <code>true</code> | <code>false</code>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }

    /**
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     * <code>true</code>, there are more hosted zones associated with the
     * current AWS account. To get the next page of results, make another
     * request to <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     *         <code>true</code>, there are more hosted zones associated with the
     *         current AWS account. To get the next page of results, make another
     *         request to <code>ListHostedZonesByName</code>. Specify the value of
     *         <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     *         <a>ListHostedZonesByNameRequest$DNSName</a> element and
     *         <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     *         <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     */
    public String getNextDNSName() {
        return nextDNSName;
    }
    
    /**
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     * <code>true</code>, there are more hosted zones associated with the
     * current AWS account. To get the next page of results, make another
     * request to <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param nextDNSName If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     *         <code>true</code>, there are more hosted zones associated with the
     *         current AWS account. To get the next page of results, make another
     *         request to <code>ListHostedZonesByName</code>. Specify the value of
     *         <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     *         <a>ListHostedZonesByNameRequest$DNSName</a> element and
     *         <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     *         <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     */
    public void setNextDNSName(String nextDNSName) {
        this.nextDNSName = nextDNSName;
    }
    
    /**
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     * <code>true</code>, there are more hosted zones associated with the
     * current AWS account. To get the next page of results, make another
     * request to <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param nextDNSName If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     *         <code>true</code>, there are more hosted zones associated with the
     *         current AWS account. To get the next page of results, make another
     *         request to <code>ListHostedZonesByName</code>. Specify the value of
     *         <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     *         <a>ListHostedZonesByNameRequest$DNSName</a> element and
     *         <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     *         <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListHostedZonesByNameResult withNextDNSName(String nextDNSName) {
        this.nextDNSName = nextDNSName;
        return this;
    }

    /**
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     * <code>true</code>, there are more hosted zones associated with the
     * current AWS account. To get the next page of results, make another
     * request to <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     *         <code>true</code>, there are more hosted zones associated with the
     *         current AWS account. To get the next page of results, make another
     *         request to <code>ListHostedZonesByName</code>. Specify the value of
     *         <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     *         <a>ListHostedZonesByNameRequest$DNSName</a> element and
     *         <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     *         <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     */
    public String getNextHostedZoneId() {
        return nextHostedZoneId;
    }
    
    /**
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     * <code>true</code>, there are more hosted zones associated with the
     * current AWS account. To get the next page of results, make another
     * request to <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param nextHostedZoneId If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     *         <code>true</code>, there are more hosted zones associated with the
     *         current AWS account. To get the next page of results, make another
     *         request to <code>ListHostedZonesByName</code>. Specify the value of
     *         <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     *         <a>ListHostedZonesByNameRequest$DNSName</a> element and
     *         <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     *         <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     */
    public void setNextHostedZoneId(String nextHostedZoneId) {
        this.nextHostedZoneId = nextHostedZoneId;
    }
    
    /**
     * If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     * <code>true</code>, there are more hosted zones associated with the
     * current AWS account. To get the next page of results, make another
     * request to <code>ListHostedZonesByName</code>. Specify the value of
     * <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     * <a>ListHostedZonesByNameRequest$DNSName</a> element and
     * <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     * <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param nextHostedZoneId If <a>ListHostedZonesByNameResponse$IsTruncated</a> is
     *         <code>true</code>, there are more hosted zones associated with the
     *         current AWS account. To get the next page of results, make another
     *         request to <code>ListHostedZonesByName</code>. Specify the value of
     *         <a>ListHostedZonesByNameResponse$NextDNSName</a> in the
     *         <a>ListHostedZonesByNameRequest$DNSName</a> element and
     *         <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> in the
     *         <a>ListHostedZonesByNameRequest$HostedZoneId</a> element.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListHostedZonesByNameResult withNextHostedZoneId(String nextHostedZoneId) {
        this.nextHostedZoneId = nextHostedZoneId;
        return this;
    }

    /**
     * The maximum number of hosted zones to be included in the response
     * body. If the number of hosted zones associated with this AWS account
     * exceeds <code>MaxItems</code>, the value of
     * <a>ListHostedZonesByNameResponse$IsTruncated</a> in the response is
     * <code>true</code>. Call <code>ListHostedZonesByName</code> again and
     * specify the value of <a>ListHostedZonesByNameResponse$NextDNSName</a>
     * and <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> elements
     * respectively to get the next page of results.
     *
     * @return The maximum number of hosted zones to be included in the response
     *         body. If the number of hosted zones associated with this AWS account
     *         exceeds <code>MaxItems</code>, the value of
     *         <a>ListHostedZonesByNameResponse$IsTruncated</a> in the response is
     *         <code>true</code>. Call <code>ListHostedZonesByName</code> again and
     *         specify the value of <a>ListHostedZonesByNameResponse$NextDNSName</a>
     *         and <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> elements
     *         respectively to get the next page of results.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The maximum number of hosted zones to be included in the response
     * body. If the number of hosted zones associated with this AWS account
     * exceeds <code>MaxItems</code>, the value of
     * <a>ListHostedZonesByNameResponse$IsTruncated</a> in the response is
     * <code>true</code>. Call <code>ListHostedZonesByName</code> again and
     * specify the value of <a>ListHostedZonesByNameResponse$NextDNSName</a>
     * and <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> elements
     * respectively to get the next page of results.
     *
     * @param maxItems The maximum number of hosted zones to be included in the response
     *         body. If the number of hosted zones associated with this AWS account
     *         exceeds <code>MaxItems</code>, the value of
     *         <a>ListHostedZonesByNameResponse$IsTruncated</a> in the response is
     *         <code>true</code>. Call <code>ListHostedZonesByName</code> again and
     *         specify the value of <a>ListHostedZonesByNameResponse$NextDNSName</a>
     *         and <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> elements
     *         respectively to get the next page of results.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The maximum number of hosted zones to be included in the response
     * body. If the number of hosted zones associated with this AWS account
     * exceeds <code>MaxItems</code>, the value of
     * <a>ListHostedZonesByNameResponse$IsTruncated</a> in the response is
     * <code>true</code>. Call <code>ListHostedZonesByName</code> again and
     * specify the value of <a>ListHostedZonesByNameResponse$NextDNSName</a>
     * and <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> elements
     * respectively to get the next page of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The maximum number of hosted zones to be included in the response
     *         body. If the number of hosted zones associated with this AWS account
     *         exceeds <code>MaxItems</code>, the value of
     *         <a>ListHostedZonesByNameResponse$IsTruncated</a> in the response is
     *         <code>true</code>. Call <code>ListHostedZonesByName</code> again and
     *         specify the value of <a>ListHostedZonesByNameResponse$NextDNSName</a>
     *         and <a>ListHostedZonesByNameResponse$NextHostedZoneId</a> elements
     *         respectively to get the next page of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListHostedZonesByNameResult withMaxItems(String maxItems) {
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
        if (getHostedZones() != null) sb.append("HostedZones: " + getHostedZones() + ",");
        if (getDNSName() != null) sb.append("DNSName: " + getDNSName() + ",");
        if (getHostedZoneId() != null) sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (isTruncated() != null) sb.append("IsTruncated: " + isTruncated() + ",");
        if (getNextDNSName() != null) sb.append("NextDNSName: " + getNextDNSName() + ",");
        if (getNextHostedZoneId() != null) sb.append("NextHostedZoneId: " + getNextHostedZoneId() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHostedZones() == null) ? 0 : getHostedZones().hashCode()); 
        hashCode = prime * hashCode + ((getDNSName() == null) ? 0 : getDNSName().hashCode()); 
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode()); 
        hashCode = prime * hashCode + ((isTruncated() == null) ? 0 : isTruncated().hashCode()); 
        hashCode = prime * hashCode + ((getNextDNSName() == null) ? 0 : getNextDNSName().hashCode()); 
        hashCode = prime * hashCode + ((getNextHostedZoneId() == null) ? 0 : getNextHostedZoneId().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListHostedZonesByNameResult == false) return false;
        ListHostedZonesByNameResult other = (ListHostedZonesByNameResult)obj;
        
        if (other.getHostedZones() == null ^ this.getHostedZones() == null) return false;
        if (other.getHostedZones() != null && other.getHostedZones().equals(this.getHostedZones()) == false) return false; 
        if (other.getDNSName() == null ^ this.getDNSName() == null) return false;
        if (other.getDNSName() != null && other.getDNSName().equals(this.getDNSName()) == false) return false; 
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null) return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false) return false; 
        if (other.isTruncated() == null ^ this.isTruncated() == null) return false;
        if (other.isTruncated() != null && other.isTruncated().equals(this.isTruncated()) == false) return false; 
        if (other.getNextDNSName() == null ^ this.getNextDNSName() == null) return false;
        if (other.getNextDNSName() != null && other.getNextDNSName().equals(this.getNextDNSName()) == false) return false; 
        if (other.getNextHostedZoneId() == null ^ this.getNextHostedZoneId() == null) return false;
        if (other.getNextHostedZoneId() != null && other.getNextHostedZoneId().equals(this.getNextHostedZoneId()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListHostedZonesByNameResult clone() {
        try {
            return (ListHostedZonesByNameResult) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    