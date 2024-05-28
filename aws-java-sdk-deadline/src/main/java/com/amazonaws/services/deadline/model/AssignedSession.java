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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The assigned session for the worker.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/AssignedSession" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssignedSession implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The job ID for the assigned session.
     * </p>
     */
    private String jobId;
    /**
     * <p>
     * The log configuration for the worker's assigned session.
     * </p>
     */
    private LogConfiguration logConfiguration;
    /**
     * <p>
     * The queue ID of the assigned session.
     * </p>
     */
    private String queueId;
    /**
     * <p>
     * The session actions to apply to the assigned session.
     * </p>
     */
    private java.util.List<AssignedSessionAction> sessionActions;

    /**
     * <p>
     * The job ID for the assigned session.
     * </p>
     * 
     * @param jobId
     *        The job ID for the assigned session.
     */

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    /**
     * <p>
     * The job ID for the assigned session.
     * </p>
     * 
     * @return The job ID for the assigned session.
     */

    public String getJobId() {
        return this.jobId;
    }

    /**
     * <p>
     * The job ID for the assigned session.
     * </p>
     * 
     * @param jobId
     *        The job ID for the assigned session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignedSession withJobId(String jobId) {
        setJobId(jobId);
        return this;
    }

    /**
     * <p>
     * The log configuration for the worker's assigned session.
     * </p>
     * 
     * @param logConfiguration
     *        The log configuration for the worker's assigned session.
     */

    public void setLogConfiguration(LogConfiguration logConfiguration) {
        this.logConfiguration = logConfiguration;
    }

    /**
     * <p>
     * The log configuration for the worker's assigned session.
     * </p>
     * 
     * @return The log configuration for the worker's assigned session.
     */

    public LogConfiguration getLogConfiguration() {
        return this.logConfiguration;
    }

    /**
     * <p>
     * The log configuration for the worker's assigned session.
     * </p>
     * 
     * @param logConfiguration
     *        The log configuration for the worker's assigned session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignedSession withLogConfiguration(LogConfiguration logConfiguration) {
        setLogConfiguration(logConfiguration);
        return this;
    }

    /**
     * <p>
     * The queue ID of the assigned session.
     * </p>
     * 
     * @param queueId
     *        The queue ID of the assigned session.
     */

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    /**
     * <p>
     * The queue ID of the assigned session.
     * </p>
     * 
     * @return The queue ID of the assigned session.
     */

    public String getQueueId() {
        return this.queueId;
    }

    /**
     * <p>
     * The queue ID of the assigned session.
     * </p>
     * 
     * @param queueId
     *        The queue ID of the assigned session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignedSession withQueueId(String queueId) {
        setQueueId(queueId);
        return this;
    }

    /**
     * <p>
     * The session actions to apply to the assigned session.
     * </p>
     * 
     * @return The session actions to apply to the assigned session.
     */

    public java.util.List<AssignedSessionAction> getSessionActions() {
        return sessionActions;
    }

    /**
     * <p>
     * The session actions to apply to the assigned session.
     * </p>
     * 
     * @param sessionActions
     *        The session actions to apply to the assigned session.
     */

    public void setSessionActions(java.util.Collection<AssignedSessionAction> sessionActions) {
        if (sessionActions == null) {
            this.sessionActions = null;
            return;
        }

        this.sessionActions = new java.util.ArrayList<AssignedSessionAction>(sessionActions);
    }

    /**
     * <p>
     * The session actions to apply to the assigned session.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSessionActions(java.util.Collection)} or {@link #withSessionActions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param sessionActions
     *        The session actions to apply to the assigned session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignedSession withSessionActions(AssignedSessionAction... sessionActions) {
        if (this.sessionActions == null) {
            setSessionActions(new java.util.ArrayList<AssignedSessionAction>(sessionActions.length));
        }
        for (AssignedSessionAction ele : sessionActions) {
            this.sessionActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The session actions to apply to the assigned session.
     * </p>
     * 
     * @param sessionActions
     *        The session actions to apply to the assigned session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssignedSession withSessionActions(java.util.Collection<AssignedSessionAction> sessionActions) {
        setSessionActions(sessionActions);
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
        if (getJobId() != null)
            sb.append("JobId: ").append(getJobId()).append(",");
        if (getLogConfiguration() != null)
            sb.append("LogConfiguration: ").append(getLogConfiguration()).append(",");
        if (getQueueId() != null)
            sb.append("QueueId: ").append(getQueueId()).append(",");
        if (getSessionActions() != null)
            sb.append("SessionActions: ").append(getSessionActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssignedSession == false)
            return false;
        AssignedSession other = (AssignedSession) obj;
        if (other.getJobId() == null ^ this.getJobId() == null)
            return false;
        if (other.getJobId() != null && other.getJobId().equals(this.getJobId()) == false)
            return false;
        if (other.getLogConfiguration() == null ^ this.getLogConfiguration() == null)
            return false;
        if (other.getLogConfiguration() != null && other.getLogConfiguration().equals(this.getLogConfiguration()) == false)
            return false;
        if (other.getQueueId() == null ^ this.getQueueId() == null)
            return false;
        if (other.getQueueId() != null && other.getQueueId().equals(this.getQueueId()) == false)
            return false;
        if (other.getSessionActions() == null ^ this.getSessionActions() == null)
            return false;
        if (other.getSessionActions() != null && other.getSessionActions().equals(this.getSessionActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getJobId() == null) ? 0 : getJobId().hashCode());
        hashCode = prime * hashCode + ((getLogConfiguration() == null) ? 0 : getLogConfiguration().hashCode());
        hashCode = prime * hashCode + ((getQueueId() == null) ? 0 : getQueueId().hashCode());
        hashCode = prime * hashCode + ((getSessionActions() == null) ? 0 : getSessionActions().hashCode());
        return hashCode;
    }

    @Override
    public AssignedSession clone() {
        try {
            return (AssignedSession) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.AssignedSessionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
