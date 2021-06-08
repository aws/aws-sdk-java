/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * The action type that specifies an Amazon Redshift API operation that is supported by the Amazon Redshift scheduler.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/ScheduledActionType" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ScheduledActionType implements Serializable, Cloneable {

    /**
     * <p>
     * An action that runs a <code>ResizeCluster</code> API operation.
     * </p>
     */
    private ResizeClusterMessage resizeCluster;
    /**
     * <p>
     * An action that runs a <code>PauseCluster</code> API operation.
     * </p>
     */
    private PauseClusterMessage pauseCluster;
    /**
     * <p>
     * An action that runs a <code>ResumeCluster</code> API operation.
     * </p>
     */
    private ResumeClusterMessage resumeCluster;

    /**
     * <p>
     * An action that runs a <code>ResizeCluster</code> API operation.
     * </p>
     * 
     * @param resizeCluster
     *        An action that runs a <code>ResizeCluster</code> API operation.
     */

    public void setResizeCluster(ResizeClusterMessage resizeCluster) {
        this.resizeCluster = resizeCluster;
    }

    /**
     * <p>
     * An action that runs a <code>ResizeCluster</code> API operation.
     * </p>
     * 
     * @return An action that runs a <code>ResizeCluster</code> API operation.
     */

    public ResizeClusterMessage getResizeCluster() {
        return this.resizeCluster;
    }

    /**
     * <p>
     * An action that runs a <code>ResizeCluster</code> API operation.
     * </p>
     * 
     * @param resizeCluster
     *        An action that runs a <code>ResizeCluster</code> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionType withResizeCluster(ResizeClusterMessage resizeCluster) {
        setResizeCluster(resizeCluster);
        return this;
    }

    /**
     * <p>
     * An action that runs a <code>PauseCluster</code> API operation.
     * </p>
     * 
     * @param pauseCluster
     *        An action that runs a <code>PauseCluster</code> API operation.
     */

    public void setPauseCluster(PauseClusterMessage pauseCluster) {
        this.pauseCluster = pauseCluster;
    }

    /**
     * <p>
     * An action that runs a <code>PauseCluster</code> API operation.
     * </p>
     * 
     * @return An action that runs a <code>PauseCluster</code> API operation.
     */

    public PauseClusterMessage getPauseCluster() {
        return this.pauseCluster;
    }

    /**
     * <p>
     * An action that runs a <code>PauseCluster</code> API operation.
     * </p>
     * 
     * @param pauseCluster
     *        An action that runs a <code>PauseCluster</code> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionType withPauseCluster(PauseClusterMessage pauseCluster) {
        setPauseCluster(pauseCluster);
        return this;
    }

    /**
     * <p>
     * An action that runs a <code>ResumeCluster</code> API operation.
     * </p>
     * 
     * @param resumeCluster
     *        An action that runs a <code>ResumeCluster</code> API operation.
     */

    public void setResumeCluster(ResumeClusterMessage resumeCluster) {
        this.resumeCluster = resumeCluster;
    }

    /**
     * <p>
     * An action that runs a <code>ResumeCluster</code> API operation.
     * </p>
     * 
     * @return An action that runs a <code>ResumeCluster</code> API operation.
     */

    public ResumeClusterMessage getResumeCluster() {
        return this.resumeCluster;
    }

    /**
     * <p>
     * An action that runs a <code>ResumeCluster</code> API operation.
     * </p>
     * 
     * @param resumeCluster
     *        An action that runs a <code>ResumeCluster</code> API operation.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ScheduledActionType withResumeCluster(ResumeClusterMessage resumeCluster) {
        setResumeCluster(resumeCluster);
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
        if (getResizeCluster() != null)
            sb.append("ResizeCluster: ").append(getResizeCluster()).append(",");
        if (getPauseCluster() != null)
            sb.append("PauseCluster: ").append(getPauseCluster()).append(",");
        if (getResumeCluster() != null)
            sb.append("ResumeCluster: ").append(getResumeCluster());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ScheduledActionType == false)
            return false;
        ScheduledActionType other = (ScheduledActionType) obj;
        if (other.getResizeCluster() == null ^ this.getResizeCluster() == null)
            return false;
        if (other.getResizeCluster() != null && other.getResizeCluster().equals(this.getResizeCluster()) == false)
            return false;
        if (other.getPauseCluster() == null ^ this.getPauseCluster() == null)
            return false;
        if (other.getPauseCluster() != null && other.getPauseCluster().equals(this.getPauseCluster()) == false)
            return false;
        if (other.getResumeCluster() == null ^ this.getResumeCluster() == null)
            return false;
        if (other.getResumeCluster() != null && other.getResumeCluster().equals(this.getResumeCluster()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResizeCluster() == null) ? 0 : getResizeCluster().hashCode());
        hashCode = prime * hashCode + ((getPauseCluster() == null) ? 0 : getPauseCluster().hashCode());
        hashCode = prime * hashCode + ((getResumeCluster() == null) ? 0 : getResumeCluster().hashCode());
        return hashCode;
    }

    @Override
    public ScheduledActionType clone() {
        try {
            return (ScheduledActionType) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
