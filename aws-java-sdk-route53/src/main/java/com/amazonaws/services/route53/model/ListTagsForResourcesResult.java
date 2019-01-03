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
package com.amazonaws.services.route53.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * <p>
 * A complex type containing tags for the specified resources.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTagsForResources" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourcesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of <code>ResourceTagSet</code>s containing tags associated with the specified resources.
     * </p>
     */
    private com.amazonaws.internal.SdkInternalList<ResourceTagSet> resourceTagSets;

    /**
     * <p>
     * A list of <code>ResourceTagSet</code>s containing tags associated with the specified resources.
     * </p>
     * 
     * @return A list of <code>ResourceTagSet</code>s containing tags associated with the specified resources.
     */

    public java.util.List<ResourceTagSet> getResourceTagSets() {
        if (resourceTagSets == null) {
            resourceTagSets = new com.amazonaws.internal.SdkInternalList<ResourceTagSet>();
        }
        return resourceTagSets;
    }

    /**
     * <p>
     * A list of <code>ResourceTagSet</code>s containing tags associated with the specified resources.
     * </p>
     * 
     * @param resourceTagSets
     *        A list of <code>ResourceTagSet</code>s containing tags associated with the specified resources.
     */

    public void setResourceTagSets(java.util.Collection<ResourceTagSet> resourceTagSets) {
        if (resourceTagSets == null) {
            this.resourceTagSets = null;
            return;
        }

        this.resourceTagSets = new com.amazonaws.internal.SdkInternalList<ResourceTagSet>(resourceTagSets);
    }

    /**
     * <p>
     * A list of <code>ResourceTagSet</code>s containing tags associated with the specified resources.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceTagSets(java.util.Collection)} or {@link #withResourceTagSets(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param resourceTagSets
     *        A list of <code>ResourceTagSet</code>s containing tags associated with the specified resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourcesResult withResourceTagSets(ResourceTagSet... resourceTagSets) {
        if (this.resourceTagSets == null) {
            setResourceTagSets(new com.amazonaws.internal.SdkInternalList<ResourceTagSet>(resourceTagSets.length));
        }
        for (ResourceTagSet ele : resourceTagSets) {
            this.resourceTagSets.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <code>ResourceTagSet</code>s containing tags associated with the specified resources.
     * </p>
     * 
     * @param resourceTagSets
     *        A list of <code>ResourceTagSet</code>s containing tags associated with the specified resources.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourcesResult withResourceTagSets(java.util.Collection<ResourceTagSet> resourceTagSets) {
        setResourceTagSets(resourceTagSets);
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
        if (getResourceTagSets() != null)
            sb.append("ResourceTagSets: ").append(getResourceTagSets());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourcesResult == false)
            return false;
        ListTagsForResourcesResult other = (ListTagsForResourcesResult) obj;
        if (other.getResourceTagSets() == null ^ this.getResourceTagSets() == null)
            return false;
        if (other.getResourceTagSets() != null && other.getResourceTagSets().equals(this.getResourceTagSets()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceTagSets() == null) ? 0 : getResourceTagSets().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourcesResult clone() {
        try {
            return (ListTagsForResourcesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
