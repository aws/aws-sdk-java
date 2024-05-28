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
package com.amazonaws.services.ssmincidents.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a CodeDeploy deployment that occurred around the time of an incident and could be a possible cause
 * of the incident.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-incidents-2018-05-10/CodeDeployDeployment" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CodeDeployDeployment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CodeDeploy deployment group associated with the deployment.
     * </p>
     */
    private String deploymentGroupArn;
    /**
     * <p>
     * The ID of the CodeDeploy deployment.
     * </p>
     */
    private String deploymentId;
    /**
     * <p>
     * The timestamp for when the CodeDeploy deployment ended. Not reported for deployments that are still in progress.
     * </p>
     */
    private java.util.Date endTime;
    /**
     * <p>
     * The timestamp for when the CodeDeploy deployment began.
     * </p>
     */
    private java.util.Date startTime;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CodeDeploy deployment group associated with the deployment.
     * </p>
     * 
     * @param deploymentGroupArn
     *        The Amazon Resource Name (ARN) of the CodeDeploy deployment group associated with the deployment.
     */

    public void setDeploymentGroupArn(String deploymentGroupArn) {
        this.deploymentGroupArn = deploymentGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CodeDeploy deployment group associated with the deployment.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the CodeDeploy deployment group associated with the deployment.
     */

    public String getDeploymentGroupArn() {
        return this.deploymentGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the CodeDeploy deployment group associated with the deployment.
     * </p>
     * 
     * @param deploymentGroupArn
     *        The Amazon Resource Name (ARN) of the CodeDeploy deployment group associated with the deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeDeployDeployment withDeploymentGroupArn(String deploymentGroupArn) {
        setDeploymentGroupArn(deploymentGroupArn);
        return this;
    }

    /**
     * <p>
     * The ID of the CodeDeploy deployment.
     * </p>
     * 
     * @param deploymentId
     *        The ID of the CodeDeploy deployment.
     */

    public void setDeploymentId(String deploymentId) {
        this.deploymentId = deploymentId;
    }

    /**
     * <p>
     * The ID of the CodeDeploy deployment.
     * </p>
     * 
     * @return The ID of the CodeDeploy deployment.
     */

    public String getDeploymentId() {
        return this.deploymentId;
    }

    /**
     * <p>
     * The ID of the CodeDeploy deployment.
     * </p>
     * 
     * @param deploymentId
     *        The ID of the CodeDeploy deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeDeployDeployment withDeploymentId(String deploymentId) {
        setDeploymentId(deploymentId);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the CodeDeploy deployment ended. Not reported for deployments that are still in progress.
     * </p>
     * 
     * @param endTime
     *        The timestamp for when the CodeDeploy deployment ended. Not reported for deployments that are still in
     *        progress.
     */

    public void setEndTime(java.util.Date endTime) {
        this.endTime = endTime;
    }

    /**
     * <p>
     * The timestamp for when the CodeDeploy deployment ended. Not reported for deployments that are still in progress.
     * </p>
     * 
     * @return The timestamp for when the CodeDeploy deployment ended. Not reported for deployments that are still in
     *         progress.
     */

    public java.util.Date getEndTime() {
        return this.endTime;
    }

    /**
     * <p>
     * The timestamp for when the CodeDeploy deployment ended. Not reported for deployments that are still in progress.
     * </p>
     * 
     * @param endTime
     *        The timestamp for when the CodeDeploy deployment ended. Not reported for deployments that are still in
     *        progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeDeployDeployment withEndTime(java.util.Date endTime) {
        setEndTime(endTime);
        return this;
    }

    /**
     * <p>
     * The timestamp for when the CodeDeploy deployment began.
     * </p>
     * 
     * @param startTime
     *        The timestamp for when the CodeDeploy deployment began.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The timestamp for when the CodeDeploy deployment began.
     * </p>
     * 
     * @return The timestamp for when the CodeDeploy deployment began.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The timestamp for when the CodeDeploy deployment began.
     * </p>
     * 
     * @param startTime
     *        The timestamp for when the CodeDeploy deployment began.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CodeDeployDeployment withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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
        if (getDeploymentGroupArn() != null)
            sb.append("DeploymentGroupArn: ").append(getDeploymentGroupArn()).append(",");
        if (getDeploymentId() != null)
            sb.append("DeploymentId: ").append(getDeploymentId()).append(",");
        if (getEndTime() != null)
            sb.append("EndTime: ").append(getEndTime()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CodeDeployDeployment == false)
            return false;
        CodeDeployDeployment other = (CodeDeployDeployment) obj;
        if (other.getDeploymentGroupArn() == null ^ this.getDeploymentGroupArn() == null)
            return false;
        if (other.getDeploymentGroupArn() != null && other.getDeploymentGroupArn().equals(this.getDeploymentGroupArn()) == false)
            return false;
        if (other.getDeploymentId() == null ^ this.getDeploymentId() == null)
            return false;
        if (other.getDeploymentId() != null && other.getDeploymentId().equals(this.getDeploymentId()) == false)
            return false;
        if (other.getEndTime() == null ^ this.getEndTime() == null)
            return false;
        if (other.getEndTime() != null && other.getEndTime().equals(this.getEndTime()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDeploymentGroupArn() == null) ? 0 : getDeploymentGroupArn().hashCode());
        hashCode = prime * hashCode + ((getDeploymentId() == null) ? 0 : getDeploymentId().hashCode());
        hashCode = prime * hashCode + ((getEndTime() == null) ? 0 : getEndTime().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        return hashCode;
    }

    @Override
    public CodeDeployDeployment clone() {
        try {
            return (CodeDeployDeployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.ssmincidents.model.transform.CodeDeployDeploymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
