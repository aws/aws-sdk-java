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
 * Identifies the user for a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/JobRunAsUser" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class JobRunAsUser implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The user and group that the jobs in the queue run as.
     * </p>
     */
    private PosixUser posix;
    /**
     * <p>
     * Specifies whether the job should run using the queue's system user or if the job should run using the worker
     * agent system user.
     * </p>
     */
    private String runAs;
    /**
     * <p>
     * Identifies a Microsoft Windows user.
     * </p>
     */
    private WindowsUser windows;

    /**
     * <p>
     * The user and group that the jobs in the queue run as.
     * </p>
     * 
     * @param posix
     *        The user and group that the jobs in the queue run as.
     */

    public void setPosix(PosixUser posix) {
        this.posix = posix;
    }

    /**
     * <p>
     * The user and group that the jobs in the queue run as.
     * </p>
     * 
     * @return The user and group that the jobs in the queue run as.
     */

    public PosixUser getPosix() {
        return this.posix;
    }

    /**
     * <p>
     * The user and group that the jobs in the queue run as.
     * </p>
     * 
     * @param posix
     *        The user and group that the jobs in the queue run as.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRunAsUser withPosix(PosixUser posix) {
        setPosix(posix);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job should run using the queue's system user or if the job should run using the worker
     * agent system user.
     * </p>
     * 
     * @param runAs
     *        Specifies whether the job should run using the queue's system user or if the job should run using the
     *        worker agent system user.
     * @see RunAs
     */

    public void setRunAs(String runAs) {
        this.runAs = runAs;
    }

    /**
     * <p>
     * Specifies whether the job should run using the queue's system user or if the job should run using the worker
     * agent system user.
     * </p>
     * 
     * @return Specifies whether the job should run using the queue's system user or if the job should run using the
     *         worker agent system user.
     * @see RunAs
     */

    public String getRunAs() {
        return this.runAs;
    }

    /**
     * <p>
     * Specifies whether the job should run using the queue's system user or if the job should run using the worker
     * agent system user.
     * </p>
     * 
     * @param runAs
     *        Specifies whether the job should run using the queue's system user or if the job should run using the
     *        worker agent system user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunAs
     */

    public JobRunAsUser withRunAs(String runAs) {
        setRunAs(runAs);
        return this;
    }

    /**
     * <p>
     * Specifies whether the job should run using the queue's system user or if the job should run using the worker
     * agent system user.
     * </p>
     * 
     * @param runAs
     *        Specifies whether the job should run using the queue's system user or if the job should run using the
     *        worker agent system user.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RunAs
     */

    public JobRunAsUser withRunAs(RunAs runAs) {
        this.runAs = runAs.toString();
        return this;
    }

    /**
     * <p>
     * Identifies a Microsoft Windows user.
     * </p>
     * 
     * @param windows
     *        Identifies a Microsoft Windows user.
     */

    public void setWindows(WindowsUser windows) {
        this.windows = windows;
    }

    /**
     * <p>
     * Identifies a Microsoft Windows user.
     * </p>
     * 
     * @return Identifies a Microsoft Windows user.
     */

    public WindowsUser getWindows() {
        return this.windows;
    }

    /**
     * <p>
     * Identifies a Microsoft Windows user.
     * </p>
     * 
     * @param windows
     *        Identifies a Microsoft Windows user.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public JobRunAsUser withWindows(WindowsUser windows) {
        setWindows(windows);
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
        if (getPosix() != null)
            sb.append("Posix: ").append(getPosix()).append(",");
        if (getRunAs() != null)
            sb.append("RunAs: ").append(getRunAs()).append(",");
        if (getWindows() != null)
            sb.append("Windows: ").append(getWindows());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof JobRunAsUser == false)
            return false;
        JobRunAsUser other = (JobRunAsUser) obj;
        if (other.getPosix() == null ^ this.getPosix() == null)
            return false;
        if (other.getPosix() != null && other.getPosix().equals(this.getPosix()) == false)
            return false;
        if (other.getRunAs() == null ^ this.getRunAs() == null)
            return false;
        if (other.getRunAs() != null && other.getRunAs().equals(this.getRunAs()) == false)
            return false;
        if (other.getWindows() == null ^ this.getWindows() == null)
            return false;
        if (other.getWindows() != null && other.getWindows().equals(this.getWindows()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getPosix() == null) ? 0 : getPosix().hashCode());
        hashCode = prime * hashCode + ((getRunAs() == null) ? 0 : getRunAs().hashCode());
        hashCode = prime * hashCode + ((getWindows() == null) ? 0 : getWindows().hashCode());
        return hashCode;
    }

    @Override
    public JobRunAsUser clone() {
        try {
            return (JobRunAsUser) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.deadline.model.transform.JobRunAsUserMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
