/*
 * Copyright 2010-2012 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.storagegateway.model;

/**
 * <p>
 * A JSON object containing the following fields:
 * </p>
 * 
 * <ul>
 * <li> DescribeUploadBufferOutput$DiskIds </li>
 * <li> DescribeUploadBufferOutput$GatewayARN </li>
 * <li> DescribeUploadBufferOutput$UploadBufferUsedInBytes </li>
 * <li> DescribeUploadBufferOutput$UploadBufferAllocatedInBytes </li>
 * 
 * </ul>
 */
public class DescribeUploadBufferResult {

    /**
     * In response, AWS Storage Gateway returns the ARN of the activated
     * gateway. If you don't remember the ARN of a gateway, you can use the
     * <a>ListGateways</a> operations to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * An array of the gateway's local disk IDs that are configured as
     * working storage. Each local disk ID is specified as a string (minimum
     * length of 1 and maximum length of 300). If no local disks are
     * configured as working storage, then the <code>DiskIds</code> array is
     * empty.
     */
    private java.util.List<String> diskIds;

    /**
     * The total upload buffer in bytes in use by the gateway. If no upload
     * buffer is configured for the gateway, this field returns 0.
     */
    private Long uploadBufferUsedInBytes;

    /**
     * The total upload buffer in bytes allocated for the gateway. If no
     * upload buffer is configured for the gateway, this field returns 0.
     */
    private Long uploadBufferAllocatedInBytes;

    /**
     * In response, AWS Storage Gateway returns the ARN of the activated
     * gateway. If you don't remember the ARN of a gateway, you can use the
     * <a>ListGateways</a> operations to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return In response, AWS Storage Gateway returns the ARN of the activated
     *         gateway. If you don't remember the ARN of a gateway, you can use the
     *         <a>ListGateways</a> operations to return a list of gateways for your
     *         account and region.
     */
    public String getGatewayARN() {
        return gatewayARN;
    }
    
    /**
     * In response, AWS Storage Gateway returns the ARN of the activated
     * gateway. If you don't remember the ARN of a gateway, you can use the
     * <a>ListGateways</a> operations to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN In response, AWS Storage Gateway returns the ARN of the activated
     *         gateway. If you don't remember the ARN of a gateway, you can use the
     *         <a>ListGateways</a> operations to return a list of gateways for your
     *         account and region.
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }
    
    /**
     * In response, AWS Storage Gateway returns the ARN of the activated
     * gateway. If you don't remember the ARN of a gateway, you can use the
     * <a>ListGateways</a> operations to return a list of gateways for your
     * account and region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN In response, AWS Storage Gateway returns the ARN of the activated
     *         gateway. If you don't remember the ARN of a gateway, you can use the
     *         <a>ListGateways</a> operations to return a list of gateways for your
     *         account and region.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeUploadBufferResult withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }
    
    
    /**
     * An array of the gateway's local disk IDs that are configured as
     * working storage. Each local disk ID is specified as a string (minimum
     * length of 1 and maximum length of 300). If no local disks are
     * configured as working storage, then the <code>DiskIds</code> array is
     * empty.
     *
     * @return An array of the gateway's local disk IDs that are configured as
     *         working storage. Each local disk ID is specified as a string (minimum
     *         length of 1 and maximum length of 300). If no local disks are
     *         configured as working storage, then the <code>DiskIds</code> array is
     *         empty.
     */
    public java.util.List<String> getDiskIds() {
        
        if (diskIds == null) {
            diskIds = new java.util.ArrayList<String>();
        }
        return diskIds;
    }
    
    /**
     * An array of the gateway's local disk IDs that are configured as
     * working storage. Each local disk ID is specified as a string (minimum
     * length of 1 and maximum length of 300). If no local disks are
     * configured as working storage, then the <code>DiskIds</code> array is
     * empty.
     *
     * @param diskIds An array of the gateway's local disk IDs that are configured as
     *         working storage. Each local disk ID is specified as a string (minimum
     *         length of 1 and maximum length of 300). If no local disks are
     *         configured as working storage, then the <code>DiskIds</code> array is
     *         empty.
     */
    public void setDiskIds(java.util.Collection<String> diskIds) {
        if (diskIds == null) {
            this.diskIds = null;
            return;
        }

        java.util.List<String> diskIdsCopy = new java.util.ArrayList<String>(diskIds.size());
        diskIdsCopy.addAll(diskIds);
        this.diskIds = diskIdsCopy;
    }
    
