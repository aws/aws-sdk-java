/*
 * Copyright 2011-2016 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * The input parameters for the <code>ListTagsForResource</code> operation.
 * </p>
 */
public class ListTagsForResourceRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the resource for which you want the list of tags, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code> or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
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
     * The Amazon Resource Name (ARN) of the resource for which you want the list of tags, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code> or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon Resource Name (ARN) of the resource for which you want the list of tags, for example
     *        <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code> or
     *        <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.</p>
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
     * The Amazon Resource Name (ARN) of the resource for which you want the list of tags, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code> or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the resource for which you want the list of tags, for example
     *         <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code> or
     *         <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.</p>
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
     * The Amazon Resource Name (ARN) of the resource for which you want the list of tags, for example
     * <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code> or
     * <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.
     * </p>
     * <p>
     * For more information about ARNs, see <a
     * href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names (ARNs) and
     * AWS Service Namespaces</a>.
     * </p>
     * 
     * @param resourceName
     *        The Amazon Resource Name (ARN) of the resource for which you want the list of tags, for example
     *        <code>arn:aws:elasticache:us-west-2:0123456789:cluster:myCluster</code> or
     *        <code>arn:aws:elasticache:us-west-2:0123456789:snapshot:mySnapshot</code>.</p>
     *        <p>
     *        For more information about ARNs, see <a
     *        href="http://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">Amazon Resource Names
     *        (ARNs) and AWS Service Namespaces</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceRequest withResourceName(String resourceName) {
        setResourceName(resourceName);
        return this;
    }

    /**
     * Returns a string representation of this object; useful for testing and debugging.
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
            sb.append("ResourceName: " + getResourceName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceRequest == false)
            return false;
        ListTagsForResourceRequest other = (ListTagsForResourceRequest) obj;
        if (other.getResourceName() == null ^ this.getResourceName() == null)
            return false;
        if (other.getResourceName() != null && other.getResourceName().equals(this.getResourceName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceName() == null) ? 0 : getResourceName().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceRequest clone() {
        return (ListTagsForResourceRequest) super.clone();
    }
}
