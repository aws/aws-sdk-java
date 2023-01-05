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
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The configuration details of the recommender.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/RecommenderConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RecommenderConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * Specifies the exploration configuration hyperparameters, including <code>explorationWeight</code> and
     * <code>explorationItemAgeCutOff</code>, you want to use to configure the amount of item exploration Amazon
     * Personalize uses when recommending items. Provide <code>itemExplorationConfig</code> data only if your
     * recommenders generate personalized recommendations for a user (not popular items or similar items).
     * </p>
     */
    private java.util.Map<String, String> itemExplorationConfig;
    /**
     * <p>
     * Specifies the requested minimum provisioned recommendation requests per second that Amazon Personalize will
     * support.
     * </p>
     */
    private Integer minRecommendationRequestsPerSecond;

    /**
     * <p>
     * Specifies the exploration configuration hyperparameters, including <code>explorationWeight</code> and
     * <code>explorationItemAgeCutOff</code>, you want to use to configure the amount of item exploration Amazon
     * Personalize uses when recommending items. Provide <code>itemExplorationConfig</code> data only if your
     * recommenders generate personalized recommendations for a user (not popular items or similar items).
     * </p>
     * 
     * @return Specifies the exploration configuration hyperparameters, including <code>explorationWeight</code> and
     *         <code>explorationItemAgeCutOff</code>, you want to use to configure the amount of item exploration Amazon
     *         Personalize uses when recommending items. Provide <code>itemExplorationConfig</code> data only if your
     *         recommenders generate personalized recommendations for a user (not popular items or similar items).
     */

    public java.util.Map<String, String> getItemExplorationConfig() {
        return itemExplorationConfig;
    }

    /**
     * <p>
     * Specifies the exploration configuration hyperparameters, including <code>explorationWeight</code> and
     * <code>explorationItemAgeCutOff</code>, you want to use to configure the amount of item exploration Amazon
     * Personalize uses when recommending items. Provide <code>itemExplorationConfig</code> data only if your
     * recommenders generate personalized recommendations for a user (not popular items or similar items).
     * </p>
     * 
     * @param itemExplorationConfig
     *        Specifies the exploration configuration hyperparameters, including <code>explorationWeight</code> and
     *        <code>explorationItemAgeCutOff</code>, you want to use to configure the amount of item exploration Amazon
     *        Personalize uses when recommending items. Provide <code>itemExplorationConfig</code> data only if your
     *        recommenders generate personalized recommendations for a user (not popular items or similar items).
     */

    public void setItemExplorationConfig(java.util.Map<String, String> itemExplorationConfig) {
        this.itemExplorationConfig = itemExplorationConfig;
    }

    /**
     * <p>
     * Specifies the exploration configuration hyperparameters, including <code>explorationWeight</code> and
     * <code>explorationItemAgeCutOff</code>, you want to use to configure the amount of item exploration Amazon
     * Personalize uses when recommending items. Provide <code>itemExplorationConfig</code> data only if your
     * recommenders generate personalized recommendations for a user (not popular items or similar items).
     * </p>
     * 
     * @param itemExplorationConfig
     *        Specifies the exploration configuration hyperparameters, including <code>explorationWeight</code> and
     *        <code>explorationItemAgeCutOff</code>, you want to use to configure the amount of item exploration Amazon
     *        Personalize uses when recommending items. Provide <code>itemExplorationConfig</code> data only if your
     *        recommenders generate personalized recommendations for a user (not popular items or similar items).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfig withItemExplorationConfig(java.util.Map<String, String> itemExplorationConfig) {
        setItemExplorationConfig(itemExplorationConfig);
        return this;
    }

    /**
     * Add a single ItemExplorationConfig entry
     *
     * @see RecommenderConfig#withItemExplorationConfig
     * @returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfig addItemExplorationConfigEntry(String key, String value) {
        if (null == this.itemExplorationConfig) {
            this.itemExplorationConfig = new java.util.HashMap<String, String>();
        }
        if (this.itemExplorationConfig.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.itemExplorationConfig.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ItemExplorationConfig.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfig clearItemExplorationConfigEntries() {
        this.itemExplorationConfig = null;
        return this;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned recommendation requests per second that Amazon Personalize will
     * support.
     * </p>
     * 
     * @param minRecommendationRequestsPerSecond
     *        Specifies the requested minimum provisioned recommendation requests per second that Amazon Personalize
     *        will support.
     */

    public void setMinRecommendationRequestsPerSecond(Integer minRecommendationRequestsPerSecond) {
        this.minRecommendationRequestsPerSecond = minRecommendationRequestsPerSecond;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned recommendation requests per second that Amazon Personalize will
     * support.
     * </p>
     * 
     * @return Specifies the requested minimum provisioned recommendation requests per second that Amazon Personalize
     *         will support.
     */

    public Integer getMinRecommendationRequestsPerSecond() {
        return this.minRecommendationRequestsPerSecond;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned recommendation requests per second that Amazon Personalize will
     * support.
     * </p>
     * 
     * @param minRecommendationRequestsPerSecond
     *        Specifies the requested minimum provisioned recommendation requests per second that Amazon Personalize
     *        will support.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfig withMinRecommendationRequestsPerSecond(Integer minRecommendationRequestsPerSecond) {
        setMinRecommendationRequestsPerSecond(minRecommendationRequestsPerSecond);
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
        if (getItemExplorationConfig() != null)
            sb.append("ItemExplorationConfig: ").append(getItemExplorationConfig()).append(",");
        if (getMinRecommendationRequestsPerSecond() != null)
            sb.append("MinRecommendationRequestsPerSecond: ").append(getMinRecommendationRequestsPerSecond());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RecommenderConfig == false)
            return false;
        RecommenderConfig other = (RecommenderConfig) obj;
        if (other.getItemExplorationConfig() == null ^ this.getItemExplorationConfig() == null)
            return false;
        if (other.getItemExplorationConfig() != null && other.getItemExplorationConfig().equals(this.getItemExplorationConfig()) == false)
            return false;
        if (other.getMinRecommendationRequestsPerSecond() == null ^ this.getMinRecommendationRequestsPerSecond() == null)
            return false;
        if (other.getMinRecommendationRequestsPerSecond() != null
                && other.getMinRecommendationRequestsPerSecond().equals(this.getMinRecommendationRequestsPerSecond()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemExplorationConfig() == null) ? 0 : getItemExplorationConfig().hashCode());
        hashCode = prime * hashCode + ((getMinRecommendationRequestsPerSecond() == null) ? 0 : getMinRecommendationRequestsPerSecond().hashCode());
        return hashCode;
    }

    @Override
    public RecommenderConfig clone() {
        try {
            return (RecommenderConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.RecommenderConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
