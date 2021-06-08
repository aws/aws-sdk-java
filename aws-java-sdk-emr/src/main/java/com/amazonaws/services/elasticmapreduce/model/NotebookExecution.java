/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A notebook execution. An execution is a specific instance that an EMR Notebook is run using the
 * <code>StartNotebookExecution</code> action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/NotebookExecution" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotebookExecution implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of a notebook execution.
     * </p>
     */
    private String notebookExecutionId;
    /**
     * <p>
     * The unique identifier of the EMR Notebook that is used for the notebook execution.
     * </p>
     */
    private String editorId;
    /**
     * <p>
     * The execution engine, such as an EMR cluster, used to run the EMR notebook and perform the notebook execution.
     * </p>
     */
    private ExecutionEngineConfig executionEngine;
    /**
     * <p>
     * A name for the notebook execution.
     * </p>
     */
    private String notebookExecutionName;
    /**
     * <p>
     * Input parameters in JSON format passed to the EMR Notebook at runtime for execution.
     * </p>
     */
    private String notebookParams;
    /**
     * <p>
     * The status of the notebook execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START_PENDING</code> indicates that the cluster has received the execution request but execution has not
     * begun.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTING</code> indicates that the execution is starting on the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> indicates that the execution is being processed by the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINISHING</code> indicates that execution processing is in the final stages.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINISHED</code> indicates that the execution has completed without error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILING</code> indicates that the execution is failing and will not finish successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> indicates that the execution failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_PENDING</code> indicates that the cluster has received a <code>StopNotebookExecution</code> request
     * and the stop is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code> indicates that the cluster is in the process of stopping the execution as a result of a
     * <code>StopNotebookExecution</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> indicates that the execution stopped because of a <code>StopNotebookExecution</code>
     * request.
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * The timestamp when notebook execution started.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The timestamp when notebook execution ended.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook execution.
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The location of the notebook execution's output file in Amazon S3.
     * </p>
     */
    private String outputNotebookURI;
    /**
     * <p>
     * The reason for the latest status change of the notebook execution.
     * </p>
     */
    private String lastStateChangeReason;
    /**
     * <p>
     * The unique identifier of the EC2 security group associated with the EMR Notebook instance. For more information
     * see <a href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-notebooks-security-groups.html">
     * Specifying EC2 Security Groups for EMR Notebooks</a> in the <i>EMR Management Guide</i>.
     * </p>
     */
    private String notebookInstanceSecurityGroupId;
    /**
     * <p>
     * A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     * characters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The unique identifier of a notebook execution.
     * </p>
     * 
     * @param notebookExecutionId
     *        The unique identifier of a notebook execution.
     */

    public void setNotebookExecutionId(String notebookExecutionId) {
        this.notebookExecutionId = notebookExecutionId;
    }

    /**
     * <p>
     * The unique identifier of a notebook execution.
     * </p>
     * 
     * @return The unique identifier of a notebook execution.
     */

    public String getNotebookExecutionId() {
        return this.notebookExecutionId;
    }

    /**
     * <p>
     * The unique identifier of a notebook execution.
     * </p>
     * 
     * @param notebookExecutionId
     *        The unique identifier of a notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecution withNotebookExecutionId(String notebookExecutionId) {
        setNotebookExecutionId(notebookExecutionId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the EMR Notebook that is used for the notebook execution.
     * </p>
     * 
     * @param editorId
     *        The unique identifier of the EMR Notebook that is used for the notebook execution.
     */

    public void setEditorId(String editorId) {
        this.editorId = editorId;
    }

    /**
     * <p>
     * The unique identifier of the EMR Notebook that is used for the notebook execution.
     * </p>
     * 
     * @return The unique identifier of the EMR Notebook that is used for the notebook execution.
     */

    public String getEditorId() {
        return this.editorId;
    }

    /**
     * <p>
     * The unique identifier of the EMR Notebook that is used for the notebook execution.
     * </p>
     * 
     * @param editorId
     *        The unique identifier of the EMR Notebook that is used for the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecution withEditorId(String editorId) {
        setEditorId(editorId);
        return this;
    }

    /**
     * <p>
     * The execution engine, such as an EMR cluster, used to run the EMR notebook and perform the notebook execution.
     * </p>
     * 
     * @param executionEngine
     *        The execution engine, such as an EMR cluster, used to run the EMR notebook and perform the notebook
     *        execution.
     */

    public void setExecutionEngine(ExecutionEngineConfig executionEngine) {
        this.executionEngine = executionEngine;
    }

    /**
     * <p>
     * The execution engine, such as an EMR cluster, used to run the EMR notebook and perform the notebook execution.
     * </p>
     * 
     * @return The execution engine, such as an EMR cluster, used to run the EMR notebook and perform the notebook
     *         execution.
     */

    public ExecutionEngineConfig getExecutionEngine() {
        return this.executionEngine;
    }

    /**
     * <p>
     * The execution engine, such as an EMR cluster, used to run the EMR notebook and perform the notebook execution.
     * </p>
     * 
     * @param executionEngine
     *        The execution engine, such as an EMR cluster, used to run the EMR notebook and perform the notebook
     *        execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecution withExecutionEngine(ExecutionEngineConfig executionEngine) {
        setExecutionEngine(executionEngine);
        return this;
    }

    /**
     * <p>
     * A name for the notebook execution.
     * </p>
     * 
     * @param notebookExecutionName
     *        A name for the notebook execution.
     */

    public void setNotebookExecutionName(String notebookExecutionName) {
        this.notebookExecutionName = notebookExecutionName;
    }

    /**
     * <p>
     * A name for the notebook execution.
     * </p>
     * 
     * @return A name for the notebook execution.
     */

    public String getNotebookExecutionName() {
        return this.notebookExecutionName;
    }

    /**
     * <p>
     * A name for the notebook execution.
     * </p>
     * 
     * @param notebookExecutionName
     *        A name for the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecution withNotebookExecutionName(String notebookExecutionName) {
        setNotebookExecutionName(notebookExecutionName);
        return this;
    }

    /**
     * <p>
     * Input parameters in JSON format passed to the EMR Notebook at runtime for execution.
     * </p>
     * 
     * @param notebookParams
     *        Input parameters in JSON format passed to the EMR Notebook at runtime for execution.
     */

    public void setNotebookParams(String notebookParams) {
        this.notebookParams = notebookParams;
    }

    /**
     * <p>
     * Input parameters in JSON format passed to the EMR Notebook at runtime for execution.
     * </p>
     * 
     * @return Input parameters in JSON format passed to the EMR Notebook at runtime for execution.
     */

    public String getNotebookParams() {
        return this.notebookParams;
    }

    /**
     * <p>
     * Input parameters in JSON format passed to the EMR Notebook at runtime for execution.
     * </p>
     * 
     * @param notebookParams
     *        Input parameters in JSON format passed to the EMR Notebook at runtime for execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecution withNotebookParams(String notebookParams) {
        setNotebookParams(notebookParams);
        return this;
    }

    /**
     * <p>
     * The status of the notebook execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START_PENDING</code> indicates that the cluster has received the execution request but execution has not
     * begun.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTING</code> indicates that the execution is starting on the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> indicates that the execution is being processed by the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINISHING</code> indicates that execution processing is in the final stages.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINISHED</code> indicates that the execution has completed without error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILING</code> indicates that the execution is failing and will not finish successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> indicates that the execution failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_PENDING</code> indicates that the cluster has received a <code>StopNotebookExecution</code> request
     * and the stop is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code> indicates that the cluster is in the process of stopping the execution as a result of a
     * <code>StopNotebookExecution</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> indicates that the execution stopped because of a <code>StopNotebookExecution</code>
     * request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the notebook execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>START_PENDING</code> indicates that the cluster has received the execution request but execution has
     *        not begun.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTING</code> indicates that the execution is starting on the cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> indicates that the execution is being processed by the cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FINISHING</code> indicates that execution processing is in the final stages.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FINISHED</code> indicates that the execution has completed without error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILING</code> indicates that the execution is failing and will not finish successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> indicates that the execution failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOP_PENDING</code> indicates that the cluster has received a <code>StopNotebookExecution</code>
     *        request and the stop is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPING</code> indicates that the cluster is in the process of stopping the execution as a result
     *        of a <code>StopNotebookExecution</code> request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code> indicates that the execution stopped because of a <code>StopNotebookExecution</code>
     *        request.
     *        </p>
     *        </li>
     * @see NotebookExecutionStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the notebook execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START_PENDING</code> indicates that the cluster has received the execution request but execution has not
     * begun.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTING</code> indicates that the execution is starting on the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> indicates that the execution is being processed by the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINISHING</code> indicates that execution processing is in the final stages.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINISHED</code> indicates that the execution has completed without error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILING</code> indicates that the execution is failing and will not finish successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> indicates that the execution failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_PENDING</code> indicates that the cluster has received a <code>StopNotebookExecution</code> request
     * and the stop is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code> indicates that the cluster is in the process of stopping the execution as a result of a
     * <code>StopNotebookExecution</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> indicates that the execution stopped because of a <code>StopNotebookExecution</code>
     * request.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the notebook execution.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>START_PENDING</code> indicates that the cluster has received the execution request but execution
     *         has not begun.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STARTING</code> indicates that the execution is starting on the cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>RUNNING</code> indicates that the execution is being processed by the cluster.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FINISHING</code> indicates that execution processing is in the final stages.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FINISHED</code> indicates that the execution has completed without error.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILING</code> indicates that the execution is failing and will not finish successfully.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> indicates that the execution failed.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOP_PENDING</code> indicates that the cluster has received a <code>StopNotebookExecution</code>
     *         request and the stop is pending.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPING</code> indicates that the cluster is in the process of stopping the execution as a result
     *         of a <code>StopNotebookExecution</code> request.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>STOPPED</code> indicates that the execution stopped because of a <code>StopNotebookExecution</code>
     *         request.
     *         </p>
     *         </li>
     * @see NotebookExecutionStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the notebook execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START_PENDING</code> indicates that the cluster has received the execution request but execution has not
     * begun.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTING</code> indicates that the execution is starting on the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> indicates that the execution is being processed by the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINISHING</code> indicates that execution processing is in the final stages.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINISHED</code> indicates that the execution has completed without error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILING</code> indicates that the execution is failing and will not finish successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> indicates that the execution failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_PENDING</code> indicates that the cluster has received a <code>StopNotebookExecution</code> request
     * and the stop is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code> indicates that the cluster is in the process of stopping the execution as a result of a
     * <code>StopNotebookExecution</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> indicates that the execution stopped because of a <code>StopNotebookExecution</code>
     * request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the notebook execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>START_PENDING</code> indicates that the cluster has received the execution request but execution has
     *        not begun.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTING</code> indicates that the execution is starting on the cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> indicates that the execution is being processed by the cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FINISHING</code> indicates that execution processing is in the final stages.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FINISHED</code> indicates that the execution has completed without error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILING</code> indicates that the execution is failing and will not finish successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> indicates that the execution failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOP_PENDING</code> indicates that the cluster has received a <code>StopNotebookExecution</code>
     *        request and the stop is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPING</code> indicates that the cluster is in the process of stopping the execution as a result
     *        of a <code>StopNotebookExecution</code> request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code> indicates that the execution stopped because of a <code>StopNotebookExecution</code>
     *        request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookExecutionStatus
     */

    public NotebookExecution withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the notebook execution.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>START_PENDING</code> indicates that the cluster has received the execution request but execution has not
     * begun.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STARTING</code> indicates that the execution is starting on the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>RUNNING</code> indicates that the execution is being processed by the cluster.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINISHING</code> indicates that execution processing is in the final stages.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FINISHED</code> indicates that the execution has completed without error.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILING</code> indicates that the execution is failing and will not finish successfully.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> indicates that the execution failed.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOP_PENDING</code> indicates that the cluster has received a <code>StopNotebookExecution</code> request
     * and the stop is pending.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPING</code> indicates that the cluster is in the process of stopping the execution as a result of a
     * <code>StopNotebookExecution</code> request.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>STOPPED</code> indicates that the execution stopped because of a <code>StopNotebookExecution</code>
     * request.
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the notebook execution.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>START_PENDING</code> indicates that the cluster has received the execution request but execution has
     *        not begun.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STARTING</code> indicates that the execution is starting on the cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>RUNNING</code> indicates that the execution is being processed by the cluster.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FINISHING</code> indicates that execution processing is in the final stages.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FINISHED</code> indicates that the execution has completed without error.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILING</code> indicates that the execution is failing and will not finish successfully.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> indicates that the execution failed.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOP_PENDING</code> indicates that the cluster has received a <code>StopNotebookExecution</code>
     *        request and the stop is pending.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPING</code> indicates that the cluster is in the process of stopping the execution as a result
     *        of a <code>StopNotebookExecution</code> request.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>STOPPED</code> indicates that the execution stopped because of a <code>StopNotebookExecution</code>
     *        request.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see NotebookExecutionStatus
     */

    public NotebookExecution withStatus(NotebookExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp when notebook execution started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when notebook execution started.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp when notebook execution started.
     * </p>
     * 
     * @return The timestamp when notebook execution started.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp when notebook execution started.
     * </p>
     * 
     * @param startTime
     *        The timestamp when notebook execution started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecution withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The timestamp when notebook execution ended.
     * </p>
     * 
     * @param endTime
     *        The timestamp when notebook execution ended.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp when notebook execution ended.
     * </p>
     * 
     * @return The timestamp when notebook execution ended.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The timestamp when notebook execution ended.
     * </p>
     * 
     * @param endTime
     *        The timestamp when notebook execution ended.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecution withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook execution.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the notebook execution.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook execution.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the notebook execution.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the notebook execution.
     * </p>
     * 
     * @param arn
     *        The Amazon Resource Name (ARN) of the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecution withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The location of the notebook execution's output file in Amazon S3.
     * </p>
     * 
     * @param outputNotebookURI
     *        The location of the notebook execution's output file in Amazon S3.
     */

    public void setOutputNotebookURI(String outputNotebookURI) {
        this.outputNotebookURI = outputNotebookURI;
    }

    /**
     * <p>
     * The location of the notebook execution's output file in Amazon S3.
     * </p>
     * 
     * @return The location of the notebook execution's output file in Amazon S3.
     */

    public String getOutputNotebookURI() {
        return this.outputNotebookURI;
    }

    /**
     * <p>
     * The location of the notebook execution's output file in Amazon S3.
     * </p>
     * 
     * @param outputNotebookURI
     *        The location of the notebook execution's output file in Amazon S3.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecution withOutputNotebookURI(String outputNotebookURI) {
        setOutputNotebookURI(outputNotebookURI);
        return this;
    }

    /**
     * <p>
     * The reason for the latest status change of the notebook execution.
     * </p>
     * 
     * @param lastStateChangeReason
     *        The reason for the latest status change of the notebook execution.
     */

    public void setLastStateChangeReason(String lastStateChangeReason) {
        this.lastStateChangeReason = lastStateChangeReason;
    }

    /**
     * <p>
     * The reason for the latest status change of the notebook execution.
     * </p>
     * 
     * @return The reason for the latest status change of the notebook execution.
     */

    public String getLastStateChangeReason() {
        return this.lastStateChangeReason;
    }

    /**
     * <p>
     * The reason for the latest status change of the notebook execution.
     * </p>
     * 
     * @param lastStateChangeReason
     *        The reason for the latest status change of the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecution withLastStateChangeReason(String lastStateChangeReason) {
        setLastStateChangeReason(lastStateChangeReason);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the EC2 security group associated with the EMR Notebook instance. For more information
     * see <a href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-notebooks-security-groups.html">
     * Specifying EC2 Security Groups for EMR Notebooks</a> in the <i>EMR Management Guide</i>.
     * </p>
     * 
     * @param notebookInstanceSecurityGroupId
     *        The unique identifier of the EC2 security group associated with the EMR Notebook instance. For more
     *        information see <a
     *        href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-notebooks-security-groups.html"
     *        >Specifying EC2 Security Groups for EMR Notebooks</a> in the <i>EMR Management Guide</i>.
     */

    public void setNotebookInstanceSecurityGroupId(String notebookInstanceSecurityGroupId) {
        this.notebookInstanceSecurityGroupId = notebookInstanceSecurityGroupId;
    }

    /**
     * <p>
     * The unique identifier of the EC2 security group associated with the EMR Notebook instance. For more information
     * see <a href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-notebooks-security-groups.html">
     * Specifying EC2 Security Groups for EMR Notebooks</a> in the <i>EMR Management Guide</i>.
     * </p>
     * 
     * @return The unique identifier of the EC2 security group associated with the EMR Notebook instance. For more
     *         information see <a href=
     *         "https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-notebooks-security-groups.html"
     *         >Specifying EC2 Security Groups for EMR Notebooks</a> in the <i>EMR Management Guide</i>.
     */

    public String getNotebookInstanceSecurityGroupId() {
        return this.notebookInstanceSecurityGroupId;
    }

    /**
     * <p>
     * The unique identifier of the EC2 security group associated with the EMR Notebook instance. For more information
     * see <a href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-notebooks-security-groups.html">
     * Specifying EC2 Security Groups for EMR Notebooks</a> in the <i>EMR Management Guide</i>.
     * </p>
     * 
     * @param notebookInstanceSecurityGroupId
     *        The unique identifier of the EC2 security group associated with the EMR Notebook instance. For more
     *        information see <a
     *        href="https://docs.aws.amazon.com/emr/latest/ManagementGuide/emr-managed-notebooks-security-groups.html"
     *        >Specifying EC2 Security Groups for EMR Notebooks</a> in the <i>EMR Management Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecution withNotebookInstanceSecurityGroupId(String notebookInstanceSecurityGroupId) {
        setNotebookInstanceSecurityGroupId(notebookInstanceSecurityGroupId);
        return this;
    }

    /**
     * <p>
     * A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     * characters.
     * </p>
     * 
     * @return A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist
     *         of a required key string with a maximum of 128 characters and an optional value string with a maximum of
     *         256 characters.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     * characters.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of
     *        a required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     *        characters.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     * characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of
     *        a required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecution withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of a
     * required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     * characters.
     * </p>
     * 
     * @param tags
     *        A list of tags associated with a notebook execution. Tags are user-defined key-value pairs that consist of
     *        a required key string with a maximum of 128 characters and an optional value string with a maximum of 256
     *        characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecution withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getNotebookExecutionId() != null)
            sb.append("NotebookExecutionId: ").append(getNotebookExecutionId()).append(",");
        if (getEditorId() != null)
            sb.append("EditorId: ").append(getEditorId()).append(",");
        if (getExecutionEngine() != null)
            sb.append("ExecutionEngine: ").append(getExecutionEngine()).append(",");
        if (getNotebookExecutionName() != null)
            sb.append("NotebookExecutionName: ").append(getNotebookExecutionName()).append(",");
        if (getNotebookParams() != null)
            sb.append("NotebookParams: ").append(getNotebookParams()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getOutputNotebookURI() != null)
            sb.append("OutputNotebookURI: ").append(getOutputNotebookURI()).append(",");
        if (getLastStateChangeReason() != null)
            sb.append("LastStateChangeReason: ").append(getLastStateChangeReason()).append(",");
        if (getNotebookInstanceSecurityGroupId() != null)
            sb.append("NotebookInstanceSecurityGroupId: ").append(getNotebookInstanceSecurityGroupId()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotebookExecution == false)
            return false;
        NotebookExecution other = (NotebookExecution) obj;
        if (other.getNotebookExecutionId() == null ^ this.getNotebookExecutionId() == null)
            return false;
        if (other.getNotebookExecutionId() != null && other.getNotebookExecutionId().equals(this.getNotebookExecutionId()) == false)
            return false;
        if (other.getEditorId() == null ^ this.getEditorId() == null)
            return false;
        if (other.getEditorId() != null && other.getEditorId().equals(this.getEditorId()) == false)
            return false;
        if (other.getExecutionEngine() == null ^ this.getExecutionEngine() == null)
            return false;
        if (other.getExecutionEngine() != null && other.getExecutionEngine().equals(this.getExecutionEngine()) == false)
            return false;
        if (other.getNotebookExecutionName() == null ^ this.getNotebookExecutionName() == null)
            return false;
        if (other.getNotebookExecutionName() != null && other.getNotebookExecutionName().equals(this.getNotebookExecutionName()) == false)
            return false;
        if (other.getNotebookParams() == null ^ this.getNotebookParams() == null)
            return false;
        if (other.getNotebookParams() != null && other.getNotebookParams().equals(this.getNotebookParams()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getOutputNotebookURI() == null ^ this.getOutputNotebookURI() == null)
            return false;
        if (other.getOutputNotebookURI() != null && other.getOutputNotebookURI().equals(this.getOutputNotebookURI()) == false)
            return false;
        if (other.getLastStateChangeReason() == null ^ this.getLastStateChangeReason() == null)
            return false;
        if (other.getLastStateChangeReason() != null && other.getLastStateChangeReason().equals(this.getLastStateChangeReason()) == false)
            return false;
        if (other.getNotebookInstanceSecurityGroupId() == null ^ this.getNotebookInstanceSecurityGroupId() == null)
            return false;
        if (other.getNotebookInstanceSecurityGroupId() != null
                && other.getNotebookInstanceSecurityGroupId().equals(this.getNotebookInstanceSecurityGroupId()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookExecutionId() == null) ? 0 : getNotebookExecutionId().hashCode());
        hashCode = prime * hashCode + ((getEditorId() == null) ? 0 : getEditorId().hashCode());
        hashCode = prime * hashCode + ((getExecutionEngine() == null) ? 0 : getExecutionEngine().hashCode());
        hashCode = prime * hashCode + ((getNotebookExecutionName() == null) ? 0 : getNotebookExecutionName().hashCode());
        hashCode = prime * hashCode + ((getNotebookParams() == null) ? 0 : getNotebookParams().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getOutputNotebookURI() == null) ? 0 : getOutputNotebookURI().hashCode());
        hashCode = prime * hashCode + ((getLastStateChangeReason() == null) ? 0 : getLastStateChangeReason().hashCode());
        hashCode = prime * hashCode + ((getNotebookInstanceSecurityGroupId() == null) ? 0 : getNotebookInstanceSecurityGroupId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public NotebookExecution clone() {
        try {
            return (NotebookExecution) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.NotebookExecutionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
