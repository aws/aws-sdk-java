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
package com.amazonaws.services.workdocs.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/workdocs-2016-05-01/GetFolder" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetFolderResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The metadata of the folder.
     * </p>
     */
    private FolderMetadata metadata;
    /**
     * <p>
     * The custom metadata on the folder.
     * </p>
     */
    private java.util.Map<String, String> customMetadata;

    /**
     * <p>
     * The metadata of the folder.
     * </p>
     * 
     * @param metadata
     *        The metadata of the folder.
     */

    public void setMetadata(FolderMetadata metadata) {
        this.metadata = metadata;
    }

    /**
     * <p>
     * The metadata of the folder.
     * </p>
     * 
     * @return The metadata of the folder.
     */

    public FolderMetadata getMetadata() {
        return this.metadata;
    }

    /**
     * <p>
     * The metadata of the folder.
     * </p>
     * 
     * @param metadata
     *        The metadata of the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderResult withMetadata(FolderMetadata metadata) {
        setMetadata(metadata);
        return this;
    }

    /**
     * <p>
     * The custom metadata on the folder.
     * </p>
     * 
     * @return The custom metadata on the folder.
     */

    public java.util.Map<String, String> getCustomMetadata() {
        return customMetadata;
    }

    /**
     * <p>
     * The custom metadata on the folder.
     * </p>
     * 
     * @param customMetadata
     *        The custom metadata on the folder.
     */

    public void setCustomMetadata(java.util.Map<String, String> customMetadata) {
        this.customMetadata = customMetadata;
    }

    /**
     * <p>
     * The custom metadata on the folder.
     * </p>
     * 
     * @param customMetadata
     *        The custom metadata on the folder.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderResult withCustomMetadata(java.util.Map<String, String> customMetadata) {
        setCustomMetadata(customMetadata);
        return this;
    }

    public GetFolderResult addCustomMetadataEntry(String key, String value) {
        if (null == this.customMetadata) {
            this.customMetadata = new java.util.HashMap<String, String>();
        }
        if (this.customMetadata.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.customMetadata.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into CustomMetadata.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetFolderResult clearCustomMetadataEntries() {
        this.customMetadata = null;
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
        if (getMetadata() != null)
            sb.append("Metadata: ").append(getMetadata()).append(",");
        if (getCustomMetadata() != null)
            sb.append("CustomMetadata: ").append(getCustomMetadata());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetFolderResult == false)
            return false;
        GetFolderResult other = (GetFolderResult) obj;
        if (other.getMetadata() == null ^ this.getMetadata() == null)
            return false;
        if (other.getMetadata() != null && other.getMetadata().equals(this.getMetadata()) == false)
            return false;
        if (other.getCustomMetadata() == null ^ this.getCustomMetadata() == null)
            return false;
        if (other.getCustomMetadata() != null && other.getCustomMetadata().equals(this.getCustomMetadata()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetadata() == null) ? 0 : getMetadata().hashCode());
        hashCode = prime * hashCode + ((getCustomMetadata() == null) ? 0 : getCustomMetadata().hashCode());
        return hashCode;
    }

    @Override
    public GetFolderResult clone() {
        try {
            return (GetFolderResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
