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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListRecipes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecipesResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The list of available recipes.
     * </p>
     */
    private java.util.List<RecipeSummary> recipes;
    /**
     * <p>
     * A token for getting the next set of recipes.
     * </p>
     */
    private String nextToken;

    /**
     * <p>
     * The list of available recipes.
     * </p>
     * 
     * @return The list of available recipes.
     */

    public java.util.List<RecipeSummary> getRecipes() {
        return recipes;
    }

    /**
     * <p>
     * The list of available recipes.
     * </p>
     * 
     * @param recipes
     *        The list of available recipes.
     */

    public void setRecipes(java.util.Collection<RecipeSummary> recipes) {
        if (recipes == null) {
            this.recipes = null;
            return;
        }

        this.recipes = new java.util.ArrayList<RecipeSummary>(recipes);
    }

    /**
     * <p>
     * The list of available recipes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecipes(java.util.Collection)} or {@link #withRecipes(java.util.Collection)} if you want to override
     * the existing values.
     * </p>
     * 
     * @param recipes
     *        The list of available recipes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecipesResult withRecipes(RecipeSummary... recipes) {
        if (this.recipes == null) {
            setRecipes(new java.util.ArrayList<RecipeSummary>(recipes.length));
        }
        for (RecipeSummary ele : recipes) {
            this.recipes.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of available recipes.
     * </p>
     * 
     * @param recipes
     *        The list of available recipes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecipesResult withRecipes(java.util.Collection<RecipeSummary> recipes) {
        setRecipes(recipes);
        return this;
    }

    /**
     * <p>
     * A token for getting the next set of recipes.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of recipes.
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of recipes.
     * </p>
     * 
     * @return A token for getting the next set of recipes.
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token for getting the next set of recipes.
     * </p>
     * 
     * @param nextToken
     *        A token for getting the next set of recipes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecipesResult withNextToken(String nextToken) {
        setNextToken(nextToken);
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
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecipesResult == false)
            return false;
        ListRecipesResult other = (ListRecipesResult) obj;
        if (other.getRecipes() == null ^ this.getRecipes() == null)
            return false;
        if (other.getRecipes() != null && other.getRecipes().equals(this.getRecipes()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecipes() == null) ? 0 : getRecipes().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        return hashCode;
    }

    @Override
    public ListRecipesResult clone() {
        try {
            return (ListRecipesResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
