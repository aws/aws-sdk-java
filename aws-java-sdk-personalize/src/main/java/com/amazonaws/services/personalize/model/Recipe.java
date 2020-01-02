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
 * Provides information about a recipe. Each recipe provides an algorithm that Amazon Personalize uses in model training
 * when you use the <a>CreateSolution</a> operation.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/Recipe" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recipe implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the recipe.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe.
     * </p>
     */
    private String recipeArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize uses to train the model.
     * </p>
     */
    private String algorithmArn;
    /**
     * <p>
     * The ARN of the FeatureTransformation object.
     * </p>
     */
    private String featureTransformationArn;
    /**
     * <p>
     * The status of the recipe.
     * </p>
     */
    private String status;
    /**
     * <p>
     * The description of the recipe.
     * </p>
     */
    private String description;
    /**
     * <p>
     * The date and time (in Unix format) that the recipe was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PERSONALIZED_RANKING
     * </p>
     * </li>
     * <li>
     * <p>
     * RELATED_ITEMS
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PERSONALIZATION
     * </p>
     * </li>
     * </ul>
     */
    private String recipeType;
    /**
     * <p>
     * The date and time (in Unix format) that the recipe was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The name of the recipe.
     * </p>
     * 
     * @param name
     *        The name of the recipe.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name of the recipe.
     * </p>
     * 
     * @return The name of the recipe.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name of the recipe.
     * </p>
     * 
     * @param name
     *        The name of the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe.
     * </p>
     * 
     * @param recipeArn
     *        The Amazon Resource Name (ARN) of the recipe.
     */

    public void setRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recipe.
     */

    public String getRecipeArn() {
        return this.recipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe.
     * </p>
     * 
     * @param recipeArn
     *        The Amazon Resource Name (ARN) of the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withRecipeArn(String recipeArn) {
        setRecipeArn(recipeArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize uses to train the model.
     * </p>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize uses to train the model.
     */

    public void setAlgorithmArn(String algorithmArn) {
        this.algorithmArn = algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize uses to train the model.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize uses to train the model.
     */

    public String getAlgorithmArn() {
        return this.algorithmArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize uses to train the model.
     * </p>
     * 
     * @param algorithmArn
     *        The Amazon Resource Name (ARN) of the algorithm that Amazon Personalize uses to train the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withAlgorithmArn(String algorithmArn) {
        setAlgorithmArn(algorithmArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the FeatureTransformation object.
     * </p>
     * 
     * @param featureTransformationArn
     *        The ARN of the FeatureTransformation object.
     */

    public void setFeatureTransformationArn(String featureTransformationArn) {
        this.featureTransformationArn = featureTransformationArn;
    }

    /**
     * <p>
     * The ARN of the FeatureTransformation object.
     * </p>
     * 
     * @return The ARN of the FeatureTransformation object.
     */

    public String getFeatureTransformationArn() {
        return this.featureTransformationArn;
    }

    /**
     * <p>
     * The ARN of the FeatureTransformation object.
     * </p>
     * 
     * @param featureTransformationArn
     *        The ARN of the FeatureTransformation object.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withFeatureTransformationArn(String featureTransformationArn) {
        setFeatureTransformationArn(featureTransformationArn);
        return this;
    }

    /**
     * <p>
     * The status of the recipe.
     * </p>
     * 
     * @param status
     *        The status of the recipe.
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the recipe.
     * </p>
     * 
     * @return The status of the recipe.
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the recipe.
     * </p>
     * 
     * @param status
     *        The status of the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * The description of the recipe.
     * </p>
     * 
     * @param description
     *        The description of the recipe.
     */

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * <p>
     * The description of the recipe.
     * </p>
     * 
     * @return The description of the recipe.
     */

    public String getDescription() {
        return this.description;
    }

    /**
     * <p>
     * The description of the recipe.
     * </p>
     * 
     * @param description
     *        The description of the recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withDescription(String description) {
        setDescription(description);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recipe was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix format) that the recipe was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recipe was created.
     * </p>
     * 
     * @return The date and time (in Unix format) that the recipe was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recipe was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix format) that the recipe was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PERSONALIZED_RANKING
     * </p>
     * </li>
     * <li>
     * <p>
     * RELATED_ITEMS
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PERSONALIZATION
     * </p>
     * </li>
     * </ul>
     * 
     * @param recipeType
     *        One of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PERSONALIZED_RANKING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RELATED_ITEMS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USER_PERSONALIZATION
     *        </p>
     *        </li>
     */

    public void setRecipeType(String recipeType) {
        this.recipeType = recipeType;
    }

    /**
     * <p>
     * One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PERSONALIZED_RANKING
     * </p>
     * </li>
     * <li>
     * <p>
     * RELATED_ITEMS
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PERSONALIZATION
     * </p>
     * </li>
     * </ul>
     * 
     * @return One of the following values:</p>
     *         <ul>
     *         <li>
     *         <p>
     *         PERSONALIZED_RANKING
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         RELATED_ITEMS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         USER_PERSONALIZATION
     *         </p>
     *         </li>
     */

    public String getRecipeType() {
        return this.recipeType;
    }

    /**
     * <p>
     * One of the following values:
     * </p>
     * <ul>
     * <li>
     * <p>
     * PERSONALIZED_RANKING
     * </p>
     * </li>
     * <li>
     * <p>
     * RELATED_ITEMS
     * </p>
     * </li>
     * <li>
     * <p>
     * USER_PERSONALIZATION
     * </p>
     * </li>
     * </ul>
     * 
     * @param recipeType
     *        One of the following values:</p>
     *        <ul>
     *        <li>
     *        <p>
     *        PERSONALIZED_RANKING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        RELATED_ITEMS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        USER_PERSONALIZATION
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withRecipeType(String recipeType) {
        setRecipeType(recipeType);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recipe was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix format) that the recipe was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recipe was last updated.
     * </p>
     * 
     * @return The date and time (in Unix format) that the recipe was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recipe was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix format) that the recipe was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recipe withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
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
        if (getRecipeArn() != null)
            sb.append("RecipeArn: ").append(getRecipeArn()).append(",");
        if (getAlgorithmArn() != null)
            sb.append("AlgorithmArn: ").append(getAlgorithmArn()).append(",");
        if (getFeatureTransformationArn() != null)
            sb.append("FeatureTransformationArn: ").append(getFeatureTransformationArn()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getDescription() != null)
            sb.append("Description: ").append(getDescription()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getRecipeType() != null)
            sb.append("RecipeType: ").append(getRecipeType()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime());
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
        if (other.getRecipeArn() == null ^ this.getRecipeArn() == null)
            return false;
        if (other.getRecipeArn() != null && other.getRecipeArn().equals(this.getRecipeArn()) == false)
            return false;
        if (other.getAlgorithmArn() == null ^ this.getAlgorithmArn() == null)
            return false;
        if (other.getAlgorithmArn() != null && other.getAlgorithmArn().equals(this.getAlgorithmArn()) == false)
            return false;
        if (other.getFeatureTransformationArn() == null ^ this.getFeatureTransformationArn() == null)
            return false;
        if (other.getFeatureTransformationArn() != null && other.getFeatureTransformationArn().equals(this.getFeatureTransformationArn()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getDescription() == null ^ this.getDescription() == null)
            return false;
        if (other.getDescription() != null && other.getDescription().equals(this.getDescription()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getRecipeType() == null ^ this.getRecipeType() == null)
            return false;
        if (other.getRecipeType() != null && other.getRecipeType().equals(this.getRecipeType()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecipeArn() == null) ? 0 : getRecipeArn().hashCode());
        hashCode = prime * hashCode + ((getAlgorithmArn() == null) ? 0 : getAlgorithmArn().hashCode());
        hashCode = prime * hashCode + ((getFeatureTransformationArn() == null) ? 0 : getFeatureTransformationArn().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getDescription() == null) ? 0 : getDescription().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getRecipeType() == null) ? 0 : getRecipeType().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
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
        com.amazonaws.services.personalize.model.transform.RecipeMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
