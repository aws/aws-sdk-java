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
package com.amazonaws.services.omics.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateAnnotationStore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateAnnotationStoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A description for the store.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A name for the store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The genome reference for the store's annotations.
     * </p>
     */
    private ReferenceItem reference;
    /**
     * <p>
     * Server-side encryption (SSE) settings for the store.
     * </p>
     */
    private SseConfig sseConfig;
    /**
     * <p>
     * The annotation file format of the store.
     * </p>
     */
    private String storeFormat;
    /**
     * <p>
     * File parsing options for the annotation store.
     * </p>
     */
    private StoreOptions storeOptions;
    /**
     * <p>
     * Tags for the store.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A description for the store.
     * </p>
     * 
     * @param description
     *        A description for the store.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the store.
     * </p>
     * 
     * @return A description for the store.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the store.
     * </p>
     * 
     * @param description
     *        A description for the store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A name for the store.
     * </p>
     * 
     * @param name
     *        A name for the store.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A name for the store.
     * </p>
     * 
     * @return A name for the store.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A name for the store.
     * </p>
     * 
     * @param name
     *        A name for the store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The genome reference for the store's annotations.
     * </p>
     * 
     * @param reference
     *        The genome reference for the store's annotations.
     */

    public void setReference(ReferenceItem reference) {
        this.reference = reference;
    }

    /**
     * <p>
     * The genome reference for the store's annotations.
     * </p>
     * 
     * @return The genome reference for the store's annotations.
     */

    public ReferenceItem getReference() {
        return this.reference;
    }

    /**
     * <p>
     * The genome reference for the store's annotations.
     * </p>
     * 
     * @param reference
     *        The genome reference for the store's annotations.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreRequest withReference(ReferenceItem reference) {
        setReference(reference);
        return this;
    }

    /**
     * <p>
     * Server-side encryption (SSE) settings for the store.
     * </p>
     * 
     * @param sseConfig
     *        Server-side encryption (SSE) settings for the store.
     */

    public void setSseConfig(SseConfig sseConfig) {
        this.sseConfig = sseConfig;
    }

    /**
     * <p>
     * Server-side encryption (SSE) settings for the store.
     * </p>
     * 
     * @return Server-side encryption (SSE) settings for the store.
     */

    public SseConfig getSseConfig() {
        return this.sseConfig;
    }

    /**
     * <p>
     * Server-side encryption (SSE) settings for the store.
     * </p>
     * 
     * @param sseConfig
     *        Server-side encryption (SSE) settings for the store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreRequest withSseConfig(SseConfig sseConfig) {
        setSseConfig(sseConfig);
        return this;
    }

    /**
     * <p>
     * The annotation file format of the store.
     * </p>
     * 
     * @param storeFormat
     *        The annotation file format of the store.
     * @see StoreFormat
     */

    public void setStoreFormat(String storeFormat) {
        this.storeFormat = storeFormat;
    }

    /**
     * <p>
     * The annotation file format of the store.
     * </p>
     * 
     * @return The annotation file format of the store.
     * @see StoreFormat
     */

    public String getStoreFormat() {
        return this.storeFormat;
    }

    /**
     * <p>
     * The annotation file format of the store.
     * </p>
     * 
     * @param storeFormat
     *        The annotation file format of the store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StoreFormat
     */

    public CreateAnnotationStoreRequest withStoreFormat(String storeFormat) {
        setStoreFormat(storeFormat);
        return this;
    }

    /**
     * <p>
     * The annotation file format of the store.
     * </p>
     * 
     * @param storeFormat
     *        The annotation file format of the store.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see StoreFormat
     */

    public CreateAnnotationStoreRequest withStoreFormat(StoreFormat storeFormat) {
        this.storeFormat = storeFormat.toString();
        return this;
    }

    /**
     * <p>
     * File parsing options for the annotation store.
     * </p>
     * 
     * @param storeOptions
     *        File parsing options for the annotation store.
     */

    public void setStoreOptions(StoreOptions storeOptions) {
        this.storeOptions = storeOptions;
    }

    /**
     * <p>
     * File parsing options for the annotation store.
     * </p>
     * 
     * @return File parsing options for the annotation store.
     */

    public StoreOptions getStoreOptions() {
        return this.storeOptions;
    }

    /**
     * <p>
     * File parsing options for the annotation store.
     * </p>
     * 
     * @param storeOptions
     *        File parsing options for the annotation store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreRequest withStoreOptions(StoreOptions storeOptions) {
        setStoreOptions(storeOptions);
        return this;
    }

    /**
     * <p>
     * Tags for the store.
     * </p>
     * 
     * @return Tags for the store.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Tags for the store.
     * </p>
     * 
     * @param tags
     *        Tags for the store.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Tags for the store.
     * </p>
     * 
     * @param tags
     *        Tags for the store.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateAnnotationStoreRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateAnnotationStoreRequest addTagsEntry(String key, String value) {
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

    public CreateAnnotationStoreRequest clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getReference() != null)
            sb.append("Reference: ").append(getReference()).append(",");
        if (getSseConfig() != null)
            sb.append("SseConfig: ").append(getSseConfig()).append(",");
        if (getStoreFormat() != null)
            sb.append("StoreFormat: ").append(getStoreFormat()).append(",");
        if (getStoreOptions() != null)
            sb.append("StoreOptions: ").append(getStoreOptions()).append(",");
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

        if (obj instanceof CreateAnnotationStoreRequest == false)
            return false;
        CreateAnnotationStoreRequest other = (CreateAnnotationStoreRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getReference() == null ^ this.getReference() == null)
            return false;
        if (other.getReference() != null && other.getReference().equals(this.getReference()) == false)
            return false;
        if (other.getSseConfig() == null ^ this.getSseConfig() == null)
            return false;
        if (other.getSseConfig() != null && other.getSseConfig().equals(this.getSseConfig()) == false)
            return false;
        if (other.getStoreFormat() == null ^ this.getStoreFormat() == null)
            return false;
        if (other.getStoreFormat() != null && other.getStoreFormat().equals(this.getStoreFormat()) == false)
            return false;
        if (other.getStoreOptions() == null ^ this.getStoreOptions() == null)
            return false;
        if (other.getStoreOptions() != null && other.getStoreOptions().equals(this.getStoreOptions()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getReference() == null) ? 0 : getReference().hashCode());
        hashCode = prime * hashCode + ((getSseConfig() == null) ? 0 : getSseConfig().hashCode());
        hashCode = prime * hashCode + ((getStoreFormat() == null) ? 0 : getStoreFormat().hashCode());
        hashCode = prime * hashCode + ((getStoreOptions() == null) ? 0 : getStoreOptions().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateAnnotationStoreRequest clone() {
        return (CreateAnnotationStoreRequest) super.clone();
    }

}
