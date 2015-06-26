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
import com.amazonaws.services.ec2.model.transform.DescribeMovingAddressesRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeMovingAddresses(DescribeMovingAddressesRequest) DescribeMovingAddresses operation}.
 * <p>
 * Describes your Elastic IP addresses that are being moved to the
 * EC2-VPC platform, or that are being restored to the EC2-Classic
 * platform. This request does not return information about any other
 * Elastic IP addresses in your account.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeMovingAddresses(DescribeMovingAddressesRequest)
 */
public class DescribeMovingAddressesRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<DescribeMovingAddressesRequest> {

    /**
     * One or more Elastic IP addresses.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> publicIps;

    /**
     * The token to use to retrieve the next page of results.
     */
    private String nextToken;

    /**
     * One or more filters. <ul> <li> <p><code>moving-status</code> - The
     * status of the Elastic IP address (<code>MovingToVpc</code> |
     * <code>RestoringToClassic</code>). </li> </ul>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value outside of this range, an
     * error is returned. <p>Default: If no value is provided, the default is
     * 1000.
     */
    private Integer maxResults;

    /**
     * One or more Elastic IP addresses.
     *
     * @return One or more Elastic IP addresses.
     */
    public java.util.List<String> getPublicIps() {
        if (publicIps == null) {
              publicIps = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              publicIps.setAutoConstruct(true);
        }
        return publicIps;
    }
    
    /**
     * One or more Elastic IP addresses.
     *
     * @param publicIps One or more Elastic IP addresses.
     */
    public void setPublicIps(java.util.Collection<String> publicIps) {
        if (publicIps == null) {
            this.publicIps = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> publicIpsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(publicIps.size());
        publicIpsCopy.addAll(publicIps);
        this.publicIps = publicIpsCopy;
    }
    
    /**
     * One or more Elastic IP addresses.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setPublicIps(java.util.Collection)} or {@link
     * #withPublicIps(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIps One or more Elastic IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMovingAddressesRequest withPublicIps(String... publicIps) {
        if (getPublicIps() == null) setPublicIps(new java.util.ArrayList<String>(publicIps.length));
        for (String value : publicIps) {
            getPublicIps().add(value);
        }
        return this;
    }
    
    /**
     * One or more Elastic IP addresses.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIps One or more Elastic IP addresses.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMovingAddressesRequest withPublicIps(java.util.Collection<String> publicIps) {
        if (publicIps == null) {
            this.publicIps = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> publicIpsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(publicIps.size());
            publicIpsCopy.addAll(publicIps);
            this.publicIps = publicIpsCopy;
        }

        return this;
    }

    /**
     * The token to use to retrieve the next page of results.
     *
     * @return The token to use to retrieve the next page of results.
     */
    public String getNextToken() {
        return nextToken;
    }
    
    /**
     * The token to use to retrieve the next page of results.
     *
     * @param nextToken The token to use to retrieve the next page of results.
     */
    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }
    
