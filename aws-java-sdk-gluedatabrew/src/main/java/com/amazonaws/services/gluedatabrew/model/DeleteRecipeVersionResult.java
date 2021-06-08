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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/DeleteRecipeVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class DeleteRecipeVersionResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the recipe that was deleted.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The version of the recipe that was deleted.
     * </p>
     */
    private String recipeVersion;

    /**
     * <p>
     * The name of the recipe that was deleted.
     * </p>
     * 
     * @param name
     *        The name of the recipe that was deleted.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the recipe that was deleted.
     * </p>
     * 
     * @return The name of the recipe that was deleted.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the recipe that was deleted.
     * </p>
     * 
     * @param name
     *        The name of the recipe that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRecipeVersionResult withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The version of the recipe that was deleted.
     * </p>
     * 
     * @param recipeVersion
     *        The version of the recipe that was deleted.
     */

    public void setRecipeVersion(String recipeVersion) {
        this.recipeVersion = recipeVersion;
    }

    /**
     * <p>
     * The version of the recipe that was deleted.
     * </p>
     * 
     * @return The version of the recipe that was deleted.
     */

    public String getRecipeVersion() {
        return this.recipeVersion;
    }

    /**
     * <p>
     * The version of the recipe that was deleted.
     * </p>
     * 
     * @param recipeVersion
     *        The version of the recipe that was deleted.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public DeleteRecipeVersionResult withRecipeVersion(String recipeVersion) {
        setRecipeVersion(recipeVersion);
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
        if (getRecipeVersion() != null)
            sb.append("RecipeVersion: ").append(getRecipeVersion());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof DeleteRecipeVersionResult == false)
            return false;
        DeleteRecipeVersionResult other = (DeleteRecipeVersionResult) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRecipeVersion() == null ^ this.getRecipeVersion() == null)
            return false;
        if (other.getRecipeVersion() != null && other.getRecipeVersion().equals(this.getRecipeVersion()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecipeVersion() == null) ? 0 : getRecipeVersion().hashCode());
        return hashCode;
    }

    @Override
    public DeleteRecipeVersionResult clone() {
        try {
            return (DeleteRecipeVersionResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
