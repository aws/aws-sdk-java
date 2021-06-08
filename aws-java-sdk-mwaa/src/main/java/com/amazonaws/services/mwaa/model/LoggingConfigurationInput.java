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
package com.amazonaws.services.mwaa.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Defines the Apache Airflow logs to send to CloudWatch Logs: <code>DagProcessingLogs</code>,
 * <code>SchedulerLogs</code>, <code>TaskLogs</code>, <code>WebserverLogs</code>, <code>WorkerLogs</code>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mwaa-2020-07-01/LoggingConfigurationInput" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LoggingConfigurationInput implements Serializable, Cloneable, StructuredPojo {

    private ModuleLoggingConfigurationInput dagProcessingLogs;

    private ModuleLoggingConfigurationInput schedulerLogs;

    private ModuleLoggingConfigurationInput taskLogs;

    private ModuleLoggingConfigurationInput webserverLogs;

    private ModuleLoggingConfigurationInput workerLogs;

    /**
     * @param dagProcessingLogs
     */

    public void setDagProcessingLogs(ModuleLoggingConfigurationInput dagProcessingLogs) {
        this.dagProcessingLogs = dagProcessingLogs;
    }

    /**
     * @return
     */

    public ModuleLoggingConfigurationInput getDagProcessingLogs() {
        return this.dagProcessingLogs;
    }

    /**
     * @param dagProcessingLogs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfigurationInput withDagProcessingLogs(ModuleLoggingConfigurationInput dagProcessingLogs) {
        setDagProcessingLogs(dagProcessingLogs);
        return this;
    }

    /**
     * @param schedulerLogs
     */

    public void setSchedulerLogs(ModuleLoggingConfigurationInput schedulerLogs) {
        this.schedulerLogs = schedulerLogs;
    }

    /**
     * @return
     */

    public ModuleLoggingConfigurationInput getSchedulerLogs() {
        return this.schedulerLogs;
    }

    /**
     * @param schedulerLogs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfigurationInput withSchedulerLogs(ModuleLoggingConfigurationInput schedulerLogs) {
        setSchedulerLogs(schedulerLogs);
        return this;
    }

    /**
     * @param taskLogs
     */

    public void setTaskLogs(ModuleLoggingConfigurationInput taskLogs) {
        this.taskLogs = taskLogs;
    }

    /**
     * @return
     */

    public ModuleLoggingConfigurationInput getTaskLogs() {
        return this.taskLogs;
    }

    /**
     * @param taskLogs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfigurationInput withTaskLogs(ModuleLoggingConfigurationInput taskLogs) {
        setTaskLogs(taskLogs);
        return this;
    }

    /**
     * @param webserverLogs
     */

    public void setWebserverLogs(ModuleLoggingConfigurationInput webserverLogs) {
        this.webserverLogs = webserverLogs;
    }

    /**
     * @return
     */

    public ModuleLoggingConfigurationInput getWebserverLogs() {
        return this.webserverLogs;
    }

    /**
     * @param webserverLogs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfigurationInput withWebserverLogs(ModuleLoggingConfigurationInput webserverLogs) {
        setWebserverLogs(webserverLogs);
        return this;
    }

    /**
     * @param workerLogs
     */

    public void setWorkerLogs(ModuleLoggingConfigurationInput workerLogs) {
        this.workerLogs = workerLogs;
    }

    /**
     * @return
     */

    public ModuleLoggingConfigurationInput getWorkerLogs() {
        return this.workerLogs;
    }

    /**
     * @param workerLogs
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LoggingConfigurationInput withWorkerLogs(ModuleLoggingConfigurationInput workerLogs) {
        setWorkerLogs(workerLogs);
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
        if (getDagProcessingLogs() != null)
            sb.append("DagProcessingLogs: ").append(getDagProcessingLogs()).append(",");
        if (getSchedulerLogs() != null)
            sb.append("SchedulerLogs: ").append(getSchedulerLogs()).append(",");
        if (getTaskLogs() != null)
            sb.append("TaskLogs: ").append(getTaskLogs()).append(",");
        if (getWebserverLogs() != null)
            sb.append("WebserverLogs: ").append(getWebserverLogs()).append(",");
        if (getWorkerLogs() != null)
            sb.append("WorkerLogs: ").append(getWorkerLogs());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LoggingConfigurationInput == false)
            return false;
        LoggingConfigurationInput other = (LoggingConfigurationInput) obj;
        if (other.getDagProcessingLogs() == null ^ this.getDagProcessingLogs() == null)
            return false;
        if (other.getDagProcessingLogs() != null && other.getDagProcessingLogs().equals(this.getDagProcessingLogs()) == false)
            return false;
        if (other.getSchedulerLogs() == null ^ this.getSchedulerLogs() == null)
            return false;
        if (other.getSchedulerLogs() != null && other.getSchedulerLogs().equals(this.getSchedulerLogs()) == false)
            return false;
        if (other.getTaskLogs() == null ^ this.getTaskLogs() == null)
            return false;
        if (other.getTaskLogs() != null && other.getTaskLogs().equals(this.getTaskLogs()) == false)
            return false;
        if (other.getWebserverLogs() == null ^ this.getWebserverLogs() == null)
            return false;
        if (other.getWebserverLogs() != null && other.getWebserverLogs().equals(this.getWebserverLogs()) == false)
            return false;
        if (other.getWorkerLogs() == null ^ this.getWorkerLogs() == null)
            return false;
        if (other.getWorkerLogs() != null && other.getWorkerLogs().equals(this.getWorkerLogs()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDagProcessingLogs() == null) ? 0 : getDagProcessingLogs().hashCode());
        hashCode = prime * hashCode + ((getSchedulerLogs() == null) ? 0 : getSchedulerLogs().hashCode());
        hashCode = prime * hashCode + ((getTaskLogs() == null) ? 0 : getTaskLogs().hashCode());
        hashCode = prime * hashCode + ((getWebserverLogs() == null) ? 0 : getWebserverLogs().hashCode());
        hashCode = prime * hashCode + ((getWorkerLogs() == null) ? 0 : getWorkerLogs().hashCode());
        return hashCode;
    }

    @Override
    public LoggingConfigurationInput clone() {
        try {
            return (LoggingConfigurationInput) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.mwaa.model.transform.LoggingConfigurationInputMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
