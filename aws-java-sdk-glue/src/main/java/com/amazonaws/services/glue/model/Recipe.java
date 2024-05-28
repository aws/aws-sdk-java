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
package com.amazonaws.services.glue.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * A Glue Studio node that uses a Glue DataBrew recipe in Glue jobs.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/Recipe" target="_top">AWS API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recipe implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the Glue Studio node.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The nodes that are inputs to the recipe node, identified by id.
     * </p>
     */
    private java.util.List<String> inputs;
    /**
     * <p>
     * A reference to the DataBrew recipe used by the node.
     * </p>
     */
    private RecipeReference recipeReference;

    /**
     * <p>
     * The name of the Glue Studio node.
     * </p>
     * 
     * @param name
     *        The name of the Glue Studio node.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the Glue Studio node.
     * </p>
     * 
     * @return The name of the Glue Studio node.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the Glue Studio node.
     * </p>
     * 
     * @param name
     *        The name of the Glue Studio node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The nodes that are inputs to the recipe node, identified by id.
     * </p>
     * 
     * @return The nodes that are inputs to the recipe node, identified by id.
     */

    public java.util.List<String> getInputs() {
        return inputs;
    }

    /**
     * <p>
     * The nodes that are inputs to the recipe node, identified by id.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the recipe node, identified by id.
     */

    public void setInputs(java.util.Collection<String> inputs) {
        if (inputs == null) {
            this.inputs = null;
            return;
        }

        this.inputs = new java.util.ArrayList<String>(inputs);
    }

    /**
     * <p>
     * The nodes that are inputs to the recipe node, identified by id.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setInputs(java.util.Collection)} or {@link #withInputs(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the recipe node, identified by id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withInputs(String... inputs) {
        if (this.inputs == null) {
            setInputs(new java.util.ArrayList<String>(inputs.length));
        }
        for (String ele : inputs) {
            this.inputs.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The nodes that are inputs to the recipe node, identified by id.
     * </p>
     * 
     * @param inputs
     *        The nodes that are inputs to the recipe node, identified by id.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withInputs(java.util.Collection<String> inputs) {
        setInputs(inputs);
        return this;
    }

    /**
     * <p>
     * A reference to the DataBrew recipe used by the node.
     * </p>
     * 
     * @param recipeReference
     *        A reference to the DataBrew recipe used by the node.
     */

    public void setRecipeReference(RecipeReference recipeReference) {
        this.recipeReference = recipeReference;
    }

    /**
     * <p>
     * A reference to the DataBrew recipe used by the node.
     * </p>
     * 
     * @return A reference to the DataBrew recipe used by the node.
     */

    public RecipeReference getRecipeReference() {
        return this.recipeReference;
    }

    /**
     * <p>
     * A reference to the DataBrew recipe used by the node.
     * </p>
     * 
     * @param recipeReference
     *        A reference to the DataBrew recipe used by the node.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withRecipeReference(RecipeReference recipeReference) {
        setRecipeReference(recipeReference);
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
        if (getInputs() != null)
            sb.append("Inputs: ").append(getInputs()).append(",");
        if (getRecipeReference() != null)
            sb.append("RecipeReference: ").append(getRecipeReference());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Recipe == false)
            return false;
        Recipe other = (Recipe) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getInputs() == null ^ this.getInputs() == null)
            return false;
        if (other.getInputs() != null && other.getInputs().equals(this.getInputs()) == false)
            return false;
        if (other.getRecipeReference() == null ^ this.getRecipeReference() == null)
            return false;
        if (other.getRecipeReference() != null && other.getRecipeReference().equals(this.getRecipeReference()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getInputs() == null) ? 0 : getInputs().hashCode());
        hashCode = prime * hashCode + ((getRecipeReference() == null) ? 0 : getRecipeReference().hashCode());
        return hashCode;
    }

    @Override
    public Recipe clone() {
        try {
            return (Recipe) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.RecipeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
