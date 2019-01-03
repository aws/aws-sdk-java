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
package com.amazonaws.services.cloudformation.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The Stack data type.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/Stack" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Stack implements Serializable, Cloneable {

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * The name associated with the stack.
     * </p>
     */
    private String stackName;
    /**
     * <p>
     * The unique ID of the change set.
     * </p>
     */
    private String changeSetId;
    /**
     * <p>
     * A user-defined description associated with the stack.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A list of <code>Parameter</code> structures.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameters;
    /**
     * <p>
     * The time at which the stack was created.
     * </p>
     */
    private java.util.Date creationTime;
    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     */
    private java.util.Date deletionTime;
    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if the stack has been updated at least
     * once.
     * </p>
     */
    private java.util.Date lastUpdatedTime;
    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for
     * the specified monitoring period afterwards.
     * </p>
     */
    private RollbackConfiguration rollbackConfiguration;
    /**
     * <p>
     * Current status of the stack.
     * </p>
     */
    private String stackStatus;
    /**
     * <p>
     * Success/failure message associated with the stack status.
     * </p>
     */
    private String stackStatusReason;
    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: disable rollback
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: enable rollback
     * </p>
     * </li>
     * </ul>
     */
    private Boolean disableRollback;
    /**
     * <p>
     * SNS topic ARNs to which stack related events are published.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> notificationARNs;
    /**
     * <p>
     * The amount of time within which stack creation should complete.
     * </p>
     */
    private Integer timeoutInMinutes;
    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> capabilities;
    /**
     * <p>
     * A list of output structures.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Output> outputs;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that is associated with the
     * stack. During a stack operation, AWS CloudFormation uses this role's credentials to make calls on your behalf.
     * </p>
     */
    private String roleARN;
    /**
     * <p>
     * A list of <code>Tag</code>s that specify information about the stack.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;
    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     * <p>
     * For <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     * stacks</a>, termination protection is set on the root stack and cannot be changed directly on the nested stack.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">Protecting a
     * Stack From Being Deleted</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     */
    private Boolean enableTerminationProtection;
    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this
     * stack. For the first level of nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     */
    private String parentId;
    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack to
     * which the nested stack ultimately belongs.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     */
    private String rootId;
    /**
     * <p>
     * Information on whether a stack's actual configuration differs, or has <i>drifted</i>, from it's expected
     * configuration, as defined in the stack template and any values specified as template parameters. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     */
    private StackDriftInformation driftInformation;

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     * 
     * @param stackId
     *        Unique identifier of the stack.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     * 
     * @return Unique identifier of the stack.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * Unique identifier of the stack.
     * </p>
     * 
     * @param stackId
     *        Unique identifier of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name associated with the stack.
     */

    public void setStackName(String stackName) {
        this.stackName = stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @return The name associated with the stack.
     */

    public String getStackName() {
        return this.stackName;
    }

    /**
     * <p>
     * The name associated with the stack.
     * </p>
     * 
     * @param stackName
     *        The name associated with the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withStackName(String stackName) {
        setStackName(stackName);
        return this;
    }

    /**
     * <p>
     * The unique ID of the change set.
     * </p>
     * 
     * @param changeSetId
     *        The unique ID of the change set.
     */

    public void setChangeSetId(String changeSetId) {
        this.changeSetId = changeSetId;
    }

    /**
     * <p>
     * The unique ID of the change set.
     * </p>
     * 
     * @return The unique ID of the change set.
     */

    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * <p>
     * The unique ID of the change set.
     * </p>
     * 
     * @param changeSetId
     *        The unique ID of the change set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withChangeSetId(String changeSetId) {
        setChangeSetId(changeSetId);
        return this;
    }

    /**
     * <p>
     * A user-defined description associated with the stack.
     * </p>
     * 
     * @param description
     *        A user-defined description associated with the stack.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A user-defined description associated with the stack.
     * </p>
     * 
     * @return A user-defined description associated with the stack.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A user-defined description associated with the stack.
     * </p>
     * 
     * @param description
     *        A user-defined description associated with the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures.
     * </p>
     * 
     * @return A list of <code>Parameter</code> structures.
     */

    public java.util.List<Parameter> getParameters() {
        if (parameters == null) {
            parameters = new com.amazonaws.internal.SdkInternalList<Parameter>();
        }
        return parameters;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures.
     * </p>
     * 
     * @param parameters
     *        A list of <code>Parameter</code> structures.
     */

    public void setParameters(java.util.Collection<Parameter> parameters) {
        if (parameters == null) {
            this.parameters = null;
            return;
        }

        this.parameters = new com.amazonaws.internal.SdkInternalList<Parameter>(parameters);
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameters(java.util.Collection)} or {@link #withParameters(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param parameters
     *        A list of <code>Parameter</code> structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withParameters(Parameter... parameters) {
        if (this.parameters == null) {
            setParameters(new com.amazonaws.internal.SdkInternalList<Parameter>(parameters.length));
        }
        for (Parameter ele : parameters) {
            this.parameters.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Parameter</code> structures.
     * </p>
     * 
     * @param parameters
     *        A list of <code>Parameter</code> structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withParameters(java.util.Collection<Parameter> parameters) {
        setParameters(parameters);
        return this;
    }

    /**
     * <p>
     * The time at which the stack was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the stack was created.
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * <p>
     * The time at which the stack was created.
     * </p>
     * 
     * @return The time at which the stack was created.
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * <p>
     * The time at which the stack was created.
     * </p>
     * 
     * @param creationTime
     *        The time at which the stack was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     * 
     * @param deletionTime
     *        The time the stack was deleted.
     */

    public void setDeletionTime(java.util.Date deletionTime) {
        this.deletionTime = deletionTime;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     * 
     * @return The time the stack was deleted.
     */

    public java.util.Date getDeletionTime() {
        return this.deletionTime;
    }

    /**
     * <p>
     * The time the stack was deleted.
     * </p>
     * 
     * @param deletionTime
     *        The time the stack was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withDeletionTime(java.util.Date deletionTime) {
        setDeletionTime(deletionTime);
        return this;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if the stack has been updated at least
     * once.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time the stack was last updated. This field will only be returned if the stack has been updated at
     *        least once.
     */

    public void setLastUpdatedTime(java.util.Date lastUpdatedTime) {
        this.lastUpdatedTime = lastUpdatedTime;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if the stack has been updated at least
     * once.
     * </p>
     * 
     * @return The time the stack was last updated. This field will only be returned if the stack has been updated at
     *         least once.
     */

    public java.util.Date getLastUpdatedTime() {
        return this.lastUpdatedTime;
    }

    /**
     * <p>
     * The time the stack was last updated. This field will only be returned if the stack has been updated at least
     * once.
     * </p>
     * 
     * @param lastUpdatedTime
     *        The time the stack was last updated. This field will only be returned if the stack has been updated at
     *        least once.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withLastUpdatedTime(java.util.Date lastUpdatedTime) {
        setLastUpdatedTime(lastUpdatedTime);
        return this;
    }

    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for
     * the specified monitoring period afterwards.
     * </p>
     * 
     * @param rollbackConfiguration
     *        The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and
     *        for the specified monitoring period afterwards.
     */

    public void setRollbackConfiguration(RollbackConfiguration rollbackConfiguration) {
        this.rollbackConfiguration = rollbackConfiguration;
    }

    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for
     * the specified monitoring period afterwards.
     * </p>
     * 
     * @return The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations,
     *         and for the specified monitoring period afterwards.
     */

    public RollbackConfiguration getRollbackConfiguration() {
        return this.rollbackConfiguration;
    }

    /**
     * <p>
     * The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and for
     * the specified monitoring period afterwards.
     * </p>
     * 
     * @param rollbackConfiguration
     *        The rollback triggers for AWS CloudFormation to monitor during stack creation and updating operations, and
     *        for the specified monitoring period afterwards.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withRollbackConfiguration(RollbackConfiguration rollbackConfiguration) {
        setRollbackConfiguration(rollbackConfiguration);
        return this;
    }

    /**
     * <p>
     * Current status of the stack.
     * </p>
     * 
     * @param stackStatus
     *        Current status of the stack.
     * @see StackStatus
     */

    public void setStackStatus(String stackStatus) {
        this.stackStatus = stackStatus;
    }

    /**
     * <p>
     * Current status of the stack.
     * </p>
     * 
     * @return Current status of the stack.
     * @see StackStatus
     */

    public String getStackStatus() {
        return this.stackStatus;
    }

    /**
     * <p>
     * Current status of the stack.
     * </p>
     * 
     * @param stackStatus
     *        Current status of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackStatus
     */

    public Stack withStackStatus(String stackStatus) {
        setStackStatus(stackStatus);
        return this;
    }

    /**
     * <p>
     * Current status of the stack.
     * </p>
     * 
     * @param stackStatus
     *        Current status of the stack.
     * @see StackStatus
     */

    public void setStackStatus(StackStatus stackStatus) {
        withStackStatus(stackStatus);
    }

    /**
     * <p>
     * Current status of the stack.
     * </p>
     * 
     * @param stackStatus
     *        Current status of the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackStatus
     */

    public Stack withStackStatus(StackStatus stackStatus) {
        this.stackStatus = stackStatus.toString();
        return this;
    }

    /**
     * <p>
     * Success/failure message associated with the stack status.
     * </p>
     * 
     * @param stackStatusReason
     *        Success/failure message associated with the stack status.
     */

    public void setStackStatusReason(String stackStatusReason) {
        this.stackStatusReason = stackStatusReason;
    }

    /**
     * <p>
     * Success/failure message associated with the stack status.
     * </p>
     * 
     * @return Success/failure message associated with the stack status.
     */

    public String getStackStatusReason() {
        return this.stackStatusReason;
    }

    /**
     * <p>
     * Success/failure message associated with the stack status.
     * </p>
     * 
     * @param stackStatusReason
     *        Success/failure message associated with the stack status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withStackStatusReason(String stackStatusReason) {
        setStackStatusReason(stackStatusReason);
        return this;
    }

    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: disable rollback
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: enable rollback
     * </p>
     * </li>
     * </ul>
     * 
     * @param disableRollback
     *        Boolean to enable or disable rollback on stack creation failures:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code>: disable rollback
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code>: enable rollback
     *        </p>
     *        </li>
     */

    public void setDisableRollback(Boolean disableRollback) {
        this.disableRollback = disableRollback;
    }

    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: disable rollback
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: enable rollback
     * </p>
     * </li>
     * </ul>
     * 
     * @return Boolean to enable or disable rollback on stack creation failures:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code>: disable rollback
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code>: enable rollback
     *         </p>
     *         </li>
     */

    public Boolean getDisableRollback() {
        return this.disableRollback;
    }

    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: disable rollback
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: enable rollback
     * </p>
     * </li>
     * </ul>
     * 
     * @param disableRollback
     *        Boolean to enable or disable rollback on stack creation failures:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>true</code>: disable rollback
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>false</code>: enable rollback
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withDisableRollback(Boolean disableRollback) {
        setDisableRollback(disableRollback);
        return this;
    }

    /**
     * <p>
     * Boolean to enable or disable rollback on stack creation failures:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>true</code>: disable rollback
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>false</code>: enable rollback
     * </p>
     * </li>
     * </ul>
     * 
     * @return Boolean to enable or disable rollback on stack creation failures:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>true</code>: disable rollback
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>false</code>: enable rollback
     *         </p>
     *         </li>
     */

    public Boolean isDisableRollback() {
        return this.disableRollback;
    }

    /**
     * <p>
     * SNS topic ARNs to which stack related events are published.
     * </p>
     * 
     * @return SNS topic ARNs to which stack related events are published.
     */

    public java.util.List<String> getNotificationARNs() {
        if (notificationARNs == null) {
            notificationARNs = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return notificationARNs;
    }

    /**
     * <p>
     * SNS topic ARNs to which stack related events are published.
     * </p>
     * 
     * @param notificationARNs
     *        SNS topic ARNs to which stack related events are published.
     */

    public void setNotificationARNs(java.util.Collection<String> notificationARNs) {
        if (notificationARNs == null) {
            this.notificationARNs = null;
            return;
        }

        this.notificationARNs = new com.amazonaws.internal.SdkInternalList<String>(notificationARNs);
    }

    /**
     * <p>
     * SNS topic ARNs to which stack related events are published.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setNotificationARNs(java.util.Collection)} or {@link #withNotificationARNs(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param notificationARNs
     *        SNS topic ARNs to which stack related events are published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withNotificationARNs(String... notificationARNs) {
        if (this.notificationARNs == null) {
            setNotificationARNs(new com.amazonaws.internal.SdkInternalList<String>(notificationARNs.length));
        }
        for (String ele : notificationARNs) {
            this.notificationARNs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * SNS topic ARNs to which stack related events are published.
     * </p>
     * 
     * @param notificationARNs
     *        SNS topic ARNs to which stack related events are published.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withNotificationARNs(java.util.Collection<String> notificationARNs) {
        setNotificationARNs(notificationARNs);
        return this;
    }

    /**
     * <p>
     * The amount of time within which stack creation should complete.
     * </p>
     * 
     * @param timeoutInMinutes
     *        The amount of time within which stack creation should complete.
     */

    public void setTimeoutInMinutes(Integer timeoutInMinutes) {
        this.timeoutInMinutes = timeoutInMinutes;
    }

    /**
     * <p>
     * The amount of time within which stack creation should complete.
     * </p>
     * 
     * @return The amount of time within which stack creation should complete.
     */

    public Integer getTimeoutInMinutes() {
        return this.timeoutInMinutes;
    }

    /**
     * <p>
     * The amount of time within which stack creation should complete.
     * </p>
     * 
     * @param timeoutInMinutes
     *        The amount of time within which stack creation should complete.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withTimeoutInMinutes(Integer timeoutInMinutes) {
        setTimeoutInMinutes(timeoutInMinutes);
        return this;
    }

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     * 
     * @return The capabilities allowed in the stack.
     * @see Capability
     */

    public java.util.List<String> getCapabilities() {
        if (capabilities == null) {
            capabilities = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return capabilities;
    }

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     * 
     * @param capabilities
     *        The capabilities allowed in the stack.
     * @see Capability
     */

    public void setCapabilities(java.util.Collection<String> capabilities) {
        if (capabilities == null) {
            this.capabilities = null;
            return;
        }

        this.capabilities = new com.amazonaws.internal.SdkInternalList<String>(capabilities);
    }

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setCapabilities(java.util.Collection)} or {@link #withCapabilities(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param capabilities
     *        The capabilities allowed in the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public Stack withCapabilities(String... capabilities) {
        if (this.capabilities == null) {
            setCapabilities(new com.amazonaws.internal.SdkInternalList<String>(capabilities.length));
        }
        for (String ele : capabilities) {
            this.capabilities.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     * 
     * @param capabilities
     *        The capabilities allowed in the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public Stack withCapabilities(java.util.Collection<String> capabilities) {
        setCapabilities(capabilities);
        return this;
    }

    /**
     * <p>
     * The capabilities allowed in the stack.
     * </p>
     * 
     * @param capabilities
     *        The capabilities allowed in the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Capability
     */

    public Stack withCapabilities(Capability... capabilities) {
        com.amazonaws.internal.SdkInternalList<String> capabilitiesCopy = new com.amazonaws.internal.SdkInternalList<String>(capabilities.length);
        for (Capability value : capabilities) {
            capabilitiesCopy.add(value.toString());
        }
        if (getCapabilities() == null) {
            setCapabilities(capabilitiesCopy);
        } else {
            getCapabilities().addAll(capabilitiesCopy);
        }
        return this;
    }

    /**
     * <p>
     * A list of output structures.
     * </p>
     * 
     * @return A list of output structures.
     */

    public java.util.List<Output> getOutputs() {
        if (outputs == null) {
            outputs = new com.amazonaws.internal.SdkInternalList<Output>();
        }
        return outputs;
    }

    /**
     * <p>
     * A list of output structures.
     * </p>
     * 
     * @param outputs
     *        A list of output structures.
     */

    public void setOutputs(java.util.Collection<Output> outputs) {
        if (outputs == null) {
            this.outputs = null;
            return;
        }

        this.outputs = new com.amazonaws.internal.SdkInternalList<Output>(outputs);
    }

    /**
     * <p>
     * A list of output structures.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setOutputs(java.util.Collection)} or {@link #withOutputs(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param outputs
     *        A list of output structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withOutputs(Output... outputs) {
        if (this.outputs == null) {
            setOutputs(new com.amazonaws.internal.SdkInternalList<Output>(outputs.length));
        }
        for (Output ele : outputs) {
            this.outputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of output structures.
     * </p>
     * 
     * @param outputs
     *        A list of output structures.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withOutputs(java.util.Collection<Output> outputs) {
        setOutputs(outputs);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that is associated with the
     * stack. During a stack operation, AWS CloudFormation uses this role's credentials to make calls on your behalf.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that is associated with
     *        the stack. During a stack operation, AWS CloudFormation uses this role's credentials to make calls on your
     *        behalf.
     */

    public void setRoleARN(String roleARN) {
        this.roleARN = roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that is associated with the
     * stack. During a stack operation, AWS CloudFormation uses this role's credentials to make calls on your behalf.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that is associated
     *         with the stack. During a stack operation, AWS CloudFormation uses this role's credentials to make calls
     *         on your behalf.
     */

    public String getRoleARN() {
        return this.roleARN;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that is associated with the
     * stack. During a stack operation, AWS CloudFormation uses this role's credentials to make calls on your behalf.
     * </p>
     * 
     * @param roleARN
     *        The Amazon Resource Name (ARN) of an AWS Identity and Access Management (IAM) role that is associated with
     *        the stack. During a stack operation, AWS CloudFormation uses this role's credentials to make calls on your
     *        behalf.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withRoleARN(String roleARN) {
        setRoleARN(roleARN);
        return this;
    }

    /**
     * <p>
     * A list of <code>Tag</code>s that specify information about the stack.
     * </p>
     * 
     * @return A list of <code>Tag</code>s that specify information about the stack.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of <code>Tag</code>s that specify information about the stack.
     * </p>
     * 
     * @param tags
     *        A list of <code>Tag</code>s that specify information about the stack.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of <code>Tag</code>s that specify information about the stack.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of <code>Tag</code>s that specify information about the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>Tag</code>s that specify information about the stack.
     * </p>
     * 
     * @param tags
     *        A list of <code>Tag</code>s that specify information about the stack.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     * <p>
     * For <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     * stacks</a>, termination protection is set on the root stack and cannot be changed directly on the nested stack.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">Protecting a
     * Stack From Being Deleted</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param enableTerminationProtection
     *        Whether termination protection is enabled for the stack.</p>
     *        <p>
     *        For <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     *        stacks</a>, termination protection is set on the root stack and cannot be changed directly on the nested
     *        stack. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     *        >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public void setEnableTerminationProtection(Boolean enableTerminationProtection) {
        this.enableTerminationProtection = enableTerminationProtection;
    }

    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     * <p>
     * For <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     * stacks</a>, termination protection is set on the root stack and cannot be changed directly on the nested stack.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">Protecting a
     * Stack From Being Deleted</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @return Whether termination protection is enabled for the stack.</p>
     *         <p>
     *         For <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">
     *         nested stacks</a>, termination protection is set on the root stack and cannot be changed directly on the
     *         nested stack. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     *         >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public Boolean getEnableTerminationProtection() {
        return this.enableTerminationProtection;
    }

    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     * <p>
     * For <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     * stacks</a>, termination protection is set on the root stack and cannot be changed directly on the nested stack.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">Protecting a
     * Stack From Being Deleted</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param enableTerminationProtection
     *        Whether termination protection is enabled for the stack.</p>
     *        <p>
     *        For <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     *        stacks</a>, termination protection is set on the root stack and cannot be changed directly on the nested
     *        stack. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     *        >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withEnableTerminationProtection(Boolean enableTerminationProtection) {
        setEnableTerminationProtection(enableTerminationProtection);
        return this;
    }

    /**
     * <p>
     * Whether termination protection is enabled for the stack.
     * </p>
     * <p>
     * For <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">nested
     * stacks</a>, termination protection is set on the root stack and cannot be changed directly on the nested stack.
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html">Protecting a
     * Stack From Being Deleted</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @return Whether termination protection is enabled for the stack.</p>
     *         <p>
     *         For <a href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">
     *         nested stacks</a>, termination protection is set on the root stack and cannot be changed directly on the
     *         nested stack. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-protect-stacks.html"
     *         >Protecting a Stack From Being Deleted</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public Boolean isEnableTerminationProtection() {
        return this.enableTerminationProtection;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this
     * stack. For the first level of nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param parentId
     *        For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of
     *        this stack. For the first level of nested stacks, the root stack is also the parent stack.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working
     *        with Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this
     * stack. For the first level of nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @return For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of
     *         this stack. For the first level of nested stacks, the root stack is also the parent stack.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working
     *         with Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public String getParentId() {
        return this.parentId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of this
     * stack. For the first level of nested stacks, the root stack is also the parent stack.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param parentId
     *        For nested stacks--stacks created as resources for another stack--the stack ID of the direct parent of
     *        this stack. For the first level of nested stacks, the root stack is also the parent stack.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working
     *        with Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withParentId(String parentId) {
        setParentId(parentId);
        return this;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack to
     * which the nested stack ultimately belongs.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param rootId
     *        For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack
     *        to which the nested stack ultimately belongs.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working
     *        with Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public void setRootId(String rootId) {
        this.rootId = rootId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack to
     * which the nested stack ultimately belongs.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @return For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack
     *         to which the nested stack ultimately belongs.</p>
     *         <p>
     *         For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working
     *         with Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public String getRootId() {
        return this.rootId;
    }

    /**
     * <p>
     * For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack to
     * which the nested stack ultimately belongs.
     * </p>
     * <p>
     * For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working with
     * Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param rootId
     *        For nested stacks--stacks created as resources for another stack--the stack ID of the the top-level stack
     *        to which the nested stack ultimately belongs.</p>
     *        <p>
     *        For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-nested-stacks.html">Working
     *        with Nested Stacks</a> in the <i>AWS CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withRootId(String rootId) {
        setRootId(rootId);
        return this;
    }

    /**
     * <p>
     * Information on whether a stack's actual configuration differs, or has <i>drifted</i>, from it's expected
     * configuration, as defined in the stack template and any values specified as template parameters. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * 
     * @param driftInformation
     *        Information on whether a stack's actual configuration differs, or has <i>drifted</i>, from it's expected
     *        configuration, as defined in the stack template and any values specified as template parameters. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     *        Unregulated Configuration Changes to Stacks and Resources</a>.
     */

    public void setDriftInformation(StackDriftInformation driftInformation) {
        this.driftInformation = driftInformation;
    }

    /**
     * <p>
     * Information on whether a stack's actual configuration differs, or has <i>drifted</i>, from it's expected
     * configuration, as defined in the stack template and any values specified as template parameters. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * 
     * @return Information on whether a stack's actual configuration differs, or has <i>drifted</i>, from it's expected
     *         configuration, as defined in the stack template and any values specified as template parameters. For more
     *         information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     *         Unregulated Configuration Changes to Stacks and Resources</a>.
     */

    public StackDriftInformation getDriftInformation() {
        return this.driftInformation;
    }

    /**
     * <p>
     * Information on whether a stack's actual configuration differs, or has <i>drifted</i>, from it's expected
     * configuration, as defined in the stack template and any values specified as template parameters. For more
     * information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     * Unregulated Configuration Changes to Stacks and Resources</a>.
     * </p>
     * 
     * @param driftInformation
     *        Information on whether a stack's actual configuration differs, or has <i>drifted</i>, from it's expected
     *        configuration, as defined in the stack template and any values specified as template parameters. For more
     *        information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/using-cfn-stack-drift.html">Detecting
     *        Unregulated Configuration Changes to Stacks and Resources</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Stack withDriftInformation(StackDriftInformation driftInformation) {
        setDriftInformation(driftInformation);
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
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getStackName() != null)
            sb.append("StackName: ").append(getStackName()).append(",");
        if (getChangeSetId() != null)
            sb.append("ChangeSetId: ").append(getChangeSetId()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getParameters() != null)
            sb.append("Parameters: ").append(getParameters()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getDeletionTime() != null)
            sb.append("DeletionTime: ").append(getDeletionTime()).append(",");
        if (getLastUpdatedTime() != null)
            sb.append("LastUpdatedTime: ").append(getLastUpdatedTime()).append(",");
        if (getRollbackConfiguration() != null)
            sb.append("RollbackConfiguration: ").append(getRollbackConfiguration()).append(",");
        if (getStackStatus() != null)
            sb.append("StackStatus: ").append(getStackStatus()).append(",");
        if (getStackStatusReason() != null)
            sb.append("StackStatusReason: ").append(getStackStatusReason()).append(",");
        if (getDisableRollback() != null)
            sb.append("DisableRollback: ").append(getDisableRollback()).append(",");
        if (getNotificationARNs() != null)
            sb.append("NotificationARNs: ").append(getNotificationARNs()).append(",");
        if (getTimeoutInMinutes() != null)
            sb.append("TimeoutInMinutes: ").append(getTimeoutInMinutes()).append(",");
        if (getCapabilities() != null)
            sb.append("Capabilities: ").append(getCapabilities()).append(",");
        if (getOutputs() != null)
            sb.append("Outputs: ").append(getOutputs()).append(",");
        if (getRoleARN() != null)
            sb.append("RoleARN: ").append(getRoleARN()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getEnableTerminationProtection() != null)
            sb.append("EnableTerminationProtection: ").append(getEnableTerminationProtection()).append(",");
        if (getParentId() != null)
            sb.append("ParentId: ").append(getParentId()).append(",");
        if (getRootId() != null)
            sb.append("RootId: ").append(getRootId()).append(",");
        if (getDriftInformation() != null)
            sb.append("DriftInformation: ").append(getDriftInformation());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Stack == false)
            return false;
        Stack other = (Stack) obj;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getStackName() == null ^ this.getStackName() == null)
            return false;
        if (other.getStackName() != null && other.getStackName().equals(this.getStackName()) == false)
            return false;
        if (other.getChangeSetId() == null ^ this.getChangeSetId() == null)
            return false;
        if (other.getChangeSetId() != null && other.getChangeSetId().equals(this.getChangeSetId()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getParameters() == null ^ this.getParameters() == null)
            return false;
        if (other.getParameters() != null && other.getParameters().equals(this.getParameters()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getDeletionTime() == null ^ this.getDeletionTime() == null)
            return false;
        if (other.getDeletionTime() != null && other.getDeletionTime().equals(this.getDeletionTime()) == false)
            return false;
        if (other.getLastUpdatedTime() == null ^ this.getLastUpdatedTime() == null)
            return false;
        if (other.getLastUpdatedTime() != null && other.getLastUpdatedTime().equals(this.getLastUpdatedTime()) == false)
            return false;
        if (other.getRollbackConfiguration() == null ^ this.getRollbackConfiguration() == null)
            return false;
        if (other.getRollbackConfiguration() != null && other.getRollbackConfiguration().equals(this.getRollbackConfiguration()) == false)
            return false;
        if (other.getStackStatus() == null ^ this.getStackStatus() == null)
            return false;
        if (other.getStackStatus() != null && other.getStackStatus().equals(this.getStackStatus()) == false)
            return false;
        if (other.getStackStatusReason() == null ^ this.getStackStatusReason() == null)
            return false;
        if (other.getStackStatusReason() != null && other.getStackStatusReason().equals(this.getStackStatusReason()) == false)
            return false;
        if (other.getDisableRollback() == null ^ this.getDisableRollback() == null)
            return false;
        if (other.getDisableRollback() != null && other.getDisableRollback().equals(this.getDisableRollback()) == false)
            return false;
        if (other.getNotificationARNs() == null ^ this.getNotificationARNs() == null)
            return false;
        if (other.getNotificationARNs() != null && other.getNotificationARNs().equals(this.getNotificationARNs()) == false)
            return false;
        if (other.getTimeoutInMinutes() == null ^ this.getTimeoutInMinutes() == null)
            return false;
        if (other.getTimeoutInMinutes() != null && other.getTimeoutInMinutes().equals(this.getTimeoutInMinutes()) == false)
            return false;
        if (other.getCapabilities() == null ^ this.getCapabilities() == null)
            return false;
        if (other.getCapabilities() != null && other.getCapabilities().equals(this.getCapabilities()) == false)
            return false;
        if (other.getOutputs() == null ^ this.getOutputs() == null)
            return false;
        if (other.getOutputs() != null && other.getOutputs().equals(this.getOutputs()) == false)
            return false;
        if (other.getRoleARN() == null ^ this.getRoleARN() == null)
            return false;
        if (other.getRoleARN() != null && other.getRoleARN().equals(this.getRoleARN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getEnableTerminationProtection() == null ^ this.getEnableTerminationProtection() == null)
            return false;
        if (other.getEnableTerminationProtection() != null && other.getEnableTerminationProtection().equals(this.getEnableTerminationProtection()) == false)
            return false;
        if (other.getParentId() == null ^ this.getParentId() == null)
            return false;
        if (other.getParentId() != null && other.getParentId().equals(this.getParentId()) == false)
            return false;
        if (other.getRootId() == null ^ this.getRootId() == null)
            return false;
        if (other.getRootId() != null && other.getRootId().equals(this.getRootId()) == false)
            return false;
        if (other.getDriftInformation() == null ^ this.getDriftInformation() == null)
            return false;
        if (other.getDriftInformation() != null && other.getDriftInformation().equals(this.getDriftInformation()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getStackName() == null) ? 0 : getStackName().hashCode());
        hashCode = prime * hashCode + ((getChangeSetId() == null) ? 0 : getChangeSetId().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getParameters() == null) ? 0 : getParameters().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getDeletionTime() == null) ? 0 : getDeletionTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedTime() == null) ? 0 : getLastUpdatedTime().hashCode());
        hashCode = prime * hashCode + ((getRollbackConfiguration() == null) ? 0 : getRollbackConfiguration().hashCode());
        hashCode = prime * hashCode + ((getStackStatus() == null) ? 0 : getStackStatus().hashCode());
        hashCode = prime * hashCode + ((getStackStatusReason() == null) ? 0 : getStackStatusReason().hashCode());
        hashCode = prime * hashCode + ((getDisableRollback() == null) ? 0 : getDisableRollback().hashCode());
        hashCode = prime * hashCode + ((getNotificationARNs() == null) ? 0 : getNotificationARNs().hashCode());
        hashCode = prime * hashCode + ((getTimeoutInMinutes() == null) ? 0 : getTimeoutInMinutes().hashCode());
        hashCode = prime * hashCode + ((getCapabilities() == null) ? 0 : getCapabilities().hashCode());
        hashCode = prime * hashCode + ((getOutputs() == null) ? 0 : getOutputs().hashCode());
        hashCode = prime * hashCode + ((getRoleARN() == null) ? 0 : getRoleARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getEnableTerminationProtection() == null) ? 0 : getEnableTerminationProtection().hashCode());
        hashCode = prime * hashCode + ((getParentId() == null) ? 0 : getParentId().hashCode());
        hashCode = prime * hashCode + ((getRootId() == null) ? 0 : getRootId().hashCode());
        hashCode = prime * hashCode + ((getDriftInformation() == null) ? 0 : getDriftInformation().hashCode());
        return hashCode;
    }

    @Override
    public Stack clone() {
        try {
            return (Stack) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
