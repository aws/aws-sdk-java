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
 * Container for the parameters to the {@link com.amazonaws.services.route53.AmazonRoute53#listChangeBatchesByRRSet(ListChangeBatchesByRRSetRequest) ListChangeBatchesByRRSet operation}.
 * <p>
 * This action gets the list of ChangeBatches in a given time period for
 * a given hosted zone and RRSet.
 * </p>
 *
 * @see com.amazonaws.services.route53.AmazonRoute53#listChangeBatchesByRRSet(ListChangeBatchesByRRSetRequest)
 */
public class ListChangeBatchesByRRSetRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The ID of the hosted zone that you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     */
    private String hostedZoneId;

    /**
     * The name of the RRSet that you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String name;

    /**
     * The type of the RRSet that you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     */
    private String type;

    /**
     * The identifier of the RRSet that you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     */
    private String setIdentifier;

    /**
     * The start of the time period you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String startDate;

    /**
     * The end of the time period you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     */
    private String endDate;

    /**
     * The maximum number of items on a page.
     */
    private String maxItems;

    /**
     * The page marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     */
    private String marker;

    /**
     * The ID of the hosted zone that you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @return The ID of the hosted zone that you want to see changes for.
     */
    public String getHostedZoneId() {
        return hostedZoneId;
    }
    
    /**
     * The ID of the hosted zone that you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId The ID of the hosted zone that you want to see changes for.
     */
    public void setHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
    }
    
    /**
     * The ID of the hosted zone that you want to see changes for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32<br/>
     *
     * @param hostedZoneId The ID of the hosted zone that you want to see changes for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListChangeBatchesByRRSetRequest withHostedZoneId(String hostedZoneId) {
        this.hostedZoneId = hostedZoneId;
        return this;
    }

    /**
     * The name of the RRSet that you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return The name of the RRSet that you want to see changes for.
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the RRSet that you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param name The name of the RRSet that you want to see changes for.
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the RRSet that you want to see changes for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param name The name of the RRSet that you want to see changes for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListChangeBatchesByRRSetRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The type of the RRSet that you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @return The type of the RRSet that you want to see changes for.
     *
     * @see RRType
     */
    public String getType() {
        return type;
    }
    
    /**
     * The type of the RRSet that you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The type of the RRSet that you want to see changes for.
     *
     * @see RRType
     */
    public void setType(String type) {
        this.type = type;
    }
    
    /**
     * The type of the RRSet that you want to see changes for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The type of the RRSet that you want to see changes for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RRType
     */
    public ListChangeBatchesByRRSetRequest withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * The type of the RRSet that you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The type of the RRSet that you want to see changes for.
     *
     * @see RRType
     */
    public void setType(RRType type) {
        this.type = type.toString();
    }
    
    /**
     * The type of the RRSet that you want to see changes for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>SOA, A, TXT, NS, CNAME, MX, PTR, SRV, SPF, AAAA
     *
     * @param type The type of the RRSet that you want to see changes for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see RRType
     */
    public ListChangeBatchesByRRSetRequest withType(RRType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * The identifier of the RRSet that you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @return The identifier of the RRSet that you want to see changes for.
     */
    public String getSetIdentifier() {
        return setIdentifier;
    }
    
    /**
     * The identifier of the RRSet that you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param setIdentifier The identifier of the RRSet that you want to see changes for.
     */
    public void setSetIdentifier(String setIdentifier) {
        this.setIdentifier = setIdentifier;
    }
    
    /**
     * The identifier of the RRSet that you want to see changes for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 128<br/>
     *
     * @param setIdentifier The identifier of the RRSet that you want to see changes for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListChangeBatchesByRRSetRequest withSetIdentifier(String setIdentifier) {
        this.setIdentifier = setIdentifier;
        return this;
    }

    /**
     * The start of the time period you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The start of the time period you want to see changes for.
     */
    public String getStartDate() {
        return startDate;
    }
    
    /**
     * The start of the time period you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param startDate The start of the time period you want to see changes for.
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }
    
    /**
     * The start of the time period you want to see changes for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param startDate The start of the time period you want to see changes for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListChangeBatchesByRRSetRequest withStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }

    /**
     * The end of the time period you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @return The end of the time period you want to see changes for.
     */
    public String getEndDate() {
        return endDate;
    }
    
    /**
     * The end of the time period you want to see changes for.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param endDate The end of the time period you want to see changes for.
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    
    /**
     * The end of the time period you want to see changes for.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 256<br/>
     *
     * @param endDate The end of the time period you want to see changes for.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListChangeBatchesByRRSetRequest withEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }

    /**
     * The maximum number of items on a page.
     *
     * @return The maximum number of items on a page.
     */
    public String getMaxItems() {
        return maxItems;
    }
    
    /**
     * The maximum number of items on a page.
     *
     * @param maxItems The maximum number of items on a page.
     */
    public void setMaxItems(String maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * The maximum number of items on a page.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxItems The maximum number of items on a page.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListChangeBatchesByRRSetRequest withMaxItems(String maxItems) {
        this.maxItems = maxItems;
        return this;
    }

    /**
     * The page marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @return The page marker.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * The page marker.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param marker The page marker.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * The page marker.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 64<br/>
     *
     * @param marker The page marker.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListChangeBatchesByRRSetRequest withMarker(String marker) {
        this.marker = marker;
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getType() != null) sb.append("Type: " + getType() + ",");
        if (getSetIdentifier() != null) sb.append("SetIdentifier: " + getSetIdentifier() + ",");
        if (getStartDate() != null) sb.append("StartDate: " + getStartDate() + ",");
        if (getEndDate() != null) sb.append("EndDate: " + getEndDate() + ",");
        if (getMaxItems() != null) sb.append("MaxItems: " + getMaxItems() + ",");
        if (getMarker() != null) sb.append("Marker: " + getMarker() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getHostedZoneId() == null) ? 0 : getHostedZoneId().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode()); 
        hashCode = prime * hashCode + ((getSetIdentifier() == null) ? 0 : getSetIdentifier().hashCode()); 
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode()); 
        hashCode = prime * hashCode + ((getEndDate() == null) ? 0 : getEndDate().hashCode()); 
        hashCode = prime * hashCode + ((getMaxItems() == null) ? 0 : getMaxItems().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListChangeBatchesByRRSetRequest == false) return false;
        ListChangeBatchesByRRSetRequest other = (ListChangeBatchesByRRSetRequest)obj;
        
        if (other.getHostedZoneId() == null ^ this.getHostedZoneId() == null) return false;
        if (other.getHostedZoneId() != null && other.getHostedZoneId().equals(this.getHostedZoneId()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getType() == null ^ this.getType() == null) return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false) return false; 
        if (other.getSetIdentifier() == null ^ this.getSetIdentifier() == null) return false;
        if (other.getSetIdentifier() != null && other.getSetIdentifier().equals(this.getSetIdentifier()) == false) return false; 
        if (other.getStartDate() == null ^ this.getStartDate() == null) return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false) return false; 
        if (other.getEndDate() == null ^ this.getEndDate() == null) return false;
        if (other.getEndDate() != null && other.getEndDate().equals(this.getEndDate()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
    @Override
    public ListChangeBatchesByRRSetRequest clone() {
        
            return (ListChangeBatchesByRRSetRequest) super.clone();
    }

}
    