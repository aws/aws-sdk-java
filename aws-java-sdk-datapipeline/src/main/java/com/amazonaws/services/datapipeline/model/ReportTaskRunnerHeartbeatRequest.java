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
 * Contains the parameters for ReportTaskRunnerHeartbeat.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datapipeline-2012-10-29/ReportTaskRunnerHeartbeat"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ReportTaskRunnerHeartbeatRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the task runner. This value should be unique across your AWS account. In the case of AWS Data Pipeline
     * Task Runner launched on a resource managed by AWS Data Pipeline, the web service provides a unique identifier
     * when it launches the application. If you have written a custom task runner, you should assign a unique identifier
     * for the task runner.
     * </p>
     */
    private String taskrunnerId;
    /**
     * <p>
     * The type of task the task runner is configured to accept and process. The worker group is set as a field on
     * objects in the pipeline when they are created. You can only specify a single value for <code>workerGroup</code>.
     * There are no wildcard values permitted in <code>workerGroup</code>; the string must be an exact, case-sensitive,
     * match.
     * </p>
     */
    private String workerGroup;
    /**
     * <p>
     * The public DNS name of the task runner.
     * </p>
     */
    private String hostname;

    /**
     * <p>
     * The ID of the task runner. This value should be unique across your AWS account. In the case of AWS Data Pipeline
     * Task Runner launched on a resource managed by AWS Data Pipeline, the web service provides a unique identifier
     * when it launches the application. If you have written a custom task runner, you should assign a unique identifier
     * for the task runner.
     * </p>
     * 
     * @param taskrunnerId
     *        The ID of the task runner. This value should be unique across your AWS account. In the case of AWS Data
     *        Pipeline Task Runner launched on a resource managed by AWS Data Pipeline, the web service provides a
     *        unique identifier when it launches the application. If you have written a custom task runner, you should
     *        assign a unique identifier for the task runner.
     */

    public void setTaskrunnerId(String taskrunnerId) {
        this.taskrunnerId = taskrunnerId;
    }

    /**
     * <p>
     * The ID of the task runner. This value should be unique across your AWS account. In the case of AWS Data Pipeline
     * Task Runner launched on a resource managed by AWS Data Pipeline, the web service provides a unique identifier
     * when it launches the application. If you have written a custom task runner, you should assign a unique identifier
     * for the task runner.
     * </p>
     * 
     * @return The ID of the task runner. This value should be unique across your AWS account. In the case of AWS Data
     *         Pipeline Task Runner launched on a resource managed by AWS Data Pipeline, the web service provides a
     *         unique identifier when it launches the application. If you have written a custom task runner, you should
     *         assign a unique identifier for the task runner.
     */

    public String getTaskrunnerId() {
        return this.taskrunnerId;
    }

    /**
     * <p>
     * The ID of the task runner. This value should be unique across your AWS account. In the case of AWS Data Pipeline
     * Task Runner launched on a resource managed by AWS Data Pipeline, the web service provides a unique identifier
     * when it launches the application. If you have written a custom task runner, you should assign a unique identifier
     * for the task runner.
     * </p>
     * 
     * @param taskrunnerId
     *        The ID of the task runner. This value should be unique across your AWS account. In the case of AWS Data
     *        Pipeline Task Runner launched on a resource managed by AWS Data Pipeline, the web service provides a
     *        unique identifier when it launches the application. If you have written a custom task runner, you should
     *        assign a unique identifier for the task runner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportTaskRunnerHeartbeatRequest withTaskrunnerId(String taskrunnerId) {
        setTaskrunnerId(taskrunnerId);
        return this;
    }

    /**
     * <p>
     * The type of task the task runner is configured to accept and process. The worker group is set as a field on
     * objects in the pipeline when they are created. You can only specify a single value for <code>workerGroup</code>.
     * There are no wildcard values permitted in <code>workerGroup</code>; the string must be an exact, case-sensitive,
     * match.
     * </p>
     * 
     * @param workerGroup
     *        The type of task the task runner is configured to accept and process. The worker group is set as a field
     *        on objects in the pipeline when they are created. You can only specify a single value for
     *        <code>workerGroup</code>. There are no wildcard values permitted in <code>workerGroup</code>; the string
     *        must be an exact, case-sensitive, match.
     */

    public void setWorkerGroup(String workerGroup) {
        this.workerGroup = workerGroup;
    }

    /**
     * <p>
     * The type of task the task runner is configured to accept and process. The worker group is set as a field on
     * objects in the pipeline when they are created. You can only specify a single value for <code>workerGroup</code>.
     * There are no wildcard values permitted in <code>workerGroup</code>; the string must be an exact, case-sensitive,
     * match.
     * </p>
     * 
     * @return The type of task the task runner is configured to accept and process. The worker group is set as a field
     *         on objects in the pipeline when they are created. You can only specify a single value for
     *         <code>workerGroup</code>. There are no wildcard values permitted in <code>workerGroup</code>; the string
     *         must be an exact, case-sensitive, match.
     */

    public String getWorkerGroup() {
        return this.workerGroup;
    }

    /**
     * <p>
     * The type of task the task runner is configured to accept and process. The worker group is set as a field on
     * objects in the pipeline when they are created. You can only specify a single value for <code>workerGroup</code>.
     * There are no wildcard values permitted in <code>workerGroup</code>; the string must be an exact, case-sensitive,
     * match.
     * </p>
     * 
     * @param workerGroup
     *        The type of task the task runner is configured to accept and process. The worker group is set as a field
     *        on objects in the pipeline when they are created. You can only specify a single value for
     *        <code>workerGroup</code>. There are no wildcard values permitted in <code>workerGroup</code>; the string
     *        must be an exact, case-sensitive, match.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportTaskRunnerHeartbeatRequest withWorkerGroup(String workerGroup) {
        setWorkerGroup(workerGroup);
        return this;
    }

    /**
     * <p>
     * The public DNS name of the task runner.
     * </p>
     * 
     * @param hostname
     *        The public DNS name of the task runner.
     */

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    /**
     * <p>
     * The public DNS name of the task runner.
     * </p>
     * 
     * @return The public DNS name of the task runner.
     */

    public String getHostname() {
        return this.hostname;
    }

    /**
     * <p>
     * The public DNS name of the task runner.
     * </p>
     * 
     * @param hostname
     *        The public DNS name of the task runner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ReportTaskRunnerHeartbeatRequest withHostname(String hostname) {
        setHostname(hostname);
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
        if (getTaskrunnerId() != null)
            sb.append("TaskrunnerId: ").append(getTaskrunnerId()).append(",");
        if (getWorkerGroup() != null)
            sb.append("WorkerGroup: ").append(getWorkerGroup()).append(",");
        if (getHostname() != null)
            sb.append("Hostname: ").append(getHostname());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ReportTaskRunnerHeartbeatRequest == false)
            return false;
        ReportTaskRunnerHeartbeatRequest other = (ReportTaskRunnerHeartbeatRequest) obj;
        if (other.getTaskrunnerId() == null ^ this.getTaskrunnerId() == null)
            return false;
        if (other.getTaskrunnerId() != null && other.getTaskrunnerId().equals(this.getTaskrunnerId()) == false)
            return false;
        if (other.getWorkerGroup() == null ^ this.getWorkerGroup() == null)
            return false;
        if (other.getWorkerGroup() != null && other.getWorkerGroup().equals(this.getWorkerGroup()) == false)
            return false;
        if (other.getHostname() == null ^ this.getHostname() == null)
            return false;
        if (other.getHostname() != null && other.getHostname().equals(this.getHostname()) == false)
            return false;
        return true;
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
    public ReportTaskRunnerHeartbeatRequest clone() {
        return (ReportTaskRunnerHeartbeatRequest) super.clone();
    }

}
