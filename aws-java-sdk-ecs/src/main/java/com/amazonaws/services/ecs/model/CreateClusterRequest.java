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
package com.amazonaws.services.ecs.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/ecs-2014-11-13/CreateCluster" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateClusterRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of your cluster. If you do not specify a name for your cluster, you create a cluster named
     * <code>default</code>. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     */
    private String clusterName;
    /**
     * <p>
     * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters,
     * and tag values can have a maximum length of 256 characters.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The name of your cluster. If you do not specify a name for your cluster, you create a cluster named
     * <code>default</code>. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @param clusterName
     *        The name of your cluster. If you do not specify a name for your cluster, you create a cluster named
     *        <code>default</code>. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     *        allowed.
     */

    public void setClusterName(String clusterName) {
        this.clusterName = clusterName;
    }

    /**
     * <p>
     * The name of your cluster. If you do not specify a name for your cluster, you create a cluster named
     * <code>default</code>. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @return The name of your cluster. If you do not specify a name for your cluster, you create a cluster named
     *         <code>default</code>. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     *         allowed.
     */

    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * <p>
     * The name of your cluster. If you do not specify a name for your cluster, you create a cluster named
     * <code>default</code>. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are allowed.
     * </p>
     * 
     * @param clusterName
     *        The name of your cluster. If you do not specify a name for your cluster, you create a cluster named
     *        <code>default</code>. Up to 255 letters (uppercase and lowercase), numbers, hyphens, and underscores are
     *        allowed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withClusterName(String clusterName) {
        setClusterName(clusterName);
        return this;
    }

    /**
     * <p>
     * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters,
     * and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @return The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of
     *         a key and an optional value, both of which you define. Tag keys can have a maximum character length of
     *         128 characters, and tag values can have a maximum length of 256 characters.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters,
     * and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of
     *        a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     *        characters, and tag values can have a maximum length of 256 characters.
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
     * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters,
     * and tag values can have a maximum length of 256 characters.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of
     *        a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     *        characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withTags(Tag... tags) {
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
     * The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of a key
     * and an optional value, both of which you define. Tag keys can have a maximum character length of 128 characters,
     * and tag values can have a maximum length of 256 characters.
     * </p>
     * 
     * @param tags
     *        The metadata that you apply to the cluster to help you categorize and organize them. Each tag consists of
     *        a key and an optional value, both of which you define. Tag keys can have a maximum character length of 128
     *        characters, and tag values can have a maximum length of 256 characters.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateClusterRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getClusterName() != null)
            sb.append("ClusterName: ").append(getClusterName()).append(",");
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

        if (obj instanceof CreateClusterRequest == false)
            return false;
        CreateClusterRequest other = (CreateClusterRequest) obj;
        if (other.getClusterName() == null ^ this.getClusterName() == null)
            return false;
        if (other.getClusterName() != null && other.getClusterName().equals(this.getClusterName()) == false)
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

        hashCode = prime * hashCode + ((getClusterName() == null) ? 0 : getClusterName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateClusterRequest clone() {
        return (CreateClusterRequest) super.clone();
    }

}
