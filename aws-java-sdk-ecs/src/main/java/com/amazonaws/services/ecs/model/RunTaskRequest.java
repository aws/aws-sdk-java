/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/RunTask" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RunTaskRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The capacity provider strategy to use for the task.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be omitted.
     * If no <code>capacityProviderStrategy</code> or <code>launchType</code> is specified, the
     * <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity providers
     * for a cluster after the cluster is created.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem> capacityProviderStrategy;
    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not specify
     * a cluster, the default cluster is assumed.
     * </p>
     */
    private String cluster;
    /**
     * <p>
     * The number of instantiations of the specified task to place on your cluster. You can specify up to 10 tasks per
     * call.
     * </p>
     */
    private Integer count;
    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private Boolean enableECSManagedTags;
    /**
     * <p>
     * The name of the task group to associate with the task. The default value is the family name of the task
     * definition (for example, family:my-family-name).
     * </p>
     */
    private String group;
    /**
     * <p>
     * The launch type on which to run your task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     */
    private String launchType;
    /**
     * <p>
     * The network configuration for the task. This parameter is required for task definitions that use the
     * <code>awsvpc</code> network mode to receive their own elastic network interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private NetworkConfiguration networkConfiguration;
    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a container in the specified task
     * definition and the overrides it should receive. You can override the default command for a container (that is
     * specified in the task definition or Docker image) with a <code>command</code> override. You can also override
     * existing environment variables (that are specified in the task definition or Docker image) on a container or add
     * new environment variables to it with an <code>environment</code> override.
     * </p>
     * <note>
     * <p>
     * A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters of the
     * override structure.
     * </p>
     * </note>
     */
    private TaskOverride overrides;
    /**
     * <p>
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task
     * (including constraints in the task definition and those specified at runtime).
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlacementConstraint> placementConstraints;
    /**
     * <p>
     * The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per task.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<PlacementStrategy> placementStrategy;
    /**
     * <p>
     * The platform version the task should run. A platform version is only specified for tasks using the Fargate launch
     * type. If one is not specified, the <code>LATEST</code> platform version is used by default. For more information,
     * see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     * Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     */
    private String platformVersion;
    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the task during task creation. To add tags to a task after
     * task creation, use the <a>TagResource</a> API action.
     * </p>
     * <note>
     * <p>
     * An error will be received if you specify the <code>SERVICE</code> option when running a task.
     * </p>
     * </note>
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
     * An optional tag specified when a task is started. For example, if you automatically trigger a task to run a batch
     * process job, you could apply a unique identifier for that job to your task with the <code>startedBy</code>
     * parameter. You can then identify which tasks belong to that job by filtering the results of a <a>ListTasks</a>
     * call with the <code>startedBy</code> value. Up to 36 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * <p>
     * If a task is started by an Amazon ECS service, then the <code>startedBy</code> parameter contains the deployment
     * ID of the service that starts it.
     * </p>
     */
    private String startedBy;
    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this
     * prefix. Tags with this prefix do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code> revision is used.
     * </p>
     */
    private String taskDefinition;

    /**
     * <p>
     * The capacity provider strategy to use for the task.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be omitted.
     * If no <code>capacityProviderStrategy</code> or <code>launchType</code> is specified, the
     * <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity providers
     * for a cluster after the cluster is created.
     * </p>
     * 
     * @return The capacity provider strategy to use for the task.</p>
     *         <p>
     *         A capacity provider strategy consists of one or more capacity providers along with the <code>base</code>
     *         and <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be
     *         used in a capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a
     *         capacity provider with a cluster. Only capacity providers with an <code>ACTIVE</code> or
     *         <code>UPDATING</code> status can be used.
     *         </p>
     *         <p>
     *         If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be
     *         omitted. If no <code>capacityProviderStrategy</code> or <code>launchType</code> is specified, the
     *         <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     *         </p>
     *         <p>
     *         If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *         created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *         </p>
     *         <p>
     *         To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *         <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *         accounts and only need to be associated with a cluster to be used.
     *         </p>
     *         <p>
     *         The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity
     *         providers for a cluster after the cluster is created.
     */

    public java.util.List<CapacityProviderStrategyItem> getCapacityProviderStrategy() {
        if (capacityProviderStrategy == null) {
            capacityProviderStrategy = new com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem>();
        }
        return capacityProviderStrategy;
    }

    /**
     * <p>
     * The capacity provider strategy to use for the task.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be omitted.
     * If no <code>capacityProviderStrategy</code> or <code>launchType</code> is specified, the
     * <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity providers
     * for a cluster after the cluster is created.
     * </p>
     * 
     * @param capacityProviderStrategy
     *        The capacity provider strategy to use for the task.</p>
     *        <p>
     *        A capacity provider strategy consists of one or more capacity providers along with the <code>base</code>
     *        and <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be
     *        used in a capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a
     *        capacity provider with a cluster. Only capacity providers with an <code>ACTIVE</code> or
     *        <code>UPDATING</code> status can be used.
     *        </p>
     *        <p>
     *        If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be
     *        omitted. If no <code>capacityProviderStrategy</code> or <code>launchType</code> is specified, the
     *        <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     *        </p>
     *        <p>
     *        If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *        created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *        </p>
     *        <p>
     *        To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *        accounts and only need to be associated with a cluster to be used.
     *        </p>
     *        <p>
     *        The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity
     *        providers for a cluster after the cluster is created.
     */

    public void setCapacityProviderStrategy(java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        if (capacityProviderStrategy == null) {
            this.capacityProviderStrategy = null;
            return;
        }

        this.capacityProviderStrategy = new com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem>(capacityProviderStrategy);
    }

    /**
     * <p>
     * The capacity provider strategy to use for the task.
     * </p>
     * <p>
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be omitted.
     * If no <code>capacityProviderStrategy</code> or <code>launchType</code> is specified, the
     * <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity providers
     * for a cluster after the cluster is created.
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
     *        A capacity provider strategy consists of one or more capacity providers along with the <code>base</code>
     *        and <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be
     *        used in a capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a
     *        capacity provider with a cluster. Only capacity providers with an <code>ACTIVE</code> or
     *        <code>UPDATING</code> status can be used.
     *        </p>
     *        <p>
     *        If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be
     *        omitted. If no <code>capacityProviderStrategy</code> or <code>launchType</code> is specified, the
     *        <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     *        </p>
     *        <p>
     *        If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *        created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *        </p>
     *        <p>
     *        To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *        accounts and only need to be associated with a cluster to be used.
     *        </p>
     *        <p>
     *        The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity
     *        providers for a cluster after the cluster is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withCapacityProviderStrategy(CapacityProviderStrategyItem... capacityProviderStrategy) {
        if (this.capacityProviderStrategy == null) {
            setCapacityProviderStrategy(new com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem>(capacityProviderStrategy.length));
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
     * A capacity provider strategy consists of one or more capacity providers along with the <code>base</code> and
     * <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be used in a
     * capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a capacity provider
     * with a cluster. Only capacity providers with an <code>ACTIVE</code> or <code>UPDATING</code> status can be used.
     * </p>
     * <p>
     * If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be omitted.
     * If no <code>capacityProviderStrategy</code> or <code>launchType</code> is specified, the
     * <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     * </p>
     * <p>
     * If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be created.
     * New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     * </p>
     * <p>
     * To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or <code>FARGATE_SPOT</code>
     * capacity providers. The AWS Fargate capacity providers are available to all accounts and only need to be
     * associated with a cluster to be used.
     * </p>
     * <p>
     * The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity providers
     * for a cluster after the cluster is created.
     * </p>
     * 
     * @param capacityProviderStrategy
     *        The capacity provider strategy to use for the task.</p>
     *        <p>
     *        A capacity provider strategy consists of one or more capacity providers along with the <code>base</code>
     *        and <code>weight</code> to assign to them. A capacity provider must be associated with the cluster to be
     *        used in a capacity provider strategy. The <a>PutClusterCapacityProviders</a> API is used to associate a
     *        capacity provider with a cluster. Only capacity providers with an <code>ACTIVE</code> or
     *        <code>UPDATING</code> status can be used.
     *        </p>
     *        <p>
     *        If a <code>capacityProviderStrategy</code> is specified, the <code>launchType</code> parameter must be
     *        omitted. If no <code>capacityProviderStrategy</code> or <code>launchType</code> is specified, the
     *        <code>defaultCapacityProviderStrategy</code> for the cluster is used.
     *        </p>
     *        <p>
     *        If specifying a capacity provider that uses an Auto Scaling group, the capacity provider must already be
     *        created. New capacity providers can be created with the <a>CreateCapacityProvider</a> API operation.
     *        </p>
     *        <p>
     *        To use a AWS Fargate capacity provider, specify either the <code>FARGATE</code> or
     *        <code>FARGATE_SPOT</code> capacity providers. The AWS Fargate capacity providers are available to all
     *        accounts and only need to be associated with a cluster to be used.
     *        </p>
     *        <p>
     *        The <a>PutClusterCapacityProviders</a> API operation is used to update the list of available capacity
     *        providers for a cluster after the cluster is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withCapacityProviderStrategy(java.util.Collection<CapacityProviderStrategyItem> capacityProviderStrategy) {
        setCapacityProviderStrategy(capacityProviderStrategy);
        return this;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not specify
     * a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not
     *        specify a cluster, the default cluster is assumed.
     */

    public void setCluster(String cluster) {
        this.cluster = cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not specify
     * a cluster, the default cluster is assumed.
     * </p>
     * 
     * @return The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not
     *         specify a cluster, the default cluster is assumed.
     */

    public String getCluster() {
        return this.cluster;
    }

    /**
     * <p>
     * The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not specify
     * a cluster, the default cluster is assumed.
     * </p>
     * 
     * @param cluster
     *        The short name or full Amazon Resource Name (ARN) of the cluster on which to run your task. If you do not
     *        specify a cluster, the default cluster is assumed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withCluster(String cluster) {
        setCluster(cluster);
        return this;
    }

    /**
     * <p>
     * The number of instantiations of the specified task to place on your cluster. You can specify up to 10 tasks per
     * call.
     * </p>
     * 
     * @param count
     *        The number of instantiations of the specified task to place on your cluster. You can specify up to 10
     *        tasks per call.
     */

    public void setCount(Integer count) {
        this.count = count;
    }

    /**
     * <p>
     * The number of instantiations of the specified task to place on your cluster. You can specify up to 10 tasks per
     * call.
     * </p>
     * 
     * @return The number of instantiations of the specified task to place on your cluster. You can specify up to 10
     *         tasks per call.
     */

    public Integer getCount() {
        return this.count;
    }

    /**
     * <p>
     * The number of instantiations of the specified task to place on your cluster. You can specify up to 10 tasks per
     * call.
     * </p>
     * 
     * @param count
     *        The number of instantiations of the specified task to place on your cluster. You can specify up to 10
     *        tasks per call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withCount(Integer count) {
        setCount(count);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param enableECSManagedTags
     *        Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon
     *        ECS Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setEnableECSManagedTags(Boolean enableECSManagedTags) {
        this.enableECSManagedTags = enableECSManagedTags;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your
     *         Amazon ECS Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public Boolean getEnableECSManagedTags() {
        return this.enableECSManagedTags;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param enableECSManagedTags
     *        Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon
     *        ECS Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withEnableECSManagedTags(Boolean enableECSManagedTags) {
        setEnableECSManagedTags(enableECSManagedTags);
        return this;
    }

    /**
     * <p>
     * Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your Amazon ECS
     * Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return Specifies whether to enable Amazon ECS managed tags for the task. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/ecs-using-tags.html">Tagging Your
     *         Amazon ECS Resources</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public Boolean isEnableECSManagedTags() {
        return this.enableECSManagedTags;
    }

    /**
     * <p>
     * The name of the task group to associate with the task. The default value is the family name of the task
     * definition (for example, family:my-family-name).
     * </p>
     * 
     * @param group
     *        The name of the task group to associate with the task. The default value is the family name of the task
     *        definition (for example, family:my-family-name).
     */

    public void setGroup(String group) {
        this.group = group;
    }

    /**
     * <p>
     * The name of the task group to associate with the task. The default value is the family name of the task
     * definition (for example, family:my-family-name).
     * </p>
     * 
     * @return The name of the task group to associate with the task. The default value is the family name of the task
     *         definition (for example, family:my-family-name).
     */

    public String getGroup() {
        return this.group;
    }

    /**
     * <p>
     * The name of the task group to associate with the task. The default value is the family name of the task
     * definition (for example, family:my-family-name).
     * </p>
     * 
     * @param group
     *        The name of the task group to associate with the task. The default value is the family name of the task
     *        definition (for example, family:my-family-name).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withGroup(String group) {
        setGroup(group);
        return this;
    }

    /**
     * <p>
     * The launch type on which to run your task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * 
     * @param launchType
     *        The launch type on which to run your task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p>
     *        <p>
     *        If a <code>launchType</code> is specified, the <code>capacityProviderStrategy</code> parameter must be
     *        omitted.
     * @see LaunchType
     */

    public void setLaunchType(String launchType) {
        this.launchType = launchType;
    }

    /**
     * <p>
     * The launch type on which to run your task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * 
     * @return The launch type on which to run your task. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *         Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p>
     *         <p>
     *         If a <code>launchType</code> is specified, the <code>capacityProviderStrategy</code> parameter must be
     *         omitted.
     * @see LaunchType
     */

    public String getLaunchType() {
        return this.launchType;
    }

    /**
     * <p>
     * The launch type on which to run your task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * 
     * @param launchType
     *        The launch type on which to run your task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p>
     *        <p>
     *        If a <code>launchType</code> is specified, the <code>capacityProviderStrategy</code> parameter must be
     *        omitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public RunTaskRequest withLaunchType(String launchType) {
        setLaunchType(launchType);
        return this;
    }

    /**
     * <p>
     * The launch type on which to run your task. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch Types</a>
     * in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * <p>
     * If a <code>launchType</code> is specified, the <code>capacityProviderStrategy</code> parameter must be omitted.
     * </p>
     * 
     * @param launchType
     *        The launch type on which to run your task. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/launch_types.html">Amazon ECS Launch
     *        Types</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.</p>
     *        <p>
     *        If a <code>launchType</code> is specified, the <code>capacityProviderStrategy</code> parameter must be
     *        omitted.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see LaunchType
     */

    public RunTaskRequest withLaunchType(LaunchType launchType) {
        this.launchType = launchType.toString();
        return this;
    }

    /**
     * <p>
     * The network configuration for the task. This parameter is required for task definitions that use the
     * <code>awsvpc</code> network mode to receive their own elastic network interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param networkConfiguration
     *        The network configuration for the task. This parameter is required for task definitions that use the
     *        <code>awsvpc</code> network mode to receive their own elastic network interface, and it is not supported
     *        for other network modes. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     *        Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        this.networkConfiguration = networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for the task. This parameter is required for task definitions that use the
     * <code>awsvpc</code> network mode to receive their own elastic network interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The network configuration for the task. This parameter is required for task definitions that use the
     *         <code>awsvpc</code> network mode to receive their own elastic network interface, and it is not supported
     *         for other network modes. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     *         Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public NetworkConfiguration getNetworkConfiguration() {
        return this.networkConfiguration;
    }

    /**
     * <p>
     * The network configuration for the task. This parameter is required for task definitions that use the
     * <code>awsvpc</code> network mode to receive their own elastic network interface, and it is not supported for
     * other network modes. For more information, see <a
     * href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task Networking</a> in
     * the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param networkConfiguration
     *        The network configuration for the task. This parameter is required for task definitions that use the
     *        <code>awsvpc</code> network mode to receive their own elastic network interface, and it is not supported
     *        for other network modes. For more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/task-networking.html">Task
     *        Networking</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withNetworkConfiguration(NetworkConfiguration networkConfiguration) {
        setNetworkConfiguration(networkConfiguration);
        return this;
    }

    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a container in the specified task
     * definition and the overrides it should receive. You can override the default command for a container (that is
     * specified in the task definition or Docker image) with a <code>command</code> override. You can also override
     * existing environment variables (that are specified in the task definition or Docker image) on a container or add
     * new environment variables to it with an <code>environment</code> override.
     * </p>
     * <note>
     * <p>
     * A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters of the
     * override structure.
     * </p>
     * </note>
     * 
     * @param overrides
     *        A list of container overrides in JSON format that specify the name of a container in the specified task
     *        definition and the overrides it should receive. You can override the default command for a container (that
     *        is specified in the task definition or Docker image) with a <code>command</code> override. You can also
     *        override existing environment variables (that are specified in the task definition or Docker image) on a
     *        container or add new environment variables to it with an <code>environment</code> override.</p> <note>
     *        <p>
     *        A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters
     *        of the override structure.
     *        </p>
     */

    public void setOverrides(TaskOverride overrides) {
        this.overrides = overrides;
    }

    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a container in the specified task
     * definition and the overrides it should receive. You can override the default command for a container (that is
     * specified in the task definition or Docker image) with a <code>command</code> override. You can also override
     * existing environment variables (that are specified in the task definition or Docker image) on a container or add
     * new environment variables to it with an <code>environment</code> override.
     * </p>
     * <note>
     * <p>
     * A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters of the
     * override structure.
     * </p>
     * </note>
     * 
     * @return A list of container overrides in JSON format that specify the name of a container in the specified task
     *         definition and the overrides it should receive. You can override the default command for a container
     *         (that is specified in the task definition or Docker image) with a <code>command</code> override. You can
     *         also override existing environment variables (that are specified in the task definition or Docker image)
     *         on a container or add new environment variables to it with an <code>environment</code> override.</p>
     *         <note>
     *         <p>
     *         A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters
     *         of the override structure.
     *         </p>
     */

    public TaskOverride getOverrides() {
        return this.overrides;
    }

    /**
     * <p>
     * A list of container overrides in JSON format that specify the name of a container in the specified task
     * definition and the overrides it should receive. You can override the default command for a container (that is
     * specified in the task definition or Docker image) with a <code>command</code> override. You can also override
     * existing environment variables (that are specified in the task definition or Docker image) on a container or add
     * new environment variables to it with an <code>environment</code> override.
     * </p>
     * <note>
     * <p>
     * A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters of the
     * override structure.
     * </p>
     * </note>
     * 
     * @param overrides
     *        A list of container overrides in JSON format that specify the name of a container in the specified task
     *        definition and the overrides it should receive. You can override the default command for a container (that
     *        is specified in the task definition or Docker image) with a <code>command</code> override. You can also
     *        override existing environment variables (that are specified in the task definition or Docker image) on a
     *        container or add new environment variables to it with an <code>environment</code> override.</p> <note>
     *        <p>
     *        A total of 8192 characters are allowed for overrides. This limit includes the JSON formatting characters
     *        of the override structure.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withOverrides(TaskOverride overrides) {
        setOverrides(overrides);
        return this;
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
        if (placementConstraints == null) {
            placementConstraints = new com.amazonaws.internal.SdkInternalList<PlacementConstraint>();
        }
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

        this.placementConstraints = new com.amazonaws.internal.SdkInternalList<PlacementConstraint>(placementConstraints);
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

    public RunTaskRequest withPlacementConstraints(PlacementConstraint... placementConstraints) {
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
     * An array of placement constraint objects to use for the task. You can specify up to 10 constraints per task
     * (including constraints in the task definition and those specified at runtime).
     * </p>
     * 
     * @param placementConstraints
     *        An array of placement constraint objects to use for the task. You can specify up to 10 constraints per
     *        task (including constraints in the task definition and those specified at runtime).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withPlacementConstraints(java.util.Collection<PlacementConstraint> placementConstraints) {
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
        if (placementStrategy == null) {
            placementStrategy = new com.amazonaws.internal.SdkInternalList<PlacementStrategy>();
        }
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

        this.placementStrategy = new com.amazonaws.internal.SdkInternalList<PlacementStrategy>(placementStrategy);
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

    public RunTaskRequest withPlacementStrategy(PlacementStrategy... placementStrategy) {
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
     * The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per task.
     * </p>
     * 
     * @param placementStrategy
     *        The placement strategy objects to use for the task. You can specify a maximum of five strategy rules per
     *        task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withPlacementStrategy(java.util.Collection<PlacementStrategy> placementStrategy) {
        setPlacementStrategy(placementStrategy);
        return this;
    }

    /**
     * <p>
     * The platform version the task should run. A platform version is only specified for tasks using the Fargate launch
     * type. If one is not specified, the <code>LATEST</code> platform version is used by default. For more information,
     * see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     * Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version the task should run. A platform version is only specified for tasks using the Fargate
     *        launch type. If one is not specified, the <code>LATEST</code> platform version is used by default. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public void setPlatformVersion(String platformVersion) {
        this.platformVersion = platformVersion;
    }

    /**
     * <p>
     * The platform version the task should run. A platform version is only specified for tasks using the Fargate launch
     * type. If one is not specified, the <code>LATEST</code> platform version is used by default. For more information,
     * see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     * Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @return The platform version the task should run. A platform version is only specified for tasks using the
     *         Fargate launch type. If one is not specified, the <code>LATEST</code> platform version is used by
     *         default. For more information, see <a
     *         href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *         Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     */

    public String getPlatformVersion() {
        return this.platformVersion;
    }

    /**
     * <p>
     * The platform version the task should run. A platform version is only specified for tasks using the Fargate launch
     * type. If one is not specified, the <code>LATEST</code> platform version is used by default. For more information,
     * see <a href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     * Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * </p>
     * 
     * @param platformVersion
     *        The platform version the task should run. A platform version is only specified for tasks using the Fargate
     *        launch type. If one is not specified, the <code>LATEST</code> platform version is used by default. For
     *        more information, see <a
     *        href="https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html">AWS Fargate
     *        Platform Versions</a> in the <i>Amazon Elastic Container Service Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withPlatformVersion(String platformVersion) {
        setPlatformVersion(platformVersion);
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the task during task creation. To add tags to a task after
     * task creation, use the <a>TagResource</a> API action.
     * </p>
     * <note>
     * <p>
     * An error will be received if you specify the <code>SERVICE</code> option when running a task.
     * </p>
     * </note>
     * 
     * @param propagateTags
     *        Specifies whether to propagate the tags from the task definition to the task. If no value is specified,
     *        the tags are not propagated. Tags can only be propagated to the task during task creation. To add tags to
     *        a task after task creation, use the <a>TagResource</a> API action.</p> <note>
     *        <p>
     *        An error will be received if you specify the <code>SERVICE</code> option when running a task.
     *        </p>
     * @see PropagateTags
     */

    public void setPropagateTags(String propagateTags) {
        this.propagateTags = propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the task during task creation. To add tags to a task after
     * task creation, use the <a>TagResource</a> API action.
     * </p>
     * <note>
     * <p>
     * An error will be received if you specify the <code>SERVICE</code> option when running a task.
     * </p>
     * </note>
     * 
     * @return Specifies whether to propagate the tags from the task definition to the task. If no value is specified,
     *         the tags are not propagated. Tags can only be propagated to the task during task creation. To add tags to
     *         a task after task creation, use the <a>TagResource</a> API action.</p> <note>
     *         <p>
     *         An error will be received if you specify the <code>SERVICE</code> option when running a task.
     *         </p>
     * @see PropagateTags
     */

    public String getPropagateTags() {
        return this.propagateTags;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the task during task creation. To add tags to a task after
     * task creation, use the <a>TagResource</a> API action.
     * </p>
     * <note>
     * <p>
     * An error will be received if you specify the <code>SERVICE</code> option when running a task.
     * </p>
     * </note>
     * 
     * @param propagateTags
     *        Specifies whether to propagate the tags from the task definition to the task. If no value is specified,
     *        the tags are not propagated. Tags can only be propagated to the task during task creation. To add tags to
     *        a task after task creation, use the <a>TagResource</a> API action.</p> <note>
     *        <p>
     *        An error will be received if you specify the <code>SERVICE</code> option when running a task.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropagateTags
     */

    public RunTaskRequest withPropagateTags(String propagateTags) {
        setPropagateTags(propagateTags);
        return this;
    }

    /**
     * <p>
     * Specifies whether to propagate the tags from the task definition to the task. If no value is specified, the tags
     * are not propagated. Tags can only be propagated to the task during task creation. To add tags to a task after
     * task creation, use the <a>TagResource</a> API action.
     * </p>
     * <note>
     * <p>
     * An error will be received if you specify the <code>SERVICE</code> option when running a task.
     * </p>
     * </note>
     * 
     * @param propagateTags
     *        Specifies whether to propagate the tags from the task definition to the task. If no value is specified,
     *        the tags are not propagated. Tags can only be propagated to the task during task creation. To add tags to
     *        a task after task creation, use the <a>TagResource</a> API action.</p> <note>
     *        <p>
     *        An error will be received if you specify the <code>SERVICE</code> option when running a task.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see PropagateTags
     */

    public RunTaskRequest withPropagateTags(PropagateTags propagateTags) {
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

    public RunTaskRequest withReferenceId(String referenceId) {
        setReferenceId(referenceId);
        return this;
    }

    /**
     * <p>
     * An optional tag specified when a task is started. For example, if you automatically trigger a task to run a batch
     * process job, you could apply a unique identifier for that job to your task with the <code>startedBy</code>
     * parameter. You can then identify which tasks belong to that job by filtering the results of a <a>ListTasks</a>
     * call with the <code>startedBy</code> value. Up to 36 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * <p>
     * If a task is started by an Amazon ECS service, then the <code>startedBy</code> parameter contains the deployment
     * ID of the service that starts it.
     * </p>
     * 
     * @param startedBy
     *        An optional tag specified when a task is started. For example, if you automatically trigger a task to run
     *        a batch process job, you could apply a unique identifier for that job to your task with the
     *        <code>startedBy</code> parameter. You can then identify which tasks belong to that job by filtering the
     *        results of a <a>ListTasks</a> call with the <code>startedBy</code> value. Up to 36 letters (uppercase and
     *        lowercase), numbers, hyphens, and underscores are allowed.</p>
     *        <p>
     *        If a task is started by an Amazon ECS service, then the <code>startedBy</code> parameter contains the
     *        deployment ID of the service that starts it.
     */

    public void setStartedBy(String startedBy) {
        this.startedBy = startedBy;
    }

    /**
     * <p>
     * An optional tag specified when a task is started. For example, if you automatically trigger a task to run a batch
     * process job, you could apply a unique identifier for that job to your task with the <code>startedBy</code>
     * parameter. You can then identify which tasks belong to that job by filtering the results of a <a>ListTasks</a>
     * call with the <code>startedBy</code> value. Up to 36 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * <p>
     * If a task is started by an Amazon ECS service, then the <code>startedBy</code> parameter contains the deployment
     * ID of the service that starts it.
     * </p>
     * 
     * @return An optional tag specified when a task is started. For example, if you automatically trigger a task to run
     *         a batch process job, you could apply a unique identifier for that job to your task with the
     *         <code>startedBy</code> parameter. You can then identify which tasks belong to that job by filtering the
     *         results of a <a>ListTasks</a> call with the <code>startedBy</code> value. Up to 36 letters (uppercase and
     *         lowercase), numbers, hyphens, and underscores are allowed.</p>
     *         <p>
     *         If a task is started by an Amazon ECS service, then the <code>startedBy</code> parameter contains the
     *         deployment ID of the service that starts it.
     */

    public String getStartedBy() {
        return this.startedBy;
    }

    /**
     * <p>
     * An optional tag specified when a task is started. For example, if you automatically trigger a task to run a batch
     * process job, you could apply a unique identifier for that job to your task with the <code>startedBy</code>
     * parameter. You can then identify which tasks belong to that job by filtering the results of a <a>ListTasks</a>
     * call with the <code>startedBy</code> value. Up to 36 letters (uppercase and lowercase), numbers, hyphens, and
     * underscores are allowed.
     * </p>
     * <p>
     * If a task is started by an Amazon ECS service, then the <code>startedBy</code> parameter contains the deployment
     * ID of the service that starts it.
     * </p>
     * 
     * @param startedBy
     *        An optional tag specified when a task is started. For example, if you automatically trigger a task to run
     *        a batch process job, you could apply a unique identifier for that job to your task with the
     *        <code>startedBy</code> parameter. You can then identify which tasks belong to that job by filtering the
     *        results of a <a>ListTasks</a> call with the <code>startedBy</code> value. Up to 36 letters (uppercase and
     *        lowercase), numbers, hyphens, and underscores are allowed.</p>
     *        <p>
     *        If a task is started by an Amazon ECS service, then the <code>startedBy</code> parameter contains the
     *        deployment ID of the service that starts it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withStartedBy(String startedBy) {
        setStartedBy(startedBy);
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this
     * prefix. Tags with this prefix do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a
     *         key and an optional value, both of which you define.</p>
     *         <p>
     *         The following basic restrictions apply to tags:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Maximum number of tags per resource - 50
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For each resource, each tag key must be unique, and each tag key can have only one value.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum key length - 128 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Maximum value length - 256 Unicode characters in UTF-8
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         If your tagging schema is used across multiple services and resources, remember that other services may
     *         have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *         representable in UTF-8, and the following characters: + - = . _ : / @.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Tag keys and values are case-sensitive.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a
     *         prefix for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or
     *         values with this prefix. Tags with this prefix do not count against your tags per resource limit.
     *         </p>
     *         </li>
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this
     * prefix. Tags with this prefix do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a
     *        key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case-sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix
     *        for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with
     *        this prefix. Tags with this prefix do not count against your tags per resource limit.
     *        </p>
     *        </li>
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
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this
     * prefix. Tags with this prefix do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a
     *        key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case-sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix
     *        for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with
     *        this prefix. Tags with this prefix do not count against your tags per resource limit.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withTags(Tag... tags) {
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
     * The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a key and
     * an optional value, both of which you define.
     * </p>
     * <p>
     * The following basic restrictions apply to tags:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Maximum number of tags per resource - 50
     * </p>
     * </li>
     * <li>
     * <p>
     * For each resource, each tag key must be unique, and each tag key can have only one value.
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum key length - 128 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * Maximum value length - 256 Unicode characters in UTF-8
     * </p>
     * </li>
     * <li>
     * <p>
     * If your tagging schema is used across multiple services and resources, remember that other services may have
     * restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces representable
     * in UTF-8, and the following characters: + - = . _ : / @.
     * </p>
     * </li>
     * <li>
     * <p>
     * Tag keys and values are case-sensitive.
     * </p>
     * </li>
     * <li>
     * <p>
     * Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix for
     * either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with this
     * prefix. Tags with this prefix do not count against your tags per resource limit.
     * </p>
     * </li>
     * </ul>
     * 
     * @param tags
     *        The metadata that you apply to the task to help you categorize and organize them. Each tag consists of a
     *        key and an optional value, both of which you define.</p>
     *        <p>
     *        The following basic restrictions apply to tags:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Maximum number of tags per resource - 50
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For each resource, each tag key must be unique, and each tag key can have only one value.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum key length - 128 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Maximum value length - 256 Unicode characters in UTF-8
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        If your tagging schema is used across multiple services and resources, remember that other services may
     *        have restrictions on allowed characters. Generally allowed characters are: letters, numbers, and spaces
     *        representable in UTF-8, and the following characters: + - = . _ : / @.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Tag keys and values are case-sensitive.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Do not use <code>aws:</code>, <code>AWS:</code>, or any upper or lowercase combination of such as a prefix
     *        for either keys or values as it is reserved for AWS use. You cannot edit or delete tag keys or values with
     *        this prefix. Tags with this prefix do not count against your tags per resource limit.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code> revision is used.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *        definition to run. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code> revision is
     *        used.
     */

    public void setTaskDefinition(String taskDefinition) {
        this.taskDefinition = taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code> revision is used.
     * </p>
     * 
     * @return The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *         definition to run. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code> revision
     *         is used.
     */

    public String getTaskDefinition() {
        return this.taskDefinition;
    }

    /**
     * <p>
     * The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     * definition to run. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code> revision is used.
     * </p>
     * 
     * @param taskDefinition
     *        The <code>family</code> and <code>revision</code> (<code>family:revision</code>) or full ARN of the task
     *        definition to run. If a <code>revision</code> is not specified, the latest <code>ACTIVE</code> revision is
     *        used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RunTaskRequest withTaskDefinition(String taskDefinition) {
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
        if (getCount() != null)
            sb.append("Count: ").append(getCount()).append(",");
        if (getEnableECSManagedTags() != null)
            sb.append("EnableECSManagedTags: ").append(getEnableECSManagedTags()).append(",");
        if (getGroup() != null)
            sb.append("Group: ").append(getGroup()).append(",");
        if (getLaunchType() != null)
            sb.append("LaunchType: ").append(getLaunchType()).append(",");
        if (getNetworkConfiguration() != null)
            sb.append("NetworkConfiguration: ").append(getNetworkConfiguration()).append(",");
        if (getOverrides() != null)
            sb.append("Overrides: ").append(getOverrides()).append(",");
        if (getPlacementConstraints() != null)
            sb.append("PlacementConstraints: ").append(getPlacementConstraints()).append(",");
        if (getPlacementStrategy() != null)
            sb.append("PlacementStrategy: ").append(getPlacementStrategy()).append(",");
        if (getPlatformVersion() != null)
            sb.append("PlatformVersion: ").append(getPlatformVersion()).append(",");
        if (getPropagateTags() != null)
            sb.append("PropagateTags: ").append(getPropagateTags()).append(",");
        if (getReferenceId() != null)
            sb.append("ReferenceId: ").append(getReferenceId()).append(",");
        if (getStartedBy() != null)
            sb.append("StartedBy: ").append(getStartedBy()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
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

        if (obj instanceof RunTaskRequest == false)
            return false;
        RunTaskRequest other = (RunTaskRequest) obj;
        if (other.getCapacityProviderStrategy() == null ^ this.getCapacityProviderStrategy() == null)
            return false;
        if (other.getCapacityProviderStrategy() != null && other.getCapacityProviderStrategy().equals(this.getCapacityProviderStrategy()) == false)
            return false;
        if (other.getCluster() == null ^ this.getCluster() == null)
            return false;
        if (other.getCluster() != null && other.getCluster().equals(this.getCluster()) == false)
            return false;
        if (other.getCount() == null ^ this.getCount() == null)
            return false;
        if (other.getCount() != null && other.getCount().equals(this.getCount()) == false)
            return false;
        if (other.getEnableECSManagedTags() == null ^ this.getEnableECSManagedTags() == null)
            return false;
        if (other.getEnableECSManagedTags() != null && other.getEnableECSManagedTags().equals(this.getEnableECSManagedTags()) == false)
            return false;
        if (other.getGroup() == null ^ this.getGroup() == null)
            return false;
        if (other.getGroup() != null && other.getGroup().equals(this.getGroup()) == false)
            return false;
        if (other.getLaunchType() == null ^ this.getLaunchType() == null)
            return false;
        if (other.getLaunchType() != null && other.getLaunchType().equals(this.getLaunchType()) == false)
            return false;
        if (other.getNetworkConfiguration() == null ^ this.getNetworkConfiguration() == null)
            return false;
        if (other.getNetworkConfiguration() != null && other.getNetworkConfiguration().equals(this.getNetworkConfiguration()) == false)
            return false;
        if (other.getOverrides() == null ^ this.getOverrides() == null)
            return false;
        if (other.getOverrides() != null && other.getOverrides().equals(this.getOverrides()) == false)
            return false;
        if (other.getPlacementConstraints() == null ^ this.getPlacementConstraints() == null)
            return false;
        if (other.getPlacementConstraints() != null && other.getPlacementConstraints().equals(this.getPlacementConstraints()) == false)
            return false;
        if (other.getPlacementStrategy() == null ^ this.getPlacementStrategy() == null)
            return false;
        if (other.getPlacementStrategy() != null && other.getPlacementStrategy().equals(this.getPlacementStrategy()) == false)
            return false;
        if (other.getPlatformVersion() == null ^ this.getPlatformVersion() == null)
            return false;
        if (other.getPlatformVersion() != null && other.getPlatformVersion().equals(this.getPlatformVersion()) == false)
            return false;
        if (other.getPropagateTags() == null ^ this.getPropagateTags() == null)
            return false;
        if (other.getPropagateTags() != null && other.getPropagateTags().equals(this.getPropagateTags()) == false)
            return false;
        if (other.getReferenceId() == null ^ this.getReferenceId() == null)
            return false;
        if (other.getReferenceId() != null && other.getReferenceId().equals(this.getReferenceId()) == false)
            return false;
        if (other.getStartedBy() == null ^ this.getStartedBy() == null)
            return false;
        if (other.getStartedBy() != null && other.getStartedBy().equals(this.getStartedBy()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
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
        hashCode = prime * hashCode + ((getCount() == null) ? 0 : getCount().hashCode());
        hashCode = prime * hashCode + ((getEnableECSManagedTags() == null) ? 0 : getEnableECSManagedTags().hashCode());
        hashCode = prime * hashCode + ((getGroup() == null) ? 0 : getGroup().hashCode());
        hashCode = prime * hashCode + ((getLaunchType() == null) ? 0 : getLaunchType().hashCode());
        hashCode = prime * hashCode + ((getNetworkConfiguration() == null) ? 0 : getNetworkConfiguration().hashCode());
        hashCode = prime * hashCode + ((getOverrides() == null) ? 0 : getOverrides().hashCode());
        hashCode = prime * hashCode + ((getPlacementConstraints() == null) ? 0 : getPlacementConstraints().hashCode());
        hashCode = prime * hashCode + ((getPlacementStrategy() == null) ? 0 : getPlacementStrategy().hashCode());
        hashCode = prime * hashCode + ((getPlatformVersion() == null) ? 0 : getPlatformVersion().hashCode());
        hashCode = prime * hashCode + ((getPropagateTags() == null) ? 0 : getPropagateTags().hashCode());
        hashCode = prime * hashCode + ((getReferenceId() == null) ? 0 : getReferenceId().hashCode());
        hashCode = prime * hashCode + ((getStartedBy() == null) ? 0 : getStartedBy().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getTaskDefinition() == null) ? 0 : getTaskDefinition().hashCode());
        return hashCode;
    }

    @Override
    public RunTaskRequest clone() {
        return (RunTaskRequest) super.clone();
    }

}
