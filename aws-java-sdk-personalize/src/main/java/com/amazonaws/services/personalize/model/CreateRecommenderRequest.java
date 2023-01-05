/*
 * Copyright 2018-2023 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateRecommender" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateRecommenderRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name of the recommender.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination domain dataset group for the recommender.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe that the recommender will use. For a recommender, a recipe is a
     * Domain dataset group use case. Only Domain dataset group use cases can be used to create a recommender. For
     * information about use cases see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/domain-use-cases.html">Choosing recommender use
     * cases</a>.
     * </p>
     */
    private String recipeArn;
    /**
     * <p>
     * The configuration details of the recommender.
     * </p>
     */
    private RecommenderConfig recommenderConfig;
    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the recommender.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name of the recommender.
     * </p>
     * 
     * @param name
     *        The name of the recommender.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the recommender.
     * </p>
     * 
     * @return The name of the recommender.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the recommender.
     * </p>
     * 
     * @param name
     *        The name of the recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommenderRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination domain dataset group for the recommender.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the destination domain dataset group for the recommender.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination domain dataset group for the recommender.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the destination domain dataset group for the recommender.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the destination domain dataset group for the recommender.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the destination domain dataset group for the recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommenderRequest withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe that the recommender will use. For a recommender, a recipe is a
     * Domain dataset group use case. Only Domain dataset group use cases can be used to create a recommender. For
     * information about use cases see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/domain-use-cases.html">Choosing recommender use
     * cases</a>.
     * </p>
     * 
     * @param recipeArn
     *        The Amazon Resource Name (ARN) of the recipe that the recommender will use. For a recommender, a recipe is
     *        a Domain dataset group use case. Only Domain dataset group use cases can be used to create a recommender.
     *        For information about use cases see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/domain-use-cases.html">Choosing recommender use
     *        cases</a>.
     */

    public void setRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe that the recommender will use. For a recommender, a recipe is a
     * Domain dataset group use case. Only Domain dataset group use cases can be used to create a recommender. For
     * information about use cases see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/domain-use-cases.html">Choosing recommender use
     * cases</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recipe that the recommender will use. For a recommender, a recipe
     *         is a Domain dataset group use case. Only Domain dataset group use cases can be used to create a
     *         recommender. For information about use cases see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/domain-use-cases.html">Choosing recommender use
     *         cases</a>.
     */

    public String getRecipeArn() {
        return this.recipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe that the recommender will use. For a recommender, a recipe is a
     * Domain dataset group use case. Only Domain dataset group use cases can be used to create a recommender. For
     * information about use cases see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/domain-use-cases.html">Choosing recommender use
     * cases</a>.
     * </p>
     * 
     * @param recipeArn
     *        The Amazon Resource Name (ARN) of the recipe that the recommender will use. For a recommender, a recipe is
     *        a Domain dataset group use case. Only Domain dataset group use cases can be used to create a recommender.
     *        For information about use cases see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/domain-use-cases.html">Choosing recommender use
     *        cases</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommenderRequest withRecipeArn(String recipeArn) {
        setRecipeArn(recipeArn);
        return this;
    }

    /**
     * <p>
     * The configuration details of the recommender.
     * </p>
     * 
     * @param recommenderConfig
     *        The configuration details of the recommender.
     */

    public void setRecommenderConfig(RecommenderConfig recommenderConfig) {
        this.recommenderConfig = recommenderConfig;
    }

    /**
     * <p>
     * The configuration details of the recommender.
     * </p>
     * 
     * @return The configuration details of the recommender.
     */

    public RecommenderConfig getRecommenderConfig() {
        return this.recommenderConfig;
    }

    /**
     * <p>
     * The configuration details of the recommender.
     * </p>
     * 
     * @param recommenderConfig
     *        The configuration details of the recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommenderRequest withRecommenderConfig(RecommenderConfig recommenderConfig) {
        setRecommenderConfig(recommenderConfig);
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the recommender.
     * </p>
     * 
     * @return A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *         apply to the recommender.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the recommender.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the recommender.
     */

    public void setTags(java.util.Collection<Tag> tags) {
        if (tags == null) {
            this.tags = null;
            return;
        }

        this.tags = new java.util.ArrayList<Tag>(tags);
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the recommender.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommenderRequest withTags(Tag... tags) {
        if (this.tags == null) {
            setTags(new java.util.ArrayList<Tag>(tags.length));
        }
        for (Tag ele : tags) {
            this.tags.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to apply
     * to the recommender.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dev/tagging-resources.html">tags</a> to
     *        apply to the recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateRecommenderRequest withTags(java.util.Collection<Tag> tags) {
        setTags(tags);
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
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getRecipeArn() != null)
            sb.append("RecipeArn: ").append(getRecipeArn()).append(",");
        if (getRecommenderConfig() != null)
            sb.append("RecommenderConfig: ").append(getRecommenderConfig()).append(",");
        if (getTags() != null)
            sb.append("Tags: ").append(getTags());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CreateRecommenderRequest == false)
            return false;
        CreateRecommenderRequest other = (CreateRecommenderRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getRecipeArn() == null ^ this.getRecipeArn() == null)
            return false;
        if (other.getRecipeArn() != null && other.getRecipeArn().equals(this.getRecipeArn()) == false)
            return false;
        if (other.getRecommenderConfig() == null ^ this.getRecommenderConfig() == null)
            return false;
        if (other.getRecommenderConfig() != null && other.getRecommenderConfig().equals(this.getRecommenderConfig()) == false)
            return false;
        if (other.getTags() == null ^ this.getTags() == null)
            return false;
        if (other.getTags() != null && other.getTags().equals(this.getTags()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getRecipeArn() == null) ? 0 : getRecipeArn().hashCode());
        hashCode = prime * hashCode + ((getRecommenderConfig() == null) ? 0 : getRecommenderConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateRecommenderRequest clone() {
        return (CreateRecommenderRequest) super.clone();
    }

}
