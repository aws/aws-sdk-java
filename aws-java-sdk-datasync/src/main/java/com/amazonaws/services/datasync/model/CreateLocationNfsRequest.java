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
 * CreateLocationNfsRequest
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/datasync-2018-11-09/CreateLocationNfs" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateLocationNfsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Specifies the export path in your NFS file server that you want DataSync to mount.
     * </p>
     * <p>
     * This path (or a subdirectory of the path) is where DataSync transfers data to or from. For information on
     * configuring an export for DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs">Accessing NFS
     * file servers</a>.
     * </p>
     */
    private String subdirectory;
    /**
     * <p>
     * Specifies the Domain Name System (DNS) name or IP version 4 address of the NFS file server that your DataSync
     * agent connects to.
     * </p>
     */
    private String serverHostname;
    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to your NFS file server.
     * </p>
     * <p>
     * You can specify more than one agent. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents for
     * transfers</a>.
     * </p>
     */
    private OnPremConfig onPremConfig;
    /**
     * <p>
     * Specifies the options that DataSync can use to mount your NFS file server.
     * </p>
     */
    private NfsMountOptions mountOptions;
    /**
     * <p>
     * Specifies labels that help you categorize, filter, and search for your Amazon Web Services resources. We
     * recommend creating at least a name tag for your location.
     * </p>
     */
    private java.util.List<TagListEntry> tags;

    /**
     * <p>
     * Specifies the export path in your NFS file server that you want DataSync to mount.
     * </p>
     * <p>
     * This path (or a subdirectory of the path) is where DataSync transfers data to or from. For information on
     * configuring an export for DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs">Accessing NFS
     * file servers</a>.
     * </p>
     * 
     * @param subdirectory
     *        Specifies the export path in your NFS file server that you want DataSync to mount.</p>
     *        <p>
     *        This path (or a subdirectory of the path) is where DataSync transfers data to or from. For information on
     *        configuring an export for DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs"
     *        >Accessing NFS file servers</a>.
     */

    public void setSubdirectory(String subdirectory) {
        this.subdirectory = subdirectory;
    }

    /**
     * <p>
     * Specifies the export path in your NFS file server that you want DataSync to mount.
     * </p>
     * <p>
     * This path (or a subdirectory of the path) is where DataSync transfers data to or from. For information on
     * configuring an export for DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs">Accessing NFS
     * file servers</a>.
     * </p>
     * 
     * @return Specifies the export path in your NFS file server that you want DataSync to mount.</p>
     *         <p>
     *         This path (or a subdirectory of the path) is where DataSync transfers data to or from. For information on
     *         configuring an export for DataSync, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs"
     *         >Accessing NFS file servers</a>.
     */

    public String getSubdirectory() {
        return this.subdirectory;
    }

    /**
     * <p>
     * Specifies the export path in your NFS file server that you want DataSync to mount.
     * </p>
     * <p>
     * This path (or a subdirectory of the path) is where DataSync transfers data to or from. For information on
     * configuring an export for DataSync, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs">Accessing NFS
     * file servers</a>.
     * </p>
     * 
     * @param subdirectory
     *        Specifies the export path in your NFS file server that you want DataSync to mount.</p>
     *        <p>
     *        This path (or a subdirectory of the path) is where DataSync transfers data to or from. For information on
     *        configuring an export for DataSync, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/create-nfs-location.html#accessing-nfs"
     *        >Accessing NFS file servers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationNfsRequest withSubdirectory(String subdirectory) {
        setSubdirectory(subdirectory);
        return this;
    }

    /**
     * <p>
     * Specifies the Domain Name System (DNS) name or IP version 4 address of the NFS file server that your DataSync
     * agent connects to.
     * </p>
     * 
     * @param serverHostname
     *        Specifies the Domain Name System (DNS) name or IP version 4 address of the NFS file server that your
     *        DataSync agent connects to.
     */

    public void setServerHostname(String serverHostname) {
        this.serverHostname = serverHostname;
    }

    /**
     * <p>
     * Specifies the Domain Name System (DNS) name or IP version 4 address of the NFS file server that your DataSync
     * agent connects to.
     * </p>
     * 
     * @return Specifies the Domain Name System (DNS) name or IP version 4 address of the NFS file server that your
     *         DataSync agent connects to.
     */

    public String getServerHostname() {
        return this.serverHostname;
    }

    /**
     * <p>
     * Specifies the Domain Name System (DNS) name or IP version 4 address of the NFS file server that your DataSync
     * agent connects to.
     * </p>
     * 
     * @param serverHostname
     *        Specifies the Domain Name System (DNS) name or IP version 4 address of the NFS file server that your
     *        DataSync agent connects to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationNfsRequest withServerHostname(String serverHostname) {
        setServerHostname(serverHostname);
        return this;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to your NFS file server.
     * </p>
     * <p>
     * You can specify more than one agent. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents for
     * transfers</a>.
     * </p>
     * 
     * @param onPremConfig
     *        Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to your NFS file
     *        server.</p>
     *        <p>
     *        You can specify more than one agent. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents
     *        for transfers</a>.
     */

    public void setOnPremConfig(OnPremConfig onPremConfig) {
        this.onPremConfig = onPremConfig;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to your NFS file server.
     * </p>
     * <p>
     * You can specify more than one agent. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents for
     * transfers</a>.
     * </p>
     * 
     * @return Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to your NFS file
     *         server.</p>
     *         <p>
     *         You can specify more than one agent. For more information, see <a
     *         href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents
     *         for transfers</a>.
     */

    public OnPremConfig getOnPremConfig() {
        return this.onPremConfig;
    }

    /**
     * <p>
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to your NFS file server.
     * </p>
     * <p>
     * You can specify more than one agent. For more information, see <a
     * href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents for
     * transfers</a>.
     * </p>
     * 
     * @param onPremConfig
     *        Specifies the Amazon Resource Name (ARN) of the DataSync agent that want to connect to your NFS file
     *        server.</p>
     *        <p>
     *        You can specify more than one agent. For more information, see <a
     *        href="https://docs.aws.amazon.com/datasync/latest/userguide/multiple-agents.html">Using multiple agents
     *        for transfers</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationNfsRequest withOnPremConfig(OnPremConfig onPremConfig) {
        setOnPremConfig(onPremConfig);
        return this;
    }

    /**
     * <p>
     * Specifies the options that DataSync can use to mount your NFS file server.
     * </p>
     * 
     * @param mountOptions
     *        Specifies the options that DataSync can use to mount your NFS file server.
     */

    public void setMountOptions(NfsMountOptions mountOptions) {
        this.mountOptions = mountOptions;
    }

    /**
     * <p>
     * Specifies the options that DataSync can use to mount your NFS file server.
     * </p>
     * 
     * @return Specifies the options that DataSync can use to mount your NFS file server.
     */

    public NfsMountOptions getMountOptions() {
        return this.mountOptions;
    }

    /**
     * <p>
     * Specifies the options that DataSync can use to mount your NFS file server.
     * </p>
     * 
     * @param mountOptions
     *        Specifies the options that DataSync can use to mount your NFS file server.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateLocationNfsRequest withMountOptions(NfsMountOptions mountOptions) {
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

    public CreateLocationNfsRequest withTags(TagListEntry... tags) {
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

    public CreateLocationNfsRequest withTags(java.util.Collection<TagListEntry> tags) {
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
        if (getOnPremConfig() != null)
            sb.append("OnPremConfig: ").append(getOnPremConfig()).append(",");
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

        if (obj instanceof CreateLocationNfsRequest == false)
            return false;
        CreateLocationNfsRequest other = (CreateLocationNfsRequest) obj;
        if (other.getSubdirectory() == null ^ this.getSubdirectory() == null)
            return false;
        if (other.getSubdirectory() != null && other.getSubdirectory().equals(this.getSubdirectory()) == false)
            return false;
        if (other.getServerHostname() == null ^ this.getServerHostname() == null)
            return false;
        if (other.getServerHostname() != null && other.getServerHostname().equals(this.getServerHostname()) == false)
            return false;
        if (other.getOnPremConfig() == null ^ this.getOnPremConfig() == null)
            return false;
        if (other.getOnPremConfig() != null && other.getOnPremConfig().equals(this.getOnPremConfig()) == false)
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
        hashCode = prime * hashCode + ((getOnPremConfig() == null) ? 0 : getOnPremConfig().hashCode());
        hashCode = prime * hashCode + ((getMountOptions() == null) ? 0 : getMountOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateLocationNfsRequest clone() {
        return (CreateLocationNfsRequest) super.clone();
    }

}
