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
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeVpcEndpointsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeVpcEndpoints(DescribeVpcEndpointsRequest) DescribeVpcEndpoints operation}.
 * <p>
 * Describes one or more of your VPC endpoints.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeVpcEndpoints(DescribeVpcEndpointsRequest)
 */
public class DescribeVpcEndpointsRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeVpcEndpointsRequest> {

    /**
     * One or more endpoint IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcEndpointIds;

    /**
     * One or more filters. <ul> <li> <p><code>service-name</code>: The name
     * of the AWS service. </li> <li> <p><code>vpc-id</code>: The ID of the
     * VPC in which the endpoint resides. </li> <li>
     * <p><code>vpc-endpoint-id</code>: The ID of the endpoint. </li> <li>
     * <p><code>vpc-endpoint-state</code>: The state of the endpoint.
     * (<code>pending</code> | <code>available</code> | <code>deleting</code>
     * | <code>deleted</code>) </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value is greater than 1000,
     * we return only 1000 items.
     */
    private Integer maxResults;

    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     */
    private String nextToken;

    /**
     * One or more endpoint IDs.
     *
     * @return One or more endpoint IDs.
     */
    public java.util.List<String> getVpcEndpointIds() {
        if (vpcEndpointIds == null) {
              vpcEndpointIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              vpcEndpointIds.setAutoConstruct(true);
        }
        return vpcEndpointIds;
    }
    
    /**
     * One or more endpoint IDs.
     *
     * @param vpcEndpointIds One or more endpoint IDs.
     */
    public void setVpcEndpointIds(java.util.Collection<String> vpcEndpointIds) {
        if (vpcEndpointIds == null) {
            this.vpcEndpointIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcEndpointIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcEndpointIds.size());
        vpcEndpointIdsCopy.addAll(vpcEndpointIds);
        this.vpcEndpointIds = vpcEndpointIdsCopy;
    }
    
