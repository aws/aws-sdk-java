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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#setTaskStatus(SetTaskStatusRequest) SetTaskStatus operation}.
 * <p>
 * Notifies AWS Data Pipeline that a task is completed and provides information about the final status. The task runner calls this action regardless of
 * whether the task was sucessful. The task runner does not need to call SetTaskStatus for tasks that are canceled by the web service during a call to
 * ReportTaskProgress.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#setTaskStatus(SetTaskStatusRequest)
 */
public class SetTaskStatusRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Identifies the task assigned to the task runner. This value is set in
     * the <a>TaskObject</a> that is returned by the <a>PollForTask</a>
     * action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String taskId;

    /**
     * If <code>FINISHED</code>, the task successfully completed. If
     * <code>FAILED</code> the task ended unsuccessfully. The
     * <code>FALSE</code> value is used by preconditions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FINISHED, FAILED, FALSE
     */
    private String taskStatus;

    /**
     * If an error occurred during the task, this value specifies an id value
     * that represents the error. This value is set on the physical attempt
     * object. It is used to display error information to the user. It should
     * not start with string "Service_" which is reserved by the system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String errorId;

    /**
     * If an error occurred during the task, this value specifies a text
     * description of the error. This value is set on the physical attempt
     * object. It is used to display error information to the user. The web
     * service does not parse this value.
     */
    private String errorMessage;

    /**
     * If an error occurred during the task, this value specifies the stack
     * trace associated with the error. This value is set on the physical
     * attempt object. It is used to display error information to the user.
     * The web service does not parse this value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String errorStackTrace;

    /**
     * Identifies the task assigned to the task runner. This value is set in
     * the <a>TaskObject</a> that is returned by the <a>PollForTask</a>
     * action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Identifies the task assigned to the task runner. This value is set in
     *         the <a>TaskObject</a> that is returned by the <a>PollForTask</a>
     *         action.
     */
    public String getTaskId() {
        return taskId;
    }
    
    /**
     * Identifies the task assigned to the task runner. This value is set in
     * the <a>TaskObject</a> that is returned by the <a>PollForTask</a>
     * action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param taskId Identifies the task assigned to the task runner. This value is set in
     *         the <a>TaskObject</a> that is returned by the <a>PollForTask</a>
     *         action.
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
    
    /**
     * Identifies the task assigned to the task runner. This value is set in
     * the <a>TaskObject</a> that is returned by the <a>PollForTask</a>
     * action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param taskId Identifies the task assigned to the task runner. This value is set in
     *         the <a>TaskObject</a> that is returned by the <a>PollForTask</a>
     *         action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetTaskStatusRequest withTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }

    /**
     * If <code>FINISHED</code>, the task successfully completed. If
     * <code>FAILED</code> the task ended unsuccessfully. The
     * <code>FALSE</code> value is used by preconditions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FINISHED, FAILED, FALSE
     *
     * @return If <code>FINISHED</code>, the task successfully completed. If
     *         <code>FAILED</code> the task ended unsuccessfully. The
     *         <code>FALSE</code> value is used by preconditions.
     *
     * @see TaskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }
    
    /**
     * If <code>FINISHED</code>, the task successfully completed. If
     * <code>FAILED</code> the task ended unsuccessfully. The
     * <code>FALSE</code> value is used by preconditions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FINISHED, FAILED, FALSE
     *
     * @param taskStatus If <code>FINISHED</code>, the task successfully completed. If
     *         <code>FAILED</code> the task ended unsuccessfully. The
     *         <code>FALSE</code> value is used by preconditions.
     *
     * @see TaskStatus
     */
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
    
    /**
     * If <code>FINISHED</code>, the task successfully completed. If
     * <code>FAILED</code> the task ended unsuccessfully. The
     * <code>FALSE</code> value is used by preconditions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FINISHED, FAILED, FALSE
     *
     * @param taskStatus If <code>FINISHED</code>, the task successfully completed. If
     *         <code>FAILED</code> the task ended unsuccessfully. The
     *         <code>FALSE</code> value is used by preconditions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see TaskStatus
     */
    public SetTaskStatusRequest withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * If <code>FINISHED</code>, the task successfully completed. If
     * <code>FAILED</code> the task ended unsuccessfully. The
     * <code>FALSE</code> value is used by preconditions.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FINISHED, FAILED, FALSE
     *
     * @param taskStatus If <code>FINISHED</code>, the task successfully completed. If
     *         <code>FAILED</code> the task ended unsuccessfully. The
     *         <code>FALSE</code> value is used by preconditions.
     *
     * @see TaskStatus
     */
    public void setTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
    }
    
    /**
     * If <code>FINISHED</code>, the task successfully completed. If
     * <code>FAILED</code> the task ended unsuccessfully. The
     * <code>FALSE</code> value is used by preconditions.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Allowed Values: </b>FINISHED, FAILED, FALSE
     *
     * @param taskStatus If <code>FINISHED</code>, the task successfully completed. If
     *         <code>FAILED</code> the task ended unsuccessfully. The
     *         <code>FALSE</code> value is used by preconditions.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     *
     * @see TaskStatus
     */
    public SetTaskStatusRequest withTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * If an error occurred during the task, this value specifies an id value
     * that represents the error. This value is set on the physical attempt
     * object. It is used to display error information to the user. It should
     * not start with string "Service_" which is reserved by the system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return If an error occurred during the task, this value specifies an id value
     *         that represents the error. This value is set on the physical attempt
     *         object. It is used to display error information to the user. It should
     *         not start with string "Service_" which is reserved by the system.
     */
    public String getErrorId() {
        return errorId;
    }
    
    /**
     * If an error occurred during the task, this value specifies an id value
     * that represents the error. This value is set on the physical attempt
     * object. It is used to display error information to the user. It should
     * not start with string "Service_" which is reserved by the system.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param errorId If an error occurred during the task, this value specifies an id value
     *         that represents the error. This value is set on the physical attempt
     *         object. It is used to display error information to the user. It should
     *         not start with string "Service_" which is reserved by the system.
     */
    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }
    
    /**
     * If an error occurred during the task, this value specifies an id value
     * that represents the error. This value is set on the physical attempt
     * object. It is used to display error information to the user. It should
     * not start with string "Service_" which is reserved by the system.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param errorId If an error occurred during the task, this value specifies an id value
     *         that represents the error. This value is set on the physical attempt
     *         object. It is used to display error information to the user. It should
     *         not start with string "Service_" which is reserved by the system.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetTaskStatusRequest withErrorId(String errorId) {
        this.errorId = errorId;
        return this;
    }

    /**
     * If an error occurred during the task, this value specifies a text
     * description of the error. This value is set on the physical attempt
     * object. It is used to display error information to the user. The web
     * service does not parse this value.
     *
     * @return If an error occurred during the task, this value specifies a text
     *         description of the error. This value is set on the physical attempt
     *         object. It is used to display error information to the user. The web
     *         service does not parse this value.
     */
    public String getErrorMessage() {
        return errorMessage;
    }
    
    /**
     * If an error occurred during the task, this value specifies a text
     * description of the error. This value is set on the physical attempt
     * object. It is used to display error information to the user. The web
     * service does not parse this value.
     *
     * @param errorMessage If an error occurred during the task, this value specifies a text
     *         description of the error. This value is set on the physical attempt
     *         object. It is used to display error information to the user. The web
     *         service does not parse this value.
     */
    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }
    
    /**
     * If an error occurred during the task, this value specifies a text
     * description of the error. This value is set on the physical attempt
     * object. It is used to display error information to the user. The web
     * service does not parse this value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param errorMessage If an error occurred during the task, this value specifies a text
     *         description of the error. This value is set on the physical attempt
     *         object. It is used to display error information to the user. The web
     *         service does not parse this value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetTaskStatusRequest withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    /**
     * If an error occurred during the task, this value specifies the stack
     * trace associated with the error. This value is set on the physical
     * attempt object. It is used to display error information to the user.
     * The web service does not parse this value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return If an error occurred during the task, this value specifies the stack
     *         trace associated with the error. This value is set on the physical
     *         attempt object. It is used to display error information to the user.
     *         The web service does not parse this value.
     */
    public String getErrorStackTrace() {
        return errorStackTrace;
    }
    
    /**
     * If an error occurred during the task, this value specifies the stack
     * trace associated with the error. This value is set on the physical
     * attempt object. It is used to display error information to the user.
     * The web service does not parse this value.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param errorStackTrace If an error occurred during the task, this value specifies the stack
     *         trace associated with the error. This value is set on the physical
     *         attempt object. It is used to display error information to the user.
     *         The web service does not parse this value.
     */
    public void setErrorStackTrace(String errorStackTrace) {
        this.errorStackTrace = errorStackTrace;
    }
    
    /**
     * If an error occurred during the task, this value specifies the stack
     * trace associated with the error. This value is set on the physical
     * attempt object. It is used to display error information to the user.
     * The web service does not parse this value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param errorStackTrace If an error occurred during the task, this value specifies the stack
     *         trace associated with the error. This value is set on the physical
     *         attempt object. It is used to display error information to the user.
     *         The web service does not parse this value.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public SetTaskStatusRequest withErrorStackTrace(String errorStackTrace) {
        this.errorStackTrace = errorStackTrace;
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
        if (getTaskId() != null) sb.append("TaskId: " + getTaskId() + ",");
        if (getTaskStatus() != null) sb.append("TaskStatus: " + getTaskStatus() + ",");
        if (getErrorId() != null) sb.append("ErrorId: " + getErrorId() + ",");
        if (getErrorMessage() != null) sb.append("ErrorMessage: " + getErrorMessage() + ",");
        if (getErrorStackTrace() != null) sb.append("ErrorStackTrace: " + getErrorStackTrace() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode()); 
        hashCode = prime * hashCode + ((getTaskStatus() == null) ? 0 : getTaskStatus().hashCode()); 
        hashCode = prime * hashCode + ((getErrorId() == null) ? 0 : getErrorId().hashCode()); 
        hashCode = prime * hashCode + ((getErrorMessage() == null) ? 0 : getErrorMessage().hashCode()); 
        hashCode = prime * hashCode + ((getErrorStackTrace() == null) ? 0 : getErrorStackTrace().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof SetTaskStatusRequest == false) return false;
        SetTaskStatusRequest other = (SetTaskStatusRequest)obj;
        
        if (other.getTaskId() == null ^ this.getTaskId() == null) return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false) return false; 
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null) return false;
        if (other.getTaskStatus() != null && other.getTaskStatus().equals(this.getTaskStatus()) == false) return false; 
        if (other.getErrorId() == null ^ this.getErrorId() == null) return false;
        if (other.getErrorId() != null && other.getErrorId().equals(this.getErrorId()) == false) return false; 
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null) return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false) return false; 
        if (other.getErrorStackTrace() == null ^ this.getErrorStackTrace() == null) return false;
        if (other.getErrorStackTrace() != null && other.getErrorStackTrace().equals(this.getErrorStackTrace()) == false) return false; 
        return true;
    }
    
}
    