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
package com.amazonaws.services.personalize.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/DescribeRecipe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DescribeRecipeResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * An object that describes the recipe.
     * </p>
     */
    private Recipe recipe;

    /**
     * <p>
     * An object that describes the recipe.
     * </p>
     * 
     * @param recipe
     *        An object that describes the recipe.
     */

    public void setRecipe(Recipe recipe) {
        this.recipe = recipe;
    }

    /**
     * <p>
     * An object that describes the recipe.
     * </p>
     * 
     * @return An object that describes the recipe.
     */

    public Recipe getRecipe() {
        return this.recipe;
    }

    /**
     * <p>
     * An object that describes the recipe.
     * </p>
     * 
     * @param recipe
     *        An object that describes the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DescribeRecipeResult withRecipe(Recipe recipe) {
        setRecipe(recipe);
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
        if (getRecipe() != null)
            sb.append("Recipe: ").append(getRecipe());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DescribeRecipeResult == false)
            return false;
        DescribeRecipeResult other = (DescribeRecipeResult) obj;
        if (other.getRecipe() == null ^ this.getRecipe() == null)
            return false;
        if (other.getRecipe() != null && other.getRecipe().equals(this.getRecipe()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecipe() == null) ? 0 : getRecipe().hashCode());
        return hashCode;
    }

    @Override
    public DescribeRecipeResult clone() {
        try {
            return (DescribeRecipeResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
