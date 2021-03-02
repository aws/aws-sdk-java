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
package com.amazonaws.services.datasync.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/UpdateLocationSmb" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateLocationSmbRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB location to update.
     * </p>
     */
    private String locationArn;
    /**
     * <p>
     * The subdirectory in the SMB file system that is used to read data from the SMB source location or write data to
     * the SMB destination. The SMB path should be a path that's exported by the SMB server, or a subdirectory of that
     * path. The path should be such that it can be mounted by other SMB clients in your network.
     * </p>
     * <note>
     * <p>
     * <code>Subdirectory</code> must be specified with forward slashes. For example, <code>/path/to/folder</code>.
     * </p>
     * </note>
     * <p>
     * To transfer all the data in the folder that you specified, DataSync must have permissions to mount the SMB share
     * and to access all the data in that share. To ensure this, do either of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Ensure that the user/password specified belongs to the user who can mount the share and who has the appropriate
     * permissions for all of the files and directories that you want DataSync to access.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use credentials of a member of the Backup Operators group to mount the share.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Doing either of these options enables the agent to access the data. For the agent to access directories, you must
     * also enable all execute access.
     * </p>
     */
    private String subdirectory;
    /**
     * <p>
     * The user who can mount the share has the permissions to access files and folders in the SMB share.
     * </p>
     */
    private String user;
    /**
     * <p>
     * The name of the Windows domain that the SMB server belongs to.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * The password of the user who can mount the share has the permissions to access files and folders in the SMB
     * share.
     * </p>
     */
    private String password;
    /**
     * <p>
     * The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     * </p>
     */
    private java.util.List<String> agentArns;

    private SmbMountOptions mountOptions;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB location to update.
     * </p>
     * 
     * @param locationArn
     *        The Amazon Resource Name (ARN) of the SMB location to update.
     */

    public void setLocationArn(String locationArn) {
        this.locationArn = locationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB location to update.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the SMB location to update.
     */

    public String getLocationArn() {
        return this.locationArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the SMB location to update.
     * </p>
     * 
     * @param locationArn
     *        The Amazon Resource Name (ARN) of the SMB location to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationSmbRequest withLocationArn(String locationArn) {
        setLocationArn(locationArn);
        return this;
    }

    /**
     * <p>
     * The subdirectory in the SMB file system that is used to read data from the SMB source location or write data to
     * the SMB destination. The SMB path should be a path that's exported by the SMB server, or a subdirectory of that
     * path. The path should be such that it can be mounted by other SMB clients in your network.
     * </p>
     * <note>
     * <p>
     * <code>Subdirectory</code> must be specified with forward slashes. For example, <code>/path/to/folder</code>.
     * </p>
     * </note>
     * <p>
     * To transfer all the data in the folder that you specified, DataSync must have permissions to mount the SMB share
     * and to access all the data in that share. To ensure this, do either of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Ensure that the user/password specified belongs to the user who can mount the share and who has the appropriate
     * permissions for all of the files and directories that you want DataSync to access.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use credentials of a member of the Backup Operators group to mount the share.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Doing either of these options enables the agent to access the data. For the agent to access directories, you must
     * also enable all execute access.
     * </p>
     * 
     * @param subdirectory
     *        The subdirectory in the SMB file system that is used to read data from the SMB source location or write
     *        data to the SMB destination. The SMB path should be a path that's exported by the SMB server, or a
     *        subdirectory of that path. The path should be such that it can be mounted by other SMB clients in your
     *        network.</p> <note>
     *        <p>
     *        <code>Subdirectory</code> must be specified with forward slashes. For example,
     *        <code>/path/to/folder</code>.
     *        </p>
     *        </note>
     *        <p>
     *        To transfer all the data in the folder that you specified, DataSync must have permissions to mount the SMB
     *        share and to access all the data in that share. To ensure this, do either of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Ensure that the user/password specified belongs to the user who can mount the share and who has the
     *        appropriate permissions for all of the files and directories that you want DataSync to access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use credentials of a member of the Backup Operators group to mount the share.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Doing either of these options enables the agent to access the data. For the agent to access directories,
     *        you must also enable all execute access.
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * The subdirectory in the SMB file system that is used to read data from the SMB source location or write data to
     * the SMB destination. The SMB path should be a path that's exported by the SMB server, or a subdirectory of that
     * path. The path should be such that it can be mounted by other SMB clients in your network.
     * </p>
     * <note>
     * <p>
     * <code>Subdirectory</code> must be specified with forward slashes. For example, <code>/path/to/folder</code>.
     * </p>
     * </note>
     * <p>
     * To transfer all the data in the folder that you specified, DataSync must have permissions to mount the SMB share
     * and to access all the data in that share. To ensure this, do either of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Ensure that the user/password specified belongs to the user who can mount the share and who has the appropriate
     * permissions for all of the files and directories that you want DataSync to access.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use credentials of a member of the Backup Operators group to mount the share.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Doing either of these options enables the agent to access the data. For the agent to access directories, you must
     * also enable all execute access.
     * </p>
     * 
     * @return The subdirectory in the SMB file system that is used to read data from the SMB source location or write
     *         data to the SMB destination. The SMB path should be a path that's exported by the SMB server, or a
     *         subdirectory of that path. The path should be such that it can be mounted by other SMB clients in your
     *         network.</p> <note>
     *         <p>
     *         <code>Subdirectory</code> must be specified with forward slashes. For example,
     *         <code>/path/to/folder</code>.
     *         </p>
     *         </note>
     *         <p>
     *         To transfer all the data in the folder that you specified, DataSync must have permissions to mount the
     *         SMB share and to access all the data in that share. To ensure this, do either of the following:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         Ensure that the user/password specified belongs to the user who can mount the share and who has the
     *         appropriate permissions for all of the files and directories that you want DataSync to access.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         Use credentials of a member of the Backup Operators group to mount the share.
     *         </p>
     *         </li>
     *         </ul>
     *         <p>
     *         Doing either of these options enables the agent to access the data. For the agent to access directories,
     *         you must also enable all execute access.
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * The subdirectory in the SMB file system that is used to read data from the SMB source location or write data to
     * the SMB destination. The SMB path should be a path that's exported by the SMB server, or a subdirectory of that
     * path. The path should be such that it can be mounted by other SMB clients in your network.
     * </p>
     * <note>
     * <p>
     * <code>Subdirectory</code> must be specified with forward slashes. For example, <code>/path/to/folder</code>.
     * </p>
     * </note>
     * <p>
     * To transfer all the data in the folder that you specified, DataSync must have permissions to mount the SMB share
     * and to access all the data in that share. To ensure this, do either of the following:
     * </p>
     * <ul>
     * <li>
     * <p>
     * Ensure that the user/password specified belongs to the user who can mount the share and who has the appropriate
     * permissions for all of the files and directories that you want DataSync to access.
     * </p>
     * </li>
     * <li>
     * <p>
     * Use credentials of a member of the Backup Operators group to mount the share.
     * </p>
     * </li>
     * </ul>
     * <p>
     * Doing either of these options enables the agent to access the data. For the agent to access directories, you must
     * also enable all execute access.
     * </p>
     * 
     * @param subdirectory
     *        The subdirectory in the SMB file system that is used to read data from the SMB source location or write
     *        data to the SMB destination. The SMB path should be a path that's exported by the SMB server, or a
     *        subdirectory of that path. The path should be such that it can be mounted by other SMB clients in your
     *        network.</p> <note>
     *        <p>
     *        <code>Subdirectory</code> must be specified with forward slashes. For example,
     *        <code>/path/to/folder</code>.
     *        </p>
     *        </note>
     *        <p>
     *        To transfer all the data in the folder that you specified, DataSync must have permissions to mount the SMB
     *        share and to access all the data in that share. To ensure this, do either of the following:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        Ensure that the user/password specified belongs to the user who can mount the share and who has the
     *        appropriate permissions for all of the files and directories that you want DataSync to access.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        Use credentials of a member of the Backup Operators group to mount the share.
     *        </p>
     *        </li>
     *        </ul>
     *        <p>
     *        Doing either of these options enables the agent to access the data. For the agent to access directories,
     *        you must also enable all execute access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationSmbRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * The user who can mount the share has the permissions to access files and folders in the SMB share.
     * </p>
     * 
     * @param user
     *        The user who can mount the share has the permissions to access files and folders in the SMB share.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * The user who can mount the share has the permissions to access files and folders in the SMB share.
     * </p>
     * 
     * @return The user who can mount the share has the permissions to access files and folders in the SMB share.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user who can mount the share has the permissions to access files and folders in the SMB share.
     * </p>
     * 
     * @param user
     *        The user who can mount the share has the permissions to access files and folders in the SMB share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationSmbRequest withUser(String user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * The name of the Windows domain that the SMB server belongs to.
     * </p>
     * 
     * @param domain
     *        The name of the Windows domain that the SMB server belongs to.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * The name of the Windows domain that the SMB server belongs to.
     * </p>
     * 
     * @return The name of the Windows domain that the SMB server belongs to.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * The name of the Windows domain that the SMB server belongs to.
     * </p>
     * 
     * @param domain
     *        The name of the Windows domain that the SMB server belongs to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationSmbRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The password of the user who can mount the share has the permissions to access files and folders in the SMB
     * share.
     * </p>
     * 
     * @param password
     *        The password of the user who can mount the share has the permissions to access files and folders in the
     *        SMB share.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password of the user who can mount the share has the permissions to access files and folders in the SMB
     * share.
     * </p>
     * 
     * @return The password of the user who can mount the share has the permissions to access files and folders in the
     *         SMB share.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password of the user who can mount the share has the permissions to access files and folders in the SMB
     * share.
     * </p>
     * 
     * @param password
     *        The password of the user who can mount the share has the permissions to access files and folders in the
     *        SMB share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationSmbRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     * </p>
     * 
     * @return The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     */

    public java.util.List<String> getAgentArns() {
        return agentArns;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     * </p>
     * 
     * @param agentArns
     *        The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     */

    public void setAgentArns(java.util.Collection<String> agentArns) {
        if (agentArns == null) {
            this.agentArns = null;
            return;
        }

        this.agentArns = new java.util.ArrayList<String>(agentArns);
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentArns(java.util.Collection)} or {@link #withAgentArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentArns
     *        The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationSmbRequest withAgentArns(String... agentArns) {
        if (this.agentArns == null) {
            setAgentArns(new java.util.ArrayList<String>(agentArns.length));
        }
        for (String ele : agentArns) {
            this.agentArns.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     * </p>
     * 
     * @param agentArns
     *        The Amazon Resource Names (ARNs) of agents to use for a Simple Message Block (SMB) location.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationSmbRequest withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
        return this;
    }

    /**
     * @param mountOptions
     */

    public void setMountOptions(SmbMountOptions mountOptions) {
        this.mountOptions = mountOptions;
    }

    /**
     * @return
     */

    public SmbMountOptions getMountOptions() {
        return this.mountOptions;
    }

    /**
     * @param mountOptions
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateLocationSmbRequest withMountOptions(SmbMountOptions mountOptions) {
        setMountOptions(mountOptions);
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
        if (getLocationArn() != null)
            sb.append("LocationArn: ").append(getLocationArn()).append(",");
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getAgentArns() != null)
            sb.append("AgentArns: ").append(getAgentArns()).append(",");
        if (getMountOptions() != null)
            sb.append("MountOptions: ").append(getMountOptions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateLocationSmbRequest == false)
            return false;
        UpdateLocationSmbRequest other = (UpdateLocationSmbRequest) obj;
        if (other.getLocationArn() == null ^ this.getLocationArn() == null)
            return false;
        if (other.getLocationArn() != null && other.getLocationArn().equals(this.getLocationArn()) == false)
            return false;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getUser() == null ^ this.getUser() == null)
            return false;
        if (other.getUser() != null && other.getUser().equals(this.getUser()) == false)
            return false;
        if (other.getDomain() == null ^ this.getDomain() == null)
            return false;
        if (other.getDomain() != null && other.getDomain().equals(this.getDomain()) == false)
            return false;
        if (other.getPassword() == null ^ this.getPassword() == null)
            return false;
        if (other.getPassword() != null && other.getPassword().equals(this.getPassword()) == false)
            return false;
        if (other.getAgentArns() == null ^ this.getAgentArns() == null)
            return false;
        if (other.getAgentArns() != null && other.getAgentArns().equals(this.getAgentArns()) == false)
            return false;
        if (other.getMountOptions() == null ^ this.getMountOptions() == null)
            return false;
        if (other.getMountOptions() != null && other.getMountOptions().equals(this.getMountOptions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getLocationArn() == null) ? 0 : getLocationArn().hashCode());
        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getAgentArns() == null) ? 0 : getAgentArns().hashCode());
        hashCode = prime * hashCode + ((getMountOptions() == null) ? 0 : getMountOptions().hashCode());
        return hashCode;
    }

    @Override
    public UpdateLocationSmbRequest clone() {
        return (UpdateLocationSmbRequest) super.clone();
    }

}
