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
package com.amazonaws.services.mq.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * A map of the key-value pairs for the resource tag.
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/mq-2017-11-27/CreateTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /** The Amazon Resource Name (ARN) of the resource tag. */
    private String resourceArn;
    /** The key-value pair for the resource tag. */
    private java.util.Map<String, String> tags;

    /**
     * The Amazon Resource Name (ARN) of the resource tag.
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource tag.
     */

    public void setResourceArn(String resourceArn) {
        this.resourceArn = resourceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the resource tag.
     * 
     * @return The Amazon Resource Name (ARN) of the resource tag.
     */

    public String getResourceArn() {
        return this.resourceArn;
    }

    /**
     * The Amazon Resource Name (ARN) of the resource tag.
     * 
     * @param resourceArn
     *        The Amazon Resource Name (ARN) of the resource tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTagsRequest withResourceArn(String resourceArn) {
        setResourceArn(resourceArn);
        return this;
    }

    /**
     * The key-value pair for the resource tag.
     * 
     * @return The key-value pair for the resource tag.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * The key-value pair for the resource tag.
     * 
     * @param tags
     *        The key-value pair for the resource tag.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * The key-value pair for the resource tag.
     * 
     * @param tags
     *        The key-value pair for the resource tag.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateTagsRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    public CreateTagsRequest addTagsEntry(String key, String value) {
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

    public CreateTagsRequest clearTagsEntries() {
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
        if (getResourceArn() != null)
            sb.append("ResourceArn: ").append(getResourceArn()).append(",");
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

        if (obj instanceof CreateTagsRequest == false)
            return false;
        CreateTagsRequest other = (CreateTagsRequest) obj;
        if (other.getResourceArn() == null ^ this.getResourceArn() == null)
            return false;
        if (other.getResourceArn() != null && other.getResourceArn().equals(this.getResourceArn()) == false)
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

        hashCode = prime * hashCode + ((getResourceArn() == null) ? 0 : getResourceArn().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateTagsRequest clone() {
        return (CreateTagsRequest) super.clone();
    }

}
