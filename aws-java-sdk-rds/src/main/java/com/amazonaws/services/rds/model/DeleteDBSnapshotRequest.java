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
 * <p/>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/rds-2014-10-31/DeleteDBSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteDBSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The DB snapshot identifier.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB snapshot in the <code>available</code> state.
     * </p>
     */
    private String dBSnapshotIdentifier;

    /**
     * Default constructor for DeleteDBSnapshotRequest object. Callers should use the setter or fluent setter (with...)
     * methods to initialize the object after creating it.
     */
    public DeleteDBSnapshotRequest() {
    }

    /**
     * Constructs a new DeleteDBSnapshotRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize any additional object members.
     * 
     * @param dBSnapshotIdentifier
     *        The DB snapshot identifier.</p>
     *        <p>
     *        Constraints: Must be the name of an existing DB snapshot in the <code>available</code> state.
     */
    public DeleteDBSnapshotRequest(String dBSnapshotIdentifier) {
        setDBSnapshotIdentifier(dBSnapshotIdentifier);
    }

    /**
     * <p>
     * The DB snapshot identifier.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB snapshot in the <code>available</code> state.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        The DB snapshot identifier.</p>
     *        <p>
     *        Constraints: Must be the name of an existing DB snapshot in the <code>available</code> state.
     */

    public void setDBSnapshotIdentifier(String dBSnapshotIdentifier) {
        this.dBSnapshotIdentifier = dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The DB snapshot identifier.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB snapshot in the <code>available</code> state.
     * </p>
     * 
     * @return The DB snapshot identifier.</p>
     *         <p>
     *         Constraints: Must be the name of an existing DB snapshot in the <code>available</code> state.
     */

    public String getDBSnapshotIdentifier() {
        return this.dBSnapshotIdentifier;
    }

    /**
     * <p>
     * The DB snapshot identifier.
     * </p>
     * <p>
     * Constraints: Must be the name of an existing DB snapshot in the <code>available</code> state.
     * </p>
     * 
     * @param dBSnapshotIdentifier
     *        The DB snapshot identifier.</p>
     *        <p>
     *        Constraints: Must be the name of an existing DB snapshot in the <code>available</code> state.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteDBSnapshotRequest withDBSnapshotIdentifier(String dBSnapshotIdentifier) {
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

        if (obj instanceof DeleteDBSnapshotRequest == false)
            return false;
        DeleteDBSnapshotRequest other = (DeleteDBSnapshotRequest) obj;
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

        hashCode = prime * hashCode + ((getDBSnapshotIdentifier() == null) ? 0 : getDBSnapshotIdentifier().hashCode());
        return hashCode;
    }

    @Override
    public DeleteDBSnapshotRequest clone() {
        return (DeleteDBSnapshotRequest) super.clone();
    }

}
