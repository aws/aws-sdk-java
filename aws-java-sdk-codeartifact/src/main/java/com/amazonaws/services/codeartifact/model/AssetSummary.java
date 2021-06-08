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
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Contains details about a package version asset.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/AssetSummary" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AssetSummary implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the asset.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The size of the asset.
     * </p>
     */
    private Long size;
    /**
     * <p>
     * The hashes of the asset.
     * </p>
     */
    private java.util.Map<String, String> hashes;

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @param name
     *        The name of the asset.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @return The name of the asset.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the asset.
     * </p>
     * 
     * @param name
     *        The name of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetSummary withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The size of the asset.
     * </p>
     * 
     * @param size
     *        The size of the asset.
     */

    public void setSize(Long size) {
        this.size = size;
    }

    /**
     * <p>
     * The size of the asset.
     * </p>
     * 
     * @return The size of the asset.
     */

    public Long getSize() {
        return this.size;
    }

    /**
     * <p>
     * The size of the asset.
     * </p>
     * 
     * @param size
     *        The size of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetSummary withSize(Long size) {
        setSize(size);
        return this;
    }

    /**
     * <p>
     * The hashes of the asset.
     * </p>
     * 
     * @return The hashes of the asset.
     */

    public java.util.Map<String, String> getHashes() {
        return hashes;
    }

    /**
     * <p>
     * The hashes of the asset.
     * </p>
     * 
     * @param hashes
     *        The hashes of the asset.
     */

    public void setHashes(java.util.Map<String, String> hashes) {
        this.hashes = hashes;
    }

    /**
     * <p>
     * The hashes of the asset.
     * </p>
     * 
     * @param hashes
     *        The hashes of the asset.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetSummary withHashes(java.util.Map<String, String> hashes) {
        setHashes(hashes);
        return this;
    }

    /**
     * Add a single Hashes entry
     *
     * @see AssetSummary#withHashes
     * @returns a reference to this object so that method calls can be chained together.
     */

    public AssetSummary addHashesEntry(String key, String value) {
        if (null == this.hashes) {
            this.hashes = new java.util.HashMap<String, String>();
        }
        if (this.hashes.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.hashes.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Hashes.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AssetSummary clearHashesEntries() {
        this.hashes = null;
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
        if (getSize() != null)
            sb.append("Size: ").append(getSize()).append(",");
        if (getHashes() != null)
            sb.append("Hashes: ").append(getHashes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AssetSummary == false)
            return false;
        AssetSummary other = (AssetSummary) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSize() == null ^ this.getSize() == null)
            return false;
        if (other.getSize() != null && other.getSize().equals(this.getSize()) == false)
            return false;
        if (other.getHashes() == null ^ this.getHashes() == null)
            return false;
        if (other.getHashes() != null && other.getHashes().equals(this.getHashes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSize() == null) ? 0 : getSize().hashCode());
        hashCode = prime * hashCode + ((getHashes() == null) ? 0 : getHashes().hashCode());
        return hashCode;
    }

    @Override
    public AssetSummary clone() {
        try {
            return (AssetSummary) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.codeartifact.model.transform.AssetSummaryMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
