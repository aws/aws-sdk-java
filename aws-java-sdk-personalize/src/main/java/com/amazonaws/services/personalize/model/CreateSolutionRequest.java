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

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/personalize-2018-05-22/CreateSolution" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CreateSolutionRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The name for the solution.
     * </p>
     */
    private String name;
    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the specified or selected recipe. The default is
     * <code>false</code>.
     * </p>
     * <p>
     * When performing AutoML, this parameter is always <code>true</code> and you should not set it to
     * <code>false</code>.
     * </p>
     */
    private Boolean performHPO;
    /**
     * <important>
     * <p>
     * We don't recommend enabling automated machine learning. Instead, match your use case to the available Amazon
     * Personalize recipes. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     * recipe</a>.
     * </p>
     * </important>
     * <p>
     * Whether to perform automated machine learning (AutoML). The default is <code>false</code>. For this case, you
     * must specify <code>recipeArn</code>.
     * </p>
     * <p>
     * When set to <code>true</code>, Amazon Personalize analyzes your training data and selects the optimal
     * USER_PERSONALIZATION recipe and hyperparameters. In this case, you must omit <code>recipeArn</code>. Amazon
     * Personalize determines the optimal recipe by running tests with different values for the hyperparameters. AutoML
     * lengthens the training process as compared to selecting a specific recipe.
     * </p>
     */
    private Boolean performAutoML;
    /**
     * <p>
     * Whether the solution uses automatic training to create new solution versions (trained models). The default is
     * <code>True</code> and the solution automatically creates new solution versions every 7 days. You can change the
     * training frequency by specifying a <code>schedulingExpression</code> in the <code>AutoTrainingConfig</code> as
     * part of solution configuration. For more information about automatic training, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/solution-config-auto-training.html">Configuring automatic
     * training</a>.
     * </p>
     * <p>
     * Automatic solution version creation starts one hour after the solution is ACTIVE. If you manually create a
     * solution version within the hour, the solution skips the first automatic training.
     * </p>
     * <p>
     * After training starts, you can get the solution version's Amazon Resource Name (ARN) with the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutionVersions.html">ListSolutionVersions</a>
     * API operation. To get its status, use the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html"
     * >DescribeSolutionVersion</a>.
     * </p>
     */
    private Boolean performAutoTraining;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe to use for model training. This is required when
     * <code>performAutoML</code> is false. For information about different Amazon Personalize recipes and their ARNs,
     * see <a href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     * recipe</a>.
     * </p>
     */
    private String recipeArn;
    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     * </p>
     */
    private String datasetGroupArn;
    /**
     * <p>
     * When your have multiple event types (using an <code>EVENT_TYPE</code> schema field), this parameter specifies
     * which event type (for example, 'click' or 'like') is used for training the model.
     * </p>
     * <p>
     * If you do not provide an <code>eventType</code>, Amazon Personalize will use all interactions for training with
     * equal weight regardless of type.
     * </p>
     */
    private String eventType;
    /**
     * <p>
     * The configuration to use with the solution. When <code>performAutoML</code> is set to true, Amazon Personalize
     * only evaluates the <code>autoMLConfig</code> section of the solution configuration.
     * </p>
     * <note>
     * <p>
     * Amazon Personalize doesn't support configuring the <code>hpoObjective</code> at this time.
     * </p>
     * </note>
     */
    private SolutionConfig solutionConfig;
    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dg/tagging-resources.html">tags</a> to apply to
     * the solution.
     * </p>
     */
    private java.util.List<Tag> tags;

    /**
     * <p>
     * The name for the solution.
     * </p>
     * 
     * @param name
     *        The name for the solution.
     */

    public void setName(String name) {
        this.name = name;
    }

    /**
     * <p>
     * The name for the solution.
     * </p>
     * 
     * @return The name for the solution.
     */

    public String getName() {
        return this.name;
    }

    /**
     * <p>
     * The name for the solution.
     * </p>
     * 
     * @param name
     *        The name for the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionRequest withName(String name) {
        setName(name);
        return this;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the specified or selected recipe. The default is
     * <code>false</code>.
     * </p>
     * <p>
     * When performing AutoML, this parameter is always <code>true</code> and you should not set it to
     * <code>false</code>.
     * </p>
     * 
     * @param performHPO
     *        Whether to perform hyperparameter optimization (HPO) on the specified or selected recipe. The default is
     *        <code>false</code>.</p>
     *        <p>
     *        When performing AutoML, this parameter is always <code>true</code> and you should not set it to
     *        <code>false</code>.
     */

    public void setPerformHPO(Boolean performHPO) {
        this.performHPO = performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the specified or selected recipe. The default is
     * <code>false</code>.
     * </p>
     * <p>
     * When performing AutoML, this parameter is always <code>true</code> and you should not set it to
     * <code>false</code>.
     * </p>
     * 
     * @return Whether to perform hyperparameter optimization (HPO) on the specified or selected recipe. The default is
     *         <code>false</code>.</p>
     *         <p>
     *         When performing AutoML, this parameter is always <code>true</code> and you should not set it to
     *         <code>false</code>.
     */

    public Boolean getPerformHPO() {
        return this.performHPO;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the specified or selected recipe. The default is
     * <code>false</code>.
     * </p>
     * <p>
     * When performing AutoML, this parameter is always <code>true</code> and you should not set it to
     * <code>false</code>.
     * </p>
     * 
     * @param performHPO
     *        Whether to perform hyperparameter optimization (HPO) on the specified or selected recipe. The default is
     *        <code>false</code>.</p>
     *        <p>
     *        When performing AutoML, this parameter is always <code>true</code> and you should not set it to
     *        <code>false</code>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionRequest withPerformHPO(Boolean performHPO) {
        setPerformHPO(performHPO);
        return this;
    }

    /**
     * <p>
     * Whether to perform hyperparameter optimization (HPO) on the specified or selected recipe. The default is
     * <code>false</code>.
     * </p>
     * <p>
     * When performing AutoML, this parameter is always <code>true</code> and you should not set it to
     * <code>false</code>.
     * </p>
     * 
     * @return Whether to perform hyperparameter optimization (HPO) on the specified or selected recipe. The default is
     *         <code>false</code>.</p>
     *         <p>
     *         When performing AutoML, this parameter is always <code>true</code> and you should not set it to
     *         <code>false</code>.
     */

    public Boolean isPerformHPO() {
        return this.performHPO;
    }

    /**
     * <important>
     * <p>
     * We don't recommend enabling automated machine learning. Instead, match your use case to the available Amazon
     * Personalize recipes. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     * recipe</a>.
     * </p>
     * </important>
     * <p>
     * Whether to perform automated machine learning (AutoML). The default is <code>false</code>. For this case, you
     * must specify <code>recipeArn</code>.
     * </p>
     * <p>
     * When set to <code>true</code>, Amazon Personalize analyzes your training data and selects the optimal
     * USER_PERSONALIZATION recipe and hyperparameters. In this case, you must omit <code>recipeArn</code>. Amazon
     * Personalize determines the optimal recipe by running tests with different values for the hyperparameters. AutoML
     * lengthens the training process as compared to selecting a specific recipe.
     * </p>
     * 
     * @param performAutoML
     *        <p>
     *        We don't recommend enabling automated machine learning. Instead, match your use case to the available
     *        Amazon Personalize recipes. For more information, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     *        recipe</a>.
     *        </p>
     *        </important>
     *        <p>
     *        Whether to perform automated machine learning (AutoML). The default is <code>false</code>. For this case,
     *        you must specify <code>recipeArn</code>.
     *        </p>
     *        <p>
     *        When set to <code>true</code>, Amazon Personalize analyzes your training data and selects the optimal
     *        USER_PERSONALIZATION recipe and hyperparameters. In this case, you must omit <code>recipeArn</code>.
     *        Amazon Personalize determines the optimal recipe by running tests with different values for the
     *        hyperparameters. AutoML lengthens the training process as compared to selecting a specific recipe.
     */

    public void setPerformAutoML(Boolean performAutoML) {
        this.performAutoML = performAutoML;
    }

    /**
     * <important>
     * <p>
     * We don't recommend enabling automated machine learning. Instead, match your use case to the available Amazon
     * Personalize recipes. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     * recipe</a>.
     * </p>
     * </important>
     * <p>
     * Whether to perform automated machine learning (AutoML). The default is <code>false</code>. For this case, you
     * must specify <code>recipeArn</code>.
     * </p>
     * <p>
     * When set to <code>true</code>, Amazon Personalize analyzes your training data and selects the optimal
     * USER_PERSONALIZATION recipe and hyperparameters. In this case, you must omit <code>recipeArn</code>. Amazon
     * Personalize determines the optimal recipe by running tests with different values for the hyperparameters. AutoML
     * lengthens the training process as compared to selecting a specific recipe.
     * </p>
     * 
     * @return <p>
     *         We don't recommend enabling automated machine learning. Instead, match your use case to the available
     *         Amazon Personalize recipes. For more information, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     *         recipe</a>.
     *         </p>
     *         </important>
     *         <p>
     *         Whether to perform automated machine learning (AutoML). The default is <code>false</code>. For this case,
     *         you must specify <code>recipeArn</code>.
     *         </p>
     *         <p>
     *         When set to <code>true</code>, Amazon Personalize analyzes your training data and selects the optimal
     *         USER_PERSONALIZATION recipe and hyperparameters. In this case, you must omit <code>recipeArn</code>.
     *         Amazon Personalize determines the optimal recipe by running tests with different values for the
     *         hyperparameters. AutoML lengthens the training process as compared to selecting a specific recipe.
     */

    public Boolean getPerformAutoML() {
        return this.performAutoML;
    }

    /**
     * <important>
     * <p>
     * We don't recommend enabling automated machine learning. Instead, match your use case to the available Amazon
     * Personalize recipes. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     * recipe</a>.
     * </p>
     * </important>
     * <p>
     * Whether to perform automated machine learning (AutoML). The default is <code>false</code>. For this case, you
     * must specify <code>recipeArn</code>.
     * </p>
     * <p>
     * When set to <code>true</code>, Amazon Personalize analyzes your training data and selects the optimal
     * USER_PERSONALIZATION recipe and hyperparameters. In this case, you must omit <code>recipeArn</code>. Amazon
     * Personalize determines the optimal recipe by running tests with different values for the hyperparameters. AutoML
     * lengthens the training process as compared to selecting a specific recipe.
     * </p>
     * 
     * @param performAutoML
     *        <p>
     *        We don't recommend enabling automated machine learning. Instead, match your use case to the available
     *        Amazon Personalize recipes. For more information, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     *        recipe</a>.
     *        </p>
     *        </important>
     *        <p>
     *        Whether to perform automated machine learning (AutoML). The default is <code>false</code>. For this case,
     *        you must specify <code>recipeArn</code>.
     *        </p>
     *        <p>
     *        When set to <code>true</code>, Amazon Personalize analyzes your training data and selects the optimal
     *        USER_PERSONALIZATION recipe and hyperparameters. In this case, you must omit <code>recipeArn</code>.
     *        Amazon Personalize determines the optimal recipe by running tests with different values for the
     *        hyperparameters. AutoML lengthens the training process as compared to selecting a specific recipe.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionRequest withPerformAutoML(Boolean performAutoML) {
        setPerformAutoML(performAutoML);
        return this;
    }

    /**
     * <important>
     * <p>
     * We don't recommend enabling automated machine learning. Instead, match your use case to the available Amazon
     * Personalize recipes. For more information, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     * recipe</a>.
     * </p>
     * </important>
     * <p>
     * Whether to perform automated machine learning (AutoML). The default is <code>false</code>. For this case, you
     * must specify <code>recipeArn</code>.
     * </p>
     * <p>
     * When set to <code>true</code>, Amazon Personalize analyzes your training data and selects the optimal
     * USER_PERSONALIZATION recipe and hyperparameters. In this case, you must omit <code>recipeArn</code>. Amazon
     * Personalize determines the optimal recipe by running tests with different values for the hyperparameters. AutoML
     * lengthens the training process as compared to selecting a specific recipe.
     * </p>
     * 
     * @return <p>
     *         We don't recommend enabling automated machine learning. Instead, match your use case to the available
     *         Amazon Personalize recipes. For more information, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     *         recipe</a>.
     *         </p>
     *         </important>
     *         <p>
     *         Whether to perform automated machine learning (AutoML). The default is <code>false</code>. For this case,
     *         you must specify <code>recipeArn</code>.
     *         </p>
     *         <p>
     *         When set to <code>true</code>, Amazon Personalize analyzes your training data and selects the optimal
     *         USER_PERSONALIZATION recipe and hyperparameters. In this case, you must omit <code>recipeArn</code>.
     *         Amazon Personalize determines the optimal recipe by running tests with different values for the
     *         hyperparameters. AutoML lengthens the training process as compared to selecting a specific recipe.
     */

    public Boolean isPerformAutoML() {
        return this.performAutoML;
    }

    /**
     * <p>
     * Whether the solution uses automatic training to create new solution versions (trained models). The default is
     * <code>True</code> and the solution automatically creates new solution versions every 7 days. You can change the
     * training frequency by specifying a <code>schedulingExpression</code> in the <code>AutoTrainingConfig</code> as
     * part of solution configuration. For more information about automatic training, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/solution-config-auto-training.html">Configuring automatic
     * training</a>.
     * </p>
     * <p>
     * Automatic solution version creation starts one hour after the solution is ACTIVE. If you manually create a
     * solution version within the hour, the solution skips the first automatic training.
     * </p>
     * <p>
     * After training starts, you can get the solution version's Amazon Resource Name (ARN) with the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutionVersions.html">ListSolutionVersions</a>
     * API operation. To get its status, use the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html"
     * >DescribeSolutionVersion</a>.
     * </p>
     * 
     * @param performAutoTraining
     *        Whether the solution uses automatic training to create new solution versions (trained models). The default
     *        is <code>True</code> and the solution automatically creates new solution versions every 7 days. You can
     *        change the training frequency by specifying a <code>schedulingExpression</code> in the
     *        <code>AutoTrainingConfig</code> as part of solution configuration. For more information about automatic
     *        training, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/solution-config-auto-training.html">Configuring
     *        automatic training</a>.</p>
     *        <p>
     *        Automatic solution version creation starts one hour after the solution is ACTIVE. If you manually create a
     *        solution version within the hour, the solution skips the first automatic training.
     *        </p>
     *        <p>
     *        After training starts, you can get the solution version's Amazon Resource Name (ARN) with the <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutionVersions.html"
     *        >ListSolutionVersions</a> API operation. To get its status, use the <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html"
     *        >DescribeSolutionVersion</a>.
     */

    public void setPerformAutoTraining(Boolean performAutoTraining) {
        this.performAutoTraining = performAutoTraining;
    }

    /**
     * <p>
     * Whether the solution uses automatic training to create new solution versions (trained models). The default is
     * <code>True</code> and the solution automatically creates new solution versions every 7 days. You can change the
     * training frequency by specifying a <code>schedulingExpression</code> in the <code>AutoTrainingConfig</code> as
     * part of solution configuration. For more information about automatic training, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/solution-config-auto-training.html">Configuring automatic
     * training</a>.
     * </p>
     * <p>
     * Automatic solution version creation starts one hour after the solution is ACTIVE. If you manually create a
     * solution version within the hour, the solution skips the first automatic training.
     * </p>
     * <p>
     * After training starts, you can get the solution version's Amazon Resource Name (ARN) with the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutionVersions.html">ListSolutionVersions</a>
     * API operation. To get its status, use the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html"
     * >DescribeSolutionVersion</a>.
     * </p>
     * 
     * @return Whether the solution uses automatic training to create new solution versions (trained models). The
     *         default is <code>True</code> and the solution automatically creates new solution versions every 7 days.
     *         You can change the training frequency by specifying a <code>schedulingExpression</code> in the
     *         <code>AutoTrainingConfig</code> as part of solution configuration. For more information about automatic
     *         training, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/solution-config-auto-training.html">Configuring
     *         automatic training</a>.</p>
     *         <p>
     *         Automatic solution version creation starts one hour after the solution is ACTIVE. If you manually create
     *         a solution version within the hour, the solution skips the first automatic training.
     *         </p>
     *         <p>
     *         After training starts, you can get the solution version's Amazon Resource Name (ARN) with the <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutionVersions.html"
     *         >ListSolutionVersions</a> API operation. To get its status, use the <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html"
     *         >DescribeSolutionVersion</a>.
     */

    public Boolean getPerformAutoTraining() {
        return this.performAutoTraining;
    }

    /**
     * <p>
     * Whether the solution uses automatic training to create new solution versions (trained models). The default is
     * <code>True</code> and the solution automatically creates new solution versions every 7 days. You can change the
     * training frequency by specifying a <code>schedulingExpression</code> in the <code>AutoTrainingConfig</code> as
     * part of solution configuration. For more information about automatic training, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/solution-config-auto-training.html">Configuring automatic
     * training</a>.
     * </p>
     * <p>
     * Automatic solution version creation starts one hour after the solution is ACTIVE. If you manually create a
     * solution version within the hour, the solution skips the first automatic training.
     * </p>
     * <p>
     * After training starts, you can get the solution version's Amazon Resource Name (ARN) with the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutionVersions.html">ListSolutionVersions</a>
     * API operation. To get its status, use the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html"
     * >DescribeSolutionVersion</a>.
     * </p>
     * 
     * @param performAutoTraining
     *        Whether the solution uses automatic training to create new solution versions (trained models). The default
     *        is <code>True</code> and the solution automatically creates new solution versions every 7 days. You can
     *        change the training frequency by specifying a <code>schedulingExpression</code> in the
     *        <code>AutoTrainingConfig</code> as part of solution configuration. For more information about automatic
     *        training, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/solution-config-auto-training.html">Configuring
     *        automatic training</a>.</p>
     *        <p>
     *        Automatic solution version creation starts one hour after the solution is ACTIVE. If you manually create a
     *        solution version within the hour, the solution skips the first automatic training.
     *        </p>
     *        <p>
     *        After training starts, you can get the solution version's Amazon Resource Name (ARN) with the <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutionVersions.html"
     *        >ListSolutionVersions</a> API operation. To get its status, use the <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html"
     *        >DescribeSolutionVersion</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionRequest withPerformAutoTraining(Boolean performAutoTraining) {
        setPerformAutoTraining(performAutoTraining);
        return this;
    }

    /**
     * <p>
     * Whether the solution uses automatic training to create new solution versions (trained models). The default is
     * <code>True</code> and the solution automatically creates new solution versions every 7 days. You can change the
     * training frequency by specifying a <code>schedulingExpression</code> in the <code>AutoTrainingConfig</code> as
     * part of solution configuration. For more information about automatic training, see <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/solution-config-auto-training.html">Configuring automatic
     * training</a>.
     * </p>
     * <p>
     * Automatic solution version creation starts one hour after the solution is ACTIVE. If you manually create a
     * solution version within the hour, the solution skips the first automatic training.
     * </p>
     * <p>
     * After training starts, you can get the solution version's Amazon Resource Name (ARN) with the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutionVersions.html">ListSolutionVersions</a>
     * API operation. To get its status, use the <a
     * href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html"
     * >DescribeSolutionVersion</a>.
     * </p>
     * 
     * @return Whether the solution uses automatic training to create new solution versions (trained models). The
     *         default is <code>True</code> and the solution automatically creates new solution versions every 7 days.
     *         You can change the training frequency by specifying a <code>schedulingExpression</code> in the
     *         <code>AutoTrainingConfig</code> as part of solution configuration. For more information about automatic
     *         training, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/solution-config-auto-training.html">Configuring
     *         automatic training</a>.</p>
     *         <p>
     *         Automatic solution version creation starts one hour after the solution is ACTIVE. If you manually create
     *         a solution version within the hour, the solution skips the first automatic training.
     *         </p>
     *         <p>
     *         After training starts, you can get the solution version's Amazon Resource Name (ARN) with the <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/API_ListSolutionVersions.html"
     *         >ListSolutionVersions</a> API operation. To get its status, use the <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/API_DescribeSolutionVersion.html"
     *         >DescribeSolutionVersion</a>.
     */

    public Boolean isPerformAutoTraining() {
        return this.performAutoTraining;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe to use for model training. This is required when
     * <code>performAutoML</code> is false. For information about different Amazon Personalize recipes and their ARNs,
     * see <a href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     * recipe</a>.
     * </p>
     * 
     * @param recipeArn
     *        The Amazon Resource Name (ARN) of the recipe to use for model training. This is required when
     *        <code>performAutoML</code> is false. For information about different Amazon Personalize recipes and their
     *        ARNs, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     *        recipe</a>.
     */

    public void setRecipeArn(String recipeArn) {
        this.recipeArn = recipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe to use for model training. This is required when
     * <code>performAutoML</code> is false. For information about different Amazon Personalize recipes and their ARNs,
     * see <a href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     * recipe</a>.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the recipe to use for model training. This is required when
     *         <code>performAutoML</code> is false. For information about different Amazon Personalize recipes and their
     *         ARNs, see <a
     *         href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     *         recipe</a>.
     */

    public String getRecipeArn() {
        return this.recipeArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the recipe to use for model training. This is required when
     * <code>performAutoML</code> is false. For information about different Amazon Personalize recipes and their ARNs,
     * see <a href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     * recipe</a>.
     * </p>
     * 
     * @param recipeArn
     *        The Amazon Resource Name (ARN) of the recipe to use for model training. This is required when
     *        <code>performAutoML</code> is false. For information about different Amazon Personalize recipes and their
     *        ARNs, see <a
     *        href="https://docs.aws.amazon.com/personalize/latest/dg/working-with-predefined-recipes.html">Choosing a
     *        recipe</a>.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionRequest withRecipeArn(String recipeArn) {
        setRecipeArn(recipeArn);
        return this;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     */

    public void setDatasetGroupArn(String datasetGroupArn) {
        this.datasetGroupArn = datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     * </p>
     * 
     * @return The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     */

    public String getDatasetGroupArn() {
        return this.datasetGroupArn;
    }

    /**
     * <p>
     * The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     * </p>
     * 
     * @param datasetGroupArn
     *        The Amazon Resource Name (ARN) of the dataset group that provides the training data.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionRequest withDatasetGroupArn(String datasetGroupArn) {
        setDatasetGroupArn(datasetGroupArn);
        return this;
    }

    /**
     * <p>
     * When your have multiple event types (using an <code>EVENT_TYPE</code> schema field), this parameter specifies
     * which event type (for example, 'click' or 'like') is used for training the model.
     * </p>
     * <p>
     * If you do not provide an <code>eventType</code>, Amazon Personalize will use all interactions for training with
     * equal weight regardless of type.
     * </p>
     * 
     * @param eventType
     *        When your have multiple event types (using an <code>EVENT_TYPE</code> schema field), this parameter
     *        specifies which event type (for example, 'click' or 'like') is used for training the model.</p>
     *        <p>
     *        If you do not provide an <code>eventType</code>, Amazon Personalize will use all interactions for training
     *        with equal weight regardless of type.
     */

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * <p>
     * When your have multiple event types (using an <code>EVENT_TYPE</code> schema field), this parameter specifies
     * which event type (for example, 'click' or 'like') is used for training the model.
     * </p>
     * <p>
     * If you do not provide an <code>eventType</code>, Amazon Personalize will use all interactions for training with
     * equal weight regardless of type.
     * </p>
     * 
     * @return When your have multiple event types (using an <code>EVENT_TYPE</code> schema field), this parameter
     *         specifies which event type (for example, 'click' or 'like') is used for training the model.</p>
     *         <p>
     *         If you do not provide an <code>eventType</code>, Amazon Personalize will use all interactions for
     *         training with equal weight regardless of type.
     */

    public String getEventType() {
        return this.eventType;
    }

    /**
     * <p>
     * When your have multiple event types (using an <code>EVENT_TYPE</code> schema field), this parameter specifies
     * which event type (for example, 'click' or 'like') is used for training the model.
     * </p>
     * <p>
     * If you do not provide an <code>eventType</code>, Amazon Personalize will use all interactions for training with
     * equal weight regardless of type.
     * </p>
     * 
     * @param eventType
     *        When your have multiple event types (using an <code>EVENT_TYPE</code> schema field), this parameter
     *        specifies which event type (for example, 'click' or 'like') is used for training the model.</p>
     *        <p>
     *        If you do not provide an <code>eventType</code>, Amazon Personalize will use all interactions for training
     *        with equal weight regardless of type.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionRequest withEventType(String eventType) {
        setEventType(eventType);
        return this;
    }

    /**
     * <p>
     * The configuration to use with the solution. When <code>performAutoML</code> is set to true, Amazon Personalize
     * only evaluates the <code>autoMLConfig</code> section of the solution configuration.
     * </p>
     * <note>
     * <p>
     * Amazon Personalize doesn't support configuring the <code>hpoObjective</code> at this time.
     * </p>
     * </note>
     * 
     * @param solutionConfig
     *        The configuration to use with the solution. When <code>performAutoML</code> is set to true, Amazon
     *        Personalize only evaluates the <code>autoMLConfig</code> section of the solution configuration.</p> <note>
     *        <p>
     *        Amazon Personalize doesn't support configuring the <code>hpoObjective</code> at this time.
     *        </p>
     */

    public void setSolutionConfig(SolutionConfig solutionConfig) {
        this.solutionConfig = solutionConfig;
    }

    /**
     * <p>
     * The configuration to use with the solution. When <code>performAutoML</code> is set to true, Amazon Personalize
     * only evaluates the <code>autoMLConfig</code> section of the solution configuration.
     * </p>
     * <note>
     * <p>
     * Amazon Personalize doesn't support configuring the <code>hpoObjective</code> at this time.
     * </p>
     * </note>
     * 
     * @return The configuration to use with the solution. When <code>performAutoML</code> is set to true, Amazon
     *         Personalize only evaluates the <code>autoMLConfig</code> section of the solution configuration.</p>
     *         <note>
     *         <p>
     *         Amazon Personalize doesn't support configuring the <code>hpoObjective</code> at this time.
     *         </p>
     */

    public SolutionConfig getSolutionConfig() {
        return this.solutionConfig;
    }

    /**
     * <p>
     * The configuration to use with the solution. When <code>performAutoML</code> is set to true, Amazon Personalize
     * only evaluates the <code>autoMLConfig</code> section of the solution configuration.
     * </p>
     * <note>
     * <p>
     * Amazon Personalize doesn't support configuring the <code>hpoObjective</code> at this time.
     * </p>
     * </note>
     * 
     * @param solutionConfig
     *        The configuration to use with the solution. When <code>performAutoML</code> is set to true, Amazon
     *        Personalize only evaluates the <code>autoMLConfig</code> section of the solution configuration.</p> <note>
     *        <p>
     *        Amazon Personalize doesn't support configuring the <code>hpoObjective</code> at this time.
     *        </p>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionRequest withSolutionConfig(SolutionConfig solutionConfig) {
        setSolutionConfig(solutionConfig);
        return this;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dg/tagging-resources.html">tags</a> to apply to
     * the solution.
     * </p>
     * 
     * @return A list of <a href="https://docs.aws.amazon.com/personalize/latest/dg/tagging-resources.html">tags</a> to
     *         apply to the solution.
     */

    public java.util.List<Tag> getTags() {
        return tags;
    }

    /**
     * <p>
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dg/tagging-resources.html">tags</a> to apply to
     * the solution.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dg/tagging-resources.html">tags</a> to
     *        apply to the solution.
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
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dg/tagging-resources.html">tags</a> to apply to
     * the solution.
     * </p>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setTags(java.util.Collection)} or {@link #withTags(java.util.Collection)} if you want to override the
     * existing values.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dg/tagging-resources.html">tags</a> to
     *        apply to the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionRequest withTags(Tag... tags) {
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
     * A list of <a href="https://docs.aws.amazon.com/personalize/latest/dg/tagging-resources.html">tags</a> to apply to
     * the solution.
     * </p>
     * 
     * @param tags
     *        A list of <a href="https://docs.aws.amazon.com/personalize/latest/dg/tagging-resources.html">tags</a> to
     *        apply to the solution.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CreateSolutionRequest withTags(java.util.Collection<Tag> tags) {
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
        if (getPerformHPO() != null)
            sb.append("PerformHPO: ").append(getPerformHPO()).append(",");
        if (getPerformAutoML() != null)
            sb.append("PerformAutoML: ").append(getPerformAutoML()).append(",");
        if (getPerformAutoTraining() != null)
            sb.append("PerformAutoTraining: ").append(getPerformAutoTraining()).append(",");
        if (getRecipeArn() != null)
            sb.append("RecipeArn: ").append(getRecipeArn()).append(",");
        if (getDatasetGroupArn() != null)
            sb.append("DatasetGroupArn: ").append(getDatasetGroupArn()).append(",");
        if (getEventType() != null)
            sb.append("EventType: ").append(getEventType()).append(",");
        if (getSolutionConfig() != null)
            sb.append("SolutionConfig: ").append(getSolutionConfig()).append(",");
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

        if (obj instanceof CreateSolutionRequest == false)
            return false;
        CreateSolutionRequest other = (CreateSolutionRequest) obj;
        if (other.getName() == null ^ this.getName() == null)
            return false;
        if (other.getName() != null && other.getName().equals(this.getName()) == false)
            return false;
        if (other.getPerformHPO() == null ^ this.getPerformHPO() == null)
            return false;
        if (other.getPerformHPO() != null && other.getPerformHPO().equals(this.getPerformHPO()) == false)
            return false;
        if (other.getPerformAutoML() == null ^ this.getPerformAutoML() == null)
            return false;
        if (other.getPerformAutoML() != null && other.getPerformAutoML().equals(this.getPerformAutoML()) == false)
            return false;
        if (other.getPerformAutoTraining() == null ^ this.getPerformAutoTraining() == null)
            return false;
        if (other.getPerformAutoTraining() != null && other.getPerformAutoTraining().equals(this.getPerformAutoTraining()) == false)
            return false;
        if (other.getRecipeArn() == null ^ this.getRecipeArn() == null)
            return false;
        if (other.getRecipeArn() != null && other.getRecipeArn().equals(this.getRecipeArn()) == false)
            return false;
        if (other.getDatasetGroupArn() == null ^ this.getDatasetGroupArn() == null)
            return false;
        if (other.getDatasetGroupArn() != null && other.getDatasetGroupArn().equals(this.getDatasetGroupArn()) == false)
            return false;
        if (other.getEventType() == null ^ this.getEventType() == null)
            return false;
        if (other.getEventType() != null && other.getEventType().equals(this.getEventType()) == false)
            return false;
        if (other.getSolutionConfig() == null ^ this.getSolutionConfig() == null)
            return false;
        if (other.getSolutionConfig() != null && other.getSolutionConfig().equals(this.getSolutionConfig()) == false)
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
        hashCode = prime * hashCode + ((getPerformHPO() == null) ? 0 : getPerformHPO().hashCode());
        hashCode = prime * hashCode + ((getPerformAutoML() == null) ? 0 : getPerformAutoML().hashCode());
        hashCode = prime * hashCode + ((getPerformAutoTraining() == null) ? 0 : getPerformAutoTraining().hashCode());
        hashCode = prime * hashCode + ((getRecipeArn() == null) ? 0 : getRecipeArn().hashCode());
        hashCode = prime * hashCode + ((getDatasetGroupArn() == null) ? 0 : getDatasetGroupArn().hashCode());
        hashCode = prime * hashCode + ((getEventType() == null) ? 0 : getEventType().hashCode());
        hashCode = prime * hashCode + ((getSolutionConfig() == null) ? 0 : getSolutionConfig().hashCode());
        hashCode = prime * hashCode + ((getTags() == null) ? 0 : getTags().hashCode());
        return hashCode;
    }

    @Override
    public CreateSolutionRequest clone() {
        return (CreateSolutionRequest) super.clone();
    }

}
