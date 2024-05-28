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
 * The definition of the session action.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/SessionActionDefinition" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SessionActionDefinition implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The environment to enter into.
     * </p>
     */
    private EnvironmentEnterSessionActionDefinition envEnter;
    /**
     * <p>
     * The environment to exit from.
     * </p>
     */
    private EnvironmentExitSessionActionDefinition envExit;
    /**
     * <p>
     * The job attachments to sync with a session action.
     * </p>
     */
    private SyncInputJobAttachmentsSessionActionDefinition syncInputJobAttachments;
    /**
     * <p>
     * The task run in the session.
     * </p>
     */
    private TaskRunSessionActionDefinition taskRun;

    /**
     * <p>
     * The environment to enter into.
     * </p>
     * 
     * @param envEnter
     *        The environment to enter into.
     */

    public void setEnvEnter(EnvironmentEnterSessionActionDefinition envEnter) {
        this.envEnter = envEnter;
    }

    /**
     * <p>
     * The environment to enter into.
     * </p>
     * 
     * @return The environment to enter into.
     */

    public EnvironmentEnterSessionActionDefinition getEnvEnter() {
        return this.envEnter;
    }

    /**
     * <p>
     * The environment to enter into.
     * </p>
     * 
     * @param envEnter
     *        The environment to enter into.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionActionDefinition withEnvEnter(EnvironmentEnterSessionActionDefinition envEnter) {
        setEnvEnter(envEnter);
        return this;
    }

    /**
     * <p>
     * The environment to exit from.
     * </p>
     * 
     * @param envExit
     *        The environment to exit from.
     */

    public void setEnvExit(EnvironmentExitSessionActionDefinition envExit) {
        this.envExit = envExit;
    }

    /**
     * <p>
     * The environment to exit from.
     * </p>
     * 
     * @return The environment to exit from.
     */

    public EnvironmentExitSessionActionDefinition getEnvExit() {
        return this.envExit;
    }

    /**
     * <p>
     * The environment to exit from.
     * </p>
     * 
     * @param envExit
     *        The environment to exit from.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionActionDefinition withEnvExit(EnvironmentExitSessionActionDefinition envExit) {
        setEnvExit(envExit);
        return this;
    }

    /**
     * <p>
     * The job attachments to sync with a session action.
     * </p>
     * 
     * @param syncInputJobAttachments
     *        The job attachments to sync with a session action.
     */

    public void setSyncInputJobAttachments(SyncInputJobAttachmentsSessionActionDefinition syncInputJobAttachments) {
        this.syncInputJobAttachments = syncInputJobAttachments;
    }

    /**
     * <p>
     * The job attachments to sync with a session action.
     * </p>
     * 
     * @return The job attachments to sync with a session action.
     */

    public SyncInputJobAttachmentsSessionActionDefinition getSyncInputJobAttachments() {
        return this.syncInputJobAttachments;
    }

    /**
     * <p>
     * The job attachments to sync with a session action.
     * </p>
     * 
     * @param syncInputJobAttachments
     *        The job attachments to sync with a session action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionActionDefinition withSyncInputJobAttachments(SyncInputJobAttachmentsSessionActionDefinition syncInputJobAttachments) {
        setSyncInputJobAttachments(syncInputJobAttachments);
        return this;
    }

    /**
     * <p>
     * The task run in the session.
     * </p>
     * 
     * @param taskRun
     *        The task run in the session.
     */

    public void setTaskRun(TaskRunSessionActionDefinition taskRun) {
        this.taskRun = taskRun;
    }

    /**
     * <p>
     * The task run in the session.
     * </p>
     * 
     * @return The task run in the session.
     */

    public TaskRunSessionActionDefinition getTaskRun() {
        return this.taskRun;
    }

    /**
     * <p>
     * The task run in the session.
     * </p>
     * 
     * @param taskRun
     *        The task run in the session.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SessionActionDefinition withTaskRun(TaskRunSessionActionDefinition taskRun) {
        setTaskRun(taskRun);
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
        if (getEnvEnter() != null)
            sb.append("EnvEnter: ").append(getEnvEnter()).append(",");
        if (getEnvExit() != null)
            sb.append("EnvExit: ").append(getEnvExit()).append(",");
        if (getSyncInputJobAttachments() != null)
            sb.append("SyncInputJobAttachments: ").append(getSyncInputJobAttachments()).append(",");
        if (getTaskRun() != null)
            sb.append("TaskRun: ").append(getTaskRun());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof SessionActionDefinition == false)
            return false;
        SessionActionDefinition other = (SessionActionDefinition) obj;
        if (other.getEnvEnter() == null ^ this.getEnvEnter() == null)
            return false;
        if (other.getEnvEnter() != null && other.getEnvEnter().equals(this.getEnvEnter()) == false)
            return false;
        if (other.getEnvExit() == null ^ this.getEnvExit() == null)
            return false;
        if (other.getEnvExit() != null && other.getEnvExit().equals(this.getEnvExit()) == false)
            return false;
        if (other.getSyncInputJobAttachments() == null ^ this.getSyncInputJobAttachments() == null)
            return false;
        if (other.getSyncInputJobAttachments() != null && other.getSyncInputJobAttachments().equals(this.getSyncInputJobAttachments()) == false)
            return false;
        if (other.getTaskRun() == null ^ this.getTaskRun() == null)
            return false;
        if (other.getTaskRun() != null && other.getTaskRun().equals(this.getTaskRun()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getEnvEnter() == null) ? 0 : getEnvEnter().hashCode());
        hashCode = prime * hashCode + ((getEnvExit() == null) ? 0 : getEnvExit().hashCode());
        hashCode = prime * hashCode + ((getSyncInputJobAttachments() == null) ? 0 : getSyncInputJobAttachments().hashCode());
        hashCode = prime * hashCode + ((getTaskRun() == null) ? 0 : getTaskRun().hashCode());
        return hashCode;
    }

    @Override
    public SessionActionDefinition clone() {
        try {
            return (SessionActionDefinition) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.SessionActionDefinitionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
