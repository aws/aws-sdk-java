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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/databrew-2017-07-25/UpdateRecipe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class UpdateRecipeRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * A description of the recipe.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The name of the recipe to be updated.
     * </p>
     */
    private String name;
    /**
     * <p>
     * One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under which
     * the action should succeed.
     * </p>
     */
    private java.util.List<RecipeStep> steps;

    /**
     * <p>
     * A description of the recipe.
     * </p>
     * 
     * @param description
     *        A description of the recipe.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * A description of the recipe.
     * </p>
     * 
     * @return A description of the recipe.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * A description of the recipe.
     * </p>
     * 
     * @param description
     *        A description of the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeRequest withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The name of the recipe to be updated.
     * </p>
     * 
     * @param name
     *        The name of the recipe to be updated.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the recipe to be updated.
     * </p>
     * 
     * @return The name of the recipe to be updated.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the recipe to be updated.
     * </p>
     * 
     * @param name
     *        The name of the recipe to be updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under which
     * the action should succeed.
     * </p>
     * 
     * @return One or more steps to be performed by the recipe. Each step consists of an action, and the conditions
     *         under which the action should succeed.
     */

    public java.util.List<RecipeStep> getSteps() {
        return steps;
    }

    /**
     * <p>
     * One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under which
     * the action should succeed.
     * </p>
     * 
     * @param steps
     *        One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under
     *        which the action should succeed.
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
     * One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under which
     * the action should succeed.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setSteps(java.util.Collection)} or {@link #withSteps(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param steps
     *        One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under
     *        which the action should succeed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeRequest withSteps(RecipeStep... steps) {
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
     * One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under which
     * the action should succeed.
     * </p>
     * 
     * @param steps
     *        One or more steps to be performed by the recipe. Each step consists of an action, and the conditions under
     *        which the action should succeed.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public UpdateRecipeRequest withSteps(java.util.Collection<RecipeStep> steps) {
        setSteps(steps);
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
            sb.append("Steps: ").append(getSteps());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof UpdateRecipeRequest == false)
            return false;
        UpdateRecipeRequest other = (UpdateRecipeRequest) obj;
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
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getSteps() == null) ? 0 : getSteps().hashCode());
        return hashCode;
    }

    @Override
    public UpdateRecipeRequest clone() {
        return (UpdateRecipeRequest) super.clone();
    }

}
