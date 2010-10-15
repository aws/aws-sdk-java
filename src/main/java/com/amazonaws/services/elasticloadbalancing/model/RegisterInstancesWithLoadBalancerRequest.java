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
package com.amazonaws.services.elasticloadbalancing.model;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#registerInstancesWithLoadBalancer(RegisterInstancesWithLoadBalancerRequest) RegisterInstancesWithLoadBalancer operation}.
 * <p>
 * Adds new instances to the LoadBalancer.
 * </p>
 * <p>
 * Once the instance is registered, it starts receiving traffic and
 * requests from the LoadBalancer. Any instance that is not in any of the
 * Availability Zones registered for the LoadBalancer will be moved to
 * the <i>OutOfService</i> state. It will move to the <i>InService</i>
 * state when the Availability Zone is added to the LoadBalancer.
 * </p>
 * <p>
 * <b>NOTE:</b> In order for this call to be successful, the client must
 * have created the LoadBalancer. The client must provide the same
 * account credentials as those that were used to create the
 * LoadBalancer.
 * </p>
 * <p>
 * <b>NOTE:</b> Completion of this API does not guarantee that operation
 * has completed. Rather, it means that the request has been registered
 * and the changes will happen shortly.
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
     * A list of instances IDs that should be registered with the
     * LoadBalancer.
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
     * @param instances A list of instances IDs that should be registered
     * with the LoadBalancer.
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
     * A list of instances IDs that should be registered with the
     * LoadBalancer.
     *
     * @return A list of instances IDs that should be registered with the
     *         LoadBalancer.
     */
    public java.util.List<Instance> getInstances() {
        if (instances == null) {
            instances = new java.util.ArrayList<Instance>();
        }
        return instances;
    }
    
    /**
     * A list of instances IDs that should be registered with the
     * LoadBalancer.
     *
     * @param instances A list of instances IDs that should be registered with the
     *         LoadBalancer.
     */
    public void setInstances(java.util.Collection<Instance> instances) {
        java.util.List<Instance> instancesCopy = new java.util.ArrayList<Instance>();
        if (instances != null) {
            instancesCopy.addAll(instances);
        }
        this.instances = instancesCopy;
    }
    
    /**
     * A list of instances IDs that should be registered with the
     * LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances A list of instances IDs that should be registered with the
     *         LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RegisterInstancesWithLoadBalancerRequest withInstances(Instance... instances) {
        for (Instance value : instances) {
            getInstances().add(value);
        }
        return this;
    }
    
    /**
     * A list of instances IDs that should be registered with the
     * LoadBalancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param instances A list of instances IDs that should be registered with the
     *         LoadBalancer.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public RegisterInstancesWithLoadBalancerRequest withInstances(java.util.Collection<Instance> instances) {
        java.util.List<Instance> instancesCopy = new java.util.ArrayList<Instance>();
        if (instances != null) {
            instancesCopy.addAll(instances);
        }
        this.instances = instancesCopy;

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
        sb.append("LoadBalancerName: " + loadBalancerName + ", ");
        sb.append("Instances: " + instances + ", ");
        sb.append("}");
        return sb.toString();
    }
    
}
    