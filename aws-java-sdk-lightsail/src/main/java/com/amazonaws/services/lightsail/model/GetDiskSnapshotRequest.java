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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/lightsail-2016-11-28/GetDiskSnapshot" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetDiskSnapshotRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     * </p>
     */
    private String diskSnapshotName;

    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     * </p>
     * 
     * @param diskSnapshotName
     *        The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     */

    public void setDiskSnapshotName(String diskSnapshotName) {
        this.diskSnapshotName = diskSnapshotName;
    }

    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     * </p>
     * 
     * @return The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     */

    public String getDiskSnapshotName() {
        return this.diskSnapshotName;
    }

    /**
     * <p>
     * The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     * </p>
     * 
     * @param diskSnapshotName
     *        The name of the disk snapshot (e.g., <code>my-disk-snapshot</code>).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetDiskSnapshotRequest withDiskSnapshotName(String diskSnapshotName) {
        setDiskSnapshotName(diskSnapshotName);
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
        if (getDiskSnapshotName() != null)
            sb.append("DiskSnapshotName: ").append(getDiskSnapshotName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetDiskSnapshotRequest == false)
            return false;
        GetDiskSnapshotRequest other = (GetDiskSnapshotRequest) obj;
        if (other.getDiskSnapshotName() == null ^ this.getDiskSnapshotName() == null)
            return false;
        if (other.getDiskSnapshotName() != null && other.getDiskSnapshotName().equals(this.getDiskSnapshotName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDiskSnapshotName() == null) ? 0 : getDiskSnapshotName().hashCode());
        return hashCode;
    }

    @Override
    public GetDiskSnapshotRequest clone() {
        return (GetDiskSnapshotRequest) super.clone();
    }

}
