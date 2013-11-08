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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#deregisterInstancesFromLoadBalancer(DeregisterInstancesFromLoadBalancerRequest) DeregisterInstancesFromLoadBalancer operation}.
 * <p>
 * Deregisters instances from the load balancer. Once the instance is deregistered, it will stop receiving traffic from the load balancer.
 * </p>
 * <p>
 * In order to successfully call this API, the same account credentials as those used to create the load balancer must be provided.
 * </p>
 * <p>
 * For more information, see <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"> De-register and
 * Register Amazon EC2 Instances </a> in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 * <p>
 * You can use DescribeLoadBalancers to verify if the instance is deregistered from the load balancer.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#deregisterInstancesFromLoadBalancer(DeregisterInstancesFromLoadBalancerRequest)
 */
public class DeregisterInstancesFromLoadBalancerRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name associated with the load balancer.
     */
    private String loadBalancerName;

    /**
     * A list of EC2 instance IDs consisting of all instances to be
     * deregistered.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instances;

    /**
     * Default constructor for a new DeregisterInstancesFromLoadBalancerRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public DeregisterInstancesFromLoadBalancerRequest() {}
    
    /**
     * Constructs a new DeregisterInstancesFromLoadBalancerRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name associated with the load balancer.
     * @param instances A list of EC2 instance IDs consisting of all
     * instances to be deregistered.
     */
    public DeregisterInstancesFromLoadBalancerRequest(String loadBalancerName, java.util.List<Instance> instances) {
        setLoadBalancerName(loadBalancerName);
        setInstances(instances);
    }

    /**
     * The name associated with the load balancer.
     *
     * @return The name associated with the load balancer.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name associated with the load balancer.
     *
     * @param loadBalancerName The name associated with the load balancer.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name associated with the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name associated with the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeregisterInstancesFromLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * A list of EC2 instance IDs consisting of all instances to be
     * deregistered.
     *
     * @return A list of EC2 instance IDs consisting of all instances to be
     *         deregistered.
     */
    public java.util.List<Instance> getInstances() {
        if (instances == null) {
              instances = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>();
              instances.setAutoConstruct(true);
        }
        return instances;
    }
    
    /**
     * A list of EC2 instance IDs consisting of all instances to be
     * deregistered.
     *
     * @param instances A list of EC2 instance IDs consisting of all instances to be
     *         deregistered.
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>(instances.size());
        instancesCopy.addAll(instances);
        this.instances = instancesCopy;
    }
    
    /**
     * A list of EC2 instance IDs consisting of all instances to be
     * deregistered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances A list of EC2 instance IDs consisting of all instances to be
     *         deregistered.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeregisterInstancesFromLoadBalancerRequest withInstances(Instance... instances) {
        if (getInstances() == null) setInstances(new java.util.ArrayList<Instance>(instances.length));
        for (Instance value : instances) {
            getInstances().add(value);
        }
        return this;
    }
    
    /**
     * A list of EC2 instance IDs consisting of all instances to be
     * deregistered.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances A list of EC2 instance IDs consisting of all instances to be
     *         deregistered.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DeregisterInstancesFromLoadBalancerRequest withInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instancesCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>(instances.size());
            instancesCopy.addAll(instances);
            this.instances = instancesCopy;
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
        if (getLoadBalancerName() != null) sb.append("LoadBalancerName: " + getLoadBalancerName() + ",");
        if (getInstances() != null) sb.append("Instances: " + getInstances() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getInstances() == null) ? 0 : getInstances().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeregisterInstancesFromLoadBalancerRequest == false) return false;
        DeregisterInstancesFromLoadBalancerRequest other = (DeregisterInstancesFromLoadBalancerRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getInstances() == null ^ this.getInstances() == null) return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false) return false; 
        return true;
    }
    
}
    