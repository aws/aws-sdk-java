/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComponentResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The format of the recipe.
     * </p>
     */
    private String recipeOutputFormat;
    /**
     * <p>
     * The recipe of the component version.
     * </p>
     */
    private java.nio.ByteBuffer recipe;
    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS IoT
     * Greengrass V2 Developer Guide</i>.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * The format of the recipe.
     * </p>
     * 
     * @param recipeOutputFormat
     *        The format of the recipe.
     * @see RecipeOutputFormat
     */

    public void setRecipeOutputFormat(String recipeOutputFormat) {
        this.recipeOutputFormat = recipeOutputFormat;
    }

    /**
     * <p>
     * The format of the recipe.
     * </p>
     * 
     * @return The format of the recipe.
     * @see RecipeOutputFormat
     */

    public String getRecipeOutputFormat() {
        return this.recipeOutputFormat;
    }

    /**
     * <p>
     * The format of the recipe.
     * </p>
     * 
     * @param recipeOutputFormat
     *        The format of the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecipeOutputFormat
     */

    public GetComponentResult withRecipeOutputFormat(String recipeOutputFormat) {
        setRecipeOutputFormat(recipeOutputFormat);
        return this;
    }

    /**
     * <p>
     * The format of the recipe.
     * </p>
     * 
     * @param recipeOutputFormat
     *        The format of the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecipeOutputFormat
     */

    public GetComponentResult withRecipeOutputFormat(RecipeOutputFormat recipeOutputFormat) {
        this.recipeOutputFormat = recipeOutputFormat.toString();
        return this;
    }

    /**
     * <p>
     * The recipe of the component version.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param recipe
     *        The recipe of the component version.
     */

    public void setRecipe(java.nio.ByteBuffer recipe) {
        this.recipe = recipe;
    }

    /**
     * <p>
     * The recipe of the component version.
     * </p>
     * <p>
     * {@code ByteBuffer}s are stateful. Calling their {@code get} methods changes their {@code position}. We recommend
     * using {@link java.nio.ByteBuffer#asReadOnlyBuffer()} to create a read-only view of the buffer with an independent
     * {@code position}, and calling {@code get} methods on this rather than directly on the returned {@code ByteBuffer}.
     * Doing so will ensure that anyone else using the {@code ByteBuffer} will not be affected by changes to the
     * {@code position}.
     * </p>
     * 
     * @return The recipe of the component version.
     */

    public java.nio.ByteBuffer getRecipe() {
        return this.recipe;
    }

    /**
     * <p>
     * The recipe of the component version.
     * </p>
     * <p>
     * The AWS SDK for Java performs a Base64 encoding on this field before sending this request to the AWS service.
     * Users of the SDK should not perform Base64 encoding on this field.
     * </p>
     * <p>
     * Warning: ByteBuffers returned by the SDK are mutable. Changes to the content or position of the byte buffer will
     * be seen by all objects that have a reference to this object. It is recommended to call ByteBuffer.duplicate() or
     * ByteBuffer.asReadOnlyBuffer() before using or reading from the buffer. This behavior will be changed in a future
     * major version of the SDK.
     * </p>
     * 
     * @param recipe
     *        The recipe of the component version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentResult withRecipe(java.nio.ByteBuffer recipe) {
        setRecipe(recipe);
        return this;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS IoT
     * Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @return A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *         href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS
     *         IoT Greengrass V2 Developer Guide</i>.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS IoT
     * Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS
     *        IoT Greengrass V2 Developer Guide</i>.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * A list of key-value pairs that contain metadata for the resource. For more information, see <a
     * href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS IoT
     * Greengrass V2 Developer Guide</i>.
     * </p>
     * 
     * @param tags
     *        A list of key-value pairs that contain metadata for the resource. For more information, see <a
     *        href="https://docs.aws.amazon.com/greengrass/v2/tag-resources.html">Tag your resources</a> in the <i>AWS
     *        IoT Greengrass V2 Developer Guide</i>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentResult withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see GetComponentResult#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentResult addTagsEntry(String key, String value) {
        if (null == this.tags) {
            this.tags = new java.util.HashMap<String, String>();
        }
        if (this.tags.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.tags.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into Tags.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentResult clearTagsEntries() {
        this.tags = null;
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
        if (getRecipeOutputFormat() != null)
            sb.append("RecipeOutputFormat: ").append(getRecipeOutputFormat()).append(",");
        if (getRecipe() != null)
            sb.append("Recipe: ").append(getRecipe()).append(",");
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

        if (obj instanceof GetComponentResult == false)
            return false;
        GetComponentResult other = (GetComponentResult) obj;
        if (other.getRecipeOutputFormat() == null ^ this.getRecipeOutputFormat() == null)
            return false;
        if (other.getRecipeOutputFormat() != null && other.getRecipeOutputFormat().equals(this.getRecipeOutputFormat()) == false)
            return false;
        if (other.getRecipe() == null ^ this.getRecipe() == null)
            return false;
        if (other.getRecipe() != null && other.getRecipe().equals(this.getRecipe()) == false)
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

        hashCode = prime * hashCode + ((getRecipeOutputFormat() == null) ? 0 : getRecipeOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getRecipe() == null) ? 0 : getRecipe().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public GetComponentResult clone() {
        try {
            return (GetComponentResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
