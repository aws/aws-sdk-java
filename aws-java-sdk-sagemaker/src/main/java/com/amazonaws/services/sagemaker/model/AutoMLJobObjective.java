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
package com.amazonaws.services.sagemaker.model;

import java.io.Serializable;
import javax.annotation.Generated;
import com.amazonaws.protocol.StructuredPojo;
import com.amazonaws.protocol.ProtocolMarshaller;

/**
 * <p>
 * Specifies a metric to minimize or maximize as the objective of a job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLJobObjective" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLJobObjective implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. This metric
     * is optimized during training to provide the best estimate for model parameter values from data.
     * </p>
     * <p>
     * Here are the options:
     * </p>
     * <dl>
     * <dt>Accuracy</dt>
     * <dd>
     * <p>
     * The ratio of the number of correctly classified items to the total number of (correctly and incorrectly)
     * classified items. It is used for both binary and multiclass classification. Accuracy measures how close the
     * predicted class values are to the actual values. Values for accuracy metrics vary between zero (0) and one (1). A
     * value of 1 indicates perfect accuracy, and 0 indicates perfect inaccuracy.
     * </p>
     * </dd>
     * <dt>AUC</dt>
     * <dd>
     * <p>
     * The area under the curve (AUC) metric is used to compare and evaluate binary classification by algorithms that
     * return probabilities, such as logistic regression. To map the probabilities into classifications, these are
     * compared against a threshold value.
     * </p>
     * <p>
     * The relevant curve is the receiver operating characteristic curve (ROC curve). The ROC curve plots the true
     * positive rate (TPR) of predictions (or recall) against the false positive rate (FPR) as a function of the
     * threshold value, above which a prediction is considered positive. Increasing the threshold results in fewer false
     * positives, but more false negatives.
     * </p>
     * <p>
     * AUC is the area under this ROC curve. Therefore, AUC provides an aggregated measure of the model performance
     * across all possible classification thresholds. AUC scores vary between 0 and 1. A score of 1 indicates perfect
     * accuracy, and a score of one half (0.5) indicates that the prediction is not better than a random classifier.
     * </p>
     * </dd>
     * <dt>BalancedAccuracy</dt>
     * <dd>
     * <p>
     * <code>BalancedAccuracy</code> is a metric that measures the ratio of accurate predictions to all predictions.
     * This ratio is calculated after normalizing true positives (TP) and true negatives (TN) by the total number of
     * positive (P) and negative (N) values. It is used in both binary and multiclass classification and is defined as
     * follows: 0.5*((TP/P)+(TN/N)), with values ranging from 0 to 1. <code>BalancedAccuracy</code> gives a better
     * measure of accuracy when the number of positives or negatives differ greatly from each other in an imbalanced
     * dataset. For example, when only 1% of email is spam.
     * </p>
     * </dd>
     * <dt>F1</dt>
     * <dd>
     * <p>
     * The <code>F1</code> score is the harmonic mean of the precision and recall, defined as follows: F1 = 2 *
     * (precision * recall) / (precision + recall). It is used for binary classification into classes traditionally
     * referred to as positive and negative. Predictions are said to be true when they match their actual (correct)
     * class, and false when they do not.
     * </p>
     * <p>
     * Precision is the ratio of the true positive predictions to all positive predictions, and it includes the false
     * positives in a dataset. Precision measures the quality of the prediction when it predicts the positive class.
     * </p>
     * <p>
     * Recall (or sensitivity) is the ratio of the true positive predictions to all actual positive instances. Recall
     * measures how completely a model predicts the actual class members in a dataset.
     * </p>
     * <p>
     * F1 scores vary between 0 and 1. A score of 1 indicates the best possible performance, and 0 indicates the worst.
     * </p>
     * </dd>
     * <dt>F1macro</dt>
     * <dd>
     * <p>
     * The <code>F1macro</code> score applies F1 scoring to multiclass classification problems. It does this by
     * calculating the precision and recall, and then taking their harmonic mean to calculate the F1 score for each
     * class. Lastly, the F1macro averages the individual scores to obtain the <code>F1macro</code> score.
     * <code>F1macro</code> scores vary between 0 and 1. A score of 1 indicates the best possible performance, and 0
     * indicates the worst.
     * </p>
     * </dd>
     * <dt>MAE</dt>
     * <dd>
     * <p>
     * The mean absolute error (MAE) is a measure of how different the predicted and actual values are, when they're
     * averaged over all values. MAE is commonly used in regression analysis to understand model prediction error. If
     * there is linear regression, MAE represents the average distance from a predicted line to the actual value. MAE is
     * defined as the sum of absolute errors divided by the number of observations. Values range from 0 to infinity,
     * with smaller numbers indicating a better model fit to the data.
     * </p>
     * </dd>
     * <dt>MSE</dt>
     * <dd>
     * <p>
     * The mean squared error (MSE) is the average of the squared differences between the predicted and actual values.
     * It is used for regression. MSE values are always positive. The better a model is at predicting the actual values,
     * the smaller the MSE value is
     * </p>
     * </dd>
     * <dt>Precision</dt>
     * <dd>
     * <p>
     * Precision measures how well an algorithm predicts the true positives (TP) out of all of the positives that it
     * identifies. It is defined as follows: Precision = TP/(TP+FP), with values ranging from zero (0) to one (1), and
     * is used in binary classification. Precision is an important metric when the cost of a false positive is high. For
     * example, the cost of a false positive is very high if an airplane safety system is falsely deemed safe to fly. A
     * false positive (FP) reflects a positive prediction that is actually negative in the data.
     * </p>
     * </dd>
     * <dt>PrecisionMacro</dt>
     * <dd>
     * <p>
     * The precision macro computes precision for multiclass classification problems. It does this by calculating
     * precision for each class and averaging scores to obtain precision for several classes.
     * <code>PrecisionMacro</code> scores range from zero (0) to one (1). Higher scores reflect the model's ability to
     * predict true positives (TP) out of all of the positives that it identifies, averaged across multiple classes.
     * </p>
     * </dd>
     * <dt>R2</dt>
     * <dd>
     * <p>
     * R2, also known as the coefficient of determination, is used in regression to quantify how much a model can
     * explain the variance of a dependent variable. Values range from one (1) to negative one (-1). Higher numbers
     * indicate a higher fraction of explained variability. <code>R2</code> values close to zero (0) indicate that very
     * little of the dependent variable can be explained by the model. Negative values indicate a poor fit and that the
     * model is outperformed by a constant function. For linear regression, this is a horizontal line.
     * </p>
     * </dd>
     * <dt>Recall</dt>
     * <dd>
     * <p>
     * Recall measures how well an algorithm correctly predicts all of the true positives (TP) in a dataset. A true
     * positive is a positive prediction that is also an actual positive value in the data. Recall is defined as
     * follows: Recall = TP/(TP+FN), with values ranging from 0 to 1. Higher scores reflect a better ability of the
     * model to predict true positives (TP) in the data, and is used in binary classification.
     * </p>
     * <p>
     * Recall is important when testing for cancer because it's used to find all of the true positives. A false positive
     * (FP) reflects a positive prediction that is actually negative in the data. It is often insufficient to measure
     * only recall, because predicting every output as a true positive will yield a perfect recall score.
     * </p>
     * </dd>
     * <dt>RecallMacro</dt>
     * <dd>
     * <p>
     * The RecallMacro computes recall for multiclass classification problems by calculating recall for each class and
     * averaging scores to obtain recall for several classes. RecallMacro scores range from 0 to 1. Higher scores
     * reflect the model's ability to predict true positives (TP) in a dataset. Whereas, a true positive reflects a
     * positive prediction that is also an actual positive value in the data. It is often insufficient to measure only
     * recall, because predicting every output as a true positive will yield a perfect recall score.
     * </p>
     * </dd>
     * <dt>RMSE</dt>
     * <dd>
     * <p>
     * Root mean squared error (RMSE) measures the square root of the squared difference between predicted and actual
     * values, and it's averaged over all values. It is used in regression analysis to understand model prediction
     * error. It's an important metric to indicate the presence of large model errors and outliers. Values range from
     * zero (0) to infinity, with smaller numbers indicating a better model fit to the data. RMSE is dependent on scale,
     * and should not be used to compare datasets of different sizes.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * If you do not specify a metric explicitly, the default behavior is to automatically use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MSE</code>: for regression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>F1</code>: for binary classification
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Accuracy</code>: for multiclass classification.
     * </p>
     * </li>
     * </ul>
     */
    private String metricName;

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. This metric
     * is optimized during training to provide the best estimate for model parameter values from data.
     * </p>
     * <p>
     * Here are the options:
     * </p>
     * <dl>
     * <dt>Accuracy</dt>
     * <dd>
     * <p>
     * The ratio of the number of correctly classified items to the total number of (correctly and incorrectly)
     * classified items. It is used for both binary and multiclass classification. Accuracy measures how close the
     * predicted class values are to the actual values. Values for accuracy metrics vary between zero (0) and one (1). A
     * value of 1 indicates perfect accuracy, and 0 indicates perfect inaccuracy.
     * </p>
     * </dd>
     * <dt>AUC</dt>
     * <dd>
     * <p>
     * The area under the curve (AUC) metric is used to compare and evaluate binary classification by algorithms that
     * return probabilities, such as logistic regression. To map the probabilities into classifications, these are
     * compared against a threshold value.
     * </p>
     * <p>
     * The relevant curve is the receiver operating characteristic curve (ROC curve). The ROC curve plots the true
     * positive rate (TPR) of predictions (or recall) against the false positive rate (FPR) as a function of the
     * threshold value, above which a prediction is considered positive. Increasing the threshold results in fewer false
     * positives, but more false negatives.
     * </p>
     * <p>
     * AUC is the area under this ROC curve. Therefore, AUC provides an aggregated measure of the model performance
     * across all possible classification thresholds. AUC scores vary between 0 and 1. A score of 1 indicates perfect
     * accuracy, and a score of one half (0.5) indicates that the prediction is not better than a random classifier.
     * </p>
     * </dd>
     * <dt>BalancedAccuracy</dt>
     * <dd>
     * <p>
     * <code>BalancedAccuracy</code> is a metric that measures the ratio of accurate predictions to all predictions.
     * This ratio is calculated after normalizing true positives (TP) and true negatives (TN) by the total number of
     * positive (P) and negative (N) values. It is used in both binary and multiclass classification and is defined as
     * follows: 0.5*((TP/P)+(TN/N)), with values ranging from 0 to 1. <code>BalancedAccuracy</code> gives a better
     * measure of accuracy when the number of positives or negatives differ greatly from each other in an imbalanced
     * dataset. For example, when only 1% of email is spam.
     * </p>
     * </dd>
     * <dt>F1</dt>
     * <dd>
     * <p>
     * The <code>F1</code> score is the harmonic mean of the precision and recall, defined as follows: F1 = 2 *
     * (precision * recall) / (precision + recall). It is used for binary classification into classes traditionally
     * referred to as positive and negative. Predictions are said to be true when they match their actual (correct)
     * class, and false when they do not.
     * </p>
     * <p>
     * Precision is the ratio of the true positive predictions to all positive predictions, and it includes the false
     * positives in a dataset. Precision measures the quality of the prediction when it predicts the positive class.
     * </p>
     * <p>
     * Recall (or sensitivity) is the ratio of the true positive predictions to all actual positive instances. Recall
     * measures how completely a model predicts the actual class members in a dataset.
     * </p>
     * <p>
     * F1 scores vary between 0 and 1. A score of 1 indicates the best possible performance, and 0 indicates the worst.
     * </p>
     * </dd>
     * <dt>F1macro</dt>
     * <dd>
     * <p>
     * The <code>F1macro</code> score applies F1 scoring to multiclass classification problems. It does this by
     * calculating the precision and recall, and then taking their harmonic mean to calculate the F1 score for each
     * class. Lastly, the F1macro averages the individual scores to obtain the <code>F1macro</code> score.
     * <code>F1macro</code> scores vary between 0 and 1. A score of 1 indicates the best possible performance, and 0
     * indicates the worst.
     * </p>
     * </dd>
     * <dt>MAE</dt>
     * <dd>
     * <p>
     * The mean absolute error (MAE) is a measure of how different the predicted and actual values are, when they're
     * averaged over all values. MAE is commonly used in regression analysis to understand model prediction error. If
     * there is linear regression, MAE represents the average distance from a predicted line to the actual value. MAE is
     * defined as the sum of absolute errors divided by the number of observations. Values range from 0 to infinity,
     * with smaller numbers indicating a better model fit to the data.
     * </p>
     * </dd>
     * <dt>MSE</dt>
     * <dd>
     * <p>
     * The mean squared error (MSE) is the average of the squared differences between the predicted and actual values.
     * It is used for regression. MSE values are always positive. The better a model is at predicting the actual values,
     * the smaller the MSE value is
     * </p>
     * </dd>
     * <dt>Precision</dt>
     * <dd>
     * <p>
     * Precision measures how well an algorithm predicts the true positives (TP) out of all of the positives that it
     * identifies. It is defined as follows: Precision = TP/(TP+FP), with values ranging from zero (0) to one (1), and
     * is used in binary classification. Precision is an important metric when the cost of a false positive is high. For
     * example, the cost of a false positive is very high if an airplane safety system is falsely deemed safe to fly. A
     * false positive (FP) reflects a positive prediction that is actually negative in the data.
     * </p>
     * </dd>
     * <dt>PrecisionMacro</dt>
     * <dd>
     * <p>
     * The precision macro computes precision for multiclass classification problems. It does this by calculating
     * precision for each class and averaging scores to obtain precision for several classes.
     * <code>PrecisionMacro</code> scores range from zero (0) to one (1). Higher scores reflect the model's ability to
     * predict true positives (TP) out of all of the positives that it identifies, averaged across multiple classes.
     * </p>
     * </dd>
     * <dt>R2</dt>
     * <dd>
     * <p>
     * R2, also known as the coefficient of determination, is used in regression to quantify how much a model can
     * explain the variance of a dependent variable. Values range from one (1) to negative one (-1). Higher numbers
     * indicate a higher fraction of explained variability. <code>R2</code> values close to zero (0) indicate that very
     * little of the dependent variable can be explained by the model. Negative values indicate a poor fit and that the
     * model is outperformed by a constant function. For linear regression, this is a horizontal line.
     * </p>
     * </dd>
     * <dt>Recall</dt>
     * <dd>
     * <p>
     * Recall measures how well an algorithm correctly predicts all of the true positives (TP) in a dataset. A true
     * positive is a positive prediction that is also an actual positive value in the data. Recall is defined as
     * follows: Recall = TP/(TP+FN), with values ranging from 0 to 1. Higher scores reflect a better ability of the
     * model to predict true positives (TP) in the data, and is used in binary classification.
     * </p>
     * <p>
     * Recall is important when testing for cancer because it's used to find all of the true positives. A false positive
     * (FP) reflects a positive prediction that is actually negative in the data. It is often insufficient to measure
     * only recall, because predicting every output as a true positive will yield a perfect recall score.
     * </p>
     * </dd>
     * <dt>RecallMacro</dt>
     * <dd>
     * <p>
     * The RecallMacro computes recall for multiclass classification problems by calculating recall for each class and
     * averaging scores to obtain recall for several classes. RecallMacro scores range from 0 to 1. Higher scores
     * reflect the model's ability to predict true positives (TP) in a dataset. Whereas, a true positive reflects a
     * positive prediction that is also an actual positive value in the data. It is often insufficient to measure only
     * recall, because predicting every output as a true positive will yield a perfect recall score.
     * </p>
     * </dd>
     * <dt>RMSE</dt>
     * <dd>
     * <p>
     * Root mean squared error (RMSE) measures the square root of the squared difference between predicted and actual
     * values, and it's averaged over all values. It is used in regression analysis to understand model prediction
     * error. It's an important metric to indicate the presence of large model errors and outliers. Values range from
     * zero (0) to infinity, with smaller numbers indicating a better model fit to the data. RMSE is dependent on scale,
     * and should not be used to compare datasets of different sizes.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * If you do not specify a metric explicitly, the default behavior is to automatically use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MSE</code>: for regression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>F1</code>: for binary classification
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Accuracy</code>: for multiclass classification.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The name of the objective metric used to measure the predictive quality of a machine learning system. This
     *        metric is optimized during training to provide the best estimate for model parameter values from data.</p>
     *        <p>
     *        Here are the options:
     *        </p>
     *        <dl>
     *        <dt>Accuracy</dt>
     *        <dd>
     *        <p>
     *        The ratio of the number of correctly classified items to the total number of (correctly and incorrectly)
     *        classified items. It is used for both binary and multiclass classification. Accuracy measures how close
     *        the predicted class values are to the actual values. Values for accuracy metrics vary between zero (0) and
     *        one (1). A value of 1 indicates perfect accuracy, and 0 indicates perfect inaccuracy.
     *        </p>
     *        </dd>
     *        <dt>AUC</dt>
     *        <dd>
     *        <p>
     *        The area under the curve (AUC) metric is used to compare and evaluate binary classification by algorithms
     *        that return probabilities, such as logistic regression. To map the probabilities into classifications,
     *        these are compared against a threshold value.
     *        </p>
     *        <p>
     *        The relevant curve is the receiver operating characteristic curve (ROC curve). The ROC curve plots the
     *        true positive rate (TPR) of predictions (or recall) against the false positive rate (FPR) as a function of
     *        the threshold value, above which a prediction is considered positive. Increasing the threshold results in
     *        fewer false positives, but more false negatives.
     *        </p>
     *        <p>
     *        AUC is the area under this ROC curve. Therefore, AUC provides an aggregated measure of the model
     *        performance across all possible classification thresholds. AUC scores vary between 0 and 1. A score of 1
     *        indicates perfect accuracy, and a score of one half (0.5) indicates that the prediction is not better than
     *        a random classifier.
     *        </p>
     *        </dd>
     *        <dt>BalancedAccuracy</dt>
     *        <dd>
     *        <p>
     *        <code>BalancedAccuracy</code> is a metric that measures the ratio of accurate predictions to all
     *        predictions. This ratio is calculated after normalizing true positives (TP) and true negatives (TN) by the
     *        total number of positive (P) and negative (N) values. It is used in both binary and multiclass
     *        classification and is defined as follows: 0.5*((TP/P)+(TN/N)), with values ranging from 0 to 1.
     *        <code>BalancedAccuracy</code> gives a better measure of accuracy when the number of positives or negatives
     *        differ greatly from each other in an imbalanced dataset. For example, when only 1% of email is spam.
     *        </p>
     *        </dd>
     *        <dt>F1</dt>
     *        <dd>
     *        <p>
     *        The <code>F1</code> score is the harmonic mean of the precision and recall, defined as follows: F1 = 2 *
     *        (precision * recall) / (precision + recall). It is used for binary classification into classes
     *        traditionally referred to as positive and negative. Predictions are said to be true when they match their
     *        actual (correct) class, and false when they do not.
     *        </p>
     *        <p>
     *        Precision is the ratio of the true positive predictions to all positive predictions, and it includes the
     *        false positives in a dataset. Precision measures the quality of the prediction when it predicts the
     *        positive class.
     *        </p>
     *        <p>
     *        Recall (or sensitivity) is the ratio of the true positive predictions to all actual positive instances.
     *        Recall measures how completely a model predicts the actual class members in a dataset.
     *        </p>
     *        <p>
     *        F1 scores vary between 0 and 1. A score of 1 indicates the best possible performance, and 0 indicates the
     *        worst.
     *        </p>
     *        </dd>
     *        <dt>F1macro</dt>
     *        <dd>
     *        <p>
     *        The <code>F1macro</code> score applies F1 scoring to multiclass classification problems. It does this by
     *        calculating the precision and recall, and then taking their harmonic mean to calculate the F1 score for
     *        each class. Lastly, the F1macro averages the individual scores to obtain the <code>F1macro</code> score.
     *        <code>F1macro</code> scores vary between 0 and 1. A score of 1 indicates the best possible performance,
     *        and 0 indicates the worst.
     *        </p>
     *        </dd>
     *        <dt>MAE</dt>
     *        <dd>
     *        <p>
     *        The mean absolute error (MAE) is a measure of how different the predicted and actual values are, when
     *        they're averaged over all values. MAE is commonly used in regression analysis to understand model
     *        prediction error. If there is linear regression, MAE represents the average distance from a predicted line
     *        to the actual value. MAE is defined as the sum of absolute errors divided by the number of observations.
     *        Values range from 0 to infinity, with smaller numbers indicating a better model fit to the data.
     *        </p>
     *        </dd>
     *        <dt>MSE</dt>
     *        <dd>
     *        <p>
     *        The mean squared error (MSE) is the average of the squared differences between the predicted and actual
     *        values. It is used for regression. MSE values are always positive. The better a model is at predicting the
     *        actual values, the smaller the MSE value is
     *        </p>
     *        </dd>
     *        <dt>Precision</dt>
     *        <dd>
     *        <p>
     *        Precision measures how well an algorithm predicts the true positives (TP) out of all of the positives that
     *        it identifies. It is defined as follows: Precision = TP/(TP+FP), with values ranging from zero (0) to one
     *        (1), and is used in binary classification. Precision is an important metric when the cost of a false
     *        positive is high. For example, the cost of a false positive is very high if an airplane safety system is
     *        falsely deemed safe to fly. A false positive (FP) reflects a positive prediction that is actually negative
     *        in the data.
     *        </p>
     *        </dd>
     *        <dt>PrecisionMacro</dt>
     *        <dd>
     *        <p>
     *        The precision macro computes precision for multiclass classification problems. It does this by calculating
     *        precision for each class and averaging scores to obtain precision for several classes.
     *        <code>PrecisionMacro</code> scores range from zero (0) to one (1). Higher scores reflect the model's
     *        ability to predict true positives (TP) out of all of the positives that it identifies, averaged across
     *        multiple classes.
     *        </p>
     *        </dd>
     *        <dt>R2</dt>
     *        <dd>
     *        <p>
     *        R2, also known as the coefficient of determination, is used in regression to quantify how much a model can
     *        explain the variance of a dependent variable. Values range from one (1) to negative one (-1). Higher
     *        numbers indicate a higher fraction of explained variability. <code>R2</code> values close to zero (0)
     *        indicate that very little of the dependent variable can be explained by the model. Negative values
     *        indicate a poor fit and that the model is outperformed by a constant function. For linear regression, this
     *        is a horizontal line.
     *        </p>
     *        </dd>
     *        <dt>Recall</dt>
     *        <dd>
     *        <p>
     *        Recall measures how well an algorithm correctly predicts all of the true positives (TP) in a dataset. A
     *        true positive is a positive prediction that is also an actual positive value in the data. Recall is
     *        defined as follows: Recall = TP/(TP+FN), with values ranging from 0 to 1. Higher scores reflect a better
     *        ability of the model to predict true positives (TP) in the data, and is used in binary classification.
     *        </p>
     *        <p>
     *        Recall is important when testing for cancer because it's used to find all of the true positives. A false
     *        positive (FP) reflects a positive prediction that is actually negative in the data. It is often
     *        insufficient to measure only recall, because predicting every output as a true positive will yield a
     *        perfect recall score.
     *        </p>
     *        </dd>
     *        <dt>RecallMacro</dt>
     *        <dd>
     *        <p>
     *        The RecallMacro computes recall for multiclass classification problems by calculating recall for each
     *        class and averaging scores to obtain recall for several classes. RecallMacro scores range from 0 to 1.
     *        Higher scores reflect the model's ability to predict true positives (TP) in a dataset. Whereas, a true
     *        positive reflects a positive prediction that is also an actual positive value in the data. It is often
     *        insufficient to measure only recall, because predicting every output as a true positive will yield a
     *        perfect recall score.
     *        </p>
     *        </dd>
     *        <dt>RMSE</dt>
     *        <dd>
     *        <p>
     *        Root mean squared error (RMSE) measures the square root of the squared difference between predicted and
     *        actual values, and it's averaged over all values. It is used in regression analysis to understand model
     *        prediction error. It's an important metric to indicate the presence of large model errors and outliers.
     *        Values range from zero (0) to infinity, with smaller numbers indicating a better model fit to the data.
     *        RMSE is dependent on scale, and should not be used to compare datasets of different sizes.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        If you do not specify a metric explicitly, the default behavior is to automatically use:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MSE</code>: for regression.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>F1</code>: for binary classification
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Accuracy</code>: for multiclass classification.
     *        </p>
     *        </li>
     * @see AutoMLMetricEnum
     */

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. This metric
     * is optimized during training to provide the best estimate for model parameter values from data.
     * </p>
     * <p>
     * Here are the options:
     * </p>
     * <dl>
     * <dt>Accuracy</dt>
     * <dd>
     * <p>
     * The ratio of the number of correctly classified items to the total number of (correctly and incorrectly)
     * classified items. It is used for both binary and multiclass classification. Accuracy measures how close the
     * predicted class values are to the actual values. Values for accuracy metrics vary between zero (0) and one (1). A
     * value of 1 indicates perfect accuracy, and 0 indicates perfect inaccuracy.
     * </p>
     * </dd>
     * <dt>AUC</dt>
     * <dd>
     * <p>
     * The area under the curve (AUC) metric is used to compare and evaluate binary classification by algorithms that
     * return probabilities, such as logistic regression. To map the probabilities into classifications, these are
     * compared against a threshold value.
     * </p>
     * <p>
     * The relevant curve is the receiver operating characteristic curve (ROC curve). The ROC curve plots the true
     * positive rate (TPR) of predictions (or recall) against the false positive rate (FPR) as a function of the
     * threshold value, above which a prediction is considered positive. Increasing the threshold results in fewer false
     * positives, but more false negatives.
     * </p>
     * <p>
     * AUC is the area under this ROC curve. Therefore, AUC provides an aggregated measure of the model performance
     * across all possible classification thresholds. AUC scores vary between 0 and 1. A score of 1 indicates perfect
     * accuracy, and a score of one half (0.5) indicates that the prediction is not better than a random classifier.
     * </p>
     * </dd>
     * <dt>BalancedAccuracy</dt>
     * <dd>
     * <p>
     * <code>BalancedAccuracy</code> is a metric that measures the ratio of accurate predictions to all predictions.
     * This ratio is calculated after normalizing true positives (TP) and true negatives (TN) by the total number of
     * positive (P) and negative (N) values. It is used in both binary and multiclass classification and is defined as
     * follows: 0.5*((TP/P)+(TN/N)), with values ranging from 0 to 1. <code>BalancedAccuracy</code> gives a better
     * measure of accuracy when the number of positives or negatives differ greatly from each other in an imbalanced
     * dataset. For example, when only 1% of email is spam.
     * </p>
     * </dd>
     * <dt>F1</dt>
     * <dd>
     * <p>
     * The <code>F1</code> score is the harmonic mean of the precision and recall, defined as follows: F1 = 2 *
     * (precision * recall) / (precision + recall). It is used for binary classification into classes traditionally
     * referred to as positive and negative. Predictions are said to be true when they match their actual (correct)
     * class, and false when they do not.
     * </p>
     * <p>
     * Precision is the ratio of the true positive predictions to all positive predictions, and it includes the false
     * positives in a dataset. Precision measures the quality of the prediction when it predicts the positive class.
     * </p>
     * <p>
     * Recall (or sensitivity) is the ratio of the true positive predictions to all actual positive instances. Recall
     * measures how completely a model predicts the actual class members in a dataset.
     * </p>
     * <p>
     * F1 scores vary between 0 and 1. A score of 1 indicates the best possible performance, and 0 indicates the worst.
     * </p>
     * </dd>
     * <dt>F1macro</dt>
     * <dd>
     * <p>
     * The <code>F1macro</code> score applies F1 scoring to multiclass classification problems. It does this by
     * calculating the precision and recall, and then taking their harmonic mean to calculate the F1 score for each
     * class. Lastly, the F1macro averages the individual scores to obtain the <code>F1macro</code> score.
     * <code>F1macro</code> scores vary between 0 and 1. A score of 1 indicates the best possible performance, and 0
     * indicates the worst.
     * </p>
     * </dd>
     * <dt>MAE</dt>
     * <dd>
     * <p>
     * The mean absolute error (MAE) is a measure of how different the predicted and actual values are, when they're
     * averaged over all values. MAE is commonly used in regression analysis to understand model prediction error. If
     * there is linear regression, MAE represents the average distance from a predicted line to the actual value. MAE is
     * defined as the sum of absolute errors divided by the number of observations. Values range from 0 to infinity,
     * with smaller numbers indicating a better model fit to the data.
     * </p>
     * </dd>
     * <dt>MSE</dt>
     * <dd>
     * <p>
     * The mean squared error (MSE) is the average of the squared differences between the predicted and actual values.
     * It is used for regression. MSE values are always positive. The better a model is at predicting the actual values,
     * the smaller the MSE value is
     * </p>
     * </dd>
     * <dt>Precision</dt>
     * <dd>
     * <p>
     * Precision measures how well an algorithm predicts the true positives (TP) out of all of the positives that it
     * identifies. It is defined as follows: Precision = TP/(TP+FP), with values ranging from zero (0) to one (1), and
     * is used in binary classification. Precision is an important metric when the cost of a false positive is high. For
     * example, the cost of a false positive is very high if an airplane safety system is falsely deemed safe to fly. A
     * false positive (FP) reflects a positive prediction that is actually negative in the data.
     * </p>
     * </dd>
     * <dt>PrecisionMacro</dt>
     * <dd>
     * <p>
     * The precision macro computes precision for multiclass classification problems. It does this by calculating
     * precision for each class and averaging scores to obtain precision for several classes.
     * <code>PrecisionMacro</code> scores range from zero (0) to one (1). Higher scores reflect the model's ability to
     * predict true positives (TP) out of all of the positives that it identifies, averaged across multiple classes.
     * </p>
     * </dd>
     * <dt>R2</dt>
     * <dd>
     * <p>
     * R2, also known as the coefficient of determination, is used in regression to quantify how much a model can
     * explain the variance of a dependent variable. Values range from one (1) to negative one (-1). Higher numbers
     * indicate a higher fraction of explained variability. <code>R2</code> values close to zero (0) indicate that very
     * little of the dependent variable can be explained by the model. Negative values indicate a poor fit and that the
     * model is outperformed by a constant function. For linear regression, this is a horizontal line.
     * </p>
     * </dd>
     * <dt>Recall</dt>
     * <dd>
     * <p>
     * Recall measures how well an algorithm correctly predicts all of the true positives (TP) in a dataset. A true
     * positive is a positive prediction that is also an actual positive value in the data. Recall is defined as
     * follows: Recall = TP/(TP+FN), with values ranging from 0 to 1. Higher scores reflect a better ability of the
     * model to predict true positives (TP) in the data, and is used in binary classification.
     * </p>
     * <p>
     * Recall is important when testing for cancer because it's used to find all of the true positives. A false positive
     * (FP) reflects a positive prediction that is actually negative in the data. It is often insufficient to measure
     * only recall, because predicting every output as a true positive will yield a perfect recall score.
     * </p>
     * </dd>
     * <dt>RecallMacro</dt>
     * <dd>
     * <p>
     * The RecallMacro computes recall for multiclass classification problems by calculating recall for each class and
     * averaging scores to obtain recall for several classes. RecallMacro scores range from 0 to 1. Higher scores
     * reflect the model's ability to predict true positives (TP) in a dataset. Whereas, a true positive reflects a
     * positive prediction that is also an actual positive value in the data. It is often insufficient to measure only
     * recall, because predicting every output as a true positive will yield a perfect recall score.
     * </p>
     * </dd>
     * <dt>RMSE</dt>
     * <dd>
     * <p>
     * Root mean squared error (RMSE) measures the square root of the squared difference between predicted and actual
     * values, and it's averaged over all values. It is used in regression analysis to understand model prediction
     * error. It's an important metric to indicate the presence of large model errors and outliers. Values range from
     * zero (0) to infinity, with smaller numbers indicating a better model fit to the data. RMSE is dependent on scale,
     * and should not be used to compare datasets of different sizes.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * If you do not specify a metric explicitly, the default behavior is to automatically use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MSE</code>: for regression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>F1</code>: for binary classification
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Accuracy</code>: for multiclass classification.
     * </p>
     * </li>
     * </ul>
     * 
     * @return The name of the objective metric used to measure the predictive quality of a machine learning system.
     *         This metric is optimized during training to provide the best estimate for model parameter values from
     *         data.</p>
     *         <p>
     *         Here are the options:
     *         </p>
     *         <dl>
     *         <dt>Accuracy</dt>
     *         <dd>
     *         <p>
     *         The ratio of the number of correctly classified items to the total number of (correctly and incorrectly)
     *         classified items. It is used for both binary and multiclass classification. Accuracy measures how close
     *         the predicted class values are to the actual values. Values for accuracy metrics vary between zero (0)
     *         and one (1). A value of 1 indicates perfect accuracy, and 0 indicates perfect inaccuracy.
     *         </p>
     *         </dd>
     *         <dt>AUC</dt>
     *         <dd>
     *         <p>
     *         The area under the curve (AUC) metric is used to compare and evaluate binary classification by algorithms
     *         that return probabilities, such as logistic regression. To map the probabilities into classifications,
     *         these are compared against a threshold value.
     *         </p>
     *         <p>
     *         The relevant curve is the receiver operating characteristic curve (ROC curve). The ROC curve plots the
     *         true positive rate (TPR) of predictions (or recall) against the false positive rate (FPR) as a function
     *         of the threshold value, above which a prediction is considered positive. Increasing the threshold results
     *         in fewer false positives, but more false negatives.
     *         </p>
     *         <p>
     *         AUC is the area under this ROC curve. Therefore, AUC provides an aggregated measure of the model
     *         performance across all possible classification thresholds. AUC scores vary between 0 and 1. A score of 1
     *         indicates perfect accuracy, and a score of one half (0.5) indicates that the prediction is not better
     *         than a random classifier.
     *         </p>
     *         </dd>
     *         <dt>BalancedAccuracy</dt>
     *         <dd>
     *         <p>
     *         <code>BalancedAccuracy</code> is a metric that measures the ratio of accurate predictions to all
     *         predictions. This ratio is calculated after normalizing true positives (TP) and true negatives (TN) by
     *         the total number of positive (P) and negative (N) values. It is used in both binary and multiclass
     *         classification and is defined as follows: 0.5*((TP/P)+(TN/N)), with values ranging from 0 to 1.
     *         <code>BalancedAccuracy</code> gives a better measure of accuracy when the number of positives or
     *         negatives differ greatly from each other in an imbalanced dataset. For example, when only 1% of email is
     *         spam.
     *         </p>
     *         </dd>
     *         <dt>F1</dt>
     *         <dd>
     *         <p>
     *         The <code>F1</code> score is the harmonic mean of the precision and recall, defined as follows: F1 = 2 *
     *         (precision * recall) / (precision + recall). It is used for binary classification into classes
     *         traditionally referred to as positive and negative. Predictions are said to be true when they match their
     *         actual (correct) class, and false when they do not.
     *         </p>
     *         <p>
     *         Precision is the ratio of the true positive predictions to all positive predictions, and it includes the
     *         false positives in a dataset. Precision measures the quality of the prediction when it predicts the
     *         positive class.
     *         </p>
     *         <p>
     *         Recall (or sensitivity) is the ratio of the true positive predictions to all actual positive instances.
     *         Recall measures how completely a model predicts the actual class members in a dataset.
     *         </p>
     *         <p>
     *         F1 scores vary between 0 and 1. A score of 1 indicates the best possible performance, and 0 indicates the
     *         worst.
     *         </p>
     *         </dd>
     *         <dt>F1macro</dt>
     *         <dd>
     *         <p>
     *         The <code>F1macro</code> score applies F1 scoring to multiclass classification problems. It does this by
     *         calculating the precision and recall, and then taking their harmonic mean to calculate the F1 score for
     *         each class. Lastly, the F1macro averages the individual scores to obtain the <code>F1macro</code> score.
     *         <code>F1macro</code> scores vary between 0 and 1. A score of 1 indicates the best possible performance,
     *         and 0 indicates the worst.
     *         </p>
     *         </dd>
     *         <dt>MAE</dt>
     *         <dd>
     *         <p>
     *         The mean absolute error (MAE) is a measure of how different the predicted and actual values are, when
     *         they're averaged over all values. MAE is commonly used in regression analysis to understand model
     *         prediction error. If there is linear regression, MAE represents the average distance from a predicted
     *         line to the actual value. MAE is defined as the sum of absolute errors divided by the number of
     *         observations. Values range from 0 to infinity, with smaller numbers indicating a better model fit to the
     *         data.
     *         </p>
     *         </dd>
     *         <dt>MSE</dt>
     *         <dd>
     *         <p>
     *         The mean squared error (MSE) is the average of the squared differences between the predicted and actual
     *         values. It is used for regression. MSE values are always positive. The better a model is at predicting
     *         the actual values, the smaller the MSE value is
     *         </p>
     *         </dd>
     *         <dt>Precision</dt>
     *         <dd>
     *         <p>
     *         Precision measures how well an algorithm predicts the true positives (TP) out of all of the positives
     *         that it identifies. It is defined as follows: Precision = TP/(TP+FP), with values ranging from zero (0)
     *         to one (1), and is used in binary classification. Precision is an important metric when the cost of a
     *         false positive is high. For example, the cost of a false positive is very high if an airplane safety
     *         system is falsely deemed safe to fly. A false positive (FP) reflects a positive prediction that is
     *         actually negative in the data.
     *         </p>
     *         </dd>
     *         <dt>PrecisionMacro</dt>
     *         <dd>
     *         <p>
     *         The precision macro computes precision for multiclass classification problems. It does this by
     *         calculating precision for each class and averaging scores to obtain precision for several classes.
     *         <code>PrecisionMacro</code> scores range from zero (0) to one (1). Higher scores reflect the model's
     *         ability to predict true positives (TP) out of all of the positives that it identifies, averaged across
     *         multiple classes.
     *         </p>
     *         </dd>
     *         <dt>R2</dt>
     *         <dd>
     *         <p>
     *         R2, also known as the coefficient of determination, is used in regression to quantify how much a model
     *         can explain the variance of a dependent variable. Values range from one (1) to negative one (-1). Higher
     *         numbers indicate a higher fraction of explained variability. <code>R2</code> values close to zero (0)
     *         indicate that very little of the dependent variable can be explained by the model. Negative values
     *         indicate a poor fit and that the model is outperformed by a constant function. For linear regression,
     *         this is a horizontal line.
     *         </p>
     *         </dd>
     *         <dt>Recall</dt>
     *         <dd>
     *         <p>
     *         Recall measures how well an algorithm correctly predicts all of the true positives (TP) in a dataset. A
     *         true positive is a positive prediction that is also an actual positive value in the data. Recall is
     *         defined as follows: Recall = TP/(TP+FN), with values ranging from 0 to 1. Higher scores reflect a better
     *         ability of the model to predict true positives (TP) in the data, and is used in binary classification.
     *         </p>
     *         <p>
     *         Recall is important when testing for cancer because it's used to find all of the true positives. A false
     *         positive (FP) reflects a positive prediction that is actually negative in the data. It is often
     *         insufficient to measure only recall, because predicting every output as a true positive will yield a
     *         perfect recall score.
     *         </p>
     *         </dd>
     *         <dt>RecallMacro</dt>
     *         <dd>
     *         <p>
     *         The RecallMacro computes recall for multiclass classification problems by calculating recall for each
     *         class and averaging scores to obtain recall for several classes. RecallMacro scores range from 0 to 1.
     *         Higher scores reflect the model's ability to predict true positives (TP) in a dataset. Whereas, a true
     *         positive reflects a positive prediction that is also an actual positive value in the data. It is often
     *         insufficient to measure only recall, because predicting every output as a true positive will yield a
     *         perfect recall score.
     *         </p>
     *         </dd>
     *         <dt>RMSE</dt>
     *         <dd>
     *         <p>
     *         Root mean squared error (RMSE) measures the square root of the squared difference between predicted and
     *         actual values, and it's averaged over all values. It is used in regression analysis to understand model
     *         prediction error. It's an important metric to indicate the presence of large model errors and outliers.
     *         Values range from zero (0) to infinity, with smaller numbers indicating a better model fit to the data.
     *         RMSE is dependent on scale, and should not be used to compare datasets of different sizes.
     *         </p>
     *         </dd>
     *         </dl>
     *         <p>
     *         If you do not specify a metric explicitly, the default behavior is to automatically use:
     *         </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>MSE</code>: for regression.
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>F1</code>: for binary classification
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>Accuracy</code>: for multiclass classification.
     *         </p>
     *         </li>
     * @see AutoMLMetricEnum
     */

    public String getMetricName() {
        return this.metricName;
    }

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. This metric
     * is optimized during training to provide the best estimate for model parameter values from data.
     * </p>
     * <p>
     * Here are the options:
     * </p>
     * <dl>
     * <dt>Accuracy</dt>
     * <dd>
     * <p>
     * The ratio of the number of correctly classified items to the total number of (correctly and incorrectly)
     * classified items. It is used for both binary and multiclass classification. Accuracy measures how close the
     * predicted class values are to the actual values. Values for accuracy metrics vary between zero (0) and one (1). A
     * value of 1 indicates perfect accuracy, and 0 indicates perfect inaccuracy.
     * </p>
     * </dd>
     * <dt>AUC</dt>
     * <dd>
     * <p>
     * The area under the curve (AUC) metric is used to compare and evaluate binary classification by algorithms that
     * return probabilities, such as logistic regression. To map the probabilities into classifications, these are
     * compared against a threshold value.
     * </p>
     * <p>
     * The relevant curve is the receiver operating characteristic curve (ROC curve). The ROC curve plots the true
     * positive rate (TPR) of predictions (or recall) against the false positive rate (FPR) as a function of the
     * threshold value, above which a prediction is considered positive. Increasing the threshold results in fewer false
     * positives, but more false negatives.
     * </p>
     * <p>
     * AUC is the area under this ROC curve. Therefore, AUC provides an aggregated measure of the model performance
     * across all possible classification thresholds. AUC scores vary between 0 and 1. A score of 1 indicates perfect
     * accuracy, and a score of one half (0.5) indicates that the prediction is not better than a random classifier.
     * </p>
     * </dd>
     * <dt>BalancedAccuracy</dt>
     * <dd>
     * <p>
     * <code>BalancedAccuracy</code> is a metric that measures the ratio of accurate predictions to all predictions.
     * This ratio is calculated after normalizing true positives (TP) and true negatives (TN) by the total number of
     * positive (P) and negative (N) values. It is used in both binary and multiclass classification and is defined as
     * follows: 0.5*((TP/P)+(TN/N)), with values ranging from 0 to 1. <code>BalancedAccuracy</code> gives a better
     * measure of accuracy when the number of positives or negatives differ greatly from each other in an imbalanced
     * dataset. For example, when only 1% of email is spam.
     * </p>
     * </dd>
     * <dt>F1</dt>
     * <dd>
     * <p>
     * The <code>F1</code> score is the harmonic mean of the precision and recall, defined as follows: F1 = 2 *
     * (precision * recall) / (precision + recall). It is used for binary classification into classes traditionally
     * referred to as positive and negative. Predictions are said to be true when they match their actual (correct)
     * class, and false when they do not.
     * </p>
     * <p>
     * Precision is the ratio of the true positive predictions to all positive predictions, and it includes the false
     * positives in a dataset. Precision measures the quality of the prediction when it predicts the positive class.
     * </p>
     * <p>
     * Recall (or sensitivity) is the ratio of the true positive predictions to all actual positive instances. Recall
     * measures how completely a model predicts the actual class members in a dataset.
     * </p>
     * <p>
     * F1 scores vary between 0 and 1. A score of 1 indicates the best possible performance, and 0 indicates the worst.
     * </p>
     * </dd>
     * <dt>F1macro</dt>
     * <dd>
     * <p>
     * The <code>F1macro</code> score applies F1 scoring to multiclass classification problems. It does this by
     * calculating the precision and recall, and then taking their harmonic mean to calculate the F1 score for each
     * class. Lastly, the F1macro averages the individual scores to obtain the <code>F1macro</code> score.
     * <code>F1macro</code> scores vary between 0 and 1. A score of 1 indicates the best possible performance, and 0
     * indicates the worst.
     * </p>
     * </dd>
     * <dt>MAE</dt>
     * <dd>
     * <p>
     * The mean absolute error (MAE) is a measure of how different the predicted and actual values are, when they're
     * averaged over all values. MAE is commonly used in regression analysis to understand model prediction error. If
     * there is linear regression, MAE represents the average distance from a predicted line to the actual value. MAE is
     * defined as the sum of absolute errors divided by the number of observations. Values range from 0 to infinity,
     * with smaller numbers indicating a better model fit to the data.
     * </p>
     * </dd>
     * <dt>MSE</dt>
     * <dd>
     * <p>
     * The mean squared error (MSE) is the average of the squared differences between the predicted and actual values.
     * It is used for regression. MSE values are always positive. The better a model is at predicting the actual values,
     * the smaller the MSE value is
     * </p>
     * </dd>
     * <dt>Precision</dt>
     * <dd>
     * <p>
     * Precision measures how well an algorithm predicts the true positives (TP) out of all of the positives that it
     * identifies. It is defined as follows: Precision = TP/(TP+FP), with values ranging from zero (0) to one (1), and
     * is used in binary classification. Precision is an important metric when the cost of a false positive is high. For
     * example, the cost of a false positive is very high if an airplane safety system is falsely deemed safe to fly. A
     * false positive (FP) reflects a positive prediction that is actually negative in the data.
     * </p>
     * </dd>
     * <dt>PrecisionMacro</dt>
     * <dd>
     * <p>
     * The precision macro computes precision for multiclass classification problems. It does this by calculating
     * precision for each class and averaging scores to obtain precision for several classes.
     * <code>PrecisionMacro</code> scores range from zero (0) to one (1). Higher scores reflect the model's ability to
     * predict true positives (TP) out of all of the positives that it identifies, averaged across multiple classes.
     * </p>
     * </dd>
     * <dt>R2</dt>
     * <dd>
     * <p>
     * R2, also known as the coefficient of determination, is used in regression to quantify how much a model can
     * explain the variance of a dependent variable. Values range from one (1) to negative one (-1). Higher numbers
     * indicate a higher fraction of explained variability. <code>R2</code> values close to zero (0) indicate that very
     * little of the dependent variable can be explained by the model. Negative values indicate a poor fit and that the
     * model is outperformed by a constant function. For linear regression, this is a horizontal line.
     * </p>
     * </dd>
     * <dt>Recall</dt>
     * <dd>
     * <p>
     * Recall measures how well an algorithm correctly predicts all of the true positives (TP) in a dataset. A true
     * positive is a positive prediction that is also an actual positive value in the data. Recall is defined as
     * follows: Recall = TP/(TP+FN), with values ranging from 0 to 1. Higher scores reflect a better ability of the
     * model to predict true positives (TP) in the data, and is used in binary classification.
     * </p>
     * <p>
     * Recall is important when testing for cancer because it's used to find all of the true positives. A false positive
     * (FP) reflects a positive prediction that is actually negative in the data. It is often insufficient to measure
     * only recall, because predicting every output as a true positive will yield a perfect recall score.
     * </p>
     * </dd>
     * <dt>RecallMacro</dt>
     * <dd>
     * <p>
     * The RecallMacro computes recall for multiclass classification problems by calculating recall for each class and
     * averaging scores to obtain recall for several classes. RecallMacro scores range from 0 to 1. Higher scores
     * reflect the model's ability to predict true positives (TP) in a dataset. Whereas, a true positive reflects a
     * positive prediction that is also an actual positive value in the data. It is often insufficient to measure only
     * recall, because predicting every output as a true positive will yield a perfect recall score.
     * </p>
     * </dd>
     * <dt>RMSE</dt>
     * <dd>
     * <p>
     * Root mean squared error (RMSE) measures the square root of the squared difference between predicted and actual
     * values, and it's averaged over all values. It is used in regression analysis to understand model prediction
     * error. It's an important metric to indicate the presence of large model errors and outliers. Values range from
     * zero (0) to infinity, with smaller numbers indicating a better model fit to the data. RMSE is dependent on scale,
     * and should not be used to compare datasets of different sizes.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * If you do not specify a metric explicitly, the default behavior is to automatically use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MSE</code>: for regression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>F1</code>: for binary classification
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Accuracy</code>: for multiclass classification.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The name of the objective metric used to measure the predictive quality of a machine learning system. This
     *        metric is optimized during training to provide the best estimate for model parameter values from data.</p>
     *        <p>
     *        Here are the options:
     *        </p>
     *        <dl>
     *        <dt>Accuracy</dt>
     *        <dd>
     *        <p>
     *        The ratio of the number of correctly classified items to the total number of (correctly and incorrectly)
     *        classified items. It is used for both binary and multiclass classification. Accuracy measures how close
     *        the predicted class values are to the actual values. Values for accuracy metrics vary between zero (0) and
     *        one (1). A value of 1 indicates perfect accuracy, and 0 indicates perfect inaccuracy.
     *        </p>
     *        </dd>
     *        <dt>AUC</dt>
     *        <dd>
     *        <p>
     *        The area under the curve (AUC) metric is used to compare and evaluate binary classification by algorithms
     *        that return probabilities, such as logistic regression. To map the probabilities into classifications,
     *        these are compared against a threshold value.
     *        </p>
     *        <p>
     *        The relevant curve is the receiver operating characteristic curve (ROC curve). The ROC curve plots the
     *        true positive rate (TPR) of predictions (or recall) against the false positive rate (FPR) as a function of
     *        the threshold value, above which a prediction is considered positive. Increasing the threshold results in
     *        fewer false positives, but more false negatives.
     *        </p>
     *        <p>
     *        AUC is the area under this ROC curve. Therefore, AUC provides an aggregated measure of the model
     *        performance across all possible classification thresholds. AUC scores vary between 0 and 1. A score of 1
     *        indicates perfect accuracy, and a score of one half (0.5) indicates that the prediction is not better than
     *        a random classifier.
     *        </p>
     *        </dd>
     *        <dt>BalancedAccuracy</dt>
     *        <dd>
     *        <p>
     *        <code>BalancedAccuracy</code> is a metric that measures the ratio of accurate predictions to all
     *        predictions. This ratio is calculated after normalizing true positives (TP) and true negatives (TN) by the
     *        total number of positive (P) and negative (N) values. It is used in both binary and multiclass
     *        classification and is defined as follows: 0.5*((TP/P)+(TN/N)), with values ranging from 0 to 1.
     *        <code>BalancedAccuracy</code> gives a better measure of accuracy when the number of positives or negatives
     *        differ greatly from each other in an imbalanced dataset. For example, when only 1% of email is spam.
     *        </p>
     *        </dd>
     *        <dt>F1</dt>
     *        <dd>
     *        <p>
     *        The <code>F1</code> score is the harmonic mean of the precision and recall, defined as follows: F1 = 2 *
     *        (precision * recall) / (precision + recall). It is used for binary classification into classes
     *        traditionally referred to as positive and negative. Predictions are said to be true when they match their
     *        actual (correct) class, and false when they do not.
     *        </p>
     *        <p>
     *        Precision is the ratio of the true positive predictions to all positive predictions, and it includes the
     *        false positives in a dataset. Precision measures the quality of the prediction when it predicts the
     *        positive class.
     *        </p>
     *        <p>
     *        Recall (or sensitivity) is the ratio of the true positive predictions to all actual positive instances.
     *        Recall measures how completely a model predicts the actual class members in a dataset.
     *        </p>
     *        <p>
     *        F1 scores vary between 0 and 1. A score of 1 indicates the best possible performance, and 0 indicates the
     *        worst.
     *        </p>
     *        </dd>
     *        <dt>F1macro</dt>
     *        <dd>
     *        <p>
     *        The <code>F1macro</code> score applies F1 scoring to multiclass classification problems. It does this by
     *        calculating the precision and recall, and then taking their harmonic mean to calculate the F1 score for
     *        each class. Lastly, the F1macro averages the individual scores to obtain the <code>F1macro</code> score.
     *        <code>F1macro</code> scores vary between 0 and 1. A score of 1 indicates the best possible performance,
     *        and 0 indicates the worst.
     *        </p>
     *        </dd>
     *        <dt>MAE</dt>
     *        <dd>
     *        <p>
     *        The mean absolute error (MAE) is a measure of how different the predicted and actual values are, when
     *        they're averaged over all values. MAE is commonly used in regression analysis to understand model
     *        prediction error. If there is linear regression, MAE represents the average distance from a predicted line
     *        to the actual value. MAE is defined as the sum of absolute errors divided by the number of observations.
     *        Values range from 0 to infinity, with smaller numbers indicating a better model fit to the data.
     *        </p>
     *        </dd>
     *        <dt>MSE</dt>
     *        <dd>
     *        <p>
     *        The mean squared error (MSE) is the average of the squared differences between the predicted and actual
     *        values. It is used for regression. MSE values are always positive. The better a model is at predicting the
     *        actual values, the smaller the MSE value is
     *        </p>
     *        </dd>
     *        <dt>Precision</dt>
     *        <dd>
     *        <p>
     *        Precision measures how well an algorithm predicts the true positives (TP) out of all of the positives that
     *        it identifies. It is defined as follows: Precision = TP/(TP+FP), with values ranging from zero (0) to one
     *        (1), and is used in binary classification. Precision is an important metric when the cost of a false
     *        positive is high. For example, the cost of a false positive is very high if an airplane safety system is
     *        falsely deemed safe to fly. A false positive (FP) reflects a positive prediction that is actually negative
     *        in the data.
     *        </p>
     *        </dd>
     *        <dt>PrecisionMacro</dt>
     *        <dd>
     *        <p>
     *        The precision macro computes precision for multiclass classification problems. It does this by calculating
     *        precision for each class and averaging scores to obtain precision for several classes.
     *        <code>PrecisionMacro</code> scores range from zero (0) to one (1). Higher scores reflect the model's
     *        ability to predict true positives (TP) out of all of the positives that it identifies, averaged across
     *        multiple classes.
     *        </p>
     *        </dd>
     *        <dt>R2</dt>
     *        <dd>
     *        <p>
     *        R2, also known as the coefficient of determination, is used in regression to quantify how much a model can
     *        explain the variance of a dependent variable. Values range from one (1) to negative one (-1). Higher
     *        numbers indicate a higher fraction of explained variability. <code>R2</code> values close to zero (0)
     *        indicate that very little of the dependent variable can be explained by the model. Negative values
     *        indicate a poor fit and that the model is outperformed by a constant function. For linear regression, this
     *        is a horizontal line.
     *        </p>
     *        </dd>
     *        <dt>Recall</dt>
     *        <dd>
     *        <p>
     *        Recall measures how well an algorithm correctly predicts all of the true positives (TP) in a dataset. A
     *        true positive is a positive prediction that is also an actual positive value in the data. Recall is
     *        defined as follows: Recall = TP/(TP+FN), with values ranging from 0 to 1. Higher scores reflect a better
     *        ability of the model to predict true positives (TP) in the data, and is used in binary classification.
     *        </p>
     *        <p>
     *        Recall is important when testing for cancer because it's used to find all of the true positives. A false
     *        positive (FP) reflects a positive prediction that is actually negative in the data. It is often
     *        insufficient to measure only recall, because predicting every output as a true positive will yield a
     *        perfect recall score.
     *        </p>
     *        </dd>
     *        <dt>RecallMacro</dt>
     *        <dd>
     *        <p>
     *        The RecallMacro computes recall for multiclass classification problems by calculating recall for each
     *        class and averaging scores to obtain recall for several classes. RecallMacro scores range from 0 to 1.
     *        Higher scores reflect the model's ability to predict true positives (TP) in a dataset. Whereas, a true
     *        positive reflects a positive prediction that is also an actual positive value in the data. It is often
     *        insufficient to measure only recall, because predicting every output as a true positive will yield a
     *        perfect recall score.
     *        </p>
     *        </dd>
     *        <dt>RMSE</dt>
     *        <dd>
     *        <p>
     *        Root mean squared error (RMSE) measures the square root of the squared difference between predicted and
     *        actual values, and it's averaged over all values. It is used in regression analysis to understand model
     *        prediction error. It's an important metric to indicate the presence of large model errors and outliers.
     *        Values range from zero (0) to infinity, with smaller numbers indicating a better model fit to the data.
     *        RMSE is dependent on scale, and should not be used to compare datasets of different sizes.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        If you do not specify a metric explicitly, the default behavior is to automatically use:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MSE</code>: for regression.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>F1</code>: for binary classification
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Accuracy</code>: for multiclass classification.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLMetricEnum
     */

    public AutoMLJobObjective withMetricName(String metricName) {
        setMetricName(metricName);
        return this;
    }

    /**
     * <p>
     * The name of the objective metric used to measure the predictive quality of a machine learning system. This metric
     * is optimized during training to provide the best estimate for model parameter values from data.
     * </p>
     * <p>
     * Here are the options:
     * </p>
     * <dl>
     * <dt>Accuracy</dt>
     * <dd>
     * <p>
     * The ratio of the number of correctly classified items to the total number of (correctly and incorrectly)
     * classified items. It is used for both binary and multiclass classification. Accuracy measures how close the
     * predicted class values are to the actual values. Values for accuracy metrics vary between zero (0) and one (1). A
     * value of 1 indicates perfect accuracy, and 0 indicates perfect inaccuracy.
     * </p>
     * </dd>
     * <dt>AUC</dt>
     * <dd>
     * <p>
     * The area under the curve (AUC) metric is used to compare and evaluate binary classification by algorithms that
     * return probabilities, such as logistic regression. To map the probabilities into classifications, these are
     * compared against a threshold value.
     * </p>
     * <p>
     * The relevant curve is the receiver operating characteristic curve (ROC curve). The ROC curve plots the true
     * positive rate (TPR) of predictions (or recall) against the false positive rate (FPR) as a function of the
     * threshold value, above which a prediction is considered positive. Increasing the threshold results in fewer false
     * positives, but more false negatives.
     * </p>
     * <p>
     * AUC is the area under this ROC curve. Therefore, AUC provides an aggregated measure of the model performance
     * across all possible classification thresholds. AUC scores vary between 0 and 1. A score of 1 indicates perfect
     * accuracy, and a score of one half (0.5) indicates that the prediction is not better than a random classifier.
     * </p>
     * </dd>
     * <dt>BalancedAccuracy</dt>
     * <dd>
     * <p>
     * <code>BalancedAccuracy</code> is a metric that measures the ratio of accurate predictions to all predictions.
     * This ratio is calculated after normalizing true positives (TP) and true negatives (TN) by the total number of
     * positive (P) and negative (N) values. It is used in both binary and multiclass classification and is defined as
     * follows: 0.5*((TP/P)+(TN/N)), with values ranging from 0 to 1. <code>BalancedAccuracy</code> gives a better
     * measure of accuracy when the number of positives or negatives differ greatly from each other in an imbalanced
     * dataset. For example, when only 1% of email is spam.
     * </p>
     * </dd>
     * <dt>F1</dt>
     * <dd>
     * <p>
     * The <code>F1</code> score is the harmonic mean of the precision and recall, defined as follows: F1 = 2 *
     * (precision * recall) / (precision + recall). It is used for binary classification into classes traditionally
     * referred to as positive and negative. Predictions are said to be true when they match their actual (correct)
     * class, and false when they do not.
     * </p>
     * <p>
     * Precision is the ratio of the true positive predictions to all positive predictions, and it includes the false
     * positives in a dataset. Precision measures the quality of the prediction when it predicts the positive class.
     * </p>
     * <p>
     * Recall (or sensitivity) is the ratio of the true positive predictions to all actual positive instances. Recall
     * measures how completely a model predicts the actual class members in a dataset.
     * </p>
     * <p>
     * F1 scores vary between 0 and 1. A score of 1 indicates the best possible performance, and 0 indicates the worst.
     * </p>
     * </dd>
     * <dt>F1macro</dt>
     * <dd>
     * <p>
     * The <code>F1macro</code> score applies F1 scoring to multiclass classification problems. It does this by
     * calculating the precision and recall, and then taking their harmonic mean to calculate the F1 score for each
     * class. Lastly, the F1macro averages the individual scores to obtain the <code>F1macro</code> score.
     * <code>F1macro</code> scores vary between 0 and 1. A score of 1 indicates the best possible performance, and 0
     * indicates the worst.
     * </p>
     * </dd>
     * <dt>MAE</dt>
     * <dd>
     * <p>
     * The mean absolute error (MAE) is a measure of how different the predicted and actual values are, when they're
     * averaged over all values. MAE is commonly used in regression analysis to understand model prediction error. If
     * there is linear regression, MAE represents the average distance from a predicted line to the actual value. MAE is
     * defined as the sum of absolute errors divided by the number of observations. Values range from 0 to infinity,
     * with smaller numbers indicating a better model fit to the data.
     * </p>
     * </dd>
     * <dt>MSE</dt>
     * <dd>
     * <p>
     * The mean squared error (MSE) is the average of the squared differences between the predicted and actual values.
     * It is used for regression. MSE values are always positive. The better a model is at predicting the actual values,
     * the smaller the MSE value is
     * </p>
     * </dd>
     * <dt>Precision</dt>
     * <dd>
     * <p>
     * Precision measures how well an algorithm predicts the true positives (TP) out of all of the positives that it
     * identifies. It is defined as follows: Precision = TP/(TP+FP), with values ranging from zero (0) to one (1), and
     * is used in binary classification. Precision is an important metric when the cost of a false positive is high. For
     * example, the cost of a false positive is very high if an airplane safety system is falsely deemed safe to fly. A
     * false positive (FP) reflects a positive prediction that is actually negative in the data.
     * </p>
     * </dd>
     * <dt>PrecisionMacro</dt>
     * <dd>
     * <p>
     * The precision macro computes precision for multiclass classification problems. It does this by calculating
     * precision for each class and averaging scores to obtain precision for several classes.
     * <code>PrecisionMacro</code> scores range from zero (0) to one (1). Higher scores reflect the model's ability to
     * predict true positives (TP) out of all of the positives that it identifies, averaged across multiple classes.
     * </p>
     * </dd>
     * <dt>R2</dt>
     * <dd>
     * <p>
     * R2, also known as the coefficient of determination, is used in regression to quantify how much a model can
     * explain the variance of a dependent variable. Values range from one (1) to negative one (-1). Higher numbers
     * indicate a higher fraction of explained variability. <code>R2</code> values close to zero (0) indicate that very
     * little of the dependent variable can be explained by the model. Negative values indicate a poor fit and that the
     * model is outperformed by a constant function. For linear regression, this is a horizontal line.
     * </p>
     * </dd>
     * <dt>Recall</dt>
     * <dd>
     * <p>
     * Recall measures how well an algorithm correctly predicts all of the true positives (TP) in a dataset. A true
     * positive is a positive prediction that is also an actual positive value in the data. Recall is defined as
     * follows: Recall = TP/(TP+FN), with values ranging from 0 to 1. Higher scores reflect a better ability of the
     * model to predict true positives (TP) in the data, and is used in binary classification.
     * </p>
     * <p>
     * Recall is important when testing for cancer because it's used to find all of the true positives. A false positive
     * (FP) reflects a positive prediction that is actually negative in the data. It is often insufficient to measure
     * only recall, because predicting every output as a true positive will yield a perfect recall score.
     * </p>
     * </dd>
     * <dt>RecallMacro</dt>
     * <dd>
     * <p>
     * The RecallMacro computes recall for multiclass classification problems by calculating recall for each class and
     * averaging scores to obtain recall for several classes. RecallMacro scores range from 0 to 1. Higher scores
     * reflect the model's ability to predict true positives (TP) in a dataset. Whereas, a true positive reflects a
     * positive prediction that is also an actual positive value in the data. It is often insufficient to measure only
     * recall, because predicting every output as a true positive will yield a perfect recall score.
     * </p>
     * </dd>
     * <dt>RMSE</dt>
     * <dd>
     * <p>
     * Root mean squared error (RMSE) measures the square root of the squared difference between predicted and actual
     * values, and it's averaged over all values. It is used in regression analysis to understand model prediction
     * error. It's an important metric to indicate the presence of large model errors and outliers. Values range from
     * zero (0) to infinity, with smaller numbers indicating a better model fit to the data. RMSE is dependent on scale,
     * and should not be used to compare datasets of different sizes.
     * </p>
     * </dd>
     * </dl>
     * <p>
     * If you do not specify a metric explicitly, the default behavior is to automatically use:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>MSE</code>: for regression.
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>F1</code>: for binary classification
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>Accuracy</code>: for multiclass classification.
     * </p>
     * </li>
     * </ul>
     * 
     * @param metricName
     *        The name of the objective metric used to measure the predictive quality of a machine learning system. This
     *        metric is optimized during training to provide the best estimate for model parameter values from data.</p>
     *        <p>
     *        Here are the options:
     *        </p>
     *        <dl>
     *        <dt>Accuracy</dt>
     *        <dd>
     *        <p>
     *        The ratio of the number of correctly classified items to the total number of (correctly and incorrectly)
     *        classified items. It is used for both binary and multiclass classification. Accuracy measures how close
     *        the predicted class values are to the actual values. Values for accuracy metrics vary between zero (0) and
     *        one (1). A value of 1 indicates perfect accuracy, and 0 indicates perfect inaccuracy.
     *        </p>
     *        </dd>
     *        <dt>AUC</dt>
     *        <dd>
     *        <p>
     *        The area under the curve (AUC) metric is used to compare and evaluate binary classification by algorithms
     *        that return probabilities, such as logistic regression. To map the probabilities into classifications,
     *        these are compared against a threshold value.
     *        </p>
     *        <p>
     *        The relevant curve is the receiver operating characteristic curve (ROC curve). The ROC curve plots the
     *        true positive rate (TPR) of predictions (or recall) against the false positive rate (FPR) as a function of
     *        the threshold value, above which a prediction is considered positive. Increasing the threshold results in
     *        fewer false positives, but more false negatives.
     *        </p>
     *        <p>
     *        AUC is the area under this ROC curve. Therefore, AUC provides an aggregated measure of the model
     *        performance across all possible classification thresholds. AUC scores vary between 0 and 1. A score of 1
     *        indicates perfect accuracy, and a score of one half (0.5) indicates that the prediction is not better than
     *        a random classifier.
     *        </p>
     *        </dd>
     *        <dt>BalancedAccuracy</dt>
     *        <dd>
     *        <p>
     *        <code>BalancedAccuracy</code> is a metric that measures the ratio of accurate predictions to all
     *        predictions. This ratio is calculated after normalizing true positives (TP) and true negatives (TN) by the
     *        total number of positive (P) and negative (N) values. It is used in both binary and multiclass
     *        classification and is defined as follows: 0.5*((TP/P)+(TN/N)), with values ranging from 0 to 1.
     *        <code>BalancedAccuracy</code> gives a better measure of accuracy when the number of positives or negatives
     *        differ greatly from each other in an imbalanced dataset. For example, when only 1% of email is spam.
     *        </p>
     *        </dd>
     *        <dt>F1</dt>
     *        <dd>
     *        <p>
     *        The <code>F1</code> score is the harmonic mean of the precision and recall, defined as follows: F1 = 2 *
     *        (precision * recall) / (precision + recall). It is used for binary classification into classes
     *        traditionally referred to as positive and negative. Predictions are said to be true when they match their
     *        actual (correct) class, and false when they do not.
     *        </p>
     *        <p>
     *        Precision is the ratio of the true positive predictions to all positive predictions, and it includes the
     *        false positives in a dataset. Precision measures the quality of the prediction when it predicts the
     *        positive class.
     *        </p>
     *        <p>
     *        Recall (or sensitivity) is the ratio of the true positive predictions to all actual positive instances.
     *        Recall measures how completely a model predicts the actual class members in a dataset.
     *        </p>
     *        <p>
     *        F1 scores vary between 0 and 1. A score of 1 indicates the best possible performance, and 0 indicates the
     *        worst.
     *        </p>
     *        </dd>
     *        <dt>F1macro</dt>
     *        <dd>
     *        <p>
     *        The <code>F1macro</code> score applies F1 scoring to multiclass classification problems. It does this by
     *        calculating the precision and recall, and then taking their harmonic mean to calculate the F1 score for
     *        each class. Lastly, the F1macro averages the individual scores to obtain the <code>F1macro</code> score.
     *        <code>F1macro</code> scores vary between 0 and 1. A score of 1 indicates the best possible performance,
     *        and 0 indicates the worst.
     *        </p>
     *        </dd>
     *        <dt>MAE</dt>
     *        <dd>
     *        <p>
     *        The mean absolute error (MAE) is a measure of how different the predicted and actual values are, when
     *        they're averaged over all values. MAE is commonly used in regression analysis to understand model
     *        prediction error. If there is linear regression, MAE represents the average distance from a predicted line
     *        to the actual value. MAE is defined as the sum of absolute errors divided by the number of observations.
     *        Values range from 0 to infinity, with smaller numbers indicating a better model fit to the data.
     *        </p>
     *        </dd>
     *        <dt>MSE</dt>
     *        <dd>
     *        <p>
     *        The mean squared error (MSE) is the average of the squared differences between the predicted and actual
     *        values. It is used for regression. MSE values are always positive. The better a model is at predicting the
     *        actual values, the smaller the MSE value is
     *        </p>
     *        </dd>
     *        <dt>Precision</dt>
     *        <dd>
     *        <p>
     *        Precision measures how well an algorithm predicts the true positives (TP) out of all of the positives that
     *        it identifies. It is defined as follows: Precision = TP/(TP+FP), with values ranging from zero (0) to one
     *        (1), and is used in binary classification. Precision is an important metric when the cost of a false
     *        positive is high. For example, the cost of a false positive is very high if an airplane safety system is
     *        falsely deemed safe to fly. A false positive (FP) reflects a positive prediction that is actually negative
     *        in the data.
     *        </p>
     *        </dd>
     *        <dt>PrecisionMacro</dt>
     *        <dd>
     *        <p>
     *        The precision macro computes precision for multiclass classification problems. It does this by calculating
     *        precision for each class and averaging scores to obtain precision for several classes.
     *        <code>PrecisionMacro</code> scores range from zero (0) to one (1). Higher scores reflect the model's
     *        ability to predict true positives (TP) out of all of the positives that it identifies, averaged across
     *        multiple classes.
     *        </p>
     *        </dd>
     *        <dt>R2</dt>
     *        <dd>
     *        <p>
     *        R2, also known as the coefficient of determination, is used in regression to quantify how much a model can
     *        explain the variance of a dependent variable. Values range from one (1) to negative one (-1). Higher
     *        numbers indicate a higher fraction of explained variability. <code>R2</code> values close to zero (0)
     *        indicate that very little of the dependent variable can be explained by the model. Negative values
     *        indicate a poor fit and that the model is outperformed by a constant function. For linear regression, this
     *        is a horizontal line.
     *        </p>
     *        </dd>
     *        <dt>Recall</dt>
     *        <dd>
     *        <p>
     *        Recall measures how well an algorithm correctly predicts all of the true positives (TP) in a dataset. A
     *        true positive is a positive prediction that is also an actual positive value in the data. Recall is
     *        defined as follows: Recall = TP/(TP+FN), with values ranging from 0 to 1. Higher scores reflect a better
     *        ability of the model to predict true positives (TP) in the data, and is used in binary classification.
     *        </p>
     *        <p>
     *        Recall is important when testing for cancer because it's used to find all of the true positives. A false
     *        positive (FP) reflects a positive prediction that is actually negative in the data. It is often
     *        insufficient to measure only recall, because predicting every output as a true positive will yield a
     *        perfect recall score.
     *        </p>
     *        </dd>
     *        <dt>RecallMacro</dt>
     *        <dd>
     *        <p>
     *        The RecallMacro computes recall for multiclass classification problems by calculating recall for each
     *        class and averaging scores to obtain recall for several classes. RecallMacro scores range from 0 to 1.
     *        Higher scores reflect the model's ability to predict true positives (TP) in a dataset. Whereas, a true
     *        positive reflects a positive prediction that is also an actual positive value in the data. It is often
     *        insufficient to measure only recall, because predicting every output as a true positive will yield a
     *        perfect recall score.
     *        </p>
     *        </dd>
     *        <dt>RMSE</dt>
     *        <dd>
     *        <p>
     *        Root mean squared error (RMSE) measures the square root of the squared difference between predicted and
     *        actual values, and it's averaged over all values. It is used in regression analysis to understand model
     *        prediction error. It's an important metric to indicate the presence of large model errors and outliers.
     *        Values range from zero (0) to infinity, with smaller numbers indicating a better model fit to the data.
     *        RMSE is dependent on scale, and should not be used to compare datasets of different sizes.
     *        </p>
     *        </dd>
     *        </dl>
     *        <p>
     *        If you do not specify a metric explicitly, the default behavior is to automatically use:
     *        </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>MSE</code>: for regression.
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>F1</code>: for binary classification
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>Accuracy</code>: for multiclass classification.
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLMetricEnum
     */

    public AutoMLJobObjective withMetricName(AutoMLMetricEnum metricName) {
        this.metricName = metricName.toString();
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
            sb.append("MetricName: ").append(getMetricName());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLJobObjective == false)
            return false;
        AutoMLJobObjective other = (AutoMLJobObjective) obj;
        if (other.getMetricName() == null ^ this.getMetricName() == null)
            return false;
        if (other.getMetricName() != null && other.getMetricName().equals(this.getMetricName()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getMetricName() == null) ? 0 : getMetricName().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLJobObjective clone() {
        try {
            return (AutoMLJobObjective) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLJobObjectiveMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
