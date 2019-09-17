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
 * A complex type that contains information about the health checks or hosted zones for which you want to list tags.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/route53-2013-04-01/ListTagsForResource" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListTagsForResourceResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A <code>ResourceTagSet</code> containing tags associated with the specified resource.
     * </p>
     */
    private ResourceTagSet resourceTagSet;

    /**
     * <p>
     * A <code>ResourceTagSet</code> containing tags associated with the specified resource.
     * </p>
     * 
     * @param resourceTagSet
     *        A <code>ResourceTagSet</code> containing tags associated with the specified resource.
     */

    public void setResourceTagSet(ResourceTagSet resourceTagSet) {
        this.resourceTagSet = resourceTagSet;
    }

    /**
     * <p>
     * A <code>ResourceTagSet</code> containing tags associated with the specified resource.
     * </p>
     * 
     * @return A <code>ResourceTagSet</code> containing tags associated with the specified resource.
     */

    public ResourceTagSet getResourceTagSet() {
        return this.resourceTagSet;
    }

    /**
     * <p>
     * A <code>ResourceTagSet</code> containing tags associated with the specified resource.
     * </p>
     * 
     * @param resourceTagSet
     *        A <code>ResourceTagSet</code> containing tags associated with the specified resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListTagsForResourceResult withResourceTagSet(ResourceTagSet resourceTagSet) {
        setResourceTagSet(resourceTagSet);
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
        if (getResourceTagSet() != null)
            sb.append("ResourceTagSet: ").append(getResourceTagSet());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListTagsForResourceResult == false)
            return false;
        ListTagsForResourceResult other = (ListTagsForResourceResult) obj;
        if (other.getResourceTagSet() == null ^ this.getResourceTagSet() == null)
            return false;
        if (other.getResourceTagSet() != null && other.getResourceTagSet().equals(this.getResourceTagSet()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceTagSet() == null) ? 0 : getResourceTagSet().hashCode());
        return hashCode;
    }

    @Override
    public ListTagsForResourceResult clone() {
        try {
            return (ListTagsForResourceResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
