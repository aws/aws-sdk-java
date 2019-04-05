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
package com.amazonaws.services.stepfunctions.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about the events of an execution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/HistoryEvent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class HistoryEvent implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The date and time the event occurred.
     * </p>
     */
    private java.util.Date timestamp;
    /**
     * <p>
     * The type of the event.
     * </p>
     */
    private String type;
    /**
     * <p>
     * The id of the event. Events are numbered sequentially, starting at one.
     * </p>
     */
    private Long id;
    /**
     * <p>
     * The id of the previous event.
     * </p>
     */
    private Long previousEventId;

    private ActivityFailedEventDetails activityFailedEventDetails;
    /**
     * <p>
     * Contains details about an activity schedule event that failed during an execution.
     * </p>
     */
    private ActivityScheduleFailedEventDetails activityScheduleFailedEventDetails;

    private ActivityScheduledEventDetails activityScheduledEventDetails;

    private ActivityStartedEventDetails activityStartedEventDetails;

    private ActivitySucceededEventDetails activitySucceededEventDetails;

    private ActivityTimedOutEventDetails activityTimedOutEventDetails;
    /**
     * <p>
     * Contains details about the failure of a task.
     * </p>
     */
    private TaskFailedEventDetails taskFailedEventDetails;
    /**
     * <p>
     * Contains details about a task that was scheduled.
     * </p>
     */
    private TaskScheduledEventDetails taskScheduledEventDetails;
    /**
     * <p>
     * Contains details about a task that failed to start.
     * </p>
     */
    private TaskStartFailedEventDetails taskStartFailedEventDetails;
    /**
     * <p>
     * Contains details about a task that was started.
     * </p>
     */
    private TaskStartedEventDetails taskStartedEventDetails;
    /**
     * <p>
     * Contains details about a task that where the submit failed.
     * </p>
     */
    private TaskSubmitFailedEventDetails taskSubmitFailedEventDetails;
    /**
     * <p>
     * Contains details about a submitted task.
     * </p>
     */
    private TaskSubmittedEventDetails taskSubmittedEventDetails;
    /**
     * <p>
     * Contains details about a task that succeeded.
     * </p>
     */
    private TaskSucceededEventDetails taskSucceededEventDetails;
    /**
     * <p>
     * Contains details about a task that timed out.
     * </p>
     */
    private TaskTimedOutEventDetails taskTimedOutEventDetails;

    private ExecutionFailedEventDetails executionFailedEventDetails;

    private ExecutionStartedEventDetails executionStartedEventDetails;

    private ExecutionSucceededEventDetails executionSucceededEventDetails;

    private ExecutionAbortedEventDetails executionAbortedEventDetails;

    private ExecutionTimedOutEventDetails executionTimedOutEventDetails;

    private LambdaFunctionFailedEventDetails lambdaFunctionFailedEventDetails;

    private LambdaFunctionScheduleFailedEventDetails lambdaFunctionScheduleFailedEventDetails;

    private LambdaFunctionScheduledEventDetails lambdaFunctionScheduledEventDetails;
    /**
     * <p>
     * Contains details about a lambda function that failed to start during an execution.
     * </p>
     */
    private LambdaFunctionStartFailedEventDetails lambdaFunctionStartFailedEventDetails;
    /**
     * <p>
     * Contains details about a lambda function that terminated successfully during an execution.
     * </p>
     */
    private LambdaFunctionSucceededEventDetails lambdaFunctionSucceededEventDetails;

    private LambdaFunctionTimedOutEventDetails lambdaFunctionTimedOutEventDetails;

    private StateEnteredEventDetails stateEnteredEventDetails;

    private StateExitedEventDetails stateExitedEventDetails;

    /**
     * <p>
     * The date and time the event occurred.
     * </p>
     * 
     * @param timestamp
     *        The date and time the event occurred.
     */

    public void setTimestamp(java.util.Date timestamp) {
        this.timestamp = timestamp;
    }

    /**
     * <p>
     * The date and time the event occurred.
     * </p>
     * 
     * @return The date and time the event occurred.
     */

    public java.util.Date getTimestamp() {
        return this.timestamp;
    }

    /**
     * <p>
     * The date and time the event occurred.
     * </p>
     * 
     * @param timestamp
     *        The date and time the event occurred.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withTimestamp(java.util.Date timestamp) {
        setTimestamp(timestamp);
        return this;
    }

    /**
     * <p>
     * The type of the event.
     * </p>
     * 
     * @param type
     *        The type of the event.
     * @see HistoryEventType
     */

    public void setType(String type) {
        this.type = type;
    }

    /**
     * <p>
     * The type of the event.
     * </p>
     * 
     * @return The type of the event.
     * @see HistoryEventType
     */

    public String getType() {
        return this.type;
    }

    /**
     * <p>
     * The type of the event.
     * </p>
     * 
     * @param type
     *        The type of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HistoryEventType
     */

    public HistoryEvent withType(String type) {
        setType(type);
        return this;
    }

    /**
     * <p>
     * The type of the event.
     * </p>
     * 
     * @param type
     *        The type of the event.
     * @see HistoryEventType
     */

    public void setType(HistoryEventType type) {
        withType(type);
    }

    /**
     * <p>
     * The type of the event.
     * </p>
     * 
     * @param type
     *        The type of the event.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see HistoryEventType
     */

    public HistoryEvent withType(HistoryEventType type) {
        this.type = type.toString();
        return this;
    }

    /**
     * <p>
     * The id of the event. Events are numbered sequentially, starting at one.
     * </p>
     * 
     * @param id
     *        The id of the event. Events are numbered sequentially, starting at one.
     */

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * <p>
     * The id of the event. Events are numbered sequentially, starting at one.
     * </p>
     * 
     * @return The id of the event. Events are numbered sequentially, starting at one.
     */

    public Long getId() {
        return this.id;
    }

    /**
     * <p>
     * The id of the event. Events are numbered sequentially, starting at one.
     * </p>
     * 
     * @param id
     *        The id of the event. Events are numbered sequentially, starting at one.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withId(Long id) {
        setId(id);
        return this;
    }

    /**
     * <p>
     * The id of the previous event.
     * </p>
     * 
     * @param previousEventId
     *        The id of the previous event.
     */

    public void setPreviousEventId(Long previousEventId) {
        this.previousEventId = previousEventId;
    }

    /**
     * <p>
     * The id of the previous event.
     * </p>
     * 
     * @return The id of the previous event.
     */

    public Long getPreviousEventId() {
        return this.previousEventId;
    }

    /**
     * <p>
     * The id of the previous event.
     * </p>
     * 
     * @param previousEventId
     *        The id of the previous event.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withPreviousEventId(Long previousEventId) {
        setPreviousEventId(previousEventId);
        return this;
    }

    /**
     * @param activityFailedEventDetails
     */

    public void setActivityFailedEventDetails(ActivityFailedEventDetails activityFailedEventDetails) {
        this.activityFailedEventDetails = activityFailedEventDetails;
    }

    /**
     * @return
     */

    public ActivityFailedEventDetails getActivityFailedEventDetails() {
        return this.activityFailedEventDetails;
    }

    /**
     * @param activityFailedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityFailedEventDetails(ActivityFailedEventDetails activityFailedEventDetails) {
        setActivityFailedEventDetails(activityFailedEventDetails);
        return this;
    }

    /**
     * <p>
     * Contains details about an activity schedule event that failed during an execution.
     * </p>
     * 
     * @param activityScheduleFailedEventDetails
     *        Contains details about an activity schedule event that failed during an execution.
     */

    public void setActivityScheduleFailedEventDetails(ActivityScheduleFailedEventDetails activityScheduleFailedEventDetails) {
        this.activityScheduleFailedEventDetails = activityScheduleFailedEventDetails;
    }

    /**
     * <p>
     * Contains details about an activity schedule event that failed during an execution.
     * </p>
     * 
     * @return Contains details about an activity schedule event that failed during an execution.
     */

    public ActivityScheduleFailedEventDetails getActivityScheduleFailedEventDetails() {
        return this.activityScheduleFailedEventDetails;
    }

    /**
     * <p>
     * Contains details about an activity schedule event that failed during an execution.
     * </p>
     * 
     * @param activityScheduleFailedEventDetails
     *        Contains details about an activity schedule event that failed during an execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityScheduleFailedEventDetails(ActivityScheduleFailedEventDetails activityScheduleFailedEventDetails) {
        setActivityScheduleFailedEventDetails(activityScheduleFailedEventDetails);
        return this;
    }

    /**
     * @param activityScheduledEventDetails
     */

    public void setActivityScheduledEventDetails(ActivityScheduledEventDetails activityScheduledEventDetails) {
        this.activityScheduledEventDetails = activityScheduledEventDetails;
    }

    /**
     * @return
     */

    public ActivityScheduledEventDetails getActivityScheduledEventDetails() {
        return this.activityScheduledEventDetails;
    }

    /**
     * @param activityScheduledEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityScheduledEventDetails(ActivityScheduledEventDetails activityScheduledEventDetails) {
        setActivityScheduledEventDetails(activityScheduledEventDetails);
        return this;
    }

    /**
     * @param activityStartedEventDetails
     */

    public void setActivityStartedEventDetails(ActivityStartedEventDetails activityStartedEventDetails) {
        this.activityStartedEventDetails = activityStartedEventDetails;
    }

    /**
     * @return
     */

    public ActivityStartedEventDetails getActivityStartedEventDetails() {
        return this.activityStartedEventDetails;
    }

    /**
     * @param activityStartedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityStartedEventDetails(ActivityStartedEventDetails activityStartedEventDetails) {
        setActivityStartedEventDetails(activityStartedEventDetails);
        return this;
    }

    /**
     * @param activitySucceededEventDetails
     */

    public void setActivitySucceededEventDetails(ActivitySucceededEventDetails activitySucceededEventDetails) {
        this.activitySucceededEventDetails = activitySucceededEventDetails;
    }

    /**
     * @return
     */

    public ActivitySucceededEventDetails getActivitySucceededEventDetails() {
        return this.activitySucceededEventDetails;
    }

    /**
     * @param activitySucceededEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivitySucceededEventDetails(ActivitySucceededEventDetails activitySucceededEventDetails) {
        setActivitySucceededEventDetails(activitySucceededEventDetails);
        return this;
    }

    /**
     * @param activityTimedOutEventDetails
     */

    public void setActivityTimedOutEventDetails(ActivityTimedOutEventDetails activityTimedOutEventDetails) {
        this.activityTimedOutEventDetails = activityTimedOutEventDetails;
    }

    /**
     * @return
     */

    public ActivityTimedOutEventDetails getActivityTimedOutEventDetails() {
        return this.activityTimedOutEventDetails;
    }

    /**
     * @param activityTimedOutEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withActivityTimedOutEventDetails(ActivityTimedOutEventDetails activityTimedOutEventDetails) {
        setActivityTimedOutEventDetails(activityTimedOutEventDetails);
        return this;
    }

    /**
     * <p>
     * Contains details about the failure of a task.
     * </p>
     * 
     * @param taskFailedEventDetails
     *        Contains details about the failure of a task.
     */

    public void setTaskFailedEventDetails(TaskFailedEventDetails taskFailedEventDetails) {
        this.taskFailedEventDetails = taskFailedEventDetails;
    }

    /**
     * <p>
     * Contains details about the failure of a task.
     * </p>
     * 
     * @return Contains details about the failure of a task.
     */

    public TaskFailedEventDetails getTaskFailedEventDetails() {
        return this.taskFailedEventDetails;
    }

    /**
     * <p>
     * Contains details about the failure of a task.
     * </p>
     * 
     * @param taskFailedEventDetails
     *        Contains details about the failure of a task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withTaskFailedEventDetails(TaskFailedEventDetails taskFailedEventDetails) {
        setTaskFailedEventDetails(taskFailedEventDetails);
        return this;
    }

    /**
     * <p>
     * Contains details about a task that was scheduled.
     * </p>
     * 
     * @param taskScheduledEventDetails
     *        Contains details about a task that was scheduled.
     */

    public void setTaskScheduledEventDetails(TaskScheduledEventDetails taskScheduledEventDetails) {
        this.taskScheduledEventDetails = taskScheduledEventDetails;
    }

    /**
     * <p>
     * Contains details about a task that was scheduled.
     * </p>
     * 
     * @return Contains details about a task that was scheduled.
     */

    public TaskScheduledEventDetails getTaskScheduledEventDetails() {
        return this.taskScheduledEventDetails;
    }

    /**
     * <p>
     * Contains details about a task that was scheduled.
     * </p>
     * 
     * @param taskScheduledEventDetails
     *        Contains details about a task that was scheduled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withTaskScheduledEventDetails(TaskScheduledEventDetails taskScheduledEventDetails) {
        setTaskScheduledEventDetails(taskScheduledEventDetails);
        return this;
    }

    /**
     * <p>
     * Contains details about a task that failed to start.
     * </p>
     * 
     * @param taskStartFailedEventDetails
     *        Contains details about a task that failed to start.
     */

    public void setTaskStartFailedEventDetails(TaskStartFailedEventDetails taskStartFailedEventDetails) {
        this.taskStartFailedEventDetails = taskStartFailedEventDetails;
    }

    /**
     * <p>
     * Contains details about a task that failed to start.
     * </p>
     * 
     * @return Contains details about a task that failed to start.
     */

    public TaskStartFailedEventDetails getTaskStartFailedEventDetails() {
        return this.taskStartFailedEventDetails;
    }

    /**
     * <p>
     * Contains details about a task that failed to start.
     * </p>
     * 
     * @param taskStartFailedEventDetails
     *        Contains details about a task that failed to start.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withTaskStartFailedEventDetails(TaskStartFailedEventDetails taskStartFailedEventDetails) {
        setTaskStartFailedEventDetails(taskStartFailedEventDetails);
        return this;
    }

    /**
     * <p>
     * Contains details about a task that was started.
     * </p>
     * 
     * @param taskStartedEventDetails
     *        Contains details about a task that was started.
     */

    public void setTaskStartedEventDetails(TaskStartedEventDetails taskStartedEventDetails) {
        this.taskStartedEventDetails = taskStartedEventDetails;
    }

    /**
     * <p>
     * Contains details about a task that was started.
     * </p>
     * 
     * @return Contains details about a task that was started.
     */

    public TaskStartedEventDetails getTaskStartedEventDetails() {
        return this.taskStartedEventDetails;
    }

    /**
     * <p>
     * Contains details about a task that was started.
     * </p>
     * 
     * @param taskStartedEventDetails
     *        Contains details about a task that was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withTaskStartedEventDetails(TaskStartedEventDetails taskStartedEventDetails) {
        setTaskStartedEventDetails(taskStartedEventDetails);
        return this;
    }

    /**
     * <p>
     * Contains details about a task that where the submit failed.
     * </p>
     * 
     * @param taskSubmitFailedEventDetails
     *        Contains details about a task that where the submit failed.
     */

    public void setTaskSubmitFailedEventDetails(TaskSubmitFailedEventDetails taskSubmitFailedEventDetails) {
        this.taskSubmitFailedEventDetails = taskSubmitFailedEventDetails;
    }

    /**
     * <p>
     * Contains details about a task that where the submit failed.
     * </p>
     * 
     * @return Contains details about a task that where the submit failed.
     */

    public TaskSubmitFailedEventDetails getTaskSubmitFailedEventDetails() {
        return this.taskSubmitFailedEventDetails;
    }

    /**
     * <p>
     * Contains details about a task that where the submit failed.
     * </p>
     * 
     * @param taskSubmitFailedEventDetails
     *        Contains details about a task that where the submit failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withTaskSubmitFailedEventDetails(TaskSubmitFailedEventDetails taskSubmitFailedEventDetails) {
        setTaskSubmitFailedEventDetails(taskSubmitFailedEventDetails);
        return this;
    }

    /**
     * <p>
     * Contains details about a submitted task.
     * </p>
     * 
     * @param taskSubmittedEventDetails
     *        Contains details about a submitted task.
     */

    public void setTaskSubmittedEventDetails(TaskSubmittedEventDetails taskSubmittedEventDetails) {
        this.taskSubmittedEventDetails = taskSubmittedEventDetails;
    }

    /**
     * <p>
     * Contains details about a submitted task.
     * </p>
     * 
     * @return Contains details about a submitted task.
     */

    public TaskSubmittedEventDetails getTaskSubmittedEventDetails() {
        return this.taskSubmittedEventDetails;
    }

    /**
     * <p>
     * Contains details about a submitted task.
     * </p>
     * 
     * @param taskSubmittedEventDetails
     *        Contains details about a submitted task.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withTaskSubmittedEventDetails(TaskSubmittedEventDetails taskSubmittedEventDetails) {
        setTaskSubmittedEventDetails(taskSubmittedEventDetails);
        return this;
    }

    /**
     * <p>
     * Contains details about a task that succeeded.
     * </p>
     * 
     * @param taskSucceededEventDetails
     *        Contains details about a task that succeeded.
     */

    public void setTaskSucceededEventDetails(TaskSucceededEventDetails taskSucceededEventDetails) {
        this.taskSucceededEventDetails = taskSucceededEventDetails;
    }

    /**
     * <p>
     * Contains details about a task that succeeded.
     * </p>
     * 
     * @return Contains details about a task that succeeded.
     */

    public TaskSucceededEventDetails getTaskSucceededEventDetails() {
        return this.taskSucceededEventDetails;
    }

    /**
     * <p>
     * Contains details about a task that succeeded.
     * </p>
     * 
     * @param taskSucceededEventDetails
     *        Contains details about a task that succeeded.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withTaskSucceededEventDetails(TaskSucceededEventDetails taskSucceededEventDetails) {
        setTaskSucceededEventDetails(taskSucceededEventDetails);
        return this;
    }

    /**
     * <p>
     * Contains details about a task that timed out.
     * </p>
     * 
     * @param taskTimedOutEventDetails
     *        Contains details about a task that timed out.
     */

    public void setTaskTimedOutEventDetails(TaskTimedOutEventDetails taskTimedOutEventDetails) {
        this.taskTimedOutEventDetails = taskTimedOutEventDetails;
    }

    /**
     * <p>
     * Contains details about a task that timed out.
     * </p>
     * 
     * @return Contains details about a task that timed out.
     */

    public TaskTimedOutEventDetails getTaskTimedOutEventDetails() {
        return this.taskTimedOutEventDetails;
    }

    /**
     * <p>
     * Contains details about a task that timed out.
     * </p>
     * 
     * @param taskTimedOutEventDetails
     *        Contains details about a task that timed out.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withTaskTimedOutEventDetails(TaskTimedOutEventDetails taskTimedOutEventDetails) {
        setTaskTimedOutEventDetails(taskTimedOutEventDetails);
        return this;
    }

    /**
     * @param executionFailedEventDetails
     */

    public void setExecutionFailedEventDetails(ExecutionFailedEventDetails executionFailedEventDetails) {
        this.executionFailedEventDetails = executionFailedEventDetails;
    }

    /**
     * @return
     */

    public ExecutionFailedEventDetails getExecutionFailedEventDetails() {
        return this.executionFailedEventDetails;
    }

    /**
     * @param executionFailedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withExecutionFailedEventDetails(ExecutionFailedEventDetails executionFailedEventDetails) {
        setExecutionFailedEventDetails(executionFailedEventDetails);
        return this;
    }

    /**
     * @param executionStartedEventDetails
     */

    public void setExecutionStartedEventDetails(ExecutionStartedEventDetails executionStartedEventDetails) {
        this.executionStartedEventDetails = executionStartedEventDetails;
    }

    /**
     * @return
     */

    public ExecutionStartedEventDetails getExecutionStartedEventDetails() {
        return this.executionStartedEventDetails;
    }

    /**
     * @param executionStartedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withExecutionStartedEventDetails(ExecutionStartedEventDetails executionStartedEventDetails) {
        setExecutionStartedEventDetails(executionStartedEventDetails);
        return this;
    }

    /**
     * @param executionSucceededEventDetails
     */

    public void setExecutionSucceededEventDetails(ExecutionSucceededEventDetails executionSucceededEventDetails) {
        this.executionSucceededEventDetails = executionSucceededEventDetails;
    }

    /**
     * @return
     */

    public ExecutionSucceededEventDetails getExecutionSucceededEventDetails() {
        return this.executionSucceededEventDetails;
    }

    /**
     * @param executionSucceededEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withExecutionSucceededEventDetails(ExecutionSucceededEventDetails executionSucceededEventDetails) {
        setExecutionSucceededEventDetails(executionSucceededEventDetails);
        return this;
    }

    /**
     * @param executionAbortedEventDetails
     */

    public void setExecutionAbortedEventDetails(ExecutionAbortedEventDetails executionAbortedEventDetails) {
        this.executionAbortedEventDetails = executionAbortedEventDetails;
    }

    /**
     * @return
     */

    public ExecutionAbortedEventDetails getExecutionAbortedEventDetails() {
        return this.executionAbortedEventDetails;
    }

    /**
     * @param executionAbortedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withExecutionAbortedEventDetails(ExecutionAbortedEventDetails executionAbortedEventDetails) {
        setExecutionAbortedEventDetails(executionAbortedEventDetails);
        return this;
    }

    /**
     * @param executionTimedOutEventDetails
     */

    public void setExecutionTimedOutEventDetails(ExecutionTimedOutEventDetails executionTimedOutEventDetails) {
        this.executionTimedOutEventDetails = executionTimedOutEventDetails;
    }

    /**
     * @return
     */

    public ExecutionTimedOutEventDetails getExecutionTimedOutEventDetails() {
        return this.executionTimedOutEventDetails;
    }

    /**
     * @param executionTimedOutEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withExecutionTimedOutEventDetails(ExecutionTimedOutEventDetails executionTimedOutEventDetails) {
        setExecutionTimedOutEventDetails(executionTimedOutEventDetails);
        return this;
    }

    /**
     * @param lambdaFunctionFailedEventDetails
     */

    public void setLambdaFunctionFailedEventDetails(LambdaFunctionFailedEventDetails lambdaFunctionFailedEventDetails) {
        this.lambdaFunctionFailedEventDetails = lambdaFunctionFailedEventDetails;
    }

    /**
     * @return
     */

    public LambdaFunctionFailedEventDetails getLambdaFunctionFailedEventDetails() {
        return this.lambdaFunctionFailedEventDetails;
    }

    /**
     * @param lambdaFunctionFailedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionFailedEventDetails(LambdaFunctionFailedEventDetails lambdaFunctionFailedEventDetails) {
        setLambdaFunctionFailedEventDetails(lambdaFunctionFailedEventDetails);
        return this;
    }

    /**
     * @param lambdaFunctionScheduleFailedEventDetails
     */

    public void setLambdaFunctionScheduleFailedEventDetails(LambdaFunctionScheduleFailedEventDetails lambdaFunctionScheduleFailedEventDetails) {
        this.lambdaFunctionScheduleFailedEventDetails = lambdaFunctionScheduleFailedEventDetails;
    }

    /**
     * @return
     */

    public LambdaFunctionScheduleFailedEventDetails getLambdaFunctionScheduleFailedEventDetails() {
        return this.lambdaFunctionScheduleFailedEventDetails;
    }

    /**
     * @param lambdaFunctionScheduleFailedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionScheduleFailedEventDetails(LambdaFunctionScheduleFailedEventDetails lambdaFunctionScheduleFailedEventDetails) {
        setLambdaFunctionScheduleFailedEventDetails(lambdaFunctionScheduleFailedEventDetails);
        return this;
    }

    /**
     * @param lambdaFunctionScheduledEventDetails
     */

    public void setLambdaFunctionScheduledEventDetails(LambdaFunctionScheduledEventDetails lambdaFunctionScheduledEventDetails) {
        this.lambdaFunctionScheduledEventDetails = lambdaFunctionScheduledEventDetails;
    }

    /**
     * @return
     */

    public LambdaFunctionScheduledEventDetails getLambdaFunctionScheduledEventDetails() {
        return this.lambdaFunctionScheduledEventDetails;
    }

    /**
     * @param lambdaFunctionScheduledEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionScheduledEventDetails(LambdaFunctionScheduledEventDetails lambdaFunctionScheduledEventDetails) {
        setLambdaFunctionScheduledEventDetails(lambdaFunctionScheduledEventDetails);
        return this;
    }

    /**
     * <p>
     * Contains details about a lambda function that failed to start during an execution.
     * </p>
     * 
     * @param lambdaFunctionStartFailedEventDetails
     *        Contains details about a lambda function that failed to start during an execution.
     */

    public void setLambdaFunctionStartFailedEventDetails(LambdaFunctionStartFailedEventDetails lambdaFunctionStartFailedEventDetails) {
        this.lambdaFunctionStartFailedEventDetails = lambdaFunctionStartFailedEventDetails;
    }

    /**
     * <p>
     * Contains details about a lambda function that failed to start during an execution.
     * </p>
     * 
     * @return Contains details about a lambda function that failed to start during an execution.
     */

    public LambdaFunctionStartFailedEventDetails getLambdaFunctionStartFailedEventDetails() {
        return this.lambdaFunctionStartFailedEventDetails;
    }

    /**
     * <p>
     * Contains details about a lambda function that failed to start during an execution.
     * </p>
     * 
     * @param lambdaFunctionStartFailedEventDetails
     *        Contains details about a lambda function that failed to start during an execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionStartFailedEventDetails(LambdaFunctionStartFailedEventDetails lambdaFunctionStartFailedEventDetails) {
        setLambdaFunctionStartFailedEventDetails(lambdaFunctionStartFailedEventDetails);
        return this;
    }

    /**
     * <p>
     * Contains details about a lambda function that terminated successfully during an execution.
     * </p>
     * 
     * @param lambdaFunctionSucceededEventDetails
     *        Contains details about a lambda function that terminated successfully during an execution.
     */

    public void setLambdaFunctionSucceededEventDetails(LambdaFunctionSucceededEventDetails lambdaFunctionSucceededEventDetails) {
        this.lambdaFunctionSucceededEventDetails = lambdaFunctionSucceededEventDetails;
    }

    /**
     * <p>
     * Contains details about a lambda function that terminated successfully during an execution.
     * </p>
     * 
     * @return Contains details about a lambda function that terminated successfully during an execution.
     */

    public LambdaFunctionSucceededEventDetails getLambdaFunctionSucceededEventDetails() {
        return this.lambdaFunctionSucceededEventDetails;
    }

    /**
     * <p>
     * Contains details about a lambda function that terminated successfully during an execution.
     * </p>
     * 
     * @param lambdaFunctionSucceededEventDetails
     *        Contains details about a lambda function that terminated successfully during an execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionSucceededEventDetails(LambdaFunctionSucceededEventDetails lambdaFunctionSucceededEventDetails) {
        setLambdaFunctionSucceededEventDetails(lambdaFunctionSucceededEventDetails);
        return this;
    }

    /**
     * @param lambdaFunctionTimedOutEventDetails
     */

    public void setLambdaFunctionTimedOutEventDetails(LambdaFunctionTimedOutEventDetails lambdaFunctionTimedOutEventDetails) {
        this.lambdaFunctionTimedOutEventDetails = lambdaFunctionTimedOutEventDetails;
    }

    /**
     * @return
     */

    public LambdaFunctionTimedOutEventDetails getLambdaFunctionTimedOutEventDetails() {
        return this.lambdaFunctionTimedOutEventDetails;
    }

    /**
     * @param lambdaFunctionTimedOutEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withLambdaFunctionTimedOutEventDetails(LambdaFunctionTimedOutEventDetails lambdaFunctionTimedOutEventDetails) {
        setLambdaFunctionTimedOutEventDetails(lambdaFunctionTimedOutEventDetails);
        return this;
    }

    /**
     * @param stateEnteredEventDetails
     */

    public void setStateEnteredEventDetails(StateEnteredEventDetails stateEnteredEventDetails) {
        this.stateEnteredEventDetails = stateEnteredEventDetails;
    }

    /**
     * @return
     */

    public StateEnteredEventDetails getStateEnteredEventDetails() {
        return this.stateEnteredEventDetails;
    }

    /**
     * @param stateEnteredEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withStateEnteredEventDetails(StateEnteredEventDetails stateEnteredEventDetails) {
        setStateEnteredEventDetails(stateEnteredEventDetails);
        return this;
    }

    /**
     * @param stateExitedEventDetails
     */

    public void setStateExitedEventDetails(StateExitedEventDetails stateExitedEventDetails) {
        this.stateExitedEventDetails = stateExitedEventDetails;
    }

    /**
     * @return
     */

    public StateExitedEventDetails getStateExitedEventDetails() {
        return this.stateExitedEventDetails;
    }

    /**
     * @param stateExitedEventDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public HistoryEvent withStateExitedEventDetails(StateExitedEventDetails stateExitedEventDetails) {
        setStateExitedEventDetails(stateExitedEventDetails);
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
        if (getTimestamp() != null)
            sb.append("Timestamp: ").append(getTimestamp()).append(",");
        if (getType() != null)
            sb.append("Type: ").append(getType()).append(",");
        if (getId() != null)
            sb.append("Id: ").append(getId()).append(",");
        if (getPreviousEventId() != null)
            sb.append("PreviousEventId: ").append(getPreviousEventId()).append(",");
        if (getActivityFailedEventDetails() != null)
            sb.append("ActivityFailedEventDetails: ").append(getActivityFailedEventDetails()).append(",");
        if (getActivityScheduleFailedEventDetails() != null)
            sb.append("ActivityScheduleFailedEventDetails: ").append(getActivityScheduleFailedEventDetails()).append(",");
        if (getActivityScheduledEventDetails() != null)
            sb.append("ActivityScheduledEventDetails: ").append(getActivityScheduledEventDetails()).append(",");
        if (getActivityStartedEventDetails() != null)
            sb.append("ActivityStartedEventDetails: ").append(getActivityStartedEventDetails()).append(",");
        if (getActivitySucceededEventDetails() != null)
            sb.append("ActivitySucceededEventDetails: ").append(getActivitySucceededEventDetails()).append(",");
        if (getActivityTimedOutEventDetails() != null)
            sb.append("ActivityTimedOutEventDetails: ").append(getActivityTimedOutEventDetails()).append(",");
        if (getTaskFailedEventDetails() != null)
            sb.append("TaskFailedEventDetails: ").append(getTaskFailedEventDetails()).append(",");
        if (getTaskScheduledEventDetails() != null)
            sb.append("TaskScheduledEventDetails: ").append(getTaskScheduledEventDetails()).append(",");
        if (getTaskStartFailedEventDetails() != null)
            sb.append("TaskStartFailedEventDetails: ").append(getTaskStartFailedEventDetails()).append(",");
        if (getTaskStartedEventDetails() != null)
            sb.append("TaskStartedEventDetails: ").append(getTaskStartedEventDetails()).append(",");
        if (getTaskSubmitFailedEventDetails() != null)
            sb.append("TaskSubmitFailedEventDetails: ").append(getTaskSubmitFailedEventDetails()).append(",");
        if (getTaskSubmittedEventDetails() != null)
            sb.append("TaskSubmittedEventDetails: ").append(getTaskSubmittedEventDetails()).append(",");
        if (getTaskSucceededEventDetails() != null)
            sb.append("TaskSucceededEventDetails: ").append(getTaskSucceededEventDetails()).append(",");
        if (getTaskTimedOutEventDetails() != null)
            sb.append("TaskTimedOutEventDetails: ").append(getTaskTimedOutEventDetails()).append(",");
        if (getExecutionFailedEventDetails() != null)
            sb.append("ExecutionFailedEventDetails: ").append(getExecutionFailedEventDetails()).append(",");
        if (getExecutionStartedEventDetails() != null)
            sb.append("ExecutionStartedEventDetails: ").append(getExecutionStartedEventDetails()).append(",");
        if (getExecutionSucceededEventDetails() != null)
            sb.append("ExecutionSucceededEventDetails: ").append(getExecutionSucceededEventDetails()).append(",");
        if (getExecutionAbortedEventDetails() != null)
            sb.append("ExecutionAbortedEventDetails: ").append(getExecutionAbortedEventDetails()).append(",");
        if (getExecutionTimedOutEventDetails() != null)
            sb.append("ExecutionTimedOutEventDetails: ").append(getExecutionTimedOutEventDetails()).append(",");
        if (getLambdaFunctionFailedEventDetails() != null)
            sb.append("LambdaFunctionFailedEventDetails: ").append(getLambdaFunctionFailedEventDetails()).append(",");
        if (getLambdaFunctionScheduleFailedEventDetails() != null)
            sb.append("LambdaFunctionScheduleFailedEventDetails: ").append(getLambdaFunctionScheduleFailedEventDetails()).append(",");
        if (getLambdaFunctionScheduledEventDetails() != null)
            sb.append("LambdaFunctionScheduledEventDetails: ").append(getLambdaFunctionScheduledEventDetails()).append(",");
        if (getLambdaFunctionStartFailedEventDetails() != null)
            sb.append("LambdaFunctionStartFailedEventDetails: ").append(getLambdaFunctionStartFailedEventDetails()).append(",");
        if (getLambdaFunctionSucceededEventDetails() != null)
            sb.append("LambdaFunctionSucceededEventDetails: ").append(getLambdaFunctionSucceededEventDetails()).append(",");
        if (getLambdaFunctionTimedOutEventDetails() != null)
            sb.append("LambdaFunctionTimedOutEventDetails: ").append(getLambdaFunctionTimedOutEventDetails()).append(",");
        if (getStateEnteredEventDetails() != null)
            sb.append("StateEnteredEventDetails: ").append(getStateEnteredEventDetails()).append(",");
        if (getStateExitedEventDetails() != null)
            sb.append("StateExitedEventDetails: ").append(getStateExitedEventDetails());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof HistoryEvent == false)
            return false;
        HistoryEvent other = (HistoryEvent) obj;
        if (other.getTimestamp() == null ^ this.getTimestamp() == null)
            return false;
        if (other.getTimestamp() != null && other.getTimestamp().equals(this.getTimestamp()) == false)
            return false;
        if (other.getType() == null ^ this.getType() == null)
            return false;
        if (other.getType() != null && other.getType().equals(this.getType()) == false)
            return false;
        if (other.getId() == null ^ this.getId() == null)
            return false;
        if (other.getId() != null && other.getId().equals(this.getId()) == false)
            return false;
        if (other.getPreviousEventId() == null ^ this.getPreviousEventId() == null)
            return false;
        if (other.getPreviousEventId() != null && other.getPreviousEventId().equals(this.getPreviousEventId()) == false)
            return false;
        if (other.getActivityFailedEventDetails() == null ^ this.getActivityFailedEventDetails() == null)
            return false;
        if (other.getActivityFailedEventDetails() != null && other.getActivityFailedEventDetails().equals(this.getActivityFailedEventDetails()) == false)
            return false;
        if (other.getActivityScheduleFailedEventDetails() == null ^ this.getActivityScheduleFailedEventDetails() == null)
            return false;
        if (other.getActivityScheduleFailedEventDetails() != null
                && other.getActivityScheduleFailedEventDetails().equals(this.getActivityScheduleFailedEventDetails()) == false)
            return false;
        if (other.getActivityScheduledEventDetails() == null ^ this.getActivityScheduledEventDetails() == null)
            return false;
        if (other.getActivityScheduledEventDetails() != null
                && other.getActivityScheduledEventDetails().equals(this.getActivityScheduledEventDetails()) == false)
            return false;
        if (other.getActivityStartedEventDetails() == null ^ this.getActivityStartedEventDetails() == null)
            return false;
        if (other.getActivityStartedEventDetails() != null && other.getActivityStartedEventDetails().equals(this.getActivityStartedEventDetails()) == false)
            return false;
        if (other.getActivitySucceededEventDetails() == null ^ this.getActivitySucceededEventDetails() == null)
            return false;
        if (other.getActivitySucceededEventDetails() != null
                && other.getActivitySucceededEventDetails().equals(this.getActivitySucceededEventDetails()) == false)
            return false;
        if (other.getActivityTimedOutEventDetails() == null ^ this.getActivityTimedOutEventDetails() == null)
            return false;
        if (other.getActivityTimedOutEventDetails() != null && other.getActivityTimedOutEventDetails().equals(this.getActivityTimedOutEventDetails()) == false)
            return false;
        if (other.getTaskFailedEventDetails() == null ^ this.getTaskFailedEventDetails() == null)
            return false;
        if (other.getTaskFailedEventDetails() != null && other.getTaskFailedEventDetails().equals(this.getTaskFailedEventDetails()) == false)
            return false;
        if (other.getTaskScheduledEventDetails() == null ^ this.getTaskScheduledEventDetails() == null)
            return false;
        if (other.getTaskScheduledEventDetails() != null && other.getTaskScheduledEventDetails().equals(this.getTaskScheduledEventDetails()) == false)
            return false;
        if (other.getTaskStartFailedEventDetails() == null ^ this.getTaskStartFailedEventDetails() == null)
            return false;
        if (other.getTaskStartFailedEventDetails() != null && other.getTaskStartFailedEventDetails().equals(this.getTaskStartFailedEventDetails()) == false)
            return false;
        if (other.getTaskStartedEventDetails() == null ^ this.getTaskStartedEventDetails() == null)
            return false;
        if (other.getTaskStartedEventDetails() != null && other.getTaskStartedEventDetails().equals(this.getTaskStartedEventDetails()) == false)
            return false;
        if (other.getTaskSubmitFailedEventDetails() == null ^ this.getTaskSubmitFailedEventDetails() == null)
            return false;
        if (other.getTaskSubmitFailedEventDetails() != null && other.getTaskSubmitFailedEventDetails().equals(this.getTaskSubmitFailedEventDetails()) == false)
            return false;
        if (other.getTaskSubmittedEventDetails() == null ^ this.getTaskSubmittedEventDetails() == null)
            return false;
        if (other.getTaskSubmittedEventDetails() != null && other.getTaskSubmittedEventDetails().equals(this.getTaskSubmittedEventDetails()) == false)
            return false;
        if (other.getTaskSucceededEventDetails() == null ^ this.getTaskSucceededEventDetails() == null)
            return false;
        if (other.getTaskSucceededEventDetails() != null && other.getTaskSucceededEventDetails().equals(this.getTaskSucceededEventDetails()) == false)
            return false;
        if (other.getTaskTimedOutEventDetails() == null ^ this.getTaskTimedOutEventDetails() == null)
            return false;
        if (other.getTaskTimedOutEventDetails() != null && other.getTaskTimedOutEventDetails().equals(this.getTaskTimedOutEventDetails()) == false)
            return false;
        if (other.getExecutionFailedEventDetails() == null ^ this.getExecutionFailedEventDetails() == null)
            return false;
        if (other.getExecutionFailedEventDetails() != null && other.getExecutionFailedEventDetails().equals(this.getExecutionFailedEventDetails()) == false)
            return false;
        if (other.getExecutionStartedEventDetails() == null ^ this.getExecutionStartedEventDetails() == null)
            return false;
        if (other.getExecutionStartedEventDetails() != null && other.getExecutionStartedEventDetails().equals(this.getExecutionStartedEventDetails()) == false)
            return false;
        if (other.getExecutionSucceededEventDetails() == null ^ this.getExecutionSucceededEventDetails() == null)
            return false;
        if (other.getExecutionSucceededEventDetails() != null
                && other.getExecutionSucceededEventDetails().equals(this.getExecutionSucceededEventDetails()) == false)
            return false;
        if (other.getExecutionAbortedEventDetails() == null ^ this.getExecutionAbortedEventDetails() == null)
            return false;
        if (other.getExecutionAbortedEventDetails() != null && other.getExecutionAbortedEventDetails().equals(this.getExecutionAbortedEventDetails()) == false)
            return false;
        if (other.getExecutionTimedOutEventDetails() == null ^ this.getExecutionTimedOutEventDetails() == null)
            return false;
        if (other.getExecutionTimedOutEventDetails() != null
                && other.getExecutionTimedOutEventDetails().equals(this.getExecutionTimedOutEventDetails()) == false)
            return false;
        if (other.getLambdaFunctionFailedEventDetails() == null ^ this.getLambdaFunctionFailedEventDetails() == null)
            return false;
        if (other.getLambdaFunctionFailedEventDetails() != null
                && other.getLambdaFunctionFailedEventDetails().equals(this.getLambdaFunctionFailedEventDetails()) == false)
            return false;
        if (other.getLambdaFunctionScheduleFailedEventDetails() == null ^ this.getLambdaFunctionScheduleFailedEventDetails() == null)
            return false;
        if (other.getLambdaFunctionScheduleFailedEventDetails() != null
                && other.getLambdaFunctionScheduleFailedEventDetails().equals(this.getLambdaFunctionScheduleFailedEventDetails()) == false)
            return false;
        if (other.getLambdaFunctionScheduledEventDetails() == null ^ this.getLambdaFunctionScheduledEventDetails() == null)
            return false;
        if (other.getLambdaFunctionScheduledEventDetails() != null
                && other.getLambdaFunctionScheduledEventDetails().equals(this.getLambdaFunctionScheduledEventDetails()) == false)
            return false;
        if (other.getLambdaFunctionStartFailedEventDetails() == null ^ this.getLambdaFunctionStartFailedEventDetails() == null)
            return false;
        if (other.getLambdaFunctionStartFailedEventDetails() != null
                && other.getLambdaFunctionStartFailedEventDetails().equals(this.getLambdaFunctionStartFailedEventDetails()) == false)
            return false;
        if (other.getLambdaFunctionSucceededEventDetails() == null ^ this.getLambdaFunctionSucceededEventDetails() == null)
            return false;
        if (other.getLambdaFunctionSucceededEventDetails() != null
                && other.getLambdaFunctionSucceededEventDetails().equals(this.getLambdaFunctionSucceededEventDetails()) == false)
            return false;
        if (other.getLambdaFunctionTimedOutEventDetails() == null ^ this.getLambdaFunctionTimedOutEventDetails() == null)
            return false;
        if (other.getLambdaFunctionTimedOutEventDetails() != null
                && other.getLambdaFunctionTimedOutEventDetails().equals(this.getLambdaFunctionTimedOutEventDetails()) == false)
            return false;
        if (other.getStateEnteredEventDetails() == null ^ this.getStateEnteredEventDetails() == null)
            return false;
        if (other.getStateEnteredEventDetails() != null && other.getStateEnteredEventDetails().equals(this.getStateEnteredEventDetails()) == false)
            return false;
        if (other.getStateExitedEventDetails() == null ^ this.getStateExitedEventDetails() == null)
            return false;
        if (other.getStateExitedEventDetails() != null && other.getStateExitedEventDetails().equals(this.getStateExitedEventDetails()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTimestamp() == null) ? 0 : getTimestamp().hashCode());
        hashCode = prime * hashCode + ((getType() == null) ? 0 : getType().hashCode());
        hashCode = prime * hashCode + ((getId() == null) ? 0 : getId().hashCode());
        hashCode = prime * hashCode + ((getPreviousEventId() == null) ? 0 : getPreviousEventId().hashCode());
        hashCode = prime * hashCode + ((getActivityFailedEventDetails() == null) ? 0 : getActivityFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getActivityScheduleFailedEventDetails() == null) ? 0 : getActivityScheduleFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getActivityScheduledEventDetails() == null) ? 0 : getActivityScheduledEventDetails().hashCode());
        hashCode = prime * hashCode + ((getActivityStartedEventDetails() == null) ? 0 : getActivityStartedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getActivitySucceededEventDetails() == null) ? 0 : getActivitySucceededEventDetails().hashCode());
        hashCode = prime * hashCode + ((getActivityTimedOutEventDetails() == null) ? 0 : getActivityTimedOutEventDetails().hashCode());
        hashCode = prime * hashCode + ((getTaskFailedEventDetails() == null) ? 0 : getTaskFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getTaskScheduledEventDetails() == null) ? 0 : getTaskScheduledEventDetails().hashCode());
        hashCode = prime * hashCode + ((getTaskStartFailedEventDetails() == null) ? 0 : getTaskStartFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getTaskStartedEventDetails() == null) ? 0 : getTaskStartedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getTaskSubmitFailedEventDetails() == null) ? 0 : getTaskSubmitFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getTaskSubmittedEventDetails() == null) ? 0 : getTaskSubmittedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getTaskSucceededEventDetails() == null) ? 0 : getTaskSucceededEventDetails().hashCode());
        hashCode = prime * hashCode + ((getTaskTimedOutEventDetails() == null) ? 0 : getTaskTimedOutEventDetails().hashCode());
        hashCode = prime * hashCode + ((getExecutionFailedEventDetails() == null) ? 0 : getExecutionFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getExecutionStartedEventDetails() == null) ? 0 : getExecutionStartedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getExecutionSucceededEventDetails() == null) ? 0 : getExecutionSucceededEventDetails().hashCode());
        hashCode = prime * hashCode + ((getExecutionAbortedEventDetails() == null) ? 0 : getExecutionAbortedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getExecutionTimedOutEventDetails() == null) ? 0 : getExecutionTimedOutEventDetails().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionFailedEventDetails() == null) ? 0 : getLambdaFunctionFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionScheduleFailedEventDetails() == null) ? 0 : getLambdaFunctionScheduleFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionScheduledEventDetails() == null) ? 0 : getLambdaFunctionScheduledEventDetails().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionStartFailedEventDetails() == null) ? 0 : getLambdaFunctionStartFailedEventDetails().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionSucceededEventDetails() == null) ? 0 : getLambdaFunctionSucceededEventDetails().hashCode());
        hashCode = prime * hashCode + ((getLambdaFunctionTimedOutEventDetails() == null) ? 0 : getLambdaFunctionTimedOutEventDetails().hashCode());
        hashCode = prime * hashCode + ((getStateEnteredEventDetails() == null) ? 0 : getStateEnteredEventDetails().hashCode());
        hashCode = prime * hashCode + ((getStateExitedEventDetails() == null) ? 0 : getStateExitedEventDetails().hashCode());
        return hashCode;
    }

    @Override
    public HistoryEvent clone() {
        try {
            return (HistoryEvent) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.stepfunctions.model.transform.HistoryEventMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
