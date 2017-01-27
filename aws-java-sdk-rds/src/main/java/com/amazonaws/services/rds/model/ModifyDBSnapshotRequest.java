/*
 * Copyright 2012-2017 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/ModifyDBSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifyDBSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the DB snapshot to modify.
     * </p>
     */
    private String dBSnapshotIdentifier;
    /**
     * <p>
     * The engine version to update the DB snapshot to.
     * </p>
     */
    private String engineVersion;

    /**
     * <p>
     * The identifier of the DB snapshot to modify.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        The identifier of the DB snapshot to modify.
     */

    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB snapshot to modify.
     * </p>
     * 
     * @return The identifier of the DB snapshot to modify.
     */

    public String getDBSnapshotIdentifier() {
        return this.dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB snapshot to modify.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        The identifier of the DB snapshot to modify.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBSnapshotRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        setDBSnapshotIdentifier(dBSnapshotIdentifier);
        return this;
    }

    /**
     * <p>
     * The engine version to update the DB snapshot to.
     * </p>
     * 
     * @param engineVersion
     *        The engine version to update the DB snapshot to.
     */

    public void setEngineVersion(String engineVersion) {
        this.engineVersion = engineVersion;
    }

    /**
     * <p>
     * The engine version to update the DB snapshot to.
     * </p>
     * 
     * @return The engine version to update the DB snapshot to.
     */

    public String getEngineVersion() {
        return this.engineVersion;
    }

    /**
     * <p>
     * The engine version to update the DB snapshot to.
     * </p>
     * 
     * @param engineVersion
     *        The engine version to update the DB snapshot to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifyDBSnapshotRequest withEngineVersion(String engineVersion) {
        setEngineVersion(engineVersion);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: ").append(getDBSnapshotIdentifier()).append(",");
        if (getEngineVersion() != null)
            sb.append("EngineVersion: ").append(getEngineVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifyDBSnapshotRequest == false)
            return false;
        ModifyDBSnapshotRequest other = (ModifyDBSnapshotRequest) obj;
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        if (other.getEngineVersion() == null ^ this.getEngineVersion() == null)
            return false;
        if (other.getEngineVersion() != null && other.getEngineVersion().equals(this.getEngineVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        hashCode = prime * hashCode + ((getEngineVersion() == null) ? 0 : getEngineVersion().hashCode());
        return hashCode;
    }

    @Override
    public ModifyDBSnapshotRequest clone() {
        return (ModifyDBSnapshotRequest) super.clone();
    }

}
