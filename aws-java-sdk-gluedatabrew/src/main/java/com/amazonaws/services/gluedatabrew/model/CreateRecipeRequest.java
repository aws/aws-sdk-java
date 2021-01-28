/*
 * Copyright 2016-2021 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.gluedatabrew.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/CreateRecipe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRecipeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A description for the recipe.
     * </p>
     */
    private String description;
    /**
     * <p>
     * A unique name for the recipe. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and
     * space.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An array containing the steps to be performed by the recipe. Each recipe step consists of one recipe action and
     * (optionally) an array of condition expressions.
     * </p>
     */
    private java.util.List<RecipeStep> steps;
    /**
     * <p>
     * Metadata tags to apply to this recipe.
     * </p>
     */
    private java.util.Map<String, String> tags;

    /**
     * <p>
     * A description for the recipe.
     * </p>
     * 
     * @param description
     *        A description for the recipe.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description for the recipe.
     * </p>
     * 
     * @return A description for the recipe.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description for the recipe.
     * </p>
     * 
     * @param description
     *        A description for the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecipeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * A unique name for the recipe. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and
     * space.
     * </p>
     * 
     * @param name
     *        A unique name for the recipe. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.),
     *        and space.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * A unique name for the recipe. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and
     * space.
     * </p>
     * 
     * @return A unique name for the recipe. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.),
     *         and space.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * A unique name for the recipe. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.), and
     * space.
     * </p>
     * 
     * @param name
     *        A unique name for the recipe. Valid characters are alphanumeric (A-Z, a-z, 0-9), hyphen (-), period (.),
     *        and space.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecipeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An array containing the steps to be performed by the recipe. Each recipe step consists of one recipe action and
     * (optionally) an array of condition expressions.
     * </p>
     * 
     * @return An array containing the steps to be performed by the recipe. Each recipe step consists of one recipe
     *         action and (optionally) an array of condition expressions.
     */

    public java.util.List<RecipeStep> getSteps() {
        return steps;
    }

    /**
     * <p>
     * An array containing the steps to be performed by the recipe. Each recipe step consists of one recipe action and
     * (optionally) an array of condition expressions.
     * </p>
     * 
     * @param steps
     *        An array containing the steps to be performed by the recipe. Each recipe step consists of one recipe
     *        action and (optionally) an array of condition expressions.
     */

    public void setSteps(java.util.Collection<RecipeStep> steps) {
        if (steps == null) {
            this.steps = null;
            return;
        }

        this.steps = new java.util.ArrayList<RecipeStep>(steps);
    }

    /**
     * <p>
     * An array containing the steps to be performed by the recipe. Each recipe step consists of one recipe action and
     * (optionally) an array of condition expressions.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        An array containing the steps to be performed by the recipe. Each recipe step consists of one recipe
     *        action and (optionally) an array of condition expressions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecipeRequest withSteps(RecipeStep... steps) {
        if (this.steps == null) {
            setSteps(new java.util.ArrayList<RecipeStep>(steps.length));
        }
        for (RecipeStep ele : steps) {
            this.steps.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array containing the steps to be performed by the recipe. Each recipe step consists of one recipe action and
     * (optionally) an array of condition expressions.
     * </p>
     * 
     * @param steps
     *        An array containing the steps to be performed by the recipe. Each recipe step consists of one recipe
     *        action and (optionally) an array of condition expressions.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecipeRequest withSteps(java.util.Collection<RecipeStep> steps) {
        setSteps(steps);
        return this;
    }

    /**
     * <p>
     * Metadata tags to apply to this recipe.
     * </p>
     * 
     * @return Metadata tags to apply to this recipe.
     */

    public java.util.Map<String, String> getTags() {
        return tags;
    }

    /**
     * <p>
     * Metadata tags to apply to this recipe.
     * </p>
     * 
     * @param tags
     *        Metadata tags to apply to this recipe.
     */

    public void setTags(java.util.Map<String, String> tags) {
        this.tags = tags;
    }

    /**
     * <p>
     * Metadata tags to apply to this recipe.
     * </p>
     * 
     * @param tags
     *        Metadata tags to apply to this recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecipeRequest withTags(java.util.Map<String, String> tags) {
        setTags(tags);
        return this;
    }

    /**
     * Add a single Tags entry
     *
     * @see CreateRecipeRequest#withTags
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecipeRequest addTagsEntry(String key, String value) {
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

    public CreateRecipeRequest clearTagsEntries() {
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
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getSteps() != null)
            sb.append("Steps: ").append(getSteps()).append(",");
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

        if (obj instanceof CreateRecipeRequest == false)
            return false;
        CreateRecipeRequest other = (CreateRecipeRequest) obj;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getSteps() == null ^ this.getSteps() == null)
            return false;
        if (other.getSteps() != null && other.getSteps().equals(this.getSteps()) == false)
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

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRecipeRequest clone() {
        return (CreateRecipeRequest) super.clone();
    }

}
