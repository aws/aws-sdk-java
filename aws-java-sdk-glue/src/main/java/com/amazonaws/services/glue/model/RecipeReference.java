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
 * A reference to a Glue DataBrew recipe.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/glue-2017-03-31/RecipeReference" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecipeReference implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the DataBrew recipe.
     * </p>
     */
    private String recipeArn;
    /**
     * <p>
     * The RecipeVersion of the DataBrew recipe.
     * </p>
     */
    private String recipeVersion;

    /**
     * <p>
     * The ARN of the DataBrew recipe.
     * </p>
     * 
     * @param recipeArn
     *        The ARN of the DataBrew recipe.
     */

    public void setRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
    }

    /**
     * <p>
     * The ARN of the DataBrew recipe.
     * </p>
     * 
     * @return The ARN of the DataBrew recipe.
     */

    public String getRecipeArn() {
        return this.recipeArn;
    }

    /**
     * <p>
     * The ARN of the DataBrew recipe.
     * </p>
     * 
     * @param recipeArn
     *        The ARN of the DataBrew recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipeReference withRecipeArn(String recipeArn) {
        setRecipeArn(recipeArn);
        return this;
    }

    /**
     * <p>
     * The RecipeVersion of the DataBrew recipe.
     * </p>
     * 
     * @param recipeVersion
     *        The RecipeVersion of the DataBrew recipe.
     */

    public void setRecipeVersion(String recipeVersion) {
        this.recipeVersion = recipeVersion;
    }

    /**
     * <p>
     * The RecipeVersion of the DataBrew recipe.
     * </p>
     * 
     * @return The RecipeVersion of the DataBrew recipe.
     */

    public String getRecipeVersion() {
        return this.recipeVersion;
    }

    /**
     * <p>
     * The RecipeVersion of the DataBrew recipe.
     * </p>
     * 
     * @param recipeVersion
     *        The RecipeVersion of the DataBrew recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecipeReference withRecipeVersion(String recipeVersion) {
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
        if (getRecipeArn() != null)
            sb.append("RecipeArn: ").append(getRecipeArn()).append(",");
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

        if (obj instanceof RecipeReference == false)
            return false;
        RecipeReference other = (RecipeReference) obj;
        if (other.getRecipeArn() == null ^ this.getRecipeArn() == null)
            return false;
        if (other.getRecipeArn() != null && other.getRecipeArn().equals(this.getRecipeArn()) == false)
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

        hashCode = prime * hashCode + ((getRecipeArn() == null) ? 0 : getRecipeArn().hashCode());
        hashCode = prime * hashCode + ((getRecipeVersion() == null) ? 0 : getRecipeVersion().hashCode());
        return hashCode;
    }

    @Override
    public RecipeReference clone() {
        try {
            return (RecipeReference) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.glue.model.transform.RecipeReferenceMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
