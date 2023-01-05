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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fsx-2018-03-01/RestoreVolumeFromSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RestoreVolumeFromSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the volume that you restored.
     * </p>
     */
    private String volumeId;
    /**
     * <p>
     * The lifecycle state of the volume being restored.
     * </p>
     */
    private String lifecycle;
    /**
     * <p>
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system.
     * </p>
     */
    private java.util.List<AdministrativeAction> administrativeActions;

    /**
     * <p>
     * The ID of the volume that you restored.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume that you restored.
     */

    public void setVolumeId(String volumeId) {
        this.volumeId = volumeId;
    }

    /**
     * <p>
     * The ID of the volume that you restored.
     * </p>
     * 
     * @return The ID of the volume that you restored.
     */

    public String getVolumeId() {
        return this.volumeId;
    }

    /**
     * <p>
     * The ID of the volume that you restored.
     * </p>
     * 
     * @param volumeId
     *        The ID of the volume that you restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreVolumeFromSnapshotResult withVolumeId(String volumeId) {
        setVolumeId(volumeId);
        return this;
    }

    /**
     * <p>
     * The lifecycle state of the volume being restored.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle state of the volume being restored.
     * @see VolumeLifecycle
     */

    public void setLifecycle(String lifecycle) {
        this.lifecycle = lifecycle;
    }

    /**
     * <p>
     * The lifecycle state of the volume being restored.
     * </p>
     * 
     * @return The lifecycle state of the volume being restored.
     * @see VolumeLifecycle
     */

    public String getLifecycle() {
        return this.lifecycle;
    }

    /**
     * <p>
     * The lifecycle state of the volume being restored.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle state of the volume being restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeLifecycle
     */

    public RestoreVolumeFromSnapshotResult withLifecycle(String lifecycle) {
        setLifecycle(lifecycle);
        return this;
    }

    /**
     * <p>
     * The lifecycle state of the volume being restored.
     * </p>
     * 
     * @param lifecycle
     *        The lifecycle state of the volume being restored.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see VolumeLifecycle
     */

    public RestoreVolumeFromSnapshotResult withLifecycle(VolumeLifecycle lifecycle) {
        this.lifecycle = lifecycle.toString();
        return this;
    }

    /**
     * <p>
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system.
     * </p>
     * 
     * @return A list of administrative actions for the file system that are in process or waiting to be processed.
     *         Administrative actions describe changes to the Amazon FSx system.
     */

    public java.util.List<AdministrativeAction> getAdministrativeActions() {
        return administrativeActions;
    }

    /**
     * <p>
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system.
     * </p>
     * 
     * @param administrativeActions
     *        A list of administrative actions for the file system that are in process or waiting to be processed.
     *        Administrative actions describe changes to the Amazon FSx system.
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
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAdministrativeActions(java.util.Collection)} or
     * {@link #withAdministrativeActions(java.util.Collection)} if you want to override the existing values.
     * </p>
     * 
     * @param administrativeActions
     *        A list of administrative actions for the file system that are in process or waiting to be processed.
     *        Administrative actions describe changes to the Amazon FSx system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreVolumeFromSnapshotResult withAdministrativeActions(AdministrativeAction... administrativeActions) {
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
     * A list of administrative actions for the file system that are in process or waiting to be processed.
     * Administrative actions describe changes to the Amazon FSx system.
     * </p>
     * 
     * @param administrativeActions
     *        A list of administrative actions for the file system that are in process or waiting to be processed.
     *        Administrative actions describe changes to the Amazon FSx system.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RestoreVolumeFromSnapshotResult withAdministrativeActions(java.util.Collection<AdministrativeAction> administrativeActions) {
        setAdministrativeActions(administrativeActions);
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
        if (getVolumeId() != null)
            sb.append("VolumeId: ").append(getVolumeId()).append(",");
        if (getLifecycle() != null)
            sb.append("Lifecycle: ").append(getLifecycle()).append(",");
        if (getAdministrativeActions() != null)
            sb.append("AdministrativeActions: ").append(getAdministrativeActions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RestoreVolumeFromSnapshotResult == false)
            return false;
        RestoreVolumeFromSnapshotResult other = (RestoreVolumeFromSnapshotResult) obj;
        if (other.getVolumeId() == null ^ this.getVolumeId() == null)
            return false;
        if (other.getVolumeId() != null && other.getVolumeId().equals(this.getVolumeId()) == false)
            return false;
        if (other.getLifecycle() == null ^ this.getLifecycle() == null)
            return false;
        if (other.getLifecycle() != null && other.getLifecycle().equals(this.getLifecycle()) == false)
            return false;
        if (other.getAdministrativeActions() == null ^ this.getAdministrativeActions() == null)
            return false;
        if (other.getAdministrativeActions() != null && other.getAdministrativeActions().equals(this.getAdministrativeActions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getVolumeId() == null) ? 0 : getVolumeId().hashCode());
        hashCode = prime * hashCode + ((getLifecycle() == null) ? 0 : getLifecycle().hashCode());
        hashCode = prime * hashCode + ((getAdministrativeActions() == null) ? 0 : getAdministrativeActions().hashCode());
        return hashCode;
    }

    @Override
    public RestoreVolumeFromSnapshotResult clone() {
        try {
            return (RestoreVolumeFromSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
