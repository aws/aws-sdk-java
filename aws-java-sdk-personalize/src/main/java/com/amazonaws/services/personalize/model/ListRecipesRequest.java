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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/ListRecipes" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class ListRecipesRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The default is <code>SERVICE</code>.
     * </p>
     */
    private String recipeProvider;
    /**
     * <p>
     * A token returned from the previous call to <code>ListRecipes</code> for getting the next set of recipes (if they
     * exist).
     * </p>
     */
    private String nextToken;
    /**
     * <p>
     * The maximum number of recipes to return.
     * </p>
     */
    private Integer maxResults;

    /**
     * <p>
     * The default is <code>SERVICE</code>.
     * </p>
     * 
     * @param recipeProvider
     *        The default is <code>SERVICE</code>.
     * @see RecipeProvider
     */

    public void setRecipeProvider(String recipeProvider) {
        this.recipeProvider = recipeProvider;
    }

    /**
     * <p>
     * The default is <code>SERVICE</code>.
     * </p>
     * 
     * @return The default is <code>SERVICE</code>.
     * @see RecipeProvider
     */

    public String getRecipeProvider() {
        return this.recipeProvider;
    }

    /**
     * <p>
     * The default is <code>SERVICE</code>.
     * </p>
     * 
     * @param recipeProvider
     *        The default is <code>SERVICE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecipeProvider
     */

    public ListRecipesRequest withRecipeProvider(String recipeProvider) {
        setRecipeProvider(recipeProvider);
        return this;
    }

    /**
     * <p>
     * The default is <code>SERVICE</code>.
     * </p>
     * 
     * @param recipeProvider
     *        The default is <code>SERVICE</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecipeProvider
     */

    public ListRecipesRequest withRecipeProvider(RecipeProvider recipeProvider) {
        this.recipeProvider = recipeProvider.toString();
        return this;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListRecipes</code> for getting the next set of recipes (if they
     * exist).
     * </p>
     * 
     * @param nextToken
     *        A token returned from the previous call to <code>ListRecipes</code> for getting the next set of recipes
     *        (if they exist).
     */

    public void setNextToken(String nextToken) {
        this.nextToken = nextToken;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListRecipes</code> for getting the next set of recipes (if they
     * exist).
     * </p>
     * 
     * @return A token returned from the previous call to <code>ListRecipes</code> for getting the next set of recipes
     *         (if they exist).
     */

    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * <p>
     * A token returned from the previous call to <code>ListRecipes</code> for getting the next set of recipes (if they
     * exist).
     * </p>
     * 
     * @param nextToken
     *        A token returned from the previous call to <code>ListRecipes</code> for getting the next set of recipes
     *        (if they exist).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecipesRequest withNextToken(String nextToken) {
        setNextToken(nextToken);
        return this;
    }

    /**
     * <p>
     * The maximum number of recipes to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of recipes to return.
     */

    public void setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
    }

    /**
     * <p>
     * The maximum number of recipes to return.
     * </p>
     * 
     * @return The maximum number of recipes to return.
     */

    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * <p>
     * The maximum number of recipes to return.
     * </p>
     * 
     * @param maxResults
     *        The maximum number of recipes to return.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public ListRecipesRequest withMaxResults(Integer maxResults) {
        setMaxResults(maxResults);
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
        if (getRecipeProvider() != null)
            sb.append("RecipeProvider: ").append(getRecipeProvider()).append(",");
        if (getNextToken() != null)
            sb.append("NextToken: ").append(getNextToken()).append(",");
        if (getMaxResults() != null)
            sb.append("MaxResults: ").append(getMaxResults());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof ListRecipesRequest == false)
            return false;
        ListRecipesRequest other = (ListRecipesRequest) obj;
        if (other.getRecipeProvider() == null ^ this.getRecipeProvider() == null)
            return false;
        if (other.getRecipeProvider() != null && other.getRecipeProvider().equals(this.getRecipeProvider()) == false)
            return false;
        if (other.getNextToken() == null ^ this.getNextToken() == null)
            return false;
        if (other.getNextToken() != null && other.getNextToken().equals(this.getNextToken()) == false)
            return false;
        if (other.getMaxResults() == null ^ this.getMaxResults() == null)
            return false;
        if (other.getMaxResults() != null && other.getMaxResults().equals(this.getMaxResults()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecipeProvider() == null) ? 0 : getRecipeProvider().hashCode());
        hashCode = prime * hashCode + ((getNextToken() == null) ? 0 : getNextToken().hashCode());
        hashCode = prime * hashCode + ((getMaxResults() == null) ? 0 : getMaxResults().hashCode());
        return hashCode;
    }

    @Override
    public ListRecipesRequest clone() {
        return (ListRecipesRequest) super.clone();
    }

}
