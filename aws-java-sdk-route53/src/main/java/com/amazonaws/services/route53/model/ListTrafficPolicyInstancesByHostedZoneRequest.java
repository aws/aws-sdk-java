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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#listTrafficPolicyInstancesByHostedZone(ListTrafficPolicyInstancesByHostedZoneRequest) ListTrafficPolicyInstancesByHostedZone operation}.
 * <p>
 * Gets information about the traffic policy instances that you created
 * in a specified hosted zone.
 * </p>
 * <p>
 * <b>NOTE:</b>After you submit an UpdateTrafficPolicyInstance request,
 * there's a brief delay while Amazon Route 53 creates the resource
 * record sets that are specified in the traffic policy definition. For
 * more information, see the State response element.
 * </p>
 * <p>
 * To get information about the traffic policy instances that you created
 * in a specified hosted zone, send a <code>GET</code> request to the
 * <code>2013-04-01/trafficpolicyinstance</code> resource and include the
 * ID of the hosted zone.
 * </p>
 * <p>
 * Amazon Route 53 returns a maximum of 100 items in each response. If
 * you have a lot of traffic policy instances, you can use the
 * <code>MaxItems</code> parameter to list them in groups of up to 100.
 * </p>
 * <p>
 * The response includes four values that help you navigate from one
 * group of <code>MaxItems</code> traffic policy instances to the next:
 * </p>
 * 
 * <ul>
 * <li> <b>IsTruncated</b> </li>
 * <p>
 * If the value of <code></code> IsTruncated in the response is
 * <code>true</code> , there are more traffic policy instances associated
 * with the current AWS account.
 * </p>
 * <p>
 * If <code>IsTruncated</code> is <code>false</code> , this response
 * includes the last traffic policy instance that is associated with the
 * current account.
 * </p>
 * <li> <b>MaxItems</b> </li>
 * <p>
 * The value that you specified for the <code>MaxItems</code> parameter
 * in the request that produced the current response.
 * </p>
 * <li> <b>TrafficPolicyInstanceNameMarker</b> and
 * <b>TrafficPolicyInstanceTypeMarker</b> </li>
 * <p>
 * If <code>IsTruncated</code> is <code>true</code> , these two values in
 * the response represent the first traffic policy instance in the next
 * group of <code>MaxItems</code> traffic policy instances. To list more
 * traffic policy instances, make another call to
 * <code>ListTrafficPolicyInstancesByHostedZone</code> , and specify
 * these values in the corresponding request parameters.
 * </p>
 * <p>
 * If <code>IsTruncated</code> is <code>false</code> , all three elements
 * are omitted from the response.
 * </p>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#listTrafficPolicyInstancesByHostedZone(ListTrafficPolicyInstancesByHostedZoneRequest)
 */
