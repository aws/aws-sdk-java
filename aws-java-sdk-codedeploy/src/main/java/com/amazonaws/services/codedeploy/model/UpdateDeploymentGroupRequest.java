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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of an update deployment group operation.
 * </p>
 */
public class UpdateDeploymentGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The application name corresponding to the deployment group to update.
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
     * href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in an AWS
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
     * The application name corresponding to the deployment group to update.
     * </p>
     * 
     * @param applicationName
     *        The application name corresponding to the deployment group to update.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The application name corresponding to the deployment group to update.
     * </p>
     * 
     * @return The application name corresponding to the deployment group to update.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The application name corresponding to the deployment group to update.
     * </p>
     * 
     * @param applicationName
     *        The application name corresponding to the deployment group to update.
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
     * href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in an AWS
     * CodeDeploy Deployment Group</a> in the AWS CodeDeploy User Guide.
     * </p>
     * 
     * @return Information about triggers to change when the deployment group is updated. For examples, see <a
     *         href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in
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
     * href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in an AWS
     * CodeDeploy Deployment Group</a> in the AWS CodeDeploy User Guide.
     * </p>
     * 
     * @param triggerConfigurations
     *        Information about triggers to change when the deployment group is updated. For examples, see <a
     *        href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in
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
     * href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in an AWS
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
     *        href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in
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
     * href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in an AWS
     * CodeDeploy Deployment Group</a> in the AWS CodeDeploy User Guide.
     * </p>
     * 
     * @param triggerConfigurations
     *        Information about triggers to change when the deployment group is updated. For examples, see <a
     *        href="http://docs.aws.amazon.com/codedeploy/latest/userguide/how-to-notify-edit.html">Modify Triggers in
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
        if (getApplicationName() != null)
            sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getCurrentDeploymentGroupName() != null)
            sb.append("CurrentDeploymentGroupName: " + getCurrentDeploymentGroupName() + ",");
        if (getNewDeploymentGroupName() != null)
            sb.append("NewDeploymentGroupName: " + getNewDeploymentGroupName() + ",");
        if (getDeploymentConfigName() != null)
            sb.append("DeploymentConfigName: " + getDeploymentConfigName() + ",");
        if (getEc2TagFilters() != null)
            sb.append("Ec2TagFilters: " + getEc2TagFilters() + ",");
        if (getOnPremisesInstanceTagFilters() != null)
            sb.append("OnPremisesInstanceTagFilters: " + getOnPremisesInstanceTagFilters() + ",");
        if (getAutoScalingGroups() != null)
            sb.append("AutoScalingGroups: " + getAutoScalingGroups() + ",");
        if (getServiceRoleArn() != null)
            sb.append("ServiceRoleArn: " + getServiceRoleArn() + ",");
        if (getTriggerConfigurations() != null)
            sb.append("TriggerConfigurations: " + getTriggerConfigurations() + ",");
        if (getAlarmConfiguration() != null)
            sb.append("AlarmConfiguration: " + getAlarmConfiguration() + ",");
        if (getAutoRollbackConfiguration() != null)
            sb.append("AutoRollbackConfiguration: " + getAutoRollbackConfiguration());
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
        return hashCode;
    }

    @Override
    public UpdateDeploymentGroupRequest clone() {
        return (UpdateDeploymentGroupRequest) super.clone();
    }
}
