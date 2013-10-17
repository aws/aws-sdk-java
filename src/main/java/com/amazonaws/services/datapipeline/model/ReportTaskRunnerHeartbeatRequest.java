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
 * Container for the parameters to the {@link com.amazonaws.services.datapipeline.DataPipeline#reportTaskRunnerHeartbeat(ReportTaskRunnerHeartbeatRequest) ReportTaskRunnerHeartbeat operation}.
 * <p>
 * Task runners call ReportTaskRunnerHeartbeat every 15 minutes to indicate that they are operational. In the case of AWS Data Pipeline Task Runner
 * launched on a resource managed by AWS Data Pipeline, the web service can use this call to detect when the task runner application has failed and
 * restart a new instance.
 * </p>
 *
 * @see com.amazonaws.services.datapipeline.DataPipeline#reportTaskRunnerHeartbeat(ReportTaskRunnerHeartbeatRequest)
 */
public class ReportTaskRunnerHeartbeatRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The identifier of the task runner. This value should be unique across
     * your AWS account. In the case of AWS Data Pipeline Task Runner
     * launched on a resource managed by AWS Data Pipeline, the web service
     * provides a unique identifier when it launches the application. If you
     * have written a custom task runner, you should assign a unique
     * identifier for the task runner.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String taskrunnerId;

    /**
     * Indicates the type of task the task runner is configured to accept and
     * process. The worker group is set as a field on objects in the pipeline
     * when they are created. You can only specify a single value for
     * <code>workerGroup</code> in the call to
     * <a>ReportTaskRunnerHeartbeat</a>. There are no wildcard values
     * permitted in <code>workerGroup</code>, the string must be an exact,
     * case-sensitive, match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String workerGroup;

    /**
     * The public DNS name of the calling task runner.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     */
    private String hostname;

    /**
     * The identifier of the task runner. This value should be unique across
     * your AWS account. In the case of AWS Data Pipeline Task Runner
     * launched on a resource managed by AWS Data Pipeline, the web service
     * provides a unique identifier when it launches the application. If you
     * have written a custom task runner, you should assign a unique
     * identifier for the task runner.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The identifier of the task runner. This value should be unique across
     *         your AWS account. In the case of AWS Data Pipeline Task Runner
     *         launched on a resource managed by AWS Data Pipeline, the web service
     *         provides a unique identifier when it launches the application. If you
     *         have written a custom task runner, you should assign a unique
     *         identifier for the task runner.
     */
    public String getTaskrunnerId() {
        return taskrunnerId;
    }
    
    /**
     * The identifier of the task runner. This value should be unique across
     * your AWS account. In the case of AWS Data Pipeline Task Runner
     * launched on a resource managed by AWS Data Pipeline, the web service
     * provides a unique identifier when it launches the application. If you
     * have written a custom task runner, you should assign a unique
     * identifier for the task runner.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param taskrunnerId The identifier of the task runner. This value should be unique across
     *         your AWS account. In the case of AWS Data Pipeline Task Runner
     *         launched on a resource managed by AWS Data Pipeline, the web service
     *         provides a unique identifier when it launches the application. If you
     *         have written a custom task runner, you should assign a unique
     *         identifier for the task runner.
     */
    public void setTaskrunnerId(String taskrunnerId) {
        this.taskrunnerId = taskrunnerId;
    }
    
    /**
     * The identifier of the task runner. This value should be unique across
     * your AWS account. In the case of AWS Data Pipeline Task Runner
     * launched on a resource managed by AWS Data Pipeline, the web service
     * provides a unique identifier when it launches the application. If you
     * have written a custom task runner, you should assign a unique
     * identifier for the task runner.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param taskrunnerId The identifier of the task runner. This value should be unique across
     *         your AWS account. In the case of AWS Data Pipeline Task Runner
     *         launched on a resource managed by AWS Data Pipeline, the web service
     *         provides a unique identifier when it launches the application. If you
     *         have written a custom task runner, you should assign a unique
     *         identifier for the task runner.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReportTaskRunnerHeartbeatRequest withTaskrunnerId(String taskrunnerId) {
        this.taskrunnerId = taskrunnerId;
        return this;
    }

    /**
     * Indicates the type of task the task runner is configured to accept and
     * process. The worker group is set as a field on objects in the pipeline
     * when they are created. You can only specify a single value for
     * <code>workerGroup</code> in the call to
     * <a>ReportTaskRunnerHeartbeat</a>. There are no wildcard values
     * permitted in <code>workerGroup</code>, the string must be an exact,
     * case-sensitive, match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return Indicates the type of task the task runner is configured to accept and
     *         process. The worker group is set as a field on objects in the pipeline
     *         when they are created. You can only specify a single value for
     *         <code>workerGroup</code> in the call to
     *         <a>ReportTaskRunnerHeartbeat</a>. There are no wildcard values
     *         permitted in <code>workerGroup</code>, the string must be an exact,
     *         case-sensitive, match.
     */
    public String getWorkerGroup() {
        return workerGroup;
    }
    
    /**
     * Indicates the type of task the task runner is configured to accept and
     * process. The worker group is set as a field on objects in the pipeline
     * when they are created. You can only specify a single value for
     * <code>workerGroup</code> in the call to
     * <a>ReportTaskRunnerHeartbeat</a>. There are no wildcard values
     * permitted in <code>workerGroup</code>, the string must be an exact,
     * case-sensitive, match.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param workerGroup Indicates the type of task the task runner is configured to accept and
     *         process. The worker group is set as a field on objects in the pipeline
     *         when they are created. You can only specify a single value for
     *         <code>workerGroup</code> in the call to
     *         <a>ReportTaskRunnerHeartbeat</a>. There are no wildcard values
     *         permitted in <code>workerGroup</code>, the string must be an exact,
     *         case-sensitive, match.
     */
    public void setWorkerGroup(String workerGroup) {
        this.workerGroup = workerGroup;
    }
    
    /**
     * Indicates the type of task the task runner is configured to accept and
     * process. The worker group is set as a field on objects in the pipeline
     * when they are created. You can only specify a single value for
     * <code>workerGroup</code> in the call to
     * <a>ReportTaskRunnerHeartbeat</a>. There are no wildcard values
     * permitted in <code>workerGroup</code>, the string must be an exact,
     * case-sensitive, match.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>0 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param workerGroup Indicates the type of task the task runner is configured to accept and
     *         process. The worker group is set as a field on objects in the pipeline
     *         when they are created. You can only specify a single value for
     *         <code>workerGroup</code> in the call to
     *         <a>ReportTaskRunnerHeartbeat</a>. There are no wildcard values
     *         permitted in <code>workerGroup</code>, the string must be an exact,
     *         case-sensitive, match.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReportTaskRunnerHeartbeatRequest withWorkerGroup(String workerGroup) {
        this.workerGroup = workerGroup;
        return this;
    }

    /**
     * The public DNS name of the calling task runner.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @return The public DNS name of the calling task runner.
     */
    public String getHostname() {
        return hostname;
    }
    
    /**
     * The public DNS name of the calling task runner.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param hostname The public DNS name of the calling task runner.
     */
    public void setHostname(String hostname) {
        this.hostname = hostname;
    }
    
    /**
     * The public DNS name of the calling task runner.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>1 - 1024<br/>
     * <b>Pattern: </b>[\u0020-\uD7FF\uE000-\uFFFD\uD800\uDC00-\uDBFF\uDFFF\r\n\t]*<br/>
     *
     * @param hostname The public DNS name of the calling task runner.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public ReportTaskRunnerHeartbeatRequest withHostname(String hostname) {
        this.hostname = hostname;
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
        if (getTaskrunnerId() != null) sb.append("TaskrunnerId: " + getTaskrunnerId() + ",");
        if (getWorkerGroup() != null) sb.append("WorkerGroup: " + getWorkerGroup() + ",");
        if (getHostname() != null) sb.append("Hostname: " + getHostname() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getTaskrunnerId() == null) ? 0 : getTaskrunnerId().hashCode()); 
        hashCode = prime * hashCode + ((getWorkerGroup() == null) ? 0 : getWorkerGroup().hashCode()); 
        hashCode = prime * hashCode + ((getHostname() == null) ? 0 : getHostname().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ReportTaskRunnerHeartbeatRequest == false) return false;
        ReportTaskRunnerHeartbeatRequest other = (ReportTaskRunnerHeartbeatRequest)obj;
        
        if (other.getTaskrunnerId() == null ^ this.getTaskrunnerId() == null) return false;
        if (other.getTaskrunnerId() != null && other.getTaskrunnerId().equals(this.getTaskrunnerId()) == false) return false; 
        if (other.getWorkerGroup() == null ^ this.getWorkerGroup() == null) return false;
        if (other.getWorkerGroup() != null && other.getWorkerGroup().equals(this.getWorkerGroup()) == false) return false; 
        if (other.getHostname() == null ^ this.getHostname() == null) return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false) return false; 
        return true;
    }
    
}
    