public class ListTrafficPolicyInstancesByHostedZoneRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the hosted zone for which you want to list traffic policy
     * instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String hostedZoneId;

    /**
     * For the first request to
     * <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     * <p>If the value of <code>IsTruncated</code> in the previous response
     * was <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is
     * the name of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get
     * for this hosted zone. <p>If the value of <code>IsTruncated</code> in
     * the previous response was <code>false</code>, omit this value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String trafficPolicyInstanceNameMarker;

    /**
     * For the first request to
     * <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     * <p>If the value of <code>IsTruncated</code> in the previous response
     * was <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is
     * the DNS type of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get
     * for this hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     */
    private String trafficPolicyInstanceTypeMarker;

    /**
     * The maximum number of traffic policy instances to be included in the
     * response body for this request. If you have more than
     * <code>MaxItems</code> traffic policy instances, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> represent the first
     * traffic policy instance in the next group of <code>MaxItems</code>
     * traffic policy instances.
     */
    private String maxItems;

    /**
     * The ID of the hosted zone for which you want to list traffic policy
     * instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return The ID of the hosted zone for which you want to list traffic policy
     *         instances.
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }
    
    /**
     * The ID of the hosted zone for which you want to list traffic policy
     * instances.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId The ID of the hosted zone for which you want to list traffic policy
     *         instances.
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }
    
    /**
     * The ID of the hosted zone for which you want to list traffic policy
     * instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId The ID of the hosted zone for which you want to list traffic policy
     *         instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyInstancesByHostedZoneRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * For the first request to
     * <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     * <p>If the value of <code>IsTruncated</code> in the previous response
     * was <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is
     * the name of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get
     * for this hosted zone. <p>If the value of <code>IsTruncated</code> in
     * the previous response was <code>false</code>, omit this value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return For the first request to
     *         <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     *         <p>If the value of <code>IsTruncated</code> in the previous response
     *         was <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is
     *         the name of the first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances. <p>If the value of
     *         <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get
     *         for this hosted zone. <p>If the value of <code>IsTruncated</code> in
     *         the previous response was <code>false</code>, omit this value.
     */
    public String getTrafficPolicyInstanceNameMarker() {
        return trafficPolicyInstanceNameMarker;
    }
    
    /**
     * For the first request to
     * <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     * <p>If the value of <code>IsTruncated</code> in the previous response
     * was <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is
     * the name of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get
     * for this hosted zone. <p>If the value of <code>IsTruncated</code> in
     * the previous response was <code>false</code>, omit this value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param trafficPolicyInstanceNameMarker For the first request to
     *         <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     *         <p>If the value of <code>IsTruncated</code> in the previous response
     *         was <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is
     *         the name of the first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances. <p>If the value of
     *         <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get
     *         for this hosted zone. <p>If the value of <code>IsTruncated</code> in
     *         the previous response was <code>false</code>, omit this value.
     */
    public void setTrafficPolicyInstanceNameMarker(String trafficPolicyInstanceNameMarker) {
        this.trafficPolicyInstanceNameMarker = trafficPolicyInstanceNameMarker;
    }
    
    /**
     * For the first request to
     * <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     * <p>If the value of <code>IsTruncated</code> in the previous response
     * was <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is
     * the name of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get
     * for this hosted zone. <p>If the value of <code>IsTruncated</code> in
     * the previous response was <code>false</code>, omit this value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param trafficPolicyInstanceNameMarker For the first request to
     *         <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     *         <p>If the value of <code>IsTruncated</code> in the previous response
     *         was <code>true</code>, <code>TrafficPolicyInstanceNameMarker</code> is
     *         the name of the first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances. <p>If the value of
     *         <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get
     *         for this hosted zone. <p>If the value of <code>IsTruncated</code> in
     *         the previous response was <code>false</code>, omit this value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyInstancesByHostedZoneRequest withTrafficPolicyInstanceNameMarker(String trafficPolicyInstanceNameMarker) {
        this.trafficPolicyInstanceNameMarker = trafficPolicyInstanceNameMarker;
        return this;
    }

    /**
     * For the first request to
     * <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     * <p>If the value of <code>IsTruncated</code> in the previous response
     * was <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is
     * the DNS type of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get
     * for this hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @return For the first request to
     *         <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     *         <p>If the value of <code>IsTruncated</code> in the previous response
     *         was <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is
     *         the DNS type of the first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances. <p>If the value of
     *         <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get
     *         for this hosted zone.
     *
     * @see RRType
     */
    public String getTrafficPolicyInstanceTypeMarker() {
        return trafficPolicyInstanceTypeMarker;
    }
    
    /**
     * For the first request to
     * <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     * <p>If the value of <code>IsTruncated</code> in the previous response
     * was <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is
     * the DNS type of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get
     * for this hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyInstanceTypeMarker For the first request to
     *         <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     *         <p>If the value of <code>IsTruncated</code> in the previous response
     *         was <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is
     *         the DNS type of the first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances. <p>If the value of
     *         <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get
     *         for this hosted zone.
     *
     * @see RRType
     */
    public void setTrafficPolicyInstanceTypeMarker(String trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker;
    }
    
    /**
     * For the first request to
     * <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     * <p>If the value of <code>IsTruncated</code> in the previous response
     * was <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is
     * the DNS type of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get
     * for this hosted zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyInstanceTypeMarker For the first request to
     *         <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     *         <p>If the value of <code>IsTruncated</code> in the previous response
     *         was <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is
     *         the DNS type of the first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances. <p>If the value of
     *         <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get
     *         for this hosted zone.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RRType
     */
    public ListTrafficPolicyInstancesByHostedZoneRequest withTrafficPolicyInstanceTypeMarker(String trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker;
        return this;
    }

    /**
     * For the first request to
     * <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     * <p>If the value of <code>IsTruncated</code> in the previous response
     * was <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is
     * the DNS type of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get
     * for this hosted zone.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyInstanceTypeMarker For the first request to
     *         <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     *         <p>If the value of <code>IsTruncated</code> in the previous response
     *         was <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is
     *         the DNS type of the first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances. <p>If the value of
     *         <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get
     *         for this hosted zone.
     *
     * @see RRType
     */
    public void setTrafficPolicyInstanceTypeMarker(RRType trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker.toString();
    }
    
    /**
     * For the first request to
     * <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     * <p>If the value of <code>IsTruncated</code> in the previous response
     * was <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is
     * the DNS type of the first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get
     * for this hosted zone.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyInstanceTypeMarker For the first request to
     *         <code>ListTrafficPolicyInstancesByHostedZone</code>, omit this value.
     *         <p>If the value of <code>IsTruncated</code> in the previous response
     *         was <code>true</code>, <code>TrafficPolicyInstanceTypeMarker</code> is
     *         the DNS type of the first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances. <p>If the value of
     *         <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get
     *         for this hosted zone.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RRType
     */
    public ListTrafficPolicyInstancesByHostedZoneRequest withTrafficPolicyInstanceTypeMarker(RRType trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker.toString();
        return this;
    }

    /**
     * The maximum number of traffic policy instances to be included in the
     * response body for this request. If you have more than
     * <code>MaxItems</code> traffic policy instances, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> represent the first
     * traffic policy instance in the next group of <code>MaxItems</code>
     * traffic policy instances.
     *
     * @return The maximum number of traffic policy instances to be included in the
     *         response body for this request. If you have more than
     *         <code>MaxItems</code> traffic policy instances, the value of the
     *         <code>IsTruncated</code> element in the response is <code>true</code>,
     *         and the values of <code>HostedZoneIdMarker</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code>, and
     *         <code>TrafficPolicyInstanceTypeMarker</code> represent the first
     *         traffic policy instance in the next group of <code>MaxItems</code>
     *         traffic policy instances.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The maximum number of traffic policy instances to be included in the
     * response body for this request. If you have more than
     * <code>MaxItems</code> traffic policy instances, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> represent the first
     * traffic policy instance in the next group of <code>MaxItems</code>
     * traffic policy instances.
     *
     * @param maxItems The maximum number of traffic policy instances to be included in the
     *         response body for this request. If you have more than
     *         <code>MaxItems</code> traffic policy instances, the value of the
     *         <code>IsTruncated</code> element in the response is <code>true</code>,
     *         and the values of <code>HostedZoneIdMarker</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code>, and
     *         <code>TrafficPolicyInstanceTypeMarker</code> represent the first
     *         traffic policy instance in the next group of <code>MaxItems</code>
     *         traffic policy instances.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The maximum number of traffic policy instances to be included in the
     * response body for this request. If you have more than
     * <code>MaxItems</code> traffic policy instances, the value of the
     * <code>IsTruncated</code> element in the response is <code>true</code>,
     * and the values of <code>HostedZoneIdMarker</code>,
     * <code>TrafficPolicyInstanceNameMarker</code>, and
     * <code>TrafficPolicyInstanceTypeMarker</code> represent the first
     * traffic policy instance in the next group of <code>MaxItems</code>
     * traffic policy instances.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The maximum number of traffic policy instances to be included in the
     *         response body for this request. If you have more than
     *         <code>MaxItems</code> traffic policy instances, the value of the
     *         <code>IsTruncated</code> element in the response is <code>true</code>,
     *         and the values of <code>HostedZoneIdMarker</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code>, and
     *         <code>TrafficPolicyInstanceTypeMarker</code> represent the first
     *         traffic policy instance in the next group of <code>MaxItems</code>
     *         traffic policy instances.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyInstancesByHostedZoneRequest withMaxItems(String maxItems) {
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
        if (getHostedZoneId() != null) sb.append("HostedZoneId: " + getHostedZoneId() + ",");
        if (getTrafficPolicyInstanceNameMarker() != null) sb.append("TrafficPolicyInstanceNameMarker: " + getTrafficPolicyInstanceNameMarker() + ",");
        if (getTrafficPolicyInstanceTypeMarker() != null) sb.append("TrafficPolicyInstanceTypeMarker: " + getTrafficPolicyInstanceTypeMarker() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficPolicyInstanceNameMarker() == null) ? 0 : getTrafficPolicyInstanceNameMarker().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficPolicyInstanceTypeMarker() == null) ? 0 : getTrafficPolicyInstanceTypeMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTrafficPolicyInstancesByHostedZoneRequest == false) return false;
        ListTrafficPolicyInstancesByHostedZoneRequest other = (ListTrafficPolicyInstancesByHostedZoneRequest)obj;
        
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null) return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false) return false; 
        if (other.getTrafficPolicyInstanceNameMarker() == null ^ this.getTrafficPolicyInstanceNameMarker() == null) return false;
        if (other.getTrafficPolicyInstanceNameMarker() != null && other.getTrafficPolicyInstanceNameMarker().equals(this.getTrafficPolicyInstanceNameMarker()) == false) return false; 
        if (other.getTrafficPolicyInstanceTypeMarker() == null ^ this.getTrafficPolicyInstanceTypeMarker() == null) return false;
        if (other.getTrafficPolicyInstanceTypeMarker() != null && other.getTrafficPolicyInstanceTypeMarker().equals(this.getTrafficPolicyInstanceTypeMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTrafficPolicyInstancesByHostedZoneRequest clone() {
        
            return (ListTrafficPolicyInstancesByHostedZoneRequest) super.clone();
    }

}
    