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
 * A maintenance track that you can switch the current track to.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/UpdateTarget" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateTarget implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the new maintenance track.
     * </p>
     */
    private String maintenanceTrackName;
    /**
     * <p>
     * The cluster version for the new maintenance track.
     * </p>
     */
    private String databaseVersion;
    /**
     * <p>
     * A list of operations supported by the maintenance track.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<SupportedOperation> supportedOperations;

    /**
     * <p>
     * The name of the new maintenance track.
     * </p>
     * 
     * @param maintenanceTrackName
     *        The name of the new maintenance track.
     */

    public void setMaintenanceTrackName(String maintenanceTrackName) {
        this.maintenanceTrackName = maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the new maintenance track.
     * </p>
     * 
     * @return The name of the new maintenance track.
     */

    public String getMaintenanceTrackName() {
        return this.maintenanceTrackName;
    }

    /**
     * <p>
     * The name of the new maintenance track.
     * </p>
     * 
     * @param maintenanceTrackName
     *        The name of the new maintenance track.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTarget withMaintenanceTrackName(String maintenanceTrackName) {
        setMaintenanceTrackName(maintenanceTrackName);
        return this;
    }

    /**
     * <p>
     * The cluster version for the new maintenance track.
     * </p>
     * 
     * @param databaseVersion
     *        The cluster version for the new maintenance track.
     */

    public void setDatabaseVersion(String databaseVersion) {
        this.databaseVersion = databaseVersion;
    }

    /**
     * <p>
     * The cluster version for the new maintenance track.
     * </p>
     * 
     * @return The cluster version for the new maintenance track.
     */

    public String getDatabaseVersion() {
        return this.databaseVersion;
    }

    /**
     * <p>
     * The cluster version for the new maintenance track.
     * </p>
     * 
     * @param databaseVersion
     *        The cluster version for the new maintenance track.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTarget withDatabaseVersion(String databaseVersion) {
        setDatabaseVersion(databaseVersion);
        return this;
    }

    /**
     * <p>
     * A list of operations supported by the maintenance track.
     * </p>
     * 
     * @return A list of operations supported by the maintenance track.
     */

    public java.util.List<SupportedOperation> getSupportedOperations() {
        if (supportedOperations == null) {
            supportedOperations = new com.amazonaws.internal.SdkInternalList<SupportedOperation>();
        }
        return supportedOperations;
    }

    /**
     * <p>
     * A list of operations supported by the maintenance track.
     * </p>
     * 
     * @param supportedOperations
     *        A list of operations supported by the maintenance track.
     */

    public void setSupportedOperations(java.util.Collection<SupportedOperation> supportedOperations) {
        if (supportedOperations == null) {
            this.supportedOperations = null;
            return;
        }

        this.supportedOperations = new com.amazonaws.internal.SdkInternalList<SupportedOperation>(supportedOperations);
    }

    /**
     * <p>
     * A list of operations supported by the maintenance track.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSupportedOperations(java.util.Collection)} or {@link #withSupportedOperations(java.util.Collection)}
     * if you want to override the existing values.
     * </p>
     * 
     * @param supportedOperations
     *        A list of operations supported by the maintenance track.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTarget withSupportedOperations(SupportedOperation... supportedOperations) {
        if (this.supportedOperations == null) {
            setSupportedOperations(new com.amazonaws.internal.SdkInternalList<SupportedOperation>(supportedOperations.length));
        }
        for (SupportedOperation ele : supportedOperations) {
            this.supportedOperations.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of operations supported by the maintenance track.
     * </p>
     * 
     * @param supportedOperations
     *        A list of operations supported by the maintenance track.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateTarget withSupportedOperations(java.util.Collection<SupportedOperation> supportedOperations) {
        setSupportedOperations(supportedOperations);
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
        if (getSupportedOperations() != null)
            sb.append("SupportedOperations: ").append(getSupportedOperations());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateTarget == false)
            return false;
        UpdateTarget other = (UpdateTarget) obj;
        if (other.getMaintenanceTrackName() == null ^ this.getMaintenanceTrackName() == null)
            return false;
        if (other.getMaintenanceTrackName() != null && other.getMaintenanceTrackName().equals(this.getMaintenanceTrackName()) == false)
            return false;
        if (other.getDatabaseVersion() == null ^ this.getDatabaseVersion() == null)
            return false;
        if (other.getDatabaseVersion() != null && other.getDatabaseVersion().equals(this.getDatabaseVersion()) == false)
            return false;
        if (other.getSupportedOperations() == null ^ this.getSupportedOperations() == null)
            return false;
        if (other.getSupportedOperations() != null && other.getSupportedOperations().equals(this.getSupportedOperations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMaintenanceTrackName() == null) ? 0 : getMaintenanceTrackName().hashCode());
        hashCode = prime * hashCode + ((getDatabaseVersion() == null) ? 0 : getDatabaseVersion().hashCode());
        hashCode = prime * hashCode + ((getSupportedOperations() == null) ? 0 : getSupportedOperations().hashCode());
        return hashCode;
    }

    @Override
    public UpdateTarget clone() {
        try {
            return (UpdateTarget) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
