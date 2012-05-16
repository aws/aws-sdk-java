/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticloadbalancing.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#describeLoadBalancers(DescribeLoadBalancersRequest) DescribeLoadBalancers operation}.
 * <p>
 * Returns detailed configuration information for the specified LoadBalancers. If no LoadBalancers are specified, the operation returns configuration
 * information for all LoadBalancers created by the caller.
 * </p>
 * <p>
 * <b>NOTE:</b> The client must have created the specified input LoadBalancers in order to retrieve this information; the client must provide the same
 * account credentials as those that were used to create the LoadBalancer.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#describeLoadBalancers(DescribeLoadBalancersRequest)
 */
public class DescribeLoadBalancersRequest extends AmazonWebServiceRequest {

    /**
     * A list of names associated with the LoadBalancers at creation time.
     */
    private java.util.List<String> loadBalancerNames;

    /**
     * An optional parameter reserved for future use.
     */
    private String marker;

    /**
     * Default constructor for a new DescribeLoadBalancersRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DescribeLoadBalancersRequest() {}
    
    /**
     * Constructs a new DescribeLoadBalancersRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerNames A list of names associated with the
     * LoadBalancers at creation time.
     */
    public DescribeLoadBalancersRequest(java.util.List<String> loadBalancerNames) {
        this.loadBalancerNames = loadBalancerNames;
    }

    
    
    /**
     * A list of names associated with the LoadBalancers at creation time.
     *
     * @return A list of names associated with the LoadBalancers at creation time.
     */
    public java.util.List<String> getLoadBalancerNames() {
        
        if (loadBalancerNames == null) {
            loadBalancerNames = new java.util.ArrayList<String>();
        }
        return loadBalancerNames;
    }
    
    /**
     * A list of names associated with the LoadBalancers at creation time.
     *
     * @param loadBalancerNames A list of names associated with the LoadBalancers at creation time.
     */
    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
            return;
        }

        java.util.List<String> loadBalancerNamesCopy = new java.util.ArrayList<String>(loadBalancerNames.size());
        loadBalancerNamesCopy.addAll(loadBalancerNames);
        this.loadBalancerNames = loadBalancerNamesCopy;
    }
    
    /**
     * A list of names associated with the LoadBalancers at creation time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames A list of names associated with the LoadBalancers at creation time.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancersRequest withLoadBalancerNames(String... loadBalancerNames) {
        if (getLoadBalancerNames() == null) setLoadBalancerNames(new java.util.ArrayList<String>(loadBalancerNames.length));
        for (String value : loadBalancerNames) {
            getLoadBalancerNames().add(value);
        }
        return this;
    }
    
    /**
     * A list of names associated with the LoadBalancers at creation time.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames A list of names associated with the LoadBalancers at creation time.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancersRequest withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
        } else {
            java.util.List<String> loadBalancerNamesCopy = new java.util.ArrayList<String>(loadBalancerNames.size());
            loadBalancerNamesCopy.addAll(loadBalancerNames);
            this.loadBalancerNames = loadBalancerNamesCopy;
        }

        return this;
    }
    
    /**
     * An optional parameter reserved for future use.
     *
     * @return An optional parameter reserved for future use.
     */
    public String getMarker() {
        return marker;
    }
    
    /**
     * An optional parameter reserved for future use.
     *
     * @param marker An optional parameter reserved for future use.
     */
    public void setMarker(String marker) {
        this.marker = marker;
    }
    
    /**
     * An optional parameter reserved for future use.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param marker An optional parameter reserved for future use.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeLoadBalancersRequest withMarker(String marker) {
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
        if (loadBalancerNames != null) sb.append("LoadBalancerNames: " + loadBalancerNames + ", ");
        if (marker != null) sb.append("Marker: " + marker + ", ");
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerNames() == null) ? 0 : getLoadBalancerNames().hashCode()); 
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeLoadBalancersRequest == false) return false;
        DescribeLoadBalancersRequest other = (DescribeLoadBalancersRequest)obj;
        
        if (other.getLoadBalancerNames() == null ^ this.getLoadBalancerNames() == null) return false;
        if (other.getLoadBalancerNames() != null && other.getLoadBalancerNames().equals(this.getLoadBalancerNames()) == false) return false; 
        if (other.getMarker() == null ^ this.getMarker() == null) return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false) return false; 
        return true;
    }
    
}
    