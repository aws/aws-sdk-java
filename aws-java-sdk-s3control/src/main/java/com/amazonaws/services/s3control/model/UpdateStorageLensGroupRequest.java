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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/UpdateStorageLensGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateStorageLensGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the Storage Lens group that you want to update.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Web Services account ID of the Storage Lens group owner.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The JSON file that contains the Storage Lens group configuration.
     * </p>
     */
    private StorageLensGroup storageLensGroup;

    /**
     * <p>
     * The name of the Storage Lens group that you want to update.
     * </p>
     * 
     * @param name
     *        The name of the Storage Lens group that you want to update.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Storage Lens group that you want to update.
     * </p>
     * 
     * @return The name of the Storage Lens group that you want to update.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Storage Lens group that you want to update.
     * </p>
     * 
     * @param name
     *        The name of the Storage Lens group that you want to update.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageLensGroupRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Storage Lens group owner.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the Storage Lens group owner.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Storage Lens group owner.
     * </p>
     * 
     * @return The Amazon Web Services account ID of the Storage Lens group owner.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID of the Storage Lens group owner.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID of the Storage Lens group owner.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageLensGroupRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The JSON file that contains the Storage Lens group configuration.
     * </p>
     * 
     * @param storageLensGroup
     *        The JSON file that contains the Storage Lens group configuration.
     */

    public void setStorageLensGroup(StorageLensGroup storageLensGroup) {
        this.storageLensGroup = storageLensGroup;
    }

    /**
     * <p>
     * The JSON file that contains the Storage Lens group configuration.
     * </p>
     * 
     * @return The JSON file that contains the Storage Lens group configuration.
     */

    public StorageLensGroup getStorageLensGroup() {
        return this.storageLensGroup;
    }

    /**
     * <p>
     * The JSON file that contains the Storage Lens group configuration.
     * </p>
     * 
     * @param storageLensGroup
     *        The JSON file that contains the Storage Lens group configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateStorageLensGroupRequest withStorageLensGroup(StorageLensGroup storageLensGroup) {
        setStorageLensGroup(storageLensGroup);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getStorageLensGroup() != null)
            sb.append("StorageLensGroup: ").append(getStorageLensGroup());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateStorageLensGroupRequest == false)
            return false;
        UpdateStorageLensGroupRequest other = (UpdateStorageLensGroupRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getStorageLensGroup() == null ^ this.getStorageLensGroup() == null)
            return false;
        if (other.getStorageLensGroup() != null && other.getStorageLensGroup().equals(this.getStorageLensGroup()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getStorageLensGroup() == null) ? 0 : getStorageLensGroup().hashCode());
        return hashCode;
    }

    @Override
    public UpdateStorageLensGroupRequest clone() {
        return (UpdateStorageLensGroupRequest) super.clone();
    }

}
