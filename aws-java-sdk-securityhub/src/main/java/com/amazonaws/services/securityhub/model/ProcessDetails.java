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
package com.amazonaws.services.securityhub.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The details of process-related information about a finding.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/securityhub-2018-10-26/ProcessDetails" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ProcessDetails implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the process.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The path to the process executable.
     * </p>
     */
    private String path;
    /**
     * <p>
     * The process ID.
     * </p>
     */
    private Integer pid;
    /**
     * <p>
     * The parent process ID.
     * </p>
     */
    private Integer parentPid;
    /**
     * <p>
     * The date/time that the process was launched.
     * </p>
     */
    private String launchedAt;
    /**
     * <p>
     * The date/time that the process was terminated.
     * </p>
     */
    private String terminatedAt;

    /**
     * <p>
     * The name of the process.
     * </p>
     * 
     * @param name
     *        The name of the process.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the process.
     * </p>
     * 
     * @return The name of the process.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the process.
     * </p>
     * 
     * @param name
     *        The name of the process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessDetails withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The path to the process executable.
     * </p>
     * 
     * @param path
     *        The path to the process executable.
     */

    public void setPath(String path) {
        this.path = path;
    }

    /**
     * <p>
     * The path to the process executable.
     * </p>
     * 
     * @return The path to the process executable.
     */

    public String getPath() {
        return this.path;
    }

    /**
     * <p>
     * The path to the process executable.
     * </p>
     * 
     * @param path
     *        The path to the process executable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessDetails withPath(String path) {
        setPath(path);
        return this;
    }

    /**
     * <p>
     * The process ID.
     * </p>
     * 
     * @param pid
     *        The process ID.
     */

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * <p>
     * The process ID.
     * </p>
     * 
     * @return The process ID.
     */

    public Integer getPid() {
        return this.pid;
    }

    /**
     * <p>
     * The process ID.
     * </p>
     * 
     * @param pid
     *        The process ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessDetails withPid(Integer pid) {
        setPid(pid);
        return this;
    }

    /**
     * <p>
     * The parent process ID.
     * </p>
     * 
     * @param parentPid
     *        The parent process ID.
     */

    public void setParentPid(Integer parentPid) {
        this.parentPid = parentPid;
    }

    /**
     * <p>
     * The parent process ID.
     * </p>
     * 
     * @return The parent process ID.
     */

    public Integer getParentPid() {
        return this.parentPid;
    }

    /**
     * <p>
     * The parent process ID.
     * </p>
     * 
     * @param parentPid
     *        The parent process ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessDetails withParentPid(Integer parentPid) {
        setParentPid(parentPid);
        return this;
    }

    /**
     * <p>
     * The date/time that the process was launched.
     * </p>
     * 
     * @param launchedAt
     *        The date/time that the process was launched.
     */

    public void setLaunchedAt(String launchedAt) {
        this.launchedAt = launchedAt;
    }

    /**
     * <p>
     * The date/time that the process was launched.
     * </p>
     * 
     * @return The date/time that the process was launched.
     */

    public String getLaunchedAt() {
        return this.launchedAt;
    }

    /**
     * <p>
     * The date/time that the process was launched.
     * </p>
     * 
     * @param launchedAt
     *        The date/time that the process was launched.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessDetails withLaunchedAt(String launchedAt) {
        setLaunchedAt(launchedAt);
        return this;
    }

    /**
     * <p>
     * The date/time that the process was terminated.
     * </p>
     * 
     * @param terminatedAt
     *        The date/time that the process was terminated.
     */

    public void setTerminatedAt(String terminatedAt) {
        this.terminatedAt = terminatedAt;
    }

    /**
     * <p>
     * The date/time that the process was terminated.
     * </p>
     * 
     * @return The date/time that the process was terminated.
     */

    public String getTerminatedAt() {
        return this.terminatedAt;
    }

    /**
     * <p>
     * The date/time that the process was terminated.
     * </p>
     * 
     * @param terminatedAt
     *        The date/time that the process was terminated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessDetails withTerminatedAt(String terminatedAt) {
        setTerminatedAt(terminatedAt);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPath() != null)
            sb.append("Path: ").append(getPath()).append(",");
        if (getPid() != null)
            sb.append("Pid: ").append(getPid()).append(",");
        if (getParentPid() != null)
            sb.append("ParentPid: ").append(getParentPid()).append(",");
        if (getLaunchedAt() != null)
            sb.append("LaunchedAt: ").append(getLaunchedAt()).append(",");
        if (getTerminatedAt() != null)
            sb.append("TerminatedAt: ").append(getTerminatedAt());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ProcessDetails == false)
            return false;
        ProcessDetails other = (ProcessDetails) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPath() == null ^ this.getPath() == null)
            return false;
        if (other.getPath() != null && other.getPath().equals(this.getPath()) == false)
            return false;
        if (other.getPid() == null ^ this.getPid() == null)
            return false;
        if (other.getPid() != null && other.getPid().equals(this.getPid()) == false)
            return false;
        if (other.getParentPid() == null ^ this.getParentPid() == null)
            return false;
        if (other.getParentPid() != null && other.getParentPid().equals(this.getParentPid()) == false)
            return false;
        if (other.getLaunchedAt() == null ^ this.getLaunchedAt() == null)
            return false;
        if (other.getLaunchedAt() != null && other.getLaunchedAt().equals(this.getLaunchedAt()) == false)
            return false;
        if (other.getTerminatedAt() == null ^ this.getTerminatedAt() == null)
            return false;
        if (other.getTerminatedAt() != null && other.getTerminatedAt().equals(this.getTerminatedAt()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPath() == null) ? 0 : getPath().hashCode());
        hashCode = prime * hashCode + ((getPid() == null) ? 0 : getPid().hashCode());
        hashCode = prime * hashCode + ((getParentPid() == null) ? 0 : getParentPid().hashCode());
        hashCode = prime * hashCode + ((getLaunchedAt() == null) ? 0 : getLaunchedAt().hashCode());
        hashCode = prime * hashCode + ((getTerminatedAt() == null) ? 0 : getTerminatedAt().hashCode());
        return hashCode;
    }

    @Override
    public ProcessDetails clone() {
        try {
            return (ProcessDetails) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.securityhub.model.transform.ProcessDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
