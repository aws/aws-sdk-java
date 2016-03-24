/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License").
 * You may not use this file except in compliance with the License.
 * A copy of the License is located at
 * 
 *  http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed
 * on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing
 * permissions and limitations under the License.
 */
package com.amazonaws.services.elasticache.model;

import java.io.Serializable;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#addTagsToResource(AddTagsToResourceRequest) AddTagsToResource operation}.
 * <p>
 * The <i>AddTagsToResource</i> action adds up to 10 cost allocation tags
 * to the named resource. A
 * <i>cost allocation tag</i> is a key-value pair
 * where the key and value are case-sensitive. Cost allocation tags can
 * be used to categorize and track your AWS costs.
 * </p>
 * <p>
 * When you apply tags to your ElastiCache resources, AWS generates a
 * cost allocation report as a comma-separated value (CSV) file with your
 * usage and costs aggregated by your tags. You can apply tags that
 * represent business categories (such as cost centers, application
 * names, or owners) to organize your costs across multiple services. For
 * more information, see
 * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/Tagging.html"> Using Cost Allocation Tags in Amazon ElastiCache </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#addTagsToResource(AddTagsToResourceRequest)
 */
public class AddTagsToResourceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) of the resource to which the tags are
     * to be added, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * <p>For more information on ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a>.
     */
    private String resourceName;

    /**
     * A list of cost allocation tags to be added to this resource. A tag is
     * a key-value pair. A tag key must be accompanied by a tag value.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tags;

    /**
     * The Amazon Resource Name (ARN) of the resource to which the tags are
     * to be added, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * <p>For more information on ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a>.
     *
     * @return The Amazon Resource Name (ARN) of the resource to which the tags are
     *         to be added, for example
     *         <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     *         or
     *         <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     *         <p>For more information on ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a>.
     */
    public String getResourceName() {
        return resourceName;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the resource to which the tags are
     * to be added, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * <p>For more information on ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a>.
     *
     * @param resourceName The Amazon Resource Name (ARN) of the resource to which the tags are
     *         to be added, for example
     *         <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     *         or
     *         <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     *         <p>For more information on ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a>.
     */
    public void setResourceName(String resourceName) {
        this.resourceName = resourceName;
    }
    
    /**
     * The Amazon Resource Name (ARN) of the resource to which the tags are
     * to be added, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * <p>For more information on ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceName The Amazon Resource Name (ARN) of the resource to which the tags are
     *         to be added, for example
     *         <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     *         or
     *         <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     *         <p>For more information on ARNs, go to <a
     *         href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     *         Resource Names (ARNs) and AWS Service Namespaces</a>.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToResourceRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * A list of cost allocation tags to be added to this resource. A tag is
     * a key-value pair. A tag key must be accompanied by a tag value.
     *
     * @return A list of cost allocation tags to be added to this resource. A tag is
     *         a key-value pair. A tag key must be accompanied by a tag value.
     */
    public java.util.List<Tag> getTags() {
        if (tags == null) {
              tags = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>();
              tags.setAutoConstruct(true);
        }
        return tags;
    }
    
    /**
     * A list of cost allocation tags to be added to this resource. A tag is
     * a key-value pair. A tag key must be accompanied by a tag value.
     *
     * @param tags A list of cost allocation tags to be added to this resource. A tag is
     *         a key-value pair. A tag key must be accompanied by a tag value.
     */
    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
        tagsCopy.addAll(tags);
        this.tags = tagsCopy;
    }
    
    /**
     * A list of cost allocation tags to be added to this resource. A tag is
     * a key-value pair. A tag key must be accompanied by a tag value.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTags(java.util.Collection)} or {@link
     * #withTags(java.util.Collection)} if you want to override the existing
     * values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of cost allocation tags to be added to this resource. A tag is
     *         a key-value pair. A tag key must be accompanied by a tag value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToResourceRequest withTags(Tag... tags) {
        if (getTags() == null) setTags(new java.util.ArrayList<Tag>(tags.length));
        for (Tag value : tags) {
            getTags().add(value);
        }
        return this;
    }
    
    /**
     * A list of cost allocation tags to be added to this resource. A tag is
     * a key-value pair. A tag key must be accompanied by a tag value.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tags A list of cost allocation tags to be added to this resource. A tag is
     *         a key-value pair. A tag key must be accompanied by a tag value.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public AddTagsToResourceRequest withTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<Tag> tagsCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<Tag>(tags.size());
            tagsCopy.addAll(tags);
            this.tags = tagsCopy;
        }

        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and
     * debugging.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getResourceName() != null) sb.append("ResourceName: " + getResourceName() + ",");
        if (getTags() != null) sb.append("Tags: " + getTags() );
        sb.append("}");
        return sb.toString();
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof AddTagsToResourceRequest == false) return false;
        AddTagsToResourceRequest other = (AddTagsToResourceRequest)obj;
        
        if (other.getResourceName() == null ^ this.getResourceName() == null) return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false) return false; 
        if (other.getTags() == null ^ this.getTags() == null) return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false) return false; 
        return true;
    }
    
    @Override
    public AddTagsToResourceRequest clone() {
        
            return (AddTagsToResourceRequest) super.clone();
    }

}
    