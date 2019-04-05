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
package com.amazonaws.services.docdb.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input to <a>DeleteDBClusterSnapshot</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/docdb-2014-10-31/DeleteDBClusterSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDBClusterSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The identifier of the DB cluster snapshot to delete.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB cluster snapshot in the <code>available</code> state.
     * </p>
     */
    private String dBClusterSnapshotIdentifier;

    /**
     * <p>
     * The identifier of the DB cluster snapshot to delete.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB cluster snapshot in the <code>available</code> state.
     * </p>
     * 
     * @param dBClusterSnapshotIdentifier
     *        The identifier of the DB cluster snapshot to delete.</p>
     *        <p>
     *        Constraints: Must be the name of an existing DB cluster snapshot in the <code>available</code> state.
     */

    public void setDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        this.dBClusterSnapshotIdentifier = dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster snapshot to delete.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB cluster snapshot in the <code>available</code> state.
     * </p>
     * 
     * @return The identifier of the DB cluster snapshot to delete.</p>
     *         <p>
     *         Constraints: Must be the name of an existing DB cluster snapshot in the <code>available</code> state.
     */

    public String getDBClusterSnapshotIdentifier() {
        return this.dBClusterSnapshotIdentifier;
    }

    /**
     * <p>
     * The identifier of the DB cluster snapshot to delete.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB cluster snapshot in the <code>available</code> state.
     * </p>
     * 
     * @param dBClusterSnapshotIdentifier
     *        The identifier of the DB cluster snapshot to delete.</p>
     *        <p>
     *        Constraints: Must be the name of an existing DB cluster snapshot in the <code>available</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBClusterSnapshotRequest withDBClusterSnapshotIdentifier(String dBClusterSnapshotIdentifier) {
        setDBClusterSnapshotIdentifier(dBClusterSnapshotIdentifier);
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
        if (getDBClusterSnapshotIdentifier() != null)
            sb.append("DBClusterSnapshotIdentifier: ").append(getDBClusterSnapshotIdentifier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteDBClusterSnapshotRequest == false)
            return false;
        DeleteDBClusterSnapshotRequest other = (DeleteDBClusterSnapshotRequest) obj;
        if (other.getDBClusterSnapshotIdentifier() == null ^ this.getDBClusterSnapshotIdentifier() == null)
            return false;
        if (other.getDBClusterSnapshotIdentifier() != null && other.getDBClusterSnapshotIdentifier().equals(this.getDBClusterSnapshotIdentifier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDBClusterSnapshotIdentifier() == null) ? 0 : getDBClusterSnapshotIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDBClusterSnapshotRequest clone() {
        return (DeleteDBClusterSnapshotRequest) super.clone();
    }

}
