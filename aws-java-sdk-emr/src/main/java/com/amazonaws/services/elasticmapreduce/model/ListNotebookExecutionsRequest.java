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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/ListNotebookExecutions"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListNotebookExecutionsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The unique ID of the editor associated with the notebook execution.
     * </p>
     */
    private String editorId;
    /**
     * <p>
     * The status filter for listing notebook executions.
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
     * The beginning of time range filter for listing notebook executions. The default is the timestamp of 30 days ago.
     * </p>
     */
    private java.util.Date from;
    /**
     * <p>
     * The end of time range filter for listing notebook executions. The default is the current timestamp.
     * </p>
     */
    private java.util.Date to;
    /**
     * <p>
     * The pagination token, returned by a previous <code>ListNotebookExecutions</code> call, that indicates the start
     * of the list for this <code>ListNotebookExecutions</code> call.
     * </p>
     */
    private String marker;

    /**
     * <p>
     * The unique ID of the editor associated with the notebook execution.
     * </p>
     * 
     * @param editorId
     *        The unique ID of the editor associated with the notebook execution.
     */

    public void setEditorId(String editorId) {
        this.editorId = editorId;
    }

    /**
     * <p>
     * The unique ID of the editor associated with the notebook execution.
     * </p>
     * 
     * @return The unique ID of the editor associated with the notebook execution.
     */

    public String getEditorId() {
        return this.editorId;
    }

    /**
     * <p>
     * The unique ID of the editor associated with the notebook execution.
     * </p>
     * 
     * @param editorId
     *        The unique ID of the editor associated with the notebook execution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotebookExecutionsRequest withEditorId(String editorId) {
        setEditorId(editorId);
        return this;
    }

    /**
     * <p>
     * The status filter for listing notebook executions.
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
     *        The status filter for listing notebook executions.</p>
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
     * The status filter for listing notebook executions.
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
     * @return The status filter for listing notebook executions.</p>
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
     * The status filter for listing notebook executions.
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
     *        The status filter for listing notebook executions.</p>
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

    public ListNotebookExecutionsRequest withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status filter for listing notebook executions.
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
     *        The status filter for listing notebook executions.</p>
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

    public ListNotebookExecutionsRequest withStatus(NotebookExecutionStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * The beginning of time range filter for listing notebook executions. The default is the timestamp of 30 days ago.
     * </p>
     * 
     * @param from
     *        The beginning of time range filter for listing notebook executions. The default is the timestamp of 30
     *        days ago.
     */

    public void setFrom(java.util.Date from) {
        this.from = from;
    }

    /**
     * <p>
     * The beginning of time range filter for listing notebook executions. The default is the timestamp of 30 days ago.
     * </p>
     * 
     * @return The beginning of time range filter for listing notebook executions. The default is the timestamp of 30
     *         days ago.
     */

    public java.util.Date getFrom() {
        return this.from;
    }

    /**
     * <p>
     * The beginning of time range filter for listing notebook executions. The default is the timestamp of 30 days ago.
     * </p>
     * 
     * @param from
     *        The beginning of time range filter for listing notebook executions. The default is the timestamp of 30
     *        days ago.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotebookExecutionsRequest withFrom(java.util.Date from) {
        setFrom(from);
        return this;
    }

    /**
     * <p>
     * The end of time range filter for listing notebook executions. The default is the current timestamp.
     * </p>
     * 
     * @param to
     *        The end of time range filter for listing notebook executions. The default is the current timestamp.
     */

    public void setTo(java.util.Date to) {
        this.to = to;
    }

    /**
     * <p>
     * The end of time range filter for listing notebook executions. The default is the current timestamp.
     * </p>
     * 
     * @return The end of time range filter for listing notebook executions. The default is the current timestamp.
     */

    public java.util.Date getTo() {
        return this.to;
    }

    /**
     * <p>
     * The end of time range filter for listing notebook executions. The default is the current timestamp.
     * </p>
     * 
     * @param to
     *        The end of time range filter for listing notebook executions. The default is the current timestamp.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotebookExecutionsRequest withTo(java.util.Date to) {
        setTo(to);
        return this;
    }

    /**
     * <p>
     * The pagination token, returned by a previous <code>ListNotebookExecutions</code> call, that indicates the start
     * of the list for this <code>ListNotebookExecutions</code> call.
     * </p>
     * 
     * @param marker
     *        The pagination token, returned by a previous <code>ListNotebookExecutions</code> call, that indicates the
     *        start of the list for this <code>ListNotebookExecutions</code> call.
     */

    public void setMarker(String marker) {
        this.marker = marker;
    }

    /**
     * <p>
     * The pagination token, returned by a previous <code>ListNotebookExecutions</code> call, that indicates the start
     * of the list for this <code>ListNotebookExecutions</code> call.
     * </p>
     * 
     * @return The pagination token, returned by a previous <code>ListNotebookExecutions</code> call, that indicates the
     *         start of the list for this <code>ListNotebookExecutions</code> call.
     */

    public String getMarker() {
        return this.marker;
    }

    /**
     * <p>
     * The pagination token, returned by a previous <code>ListNotebookExecutions</code> call, that indicates the start
     * of the list for this <code>ListNotebookExecutions</code> call.
     * </p>
     * 
     * @param marker
     *        The pagination token, returned by a previous <code>ListNotebookExecutions</code> call, that indicates the
     *        start of the list for this <code>ListNotebookExecutions</code> call.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListNotebookExecutionsRequest withMarker(String marker) {
        setMarker(marker);
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
        if (getEditorId() != null)
            sb.append("EditorId: ").append(getEditorId()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFrom() != null)
            sb.append("From: ").append(getFrom()).append(",");
        if (getTo() != null)
            sb.append("To: ").append(getTo()).append(",");
        if (getMarker() != null)
            sb.append("Marker: ").append(getMarker());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListNotebookExecutionsRequest == false)
            return false;
        ListNotebookExecutionsRequest other = (ListNotebookExecutionsRequest) obj;
        if (other.getEditorId() == null ^ this.getEditorId() == null)
            return false;
        if (other.getEditorId() != null && other.getEditorId().equals(this.getEditorId()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFrom() == null ^ this.getFrom() == null)
            return false;
        if (other.getFrom() != null && other.getFrom().equals(this.getFrom()) == false)
            return false;
        if (other.getTo() == null ^ this.getTo() == null)
            return false;
        if (other.getTo() != null && other.getTo().equals(this.getTo()) == false)
            return false;
        if (other.getMarker() == null ^ this.getMarker() == null)
            return false;
        if (other.getMarker() != null && other.getMarker().equals(this.getMarker()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEditorId() == null) ? 0 : getEditorId().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFrom() == null) ? 0 : getFrom().hashCode());
        hashCode = prime * hashCode + ((getTo() == null) ? 0 : getTo().hashCode());
        hashCode = prime * hashCode + ((getMarker() == null) ? 0 : getMarker().hashCode());
        return hashCode;
    }

    @Override
    public ListNotebookExecutionsRequest clone() {
        return (ListNotebookExecutionsRequest) super.clone();
    }

}
