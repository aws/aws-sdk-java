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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#listResourceRecordSets(ListResourceRecordSetsRequest) ListResourceRecordSets operation}.
 * <p>
 * Imagine all the resource record sets in a zone listed out in front of you. Imagine them sorted lexicographically first by DNS name (with the labels
 * reversed, like "com.amazon.www" for example), and secondarily, lexicographically by record type. This operation retrieves at most MaxItems resource
 * record sets from this list, in order, starting at a position specified by the Name and Type arguments:
 * </p>
 * 
 * <ul>
 * <li>If both Name and Type are omitted, this means start the results at the first RRSET in the HostedZone.</li>
 * <li>If Name is specified but Type is omitted, this means start the results at the first RRSET in the list whose name is greater than or equal to
 * Name. </li>
 * <li>If both Name and Type are specified, this means start the results at the first RRSET in the list whose name is greater than or equal to Name and
 * whose type is greater than or equal to Type.</li>
 * <li>It is an error to specify the Type but not the Name.</li>
 * 
 * </ul>
 * <p>
 * Use ListResourceRecordSets to retrieve a single known record set by specifying the record set's name and type, and setting MaxItems = 1
 * </p>
 * <p>
 * To retrieve all the records in a HostedZone, first pause any processes making calls to ChangeResourceRecordSets. Initially call ListResourceRecordSets
 * without a Name and Type to get the first page of record sets. For subsequent calls, set Name and Type to the NextName and NextType values returned by
 * the previous response.
 * </p>
 * <p>
 * In the presence of concurrent ChangeResourceRecordSets calls, there is no consistency of results across calls to ListResourceRecordSets. The only way
 * to get a consistent multi-page snapshot of all RRSETs in a zone is to stop making changes while pagination is in progress.
 * </p>
 * <p>
 * However, the results from ListResourceRecordSets are consistent within a page. If MakeChange calls are taking place concurrently, the result of each
 * one will either be completely visible in your results or not at all. You will not see partial changes, or changes that do not ultimately succeed.
 * (This follows from the fact that MakeChange is atomic)
 * </p>
 * <p>
 * The results from ListResourceRecordSets are strongly consistent with ChangeResourceRecordSets. To be precise, if a single process makes a call to
 * ChangeResourceRecordSets and receives a successful response, the effects of that change will be visible in a subsequent call to ListResourceRecordSets
 * by that process.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#listResourceRecordSets(ListResourceRecordSetsRequest)
 */
