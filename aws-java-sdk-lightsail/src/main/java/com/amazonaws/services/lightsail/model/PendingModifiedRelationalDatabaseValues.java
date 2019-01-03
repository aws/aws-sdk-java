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
package com.amazonaws.services.lightsail.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Describes a pending database value modification.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/PendingModifiedRelationalDatabaseValues"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PendingModifiedRelationalDatabaseValues implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The password for the master user of the database.
     * </p>
     */
    private String masterUserPassword;
    /**
     * <p>
     * The database engine version.
     * </p>
     */
    private String engineVersion;
    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled.
     * </p>
     */
    private Boolean backupRetentionEnabled;

    /**
     * <p>
     * The password for the master user of the database.
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master user of the database.
     */

    public void setMasterUserPassword(String masterUserPassword) {
        this.masterUserPassword = masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user of the database.
     * </p>
     * 
     * @return The password for the master user of the database.
     */

    public String getMasterUserPassword() {
        return this.masterUserPassword;
    }

    /**
     * <p>
     * The password for the master user of the database.
     * </p>
     * 
     * @param masterUserPassword
     *        The password for the master user of the database.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedRelationalDatabaseValues withMasterUserPassword(String masterUserPassword) {
        setMasterUserPassword(masterUserPassword);
        return this;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     * 
     * @param engineVersion
     *        The database engine version.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     * 
     * @return The database engine version.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The database engine version.
     * </p>
     * 
     * @param engineVersion
     *        The database engine version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedRelationalDatabaseValues withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled.
     * </p>
     * 
     * @param backupRetentionEnabled
     *        A Boolean value indicating whether automated backup retention is enabled.
     */

    public void setBackupRetentionEnabled(Boolean backupRetentionEnabled) {
        this.backupRetentionEnabled = backupRetentionEnabled;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled.
     * </p>
     * 
     * @return A Boolean value indicating whether automated backup retention is enabled.
     */

    public Boolean getBackupRetentionEnabled() {
        return this.backupRetentionEnabled;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled.
     * </p>
     * 
     * @param backupRetentionEnabled
     *        A Boolean value indicating whether automated backup retention is enabled.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PendingModifiedRelationalDatabaseValues withBackupRetentionEnabled(Boolean backupRetentionEnabled) {
        setBackupRetentionEnabled(backupRetentionEnabled);
        return this;
    }

    /**
     * <p>
     * A Boolean value indicating whether automated backup retention is enabled.
     * </p>
     * 
     * @return A Boolean value indicating whether automated backup retention is enabled.
     */

    public Boolean isBackupRetentionEnabled() {
        return this.backupRetentionEnabled;
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
        if (getMasterUserPassword() != null)
            sb.append("MasterUserPassword: ").append(getMasterUserPassword()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion()).append(",");
        if (getBackupRetentionEnabled() != null)
            sb.append("BackupRetentionEnabled: ").append(getBackupRetentionEnabled());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PendingModifiedRelationalDatabaseValues == false)
            return false;
        PendingModifiedRelationalDatabaseValues other = (PendingModifiedRelationalDatabaseValues) obj;
        if (other.getMasterUserPassword() == null ^ this.getMasterUserPassword() == null)
            return false;
        if (other.getMasterUserPassword() != null && other.getMasterUserPassword().equals(this.getMasterUserPassword()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        if (other.getBackupRetentionEnabled() == null ^ this.getBackupRetentionEnabled() == null)
            return false;
        if (other.getBackupRetentionEnabled() != null && other.getBackupRetentionEnabled().equals(this.getBackupRetentionEnabled()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMasterUserPassword() == null) ? 0 : getMasterUserPassword().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        hashCode = prime * hashCode + ((getBackupRetentionEnabled() == null) ? 0 : getBackupRetentionEnabled().hashCode());
        return hashCode;
    }

    @Override
    public PendingModifiedRelationalDatabaseValues clone() {
        try {
            return (PendingModifiedRelationalDatabaseValues) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.lightsail.model.transform.PendingModifiedRelationalDatabaseValuesMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
