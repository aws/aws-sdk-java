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
     * support. A high <code>minRecommendationRequestsPerSecond</code> will increase your bill. We recommend starting
     * with 1 for <code>minRecommendationRequestsPerSecond</code> (the default). Track your usage using Amazon
     * CloudWatch metrics, and increase the <code>minRecommendationRequestsPerSecond</code> as necessary.
     * </p>
     */
    private Integer minRecommendationRequestsPerSecond;
    /**
     * <p>
     * Specifies the training data configuration to use when creating a domain recommender.
     * </p>
     */
    private TrainingDataConfig trainingDataConfig;
    /**
     * <p>
     * Whether metadata with recommendations is enabled for the recommender. If enabled, you can specify the columns
     * from your Items dataset in your request for recommendations. Amazon Personalize returns this data for each item
     * in the recommendation response. For information about enabling metadata for a recommender, see <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/creating-recommenders.html#create-recommender-return-metadata"
     * >Enabling metadata in recommendations for a recommender</a>.
     * </p>
     * <p>
     * If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     * href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     * </p>
     */
    private Boolean enableMetadataWithRecommendations;

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
     * support. A high <code>minRecommendationRequestsPerSecond</code> will increase your bill. We recommend starting
     * with 1 for <code>minRecommendationRequestsPerSecond</code> (the default). Track your usage using Amazon
     * CloudWatch metrics, and increase the <code>minRecommendationRequestsPerSecond</code> as necessary.
     * </p>
     * 
     * @param minRecommendationRequestsPerSecond
     *        Specifies the requested minimum provisioned recommendation requests per second that Amazon Personalize
     *        will support. A high <code>minRecommendationRequestsPerSecond</code> will increase your bill. We recommend
     *        starting with 1 for <code>minRecommendationRequestsPerSecond</code> (the default). Track your usage using
     *        Amazon CloudWatch metrics, and increase the <code>minRecommendationRequestsPerSecond</code> as necessary.
     */

    public void setMinRecommendationRequestsPerSecond(Integer minRecommendationRequestsPerSecond) {
        this.minRecommendationRequestsPerSecond = minRecommendationRequestsPerSecond;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned recommendation requests per second that Amazon Personalize will
     * support. A high <code>minRecommendationRequestsPerSecond</code> will increase your bill. We recommend starting
     * with 1 for <code>minRecommendationRequestsPerSecond</code> (the default). Track your usage using Amazon
     * CloudWatch metrics, and increase the <code>minRecommendationRequestsPerSecond</code> as necessary.
     * </p>
     * 
     * @return Specifies the requested minimum provisioned recommendation requests per second that Amazon Personalize
     *         will support. A high <code>minRecommendationRequestsPerSecond</code> will increase your bill. We
     *         recommend starting with 1 for <code>minRecommendationRequestsPerSecond</code> (the default). Track your
     *         usage using Amazon CloudWatch metrics, and increase the <code>minRecommendationRequestsPerSecond</code>
     *         as necessary.
     */

    public Integer getMinRecommendationRequestsPerSecond() {
        return this.minRecommendationRequestsPerSecond;
    }

    /**
     * <p>
     * Specifies the requested minimum provisioned recommendation requests per second that Amazon Personalize will
     * support. A high <code>minRecommendationRequestsPerSecond</code> will increase your bill. We recommend starting
     * with 1 for <code>minRecommendationRequestsPerSecond</code> (the default). Track your usage using Amazon
     * CloudWatch metrics, and increase the <code>minRecommendationRequestsPerSecond</code> as necessary.
     * </p>
     * 
     * @param minRecommendationRequestsPerSecond
     *        Specifies the requested minimum provisioned recommendation requests per second that Amazon Personalize
     *        will support. A high <code>minRecommendationRequestsPerSecond</code> will increase your bill. We recommend
     *        starting with 1 for <code>minRecommendationRequestsPerSecond</code> (the default). Track your usage using
     *        Amazon CloudWatch metrics, and increase the <code>minRecommendationRequestsPerSecond</code> as necessary.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfig withMinRecommendationRequestsPerSecond(Integer minRecommendationRequestsPerSecond) {
        setMinRecommendationRequestsPerSecond(minRecommendationRequestsPerSecond);
        return this;
    }

    /**
     * <p>
     * Specifies the training data configuration to use when creating a domain recommender.
     * </p>
     * 
     * @param trainingDataConfig
     *        Specifies the training data configuration to use when creating a domain recommender.
     */

    public void setTrainingDataConfig(TrainingDataConfig trainingDataConfig) {
        this.trainingDataConfig = trainingDataConfig;
    }

    /**
     * <p>
     * Specifies the training data configuration to use when creating a domain recommender.
     * </p>
     * 
     * @return Specifies the training data configuration to use when creating a domain recommender.
     */

    public TrainingDataConfig getTrainingDataConfig() {
        return this.trainingDataConfig;
    }

    /**
     * <p>
     * Specifies the training data configuration to use when creating a domain recommender.
     * </p>
     * 
     * @param trainingDataConfig
     *        Specifies the training data configuration to use when creating a domain recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfig withTrainingDataConfig(TrainingDataConfig trainingDataConfig) {
        setTrainingDataConfig(trainingDataConfig);
        return this;
    }

    /**
     * <p>
     * Whether metadata with recommendations is enabled for the recommender. If enabled, you can specify the columns
     * from your Items dataset in your request for recommendations. Amazon Personalize returns this data for each item
     * in the recommendation response. For information about enabling metadata for a recommender, see <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/creating-recommenders.html#create-recommender-return-metadata"
     * >Enabling metadata in recommendations for a recommender</a>.
     * </p>
     * <p>
     * If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     * href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     * </p>
     * 
     * @param enableMetadataWithRecommendations
     *        Whether metadata with recommendations is enabled for the recommender. If enabled, you can specify the
     *        columns from your Items dataset in your request for recommendations. Amazon Personalize returns this data
     *        for each item in the recommendation response. For information about enabling metadata for a recommender,
     *        see <a href=
     *        "https://docs.aws.amazon.com/personalize/latest/dg/creating-recommenders.html#create-recommender-return-metadata"
     *        >Enabling metadata in recommendations for a recommender</a>.</p>
     *        <p>
     *        If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     *        href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     */

    public void setEnableMetadataWithRecommendations(Boolean enableMetadataWithRecommendations) {
        this.enableMetadataWithRecommendations = enableMetadataWithRecommendations;
    }

    /**
     * <p>
     * Whether metadata with recommendations is enabled for the recommender. If enabled, you can specify the columns
     * from your Items dataset in your request for recommendations. Amazon Personalize returns this data for each item
     * in the recommendation response. For information about enabling metadata for a recommender, see <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/creating-recommenders.html#create-recommender-return-metadata"
     * >Enabling metadata in recommendations for a recommender</a>.
     * </p>
     * <p>
     * If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     * href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     * </p>
     * 
     * @return Whether metadata with recommendations is enabled for the recommender. If enabled, you can specify the
     *         columns from your Items dataset in your request for recommendations. Amazon Personalize returns this data
     *         for each item in the recommendation response. For information about enabling metadata for a recommender,
     *         see <a href=
     *         "https://docs.aws.amazon.com/personalize/latest/dg/creating-recommenders.html#create-recommender-return-metadata"
     *         >Enabling metadata in recommendations for a recommender</a>.</p>
     *         <p>
     *         If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     *         href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     */

    public Boolean getEnableMetadataWithRecommendations() {
        return this.enableMetadataWithRecommendations;
    }

    /**
     * <p>
     * Whether metadata with recommendations is enabled for the recommender. If enabled, you can specify the columns
     * from your Items dataset in your request for recommendations. Amazon Personalize returns this data for each item
     * in the recommendation response. For information about enabling metadata for a recommender, see <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/creating-recommenders.html#create-recommender-return-metadata"
     * >Enabling metadata in recommendations for a recommender</a>.
     * </p>
     * <p>
     * If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     * href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     * </p>
     * 
     * @param enableMetadataWithRecommendations
     *        Whether metadata with recommendations is enabled for the recommender. If enabled, you can specify the
     *        columns from your Items dataset in your request for recommendations. Amazon Personalize returns this data
     *        for each item in the recommendation response. For information about enabling metadata for a recommender,
     *        see <a href=
     *        "https://docs.aws.amazon.com/personalize/latest/dg/creating-recommenders.html#create-recommender-return-metadata"
     *        >Enabling metadata in recommendations for a recommender</a>.</p>
     *        <p>
     *        If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     *        href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RecommenderConfig withEnableMetadataWithRecommendations(Boolean enableMetadataWithRecommendations) {
        setEnableMetadataWithRecommendations(enableMetadataWithRecommendations);
        return this;
    }

    /**
     * <p>
     * Whether metadata with recommendations is enabled for the recommender. If enabled, you can specify the columns
     * from your Items dataset in your request for recommendations. Amazon Personalize returns this data for each item
     * in the recommendation response. For information about enabling metadata for a recommender, see <a href=
     * "https://docs.aws.amazon.com/personalize/latest/dg/creating-recommenders.html#create-recommender-return-metadata"
     * >Enabling metadata in recommendations for a recommender</a>.
     * </p>
     * <p>
     * If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     * href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     * </p>
     * 
     * @return Whether metadata with recommendations is enabled for the recommender. If enabled, you can specify the
     *         columns from your Items dataset in your request for recommendations. Amazon Personalize returns this data
     *         for each item in the recommendation response. For information about enabling metadata for a recommender,
     *         see <a href=
     *         "https://docs.aws.amazon.com/personalize/latest/dg/creating-recommenders.html#create-recommender-return-metadata"
     *         >Enabling metadata in recommendations for a recommender</a>.</p>
     *         <p>
     *         If you enable metadata in recommendations, you will incur additional costs. For more information, see <a
     *         href="https://aws.amazon.com/personalize/pricing/">Amazon Personalize pricing</a>.
     */

    public Boolean isEnableMetadataWithRecommendations() {
        return this.enableMetadataWithRecommendations;
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
            sb.append("MinRecommendationRequestsPerSecond: ").append(getMinRecommendationRequestsPerSecond()).append(",");
        if (getTrainingDataConfig() != null)
            sb.append("TrainingDataConfig: ").append(getTrainingDataConfig()).append(",");
        if (getEnableMetadataWithRecommendations() != null)
            sb.append("EnableMetadataWithRecommendations: ").append(getEnableMetadataWithRecommendations());
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
        if (other.getTrainingDataConfig() == null ^ this.getTrainingDataConfig() == null)
            return false;
        if (other.getTrainingDataConfig() != null && other.getTrainingDataConfig().equals(this.getTrainingDataConfig()) == false)
            return false;
        if (other.getEnableMetadataWithRecommendations() == null ^ this.getEnableMetadataWithRecommendations() == null)
            return false;
        if (other.getEnableMetadataWithRecommendations() != null
                && other.getEnableMetadataWithRecommendations().equals(this.getEnableMetadataWithRecommendations()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getItemExplorationConfig() == null) ? 0 : getItemExplorationConfig().hashCode());
        hashCode = prime * hashCode + ((getMinRecommendationRequestsPerSecond() == null) ? 0 : getMinRecommendationRequestsPerSecond().hashCode());
        hashCode = prime * hashCode + ((getTrainingDataConfig() == null) ? 0 : getTrainingDataConfig().hashCode());
        hashCode = prime * hashCode + ((getEnableMetadataWithRecommendations() == null) ? 0 : getEnableMetadataWithRecommendations().hashCode());
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
