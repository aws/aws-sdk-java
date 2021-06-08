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
package com.amazonaws.services.greengrassv2.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/greengrassv2-2020-11-30/GetComponent" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class GetComponentRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The format of the recipe.
     * </p>
     */
    private String recipeOutputFormat;
    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version.
     * </p>
     */
    private String arn;

    /**
     * <p>
     * The format of the recipe.
     * </p>
     * 
     * @param recipeOutputFormat
     *        The format of the recipe.
     * @see RecipeOutputFormat
     */

    public void setRecipeOutputFormat(String recipeOutputFormat) {
        this.recipeOutputFormat = recipeOutputFormat;
    }

    /**
     * <p>
     * The format of the recipe.
     * </p>
     * 
     * @return The format of the recipe.
     * @see RecipeOutputFormat
     */

    public String getRecipeOutputFormat() {
        return this.recipeOutputFormat;
    }

    /**
     * <p>
     * The format of the recipe.
     * </p>
     * 
     * @param recipeOutputFormat
     *        The format of the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecipeOutputFormat
     */

    public GetComponentRequest withRecipeOutputFormat(String recipeOutputFormat) {
        setRecipeOutputFormat(recipeOutputFormat);
        return this;
    }

    /**
     * <p>
     * The format of the recipe.
     * </p>
     * 
     * @param recipeOutputFormat
     *        The format of the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see RecipeOutputFormat
     */

    public GetComponentRequest withRecipeOutputFormat(RecipeOutputFormat recipeOutputFormat) {
        this.recipeOutputFormat = recipeOutputFormat.toString();
        return this;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        component version.
     */

    public void setArn(String arn) {
        this.arn = arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version.
     * </p>
     * 
     * @return The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *         component version.
     */

    public String getArn() {
        return this.arn;
    }

    /**
     * <p>
     * The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the component
     * version.
     * </p>
     * 
     * @param arn
     *        The <a href="https://docs.aws.amazon.com/general/latest/gr/aws-arns-and-namespaces.html">ARN</a> of the
     *        component version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public GetComponentRequest withArn(String arn) {
        setArn(arn);
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
        if (getRecipeOutputFormat() != null)
            sb.append("RecipeOutputFormat: ").append(getRecipeOutputFormat()).append(",");
        if (getArn() != null)
            sb.append("Arn: ").append(getArn());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof GetComponentRequest == false)
            return false;
        GetComponentRequest other = (GetComponentRequest) obj;
        if (other.getRecipeOutputFormat() == null ^ this.getRecipeOutputFormat() == null)
            return false;
        if (other.getRecipeOutputFormat() != null && other.getRecipeOutputFormat().equals(this.getRecipeOutputFormat()) == false)
            return false;
        if (other.getArn() == null ^ this.getArn() == null)
            return false;
        if (other.getArn() != null && other.getArn().equals(this.getArn()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecipeOutputFormat() == null) ? 0 : getRecipeOutputFormat().hashCode());
        hashCode = prime * hashCode + ((getArn() == null) ? 0 : getArn().hashCode());
        return hashCode;
    }

    @Override
    public GetComponentRequest clone() {
        return (GetComponentRequest) super.clone();
    }

}
