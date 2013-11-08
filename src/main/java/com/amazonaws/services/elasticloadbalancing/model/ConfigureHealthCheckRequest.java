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
 * Container for the parameters to the {@link com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#configureHealthCheck(ConfigureHealthCheckRequest) ConfigureHealthCheck operation}.
 * <p>
 * Specifies the health check settings to use for evaluating the health state of your back-end instances.
 * </p>
 * <p>
 * For more information, see <a href="http://docs.aws.amazon.com/ElasticLoadBalancing/latest/DeveloperGuide/TerminologyandKeyConcepts.html#healthcheck">
 * Health Check </a> in the <i>Elastic Load Balancing Developer Guide</i> .
 * </p>
 *
 * @see com.amazonaws.services.elasticloadbalancing.AmazonElasticLoadBalancing#configureHealthCheck(ConfigureHealthCheckRequest)
 */
public class ConfigureHealthCheckRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The mnemonic name associated with the load balancer. The name must be
     * unique within the set of load balancers associated with your AWS
     * account.
     */
    private String loadBalancerName;

    /**
     * A structure containing the configuration information for the new
     * healthcheck.
     */
    private HealthCheck healthCheck;

    /**
     * Default constructor for a new ConfigureHealthCheckRequest object.  Callers should use the
     * setter or fluent setter (with...) methods to initialize this object after creating it.
     */
    public ConfigureHealthCheckRequest() {}
    
    /**
     * Constructs a new ConfigureHealthCheckRequest object.
     * Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param loadBalancerName The mnemonic name associated with the load
     * balancer. The name must be unique within the set of load balancers
     * associated with your AWS account.
     * @param healthCheck A structure containing the configuration
     * information for the new healthcheck.
     */
    public ConfigureHealthCheckRequest(String loadBalancerName, HealthCheck healthCheck) {
        setLoadBalancerName(loadBalancerName);
        setHealthCheck(healthCheck);
    }

    /**
     * The mnemonic name associated with the load balancer. The name must be
     * unique within the set of load balancers associated with your AWS
     * account.
     *
     * @return The mnemonic name associated with the load balancer. The name must be
     *         unique within the set of load balancers associated with your AWS
     *         account.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the load balancer. The name must be
     * unique within the set of load balancers associated with your AWS
     * account.
     *
     * @param loadBalancerName The mnemonic name associated with the load balancer. The name must be
     *         unique within the set of load balancers associated with your AWS
     *         account.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the load balancer. The name must be
     * unique within the set of load balancers associated with your AWS
     * account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The mnemonic name associated with the load balancer. The name must be
     *         unique within the set of load balancers associated with your AWS
     *         account.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigureHealthCheckRequest withLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }

    /**
     * A structure containing the configuration information for the new
     * healthcheck.
     *
     * @return A structure containing the configuration information for the new
     *         healthcheck.
     */
    public HealthCheck getHealthCheck() {
        return healthCheck;
    }
    
    /**
     * A structure containing the configuration information for the new
     * healthcheck.
     *
     * @param healthCheck A structure containing the configuration information for the new
     *         healthcheck.
     */
    public void setHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
    }
    
    /**
     * A structure containing the configuration information for the new
     * healthcheck.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param healthCheck A structure containing the configuration information for the new
     *         healthcheck.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ConfigureHealthCheckRequest withHealthCheck(HealthCheck healthCheck) {
        this.healthCheck = healthCheck;
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
        if (getHealthCheck() != null) sb.append("HealthCheck: " + getHealthCheck() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getLoadBalancerName() == null) ? 0 : getLoadBalancerName().hashCode()); 
        hashCode = prime * hashCode + ((getHealthCheck() == null) ? 0 : getHealthCheck().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ConfigureHealthCheckRequest == false) return false;
        ConfigureHealthCheckRequest other = (ConfigureHealthCheckRequest)obj;
        
        if (other.getLoadBalancerName() == null ^ this.getLoadBalancerName() == null) return false;
        if (other.getLoadBalancerName() != null && other.getLoadBalancerName().equals(this.getLoadBalancerName()) == false) return false; 
        if (other.getHealthCheck() == null ^ this.getHealthCheck() == null) return false;
        if (other.getHealthCheck() != null && other.getHealthCheck().equals(this.getHealthCheck()) == false) return false; 
        return true;
    }
    
}
    