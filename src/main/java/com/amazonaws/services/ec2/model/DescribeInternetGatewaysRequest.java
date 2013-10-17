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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.DescribeInternetGatewaysRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeInternetGateways(DescribeInternetGatewaysRequest) DescribeInternetGateways operation}.
 * <p>
 * Gives you information about your Internet gateways. You can filter the results to return information only about Internet gateways that match criteria
 * you specify. For example, you could get information only about gateways with particular tags. The Internet gateway must match at least one of the
 * specified values for it to be included in the results.
 * </p>
 * <p>
 * You can specify multiple filters (e.g., the Internet gateway is attached to a particular VPC and is tagged with a particular value). The result
 * includes information for a particular Internet gateway only if the gateway matches all your filters. If there's no match, no special message is
 * returned; the response is simply empty.
 * </p>
 * <p>
 * You can use wildcards with the filter values: an asterisk matches zero or more characters, and <code>?</code> matches exactly one character. You can
 * escape special characters using a backslash before the character. For example, a value of <code>\*amazon\?\\</code> searches for the literal string
 * <code>*amazon?\</code> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeInternetGateways(DescribeInternetGatewaysRequest)
 */
public class DescribeInternetGatewaysRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeInternetGatewaysRequest> {

    /**
     * One or more Internet gateway IDs.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> internetGatewayIds;

    /**
     * A list of filters used to match properties for Internet Gateways. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * One or more Internet gateway IDs.
     *
     * @return One or more Internet gateway IDs.
     */
    public java.util.List<String> getInternetGatewayIds() {
        if (internetGatewayIds == null) {
              internetGatewayIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              internetGatewayIds.setAutoConstruct(true);
        }
        return internetGatewayIds;
    }
    
    /**
     * One or more Internet gateway IDs.
     *
     * @param internetGatewayIds One or more Internet gateway IDs.
     */
    public void setInternetGatewayIds(java.util.Collection<String> internetGatewayIds) {
        if (internetGatewayIds == null) {
            this.internetGatewayIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> internetGatewayIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(internetGatewayIds.size());
        internetGatewayIdsCopy.addAll(internetGatewayIds);
        this.internetGatewayIds = internetGatewayIdsCopy;
    }
    
    /**
     * One or more Internet gateway IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param internetGatewayIds One or more Internet gateway IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInternetGatewaysRequest withInternetGatewayIds(String... internetGatewayIds) {
        if (getInternetGatewayIds() == null) setInternetGatewayIds(new java.util.ArrayList<String>(internetGatewayIds.length));
        for (String value : internetGatewayIds) {
            getInternetGatewayIds().add(value);
        }
        return this;
    }
    
    /**
     * One or more Internet gateway IDs.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param internetGatewayIds One or more Internet gateway IDs.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInternetGatewaysRequest withInternetGatewayIds(java.util.Collection<String> internetGatewayIds) {
        if (internetGatewayIds == null) {
            this.internetGatewayIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> internetGatewayIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(internetGatewayIds.size());
            internetGatewayIdsCopy.addAll(internetGatewayIds);
            this.internetGatewayIds = internetGatewayIdsCopy;
        }

        return this;
    }

    /**
     * A list of filters used to match properties for Internet Gateways. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Internet Gateways. For
     *         a complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
              filters = new com.amazonaws.internal.ListWithAutoConstructFlag<Filter>();
              filters.setAutoConstruct(true);
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for Internet Gateways. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Internet Gateways. For
     *         a complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
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
     * A list of filters used to match properties for Internet Gateways. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Internet Gateways. For
     *         a complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInternetGatewaysRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for Internet Gateways. For
     * a complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Internet Gateways. For
     *         a complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeInternetGatewaysRequest withFilters(java.util.Collection<Filter> filters) {
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
     * This method is intended for internal use only.
     * Returns the marshaled request configured with additional parameters to
     * enable operation dry-run.
     */
    @Override
    public Request<DescribeInternetGatewaysRequest> getDryRunRequest() {
        Request<DescribeInternetGatewaysRequest> request = new DescribeInternetGatewaysRequestMarshaller().marshall(this);
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
        if (getInternetGatewayIds() != null) sb.append("InternetGatewayIds: " + getInternetGatewayIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getInternetGatewayIds() == null) ? 0 : getInternetGatewayIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeInternetGatewaysRequest == false) return false;
        DescribeInternetGatewaysRequest other = (DescribeInternetGatewaysRequest)obj;
        
        if (other.getInternetGatewayIds() == null ^ this.getInternetGatewayIds() == null) return false;
        if (other.getInternetGatewayIds() != null && other.getInternetGatewayIds().equals(this.getInternetGatewayIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    