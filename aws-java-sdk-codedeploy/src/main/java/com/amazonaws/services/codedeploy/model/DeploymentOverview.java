/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

/**
 * <p>
 * Information about the deployment status of the instances in the deployment.
 * </p>
 */
public class DeploymentOverview implements Serializable, Cloneable {

    /**
     * <p>
     * The number of instances in the deployment in a pending state.
     * </p>
     */
    private Long pending;
    /**
     * <p>
     * The number of instances in which the deployment is in progress.
     * </p>
     */
    private Long inProgress;
    /**
     * <p>
     * The number of instances in the deployment to which revisions have been successfully deployed.
     * </p>
     */
    private Long succeeded;
    /**
     * <p>
     * The number of instances in the deployment in a failed state.
     * </p>
     */
    private Long failed;
    /**
     * <p>
     * The number of instances in the deployment in a skipped state.
     * </p>
     */
    private Long skipped;

    /**
     * <p>
     * The number of instances in the deployment in a pending state.
     * </p>
     * 
     * @param pending
     *        The number of instances in the deployment in a pending state.
     */

    public void setPending(Long pending) {
        this.pending = pending;
    }

    /**
     * <p>
     * The number of instances in the deployment in a pending state.
     * </p>
     * 
     * @return The number of instances in the deployment in a pending state.
     */

    public Long getPending() {
        return this.pending;
    }

    /**
     * <p>
     * The number of instances in the deployment in a pending state.
     * </p>
     * 
     * @param pending
     *        The number of instances in the deployment in a pending state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentOverview withPending(Long pending) {
        setPending(pending);
        return this;
    }

    /**
     * <p>
     * The number of instances in which the deployment is in progress.
     * </p>
     * 
     * @param inProgress
     *        The number of instances in which the deployment is in progress.
     */

    public void setInProgress(Long inProgress) {
        this.inProgress = inProgress;
    }

    /**
     * <p>
     * The number of instances in which the deployment is in progress.
     * </p>
     * 
     * @return The number of instances in which the deployment is in progress.
     */

    public Long getInProgress() {
        return this.inProgress;
    }

    /**
     * <p>
     * The number of instances in which the deployment is in progress.
     * </p>
     * 
     * @param inProgress
     *        The number of instances in which the deployment is in progress.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentOverview withInProgress(Long inProgress) {
        setInProgress(inProgress);
        return this;
    }

    /**
     * <p>
     * The number of instances in the deployment to which revisions have been successfully deployed.
     * </p>
     * 
     * @param succeeded
     *        The number of instances in the deployment to which revisions have been successfully deployed.
     */

    public void setSucceeded(Long succeeded) {
        this.succeeded = succeeded;
    }

    /**
     * <p>
     * The number of instances in the deployment to which revisions have been successfully deployed.
     * </p>
     * 
     * @return The number of instances in the deployment to which revisions have been successfully deployed.
     */

    public Long getSucceeded() {
        return this.succeeded;
    }

    /**
     * <p>
     * The number of instances in the deployment to which revisions have been successfully deployed.
     * </p>
     * 
     * @param succeeded
     *        The number of instances in the deployment to which revisions have been successfully deployed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentOverview withSucceeded(Long succeeded) {
        setSucceeded(succeeded);
        return this;
    }

    /**
     * <p>
     * The number of instances in the deployment in a failed state.
     * </p>
     * 
     * @param failed
     *        The number of instances in the deployment in a failed state.
     */

    public void setFailed(Long failed) {
        this.failed = failed;
    }

    /**
     * <p>
     * The number of instances in the deployment in a failed state.
     * </p>
     * 
     * @return The number of instances in the deployment in a failed state.
     */

    public Long getFailed() {
        return this.failed;
    }

    /**
     * <p>
     * The number of instances in the deployment in a failed state.
     * </p>
     * 
     * @param failed
     *        The number of instances in the deployment in a failed state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentOverview withFailed(Long failed) {
        setFailed(failed);
        return this;
    }

    /**
     * <p>
     * The number of instances in the deployment in a skipped state.
     * </p>
     * 
     * @param skipped
     *        The number of instances in the deployment in a skipped state.
     */

    public void setSkipped(Long skipped) {
        this.skipped = skipped;
    }

    /**
     * <p>
     * The number of instances in the deployment in a skipped state.
     * </p>
     * 
     * @return The number of instances in the deployment in a skipped state.
     */

    public Long getSkipped() {
        return this.skipped;
    }

    /**
     * <p>
     * The number of instances in the deployment in a skipped state.
     * </p>
     * 
     * @param skipped
     *        The number of instances in the deployment in a skipped state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeploymentOverview withSkipped(Long skipped) {
        setSkipped(skipped);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getPending() != null)
            sb.append("Pending: " + getPending() + ",");
        if (getInProgress() != null)
            sb.append("InProgress: " + getInProgress() + ",");
        if (getSucceeded() != null)
            sb.append("Succeeded: " + getSucceeded() + ",");
        if (getFailed() != null)
            sb.append("Failed: " + getFailed() + ",");
        if (getSkipped() != null)
            sb.append("Skipped: " + getSkipped());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeploymentOverview == false)
            return false;
        DeploymentOverview other = (DeploymentOverview) obj;
        if (other.getPending() == null ^ this.getPending() == null)
            return false;
        if (other.getPending() != null && other.getPending().equals(this.getPending()) == false)
            return false;
        if (other.getInProgress() == null ^ this.getInProgress() == null)
            return false;
        if (other.getInProgress() != null && other.getInProgress().equals(this.getInProgress()) == false)
            return false;
        if (other.getSucceeded() == null ^ this.getSucceeded() == null)
            return false;
        if (other.getSucceeded() != null && other.getSucceeded().equals(this.getSucceeded()) == false)
            return false;
        if (other.getFailed() == null ^ this.getFailed() == null)
            return false;
        if (other.getFailed() != null && other.getFailed().equals(this.getFailed()) == false)
            return false;
        if (other.getSkipped() == null ^ this.getSkipped() == null)
            return false;
        if (other.getSkipped() != null && other.getSkipped().equals(this.getSkipped()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPending() == null) ? 0 : getPending().hashCode());
        hashCode = prime * hashCode + ((getInProgress() == null) ? 0 : getInProgress().hashCode());
        hashCode = prime * hashCode + ((getSucceeded() == null) ? 0 : getSucceeded().hashCode());
        hashCode = prime * hashCode + ((getFailed() == null) ? 0 : getFailed().hashCode());
        hashCode = prime * hashCode + ((getSkipped() == null) ? 0 : getSkipped().hashCode());
        return hashCode;
    }

    @Override
    public DeploymentOverview clone() {
        try {
            return (DeploymentOverview) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }
}
