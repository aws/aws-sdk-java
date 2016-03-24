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
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#removeTagsFromResource(RemoveTagsFromResourceRequest) RemoveTagsFromResource operation}.
 * <p>
 * The <i>RemoveTagsFromResource</i> action removes the tags identified
 * by the <code>TagKeys</code> list from the named resource.
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#removeTagsFromResource(RemoveTagsFromResourceRequest)
 */
public class RemoveTagsFromResourceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) of the resource from which you want the
     * tags removed, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * <p>For more information on ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a>.
     */
    private String resourceName;

    /**
     * A list of <code>TagKeys</code> identifying the tags you want removed
     * from the named resource. For example,
     * <code>TagKeys.member.1=Region</code> removes the cost allocation tag
     * with the key name <code>Region</code> from the resource named by the
     * <i>ResourceName</i> parameter.
     */
    private com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeys;

    /**
     * The Amazon Resource Name (ARN) of the resource from which you want the
     * tags removed, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * <p>For more information on ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a>.
     *
     * @return The Amazon Resource Name (ARN) of the resource from which you want the
     *         tags removed, for example
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
     * The Amazon Resource Name (ARN) of the resource from which you want the
     * tags removed, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * <p>For more information on ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a>.
     *
     * @param resourceName The Amazon Resource Name (ARN) of the resource from which you want the
     *         tags removed, for example
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
     * The Amazon Resource Name (ARN) of the resource from which you want the
     * tags removed, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * <p>For more information on ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceName The Amazon Resource Name (ARN) of the resource from which you want the
     *         tags removed, for example
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
    public RemoveTagsFromResourceRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
        return this;
    }

    /**
     * A list of <code>TagKeys</code> identifying the tags you want removed
     * from the named resource. For example,
     * <code>TagKeys.member.1=Region</code> removes the cost allocation tag
     * with the key name <code>Region</code> from the resource named by the
     * <i>ResourceName</i> parameter.
     *
     * @return A list of <code>TagKeys</code> identifying the tags you want removed
     *         from the named resource. For example,
     *         <code>TagKeys.member.1=Region</code> removes the cost allocation tag
     *         with the key name <code>Region</code> from the resource named by the
     *         <i>ResourceName</i> parameter.
     */
    public java.util.List<String> getTagKeys() {
        if (tagKeys == null) {
              tagKeys = new com.amazonaws.internal.ListWithAutoConstructFlag<String>();
              tagKeys.setAutoConstruct(true);
        }
        return tagKeys;
    }
    
    /**
     * A list of <code>TagKeys</code> identifying the tags you want removed
     * from the named resource. For example,
     * <code>TagKeys.member.1=Region</code> removes the cost allocation tag
     * with the key name <code>Region</code> from the resource named by the
     * <i>ResourceName</i> parameter.
     *
     * @param tagKeys A list of <code>TagKeys</code> identifying the tags you want removed
     *         from the named resource. For example,
     *         <code>TagKeys.member.1=Region</code> removes the cost allocation tag
     *         with the key name <code>Region</code> from the resource named by the
     *         <i>ResourceName</i> parameter.
     */
    public void setTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
            return;
        }
        com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagKeys.size());
        tagKeysCopy.addAll(tagKeys);
        this.tagKeys = tagKeysCopy;
    }
    
    /**
     * A list of <code>TagKeys</code> identifying the tags you want removed
     * from the named resource. For example,
     * <code>TagKeys.member.1=Region</code> removes the cost allocation tag
     * with the key name <code>Region</code> from the resource named by the
     * <i>ResourceName</i> parameter.
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if
     * any). Use {@link #setTagKeys(java.util.Collection)} or {@link
     * #withTagKeys(java.util.Collection)} if you want to override the
     * existing values.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagKeys A list of <code>TagKeys</code> identifying the tags you want removed
     *         from the named resource. For example,
     *         <code>TagKeys.member.1=Region</code> removes the cost allocation tag
     *         with the key name <code>Region</code> from the resource named by the
     *         <i>ResourceName</i> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RemoveTagsFromResourceRequest withTagKeys(String... tagKeys) {
        if (getTagKeys() == null) setTagKeys(new java.util.ArrayList<String>(tagKeys.length));
        for (String value : tagKeys) {
            getTagKeys().add(value);
        }
        return this;
    }
    
    /**
     * A list of <code>TagKeys</code> identifying the tags you want removed
     * from the named resource. For example,
     * <code>TagKeys.member.1=Region</code> removes the cost allocation tag
     * with the key name <code>Region</code> from the resource named by the
     * <i>ResourceName</i> parameter.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param tagKeys A list of <code>TagKeys</code> identifying the tags you want removed
     *         from the named resource. For example,
     *         <code>TagKeys.member.1=Region</code> removes the cost allocation tag
     *         with the key name <code>Region</code> from the resource named by the
     *         <i>ResourceName</i> parameter.
     *
     * @return A reference to this updated object so that method calls can be chained
     *         together.
     */
    public RemoveTagsFromResourceRequest withTagKeys(java.util.Collection<String> tagKeys) {
        if (tagKeys == null) {
            this.tagKeys = null;
        } else {
            com.amazonaws.internal.ListWithAutoConstructFlag<String> tagKeysCopy = new com.amazonaws.internal.ListWithAutoConstructFlag<String>(tagKeys.size());
            tagKeysCopy.addAll(tagKeys);
            this.tagKeys = tagKeysCopy;
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
        if (getTagKeys() != null) sb.append("TagKeys: " + getTagKeys() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode()); 
        hashCode = prime * hashCode + ((getTagKeys() == null) ? 0 : getTagKeys().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof RemoveTagsFromResourceRequest == false) return false;
        RemoveTagsFromResourceRequest other = (RemoveTagsFromResourceRequest)obj;
        
        if (other.getResourceName() == null ^ this.getResourceName() == null) return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false) return false; 
        if (other.getTagKeys() == null ^ this.getTagKeys() == null) return false;
        if (other.getTagKeys() != null && other.getTagKeys().equals(this.getTagKeys()) == false) return false; 
        return true;
    }
    
    @Override
    public RemoveTagsFromResourceRequest clone() {
        
            return (RemoveTagsFromResourceRequest) super.clone();
    }

}
    