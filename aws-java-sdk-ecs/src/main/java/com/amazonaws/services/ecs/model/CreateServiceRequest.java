/*
 * Copyright 2012-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/CreateService" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateServiceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your service. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. Service names must be unique within a cluster, but you can have similarly named services in multiple
     * clusters within a region or across multiple regions.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run in your service. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used.
     * </p>
     */
    private String taskDefinition;
    /**
     * <p>
     * A load balancer object representing the load balancer to use with your service. Currently, you are limited to one
     * load balancer or target group per service. After you create a service, the load balancer name or target group
     * ARN, container name, and container port specified in the service definition are immutable.
     * </p>
     * <p>
     * For Classic Load Balancers, this object must contain the load balancer name, the container name (as it appears in
     * a container definition), and the container port to access from the load balancer. When a task from this service
     * is placed on a container instance, the container instance is registered with the load balancer specified here.
     * </p>
     * <p>
     * For Application Load Balancers and Network Load Balancers, this object must contain the load balancer target
     * group ARN, the container name (as it appears in a container definition), and the container port to access from
     * the load balancer. When a task from this service is placed on a container instance, the container instance and
     * port combination is registered as a target in the target group specified here.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LoadBalancer> loadBalancers;
    /**
     * <p>
     * The number of instantiations of the specified task definition to place and keep running on your cluster.
     * </p>
     */
    private Integer desiredCount;
    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. Up to 32 ASCII characters
     * are allowed.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The launch type on which to run your service.
     * </p>
     */
    private String launchType;
    /**
     * <p>
     * The platform version on which to run your service. If one is not specified, the latest version is used by
     * default.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon ECS to make calls to your load
     * balancer on your behalf. This parameter is only permitted if you are using a load balancer with your service and
     * your task definition does not use the <code>awsvpc</code> network mode. If you specify the <code>role</code>
     * parameter, you must also specify a load balancer object with the <code>loadBalancers</code> parameter.
     * </p>
     * <important>
     * <p>
     * If your account has already created the Amazon ECS service-linked role, that role is used by default for your
     * service unless you specify a role here. The service-linked role is required if your task definition uses the
     * <code>awsvpc</code> network mode, in which case you should not specify a role here. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * If your specified role has a path other than <code>/</code>, then you must either specify the full role ARN (this
     * is recommended) or prefix the role name with the path. For example, if a role with the name <code>bar</code> has
     * a path of <code>/foo/</code> then you would specify <code>/foo/bar</code> as the role name. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     * >Friendly Names and Paths</a> in the <i>IAM User Guide</i>.
     * </p>
     */
    private String role;
    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     */
    private DeploymentConfiguration deploymentConfiguration;
    /**
     * <p>
     * An array of placement constraint objects to use for tasks in your service. You can specify a maximum of 10
     * constraints per task (this limit includes constraints in the task definition and those specified at run time).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlacementConstraint> placementConstraints;
    /**
     * <p>
     * The placement strategy objects to use for tasks in your service. You can specify a maximum of five strategy rules
     * per service.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlacementStrategy> placementStrategy;
    /**
     * <p>
     * The network configuration for the service. This parameter is required for task definitions that use the
     * <code>awsvpc</code> network mode to receive their own Elastic Network Interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     * Balancing target health checks after a task has first started. This is only valid if your service is configured
     * to use a load balancer. If your service's tasks take a while to start and respond to ELB health checks, you can
     * specify a health check grace period of up to 1,800 seconds during which the ECS service scheduler will ignore ELB
     * health check status. This grace period can prevent the ECS service scheduler from marking tasks as unhealthy and
     * stopping them before they have time to come up.
     * </p>
     */
    private Integer healthCheckGracePeriodSeconds;

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your service. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster on which to run your service. If you do
     *        not specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your service. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster on which to run your service. If you do
     *         not specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your service. If you do not
     * specify a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster on which to run your service. If you do
     *        not specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. Service names must be unique within a cluster, but you can have similarly named services in multiple
     * clusters within a region or across multiple regions.
     * </p>
     * 
     * @param serviceName
     *        The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     *        are allowed. Service names must be unique within a cluster, but you can have similarly named services in
     *        multiple clusters within a region or across multiple regions.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. Service names must be unique within a cluster, but you can have similarly named services in multiple
     * clusters within a region or across multiple regions.
     * </p>
     * 
     * @return The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     *         are allowed. Service names must be unique within a cluster, but you can have similarly named services in
     *         multiple clusters within a region or across multiple regions.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. Service names must be unique within a cluster, but you can have similarly named services in multiple
     * clusters within a region or across multiple regions.
     * </p>
     * 
     * @param serviceName
     *        The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     *        are allowed. Service names must be unique within a cluster, but you can have similarly named services in
     *        multiple clusters within a region or across multiple regions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run in your service. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *        definition to run in your service. If a <code>revision</code> is not specified, the latest
     *        <code>ACTIVE</code> revision is used.
     */

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run in your service. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used.
     * </p>
     * 
     * @return The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *         definition to run in your service. If a <code>revision</code> is not specified, the latest
     *         <code>ACTIVE</code> revision is used.
     */

    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run in your service. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *        definition to run in your service. If a <code>revision</code> is not specified, the latest
     *        <code>ACTIVE</code> revision is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTaskDefinition(String taskDefinition) {
        setTaskDefinition(taskDefinition);
        return this;
    }

    /**
     * <p>
     * A load balancer object representing the load balancer to use with your service. Currently, you are limited to one
     * load balancer or target group per service. After you create a service, the load balancer name or target group
     * ARN, container name, and container port specified in the service definition are immutable.
     * </p>
     * <p>
     * For Classic Load Balancers, this object must contain the load balancer name, the container name (as it appears in
     * a container definition), and the container port to access from the load balancer. When a task from this service
     * is placed on a container instance, the container instance is registered with the load balancer specified here.
     * </p>
     * <p>
     * For Application Load Balancers and Network Load Balancers, this object must contain the load balancer target
     * group ARN, the container name (as it appears in a container definition), and the container port to access from
     * the load balancer. When a task from this service is placed on a container instance, the container instance and
     * port combination is registered as a target in the target group specified here.
     * </p>
     * 
     * @return A load balancer object representing the load balancer to use with your service. Currently, you are
     *         limited to one load balancer or target group per service. After you create a service, the load balancer
     *         name or target group ARN, container name, and container port specified in the service definition are
     *         immutable.</p>
     *         <p>
     *         For Classic Load Balancers, this object must contain the load balancer name, the container name (as it
     *         appears in a container definition), and the container port to access from the load balancer. When a task
     *         from this service is placed on a container instance, the container instance is registered with the load
     *         balancer specified here.
     *         </p>
     *         <p>
     *         For Application Load Balancers and Network Load Balancers, this object must contain the load balancer
     *         target group ARN, the container name (as it appears in a container definition), and the container port to
     *         access from the load balancer. When a task from this service is placed on a container instance, the
     *         container instance and port combination is registered as a target in the target group specified here.
     */

    public java.util.List<LoadBalancer> getLoadBalancers() {
        if (loadBalancers == null) {
            loadBalancers = new com.amazonaws.internal.SdkInternalList<LoadBalancer>();
        }
        return loadBalancers;
    }

    /**
     * <p>
     * A load balancer object representing the load balancer to use with your service. Currently, you are limited to one
     * load balancer or target group per service. After you create a service, the load balancer name or target group
     * ARN, container name, and container port specified in the service definition are immutable.
     * </p>
     * <p>
     * For Classic Load Balancers, this object must contain the load balancer name, the container name (as it appears in
     * a container definition), and the container port to access from the load balancer. When a task from this service
     * is placed on a container instance, the container instance is registered with the load balancer specified here.
     * </p>
     * <p>
     * For Application Load Balancers and Network Load Balancers, this object must contain the load balancer target
     * group ARN, the container name (as it appears in a container definition), and the container port to access from
     * the load balancer. When a task from this service is placed on a container instance, the container instance and
     * port combination is registered as a target in the target group specified here.
     * </p>
     * 
     * @param loadBalancers
     *        A load balancer object representing the load balancer to use with your service. Currently, you are limited
     *        to one load balancer or target group per service. After you create a service, the load balancer name or
     *        target group ARN, container name, and container port specified in the service definition are
     *        immutable.</p>
     *        <p>
     *        For Classic Load Balancers, this object must contain the load balancer name, the container name (as it
     *        appears in a container definition), and the container port to access from the load balancer. When a task
     *        from this service is placed on a container instance, the container instance is registered with the load
     *        balancer specified here.
     *        </p>
     *        <p>
     *        For Application Load Balancers and Network Load Balancers, this object must contain the load balancer
     *        target group ARN, the container name (as it appears in a container definition), and the container port to
     *        access from the load balancer. When a task from this service is placed on a container instance, the
     *        container instance and port combination is registered as a target in the target group specified here.
     */

    public void setLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }

        this.loadBalancers = new com.amazonaws.internal.SdkInternalList<LoadBalancer>(loadBalancers);
    }

    /**
     * <p>
     * A load balancer object representing the load balancer to use with your service. Currently, you are limited to one
     * load balancer or target group per service. After you create a service, the load balancer name or target group
     * ARN, container name, and container port specified in the service definition are immutable.
     * </p>
     * <p>
     * For Classic Load Balancers, this object must contain the load balancer name, the container name (as it appears in
     * a container definition), and the container port to access from the load balancer. When a task from this service
     * is placed on a container instance, the container instance is registered with the load balancer specified here.
     * </p>
     * <p>
     * For Application Load Balancers and Network Load Balancers, this object must contain the load balancer target
     * group ARN, the container name (as it appears in a container definition), and the container port to access from
     * the load balancer. When a task from this service is placed on a container instance, the container instance and
     * port combination is registered as a target in the target group specified here.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancers(java.util.Collection)} or {@link #withLoadBalancers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param loadBalancers
     *        A load balancer object representing the load balancer to use with your service. Currently, you are limited
     *        to one load balancer or target group per service. After you create a service, the load balancer name or
     *        target group ARN, container name, and container port specified in the service definition are
     *        immutable.</p>
     *        <p>
     *        For Classic Load Balancers, this object must contain the load balancer name, the container name (as it
     *        appears in a container definition), and the container port to access from the load balancer. When a task
     *        from this service is placed on a container instance, the container instance is registered with the load
     *        balancer specified here.
     *        </p>
     *        <p>
     *        For Application Load Balancers and Network Load Balancers, this object must contain the load balancer
     *        target group ARN, the container name (as it appears in a container definition), and the container port to
     *        access from the load balancer. When a task from this service is placed on a container instance, the
     *        container instance and port combination is registered as a target in the target group specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withLoadBalancers(LoadBalancer... loadBalancers) {
        if (this.loadBalancers == null) {
            setLoadBalancers(new com.amazonaws.internal.SdkInternalList<LoadBalancer>(loadBalancers.length));
        }
        for (LoadBalancer ele : loadBalancers) {
            this.loadBalancers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A load balancer object representing the load balancer to use with your service. Currently, you are limited to one
     * load balancer or target group per service. After you create a service, the load balancer name or target group
     * ARN, container name, and container port specified in the service definition are immutable.
     * </p>
     * <p>
     * For Classic Load Balancers, this object must contain the load balancer name, the container name (as it appears in
     * a container definition), and the container port to access from the load balancer. When a task from this service
     * is placed on a container instance, the container instance is registered with the load balancer specified here.
     * </p>
     * <p>
     * For Application Load Balancers and Network Load Balancers, this object must contain the load balancer target
     * group ARN, the container name (as it appears in a container definition), and the container port to access from
     * the load balancer. When a task from this service is placed on a container instance, the container instance and
     * port combination is registered as a target in the target group specified here.
     * </p>
     * 
     * @param loadBalancers
     *        A load balancer object representing the load balancer to use with your service. Currently, you are limited
     *        to one load balancer or target group per service. After you create a service, the load balancer name or
     *        target group ARN, container name, and container port specified in the service definition are
     *        immutable.</p>
     *        <p>
     *        For Classic Load Balancers, this object must contain the load balancer name, the container name (as it
     *        appears in a container definition), and the container port to access from the load balancer. When a task
     *        from this service is placed on a container instance, the container instance is registered with the load
     *        balancer specified here.
     *        </p>
     *        <p>
     *        For Application Load Balancers and Network Load Balancers, this object must contain the load balancer
     *        target group ARN, the container name (as it appears in a container definition), and the container port to
     *        access from the load balancer. When a task from this service is placed on a container instance, the
     *        container instance and port combination is registered as a target in the target group specified here.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        setLoadBalancers(loadBalancers);
        return this;
    }

    /**
     * <p>
     * The number of instantiations of the specified task definition to place and keep running on your cluster.
     * </p>
     * 
     * @param desiredCount
     *        The number of instantiations of the specified task definition to place and keep running on your cluster.
     */

    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }

    /**
     * <p>
     * The number of instantiations of the specified task definition to place and keep running on your cluster.
     * </p>
     * 
     * @return The number of instantiations of the specified task definition to place and keep running on your cluster.
     */

    public Integer getDesiredCount() {
        return this.desiredCount;
    }

    /**
     * <p>
     * The number of instantiations of the specified task definition to place and keep running on your cluster.
     * </p>
     * 
     * @param desiredCount
     *        The number of instantiations of the specified task definition to place and keep running on your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withDesiredCount(Integer desiredCount) {
        setDesiredCount(desiredCount);
        return this;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. Up to 32 ASCII characters
     * are allowed.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. Up to 32 ASCII
     *        characters are allowed.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. Up to 32 ASCII characters
     * are allowed.
     * </p>
     * 
     * @return Unique, case-sensitive identifier you provide to ensure the idempotency of the request. Up to 32 ASCII
     *         characters are allowed.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier you provide to ensure the idempotency of the request. Up to 32 ASCII characters
     * are allowed.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier you provide to ensure the idempotency of the request. Up to 32 ASCII
     *        characters are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The launch type on which to run your service.
     * </p>
     * 
     * @param launchType
     *        The launch type on which to run your service.
     * @see LaunchType
     */

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type on which to run your service.
     * </p>
     * 
     * @return The launch type on which to run your service.
     * @see LaunchType
     */

    public String getLaunchType() {
        return this.launchType;
    }

    /**
     * <p>
     * The launch type on which to run your service.
     * </p>
     * 
     * @param launchType
     *        The launch type on which to run your service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public CreateServiceRequest withLaunchType(String launchType) {
        setLaunchType(launchType);
        return this;
    }

    /**
     * <p>
     * The launch type on which to run your service.
     * </p>
     * 
     * @param launchType
     *        The launch type on which to run your service.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public CreateServiceRequest withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The platform version on which to run your service. If one is not specified, the latest version is used by
     * default.
     * </p>
     * 
     * @param platformVersion
     *        The platform version on which to run your service. If one is not specified, the latest version is used by
     *        default.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version on which to run your service. If one is not specified, the latest version is used by
     * default.
     * </p>
     * 
     * @return The platform version on which to run your service. If one is not specified, the latest version is used by
     *         default.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The platform version on which to run your service. If one is not specified, the latest version is used by
     * default.
     * </p>
     * 
     * @param platformVersion
     *        The platform version on which to run your service. If one is not specified, the latest version is used by
     *        default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon ECS to make calls to your load
     * balancer on your behalf. This parameter is only permitted if you are using a load balancer with your service and
     * your task definition does not use the <code>awsvpc</code> network mode. If you specify the <code>role</code>
     * parameter, you must also specify a load balancer object with the <code>loadBalancers</code> parameter.
     * </p>
     * <important>
     * <p>
     * If your account has already created the Amazon ECS service-linked role, that role is used by default for your
     * service unless you specify a role here. The service-linked role is required if your task definition uses the
     * <code>awsvpc</code> network mode, in which case you should not specify a role here. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * If your specified role has a path other than <code>/</code>, then you must either specify the full role ARN (this
     * is recommended) or prefix the role name with the path. For example, if a role with the name <code>bar</code> has
     * a path of <code>/foo/</code> then you would specify <code>/foo/bar</code> as the role name. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     * >Friendly Names and Paths</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param role
     *        The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon ECS to make calls to your
     *        load balancer on your behalf. This parameter is only permitted if you are using a load balancer with your
     *        service and your task definition does not use the <code>awsvpc</code> network mode. If you specify the
     *        <code>role</code> parameter, you must also specify a load balancer object with the
     *        <code>loadBalancers</code> parameter.</p> <important>
     *        <p>
     *        If your account has already created the Amazon ECS service-linked role, that role is used by default for
     *        your service unless you specify a role here. The service-linked role is required if your task definition
     *        uses the <code>awsvpc</code> network mode, in which case you should not specify a role here. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html">Using
     *        Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        </important>
     *        <p>
     *        If your specified role has a path other than <code>/</code>, then you must either specify the full role
     *        ARN (this is recommended) or prefix the role name with the path. For example, if a role with the name
     *        <code>bar</code> has a path of <code>/foo/</code> then you would specify <code>/foo/bar</code> as the role
     *        name. For more information, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     *        >Friendly Names and Paths</a> in the <i>IAM User Guide</i>.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon ECS to make calls to your load
     * balancer on your behalf. This parameter is only permitted if you are using a load balancer with your service and
     * your task definition does not use the <code>awsvpc</code> network mode. If you specify the <code>role</code>
     * parameter, you must also specify a load balancer object with the <code>loadBalancers</code> parameter.
     * </p>
     * <important>
     * <p>
     * If your account has already created the Amazon ECS service-linked role, that role is used by default for your
     * service unless you specify a role here. The service-linked role is required if your task definition uses the
     * <code>awsvpc</code> network mode, in which case you should not specify a role here. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * If your specified role has a path other than <code>/</code>, then you must either specify the full role ARN (this
     * is recommended) or prefix the role name with the path. For example, if a role with the name <code>bar</code> has
     * a path of <code>/foo/</code> then you would specify <code>/foo/bar</code> as the role name. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     * >Friendly Names and Paths</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @return The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon ECS to make calls to your
     *         load balancer on your behalf. This parameter is only permitted if you are using a load balancer with your
     *         service and your task definition does not use the <code>awsvpc</code> network mode. If you specify the
     *         <code>role</code> parameter, you must also specify a load balancer object with the
     *         <code>loadBalancers</code> parameter.</p> <important>
     *         <p>
     *         If your account has already created the Amazon ECS service-linked role, that role is used by default for
     *         your service unless you specify a role here. The service-linked role is required if your task definition
     *         uses the <code>awsvpc</code> network mode, in which case you should not specify a role here. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html">Using
     *         Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *         </p>
     *         </important>
     *         <p>
     *         If your specified role has a path other than <code>/</code>, then you must either specify the full role
     *         ARN (this is recommended) or prefix the role name with the path. For example, if a role with the name
     *         <code>bar</code> has a path of <code>/foo/</code> then you would specify <code>/foo/bar</code> as the
     *         role name. For more information, see <a href=
     *         "http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     *         >Friendly Names and Paths</a> in the <i>IAM User Guide</i>.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon ECS to make calls to your load
     * balancer on your behalf. This parameter is only permitted if you are using a load balancer with your service and
     * your task definition does not use the <code>awsvpc</code> network mode. If you specify the <code>role</code>
     * parameter, you must also specify a load balancer object with the <code>loadBalancers</code> parameter.
     * </p>
     * <important>
     * <p>
     * If your account has already created the Amazon ECS service-linked role, that role is used by default for your
     * service unless you specify a role here. The service-linked role is required if your task definition uses the
     * <code>awsvpc</code> network mode, in which case you should not specify a role here. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html">Using
     * Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * </important>
     * <p>
     * If your specified role has a path other than <code>/</code>, then you must either specify the full role ARN (this
     * is recommended) or prefix the role name with the path. For example, if a role with the name <code>bar</code> has
     * a path of <code>/foo/</code> then you would specify <code>/foo/bar</code> as the role name. For more information,
     * see <a
     * href="http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     * >Friendly Names and Paths</a> in the <i>IAM User Guide</i>.
     * </p>
     * 
     * @param role
     *        The name or full Amazon Resource Name (ARN) of the IAM role that allows Amazon ECS to make calls to your
     *        load balancer on your behalf. This parameter is only permitted if you are using a load balancer with your
     *        service and your task definition does not use the <code>awsvpc</code> network mode. If you specify the
     *        <code>role</code> parameter, you must also specify a load balancer object with the
     *        <code>loadBalancers</code> parameter.</p> <important>
     *        <p>
     *        If your account has already created the Amazon ECS service-linked role, that role is used by default for
     *        your service unless you specify a role here. The service-linked role is required if your task definition
     *        uses the <code>awsvpc</code> network mode, in which case you should not specify a role here. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/using-service-linked-roles.html">Using
     *        Service-Linked Roles for Amazon ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     *        </p>
     *        </important>
     *        <p>
     *        If your specified role has a path other than <code>/</code>, then you must either specify the full role
     *        ARN (this is recommended) or prefix the role name with the path. For example, if a role with the name
     *        <code>bar</code> has a path of <code>/foo/</code> then you would specify <code>/foo/bar</code> as the role
     *        name. For more information, see <a href=
     *        "http://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
     *        >Friendly Names and Paths</a> in the <i>IAM User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @param deploymentConfiguration
     *        Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *        stopping and starting tasks.
     */

    public void setDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @return Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *         stopping and starting tasks.
     */

    public DeploymentConfiguration getDeploymentConfiguration() {
        return this.deploymentConfiguration;
    }

    /**
     * <p>
     * Optional deployment parameters that control how many tasks run during the deployment and the ordering of stopping
     * and starting tasks.
     * </p>
     * 
     * @param deploymentConfiguration
     *        Optional deployment parameters that control how many tasks run during the deployment and the ordering of
     *        stopping and starting tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withDeploymentConfiguration(DeploymentConfiguration deploymentConfiguration) {
        setDeploymentConfiguration(deploymentConfiguration);
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for tasks in your service. You can specify a maximum of 10
     * constraints per task (this limit includes constraints in the task definition and those specified at run time).
     * </p>
     * 
     * @return An array of placement constraint objects to use for tasks in your service. You can specify a maximum of
     *         10 constraints per task (this limit includes constraints in the task definition and those specified at
     *         run time).
     */

    public java.util.List<PlacementConstraint> getPlacementConstraints() {
        if (placementConstraints == null) {
            placementConstraints = new com.amazonaws.internal.SdkInternalList<PlacementConstraint>();
        }
        return placementConstraints;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for tasks in your service. You can specify a maximum of 10
     * constraints per task (this limit includes constraints in the task definition and those specified at run time).
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for tasks in your service. You can specify a maximum of 10
     *        constraints per task (this limit includes constraints in the task definition and those specified at run
     *        time).
     */

    public void setPlacementConstraints(java.util.Collection<PlacementConstraint> placementConstraints) {
        if (placementConstraints == null) {
            this.placementConstraints = null;
            return;
        }

        this.placementConstraints = new com.amazonaws.internal.SdkInternalList<PlacementConstraint>(placementConstraints);
    }

    /**
     * <p>
     * An array of placement constraint objects to use for tasks in your service. You can specify a maximum of 10
     * constraints per task (this limit includes constraints in the task definition and those specified at run time).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementConstraints(java.util.Collection)} or {@link #withPlacementConstraints(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for tasks in your service. You can specify a maximum of 10
     *        constraints per task (this limit includes constraints in the task definition and those specified at run
     *        time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withPlacementConstraints(PlacementConstraint... placementConstraints) {
        if (this.placementConstraints == null) {
            setPlacementConstraints(new com.amazonaws.internal.SdkInternalList<PlacementConstraint>(placementConstraints.length));
        }
        for (PlacementConstraint ele : placementConstraints) {
            this.placementConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for tasks in your service. You can specify a maximum of 10
     * constraints per task (this limit includes constraints in the task definition and those specified at run time).
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for tasks in your service. You can specify a maximum of 10
     *        constraints per task (this limit includes constraints in the task definition and those specified at run
     *        time).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withPlacementConstraints(java.util.Collection<PlacementConstraint> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The placement strategy objects to use for tasks in your service. You can specify a maximum of five strategy rules
     * per service.
     * </p>
     * 
     * @return The placement strategy objects to use for tasks in your service. You can specify a maximum of five
     *         strategy rules per service.
     */

    public java.util.List<PlacementStrategy> getPlacementStrategy() {
        if (placementStrategy == null) {
            placementStrategy = new com.amazonaws.internal.SdkInternalList<PlacementStrategy>();
        }
        return placementStrategy;
    }

    /**
     * <p>
     * The placement strategy objects to use for tasks in your service. You can specify a maximum of five strategy rules
     * per service.
     * </p>
     * 
     * @param placementStrategy
     *        The placement strategy objects to use for tasks in your service. You can specify a maximum of five
     *        strategy rules per service.
     */

    public void setPlacementStrategy(java.util.Collection<PlacementStrategy> placementStrategy) {
        if (placementStrategy == null) {
            this.placementStrategy = null;
            return;
        }

        this.placementStrategy = new com.amazonaws.internal.SdkInternalList<PlacementStrategy>(placementStrategy);
    }

    /**
     * <p>
     * The placement strategy objects to use for tasks in your service. You can specify a maximum of five strategy rules
     * per service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementStrategy(java.util.Collection)} or {@link #withPlacementStrategy(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param placementStrategy
     *        The placement strategy objects to use for tasks in your service. You can specify a maximum of five
     *        strategy rules per service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withPlacementStrategy(PlacementStrategy... placementStrategy) {
        if (this.placementStrategy == null) {
            setPlacementStrategy(new com.amazonaws.internal.SdkInternalList<PlacementStrategy>(placementStrategy.length));
        }
        for (PlacementStrategy ele : placementStrategy) {
            this.placementStrategy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The placement strategy objects to use for tasks in your service. You can specify a maximum of five strategy rules
     * per service.
     * </p>
     * 
     * @param placementStrategy
     *        The placement strategy objects to use for tasks in your service. You can specify a maximum of five
     *        strategy rules per service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withPlacementStrategy(java.util.Collection<PlacementStrategy> placementStrategy) {
        setPlacementStrategy(placementStrategy);
        return this;
    }

    /**
     * <p>
     * The network configuration for the service. This parameter is required for task definitions that use the
     * <code>awsvpc</code> network mode to receive their own Elastic Network Interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param networkConfiguration
     *        The network configuration for the service. This parameter is required for task definitions that use the
     *        <code>awsvpc</code> network mode to receive their own Elastic Network Interface, and it is not supported
     *        for other network modes. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a>
     *        in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for the service. This parameter is required for task definitions that use the
     * <code>awsvpc</code> network mode to receive their own Elastic Network Interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The network configuration for the service. This parameter is required for task definitions that use the
     *         <code>awsvpc</code> network mode to receive their own Elastic Network Interface, and it is not supported
     *         for other network modes. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     *         Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for the service. This parameter is required for task definitions that use the
     * <code>awsvpc</code> network mode to receive their own Elastic Network Interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param networkConfiguration
     *        The network configuration for the service. This parameter is required for task definitions that use the
     *        <code>awsvpc</code> network mode to receive their own Elastic Network Interface, and it is not supported
     *        for other network modes. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a>
     *        in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     * Balancing target health checks after a task has first started. This is only valid if your service is configured
     * to use a load balancer. If your service's tasks take a while to start and respond to ELB health checks, you can
     * specify a health check grace period of up to 1,800 seconds during which the ECS service scheduler will ignore ELB
     * health check status. This grace period can prevent the ECS service scheduler from marking tasks as unhealthy and
     * stopping them before they have time to come up.
     * </p>
     * 
     * @param healthCheckGracePeriodSeconds
     *        The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     *        Balancing target health checks after a task has first started. This is only valid if your service is
     *        configured to use a load balancer. If your service's tasks take a while to start and respond to ELB health
     *        checks, you can specify a health check grace period of up to 1,800 seconds during which the ECS service
     *        scheduler will ignore ELB health check status. This grace period can prevent the ECS service scheduler
     *        from marking tasks as unhealthy and stopping them before they have time to come up.
     */

    public void setHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     * Balancing target health checks after a task has first started. This is only valid if your service is configured
     * to use a load balancer. If your service's tasks take a while to start and respond to ELB health checks, you can
     * specify a health check grace period of up to 1,800 seconds during which the ECS service scheduler will ignore ELB
     * health check status. This grace period can prevent the ECS service scheduler from marking tasks as unhealthy and
     * stopping them before they have time to come up.
     * </p>
     * 
     * @return The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic
     *         Load Balancing target health checks after a task has first started. This is only valid if your service is
     *         configured to use a load balancer. If your service's tasks take a while to start and respond to ELB
     *         health checks, you can specify a health check grace period of up to 1,800 seconds during which the ECS
     *         service scheduler will ignore ELB health check status. This grace period can prevent the ECS service
     *         scheduler from marking tasks as unhealthy and stopping them before they have time to come up.
     */

    public Integer getHealthCheckGracePeriodSeconds() {
        return this.healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     * Balancing target health checks after a task has first started. This is only valid if your service is configured
     * to use a load balancer. If your service's tasks take a while to start and respond to ELB health checks, you can
     * specify a health check grace period of up to 1,800 seconds during which the ECS service scheduler will ignore ELB
     * health check status. This grace period can prevent the ECS service scheduler from marking tasks as unhealthy and
     * stopping them before they have time to come up.
     * </p>
     * 
     * @param healthCheckGracePeriodSeconds
     *        The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     *        Balancing target health checks after a task has first started. This is only valid if your service is
     *        configured to use a load balancer. If your service's tasks take a while to start and respond to ELB health
     *        checks, you can specify a health check grace period of up to 1,800 seconds during which the ECS service
     *        scheduler will ignore ELB health check status. This grace period can prevent the ECS service scheduler
     *        from marking tasks as unhealthy and stopping them before they have time to come up.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        setHealthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: ").append(getTaskDefinition()).append(",");
        if (getLoadBalancers() != null)
            sb.append("LoadBalancers: ").append(getLoadBalancers()).append(",");
        if (getDesiredCount() != null)
            sb.append("DesiredCount: ").append(getDesiredCount()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getLaunchType() != null)
            sb.append("LaunchType: ").append(getLaunchType()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getDeploymentConfiguration() != null)
            sb.append("DeploymentConfiguration: ").append(getDeploymentConfiguration()).append(",");
        if (getPlacementConstraints() != null)
            sb.append("PlacementConstraints: ").append(getPlacementConstraints()).append(",");
        if (getPlacementStrategy() != null)
            sb.append("PlacementStrategy: ").append(getPlacementStrategy()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getHealthCheckGracePeriodSeconds() != null)
            sb.append("HealthCheckGracePeriodSeconds: ").append(getHealthCheckGracePeriodSeconds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateServiceRequest == false)
            return false;
        CreateServiceRequest other = (CreateServiceRequest) obj;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null)
            return false;
        if (other.getLoadBalancers() != null && other.getLoadBalancers().equals(this.getLoadBalancers()) == false)
            return false;
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null)
            return false;
        if (other.getDesiredCount() != null && other.getDesiredCount().equals(this.getDesiredCount()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getDeploymentConfiguration() == null ^ this.getDeploymentConfiguration() == null)
            return false;
        if (other.getDeploymentConfiguration() != null && other.getDeploymentConfiguration().equals(this.getDeploymentConfiguration()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
            return false;
        if (other.getPlacementStrategy() == null ^ this.getPlacementStrategy() == null)
            return false;
        if (other.getPlacementStrategy() != null && other.getPlacementStrategy().equals(this.getPlacementStrategy()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getHealthCheckGracePeriodSeconds() == null ^ this.getHealthCheckGracePeriodSeconds() == null)
            return false;
        if (other.getHealthCheckGracePeriodSeconds() != null
                && other.getHealthCheckGracePeriodSeconds().equals(this.getHealthCheckGracePeriodSeconds()) == false)
            return false;
        return true;
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
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfiguration() == null) ? 0 : getDeploymentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode + ((getPlacementStrategy() == null) ? 0 : getPlacementStrategy().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckGracePeriodSeconds() == null) ? 0 : getHealthCheckGracePeriodSeconds().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceRequest clone() {
        return (CreateServiceRequest) super.clone();
    }

}
