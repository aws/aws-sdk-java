/*
 * Copyright 2010-2014 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;

/**
 * <p>
 * Information about a deployment.
 * </p>
 */
public class DeploymentInfo implements Serializable {

    /**
     * The application name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String applicationName;

    /**
     * The deployment group name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentGroupName;

    /**
     * The deployment configuration name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     */
    private String deploymentConfigName;

    /**
     * The deployment ID.
     */
    private String deploymentId;

    /**
     * Information about the location of application artifacts that are
     * stored and the service to retrieve them from.
     */
    private RevisionLocation revision;

    /**
     * The current state of the deployment as a whole.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Succeeded, Failed, Stopped
     */
    private String status;

    /**
     * Information about any error associated with this deployment.
     */
    private ErrorInformation errorInformation;

    /**
     * A timestamp indicating when the deployment was created.
     */
    private java.util.Date createTime;

    /**
     * A timestamp indicating when the deployment began deploying to the
     * deployment group. <p>Note that in some cases, the reported value of
     * the start time may be later than the complete time. This is due to
     * differences in the clock settings of various back-end servers that
     * participate in the overall deployment process.
     */
    private java.util.Date startTime;

    /**
     * A timestamp indicating when the deployment was completed.
     */
    private java.util.Date completeTime;

    /**
     * A summary of the deployment status of the instances in the deployment.
     */
    private DeploymentOverview deploymentOverview;

    /**
     * A comment about the deployment.
     */
    private String description;

    /**
     * How the deployment was created: <ul> <li>user: A user created the
     * deployment.</li> <li>autoscaling: Auto Scaling created the
     * deployment.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, autoscaling
     */
    private String creator;

    /**
     * If true, then if the deployment causes the ApplicationStop deployment
     * lifecycle event to fail to a specific instance, the deployment will
     * not be considered to have failed to that instance at that point and
     * will continue on to the BeforeInstall deployment lifecycle event.
     * <p>If false or not specified, then if the deployment causes the
     * ApplicationStop deployment lifecycle event to fail to a specific
     * instance, the deployment will stop to that instance, and the
     * deployment to that instance will be considered to have failed.
     */
    private Boolean ignoreApplicationStopFailures;

    /**
     * The application name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The application name.
     */
    public String getApplicationName() {
        return applicationName;
    }
    
    /**
     * The application name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The application name.
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }
    
    /**
     * The application name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param applicationName The application name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentInfo withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * The deployment group name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The deployment group name.
     */
    public String getDeploymentGroupName() {
        return deploymentGroupName;
    }
    
