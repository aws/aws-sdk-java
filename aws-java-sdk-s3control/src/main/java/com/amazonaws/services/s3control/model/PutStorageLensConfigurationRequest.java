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
package com.amazonaws.services.s3control.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/PutStorageLensConfiguration"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutStorageLensConfigurationRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The ID of the S3 Storage Lens configuration.
     * </p>
     */
    private String configId;
    /**
     * <p>
     * The account ID of the requester.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The S3 Storage Lens configuration.
     * </p>
     */
    private StorageLensConfiguration storageLensConfiguration;
    /**
     * <p>
     * The tag set of the S3 Storage Lens configuration.
     * </p>
     * <note>
     * <p>
     * You can set up to a maximum of 50 tags.
     * </p>
     * </note>
     */
    private java.util.List<StorageLensTag> tags;

    /**
     * <p>
     * The ID of the S3 Storage Lens configuration.
     * </p>
     * 
     * @param configId
     *        The ID of the S3 Storage Lens configuration.
     */

    public void setConfigId(String configId) {
        this.configId = configId;
    }

    /**
     * <p>
     * The ID of the S3 Storage Lens configuration.
     * </p>
     * 
     * @return The ID of the S3 Storage Lens configuration.
     */

    public String getConfigId() {
        return this.configId;
    }

    /**
     * <p>
     * The ID of the S3 Storage Lens configuration.
     * </p>
     * 
     * @param configId
     *        The ID of the S3 Storage Lens configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStorageLensConfigurationRequest withConfigId(String configId) {
        setConfigId(configId);
        return this;
    }

    /**
     * <p>
     * The account ID of the requester.
     * </p>
     * 
     * @param accountId
     *        The account ID of the requester.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The account ID of the requester.
     * </p>
     * 
     * @return The account ID of the requester.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The account ID of the requester.
     * </p>
     * 
     * @param accountId
     *        The account ID of the requester.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStorageLensConfigurationRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The S3 Storage Lens configuration.
     * </p>
     * 
     * @param storageLensConfiguration
     *        The S3 Storage Lens configuration.
     */

    public void setStorageLensConfiguration(StorageLensConfiguration storageLensConfiguration) {
        this.storageLensConfiguration = storageLensConfiguration;
    }

    /**
     * <p>
     * The S3 Storage Lens configuration.
     * </p>
     * 
     * @return The S3 Storage Lens configuration.
     */

    public StorageLensConfiguration getStorageLensConfiguration() {
        return this.storageLensConfiguration;
    }

    /**
     * <p>
     * The S3 Storage Lens configuration.
     * </p>
     * 
     * @param storageLensConfiguration
     *        The S3 Storage Lens configuration.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStorageLensConfigurationRequest withStorageLensConfiguration(StorageLensConfiguration storageLensConfiguration) {
        setStorageLensConfiguration(storageLensConfiguration);
        return this;
    }

    /**
     * <p>
     * The tag set of the S3 Storage Lens configuration.
     * </p>
     * <note>
     * <p>
     * You can set up to a maximum of 50 tags.
     * </p>
     * </note>
     * 
     * @return The tag set of the S3 Storage Lens configuration.</p> <note>
     *         <p>
     *         You can set up to a maximum of 50 tags.
     *         </p>
     */

    public java.util.List<StorageLensTag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tag set of the S3 Storage Lens configuration.
     * </p>
     * <note>
     * <p>
     * You can set up to a maximum of 50 tags.
     * </p>
     * </note>
     * 
     * @param tags
     *        The tag set of the S3 Storage Lens configuration.</p> <note>
     *        <p>
     *        You can set up to a maximum of 50 tags.
     *        </p>
     */

    public void setTags(java.util.Collection<StorageLensTag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<StorageLensTag>(tags);
    }

    /**
     * <p>
     * The tag set of the S3 Storage Lens configuration.
     * </p>
     * <note>
     * <p>
     * You can set up to a maximum of 50 tags.
     * </p>
     * </note>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tag set of the S3 Storage Lens configuration.</p> <note>
     *        <p>
     *        You can set up to a maximum of 50 tags.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStorageLensConfigurationRequest withTags(StorageLensTag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<StorageLensTag>(tags.length));
        }
        for (StorageLensTag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The tag set of the S3 Storage Lens configuration.
     * </p>
     * <note>
     * <p>
     * You can set up to a maximum of 50 tags.
     * </p>
     * </note>
     * 
     * @param tags
     *        The tag set of the S3 Storage Lens configuration.</p> <note>
     *        <p>
     *        You can set up to a maximum of 50 tags.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutStorageLensConfigurationRequest withTags(java.util.Collection<StorageLensTag> tags) {
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
        if (getConfigId() != null)
            sb.append("ConfigId: ").append(getConfigId()).append(",");
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getStorageLensConfiguration() != null)
            sb.append("StorageLensConfiguration: ").append(getStorageLensConfiguration()).append(",");
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

        if (obj instanceof PutStorageLensConfigurationRequest == false)
            return false;
        PutStorageLensConfigurationRequest other = (PutStorageLensConfigurationRequest) obj;
        if (other.getConfigId() == null ^ this.getConfigId() == null)
            return false;
        if (other.getConfigId() != null && other.getConfigId().equals(this.getConfigId()) == false)
            return false;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getStorageLensConfiguration() == null ^ this.getStorageLensConfiguration() == null)
            return false;
        if (other.getStorageLensConfiguration() != null && other.getStorageLensConfiguration().equals(this.getStorageLensConfiguration()) == false)
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

        hashCode = prime * hashCode + ((getConfigId() == null) ? 0 : getConfigId().hashCode());
        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getStorageLensConfiguration() == null) ? 0 : getStorageLensConfiguration().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public PutStorageLensConfigurationRequest clone() {
        return (PutStorageLensConfigurationRequest) super.clone();
    }

}
