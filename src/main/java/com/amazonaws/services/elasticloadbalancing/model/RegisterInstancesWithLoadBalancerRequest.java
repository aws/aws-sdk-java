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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest) RegisterInstancesWithLoadBalancer operation}.
 * <p>
 * Adds new instances to the LoadBalancer.
 * </p>
 * <p>
 * Once the instance is registered, it starts receiving traffic and requests from the LoadBalancer. Any instance that is not in any of the Availability
 * Zones registered for the LoadBalancer will be moved to the <i>OutOfService</i> state. It will move to the <i>InService</i> state when the Availability
 * Zone is added to the LoadBalancer.
 * </p>
 * <p>
 * <b>NOTE:</b> In order for this call to be successful, the client must have created the LoadBalancer. The client must provide the same account
 * credentials as those that were used to create the LoadBalancer.
 * </p>
 * <p>
 * <b>NOTE:</b> Completion of this API does not guarantee that operation has completed. Rather, it means that the request has been registered and the
 * changes will happen shortly.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest)
 */
public class RegisterInstancesWithLoadBalancerRequest extends AmazonWebServiceRequest {

    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     */
    private String loadBalancerName;

    /**
     * A list of instance IDs that should be registered with the
     * LoadBalancer. <note>If you stop and then restart the instance, the
     * instance ID changes. Elastic Load Balancing cannot recognize the new
     * ID, which prevents it from routing traffic to your instance. We
     * recommend you de-register and then register your the new instance ID
     * with the load balancer after you restart your instance. To de-register
     * your instances from load balancer, use
     * <a>DeregisterInstancesFromLoadBalancer</a> action.</note>
     */
    private java.util.List<Instance> instances;

    /**
     * Default constructor for a new RegisterInstancesWithLoadBalancerRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public RegisterInstancesWithLoadBalancerRequest() {}
    
    /**
     * Constructs a new RegisterInstancesWithLoadBalancerRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The name associated with the LoadBalancer. The
     * name must be unique within the client AWS account.
     * @param instances A list of instance IDs that should be registered with
     * the LoadBalancer. <note>If you stop and then restart the instance, the
     * instance ID changes. Elastic Load Balancing cannot recognize the new
     * ID, which prevents it from routing traffic to your instance. We
     * recommend you de-register and then register your the new instance ID
     * with the load balancer after you restart your instance. To de-register
     * your instances from load balancer, use
     * <a>DeregisterInstancesFromLoadBalancer</a> action.</note>
     */
    public RegisterInstancesWithLoadBalancerRequest(String loadBalancerName, java.util.List<Instance> instances) {
        this.loadBalancerName = loadBalancerName;
        this.instances = instances;
    }

    
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     *
     * @return The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     *
     * @param loadBalancerName The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name associated with the LoadBalancer. The name must be unique
     * within the client AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name associated with the LoadBalancer. The name must be unique
     *         within the client AWS account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RegisterInstancesWithLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    
    
    /**
     * A list of instance IDs that should be registered with the
     * LoadBalancer. <note>If you stop and then restart the instance, the
     * instance ID changes. Elastic Load Balancing cannot recognize the new
     * ID, which prevents it from routing traffic to your instance. We
     * recommend you de-register and then register your the new instance ID
     * with the load balancer after you restart your instance. To de-register
     * your instances from load balancer, use
     * <a>DeregisterInstancesFromLoadBalancer</a> action.</note>
     *
     * @return A list of instance IDs that should be registered with the
     *         LoadBalancer. <note>If you stop and then restart the instance, the
     *         instance ID changes. Elastic Load Balancing cannot recognize the new
     *         ID, which prevents it from routing traffic to your instance. We
     *         recommend you de-register and then register your the new instance ID
     *         with the load balancer after you restart your instance. To de-register
     *         your instances from load balancer, use
     *         <a>DeregisterInstancesFromLoadBalancer</a> action.</note>
     */
    public java.util.List<Instance> getInstances() {
        
        if (instances == null) {
            instances = new java.util.ArrayList<Instance>();
        }
        return instances;
    }
    
