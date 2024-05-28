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
package com.amazonaws.services.appintegrations.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration for what files should be pulled from the source.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/appintegrations-2020-07-29/FileConfiguration" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class FileConfiguration implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Identifiers for the source folders to pull all files from recursively.
     * </p>
     */
    private java.util.List<String> folders;
    /**
     * <p>
     * Restrictions for what files should be pulled from the source.
     * </p>
     */
    private java.util.Map<String, java.util.List<String>> filters;

    /**
     * <p>
     * Identifiers for the source folders to pull all files from recursively.
     * </p>
     * 
     * @return Identifiers for the source folders to pull all files from recursively.
     */

    public java.util.List<String> getFolders() {
        return folders;
    }

    /**
     * <p>
     * Identifiers for the source folders to pull all files from recursively.
     * </p>
     * 
     * @param folders
     *        Identifiers for the source folders to pull all files from recursively.
     */

    public void setFolders(java.util.Collection<String> folders) {
        if (folders == null) {
            this.folders = null;
            return;
        }

        this.folders = new java.util.ArrayList<String>(folders);
    }

    /**
     * <p>
     * Identifiers for the source folders to pull all files from recursively.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setFolders(java.util.Collection)} or {@link #withFolders(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param folders
     *        Identifiers for the source folders to pull all files from recursively.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileConfiguration withFolders(String... folders) {
        if (this.folders == null) {
            setFolders(new java.util.ArrayList<String>(folders.length));
        }
        for (String ele : folders) {
            this.folders.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Identifiers for the source folders to pull all files from recursively.
     * </p>
     * 
     * @param folders
     *        Identifiers for the source folders to pull all files from recursively.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileConfiguration withFolders(java.util.Collection<String> folders) {
        setFolders(folders);
        return this;
    }

    /**
     * <p>
     * Restrictions for what files should be pulled from the source.
     * </p>
     * 
     * @return Restrictions for what files should be pulled from the source.
     */

    public java.util.Map<String, java.util.List<String>> getFilters() {
        return filters;
    }

    /**
     * <p>
     * Restrictions for what files should be pulled from the source.
     * </p>
     * 
     * @param filters
     *        Restrictions for what files should be pulled from the source.
     */

    public void setFilters(java.util.Map<String, java.util.List<String>> filters) {
        this.filters = filters;
    }

    /**
     * <p>
     * Restrictions for what files should be pulled from the source.
     * </p>
     * 
     * @param filters
     *        Restrictions for what files should be pulled from the source.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileConfiguration withFilters(java.util.Map<String, java.util.List<String>> filters) {
        setFilters(filters);
        return this;
    }

    /**
     * Add a single Filters entry
     *
     * @see FileConfiguration#withFilters
     * @returns a reference to this object so that method calls can be chained together.
     */

    public FileConfiguration addFiltersEntry(String key, java.util.List<String> value) {
        if (null == this.filters) {
            this.filters = new java.util.HashMap<String, java.util.List<String>>();
        }
        if (this.filters.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.filters.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Filters.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public FileConfiguration clearFiltersEntries() {
        this.filters = null;
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
        if (getFolders() != null)
            sb.append("Folders: ").append(getFolders()).append(",");
        if (getFilters() != null)
            sb.append("Filters: ").append(getFilters());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof FileConfiguration == false)
            return false;
        FileConfiguration other = (FileConfiguration) obj;
        if (other.getFolders() == null ^ this.getFolders() == null)
            return false;
        if (other.getFolders() != null && other.getFolders().equals(this.getFolders()) == false)
            return false;
        if (other.getFilters() == null ^ this.getFilters() == null)
            return false;
        if (other.getFilters() != null && other.getFilters().equals(this.getFilters()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getFolders() == null) ? 0 : getFolders().hashCode());
        hashCode = prime * hashCode + ((getFilters() == null) ? 0 : getFilters().hashCode());
        return hashCode;
    }

    @Override
    public FileConfiguration clone() {
        try {
            return (FileConfiguration) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.appintegrations.model.transform.FileConfigurationMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
