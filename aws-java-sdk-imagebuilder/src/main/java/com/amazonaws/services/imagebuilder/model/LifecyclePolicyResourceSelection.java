/*
 * Copyright 2019-2024 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.imagebuilder.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Resource selection criteria for the lifecycle policy.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/imagebuilder-2019-12-02/LifecyclePolicyResourceSelection"
 *      target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class LifecyclePolicyResourceSelection implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * A list of recipes that are used as selection criteria for the output images that the lifecycle policy applies to.
     * </p>
     */
    private java.util.List<LifecyclePolicyResourceSelectionRecipe> recipes;
    /**
     * <p>
     * A list of tags that are used as selection criteria for the Image Builder image resources that the lifecycle
     * policy applies to.
     * </p>
     */
    private java.util.Map<String, String> tagMap;

    /**
     * <p>
     * A list of recipes that are used as selection criteria for the output images that the lifecycle policy applies to.
     * </p>
     * 
     * @return A list of recipes that are used as selection criteria for the output images that the lifecycle policy
     *         applies to.
     */

    public java.util.List<LifecyclePolicyResourceSelectionRecipe> getRecipes() {
        return recipes;
    }

    /**
     * <p>
     * A list of recipes that are used as selection criteria for the output images that the lifecycle policy applies to.
     * </p>
     * 
     * @param recipes
     *        A list of recipes that are used as selection criteria for the output images that the lifecycle policy
     *        applies to.
     */

    public void setRecipes(java.util.Collection<LifecyclePolicyResourceSelectionRecipe> recipes) {
        if (recipes == null) {
            this.recipes = null;
            return;
        }

        this.recipes = new java.util.ArrayList<LifecyclePolicyResourceSelectionRecipe>(recipes);
    }

    /**
     * <p>
     * A list of recipes that are used as selection criteria for the output images that the lifecycle policy applies to.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecipes(java.util.Collection)} or {@link #withRecipes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param recipes
     *        A list of recipes that are used as selection criteria for the output images that the lifecycle policy
     *        applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyResourceSelection withRecipes(LifecyclePolicyResourceSelectionRecipe... recipes) {
        if (this.recipes == null) {
            setRecipes(new java.util.ArrayList<LifecyclePolicyResourceSelectionRecipe>(recipes.length));
        }
        for (LifecyclePolicyResourceSelectionRecipe ele : recipes) {
            this.recipes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of recipes that are used as selection criteria for the output images that the lifecycle policy applies to.
     * </p>
     * 
     * @param recipes
     *        A list of recipes that are used as selection criteria for the output images that the lifecycle policy
     *        applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyResourceSelection withRecipes(java.util.Collection<LifecyclePolicyResourceSelectionRecipe> recipes) {
        setRecipes(recipes);
        return this;
    }

    /**
     * <p>
     * A list of tags that are used as selection criteria for the Image Builder image resources that the lifecycle
     * policy applies to.
     * </p>
     * 
     * @return A list of tags that are used as selection criteria for the Image Builder image resources that the
     *         lifecycle policy applies to.
     */

    public java.util.Map<String, String> getTagMap() {
        return tagMap;
    }

    /**
     * <p>
     * A list of tags that are used as selection criteria for the Image Builder image resources that the lifecycle
     * policy applies to.
     * </p>
     * 
     * @param tagMap
     *        A list of tags that are used as selection criteria for the Image Builder image resources that the
     *        lifecycle policy applies to.
     */

    public void setTagMap(java.util.Map<String, String> tagMap) {
        this.tagMap = tagMap;
    }

    /**
     * <p>
     * A list of tags that are used as selection criteria for the Image Builder image resources that the lifecycle
     * policy applies to.
     * </p>
     * 
     * @param tagMap
     *        A list of tags that are used as selection criteria for the Image Builder image resources that the
     *        lifecycle policy applies to.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyResourceSelection withTagMap(java.util.Map<String, String> tagMap) {
        setTagMap(tagMap);
        return this;
    }

    /**
     * Add a single TagMap entry
     *
     * @see LifecyclePolicyResourceSelection#withTagMap
     * @returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyResourceSelection addTagMapEntry(String key, String value) {
        if (null == this.tagMap) {
            this.tagMap = new java.util.HashMap<String, String>();
        }
        if (this.tagMap.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tagMap.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into TagMap.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public LifecyclePolicyResourceSelection clearTagMapEntries() {
        this.tagMap = null;
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
        if (getRecipes() != null)
            sb.append("Recipes: ").append(getRecipes()).append(",");
        if (getTagMap() != null)
            sb.append("TagMap: ").append(getTagMap());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof LifecyclePolicyResourceSelection == false)
            return false;
        LifecyclePolicyResourceSelection other = (LifecyclePolicyResourceSelection) obj;
        if (other.getRecipes() == null ^ this.getRecipes() == null)
            return false;
        if (other.getRecipes() != null && other.getRecipes().equals(this.getRecipes()) == false)
            return false;
        if (other.getTagMap() == null ^ this.getTagMap() == null)
            return false;
        if (other.getTagMap() != null && other.getTagMap().equals(this.getTagMap()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecipes() == null) ? 0 : getRecipes().hashCode());
        hashCode = prime * hashCode + ((getTagMap() == null) ? 0 : getTagMap().hashCode());
        return hashCode;
    }

    @Override
    public LifecyclePolicyResourceSelection clone() {
        try {
            return (LifecyclePolicyResourceSelection) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.imagebuilder.model.transform.LifecyclePolicyResourceSelectionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