    /**
     * One or more endpoint IDs.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setVpcEndpointIds(java.util.Collection)} or {@link
     * #withVpcEndpointIds(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcEndpointIds One or more endpoint IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcEndpointsRequest withVpcEndpointIds(String... vpcEndpointIds) {
        if (getVpcEndpointIds() == null) setVpcEndpointIds(new java.util.ArrayList<String>(vpcEndpointIds.length));
        for (String value : vpcEndpointIds) {
            getVpcEndpointIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more endpoint IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param vpcEndpointIds One or more endpoint IDs.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcEndpointsRequest withVpcEndpointIds(java.util.Collection<String> vpcEndpointIds) {
        if (vpcEndpointIds == null) {
            this.vpcEndpointIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> vpcEndpointIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(vpcEndpointIds.size());
            vpcEndpointIdsCopy.addAll(vpcEndpointIds);
            this.vpcEndpointIds = vpcEndpointIdsCopy;
        }

        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>service-name</code>: The name
     * of the AWS service. </li> <li> <p><code>vpc-id</code>: The ID of the
     * VPC in which the endpoint resides. </li> <li>
     * <p><code>vpc-endpoint-id</code>: The ID of the endpoint. </li> <li>
     * <p><code>vpc-endpoint-state</code>: The state of the endpoint.
     * (<code>pending</code> | <code>available</code> | <code>deleting</code>
     * | <code>deleted</code>) </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>service-name</code>: The name
     *         of the AWS service. </li> <li> <p><code>vpc-id</code>: The ID of the
     *         VPC in which the endpoint resides. </li> <li>
     *         <p><code>vpc-endpoint-id</code>: The ID of the endpoint. </li> <li>
     *         <p><code>vpc-endpoint-state</code>: The state of the endpoint.
     *         (<code>pending</code> | <code>available</code> | <code>deleting</code>
     *         | <code>deleted</code>) </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>service-name</code>: The name
     * of the AWS service. </li> <li> <p><code>vpc-id</code>: The ID of the
     * VPC in which the endpoint resides. </li> <li>
     * <p><code>vpc-endpoint-id</code>: The ID of the endpoint. </li> <li>
     * <p><code>vpc-endpoint-state</code>: The state of the endpoint.
     * (<code>pending</code> | <code>available</code> | <code>deleting</code>
     * | <code>deleted</code>) </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>service-name</code>: The name
     *         of the AWS service. </li> <li> <p><code>vpc-id</code>: The ID of the
     *         VPC in which the endpoint resides. </li> <li>
     *         <p><code>vpc-endpoint-id</code>: The ID of the endpoint. </li> <li>
     *         <p><code>vpc-endpoint-state</code>: The state of the endpoint.
     *         (<code>pending</code> | <code>available</code> | <code>deleting</code>
     *         | <code>deleted</code>) </li> </ul>
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
        filtersCopy.addAll(filters);
        this.filters = filtersCopy;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>service-name</code>: The name
     * of the AWS service. </li> <li> <p><code>vpc-id</code>: The ID of the
     * VPC in which the endpoint resides. </li> <li>
     * <p><code>vpc-endpoint-id</code>: The ID of the endpoint. </li> <li>
     * <p><code>vpc-endpoint-state</code>: The state of the endpoint.
     * (<code>pending</code> | <code>available</code> | <code>deleting</code>
     * | <code>deleted</code>) </li> </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or {@link
     * #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>service-name</code>: The name
     *         of the AWS service. </li> <li> <p><code>vpc-id</code>: The ID of the
     *         VPC in which the endpoint resides. </li> <li>
     *         <p><code>vpc-endpoint-id</code>: The ID of the endpoint. </li> <li>
     *         <p><code>vpc-endpoint-state</code>: The state of the endpoint.
     *         (<code>pending</code> | <code>available</code> | <code>deleting</code>
     *         | <code>deleted</code>) </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcEndpointsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>service-name</code>: The name
     * of the AWS service. </li> <li> <p><code>vpc-id</code>: The ID of the
     * VPC in which the endpoint resides. </li> <li>
     * <p><code>vpc-endpoint-id</code>: The ID of the endpoint. </li> <li>
     * <p><code>vpc-endpoint-state</code>: The state of the endpoint.
     * (<code>pending</code> | <code>available</code> | <code>deleting</code>
     * | <code>deleted</code>) </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>service-name</code>: The name
     *         of the AWS service. </li> <li> <p><code>vpc-id</code>: The ID of the
     *         VPC in which the endpoint resides. </li> <li>
     *         <p><code>vpc-endpoint-id</code>: The ID of the endpoint. </li> <li>
     *         <p><code>vpc-endpoint-state</code>: The state of the endpoint.
     *         (<code>pending</code> | <code>available</code> | <code>deleting</code>
     *         | <code>deleted</code>) </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcEndpointsRequest withFilters(java.util.Collection<Filter> filters) {
        if (filters == null) {
            this.filters = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filtersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>(filters.size());
            filtersCopy.addAll(filters);
            this.filters = filtersCopy;
        }

        return this;
    }

    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value is greater than 1000,
     * we return only 1000 items.
     *
     * @return The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results. <p>Constraint: If the value is greater than 1000,
     *         we return only 1000 items.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value is greater than 1000,
     * we return only 1000 items.
     *
     * @param maxResults The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results. <p>Constraint: If the value is greater than 1000,
     *         we return only 1000 items.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of items to return for this request. The request
     * returns a token that you can specify in a subsequent call to get the
     * next set of results. <p>Constraint: If the value is greater than 1000,
     * we return only 1000 items.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of items to return for this request. The request
     *         returns a token that you can specify in a subsequent call to get the
     *         next set of results. <p>Constraint: If the value is greater than 1000,
     *         we return only 1000 items.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcEndpointsRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     *
     * @return The token for the next set of items to return. (You received this
     *         token from a prior call.)
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a prior call.)
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token for the next set of items to return. (You received this
     * token from a prior call.)
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token for the next set of items to return. (You received this
     *         token from a prior call.)
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeVpcEndpointsRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeVpcEndpointsRequest> getDryRunRequest() {
        Request<DescribeVpcEndpointsRequest> request = new DescribeVpcEndpointsRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getVpcEndpointIds() != null) sb.append("VpcEndpointIds: " + getVpcEndpointIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getVpcEndpointIds() == null) ? 0 : getVpcEndpointIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeVpcEndpointsRequest == false) return false;
        DescribeVpcEndpointsRequest other = (DescribeVpcEndpointsRequest)obj;
        
        if (other.getVpcEndpointIds() == null ^ this.getVpcEndpointIds() == null) return false;
        if (other.getVpcEndpointIds() != null && other.getVpcEndpointIds().equals(this.getVpcEndpointIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeVpcEndpointsRequest clone() {
        
            return (DescribeVpcEndpointsRequest) super.clone();
    }

}
    