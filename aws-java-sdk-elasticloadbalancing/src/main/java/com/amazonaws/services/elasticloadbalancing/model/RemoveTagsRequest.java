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
package com.amazonaws.services.elasticloadbalancing.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * <p>
 * Contains the parameters for RemoveTags.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/elasticloadbalancing-2012-06-01/RemoveTags" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RemoveTagsRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the load balancer. You can specify a maximum of one load balancer name.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<String> loadBalancerNames;
    /**
     * <p>
     * The list of tag keys to remove.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<TagKeyOnly> tags;

    /**
     * <p>
     * The name of the load balancer. You can specify a maximum of one load balancer name.
     * </p>
     * 
     * @return The name of the load balancer. You can specify a maximum of one load balancer name.
     */

    public java.util.List<String> getLoadBalancerNames() {
        if (loadBalancerNames == null) {
            loadBalancerNames = new com.amazonaws.internal.SdkInternalList<String>();
        }
        return loadBalancerNames;
    }

    /**
     * <p>
     * The name of the load balancer. You can specify a maximum of one load balancer name.
     * </p>
     * 
     * @param loadBalancerNames
     *        The name of the load balancer. You can specify a maximum of one load balancer name.
     */

    public void setLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        if (loadBalancerNames == null) {
            this.loadBalancerNames = null;
            return;
        }

        this.loadBalancerNames = new com.amazonaws.internal.SdkInternalList<String>(loadBalancerNames);
    }

    /**
     * <p>
     * The name of the load balancer. You can specify a maximum of one load balancer name.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setLoadBalancerNames(java.util.Collection)} or {@link #withLoadBalancerNames(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param loadBalancerNames
     *        The name of the load balancer. You can specify a maximum of one load balancer name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsRequest withLoadBalancerNames(String... loadBalancerNames) {
        if (this.loadBalancerNames == null) {
            setLoadBalancerNames(new com.amazonaws.internal.SdkInternalList<String>(loadBalancerNames.length));
        }
        for (String ele : loadBalancerNames) {
            this.loadBalancerNames.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The name of the load balancer. You can specify a maximum of one load balancer name.
     * </p>
     * 
     * @param loadBalancerNames
     *        The name of the load balancer. You can specify a maximum of one load balancer name.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsRequest withLoadBalancerNames(java.util.Collection<String> loadBalancerNames) {
        setLoadBalancerNames(loadBalancerNames);
        return this;
    }

    /**
     * <p>
     * The list of tag keys to remove.
     * </p>
     * 
     * @return The list of tag keys to remove.
     */

    public java.util.List<TagKeyOnly> getTags() {
        if (tags == null) {
            tags = new com.amazonaws.internal.SdkInternalList<TagKeyOnly>();
        }
        return tags;
    }

    /**
     * <p>
     * The list of tag keys to remove.
     * </p>
     * 
     * @param tags
     *        The list of tag keys to remove.
     */

    public void setTags(java.util.Collection<TagKeyOnly> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new com.amazonaws.internal.SdkInternalList<TagKeyOnly>(tags);
    }

    /**
     * <p>
     * The list of tag keys to remove.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        The list of tag keys to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsRequest withTags(TagKeyOnly... tags) {
        if (this.tags == null) {
            setTags(new com.amazonaws.internal.SdkInternalList<TagKeyOnly>(tags.length));
        }
        for (TagKeyOnly ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of tag keys to remove.
     * </p>
     * 
     * @param tags
     *        The list of tag keys to remove.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RemoveTagsRequest withTags(java.util.Collection<TagKeyOnly> tags) {
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
        if (getLoadBalancerNames() != null)
            sb.append("LoadBalancerNames: ").append(getLoadBalancerNames()).append(",");
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

        if (obj instanceof RemoveTagsRequest == false)
            return false;
        RemoveTagsRequest other = (RemoveTagsRequest) obj;
        if (other.getLoadBalancerNames() == null ^ this.getLoadBalancerNames() == null)
            return false;
        if (other.getLoadBalancerNames() != null && other.getLoadBalancerNames().equals(this.getLoadBalancerNames()) == false)
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

        hashCode = prime * hashCode + ((getLoadBalancerNames() == null) ? 0 : getLoadBalancerNames().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public RemoveTagsRequest clone() {
        return (RemoveTagsRequest) super.clone();
    }

}
