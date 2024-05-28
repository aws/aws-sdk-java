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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * The collection of algorithms run on a dataset for training the model candidates of an Autopilot job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLAlgorithmConfig" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLAlgorithmConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The selection of algorithms run on a dataset to train the model candidates of an Autopilot job.
     * </p>
     * <note>
     * <p>
     * Selected algorithms must belong to the list corresponding to the training mode set in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html#sagemaker-Type-AutoMLJobConfig-Mode"
     * >AutoMLJobConfig.Mode</a> (<code>ENSEMBLING</code> or <code>HYPERPARAMETER_TUNING</code>). Choose a minimum of 1
     * algorithm.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * In <code>ENSEMBLING</code> mode:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "catboost"
     * </p>
     * </li>
     * <li>
     * <p>
     * "extra-trees"
     * </p>
     * </li>
     * <li>
     * <p>
     * "fastai"
     * </p>
     * </li>
     * <li>
     * <p>
     * "lightgbm"
     * </p>
     * </li>
     * <li>
     * <p>
     * "linear-learner"
     * </p>
     * </li>
     * <li>
     * <p>
     * "nn-torch"
     * </p>
     * </li>
     * <li>
     * <p>
     * "randomforest"
     * </p>
     * </li>
     * <li>
     * <p>
     * "xgboost"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * In <code>HYPERPARAMETER_TUNING</code> mode:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "linear-learner"
     * </p>
     * </li>
     * <li>
     * <p>
     * "mlp"
     * </p>
     * </li>
     * <li>
     * <p>
     * "xgboost"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     */
    private java.util.List<String> autoMLAlgorithms;

    /**
     * <p>
     * The selection of algorithms run on a dataset to train the model candidates of an Autopilot job.
     * </p>
     * <note>
     * <p>
     * Selected algorithms must belong to the list corresponding to the training mode set in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html#sagemaker-Type-AutoMLJobConfig-Mode"
     * >AutoMLJobConfig.Mode</a> (<code>ENSEMBLING</code> or <code>HYPERPARAMETER_TUNING</code>). Choose a minimum of 1
     * algorithm.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * In <code>ENSEMBLING</code> mode:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "catboost"
     * </p>
     * </li>
     * <li>
     * <p>
     * "extra-trees"
     * </p>
     * </li>
     * <li>
     * <p>
     * "fastai"
     * </p>
     * </li>
     * <li>
     * <p>
     * "lightgbm"
     * </p>
     * </li>
     * <li>
     * <p>
     * "linear-learner"
     * </p>
     * </li>
     * <li>
     * <p>
     * "nn-torch"
     * </p>
     * </li>
     * <li>
     * <p>
     * "randomforest"
     * </p>
     * </li>
     * <li>
     * <p>
     * "xgboost"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * In <code>HYPERPARAMETER_TUNING</code> mode:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "linear-learner"
     * </p>
     * </li>
     * <li>
     * <p>
     * "mlp"
     * </p>
     * </li>
     * <li>
     * <p>
     * "xgboost"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @return The selection of algorithms run on a dataset to train the model candidates of an Autopilot job. </p>
     *         <note>
     *         <p>
     *         Selected algorithms must belong to the list corresponding to the training mode set in <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html#sagemaker-Type-AutoMLJobConfig-Mode"
     *         >AutoMLJobConfig.Mode</a> (<code>ENSEMBLING</code> or <code>HYPERPARAMETER_TUNING</code>). Choose a
     *         minimum of 1 algorithm.
     *         </p>
     *         </note>
     *         <ul>
     *         <li>
     *         <p>
     *         In <code>ENSEMBLING</code> mode:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         "catboost"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "extra-trees"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "fastai"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "lightgbm"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "linear-learner"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "nn-torch"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "randomforest"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "xgboost"
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     *         <li>
     *         <p>
     *         In <code>HYPERPARAMETER_TUNING</code> mode:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         "linear-learner"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "mlp"
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         "xgboost"
     *         </p>
     *         </li>
     *         </ul>
     *         </li>
     * @see AutoMLAlgorithm
     */

    public java.util.List<String> getAutoMLAlgorithms() {
        return autoMLAlgorithms;
    }

    /**
     * <p>
     * The selection of algorithms run on a dataset to train the model candidates of an Autopilot job.
     * </p>
     * <note>
     * <p>
     * Selected algorithms must belong to the list corresponding to the training mode set in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html#sagemaker-Type-AutoMLJobConfig-Mode"
     * >AutoMLJobConfig.Mode</a> (<code>ENSEMBLING</code> or <code>HYPERPARAMETER_TUNING</code>). Choose a minimum of 1
     * algorithm.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * In <code>ENSEMBLING</code> mode:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "catboost"
     * </p>
     * </li>
     * <li>
     * <p>
     * "extra-trees"
     * </p>
     * </li>
     * <li>
     * <p>
     * "fastai"
     * </p>
     * </li>
     * <li>
     * <p>
     * "lightgbm"
     * </p>
     * </li>
     * <li>
     * <p>
     * "linear-learner"
     * </p>
     * </li>
     * <li>
     * <p>
     * "nn-torch"
     * </p>
     * </li>
     * <li>
     * <p>
     * "randomforest"
     * </p>
     * </li>
     * <li>
     * <p>
     * "xgboost"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * In <code>HYPERPARAMETER_TUNING</code> mode:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "linear-learner"
     * </p>
     * </li>
     * <li>
     * <p>
     * "mlp"
     * </p>
     * </li>
     * <li>
     * <p>
     * "xgboost"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param autoMLAlgorithms
     *        The selection of algorithms run on a dataset to train the model candidates of an Autopilot job. </p>
     *        <note>
     *        <p>
     *        Selected algorithms must belong to the list corresponding to the training mode set in <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html#sagemaker-Type-AutoMLJobConfig-Mode"
     *        >AutoMLJobConfig.Mode</a> (<code>ENSEMBLING</code> or <code>HYPERPARAMETER_TUNING</code>). Choose a
     *        minimum of 1 algorithm.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        In <code>ENSEMBLING</code> mode:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "catboost"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "extra-trees"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "fastai"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "lightgbm"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "linear-learner"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "nn-torch"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "randomforest"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "xgboost"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        In <code>HYPERPARAMETER_TUNING</code> mode:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "linear-learner"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mlp"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "xgboost"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @see AutoMLAlgorithm
     */

    public void setAutoMLAlgorithms(java.util.Collection<String> autoMLAlgorithms) {
        if (autoMLAlgorithms == null) {
            this.autoMLAlgorithms = null;
            return;
        }

        this.autoMLAlgorithms = new java.util.ArrayList<String>(autoMLAlgorithms);
    }

    /**
     * <p>
     * The selection of algorithms run on a dataset to train the model candidates of an Autopilot job.
     * </p>
     * <note>
     * <p>
     * Selected algorithms must belong to the list corresponding to the training mode set in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html#sagemaker-Type-AutoMLJobConfig-Mode"
     * >AutoMLJobConfig.Mode</a> (<code>ENSEMBLING</code> or <code>HYPERPARAMETER_TUNING</code>). Choose a minimum of 1
     * algorithm.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * In <code>ENSEMBLING</code> mode:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "catboost"
     * </p>
     * </li>
     * <li>
     * <p>
     * "extra-trees"
     * </p>
     * </li>
     * <li>
     * <p>
     * "fastai"
     * </p>
     * </li>
     * <li>
     * <p>
     * "lightgbm"
     * </p>
     * </li>
     * <li>
     * <p>
     * "linear-learner"
     * </p>
     * </li>
     * <li>
     * <p>
     * "nn-torch"
     * </p>
     * </li>
     * <li>
     * <p>
     * "randomforest"
     * </p>
     * </li>
     * <li>
     * <p>
     * "xgboost"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * In <code>HYPERPARAMETER_TUNING</code> mode:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "linear-learner"
     * </p>
     * </li>
     * <li>
     * <p>
     * "mlp"
     * </p>
     * </li>
     * <li>
     * <p>
     * "xgboost"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * <p>
     * <b>NOTE:</b> This method appends the values to the existing list (if any). Use
     * {@link #setAutoMLAlgorithms(java.util.Collection)} or {@link #withAutoMLAlgorithms(java.util.Collection)} if you
     * want to override the existing values.
     * </p>
     * 
     * @param autoMLAlgorithms
     *        The selection of algorithms run on a dataset to train the model candidates of an Autopilot job. </p>
     *        <note>
     *        <p>
     *        Selected algorithms must belong to the list corresponding to the training mode set in <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html#sagemaker-Type-AutoMLJobConfig-Mode"
     *        >AutoMLJobConfig.Mode</a> (<code>ENSEMBLING</code> or <code>HYPERPARAMETER_TUNING</code>). Choose a
     *        minimum of 1 algorithm.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        In <code>ENSEMBLING</code> mode:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "catboost"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "extra-trees"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "fastai"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "lightgbm"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "linear-learner"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "nn-torch"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "randomforest"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "xgboost"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        In <code>HYPERPARAMETER_TUNING</code> mode:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "linear-learner"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mlp"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "xgboost"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLAlgorithm
     */

    public AutoMLAlgorithmConfig withAutoMLAlgorithms(String... autoMLAlgorithms) {
        if (this.autoMLAlgorithms == null) {
            setAutoMLAlgorithms(new java.util.ArrayList<String>(autoMLAlgorithms.length));
        }
        for (String ele : autoMLAlgorithms) {
            this.autoMLAlgorithms.add(ele);
        }
        return this;
    }

    /**
     * <p>
     * The selection of algorithms run on a dataset to train the model candidates of an Autopilot job.
     * </p>
     * <note>
     * <p>
     * Selected algorithms must belong to the list corresponding to the training mode set in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html#sagemaker-Type-AutoMLJobConfig-Mode"
     * >AutoMLJobConfig.Mode</a> (<code>ENSEMBLING</code> or <code>HYPERPARAMETER_TUNING</code>). Choose a minimum of 1
     * algorithm.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * In <code>ENSEMBLING</code> mode:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "catboost"
     * </p>
     * </li>
     * <li>
     * <p>
     * "extra-trees"
     * </p>
     * </li>
     * <li>
     * <p>
     * "fastai"
     * </p>
     * </li>
     * <li>
     * <p>
     * "lightgbm"
     * </p>
     * </li>
     * <li>
     * <p>
     * "linear-learner"
     * </p>
     * </li>
     * <li>
     * <p>
     * "nn-torch"
     * </p>
     * </li>
     * <li>
     * <p>
     * "randomforest"
     * </p>
     * </li>
     * <li>
     * <p>
     * "xgboost"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * In <code>HYPERPARAMETER_TUNING</code> mode:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "linear-learner"
     * </p>
     * </li>
     * <li>
     * <p>
     * "mlp"
     * </p>
     * </li>
     * <li>
     * <p>
     * "xgboost"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param autoMLAlgorithms
     *        The selection of algorithms run on a dataset to train the model candidates of an Autopilot job. </p>
     *        <note>
     *        <p>
     *        Selected algorithms must belong to the list corresponding to the training mode set in <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html#sagemaker-Type-AutoMLJobConfig-Mode"
     *        >AutoMLJobConfig.Mode</a> (<code>ENSEMBLING</code> or <code>HYPERPARAMETER_TUNING</code>). Choose a
     *        minimum of 1 algorithm.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        In <code>ENSEMBLING</code> mode:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "catboost"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "extra-trees"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "fastai"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "lightgbm"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "linear-learner"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "nn-torch"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "randomforest"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "xgboost"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        In <code>HYPERPARAMETER_TUNING</code> mode:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "linear-learner"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mlp"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "xgboost"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLAlgorithm
     */

    public AutoMLAlgorithmConfig withAutoMLAlgorithms(java.util.Collection<String> autoMLAlgorithms) {
        setAutoMLAlgorithms(autoMLAlgorithms);
        return this;
    }

    /**
     * <p>
     * The selection of algorithms run on a dataset to train the model candidates of an Autopilot job.
     * </p>
     * <note>
     * <p>
     * Selected algorithms must belong to the list corresponding to the training mode set in <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html#sagemaker-Type-AutoMLJobConfig-Mode"
     * >AutoMLJobConfig.Mode</a> (<code>ENSEMBLING</code> or <code>HYPERPARAMETER_TUNING</code>). Choose a minimum of 1
     * algorithm.
     * </p>
     * </note>
     * <ul>
     * <li>
     * <p>
     * In <code>ENSEMBLING</code> mode:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "catboost"
     * </p>
     * </li>
     * <li>
     * <p>
     * "extra-trees"
     * </p>
     * </li>
     * <li>
     * <p>
     * "fastai"
     * </p>
     * </li>
     * <li>
     * <p>
     * "lightgbm"
     * </p>
     * </li>
     * <li>
     * <p>
     * "linear-learner"
     * </p>
     * </li>
     * <li>
     * <p>
     * "nn-torch"
     * </p>
     * </li>
     * <li>
     * <p>
     * "randomforest"
     * </p>
     * </li>
     * <li>
     * <p>
     * "xgboost"
     * </p>
     * </li>
     * </ul>
     * </li>
     * <li>
     * <p>
     * In <code>HYPERPARAMETER_TUNING</code> mode:
     * </p>
     * <ul>
     * <li>
     * <p>
     * "linear-learner"
     * </p>
     * </li>
     * <li>
     * <p>
     * "mlp"
     * </p>
     * </li>
     * <li>
     * <p>
     * "xgboost"
     * </p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * @param autoMLAlgorithms
     *        The selection of algorithms run on a dataset to train the model candidates of an Autopilot job. </p>
     *        <note>
     *        <p>
     *        Selected algorithms must belong to the list corresponding to the training mode set in <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/APIReference/API_AutoMLJobConfig.html#sagemaker-Type-AutoMLJobConfig-Mode"
     *        >AutoMLJobConfig.Mode</a> (<code>ENSEMBLING</code> or <code>HYPERPARAMETER_TUNING</code>). Choose a
     *        minimum of 1 algorithm.
     *        </p>
     *        </note>
     *        <ul>
     *        <li>
     *        <p>
     *        In <code>ENSEMBLING</code> mode:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "catboost"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "extra-trees"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "fastai"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "lightgbm"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "linear-learner"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "nn-torch"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "randomforest"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "xgboost"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     *        <li>
     *        <p>
     *        In <code>HYPERPARAMETER_TUNING</code> mode:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        "linear-learner"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "mlp"
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        "xgboost"
     *        </p>
     *        </li>
     *        </ul>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLAlgorithm
     */

    public AutoMLAlgorithmConfig withAutoMLAlgorithms(AutoMLAlgorithm... autoMLAlgorithms) {
        java.util.ArrayList<String> autoMLAlgorithmsCopy = new java.util.ArrayList<String>(autoMLAlgorithms.length);
        for (AutoMLAlgorithm value : autoMLAlgorithms) {
            autoMLAlgorithmsCopy.add(value.toString());
        }
        if (getAutoMLAlgorithms() == null) {
            setAutoMLAlgorithms(autoMLAlgorithmsCopy);
        } else {
            getAutoMLAlgorithms().addAll(autoMLAlgorithmsCopy);
        }
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
        if (getAutoMLAlgorithms() != null)
            sb.append("AutoMLAlgorithms: ").append(getAutoMLAlgorithms());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLAlgorithmConfig == false)
            return false;
        AutoMLAlgorithmConfig other = (AutoMLAlgorithmConfig) obj;
        if (other.getAutoMLAlgorithms() == null ^ this.getAutoMLAlgorithms() == null)
            return false;
        if (other.getAutoMLAlgorithms() != null && other.getAutoMLAlgorithms().equals(this.getAutoMLAlgorithms()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAutoMLAlgorithms() == null) ? 0 : getAutoMLAlgorithms().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLAlgorithmConfig clone() {
        try {
            return (AutoMLAlgorithmConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLAlgorithmConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
