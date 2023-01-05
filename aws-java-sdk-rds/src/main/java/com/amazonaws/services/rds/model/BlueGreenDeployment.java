/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Contains the details about a blue/green deployment.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/blue-green-deployments.html">Using Amazon RDS Blue/Green
 * Deployments for database updates</a> in the <i>Amazon RDS User Guide</i> and <a
 * href="https://docs.aws.amazon.com/AmazonRDS/latest/AuroraUserGuide/blue-green-deployments.html"> Using Amazon RDS
 * Blue/Green Deployments for database updates</a> in the <i>Amazon Aurora User Guide</i>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/BlueGreenDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BlueGreenDeployment implements Serializable, Cloneable {

    /**
     * <p>
     * The system-generated identifier of the blue/green deployment.
     * </p>
     */
    private String blueGreenDeploymentIdentifier;
    /**
     * <p>
     * The user-supplied name of the blue/green deployment.
     * </p>
     */
    private String blueGreenDeploymentName;
    /**
     * <p>
     * The source database for the blue/green deployment.
     * </p>
     * <p>
     * Before switchover, the source database is the production database in the blue environment.
     * </p>
     */
    private String source;
    /**
     * <p>
     * The target database for the blue/green deployment.
     * </p>
     * <p>
     * Before switchover, the target database is the clone database in the green environment.
     * </p>
     */
    private String target;
    /**
     * <p>
     * The details about each source and target resource in the blue/green deployment.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SwitchoverDetail> switchoverDetails;
    /**
     * <p>
     * Either tasks to be performed or tasks that have been completed on the target database before switchover.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<BlueGreenDeploymentTask> tasks;
    /**
     * <p>
     * The status of the blue/green deployment.
     * </p>
     * <p>
     * Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code> - Resources are being created in the green environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Resources are available in the green environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SWITCHOVER_IN_PROGRESS</code> - The deployment is being switched from the blue environment to the green
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SWITCHOVER_COMPLETED</code> - Switchover from the blue environment to the green environment is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CONFIGURATION</code> - Resources in the green environment are invalid, so switchover isn't
     * possible.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SWITCHOVER_FAILED</code> - Switchover was attempted but failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The blue/green deployment is being deleted.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * Additional information about the status of the blue/green deployment.
     * </p>
     */
    private String statusDetails;
    /**
     * <p>
     * Specifies the time when the blue/green deployment was created, in Universal Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date createTime;
    /**
     * <p>
     * Specifies the time when the blue/green deployment was deleted, in Universal Coordinated Time (UTC).
     * </p>
     */
    private java.util.Date deleteTime;

    private com.amazonaws.internal.SdkInternalList<Tag> tagList;

    /**
     * <p>
     * The system-generated identifier of the blue/green deployment.
     * </p>
     * 
     * @param blueGreenDeploymentIdentifier
     *        The system-generated identifier of the blue/green deployment.
     */

    public void setBlueGreenDeploymentIdentifier(String blueGreenDeploymentIdentifier) {
        this.blueGreenDeploymentIdentifier = blueGreenDeploymentIdentifier;
    }

    /**
     * <p>
     * The system-generated identifier of the blue/green deployment.
     * </p>
     * 
     * @return The system-generated identifier of the blue/green deployment.
     */

    public String getBlueGreenDeploymentIdentifier() {
        return this.blueGreenDeploymentIdentifier;
    }

    /**
     * <p>
     * The system-generated identifier of the blue/green deployment.
     * </p>
     * 
     * @param blueGreenDeploymentIdentifier
     *        The system-generated identifier of the blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeployment withBlueGreenDeploymentIdentifier(String blueGreenDeploymentIdentifier) {
        setBlueGreenDeploymentIdentifier(blueGreenDeploymentIdentifier);
        return this;
    }

    /**
     * <p>
     * The user-supplied name of the blue/green deployment.
     * </p>
     * 
     * @param blueGreenDeploymentName
     *        The user-supplied name of the blue/green deployment.
     */

    public void setBlueGreenDeploymentName(String blueGreenDeploymentName) {
        this.blueGreenDeploymentName = blueGreenDeploymentName;
    }

    /**
     * <p>
     * The user-supplied name of the blue/green deployment.
     * </p>
     * 
     * @return The user-supplied name of the blue/green deployment.
     */

    public String getBlueGreenDeploymentName() {
        return this.blueGreenDeploymentName;
    }

    /**
     * <p>
     * The user-supplied name of the blue/green deployment.
     * </p>
     * 
     * @param blueGreenDeploymentName
     *        The user-supplied name of the blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeployment withBlueGreenDeploymentName(String blueGreenDeploymentName) {
        setBlueGreenDeploymentName(blueGreenDeploymentName);
        return this;
    }

    /**
     * <p>
     * The source database for the blue/green deployment.
     * </p>
     * <p>
     * Before switchover, the source database is the production database in the blue environment.
     * </p>
     * 
     * @param source
     *        The source database for the blue/green deployment.</p>
     *        <p>
     *        Before switchover, the source database is the production database in the blue environment.
     */

    public void setSource(String source) {
        this.source = source;
    }

    /**
     * <p>
     * The source database for the blue/green deployment.
     * </p>
     * <p>
     * Before switchover, the source database is the production database in the blue environment.
     * </p>
     * 
     * @return The source database for the blue/green deployment.</p>
     *         <p>
     *         Before switchover, the source database is the production database in the blue environment.
     */

    public String getSource() {
        return this.source;
    }

    /**
     * <p>
     * The source database for the blue/green deployment.
     * </p>
     * <p>
     * Before switchover, the source database is the production database in the blue environment.
     * </p>
     * 
     * @param source
     *        The source database for the blue/green deployment.</p>
     *        <p>
     *        Before switchover, the source database is the production database in the blue environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeployment withSource(String source) {
        setSource(source);
        return this;
    }

    /**
     * <p>
     * The target database for the blue/green deployment.
     * </p>
     * <p>
     * Before switchover, the target database is the clone database in the green environment.
     * </p>
     * 
     * @param target
     *        The target database for the blue/green deployment.</p>
     *        <p>
     *        Before switchover, the target database is the clone database in the green environment.
     */

    public void setTarget(String target) {
        this.target = target;
    }

    /**
     * <p>
     * The target database for the blue/green deployment.
     * </p>
     * <p>
     * Before switchover, the target database is the clone database in the green environment.
     * </p>
     * 
     * @return The target database for the blue/green deployment.</p>
     *         <p>
     *         Before switchover, the target database is the clone database in the green environment.
     */

    public String getTarget() {
        return this.target;
    }

    /**
     * <p>
     * The target database for the blue/green deployment.
     * </p>
     * <p>
     * Before switchover, the target database is the clone database in the green environment.
     * </p>
     * 
     * @param target
     *        The target database for the blue/green deployment.</p>
     *        <p>
     *        Before switchover, the target database is the clone database in the green environment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeployment withTarget(String target) {
        setTarget(target);
        return this;
    }

    /**
     * <p>
     * The details about each source and target resource in the blue/green deployment.
     * </p>
     * 
     * @return The details about each source and target resource in the blue/green deployment.
     */

    public java.util.List<SwitchoverDetail> getSwitchoverDetails() {
        if (switchoverDetails == null) {
            switchoverDetails = new com.amazonaws.internal.SdkInternalList<SwitchoverDetail>();
        }
        return switchoverDetails;
    }

    /**
     * <p>
     * The details about each source and target resource in the blue/green deployment.
     * </p>
     * 
     * @param switchoverDetails
     *        The details about each source and target resource in the blue/green deployment.
     */

    public void setSwitchoverDetails(java.util.Collection<SwitchoverDetail> switchoverDetails) {
        if (switchoverDetails == null) {
            this.switchoverDetails = null;
            return;
        }

        this.switchoverDetails = new com.amazonaws.internal.SdkInternalList<SwitchoverDetail>(switchoverDetails);
    }

    /**
     * <p>
     * The details about each source and target resource in the blue/green deployment.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSwitchoverDetails(java.util.Collection)} or {@link #withSwitchoverDetails(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param switchoverDetails
     *        The details about each source and target resource in the blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeployment withSwitchoverDetails(SwitchoverDetail... switchoverDetails) {
        if (this.switchoverDetails == null) {
            setSwitchoverDetails(new com.amazonaws.internal.SdkInternalList<SwitchoverDetail>(switchoverDetails.length));
        }
        for (SwitchoverDetail ele : switchoverDetails) {
            this.switchoverDetails.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The details about each source and target resource in the blue/green deployment.
     * </p>
     * 
     * @param switchoverDetails
     *        The details about each source and target resource in the blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeployment withSwitchoverDetails(java.util.Collection<SwitchoverDetail> switchoverDetails) {
        setSwitchoverDetails(switchoverDetails);
        return this;
    }

    /**
     * <p>
     * Either tasks to be performed or tasks that have been completed on the target database before switchover.
     * </p>
     * 
     * @return Either tasks to be performed or tasks that have been completed on the target database before switchover.
     */

    public java.util.List<BlueGreenDeploymentTask> getTasks() {
        if (tasks == null) {
            tasks = new com.amazonaws.internal.SdkInternalList<BlueGreenDeploymentTask>();
        }
        return tasks;
    }

    /**
     * <p>
     * Either tasks to be performed or tasks that have been completed on the target database before switchover.
     * </p>
     * 
     * @param tasks
     *        Either tasks to be performed or tasks that have been completed on the target database before switchover.
     */

    public void setTasks(java.util.Collection<BlueGreenDeploymentTask> tasks) {
        if (tasks == null) {
            this.tasks = null;
            return;
        }

        this.tasks = new com.amazonaws.internal.SdkInternalList<BlueGreenDeploymentTask>(tasks);
    }

    /**
     * <p>
     * Either tasks to be performed or tasks that have been completed on the target database before switchover.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTasks(java.util.Collection)} or {@link #withTasks(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tasks
     *        Either tasks to be performed or tasks that have been completed on the target database before switchover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeployment withTasks(BlueGreenDeploymentTask... tasks) {
        if (this.tasks == null) {
            setTasks(new com.amazonaws.internal.SdkInternalList<BlueGreenDeploymentTask>(tasks.length));
        }
        for (BlueGreenDeploymentTask ele : tasks) {
            this.tasks.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Either tasks to be performed or tasks that have been completed on the target database before switchover.
     * </p>
     * 
     * @param tasks
     *        Either tasks to be performed or tasks that have been completed on the target database before switchover.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeployment withTasks(java.util.Collection<BlueGreenDeploymentTask> tasks) {
        setTasks(tasks);
        return this;
    }

    /**
     * <p>
     * The status of the blue/green deployment.
     * </p>
     * <p>
     * Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code> - Resources are being created in the green environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Resources are available in the green environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SWITCHOVER_IN_PROGRESS</code> - The deployment is being switched from the blue environment to the green
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SWITCHOVER_COMPLETED</code> - Switchover from the blue environment to the green environment is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CONFIGURATION</code> - Resources in the green environment are invalid, so switchover isn't
     * possible.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SWITCHOVER_FAILED</code> - Switchover was attempted but failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The blue/green deployment is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the blue/green deployment.</p>
     *        <p>
     *        Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code> - Resources are being created in the green environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - Resources are available in the green environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SWITCHOVER_IN_PROGRESS</code> - The deployment is being switched from the blue environment to the
     *        green environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SWITCHOVER_COMPLETED</code> - Switchover from the blue environment to the green environment is
     *        complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_CONFIGURATION</code> - Resources in the green environment are invalid, so switchover isn't
     *        possible.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SWITCHOVER_FAILED</code> - Switchover was attempted but failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The blue/green deployment is being deleted.
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the blue/green deployment.
     * </p>
     * <p>
     * Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code> - Resources are being created in the green environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Resources are available in the green environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SWITCHOVER_IN_PROGRESS</code> - The deployment is being switched from the blue environment to the green
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SWITCHOVER_COMPLETED</code> - Switchover from the blue environment to the green environment is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CONFIGURATION</code> - Resources in the green environment are invalid, so switchover isn't
     * possible.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SWITCHOVER_FAILED</code> - Switchover was attempted but failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The blue/green deployment is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the blue/green deployment.</p>
     *         <p>
     *         Values:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>PROVISIONING</code> - Resources are being created in the green environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - Resources are available in the green environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SWITCHOVER_IN_PROGRESS</code> - The deployment is being switched from the blue environment to the
     *         green environment.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SWITCHOVER_COMPLETED</code> - Switchover from the blue environment to the green environment is
     *         complete.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>INVALID_CONFIGURATION</code> - Resources in the green environment are invalid, so switchover isn't
     *         possible.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SWITCHOVER_FAILED</code> - Switchover was attempted but failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - The blue/green deployment is being deleted.
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the blue/green deployment.
     * </p>
     * <p>
     * Values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>PROVISIONING</code> - Resources are being created in the green environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - Resources are available in the green environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SWITCHOVER_IN_PROGRESS</code> - The deployment is being switched from the blue environment to the green
     * environment.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SWITCHOVER_COMPLETED</code> - Switchover from the blue environment to the green environment is complete.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>INVALID_CONFIGURATION</code> - Resources in the green environment are invalid, so switchover isn't
     * possible.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SWITCHOVER_FAILED</code> - Switchover was attempted but failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - The blue/green deployment is being deleted.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the blue/green deployment.</p>
     *        <p>
     *        Values:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>PROVISIONING</code> - Resources are being created in the green environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - Resources are available in the green environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SWITCHOVER_IN_PROGRESS</code> - The deployment is being switched from the blue environment to the
     *        green environment.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SWITCHOVER_COMPLETED</code> - Switchover from the blue environment to the green environment is
     *        complete.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>INVALID_CONFIGURATION</code> - Resources in the green environment are invalid, so switchover isn't
     *        possible.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SWITCHOVER_FAILED</code> - Switchover was attempted but failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - The blue/green deployment is being deleted.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeployment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Additional information about the status of the blue/green deployment.
     * </p>
     * 
     * @param statusDetails
     *        Additional information about the status of the blue/green deployment.
     */

    public void setStatusDetails(String statusDetails) {
        this.statusDetails = statusDetails;
    }

    /**
     * <p>
     * Additional information about the status of the blue/green deployment.
     * </p>
     * 
     * @return Additional information about the status of the blue/green deployment.
     */

    public String getStatusDetails() {
        return this.statusDetails;
    }

    /**
     * <p>
     * Additional information about the status of the blue/green deployment.
     * </p>
     * 
     * @param statusDetails
     *        Additional information about the status of the blue/green deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeployment withStatusDetails(String statusDetails) {
        setStatusDetails(statusDetails);
        return this;
    }

    /**
     * <p>
     * Specifies the time when the blue/green deployment was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param createTime
     *        Specifies the time when the blue/green deployment was created, in Universal Coordinated Time (UTC).
     */

    public void setCreateTime(java.util.Date createTime) {
        this.createTime = createTime;
    }

    /**
     * <p>
     * Specifies the time when the blue/green deployment was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return Specifies the time when the blue/green deployment was created, in Universal Coordinated Time (UTC).
     */

    public java.util.Date getCreateTime() {
        return this.createTime;
    }

    /**
     * <p>
     * Specifies the time when the blue/green deployment was created, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param createTime
     *        Specifies the time when the blue/green deployment was created, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeployment withCreateTime(java.util.Date createTime) {
        setCreateTime(createTime);
        return this;
    }

    /**
     * <p>
     * Specifies the time when the blue/green deployment was deleted, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param deleteTime
     *        Specifies the time when the blue/green deployment was deleted, in Universal Coordinated Time (UTC).
     */

    public void setDeleteTime(java.util.Date deleteTime) {
        this.deleteTime = deleteTime;
    }

    /**
     * <p>
     * Specifies the time when the blue/green deployment was deleted, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @return Specifies the time when the blue/green deployment was deleted, in Universal Coordinated Time (UTC).
     */

    public java.util.Date getDeleteTime() {
        return this.deleteTime;
    }

    /**
     * <p>
     * Specifies the time when the blue/green deployment was deleted, in Universal Coordinated Time (UTC).
     * </p>
     * 
     * @param deleteTime
     *        Specifies the time when the blue/green deployment was deleted, in Universal Coordinated Time (UTC).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeployment withDeleteTime(java.util.Date deleteTime) {
        setDeleteTime(deleteTime);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTagList() {
        if (tagList == null) {
            tagList = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tagList;
    }

    /**
     * @param tagList
     */

    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new com.amazonaws.internal.SdkInternalList<Tag>(tagList);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeployment withTagList(Tag... tagList) {
        if (this.tagList == null) {
            setTagList(new com.amazonaws.internal.SdkInternalList<Tag>(tagList.length));
        }
        for (Tag ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * @param tagList
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BlueGreenDeployment withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
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
        if (getBlueGreenDeploymentIdentifier() != null)
            sb.append("BlueGreenDeploymentIdentifier: ").append(getBlueGreenDeploymentIdentifier()).append(",");
        if (getBlueGreenDeploymentName() != null)
            sb.append("BlueGreenDeploymentName: ").append(getBlueGreenDeploymentName()).append(",");
        if (getSource() != null)
            sb.append("Source: ").append(getSource()).append(",");
        if (getTarget() != null)
            sb.append("Target: ").append(getTarget()).append(",");
        if (getSwitchoverDetails() != null)
            sb.append("SwitchoverDetails: ").append(getSwitchoverDetails()).append(",");
        if (getTasks() != null)
            sb.append("Tasks: ").append(getTasks()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusDetails() != null)
            sb.append("StatusDetails: ").append(getStatusDetails()).append(",");
        if (getCreateTime() != null)
            sb.append("CreateTime: ").append(getCreateTime()).append(",");
        if (getDeleteTime() != null)
            sb.append("DeleteTime: ").append(getDeleteTime()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BlueGreenDeployment == false)
            return false;
        BlueGreenDeployment other = (BlueGreenDeployment) obj;
        if (other.getBlueGreenDeploymentIdentifier() == null ^ this.getBlueGreenDeploymentIdentifier() == null)
            return false;
        if (other.getBlueGreenDeploymentIdentifier() != null
                && other.getBlueGreenDeploymentIdentifier().equals(this.getBlueGreenDeploymentIdentifier()) == false)
            return false;
        if (other.getBlueGreenDeploymentName() == null ^ this.getBlueGreenDeploymentName() == null)
            return false;
        if (other.getBlueGreenDeploymentName() != null && other.getBlueGreenDeploymentName().equals(this.getBlueGreenDeploymentName()) == false)
            return false;
        if (other.getSource() == null ^ this.getSource() == null)
            return false;
        if (other.getSource() != null && other.getSource().equals(this.getSource()) == false)
            return false;
        if (other.getTarget() == null ^ this.getTarget() == null)
            return false;
        if (other.getTarget() != null && other.getTarget().equals(this.getTarget()) == false)
            return false;
        if (other.getSwitchoverDetails() == null ^ this.getSwitchoverDetails() == null)
            return false;
        if (other.getSwitchoverDetails() != null && other.getSwitchoverDetails().equals(this.getSwitchoverDetails()) == false)
            return false;
        if (other.getTasks() == null ^ this.getTasks() == null)
            return false;
        if (other.getTasks() != null && other.getTasks().equals(this.getTasks()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusDetails() == null ^ this.getStatusDetails() == null)
            return false;
        if (other.getStatusDetails() != null && other.getStatusDetails().equals(this.getStatusDetails()) == false)
            return false;
        if (other.getCreateTime() == null ^ this.getCreateTime() == null)
            return false;
        if (other.getCreateTime() != null && other.getCreateTime().equals(this.getCreateTime()) == false)
            return false;
        if (other.getDeleteTime() == null ^ this.getDeleteTime() == null)
            return false;
        if (other.getDeleteTime() != null && other.getDeleteTime().equals(this.getDeleteTime()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getBlueGreenDeploymentIdentifier() == null) ? 0 : getBlueGreenDeploymentIdentifier().hashCode());
        hashCode = prime * hashCode + ((getBlueGreenDeploymentName() == null) ? 0 : getBlueGreenDeploymentName().hashCode());
        hashCode = prime * hashCode + ((getSource() == null) ? 0 : getSource().hashCode());
        hashCode = prime * hashCode + ((getTarget() == null) ? 0 : getTarget().hashCode());
        hashCode = prime * hashCode + ((getSwitchoverDetails() == null) ? 0 : getSwitchoverDetails().hashCode());
        hashCode = prime * hashCode + ((getTasks() == null) ? 0 : getTasks().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusDetails() == null) ? 0 : getStatusDetails().hashCode());
        hashCode = prime * hashCode + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        hashCode = prime * hashCode + ((getDeleteTime() == null) ? 0 : getDeleteTime().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        return hashCode;
    }

    @Override
    public BlueGreenDeployment clone() {
        try {
            return (BlueGreenDeployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
