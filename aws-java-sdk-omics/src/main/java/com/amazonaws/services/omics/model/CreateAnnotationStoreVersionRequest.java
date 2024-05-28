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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateAnnotationStoreVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAnnotationStoreVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of an annotation store version from which versions are being created.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The name given to an annotation store version to distinguish it from other versions.
     * </p>
     */
    private String versionName;
    /**
     * <p>
     * The description of an annotation store version.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The options for an annotation store version.
     * </p>
     */
    private VersionOptions versionOptions;
    /**
     * <p>
     * Any tags added to annotation store version.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The name of an annotation store version from which versions are being created.
     * </p>
     * 
     * @param name
     *        The name of an annotation store version from which versions are being created.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of an annotation store version from which versions are being created.
     * </p>
     * 
     * @return The name of an annotation store version from which versions are being created.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of an annotation store version from which versions are being created.
     * </p>
     * 
     * @param name
     *        The name of an annotation store version from which versions are being created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreVersionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The name given to an annotation store version to distinguish it from other versions.
     * </p>
     * 
     * @param versionName
     *        The name given to an annotation store version to distinguish it from other versions.
     */

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    /**
     * <p>
     * The name given to an annotation store version to distinguish it from other versions.
     * </p>
     * 
     * @return The name given to an annotation store version to distinguish it from other versions.
     */

    public String getVersionName() {
        return this.versionName;
    }

    /**
     * <p>
     * The name given to an annotation store version to distinguish it from other versions.
     * </p>
     * 
     * @param versionName
     *        The name given to an annotation store version to distinguish it from other versions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreVersionRequest withVersionName(String versionName) {
        setVersionName(versionName);
        return this;
    }

    /**
     * <p>
     * The description of an annotation store version.
     * </p>
     * 
     * @param description
     *        The description of an annotation store version.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of an annotation store version.
     * </p>
     * 
     * @return The description of an annotation store version.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of an annotation store version.
     * </p>
     * 
     * @param description
     *        The description of an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreVersionRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The options for an annotation store version.
     * </p>
     * 
     * @param versionOptions
     *        The options for an annotation store version.
     */

    public void setVersionOptions(VersionOptions versionOptions) {
        this.versionOptions = versionOptions;
    }

    /**
     * <p>
     * The options for an annotation store version.
     * </p>
     * 
     * @return The options for an annotation store version.
     */

    public VersionOptions getVersionOptions() {
        return this.versionOptions;
    }

    /**
     * <p>
     * The options for an annotation store version.
     * </p>
     * 
     * @param versionOptions
     *        The options for an annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreVersionRequest withVersionOptions(VersionOptions versionOptions) {
        setVersionOptions(versionOptions);
        return this;
    }

    /**
     * <p>
     * Any tags added to annotation store version.
     * </p>
     * 
     * @return Any tags added to annotation store version.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Any tags added to annotation store version.
     * </p>
     * 
     * @param tags
     *        Any tags added to annotation store version.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Any tags added to annotation store version.
     * </p>
     * 
     * @param tags
     *        Any tags added to annotation store version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreVersionRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAnnotationStoreVersionRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreVersionRequest addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreVersionRequest clearTagsEntries() {
        this.tags = null;
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
        if (getVersionName() != null)
            sb.append("VersionName: ").append(getVersionName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getVersionOptions() != null)
            sb.append("VersionOptions: ").append(getVersionOptions()).append(",");
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

        if (obj instanceof CreateAnnotationStoreVersionRequest == false)
            return false;
        CreateAnnotationStoreVersionRequest other = (CreateAnnotationStoreVersionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getVersionName() == null ^ this.getVersionName() == null)
            return false;
        if (other.getVersionName() != null && other.getVersionName().equals(this.getVersionName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getVersionOptions() == null ^ this.getVersionOptions() == null)
            return false;
        if (other.getVersionOptions() != null && other.getVersionOptions().equals(this.getVersionOptions()) == false)
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

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getVersionName() == null) ? 0 : getVersionName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getVersionOptions() == null) ? 0 : getVersionOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAnnotationStoreVersionRequest clone() {
        return (CreateAnnotationStoreVersionRequest) super.clone();
    }

}
