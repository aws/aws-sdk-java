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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of an UpdateDeploymentGroup operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/UpdateDeploymentGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateDeploymentGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application name that corresponds to the deployment group to update.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The current name of the deployment group.
     * </p>
     */
    private String currentDeploymentGroupName;
    /**
     * <p>
     * The new name of the deployment group, if you want to change it.
     * </p>
     */
    private String newDeploymentGroupName;
    /**
     * <p>
     * The replacement deployment configuration name to use, if you want to change it.
     * </p>
     */
    private String deploymentConfigName;
    /**
     * <p>
     * The replacement set of Amazon EC2 tags on which to filter, if you want to change them. To keep the existing tags,
     * enter their names. To remove tags, do not enter any tag names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EC2TagFilter> ec2TagFilters;
    /**
     * <p>
     * The replacement set of on-premises instance tags on which to filter, if you want to change them. To keep the
     * existing tags, enter their names. To remove tags, do not enter any tag names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagFilter> onPremisesInstanceTagFilters;
    /**
     * <p>
     * The replacement list of Auto Scaling groups to be included in the deployment group, if you want to change them.
     * To keep the Auto Scaling groups, enter their names. To remove Auto Scaling groups, do not enter any Auto Scaling
     * group names.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> autoScalingGroups;
    /**
     * <p>
     * A replacement ARN for the service role, if you want to change it.
     * </p>
     */
    private String serviceRoleArn;
    /**
     * <p>
     * Information about triggers to change when the deployment group is updated. For examples, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in an AWS
     * CodeDeploy Deployment Group</a> in the AWS CodeDeploy User Guide.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TriggerConfig> triggerConfigurations;
    /**
     * <p>
     * Information to add or change about Amazon CloudWatch alarms when the deployment group is updated.
     * </p>
     */
    private AlarmConfiguration alarmConfiguration;
    /**
     * <p>
     * Information for an automatic rollback configuration that is added or changed when a deployment group is updated.
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
     * Information about the load balancer used in a deployment.
     * </p>
     */
    private LoadBalancerInfo loadBalancerInfo;
    /**
     * <p>
     * Information about groups of tags applied to on-premises instances. The deployment group includes only EC2
     * instances identified by all the tag groups.
     * </p>
     */
    private EC2TagSet ec2TagSet;
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
     * Information about an on-premises instance tag set. The deployment group includes only on-premises instances
     * identified by all the tag groups.
     * </p>
     */
    private OnPremisesTagSet onPremisesTagSet;

    /**
     * <p>
     * The application name that corresponds to the deployment group to update.
     * </p>
     * 
     * @param applicationName
     *        The application name that corresponds to the deployment group to update.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The application name that corresponds to the deployment group to update.
     * </p>
     * 
     * @return The application name that corresponds to the deployment group to update.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The application name that corresponds to the deployment group to update.
     * </p>
     * 
     * @param applicationName
     *        The application name that corresponds to the deployment group to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The current name of the deployment group.
     * </p>
     * 
     * @param currentDeploymentGroupName
     *        The current name of the deployment group.
     */

    public void setCurrentDeploymentGroupName(String currentDeploymentGroupName) {
        this.currentDeploymentGroupName = currentDeploymentGroupName;
    }

    /**
     * <p>
     * The current name of the deployment group.
     * </p>
     * 
     * @return The current name of the deployment group.
     */

    public String getCurrentDeploymentGroupName() {
        return this.currentDeploymentGroupName;
    }

    /**
     * <p>
     * The current name of the deployment group.
     * </p>
     * 
     * @param currentDeploymentGroupName
     *        The current name of the deployment group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withCurrentDeploymentGroupName(String currentDeploymentGroupName) {
        setCurrentDeploymentGroupName(currentDeploymentGroupName);
        return this;
    }

    /**
     * <p>
     * The new name of the deployment group, if you want to change it.
     * </p>
     * 
     * @param newDeploymentGroupName
     *        The new name of the deployment group, if you want to change it.
     */

    public void setNewDeploymentGroupName(String newDeploymentGroupName) {
        this.newDeploymentGroupName = newDeploymentGroupName;
    }

    /**
     * <p>
     * The new name of the deployment group, if you want to change it.
     * </p>
     * 
     * @return The new name of the deployment group, if you want to change it.
     */

    public String getNewDeploymentGroupName() {
        return this.newDeploymentGroupName;
    }

    /**
     * <p>
     * The new name of the deployment group, if you want to change it.
     * </p>
     * 
     * @param newDeploymentGroupName
     *        The new name of the deployment group, if you want to change it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withNewDeploymentGroupName(String newDeploymentGroupName) {
        setNewDeploymentGroupName(newDeploymentGroupName);
        return this;
    }

    /**
     * <p>
     * The replacement deployment configuration name to use, if you want to change it.
     * </p>
     * 
     * @param deploymentConfigName
     *        The replacement deployment configuration name to use, if you want to change it.
     */

    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * The replacement deployment configuration name to use, if you want to change it.
     * </p>
     * 
     * @return The replacement deployment configuration name to use, if you want to change it.
     */

    public String getDeploymentConfigName() {
        return this.deploymentConfigName;
    }

    /**
     * <p>
     * The replacement deployment configuration name to use, if you want to change it.
     * </p>
     * 
     * @param deploymentConfigName
     *        The replacement deployment configuration name to use, if you want to change it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withDeploymentConfigName(String deploymentConfigName) {
        setDeploymentConfigName(deploymentConfigName);
        return this;
    }

    /**
     * <p>
     * The replacement set of Amazon EC2 tags on which to filter, if you want to change them. To keep the existing tags,
     * enter their names. To remove tags, do not enter any tag names.
     * </p>
     * 
     * @return The replacement set of Amazon EC2 tags on which to filter, if you want to change them. To keep the
     *         existing tags, enter their names. To remove tags, do not enter any tag names.
     */

    public java.util.List<EC2TagFilter> getEc2TagFilters() {
        if (ec2TagFilters == null) {
            ec2TagFilters = new com.amazonaws.internal.SdkInternalList<EC2TagFilter>();
        }
        return ec2TagFilters;
    }

    /**
     * <p>
     * The replacement set of Amazon EC2 tags on which to filter, if you want to change them. To keep the existing tags,
     * enter their names. To remove tags, do not enter any tag names.
     * </p>
     * 
     * @param ec2TagFilters
     *        The replacement set of Amazon EC2 tags on which to filter, if you want to change them. To keep the
     *        existing tags, enter their names. To remove tags, do not enter any tag names.
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
     * The replacement set of Amazon EC2 tags on which to filter, if you want to change them. To keep the existing tags,
     * enter their names. To remove tags, do not enter any tag names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2TagFilters(java.util.Collection)} or {@link #withEc2TagFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ec2TagFilters
     *        The replacement set of Amazon EC2 tags on which to filter, if you want to change them. To keep the
     *        existing tags, enter their names. To remove tags, do not enter any tag names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withEc2TagFilters(EC2TagFilter... ec2TagFilters) {
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
     * The replacement set of Amazon EC2 tags on which to filter, if you want to change them. To keep the existing tags,
     * enter their names. To remove tags, do not enter any tag names.
     * </p>
     * 
     * @param ec2TagFilters
     *        The replacement set of Amazon EC2 tags on which to filter, if you want to change them. To keep the
     *        existing tags, enter their names. To remove tags, do not enter any tag names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withEc2TagFilters(java.util.Collection<EC2TagFilter> ec2TagFilters) {
        setEc2TagFilters(ec2TagFilters);
        return this;
    }

    /**
     * <p>
     * The replacement set of on-premises instance tags on which to filter, if you want to change them. To keep the
     * existing tags, enter their names. To remove tags, do not enter any tag names.
     * </p>
     * 
     * @return The replacement set of on-premises instance tags on which to filter, if you want to change them. To keep
     *         the existing tags, enter their names. To remove tags, do not enter any tag names.
     */

    public java.util.List<TagFilter> getOnPremisesInstanceTagFilters() {
        if (onPremisesInstanceTagFilters == null) {
            onPremisesInstanceTagFilters = new com.amazonaws.internal.SdkInternalList<TagFilter>();
        }
        return onPremisesInstanceTagFilters;
    }

    /**
     * <p>
     * The replacement set of on-premises instance tags on which to filter, if you want to change them. To keep the
     * existing tags, enter their names. To remove tags, do not enter any tag names.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The replacement set of on-premises instance tags on which to filter, if you want to change them. To keep
     *        the existing tags, enter their names. To remove tags, do not enter any tag names.
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
     * The replacement set of on-premises instance tags on which to filter, if you want to change them. To keep the
     * existing tags, enter their names. To remove tags, do not enter any tag names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOnPremisesInstanceTagFilters(java.util.Collection)} or
     * {@link #withOnPremisesInstanceTagFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The replacement set of on-premises instance tags on which to filter, if you want to change them. To keep
     *        the existing tags, enter their names. To remove tags, do not enter any tag names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withOnPremisesInstanceTagFilters(TagFilter... onPremisesInstanceTagFilters) {
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
     * The replacement set of on-premises instance tags on which to filter, if you want to change them. To keep the
     * existing tags, enter their names. To remove tags, do not enter any tag names.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The replacement set of on-premises instance tags on which to filter, if you want to change them. To keep
     *        the existing tags, enter their names. To remove tags, do not enter any tag names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withOnPremisesInstanceTagFilters(java.util.Collection<TagFilter> onPremisesInstanceTagFilters) {
        setOnPremisesInstanceTagFilters(onPremisesInstanceTagFilters);
        return this;
    }

    /**
     * <p>
     * The replacement list of Auto Scaling groups to be included in the deployment group, if you want to change them.
     * To keep the Auto Scaling groups, enter their names. To remove Auto Scaling groups, do not enter any Auto Scaling
     * group names.
     * </p>
     * 
     * @return The replacement list of Auto Scaling groups to be included in the deployment group, if you want to change
     *         them. To keep the Auto Scaling groups, enter their names. To remove Auto Scaling groups, do not enter any
     *         Auto Scaling group names.
     */

    public java.util.List<String> getAutoScalingGroups() {
        if (autoScalingGroups == null) {
            autoScalingGroups = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return autoScalingGroups;
    }

    /**
     * <p>
     * The replacement list of Auto Scaling groups to be included in the deployment group, if you want to change them.
     * To keep the Auto Scaling groups, enter their names. To remove Auto Scaling groups, do not enter any Auto Scaling
     * group names.
     * </p>
     * 
     * @param autoScalingGroups
     *        The replacement list of Auto Scaling groups to be included in the deployment group, if you want to change
     *        them. To keep the Auto Scaling groups, enter their names. To remove Auto Scaling groups, do not enter any
     *        Auto Scaling group names.
     */

    public void setAutoScalingGroups(java.util.Collection<String> autoScalingGroups) {
        if (autoScalingGroups == null) {
            this.autoScalingGroups = null;
            return;
        }

        this.autoScalingGroups = new com.amazonaws.internal.SdkInternalList<String>(autoScalingGroups);
    }

    /**
     * <p>
     * The replacement list of Auto Scaling groups to be included in the deployment group, if you want to change them.
     * To keep the Auto Scaling groups, enter their names. To remove Auto Scaling groups, do not enter any Auto Scaling
     * group names.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoScalingGroups(java.util.Collection)} or {@link #withAutoScalingGroups(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param autoScalingGroups
     *        The replacement list of Auto Scaling groups to be included in the deployment group, if you want to change
     *        them. To keep the Auto Scaling groups, enter their names. To remove Auto Scaling groups, do not enter any
     *        Auto Scaling group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withAutoScalingGroups(String... autoScalingGroups) {
        if (this.autoScalingGroups == null) {
            setAutoScalingGroups(new com.amazonaws.internal.SdkInternalList<String>(autoScalingGroups.length));
        }
        for (String ele : autoScalingGroups) {
            this.autoScalingGroups.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The replacement list of Auto Scaling groups to be included in the deployment group, if you want to change them.
     * To keep the Auto Scaling groups, enter their names. To remove Auto Scaling groups, do not enter any Auto Scaling
     * group names.
     * </p>
     * 
     * @param autoScalingGroups
     *        The replacement list of Auto Scaling groups to be included in the deployment group, if you want to change
     *        them. To keep the Auto Scaling groups, enter their names. To remove Auto Scaling groups, do not enter any
     *        Auto Scaling group names.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withAutoScalingGroups(java.util.Collection<String> autoScalingGroups) {
        setAutoScalingGroups(autoScalingGroups);
        return this;
    }

    /**
     * <p>
     * A replacement ARN for the service role, if you want to change it.
     * </p>
     * 
     * @param serviceRoleArn
     *        A replacement ARN for the service role, if you want to change it.
     */

    public void setServiceRoleArn(String serviceRoleArn) {
        this.serviceRoleArn = serviceRoleArn;
    }

    /**
     * <p>
     * A replacement ARN for the service role, if you want to change it.
     * </p>
     * 
     * @return A replacement ARN for the service role, if you want to change it.
     */

    public String getServiceRoleArn() {
        return this.serviceRoleArn;
    }

    /**
     * <p>
     * A replacement ARN for the service role, if you want to change it.
     * </p>
     * 
     * @param serviceRoleArn
     *        A replacement ARN for the service role, if you want to change it.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withServiceRoleArn(String serviceRoleArn) {
        setServiceRoleArn(serviceRoleArn);
        return this;
    }

    /**
     * <p>
     * Information about triggers to change when the deployment group is updated. For examples, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in an AWS
     * CodeDeploy Deployment Group</a> in the AWS CodeDeploy User Guide.
     * </p>
     * 
     * @return Information about triggers to change when the deployment group is updated. For examples, see <a
     *         href="https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in
     *         an AWS CodeDeploy Deployment Group</a> in the AWS CodeDeploy User Guide.
     */

    public java.util.List<TriggerConfig> getTriggerConfigurations() {
        if (triggerConfigurations == null) {
            triggerConfigurations = new com.amazonaws.internal.SdkInternalList<TriggerConfig>();
        }
        return triggerConfigurations;
    }

    /**
     * <p>
     * Information about triggers to change when the deployment group is updated. For examples, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in an AWS
     * CodeDeploy Deployment Group</a> in the AWS CodeDeploy User Guide.
     * </p>
     * 
     * @param triggerConfigurations
     *        Information about triggers to change when the deployment group is updated. For examples, see <a
     *        href="https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in
     *        an AWS CodeDeploy Deployment Group</a> in the AWS CodeDeploy User Guide.
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
     * Information about triggers to change when the deployment group is updated. For examples, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in an AWS
     * CodeDeploy Deployment Group</a> in the AWS CodeDeploy User Guide.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTriggerConfigurations(java.util.Collection)} or
     * {@link #withTriggerConfigurations(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param triggerConfigurations
     *        Information about triggers to change when the deployment group is updated. For examples, see <a
     *        href="https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in
     *        an AWS CodeDeploy Deployment Group</a> in the AWS CodeDeploy User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withTriggerConfigurations(TriggerConfig... triggerConfigurations) {
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
     * Information about triggers to change when the deployment group is updated. For examples, see <a
     * href="https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in an AWS
     * CodeDeploy Deployment Group</a> in the AWS CodeDeploy User Guide.
     * </p>
     * 
     * @param triggerConfigurations
     *        Information about triggers to change when the deployment group is updated. For examples, see <a
     *        href="https://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in
     *        an AWS CodeDeploy Deployment Group</a> in the AWS CodeDeploy User Guide.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withTriggerConfigurations(java.util.Collection<TriggerConfig> triggerConfigurations) {
        setTriggerConfigurations(triggerConfigurations);
        return this;
    }

    /**
     * <p>
     * Information to add or change about Amazon CloudWatch alarms when the deployment group is updated.
     * </p>
     * 
     * @param alarmConfiguration
     *        Information to add or change about Amazon CloudWatch alarms when the deployment group is updated.
     */

    public void setAlarmConfiguration(AlarmConfiguration alarmConfiguration) {
        this.alarmConfiguration = alarmConfiguration;
    }

    /**
     * <p>
     * Information to add or change about Amazon CloudWatch alarms when the deployment group is updated.
     * </p>
     * 
     * @return Information to add or change about Amazon CloudWatch alarms when the deployment group is updated.
     */

    public AlarmConfiguration getAlarmConfiguration() {
        return this.alarmConfiguration;
    }

    /**
     * <p>
     * Information to add or change about Amazon CloudWatch alarms when the deployment group is updated.
     * </p>
     * 
     * @param alarmConfiguration
     *        Information to add or change about Amazon CloudWatch alarms when the deployment group is updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withAlarmConfiguration(AlarmConfiguration alarmConfiguration) {
        setAlarmConfiguration(alarmConfiguration);
        return this;
    }

    /**
     * <p>
     * Information for an automatic rollback configuration that is added or changed when a deployment group is updated.
     * </p>
     * 
     * @param autoRollbackConfiguration
     *        Information for an automatic rollback configuration that is added or changed when a deployment group is
     *        updated.
     */

    public void setAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
    }

    /**
     * <p>
     * Information for an automatic rollback configuration that is added or changed when a deployment group is updated.
     * </p>
     * 
     * @return Information for an automatic rollback configuration that is added or changed when a deployment group is
     *         updated.
     */

    public AutoRollbackConfiguration getAutoRollbackConfiguration() {
        return this.autoRollbackConfiguration;
    }

    /**
     * <p>
     * Information for an automatic rollback configuration that is added or changed when a deployment group is updated.
     * </p>
     * 
     * @param autoRollbackConfiguration
     *        Information for an automatic rollback configuration that is added or changed when a deployment group is
     *        updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
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

    public UpdateDeploymentGroupRequest withDeploymentStyle(DeploymentStyle deploymentStyle) {
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

    public UpdateDeploymentGroupRequest withBlueGreenDeploymentConfiguration(BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration) {
        setBlueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration);
        return this;
    }

    /**
     * <p>
     * Information about the load balancer used in a deployment.
     * </p>
     * 
     * @param loadBalancerInfo
     *        Information about the load balancer used in a deployment.
     */

    public void setLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        this.loadBalancerInfo = loadBalancerInfo;
    }

    /**
     * <p>
     * Information about the load balancer used in a deployment.
     * </p>
     * 
     * @return Information about the load balancer used in a deployment.
     */

    public LoadBalancerInfo getLoadBalancerInfo() {
        return this.loadBalancerInfo;
    }

    /**
     * <p>
     * Information about the load balancer used in a deployment.
     * </p>
     * 
     * @param loadBalancerInfo
     *        Information about the load balancer used in a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        setLoadBalancerInfo(loadBalancerInfo);
        return this;
    }

    /**
     * <p>
     * Information about groups of tags applied to on-premises instances. The deployment group includes only EC2
     * instances identified by all the tag groups.
     * </p>
     * 
     * @param ec2TagSet
     *        Information about groups of tags applied to on-premises instances. The deployment group includes only EC2
     *        instances identified by all the tag groups.
     */

    public void setEc2TagSet(EC2TagSet ec2TagSet) {
        this.ec2TagSet = ec2TagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to on-premises instances. The deployment group includes only EC2
     * instances identified by all the tag groups.
     * </p>
     * 
     * @return Information about groups of tags applied to on-premises instances. The deployment group includes only EC2
     *         instances identified by all the tag groups.
     */

    public EC2TagSet getEc2TagSet() {
        return this.ec2TagSet;
    }

    /**
     * <p>
     * Information about groups of tags applied to on-premises instances. The deployment group includes only EC2
     * instances identified by all the tag groups.
     * </p>
     * 
     * @param ec2TagSet
     *        Information about groups of tags applied to on-premises instances. The deployment group includes only EC2
     *        instances identified by all the tag groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withEc2TagSet(EC2TagSet ec2TagSet) {
        setEc2TagSet(ec2TagSet);
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

    public UpdateDeploymentGroupRequest withEcsServices(ECSService... ecsServices) {
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

    public UpdateDeploymentGroupRequest withEcsServices(java.util.Collection<ECSService> ecsServices) {
        setEcsServices(ecsServices);
        return this;
    }

    /**
     * <p>
     * Information about an on-premises instance tag set. The deployment group includes only on-premises instances
     * identified by all the tag groups.
     * </p>
     * 
     * @param onPremisesTagSet
     *        Information about an on-premises instance tag set. The deployment group includes only on-premises
     *        instances identified by all the tag groups.
     */

    public void setOnPremisesTagSet(OnPremisesTagSet onPremisesTagSet) {
        this.onPremisesTagSet = onPremisesTagSet;
    }

    /**
     * <p>
     * Information about an on-premises instance tag set. The deployment group includes only on-premises instances
     * identified by all the tag groups.
     * </p>
     * 
     * @return Information about an on-premises instance tag set. The deployment group includes only on-premises
     *         instances identified by all the tag groups.
     */

    public OnPremisesTagSet getOnPremisesTagSet() {
        return this.onPremisesTagSet;
    }

    /**
     * <p>
     * Information about an on-premises instance tag set. The deployment group includes only on-premises instances
     * identified by all the tag groups.
     * </p>
     * 
     * @param onPremisesTagSet
     *        Information about an on-premises instance tag set. The deployment group includes only on-premises
     *        instances identified by all the tag groups.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateDeploymentGroupRequest withOnPremisesTagSet(OnPremisesTagSet onPremisesTagSet) {
        setOnPremisesTagSet(onPremisesTagSet);
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
        if (getCurrentDeploymentGroupName() != null)
            sb.append("CurrentDeploymentGroupName: ").append(getCurrentDeploymentGroupName()).append(",");
        if (getNewDeploymentGroupName() != null)
            sb.append("NewDeploymentGroupName: ").append(getNewDeploymentGroupName()).append(",");
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
        if (getEc2TagSet() != null)
            sb.append("Ec2TagSet: ").append(getEc2TagSet()).append(",");
        if (getEcsServices() != null)
            sb.append("EcsServices: ").append(getEcsServices()).append(",");
        if (getOnPremisesTagSet() != null)
            sb.append("OnPremisesTagSet: ").append(getOnPremisesTagSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateDeploymentGroupRequest == false)
            return false;
        UpdateDeploymentGroupRequest other = (UpdateDeploymentGroupRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getCurrentDeploymentGroupName() == null ^ this.getCurrentDeploymentGroupName() == null)
            return false;
        if (other.getCurrentDeploymentGroupName() != null && other.getCurrentDeploymentGroupName().equals(this.getCurrentDeploymentGroupName()) == false)
            return false;
        if (other.getNewDeploymentGroupName() == null ^ this.getNewDeploymentGroupName() == null)
            return false;
        if (other.getNewDeploymentGroupName() != null && other.getNewDeploymentGroupName().equals(this.getNewDeploymentGroupName()) == false)
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
        if (other.getEc2TagSet() == null ^ this.getEc2TagSet() == null)
            return false;
        if (other.getEc2TagSet() != null && other.getEc2TagSet().equals(this.getEc2TagSet()) == false)
            return false;
        if (other.getEcsServices() == null ^ this.getEcsServices() == null)
            return false;
        if (other.getEcsServices() != null && other.getEcsServices().equals(this.getEcsServices()) == false)
            return false;
        if (other.getOnPremisesTagSet() == null ^ this.getOnPremisesTagSet() == null)
            return false;
        if (other.getOnPremisesTagSet() != null && other.getOnPremisesTagSet().equals(this.getOnPremisesTagSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getCurrentDeploymentGroupName() == null) ? 0 : getCurrentDeploymentGroupName().hashCode());
        hashCode = prime * hashCode + ((getNewDeploymentGroupName() == null) ? 0 : getNewDeploymentGroupName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode());
        hashCode = prime * hashCode + ((getEc2TagFilters() == null) ? 0 : getEc2TagFilters().hashCode());
        hashCode = prime * hashCode + ((getOnPremisesInstanceTagFilters() == null) ? 0 : getOnPremisesInstanceTagFilters().hashCode());
        hashCode = prime * hashCode + ((getAutoScalingGroups() == null) ? 0 : getAutoScalingGroups().hashCode());
        hashCode = prime * hashCode + ((getServiceRoleArn() == null) ? 0 : getServiceRoleArn().hashCode());
        hashCode = prime * hashCode + ((getTriggerConfigurations() == null) ? 0 : getTriggerConfigurations().hashCode());
        hashCode = prime * hashCode + ((getAlarmConfiguration() == null) ? 0 : getAlarmConfiguration().hashCode());
        hashCode = prime * hashCode + ((getAutoRollbackConfiguration() == null) ? 0 : getAutoRollbackConfiguration().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStyle() == null) ? 0 : getDeploymentStyle().hashCode());
        hashCode = prime * hashCode + ((getBlueGreenDeploymentConfiguration() == null) ? 0 : getBlueGreenDeploymentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerInfo() == null) ? 0 : getLoadBalancerInfo().hashCode());
        hashCode = prime * hashCode + ((getEc2TagSet() == null) ? 0 : getEc2TagSet().hashCode());
        hashCode = prime * hashCode + ((getEcsServices() == null) ? 0 : getEcsServices().hashCode());
        hashCode = prime * hashCode + ((getOnPremisesTagSet() == null) ? 0 : getOnPremisesTagSet().hashCode());
        return hashCode;
    }

    @Override
    public UpdateDeploymentGroupRequest clone() {
        return (UpdateDeploymentGroupRequest) super.clone();
    }

}
