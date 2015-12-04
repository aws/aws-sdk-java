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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#listTrafficPolicyInstances(ListTrafficPolicyInstancesRequest) ListTrafficPolicyInstances operation}.
 * <p>
 * Gets information about the traffic policy instances that you created
 * by using the current AWS account.
 * </p>
 * <p>
 * <b>NOTE:</b>After you submit an UpdateTrafficPolicyInstance request,
 * there's a brief delay while Amazon Route 53 creates the resource
 * record sets that are specified in the traffic policy definition. For
 * more information, see the State response element.
 * </p>
 * <p>
 * To get information about the traffic policy instances that are
 * associated with the current AWS account, send a <code>GET</code>
 * request to the <code>2013-04-01/trafficpolicyinstance</code> resource.
 * </p>
 * <p>
 * Amazon Route 53 returns a maximum of 100 items in each response. If
 * you have a lot of traffic policy instances, you can use the
 * <code>MaxItems</code> parameter to list them in groups of up to 100.
 * </p>
 * <p>
 * The response includes five values that help you navigate from one
 * group of <code>MaxItems</code> traffic policy instances to the next:
 * </p>
 * 
 * <ul>
 * <li> <b>IsTruncated</b> </li>
 * <p>
 * If the value of <code>IsTruncated</code> in the response is
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
 * <li> <b>HostedZoneIdMarker</b> ,
 * <b>TrafficPolicyInstanceNameMarker</b> , and
 * <b>TrafficPolicyInstanceTypeMarker</b> </li>
 * <p>
 * If <code>IsTruncated</code> is <code>true</code> , these three values
 * in the response represent the first traffic policy instance in the
 * next group of <code>MaxItems</code> traffic policy instances. To list
 * more traffic policy instances, make another call to
 * <code>ListTrafficPolicyInstances</code> , and specify these values in
 * the corresponding request parameters.
 * </p>
 * <p>
 * If <code>IsTruncated</code> is <code>false</code> , all three elements
 * are omitted from the response.
 * </p>
 * 
 * </ul>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#listTrafficPolicyInstances(ListTrafficPolicyInstancesRequest)
 */
public class ListTrafficPolicyInstancesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value. <p>If the value of <code>IsTruncated</code> in the
     * previous response was <code>true</code>, you have more traffic policy
     * instances. To get the next group of <code>MaxItems</code> traffic
     * policy instances, submit another
     * <code>ListTrafficPolicyInstances</code> request. For the value of
     * <code>HostedZoneIdMarker</code>, specify the value of
     * <code>HostedZoneIdMarker</code> from the previous response, which is
     * the hosted zone ID of the first traffic policy instance in the next
     * group of <code>MaxItems</code> traffic policy instances. <p>If the
     * value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String hostedZoneIdMarker;

    /**
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value. <p>If the value of <code>IsTruncated</code> in the
     * previous response was <code>true</code>,
     * <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     * traffic policy instance in the next group of <code>MaxItems</code>
     * traffic policy instances. <p>If the value of <code>IsTruncated</code>
     * in the previous response was <code>false</code>, there are no more
     * traffic policy instances to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String trafficPolicyInstanceNameMarker;

    /**
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value. <p>If the value of <code>IsTruncated</code> in the
     * previous response was <code>true</code>,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
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
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value. <p>If the value of <code>IsTruncated</code> in the
     * previous response was <code>true</code>, you have more traffic policy
     * instances. To get the next group of <code>MaxItems</code> traffic
     * policy instances, submit another
     * <code>ListTrafficPolicyInstances</code> request. For the value of
     * <code>HostedZoneIdMarker</code>, specify the value of
     * <code>HostedZoneIdMarker</code> from the previous response, which is
     * the hosted zone ID of the first traffic policy instance in the next
     * group of <code>MaxItems</code> traffic policy instances. <p>If the
     * value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return For the first request to <code>ListTrafficPolicyInstances</code>, omit
     *         this value. <p>If the value of <code>IsTruncated</code> in the
     *         previous response was <code>true</code>, you have more traffic policy
     *         instances. To get the next group of <code>MaxItems</code> traffic
     *         policy instances, submit another
     *         <code>ListTrafficPolicyInstances</code> request. For the value of
     *         <code>HostedZoneIdMarker</code>, specify the value of
     *         <code>HostedZoneIdMarker</code> from the previous response, which is
     *         the hosted zone ID of the first traffic policy instance in the next
     *         group of <code>MaxItems</code> traffic policy instances. <p>If the
     *         value of <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get.
     */
    public String getHostedZoneIdMarker() {
        return hostedZoneIdMarker;
    }
    
    /**
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value. <p>If the value of <code>IsTruncated</code> in the
     * previous response was <code>true</code>, you have more traffic policy
     * instances. To get the next group of <code>MaxItems</code> traffic
     * policy instances, submit another
     * <code>ListTrafficPolicyInstances</code> request. For the value of
     * <code>HostedZoneIdMarker</code>, specify the value of
     * <code>HostedZoneIdMarker</code> from the previous response, which is
     * the hosted zone ID of the first traffic policy instance in the next
     * group of <code>MaxItems</code> traffic policy instances. <p>If the
     * value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneIdMarker For the first request to <code>ListTrafficPolicyInstances</code>, omit
     *         this value. <p>If the value of <code>IsTruncated</code> in the
     *         previous response was <code>true</code>, you have more traffic policy
     *         instances. To get the next group of <code>MaxItems</code> traffic
     *         policy instances, submit another
     *         <code>ListTrafficPolicyInstances</code> request. For the value of
     *         <code>HostedZoneIdMarker</code>, specify the value of
     *         <code>HostedZoneIdMarker</code> from the previous response, which is
     *         the hosted zone ID of the first traffic policy instance in the next
     *         group of <code>MaxItems</code> traffic policy instances. <p>If the
     *         value of <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get.
     */
    public void setHostedZoneIdMarker(String hostedZoneIdMarker) {
        this.hostedZoneIdMarker = hostedZoneIdMarker;
    }
    
    /**
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value. <p>If the value of <code>IsTruncated</code> in the
     * previous response was <code>true</code>, you have more traffic policy
     * instances. To get the next group of <code>MaxItems</code> traffic
     * policy instances, submit another
     * <code>ListTrafficPolicyInstances</code> request. For the value of
     * <code>HostedZoneIdMarker</code>, specify the value of
     * <code>HostedZoneIdMarker</code> from the previous response, which is
     * the hosted zone ID of the first traffic policy instance in the next
     * group of <code>MaxItems</code> traffic policy instances. <p>If the
     * value of <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneIdMarker For the first request to <code>ListTrafficPolicyInstances</code>, omit
     *         this value. <p>If the value of <code>IsTruncated</code> in the
     *         previous response was <code>true</code>, you have more traffic policy
     *         instances. To get the next group of <code>MaxItems</code> traffic
     *         policy instances, submit another
     *         <code>ListTrafficPolicyInstances</code> request. For the value of
     *         <code>HostedZoneIdMarker</code>, specify the value of
     *         <code>HostedZoneIdMarker</code> from the previous response, which is
     *         the hosted zone ID of the first traffic policy instance in the next
     *         group of <code>MaxItems</code> traffic policy instances. <p>If the
     *         value of <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyInstancesRequest withHostedZoneIdMarker(String hostedZoneIdMarker) {
        this.hostedZoneIdMarker = hostedZoneIdMarker;
        return this;
    }

    /**
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value. <p>If the value of <code>IsTruncated</code> in the
     * previous response was <code>true</code>,
     * <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     * traffic policy instance in the next group of <code>MaxItems</code>
     * traffic policy instances. <p>If the value of <code>IsTruncated</code>
     * in the previous response was <code>false</code>, there are no more
     * traffic policy instances to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return For the first request to <code>ListTrafficPolicyInstances</code>, omit
     *         this value. <p>If the value of <code>IsTruncated</code> in the
     *         previous response was <code>true</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     *         traffic policy instance in the next group of <code>MaxItems</code>
     *         traffic policy instances. <p>If the value of <code>IsTruncated</code>
     *         in the previous response was <code>false</code>, there are no more
     *         traffic policy instances to get.
     */
    public String getTrafficPolicyInstanceNameMarker() {
        return trafficPolicyInstanceNameMarker;
    }
    
    /**
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value. <p>If the value of <code>IsTruncated</code> in the
     * previous response was <code>true</code>,
     * <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     * traffic policy instance in the next group of <code>MaxItems</code>
     * traffic policy instances. <p>If the value of <code>IsTruncated</code>
     * in the previous response was <code>false</code>, there are no more
     * traffic policy instances to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param trafficPolicyInstanceNameMarker For the first request to <code>ListTrafficPolicyInstances</code>, omit
     *         this value. <p>If the value of <code>IsTruncated</code> in the
     *         previous response was <code>true</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     *         traffic policy instance in the next group of <code>MaxItems</code>
     *         traffic policy instances. <p>If the value of <code>IsTruncated</code>
     *         in the previous response was <code>false</code>, there are no more
     *         traffic policy instances to get.
     */
    public void setTrafficPolicyInstanceNameMarker(String trafficPolicyInstanceNameMarker) {
        this.trafficPolicyInstanceNameMarker = trafficPolicyInstanceNameMarker;
    }
    
    /**
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value. <p>If the value of <code>IsTruncated</code> in the
     * previous response was <code>true</code>,
     * <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     * traffic policy instance in the next group of <code>MaxItems</code>
     * traffic policy instances. <p>If the value of <code>IsTruncated</code>
     * in the previous response was <code>false</code>, there are no more
     * traffic policy instances to get.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param trafficPolicyInstanceNameMarker For the first request to <code>ListTrafficPolicyInstances</code>, omit
     *         this value. <p>If the value of <code>IsTruncated</code> in the
     *         previous response was <code>true</code>,
     *         <code>TrafficPolicyInstanceNameMarker</code> is the name of the first
     *         traffic policy instance in the next group of <code>MaxItems</code>
     *         traffic policy instances. <p>If the value of <code>IsTruncated</code>
     *         in the previous response was <code>false</code>, there are no more
     *         traffic policy instances to get.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListTrafficPolicyInstancesRequest withTrafficPolicyInstanceNameMarker(String trafficPolicyInstanceNameMarker) {
        this.trafficPolicyInstanceNameMarker = trafficPolicyInstanceNameMarker;
        return this;
    }

    /**
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value. <p>If the value of <code>IsTruncated</code> in the
     * previous response was <code>true</code>,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @return For the first request to <code>ListTrafficPolicyInstances</code>, omit
     *         this value. <p>If the value of <code>IsTruncated</code> in the
     *         previous response was <code>true</code>,
     *         <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *         first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances. <p>If the value of
     *         <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get.
     *
     * @see RRType
     */
    public String getTrafficPolicyInstanceTypeMarker() {
        return trafficPolicyInstanceTypeMarker;
    }
    
    /**
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value. <p>If the value of <code>IsTruncated</code> in the
     * previous response was <code>true</code>,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyInstanceTypeMarker For the first request to <code>ListTrafficPolicyInstances</code>, omit
     *         this value. <p>If the value of <code>IsTruncated</code> in the
     *         previous response was <code>true</code>,
     *         <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *         first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances. <p>If the value of
     *         <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get.
     *
     * @see RRType
     */
    public void setTrafficPolicyInstanceTypeMarker(String trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker;
    }
    
    /**
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value. <p>If the value of <code>IsTruncated</code> in the
     * previous response was <code>true</code>,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyInstanceTypeMarker For the first request to <code>ListTrafficPolicyInstances</code>, omit
     *         this value. <p>If the value of <code>IsTruncated</code> in the
     *         previous response was <code>true</code>,
     *         <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *         first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances. <p>If the value of
     *         <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RRType
     */
    public ListTrafficPolicyInstancesRequest withTrafficPolicyInstanceTypeMarker(String trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker;
        return this;
    }

    /**
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value. <p>If the value of <code>IsTruncated</code> in the
     * previous response was <code>true</code>,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyInstanceTypeMarker For the first request to <code>ListTrafficPolicyInstances</code>, omit
     *         this value. <p>If the value of <code>IsTruncated</code> in the
     *         previous response was <code>true</code>,
     *         <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *         first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances. <p>If the value of
     *         <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get.
     *
     * @see RRType
     */
    public void setTrafficPolicyInstanceTypeMarker(RRType trafficPolicyInstanceTypeMarker) {
        this.trafficPolicyInstanceTypeMarker = trafficPolicyInstanceTypeMarker.toString();
    }
    
    /**
     * For the first request to <code>ListTrafficPolicyInstances</code>, omit
     * this value. <p>If the value of <code>IsTruncated</code> in the
     * previous response was <code>true</code>,
     * <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     * first traffic policy instance in the next group of
     * <code>MaxItems</code> traffic policy instances. <p>If the value of
     * <code>IsTruncated</code> in the previous response was
     * <code>false</code>, there are no more traffic policy instances to get.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param trafficPolicyInstanceTypeMarker For the first request to <code>ListTrafficPolicyInstances</code>, omit
     *         this value. <p>If the value of <code>IsTruncated</code> in the
     *         previous response was <code>true</code>,
     *         <code>TrafficPolicyInstanceTypeMarker</code> is the DNS type of the
     *         first traffic policy instance in the next group of
     *         <code>MaxItems</code> traffic policy instances. <p>If the value of
     *         <code>IsTruncated</code> in the previous response was
     *         <code>false</code>, there are no more traffic policy instances to get.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RRType
     */
    public ListTrafficPolicyInstancesRequest withTrafficPolicyInstanceTypeMarker(RRType trafficPolicyInstanceTypeMarker) {
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
    public ListTrafficPolicyInstancesRequest withMaxItems(String maxItems) {
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
        if (getHostedZoneIdMarker() != null) sb.append("HostedZoneIdMarker: " + getHostedZoneIdMarker() + ",");
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
        
        hashCode = prime * hashCode + ((getHostedZoneIdMarker() == null) ? 0 : getHostedZoneIdMarker().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficPolicyInstanceNameMarker() == null) ? 0 : getTrafficPolicyInstanceNameMarker().hashCode()); 
        hashCode = prime * hashCode + ((getTrafficPolicyInstanceTypeMarker() == null) ? 0 : getTrafficPolicyInstanceTypeMarker().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTrafficPolicyInstancesRequest == false) return false;
        ListTrafficPolicyInstancesRequest other = (ListTrafficPolicyInstancesRequest)obj;
        
        if (other.getHostedZoneIdMarker() == null ^ this.getHostedZoneIdMarker() == null) return false;
        if (other.getHostedZoneIdMarker() != null && other.getHostedZoneIdMarker().equals(this.getHostedZoneIdMarker()) == false) return false; 
        if (other.getTrafficPolicyInstanceNameMarker() == null ^ this.getTrafficPolicyInstanceNameMarker() == null) return false;
        if (other.getTrafficPolicyInstanceNameMarker() != null && other.getTrafficPolicyInstanceNameMarker().equals(this.getTrafficPolicyInstanceNameMarker()) == false) return false; 
        if (other.getTrafficPolicyInstanceTypeMarker() == null ^ this.getTrafficPolicyInstanceTypeMarker() == null) return false;
        if (other.getTrafficPolicyInstanceTypeMarker() != null && other.getTrafficPolicyInstanceTypeMarker().equals(this.getTrafficPolicyInstanceTypeMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTrafficPolicyInstancesRequest clone() {
        
            return (ListTrafficPolicyInstancesRequest) super.clone();
    }

}
    