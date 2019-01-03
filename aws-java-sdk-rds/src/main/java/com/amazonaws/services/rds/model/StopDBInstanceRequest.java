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
package com.amazonaws.services.rds.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/StopDBInstance" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class StopDBInstanceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The user-supplied instance identifier.
     * </p>
     */
    private String dBInstanceIdentifier;
    /**
     * <p>
     * The user-supplied instance identifier of the DB Snapshot created immediately before the DB instance is stopped.
     * </p>
     */
    private String dBSnapshotIdentifier;

    /**
     * <p>
     * The user-supplied instance identifier.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The user-supplied instance identifier.
     */

    public void setDBInstanceIdentifier(String dBInstanceIdentifier) {
        this.dBInstanceIdentifier = dBInstanceIdentifier;
    }

    /**
     * <p>
     * The user-supplied instance identifier.
     * </p>
     * 
     * @return The user-supplied instance identifier.
     */

    public String getDBInstanceIdentifier() {
        return this.dBInstanceIdentifier;
    }

    /**
     * <p>
     * The user-supplied instance identifier.
     * </p>
     * 
     * @param dBInstanceIdentifier
     *        The user-supplied instance identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDBInstanceRequest withDBInstanceIdentifier(String dBInstanceIdentifier) {
        setDBInstanceIdentifier(dBInstanceIdentifier);
        return this;
    }

    /**
     * <p>
     * The user-supplied instance identifier of the DB Snapshot created immediately before the DB instance is stopped.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        The user-supplied instance identifier of the DB Snapshot created immediately before the DB instance is
     *        stopped.
     */

    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The user-supplied instance identifier of the DB Snapshot created immediately before the DB instance is stopped.
     * </p>
     * 
     * @return The user-supplied instance identifier of the DB Snapshot created immediately before the DB instance is
     *         stopped.
     */

    public String getDBSnapshotIdentifier() {
        return this.dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The user-supplied instance identifier of the DB Snapshot created immediately before the DB instance is stopped.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        The user-supplied instance identifier of the DB Snapshot created immediately before the DB instance is
     *        stopped.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public StopDBInstanceRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        setDBSnapshotIdentifier(dBSnapshotIdentifier);
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
        if (getDBInstanceIdentifier() != null)
            sb.append("DBInstanceIdentifier: ").append(getDBInstanceIdentifier()).append(",");
        if (getDBSnapshotIdentifier() != null)
            sb.append("DBSnapshotIdentifier: ").append(getDBSnapshotIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof StopDBInstanceRequest == false)
            return false;
        StopDBInstanceRequest other = (StopDBInstanceRequest) obj;
        if (other.getDBInstanceIdentifier() == null ^ this.getDBInstanceIdentifier() == null)
            return false;
        if (other.getDBInstanceIdentifier() != null && other.getDBInstanceIdentifier().equals(this.getDBInstanceIdentifier()) == false)
            return false;
        if (other.getDBSnapshotIdentifier() == null ^ this.getDBSnapshotIdentifier() == null)
            return false;
        if (other.getDBSnapshotIdentifier() != null && other.getDBSnapshotIdentifier().equals(this.getDBSnapshotIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBInstanceIdentifier() == null) ? 0 : getDBInstanceIdentifier().hashCode());
        hashCode = prime * hashCode + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public StopDBInstanceRequest clone() {
        return (StopDBInstanceRequest) super.clone();
    }

}
