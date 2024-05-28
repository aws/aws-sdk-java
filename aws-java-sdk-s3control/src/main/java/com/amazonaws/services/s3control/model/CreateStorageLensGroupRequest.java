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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/CreateStorageLensGroup" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateStorageLensGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Web Services account ID that the Storage Lens group is created from and associated with.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The Storage Lens group configuration.
     * </p>
     */
    private StorageLensGroup storageLensGroup;
    /**
     * <p>
     * The Amazon Web Services resource tags that you're adding to your Storage Lens group. This parameter is optional.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The Amazon Web Services account ID that the Storage Lens group is created from and associated with.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID that the Storage Lens group is created from and associated with.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that the Storage Lens group is created from and associated with.
     * </p>
     * 
     * @return The Amazon Web Services account ID that the Storage Lens group is created from and associated with.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Web Services account ID that the Storage Lens group is created from and associated with.
     * </p>
     * 
     * @param accountId
     *        The Amazon Web Services account ID that the Storage Lens group is created from and associated with.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorageLensGroupRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The Storage Lens group configuration.
     * </p>
     * 
     * @param storageLensGroup
     *        The Storage Lens group configuration.
     */

    public void setStorageLensGroup(StorageLensGroup storageLensGroup) {
        this.storageLensGroup = storageLensGroup;
    }

    /**
     * <p>
     * The Storage Lens group configuration.
     * </p>
     * 
     * @return The Storage Lens group configuration.
     */

    public StorageLensGroup getStorageLensGroup() {
        return this.storageLensGroup;
    }

    /**
     * <p>
     * The Storage Lens group configuration.
     * </p>
     * 
     * @param storageLensGroup
     *        The Storage Lens group configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorageLensGroupRequest withStorageLensGroup(StorageLensGroup storageLensGroup) {
        setStorageLensGroup(storageLensGroup);
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services resource tags that you're adding to your Storage Lens group. This parameter is optional.
     * </p>
     * 
     * @return The Amazon Web Services resource tags that you're adding to your Storage Lens group. This parameter is
     *         optional.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The Amazon Web Services resource tags that you're adding to your Storage Lens group. This parameter is optional.
     * </p>
     * 
     * @param tags
     *        The Amazon Web Services resource tags that you're adding to your Storage Lens group. This parameter is
     *        optional.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * The Amazon Web Services resource tags that you're adding to your Storage Lens group. This parameter is optional.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The Amazon Web Services resource tags that you're adding to your Storage Lens group. This parameter is
     *        optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorageLensGroupRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The Amazon Web Services resource tags that you're adding to your Storage Lens group. This parameter is optional.
     * </p>
     * 
     * @param tags
     *        The Amazon Web Services resource tags that you're adding to your Storage Lens group. This parameter is
     *        optional.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateStorageLensGroupRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getStorageLensGroup() != null)
            sb.append("StorageLensGroup: ").append(getStorageLensGroup()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateStorageLensGroupRequest == false)
            return false;
        CreateStorageLensGroupRequest other = (CreateStorageLensGroupRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getStorageLensGroup() == null ^ this.getStorageLensGroup() == null)
            return false;
        if (other.getStorageLensGroup() != null && other.getStorageLensGroup().equals(this.getStorageLensGroup()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getStorageLensGroup() == null) ? 0 : getStorageLensGroup().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateStorageLensGroupRequest clone() {
        return (CreateStorageLensGroupRequest) super.clone();
    }

}
