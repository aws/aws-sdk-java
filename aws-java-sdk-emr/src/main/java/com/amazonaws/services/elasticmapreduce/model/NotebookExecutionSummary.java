/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/NotebookExecutionSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class NotebookExecutionSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique identifier of the notebook execution.
     * </p>
     */
    private String notebookExecutionId;
    /**
     * <p>
     * The unique identifier of the editor associated with the notebook execution.
     * </p>
     */
    private String editorId;
    /**
     * <p>
     * The name of the notebook execution.
     * </p>
     */
    private String notebookExecutionName;
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
     * The timestamp when notebook execution started.
     * </p>
     */
    private java.util.Date endTime;

    /**
     * <p>
     * The unique identifier of the notebook execution.
     * </p>
     * 
     * @param notebookExecutionId
     *        The unique identifier of the notebook execution.
     */

    public void setNotebookExecutionId(String notebookExecutionId) {
        this.notebookExecutionId = notebookExecutionId;
    }

    /**
     * <p>
     * The unique identifier of the notebook execution.
     * </p>
     * 
     * @return The unique identifier of the notebook execution.
     */

    public String getNotebookExecutionId() {
        return this.notebookExecutionId;
    }

    /**
     * <p>
     * The unique identifier of the notebook execution.
     * </p>
     * 
     * @param notebookExecutionId
     *        The unique identifier of the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecutionSummary withNotebookExecutionId(String notebookExecutionId) {
        setNotebookExecutionId(notebookExecutionId);
        return this;
    }

    /**
     * <p>
     * The unique identifier of the editor associated with the notebook execution.
     * </p>
     * 
     * @param editorId
     *        The unique identifier of the editor associated with the notebook execution.
     */

    public void setEditorId(String editorId) {
        this.editorId = editorId;
    }

    /**
     * <p>
     * The unique identifier of the editor associated with the notebook execution.
     * </p>
     * 
     * @return The unique identifier of the editor associated with the notebook execution.
     */

    public String getEditorId() {
        return this.editorId;
    }

    /**
     * <p>
     * The unique identifier of the editor associated with the notebook execution.
     * </p>
     * 
     * @param editorId
     *        The unique identifier of the editor associated with the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecutionSummary withEditorId(String editorId) {
        setEditorId(editorId);
        return this;
    }

    /**
     * <p>
     * The name of the notebook execution.
     * </p>
     * 
     * @param notebookExecutionName
     *        The name of the notebook execution.
     */

    public void setNotebookExecutionName(String notebookExecutionName) {
        this.notebookExecutionName = notebookExecutionName;
    }

    /**
     * <p>
     * The name of the notebook execution.
     * </p>
     * 
     * @return The name of the notebook execution.
     */

    public String getNotebookExecutionName() {
        return this.notebookExecutionName;
    }

    /**
     * <p>
     * The name of the notebook execution.
     * </p>
     * 
     * @param notebookExecutionName
     *        The name of the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecutionSummary withNotebookExecutionName(String notebookExecutionName) {
        setNotebookExecutionName(notebookExecutionName);
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

    public NotebookExecutionSummary withStatus(String status) {
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

    public NotebookExecutionSummary withStatus(NotebookExecutionStatus status) {
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

    public NotebookExecutionSummary withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The timestamp when notebook execution started.
     * </p>
     * 
     * @param endTime
     *        The timestamp when notebook execution started.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp when notebook execution started.
     * </p>
     * 
     * @return The timestamp when notebook execution started.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The timestamp when notebook execution started.
     * </p>
     * 
     * @param endTime
     *        The timestamp when notebook execution started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public NotebookExecutionSummary withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
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
        if (getNotebookExecutionName() != null)
            sb.append("NotebookExecutionName: ").append(getNotebookExecutionName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof NotebookExecutionSummary == false)
            return false;
        NotebookExecutionSummary other = (NotebookExecutionSummary) obj;
        if (other.getNotebookExecutionId() == null ^ this.getNotebookExecutionId() == null)
            return false;
        if (other.getNotebookExecutionId() != null && other.getNotebookExecutionId().equals(this.getNotebookExecutionId()) == false)
            return false;
        if (other.getEditorId() == null ^ this.getEditorId() == null)
            return false;
        if (other.getEditorId() != null && other.getEditorId().equals(this.getEditorId()) == false)
            return false;
        if (other.getNotebookExecutionName() == null ^ this.getNotebookExecutionName() == null)
            return false;
        if (other.getNotebookExecutionName() != null && other.getNotebookExecutionName().equals(this.getNotebookExecutionName()) == false)
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNotebookExecutionId() == null) ? 0 : getNotebookExecutionId().hashCode());
        hashCode = prime * hashCode + ((getEditorId() == null) ? 0 : getEditorId().hashCode());
        hashCode = prime * hashCode + ((getNotebookExecutionName() == null) ? 0 : getNotebookExecutionName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        return hashCode;
    }

    @Override
    public NotebookExecutionSummary clone() {
        try {
            return (NotebookExecutionSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.elasticmapreduce.model.transform.NotebookExecutionSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
