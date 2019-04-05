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
package com.amazonaws.services.storagegateway.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeWorkingStorage"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeWorkingStorageResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified
     * as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage,
     * then the DiskIds array is empty.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> diskIds;
    /**
     * <p>
     * The total working storage in bytes in use by the gateway. If no working storage is configured for the gateway,
     * this field returns 0.
     * </p>
     */
    private Long workingStorageUsedInBytes;
    /**
     * <p>
     * The total working storage in bytes allocated for the gateway. If no working storage is configured for the
     * gateway, this field returns 0.
     * </p>
     */
    private Long workingStorageAllocatedInBytes;

    /**
     * @param gatewayARN
     */

    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }

    /**
     * @return
     */

    public String getGatewayARN() {
        return this.gatewayARN;
    }

    /**
     * @param gatewayARN
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkingStorageResult withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified
     * as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage,
     * then the DiskIds array is empty.
     * </p>
     * 
     * @return An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is
     *         specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured
     *         as working storage, then the DiskIds array is empty.
     */

    public java.util.List<String> getDiskIds() {
        if (diskIds == null) {
            diskIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return diskIds;
    }

    /**
     * <p>
     * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified
     * as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage,
     * then the DiskIds array is empty.
     * </p>
     * 
     * @param diskIds
     *        An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is
     *        specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as
     *        working storage, then the DiskIds array is empty.
     */

    public void setDiskIds(java.util.Collection<String> diskIds) {
        if (diskIds == null) {
            this.diskIds = null;
            return;
        }

        this.diskIds = new com.amazonaws.internal.SdkInternalList<String>(diskIds);
    }

    /**
     * <p>
     * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified
     * as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage,
     * then the DiskIds array is empty.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDiskIds(java.util.Collection)} or {@link #withDiskIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param diskIds
     *        An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is
     *        specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as
     *        working storage, then the DiskIds array is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkingStorageResult withDiskIds(String... diskIds) {
        if (this.diskIds == null) {
            setDiskIds(new com.amazonaws.internal.SdkInternalList<String>(diskIds.length));
        }
        for (String ele : diskIds) {
            this.diskIds.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is specified
     * as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as working storage,
     * then the DiskIds array is empty.
     * </p>
     * 
     * @param diskIds
     *        An array of the gateway's local disk IDs that are configured as working storage. Each local disk ID is
     *        specified as a string (minimum length of 1 and maximum length of 300). If no local disks are configured as
     *        working storage, then the DiskIds array is empty.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkingStorageResult withDiskIds(java.util.Collection<String> diskIds) {
        setDiskIds(diskIds);
        return this;
    }

    /**
     * <p>
     * The total working storage in bytes in use by the gateway. If no working storage is configured for the gateway,
     * this field returns 0.
     * </p>
     * 
     * @param workingStorageUsedInBytes
     *        The total working storage in bytes in use by the gateway. If no working storage is configured for the
     *        gateway, this field returns 0.
     */

    public void setWorkingStorageUsedInBytes(Long workingStorageUsedInBytes) {
        this.workingStorageUsedInBytes = workingStorageUsedInBytes;
    }

    /**
     * <p>
     * The total working storage in bytes in use by the gateway. If no working storage is configured for the gateway,
     * this field returns 0.
     * </p>
     * 
     * @return The total working storage in bytes in use by the gateway. If no working storage is configured for the
     *         gateway, this field returns 0.
     */

    public Long getWorkingStorageUsedInBytes() {
        return this.workingStorageUsedInBytes;
    }

    /**
     * <p>
     * The total working storage in bytes in use by the gateway. If no working storage is configured for the gateway,
     * this field returns 0.
     * </p>
     * 
     * @param workingStorageUsedInBytes
     *        The total working storage in bytes in use by the gateway. If no working storage is configured for the
     *        gateway, this field returns 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkingStorageResult withWorkingStorageUsedInBytes(Long workingStorageUsedInBytes) {
        setWorkingStorageUsedInBytes(workingStorageUsedInBytes);
        return this;
    }

    /**
     * <p>
     * The total working storage in bytes allocated for the gateway. If no working storage is configured for the
     * gateway, this field returns 0.
     * </p>
     * 
     * @param workingStorageAllocatedInBytes
     *        The total working storage in bytes allocated for the gateway. If no working storage is configured for the
     *        gateway, this field returns 0.
     */

    public void setWorkingStorageAllocatedInBytes(Long workingStorageAllocatedInBytes) {
        this.workingStorageAllocatedInBytes = workingStorageAllocatedInBytes;
    }

    /**
     * <p>
     * The total working storage in bytes allocated for the gateway. If no working storage is configured for the
     * gateway, this field returns 0.
     * </p>
     * 
     * @return The total working storage in bytes allocated for the gateway. If no working storage is configured for the
     *         gateway, this field returns 0.
     */

    public Long getWorkingStorageAllocatedInBytes() {
        return this.workingStorageAllocatedInBytes;
    }

    /**
     * <p>
     * The total working storage in bytes allocated for the gateway. If no working storage is configured for the
     * gateway, this field returns 0.
     * </p>
     * 
     * @param workingStorageAllocatedInBytes
     *        The total working storage in bytes allocated for the gateway. If no working storage is configured for the
     *        gateway, this field returns 0.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeWorkingStorageResult withWorkingStorageAllocatedInBytes(Long workingStorageAllocatedInBytes) {
        setWorkingStorageAllocatedInBytes(workingStorageAllocatedInBytes);
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
        if (getGatewayARN() != null)
            sb.append("GatewayARN: ").append(getGatewayARN()).append(",");
        if (getDiskIds() != null)
            sb.append("DiskIds: ").append(getDiskIds()).append(",");
        if (getWorkingStorageUsedInBytes() != null)
            sb.append("WorkingStorageUsedInBytes: ").append(getWorkingStorageUsedInBytes()).append(",");
        if (getWorkingStorageAllocatedInBytes() != null)
            sb.append("WorkingStorageAllocatedInBytes: ").append(getWorkingStorageAllocatedInBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeWorkingStorageResult == false)
            return false;
        DescribeWorkingStorageResult other = (DescribeWorkingStorageResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getDiskIds() == null ^ this.getDiskIds() == null)
            return false;
        if (other.getDiskIds() != null && other.getDiskIds().equals(this.getDiskIds()) == false)
            return false;
        if (other.getWorkingStorageUsedInBytes() == null ^ this.getWorkingStorageUsedInBytes() == null)
            return false;
        if (other.getWorkingStorageUsedInBytes() != null && other.getWorkingStorageUsedInBytes().equals(this.getWorkingStorageUsedInBytes()) == false)
            return false;
        if (other.getWorkingStorageAllocatedInBytes() == null ^ this.getWorkingStorageAllocatedInBytes() == null)
            return false;
        if (other.getWorkingStorageAllocatedInBytes() != null
                && other.getWorkingStorageAllocatedInBytes().equals(this.getWorkingStorageAllocatedInBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getDiskIds() == null) ? 0 : getDiskIds().hashCode());
        hashCode = prime * hashCode + ((getWorkingStorageUsedInBytes() == null) ? 0 : getWorkingStorageUsedInBytes().hashCode());
        hashCode = prime * hashCode + ((getWorkingStorageAllocatedInBytes() == null) ? 0 : getWorkingStorageAllocatedInBytes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeWorkingStorageResult clone() {
        try {
            return (DescribeWorkingStorageResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
