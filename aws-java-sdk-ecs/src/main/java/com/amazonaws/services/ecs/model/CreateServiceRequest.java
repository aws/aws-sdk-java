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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.ecs.AmazonECS#createService(CreateServiceRequest) CreateService operation}.
 * <p>
 * Runs and maintains a desired number of tasks from a specified task
 * definition. If the number of tasks running in a service drops below
 * <code>desiredCount</code> , Amazon ECS will spawn another
 * instantiation of the task in the specified cluster.
 * </p>
 *
 * @see com.amazonaws.services.ecs.AmazonECS#createService(CreateServiceRequest)
 */
public class CreateServiceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * you want to run your service on. If you do not specify a cluster, the
     * default cluster is assumed.
     */
    private String cluster;

    /**
     * The name of your service. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed. Service names must be
     * unique within a cluster, but you can have similarly named services in
     * multiple clusters within a region or across multiple regions.
     */
    private String serviceName;

    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition that you want to run in your service. If a
     * <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used.
     */
    private String taskDefinition;

    /**
     * A list of load balancer objects, containing the load balancer name,
     * the container name (as it appears in a container definition), and the
     * container port to access from the load balancer.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancer> loadBalancers;

    /**
     * The number of instantiations of the specified task definition that you
     * would like to place and keep running on your cluster.
     */
    private Integer desiredCount;

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. Up to 32 ASCII characters are allowed.
     */
    private String clientToken;

    /**
     * The name or full Amazon Resource Name (ARN) of the IAM role that
     * allows your Amazon ECS container agent to make calls to your load
     * balancer on your behalf. This parameter is only required if you are
     * using a load balancer with your service.
     */
    private String role;

    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * you want to run your service on. If you do not specify a cluster, the
     * default cluster is assumed.
     *
     * @return The short name or full Amazon Resource Name (ARN) of the cluster that
     *         you want to run your service on. If you do not specify a cluster, the
     *         default cluster is assumed.
     */
    public String getCluster() {
        return cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * you want to run your service on. If you do not specify a cluster, the
     * default cluster is assumed.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         you want to run your service on. If you do not specify a cluster, the
     *         default cluster is assumed.
     */
    public void setCluster(String cluster) {
        this.cluster = cluster;
    }
    
    /**
     * The short name or full Amazon Resource Name (ARN) of the cluster that
     * you want to run your service on. If you do not specify a cluster, the
     * default cluster is assumed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param cluster The short name or full Amazon Resource Name (ARN) of the cluster that
     *         you want to run your service on. If you do not specify a cluster, the
     *         default cluster is assumed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateServiceRequest withCluster(String cluster) {
        this.cluster = cluster;
        return this;
    }

    /**
     * The name of your service. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed. Service names must be
     * unique within a cluster, but you can have similarly named services in
     * multiple clusters within a region or across multiple regions.
     *
     * @return The name of your service. Up to 255 letters (uppercase and lowercase),
     *         numbers, hyphens, and underscores are allowed. Service names must be
     *         unique within a cluster, but you can have similarly named services in
     *         multiple clusters within a region or across multiple regions.
     */
    public String getServiceName() {
        return serviceName;
    }
    
    /**
     * The name of your service. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed. Service names must be
     * unique within a cluster, but you can have similarly named services in
     * multiple clusters within a region or across multiple regions.
     *
     * @param serviceName The name of your service. Up to 255 letters (uppercase and lowercase),
     *         numbers, hyphens, and underscores are allowed. Service names must be
     *         unique within a cluster, but you can have similarly named services in
     *         multiple clusters within a region or across multiple regions.
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    
    /**
     * The name of your service. Up to 255 letters (uppercase and lowercase),
     * numbers, hyphens, and underscores are allowed. Service names must be
     * unique within a cluster, but you can have similarly named services in
     * multiple clusters within a region or across multiple regions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceName The name of your service. Up to 255 letters (uppercase and lowercase),
     *         numbers, hyphens, and underscores are allowed. Service names must be
     *         unique within a cluster, but you can have similarly named services in
     *         multiple clusters within a region or across multiple regions.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateServiceRequest withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition that you want to run in your service. If a
     * <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used.
     *
     * @return The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition that you want to run in your service. If a
     *         <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     *         revision is used.
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }
    
    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition that you want to run in your service. If a
     * <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used.
     *
     * @param taskDefinition The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition that you want to run in your service. If a
     *         <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     *         revision is used.
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }
    
    /**
     * The <code>family</code> and <code>revision</code>
     * (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     * the task definition that you want to run in your service. If a
     * <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskDefinition The <code>family</code> and <code>revision</code>
     *         (<code>family:revision</code>) or full Amazon Resource Name (ARN) of
     *         the task definition that you want to run in your service. If a
     *         <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     *         revision is used.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateServiceRequest withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    /**
     * A list of load balancer objects, containing the load balancer name,
     * the container name (as it appears in a container definition), and the
     * container port to access from the load balancer.
     *
     * @return A list of load balancer objects, containing the load balancer name,
     *         the container name (as it appears in a container definition), and the
     *         container port to access from the load balancer.
     */
    public java.util.List<LoadBalancer> getLoadBalancers() {
        if (loadBalancers == null) {
              loadBalancers = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancer>();
              loadBalancers.setAutoConstruct(true);
        }
        return loadBalancers;
    }
    
    /**
     * A list of load balancer objects, containing the load balancer name,
     * the container name (as it appears in a container definition), and the
     * container port to access from the load balancer.
     *
     * @param loadBalancers A list of load balancer objects, containing the load balancer name,
     *         the container name (as it appears in a container definition), and the
     *         container port to access from the load balancer.
     */
    public void setLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancer> loadBalancersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancer>(loadBalancers.size());
        loadBalancersCopy.addAll(loadBalancers);
        this.loadBalancers = loadBalancersCopy;
    }
    
    /**
     * A list of load balancer objects, containing the load balancer name,
     * the container name (as it appears in a container definition), and the
     * container port to access from the load balancer.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setLoadBalancers(java.util.Collection)} or {@link
     * #withLoadBalancers(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancers A list of load balancer objects, containing the load balancer name,
     *         the container name (as it appears in a container definition), and the
     *         container port to access from the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateServiceRequest withLoadBalancers(LoadBalancer... loadBalancers) {
        if (getLoadBalancers() == null) setLoadBalancers(new java.util.ArrayList<LoadBalancer>(loadBalancers.length));
        for (LoadBalancer value : loadBalancers) {
            getLoadBalancers().add(value);
        }
        return this;
    }
    
    /**
     * A list of load balancer objects, containing the load balancer name,
     * the container name (as it appears in a container definition), and the
     * container port to access from the load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancers A list of load balancer objects, containing the load balancer name,
     *         the container name (as it appears in a container definition), and the
     *         container port to access from the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateServiceRequest withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancer> loadBalancersCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancer>(loadBalancers.size());
            loadBalancersCopy.addAll(loadBalancers);
            this.loadBalancers = loadBalancersCopy;
        }

        return this;
    }

    /**
     * The number of instantiations of the specified task definition that you
     * would like to place and keep running on your cluster.
     *
     * @return The number of instantiations of the specified task definition that you
     *         would like to place and keep running on your cluster.
     */
    public Integer getDesiredCount() {
        return desiredCount;
    }
    
    /**
     * The number of instantiations of the specified task definition that you
     * would like to place and keep running on your cluster.
     *
     * @param desiredCount The number of instantiations of the specified task definition that you
     *         would like to place and keep running on your cluster.
     */
    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }
    
    /**
     * The number of instantiations of the specified task definition that you
     * would like to place and keep running on your cluster.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCount The number of instantiations of the specified task definition that you
     *         would like to place and keep running on your cluster.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateServiceRequest withDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
        return this;
    }

    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. Up to 32 ASCII characters are allowed.
     *
     * @return Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. Up to 32 ASCII characters are allowed.
     */
    public String getClientToken() {
        return clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. Up to 32 ASCII characters are allowed.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. Up to 32 ASCII characters are allowed.
     */
    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }
    
    /**
     * Unique, case-sensitive identifier you provide to ensure the
     * idempotency of the request. Up to 32 ASCII characters are allowed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clientToken Unique, case-sensitive identifier you provide to ensure the
     *         idempotency of the request. Up to 32 ASCII characters are allowed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateServiceRequest withClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }

    /**
     * The name or full Amazon Resource Name (ARN) of the IAM role that
     * allows your Amazon ECS container agent to make calls to your load
     * balancer on your behalf. This parameter is only required if you are
     * using a load balancer with your service.
     *
     * @return The name or full Amazon Resource Name (ARN) of the IAM role that
     *         allows your Amazon ECS container agent to make calls to your load
     *         balancer on your behalf. This parameter is only required if you are
     *         using a load balancer with your service.
     */
    public String getRole() {
        return role;
    }
    
    /**
     * The name or full Amazon Resource Name (ARN) of the IAM role that
     * allows your Amazon ECS container agent to make calls to your load
     * balancer on your behalf. This parameter is only required if you are
     * using a load balancer with your service.
     *
     * @param role The name or full Amazon Resource Name (ARN) of the IAM role that
     *         allows your Amazon ECS container agent to make calls to your load
     *         balancer on your behalf. This parameter is only required if you are
     *         using a load balancer with your service.
     */
    public void setRole(String role) {
        this.role = role;
    }
    
    /**
     * The name or full Amazon Resource Name (ARN) of the IAM role that
     * allows your Amazon ECS container agent to make calls to your load
     * balancer on your behalf. This parameter is only required if you are
     * using a load balancer with your service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param role The name or full Amazon Resource Name (ARN) of the IAM role that
     *         allows your Amazon ECS container agent to make calls to your load
     *         balancer on your behalf. This parameter is only required if you are
     *         using a load balancer with your service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public CreateServiceRequest withRole(String role) {
        this.role = role;
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
        if (getCluster() != null) sb.append("Cluster: " + getCluster() + ",");
        if (getServiceName() != null) sb.append("ServiceName: " + getServiceName() + ",");
        if (getTaskDefinition() != null) sb.append("TaskDefinition: " + getTaskDefinition() + ",");
        if (getLoadBalancers() != null) sb.append("LoadBalancers: " + getLoadBalancers() + ",");
        if (getDesiredCount() != null) sb.append("DesiredCount: " + getDesiredCount() + ",");
        if (getClientToken() != null) sb.append("ClientToken: " + getClientToken() + ",");
        if (getRole() != null) sb.append("Role: " + getRole() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode()); 
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode()); 
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode()); 
        hashCode = prime * hashCode + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode()); 
        hashCode = prime * hashCode + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode()); 
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode()); 
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof CreateServiceRequest == false) return false;
        CreateServiceRequest other = (CreateServiceRequest)obj;
        
        if (other.getCluster() == null ^ this.getCluster() == null) return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false) return false; 
        if (other.getServiceName() == null ^ this.getServiceName() == null) return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false) return false; 
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null) return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false) return false; 
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null) return false;
        if (other.getLoadBalancers() != null && other.getLoadBalancers().equals(this.getLoadBalancers()) == false) return false; 
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null) return false;
        if (other.getDesiredCount() != null && other.getDesiredCount().equals(this.getDesiredCount()) == false) return false; 
        if (other.getClientToken() == null ^ this.getClientToken() == null) return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false) return false; 
        if (other.getRole() == null ^ this.getRole() == null) return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false) return false; 
        return true;
    }
    
    @Override
    public CreateServiceRequest clone() {
        
            return (CreateServiceRequest) super.clone();
    }

}
    