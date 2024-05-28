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
package com.amazonaws.services.guardduty.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Information about the runtime process details.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/LineageObject" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LineageObject implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The time when the process started. This is in UTC format.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The process ID of the child process.
     * </p>
     */
    private Integer namespacePid;
    /**
     * <p>
     * The user ID of the user that executed the process.
     * </p>
     */
    private Integer userId;
    /**
     * <p>
     * The name of the process.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The ID of the process.
     * </p>
     */
    private Integer pid;
    /**
     * <p>
     * The unique ID assigned to the process by GuardDuty.
     * </p>
     */
    private String uuid;
    /**
     * <p>
     * The absolute path of the process executable file.
     * </p>
     */
    private String executablePath;
    /**
     * <p>
     * The effective user ID that was used to execute the process.
     * </p>
     */
    private Integer euid;
    /**
     * <p>
     * The unique ID of the parent process. This ID is assigned to the parent process by GuardDuty.
     * </p>
     */
    private String parentUuid;

    /**
     * <p>
     * The time when the process started. This is in UTC format.
     * </p>
     * 
     * @param startTime
     *        The time when the process started. This is in UTC format.
     */

    public void setStartTime(java.util.Date startTime) {
        this.startTime = startTime;
    }

    /**
     * <p>
     * The time when the process started. This is in UTC format.
     * </p>
     * 
     * @return The time when the process started. This is in UTC format.
     */

    public java.util.Date getStartTime() {
        return this.startTime;
    }

    /**
     * <p>
     * The time when the process started. This is in UTC format.
     * </p>
     * 
     * @param startTime
     *        The time when the process started. This is in UTC format.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageObject withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
        return this;
    }

    /**
     * <p>
     * The process ID of the child process.
     * </p>
     * 
     * @param namespacePid
     *        The process ID of the child process.
     */

    public void setNamespacePid(Integer namespacePid) {
        this.namespacePid = namespacePid;
    }

    /**
     * <p>
     * The process ID of the child process.
     * </p>
     * 
     * @return The process ID of the child process.
     */

    public Integer getNamespacePid() {
        return this.namespacePid;
    }

    /**
     * <p>
     * The process ID of the child process.
     * </p>
     * 
     * @param namespacePid
     *        The process ID of the child process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageObject withNamespacePid(Integer namespacePid) {
        setNamespacePid(namespacePid);
        return this;
    }

    /**
     * <p>
     * The user ID of the user that executed the process.
     * </p>
     * 
     * @param userId
     *        The user ID of the user that executed the process.
     */

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The user ID of the user that executed the process.
     * </p>
     * 
     * @return The user ID of the user that executed the process.
     */

    public Integer getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The user ID of the user that executed the process.
     * </p>
     * 
     * @param userId
     *        The user ID of the user that executed the process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageObject withUserId(Integer userId) {
        setUserId(userId);
        return this;
    }

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

    public LineageObject withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The ID of the process.
     * </p>
     * 
     * @param pid
     *        The ID of the process.
     */

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    /**
     * <p>
     * The ID of the process.
     * </p>
     * 
     * @return The ID of the process.
     */

    public Integer getPid() {
        return this.pid;
    }

    /**
     * <p>
     * The ID of the process.
     * </p>
     * 
     * @param pid
     *        The ID of the process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageObject withPid(Integer pid) {
        setPid(pid);
        return this;
    }

    /**
     * <p>
     * The unique ID assigned to the process by GuardDuty.
     * </p>
     * 
     * @param uuid
     *        The unique ID assigned to the process by GuardDuty.
     */

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    /**
     * <p>
     * The unique ID assigned to the process by GuardDuty.
     * </p>
     * 
     * @return The unique ID assigned to the process by GuardDuty.
     */

    public String getUuid() {
        return this.uuid;
    }

    /**
     * <p>
     * The unique ID assigned to the process by GuardDuty.
     * </p>
     * 
     * @param uuid
     *        The unique ID assigned to the process by GuardDuty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageObject withUuid(String uuid) {
        setUuid(uuid);
        return this;
    }

    /**
     * <p>
     * The absolute path of the process executable file.
     * </p>
     * 
     * @param executablePath
     *        The absolute path of the process executable file.
     */

    public void setExecutablePath(String executablePath) {
        this.executablePath = executablePath;
    }

    /**
     * <p>
     * The absolute path of the process executable file.
     * </p>
     * 
     * @return The absolute path of the process executable file.
     */

    public String getExecutablePath() {
        return this.executablePath;
    }

    /**
     * <p>
     * The absolute path of the process executable file.
     * </p>
     * 
     * @param executablePath
     *        The absolute path of the process executable file.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageObject withExecutablePath(String executablePath) {
        setExecutablePath(executablePath);
        return this;
    }

    /**
     * <p>
     * The effective user ID that was used to execute the process.
     * </p>
     * 
     * @param euid
     *        The effective user ID that was used to execute the process.
     */

    public void setEuid(Integer euid) {
        this.euid = euid;
    }

    /**
     * <p>
     * The effective user ID that was used to execute the process.
     * </p>
     * 
     * @return The effective user ID that was used to execute the process.
     */

    public Integer getEuid() {
        return this.euid;
    }

    /**
     * <p>
     * The effective user ID that was used to execute the process.
     * </p>
     * 
     * @param euid
     *        The effective user ID that was used to execute the process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageObject withEuid(Integer euid) {
        setEuid(euid);
        return this;
    }

    /**
     * <p>
     * The unique ID of the parent process. This ID is assigned to the parent process by GuardDuty.
     * </p>
     * 
     * @param parentUuid
     *        The unique ID of the parent process. This ID is assigned to the parent process by GuardDuty.
     */

    public void setParentUuid(String parentUuid) {
        this.parentUuid = parentUuid;
    }

    /**
     * <p>
     * The unique ID of the parent process. This ID is assigned to the parent process by GuardDuty.
     * </p>
     * 
     * @return The unique ID of the parent process. This ID is assigned to the parent process by GuardDuty.
     */

    public String getParentUuid() {
        return this.parentUuid;
    }

    /**
     * <p>
     * The unique ID of the parent process. This ID is assigned to the parent process by GuardDuty.
     * </p>
     * 
     * @param parentUuid
     *        The unique ID of the parent process. This ID is assigned to the parent process by GuardDuty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LineageObject withParentUuid(String parentUuid) {
        setParentUuid(parentUuid);
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
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getNamespacePid() != null)
            sb.append("NamespacePid: ").append(getNamespacePid()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getPid() != null)
            sb.append("Pid: ").append(getPid()).append(",");
        if (getUuid() != null)
            sb.append("Uuid: ").append(getUuid()).append(",");
        if (getExecutablePath() != null)
            sb.append("ExecutablePath: ").append(getExecutablePath()).append(",");
        if (getEuid() != null)
            sb.append("Euid: ").append(getEuid()).append(",");
        if (getParentUuid() != null)
            sb.append("ParentUuid: ").append(getParentUuid());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LineageObject == false)
            return false;
        LineageObject other = (LineageObject) obj;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getNamespacePid() == null ^ this.getNamespacePid() == null)
            return false;
        if (other.getNamespacePid() != null && other.getNamespacePid().equals(this.getNamespacePid()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPid() == null ^ this.getPid() == null)
            return false;
        if (other.getPid() != null && other.getPid().equals(this.getPid()) == false)
            return false;
        if (other.getUuid() == null ^ this.getUuid() == null)
            return false;
        if (other.getUuid() != null && other.getUuid().equals(this.getUuid()) == false)
            return false;
        if (other.getExecutablePath() == null ^ this.getExecutablePath() == null)
            return false;
        if (other.getExecutablePath() != null && other.getExecutablePath().equals(this.getExecutablePath()) == false)
            return false;
        if (other.getEuid() == null ^ this.getEuid() == null)
            return false;
        if (other.getEuid() != null && other.getEuid().equals(this.getEuid()) == false)
            return false;
        if (other.getParentUuid() == null ^ this.getParentUuid() == null)
            return false;
        if (other.getParentUuid() != null && other.getParentUuid().equals(this.getParentUuid()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getNamespacePid() == null) ? 0 : getNamespacePid().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getPid() == null) ? 0 : getPid().hashCode());
        hashCode = prime * hashCode + ((getUuid() == null) ? 0 : getUuid().hashCode());
        hashCode = prime * hashCode + ((getExecutablePath() == null) ? 0 : getExecutablePath().hashCode());
        hashCode = prime * hashCode + ((getEuid() == null) ? 0 : getEuid().hashCode());
        hashCode = prime * hashCode + ((getParentUuid() == null) ? 0 : getParentUuid().hashCode());
        return hashCode;
    }

    @Override
    public LineageObject clone() {
        try {
            return (LineageObject) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.guardduty.model.transform.LineageObjectMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
