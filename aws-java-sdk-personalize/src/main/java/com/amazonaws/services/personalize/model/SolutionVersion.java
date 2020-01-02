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
 * An object that provides information about a specific version of a <a>Solution</a>.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/SolutionVersion" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class SolutionVersion implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The ARN of the solution version.
     * </p>
     */
    private String solutionVersionArn;
    /**
     * <p>
     * The ARN of the solution.
     * </p>
     */
    private String solutionArn;
    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is <code>false</code>.
     * </p>
     */
    private Boolean performHPO;
    /**
     * <p>
     * When true, Amazon Personalize searches for the most optimal recipe according to the solution configuration. When
     * false (the default), Amazon Personalize uses <code>recipeArn</code>.
     * </p>
     */
    private Boolean performAutoML;
    /**
     * <p>
     * The ARN of the recipe used in the solution.
     * </p>
     */
    private String recipeArn;
    /**
     * <p>
     * The event type (for example, 'click' or 'like') that is used for training the model.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group providing the training data.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * Describes the configuration properties for the solution.
     * </p>
     */
    private SolutionConfig solutionConfig;
    /**
     * <p>
     * The time used to train the model. You are billed for the time it takes to train a model. This field is visible
     * only after Amazon Personalize successfully trains a model.
     * </p>
     */
    private Double trainingHours;
    /**
     * <p>
     * The scope of training used to create the solution version. The <code>FULL</code> option trains the solution
     * version based on the entirety of the input solution's training data, while the <code>UPDATE</code> option
     * processes only the training data that has changed since the creation of the last solution version. Choose
     * <code>UPDATE</code> when you want to start recommending items added to the dataset without retraining the model.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used after you've created a solution version with the
     * <code>FULL</code> option and the training solution uses the <a>native-recipe-hrnn-coldstart</a>.
     * </p>
     * </important>
     */
    private String trainingMode;
    /**
     * <p>
     * The status of the solution version.
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     */
    private String status;
    /**
     * <p>
     * If training a solution version fails, the reason for the failure.
     * </p>
     */
    private String failureReason;
    /**
     * <p>
     * The date and time (in Unix time) that this version of the solution was created.
     * </p>
     */
    private java.util.Date creationDateTime;
    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     */
    private java.util.Date lastUpdatedDateTime;

    /**
     * <p>
     * The ARN of the solution version.
     * </p>
     * 
     * @param solutionVersionArn
     *        The ARN of the solution version.
     */

    public void setSolutionVersionArn(String solutionVersionArn) {
        this.solutionVersionArn = solutionVersionArn;
    }

    /**
     * <p>
     * The ARN of the solution version.
     * </p>
     * 
     * @return The ARN of the solution version.
     */

    public String getSolutionVersionArn() {
        return this.solutionVersionArn;
    }

    /**
     * <p>
     * The ARN of the solution version.
     * </p>
     * 
     * @param solutionVersionArn
     *        The ARN of the solution version.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersion withSolutionVersionArn(String solutionVersionArn) {
        setSolutionVersionArn(solutionVersionArn);
        return this;
    }

    /**
     * <p>
     * The ARN of the solution.
     * </p>
     * 
     * @param solutionArn
     *        The ARN of the solution.
     */

    public void setSolutionArn(String solutionArn) {
        this.solutionArn = solutionArn;
    }

    /**
     * <p>
     * The ARN of the solution.
     * </p>
     * 
     * @return The ARN of the solution.
     */

    public String getSolutionArn() {
        return this.solutionArn;
    }

    /**
     * <p>
     * The ARN of the solution.
     * </p>
     * 
     * @param solutionArn
     *        The ARN of the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersion withSolutionArn(String solutionArn) {
        setSolutionArn(solutionArn);
        return this;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is <code>false</code>.
     * </p>
     * 
     * @param performHPO
     *        Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is
     *        <code>false</code>.
     */

    public void setPerformHPO(Boolean performHPO) {
        this.performHPO = performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is <code>false</code>.
     * </p>
     * 
     * @return Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is
     *         <code>false</code>.
     */

    public Boolean getPerformHPO() {
        return this.performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is <code>false</code>.
     * </p>
     * 
     * @param performHPO
     *        Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is
     *        <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersion withPerformHPO(Boolean performHPO) {
        setPerformHPO(performHPO);
        return this;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is <code>false</code>.
     * </p>
     * 
     * @return Whether to perform hyperparameter optimization (HPO) on the chosen recipe. The default is
     *         <code>false</code>.
     */

    public Boolean isPerformHPO() {
        return this.performHPO;
    }

    /**
     * <p>
     * When true, Amazon Personalize searches for the most optimal recipe according to the solution configuration. When
     * false (the default), Amazon Personalize uses <code>recipeArn</code>.
     * </p>
     * 
     * @param performAutoML
     *        When true, Amazon Personalize searches for the most optimal recipe according to the solution
     *        configuration. When false (the default), Amazon Personalize uses <code>recipeArn</code>.
     */

    public void setPerformAutoML(Boolean performAutoML) {
        this.performAutoML = performAutoML;
    }

    /**
     * <p>
     * When true, Amazon Personalize searches for the most optimal recipe according to the solution configuration. When
     * false (the default), Amazon Personalize uses <code>recipeArn</code>.
     * </p>
     * 
     * @return When true, Amazon Personalize searches for the most optimal recipe according to the solution
     *         configuration. When false (the default), Amazon Personalize uses <code>recipeArn</code>.
     */

    public Boolean getPerformAutoML() {
        return this.performAutoML;
    }

    /**
     * <p>
     * When true, Amazon Personalize searches for the most optimal recipe according to the solution configuration. When
     * false (the default), Amazon Personalize uses <code>recipeArn</code>.
     * </p>
     * 
     * @param performAutoML
     *        When true, Amazon Personalize searches for the most optimal recipe according to the solution
     *        configuration. When false (the default), Amazon Personalize uses <code>recipeArn</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersion withPerformAutoML(Boolean performAutoML) {
        setPerformAutoML(performAutoML);
        return this;
    }

    /**
     * <p>
     * When true, Amazon Personalize searches for the most optimal recipe according to the solution configuration. When
     * false (the default), Amazon Personalize uses <code>recipeArn</code>.
     * </p>
     * 
     * @return When true, Amazon Personalize searches for the most optimal recipe according to the solution
     *         configuration. When false (the default), Amazon Personalize uses <code>recipeArn</code>.
     */

    public Boolean isPerformAutoML() {
        return this.performAutoML;
    }

    /**
     * <p>
     * The ARN of the recipe used in the solution.
     * </p>
     * 
     * @param recipeArn
     *        The ARN of the recipe used in the solution.
     */

    public void setRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
    }

    /**
     * <p>
     * The ARN of the recipe used in the solution.
     * </p>
     * 
     * @return The ARN of the recipe used in the solution.
     */

    public String getRecipeArn() {
        return this.recipeArn;
    }

    /**
     * <p>
     * The ARN of the recipe used in the solution.
     * </p>
     * 
     * @param recipeArn
     *        The ARN of the recipe used in the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersion withRecipeArn(String recipeArn) {
        setRecipeArn(recipeArn);
        return this;
    }

    /**
     * <p>
     * The event type (for example, 'click' or 'like') that is used for training the model.
     * </p>
     * 
     * @param eventType
     *        The event type (for example, 'click' or 'like') that is used for training the model.
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * The event type (for example, 'click' or 'like') that is used for training the model.
     * </p>
     * 
     * @return The event type (for example, 'click' or 'like') that is used for training the model.
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * The event type (for example, 'click' or 'like') that is used for training the model.
     * </p>
     * 
     * @param eventType
     *        The event type (for example, 'click' or 'like') that is used for training the model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersion withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group providing the training data.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group providing the training data.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group providing the training data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset group providing the training data.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group providing the training data.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group providing the training data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersion withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * Describes the configuration properties for the solution.
     * </p>
     * 
     * @param solutionConfig
     *        Describes the configuration properties for the solution.
     */

    public void setSolutionConfig(SolutionConfig solutionConfig) {
        this.solutionConfig = solutionConfig;
    }

    /**
     * <p>
     * Describes the configuration properties for the solution.
     * </p>
     * 
     * @return Describes the configuration properties for the solution.
     */

    public SolutionConfig getSolutionConfig() {
        return this.solutionConfig;
    }

    /**
     * <p>
     * Describes the configuration properties for the solution.
     * </p>
     * 
     * @param solutionConfig
     *        Describes the configuration properties for the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersion withSolutionConfig(SolutionConfig solutionConfig) {
        setSolutionConfig(solutionConfig);
        return this;
    }

    /**
     * <p>
     * The time used to train the model. You are billed for the time it takes to train a model. This field is visible
     * only after Amazon Personalize successfully trains a model.
     * </p>
     * 
     * @param trainingHours
     *        The time used to train the model. You are billed for the time it takes to train a model. This field is
     *        visible only after Amazon Personalize successfully trains a model.
     */

    public void setTrainingHours(Double trainingHours) {
        this.trainingHours = trainingHours;
    }

    /**
     * <p>
     * The time used to train the model. You are billed for the time it takes to train a model. This field is visible
     * only after Amazon Personalize successfully trains a model.
     * </p>
     * 
     * @return The time used to train the model. You are billed for the time it takes to train a model. This field is
     *         visible only after Amazon Personalize successfully trains a model.
     */

    public Double getTrainingHours() {
        return this.trainingHours;
    }

    /**
     * <p>
     * The time used to train the model. You are billed for the time it takes to train a model. This field is visible
     * only after Amazon Personalize successfully trains a model.
     * </p>
     * 
     * @param trainingHours
     *        The time used to train the model. You are billed for the time it takes to train a model. This field is
     *        visible only after Amazon Personalize successfully trains a model.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersion withTrainingHours(Double trainingHours) {
        setTrainingHours(trainingHours);
        return this;
    }

    /**
     * <p>
     * The scope of training used to create the solution version. The <code>FULL</code> option trains the solution
     * version based on the entirety of the input solution's training data, while the <code>UPDATE</code> option
     * processes only the training data that has changed since the creation of the last solution version. Choose
     * <code>UPDATE</code> when you want to start recommending items added to the dataset without retraining the model.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used after you've created a solution version with the
     * <code>FULL</code> option and the training solution uses the <a>native-recipe-hrnn-coldstart</a>.
     * </p>
     * </important>
     * 
     * @param trainingMode
     *        The scope of training used to create the solution version. The <code>FULL</code> option trains the
     *        solution version based on the entirety of the input solution's training data, while the
     *        <code>UPDATE</code> option processes only the training data that has changed since the creation of the
     *        last solution version. Choose <code>UPDATE</code> when you want to start recommending items added to the
     *        dataset without retraining the model.</p> <important>
     *        <p>
     *        The <code>UPDATE</code> option can only be used after you've created a solution version with the
     *        <code>FULL</code> option and the training solution uses the <a>native-recipe-hrnn-coldstart</a>.
     *        </p>
     * @see TrainingMode
     */

    public void setTrainingMode(String trainingMode) {
        this.trainingMode = trainingMode;
    }

    /**
     * <p>
     * The scope of training used to create the solution version. The <code>FULL</code> option trains the solution
     * version based on the entirety of the input solution's training data, while the <code>UPDATE</code> option
     * processes only the training data that has changed since the creation of the last solution version. Choose
     * <code>UPDATE</code> when you want to start recommending items added to the dataset without retraining the model.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used after you've created a solution version with the
     * <code>FULL</code> option and the training solution uses the <a>native-recipe-hrnn-coldstart</a>.
     * </p>
     * </important>
     * 
     * @return The scope of training used to create the solution version. The <code>FULL</code> option trains the
     *         solution version based on the entirety of the input solution's training data, while the
     *         <code>UPDATE</code> option processes only the training data that has changed since the creation of the
     *         last solution version. Choose <code>UPDATE</code> when you want to start recommending items added to the
     *         dataset without retraining the model.</p> <important>
     *         <p>
     *         The <code>UPDATE</code> option can only be used after you've created a solution version with the
     *         <code>FULL</code> option and the training solution uses the <a>native-recipe-hrnn-coldstart</a>.
     *         </p>
     * @see TrainingMode
     */

    public String getTrainingMode() {
        return this.trainingMode;
    }

    /**
     * <p>
     * The scope of training used to create the solution version. The <code>FULL</code> option trains the solution
     * version based on the entirety of the input solution's training data, while the <code>UPDATE</code> option
     * processes only the training data that has changed since the creation of the last solution version. Choose
     * <code>UPDATE</code> when you want to start recommending items added to the dataset without retraining the model.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used after you've created a solution version with the
     * <code>FULL</code> option and the training solution uses the <a>native-recipe-hrnn-coldstart</a>.
     * </p>
     * </important>
     * 
     * @param trainingMode
     *        The scope of training used to create the solution version. The <code>FULL</code> option trains the
     *        solution version based on the entirety of the input solution's training data, while the
     *        <code>UPDATE</code> option processes only the training data that has changed since the creation of the
     *        last solution version. Choose <code>UPDATE</code> when you want to start recommending items added to the
     *        dataset without retraining the model.</p> <important>
     *        <p>
     *        The <code>UPDATE</code> option can only be used after you've created a solution version with the
     *        <code>FULL</code> option and the training solution uses the <a>native-recipe-hrnn-coldstart</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingMode
     */

    public SolutionVersion withTrainingMode(String trainingMode) {
        setTrainingMode(trainingMode);
        return this;
    }

    /**
     * <p>
     * The scope of training used to create the solution version. The <code>FULL</code> option trains the solution
     * version based on the entirety of the input solution's training data, while the <code>UPDATE</code> option
     * processes only the training data that has changed since the creation of the last solution version. Choose
     * <code>UPDATE</code> when you want to start recommending items added to the dataset without retraining the model.
     * </p>
     * <important>
     * <p>
     * The <code>UPDATE</code> option can only be used after you've created a solution version with the
     * <code>FULL</code> option and the training solution uses the <a>native-recipe-hrnn-coldstart</a>.
     * </p>
     * </important>
     * 
     * @param trainingMode
     *        The scope of training used to create the solution version. The <code>FULL</code> option trains the
     *        solution version based on the entirety of the input solution's training data, while the
     *        <code>UPDATE</code> option processes only the training data that has changed since the creation of the
     *        last solution version. Choose <code>UPDATE</code> when you want to start recommending items added to the
     *        dataset without retraining the model.</p> <important>
     *        <p>
     *        The <code>UPDATE</code> option can only be used after you've created a solution version with the
     *        <code>FULL</code> option and the training solution uses the <a>native-recipe-hrnn-coldstart</a>.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see TrainingMode
     */

    public SolutionVersion withTrainingMode(TrainingMode trainingMode) {
        this.trainingMode = trainingMode.toString();
        return this;
    }

    /**
     * <p>
     * The status of the solution version.
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the solution version.</p>
     *        <p>
     *        A solution version can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE IN_PROGRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE FAILED
     *        </p>
     *        </li>
     */

    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * <p>
     * The status of the solution version.
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @return The status of the solution version.</p>
     *         <p>
     *         A solution version can be in one of the following states:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         CREATE PENDING
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE IN_PROGRESS
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         ACTIVE
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         CREATE FAILED
     *         </p>
     *         </li>
     */

    public String getStatus() {
        return this.status;
    }

    /**
     * <p>
     * The status of the solution version.
     * </p>
     * <p>
     * A solution version can be in one of the following states:
     * </p>
     * <ul>
     * <li>
     * <p>
     * CREATE PENDING
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE IN_PROGRESS
     * </p>
     * </li>
     * <li>
     * <p>
     * ACTIVE
     * </p>
     * </li>
     * <li>
     * <p>
     * CREATE FAILED
     * </p>
     * </li>
     * </ul>
     * 
     * @param status
     *        The status of the solution version.</p>
     *        <p>
     *        A solution version can be in one of the following states:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        CREATE PENDING
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE IN_PROGRESS
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        ACTIVE
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        CREATE FAILED
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersion withStatus(String status) {
        setStatus(status);
        return this;
    }

    /**
     * <p>
     * If training a solution version fails, the reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        If training a solution version fails, the reason for the failure.
     */

    public void setFailureReason(String failureReason) {
        this.failureReason = failureReason;
    }

    /**
     * <p>
     * If training a solution version fails, the reason for the failure.
     * </p>
     * 
     * @return If training a solution version fails, the reason for the failure.
     */

    public String getFailureReason() {
        return this.failureReason;
    }

    /**
     * <p>
     * If training a solution version fails, the reason for the failure.
     * </p>
     * 
     * @param failureReason
     *        If training a solution version fails, the reason for the failure.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersion withFailureReason(String failureReason) {
        setFailureReason(failureReason);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that this version of the solution was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix time) that this version of the solution was created.
     */

    public void setCreationDateTime(java.util.Date creationDateTime) {
        this.creationDateTime = creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that this version of the solution was created.
     * </p>
     * 
     * @return The date and time (in Unix time) that this version of the solution was created.
     */

    public java.util.Date getCreationDateTime() {
        return this.creationDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that this version of the solution was created.
     * </p>
     * 
     * @param creationDateTime
     *        The date and time (in Unix time) that this version of the solution was created.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersion withCreationDateTime(java.util.Date creationDateTime) {
        setCreationDateTime(creationDateTime);
        return this;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) that the solution was last updated.
     */

    public void setLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
        this.lastUpdatedDateTime = lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     * 
     * @return The date and time (in Unix time) that the solution was last updated.
     */

    public java.util.Date getLastUpdatedDateTime() {
        return this.lastUpdatedDateTime;
    }

    /**
     * <p>
     * The date and time (in Unix time) that the solution was last updated.
     * </p>
     * 
     * @param lastUpdatedDateTime
     *        The date and time (in Unix time) that the solution was last updated.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public SolutionVersion withLastUpdatedDateTime(java.util.Date lastUpdatedDateTime) {
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
        if (getSolutionVersionArn() != null)
            sb.append("SolutionVersionArn: ").append(getSolutionVersionArn()).append(",");
        if (getSolutionArn() != null)
            sb.append("SolutionArn: ").append(getSolutionArn()).append(",");
        if (getPerformHPO() != null)
            sb.append("PerformHPO: ").append(getPerformHPO()).append(",");
        if (getPerformAutoML() != null)
            sb.append("PerformAutoML: ").append(getPerformAutoML()).append(",");
        if (getRecipeArn() != null)
            sb.append("RecipeArn: ").append(getRecipeArn()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getSolutionConfig() != null)
            sb.append("SolutionConfig: ").append(getSolutionConfig()).append(",");
        if (getTrainingHours() != null)
            sb.append("TrainingHours: ").append(getTrainingHours()).append(",");
        if (getTrainingMode() != null)
            sb.append("TrainingMode: ").append(getTrainingMode()).append(",");
        if (getStatus() != null)
            sb.append("Status: ").append(getStatus()).append(",");
        if (getFailureReason() != null)
            sb.append("FailureReason: ").append(getFailureReason()).append(",");
        if (getCreationDateTime() != null)
            sb.append("CreationDateTime: ").append(getCreationDateTime()).append(",");
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

        if (obj instanceof SolutionVersion == false)
            return false;
        SolutionVersion other = (SolutionVersion) obj;
        if (other.getSolutionVersionArn() == null ^ this.getSolutionVersionArn() == null)
            return false;
        if (other.getSolutionVersionArn() != null && other.getSolutionVersionArn().equals(this.getSolutionVersionArn()) == false)
            return false;
        if (other.getSolutionArn() == null ^ this.getSolutionArn() == null)
            return false;
        if (other.getSolutionArn() != null && other.getSolutionArn().equals(this.getSolutionArn()) == false)
            return false;
        if (other.getPerformHPO() == null ^ this.getPerformHPO() == null)
            return false;
        if (other.getPerformHPO() != null && other.getPerformHPO().equals(this.getPerformHPO()) == false)
            return false;
        if (other.getPerformAutoML() == null ^ this.getPerformAutoML() == null)
            return false;
        if (other.getPerformAutoML() != null && other.getPerformAutoML().equals(this.getPerformAutoML()) == false)
            return false;
        if (other.getRecipeArn() == null ^ this.getRecipeArn() == null)
            return false;
        if (other.getRecipeArn() != null && other.getRecipeArn().equals(this.getRecipeArn()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getSolutionConfig() == null ^ this.getSolutionConfig() == null)
            return false;
        if (other.getSolutionConfig() != null && other.getSolutionConfig().equals(this.getSolutionConfig()) == false)
            return false;
        if (other.getTrainingHours() == null ^ this.getTrainingHours() == null)
            return false;
        if (other.getTrainingHours() != null && other.getTrainingHours().equals(this.getTrainingHours()) == false)
            return false;
        if (other.getTrainingMode() == null ^ this.getTrainingMode() == null)
            return false;
        if (other.getTrainingMode() != null && other.getTrainingMode().equals(this.getTrainingMode()) == false)
            return false;
        if (other.getStatus() == null ^ this.getStatus() == null)
            return false;
        if (other.getStatus() != null && other.getStatus().equals(this.getStatus()) == false)
            return false;
        if (other.getFailureReason() == null ^ this.getFailureReason() == null)
            return false;
        if (other.getFailureReason() != null && other.getFailureReason().equals(this.getFailureReason()) == false)
            return false;
        if (other.getCreationDateTime() == null ^ this.getCreationDateTime() == null)
            return false;
        if (other.getCreationDateTime() != null && other.getCreationDateTime().equals(this.getCreationDateTime()) == false)
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

        hashCode = prime * hashCode + ((getSolutionVersionArn() == null) ? 0 : getSolutionVersionArn().hashCode());
        hashCode = prime * hashCode + ((getSolutionArn() == null) ? 0 : getSolutionArn().hashCode());
        hashCode = prime * hashCode + ((getPerformHPO() == null) ? 0 : getPerformHPO().hashCode());
        hashCode = prime * hashCode + ((getPerformAutoML() == null) ? 0 : getPerformAutoML().hashCode());
        hashCode = prime * hashCode + ((getRecipeArn() == null) ? 0 : getRecipeArn().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getSolutionConfig() == null) ? 0 : getSolutionConfig().hashCode());
        hashCode = prime * hashCode + ((getTrainingHours() == null) ? 0 : getTrainingHours().hashCode());
        hashCode = prime * hashCode + ((getTrainingMode() == null) ? 0 : getTrainingMode().hashCode());
        hashCode = prime * hashCode + ((getStatus() == null) ? 0 : getStatus().hashCode());
        hashCode = prime * hashCode + ((getFailureReason() == null) ? 0 : getFailureReason().hashCode());
        hashCode = prime * hashCode + ((getCreationDateTime() == null) ? 0 : getCreationDateTime().hashCode());
        hashCode = prime * hashCode + ((getLastUpdatedDateTime() == null) ? 0 : getLastUpdatedDateTime().hashCode());
        return hashCode;
    }

    @Override
    public SolutionVersion clone() {
        try {
            return (SolutionVersion) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.personalize.model.transform.SolutionVersionMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
