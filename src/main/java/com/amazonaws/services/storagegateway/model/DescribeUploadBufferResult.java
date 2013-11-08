/*
 * Copyright 2010-2013 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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

import java.io.Serializable;


/**
 * Describe Upload Buffer Result
 */
public class DescribeUploadBufferResult implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    private com.amazonaws.internal.ListWithAutoConstructFlag<String> diskIds;

    private Long uploadBufferUsedInBytes;

    private Long uploadBufferAllocatedInBytes;

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @return The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     */
    public String getGatewayARN() {
        return gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
     *         account and region.
     */
    public void setGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     *
     * @param gatewayARN The Amazon Resource Name (ARN) of the gateway. Use the
     *         <a>ListGateways</a> operation to return a list of gateways for your
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
     * Returns the value of the DiskIds property for this object.
     *
     * @return The value of the DiskIds property for this object.
     */
    public java.util.List<String> getDiskIds() {
        if (diskIds == null) {
              diskIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              diskIds.setAutoConstruct(true);
        }
        return diskIds;
    }
    
    /**
     * Sets the value of the DiskIds property for this object.
     *
     * @param diskIds The new value for the DiskIds property for this object.
     */
    public void setDiskIds(java.util.Collection<String> diskIds) {
        if (diskIds == null) {
            this.diskIds = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> diskIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(diskIds.size());
        diskIdsCopy.addAll(diskIds);
        this.diskIds = diskIdsCopy;
    }
    
    /**
     * Sets the value of the DiskIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskIds The new value for the DiskIds property for this object.
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
     * Sets the value of the DiskIds property for this object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskIds The new value for the DiskIds property for this object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeUploadBufferResult withDiskIds(java.util.Collection<String> diskIds) {
        if (diskIds == null) {
            this.diskIds = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> diskIdsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(diskIds.size());
            diskIdsCopy.addAll(diskIds);
            this.diskIds = diskIdsCopy;
        }

        return this;
    }

    /**
     * Returns the value of the UploadBufferUsedInBytes property for this
     * object.
     *
     * @return The value of the UploadBufferUsedInBytes property for this object.
     */
    public Long getUploadBufferUsedInBytes() {
        return uploadBufferUsedInBytes;
    }
    
    /**
     * Sets the value of the UploadBufferUsedInBytes property for this
     * object.
     *
     * @param uploadBufferUsedInBytes The new value for the UploadBufferUsedInBytes property for this
     *         object.
     */
    public void setUploadBufferUsedInBytes(Long uploadBufferUsedInBytes) {
        this.uploadBufferUsedInBytes = uploadBufferUsedInBytes;
    }
    
    /**
     * Sets the value of the UploadBufferUsedInBytes property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadBufferUsedInBytes The new value for the UploadBufferUsedInBytes property for this
     *         object.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public DescribeUploadBufferResult withUploadBufferUsedInBytes(Long uploadBufferUsedInBytes) {
        this.uploadBufferUsedInBytes = uploadBufferUsedInBytes;
        return this;
    }

    /**
     * Returns the value of the UploadBufferAllocatedInBytes property for
     * this object.
     *
     * @return The value of the UploadBufferAllocatedInBytes property for this
     *         object.
     */
    public Long getUploadBufferAllocatedInBytes() {
        return uploadBufferAllocatedInBytes;
    }
    
    /**
     * Sets the value of the UploadBufferAllocatedInBytes property for this
     * object.
     *
     * @param uploadBufferAllocatedInBytes The new value for the UploadBufferAllocatedInBytes property for this
     *         object.
     */
    public void setUploadBufferAllocatedInBytes(Long uploadBufferAllocatedInBytes) {
        this.uploadBufferAllocatedInBytes = uploadBufferAllocatedInBytes;
    }
    
    /**
     * Sets the value of the UploadBufferAllocatedInBytes property for this
     * object.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param uploadBufferAllocatedInBytes The new value for the UploadBufferAllocatedInBytes property for this
     *         object.
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
        if (getGatewayARN() != null) sb.append("GatewayARN: " + getGatewayARN() + ",");
        if (getDiskIds() != null) sb.append("DiskIds: " + getDiskIds() + ",");
        if (getUploadBufferUsedInBytes() != null) sb.append("UploadBufferUsedInBytes: " + getUploadBufferUsedInBytes() + ",");
        if (getUploadBufferAllocatedInBytes() != null) sb.append("UploadBufferAllocatedInBytes: " + getUploadBufferAllocatedInBytes() );
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
    