/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.route53domains.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.route53domains.AmazonRoute53Domains#listDomains(ListDomainsRequest) ListDomains operation}.
 * <p>
 * This operation returns all the domain names registered with Amazon
 * Route 53 for the current AWS account.
 * </p>
 *
 * @see com.amazonaws.services.route53domains.AmazonRoute53Domains#listDomains(ListDomainsRequest)
 */
public class ListDomainsRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * For an initial request for a list of domains, omit this element. If
     * the number of domains that are associated with the current AWS account
     * is greater than the value that you specified for
     * <code>MaxItems</code>, you can use <code>Marker</code> to return
     * additional domains. Get the value of <code>NextPageMarker</code> from
     * the previous response, and submit another request that includes the
     * value of <code>NextPageMarker</code> in the <code>Marker</code>
     * element. <p>Type: String <p>Default: None <p>Constraints: The marker
     * must match the value specified in the previous request. <p>Required:
     * No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     */
    private String marker;

    /**
     * Number of domains to be returned. <p>Type: Integer <p>Default: 20
     * <p>Constraints: A numeral between 1 and 100. <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     */
    private Integer maxItems;

    /**
     * For an initial request for a list of domains, omit this element. If
     * the number of domains that are associated with the current AWS account
     * is greater than the value that you specified for
     * <code>MaxItems</code>, you can use <code>Marker</code> to return
     * additional domains. Get the value of <code>NextPageMarker</code> from
     * the previous response, and submit another request that includes the
     * value of <code>NextPageMarker</code> in the <code>Marker</code>
     * element. <p>Type: String <p>Default: None <p>Constraints: The marker
     * must match the value specified in the previous request. <p>Required:
     * No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @return For an initial request for a list of domains, omit this element. If
     *         the number of domains that are associated with the current AWS account
     *         is greater than the value that you specified for
     *         <code>MaxItems</code>, you can use <code>Marker</code> to return
     *         additional domains. Get the value of <code>NextPageMarker</code> from
     *         the previous response, and submit another request that includes the
     *         value of <code>NextPageMarker</code> in the <code>Marker</code>
     *         element. <p>Type: String <p>Default: None <p>Constraints: The marker
     *         must match the value specified in the previous request. <p>Required:
     *         No
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * For an initial request for a list of domains, omit this element. If
     * the number of domains that are associated with the current AWS account
     * is greater than the value that you specified for
     * <code>MaxItems</code>, you can use <code>Marker</code> to return
     * additional domains. Get the value of <code>NextPageMarker</code> from
     * the previous response, and submit another request that includes the
     * value of <code>NextPageMarker</code> in the <code>Marker</code>
     * element. <p>Type: String <p>Default: None <p>Constraints: The marker
     * must match the value specified in the previous request. <p>Required:
     * No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param marker For an initial request for a list of domains, omit this element. If
     *         the number of domains that are associated with the current AWS account
     *         is greater than the value that you specified for
     *         <code>MaxItems</code>, you can use <code>Marker</code> to return
     *         additional domains. Get the value of <code>NextPageMarker</code> from
     *         the previous response, and submit another request that includes the
     *         value of <code>NextPageMarker</code> in the <code>Marker</code>
     *         element. <p>Type: String <p>Default: None <p>Constraints: The marker
     *         must match the value specified in the previous request. <p>Required:
     *         No
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * For an initial request for a list of domains, omit this element. If
     * the number of domains that are associated with the current AWS account
     * is greater than the value that you specified for
     * <code>MaxItems</code>, you can use <code>Marker</code> to return
     * additional domains. Get the value of <code>NextPageMarker</code> from
     * the previous response, and submit another request that includes the
     * value of <code>NextPageMarker</code> in the <code>Marker</code>
     * element. <p>Type: String <p>Default: None <p>Constraints: The marker
     * must match the value specified in the previous request. <p>Required:
     * No
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 4096<br/>
     *
     * @param marker For an initial request for a list of domains, omit this element. If
     *         the number of domains that are associated with the current AWS account
     *         is greater than the value that you specified for
     *         <code>MaxItems</code>, you can use <code>Marker</code> to return
     *         additional domains. Get the value of <code>NextPageMarker</code> from
     *         the previous response, and submit another request that includes the
     *         value of <code>NextPageMarker</code> in the <code>Marker</code>
     *         element. <p>Type: String <p>Default: None <p>Constraints: The marker
     *         must match the value specified in the previous request. <p>Required:
     *         No
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDomainsRequest withMarker(String marker) {
        this.marker = marker;
        return this;
    }

    /**
     * Number of domains to be returned. <p>Type: Integer <p>Default: 20
     * <p>Constraints: A numeral between 1 and 100. <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @return Number of domains to be returned. <p>Type: Integer <p>Default: 20
     *         <p>Constraints: A numeral between 1 and 100. <p>Required: No
     */
    public Integer getMaxItems() {
        return maxItems;
    }
    
    /**
     * Number of domains to be returned. <p>Type: Integer <p>Default: 20
     * <p>Constraints: A numeral between 1 and 100. <p>Required: No
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param maxItems Number of domains to be returned. <p>Type: Integer <p>Default: 20
     *         <p>Constraints: A numeral between 1 and 100. <p>Required: No
     */
    public void setMaxItems(Integer maxItems) {
        this.maxItems = maxItems;
    }
    
    /**
     * Number of domains to be returned. <p>Type: Integer <p>Default: 20
     * <p>Constraints: A numeral between 1 and 100. <p>Required: No
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Range: </b>0 - 100<br/>
     *
     * @param maxItems Number of domains to be returned. <p>Type: Integer <p>Default: 20
     *         <p>Constraints: A numeral between 1 and 100. <p>Required: No
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public ListDomainsRequest withMaxItems(Integer maxItems) {
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

        if (obj instanceof ListDomainsRequest == false) return false;
        ListDomainsRequest other = (ListDomainsRequest)obj;
        
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        if (other.getMaxItems() == null ^ this.getMaxItems() == null) return false;
        if (other.getMaxItems() != null && other.getMaxItems().equals(this.getMaxItems()) == false) return false; 
        return true;
    }
    
}
    