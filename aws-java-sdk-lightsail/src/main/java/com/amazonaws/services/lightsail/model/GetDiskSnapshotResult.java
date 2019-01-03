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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDiskSnapshotResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object containing information about the disk snapshot.
     * </p>
     */
    private DiskSnapshot diskSnapshot;

    /**
     * <p>
     * An object containing information about the disk snapshot.
     * </p>
     * 
     * @param diskSnapshot
     *        An object containing information about the disk snapshot.
     */

    public void setDiskSnapshot(DiskSnapshot diskSnapshot) {
        this.diskSnapshot = diskSnapshot;
    }

    /**
     * <p>
     * An object containing information about the disk snapshot.
     * </p>
     * 
     * @return An object containing information about the disk snapshot.
     */

    public DiskSnapshot getDiskSnapshot() {
        return this.diskSnapshot;
    }

    /**
     * <p>
     * An object containing information about the disk snapshot.
     * </p>
     * 
     * @param diskSnapshot
     *        An object containing information about the disk snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiskSnapshotResult withDiskSnapshot(DiskSnapshot diskSnapshot) {
        setDiskSnapshot(diskSnapshot);
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
        if (getDiskSnapshot() != null)
            sb.append("DiskSnapshot: ").append(getDiskSnapshot());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDiskSnapshotResult == false)
            return false;
        GetDiskSnapshotResult other = (GetDiskSnapshotResult) obj;
        if (other.getDiskSnapshot() == null ^ this.getDiskSnapshot() == null)
            return false;
        if (other.getDiskSnapshot() != null && other.getDiskSnapshot().equals(this.getDiskSnapshot()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskSnapshot() == null) ? 0 : getDiskSnapshot().hashCode());
        return hashCode;
    }

    @Override
    public GetDiskSnapshotResult clone() {
        try {
            return (GetDiskSnapshotResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
