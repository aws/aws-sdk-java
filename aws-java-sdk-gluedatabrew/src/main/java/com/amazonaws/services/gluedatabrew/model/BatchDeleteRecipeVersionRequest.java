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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/BatchDeleteRecipeVersion" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class BatchDeleteRecipeVersionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the recipe whose versions are to be deleted.
     * </p>
     */
    private String name;
    /**
     * <p>
     * An array of version identifiers, for the recipe versions to be deleted. You can specify numeric versions (
     * <code>X.Y</code>) or <code>LATEST_WORKING</code>. <code>LATEST_PUBLISHED</code> is not supported.
     * </p>
     */
    private java.util.List<String> recipeVersions;

    /**
     * <p>
     * The name of the recipe whose versions are to be deleted.
     * </p>
     * 
     * @param name
     *        The name of the recipe whose versions are to be deleted.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the recipe whose versions are to be deleted.
     * </p>
     * 
     * @return The name of the recipe whose versions are to be deleted.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the recipe whose versions are to be deleted.
     * </p>
     * 
     * @param name
     *        The name of the recipe whose versions are to be deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRecipeVersionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * An array of version identifiers, for the recipe versions to be deleted. You can specify numeric versions (
     * <code>X.Y</code>) or <code>LATEST_WORKING</code>. <code>LATEST_PUBLISHED</code> is not supported.
     * </p>
     * 
     * @return An array of version identifiers, for the recipe versions to be deleted. You can specify numeric versions
     *         (<code>X.Y</code>) or <code>LATEST_WORKING</code>. <code>LATEST_PUBLISHED</code> is not supported.
     */

    public java.util.List<String> getRecipeVersions() {
        return recipeVersions;
    }

    /**
     * <p>
     * An array of version identifiers, for the recipe versions to be deleted. You can specify numeric versions (
     * <code>X.Y</code>) or <code>LATEST_WORKING</code>. <code>LATEST_PUBLISHED</code> is not supported.
     * </p>
     * 
     * @param recipeVersions
     *        An array of version identifiers, for the recipe versions to be deleted. You can specify numeric versions (
     *        <code>X.Y</code>) or <code>LATEST_WORKING</code>. <code>LATEST_PUBLISHED</code> is not supported.
     */

    public void setRecipeVersions(java.util.Collection<String> recipeVersions) {
        if (recipeVersions == null) {
            this.recipeVersions = null;
            return;
        }

        this.recipeVersions = new java.util.ArrayList<String>(recipeVersions);
    }

    /**
     * <p>
     * An array of version identifiers, for the recipe versions to be deleted. You can specify numeric versions (
     * <code>X.Y</code>) or <code>LATEST_WORKING</code>. <code>LATEST_PUBLISHED</code> is not supported.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecipeVersions(java.util.Collection)} or {@link #withRecipeVersions(java.util.Collection)} if you want
     * to override the existing values.
     * </p>
     * 
     * @param recipeVersions
     *        An array of version identifiers, for the recipe versions to be deleted. You can specify numeric versions (
     *        <code>X.Y</code>) or <code>LATEST_WORKING</code>. <code>LATEST_PUBLISHED</code> is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRecipeVersionRequest withRecipeVersions(String... recipeVersions) {
        if (this.recipeVersions == null) {
            setRecipeVersions(new java.util.ArrayList<String>(recipeVersions.length));
        }
        for (String ele : recipeVersions) {
            this.recipeVersions.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * An array of version identifiers, for the recipe versions to be deleted. You can specify numeric versions (
     * <code>X.Y</code>) or <code>LATEST_WORKING</code>. <code>LATEST_PUBLISHED</code> is not supported.
     * </p>
     * 
     * @param recipeVersions
     *        An array of version identifiers, for the recipe versions to be deleted. You can specify numeric versions (
     *        <code>X.Y</code>) or <code>LATEST_WORKING</code>. <code>LATEST_PUBLISHED</code> is not supported.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public BatchDeleteRecipeVersionRequest withRecipeVersions(java.util.Collection<String> recipeVersions) {
        setRecipeVersions(recipeVersions);
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
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRecipeVersions() != null)
            sb.append("RecipeVersions: ").append(getRecipeVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof BatchDeleteRecipeVersionRequest == false)
            return false;
        BatchDeleteRecipeVersionRequest other = (BatchDeleteRecipeVersionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRecipeVersions() == null ^ this.getRecipeVersions() == null)
            return false;
        if (other.getRecipeVersions() != null && other.getRecipeVersions().equals(this.getRecipeVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecipeVersions() == null) ? 0 : getRecipeVersions().hashCode());
        return hashCode;
    }

    @Override
    public BatchDeleteRecipeVersionRequest clone() {
        return (BatchDeleteRecipeVersionRequest) super.clone();
    }

}
