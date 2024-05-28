/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.deadline.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/deadline-2023-10-12/GetStorageProfile" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStorageProfileRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The farm ID for the storage profile.
     * </p>
     */
    private String farmId;
    /**
     * <p>
     * The storage profile ID.
     * </p>
     */
    private String storageProfileId;

    /**
     * <p>
     * The farm ID for the storage profile.
     * </p>
     * 
     * @param farmId
     *        The farm ID for the storage profile.
     */

    public void setFarmId(String farmId) {
        this.farmId = farmId;
    }

    /**
     * <p>
     * The farm ID for the storage profile.
     * </p>
     * 
     * @return The farm ID for the storage profile.
     */

    public String getFarmId() {
        return this.farmId;
    }

    /**
     * <p>
     * The farm ID for the storage profile.
     * </p>
     * 
     * @param farmId
     *        The farm ID for the storage profile.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageProfileRequest withFarmId(String farmId) {
        setFarmId(farmId);
        return this;
    }

    /**
     * <p>
     * The storage profile ID.
     * </p>
     * 
     * @param storageProfileId
     *        The storage profile ID.
     */

    public void setStorageProfileId(String storageProfileId) {
        this.storageProfileId = storageProfileId;
    }

    /**
     * <p>
     * The storage profile ID.
     * </p>
     * 
     * @return The storage profile ID.
     */

    public String getStorageProfileId() {
        return this.storageProfileId;
    }

    /**
     * <p>
     * The storage profile ID.
     * </p>
     * 
     * @param storageProfileId
     *        The storage profile ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageProfileRequest withStorageProfileId(String storageProfileId) {
        setStorageProfileId(storageProfileId);
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
        if (getFarmId() != null)
            sb.append("FarmId: ").append(getFarmId()).append(",");
        if (getStorageProfileId() != null)
            sb.append("StorageProfileId: ").append(getStorageProfileId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetStorageProfileRequest == false)
            return false;
        GetStorageProfileRequest other = (GetStorageProfileRequest) obj;
        if (other.getFarmId() == null ^ this.getFarmId() == null)
            return false;
        if (other.getFarmId() != null && other.getFarmId().equals(this.getFarmId()) == false)
            return false;
        if (other.getStorageProfileId() == null ^ this.getStorageProfileId() == null)
            return false;
        if (other.getStorageProfileId() != null && other.getStorageProfileId().equals(this.getStorageProfileId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFarmId() == null) ? 0 : getFarmId().hashCode());
        hashCode = prime * hashCode + ((getStorageProfileId() == null) ? 0 : getStorageProfileId().hashCode());
        return hashCode;
    }

    @Override
    public GetStorageProfileRequest clone() {
        return (GetStorageProfileRequest) super.clone();
    }

}
