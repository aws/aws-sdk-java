/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ebs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ebs-2019-11-02/CompleteSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CompleteSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The status of the snapshot.
     * </p>
     */
    private String status;

    /**
     * <p>
     * The status of the snapshot.
     * </p>
     * 
     * @param status
     *        The status of the snapshot.
     * @see Status
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the snapshot.
     * </p>
     * 
     * @return The status of the snapshot.
     * @see Status
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the snapshot.
     * </p>
     * 
     * @param status
     *        The status of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public CompleteSnapshotResult withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The status of the snapshot.
     * </p>
     * 
     * @param status
     *        The status of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see Status
     */

    public CompleteSnapshotResult withStatus(Status status) {
        this.status = status.toString();
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
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CompleteSnapshotResult == false)
            return false;
        CompleteSnapshotResult other = (CompleteSnapshotResult) obj;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return hashCode;
    }

    @Override
    public CompleteSnapshotResult clone() {
        try {
            return (CompleteSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
