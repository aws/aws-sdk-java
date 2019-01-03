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
package com.amazonaws.services.robomaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about a robot deployment.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/RobotDeployment" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RobotDeployment implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The robot deployment Amazon Resource Name (ARN).
     * </p>
     */
    private String arn;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the deployment was started.
     * </p>
     */
    private java.util.Date deploymentStartTime;
    /**
     * <p>
     * The time, in milliseconds since the epoch, when the deployment finished.
     * </p>
     */
    private java.util.Date deploymentFinishTime;
    /**
     * <p>
     * The status of the robot deployment.
     * </p>
     */
    private String status;
    /**
     * <p>
     * Information about how the deployment is progressing.
     * </p>
     */
    private ProgressDetail progressDetail;
    /**
     * <p>
     * A short description of the reason why the robot deployment failed.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The robot deployment failure code.
     * </p>
     */
    private String failureCode;

    /**
     * <p>
     * The robot deployment Amazon Resource Name (ARN).
     * </p>
     * 
     * @param arn
     *        The robot deployment Amazon Resource Name (ARN).
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The robot deployment Amazon Resource Name (ARN).
     * </p>
     * 
     * @return The robot deployment Amazon Resource Name (ARN).
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The robot deployment Amazon Resource Name (ARN).
     * </p>
     * 
     * @param arn
     *        The robot deployment Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotDeployment withArn(String arn) {
        setArn(arn);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the deployment was started.
     * </p>
     * 
     * @param deploymentStartTime
     *        The time, in milliseconds since the epoch, when the deployment was started.
     */

    public void setDeploymentStartTime(java.util.Date deploymentStartTime) {
        this.deploymentStartTime = deploymentStartTime;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the deployment was started.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the deployment was started.
     */

    public java.util.Date getDeploymentStartTime() {
        return this.deploymentStartTime;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the deployment was started.
     * </p>
     * 
     * @param deploymentStartTime
     *        The time, in milliseconds since the epoch, when the deployment was started.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotDeployment withDeploymentStartTime(java.util.Date deploymentStartTime) {
        setDeploymentStartTime(deploymentStartTime);
        return this;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the deployment finished.
     * </p>
     * 
     * @param deploymentFinishTime
     *        The time, in milliseconds since the epoch, when the deployment finished.
     */

    public void setDeploymentFinishTime(java.util.Date deploymentFinishTime) {
        this.deploymentFinishTime = deploymentFinishTime;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the deployment finished.
     * </p>
     * 
     * @return The time, in milliseconds since the epoch, when the deployment finished.
     */

    public java.util.Date getDeploymentFinishTime() {
        return this.deploymentFinishTime;
    }

    /**
     * <p>
     * The time, in milliseconds since the epoch, when the deployment finished.
     * </p>
     * 
     * @param deploymentFinishTime
     *        The time, in milliseconds since the epoch, when the deployment finished.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotDeployment withDeploymentFinishTime(java.util.Date deploymentFinishTime) {
        setDeploymentFinishTime(deploymentFinishTime);
        return this;
    }

    /**
     * <p>
     * The status of the robot deployment.
     * </p>
     * 
     * @param status
     *        The status of the robot deployment.
     * @see RobotStatus
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the robot deployment.
     * </p>
     * 
     * @return The status of the robot deployment.
     * @see RobotStatus
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the robot deployment.
     * </p>
     * 
     * @param status
     *        The status of the robot deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RobotStatus
     */

    public RobotDeployment withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the robot deployment.
     * </p>
     * 
     * @param status
     *        The status of the robot deployment.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RobotStatus
     */

    public RobotDeployment withStatus(RobotStatus status) {
        this.status = status.toString();
        return this;
    }

    /**
     * <p>
     * Information about how the deployment is progressing.
     * </p>
     * 
     * @param progressDetail
     *        Information about how the deployment is progressing.
     */

    public void setProgressDetail(ProgressDetail progressDetail) {
        this.progressDetail = progressDetail;
    }

    /**
     * <p>
     * Information about how the deployment is progressing.
     * </p>
     * 
     * @return Information about how the deployment is progressing.
     */

    public ProgressDetail getProgressDetail() {
        return this.progressDetail;
    }

    /**
     * <p>
     * Information about how the deployment is progressing.
     * </p>
     * 
     * @param progressDetail
     *        Information about how the deployment is progressing.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotDeployment withProgressDetail(ProgressDetail progressDetail) {
        setProgressDetail(progressDetail);
        return this;
    }

    /**
     * <p>
     * A short description of the reason why the robot deployment failed.
     * </p>
     * 
     * @param failureReason
     *        A short description of the reason why the robot deployment failed.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * A short description of the reason why the robot deployment failed.
     * </p>
     * 
     * @return A short description of the reason why the robot deployment failed.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * A short description of the reason why the robot deployment failed.
     * </p>
     * 
     * @param failureReason
     *        A short description of the reason why the robot deployment failed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RobotDeployment withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The robot deployment failure code.
     * </p>
     * 
     * @param failureCode
     *        The robot deployment failure code.
     * @see DeploymentJobErrorCode
     */

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    /**
     * <p>
     * The robot deployment failure code.
     * </p>
     * 
     * @return The robot deployment failure code.
     * @see DeploymentJobErrorCode
     */

    public String getFailureCode() {
        return this.failureCode;
    }

    /**
     * <p>
     * The robot deployment failure code.
     * </p>
     * 
     * @param failureCode
     *        The robot deployment failure code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentJobErrorCode
     */

    public RobotDeployment withFailureCode(String failureCode) {
        setFailureCode(failureCode);
        return this;
    }

    /**
     * <p>
     * The robot deployment failure code.
     * </p>
     * 
     * @param failureCode
     *        The robot deployment failure code.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see DeploymentJobErrorCode
     */

    public RobotDeployment withFailureCode(DeploymentJobErrorCode failureCode) {
        this.failureCode = failureCode.toString();
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
        if (getArn() != null)
            sb.append("Arn: ").append(getArn()).append(",");
        if (getDeploymentStartTime() != null)
            sb.append("DeploymentStartTime: ").append(getDeploymentStartTime()).append(",");
        if (getDeploymentFinishTime() != null)
            sb.append("DeploymentFinishTime: ").append(getDeploymentFinishTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getProgressDetail() != null)
            sb.append("ProgressDetail: ").append(getProgressDetail()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getFailureCode() != null)
            sb.append("FailureCode: ").append(getFailureCode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RobotDeployment == false)
            return false;
        RobotDeployment other = (RobotDeployment) obj;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        if (other.getDeploymentStartTime() == null ^ this.getDeploymentStartTime() == null)
            return false;
        if (other.getDeploymentStartTime() != null && other.getDeploymentStartTime().equals(this.getDeploymentStartTime()) == false)
            return false;
        if (other.getDeploymentFinishTime() == null ^ this.getDeploymentFinishTime() == null)
            return false;
        if (other.getDeploymentFinishTime() != null && other.getDeploymentFinishTime().equals(this.getDeploymentFinishTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getProgressDetail() == null ^ this.getProgressDetail() == null)
            return false;
        if (other.getProgressDetail() != null && other.getProgressDetail().equals(this.getProgressDetail()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getFailureCode() == null ^ this.getFailureCode() == null)
            return false;
        if (other.getFailureCode() != null && other.getFailureCode().equals(this.getFailureCode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        hashCode = prime * hashCode + ((getDeploymentStartTime() == null) ? 0 : getDeploymentStartTime().hashCode());
        hashCode = prime * hashCode + ((getDeploymentFinishTime() == null) ? 0 : getDeploymentFinishTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getProgressDetail() == null) ? 0 : getProgressDetail().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getFailureCode() == null) ? 0 : getFailureCode().hashCode());
        return hashCode;
    }

    @Override
    public RobotDeployment clone() {
        try {
            return (RobotDeployment) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.RobotDeploymentMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