    /**
     * The token to use to retrieve the next page of results.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param nextToken The token to use to retrieve the next page of results.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMovingAddressesRequest withNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }

    /**
     * One or more filters. <ul> <li> <p><code>moving-status</code> - The
     * status of the Elastic IP address (<code>MovingToVpc</code> |
     * <code>RestoringToClassic</code>). </li> </ul>
     *
     * @return One or more filters. <ul> <li> <p><code>moving-status</code> - The
     *         status of the Elastic IP address (<code>MovingToVpc</code> |
     *         <code>RestoringToClassic</code>). </li> </ul>
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>moving-status</code> - The
     * status of the Elastic IP address (<code>MovingToVpc</code> |
     * <code>RestoringToClassic</code>). </li> </ul>
     *
     * @param filters One or more filters. <ul> <li> <p><code>moving-status</code> - The
     *         status of the Elastic IP address (<code>MovingToVpc</code> |
     *         <code>RestoringToClassic</code>). </li> </ul>
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
     * One or more filters. <ul> <li> <p><code>moving-status</code> - The
     * status of the Elastic IP address (<code>MovingToVpc</code> |
     * <code>RestoringToClassic</code>). </li> </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setFilters(java.util.Collection)} or {@link
     * #withFilters(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>moving-status</code> - The
     *         status of the Elastic IP address (<code>MovingToVpc</code> |
     *         <code>RestoringToClassic</code>). </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMovingAddressesRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * One or more filters. <ul> <li> <p><code>moving-status</code> - The
     * status of the Elastic IP address (<code>MovingToVpc</code> |
     * <code>RestoringToClassic</code>). </li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters One or more filters. <ul> <li> <p><code>moving-status</code> - The
     *         status of the Elastic IP address (<code>MovingToVpc</code> |
     *         <code>RestoringToClassic</code>). </li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMovingAddressesRequest withFilters(java.util.Collection<Filter> filters) {
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
     * The maximum number of results to return for the request in a single
     * page. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value outside of this range, an
     * error is returned. <p>Default: If no value is provided, the default is
     * 1000.
     *
     * @return The maximum number of results to return for the request in a single
     *         page. The remaining results of the initial request can be seen by
     *         sending another request with the returned <code>NextToken</code>
     *         value. This value can be between 5 and 1000; if
     *         <code>MaxResults</code> is given a value outside of this range, an
     *         error is returned. <p>Default: If no value is provided, the default is
     *         1000.
     */
    public Integer getMaxResults() {
        return maxResults;
    }
    
    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value outside of this range, an
     * error is returned. <p>Default: If no value is provided, the default is
     * 1000.
     *
     * @param maxResults The maximum number of results to return for the request in a single
     *         page. The remaining results of the initial request can be seen by
     *         sending another request with the returned <code>NextToken</code>
     *         value. This value can be between 5 and 1000; if
     *         <code>MaxResults</code> is given a value outside of this range, an
     *         error is returned. <p>Default: If no value is provided, the default is
     *         1000.
     */
    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }
    
    /**
     * The maximum number of results to return for the request in a single
     * page. The remaining results of the initial request can be seen by
     * sending another request with the returned <code>NextToken</code>
     * value. This value can be between 5 and 1000; if
     * <code>MaxResults</code> is given a value outside of this range, an
     * error is returned. <p>Default: If no value is provided, the default is
     * 1000.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param maxResults The maximum number of results to return for the request in a single
     *         page. The remaining results of the initial request can be seen by
     *         sending another request with the returned <code>NextToken</code>
     *         value. This value can be between 5 and 1000; if
     *         <code>MaxResults</code> is given a value outside of this range, an
     *         error is returned. <p>Default: If no value is provided, the default is
     *         1000.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DescribeMovingAddressesRequest withMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }

    /**
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeMovingAddressesRequest> getDryRunRequest() {
        Request<DescribeMovingAddressesRequest> request = new DescribeMovingAddressesRequestMarshaller().marshall(this);
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
        if (getPublicIps() != null) sb.append("PublicIps: " + getPublicIps() + ",");
        if (getNextToken() != null) sb.append("NextToken: " + getNextToken() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() + ",");
        if (getMaxResults() != null) sb.append("MaxResults: " + getMaxResults() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getPublicIps() == null) ? 0 : getPublicIps().hashCode()); 
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeMovingAddressesRequest == false) return false;
        DescribeMovingAddressesRequest other = (DescribeMovingAddressesRequest)obj;
        
        if (other.getPublicIps() == null ^ this.getPublicIps() == null) return false;
        if (other.getPublicIps() != null && other.getPublicIps().equals(this.getPublicIps()) == false) return false; 
        if (other.getNextToken() == null ^ this.getNextToken() == null) return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        if (other.getMaxResults() == null ^ this.getMaxResults() == null) return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false) return false; 
        return true;
    }
    
    @Override
    public DescribeMovingAddressesRequest clone() {
        
            return (DescribeMovingAddressesRequest) super.clone();
    }

}
    