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
 * The structure that contains information about a stack set operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/cloudformation-2010-05-15/StackSetOperation" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StackSetOperation implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of a stack set operation.
     * </p>
     */
    private String operationId;
    /**
     * <p>
     * The ID of the stack set.
     * </p>
     */
    private String stackSetId;
    /**
     * <p>
     * The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and
     * delete operations affect only the specified stack set instances that are associated with the specified stack set.
     * Update operations affect both the stack set itself, as well as <i>all</i> associated stack set instances.
     * </p>
     */
    private String action;
    /**
     * <p>
     * The status of the operation.
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
     * The preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     */
    private StackSetOperationPreferences operationPreferences;
    /**
     * <p>
     * For stack set operations of action type <code>DELETE</code>, specifies whether to remove the stack instances from
     * the specified stack set, but doesn't delete the stacks. You can't reassociate a retained stack, or add an
     * existing, saved stack to a new stack set.
     * </p>
     */
    private Boolean retainStacks;
    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role used to perform this stack set operation.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can manage specific stack sets within the
     * same administrator account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Define Permissions
     * for Multiple Administrators</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     */
    private String administrationRoleARN;
    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and groups can include in their stack sets.
     * </p>
     */
    private String executionRoleName;
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
     * The unique ID of a stack set operation.
     * </p>
     * 
     * @param operationId
     *        The unique ID of a stack set operation.
     */

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    /**
     * <p>
     * The unique ID of a stack set operation.
     * </p>
     * 
     * @return The unique ID of a stack set operation.
     */

    public String getOperationId() {
        return this.operationId;
    }

    /**
     * <p>
     * The unique ID of a stack set operation.
     * </p>
     * 
     * @param operationId
     *        The unique ID of a stack set operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperation withOperationId(String operationId) {
        setOperationId(operationId);
        return this;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * 
     * @param stackSetId
     *        The ID of the stack set.
     */

    public void setStackSetId(String stackSetId) {
        this.stackSetId = stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * 
     * @return The ID of the stack set.
     */

    public String getStackSetId() {
        return this.stackSetId;
    }

    /**
     * <p>
     * The ID of the stack set.
     * </p>
     * 
     * @param stackSetId
     *        The ID of the stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperation withStackSetId(String stackSetId) {
        setStackSetId(stackSetId);
        return this;
    }

    /**
     * <p>
     * The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and
     * delete operations affect only the specified stack set instances that are associated with the specified stack set.
     * Update operations affect both the stack set itself, as well as <i>all</i> associated stack set instances.
     * </p>
     * 
     * @param action
     *        The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create
     *        and delete operations affect only the specified stack set instances that are associated with the specified
     *        stack set. Update operations affect both the stack set itself, as well as <i>all</i> associated stack set
     *        instances.
     * @see StackSetOperationAction
     */

    public void setAction(String action) {
        this.action = action;
    }

    /**
     * <p>
     * The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and
     * delete operations affect only the specified stack set instances that are associated with the specified stack set.
     * Update operations affect both the stack set itself, as well as <i>all</i> associated stack set instances.
     * </p>
     * 
     * @return The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create
     *         and delete operations affect only the specified stack set instances that are associated with the
     *         specified stack set. Update operations affect both the stack set itself, as well as <i>all</i> associated
     *         stack set instances.
     * @see StackSetOperationAction
     */

    public String getAction() {
        return this.action;
    }

    /**
     * <p>
     * The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and
     * delete operations affect only the specified stack set instances that are associated with the specified stack set.
     * Update operations affect both the stack set itself, as well as <i>all</i> associated stack set instances.
     * </p>
     * 
     * @param action
     *        The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create
     *        and delete operations affect only the specified stack set instances that are associated with the specified
     *        stack set. Update operations affect both the stack set itself, as well as <i>all</i> associated stack set
     *        instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetOperationAction
     */

    public StackSetOperation withAction(String action) {
        setAction(action);
        return this;
    }

    /**
     * <p>
     * The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and
     * delete operations affect only the specified stack set instances that are associated with the specified stack set.
     * Update operations affect both the stack set itself, as well as <i>all</i> associated stack set instances.
     * </p>
     * 
     * @param action
     *        The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create
     *        and delete operations affect only the specified stack set instances that are associated with the specified
     *        stack set. Update operations affect both the stack set itself, as well as <i>all</i> associated stack set
     *        instances.
     * @see StackSetOperationAction
     */

    public void setAction(StackSetOperationAction action) {
        withAction(action);
    }

    /**
     * <p>
     * The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create and
     * delete operations affect only the specified stack set instances that are associated with the specified stack set.
     * Update operations affect both the stack set itself, as well as <i>all</i> associated stack set instances.
     * </p>
     * 
     * @param action
     *        The type of stack set operation: <code>CREATE</code>, <code>UPDATE</code>, or <code>DELETE</code>. Create
     *        and delete operations affect only the specified stack set instances that are associated with the specified
     *        stack set. Update operations affect both the stack set itself, as well as <i>all</i> associated stack set
     *        instances.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StackSetOperationAction
     */

    public StackSetOperation withAction(StackSetOperationAction action) {
        this.action = action.toString();
        return this;
    }

    /**
     * <p>
     * The status of the operation.
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
     *        The status of the operation. </p>
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
     * The status of the operation.
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
     * @return The status of the operation. </p>
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
     * The status of the operation.
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
     *        The status of the operation. </p>
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

    public StackSetOperation withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the operation.
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
     *        The status of the operation. </p>
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
     * The status of the operation.
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
     *        The status of the operation. </p>
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

    public StackSetOperation withStatus(StackSetOperationStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     * 
     * @param operationPreferences
     *        The preferences for how AWS CloudFormation performs this stack set operation.
     */

    public void setOperationPreferences(StackSetOperationPreferences operationPreferences) {
        this.operationPreferences = operationPreferences;
    }

    /**
     * <p>
     * The preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     * 
     * @return The preferences for how AWS CloudFormation performs this stack set operation.
     */

    public StackSetOperationPreferences getOperationPreferences() {
        return this.operationPreferences;
    }

    /**
     * <p>
     * The preferences for how AWS CloudFormation performs this stack set operation.
     * </p>
     * 
     * @param operationPreferences
     *        The preferences for how AWS CloudFormation performs this stack set operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperation withOperationPreferences(StackSetOperationPreferences operationPreferences) {
        setOperationPreferences(operationPreferences);
        return this;
    }

    /**
     * <p>
     * For stack set operations of action type <code>DELETE</code>, specifies whether to remove the stack instances from
     * the specified stack set, but doesn't delete the stacks. You can't reassociate a retained stack, or add an
     * existing, saved stack to a new stack set.
     * </p>
     * 
     * @param retainStacks
     *        For stack set operations of action type <code>DELETE</code>, specifies whether to remove the stack
     *        instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a retained
     *        stack, or add an existing, saved stack to a new stack set.
     */

    public void setRetainStacks(Boolean retainStacks) {
        this.retainStacks = retainStacks;
    }

    /**
     * <p>
     * For stack set operations of action type <code>DELETE</code>, specifies whether to remove the stack instances from
     * the specified stack set, but doesn't delete the stacks. You can't reassociate a retained stack, or add an
     * existing, saved stack to a new stack set.
     * </p>
     * 
     * @return For stack set operations of action type <code>DELETE</code>, specifies whether to remove the stack
     *         instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a retained
     *         stack, or add an existing, saved stack to a new stack set.
     */

    public Boolean getRetainStacks() {
        return this.retainStacks;
    }

    /**
     * <p>
     * For stack set operations of action type <code>DELETE</code>, specifies whether to remove the stack instances from
     * the specified stack set, but doesn't delete the stacks. You can't reassociate a retained stack, or add an
     * existing, saved stack to a new stack set.
     * </p>
     * 
     * @param retainStacks
     *        For stack set operations of action type <code>DELETE</code>, specifies whether to remove the stack
     *        instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a retained
     *        stack, or add an existing, saved stack to a new stack set.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperation withRetainStacks(Boolean retainStacks) {
        setRetainStacks(retainStacks);
        return this;
    }

    /**
     * <p>
     * For stack set operations of action type <code>DELETE</code>, specifies whether to remove the stack instances from
     * the specified stack set, but doesn't delete the stacks. You can't reassociate a retained stack, or add an
     * existing, saved stack to a new stack set.
     * </p>
     * 
     * @return For stack set operations of action type <code>DELETE</code>, specifies whether to remove the stack
     *         instances from the specified stack set, but doesn't delete the stacks. You can't reassociate a retained
     *         stack, or add an existing, saved stack to a new stack set.
     */

    public Boolean isRetainStacks() {
        return this.retainStacks;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role used to perform this stack set operation.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can manage specific stack sets within the
     * same administrator account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Define Permissions
     * for Multiple Administrators</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param administrationRoleARN
     *        The Amazon Resource Number (ARN) of the IAM role used to perform this stack set operation. </p>
     *        <p>
     *        Use customized administrator roles to control which users or groups can manage specific stack sets within
     *        the same administrator account. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Define
     *        Permissions for Multiple Administrators</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public void setAdministrationRoleARN(String administrationRoleARN) {
        this.administrationRoleARN = administrationRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role used to perform this stack set operation.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can manage specific stack sets within the
     * same administrator account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Define Permissions
     * for Multiple Administrators</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @return The Amazon Resource Number (ARN) of the IAM role used to perform this stack set operation. </p>
     *         <p>
     *         Use customized administrator roles to control which users or groups can manage specific stack sets within
     *         the same administrator account. For more information, see <a
     *         href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Define
     *         Permissions for Multiple Administrators</a> in the <i>AWS CloudFormation User Guide</i>.
     */

    public String getAdministrationRoleARN() {
        return this.administrationRoleARN;
    }

    /**
     * <p>
     * The Amazon Resource Number (ARN) of the IAM role used to perform this stack set operation.
     * </p>
     * <p>
     * Use customized administrator roles to control which users or groups can manage specific stack sets within the
     * same administrator account. For more information, see <a
     * href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Define Permissions
     * for Multiple Administrators</a> in the <i>AWS CloudFormation User Guide</i>.
     * </p>
     * 
     * @param administrationRoleARN
     *        The Amazon Resource Number (ARN) of the IAM role used to perform this stack set operation. </p>
     *        <p>
     *        Use customized administrator roles to control which users or groups can manage specific stack sets within
     *        the same administrator account. For more information, see <a
     *        href="http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/stacksets-prereqs.html">Define
     *        Permissions for Multiple Administrators</a> in the <i>AWS CloudFormation User Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperation withAdministrationRoleARN(String administrationRoleARN) {
        setAdministrationRoleARN(administrationRoleARN);
        return this;
    }

    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and groups can include in their stack sets.
     * </p>
     * 
     * @param executionRoleName
     *        The name of the IAM execution role used to create or update the stack set.</p>
     *        <p>
     *        Use customized execution roles to control which stack resources users and groups can include in their
     *        stack sets.
     */

    public void setExecutionRoleName(String executionRoleName) {
        this.executionRoleName = executionRoleName;
    }

    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and groups can include in their stack sets.
     * </p>
     * 
     * @return The name of the IAM execution role used to create or update the stack set.</p>
     *         <p>
     *         Use customized execution roles to control which stack resources users and groups can include in their
     *         stack sets.
     */

    public String getExecutionRoleName() {
        return this.executionRoleName;
    }

    /**
     * <p>
     * The name of the IAM execution role used to create or update the stack set.
     * </p>
     * <p>
     * Use customized execution roles to control which stack resources users and groups can include in their stack sets.
     * </p>
     * 
     * @param executionRoleName
     *        The name of the IAM execution role used to create or update the stack set.</p>
     *        <p>
     *        Use customized execution roles to control which stack resources users and groups can include in their
     *        stack sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StackSetOperation withExecutionRoleName(String executionRoleName) {
        setExecutionRoleName(executionRoleName);
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

    public StackSetOperation withCreationTimestamp(java.util.Date creationTimestamp) {
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

    public StackSetOperation withEndTimestamp(java.util.Date endTimestamp) {
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
        if (getStackSetId() != null)
            sb.append("StackSetId: ").append(getStackSetId()).append(",");
        if (getAction() != null)
            sb.append("Action: ").append(getAction()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getOperationPreferences() != null)
            sb.append("OperationPreferences: ").append(getOperationPreferences()).append(",");
        if (getRetainStacks() != null)
            sb.append("RetainStacks: ").append(getRetainStacks()).append(",");
        if (getAdministrationRoleARN() != null)
            sb.append("AdministrationRoleARN: ").append(getAdministrationRoleARN()).append(",");
        if (getExecutionRoleName() != null)
            sb.append("ExecutionRoleName: ").append(getExecutionRoleName()).append(",");
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

        if (obj instanceof StackSetOperation == false)
            return false;
        StackSetOperation other = (StackSetOperation) obj;
        if (other.getOperationId() == null ^ this.getOperationId() == null)
            return false;
        if (other.getOperationId() != null && other.getOperationId().equals(this.getOperationId()) == false)
            return false;
        if (other.getStackSetId() == null ^ this.getStackSetId() == null)
            return false;
        if (other.getStackSetId() != null && other.getStackSetId().equals(this.getStackSetId()) == false)
            return false;
        if (other.getAction() == null ^ this.getAction() == null)
            return false;
        if (other.getAction() != null && other.getAction().equals(this.getAction()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getOperationPreferences() == null ^ this.getOperationPreferences() == null)
            return false;
        if (other.getOperationPreferences() != null && other.getOperationPreferences().equals(this.getOperationPreferences()) == false)
            return false;
        if (other.getRetainStacks() == null ^ this.getRetainStacks() == null)
            return false;
        if (other.getRetainStacks() != null && other.getRetainStacks().equals(this.getRetainStacks()) == false)
            return false;
        if (other.getAdministrationRoleARN() == null ^ this.getAdministrationRoleARN() == null)
            return false;
        if (other.getAdministrationRoleARN() != null && other.getAdministrationRoleARN().equals(this.getAdministrationRoleARN()) == false)
            return false;
        if (other.getExecutionRoleName() == null ^ this.getExecutionRoleName() == null)
            return false;
        if (other.getExecutionRoleName() != null && other.getExecutionRoleName().equals(this.getExecutionRoleName()) == false)
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
        hashCode = prime * hashCode + ((getStackSetId() == null) ? 0 : getStackSetId().hashCode());
        hashCode = prime * hashCode + ((getAction() == null) ? 0 : getAction().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getOperationPreferences() == null) ? 0 : getOperationPreferences().hashCode());
        hashCode = prime * hashCode + ((getRetainStacks() == null) ? 0 : getRetainStacks().hashCode());
        hashCode = prime * hashCode + ((getAdministrationRoleARN() == null) ? 0 : getAdministrationRoleARN().hashCode());
        hashCode = prime * hashCode + ((getExecutionRoleName() == null) ? 0 : getExecutionRoleName().hashCode());
        hashCode = prime * hashCode + ((getCreationTimestamp() == null) ? 0 : getCreationTimestamp().hashCode());
        hashCode = prime * hashCode + ((getEndTimestamp() == null) ? 0 : getEndTimestamp().hashCode());
        return hashCode;
    }

    @Override
    public StackSetOperation clone() {
        try {
            return (StackSetOperation) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
