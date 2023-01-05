/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fsx.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes the Amazon FSx for NetApp ONTAP storage virtual machine (SVM) configuration.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/StorageVirtualMachine" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StorageVirtualMachine implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Describes the Microsoft Active Directory configuration to which the SVM is joined, if applicable.
     * </p>
     */
    private SvmActiveDirectoryConfiguration activeDirectoryConfiguration;

    private java.util.Date creationTime;
    /**
     * <p>
     * The endpoints that are used to access data or to manage the SVM using the NetApp ONTAP CLI, REST API, or NetApp
     * CloudManager. They are the <code>Iscsi</code>, <code>Management</code>, <code>Nfs</code>, and <code>Smb</code>
     * endpoints.
     * </p>
     */
    private SvmEndpoints endpoints;

    private String fileSystemId;
    /**
     * <p>
     * Describes the SVM's lifecycle status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The SVM is fully available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was unable to create the SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The SVM is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started creating the SVM.
     * </p>
     * </li>
     * </ul>
     */
    private String lifecycle;
    /**
     * <p>
     * The name of the SVM, if provisioned.
     * </p>
     */
    private String name;

    private String resourceARN;
    /**
     * <p>
     * The SVM's system generated unique ID.
     * </p>
     */
    private String storageVirtualMachineId;
    /**
     * <p>
     * Describes the SVM's subtype.
     * </p>
     */
    private String subtype;
    /**
     * <p>
     * The SVM's UUID (universally unique identifier).
     * </p>
     */
    private String uUID;

    private java.util.List<Tag> tags;
    /**
     * <p>
     * Describes why the SVM lifecycle state changed.
     * </p>
     */
    private LifecycleTransitionReason lifecycleTransitionReason;
    /**
     * <p>
     * The security style of the root volume of the SVM.
     * </p>
     */
    private String rootVolumeSecurityStyle;

    /**
     * <p>
     * Describes the Microsoft Active Directory configuration to which the SVM is joined, if applicable.
     * </p>
     * 
     * @param activeDirectoryConfiguration
     *        Describes the Microsoft Active Directory configuration to which the SVM is joined, if applicable.
     */

    public void setActiveDirectoryConfiguration(SvmActiveDirectoryConfiguration activeDirectoryConfiguration) {
        this.activeDirectoryConfiguration = activeDirectoryConfiguration;
    }

    /**
     * <p>
     * Describes the Microsoft Active Directory configuration to which the SVM is joined, if applicable.
     * </p>
     * 
     * @return Describes the Microsoft Active Directory configuration to which the SVM is joined, if applicable.
     */

    public SvmActiveDirectoryConfiguration getActiveDirectoryConfiguration() {
        return this.activeDirectoryConfiguration;
    }

    /**
     * <p>
     * Describes the Microsoft Active Directory configuration to which the SVM is joined, if applicable.
     * </p>
     * 
     * @param activeDirectoryConfiguration
     *        Describes the Microsoft Active Directory configuration to which the SVM is joined, if applicable.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageVirtualMachine withActiveDirectoryConfiguration(SvmActiveDirectoryConfiguration activeDirectoryConfiguration) {
        setActiveDirectoryConfiguration(activeDirectoryConfiguration);
        return this;
    }

    /**
     * @param creationTime
     */

    public void setCreationTime(java.util.Date creationTime) {
        this.creationTime = creationTime;
    }

    /**
     * @return
     */

    public java.util.Date getCreationTime() {
        return this.creationTime;
    }

    /**
     * @param creationTime
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageVirtualMachine withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
        return this;
    }

    /**
     * <p>
     * The endpoints that are used to access data or to manage the SVM using the NetApp ONTAP CLI, REST API, or NetApp
     * CloudManager. They are the <code>Iscsi</code>, <code>Management</code>, <code>Nfs</code>, and <code>Smb</code>
     * endpoints.
     * </p>
     * 
     * @param endpoints
     *        The endpoints that are used to access data or to manage the SVM using the NetApp ONTAP CLI, REST API, or
     *        NetApp CloudManager. They are the <code>Iscsi</code>, <code>Management</code>, <code>Nfs</code>, and
     *        <code>Smb</code> endpoints.
     */

    public void setEndpoints(SvmEndpoints endpoints) {
        this.endpoints = endpoints;
    }

    /**
     * <p>
     * The endpoints that are used to access data or to manage the SVM using the NetApp ONTAP CLI, REST API, or NetApp
     * CloudManager. They are the <code>Iscsi</code>, <code>Management</code>, <code>Nfs</code>, and <code>Smb</code>
     * endpoints.
     * </p>
     * 
     * @return The endpoints that are used to access data or to manage the SVM using the NetApp ONTAP CLI, REST API, or
     *         NetApp CloudManager. They are the <code>Iscsi</code>, <code>Management</code>, <code>Nfs</code>, and
     *         <code>Smb</code> endpoints.
     */

    public SvmEndpoints getEndpoints() {
        return this.endpoints;
    }

    /**
     * <p>
     * The endpoints that are used to access data or to manage the SVM using the NetApp ONTAP CLI, REST API, or NetApp
     * CloudManager. They are the <code>Iscsi</code>, <code>Management</code>, <code>Nfs</code>, and <code>Smb</code>
     * endpoints.
     * </p>
     * 
     * @param endpoints
     *        The endpoints that are used to access data or to manage the SVM using the NetApp ONTAP CLI, REST API, or
     *        NetApp CloudManager. They are the <code>Iscsi</code>, <code>Management</code>, <code>Nfs</code>, and
     *        <code>Smb</code> endpoints.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageVirtualMachine withEndpoints(SvmEndpoints endpoints) {
        setEndpoints(endpoints);
        return this;
    }

    /**
     * @param fileSystemId
     */

    public void setFileSystemId(String fileSystemId) {
        this.fileSystemId = fileSystemId;
    }

    /**
     * @return
     */

    public String getFileSystemId() {
        return this.fileSystemId;
    }

    /**
     * @param fileSystemId
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageVirtualMachine withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * Describes the SVM's lifecycle status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The SVM is fully available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was unable to create the SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The SVM is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started creating the SVM.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        Describes the SVM's lifecycle status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - The SVM is fully available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon FSx is creating the new SVM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon FSx is deleting an existing SVM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx was unable to create the SVM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - The SVM is in a failed but recoverable state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx has not started creating the SVM.
     *        </p>
     *        </li>
     * @see StorageVirtualMachineLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * Describes the SVM's lifecycle status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The SVM is fully available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was unable to create the SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The SVM is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started creating the SVM.
     * </p>
     * </li>
     * </ul>
     * 
     * @return Describes the SVM's lifecycle status.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>CREATED</code> - The SVM is fully available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - Amazon FSx is creating the new SVM.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - Amazon FSx is deleting an existing SVM.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - Amazon FSx was unable to create the SVM.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISCONFIGURED</code> - The SVM is in a failed but recoverable state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - Amazon FSx has not started creating the SVM.
     *         </p>
     *         </li>
     * @see StorageVirtualMachineLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * Describes the SVM's lifecycle status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The SVM is fully available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was unable to create the SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The SVM is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started creating the SVM.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        Describes the SVM's lifecycle status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - The SVM is fully available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon FSx is creating the new SVM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon FSx is deleting an existing SVM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx was unable to create the SVM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - The SVM is in a failed but recoverable state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx has not started creating the SVM.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageVirtualMachineLifecycle
     */

    public StorageVirtualMachine withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * Describes the SVM's lifecycle status.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>CREATED</code> - The SVM is fully available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was unable to create the SVM.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The SVM is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx has not started creating the SVM.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        Describes the SVM's lifecycle status.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - The SVM is fully available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon FSx is creating the new SVM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon FSx is deleting an existing SVM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx was unable to create the SVM.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - The SVM is in a failed but recoverable state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx has not started creating the SVM.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageVirtualMachineLifecycle
     */

    public StorageVirtualMachine withLifecycle(StorageVirtualMachineLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * The name of the SVM, if provisioned.
     * </p>
     * 
     * @param name
     *        The name of the SVM, if provisioned.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the SVM, if provisioned.
     * </p>
     * 
     * @return The name of the SVM, if provisioned.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the SVM, if provisioned.
     * </p>
     * 
     * @param name
     *        The name of the SVM, if provisioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageVirtualMachine withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param resourceARN
     */

    public void setResourceARN(String resourceARN) {
        this.resourceARN = resourceARN;
    }

    /**
     * @return
     */

    public String getResourceARN() {
        return this.resourceARN;
    }

    /**
     * @param resourceARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageVirtualMachine withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
        return this;
    }

    /**
     * <p>
     * The SVM's system generated unique ID.
     * </p>
     * 
     * @param storageVirtualMachineId
     *        The SVM's system generated unique ID.
     */

    public void setStorageVirtualMachineId(String storageVirtualMachineId) {
        this.storageVirtualMachineId = storageVirtualMachineId;
    }

    /**
     * <p>
     * The SVM's system generated unique ID.
     * </p>
     * 
     * @return The SVM's system generated unique ID.
     */

    public String getStorageVirtualMachineId() {
        return this.storageVirtualMachineId;
    }

    /**
     * <p>
     * The SVM's system generated unique ID.
     * </p>
     * 
     * @param storageVirtualMachineId
     *        The SVM's system generated unique ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageVirtualMachine withStorageVirtualMachineId(String storageVirtualMachineId) {
        setStorageVirtualMachineId(storageVirtualMachineId);
        return this;
    }

    /**
     * <p>
     * Describes the SVM's subtype.
     * </p>
     * 
     * @param subtype
     *        Describes the SVM's subtype.
     * @see StorageVirtualMachineSubtype
     */

    public void setSubtype(String subtype) {
        this.subtype = subtype;
    }

    /**
     * <p>
     * Describes the SVM's subtype.
     * </p>
     * 
     * @return Describes the SVM's subtype.
     * @see StorageVirtualMachineSubtype
     */

    public String getSubtype() {
        return this.subtype;
    }

    /**
     * <p>
     * Describes the SVM's subtype.
     * </p>
     * 
     * @param subtype
     *        Describes the SVM's subtype.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageVirtualMachineSubtype
     */

    public StorageVirtualMachine withSubtype(String subtype) {
        setSubtype(subtype);
        return this;
    }

    /**
     * <p>
     * Describes the SVM's subtype.
     * </p>
     * 
     * @param subtype
     *        Describes the SVM's subtype.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageVirtualMachineSubtype
     */

    public StorageVirtualMachine withSubtype(StorageVirtualMachineSubtype subtype) {
        this.subtype = subtype.toString();
        return this;
    }

    /**
     * <p>
     * The SVM's UUID (universally unique identifier).
     * </p>
     * 
     * @param uUID
     *        The SVM's UUID (universally unique identifier).
     */

    public void setUUID(String uUID) {
        this.uUID = uUID;
    }

    /**
     * <p>
     * The SVM's UUID (universally unique identifier).
     * </p>
     * 
     * @return The SVM's UUID (universally unique identifier).
     */

    public String getUUID() {
        return this.uUID;
    }

    /**
     * <p>
     * The SVM's UUID (universally unique identifier).
     * </p>
     * 
     * @param uUID
     *        The SVM's UUID (universally unique identifier).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageVirtualMachine withUUID(String uUID) {
        setUUID(uUID);
        return this;
    }

    /**
     * @return
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * @param tags
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageVirtualMachine withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * @param tags
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageVirtualMachine withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * Describes why the SVM lifecycle state changed.
     * </p>
     * 
     * @param lifecycleTransitionReason
     *        Describes why the SVM lifecycle state changed.
     */

    public void setLifecycleTransitionReason(LifecycleTransitionReason lifecycleTransitionReason) {
        this.lifecycleTransitionReason = lifecycleTransitionReason;
    }

    /**
     * <p>
     * Describes why the SVM lifecycle state changed.
     * </p>
     * 
     * @return Describes why the SVM lifecycle state changed.
     */

    public LifecycleTransitionReason getLifecycleTransitionReason() {
        return this.lifecycleTransitionReason;
    }

    /**
     * <p>
     * Describes why the SVM lifecycle state changed.
     * </p>
     * 
     * @param lifecycleTransitionReason
     *        Describes why the SVM lifecycle state changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StorageVirtualMachine withLifecycleTransitionReason(LifecycleTransitionReason lifecycleTransitionReason) {
        setLifecycleTransitionReason(lifecycleTransitionReason);
        return this;
    }

    /**
     * <p>
     * The security style of the root volume of the SVM.
     * </p>
     * 
     * @param rootVolumeSecurityStyle
     *        The security style of the root volume of the SVM.
     * @see StorageVirtualMachineRootVolumeSecurityStyle
     */

    public void setRootVolumeSecurityStyle(String rootVolumeSecurityStyle) {
        this.rootVolumeSecurityStyle = rootVolumeSecurityStyle;
    }

    /**
     * <p>
     * The security style of the root volume of the SVM.
     * </p>
     * 
     * @return The security style of the root volume of the SVM.
     * @see StorageVirtualMachineRootVolumeSecurityStyle
     */

    public String getRootVolumeSecurityStyle() {
        return this.rootVolumeSecurityStyle;
    }

    /**
     * <p>
     * The security style of the root volume of the SVM.
     * </p>
     * 
     * @param rootVolumeSecurityStyle
     *        The security style of the root volume of the SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageVirtualMachineRootVolumeSecurityStyle
     */

    public StorageVirtualMachine withRootVolumeSecurityStyle(String rootVolumeSecurityStyle) {
        setRootVolumeSecurityStyle(rootVolumeSecurityStyle);
        return this;
    }

    /**
     * <p>
     * The security style of the root volume of the SVM.
     * </p>
     * 
     * @param rootVolumeSecurityStyle
     *        The security style of the root volume of the SVM.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StorageVirtualMachineRootVolumeSecurityStyle
     */

    public StorageVirtualMachine withRootVolumeSecurityStyle(StorageVirtualMachineRootVolumeSecurityStyle rootVolumeSecurityStyle) {
        this.rootVolumeSecurityStyle = rootVolumeSecurityStyle.toString();
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
        if (getActiveDirectoryConfiguration() != null)
            sb.append("ActiveDirectoryConfiguration: ").append(getActiveDirectoryConfiguration()).append(",");
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getEndpoints() != null)
            sb.append("Endpoints: ").append(getEndpoints()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getStorageVirtualMachineId() != null)
            sb.append("StorageVirtualMachineId: ").append(getStorageVirtualMachineId()).append(",");
        if (getSubtype() != null)
            sb.append("Subtype: ").append(getSubtype()).append(",");
        if (getUUID() != null)
            sb.append("UUID: ").append(getUUID()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getLifecycleTransitionReason() != null)
            sb.append("LifecycleTransitionReason: ").append(getLifecycleTransitionReason()).append(",");
        if (getRootVolumeSecurityStyle() != null)
            sb.append("RootVolumeSecurityStyle: ").append(getRootVolumeSecurityStyle());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StorageVirtualMachine == false)
            return false;
        StorageVirtualMachine other = (StorageVirtualMachine) obj;
        if (other.getActiveDirectoryConfiguration() == null ^ this.getActiveDirectoryConfiguration() == null)
            return false;
        if (other.getActiveDirectoryConfiguration() != null && other.getActiveDirectoryConfiguration().equals(this.getActiveDirectoryConfiguration()) == false)
            return false;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
            return false;
        if (other.getEndpoints() == null ^ this.getEndpoints() == null)
            return false;
        if (other.getEndpoints() != null && other.getEndpoints().equals(this.getEndpoints()) == false)
            return false;
        if (other.getFileSystemId() == null ^ this.getFileSystemId() == null)
            return false;
        if (other.getFileSystemId() != null && other.getFileSystemId().equals(this.getFileSystemId()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getStorageVirtualMachineId() == null ^ this.getStorageVirtualMachineId() == null)
            return false;
        if (other.getStorageVirtualMachineId() != null && other.getStorageVirtualMachineId().equals(this.getStorageVirtualMachineId()) == false)
            return false;
        if (other.getSubtype() == null ^ this.getSubtype() == null)
            return false;
        if (other.getSubtype() != null && other.getSubtype().equals(this.getSubtype()) == false)
            return false;
        if (other.getUUID() == null ^ this.getUUID() == null)
            return false;
        if (other.getUUID() != null && other.getUUID().equals(this.getUUID()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getLifecycleTransitionReason() == null ^ this.getLifecycleTransitionReason() == null)
            return false;
        if (other.getLifecycleTransitionReason() != null && other.getLifecycleTransitionReason().equals(this.getLifecycleTransitionReason()) == false)
            return false;
        if (other.getRootVolumeSecurityStyle() == null ^ this.getRootVolumeSecurityStyle() == null)
            return false;
        if (other.getRootVolumeSecurityStyle() != null && other.getRootVolumeSecurityStyle().equals(this.getRootVolumeSecurityStyle()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getActiveDirectoryConfiguration() == null) ? 0 : getActiveDirectoryConfiguration().hashCode());
        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getEndpoints() == null) ? 0 : getEndpoints().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getStorageVirtualMachineId() == null) ? 0 : getStorageVirtualMachineId().hashCode());
        hashCode = prime * hashCode + ((getSubtype() == null) ? 0 : getSubtype().hashCode());
        hashCode = prime * hashCode + ((getUUID() == null) ? 0 : getUUID().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getLifecycleTransitionReason() == null) ? 0 : getLifecycleTransitionReason().hashCode());
        hashCode = prime * hashCode + ((getRootVolumeSecurityStyle() == null) ? 0 : getRootVolumeSecurityStyle().hashCode());
        return hashCode;
    }

    @Override
    public StorageVirtualMachine clone() {
        try {
            return (StorageVirtualMachine) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.StorageVirtualMachineMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
