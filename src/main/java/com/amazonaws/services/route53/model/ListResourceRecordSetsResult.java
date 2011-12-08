/*
 * Copyright 2010-2011 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * A complex type that contains information about the resource record
 * sets that are returned by the request and information about the
 * response.
 * </p>
 */
public class ListResourceRecordSetsResult {

    /**
     * A complex type that contains information about the resource record
     * sets that are returned by the request.
     */
    private java.util.List<ResourceRecordSet> resourceRecordSets;

    /**
     * A flag that indicates whether there are more resource record sets to
     * be listed. If your results were truncated, you can make a follow-up
     * request for the next page of results by using the
     * <a>ListResourceRecordSetsResponse$NextRecordName</a> element. <p>Valid
     * Values: <code>true</code> | <code>false</code>
     */
    private Boolean isTruncated;

    /**
     * If the results were truncated, the name of the next record in the
     * list. This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String nextRecordName;

    /**
     * If the results were truncated, the type of the next record in the
     * list. This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     */
    private String nextRecordType;

    /**
     * <i>Weighted resource record sets only:</i> If results were truncated
     * for a given DNS name and type, the value of <code>SetIdentifier</code>
     * for the next resource record set that has the current DNS name and
     * type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String nextRecordIdentifier;

    /**
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     */
    private String maxItems;

    /**
     * A complex type that contains information about the resource record
     * sets that are returned by the request.
     *
     * @return A complex type that contains information about the resource record
     *         sets that are returned by the request.
     */
    public java.util.List<ResourceRecordSet> getResourceRecordSets() {
        
        if (resourceRecordSets == null) {
            resourceRecordSets = new java.util.ArrayList<ResourceRecordSet>();
        }
        return resourceRecordSets;
    }
    
    /**
     * A complex type that contains information about the resource record
     * sets that are returned by the request.
     *
     * @param resourceRecordSets A complex type that contains information about the resource record
     *         sets that are returned by the request.
     */
    public void setResourceRecordSets(java.util.Collection<ResourceRecordSet> resourceRecordSets) {
        java.util.List<ResourceRecordSet> resourceRecordSetsCopy = new java.util.ArrayList<ResourceRecordSet>();
        if (resourceRecordSets != null) {
            resourceRecordSetsCopy.addAll(resourceRecordSets);
        }
        this.resourceRecordSets = resourceRecordSetsCopy;
    }
    
    /**
     * A complex type that contains information about the resource record
     * sets that are returned by the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceRecordSets A complex type that contains information about the resource record
     *         sets that are returned by the request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListResourceRecordSetsResult withResourceRecordSets(ResourceRecordSet... resourceRecordSets) {
        if (getResourceRecordSets() == null) setResourceRecordSets(new java.util.ArrayList<ResourceRecordSet>());
        for (ResourceRecordSet value : resourceRecordSets) {
            getResourceRecordSets().add(value);
        }
        return this;
    }
    
    /**
     * A complex type that contains information about the resource record
     * sets that are returned by the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceRecordSets A complex type that contains information about the resource record
     *         sets that are returned by the request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListResourceRecordSetsResult withResourceRecordSets(java.util.Collection<ResourceRecordSet> resourceRecordSets) {
        java.util.List<ResourceRecordSet> resourceRecordSetsCopy = new java.util.ArrayList<ResourceRecordSet>();
        if (resourceRecordSets != null) {
            resourceRecordSetsCopy.addAll(resourceRecordSets);
        }
        this.resourceRecordSets = resourceRecordSetsCopy;

        return this;
    }
    
    /**
     * A flag that indicates whether there are more resource record sets to
     * be listed. If your results were truncated, you can make a follow-up
     * request for the next page of results by using the
     * <a>ListResourceRecordSetsResponse$NextRecordName</a> element. <p>Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @return A flag that indicates whether there are more resource record sets to
     *         be listed. If your results were truncated, you can make a follow-up
     *         request for the next page of results by using the
     *         <a>ListResourceRecordSetsResponse$NextRecordName</a> element. <p>Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public Boolean isTruncated() {
        return isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more resource record sets to
     * be listed. If your results were truncated, you can make a follow-up
     * request for the next page of results by using the
     * <a>ListResourceRecordSetsResponse$NextRecordName</a> element. <p>Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @param isTruncated A flag that indicates whether there are more resource record sets to
     *         be listed. If your results were truncated, you can make a follow-up
     *         request for the next page of results by using the
     *         <a>ListResourceRecordSetsResponse$NextRecordName</a> element. <p>Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public void setIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
    }
    
    /**
     * A flag that indicates whether there are more resource record sets to
     * be listed. If your results were truncated, you can make a follow-up
     * request for the next page of results by using the
     * <a>ListResourceRecordSetsResponse$NextRecordName</a> element. <p>Valid
     * Values: <code>true</code> | <code>false</code>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param isTruncated A flag that indicates whether there are more resource record sets to
     *         be listed. If your results were truncated, you can make a follow-up
     *         request for the next page of results by using the
     *         <a>ListResourceRecordSetsResponse$NextRecordName</a> element. <p>Valid
     *         Values: <code>true</code> | <code>false</code>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListResourceRecordSetsResult withIsTruncated(Boolean isTruncated) {
        this.isTruncated = isTruncated;
        return this;
    }
    
    
    /**
     * A flag that indicates whether there are more resource record sets to
     * be listed. If your results were truncated, you can make a follow-up
     * request for the next page of results by using the
     * <a>ListResourceRecordSetsResponse$NextRecordName</a> element. <p>Valid
     * Values: <code>true</code> | <code>false</code>
     *
     * @return A flag that indicates whether there are more resource record sets to
     *         be listed. If your results were truncated, you can make a follow-up
     *         request for the next page of results by using the
     *         <a>ListResourceRecordSetsResponse$NextRecordName</a> element. <p>Valid
     *         Values: <code>true</code> | <code>false</code>
     */
    public Boolean getIsTruncated() {
        return isTruncated;
    }
    
