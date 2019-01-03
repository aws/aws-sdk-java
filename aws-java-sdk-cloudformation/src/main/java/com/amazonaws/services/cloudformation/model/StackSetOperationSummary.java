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
 * The structures that contain summary information about the specified operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackSetOperationSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackSetOperationSummary implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the stack set operation.
     * </p>
     */
    private String operationId;
    /**
     * <p>
     * The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     * operations affect only the specified stack instances that are associated with the specified stack set. Update
     * operations affect both the stack set itself as well as <i>all</i> associated stack set instances.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The overall status of the operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation exceeded the specified failure tolerance. The failure tolerance value that
     * you've set for an operation is applied for each region during stack create and update operations. If the number
     * of failed stacks within a region exceeds the failure tolerance, the status of the operation in the region is set
     * to <code>FAILED</code>. This in turn sets the status of the operation as a whole to <code>FAILED</code>, and AWS
     * CloudFormation cancels the operation in any remaining regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation is currently being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: The operation is in the process of stopping, at user request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation completed creating or updating all the specified stacks without exceeding
     * the failure tolerance for the operation.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The time at which the operation was initiated. Note that the creation times for the stack set operation might
     * differ from the creation time of the individual stacks themselves. This is because AWS CloudFormation needs to
     * perform preparatory work for the operation, such as dispatching the work to the requested regions, before
     * actually creating the first stacks.
     * </p>
     */
    private java.util.Date creationTimestamp;
    /**
     * <p>
     * The time at which the stack set operation ended, across all accounts and regions specified. Note that this
     * doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account or
     * region.
     * </p>
     */
    private java.util.Date endTimestamp;

    /**
     * <p>
     * The unique ID of the stack set operation.
     * </p>
     * 
     * @param operationId
     *        The unique ID of the stack set operation.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The unique ID of the stack set operation.
     * </p>
     * 
     * @return The unique ID of the stack set operation.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * The unique ID of the stack set operation.
     * </p>
     * 
     * @param operationId
     *        The unique ID of the stack set operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperationSummary withOperationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * <p>
     * The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     * operations affect only the specified stack instances that are associated with the specified stack set. Update
     * operations affect both the stack set itself as well as <i>all</i> associated stack set instances.
     * </p>
     * 
     * @param action
     *        The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     *        operations affect only the specified stack instances that are associated with the specified stack set.
     *        Update operations affect both the stack set itself as well as <i>all</i> associated stack set instances.
     * @see StackSetOperationAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     * operations affect only the specified stack instances that are associated with the specified stack set. Update
     * operations affect both the stack set itself as well as <i>all</i> associated stack set instances.
     * </p>
     * 
     * @return The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and
     *         delete operations affect only the specified stack instances that are associated with the specified stack
     *         set. Update operations affect both the stack set itself as well as <i>all</i> associated stack set
     *         instances.
     * @see StackSetOperationAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     * operations affect only the specified stack instances that are associated with the specified stack set. Update
     * operations affect both the stack set itself as well as <i>all</i> associated stack set instances.
     * </p>
     * 
     * @param action
     *        The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     *        operations affect only the specified stack instances that are associated with the specified stack set.
     *        Update operations affect both the stack set itself as well as <i>all</i> associated stack set instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetOperationAction
     */

    public StackSetOperationSummary withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     * operations affect only the specified stack instances that are associated with the specified stack set. Update
     * operations affect both the stack set itself as well as <i>all</i> associated stack set instances.
     * </p>
     * 
     * @param action
     *        The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     *        operations affect only the specified stack instances that are associated with the specified stack set.
     *        Update operations affect both the stack set itself as well as <i>all</i> associated stack set instances.
     * @see StackSetOperationAction
     */

    public void setAction(StackSetOperationAction action) {
        withAction(action);
    }

    /**
     * <p>
     * The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     * operations affect only the specified stack instances that are associated with the specified stack set. Update
     * operations affect both the stack set itself as well as <i>all</i> associated stack set instances.
     * </p>
     * 
     * @param action
     *        The type of operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and delete
     *        operations affect only the specified stack instances that are associated with the specified stack set.
     *        Update operations affect both the stack set itself as well as <i>all</i> associated stack set instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetOperationAction
     */

    public StackSetOperationSummary withAction(StackSetOperationAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The overall status of the operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation exceeded the specified failure tolerance. The failure tolerance value that
     * you've set for an operation is applied for each region during stack create and update operations. If the number
     * of failed stacks within a region exceeds the failure tolerance, the status of the operation in the region is set
     * to <code>FAILED</code>. This in turn sets the status of the operation as a whole to <code>FAILED</code>, and AWS
     * CloudFormation cancels the operation in any remaining regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation is currently being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: The operation is in the process of stopping, at user request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation completed creating or updating all the specified stacks without exceeding
     * the failure tolerance for the operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The overall status of the operation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The operation exceeded the specified failure tolerance. The failure tolerance value
     *        that you've set for an operation is applied for each region during stack create and update operations. If
     *        the number of failed stacks within a region exceeds the failure tolerance, the status of the operation in
     *        the region is set to <code>FAILED</code>. This in turn sets the status of the operation as a whole to
     *        <code>FAILED</code>, and AWS CloudFormation cancels the operation in any remaining regions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>: The operation is currently being performed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>: The user has cancelled the operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPING</code>: The operation is in the process of stopping, at user request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The operation completed creating or updating all the specified stacks without
     *        exceeding the failure tolerance for the operation.
     *        </p>
     *        </li>
     * @see StackSetOperationStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The overall status of the operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation exceeded the specified failure tolerance. The failure tolerance value that
     * you've set for an operation is applied for each region during stack create and update operations. If the number
     * of failed stacks within a region exceeds the failure tolerance, the status of the operation in the region is set
     * to <code>FAILED</code>. This in turn sets the status of the operation as a whole to <code>FAILED</code>, and AWS
     * CloudFormation cancels the operation in any remaining regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation is currently being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: The operation is in the process of stopping, at user request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation completed creating or updating all the specified stacks without exceeding
     * the failure tolerance for the operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The overall status of the operation.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>FAILED</code>: The operation exceeded the specified failure tolerance. The failure tolerance value
     *         that you've set for an operation is applied for each region during stack create and update operations. If
     *         the number of failed stacks within a region exceeds the failure tolerance, the status of the operation in
     *         the region is set to <code>FAILED</code>. This in turn sets the status of the operation as a whole to
     *         <code>FAILED</code>, and AWS CloudFormation cancels the operation in any remaining regions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RUNNING</code>: The operation is currently being performed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPED</code>: The user has cancelled the operation.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPING</code>: The operation is in the process of stopping, at user request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SUCCEEDED</code>: The operation completed creating or updating all the specified stacks without
     *         exceeding the failure tolerance for the operation.
     *         </p>
     *         </li>
     * @see StackSetOperationStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The overall status of the operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation exceeded the specified failure tolerance. The failure tolerance value that
     * you've set for an operation is applied for each region during stack create and update operations. If the number
     * of failed stacks within a region exceeds the failure tolerance, the status of the operation in the region is set
     * to <code>FAILED</code>. This in turn sets the status of the operation as a whole to <code>FAILED</code>, and AWS
     * CloudFormation cancels the operation in any remaining regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation is currently being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: The operation is in the process of stopping, at user request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation completed creating or updating all the specified stacks without exceeding
     * the failure tolerance for the operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The overall status of the operation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The operation exceeded the specified failure tolerance. The failure tolerance value
     *        that you've set for an operation is applied for each region during stack create and update operations. If
     *        the number of failed stacks within a region exceeds the failure tolerance, the status of the operation in
     *        the region is set to <code>FAILED</code>. This in turn sets the status of the operation as a whole to
     *        <code>FAILED</code>, and AWS CloudFormation cancels the operation in any remaining regions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>: The operation is currently being performed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>: The user has cancelled the operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPING</code>: The operation is in the process of stopping, at user request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The operation completed creating or updating all the specified stacks without
     *        exceeding the failure tolerance for the operation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetOperationStatus
     */

    public StackSetOperationSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The overall status of the operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation exceeded the specified failure tolerance. The failure tolerance value that
     * you've set for an operation is applied for each region during stack create and update operations. If the number
     * of failed stacks within a region exceeds the failure tolerance, the status of the operation in the region is set
     * to <code>FAILED</code>. This in turn sets the status of the operation as a whole to <code>FAILED</code>, and AWS
     * CloudFormation cancels the operation in any remaining regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation is currently being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: The operation is in the process of stopping, at user request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation completed creating or updating all the specified stacks without exceeding
     * the failure tolerance for the operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The overall status of the operation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The operation exceeded the specified failure tolerance. The failure tolerance value
     *        that you've set for an operation is applied for each region during stack create and update operations. If
     *        the number of failed stacks within a region exceeds the failure tolerance, the status of the operation in
     *        the region is set to <code>FAILED</code>. This in turn sets the status of the operation as a whole to
     *        <code>FAILED</code>, and AWS CloudFormation cancels the operation in any remaining regions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>: The operation is currently being performed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>: The user has cancelled the operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPING</code>: The operation is in the process of stopping, at user request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The operation completed creating or updating all the specified stacks without
     *        exceeding the failure tolerance for the operation.
     *        </p>
     *        </li>
     * @see StackSetOperationStatus
     */

    public void setStatus(StackSetOperationStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The overall status of the operation.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>FAILED</code>: The operation exceeded the specified failure tolerance. The failure tolerance value that
     * you've set for an operation is applied for each region during stack create and update operations. If the number
     * of failed stacks within a region exceeds the failure tolerance, the status of the operation in the region is set
     * to <code>FAILED</code>. This in turn sets the status of the operation as a whole to <code>FAILED</code>, and AWS
     * CloudFormation cancels the operation in any remaining regions.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code>: The operation is currently being performed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code>: The user has cancelled the operation.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code>: The operation is in the process of stopping, at user request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SUCCEEDED</code>: The operation completed creating or updating all the specified stacks without exceeding
     * the failure tolerance for the operation.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The overall status of the operation.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>FAILED</code>: The operation exceeded the specified failure tolerance. The failure tolerance value
     *        that you've set for an operation is applied for each region during stack create and update operations. If
     *        the number of failed stacks within a region exceeds the failure tolerance, the status of the operation in
     *        the region is set to <code>FAILED</code>. This in turn sets the status of the operation as a whole to
     *        <code>FAILED</code>, and AWS CloudFormation cancels the operation in any remaining regions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code>: The operation is currently being performed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code>: The user has cancelled the operation.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPING</code>: The operation is in the process of stopping, at user request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SUCCEEDED</code>: The operation completed creating or updating all the specified stacks without
     *        exceeding the failure tolerance for the operation.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetOperationStatus
     */

    public StackSetOperationSummary withStatus(StackSetOperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The time at which the operation was initiated. Note that the creation times for the stack set operation might
     * differ from the creation time of the individual stacks themselves. This is because AWS CloudFormation needs to
     * perform preparatory work for the operation, such as dispatching the work to the requested regions, before
     * actually creating the first stacks.
     * </p>
     * 
     * @param creationTimestamp
     *        The time at which the operation was initiated. Note that the creation times for the stack set operation
     *        might differ from the creation time of the individual stacks themselves. This is because AWS
     *        CloudFormation needs to perform preparatory work for the operation, such as dispatching the work to the
     *        requested regions, before actually creating the first stacks.
     */

    public void setCreationTimestamp(java.util.Date creationTimestamp) {
        this.creationTimestamp = creationTimestamp;
    }

    /**
     * <p>
     * The time at which the operation was initiated. Note that the creation times for the stack set operation might
     * differ from the creation time of the individual stacks themselves. This is because AWS CloudFormation needs to
     * perform preparatory work for the operation, such as dispatching the work to the requested regions, before
     * actually creating the first stacks.
     * </p>
     * 
     * @return The time at which the operation was initiated. Note that the creation times for the stack set operation
     *         might differ from the creation time of the individual stacks themselves. This is because AWS
     *         CloudFormation needs to perform preparatory work for the operation, such as dispatching the work to the
     *         requested regions, before actually creating the first stacks.
     */

    public java.util.Date getCreationTimestamp() {
        return this.creationTimestamp;
    }

    /**
     * <p>
     * The time at which the operation was initiated. Note that the creation times for the stack set operation might
     * differ from the creation time of the individual stacks themselves. This is because AWS CloudFormation needs to
     * perform preparatory work for the operation, such as dispatching the work to the requested regions, before
     * actually creating the first stacks.
     * </p>
     * 
     * @param creationTimestamp
     *        The time at which the operation was initiated. Note that the creation times for the stack set operation
     *        might differ from the creation time of the individual stacks themselves. This is because AWS
     *        CloudFormation needs to perform preparatory work for the operation, such as dispatching the work to the
     *        requested regions, before actually creating the first stacks.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperationSummary withCreationTimestamp(java.util.Date creationTimestamp) {
        setCreationTimestamp(creationTimestamp);
        return this;
    }

    /**
     * <p>
     * The time at which the stack set operation ended, across all accounts and regions specified. Note that this
     * doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account or
     * region.
     * </p>
     * 
     * @param endTimestamp
     *        The time at which the stack set operation ended, across all accounts and regions specified. Note that this
     *        doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account
     *        or region.
     */

    public void setEndTimestamp(java.util.Date endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    /**
     * <p>
     * The time at which the stack set operation ended, across all accounts and regions specified. Note that this
     * doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account or
     * region.
     * </p>
     * 
     * @return The time at which the stack set operation ended, across all accounts and regions specified. Note that
     *         this doesn't necessarily mean that the stack set operation was successful, or even attempted, in each
     *         account or region.
     */

    public java.util.Date getEndTimestamp() {
        return this.endTimestamp;
    }

    /**
     * <p>
     * The time at which the stack set operation ended, across all accounts and regions specified. Note that this
     * doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account or
     * region.
     * </p>
     * 
     * @param endTimestamp
     *        The time at which the stack set operation ended, across all accounts and regions specified. Note that this
     *        doesn't necessarily mean that the stack set operation was successful, or even attempted, in each account
     *        or region.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperationSummary withEndTimestamp(java.util.Date endTimestamp) {
        setEndTimestamp(endTimestamp);
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
        if (getOperationId() != null)
            sb.append("OperationId: ").append(getOperationId()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getCreationTimestamp() != null)
            sb.append("CreationTimestamp: ").append(getCreationTimestamp()).append(",");
        if (getEndTimestamp() != null)
            sb.append("EndTimestamp: ").append(getEndTimestamp());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StackSetOperationSummary == false)
            return false;
        StackSetOperationSummary other = (StackSetOperationSummary) obj;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getCreationTimestamp() == null ^ this.getCreationTimestamp() == null)
            return false;
        if (other.getCreationTimestamp() != null && other.getCreationTimestamp().equals(this.getCreationTimestamp()) == false)
            return false;
        if (other.getEndTimestamp() == null ^ this.getEndTimestamp() == null)
            return false;
        if (other.getEndTimestamp() != null && other.getEndTimestamp().equals(this.getEndTimestamp()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOperationId() == null) ? 0 : getOperationId().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public StackSetOperationSummary clone() {
        try {
            return (StackSetOperationSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
