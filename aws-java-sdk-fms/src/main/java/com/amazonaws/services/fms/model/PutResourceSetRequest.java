/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.fms.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/fms-2018-01-01/PutResourceSet" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class PutResourceSetRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * Details about the resource set to be created or updated.&gt;
     * </p>
     */
    private ResourceSet resourceSet;
    /**
     * <p>
     * Retrieves the tags associated with the specified resource set. Tags are key:value pairs that you can use to
     * categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web
     * Services resource, up to 50 tags for a resource.
     * </p>
     */
    private java.util.List<Tag> tagList;

    /**
     * <p>
     * Details about the resource set to be created or updated.&gt;
     * </p>
     * 
     * @param resourceSet
     *        Details about the resource set to be created or updated.&gt;
     */

    public void setResourceSet(ResourceSet resourceSet) {
        this.resourceSet = resourceSet;
    }

    /**
     * <p>
     * Details about the resource set to be created or updated.&gt;
     * </p>
     * 
     * @return Details about the resource set to be created or updated.&gt;
     */

    public ResourceSet getResourceSet() {
        return this.resourceSet;
    }

    /**
     * <p>
     * Details about the resource set to be created or updated.&gt;
     * </p>
     * 
     * @param resourceSet
     *        Details about the resource set to be created or updated.&gt;
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceSetRequest withResourceSet(ResourceSet resourceSet) {
        setResourceSet(resourceSet);
        return this;
    }

    /**
     * <p>
     * Retrieves the tags associated with the specified resource set. Tags are key:value pairs that you can use to
     * categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web
     * Services resource, up to 50 tags for a resource.
     * </p>
     * 
     * @return Retrieves the tags associated with the specified resource set. Tags are key:value pairs that you can use
     *         to categorize and manage your resources, for purposes like billing. For example, you might set the tag
     *         key to "customer" and the value to the customer name or ID. You can specify one or more tags to add to
     *         each Amazon Web Services resource, up to 50 tags for a resource.
     */

    public java.util.List<Tag> getTagList() {
        return tagList;
    }

    /**
     * <p>
     * Retrieves the tags associated with the specified resource set. Tags are key:value pairs that you can use to
     * categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web
     * Services resource, up to 50 tags for a resource.
     * </p>
     * 
     * @param tagList
     *        Retrieves the tags associated with the specified resource set. Tags are key:value pairs that you can use
     *        to categorize and manage your resources, for purposes like billing. For example, you might set the tag key
     *        to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each
     *        Amazon Web Services resource, up to 50 tags for a resource.
     */

    public void setTagList(java.util.Collection<Tag> tagList) {
        if (tagList == null) {
            this.tagList = null;
            return;
        }

        this.tagList = new java.util.ArrayList<Tag>(tagList);
    }

    /**
     * <p>
     * Retrieves the tags associated with the specified resource set. Tags are key:value pairs that you can use to
     * categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web
     * Services resource, up to 50 tags for a resource.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTagList(java.util.Collection)} or {@link #withTagList(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param tagList
     *        Retrieves the tags associated with the specified resource set. Tags are key:value pairs that you can use
     *        to categorize and manage your resources, for purposes like billing. For example, you might set the tag key
     *        to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each
     *        Amazon Web Services resource, up to 50 tags for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceSetRequest withTagList(Tag... tagList) {
        if (this.tagList == null) {
            setTagList(new java.util.ArrayList<Tag>(tagList.length));
        }
        for (Tag ele : tagList) {
            this.tagList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * Retrieves the tags associated with the specified resource set. Tags are key:value pairs that you can use to
     * categorize and manage your resources, for purposes like billing. For example, you might set the tag key to
     * "customer" and the value to the customer name or ID. You can specify one or more tags to add to each Amazon Web
     * Services resource, up to 50 tags for a resource.
     * </p>
     * 
     * @param tagList
     *        Retrieves the tags associated with the specified resource set. Tags are key:value pairs that you can use
     *        to categorize and manage your resources, for purposes like billing. For example, you might set the tag key
     *        to "customer" and the value to the customer name or ID. You can specify one or more tags to add to each
     *        Amazon Web Services resource, up to 50 tags for a resource.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public PutResourceSetRequest withTagList(java.util.Collection<Tag> tagList) {
        setTagList(tagList);
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
        if (getResourceSet() != null)
            sb.append("ResourceSet: ").append(getResourceSet()).append(",");
        if (getTagList() != null)
            sb.append("TagList: ").append(getTagList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof PutResourceSetRequest == false)
            return false;
        PutResourceSetRequest other = (PutResourceSetRequest) obj;
        if (other.getResourceSet() == null ^ this.getResourceSet() == null)
            return false;
        if (other.getResourceSet() != null && other.getResourceSet().equals(this.getResourceSet()) == false)
            return false;
        if (other.getTagList() == null ^ this.getTagList() == null)
            return false;
        if (other.getTagList() != null && other.getTagList().equals(this.getTagList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceSet() == null) ? 0 : getResourceSet().hashCode());
        hashCode = prime * hashCode + ((getTagList() == null) ? 0 : getTagList().hashCode());
        return hashCode;
    }

    @Override
    public PutResourceSetRequest clone() {
        return (PutResourceSetRequest) super.clone();
    }

}
