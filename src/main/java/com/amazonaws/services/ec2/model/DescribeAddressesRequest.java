/*
 * Copyright 2010 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeAddresses(DescribeAddressesRequest) DescribeAddresses operation}.
 * <p>
 * The DescribeAddresses operation lists elastic IP addresses assigned
 * to your account.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeAddresses(DescribeAddressesRequest)
 */
public class DescribeAddressesRequest extends AmazonWebServiceRequest {

    /**
     * The optional list of Elastic IP addresses to describe.
     */
    private java.util.List<String> publicIps;

    /**
     * A list of filters used to match properties for Addresses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * The optional list of Elastic IP addresses to describe.
     *
     * @return The optional list of Elastic IP addresses to describe.
     */
    public java.util.List<String> getPublicIps() {
        if (publicIps == null) {
            publicIps = new java.util.ArrayList<String>();
        }
        return publicIps;
    }
    
    /**
     * The optional list of Elastic IP addresses to describe.
     *
     * @param publicIps The optional list of Elastic IP addresses to describe.
     */
    public void setPublicIps(java.util.Collection<String> publicIps) {
        java.util.List<String> publicIpsCopy = new java.util.ArrayList<String>();
        if (publicIps != null) {
            publicIpsCopy.addAll(publicIps);
        }
        this.publicIps = publicIpsCopy;
    }
    
    /**
     * The optional list of Elastic IP addresses to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIps The optional list of Elastic IP addresses to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAddressesRequest withPublicIps(String... publicIps) {
        for (String value : publicIps) {
            getPublicIps().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of Elastic IP addresses to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param publicIps The optional list of Elastic IP addresses to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAddressesRequest withPublicIps(java.util.Collection<String> publicIps) {
        java.util.List<String> publicIpsCopy = new java.util.ArrayList<String>();
        if (publicIps != null) {
            publicIpsCopy.addAll(publicIps);
        }
        this.publicIps = publicIpsCopy;

        return this;
    }
    
    /**
     * A list of filters used to match properties for Addresses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for Addresses. For a
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
     * A list of filters used to match properties for Addresses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for Addresses. For a
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
     * A list of filters used to match properties for Addresses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Addresses. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAddressesRequest withFilters(Filter... filters) {
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for Addresses. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for Addresses. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeAddressesRequest withFilters(java.util.Collection<Filter> filters) {
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
        sb.append("PublicIps: " + publicIps + ", ");
        sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    