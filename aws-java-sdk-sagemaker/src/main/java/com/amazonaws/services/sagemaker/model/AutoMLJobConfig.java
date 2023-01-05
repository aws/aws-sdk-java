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
 * A collection of settings used for an AutoML job.
 * </p>
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/sagemaker-2017-07-24/AutoMLJobConfig" target="_top">AWS API
 *      Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class AutoMLJobConfig implements Serializable, Cloneable, StructuredPojo {

    /**
     * <p>
     * How long an AutoML job is allowed to run, or how many candidates a job is allowed to generate.
     * </p>
     */
    private AutoMLJobCompletionCriteria completionCriteria;
    /**
     * <p>
     * The security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     */
    private AutoMLSecurityConfig securityConfig;
    /**
     * <p>
     * The configuration for splitting the input training dataset.
     * </p>
     * <p>
     * Type: AutoMLDataSplitConfig
     * </p>
     */
    private AutoMLDataSplitConfig dataSplitConfig;
    /**
     * <p>
     * The configuration for generating a candidate for an AutoML job (optional).
     * </p>
     */
    private AutoMLCandidateGenerationConfig candidateGenerationConfig;
    /**
     * <p>
     * The method that Autopilot uses to train the data. You can either specify the mode manually or let Autopilot
     * choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code> mode, Autopilot
     * chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and <code>HYPERPARAMETER_TUNING</code> for
     * larger ones.
     * </p>
     * <p>
     * The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and regression tasks
     * directly from your dataset. This machine learning mode combines several base models to produce an optimal
     * predictive model. It then uses a stacking ensemble method to combine predictions from contributing members. A
     * multi-stack ensemble model can provide better performance over a single model by combining the predictive
     * capabilities of multiple models. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     * </p>
     * <p>
     * The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version of a
     * model. HPO will automatically select an algorithm for the type of problem you want to solve. Then HPO finds the
     * best hyperparameters according to your objective metric. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code> mode.
     * </p>
     */
    private String mode;

    /**
     * <p>
     * How long an AutoML job is allowed to run, or how many candidates a job is allowed to generate.
     * </p>
     * 
     * @param completionCriteria
     *        How long an AutoML job is allowed to run, or how many candidates a job is allowed to generate.
     */

    public void setCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        this.completionCriteria = completionCriteria;
    }

    /**
     * <p>
     * How long an AutoML job is allowed to run, or how many candidates a job is allowed to generate.
     * </p>
     * 
     * @return How long an AutoML job is allowed to run, or how many candidates a job is allowed to generate.
     */

    public AutoMLJobCompletionCriteria getCompletionCriteria() {
        return this.completionCriteria;
    }

    /**
     * <p>
     * How long an AutoML job is allowed to run, or how many candidates a job is allowed to generate.
     * </p>
     * 
     * @param completionCriteria
     *        How long an AutoML job is allowed to run, or how many candidates a job is allowed to generate.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobConfig withCompletionCriteria(AutoMLJobCompletionCriteria completionCriteria) {
        setCompletionCriteria(completionCriteria);
        return this;
    }

    /**
     * <p>
     * The security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     * 
     * @param securityConfig
     *        The security configuration for traffic encryption or Amazon VPC settings.
     */

    public void setSecurityConfig(AutoMLSecurityConfig securityConfig) {
        this.securityConfig = securityConfig;
    }

    /**
     * <p>
     * The security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     * 
     * @return The security configuration for traffic encryption or Amazon VPC settings.
     */

    public AutoMLSecurityConfig getSecurityConfig() {
        return this.securityConfig;
    }

    /**
     * <p>
     * The security configuration for traffic encryption or Amazon VPC settings.
     * </p>
     * 
     * @param securityConfig
     *        The security configuration for traffic encryption or Amazon VPC settings.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobConfig withSecurityConfig(AutoMLSecurityConfig securityConfig) {
        setSecurityConfig(securityConfig);
        return this;
    }

    /**
     * <p>
     * The configuration for splitting the input training dataset.
     * </p>
     * <p>
     * Type: AutoMLDataSplitConfig
     * </p>
     * 
     * @param dataSplitConfig
     *        The configuration for splitting the input training dataset.</p>
     *        <p>
     *        Type: AutoMLDataSplitConfig
     */

    public void setDataSplitConfig(AutoMLDataSplitConfig dataSplitConfig) {
        this.dataSplitConfig = dataSplitConfig;
    }

    /**
     * <p>
     * The configuration for splitting the input training dataset.
     * </p>
     * <p>
     * Type: AutoMLDataSplitConfig
     * </p>
     * 
     * @return The configuration for splitting the input training dataset.</p>
     *         <p>
     *         Type: AutoMLDataSplitConfig
     */

    public AutoMLDataSplitConfig getDataSplitConfig() {
        return this.dataSplitConfig;
    }

    /**
     * <p>
     * The configuration for splitting the input training dataset.
     * </p>
     * <p>
     * Type: AutoMLDataSplitConfig
     * </p>
     * 
     * @param dataSplitConfig
     *        The configuration for splitting the input training dataset.</p>
     *        <p>
     *        Type: AutoMLDataSplitConfig
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobConfig withDataSplitConfig(AutoMLDataSplitConfig dataSplitConfig) {
        setDataSplitConfig(dataSplitConfig);
        return this;
    }

    /**
     * <p>
     * The configuration for generating a candidate for an AutoML job (optional).
     * </p>
     * 
     * @param candidateGenerationConfig
     *        The configuration for generating a candidate for an AutoML job (optional).
     */

    public void setCandidateGenerationConfig(AutoMLCandidateGenerationConfig candidateGenerationConfig) {
        this.candidateGenerationConfig = candidateGenerationConfig;
    }

    /**
     * <p>
     * The configuration for generating a candidate for an AutoML job (optional).
     * </p>
     * 
     * @return The configuration for generating a candidate for an AutoML job (optional).
     */

    public AutoMLCandidateGenerationConfig getCandidateGenerationConfig() {
        return this.candidateGenerationConfig;
    }

    /**
     * <p>
     * The configuration for generating a candidate for an AutoML job (optional).
     * </p>
     * 
     * @param candidateGenerationConfig
     *        The configuration for generating a candidate for an AutoML job (optional).
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public AutoMLJobConfig withCandidateGenerationConfig(AutoMLCandidateGenerationConfig candidateGenerationConfig) {
        setCandidateGenerationConfig(candidateGenerationConfig);
        return this;
    }

    /**
     * <p>
     * The method that Autopilot uses to train the data. You can either specify the mode manually or let Autopilot
     * choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code> mode, Autopilot
     * chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and <code>HYPERPARAMETER_TUNING</code> for
     * larger ones.
     * </p>
     * <p>
     * The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and regression tasks
     * directly from your dataset. This machine learning mode combines several base models to produce an optimal
     * predictive model. It then uses a stacking ensemble method to combine predictions from contributing members. A
     * multi-stack ensemble model can provide better performance over a single model by combining the predictive
     * capabilities of multiple models. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     * </p>
     * <p>
     * The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version of a
     * model. HPO will automatically select an algorithm for the type of problem you want to solve. Then HPO finds the
     * best hyperparameters according to your objective metric. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code> mode.
     * </p>
     * 
     * @param mode
     *        The method that Autopilot uses to train the data. You can either specify the mode manually or let
     *        Autopilot choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code>
     *        mode, Autopilot chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and
     *        <code>HYPERPARAMETER_TUNING</code> for larger ones.</p>
     *        <p>
     *        The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and
     *        regression tasks directly from your dataset. This machine learning mode combines several base models to
     *        produce an optimal predictive model. It then uses a stacking ensemble method to combine predictions from
     *        contributing members. A multi-stack ensemble model can provide better performance over a single model by
     *        combining the predictive capabilities of multiple models. See <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     *        >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     *        </p>
     *        <p>
     *        The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version
     *        of a model. HPO will automatically select an algorithm for the type of problem you want to solve. Then HPO
     *        finds the best hyperparameters according to your objective metric. See <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     *        >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code>
     *        mode.
     * @see AutoMLMode
     */

    public void setMode(String mode) {
        this.mode = mode;
    }

    /**
     * <p>
     * The method that Autopilot uses to train the data. You can either specify the mode manually or let Autopilot
     * choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code> mode, Autopilot
     * chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and <code>HYPERPARAMETER_TUNING</code> for
     * larger ones.
     * </p>
     * <p>
     * The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and regression tasks
     * directly from your dataset. This machine learning mode combines several base models to produce an optimal
     * predictive model. It then uses a stacking ensemble method to combine predictions from contributing members. A
     * multi-stack ensemble model can provide better performance over a single model by combining the predictive
     * capabilities of multiple models. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     * </p>
     * <p>
     * The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version of a
     * model. HPO will automatically select an algorithm for the type of problem you want to solve. Then HPO finds the
     * best hyperparameters according to your objective metric. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code> mode.
     * </p>
     * 
     * @return The method that Autopilot uses to train the data. You can either specify the mode manually or let
     *         Autopilot choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code>
     *         mode, Autopilot chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and
     *         <code>HYPERPARAMETER_TUNING</code> for larger ones.</p>
     *         <p>
     *         The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and
     *         regression tasks directly from your dataset. This machine learning mode combines several base models to
     *         produce an optimal predictive model. It then uses a stacking ensemble method to combine predictions from
     *         contributing members. A multi-stack ensemble model can provide better performance over a single model by
     *         combining the predictive capabilities of multiple models. See <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     *         >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     *         </p>
     *         <p>
     *         The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version
     *         of a model. HPO will automatically select an algorithm for the type of problem you want to solve. Then
     *         HPO finds the best hyperparameters according to your objective metric. See <a href=
     *         "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     *         >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code>
     *         mode.
     * @see AutoMLMode
     */

    public String getMode() {
        return this.mode;
    }

    /**
     * <p>
     * The method that Autopilot uses to train the data. You can either specify the mode manually or let Autopilot
     * choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code> mode, Autopilot
     * chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and <code>HYPERPARAMETER_TUNING</code> for
     * larger ones.
     * </p>
     * <p>
     * The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and regression tasks
     * directly from your dataset. This machine learning mode combines several base models to produce an optimal
     * predictive model. It then uses a stacking ensemble method to combine predictions from contributing members. A
     * multi-stack ensemble model can provide better performance over a single model by combining the predictive
     * capabilities of multiple models. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     * </p>
     * <p>
     * The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version of a
     * model. HPO will automatically select an algorithm for the type of problem you want to solve. Then HPO finds the
     * best hyperparameters according to your objective metric. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code> mode.
     * </p>
     * 
     * @param mode
     *        The method that Autopilot uses to train the data. You can either specify the mode manually or let
     *        Autopilot choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code>
     *        mode, Autopilot chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and
     *        <code>HYPERPARAMETER_TUNING</code> for larger ones.</p>
     *        <p>
     *        The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and
     *        regression tasks directly from your dataset. This machine learning mode combines several base models to
     *        produce an optimal predictive model. It then uses a stacking ensemble method to combine predictions from
     *        contributing members. A multi-stack ensemble model can provide better performance over a single model by
     *        combining the predictive capabilities of multiple models. See <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     *        >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     *        </p>
     *        <p>
     *        The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version
     *        of a model. HPO will automatically select an algorithm for the type of problem you want to solve. Then HPO
     *        finds the best hyperparameters according to your objective metric. See <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     *        >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code>
     *        mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLMode
     */

    public AutoMLJobConfig withMode(String mode) {
        setMode(mode);
        return this;
    }

    /**
     * <p>
     * The method that Autopilot uses to train the data. You can either specify the mode manually or let Autopilot
     * choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code> mode, Autopilot
     * chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and <code>HYPERPARAMETER_TUNING</code> for
     * larger ones.
     * </p>
     * <p>
     * The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and regression tasks
     * directly from your dataset. This machine learning mode combines several base models to produce an optimal
     * predictive model. It then uses a stacking ensemble method to combine predictions from contributing members. A
     * multi-stack ensemble model can provide better performance over a single model by combining the predictive
     * capabilities of multiple models. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     * </p>
     * <p>
     * The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version of a
     * model. HPO will automatically select an algorithm for the type of problem you want to solve. Then HPO finds the
     * best hyperparameters according to your objective metric. See <a href=
     * "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     * >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code> mode.
     * </p>
     * 
     * @param mode
     *        The method that Autopilot uses to train the data. You can either specify the mode manually or let
     *        Autopilot choose for you based on the dataset size by selecting <code>AUTO</code>. In <code>AUTO</code>
     *        mode, Autopilot chooses <code>ENSEMBLING</code> for datasets smaller than 100 MB, and
     *        <code>HYPERPARAMETER_TUNING</code> for larger ones.</p>
     *        <p>
     *        The <code>ENSEMBLING</code> mode uses a multi-stack ensemble model to predict classification and
     *        regression tasks directly from your dataset. This machine learning mode combines several base models to
     *        produce an optimal predictive model. It then uses a stacking ensemble method to combine predictions from
     *        contributing members. A multi-stack ensemble model can provide better performance over a single model by
     *        combining the predictive capabilities of multiple models. See <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     *        >Autopilot algorithm support</a> for a list of algorithms supported by <code>ENSEMBLING</code> mode.
     *        </p>
     *        <p>
     *        The <code>HYPERPARAMETER_TUNING</code> (HPO) mode uses the best hyperparameters to train the best version
     *        of a model. HPO will automatically select an algorithm for the type of problem you want to solve. Then HPO
     *        finds the best hyperparameters according to your objective metric. See <a href=
     *        "https://docs.aws.amazon.com/sagemaker/latest/dg/autopilot-model-support-validation.html#autopilot-algorithm-suppprt"
     *        >Autopilot algorithm support</a> for a list of algorithms supported by <code>HYPERPARAMETER_TUNING</code>
     *        mode.
     * @return Returns a reference to this object so that method calls can be chained together.
     * @see AutoMLMode
     */

    public AutoMLJobConfig withMode(AutoMLMode mode) {
        this.mode = mode.toString();
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
        if (getCompletionCriteria() != null)
            sb.append("CompletionCriteria: ").append(getCompletionCriteria()).append(",");
        if (getSecurityConfig() != null)
            sb.append("SecurityConfig: ").append(getSecurityConfig()).append(",");
        if (getDataSplitConfig() != null)
            sb.append("DataSplitConfig: ").append(getDataSplitConfig()).append(",");
        if (getCandidateGenerationConfig() != null)
            sb.append("CandidateGenerationConfig: ").append(getCandidateGenerationConfig()).append(",");
        if (getMode() != null)
            sb.append("Mode: ").append(getMode());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof AutoMLJobConfig == false)
            return false;
        AutoMLJobConfig other = (AutoMLJobConfig) obj;
        if (other.getCompletionCriteria() == null ^ this.getCompletionCriteria() == null)
            return false;
        if (other.getCompletionCriteria() != null && other.getCompletionCriteria().equals(this.getCompletionCriteria()) == false)
            return false;
        if (other.getSecurityConfig() == null ^ this.getSecurityConfig() == null)
            return false;
        if (other.getSecurityConfig() != null && other.getSecurityConfig().equals(this.getSecurityConfig()) == false)
            return false;
        if (other.getDataSplitConfig() == null ^ this.getDataSplitConfig() == null)
            return false;
        if (other.getDataSplitConfig() != null && other.getDataSplitConfig().equals(this.getDataSplitConfig()) == false)
            return false;
        if (other.getCandidateGenerationConfig() == null ^ this.getCandidateGenerationConfig() == null)
            return false;
        if (other.getCandidateGenerationConfig() != null && other.getCandidateGenerationConfig().equals(this.getCandidateGenerationConfig()) == false)
            return false;
        if (other.getMode() == null ^ this.getMode() == null)
            return false;
        if (other.getMode() != null && other.getMode().equals(this.getMode()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getCompletionCriteria() == null) ? 0 : getCompletionCriteria().hashCode());
        hashCode = prime * hashCode + ((getSecurityConfig() == null) ? 0 : getSecurityConfig().hashCode());
        hashCode = prime * hashCode + ((getDataSplitConfig() == null) ? 0 : getDataSplitConfig().hashCode());
        hashCode = prime * hashCode + ((getCandidateGenerationConfig() == null) ? 0 : getCandidateGenerationConfig().hashCode());
        hashCode = prime * hashCode + ((getMode() == null) ? 0 : getMode().hashCode());
        return hashCode;
    }

    @Override
    public AutoMLJobConfig clone() {
        try {
            return (AutoMLJobConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

    @com.amazonaws.annotation.SdkInternalApi
    @Override
    public void marshall(ProtocolMarshaller protocolMarshaller) {
        com.amazonaws.services.sagemaker.model.transform.AutoMLJobConfigMarshaller.getInstance().marshall(this, protocolMarshaller);
    }
}
