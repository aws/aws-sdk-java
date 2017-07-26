/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Structure that contains the results of the account gate function AWS CloudFormation StackSets invokes, if present,
 * before proceeding with stack set operations in an account.
 * </p>
 * <p>
 * Account gating enables you to specify a Lamdba function for an account that encapsulates any requirements that must
 * be met before AWS CloudFormation StackSets proceeds with stack set operations in that account. CloudFormation invokes
 * the function each time stack set operations are initiated for that account, and only proceeds if the function returns
 * a success code.
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
     * <code>SUCCEEDED</code>: The account gate function has determined that the account passes any requirements for
     * stack set operations to occur. AWS CloudFormation proceeds with stack operations in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The account gate function has determined that the account does not meet the requirements for
     * stack set operations to occur. AWS CloudFormation cancels the stack set operations in that account, and the stack
     * set operation status is set to FAILED.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>: An account gate function has not been specified for the account, or the
     * AWSCloudFormationStackSetExecutionRole of the stack set adminstration account lacks permissions to invoke the
     * function. AWS CloudFormation proceeds with stack set operations in the account.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The reason for the account gate status assigned to this account.
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
     * <code>SUCCEEDED</code>: The account gate function has determined that the account passes any requirements for
     * stack set operations to occur. AWS CloudFormation proceeds with stack operations in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The account gate function has determined that the account does not meet the requirements for
     * stack set operations to occur. AWS CloudFormation cancels the stack set operations in that account, and the stack
     * set operation status is set to FAILED.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>: An account gate function has not been specified for the account, or the
     * AWSCloudFormationStackSetExecutionRole of the stack set adminstration account lacks permissions to invoke the
     * function. AWS CloudFormation proceeds with stack set operations in the account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the account gate function.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The account gate function has determined that the account passes any requirements
     *        for stack set operations to occur. AWS CloudFormation proceeds with stack operations in the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The account gate function has determined that the account does not meet the
     *        requirements for stack set operations to occur. AWS CloudFormation cancels the stack set operations in
     *        that account, and the stack set operation status is set to FAILED.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>: An account gate function has not been specified for the account, or the
     *        AWSCloudFormationStackSetExecutionRole of the stack set adminstration account lacks permissions to invoke
     *        the function. AWS CloudFormation proceeds with stack set operations in the account.
     *        </p>
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
     * <code>SUCCEEDED</code>: The account gate function has determined that the account passes any requirements for
     * stack set operations to occur. AWS CloudFormation proceeds with stack operations in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The account gate function has determined that the account does not meet the requirements for
     * stack set operations to occur. AWS CloudFormation cancels the stack set operations in that account, and the stack
     * set operation status is set to FAILED.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>: An account gate function has not been specified for the account, or the
     * AWSCloudFormationStackSetExecutionRole of the stack set adminstration account lacks permissions to invoke the
     * function. AWS CloudFormation proceeds with stack set operations in the account.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the account gate function.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code>: The account gate function has determined that the account passes any requirements
     *         for stack set operations to occur. AWS CloudFormation proceeds with stack operations in the account.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The account gate function has determined that the account does not meet the
     *         requirements for stack set operations to occur. AWS CloudFormation cancels the stack set operations in
     *         that account, and the stack set operation status is set to FAILED.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SKIPPED</code>: An account gate function has not been specified for the account, or the
     *         AWSCloudFormationStackSetExecutionRole of the stack set adminstration account lacks permissions to invoke
     *         the function. AWS CloudFormation proceeds with stack set operations in the account.
     *         </p>
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
     * <code>SUCCEEDED</code>: The account gate function has determined that the account passes any requirements for
     * stack set operations to occur. AWS CloudFormation proceeds with stack operations in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The account gate function has determined that the account does not meet the requirements for
     * stack set operations to occur. AWS CloudFormation cancels the stack set operations in that account, and the stack
     * set operation status is set to FAILED.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>: An account gate function has not been specified for the account, or the
     * AWSCloudFormationStackSetExecutionRole of the stack set adminstration account lacks permissions to invoke the
     * function. AWS CloudFormation proceeds with stack set operations in the account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the account gate function.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The account gate function has determined that the account passes any requirements
     *        for stack set operations to occur. AWS CloudFormation proceeds with stack operations in the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The account gate function has determined that the account does not meet the
     *        requirements for stack set operations to occur. AWS CloudFormation cancels the stack set operations in
     *        that account, and the stack set operation status is set to FAILED.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>: An account gate function has not been specified for the account, or the
     *        AWSCloudFormationStackSetExecutionRole of the stack set adminstration account lacks permissions to invoke
     *        the function. AWS CloudFormation proceeds with stack set operations in the account.
     *        </p>
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
     * <code>SUCCEEDED</code>: The account gate function has determined that the account passes any requirements for
     * stack set operations to occur. AWS CloudFormation proceeds with stack operations in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The account gate function has determined that the account does not meet the requirements for
     * stack set operations to occur. AWS CloudFormation cancels the stack set operations in that account, and the stack
     * set operation status is set to FAILED.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>: An account gate function has not been specified for the account, or the
     * AWSCloudFormationStackSetExecutionRole of the stack set adminstration account lacks permissions to invoke the
     * function. AWS CloudFormation proceeds with stack set operations in the account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the account gate function.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The account gate function has determined that the account passes any requirements
     *        for stack set operations to occur. AWS CloudFormation proceeds with stack operations in the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The account gate function has determined that the account does not meet the
     *        requirements for stack set operations to occur. AWS CloudFormation cancels the stack set operations in
     *        that account, and the stack set operation status is set to FAILED.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>: An account gate function has not been specified for the account, or the
     *        AWSCloudFormationStackSetExecutionRole of the stack set adminstration account lacks permissions to invoke
     *        the function. AWS CloudFormation proceeds with stack set operations in the account.
     *        </p>
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
     * <code>SUCCEEDED</code>: The account gate function has determined that the account passes any requirements for
     * stack set operations to occur. AWS CloudFormation proceeds with stack operations in the account.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The account gate function has determined that the account does not meet the requirements for
     * stack set operations to occur. AWS CloudFormation cancels the stack set operations in that account, and the stack
     * set operation status is set to FAILED.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>: An account gate function has not been specified for the account, or the
     * AWSCloudFormationStackSetExecutionRole of the stack set adminstration account lacks permissions to invoke the
     * function. AWS CloudFormation proceeds with stack set operations in the account.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the account gate function.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The account gate function has determined that the account passes any requirements
     *        for stack set operations to occur. AWS CloudFormation proceeds with stack operations in the account.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The account gate function has determined that the account does not meet the
     *        requirements for stack set operations to occur. AWS CloudFormation cancels the stack set operations in
     *        that account, and the stack set operation status is set to FAILED.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>: An account gate function has not been specified for the account, or the
     *        AWSCloudFormationStackSetExecutionRole of the stack set adminstration account lacks permissions to invoke
     *        the function. AWS CloudFormation proceeds with stack set operations in the account.
     *        </p>
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
     * The reason for the account gate status assigned to this account.
     * </p>
     * 
     * @param statusReason
     *        The reason for the account gate status assigned to this account.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the account gate status assigned to this account.
     * </p>
     * 
     * @return The reason for the account gate status assigned to this account.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the account gate status assigned to this account.
     * </p>
     * 
     * @param statusReason
     *        The reason for the account gate status assigned to this account.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AccountGateResult withStatusReason(String statusReason) {
        setStatusReason(statusReason);
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
