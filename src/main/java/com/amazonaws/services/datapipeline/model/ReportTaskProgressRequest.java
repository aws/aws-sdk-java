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
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#reportTaskProgress(ReportTaskProgressRequest) ReportTaskProgress operation}.
 * <p>
 * Updates the AWS Data Pipeline service on the progress of the calling task runner. When the task runner is assigned a task, it should call
 * ReportTaskProgress to acknowledge that it has the task within 2 minutes. If the web service does not recieve this acknowledgement within the 2 minute
 * window, it will assign the task in a subsequent PollForTask call. After this initial acknowledgement, the task runner only needs to report progress
 * every 15 minutes to maintain its ownership of the task. You can change this reporting time from 15 minutes by specifying a
 * <code>reportProgressTimeout</code> field in your pipeline. If a task runner does not report its status after 5 minutes, AWS Data Pipeline will assume
 * that the task runner is unable to process the task and will reassign the task in a subsequent response to PollForTask. task runners should call
 * ReportTaskProgress every 60 seconds.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#reportTaskProgress(ReportTaskProgressRequest)
 */
public class ReportTaskProgressRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * Identifier of the task assigned to the task runner. This value is
     * provided in the <a>TaskObject</a> that the service returns with the
     * response for the <a>PollForTask</a> action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String taskId;

    /**
     * Identifier of the task assigned to the task runner. This value is
     * provided in the <a>TaskObject</a> that the service returns with the
     * response for the <a>PollForTask</a> action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Identifier of the task assigned to the task runner. This value is
     *         provided in the <a>TaskObject</a> that the service returns with the
     *         response for the <a>PollForTask</a> action.
     */
    public String getTaskId() {
        return taskId;
    }
    
    /**
     * Identifier of the task assigned to the task runner. This value is
     * provided in the <a>TaskObject</a> that the service returns with the
     * response for the <a>PollForTask</a> action.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param taskId Identifier of the task assigned to the task runner. This value is
     *         provided in the <a>TaskObject</a> that the service returns with the
     *         response for the <a>PollForTask</a> action.
     */
    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }
    
    /**
     * Identifier of the task assigned to the task runner. This value is
     * provided in the <a>TaskObject</a> that the service returns with the
     * response for the <a>PollForTask</a> action.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 2048<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param taskId Identifier of the task assigned to the task runner. This value is
     *         provided in the <a>TaskObject</a> that the service returns with the
     *         response for the <a>PollForTask</a> action.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReportTaskProgressRequest withTaskId(String taskId) {
        this.taskId = taskId;
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
        if (getTaskId() != null) sb.append("TaskId: " + getTaskId() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTaskId() == null) ? 0 : getTaskId().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReportTaskProgressRequest == false) return false;
        ReportTaskProgressRequest other = (ReportTaskProgressRequest)obj;
        
        if (other.getTaskId() == null ^ this.getTaskId() == null) return false;
        if (other.getTaskId() != null && other.getTaskId().equals(this.getTaskId()) == false) return false; 
        return true;
    }
    
}
    