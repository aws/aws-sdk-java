/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.sagemakeredgemanager.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-edge-2020-09-23/DeploymentModel" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeploymentModel implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The unique handle of the model.
     * </p>
     */
    private String modelHandle;
    /**
     * <p>
     * The name of the model.
     * </p>
     */
    private String modelName;
    /**
     * <p>
     * The version of the model.
     * </p>
     */
    private String modelVersion;
    /**
     * <p>
     * The desired state of the model.
     * </p>
     */
    private String desiredState;
    /**
     * <p>
     * Returns the current state of the model.
     * </p>
     */
    private String state;
    /**
     * <p>
     * Returns the deployment status of the model.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Returns the error message for the deployment status result.
     * </p>
     */
    private String statusReason;
    /**
     * <p>
     * Returns the error message if there is a rollback.
     * </p>
     */
    private String rollbackFailureReason;

    /**
     * <p>
     * The unique handle of the model.
     * </p>
     * 
     * @param modelHandle
     *        The unique handle of the model.
     */

    public void setModelHandle(String modelHandle) {
        this.modelHandle = modelHandle;
    }

    /**
     * <p>
     * The unique handle of the model.
     * </p>
     * 
     * @return The unique handle of the model.
     */

    public String getModelHandle() {
        return this.modelHandle;
    }

    /**
     * <p>
     * The unique handle of the model.
     * </p>
     * 
     * @param modelHandle
     *        The unique handle of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentModel withModelHandle(String modelHandle) {
        setModelHandle(modelHandle);
        return this;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model.
     */

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @return The name of the model.
     */

    public String getModelName() {
        return this.modelName;
    }

    /**
     * <p>
     * The name of the model.
     * </p>
     * 
     * @param modelName
     *        The name of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentModel withModelName(String modelName) {
        setModelName(modelName);
        return this;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model.
     */

    public void setModelVersion(String modelVersion) {
        this.modelVersion = modelVersion;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @return The version of the model.
     */

    public String getModelVersion() {
        return this.modelVersion;
    }

    /**
     * <p>
     * The version of the model.
     * </p>
     * 
     * @param modelVersion
     *        The version of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentModel withModelVersion(String modelVersion) {
        setModelVersion(modelVersion);
        return this;
    }

    /**
     * <p>
     * The desired state of the model.
     * </p>
     * 
     * @param desiredState
     *        The desired state of the model.
     * @see ModelState
     */

    public void setDesiredState(String desiredState) {
        this.desiredState = desiredState;
    }

    /**
     * <p>
     * The desired state of the model.
     * </p>
     * 
     * @return The desired state of the model.
     * @see ModelState
     */

    public String getDesiredState() {
        return this.desiredState;
    }

    /**
     * <p>
     * The desired state of the model.
     * </p>
     * 
     * @param desiredState
     *        The desired state of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelState
     */

    public DeploymentModel withDesiredState(String desiredState) {
        setDesiredState(desiredState);
        return this;
    }

    /**
     * <p>
     * The desired state of the model.
     * </p>
     * 
     * @param desiredState
     *        The desired state of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelState
     */

    public DeploymentModel withDesiredState(ModelState desiredState) {
        this.desiredState = desiredState.toString();
        return this;
    }

    /**
     * <p>
     * Returns the current state of the model.
     * </p>
     * 
     * @param state
     *        Returns the current state of the model.
     * @see ModelState
     */

    public void setState(String state) {
        this.state = state;
    }

    /**
     * <p>
     * Returns the current state of the model.
     * </p>
     * 
     * @return Returns the current state of the model.
     * @see ModelState
     */

    public String getState() {
        return this.state;
    }

    /**
     * <p>
     * Returns the current state of the model.
     * </p>
     * 
     * @param state
     *        Returns the current state of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelState
     */

    public DeploymentModel withState(String state) {
        setState(state);
        return this;
    }

    /**
     * <p>
     * Returns the current state of the model.
     * </p>
     * 
     * @param state
     *        Returns the current state of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ModelState
     */

    public DeploymentModel withState(ModelState state) {
        this.state = state.toString();
        return this;
    }

    /**
     * <p>
     * Returns the deployment status of the model.
     * </p>
     * 
     * @param status
     *        Returns the deployment status of the model.
     * @see DeploymentStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * Returns the deployment status of the model.
     * </p>
     * 
     * @return Returns the deployment status of the model.
     * @see DeploymentStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * Returns the deployment status of the model.
     * </p>
     * 
     * @param status
     *        Returns the deployment status of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public DeploymentModel withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * Returns the deployment status of the model.
     * </p>
     * 
     * @param status
     *        Returns the deployment status of the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentStatus
     */

    public DeploymentModel withStatus(DeploymentStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Returns the error message for the deployment status result.
     * </p>
     * 
     * @param statusReason
     *        Returns the error message for the deployment status result.
     */

    public void setStatusReason(String statusReason) {
        this.statusReason = statusReason;
    }

    /**
     * <p>
     * Returns the error message for the deployment status result.
     * </p>
     * 
     * @return Returns the error message for the deployment status result.
     */

    public String getStatusReason() {
        return this.statusReason;
    }

    /**
     * <p>
     * Returns the error message for the deployment status result.
     * </p>
     * 
     * @param statusReason
     *        Returns the error message for the deployment status result.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentModel withStatusReason(String statusReason) {
        setStatusReason(statusReason);
        return this;
    }

    /**
     * <p>
     * Returns the error message if there is a rollback.
     * </p>
     * 
     * @param rollbackFailureReason
     *        Returns the error message if there is a rollback.
     */

    public void setRollbackFailureReason(String rollbackFailureReason) {
        this.rollbackFailureReason = rollbackFailureReason;
    }

    /**
     * <p>
     * Returns the error message if there is a rollback.
     * </p>
     * 
     * @return Returns the error message if there is a rollback.
     */

    public String getRollbackFailureReason() {
        return this.rollbackFailureReason;
    }

    /**
     * <p>
     * Returns the error message if there is a rollback.
     * </p>
     * 
     * @param rollbackFailureReason
     *        Returns the error message if there is a rollback.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentModel withRollbackFailureReason(String rollbackFailureReason) {
        setRollbackFailureReason(rollbackFailureReason);
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
        if (getModelHandle() != null)
            sb.append("ModelHandle: ").append(getModelHandle()).append(",");
        if (getModelName() != null)
            sb.append("ModelName: ").append(getModelName()).append(",");
        if (getModelVersion() != null)
            sb.append("ModelVersion: ").append(getModelVersion()).append(",");
        if (getDesiredState() != null)
            sb.append("DesiredState: ").append(getDesiredState()).append(",");
        if (getState() != null)
            sb.append("State: ").append(getState()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusReason() != null)
            sb.append("StatusReason: ").append(getStatusReason()).append(",");
        if (getRollbackFailureReason() != null)
            sb.append("RollbackFailureReason: ").append(getRollbackFailureReason());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentModel == false)
            return false;
        DeploymentModel other = (DeploymentModel) obj;
        if (other.getModelHandle() == null ^ this.getModelHandle() == null)
            return false;
        if (other.getModelHandle() != null && other.getModelHandle().equals(this.getModelHandle()) == false)
            return false;
        if (other.getModelName() == null ^ this.getModelName() == null)
            return false;
        if (other.getModelName() != null && other.getModelName().equals(this.getModelName()) == false)
            return false;
        if (other.getModelVersion() == null ^ this.getModelVersion() == null)
            return false;
        if (other.getModelVersion() != null && other.getModelVersion().equals(this.getModelVersion()) == false)
            return false;
        if (other.getDesiredState() == null ^ this.getDesiredState() == null)
            return false;
        if (other.getDesiredState() != null && other.getDesiredState().equals(this.getDesiredState()) == false)
            return false;
        if (other.getState() == null ^ this.getState() == null)
            return false;
        if (other.getState() != null && other.getState().equals(this.getState()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusReason() == null ^ this.getStatusReason() == null)
            return false;
        if (other.getStatusReason() != null && other.getStatusReason().equals(this.getStatusReason()) == false)
            return false;
        if (other.getRollbackFailureReason() == null ^ this.getRollbackFailureReason() == null)
            return false;
        if (other.getRollbackFailureReason() != null && other.getRollbackFailureReason().equals(this.getRollbackFailureReason()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getModelHandle() == null) ? 0 : getModelHandle().hashCode());
        hashCode = prime * hashCode + ((getModelName() == null) ? 0 : getModelName().hashCode());
        hashCode = prime * hashCode + ((getModelVersion() == null) ? 0 : getModelVersion().hashCode());
        hashCode = prime * hashCode + ((getDesiredState() == null) ? 0 : getDesiredState().hashCode());
        hashCode = prime * hashCode + ((getState() == null) ? 0 : getState().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusReason() == null) ? 0 : getStatusReason().hashCode());
        hashCode = prime * hashCode + ((getRollbackFailureReason() == null) ? 0 : getRollbackFailureReason().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentModel clone() {
        try {
            return (DeploymentModel) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemakeredgemanager.model.transform.DeploymentModelMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
