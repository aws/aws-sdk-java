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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * A JSON object containing one or more of the following fields:
 * </p>
 * <ul>
 * <li>
 * <p>
 * <a>AddWorkingStorageInput$DiskIds</a>
 * </p>
 * </li>
 * </ul>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/storagegateway-2013-06-30/AddWorkingStorage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddWorkingStorageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    private String gatewayARN;
    /**
     * <p>
     * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum
     * length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> diskIds;

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

    public AddWorkingStorageRequest withGatewayARN(String gatewayARN) {
        setGatewayARN(gatewayARN);
        return this;
    }

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum
     * length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     * 
     * @return An array of strings that identify disks that are to be configured as working storage. Each string have a
     *         minimum length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     *         API.
     */

    public java.util.List<String> getDiskIds() {
        if (diskIds == null) {
            diskIds = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return diskIds;
    }

    /**
     * <p>
     * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum
     * length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     * 
     * @param diskIds
     *        An array of strings that identify disks that are to be configured as working storage. Each string have a
     *        minimum length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     *        API.
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
     * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum
     * length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setDiskIds(java.util.Collection)} or {@link #withDiskIds(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param diskIds
     *        An array of strings that identify disks that are to be configured as working storage. Each string have a
     *        minimum length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     *        API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddWorkingStorageRequest withDiskIds(String... diskIds) {
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
     * An array of strings that identify disks that are to be configured as working storage. Each string have a minimum
     * length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a> API.
     * </p>
     * 
     * @param diskIds
     *        An array of strings that identify disks that are to be configured as working storage. Each string have a
     *        minimum length of 1 and maximum length of 300. You can get the disk IDs from the <a>ListLocalDisks</a>
     *        API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddWorkingStorageRequest withDiskIds(java.util.Collection<String> diskIds) {
        setDiskIds(diskIds);
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
            sb.append("DiskIds: ").append(getDiskIds());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AddWorkingStorageRequest == false)
            return false;
        AddWorkingStorageRequest other = (AddWorkingStorageRequest) obj;
        if (other.getGatewayARN() == null ^ this.getGatewayARN() == null)
            return false;
        if (other.getGatewayARN() != null && other.getGatewayARN().equals(this.getGatewayARN()) == false)
            return false;
        if (other.getDiskIds() == null ^ this.getDiskIds() == null)
            return false;
        if (other.getDiskIds() != null && other.getDiskIds().equals(this.getDiskIds()) == false)
            return false;
        return true;
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
    public AddWorkingStorageRequest clone() {
        return (AddWorkingStorageRequest) super.clone();
    }

}
