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
package com.amazonaws.services.elasticmapreduce.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * This input identifies a cluster and a list of tags to attach.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticmapreduce-2009-03-31/AddTags" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon EMR resource identifier to which tags will be added. This value must be a cluster identifier.
     * </p>
     */
    private String resourceId;
    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to EC2 instances. Tags are user-defined key/value pairs
     * that consist of a required key string with a maximum of 128 characters, and an optional value string with a
     * maximum of 256 characters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * Default constructor for AddTagsRequest object. Callers should use the setter or fluent setter (with...) methods
     * to initialize the object after creating it.
     */
    public AddTagsRequest() {
    }

    /**
     * Constructs a new AddTagsRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param resourceId
     *        The Amazon EMR resource identifier to which tags will be added. This value must be a cluster identifier.
     */
    public AddTagsRequest(String resourceId) {
        setResourceId(resourceId);
    }

    /**
     * Constructs a new AddTagsRequest object. Callers should use the setter or fluent setter (with...) methods to
     * initialize any additional object members.
     * 
     * @param resourceId
     *        The Amazon EMR resource identifier to which tags will be added. This value must be a cluster identifier.
     * @param tags
     *        A list of tags to associate with a cluster and propagate to EC2 instances. Tags are user-defined key/value
     *        pairs that consist of a required key string with a maximum of 128 characters, and an optional value string
     *        with a maximum of 256 characters.
     */
    public AddTagsRequest(String resourceId, java.util.List<Tag> tags) {
        setResourceId(resourceId);
        setTags(tags);
    }

    /**
     * <p>
     * The Amazon EMR resource identifier to which tags will be added. This value must be a cluster identifier.
     * </p>
     * 
     * @param resourceId
     *        The Amazon EMR resource identifier to which tags will be added. This value must be a cluster identifier.
     */

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    /**
     * <p>
     * The Amazon EMR resource identifier to which tags will be added. This value must be a cluster identifier.
     * </p>
     * 
     * @return The Amazon EMR resource identifier to which tags will be added. This value must be a cluster identifier.
     */

    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * <p>
     * The Amazon EMR resource identifier to which tags will be added. This value must be a cluster identifier.
     * </p>
     * 
     * @param resourceId
     *        The Amazon EMR resource identifier to which tags will be added. This value must be a cluster identifier.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsRequest withResourceId(String resourceId) {
        setResourceId(resourceId);
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to EC2 instances. Tags are user-defined key/value pairs
     * that consist of a required key string with a maximum of 128 characters, and an optional value string with a
     * maximum of 256 characters.
     * </p>
     * 
     * @return A list of tags to associate with a cluster and propagate to EC2 instances. Tags are user-defined
     *         key/value pairs that consist of a required key string with a maximum of 128 characters, and an optional
     *         value string with a maximum of 256 characters.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to EC2 instances. Tags are user-defined key/value pairs
     * that consist of a required key string with a maximum of 128 characters, and an optional value string with a
     * maximum of 256 characters.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with a cluster and propagate to EC2 instances. Tags are user-defined key/value
     *        pairs that consist of a required key string with a maximum of 128 characters, and an optional value string
     *        with a maximum of 256 characters.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<Tag>(tags);
    }

    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to EC2 instances. Tags are user-defined key/value pairs
     * that consist of a required key string with a maximum of 128 characters, and an optional value string with a
     * maximum of 256 characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with a cluster and propagate to EC2 instances. Tags are user-defined key/value
     *        pairs that consist of a required key string with a maximum of 128 characters, and an optional value string
     *        with a maximum of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of tags to associate with a cluster and propagate to EC2 instances. Tags are user-defined key/value pairs
     * that consist of a required key string with a maximum of 128 characters, and an optional value string with a
     * maximum of 256 characters.
     * </p>
     * 
     * @param tags
     *        A list of tags to associate with a cluster and propagate to EC2 instances. Tags are user-defined key/value
     *        pairs that consist of a required key string with a maximum of 128 characters, and an optional value string
     *        with a maximum of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceId() != null)
            sb.append("ResourceId: ").append(getResourceId()).append(",");
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

        if (obj instanceof AddTagsRequest == false)
            return false;
        AddTagsRequest other = (AddTagsRequest) obj;
        if (other.getResourceId() == null ^ this.getResourceId() == null)
            return false;
        if (other.getResourceId() != null && other.getResourceId().equals(this.getResourceId()) == false)
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

        hashCode = prime * hashCode + ((getResourceId() == null) ? 0 : getResourceId().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AddTagsRequest clone() {
        return (AddTagsRequest) super.clone();
    }

}
