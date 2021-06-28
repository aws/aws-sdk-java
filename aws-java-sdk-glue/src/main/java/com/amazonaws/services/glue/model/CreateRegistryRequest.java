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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/CreateRegistry" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRegistryRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Name of the registry to be created of max length of 255, and may only contain letters, numbers, hyphen,
     * underscore, dollar sign, or hash mark. No whitespace.
     * </p>
     */
    private String registryName;
    /**
     * <p>
     * A description of the registry. If description is not provided, there will not be any default value for this.
     * </p>
     */
    private String description;
    /**
     * <p>
     * Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or API.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * Name of the registry to be created of max length of 255, and may only contain letters, numbers, hyphen,
     * underscore, dollar sign, or hash mark. No whitespace.
     * </p>
     * 
     * @param registryName
     *        Name of the registry to be created of max length of 255, and may only contain letters, numbers, hyphen,
     *        underscore, dollar sign, or hash mark. No whitespace.
     */

    public void setRegistryName(String registryName) {
        this.registryName = registryName;
    }

    /**
     * <p>
     * Name of the registry to be created of max length of 255, and may only contain letters, numbers, hyphen,
     * underscore, dollar sign, or hash mark. No whitespace.
     * </p>
     * 
     * @return Name of the registry to be created of max length of 255, and may only contain letters, numbers, hyphen,
     *         underscore, dollar sign, or hash mark. No whitespace.
     */

    public String getRegistryName() {
        return this.registryName;
    }

    /**
     * <p>
     * Name of the registry to be created of max length of 255, and may only contain letters, numbers, hyphen,
     * underscore, dollar sign, or hash mark. No whitespace.
     * </p>
     * 
     * @param registryName
     *        Name of the registry to be created of max length of 255, and may only contain letters, numbers, hyphen,
     *        underscore, dollar sign, or hash mark. No whitespace.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistryRequest withRegistryName(String registryName) {
        setRegistryName(registryName);
        return this;
    }

    /**
     * <p>
     * A description of the registry. If description is not provided, there will not be any default value for this.
     * </p>
     * 
     * @param description
     *        A description of the registry. If description is not provided, there will not be any default value for
     *        this.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the registry. If description is not provided, there will not be any default value for this.
     * </p>
     * 
     * @return A description of the registry. If description is not provided, there will not be any default value for
     *         this.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the registry. If description is not provided, there will not be any default value for this.
     * </p>
     * 
     * @param description
     *        A description of the registry. If description is not provided, there will not be any default value for
     *        this.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistryRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or API.
     * </p>
     * 
     * @return Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or
     *         API.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or API.
     * </p>
     * 
     * @param tags
     *        Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or
     *        API.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or API.
     * </p>
     * 
     * @param tags
     *        Amazon Web Services tags that contain a key value pair and may be searched by console, command line, or
     *        API.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistryRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRegistryRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRegistryRequest addTagsEntry(String key, String value) {
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

    public CreateRegistryRequest clearTagsEntries() {
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
        if (getRegistryName() != null)
            sb.append("RegistryName: ").append(getRegistryName()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
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

        if (obj instanceof CreateRegistryRequest == false)
            return false;
        CreateRegistryRequest other = (CreateRegistryRequest) obj;
        if (other.getRegistryName() == null ^ this.getRegistryName() == null)
            return false;
        if (other.getRegistryName() != null && other.getRegistryName().equals(this.getRegistryName()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
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

        hashCode = prime * hashCode + ((getRegistryName() == null) ? 0 : getRegistryName().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRegistryRequest clone() {
        return (CreateRegistryRequest) super.clone();
    }

}
