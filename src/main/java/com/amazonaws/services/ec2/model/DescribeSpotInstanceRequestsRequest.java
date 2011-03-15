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
package com.amazonaws.services.ec2.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest) DescribeSpotInstanceRequests operation}.
 * <p>
 * Describes Spot Instance requests. Spot Instances are instances that
 * Amazon EC2 starts on your behalf when the maximum price that you
 * specify exceeds the current Spot Price. Amazon EC2 periodically sets
 * the Spot Price based on available Spot Instance capacity and current
 * spot instance requests. For conceptual information about Spot
 * Instances, refer to the <a
 * "http://docs.amazonwebservices.com/AWSEC2/2010-08-31/DeveloperGuide/">
 * Amazon Elastic Compute Cloud Developer Guide </a> or <a
 * href="http://docs.amazonwebservices.com/AWSEC2/2010-08-31/UserGuide/">
 * Amazon Elastic Compute Cloud User Guide </a> .
 * </p>
 * <p>
 * You can filter the results to return information only about Spot
 * Instance requests that match criteria you specify. For example, you
 * could get information about requests where the Spot Price you
 * specified is a certain value (you can't use greater than or less than
 * comparison, but you can use <code>*</code> and <code>?</code>
 * wildcards). You can specify multiple values for a filter. A Spot
 * Instance request must match at least one of the specified values for
 * it to be included in the results.
 * </p>
 * <p>
 * You can specify multiple filters (e.g., the Spot Price is equal to a
 * particular value, and the instance type is <code>m1.small</code> ).
 * The result includes information for a particular request only if it
 * matches all your filters. If there's no match, no special message is
 * returned; the response is simply empty.
 * </p>
 * <p>
 * You can use wildcards with the filter values: an asterisk matches
 * zero or more characters, and <code>?</code> matches exactly one
 * character. You can escape special characters using a backslash before
 * the character. For example, a value of <code>\*amazon\?\\</code>
 * searches for the literal string <code>*amazon?\</code> .
 * 
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeSpotInstanceRequests(DescribeSpotInstanceRequestsRequest)
 */
public class DescribeSpotInstanceRequestsRequest extends AmazonWebServiceRequest {

    /**
     * The ID of the request.
     */
    private java.util.List<String> spotInstanceRequestIds;

    /**
     * A list of filters used to match properties for SpotInstances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * The ID of the request.
     *
     * @return The ID of the request.
     */
    public java.util.List<String> getSpotInstanceRequestIds() {
        if (spotInstanceRequestIds == null) {
            spotInstanceRequestIds = new java.util.ArrayList<String>();
        }
        return spotInstanceRequestIds;
    }
    
    /**
     * The ID of the request.
     *
     * @param spotInstanceRequestIds The ID of the request.
     */
    public void setSpotInstanceRequestIds(java.util.Collection<String> spotInstanceRequestIds) {
        java.util.List<String> spotInstanceRequestIdsCopy = new java.util.ArrayList<String>();
        if (spotInstanceRequestIds != null) {
            spotInstanceRequestIdsCopy.addAll(spotInstanceRequestIds);
        }
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
        java.util.List<String> spotInstanceRequestIdsCopy = new java.util.ArrayList<String>();
        if (spotInstanceRequestIds != null) {
            spotInstanceRequestIdsCopy.addAll(spotInstanceRequestIds);
        }
        this.spotInstanceRequestIds = spotInstanceRequestIdsCopy;

        return this;
    }
    
    /**
     * A list of filters used to match properties for SpotInstances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for SpotInstances. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public java.util.List<Filter> getFilters() {
        if (filters == null) {
            filters = new java.util.ArrayList<Filter>();
        }
        return filters;
    }
    
    /**
     * A list of filters used to match properties for SpotInstances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for SpotInstances. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     */
    public void setFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;
    }
    
    /**
     * A list of filters used to match properties for SpotInstances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for SpotInstances. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSpotInstanceRequestsRequest withFilters(Filter... filters) {
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for SpotInstances. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for SpotInstances. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeSpotInstanceRequestsRequest withFilters(java.util.Collection<Filter> filters) {
        java.util.List<Filter> filtersCopy = new java.util.ArrayList<Filter>();
        if (filters != null) {
            filtersCopy.addAll(filters);
        }
        this.filters = filtersCopy;

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
        sb.append("SpotInstanceRequestIds: " + spotInstanceRequestIds + ", ");
        sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    