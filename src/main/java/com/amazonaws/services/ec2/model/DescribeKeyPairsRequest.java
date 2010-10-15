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
 * Container for the parameters to the {@link com.amazonaws.services.ec2.AmazonEC2#describeKeyPairs(DescribeKeyPairsRequest) DescribeKeyPairs operation}.
 * <p>
 * The DescribeKeyPairs operation returns information about key pairs
 * available to you. If you specify key pairs, information about those
 * key pairs is returned. Otherwise, information for all registered key
 * pairs is returned.
 * </p>
 *
 * @see com.amazonaws.services.ec2.AmazonEC2#describeKeyPairs(DescribeKeyPairsRequest)
 */
public class DescribeKeyPairsRequest extends AmazonWebServiceRequest {

    /**
     * The optional list of key pair names to describe.
     */
    private java.util.List<String> keyNames;

    /**
     * A list of filters used to match properties for KeyPairs. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     */
    private java.util.List<Filter> filters;

    /**
     * The optional list of key pair names to describe.
     *
     * @return The optional list of key pair names to describe.
     */
    public java.util.List<String> getKeyNames() {
        if (keyNames == null) {
            keyNames = new java.util.ArrayList<String>();
        }
        return keyNames;
    }
    
    /**
     * The optional list of key pair names to describe.
     *
     * @param keyNames The optional list of key pair names to describe.
     */
    public void setKeyNames(java.util.Collection<String> keyNames) {
        java.util.List<String> keyNamesCopy = new java.util.ArrayList<String>();
        if (keyNames != null) {
            keyNamesCopy.addAll(keyNames);
        }
        this.keyNames = keyNamesCopy;
    }
    
    /**
     * The optional list of key pair names to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyNames The optional list of key pair names to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeKeyPairsRequest withKeyNames(String... keyNames) {
        for (String value : keyNames) {
            getKeyNames().add(value);
        }
        return this;
    }
    
    /**
     * The optional list of key pair names to describe.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param keyNames The optional list of key pair names to describe.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeKeyPairsRequest withKeyNames(java.util.Collection<String> keyNames) {
        java.util.List<String> keyNamesCopy = new java.util.ArrayList<String>();
        if (keyNames != null) {
            keyNamesCopy.addAll(keyNames);
        }
        this.keyNames = keyNamesCopy;

        return this;
    }
    
    /**
     * A list of filters used to match properties for KeyPairs. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @return A list of filters used to match properties for KeyPairs. For a
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
     * A list of filters used to match properties for KeyPairs. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     *
     * @param filters A list of filters used to match properties for KeyPairs. For a
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
     * A list of filters used to match properties for KeyPairs. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for KeyPairs. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeKeyPairsRequest withFilters(Filter... filters) {
        for (Filter value : filters) {
            getFilters().add(value);
        }
        return this;
    }
    
    /**
     * A list of filters used to match properties for KeyPairs. For a
     * complete reference to the available filter keys for this operation,
     * see the <a
     * "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     * EC2 API reference</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param filters A list of filters used to match properties for KeyPairs. For a
     *         complete reference to the available filter keys for this operation,
     *         see the <a
     *         "http://docs.amazonwebservices.com/AWSEC2/latest/APIReference/">Amazon
     *         EC2 API reference</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeKeyPairsRequest withFilters(java.util.Collection<Filter> filters) {
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
        sb.append("KeyNames: " + keyNames + ", ");
        sb.append("Filters: " + filters + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    