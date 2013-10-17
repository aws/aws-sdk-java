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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.storagegateway.AWSStorageGateway#addWorkingStorage(AddWorkingStorageRequest) AddWorkingStorage operation}.
 * <p>
 * This operation configures one or more gateway local disks as working storage for a gateway. This operation is supported only for the gateway-stored
 * volume architecture.
 * </p>
 * <p>
 * <b>NOTE:</b> Working storage is also referred to as upload buffer. You can also use the AddUploadBuffer operation to add upload buffer to a
 * stored-volume gateway.
 * </p>
 * <p>
 * In the request, you specify the gateway Amazon Resource Name (ARN) to which you want to add working storage, and one or more disk IDs that you want to
 * configure as working storage.
 * </p>
 *
 * @see com.amazonaws.services.storagegateway.AWSStorageGateway#addWorkingStorage(AddWorkingStorageRequest)
 */
public class AddWorkingStorageRequest extends AmazonWebServiceRequest implements Serializable {

    /**
     * The Amazon Resource Name (ARN) of the gateway. Use the
     * <a>ListGateways</a> operation to return a list of gateways for your
     * account and region.
     * <p>
     * <b>Constraints:</b><br/>
     * <b>Length: </b>50 - 500<br/>
     */
    private String gatewayARN;

    /**
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string have a minimum length of 1 and maximum
     * length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     * API.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> diskIds;

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
    public AddWorkingStorageRequest withGatewayARN(String gatewayARN) {
        this.gatewayARN = gatewayARN;
        return this;
    }

    /**
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string have a minimum length of 1 and maximum
     * length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     * API.
     *
     * @return An array of strings that identify disks that are to be configured as
     *         working storage. Each string have a minimum length of 1 and maximum
     *         length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     *         API.
     */
    public java.util.List<String> getDiskIds() {
        if (diskIds == null) {
              diskIds = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              diskIds.setAutoConstruct(true);
        }
        return diskIds;
    }
    
    /**
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string have a minimum length of 1 and maximum
     * length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     * API.
     *
     * @param diskIds An array of strings that identify disks that are to be configured as
     *         working storage. Each string have a minimum length of 1 and maximum
     *         length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     *         API.
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
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string have a minimum length of 1 and maximum
     * length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     * API.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskIds An array of strings that identify disks that are to be configured as
     *         working storage. Each string have a minimum length of 1 and maximum
     *         length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     *         API.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddWorkingStorageRequest withDiskIds(String... diskIds) {
        if (getDiskIds() == null) setDiskIds(new java.util.ArrayList<String>(diskIds.length));
        for (String value : diskIds) {
            getDiskIds().add(value);
        }
        return this;
    }
    
    /**
     * An array of strings that identify disks that are to be configured as
     * working storage. Each string have a minimum length of 1 and maximum
     * length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     * API.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param diskIds An array of strings that identify disks that are to be configured as
     *         working storage. Each string have a minimum length of 1 and maximum
     *         length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     *         API.
     *
     * @return A reference to this updated object so that method calls can be chained 
     *         together.
     */
    public AddWorkingStorageRequest withDiskIds(java.util.Collection<String> diskIds) {
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
        if (getDiskIds() != null) sb.append("DiskIds: " + getDiskIds() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getGatewayARN() == null) ? 0 : getGatewayARN().hashCode()); 
        hashCode = prime * hashCode + ((getDiskIds() == null) ? 0 : getDiskIds().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddWorkingStorageRequest == false) return false;
        AddWorkingStorageRequest other = (AddWorkingStorageRequest)obj;
        
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null) return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false) return false; 
        if (other.getDiskIds() == null ^ this.getDiskIds() == null) return false;
        if (other.getDiskIds() != null && other.getDiskIds().equals(this.getDiskIds()) == false) return false; 
        return true;
    }
    
}
    