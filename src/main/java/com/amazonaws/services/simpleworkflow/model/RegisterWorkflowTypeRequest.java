/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * Container for the parameters to the {@link com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#registerWorkflowType(RegisterWorkflowTypeRequest) RegisterWorkflowType operation}.
 * <p>
 * Registers a new <i>workflow type</i> and its configuration settings in the specified domain.
 * </p>
 * <p>
 * The retention period for the workflow history is set by the RegisterDomain action.
 * </p>
 * <p>
 * <b>IMPORTANT:</b> If the type already exists, then a TypeAlreadyExists fault is returned. You cannot change the configuration settings of a workflow
 * type once it is registered and it must be registered as a new version.
 * </p>
 * <p>
 * <b>Access Control</b>
 * </p>
 * <p>
 * You can use IAM policies to control this action's access to Amazon SWF resources as follows:
 * </p>
 * 
 * <ul>
 * <li>Use a <code>Resource</code> element with the domain name to limit the action to only specified domains.</li>
 * <li>Use an <code>Action</code> element to allow or deny permission to call this action.</li>
 * <li>Constrain the following parameters by using a <code>Condition</code> element with the appropriate keys.
 * <ul>
 * <li> <code>defaultTaskList</code> : String constraint. The key is <code>swf:defaultTaskList.name</code> .</li>
 * <li> <code>name</code> : String constraint. The key is <code>swf:name</code> .</li>
 * <li> <code>version</code> : String constraint. The key is <code>swf:version</code> .</li>
 * 
 * </ul>
 * </li>
 * 
 * </ul>
 * <p>
 * If the caller does not have sufficient permissions to invoke the action, or the parameter values fall outside the specified constraints, the action
 * fails by throwing <code>OperationNotPermitted</code> . For details and example IAM policies, see <a
 * href="http://docs.aws.amazon.com/amazonswf/latest/developerguide/swf-dev-iam.html"> Using IAM to Manage Access to Amazon SWF Workflows </a> .
 * </p>
 *
 * @see com.amazonaws.services.simpleworkflow.AmazonSimpleWorkflow#registerWorkflowType(RegisterWorkflowTypeRequest)
 */
public class RegisterWorkflowTypeRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The name of the domain in which to register the workflow type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String domain;

    /**
     * The name of the workflow type. <p>The specified string must not start
     * or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     */
    private String name;

    /**
     * The version of the workflow type. <note> The workflow type consists of
     * the name and version, the combination of which must be unique within
     * the domain. To get a list of all currently registered workflow types,
     * use the <a>ListWorkflowTypes</a> action. </note> <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     */
    private String version;

    /**
     * Textual description of the workflow type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     */
    private String description;

    /**
     * If set, specifies the default maximum duration of decision tasks for
     * this workflow type. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The
     * valid values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultTaskStartToCloseTimeout;

    /**
     * If set, specifies the default maximum duration for executions of this
     * workflow type. You can override this default when starting an
     * execution through the <a>StartWorkflowExecution</a> Action or
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p> The
     * duration is specified in seconds. The valid values are integers
     * greater than or equal to 0. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year
     * max limit on the time that a workflow execution can run. Exceeding
     * this limit will always cause the workflow execution to time out.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     */
    private String defaultExecutionStartToCloseTimeout;

    /**
     * If set, specifies the default task list to use for scheduling decision
     * tasks for executions of this workflow type. This default is used only
     * if a task list is not provided when starting the execution through the
     * <a>StartWorkflowExecution</a> Action or
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     */
    private TaskList defaultTaskList;

    /**
     * If set, specifies the default policy to use for the child workflow
     * executions when a workflow execution of this type is terminated, by
     * calling the <a>TerminateWorkflowExecution</a> action explicitly or due
     * to an expired timeout. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     * supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     * executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event. </li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     */
    private String defaultChildPolicy;

    /**
     * The name of the domain in which to register the workflow type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the domain in which to register the workflow type.
     */
    public String getDomain() {
        return domain;
    }
    
    /**
     * The name of the domain in which to register the workflow type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain in which to register the workflow type.
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }
    
    /**
     * The name of the domain in which to register the workflow type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param domain The name of the domain in which to register the workflow type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterWorkflowTypeRequest withDomain(String domain) {
        this.domain = domain;
        return this;
    }

    /**
     * The name of the workflow type. <p>The specified string must not start
     * or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @return The name of the workflow type. <p>The specified string must not start
     *         or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     */
    public String getName() {
        return name;
    }
    
    /**
     * The name of the workflow type. <p>The specified string must not start
     * or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the workflow type. <p>The specified string must not start
     *         or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     */
    public void setName(String name) {
        this.name = name;
    }
    
    /**
     * The name of the workflow type. <p>The specified string must not start
     * or end with whitespace. It must not contain a <code>:</code> (colon),
     * <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     * characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     * contain the literal string "arn".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 256<br/>
     *
     * @param name The name of the workflow type. <p>The specified string must not start
     *         or end with whitespace. It must not contain a <code>:</code> (colon),
     *         <code>/</code> (slash), <code>|</code> (vertical bar), or any control
     *         characters (\u0000-\u001f | \u007f - \u009f). Also, it must not
     *         contain the literal string "arn".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterWorkflowTypeRequest withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * The version of the workflow type. <note> The workflow type consists of
     * the name and version, the combination of which must be unique within
     * the domain. To get a list of all currently registered workflow types,
     * use the <a>ListWorkflowTypes</a> action. </note> <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @return The version of the workflow type. <note> The workflow type consists of
     *         the name and version, the combination of which must be unique within
     *         the domain. To get a list of all currently registered workflow types,
     *         use the <a>ListWorkflowTypes</a> action. </note> <p>The specified
     *         string must not start or end with whitespace. It must not contain a
     *         <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     *         (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *         \u009f). Also, it must not contain the literal string "arn".
     */
    public String getVersion() {
        return version;
    }
    
    /**
     * The version of the workflow type. <note> The workflow type consists of
     * the name and version, the combination of which must be unique within
     * the domain. To get a list of all currently registered workflow types,
     * use the <a>ListWorkflowTypes</a> action. </note> <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param version The version of the workflow type. <note> The workflow type consists of
     *         the name and version, the combination of which must be unique within
     *         the domain. To get a list of all currently registered workflow types,
     *         use the <a>ListWorkflowTypes</a> action. </note> <p>The specified
     *         string must not start or end with whitespace. It must not contain a
     *         <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     *         (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *         \u009f). Also, it must not contain the literal string "arn".
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    /**
     * The version of the workflow type. <note> The workflow type consists of
     * the name and version, the combination of which must be unique within
     * the domain. To get a list of all currently registered workflow types,
     * use the <a>ListWorkflowTypes</a> action. </note> <p>The specified
     * string must not start or end with whitespace. It must not contain a
     * <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     * (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     * \u009f). Also, it must not contain the literal string "arn".
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 64<br/>
     *
     * @param version The version of the workflow type. <note> The workflow type consists of
     *         the name and version, the combination of which must be unique within
     *         the domain. To get a list of all currently registered workflow types,
     *         use the <a>ListWorkflowTypes</a> action. </note> <p>The specified
     *         string must not start or end with whitespace. It must not contain a
     *         <code>:</code> (colon), <code>/</code> (slash), <code>|</code>
     *         (vertical bar), or any control characters (\u0000-\u001f | \u007f -
     *         \u009f). Also, it must not contain the literal string "arn".
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterWorkflowTypeRequest withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * Textual description of the workflow type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @return Textual description of the workflow type.
     */
    public String getDescription() {
        return description;
    }
    
    /**
     * Textual description of the workflow type.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description Textual description of the workflow type.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
    /**
     * Textual description of the workflow type.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     *
     * @param description Textual description of the workflow type.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterWorkflowTypeRequest withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * If set, specifies the default maximum duration of decision tasks for
     * this workflow type. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The
     * valid values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return If set, specifies the default maximum duration of decision tasks for
     *         this workflow type. This default can be overridden when starting a
     *         workflow execution using the <a>StartWorkflowExecution</a> action or
     *         the <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The
     *         valid values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     */
    public String getDefaultTaskStartToCloseTimeout() {
        return defaultTaskStartToCloseTimeout;
    }
    
    /**
     * If set, specifies the default maximum duration of decision tasks for
     * this workflow type. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The
     * valid values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskStartToCloseTimeout If set, specifies the default maximum duration of decision tasks for
     *         this workflow type. This default can be overridden when starting a
     *         workflow execution using the <a>StartWorkflowExecution</a> action or
     *         the <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The
     *         valid values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     */
    public void setDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        this.defaultTaskStartToCloseTimeout = defaultTaskStartToCloseTimeout;
    }
    
    /**
     * If set, specifies the default maximum duration of decision tasks for
     * this workflow type. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The
     * valid values are integers greater than or equal to <code>0</code>. An
     * integer value can be used to specify the duration in seconds while
     * <code>NONE</code> can be used to specify unlimited duration.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultTaskStartToCloseTimeout If set, specifies the default maximum duration of decision tasks for
     *         this workflow type. This default can be overridden when starting a
     *         workflow execution using the <a>StartWorkflowExecution</a> action or
     *         the <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p>The
     *         valid values are integers greater than or equal to <code>0</code>. An
     *         integer value can be used to specify the duration in seconds while
     *         <code>NONE</code> can be used to specify unlimited duration.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterWorkflowTypeRequest withDefaultTaskStartToCloseTimeout(String defaultTaskStartToCloseTimeout) {
        this.defaultTaskStartToCloseTimeout = defaultTaskStartToCloseTimeout;
        return this;
    }

    /**
     * If set, specifies the default maximum duration for executions of this
     * workflow type. You can override this default when starting an
     * execution through the <a>StartWorkflowExecution</a> Action or
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p> The
     * duration is specified in seconds. The valid values are integers
     * greater than or equal to 0. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year
     * max limit on the time that a workflow execution can run. Exceeding
     * this limit will always cause the workflow execution to time out.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @return If set, specifies the default maximum duration for executions of this
     *         workflow type. You can override this default when starting an
     *         execution through the <a>StartWorkflowExecution</a> Action or
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p> The
     *         duration is specified in seconds. The valid values are integers
     *         greater than or equal to 0. Unlike some of the other timeout
     *         parameters in Amazon SWF, you cannot specify a value of "NONE" for
     *         <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year
     *         max limit on the time that a workflow execution can run. Exceeding
     *         this limit will always cause the workflow execution to time out.
     */
    public String getDefaultExecutionStartToCloseTimeout() {
        return defaultExecutionStartToCloseTimeout;
    }
    
    /**
     * If set, specifies the default maximum duration for executions of this
     * workflow type. You can override this default when starting an
     * execution through the <a>StartWorkflowExecution</a> Action or
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p> The
     * duration is specified in seconds. The valid values are integers
     * greater than or equal to 0. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year
     * max limit on the time that a workflow execution can run. Exceeding
     * this limit will always cause the workflow execution to time out.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultExecutionStartToCloseTimeout If set, specifies the default maximum duration for executions of this
     *         workflow type. You can override this default when starting an
     *         execution through the <a>StartWorkflowExecution</a> Action or
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p> The
     *         duration is specified in seconds. The valid values are integers
     *         greater than or equal to 0. Unlike some of the other timeout
     *         parameters in Amazon SWF, you cannot specify a value of "NONE" for
     *         <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year
     *         max limit on the time that a workflow execution can run. Exceeding
     *         this limit will always cause the workflow execution to time out.
     */
    public void setDefaultExecutionStartToCloseTimeout(String defaultExecutionStartToCloseTimeout) {
        this.defaultExecutionStartToCloseTimeout = defaultExecutionStartToCloseTimeout;
    }
    
    /**
     * If set, specifies the default maximum duration for executions of this
     * workflow type. You can override this default when starting an
     * execution through the <a>StartWorkflowExecution</a> Action or
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p> The
     * duration is specified in seconds. The valid values are integers
     * greater than or equal to 0. Unlike some of the other timeout
     * parameters in Amazon SWF, you cannot specify a value of "NONE" for
     * <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year
     * max limit on the time that a workflow execution can run. Exceeding
     * this limit will always cause the workflow execution to time out.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 8<br/>
     *
     * @param defaultExecutionStartToCloseTimeout If set, specifies the default maximum duration for executions of this
     *         workflow type. You can override this default when starting an
     *         execution through the <a>StartWorkflowExecution</a> Action or
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>. <p> The
     *         duration is specified in seconds. The valid values are integers
     *         greater than or equal to 0. Unlike some of the other timeout
     *         parameters in Amazon SWF, you cannot specify a value of "NONE" for
     *         <code>defaultExecutionStartToCloseTimeout</code>; there is a one-year
     *         max limit on the time that a workflow execution can run. Exceeding
     *         this limit will always cause the workflow execution to time out.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterWorkflowTypeRequest withDefaultExecutionStartToCloseTimeout(String defaultExecutionStartToCloseTimeout) {
        this.defaultExecutionStartToCloseTimeout = defaultExecutionStartToCloseTimeout;
        return this;
    }

    /**
     * If set, specifies the default task list to use for scheduling decision
     * tasks for executions of this workflow type. This default is used only
     * if a task list is not provided when starting the execution through the
     * <a>StartWorkflowExecution</a> Action or
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     *
     * @return If set, specifies the default task list to use for scheduling decision
     *         tasks for executions of this workflow type. This default is used only
     *         if a task list is not provided when starting the execution through the
     *         <a>StartWorkflowExecution</a> Action or
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     */
    public TaskList getDefaultTaskList() {
        return defaultTaskList;
    }
    
    /**
     * If set, specifies the default task list to use for scheduling decision
     * tasks for executions of this workflow type. This default is used only
     * if a task list is not provided when starting the execution through the
     * <a>StartWorkflowExecution</a> Action or
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     *
     * @param defaultTaskList If set, specifies the default task list to use for scheduling decision
     *         tasks for executions of this workflow type. This default is used only
     *         if a task list is not provided when starting the execution through the
     *         <a>StartWorkflowExecution</a> Action or
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     */
    public void setDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
    }
    
    /**
     * If set, specifies the default task list to use for scheduling decision
     * tasks for executions of this workflow type. This default is used only
     * if a task list is not provided when starting the execution through the
     * <a>StartWorkflowExecution</a> Action or
     * <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param defaultTaskList If set, specifies the default task list to use for scheduling decision
     *         tasks for executions of this workflow type. This default is used only
     *         if a task list is not provided when starting the execution through the
     *         <a>StartWorkflowExecution</a> Action or
     *         <code>StartChildWorkflowExecution</code> <a>Decision</a>.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public RegisterWorkflowTypeRequest withDefaultTaskList(TaskList defaultTaskList) {
        this.defaultTaskList = defaultTaskList;
        return this;
    }

    /**
     * If set, specifies the default policy to use for the child workflow
     * executions when a workflow execution of this type is terminated, by
     * calling the <a>TerminateWorkflowExecution</a> action explicitly or due
     * to an expired timeout. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     * supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     * executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event. </li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @return If set, specifies the default policy to use for the child workflow
     *         executions when a workflow execution of this type is terminated, by
     *         calling the <a>TerminateWorkflowExecution</a> action explicitly or due
     *         to an expired timeout. This default can be overridden when starting a
     *         workflow execution using the <a>StartWorkflowExecution</a> action or
     *         the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     *         supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     *         executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event. </li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public String getDefaultChildPolicy() {
        return defaultChildPolicy;
    }
    
    /**
     * If set, specifies the default policy to use for the child workflow
     * executions when a workflow execution of this type is terminated, by
     * calling the <a>TerminateWorkflowExecution</a> action explicitly or due
     * to an expired timeout. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     * supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     * executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event. </li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param defaultChildPolicy If set, specifies the default policy to use for the child workflow
     *         executions when a workflow execution of this type is terminated, by
     *         calling the <a>TerminateWorkflowExecution</a> action explicitly or due
     *         to an expired timeout. This default can be overridden when starting a
     *         workflow execution using the <a>StartWorkflowExecution</a> action or
     *         the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     *         supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     *         executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event. </li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public void setDefaultChildPolicy(String defaultChildPolicy) {
        this.defaultChildPolicy = defaultChildPolicy;
    }
    
    /**
     * If set, specifies the default policy to use for the child workflow
     * executions when a workflow execution of this type is terminated, by
     * calling the <a>TerminateWorkflowExecution</a> action explicitly or due
     * to an expired timeout. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     * supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     * executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event. </li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param defaultChildPolicy If set, specifies the default policy to use for the child workflow
     *         executions when a workflow execution of this type is terminated, by
     *         calling the <a>TerminateWorkflowExecution</a> action explicitly or due
     *         to an expired timeout. This default can be overridden when starting a
     *         workflow execution using the <a>StartWorkflowExecution</a> action or
     *         the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     *         supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     *         executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event. </li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChildPolicy
     */
    public RegisterWorkflowTypeRequest withDefaultChildPolicy(String defaultChildPolicy) {
        this.defaultChildPolicy = defaultChildPolicy;
        return this;
    }

    /**
     * If set, specifies the default policy to use for the child workflow
     * executions when a workflow execution of this type is terminated, by
     * calling the <a>TerminateWorkflowExecution</a> action explicitly or due
     * to an expired timeout. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     * supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     * executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event. </li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param defaultChildPolicy If set, specifies the default policy to use for the child workflow
     *         executions when a workflow execution of this type is terminated, by
     *         calling the <a>TerminateWorkflowExecution</a> action explicitly or due
     *         to an expired timeout. This default can be overridden when starting a
     *         workflow execution using the <a>StartWorkflowExecution</a> action or
     *         the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     *         supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     *         executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event. </li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @see ChildPolicy
     */
    public void setDefaultChildPolicy(ChildPolicy defaultChildPolicy) {
        this.defaultChildPolicy = defaultChildPolicy.toString();
    }
    
    /**
     * If set, specifies the default policy to use for the child workflow
     * executions when a workflow execution of this type is terminated, by
     * calling the <a>TerminateWorkflowExecution</a> action explicitly or due
     * to an expired timeout. This default can be overridden when starting a
     * workflow execution using the <a>StartWorkflowExecution</a> action or
     * the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     * supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     * executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     * request to cancel will be attempted for each child execution by
     * recording a <code>WorkflowExecutionCancelRequested</code> event in its
     * history. It is up to the decider to take appropriate actions when it
     * receives an execution history with this event. </li>
     * <li><b>ABANDON:</b> no action will be taken. The child executions will
     * continue to run.</li> </ul>
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>TERMINATE, REQUEST_CANCEL, ABANDON
     *
     * @param defaultChildPolicy If set, specifies the default policy to use for the child workflow
     *         executions when a workflow execution of this type is terminated, by
     *         calling the <a>TerminateWorkflowExecution</a> action explicitly or due
     *         to an expired timeout. This default can be overridden when starting a
     *         workflow execution using the <a>StartWorkflowExecution</a> action or
     *         the <code>StartChildWorkflowExecution</code> <a>Decision</a>. The
     *         supported child policies are: <ul> <li><b>TERMINATE:</b> the child
     *         executions will be terminated.</li> <li><b>REQUEST_CANCEL:</b> a
     *         request to cancel will be attempted for each child execution by
     *         recording a <code>WorkflowExecutionCancelRequested</code> event in its
     *         history. It is up to the decider to take appropriate actions when it
     *         receives an execution history with this event. </li>
     *         <li><b>ABANDON:</b> no action will be taken. The child executions will
     *         continue to run.</li> </ul>
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see ChildPolicy
     */
    public RegisterWorkflowTypeRequest withDefaultChildPolicy(ChildPolicy defaultChildPolicy) {
        this.defaultChildPolicy = defaultChildPolicy.toString();
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
        if (getName() != null) sb.append("Name: " + getName() + ",");
        if (getVersion() != null) sb.append("Version: " + getVersion() + ",");
        if (getDescription() != null) sb.append("Description: " + getDescription() + ",");
        if (getDefaultTaskStartToCloseTimeout() != null) sb.append("DefaultTaskStartToCloseTimeout: " + getDefaultTaskStartToCloseTimeout() + ",");
        if (getDefaultExecutionStartToCloseTimeout() != null) sb.append("DefaultExecutionStartToCloseTimeout: " + getDefaultExecutionStartToCloseTimeout() + ",");
        if (getDefaultTaskList() != null) sb.append("DefaultTaskList: " + getDefaultTaskList() + ",");
        if (getDefaultChildPolicy() != null) sb.append("DefaultChildPolicy: " + getDefaultChildPolicy() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode()); 
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode()); 
        hashCode = prime * hashCode + ((getVersion() == null) ? 0 : getVersion().hashCode()); 
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultTaskStartToCloseTimeout() == null) ? 0 : getDefaultTaskStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultExecutionStartToCloseTimeout() == null) ? 0 : getDefaultExecutionStartToCloseTimeout().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultTaskList() == null) ? 0 : getDefaultTaskList().hashCode()); 
        hashCode = prime * hashCode + ((getDefaultChildPolicy() == null) ? 0 : getDefaultChildPolicy().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RegisterWorkflowTypeRequest == false) return false;
        RegisterWorkflowTypeRequest other = (RegisterWorkflowTypeRequest)obj;
        
        if (other.getDomain() == null ^ this.getDomain() == null) return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false) return false; 
        if (other.getName() == null ^ this.getName() == null) return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false) return false; 
        if (other.getVersion() == null ^ this.getVersion() == null) return false;
        if (other.getVersion() != null && other.getVersion().equals(this.getVersion()) == false) return false; 
        if (other.getDescription() == null ^ this.getDescription() == null) return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false) return false; 
        if (other.getDefaultTaskStartToCloseTimeout() == null ^ this.getDefaultTaskStartToCloseTimeout() == null) return false;
        if (other.getDefaultTaskStartToCloseTimeout() != null && other.getDefaultTaskStartToCloseTimeout().equals(this.getDefaultTaskStartToCloseTimeout()) == false) return false; 
        if (other.getDefaultExecutionStartToCloseTimeout() == null ^ this.getDefaultExecutionStartToCloseTimeout() == null) return false;
        if (other.getDefaultExecutionStartToCloseTimeout() != null && other.getDefaultExecutionStartToCloseTimeout().equals(this.getDefaultExecutionStartToCloseTimeout()) == false) return false; 
        if (other.getDefaultTaskList() == null ^ this.getDefaultTaskList() == null) return false;
        if (other.getDefaultTaskList() != null && other.getDefaultTaskList().equals(this.getDefaultTaskList()) == false) return false; 
        if (other.getDefaultChildPolicy() == null ^ this.getDefaultChildPolicy() == null) return false;
        if (other.getDefaultChildPolicy() != null && other.getDefaultChildPolicy().equals(this.getDefaultChildPolicy()) == false) return false; 
        return true;
    }
    
}
    