    /**
     * An array of the gateway's local disk IDs that are configured as
     * working storage. Each local disk ID is specified as a string (minimum
     * length of 1 and maximum length of 300). If no local disks are
     * configured as working storage, then the <code>DiskIds</code> array is
     * empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskIds An array of the gateway's local disk IDs that are configured as
     *         working storage. Each local disk ID is specified as a string (minimum
     *         length of 1 and maximum length of 300). If no local disks are
     *         configured as working storage, then the <code>DiskIds</code> array is
     *         empty.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeUploadBufferResult withDiskIds(String... diskIds) {
        if (getDiskIds() == null) setDiskIds(new java.util.ArrayList<String>(diskIds.length));
        for (String value : diskIds) {
            getDiskIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of the gateway's local disk IDs that are configured as
     * working storage. Each local disk ID is specified as a string (minimum
     * length of 1 and maximum length of 300). If no local disks are
     * configured as working storage, then the <code>DiskIds</code> array is
     * empty.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskIds An array of the gateway's local disk IDs that are configured as
     *         working storage. Each local disk ID is specified as a string (minimum
     *         length of 1 and maximum length of 300). If no local disks are
     *         configured as working storage, then the <code>DiskIds</code> array is
     *         empty.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeUploadBufferResult withDiskIds(java.util.Collection<String> diskIds) {
        if (diskIds == null) {
            this.diskIds = null;
        } else {
            java.util.List<String> diskIdsCopy = new java.util.ArrayList<String>(diskIds.size());
            diskIdsCopy.addAll(diskIds);
            this.diskIds = diskIdsCopy;
        }

        return this;
    }
    
    /**
     * The total upload buffer in bytes in use by the gateway. If no upload
     * buffer is configured for the gateway, this field returns 0.
     *
     * @return The total upload buffer in bytes in use by the gateway. If no upload
     *         buffer is configured for the gateway, this field returns 0.
     */
    public Long getUploadBufferUsedInBytes() {
        return uploadBufferUsedInBytes;
    }
    
    /**
     * The total upload buffer in bytes in use by the gateway. If no upload
     * buffer is configured for the gateway, this field returns 0.
     *
     * @param uploadBufferUsedInBytes The total upload buffer in bytes in use by the gateway. If no upload
     *         buffer is configured for the gateway, this field returns 0.
     */
    public void setUploadBufferUsedInBytes(Long uploadBufferUsedInBytes) {
        this.uploadBufferUsedInBytes = uploadBufferUsedInBytes;
    }
    
    /**
     * The total upload buffer in bytes in use by the gateway. If no upload
     * buffer is configured for the gateway, this field returns 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadBufferUsedInBytes The total upload buffer in bytes in use by the gateway. If no upload
     *         buffer is configured for the gateway, this field returns 0.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeUploadBufferResult withUploadBufferUsedInBytes(Long uploadBufferUsedInBytes) {
        this.uploadBufferUsedInBytes = uploadBufferUsedInBytes;
        return this;
    }
    
    
    /**
     * The total upload buffer in bytes allocated for the gateway. If no
     * upload buffer is configured for the gateway, this field returns 0.
     *
     * @return The total upload buffer in bytes allocated for the gateway. If no
     *         upload buffer is configured for the gateway, this field returns 0.
     */
    public Long getUploadBufferAllocatedInBytes() {
        return uploadBufferAllocatedInBytes;
    }
    
    /**
     * The total upload buffer in bytes allocated for the gateway. If no
     * upload buffer is configured for the gateway, this field returns 0.
     *
     * @param uploadBufferAllocatedInBytes The total upload buffer in bytes allocated for the gateway. If no
     *         upload buffer is configured for the gateway, this field returns 0.
     */
    public void setUploadBufferAllocatedInBytes(Long uploadBufferAllocatedInBytes) {
        this.uploadBufferAllocatedInBytes = uploadBufferAllocatedInBytes;
    }
    
    /**
     * The total upload buffer in bytes allocated for the gateway. If no
     * upload buffer is configured for the gateway, this field returns 0.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadBufferAllocatedInBytes The total upload buffer in bytes allocated for the gateway. If no
     *         upload buffer is configured for the gateway, this field returns 0.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together. 
     */
    public DescribeUploadBufferResult withUploadBufferAllocatedInBytes(Long uploadBufferAllocatedInBytes) {
        this.uploadBufferAllocatedInBytes = uploadBufferAllocatedInBytes;
        return this;
    }
    
    
    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (gatewayARN != null) sb.append("GatewayARN: " + gatewayARN + ", ");
        if (diskIds != null) sb.append("DiskIds: " + diskIds + ", ");
        if (uploadBufferUsedInBytes != null) sb.append("UploadBufferUsedInBytes: " + uploadBufferUsedInBytes + ", ");
        if (uploadBufferAllocatedInBytes != null) sb.append("UploadBufferAllocatedInBytes: " + uploadBufferAllocatedInBytes + ", ");
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
    
        if (obj instanceof DescribeUploadBufferResult == false) return false;
        DescribeUploadBufferResult other = (DescribeUploadBufferResult)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getDiskIds() == null ^ this.getDiskIds() == null) return false;
        if (other.getDiskIds() != null && other.getDiskIds().equals(this.getDiskIds()) == false) return false; 
        if (other.getUploadBufferUsedInBytes() == null ^ this.getUploadBufferUsedInBytes() == null) return false;
        if (other.getUploadBufferUsedInBytes() != null && other.getUploadBufferUsedInBytes().equals(this.getUploadBufferUsedInBytes()) == false) return false; 
        if (other.getUploadBufferAllocatedInBytes() == null ^ this.getUploadBufferAllocatedInBytes() == null) return false;
        if (other.getUploadBufferAllocatedInBytes() != null && other.getUploadBufferAllocatedInBytes().equals(this.getUploadBufferAllocatedInBytes()) == false) return false; 
        return true;
    }
    
}
    