    /**
     * If the results were truncated, the name of the next record in the
     * list. This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return If the results were truncated, the name of the next record in the
     *         list. This element is present only if
     *         <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     */
    public String getNextRecordName() {
        return nextRecordName;
    }
    
    /**
     * If the results were truncated, the name of the next record in the
     * list. This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param nextRecordName If the results were truncated, the name of the next record in the
     *         list. This element is present only if
     *         <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     */
    public void setNextRecordName(String nextRecordName) {
        this.nextRecordName = nextRecordName;
    }
    
    /**
     * If the results were truncated, the name of the next record in the
     * list. This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param nextRecordName If the results were truncated, the name of the next record in the
     *         list. This element is present only if
     *         <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListResourceRecordSetsResult withNextRecordName(String nextRecordName) {
        this.nextRecordName = nextRecordName;
        return this;
    }
    
    
    /**
     * If the results were truncated, the type of the next record in the
     * list. This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @return If the results were truncated, the type of the next record in the
     *         list. This element is present only if
     *         <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     *
     * @see RRType
     */
    public String getNextRecordType() {
        return nextRecordType;
    }
    
    /**
     * If the results were truncated, the type of the next record in the
     * list. This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param nextRecordType If the results were truncated, the type of the next record in the
     *         list. This element is present only if
     *         <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     *
     * @see RRType
     */
    public void setNextRecordType(String nextRecordType) {
        this.nextRecordType = nextRecordType;
    }
    
    /**
     * If the results were truncated, the type of the next record in the
     * list. This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param nextRecordType If the results were truncated, the type of the next record in the
     *         list. This element is present only if
     *         <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see RRType
     */
    public ListResourceRecordSetsResult withNextRecordType(String nextRecordType) {
        this.nextRecordType = nextRecordType;
        return this;
    }
    
    
    /**
     * If the results were truncated, the type of the next record in the
     * list. This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param nextRecordType If the results were truncated, the type of the next record in the
     *         list. This element is present only if
     *         <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     *
     * @see RRType
     */
    public void setNextRecordType(RRType nextRecordType) {
        this.nextRecordType = nextRecordType.toString();
    }
    
    /**
     * If the results were truncated, the type of the next record in the
     * list. This element is present only if
     * <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param nextRecordType If the results were truncated, the type of the next record in the
     *         list. This element is present only if
     *         <a>ListResourceRecordSetsResponse$IsTruncated</a> is true.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     *
     * @see RRType
     */
    public ListResourceRecordSetsResult withNextRecordType(RRType nextRecordType) {
        this.nextRecordType = nextRecordType.toString();
        return this;
    }
    
    /**
     * <i>Weighted resource record sets only:</i> If results were truncated
     * for a given DNS name and type, the value of <code>SetIdentifier</code>
     * for the next resource record set that has the current DNS name and
     * type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return <i>Weighted resource record sets only:</i> If results were truncated
     *         for a given DNS name and type, the value of <code>SetIdentifier</code>
     *         for the next resource record set that has the current DNS name and
     *         type.
     */
    public String getNextRecordIdentifier() {
        return nextRecordIdentifier;
    }
    
    /**
     * <i>Weighted resource record sets only:</i> If results were truncated
     * for a given DNS name and type, the value of <code>SetIdentifier</code>
     * for the next resource record set that has the current DNS name and
     * type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param nextRecordIdentifier <i>Weighted resource record sets only:</i> If results were truncated
     *         for a given DNS name and type, the value of <code>SetIdentifier</code>
     *         for the next resource record set that has the current DNS name and
     *         type.
     */
    public void setNextRecordIdentifier(String nextRecordIdentifier) {
        this.nextRecordIdentifier = nextRecordIdentifier;
    }
    
    /**
     * <i>Weighted resource record sets only:</i> If results were truncated
     * for a given DNS name and type, the value of <code>SetIdentifier</code>
     * for the next resource record set that has the current DNS name and
     * type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param nextRecordIdentifier <i>Weighted resource record sets only:</i> If results were truncated
     *         for a given DNS name and type, the value of <code>SetIdentifier</code>
     *         for the next resource record set that has the current DNS name and
     *         type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListResourceRecordSetsResult withNextRecordIdentifier(String nextRecordIdentifier) {
        this.nextRecordIdentifier = nextRecordIdentifier;
        return this;
    }
    
    
    /**
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     *
     * @return The maximum number of records you requested. The maximum value of
     *         <code>MaxItems</code> is 100.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     *
     * @param maxItems The maximum number of records you requested. The maximum value of
     *         <code>MaxItems</code> is 100.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The maximum number of records you requested. The maximum value of
     * <code>MaxItems</code> is 100.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The maximum number of records you requested. The maximum value of
     *         <code>MaxItems</code> is 100.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public ListResourceRecordSetsResult withMaxItems(String maxItems) {
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
        sb.append("ResourceRecordSets: " + resourceRecordSets + ", ");
        sb.append("IsTruncated: " + isTruncated + ", ");
        sb.append("NextRecordName: " + nextRecordName + ", ");
        sb.append("NextRecordType: " + nextRecordType + ", ");
        sb.append("NextRecordIdentifier: " + nextRecordIdentifier + ", ");
        sb.append("MaxItems: " + maxItems + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    