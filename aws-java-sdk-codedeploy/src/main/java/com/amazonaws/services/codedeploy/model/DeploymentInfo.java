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
 * Information about a deployment.
 * </p>
 */
public class DeploymentInfo implements Serializable, Cloneable {

    /**
     * <p>
     * The application name.
     * </p>
     */
    private String applicationName;
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
     * The deployment ID.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * Information about the location of stored application artifacts and the service from which to retrieve them.
     * </p>
     */
    private RevisionLocation revision;
    /**
     * <p>
     * The current state of the deployment as a whole.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Information about any error associated with this deployment.
     * </p>
     */
    private ErrorInformation errorInformation;
    /**
     * <p>
     * A timestamp indicating when the deployment was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * A timestamp indicating when the deployment was deployed to the deployment group.
     * </p>
     * <p>
     * In some cases, the reported value of the start time may be later than the complete time. This is due to
     * differences in the clock settings of back-end servers that participate in the deployment process.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * A timestamp indicating when the deployment was complete.
     * </p>
     */
    private java.util.Date completeTime;
    /**
     * <p>
     * A summary of the deployment status of the instances in the deployment.
     * </p>
     */
    private DeploymentOverview deploymentOverview;
    /**
     * <p>
     * A comment about the deployment.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The means by which the deployment was created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * user: A user created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling: Auto Scaling created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * codeDeployRollback: A rollback process created the deployment.
     * </p>
     * </li>
     * </ul>
     */
    private String creator;
    /**
     * <p>
     * If true, then if the deployment causes the ApplicationStop deployment lifecycle event to an instance to fail, the
     * deployment to that instance will not be considered to have failed at that point and will continue on to the
     * BeforeInstall deployment lifecycle event.
     * </p>
     * <p>
     * If false or not specified, then if the deployment causes the ApplicationStop deployment lifecycle event to an
     * instance to fail, the deployment to that instance will stop, and the deployment to that instance will be
     * considered to have failed.
     * </p>
     */
    private Boolean ignoreApplicationStopFailures;
    /**
     * <p>
     * Information about the automatic rollback configuration associated with the deployment.
     * </p>
     */
    private AutoRollbackConfiguration autoRollbackConfiguration;
    /**
     * <p>
     * Indicates whether only instances that are not running the latest application revision are to be deployed to.
     * </p>
     */
    private Boolean updateOutdatedInstancesOnly;
    /**
     * <p>
     * Information about a deployment rollback.
     * </p>
     */
    private RollbackInfo rollbackInfo;

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

