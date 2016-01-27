/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.simpleworkflow.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#startWorkflowExecution(StartWorkflowExecutionRequest) StartWorkflowExecution operation}.
 * <p>
 * Starts an execution of the workflow type in the specified domain using
 * the provided <code>workflowId</code> and input data.
 * </p>
 * <p>
 * This action returns the newly started workflow execution.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this action's access to Amazon SWF
 * resources as follows:
 * </p>
 * 
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit
 * the action to only specified domains.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to
 * call this action.</li>
 * <li>Constrain the following parameters by using a
 * <code>Condition</code> element with the appropriate keys.
 * <ul>
 * <li> <code>tagList.member.0</code> : The key is
 * <code>swf:tagList.member.0</code> .</li>
 * <li> <code>tagList.member.1</code> : The key is
 * <code>swf:tagList.member.1</code> .</li>
 * <li> <code>tagList.member.2</code> : The key is
 * <code>swf:tagList.member.2</code> .</li>
 * <li> <code>tagList.member.3</code> : The key is
 * <code>swf:tagList.member.3</code> .</li>
 * <li> <code>tagList.member.4</code> : The key is
 * <code>swf:tagList.member.4</code> .</li>
 * <li> <code>taskList</code> : String constraint. The key is
 * <code>swf:taskList.name</code> .</li>
 * <li> <code>workflowType.name</code> : String constraint. The key is
 * <code>swf:workflowType.name</code> .</li>
 * <li> <code>workflowType.version</code> : String constraint. The key
 * is <code>swf:workflowType.version</code> .</li>
 * 
 * </ul>
 * </li>
 * 
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the
 * action, or the parameter values fall outside the specified
 * constraints, the action fails. The associated event attribute's
 * <b>cause</b> parameter will be set to OPERATION_NOT_PERMITTED. For
 * details and example IAM policies, see
 * <a href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#startWorkflowExecution(StartWorkflowExecutionRequest)
 */
