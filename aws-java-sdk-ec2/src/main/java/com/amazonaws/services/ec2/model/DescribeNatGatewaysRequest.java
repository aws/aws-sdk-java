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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeNatGateways(DescribeNatGatewaysRequest) DescribeNatGateways operation}.
 * <p>
 * Describes one or more of the your NAT gateways.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeNatGateways(DescribeNatGatewaysRequest)
 */
public class DescribeNatGatewaysRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * One or more NAT gateway IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> natGatewayIds;

    /**
     * One or more filters. <ul> <li> <p><code>nat-gateway-id</code> - The ID
     * of the NAT gateway. </li> <li> <p><code>state</code> - The state of
     * the NAT gateway (<code>pending</code> | <code>failed</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li> <p><code>subnet-id</code> - The ID
     * of the subnet in which the NAT gateway resides. </li> <li>
     * <p><code>vpc-id</code> - The ID of the VPC in which the NAT gateway
     * resides. </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filter;

    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value specified is greater
     * than 1000, we return only 1000 items.
     */
    private Integer maxResults;

    /**
     * The token to retrieve the next page of results.
     */
    private String nextToken;

    /**
     * One or more NAT gateway IDs.
     *
     * @return One or more NAT gateway IDs.
     */
    public java.util.List<String> getNatGatewayIds() {
        if (natGatewayIds == null) {
              natGatewayIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              natGatewayIds.setAutoConstruct(true);
        }
        return natGatewayIds;
    }
    
    /**
     * One or more NAT gateway IDs.
     *
     * @param natGatewayIds One or more NAT gateway IDs.
     */
    public void setNatGatewayIds(java.util.Collection<String> natGatewayIds) {
        if (natGatewayIds == null) {
            this.natGatewayIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> natGatewayIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(natGatewayIds.size());
        natGatewayIdsCopy.addAll(natGatewayIds);
        this.natGatewayIds = natGatewayIdsCopy;
    }
    
    /**
     * One or more NAT gateway IDs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setNatGatewayIds(java.util.Collection)} or {@link
     * #withNatGatewayIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param natGatewayIds One or more NAT gateway IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNatGatewaysRequest withNatGatewayIds(String... natGatewayIds) {
        if (getNatGatewayIds() == null) setNatGatewayIds(new java.util.ArrayList<String>(natGatewayIds.length));
        for (String value : natGatewayIds) {
            getNatGatewayIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more NAT gateway IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param natGatewayIds One or more NAT gateway IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNatGatewaysRequest withNatGatewayIds(java.util.Collection<String> natGatewayIds) {
        if (natGatewayIds == null) {
            this.natGatewayIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> natGatewayIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(natGatewayIds.size());
            natGatewayIdsCopy.addAll(natGatewayIds);
            this.natGatewayIds = natGatewayIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>nat-gateway-id</code> - The ID
     * of the NAT gateway. </li> <li> <p><code>state</code> - The state of
     * the NAT gateway (<code>pending</code> | <code>failed</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li> <p><code>subnet-id</code> - The ID
     * of the subnet in which the NAT gateway resides. </li> <li>
     * <p><code>vpc-id</code> - The ID of the VPC in which the NAT gateway
     * resides. </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>nat-gateway-id</code> - The ID
     *         of the NAT gateway. </li> <li> <p><code>state</code> - The state of
     *         the NAT gateway (<code>pending</code> | <code>failed</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code>). </li> <li> <p><code>subnet-id</code> - The ID
     *         of the subnet in which the NAT gateway resides. </li> <li>
     *         <p><code>vpc-id</code> - The ID of the VPC in which the NAT gateway
     *         resides. </li> </ul>
     */
    public java.util.List<Filter> getFilter() {
        if (filter == null) {
              filter = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filter.setAutoConstruct(true);
        }
        return filter;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>nat-gateway-id</code> - The ID
     * of the NAT gateway. </li> <li> <p><code>state</code> - The state of
     * the NAT gateway (<code>pending</code> | <code>failed</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li> <p><code>subnet-id</code> - The ID
     * of the subnet in which the NAT gateway resides. </li> <li>
     * <p><code>vpc-id</code> - The ID of the VPC in which the NAT gateway
     * resides. </li> </ul>
     *
     * @param filter One or more filters. <ul> <li> <p><code>nat-gateway-id</code> - The ID
     *         of the NAT gateway. </li> <li> <p><code>state</code> - The state of
     *         the NAT gateway (<code>pending</code> | <code>failed</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code>). </li> <li> <p><code>subnet-id</code> - The ID
     *         of the subnet in which the NAT gateway resides. </li> <li>
     *         <p><code>vpc-id</code> - The ID of the VPC in which the NAT gateway
     *         resides. </li> </ul>
     */
    public void setFilter(java.util.Collection<Filter> filter) {
        if (filter == null) {
            this.filter = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filterCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filter.size());
        filterCopy.addAll(filter);
        this.filter = filterCopy;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>nat-gateway-id</code> - The ID
     * of the NAT gateway. </li> <li> <p><code>state</code> - The state of
     * the NAT gateway (<code>pending</code> | <code>failed</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li> <p><code>subnet-id</code> - The ID
     * of the subnet in which the NAT gateway resides. </li> <li>
     * <p><code>vpc-id</code> - The ID of the VPC in which the NAT gateway
     * resides. </li> </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilter(java.util.Collection)} or {@link
     * #withFilter(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filter One or more filters. <ul> <li> <p><code>nat-gateway-id</code> - The ID
     *         of the NAT gateway. </li> <li> <p><code>state</code> - The state of
     *         the NAT gateway (<code>pending</code> | <code>failed</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code>). </li> <li> <p><code>subnet-id</code> - The ID
     *         of the subnet in which the NAT gateway resides. </li> <li>
     *         <p><code>vpc-id</code> - The ID of the VPC in which the NAT gateway
     *         resides. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNatGatewaysRequest withFilter(Filter... filter) {
        if (getFilter() == null) setFilter(new java.util.ArrayList<Filter>(filter.length));
        for (Filter value : filter) {
            getFilter().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>nat-gateway-id</code> - The ID
     * of the NAT gateway. </li> <li> <p><code>state</code> - The state of
     * the NAT gateway (<code>pending</code> | <code>failed</code> |
     * <code>available</code> | <code>deleting</code> |
     * <code>deleted</code>). </li> <li> <p><code>subnet-id</code> - The ID
     * of the subnet in which the NAT gateway resides. </li> <li>
     * <p><code>vpc-id</code> - The ID of the VPC in which the NAT gateway
     * resides. </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filter One or more filters. <ul> <li> <p><code>nat-gateway-id</code> - The ID
     *         of the NAT gateway. </li> <li> <p><code>state</code> - The state of
     *         the NAT gateway (<code>pending</code> | <code>failed</code> |
     *         <code>available</code> | <code>deleting</code> |
     *         <code>deleted</code>). </li> <li> <p><code>subnet-id</code> - The ID
     *         of the subnet in which the NAT gateway resides. </li> <li>
     *         <p><code>vpc-id</code> - The ID of the VPC in which the NAT gateway
     *         resides. </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNatGatewaysRequest withFilter(java.util.Collection<Filter> filter) {
        if (filter == null) {
            this.filter = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filterCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filter.size());
            filterCopy.addAll(filter);
            this.filter = filterCopy;
        }

        return this;
    }

    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value specified is greater
     * than 1000, we return only 1000 items.
     *
     * @return The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results. <p>Constraint: If the value specified is greater
     *         than 1000, we return only 1000 items.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value specified is greater
     * than 1000, we return only 1000 items.
     *
     * @param maxResults The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results. <p>Constraint: If the value specified is greater
     *         than 1000, we return only 1000 items.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value specified is greater
     * than 1000, we return only 1000 items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results. <p>Constraint: If the value specified is greater
     *         than 1000, we return only 1000 items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNatGatewaysRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * The token to retrieve the next page of results.
     *
     * @return The token to retrieve the next page of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to retrieve the next page of results.
     *
     * @param nextToken The token to retrieve the next page of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to retrieve the next page of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to retrieve the next page of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeNatGatewaysRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
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
        if (getNatGatewayIds() != null) sb.append("NatGatewayIds: " + getNatGatewayIds() + ",");
        if (getFilter() != null) sb.append("Filter: " + getFilter() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getNatGatewayIds() == null) ? 0 : getNatGatewayIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilter() == null) ? 0 : getFilter().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeNatGatewaysRequest == false) return false;
        DescribeNatGatewaysRequest other = (DescribeNatGatewaysRequest)obj;
        
        if (other.getNatGatewayIds() == null ^ this.getNatGatewayIds() == null) return false;
        if (other.getNatGatewayIds() != null && other.getNatGatewayIds().equals(this.getNatGatewayIds()) == false) return false; 
        if (other.getFilter() == null ^ this.getFilter() == null) return false;
        if (other.getFilter() != null && other.getFilter().equals(this.getFilter()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeNatGatewaysRequest clone() {
        
            return (DescribeNatGatewaysRequest) super.clone();
    }

}
    