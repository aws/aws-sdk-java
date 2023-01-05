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
 * Describes an Amazon FSx for NetApp ONTAP or Amazon FSx for OpenZFS volume.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/Volume" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Volume implements Serializable, Cloneable, StructuredPojo {

    private java.util.Date creationTime;

    private String fileSystemId;
    /**
     * <p>
     * The lifecycle status of the volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The volume is fully available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code> - The volume has been created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was unable to create the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The volume is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx hasn't started creating the volume.
     * </p>
     * </li>
     * </ul>
     */
    private String lifecycle;
    /**
     * <p>
     * The name of the volume.
     * </p>
     */
    private String name;

    private OntapVolumeConfiguration ontapConfiguration;

    private String resourceARN;

    private java.util.List<Tag> tags;
    /**
     * <p>
     * The system-generated, unique ID of the volume.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The type of the volume.
     * </p>
     */
    private String volumeType;
    /**
     * <p>
     * The reason why the volume lifecycle status changed.
     * </p>
     */
    private LifecycleTransitionReason lifecycleTransitionReason;
    /**
     * <p>
     * A list of administrative actions for the volume that are in process or waiting to be processed. Administrative
     * actions describe changes to the volume that you have initiated using the <code>UpdateVolume</code> action.
     * </p>
     */
    private java.util.List<AdministrativeAction> administrativeActions;
    /**
     * <p>
     * The configuration of an Amazon FSx for OpenZFS volume.
     * </p>
     */
    private OpenZFSVolumeConfiguration openZFSConfiguration;

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

    public Volume withCreationTime(java.util.Date creationTime) {
        setCreationTime(creationTime);
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

    public Volume withFileSystemId(String fileSystemId) {
        setFileSystemId(fileSystemId);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The volume is fully available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code> - The volume has been created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was unable to create the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The volume is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx hasn't started creating the volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the volume.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The volume is fully available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - The volume has been created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon FSx is creating the new volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon FSx is deleting an existing volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx was unable to create the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - The volume is in a failed but recoverable state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx hasn't started creating the volume.
     *        </p>
     *        </li>
     * @see VolumeLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The volume is fully available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code> - The volume has been created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was unable to create the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The volume is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx hasn't started creating the volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The lifecycle status of the volume.</p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>AVAILABLE</code> - The volume is fully available for use.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATED</code> - The volume has been created.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>CREATING</code> - Amazon FSx is creating the new volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>DELETING</code> - Amazon FSx is deleting an existing volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>FAILED</code> - Amazon FSx was unable to create the volume.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISCONFIGURED</code> - The volume is in a failed but recoverable state.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>PENDING</code> - Amazon FSx hasn't started creating the volume.
     *         </p>
     *         </li>
     * @see VolumeLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle status of the volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The volume is fully available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code> - The volume has been created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was unable to create the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The volume is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx hasn't started creating the volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the volume.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The volume is fully available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - The volume has been created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon FSx is creating the new volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon FSx is deleting an existing volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx was unable to create the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - The volume is in a failed but recoverable state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx hasn't started creating the volume.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeLifecycle
     */

    public Volume withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The lifecycle status of the volume.
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>AVAILABLE</code> - The volume is fully available for use.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATED</code> - The volume has been created.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>CREATING</code> - Amazon FSx is creating the new volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>DELETING</code> - Amazon FSx is deleting an existing volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>FAILED</code> - Amazon FSx was unable to create the volume.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISCONFIGURED</code> - The volume is in a failed but recoverable state.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>PENDING</code> - Amazon FSx hasn't started creating the volume.
     * </p>
     * </li>
     * </ul>
     * 
     * @param lifecycle
     *        The lifecycle status of the volume.</p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>AVAILABLE</code> - The volume is fully available for use.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATED</code> - The volume has been created.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>CREATING</code> - Amazon FSx is creating the new volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>DELETING</code> - Amazon FSx is deleting an existing volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>FAILED</code> - Amazon FSx was unable to create the volume.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISCONFIGURED</code> - The volume is in a failed but recoverable state.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>PENDING</code> - Amazon FSx hasn't started creating the volume.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeLifecycle
     */

    public Volume withLifecycle(VolumeLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * The name of the volume.
     * </p>
     * 
     * @param name
     *        The name of the volume.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the volume.
     * </p>
     * 
     * @return The name of the volume.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the volume.
     * </p>
     * 
     * @param name
     *        The name of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withName(String name) {
        setName(name);
        return this;
    }

    /**
     * @param ontapConfiguration
     */

    public void setOntapConfiguration(OntapVolumeConfiguration ontapConfiguration) {
        this.ontapConfiguration = ontapConfiguration;
    }

    /**
     * @return
     */

    public OntapVolumeConfiguration getOntapConfiguration() {
        return this.ontapConfiguration;
    }

    /**
     * @param ontapConfiguration
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withOntapConfiguration(OntapVolumeConfiguration ontapConfiguration) {
        setOntapConfiguration(ontapConfiguration);
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

    public Volume withResourceARN(String resourceARN) {
        setResourceARN(resourceARN);
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

    public Volume withTags(Tag... tags) {
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

    public Volume withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
        return this;
    }

    /**
     * <p>
     * The system-generated, unique ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The system-generated, unique ID of the volume.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The system-generated, unique ID of the volume.
     * </p>
     * 
     * @return The system-generated, unique ID of the volume.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The system-generated, unique ID of the volume.
     * </p>
     * 
     * @param volumeId
     *        The system-generated, unique ID of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * The type of the volume.
     * </p>
     * 
     * @param volumeType
     *        The type of the volume.
     * @see VolumeType
     */

    public void setVolumeType(String volumeType) {
        this.volumeType = volumeType;
    }

    /**
     * <p>
     * The type of the volume.
     * </p>
     * 
     * @return The type of the volume.
     * @see VolumeType
     */

    public String getVolumeType() {
        return this.volumeType;
    }

    /**
     * <p>
     * The type of the volume.
     * </p>
     * 
     * @param volumeType
     *        The type of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public Volume withVolumeType(String volumeType) {
        setVolumeType(volumeType);
        return this;
    }

    /**
     * <p>
     * The type of the volume.
     * </p>
     * 
     * @param volumeType
     *        The type of the volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeType
     */

    public Volume withVolumeType(VolumeType volumeType) {
        this.volumeType = volumeType.toString();
        return this;
    }

    /**
     * <p>
     * The reason why the volume lifecycle status changed.
     * </p>
     * 
     * @param lifecycleTransitionReason
     *        The reason why the volume lifecycle status changed.
     */

    public void setLifecycleTransitionReason(LifecycleTransitionReason lifecycleTransitionReason) {
        this.lifecycleTransitionReason = lifecycleTransitionReason;
    }

    /**
     * <p>
     * The reason why the volume lifecycle status changed.
     * </p>
     * 
     * @return The reason why the volume lifecycle status changed.
     */

    public LifecycleTransitionReason getLifecycleTransitionReason() {
        return this.lifecycleTransitionReason;
    }

    /**
     * <p>
     * The reason why the volume lifecycle status changed.
     * </p>
     * 
     * @param lifecycleTransitionReason
     *        The reason why the volume lifecycle status changed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withLifecycleTransitionReason(LifecycleTransitionReason lifecycleTransitionReason) {
        setLifecycleTransitionReason(lifecycleTransitionReason);
        return this;
    }

    /**
     * <p>
     * A list of administrative actions for the volume that are in process or waiting to be processed. Administrative
     * actions describe changes to the volume that you have initiated using the <code>UpdateVolume</code> action.
     * </p>
     * 
     * @return A list of administrative actions for the volume that are in process or waiting to be processed.
     *         Administrative actions describe changes to the volume that you have initiated using the
     *         <code>UpdateVolume</code> action.
     */

    public java.util.List<AdministrativeAction> getAdministrativeActions() {
        return administrativeActions;
    }

    /**
     * <p>
     * A list of administrative actions for the volume that are in process or waiting to be processed. Administrative
     * actions describe changes to the volume that you have initiated using the <code>UpdateVolume</code> action.
     * </p>
     * 
     * @param administrativeActions
     *        A list of administrative actions for the volume that are in process or waiting to be processed.
     *        Administrative actions describe changes to the volume that you have initiated using the
     *        <code>UpdateVolume</code> action.
     */

    public void setAdministrativeActions(java.util.Collection<AdministrativeAction> administrativeActions) {
        if (administrativeActions == null) {
            this.administrativeActions = null;
            return;
        }

        this.administrativeActions = new java.util.ArrayList<AdministrativeAction>(administrativeActions);
    }

    /**
     * <p>
     * A list of administrative actions for the volume that are in process or waiting to be processed. Administrative
     * actions describe changes to the volume that you have initiated using the <code>UpdateVolume</code> action.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdministrativeActions(java.util.Collection)} or
     * {@link #withAdministrativeActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param administrativeActions
     *        A list of administrative actions for the volume that are in process or waiting to be processed.
     *        Administrative actions describe changes to the volume that you have initiated using the
     *        <code>UpdateVolume</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withAdministrativeActions(AdministrativeAction... administrativeActions) {
        if (this.administrativeActions == null) {
            setAdministrativeActions(new java.util.ArrayList<AdministrativeAction>(administrativeActions.length));
        }
        for (AdministrativeAction ele : administrativeActions) {
            this.administrativeActions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of administrative actions for the volume that are in process or waiting to be processed. Administrative
     * actions describe changes to the volume that you have initiated using the <code>UpdateVolume</code> action.
     * </p>
     * 
     * @param administrativeActions
     *        A list of administrative actions for the volume that are in process or waiting to be processed.
     *        Administrative actions describe changes to the volume that you have initiated using the
     *        <code>UpdateVolume</code> action.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withAdministrativeActions(java.util.Collection<AdministrativeAction> administrativeActions) {
        setAdministrativeActions(administrativeActions);
        return this;
    }

    /**
     * <p>
     * The configuration of an Amazon FSx for OpenZFS volume.
     * </p>
     * 
     * @param openZFSConfiguration
     *        The configuration of an Amazon FSx for OpenZFS volume.
     */

    public void setOpenZFSConfiguration(OpenZFSVolumeConfiguration openZFSConfiguration) {
        this.openZFSConfiguration = openZFSConfiguration;
    }

    /**
     * <p>
     * The configuration of an Amazon FSx for OpenZFS volume.
     * </p>
     * 
     * @return The configuration of an Amazon FSx for OpenZFS volume.
     */

    public OpenZFSVolumeConfiguration getOpenZFSConfiguration() {
        return this.openZFSConfiguration;
    }

    /**
     * <p>
     * The configuration of an Amazon FSx for OpenZFS volume.
     * </p>
     * 
     * @param openZFSConfiguration
     *        The configuration of an Amazon FSx for OpenZFS volume.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Volume withOpenZFSConfiguration(OpenZFSVolumeConfiguration openZFSConfiguration) {
        setOpenZFSConfiguration(openZFSConfiguration);
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
        if (getCreationTime() != null)
            sb.append("CreationTime: ").append(getCreationTime()).append(",");
        if (getFileSystemId() != null)
            sb.append("FileSystemId: ").append(getFileSystemId()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getOntapConfiguration() != null)
            sb.append("OntapConfiguration: ").append(getOntapConfiguration()).append(",");
        if (getResourceARN() != null)
            sb.append("ResourceARN: ").append(getResourceARN()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getVolumeType() != null)
            sb.append("VolumeType: ").append(getVolumeType()).append(",");
        if (getLifecycleTransitionReason() != null)
            sb.append("LifecycleTransitionReason: ").append(getLifecycleTransitionReason()).append(",");
        if (getAdministrativeActions() != null)
            sb.append("AdministrativeActions: ").append(getAdministrativeActions()).append(",");
        if (getOpenZFSConfiguration() != null)
            sb.append("OpenZFSConfiguration: ").append(getOpenZFSConfiguration());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Volume == false)
            return false;
        Volume other = (Volume) obj;
        if (other.getCreationTime() == null ^ this.getCreationTime() == null)
            return false;
        if (other.getCreationTime() != null && other.getCreationTime().equals(this.getCreationTime()) == false)
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
        if (other.getOntapConfiguration() == null ^ this.getOntapConfiguration() == null)
            return false;
        if (other.getOntapConfiguration() != null && other.getOntapConfiguration().equals(this.getOntapConfiguration()) == false)
            return false;
        if (other.getResourceARN() == null ^ this.getResourceARN() == null)
            return false;
        if (other.getResourceARN() != null && other.getResourceARN().equals(this.getResourceARN()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getVolumeType() == null ^ this.getVolumeType() == null)
            return false;
        if (other.getVolumeType() != null && other.getVolumeType().equals(this.getVolumeType()) == false)
            return false;
        if (other.getLifecycleTransitionReason() == null ^ this.getLifecycleTransitionReason() == null)
            return false;
        if (other.getLifecycleTransitionReason() != null && other.getLifecycleTransitionReason().equals(this.getLifecycleTransitionReason()) == false)
            return false;
        if (other.getAdministrativeActions() == null ^ this.getAdministrativeActions() == null)
            return false;
        if (other.getAdministrativeActions() != null && other.getAdministrativeActions().equals(this.getAdministrativeActions()) == false)
            return false;
        if (other.getOpenZFSConfiguration() == null ^ this.getOpenZFSConfiguration() == null)
            return false;
        if (other.getOpenZFSConfiguration() != null && other.getOpenZFSConfiguration().equals(this.getOpenZFSConfiguration()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCreationTime() == null) ? 0 : getCreationTime().hashCode());
        hashCode = prime * hashCode + ((getFileSystemId() == null) ? 0 : getFileSystemId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getOntapConfiguration() == null) ? 0 : getOntapConfiguration().hashCode());
        hashCode = prime * hashCode + ((getResourceARN() == null) ? 0 : getResourceARN().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getVolumeType() == null) ? 0 : getVolumeType().hashCode());
        hashCode = prime * hashCode + ((getLifecycleTransitionReason() == null) ? 0 : getLifecycleTransitionReason().hashCode());
        hashCode = prime * hashCode + ((getAdministrativeActions() == null) ? 0 : getAdministrativeActions().hashCode());
        hashCode = prime * hashCode + ((getOpenZFSConfiguration() == null) ? 0 : getOpenZFSConfiguration().hashCode());
        return hashCode;
    }

    @Override
    public Volume clone() {
        try {
            return (Volume) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.fsx.model.transform.VolumeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