public class StartWorkflowExecutionRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The name of the domain in which the workflow execution is created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String domain;

    /**
     * The user defined identifier associated with the workflow execution.
     * You can use this to associate a custom identifier with the workflow
     * execution. You may specify the same identifier if a workflow execution
     * is logically a <i>restart</i> of a previous execution. You cannot have
     * two open workflow executions with the same <code>workflowId</code> at
     * the same time. <p>The specified string must not start or end with
     * whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String workflowId;

    /**
     * The type of the workflow to start.
     */
    private WorkflowType workflowType;

    /**
     * The task list to use for the decision tasks generated for this
     * workflow execution. This overrides the <code>defaultTaskList</code>
     * specified when registering the workflow type. <note>A task list for
     * this workflow execution must be specified either as a default for the
     * workflow type or through this parameter. If neither this parameter is
     * set nor a default task list was specified at registration time then a
     * fault will be returned.</note> <p>The specified string must not start
     * or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     */
    private TaskList taskList;

    /**
     * The task priority to use for this workflow execution. This will
     * override any default priority that was assigned when the workflow type
     * was registered. If not set, then the default task priority for the
     * workflow type will be used. Valid values are integers that range from
     * Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     * higher priority. <p>For more information about setting task priority,
     * see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     * Task Priority</a> in the <i>Amazon Simple Workflow Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 11<br/>
     */
    private String taskPriority;

    /**
     * The input for the workflow execution. This is a free form string which
     * should be meaningful to the workflow you are starting. This
     * <code>input</code> is made available to the new workflow execution in
     * the <code>WorkflowExecutionStarted</code> history event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     */
    private String input;

    /**
     * The total duration for this workflow execution. This overrides the
     * defaultExecutionStartToCloseTimeout specified when registering the
     * workflow type. <p>The duration is specified in seconds; an integer
     * greater than or equal to 0. Exceeding this limit will cause the
     * workflow execution to time out. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * this timeout; there is a one-year max limit on the time that a
     * workflow execution can run. <note> An execution start-to-close timeout
     * must be specified either through this parameter or as a default when
     * the workflow type is registered. If neither this parameter nor a
     * default execution start-to-close timeout is specified, a fault is
     * returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String executionStartToCloseTimeout;

    /**
     * The list of tags to associate with the workflow execution. You can
     * specify a maximum of 5 tags. You can list workflow executions with a
     * specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagList;

    /**
     * Specifies the maximum duration of decision tasks for this workflow
     * execution. This parameter overrides the
     * <code>defaultTaskStartToCloseTimout</code> specified when registering
     * the workflow type using <a>RegisterWorkflowType</a>. <p>The duration
     * is specified in seconds; an integer greater than or equal to 0. The
     * value "NONE" can be used to specify unlimited duration. <note>A task
     * start-to-close timeout for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default task start-to-close
     * timeout was specified at registration time then a fault will be
     * returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String taskStartToCloseTimeout;

    /**
     * If set, specifies the policy to use for the child workflow executions
     * of this workflow execution if it is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy
     * specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>. <p>The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event.</li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default child policy was
     * specified at registration time then a fault will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     */
    private String childPolicy;

    /**
     * The ARN of an IAM role that authorizes Amazon SWF to invoke AWS Lambda
     * functions. <note>In order for this workflow execution to invoke AWS
     * Lambda functions, an appropriate IAM role must be specified either as
     * a default for the workflow type or through this field.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     */
    private String lambdaRole;

    /**
     * The name of the domain in which the workflow execution is created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the domain in which the workflow execution is created.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The name of the domain in which the workflow execution is created.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain in which the workflow execution is created.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The name of the domain in which the workflow execution is created.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain in which the workflow execution is created.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartWorkflowExecutionRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * The user defined identifier associated with the workflow execution.
     * You can use this to associate a custom identifier with the workflow
     * execution. You may specify the same identifier if a workflow execution
     * is logically a <i>restart</i> of a previous execution. You cannot have
     * two open workflow executions with the same <code>workflowId</code> at
     * the same time. <p>The specified string must not start or end with
     * whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The user defined identifier associated with the workflow execution.
     *         You can use this to associate a custom identifier with the workflow
     *         execution. You may specify the same identifier if a workflow execution
     *         is logically a <i>restart</i> of a previous execution. You cannot have
     *         two open workflow executions with the same <code>workflowId</code> at
     *         the same time. <p>The specified string must not start or end with
     *         whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     */
    public String getWorkflowId() {
        return workflowId;
    }
    
    /**
     * The user defined identifier associated with the workflow execution.
     * You can use this to associate a custom identifier with the workflow
     * execution. You may specify the same identifier if a workflow execution
     * is logically a <i>restart</i> of a previous execution. You cannot have
     * two open workflow executions with the same <code>workflowId</code> at
     * the same time. <p>The specified string must not start or end with
     * whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The user defined identifier associated with the workflow execution.
     *         You can use this to associate a custom identifier with the workflow
     *         execution. You may specify the same identifier if a workflow execution
     *         is logically a <i>restart</i> of a previous execution. You cannot have
     *         two open workflow executions with the same <code>workflowId</code> at
     *         the same time. <p>The specified string must not start or end with
     *         whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     */
    public void setWorkflowId(String workflowId) {
        this.workflowId = workflowId;
    }
    
    /**
     * The user defined identifier associated with the workflow execution.
     * You can use this to associate a custom identifier with the workflow
     * execution. You may specify the same identifier if a workflow execution
     * is logically a <i>restart</i> of a previous execution. You cannot have
     * two open workflow executions with the same <code>workflowId</code> at
     * the same time. <p>The specified string must not start or end with
     * whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param workflowId The user defined identifier associated with the workflow execution.
     *         You can use this to associate a custom identifier with the workflow
     *         execution. You may specify the same identifier if a workflow execution
     *         is logically a <i>restart</i> of a previous execution. You cannot have
     *         two open workflow executions with the same <code>workflowId</code> at
     *         the same time. <p>The specified string must not start or end with
     *         whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartWorkflowExecutionRequest withWorkflowId(String workflowId) {
        this.workflowId = workflowId;
        return this;
    }

    /**
     * The type of the workflow to start.
     *
     * @return The type of the workflow to start.
     */
    public WorkflowType getWorkflowType() {
        return workflowType;
    }
    
    /**
     * The type of the workflow to start.
     *
     * @param workflowType The type of the workflow to start.
     */
    public void setWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
    }
    
    /**
     * The type of the workflow to start.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param workflowType The type of the workflow to start.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartWorkflowExecutionRequest withWorkflowType(WorkflowType workflowType) {
        this.workflowType = workflowType;
        return this;
    }

    /**
     * The task list to use for the decision tasks generated for this
     * workflow execution. This overrides the <code>defaultTaskList</code>
     * specified when registering the workflow type. <note>A task list for
     * this workflow execution must be specified either as a default for the
     * workflow type or through this parameter. If neither this parameter is
     * set nor a default task list was specified at registration time then a
     * fault will be returned.</note> <p>The specified string must not start
     * or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     *
     * @return The task list to use for the decision tasks generated for this
     *         workflow execution. This overrides the <code>defaultTaskList</code>
     *         specified when registering the workflow type. <note>A task list for
     *         this workflow execution must be specified either as a default for the
     *         workflow type or through this parameter. If neither this parameter is
     *         set nor a default task list was specified at registration time then a
     *         fault will be returned.</note> <p>The specified string must not start
     *         or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     */
    public TaskList getTaskList() {
        return taskList;
    }
    
    /**
     * The task list to use for the decision tasks generated for this
     * workflow execution. This overrides the <code>defaultTaskList</code>
     * specified when registering the workflow type. <note>A task list for
     * this workflow execution must be specified either as a default for the
     * workflow type or through this parameter. If neither this parameter is
     * set nor a default task list was specified at registration time then a
     * fault will be returned.</note> <p>The specified string must not start
     * or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     *
     * @param taskList The task list to use for the decision tasks generated for this
     *         workflow execution. This overrides the <code>defaultTaskList</code>
     *         specified when registering the workflow type. <note>A task list for
     *         this workflow execution must be specified either as a default for the
     *         workflow type or through this parameter. If neither this parameter is
     *         set nor a default task list was specified at registration time then a
     *         fault will be returned.</note> <p>The specified string must not start
     *         or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     */
    public void setTaskList(TaskList taskList) {
        this.taskList = taskList;
    }
    
    /**
     * The task list to use for the decision tasks generated for this
     * workflow execution. This overrides the <code>defaultTaskList</code>
     * specified when registering the workflow type. <note>A task list for
     * this workflow execution must be specified either as a default for the
     * workflow type or through this parameter. If neither this parameter is
     * set nor a default task list was specified at registration time then a
     * fault will be returned.</note> <p>The specified string must not start
     * or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param taskList The task list to use for the decision tasks generated for this
     *         workflow execution. This overrides the <code>defaultTaskList</code>
     *         specified when registering the workflow type. <note>A task list for
     *         this workflow execution must be specified either as a default for the
     *         workflow type or through this parameter. If neither this parameter is
     *         set nor a default task list was specified at registration time then a
     *         fault will be returned.</note> <p>The specified string must not start
     *         or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartWorkflowExecutionRequest withTaskList(TaskList taskList) {
        this.taskList = taskList;
        return this;
    }

    /**
     * The task priority to use for this workflow execution. This will
     * override any default priority that was assigned when the workflow type
     * was registered. If not set, then the default task priority for the
     * workflow type will be used. Valid values are integers that range from
     * Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     * higher priority. <p>For more information about setting task priority,
     * see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     * Task Priority</a> in the <i>Amazon Simple Workflow Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 11<br/>
     *
     * @return The task priority to use for this workflow execution. This will
     *         override any default priority that was assigned when the workflow type
     *         was registered. If not set, then the default task priority for the
     *         workflow type will be used. Valid values are integers that range from
     *         Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     *         higher priority. <p>For more information about setting task priority,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     *         Task Priority</a> in the <i>Amazon Simple Workflow Developer
     *         Guide</i>.
     */
    public String getTaskPriority() {
        return taskPriority;
    }
    
    /**
     * The task priority to use for this workflow execution. This will
     * override any default priority that was assigned when the workflow type
     * was registered. If not set, then the default task priority for the
     * workflow type will be used. Valid values are integers that range from
     * Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     * higher priority. <p>For more information about setting task priority,
     * see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     * Task Priority</a> in the <i>Amazon Simple Workflow Developer
     * Guide</i>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 11<br/>
     *
     * @param taskPriority The task priority to use for this workflow execution. This will
     *         override any default priority that was assigned when the workflow type
     *         was registered. If not set, then the default task priority for the
     *         workflow type will be used. Valid values are integers that range from
     *         Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     *         higher priority. <p>For more information about setting task priority,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     *         Task Priority</a> in the <i>Amazon Simple Workflow Developer
     *         Guide</i>.
     */
    public void setTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
    }
    
    /**
     * The task priority to use for this workflow execution. This will
     * override any default priority that was assigned when the workflow type
     * was registered. If not set, then the default task priority for the
     * workflow type will be used. Valid values are integers that range from
     * Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     * <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     * higher priority. <p>For more information about setting task priority,
     * see <a
     * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     * Task Priority</a> in the <i>Amazon Simple Workflow Developer
     * Guide</i>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 11<br/>
     *
     * @param taskPriority The task priority to use for this workflow execution. This will
     *         override any default priority that was assigned when the workflow type
     *         was registered. If not set, then the default task priority for the
     *         workflow type will be used. Valid values are integers that range from
     *         Java's <code>Integer.MIN_VALUE</code> (-2147483648) to
     *         <code>Integer.MAX_VALUE</code> (2147483647). Higher numbers indicate
     *         higher priority. <p>For more information about setting task priority,
     *         see <a
     *         href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/programming-priority.html">Setting
     *         Task Priority</a> in the <i>Amazon Simple Workflow Developer
     *         Guide</i>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartWorkflowExecutionRequest withTaskPriority(String taskPriority) {
        this.taskPriority = taskPriority;
        return this;
    }

    /**
     * The input for the workflow execution. This is a free form string which
     * should be meaningful to the workflow you are starting. This
     * <code>input</code> is made available to the new workflow execution in
     * the <code>WorkflowExecutionStarted</code> history event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @return The input for the workflow execution. This is a free form string which
     *         should be meaningful to the workflow you are starting. This
     *         <code>input</code> is made available to the new workflow execution in
     *         the <code>WorkflowExecutionStarted</code> history event.
     */
    public String getInput() {
        return input;
    }
    
    /**
     * The input for the workflow execution. This is a free form string which
     * should be meaningful to the workflow you are starting. This
     * <code>input</code> is made available to the new workflow execution in
     * the <code>WorkflowExecutionStarted</code> history event.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input The input for the workflow execution. This is a free form string which
     *         should be meaningful to the workflow you are starting. This
     *         <code>input</code> is made available to the new workflow execution in
     *         the <code>WorkflowExecutionStarted</code> history event.
     */
    public void setInput(String input) {
        this.input = input;
    }
    
    /**
     * The input for the workflow execution. This is a free form string which
     * should be meaningful to the workflow you are starting. This
     * <code>input</code> is made available to the new workflow execution in
     * the <code>WorkflowExecutionStarted</code> history event.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 32768<br/>
     *
     * @param input The input for the workflow execution. This is a free form string which
     *         should be meaningful to the workflow you are starting. This
     *         <code>input</code> is made available to the new workflow execution in
     *         the <code>WorkflowExecutionStarted</code> history event.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartWorkflowExecutionRequest withInput(String input) {
        this.input = input;
        return this;
    }

    /**
     * The total duration for this workflow execution. This overrides the
     * defaultExecutionStartToCloseTimeout specified when registering the
     * workflow type. <p>The duration is specified in seconds; an integer
     * greater than or equal to 0. Exceeding this limit will cause the
     * workflow execution to time out. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * this timeout; there is a one-year max limit on the time that a
     * workflow execution can run. <note> An execution start-to-close timeout
     * must be specified either through this parameter or as a default when
     * the workflow type is registered. If neither this parameter nor a
     * default execution start-to-close timeout is specified, a fault is
     * returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return The total duration for this workflow execution. This overrides the
     *         defaultExecutionStartToCloseTimeout specified when registering the
     *         workflow type. <p>The duration is specified in seconds; an integer
     *         greater than or equal to 0. Exceeding this limit will cause the
     *         workflow execution to time out. Unlike some of the other timeout
     *         parameters in Amazon SWF, you cannot specify a value of "NONE" for
     *         this timeout; there is a one-year max limit on the time that a
     *         workflow execution can run. <note> An execution start-to-close timeout
     *         must be specified either through this parameter or as a default when
     *         the workflow type is registered. If neither this parameter nor a
     *         default execution start-to-close timeout is specified, a fault is
     *         returned.</note>
     */
    public String getExecutionStartToCloseTimeout() {
        return executionStartToCloseTimeout;
    }
    
    /**
     * The total duration for this workflow execution. This overrides the
     * defaultExecutionStartToCloseTimeout specified when registering the
     * workflow type. <p>The duration is specified in seconds; an integer
     * greater than or equal to 0. Exceeding this limit will cause the
     * workflow execution to time out. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * this timeout; there is a one-year max limit on the time that a
     * workflow execution can run. <note> An execution start-to-close timeout
     * must be specified either through this parameter or as a default when
     * the workflow type is registered. If neither this parameter nor a
     * default execution start-to-close timeout is specified, a fault is
     * returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param executionStartToCloseTimeout The total duration for this workflow execution. This overrides the
     *         defaultExecutionStartToCloseTimeout specified when registering the
     *         workflow type. <p>The duration is specified in seconds; an integer
     *         greater than or equal to 0. Exceeding this limit will cause the
     *         workflow execution to time out. Unlike some of the other timeout
     *         parameters in Amazon SWF, you cannot specify a value of "NONE" for
     *         this timeout; there is a one-year max limit on the time that a
     *         workflow execution can run. <note> An execution start-to-close timeout
     *         must be specified either through this parameter or as a default when
     *         the workflow type is registered. If neither this parameter nor a
     *         default execution start-to-close timeout is specified, a fault is
     *         returned.</note>
     */
    public void setExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
    }
    
    /**
     * The total duration for this workflow execution. This overrides the
     * defaultExecutionStartToCloseTimeout specified when registering the
     * workflow type. <p>The duration is specified in seconds; an integer
     * greater than or equal to 0. Exceeding this limit will cause the
     * workflow execution to time out. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * this timeout; there is a one-year max limit on the time that a
     * workflow execution can run. <note> An execution start-to-close timeout
     * must be specified either through this parameter or as a default when
     * the workflow type is registered. If neither this parameter nor a
     * default execution start-to-close timeout is specified, a fault is
     * returned.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param executionStartToCloseTimeout The total duration for this workflow execution. This overrides the
     *         defaultExecutionStartToCloseTimeout specified when registering the
     *         workflow type. <p>The duration is specified in seconds; an integer
     *         greater than or equal to 0. Exceeding this limit will cause the
     *         workflow execution to time out. Unlike some of the other timeout
     *         parameters in Amazon SWF, you cannot specify a value of "NONE" for
     *         this timeout; there is a one-year max limit on the time that a
     *         workflow execution can run. <note> An execution start-to-close timeout
     *         must be specified either through this parameter or as a default when
     *         the workflow type is registered. If neither this parameter nor a
     *         default execution start-to-close timeout is specified, a fault is
     *         returned.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartWorkflowExecutionRequest withExecutionStartToCloseTimeout(String executionStartToCloseTimeout) {
        this.executionStartToCloseTimeout = executionStartToCloseTimeout;
        return this;
    }

    /**
     * The list of tags to associate with the workflow execution. You can
     * specify a maximum of 5 tags. You can list workflow executions with a
     * specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @return The list of tags to associate with the workflow execution. You can
     *         specify a maximum of 5 tags. You can list workflow executions with a
     *         specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *         <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     */
    public java.util.List<String> getTagList() {
        return tagList;
    }
    
    /**
     * The list of tags to associate with the workflow execution. You can
     * specify a maximum of 5 tags. You can list workflow executions with a
     * specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags to associate with the workflow execution. You can
     *         specify a maximum of 5 tags. You can list workflow executions with a
     *         specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *         <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     */
    public void setTagList(java.util.Collection<String> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tagListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagList.size());
        tagListCopy.addAll(tagList);
        this.tagList = tagListCopy;
    }
    
    /**
     * The list of tags to associate with the workflow execution. You can
     * specify a maximum of 5 tags. You can list workflow executions with a
     * specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagList(java.util.Collection)} or {@link
     * #withTagList(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags to associate with the workflow execution. You can
     *         specify a maximum of 5 tags. You can list workflow executions with a
     *         specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *         <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartWorkflowExecutionRequest withTagList(String... tagList) {
        if (getTagList() == null) setTagList(new java.util.ArrayList<String>(tagList.length));
        for (String value : tagList) {
            getTagList().add(value);
        }
        return this;
    }
    
    /**
     * The list of tags to associate with the workflow execution. You can
     * specify a maximum of 5 tags. You can list workflow executions with a
     * specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     * <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 5<br/>
     *
     * @param tagList The list of tags to associate with the workflow execution. You can
     *         specify a maximum of 5 tags. You can list workflow executions with a
     *         specific tag by calling <a>ListOpenWorkflowExecutions</a> or
     *         <a>ListClosedWorkflowExecutions</a> and specifying a <a>TagFilter</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartWorkflowExecutionRequest withTagList(java.util.Collection<String> tagList) {
        if (tagList == null) {
            this.tagList = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagListCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagList.size());
            tagListCopy.addAll(tagList);
            this.tagList = tagListCopy;
        }

        return this;
    }

    /**
     * Specifies the maximum duration of decision tasks for this workflow
     * execution. This parameter overrides the
     * <code>defaultTaskStartToCloseTimout</code> specified when registering
     * the workflow type using <a>RegisterWorkflowType</a>. <p>The duration
     * is specified in seconds; an integer greater than or equal to 0. The
     * value "NONE" can be used to specify unlimited duration. <note>A task
     * start-to-close timeout for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default task start-to-close
     * timeout was specified at registration time then a fault will be
     * returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return Specifies the maximum duration of decision tasks for this workflow
     *         execution. This parameter overrides the
     *         <code>defaultTaskStartToCloseTimout</code> specified when registering
     *         the workflow type using <a>RegisterWorkflowType</a>. <p>The duration
     *         is specified in seconds; an integer greater than or equal to 0. The
     *         value "NONE" can be used to specify unlimited duration. <note>A task
     *         start-to-close timeout for this workflow execution must be specified
     *         either as a default for the workflow type or through this parameter.
     *         If neither this parameter is set nor a default task start-to-close
     *         timeout was specified at registration time then a fault will be
     *         returned.</note>
     */
    public String getTaskStartToCloseTimeout() {
        return taskStartToCloseTimeout;
    }
    
    /**
     * Specifies the maximum duration of decision tasks for this workflow
     * execution. This parameter overrides the
     * <code>defaultTaskStartToCloseTimout</code> specified when registering
     * the workflow type using <a>RegisterWorkflowType</a>. <p>The duration
     * is specified in seconds; an integer greater than or equal to 0. The
     * value "NONE" can be used to specify unlimited duration. <note>A task
     * start-to-close timeout for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default task start-to-close
     * timeout was specified at registration time then a fault will be
     * returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param taskStartToCloseTimeout Specifies the maximum duration of decision tasks for this workflow
     *         execution. This parameter overrides the
     *         <code>defaultTaskStartToCloseTimout</code> specified when registering
     *         the workflow type using <a>RegisterWorkflowType</a>. <p>The duration
     *         is specified in seconds; an integer greater than or equal to 0. The
     *         value "NONE" can be used to specify unlimited duration. <note>A task
     *         start-to-close timeout for this workflow execution must be specified
     *         either as a default for the workflow type or through this parameter.
     *         If neither this parameter is set nor a default task start-to-close
     *         timeout was specified at registration time then a fault will be
     *         returned.</note>
     */
    public void setTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
    }
    
    /**
     * Specifies the maximum duration of decision tasks for this workflow
     * execution. This parameter overrides the
     * <code>defaultTaskStartToCloseTimout</code> specified when registering
     * the workflow type using <a>RegisterWorkflowType</a>. <p>The duration
     * is specified in seconds; an integer greater than or equal to 0. The
     * value "NONE" can be used to specify unlimited duration. <note>A task
     * start-to-close timeout for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default task start-to-close
     * timeout was specified at registration time then a fault will be
     * returned.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param taskStartToCloseTimeout Specifies the maximum duration of decision tasks for this workflow
     *         execution. This parameter overrides the
     *         <code>defaultTaskStartToCloseTimout</code> specified when registering
     *         the workflow type using <a>RegisterWorkflowType</a>. <p>The duration
     *         is specified in seconds; an integer greater than or equal to 0. The
     *         value "NONE" can be used to specify unlimited duration. <note>A task
     *         start-to-close timeout for this workflow execution must be specified
     *         either as a default for the workflow type or through this parameter.
     *         If neither this parameter is set nor a default task start-to-close
     *         timeout was specified at registration time then a fault will be
     *         returned.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartWorkflowExecutionRequest withTaskStartToCloseTimeout(String taskStartToCloseTimeout) {
        this.taskStartToCloseTimeout = taskStartToCloseTimeout;
        return this;
    }

    /**
     * If set, specifies the policy to use for the child workflow executions
     * of this workflow execution if it is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy
     * specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>. <p>The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event.</li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default child policy was
     * specified at registration time then a fault will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @return If set, specifies the policy to use for the child workflow executions
     *         of this workflow execution if it is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This policy overrides the default child policy
     *         specified when registering the workflow type using
     *         <a>RegisterWorkflowType</a>. <p>The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event.</li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for this workflow execution must be specified
     *         either as a default for the workflow type or through this parameter.
     *         If neither this parameter is set nor a default child policy was
     *         specified at registration time then a fault will be returned.</note>
     *
     * @see ChildPolicy
     */
    public String getChildPolicy() {
        return childPolicy;
    }
    
    /**
     * If set, specifies the policy to use for the child workflow executions
     * of this workflow execution if it is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy
     * specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>. <p>The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event.</li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default child policy was
     * specified at registration time then a fault will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy If set, specifies the policy to use for the child workflow executions
     *         of this workflow execution if it is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This policy overrides the default child policy
     *         specified when registering the workflow type using
     *         <a>RegisterWorkflowType</a>. <p>The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event.</li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for this workflow execution must be specified
     *         either as a default for the workflow type or through this parameter.
     *         If neither this parameter is set nor a default child policy was
     *         specified at registration time then a fault will be returned.</note>
     *
     * @see ChildPolicy
     */
    public void setChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
    }
    
    /**
     * If set, specifies the policy to use for the child workflow executions
     * of this workflow execution if it is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy
     * specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>. <p>The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event.</li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default child policy was
     * specified at registration time then a fault will be returned.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy If set, specifies the policy to use for the child workflow executions
     *         of this workflow execution if it is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This policy overrides the default child policy
     *         specified when registering the workflow type using
     *         <a>RegisterWorkflowType</a>. <p>The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event.</li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for this workflow execution must be specified
     *         either as a default for the workflow type or through this parameter.
     *         If neither this parameter is set nor a default child policy was
     *         specified at registration time then a fault will be returned.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ChildPolicy
     */
    public StartWorkflowExecutionRequest withChildPolicy(String childPolicy) {
        this.childPolicy = childPolicy;
        return this;
    }

    /**
     * If set, specifies the policy to use for the child workflow executions
     * of this workflow execution if it is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy
     * specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>. <p>The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event.</li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default child policy was
     * specified at registration time then a fault will be returned.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy If set, specifies the policy to use for the child workflow executions
     *         of this workflow execution if it is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This policy overrides the default child policy
     *         specified when registering the workflow type using
     *         <a>RegisterWorkflowType</a>. <p>The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event.</li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for this workflow execution must be specified
     *         either as a default for the workflow type or through this parameter.
     *         If neither this parameter is set nor a default child policy was
     *         specified at registration time then a fault will be returned.</note>
     *
     * @see ChildPolicy
     */
    public void setChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
    }
    
    /**
     * If set, specifies the policy to use for the child workflow executions
     * of this workflow execution if it is terminated, by calling the
     * <a>TerminateWorkflowExecution</a> action explicitly or due to an
     * expired timeout. This policy overrides the default child policy
     * specified when registering the workflow type using
     * <a>RegisterWorkflowType</a>. <p>The supported child policies are: <ul>
     * <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     * <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     * each child execution by recording a
     * <code>WorkflowExecutionCancelRequested</code> event in its history. It
     * is up to the decider to take appropriate actions when it receives an
     * execution history with this event.</li> <li><b>ABANDON:</b> no action
     * will be taken. The child executions will continue to run.</li> </ul>
     * <note>A child policy for this workflow execution must be specified
     * either as a default for the workflow type or through this parameter.
     * If neither this parameter is set nor a default child policy was
     * specified at registration time then a fault will be returned.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param childPolicy If set, specifies the policy to use for the child workflow executions
     *         of this workflow execution if it is terminated, by calling the
     *         <a>TerminateWorkflowExecution</a> action explicitly or due to an
     *         expired timeout. This policy overrides the default child policy
     *         specified when registering the workflow type using
     *         <a>RegisterWorkflowType</a>. <p>The supported child policies are: <ul>
     *         <li><b>TERMINATE:</b> the child executions will be terminated.</li>
     *         <li><b>REQUEST_CANCEL:</b> a request to cancel will be attempted for
     *         each child execution by recording a
     *         <code>WorkflowExecutionCancelRequested</code> event in its history. It
     *         is up to the decider to take appropriate actions when it receives an
     *         execution history with this event.</li> <li><b>ABANDON:</b> no action
     *         will be taken. The child executions will continue to run.</li> </ul>
     *         <note>A child policy for this workflow execution must be specified
     *         either as a default for the workflow type or through this parameter.
     *         If neither this parameter is set nor a default child policy was
     *         specified at registration time then a fault will be returned.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     *
     * @see ChildPolicy
     */
    public StartWorkflowExecutionRequest withChildPolicy(ChildPolicy childPolicy) {
        this.childPolicy = childPolicy.toString();
        return this;
    }

    /**
     * The ARN of an IAM role that authorizes Amazon SWF to invoke AWS Lambda
     * functions. <note>In order for this workflow execution to invoke AWS
     * Lambda functions, an appropriate IAM role must be specified either as
     * a default for the workflow type or through this field.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     *
     * @return The ARN of an IAM role that authorizes Amazon SWF to invoke AWS Lambda
     *         functions. <note>In order for this workflow execution to invoke AWS
     *         Lambda functions, an appropriate IAM role must be specified either as
     *         a default for the workflow type or through this field.</note>
     */
    public String getLambdaRole() {
        return lambdaRole;
    }
    
    /**
     * The ARN of an IAM role that authorizes Amazon SWF to invoke AWS Lambda
     * functions. <note>In order for this workflow execution to invoke AWS
     * Lambda functions, an appropriate IAM role must be specified either as
     * a default for the workflow type or through this field.</note>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     *
     * @param lambdaRole The ARN of an IAM role that authorizes Amazon SWF to invoke AWS Lambda
     *         functions. <note>In order for this workflow execution to invoke AWS
     *         Lambda functions, an appropriate IAM role must be specified either as
     *         a default for the workflow type or through this field.</note>
     */
    public void setLambdaRole(String lambdaRole) {
        this.lambdaRole = lambdaRole;
    }
    
    /**
     * The ARN of an IAM role that authorizes Amazon SWF to invoke AWS Lambda
     * functions. <note>In order for this workflow execution to invoke AWS
     * Lambda functions, an appropriate IAM role must be specified either as
     * a default for the workflow type or through this field.</note>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1224<br/>
     *
     * @param lambdaRole The ARN of an IAM role that authorizes Amazon SWF to invoke AWS Lambda
     *         functions. <note>In order for this workflow execution to invoke AWS
     *         Lambda functions, an appropriate IAM role must be specified either as
     *         a default for the workflow type or through this field.</note>
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public StartWorkflowExecutionRequest withLambdaRole(String lambdaRole) {
        this.lambdaRole = lambdaRole;
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDomain() != null) sb.append("Domain: " + getDomain() + ",");
        if (getWorkflowId() != null) sb.append("WorkflowId: " + getWorkflowId() + ",");
        if (getWorkflowType() != null) sb.append("WorkflowType: " + getWorkflowType() + ",");
        if (getTaskList() != null) sb.append("TaskList: " + getTaskList() + ",");
        if (getTaskPriority() != null) sb.append("TaskPriority: " + getTaskPriority() + ",");
        if (getInput() != null) sb.append("Input: " + getInput() + ",");
        if (getExecutionStartToCloseTimeout() != null) sb.append("ExecutionStartToCloseTimeout: " + getExecutionStartToCloseTimeout() + ",");
        if (getTagList() != null) sb.append("TagList: " + getTagList() + ",");
        if (getTaskStartToCloseTimeout() != null) sb.append("TaskStartToCloseTimeout: " + getTaskStartToCloseTimeout() + ",");
        if (getChildPolicy() != null) sb.append("ChildPolicy: " + getChildPolicy() + ",");
        if (getLambdaRole() != null) sb.append("LambdaRole: " + getLambdaRole() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowId() == null) ? 0 : getWorkflowId().hashCode()); 
        hashCode = prime * hashCode + ((getWorkflowType() == null) ? 0 : getWorkflowType().hashCode()); 
        hashCode = prime * hashCode + ((getTaskList() == null) ? 0 : getTaskList().hashCode()); 
        hashCode = prime * hashCode + ((getTaskPriority() == null) ? 0 : getTaskPriority().hashCode()); 
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode()); 
        hashCode = prime * hashCode + ((getExecutionStartToCloseTimeout() == null) ? 0 : getExecutionStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode()); 
        hashCode = prime * hashCode + ((getTaskStartToCloseTimeout() == null) ? 0 : getTaskStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getChildPolicy() == null) ? 0 : getChildPolicy().hashCode()); 
        hashCode = prime * hashCode + ((getLambdaRole() == null) ? 0 : getLambdaRole().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof StartWorkflowExecutionRequest == false) return false;
        StartWorkflowExecutionRequest other = (StartWorkflowExecutionRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getWorkflowId() == null ^ this.getWorkflowId() == null) return false;
        if (other.getWorkflowId() != null && other.getWorkflowId().equals(this.getWorkflowId()) == false) return false; 
        if (other.getWorkflowType() == null ^ this.getWorkflowType() == null) return false;
        if (other.getWorkflowType() != null && other.getWorkflowType().equals(this.getWorkflowType()) == false) return false; 
        if (other.getTaskList() == null ^ this.getTaskList() == null) return false;
        if (other.getTaskList() != null && other.getTaskList().equals(this.getTaskList()) == false) return false; 
        if (other.getTaskPriority() == null ^ this.getTaskPriority() == null) return false;
        if (other.getTaskPriority() != null && other.getTaskPriority().equals(this.getTaskPriority()) == false) return false; 
        if (other.getInput() == null ^ this.getInput() == null) return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false) return false; 
        if (other.getExecutionStartToCloseTimeout() == null ^ this.getExecutionStartToCloseTimeout() == null) return false;
        if (other.getExecutionStartToCloseTimeout() != null && other.getExecutionStartToCloseTimeout().equals(this.getExecutionStartToCloseTimeout()) == false) return false; 
        if (other.getTagList() == null ^ this.getTagList() == null) return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false) return false; 
        if (other.getTaskStartToCloseTimeout() == null ^ this.getTaskStartToCloseTimeout() == null) return false;
        if (other.getTaskStartToCloseTimeout() != null && other.getTaskStartToCloseTimeout().equals(this.getTaskStartToCloseTimeout()) == false) return false; 
        if (other.getChildPolicy() == null ^ this.getChildPolicy() == null) return false;
        if (other.getChildPolicy() != null && other.getChildPolicy().equals(this.getChildPolicy()) == false) return false; 
        if (other.getLambdaRole() == null ^ this.getLambdaRole() == null) return false;
        if (other.getLambdaRole() != null && other.getLambdaRole().equals(this.getLambdaRole()) == false) return false; 
        return true;
    }
    
    @Override
    public StartWorkflowExecutionRequest clone() {
        
            return (StartWorkflowExecutionRequest) super.clone();
    }

}
    