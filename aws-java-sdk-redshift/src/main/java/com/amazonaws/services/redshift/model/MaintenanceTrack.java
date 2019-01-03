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
package com.amazonaws.services.redshift.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * Defines a maintenance track that determines which Amazon Redshift version to apply during a maintenance window. If
 * the value for <code>MaintenanceTrack</code> is <code>current</code>, the cluster is updated to the most recently
 * certified maintenance release. If the value is <code>trailing</code>, the cluster is updated to the previously
 * certified maintenance release.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/MaintenanceTrack" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class MaintenanceTrack implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the maintenance track. Possible values are <code>current</code> and <code>trailing</code>.
     * </p>
     */
    private String maintenanceTrackName;
    /**
     * <p>
     * The version number for the cluster release.
     * </p>
     */
    private String databaseVersion;
    /**
     * <p>
     * An array of <a>UpdateTarget</a> objects to update with the maintenance track.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<UpdateTarget> updateTargets;

    /**
     * <p>
     * The name of the maintenance track. Possible values are <code>current</code> and <code>trailing</code>.
     * </p>
     * 
     * @param maintenanceTrackName
     *        The name of the maintenance track. Possible values are <code>current</code> and <code>trailing</code>.
     */

    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track. Possible values are <code>current</code> and <code>trailing</code>.
     * </p>
     * 
     * @return The name of the maintenance track. Possible values are <code>current</code> and <code>trailing</code>.
     */

    public String getMaintenanceTrackName() {
        return this.maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the maintenance track. Possible values are <code>current</code> and <code>trailing</code>.
     * </p>
     * 
     * @param maintenanceTrackName
     *        The name of the maintenance track. Possible values are <code>current</code> and <code>trailing</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceTrack withMaintenanceTrackName(String maintenanceTrackName) {
        setMaintenanceTrackName(maintenanceTrackName);
        return this;
    }

    /**
     * <p>
     * The version number for the cluster release.
     * </p>
     * 
     * @param databaseVersion
     *        The version number for the cluster release.
     */

    public void setDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }

    /**
     * <p>
     * The version number for the cluster release.
     * </p>
     * 
     * @return The version number for the cluster release.
     */

    public String getDatabaseVersion() {
        return this.databaseVersion;
    }

    /**
     * <p>
     * The version number for the cluster release.
     * </p>
     * 
     * @param databaseVersion
     *        The version number for the cluster release.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceTrack withDatabaseVersion(String databaseVersion) {
        setDatabaseVersion(databaseVersion);
        return this;
    }

    /**
     * <p>
     * An array of <a>UpdateTarget</a> objects to update with the maintenance track.
     * </p>
     * 
     * @return An array of <a>UpdateTarget</a> objects to update with the maintenance track.
     */

    public java.util.List<UpdateTarget> getUpdateTargets() {
        if (updateTargets == null) {
            updateTargets = new com.amazonaws.internal.SdkInternalList<UpdateTarget>();
        }
        return updateTargets;
    }

    /**
     * <p>
     * An array of <a>UpdateTarget</a> objects to update with the maintenance track.
     * </p>
     * 
     * @param updateTargets
     *        An array of <a>UpdateTarget</a> objects to update with the maintenance track.
     */

    public void setUpdateTargets(java.util.Collection<UpdateTarget> updateTargets) {
        if (updateTargets == null) {
            this.updateTargets = null;
            return;
        }

        this.updateTargets = new com.amazonaws.internal.SdkInternalList<UpdateTarget>(updateTargets);
    }

    /**
     * <p>
     * An array of <a>UpdateTarget</a> objects to update with the maintenance track.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setUpdateTargets(java.util.Collection)} or {@link #withUpdateTargets(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param updateTargets
     *        An array of <a>UpdateTarget</a> objects to update with the maintenance track.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceTrack withUpdateTargets(UpdateTarget... updateTargets) {
        if (this.updateTargets == null) {
            setUpdateTargets(new com.amazonaws.internal.SdkInternalList<UpdateTarget>(updateTargets.length));
        }
        for (UpdateTarget ele : updateTargets) {
            this.updateTargets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of <a>UpdateTarget</a> objects to update with the maintenance track.
     * </p>
     * 
     * @param updateTargets
     *        An array of <a>UpdateTarget</a> objects to update with the maintenance track.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public MaintenanceTrack withUpdateTargets(java.util.Collection<UpdateTarget> updateTargets) {
        setUpdateTargets(updateTargets);
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
        if (getMaintenanceTrackName() != null)
            sb.append("MaintenanceTrackName: ").append(getMaintenanceTrackName()).append(",");
        if (getDatabaseVersion() != null)
            sb.append("DatabaseVersion: ").append(getDatabaseVersion()).append(",");
        if (getUpdateTargets() != null)
            sb.append("UpdateTargets: ").append(getUpdateTargets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof MaintenanceTrack == false)
            return false;
        MaintenanceTrack other = (MaintenanceTrack) obj;
        if (other.getMaintenanceTrackName() == null ^ this.getMaintenanceTrackName() == null)
            return false;
        if (other.getMaintenanceTrackName() != null && other.getMaintenanceTrackName().equals(this.getMaintenanceTrackName()) == false)
            return false;
        if (other.getDatabaseVersion() == null ^ this.getDatabaseVersion() == null)
            return false;
        if (other.getDatabaseVersion() != null && other.getDatabaseVersion().equals(this.getDatabaseVersion()) == false)
            return false;
        if (other.getUpdateTargets() == null ^ this.getUpdateTargets() == null)
            return false;
        if (other.getUpdateTargets() != null && other.getUpdateTargets().equals(this.getUpdateTargets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaintenanceTrackName() == null) ? 0 : getMaintenanceTrackName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseVersion() == null) ? 0 : getDatabaseVersion().hashCode());
        hashCode = prime * hashCode + ((getUpdateTargets() == null) ? 0 : getUpdateTargets().hashCode());
        return hashCode;
    }

    @Override
    public MaintenanceTrack clone() {
        try {
            return (MaintenanceTrack) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
