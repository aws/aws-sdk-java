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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A request for the resource record sets that are associated with a specified hosted zone.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListResourceRecordSets" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListResourceRecordSetsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you want to list.
     * </p>
     */
    private String hostedZoneId;
    /**
     * <p>
     * The first name in the lexicographic ordering of resource record sets that you want to list.
     * </p>
     */
    private String startRecordName;
    /**
     * <p>
     * The type of resource record set to begin the record listing from.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code>
     * | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> | <code>AAAA</code>
     * | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>API Gateway custom regional API or edge-optimized API</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFront distribution</b>: A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing load balancer</b>: A | AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon S3 bucket</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon VPC interface VPC endpoint</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> The type of the resource record set that the alias
     * references.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying <code>name</code> returns an
     * <code>InvalidInput</code> error.
     * </p>
     */
    private String startRecordType;
    /**
     * <p>
     * <i>Weighted resource record sets only:</i> If results were truncated for a given DNS name and type, specify the
     * value of <code>NextRecordIdentifier</code> from the previous response to get the next resource record set that
     * has the current DNS name and type.
     * </p>
     */
    private String startRecordIdentifier;
    /**
     * <p>
     * (Optional) The maximum number of resource records sets to include in the response body for this request. If the
     * response includes more than <code>maxitems</code> resource record sets, the value of the <code>IsTruncated</code>
     * element in the response is <code>true</code>, and the values of the <code>NextRecordName</code> and
     * <code>NextRecordType</code> elements in the response identify the first resource record set in the next group of
     * <code>maxitems</code> resource record sets.
     * </p>
     */
    private String maxItems;

    /**
     * Default constructor for ListResourceRecordSetsRequest object. Callers should use the setter or fluent setter
     * (with...) methods to initialize the object after creating it.
     */
    public ListResourceRecordSetsRequest() {
    }

    /**
     * Constructs a new ListResourceRecordSetsRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize any additional object members.
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that contains the resource record sets that you want to list.
     */
    public ListResourceRecordSetsRequest(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
    }

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you want to list.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that contains the resource record sets that you want to list.
     */

    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you want to list.
     * </p>
     * 
     * @return The ID of the hosted zone that contains the resource record sets that you want to list.
     */

    public String getHostedZoneId() {
        return this.hostedZoneId;
    }

    /**
     * <p>
     * The ID of the hosted zone that contains the resource record sets that you want to list.
     * </p>
     * 
     * @param hostedZoneId
     *        The ID of the hosted zone that contains the resource record sets that you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceRecordSetsRequest withHostedZoneId(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
        return this;
    }

    /**
     * <p>
     * The first name in the lexicographic ordering of resource record sets that you want to list.
     * </p>
     * 
     * @param startRecordName
     *        The first name in the lexicographic ordering of resource record sets that you want to list.
     */

    public void setStartRecordName(String startRecordName) {
        this.startRecordName = startRecordName;
    }

    /**
     * <p>
     * The first name in the lexicographic ordering of resource record sets that you want to list.
     * </p>
     * 
     * @return The first name in the lexicographic ordering of resource record sets that you want to list.
     */

    public String getStartRecordName() {
        return this.startRecordName;
    }

    /**
     * <p>
     * The first name in the lexicographic ordering of resource record sets that you want to list.
     * </p>
     * 
     * @param startRecordName
     *        The first name in the lexicographic ordering of resource record sets that you want to list.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceRecordSetsRequest withStartRecordName(String startRecordName) {
        setStartRecordName(startRecordName);
        return this;
    }

    /**
     * <p>
     * The type of resource record set to begin the record listing from.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code>
     * | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> | <code>AAAA</code>
     * | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>API Gateway custom regional API or edge-optimized API</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFront distribution</b>: A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing load balancer</b>: A | AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon S3 bucket</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon VPC interface VPC endpoint</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> The type of the resource record set that the alias
     * references.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying <code>name</code> returns an
     * <code>InvalidInput</code> error.
     * </p>
     * 
     * @param startRecordType
     *        The type of resource record set to begin the record listing from.</p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> |
     *        <code>SOA</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     *        <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>API Gateway custom regional API or edge-optimized API</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CloudFront distribution</b>: A or AAAA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Load Balancing load balancer</b>: A | AAAA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon S3 bucket</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon VPC interface VPC endpoint</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Another resource record set in this hosted zone:</b> The type of the resource record set that the alias
     *        references.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Constraint: Specifying <code>type</code> without specifying <code>name</code> returns an
     *        <code>InvalidInput</code> error.
     * @see RRType
     */

    public void setStartRecordType(String startRecordType) {
        this.startRecordType = startRecordType;
    }

    /**
     * <p>
     * The type of resource record set to begin the record listing from.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code>
     * | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> | <code>AAAA</code>
     * | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>API Gateway custom regional API or edge-optimized API</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFront distribution</b>: A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing load balancer</b>: A | AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon S3 bucket</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon VPC interface VPC endpoint</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> The type of the resource record set that the alias
     * references.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying <code>name</code> returns an
     * <code>InvalidInput</code> error.
     * </p>
     * 
     * @return The type of resource record set to begin the record listing from.</p>
     *         <p>
     *         Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     *         <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> |
     *         <code>SOA</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *         </p>
     *         <p>
     *         Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> |
     *         <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     *         <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *         </p>
     *         <p>
     *         Values for alias resource record sets:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <b>API Gateway custom regional API or edge-optimized API</b>: A
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>CloudFront distribution</b>: A or AAAA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Elastic Load Balancing load balancer</b>: A | AAAA
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Amazon S3 bucket</b>: A
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Amazon VPC interface VPC endpoint</b>: A
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <b>Another resource record set in this hosted zone:</b> The type of the resource record set that the
     *         alias references.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Constraint: Specifying <code>type</code> without specifying <code>name</code> returns an
     *         <code>InvalidInput</code> error.
     * @see RRType
     */

    public String getStartRecordType() {
        return this.startRecordType;
    }

    /**
     * <p>
     * The type of resource record set to begin the record listing from.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code>
     * | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> | <code>AAAA</code>
     * | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>API Gateway custom regional API or edge-optimized API</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFront distribution</b>: A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing load balancer</b>: A | AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon S3 bucket</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon VPC interface VPC endpoint</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> The type of the resource record set that the alias
     * references.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying <code>name</code> returns an
     * <code>InvalidInput</code> error.
     * </p>
     * 
     * @param startRecordType
     *        The type of resource record set to begin the record listing from.</p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> |
     *        <code>SOA</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     *        <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>API Gateway custom regional API or edge-optimized API</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CloudFront distribution</b>: A or AAAA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Load Balancing load balancer</b>: A | AAAA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon S3 bucket</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon VPC interface VPC endpoint</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Another resource record set in this hosted zone:</b> The type of the resource record set that the alias
     *        references.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Constraint: Specifying <code>type</code> without specifying <code>name</code> returns an
     *        <code>InvalidInput</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public ListResourceRecordSetsRequest withStartRecordType(String startRecordType) {
        setStartRecordType(startRecordType);
        return this;
    }

    /**
     * <p>
     * The type of resource record set to begin the record listing from.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code>
     * | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> | <code>AAAA</code>
     * | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>API Gateway custom regional API or edge-optimized API</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFront distribution</b>: A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing load balancer</b>: A | AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon S3 bucket</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon VPC interface VPC endpoint</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> The type of the resource record set that the alias
     * references.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying <code>name</code> returns an
     * <code>InvalidInput</code> error.
     * </p>
     * 
     * @param startRecordType
     *        The type of resource record set to begin the record listing from.</p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> |
     *        <code>SOA</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     *        <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>API Gateway custom regional API or edge-optimized API</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CloudFront distribution</b>: A or AAAA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Load Balancing load balancer</b>: A | AAAA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon S3 bucket</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon VPC interface VPC endpoint</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Another resource record set in this hosted zone:</b> The type of the resource record set that the alias
     *        references.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Constraint: Specifying <code>type</code> without specifying <code>name</code> returns an
     *        <code>InvalidInput</code> error.
     * @see RRType
     */

    public void setStartRecordType(RRType startRecordType) {
        withStartRecordType(startRecordType);
    }

    /**
     * <p>
     * The type of resource record set to begin the record listing from.
     * </p>
     * <p>
     * Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> | <code>SOA</code>
     * | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> | <code>AAAA</code>
     * | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>PTR</code> |
     * <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     * </p>
     * <p>
     * Values for alias resource record sets:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <b>API Gateway custom regional API or edge-optimized API</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>CloudFront distribution</b>: A or AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Elastic Load Balancing load balancer</b>: A | AAAA
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon S3 bucket</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Amazon VPC interface VPC endpoint</b>: A
     * </p>
     * </li>
     * <li>
     * <p>
     * <b>Another resource record set in this hosted zone:</b> The type of the resource record set that the alias
     * references.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Constraint: Specifying <code>type</code> without specifying <code>name</code> returns an
     * <code>InvalidInput</code> error.
     * </p>
     * 
     * @param startRecordType
     *        The type of resource record set to begin the record listing from.</p>
     *        <p>
     *        Valid values for basic resource record sets: <code>A</code> | <code>AAAA</code> | <code>CAA</code> |
     *        <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> | <code>NS</code> | <code>PTR</code> |
     *        <code>SOA</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for weighted, latency, geolocation, and failover resource record sets: <code>A</code> |
     *        <code>AAAA</code> | <code>CAA</code> | <code>CNAME</code> | <code>MX</code> | <code>NAPTR</code> |
     *        <code>PTR</code> | <code>SPF</code> | <code>SRV</code> | <code>TXT</code>
     *        </p>
     *        <p>
     *        Values for alias resource record sets:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <b>API Gateway custom regional API or edge-optimized API</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>CloudFront distribution</b>: A or AAAA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Beanstalk environment that has a regionalized subdomain</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Elastic Load Balancing load balancer</b>: A | AAAA
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon S3 bucket</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Amazon VPC interface VPC endpoint</b>: A
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <b>Another resource record set in this hosted zone:</b> The type of the resource record set that the alias
     *        references.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Constraint: Specifying <code>type</code> without specifying <code>name</code> returns an
     *        <code>InvalidInput</code> error.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RRType
     */

    public ListResourceRecordSetsRequest withStartRecordType(RRType startRecordType) {
        this.startRecordType = startRecordType.toString();
        return this;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> If results were truncated for a given DNS name and type, specify the
     * value of <code>NextRecordIdentifier</code> from the previous response to get the next resource record set that
     * has the current DNS name and type.
     * </p>
     * 
     * @param startRecordIdentifier
     *        <i>Weighted resource record sets only:</i> If results were truncated for a given DNS name and type,
     *        specify the value of <code>NextRecordIdentifier</code> from the previous response to get the next resource
     *        record set that has the current DNS name and type.
     */

    public void setStartRecordIdentifier(String startRecordIdentifier) {
        this.startRecordIdentifier = startRecordIdentifier;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> If results were truncated for a given DNS name and type, specify the
     * value of <code>NextRecordIdentifier</code> from the previous response to get the next resource record set that
     * has the current DNS name and type.
     * </p>
     * 
     * @return <i>Weighted resource record sets only:</i> If results were truncated for a given DNS name and type,
     *         specify the value of <code>NextRecordIdentifier</code> from the previous response to get the next
     *         resource record set that has the current DNS name and type.
     */

    public String getStartRecordIdentifier() {
        return this.startRecordIdentifier;
    }

    /**
     * <p>
     * <i>Weighted resource record sets only:</i> If results were truncated for a given DNS name and type, specify the
     * value of <code>NextRecordIdentifier</code> from the previous response to get the next resource record set that
     * has the current DNS name and type.
     * </p>
     * 
     * @param startRecordIdentifier
     *        <i>Weighted resource record sets only:</i> If results were truncated for a given DNS name and type,
     *        specify the value of <code>NextRecordIdentifier</code> from the previous response to get the next resource
     *        record set that has the current DNS name and type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceRecordSetsRequest withStartRecordIdentifier(String startRecordIdentifier) {
        setStartRecordIdentifier(startRecordIdentifier);
        return this;
    }

    /**
     * <p>
     * (Optional) The maximum number of resource records sets to include in the response body for this request. If the
     * response includes more than <code>maxitems</code> resource record sets, the value of the <code>IsTruncated</code>
     * element in the response is <code>true</code>, and the values of the <code>NextRecordName</code> and
     * <code>NextRecordType</code> elements in the response identify the first resource record set in the next group of
     * <code>maxitems</code> resource record sets.
     * </p>
     * 
     * @param maxItems
     *        (Optional) The maximum number of resource records sets to include in the response body for this request.
     *        If the response includes more than <code>maxitems</code> resource record sets, the value of the
     *        <code>IsTruncated</code> element in the response is <code>true</code>, and the values of the
     *        <code>NextRecordName</code> and <code>NextRecordType</code> elements in the response identify the first
     *        resource record set in the next group of <code>maxitems</code> resource record sets.
     */

    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of resource records sets to include in the response body for this request. If the
     * response includes more than <code>maxitems</code> resource record sets, the value of the <code>IsTruncated</code>
     * element in the response is <code>true</code>, and the values of the <code>NextRecordName</code> and
     * <code>NextRecordType</code> elements in the response identify the first resource record set in the next group of
     * <code>maxitems</code> resource record sets.
     * </p>
     * 
     * @return (Optional) The maximum number of resource records sets to include in the response body for this request.
     *         If the response includes more than <code>maxitems</code> resource record sets, the value of the
     *         <code>IsTruncated</code> element in the response is <code>true</code>, and the values of the
     *         <code>NextRecordName</code> and <code>NextRecordType</code> elements in the response identify the first
     *         resource record set in the next group of <code>maxitems</code> resource record sets.
     */

    public String getMaxItems() {
        return this.maxItems;
    }

    /**
     * <p>
     * (Optional) The maximum number of resource records sets to include in the response body for this request. If the
     * response includes more than <code>maxitems</code> resource record sets, the value of the <code>IsTruncated</code>
     * element in the response is <code>true</code>, and the values of the <code>NextRecordName</code> and
     * <code>NextRecordType</code> elements in the response identify the first resource record set in the next group of
     * <code>maxitems</code> resource record sets.
     * </p>
     * 
     * @param maxItems
     *        (Optional) The maximum number of resource records sets to include in the response body for this request.
     *        If the response includes more than <code>maxitems</code> resource record sets, the value of the
     *        <code>IsTruncated</code> element in the response is <code>true</code>, and the values of the
     *        <code>NextRecordName</code> and <code>NextRecordType</code> elements in the response identify the first
     *        resource record set in the next group of <code>maxitems</code> resource record sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListResourceRecordSetsRequest withMaxItems(String maxItems) {
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
        if (getHostedZoneId() != null)
            sb.append("HostedZoneId: ").append(getHostedZoneId()).append(",");
        if (getStartRecordName() != null)
            sb.append("StartRecordName: ").append(getStartRecordName()).append(",");
        if (getStartRecordType() != null)
            sb.append("StartRecordType: ").append(getStartRecordType()).append(",");
        if (getStartRecordIdentifier() != null)
            sb.append("StartRecordIdentifier: ").append(getStartRecordIdentifier()).append(",");
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

        if (obj instanceof ListResourceRecordSetsRequest == false)
            return false;
        ListResourceRecordSetsRequest other = (ListResourceRecordSetsRequest) obj;
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null)
            return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false)
            return false;
        if (other.getStartRecordName() == null ^ this.getStartRecordName() == null)
            return false;
        if (other.getStartRecordName() != null && other.getStartRecordName().equals(this.getStartRecordName()) == false)
            return false;
        if (other.getStartRecordType() == null ^ this.getStartRecordType() == null)
            return false;
        if (other.getStartRecordType() != null && other.getStartRecordType().equals(this.getStartRecordType()) == false)
            return false;
        if (other.getStartRecordIdentifier() == null ^ this.getStartRecordIdentifier() == null)
            return false;
        if (other.getStartRecordIdentifier() != null && other.getStartRecordIdentifier().equals(this.getStartRecordIdentifier()) == false)
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

        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode());
        hashCode = prime * hashCode + ((getStartRecordName() == null) ? 0 : getStartRecordName().hashCode());
        hashCode = prime * hashCode + ((getStartRecordType() == null) ? 0 : getStartRecordType().hashCode());
        hashCode = prime * hashCode + ((getStartRecordIdentifier() == null) ? 0 : getStartRecordIdentifier().hashCode());
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode());
        return hashCode;
    }

    @Override
    public ListResourceRecordSetsRequest clone() {
        return (ListResourceRecordSetsRequest) super.clone();
    }

}
