/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.ec2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;
import com.amazonaws.Request;
import com.amazonaws.services.ec2.model.transform.ModifySnapshotTierRequestMarshaller;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ModifySnapshotTierRequest extends AmazonWebServiceRequest implements Serializable, Cloneable, DryRunSupportedRequest<ModifySnapshotTierRequest> {

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     */
    private String snapshotId;
    /**
     * <p>
     * The name of the storage tier. You must specify <code>archive</code>.
     * </p>
     */
    private String storageTier;

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     */

    public void setSnapshotId(String snapshotId) {
        this.snapshotId = snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @return The ID of the snapshot.
     */

    public String getSnapshotId() {
        return this.snapshotId;
    }

    /**
     * <p>
     * The ID of the snapshot.
     * </p>
     * 
     * @param snapshotId
     *        The ID of the snapshot.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ModifySnapshotTierRequest withSnapshotId(String snapshotId) {
        setSnapshotId(snapshotId);
        return this;
    }

    /**
     * <p>
     * The name of the storage tier. You must specify <code>archive</code>.
     * </p>
     * 
     * @param storageTier
     *        The name of the storage tier. You must specify <code>archive</code>.
     * @see TargetStorageTier
     */

    public void setStorageTier(String storageTier) {
        this.storageTier = storageTier;
    }

    /**
     * <p>
     * The name of the storage tier. You must specify <code>archive</code>.
     * </p>
     * 
     * @return The name of the storage tier. You must specify <code>archive</code>.
     * @see TargetStorageTier
     */

    public String getStorageTier() {
        return this.storageTier;
    }

    /**
     * <p>
     * The name of the storage tier. You must specify <code>archive</code>.
     * </p>
     * 
     * @param storageTier
     *        The name of the storage tier. You must specify <code>archive</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetStorageTier
     */

    public ModifySnapshotTierRequest withStorageTier(String storageTier) {
        setStorageTier(storageTier);
        return this;
    }

    /**
     * <p>
     * The name of the storage tier. You must specify <code>archive</code>.
     * </p>
     * 
     * @param storageTier
     *        The name of the storage tier. You must specify <code>archive</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TargetStorageTier
     */

    public ModifySnapshotTierRequest withStorageTier(TargetStorageTier storageTier) {
        this.storageTier = storageTier.toString();
        return this;
    }

    /**
     * This method is intended for internal use only. Returns the marshaled request configured with additional
     * parameters to enable operation dry-run.
     */
    @Override
    public Request<ModifySnapshotTierRequest> getDryRunRequest() {
        Request<ModifySnapshotTierRequest> request = new ModifySnapshotTierRequestMarshaller().marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
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
        if (getSnapshotId() != null)
            sb.append("SnapshotId: ").append(getSnapshotId()).append(",");
        if (getStorageTier() != null)
            sb.append("StorageTier: ").append(getStorageTier());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ModifySnapshotTierRequest == false)
            return false;
        ModifySnapshotTierRequest other = (ModifySnapshotTierRequest) obj;
        if (other.getSnapshotId() == null ^ this.getSnapshotId() == null)
            return false;
        if (other.getSnapshotId() != null && other.getSnapshotId().equals(this.getSnapshotId()) == false)
            return false;
        if (other.getStorageTier() == null ^ this.getStorageTier() == null)
            return false;
        if (other.getStorageTier() != null && other.getStorageTier().equals(this.getStorageTier()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSnapshotId() == null) ? 0 : getSnapshotId().hashCode());
        hashCode = prime * hashCode + ((getStorageTier() == null) ? 0 : getStorageTier().hashCode());
        return hashCode;
    }

    @Override
    public ModifySnapshotTierRequest clone() {
        return (ModifySnapshotTierRequest) super.clone();
    }
}
