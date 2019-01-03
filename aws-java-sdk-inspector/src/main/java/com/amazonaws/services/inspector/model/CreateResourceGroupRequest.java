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
package com.amazonaws.services.inspector.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/inspector-2016-02-16/CreateResourceGroup" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateResourceGroupRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A collection of keys and an array of possible values,
     * '[{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values":["Value3"]}]'.
     * </p>
     * <p>
     * For example,'[{"key":"Name","values":["TestEC2Instance"]}]'.
     * </p>
     */
    private java.util.List<ResourceGroupTag> resourceGroupTags;

    /**
     * <p>
     * A collection of keys and an array of possible values,
     * '[{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values":["Value3"]}]'.
     * </p>
     * <p>
     * For example,'[{"key":"Name","values":["TestEC2Instance"]}]'.
     * </p>
     * 
     * @return A collection of keys and an array of possible values,
     *         '[{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values":["Value3"]}]'.</p>
     *         <p>
     *         For example,'[{"key":"Name","values":["TestEC2Instance"]}]'.
     */

    public java.util.List<ResourceGroupTag> getResourceGroupTags() {
        return resourceGroupTags;
    }

    /**
     * <p>
     * A collection of keys and an array of possible values,
     * '[{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values":["Value3"]}]'.
     * </p>
     * <p>
     * For example,'[{"key":"Name","values":["TestEC2Instance"]}]'.
     * </p>
     * 
     * @param resourceGroupTags
     *        A collection of keys and an array of possible values,
     *        '[{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values":["Value3"]}]'.</p>
     *        <p>
     *        For example,'[{"key":"Name","values":["TestEC2Instance"]}]'.
     */

    public void setResourceGroupTags(java.util.Collection<ResourceGroupTag> resourceGroupTags) {
        if (resourceGroupTags == null) {
            this.resourceGroupTags = null;
            return;
        }

        this.resourceGroupTags = new java.util.ArrayList<ResourceGroupTag>(resourceGroupTags);
    }

    /**
     * <p>
     * A collection of keys and an array of possible values,
     * '[{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values":["Value3"]}]'.
     * </p>
     * <p>
     * For example,'[{"key":"Name","values":["TestEC2Instance"]}]'.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setResourceGroupTags(java.util.Collection)} or {@link #withResourceGroupTags(java.util.Collection)} if
     * you want to override the existing values.
     * </p>
     * 
     * @param resourceGroupTags
     *        A collection of keys and an array of possible values,
     *        '[{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values":["Value3"]}]'.</p>
     *        <p>
     *        For example,'[{"key":"Name","values":["TestEC2Instance"]}]'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceGroupRequest withResourceGroupTags(ResourceGroupTag... resourceGroupTags) {
        if (this.resourceGroupTags == null) {
            setResourceGroupTags(new java.util.ArrayList<ResourceGroupTag>(resourceGroupTags.length));
        }
        for (ResourceGroupTag ele : resourceGroupTags) {
            this.resourceGroupTags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A collection of keys and an array of possible values,
     * '[{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values":["Value3"]}]'.
     * </p>
     * <p>
     * For example,'[{"key":"Name","values":["TestEC2Instance"]}]'.
     * </p>
     * 
     * @param resourceGroupTags
     *        A collection of keys and an array of possible values,
     *        '[{"key":"key1","values":["Value1","Value2"]},{"key":"Key2","values":["Value3"]}]'.</p>
     *        <p>
     *        For example,'[{"key":"Name","values":["TestEC2Instance"]}]'.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateResourceGroupRequest withResourceGroupTags(java.util.Collection<ResourceGroupTag> resourceGroupTags) {
        setResourceGroupTags(resourceGroupTags);
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
        if (getResourceGroupTags() != null)
            sb.append("ResourceGroupTags: ").append(getResourceGroupTags());
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
        if (other.getResourceGroupTags() == null ^ this.getResourceGroupTags() == null)
            return false;
        if (other.getResourceGroupTags() != null && other.getResourceGroupTags().equals(this.getResourceGroupTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getResourceGroupTags() == null) ? 0 : getResourceGroupTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateResourceGroupRequest clone() {
        return (CreateResourceGroupRequest) super.clone();
    }

}
