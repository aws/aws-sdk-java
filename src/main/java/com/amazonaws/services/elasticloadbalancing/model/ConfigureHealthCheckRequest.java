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
 * <p>
 * 
 * </p>
 */
public class ConfigureHealthCheckRequest extends AmazonWebServiceRequest {
        
    /**
     * The mnemonic name associated with the LoadBalancer. This name must be
     * unique within the client AWS account.
     */
    private String loadBalancerName;

    /**
     * A structure containing the configuration information for the new
     * healthcheck.
     */
    private HealthCheck healthCheck;

    /**
     * The mnemonic name associated with the LoadBalancer. This name must be
     * unique within the client AWS account.
     *
     * @return The mnemonic name associated with the LoadBalancer. This name must be
     *         unique within the client AWS account.
     */
    public String getLoadBalancerName() {
        return loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the LoadBalancer. This name must be
     * unique within the client AWS account.
     *
     * @param loadBalancerName The mnemonic name associated with the LoadBalancer. This name must be
     *         unique within the client AWS account.
     */
    public void setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
    }
    
    /**
     * The mnemonic name associated with the LoadBalancer. This name must be
     * unique within the client AWS account.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancerName The mnemonic name associated with the LoadBalancer. This name must be
     *         unique within the client AWS account.
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
    
    
}
    