    public DeploymentInfo withApplicationName(String applicationName) {
        setApplicationName(applicationName);
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

    public DeploymentInfo withDeploymentGroupName(String deploymentGroupName) {
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

    public DeploymentInfo withDeploymentConfigName(String deploymentConfigName) {
        setDeploymentConfigName(deploymentConfigName);
        return this;
    }

    /**
     * <p>
     * The deployment ID.
     * </p>
     * 
     * @param deploymentId
     *        The deployment ID.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The deployment ID.
     * </p>
     * 
     * @return The deployment ID.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The deployment ID.
     * </p>
     * 
     * @param deploymentId
     *        The deployment ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * Information about the location of stored application artifacts and the service from which to retrieve them.
     * </p>
     * 
     * @param revision
     *        Information about the location of stored application artifacts and the service from which to retrieve
     *        them.
     */

    public void setRevision(RevisionLocation revision) {
        this.revision = revision;
    }

    /**
     * <p>
     * Information about the location of stored application artifacts and the service from which to retrieve them.
     * </p>
     * 
     * @return Information about the location of stored application artifacts and the service from which to retrieve
     *         them.
     */

    public RevisionLocation getRevision() {
        return this.revision;
    }

    /**
     * <p>
     * Information about the location of stored application artifacts and the service from which to retrieve them.
     * </p>
     * 
     * @param revision
     *        Information about the location of stored application artifacts and the service from which to retrieve
     *        them.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withRevision(RevisionLocation revision) {
        setRevision(revision);
        return this;
    }

    /**
     * <p>
     * The current state of the deployment as a whole.
     * </p>
     * 
     * @param status
     *        The current state of the deployment as a whole.
     * @see DeploymentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current state of the deployment as a whole.
     * </p>
     * 
     * @return The current state of the deployment as a whole.
     * @see DeploymentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current state of the deployment as a whole.
     * </p>
     * 
     * @param status
     *        The current state of the deployment as a whole.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public DeploymentInfo withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current state of the deployment as a whole.
     * </p>
     * 
     * @param status
     *        The current state of the deployment as a whole.
     * @see DeploymentStatus
     */

    public void setStatus(DeploymentStatus status) {
        this.status = status.toString();
    }

    /**
     * <p>
     * The current state of the deployment as a whole.
     * </p>
     * 
     * @param status
     *        The current state of the deployment as a whole.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public DeploymentInfo withStatus(DeploymentStatus status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Information about any error associated with this deployment.
     * </p>
     * 
     * @param errorInformation
     *        Information about any error associated with this deployment.
     */

    public void setErrorInformation(ErrorInformation errorInformation) {
        this.errorInformation = errorInformation;
    }

    /**
     * <p>
     * Information about any error associated with this deployment.
     * </p>
     * 
     * @return Information about any error associated with this deployment.
     */

    public ErrorInformation getErrorInformation() {
        return this.errorInformation;
    }

    /**
     * <p>
     * Information about any error associated with this deployment.
     * </p>
     * 
     * @param errorInformation
     *        Information about any error associated with this deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withErrorInformation(ErrorInformation errorInformation) {
        setErrorInformation(errorInformation);
        return this;
    }

    /**
     * <p>
     * A timestamp indicating when the deployment was created.
     * </p>
     * 
     * @param createTime
     *        A timestamp indicating when the deployment was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * A timestamp indicating when the deployment was created.
     * </p>
     * 
     * @return A timestamp indicating when the deployment was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * A timestamp indicating when the deployment was created.
     * </p>
     * 
     * @param createTime
     *        A timestamp indicating when the deployment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * A timestamp indicating when the deployment was deployed to the deployment group.
     * </p>
     * <p>
     * In some cases, the reported value of the start time may be later than the complete time. This is due to
     * differences in the clock settings of back-end servers that participate in the deployment process.
     * </p>
     * 
     * @param startTime
     *        A timestamp indicating when the deployment was deployed to the deployment group.</p>
     *        <p>
     *        In some cases, the reported value of the start time may be later than the complete time. This is due to
     *        differences in the clock settings of back-end servers that participate in the deployment process.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp indicating when the deployment was deployed to the deployment group.
     * </p>
     * <p>
     * In some cases, the reported value of the start time may be later than the complete time. This is due to
     * differences in the clock settings of back-end servers that participate in the deployment process.
     * </p>
     * 
     * @return A timestamp indicating when the deployment was deployed to the deployment group.</p>
     *         <p>
     *         In some cases, the reported value of the start time may be later than the complete time. This is due to
     *         differences in the clock settings of back-end servers that participate in the deployment process.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A timestamp indicating when the deployment was deployed to the deployment group.
     * </p>
     * <p>
     * In some cases, the reported value of the start time may be later than the complete time. This is due to
     * differences in the clock settings of back-end servers that participate in the deployment process.
     * </p>
     * 
     * @param startTime
     *        A timestamp indicating when the deployment was deployed to the deployment group.</p>
     *        <p>
     *        In some cases, the reported value of the start time may be later than the complete time. This is due to
     *        differences in the clock settings of back-end servers that participate in the deployment process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A timestamp indicating when the deployment was complete.
     * </p>
     * 
     * @param completeTime
     *        A timestamp indicating when the deployment was complete.
     */

    public void setCompleteTime(java.util.Date completeTime) {
        this.completeTime = completeTime;
    }

    /**
     * <p>
     * A timestamp indicating when the deployment was complete.
     * </p>
     * 
     * @return A timestamp indicating when the deployment was complete.
     */

    public java.util.Date getCompleteTime() {
        return this.completeTime;
    }

    /**
     * <p>
     * A timestamp indicating when the deployment was complete.
     * </p>
     * 
     * @param completeTime
     *        A timestamp indicating when the deployment was complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withCompleteTime(java.util.Date completeTime) {
        setCompleteTime(completeTime);
        return this;
    }

    /**
     * <p>
     * A summary of the deployment status of the instances in the deployment.
     * </p>
     * 
     * @param deploymentOverview
     *        A summary of the deployment status of the instances in the deployment.
     */

    public void setDeploymentOverview(DeploymentOverview deploymentOverview) {
        this.deploymentOverview = deploymentOverview;
    }

    /**
     * <p>
     * A summary of the deployment status of the instances in the deployment.
     * </p>
     * 
     * @return A summary of the deployment status of the instances in the deployment.
     */

    public DeploymentOverview getDeploymentOverview() {
        return this.deploymentOverview;
    }

    /**
     * <p>
     * A summary of the deployment status of the instances in the deployment.
     * </p>
     * 
     * @param deploymentOverview
     *        A summary of the deployment status of the instances in the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withDeploymentOverview(DeploymentOverview deploymentOverview) {
        setDeploymentOverview(deploymentOverview);
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

    public DeploymentInfo withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The means by which the deployment was created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * user: A user created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling: Auto Scaling created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * codeDeployRollback: A rollback process created the deployment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param creator
     *        The means by which the deployment was created:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        user: A user created the deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        autoscaling: Auto Scaling created the deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        codeDeployRollback: A rollback process created the deployment.
     *        </p>
     *        </li>
     * @see DeploymentCreator
     */

    public void setCreator(String creator) {
        this.creator = creator;
    }

    /**
     * <p>
     * The means by which the deployment was created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * user: A user created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling: Auto Scaling created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * codeDeployRollback: A rollback process created the deployment.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The means by which the deployment was created:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         user: A user created the deployment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         autoscaling: Auto Scaling created the deployment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         codeDeployRollback: A rollback process created the deployment.
     *         </p>
     *         </li>
     * @see DeploymentCreator
     */

    public String getCreator() {
        return this.creator;
    }

    /**
     * <p>
     * The means by which the deployment was created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * user: A user created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling: Auto Scaling created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * codeDeployRollback: A rollback process created the deployment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param creator
     *        The means by which the deployment was created:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        user: A user created the deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        autoscaling: Auto Scaling created the deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        codeDeployRollback: A rollback process created the deployment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentCreator
     */

    public DeploymentInfo withCreator(String creator) {
        setCreator(creator);
        return this;
    }

    /**
     * <p>
     * The means by which the deployment was created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * user: A user created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling: Auto Scaling created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * codeDeployRollback: A rollback process created the deployment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param creator
     *        The means by which the deployment was created:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        user: A user created the deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        autoscaling: Auto Scaling created the deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        codeDeployRollback: A rollback process created the deployment.
     *        </p>
     *        </li>
     * @see DeploymentCreator
     */

    public void setCreator(DeploymentCreator creator) {
        this.creator = creator.toString();
    }

    /**
     * <p>
     * The means by which the deployment was created:
     * </p>
     * <ul>
     * <li>
     * <p>
     * user: A user created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * autoscaling: Auto Scaling created the deployment.
     * </p>
     * </li>
     * <li>
     * <p>
     * codeDeployRollback: A rollback process created the deployment.
     * </p>
     * </li>
     * </ul>
     * 
     * @param creator
     *        The means by which the deployment was created:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        user: A user created the deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        autoscaling: Auto Scaling created the deployment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        codeDeployRollback: A rollback process created the deployment.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentCreator
     */

    public DeploymentInfo withCreator(DeploymentCreator creator) {
        setCreator(creator);
        return this;
    }

    /**
     * <p>
     * If true, then if the deployment causes the ApplicationStop deployment lifecycle event to an instance to fail, the
     * deployment to that instance will not be considered to have failed at that point and will continue on to the
     * BeforeInstall deployment lifecycle event.
     * </p>
     * <p>
     * If false or not specified, then if the deployment causes the ApplicationStop deployment lifecycle event to an
     * instance to fail, the deployment to that instance will stop, and the deployment to that instance will be
     * considered to have failed.
     * </p>
     * 
     * @param ignoreApplicationStopFailures
     *        If true, then if the deployment causes the ApplicationStop deployment lifecycle event to an instance to
     *        fail, the deployment to that instance will not be considered to have failed at that point and will
     *        continue on to the BeforeInstall deployment lifecycle event.</p>
     *        <p>
     *        If false or not specified, then if the deployment causes the ApplicationStop deployment lifecycle event to
     *        an instance to fail, the deployment to that instance will stop, and the deployment to that instance will
     *        be considered to have failed.
     */

    public void setIgnoreApplicationStopFailures(Boolean ignoreApplicationStopFailures) {
        this.ignoreApplicationStopFailures = ignoreApplicationStopFailures;
    }

    /**
     * <p>
     * If true, then if the deployment causes the ApplicationStop deployment lifecycle event to an instance to fail, the
     * deployment to that instance will not be considered to have failed at that point and will continue on to the
     * BeforeInstall deployment lifecycle event.
     * </p>
     * <p>
     * If false or not specified, then if the deployment causes the ApplicationStop deployment lifecycle event to an
     * instance to fail, the deployment to that instance will stop, and the deployment to that instance will be
     * considered to have failed.
     * </p>
     * 
     * @return If true, then if the deployment causes the ApplicationStop deployment lifecycle event to an instance to
     *         fail, the deployment to that instance will not be considered to have failed at that point and will
     *         continue on to the BeforeInstall deployment lifecycle event.</p>
     *         <p>
     *         If false or not specified, then if the deployment causes the ApplicationStop deployment lifecycle event
     *         to an instance to fail, the deployment to that instance will stop, and the deployment to that instance
     *         will be considered to have failed.
     */

    public Boolean getIgnoreApplicationStopFailures() {
        return this.ignoreApplicationStopFailures;
    }

    /**
     * <p>
     * If true, then if the deployment causes the ApplicationStop deployment lifecycle event to an instance to fail, the
     * deployment to that instance will not be considered to have failed at that point and will continue on to the
     * BeforeInstall deployment lifecycle event.
     * </p>
     * <p>
     * If false or not specified, then if the deployment causes the ApplicationStop deployment lifecycle event to an
     * instance to fail, the deployment to that instance will stop, and the deployment to that instance will be
     * considered to have failed.
     * </p>
     * 
     * @param ignoreApplicationStopFailures
     *        If true, then if the deployment causes the ApplicationStop deployment lifecycle event to an instance to
     *        fail, the deployment to that instance will not be considered to have failed at that point and will
     *        continue on to the BeforeInstall deployment lifecycle event.</p>
     *        <p>
     *        If false or not specified, then if the deployment causes the ApplicationStop deployment lifecycle event to
     *        an instance to fail, the deployment to that instance will stop, and the deployment to that instance will
     *        be considered to have failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withIgnoreApplicationStopFailures(Boolean ignoreApplicationStopFailures) {
        setIgnoreApplicationStopFailures(ignoreApplicationStopFailures);
        return this;
    }

    /**
     * <p>
     * If true, then if the deployment causes the ApplicationStop deployment lifecycle event to an instance to fail, the
     * deployment to that instance will not be considered to have failed at that point and will continue on to the
     * BeforeInstall deployment lifecycle event.
     * </p>
     * <p>
     * If false or not specified, then if the deployment causes the ApplicationStop deployment lifecycle event to an
     * instance to fail, the deployment to that instance will stop, and the deployment to that instance will be
     * considered to have failed.
     * </p>
     * 
     * @return If true, then if the deployment causes the ApplicationStop deployment lifecycle event to an instance to
     *         fail, the deployment to that instance will not be considered to have failed at that point and will
     *         continue on to the BeforeInstall deployment lifecycle event.</p>
     *         <p>
     *         If false or not specified, then if the deployment causes the ApplicationStop deployment lifecycle event
     *         to an instance to fail, the deployment to that instance will stop, and the deployment to that instance
     *         will be considered to have failed.
     */

    public Boolean isIgnoreApplicationStopFailures() {
        return this.ignoreApplicationStopFailures;
    }

    /**
     * <p>
     * Information about the automatic rollback configuration associated with the deployment.
     * </p>
     * 
     * @param autoRollbackConfiguration
     *        Information about the automatic rollback configuration associated with the deployment.
     */

    public void setAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        this.autoRollbackConfiguration = autoRollbackConfiguration;
    }

    /**
     * <p>
     * Information about the automatic rollback configuration associated with the deployment.
     * </p>
     * 
     * @return Information about the automatic rollback configuration associated with the deployment.
     */

    public AutoRollbackConfiguration getAutoRollbackConfiguration() {
        return this.autoRollbackConfiguration;
    }

    /**
     * <p>
     * Information about the automatic rollback configuration associated with the deployment.
     * </p>
     * 
     * @param autoRollbackConfiguration
     *        Information about the automatic rollback configuration associated with the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withAutoRollbackConfiguration(AutoRollbackConfiguration autoRollbackConfiguration) {
        setAutoRollbackConfiguration(autoRollbackConfiguration);
        return this;
    }

    /**
     * <p>
     * Indicates whether only instances that are not running the latest application revision are to be deployed to.
     * </p>
     * 
     * @param updateOutdatedInstancesOnly
     *        Indicates whether only instances that are not running the latest application revision are to be deployed
     *        to.
     */

    public void setUpdateOutdatedInstancesOnly(Boolean updateOutdatedInstancesOnly) {
        this.updateOutdatedInstancesOnly = updateOutdatedInstancesOnly;
    }

    /**
     * <p>
     * Indicates whether only instances that are not running the latest application revision are to be deployed to.
     * </p>
     * 
     * @return Indicates whether only instances that are not running the latest application revision are to be deployed
     *         to.
     */

    public Boolean getUpdateOutdatedInstancesOnly() {
        return this.updateOutdatedInstancesOnly;
    }

    /**
     * <p>
     * Indicates whether only instances that are not running the latest application revision are to be deployed to.
     * </p>
     * 
     * @param updateOutdatedInstancesOnly
     *        Indicates whether only instances that are not running the latest application revision are to be deployed
     *        to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withUpdateOutdatedInstancesOnly(Boolean updateOutdatedInstancesOnly) {
        setUpdateOutdatedInstancesOnly(updateOutdatedInstancesOnly);
        return this;
    }

    /**
     * <p>
     * Indicates whether only instances that are not running the latest application revision are to be deployed to.
     * </p>
     * 
     * @return Indicates whether only instances that are not running the latest application revision are to be deployed
     *         to.
     */

    public Boolean isUpdateOutdatedInstancesOnly() {
        return this.updateOutdatedInstancesOnly;
    }

    /**
     * <p>
     * Information about a deployment rollback.
     * </p>
     * 
     * @param rollbackInfo
     *        Information about a deployment rollback.
     */

    public void setRollbackInfo(RollbackInfo rollbackInfo) {
        this.rollbackInfo = rollbackInfo;
    }

    /**
     * <p>
     * Information about a deployment rollback.
     * </p>
     * 
     * @return Information about a deployment rollback.
     */

    public RollbackInfo getRollbackInfo() {
        return this.rollbackInfo;
    }

    /**
     * <p>
     * Information about a deployment rollback.
     * </p>
     * 
     * @param rollbackInfo
     *        Information about a deployment rollback.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withRollbackInfo(RollbackInfo rollbackInfo) {
        setRollbackInfo(rollbackInfo);
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
        if (getDeploymentGroupName() != null)
            sb.append("DeploymentGroupName: " + getDeploymentGroupName() + ",");
        if (getDeploymentConfigName() != null)
            sb.append("DeploymentConfigName: " + getDeploymentConfigName() + ",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getRevision() != null)
            sb.append("Revision: " + getRevision() + ",");
        if (getStatus() != null)
            sb.append("Status: " + getStatus() + ",");
        if (getErrorInformation() != null)
            sb.append("ErrorInformation: " + getErrorInformation() + ",");
        if (getCreateTime() != null)
            sb.append("CreateTime: " + getCreateTime() + ",");
        if (getStartTime() != null)
            sb.append("StartTime: " + getStartTime() + ",");
        if (getCompleteTime() != null)
            sb.append("CompleteTime: " + getCompleteTime() + ",");
        if (getDeploymentOverview() != null)
            sb.append("DeploymentOverview: " + getDeploymentOverview() + ",");
        if (getDescription() != null)
            sb.append("Description: " + getDescription() + ",");
        if (getCreator() != null)
            sb.append("Creator: " + getCreator() + ",");
        if (getIgnoreApplicationStopFailures() != null)
            sb.append("IgnoreApplicationStopFailures: " + getIgnoreApplicationStopFailures() + ",");
        if (getAutoRollbackConfiguration() != null)
            sb.append("AutoRollbackConfiguration: " + getAutoRollbackConfiguration() + ",");
        if (getUpdateOutdatedInstancesOnly() != null)
            sb.append("UpdateOutdatedInstancesOnly: " + getUpdateOutdatedInstancesOnly() + ",");
        if (getRollbackInfo() != null)
            sb.append("RollbackInfo: " + getRollbackInfo());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentInfo == false)
            return false;
        DeploymentInfo other = (DeploymentInfo) obj;
        if (other.getApplicationName() == null ^ this.getApplicationName() == null)
            return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false)
            return false;
        if (other.getDeploymentGroupName() == null ^ this.getDeploymentGroupName() == null)
            return false;
        if (other.getDeploymentGroupName() != null && other.getDeploymentGroupName().equals(this.getDeploymentGroupName()) == false)
            return false;
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null)
            return false;
        if (other.getDeploymentConfigName() != null && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getRevision() == null ^ this.getRevision() == null)
            return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getErrorInformation() == null ^ this.getErrorInformation() == null)
            return false;
        if (other.getErrorInformation() != null && other.getErrorInformation().equals(this.getErrorInformation()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getCompleteTime() == null ^ this.getCompleteTime() == null)
            return false;
        if (other.getCompleteTime() != null && other.getCompleteTime().equals(this.getCompleteTime()) == false)
            return false;
        if (other.getDeploymentOverview() == null ^ this.getDeploymentOverview() == null)
            return false;
        if (other.getDeploymentOverview() != null && other.getDeploymentOverview().equals(this.getDeploymentOverview()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreator() == null ^ this.getCreator() == null)
            return false;
        if (other.getCreator() != null && other.getCreator().equals(this.getCreator()) == false)
            return false;
        if (other.getIgnoreApplicationStopFailures() == null ^ this.getIgnoreApplicationStopFailures() == null)
            return false;
        if (other.getIgnoreApplicationStopFailures() != null
                && other.getIgnoreApplicationStopFailures().equals(this.getIgnoreApplicationStopFailures()) == false)
            return false;
        if (other.getAutoRollbackConfiguration() == null ^ this.getAutoRollbackConfiguration() == null)
            return false;
        if (other.getAutoRollbackConfiguration() != null && other.getAutoRollbackConfiguration().equals(this.getAutoRollbackConfiguration()) == false)
            return false;
        if (other.getUpdateOutdatedInstancesOnly() == null ^ this.getUpdateOutdatedInstancesOnly() == null)
            return false;
        if (other.getUpdateOutdatedInstancesOnly() != null && other.getUpdateOutdatedInstancesOnly().equals(this.getUpdateOutdatedInstancesOnly()) == false)
            return false;
        if (other.getRollbackInfo() == null ^ this.getRollbackInfo() == null)
            return false;
        if (other.getRollbackInfo() != null && other.getRollbackInfo().equals(this.getRollbackInfo()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getApplicationName() == null) ? 0 : getApplicationName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentGroupName() == null) ? 0 : getDeploymentGroupName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentConfigName() == null) ? 0 : getDeploymentConfigName().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getRevision() == null) ? 0 : getRevision().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getErrorInformation() == null) ? 0 : getErrorInformation().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getCompleteTime() == null) ? 0 : getCompleteTime().hashCode());
        hashCode = prime * hashCode + ((getDeploymentOverview() == null) ? 0 : getDeploymentOverview().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreator() == null) ? 0 : getCreator().hashCode());
        hashCode = prime * hashCode + ((getIgnoreApplicationStopFailures() == null) ? 0 : getIgnoreApplicationStopFailures().hashCode());
        hashCode = prime * hashCode + ((getAutoRollbackConfiguration() == null) ? 0 : getAutoRollbackConfiguration().hashCode());
        hashCode = prime * hashCode + ((getUpdateOutdatedInstancesOnly() == null) ? 0 : getUpdateOutdatedInstancesOnly().hashCode());
        hashCode = prime * hashCode + ((getRollbackInfo() == null) ? 0 : getRollbackInfo().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentInfo clone() {
        try {
            return (DeploymentInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
