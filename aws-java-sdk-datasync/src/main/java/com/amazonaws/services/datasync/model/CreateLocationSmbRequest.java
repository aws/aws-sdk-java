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
     * Specifies the name of the share exported by your SMB file server where DataSync will read or write data. You can
     * include a subdirectory in the share path (for example, <code>/path/to/subdirectory</code>). Make sure that other
     * SMB clients in your network can also mount this path.
     * </p>
     * <p>
     * To copy all data in the subdirectory, DataSync must be able to mount the SMB share and access all of its data.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >required permissions</a> for SMB locations.
     * </p>
     */
    private String subdirectory;
    /**
     * <p>
     * Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your DataSync agent will
     * mount.
     * </p>
     * <note>
     * <p>
     * You can't specify an IP version 6 (IPv6) address.
     * </p>
     * </note>
     */
    private String serverHostname;
    /**
     * <p>
     * Specifies the user that can mount and access the files, folders, and file metadata in your SMB file server.
     * </p>
     * <p>
     * For information about choosing a user with the right level of access for your transfer, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >required permissions</a> for SMB locations.
     * </p>
     */
    private String user;
    /**
     * <p>
     * Specifies the name of the Active Directory domain that your SMB file server belongs to.
     * </p>
     * <p>
     * If you have multiple Active Directory domains in your environment, configuring this parameter makes sure that
     * DataSync connects to the right file server.
     * </p>
     */
    private String domain;
    /**
     * <p>
     * Specifies the password of the user who can mount your SMB file server and has permission to access the files and
     * folders involved in your transfer.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >required permissions</a> for SMB locations.
     * </p>
     */
    private String password;
    /**
     * <p>
     * Specifies the DataSync agent (or agents) which you want to connect to your SMB file server. You specify an agent
     * by using its Amazon Resource Name (ARN).
     * </p>
     */
    private java.util.List<String> agentArns;
    /**
     * <p>
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     * </p>
     */
    private SmbMountOptions mountOptions;
    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your location.
     * </p>
     */
    private java.util.List<TagListEntry> tags;

    /**
     * <p>
     * Specifies the name of the share exported by your SMB file server where DataSync will read or write data. You can
     * include a subdirectory in the share path (for example, <code>/path/to/subdirectory</code>). Make sure that other
     * SMB clients in your network can also mount this path.
     * </p>
     * <p>
     * To copy all data in the subdirectory, DataSync must be able to mount the SMB share and access all of its data.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >required permissions</a> for SMB locations.
     * </p>
     * 
     * @param subdirectory
     *        Specifies the name of the share exported by your SMB file server where DataSync will read or write data.
     *        You can include a subdirectory in the share path (for example, <code>/path/to/subdirectory</code>). Make
     *        sure that other SMB clients in your network can also mount this path.</p>
     *        <p>
     *        To copy all data in the subdirectory, DataSync must be able to mount the SMB share and access all of its
     *        data. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     *        >required permissions</a> for SMB locations.
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * Specifies the name of the share exported by your SMB file server where DataSync will read or write data. You can
     * include a subdirectory in the share path (for example, <code>/path/to/subdirectory</code>). Make sure that other
     * SMB clients in your network can also mount this path.
     * </p>
     * <p>
     * To copy all data in the subdirectory, DataSync must be able to mount the SMB share and access all of its data.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >required permissions</a> for SMB locations.
     * </p>
     * 
     * @return Specifies the name of the share exported by your SMB file server where DataSync will read or write data.
     *         You can include a subdirectory in the share path (for example, <code>/path/to/subdirectory</code>). Make
     *         sure that other SMB clients in your network can also mount this path.</p>
     *         <p>
     *         To copy all data in the subdirectory, DataSync must be able to mount the SMB share and access all of its
     *         data. For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     *         >required permissions</a> for SMB locations.
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * Specifies the name of the share exported by your SMB file server where DataSync will read or write data. You can
     * include a subdirectory in the share path (for example, <code>/path/to/subdirectory</code>). Make sure that other
     * SMB clients in your network can also mount this path.
     * </p>
     * <p>
     * To copy all data in the subdirectory, DataSync must be able to mount the SMB share and access all of its data.
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >required permissions</a> for SMB locations.
     * </p>
     * 
     * @param subdirectory
     *        Specifies the name of the share exported by your SMB file server where DataSync will read or write data.
     *        You can include a subdirectory in the share path (for example, <code>/path/to/subdirectory</code>). Make
     *        sure that other SMB clients in your network can also mount this path.</p>
     *        <p>
     *        To copy all data in the subdirectory, DataSync must be able to mount the SMB share and access all of its
     *        data. For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     *        >required permissions</a> for SMB locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationSmbRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your DataSync agent will
     * mount.
     * </p>
     * <note>
     * <p>
     * You can't specify an IP version 6 (IPv6) address.
     * </p>
     * </note>
     * 
     * @param serverHostname
     *        Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your DataSync agent
     *        will mount.</p> <note>
     *        <p>
     *        You can't specify an IP version 6 (IPv6) address.
     *        </p>
     */

    public void setServerHostname(String serverHostname) {
        this.serverHostname = serverHostname;
    }

    /**
     * <p>
     * Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your DataSync agent will
     * mount.
     * </p>
     * <note>
     * <p>
     * You can't specify an IP version 6 (IPv6) address.
     * </p>
     * </note>
     * 
     * @return Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your DataSync
     *         agent will mount.</p> <note>
     *         <p>
     *         You can't specify an IP version 6 (IPv6) address.
     *         </p>
     */

    public String getServerHostname() {
        return this.serverHostname;
    }

    /**
     * <p>
     * Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your DataSync agent will
     * mount.
     * </p>
     * <note>
     * <p>
     * You can't specify an IP version 6 (IPv6) address.
     * </p>
     * </note>
     * 
     * @param serverHostname
     *        Specifies the Domain Name Service (DNS) name or IP address of the SMB file server that your DataSync agent
     *        will mount.</p> <note>
     *        <p>
     *        You can't specify an IP version 6 (IPv6) address.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationSmbRequest withServerHostname(String serverHostname) {
        setServerHostname(serverHostname);
        return this;
    }

    /**
     * <p>
     * Specifies the user that can mount and access the files, folders, and file metadata in your SMB file server.
     * </p>
     * <p>
     * For information about choosing a user with the right level of access for your transfer, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >required permissions</a> for SMB locations.
     * </p>
     * 
     * @param user
     *        Specifies the user that can mount and access the files, folders, and file metadata in your SMB file
     *        server.</p>
     *        <p>
     *        For information about choosing a user with the right level of access for your transfer, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     *        >required permissions</a> for SMB locations.
     */

    public void setUser(String user) {
        this.user = user;
    }

    /**
     * <p>
     * Specifies the user that can mount and access the files, folders, and file metadata in your SMB file server.
     * </p>
     * <p>
     * For information about choosing a user with the right level of access for your transfer, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >required permissions</a> for SMB locations.
     * </p>
     * 
     * @return Specifies the user that can mount and access the files, folders, and file metadata in your SMB file
     *         server.</p>
     *         <p>
     *         For information about choosing a user with the right level of access for your transfer, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     *         >required permissions</a> for SMB locations.
     */

    public String getUser() {
        return this.user;
    }

    /**
     * <p>
     * Specifies the user that can mount and access the files, folders, and file metadata in your SMB file server.
     * </p>
     * <p>
     * For information about choosing a user with the right level of access for your transfer, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >required permissions</a> for SMB locations.
     * </p>
     * 
     * @param user
     *        Specifies the user that can mount and access the files, folders, and file metadata in your SMB file
     *        server.</p>
     *        <p>
     *        For information about choosing a user with the right level of access for your transfer, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     *        >required permissions</a> for SMB locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationSmbRequest withUser(String user) {
        setUser(user);
        return this;
    }

    /**
     * <p>
     * Specifies the name of the Active Directory domain that your SMB file server belongs to.
     * </p>
     * <p>
     * If you have multiple Active Directory domains in your environment, configuring this parameter makes sure that
     * DataSync connects to the right file server.
     * </p>
     * 
     * @param domain
     *        Specifies the name of the Active Directory domain that your SMB file server belongs to. </p>
     *        <p>
     *        If you have multiple Active Directory domains in your environment, configuring this parameter makes sure
     *        that DataSync connects to the right file server.
     */

    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * <p>
     * Specifies the name of the Active Directory domain that your SMB file server belongs to.
     * </p>
     * <p>
     * If you have multiple Active Directory domains in your environment, configuring this parameter makes sure that
     * DataSync connects to the right file server.
     * </p>
     * 
     * @return Specifies the name of the Active Directory domain that your SMB file server belongs to. </p>
     *         <p>
     *         If you have multiple Active Directory domains in your environment, configuring this parameter makes sure
     *         that DataSync connects to the right file server.
     */

    public String getDomain() {
        return this.domain;
    }

    /**
     * <p>
     * Specifies the name of the Active Directory domain that your SMB file server belongs to.
     * </p>
     * <p>
     * If you have multiple Active Directory domains in your environment, configuring this parameter makes sure that
     * DataSync connects to the right file server.
     * </p>
     * 
     * @param domain
     *        Specifies the name of the Active Directory domain that your SMB file server belongs to. </p>
     *        <p>
     *        If you have multiple Active Directory domains in your environment, configuring this parameter makes sure
     *        that DataSync connects to the right file server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationSmbRequest withDomain(String domain) {
        setDomain(domain);
        return this;
    }

    /**
     * <p>
     * Specifies the password of the user who can mount your SMB file server and has permission to access the files and
     * folders involved in your transfer.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >required permissions</a> for SMB locations.
     * </p>
     * 
     * @param password
     *        Specifies the password of the user who can mount your SMB file server and has permission to access the
     *        files and folders involved in your transfer.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     *        >required permissions</a> for SMB locations.
     */

    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * <p>
     * Specifies the password of the user who can mount your SMB file server and has permission to access the files and
     * folders involved in your transfer.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >required permissions</a> for SMB locations.
     * </p>
     * 
     * @return Specifies the password of the user who can mount your SMB file server and has permission to access the
     *         files and folders involved in your transfer.</p>
     *         <p>
     *         For more information, see <a href=
     *         "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     *         >required permissions</a> for SMB locations.
     */

    public String getPassword() {
        return this.password;
    }

    /**
     * <p>
     * Specifies the password of the user who can mount your SMB file server and has permission to access the files and
     * folders involved in your transfer.
     * </p>
     * <p>
     * For more information, see <a href=
     * "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     * >required permissions</a> for SMB locations.
     * </p>
     * 
     * @param password
     *        Specifies the password of the user who can mount your SMB file server and has permission to access the
     *        files and folders involved in your transfer.</p>
     *        <p>
     *        For more information, see <a href=
     *        "https://docs.aws.amazon.com/datasync/latest/userguide/create-smb-location.html#configuring-smb-permissions"
     *        >required permissions</a> for SMB locations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationSmbRequest withPassword(String password) {
        setPassword(password);
        return this;
    }

    /**
     * <p>
     * Specifies the DataSync agent (or agents) which you want to connect to your SMB file server. You specify an agent
     * by using its Amazon Resource Name (ARN).
     * </p>
     * 
     * @return Specifies the DataSync agent (or agents) which you want to connect to your SMB file server. You specify
     *         an agent by using its Amazon Resource Name (ARN).
     */

    public java.util.List<String> getAgentArns() {
        return agentArns;
    }

    /**
     * <p>
     * Specifies the DataSync agent (or agents) which you want to connect to your SMB file server. You specify an agent
     * by using its Amazon Resource Name (ARN).
     * </p>
     * 
     * @param agentArns
     *        Specifies the DataSync agent (or agents) which you want to connect to your SMB file server. You specify an
     *        agent by using its Amazon Resource Name (ARN).
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
     * Specifies the DataSync agent (or agents) which you want to connect to your SMB file server. You specify an agent
     * by using its Amazon Resource Name (ARN).
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAgentArns(java.util.Collection)} or {@link #withAgentArns(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param agentArns
     *        Specifies the DataSync agent (or agents) which you want to connect to your SMB file server. You specify an
     *        agent by using its Amazon Resource Name (ARN).
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
     * Specifies the DataSync agent (or agents) which you want to connect to your SMB file server. You specify an agent
     * by using its Amazon Resource Name (ARN).
     * </p>
     * 
     * @param agentArns
     *        Specifies the DataSync agent (or agents) which you want to connect to your SMB file server. You specify an
     *        agent by using its Amazon Resource Name (ARN).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationSmbRequest withAgentArns(java.util.Collection<String> agentArns) {
        setAgentArns(agentArns);
        return this;
    }

    /**
     * <p>
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     * </p>
     * 
     * @param mountOptions
     *        Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     */

    public void setMountOptions(SmbMountOptions mountOptions) {
        this.mountOptions = mountOptions;
    }

    /**
     * <p>
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     * </p>
     * 
     * @return Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     */

    public SmbMountOptions getMountOptions() {
        return this.mountOptions;
    }

    /**
     * <p>
     * Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     * </p>
     * 
     * @param mountOptions
     *        Specifies the version of the SMB protocol that DataSync uses to access your SMB file server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationSmbRequest withMountOptions(SmbMountOptions mountOptions) {
        setMountOptions(mountOptions);
        return this;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your location.
     * </p>
     * 
     * @return Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *         recommend creating at least a name tag for your location.
     */

    public java.util.List<TagListEntry> getTags() {
        return tags;
    }

    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your location.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your location.
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
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your location.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your location.
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
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your location.
     * </p>
     * 
     * @param tags
     *        Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     *        recommend creating at least a name tag for your location.
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
