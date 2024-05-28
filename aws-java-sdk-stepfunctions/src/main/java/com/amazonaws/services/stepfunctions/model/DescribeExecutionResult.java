/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/states-2016-11-23/DescribeExecution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeExecutionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     */
    private String executionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed stated machine.
     * </p>
     */
    private String stateMachineArn;
    /**
     * <p>
     * The name of the execution.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The current status of the execution.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The date the execution is started.
     * </p>
     */
    private java.util.Date startDate;
    /**
     * <p>
     * If the execution ended, the date the execution stopped.
     * </p>
     */
    private java.util.Date stopDate;
    /**
     * <p>
     * The string that contains the JSON input data of the execution. Length constraints apply to the payload size, and
     * are expressed as bytes in UTF-8 encoding.
     * </p>
     */
    private String input;

    private CloudWatchEventsExecutionDataDetails inputDetails;
    /**
     * <p>
     * The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as bytes
     * in UTF-8 encoding.
     * </p>
     * <note>
     * <p>
     * This field is set only if the execution succeeds. If the execution fails, this field is null.
     * </p>
     * </note>
     */
    private String output;

    private CloudWatchEventsExecutionDataDetails outputDetails;
    /**
     * <p>
     * The X-Ray trace header that was passed to the execution.
     * </p>
     */
    private String traceHeader;
    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies a Map Run, which dispatched this execution.
     * </p>
     */
    private String mapRunArn;
    /**
     * <p>
     * The error string if the state machine execution failed.
     * </p>
     */
    private String error;
    /**
     * <p>
     * The cause string if the state machine execution failed.
     * </p>
     */
    private String cause;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine version associated with the execution. The version ARN is a
     * combination of state machine ARN and the version number separated by a colon (:). For example,
     * <code>stateMachineARN:1</code>.
     * </p>
     * <p>
     * If you start an execution from a <code>StartExecution</code> request without specifying a state machine version
     * or alias ARN, Step Functions returns a null value.
     * </p>
     */
    private String stateMachineVersionArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine alias associated with the execution. The alias ARN is a
     * combination of state machine ARN and the alias name separated by a colon (:). For example,
     * <code>stateMachineARN:PROD</code>.
     * </p>
     * <p>
     * If you start an execution from a <code>StartExecution</code> request with a state machine version ARN, this field
     * will be null.
     * </p>
     */
    private String stateMachineAliasArn;
    /**
     * <p>
     * The number of times you've redriven an execution. If you have not yet redriven an execution, the
     * <code>redriveCount</code> is 0. This count is only updated if you successfully redrive an execution.
     * </p>
     */
    private Integer redriveCount;
    /**
     * <p>
     * The date the execution was last redriven. If you have not yet redriven an execution, the <code>redriveDate</code>
     * is null.
     * </p>
     * <p>
     * The <code>redriveDate</code> is unavailable if you redrive a Map Run that starts child workflow executions of
     * type <code>EXPRESS</code>.
     * </p>
     */
    private java.util.Date redriveDate;
    /**
     * <p>
     * Indicates whether or not an execution can be redriven at a given point in time.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For executions of type <code>STANDARD</code>, <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code> if
     * calling the <a>RedriveExecution</a> API action would return the <code>ExecutionNotRedrivable</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>STANDARD</code>, <code>redriveStatus</code>
     * indicates whether or not the Map Run can redrive child workflow executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>EXPRESS</code>, <code>redriveStatus</code>
     * indicates whether or not the Map Run can redrive child workflow executions.
     * </p>
     * <p>
     * You can redrive failed or timed out <code>EXPRESS</code> workflows <i>only if</i> they're a part of a Map Run.
     * When you <a href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-map-run.html">redrive</a> the Map
     * Run, these workflows are restarted using the <a>StartExecution</a> API action.
     * </p>
     * </li>
     * </ul>
     */
    private String redriveStatus;
    /**
     * <p>
     * When <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code>, <code>redriveStatusReason</code> specifies the
     * reason why an execution cannot be redriven.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For executions of type <code>STANDARD</code>, or for a Distributed Map that includes child workflows of type
     * <code>STANDARD</code>, <code>redriveStatusReason</code> can include one of the following reasons:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>State machine is in DELETING status</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution is RUNNING and cannot be redriven</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution is SUCCEEDED and cannot be redriven</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution was started before the launch of RedriveExecution</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution history event limit exceeded</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution has exceeded the max execution time</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution redrivable period exceeded</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>EXPRESS</code>,
     * <code>redriveStatusReason</code> is only returned if the child workflows are not redrivable. This happens when
     * the child workflow executions have completed successfully.
     * </p>
     * </li>
     * </ul>
     */
    private String redriveStatusReason;

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) that identifies the execution.
     */

    public void setExecutionArn(String executionArn) {
        this.executionArn = executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies the execution.
     */

    public String getExecutionArn() {
        return this.executionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies the execution.
     * </p>
     * 
     * @param executionArn
     *        The Amazon Resource Name (ARN) that identifies the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withExecutionArn(String executionArn) {
        setExecutionArn(executionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed stated machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the executed stated machine.
     */

    public void setStateMachineArn(String stateMachineArn) {
        this.stateMachineArn = stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed stated machine.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the executed stated machine.
     */

    public String getStateMachineArn() {
        return this.stateMachineArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the executed stated machine.
     * </p>
     * 
     * @param stateMachineArn
     *        The Amazon Resource Name (ARN) of the executed stated machine.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withStateMachineArn(String stateMachineArn) {
        setStateMachineArn(stateMachineArn);
        return this;
    }

    /**
     * <p>
     * The name of the execution.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     * 
     * @param name
     *        The name of the execution.</p>
     *        <p>
     *        A name must <i>not</i> contain:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        white space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        brackets <code>&lt; &gt; { } [ ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        wildcard characters <code>? *</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the execution.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     * 
     * @return The name of the execution.</p>
     *         <p>
     *         A name must <i>not</i> contain:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         white space
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         brackets <code>&lt; &gt; { } [ ]</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         wildcard characters <code>? *</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the execution.
     * </p>
     * <p>
     * A name must <i>not</i> contain:
     * </p>
     * <ul>
     * <li>
     * <p>
     * white space
     * </p>
     * </li>
     * <li>
     * <p>
     * brackets <code>&lt; &gt; { } [ ]</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * wildcard characters <code>? *</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     * </p>
     * </li>
     * </ul>
     * <p>
     * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * </p>
     * 
     * @param name
     *        The name of the execution.</p>
     *        <p>
     *        A name must <i>not</i> contain:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        white space
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        brackets <code>&lt; &gt; { } [ ]</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        wildcard characters <code>? *</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        special characters <code>" # % \ ^ | ~ ` $ &amp; , ; : /</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        control characters (<code>U+0000-001F</code>, <code>U+007F-009F</code>)
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @see ExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @return The current status of the execution.
     * @see ExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public DescribeExecutionResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @see ExecutionStatus
     */

    public void setStatus(ExecutionStatus status) {
        withStatus(status);
    }

    /**
     * <p>
     * The current status of the execution.
     * </p>
     * 
     * @param status
     *        The current status of the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionStatus
     */

    public DescribeExecutionResult withStatus(ExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The date the execution is started.
     * </p>
     * 
     * @param startDate
     *        The date the execution is started.
     */

    public void setStartDate(java.util.Date startDate) {
        this.startDate = startDate;
    }

    /**
     * <p>
     * The date the execution is started.
     * </p>
     * 
     * @return The date the execution is started.
     */

    public java.util.Date getStartDate() {
        return this.startDate;
    }

    /**
     * <p>
     * The date the execution is started.
     * </p>
     * 
     * @param startDate
     *        The date the execution is started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withStartDate(java.util.Date startDate) {
        setStartDate(startDate);
        return this;
    }

    /**
     * <p>
     * If the execution ended, the date the execution stopped.
     * </p>
     * 
     * @param stopDate
     *        If the execution ended, the date the execution stopped.
     */

    public void setStopDate(java.util.Date stopDate) {
        this.stopDate = stopDate;
    }

    /**
     * <p>
     * If the execution ended, the date the execution stopped.
     * </p>
     * 
     * @return If the execution ended, the date the execution stopped.
     */

    public java.util.Date getStopDate() {
        return this.stopDate;
    }

    /**
     * <p>
     * If the execution ended, the date the execution stopped.
     * </p>
     * 
     * @param stopDate
     *        If the execution ended, the date the execution stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withStopDate(java.util.Date stopDate) {
        setStopDate(stopDate);
        return this;
    }

    /**
     * <p>
     * The string that contains the JSON input data of the execution. Length constraints apply to the payload size, and
     * are expressed as bytes in UTF-8 encoding.
     * </p>
     * 
     * @param input
     *        The string that contains the JSON input data of the execution. Length constraints apply to the payload
     *        size, and are expressed as bytes in UTF-8 encoding.
     */

    public void setInput(String input) {
        this.input = input;
    }

    /**
     * <p>
     * The string that contains the JSON input data of the execution. Length constraints apply to the payload size, and
     * are expressed as bytes in UTF-8 encoding.
     * </p>
     * 
     * @return The string that contains the JSON input data of the execution. Length constraints apply to the payload
     *         size, and are expressed as bytes in UTF-8 encoding.
     */

    public String getInput() {
        return this.input;
    }

    /**
     * <p>
     * The string that contains the JSON input data of the execution. Length constraints apply to the payload size, and
     * are expressed as bytes in UTF-8 encoding.
     * </p>
     * 
     * @param input
     *        The string that contains the JSON input data of the execution. Length constraints apply to the payload
     *        size, and are expressed as bytes in UTF-8 encoding.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withInput(String input) {
        setInput(input);
        return this;
    }

    /**
     * @param inputDetails
     */

    public void setInputDetails(CloudWatchEventsExecutionDataDetails inputDetails) {
        this.inputDetails = inputDetails;
    }

    /**
     * @return
     */

    public CloudWatchEventsExecutionDataDetails getInputDetails() {
        return this.inputDetails;
    }

    /**
     * @param inputDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withInputDetails(CloudWatchEventsExecutionDataDetails inputDetails) {
        setInputDetails(inputDetails);
        return this;
    }

    /**
     * <p>
     * The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as bytes
     * in UTF-8 encoding.
     * </p>
     * <note>
     * <p>
     * This field is set only if the execution succeeds. If the execution fails, this field is null.
     * </p>
     * </note>
     * 
     * @param output
     *        The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as
     *        bytes in UTF-8 encoding.</p> <note>
     *        <p>
     *        This field is set only if the execution succeeds. If the execution fails, this field is null.
     *        </p>
     */

    public void setOutput(String output) {
        this.output = output;
    }

    /**
     * <p>
     * The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as bytes
     * in UTF-8 encoding.
     * </p>
     * <note>
     * <p>
     * This field is set only if the execution succeeds. If the execution fails, this field is null.
     * </p>
     * </note>
     * 
     * @return The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as
     *         bytes in UTF-8 encoding.</p> <note>
     *         <p>
     *         This field is set only if the execution succeeds. If the execution fails, this field is null.
     *         </p>
     */

    public String getOutput() {
        return this.output;
    }

    /**
     * <p>
     * The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as bytes
     * in UTF-8 encoding.
     * </p>
     * <note>
     * <p>
     * This field is set only if the execution succeeds. If the execution fails, this field is null.
     * </p>
     * </note>
     * 
     * @param output
     *        The JSON output data of the execution. Length constraints apply to the payload size, and are expressed as
     *        bytes in UTF-8 encoding.</p> <note>
     *        <p>
     *        This field is set only if the execution succeeds. If the execution fails, this field is null.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withOutput(String output) {
        setOutput(output);
        return this;
    }

    /**
     * @param outputDetails
     */

    public void setOutputDetails(CloudWatchEventsExecutionDataDetails outputDetails) {
        this.outputDetails = outputDetails;
    }

    /**
     * @return
     */

    public CloudWatchEventsExecutionDataDetails getOutputDetails() {
        return this.outputDetails;
    }

    /**
     * @param outputDetails
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withOutputDetails(CloudWatchEventsExecutionDataDetails outputDetails) {
        setOutputDetails(outputDetails);
        return this;
    }

    /**
     * <p>
     * The X-Ray trace header that was passed to the execution.
     * </p>
     * 
     * @param traceHeader
     *        The X-Ray trace header that was passed to the execution.
     */

    public void setTraceHeader(String traceHeader) {
        this.traceHeader = traceHeader;
    }

    /**
     * <p>
     * The X-Ray trace header that was passed to the execution.
     * </p>
     * 
     * @return The X-Ray trace header that was passed to the execution.
     */

    public String getTraceHeader() {
        return this.traceHeader;
    }

    /**
     * <p>
     * The X-Ray trace header that was passed to the execution.
     * </p>
     * 
     * @param traceHeader
     *        The X-Ray trace header that was passed to the execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withTraceHeader(String traceHeader) {
        setTraceHeader(traceHeader);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies a Map Run, which dispatched this execution.
     * </p>
     * 
     * @param mapRunArn
     *        The Amazon Resource Name (ARN) that identifies a Map Run, which dispatched this execution.
     */

    public void setMapRunArn(String mapRunArn) {
        this.mapRunArn = mapRunArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies a Map Run, which dispatched this execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) that identifies a Map Run, which dispatched this execution.
     */

    public String getMapRunArn() {
        return this.mapRunArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) that identifies a Map Run, which dispatched this execution.
     * </p>
     * 
     * @param mapRunArn
     *        The Amazon Resource Name (ARN) that identifies a Map Run, which dispatched this execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withMapRunArn(String mapRunArn) {
        setMapRunArn(mapRunArn);
        return this;
    }

    /**
     * <p>
     * The error string if the state machine execution failed.
     * </p>
     * 
     * @param error
     *        The error string if the state machine execution failed.
     */

    public void setError(String error) {
        this.error = error;
    }

    /**
     * <p>
     * The error string if the state machine execution failed.
     * </p>
     * 
     * @return The error string if the state machine execution failed.
     */

    public String getError() {
        return this.error;
    }

    /**
     * <p>
     * The error string if the state machine execution failed.
     * </p>
     * 
     * @param error
     *        The error string if the state machine execution failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withError(String error) {
        setError(error);
        return this;
    }

    /**
     * <p>
     * The cause string if the state machine execution failed.
     * </p>
     * 
     * @param cause
     *        The cause string if the state machine execution failed.
     */

    public void setCause(String cause) {
        this.cause = cause;
    }

    /**
     * <p>
     * The cause string if the state machine execution failed.
     * </p>
     * 
     * @return The cause string if the state machine execution failed.
     */

    public String getCause() {
        return this.cause;
    }

    /**
     * <p>
     * The cause string if the state machine execution failed.
     * </p>
     * 
     * @param cause
     *        The cause string if the state machine execution failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withCause(String cause) {
        setCause(cause);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine version associated with the execution. The version ARN is a
     * combination of state machine ARN and the version number separated by a colon (:). For example,
     * <code>stateMachineARN:1</code>.
     * </p>
     * <p>
     * If you start an execution from a <code>StartExecution</code> request without specifying a state machine version
     * or alias ARN, Step Functions returns a null value.
     * </p>
     * 
     * @param stateMachineVersionArn
     *        The Amazon Resource Name (ARN) of the state machine version associated with the execution. The version ARN
     *        is a combination of state machine ARN and the version number separated by a colon (:). For example,
     *        <code>stateMachineARN:1</code>.</p>
     *        <p>
     *        If you start an execution from a <code>StartExecution</code> request without specifying a state machine
     *        version or alias ARN, Step Functions returns a null value.
     */

    public void setStateMachineVersionArn(String stateMachineVersionArn) {
        this.stateMachineVersionArn = stateMachineVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine version associated with the execution. The version ARN is a
     * combination of state machine ARN and the version number separated by a colon (:). For example,
     * <code>stateMachineARN:1</code>.
     * </p>
     * <p>
     * If you start an execution from a <code>StartExecution</code> request without specifying a state machine version
     * or alias ARN, Step Functions returns a null value.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the state machine version associated with the execution. The version
     *         ARN is a combination of state machine ARN and the version number separated by a colon (:). For example,
     *         <code>stateMachineARN:1</code>.</p>
     *         <p>
     *         If you start an execution from a <code>StartExecution</code> request without specifying a state machine
     *         version or alias ARN, Step Functions returns a null value.
     */

    public String getStateMachineVersionArn() {
        return this.stateMachineVersionArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine version associated with the execution. The version ARN is a
     * combination of state machine ARN and the version number separated by a colon (:). For example,
     * <code>stateMachineARN:1</code>.
     * </p>
     * <p>
     * If you start an execution from a <code>StartExecution</code> request without specifying a state machine version
     * or alias ARN, Step Functions returns a null value.
     * </p>
     * 
     * @param stateMachineVersionArn
     *        The Amazon Resource Name (ARN) of the state machine version associated with the execution. The version ARN
     *        is a combination of state machine ARN and the version number separated by a colon (:). For example,
     *        <code>stateMachineARN:1</code>.</p>
     *        <p>
     *        If you start an execution from a <code>StartExecution</code> request without specifying a state machine
     *        version or alias ARN, Step Functions returns a null value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withStateMachineVersionArn(String stateMachineVersionArn) {
        setStateMachineVersionArn(stateMachineVersionArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine alias associated with the execution. The alias ARN is a
     * combination of state machine ARN and the alias name separated by a colon (:). For example,
     * <code>stateMachineARN:PROD</code>.
     * </p>
     * <p>
     * If you start an execution from a <code>StartExecution</code> request with a state machine version ARN, this field
     * will be null.
     * </p>
     * 
     * @param stateMachineAliasArn
     *        The Amazon Resource Name (ARN) of the state machine alias associated with the execution. The alias ARN is
     *        a combination of state machine ARN and the alias name separated by a colon (:). For example,
     *        <code>stateMachineARN:PROD</code>.</p>
     *        <p>
     *        If you start an execution from a <code>StartExecution</code> request with a state machine version ARN,
     *        this field will be null.
     */

    public void setStateMachineAliasArn(String stateMachineAliasArn) {
        this.stateMachineAliasArn = stateMachineAliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine alias associated with the execution. The alias ARN is a
     * combination of state machine ARN and the alias name separated by a colon (:). For example,
     * <code>stateMachineARN:PROD</code>.
     * </p>
     * <p>
     * If you start an execution from a <code>StartExecution</code> request with a state machine version ARN, this field
     * will be null.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the state machine alias associated with the execution. The alias ARN is
     *         a combination of state machine ARN and the alias name separated by a colon (:). For example,
     *         <code>stateMachineARN:PROD</code>.</p>
     *         <p>
     *         If you start an execution from a <code>StartExecution</code> request with a state machine version ARN,
     *         this field will be null.
     */

    public String getStateMachineAliasArn() {
        return this.stateMachineAliasArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the state machine alias associated with the execution. The alias ARN is a
     * combination of state machine ARN and the alias name separated by a colon (:). For example,
     * <code>stateMachineARN:PROD</code>.
     * </p>
     * <p>
     * If you start an execution from a <code>StartExecution</code> request with a state machine version ARN, this field
     * will be null.
     * </p>
     * 
     * @param stateMachineAliasArn
     *        The Amazon Resource Name (ARN) of the state machine alias associated with the execution. The alias ARN is
     *        a combination of state machine ARN and the alias name separated by a colon (:). For example,
     *        <code>stateMachineARN:PROD</code>.</p>
     *        <p>
     *        If you start an execution from a <code>StartExecution</code> request with a state machine version ARN,
     *        this field will be null.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withStateMachineAliasArn(String stateMachineAliasArn) {
        setStateMachineAliasArn(stateMachineAliasArn);
        return this;
    }

    /**
     * <p>
     * The number of times you've redriven an execution. If you have not yet redriven an execution, the
     * <code>redriveCount</code> is 0. This count is only updated if you successfully redrive an execution.
     * </p>
     * 
     * @param redriveCount
     *        The number of times you've redriven an execution. If you have not yet redriven an execution, the
     *        <code>redriveCount</code> is 0. This count is only updated if you successfully redrive an execution.
     */

    public void setRedriveCount(Integer redriveCount) {
        this.redriveCount = redriveCount;
    }

    /**
     * <p>
     * The number of times you've redriven an execution. If you have not yet redriven an execution, the
     * <code>redriveCount</code> is 0. This count is only updated if you successfully redrive an execution.
     * </p>
     * 
     * @return The number of times you've redriven an execution. If you have not yet redriven an execution, the
     *         <code>redriveCount</code> is 0. This count is only updated if you successfully redrive an execution.
     */

    public Integer getRedriveCount() {
        return this.redriveCount;
    }

    /**
     * <p>
     * The number of times you've redriven an execution. If you have not yet redriven an execution, the
     * <code>redriveCount</code> is 0. This count is only updated if you successfully redrive an execution.
     * </p>
     * 
     * @param redriveCount
     *        The number of times you've redriven an execution. If you have not yet redriven an execution, the
     *        <code>redriveCount</code> is 0. This count is only updated if you successfully redrive an execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withRedriveCount(Integer redriveCount) {
        setRedriveCount(redriveCount);
        return this;
    }

    /**
     * <p>
     * The date the execution was last redriven. If you have not yet redriven an execution, the <code>redriveDate</code>
     * is null.
     * </p>
     * <p>
     * The <code>redriveDate</code> is unavailable if you redrive a Map Run that starts child workflow executions of
     * type <code>EXPRESS</code>.
     * </p>
     * 
     * @param redriveDate
     *        The date the execution was last redriven. If you have not yet redriven an execution, the
     *        <code>redriveDate</code> is null.</p>
     *        <p>
     *        The <code>redriveDate</code> is unavailable if you redrive a Map Run that starts child workflow executions
     *        of type <code>EXPRESS</code>.
     */

    public void setRedriveDate(java.util.Date redriveDate) {
        this.redriveDate = redriveDate;
    }

    /**
     * <p>
     * The date the execution was last redriven. If you have not yet redriven an execution, the <code>redriveDate</code>
     * is null.
     * </p>
     * <p>
     * The <code>redriveDate</code> is unavailable if you redrive a Map Run that starts child workflow executions of
     * type <code>EXPRESS</code>.
     * </p>
     * 
     * @return The date the execution was last redriven. If you have not yet redriven an execution, the
     *         <code>redriveDate</code> is null.</p>
     *         <p>
     *         The <code>redriveDate</code> is unavailable if you redrive a Map Run that starts child workflow
     *         executions of type <code>EXPRESS</code>.
     */

    public java.util.Date getRedriveDate() {
        return this.redriveDate;
    }

    /**
     * <p>
     * The date the execution was last redriven. If you have not yet redriven an execution, the <code>redriveDate</code>
     * is null.
     * </p>
     * <p>
     * The <code>redriveDate</code> is unavailable if you redrive a Map Run that starts child workflow executions of
     * type <code>EXPRESS</code>.
     * </p>
     * 
     * @param redriveDate
     *        The date the execution was last redriven. If you have not yet redriven an execution, the
     *        <code>redriveDate</code> is null.</p>
     *        <p>
     *        The <code>redriveDate</code> is unavailable if you redrive a Map Run that starts child workflow executions
     *        of type <code>EXPRESS</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withRedriveDate(java.util.Date redriveDate) {
        setRedriveDate(redriveDate);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not an execution can be redriven at a given point in time.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For executions of type <code>STANDARD</code>, <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code> if
     * calling the <a>RedriveExecution</a> API action would return the <code>ExecutionNotRedrivable</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>STANDARD</code>, <code>redriveStatus</code>
     * indicates whether or not the Map Run can redrive child workflow executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>EXPRESS</code>, <code>redriveStatus</code>
     * indicates whether or not the Map Run can redrive child workflow executions.
     * </p>
     * <p>
     * You can redrive failed or timed out <code>EXPRESS</code> workflows <i>only if</i> they're a part of a Map Run.
     * When you <a href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-map-run.html">redrive</a> the Map
     * Run, these workflows are restarted using the <a>StartExecution</a> API action.
     * </p>
     * </li>
     * </ul>
     * 
     * @param redriveStatus
     *        Indicates whether or not an execution can be redriven at a given point in time.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For executions of type <code>STANDARD</code>, <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code> if
     *        calling the <a>RedriveExecution</a> API action would return the <code>ExecutionNotRedrivable</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a Distributed Map that includes child workflows of type <code>STANDARD</code>,
     *        <code>redriveStatus</code> indicates whether or not the Map Run can redrive child workflow executions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a Distributed Map that includes child workflows of type <code>EXPRESS</code>,
     *        <code>redriveStatus</code> indicates whether or not the Map Run can redrive child workflow executions.
     *        </p>
     *        <p>
     *        You can redrive failed or timed out <code>EXPRESS</code> workflows <i>only if</i> they're a part of a Map
     *        Run. When you <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-map-run.html">redrive</a> the Map Run,
     *        these workflows are restarted using the <a>StartExecution</a> API action.
     *        </p>
     *        </li>
     * @see ExecutionRedriveStatus
     */

    public void setRedriveStatus(String redriveStatus) {
        this.redriveStatus = redriveStatus;
    }

    /**
     * <p>
     * Indicates whether or not an execution can be redriven at a given point in time.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For executions of type <code>STANDARD</code>, <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code> if
     * calling the <a>RedriveExecution</a> API action would return the <code>ExecutionNotRedrivable</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>STANDARD</code>, <code>redriveStatus</code>
     * indicates whether or not the Map Run can redrive child workflow executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>EXPRESS</code>, <code>redriveStatus</code>
     * indicates whether or not the Map Run can redrive child workflow executions.
     * </p>
     * <p>
     * You can redrive failed or timed out <code>EXPRESS</code> workflows <i>only if</i> they're a part of a Map Run.
     * When you <a href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-map-run.html">redrive</a> the Map
     * Run, these workflows are restarted using the <a>StartExecution</a> API action.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Indicates whether or not an execution can be redriven at a given point in time.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For executions of type <code>STANDARD</code>, <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code>
     *         if calling the <a>RedriveExecution</a> API action would return the <code>ExecutionNotRedrivable</code>
     *         error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For a Distributed Map that includes child workflows of type <code>STANDARD</code>,
     *         <code>redriveStatus</code> indicates whether or not the Map Run can redrive child workflow executions.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         For a Distributed Map that includes child workflows of type <code>EXPRESS</code>,
     *         <code>redriveStatus</code> indicates whether or not the Map Run can redrive child workflow executions.
     *         </p>
     *         <p>
     *         You can redrive failed or timed out <code>EXPRESS</code> workflows <i>only if</i> they're a part of a Map
     *         Run. When you <a
     *         href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-map-run.html">redrive</a> the Map Run,
     *         these workflows are restarted using the <a>StartExecution</a> API action.
     *         </p>
     *         </li>
     * @see ExecutionRedriveStatus
     */

    public String getRedriveStatus() {
        return this.redriveStatus;
    }

    /**
     * <p>
     * Indicates whether or not an execution can be redriven at a given point in time.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For executions of type <code>STANDARD</code>, <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code> if
     * calling the <a>RedriveExecution</a> API action would return the <code>ExecutionNotRedrivable</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>STANDARD</code>, <code>redriveStatus</code>
     * indicates whether or not the Map Run can redrive child workflow executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>EXPRESS</code>, <code>redriveStatus</code>
     * indicates whether or not the Map Run can redrive child workflow executions.
     * </p>
     * <p>
     * You can redrive failed or timed out <code>EXPRESS</code> workflows <i>only if</i> they're a part of a Map Run.
     * When you <a href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-map-run.html">redrive</a> the Map
     * Run, these workflows are restarted using the <a>StartExecution</a> API action.
     * </p>
     * </li>
     * </ul>
     * 
     * @param redriveStatus
     *        Indicates whether or not an execution can be redriven at a given point in time.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For executions of type <code>STANDARD</code>, <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code> if
     *        calling the <a>RedriveExecution</a> API action would return the <code>ExecutionNotRedrivable</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a Distributed Map that includes child workflows of type <code>STANDARD</code>,
     *        <code>redriveStatus</code> indicates whether or not the Map Run can redrive child workflow executions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a Distributed Map that includes child workflows of type <code>EXPRESS</code>,
     *        <code>redriveStatus</code> indicates whether or not the Map Run can redrive child workflow executions.
     *        </p>
     *        <p>
     *        You can redrive failed or timed out <code>EXPRESS</code> workflows <i>only if</i> they're a part of a Map
     *        Run. When you <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-map-run.html">redrive</a> the Map Run,
     *        these workflows are restarted using the <a>StartExecution</a> API action.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionRedriveStatus
     */

    public DescribeExecutionResult withRedriveStatus(String redriveStatus) {
        setRedriveStatus(redriveStatus);
        return this;
    }

    /**
     * <p>
     * Indicates whether or not an execution can be redriven at a given point in time.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For executions of type <code>STANDARD</code>, <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code> if
     * calling the <a>RedriveExecution</a> API action would return the <code>ExecutionNotRedrivable</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>STANDARD</code>, <code>redriveStatus</code>
     * indicates whether or not the Map Run can redrive child workflow executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>EXPRESS</code>, <code>redriveStatus</code>
     * indicates whether or not the Map Run can redrive child workflow executions.
     * </p>
     * <p>
     * You can redrive failed or timed out <code>EXPRESS</code> workflows <i>only if</i> they're a part of a Map Run.
     * When you <a href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-map-run.html">redrive</a> the Map
     * Run, these workflows are restarted using the <a>StartExecution</a> API action.
     * </p>
     * </li>
     * </ul>
     * 
     * @param redriveStatus
     *        Indicates whether or not an execution can be redriven at a given point in time.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For executions of type <code>STANDARD</code>, <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code> if
     *        calling the <a>RedriveExecution</a> API action would return the <code>ExecutionNotRedrivable</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a Distributed Map that includes child workflows of type <code>STANDARD</code>,
     *        <code>redriveStatus</code> indicates whether or not the Map Run can redrive child workflow executions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a Distributed Map that includes child workflows of type <code>EXPRESS</code>,
     *        <code>redriveStatus</code> indicates whether or not the Map Run can redrive child workflow executions.
     *        </p>
     *        <p>
     *        You can redrive failed or timed out <code>EXPRESS</code> workflows <i>only if</i> they're a part of a Map
     *        Run. When you <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-map-run.html">redrive</a> the Map Run,
     *        these workflows are restarted using the <a>StartExecution</a> API action.
     *        </p>
     *        </li>
     * @see ExecutionRedriveStatus
     */

    public void setRedriveStatus(ExecutionRedriveStatus redriveStatus) {
        withRedriveStatus(redriveStatus);
    }

    /**
     * <p>
     * Indicates whether or not an execution can be redriven at a given point in time.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For executions of type <code>STANDARD</code>, <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code> if
     * calling the <a>RedriveExecution</a> API action would return the <code>ExecutionNotRedrivable</code> error.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>STANDARD</code>, <code>redriveStatus</code>
     * indicates whether or not the Map Run can redrive child workflow executions.
     * </p>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>EXPRESS</code>, <code>redriveStatus</code>
     * indicates whether or not the Map Run can redrive child workflow executions.
     * </p>
     * <p>
     * You can redrive failed or timed out <code>EXPRESS</code> workflows <i>only if</i> they're a part of a Map Run.
     * When you <a href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-map-run.html">redrive</a> the Map
     * Run, these workflows are restarted using the <a>StartExecution</a> API action.
     * </p>
     * </li>
     * </ul>
     * 
     * @param redriveStatus
     *        Indicates whether or not an execution can be redriven at a given point in time.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For executions of type <code>STANDARD</code>, <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code> if
     *        calling the <a>RedriveExecution</a> API action would return the <code>ExecutionNotRedrivable</code> error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a Distributed Map that includes child workflows of type <code>STANDARD</code>,
     *        <code>redriveStatus</code> indicates whether or not the Map Run can redrive child workflow executions.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        For a Distributed Map that includes child workflows of type <code>EXPRESS</code>,
     *        <code>redriveStatus</code> indicates whether or not the Map Run can redrive child workflow executions.
     *        </p>
     *        <p>
     *        You can redrive failed or timed out <code>EXPRESS</code> workflows <i>only if</i> they're a part of a Map
     *        Run. When you <a
     *        href="https://docs.aws.amazon.com/step-functions/latest/dg/redrive-map-run.html">redrive</a> the Map Run,
     *        these workflows are restarted using the <a>StartExecution</a> API action.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ExecutionRedriveStatus
     */

    public DescribeExecutionResult withRedriveStatus(ExecutionRedriveStatus redriveStatus) {
        this.redriveStatus = redriveStatus.toString();
        return this;
    }

    /**
     * <p>
     * When <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code>, <code>redriveStatusReason</code> specifies the
     * reason why an execution cannot be redriven.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For executions of type <code>STANDARD</code>, or for a Distributed Map that includes child workflows of type
     * <code>STANDARD</code>, <code>redriveStatusReason</code> can include one of the following reasons:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>State machine is in DELETING status</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution is RUNNING and cannot be redriven</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution is SUCCEEDED and cannot be redriven</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution was started before the launch of RedriveExecution</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution history event limit exceeded</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution has exceeded the max execution time</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution redrivable period exceeded</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>EXPRESS</code>,
     * <code>redriveStatusReason</code> is only returned if the child workflows are not redrivable. This happens when
     * the child workflow executions have completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param redriveStatusReason
     *        When <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code>, <code>redriveStatusReason</code> specifies
     *        the reason why an execution cannot be redriven.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For executions of type <code>STANDARD</code>, or for a Distributed Map that includes child workflows of
     *        type <code>STANDARD</code>, <code>redriveStatusReason</code> can include one of the following reasons:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>State machine is in DELETING status</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Execution is RUNNING and cannot be redriven</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Execution is SUCCEEDED and cannot be redriven</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Execution was started before the launch of RedriveExecution</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Execution history event limit exceeded</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Execution has exceeded the max execution time</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Execution redrivable period exceeded</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For a Distributed Map that includes child workflows of type <code>EXPRESS</code>,
     *        <code>redriveStatusReason</code> is only returned if the child workflows are not redrivable. This happens
     *        when the child workflow executions have completed successfully.
     *        </p>
     *        </li>
     */

    public void setRedriveStatusReason(String redriveStatusReason) {
        this.redriveStatusReason = redriveStatusReason;
    }

    /**
     * <p>
     * When <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code>, <code>redriveStatusReason</code> specifies the
     * reason why an execution cannot be redriven.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For executions of type <code>STANDARD</code>, or for a Distributed Map that includes child workflows of type
     * <code>STANDARD</code>, <code>redriveStatusReason</code> can include one of the following reasons:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>State machine is in DELETING status</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution is RUNNING and cannot be redriven</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution is SUCCEEDED and cannot be redriven</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution was started before the launch of RedriveExecution</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution history event limit exceeded</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution has exceeded the max execution time</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution redrivable period exceeded</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>EXPRESS</code>,
     * <code>redriveStatusReason</code> is only returned if the child workflows are not redrivable. This happens when
     * the child workflow executions have completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @return When <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code>, <code>redriveStatusReason</code>
     *         specifies the reason why an execution cannot be redriven.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         For executions of type <code>STANDARD</code>, or for a Distributed Map that includes child workflows of
     *         type <code>STANDARD</code>, <code>redriveStatusReason</code> can include one of the following reasons:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>State machine is in DELETING status</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Execution is RUNNING and cannot be redriven</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Execution is SUCCEEDED and cannot be redriven</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Execution was started before the launch of RedriveExecution</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Execution history event limit exceeded</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Execution has exceeded the max execution time</code>.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Execution redrivable period exceeded</code>.
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         For a Distributed Map that includes child workflows of type <code>EXPRESS</code>,
     *         <code>redriveStatusReason</code> is only returned if the child workflows are not redrivable. This happens
     *         when the child workflow executions have completed successfully.
     *         </p>
     *         </li>
     */

    public String getRedriveStatusReason() {
        return this.redriveStatusReason;
    }

    /**
     * <p>
     * When <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code>, <code>redriveStatusReason</code> specifies the
     * reason why an execution cannot be redriven.
     * </p>
     * <ul>
     * <li>
     * <p>
     * For executions of type <code>STANDARD</code>, or for a Distributed Map that includes child workflows of type
     * <code>STANDARD</code>, <code>redriveStatusReason</code> can include one of the following reasons:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>State machine is in DELETING status</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution is RUNNING and cannot be redriven</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution is SUCCEEDED and cannot be redriven</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution was started before the launch of RedriveExecution</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution history event limit exceeded</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution has exceeded the max execution time</code>.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Execution redrivable period exceeded</code>.
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * For a Distributed Map that includes child workflows of type <code>EXPRESS</code>,
     * <code>redriveStatusReason</code> is only returned if the child workflows are not redrivable. This happens when
     * the child workflow executions have completed successfully.
     * </p>
     * </li>
     * </ul>
     * 
     * @param redriveStatusReason
     *        When <code>redriveStatus</code> is <code>NOT_REDRIVABLE</code>, <code>redriveStatusReason</code> specifies
     *        the reason why an execution cannot be redriven.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        For executions of type <code>STANDARD</code>, or for a Distributed Map that includes child workflows of
     *        type <code>STANDARD</code>, <code>redriveStatusReason</code> can include one of the following reasons:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>State machine is in DELETING status</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Execution is RUNNING and cannot be redriven</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Execution is SUCCEEDED and cannot be redriven</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Execution was started before the launch of RedriveExecution</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Execution history event limit exceeded</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Execution has exceeded the max execution time</code>.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Execution redrivable period exceeded</code>.
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        For a Distributed Map that includes child workflows of type <code>EXPRESS</code>,
     *        <code>redriveStatusReason</code> is only returned if the child workflows are not redrivable. This happens
     *        when the child workflow executions have completed successfully.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeExecutionResult withRedriveStatusReason(String redriveStatusReason) {
        setRedriveStatusReason(redriveStatusReason);
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
        if (getExecutionArn() != null)
            sb.append("ExecutionArn: ").append(getExecutionArn()).append(",");
        if (getStateMachineArn() != null)
            sb.append("StateMachineArn: ").append(getStateMachineArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartDate() != null)
            sb.append("StartDate: ").append(getStartDate()).append(",");
        if (getStopDate() != null)
            sb.append("StopDate: ").append(getStopDate()).append(",");
        if (getInput() != null)
            sb.append("Input: ").append("***Sensitive Data Redacted***").append(",");
        if (getInputDetails() != null)
            sb.append("InputDetails: ").append(getInputDetails()).append(",");
        if (getOutput() != null)
            sb.append("Output: ").append("***Sensitive Data Redacted***").append(",");
        if (getOutputDetails() != null)
            sb.append("OutputDetails: ").append(getOutputDetails()).append(",");
        if (getTraceHeader() != null)
            sb.append("TraceHeader: ").append(getTraceHeader()).append(",");
        if (getMapRunArn() != null)
            sb.append("MapRunArn: ").append(getMapRunArn()).append(",");
        if (getError() != null)
            sb.append("Error: ").append("***Sensitive Data Redacted***").append(",");
        if (getCause() != null)
            sb.append("Cause: ").append("***Sensitive Data Redacted***").append(",");
        if (getStateMachineVersionArn() != null)
            sb.append("StateMachineVersionArn: ").append(getStateMachineVersionArn()).append(",");
        if (getStateMachineAliasArn() != null)
            sb.append("StateMachineAliasArn: ").append(getStateMachineAliasArn()).append(",");
        if (getRedriveCount() != null)
            sb.append("RedriveCount: ").append(getRedriveCount()).append(",");
        if (getRedriveDate() != null)
            sb.append("RedriveDate: ").append(getRedriveDate()).append(",");
        if (getRedriveStatus() != null)
            sb.append("RedriveStatus: ").append(getRedriveStatus()).append(",");
        if (getRedriveStatusReason() != null)
            sb.append("RedriveStatusReason: ").append("***Sensitive Data Redacted***");
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeExecutionResult == false)
            return false;
        DescribeExecutionResult other = (DescribeExecutionResult) obj;
        if (other.getExecutionArn() == null ^ this.getExecutionArn() == null)
            return false;
        if (other.getExecutionArn() != null && other.getExecutionArn().equals(this.getExecutionArn()) == false)
            return false;
        if (other.getStateMachineArn() == null ^ this.getStateMachineArn() == null)
            return false;
        if (other.getStateMachineArn() != null && other.getStateMachineArn().equals(this.getStateMachineArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartDate() == null ^ this.getStartDate() == null)
            return false;
        if (other.getStartDate() != null && other.getStartDate().equals(this.getStartDate()) == false)
            return false;
        if (other.getStopDate() == null ^ this.getStopDate() == null)
            return false;
        if (other.getStopDate() != null && other.getStopDate().equals(this.getStopDate()) == false)
            return false;
        if (other.getInput() == null ^ this.getInput() == null)
            return false;
        if (other.getInput() != null && other.getInput().equals(this.getInput()) == false)
            return false;
        if (other.getInputDetails() == null ^ this.getInputDetails() == null)
            return false;
        if (other.getInputDetails() != null && other.getInputDetails().equals(this.getInputDetails()) == false)
            return false;
        if (other.getOutput() == null ^ this.getOutput() == null)
            return false;
        if (other.getOutput() != null && other.getOutput().equals(this.getOutput()) == false)
            return false;
        if (other.getOutputDetails() == null ^ this.getOutputDetails() == null)
            return false;
        if (other.getOutputDetails() != null && other.getOutputDetails().equals(this.getOutputDetails()) == false)
            return false;
        if (other.getTraceHeader() == null ^ this.getTraceHeader() == null)
            return false;
        if (other.getTraceHeader() != null && other.getTraceHeader().equals(this.getTraceHeader()) == false)
            return false;
        if (other.getMapRunArn() == null ^ this.getMapRunArn() == null)
            return false;
        if (other.getMapRunArn() != null && other.getMapRunArn().equals(this.getMapRunArn()) == false)
            return false;
        if (other.getError() == null ^ this.getError() == null)
            return false;
        if (other.getError() != null && other.getError().equals(this.getError()) == false)
            return false;
        if (other.getCause() == null ^ this.getCause() == null)
            return false;
        if (other.getCause() != null && other.getCause().equals(this.getCause()) == false)
            return false;
        if (other.getStateMachineVersionArn() == null ^ this.getStateMachineVersionArn() == null)
            return false;
        if (other.getStateMachineVersionArn() != null && other.getStateMachineVersionArn().equals(this.getStateMachineVersionArn()) == false)
            return false;
        if (other.getStateMachineAliasArn() == null ^ this.getStateMachineAliasArn() == null)
            return false;
        if (other.getStateMachineAliasArn() != null && other.getStateMachineAliasArn().equals(this.getStateMachineAliasArn()) == false)
            return false;
        if (other.getRedriveCount() == null ^ this.getRedriveCount() == null)
            return false;
        if (other.getRedriveCount() != null && other.getRedriveCount().equals(this.getRedriveCount()) == false)
            return false;
        if (other.getRedriveDate() == null ^ this.getRedriveDate() == null)
            return false;
        if (other.getRedriveDate() != null && other.getRedriveDate().equals(this.getRedriveDate()) == false)
            return false;
        if (other.getRedriveStatus() == null ^ this.getRedriveStatus() == null)
            return false;
        if (other.getRedriveStatus() != null && other.getRedriveStatus().equals(this.getRedriveStatus()) == false)
            return false;
        if (other.getRedriveStatusReason() == null ^ this.getRedriveStatusReason() == null)
            return false;
        if (other.getRedriveStatusReason() != null && other.getRedriveStatusReason().equals(this.getRedriveStatusReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getExecutionArn() == null) ? 0 : getExecutionArn().hashCode());
        hashCode = prime * hashCode + ((getStateMachineArn() == null) ? 0 : getStateMachineArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartDate() == null) ? 0 : getStartDate().hashCode());
        hashCode = prime * hashCode + ((getStopDate() == null) ? 0 : getStopDate().hashCode());
        hashCode = prime * hashCode + ((getInput() == null) ? 0 : getInput().hashCode());
        hashCode = prime * hashCode + ((getInputDetails() == null) ? 0 : getInputDetails().hashCode());
        hashCode = prime * hashCode + ((getOutput() == null) ? 0 : getOutput().hashCode());
        hashCode = prime * hashCode + ((getOutputDetails() == null) ? 0 : getOutputDetails().hashCode());
        hashCode = prime * hashCode + ((getTraceHeader() == null) ? 0 : getTraceHeader().hashCode());
        hashCode = prime * hashCode + ((getMapRunArn() == null) ? 0 : getMapRunArn().hashCode());
        hashCode = prime * hashCode + ((getError() == null) ? 0 : getError().hashCode());
        hashCode = prime * hashCode + ((getCause() == null) ? 0 : getCause().hashCode());
        hashCode = prime * hashCode + ((getStateMachineVersionArn() == null) ? 0 : getStateMachineVersionArn().hashCode());
        hashCode = prime * hashCode + ((getStateMachineAliasArn() == null) ? 0 : getStateMachineAliasArn().hashCode());
        hashCode = prime * hashCode + ((getRedriveCount() == null) ? 0 : getRedriveCount().hashCode());
        hashCode = prime * hashCode + ((getRedriveDate() == null) ? 0 : getRedriveDate().hashCode());
        hashCode = prime * hashCode + ((getRedriveStatus() == null) ? 0 : getRedriveStatus().hashCode());
        hashCode = prime * hashCode + ((getRedriveStatusReason() == null) ? 0 : getRedriveStatusReason().hashCode());
        return hashCode;
    }

    @Override
    public DescribeExecutionResult clone() {
        try {
            return (DescribeExecutionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
