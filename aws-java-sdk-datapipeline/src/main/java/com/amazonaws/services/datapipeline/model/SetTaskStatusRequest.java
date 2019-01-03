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
package com.amazonaws.services.datapipeline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for SetTaskStatus.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/SetTaskStatus" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SetTaskStatusRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the task assigned to the task runner. This value is provided in the response for <a>PollForTask</a>.
     * </p>
     */
    private String taskId;
    /**
     * <p>
     * If <code>FINISHED</code>, the task successfully completed. If <code>FAILED</code>, the task ended unsuccessfully.
     * Preconditions use false.
     * </p>
     */
    private String taskStatus;
    /**
     * <p>
     * If an error occurred during the task, this value specifies the error code. This value is set on the physical
     * attempt object. It is used to display error information to the user. It should not start with string "Service_"
     * which is reserved by the system.
     * </p>
     */
    private String errorId;
    /**
     * <p>
     * If an error occurred during the task, this value specifies a text description of the error. This value is set on
     * the physical attempt object. It is used to display error information to the user. The web service does not parse
     * this value.
     * </p>
     */
    private String errorMessage;
    /**
     * <p>
     * If an error occurred during the task, this value specifies the stack trace associated with the error. This value
     * is set on the physical attempt object. It is used to display error information to the user. The web service does
     * not parse this value.
     * </p>
     */
    private String errorStackTrace;

    /**
     * <p>
     * The ID of the task assigned to the task runner. This value is provided in the response for <a>PollForTask</a>.
     * </p>
     * 
     * @param taskId
     *        The ID of the task assigned to the task runner. This value is provided in the response for
     *        <a>PollForTask</a>.
     */

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    /**
     * <p>
     * The ID of the task assigned to the task runner. This value is provided in the response for <a>PollForTask</a>.
     * </p>
     * 
     * @return The ID of the task assigned to the task runner. This value is provided in the response for
     *         <a>PollForTask</a>.
     */

    public String getTaskId() {
        return this.taskId;
    }

    /**
     * <p>
     * The ID of the task assigned to the task runner. This value is provided in the response for <a>PollForTask</a>.
     * </p>
     * 
     * @param taskId
     *        The ID of the task assigned to the task runner. This value is provided in the response for
     *        <a>PollForTask</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTaskStatusRequest withTaskId(String taskId) {
        setTaskId(taskId);
        return this;
    }

    /**
     * <p>
     * If <code>FINISHED</code>, the task successfully completed. If <code>FAILED</code>, the task ended unsuccessfully.
     * Preconditions use false.
     * </p>
     * 
     * @param taskStatus
     *        If <code>FINISHED</code>, the task successfully completed. If <code>FAILED</code>, the task ended
     *        unsuccessfully. Preconditions use false.
     * @see TaskStatus
     */

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    /**
     * <p>
     * If <code>FINISHED</code>, the task successfully completed. If <code>FAILED</code>, the task ended unsuccessfully.
     * Preconditions use false.
     * </p>
     * 
     * @return If <code>FINISHED</code>, the task successfully completed. If <code>FAILED</code>, the task ended
     *         unsuccessfully. Preconditions use false.
     * @see TaskStatus
     */

    public String getTaskStatus() {
        return this.taskStatus;
    }

    /**
     * <p>
     * If <code>FINISHED</code>, the task successfully completed. If <code>FAILED</code>, the task ended unsuccessfully.
     * Preconditions use false.
     * </p>
     * 
     * @param taskStatus
     *        If <code>FINISHED</code>, the task successfully completed. If <code>FAILED</code>, the task ended
     *        unsuccessfully. Preconditions use false.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public SetTaskStatusRequest withTaskStatus(String taskStatus) {
        setTaskStatus(taskStatus);
        return this;
    }

    /**
     * <p>
     * If <code>FINISHED</code>, the task successfully completed. If <code>FAILED</code>, the task ended unsuccessfully.
     * Preconditions use false.
     * </p>
     * 
     * @param taskStatus
     *        If <code>FINISHED</code>, the task successfully completed. If <code>FAILED</code>, the task ended
     *        unsuccessfully. Preconditions use false.
     * @see TaskStatus
     */

    public void setTaskStatus(TaskStatus taskStatus) {
        withTaskStatus(taskStatus);
    }

    /**
     * <p>
     * If <code>FINISHED</code>, the task successfully completed. If <code>FAILED</code>, the task ended unsuccessfully.
     * Preconditions use false.
     * </p>
     * 
     * @param taskStatus
     *        If <code>FINISHED</code>, the task successfully completed. If <code>FAILED</code>, the task ended
     *        unsuccessfully. Preconditions use false.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TaskStatus
     */

    public SetTaskStatusRequest withTaskStatus(TaskStatus taskStatus) {
        this.taskStatus = taskStatus.toString();
        return this;
    }

    /**
     * <p>
     * If an error occurred during the task, this value specifies the error code. This value is set on the physical
     * attempt object. It is used to display error information to the user. It should not start with string "Service_"
     * which is reserved by the system.
     * </p>
     * 
     * @param errorId
     *        If an error occurred during the task, this value specifies the error code. This value is set on the
     *        physical attempt object. It is used to display error information to the user. It should not start with
     *        string "Service_" which is reserved by the system.
     */

    public void setErrorId(String errorId) {
        this.errorId = errorId;
    }

    /**
     * <p>
     * If an error occurred during the task, this value specifies the error code. This value is set on the physical
     * attempt object. It is used to display error information to the user. It should not start with string "Service_"
     * which is reserved by the system.
     * </p>
     * 
     * @return If an error occurred during the task, this value specifies the error code. This value is set on the
     *         physical attempt object. It is used to display error information to the user. It should not start with
     *         string "Service_" which is reserved by the system.
     */

    public String getErrorId() {
        return this.errorId;
    }

    /**
     * <p>
     * If an error occurred during the task, this value specifies the error code. This value is set on the physical
     * attempt object. It is used to display error information to the user. It should not start with string "Service_"
     * which is reserved by the system.
     * </p>
     * 
     * @param errorId
     *        If an error occurred during the task, this value specifies the error code. This value is set on the
     *        physical attempt object. It is used to display error information to the user. It should not start with
     *        string "Service_" which is reserved by the system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTaskStatusRequest withErrorId(String errorId) {
        setErrorId(errorId);
        return this;
    }

    /**
     * <p>
     * If an error occurred during the task, this value specifies a text description of the error. This value is set on
     * the physical attempt object. It is used to display error information to the user. The web service does not parse
     * this value.
     * </p>
     * 
     * @param errorMessage
     *        If an error occurred during the task, this value specifies a text description of the error. This value is
     *        set on the physical attempt object. It is used to display error information to the user. The web service
     *        does not parse this value.
     */

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    /**
     * <p>
     * If an error occurred during the task, this value specifies a text description of the error. This value is set on
     * the physical attempt object. It is used to display error information to the user. The web service does not parse
     * this value.
     * </p>
     * 
     * @return If an error occurred during the task, this value specifies a text description of the error. This value is
     *         set on the physical attempt object. It is used to display error information to the user. The web service
     *         does not parse this value.
     */

    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * <p>
     * If an error occurred during the task, this value specifies a text description of the error. This value is set on
     * the physical attempt object. It is used to display error information to the user. The web service does not parse
     * this value.
     * </p>
     * 
     * @param errorMessage
     *        If an error occurred during the task, this value specifies a text description of the error. This value is
     *        set on the physical attempt object. It is used to display error information to the user. The web service
     *        does not parse this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTaskStatusRequest withErrorMessage(String errorMessage) {
        setErrorMessage(errorMessage);
        return this;
    }

    /**
     * <p>
     * If an error occurred during the task, this value specifies the stack trace associated with the error. This value
     * is set on the physical attempt object. It is used to display error information to the user. The web service does
     * not parse this value.
     * </p>
     * 
     * @param errorStackTrace
     *        If an error occurred during the task, this value specifies the stack trace associated with the error. This
     *        value is set on the physical attempt object. It is used to display error information to the user. The web
     *        service does not parse this value.
     */

    public void setErrorStackTrace(String errorStackTrace) {
        this.errorStackTrace = errorStackTrace;
    }

    /**
     * <p>
     * If an error occurred during the task, this value specifies the stack trace associated with the error. This value
     * is set on the physical attempt object. It is used to display error information to the user. The web service does
     * not parse this value.
     * </p>
     * 
     * @return If an error occurred during the task, this value specifies the stack trace associated with the error.
     *         This value is set on the physical attempt object. It is used to display error information to the user.
     *         The web service does not parse this value.
     */

    public String getErrorStackTrace() {
        return this.errorStackTrace;
    }

    /**
     * <p>
     * If an error occurred during the task, this value specifies the stack trace associated with the error. This value
     * is set on the physical attempt object. It is used to display error information to the user. The web service does
     * not parse this value.
     * </p>
     * 
     * @param errorStackTrace
     *        If an error occurred during the task, this value specifies the stack trace associated with the error. This
     *        value is set on the physical attempt object. It is used to display error information to the user. The web
     *        service does not parse this value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SetTaskStatusRequest withErrorStackTrace(String errorStackTrace) {
        setErrorStackTrace(errorStackTrace);
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
        if (getTaskId() != null)
            sb.append("TaskId: ").append(getTaskId()).append(",");
        if (getTaskStatus() != null)
            sb.append("TaskStatus: ").append(getTaskStatus()).append(",");
        if (getErrorId() != null)
            sb.append("ErrorId: ").append(getErrorId()).append(",");
        if (getErrorMessage() != null)
            sb.append("ErrorMessage: ").append(getErrorMessage()).append(",");
        if (getErrorStackTrace() != null)
            sb.append("ErrorStackTrace: ").append(getErrorStackTrace());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SetTaskStatusRequest == false)
            return false;
        SetTaskStatusRequest other = (SetTaskStatusRequest) obj;
        if (other.getTaskId() == null ^ this.getTaskId() == null)
            return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false)
            return false;
        if (other.getTaskStatus() == null ^ this.getTaskStatus() == null)
            return false;
        if (other.getTaskStatus() != null && other.getTaskStatus().equals(this.getTaskStatus()) == false)
            return false;
        if (other.getErrorId() == null ^ this.getErrorId() == null)
            return false;
        if (other.getErrorId() != null && other.getErrorId().equals(this.getErrorId()) == false)
            return false;
        if (other.getErrorMessage() == null ^ this.getErrorMessage() == null)
            return false;
        if (other.getErrorMessage() != null && other.getErrorMessage().equals(this.getErrorMessage()) == false)
            return false;
        if (other.getErrorStackTrace() == null ^ this.getErrorStackTrace() == null)
            return false;
        if (other.getErrorStackTrace() != null && other.getErrorStackTrace().equals(this.getErrorStackTrace()) == false)
            return false;
        return true;
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
    public SetTaskStatusRequest clone() {
        return (SetTaskStatusRequest) super.clone();
    }

}
