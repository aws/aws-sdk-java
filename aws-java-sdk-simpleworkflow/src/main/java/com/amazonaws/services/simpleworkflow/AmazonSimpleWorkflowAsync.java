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
package com.amazonaws.services.simpleworkflow;

import javax.annotation.Generated;

import com.amazonaws.services.simpleworkflow.model.*;

/**
 * Interface for accessing Amazon SWF asynchronously. Each asynchronous method will return a Java Future object
 * representing the asynchronous operation; overloads which accept an {@code AsyncHandler} can be used to receive
 * notification when an asynchronous operation completes.
 * <p>
 * <b>Note:</b> Do not directly implement this interface, new methods are added to it regularly. Extend from
 * {@link com.amazonaws.services.simpleworkflow.AbstractAmazonSimpleWorkflowAsync} instead.
 * </p>
 * <p>
 * <fullname>Amazon Simple Workflow Service</fullname>
 * <p>
 * The Amazon Simple Workflow Service (Amazon SWF) makes it easy to build applications that use Amazon's cloud to
 * coordinate work across distributed components. In Amazon SWF, a <i>task</i> represents a logical unit of work that is
 * performed by a component of your workflow. Coordinating tasks in a workflow involves managing intertask dependencies,
 * scheduling, and concurrency in accordance with the logical flow of the application.
 * </p>
 * <p>
 * Amazon SWF gives you full control over implementing tasks and coordinating them without worrying about underlying
 * complexities such as tracking their progress and maintaining their state.
 * </p>
 * <p>
 * This documentation serves as reference only. For a broader overview of the Amazon SWF programming model, see the <i>
 * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/">Amazon SWF Developer Guide</a> </i>.
 * </p>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public interface AmazonSimpleWorkflowAsync extends AmazonSimpleWorkflow {

    /**
     * <p>
     * Returns the number of closed workflow executions within the given domain that meet the specified filtering
     * criteria.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tagFilter.tag</code>: String constraint. The key is <code>swf:tagFilter.tag</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.name</code>: String constraint. The key is <code>swf:typeFilter.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.version</code>: String constraint. The key is <code>swf:typeFilter.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param countClosedWorkflowExecutionsRequest
     * @return A Java Future containing the result of the CountClosedWorkflowExecutions operation returned by the
     *         service.
     * @sample AmazonSimpleWorkflowAsync.CountClosedWorkflowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/CountClosedWorkflowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<WorkflowExecutionCount> countClosedWorkflowExecutionsAsync(
            CountClosedWorkflowExecutionsRequest countClosedWorkflowExecutionsRequest);

    /**
     * <p>
     * Returns the number of closed workflow executions within the given domain that meet the specified filtering
     * criteria.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tagFilter.tag</code>: String constraint. The key is <code>swf:tagFilter.tag</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.name</code>: String constraint. The key is <code>swf:typeFilter.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.version</code>: String constraint. The key is <code>swf:typeFilter.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param countClosedWorkflowExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CountClosedWorkflowExecutions operation returned by the
     *         service.
     * @sample AmazonSimpleWorkflowAsyncHandler.CountClosedWorkflowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/CountClosedWorkflowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<WorkflowExecutionCount> countClosedWorkflowExecutionsAsync(
            CountClosedWorkflowExecutionsRequest countClosedWorkflowExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<CountClosedWorkflowExecutionsRequest, WorkflowExecutionCount> asyncHandler);

    /**
     * <p>
     * Returns the number of open workflow executions within the given domain that meet the specified filtering
     * criteria.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tagFilter.tag</code>: String constraint. The key is <code>swf:tagFilter.tag</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.name</code>: String constraint. The key is <code>swf:typeFilter.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.version</code>: String constraint. The key is <code>swf:typeFilter.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param countOpenWorkflowExecutionsRequest
     * @return A Java Future containing the result of the CountOpenWorkflowExecutions operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.CountOpenWorkflowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/CountOpenWorkflowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<WorkflowExecutionCount> countOpenWorkflowExecutionsAsync(CountOpenWorkflowExecutionsRequest countOpenWorkflowExecutionsRequest);

    /**
     * <p>
     * Returns the number of open workflow executions within the given domain that meet the specified filtering
     * criteria.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tagFilter.tag</code>: String constraint. The key is <code>swf:tagFilter.tag</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.name</code>: String constraint. The key is <code>swf:typeFilter.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.version</code>: String constraint. The key is <code>swf:typeFilter.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param countOpenWorkflowExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CountOpenWorkflowExecutions operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.CountOpenWorkflowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/CountOpenWorkflowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<WorkflowExecutionCount> countOpenWorkflowExecutionsAsync(CountOpenWorkflowExecutionsRequest countOpenWorkflowExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<CountOpenWorkflowExecutionsRequest, WorkflowExecutionCount> asyncHandler);

    /**
     * <p>
     * Returns the estimated number of activity tasks in the specified task list. The count returned is an approximation
     * and isn't guaranteed to be exact. If you specify a task list that no activity task was ever scheduled in then
     * <code>0</code> is returned.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the <code>taskList.name</code> parameter by using a <code>Condition</code> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only certain task lists.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param countPendingActivityTasksRequest
     * @return A Java Future containing the result of the CountPendingActivityTasks operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.CountPendingActivityTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/CountPendingActivityTasks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PendingTaskCount> countPendingActivityTasksAsync(CountPendingActivityTasksRequest countPendingActivityTasksRequest);

    /**
     * <p>
     * Returns the estimated number of activity tasks in the specified task list. The count returned is an approximation
     * and isn't guaranteed to be exact. If you specify a task list that no activity task was ever scheduled in then
     * <code>0</code> is returned.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the <code>taskList.name</code> parameter by using a <code>Condition</code> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only certain task lists.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param countPendingActivityTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CountPendingActivityTasks operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.CountPendingActivityTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/CountPendingActivityTasks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PendingTaskCount> countPendingActivityTasksAsync(CountPendingActivityTasksRequest countPendingActivityTasksRequest,
            com.amazonaws.handlers.AsyncHandler<CountPendingActivityTasksRequest, PendingTaskCount> asyncHandler);

    /**
     * <p>
     * Returns the estimated number of decision tasks in the specified task list. The count returned is an approximation
     * and isn't guaranteed to be exact. If you specify a task list that no decision task was ever scheduled in then
     * <code>0</code> is returned.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the <code>taskList.name</code> parameter by using a <code>Condition</code> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only certain task lists.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param countPendingDecisionTasksRequest
     * @return A Java Future containing the result of the CountPendingDecisionTasks operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.CountPendingDecisionTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/CountPendingDecisionTasks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PendingTaskCount> countPendingDecisionTasksAsync(CountPendingDecisionTasksRequest countPendingDecisionTasksRequest);

    /**
     * <p>
     * Returns the estimated number of decision tasks in the specified task list. The count returned is an approximation
     * and isn't guaranteed to be exact. If you specify a task list that no decision task was ever scheduled in then
     * <code>0</code> is returned.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the <code>taskList.name</code> parameter by using a <code>Condition</code> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only certain task lists.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param countPendingDecisionTasksRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the CountPendingDecisionTasks operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.CountPendingDecisionTasks
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/CountPendingDecisionTasks" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<PendingTaskCount> countPendingDecisionTasksAsync(CountPendingDecisionTasksRequest countPendingDecisionTasksRequest,
            com.amazonaws.handlers.AsyncHandler<CountPendingDecisionTasksRequest, PendingTaskCount> asyncHandler);

    /**
     * <p>
     * Deprecates the specified <i>activity type</i>. After an activity type has been deprecated, you cannot create new
     * tasks of that activity type. Tasks of this type that were scheduled before the type was deprecated continue to
     * run.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>activityType.name</code>: String constraint. The key is <code>swf:activityType.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>activityType.version</code>: String constraint. The key is <code>swf:activityType.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param deprecateActivityTypeRequest
     * @sample AmazonSimpleWorkflowAsync.DeprecateActivityType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DeprecateActivityType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Void> deprecateActivityTypeAsync(DeprecateActivityTypeRequest deprecateActivityTypeRequest);

    /**
     * <p>
     * Deprecates the specified <i>activity type</i>. After an activity type has been deprecated, you cannot create new
     * tasks of that activity type. Tasks of this type that were scheduled before the type was deprecated continue to
     * run.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>activityType.name</code>: String constraint. The key is <code>swf:activityType.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>activityType.version</code>: String constraint. The key is <code>swf:activityType.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param deprecateActivityTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleWorkflowAsyncHandler.DeprecateActivityType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DeprecateActivityType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Void> deprecateActivityTypeAsync(DeprecateActivityTypeRequest deprecateActivityTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeprecateActivityTypeRequest, Void> asyncHandler);

    /**
     * <p>
     * Deprecates the specified domain. After a domain has been deprecated it cannot be used to create new workflow
     * executions or register new types. However, you can still use visibility actions on this domain. Deprecating a
     * domain also deprecates all activity and workflow types registered in the domain. Executions that were started
     * before the domain was deprecated continues to run.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param deprecateDomainRequest
     * @sample AmazonSimpleWorkflowAsync.DeprecateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DeprecateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Void> deprecateDomainAsync(DeprecateDomainRequest deprecateDomainRequest);

    /**
     * <p>
     * Deprecates the specified domain. After a domain has been deprecated it cannot be used to create new workflow
     * executions or register new types. However, you can still use visibility actions on this domain. Deprecating a
     * domain also deprecates all activity and workflow types registered in the domain. Executions that were started
     * before the domain was deprecated continues to run.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param deprecateDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleWorkflowAsyncHandler.DeprecateDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DeprecateDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Void> deprecateDomainAsync(DeprecateDomainRequest deprecateDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DeprecateDomainRequest, Void> asyncHandler);

    /**
     * <p>
     * Deprecates the specified <i>workflow type</i>. After a workflow type has been deprecated, you cannot create new
     * executions of that type. Executions that were started before the type was deprecated continues to run. A
     * deprecated workflow type may still be used when calling visibility actions.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>workflowType.name</code>: String constraint. The key is <code>swf:workflowType.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>workflowType.version</code>: String constraint. The key is <code>swf:workflowType.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param deprecateWorkflowTypeRequest
     * @sample AmazonSimpleWorkflowAsync.DeprecateWorkflowType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DeprecateWorkflowType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Void> deprecateWorkflowTypeAsync(DeprecateWorkflowTypeRequest deprecateWorkflowTypeRequest);

    /**
     * <p>
     * Deprecates the specified <i>workflow type</i>. After a workflow type has been deprecated, you cannot create new
     * executions of that type. Executions that were started before the type was deprecated continues to run. A
     * deprecated workflow type may still be used when calling visibility actions.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>workflowType.name</code>: String constraint. The key is <code>swf:workflowType.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>workflowType.version</code>: String constraint. The key is <code>swf:workflowType.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param deprecateWorkflowTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleWorkflowAsyncHandler.DeprecateWorkflowType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DeprecateWorkflowType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Void> deprecateWorkflowTypeAsync(DeprecateWorkflowTypeRequest deprecateWorkflowTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DeprecateWorkflowTypeRequest, Void> asyncHandler);

    /**
     * <p>
     * Returns information about the specified activity type. This includes configuration settings provided when the
     * type was registered and other general information about the type.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>activityType.name</code>: String constraint. The key is <code>swf:activityType.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>activityType.version</code>: String constraint. The key is <code>swf:activityType.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param describeActivityTypeRequest
     * @return A Java Future containing the result of the DescribeActivityType operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.DescribeActivityType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DescribeActivityType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ActivityTypeDetail> describeActivityTypeAsync(DescribeActivityTypeRequest describeActivityTypeRequest);

    /**
     * <p>
     * Returns information about the specified activity type. This includes configuration settings provided when the
     * type was registered and other general information about the type.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>activityType.name</code>: String constraint. The key is <code>swf:activityType.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>activityType.version</code>: String constraint. The key is <code>swf:activityType.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param describeActivityTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeActivityType operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.DescribeActivityType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DescribeActivityType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ActivityTypeDetail> describeActivityTypeAsync(DescribeActivityTypeRequest describeActivityTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeActivityTypeRequest, ActivityTypeDetail> asyncHandler);

    /**
     * <p>
     * Returns information about the specified domain, including description and status.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param describeDomainRequest
     * @return A Java Future containing the result of the DescribeDomain operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DescribeDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DomainDetail> describeDomainAsync(DescribeDomainRequest describeDomainRequest);

    /**
     * <p>
     * Returns information about the specified domain, including description and status.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param describeDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeDomain operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.DescribeDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DescribeDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DomainDetail> describeDomainAsync(DescribeDomainRequest describeDomainRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeDomainRequest, DomainDetail> asyncHandler);

    /**
     * <p>
     * Returns information about the specified workflow execution including its type and some statistics.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param describeWorkflowExecutionRequest
     * @return A Java Future containing the result of the DescribeWorkflowExecution operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.DescribeWorkflowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DescribeWorkflowExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<WorkflowExecutionDetail> describeWorkflowExecutionAsync(DescribeWorkflowExecutionRequest describeWorkflowExecutionRequest);

    /**
     * <p>
     * Returns information about the specified workflow execution including its type and some statistics.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param describeWorkflowExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkflowExecution operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.DescribeWorkflowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DescribeWorkflowExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<WorkflowExecutionDetail> describeWorkflowExecutionAsync(DescribeWorkflowExecutionRequest describeWorkflowExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkflowExecutionRequest, WorkflowExecutionDetail> asyncHandler);

    /**
     * <p>
     * Returns information about the specified <i>workflow type</i>. This includes configuration settings specified when
     * the type was registered and other information such as creation date, current status, etc.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>workflowType.name</code>: String constraint. The key is <code>swf:workflowType.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>workflowType.version</code>: String constraint. The key is <code>swf:workflowType.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param describeWorkflowTypeRequest
     * @return A Java Future containing the result of the DescribeWorkflowType operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.DescribeWorkflowType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DescribeWorkflowType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<WorkflowTypeDetail> describeWorkflowTypeAsync(DescribeWorkflowTypeRequest describeWorkflowTypeRequest);

    /**
     * <p>
     * Returns information about the specified <i>workflow type</i>. This includes configuration settings specified when
     * the type was registered and other information such as creation date, current status, etc.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>workflowType.name</code>: String constraint. The key is <code>swf:workflowType.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>workflowType.version</code>: String constraint. The key is <code>swf:workflowType.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param describeWorkflowTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the DescribeWorkflowType operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.DescribeWorkflowType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/DescribeWorkflowType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<WorkflowTypeDetail> describeWorkflowTypeAsync(DescribeWorkflowTypeRequest describeWorkflowTypeRequest,
            com.amazonaws.handlers.AsyncHandler<DescribeWorkflowTypeRequest, WorkflowTypeDetail> asyncHandler);

    /**
     * <p>
     * Returns the history of the specified workflow execution. The results may be split into multiple pages. To
     * retrieve subsequent pages, make the call again using the <code>nextPageToken</code> returned by the initial call.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param getWorkflowExecutionHistoryRequest
     * @return A Java Future containing the result of the GetWorkflowExecutionHistory operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.GetWorkflowExecutionHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/GetWorkflowExecutionHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<History> getWorkflowExecutionHistoryAsync(GetWorkflowExecutionHistoryRequest getWorkflowExecutionHistoryRequest);

    /**
     * <p>
     * Returns the history of the specified workflow execution. The results may be split into multiple pages. To
     * retrieve subsequent pages, make the call again using the <code>nextPageToken</code> returned by the initial call.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param getWorkflowExecutionHistoryRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the GetWorkflowExecutionHistory operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.GetWorkflowExecutionHistory
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/GetWorkflowExecutionHistory"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<History> getWorkflowExecutionHistoryAsync(GetWorkflowExecutionHistoryRequest getWorkflowExecutionHistoryRequest,
            com.amazonaws.handlers.AsyncHandler<GetWorkflowExecutionHistoryRequest, History> asyncHandler);

    /**
     * <p>
     * Returns information about all activities registered in the specified domain that match the specified name and
     * registration status. The result includes information like creation date, current status of the activity, etc. The
     * results may be split into multiple pages. To retrieve subsequent pages, make the call again using the
     * <code>nextPageToken</code> returned by the initial call.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param listActivityTypesRequest
     * @return A Java Future containing the result of the ListActivityTypes operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.ListActivityTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ListActivityTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ActivityTypeInfos> listActivityTypesAsync(ListActivityTypesRequest listActivityTypesRequest);

    /**
     * <p>
     * Returns information about all activities registered in the specified domain that match the specified name and
     * registration status. The result includes information like creation date, current status of the activity, etc. The
     * results may be split into multiple pages. To retrieve subsequent pages, make the call again using the
     * <code>nextPageToken</code> returned by the initial call.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param listActivityTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListActivityTypes operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.ListActivityTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ListActivityTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ActivityTypeInfos> listActivityTypesAsync(ListActivityTypesRequest listActivityTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListActivityTypesRequest, ActivityTypeInfos> asyncHandler);

    /**
     * <p>
     * Returns a list of closed workflow executions in the specified domain that meet the filtering criteria. The
     * results may be split into multiple pages. To retrieve subsequent pages, make the call again using the
     * nextPageToken returned by the initial call.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tagFilter.tag</code>: String constraint. The key is <code>swf:tagFilter.tag</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.name</code>: String constraint. The key is <code>swf:typeFilter.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.version</code>: String constraint. The key is <code>swf:typeFilter.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param listClosedWorkflowExecutionsRequest
     * @return A Java Future containing the result of the ListClosedWorkflowExecutions operation returned by the
     *         service.
     * @sample AmazonSimpleWorkflowAsync.ListClosedWorkflowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ListClosedWorkflowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<WorkflowExecutionInfos> listClosedWorkflowExecutionsAsync(
            ListClosedWorkflowExecutionsRequest listClosedWorkflowExecutionsRequest);

    /**
     * <p>
     * Returns a list of closed workflow executions in the specified domain that meet the filtering criteria. The
     * results may be split into multiple pages. To retrieve subsequent pages, make the call again using the
     * nextPageToken returned by the initial call.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tagFilter.tag</code>: String constraint. The key is <code>swf:tagFilter.tag</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.name</code>: String constraint. The key is <code>swf:typeFilter.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.version</code>: String constraint. The key is <code>swf:typeFilter.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param listClosedWorkflowExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListClosedWorkflowExecutions operation returned by the
     *         service.
     * @sample AmazonSimpleWorkflowAsyncHandler.ListClosedWorkflowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ListClosedWorkflowExecutions"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<WorkflowExecutionInfos> listClosedWorkflowExecutionsAsync(
            ListClosedWorkflowExecutionsRequest listClosedWorkflowExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListClosedWorkflowExecutionsRequest, WorkflowExecutionInfos> asyncHandler);

    /**
     * <p>
     * Returns the list of domains registered in the account. The results may be split into multiple pages. To retrieve
     * subsequent pages, make the call again using the nextPageToken returned by the initial call.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains. The
     * element must be set to <code>arn:aws:swf::AccountID:domain/*</code>, where <i>AccountID</i> is the account ID,
     * with no dashes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param listDomainsRequest
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DomainInfos> listDomainsAsync(ListDomainsRequest listDomainsRequest);

    /**
     * <p>
     * Returns the list of domains registered in the account. The results may be split into multiple pages. To retrieve
     * subsequent pages, make the call again using the nextPageToken returned by the initial call.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains. The
     * element must be set to <code>arn:aws:swf::AccountID:domain/*</code>, where <i>AccountID</i> is the account ID,
     * with no dashes.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param listDomainsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListDomains operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.ListDomains
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ListDomains" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DomainInfos> listDomainsAsync(ListDomainsRequest listDomainsRequest,
            com.amazonaws.handlers.AsyncHandler<ListDomainsRequest, DomainInfos> asyncHandler);

    /**
     * <p>
     * Returns a list of open workflow executions in the specified domain that meet the filtering criteria. The results
     * may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken
     * returned by the initial call.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tagFilter.tag</code>: String constraint. The key is <code>swf:tagFilter.tag</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.name</code>: String constraint. The key is <code>swf:typeFilter.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.version</code>: String constraint. The key is <code>swf:typeFilter.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param listOpenWorkflowExecutionsRequest
     * @return A Java Future containing the result of the ListOpenWorkflowExecutions operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.ListOpenWorkflowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ListOpenWorkflowExecutions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<WorkflowExecutionInfos> listOpenWorkflowExecutionsAsync(ListOpenWorkflowExecutionsRequest listOpenWorkflowExecutionsRequest);

    /**
     * <p>
     * Returns a list of open workflow executions in the specified domain that meet the filtering criteria. The results
     * may be split into multiple pages. To retrieve subsequent pages, make the call again using the nextPageToken
     * returned by the initial call.
     * </p>
     * <note>
     * <p>
     * This operation is eventually consistent. The results are best effort and may not exactly reflect recent updates
     * and changes.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tagFilter.tag</code>: String constraint. The key is <code>swf:tagFilter.tag</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.name</code>: String constraint. The key is <code>swf:typeFilter.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>typeFilter.version</code>: String constraint. The key is <code>swf:typeFilter.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param listOpenWorkflowExecutionsRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListOpenWorkflowExecutions operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.ListOpenWorkflowExecutions
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ListOpenWorkflowExecutions" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<WorkflowExecutionInfos> listOpenWorkflowExecutionsAsync(ListOpenWorkflowExecutionsRequest listOpenWorkflowExecutionsRequest,
            com.amazonaws.handlers.AsyncHandler<ListOpenWorkflowExecutionsRequest, WorkflowExecutionInfos> asyncHandler);

    /**
     * <p>
     * Returns information about workflow types in the specified domain. The results may be split into multiple pages
     * that can be retrieved by making the call repeatedly.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param listWorkflowTypesRequest
     * @return A Java Future containing the result of the ListWorkflowTypes operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.ListWorkflowTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ListWorkflowTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<WorkflowTypeInfos> listWorkflowTypesAsync(ListWorkflowTypesRequest listWorkflowTypesRequest);

    /**
     * <p>
     * Returns information about workflow types in the specified domain. The results may be split into multiple pages
     * that can be retrieved by making the call repeatedly.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param listWorkflowTypesRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the ListWorkflowTypes operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.ListWorkflowTypes
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/ListWorkflowTypes" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<WorkflowTypeInfos> listWorkflowTypesAsync(ListWorkflowTypesRequest listWorkflowTypesRequest,
            com.amazonaws.handlers.AsyncHandler<ListWorkflowTypesRequest, WorkflowTypeInfos> asyncHandler);

    /**
     * <p>
     * Used by workers to get an <a>ActivityTask</a> from the specified activity <code>taskList</code>. This initiates a
     * long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available. The
     * maximum time the service holds on to the request before responding is 60 seconds. If no task is available within
     * 60 seconds, the poll returns an empty result. An empty result, in this context, means that an ActivityTask is
     * returned, but that the value of taskToken is an empty string. If a task is returned, the worker should use its
     * type to identify and process it correctly.
     * </p>
     * <important>
     * <p>
     * Workers should set their client side socket timeout to at least 70 seconds (10 seconds higher than the maximum
     * time service may hold the poll request).
     * </p>
     * </important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the <code>taskList.name</code> parameter by using a <code>Condition</code> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only certain task lists.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param pollForActivityTaskRequest
     * @return A Java Future containing the result of the PollForActivityTask operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.PollForActivityTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/PollForActivityTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ActivityTask> pollForActivityTaskAsync(PollForActivityTaskRequest pollForActivityTaskRequest);

    /**
     * <p>
     * Used by workers to get an <a>ActivityTask</a> from the specified activity <code>taskList</code>. This initiates a
     * long poll, where the service holds the HTTP connection open and responds as soon as a task becomes available. The
     * maximum time the service holds on to the request before responding is 60 seconds. If no task is available within
     * 60 seconds, the poll returns an empty result. An empty result, in this context, means that an ActivityTask is
     * returned, but that the value of taskToken is an empty string. If a task is returned, the worker should use its
     * type to identify and process it correctly.
     * </p>
     * <important>
     * <p>
     * Workers should set their client side socket timeout to at least 70 seconds (10 seconds higher than the maximum
     * time service may hold the poll request).
     * </p>
     * </important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the <code>taskList.name</code> parameter by using a <code>Condition</code> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only certain task lists.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param pollForActivityTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PollForActivityTask operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.PollForActivityTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/PollForActivityTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<ActivityTask> pollForActivityTaskAsync(PollForActivityTaskRequest pollForActivityTaskRequest,
            com.amazonaws.handlers.AsyncHandler<PollForActivityTaskRequest, ActivityTask> asyncHandler);

    /**
     * <p>
     * Used by deciders to get a <a>DecisionTask</a> from the specified decision <code>taskList</code>. A decision task
     * may be returned for any open workflow execution that is using the specified task list. The task includes a
     * paginated view of the history of the workflow execution. The decider should use the workflow type and the history
     * to determine how to properly handle the task.
     * </p>
     * <p>
     * This action initiates a long poll, where the service holds the HTTP connection open and responds as soon a task
     * becomes available. If no decision task is available in the specified task list before the timeout of 60 seconds
     * expires, an empty result is returned. An empty result, in this context, means that a DecisionTask is returned,
     * but that the value of taskToken is an empty string.
     * </p>
     * <important>
     * <p>
     * Deciders should set their client side socket timeout to at least 70 seconds (10 seconds higher than the timeout).
     * </p>
     * </important> <important>
     * <p>
     * Because the number of workflow history events for a single workflow execution might be very large, the result
     * returned might be split up across a number of pages. To retrieve subsequent pages, make additional calls to
     * <code>PollForDecisionTask</code> using the <code>nextPageToken</code> returned by the initial call. Note that you
     * do <i>not</i> call <code>GetWorkflowExecutionHistory</code> with this <code>nextPageToken</code>. Instead, call
     * <code>PollForDecisionTask</code> again.
     * </p>
     * </important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the <code>taskList.name</code> parameter by using a <code>Condition</code> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only certain task lists.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param pollForDecisionTaskRequest
     * @return A Java Future containing the result of the PollForDecisionTask operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.PollForDecisionTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/PollForDecisionTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DecisionTask> pollForDecisionTaskAsync(PollForDecisionTaskRequest pollForDecisionTaskRequest);

    /**
     * <p>
     * Used by deciders to get a <a>DecisionTask</a> from the specified decision <code>taskList</code>. A decision task
     * may be returned for any open workflow execution that is using the specified task list. The task includes a
     * paginated view of the history of the workflow execution. The decider should use the workflow type and the history
     * to determine how to properly handle the task.
     * </p>
     * <p>
     * This action initiates a long poll, where the service holds the HTTP connection open and responds as soon a task
     * becomes available. If no decision task is available in the specified task list before the timeout of 60 seconds
     * expires, an empty result is returned. An empty result, in this context, means that a DecisionTask is returned,
     * but that the value of taskToken is an empty string.
     * </p>
     * <important>
     * <p>
     * Deciders should set their client side socket timeout to at least 70 seconds (10 seconds higher than the timeout).
     * </p>
     * </important> <important>
     * <p>
     * Because the number of workflow history events for a single workflow execution might be very large, the result
     * returned might be split up across a number of pages. To retrieve subsequent pages, make additional calls to
     * <code>PollForDecisionTask</code> using the <code>nextPageToken</code> returned by the initial call. Note that you
     * do <i>not</i> call <code>GetWorkflowExecutionHistory</code> with this <code>nextPageToken</code>. Instead, call
     * <code>PollForDecisionTask</code> again.
     * </p>
     * </important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the <code>taskList.name</code> parameter by using a <code>Condition</code> element with the
     * <code>swf:taskList.name</code> key to allow the action to access only certain task lists.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param pollForDecisionTaskRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the PollForDecisionTask operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.PollForDecisionTask
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/PollForDecisionTask" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<DecisionTask> pollForDecisionTaskAsync(PollForDecisionTaskRequest pollForDecisionTaskRequest,
            com.amazonaws.handlers.AsyncHandler<PollForDecisionTaskRequest, DecisionTask> asyncHandler);

    /**
     * <p>
     * Used by activity workers to report to the service that the <a>ActivityTask</a> represented by the specified
     * <code>taskToken</code> is still making progress. The worker can also specify details of the progress, for example
     * percent complete, using the <code>details</code> parameter. This action can also be used by the worker as a
     * mechanism to check if cancellation is being requested for the activity task. If a cancellation is being attempted
     * for the specified task, then the boolean <code>cancelRequested</code> flag returned by the service is set to
     * <code>true</code>.
     * </p>
     * <p>
     * This action resets the <code>taskHeartbeatTimeout</code> clock. The <code>taskHeartbeatTimeout</code> is
     * specified in <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * This action doesn't in itself create an event in the workflow execution history. However, if the task times out,
     * the workflow execution history contains a <code>ActivityTaskTimedOut</code> event that contains the information
     * from the last heartbeat generated by the activity worker.
     * </p>
     * <note>
     * <p>
     * The <code>taskStartToCloseTimeout</code> of an activity type is the maximum duration of an activity task,
     * regardless of the number of <a>RecordActivityTaskHeartbeat</a> requests received. The
     * <code>taskStartToCloseTimeout</code> is also specified in <a>RegisterActivityType</a>.
     * </p>
     * </note> <note>
     * <p>
     * This operation is only useful for long-lived activities to report liveliness of the task and to determine if a
     * cancellation is being attempted.
     * </p>
     * </note> <important>
     * <p>
     * If the <code>cancelRequested</code> flag returns <code>true</code>, a cancellation is being attempted. If the
     * worker can cancel the activity, it should respond with <a>RespondActivityTaskCanceled</a>. Otherwise, it should
     * ignore the cancellation request.
     * </p>
     * </important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param recordActivityTaskHeartbeatRequest
     * @return A Java Future containing the result of the RecordActivityTaskHeartbeat operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.RecordActivityTaskHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RecordActivityTaskHeartbeat"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ActivityTaskStatus> recordActivityTaskHeartbeatAsync(RecordActivityTaskHeartbeatRequest recordActivityTaskHeartbeatRequest);

    /**
     * <p>
     * Used by activity workers to report to the service that the <a>ActivityTask</a> represented by the specified
     * <code>taskToken</code> is still making progress. The worker can also specify details of the progress, for example
     * percent complete, using the <code>details</code> parameter. This action can also be used by the worker as a
     * mechanism to check if cancellation is being requested for the activity task. If a cancellation is being attempted
     * for the specified task, then the boolean <code>cancelRequested</code> flag returned by the service is set to
     * <code>true</code>.
     * </p>
     * <p>
     * This action resets the <code>taskHeartbeatTimeout</code> clock. The <code>taskHeartbeatTimeout</code> is
     * specified in <a>RegisterActivityType</a>.
     * </p>
     * <p>
     * This action doesn't in itself create an event in the workflow execution history. However, if the task times out,
     * the workflow execution history contains a <code>ActivityTaskTimedOut</code> event that contains the information
     * from the last heartbeat generated by the activity worker.
     * </p>
     * <note>
     * <p>
     * The <code>taskStartToCloseTimeout</code> of an activity type is the maximum duration of an activity task,
     * regardless of the number of <a>RecordActivityTaskHeartbeat</a> requests received. The
     * <code>taskStartToCloseTimeout</code> is also specified in <a>RegisterActivityType</a>.
     * </p>
     * </note> <note>
     * <p>
     * This operation is only useful for long-lived activities to report liveliness of the task and to determine if a
     * cancellation is being attempted.
     * </p>
     * </note> <important>
     * <p>
     * If the <code>cancelRequested</code> flag returns <code>true</code>, a cancellation is being attempted. If the
     * worker can cancel the activity, it should respond with <a>RespondActivityTaskCanceled</a>. Otherwise, it should
     * ignore the cancellation request.
     * </p>
     * </important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param recordActivityTaskHeartbeatRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the RecordActivityTaskHeartbeat operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.RecordActivityTaskHeartbeat
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RecordActivityTaskHeartbeat"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<ActivityTaskStatus> recordActivityTaskHeartbeatAsync(RecordActivityTaskHeartbeatRequest recordActivityTaskHeartbeatRequest,
            com.amazonaws.handlers.AsyncHandler<RecordActivityTaskHeartbeatRequest, ActivityTaskStatus> asyncHandler);

    /**
     * <p>
     * Registers a new <i>activity type</i> along with its configuration settings in the specified domain.
     * </p>
     * <important>
     * <p>
     * A <code>TypeAlreadyExists</code> fault is returned if the type already exists in the domain. You cannot change
     * any configuration settings of the type after its registration, and it must be registered as a new version.
     * </p>
     * </important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>defaultTaskList.name</code>: String constraint. The key is <code>swf:defaultTaskList.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code>: String constraint. The key is <code>swf:name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>version</code>: String constraint. The key is <code>swf:version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param registerActivityTypeRequest
     * @sample AmazonSimpleWorkflowAsync.RegisterActivityType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RegisterActivityType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Void> registerActivityTypeAsync(RegisterActivityTypeRequest registerActivityTypeRequest);

    /**
     * <p>
     * Registers a new <i>activity type</i> along with its configuration settings in the specified domain.
     * </p>
     * <important>
     * <p>
     * A <code>TypeAlreadyExists</code> fault is returned if the type already exists in the domain. You cannot change
     * any configuration settings of the type after its registration, and it must be registered as a new version.
     * </p>
     * </important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>defaultTaskList.name</code>: String constraint. The key is <code>swf:defaultTaskList.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code>: String constraint. The key is <code>swf:name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>version</code>: String constraint. The key is <code>swf:version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param registerActivityTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleWorkflowAsyncHandler.RegisterActivityType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RegisterActivityType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Void> registerActivityTypeAsync(RegisterActivityTypeRequest registerActivityTypeRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterActivityTypeRequest, Void> asyncHandler);

    /**
     * <p>
     * Registers a new domain.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot use an IAM policy to control domain access for this action. The name of the domain being registered is
     * available as the resource of this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param registerDomainRequest
     * @sample AmazonSimpleWorkflowAsync.RegisterDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RegisterDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Void> registerDomainAsync(RegisterDomainRequest registerDomainRequest);

    /**
     * <p>
     * Registers a new domain.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * You cannot use an IAM policy to control domain access for this action. The name of the domain being registered is
     * available as the resource of this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param registerDomainRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleWorkflowAsyncHandler.RegisterDomain
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RegisterDomain" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Void> registerDomainAsync(RegisterDomainRequest registerDomainRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterDomainRequest, Void> asyncHandler);

    /**
     * <p>
     * Registers a new <i>workflow type</i> and its configuration settings in the specified domain.
     * </p>
     * <p>
     * The retention period for the workflow history is set by the <a>RegisterDomain</a> action.
     * </p>
     * <important>
     * <p>
     * If the type already exists, then a <code>TypeAlreadyExists</code> fault is returned. You cannot change the
     * configuration settings of a workflow type once it is registered and it must be registered as a new version.
     * </p>
     * </important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>defaultTaskList.name</code>: String constraint. The key is <code>swf:defaultTaskList.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code>: String constraint. The key is <code>swf:name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>version</code>: String constraint. The key is <code>swf:version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param registerWorkflowTypeRequest
     * @sample AmazonSimpleWorkflowAsync.RegisterWorkflowType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RegisterWorkflowType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Void> registerWorkflowTypeAsync(RegisterWorkflowTypeRequest registerWorkflowTypeRequest);

    /**
     * <p>
     * Registers a new <i>workflow type</i> and its configuration settings in the specified domain.
     * </p>
     * <p>
     * The retention period for the workflow history is set by the <a>RegisterDomain</a> action.
     * </p>
     * <important>
     * <p>
     * If the type already exists, then a <code>TypeAlreadyExists</code> fault is returned. You cannot change the
     * configuration settings of a workflow type once it is registered and it must be registered as a new version.
     * </p>
     * </important>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>defaultTaskList.name</code>: String constraint. The key is <code>swf:defaultTaskList.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>name</code>: String constraint. The key is <code>swf:name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>version</code>: String constraint. The key is <code>swf:version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param registerWorkflowTypeRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleWorkflowAsyncHandler.RegisterWorkflowType
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RegisterWorkflowType" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Void> registerWorkflowTypeAsync(RegisterWorkflowTypeRequest registerWorkflowTypeRequest,
            com.amazonaws.handlers.AsyncHandler<RegisterWorkflowTypeRequest, Void> asyncHandler);

    /**
     * <p>
     * Records a <code>WorkflowExecutionCancelRequested</code> event in the currently running workflow execution
     * identified by the given domain, workflowId, and runId. This logically requests the cancellation of the workflow
     * execution as a whole. It is up to the decider to take appropriate actions when it receives an execution history
     * with this event.
     * </p>
     * <note>
     * <p>
     * If the runId isn't specified, the <code>WorkflowExecutionCancelRequested</code> event is recorded in the history
     * of the current open workflow execution with the specified workflowId in the domain.
     * </p>
     * </note> <note>
     * <p>
     * Because this action allows the workflow to properly clean up and gracefully close, it should be used instead of
     * <a>TerminateWorkflowExecution</a> when possible.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param requestCancelWorkflowExecutionRequest
     * @sample AmazonSimpleWorkflowAsync.RequestCancelWorkflowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RequestCancelWorkflowExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Void> requestCancelWorkflowExecutionAsync(RequestCancelWorkflowExecutionRequest requestCancelWorkflowExecutionRequest);

    /**
     * <p>
     * Records a <code>WorkflowExecutionCancelRequested</code> event in the currently running workflow execution
     * identified by the given domain, workflowId, and runId. This logically requests the cancellation of the workflow
     * execution as a whole. It is up to the decider to take appropriate actions when it receives an execution history
     * with this event.
     * </p>
     * <note>
     * <p>
     * If the runId isn't specified, the <code>WorkflowExecutionCancelRequested</code> event is recorded in the history
     * of the current open workflow execution with the specified workflowId in the domain.
     * </p>
     * </note> <note>
     * <p>
     * Because this action allows the workflow to properly clean up and gracefully close, it should be used instead of
     * <a>TerminateWorkflowExecution</a> when possible.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param requestCancelWorkflowExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleWorkflowAsyncHandler.RequestCancelWorkflowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RequestCancelWorkflowExecution"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Void> requestCancelWorkflowExecutionAsync(RequestCancelWorkflowExecutionRequest requestCancelWorkflowExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<RequestCancelWorkflowExecutionRequest, Void> asyncHandler);

    /**
     * <p>
     * Used by workers to tell the service that the <a>ActivityTask</a> identified by the <code>taskToken</code> was
     * successfully canceled. Additional <code>details</code> can be provided using the <code>details</code> argument.
     * </p>
     * <p>
     * These <code>details</code> (if provided) appear in the <code>ActivityTaskCanceled</code> event added to the
     * workflow history.
     * </p>
     * <important>
     * <p>
     * Only use this operation if the <code>canceled</code> flag of a <a>RecordActivityTaskHeartbeat</a> request returns
     * <code>true</code> and if the activity can be safely undone or abandoned.
     * </p>
     * </important>
     * <p>
     * A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as
     * open while a worker is processing it. A task is closed after it has been specified in a call to
     * <a>RespondActivityTaskCompleted</a>, RespondActivityTaskCanceled, <a>RespondActivityTaskFailed</a>, or the task
     * has <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">timed
     * out</a>.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param respondActivityTaskCanceledRequest
     * @sample AmazonSimpleWorkflowAsync.RespondActivityTaskCanceled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RespondActivityTaskCanceled"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Void> respondActivityTaskCanceledAsync(RespondActivityTaskCanceledRequest respondActivityTaskCanceledRequest);

    /**
     * <p>
     * Used by workers to tell the service that the <a>ActivityTask</a> identified by the <code>taskToken</code> was
     * successfully canceled. Additional <code>details</code> can be provided using the <code>details</code> argument.
     * </p>
     * <p>
     * These <code>details</code> (if provided) appear in the <code>ActivityTaskCanceled</code> event added to the
     * workflow history.
     * </p>
     * <important>
     * <p>
     * Only use this operation if the <code>canceled</code> flag of a <a>RecordActivityTaskHeartbeat</a> request returns
     * <code>true</code> and if the activity can be safely undone or abandoned.
     * </p>
     * </important>
     * <p>
     * A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as
     * open while a worker is processing it. A task is closed after it has been specified in a call to
     * <a>RespondActivityTaskCompleted</a>, RespondActivityTaskCanceled, <a>RespondActivityTaskFailed</a>, or the task
     * has <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">timed
     * out</a>.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param respondActivityTaskCanceledRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleWorkflowAsyncHandler.RespondActivityTaskCanceled
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RespondActivityTaskCanceled"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Void> respondActivityTaskCanceledAsync(RespondActivityTaskCanceledRequest respondActivityTaskCanceledRequest,
            com.amazonaws.handlers.AsyncHandler<RespondActivityTaskCanceledRequest, Void> asyncHandler);

    /**
     * <p>
     * Used by workers to tell the service that the <a>ActivityTask</a> identified by the <code>taskToken</code>
     * completed successfully with a <code>result</code> (if provided). The <code>result</code> appears in the
     * <code>ActivityTaskCompleted</code> event in the workflow history.
     * </p>
     * <important>
     * <p>
     * If the requested task doesn't complete successfully, use <a>RespondActivityTaskFailed</a> instead. If the worker
     * finds that the task is canceled through the <code>canceled</code> flag returned by
     * <a>RecordActivityTaskHeartbeat</a>, it should cancel the task, clean up and then call
     * <a>RespondActivityTaskCanceled</a>.
     * </p>
     * </important>
     * <p>
     * A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as
     * open while a worker is processing it. A task is closed after it has been specified in a call to
     * RespondActivityTaskCompleted, <a>RespondActivityTaskCanceled</a>, <a>RespondActivityTaskFailed</a>, or the task
     * has <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">timed
     * out</a>.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param respondActivityTaskCompletedRequest
     * @sample AmazonSimpleWorkflowAsync.RespondActivityTaskCompleted
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RespondActivityTaskCompleted"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Void> respondActivityTaskCompletedAsync(RespondActivityTaskCompletedRequest respondActivityTaskCompletedRequest);

    /**
     * <p>
     * Used by workers to tell the service that the <a>ActivityTask</a> identified by the <code>taskToken</code>
     * completed successfully with a <code>result</code> (if provided). The <code>result</code> appears in the
     * <code>ActivityTaskCompleted</code> event in the workflow history.
     * </p>
     * <important>
     * <p>
     * If the requested task doesn't complete successfully, use <a>RespondActivityTaskFailed</a> instead. If the worker
     * finds that the task is canceled through the <code>canceled</code> flag returned by
     * <a>RecordActivityTaskHeartbeat</a>, it should cancel the task, clean up and then call
     * <a>RespondActivityTaskCanceled</a>.
     * </p>
     * </important>
     * <p>
     * A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as
     * open while a worker is processing it. A task is closed after it has been specified in a call to
     * RespondActivityTaskCompleted, <a>RespondActivityTaskCanceled</a>, <a>RespondActivityTaskFailed</a>, or the task
     * has <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">timed
     * out</a>.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param respondActivityTaskCompletedRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleWorkflowAsyncHandler.RespondActivityTaskCompleted
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RespondActivityTaskCompleted"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Void> respondActivityTaskCompletedAsync(RespondActivityTaskCompletedRequest respondActivityTaskCompletedRequest,
            com.amazonaws.handlers.AsyncHandler<RespondActivityTaskCompletedRequest, Void> asyncHandler);

    /**
     * <p>
     * Used by workers to tell the service that the <a>ActivityTask</a> identified by the <code>taskToken</code> has
     * failed with <code>reason</code> (if specified). The <code>reason</code> and <code>details</code> appear in the
     * <code>ActivityTaskFailed</code> event added to the workflow history.
     * </p>
     * <p>
     * A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as
     * open while a worker is processing it. A task is closed after it has been specified in a call to
     * <a>RespondActivityTaskCompleted</a>, <a>RespondActivityTaskCanceled</a>, RespondActivityTaskFailed, or the task
     * has <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">timed
     * out</a>.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param respondActivityTaskFailedRequest
     * @sample AmazonSimpleWorkflowAsync.RespondActivityTaskFailed
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RespondActivityTaskFailed" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Void> respondActivityTaskFailedAsync(RespondActivityTaskFailedRequest respondActivityTaskFailedRequest);

    /**
     * <p>
     * Used by workers to tell the service that the <a>ActivityTask</a> identified by the <code>taskToken</code> has
     * failed with <code>reason</code> (if specified). The <code>reason</code> and <code>details</code> appear in the
     * <code>ActivityTaskFailed</code> event added to the workflow history.
     * </p>
     * <p>
     * A task is considered open from the time that it is scheduled until it is closed. Therefore a task is reported as
     * open while a worker is processing it. A task is closed after it has been specified in a call to
     * <a>RespondActivityTaskCompleted</a>, <a>RespondActivityTaskCanceled</a>, RespondActivityTaskFailed, or the task
     * has <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dg-basic.html#swf-dev-timeout-types">timed
     * out</a>.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param respondActivityTaskFailedRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleWorkflowAsyncHandler.RespondActivityTaskFailed
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RespondActivityTaskFailed" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Void> respondActivityTaskFailedAsync(RespondActivityTaskFailedRequest respondActivityTaskFailedRequest,
            com.amazonaws.handlers.AsyncHandler<RespondActivityTaskFailedRequest, Void> asyncHandler);

    /**
     * <p>
     * Used by deciders to tell the service that the <a>DecisionTask</a> identified by the <code>taskToken</code> has
     * successfully completed. The <code>decisions</code> argument specifies the list of decisions made while processing
     * the task.
     * </p>
     * <p>
     * A <code>DecisionTaskCompleted</code> event is added to the workflow history. The <code>executionContext</code>
     * specified is attached to the event in the workflow execution history.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * If an IAM policy grants permission to use <code>RespondDecisionTaskCompleted</code>, it can express permissions
     * for the list of decisions in the <code>decisions</code> parameter. Each of the decisions has one or more
     * parameters, much like a regular API call. To allow for policies to be as readable as possible, you can express
     * permissions on decisions as if they were actual API calls, including applying conditions to some parameters. For
     * more information, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param respondDecisionTaskCompletedRequest
     *        Input data for a TaskCompleted response to a decision task.
     * @sample AmazonSimpleWorkflowAsync.RespondDecisionTaskCompleted
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RespondDecisionTaskCompleted"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Void> respondDecisionTaskCompletedAsync(RespondDecisionTaskCompletedRequest respondDecisionTaskCompletedRequest);

    /**
     * <p>
     * Used by deciders to tell the service that the <a>DecisionTask</a> identified by the <code>taskToken</code> has
     * successfully completed. The <code>decisions</code> argument specifies the list of decisions made while processing
     * the task.
     * </p>
     * <p>
     * A <code>DecisionTaskCompleted</code> event is added to the workflow history. The <code>executionContext</code>
     * specified is attached to the event in the workflow execution history.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * If an IAM policy grants permission to use <code>RespondDecisionTaskCompleted</code>, it can express permissions
     * for the list of decisions in the <code>decisions</code> parameter. Each of the decisions has one or more
     * parameters, much like a regular API call. To allow for policies to be as readable as possible, you can express
     * permissions on decisions as if they were actual API calls, including applying conditions to some parameters. For
     * more information, see <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using
     * IAM to Manage Access to Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param respondDecisionTaskCompletedRequest
     *        Input data for a TaskCompleted response to a decision task.
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleWorkflowAsyncHandler.RespondDecisionTaskCompleted
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/RespondDecisionTaskCompleted"
     *      target="_top">AWS API Documentation</a>
     */
    java.util.concurrent.Future<Void> respondDecisionTaskCompletedAsync(RespondDecisionTaskCompletedRequest respondDecisionTaskCompletedRequest,
            com.amazonaws.handlers.AsyncHandler<RespondDecisionTaskCompletedRequest, Void> asyncHandler);

    /**
     * <p>
     * Records a <code>WorkflowExecutionSignaled</code> event in the workflow execution history and creates a decision
     * task for the workflow execution identified by the given domain, workflowId and runId. The event is recorded with
     * the specified user defined signalName and input (if provided).
     * </p>
     * <note>
     * <p>
     * If a runId isn't specified, then the <code>WorkflowExecutionSignaled</code> event is recorded in the history of
     * the current open workflow with the matching workflowId in the domain.
     * </p>
     * </note> <note>
     * <p>
     * If the specified workflow execution isn't open, this method fails with <code>UnknownResource</code>.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param signalWorkflowExecutionRequest
     * @sample AmazonSimpleWorkflowAsync.SignalWorkflowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/SignalWorkflowExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Void> signalWorkflowExecutionAsync(SignalWorkflowExecutionRequest signalWorkflowExecutionRequest);

    /**
     * <p>
     * Records a <code>WorkflowExecutionSignaled</code> event in the workflow execution history and creates a decision
     * task for the workflow execution identified by the given domain, workflowId and runId. The event is recorded with
     * the specified user defined signalName and input (if provided).
     * </p>
     * <note>
     * <p>
     * If a runId isn't specified, then the <code>WorkflowExecutionSignaled</code> event is recorded in the history of
     * the current open workflow with the matching workflowId in the domain.
     * </p>
     * </note> <note>
     * <p>
     * If the specified workflow execution isn't open, this method fails with <code>UnknownResource</code>.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param signalWorkflowExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleWorkflowAsyncHandler.SignalWorkflowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/SignalWorkflowExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Void> signalWorkflowExecutionAsync(SignalWorkflowExecutionRequest signalWorkflowExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<SignalWorkflowExecutionRequest, Void> asyncHandler);

    /**
     * <p>
     * Starts an execution of the workflow type in the specified domain using the provided <code>workflowId</code> and
     * input data.
     * </p>
     * <p>
     * This action returns the newly started workflow execution.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tagList.member.0</code>: The key is <code>swf:tagList.member.0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tagList.member.1</code>: The key is <code>swf:tagList.member.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tagList.member.2</code>: The key is <code>swf:tagList.member.2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tagList.member.3</code>: The key is <code>swf:tagList.member.3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tagList.member.4</code>: The key is <code>swf:tagList.member.4</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>taskList</code>: String constraint. The key is <code>swf:taskList.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>workflowType.name</code>: String constraint. The key is <code>swf:workflowType.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>workflowType.version</code>: String constraint. The key is <code>swf:workflowType.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param startWorkflowExecutionRequest
     * @return A Java Future containing the result of the StartWorkflowExecution operation returned by the service.
     * @sample AmazonSimpleWorkflowAsync.StartWorkflowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/StartWorkflowExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Run> startWorkflowExecutionAsync(StartWorkflowExecutionRequest startWorkflowExecutionRequest);

    /**
     * <p>
     * Starts an execution of the workflow type in the specified domain using the provided <code>workflowId</code> and
     * input data.
     * </p>
     * <p>
     * This action returns the newly started workflow execution.
     * </p>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>tagList.member.0</code>: The key is <code>swf:tagList.member.0</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tagList.member.1</code>: The key is <code>swf:tagList.member.1</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tagList.member.2</code>: The key is <code>swf:tagList.member.2</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tagList.member.3</code>: The key is <code>swf:tagList.member.3</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>tagList.member.4</code>: The key is <code>swf:tagList.member.4</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>taskList</code>: String constraint. The key is <code>swf:taskList.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>workflowType.name</code>: String constraint. The key is <code>swf:workflowType.name</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>workflowType.version</code>: String constraint. The key is <code>swf:workflowType.version</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param startWorkflowExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @return A Java Future containing the result of the StartWorkflowExecution operation returned by the service.
     * @sample AmazonSimpleWorkflowAsyncHandler.StartWorkflowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/StartWorkflowExecution" target="_top">AWS API
     *      Documentation</a>
     */
    java.util.concurrent.Future<Run> startWorkflowExecutionAsync(StartWorkflowExecutionRequest startWorkflowExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<StartWorkflowExecutionRequest, Run> asyncHandler);

    /**
     * <p>
     * Records a <code>WorkflowExecutionTerminated</code> event and forces closure of the workflow execution identified
     * by the given domain, runId, and workflowId. The child policy, registered with the workflow type or specified when
     * starting this execution, is applied to any open child workflow executions of this workflow execution.
     * </p>
     * <important>
     * <p>
     * If the identified workflow execution was in progress, it is terminated immediately.
     * </p>
     * </important> <note>
     * <p>
     * If a runId isn't specified, then the <code>WorkflowExecutionTerminated</code> event is recorded in the history of
     * the current open workflow with the matching workflowId in the domain.
     * </p>
     * </note> <note>
     * <p>
     * You should consider using <a>RequestCancelWorkflowExecution</a> action instead because it allows the workflow to
     * gracefully close while <a>TerminateWorkflowExecution</a> doesn't.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param terminateWorkflowExecutionRequest
     * @sample AmazonSimpleWorkflowAsync.TerminateWorkflowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/TerminateWorkflowExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Void> terminateWorkflowExecutionAsync(TerminateWorkflowExecutionRequest terminateWorkflowExecutionRequest);

    /**
     * <p>
     * Records a <code>WorkflowExecutionTerminated</code> event and forces closure of the workflow execution identified
     * by the given domain, runId, and workflowId. The child policy, registered with the workflow type or specified when
     * starting this execution, is applied to any open child workflow executions of this workflow execution.
     * </p>
     * <important>
     * <p>
     * If the identified workflow execution was in progress, it is terminated immediately.
     * </p>
     * </important> <note>
     * <p>
     * If a runId isn't specified, then the <code>WorkflowExecutionTerminated</code> event is recorded in the history of
     * the current open workflow with the matching workflowId in the domain.
     * </p>
     * </note> <note>
     * <p>
     * You should consider using <a>RequestCancelWorkflowExecution</a> action instead because it allows the workflow to
     * gracefully close while <a>TerminateWorkflowExecution</a> doesn't.
     * </p>
     * </note>
     * <p>
     * <b>Access Control</b>
     * </p>
     * <p>
     * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use an <code>Action</code> element to allow or deny permission to call this action.
     * </p>
     * </li>
     * <li>
     * <p>
     * You cannot use an IAM policy to constrain this action's parameters.
     * </p>
     * </li>
     * </ul>
     * <p>
     * If the caller doesn't have sufficient permissions to invoke the action, or the parameter values fall outside the
     * specified constraints, the action fails. The associated event attribute's <code>cause</code> parameter is set to
     * <code>OPERATION_NOT_PERMITTED</code>. For details and example IAM policies, see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html">Using IAM to Manage Access to
     * Amazon SWF Workflows</a> in the <i>Amazon SWF Developer Guide</i>.
     * </p>
     * 
     * @param terminateWorkflowExecutionRequest
     * @param asyncHandler
     *        Asynchronous callback handler for events in the lifecycle of the request. Users can provide an
     *        implementation of the callback methods in this interface to receive notification of successful or
     *        unsuccessful completion of the operation.
     * @sample AmazonSimpleWorkflowAsyncHandler.TerminateWorkflowExecution
     * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/swf-2012-01-25/TerminateWorkflowExecution" target="_top">AWS
     *      API Documentation</a>
     */
    java.util.concurrent.Future<Void> terminateWorkflowExecutionAsync(TerminateWorkflowExecutionRequest terminateWorkflowExecutionRequest,
            com.amazonaws.handlers.AsyncHandler<TerminateWorkflowExecutionRequest, Void> asyncHandler);

}
