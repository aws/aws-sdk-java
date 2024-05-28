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
 * Information about the observed process.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/guardduty-2017-11-28/ProcessDetails" target="_top">AWS API
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
     * The absolute path of the process executable file.
     * </p>
     */
    private String executablePath;
    /**
     * <p>
     * The <code>SHA256</code> hash of the process executable.
     * </p>
     */
    private String executableSha256;
    /**
     * <p>
     * The ID of the child process.
     * </p>
     */
    private Integer namespacePid;
    /**
     * <p>
     * The present working directory of the process.
     * </p>
     */
    private String pwd;
    /**
     * <p>
     * The ID of the process.
     * </p>
     */
    private Integer pid;
    /**
     * <p>
     * The time when the process started. This is in UTC format.
     * </p>
     */
    private java.util.Date startTime;
    /**
     * <p>
     * The unique ID assigned to the process by GuardDuty.
     * </p>
     */
    private String uuid;
    /**
     * <p>
     * The unique ID of the parent process. This ID is assigned to the parent process by GuardDuty.
     * </p>
     */
    private String parentUuid;
    /**
     * <p>
     * The user that executed the process.
     * </p>
     */
    private String user;
    /**
     * <p>
     * The unique ID of the user that executed the process.
     * </p>
     */
    private Integer userId;
    /**
     * <p>
     * The effective user ID of the user that executed the process.
     * </p>
     */
    private Integer euid;
    /**
     * <p>
     * Information about the process's lineage.
     * </p>
     */
    private java.util.List<LineageObject> lineage;

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

    public ProcessDetails withExecutablePath(String executablePath) {
        setExecutablePath(executablePath);
        return this;
    }

    /**
     * <p>
     * The <code>SHA256</code> hash of the process executable.
     * </p>
     * 
     * @param executableSha256
     *        The <code>SHA256</code> hash of the process executable.
     */

    public void setExecutableSha256(String executableSha256) {
        this.executableSha256 = executableSha256;
    }

    /**
     * <p>
     * The <code>SHA256</code> hash of the process executable.
     * </p>
     * 
     * @return The <code>SHA256</code> hash of the process executable.
     */

    public String getExecutableSha256() {
        return this.executableSha256;
    }

    /**
     * <p>
     * The <code>SHA256</code> hash of the process executable.
     * </p>
     * 
     * @param executableSha256
     *        The <code>SHA256</code> hash of the process executable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessDetails withExecutableSha256(String executableSha256) {
        setExecutableSha256(executableSha256);
        return this;
    }

    /**
     * <p>
     * The ID of the child process.
     * </p>
     * 
     * @param namespacePid
     *        The ID of the child process.
     */

    public void setNamespacePid(Integer namespacePid) {
        this.namespacePid = namespacePid;
    }

    /**
     * <p>
     * The ID of the child process.
     * </p>
     * 
     * @return The ID of the child process.
     */

    public Integer getNamespacePid() {
        return this.namespacePid;
    }

    /**
     * <p>
     * The ID of the child process.
     * </p>
     * 
     * @param namespacePid
     *        The ID of the child process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessDetails withNamespacePid(Integer namespacePid) {
        setNamespacePid(namespacePid);
        return this;
    }

    /**
     * <p>
     * The present working directory of the process.
     * </p>
     * 
     * @param pwd
     *        The present working directory of the process.
     */

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    /**
     * <p>
     * The present working directory of the process.
     * </p>
     * 
     * @return The present working directory of the process.
     */

    public String getPwd() {
        return this.pwd;
    }

    /**
     * <p>
     * The present working directory of the process.
     * </p>
     * 
     * @param pwd
     *        The present working directory of the process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessDetails withPwd(String pwd) {
        setPwd(pwd);
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

    public ProcessDetails withPid(Integer pid) {
        setPid(pid);
        return this;
    }

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

    public ProcessDetails withStartTime(java.util.Date startTime) {
        setStartTime(startTime);
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

    public ProcessDetails withUuid(String uuid) {
        setUuid(uuid);
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

    public ProcessDetails withParentUuid(String parentUuid) {
        setParentUuid(parentUuid);
        return this;
    }

    /**
     * <p>
     * The user that executed the process.
     * </p>
     * 
     * @param user
     *        The user that executed the process.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * The user that executed the process.
     * </p>
     * 
     * @return The user that executed the process.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user that executed the process.
     * </p>
     * 
     * @param user
     *        The user that executed the process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessDetails withUser(String user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * The unique ID of the user that executed the process.
     * </p>
     * 
     * @param userId
     *        The unique ID of the user that executed the process.
     */

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * <p>
     * The unique ID of the user that executed the process.
     * </p>
     * 
     * @return The unique ID of the user that executed the process.
     */

    public Integer getUserId() {
        return this.userId;
    }

    /**
     * <p>
     * The unique ID of the user that executed the process.
     * </p>
     * 
     * @param userId
     *        The unique ID of the user that executed the process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessDetails withUserId(Integer userId) {
        setUserId(userId);
        return this;
    }

    /**
     * <p>
     * The effective user ID of the user that executed the process.
     * </p>
     * 
     * @param euid
     *        The effective user ID of the user that executed the process.
     */

    public void setEuid(Integer euid) {
        this.euid = euid;
    }

    /**
     * <p>
     * The effective user ID of the user that executed the process.
     * </p>
     * 
     * @return The effective user ID of the user that executed the process.
     */

    public Integer getEuid() {
        return this.euid;
    }

    /**
     * <p>
     * The effective user ID of the user that executed the process.
     * </p>
     * 
     * @param euid
     *        The effective user ID of the user that executed the process.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessDetails withEuid(Integer euid) {
        setEuid(euid);
        return this;
    }

    /**
     * <p>
     * Information about the process's lineage.
     * </p>
     * 
     * @return Information about the process's lineage.
     */

    public java.util.List<LineageObject> getLineage() {
        return lineage;
    }

    /**
     * <p>
     * Information about the process's lineage.
     * </p>
     * 
     * @param lineage
     *        Information about the process's lineage.
     */

    public void setLineage(java.util.Collection<LineageObject> lineage) {
        if (lineage == null) {
            this.lineage = null;
            return;
        }

        this.lineage = new java.util.ArrayList<LineageObject>(lineage);
    }

    /**
     * <p>
     * Information about the process's lineage.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLineage(java.util.Collection)} or {@link #withLineage(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param lineage
     *        Information about the process's lineage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessDetails withLineage(LineageObject... lineage) {
        if (this.lineage == null) {
            setLineage(new java.util.ArrayList<LineageObject>(lineage.length));
        }
        for (LineageObject ele : lineage) {
            this.lineage.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Information about the process's lineage.
     * </p>
     * 
     * @param lineage
     *        Information about the process's lineage.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ProcessDetails withLineage(java.util.Collection<LineageObject> lineage) {
        setLineage(lineage);
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
        if (getExecutablePath() != null)
            sb.append("ExecutablePath: ").append(getExecutablePath()).append(",");
        if (getExecutableSha256() != null)
            sb.append("ExecutableSha256: ").append(getExecutableSha256()).append(",");
        if (getNamespacePid() != null)
            sb.append("NamespacePid: ").append(getNamespacePid()).append(",");
        if (getPwd() != null)
            sb.append("Pwd: ").append(getPwd()).append(",");
        if (getPid() != null)
            sb.append("Pid: ").append(getPid()).append(",");
        if (getStartTime() != null)
            sb.append("StartTime: ").append(getStartTime()).append(",");
        if (getUuid() != null)
            sb.append("Uuid: ").append(getUuid()).append(",");
        if (getParentUuid() != null)
            sb.append("ParentUuid: ").append(getParentUuid()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getUserId() != null)
            sb.append("UserId: ").append(getUserId()).append(",");
        if (getEuid() != null)
            sb.append("Euid: ").append(getEuid()).append(",");
        if (getLineage() != null)
            sb.append("Lineage: ").append(getLineage());
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
        if (other.getExecutablePath() == null ^ this.getExecutablePath() == null)
            return false;
        if (other.getExecutablePath() != null && other.getExecutablePath().equals(this.getExecutablePath()) == false)
            return false;
        if (other.getExecutableSha256() == null ^ this.getExecutableSha256() == null)
            return false;
        if (other.getExecutableSha256() != null && other.getExecutableSha256().equals(this.getExecutableSha256()) == false)
            return false;
        if (other.getNamespacePid() == null ^ this.getNamespacePid() == null)
            return false;
        if (other.getNamespacePid() != null && other.getNamespacePid().equals(this.getNamespacePid()) == false)
            return false;
        if (other.getPwd() == null ^ this.getPwd() == null)
            return false;
        if (other.getPwd() != null && other.getPwd().equals(this.getPwd()) == false)
            return false;
        if (other.getPid() == null ^ this.getPid() == null)
            return false;
        if (other.getPid() != null && other.getPid().equals(this.getPid()) == false)
            return false;
        if (other.getStartTime() == null ^ this.getStartTime() == null)
            return false;
        if (other.getStartTime() != null && other.getStartTime().equals(this.getStartTime()) == false)
            return false;
        if (other.getUuid() == null ^ this.getUuid() == null)
            return false;
        if (other.getUuid() != null && other.getUuid().equals(this.getUuid()) == false)
            return false;
        if (other.getParentUuid() == null ^ this.getParentUuid() == null)
            return false;
        if (other.getParentUuid() != null && other.getParentUuid().equals(this.getParentUuid()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getUserId() == null ^ this.getUserId() == null)
            return false;
        if (other.getUserId() != null && other.getUserId().equals(this.getUserId()) == false)
            return false;
        if (other.getEuid() == null ^ this.getEuid() == null)
            return false;
        if (other.getEuid() != null && other.getEuid().equals(this.getEuid()) == false)
            return false;
        if (other.getLineage() == null ^ this.getLineage() == null)
            return false;
        if (other.getLineage() != null && other.getLineage().equals(this.getLineage()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getExecutablePath() == null) ? 0 : getExecutablePath().hashCode());
        hashCode = prime * hashCode + ((getExecutableSha256() == null) ? 0 : getExecutableSha256().hashCode());
        hashCode = prime * hashCode + ((getNamespacePid() == null) ? 0 : getNamespacePid().hashCode());
        hashCode = prime * hashCode + ((getPwd() == null) ? 0 : getPwd().hashCode());
        hashCode = prime * hashCode + ((getPid() == null) ? 0 : getPid().hashCode());
        hashCode = prime * hashCode + ((getStartTime() == null) ? 0 : getStartTime().hashCode());
        hashCode = prime * hashCode + ((getUuid() == null) ? 0 : getUuid().hashCode());
        hashCode = prime * hashCode + ((getParentUuid() == null) ? 0 : getParentUuid().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getUserId() == null) ? 0 : getUserId().hashCode());
        hashCode = prime * hashCode + ((getEuid() == null) ? 0 : getEuid().hashCode());
        hashCode = prime * hashCode + ((getLineage() == null) ? 0 : getLineage().hashCode());
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
        com.amazonaws.services.guardduty.model.transform.ProcessDetailsMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
