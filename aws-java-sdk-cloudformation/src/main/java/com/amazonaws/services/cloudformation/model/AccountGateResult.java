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
 * Structure that contains the results of the account gate function which AWS CloudFormation invokes, if present, before
 * proceeding with a stack set operation in an account and region.
 * </p>
 * <p>
 * For each account and region, AWS CloudFormation lets you specify a Lamdba function that encapsulates any requirements
 * that must be met before CloudFormation can proceed with a stack set operation in that account and region.
 * CloudFormation invokes the function each time a stack set operation is requested for that account and region; if the
 * function returns <code>FAILED</code>, CloudFormation cancels the operation in that account and region, and sets the
 * stack set operation result status for that account and region to <code>FAILED</code>.
 * </p>
 * <p>
 * For more information, see <a
 * href="https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-account-gating.html">Configuring a
 * target account gate</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/AccountGateResult" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AccountGateResult implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the account gate function.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The account gate function has determined that the account and region passes any
     * requirements for a stack set operation to occur. AWS CloudFormation proceeds with the stack operation in that
     * account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The account gate function has determined that the account and region does not meet the
     * requirements for a stack set operation to occur. AWS CloudFormation cancels the stack set operation in that
     * account and region, and sets the stack set operation result status for that account and region to
     * <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>: AWS CloudFormation has skipped calling the account gate function for this account and
     * region, for one of the following reasons:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An account gate function has not been specified for the account and region. AWS CloudFormation proceeds with the
     * stack set operation in this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>AWSCloudFormationStackSetExecutionRole</code> of the stack set adminstration account lacks permissions
     * to invoke the function. AWS CloudFormation proceeds with the stack set operation in this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * Either no action is necessary, or no action is possible, on the stack. AWS CloudFormation skips the stack set
     * operation in this account and region.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The reason for the account gate status assigned to this account and region for the stack set operation.
     * </p>
     */
    private String statusReason;

    /**
     * <p>
     * The status of the account gate function.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The account gate function has determined that the account and region passes any
     * requirements for a stack set operation to occur. AWS CloudFormation proceeds with the stack operation in that
     * account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The account gate function has determined that the account and region does not meet the
     * requirements for a stack set operation to occur. AWS CloudFormation cancels the stack set operation in that
     * account and region, and sets the stack set operation result status for that account and region to
     * <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>: AWS CloudFormation has skipped calling the account gate function for this account and
     * region, for one of the following reasons:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An account gate function has not been specified for the account and region. AWS CloudFormation proceeds with the
     * stack set operation in this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>AWSCloudFormationStackSetExecutionRole</code> of the stack set adminstration account lacks permissions
     * to invoke the function. AWS CloudFormation proceeds with the stack set operation in this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * Either no action is necessary, or no action is possible, on the stack. AWS CloudFormation skips the stack set
     * operation in this account and region.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the account gate function.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The account gate function has determined that the account and region passes any
     *        requirements for a stack set operation to occur. AWS CloudFormation proceeds with the stack operation in
     *        that account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The account gate function has determined that the account and region does not meet
     *        the requirements for a stack set operation to occur. AWS CloudFormation cancels the stack set operation in
     *        that account and region, and sets the stack set operation result status for that account and region to
     *        <code>FAILED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>: AWS CloudFormation has skipped calling the account gate function for this account
     *        and region, for one of the following reasons:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An account gate function has not been specified for the account and region. AWS CloudFormation proceeds
     *        with the stack set operation in this account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>AWSCloudFormationStackSetExecutionRole</code> of the stack set adminstration account lacks
     *        permissions to invoke the function. AWS CloudFormation proceeds with the stack set operation in this
     *        account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Either no action is necessary, or no action is possible, on the stack. AWS CloudFormation skips the stack
     *        set operation in this account and region.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see AccountGateStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the account gate function.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The account gate function has determined that the account and region passes any
     * requirements for a stack set operation to occur. AWS CloudFormation proceeds with the stack operation in that
     * account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The account gate function has determined that the account and region does not meet the
     * requirements for a stack set operation to occur. AWS CloudFormation cancels the stack set operation in that
     * account and region, and sets the stack set operation result status for that account and region to
     * <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>: AWS CloudFormation has skipped calling the account gate function for this account and
     * region, for one of the following reasons:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An account gate function has not been specified for the account and region. AWS CloudFormation proceeds with the
     * stack set operation in this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>AWSCloudFormationStackSetExecutionRole</code> of the stack set adminstration account lacks permissions
     * to invoke the function. AWS CloudFormation proceeds with the stack set operation in this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * Either no action is necessary, or no action is possible, on the stack. AWS CloudFormation skips the stack set
     * operation in this account and region.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The status of the account gate function.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code>: The account gate function has determined that the account and region passes any
     *         requirements for a stack set operation to occur. AWS CloudFormation proceeds with the stack operation in
     *         that account and region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The account gate function has determined that the account and region does not meet
     *         the requirements for a stack set operation to occur. AWS CloudFormation cancels the stack set operation
     *         in that account and region, and sets the stack set operation result status for that account and region to
     *         <code>FAILED</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SKIPPED</code>: AWS CloudFormation has skipped calling the account gate function for this account
     *         and region, for one of the following reasons:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         An account gate function has not been specified for the account and region. AWS CloudFormation proceeds
     *         with the stack set operation in this account and region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         The <code>AWSCloudFormationStackSetExecutionRole</code> of the stack set adminstration account lacks
     *         permissions to invoke the function. AWS CloudFormation proceeds with the stack set operation in this
     *         account and region.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Either no action is necessary, or no action is possible, on the stack. AWS CloudFormation skips the stack
     *         set operation in this account and region.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see AccountGateStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the account gate function.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The account gate function has determined that the account and region passes any
     * requirements for a stack set operation to occur. AWS CloudFormation proceeds with the stack operation in that
     * account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The account gate function has determined that the account and region does not meet the
     * requirements for a stack set operation to occur. AWS CloudFormation cancels the stack set operation in that
     * account and region, and sets the stack set operation result status for that account and region to
     * <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>: AWS CloudFormation has skipped calling the account gate function for this account and
     * region, for one of the following reasons:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An account gate function has not been specified for the account and region. AWS CloudFormation proceeds with the
     * stack set operation in this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>AWSCloudFormationStackSetExecutionRole</code> of the stack set adminstration account lacks permissions
     * to invoke the function. AWS CloudFormation proceeds with the stack set operation in this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * Either no action is necessary, or no action is possible, on the stack. AWS CloudFormation skips the stack set
     * operation in this account and region.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the account gate function.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The account gate function has determined that the account and region passes any
     *        requirements for a stack set operation to occur. AWS CloudFormation proceeds with the stack operation in
     *        that account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The account gate function has determined that the account and region does not meet
     *        the requirements for a stack set operation to occur. AWS CloudFormation cancels the stack set operation in
     *        that account and region, and sets the stack set operation result status for that account and region to
     *        <code>FAILED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>: AWS CloudFormation has skipped calling the account gate function for this account
     *        and region, for one of the following reasons:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An account gate function has not been specified for the account and region. AWS CloudFormation proceeds
     *        with the stack set operation in this account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>AWSCloudFormationStackSetExecutionRole</code> of the stack set adminstration account lacks
     *        permissions to invoke the function. AWS CloudFormation proceeds with the stack set operation in this
     *        account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Either no action is necessary, or no action is possible, on the stack. AWS CloudFormation skips the stack
     *        set operation in this account and region.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountGateStatus
     */

    public AccountGateResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the account gate function.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The account gate function has determined that the account and region passes any
     * requirements for a stack set operation to occur. AWS CloudFormation proceeds with the stack operation in that
     * account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The account gate function has determined that the account and region does not meet the
     * requirements for a stack set operation to occur. AWS CloudFormation cancels the stack set operation in that
     * account and region, and sets the stack set operation result status for that account and region to
     * <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>: AWS CloudFormation has skipped calling the account gate function for this account and
     * region, for one of the following reasons:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An account gate function has not been specified for the account and region. AWS CloudFormation proceeds with the
     * stack set operation in this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>AWSCloudFormationStackSetExecutionRole</code> of the stack set adminstration account lacks permissions
     * to invoke the function. AWS CloudFormation proceeds with the stack set operation in this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * Either no action is necessary, or no action is possible, on the stack. AWS CloudFormation skips the stack set
     * operation in this account and region.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the account gate function.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The account gate function has determined that the account and region passes any
     *        requirements for a stack set operation to occur. AWS CloudFormation proceeds with the stack operation in
     *        that account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The account gate function has determined that the account and region does not meet
     *        the requirements for a stack set operation to occur. AWS CloudFormation cancels the stack set operation in
     *        that account and region, and sets the stack set operation result status for that account and region to
     *        <code>FAILED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>: AWS CloudFormation has skipped calling the account gate function for this account
     *        and region, for one of the following reasons:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An account gate function has not been specified for the account and region. AWS CloudFormation proceeds
     *        with the stack set operation in this account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>AWSCloudFormationStackSetExecutionRole</code> of the stack set adminstration account lacks
     *        permissions to invoke the function. AWS CloudFormation proceeds with the stack set operation in this
     *        account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Either no action is necessary, or no action is possible, on the stack. AWS CloudFormation skips the stack
     *        set operation in this account and region.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see AccountGateStatus
     */

    public void setStatus(AccountGateStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The status of the account gate function.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The account gate function has determined that the account and region passes any
     * requirements for a stack set operation to occur. AWS CloudFormation proceeds with the stack operation in that
     * account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The account gate function has determined that the account and region does not meet the
     * requirements for a stack set operation to occur. AWS CloudFormation cancels the stack set operation in that
     * account and region, and sets the stack set operation result status for that account and region to
     * <code>FAILED</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>: AWS CloudFormation has skipped calling the account gate function for this account and
     * region, for one of the following reasons:
     * </p>
     * <ul>
     * <li>
     * <p>
     * An account gate function has not been specified for the account and region. AWS CloudFormation proceeds with the
     * stack set operation in this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * The <code>AWSCloudFormationStackSetExecutionRole</code> of the stack set adminstration account lacks permissions
     * to invoke the function. AWS CloudFormation proceeds with the stack set operation in this account and region.
     * </p>
     * </li>
     * <li>
     * <p>
     * Either no action is necessary, or no action is possible, on the stack. AWS CloudFormation skips the stack set
     * operation in this account and region.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the account gate function.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The account gate function has determined that the account and region passes any
     *        requirements for a stack set operation to occur. AWS CloudFormation proceeds with the stack operation in
     *        that account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The account gate function has determined that the account and region does not meet
     *        the requirements for a stack set operation to occur. AWS CloudFormation cancels the stack set operation in
     *        that account and region, and sets the stack set operation result status for that account and region to
     *        <code>FAILED</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>: AWS CloudFormation has skipped calling the account gate function for this account
     *        and region, for one of the following reasons:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        An account gate function has not been specified for the account and region. AWS CloudFormation proceeds
     *        with the stack set operation in this account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        The <code>AWSCloudFormationStackSetExecutionRole</code> of the stack set adminstration account lacks
     *        permissions to invoke the function. AWS CloudFormation proceeds with the stack set operation in this
     *        account and region.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Either no action is necessary, or no action is possible, on the stack. AWS CloudFormation skips the stack
     *        set operation in this account and region.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AccountGateStatus
     */

    public AccountGateResult withStatus(AccountGateStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the account gate status assigned to this account and region for the stack set operation.
     * </p>
     * 
     * @param statusReason
     *        The reason for the account gate status assigned to this account and region for the stack set operation.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the account gate status assigned to this account and region for the stack set operation.
     * </p>
     * 
     * @return The reason for the account gate status assigned to this account and region for the stack set operation.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the account gate status assigned to this account and region for the stack set operation.
     * </p>
     * 
     * @param statusReason
     *        The reason for the account gate status assigned to this account and region for the stack set operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountGateResult withStatusReason(String statusReason) {
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

        if (obj instanceof AccountGateResult == false)
            return false;
        AccountGateResult other = (AccountGateResult) obj;
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

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public AccountGateResult clone() {
        try {
            return (AccountGateResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
