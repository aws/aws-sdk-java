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
 * Information about the progress of a deployment job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/robomaker-2018-06-29/ProgressDetail" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProgressDetail implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The current progress status.
     * </p>
     * <dl>
     * <dt>Validating</dt>
     * <dd>
     * <p>
     * Validating the deployment.
     * </p>
     * </dd>
     * <dt>Downloading/Extracting</dt>
     * <dd>
     * <p>
     * Downloading and extracting the bundle on the robot.
     * </p>
     * </dd>
     * <dt>Executing pre-launch script(s)</dt>
     * <dd>
     * <p>
     * Executing pre-launch script(s) if provided.
     * </p>
     * </dd>
     * <dt>Launching</dt>
     * <dd>
     * <p>
     * Launching the robot application.
     * </p>
     * </dd>
     * <dt>Executing post-launch script(s)</dt>
     * <dd>
     * <p>
     * Executing post-launch script(s) if provided.
     * </p>
     * </dd>
     * <dt>Finished</dt>
     * <dd>
     * <p>
     * Deployment is complete.
     * </p>
     * </dd>
     * </dl>
     */
    private String currentProgress;
    /**
     * <p>
     * Precentage of the step that is done. This currently only applies to the <code>Downloading/Extracting</code> step
     * of the deployment. It is empty for other steps.
     * </p>
     */
    private Float percentDone;
    /**
     * <p>
     * Estimated amount of time in seconds remaining in the step. This currently only applies to the
     * <code>Downloading/Extracting</code> step of the deployment. It is empty for other steps.
     * </p>
     */
    private Integer estimatedTimeRemainingSeconds;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment job.
     * </p>
     */
    private String targetResource;

    /**
     * <p>
     * The current progress status.
     * </p>
     * <dl>
     * <dt>Validating</dt>
     * <dd>
     * <p>
     * Validating the deployment.
     * </p>
     * </dd>
     * <dt>Downloading/Extracting</dt>
     * <dd>
     * <p>
     * Downloading and extracting the bundle on the robot.
     * </p>
     * </dd>
     * <dt>Executing pre-launch script(s)</dt>
     * <dd>
     * <p>
     * Executing pre-launch script(s) if provided.
     * </p>
     * </dd>
     * <dt>Launching</dt>
     * <dd>
     * <p>
     * Launching the robot application.
     * </p>
     * </dd>
     * <dt>Executing post-launch script(s)</dt>
     * <dd>
     * <p>
     * Executing post-launch script(s) if provided.
     * </p>
     * </dd>
     * <dt>Finished</dt>
     * <dd>
     * <p>
     * Deployment is complete.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param currentProgress
     *        The current progress status.</p>
     *        <dl>
     *        <dt>Validating</dt>
     *        <dd>
     *        <p>
     *        Validating the deployment.
     *        </p>
     *        </dd>
     *        <dt>Downloading/Extracting</dt>
     *        <dd>
     *        <p>
     *        Downloading and extracting the bundle on the robot.
     *        </p>
     *        </dd>
     *        <dt>Executing pre-launch script(s)</dt>
     *        <dd>
     *        <p>
     *        Executing pre-launch script(s) if provided.
     *        </p>
     *        </dd>
     *        <dt>Launching</dt>
     *        <dd>
     *        <p>
     *        Launching the robot application.
     *        </p>
     *        </dd>
     *        <dt>Executing post-launch script(s)</dt>
     *        <dd>
     *        <p>
     *        Executing post-launch script(s) if provided.
     *        </p>
     *        </dd>
     *        <dt>Finished</dt>
     *        <dd>
     *        <p>
     *        Deployment is complete.
     *        </p>
     *        </dd>
     * @see RobotDeploymentStep
     */

    public void setCurrentProgress(String currentProgress) {
        this.currentProgress = currentProgress;
    }

    /**
     * <p>
     * The current progress status.
     * </p>
     * <dl>
     * <dt>Validating</dt>
     * <dd>
     * <p>
     * Validating the deployment.
     * </p>
     * </dd>
     * <dt>Downloading/Extracting</dt>
     * <dd>
     * <p>
     * Downloading and extracting the bundle on the robot.
     * </p>
     * </dd>
     * <dt>Executing pre-launch script(s)</dt>
     * <dd>
     * <p>
     * Executing pre-launch script(s) if provided.
     * </p>
     * </dd>
     * <dt>Launching</dt>
     * <dd>
     * <p>
     * Launching the robot application.
     * </p>
     * </dd>
     * <dt>Executing post-launch script(s)</dt>
     * <dd>
     * <p>
     * Executing post-launch script(s) if provided.
     * </p>
     * </dd>
     * <dt>Finished</dt>
     * <dd>
     * <p>
     * Deployment is complete.
     * </p>
     * </dd>
     * </dl>
     * 
     * @return The current progress status.</p>
     *         <dl>
     *         <dt>Validating</dt>
     *         <dd>
     *         <p>
     *         Validating the deployment.
     *         </p>
     *         </dd>
     *         <dt>Downloading/Extracting</dt>
     *         <dd>
     *         <p>
     *         Downloading and extracting the bundle on the robot.
     *         </p>
     *         </dd>
     *         <dt>Executing pre-launch script(s)</dt>
     *         <dd>
     *         <p>
     *         Executing pre-launch script(s) if provided.
     *         </p>
     *         </dd>
     *         <dt>Launching</dt>
     *         <dd>
     *         <p>
     *         Launching the robot application.
     *         </p>
     *         </dd>
     *         <dt>Executing post-launch script(s)</dt>
     *         <dd>
     *         <p>
     *         Executing post-launch script(s) if provided.
     *         </p>
     *         </dd>
     *         <dt>Finished</dt>
     *         <dd>
     *         <p>
     *         Deployment is complete.
     *         </p>
     *         </dd>
     * @see RobotDeploymentStep
     */

    public String getCurrentProgress() {
        return this.currentProgress;
    }

    /**
     * <p>
     * The current progress status.
     * </p>
     * <dl>
     * <dt>Validating</dt>
     * <dd>
     * <p>
     * Validating the deployment.
     * </p>
     * </dd>
     * <dt>Downloading/Extracting</dt>
     * <dd>
     * <p>
     * Downloading and extracting the bundle on the robot.
     * </p>
     * </dd>
     * <dt>Executing pre-launch script(s)</dt>
     * <dd>
     * <p>
     * Executing pre-launch script(s) if provided.
     * </p>
     * </dd>
     * <dt>Launching</dt>
     * <dd>
     * <p>
     * Launching the robot application.
     * </p>
     * </dd>
     * <dt>Executing post-launch script(s)</dt>
     * <dd>
     * <p>
     * Executing post-launch script(s) if provided.
     * </p>
     * </dd>
     * <dt>Finished</dt>
     * <dd>
     * <p>
     * Deployment is complete.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param currentProgress
     *        The current progress status.</p>
     *        <dl>
     *        <dt>Validating</dt>
     *        <dd>
     *        <p>
     *        Validating the deployment.
     *        </p>
     *        </dd>
     *        <dt>Downloading/Extracting</dt>
     *        <dd>
     *        <p>
     *        Downloading and extracting the bundle on the robot.
     *        </p>
     *        </dd>
     *        <dt>Executing pre-launch script(s)</dt>
     *        <dd>
     *        <p>
     *        Executing pre-launch script(s) if provided.
     *        </p>
     *        </dd>
     *        <dt>Launching</dt>
     *        <dd>
     *        <p>
     *        Launching the robot application.
     *        </p>
     *        </dd>
     *        <dt>Executing post-launch script(s)</dt>
     *        <dd>
     *        <p>
     *        Executing post-launch script(s) if provided.
     *        </p>
     *        </dd>
     *        <dt>Finished</dt>
     *        <dd>
     *        <p>
     *        Deployment is complete.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RobotDeploymentStep
     */

    public ProgressDetail withCurrentProgress(String currentProgress) {
        setCurrentProgress(currentProgress);
        return this;
    }

    /**
     * <p>
     * The current progress status.
     * </p>
     * <dl>
     * <dt>Validating</dt>
     * <dd>
     * <p>
     * Validating the deployment.
     * </p>
     * </dd>
     * <dt>Downloading/Extracting</dt>
     * <dd>
     * <p>
     * Downloading and extracting the bundle on the robot.
     * </p>
     * </dd>
     * <dt>Executing pre-launch script(s)</dt>
     * <dd>
     * <p>
     * Executing pre-launch script(s) if provided.
     * </p>
     * </dd>
     * <dt>Launching</dt>
     * <dd>
     * <p>
     * Launching the robot application.
     * </p>
     * </dd>
     * <dt>Executing post-launch script(s)</dt>
     * <dd>
     * <p>
     * Executing post-launch script(s) if provided.
     * </p>
     * </dd>
     * <dt>Finished</dt>
     * <dd>
     * <p>
     * Deployment is complete.
     * </p>
     * </dd>
     * </dl>
     * 
     * @param currentProgress
     *        The current progress status.</p>
     *        <dl>
     *        <dt>Validating</dt>
     *        <dd>
     *        <p>
     *        Validating the deployment.
     *        </p>
     *        </dd>
     *        <dt>Downloading/Extracting</dt>
     *        <dd>
     *        <p>
     *        Downloading and extracting the bundle on the robot.
     *        </p>
     *        </dd>
     *        <dt>Executing pre-launch script(s)</dt>
     *        <dd>
     *        <p>
     *        Executing pre-launch script(s) if provided.
     *        </p>
     *        </dd>
     *        <dt>Launching</dt>
     *        <dd>
     *        <p>
     *        Launching the robot application.
     *        </p>
     *        </dd>
     *        <dt>Executing post-launch script(s)</dt>
     *        <dd>
     *        <p>
     *        Executing post-launch script(s) if provided.
     *        </p>
     *        </dd>
     *        <dt>Finished</dt>
     *        <dd>
     *        <p>
     *        Deployment is complete.
     *        </p>
     *        </dd>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RobotDeploymentStep
     */

    public ProgressDetail withCurrentProgress(RobotDeploymentStep currentProgress) {
        this.currentProgress = currentProgress.toString();
        return this;
    }

    /**
     * <p>
     * Precentage of the step that is done. This currently only applies to the <code>Downloading/Extracting</code> step
     * of the deployment. It is empty for other steps.
     * </p>
     * 
     * @param percentDone
     *        Precentage of the step that is done. This currently only applies to the
     *        <code>Downloading/Extracting</code> step of the deployment. It is empty for other steps.
     */

    public void setPercentDone(Float percentDone) {
        this.percentDone = percentDone;
    }

    /**
     * <p>
     * Precentage of the step that is done. This currently only applies to the <code>Downloading/Extracting</code> step
     * of the deployment. It is empty for other steps.
     * </p>
     * 
     * @return Precentage of the step that is done. This currently only applies to the
     *         <code>Downloading/Extracting</code> step of the deployment. It is empty for other steps.
     */

    public Float getPercentDone() {
        return this.percentDone;
    }

    /**
     * <p>
     * Precentage of the step that is done. This currently only applies to the <code>Downloading/Extracting</code> step
     * of the deployment. It is empty for other steps.
     * </p>
     * 
     * @param percentDone
     *        Precentage of the step that is done. This currently only applies to the
     *        <code>Downloading/Extracting</code> step of the deployment. It is empty for other steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProgressDetail withPercentDone(Float percentDone) {
        setPercentDone(percentDone);
        return this;
    }

    /**
     * <p>
     * Estimated amount of time in seconds remaining in the step. This currently only applies to the
     * <code>Downloading/Extracting</code> step of the deployment. It is empty for other steps.
     * </p>
     * 
     * @param estimatedTimeRemainingSeconds
     *        Estimated amount of time in seconds remaining in the step. This currently only applies to the
     *        <code>Downloading/Extracting</code> step of the deployment. It is empty for other steps.
     */

    public void setEstimatedTimeRemainingSeconds(Integer estimatedTimeRemainingSeconds) {
        this.estimatedTimeRemainingSeconds = estimatedTimeRemainingSeconds;
    }

    /**
     * <p>
     * Estimated amount of time in seconds remaining in the step. This currently only applies to the
     * <code>Downloading/Extracting</code> step of the deployment. It is empty for other steps.
     * </p>
     * 
     * @return Estimated amount of time in seconds remaining in the step. This currently only applies to the
     *         <code>Downloading/Extracting</code> step of the deployment. It is empty for other steps.
     */

    public Integer getEstimatedTimeRemainingSeconds() {
        return this.estimatedTimeRemainingSeconds;
    }

    /**
     * <p>
     * Estimated amount of time in seconds remaining in the step. This currently only applies to the
     * <code>Downloading/Extracting</code> step of the deployment. It is empty for other steps.
     * </p>
     * 
     * @param estimatedTimeRemainingSeconds
     *        Estimated amount of time in seconds remaining in the step. This currently only applies to the
     *        <code>Downloading/Extracting</code> step of the deployment. It is empty for other steps.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProgressDetail withEstimatedTimeRemainingSeconds(Integer estimatedTimeRemainingSeconds) {
        setEstimatedTimeRemainingSeconds(estimatedTimeRemainingSeconds);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment job.
     * </p>
     * 
     * @param targetResource
     *        The Amazon Resource Name (ARN) of the deployment job.
     */

    public void setTargetResource(String targetResource) {
        this.targetResource = targetResource;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment job.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the deployment job.
     */

    public String getTargetResource() {
        return this.targetResource;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the deployment job.
     * </p>
     * 
     * @param targetResource
     *        The Amazon Resource Name (ARN) of the deployment job.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProgressDetail withTargetResource(String targetResource) {
        setTargetResource(targetResource);
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
        if (getCurrentProgress() != null)
            sb.append("CurrentProgress: ").append(getCurrentProgress()).append(",");
        if (getPercentDone() != null)
            sb.append("PercentDone: ").append(getPercentDone()).append(",");
        if (getEstimatedTimeRemainingSeconds() != null)
            sb.append("EstimatedTimeRemainingSeconds: ").append(getEstimatedTimeRemainingSeconds()).append(",");
        if (getTargetResource() != null)
            sb.append("TargetResource: ").append(getTargetResource());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProgressDetail == false)
            return false;
        ProgressDetail other = (ProgressDetail) obj;
        if (other.getCurrentProgress() == null ^ this.getCurrentProgress() == null)
            return false;
        if (other.getCurrentProgress() != null && other.getCurrentProgress().equals(this.getCurrentProgress()) == false)
            return false;
        if (other.getPercentDone() == null ^ this.getPercentDone() == null)
            return false;
        if (other.getPercentDone() != null && other.getPercentDone().equals(this.getPercentDone()) == false)
            return false;
        if (other.getEstimatedTimeRemainingSeconds() == null ^ this.getEstimatedTimeRemainingSeconds() == null)
            return false;
        if (other.getEstimatedTimeRemainingSeconds() != null
                && other.getEstimatedTimeRemainingSeconds().equals(this.getEstimatedTimeRemainingSeconds()) == false)
            return false;
        if (other.getTargetResource() == null ^ this.getTargetResource() == null)
            return false;
        if (other.getTargetResource() != null && other.getTargetResource().equals(this.getTargetResource()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCurrentProgress() == null) ? 0 : getCurrentProgress().hashCode());
        hashCode = prime * hashCode + ((getPercentDone() == null) ? 0 : getPercentDone().hashCode());
        hashCode = prime * hashCode + ((getEstimatedTimeRemainingSeconds() == null) ? 0 : getEstimatedTimeRemainingSeconds().hashCode());
        hashCode = prime * hashCode + ((getTargetResource() == null) ? 0 : getTargetResource().hashCode());
        return hashCode;
    }

    @Override
    public ProgressDetail clone() {
        try {
            return (ProgressDetail) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.robomaker.model.transform.ProgressDetailMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
