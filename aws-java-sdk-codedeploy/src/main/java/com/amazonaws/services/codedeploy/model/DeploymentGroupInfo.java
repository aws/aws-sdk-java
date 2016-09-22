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

/**
 * <p>
 * Information about a deployment group.
 * </p>
 */
public class DeploymentGroupInfo implements Serializable, Cloneable {

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
     * The Amazon EC2 tags on which to filter.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<EC2TagFilter> ec2TagFilters;
    /**
     * <p>
     * The on-premises instance tags on which to filter.
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
     * The Amazon EC2 tags on which to filter.
     * </p>
     * 
     * @return The Amazon EC2 tags on which to filter.
     */

    public java.util.List<EC2TagFilter> getEc2TagFilters() {
        if (ec2TagFilters == null) {
            ec2TagFilters = new com.amazonaws.internal.SdkInternalList<EC2TagFilter>();
        }
        return ec2TagFilters;
    }

    /**
     * <p>
     * The Amazon EC2 tags on which to filter.
     * </p>
     * 
     * @param ec2TagFilters
     *        The Amazon EC2 tags on which to filter.
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
     * The Amazon EC2 tags on which to filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setEc2TagFilters(java.util.Collection)} or {@link #withEc2TagFilters(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param ec2TagFilters
     *        The Amazon EC2 tags on which to filter.
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
     * The Amazon EC2 tags on which to filter.
     * </p>
     * 
     * @param ec2TagFilters
     *        The Amazon EC2 tags on which to filter.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentGroupInfo withEc2TagFilters(java.util.Collection<EC2TagFilter> ec2TagFilters) {
        setEc2TagFilters(ec2TagFilters);
        return this;
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter.
     * </p>
     * 
     * @return The on-premises instance tags on which to filter.
     */

    public java.util.List<TagFilter> getOnPremisesInstanceTagFilters() {
        if (onPremisesInstanceTagFilters == null) {
            onPremisesInstanceTagFilters = new com.amazonaws.internal.SdkInternalList<TagFilter>();
        }
        return onPremisesInstanceTagFilters;
    }

    /**
     * <p>
     * The on-premises instance tags on which to filter.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The on-premises instance tags on which to filter.
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
     * The on-premises instance tags on which to filter.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOnPremisesInstanceTagFilters(java.util.Collection)} or
     * {@link #withOnPremisesInstanceTagFilters(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The on-premises instance tags on which to filter.
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
     * The on-premises instance tags on which to filter.
     * </p>
     * 
     * @param onPremisesInstanceTagFilters
     *        The on-premises instance tags on which to filter.
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
        if (getDeploymentGroupId() != null)
            sb.append("DeploymentGroupId: " + getDeploymentGroupId() + ",");
        if (getDeploymentGroupName() != null)
            sb.append("DeploymentGroupName: " + getDeploymentGroupName() + ",");
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
        if (getTargetRevision() != null)
            sb.append("TargetRevision: " + getTargetRevision() + ",");
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
}
