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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest) RegisterInstancesWithLoadBalancer operation}.
 * <p>
 * Adds new instances to the load balancer.
 * </p>
 * <p>
 * Once the instance is registered, it starts receiving traffic and requests from the load balancer. Any instance that is not in any of the Availability
 * Zones registered for the load balancer will be moved to the <i>OutOfService</i> state. It will move to the <i>InService</i> state when the
 * Availability Zone is added to the load balancer.
 * </p>
 * <p>
 * When an instance registered with a load balancer is stopped and then restarted, the IP addresses associated with the instance changes. Elastic Load
 * Balancing cannot recognize the new IP address, which prevents it from routing traffic to the instances. We recommend that you de-register your Amazon
 * EC2 instances from your load balancer after you stop your instance, and then register the load balancer with your instance after you've restarted. To
 * de-register your instances from load balancer, use DeregisterInstancesFromLoadBalancer action.
 * </p>
 * <p>
 * For more information, see <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/US_DeReg_Reg_Instances.html"> De-register and
 * Register Amazon EC2 Instances </a> in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 * <p>
 * <b>NOTE:</b> In order for this call to be successful, you must provide the same account credentials as those that were used to create the load
 * balancer.
 * </p>
 * <p>
 * <b>NOTE:</b> Completion of this API does not guarantee that operation has completed. Rather, it means that the request has been registered and the
 * changes will happen shortly.
 * </p>
 * <p>
 * You can use DescribeLoadBalancers or DescribeInstanceHealth action to check the state of the newly registered instances.
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest)
 */
public class RegisterInstancesWithLoadBalancerRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name associated with the load balancer. The name must be unique
     * within your set of load balancers.
     */
    private String loadBalancerName;

    /**
     * A list of instance IDs that should be registered with the load
     * balancer.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Instance> instances;

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
     * @param loadBalancerName The name associated with the load balancer.
     * The name must be unique within your set of load balancers.
     * @param instances A list of instance IDs that should be registered with
     * the load balancer.
     */
    public RegisterInstancesWithLoadBalancerRequest(String loadBalancerName, java.util.List<Instance> instances) {
        setLoadBalancerName(loadBalancerName);
        setInstances(instances);
    }

    /**
     * The name associated with the load balancer. The name must be unique
     * within your set of load balancers.
     *
     * @return The name associated with the load balancer. The name must be unique
     *         within your set of load balancers.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The name associated with the load balancer. The name must be unique
     * within your set of load balancers.
     *
     * @param loadBalancerName The name associated with the load balancer. The name must be unique
     *         within your set of load balancers.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The name associated with the load balancer. The name must be unique
     * within your set of load balancers.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The name associated with the load balancer. The name must be unique
     *         within your set of load balancers.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterInstancesWithLoadBalancerRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * A list of instance IDs that should be registered with the load
     * balancer.
     *
     * @return A list of instance IDs that should be registered with the load
     *         balancer.
     */
    public java.util.List<Instance> getInstances() {
        if (instances == null) {
              instances = new com.amazonaws.internal.ListWithAutoConstructFlag<Instance>();
              instances.setAutoConstruct(true);
        }
        return instances;
    }
    
    /**
     * A list of instance IDs that should be registered with the load
     * balancer.
     *
     * @param instances A list of instance IDs that should be registered with the load
     *         balancer.
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
     * A list of instance IDs that should be registered with the load
     * balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances A list of instance IDs that should be registered with the load
     *         balancer.
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
     * A list of instance IDs that should be registered with the load
     * balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances A list of instance IDs that should be registered with the load
     *         balancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterInstancesWithLoadBalancerRequest withInstances(java.util.Collection<Instance> instances) {
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

        if (obj instanceof RegisterInstancesWithLoadBalancerRequest == false) return false;
        RegisterInstancesWithLoadBalancerRequest other = (RegisterInstancesWithLoadBalancerRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getInstances() == null ^ this.getInstances() == null) return false;
        if (other.getInstances() != null && other.getInstances().equals(this.getInstances()) == false) return false; 
        return true;
    }
    
}
    