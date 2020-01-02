/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * <p>
 * CreateLocationSmbRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationSmb" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocationSmbRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The subdirectory in the SMB file system that is used to read data from the SMB source location or write data to
     * the SMB destination. The SMB path should be a path that's exported by the SMB server, or a subdirectory of that
     * path. The path should be such that it can be mounted by other SMB clients in your network.
     * </p>
     * <note>
     * <p>
     * <code>Subdirectory</code> must be specified with forward slashes. For example <code>/path/to/folder</code>.
     * </p>
     * </note>
     * <p>
     * To transfer all the data in the folder you specified, DataSync needs to have permissions to mount the SMB share,
     * as well as to access all the data in that share. To ensure this, either ensure that the user/password specified
     * belongs to the user who can mount the share, and who has the appropriate permissions for all of the files and
     * directories that you want DataSync to access, or use credentials of a member of the Backup Operators group to
     * mount the share. Doing either enables the agent to access the data. For the agent to access directories, you must
     * additionally enable all execute access.
     * </p>
     */
    private String subdirectory;
    /**
     * <p>
     * The name of the SMB server. This value is the IP address or Domain Name Service (DNS) name of the SMB server. An
     * agent that is installed on-premises uses this hostname to mount the SMB server in a network.
     * </p>
     * <note>
     * <p>
     * This name must either be DNS-compliant or must be an IP version 4 (IPv4) address.
     * </p>
     * </note>
     */
    private String serverHostname;
    /**
     * <p>
     * The user who can mount the share, has the permissions to access files and folders in the SMB share.
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
     * The password of the user who can mount the share, has the permissions to access files and folders in the SMB
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
    /**
     * <p>
     * The mount options used by DataSync to access the SMB server.
     * </p>
     */
    private SmbMountOptions mountOptions;
    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     */
    private java.util.List<TagListEntry> tags;

    /**
     * <p>
     * The subdirectory in the SMB file system that is used to read data from the SMB source location or write data to
     * the SMB destination. The SMB path should be a path that's exported by the SMB server, or a subdirectory of that
     * path. The path should be such that it can be mounted by other SMB clients in your network.
     * </p>
     * <note>
     * <p>
     * <code>Subdirectory</code> must be specified with forward slashes. For example <code>/path/to/folder</code>.
     * </p>
     * </note>
     * <p>
     * To transfer all the data in the folder you specified, DataSync needs to have permissions to mount the SMB share,
     * as well as to access all the data in that share. To ensure this, either ensure that the user/password specified
     * belongs to the user who can mount the share, and who has the appropriate permissions for all of the files and
     * directories that you want DataSync to access, or use credentials of a member of the Backup Operators group to
     * mount the share. Doing either enables the agent to access the data. For the agent to access directories, you must
     * additionally enable all execute access.
     * </p>
     * 
     * @param subdirectory
     *        The subdirectory in the SMB file system that is used to read data from the SMB source location or write
     *        data to the SMB destination. The SMB path should be a path that's exported by the SMB server, or a
     *        subdirectory of that path. The path should be such that it can be mounted by other SMB clients in your
     *        network.</p> <note>
     *        <p>
     *        <code>Subdirectory</code> must be specified with forward slashes. For example <code>/path/to/folder</code>
     *        .
     *        </p>
     *        </note>
     *        <p>
     *        To transfer all the data in the folder you specified, DataSync needs to have permissions to mount the SMB
     *        share, as well as to access all the data in that share. To ensure this, either ensure that the
     *        user/password specified belongs to the user who can mount the share, and who has the appropriate
     *        permissions for all of the files and directories that you want DataSync to access, or use credentials of a
     *        member of the Backup Operators group to mount the share. Doing either enables the agent to access the
     *        data. For the agent to access directories, you must additionally enable all execute access.
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
     * <code>Subdirectory</code> must be specified with forward slashes. For example <code>/path/to/folder</code>.
     * </p>
     * </note>
     * <p>
     * To transfer all the data in the folder you specified, DataSync needs to have permissions to mount the SMB share,
     * as well as to access all the data in that share. To ensure this, either ensure that the user/password specified
     * belongs to the user who can mount the share, and who has the appropriate permissions for all of the files and
     * directories that you want DataSync to access, or use credentials of a member of the Backup Operators group to
     * mount the share. Doing either enables the agent to access the data. For the agent to access directories, you must
     * additionally enable all execute access.
     * </p>
     * 
     * @return The subdirectory in the SMB file system that is used to read data from the SMB source location or write
     *         data to the SMB destination. The SMB path should be a path that's exported by the SMB server, or a
     *         subdirectory of that path. The path should be such that it can be mounted by other SMB clients in your
     *         network.</p> <note>
     *         <p>
     *         <code>Subdirectory</code> must be specified with forward slashes. For example
     *         <code>/path/to/folder</code>.
     *         </p>
     *         </note>
     *         <p>
     *         To transfer all the data in the folder you specified, DataSync needs to have permissions to mount the SMB
     *         share, as well as to access all the data in that share. To ensure this, either ensure that the
     *         user/password specified belongs to the user who can mount the share, and who has the appropriate
     *         permissions for all of the files and directories that you want DataSync to access, or use credentials of
     *         a member of the Backup Operators group to mount the share. Doing either enables the agent to access the
     *         data. For the agent to access directories, you must additionally enable all execute access.
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
     * <code>Subdirectory</code> must be specified with forward slashes. For example <code>/path/to/folder</code>.
     * </p>
     * </note>
     * <p>
     * To transfer all the data in the folder you specified, DataSync needs to have permissions to mount the SMB share,
     * as well as to access all the data in that share. To ensure this, either ensure that the user/password specified
     * belongs to the user who can mount the share, and who has the appropriate permissions for all of the files and
     * directories that you want DataSync to access, or use credentials of a member of the Backup Operators group to
     * mount the share. Doing either enables the agent to access the data. For the agent to access directories, you must
     * additionally enable all execute access.
     * </p>
     * 
     * @param subdirectory
     *        The subdirectory in the SMB file system that is used to read data from the SMB source location or write
     *        data to the SMB destination. The SMB path should be a path that's exported by the SMB server, or a
     *        subdirectory of that path. The path should be such that it can be mounted by other SMB clients in your
     *        network.</p> <note>
     *        <p>
     *        <code>Subdirectory</code> must be specified with forward slashes. For example <code>/path/to/folder</code>
     *        .
     *        </p>
     *        </note>
     *        <p>
     *        To transfer all the data in the folder you specified, DataSync needs to have permissions to mount the SMB
     *        share, as well as to access all the data in that share. To ensure this, either ensure that the
     *        user/password specified belongs to the user who can mount the share, and who has the appropriate
     *        permissions for all of the files and directories that you want DataSync to access, or use credentials of a
     *        member of the Backup Operators group to mount the share. Doing either enables the agent to access the
     *        data. For the agent to access directories, you must additionally enable all execute access.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationSmbRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * The name of the SMB server. This value is the IP address or Domain Name Service (DNS) name of the SMB server. An
     * agent that is installed on-premises uses this hostname to mount the SMB server in a network.
     * </p>
     * <note>
     * <p>
     * This name must either be DNS-compliant or must be an IP version 4 (IPv4) address.
     * </p>
     * </note>
     * 
     * @param serverHostname
     *        The name of the SMB server. This value is the IP address or Domain Name Service (DNS) name of the SMB
     *        server. An agent that is installed on-premises uses this hostname to mount the SMB server in a
     *        network.</p> <note>
     *        <p>
     *        This name must either be DNS-compliant or must be an IP version 4 (IPv4) address.
     *        </p>
     */

    public void setServerHostname(String serverHostname) {
        this.serverHostname = serverHostname;
    }

    /**
     * <p>
     * The name of the SMB server. This value is the IP address or Domain Name Service (DNS) name of the SMB server. An
     * agent that is installed on-premises uses this hostname to mount the SMB server in a network.
     * </p>
     * <note>
     * <p>
     * This name must either be DNS-compliant or must be an IP version 4 (IPv4) address.
     * </p>
     * </note>
     * 
     * @return The name of the SMB server. This value is the IP address or Domain Name Service (DNS) name of the SMB
     *         server. An agent that is installed on-premises uses this hostname to mount the SMB server in a
     *         network.</p> <note>
     *         <p>
     *         This name must either be DNS-compliant or must be an IP version 4 (IPv4) address.
     *         </p>
     */

    public String getServerHostname() {
        return this.serverHostname;
    }

    /**
     * <p>
     * The name of the SMB server. This value is the IP address or Domain Name Service (DNS) name of the SMB server. An
     * agent that is installed on-premises uses this hostname to mount the SMB server in a network.
     * </p>
     * <note>
     * <p>
     * This name must either be DNS-compliant or must be an IP version 4 (IPv4) address.
     * </p>
     * </note>
     * 
     * @param serverHostname
     *        The name of the SMB server. This value is the IP address or Domain Name Service (DNS) name of the SMB
     *        server. An agent that is installed on-premises uses this hostname to mount the SMB server in a
     *        network.</p> <note>
     *        <p>
     *        This name must either be DNS-compliant or must be an IP version 4 (IPv4) address.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationSmbRequest withServerHostname(String serverHostname) {
        setServerHostname(serverHostname);
        return this;
    }

    /**
     * <p>
     * The user who can mount the share, has the permissions to access files and folders in the SMB share.
     * </p>
     * 
     * @param user
     *        The user who can mount the share, has the permissions to access files and folders in the SMB share.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * The user who can mount the share, has the permissions to access files and folders in the SMB share.
     * </p>
     * 
     * @return The user who can mount the share, has the permissions to access files and folders in the SMB share.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * The user who can mount the share, has the permissions to access files and folders in the SMB share.
     * </p>
     * 
     * @param user
     *        The user who can mount the share, has the permissions to access files and folders in the SMB share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationSmbRequest withUser(String user) {
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

    public CreateLocationSmbRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * The password of the user who can mount the share, has the permissions to access files and folders in the SMB
     * share.
     * </p>
     * 
     * @param password
     *        The password of the user who can mount the share, has the permissions to access files and folders in the
     *        SMB share.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * The password of the user who can mount the share, has the permissions to access files and folders in the SMB
     * share.
     * </p>
     * 
     * @return The password of the user who can mount the share, has the permissions to access files and folders in the
     *         SMB share.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * The password of the user who can mount the share, has the permissions to access files and folders in the SMB
     * share.
     * </p>
     * 
     * @param password
     *        The password of the user who can mount the share, has the permissions to access files and folders in the
     *        SMB share.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationSmbRequest withPassword(String password) {
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

    public CreateLocationSmbRequest withAgentArns(String... agentArns) {
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

    public CreateLocationSmbRequest withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
        return this;
    }

    /**
     * <p>
     * The mount options used by DataSync to access the SMB server.
     * </p>
     * 
     * @param mountOptions
     *        The mount options used by DataSync to access the SMB server.
     */

    public void setMountOptions(SmbMountOptions mountOptions) {
        this.mountOptions = mountOptions;
    }

    /**
     * <p>
     * The mount options used by DataSync to access the SMB server.
     * </p>
     * 
     * @return The mount options used by DataSync to access the SMB server.
     */

    public SmbMountOptions getMountOptions() {
        return this.mountOptions;
    }

    /**
     * <p>
     * The mount options used by DataSync to access the SMB server.
     * </p>
     * 
     * @param mountOptions
     *        The mount options used by DataSync to access the SMB server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationSmbRequest withMountOptions(SmbMountOptions mountOptions) {
        setMountOptions(mountOptions);
        return this;
    }

    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     * 
     * @return The key-value pair that represents the tag that you want to add to the location. The value can be an
     *         empty string. We recommend using tags to name your resources.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     *        string. We recommend using tags to name your resources.
     */

    public void setTags(java.util.Collection<TagListEntry> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<TagListEntry>(tags);
    }

    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     *        string. We recommend using tags to name your resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationSmbRequest withTags(TagListEntry... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<TagListEntry>(tags.length));
        }
        for (TagListEntry ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     * string. We recommend using tags to name your resources.
     * </p>
     * 
     * @param tags
     *        The key-value pair that represents the tag that you want to add to the location. The value can be an empty
     *        string. We recommend using tags to name your resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationSmbRequest withTags(java.util.Collection<TagListEntry> tags) {
        setTags(tags);
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
        if (getSubdirectory() != null)
            sb.append("Subdirectory: ").append(getSubdirectory()).append(",");
        if (getServerHostname() != null)
            sb.append("ServerHostname: ").append(getServerHostname()).append(",");
        if (getUser() != null)
            sb.append("User: ").append(getUser()).append(",");
        if (getDomain() != null)
            sb.append("Domain: ").append(getDomain()).append(",");
        if (getPassword() != null)
            sb.append("Password: ").append("***Sensitive Data Redacted***").append(",");
        if (getAgentArns() != null)
            sb.append("AgentArns: ").append(getAgentArns()).append(",");
        if (getMountOptions() != null)
            sb.append("MountOptions: ").append(getMountOptions()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateLocationSmbRequest == false)
            return false;
        CreateLocationSmbRequest other = (CreateLocationSmbRequest) obj;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getServerHostname() == null ^ this.getServerHostname() == null)
            return false;
        if (other.getServerHostname() != null && other.getServerHostname().equals(this.getServerHostname()) == false)
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
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSubdirectory() == null) ? 0 : getSubdirectory().hashCode());
        hashCode = prime * hashCode + ((getServerHostname() == null) ? 0 : getServerHostname().hashCode());
        hashCode = prime * hashCode + ((getUser() == null) ? 0 : getUser().hashCode());
        hashCode = prime * hashCode + ((getDomain() == null) ? 0 : getDomain().hashCode());
        hashCode = prime * hashCode + ((getPassword() == null) ? 0 : getPassword().hashCode());
        hashCode = prime * hashCode + ((getAgentArns() == null) ? 0 : getAgentArns().hashCode());
        hashCode = prime * hashCode + ((getMountOptions() == null) ? 0 : getMountOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocationSmbRequest clone() {
        return (CreateLocationSmbRequest) super.clone();
    }

}
