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
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/DescribeUploadBuffer"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeUploadBufferResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

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
     * The total number of bytes being used in the gateway's upload buffer.
     * </p>
     */
    private Long uploadBufferUsedInBytes;
    /**
     * <p>
     * The total number of bytes allocated in the gateway's as upload buffer.
     * </p>
     */
    private Long uploadBufferAllocatedInBytes;

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

    public DescribeUploadBufferResult withGatewayARN(String gatewayARN) {
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

    public DescribeUploadBufferResult withDiskIds(String... diskIds) {
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

    public DescribeUploadBufferResult withDiskIds(java.util.Collection<String> diskIds) {
        setDiskIds(diskIds);
        return this;
    }

    /**
     * <p>
     * The total number of bytes being used in the gateway's upload buffer.
     * </p>
     * 
     * @param uploadBufferUsedInBytes
     *        The total number of bytes being used in the gateway's upload buffer.
     */

    public void setUploadBufferUsedInBytes(Long uploadBufferUsedInBytes) {
        this.uploadBufferUsedInBytes = uploadBufferUsedInBytes;
    }

    /**
     * <p>
     * The total number of bytes being used in the gateway's upload buffer.
     * </p>
     * 
     * @return The total number of bytes being used in the gateway's upload buffer.
     */

    public Long getUploadBufferUsedInBytes() {
        return this.uploadBufferUsedInBytes;
    }

    /**
     * <p>
     * The total number of bytes being used in the gateway's upload buffer.
     * </p>
     * 
     * @param uploadBufferUsedInBytes
     *        The total number of bytes being used in the gateway's upload buffer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUploadBufferResult withUploadBufferUsedInBytes(Long uploadBufferUsedInBytes) {
        setUploadBufferUsedInBytes(uploadBufferUsedInBytes);
        return this;
    }

    /**
     * <p>
     * The total number of bytes allocated in the gateway's as upload buffer.
     * </p>
     * 
     * @param uploadBufferAllocatedInBytes
     *        The total number of bytes allocated in the gateway's as upload buffer.
     */

    public void setUploadBufferAllocatedInBytes(Long uploadBufferAllocatedInBytes) {
        this.uploadBufferAllocatedInBytes = uploadBufferAllocatedInBytes;
    }

    /**
     * <p>
     * The total number of bytes allocated in the gateway's as upload buffer.
     * </p>
     * 
     * @return The total number of bytes allocated in the gateway's as upload buffer.
     */

    public Long getUploadBufferAllocatedInBytes() {
        return this.uploadBufferAllocatedInBytes;
    }

    /**
     * <p>
     * The total number of bytes allocated in the gateway's as upload buffer.
     * </p>
     * 
     * @param uploadBufferAllocatedInBytes
     *        The total number of bytes allocated in the gateway's as upload buffer.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeUploadBufferResult withUploadBufferAllocatedInBytes(Long uploadBufferAllocatedInBytes) {
        setUploadBufferAllocatedInBytes(uploadBufferAllocatedInBytes);
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
        if (getUploadBufferUsedInBytes() != null)
            sb.append("UploadBufferUsedInBytes: ").append(getUploadBufferUsedInBytes()).append(",");
        if (getUploadBufferAllocatedInBytes() != null)
            sb.append("UploadBufferAllocatedInBytes: ").append(getUploadBufferAllocatedInBytes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeUploadBufferResult == false)
            return false;
        DescribeUploadBufferResult other = (DescribeUploadBufferResult) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getDiskIds() == null ^ this.getDiskIds() == null)
            return false;
        if (other.getDiskIds() != null && other.getDiskIds().equals(this.getDiskIds()) == false)
            return false;
        if (other.getUploadBufferUsedInBytes() == null ^ this.getUploadBufferUsedInBytes() == null)
            return false;
        if (other.getUploadBufferUsedInBytes() != null && other.getUploadBufferUsedInBytes().equals(this.getUploadBufferUsedInBytes()) == false)
            return false;
        if (other.getUploadBufferAllocatedInBytes() == null ^ this.getUploadBufferAllocatedInBytes() == null)
            return false;
        if (other.getUploadBufferAllocatedInBytes() != null && other.getUploadBufferAllocatedInBytes().equals(this.getUploadBufferAllocatedInBytes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode());
        hashCode = prime * hashCode + ((getDiskIds() == null) ? 0 : getDiskIds().hashCode());
        hashCode = prime * hashCode + ((getUploadBufferUsedInBytes() == null) ? 0 : getUploadBufferUsedInBytes().hashCode());
        hashCode = prime * hashCode + ((getUploadBufferAllocatedInBytes() == null) ? 0 : getUploadBufferAllocatedInBytes().hashCode());
        return hashCode;
    }

    @Override
    public DescribeUploadBufferResult clone() {
        try {
            return (DescribeUploadBufferResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
