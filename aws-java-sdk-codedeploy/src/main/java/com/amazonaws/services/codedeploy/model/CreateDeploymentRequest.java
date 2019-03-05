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
 * Represents the input of a CreateDeployment operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/CreateDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateDeploymentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * </p>
     */
    private String applicationName;
    /**
     * <p>
     * The name of the deployment group.
     * </p>
     */
    private String deploymentGroupName;
    /**
     * <p>
     * The type and location of the revision to deploy.
     * </p>
     */
    private RevisionLocation revision;
    /**
     * <p>
     * The name of a deployment configuration associated with the IAM user or AWS account.
     * </p>
     * <p>
     * If not specified, the value configured in the deployment group is used as the default. If the deployment group
     * does not have a deployment configuration associated with it, CodeDeployDefault.OneAtATime is used by default.
     * </p>
     */
    private String deploymentConfigName;
    /**
     * <p>
     * A comment about the deployment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event to an
     * instance fails, then the deployment continues to the next deployment lifecycle event. For example, if
     * ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the deployment
     * continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with ApplicationStop.
     * </p>
     * <p>
     * If false or not specified, then if a lifecycle event fails during a deployment to an instance, that deployment
     * fails. If deployment to that instance is part of an overall deployment and the number of healthy hosts is not
     * less than the minimum number of healthy hosts, then a deployment to the next instance is attempted.
     * </p>
     * <p>
     * During a deployment, the AWS CodeDeploy agent runs the scripts specified for ApplicationStop, BeforeBlockTraffic,
     * and AfterBlockTraffic in the AppSpec file from the previous successful deployment. (All other scripts are run
     * from the AppSpec file in the current deployment.) If one of these scripts contains an error and does not run
     * successfully, the deployment can fail.
     * </p>
     * <p>
     * If the cause of the failure is a script from the last successful deployment that will never run successfully,
     * create a new deployment and use <code>ignoreApplicationStopFailures</code> to specify that the ApplicationStop,
     * BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored.
     * </p>
     */
    private Boolean ignoreApplicationStopFailures;
    /**
     * <p>
     * Information about the instances that belong to the replacement environment in a blue/green deployment.
     * </p>
     */
    private TargetInstances targetInstances;
    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a deployment is created.
     * </p>
     */
    private AutoRollbackConfiguration autoRollbackConfiguration;
    /**
     * <p>
     * Indicates whether to deploy to all instances or only to instances that are not running the latest application
     * revision.
     * </p>
     */
    private Boolean updateOutdatedInstancesOnly;
    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't
     * part of the previous successful deployment.
     * </p>
     * <p>
     * The fileExistsBehavior parameter takes any of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISALLOW: The deployment fails. This is also the default behavior if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE: The version of the file from the application revision currently being deployed replaces the version
     * already on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.
     * </p>
     * </li>
     * </ul>
     */
    private String fileExistsBehavior;

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     */

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * </p>
     * 
     * @return The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     */

    public String getApplicationName() {
        return this.applicationName;
    }

    /**
     * <p>
     * The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * </p>
     * 
     * @param applicationName
     *        The name of an AWS CodeDeploy application associated with the IAM user or AWS account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withApplicationName(String applicationName) {
        setApplicationName(applicationName);
        return this;
    }

    /**
     * <p>
     * The name of the deployment group.
     * </p>
     * 
     * @param deploymentGroupName
     *        The name of the deployment group.
     */

    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }

    /**
     * <p>
     * The name of the deployment group.
     * </p>
     * 
     * @return The name of the deployment group.
     */

    public String getDeploymentGroupName() {
        return this.deploymentGroupName;
    }

    /**
     * <p>
     * The name of the deployment group.
     * </p>
     * 
     * @param deploymentGroupName
     *        The name of the deployment group.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withDeploymentGroupName(String deploymentGroupName) {
        setDeploymentGroupName(deploymentGroupName);
        return this;
    }

    /**
     * <p>
     * The type and location of the revision to deploy.
     * </p>
     * 
     * @param revision
     *        The type and location of the revision to deploy.
     */

    public void setRevision(RevisionLocation revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * The type and location of the revision to deploy.
     * </p>
     * 
     * @return The type and location of the revision to deploy.
     */

    public RevisionLocation getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * The type and location of the revision to deploy.
     * </p>
     * 
     * @param revision
     *        The type and location of the revision to deploy.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withRevision(RevisionLocation revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The name of a deployment configuration associated with the IAM user or AWS account.
     * </p>
     * <p>
     * If not specified, the value configured in the deployment group is used as the default. If the deployment group
     * does not have a deployment configuration associated with it, CodeDeployDefault.OneAtATime is used by default.
     * </p>
     * 
     * @param deploymentConfigName
     *        The name of a deployment configuration associated with the IAM user or AWS account.</p>
     *        <p>
     *        If not specified, the value configured in the deployment group is used as the default. If the deployment
     *        group does not have a deployment configuration associated with it, CodeDeployDefault.OneAtATime is used by
     *        default.
     */

    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }

    /**
     * <p>
     * The name of a deployment configuration associated with the IAM user or AWS account.
     * </p>
     * <p>
     * If not specified, the value configured in the deployment group is used as the default. If the deployment group
     * does not have a deployment configuration associated with it, CodeDeployDefault.OneAtATime is used by default.
     * </p>
     * 
     * @return The name of a deployment configuration associated with the IAM user or AWS account.</p>
     *         <p>
     *         If not specified, the value configured in the deployment group is used as the default. If the deployment
     *         group does not have a deployment configuration associated with it, CodeDeployDefault.OneAtATime is used
     *         by default.
     */

    public String getDeploymentConfigName() {
        return this.deploymentConfigName;
    }

    /**
     * <p>
     * The name of a deployment configuration associated with the IAM user or AWS account.
     * </p>
     * <p>
     * If not specified, the value configured in the deployment group is used as the default. If the deployment group
     * does not have a deployment configuration associated with it, CodeDeployDefault.OneAtATime is used by default.
     * </p>
     * 
     * @param deploymentConfigName
     *        The name of a deployment configuration associated with the IAM user or AWS account.</p>
     *        <p>
     *        If not specified, the value configured in the deployment group is used as the default. If the deployment
     *        group does not have a deployment configuration associated with it, CodeDeployDefault.OneAtATime is used by
     *        default.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withDeploymentConfigName(String deploymentConfigName) {
        setDeploymentConfigName(deploymentConfigName);
        return this;
    }

    /**
     * <p>
     * A comment about the deployment.
     * </p>
     * 
     * @param description
     *        A comment about the deployment.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A comment about the deployment.
     * </p>
     * 
     * @return A comment about the deployment.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A comment about the deployment.
     * </p>
     * 
     * @param description
     *        A comment about the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event to an
     * instance fails, then the deployment continues to the next deployment lifecycle event. For example, if
     * ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the deployment
     * continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with ApplicationStop.
     * </p>
     * <p>
     * If false or not specified, then if a lifecycle event fails during a deployment to an instance, that deployment
     * fails. If deployment to that instance is part of an overall deployment and the number of healthy hosts is not
     * less than the minimum number of healthy hosts, then a deployment to the next instance is attempted.
     * </p>
     * <p>
     * During a deployment, the AWS CodeDeploy agent runs the scripts specified for ApplicationStop, BeforeBlockTraffic,
     * and AfterBlockTraffic in the AppSpec file from the previous successful deployment. (All other scripts are run
     * from the AppSpec file in the current deployment.) If one of these scripts contains an error and does not run
     * successfully, the deployment can fail.
     * </p>
     * <p>
     * If the cause of the failure is a script from the last successful deployment that will never run successfully,
     * create a new deployment and use <code>ignoreApplicationStopFailures</code> to specify that the ApplicationStop,
     * BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored.
     * </p>
     * 
     * @param ignoreApplicationStopFailures
     *        If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event
     *        to an instance fails, then the deployment continues to the next deployment lifecycle event. For example,
     *        if ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the
     *        deployment continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with
     *        ApplicationStop. </p>
     *        <p>
     *        If false or not specified, then if a lifecycle event fails during a deployment to an instance, that
     *        deployment fails. If deployment to that instance is part of an overall deployment and the number of
     *        healthy hosts is not less than the minimum number of healthy hosts, then a deployment to the next instance
     *        is attempted.
     *        </p>
     *        <p>
     *        During a deployment, the AWS CodeDeploy agent runs the scripts specified for ApplicationStop,
     *        BeforeBlockTraffic, and AfterBlockTraffic in the AppSpec file from the previous successful deployment.
     *        (All other scripts are run from the AppSpec file in the current deployment.) If one of these scripts
     *        contains an error and does not run successfully, the deployment can fail.
     *        </p>
     *        <p>
     *        If the cause of the failure is a script from the last successful deployment that will never run
     *        successfully, create a new deployment and use <code>ignoreApplicationStopFailures</code> to specify that
     *        the ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored.
     */

    public void setIgnoreApplicationStopFailures(Boolean ignoreApplicationStopFailures) {
        this.ignoreApplicationStopFailures = ignoreApplicationStopFailures;
    }

    /**
     * <p>
     * If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event to an
     * instance fails, then the deployment continues to the next deployment lifecycle event. For example, if
     * ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the deployment
     * continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with ApplicationStop.
     * </p>
     * <p>
     * If false or not specified, then if a lifecycle event fails during a deployment to an instance, that deployment
     * fails. If deployment to that instance is part of an overall deployment and the number of healthy hosts is not
     * less than the minimum number of healthy hosts, then a deployment to the next instance is attempted.
     * </p>
     * <p>
     * During a deployment, the AWS CodeDeploy agent runs the scripts specified for ApplicationStop, BeforeBlockTraffic,
     * and AfterBlockTraffic in the AppSpec file from the previous successful deployment. (All other scripts are run
     * from the AppSpec file in the current deployment.) If one of these scripts contains an error and does not run
     * successfully, the deployment can fail.
     * </p>
     * <p>
     * If the cause of the failure is a script from the last successful deployment that will never run successfully,
     * create a new deployment and use <code>ignoreApplicationStopFailures</code> to specify that the ApplicationStop,
     * BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored.
     * </p>
     * 
     * @return If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event
     *         to an instance fails, then the deployment continues to the next deployment lifecycle event. For example,
     *         if ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the
     *         deployment continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with
     *         ApplicationStop. </p>
     *         <p>
     *         If false or not specified, then if a lifecycle event fails during a deployment to an instance, that
     *         deployment fails. If deployment to that instance is part of an overall deployment and the number of
     *         healthy hosts is not less than the minimum number of healthy hosts, then a deployment to the next
     *         instance is attempted.
     *         </p>
     *         <p>
     *         During a deployment, the AWS CodeDeploy agent runs the scripts specified for ApplicationStop,
     *         BeforeBlockTraffic, and AfterBlockTraffic in the AppSpec file from the previous successful deployment.
     *         (All other scripts are run from the AppSpec file in the current deployment.) If one of these scripts
     *         contains an error and does not run successfully, the deployment can fail.
     *         </p>
     *         <p>
     *         If the cause of the failure is a script from the last successful deployment that will never run
     *         successfully, create a new deployment and use <code>ignoreApplicationStopFailures</code> to specify that
     *         the ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored.
     */

    public Boolean getIgnoreApplicationStopFailures() {
        return this.ignoreApplicationStopFailures;
    }

    /**
     * <p>
     * If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event to an
     * instance fails, then the deployment continues to the next deployment lifecycle event. For example, if
     * ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the deployment
     * continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with ApplicationStop.
     * </p>
     * <p>
     * If false or not specified, then if a lifecycle event fails during a deployment to an instance, that deployment
     * fails. If deployment to that instance is part of an overall deployment and the number of healthy hosts is not
     * less than the minimum number of healthy hosts, then a deployment to the next instance is attempted.
     * </p>
     * <p>
     * During a deployment, the AWS CodeDeploy agent runs the scripts specified for ApplicationStop, BeforeBlockTraffic,
     * and AfterBlockTraffic in the AppSpec file from the previous successful deployment. (All other scripts are run
     * from the AppSpec file in the current deployment.) If one of these scripts contains an error and does not run
     * successfully, the deployment can fail.
     * </p>
     * <p>
     * If the cause of the failure is a script from the last successful deployment that will never run successfully,
     * create a new deployment and use <code>ignoreApplicationStopFailures</code> to specify that the ApplicationStop,
     * BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored.
     * </p>
     * 
     * @param ignoreApplicationStopFailures
     *        If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event
     *        to an instance fails, then the deployment continues to the next deployment lifecycle event. For example,
     *        if ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the
     *        deployment continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with
     *        ApplicationStop. </p>
     *        <p>
     *        If false or not specified, then if a lifecycle event fails during a deployment to an instance, that
     *        deployment fails. If deployment to that instance is part of an overall deployment and the number of
     *        healthy hosts is not less than the minimum number of healthy hosts, then a deployment to the next instance
     *        is attempted.
     *        </p>
     *        <p>
     *        During a deployment, the AWS CodeDeploy agent runs the scripts specified for ApplicationStop,
     *        BeforeBlockTraffic, and AfterBlockTraffic in the AppSpec file from the previous successful deployment.
     *        (All other scripts are run from the AppSpec file in the current deployment.) If one of these scripts
     *        contains an error and does not run successfully, the deployment can fail.
     *        </p>
     *        <p>
     *        If the cause of the failure is a script from the last successful deployment that will never run
     *        successfully, create a new deployment and use <code>ignoreApplicationStopFailures</code> to specify that
     *        the ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withIgnoreApplicationStopFailures(Boolean ignoreApplicationStopFailures) {
        setIgnoreApplicationStopFailures(ignoreApplicationStopFailures);
        return this;
    }

    /**
     * <p>
     * If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event to an
     * instance fails, then the deployment continues to the next deployment lifecycle event. For example, if
     * ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the deployment
     * continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with ApplicationStop.
     * </p>
     * <p>
     * If false or not specified, then if a lifecycle event fails during a deployment to an instance, that deployment
     * fails. If deployment to that instance is part of an overall deployment and the number of healthy hosts is not
     * less than the minimum number of healthy hosts, then a deployment to the next instance is attempted.
     * </p>
     * <p>
     * During a deployment, the AWS CodeDeploy agent runs the scripts specified for ApplicationStop, BeforeBlockTraffic,
     * and AfterBlockTraffic in the AppSpec file from the previous successful deployment. (All other scripts are run
     * from the AppSpec file in the current deployment.) If one of these scripts contains an error and does not run
     * successfully, the deployment can fail.
     * </p>
     * <p>
     * If the cause of the failure is a script from the last successful deployment that will never run successfully,
     * create a new deployment and use <code>ignoreApplicationStopFailures</code> to specify that the ApplicationStop,
     * BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored.
     * </p>
     * 
     * @return If true, then if an ApplicationStop, BeforeBlockTraffic, or AfterBlockTraffic deployment lifecycle event
     *         to an instance fails, then the deployment continues to the next deployment lifecycle event. For example,
     *         if ApplicationStop fails, the deployment continues with DownloadBundle. If BeforeBlockTraffic fails, the
     *         deployment continues with BlockTraffic. If AfterBlockTraffic fails, the deployment continues with
     *         ApplicationStop. </p>
     *         <p>
     *         If false or not specified, then if a lifecycle event fails during a deployment to an instance, that
     *         deployment fails. If deployment to that instance is part of an overall deployment and the number of
     *         healthy hosts is not less than the minimum number of healthy hosts, then a deployment to the next
     *         instance is attempted.
     *         </p>
     *         <p>
     *         During a deployment, the AWS CodeDeploy agent runs the scripts specified for ApplicationStop,
     *         BeforeBlockTraffic, and AfterBlockTraffic in the AppSpec file from the previous successful deployment.
     *         (All other scripts are run from the AppSpec file in the current deployment.) If one of these scripts
     *         contains an error and does not run successfully, the deployment can fail.
     *         </p>
     *         <p>
     *         If the cause of the failure is a script from the last successful deployment that will never run
     *         successfully, create a new deployment and use <code>ignoreApplicationStopFailures</code> to specify that
     *         the ApplicationStop, BeforeBlockTraffic, and AfterBlockTraffic failures should be ignored.
     */

    public Boolean isIgnoreApplicationStopFailures() {
        return this.ignoreApplicationStopFailures;
    }

    /**
     * <p>
     * Information about the instances that belong to the replacement environment in a blue/green deployment.
     * </p>
     * 
     * @param targetInstances
     *        Information about the instances that belong to the replacement environment in a blue/green deployment.
     */

    public void setTargetInstances(TargetInstances targetInstances) {
        this.targetInstances = targetInstances;
    }

    /**
     * <p>
     * Information about the instances that belong to the replacement environment in a blue/green deployment.
     * </p>
     * 
     * @return Information about the instances that belong to the replacement environment in a blue/green deployment.
     */

    public TargetInstances getTargetInstances() {
        return this.targetInstances;
    }

    /**
     * <p>
     * Information about the instances that belong to the replacement environment in a blue/green deployment.
     * </p>
     * 
     * @param targetInstances
     *        Information about the instances that belong to the replacement environment in a blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withTargetInstances(TargetInstances targetInstances) {
        setTargetInstances(targetInstances);
        return this;
    }

    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a deployment is created.
     * </p>
     * 
     * @param autoRollbackConfiguration
     *        Configuration information for an automatic rollback that is added when a deployment is created.
     */

    public void setAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
    }

    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a deployment is created.
     * </p>
     * 
     * @return Configuration information for an automatic rollback that is added when a deployment is created.
     */

    public AutoRollbackConfiguration getAutoRollbackConfiguration() {
        return this.autoRollbackConfiguration;
    }

    /**
     * <p>
     * Configuration information for an automatic rollback that is added when a deployment is created.
     * </p>
     * 
     * @param autoRollbackConfiguration
     *        Configuration information for an automatic rollback that is added when a deployment is created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        setAutoRollbackConfiguration(autoRollbackConfiguration);
        return this;
    }

    /**
     * <p>
     * Indicates whether to deploy to all instances or only to instances that are not running the latest application
     * revision.
     * </p>
     * 
     * @param updateOutdatedInstancesOnly
     *        Indicates whether to deploy to all instances or only to instances that are not running the latest
     *        application revision.
     */

    public void setUpdateOutdatedInstancesOnly(Boolean updateOutdatedInstancesOnly) {
        this.updateOutdatedInstancesOnly = updateOutdatedInstancesOnly;
    }

    /**
     * <p>
     * Indicates whether to deploy to all instances or only to instances that are not running the latest application
     * revision.
     * </p>
     * 
     * @return Indicates whether to deploy to all instances or only to instances that are not running the latest
     *         application revision.
     */

    public Boolean getUpdateOutdatedInstancesOnly() {
        return this.updateOutdatedInstancesOnly;
    }

    /**
     * <p>
     * Indicates whether to deploy to all instances or only to instances that are not running the latest application
     * revision.
     * </p>
     * 
     * @param updateOutdatedInstancesOnly
     *        Indicates whether to deploy to all instances or only to instances that are not running the latest
     *        application revision.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateDeploymentRequest withUpdateOutdatedInstancesOnly(Boolean updateOutdatedInstancesOnly) {
        setUpdateOutdatedInstancesOnly(updateOutdatedInstancesOnly);
        return this;
    }

    /**
     * <p>
     * Indicates whether to deploy to all instances or only to instances that are not running the latest application
     * revision.
     * </p>
     * 
     * @return Indicates whether to deploy to all instances or only to instances that are not running the latest
     *         application revision.
     */

    public Boolean isUpdateOutdatedInstancesOnly() {
        return this.updateOutdatedInstancesOnly;
    }

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't
     * part of the previous successful deployment.
     * </p>
     * <p>
     * The fileExistsBehavior parameter takes any of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISALLOW: The deployment fails. This is also the default behavior if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE: The version of the file from the application revision currently being deployed replaces the version
     * already on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fileExistsBehavior
     *        Information about how AWS CodeDeploy handles files that already exist in a deployment target location but
     *        weren't part of the previous successful deployment.</p>
     *        <p>
     *        The fileExistsBehavior parameter takes any of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DISALLOW: The deployment fails. This is also the default behavior if no option is specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OVERWRITE: The version of the file from the application revision currently being deployed replaces the
     *        version already on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.
     *        </p>
     *        </li>
     * @see FileExistsBehavior
     */

    public void setFileExistsBehavior(String fileExistsBehavior) {
        this.fileExistsBehavior = fileExistsBehavior;
    }

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't
     * part of the previous successful deployment.
     * </p>
     * <p>
     * The fileExistsBehavior parameter takes any of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISALLOW: The deployment fails. This is also the default behavior if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE: The version of the file from the application revision currently being deployed replaces the version
     * already on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Information about how AWS CodeDeploy handles files that already exist in a deployment target location but
     *         weren't part of the previous successful deployment.</p>
     *         <p>
     *         The fileExistsBehavior parameter takes any of the following values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         DISALLOW: The deployment fails. This is also the default behavior if no option is specified.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         OVERWRITE: The version of the file from the application revision currently being deployed replaces the
     *         version already on the instance.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.
     *         </p>
     *         </li>
     * @see FileExistsBehavior
     */

    public String getFileExistsBehavior() {
        return this.fileExistsBehavior;
    }

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't
     * part of the previous successful deployment.
     * </p>
     * <p>
     * The fileExistsBehavior parameter takes any of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISALLOW: The deployment fails. This is also the default behavior if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE: The version of the file from the application revision currently being deployed replaces the version
     * already on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fileExistsBehavior
     *        Information about how AWS CodeDeploy handles files that already exist in a deployment target location but
     *        weren't part of the previous successful deployment.</p>
     *        <p>
     *        The fileExistsBehavior parameter takes any of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DISALLOW: The deployment fails. This is also the default behavior if no option is specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OVERWRITE: The version of the file from the application revision currently being deployed replaces the
     *        version already on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileExistsBehavior
     */

    public CreateDeploymentRequest withFileExistsBehavior(String fileExistsBehavior) {
        setFileExistsBehavior(fileExistsBehavior);
        return this;
    }

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't
     * part of the previous successful deployment.
     * </p>
     * <p>
     * The fileExistsBehavior parameter takes any of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISALLOW: The deployment fails. This is also the default behavior if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE: The version of the file from the application revision currently being deployed replaces the version
     * already on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fileExistsBehavior
     *        Information about how AWS CodeDeploy handles files that already exist in a deployment target location but
     *        weren't part of the previous successful deployment.</p>
     *        <p>
     *        The fileExistsBehavior parameter takes any of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DISALLOW: The deployment fails. This is also the default behavior if no option is specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OVERWRITE: The version of the file from the application revision currently being deployed replaces the
     *        version already on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.
     *        </p>
     *        </li>
     * @see FileExistsBehavior
     */

    public void setFileExistsBehavior(FileExistsBehavior fileExistsBehavior) {
        withFileExistsBehavior(fileExistsBehavior);
    }

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't
     * part of the previous successful deployment.
     * </p>
     * <p>
     * The fileExistsBehavior parameter takes any of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * DISALLOW: The deployment fails. This is also the default behavior if no option is specified.
     * </p>
     * </li>
     * <li>
     * <p>
     * OVERWRITE: The version of the file from the application revision currently being deployed replaces the version
     * already on the instance.
     * </p>
     * </li>
     * <li>
     * <p>
     * RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param fileExistsBehavior
     *        Information about how AWS CodeDeploy handles files that already exist in a deployment target location but
     *        weren't part of the previous successful deployment.</p>
     *        <p>
     *        The fileExistsBehavior parameter takes any of the following values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        DISALLOW: The deployment fails. This is also the default behavior if no option is specified.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        OVERWRITE: The version of the file from the application revision currently being deployed replaces the
     *        version already on the instance.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RETAIN: The version of the file already on the instance is kept and used as part of the new deployment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see FileExistsBehavior
     */

    public CreateDeploymentRequest withFileExistsBehavior(FileExistsBehavior fileExistsBehavior) {
        this.fileExistsBehavior = fileExistsBehavior.toString();
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
        if (getDeploymentGroupName() != null)
            sb.append("DeploymentGroupName: ").append(getDeploymentGroupName()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getDeploymentConfigName() != null)
            sb.append("DeploymentConfigName: ").append(getDeploymentConfigName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getIgnoreApplicationStopFailures() != null)
            sb.append("IgnoreApplicationStopFailures: ").append(getIgnoreApplicationStopFailures()).append(",");
        if (getTargetInstances() != null)
            sb.append("TargetInstances: ").append(getTargetInstances()).append(",");
        if (getAutoRollbackConfiguration() != null)
            sb.append("AutoRollbackConfiguration: ").append(getAutoRollbackConfiguration()).append(",");
        if (getUpdateOutdatedInstancesOnly() != null)
            sb.append("UpdateOutdatedInstancesOnly: ").append(getUpdateOutdatedInstancesOnly()).append(",");
        if (getFileExistsBehavior() != null)
            sb.append("FileExistsBehavior: ").append(getFileExistsBehavior());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateDeploymentRequest == false)
            return false;
        CreateDeploymentRequest other = (CreateDeploymentRequest) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDeploymentGroupName() == null ^ this.getDeploymentGroupName() == null)
            return false;
        if (other.getDeploymentGroupName() != null && other.getDeploymentGroupName().equals(this.getDeploymentGroupName()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null)
            return false;
        if (other.getDeploymentConfigName() != null && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getIgnoreApplicationStopFailures() == null ^ this.getIgnoreApplicationStopFailures() == null)
            return false;
        if (other.getIgnoreApplicationStopFailures() != null
                && other.getIgnoreApplicationStopFailures().equals(this.getIgnoreApplicationStopFailures()) == false)
            return false;
        if (other.getTargetInstances() == null ^ this.getTargetInstances() == null)
            return false;
        if (other.getTargetInstances() != null && other.getTargetInstances().equals(this.getTargetInstances()) == false)
            return false;
        if (other.getAutoRollbackConfiguration() == null ^ this.getAutoRollbackConfiguration() == null)
            return false;
        if (other.getAutoRollbackConfiguration() != null && other.getAutoRollbackConfiguration().equals(this.getAutoRollbackConfiguration()) == false)
            return false;
        if (other.getUpdateOutdatedInstancesOnly() == null ^ this.getUpdateOutdatedInstancesOnly() == null)
            return false;
        if (other.getUpdateOutdatedInstancesOnly() != null && other.getUpdateOutdatedInstancesOnly().equals(this.getUpdateOutdatedInstancesOnly()) == false)
            return false;
        if (other.getFileExistsBehavior() == null ^ this.getFileExistsBehavior() == null)
            return false;
        if (other.getFileExistsBehavior() != null && other.getFileExistsBehavior().equals(this.getFileExistsBehavior()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentGroupName() == null) ? 0 : getDeploymentGroupName().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getIgnoreApplicationStopFailures() == null) ? 0 : getIgnoreApplicationStopFailures().hashCode());
        hashCode = prime * hashCode + ((getTargetInstances() == null) ? 0 : getTargetInstances().hashCode());
        hashCode = prime * hashCode + ((getAutoRollbackConfiguration() == null) ? 0 : getAutoRollbackConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUpdateOutdatedInstancesOnly() == null) ? 0 : getUpdateOutdatedInstancesOnly().hashCode());
        hashCode = prime * hashCode + ((getFileExistsBehavior() == null) ? 0 : getFileExistsBehavior().hashCode());
        return hashCode;
    }

    @Override
    public CreateDeploymentRequest clone() {
        return (CreateDeploymentRequest) super.clone();
    }

}
