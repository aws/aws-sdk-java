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
 * Information about a deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/DeploymentInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentInfo implements Serializable, Cloneable, StructuredPojo {

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
     * The unique ID of a deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * Information about the application revision that was deployed to the deployment group before the most recent
     * successful deployment.
     * </p>
     */
    private RevisionLocation previousRevision;
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
     * A timestamp that indicates when the deployment was created.
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * A timestamp that indicates when the deployment was deployed to the deployment group.
     * </p>
     * <p>
     * In some cases, the reported value of the start time might be later than the complete time. This is due to
     * differences in the clock settings of backend servers that participate in the deployment process.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * A timestamp that indicates when the deployment was complete.
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
     * autoscaling: Amazon EC2 Auto Scaling created the deployment.
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
     * Information about the type of deployment, either in-place or blue/green, you want to run and whether to route
     * deployment traffic behind a load balancer.
     * </p>
     */
    private DeploymentStyle deploymentStyle;
    /**
     * <p>
     * Information about the instances that belong to the replacement environment in a blue/green deployment.
     * </p>
     */
    private TargetInstances targetInstances;
    /**
     * <p>
     * Indicates whether the wait period set for the termination of instances in the original environment has started.
     * Status is 'false' if the KEEP_ALIVE option is specified. Otherwise, 'true' as soon as the termination wait period
     * starts.
     * </p>
     */
    private Boolean instanceTerminationWaitTimeStarted;
    /**
     * <p>
     * Information about blue/green deployment options for this deployment.
     * </p>
     */
    private BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration;
    /**
     * <p>
     * Information about the load balancer used in the deployment.
     * </p>
     */
    private LoadBalancerInfo loadBalancerInfo;
    /**
     * <p>
     * Provides information about the results of a deployment, such as whether instances in the original environment in
     * a blue/green deployment were not terminated.
     * </p>
     */
    private String additionalDeploymentStatusInfo;
    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't
     * part of the previous successful deployment.
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
     * Messages that contain information about the status of a deployment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> deploymentStatusMessages;
    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>).
     * </p>
     */
    private String computePlatform;

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
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @return The unique ID of a deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The unique ID of a deployment.
     * </p>
     * 
     * @param deploymentId
     *        The unique ID of a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * Information about the application revision that was deployed to the deployment group before the most recent
     * successful deployment.
     * </p>
     * 
     * @param previousRevision
     *        Information about the application revision that was deployed to the deployment group before the most
     *        recent successful deployment.
     */

    public void setPreviousRevision(RevisionLocation previousRevision) {
        this.previousRevision = previousRevision;
    }

    /**
     * <p>
     * Information about the application revision that was deployed to the deployment group before the most recent
     * successful deployment.
     * </p>
     * 
     * @return Information about the application revision that was deployed to the deployment group before the most
     *         recent successful deployment.
     */

    public RevisionLocation getPreviousRevision() {
        return this.previousRevision;
    }

    /**
     * <p>
     * Information about the application revision that was deployed to the deployment group before the most recent
     * successful deployment.
     * </p>
     * 
     * @param previousRevision
     *        Information about the application revision that was deployed to the deployment group before the most
     *        recent successful deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withPreviousRevision(RevisionLocation previousRevision) {
        setPreviousRevision(previousRevision);
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
        withStatus(status);
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
        this.status = status.toString();
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
     * A timestamp that indicates when the deployment was created.
     * </p>
     * 
     * @param createTime
     *        A timestamp that indicates when the deployment was created.
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was created.
     * </p>
     * 
     * @return A timestamp that indicates when the deployment was created.
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was created.
     * </p>
     * 
     * @param createTime
     *        A timestamp that indicates when the deployment was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was deployed to the deployment group.
     * </p>
     * <p>
     * In some cases, the reported value of the start time might be later than the complete time. This is due to
     * differences in the clock settings of backend servers that participate in the deployment process.
     * </p>
     * 
     * @param startTime
     *        A timestamp that indicates when the deployment was deployed to the deployment group.</p>
     *        <p>
     *        In some cases, the reported value of the start time might be later than the complete time. This is due to
     *        differences in the clock settings of backend servers that participate in the deployment process.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was deployed to the deployment group.
     * </p>
     * <p>
     * In some cases, the reported value of the start time might be later than the complete time. This is due to
     * differences in the clock settings of backend servers that participate in the deployment process.
     * </p>
     * 
     * @return A timestamp that indicates when the deployment was deployed to the deployment group.</p>
     *         <p>
     *         In some cases, the reported value of the start time might be later than the complete time. This is due to
     *         differences in the clock settings of backend servers that participate in the deployment process.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was deployed to the deployment group.
     * </p>
     * <p>
     * In some cases, the reported value of the start time might be later than the complete time. This is due to
     * differences in the clock settings of backend servers that participate in the deployment process.
     * </p>
     * 
     * @param startTime
     *        A timestamp that indicates when the deployment was deployed to the deployment group.</p>
     *        <p>
     *        In some cases, the reported value of the start time might be later than the complete time. This is due to
     *        differences in the clock settings of backend servers that participate in the deployment process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was complete.
     * </p>
     * 
     * @param completeTime
     *        A timestamp that indicates when the deployment was complete.
     */

    public void setCompleteTime(java.util.Date completeTime) {
        this.completeTime = completeTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was complete.
     * </p>
     * 
     * @return A timestamp that indicates when the deployment was complete.
     */

    public java.util.Date getCompleteTime() {
        return this.completeTime;
    }

    /**
     * <p>
     * A timestamp that indicates when the deployment was complete.
     * </p>
     * 
     * @param completeTime
     *        A timestamp that indicates when the deployment was complete.
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
     * autoscaling: Amazon EC2 Auto Scaling created the deployment.
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
     *        autoscaling: Amazon EC2 Auto Scaling created the deployment.
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
     * autoscaling: Amazon EC2 Auto Scaling created the deployment.
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
     *         autoscaling: Amazon EC2 Auto Scaling created the deployment.
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
     * autoscaling: Amazon EC2 Auto Scaling created the deployment.
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
     *        autoscaling: Amazon EC2 Auto Scaling created the deployment.
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
     * autoscaling: Amazon EC2 Auto Scaling created the deployment.
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
     *        autoscaling: Amazon EC2 Auto Scaling created the deployment.
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
        withCreator(creator);
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
     * autoscaling: Amazon EC2 Auto Scaling created the deployment.
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
     *        autoscaling: Amazon EC2 Auto Scaling created the deployment.
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
        this.creator = creator.toString();
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

    public DeploymentInfo withIgnoreApplicationStopFailures(Boolean ignoreApplicationStopFailures) {
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

    public DeploymentInfo withDeploymentStyle(DeploymentStyle deploymentStyle) {
        setDeploymentStyle(deploymentStyle);
        return this;
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

    public DeploymentInfo withTargetInstances(TargetInstances targetInstances) {
        setTargetInstances(targetInstances);
        return this;
    }

    /**
     * <p>
     * Indicates whether the wait period set for the termination of instances in the original environment has started.
     * Status is 'false' if the KEEP_ALIVE option is specified. Otherwise, 'true' as soon as the termination wait period
     * starts.
     * </p>
     * 
     * @param instanceTerminationWaitTimeStarted
     *        Indicates whether the wait period set for the termination of instances in the original environment has
     *        started. Status is 'false' if the KEEP_ALIVE option is specified. Otherwise, 'true' as soon as the
     *        termination wait period starts.
     */

    public void setInstanceTerminationWaitTimeStarted(Boolean instanceTerminationWaitTimeStarted) {
        this.instanceTerminationWaitTimeStarted = instanceTerminationWaitTimeStarted;
    }

    /**
     * <p>
     * Indicates whether the wait period set for the termination of instances in the original environment has started.
     * Status is 'false' if the KEEP_ALIVE option is specified. Otherwise, 'true' as soon as the termination wait period
     * starts.
     * </p>
     * 
     * @return Indicates whether the wait period set for the termination of instances in the original environment has
     *         started. Status is 'false' if the KEEP_ALIVE option is specified. Otherwise, 'true' as soon as the
     *         termination wait period starts.
     */

    public Boolean getInstanceTerminationWaitTimeStarted() {
        return this.instanceTerminationWaitTimeStarted;
    }

    /**
     * <p>
     * Indicates whether the wait period set for the termination of instances in the original environment has started.
     * Status is 'false' if the KEEP_ALIVE option is specified. Otherwise, 'true' as soon as the termination wait period
     * starts.
     * </p>
     * 
     * @param instanceTerminationWaitTimeStarted
     *        Indicates whether the wait period set for the termination of instances in the original environment has
     *        started. Status is 'false' if the KEEP_ALIVE option is specified. Otherwise, 'true' as soon as the
     *        termination wait period starts.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withInstanceTerminationWaitTimeStarted(Boolean instanceTerminationWaitTimeStarted) {
        setInstanceTerminationWaitTimeStarted(instanceTerminationWaitTimeStarted);
        return this;
    }

    /**
     * <p>
     * Indicates whether the wait period set for the termination of instances in the original environment has started.
     * Status is 'false' if the KEEP_ALIVE option is specified. Otherwise, 'true' as soon as the termination wait period
     * starts.
     * </p>
     * 
     * @return Indicates whether the wait period set for the termination of instances in the original environment has
     *         started. Status is 'false' if the KEEP_ALIVE option is specified. Otherwise, 'true' as soon as the
     *         termination wait period starts.
     */

    public Boolean isInstanceTerminationWaitTimeStarted() {
        return this.instanceTerminationWaitTimeStarted;
    }

    /**
     * <p>
     * Information about blue/green deployment options for this deployment.
     * </p>
     * 
     * @param blueGreenDeploymentConfiguration
     *        Information about blue/green deployment options for this deployment.
     */

    public void setBlueGreenDeploymentConfiguration(BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration) {
        this.blueGreenDeploymentConfiguration = blueGreenDeploymentConfiguration;
    }

    /**
     * <p>
     * Information about blue/green deployment options for this deployment.
     * </p>
     * 
     * @return Information about blue/green deployment options for this deployment.
     */

    public BlueGreenDeploymentConfiguration getBlueGreenDeploymentConfiguration() {
        return this.blueGreenDeploymentConfiguration;
    }

    /**
     * <p>
     * Information about blue/green deployment options for this deployment.
     * </p>
     * 
     * @param blueGreenDeploymentConfiguration
     *        Information about blue/green deployment options for this deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withBlueGreenDeploymentConfiguration(BlueGreenDeploymentConfiguration blueGreenDeploymentConfiguration) {
        setBlueGreenDeploymentConfiguration(blueGreenDeploymentConfiguration);
        return this;
    }

    /**
     * <p>
     * Information about the load balancer used in the deployment.
     * </p>
     * 
     * @param loadBalancerInfo
     *        Information about the load balancer used in the deployment.
     */

    public void setLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        this.loadBalancerInfo = loadBalancerInfo;
    }

    /**
     * <p>
     * Information about the load balancer used in the deployment.
     * </p>
     * 
     * @return Information about the load balancer used in the deployment.
     */

    public LoadBalancerInfo getLoadBalancerInfo() {
        return this.loadBalancerInfo;
    }

    /**
     * <p>
     * Information about the load balancer used in the deployment.
     * </p>
     * 
     * @param loadBalancerInfo
     *        Information about the load balancer used in the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withLoadBalancerInfo(LoadBalancerInfo loadBalancerInfo) {
        setLoadBalancerInfo(loadBalancerInfo);
        return this;
    }

    /**
     * <p>
     * Provides information about the results of a deployment, such as whether instances in the original environment in
     * a blue/green deployment were not terminated.
     * </p>
     * 
     * @param additionalDeploymentStatusInfo
     *        Provides information about the results of a deployment, such as whether instances in the original
     *        environment in a blue/green deployment were not terminated.
     */

    public void setAdditionalDeploymentStatusInfo(String additionalDeploymentStatusInfo) {
        this.additionalDeploymentStatusInfo = additionalDeploymentStatusInfo;
    }

    /**
     * <p>
     * Provides information about the results of a deployment, such as whether instances in the original environment in
     * a blue/green deployment were not terminated.
     * </p>
     * 
     * @return Provides information about the results of a deployment, such as whether instances in the original
     *         environment in a blue/green deployment were not terminated.
     */

    public String getAdditionalDeploymentStatusInfo() {
        return this.additionalDeploymentStatusInfo;
    }

    /**
     * <p>
     * Provides information about the results of a deployment, such as whether instances in the original environment in
     * a blue/green deployment were not terminated.
     * </p>
     * 
     * @param additionalDeploymentStatusInfo
     *        Provides information about the results of a deployment, such as whether instances in the original
     *        environment in a blue/green deployment were not terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withAdditionalDeploymentStatusInfo(String additionalDeploymentStatusInfo) {
        setAdditionalDeploymentStatusInfo(additionalDeploymentStatusInfo);
        return this;
    }

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't
     * part of the previous successful deployment.
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

    public DeploymentInfo withFileExistsBehavior(String fileExistsBehavior) {
        setFileExistsBehavior(fileExistsBehavior);
        return this;
    }

    /**
     * <p>
     * Information about how AWS CodeDeploy handles files that already exist in a deployment target location but weren't
     * part of the previous successful deployment.
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

    public DeploymentInfo withFileExistsBehavior(FileExistsBehavior fileExistsBehavior) {
        this.fileExistsBehavior = fileExistsBehavior.toString();
        return this;
    }

    /**
     * <p>
     * Messages that contain information about the status of a deployment.
     * </p>
     * 
     * @return Messages that contain information about the status of a deployment.
     */

    public java.util.List<String> getDeploymentStatusMessages() {
        if (deploymentStatusMessages == null) {
            deploymentStatusMessages = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return deploymentStatusMessages;
    }

    /**
     * <p>
     * Messages that contain information about the status of a deployment.
     * </p>
     * 
     * @param deploymentStatusMessages
     *        Messages that contain information about the status of a deployment.
     */

    public void setDeploymentStatusMessages(java.util.Collection<String> deploymentStatusMessages) {
        if (deploymentStatusMessages == null) {
            this.deploymentStatusMessages = null;
            return;
        }

        this.deploymentStatusMessages = new com.amazonaws.internal.SdkInternalList<String>(deploymentStatusMessages);
    }

    /**
     * <p>
     * Messages that contain information about the status of a deployment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDeploymentStatusMessages(java.util.Collection)} or
     * {@link #withDeploymentStatusMessages(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param deploymentStatusMessages
     *        Messages that contain information about the status of a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withDeploymentStatusMessages(String... deploymentStatusMessages) {
        if (this.deploymentStatusMessages == null) {
            setDeploymentStatusMessages(new com.amazonaws.internal.SdkInternalList<String>(deploymentStatusMessages.length));
        }
        for (String ele : deploymentStatusMessages) {
            this.deploymentStatusMessages.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Messages that contain information about the status of a deployment.
     * </p>
     * 
     * @param deploymentStatusMessages
     *        Messages that contain information about the status of a deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentInfo withDeploymentStatusMessages(java.util.Collection<String> deploymentStatusMessages) {
        setDeploymentStatusMessages(deploymentStatusMessages);
        return this;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>).
     * @see ComputePlatform
     */

    public void setComputePlatform(String computePlatform) {
        this.computePlatform = computePlatform;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @return The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>).
     * @see ComputePlatform
     */

    public String getComputePlatform() {
        return this.computePlatform;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputePlatform
     */

    public DeploymentInfo withComputePlatform(String computePlatform) {
        setComputePlatform(computePlatform);
        return this;
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>).
     * @see ComputePlatform
     */

    public void setComputePlatform(ComputePlatform computePlatform) {
        withComputePlatform(computePlatform);
    }

    /**
     * <p>
     * The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>).
     * </p>
     * 
     * @param computePlatform
     *        The destination platform type for the deployment (<code>Lambda</code> or <code>Server</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ComputePlatform
     */

    public DeploymentInfo withComputePlatform(ComputePlatform computePlatform) {
        this.computePlatform = computePlatform.toString();
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
        if (getDeploymentConfigName() != null)
            sb.append("DeploymentConfigName: ").append(getDeploymentConfigName()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getPreviousRevision() != null)
            sb.append("PreviousRevision: ").append(getPreviousRevision()).append(",");
        if (getRevision() != null)
            sb.append("Revision: ").append(getRevision()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getErrorInformation() != null)
            sb.append("ErrorInformation: ").append(getErrorInformation()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getCompleteTime() != null)
            sb.append("CompleteTime: ").append(getCompleteTime()).append(",");
        if (getDeploymentOverview() != null)
            sb.append("DeploymentOverview: ").append(getDeploymentOverview()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreator() != null)
            sb.append("Creator: ").append(getCreator()).append(",");
        if (getIgnoreApplicationStopFailures() != null)
            sb.append("IgnoreApplicationStopFailures: ").append(getIgnoreApplicationStopFailures()).append(",");
        if (getAutoRollbackConfiguration() != null)
            sb.append("AutoRollbackConfiguration: ").append(getAutoRollbackConfiguration()).append(",");
        if (getUpdateOutdatedInstancesOnly() != null)
            sb.append("UpdateOutdatedInstancesOnly: ").append(getUpdateOutdatedInstancesOnly()).append(",");
        if (getRollbackInfo() != null)
            sb.append("RollbackInfo: ").append(getRollbackInfo()).append(",");
        if (getDeploymentStyle() != null)
            sb.append("DeploymentStyle: ").append(getDeploymentStyle()).append(",");
        if (getTargetInstances() != null)
            sb.append("TargetInstances: ").append(getTargetInstances()).append(",");
        if (getInstanceTerminationWaitTimeStarted() != null)
            sb.append("InstanceTerminationWaitTimeStarted: ").append(getInstanceTerminationWaitTimeStarted()).append(",");
        if (getBlueGreenDeploymentConfiguration() != null)
            sb.append("BlueGreenDeploymentConfiguration: ").append(getBlueGreenDeploymentConfiguration()).append(",");
        if (getLoadBalancerInfo() != null)
            sb.append("LoadBalancerInfo: ").append(getLoadBalancerInfo()).append(",");
        if (getAdditionalDeploymentStatusInfo() != null)
            sb.append("AdditionalDeploymentStatusInfo: ").append(getAdditionalDeploymentStatusInfo()).append(",");
        if (getFileExistsBehavior() != null)
            sb.append("FileExistsBehavior: ").append(getFileExistsBehavior()).append(",");
        if (getDeploymentStatusMessages() != null)
            sb.append("DeploymentStatusMessages: ").append(getDeploymentStatusMessages()).append(",");
        if (getComputePlatform() != null)
            sb.append("ComputePlatform: ").append(getComputePlatform());
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
        if (other.getPreviousRevision() == null ^ this.getPreviousRevision() == null)
            return false;
        if (other.getPreviousRevision() != null && other.getPreviousRevision().equals(this.getPreviousRevision()) == false)
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
        if (other.getDeploymentStyle() == null ^ this.getDeploymentStyle() == null)
            return false;
        if (other.getDeploymentStyle() != null && other.getDeploymentStyle().equals(this.getDeploymentStyle()) == false)
            return false;
        if (other.getTargetInstances() == null ^ this.getTargetInstances() == null)
            return false;
        if (other.getTargetInstances() != null && other.getTargetInstances().equals(this.getTargetInstances()) == false)
            return false;
        if (other.getInstanceTerminationWaitTimeStarted() == null ^ this.getInstanceTerminationWaitTimeStarted() == null)
            return false;
        if (other.getInstanceTerminationWaitTimeStarted() != null
                && other.getInstanceTerminationWaitTimeStarted().equals(this.getInstanceTerminationWaitTimeStarted()) == false)
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
        if (other.getAdditionalDeploymentStatusInfo() == null ^ this.getAdditionalDeploymentStatusInfo() == null)
            return false;
        if (other.getAdditionalDeploymentStatusInfo() != null
                && other.getAdditionalDeploymentStatusInfo().equals(this.getAdditionalDeploymentStatusInfo()) == false)
            return false;
        if (other.getFileExistsBehavior() == null ^ this.getFileExistsBehavior() == null)
            return false;
        if (other.getFileExistsBehavior() != null && other.getFileExistsBehavior().equals(this.getFileExistsBehavior()) == false)
            return false;
        if (other.getDeploymentStatusMessages() == null ^ this.getDeploymentStatusMessages() == null)
            return false;
        if (other.getDeploymentStatusMessages() != null && other.getDeploymentStatusMessages().equals(this.getDeploymentStatusMessages()) == false)
            return false;
        if (other.getComputePlatform() == null ^ this.getComputePlatform() == null)
            return false;
        if (other.getComputePlatform() != null && other.getComputePlatform().equals(this.getComputePlatform()) == false)
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
        hashCode = prime * hashCode + ((getPreviousRevision() == null) ? 0 : getPreviousRevision().hashCode());
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
        hashCode = prime * hashCode + ((getDeploymentStyle() == null) ? 0 : getDeploymentStyle().hashCode());
        hashCode = prime * hashCode + ((getTargetInstances() == null) ? 0 : getTargetInstances().hashCode());
        hashCode = prime * hashCode + ((getInstanceTerminationWaitTimeStarted() == null) ? 0 : getInstanceTerminationWaitTimeStarted().hashCode());
        hashCode = prime * hashCode + ((getBlueGreenDeploymentConfiguration() == null) ? 0 : getBlueGreenDeploymentConfiguration().hashCode());
        hashCode = prime * hashCode + ((getLoadBalancerInfo() == null) ? 0 : getLoadBalancerInfo().hashCode());
        hashCode = prime * hashCode + ((getAdditionalDeploymentStatusInfo() == null) ? 0 : getAdditionalDeploymentStatusInfo().hashCode());
        hashCode = prime * hashCode + ((getFileExistsBehavior() == null) ? 0 : getFileExistsBehavior().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStatusMessages() == null) ? 0 : getDeploymentStatusMessages().hashCode());
        hashCode = prime * hashCode + ((getComputePlatform() == null) ? 0 : getComputePlatform().hashCode());
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

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.DeploymentInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
