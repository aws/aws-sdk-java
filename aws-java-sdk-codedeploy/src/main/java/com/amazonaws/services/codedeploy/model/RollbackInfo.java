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
package com.amazonaws.services.codedeploy.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a deployment rollback.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codedeploy-2014-10-06/RollbackInfo" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RollbackInfo implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ID of the deployment rollback.
     * </p>
     */
    private String rollbackDeploymentId;
    /**
     * <p>
     * The deployment ID of the deployment that was underway and triggered a rollback deployment because it failed or
     * was stopped.
     * </p>
     */
    private String rollbackTriggeringDeploymentId;
    /**
     * <p>
     * Information that describes the status of a deployment rollback (for example, whether the deployment can't be
     * rolled back, is in progress, failed, or succeeded).
     * </p>
     */
    private String rollbackMessage;

    /**
     * <p>
     * The ID of the deployment rollback.
     * </p>
     * 
     * @param rollbackDeploymentId
     *        The ID of the deployment rollback.
     */

    public void setRollbackDeploymentId(String rollbackDeploymentId) {
        this.rollbackDeploymentId = rollbackDeploymentId;
    }

    /**
     * <p>
     * The ID of the deployment rollback.
     * </p>
     * 
     * @return The ID of the deployment rollback.
     */

    public String getRollbackDeploymentId() {
        return this.rollbackDeploymentId;
    }

    /**
     * <p>
     * The ID of the deployment rollback.
     * </p>
     * 
     * @param rollbackDeploymentId
     *        The ID of the deployment rollback.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackInfo withRollbackDeploymentId(String rollbackDeploymentId) {
        setRollbackDeploymentId(rollbackDeploymentId);
        return this;
    }

    /**
     * <p>
     * The deployment ID of the deployment that was underway and triggered a rollback deployment because it failed or
     * was stopped.
     * </p>
     * 
     * @param rollbackTriggeringDeploymentId
     *        The deployment ID of the deployment that was underway and triggered a rollback deployment because it
     *        failed or was stopped.
     */

    public void setRollbackTriggeringDeploymentId(String rollbackTriggeringDeploymentId) {
        this.rollbackTriggeringDeploymentId = rollbackTriggeringDeploymentId;
    }

    /**
     * <p>
     * The deployment ID of the deployment that was underway and triggered a rollback deployment because it failed or
     * was stopped.
     * </p>
     * 
     * @return The deployment ID of the deployment that was underway and triggered a rollback deployment because it
     *         failed or was stopped.
     */

    public String getRollbackTriggeringDeploymentId() {
        return this.rollbackTriggeringDeploymentId;
    }

    /**
     * <p>
     * The deployment ID of the deployment that was underway and triggered a rollback deployment because it failed or
     * was stopped.
     * </p>
     * 
     * @param rollbackTriggeringDeploymentId
     *        The deployment ID of the deployment that was underway and triggered a rollback deployment because it
     *        failed or was stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackInfo withRollbackTriggeringDeploymentId(String rollbackTriggeringDeploymentId) {
        setRollbackTriggeringDeploymentId(rollbackTriggeringDeploymentId);
        return this;
    }

    /**
     * <p>
     * Information that describes the status of a deployment rollback (for example, whether the deployment can't be
     * rolled back, is in progress, failed, or succeeded).
     * </p>
     * 
     * @param rollbackMessage
     *        Information that describes the status of a deployment rollback (for example, whether the deployment can't
     *        be rolled back, is in progress, failed, or succeeded).
     */

    public void setRollbackMessage(String rollbackMessage) {
        this.rollbackMessage = rollbackMessage;
    }

    /**
     * <p>
     * Information that describes the status of a deployment rollback (for example, whether the deployment can't be
     * rolled back, is in progress, failed, or succeeded).
     * </p>
     * 
     * @return Information that describes the status of a deployment rollback (for example, whether the deployment can't
     *         be rolled back, is in progress, failed, or succeeded).
     */

    public String getRollbackMessage() {
        return this.rollbackMessage;
    }

    /**
     * <p>
     * Information that describes the status of a deployment rollback (for example, whether the deployment can't be
     * rolled back, is in progress, failed, or succeeded).
     * </p>
     * 
     * @param rollbackMessage
     *        Information that describes the status of a deployment rollback (for example, whether the deployment can't
     *        be rolled back, is in progress, failed, or succeeded).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RollbackInfo withRollbackMessage(String rollbackMessage) {
        setRollbackMessage(rollbackMessage);
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
        if (getRollbackDeploymentId() != null)
            sb.append("RollbackDeploymentId: ").append(getRollbackDeploymentId()).append(",");
        if (getRollbackTriggeringDeploymentId() != null)
            sb.append("RollbackTriggeringDeploymentId: ").append(getRollbackTriggeringDeploymentId()).append(",");
        if (getRollbackMessage() != null)
            sb.append("RollbackMessage: ").append(getRollbackMessage());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RollbackInfo == false)
            return false;
        RollbackInfo other = (RollbackInfo) obj;
        if (other.getRollbackDeploymentId() == null ^ this.getRollbackDeploymentId() == null)
            return false;
        if (other.getRollbackDeploymentId() != null && other.getRollbackDeploymentId().equals(this.getRollbackDeploymentId()) == false)
            return false;
        if (other.getRollbackTriggeringDeploymentId() == null ^ this.getRollbackTriggeringDeploymentId() == null)
            return false;
        if (other.getRollbackTriggeringDeploymentId() != null
                && other.getRollbackTriggeringDeploymentId().equals(this.getRollbackTriggeringDeploymentId()) == false)
            return false;
        if (other.getRollbackMessage() == null ^ this.getRollbackMessage() == null)
            return false;
        if (other.getRollbackMessage() != null && other.getRollbackMessage().equals(this.getRollbackMessage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRollbackDeploymentId() == null) ? 0 : getRollbackDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getRollbackTriggeringDeploymentId() == null) ? 0 : getRollbackTriggeringDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getRollbackMessage() == null) ? 0 : getRollbackMessage().hashCode());
        return hashCode;
    }

    @Override
    public RollbackInfo clone() {
        try {
            return (RollbackInfo) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codedeploy.model.transform.RollbackInfoMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
