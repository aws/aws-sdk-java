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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/s3control-2018-08-20/GetStorageLensConfigurationTagging"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetStorageLensConfigurationTaggingResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.services.s3control.S3ControlResponseMetadata>
        implements Serializable, Cloneable {

    /**
     * <p>
     * The tags of S3 Storage Lens configuration requested.
     * </p>
     */
    private java.util.List<StorageLensTag> tags;

    /**
     * <p>
     * The tags of S3 Storage Lens configuration requested.
     * </p>
     * 
     * @return The tags of S3 Storage Lens configuration requested.
     */

    public java.util.List<StorageLensTag> getTags() {
        return tags;
    }

    /**
     * <p>
     * The tags of S3 Storage Lens configuration requested.
     * </p>
     * 
     * @param tags
     *        The tags of S3 Storage Lens configuration requested.
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
     * The tags of S3 Storage Lens configuration requested.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The tags of S3 Storage Lens configuration requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageLensConfigurationTaggingResult withTags(StorageLensTag... tags) {
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
     * The tags of S3 Storage Lens configuration requested.
     * </p>
     * 
     * @param tags
     *        The tags of S3 Storage Lens configuration requested.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetStorageLensConfigurationTaggingResult withTags(java.util.Collection<StorageLensTag> tags) {
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

        if (obj instanceof GetStorageLensConfigurationTaggingResult == false)
            return false;
        GetStorageLensConfigurationTaggingResult other = (GetStorageLensConfigurationTaggingResult) obj;
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

        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetStorageLensConfigurationTaggingResult clone() {
        try {
            return (GetStorageLensConfigurationTaggingResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
