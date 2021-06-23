/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.cloudwatchevents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The custom parameters to be used when the target is an Amazon ECS task.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/events-2015-10-07/EcsParameters" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class EcsParameters implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the task definition to use if the event target is an Amazon ECS task.
     * </p>
     */
    private String taskDefinitionArn;
    /**
     * <p>
     * The number of tasks to create based on <code>TaskDefinition</code>. The default is 1.
     * </p>
     */
    private Integer taskCount;
    /**
     * <p>
     * Specifies the launch type on which your task is running. The launch type that you specify here must match one of
     * the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported only in the
     * Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon ECS</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String launchType;
    /**
     * <p>
     * Use this structure if the ECS task uses the <code>awsvpc</code> network mode. This structure specifies the VPC
     * subnets and security groups associated with the task, and whether a public IP address is to be used. This
     * structure is required if <code>LaunchType</code> is <code>FARGATE</code> because the <code>awsvpc</code> mode is
     * required for Fargate tasks.
     * </p>
     * <p>
     * If you specify <code>NetworkConfiguration</code> when the target ECS task does not use the <code>awsvpc</code>
     * network mode, the task fails.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as
     * <code>1.1.0</code>.
     * </p>
     * <p>
     * This structure is used only if <code>LaunchType</code> is <code>FARGATE</code>. For more information about valid
     * platform versions, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * Specifies an ECS task group for the task. The maximum length is 255 characters.
     * </p>
     */
    private String group;
    /**
     * <p>
     * The capacity provider strategy to use for the task.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be omitted.
     * If no <code>capacityProviderStrategy</code> or launchType is specified, the
     * <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     * </p>
     */
    private java.util.List<CapacityProviderStrategyItem> capacityProviderStrategy;
    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the Amazon Elastic Container Service Developer Guide.
     * </p>
     */
    private Boolean enableECSManagedTags;
    /**
     * <p>
     * Whether or not to enable the execute command functionality for the containers in this task. If true, this enables
     * execute command functionality on all containers in the task.
     * </p>
     */
    private Boolean enableExecuteCommand;
    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task
     * (including constraints in the task definition and those specified at runtime).
     * </p>
     */
    private java.util.List<PlacementConstraint> placementConstraints;
    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per task.
     * </p>
     */
    private java.util.List<PlacementStrategy> placementStrategy;
    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the task during task creation. To add tags to a task after
     * task creation, use the TagResource API action.
     * </p>
     */
    private String propagateTags;
    /**
     * <p>
     * The reference ID to use for the task.
     * </p>
     */
    private String referenceId;
    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags"
     * >RunTask</a> in the Amazon ECS API Reference.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The ARN of the task definition to use if the event target is an Amazon ECS task.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The ARN of the task definition to use if the event target is an Amazon ECS task.
     */

    public void setTaskDefinitionArn(String taskDefinitionArn) {
        this.taskDefinitionArn = taskDefinitionArn;
    }

    /**
     * <p>
     * The ARN of the task definition to use if the event target is an Amazon ECS task.
     * </p>
     * 
     * @return The ARN of the task definition to use if the event target is an Amazon ECS task.
     */

    public String getTaskDefinitionArn() {
        return this.taskDefinitionArn;
    }

    /**
     * <p>
     * The ARN of the task definition to use if the event target is an Amazon ECS task.
     * </p>
     * 
     * @param taskDefinitionArn
     *        The ARN of the task definition to use if the event target is an Amazon ECS task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withTaskDefinitionArn(String taskDefinitionArn) {
        setTaskDefinitionArn(taskDefinitionArn);
        return this;
    }

    /**
     * <p>
     * The number of tasks to create based on <code>TaskDefinition</code>. The default is 1.
     * </p>
     * 
     * @param taskCount
     *        The number of tasks to create based on <code>TaskDefinition</code>. The default is 1.
     */

    public void setTaskCount(Integer taskCount) {
        this.taskCount = taskCount;
    }

    /**
     * <p>
     * The number of tasks to create based on <code>TaskDefinition</code>. The default is 1.
     * </p>
     * 
     * @return The number of tasks to create based on <code>TaskDefinition</code>. The default is 1.
     */

    public Integer getTaskCount() {
        return this.taskCount;
    }

    /**
     * <p>
     * The number of tasks to create based on <code>TaskDefinition</code>. The default is 1.
     * </p>
     * 
     * @param taskCount
     *        The number of tasks to create based on <code>TaskDefinition</code>. The default is 1.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withTaskCount(Integer taskCount) {
        setTaskCount(taskCount);
        return this;
    }

    /**
     * <p>
     * Specifies the launch type on which your task is running. The launch type that you specify here must match one of
     * the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported only in the
     * Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon ECS</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        Specifies the launch type on which your task is running. The launch type that you specify here must match
     *        one of the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported
     *        only in the Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon
     *        ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see LaunchType
     */

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * Specifies the launch type on which your task is running. The launch type that you specify here must match one of
     * the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported only in the
     * Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon ECS</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the launch type on which your task is running. The launch type that you specify here must match
     *         one of the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported
     *         only in the Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon
     *         ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @see LaunchType
     */

    public String getLaunchType() {
        return this.launchType;
    }

    /**
     * <p>
     * Specifies the launch type on which your task is running. The launch type that you specify here must match one of
     * the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported only in the
     * Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon ECS</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        Specifies the launch type on which your task is running. The launch type that you specify here must match
     *        one of the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported
     *        only in the Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon
     *        ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public EcsParameters withLaunchType(String launchType) {
        setLaunchType(launchType);
        return this;
    }

    /**
     * <p>
     * Specifies the launch type on which your task is running. The launch type that you specify here must match one of
     * the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported only in the
     * Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon ECS</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param launchType
     *        Specifies the launch type on which your task is running. The launch type that you specify here must match
     *        one of the launch type (compatibilities) of the target task. The <code>FARGATE</code> value is supported
     *        only in the Regions where AWS Fargate with Amazon ECS is supported. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/AWS-Fargate.html">AWS Fargate on Amazon
     *        ECS</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public EcsParameters withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * Use this structure if the ECS task uses the <code>awsvpc</code> network mode. This structure specifies the VPC
     * subnets and security groups associated with the task, and whether a public IP address is to be used. This
     * structure is required if <code>LaunchType</code> is <code>FARGATE</code> because the <code>awsvpc</code> mode is
     * required for Fargate tasks.
     * </p>
     * <p>
     * If you specify <code>NetworkConfiguration</code> when the target ECS task does not use the <code>awsvpc</code>
     * network mode, the task fails.
     * </p>
     * 
     * @param networkConfiguration
     *        Use this structure if the ECS task uses the <code>awsvpc</code> network mode. This structure specifies the
     *        VPC subnets and security groups associated with the task, and whether a public IP address is to be used.
     *        This structure is required if <code>LaunchType</code> is <code>FARGATE</code> because the
     *        <code>awsvpc</code> mode is required for Fargate tasks.</p>
     *        <p>
     *        If you specify <code>NetworkConfiguration</code> when the target ECS task does not use the
     *        <code>awsvpc</code> network mode, the task fails.
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * Use this structure if the ECS task uses the <code>awsvpc</code> network mode. This structure specifies the VPC
     * subnets and security groups associated with the task, and whether a public IP address is to be used. This
     * structure is required if <code>LaunchType</code> is <code>FARGATE</code> because the <code>awsvpc</code> mode is
     * required for Fargate tasks.
     * </p>
     * <p>
     * If you specify <code>NetworkConfiguration</code> when the target ECS task does not use the <code>awsvpc</code>
     * network mode, the task fails.
     * </p>
     * 
     * @return Use this structure if the ECS task uses the <code>awsvpc</code> network mode. This structure specifies
     *         the VPC subnets and security groups associated with the task, and whether a public IP address is to be
     *         used. This structure is required if <code>LaunchType</code> is <code>FARGATE</code> because the
     *         <code>awsvpc</code> mode is required for Fargate tasks.</p>
     *         <p>
     *         If you specify <code>NetworkConfiguration</code> when the target ECS task does not use the
     *         <code>awsvpc</code> network mode, the task fails.
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * Use this structure if the ECS task uses the <code>awsvpc</code> network mode. This structure specifies the VPC
     * subnets and security groups associated with the task, and whether a public IP address is to be used. This
     * structure is required if <code>LaunchType</code> is <code>FARGATE</code> because the <code>awsvpc</code> mode is
     * required for Fargate tasks.
     * </p>
     * <p>
     * If you specify <code>NetworkConfiguration</code> when the target ECS task does not use the <code>awsvpc</code>
     * network mode, the task fails.
     * </p>
     * 
     * @param networkConfiguration
     *        Use this structure if the ECS task uses the <code>awsvpc</code> network mode. This structure specifies the
     *        VPC subnets and security groups associated with the task, and whether a public IP address is to be used.
     *        This structure is required if <code>LaunchType</code> is <code>FARGATE</code> because the
     *        <code>awsvpc</code> mode is required for Fargate tasks.</p>
     *        <p>
     *        If you specify <code>NetworkConfiguration</code> when the target ECS task does not use the
     *        <code>awsvpc</code> network mode, the task fails.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as
     * <code>1.1.0</code>.
     * </p>
     * <p>
     * This structure is used only if <code>LaunchType</code> is <code>FARGATE</code>. For more information about valid
     * platform versions, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        Specifies the platform version for the task. Specify only the numeric portion of the platform version,
     *        such as <code>1.1.0</code>.</p>
     *        <p>
     *        This structure is used only if <code>LaunchType</code> is <code>FARGATE</code>. For more information about
     *        valid platform versions, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as
     * <code>1.1.0</code>.
     * </p>
     * <p>
     * This structure is used only if <code>LaunchType</code> is <code>FARGATE</code>. For more information about valid
     * platform versions, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return Specifies the platform version for the task. Specify only the numeric portion of the platform version,
     *         such as <code>1.1.0</code>.</p>
     *         <p>
     *         This structure is used only if <code>LaunchType</code> is <code>FARGATE</code>. For more information
     *         about valid platform versions, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *         Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * Specifies the platform version for the task. Specify only the numeric portion of the platform version, such as
     * <code>1.1.0</code>.
     * </p>
     * <p>
     * This structure is used only if <code>LaunchType</code> is <code>FARGATE</code>. For more information about valid
     * platform versions, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate Platform
     * Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        Specifies the platform version for the task. Specify only the numeric portion of the platform version,
     *        such as <code>1.1.0</code>.</p>
     *        <p>
     *        This structure is used only if <code>LaunchType</code> is <code>FARGATE</code>. For more information about
     *        valid platform versions, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * Specifies an ECS task group for the task. The maximum length is 255 characters.
     * </p>
     * 
     * @param group
     *        Specifies an ECS task group for the task. The maximum length is 255 characters.
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * Specifies an ECS task group for the task. The maximum length is 255 characters.
     * </p>
     * 
     * @return Specifies an ECS task group for the task. The maximum length is 255 characters.
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * Specifies an ECS task group for the task. The maximum length is 255 characters.
     * </p>
     * 
     * @param group
     *        Specifies an ECS task group for the task. The maximum length is 255 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to use for the task.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be omitted.
     * If no <code>capacityProviderStrategy</code> or launchType is specified, the
     * <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     * </p>
     * 
     * @return The capacity provider strategy to use for the task.</p>
     *         <p>
     *         If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be
     *         omitted. If no <code>capacityProviderStrategy</code> or launchType is specified, the
     *         <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     */

    public java.util.List<CapacityProviderStrategyItem> getCapacityProviderStrategy() {
        return capacityProviderStrategy;
    }

    /**
     * <p>
     * The capacity provider strategy to use for the task.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be omitted.
     * If no <code>capacityProviderStrategy</code> or launchType is specified, the
     * <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     * </p>
     * 
     * @param capacityProviderStrategy
     *        The capacity provider strategy to use for the task.</p>
     *        <p>
     *        If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be
     *        omitted. If no <code>capacityProviderStrategy</code> or launchType is specified, the
     *        <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     */

    public void setCapacityProviderStrategy(java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        if (capacityProviderStrategy == null) {
            this.capacityProviderStrategy = null;
            return;
        }

        this.capacityProviderStrategy = new java.util.ArrayList<CapacityProviderStrategyItem>(capacityProviderStrategy);
    }

    /**
     * <p>
     * The capacity provider strategy to use for the task.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be omitted.
     * If no <code>capacityProviderStrategy</code> or launchType is specified, the
     * <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityProviderStrategy(java.util.Collection)} or
     * {@link #withCapacityProviderStrategy(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param capacityProviderStrategy
     *        The capacity provider strategy to use for the task.</p>
     *        <p>
     *        If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be
     *        omitted. If no <code>capacityProviderStrategy</code> or launchType is specified, the
     *        <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withCapacityProviderStrategy(CapacityProviderStrategyItem... capacityProviderStrategy) {
        if (this.capacityProviderStrategy == null) {
            setCapacityProviderStrategy(new java.util.ArrayList<CapacityProviderStrategyItem>(capacityProviderStrategy.length));
        }
        for (CapacityProviderStrategyItem ele : capacityProviderStrategy) {
            this.capacityProviderStrategy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capacity provider strategy to use for the task.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be omitted.
     * If no <code>capacityProviderStrategy</code> or launchType is specified, the
     * <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     * </p>
     * 
     * @param capacityProviderStrategy
     *        The capacity provider strategy to use for the task.</p>
     *        <p>
     *        If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be
     *        omitted. If no <code>capacityProviderStrategy</code> or launchType is specified, the
     *        <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withCapacityProviderStrategy(java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        setCapacityProviderStrategy(capacityProviderStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the Amazon Elastic Container Service Developer Guide.
     * </p>
     * 
     * @param enableECSManagedTags
     *        Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon
     *        ECS Resources</a> in the Amazon Elastic Container Service Developer Guide.
     */

    public void setEnableECSManagedTags(Boolean enableECSManagedTags) {
        this.enableECSManagedTags = enableECSManagedTags;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the Amazon Elastic Container Service Developer Guide.
     * </p>
     * 
     * @return Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your
     *         Amazon ECS Resources</a> in the Amazon Elastic Container Service Developer Guide.
     */

    public Boolean getEnableECSManagedTags() {
        return this.enableECSManagedTags;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the Amazon Elastic Container Service Developer Guide.
     * </p>
     * 
     * @param enableECSManagedTags
     *        Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon
     *        ECS Resources</a> in the Amazon Elastic Container Service Developer Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withEnableECSManagedTags(Boolean enableECSManagedTags) {
        setEnableECSManagedTags(enableECSManagedTags);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the Amazon Elastic Container Service Developer Guide.
     * </p>
     * 
     * @return Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your
     *         Amazon ECS Resources</a> in the Amazon Elastic Container Service Developer Guide.
     */

    public Boolean isEnableECSManagedTags() {
        return this.enableECSManagedTags;
    }

    /**
     * <p>
     * Whether or not to enable the execute command functionality for the containers in this task. If true, this enables
     * execute command functionality on all containers in the task.
     * </p>
     * 
     * @param enableExecuteCommand
     *        Whether or not to enable the execute command functionality for the containers in this task. If true, this
     *        enables execute command functionality on all containers in the task.
     */

    public void setEnableExecuteCommand(Boolean enableExecuteCommand) {
        this.enableExecuteCommand = enableExecuteCommand;
    }

    /**
     * <p>
     * Whether or not to enable the execute command functionality for the containers in this task. If true, this enables
     * execute command functionality on all containers in the task.
     * </p>
     * 
     * @return Whether or not to enable the execute command functionality for the containers in this task. If true, this
     *         enables execute command functionality on all containers in the task.
     */

    public Boolean getEnableExecuteCommand() {
        return this.enableExecuteCommand;
    }

    /**
     * <p>
     * Whether or not to enable the execute command functionality for the containers in this task. If true, this enables
     * execute command functionality on all containers in the task.
     * </p>
     * 
     * @param enableExecuteCommand
     *        Whether or not to enable the execute command functionality for the containers in this task. If true, this
     *        enables execute command functionality on all containers in the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withEnableExecuteCommand(Boolean enableExecuteCommand) {
        setEnableExecuteCommand(enableExecuteCommand);
        return this;
    }

    /**
     * <p>
     * Whether or not to enable the execute command functionality for the containers in this task. If true, this enables
     * execute command functionality on all containers in the task.
     * </p>
     * 
     * @return Whether or not to enable the execute command functionality for the containers in this task. If true, this
     *         enables execute command functionality on all containers in the task.
     */

    public Boolean isEnableExecuteCommand() {
        return this.enableExecuteCommand;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task
     * (including constraints in the task definition and those specified at runtime).
     * </p>
     * 
     * @return An array of placement constraint objects to use for the task. You can specify up to 10 constraints per
     *         task (including constraints in the task definition and those specified at runtime).
     */

    public java.util.List<PlacementConstraint> getPlacementConstraints() {
        return placementConstraints;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task
     * (including constraints in the task definition and those specified at runtime).
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for the task. You can specify up to 10 constraints per
     *        task (including constraints in the task definition and those specified at runtime).
     */

    public void setPlacementConstraints(java.util.Collection<PlacementConstraint> placementConstraints) {
        if (placementConstraints == null) {
            this.placementConstraints = null;
            return;
        }

        this.placementConstraints = new java.util.ArrayList<PlacementConstraint>(placementConstraints);
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task
     * (including constraints in the task definition and those specified at runtime).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementConstraints(java.util.Collection)} or {@link #withPlacementConstraints(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for the task. You can specify up to 10 constraints per
     *        task (including constraints in the task definition and those specified at runtime).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withPlacementConstraints(PlacementConstraint... placementConstraints) {
        if (this.placementConstraints == null) {
            setPlacementConstraints(new java.util.ArrayList<PlacementConstraint>(placementConstraints.length));
        }
        for (PlacementConstraint ele : placementConstraints) {
            this.placementConstraints.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task
     * (including constraints in the task definition and those specified at runtime).
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for the task. You can specify up to 10 constraints per
     *        task (including constraints in the task definition and those specified at runtime).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withPlacementConstraints(java.util.Collection<PlacementConstraint> placementConstraints) {
        setPlacementConstraints(placementConstraints);
        return this;
    }

    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per task.
     * </p>
     * 
     * @return The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per
     *         task.
     */

    public java.util.List<PlacementStrategy> getPlacementStrategy() {
        return placementStrategy;
    }

    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per task.
     * </p>
     * 
     * @param placementStrategy
     *        The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per
     *        task.
     */

    public void setPlacementStrategy(java.util.Collection<PlacementStrategy> placementStrategy) {
        if (placementStrategy == null) {
            this.placementStrategy = null;
            return;
        }

        this.placementStrategy = new java.util.ArrayList<PlacementStrategy>(placementStrategy);
    }

    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per task.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setPlacementStrategy(java.util.Collection)} or {@link #withPlacementStrategy(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param placementStrategy
     *        The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withPlacementStrategy(PlacementStrategy... placementStrategy) {
        if (this.placementStrategy == null) {
            setPlacementStrategy(new java.util.ArrayList<PlacementStrategy>(placementStrategy.length));
        }
        for (PlacementStrategy ele : placementStrategy) {
            this.placementStrategy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per task.
     * </p>
     * 
     * @param placementStrategy
     *        The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withPlacementStrategy(java.util.Collection<PlacementStrategy> placementStrategy) {
        setPlacementStrategy(placementStrategy);
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the task during task creation. To add tags to a task after
     * task creation, use the TagResource API action.
     * </p>
     * 
     * @param propagateTags
     *        Specifies whether to propagate the tags from the task definition to the task. If no value is specified,
     *        the tags are not propagated. Tags can only be propagated to the task during task creation. To add tags to
     *        a task after task creation, use the TagResource API action.
     * @see PropagateTags
     */

    public void setPropagateTags(String propagateTags) {
        this.propagateTags = propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the task during task creation. To add tags to a task after
     * task creation, use the TagResource API action.
     * </p>
     * 
     * @return Specifies whether to propagate the tags from the task definition to the task. If no value is specified,
     *         the tags are not propagated. Tags can only be propagated to the task during task creation. To add tags to
     *         a task after task creation, use the TagResource API action.
     * @see PropagateTags
     */

    public String getPropagateTags() {
        return this.propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the task during task creation. To add tags to a task after
     * task creation, use the TagResource API action.
     * </p>
     * 
     * @param propagateTags
     *        Specifies whether to propagate the tags from the task definition to the task. If no value is specified,
     *        the tags are not propagated. Tags can only be propagated to the task during task creation. To add tags to
     *        a task after task creation, use the TagResource API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropagateTags
     */

    public EcsParameters withPropagateTags(String propagateTags) {
        setPropagateTags(propagateTags);
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the task during task creation. To add tags to a task after
     * task creation, use the TagResource API action.
     * </p>
     * 
     * @param propagateTags
     *        Specifies whether to propagate the tags from the task definition to the task. If no value is specified,
     *        the tags are not propagated. Tags can only be propagated to the task during task creation. To add tags to
     *        a task after task creation, use the TagResource API action.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropagateTags
     */

    public EcsParameters withPropagateTags(PropagateTags propagateTags) {
        this.propagateTags = propagateTags.toString();
        return this;
    }

    /**
     * <p>
     * The reference ID to use for the task.
     * </p>
     * 
     * @param referenceId
     *        The reference ID to use for the task.
     */

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId;
    }

    /**
     * <p>
     * The reference ID to use for the task.
     * </p>
     * 
     * @return The reference ID to use for the task.
     */

    public String getReferenceId() {
        return this.referenceId;
    }

    /**
     * <p>
     * The reference ID to use for the task.
     * </p>
     * 
     * @param referenceId
     *        The reference ID to use for the task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withReferenceId(String referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags"
     * >RunTask</a> in the Amazon ECS API Reference.
     * </p>
     * 
     * @return The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a
     *         key and an optional value, both of which you define. To learn more, see <a href=
     *         "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags"
     *         >RunTask</a> in the Amazon ECS API Reference.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags"
     * >RunTask</a> in the Amazon ECS API Reference.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a
     *        key and an optional value, both of which you define. To learn more, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags"
     *        >RunTask</a> in the Amazon ECS API Reference.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags"
     * >RunTask</a> in the Amazon ECS API Reference.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a
     *        key and an optional value, both of which you define. To learn more, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags"
     *        >RunTask</a> in the Amazon ECS API Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define. To learn more, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags"
     * >RunTask</a> in the Amazon ECS API Reference.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a
     *        key and an optional value, both of which you define. To learn more, see <a href=
     *        "https://docs.aws.amazon.com/AmazonECS/latest/APIReference/API_RunTask.html#ECS-RunTask-request-tags"
     *        >RunTask</a> in the Amazon ECS API Reference.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public EcsParameters withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getTaskDefinitionArn() != null)
            sb.append("TaskDefinitionArn: ").append(getTaskDefinitionArn()).append(",");
        if (getTaskCount() != null)
            sb.append("TaskCount: ").append(getTaskCount()).append(",");
        if (getLaunchType() != null)
            sb.append("LaunchType: ").append(getLaunchType()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getCapacityProviderStrategy() != null)
            sb.append("CapacityProviderStrategy: ").append(getCapacityProviderStrategy()).append(",");
        if (getEnableECSManagedTags() != null)
            sb.append("EnableECSManagedTags: ").append(getEnableECSManagedTags()).append(",");
        if (getEnableExecuteCommand() != null)
            sb.append("EnableExecuteCommand: ").append(getEnableExecuteCommand()).append(",");
        if (getPlacementConstraints() != null)
            sb.append("PlacementConstraints: ").append(getPlacementConstraints()).append(",");
        if (getPlacementStrategy() != null)
            sb.append("PlacementStrategy: ").append(getPlacementStrategy()).append(",");
        if (getPropagateTags() != null)
            sb.append("PropagateTags: ").append(getPropagateTags()).append(",");
        if (getReferenceId() != null)
            sb.append("ReferenceId: ").append(getReferenceId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof EcsParameters == false)
            return false;
        EcsParameters other = (EcsParameters) obj;
        if (other.getTaskDefinitionArn() == null ^ this.getTaskDefinitionArn() == null)
            return false;
        if (other.getTaskDefinitionArn() != null && other.getTaskDefinitionArn().equals(this.getTaskDefinitionArn()) == false)
            return false;
        if (other.getTaskCount() == null ^ this.getTaskCount() == null)
            return false;
        if (other.getTaskCount() != null && other.getTaskCount().equals(this.getTaskCount()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getCapacityProviderStrategy() == null ^ this.getCapacityProviderStrategy() == null)
            return false;
        if (other.getCapacityProviderStrategy() != null && other.getCapacityProviderStrategy().equals(this.getCapacityProviderStrategy()) == false)
            return false;
        if (other.getEnableECSManagedTags() == null ^ this.getEnableECSManagedTags() == null)
            return false;
        if (other.getEnableECSManagedTags() != null && other.getEnableECSManagedTags().equals(this.getEnableECSManagedTags()) == false)
            return false;
        if (other.getEnableExecuteCommand() == null ^ this.getEnableExecuteCommand() == null)
            return false;
        if (other.getEnableExecuteCommand() != null && other.getEnableExecuteCommand().equals(this.getEnableExecuteCommand()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
            return false;
        if (other.getPlacementStrategy() == null ^ this.getPlacementStrategy() == null)
            return false;
        if (other.getPlacementStrategy() != null && other.getPlacementStrategy().equals(this.getPlacementStrategy()) == false)
            return false;
        if (other.getPropagateTags() == null ^ this.getPropagateTags() == null)
            return false;
        if (other.getPropagateTags() != null && other.getPropagateTags().equals(this.getPropagateTags()) == false)
            return false;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTaskDefinitionArn() == null) ? 0 : getTaskDefinitionArn().hashCode());
        hashCode = prime * hashCode + ((getTaskCount() == null) ? 0 : getTaskCount().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getCapacityProviderStrategy() == null) ? 0 : getCapacityProviderStrategy().hashCode());
        hashCode = prime * hashCode + ((getEnableECSManagedTags() == null) ? 0 : getEnableECSManagedTags().hashCode());
        hashCode = prime * hashCode + ((getEnableExecuteCommand() == null) ? 0 : getEnableExecuteCommand().hashCode());
        hashCode = prime * hashCode + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode + ((getPlacementStrategy() == null) ? 0 : getPlacementStrategy().hashCode());
        hashCode = prime * hashCode + ((getPropagateTags() == null) ? 0 : getPropagateTags().hashCode());
        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public EcsParameters clone() {
        try {
            return (EcsParameters) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.cloudwatchevents.model.transform.EcsParametersMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
