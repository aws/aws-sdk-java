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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/omics-2022-11-28/CreateSequenceStore" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSequenceStoreRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A name for the store.
     * </p>
     */
    private String name;
    /**
     * <p>
     * A description for the store.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Server-side encryption (SSE) settings for the store.
     * </p>
     */
    private SseConfig sseConfig;
    /**
     * <p>
     * Tags for the store.
     * </p>
     */
    private java.util.Map<String, String> tags;
    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique token for each request.
     * </p>
     */
    private String clientToken;
    /**
     * <p>
     * An S3 location that is used to store files that have failed a direct upload.
     * </p>
     */
    private String fallbackLocation;
    /**
     * <p>
     * The ETag algorithm family to use for ingested read sets.
     * </p>
     */
    private String eTagAlgorithmFamily;

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

    public CreateSequenceStoreRequest withName(String name) {
        setName(name);
        return this;
    }

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

    public CreateSequenceStoreRequest withDescription(String description) {
        setDescription(description);
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

    public CreateSequenceStoreRequest withSseConfig(SseConfig sseConfig) {
        setSseConfig(sseConfig);
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

    public CreateSequenceStoreRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateSequenceStoreRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateSequenceStoreRequest addTagsEntry(String key, String value) {
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

    public CreateSequenceStoreRequest clearTagsEntries() {
        this.tags = null;
        return this;
    }

    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique token for each request.
     * </p>
     * 
     * @param clientToken
     *        To ensure that requests don't run multiple times, specify a unique token for each request.
     */

    public void setClientToken(String clientToken) {
        this.clientToken = clientToken;
    }

    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique token for each request.
     * </p>
     * 
     * @return To ensure that requests don't run multiple times, specify a unique token for each request.
     */

    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * <p>
     * To ensure that requests don't run multiple times, specify a unique token for each request.
     * </p>
     * 
     * @param clientToken
     *        To ensure that requests don't run multiple times, specify a unique token for each request.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSequenceStoreRequest withClientToken(String clientToken) {
        setClientToken(clientToken);
        return this;
    }

    /**
     * <p>
     * An S3 location that is used to store files that have failed a direct upload.
     * </p>
     * 
     * @param fallbackLocation
     *        An S3 location that is used to store files that have failed a direct upload.
     */

    public void setFallbackLocation(String fallbackLocation) {
        this.fallbackLocation = fallbackLocation;
    }

    /**
     * <p>
     * An S3 location that is used to store files that have failed a direct upload.
     * </p>
     * 
     * @return An S3 location that is used to store files that have failed a direct upload.
     */

    public String getFallbackLocation() {
        return this.fallbackLocation;
    }

    /**
     * <p>
     * An S3 location that is used to store files that have failed a direct upload.
     * </p>
     * 
     * @param fallbackLocation
     *        An S3 location that is used to store files that have failed a direct upload.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSequenceStoreRequest withFallbackLocation(String fallbackLocation) {
        setFallbackLocation(fallbackLocation);
        return this;
    }

    /**
     * <p>
     * The ETag algorithm family to use for ingested read sets.
     * </p>
     * 
     * @param eTagAlgorithmFamily
     *        The ETag algorithm family to use for ingested read sets.
     * @see ETagAlgorithmFamily
     */

    public void setETagAlgorithmFamily(String eTagAlgorithmFamily) {
        this.eTagAlgorithmFamily = eTagAlgorithmFamily;
    }

    /**
     * <p>
     * The ETag algorithm family to use for ingested read sets.
     * </p>
     * 
     * @return The ETag algorithm family to use for ingested read sets.
     * @see ETagAlgorithmFamily
     */

    public String getETagAlgorithmFamily() {
        return this.eTagAlgorithmFamily;
    }

    /**
     * <p>
     * The ETag algorithm family to use for ingested read sets.
     * </p>
     * 
     * @param eTagAlgorithmFamily
     *        The ETag algorithm family to use for ingested read sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ETagAlgorithmFamily
     */

    public CreateSequenceStoreRequest withETagAlgorithmFamily(String eTagAlgorithmFamily) {
        setETagAlgorithmFamily(eTagAlgorithmFamily);
        return this;
    }

    /**
     * <p>
     * The ETag algorithm family to use for ingested read sets.
     * </p>
     * 
     * @param eTagAlgorithmFamily
     *        The ETag algorithm family to use for ingested read sets.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see ETagAlgorithmFamily
     */

    public CreateSequenceStoreRequest withETagAlgorithmFamily(ETagAlgorithmFamily eTagAlgorithmFamily) {
        this.eTagAlgorithmFamily = eTagAlgorithmFamily.toString();
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getSseConfig() != null)
            sb.append("SseConfig: ").append(getSseConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags()).append(",");
        if (getClientToken() != null)
            sb.append("ClientToken: ").append(getClientToken()).append(",");
        if (getFallbackLocation() != null)
            sb.append("FallbackLocation: ").append(getFallbackLocation()).append(",");
        if (getETagAlgorithmFamily() != null)
            sb.append("ETagAlgorithmFamily: ").append(getETagAlgorithmFamily());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateSequenceStoreRequest == false)
            return false;
        CreateSequenceStoreRequest other = (CreateSequenceStoreRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getSseConfig() == null ^ this.getSseConfig() == null)
            return false;
        if (other.getSseConfig() != null && other.getSseConfig().equals(this.getSseConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        if (other.getClientToken() == null ^ this.getClientToken() == null)
            return false;
        if (other.getClientToken() != null && other.getClientToken().equals(this.getClientToken()) == false)
            return false;
        if (other.getFallbackLocation() == null ^ this.getFallbackLocation() == null)
            return false;
        if (other.getFallbackLocation() != null && other.getFallbackLocation().equals(this.getFallbackLocation()) == false)
            return false;
        if (other.getETagAlgorithmFamily() == null ^ this.getETagAlgorithmFamily() == null)
            return false;
        if (other.getETagAlgorithmFamily() != null && other.getETagAlgorithmFamily().equals(this.getETagAlgorithmFamily()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getSseConfig() == null) ? 0 : getSseConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        hashCode = prime * hashCode + ((getClientToken() == null) ? 0 : getClientToken().hashCode());
        hashCode = prime * hashCode + ((getFallbackLocation() == null) ? 0 : getFallbackLocation().hashCode());
        hashCode = prime * hashCode + ((getETagAlgorithmFamily() == null) ? 0 : getETagAlgorithmFamily().hashCode());
        return hashCode;
    }

    @Override
    public CreateSequenceStoreRequest clone() {
        return (CreateSequenceStoreRequest) super.clone();
    }

}
