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

/**
 * 
 */
public class Service implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) that identifies the service. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the service, the AWS account ID of the service owner, the
     * <code>service</code> namespace, and then the service name. For
     * example,
     * arn:aws:ecs:<i>region</i>:<i>012345678910</i>:service/<i>my-service</i>.
     */
    private String serviceArn;

    /**
     * A user-generated string that you can use to identify your service.
     */
    private String serviceName;

    /**
     * The Amazon Resource Name (ARN) of the of the cluster that hosts the
     * service.
     */
    private String clusterArn;

    /**
     * A list of load balancer objects, containing the load balancer name,
     * the container name (as it appears in a container definition), and the
     * container port to access from the load balancer.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<LoadBalancer> loadBalancers;

    /**
     * The status of the service. The valid values are <code>ACTIVE</code>,
     * <code>DRAINING</code>, or <code>INACTIVE</code>.
     */
    private String status;

    /**
     * The desired number of instantiations of the task definition to keep
     * running on the service. This value is specified when the service is
     * created with <a>CreateService</a>, and it can be modified with
     * <a>UpdateService</a>.
     */
    private Integer desiredCount;

    /**
     * The number of tasks in the cluster that are in the
     * <code>RUNNING</code> state.
     */
    private Integer runningCount;

    /**
     * The number of tasks in the cluster that are in the
     * <code>PENDING</code> state.
     */
    private Integer pendingCount;

    /**
     * The task definition to use for tasks in the service. This value is
     * specified when the service is created with <a>CreateService</a>, and
     * it can be modified with <a>UpdateService</a>.
     */
    private String taskDefinition;

    /**
     * The current state of deployments for the service.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Deployment> deployments;

    /**
     * The Amazon Resource Name (ARN) of the IAM role associated with the
     * service that allows the Amazon ECS container agent to register
     * container instances with a load balancer.
     */
    private String roleArn;

    /**
     * The event stream for your service. A maximum of 100 of the latest
     * events are displayed.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<ServiceEvent> events;

    /**
     * The Amazon Resource Name (ARN) that identifies the service. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the service, the AWS account ID of the service owner, the
     * <code>service</code> namespace, and then the service name. For
     * example,
     * arn:aws:ecs:<i>region</i>:<i>012345678910</i>:service/<i>my-service</i>.
     *
     * @return The Amazon Resource Name (ARN) that identifies the service. The ARN
     *         contains the <code>arn:aws:ecs</code> namespace, followed by the
     *         region of the service, the AWS account ID of the service owner, the
     *         <code>service</code> namespace, and then the service name. For
     *         example,
     *         arn:aws:ecs:<i>region</i>:<i>012345678910</i>:service/<i>my-service</i>.
     */
    public String getServiceArn() {
        return serviceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) that identifies the service. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the service, the AWS account ID of the service owner, the
     * <code>service</code> namespace, and then the service name. For
     * example,
     * arn:aws:ecs:<i>region</i>:<i>012345678910</i>:service/<i>my-service</i>.
     *
     * @param serviceArn The Amazon Resource Name (ARN) that identifies the service. The ARN
     *         contains the <code>arn:aws:ecs</code> namespace, followed by the
     *         region of the service, the AWS account ID of the service owner, the
     *         <code>service</code> namespace, and then the service name. For
     *         example,
     *         arn:aws:ecs:<i>region</i>:<i>012345678910</i>:service/<i>my-service</i>.
     */
    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) that identifies the service. The ARN
     * contains the <code>arn:aws:ecs</code> namespace, followed by the
     * region of the service, the AWS account ID of the service owner, the
     * <code>service</code> namespace, and then the service name. For
     * example,
     * arn:aws:ecs:<i>region</i>:<i>012345678910</i>:service/<i>my-service</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceArn The Amazon Resource Name (ARN) that identifies the service. The ARN
     *         contains the <code>arn:aws:ecs</code> namespace, followed by the
     *         region of the service, the AWS account ID of the service owner, the
     *         <code>service</code> namespace, and then the service name. For
     *         example,
     *         arn:aws:ecs:<i>region</i>:<i>012345678910</i>:service/<i>my-service</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Service withServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
        return this;
    }

    /**
     * A user-generated string that you can use to identify your service.
     *
     * @return A user-generated string that you can use to identify your service.
     */
    public String getServiceName() {
        return serviceName;
    }
    
    /**
     * A user-generated string that you can use to identify your service.
     *
     * @param serviceName A user-generated string that you can use to identify your service.
     */
    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }
    
    /**
     * A user-generated string that you can use to identify your service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param serviceName A user-generated string that you can use to identify your service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Service withServiceName(String serviceName) {
        this.serviceName = serviceName;
        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the of the cluster that hosts the
     * service.
     *
     * @return The Amazon Resource Name (ARN) of the of the cluster that hosts the
     *         service.
     */
    public String getClusterArn() {
        return clusterArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the of the cluster that hosts the
     * service.
     *
     * @param clusterArn The Amazon Resource Name (ARN) of the of the cluster that hosts the
     *         service.
     */
    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the of the cluster that hosts the
     * service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param clusterArn The Amazon Resource Name (ARN) of the of the cluster that hosts the
     *         service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Service withClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
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
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param loadBalancers A list of load balancer objects, containing the load balancer name,
     *         the container name (as it appears in a container definition), and the
     *         container port to access from the load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Service withLoadBalancers(LoadBalancer... loadBalancers) {
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
    public Service withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
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
     * The status of the service. The valid values are <code>ACTIVE</code>,
     * <code>DRAINING</code>, or <code>INACTIVE</code>.
     *
     * @return The status of the service. The valid values are <code>ACTIVE</code>,
     *         <code>DRAINING</code>, or <code>INACTIVE</code>.
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The status of the service. The valid values are <code>ACTIVE</code>,
     * <code>DRAINING</code>, or <code>INACTIVE</code>.
     *
     * @param status The status of the service. The valid values are <code>ACTIVE</code>,
     *         <code>DRAINING</code>, or <code>INACTIVE</code>.
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The status of the service. The valid values are <code>ACTIVE</code>,
     * <code>DRAINING</code>, or <code>INACTIVE</code>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param status The status of the service. The valid values are <code>ACTIVE</code>,
     *         <code>DRAINING</code>, or <code>INACTIVE</code>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Service withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The desired number of instantiations of the task definition to keep
     * running on the service. This value is specified when the service is
     * created with <a>CreateService</a>, and it can be modified with
     * <a>UpdateService</a>.
     *
     * @return The desired number of instantiations of the task definition to keep
     *         running on the service. This value is specified when the service is
     *         created with <a>CreateService</a>, and it can be modified with
     *         <a>UpdateService</a>.
     */
    public Integer getDesiredCount() {
        return desiredCount;
    }
    
    /**
     * The desired number of instantiations of the task definition to keep
     * running on the service. This value is specified when the service is
     * created with <a>CreateService</a>, and it can be modified with
     * <a>UpdateService</a>.
     *
     * @param desiredCount The desired number of instantiations of the task definition to keep
     *         running on the service. This value is specified when the service is
     *         created with <a>CreateService</a>, and it can be modified with
     *         <a>UpdateService</a>.
     */
    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }
    
    /**
     * The desired number of instantiations of the task definition to keep
     * running on the service. This value is specified when the service is
     * created with <a>CreateService</a>, and it can be modified with
     * <a>UpdateService</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param desiredCount The desired number of instantiations of the task definition to keep
     *         running on the service. This value is specified when the service is
     *         created with <a>CreateService</a>, and it can be modified with
     *         <a>UpdateService</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Service withDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
        return this;
    }

    /**
     * The number of tasks in the cluster that are in the
     * <code>RUNNING</code> state.
     *
     * @return The number of tasks in the cluster that are in the
     *         <code>RUNNING</code> state.
     */
    public Integer getRunningCount() {
        return runningCount;
    }
    
    /**
     * The number of tasks in the cluster that are in the
     * <code>RUNNING</code> state.
     *
     * @param runningCount The number of tasks in the cluster that are in the
     *         <code>RUNNING</code> state.
     */
    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }
    
    /**
     * The number of tasks in the cluster that are in the
     * <code>RUNNING</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param runningCount The number of tasks in the cluster that are in the
     *         <code>RUNNING</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Service withRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * The number of tasks in the cluster that are in the
     * <code>PENDING</code> state.
     *
     * @return The number of tasks in the cluster that are in the
     *         <code>PENDING</code> state.
     */
    public Integer getPendingCount() {
        return pendingCount;
    }
    
    /**
     * The number of tasks in the cluster that are in the
     * <code>PENDING</code> state.
     *
     * @param pendingCount The number of tasks in the cluster that are in the
     *         <code>PENDING</code> state.
     */
    public void setPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
    }
    
    /**
     * The number of tasks in the cluster that are in the
     * <code>PENDING</code> state.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param pendingCount The number of tasks in the cluster that are in the
     *         <code>PENDING</code> state.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Service withPendingCount(Integer pendingCount) {
        this.pendingCount = pendingCount;
        return this;
    }

    /**
     * The task definition to use for tasks in the service. This value is
     * specified when the service is created with <a>CreateService</a>, and
     * it can be modified with <a>UpdateService</a>.
     *
     * @return The task definition to use for tasks in the service. This value is
     *         specified when the service is created with <a>CreateService</a>, and
     *         it can be modified with <a>UpdateService</a>.
     */
    public String getTaskDefinition() {
        return taskDefinition;
    }
    
    /**
     * The task definition to use for tasks in the service. This value is
     * specified when the service is created with <a>CreateService</a>, and
     * it can be modified with <a>UpdateService</a>.
     *
     * @param taskDefinition The task definition to use for tasks in the service. This value is
     *         specified when the service is created with <a>CreateService</a>, and
     *         it can be modified with <a>UpdateService</a>.
     */
    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }
    
    /**
     * The task definition to use for tasks in the service. This value is
     * specified when the service is created with <a>CreateService</a>, and
     * it can be modified with <a>UpdateService</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskDefinition The task definition to use for tasks in the service. This value is
     *         specified when the service is created with <a>CreateService</a>, and
     *         it can be modified with <a>UpdateService</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Service withTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
        return this;
    }

    /**
     * The current state of deployments for the service.
     *
     * @return The current state of deployments for the service.
     */
    public java.util.List<Deployment> getDeployments() {
        if (deployments == null) {
              deployments = new com.amazonaws.internal.ListWithAutoConstructFlag<Deployment>();
              deployments.setAutoConstruct(true);
        }
        return deployments;
    }
    
    /**
     * The current state of deployments for the service.
     *
     * @param deployments The current state of deployments for the service.
     */
    public void setDeployments(java.util.Collection<Deployment> deployments) {
        if (deployments == null) {
            this.deployments = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Deployment> deploymentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Deployment>(deployments.size());
        deploymentsCopy.addAll(deployments);
        this.deployments = deploymentsCopy;
    }
    
    /**
     * The current state of deployments for the service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deployments The current state of deployments for the service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Service withDeployments(Deployment... deployments) {
        if (getDeployments() == null) setDeployments(new java.util.ArrayList<Deployment>(deployments.length));
        for (Deployment value : deployments) {
            getDeployments().add(value);
        }
        return this;
    }
    
    /**
     * The current state of deployments for the service.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deployments The current state of deployments for the service.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Service withDeployments(java.util.Collection<Deployment> deployments) {
        if (deployments == null) {
            this.deployments = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Deployment> deploymentsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Deployment>(deployments.size());
            deploymentsCopy.addAll(deployments);
            this.deployments = deploymentsCopy;
        }

        return this;
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role associated with the
     * service that allows the Amazon ECS container agent to register
     * container instances with a load balancer.
     *
     * @return The Amazon Resource Name (ARN) of the IAM role associated with the
     *         service that allows the Amazon ECS container agent to register
     *         container instances with a load balancer.
     */
    public String getRoleArn() {
        return roleArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM role associated with the
     * service that allows the Amazon ECS container agent to register
     * container instances with a load balancer.
     *
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role associated with the
     *         service that allows the Amazon ECS container agent to register
     *         container instances with a load balancer.
     */
    public void setRoleArn(String roleArn) {
        this.roleArn = roleArn;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the IAM role associated with the
     * service that allows the Amazon ECS container agent to register
     * container instances with a load balancer.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role associated with the
     *         service that allows the Amazon ECS container agent to register
     *         container instances with a load balancer.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Service withRoleArn(String roleArn) {
        this.roleArn = roleArn;
        return this;
    }

    /**
     * The event stream for your service. A maximum of 100 of the latest
     * events are displayed.
     *
     * @return The event stream for your service. A maximum of 100 of the latest
     *         events are displayed.
     */
    public java.util.List<ServiceEvent> getEvents() {
        if (events == null) {
              events = new com.amazonaws.internal.ListWithAutoConstructFlag<ServiceEvent>();
              events.setAutoConstruct(true);
        }
        return events;
    }
    
    /**
     * The event stream for your service. A maximum of 100 of the latest
     * events are displayed.
     *
     * @param events The event stream for your service. A maximum of 100 of the latest
     *         events are displayed.
     */
    public void setEvents(java.util.Collection<ServiceEvent> events) {
        if (events == null) {
            this.events = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<ServiceEvent> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ServiceEvent>(events.size());
        eventsCopy.addAll(events);
        this.events = eventsCopy;
    }
    
    /**
     * The event stream for your service. A maximum of 100 of the latest
     * events are displayed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events The event stream for your service. A maximum of 100 of the latest
     *         events are displayed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Service withEvents(ServiceEvent... events) {
        if (getEvents() == null) setEvents(new java.util.ArrayList<ServiceEvent>(events.length));
        for (ServiceEvent value : events) {
            getEvents().add(value);
        }
        return this;
    }
    
    /**
     * The event stream for your service. A maximum of 100 of the latest
     * events are displayed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param events The event stream for your service. A maximum of 100 of the latest
     *         events are displayed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public Service withEvents(java.util.Collection<ServiceEvent> events) {
        if (events == null) {
            this.events = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<ServiceEvent> eventsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<ServiceEvent>(events.size());
            eventsCopy.addAll(events);
            this.events = eventsCopy;
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
        if (getServiceArn() != null) sb.append("ServiceArn: " + getServiceArn() + ",");
        if (getServiceName() != null) sb.append("ServiceName: " + getServiceName() + ",");
        if (getClusterArn() != null) sb.append("ClusterArn: " + getClusterArn() + ",");
        if (getLoadBalancers() != null) sb.append("LoadBalancers: " + getLoadBalancers() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getDesiredCount() != null) sb.append("DesiredCount: " + getDesiredCount() + ",");
        if (getRunningCount() != null) sb.append("RunningCount: " + getRunningCount() + ",");
        if (getPendingCount() != null) sb.append("PendingCount: " + getPendingCount() + ",");
        if (getTaskDefinition() != null) sb.append("TaskDefinition: " + getTaskDefinition() + ",");
        if (getDeployments() != null) sb.append("Deployments: " + getDeployments() + ",");
        if (getRoleArn() != null) sb.append("RoleArn: " + getRoleArn() + ",");
        if (getEvents() != null) sb.append("Events: " + getEvents() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode()); 
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode()); 
        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode()); 
        hashCode = prime * hashCode + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode()); 
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode()); 
        hashCode = prime * hashCode + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode()); 
        hashCode = prime * hashCode + ((getRunningCount() == null) ? 0 : getRunningCount().hashCode()); 
        hashCode = prime * hashCode + ((getPendingCount() == null) ? 0 : getPendingCount().hashCode()); 
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode()); 
        hashCode = prime * hashCode + ((getDeployments() == null) ? 0 : getDeployments().hashCode()); 
        hashCode = prime * hashCode + ((getRoleArn() == null) ? 0 : getRoleArn().hashCode()); 
        hashCode = prime * hashCode + ((getEvents() == null) ? 0 : getEvents().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof Service == false) return false;
        Service other = (Service)obj;
        
        if (other.getServiceArn() == null ^ this.getServiceArn() == null) return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false) return false; 
        if (other.getServiceName() == null ^ this.getServiceName() == null) return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false) return false; 
        if (other.getClusterArn() == null ^ this.getClusterArn() == null) return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false) return false; 
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null) return false;
        if (other.getLoadBalancers() != null && other.getLoadBalancers().equals(this.getLoadBalancers()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null) return false;
        if (other.getDesiredCount() != null && other.getDesiredCount().equals(this.getDesiredCount()) == false) return false; 
        if (other.getRunningCount() == null ^ this.getRunningCount() == null) return false;
        if (other.getRunningCount() != null && other.getRunningCount().equals(this.getRunningCount()) == false) return false; 
        if (other.getPendingCount() == null ^ this.getPendingCount() == null) return false;
        if (other.getPendingCount() != null && other.getPendingCount().equals(this.getPendingCount()) == false) return false; 
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null) return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false) return false; 
        if (other.getDeployments() == null ^ this.getDeployments() == null) return false;
        if (other.getDeployments() != null && other.getDeployments().equals(this.getDeployments()) == false) return false; 
        if (other.getRoleArn() == null ^ this.getRoleArn() == null) return false;
        if (other.getRoleArn() != null && other.getRoleArn().equals(this.getRoleArn()) == false) return false; 
        if (other.getEvents() == null ^ this.getEvents() == null) return false;
        if (other.getEvents() != null && other.getEvents().equals(this.getEvents()) == false) return false; 
        return true;
    }
    
    @Override
    public Service clone() {
        try {
            return (Service) super.clone();
        
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(
                    "Got a CloneNotSupportedException from Object.clone() "
                    + "even though we're Cloneable!",
                    e);
        }
        
    }

}
    