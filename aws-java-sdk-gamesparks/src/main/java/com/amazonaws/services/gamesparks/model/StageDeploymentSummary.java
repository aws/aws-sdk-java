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
package com.amazonaws.services.gamesparks.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The summary of the properties of a stage deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/gamesparks-2021-08-17/StageDeploymentSummary" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StageDeploymentSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The type of action of the deployment.
     * </p>
     */
    private String deploymentAction;
    /**
     * <p>
     * The identifier of the deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The result of the deployment.
     * </p>
     */
    private DeploymentResult deploymentResult;
    /**
     * <p>
     * The state of the deployment.
     * </p>
     */
    private String deploymentState;
    /**
     * <p>
     * The timestamp of when the deployment was last updated.
     * </p>
     */
    private java.util.Date lastUpdated;
    /**
     * <p>
     * The identifier of the snapshot associated with the stage deployment.
     * </p>
     */
    private String snapshotId;

    /**
     * <p>
     * The type of action of the deployment.
     * </p>
     * 
     * @param deploymentAction
     *        The type of action of the deployment.
     * @see DeploymentAction
     */

    public void setDeploymentAction(String deploymentAction) {
        this.deploymentAction = deploymentAction;
    }

    /**
     * <p>
     * The type of action of the deployment.
     * </p>
     * 
     * @return The type of action of the deployment.
     * @see DeploymentAction
     */

    public String getDeploymentAction() {
        return this.deploymentAction;
    }

    /**
     * <p>
     * The type of action of the deployment.
     * </p>
     * 
     * @param deploymentAction
     *        The type of action of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentAction
     */

    public StageDeploymentSummary withDeploymentAction(String deploymentAction) {
        setDeploymentAction(deploymentAction);
        return this;
    }

    /**
     * <p>
     * The type of action of the deployment.
     * </p>
     * 
     * @param deploymentAction
     *        The type of action of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentAction
     */

    public StageDeploymentSummary withDeploymentAction(DeploymentAction deploymentAction) {
        this.deploymentAction = deploymentAction.toString();
        return this;
    }

    /**
     * <p>
     * The identifier of the deployment.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The identifier of the deployment.
     * </p>
     * 
     * @return The identifier of the deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The identifier of the deployment.
     * </p>
     * 
     * @param deploymentId
     *        The identifier of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDeploymentSummary withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The result of the deployment.
     * </p>
     * 
     * @param deploymentResult
     *        The result of the deployment.
     */

    public void setDeploymentResult(DeploymentResult deploymentResult) {
        this.deploymentResult = deploymentResult;
    }

    /**
     * <p>
     * The result of the deployment.
     * </p>
     * 
     * @return The result of the deployment.
     */

    public DeploymentResult getDeploymentResult() {
        return this.deploymentResult;
    }

    /**
     * <p>
     * The result of the deployment.
     * </p>
     * 
     * @param deploymentResult
     *        The result of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDeploymentSummary withDeploymentResult(DeploymentResult deploymentResult) {
        setDeploymentResult(deploymentResult);
        return this;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * 
     * @param deploymentState
     *        The state of the deployment.
     * @see DeploymentState
     */

    public void setDeploymentState(String deploymentState) {
        this.deploymentState = deploymentState;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * 
     * @return The state of the deployment.
     * @see DeploymentState
     */

    public String getDeploymentState() {
        return this.deploymentState;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * 
     * @param deploymentState
     *        The state of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentState
     */

    public StageDeploymentSummary withDeploymentState(String deploymentState) {
        setDeploymentState(deploymentState);
        return this;
    }

    /**
     * <p>
     * The state of the deployment.
     * </p>
     * 
     * @param deploymentState
     *        The state of the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentState
     */

    public StageDeploymentSummary withDeploymentState(DeploymentState deploymentState) {
        this.deploymentState = deploymentState.toString();
        return this;
    }

    /**
     * <p>
     * The timestamp of when the deployment was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The timestamp of when the deployment was last updated.
     */

    public void setLastUpdated(java.util.Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    /**
     * <p>
     * The timestamp of when the deployment was last updated.
     * </p>
     * 
     * @return The timestamp of when the deployment was last updated.
     */

    public java.util.Date getLastUpdated() {
        return this.lastUpdated;
    }

    /**
     * <p>
     * The timestamp of when the deployment was last updated.
     * </p>
     * 
     * @param lastUpdated
     *        The timestamp of when the deployment was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDeploymentSummary withLastUpdated(java.util.Date lastUpdated) {
        setLastUpdated(lastUpdated);
        return this;
    }

    /**
     * <p>
     * The identifier of the snapshot associated with the stage deployment.
     * </p>
     * 
     * @param snapshotId
     *        The identifier of the snapshot associated with the stage deployment.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The identifier of the snapshot associated with the stage deployment.
     * </p>
     * 
     * @return The identifier of the snapshot associated with the stage deployment.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The identifier of the snapshot associated with the stage deployment.
     * </p>
     * 
     * @param snapshotId
     *        The identifier of the snapshot associated with the stage deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StageDeploymentSummary withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
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
        if (getDeploymentAction() != null)
            sb.append("DeploymentAction: ").append(getDeploymentAction()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getDeploymentResult() != null)
            sb.append("DeploymentResult: ").append(getDeploymentResult()).append(",");
        if (getDeploymentState() != null)
            sb.append("DeploymentState: ").append(getDeploymentState()).append(",");
        if (getLastUpdated() != null)
            sb.append("LastUpdated: ").append(getLastUpdated()).append(",");
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StageDeploymentSummary == false)
            return false;
        StageDeploymentSummary other = (StageDeploymentSummary) obj;
        if (other.getDeploymentAction() == null ^ this.getDeploymentAction() == null)
            return false;
        if (other.getDeploymentAction() != null && other.getDeploymentAction().equals(this.getDeploymentAction()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getDeploymentResult() == null ^ this.getDeploymentResult() == null)
            return false;
        if (other.getDeploymentResult() != null && other.getDeploymentResult().equals(this.getDeploymentResult()) == false)
            return false;
        if (other.getDeploymentState() == null ^ this.getDeploymentState() == null)
            return false;
        if (other.getDeploymentState() != null && other.getDeploymentState().equals(this.getDeploymentState()) == false)
            return false;
        if (other.getLastUpdated() == null ^ this.getLastUpdated() == null)
            return false;
        if (other.getLastUpdated() != null && other.getLastUpdated().equals(this.getLastUpdated()) == false)
            return false;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentAction() == null) ? 0 : getDeploymentAction().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getDeploymentResult() == null) ? 0 : getDeploymentResult().hashCode());
        hashCode = prime * hashCode + ((getDeploymentState() == null) ? 0 : getDeploymentState().hashCode());
        hashCode = prime * hashCode + ((getLastUpdated() == null) ? 0 : getLastUpdated().hashCode());
        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        return hashCode;
    }

    @Override
    public StageDeploymentSummary clone() {
        try {
            return (StageDeploymentSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.gamesparks.model.transform.StageDeploymentSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
