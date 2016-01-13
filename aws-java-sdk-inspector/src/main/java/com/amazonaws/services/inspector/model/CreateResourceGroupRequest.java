/*
 * Copyright 2010-2016 Amazon.com, Inc. or its affiliates. All Rights
 * Reserved.
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

package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 */
public class CreateResourceGroupRequest extends AmazonWebServiceRequest
        implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of keys and an array of possible values in JSON format.
     * </p>
     * <p>
     * For example,
     * [{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values"
     * :["Value3"]}]
     * </p>
     */
    private String resourceGroupTags;

    /**
     * <p>
     * A collection of keys and an array of possible values in JSON format.
     * </p>
     * <p>
     * For example,
     * [{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values"
     * :["Value3"]}]
     * </p>
     * 
     * @param resourceGroupTags
     *        A collection of keys and an array of possible values in JSON
     *        format.</p>
     *        <p>
     *        For example,
     *        [{"key":"key1","values":["Value1","Value2"]},{"key":"Key2"
     *        ,"values":["Value3"]}]
     */
    public void setResourceGroupTags(String resourceGroupTags) {
        this.resourceGroupTags = resourceGroupTags;
    }

    /**
     * <p>
     * A collection of keys and an array of possible values in JSON format.
     * </p>
     * <p>
     * For example,
     * [{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values"
     * :["Value3"]}]
     * </p>
     * 
     * @return A collection of keys and an array of possible values in JSON
     *         format.</p>
     *         <p>
     *         For example,
     *         [{"key":"key1","values":["Value1","Value2"]},{"key":"Key2"
     *         ,"values":["Value3"]}]
     */
    public String getResourceGroupTags() {
        return this.resourceGroupTags;
    }

    /**
     * <p>
     * A collection of keys and an array of possible values in JSON format.
     * </p>
     * <p>
     * For example,
     * [{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values"
     * :["Value3"]}]
     * </p>
     * 
     * @param resourceGroupTags
     *        A collection of keys and an array of possible values in JSON
     *        format.</p>
     *        <p>
     *        For example,
     *        [{"key":"key1","values":["Value1","Value2"]},{"key":"Key2"
     *        ,"values":["Value3"]}]
     * @return Returns a reference to this object so that method calls can be
     *         chained together.
     */
    public CreateResourceGroupRequest withResourceGroupTags(
            String resourceGroupTags) {
        setResourceGroupTags(resourceGroupTags);
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
        if (getResourceGroupTags() != null)
            sb.append("ResourceGroupTags: " + getResourceGroupTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateResourceGroupRequest == false)
            return false;
        CreateResourceGroupRequest other = (CreateResourceGroupRequest) obj;
        if (other.getResourceGroupTags() == null
                ^ this.getResourceGroupTags() == null)
            return false;
        if (other.getResourceGroupTags() != null
                && other.getResourceGroupTags().equals(
                        this.getResourceGroupTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime
                * hashCode
                + ((getResourceGroupTags() == null) ? 0
                        : getResourceGroupTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateResourceGroupRequest clone() {
        return (CreateResourceGroupRequest) super.clone();
    }
}