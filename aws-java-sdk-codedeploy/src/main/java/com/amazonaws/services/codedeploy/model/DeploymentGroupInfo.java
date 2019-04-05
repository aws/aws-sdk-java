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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a deployment group.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeploymentGroupInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentGroupInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The application name.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The deployment group ID.
     * </p>
     */
    private String deploymentGroupId;
    /**
     * <p>
     * The deployment group name.
     * </p>
     */
    private String deploymentGroupName;
    /**
     * <p>
     * The deployment configuration name.
     * </p>
     */
    private String deploymentConfigName;
    /**
     * <p>
     * The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the specified
     * tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EC2TagFilter> ec2TagFilters;
    /**
     * <p>
     * The on-premises instance tags on which to filter. The deployment group includes on-premises instances with any of
     * the specified tags.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagFilter> onPremisesInstanceTagFilters;
    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<AutoScalingGroup> autoScalingGroups;
    /**
     * <p>
     * A service role ARN.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * Information about the deployment group's target revision, including type and location.
     * </p>
     */
    private RevisionLocation targetRevision;
    /**
     * <p>
     * Information about triggers associated with the deployment group.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TriggerConfig> triggerConfigurations;
    /**
     * <p>
     * A list of alarms associated with the deployment group.
     * </p>
     */
    private AlarmConfiguration alarmConfiguration;
    /**
     * <p>
     * Information about the automatic rollback configuration associated with the deployment group.
     * </p>
     */
    private AutoRollbackConfiguration autoRollbackConfiguration;
    /**
     * <p>
     * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route
     * deployment traffic behind a load balancer.
     * </p>
     */
    private DeploymentStyle deploymentStyle;
    /**
     * <p>
     * Information about blue/green deployment options for a deployment group.
     * </p>
     */
    private BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration;
    /**
     * <p>
     * Information about the load balancer to use in a deployment.
     * </p>
     */
    private LoadBalancerInfo loadBalancerInfo;
    /**
     * <p>
     * Information about the most recent successful deployment to the deployment group.
     * </p>
     */
    private LastDeploymentInfo lastSuccessfulDeployment;
    /**
     * <p>
     * Information about the most recent attempted deployment to the deployment group.
     * </p>
     */
    private LastDeploymentInfo lastAttemptedDeployment;
    /**
     * <p>
     * Information about groups of tags applied to an EC2 instance. The deployment group includes only EC2 instances
     * identified by all of the tag groups. Cannot be used in the same call as ec2TagFilters.
     * </p>
     */
    private EC2TagSet ec2TagSet;
    /**
     * <p>
     * Information about groups of tags applied to an on-premises instance. The deployment group includes only
     * on-premises instances identified by all the tag groups. Cannot be used in the same call as
     * onPremisesInstanceTagFilters.
     * </p>
     */
    private OnPremisesTagSet onPremisesTagSet;
    /**
     * <p>
     * The destination platform type for the deployment group (<code>Lambda</code> or <code>Server</code>).
     * </p>
     */
    private String computePlatform;
    /**
     * <p>
     * The target Amazon ECS services in the deployment group. This applies only to deployment groups that use the
     * Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and service name
     * pair using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ECSService> ecsServices;

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @param applicationName
     *        The application name.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @return The application name.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The application name.
     * </p>
     * 
     * @param applicationName
     *        The application name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The deployment group ID.
     * </p>
     * 
     * @param deploymentGroupId
     *        The deployment group ID.
     */

    public void setDeploymentGroupId(String deploymentGroupId) {
        this.deploymentGroupId = deploymentGroupId;
    }

    /**
     * <p>
     * The deployment group ID.
     * </p>
     * 
     * @return The deployment group ID.
     */

    public String getDeploymentGroupId() {
        return this.deploymentGroupId;
    }

    /**
     * <p>
     * The deployment group ID.
     * </p>
     * 
     * @param deploymentGroupId
     *        The deployment group ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withDeploymentGroupId(String deploymentGroupId) {
        setDeploymentGroupId(deploymentGroupId);
        return this;
    }

    /**
     * <p>
     * The deployment group name.
     * </p>
     * 
     * @param deploymentGroupName
     *        The deployment group name.
     */

    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }

    /**
     * <p>
     * The deployment group name.
     * </p>
     * 
     * @return The deployment group name.
     */

    public String getDeploymentGroupName() {
        return this.deploymentGroupName;
    }

    /**
     * <p>
     * The deployment group name.
     * </p>
     * 
     * @param deploymentGroupName
     *        The deployment group name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withDeploymentGroupName(String deploymentGroupName) {
        setDeploymentGroupName(deploymentGroupName);
        return this;
    }

    /**
     * <p>
     * The deployment configuration name.
     * </p>
     * 
     * @param deploymentConfigName
     *        The deployment configuration name.
     */

    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * The deployment configuration name.
     * </p>
     * 
     * @return The deployment configuration name.
     */

    public String getDeploymentConfigName() {
        return this.deploymentConfigName;
    }

    /**
     * <p>
     * The deployment configuration name.
     * </p>
     * 
     * @param deploymentConfigName
     *        The deployment configuration name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withDeploymentConfigName(String deploymentConfigName) {
        setDeploymentConfigName(deploymentConfigName);
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the specified
     * tags.
     * </p>
     * 
     * @return The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the
     *         specified tags.
     */

    public java.util.List<EC2TagFilter> getEc2TagFilters() {
        if (ec2TagFilters == null) {
            ec2TagFilters = new com.amazonaws.internal.SdkInternalList<EC2TagFilter>();
        }
        return ec2TagFilters;
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the specified
     * tags.
     * </p>
     * 
     * @param ec2TagFilters
     *        The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the
     *        specified tags.
     */

    public void setEc2TagFilters(java.util.Collection<EC2TagFilter> ec2TagFilters) {
        if (ec2TagFilters == null) {
            this.ec2TagFilters = null;
            return;
        }

        this.ec2TagFilters = new com.amazonaws.internal.SdkInternalList<EC2TagFilter>(ec2TagFilters);
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the specified
     * tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2TagFilters(java.util.Collection)} or {@link #withEc2TagFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ec2TagFilters
     *        The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the
     *        specified tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withEc2TagFilters(EC2TagFilter... ec2TagFilters) {
        if (this.ec2TagFilters == null) {
            setEc2TagFilters(new com.amazonaws.internal.SdkInternalList<EC2TagFilter>(ec2TagFilters.length));
        }
        for (EC2TagFilter ele : ec2TagFilters) {
            this.ec2TagFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the specified
     * tags.
     * </p>
     * 
     * @param ec2TagFilters
     *        The Amazon EC2 tags on which to filter. The deployment group includes EC2 instances with any of the
     *        specified tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withEc2TagFilters(java.util.Collection<EC2TagFilter> ec2TagFilters) {
        setEc2TagFilters(ec2TagFilters);
        return this;
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter. The deployment group includes on-premises instances with any of
     * the specified tags.
     * </p>
     * 
     * @return The on-premises instance tags on which to filter. The deployment group includes on-premises instances
     *         with any of the specified tags.
     */

    public java.util.List<TagFilter> getOnPremisesInstanceTagFilters() {
        if (onPremisesInstanceTagFilters == null) {
            onPremisesInstanceTagFilters = new com.amazonaws.internal.SdkInternalList<TagFilter>();
        }
        return onPremisesInstanceTagFilters;
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter. The deployment group includes on-premises instances with any of
     * the specified tags.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The on-premises instance tags on which to filter. The deployment group includes on-premises instances with
     *        any of the specified tags.
     */

    public void setOnPremisesInstanceTagFilters(java.util.Collection<TagFilter> onPremisesInstanceTagFilters) {
        if (onPremisesInstanceTagFilters == null) {
            this.onPremisesInstanceTagFilters = null;
            return;
        }

        this.onPremisesInstanceTagFilters = new com.amazonaws.internal.SdkInternalList<TagFilter>(onPremisesInstanceTagFilters);
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter. The deployment group includes on-premises instances with any of
     * the specified tags.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOnPremisesInstanceTagFilters(java.util.Collection)} or
     * {@link #withOnPremisesInstanceTagFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The on-premises instance tags on which to filter. The deployment group includes on-premises instances with
     *        any of the specified tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withOnPremisesInstanceTagFilters(TagFilter... onPremisesInstanceTagFilters) {
        if (this.onPremisesInstanceTagFilters == null) {
            setOnPremisesInstanceTagFilters(new com.amazonaws.internal.SdkInternalList<TagFilter>(onPremisesInstanceTagFilters.length));
        }
        for (TagFilter ele : onPremisesInstanceTagFilters) {
            this.onPremisesInstanceTagFilters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter. The deployment group includes on-premises instances with any of
     * the specified tags.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The on-premises instance tags on which to filter. The deployment group includes on-premises instances with
     *        any of the specified tags.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withOnPremisesInstanceTagFilters(java.util.Collection<TagFilter> onPremisesInstanceTagFilters) {
        setOnPremisesInstanceTagFilters(onPremisesInstanceTagFilters);
        return this;
    }

    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     * 
     * @return A list of associated Auto Scaling groups.
     */

    public java.util.List<AutoScalingGroup> getAutoScalingGroups() {
        if (autoScalingGroups == null) {
            autoScalingGroups = new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>();
        }
        return autoScalingGroups;
    }

    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     * 
     * @param autoScalingGroups
     *        A list of associated Auto Scaling groups.
     */

    public void setAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }

        this.autoScalingGroups = new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>(autoScalingGroups);
    }

    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoScalingGroups(java.util.Collection)} or {@link #withAutoScalingGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param autoScalingGroups
     *        A list of associated Auto Scaling groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withAutoScalingGroups(AutoScalingGroup... autoScalingGroups) {
        if (this.autoScalingGroups == null) {
            setAutoScalingGroups(new com.amazonaws.internal.SdkInternalList<AutoScalingGroup>(autoScalingGroups.length));
        }
        for (AutoScalingGroup ele : autoScalingGroups) {
            this.autoScalingGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of associated Auto Scaling groups.
     * </p>
     * 
     * @param autoScalingGroups
     *        A list of associated Auto Scaling groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withAutoScalingGroups(java.util.Collection<AutoScalingGroup> autoScalingGroups) {
        setAutoScalingGroups(autoScalingGroups);
        return this;
    }

    /**
     * <p>
     * A service role ARN.
     * </p>
     * 
     * @param serviceRoleArn
     *        A service role ARN.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * A service role ARN.
     * </p>
     * 
     * @return A service role ARN.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * A service role ARN.
     * </p>
     * 
     * @param serviceRoleArn
     *        A service role ARN.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * Information about the deployment group's target revision, including type and location.
     * </p>
     * 
     * @param targetRevision
     *        Information about the deployment group's target revision, including type and location.
     */

    public void setTargetRevision(RevisionLocation targetRevision) {
        this.targetRevision = targetRevision;
    }

    /**
     * <p>
     * Information about the deployment group's target revision, including type and location.
     * </p>
     * 
     * @return Information about the deployment group's target revision, including type and location.
     */

    public RevisionLocation getTargetRevision() {
        return this.targetRevision;
    }

    /**
     * <p>
     * Information about the deployment group's target revision, including type and location.
     * </p>
     * 
     * @param targetRevision
     *        Information about the deployment group's target revision, including type and location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withTargetRevision(RevisionLocation targetRevision) {
        setTargetRevision(targetRevision);
        return this;
    }

    /**
     * <p>
     * Information about triggers associated with the deployment group.
     * </p>
     * 
     * @return Information about triggers associated with the deployment group.
     */

    public java.util.List<TriggerConfig> getTriggerConfigurations() {
        if (triggerConfigurations == null) {
            triggerConfigurations = new com.amazonaws.internal.SdkInternalList<TriggerConfig>();
        }
        return triggerConfigurations;
    }

    /**
     * <p>
     * Information about triggers associated with the deployment group.
     * </p>
     * 
     * @param triggerConfigurations
     *        Information about triggers associated with the deployment group.
     */

    public void setTriggerConfigurations(java.util.Collection<TriggerConfig> triggerConfigurations) {
        if (triggerConfigurations == null) {
            this.triggerConfigurations = null;
            return;
        }

        this.triggerConfigurations = new com.amazonaws.internal.SdkInternalList<TriggerConfig>(triggerConfigurations);
    }

    /**
     * <p>
     * Information about triggers associated with the deployment group.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTriggerConfigurations(java.util.Collection)} or
     * {@link #withTriggerConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param triggerConfigurations
     *        Information about triggers associated with the deployment group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withTriggerConfigurations(TriggerConfig... triggerConfigurations) {
        if (this.triggerConfigurations == null) {
            setTriggerConfigurations(new com.amazonaws.internal.SdkInternalList<TriggerConfig>(triggerConfigurations.length));
        }
        for (TriggerConfig ele : triggerConfigurations) {
            this.triggerConfigurations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about triggers associated with the deployment group.
     * </p>
     * 
     * @param triggerConfigurations
     *        Information about triggers associated with the deployment group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withTriggerConfigurations(java.util.Collection<TriggerConfig> triggerConfigurations) {
        setTriggerConfigurations(triggerConfigurations);
        return this;
    }

    /**
     * <p>
     * A list of alarms associated with the deployment group.
     * </p>
     * 
     * @param alarmConfiguration
     *        A list of alarms associated with the deployment group.
     */

    public void setAlarmConfiguration(AlarmConfiguration alarmConfiguration) {
        this.alarmConfiguration = alarmConfiguration;
    }

    /**
     * <p>
     * A list of alarms associated with the deployment group.
     * </p>
     * 
     * @return A list of alarms associated with the deployment group.
     */

    public AlarmConfiguration getAlarmConfiguration() {
        return this.alarmConfiguration;
    }

    /**
     * <p>
     * A list of alarms associated with the deployment group.
     * </p>
     * 
     * @param alarmConfiguration
     *        A list of alarms associated with the deployment group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withAlarmConfiguration(AlarmConfiguration alarmConfiguration) {
        setAlarmConfiguration(alarmConfiguration);
        return this;
    }

    /**
     * <p>
     * Information about the automatic rollback configuration associated with the deployment group.
     * </p>
     * 
     * @param autoRollbackConfiguration
     *        Information about the automatic rollback configuration associated with the deployment group.
     */

    public void setAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
    }

    /**
     * <p>
     * Information about the automatic rollback configuration associated with the deployment group.
     * </p>
     * 
     * @return Information about the automatic rollback configuration associated with the deployment group.
     */

    public AutoRollbackConfiguration getAutoRollbackConfiguration() {
        return this.autoRollbackConfiguration;
    }

    /**
     * <p>
     * Information about the automatic rollback configuration associated with the deployment group.
     * </p>
     * 
     * @param autoRollbackConfiguration
     *        Information about the automatic rollback configuration associated with the deployment group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        setAutoRollbackConfiguration(autoRollbackConfiguration);
        return this;
    }

    /**
     * <p>
     * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route
     * deployment traffic behind a load balancer.
     * </p>
     * 
     * @param deploymentStyle
     *        Information about the type of deployment, either in-place or blue/green, you want to run and whether to
     *        route deployment traffic behind a load balancer.
     */

    public void setDeploymentStyle(DeploymentStyle deploymentStyle) {
        this.deploymentStyle = deploymentStyle;
    }

    /**
     * <p>
     * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route
     * deployment traffic behind a load balancer.
     * </p>
     * 
     * @return Information about the type of deployment, either in-place or blue/green, you want to run and whether to
     *         route deployment traffic behind a load balancer.
     */

    public DeploymentStyle getDeploymentStyle() {
        return this.deploymentStyle;
    }

    /**
     * <p>
     * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route
     * deployment traffic behind a load balancer.
     * </p>
     * 
     * @param deploymentStyle
     *        Information about the type of deployment, either in-place or blue/green, you want to run and whether to
     *        route deployment traffic behind a load balancer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withDeploymentStyle(DeploymentStyle deploymentStyle) {
        setDeploymentStyle(deploymentStyle);
        return this;
    }

    /**
     * <p>
     * Information about blue/green deployment options for a deployment group.
     * </p>
     * 
     * @param blueGreenDeploymentConfiguration
     *        Information about blue/green deployment options for a deployment group.
     */

    public void setBlueGreenDeploymentConfiguration(BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration) {
        this.blueGreenDeploymentConfiguration = blueGreenDeploymentConfiguration;
    }

    /**
     * <p>
     * Information about blue/green deployment options for a deployment group.
     * </p>
     * 
     * @return Information about blue/green deployment options for a deployment group.
     */

    public BlueGreenDeploymentConfiguration getBlueGreenDeploymentConfiguration() {
        return this.blueGreenDeploymentConfiguration;
    }

    /**
     * <p>
     * Information about blue/green deployment options for a deployment group.
     * </p>
     * 
     * @param blueGreenDeploymentConfiguration
     *        Information about blue/green deployment options for a deployment group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withBlueGreenDeploymentConfiguration(BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration) {
        setBlueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration);
        return this;
    }

    /**
     * <p>
     * Information about the load balancer to use in a deployment.
     * </p>
     * 
     * @param loadBalancerInfo
     *        Information about the load balancer to use in a deployment.
     */

    public void setLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        this.loadBalancerInfo = loadBalancerInfo;
    }

    /**
     * <p>
     * Information about the load balancer to use in a deployment.
     * </p>
     * 
     * @return Information about the load balancer to use in a deployment.
     */

    public LoadBalancerInfo getLoadBalancerInfo() {
        return this.loadBalancerInfo;
    }

    /**
     * <p>
     * Information about the load balancer to use in a deployment.
     * </p>
     * 
     * @param loadBalancerInfo
     *        Information about the load balancer to use in a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        setLoadBalancerInfo(loadBalancerInfo);
        return this;
    }

    /**
     * <p>
     * Information about the most recent successful deployment to the deployment group.
     * </p>
     * 
     * @param lastSuccessfulDeployment
     *        Information about the most recent successful deployment to the deployment group.
     */

    public void setLastSuccessfulDeployment(LastDeploymentInfo lastSuccessfulDeployment) {
        this.lastSuccessfulDeployment = lastSuccessfulDeployment;
    }

    /**
     * <p>
     * Information about the most recent successful deployment to the deployment group.
     * </p>
     * 
     * @return Information about the most recent successful deployment to the deployment group.
     */

    public LastDeploymentInfo getLastSuccessfulDeployment() {
        return this.lastSuccessfulDeployment;
    }

    /**
     * <p>
     * Information about the most recent successful deployment to the deployment group.
     * </p>
     * 
     * @param lastSuccessfulDeployment
     *        Information about the most recent successful deployment to the deployment group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withLastSuccessfulDeployment(LastDeploymentInfo lastSuccessfulDeployment) {
        setLastSuccessfulDeployment(lastSuccessfulDeployment);
        return this;
    }

    /**
     * <p>
     * Information about the most recent attempted deployment to the deployment group.
     * </p>
     * 
     * @param lastAttemptedDeployment
     *        Information about the most recent attempted deployment to the deployment group.
     */

    public void setLastAttemptedDeployment(LastDeploymentInfo lastAttemptedDeployment) {
        this.lastAttemptedDeployment = lastAttemptedDeployment;
    }

    /**
     * <p>
     * Information about the most recent attempted deployment to the deployment group.
     * </p>
     * 
     * @return Information about the most recent attempted deployment to the deployment group.
     */

    public LastDeploymentInfo getLastAttemptedDeployment() {
        return this.lastAttemptedDeployment;
    }

    /**
     * <p>
     * Information about the most recent attempted deployment to the deployment group.
     * </p>
     * 
     * @param lastAttemptedDeployment
     *        Information about the most recent attempted deployment to the deployment group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withLastAttemptedDeployment(LastDeploymentInfo lastAttemptedDeployment) {
        setLastAttemptedDeployment(lastAttemptedDeployment);
        return this;
    }

    /**
     * <p>
     * Information about groups of tags applied to an EC2 instance. The deployment group includes only EC2 instances
     * identified by all of the tag groups. Cannot be used in the same call as ec2TagFilters.
     * </p>
     * 
     * @param ec2TagSet
     *        Information about groups of tags applied to an EC2 instance. The deployment group includes only EC2
     *        instances identified by all of the tag groups. Cannot be used in the same call as ec2TagFilters.
     */

    public void setEc2TagSet(EC2TagSet ec2TagSet) {
        this.ec2TagSet = ec2TagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to an EC2 instance. The deployment group includes only EC2 instances
     * identified by all of the tag groups. Cannot be used in the same call as ec2TagFilters.
     * </p>
     * 
     * @return Information about groups of tags applied to an EC2 instance. The deployment group includes only EC2
     *         instances identified by all of the tag groups. Cannot be used in the same call as ec2TagFilters.
     */

    public EC2TagSet getEc2TagSet() {
        return this.ec2TagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to an EC2 instance. The deployment group includes only EC2 instances
     * identified by all of the tag groups. Cannot be used in the same call as ec2TagFilters.
     * </p>
     * 
     * @param ec2TagSet
     *        Information about groups of tags applied to an EC2 instance. The deployment group includes only EC2
     *        instances identified by all of the tag groups. Cannot be used in the same call as ec2TagFilters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withEc2TagSet(EC2TagSet ec2TagSet) {
        setEc2TagSet(ec2TagSet);
        return this;
    }

    /**
     * <p>
     * Information about groups of tags applied to an on-premises instance. The deployment group includes only
     * on-premises instances identified by all the tag groups. Cannot be used in the same call as
     * onPremisesInstanceTagFilters.
     * </p>
     * 
     * @param onPremisesTagSet
     *        Information about groups of tags applied to an on-premises instance. The deployment group includes only
     *        on-premises instances identified by all the tag groups. Cannot be used in the same call as
     *        onPremisesInstanceTagFilters.
     */

    public void setOnPremisesTagSet(OnPremisesTagSet onPremisesTagSet) {
        this.onPremisesTagSet = onPremisesTagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to an on-premises instance. The deployment group includes only
     * on-premises instances identified by all the tag groups. Cannot be used in the same call as
     * onPremisesInstanceTagFilters.
     * </p>
     * 
     * @return Information about groups of tags applied to an on-premises instance. The deployment group includes only
     *         on-premises instances identified by all the tag groups. Cannot be used in the same call as
     *         onPremisesInstanceTagFilters.
     */

    public OnPremisesTagSet getOnPremisesTagSet() {
        return this.onPremisesTagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to an on-premises instance. The deployment group includes only
     * on-premises instances identified by all the tag groups. Cannot be used in the same call as
     * onPremisesInstanceTagFilters.
     * </p>
     * 
     * @param onPremisesTagSet
     *        Information about groups of tags applied to an on-premises instance. The deployment group includes only
     *        on-premises instances identified by all the tag groups. Cannot be used in the same call as
     *        onPremisesInstanceTagFilters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withOnPremisesTagSet(OnPremisesTagSet onPremisesTagSet) {
        setOnPremisesTagSet(onPremisesTagSet);
        return this;
    }

    /**
     * <p>
     * The destination platform type for the deployment group (<code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for the deployment group (<code>Lambda</code> or <code>Server</code>).
     * @see ComputePlatform
     */

    public void setComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
    }

    /**
     * <p>
     * The destination platform type for the deployment group (<code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @return The destination platform type for the deployment group (<code>Lambda</code> or <code>Server</code>).
     * @see ComputePlatform
     */

    public String getComputePlatform() {
        return this.computePlatform;
    }

    /**
     * <p>
     * The destination platform type for the deployment group (<code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for the deployment group (<code>Lambda</code> or <code>Server</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputePlatform
     */

    public DeploymentGroupInfo withComputePlatform(String computePlatform) {
        setComputePlatform(computePlatform);
        return this;
    }

    /**
     * <p>
     * The destination platform type for the deployment group (<code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for the deployment group (<code>Lambda</code> or <code>Server</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputePlatform
     */

    public DeploymentGroupInfo withComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
        return this;
    }

    /**
     * <p>
     * The target Amazon ECS services in the deployment group. This applies only to deployment groups that use the
     * Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and service name
     * pair using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     * </p>
     * 
     * @return The target Amazon ECS services in the deployment group. This applies only to deployment groups that use
     *         the Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and
     *         service name pair using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     */

    public java.util.List<ECSService> getEcsServices() {
        if (ecsServices == null) {
            ecsServices = new com.amazonaws.internal.SdkInternalList<ECSService>();
        }
        return ecsServices;
    }

    /**
     * <p>
     * The target Amazon ECS services in the deployment group. This applies only to deployment groups that use the
     * Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and service name
     * pair using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     * </p>
     * 
     * @param ecsServices
     *        The target Amazon ECS services in the deployment group. This applies only to deployment groups that use
     *        the Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and
     *        service name pair using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     */

    public void setEcsServices(java.util.Collection<ECSService> ecsServices) {
        if (ecsServices == null) {
            this.ecsServices = null;
            return;
        }

        this.ecsServices = new com.amazonaws.internal.SdkInternalList<ECSService>(ecsServices);
    }

    /**
     * <p>
     * The target Amazon ECS services in the deployment group. This applies only to deployment groups that use the
     * Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and service name
     * pair using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEcsServices(java.util.Collection)} or {@link #withEcsServices(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param ecsServices
     *        The target Amazon ECS services in the deployment group. This applies only to deployment groups that use
     *        the Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and
     *        service name pair using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withEcsServices(ECSService... ecsServices) {
        if (this.ecsServices == null) {
            setEcsServices(new com.amazonaws.internal.SdkInternalList<ECSService>(ecsServices.length));
        }
        for (ECSService ele : ecsServices) {
            this.ecsServices.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The target Amazon ECS services in the deployment group. This applies only to deployment groups that use the
     * Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and service name
     * pair using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     * </p>
     * 
     * @param ecsServices
     *        The target Amazon ECS services in the deployment group. This applies only to deployment groups that use
     *        the Amazon ECS compute platform. A target Amazon ECS service is specified as an Amazon ECS cluster and
     *        service name pair using the format <code>&lt;clustername&gt;:&lt;servicename&gt;</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withEcsServices(java.util.Collection<ECSService> ecsServices) {
        setEcsServices(ecsServices);
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: ").append(getApplicationName()).append(",");
        if (getDeploymentGroupId() != null)
            sb.append("DeploymentGroupId: ").append(getDeploymentGroupId()).append(",");
        if (getDeploymentGroupName() != null)
            sb.append("DeploymentGroupName: ").append(getDeploymentGroupName()).append(",");
        if (getDeploymentConfigName() != null)
            sb.append("DeploymentConfigName: ").append(getDeploymentConfigName()).append(",");
        if (getEc2TagFilters() != null)
            sb.append("Ec2TagFilters: ").append(getEc2TagFilters()).append(",");
        if (getOnPremisesInstanceTagFilters() != null)
            sb.append("OnPremisesInstanceTagFilters: ").append(getOnPremisesInstanceTagFilters()).append(",");
        if (getAutoScalingGroups() != null)
            sb.append("AutoScalingGroups: ").append(getAutoScalingGroups()).append(",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: ").append(getServiceRoleArn()).append(",");
        if (getTargetRevision() != null)
            sb.append("TargetRevision: ").append(getTargetRevision()).append(",");
        if (getTriggerConfigurations() != null)
            sb.append("TriggerConfigurations: ").append(getTriggerConfigurations()).append(",");
        if (getAlarmConfiguration() != null)
            sb.append("AlarmConfiguration: ").append(getAlarmConfiguration()).append(",");
        if (getAutoRollbackConfiguration() != null)
            sb.append("AutoRollbackConfiguration: ").append(getAutoRollbackConfiguration()).append(",");
        if (getDeploymentStyle() != null)
            sb.append("DeploymentStyle: ").append(getDeploymentStyle()).append(",");
        if (getBlueGreenDeploymentConfiguration() != null)
            sb.append("BlueGreenDeploymentConfiguration: ").append(getBlueGreenDeploymentConfiguration()).append(",");
        if (getLoadBalancerInfo() != null)
            sb.append("LoadBalancerInfo: ").append(getLoadBalancerInfo()).append(",");
        if (getLastSuccessfulDeployment() != null)
            sb.append("LastSuccessfulDeployment: ").append(getLastSuccessfulDeployment()).append(",");
        if (getLastAttemptedDeployment() != null)
            sb.append("LastAttemptedDeployment: ").append(getLastAttemptedDeployment()).append(",");
        if (getEc2TagSet() != null)
            sb.append("Ec2TagSet: ").append(getEc2TagSet()).append(",");
        if (getOnPremisesTagSet() != null)
            sb.append("OnPremisesTagSet: ").append(getOnPremisesTagSet()).append(",");
        if (getComputePlatform() != null)
            sb.append("ComputePlatform: ").append(getComputePlatform()).append(",");
        if (getEcsServices() != null)
            sb.append("EcsServices: ").append(getEcsServices());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentGroupInfo == false)
            return false;
        DeploymentGroupInfo other = (DeploymentGroupInfo) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDeploymentGroupId() == null ^ this.getDeploymentGroupId() == null)
            return false;
        if (other.getDeploymentGroupId() != null && other.getDeploymentGroupId().equals(this.getDeploymentGroupId()) == false)
            return false;
        if (other.getDeploymentGroupName() == null ^ this.getDeploymentGroupName() == null)
            return false;
        if (other.getDeploymentGroupName() != null && other.getDeploymentGroupName().equals(this.getDeploymentGroupName()) == false)
            return false;
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null)
            return false;
        if (other.getDeploymentConfigName() != null && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false)
            return false;
        if (other.getEc2TagFilters() == null ^ this.getEc2TagFilters() == null)
            return false;
        if (other.getEc2TagFilters() != null && other.getEc2TagFilters().equals(this.getEc2TagFilters()) == false)
            return false;
        if (other.getOnPremisesInstanceTagFilters() == null ^ this.getOnPremisesInstanceTagFilters() == null)
            return false;
        if (other.getOnPremisesInstanceTagFilters() != null && other.getOnPremisesInstanceTagFilters().equals(this.getOnPremisesInstanceTagFilters()) == false)
            return false;
        if (other.getAutoScalingGroups() == null ^ this.getAutoScalingGroups() == null)
            return false;
        if (other.getAutoScalingGroups() != null && other.getAutoScalingGroups().equals(this.getAutoScalingGroups()) == false)
            return false;
        if (other.getServiceRoleArn() == null ^ this.getServiceRoleArn() == null)
            return false;
        if (other.getServiceRoleArn() != null && other.getServiceRoleArn().equals(this.getServiceRoleArn()) == false)
            return false;
        if (other.getTargetRevision() == null ^ this.getTargetRevision() == null)
            return false;
        if (other.getTargetRevision() != null && other.getTargetRevision().equals(this.getTargetRevision()) == false)
            return false;
        if (other.getTriggerConfigurations() == null ^ this.getTriggerConfigurations() == null)
            return false;
        if (other.getTriggerConfigurations() != null && other.getTriggerConfigurations().equals(this.getTriggerConfigurations()) == false)
            return false;
        if (other.getAlarmConfiguration() == null ^ this.getAlarmConfiguration() == null)
            return false;
        if (other.getAlarmConfiguration() != null && other.getAlarmConfiguration().equals(this.getAlarmConfiguration()) == false)
            return false;
        if (other.getAutoRollbackConfiguration() == null ^ this.getAutoRollbackConfiguration() == null)
            return false;
        if (other.getAutoRollbackConfiguration() != null && other.getAutoRollbackConfiguration().equals(this.getAutoRollbackConfiguration()) == false)
            return false;
        if (other.getDeploymentStyle() == null ^ this.getDeploymentStyle() == null)
            return false;
        if (other.getDeploymentStyle() != null && other.getDeploymentStyle().equals(this.getDeploymentStyle()) == false)
            return false;
        if (other.getBlueGreenDeploymentConfiguration() == null ^ this.getBlueGreenDeploymentConfiguration() == null)
            return false;
        if (other.getBlueGreenDeploymentConfiguration() != null
                && other.getBlueGreenDeploymentConfiguration().equals(this.getBlueGreenDeploymentConfiguration()) == false)
            return false;
        if (other.getLoadBalancerInfo() == null ^ this.getLoadBalancerInfo() == null)
            return false;
        if (other.getLoadBalancerInfo() != null && other.getLoadBalancerInfo().equals(this.getLoadBalancerInfo()) == false)
            return false;
        if (other.getLastSuccessfulDeployment() == null ^ this.getLastSuccessfulDeployment() == null)
            return false;
        if (other.getLastSuccessfulDeployment() != null && other.getLastSuccessfulDeployment().equals(this.getLastSuccessfulDeployment()) == false)
            return false;
        if (other.getLastAttemptedDeployment() == null ^ this.getLastAttemptedDeployment() == null)
            return false;
        if (other.getLastAttemptedDeployment() != null && other.getLastAttemptedDeployment().equals(this.getLastAttemptedDeployment()) == false)
            return false;
        if (other.getEc2TagSet() == null ^ this.getEc2TagSet() == null)
            return false;
        if (other.getEc2TagSet() != null && other.getEc2TagSet().equals(this.getEc2TagSet()) == false)
            return false;
        if (other.getOnPremisesTagSet() == null ^ this.getOnPremisesTagSet() == null)
            return false;
        if (other.getOnPremisesTagSet() != null && other.getOnPremisesTagSet().equals(this.getOnPremisesTagSet()) == false)
            return false;
        if (other.getComputePlatform() == null ^ this.getComputePlatform() == null)
            return false;
        if (other.getComputePlatform() != null && other.getComputePlatform().equals(this.getComputePlatform()) == false)
            return false;
        if (other.getEcsServices() == null ^ this.getEcsServices() == null)
            return false;
        if (other.getEcsServices() != null && other.getEcsServices().equals(this.getEcsServices()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentGroupId() == null) ? 0 : getDeploymentGroupId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentGroupName() == null) ? 0 : getDeploymentGroupName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode());
        hashCode = prime * hashCode + ((getEc2TagFilters() == null) ? 0 : getEc2TagFilters().hashCode());
        hashCode = prime * hashCode + ((getOnPremisesInstanceTagFilters() == null) ? 0 : getOnPremisesInstanceTagFilters().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTargetRevision() == null) ? 0 : getTargetRevision().hashCode());
        hashCode = prime * hashCode + ((getTriggerConfigurations() == null) ? 0 : getTriggerConfigurations().hashCode());
        hashCode = prime * hashCode + ((getAlarmConfiguration() == null) ? 0 : getAlarmConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAutoRollbackConfiguration() == null) ? 0 : getAutoRollbackConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStyle() == null) ? 0 : getDeploymentStyle().hashCode());
        hashCode = prime * hashCode + ((getBlueGreenDeploymentConfiguration() == null) ? 0 : getBlueGreenDeploymentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerInfo() == null) ? 0 : getLoadBalancerInfo().hashCode());
        hashCode = prime * hashCode + ((getLastSuccessfulDeployment() == null) ? 0 : getLastSuccessfulDeployment().hashCode());
        hashCode = prime * hashCode + ((getLastAttemptedDeployment() == null) ? 0 : getLastAttemptedDeployment().hashCode());
        hashCode = prime * hashCode + ((getEc2TagSet() == null) ? 0 : getEc2TagSet().hashCode());
        hashCode = prime * hashCode + ((getOnPremisesTagSet() == null) ? 0 : getOnPremisesTagSet().hashCode());
        hashCode = prime * hashCode + ((getComputePlatform() == null) ? 0 : getComputePlatform().hashCode());
        hashCode = prime * hashCode + ((getEcsServices() == null) ? 0 : getEcsServices().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentGroupInfo clone() {
        try {
            return (DeploymentGroupInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.DeploymentGroupInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
