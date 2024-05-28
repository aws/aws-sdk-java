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
package com.amazonaws.services.launchwizard.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a workload deployment pattern.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/launch-wizard-2018-05-10/WorkloadDeploymentPatternDataSummary"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class WorkloadDeploymentPatternDataSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of a workload deployment pattern.
     * </p>
     */
    private String deploymentPatternName;
    /**
     * <p>
     * The description of a workload deployment pattern.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The display name of a workload deployment pattern.
     * </p>
     */
    private String displayName;
    /**
     * <p>
     * The status of a workload deployment pattern.
     * </p>
     */
    private String status;
    /**
     * <p>
     * A message about a workload deployment pattern's status.
     * </p>
     */
    private String statusMessage;
    /**
     * <p>
     * The name of the workload.
     * </p>
     */
    private String workloadName;
    /**
     * <p>
     * The name of the workload deployment pattern version.
     * </p>
     */
    private String workloadVersionName;

    /**
     * <p>
     * The name of a workload deployment pattern.
     * </p>
     * 
     * @param deploymentPatternName
     *        The name of a workload deployment pattern.
     */

    public void setDeploymentPatternName(String deploymentPatternName) {
        this.deploymentPatternName = deploymentPatternName;
    }

    /**
     * <p>
     * The name of a workload deployment pattern.
     * </p>
     * 
     * @return The name of a workload deployment pattern.
     */

    public String getDeploymentPatternName() {
        return this.deploymentPatternName;
    }

    /**
     * <p>
     * The name of a workload deployment pattern.
     * </p>
     * 
     * @param deploymentPatternName
     *        The name of a workload deployment pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadDeploymentPatternDataSummary withDeploymentPatternName(String deploymentPatternName) {
        setDeploymentPatternName(deploymentPatternName);
        return this;
    }

    /**
     * <p>
     * The description of a workload deployment pattern.
     * </p>
     * 
     * @param description
     *        The description of a workload deployment pattern.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of a workload deployment pattern.
     * </p>
     * 
     * @return The description of a workload deployment pattern.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of a workload deployment pattern.
     * </p>
     * 
     * @param description
     *        The description of a workload deployment pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadDeploymentPatternDataSummary withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The display name of a workload deployment pattern.
     * </p>
     * 
     * @param displayName
     *        The display name of a workload deployment pattern.
     */

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    /**
     * <p>
     * The display name of a workload deployment pattern.
     * </p>
     * 
     * @return The display name of a workload deployment pattern.
     */

    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * <p>
     * The display name of a workload deployment pattern.
     * </p>
     * 
     * @param displayName
     *        The display name of a workload deployment pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadDeploymentPatternDataSummary withDisplayName(String displayName) {
        setDisplayName(displayName);
        return this;
    }

    /**
     * <p>
     * The status of a workload deployment pattern.
     * </p>
     * 
     * @param status
     *        The status of a workload deployment pattern.
     * @see WorkloadDeploymentPatternStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of a workload deployment pattern.
     * </p>
     * 
     * @return The status of a workload deployment pattern.
     * @see WorkloadDeploymentPatternStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of a workload deployment pattern.
     * </p>
     * 
     * @param status
     *        The status of a workload deployment pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkloadDeploymentPatternStatus
     */

    public WorkloadDeploymentPatternDataSummary withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of a workload deployment pattern.
     * </p>
     * 
     * @param status
     *        The status of a workload deployment pattern.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see WorkloadDeploymentPatternStatus
     */

    public WorkloadDeploymentPatternDataSummary withStatus(WorkloadDeploymentPatternStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * A message about a workload deployment pattern's status.
     * </p>
     * 
     * @param statusMessage
     *        A message about a workload deployment pattern's status.
     */

    public void setStatusMessage(String statusMessage) {
        this.statusMessage = statusMessage;
    }

    /**
     * <p>
     * A message about a workload deployment pattern's status.
     * </p>
     * 
     * @return A message about a workload deployment pattern's status.
     */

    public String getStatusMessage() {
        return this.statusMessage;
    }

    /**
     * <p>
     * A message about a workload deployment pattern's status.
     * </p>
     * 
     * @param statusMessage
     *        A message about a workload deployment pattern's status.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadDeploymentPatternDataSummary withStatusMessage(String statusMessage) {
        setStatusMessage(statusMessage);
        return this;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @param workloadName
     *        The name of the workload.
     */

    public void setWorkloadName(String workloadName) {
        this.workloadName = workloadName;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @return The name of the workload.
     */

    public String getWorkloadName() {
        return this.workloadName;
    }

    /**
     * <p>
     * The name of the workload.
     * </p>
     * 
     * @param workloadName
     *        The name of the workload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadDeploymentPatternDataSummary withWorkloadName(String workloadName) {
        setWorkloadName(workloadName);
        return this;
    }

    /**
     * <p>
     * The name of the workload deployment pattern version.
     * </p>
     * 
     * @param workloadVersionName
     *        The name of the workload deployment pattern version.
     */

    public void setWorkloadVersionName(String workloadVersionName) {
        this.workloadVersionName = workloadVersionName;
    }

    /**
     * <p>
     * The name of the workload deployment pattern version.
     * </p>
     * 
     * @return The name of the workload deployment pattern version.
     */

    public String getWorkloadVersionName() {
        return this.workloadVersionName;
    }

    /**
     * <p>
     * The name of the workload deployment pattern version.
     * </p>
     * 
     * @param workloadVersionName
     *        The name of the workload deployment pattern version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public WorkloadDeploymentPatternDataSummary withWorkloadVersionName(String workloadVersionName) {
        setWorkloadVersionName(workloadVersionName);
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
        if (getDeploymentPatternName() != null)
            sb.append("DeploymentPatternName: ").append(getDeploymentPatternName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getDisplayName() != null)
            sb.append("DisplayName: ").append(getDisplayName()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getStatusMessage() != null)
            sb.append("StatusMessage: ").append(getStatusMessage()).append(",");
        if (getWorkloadName() != null)
            sb.append("WorkloadName: ").append(getWorkloadName()).append(",");
        if (getWorkloadVersionName() != null)
            sb.append("WorkloadVersionName: ").append(getWorkloadVersionName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof WorkloadDeploymentPatternDataSummary == false)
            return false;
        WorkloadDeploymentPatternDataSummary other = (WorkloadDeploymentPatternDataSummary) obj;
        if (other.getDeploymentPatternName() == null ^ this.getDeploymentPatternName() == null)
            return false;
        if (other.getDeploymentPatternName() != null && other.getDeploymentPatternName().equals(this.getDeploymentPatternName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getDisplayName() == null ^ this.getDisplayName() == null)
            return false;
        if (other.getDisplayName() != null && other.getDisplayName().equals(this.getDisplayName()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getStatusMessage() == null ^ this.getStatusMessage() == null)
            return false;
        if (other.getStatusMessage() != null && other.getStatusMessage().equals(this.getStatusMessage()) == false)
            return false;
        if (other.getWorkloadName() == null ^ this.getWorkloadName() == null)
            return false;
        if (other.getWorkloadName() != null && other.getWorkloadName().equals(this.getWorkloadName()) == false)
            return false;
        if (other.getWorkloadVersionName() == null ^ this.getWorkloadVersionName() == null)
            return false;
        if (other.getWorkloadVersionName() != null && other.getWorkloadVersionName().equals(this.getWorkloadVersionName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentPatternName() == null) ? 0 : getDeploymentPatternName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getDisplayName() == null) ? 0 : getDisplayName().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getStatusMessage() == null) ? 0 : getStatusMessage().hashCode());
        hashCode = prime * hashCode + ((getWorkloadName() == null) ? 0 : getWorkloadName().hashCode());
        hashCode = prime * hashCode + ((getWorkloadVersionName() == null) ? 0 : getWorkloadVersionName().hashCode());
        return hashCode;
    }

    @Override
    public WorkloadDeploymentPatternDataSummary clone() {
        try {
            return (WorkloadDeploymentPatternDataSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.launchwizard.model.transform.WorkloadDeploymentPatternDataSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
