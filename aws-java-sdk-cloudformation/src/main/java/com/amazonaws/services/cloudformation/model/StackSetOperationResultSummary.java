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
 * The structure that contains information about a specified operation's results for a given account in a given region.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackSetOperationResultSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackSetOperationResultSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the AWS account for this operation result.
     * </p>
     */
    private String account;
    /**
     * <p>
     * The name of the AWS region for this operation result.
     * </p>
     */
    private String region;
    /**
     * <p>
     * The result status of the stack set operation for the given account in the given region.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and region has been cancelled. This is either
     * because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation
     * has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and region failed.
     * </p>
     * <p>
     * If the stack set operation fails in enough accounts within a region, the failure tolerance for the stack set
     * operation as a whole might be exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and region is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and region has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and region completed successfully.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The reason for the assigned result status.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * The results of the account gate function AWS CloudFormation invokes, if present, before proceeding with stack set
     * operations in an account
     * </p>
     */
    private AccountGateResult accountGateResult;

    /**
     * <p>
     * The name of the AWS account for this operation result.
     * </p>
     * 
     * @param account
     *        The name of the AWS account for this operation result.
     */

    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * <p>
     * The name of the AWS account for this operation result.
     * </p>
     * 
     * @return The name of the AWS account for this operation result.
     */

    public String getAccount() {
        return this.account;
    }

    /**
     * <p>
     * The name of the AWS account for this operation result.
     * </p>
     * 
     * @param account
     *        The name of the AWS account for this operation result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperationResultSummary withAccount(String account) {
        setAccount(account);
        return this;
    }

    /**
     * <p>
     * The name of the AWS region for this operation result.
     * </p>
     * 
     * @param region
     *        The name of the AWS region for this operation result.
     */

    public void setRegion(String region) {
        this.region = region;
    }

    /**
     * <p>
     * The name of the AWS region for this operation result.
     * </p>
     * 
     * @return The name of the AWS region for this operation result.
     */

    public String getRegion() {
        return this.region;
    }

    /**
     * <p>
     * The name of the AWS region for this operation result.
     * </p>
     * 
     * @param region
     *        The name of the AWS region for this operation result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperationResultSummary withRegion(String region) {
        setRegion(region);
        return this;
    }

    /**
     * <p>
     * The result status of the stack set operation for the given account in the given region.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and region has been cancelled. This is either
     * because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation
     * has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and region failed.
     * </p>
     * <p>
     * If the stack set operation fails in enough accounts within a region, the failure tolerance for the stack set
     * operation as a whole might be exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and region is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and region has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and region completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The result status of the stack set operation for the given account in the given region.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code>: The operation in the specified account and region has been cancelled. This is
     *        either because a user has stopped the stack set operation, or because the failure tolerance of the stack
     *        set operation has been exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The operation in the specified account and region failed.
     *        </p>
     *        <p>
     *        If the stack set operation fails in enough accounts within a region, the failure tolerance for the stack
     *        set operation as a whole might be exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>: The operation in the specified account and region is currently in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: The operation in the specified account and region has yet to start.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The operation in the specified account and region completed successfully.
     *        </p>
     *        </li>
     * @see StackSetOperationResultStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The result status of the stack set operation for the given account in the given region.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and region has been cancelled. This is either
     * because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation
     * has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and region failed.
     * </p>
     * <p>
     * If the stack set operation fails in enough accounts within a region, the failure tolerance for the stack set
     * operation as a whole might be exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and region is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and region has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and region completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The result status of the stack set operation for the given account in the given region.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CANCELLED</code>: The operation in the specified account and region has been cancelled. This is
     *         either because a user has stopped the stack set operation, or because the failure tolerance of the stack
     *         set operation has been exceeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The operation in the specified account and region failed.
     *         </p>
     *         <p>
     *         If the stack set operation fails in enough accounts within a region, the failure tolerance for the stack
     *         set operation as a whole might be exceeded.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RUNNING</code>: The operation in the specified account and region is currently in progress.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code>: The operation in the specified account and region has yet to start.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code>: The operation in the specified account and region completed successfully.
     *         </p>
     *         </li>
     * @see StackSetOperationResultStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The result status of the stack set operation for the given account in the given region.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and region has been cancelled. This is either
     * because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation
     * has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and region failed.
     * </p>
     * <p>
     * If the stack set operation fails in enough accounts within a region, the failure tolerance for the stack set
     * operation as a whole might be exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and region is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and region has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and region completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The result status of the stack set operation for the given account in the given region.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code>: The operation in the specified account and region has been cancelled. This is
     *        either because a user has stopped the stack set operation, or because the failure tolerance of the stack
     *        set operation has been exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The operation in the specified account and region failed.
     *        </p>
     *        <p>
     *        If the stack set operation fails in enough accounts within a region, the failure tolerance for the stack
     *        set operation as a whole might be exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>: The operation in the specified account and region is currently in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: The operation in the specified account and region has yet to start.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The operation in the specified account and region completed successfully.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetOperationResultStatus
     */

    public StackSetOperationResultSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The result status of the stack set operation for the given account in the given region.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and region has been cancelled. This is either
     * because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation
     * has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and region failed.
     * </p>
     * <p>
     * If the stack set operation fails in enough accounts within a region, the failure tolerance for the stack set
     * operation as a whole might be exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and region is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and region has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and region completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The result status of the stack set operation for the given account in the given region.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code>: The operation in the specified account and region has been cancelled. This is
     *        either because a user has stopped the stack set operation, or because the failure tolerance of the stack
     *        set operation has been exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The operation in the specified account and region failed.
     *        </p>
     *        <p>
     *        If the stack set operation fails in enough accounts within a region, the failure tolerance for the stack
     *        set operation as a whole might be exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>: The operation in the specified account and region is currently in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: The operation in the specified account and region has yet to start.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The operation in the specified account and region completed successfully.
     *        </p>
     *        </li>
     * @see StackSetOperationResultStatus
     */

    public void setStatus(StackSetOperationResultStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The result status of the stack set operation for the given account in the given region.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CANCELLED</code>: The operation in the specified account and region has been cancelled. This is either
     * because a user has stopped the stack set operation, or because the failure tolerance of the stack set operation
     * has been exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation in the specified account and region failed.
     * </p>
     * <p>
     * If the stack set operation fails in enough accounts within a region, the failure tolerance for the stack set
     * operation as a whole might be exceeded.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation in the specified account and region is currently in progress.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code>: The operation in the specified account and region has yet to start.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation in the specified account and region completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The result status of the stack set operation for the given account in the given region.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CANCELLED</code>: The operation in the specified account and region has been cancelled. This is
     *        either because a user has stopped the stack set operation, or because the failure tolerance of the stack
     *        set operation has been exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The operation in the specified account and region failed.
     *        </p>
     *        <p>
     *        If the stack set operation fails in enough accounts within a region, the failure tolerance for the stack
     *        set operation as a whole might be exceeded.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>: The operation in the specified account and region is currently in progress.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code>: The operation in the specified account and region has yet to start.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The operation in the specified account and region completed successfully.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetOperationResultStatus
     */

    public StackSetOperationResultSummary withStatus(StackSetOperationResultStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The reason for the assigned result status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the assigned result status.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * The reason for the assigned result status.
     * </p>
     * 
     * @return The reason for the assigned result status.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * The reason for the assigned result status.
     * </p>
     * 
     * @param statusReason
     *        The reason for the assigned result status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperationResultSummary withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * The results of the account gate function AWS CloudFormation invokes, if present, before proceeding with stack set
     * operations in an account
     * </p>
     * 
     * @param accountGateResult
     *        The results of the account gate function AWS CloudFormation invokes, if present, before proceeding with
     *        stack set operations in an account
     */

    public void setAccountGateResult(AccountGateResult accountGateResult) {
        this.accountGateResult = accountGateResult;
    }

    /**
     * <p>
     * The results of the account gate function AWS CloudFormation invokes, if present, before proceeding with stack set
     * operations in an account
     * </p>
     * 
     * @return The results of the account gate function AWS CloudFormation invokes, if present, before proceeding with
     *         stack set operations in an account
     */

    public AccountGateResult getAccountGateResult() {
        return this.accountGateResult;
    }

    /**
     * <p>
     * The results of the account gate function AWS CloudFormation invokes, if present, before proceeding with stack set
     * operations in an account
     * </p>
     * 
     * @param accountGateResult
     *        The results of the account gate function AWS CloudFormation invokes, if present, before proceeding with
     *        stack set operations in an account
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperationResultSummary withAccountGateResult(AccountGateResult accountGateResult) {
        setAccountGateResult(accountGateResult);
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
        if (getAccount() != null)
            sb.append("Account: ").append(getAccount()).append(",");
        if (getRegion() != null)
            sb.append("Region: ").append(getRegion()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getAccountGateResult() != null)
            sb.append("AccountGateResult: ").append(getAccountGateResult());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSetOperationResultSummary == false)
            return false;
        StackSetOperationResultSummary other = (StackSetOperationResultSummary) obj;
        if (other.getAccount() == null ^ this.getAccount() == null)
            return false;
        if (other.getAccount() != null && other.getAccount().equals(this.getAccount()) == false)
            return false;
        if (other.getRegion() == null ^ this.getRegion() == null)
            return false;
        if (other.getRegion() != null && other.getRegion().equals(this.getRegion()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getAccountGateResult() == null ^ this.getAccountGateResult() == null)
            return false;
        if (other.getAccountGateResult() != null && other.getAccountGateResult().equals(this.getAccountGateResult()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccount() == null) ? 0 : getAccount().hashCode());
        hashCode = prime * hashCode + ((getRegion() == null) ? 0 : getRegion().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getAccountGateResult() == null) ? 0 : getAccountGateResult().hashCode());
        return hashCode;
    }

    @Override
    public StackSetOperationResultSummary clone() {
        try {
            return (StackSetOperationResultSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
