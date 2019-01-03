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
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Represents the input of an AddTagsToResource operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticache-2015-02-02/AddTagsToResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AddTagsToResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to which the tags are to be added, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code> or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>. ElastiCache resources are
     * <i>cluster</i> and <i>snapshot</i>.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a>.
     * </p>
     */
    private String resourceName;
    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. A tag is a key-value pair. A tag key must be
     * accompanied by a tag value.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<Tag> tags;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to which the tags are to be added, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code> or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>. ElastiCache resources are
     * <i>cluster</i> and <i>snapshot</i>.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon Resource Name (ARN) of the resource to which the tags are to be added, for example
     *        <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code> or
     *        <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>. ElastiCache resources are
     *        <i>cluster</i> and <i>snapshot</i>.</p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     */

    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to which the tags are to be added, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code> or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>. ElastiCache resources are
     * <i>cluster</i> and <i>snapshot</i>.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource to which the tags are to be added, for example
     *         <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code> or
     *         <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>. ElastiCache resources are
     *         <i>cluster</i> and <i>snapshot</i>.</p>
     *         <p>
     *         For more information about ARNs, see <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *         (ARNs) and AWS Service Namespaces</a>.
     */

    public String getResourceName() {
        return this.resourceName;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource to which the tags are to be added, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code> or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>. ElastiCache resources are
     * <i>cluster</i> and <i>snapshot</i>.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon Resource Name (ARN) of the resource to which the tags are to be added, for example
     *        <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code> or
     *        <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>. ElastiCache resources are
     *        <i>cluster</i> and <i>snapshot</i>.</p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsToResourceRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. A tag is a key-value pair. A tag key must be
     * accompanied by a tag value.
     * </p>
     * 
     * @return A list of cost allocation tags to be added to this resource. A tag is a key-value pair. A tag key must be
     *         accompanied by a tag value.
     */

    public java.util.List<Tag> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<Tag>();
        }
        return tags;
    }

    /**
     * <p>
     * A list of cost allocation tags to be added to this resource. A tag is a key-value pair. A tag key must be
     * accompanied by a tag value.
     * </p>
     * 
     * @param tags
     *        A list of cost allocation tags to be added to this resource. A tag is a key-value pair. A tag key must be
     *        accompanied by a tag value.
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
     * A list of cost allocation tags to be added to this resource. A tag is a key-value pair. A tag key must be
     * accompanied by a tag value.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of cost allocation tags to be added to this resource. A tag is a key-value pair. A tag key must be
     *        accompanied by a tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsToResourceRequest withTags(Tag... tags) {
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
     * A list of cost allocation tags to be added to this resource. A tag is a key-value pair. A tag key must be
     * accompanied by a tag value.
     * </p>
     * 
     * @param tags
     *        A list of cost allocation tags to be added to this resource. A tag is a key-value pair. A tag key must be
     *        accompanied by a tag value.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AddTagsToResourceRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getResourceName() != null)
            sb.append("ResourceName: ").append(getResourceName()).append(",");
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

        if (obj instanceof AddTagsToResourceRequest == false)
            return false;
        AddTagsToResourceRequest other = (AddTagsToResourceRequest) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
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

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public AddTagsToResourceRequest clone() {
        return (AddTagsToResourceRequest) super.clone();
    }

}
