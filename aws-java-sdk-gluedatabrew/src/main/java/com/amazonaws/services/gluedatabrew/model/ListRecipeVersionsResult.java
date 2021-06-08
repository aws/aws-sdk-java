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

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/ListRecipeVersions" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecipeVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A token that you can use in a subsequent call to retrieve the next set of results.
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * A list of versions for the specified recipe.
     * </p>
     */
    private java.util.List<Recipe> recipes;

    /**
     * <p>
     * A token that you can use in a subsequent call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that you can use in a subsequent call to retrieve the next set of results.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token that you can use in a subsequent call to retrieve the next set of results.
     * </p>
     * 
     * @return A token that you can use in a subsequent call to retrieve the next set of results.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token that you can use in a subsequent call to retrieve the next set of results.
     * </p>
     * 
     * @param nextToken
     *        A token that you can use in a subsequent call to retrieve the next set of results.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecipeVersionsResult withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * A list of versions for the specified recipe.
     * </p>
     * 
     * @return A list of versions for the specified recipe.
     */

    public java.util.List<Recipe> getRecipes() {
        return recipes;
    }

    /**
     * <p>
     * A list of versions for the specified recipe.
     * </p>
     * 
     * @param recipes
     *        A list of versions for the specified recipe.
     */

    public void setRecipes(java.util.Collection<Recipe> recipes) {
        if (recipes == null) {
            this.recipes = null;
            return;
        }

        this.recipes = new java.util.ArrayList<Recipe>(recipes);
    }

    /**
     * <p>
     * A list of versions for the specified recipe.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecipes(java.util.Collection)} or {@link #withRecipes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param recipes
     *        A list of versions for the specified recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecipeVersionsResult withRecipes(Recipe... recipes) {
        if (this.recipes == null) {
            setRecipes(new java.util.ArrayList<Recipe>(recipes.length));
        }
        for (Recipe ele : recipes) {
            this.recipes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of versions for the specified recipe.
     * </p>
     * 
     * @param recipes
     *        A list of versions for the specified recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecipeVersionsResult withRecipes(java.util.Collection<Recipe> recipes) {
        setRecipes(recipes);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getRecipes() != null)
            sb.append("Recipes: ").append(getRecipes());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecipeVersionsResult == false)
            return false;
        ListRecipeVersionsResult other = (ListRecipeVersionsResult) obj;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getRecipes() == null ^ this.getRecipes() == null)
            return false;
        if (other.getRecipes() != null && other.getRecipes().equals(this.getRecipes()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getRecipes() == null) ? 0 : getRecipes().hashCode());
        return hashCode;
    }

    @Override
    public ListRecipeVersionsResult clone() {
        try {
            return (ListRecipeVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