    /**
     * The deployment group name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName The deployment group name.
     */
    public void setDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
    }
    
    /**
     * The deployment group name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentGroupName The deployment group name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentInfo withDeploymentGroupName(String deploymentGroupName) {
        this.deploymentGroupName = deploymentGroupName;
        return this;
    }

    /**
     * The deployment configuration name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @return The deployment configuration name.
     */
    public String getDeploymentConfigName() {
        return deploymentConfigName;
    }
    
    /**
     * The deployment configuration name.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName The deployment configuration name.
     */
    public void setDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
    }
    
    /**
     * The deployment configuration name.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 100<br/>
     *
     * @param deploymentConfigName The deployment configuration name.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentInfo withDeploymentConfigName(String deploymentConfigName) {
        this.deploymentConfigName = deploymentConfigName;
        return this;
    }

    /**
     * The deployment ID.
     *
     * @return The deployment ID.
     */
    public String getDeploymentId() {
        return deploymentId;
    }
    
    /**
     * The deployment ID.
     *
     * @param deploymentId The deployment ID.
     */
    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }
    
    /**
     * The deployment ID.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentId The deployment ID.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentInfo withDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
        return this;
    }

    /**
     * Information about the location of application artifacts that are
     * stored and the service to retrieve them from.
     *
     * @return Information about the location of application artifacts that are
     *         stored and the service to retrieve them from.
     */
    public RevisionLocation getRevision() {
        return revision;
    }
    
    /**
     * Information about the location of application artifacts that are
     * stored and the service to retrieve them from.
     *
     * @param revision Information about the location of application artifacts that are
     *         stored and the service to retrieve them from.
     */
    public void setRevision(RevisionLocation revision) {
        this.revision = revision;
    }
    
    /**
     * Information about the location of application artifacts that are
     * stored and the service to retrieve them from.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param revision Information about the location of application artifacts that are
     *         stored and the service to retrieve them from.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentInfo withRevision(RevisionLocation revision) {
        this.revision = revision;
        return this;
    }

    /**
     * The current state of the deployment as a whole.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Succeeded, Failed, Stopped
     *
     * @return The current state of the deployment as a whole.
     *
     * @see DeploymentStatus
     */
    public String getStatus() {
        return status;
    }
    
    /**
     * The current state of the deployment as a whole.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Succeeded, Failed, Stopped
     *
     * @param status The current state of the deployment as a whole.
     *
     * @see DeploymentStatus
     */
    public void setStatus(String status) {
        this.status = status;
    }
    
    /**
     * The current state of the deployment as a whole.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Succeeded, Failed, Stopped
     *
     * @param status The current state of the deployment as a whole.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DeploymentStatus
     */
    public DeploymentInfo withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * The current state of the deployment as a whole.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Succeeded, Failed, Stopped
     *
     * @param status The current state of the deployment as a whole.
     *
     * @see DeploymentStatus
     */
    public void setStatus(DeploymentStatus status) {
        this.status = status.toString();
    }
    
    /**
     * The current state of the deployment as a whole.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>Created, Queued, InProgress, Succeeded, Failed, Stopped
     *
     * @param status The current state of the deployment as a whole.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DeploymentStatus
     */
    public DeploymentInfo withStatus(DeploymentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * Information about any error associated with this deployment.
     *
     * @return Information about any error associated with this deployment.
     */
    public ErrorInformation getErrorInformation() {
        return errorInformation;
    }
    
    /**
     * Information about any error associated with this deployment.
     *
     * @param errorInformation Information about any error associated with this deployment.
     */
    public void setErrorInformation(ErrorInformation errorInformation) {
        this.errorInformation = errorInformation;
    }
    
    /**
     * Information about any error associated with this deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errorInformation Information about any error associated with this deployment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentInfo withErrorInformation(ErrorInformation errorInformation) {
        this.errorInformation = errorInformation;
        return this;
    }

    /**
     * A timestamp indicating when the deployment was created.
     *
     * @return A timestamp indicating when the deployment was created.
     */
    public java.util.Date getCreateTime() {
        return createTime;
    }
    
    /**
     * A timestamp indicating when the deployment was created.
     *
     * @param createTime A timestamp indicating when the deployment was created.
     */
    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }
    
    /**
     * A timestamp indicating when the deployment was created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param createTime A timestamp indicating when the deployment was created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentInfo withCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * A timestamp indicating when the deployment began deploying to the
     * deployment group. <p>Note that in some cases, the reported value of
     * the start time may be later than the complete time. This is due to
     * differences in the clock settings of various back-end servers that
     * participate in the overall deployment process.
     *
     * @return A timestamp indicating when the deployment began deploying to the
     *         deployment group. <p>Note that in some cases, the reported value of
     *         the start time may be later than the complete time. This is due to
     *         differences in the clock settings of various back-end servers that
     *         participate in the overall deployment process.
     */
    public java.util.Date getStartTime() {
        return startTime;
    }
    
    /**
     * A timestamp indicating when the deployment began deploying to the
     * deployment group. <p>Note that in some cases, the reported value of
     * the start time may be later than the complete time. This is due to
     * differences in the clock settings of various back-end servers that
     * participate in the overall deployment process.
     *
     * @param startTime A timestamp indicating when the deployment began deploying to the
     *         deployment group. <p>Note that in some cases, the reported value of
     *         the start time may be later than the complete time. This is due to
     *         differences in the clock settings of various back-end servers that
     *         participate in the overall deployment process.
     */
    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }
    
    /**
     * A timestamp indicating when the deployment began deploying to the
     * deployment group. <p>Note that in some cases, the reported value of
     * the start time may be later than the complete time. This is due to
     * differences in the clock settings of various back-end servers that
     * participate in the overall deployment process.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param startTime A timestamp indicating when the deployment began deploying to the
     *         deployment group. <p>Note that in some cases, the reported value of
     *         the start time may be later than the complete time. This is due to
     *         differences in the clock settings of various back-end servers that
     *         participate in the overall deployment process.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentInfo withStartTime(java.util.Date startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * A timestamp indicating when the deployment was completed.
     *
     * @return A timestamp indicating when the deployment was completed.
     */
    public java.util.Date getCompleteTime() {
        return completeTime;
    }
    
    /**
     * A timestamp indicating when the deployment was completed.
     *
     * @param completeTime A timestamp indicating when the deployment was completed.
     */
    public void setCompleteTime(java.util.Date completeTime) {
        this.completeTime = completeTime;
    }
    
    /**
     * A timestamp indicating when the deployment was completed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param completeTime A timestamp indicating when the deployment was completed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentInfo withCompleteTime(java.util.Date completeTime) {
        this.completeTime = completeTime;
        return this;
    }

    /**
     * A summary of the deployment status of the instances in the deployment.
     *
     * @return A summary of the deployment status of the instances in the deployment.
     */
    public DeploymentOverview getDeploymentOverview() {
        return deploymentOverview;
    }
    
    /**
     * A summary of the deployment status of the instances in the deployment.
     *
     * @param deploymentOverview A summary of the deployment status of the instances in the deployment.
     */
    public void setDeploymentOverview(DeploymentOverview deploymentOverview) {
        this.deploymentOverview = deploymentOverview;
    }
    
    /**
     * A summary of the deployment status of the instances in the deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param deploymentOverview A summary of the deployment status of the instances in the deployment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentInfo withDeploymentOverview(DeploymentOverview deploymentOverview) {
        this.deploymentOverview = deploymentOverview;
        return this;
    }

    /**
     * A comment about the deployment.
     *
     * @return A comment about the deployment.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * A comment about the deployment.
     *
     * @param description A comment about the deployment.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * A comment about the deployment.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param description A comment about the deployment.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * How the deployment was created: <ul> <li>user: A user created the
     * deployment.</li> <li>autoscaling: Auto Scaling created the
     * deployment.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, autoscaling
     *
     * @return How the deployment was created: <ul> <li>user: A user created the
     *         deployment.</li> <li>autoscaling: Auto Scaling created the
     *         deployment.</li> </ul>
     *
     * @see DeploymentCreator
     */
    public String getCreator() {
        return creator;
    }
    
    /**
     * How the deployment was created: <ul> <li>user: A user created the
     * deployment.</li> <li>autoscaling: Auto Scaling created the
     * deployment.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, autoscaling
     *
     * @param creator How the deployment was created: <ul> <li>user: A user created the
     *         deployment.</li> <li>autoscaling: Auto Scaling created the
     *         deployment.</li> </ul>
     *
     * @see DeploymentCreator
     */
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    /**
     * How the deployment was created: <ul> <li>user: A user created the
     * deployment.</li> <li>autoscaling: Auto Scaling created the
     * deployment.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, autoscaling
     *
     * @param creator How the deployment was created: <ul> <li>user: A user created the
     *         deployment.</li> <li>autoscaling: Auto Scaling created the
     *         deployment.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DeploymentCreator
     */
    public DeploymentInfo withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * How the deployment was created: <ul> <li>user: A user created the
     * deployment.</li> <li>autoscaling: Auto Scaling created the
     * deployment.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, autoscaling
     *
     * @param creator How the deployment was created: <ul> <li>user: A user created the
     *         deployment.</li> <li>autoscaling: Auto Scaling created the
     *         deployment.</li> </ul>
     *
     * @see DeploymentCreator
     */
    public void setCreator(DeploymentCreator creator) {
        this.creator = creator.toString();
    }
    
    /**
     * How the deployment was created: <ul> <li>user: A user created the
     * deployment.</li> <li>autoscaling: Auto Scaling created the
     * deployment.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>user, autoscaling
     *
     * @param creator How the deployment was created: <ul> <li>user: A user created the
     *         deployment.</li> <li>autoscaling: Auto Scaling created the
     *         deployment.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see DeploymentCreator
     */
    public DeploymentInfo withCreator(DeploymentCreator creator) {
        this.creator = creator.toString();
        return this;
    }

    /**
     * If true, then if the deployment causes the ApplicationStop deployment
     * lifecycle event to fail to a specific instance, the deployment will
     * not be considered to have failed to that instance at that point and
     * will continue on to the BeforeInstall deployment lifecycle event.
     * <p>If false or not specified, then if the deployment causes the
     * ApplicationStop deployment lifecycle event to fail to a specific
     * instance, the deployment will stop to that instance, and the
     * deployment to that instance will be considered to have failed.
     *
     * @return If true, then if the deployment causes the ApplicationStop deployment
     *         lifecycle event to fail to a specific instance, the deployment will
     *         not be considered to have failed to that instance at that point and
     *         will continue on to the BeforeInstall deployment lifecycle event.
     *         <p>If false or not specified, then if the deployment causes the
     *         ApplicationStop deployment lifecycle event to fail to a specific
     *         instance, the deployment will stop to that instance, and the
     *         deployment to that instance will be considered to have failed.
     */
    public Boolean isIgnoreApplicationStopFailures() {
        return ignoreApplicationStopFailures;
    }
    
    /**
     * If true, then if the deployment causes the ApplicationStop deployment
     * lifecycle event to fail to a specific instance, the deployment will
     * not be considered to have failed to that instance at that point and
     * will continue on to the BeforeInstall deployment lifecycle event.
     * <p>If false or not specified, then if the deployment causes the
     * ApplicationStop deployment lifecycle event to fail to a specific
     * instance, the deployment will stop to that instance, and the
     * deployment to that instance will be considered to have failed.
     *
     * @param ignoreApplicationStopFailures If true, then if the deployment causes the ApplicationStop deployment
     *         lifecycle event to fail to a specific instance, the deployment will
     *         not be considered to have failed to that instance at that point and
     *         will continue on to the BeforeInstall deployment lifecycle event.
     *         <p>If false or not specified, then if the deployment causes the
     *         ApplicationStop deployment lifecycle event to fail to a specific
     *         instance, the deployment will stop to that instance, and the
     *         deployment to that instance will be considered to have failed.
     */
    public void setIgnoreApplicationStopFailures(Boolean ignoreApplicationStopFailures) {
        this.ignoreApplicationStopFailures = ignoreApplicationStopFailures;
    }
    
    /**
     * If true, then if the deployment causes the ApplicationStop deployment
     * lifecycle event to fail to a specific instance, the deployment will
     * not be considered to have failed to that instance at that point and
     * will continue on to the BeforeInstall deployment lifecycle event.
     * <p>If false or not specified, then if the deployment causes the
     * ApplicationStop deployment lifecycle event to fail to a specific
     * instance, the deployment will stop to that instance, and the
     * deployment to that instance will be considered to have failed.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param ignoreApplicationStopFailures If true, then if the deployment causes the ApplicationStop deployment
     *         lifecycle event to fail to a specific instance, the deployment will
     *         not be considered to have failed to that instance at that point and
     *         will continue on to the BeforeInstall deployment lifecycle event.
     *         <p>If false or not specified, then if the deployment causes the
     *         ApplicationStop deployment lifecycle event to fail to a specific
     *         instance, the deployment will stop to that instance, and the
     *         deployment to that instance will be considered to have failed.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public DeploymentInfo withIgnoreApplicationStopFailures(Boolean ignoreApplicationStopFailures) {
        this.ignoreApplicationStopFailures = ignoreApplicationStopFailures;
        return this;
    }

    /**
     * If true, then if the deployment causes the ApplicationStop deployment
     * lifecycle event to fail to a specific instance, the deployment will
     * not be considered to have failed to that instance at that point and
     * will continue on to the BeforeInstall deployment lifecycle event.
     * <p>If false or not specified, then if the deployment causes the
     * ApplicationStop deployment lifecycle event to fail to a specific
     * instance, the deployment will stop to that instance, and the
     * deployment to that instance will be considered to have failed.
     *
     * @return If true, then if the deployment causes the ApplicationStop deployment
     *         lifecycle event to fail to a specific instance, the deployment will
     *         not be considered to have failed to that instance at that point and
     *         will continue on to the BeforeInstall deployment lifecycle event.
     *         <p>If false or not specified, then if the deployment causes the
     *         ApplicationStop deployment lifecycle event to fail to a specific
     *         instance, the deployment will stop to that instance, and the
     *         deployment to that instance will be considered to have failed.
     */
    public Boolean getIgnoreApplicationStopFailures() {
        return ignoreApplicationStopFailures;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getApplicationName() != null) sb.append("ApplicationName: " + getApplicationName() + ",");
        if (getDeploymentGroupName() != null) sb.append("DeploymentGroupName: " + getDeploymentGroupName() + ",");
        if (getDeploymentConfigName() != null) sb.append("DeploymentConfigName: " + getDeploymentConfigName() + ",");
        if (getDeploymentId() != null) sb.append("DeploymentId: " + getDeploymentId() + ",");
        if (getRevision() != null) sb.append("Revision: " + getRevision() + ",");
        if (getStatus() != null) sb.append("Status: " + getStatus() + ",");
        if (getErrorInformation() != null) sb.append("ErrorInformation: " + getErrorInformation() + ",");
        if (getCreateTime() != null) sb.append("CreateTime: " + getCreateTime() + ",");
        if (getStartTime() != null) sb.append("StartTime: " + getStartTime() + ",");
        if (getCompleteTime() != null) sb.append("CompleteTime: " + getCompleteTime() + ",");
        if (getDeploymentOverview() != null) sb.append("DeploymentOverview: " + getDeploymentOverview() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getCreator() != null) sb.append("Creator: " + getCreator() + ",");
        if (isIgnoreApplicationStopFailures() != null) sb.append("IgnoreApplicationStopFailures: " + isIgnoreApplicationStopFailures() );
        sb.append("}");
        return sb.toString();
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
        hashCode = prime * hashCode + ((isIgnoreApplicationStopFailures() == null) ? 0 : isIgnoreApplicationStopFailures().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof DeploymentInfo == false) return false;
        DeploymentInfo other = (DeploymentInfo)obj;
        
        if (other.getApplicationName() == null ^ this.getApplicationName() == null) return false;
        if (other.getApplicationName() != null && other.getApplicationName().equals(this.getApplicationName()) == false) return false; 
        if (other.getDeploymentGroupName() == null ^ this.getDeploymentGroupName() == null) return false;
        if (other.getDeploymentGroupName() != null && other.getDeploymentGroupName().equals(this.getDeploymentGroupName()) == false) return false; 
        if (other.getDeploymentConfigName() == null ^ this.getDeploymentConfigName() == null) return false;
        if (other.getDeploymentConfigName() != null && other.getDeploymentConfigName().equals(this.getDeploymentConfigName()) == false) return false; 
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null) return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false) return false; 
        if (other.getRevision() == null ^ this.getRevision() == null) return false;
        if (other.getRevision() != null && other.getRevision().equals(this.getRevision()) == false) return false; 
        if (other.getStatus() == null ^ this.getStatus() == null) return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false) return false; 
        if (other.getErrorInformation() == null ^ this.getErrorInformation() == null) return false;
        if (other.getErrorInformation() != null && other.getErrorInformation().equals(this.getErrorInformation()) == false) return false; 
        if (other.getCreateTime() == null ^ this.getCreateTime() == null) return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false) return false; 
        if (other.getStartTime() == null ^ this.getStartTime() == null) return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false) return false; 
        if (other.getCompleteTime() == null ^ this.getCompleteTime() == null) return false;
        if (other.getCompleteTime() != null && other.getCompleteTime().equals(this.getCompleteTime()) == false) return false; 
        if (other.getDeploymentOverview() == null ^ this.getDeploymentOverview() == null) return false;
        if (other.getDeploymentOverview() != null && other.getDeploymentOverview().equals(this.getDeploymentOverview()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getCreator() == null ^ this.getCreator() == null) return false;
        if (other.getCreator() != null && other.getCreator().equals(this.getCreator()) == false) return false; 
        if (other.isIgnoreApplicationStopFailures() == null ^ this.isIgnoreApplicationStopFailures() == null) return false;
        if (other.isIgnoreApplicationStopFailures() != null && other.isIgnoreApplicationStopFailures().equals(this.isIgnoreApplicationStopFailures()) == false) return false; 
        return true;
    }
    
}
    