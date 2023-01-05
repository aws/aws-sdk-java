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
package com.amazonaws.services.redshiftserverless.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-serverless-2021-04-21/UpdateSnapshot" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The updated snapshot object.
     * </p>
     */
    private Snapshot snapshot;

    /**
     * <p>
     * The updated snapshot object.
     * </p>
     * 
     * @param snapshot
     *        The updated snapshot object.
     */

    public void setSnapshot(Snapshot snapshot) {
        this.snapshot = snapshot;
    }

    /**
     * <p>
     * The updated snapshot object.
     * </p>
     * 
     * @return The updated snapshot object.
     */

    public Snapshot getSnapshot() {
        return this.snapshot;
    }

    /**
     * <p>
     * The updated snapshot object.
     * </p>
     * 
     * @param snapshot
     *        The updated snapshot object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateSnapshotResult withSnapshot(Snapshot snapshot) {
        setSnapshot(snapshot);
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
        if (getSnapshot() != null)
            sb.append("Snapshot: ").append(getSnapshot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateSnapshotResult == false)
            return false;
        UpdateSnapshotResult other = (UpdateSnapshotResult) obj;
        if (other.getSnapshot() == null ^ this.getSnapshot() == null)
            return false;
        if (other.getSnapshot() != null && other.getSnapshot().equals(this.getSnapshot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshot() == null) ? 0 : getSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public UpdateSnapshotResult clone() {
        try {
            return (UpdateSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
