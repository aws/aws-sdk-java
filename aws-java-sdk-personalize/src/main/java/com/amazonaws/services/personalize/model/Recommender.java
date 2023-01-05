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
 * Describes a recommendation generator for a Domain dataset group. You create a recommender in a Domain dataset group
 * for a specific domain use case (domain recipe), and specify the recommender in a <a
 * href="https://docs.aws.amazon.com/personalize/latest/dg/API_RS_GetRecommendations.html">GetRecommendations</a>
 * request.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/Recommender" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class Recommender implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender.
     * </p>
     */
    private String recommenderArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * The name of the recommender.
     * </p>
     */
    private String name;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was created
     * for.
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
     * The date and time (in Unix format) that the recommender was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time (in Unix format) that the recommender was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;
    /**
     * <p>
     * The status of the recommender.
     * </p>
     * <p>
     * A recommender can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * If a recommender fails, the reason behind the failure.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * Provides a summary of the latest updates to the recommender.
     * </p>
     */
    private RecommenderUpdateSummary latestRecommenderUpdate;
    /**
     * <p>
     * Provides evaluation metrics that help you determine the performance of a recommender. For more information, see
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/evaluating-recommenders.html"> Evaluating a
     * recommender</a>.
     * </p>
     */
    private java.util.Map<String, Double> modelMetrics;

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender.
     * </p>
     * 
     * @param recommenderArn
     *        The Amazon Resource Name (ARN) of the recommender.
     */

    public void setRecommenderArn(String recommenderArn) {
        this.recommenderArn = recommenderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recommender.
     */

    public String getRecommenderArn() {
        return this.recommenderArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recommender.
     * </p>
     * 
     * @param recommenderArn
     *        The Amazon Resource Name (ARN) of the recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommender withRecommenderArn(String recommenderArn) {
        setRecommenderArn(recommenderArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the Domain dataset group that contains the recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommender withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

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

    public Recommender withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was created
     * for.
     * </p>
     * 
     * @param recipeArn
     *        The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was
     *        created for.
     */

    public void setRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was created
     * for.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was
     *         created for.
     */

    public String getRecipeArn() {
        return this.recipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was created
     * for.
     * </p>
     * 
     * @param recipeArn
     *        The Amazon Resource Name (ARN) of the recipe (Domain dataset group use case) that the recommender was
     *        created for.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommender withRecipeArn(String recipeArn) {
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

    public Recommender withRecommenderConfig(RecommenderConfig recommenderConfig) {
        setRecommenderConfig(recommenderConfig);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix format) that the recommender was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender was created.
     * </p>
     * 
     * @return The date and time (in Unix format) that the recommender was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix format) that the recommender was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommender withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix format) that the recommender was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender was last updated.
     * </p>
     * 
     * @return The date and time (in Unix format) that the recommender was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix format) that the recommender was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix format) that the recommender was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommender withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        setLastUpdatedDateTime(lastUpdatedDateTime);
        return this;
    }

    /**
     * <p>
     * The status of the recommender.
     * </p>
     * <p>
     * A recommender can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the recommender.</p>
     *        <p>
     *        A recommender can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE PENDING &gt; DELETE IN_PROGRESS
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the recommender.
     * </p>
     * <p>
     * A recommender can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the recommender.</p>
     *         <p>
     *         A recommender can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         DELETE PENDING &gt; DELETE IN_PROGRESS
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the recommender.
     * </p>
     * <p>
     * A recommender can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     * </p>
     * </li>
     * <li>
     * <p>
     * STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * DELETE PENDING &gt; DELETE IN_PROGRESS
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the recommender.</p>
     *        <p>
     *        A recommender can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING &gt; CREATE IN_PROGRESS &gt; ACTIVE -or- CREATE FAILED
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        STOP PENDING &gt; STOP IN_PROGRESS &gt; INACTIVE &gt; START PENDING &gt; START IN_PROGRESS &gt; ACTIVE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        DELETE PENDING &gt; DELETE IN_PROGRESS
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommender withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * If a recommender fails, the reason behind the failure.
     * </p>
     * 
     * @param failureReason
     *        If a recommender fails, the reason behind the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If a recommender fails, the reason behind the failure.
     * </p>
     * 
     * @return If a recommender fails, the reason behind the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If a recommender fails, the reason behind the failure.
     * </p>
     * 
     * @param failureReason
     *        If a recommender fails, the reason behind the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommender withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * Provides a summary of the latest updates to the recommender.
     * </p>
     * 
     * @param latestRecommenderUpdate
     *        Provides a summary of the latest updates to the recommender.
     */

    public void setLatestRecommenderUpdate(RecommenderUpdateSummary latestRecommenderUpdate) {
        this.latestRecommenderUpdate = latestRecommenderUpdate;
    }

    /**
     * <p>
     * Provides a summary of the latest updates to the recommender.
     * </p>
     * 
     * @return Provides a summary of the latest updates to the recommender.
     */

    public RecommenderUpdateSummary getLatestRecommenderUpdate() {
        return this.latestRecommenderUpdate;
    }

    /**
     * <p>
     * Provides a summary of the latest updates to the recommender.
     * </p>
     * 
     * @param latestRecommenderUpdate
     *        Provides a summary of the latest updates to the recommender.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommender withLatestRecommenderUpdate(RecommenderUpdateSummary latestRecommenderUpdate) {
        setLatestRecommenderUpdate(latestRecommenderUpdate);
        return this;
    }

    /**
     * <p>
     * Provides evaluation metrics that help you determine the performance of a recommender. For more information, see
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/evaluating-recommenders.html"> Evaluating a
     * recommender</a>.
     * </p>
     * 
     * @return Provides evaluation metrics that help you determine the performance of a recommender. For more
     *         information, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/evaluating-recommenders.html"> Evaluating a
     *         recommender</a>.
     */

    public java.util.Map<String, Double> getModelMetrics() {
        return modelMetrics;
    }

    /**
     * <p>
     * Provides evaluation metrics that help you determine the performance of a recommender. For more information, see
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/evaluating-recommenders.html"> Evaluating a
     * recommender</a>.
     * </p>
     * 
     * @param modelMetrics
     *        Provides evaluation metrics that help you determine the performance of a recommender. For more
     *        information, see <a href="https://docs.aws.amazon.com/personalize/latest/dg/evaluating-recommenders.html">
     *        Evaluating a recommender</a>.
     */

    public void setModelMetrics(java.util.Map<String, Double> modelMetrics) {
        this.modelMetrics = modelMetrics;
    }

    /**
     * <p>
     * Provides evaluation metrics that help you determine the performance of a recommender. For more information, see
     * <a href="https://docs.aws.amazon.com/personalize/latest/dg/evaluating-recommenders.html"> Evaluating a
     * recommender</a>.
     * </p>
     * 
     * @param modelMetrics
     *        Provides evaluation metrics that help you determine the performance of a recommender. For more
     *        information, see <a href="https://docs.aws.amazon.com/personalize/latest/dg/evaluating-recommenders.html">
     *        Evaluating a recommender</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommender withModelMetrics(java.util.Map<String, Double> modelMetrics) {
        setModelMetrics(modelMetrics);
        return this;
    }

    /**
     * Add a single ModelMetrics entry
     *
     * @see Recommender#withModelMetrics
     * @returns a reference to this object so that method calls can be chained together.
     */

    public Recommender addModelMetricsEntry(String key, Double value) {
        if (null == this.modelMetrics) {
            this.modelMetrics = new java.util.HashMap<String, Double>();
        }
        if (this.modelMetrics.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.modelMetrics.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into ModelMetrics.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public Recommender clearModelMetricsEntries() {
        this.modelMetrics = null;
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
        if (getRecommenderArn() != null)
            sb.append("RecommenderArn: ").append(getRecommenderArn()).append(",");
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getName() != null)
            sb.append("Name: ").append(getName()).append(",");
        if (getRecipeArn() != null)
            sb.append("RecipeArn: ").append(getRecipeArn()).append(",");
        if (getRecommenderConfig() != null)
            sb.append("RecommenderConfig: ").append(getRecommenderConfig()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
        if (getLastUpdatedDateTime() != null)
            sb.append("LastUpdatedDateTime: ").append(getLastUpdatedDateTime()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getLatestRecommenderUpdate() != null)
            sb.append("LatestRecommenderUpdate: ").append(getLatestRecommenderUpdate()).append(",");
        if (getModelMetrics() != null)
            sb.append("ModelMetrics: ").append(getModelMetrics());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof Recommender == false)
            return false;
        Recommender other = (Recommender) obj;
        if (other.getRecommenderArn() == null ^ this.getRecommenderArn() == null)
            return false;
        if (other.getRecommenderArn() != null && other.getRecommenderArn().equals(this.getRecommenderArn()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getRecipeArn() == null ^ this.getRecipeArn() == null)
            return false;
        if (other.getRecipeArn() != null && other.getRecipeArn().equals(this.getRecipeArn()) == false)
            return false;
        if (other.getRecommenderConfig() == null ^ this.getRecommenderConfig() == null)
            return false;
        if (other.getRecommenderConfig() != null && other.getRecommenderConfig().equals(this.getRecommenderConfig()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
            return false;
        if (other.getLastUpdatedDateTime() == null ^ this.getLastUpdatedDateTime() == null)
            return false;
        if (other.getLastUpdatedDateTime() != null && other.getLastUpdatedDateTime().equals(this.getLastUpdatedDateTime()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getLatestRecommenderUpdate() == null ^ this.getLatestRecommenderUpdate() == null)
            return false;
        if (other.getLatestRecommenderUpdate() != null && other.getLatestRecommenderUpdate().equals(this.getLatestRecommenderUpdate()) == false)
            return false;
        if (other.getModelMetrics() == null ^ this.getModelMetrics() == null)
            return false;
        if (other.getModelMetrics() != null && other.getModelMetrics().equals(this.getModelMetrics()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getRecommenderArn() == null) ? 0 : getRecommenderArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getName() == null) ? 0 : getName().hashCode());
        hashCode = prime * hashCode + ((getRecipeArn() == null) ? 0 : getRecipeArn().hashCode());
        hashCode = prime * hashCode + ((getRecommenderConfig() == null) ? 0 : getRecommenderConfig().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getLatestRecommenderUpdate() == null) ? 0 : getLatestRecommenderUpdate().hashCode());
        hashCode = prime * hashCode + ((getModelMetrics() == null) ? 0 : getModelMetrics().hashCode());
        return hashCode;
    }

    @Override
    public Recommender clone() {
        try {
            return (Recommender) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.RecommenderMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
