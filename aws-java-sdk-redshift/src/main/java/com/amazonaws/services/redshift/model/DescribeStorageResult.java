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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/redshift-2012-12-01/DescribeStorage" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeStorageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The total amount of storage currently used for snapshots.
     * </p>
     */
    private Double totalBackupSizeInMegaBytes;
    /**
     * <p>
     * The total amount of storage currently provisioned.
     * </p>
     */
    private Double totalProvisionedStorageInMegaBytes;

    /**
     * <p>
     * The total amount of storage currently used for snapshots.
     * </p>
     * 
     * @param totalBackupSizeInMegaBytes
     *        The total amount of storage currently used for snapshots.
     */

    public void setTotalBackupSizeInMegaBytes(Double totalBackupSizeInMegaBytes) {
        this.totalBackupSizeInMegaBytes = totalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The total amount of storage currently used for snapshots.
     * </p>
     * 
     * @return The total amount of storage currently used for snapshots.
     */

    public Double getTotalBackupSizeInMegaBytes() {
        return this.totalBackupSizeInMegaBytes;
    }

    /**
     * <p>
     * The total amount of storage currently used for snapshots.
     * </p>
     * 
     * @param totalBackupSizeInMegaBytes
     *        The total amount of storage currently used for snapshots.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageResult withTotalBackupSizeInMegaBytes(Double totalBackupSizeInMegaBytes) {
        setTotalBackupSizeInMegaBytes(totalBackupSizeInMegaBytes);
        return this;
    }

    /**
     * <p>
     * The total amount of storage currently provisioned.
     * </p>
     * 
     * @param totalProvisionedStorageInMegaBytes
     *        The total amount of storage currently provisioned.
     */

    public void setTotalProvisionedStorageInMegaBytes(Double totalProvisionedStorageInMegaBytes) {
        this.totalProvisionedStorageInMegaBytes = totalProvisionedStorageInMegaBytes;
    }

    /**
     * <p>
     * The total amount of storage currently provisioned.
     * </p>
     * 
     * @return The total amount of storage currently provisioned.
     */

    public Double getTotalProvisionedStorageInMegaBytes() {
        return this.totalProvisionedStorageInMegaBytes;
    }

    /**
     * <p>
     * The total amount of storage currently provisioned.
     * </p>
     * 
     * @param totalProvisionedStorageInMegaBytes
     *        The total amount of storage currently provisioned.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeStorageResult withTotalProvisionedStorageInMegaBytes(Double totalProvisionedStorageInMegaBytes) {
        setTotalProvisionedStorageInMegaBytes(totalProvisionedStorageInMegaBytes);
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
        if (getTotalBackupSizeInMegaBytes() != null)
            sb.append("TotalBackupSizeInMegaBytes: ").append(getTotalBackupSizeInMegaBytes()).append(",");
        if (getTotalProvisionedStorageInMegaBytes() != null)
            sb.append("TotalProvisionedStorageInMegaBytes: ").append(getTotalProvisionedStorageInMegaBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeStorageResult == false)
            return false;
        DescribeStorageResult other = (DescribeStorageResult) obj;
        if (other.getTotalBackupSizeInMegaBytes() == null ^ this.getTotalBackupSizeInMegaBytes() == null)
            return false;
        if (other.getTotalBackupSizeInMegaBytes() != null && other.getTotalBackupSizeInMegaBytes().equals(this.getTotalBackupSizeInMegaBytes()) == false)
            return false;
        if (other.getTotalProvisionedStorageInMegaBytes() == null ^ this.getTotalProvisionedStorageInMegaBytes() == null)
            return false;
        if (other.getTotalProvisionedStorageInMegaBytes() != null
                && other.getTotalProvisionedStorageInMegaBytes().equals(this.getTotalProvisionedStorageInMegaBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getTotalBackupSizeInMegaBytes() == null) ? 0 : getTotalBackupSizeInMegaBytes().hashCode());
        hashCode = prime * hashCode + ((getTotalProvisionedStorageInMegaBytes() == null) ? 0 : getTotalProvisionedStorageInMegaBytes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeStorageResult clone() {
        try {
            return (DescribeStorageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
