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
 * Container for the parameters to the {@link com.amazonaws.services.elasticache.AmazonElastiCache#listTagsForResource(ListTagsForResourceRequest) ListTagsForResource operation}.
 * <p>
 * The <i>ListTagsForResource</i> action lists all cost allocation tags
 * currently on the named resource. A
 * <i>cost allocation tag</i> is a key-value pair
 * where the key is case-sensitive and the value is optional. Cost
 * allocation tags can be used to categorize and track your AWS costs.
 * </p>
 * <p>
 * You can have a maximum of 10 cost allocation tags on an ElastiCache
 * resource. For more information, see
 * <a href="http://docs.aws.amazon.com/AmazonElastiCache/latest/UserGuide/BestPractices.html"> Using Cost Allocation Tags in Amazon ElastiCache </a>
 * .
 * </p>
 *
 * @see com.amazonaws.services.elasticache.AmazonElastiCache#listTagsForResource(ListTagsForResourceRequest)
 */
public class ListTagsForResourceRequest extends AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * The Amazon Resource Name (ARN) of the resource for which you want the
     * list of tags, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * <p>For more information on ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a>.
     */
    private String resourceName;

    /**
     * The Amazon Resource Name (ARN) of the resource for which you want the
     * list of tags, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * <p>For more information on ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a>.
     *
     * @return The Amazon Resource Name (ARN) of the resource for which you want the
     *         list of tags, for example
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
     * The Amazon Resource Name (ARN) of the resource for which you want the
     * list of tags, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * <p>For more information on ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a>.
     *
     * @param resourceName The Amazon Resource Name (ARN) of the resource for which you want the
     *         list of tags, for example
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
     * The Amazon Resource Name (ARN) of the resource for which you want the
     * list of tags, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code>
     * or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * <p>For more information on ARNs, go to <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon
     * Resource Names (ARNs) and AWS Service Namespaces</a>.
     * <p>
     * Returns a reference to this object so that method calls can be chained together.
     *
     * @param resourceName The Amazon Resource Name (ARN) of the resource for which you want the
     *         list of tags, for example
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
    public ListTagsForResourceRequest withResourceName(String resourceName) {
        this.resourceName = resourceName;
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
        if (getResourceName() != null) sb.append("ResourceName: " + getResourceName() );
        sb.append("}");
        return sb.toString();
    }
    
    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;
        
        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode()); 
        return hashCode;
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;

        if (obj instanceof ListTagsForResourceRequest == false) return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest)obj;
        
        if (other.getResourceName() == null ^ this.getResourceName() == null) return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false) return false; 
        return true;
    }
    
    @Override
    public ListTagsForResourceRequest clone() {
        
            return (ListTagsForResourceRequest) super.clone();
    }

}
    