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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * To retrieve a list of your hosted zones in lexicographic order, send a
 * <code>GET</code> request to the <code>2015-01-01/hostedzonesbyname</code>
 * resource. The response to this request includes a <code>HostedZones</code>
 * element with zero or more <code>HostedZone</code> child elements
 * lexicographically ordered by DNS name. By default, the list of hosted zones
 * is displayed on a single page. You can control the length of the page that is
 * displayed by using the <code>MaxItems</code> parameter. You can use the
 * <code>DNSName</code> and <code>HostedZoneId</code> parameters to control the
 * hosted zone that the list begins with.
 * </p>
 * <p>
 * For more information about listing hosted zones, see <a href=
 * "http://docs.aws.amazon.com/Route53/latest/DeveloperGuide/ListInfoOnHostedZone.html"
 * >Listing the Hosted Zones for an AWS Account</a> in the <i>Amazon Route 53
 * Developer Guide</i>.
 * </p>
 */
public class ListHostedZonesByNameRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * The first name in the lexicographic ordering of domain names that you
     * want the <code>ListHostedZonesByNameRequest</code> request to list.
     * </p>
     * <p>
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> from the last response in the
     * <code>DNSName</code> and <code>HostedZoneId</code> parameters to get the
     * next page of results.
     * </p>
     */
    private String dNSName;
    /**
     * <p>
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> from the last response in the
     * <code>DNSName</code> and <code>HostedZoneId</code> parameters to get the
     * next page of results.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * Specify the maximum number of hosted zones to return per page of results.
     * </p>
     */
    private String maxItems;

    /**
     * <p>
     * The first name in the lexicographic ordering of domain names that you
     * want the <code>ListHostedZonesByNameRequest</code> request to list.
     * </p>
     * <p>
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> from the last response in the
     * <code>DNSName</code> and <code>HostedZoneId</code> parameters to get the
     * next page of results.
     * </p>
     * 
     * @param dNSName
     *        The first name in the lexicographic ordering of domain names that
     *        you want the <code>ListHostedZonesByNameRequest</code> request to
     *        list.</p>
     *        <p>
     *        If the request returned more than one page of results, submit
     *        another request and specify the value of <code>NextDNSName</code>
     *        and <code>NextHostedZoneId</code> from the last response in the
     *        <code>DNSName</code> and <code>HostedZoneId</code> parameters to
     *        get the next page of results.
     */
    public void setDNSName(String dNSName) {
        this.dNSName = dNSName;
    }

    /**
     * <p>
     * The first name in the lexicographic ordering of domain names that you
     * want the <code>ListHostedZonesByNameRequest</code> request to list.
     * </p>
     * <p>
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> from the last response in the
     * <code>DNSName</code> and <code>HostedZoneId</code> parameters to get the
     * next page of results.
     * </p>
     * 
     * @return The first name in the lexicographic ordering of domain names that
     *         you want the <code>ListHostedZonesByNameRequest</code> request to
     *         list.</p>
     *         <p>
     *         If the request returned more than one page of results, submit
     *         another request and specify the value of <code>NextDNSName</code>
     *         and <code>NextHostedZoneId</code> from the last response in the
     *         <code>DNSName</code> and <code>HostedZoneId</code> parameters to
     *         get the next page of results.
     */
    public String getDNSName() {
        return this.dNSName;
    }

    /**
     * <p>
     * The first name in the lexicographic ordering of domain names that you
     * want the <code>ListHostedZonesByNameRequest</code> request to list.
     * </p>
     * <p>
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> from the last response in the
     * <code>DNSName</code> and <code>HostedZoneId</code> parameters to get the
     * next page of results.
     * </p>
     * 
     * @param dNSName
     *        The first name in the lexicographic ordering of domain names that
     *        you want the <code>ListHostedZonesByNameRequest</code> request to
     *        list.</p>
     *        <p>
     *        If the request returned more than one page of results, submit
     *        another request and specify the value of <code>NextDNSName</code>
     *        and <code>NextHostedZoneId</code> from the last response in the
     *        <code>DNSName</code> and <code>HostedZoneId</code> parameters to
     *        get the next page of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameRequest withDNSName(String dNSName) {
        setDNSName(dNSName);
        return this;
    }

    /**
     * <p>
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> from the last response in the
     * <code>DNSName</code> and <code>HostedZoneId</code> parameters to get the
     * next page of results.
     * </p>
     * 
     * @param hostedZoneId
     *        If the request returned more than one page of results, submit
     *        another request and specify the value of <code>NextDNSName</code>
     *        and <code>NextHostedZoneId</code> from the last response in the
     *        <code>DNSName</code> and <code>HostedZoneId</code> parameters to
     *        get the next page of results.
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> from the last response in the
     * <code>DNSName</code> and <code>HostedZoneId</code> parameters to get the
     * next page of results.
     * </p>
     * 
     * @return If the request returned more than one page of results, submit
     *         another request and specify the value of <code>NextDNSName</code>
     *         and <code>NextHostedZoneId</code> from the last response in the
     *         <code>DNSName</code> and <code>HostedZoneId</code> parameters to
     *         get the next page of results.
     */
    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextDNSName</code> and
     * <code>NextHostedZoneId</code> from the last response in the
     * <code>DNSName</code> and <code>HostedZoneId</code> parameters to get the
     * next page of results.
     * </p>
     * 
     * @param hostedZoneId
     *        If the request returned more than one page of results, submit
     *        another request and specify the value of <code>NextDNSName</code>
     *        and <code>NextHostedZoneId</code> from the last response in the
     *        <code>DNSName</code> and <code>HostedZoneId</code> parameters to
     *        get the next page of results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * Specify the maximum number of hosted zones to return per page of results.
     * </p>
     * 
     * @param maxItems
     *        Specify the maximum number of hosted zones to return per page of
     *        results.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * Specify the maximum number of hosted zones to return per page of results.
     * </p>
     * 
     * @return Specify the maximum number of hosted zones to return per page of
     *         results.
     */
    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * Specify the maximum number of hosted zones to return per page of results.
     * </p>
     * 
     * @param maxItems
     *        Specify the maximum number of hosted zones to return per page of
     *        results.
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public ListHostedZonesByNameRequest withMaxItems(String maxItems) {
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
        if (getDNSName() != null)
            sb.append("DNSName: " + getDNSName() + ",");
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: " + getHostedZoneId() + ",");
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

        if (obj instanceof ListHostedZonesByNameRequest == false)
            return false;
        ListHostedZonesByNameRequest other = (ListHostedZonesByNameRequest) obj;
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

        hashCode = prime * hashCode
                + ((getDNSName() == null) ? 0 : getDNSName().hashCode());
        hashCode = prime
                * hashCode
                + ((getHostedZoneId() == null) ? 0 : getHostedZoneId()
                        .hashCode());
        hashCode = prime * hashCode
                + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListHostedZonesByNameRequest clone() {
        return (ListHostedZonesByNameRequest) super.clone();
    }
}