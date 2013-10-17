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
import com.amazonaws.services.ec2.model.transform.DescribeSpotInstanceRequestsRequestMarshaller;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest) DescribeSpotInstanceRequests operation}.
 * <p>
 * Describes Spot Instance requests. Spot Instances are instances that Amazon EC2 starts on your behalf when the maximum price that you specify exceeds
 * the current Spot Price. Amazon EC2 periodically sets the Spot Price based on available Spot Instance capacity and current spot instance requests. For
 * conceptual information about Spot Instances, refer to the <a href="http://docs.amazonwebservices.com/AWSEC2/2010-08-31/DeveloperGuide/"> Amazon
 * Elastic Compute Cloud Developer Guide </a> or <a href="http://docs.amazonwebservices.com/AWSEC2/2010-08-31/UserGuide/"> Amazon Elastic Compute Cloud
 * User Guide </a> .
 * </p>
 * <p>
 * You can filter the results to return information only about Spot Instance requests that match criteria you specify. For example, you could get
 * information about requests where the Spot Price you specified is a certain value (you can't use greater than or less than comparison, but you can use
 * <code>*</code> and <code>?</code> wildcards). You can specify multiple values for a filter. A Spot Instance request must match at least one of the
 * specified values for it to be included in the results.
 * </p>
 * <p>
 * You can specify multiple filters (e.g., the Spot Price is equal to a particular value, and the instance type is <code>m1.small</code> ). The result
 * includes information for a particular request only if it matches all your filters. If there's no match, no special message is returned; the response
 * is simply empty.
 * </p>
 * <p>
 * You can use wildcards with the filter values: an asterisk matches zero or more characters, and <code>?</code> matches exactly one character. You can
 * escape special characters using a backslash before the character. For example, a value of <code>\*amazon\?\\</code> searches for the literal string
 * <code>*amazon?\</code> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest)
 */
public class DescribeSpotInstanceRequestsRequest extends AmazonWebServiceRequest implements Serializable, DryRunSupportedRequest<DescribeSpotInstanceRequestsRequest> {

    /**
     * The ID of the request.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> spotInstanceRequestIds;

    /**
     * A list of filters used to match properties for SpotInstances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Filter> filters;

    /**
     * The ID of the request.
     *
     * @return The ID of the request.
     */
    public java.util.List<String> getSpotInstanceRequestIds() {
        if (spotInstanceRequestIds == null) {
              spotInstanceRequestIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              spotInstanceRequestIds.setAutoConstruct(true);
        }
        return spotInstanceRequestIds;
    }
    
    /**
     * The ID of the request.
     *
     * @param spotInstanceRequestIds The ID of the request.
     */
    public void setSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        if (spotInstanceRequestIds == null) {
            this.spotInstanceRequestIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> spotInstanceRequestIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(spotInstanceRequestIds.size());
        spotInstanceRequestIdsCopy.addAll(spotInstanceRequestIds);
        this.spotInstanceRequestIds = spotInstanceRequestIdsCopy;
    }
    
    /**
     * The ID of the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestIds The ID of the request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotInstanceRequestsRequest withSpotInstanceRequestIds(String... spotInstanceRequestIds) {
        if (getSpotInstanceRequestIds() == null) setSpotInstanceRequestIds(new java.util.ArrayList<String>(spotInstanceRequestIds.length));
        for (String value : spotInstanceRequestIds) {
            getSpotInstanceRequestIds().add(value);
        }
        return this;
    }
    
    /**
     * The ID of the request.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param spotInstanceRequestIds The ID of the request.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotInstanceRequestsRequest withSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        if (spotInstanceRequestIds == null) {
            this.spotInstanceRequestIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> spotInstanceRequestIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(spotInstanceRequestIds.size());
            spotInstanceRequestIdsCopy.addAll(spotInstanceRequestIds);
            this.spotInstanceRequestIds = spotInstanceRequestIdsCopy;
        }

        return this;
    }

    /**
     * A list of filters used to match properties for SpotInstances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for SpotInstances. For a
     *         complete reference to the available filter keys for this operation,
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
     * A list of filters used to match properties for SpotInstances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for SpotInstances. For a
     *         complete reference to the available filter keys for this operation,
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
     * A list of filters used to match properties for SpotInstances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for SpotInstances. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotInstanceRequestsRequest withFilters(Filter... filters) {
        if (getFilters() == null) setFilters(new java.util.ArrayList<Filter>(filters.length));
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for SpotInstances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for SpotInstances. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         href="http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeSpotInstanceRequestsRequest withFilters(java.util.Collection<Filter> filters) {
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
    public Request<DescribeSpotInstanceRequestsRequest> getDryRunRequest() {
        Request<DescribeSpotInstanceRequestsRequest> request = new DescribeSpotInstanceRequestsRequestMarshaller().marshall(this);
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
        if (getSpotInstanceRequestIds() != null) sb.append("SpotInstanceRequestIds: " + getSpotInstanceRequestIds() + ",");
        if (getFilters() != null) sb.append("Filters: " + getFilters() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getSpotInstanceRequestIds() == null) ? 0 : getSpotInstanceRequestIds().hashCode()); 
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DescribeSpotInstanceRequestsRequest == false) return false;
        DescribeSpotInstanceRequestsRequest other = (DescribeSpotInstanceRequestsRequest)obj;
        
        if (other.getSpotInstanceRequestIds() == null ^ this.getSpotInstanceRequestIds() == null) return false;
        if (other.getSpotInstanceRequestIds() != null && other.getSpotInstanceRequestIds().equals(this.getSpotInstanceRequestIds()) == false) return false; 
        if (other.getFilters() == null ^ this.getFilters() == null) return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false) return false; 
        return true;
    }
    
}
    