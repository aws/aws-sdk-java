/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.simplesystemsmanagement.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ssm-2014-11-06/UpdateOpsMetadata" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateOpsMetadataRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resoure Name (ARN) of the OpsMetadata Object to update.
     * </p>
     */
    private String opsMetadataArn;
    /**
     * <p>
     * Metadata to add to an OpsMetadata object.
     * </p>
     */
    private java.util.Map<String, MetadataValue> metadataToUpdate;
    /**
     * <p>
     * The metadata keys to delete from the OpsMetadata object.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> keysToDelete;

    /**
     * <p>
     * The Amazon Resoure Name (ARN) of the OpsMetadata Object to update.
     * </p>
     * 
     * @param opsMetadataArn
     *        The Amazon Resoure Name (ARN) of the OpsMetadata Object to update.
     */

    public void setOpsMetadataArn(String opsMetadataArn) {
        this.opsMetadataArn = opsMetadataArn;
    }

    /**
     * <p>
     * The Amazon Resoure Name (ARN) of the OpsMetadata Object to update.
     * </p>
     * 
     * @return The Amazon Resoure Name (ARN) of the OpsMetadata Object to update.
     */

    public String getOpsMetadataArn() {
        return this.opsMetadataArn;
    }

    /**
     * <p>
     * The Amazon Resoure Name (ARN) of the OpsMetadata Object to update.
     * </p>
     * 
     * @param opsMetadataArn
     *        The Amazon Resoure Name (ARN) of the OpsMetadata Object to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpsMetadataRequest withOpsMetadataArn(String opsMetadataArn) {
        setOpsMetadataArn(opsMetadataArn);
        return this;
    }

    /**
     * <p>
     * Metadata to add to an OpsMetadata object.
     * </p>
     * 
     * @return Metadata to add to an OpsMetadata object.
     */

    public java.util.Map<String, MetadataValue> getMetadataToUpdate() {
        return metadataToUpdate;
    }

    /**
     * <p>
     * Metadata to add to an OpsMetadata object.
     * </p>
     * 
     * @param metadataToUpdate
     *        Metadata to add to an OpsMetadata object.
     */

    public void setMetadataToUpdate(java.util.Map<String, MetadataValue> metadataToUpdate) {
        this.metadataToUpdate = metadataToUpdate;
    }

    /**
     * <p>
     * Metadata to add to an OpsMetadata object.
     * </p>
     * 
     * @param metadataToUpdate
     *        Metadata to add to an OpsMetadata object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpsMetadataRequest withMetadataToUpdate(java.util.Map<String, MetadataValue> metadataToUpdate) {
        setMetadataToUpdate(metadataToUpdate);
        return this;
    }

    /**
     * Add a single MetadataToUpdate entry
     *
     * @see UpdateOpsMetadataRequest#withMetadataToUpdate
     * @returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpsMetadataRequest addMetadataToUpdateEntry(String key, MetadataValue value) {
        if (null == this.metadataToUpdate) {
            this.metadataToUpdate = new java.util.HashMap<String, MetadataValue>();
        }
        if (this.metadataToUpdate.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.metadataToUpdate.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into MetadataToUpdate.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpsMetadataRequest clearMetadataToUpdateEntries() {
        this.metadataToUpdate = null;
        return this;
    }

    /**
     * <p>
     * The metadata keys to delete from the OpsMetadata object.
     * </p>
     * 
     * @return The metadata keys to delete from the OpsMetadata object.
     */

    public java.util.List<String> getKeysToDelete() {
        if (keysToDelete == null) {
            keysToDelete = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return keysToDelete;
    }

    /**
     * <p>
     * The metadata keys to delete from the OpsMetadata object.
     * </p>
     * 
     * @param keysToDelete
     *        The metadata keys to delete from the OpsMetadata object.
     */

    public void setKeysToDelete(java.util.Collection<String> keysToDelete) {
        if (keysToDelete == null) {
            this.keysToDelete = null;
            return;
        }

        this.keysToDelete = new com.amazonaws.internal.SdkInternalList<String>(keysToDelete);
    }

    /**
     * <p>
     * The metadata keys to delete from the OpsMetadata object.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setKeysToDelete(java.util.Collection)} or {@link #withKeysToDelete(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param keysToDelete
     *        The metadata keys to delete from the OpsMetadata object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpsMetadataRequest withKeysToDelete(String... keysToDelete) {
        if (this.keysToDelete == null) {
            setKeysToDelete(new com.amazonaws.internal.SdkInternalList<String>(keysToDelete.length));
        }
        for (String ele : keysToDelete) {
            this.keysToDelete.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The metadata keys to delete from the OpsMetadata object.
     * </p>
     * 
     * @param keysToDelete
     *        The metadata keys to delete from the OpsMetadata object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateOpsMetadataRequest withKeysToDelete(java.util.Collection<String> keysToDelete) {
        setKeysToDelete(keysToDelete);
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
        if (getOpsMetadataArn() != null)
            sb.append("OpsMetadataArn: ").append(getOpsMetadataArn()).append(",");
        if (getMetadataToUpdate() != null)
            sb.append("MetadataToUpdate: ").append(getMetadataToUpdate()).append(",");
        if (getKeysToDelete() != null)
            sb.append("KeysToDelete: ").append(getKeysToDelete());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateOpsMetadataRequest == false)
            return false;
        UpdateOpsMetadataRequest other = (UpdateOpsMetadataRequest) obj;
        if (other.getOpsMetadataArn() == null ^ this.getOpsMetadataArn() == null)
            return false;
        if (other.getOpsMetadataArn() != null && other.getOpsMetadataArn().equals(this.getOpsMetadataArn()) == false)
            return false;
        if (other.getMetadataToUpdate() == null ^ this.getMetadataToUpdate() == null)
            return false;
        if (other.getMetadataToUpdate() != null && other.getMetadataToUpdate().equals(this.getMetadataToUpdate()) == false)
            return false;
        if (other.getKeysToDelete() == null ^ this.getKeysToDelete() == null)
            return false;
        if (other.getKeysToDelete() != null && other.getKeysToDelete().equals(this.getKeysToDelete()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getOpsMetadataArn() == null) ? 0 : getOpsMetadataArn().hashCode());
        hashCode = prime * hashCode + ((getMetadataToUpdate() == null) ? 0 : getMetadataToUpdate().hashCode());
        hashCode = prime * hashCode + ((getKeysToDelete() == null) ? 0 : getKeysToDelete().hashCode());
        return hashCode;
    }

    @Override
    public UpdateOpsMetadataRequest clone() {
        return (UpdateOpsMetadataRequest) super.clone();
    }

}
