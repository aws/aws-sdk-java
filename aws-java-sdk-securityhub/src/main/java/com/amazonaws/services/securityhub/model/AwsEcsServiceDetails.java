/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Provides details about a service within an ECS cluster.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/AwsEcsServiceDetails" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AwsEcsServiceDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The capacity provider strategy that the service uses.
     * </p>
     */
    private java.util.List<AwsEcsServiceCapacityProviderStrategyDetails> capacityProviderStrategy;
    /**
     * <p>
     * The ARN of the cluster that hosts the service.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * Deployment parameters for the service. Includes the number of tasks that run and the order in which to start and
     * stop tasks.
     * </p>
     */
    private AwsEcsServiceDeploymentConfigurationDetails deploymentConfiguration;
    /**
     * <p>
     * Contains the deployment controller type that the service uses.
     * </p>
     */
    private AwsEcsServiceDeploymentControllerDetails deploymentController;
    /**
     * <p>
     * The number of instantiations of the task definition to run on the service.
     * </p>
     */
    private Integer desiredCount;
    /**
     * <p>
     * Whether to enable Amazon ECS managed tags for the tasks in the service.
     * </p>
     */
    private Boolean enableEcsManagedTags;
    /**
     * <p>
     * Whether the execute command functionality is enabled for the service.
     * </p>
     */
    private Boolean enableExecuteCommand;
    /**
     * <p>
     * After a task starts, the amount of time in seconds that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing target health checks.
     * </p>
     */
    private Integer healthCheckGracePeriodSeconds;
    /**
     * <p>
     * The launch type that the service uses.
     * </p>
     * <p>
     * Valid values: <code>EC2</code> | <code>FARGATE</code> | <code>EXTERNAL</code>
     * </p>
     */
    private String launchType;
    /**
     * <p>
     * Information about the load balancers that the service uses.
     * </p>
     */
    private java.util.List<AwsEcsServiceLoadBalancersDetails> loadBalancers;
    /**
     * <p>
     * The name of the service.
     * </p>
     */
    private String name;
    /**
     * <p>
     * For tasks that use the <code>awsvpc</code> networking mode, the VPC subnet and security group configuration.
     * </p>
     */
    private AwsEcsServiceNetworkConfigurationDetails networkConfiguration;
    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     */
    private java.util.List<AwsEcsServicePlacementConstraintsDetails> placementConstraints;
    /**
     * <p>
     * Information about how tasks for the service are placed.
     * </p>
     */
    private java.util.List<AwsEcsServicePlacementStrategiesDetails> placementStrategies;
    /**
     * <p>
     * The platform version on which to run the service. Only specified for tasks that are hosted on Fargate. If a
     * platform version is not specified, the <code>LATEST</code> platform version is used by default.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * Indicates whether to propagate the tags from the task definition to the task or from the service to the task. If
     * no value is provided, then tags are not propagated.
     * </p>
     * <p>
     * Valid values: <code>TASK_DEFINITION</code> | <code>SERVICE</code>
     * </p>
     */
    private String propagateTags;
    /**
     * <p>
     * The ARN of the IAM role that is associated with the service. The role allows the Amazon ECS container agent to
     * register container instances with an Elastic Load Balancing load balancer.
     * </p>
     */
    private String role;
    /**
     * <p>
     * The scheduling strategy to use for the service.
     * </p>
     * <p>
     * The <code>REPLICA</code> scheduling strategy places and maintains the desired number of tasks across the cluster.
     * By default, the service scheduler spreads tasks across Availability Zones. Task placement strategies and
     * constraints are used to customize task placement decisions.
     * </p>
     * <p>
     * The <code>DAEMON</code> scheduling strategy deploys exactly one task on each active container instance that meets
     * all of the task placement constraints that are specified in the cluster. The service scheduler also evaluates the
     * task placement constraints for running tasks and stops tasks that do not meet the placement constraints.
     * </p>
     * <p>
     * Valid values: <code>REPLICA</code> | <code>DAEMON</code>
     * </p>
     */
    private String schedulingStrategy;
    /**
     * <p>
     * The ARN of the service.
     * </p>
     */
    private String serviceArn;
    /**
     * <p>
     * The name of the service.
     * </p>
     * <p>
     * The name can contain up to 255 characters. It can use letters, numbers, underscores, and hyphens.
     * </p>
     */
    private String serviceName;
    /**
     * <p>
     * Information about the service discovery registries to assign to the service.
     * </p>
     */
    private java.util.List<AwsEcsServiceServiceRegistriesDetails> serviceRegistries;
    /**
     * <p>
     * The task definition to use for tasks in the service.
     * </p>
     */
    private String taskDefinition;

    /**
     * <p>
     * The capacity provider strategy that the service uses.
     * </p>
     * 
     * @return The capacity provider strategy that the service uses.
     */

    public java.util.List<AwsEcsServiceCapacityProviderStrategyDetails> getCapacityProviderStrategy() {
        return capacityProviderStrategy;
    }

    /**
     * <p>
     * The capacity provider strategy that the service uses.
     * </p>
     * 
     * @param capacityProviderStrategy
     *        The capacity provider strategy that the service uses.
     */

    public void setCapacityProviderStrategy(java.util.Collection<AwsEcsServiceCapacityProviderStrategyDetails> capacityProviderStrategy) {
        if (capacityProviderStrategy == null) {
            this.capacityProviderStrategy = null;
            return;
        }

        this.capacityProviderStrategy = new java.util.ArrayList<AwsEcsServiceCapacityProviderStrategyDetails>(capacityProviderStrategy);
    }

    /**
     * <p>
     * The capacity provider strategy that the service uses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityProviderStrategy(java.util.Collection)} or
     * {@link #withCapacityProviderStrategy(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param capacityProviderStrategy
     *        The capacity provider strategy that the service uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withCapacityProviderStrategy(AwsEcsServiceCapacityProviderStrategyDetails... capacityProviderStrategy) {
        if (this.capacityProviderStrategy == null) {
            setCapacityProviderStrategy(new java.util.ArrayList<AwsEcsServiceCapacityProviderStrategyDetails>(capacityProviderStrategy.length));
        }
        for (AwsEcsServiceCapacityProviderStrategyDetails ele : capacityProviderStrategy) {
            this.capacityProviderStrategy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy that the service uses.
     * </p>
     * 
     * @param capacityProviderStrategy
     *        The capacity provider strategy that the service uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withCapacityProviderStrategy(java.util.Collection<AwsEcsServiceCapacityProviderStrategyDetails> capacityProviderStrategy) {
        setCapacityProviderStrategy(capacityProviderStrategy);
        return this;
    }

    /**
     * <p>
     * The ARN of the cluster that hosts the service.
     * </p>
     * 
     * @param cluster
     *        The ARN of the cluster that hosts the service.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The ARN of the cluster that hosts the service.
     * </p>
     * 
     * @return The ARN of the cluster that hosts the service.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The ARN of the cluster that hosts the service.
     * </p>
     * 
     * @param cluster
     *        The ARN of the cluster that hosts the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * Deployment parameters for the service. Includes the number of tasks that run and the order in which to start and
     * stop tasks.
     * </p>
     * 
     * @param deploymentConfiguration
     *        Deployment parameters for the service. Includes the number of tasks that run and the order in which to
     *        start and stop tasks.
     */

    public void setDeploymentConfiguration(AwsEcsServiceDeploymentConfigurationDetails deploymentConfiguration) {
        this.deploymentConfiguration = deploymentConfiguration;
    }

    /**
     * <p>
     * Deployment parameters for the service. Includes the number of tasks that run and the order in which to start and
     * stop tasks.
     * </p>
     * 
     * @return Deployment parameters for the service. Includes the number of tasks that run and the order in which to
     *         start and stop tasks.
     */

    public AwsEcsServiceDeploymentConfigurationDetails getDeploymentConfiguration() {
        return this.deploymentConfiguration;
    }

    /**
     * <p>
     * Deployment parameters for the service. Includes the number of tasks that run and the order in which to start and
     * stop tasks.
     * </p>
     * 
     * @param deploymentConfiguration
     *        Deployment parameters for the service. Includes the number of tasks that run and the order in which to
     *        start and stop tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withDeploymentConfiguration(AwsEcsServiceDeploymentConfigurationDetails deploymentConfiguration) {
        setDeploymentConfiguration(deploymentConfiguration);
        return this;
    }

    /**
     * <p>
     * Contains the deployment controller type that the service uses.
     * </p>
     * 
     * @param deploymentController
     *        Contains the deployment controller type that the service uses.
     */

    public void setDeploymentController(AwsEcsServiceDeploymentControllerDetails deploymentController) {
        this.deploymentController = deploymentController;
    }

    /**
     * <p>
     * Contains the deployment controller type that the service uses.
     * </p>
     * 
     * @return Contains the deployment controller type that the service uses.
     */

    public AwsEcsServiceDeploymentControllerDetails getDeploymentController() {
        return this.deploymentController;
    }

    /**
     * <p>
     * Contains the deployment controller type that the service uses.
     * </p>
     * 
     * @param deploymentController
     *        Contains the deployment controller type that the service uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withDeploymentController(AwsEcsServiceDeploymentControllerDetails deploymentController) {
        setDeploymentController(deploymentController);
        return this;
    }

    /**
     * <p>
     * The number of instantiations of the task definition to run on the service.
     * </p>
     * 
     * @param desiredCount
     *        The number of instantiations of the task definition to run on the service.
     */

    public void setDesiredCount(Integer desiredCount) {
        this.desiredCount = desiredCount;
    }

    /**
     * <p>
     * The number of instantiations of the task definition to run on the service.
     * </p>
     * 
     * @return The number of instantiations of the task definition to run on the service.
     */

    public Integer getDesiredCount() {
        return this.desiredCount;
    }

    /**
     * <p>
     * The number of instantiations of the task definition to run on the service.
     * </p>
     * 
     * @param desiredCount
     *        The number of instantiations of the task definition to run on the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withDesiredCount(Integer desiredCount) {
        setDesiredCount(desiredCount);
        return this;
    }

    /**
     * <p>
     * Whether to enable Amazon ECS managed tags for the tasks in the service.
     * </p>
     * 
     * @param enableEcsManagedTags
     *        Whether to enable Amazon ECS managed tags for the tasks in the service.
     */

    public void setEnableEcsManagedTags(Boolean enableEcsManagedTags) {
        this.enableEcsManagedTags = enableEcsManagedTags;
    }

    /**
     * <p>
     * Whether to enable Amazon ECS managed tags for the tasks in the service.
     * </p>
     * 
     * @return Whether to enable Amazon ECS managed tags for the tasks in the service.
     */

    public Boolean getEnableEcsManagedTags() {
        return this.enableEcsManagedTags;
    }

    /**
     * <p>
     * Whether to enable Amazon ECS managed tags for the tasks in the service.
     * </p>
     * 
     * @param enableEcsManagedTags
     *        Whether to enable Amazon ECS managed tags for the tasks in the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withEnableEcsManagedTags(Boolean enableEcsManagedTags) {
        setEnableEcsManagedTags(enableEcsManagedTags);
        return this;
    }

    /**
     * <p>
     * Whether to enable Amazon ECS managed tags for the tasks in the service.
     * </p>
     * 
     * @return Whether to enable Amazon ECS managed tags for the tasks in the service.
     */

    public Boolean isEnableEcsManagedTags() {
        return this.enableEcsManagedTags;
    }

    /**
     * <p>
     * Whether the execute command functionality is enabled for the service.
     * </p>
     * 
     * @param enableExecuteCommand
     *        Whether the execute command functionality is enabled for the service.
     */

    public void setEnableExecuteCommand(Boolean enableExecuteCommand) {
        this.enableExecuteCommand = enableExecuteCommand;
    }

    /**
     * <p>
     * Whether the execute command functionality is enabled for the service.
     * </p>
     * 
     * @return Whether the execute command functionality is enabled for the service.
     */

    public Boolean getEnableExecuteCommand() {
        return this.enableExecuteCommand;
    }

    /**
     * <p>
     * Whether the execute command functionality is enabled for the service.
     * </p>
     * 
     * @param enableExecuteCommand
     *        Whether the execute command functionality is enabled for the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withEnableExecuteCommand(Boolean enableExecuteCommand) {
        setEnableExecuteCommand(enableExecuteCommand);
        return this;
    }

    /**
     * <p>
     * Whether the execute command functionality is enabled for the service.
     * </p>
     * 
     * @return Whether the execute command functionality is enabled for the service.
     */

    public Boolean isEnableExecuteCommand() {
        return this.enableExecuteCommand;
    }

    /**
     * <p>
     * After a task starts, the amount of time in seconds that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing target health checks.
     * </p>
     * 
     * @param healthCheckGracePeriodSeconds
     *        After a task starts, the amount of time in seconds that the Amazon ECS service scheduler ignores unhealthy
     *        Elastic Load Balancing target health checks.
     */

    public void setHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        this.healthCheckGracePeriodSeconds = healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * After a task starts, the amount of time in seconds that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing target health checks.
     * </p>
     * 
     * @return After a task starts, the amount of time in seconds that the Amazon ECS service scheduler ignores
     *         unhealthy Elastic Load Balancing target health checks.
     */

    public Integer getHealthCheckGracePeriodSeconds() {
        return this.healthCheckGracePeriodSeconds;
    }

    /**
     * <p>
     * After a task starts, the amount of time in seconds that the Amazon ECS service scheduler ignores unhealthy
     * Elastic Load Balancing target health checks.
     * </p>
     * 
     * @param healthCheckGracePeriodSeconds
     *        After a task starts, the amount of time in seconds that the Amazon ECS service scheduler ignores unhealthy
     *        Elastic Load Balancing target health checks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withHealthCheckGracePeriodSeconds(Integer healthCheckGracePeriodSeconds) {
        setHealthCheckGracePeriodSeconds(healthCheckGracePeriodSeconds);
        return this;
    }

    /**
     * <p>
     * The launch type that the service uses.
     * </p>
     * <p>
     * Valid values: <code>EC2</code> | <code>FARGATE</code> | <code>EXTERNAL</code>
     * </p>
     * 
     * @param launchType
     *        The launch type that the service uses.</p>
     *        <p>
     *        Valid values: <code>EC2</code> | <code>FARGATE</code> | <code>EXTERNAL</code>
     */

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type that the service uses.
     * </p>
     * <p>
     * Valid values: <code>EC2</code> | <code>FARGATE</code> | <code>EXTERNAL</code>
     * </p>
     * 
     * @return The launch type that the service uses.</p>
     *         <p>
     *         Valid values: <code>EC2</code> | <code>FARGATE</code> | <code>EXTERNAL</code>
     */

    public String getLaunchType() {
        return this.launchType;
    }

    /**
     * <p>
     * The launch type that the service uses.
     * </p>
     * <p>
     * Valid values: <code>EC2</code> | <code>FARGATE</code> | <code>EXTERNAL</code>
     * </p>
     * 
     * @param launchType
     *        The launch type that the service uses.</p>
     *        <p>
     *        Valid values: <code>EC2</code> | <code>FARGATE</code> | <code>EXTERNAL</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withLaunchType(String launchType) {
        setLaunchType(launchType);
        return this;
    }

    /**
     * <p>
     * Information about the load balancers that the service uses.
     * </p>
     * 
     * @return Information about the load balancers that the service uses.
     */

    public java.util.List<AwsEcsServiceLoadBalancersDetails> getLoadBalancers() {
        return loadBalancers;
    }

    /**
     * <p>
     * Information about the load balancers that the service uses.
     * </p>
     * 
     * @param loadBalancers
     *        Information about the load balancers that the service uses.
     */

    public void setLoadBalancers(java.util.Collection<AwsEcsServiceLoadBalancersDetails> loadBalancers) {
        if (loadBalancers == null) {
            this.loadBalancers = null;
            return;
        }

        this.loadBalancers = new java.util.ArrayList<AwsEcsServiceLoadBalancersDetails>(loadBalancers);
    }

    /**
     * <p>
     * Information about the load balancers that the service uses.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancers(java.util.Collection)} or {@link #withLoadBalancers(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param loadBalancers
     *        Information about the load balancers that the service uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withLoadBalancers(AwsEcsServiceLoadBalancersDetails... loadBalancers) {
        if (this.loadBalancers == null) {
            setLoadBalancers(new java.util.ArrayList<AwsEcsServiceLoadBalancersDetails>(loadBalancers.length));
        }
        for (AwsEcsServiceLoadBalancersDetails ele : loadBalancers) {
            this.loadBalancers.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the load balancers that the service uses.
     * </p>
     * 
     * @param loadBalancers
     *        Information about the load balancers that the service uses.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withLoadBalancers(java.util.Collection<AwsEcsServiceLoadBalancersDetails> loadBalancers) {
        setLoadBalancers(loadBalancers);
        return this;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param name
     *        The name of the service.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @return The name of the service.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * 
     * @param name
     *        The name of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * For tasks that use the <code>awsvpc</code> networking mode, the VPC subnet and security group configuration.
     * </p>
     * 
     * @param networkConfiguration
     *        For tasks that use the <code>awsvpc</code> networking mode, the VPC subnet and security group
     *        configuration.
     */

    public void setNetworkConfiguration(AwsEcsServiceNetworkConfigurationDetails networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * For tasks that use the <code>awsvpc</code> networking mode, the VPC subnet and security group configuration.
     * </p>
     * 
     * @return For tasks that use the <code>awsvpc</code> networking mode, the VPC subnet and security group
     *         configuration.
     */

    public AwsEcsServiceNetworkConfigurationDetails getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * For tasks that use the <code>awsvpc</code> networking mode, the VPC subnet and security group configuration.
     * </p>
     * 
     * @param networkConfiguration
     *        For tasks that use the <code>awsvpc</code> networking mode, the VPC subnet and security group
     *        configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withNetworkConfiguration(AwsEcsServiceNetworkConfigurationDetails networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     * 
     * @return The placement constraints for the tasks in the service.
     */

    public java.util.List<AwsEcsServicePlacementConstraintsDetails> getPlacementConstraints() {
        return placementConstraints;
    }

    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     * 
     * @param placementConstraints
     *        The placement constraints for the tasks in the service.
     */

    public void setPlacementConstraints(java.util.Collection<AwsEcsServicePlacementConstraintsDetails> placementConstraints) {
        if (placementConstraints == null) {
            this.placementConstraints = null;
            return;
        }

        this.placementConstraints = new java.util.ArrayList<AwsEcsServicePlacementConstraintsDetails>(placementConstraints);
    }

    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementConstraints(java.util.Collection)} or {@link #withPlacementConstraints(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param placementConstraints
     *        The placement constraints for the tasks in the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withPlacementConstraints(AwsEcsServicePlacementConstraintsDetails... placementConstraints) {
        if (this.placementConstraints == null) {
            setPlacementConstraints(new java.util.ArrayList<AwsEcsServicePlacementConstraintsDetails>(placementConstraints.length));
        }
        for (AwsEcsServicePlacementConstraintsDetails ele : placementConstraints) {
            this.placementConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The placement constraints for the tasks in the service.
     * </p>
     * 
     * @param placementConstraints
     *        The placement constraints for the tasks in the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withPlacementConstraints(java.util.Collection<AwsEcsServicePlacementConstraintsDetails> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * Information about how tasks for the service are placed.
     * </p>
     * 
     * @return Information about how tasks for the service are placed.
     */

    public java.util.List<AwsEcsServicePlacementStrategiesDetails> getPlacementStrategies() {
        return placementStrategies;
    }

    /**
     * <p>
     * Information about how tasks for the service are placed.
     * </p>
     * 
     * @param placementStrategies
     *        Information about how tasks for the service are placed.
     */

    public void setPlacementStrategies(java.util.Collection<AwsEcsServicePlacementStrategiesDetails> placementStrategies) {
        if (placementStrategies == null) {
            this.placementStrategies = null;
            return;
        }

        this.placementStrategies = new java.util.ArrayList<AwsEcsServicePlacementStrategiesDetails>(placementStrategies);
    }

    /**
     * <p>
     * Information about how tasks for the service are placed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementStrategies(java.util.Collection)} or {@link #withPlacementStrategies(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param placementStrategies
     *        Information about how tasks for the service are placed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withPlacementStrategies(AwsEcsServicePlacementStrategiesDetails... placementStrategies) {
        if (this.placementStrategies == null) {
            setPlacementStrategies(new java.util.ArrayList<AwsEcsServicePlacementStrategiesDetails>(placementStrategies.length));
        }
        for (AwsEcsServicePlacementStrategiesDetails ele : placementStrategies) {
            this.placementStrategies.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about how tasks for the service are placed.
     * </p>
     * 
     * @param placementStrategies
     *        Information about how tasks for the service are placed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withPlacementStrategies(java.util.Collection<AwsEcsServicePlacementStrategiesDetails> placementStrategies) {
        setPlacementStrategies(placementStrategies);
        return this;
    }

    /**
     * <p>
     * The platform version on which to run the service. Only specified for tasks that are hosted on Fargate. If a
     * platform version is not specified, the <code>LATEST</code> platform version is used by default.
     * </p>
     * 
     * @param platformVersion
     *        The platform version on which to run the service. Only specified for tasks that are hosted on Fargate. If
     *        a platform version is not specified, the <code>LATEST</code> platform version is used by default.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version on which to run the service. Only specified for tasks that are hosted on Fargate. If a
     * platform version is not specified, the <code>LATEST</code> platform version is used by default.
     * </p>
     * 
     * @return The platform version on which to run the service. Only specified for tasks that are hosted on Fargate. If
     *         a platform version is not specified, the <code>LATEST</code> platform version is used by default.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The platform version on which to run the service. Only specified for tasks that are hosted on Fargate. If a
     * platform version is not specified, the <code>LATEST</code> platform version is used by default.
     * </p>
     * 
     * @param platformVersion
     *        The platform version on which to run the service. Only specified for tasks that are hosted on Fargate. If
     *        a platform version is not specified, the <code>LATEST</code> platform version is used by default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * Indicates whether to propagate the tags from the task definition to the task or from the service to the task. If
     * no value is provided, then tags are not propagated.
     * </p>
     * <p>
     * Valid values: <code>TASK_DEFINITION</code> | <code>SERVICE</code>
     * </p>
     * 
     * @param propagateTags
     *        Indicates whether to propagate the tags from the task definition to the task or from the service to the
     *        task. If no value is provided, then tags are not propagated.</p>
     *        <p>
     *        Valid values: <code>TASK_DEFINITION</code> | <code>SERVICE</code>
     */

    public void setPropagateTags(String propagateTags) {
        this.propagateTags = propagateTags;
    }

    /**
     * <p>
     * Indicates whether to propagate the tags from the task definition to the task or from the service to the task. If
     * no value is provided, then tags are not propagated.
     * </p>
     * <p>
     * Valid values: <code>TASK_DEFINITION</code> | <code>SERVICE</code>
     * </p>
     * 
     * @return Indicates whether to propagate the tags from the task definition to the task or from the service to the
     *         task. If no value is provided, then tags are not propagated.</p>
     *         <p>
     *         Valid values: <code>TASK_DEFINITION</code> | <code>SERVICE</code>
     */

    public String getPropagateTags() {
        return this.propagateTags;
    }

    /**
     * <p>
     * Indicates whether to propagate the tags from the task definition to the task or from the service to the task. If
     * no value is provided, then tags are not propagated.
     * </p>
     * <p>
     * Valid values: <code>TASK_DEFINITION</code> | <code>SERVICE</code>
     * </p>
     * 
     * @param propagateTags
     *        Indicates whether to propagate the tags from the task definition to the task or from the service to the
     *        task. If no value is provided, then tags are not propagated.</p>
     *        <p>
     *        Valid values: <code>TASK_DEFINITION</code> | <code>SERVICE</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withPropagateTags(String propagateTags) {
        setPropagateTags(propagateTags);
        return this;
    }

    /**
     * <p>
     * The ARN of the IAM role that is associated with the service. The role allows the Amazon ECS container agent to
     * register container instances with an Elastic Load Balancing load balancer.
     * </p>
     * 
     * @param role
     *        The ARN of the IAM role that is associated with the service. The role allows the Amazon ECS container
     *        agent to register container instances with an Elastic Load Balancing load balancer.
     */

    public void setRole(String role) {
        this.role = role;
    }

    /**
     * <p>
     * The ARN of the IAM role that is associated with the service. The role allows the Amazon ECS container agent to
     * register container instances with an Elastic Load Balancing load balancer.
     * </p>
     * 
     * @return The ARN of the IAM role that is associated with the service. The role allows the Amazon ECS container
     *         agent to register container instances with an Elastic Load Balancing load balancer.
     */

    public String getRole() {
        return this.role;
    }

    /**
     * <p>
     * The ARN of the IAM role that is associated with the service. The role allows the Amazon ECS container agent to
     * register container instances with an Elastic Load Balancing load balancer.
     * </p>
     * 
     * @param role
     *        The ARN of the IAM role that is associated with the service. The role allows the Amazon ECS container
     *        agent to register container instances with an Elastic Load Balancing load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withRole(String role) {
        setRole(role);
        return this;
    }

    /**
     * <p>
     * The scheduling strategy to use for the service.
     * </p>
     * <p>
     * The <code>REPLICA</code> scheduling strategy places and maintains the desired number of tasks across the cluster.
     * By default, the service scheduler spreads tasks across Availability Zones. Task placement strategies and
     * constraints are used to customize task placement decisions.
     * </p>
     * <p>
     * The <code>DAEMON</code> scheduling strategy deploys exactly one task on each active container instance that meets
     * all of the task placement constraints that are specified in the cluster. The service scheduler also evaluates the
     * task placement constraints for running tasks and stops tasks that do not meet the placement constraints.
     * </p>
     * <p>
     * Valid values: <code>REPLICA</code> | <code>DAEMON</code>
     * </p>
     * 
     * @param schedulingStrategy
     *        The scheduling strategy to use for the service.</p>
     *        <p>
     *        The <code>REPLICA</code> scheduling strategy places and maintains the desired number of tasks across the
     *        cluster. By default, the service scheduler spreads tasks across Availability Zones. Task placement
     *        strategies and constraints are used to customize task placement decisions.
     *        </p>
     *        <p>
     *        The <code>DAEMON</code> scheduling strategy deploys exactly one task on each active container instance
     *        that meets all of the task placement constraints that are specified in the cluster. The service scheduler
     *        also evaluates the task placement constraints for running tasks and stops tasks that do not meet the
     *        placement constraints.
     *        </p>
     *        <p>
     *        Valid values: <code>REPLICA</code> | <code>DAEMON</code>
     */

    public void setSchedulingStrategy(String schedulingStrategy) {
        this.schedulingStrategy = schedulingStrategy;
    }

    /**
     * <p>
     * The scheduling strategy to use for the service.
     * </p>
     * <p>
     * The <code>REPLICA</code> scheduling strategy places and maintains the desired number of tasks across the cluster.
     * By default, the service scheduler spreads tasks across Availability Zones. Task placement strategies and
     * constraints are used to customize task placement decisions.
     * </p>
     * <p>
     * The <code>DAEMON</code> scheduling strategy deploys exactly one task on each active container instance that meets
     * all of the task placement constraints that are specified in the cluster. The service scheduler also evaluates the
     * task placement constraints for running tasks and stops tasks that do not meet the placement constraints.
     * </p>
     * <p>
     * Valid values: <code>REPLICA</code> | <code>DAEMON</code>
     * </p>
     * 
     * @return The scheduling strategy to use for the service.</p>
     *         <p>
     *         The <code>REPLICA</code> scheduling strategy places and maintains the desired number of tasks across the
     *         cluster. By default, the service scheduler spreads tasks across Availability Zones. Task placement
     *         strategies and constraints are used to customize task placement decisions.
     *         </p>
     *         <p>
     *         The <code>DAEMON</code> scheduling strategy deploys exactly one task on each active container instance
     *         that meets all of the task placement constraints that are specified in the cluster. The service scheduler
     *         also evaluates the task placement constraints for running tasks and stops tasks that do not meet the
     *         placement constraints.
     *         </p>
     *         <p>
     *         Valid values: <code>REPLICA</code> | <code>DAEMON</code>
     */

    public String getSchedulingStrategy() {
        return this.schedulingStrategy;
    }

    /**
     * <p>
     * The scheduling strategy to use for the service.
     * </p>
     * <p>
     * The <code>REPLICA</code> scheduling strategy places and maintains the desired number of tasks across the cluster.
     * By default, the service scheduler spreads tasks across Availability Zones. Task placement strategies and
     * constraints are used to customize task placement decisions.
     * </p>
     * <p>
     * The <code>DAEMON</code> scheduling strategy deploys exactly one task on each active container instance that meets
     * all of the task placement constraints that are specified in the cluster. The service scheduler also evaluates the
     * task placement constraints for running tasks and stops tasks that do not meet the placement constraints.
     * </p>
     * <p>
     * Valid values: <code>REPLICA</code> | <code>DAEMON</code>
     * </p>
     * 
     * @param schedulingStrategy
     *        The scheduling strategy to use for the service.</p>
     *        <p>
     *        The <code>REPLICA</code> scheduling strategy places and maintains the desired number of tasks across the
     *        cluster. By default, the service scheduler spreads tasks across Availability Zones. Task placement
     *        strategies and constraints are used to customize task placement decisions.
     *        </p>
     *        <p>
     *        The <code>DAEMON</code> scheduling strategy deploys exactly one task on each active container instance
     *        that meets all of the task placement constraints that are specified in the cluster. The service scheduler
     *        also evaluates the task placement constraints for running tasks and stops tasks that do not meet the
     *        placement constraints.
     *        </p>
     *        <p>
     *        Valid values: <code>REPLICA</code> | <code>DAEMON</code>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withSchedulingStrategy(String schedulingStrategy) {
        setSchedulingStrategy(schedulingStrategy);
        return this;
    }

    /**
     * <p>
     * The ARN of the service.
     * </p>
     * 
     * @param serviceArn
     *        The ARN of the service.
     */

    public void setServiceArn(String serviceArn) {
        this.serviceArn = serviceArn;
    }

    /**
     * <p>
     * The ARN of the service.
     * </p>
     * 
     * @return The ARN of the service.
     */

    public String getServiceArn() {
        return this.serviceArn;
    }

    /**
     * <p>
     * The ARN of the service.
     * </p>
     * 
     * @param serviceArn
     *        The ARN of the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withServiceArn(String serviceArn) {
        setServiceArn(serviceArn);
        return this;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * <p>
     * The name can contain up to 255 characters. It can use letters, numbers, underscores, and hyphens.
     * </p>
     * 
     * @param serviceName
     *        The name of the service.</p>
     *        <p>
     *        The name can contain up to 255 characters. It can use letters, numbers, underscores, and hyphens.
     */

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * <p>
     * The name can contain up to 255 characters. It can use letters, numbers, underscores, and hyphens.
     * </p>
     * 
     * @return The name of the service.</p>
     *         <p>
     *         The name can contain up to 255 characters. It can use letters, numbers, underscores, and hyphens.
     */

    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * <p>
     * The name of the service.
     * </p>
     * <p>
     * The name can contain up to 255 characters. It can use letters, numbers, underscores, and hyphens.
     * </p>
     * 
     * @param serviceName
     *        The name of the service.</p>
     *        <p>
     *        The name can contain up to 255 characters. It can use letters, numbers, underscores, and hyphens.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withServiceName(String serviceName) {
        setServiceName(serviceName);
        return this;
    }

    /**
     * <p>
     * Information about the service discovery registries to assign to the service.
     * </p>
     * 
     * @return Information about the service discovery registries to assign to the service.
     */

    public java.util.List<AwsEcsServiceServiceRegistriesDetails> getServiceRegistries() {
        return serviceRegistries;
    }

    /**
     * <p>
     * Information about the service discovery registries to assign to the service.
     * </p>
     * 
     * @param serviceRegistries
     *        Information about the service discovery registries to assign to the service.
     */

    public void setServiceRegistries(java.util.Collection<AwsEcsServiceServiceRegistriesDetails> serviceRegistries) {
        if (serviceRegistries == null) {
            this.serviceRegistries = null;
            return;
        }

        this.serviceRegistries = new java.util.ArrayList<AwsEcsServiceServiceRegistriesDetails>(serviceRegistries);
    }

    /**
     * <p>
     * Information about the service discovery registries to assign to the service.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setServiceRegistries(java.util.Collection)} or {@link #withServiceRegistries(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param serviceRegistries
     *        Information about the service discovery registries to assign to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withServiceRegistries(AwsEcsServiceServiceRegistriesDetails... serviceRegistries) {
        if (this.serviceRegistries == null) {
            setServiceRegistries(new java.util.ArrayList<AwsEcsServiceServiceRegistriesDetails>(serviceRegistries.length));
        }
        for (AwsEcsServiceServiceRegistriesDetails ele : serviceRegistries) {
            this.serviceRegistries.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the service discovery registries to assign to the service.
     * </p>
     * 
     * @param serviceRegistries
     *        Information about the service discovery registries to assign to the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withServiceRegistries(java.util.Collection<AwsEcsServiceServiceRegistriesDetails> serviceRegistries) {
        setServiceRegistries(serviceRegistries);
        return this;
    }

    /**
     * <p>
     * The task definition to use for tasks in the service.
     * </p>
     * 
     * @param taskDefinition
     *        The task definition to use for tasks in the service.
     */

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The task definition to use for tasks in the service.
     * </p>
     * 
     * @return The task definition to use for tasks in the service.
     */

    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The task definition to use for tasks in the service.
     * </p>
     * 
     * @param taskDefinition
     *        The task definition to use for tasks in the service.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AwsEcsServiceDetails withTaskDefinition(String taskDefinition) {
        setTaskDefinition(taskDefinition);
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
        if (getCapacityProviderStrategy() != null)
            sb.append("CapacityProviderStrategy: ").append(getCapacityProviderStrategy()).append(",");
        if (getCluster() != null)
            sb.append("Cluster: ").append(getCluster()).append(",");
        if (getDeploymentConfiguration() != null)
            sb.append("DeploymentConfiguration: ").append(getDeploymentConfiguration()).append(",");
        if (getDeploymentController() != null)
            sb.append("DeploymentController: ").append(getDeploymentController()).append(",");
        if (getDesiredCount() != null)
            sb.append("DesiredCount: ").append(getDesiredCount()).append(",");
        if (getEnableEcsManagedTags() != null)
            sb.append("EnableEcsManagedTags: ").append(getEnableEcsManagedTags()).append(",");
        if (getEnableExecuteCommand() != null)
            sb.append("EnableExecuteCommand: ").append(getEnableExecuteCommand()).append(",");
        if (getHealthCheckGracePeriodSeconds() != null)
            sb.append("HealthCheckGracePeriodSeconds: ").append(getHealthCheckGracePeriodSeconds()).append(",");
        if (getLaunchType() != null)
            sb.append("LaunchType: ").append(getLaunchType()).append(",");
        if (getLoadBalancers() != null)
            sb.append("LoadBalancers: ").append(getLoadBalancers()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getPlacementConstraints() != null)
            sb.append("PlacementConstraints: ").append(getPlacementConstraints()).append(",");
        if (getPlacementStrategies() != null)
            sb.append("PlacementStrategies: ").append(getPlacementStrategies()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getPropagateTags() != null)
            sb.append("PropagateTags: ").append(getPropagateTags()).append(",");
        if (getRole() != null)
            sb.append("Role: ").append(getRole()).append(",");
        if (getSchedulingStrategy() != null)
            sb.append("SchedulingStrategy: ").append(getSchedulingStrategy()).append(",");
        if (getServiceArn() != null)
            sb.append("ServiceArn: ").append(getServiceArn()).append(",");
        if (getServiceName() != null)
            sb.append("ServiceName: ").append(getServiceName()).append(",");
        if (getServiceRegistries() != null)
            sb.append("ServiceRegistries: ").append(getServiceRegistries()).append(",");
        if (getTaskDefinition() != null)
            sb.append("TaskDefinition: ").append(getTaskDefinition());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AwsEcsServiceDetails == false)
            return false;
        AwsEcsServiceDetails other = (AwsEcsServiceDetails) obj;
        if (other.getCapacityProviderStrategy() == null ^ this.getCapacityProviderStrategy() == null)
            return false;
        if (other.getCapacityProviderStrategy() != null && other.getCapacityProviderStrategy().equals(this.getCapacityProviderStrategy()) == false)
            return false;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getDeploymentConfiguration() == null ^ this.getDeploymentConfiguration() == null)
            return false;
        if (other.getDeploymentConfiguration() != null && other.getDeploymentConfiguration().equals(this.getDeploymentConfiguration()) == false)
            return false;
        if (other.getDeploymentController() == null ^ this.getDeploymentController() == null)
            return false;
        if (other.getDeploymentController() != null && other.getDeploymentController().equals(this.getDeploymentController()) == false)
            return false;
        if (other.getDesiredCount() == null ^ this.getDesiredCount() == null)
            return false;
        if (other.getDesiredCount() != null && other.getDesiredCount().equals(this.getDesiredCount()) == false)
            return false;
        if (other.getEnableEcsManagedTags() == null ^ this.getEnableEcsManagedTags() == null)
            return false;
        if (other.getEnableEcsManagedTags() != null && other.getEnableEcsManagedTags().equals(this.getEnableEcsManagedTags()) == false)
            return false;
        if (other.getEnableExecuteCommand() == null ^ this.getEnableExecuteCommand() == null)
            return false;
        if (other.getEnableExecuteCommand() != null && other.getEnableExecuteCommand().equals(this.getEnableExecuteCommand()) == false)
            return false;
        if (other.getHealthCheckGracePeriodSeconds() == null ^ this.getHealthCheckGracePeriodSeconds() == null)
            return false;
        if (other.getHealthCheckGracePeriodSeconds() != null
                && other.getHealthCheckGracePeriodSeconds().equals(this.getHealthCheckGracePeriodSeconds()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getLoadBalancers() == null ^ this.getLoadBalancers() == null)
            return false;
        if (other.getLoadBalancers() != null && other.getLoadBalancers().equals(this.getLoadBalancers()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
            return false;
        if (other.getPlacementStrategies() == null ^ this.getPlacementStrategies() == null)
            return false;
        if (other.getPlacementStrategies() != null && other.getPlacementStrategies().equals(this.getPlacementStrategies()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getPropagateTags() == null ^ this.getPropagateTags() == null)
            return false;
        if (other.getPropagateTags() != null && other.getPropagateTags().equals(this.getPropagateTags()) == false)
            return false;
        if (other.getRole() == null ^ this.getRole() == null)
            return false;
        if (other.getRole() != null && other.getRole().equals(this.getRole()) == false)
            return false;
        if (other.getSchedulingStrategy() == null ^ this.getSchedulingStrategy() == null)
            return false;
        if (other.getSchedulingStrategy() != null && other.getSchedulingStrategy().equals(this.getSchedulingStrategy()) == false)
            return false;
        if (other.getServiceArn() == null ^ this.getServiceArn() == null)
            return false;
        if (other.getServiceArn() != null && other.getServiceArn().equals(this.getServiceArn()) == false)
            return false;
        if (other.getServiceName() == null ^ this.getServiceName() == null)
            return false;
        if (other.getServiceName() != null && other.getServiceName().equals(this.getServiceName()) == false)
            return false;
        if (other.getServiceRegistries() == null ^ this.getServiceRegistries() == null)
            return false;
        if (other.getServiceRegistries() != null && other.getServiceRegistries().equals(this.getServiceRegistries()) == false)
            return false;
        if (other.getTaskDefinition() == null ^ this.getTaskDefinition() == null)
            return false;
        if (other.getTaskDefinition() != null && other.getTaskDefinition().equals(this.getTaskDefinition()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCapacityProviderStrategy() == null) ? 0 : getCapacityProviderStrategy().hashCode());
        hashCode = prime * hashCode + ((getCluster() == null) ? 0 : getCluster().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfiguration() == null) ? 0 : getDeploymentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeploymentController() == null) ? 0 : getDeploymentController().hashCode());
        hashCode = prime * hashCode + ((getDesiredCount() == null) ? 0 : getDesiredCount().hashCode());
        hashCode = prime * hashCode + ((getEnableEcsManagedTags() == null) ? 0 : getEnableEcsManagedTags().hashCode());
        hashCode = prime * hashCode + ((getEnableExecuteCommand() == null) ? 0 : getEnableExecuteCommand().hashCode());
        hashCode = prime * hashCode + ((getHealthCheckGracePeriodSeconds() == null) ? 0 : getHealthCheckGracePeriodSeconds().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancers() == null) ? 0 : getLoadBalancers().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode + ((getPlacementStrategies() == null) ? 0 : getPlacementStrategies().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getPropagateTags() == null) ? 0 : getPropagateTags().hashCode());
        hashCode = prime * hashCode + ((getRole() == null) ? 0 : getRole().hashCode());
        hashCode = prime * hashCode + ((getSchedulingStrategy() == null) ? 0 : getSchedulingStrategy().hashCode());
        hashCode = prime * hashCode + ((getServiceArn() == null) ? 0 : getServiceArn().hashCode());
        hashCode = prime * hashCode + ((getServiceName() == null) ? 0 : getServiceName().hashCode());
        hashCode = prime * hashCode + ((getServiceRegistries() == null) ? 0 : getServiceRegistries().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        return hashCode;
    }

    @Override
    public AwsEcsServiceDetails clone() {
        try {
            return (AwsEcsServiceDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.AwsEcsServiceDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
