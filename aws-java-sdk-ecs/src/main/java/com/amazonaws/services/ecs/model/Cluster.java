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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A regional grouping of one or more container instances on which you can run task requests. Each account receives a
 * default cluster the first time you use the Amazon ECS service, but you may also create other clusters. Clusters may
 * contain more than one instance type simultaneously.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/Cluster" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Cluster implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the cluster. The ARN contains the <code>arn:aws:ecs</code>
     * namespace, followed by the Region of the cluster, the AWS account ID of the cluster owner, the
     * <code>cluster</code> namespace, and then the cluster name. For example,
     * <code>arn:aws:ecs:region:012345678910:cluster/test</code>.
     * </p>
     */
    private String clusterArn;
    /**
     * <p>
     * A user-generated string that you use to identify your cluster.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The status of the cluster. The following are the possible states that will be returned.
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The cluster is ready to accept tasks and if applicable you can register container instances with the cluster.
     * </p>
     * </dd>
     * <dt>PROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources needed for the capacity provider are
     * being created.
     * </p>
     * </dd>
     * <dt>DEPROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources needed for the capacity provider are
     * being deleted.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources needed for the capacity provider have
     * failed to create.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * The cluster has been deleted. Clusters with an <code>INACTIVE</code> status may remain discoverable in your
     * account for a period of time. However, this behavior is subject to change in the future, so you should not rely
     * on <code>INACTIVE</code> clusters persisting.
     * </p>
     * </dd>
     * </dl>
     */
    private String status;
    /**
     * <p>
     * The number of container instances registered into the cluster. This includes container instances in both
     * <code>ACTIVE</code> and <code>DRAINING</code> status.
     * </p>
     */
    private Integer registeredContainerInstancesCount;
    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code> state.
     * </p>
     */
    private Integer runningTasksCount;
    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code> state.
     * </p>
     */
    private Integer pendingTasksCount;
    /**
     * <p>
     * The number of services that are running on the cluster in an <code>ACTIVE</code> state. You can view these
     * services with <a>ListServices</a>.
     * </p>
     */
    private Integer activeServicesCount;
    /**
     * <p>
     * Additional information about your clusters that are separated by launch type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * RunningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     */
    private com.amazonaws.internal.SdkInternalList<KeyValuePair> statistics;
    /**
     * <p>
     * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define.
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
     * The settings for the cluster. This parameter indicates whether CloudWatch Container Insights is enabled or
     * disabled for a cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ClusterSetting> settings;
    /**
     * <p>
     * The capacity providers associated with the cluster.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> capacityProviders;
    /**
     * <p>
     * The default capacity provider strategy for the cluster. When services or tasks are run in the cluster with no
     * launch type or capacity provider strategy specified, the default capacity provider strategy is used.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem> defaultCapacityProviderStrategy;
    /**
     * <p>
     * The resources attached to a cluster. When using a capacity provider with a cluster, the Auto Scaling plan that is
     * created will be returned as a cluster attachment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Attachment> attachments;
    /**
     * <p>
     * The status of the capacity providers associated with the cluster. The following are the states that will be
     * returned:
     * </p>
     * <dl>
     * <dt>UPDATE_IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The available capacity providers for the cluster are updating. This occurs when the Auto Scaling plan is
     * provisioning or deprovisioning.
     * </p>
     * </dd>
     * <dt>UPDATE_COMPLETE</dt>
     * <dd>
     * <p>
     * The capacity providers have successfully updated.
     * </p>
     * </dd>
     * <dt>UPDATE_FAILED</dt>
     * <dd>
     * <p>
     * The capacity provider updates failed.
     * </p>
     * </dd>
     * </dl>
     */
    private String attachmentsStatus;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the cluster. The ARN contains the <code>arn:aws:ecs</code>
     * namespace, followed by the Region of the cluster, the AWS account ID of the cluster owner, the
     * <code>cluster</code> namespace, and then the cluster name. For example,
     * <code>arn:aws:ecs:region:012345678910:cluster/test</code>.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) that identifies the cluster. The ARN contains the <code>arn:aws:ecs</code>
     *        namespace, followed by the Region of the cluster, the AWS account ID of the cluster owner, the
     *        <code>cluster</code> namespace, and then the cluster name. For example,
     *        <code>arn:aws:ecs:region:012345678910:cluster/test</code>.
     */

    public void setClusterArn(String clusterArn) {
        this.clusterArn = clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the cluster. The ARN contains the <code>arn:aws:ecs</code>
     * namespace, followed by the Region of the cluster, the AWS account ID of the cluster owner, the
     * <code>cluster</code> namespace, and then the cluster name. For example,
     * <code>arn:aws:ecs:region:012345678910:cluster/test</code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the cluster. The ARN contains the <code>arn:aws:ecs</code>
     *         namespace, followed by the Region of the cluster, the AWS account ID of the cluster owner, the
     *         <code>cluster</code> namespace, and then the cluster name. For example,
     *         <code>arn:aws:ecs:region:012345678910:cluster/test</code>.
     */

    public String getClusterArn() {
        return this.clusterArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the cluster. The ARN contains the <code>arn:aws:ecs</code>
     * namespace, followed by the Region of the cluster, the AWS account ID of the cluster owner, the
     * <code>cluster</code> namespace, and then the cluster name. For example,
     * <code>arn:aws:ecs:region:012345678910:cluster/test</code>.
     * </p>
     * 
     * @param clusterArn
     *        The Amazon Resource Name (ARN) that identifies the cluster. The ARN contains the <code>arn:aws:ecs</code>
     *        namespace, followed by the Region of the cluster, the AWS account ID of the cluster owner, the
     *        <code>cluster</code> namespace, and then the cluster name. For example,
     *        <code>arn:aws:ecs:region:012345678910:cluster/test</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterArn(String clusterArn) {
        setClusterArn(clusterArn);
        return this;
    }

    /**
     * <p>
     * A user-generated string that you use to identify your cluster.
     * </p>
     * 
     * @param clusterName
     *        A user-generated string that you use to identify your cluster.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * A user-generated string that you use to identify your cluster.
     * </p>
     * 
     * @return A user-generated string that you use to identify your cluster.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * A user-generated string that you use to identify your cluster.
     * </p>
     * 
     * @param clusterName
     *        A user-generated string that you use to identify your cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The status of the cluster. The following are the possible states that will be returned.
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The cluster is ready to accept tasks and if applicable you can register container instances with the cluster.
     * </p>
     * </dd>
     * <dt>PROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources needed for the capacity provider are
     * being created.
     * </p>
     * </dd>
     * <dt>DEPROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources needed for the capacity provider are
     * being deleted.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources needed for the capacity provider have
     * failed to create.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * The cluster has been deleted. Clusters with an <code>INACTIVE</code> status may remain discoverable in your
     * account for a period of time. However, this behavior is subject to change in the future, so you should not rely
     * on <code>INACTIVE</code> clusters persisting.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the cluster. The following are the possible states that will be returned.</p>
     *        <dl>
     *        <dt>ACTIVE</dt>
     *        <dd>
     *        <p>
     *        The cluster is ready to accept tasks and if applicable you can register container instances with the
     *        cluster.
     *        </p>
     *        </dd>
     *        <dt>PROVISIONING</dt>
     *        <dd>
     *        <p>
     *        The cluster has capacity providers associated with it and the resources needed for the capacity provider
     *        are being created.
     *        </p>
     *        </dd>
     *        <dt>DEPROVISIONING</dt>
     *        <dd>
     *        <p>
     *        The cluster has capacity providers associated with it and the resources needed for the capacity provider
     *        are being deleted.
     *        </p>
     *        </dd>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        The cluster has capacity providers associated with it and the resources needed for the capacity provider
     *        have failed to create.
     *        </p>
     *        </dd>
     *        <dt>INACTIVE</dt>
     *        <dd>
     *        <p>
     *        The cluster has been deleted. Clusters with an <code>INACTIVE</code> status may remain discoverable in
     *        your account for a period of time. However, this behavior is subject to change in the future, so you
     *        should not rely on <code>INACTIVE</code> clusters persisting.
     *        </p>
     *        </dd>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the cluster. The following are the possible states that will be returned.
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The cluster is ready to accept tasks and if applicable you can register container instances with the cluster.
     * </p>
     * </dd>
     * <dt>PROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources needed for the capacity provider are
     * being created.
     * </p>
     * </dd>
     * <dt>DEPROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources needed for the capacity provider are
     * being deleted.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources needed for the capacity provider have
     * failed to create.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * The cluster has been deleted. Clusters with an <code>INACTIVE</code> status may remain discoverable in your
     * account for a period of time. However, this behavior is subject to change in the future, so you should not rely
     * on <code>INACTIVE</code> clusters persisting.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The status of the cluster. The following are the possible states that will be returned.</p>
     *         <dl>
     *         <dt>ACTIVE</dt>
     *         <dd>
     *         <p>
     *         The cluster is ready to accept tasks and if applicable you can register container instances with the
     *         cluster.
     *         </p>
     *         </dd>
     *         <dt>PROVISIONING</dt>
     *         <dd>
     *         <p>
     *         The cluster has capacity providers associated with it and the resources needed for the capacity provider
     *         are being created.
     *         </p>
     *         </dd>
     *         <dt>DEPROVISIONING</dt>
     *         <dd>
     *         <p>
     *         The cluster has capacity providers associated with it and the resources needed for the capacity provider
     *         are being deleted.
     *         </p>
     *         </dd>
     *         <dt>FAILED</dt>
     *         <dd>
     *         <p>
     *         The cluster has capacity providers associated with it and the resources needed for the capacity provider
     *         have failed to create.
     *         </p>
     *         </dd>
     *         <dt>INACTIVE</dt>
     *         <dd>
     *         <p>
     *         The cluster has been deleted. Clusters with an <code>INACTIVE</code> status may remain discoverable in
     *         your account for a period of time. However, this behavior is subject to change in the future, so you
     *         should not rely on <code>INACTIVE</code> clusters persisting.
     *         </p>
     *         </dd>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the cluster. The following are the possible states that will be returned.
     * </p>
     * <dl>
     * <dt>ACTIVE</dt>
     * <dd>
     * <p>
     * The cluster is ready to accept tasks and if applicable you can register container instances with the cluster.
     * </p>
     * </dd>
     * <dt>PROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources needed for the capacity provider are
     * being created.
     * </p>
     * </dd>
     * <dt>DEPROVISIONING</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources needed for the capacity provider are
     * being deleted.
     * </p>
     * </dd>
     * <dt>FAILED</dt>
     * <dd>
     * <p>
     * The cluster has capacity providers associated with it and the resources needed for the capacity provider have
     * failed to create.
     * </p>
     * </dd>
     * <dt>INACTIVE</dt>
     * <dd>
     * <p>
     * The cluster has been deleted. Clusters with an <code>INACTIVE</code> status may remain discoverable in your
     * account for a period of time. However, this behavior is subject to change in the future, so you should not rely
     * on <code>INACTIVE</code> clusters persisting.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param status
     *        The status of the cluster. The following are the possible states that will be returned.</p>
     *        <dl>
     *        <dt>ACTIVE</dt>
     *        <dd>
     *        <p>
     *        The cluster is ready to accept tasks and if applicable you can register container instances with the
     *        cluster.
     *        </p>
     *        </dd>
     *        <dt>PROVISIONING</dt>
     *        <dd>
     *        <p>
     *        The cluster has capacity providers associated with it and the resources needed for the capacity provider
     *        are being created.
     *        </p>
     *        </dd>
     *        <dt>DEPROVISIONING</dt>
     *        <dd>
     *        <p>
     *        The cluster has capacity providers associated with it and the resources needed for the capacity provider
     *        are being deleted.
     *        </p>
     *        </dd>
     *        <dt>FAILED</dt>
     *        <dd>
     *        <p>
     *        The cluster has capacity providers associated with it and the resources needed for the capacity provider
     *        have failed to create.
     *        </p>
     *        </dd>
     *        <dt>INACTIVE</dt>
     *        <dd>
     *        <p>
     *        The cluster has been deleted. Clusters with an <code>INACTIVE</code> status may remain discoverable in
     *        your account for a period of time. However, this behavior is subject to change in the future, so you
     *        should not rely on <code>INACTIVE</code> clusters persisting.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The number of container instances registered into the cluster. This includes container instances in both
     * <code>ACTIVE</code> and <code>DRAINING</code> status.
     * </p>
     * 
     * @param registeredContainerInstancesCount
     *        The number of container instances registered into the cluster. This includes container instances in both
     *        <code>ACTIVE</code> and <code>DRAINING</code> status.
     */

    public void setRegisteredContainerInstancesCount(Integer registeredContainerInstancesCount) {
        this.registeredContainerInstancesCount = registeredContainerInstancesCount;
    }

    /**
     * <p>
     * The number of container instances registered into the cluster. This includes container instances in both
     * <code>ACTIVE</code> and <code>DRAINING</code> status.
     * </p>
     * 
     * @return The number of container instances registered into the cluster. This includes container instances in both
     *         <code>ACTIVE</code> and <code>DRAINING</code> status.
     */

    public Integer getRegisteredContainerInstancesCount() {
        return this.registeredContainerInstancesCount;
    }

    /**
     * <p>
     * The number of container instances registered into the cluster. This includes container instances in both
     * <code>ACTIVE</code> and <code>DRAINING</code> status.
     * </p>
     * 
     * @param registeredContainerInstancesCount
     *        The number of container instances registered into the cluster. This includes container instances in both
     *        <code>ACTIVE</code> and <code>DRAINING</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withRegisteredContainerInstancesCount(Integer registeredContainerInstancesCount) {
        setRegisteredContainerInstancesCount(registeredContainerInstancesCount);
        return this;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code> state.
     * </p>
     * 
     * @param runningTasksCount
     *        The number of tasks in the cluster that are in the <code>RUNNING</code> state.
     */

    public void setRunningTasksCount(Integer runningTasksCount) {
        this.runningTasksCount = runningTasksCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code> state.
     * </p>
     * 
     * @return The number of tasks in the cluster that are in the <code>RUNNING</code> state.
     */

    public Integer getRunningTasksCount() {
        return this.runningTasksCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>RUNNING</code> state.
     * </p>
     * 
     * @param runningTasksCount
     *        The number of tasks in the cluster that are in the <code>RUNNING</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withRunningTasksCount(Integer runningTasksCount) {
        setRunningTasksCount(runningTasksCount);
        return this;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code> state.
     * </p>
     * 
     * @param pendingTasksCount
     *        The number of tasks in the cluster that are in the <code>PENDING</code> state.
     */

    public void setPendingTasksCount(Integer pendingTasksCount) {
        this.pendingTasksCount = pendingTasksCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code> state.
     * </p>
     * 
     * @return The number of tasks in the cluster that are in the <code>PENDING</code> state.
     */

    public Integer getPendingTasksCount() {
        return this.pendingTasksCount;
    }

    /**
     * <p>
     * The number of tasks in the cluster that are in the <code>PENDING</code> state.
     * </p>
     * 
     * @param pendingTasksCount
     *        The number of tasks in the cluster that are in the <code>PENDING</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withPendingTasksCount(Integer pendingTasksCount) {
        setPendingTasksCount(pendingTasksCount);
        return this;
    }

    /**
     * <p>
     * The number of services that are running on the cluster in an <code>ACTIVE</code> state. You can view these
     * services with <a>ListServices</a>.
     * </p>
     * 
     * @param activeServicesCount
     *        The number of services that are running on the cluster in an <code>ACTIVE</code> state. You can view these
     *        services with <a>ListServices</a>.
     */

    public void setActiveServicesCount(Integer activeServicesCount) {
        this.activeServicesCount = activeServicesCount;
    }

    /**
     * <p>
     * The number of services that are running on the cluster in an <code>ACTIVE</code> state. You can view these
     * services with <a>ListServices</a>.
     * </p>
     * 
     * @return The number of services that are running on the cluster in an <code>ACTIVE</code> state. You can view
     *         these services with <a>ListServices</a>.
     */

    public Integer getActiveServicesCount() {
        return this.activeServicesCount;
    }

    /**
     * <p>
     * The number of services that are running on the cluster in an <code>ACTIVE</code> state. You can view these
     * services with <a>ListServices</a>.
     * </p>
     * 
     * @param activeServicesCount
     *        The number of services that are running on the cluster in an <code>ACTIVE</code> state. You can view these
     *        services with <a>ListServices</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withActiveServicesCount(Integer activeServicesCount) {
        setActiveServicesCount(activeServicesCount);
        return this;
    }

    /**
     * <p>
     * Additional information about your clusters that are separated by launch type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * RunningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * 
     * @return Additional information about your clusters that are separated by launch type, including:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         runningEC2TasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RunningFargateTasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         pendingEC2TasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         pendingFargateTasksCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         activeEC2ServiceCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         activeFargateServiceCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         drainingEC2ServiceCount
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         drainingFargateServiceCount
     *         </p>
     *         </li>
     */

    public java.util.List<KeyValuePair> getStatistics() {
        if (statistics == null) {
            statistics = new com.amazonaws.internal.SdkInternalList<KeyValuePair>();
        }
        return statistics;
    }

    /**
     * <p>
     * Additional information about your clusters that are separated by launch type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * RunningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistics
     *        Additional information about your clusters that are separated by launch type, including:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        runningEC2TasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RunningFargateTasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pendingEC2TasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pendingFargateTasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        activeEC2ServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        activeFargateServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        drainingEC2ServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        drainingFargateServiceCount
     *        </p>
     *        </li>
     */

    public void setStatistics(java.util.Collection<KeyValuePair> statistics) {
        if (statistics == null) {
            this.statistics = null;
            return;
        }

        this.statistics = new com.amazonaws.internal.SdkInternalList<KeyValuePair>(statistics);
    }

    /**
     * <p>
     * Additional information about your clusters that are separated by launch type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * RunningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setStatistics(java.util.Collection)} or {@link #withStatistics(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param statistics
     *        Additional information about your clusters that are separated by launch type, including:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        runningEC2TasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RunningFargateTasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pendingEC2TasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pendingFargateTasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        activeEC2ServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        activeFargateServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        drainingEC2ServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        drainingFargateServiceCount
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withStatistics(KeyValuePair... statistics) {
        if (this.statistics == null) {
            setStatistics(new com.amazonaws.internal.SdkInternalList<KeyValuePair>(statistics.length));
        }
        for (KeyValuePair ele : statistics) {
            this.statistics.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Additional information about your clusters that are separated by launch type, including:
     * </p>
     * <ul>
     * <li>
     * <p>
     * runningEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * RunningFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingEC2TasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * pendingFargateTasksCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * activeFargateServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingEC2ServiceCount
     * </p>
     * </li>
     * <li>
     * <p>
     * drainingFargateServiceCount
     * </p>
     * </li>
     * </ul>
     * 
     * @param statistics
     *        Additional information about your clusters that are separated by launch type, including:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        runningEC2TasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RunningFargateTasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pendingEC2TasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        pendingFargateTasksCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        activeEC2ServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        activeFargateServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        drainingEC2ServiceCount
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        drainingFargateServiceCount
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withStatistics(java.util.Collection<KeyValuePair> statistics) {
        setStatistics(statistics);
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define.
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
     * @return The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of
     *         a key and an optional value, both of which you define.</p>
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
     * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define.
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
     *        The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of
     *        a key and an optional value, both of which you define.</p>
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
     * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define.
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
     *        The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of
     *        a key and an optional value, both of which you define.</p>
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

    public Cluster withTags(Tag... tags) {
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
     * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define.
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
     *        The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of
     *        a key and an optional value, both of which you define.</p>
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

    public Cluster withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The settings for the cluster. This parameter indicates whether CloudWatch Container Insights is enabled or
     * disabled for a cluster.
     * </p>
     * 
     * @return The settings for the cluster. This parameter indicates whether CloudWatch Container Insights is enabled
     *         or disabled for a cluster.
     */

    public java.util.List<ClusterSetting> getSettings() {
        if (settings == null) {
            settings = new com.amazonaws.internal.SdkInternalList<ClusterSetting>();
        }
        return settings;
    }

    /**
     * <p>
     * The settings for the cluster. This parameter indicates whether CloudWatch Container Insights is enabled or
     * disabled for a cluster.
     * </p>
     * 
     * @param settings
     *        The settings for the cluster. This parameter indicates whether CloudWatch Container Insights is enabled or
     *        disabled for a cluster.
     */

    public void setSettings(java.util.Collection<ClusterSetting> settings) {
        if (settings == null) {
            this.settings = null;
            return;
        }

        this.settings = new com.amazonaws.internal.SdkInternalList<ClusterSetting>(settings);
    }

    /**
     * <p>
     * The settings for the cluster. This parameter indicates whether CloudWatch Container Insights is enabled or
     * disabled for a cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSettings(java.util.Collection)} or {@link #withSettings(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param settings
     *        The settings for the cluster. This parameter indicates whether CloudWatch Container Insights is enabled or
     *        disabled for a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSettings(ClusterSetting... settings) {
        if (this.settings == null) {
            setSettings(new com.amazonaws.internal.SdkInternalList<ClusterSetting>(settings.length));
        }
        for (ClusterSetting ele : settings) {
            this.settings.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The settings for the cluster. This parameter indicates whether CloudWatch Container Insights is enabled or
     * disabled for a cluster.
     * </p>
     * 
     * @param settings
     *        The settings for the cluster. This parameter indicates whether CloudWatch Container Insights is enabled or
     *        disabled for a cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withSettings(java.util.Collection<ClusterSetting> settings) {
        setSettings(settings);
        return this;
    }

    /**
     * <p>
     * The capacity providers associated with the cluster.
     * </p>
     * 
     * @return The capacity providers associated with the cluster.
     */

    public java.util.List<String> getCapacityProviders() {
        if (capacityProviders == null) {
            capacityProviders = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return capacityProviders;
    }

    /**
     * <p>
     * The capacity providers associated with the cluster.
     * </p>
     * 
     * @param capacityProviders
     *        The capacity providers associated with the cluster.
     */

    public void setCapacityProviders(java.util.Collection<String> capacityProviders) {
        if (capacityProviders == null) {
            this.capacityProviders = null;
            return;
        }

        this.capacityProviders = new com.amazonaws.internal.SdkInternalList<String>(capacityProviders);
    }

    /**
     * <p>
     * The capacity providers associated with the cluster.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapacityProviders(java.util.Collection)} or {@link #withCapacityProviders(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param capacityProviders
     *        The capacity providers associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withCapacityProviders(String... capacityProviders) {
        if (this.capacityProviders == null) {
            setCapacityProviders(new com.amazonaws.internal.SdkInternalList<String>(capacityProviders.length));
        }
        for (String ele : capacityProviders) {
            this.capacityProviders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capacity providers associated with the cluster.
     * </p>
     * 
     * @param capacityProviders
     *        The capacity providers associated with the cluster.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withCapacityProviders(java.util.Collection<String> capacityProviders) {
        setCapacityProviders(capacityProviders);
        return this;
    }

    /**
     * <p>
     * The default capacity provider strategy for the cluster. When services or tasks are run in the cluster with no
     * launch type or capacity provider strategy specified, the default capacity provider strategy is used.
     * </p>
     * 
     * @return The default capacity provider strategy for the cluster. When services or tasks are run in the cluster
     *         with no launch type or capacity provider strategy specified, the default capacity provider strategy is
     *         used.
     */

    public java.util.List<CapacityProviderStrategyItem> getDefaultCapacityProviderStrategy() {
        if (defaultCapacityProviderStrategy == null) {
            defaultCapacityProviderStrategy = new com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem>();
        }
        return defaultCapacityProviderStrategy;
    }

    /**
     * <p>
     * The default capacity provider strategy for the cluster. When services or tasks are run in the cluster with no
     * launch type or capacity provider strategy specified, the default capacity provider strategy is used.
     * </p>
     * 
     * @param defaultCapacityProviderStrategy
     *        The default capacity provider strategy for the cluster. When services or tasks are run in the cluster with
     *        no launch type or capacity provider strategy specified, the default capacity provider strategy is used.
     */

    public void setDefaultCapacityProviderStrategy(java.util.Collection<CapacityProviderStrategyItem> defaultCapacityProviderStrategy) {
        if (defaultCapacityProviderStrategy == null) {
            this.defaultCapacityProviderStrategy = null;
            return;
        }

        this.defaultCapacityProviderStrategy = new com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem>(defaultCapacityProviderStrategy);
    }

    /**
     * <p>
     * The default capacity provider strategy for the cluster. When services or tasks are run in the cluster with no
     * launch type or capacity provider strategy specified, the default capacity provider strategy is used.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDefaultCapacityProviderStrategy(java.util.Collection)} or
     * {@link #withDefaultCapacityProviderStrategy(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param defaultCapacityProviderStrategy
     *        The default capacity provider strategy for the cluster. When services or tasks are run in the cluster with
     *        no launch type or capacity provider strategy specified, the default capacity provider strategy is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withDefaultCapacityProviderStrategy(CapacityProviderStrategyItem... defaultCapacityProviderStrategy) {
        if (this.defaultCapacityProviderStrategy == null) {
            setDefaultCapacityProviderStrategy(new com.amazonaws.internal.SdkInternalList<CapacityProviderStrategyItem>(defaultCapacityProviderStrategy.length));
        }
        for (CapacityProviderStrategyItem ele : defaultCapacityProviderStrategy) {
            this.defaultCapacityProviderStrategy.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The default capacity provider strategy for the cluster. When services or tasks are run in the cluster with no
     * launch type or capacity provider strategy specified, the default capacity provider strategy is used.
     * </p>
     * 
     * @param defaultCapacityProviderStrategy
     *        The default capacity provider strategy for the cluster. When services or tasks are run in the cluster with
     *        no launch type or capacity provider strategy specified, the default capacity provider strategy is used.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withDefaultCapacityProviderStrategy(java.util.Collection<CapacityProviderStrategyItem> defaultCapacityProviderStrategy) {
        setDefaultCapacityProviderStrategy(defaultCapacityProviderStrategy);
        return this;
    }

    /**
     * <p>
     * The resources attached to a cluster. When using a capacity provider with a cluster, the Auto Scaling plan that is
     * created will be returned as a cluster attachment.
     * </p>
     * 
     * @return The resources attached to a cluster. When using a capacity provider with a cluster, the Auto Scaling plan
     *         that is created will be returned as a cluster attachment.
     */

    public java.util.List<Attachment> getAttachments() {
        if (attachments == null) {
            attachments = new com.amazonaws.internal.SdkInternalList<Attachment>();
        }
        return attachments;
    }

    /**
     * <p>
     * The resources attached to a cluster. When using a capacity provider with a cluster, the Auto Scaling plan that is
     * created will be returned as a cluster attachment.
     * </p>
     * 
     * @param attachments
     *        The resources attached to a cluster. When using a capacity provider with a cluster, the Auto Scaling plan
     *        that is created will be returned as a cluster attachment.
     */

    public void setAttachments(java.util.Collection<Attachment> attachments) {
        if (attachments == null) {
            this.attachments = null;
            return;
        }

        this.attachments = new com.amazonaws.internal.SdkInternalList<Attachment>(attachments);
    }

    /**
     * <p>
     * The resources attached to a cluster. When using a capacity provider with a cluster, the Auto Scaling plan that is
     * created will be returned as a cluster attachment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttachments(java.util.Collection)} or {@link #withAttachments(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attachments
     *        The resources attached to a cluster. When using a capacity provider with a cluster, the Auto Scaling plan
     *        that is created will be returned as a cluster attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withAttachments(Attachment... attachments) {
        if (this.attachments == null) {
            setAttachments(new com.amazonaws.internal.SdkInternalList<Attachment>(attachments.length));
        }
        for (Attachment ele : attachments) {
            this.attachments.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The resources attached to a cluster. When using a capacity provider with a cluster, the Auto Scaling plan that is
     * created will be returned as a cluster attachment.
     * </p>
     * 
     * @param attachments
     *        The resources attached to a cluster. When using a capacity provider with a cluster, the Auto Scaling plan
     *        that is created will be returned as a cluster attachment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withAttachments(java.util.Collection<Attachment> attachments) {
        setAttachments(attachments);
        return this;
    }

    /**
     * <p>
     * The status of the capacity providers associated with the cluster. The following are the states that will be
     * returned:
     * </p>
     * <dl>
     * <dt>UPDATE_IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The available capacity providers for the cluster are updating. This occurs when the Auto Scaling plan is
     * provisioning or deprovisioning.
     * </p>
     * </dd>
     * <dt>UPDATE_COMPLETE</dt>
     * <dd>
     * <p>
     * The capacity providers have successfully updated.
     * </p>
     * </dd>
     * <dt>UPDATE_FAILED</dt>
     * <dd>
     * <p>
     * The capacity provider updates failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param attachmentsStatus
     *        The status of the capacity providers associated with the cluster. The following are the states that will
     *        be returned:</p>
     *        <dl>
     *        <dt>UPDATE_IN_PROGRESS</dt>
     *        <dd>
     *        <p>
     *        The available capacity providers for the cluster are updating. This occurs when the Auto Scaling plan is
     *        provisioning or deprovisioning.
     *        </p>
     *        </dd>
     *        <dt>UPDATE_COMPLETE</dt>
     *        <dd>
     *        <p>
     *        The capacity providers have successfully updated.
     *        </p>
     *        </dd>
     *        <dt>UPDATE_FAILED</dt>
     *        <dd>
     *        <p>
     *        The capacity provider updates failed.
     *        </p>
     *        </dd>
     */

    public void setAttachmentsStatus(String attachmentsStatus) {
        this.attachmentsStatus = attachmentsStatus;
    }

    /**
     * <p>
     * The status of the capacity providers associated with the cluster. The following are the states that will be
     * returned:
     * </p>
     * <dl>
     * <dt>UPDATE_IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The available capacity providers for the cluster are updating. This occurs when the Auto Scaling plan is
     * provisioning or deprovisioning.
     * </p>
     * </dd>
     * <dt>UPDATE_COMPLETE</dt>
     * <dd>
     * <p>
     * The capacity providers have successfully updated.
     * </p>
     * </dd>
     * <dt>UPDATE_FAILED</dt>
     * <dd>
     * <p>
     * The capacity provider updates failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The status of the capacity providers associated with the cluster. The following are the states that will
     *         be returned:</p>
     *         <dl>
     *         <dt>UPDATE_IN_PROGRESS</dt>
     *         <dd>
     *         <p>
     *         The available capacity providers for the cluster are updating. This occurs when the Auto Scaling plan is
     *         provisioning or deprovisioning.
     *         </p>
     *         </dd>
     *         <dt>UPDATE_COMPLETE</dt>
     *         <dd>
     *         <p>
     *         The capacity providers have successfully updated.
     *         </p>
     *         </dd>
     *         <dt>UPDATE_FAILED</dt>
     *         <dd>
     *         <p>
     *         The capacity provider updates failed.
     *         </p>
     *         </dd>
     */

    public String getAttachmentsStatus() {
        return this.attachmentsStatus;
    }

    /**
     * <p>
     * The status of the capacity providers associated with the cluster. The following are the states that will be
     * returned:
     * </p>
     * <dl>
     * <dt>UPDATE_IN_PROGRESS</dt>
     * <dd>
     * <p>
     * The available capacity providers for the cluster are updating. This occurs when the Auto Scaling plan is
     * provisioning or deprovisioning.
     * </p>
     * </dd>
     * <dt>UPDATE_COMPLETE</dt>
     * <dd>
     * <p>
     * The capacity providers have successfully updated.
     * </p>
     * </dd>
     * <dt>UPDATE_FAILED</dt>
     * <dd>
     * <p>
     * The capacity provider updates failed.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param attachmentsStatus
     *        The status of the capacity providers associated with the cluster. The following are the states that will
     *        be returned:</p>
     *        <dl>
     *        <dt>UPDATE_IN_PROGRESS</dt>
     *        <dd>
     *        <p>
     *        The available capacity providers for the cluster are updating. This occurs when the Auto Scaling plan is
     *        provisioning or deprovisioning.
     *        </p>
     *        </dd>
     *        <dt>UPDATE_COMPLETE</dt>
     *        <dd>
     *        <p>
     *        The capacity providers have successfully updated.
     *        </p>
     *        </dd>
     *        <dt>UPDATE_FAILED</dt>
     *        <dd>
     *        <p>
     *        The capacity provider updates failed.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Cluster withAttachmentsStatus(String attachmentsStatus) {
        setAttachmentsStatus(attachmentsStatus);
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
        if (getClusterArn() != null)
            sb.append("ClusterArn: ").append(getClusterArn()).append(",");
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getRegisteredContainerInstancesCount() != null)
            sb.append("RegisteredContainerInstancesCount: ").append(getRegisteredContainerInstancesCount()).append(",");
        if (getRunningTasksCount() != null)
            sb.append("RunningTasksCount: ").append(getRunningTasksCount()).append(",");
        if (getPendingTasksCount() != null)
            sb.append("PendingTasksCount: ").append(getPendingTasksCount()).append(",");
        if (getActiveServicesCount() != null)
            sb.append("ActiveServicesCount: ").append(getActiveServicesCount()).append(",");
        if (getStatistics() != null)
            sb.append("Statistics: ").append(getStatistics()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getSettings() != null)
            sb.append("Settings: ").append(getSettings()).append(",");
        if (getCapacityProviders() != null)
            sb.append("CapacityProviders: ").append(getCapacityProviders()).append(",");
        if (getDefaultCapacityProviderStrategy() != null)
            sb.append("DefaultCapacityProviderStrategy: ").append(getDefaultCapacityProviderStrategy()).append(",");
        if (getAttachments() != null)
            sb.append("Attachments: ").append(getAttachments()).append(",");
        if (getAttachmentsStatus() != null)
            sb.append("AttachmentsStatus: ").append(getAttachmentsStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Cluster == false)
            return false;
        Cluster other = (Cluster) obj;
        if (other.getClusterArn() == null ^ this.getClusterArn() == null)
            return false;
        if (other.getClusterArn() != null && other.getClusterArn().equals(this.getClusterArn()) == false)
            return false;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getRegisteredContainerInstancesCount() == null ^ this.getRegisteredContainerInstancesCount() == null)
            return false;
        if (other.getRegisteredContainerInstancesCount() != null
                && other.getRegisteredContainerInstancesCount().equals(this.getRegisteredContainerInstancesCount()) == false)
            return false;
        if (other.getRunningTasksCount() == null ^ this.getRunningTasksCount() == null)
            return false;
        if (other.getRunningTasksCount() != null && other.getRunningTasksCount().equals(this.getRunningTasksCount()) == false)
            return false;
        if (other.getPendingTasksCount() == null ^ this.getPendingTasksCount() == null)
            return false;
        if (other.getPendingTasksCount() != null && other.getPendingTasksCount().equals(this.getPendingTasksCount()) == false)
            return false;
        if (other.getActiveServicesCount() == null ^ this.getActiveServicesCount() == null)
            return false;
        if (other.getActiveServicesCount() != null && other.getActiveServicesCount().equals(this.getActiveServicesCount()) == false)
            return false;
        if (other.getStatistics() == null ^ this.getStatistics() == null)
            return false;
        if (other.getStatistics() != null && other.getStatistics().equals(this.getStatistics()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getSettings() == null ^ this.getSettings() == null)
            return false;
        if (other.getSettings() != null && other.getSettings().equals(this.getSettings()) == false)
            return false;
        if (other.getCapacityProviders() == null ^ this.getCapacityProviders() == null)
            return false;
        if (other.getCapacityProviders() != null && other.getCapacityProviders().equals(this.getCapacityProviders()) == false)
            return false;
        if (other.getDefaultCapacityProviderStrategy() == null ^ this.getDefaultCapacityProviderStrategy() == null)
            return false;
        if (other.getDefaultCapacityProviderStrategy() != null
                && other.getDefaultCapacityProviderStrategy().equals(this.getDefaultCapacityProviderStrategy()) == false)
            return false;
        if (other.getAttachments() == null ^ this.getAttachments() == null)
            return false;
        if (other.getAttachments() != null && other.getAttachments().equals(this.getAttachments()) == false)
            return false;
        if (other.getAttachmentsStatus() == null ^ this.getAttachmentsStatus() == null)
            return false;
        if (other.getAttachmentsStatus() != null && other.getAttachmentsStatus().equals(this.getAttachmentsStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getClusterArn() == null) ? 0 : getClusterArn().hashCode());
        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getRegisteredContainerInstancesCount() == null) ? 0 : getRegisteredContainerInstancesCount().hashCode());
        hashCode = prime * hashCode + ((getRunningTasksCount() == null) ? 0 : getRunningTasksCount().hashCode());
        hashCode = prime * hashCode + ((getPendingTasksCount() == null) ? 0 : getPendingTasksCount().hashCode());
        hashCode = prime * hashCode + ((getActiveServicesCount() == null) ? 0 : getActiveServicesCount().hashCode());
        hashCode = prime * hashCode + ((getStatistics() == null) ? 0 : getStatistics().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getSettings() == null) ? 0 : getSettings().hashCode());
        hashCode = prime * hashCode + ((getCapacityProviders() == null) ? 0 : getCapacityProviders().hashCode());
        hashCode = prime * hashCode + ((getDefaultCapacityProviderStrategy() == null) ? 0 : getDefaultCapacityProviderStrategy().hashCode());
        hashCode = prime * hashCode + ((getAttachments() == null) ? 0 : getAttachments().hashCode());
        hashCode = prime * hashCode + ((getAttachmentsStatus() == null) ? 0 : getAttachmentsStatus().hashCode());
        return hashCode;
    }

    @Override
    public Cluster clone() {
        try {
            return (Cluster) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ecs.model.transform.ClusterMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
