/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#listHostedZones(ListHostedZonesRequest) ListHostedZones operation}.
 * <p>
 * To retrieve a list of your hosted zones, send a <code>GET</code> request to the <code>2012-12-12/hostedzone</code> resource. The response to this
 * request includes a <code>HostedZones</code> element with zero, one, or multiple <code>HostedZone</code> child elements. By default, the list of hosted
 * zones is displayed on a single page. You can control the length of the page that is displayed by using the <code>MaxItems</code> parameter. You can
 * use the <code>Marker</code> parameter to control the hosted zone that the list begins with.
 * </p>
 * <p>
 * <b>NOTE:</b> Amazon Route 53 returns a maximum of 100 items. If you set MaxItems to a value greater than 100, Amazon Route 53 returns only the first
 * 100.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#listHostedZones(ListHostedZonesRequest)
 */
public class ListHostedZonesRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextMarker</code> from the last
     * response in the <code>marker</code> parameter to get the next page of
     * results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String marker;

    /**
     * Specify the maximum number of hosted zones to return per page of
     * results.
     */
    private String maxItems;

    /**
     * Default constructor for a new ListHostedZonesRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListHostedZonesRequest() {}
    
    /**
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextMarker</code> from the last
     * response in the <code>marker</code> parameter to get the next page of
     * results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return If the request returned more than one page of results, submit another
     *         request and specify the value of <code>NextMarker</code> from the last
     *         response in the <code>marker</code> parameter to get the next page of
     *         results.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextMarker</code> from the last
     * response in the <code>marker</code> parameter to get the next page of
     * results.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param marker If the request returned more than one page of results, submit another
     *         request and specify the value of <code>NextMarker</code> from the last
     *         response in the <code>marker</code> parameter to get the next page of
     *         results.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * If the request returned more than one page of results, submit another
     * request and specify the value of <code>NextMarker</code> from the last
     * response in the <code>marker</code> parameter to get the next page of
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param marker If the request returned more than one page of results, submit another
     *         request and specify the value of <code>NextMarker</code> from the last
     *         response in the <code>marker</code> parameter to get the next page of
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListHostedZonesRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Specify the maximum number of hosted zones to return per page of
     * results.
     *
     * @return Specify the maximum number of hosted zones to return per page of
     *         results.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * Specify the maximum number of hosted zones to return per page of
     * results.
     *
     * @param maxItems Specify the maximum number of hosted zones to return per page of
     *         results.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Specify the maximum number of hosted zones to return per page of
     * results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems Specify the maximum number of hosted zones to return per page of
     *         results.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListHostedZonesRequest withMaxItems(String maxItems) {
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
        if (getMarker() != null) sb.append("Marker: " + getMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListHostedZonesRequest == false) return false;
        ListHostedZonesRequest other = (ListHostedZonesRequest)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
}
    