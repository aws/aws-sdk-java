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
 * An AWS CloudFormation stack, in a specific account and region, that's part of a stack set operation. A stack instance
 * is a reference to an attempted or actual stack in a given account within a given region. A stack instance can exist
 * without a stack—for example, if the stack couldn't be created for some reason. A stack instance is associated with
 * only one stack set. Each stack instance contains the ID of its associated stack set, as well as the ID of the actual
 * stack and the stack status.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackInstance implements Serializable, Cloneable {

    /**
     * <p>
     * The name or unique ID of the stack set that the stack instance is associated with.
     * </p>
     */
    private String stackSetId;
    /**
     * <p>
     * The name of the AWS region that the stack instance is associated with.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The name of the AWS account that the stack instance is associated with.
     * </p>
     */
    private String account;
    /**
     * <p>
     * The ID of the stack instance.
     * </p>
     */
    private String stackId;
    /**
     * <p>
     * A list of parameters from the stack set template whose values have been overridden in this stack instance.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Parameter> parameterOverrides;
    /**
     * <p>
     * The status of the stack instance, in terms of its synchronization with its associated stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     * unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You might
     * need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     * <code>true</code>, to delete the stack instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the stack set because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The associated stack failed during a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The stack was part of a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation that failed or was
     * stopped before the stack was created or updated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CURRENT</code>: The stack is currently up to date with the stack set.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The explanation for the specific status code that is assigned to this stack instance.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The name or unique ID of the stack set that the stack instance is associated with.
     * </p>
     * 
     * @param stackSetId
     *        The name or unique ID of the stack set that the stack instance is associated with.
     */

    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that the stack instance is associated with.
     * </p>
     * 
     * @return The name or unique ID of the stack set that the stack instance is associated with.
     */

    public String getStackSetId() {
        return this.stackSetId;
    }

    /**
     * <p>
     * The name or unique ID of the stack set that the stack instance is associated with.
     * </p>
     * 
     * @param stackSetId
     *        The name or unique ID of the stack set that the stack instance is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstance withStackSetId(String stackSetId) {
        setStackSetId(stackSetId);
        return this;
    }

    /**
     * <p>
     * The name of the AWS region that the stack instance is associated with.
     * </p>
     * 
     * @param region
     *        The name of the AWS region that the stack instance is associated with.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The name of the AWS region that the stack instance is associated with.
     * </p>
     * 
     * @return The name of the AWS region that the stack instance is associated with.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The name of the AWS region that the stack instance is associated with.
     * </p>
     * 
     * @param region
     *        The name of the AWS region that the stack instance is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstance withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The name of the AWS account that the stack instance is associated with.
     * </p>
     * 
     * @param account
     *        The name of the AWS account that the stack instance is associated with.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The name of the AWS account that the stack instance is associated with.
     * </p>
     * 
     * @return The name of the AWS account that the stack instance is associated with.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The name of the AWS account that the stack instance is associated with.
     * </p>
     * 
     * @param account
     *        The name of the AWS account that the stack instance is associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstance withAccount(String account) {
        setAccount(account);
        return this;
    }

    /**
     * <p>
     * The ID of the stack instance.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack instance.
     */

    public void setStackId(String stackId) {
        this.stackId = stackId;
    }

    /**
     * <p>
     * The ID of the stack instance.
     * </p>
     * 
     * @return The ID of the stack instance.
     */

    public String getStackId() {
        return this.stackId;
    }

    /**
     * <p>
     * The ID of the stack instance.
     * </p>
     * 
     * @param stackId
     *        The ID of the stack instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstance withStackId(String stackId) {
        setStackId(stackId);
        return this;
    }

    /**
     * <p>
     * A list of parameters from the stack set template whose values have been overridden in this stack instance.
     * </p>
     * 
     * @return A list of parameters from the stack set template whose values have been overridden in this stack
     *         instance.
     */

    public java.util.List<Parameter> getParameterOverrides() {
        if (parameterOverrides == null) {
            parameterOverrides = new com.amazonaws.internal.SdkInternalList<Parameter>();
        }
        return parameterOverrides;
    }

    /**
     * <p>
     * A list of parameters from the stack set template whose values have been overridden in this stack instance.
     * </p>
     * 
     * @param parameterOverrides
     *        A list of parameters from the stack set template whose values have been overridden in this stack instance.
     */

    public void setParameterOverrides(java.util.Collection<Parameter> parameterOverrides) {
        if (parameterOverrides == null) {
            this.parameterOverrides = null;
            return;
        }

        this.parameterOverrides = new com.amazonaws.internal.SdkInternalList<Parameter>(parameterOverrides);
    }

    /**
     * <p>
     * A list of parameters from the stack set template whose values have been overridden in this stack instance.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setParameterOverrides(java.util.Collection)} or {@link #withParameterOverrides(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param parameterOverrides
     *        A list of parameters from the stack set template whose values have been overridden in this stack instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstance withParameterOverrides(Parameter... parameterOverrides) {
        if (this.parameterOverrides == null) {
            setParameterOverrides(new com.amazonaws.internal.SdkInternalList<Parameter>(parameterOverrides.length));
        }
        for (Parameter ele : parameterOverrides) {
            this.parameterOverrides.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of parameters from the stack set template whose values have been overridden in this stack instance.
     * </p>
     * 
     * @param parameterOverrides
     *        A list of parameters from the stack set template whose values have been overridden in this stack instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstance withParameterOverrides(java.util.Collection<Parameter> parameterOverrides) {
        setParameterOverrides(parameterOverrides);
        return this;
    }

    /**
     * <p>
     * The status of the stack instance, in terms of its synchronization with its associated stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     * unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You might
     * need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     * <code>true</code>, to delete the stack instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the stack set because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The associated stack failed during a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The stack was part of a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation that failed or was
     * stopped before the stack was created or updated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CURRENT</code>: The stack is currently up to date with the stack set.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the stack instance, in terms of its synchronization with its associated stack set.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     *        unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You
     *        might need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     *        <code>true</code>, to delete the stack instance, and then delete the stack manually.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUTDATED</code>: The stack isn't currently up to date with the stack set because:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The associated stack failed during a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The stack was part of a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation that failed
     *        or was stopped before the stack was created or updated.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CURRENT</code>: The stack is currently up to date with the stack set.
     *        </p>
     *        </li>
     * @see StackInstanceStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the stack instance, in terms of its synchronization with its associated stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     * unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You might
     * need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     * <code>true</code>, to delete the stack instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the stack set because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The associated stack failed during a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The stack was part of a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation that failed or was
     * stopped before the stack was created or updated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CURRENT</code>: The stack is currently up to date with the stack set.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the stack instance, in terms of its synchronization with its associated stack set.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in
     *         an unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations.
     *         You might need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code>
     *         set to <code>true</code>, to delete the stack instance, and then delete the stack manually.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>OUTDATED</code>: The stack isn't currently up to date with the stack set because:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         The associated stack failed during a <code>CreateStackSet</code> or <code>UpdateStackSet</code>
     *         operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The stack was part of a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation that failed
     *         or was stopped before the stack was created or updated.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CURRENT</code>: The stack is currently up to date with the stack set.
     *         </p>
     *         </li>
     * @see StackInstanceStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the stack instance, in terms of its synchronization with its associated stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     * unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You might
     * need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     * <code>true</code>, to delete the stack instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the stack set because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The associated stack failed during a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The stack was part of a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation that failed or was
     * stopped before the stack was created or updated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CURRENT</code>: The stack is currently up to date with the stack set.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the stack instance, in terms of its synchronization with its associated stack set.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     *        unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You
     *        might need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     *        <code>true</code>, to delete the stack instance, and then delete the stack manually.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUTDATED</code>: The stack isn't currently up to date with the stack set because:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The associated stack failed during a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The stack was part of a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation that failed
     *        or was stopped before the stack was created or updated.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CURRENT</code>: The stack is currently up to date with the stack set.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackInstanceStatus
     */

    public StackInstance withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the stack instance, in terms of its synchronization with its associated stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     * unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You might
     * need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     * <code>true</code>, to delete the stack instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the stack set because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The associated stack failed during a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The stack was part of a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation that failed or was
     * stopped before the stack was created or updated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CURRENT</code>: The stack is currently up to date with the stack set.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the stack instance, in terms of its synchronization with its associated stack set.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     *        unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You
     *        might need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     *        <code>true</code>, to delete the stack instance, and then delete the stack manually.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUTDATED</code>: The stack isn't currently up to date with the stack set because:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The associated stack failed during a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The stack was part of a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation that failed
     *        or was stopped before the stack was created or updated.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CURRENT</code>: The stack is currently up to date with the stack set.
     *        </p>
     *        </li>
     * @see StackInstanceStatus
     */

    public void setStatus(StackInstanceStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the stack instance, in terms of its synchronization with its associated stack set.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     * unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You might
     * need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     * <code>true</code>, to delete the stack instance, and then delete the stack manually.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>OUTDATED</code>: The stack isn't currently up to date with the stack set because:
     * </p>
     * <ul>
     * <li>
     * <p>
     * The associated stack failed during a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * The stack was part of a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation that failed or was
     * stopped before the stack was created or updated.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * <code>CURRENT</code>: The stack is currently up to date with the stack set.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the stack instance, in terms of its synchronization with its associated stack set.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>INOPERABLE</code>: A <code>DeleteStackInstances</code> operation has failed and left the stack in an
     *        unstable state. Stacks in this state are excluded from further <code>UpdateStackSet</code> operations. You
     *        might need to perform a <code>DeleteStackInstances</code> operation, with <code>RetainStacks</code> set to
     *        <code>true</code>, to delete the stack instance, and then delete the stack manually.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>OUTDATED</code>: The stack isn't currently up to date with the stack set because:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        The associated stack failed during a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The stack was part of a <code>CreateStackSet</code> or <code>UpdateStackSet</code> operation that failed
     *        or was stopped before the stack was created or updated.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CURRENT</code>: The stack is currently up to date with the stack set.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackInstanceStatus
     */

    public StackInstance withStatus(StackInstanceStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The explanation for the specific status code that is assigned to this stack instance.
     * </p>
     * 
     * @param statusReason
     *        The explanation for the specific status code that is assigned to this stack instance.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The explanation for the specific status code that is assigned to this stack instance.
     * </p>
     * 
     * @return The explanation for the specific status code that is assigned to this stack instance.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The explanation for the specific status code that is assigned to this stack instance.
     * </p>
     * 
     * @param statusReason
     *        The explanation for the specific status code that is assigned to this stack instance.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackInstance withStatusReason(String statusReason) {
        setStatusReason(statusReason);
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
        if (getStackSetId() != null)
            sb.append("StackSetId: ").append(getStackSetId()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount()).append(",");
        if (getStackId() != null)
            sb.append("StackId: ").append(getStackId()).append(",");
        if (getParameterOverrides() != null)
            sb.append("ParameterOverrides: ").append(getParameterOverrides()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackInstance == false)
            return false;
        StackInstance other = (StackInstance) obj;
        if (other.getStackSetId() == null ^ this.getStackSetId() == null)
            return false;
        if (other.getStackSetId() != null && other.getStackSetId().equals(this.getStackSetId()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getStackId() == null ^ this.getStackId() == null)
            return false;
        if (other.getStackId() != null && other.getStackId().equals(this.getStackId()) == false)
            return false;
        if (other.getParameterOverrides() == null ^ this.getParameterOverrides() == null)
            return false;
        if (other.getParameterOverrides() != null && other.getParameterOverrides().equals(this.getParameterOverrides()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStackSetId() == null) ? 0 : getStackSetId().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getStackId() == null) ? 0 : getStackId().hashCode());
        hashCode = prime * hashCode + ((getParameterOverrides() == null) ? 0 : getParameterOverrides().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public StackInstance clone() {
        try {
            return (StackInstance) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
