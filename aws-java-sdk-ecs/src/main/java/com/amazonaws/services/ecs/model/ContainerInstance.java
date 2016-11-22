/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * An EC2 instance that is running the Amazon ECS agent and has been registered with a cluster.
 * </p>
 */
public class ContainerInstance implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance. The ARN contains the <code>arn:aws:ecs</code>
     * namespace, followed by the region of the container instance, the AWS account ID of the container instance owner,
     * the <code>container-instance</code> namespace, and then the container instance ID. For example,
     * <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>.
     * </p>
     */
    private String containerInstanceArn;
    /**
     * <p>
     * The EC2 instance ID of the container instance.
     * </p>
     */
    private String ec2InstanceId;
    /**
     * <p>
     * The version counter for the container instance. Every time a container instance experiences a change that
     * triggers a CloudWatch event, the version counter is incremented. If you are replicating your Amazon ECS container
     * instance state with CloudWatch events, you can compare the version of a container instance reported by the Amazon
     * ECS APIs with the version reported in CloudWatch events for the container instance (inside the
     * <code>detail</code> object) to verify that the version in your event stream is current.
     * </p>
     */
    private Long version;
    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker daemon running on the container instance.
     * </p>
     */
    private VersionInfo versionInfo;
    /**
     * <p>
     * For most resource types, this parameter describes the remaining resources of the container instance that are
     * available for new tasks. For port resource types, this parameter describes the ports that are reserved by the
     * Amazon ECS container agent and any containers that have reserved port mappings; any port that is not specified
     * here is available for new tasks.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Resource> remainingResources;
    /**
     * <p>
     * For most resource types, this parameter describes the registered resources on the container instance that are in
     * use by current tasks. For port resource types, this parameter describes the ports that were reserved by the
     * Amazon ECS container agent when it registered the container instance with Amazon ECS.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Resource> registeredResources;
    /**
     * <p>
     * The status of the container instance. The valid values are <code>ACTIVE</code> or <code>INACTIVE</code>.
     * <code>ACTIVE</code> indicates that the container instance can accept tasks.
     * </p>
     */
    private String status;
    /**
     * <p>
     * This parameter returns <code>true</code> if the agent is actually connected to Amazon ECS. Registered instances
     * with an agent that may be unhealthy or stopped return <code>false</code>, and instances without a connected agent
     * cannot accept placement requests.
     * </p>
     */
    private Boolean agentConnected;
    /**
     * <p>
     * The number of tasks on the container instance that are in the <code>RUNNING</code> status.
     * </p>
     */
    private Integer runningTasksCount;
    /**
     * <p>
     * The number of tasks on the container instance that are in the <code>PENDING</code> status.
     * </p>
     */
    private Integer pendingTasksCount;
    /**
     * <p>
     * The status of the most recent agent update. If an update has never been requested, this value is
     * <code>NULL</code>.
     * </p>
     */
    private String agentUpdateStatus;
    /**
     * <p>
     * The attributes set for the container instance by the Amazon ECS container agent at instance registration.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Attribute> attributes;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance. The ARN contains the <code>arn:aws:ecs</code>
     * namespace, followed by the region of the container instance, the AWS account ID of the container instance owner,
     * the <code>container-instance</code> namespace, and then the container instance ID. For example,
     * <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>.
     * </p>
     * 
     * @param containerInstanceArn
     *        The Amazon Resource Name (ARN) of the container instance. The ARN contains the <code>arn:aws:ecs</code>
     *        namespace, followed by the region of the container instance, the AWS account ID of the container instance
     *        owner, the <code>container-instance</code> namespace, and then the container instance ID. For example,
     *        <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>
     *        .
     */

    public void setContainerInstanceArn(String containerInstanceArn) {
        this.containerInstanceArn = containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance. The ARN contains the <code>arn:aws:ecs</code>
     * namespace, followed by the region of the container instance, the AWS account ID of the container instance owner,
     * the <code>container-instance</code> namespace, and then the container instance ID. For example,
     * <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the container instance. The ARN contains the <code>arn:aws:ecs</code>
     *         namespace, followed by the region of the container instance, the AWS account ID of the container instance
     *         owner, the <code>container-instance</code> namespace, and then the container instance ID. For example,
     *         <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>
     *         .
     */

    public String getContainerInstanceArn() {
        return this.containerInstanceArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the container instance. The ARN contains the <code>arn:aws:ecs</code>
     * namespace, followed by the region of the container instance, the AWS account ID of the container instance owner,
     * the <code>container-instance</code> namespace, and then the container instance ID. For example,
     * <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>.
     * </p>
     * 
     * @param containerInstanceArn
     *        The Amazon Resource Name (ARN) of the container instance. The ARN contains the <code>arn:aws:ecs</code>
     *        namespace, followed by the region of the container instance, the AWS account ID of the container instance
     *        owner, the <code>container-instance</code> namespace, and then the container instance ID. For example,
     *        <code>arn:aws:ecs:<i>region</i>:<i>aws_account_id</i>:container-instance/<i>container_instance_ID</i> </code>
     *        .
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstance withContainerInstanceArn(String containerInstanceArn) {
        setContainerInstanceArn(containerInstanceArn);
        return this;
    }

    /**
     * <p>
     * The EC2 instance ID of the container instance.
     * </p>
     * 
     * @param ec2InstanceId
     *        The EC2 instance ID of the container instance.
     */

    public void setEc2InstanceId(String ec2InstanceId) {
        this.ec2InstanceId = ec2InstanceId;
    }

    /**
     * <p>
     * The EC2 instance ID of the container instance.
     * </p>
     * 
     * @return The EC2 instance ID of the container instance.
     */

    public String getEc2InstanceId() {
        return this.ec2InstanceId;
    }

    /**
     * <p>
     * The EC2 instance ID of the container instance.
     * </p>
     * 
     * @param ec2InstanceId
     *        The EC2 instance ID of the container instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstance withEc2InstanceId(String ec2InstanceId) {
        setEc2InstanceId(ec2InstanceId);
        return this;
    }

    /**
     * <p>
     * The version counter for the container instance. Every time a container instance experiences a change that
     * triggers a CloudWatch event, the version counter is incremented. If you are replicating your Amazon ECS container
     * instance state with CloudWatch events, you can compare the version of a container instance reported by the Amazon
     * ECS APIs with the version reported in CloudWatch events for the container instance (inside the
     * <code>detail</code> object) to verify that the version in your event stream is current.
     * </p>
     * 
     * @param version
     *        The version counter for the container instance. Every time a container instance experiences a change that
     *        triggers a CloudWatch event, the version counter is incremented. If you are replicating your Amazon ECS
     *        container instance state with CloudWatch events, you can compare the version of a container instance
     *        reported by the Amazon ECS APIs with the version reported in CloudWatch events for the container instance
     *        (inside the <code>detail</code> object) to verify that the version in your event stream is current.
     */

    public void setVersion(Long version) {
        this.version = version;
    }

    /**
     * <p>
     * The version counter for the container instance. Every time a container instance experiences a change that
     * triggers a CloudWatch event, the version counter is incremented. If you are replicating your Amazon ECS container
     * instance state with CloudWatch events, you can compare the version of a container instance reported by the Amazon
     * ECS APIs with the version reported in CloudWatch events for the container instance (inside the
     * <code>detail</code> object) to verify that the version in your event stream is current.
     * </p>
     * 
     * @return The version counter for the container instance. Every time a container instance experiences a change that
     *         triggers a CloudWatch event, the version counter is incremented. If you are replicating your Amazon ECS
     *         container instance state with CloudWatch events, you can compare the version of a container instance
     *         reported by the Amazon ECS APIs with the version reported in CloudWatch events for the container instance
     *         (inside the <code>detail</code> object) to verify that the version in your event stream is current.
     */

    public Long getVersion() {
        return this.version;
    }

    /**
     * <p>
     * The version counter for the container instance. Every time a container instance experiences a change that
     * triggers a CloudWatch event, the version counter is incremented. If you are replicating your Amazon ECS container
     * instance state with CloudWatch events, you can compare the version of a container instance reported by the Amazon
     * ECS APIs with the version reported in CloudWatch events for the container instance (inside the
     * <code>detail</code> object) to verify that the version in your event stream is current.
     * </p>
     * 
     * @param version
     *        The version counter for the container instance. Every time a container instance experiences a change that
     *        triggers a CloudWatch event, the version counter is incremented. If you are replicating your Amazon ECS
     *        container instance state with CloudWatch events, you can compare the version of a container instance
     *        reported by the Amazon ECS APIs with the version reported in CloudWatch events for the container instance
     *        (inside the <code>detail</code> object) to verify that the version in your event stream is current.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstance withVersion(Long version) {
        setVersion(version);
        return this;
    }

    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker daemon running on the container instance.
     * </p>
     * 
     * @param versionInfo
     *        The version information for the Amazon ECS container agent and Docker daemon running on the container
     *        instance.
     */

    public void setVersionInfo(VersionInfo versionInfo) {
        this.versionInfo = versionInfo;
    }

    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker daemon running on the container instance.
     * </p>
     * 
     * @return The version information for the Amazon ECS container agent and Docker daemon running on the container
     *         instance.
     */

    public VersionInfo getVersionInfo() {
        return this.versionInfo;
    }

    /**
     * <p>
     * The version information for the Amazon ECS container agent and Docker daemon running on the container instance.
     * </p>
     * 
     * @param versionInfo
     *        The version information for the Amazon ECS container agent and Docker daemon running on the container
     *        instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstance withVersionInfo(VersionInfo versionInfo) {
        setVersionInfo(versionInfo);
        return this;
    }

    /**
     * <p>
     * For most resource types, this parameter describes the remaining resources of the container instance that are
     * available for new tasks. For port resource types, this parameter describes the ports that are reserved by the
     * Amazon ECS container agent and any containers that have reserved port mappings; any port that is not specified
     * here is available for new tasks.
     * </p>
     * 
     * @return For most resource types, this parameter describes the remaining resources of the container instance that
     *         are available for new tasks. For port resource types, this parameter describes the ports that are
     *         reserved by the Amazon ECS container agent and any containers that have reserved port mappings; any port
     *         that is not specified here is available for new tasks.
     */

    public java.util.List<Resource> getRemainingResources() {
        if (remainingResources == null) {
            remainingResources = new com.amazonaws.internal.SdkInternalList<Resource>();
        }
        return remainingResources;
    }

    /**
     * <p>
     * For most resource types, this parameter describes the remaining resources of the container instance that are
     * available for new tasks. For port resource types, this parameter describes the ports that are reserved by the
     * Amazon ECS container agent and any containers that have reserved port mappings; any port that is not specified
     * here is available for new tasks.
     * </p>
     * 
     * @param remainingResources
     *        For most resource types, this parameter describes the remaining resources of the container instance that
     *        are available for new tasks. For port resource types, this parameter describes the ports that are reserved
     *        by the Amazon ECS container agent and any containers that have reserved port mappings; any port that is
     *        not specified here is available for new tasks.
     */

    public void setRemainingResources(java.util.Collection<Resource> remainingResources) {
        if (remainingResources == null) {
            this.remainingResources = null;
            return;
        }

        this.remainingResources = new com.amazonaws.internal.SdkInternalList<Resource>(remainingResources);
    }

    /**
     * <p>
     * For most resource types, this parameter describes the remaining resources of the container instance that are
     * available for new tasks. For port resource types, this parameter describes the ports that are reserved by the
     * Amazon ECS container agent and any containers that have reserved port mappings; any port that is not specified
     * here is available for new tasks.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRemainingResources(java.util.Collection)} or {@link #withRemainingResources(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param remainingResources
     *        For most resource types, this parameter describes the remaining resources of the container instance that
     *        are available for new tasks. For port resource types, this parameter describes the ports that are reserved
     *        by the Amazon ECS container agent and any containers that have reserved port mappings; any port that is
     *        not specified here is available for new tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstance withRemainingResources(Resource... remainingResources) {
        if (this.remainingResources == null) {
            setRemainingResources(new com.amazonaws.internal.SdkInternalList<Resource>(remainingResources.length));
        }
        for (Resource ele : remainingResources) {
            this.remainingResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For most resource types, this parameter describes the remaining resources of the container instance that are
     * available for new tasks. For port resource types, this parameter describes the ports that are reserved by the
     * Amazon ECS container agent and any containers that have reserved port mappings; any port that is not specified
     * here is available for new tasks.
     * </p>
     * 
     * @param remainingResources
     *        For most resource types, this parameter describes the remaining resources of the container instance that
     *        are available for new tasks. For port resource types, this parameter describes the ports that are reserved
     *        by the Amazon ECS container agent and any containers that have reserved port mappings; any port that is
     *        not specified here is available for new tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstance withRemainingResources(java.util.Collection<Resource> remainingResources) {
        setRemainingResources(remainingResources);
        return this;
    }

    /**
     * <p>
     * For most resource types, this parameter describes the registered resources on the container instance that are in
     * use by current tasks. For port resource types, this parameter describes the ports that were reserved by the
     * Amazon ECS container agent when it registered the container instance with Amazon ECS.
     * </p>
     * 
     * @return For most resource types, this parameter describes the registered resources on the container instance that
     *         are in use by current tasks. For port resource types, this parameter describes the ports that were
     *         reserved by the Amazon ECS container agent when it registered the container instance with Amazon ECS.
     */

    public java.util.List<Resource> getRegisteredResources() {
        if (registeredResources == null) {
            registeredResources = new com.amazonaws.internal.SdkInternalList<Resource>();
        }
        return registeredResources;
    }

    /**
     * <p>
     * For most resource types, this parameter describes the registered resources on the container instance that are in
     * use by current tasks. For port resource types, this parameter describes the ports that were reserved by the
     * Amazon ECS container agent when it registered the container instance with Amazon ECS.
     * </p>
     * 
     * @param registeredResources
     *        For most resource types, this parameter describes the registered resources on the container instance that
     *        are in use by current tasks. For port resource types, this parameter describes the ports that were
     *        reserved by the Amazon ECS container agent when it registered the container instance with Amazon ECS.
     */

    public void setRegisteredResources(java.util.Collection<Resource> registeredResources) {
        if (registeredResources == null) {
            this.registeredResources = null;
            return;
        }

        this.registeredResources = new com.amazonaws.internal.SdkInternalList<Resource>(registeredResources);
    }

    /**
     * <p>
     * For most resource types, this parameter describes the registered resources on the container instance that are in
     * use by current tasks. For port resource types, this parameter describes the ports that were reserved by the
     * Amazon ECS container agent when it registered the container instance with Amazon ECS.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRegisteredResources(java.util.Collection)} or {@link #withRegisteredResources(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param registeredResources
     *        For most resource types, this parameter describes the registered resources on the container instance that
     *        are in use by current tasks. For port resource types, this parameter describes the ports that were
     *        reserved by the Amazon ECS container agent when it registered the container instance with Amazon ECS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstance withRegisteredResources(Resource... registeredResources) {
        if (this.registeredResources == null) {
            setRegisteredResources(new com.amazonaws.internal.SdkInternalList<Resource>(registeredResources.length));
        }
        for (Resource ele : registeredResources) {
            this.registeredResources.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * For most resource types, this parameter describes the registered resources on the container instance that are in
     * use by current tasks. For port resource types, this parameter describes the ports that were reserved by the
     * Amazon ECS container agent when it registered the container instance with Amazon ECS.
     * </p>
     * 
     * @param registeredResources
     *        For most resource types, this parameter describes the registered resources on the container instance that
     *        are in use by current tasks. For port resource types, this parameter describes the ports that were
     *        reserved by the Amazon ECS container agent when it registered the container instance with Amazon ECS.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstance withRegisteredResources(java.util.Collection<Resource> registeredResources) {
        setRegisteredResources(registeredResources);
        return this;
    }

    /**
     * <p>
     * The status of the container instance. The valid values are <code>ACTIVE</code> or <code>INACTIVE</code>.
     * <code>ACTIVE</code> indicates that the container instance can accept tasks.
     * </p>
     * 
     * @param status
     *        The status of the container instance. The valid values are <code>ACTIVE</code> or <code>INACTIVE</code>.
     *        <code>ACTIVE</code> indicates that the container instance can accept tasks.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the container instance. The valid values are <code>ACTIVE</code> or <code>INACTIVE</code>.
     * <code>ACTIVE</code> indicates that the container instance can accept tasks.
     * </p>
     * 
     * @return The status of the container instance. The valid values are <code>ACTIVE</code> or <code>INACTIVE</code>.
     *         <code>ACTIVE</code> indicates that the container instance can accept tasks.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the container instance. The valid values are <code>ACTIVE</code> or <code>INACTIVE</code>.
     * <code>ACTIVE</code> indicates that the container instance can accept tasks.
     * </p>
     * 
     * @param status
     *        The status of the container instance. The valid values are <code>ACTIVE</code> or <code>INACTIVE</code>.
     *        <code>ACTIVE</code> indicates that the container instance can accept tasks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstance withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * This parameter returns <code>true</code> if the agent is actually connected to Amazon ECS. Registered instances
     * with an agent that may be unhealthy or stopped return <code>false</code>, and instances without a connected agent
     * cannot accept placement requests.
     * </p>
     * 
     * @param agentConnected
     *        This parameter returns <code>true</code> if the agent is actually connected to Amazon ECS. Registered
     *        instances with an agent that may be unhealthy or stopped return <code>false</code>, and instances without
     *        a connected agent cannot accept placement requests.
     */

    public void setAgentConnected(Boolean agentConnected) {
        this.agentConnected = agentConnected;
    }

    /**
     * <p>
     * This parameter returns <code>true</code> if the agent is actually connected to Amazon ECS. Registered instances
     * with an agent that may be unhealthy or stopped return <code>false</code>, and instances without a connected agent
     * cannot accept placement requests.
     * </p>
     * 
     * @return This parameter returns <code>true</code> if the agent is actually connected to Amazon ECS. Registered
     *         instances with an agent that may be unhealthy or stopped return <code>false</code>, and instances without
     *         a connected agent cannot accept placement requests.
     */

    public Boolean getAgentConnected() {
        return this.agentConnected;
    }

    /**
     * <p>
     * This parameter returns <code>true</code> if the agent is actually connected to Amazon ECS. Registered instances
     * with an agent that may be unhealthy or stopped return <code>false</code>, and instances without a connected agent
     * cannot accept placement requests.
     * </p>
     * 
     * @param agentConnected
     *        This parameter returns <code>true</code> if the agent is actually connected to Amazon ECS. Registered
     *        instances with an agent that may be unhealthy or stopped return <code>false</code>, and instances without
     *        a connected agent cannot accept placement requests.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstance withAgentConnected(Boolean agentConnected) {
        setAgentConnected(agentConnected);
        return this;
    }

    /**
     * <p>
     * This parameter returns <code>true</code> if the agent is actually connected to Amazon ECS. Registered instances
     * with an agent that may be unhealthy or stopped return <code>false</code>, and instances without a connected agent
     * cannot accept placement requests.
     * </p>
     * 
     * @return This parameter returns <code>true</code> if the agent is actually connected to Amazon ECS. Registered
     *         instances with an agent that may be unhealthy or stopped return <code>false</code>, and instances without
     *         a connected agent cannot accept placement requests.
     */

    public Boolean isAgentConnected() {
        return this.agentConnected;
    }

    /**
     * <p>
     * The number of tasks on the container instance that are in the <code>RUNNING</code> status.
     * </p>
     * 
     * @param runningTasksCount
     *        The number of tasks on the container instance that are in the <code>RUNNING</code> status.
     */

    public void setRunningTasksCount(Integer runningTasksCount) {
        this.runningTasksCount = runningTasksCount;
    }

    /**
     * <p>
     * The number of tasks on the container instance that are in the <code>RUNNING</code> status.
     * </p>
     * 
     * @return The number of tasks on the container instance that are in the <code>RUNNING</code> status.
     */

    public Integer getRunningTasksCount() {
        return this.runningTasksCount;
    }

    /**
     * <p>
     * The number of tasks on the container instance that are in the <code>RUNNING</code> status.
     * </p>
     * 
     * @param runningTasksCount
     *        The number of tasks on the container instance that are in the <code>RUNNING</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstance withRunningTasksCount(Integer runningTasksCount) {
        setRunningTasksCount(runningTasksCount);
        return this;
    }

    /**
     * <p>
     * The number of tasks on the container instance that are in the <code>PENDING</code> status.
     * </p>
     * 
     * @param pendingTasksCount
     *        The number of tasks on the container instance that are in the <code>PENDING</code> status.
     */

    public void setPendingTasksCount(Integer pendingTasksCount) {
        this.pendingTasksCount = pendingTasksCount;
    }

    /**
     * <p>
     * The number of tasks on the container instance that are in the <code>PENDING</code> status.
     * </p>
     * 
     * @return The number of tasks on the container instance that are in the <code>PENDING</code> status.
     */

    public Integer getPendingTasksCount() {
        return this.pendingTasksCount;
    }

    /**
     * <p>
     * The number of tasks on the container instance that are in the <code>PENDING</code> status.
     * </p>
     * 
     * @param pendingTasksCount
     *        The number of tasks on the container instance that are in the <code>PENDING</code> status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstance withPendingTasksCount(Integer pendingTasksCount) {
        setPendingTasksCount(pendingTasksCount);
        return this;
    }

    /**
     * <p>
     * The status of the most recent agent update. If an update has never been requested, this value is
     * <code>NULL</code>.
     * </p>
     * 
     * @param agentUpdateStatus
     *        The status of the most recent agent update. If an update has never been requested, this value is
     *        <code>NULL</code>.
     * @see AgentUpdateStatus
     */

    public void setAgentUpdateStatus(String agentUpdateStatus) {
        this.agentUpdateStatus = agentUpdateStatus;
    }

    /**
     * <p>
     * The status of the most recent agent update. If an update has never been requested, this value is
     * <code>NULL</code>.
     * </p>
     * 
     * @return The status of the most recent agent update. If an update has never been requested, this value is
     *         <code>NULL</code>.
     * @see AgentUpdateStatus
     */

    public String getAgentUpdateStatus() {
        return this.agentUpdateStatus;
    }

    /**
     * <p>
     * The status of the most recent agent update. If an update has never been requested, this value is
     * <code>NULL</code>.
     * </p>
     * 
     * @param agentUpdateStatus
     *        The status of the most recent agent update. If an update has never been requested, this value is
     *        <code>NULL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentUpdateStatus
     */

    public ContainerInstance withAgentUpdateStatus(String agentUpdateStatus) {
        setAgentUpdateStatus(agentUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The status of the most recent agent update. If an update has never been requested, this value is
     * <code>NULL</code>.
     * </p>
     * 
     * @param agentUpdateStatus
     *        The status of the most recent agent update. If an update has never been requested, this value is
     *        <code>NULL</code>.
     * @see AgentUpdateStatus
     */

    public void setAgentUpdateStatus(AgentUpdateStatus agentUpdateStatus) {
        this.agentUpdateStatus = agentUpdateStatus.toString();
    }

    /**
     * <p>
     * The status of the most recent agent update. If an update has never been requested, this value is
     * <code>NULL</code>.
     * </p>
     * 
     * @param agentUpdateStatus
     *        The status of the most recent agent update. If an update has never been requested, this value is
     *        <code>NULL</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AgentUpdateStatus
     */

    public ContainerInstance withAgentUpdateStatus(AgentUpdateStatus agentUpdateStatus) {
        setAgentUpdateStatus(agentUpdateStatus);
        return this;
    }

    /**
     * <p>
     * The attributes set for the container instance by the Amazon ECS container agent at instance registration.
     * </p>
     * 
     * @return The attributes set for the container instance by the Amazon ECS container agent at instance registration.
     */

    public java.util.List<Attribute> getAttributes() {
        if (attributes == null) {
            attributes = new com.amazonaws.internal.SdkInternalList<Attribute>();
        }
        return attributes;
    }

    /**
     * <p>
     * The attributes set for the container instance by the Amazon ECS container agent at instance registration.
     * </p>
     * 
     * @param attributes
     *        The attributes set for the container instance by the Amazon ECS container agent at instance registration.
     */

    public void setAttributes(java.util.Collection<Attribute> attributes) {
        if (attributes == null) {
            this.attributes = null;
            return;
        }

        this.attributes = new com.amazonaws.internal.SdkInternalList<Attribute>(attributes);
    }

    /**
     * <p>
     * The attributes set for the container instance by the Amazon ECS container agent at instance registration.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAttributes(java.util.Collection)} or {@link #withAttributes(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param attributes
     *        The attributes set for the container instance by the Amazon ECS container agent at instance registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstance withAttributes(Attribute... attributes) {
        if (this.attributes == null) {
            setAttributes(new com.amazonaws.internal.SdkInternalList<Attribute>(attributes.length));
        }
        for (Attribute ele : attributes) {
            this.attributes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The attributes set for the container instance by the Amazon ECS container agent at instance registration.
     * </p>
     * 
     * @param attributes
     *        The attributes set for the container instance by the Amazon ECS container agent at instance registration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ContainerInstance withAttributes(java.util.Collection<Attribute> attributes) {
        setAttributes(attributes);
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
        if (getContainerInstanceArn() != null)
            sb.append("ContainerInstanceArn: " + getContainerInstanceArn() + ",");
        if (getEc2InstanceId() != null)
            sb.append("Ec2InstanceId: " + getEc2InstanceId() + ",");
        if (getVersion() != null)
            sb.append("Version: " + getVersion() + ",");
        if (getVersionInfo() != null)
            sb.append("VersionInfo: " + getVersionInfo() + ",");
        if (getRemainingResources() != null)
            sb.append("RemainingResources: " + getRemainingResources() + ",");
        if (getRegisteredResources() != null)
            sb.append("RegisteredResources: " + getRegisteredResources() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getAgentConnected() != null)
            sb.append("AgentConnected: " + getAgentConnected() + ",");
        if (getRunningTasksCount() != null)
            sb.append("RunningTasksCount: " + getRunningTasksCount() + ",");
        if (getPendingTasksCount() != null)
            sb.append("PendingTasksCount: " + getPendingTasksCount() + ",");
        if (getAgentUpdateStatus() != null)
            sb.append("AgentUpdateStatus: " + getAgentUpdateStatus() + ",");
        if (getAttributes() != null)
            sb.append("Attributes: " + getAttributes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ContainerInstance == false)
            return false;
        ContainerInstance other = (ContainerInstance) obj;
        if (other.getContainerInstanceArn() == null ^ this.getContainerInstanceArn() == null)
            return false;
        if (other.getContainerInstanceArn() != null && other.getContainerInstanceArn().equals(this.getContainerInstanceArn()) == false)
            return false;
        if (other.getEc2InstanceId() == null ^ this.getEc2InstanceId() == null)
            return false;
        if (other.getEc2InstanceId() != null && other.getEc2InstanceId().equals(this.getEc2InstanceId()) == false)
            return false;
        if (other.getVersion() == null ^ this.getVersion() == null)
            return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false)
            return false;
        if (other.getVersionInfo() == null ^ this.getVersionInfo() == null)
            return false;
        if (other.getVersionInfo() != null && other.getVersionInfo().equals(this.getVersionInfo()) == false)
            return false;
        if (other.getRemainingResources() == null ^ this.getRemainingResources() == null)
            return false;
        if (other.getRemainingResources() != null && other.getRemainingResources().equals(this.getRemainingResources()) == false)
            return false;
        if (other.getRegisteredResources() == null ^ this.getRegisteredResources() == null)
            return false;
        if (other.getRegisteredResources() != null && other.getRegisteredResources().equals(this.getRegisteredResources()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getAgentConnected() == null ^ this.getAgentConnected() == null)
            return false;
        if (other.getAgentConnected() != null && other.getAgentConnected().equals(this.getAgentConnected()) == false)
            return false;
        if (other.getRunningTasksCount() == null ^ this.getRunningTasksCount() == null)
            return false;
        if (other.getRunningTasksCount() != null && other.getRunningTasksCount().equals(this.getRunningTasksCount()) == false)
            return false;
        if (other.getPendingTasksCount() == null ^ this.getPendingTasksCount() == null)
            return false;
        if (other.getPendingTasksCount() != null && other.getPendingTasksCount().equals(this.getPendingTasksCount()) == false)
            return false;
        if (other.getAgentUpdateStatus() == null ^ this.getAgentUpdateStatus() == null)
            return false;
        if (other.getAgentUpdateStatus() != null && other.getAgentUpdateStatus().equals(this.getAgentUpdateStatus()) == false)
            return false;
        if (other.getAttributes() == null ^ this.getAttributes() == null)
            return false;
        if (other.getAttributes() != null && other.getAttributes().equals(this.getAttributes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getContainerInstanceArn() == null) ? 0 : getContainerInstanceArn().hashCode());
        hashCode = prime * hashCode + ((getEc2InstanceId() == null) ? 0 : getEc2InstanceId().hashCode());
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode());
        hashCode = prime * hashCode + ((getVersionInfo() == null) ? 0 : getVersionInfo().hashCode());
        hashCode = prime * hashCode + ((getRemainingResources() == null) ? 0 : getRemainingResources().hashCode());
        hashCode = prime * hashCode + ((getRegisteredResources() == null) ? 0 : getRegisteredResources().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getAgentConnected() == null) ? 0 : getAgentConnected().hashCode());
        hashCode = prime * hashCode + ((getRunningTasksCount() == null) ? 0 : getRunningTasksCount().hashCode());
        hashCode = prime * hashCode + ((getPendingTasksCount() == null) ? 0 : getPendingTasksCount().hashCode());
        hashCode = prime * hashCode + ((getAgentUpdateStatus() == null) ? 0 : getAgentUpdateStatus().hashCode());
        hashCode = prime * hashCode + ((getAttributes() == null) ? 0 : getAttributes().hashCode());
        return hashCode;
    }

    @Override
    public ContainerInstance clone() {
        try {
            return (ContainerInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