    /**
     * A list of instance IDs that should be registered with the
     * LoadBalancer. <note>If you stop and then restart the instance, the
     * instance ID changes. Elastic Load Balancing cannot recognize the new
     * ID, which prevents it from routing traffic to your instance. We
     * recommend you de-register and then register your the new instance ID
     * with the load balancer after you restart your instance. To de-register
     * your instances from load balancer, use
     * <a>DeregisterInstancesFromLoadBalancer</a> action.</note>
     *
     * @param instances A list of instance IDs that should be registered with the
     *         LoadBalancer. <note>If you stop and then restart the instance, the
     *         instance ID changes. Elastic Load Balancing cannot recognize the new
     *         ID, which prevents it from routing traffic to your instance. We
     *         recommend you de-register and then register your the new instance ID
     *         with the load balancer after you restart your instance. To de-register
     *         your instances from load balancer, use
     *         <a>DeregisterInstancesFromLoadBalancer</a> action.</note>
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
            return;
        }

        java.util.List<Instance> instancesCopy = new java.util.ArrayList<Instance>(instances.size());
        instancesCopy.addAll(instances);
        this.instances = instancesCopy;
    }
    
    /**
     * A list of instance IDs that should be registered with the
     * LoadBalancer. <note>If you stop and then restart the instance, the
     * instance ID changes. Elastic Load Balancing cannot recognize the new
     * ID, which prevents it from routing traffic to your instance. We
     * recommend you de-register and then register your the new instance ID
     * with the load balancer after you restart your instance. To de-register
     * your instances from load balancer, use
     * <a>DeregisterInstancesFromLoadBalancer</a> action.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances A list of instance IDs that should be registered with the
     *         LoadBalancer. <note>If you stop and then restart the instance, the
     *         instance ID changes. Elastic Load Balancing cannot recognize the new
     *         ID, which prevents it from routing traffic to your instance. We
     *         recommend you de-register and then register your the new instance ID
     *         with the load balancer after you restart your instance. To de-register
     *         your instances from load balancer, use
     *         <a>DeregisterInstancesFromLoadBalancer</a> action.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RegisterInstancesWithLoadBalancerRequest withInstances(Instance... instances) {
        if (getInstances() == null) setInstances(new java.util.ArrayList<Instance>(instances.length));
        for (Instance value : instances) {
            getInstances().add(value);
        }
        return this;
    }
    
    /**
     * A list of instance IDs that should be registered with the
     * LoadBalancer. <note>If you stop and then restart the instance, the
     * instance ID changes. Elastic Load Balancing cannot recognize the new
     * ID, which prevents it from routing traffic to your instance. We
     * recommend you de-register and then register your the new instance ID
     * with the load balancer after you restart your instance. To de-register
     * your instances from load balancer, use
     * <a>DeregisterInstancesFromLoadBalancer</a> action.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances A list of instance IDs that should be registered with the
     *         LoadBalancer. <note>If you stop and then restart the instance, the
     *         instance ID changes. Elastic Load Balancing cannot recognize the new
     *         ID, which prevents it from routing traffic to your instance. We
     *         recommend you de-register and then register your the new instance ID
     *         with the load balancer after you restart your instance. To de-register
     *         your instances from load balancer, use
     *         <a>DeregisterInstancesFromLoadBalancer</a> action.</note>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RegisterInstancesWithLoadBalancerRequest withInstances(java.util.Collection<Instance> instances) {
        if (instances == null) {
            this.instances = null;
        } else {
            java.util.List<Instance> instancesCopy = new java.util.ArrayList<Instance>(instances.size());
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
        if (loadBalancerName != null) sb.append("LoadBalancerName: " + loadBalancerName + ", ");
        if (instances != null) sb.append("Instances: " + instances + ", ");
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
    
        if (obj instanceof RegisterInstancesWithLoadBalancerRequest == false) return false;
        RegisterInstancesWithLoadBalancerRequest other = (RegisterInstancesWithLoadBalancerRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getInstances() == null ^ this.getInstances() == null) return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false) return false; 
        return true;
    }
    
}
    