public class ListResourceRecordSetsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The ID of the hosted zone that contains the resource record sets that
     * you want to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String hostedZoneId;

    /**
     * The first name in the lexicographic ordering of domain names that you
     * want the <code>ListResourceRecordSets</code> request to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String startRecordName;

    /**
     * The DNS type at which to begin the listing of resource record sets.
     * <p>Valid values: <code>A</code> | <code>AAAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     * <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     * <code>SRV</code> | <code>TXT</code> <p>Values for Weighted Resource
     * Record Sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>TXT</code> <p> Values for Regional Resource Record Sets:
     * <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>TXT</code> <p>Values for Alias Resource Record Sets:
     * <code>A</code> | <code>AAAA</code> <p>Constraint: Specifying
     * <code>type</code> without specifying <code>name</code> returns an
     * <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     */
    private String startRecordType;

    /**
     * <i>Weighted resource record sets only:</i> If results were truncated
     * for a given DNS name and type, specify the value of
     * <code>ListResourceRecordSetsResponse$NextRecordIdentifier</code> from
     * the previous response to get the next resource record set that has the
     * current DNS name and type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String startRecordIdentifier;

    /**
     * The maximum number of records you want in the response body.
     */
    private String maxItems;

    /**
     * Default constructor for a new ListResourceRecordSetsRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ListResourceRecordSetsRequest() {}
    
    /**
     * Constructs a new ListResourceRecordSetsRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param hostedZoneId The ID of the hosted zone that contains the
     * resource record sets that you want to get.
     */
    public ListResourceRecordSetsRequest(String hostedZoneId) {
        setHostedZoneId(hostedZoneId);
    }

    /**
     * The ID of the hosted zone that contains the resource record sets that
     * you want to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return The ID of the hosted zone that contains the resource record sets that
     *         you want to get.
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }
    
    /**
     * The ID of the hosted zone that contains the resource record sets that
     * you want to get.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId The ID of the hosted zone that contains the resource record sets that
     *         you want to get.
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }
    
    /**
     * The ID of the hosted zone that contains the resource record sets that
     * you want to get.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId The ID of the hosted zone that contains the resource record sets that
     *         you want to get.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListResourceRecordSetsRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * The first name in the lexicographic ordering of domain names that you
     * want the <code>ListResourceRecordSets</code> request to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The first name in the lexicographic ordering of domain names that you
     *         want the <code>ListResourceRecordSets</code> request to list.
     */
    public String getStartRecordName() {
        return startRecordName;
    }
    
    /**
     * The first name in the lexicographic ordering of domain names that you
     * want the <code>ListResourceRecordSets</code> request to list.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param startRecordName The first name in the lexicographic ordering of domain names that you
     *         want the <code>ListResourceRecordSets</code> request to list.
     */
    public void setStartRecordName(String startRecordName) {
        this.startRecordName = startRecordName;
    }
    
    /**
     * The first name in the lexicographic ordering of domain names that you
     * want the <code>ListResourceRecordSets</code> request to list.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param startRecordName The first name in the lexicographic ordering of domain names that you
     *         want the <code>ListResourceRecordSets</code> request to list.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListResourceRecordSetsRequest withStartRecordName(String startRecordName) {
        this.startRecordName = startRecordName;
        return this;
    }

    /**
     * The DNS type at which to begin the listing of resource record sets.
     * <p>Valid values: <code>A</code> | <code>AAAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     * <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     * <code>SRV</code> | <code>TXT</code> <p>Values for Weighted Resource
     * Record Sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>TXT</code> <p> Values for Regional Resource Record Sets:
     * <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>TXT</code> <p>Values for Alias Resource Record Sets:
     * <code>A</code> | <code>AAAA</code> <p>Constraint: Specifying
     * <code>type</code> without specifying <code>name</code> returns an
     * <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @return The DNS type at which to begin the listing of resource record sets.
     *         <p>Valid values: <code>A</code> | <code>AAAA</code> |
     *         <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     *         <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *         <code>SRV</code> | <code>TXT</code> <p>Values for Weighted Resource
     *         Record Sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     *         <code>TXT</code> <p> Values for Regional Resource Record Sets:
     *         <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     *         <code>TXT</code> <p>Values for Alias Resource Record Sets:
     *         <code>A</code> | <code>AAAA</code> <p>Constraint: Specifying
     *         <code>type</code> without specifying <code>name</code> returns an
     *         <a>InvalidInput</a> error.
     *
     * @see RRType
     */
    public String getStartRecordType() {
        return startRecordType;
    }
    
    /**
     * The DNS type at which to begin the listing of resource record sets.
     * <p>Valid values: <code>A</code> | <code>AAAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     * <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     * <code>SRV</code> | <code>TXT</code> <p>Values for Weighted Resource
     * Record Sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>TXT</code> <p> Values for Regional Resource Record Sets:
     * <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>TXT</code> <p>Values for Alias Resource Record Sets:
     * <code>A</code> | <code>AAAA</code> <p>Constraint: Specifying
     * <code>type</code> without specifying <code>name</code> returns an
     * <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param startRecordType The DNS type at which to begin the listing of resource record sets.
     *         <p>Valid values: <code>A</code> | <code>AAAA</code> |
     *         <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     *         <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *         <code>SRV</code> | <code>TXT</code> <p>Values for Weighted Resource
     *         Record Sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     *         <code>TXT</code> <p> Values for Regional Resource Record Sets:
     *         <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     *         <code>TXT</code> <p>Values for Alias Resource Record Sets:
     *         <code>A</code> | <code>AAAA</code> <p>Constraint: Specifying
     *         <code>type</code> without specifying <code>name</code> returns an
     *         <a>InvalidInput</a> error.
     *
     * @see RRType
     */
    public void setStartRecordType(String startRecordType) {
        this.startRecordType = startRecordType;
    }
    
    /**
     * The DNS type at which to begin the listing of resource record sets.
     * <p>Valid values: <code>A</code> | <code>AAAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     * <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     * <code>SRV</code> | <code>TXT</code> <p>Values for Weighted Resource
     * Record Sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>TXT</code> <p> Values for Regional Resource Record Sets:
     * <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>TXT</code> <p>Values for Alias Resource Record Sets:
     * <code>A</code> | <code>AAAA</code> <p>Constraint: Specifying
     * <code>type</code> without specifying <code>name</code> returns an
     * <a>InvalidInput</a> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param startRecordType The DNS type at which to begin the listing of resource record sets.
     *         <p>Valid values: <code>A</code> | <code>AAAA</code> |
     *         <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     *         <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *         <code>SRV</code> | <code>TXT</code> <p>Values for Weighted Resource
     *         Record Sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     *         <code>TXT</code> <p> Values for Regional Resource Record Sets:
     *         <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     *         <code>TXT</code> <p>Values for Alias Resource Record Sets:
     *         <code>A</code> | <code>AAAA</code> <p>Constraint: Specifying
     *         <code>type</code> without specifying <code>name</code> returns an
     *         <a>InvalidInput</a> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RRType
     */
    public ListResourceRecordSetsRequest withStartRecordType(String startRecordType) {
        this.startRecordType = startRecordType;
        return this;
    }

    /**
     * The DNS type at which to begin the listing of resource record sets.
     * <p>Valid values: <code>A</code> | <code>AAAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     * <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     * <code>SRV</code> | <code>TXT</code> <p>Values for Weighted Resource
     * Record Sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>TXT</code> <p> Values for Regional Resource Record Sets:
     * <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>TXT</code> <p>Values for Alias Resource Record Sets:
     * <code>A</code> | <code>AAAA</code> <p>Constraint: Specifying
     * <code>type</code> without specifying <code>name</code> returns an
     * <a>InvalidInput</a> error.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param startRecordType The DNS type at which to begin the listing of resource record sets.
     *         <p>Valid values: <code>A</code> | <code>AAAA</code> |
     *         <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     *         <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *         <code>SRV</code> | <code>TXT</code> <p>Values for Weighted Resource
     *         Record Sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     *         <code>TXT</code> <p> Values for Regional Resource Record Sets:
     *         <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     *         <code>TXT</code> <p>Values for Alias Resource Record Sets:
     *         <code>A</code> | <code>AAAA</code> <p>Constraint: Specifying
     *         <code>type</code> without specifying <code>name</code> returns an
     *         <a>InvalidInput</a> error.
     *
     * @see RRType
     */
    public void setStartRecordType(RRType startRecordType) {
        this.startRecordType = startRecordType.toString();
    }
    
    /**
     * The DNS type at which to begin the listing of resource record sets.
     * <p>Valid values: <code>A</code> | <code>AAAA</code> |
     * <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     * <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     * <code>SRV</code> | <code>TXT</code> <p>Values for Weighted Resource
     * Record Sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>TXT</code> <p> Values for Regional Resource Record Sets:
     * <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     * <code>TXT</code> <p>Values for Alias Resource Record Sets:
     * <code>A</code> | <code>AAAA</code> <p>Constraint: Specifying
     * <code>type</code> without specifying <code>name</code> returns an
     * <a>InvalidInput</a> error.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param startRecordType The DNS type at which to begin the listing of resource record sets.
     *         <p>Valid values: <code>A</code> | <code>AAAA</code> |
     *         <code>CNAME</code> | <code>MX</code> | <code>NS</code> |
     *         <code>PTR</code> | <code>SOA</code> | <code>SPF</code> |
     *         <code>SRV</code> | <code>TXT</code> <p>Values for Weighted Resource
     *         Record Sets: <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     *         <code>TXT</code> <p> Values for Regional Resource Record Sets:
     *         <code>A</code> | <code>AAAA</code> | <code>CNAME</code> |
     *         <code>TXT</code> <p>Values for Alias Resource Record Sets:
     *         <code>A</code> | <code>AAAA</code> <p>Constraint: Specifying
     *         <code>type</code> without specifying <code>name</code> returns an
     *         <a>InvalidInput</a> error.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see RRType
     */
    public ListResourceRecordSetsRequest withStartRecordType(RRType startRecordType) {
        this.startRecordType = startRecordType.toString();
        return this;
    }

    /**
     * <i>Weighted resource record sets only:</i> If results were truncated
     * for a given DNS name and type, specify the value of
     * <code>ListResourceRecordSetsResponse$NextRecordIdentifier</code> from
     * the previous response to get the next resource record set that has the
     * current DNS name and type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <i>Weighted resource record sets only:</i> If results were truncated
     *         for a given DNS name and type, specify the value of
     *         <code>ListResourceRecordSetsResponse$NextRecordIdentifier</code> from
     *         the previous response to get the next resource record set that has the
     *         current DNS name and type.
     */
    public String getStartRecordIdentifier() {
        return startRecordIdentifier;
    }
    
    /**
     * <i>Weighted resource record sets only:</i> If results were truncated
     * for a given DNS name and type, specify the value of
     * <code>ListResourceRecordSetsResponse$NextRecordIdentifier</code> from
     * the previous response to get the next resource record set that has the
     * current DNS name and type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param startRecordIdentifier <i>Weighted resource record sets only:</i> If results were truncated
     *         for a given DNS name and type, specify the value of
     *         <code>ListResourceRecordSetsResponse$NextRecordIdentifier</code> from
     *         the previous response to get the next resource record set that has the
     *         current DNS name and type.
     */
    public void setStartRecordIdentifier(String startRecordIdentifier) {
        this.startRecordIdentifier = startRecordIdentifier;
    }
    
    /**
     * <i>Weighted resource record sets only:</i> If results were truncated
     * for a given DNS name and type, specify the value of
     * <code>ListResourceRecordSetsResponse$NextRecordIdentifier</code> from
     * the previous response to get the next resource record set that has the
     * current DNS name and type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param startRecordIdentifier <i>Weighted resource record sets only:</i> If results were truncated
     *         for a given DNS name and type, specify the value of
     *         <code>ListResourceRecordSetsResponse$NextRecordIdentifier</code> from
     *         the previous response to get the next resource record set that has the
     *         current DNS name and type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListResourceRecordSetsRequest withStartRecordIdentifier(String startRecordIdentifier) {
        this.startRecordIdentifier = startRecordIdentifier;
        return this;
    }

    /**
     * The maximum number of records you want in the response body.
     *
     * @return The maximum number of records you want in the response body.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The maximum number of records you want in the response body.
     *
     * @param maxItems The maximum number of records you want in the response body.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The maximum number of records you want in the response body.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The maximum number of records you want in the response body.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ListResourceRecordSetsRequest withMaxItems(String maxItems) {
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
        if (getStartRecordName() != null) sb.append("StartRecordName: " + getStartRecordName() + ",");
        if (getStartRecordType() != null) sb.append("StartRecordType: " + getStartRecordType() + ",");
        if (getStartRecordIdentifier() != null) sb.append("StartRecordIdentifier: " + getStartRecordIdentifier() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListResourceRecordSetsRequest == false) return false;
        ListResourceRecordSetsRequest other = (ListResourceRecordSetsRequest)obj;
        
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null) return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false) return false; 
        if (other.getStartRecordName() == null ^ this.getStartRecordName() == null) return false;
        if (other.getStartRecordName() != null && other.getStartRecordName().equals(this.getStartRecordName()) == false) return false; 
        if (other.getStartRecordType() == null ^ this.getStartRecordType() == null) return false;
        if (other.getStartRecordType() != null && other.getStartRecordType().equals(this.getStartRecordType()) == false) return false; 
        if (other.getStartRecordIdentifier() == null ^ this.getStartRecordIdentifier() == null) return false;
        if (other.getStartRecordIdentifier() != null && other.getStartRecordIdentifier().equals(this.getStartRecordIdentifier()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
}
    