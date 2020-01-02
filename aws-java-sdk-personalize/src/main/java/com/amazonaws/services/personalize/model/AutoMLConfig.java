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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * When the solution performs AutoML (<code>performAutoML</code> is true in <a>CreateSolution</a>), Amazon Personalize
 * determines which recipe, from the specified list, optimizes the given metric. Amazon Personalize then uses that
 * recipe for the solution.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/AutoMLConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The metric to optimize.
     * </p>
     */
    private String metricName;
    /**
     * <p>
     * The list of candidate recipes.
     * </p>
     */
    private java.util.List<String> recipeList;

    /**
     * <p>
     * The metric to optimize.
     * </p>
     * 
     * @param metricName
     *        The metric to optimize.
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The metric to optimize.
     * </p>
     * 
     * @return The metric to optimize.
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The metric to optimize.
     * </p>
     * 
     * @param metricName
     *        The metric to optimize.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLConfig withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The list of candidate recipes.
     * </p>
     * 
     * @return The list of candidate recipes.
     */

    public java.util.List<String> getRecipeList() {
        return recipeList;
    }

    /**
     * <p>
     * The list of candidate recipes.
     * </p>
     * 
     * @param recipeList
     *        The list of candidate recipes.
     */

    public void setRecipeList(java.util.Collection<String> recipeList) {
        if (recipeList == null) {
            this.recipeList = null;
            return;
        }

        this.recipeList = new java.util.ArrayList<String>(recipeList);
    }

    /**
     * <p>
     * The list of candidate recipes.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setRecipeList(java.util.Collection)} or {@link #withRecipeList(java.util.Collection)} if you want to
     * override the existing values.
     * </p>
     * 
     * @param recipeList
     *        The list of candidate recipes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLConfig withRecipeList(String... recipeList) {
        if (this.recipeList == null) {
            setRecipeList(new java.util.ArrayList<String>(recipeList.length));
        }
        for (String ele : recipeList) {
            this.recipeList.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The list of candidate recipes.
     * </p>
     * 
     * @param recipeList
     *        The list of candidate recipes.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLConfig withRecipeList(java.util.Collection<String> recipeList) {
        setRecipeList(recipeList);
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
        if (getMetricName() != null)
            sb.append("MetricName: ").append(getMetricName()).append(",");
        if (getRecipeList() != null)
            sb.append("RecipeList: ").append(getRecipeList());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLConfig == false)
            return false;
        AutoMLConfig other = (AutoMLConfig) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        if (other.getRecipeList() == null ^ this.getRecipeList() == null)
            return false;
        if (other.getRecipeList() != null && other.getRecipeList().equals(this.getRecipeList()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        hashCode = prime * hashCode + ((getRecipeList() == null) ? 0 : getRecipeList().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLConfig clone() {
        try {
            return (AutoMLConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.AutoMLConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
