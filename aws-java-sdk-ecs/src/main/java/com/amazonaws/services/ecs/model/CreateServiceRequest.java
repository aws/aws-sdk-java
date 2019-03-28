/*
 * Copyright 2014-2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
     * clusters within a Region or across multiple Regions.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run in your service. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code>
     * revision is used.
     * </p>
     * <p>
     * A task definition must be specified if the service is using the <code>ECS</code> deployment controller.
     * </p>
     */
    private String taskDefinition;
    /**
     * <p>
     * A load balancer object representing the load balancer to use with your service.
     * </p>
     * <p>
     * If the service is using the <code>ECS</code> deployment controller, you are limited to one load balancer or
     * target group.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment controller, the service is required to use either
     * an Application Load Balancer or Network Load Balancer. When creating an AWS CodeDeploy deployment group, you
     * specify two target groups (referred to as a <code>targetGroupPair</code>). During a deployment, AWS CodeDeploy
     * determines which task set in your service has the status <code>PRIMARY</code> and associates one target group
     * with it, and then associates the other target group with the replacement task set. The load balancer can also
     * have up to two listeners: a required listener for production traffic and an optional listener that allows you
     * perform validation tests with Lambda functions before routing production traffic to it.
     * </p>
     * <p>
     * After you create a service using the <code>ECS</code> deployment controller, the load balancer name or target
     * group ARN, container name, and container port specified in the service definition are immutable. If you are using
     * the <code>CODE_DEPLOY</code> deployment controller, these values can be changed when updating the service.
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
     * Services with tasks that use the <code>awsvpc</code> network mode (for example, those with the Fargate launch
     * type) only support Application Load Balancers and Network Load Balancers. Classic Load Balancers are not
     * supported. Also, when you create any target groups for these services, you must choose <code>ip</code> as the
     * target type, not <code>instance</code>, because tasks that use the <code>awsvpc</code> network mode are
     * associated with an elastic network interface, not an Amazon EC2 instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<LoadBalancer> loadBalancers;
    /**
     * <p>
     * The details of the service discovery registries to assign to this service. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service Discovery</a>.
     * </p>
     * <note>
     * <p>
     * Service discovery is supported for Fargate tasks if you are using platform version v1.1.0 or later. For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS
     * Fargate Platform Versions</a>.
     * </p>
     * </note>
     */
    private com.amazonaws.internal.SdkInternalList<ServiceRegistry> serviceRegistries;
    /**
     * <p>
     * The number of instantiations of the specified task definition to place and keep running on your cluster.
     * </p>
     */
    private Integer desiredCount;
    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32 ASCII
     * characters are allowed.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * The launch type on which to run your service. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String launchType;
    /**
     * <p>
     * The platform version that your tasks in the service are running on. A platform version is specified only for
     * tasks using the Fargate launch type. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
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
     * constraints per task (this limit includes constraints in the task definition and those specified at runtime).
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
     * <code>awsvpc</code> network mode to receive their own elastic network interface, and it is not supported for
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
     * to use a load balancer. If your service's tasks take a while to start and respond to Elastic Load Balancing
     * health checks, you can specify a health check grace period of up to 2,147,483,647 seconds. During that time, the
     * ECS service scheduler ignores health check status. This grace period can prevent the ECS service scheduler from
     * marking tasks as unhealthy and stopping them before they have time to come up.
     * </p>
     */
    private Integer healthCheckGracePeriodSeconds;
    /**
     * <p>
     * The scheduling strategy to use for the service. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html">Services</a>.
     * </p>
     * <p>
     * There are two service scheduler strategies available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLICA</code>-The replica scheduling strategy places and maintains the desired number of tasks across your
     * cluster. By default, the service scheduler spreads tasks across Availability Zones. You can use task placement
     * strategies and constraints to customize task placement decisions. This scheduler strategy is required if the
     * service is using the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment controller types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one task on each active container instance
     * that meets all of the task placement constraints that you specify in your cluster. When you're using this
     * strategy, you don't need to specify a desired number of tasks, a task placement strategy, or use Service Auto
     * Scaling policies.
     * </p>
     * <note>
     * <p>
     * Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     * controller types don't support the <code>DAEMON</code> scheduling strategy.
     * </p>
     * </note></li>
     * </ul>
     */
    private String schedulingStrategy;
    /**
     * <p>
     * The deployment controller to use for the service.
     * </p>
     */
    private DeploymentController deploymentController;
    /**
     * <p>
     * The metadata that you apply to the service to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define. When a service is deleted, the tags are deleted as well. Tag
     * keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private Boolean enableECSManagedTags;
    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the service to the tasks in the service. If
     * no value is specified, the tags are not propagated. Tags can only be propagated to the tasks within the service
     * during service creation. To add tags to a task after service creation, use the <a>TagResource</a> API action.
     * </p>
     */
    private String propagateTags;

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
     * clusters within a Region or across multiple Regions.
     * </p>
     * 
     * @param serviceName
     *        The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     *        are allowed. Service names must be unique within a cluster, but you can have similarly named services in
     *        multiple clusters within a Region or across multiple Regions.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. Service names must be unique within a cluster, but you can have similarly named services in multiple
     * clusters within a Region or across multiple Regions.
     * </p>
     * 
     * @return The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     *         are allowed. Service names must be unique within a cluster, but you can have similarly named services in
     *         multiple clusters within a Region or across multiple Regions.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     * allowed. Service names must be unique within a cluster, but you can have similarly named services in multiple
     * clusters within a Region or across multiple Regions.
     * </p>
     * 
     * @param serviceName
     *        The name of your service. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores
     *        are allowed. Service names must be unique within a cluster, but you can have similarly named services in
     *        multiple clusters within a Region or across multiple Regions.
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
     * <p>
     * A task definition must be specified if the service is using the <code>ECS</code> deployment controller.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *        definition to run in your service. If a <code>revision</code> is not specified, the latest
     *        <code>ACTIVE</code> revision is used.</p>
     *        <p>
     *        A task definition must be specified if the service is using the <code>ECS</code> deployment controller.
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
     * <p>
     * A task definition must be specified if the service is using the <code>ECS</code> deployment controller.
     * </p>
     * 
     * @return The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *         definition to run in your service. If a <code>revision</code> is not specified, the latest
     *         <code>ACTIVE</code> revision is used.</p>
     *         <p>
     *         A task definition must be specified if the service is using the <code>ECS</code> deployment controller.
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
     * <p>
     * A task definition must be specified if the service is using the <code>ECS</code> deployment controller.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *        definition to run in your service. If a <code>revision</code> is not specified, the latest
     *        <code>ACTIVE</code> revision is used.</p>
     *        <p>
     *        A task definition must be specified if the service is using the <code>ECS</code> deployment controller.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTaskDefinition(String taskDefinition) {
        setTaskDefinition(taskDefinition);
        return this;
    }

    /**
     * <p>
     * A load balancer object representing the load balancer to use with your service.
     * </p>
     * <p>
     * If the service is using the <code>ECS</code> deployment controller, you are limited to one load balancer or
     * target group.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment controller, the service is required to use either
     * an Application Load Balancer or Network Load Balancer. When creating an AWS CodeDeploy deployment group, you
     * specify two target groups (referred to as a <code>targetGroupPair</code>). During a deployment, AWS CodeDeploy
     * determines which task set in your service has the status <code>PRIMARY</code> and associates one target group
     * with it, and then associates the other target group with the replacement task set. The load balancer can also
     * have up to two listeners: a required listener for production traffic and an optional listener that allows you
     * perform validation tests with Lambda functions before routing production traffic to it.
     * </p>
     * <p>
     * After you create a service using the <code>ECS</code> deployment controller, the load balancer name or target
     * group ARN, container name, and container port specified in the service definition are immutable. If you are using
     * the <code>CODE_DEPLOY</code> deployment controller, these values can be changed when updating the service.
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
     * Services with tasks that use the <code>awsvpc</code> network mode (for example, those with the Fargate launch
     * type) only support Application Load Balancers and Network Load Balancers. Classic Load Balancers are not
     * supported. Also, when you create any target groups for these services, you must choose <code>ip</code> as the
     * target type, not <code>instance</code>, because tasks that use the <code>awsvpc</code> network mode are
     * associated with an elastic network interface, not an Amazon EC2 instance.
     * </p>
     * 
     * @return A load balancer object representing the load balancer to use with your service.</p>
     *         <p>
     *         If the service is using the <code>ECS</code> deployment controller, you are limited to one load balancer
     *         or target group.
     *         </p>
     *         <p>
     *         If the service is using the <code>CODE_DEPLOY</code> deployment controller, the service is required to
     *         use either an Application Load Balancer or Network Load Balancer. When creating an AWS CodeDeploy
     *         deployment group, you specify two target groups (referred to as a <code>targetGroupPair</code>). During a
     *         deployment, AWS CodeDeploy determines which task set in your service has the status <code>PRIMARY</code>
     *         and associates one target group with it, and then associates the other target group with the replacement
     *         task set. The load balancer can also have up to two listeners: a required listener for production traffic
     *         and an optional listener that allows you perform validation tests with Lambda functions before routing
     *         production traffic to it.
     *         </p>
     *         <p>
     *         After you create a service using the <code>ECS</code> deployment controller, the load balancer name or
     *         target group ARN, container name, and container port specified in the service definition are immutable.
     *         If you are using the <code>CODE_DEPLOY</code> deployment controller, these values can be changed when
     *         updating the service.
     *         </p>
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
     *         </p>
     *         <p>
     *         Services with tasks that use the <code>awsvpc</code> network mode (for example, those with the Fargate
     *         launch type) only support Application Load Balancers and Network Load Balancers. Classic Load Balancers
     *         are not supported. Also, when you create any target groups for these services, you must choose
     *         <code>ip</code> as the target type, not <code>instance</code>, because tasks that use the
     *         <code>awsvpc</code> network mode are associated with an elastic network interface, not an Amazon EC2
     *         instance.
     */

    public java.util.List<LoadBalancer> getLoadBalancers() {
        if (loadBalancers == null) {
            loadBalancers = new com.amazonaws.internal.SdkInternalList<LoadBalancer>();
        }
        return loadBalancers;
    }

    /**
     * <p>
     * A load balancer object representing the load balancer to use with your service.
     * </p>
     * <p>
     * If the service is using the <code>ECS</code> deployment controller, you are limited to one load balancer or
     * target group.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment controller, the service is required to use either
     * an Application Load Balancer or Network Load Balancer. When creating an AWS CodeDeploy deployment group, you
     * specify two target groups (referred to as a <code>targetGroupPair</code>). During a deployment, AWS CodeDeploy
     * determines which task set in your service has the status <code>PRIMARY</code> and associates one target group
     * with it, and then associates the other target group with the replacement task set. The load balancer can also
     * have up to two listeners: a required listener for production traffic and an optional listener that allows you
     * perform validation tests with Lambda functions before routing production traffic to it.
     * </p>
     * <p>
     * After you create a service using the <code>ECS</code> deployment controller, the load balancer name or target
     * group ARN, container name, and container port specified in the service definition are immutable. If you are using
     * the <code>CODE_DEPLOY</code> deployment controller, these values can be changed when updating the service.
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
     * Services with tasks that use the <code>awsvpc</code> network mode (for example, those with the Fargate launch
     * type) only support Application Load Balancers and Network Load Balancers. Classic Load Balancers are not
     * supported. Also, when you create any target groups for these services, you must choose <code>ip</code> as the
     * target type, not <code>instance</code>, because tasks that use the <code>awsvpc</code> network mode are
     * associated with an elastic network interface, not an Amazon EC2 instance.
     * </p>
     * 
     * @param loadBalancers
     *        A load balancer object representing the load balancer to use with your service.</p>
     *        <p>
     *        If the service is using the <code>ECS</code> deployment controller, you are limited to one load balancer
     *        or target group.
     *        </p>
     *        <p>
     *        If the service is using the <code>CODE_DEPLOY</code> deployment controller, the service is required to use
     *        either an Application Load Balancer or Network Load Balancer. When creating an AWS CodeDeploy deployment
     *        group, you specify two target groups (referred to as a <code>targetGroupPair</code>). During a deployment,
     *        AWS CodeDeploy determines which task set in your service has the status <code>PRIMARY</code> and
     *        associates one target group with it, and then associates the other target group with the replacement task
     *        set. The load balancer can also have up to two listeners: a required listener for production traffic and
     *        an optional listener that allows you perform validation tests with Lambda functions before routing
     *        production traffic to it.
     *        </p>
     *        <p>
     *        After you create a service using the <code>ECS</code> deployment controller, the load balancer name or
     *        target group ARN, container name, and container port specified in the service definition are immutable. If
     *        you are using the <code>CODE_DEPLOY</code> deployment controller, these values can be changed when
     *        updating the service.
     *        </p>
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
     *        </p>
     *        <p>
     *        Services with tasks that use the <code>awsvpc</code> network mode (for example, those with the Fargate
     *        launch type) only support Application Load Balancers and Network Load Balancers. Classic Load Balancers
     *        are not supported. Also, when you create any target groups for these services, you must choose
     *        <code>ip</code> as the target type, not <code>instance</code>, because tasks that use the
     *        <code>awsvpc</code> network mode are associated with an elastic network interface, not an Amazon EC2
     *        instance.
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
     * A load balancer object representing the load balancer to use with your service.
     * </p>
     * <p>
     * If the service is using the <code>ECS</code> deployment controller, you are limited to one load balancer or
     * target group.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment controller, the service is required to use either
     * an Application Load Balancer or Network Load Balancer. When creating an AWS CodeDeploy deployment group, you
     * specify two target groups (referred to as a <code>targetGroupPair</code>). During a deployment, AWS CodeDeploy
     * determines which task set in your service has the status <code>PRIMARY</code> and associates one target group
     * with it, and then associates the other target group with the replacement task set. The load balancer can also
     * have up to two listeners: a required listener for production traffic and an optional listener that allows you
     * perform validation tests with Lambda functions before routing production traffic to it.
     * </p>
     * <p>
     * After you create a service using the <code>ECS</code> deployment controller, the load balancer name or target
     * group ARN, container name, and container port specified in the service definition are immutable. If you are using
     * the <code>CODE_DEPLOY</code> deployment controller, these values can be changed when updating the service.
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
     * Services with tasks that use the <code>awsvpc</code> network mode (for example, those with the Fargate launch
     * type) only support Application Load Balancers and Network Load Balancers. Classic Load Balancers are not
     * supported. Also, when you create any target groups for these services, you must choose <code>ip</code> as the
     * target type, not <code>instance</code>, because tasks that use the <code>awsvpc</code> network mode are
     * associated with an elastic network interface, not an Amazon EC2 instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancers(java.util.Collection)} or {@link #withLoadBalancers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param loadBalancers
     *        A load balancer object representing the load balancer to use with your service.</p>
     *        <p>
     *        If the service is using the <code>ECS</code> deployment controller, you are limited to one load balancer
     *        or target group.
     *        </p>
     *        <p>
     *        If the service is using the <code>CODE_DEPLOY</code> deployment controller, the service is required to use
     *        either an Application Load Balancer or Network Load Balancer. When creating an AWS CodeDeploy deployment
     *        group, you specify two target groups (referred to as a <code>targetGroupPair</code>). During a deployment,
     *        AWS CodeDeploy determines which task set in your service has the status <code>PRIMARY</code> and
     *        associates one target group with it, and then associates the other target group with the replacement task
     *        set. The load balancer can also have up to two listeners: a required listener for production traffic and
     *        an optional listener that allows you perform validation tests with Lambda functions before routing
     *        production traffic to it.
     *        </p>
     *        <p>
     *        After you create a service using the <code>ECS</code> deployment controller, the load balancer name or
     *        target group ARN, container name, and container port specified in the service definition are immutable. If
     *        you are using the <code>CODE_DEPLOY</code> deployment controller, these values can be changed when
     *        updating the service.
     *        </p>
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
     *        </p>
     *        <p>
     *        Services with tasks that use the <code>awsvpc</code> network mode (for example, those with the Fargate
     *        launch type) only support Application Load Balancers and Network Load Balancers. Classic Load Balancers
     *        are not supported. Also, when you create any target groups for these services, you must choose
     *        <code>ip</code> as the target type, not <code>instance</code>, because tasks that use the
     *        <code>awsvpc</code> network mode are associated with an elastic network interface, not an Amazon EC2
     *        instance.
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
     * A load balancer object representing the load balancer to use with your service.
     * </p>
     * <p>
     * If the service is using the <code>ECS</code> deployment controller, you are limited to one load balancer or
     * target group.
     * </p>
     * <p>
     * If the service is using the <code>CODE_DEPLOY</code> deployment controller, the service is required to use either
     * an Application Load Balancer or Network Load Balancer. When creating an AWS CodeDeploy deployment group, you
     * specify two target groups (referred to as a <code>targetGroupPair</code>). During a deployment, AWS CodeDeploy
     * determines which task set in your service has the status <code>PRIMARY</code> and associates one target group
     * with it, and then associates the other target group with the replacement task set. The load balancer can also
     * have up to two listeners: a required listener for production traffic and an optional listener that allows you
     * perform validation tests with Lambda functions before routing production traffic to it.
     * </p>
     * <p>
     * After you create a service using the <code>ECS</code> deployment controller, the load balancer name or target
     * group ARN, container name, and container port specified in the service definition are immutable. If you are using
     * the <code>CODE_DEPLOY</code> deployment controller, these values can be changed when updating the service.
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
     * Services with tasks that use the <code>awsvpc</code> network mode (for example, those with the Fargate launch
     * type) only support Application Load Balancers and Network Load Balancers. Classic Load Balancers are not
     * supported. Also, when you create any target groups for these services, you must choose <code>ip</code> as the
     * target type, not <code>instance</code>, because tasks that use the <code>awsvpc</code> network mode are
     * associated with an elastic network interface, not an Amazon EC2 instance.
     * </p>
     * 
     * @param loadBalancers
     *        A load balancer object representing the load balancer to use with your service.</p>
     *        <p>
     *        If the service is using the <code>ECS</code> deployment controller, you are limited to one load balancer
     *        or target group.
     *        </p>
     *        <p>
     *        If the service is using the <code>CODE_DEPLOY</code> deployment controller, the service is required to use
     *        either an Application Load Balancer or Network Load Balancer. When creating an AWS CodeDeploy deployment
     *        group, you specify two target groups (referred to as a <code>targetGroupPair</code>). During a deployment,
     *        AWS CodeDeploy determines which task set in your service has the status <code>PRIMARY</code> and
     *        associates one target group with it, and then associates the other target group with the replacement task
     *        set. The load balancer can also have up to two listeners: a required listener for production traffic and
     *        an optional listener that allows you perform validation tests with Lambda functions before routing
     *        production traffic to it.
     *        </p>
     *        <p>
     *        After you create a service using the <code>ECS</code> deployment controller, the load balancer name or
     *        target group ARN, container name, and container port specified in the service definition are immutable. If
     *        you are using the <code>CODE_DEPLOY</code> deployment controller, these values can be changed when
     *        updating the service.
     *        </p>
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
     *        </p>
     *        <p>
     *        Services with tasks that use the <code>awsvpc</code> network mode (for example, those with the Fargate
     *        launch type) only support Application Load Balancers and Network Load Balancers. Classic Load Balancers
     *        are not supported. Also, when you create any target groups for these services, you must choose
     *        <code>ip</code> as the target type, not <code>instance</code>, because tasks that use the
     *        <code>awsvpc</code> network mode are associated with an elastic network interface, not an Amazon EC2
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withLoadBalancers(java.util.Collection<LoadBalancer> loadBalancers) {
        setLoadBalancers(loadBalancers);
        return this;
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this service. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service Discovery</a>.
     * </p>
     * <note>
     * <p>
     * Service discovery is supported for Fargate tasks if you are using platform version v1.1.0 or later. For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS
     * Fargate Platform Versions</a>.
     * </p>
     * </note>
     * 
     * @return The details of the service discovery registries to assign to this service. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service
     *         Discovery</a>.</p> <note>
     *         <p>
     *         Service discovery is supported for Fargate tasks if you are using platform version v1.1.0 or later. For
     *         more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *         Platform Versions</a>.
     *         </p>
     */

    public java.util.List<ServiceRegistry> getServiceRegistries() {
        if (serviceRegistries == null) {
            serviceRegistries = new com.amazonaws.internal.SdkInternalList<ServiceRegistry>();
        }
        return serviceRegistries;
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this service. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service Discovery</a>.
     * </p>
     * <note>
     * <p>
     * Service discovery is supported for Fargate tasks if you are using platform version v1.1.0 or later. For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS
     * Fargate Platform Versions</a>.
     * </p>
     * </note>
     * 
     * @param serviceRegistries
     *        The details of the service discovery registries to assign to this service. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service
     *        Discovery</a>.</p> <note>
     *        <p>
     *        Service discovery is supported for Fargate tasks if you are using platform version v1.1.0 or later. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a>.
     *        </p>
     */

    public void setServiceRegistries(java.util.Collection<ServiceRegistry> serviceRegistries) {
        if (serviceRegistries == null) {
            this.serviceRegistries = null;
            return;
        }

        this.serviceRegistries = new com.amazonaws.internal.SdkInternalList<ServiceRegistry>(serviceRegistries);
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this service. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service Discovery</a>.
     * </p>
     * <note>
     * <p>
     * Service discovery is supported for Fargate tasks if you are using platform version v1.1.0 or later. For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS
     * Fargate Platform Versions</a>.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceRegistries(java.util.Collection)} or {@link #withServiceRegistries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param serviceRegistries
     *        The details of the service discovery registries to assign to this service. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service
     *        Discovery</a>.</p> <note>
     *        <p>
     *        Service discovery is supported for Fargate tasks if you are using platform version v1.1.0 or later. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withServiceRegistries(ServiceRegistry... serviceRegistries) {
        if (this.serviceRegistries == null) {
            setServiceRegistries(new com.amazonaws.internal.SdkInternalList<ServiceRegistry>(serviceRegistries.length));
        }
        for (ServiceRegistry ele : serviceRegistries) {
            this.serviceRegistries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details of the service discovery registries to assign to this service. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service Discovery</a>.
     * </p>
     * <note>
     * <p>
     * Service discovery is supported for Fargate tasks if you are using platform version v1.1.0 or later. For more
     * information, see <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS
     * Fargate Platform Versions</a>.
     * </p>
     * </note>
     * 
     * @param serviceRegistries
     *        The details of the service discovery registries to assign to this service. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/service-discovery.html">Service
     *        Discovery</a>.</p> <note>
     *        <p>
     *        Service discovery is supported for Fargate tasks if you are using platform version v1.1.0 or later. For
     *        more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withServiceRegistries(java.util.Collection<ServiceRegistry> serviceRegistries) {
        setServiceRegistries(serviceRegistries);
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
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32 ASCII
     * characters are allowed.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32
     *        ASCII characters are allowed.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32 ASCII
     * characters are allowed.
     * </p>
     * 
     * @return Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32
     *         ASCII characters are allowed.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32 ASCII
     * characters are allowed.
     * </p>
     * 
     * @param clientToken
     *        Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. Up to 32
     *        ASCII characters are allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * The launch type on which to run your service. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type on which to run your service. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see LaunchType
     */

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type on which to run your service. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The launch type on which to run your service. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *         Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see LaunchType
     */

    public String getLaunchType() {
        return this.launchType;
    }

    /**
     * <p>
     * The launch type on which to run your service. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type on which to run your service. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public CreateServiceRequest withLaunchType(String launchType) {
        setLaunchType(launchType);
        return this;
    }

    /**
     * <p>
     * The launch type on which to run your service. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        The launch type on which to run your service. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public CreateServiceRequest withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The platform version that your tasks in the service are running on. A platform version is specified only for
     * tasks using the Fargate launch type. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version that your tasks in the service are running on. A platform version is specified only
     *        for tasks using the Fargate launch type. If one isn't specified, the <code>LATEST</code> platform version
     *        is used by default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version that your tasks in the service are running on. A platform version is specified only for
     * tasks using the Fargate launch type. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The platform version that your tasks in the service are running on. A platform version is specified only
     *         for tasks using the Fargate launch type. If one isn't specified, the <code>LATEST</code> platform version
     *         is used by default. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *         Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The platform version that your tasks in the service are running on. A platform version is specified only for
     * tasks using the Fargate launch type. If one isn't specified, the <code>LATEST</code> platform version is used by
     * default. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version that your tasks in the service are running on. A platform version is specified only
     *        for tasks using the Fargate launch type. If one isn't specified, the <code>LATEST</code> platform version
     *        is used by default. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
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
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
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
     *         "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
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
     * href="https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
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
     *        "https://docs.aws.amazon.com/IAM/latest/UserGuide/reference_identifiers.html#identifiers-friendly-names"
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
     * constraints per task (this limit includes constraints in the task definition and those specified at runtime).
     * </p>
     * 
     * @return An array of placement constraint objects to use for tasks in your service. You can specify a maximum of
     *         10 constraints per task (this limit includes constraints in the task definition and those specified at
     *         runtime).
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
     * constraints per task (this limit includes constraints in the task definition and those specified at runtime).
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for tasks in your service. You can specify a maximum of 10
     *        constraints per task (this limit includes constraints in the task definition and those specified at
     *        runtime).
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
     * constraints per task (this limit includes constraints in the task definition and those specified at runtime).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementConstraints(java.util.Collection)} or {@link #withPlacementConstraints(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for tasks in your service. You can specify a maximum of 10
     *        constraints per task (this limit includes constraints in the task definition and those specified at
     *        runtime).
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
     * constraints per task (this limit includes constraints in the task definition and those specified at runtime).
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for tasks in your service. You can specify a maximum of 10
     *        constraints per task (this limit includes constraints in the task definition and those specified at
     *        runtime).
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
     * <code>awsvpc</code> network mode to receive their own elastic network interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param networkConfiguration
     *        The network configuration for the service. This parameter is required for task definitions that use the
     *        <code>awsvpc</code> network mode to receive their own elastic network interface, and it is not supported
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
     * <code>awsvpc</code> network mode to receive their own elastic network interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The network configuration for the service. This parameter is required for task definitions that use the
     *         <code>awsvpc</code> network mode to receive their own elastic network interface, and it is not supported
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
     * <code>awsvpc</code> network mode to receive their own elastic network interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in the
     * <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param networkConfiguration
     *        The network configuration for the service. This parameter is required for task definitions that use the
     *        <code>awsvpc</code> network mode to receive their own elastic network interface, and it is not supported
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
     * to use a load balancer. If your service's tasks take a while to start and respond to Elastic Load Balancing
     * health checks, you can specify a health check grace period of up to 2,147,483,647 seconds. During that time, the
     * ECS service scheduler ignores health check status. This grace period can prevent the ECS service scheduler from
     * marking tasks as unhealthy and stopping them before they have time to come up.
     * </p>
     * 
     * @param healthCheckGracePeriodSeconds
     *        The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     *        Balancing target health checks after a task has first started. This is only valid if your service is
     *        configured to use a load balancer. If your service's tasks take a while to start and respond to Elastic
     *        Load Balancing health checks, you can specify a health check grace period of up to 2,147,483,647 seconds.
     *        During that time, the ECS service scheduler ignores health check status. This grace period can prevent the
     *        ECS service scheduler from marking tasks as unhealthy and stopping them before they have time to come up.
     */

    public void setHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     * Balancing target health checks after a task has first started. This is only valid if your service is configured
     * to use a load balancer. If your service's tasks take a while to start and respond to Elastic Load Balancing
     * health checks, you can specify a health check grace period of up to 2,147,483,647 seconds. During that time, the
     * ECS service scheduler ignores health check status. This grace period can prevent the ECS service scheduler from
     * marking tasks as unhealthy and stopping them before they have time to come up.
     * </p>
     * 
     * @return The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic
     *         Load Balancing target health checks after a task has first started. This is only valid if your service is
     *         configured to use a load balancer. If your service's tasks take a while to start and respond to Elastic
     *         Load Balancing health checks, you can specify a health check grace period of up to 2,147,483,647 seconds.
     *         During that time, the ECS service scheduler ignores health check status. This grace period can prevent
     *         the ECS service scheduler from marking tasks as unhealthy and stopping them before they have time to come
     *         up.
     */

    public Integer getHealthCheckGracePeriodSeconds() {
        return this.healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     * Balancing target health checks after a task has first started. This is only valid if your service is configured
     * to use a load balancer. If your service's tasks take a while to start and respond to Elastic Load Balancing
     * health checks, you can specify a health check grace period of up to 2,147,483,647 seconds. During that time, the
     * ECS service scheduler ignores health check status. This grace period can prevent the ECS service scheduler from
     * marking tasks as unhealthy and stopping them before they have time to come up.
     * </p>
     * 
     * @param healthCheckGracePeriodSeconds
     *        The period of time, in seconds, that the Amazon ECS service scheduler should ignore unhealthy Elastic Load
     *        Balancing target health checks after a task has first started. This is only valid if your service is
     *        configured to use a load balancer. If your service's tasks take a while to start and respond to Elastic
     *        Load Balancing health checks, you can specify a health check grace period of up to 2,147,483,647 seconds.
     *        During that time, the ECS service scheduler ignores health check status. This grace period can prevent the
     *        ECS service scheduler from marking tasks as unhealthy and stopping them before they have time to come up.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        setHealthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds);
        return this;
    }

    /**
     * <p>
     * The scheduling strategy to use for the service. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html">Services</a>.
     * </p>
     * <p>
     * There are two service scheduler strategies available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLICA</code>-The replica scheduling strategy places and maintains the desired number of tasks across your
     * cluster. By default, the service scheduler spreads tasks across Availability Zones. You can use task placement
     * strategies and constraints to customize task placement decisions. This scheduler strategy is required if the
     * service is using the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment controller types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one task on each active container instance
     * that meets all of the task placement constraints that you specify in your cluster. When you're using this
     * strategy, you don't need to specify a desired number of tasks, a task placement strategy, or use Service Auto
     * Scaling policies.
     * </p>
     * <note>
     * <p>
     * Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     * controller types don't support the <code>DAEMON</code> scheduling strategy.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param schedulingStrategy
     *        The scheduling strategy to use for the service. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html">Services</a>.</p>
     *        <p>
     *        There are two service scheduler strategies available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLICA</code>-The replica scheduling strategy places and maintains the desired number of tasks
     *        across your cluster. By default, the service scheduler spreads tasks across Availability Zones. You can
     *        use task placement strategies and constraints to customize task placement decisions. This scheduler
     *        strategy is required if the service is using the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code>
     *        deployment controller types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one task on each active container
     *        instance that meets all of the task placement constraints that you specify in your cluster. When you're
     *        using this strategy, you don't need to specify a desired number of tasks, a task placement strategy, or
     *        use Service Auto Scaling policies.
     *        </p>
     *        <note>
     *        <p>
     *        Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     *        controller types don't support the <code>DAEMON</code> scheduling strategy.
     *        </p>
     *        </note></li>
     * @see SchedulingStrategy
     */

    public void setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }

    /**
     * <p>
     * The scheduling strategy to use for the service. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html">Services</a>.
     * </p>
     * <p>
     * There are two service scheduler strategies available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLICA</code>-The replica scheduling strategy places and maintains the desired number of tasks across your
     * cluster. By default, the service scheduler spreads tasks across Availability Zones. You can use task placement
     * strategies and constraints to customize task placement decisions. This scheduler strategy is required if the
     * service is using the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment controller types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one task on each active container instance
     * that meets all of the task placement constraints that you specify in your cluster. When you're using this
     * strategy, you don't need to specify a desired number of tasks, a task placement strategy, or use Service Auto
     * Scaling policies.
     * </p>
     * <note>
     * <p>
     * Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     * controller types don't support the <code>DAEMON</code> scheduling strategy.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @return The scheduling strategy to use for the service. For more information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html">Services</a>.</p>
     *         <p>
     *         There are two service scheduler strategies available:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>REPLICA</code>-The replica scheduling strategy places and maintains the desired number of tasks
     *         across your cluster. By default, the service scheduler spreads tasks across Availability Zones. You can
     *         use task placement strategies and constraints to customize task placement decisions. This scheduler
     *         strategy is required if the service is using the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code>
     *         deployment controller types.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one task on each active container
     *         instance that meets all of the task placement constraints that you specify in your cluster. When you're
     *         using this strategy, you don't need to specify a desired number of tasks, a task placement strategy, or
     *         use Service Auto Scaling policies.
     *         </p>
     *         <note>
     *         <p>
     *         Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     *         controller types don't support the <code>DAEMON</code> scheduling strategy.
     *         </p>
     *         </note></li>
     * @see SchedulingStrategy
     */

    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
    }

    /**
     * <p>
     * The scheduling strategy to use for the service. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html">Services</a>.
     * </p>
     * <p>
     * There are two service scheduler strategies available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLICA</code>-The replica scheduling strategy places and maintains the desired number of tasks across your
     * cluster. By default, the service scheduler spreads tasks across Availability Zones. You can use task placement
     * strategies and constraints to customize task placement decisions. This scheduler strategy is required if the
     * service is using the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment controller types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one task on each active container instance
     * that meets all of the task placement constraints that you specify in your cluster. When you're using this
     * strategy, you don't need to specify a desired number of tasks, a task placement strategy, or use Service Auto
     * Scaling policies.
     * </p>
     * <note>
     * <p>
     * Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     * controller types don't support the <code>DAEMON</code> scheduling strategy.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param schedulingStrategy
     *        The scheduling strategy to use for the service. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html">Services</a>.</p>
     *        <p>
     *        There are two service scheduler strategies available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLICA</code>-The replica scheduling strategy places and maintains the desired number of tasks
     *        across your cluster. By default, the service scheduler spreads tasks across Availability Zones. You can
     *        use task placement strategies and constraints to customize task placement decisions. This scheduler
     *        strategy is required if the service is using the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code>
     *        deployment controller types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one task on each active container
     *        instance that meets all of the task placement constraints that you specify in your cluster. When you're
     *        using this strategy, you don't need to specify a desired number of tasks, a task placement strategy, or
     *        use Service Auto Scaling policies.
     *        </p>
     *        <note>
     *        <p>
     *        Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     *        controller types don't support the <code>DAEMON</code> scheduling strategy.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchedulingStrategy
     */

    public CreateServiceRequest withSchedulingStrategy(String schedulingStrategy) {
        setSchedulingStrategy(schedulingStrategy);
        return this;
    }

    /**
     * <p>
     * The scheduling strategy to use for the service. For more information, see <a
     * href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html">Services</a>.
     * </p>
     * <p>
     * There are two service scheduler strategies available:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>REPLICA</code>-The replica scheduling strategy places and maintains the desired number of tasks across your
     * cluster. By default, the service scheduler spreads tasks across Availability Zones. You can use task placement
     * strategies and constraints to customize task placement decisions. This scheduler strategy is required if the
     * service is using the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment controller types.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one task on each active container instance
     * that meets all of the task placement constraints that you specify in your cluster. When you're using this
     * strategy, you don't need to specify a desired number of tasks, a task placement strategy, or use Service Auto
     * Scaling policies.
     * </p>
     * <note>
     * <p>
     * Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     * controller types don't support the <code>DAEMON</code> scheduling strategy.
     * </p>
     * </note></li>
     * </ul>
     * 
     * @param schedulingStrategy
     *        The scheduling strategy to use for the service. For more information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs_services.html">Services</a>.</p>
     *        <p>
     *        There are two service scheduler strategies available:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>REPLICA</code>-The replica scheduling strategy places and maintains the desired number of tasks
     *        across your cluster. By default, the service scheduler spreads tasks across Availability Zones. You can
     *        use task placement strategies and constraints to customize task placement decisions. This scheduler
     *        strategy is required if the service is using the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code>
     *        deployment controller types.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DAEMON</code>-The daemon scheduling strategy deploys exactly one task on each active container
     *        instance that meets all of the task placement constraints that you specify in your cluster. When you're
     *        using this strategy, you don't need to specify a desired number of tasks, a task placement strategy, or
     *        use Service Auto Scaling policies.
     *        </p>
     *        <note>
     *        <p>
     *        Tasks using the Fargate launch type or the <code>CODE_DEPLOY</code> or <code>EXTERNAL</code> deployment
     *        controller types don't support the <code>DAEMON</code> scheduling strategy.
     *        </p>
     *        </note></li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see SchedulingStrategy
     */

    public CreateServiceRequest withSchedulingStrategy(SchedulingStrategy schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy.toString();
        return this;
    }

    /**
     * <p>
     * The deployment controller to use for the service.
     * </p>
     * 
     * @param deploymentController
     *        The deployment controller to use for the service.
     */

    public void setDeploymentController(DeploymentController deploymentController) {
        this.deploymentController = deploymentController;
    }

    /**
     * <p>
     * The deployment controller to use for the service.
     * </p>
     * 
     * @return The deployment controller to use for the service.
     */

    public DeploymentController getDeploymentController() {
        return this.deploymentController;
    }

    /**
     * <p>
     * The deployment controller to use for the service.
     * </p>
     * 
     * @param deploymentController
     *        The deployment controller to use for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withDeploymentController(DeploymentController deploymentController) {
        setDeploymentController(deploymentController);
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the service to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define. When a service is deleted, the tags are deleted as well. Tag
     * keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     * </p>
     * 
     * @return The metadata that you apply to the service to help you categorize and organize them. Each tag consists of
     *         a key and an optional value, both of which you define. When a service is deleted, the tags are deleted as
     *         well. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum
     *         length of 256 characters.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to the service to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define. When a service is deleted, the tags are deleted as well. Tag
     * keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the service to help you categorize and organize them. Each tag consists of
     *        a key and an optional value, both of which you define. When a service is deleted, the tags are deleted as
     *        well. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum
     *        length of 256 characters.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * The metadata that you apply to the service to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define. When a service is deleted, the tags are deleted as well. Tag
     * keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the service to help you categorize and organize them. Each tag consists of
     *        a key and an optional value, both of which you define. When a service is deleted, the tags are deleted as
     *        well. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum
     *        length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the service to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define. When a service is deleted, the tags are deleted as well. Tag
     * keys can have a maximum character length of 128 characters, and tag values can have a maximum length of 256
     * characters.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the service to help you categorize and organize them. Each tag consists of
     *        a key and an optional value, both of which you define. When a service is deleted, the tags are deleted as
     *        well. Tag keys can have a maximum character length of 128 characters, and tag values can have a maximum
     *        length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param enableECSManagedTags
     *        Specifies whether to enable Amazon ECS managed tags for the tasks within the service. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon
     *        ECS Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setEnableECSManagedTags(Boolean enableECSManagedTags) {
        this.enableECSManagedTags = enableECSManagedTags;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return Specifies whether to enable Amazon ECS managed tags for the tasks within the service. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon
     *         ECS Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public Boolean getEnableECSManagedTags() {
        return this.enableECSManagedTags;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param enableECSManagedTags
     *        Specifies whether to enable Amazon ECS managed tags for the tasks within the service. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon
     *        ECS Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateServiceRequest withEnableECSManagedTags(Boolean enableECSManagedTags) {
        setEnableECSManagedTags(enableECSManagedTags);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the tasks within the service. For more information, see
     * <a href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return Specifies whether to enable Amazon ECS managed tags for the tasks within the service. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon
     *         ECS Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public Boolean isEnableECSManagedTags() {
        return this.enableECSManagedTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the service to the tasks in the service. If
     * no value is specified, the tags are not propagated. Tags can only be propagated to the tasks within the service
     * during service creation. To add tags to a task after service creation, use the <a>TagResource</a> API action.
     * </p>
     * 
     * @param propagateTags
     *        Specifies whether to propagate the tags from the task definition or the service to the tasks in the
     *        service. If no value is specified, the tags are not propagated. Tags can only be propagated to the tasks
     *        within the service during service creation. To add tags to a task after service creation, use the
     *        <a>TagResource</a> API action.
     * @see PropagateTags
     */

    public void setPropagateTags(String propagateTags) {
        this.propagateTags = propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the service to the tasks in the service. If
     * no value is specified, the tags are not propagated. Tags can only be propagated to the tasks within the service
     * during service creation. To add tags to a task after service creation, use the <a>TagResource</a> API action.
     * </p>
     * 
     * @return Specifies whether to propagate the tags from the task definition or the service to the tasks in the
     *         service. If no value is specified, the tags are not propagated. Tags can only be propagated to the tasks
     *         within the service during service creation. To add tags to a task after service creation, use the
     *         <a>TagResource</a> API action.
     * @see PropagateTags
     */

    public String getPropagateTags() {
        return this.propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the service to the tasks in the service. If
     * no value is specified, the tags are not propagated. Tags can only be propagated to the tasks within the service
     * during service creation. To add tags to a task after service creation, use the <a>TagResource</a> API action.
     * </p>
     * 
     * @param propagateTags
     *        Specifies whether to propagate the tags from the task definition or the service to the tasks in the
     *        service. If no value is specified, the tags are not propagated. Tags can only be propagated to the tasks
     *        within the service during service creation. To add tags to a task after service creation, use the
     *        <a>TagResource</a> API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropagateTags
     */

    public CreateServiceRequest withPropagateTags(String propagateTags) {
        setPropagateTags(propagateTags);
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition or the service to the tasks in the service. If
     * no value is specified, the tags are not propagated. Tags can only be propagated to the tasks within the service
     * during service creation. To add tags to a task after service creation, use the <a>TagResource</a> API action.
     * </p>
     * 
     * @param propagateTags
     *        Specifies whether to propagate the tags from the task definition or the service to the tasks in the
     *        service. If no value is specified, the tags are not propagated. Tags can only be propagated to the tasks
     *        within the service during service creation. To add tags to a task after service creation, use the
     *        <a>TagResource</a> API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropagateTags
     */

    public CreateServiceRequest withPropagateTags(PropagateTags propagateTags) {
        this.propagateTags = propagateTags.toString();
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
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
        if (getServiceRegistries() != null)
            sb.append("ServiceRegistries: ").append(getServiceRegistries()).append(",");
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
            sb.append("HealthCheckGracePeriodSeconds: ").append(getHealthCheckGracePeriodSeconds()).append(",");
        if (getSchedulingStrategy() != null)
            sb.append("SchedulingStrategy: ").append(getSchedulingStrategy()).append(",");
        if (getDeploymentController() != null)
            sb.append("DeploymentController: ").append(getDeploymentController()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getEnableECSManagedTags() != null)
            sb.append("EnableECSManagedTags: ").append(getEnableECSManagedTags()).append(",");
        if (getPropagateTags() != null)
            sb.append("PropagateTags: ").append(getPropagateTags());
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
        if (other.getServiceRegistries() == null ^ this.getServiceRegistries() == null)
            return false;
        if (other.getServiceRegistries() != null && other.getServiceRegistries().equals(this.getServiceRegistries()) == false)
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
        if (other.getSchedulingStrategy() == null ^ this.getSchedulingStrategy() == null)
            return false;
        if (other.getSchedulingStrategy() != null && other.getSchedulingStrategy().equals(this.getSchedulingStrategy()) == false)
            return false;
        if (other.getDeploymentController() == null ^ this.getDeploymentController() == null)
            return false;
        if (other.getDeploymentController() != null && other.getDeploymentController().equals(this.getDeploymentController()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getEnableECSManagedTags() == null ^ this.getEnableECSManagedTags() == null)
            return false;
        if (other.getEnableECSManagedTags() != null && other.getEnableECSManagedTags().equals(this.getEnableECSManagedTags()) == false)
            return false;
        if (other.getPropagateTags() == null ^ this.getPropagateTags() == null)
            return false;
        if (other.getPropagateTags() != null && other.getPropagateTags().equals(this.getPropagateTags()) == false)
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
        hashCode = prime * hashCode + ((getServiceRegistries() == null) ? 0 : getServiceRegistries().hashCode());
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
        hashCode = prime * hashCode + ((getSchedulingStrategy() == null) ? 0 : getSchedulingStrategy().hashCode());
        hashCode = prime * hashCode + ((getDeploymentController() == null) ? 0 : getDeploymentController().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getEnableECSManagedTags() == null) ? 0 : getEnableECSManagedTags().hashCode());
        hashCode = prime * hashCode + ((getPropagateTags() == null) ? 0 : getPropagateTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateServiceRequest clone() {
        return (CreateServiceRequest) super.clone();
    }

}
