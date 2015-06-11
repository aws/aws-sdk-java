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
package com.amazonaws.services.autoscaling.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.autoscaling.AmazonAutoScaling#detachLoadBalancers(DetachLoadBalancersRequest) DetachLoadBalancers operation}.
 * <p>
 * Removes one or more load balancers from the specified Auto Scaling
 * group.
 * </p>
 * <p>
 * When you detach a load balancer, it enters the <code>Removing</code>
 * state while deregistering the instances in the group. When all
 * instances are deregistered, then you can no longer describe the load
 * balancer using DescribeLoadBalancers. Note that the instances remain
 * running.
 * </p>
 *
 * @see com.amazonaws.services.autoscaling.AmazonAutoScaling#detachLoadBalancers(DetachLoadBalancersRequest)
 */
public class DetachLoadBalancersRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     */
    private String autoScalingGroupName;

    /**
     * One or more load balancer names.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNames;

    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @return The name of the group.
     */
    public String getAutoScalingGroupName() {
        return autoScalingGroupName;
    }
    
    /**
     * The name of the group.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the group.
     */
    public void setAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
    }
    
    /**
     * The name of the group.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1600<br/>
     * <b>Pattern: </b>[&#92;u0020-&#92;uD7FF&#92;uE000-&#92;uFFFD&#92;uD800&#92;uDC00-&#92;uDBFF&#92;uDFFF\r\n\t]*<br/>
     *
     * @param autoScalingGroupName The name of the group.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetachLoadBalancersRequest withAutoScalingGroupName(String autoScalingGroupName) {
        this.autoScalingGroupName = autoScalingGroupName;
        return this;
    }

    /**
     * One or more load balancer names.
     *
     * @return One or more load balancer names.
     */
    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
              loadBalancerNames = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              loadBalancerNames.setAutoConstruct(true);
        }
        return loadBalancerNames;
    }
    
    /**
     * One or more load balancer names.
     *
     * @param loadBalancerNames One or more load balancer names.
     */
    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(loadBalancerNames.size());
        loadBalancerNamesCopy.addAll(loadBalancerNames);
        this.loadBalancerNames = loadBalancerNamesCopy;
    }
    
    /**
     * One or more load balancer names.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLoadBalancerNames(java.util.Collection)} or
     * {@link #withLoadBalancerNames(java.util.Collection)} if you want to
     * override the existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames One or more load balancer names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetachLoadBalancersRequest withLoadBalancerNames(String... loadBalancerNames) {
        if (getLoadBalancerNames() == null) setLoadBalancerNames(new java.util.ArrayList<String>(loadBalancerNames.length));
        for (String value : loadBalancerNames) {
            getLoadBalancerNames().add(value);
        }
        return this;
    }
    
    /**
     * One or more load balancer names.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerNames One or more load balancer names.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DetachLoadBalancersRequest withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> loadBalancerNamesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(loadBalancerNames.size());
            loadBalancerNamesCopy.addAll(loadBalancerNames);
            this.loadBalancerNames = loadBalancerNamesCopy;
        }

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
        if (getAutoScalingGroupName() != null) sb.append("AutoScalingGroupName: " + getAutoScalingGroupName() + ",");
        if (getLoadBalancerNames() != null) sb.append("LoadBalancerNames: " + getLoadBalancerNames() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getAutoScalingGroupName() == null) ? 0 : getAutoScalingGroupName().hashCode()); 
        hashCode = prime * hashCode + ((getLoadBalancerNames() == null) ? 0 : getLoadBalancerNames().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DetachLoadBalancersRequest == false) return false;
        DetachLoadBalancersRequest other = (DetachLoadBalancersRequest)obj;
        
        if (other.getAutoScalingGroupName() == null ^ this.getAutoScalingGroupName() == null) return false;
        if (other.getAutoScalingGroupName() != null && other.getAutoScalingGroupName().equals(this.getAutoScalingGroupName()) == false) return false; 
        if (other.getLoadBalancerNames() == null ^ this.getLoadBalancerNames() == null) return false;
        if (other.getLoadBalancerNames() != null && other.getLoadBalancerNames().equals(this.getLoadBalancerNames()) == false) return false; 
        return true;
    }
    
    @Override
    public DetachLoadBalancersRequest clone() {
        
            return (DetachLoadBalancersRequest) super.clone();
    }

}
    